"""Run the recovery Gradle wrapper using inherited proxy settings and CA trust."""
from pathlib import Path
import os
import subprocess
import sys
from urllib.parse import urlsplit

root = Path(__file__).resolve().parent.parent
environment = os.environ.copy()
if environment.get('JAVA25_HOME'):
    environment['JAVA_HOME'] = environment['JAVA25_HOME']
environment.setdefault('GRADLE_USER_HOME', str(root / '.cache/gradle'))
options = []
for protocol in ('http', 'https'):
    address = environment.get(protocol.upper() + '_PROXY') or environment.get(protocol + '_proxy')
    if address:
        proxy = urlsplit(address)
        if proxy.hostname:
            options += [f'-D{protocol}.proxyHost={proxy.hostname}', f'-D{protocol}.proxyPort={proxy.port or 80}']
trust = Path('/etc/ssl/certs/java/cacerts')
if trust.is_file():
    options.append(f'-Djavax.net.ssl.trustStore={trust}')
if options:
    environment['JAVA_TOOL_OPTIONS'] = environment.get('JAVA_TOOL_OPTIONS', '') + ' ' + ' '.join(options)
wrapper = root / 'recovery-project' / ('gradlew.bat' if os.name == 'nt' else 'gradlew')
command = ([str(wrapper)] if os.name == 'nt' else ['bash', str(wrapper)])
command += ['--no-daemon', '--console=plain', '-p', str(root / 'recovery-project')]
command += sys.argv[1:] or ['writeRecoveryClasspath']
raise SystemExit(subprocess.run(command, env=environment).returncode)
