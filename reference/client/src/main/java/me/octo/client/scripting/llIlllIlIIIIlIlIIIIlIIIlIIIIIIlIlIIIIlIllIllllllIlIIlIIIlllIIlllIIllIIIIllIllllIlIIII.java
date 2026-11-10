package me.octo.client.scripting;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import net.minecraft.client.player.RemotePlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.animal.chicken.Chicken;
import net.minecraft.world.entity.animal.cow.Cow;
import net.minecraft.world.entity.animal.equine.Horse;
import net.minecraft.world.entity.animal.feline.Ocelot;
import net.minecraft.world.entity.animal.frog.Tadpole;
import net.minecraft.world.entity.animal.golem.IronGolem;
import net.minecraft.world.entity.animal.pig.Pig;
import net.minecraft.world.entity.animal.rabbit.Rabbit;
import net.minecraft.world.entity.animal.sheep.Sheep;
import net.minecraft.world.entity.animal.sniffer.Sniffer;
import net.minecraft.world.entity.animal.squid.Squid;
import net.minecraft.world.entity.animal.wolf.Wolf;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.monster.Endermite;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.monster.Guardian;
import net.minecraft.world.entity.monster.MagmaCube;
import net.minecraft.world.entity.monster.Silverfish;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.entity.monster.Witch;
import net.minecraft.world.entity.monster.skeleton.Bogged;
import net.minecraft.world.entity.monster.skeleton.Skeleton;
import net.minecraft.world.entity.monster.skeleton.WitherSkeleton;
import net.minecraft.world.entity.monster.spider.Spider;
import net.minecraft.world.entity.monster.zombie.Zombie;
import net.minecraft.world.entity.monster.zombie.ZombifiedPiglin;
import org.graalvm.polyglot.Value;
import org.jetbrains.annotations.NotNull;

