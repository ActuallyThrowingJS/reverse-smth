from pathlib import Path
import json,re,shutil
root=Path(__file__).resolve().parent.parent;w=root/'build/round5';target=w/'assembled';target.mkdir(exist_ok=True)
shutil.copytree(w/'vineflower',target,dirs_exist_ok=True)
for p in (w/'focused-vf').rglob('*.java'):
 relative=p.relative_to(w/'focused-vf');destination=target/relative;destination.parent.mkdir(parents=True,exist_ok=True);shutil.copy2(p,destination)
roles={'ZkmKeyFactory','ZkmMasterKeyFactory','ZkmFallbackKeyFactory'};plan=json.load(open(root/'mappings/semantic-mappings.json'));runtime={v for v in plan['classes'].values() if v.rsplit('/',1)[-1] in roles}
for owner in runtime:shutil.copy2(root/'build/recovery/sources'/(owner+'.java'),target/(owner+'.java'))
choices={}
for tool,folder,report in [('CFR','focused-cfr','approved-focused.json'),('Procyon','procyon','approved-procyon.json')]:
 for name in json.load(open(w/report))['approved']:
  shutil.copy2(w/folder/name,target/name);choices[name]={'tool':tool,'compilerAndApiVerified':True}
focused=set(json.load(open(w/'focused-owners.json')))
def owner(line):
 m=re.search(r" in class (\S+) couldn't be decompiled",line);return m[1] if m else None
def in_scope(name,scope):return name is not None and any(name==s or name.startswith(s+'$') for s in scope)
lines=(w/'decompile.log').read_text(errors='replace').splitlines();messages=[line for line in lines if "couldn't be decompiled" in line or "couldn't be written" in line]
messages=[line for line in messages if owner(line) not in runtime and not in_scope(owner(line),focused)]
messages.extend(line for line in (w/'focused-vf.log').read_text(errors='replace').splitlines() if "couldn't be decompiled" in line)
messages.extend(line for line in json.load(open(root/'reports/baseline-decompiler-failures.json'))['failures'] if owner(line) in runtime)
accepted={name[:-5] for name in choices};messages=[line for line in messages if not in_scope(owner(line),accepted)]
old=json.load(open(root/'evidence/extended/baseline-decompiler-failures.json'))
def keys(messages):
 result=set()
 for line in messages:
  m=re.search(r"Method (\S+) (\S+) in class (\S+) couldn't be decompiled",line)
  if m:result.add((m[3],m[1],m[2]))
 return result
before={x for x in keys(old['failures']) if '$recovered$' not in x[1]};after={x for x in keys(messages) if '$recovered$' not in x[1]};added=after-before
assert not added,sorted(added)[:10]
sources=list((target/'me/octo/client').rglob('*.java'));previous=root/'reference/client/src/main/java/me/octo/client';oldpaths={p.relative_to(previous) for p in previous.rglob('*.java')};newpaths={p.relative_to(target/'me/octo/client') for p in sources};assert not oldpaths-newpaths,oldpaths-newpaths
(w/'source-choices.json').write_text(json.dumps(choices,indent=2)+'\n');(w/'assembled-failures.json').write_text(json.dumps({'tool':'Vineflower 1.11.2 with compiler/API-checked CFR 0.152 and Procyon 0.6.0 alternatives','sourceFiles':len(sources),'methodFailures':sum("couldn't be decompiled" in m for m in messages),'classWriteFailures':sum("couldn't be written" in m for m in messages),'failures':messages},indent=2)+'\n')
summary={'newGenericDecompilerFailures':len(added),'additionalOriginalMethodFailuresRemoved':len(before-after),'sourceFiles':len(sources),'compilerAndApiCheckedAlternativeClasses':len(choices),'newKeyVariantRecords':len(json.load(open(w/'specializations.json'))),'newStringRestorations':len(json.load(open(w/'strings.json'))),'newReferenceDecodings':len(json.load(open(w/'references.json'))),'newNativeBodies':len(json.load(open(root/'evidence/native-round5/recipes.json'))),'totalRegisteredNativeBodiesRecovered':9+len(json.load(open(root/'evidence/native-round5/recipes.json'))),'registeredNativeBodiesRemaining':518-9-len(json.load(open(root/'evidence/native-round5/recipes.json'))),'remainingGenericMethodFailures':len(after),'classWriteFailures':sum("couldn't be written" in m for m in messages),'fullModBuildSuccessful':False,'mainNativeInitializerRecovered':False}
(w/'summary.json').write_text(json.dumps(summary,indent=2)+'\n');print(json.dumps(summary,indent=2))