public final class llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII
   extends me.octo.client.modules.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII {
   @NotNull
   public static llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   @NotNull
   private static String lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   @NotNull
   private static List<String> llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   @NotNull
   private static Map<String, Class<? extends Entity>> lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   private static long IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = 101338798469413L;
   private static String[] lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   private static String[] llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   private static Map lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = new HashMap(13);

   public llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII(
      @NotNull me.octo.client.modules.IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll configArg
   ) {
      long var2 = IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll ^ 14876230900775L;
      Intrinsics.checkNotNullParameter(configArg, "config");
      super(configArg);
   }

   @Override
   public int llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(long var1) {
      long var3 = var1 ^ 71671707165589L;
      long var5 = var1 ^ 56539957924247L;
      String var7 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -1158613661641263738L, var1
      );

      boolean var10000;
      label45: {
         label44: {
            try {
               var10000 = this.getConfig().getPrioritySwords().isEmpty();
               if (var7 != null) {
                  break label45;
               }

               if (!var10000) {
                  break label44;
               }
            } catch (MatchException var12) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var12, -1229957749656564428L, var1
               );
            }

            var10000 = false;
            break label45;
         }

         var10000 = true;
      }

      if (var10000) {
         me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var8 = me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(this.getConfig().getPrioritySwords(), var5);

         label51: {
            try {
               if (var7 != null) {
                  return -1;
               }

               if (var8 != null) {
                  break label51;
               }
            } catch (MatchException var11) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var11, -1229957749656564428L, var1
               );
            }

            IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"y">(8002, 4120383486822903324L ^ var1),
                  var3,
                  IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.ERROR,
                  llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"y">(25792, 2201268736345347478L ^ var1)
                     + CollectionsKt.joinToString$default(
                        this.getConfig().getPrioritySwords(),
                        llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI<"y">(28760, 5640303086579974410L ^ var1),
                        null,
                        null,
                        0,
                        null,
                        null,
                        62,
                        null
                     )
               );
            return -1;
         }

         boolean var10 = false;
         return var8.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();
      } else {
         return 0;
      }
   }

   static {
      long var9 = IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll ^ 19342845866994L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[36];
      int var5 = 0;
      String var4 = "}\u008eàÃ¦öS\u0002©vô\u0081CÇé\u007fXè}JXÆÆ?ßý\u0004¤NæH¹¶'A\u00986\u009bäÞ,Å\u0091\u0015R/«!\"\u001f\u0012võÅTnoi~\u009ff@\u0001©w²²A+o\u0097°\bPu\u0086ÿ\u0084³óµÍ±b\u001cMë\u001e\u009aénÝ½¼7jº\u001c[FuME £\u0010['Ò\u0097)\u0098\u009b°\u0091@¢Y§ù3k\u0018Á\u0095\u0088%í\u0013êC9zf\u009b[¿©ìi¼¯@u(\u0089Ò\u0010õ\u0012Ë¯m'òp\u0007\u0085ûn\fXÊ\u0094\u0010}\u009cî÷\nçA\u009a¾S\u0095\u0011«r¹#\u0010\u0010£Ý\u0095\u009c\tPÍ¶\u0089Kù©\u0097ËS\u0010»ËÊ \u0010\u0082\u001b.æ\u009a\r$¥\"Ï5\u0010\u0085\u009bZu·±Døù¹\nIüÕ\u007f\u0004 \u008eôÌ\u001b\r#¦êæ?º¤+b\u0082\u008dD\u0004\u0002Ip\u0018\u0017a*\u001d\u008cÒÊWÚ\u0081\u0010\u008aeËVâò\u000fw\u007fevyï\u000fÊÊ H¤ð)Ú\u0005óË\u008dåé6Ø$·\u0019ð¤Þ)6\u009c\u0086Ðeq\\1\r5÷\u008e\u0010J\u0013##bñ¼\u00ad[\u007fR& (Ò¨\u0010PE\u001fwÜ\u0010Ë\u0098h\u0090ä²\u008f\n[Ð\u0010÷Ï#?\u00108?baRf|!Ô\u001fX Ð\u001c\u0000\u0098g\u0098\u0081!\u0013âHÈr\u009d9ðx>;\u0093¦\"Í\u009c\u0081PÙ\u0099Ç\u0092ó¹\u0010AµË\u0088ÞØ°qs\u0013¸j\b¯%;\u0010×2ûA\u0082Ì$HG¦\u008aÿn,Fs\u0010\u0090J}ÁO\u0007TmiÅ;÷¬\u0080}÷\u0010Ë\u0015\u0004M÷ûNÂ\bÆø\u0011N\u0087\u0001$\u0010Ç;PÈE?\u008d|Á\u0005\u0011Mé7\u0002\u0010\u0010'\u007fìLµ\u001d]B\u0090\u0003Àäïèâ\u0019 \u0098\u0011ºÈÒ\u009b\u0005vÉwmÚçZQ¬kuF©x=\u0098\\²H\"¤\u0084ÐV\u0085 SèÐ3)FËC\u008e\u008bæ\u0015\u0011\u009a~/\u0006[RÎ+§\u0005æÆ7ö¿;èÿW\u0018X.x\u0094ÑR\ta\u00ad'\u009f\u0002yñÞ\bZf\u001c¨¬_\u00adÉ Q\u0084a~¿ðjF\u008d\n\u008aÉÊÞ\u001b\u0000\u0003p\u0089ù6E³a¦Õ¹\u009cÁ\u001cJ\u0081\u0010r6õe\u0014IOr(IÊ¢,\u0094bß\u0018A-M\u0003\u0086\u0012ì@XU\u00ad\u0094>\tW\u0015Ü5\u0085\u0080GÌR¤ ò¿î|6ø\u0098\t:\u0083\u0012órîÉË\u0086°FÄy\u0010\u008c|\u0018TR\u0005\u0094¯\u000e\u009f\u0010\u008aX©n`Ó\u0013yj\t×¿û'|\u0010\u00107ì'ÂA\u0081¦P\u009fÖómÿÈ$¯ -\u0003¥5(Í§pbÐÕ\u0018\fÒP\u001d÷\u000fJ6\u0098YÀ\u0002 û\u0085áÑ)\u0095\u0092\u00100w\u001fná\u008dH\u00adkÙ&¬\u0087c%\u008c\u0018\u00197^\u00164³ë\u00adÈê¯\"µèÙÌwÈ\tµ\u008c=N\u001b";
      int var6 = "}\u008eàÃ¦öS\u0002©vô\u0081CÇé\u007fXè}JXÆÆ?ßý\u0004¤NæH¹¶'A\u00986\u009bäÞ,Å\u0091\u0015R/«!\"\u001f\u0012võÅTnoi~\u009ff@\u0001©w²²A+o\u0097°\bPu\u0086ÿ\u0084³óµÍ±b\u001cMë\u001e\u009aénÝ½¼7jº\u001c[FuME £\u0010['Ò\u0097)\u0098\u009b°\u0091@¢Y§ù3k\u0018Á\u0095\u0088%í\u0013êC9zf\u009b[¿©ìi¼¯@u(\u0089Ò\u0010õ\u0012Ë¯m'òp\u0007\u0085ûn\fXÊ\u0094\u0010}\u009cî÷\nçA\u009a¾S\u0095\u0011«r¹#\u0010\u0010£Ý\u0095\u009c\tPÍ¶\u0089Kù©\u0097ËS\u0010»ËÊ \u0010\u0082\u001b.æ\u009a\r$¥\"Ï5\u0010\u0085\u009bZu·±Døù¹\nIüÕ\u007f\u0004 \u008eôÌ\u001b\r#¦êæ?º¤+b\u0082\u008dD\u0004\u0002Ip\u0018\u0017a*\u001d\u008cÒÊWÚ\u0081\u0010\u008aeËVâò\u000fw\u007fevyï\u000fÊÊ H¤ð)Ú\u0005óË\u008dåé6Ø$·\u0019ð¤Þ)6\u009c\u0086Ðeq\\1\r5÷\u008e\u0010J\u0013##bñ¼\u00ad[\u007fR& (Ò¨\u0010PE\u001fwÜ\u0010Ë\u0098h\u0090ä²\u008f\n[Ð\u0010÷Ï#?\u00108?baRf|!Ô\u001fX Ð\u001c\u0000\u0098g\u0098\u0081!\u0013âHÈr\u009d9ðx>;\u0093¦\"Í\u009c\u0081PÙ\u0099Ç\u0092ó¹\u0010AµË\u0088ÞØ°qs\u0013¸j\b¯%;\u0010×2ûA\u0082Ì$HG¦\u008aÿn,Fs\u0010\u0090J}ÁO\u0007TmiÅ;÷¬\u0080}÷\u0010Ë\u0015\u0004M÷ûNÂ\bÆø\u0011N\u0087\u0001$\u0010Ç;PÈE?\u008d|Á\u0005\u0011Mé7\u0002\u0010\u0010'\u007fìLµ\u001d]B\u0090\u0003Àäïèâ\u0019 \u0098\u0011ºÈÒ\u009b\u0005vÉwmÚçZQ¬kuF©x=\u0098\\²H\"¤\u0084ÐV\u0085 SèÐ3)FËC\u008e\u008bæ\u0015\u0011\u009a~/\u0006[RÎ+§\u0005æÆ7ö¿;èÿW\u0018X.x\u0094ÑR\ta\u00ad'\u009f\u0002yñÞ\bZf\u001c¨¬_\u00adÉ Q\u0084a~¿ðjF\u008d\n\u008aÉÊÞ\u001b\u0000\u0003p\u0089ù6E³a¦Õ¹\u009cÁ\u001cJ\u0081\u0010r6õe\u0014IOr(IÊ¢,\u0094bß\u0018A-M\u0003\u0086\u0012ì@XU\u00ad\u0094>\tW\u0015Ü5\u0085\u0080GÌR¤ ò¿î|6ø\u0098\t:\u0083\u0012órîÉË\u0086°FÄy\u0010\u008c|\u0018TR\u0005\u0094¯\u000e\u009f\u0010\u008aX©n`Ó\u0013yj\t×¿û'|\u0010\u00107ì'ÂA\u0081¦P\u009fÖómÿÈ$¯ -\u0003¥5(Í§pbÐÕ\u0018\fÒP\u001d÷\u000fJ6\u0098YÀ\u0002 û\u0085áÑ)\u0095\u0092\u00100w\u001fná\u008dH\u00adkÙ&¬\u0087c%\u008c\u0018\u00197^\u00164³ë\u00adÈê¯\"µèÙÌwÈ\tµ\u008c=N\u001b"
         .length();
      char var3 = 16;
      int var13 = -1;

      label27:
      while (true) {
         String var14 = var4.substring(++var13, var13 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var14.getBytes("ISO-8859-1"));
            String var20 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var20;
                  if ((var13 += var3) >= var6) {
                     lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = var7;
                     llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = new String[36];
                     lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = "combatBot";
                     IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = new llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                        null
                     );
                     llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = CollectionsKt.listOf("");
                     Pair[] var11 = new Pair[]{
                        TuplesKt.to("remoteplayer", RemotePlayer.class),
                        TuplesKt.to("player", RemotePlayer.class),
                        TuplesKt.to("armorstand", ArmorStand.class),
                        TuplesKt.to("zombie", Zombie.class),
                        TuplesKt.to("zombifiedpiglin", ZombifiedPiglin.class),
                        TuplesKt.to("skeleton", Skeleton.class),
                        TuplesKt.to("witherskeleton", WitherSkeleton.class),
                        TuplesKt.to("bogged", Bogged.class),
                        TuplesKt.to("spider", Spider.class),
                        TuplesKt.to("enderman", EnderMan.class),
                        TuplesKt.to("endermite", Endermite.class),
                        TuplesKt.to("blaze", Blaze.class),
                        TuplesKt.to("ghast", Ghast.class),
                        TuplesKt.to("magmacube", MagmaCube.class),
                        TuplesKt.to("slime", Slime.class),
                        TuplesKt.to("silverfish", Silverfish.class),
                        TuplesKt.to("witch", Witch.class),
                        TuplesKt.to("guardian", Guardian.class),
                        TuplesKt.to("creeper", Creeper.class),
                        TuplesKt.to("irongolem", IronGolem.class),
                        TuplesKt.to("wolf", Wolf.class),
                        TuplesKt.to("ocelot", Ocelot.class),
                        TuplesKt.to("squid", Squid.class),
                        TuplesKt.to("sniffer", Sniffer.class),
                        TuplesKt.to("tadpole", Tadpole.class),
                        TuplesKt.to("cow", Cow.class),
                        TuplesKt.to("pig", Pig.class),
                        TuplesKt.to("sheep", Sheep.class),
                        TuplesKt.to("chicken", Chicken.class),
                        TuplesKt.to("rabbit", Rabbit.class),
                        TuplesKt.to("horse", Horse.class)
                     };
                     lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = MapsKt.mapOf(var11);
                     return;
                  }

                  var3 = var4.charAt(var13);
                  break;
               default:
                  var7[var5++] = var20;
                  if ((var13 += var3) < var6) {
                     var3 = var4.charAt(var13);
                     continue label27;
                  }

                  var4 = "\u0000ÓYM\u0094N`\u007foio\u0014\nñ\u0010\u0087 B\u0081aÍ\u008c\u0018\u0016{Ç¨Î±ó\u0091¢ÒXÉ9éë@:·\u00ad>Cz+z\u0014¬";
                  var6 = "\u0000ÓYM\u0094N`\u007foio\u0014\nñ\u0010\u0087 B\u0081aÍ\u008c\u0018\u0016{Ç¨Î±ó\u0091¢ÒXÉ9éë@:·\u00ad>Cz+z\u0014¬".length();
                  var3 = 16;
                  var13 = -1;
            }

            var14 = var4.substring(++var13, var13 + var3);
            var10001 = 0;
         }
      }
   }

   private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
      return var0;
   }

   private static String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(byte[] var0) {
      int var1 = 0;
      int var2;
      char[] var3 = new char[var2 = var0.length];

      for (int var4 = 0; var4 < var2; var4++) {
         int var5;
         if ((var5 = 255 & var0[var4]) < 192) {
            var3[var1++] = (char)var5;
         } else if (var5 < 224) {
            char var6 = (char)((char)(var5 & 31) << 6);
            byte var8 = var0[++var4];
            var6 = (char)(var6 | (char)(var8 & 63));
            var3[var1++] = var6;
         } else if (var4 < var2 - 2) {
            char var12 = (char)((char)(var5 & 15) << '\f');
            byte var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63) << 6);
            var9 = var0[++var4];
            var12 = (char)(var12 | (char)(var9 & 63));
            var3[var1++] = var12;
         }
      }

      return new String(var3, 0, var1);
   }

   private static String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 7248;
      if (llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/scripting/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI[var5].getBytes("ISO-8859-1");
         llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl[var5] = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl[var5];
   }

   private static Object llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI".asCollector(Object[].class, var2.parameterCount()),
                  0,
                  var0,
                  var3,
                  var1
               ),
               var2
            )
         );
         return var3;
      } catch (Exception var5) {
         throw new RuntimeException(
            "me/octo/client/scripting/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 135164608366955L;
      private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         @NotNull Value param1, long param2
      ) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      private final List IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Value param1, long param2, String param4) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      private final List llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long param1, Value param3, String param4) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      private final List llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         Value param1, short param2, int param3, short param4
      ) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      private final String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         Value param1, long param2, String param4, long param5
      ) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      private final Class IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(String var1, long var2) {
         var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var2;
         long var4 = var2 ^ 69345855324879L;
         Map var10000 = llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
         String var10001 = var1.toLowerCase(Locale.ROOT);
         Intrinsics.checkNotNullExpressionValue(
            var10001, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(1610, 5913426232141796572L ^ var2)
         );
         Class var9 = (Class)var10000.get(var10001);
         if (var9 == null) {
            llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var6 = this;
            boolean var7 = false;
            IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(23167, 8151019273762244840L ^ var2),
                  var4,
                  IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.ERROR,
                  IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(3516, 973206560904929071L ^ var2)
                     + var1
                     + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(194, 9184231430416224836L ^ var2)
                     + CollectionsKt.joinToString$default(
                        CollectionsKt.sorted(
                           llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII
                              .keySet()
                        ),
                        IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(26185, 5853511467910870213L ^ var2),
                        null,
                        null,
                        0,
                        null,
                        null,
                        62,
                        null
                     )
               );
            var9 = null;
         }

         return var9;
      }

      private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(String var1, long var2) {
         var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var2;
         long var4 = var2 ^ 6013455847846L;
         IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(11315, 7682322590196428226L ^ var2),
               var4,
               IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.ERROR,
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(23505, 7989039053129783844L ^ var2)
                  + var1
                  + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"x">(11517, 2644867676097670411L ^ var2)
            );
      }

      static {
         long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 29002372962757L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[31];
         int var7 = 0;
         String var6 = "/é-\u0090sPÿÇF\tàû\u0016\u00042R*Û\u0007\u001e?·¥N \u0089ïÓ\"I\u0016\u009eiV\fÕ·\u0090kÞ\u0003mï\u0010~A\u0087Ù\u00826c¹¨éjï\u0007\u0010\u0013¹\u0086\u0094Òc×\u0004ýFõ\u009có~Kë8\u0089H\u0000*\u0003\u0082fÂ\t_\u0016UÈêÿ\u001eTæê«úRP\u0001y\u0090\u0092k\u00ad\u0080Wö¸\u0010\u009b¨\u0080k±*ÅpÇÇÔ\u0092æ\u0085ö×\u0094=?\u0001`O\u0010o¿ËÜ2^T\u007fÍ\u001bEY\fZ`a §\"t\u0083÷¬\u001cN~îìá\u0085¼\u001eÒ\u0007b:ÿ\u009f\u0091¯)¹\u0015)S¹\u001f\u0017i\u0010oê\u001d9\u0013évî\u0011O\u001d\u0083XEì\f(î\u001aáD:v\u0011¸îD.Ò3\\\u0014¦üxA\u000e\u008de?\u0090¬x\u000e\u0088¤@Á÷\u0084º\u0017ÆðÎ\u0094Õ\u0010IÏ\u001c\u009e\u008b\u0082µqÇiK\u0086a5Tþ ©+\u0095T\u008eT×ÍS¸+©\u009c\u0019\u0093ÙqFÕûs[\u0091\u001fFÍLå#é'¢(7µ%^®t&ß\u0016\u0098Í\u000b)\u00adey2c\u0018Z[\u009c#\u009bò,&GáêÄ*mï\u009c{\u0016ÜÛ\u0007\u0010Ïj\u008fT|R´íc\u001dL\u000f\u0089\u007fwâ(\u0089Ôq\u008a£\u001el\u0012á¬\u0018Ò£·_#Vù,LïÖÕ¸kdé\u0093\u008f\u008d\u000eÜ8\u0012|\u0019¦<[0 I\u0092)v@\t/p\u009aeÆJ'_n\u0094öCÞx\tú| !Y/ÎOrÄp(\u0096\u0007Õg=/ý[O#\u001c7\u0091|U1\u000b·¬\u0088>#»Ë7Z£\\HÙì\u0084)-âß¼\u0001\\@ Õ«ºêWYÙi`Û\u0001;\u00ad\u0006±\f¾\u008a\u0011¹\rp\u008c¥\u009f·8gt¨\u0085M(»YW6´'\u0099÷ËU®Ç¼\u0089uææÚãØÔk\u009agÐ\"d[#ÎEíM\u001b\u0012=²\r\u0012\t\u0010@ÿçp\u008cy¹i\u0017ãî\u009e+q\u009av\u00182Á+ª\u00971½k¡é\u009aþ\u009b\u0083å\u008f¾¬ ¿´í\u0089Ô Âw7qT¨?ªm4\u0012\u0015\u0005óµ\u0082ÿ\u00894,Ô¹\u0015p*vÒ\u0084\u0017\u001bâM\u0010æ´×)Ðñò \u0082$\tÍ\u000eØ4Æ(Îp2\u0003Øø¥\fÜíõ=ñÂ¨Àg\téÿ\u001a hcî8l¼\u001fO£¶D\u00816\u001avm]ì\u0018§ZâØ3Dê\u0015T¼\f\u00960¶®\u0084\u0087÷OÅ¥\u0080pâ GßÉ-\u0017\u001cø\n©Ð u´}8¸\u0083\u0007Ý:Z¸It_\u0097¼c\u0001µÛM\u0010ëÊ¸Z\u0098Aeåá\u0006^\u000f=Ìu0@BsU\u0088ð\f{iEN\u0016Qj·ê\u0096Óä!\u0083Ò\u0004Ä\u009d\u0010\u0097\"0í«\u009f\u009fË\f.¦ûQK\u0017ì7\u009e\u007f§¾Æ¡l©\u0019øPo=ú³6\u000f´Wf\u0092G\u0010F_\u0083mO!>¹uJªÑôÃ\rØ Þk6?w=\u0092ÐË\u0019q\u0089\u0016\u0089c0\u00194sÕÔWa=ÓF\u0018Ä\u0001«ªuø·euá\u0098\u0012\u0000Ô¿\u0010\u009f%\u008fo.xßmû²Ñ\u0081?(Á ]\r#âA\u0082\u008f\u0096ý\u008aD\rù\u008bÏªÖ8=ñ/ÊÓº\u008c52§Ihg\b\u0010O\r\u001aíá\u000bDÃJÓø\b@¿ö9Z6,ïCJ1HöÅõ©*ën²?\u0086KPå/\u007f\tÉAÈ2¶u½\u009cDÏ\u00000\u009b¡\u0082ÞYo-ÐÎýlñç\u009aRÑ0C!éÉP\u0088T\u0012\u0016'9\tm¼\u0089P\u0088=ny\u000e*\u001e¦¼%\u0091?§=¹\u0096\u008fÅ£ã\u008fD\u0081,.T¼\\\u0091\u0010¹{";
         int var8 = "/é-\u0090sPÿÇF\tàû\u0016\u00042R*Û\u0007\u001e?·¥N \u0089ïÓ\"I\u0016\u009eiV\fÕ·\u0090kÞ\u0003mï\u0010~A\u0087Ù\u00826c¹¨éjï\u0007\u0010\u0013¹\u0086\u0094Òc×\u0004ýFõ\u009có~Kë8\u0089H\u0000*\u0003\u0082fÂ\t_\u0016UÈêÿ\u001eTæê«úRP\u0001y\u0090\u0092k\u00ad\u0080Wö¸\u0010\u009b¨\u0080k±*ÅpÇÇÔ\u0092æ\u0085ö×\u0094=?\u0001`O\u0010o¿ËÜ2^T\u007fÍ\u001bEY\fZ`a §\"t\u0083÷¬\u001cN~îìá\u0085¼\u001eÒ\u0007b:ÿ\u009f\u0091¯)¹\u0015)S¹\u001f\u0017i\u0010oê\u001d9\u0013évî\u0011O\u001d\u0083XEì\f(î\u001aáD:v\u0011¸îD.Ò3\\\u0014¦üxA\u000e\u008de?\u0090¬x\u000e\u0088¤@Á÷\u0084º\u0017ÆðÎ\u0094Õ\u0010IÏ\u001c\u009e\u008b\u0082µqÇiK\u0086a5Tþ ©+\u0095T\u008eT×ÍS¸+©\u009c\u0019\u0093ÙqFÕûs[\u0091\u001fFÍLå#é'¢(7µ%^®t&ß\u0016\u0098Í\u000b)\u00adey2c\u0018Z[\u009c#\u009bò,&GáêÄ*mï\u009c{\u0016ÜÛ\u0007\u0010Ïj\u008fT|R´íc\u001dL\u000f\u0089\u007fwâ(\u0089Ôq\u008a£\u001el\u0012á¬\u0018Ò£·_#Vù,LïÖÕ¸kdé\u0093\u008f\u008d\u000eÜ8\u0012|\u0019¦<[0 I\u0092)v@\t/p\u009aeÆJ'_n\u0094öCÞx\tú| !Y/ÎOrÄp(\u0096\u0007Õg=/ý[O#\u001c7\u0091|U1\u000b·¬\u0088>#»Ë7Z£\\HÙì\u0084)-âß¼\u0001\\@ Õ«ºêWYÙi`Û\u0001;\u00ad\u0006±\f¾\u008a\u0011¹\rp\u008c¥\u009f·8gt¨\u0085M(»YW6´'\u0099÷ËU®Ç¼\u0089uææÚãØÔk\u009agÐ\"d[#ÎEíM\u001b\u0012=²\r\u0012\t\u0010@ÿçp\u008cy¹i\u0017ãî\u009e+q\u009av\u00182Á+ª\u00971½k¡é\u009aþ\u009b\u0083å\u008f¾¬ ¿´í\u0089Ô Âw7qT¨?ªm4\u0012\u0015\u0005óµ\u0082ÿ\u00894,Ô¹\u0015p*vÒ\u0084\u0017\u001bâM\u0010æ´×)Ðñò \u0082$\tÍ\u000eØ4Æ(Îp2\u0003Øø¥\fÜíõ=ñÂ¨Àg\téÿ\u001a hcî8l¼\u001fO£¶D\u00816\u001avm]ì\u0018§ZâØ3Dê\u0015T¼\f\u00960¶®\u0084\u0087÷OÅ¥\u0080pâ GßÉ-\u0017\u001cø\n©Ð u´}8¸\u0083\u0007Ý:Z¸It_\u0097¼c\u0001µÛM\u0010ëÊ¸Z\u0098Aeåá\u0006^\u000f=Ìu0@BsU\u0088ð\f{iEN\u0016Qj·ê\u0096Óä!\u0083Ò\u0004Ä\u009d\u0010\u0097\"0í«\u009f\u009fË\f.¦ûQK\u0017ì7\u009e\u007f§¾Æ¡l©\u0019øPo=ú³6\u000f´Wf\u0092G\u0010F_\u0083mO!>¹uJªÑôÃ\rØ Þk6?w=\u0092ÐË\u0019q\u0089\u0016\u0089c0\u00194sÕÔWa=ÓF\u0018Ä\u0001«ªuø·euá\u0098\u0012\u0000Ô¿\u0010\u009f%\u008fo.xßmû²Ñ\u0081?(Á ]\r#âA\u0082\u008f\u0096ý\u008aD\rù\u008bÏªÖ8=ñ/ÊÓº\u008c52§Ihg\b\u0010O\r\u001aíá\u000bDÃJÓø\b@¿ö9Z6,ïCJ1HöÅõ©*ën²?\u0086KPå/\u007f\tÉAÈ2¶u½\u009cDÏ\u00000\u009b¡\u0082ÞYo-ÐÎýlñç\u009aRÑ0C!éÉP\u0088T\u0012\u0016'9\tm¼\u0089P\u0088=ny\u000e*\u001e¦¼%\u0091?§=¹\u0096\u008fÅ£ã\u008fD\u0081,.T¼\\\u0091\u0010¹{"
            .length();
         char var5 = 24;
         int var12 = -1;

         label27:
         while (true) {
            String var13 = var6.substring(++var12, var12 + var5);
            byte var10001 = -1;

            while (true) {
               byte[] var10 = var2.doFinal(var13.getBytes("ISO-8859-1"));
               String var19 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
               switch (var10001) {
                  case 0:
                     var9[var7++] = var19;
                     if ((var12 += var5) >= var8) {
                        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var9;
                        IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new String[31];
                        return;
                     }

                     var5 = var6.charAt(var12);
                     break;
                  default:
                     var9[var7++] = var19;
                     if ((var12 += var5) < var8) {
                        var5 = var6.charAt(var12);
                        continue label27;
                     }

                     var6 = "íO\u009e\u0018Êi\u000b¤\u009a\u008d\u0087é¦\u0090û2\u0080¼ÜØ-<g>Æ1#\u0013©©dá\u0018f9\u0084» \u0011<\b\u00856'b?à/jÅ5'\u0098\u001dS+W";
                     var8 = "íO\u009e\u0018Êi\u000b¤\u009a\u008d\u0087é¦\u0090û2\u0080¼ÜØ-<g>Æ1#\u0013©©dá\u0018f9\u0084» \u0011<\b\u00856'b?à/jÅ5'\u0098\u001dS+W"
                        .length();
                     var5 = ' ';
                     var12 = -1;
               }

               var13 = var6.substring(++var12, var12 + var5);
               var10001 = 0;
            }
         }
      }

      private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
         return var0;
      }

      private static String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(byte[] var0) {
         int var1 = 0;
         int var2;
         char[] var3 = new char[var2 = var0.length];

         for (int var4 = 0; var4 < var2; var4++) {
            int var5;
            if ((var5 = 255 & var0[var4]) < 192) {
               var3[var1++] = (char)var5;
            } else if (var5 < 224) {
               char var6 = (char)((char)(var5 & 31) << 6);
               byte var8 = var0[++var4];
               var6 = (char)(var6 | (char)(var8 & 63));
               var3[var1++] = var6;
            } else if (var4 < var2 - 2) {
               char var12 = (char)((char)(var5 & 15) << '\f');
               byte var9 = var0[++var4];
               var12 = (char)(var12 | (char)(var9 & 63) << 6);
               var9 = var0[++var4];
               var12 = (char)(var12 | (char)(var9 & 63));
               var3[var1++] = var12;
            }
         }

         return new String(var3, 0, var1);
      }

      private static String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var0, long var1) {
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 7895;
         if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5] == null) {
            Object[] var4;
            try {
               Long var3 = Thread.currentThread().threadId();
               var4 = (Object[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var3);
               if (var4 == null) {
                  var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.put(var3, var4);
               }
            } catch (Exception var10) {
               throw new RuntimeException(
                  "me/octo/client/scripting/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
                  var10
               );
            }

            byte[] var6 = new byte[8];
            var6[0] = (byte)(var1 >>> 56);

            for (int var7 = 1; var7 < 8; var7++) {
               var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
            }

            DESKeySpec var11 = new DESKeySpec(var6);
            SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
            ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
            byte[] var9 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[var5].getBytes("ISO-8859-1");
            IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               ((Cipher)var4[0]).doFinal(var9)
            );
         }

         return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5];
      }

      private static Object IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         Lookup var0, MutableCallSite var1, String var2, Object[] var3
      ) {
         int var4 = (Integer)var3[0];
         long var5 = (Long)var3[1];
         String var7 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var5);
         MethodHandle var8 = MethodHandles.constant(String.class, var7);
         var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
         return var7;
      }

      private static CallSite IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Lookup var0, String var1, MethodType var2) {
         MutableCallSite var3 = new MutableCallSite(var2);

         try {
            var3.setTarget(
               MethodHandles.explicitCastArguments(
                  MethodHandles.insertArguments(
                     "IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI".asCollector(Object[].class, var2.parameterCount()),
                     0,
                     var0,
                     var3,
                     var1
                  ),
                  var2
               )
            );
            return var3;
         } catch (Exception var5) {
            throw new RuntimeException(
               "me/octo/client/scripting/llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }
}
