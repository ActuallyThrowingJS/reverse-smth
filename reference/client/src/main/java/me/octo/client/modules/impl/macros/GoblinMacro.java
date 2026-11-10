package me.octo.client.modules.impl.macros;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.entity.EntityDataUpdateEvent;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.settings.Setting;
import me.octo.client.modules.IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl;
import me.octo.client.modules.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
import me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII;
import me.octo.client.modules.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII;
import me.octo.client.modules.impl.features.hud.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI;
import net.minecraft.core.BlockPos;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class GoblinMacro extends me.octo.client.modules.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
   @NotNull
   public static GoblinMacro.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   private int IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   @NotNull
   private final ArrayList<IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl> lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   private int llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   @NotNull
   private static GoblinMacro lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   private static long lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = 94873644915915L;
   private static String[] IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   private static String[] lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   private static Map IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = new HashMap(13);
   private static long[] IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   private static Integer[] lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   private static Map llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   private static long[] lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   private static Long[] IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
   private static Map lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;

   public GoblinMacro() {
      long var1 = lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII ^ 49070077558057L;
      ModuleCategory var10003 = ModuleCategory.MACROS;
      String[] var3 = new String[]{
         "This macro kills Goblins in the Dwarven Mines", "Uses CombatBot for intelligent targeting and pathfinding", "Tracks session kills"
      };
      List var10005 = CollectionsKt.listOf(var3);
      var3 = new String[]{"Make sure you have a good combat pet", "Use a strong melee weapon", "Etherwarp recommended for movement"};
      List var10006 = CollectionsKt.listOf(var3);
      Setting[] var5 = new Setting[]{
         llIIIlIIllIIIllIIIlllllllIlIlIlIlIllllIlIIllIIIllIlIlllIIIlllIIlIllIlIlIIIlIllIIIIlII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
      };
      super("Goblin Macro", "Kills Goblins in the Dwarven Mines.", var10003, "Dwarven", var10005, var10006, false, var5);
      IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl[] var6 = new IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl[]{
         new IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl(
            new BlockPos(-73, 137, 151), me.octo.client.modules.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.WALK
         )
      };
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = CollectionsKt.arrayListOf(var6);
   }

   public final int lllIIllIIIlIlIIIlIIlIlIlIIIIIIIIlIlllllIIIIlllIIllIllllIllIIIlIIIIIlIllIIllllIIIlllll() {
      return this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1) {
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = var1;
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull EntityDataUpdateEvent eventArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   protected void lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII(long var1) {
      long var3 = var1 ^ 38666634225439L;
      long var5 = var1 ^ 26927438315355L;
      long var7 = (var1 ^ 83787715340131L) >>> 32;
      int var9 = (int)((var1 ^ 83787715340131L) << 32 >>> 32);
      long var10 = (var1 ^ 38864157951580L) >>> 16;
      int var12 = (int)((var1 ^ 38864157951580L) << 48 >>> 48);
      long var13 = var1 ^ 3442892103035L;
      long var15 = var1 ^ 1164770148390L;
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         this,
         lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"f">(4018, 6800309859809521384L ^ var1),
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.TRAVEL,
         GoblinMacro::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI,
         IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl<"w">(19828, 7734639834100613587L ^ var1),
         false,
         false,
         GoblinMacro::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI,
         (Function1)(
            new Function1<lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII, Unit>(this) {
               private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 85192591728966L;
               private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

               {
                  long var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 7266864902042L;
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var1, long var2
               ) {
                  var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var2;
                  int var4 = (int)((var2 ^ 8465190156654L) >>> 32);
                  int var5x = (int)((var2 ^ 8465190156654L) << 32 >>> 32);
                  Intrinsics.checkNotNullParameter(
                     var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"r">(12674, 4828696225665614508L ^ var2)
                  );
                  GoblinMacro.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                     (GoblinMacro)this.receiver, var4, var1, var5x
                  );
               }

               static {
                  long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 124202185385485L;
                  Cipher var2;
                  Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                  SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                  byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var3x = 1; var3x < 8; var3x++) {
                     var10003[var3x] = (byte)(var0 << var3x * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  String[] var9x = new String[3];
                  int var7x = 0;
                  String var6 = " ÿô,X\u00932µ\u008d\u001d\u001eùruT\u0096ååQù\u009bº\u0087#\u0013BÓ~\u0002úÿ×b]øì\u0095È\u0096\u001e\u0010\u0012¸\u009fË)}\u001a\u0016*2µÜr¥`\u0092ØQO¹Lè'Mä*é\u008b\u0096¿\u0094rÂ½\u0010±\u008b\u0085O\u0014\bNç\u000e\u0018\u001b\u009e?\u009cyt\u0088'z\u0097Ë\u0019\u008a\u0083ýÁã<\u009fù9nÃù%Öý*\u0089_\u0090\"\u0081z&Ò4ð\u0093ô\u008a\n\u008f\u008c\u0095¶ö\u0012\u0012íf\u0014/t!\u0090\u008doù\u0094§ùóy\u008d§\\\u0086àí»ÉÙ\u0085\u0081½úúÑ\u0095c\u0016L[\u0083nó·é¢#h)My4\u001dÁò\u0092¥:\u0013zÄy\u0087ÆAí)ú\u0090äVugû\u0006¶Aº¨\u0096àüY2\u0081Âq0ñÐììEb\tÜ² A)î\u00073îpÛ8vdXø/\t\u009f\u0006F=É\u00879\u0082LqO©\u0090¨4OÖ\u008e\u0083Et\ní~Zê!xcà¾";
                  int var8 = " ÿô,X\u00932µ\u008d\u001d\u001eùruT\u0096ååQù\u009bº\u0087#\u0013BÓ~\u0002úÿ×b]øì\u0095È\u0096\u001e\u0010\u0012¸\u009fË)}\u001a\u0016*2µÜr¥`\u0092ØQO¹Lè'Mä*é\u008b\u0096¿\u0094rÂ½\u0010±\u008b\u0085O\u0014\bNç\u000e\u0018\u001b\u009e?\u009cyt\u0088'z\u0097Ë\u0019\u008a\u0083ýÁã<\u009fù9nÃù%Öý*\u0089_\u0090\"\u0081z&Ò4ð\u0093ô\u008a\n\u008f\u008c\u0095¶ö\u0012\u0012íf\u0014/t!\u0090\u008doù\u0094§ùóy\u008d§\\\u0086àí»ÉÙ\u0085\u0081½úúÑ\u0095c\u0016L[\u0083nó·é¢#h)My4\u001dÁò\u0092¥:\u0013zÄy\u0087ÆAí)ú\u0090äVugû\u0006¶Aº¨\u0096àüY2\u0081Âq0ñÐììEb\tÜ² A)î\u00073îpÛ8vdXø/\t\u009f\u0006F=É\u00879\u0082LqO©\u0090¨4OÖ\u008e\u0083Et\ní~Zê!xcà¾"
                     .length();
                  char var5x = '(';
                  int var4 = -1;

                  while (true) {
                     byte[] var10x = var2.doFinal(var6.substring(++var4, var4 + var5x).getBytes("ISO-8859-1"));
                     String var13x = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10x).intern();
                     byte var10001 = -1;
                     var9x[var7x++] = var13x;
                     if ((var4 += var5x) >= var8) {
                        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var9x;
                        IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new String[3];
                        return;
                     }

                     var5x = var6.charAt(var4);
                  }
               }

               private static String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(byte[] var0) {
                  int var1x = 0;
                  int var2;
                  char[] var3x = new char[var2 = var0.length];

                  for (int var4 = 0; var4 < var2; var4++) {
                     int var5x;
                     if ((var5x = 255 & var0[var4]) < 192) {
                        var3x[var1x++] = (char)var5x;
                     } else if (var5x < 224) {
                        char var6 = (char)((char)(var5x & 31) << 6);
                        byte var8 = var0[++var4];
                        var6 = (char)(var6 | (char)(var8 & 63));
                        var3x[var1x++] = var6;
                     } else if (var4 < var2 - 2) {
                        char var12x = (char)((char)(var5x & 15) << '\f');
                        byte var9x = var0[++var4];
                        var12x = (char)(var12x | (char)(var9x & 63) << 6);
                        var9x = var0[++var4];
                        var12x = (char)(var12x | (char)(var9x & 63));
                        var3x[var1x++] = var12x;
                     }
                  }

                  return new String(var3x, 0, var1x);
               }

               private static String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var0, long var1x) {
                  int var5x = var0 ^ (int)(var1x & 32767L) ^ 410;
                  if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5x] == null) {
                     Object[] var4;
                     try {
                        Long var3x = Thread.currentThread().threadId();
                        var4 = (Object[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var3x);
                        if (var4 == null) {
                           var4 = new Object[]{
                              Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                           };
                           lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.put(var3x, var4);
                        }
                     } catch (Exception var10x) {
                        throw new RuntimeException(
                           "me/octo/client/modules/impl/macros/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll",
                           var10x
                        );
                     }

                     byte[] var6 = new byte[8];
                     var6[0] = (byte)(var1x >>> 56);

                     for (int var7x = 1; var7x < 8; var7x++) {
                        var6[var7x] = (byte)(var1x << var7x * 8 >>> 56);
                     }

                     DESKeySpec var11 = new DESKeySpec(var6);
                     SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
                     ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
                     byte[] var9x = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[var5x].getBytes("ISO-8859-1");
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5x] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        ((Cipher)var4[0]).doFinal(var9x)
                     );
                  }

                  return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5x];
               }

               private static Object IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  Lookup var0, MutableCallSite var1x, String var2, Object[] var3x
               ) {
                  int var4 = (Integer)var3x[0];
                  long var5x = (Long)var3x[1];
                  String var7x = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var5x);
                  MethodHandle var8 = MethodHandles.constant(String.class, var7x);
                  var1x.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                  return var7x;
               }

               private static CallSite IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  Lookup var0, String var1x, MethodType var2
               ) {
                  MutableCallSite var3x = new MutableCallSite(var2);

                  try {
                     var3x.setTarget(
                        MethodHandles.explicitCastArguments(
                           MethodHandles.insertArguments(
                              "IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI"
                                 .asCollector(Object[].class, var2.parameterCount()),
                              0,
                              var0,
                              var3x,
                              var1x
                           ),
                           var2
                        )
                     );
                     return var3x;
                  } catch (Exception var5x) {
                     throw new RuntimeException(
                        "me/octo/client/modules/impl/macros/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll"
                           + " : "
                           + var1x
                           + " : "
                           + var2.toString(),
                        var5x
                     );
                  }
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$2b3836525f7eed53(
                  lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII p0Arg, long argument2Arg
               ) {
                  argument2Arg = 8779113878515L;
                  argument2Arg = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ argument2Arg;
                  int var4 = (int)((argument2Arg ^ 8465190156654L) >>> 32);
                  int var5x = (int)((argument2Arg ^ 8465190156654L) << 32 >>> 32);
                  Intrinsics.checkNotNullParameter(p0Arg, "p0");
                  GoblinMacro.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$ac2110f0cfd0f93f(
                     (GoblinMacro)this.receiver, var4, p0Arg, var5x
                  );
               }
            }
         ),
         48,
         null,
         var3
      );
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$2030c455b41fd429(
         this,
         lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"f">(5147, 6838199178427397445L ^ var1),
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.MOVE,
         IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl<"w">(27633, 2495705595039737684L ^ var1),
         0L,
         false,
         false,
         GoblinMacro::IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII,
         (Function1)(
            new Function1<lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII, Unit>(this) {
               private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 803030707715L;
               private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

               {
                  long var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 93858598008318L;
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  int var1, int var2, byte var3x, lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var4
               ) {
                  long var5x = ((long)var1 << 32 | (long)var2 << 40 >>> 32 | (long)var3x << 56 >>> 56)
                     ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  int var7x = (int)((var5x ^ 86600449282124L) >>> 32);
                  int var8 = (int)((var5x ^ 86600449282124L) << 32 >>> 32);
                  Intrinsics.checkNotNullParameter(
                     var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"j">(18257, 6860037926257226589L ^ var5x)
                  );
                  GoblinMacro.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                     (GoblinMacro)this.receiver, var7x, var4, var8
                  );
               }

               static {
                  long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 49006851654135L;
                  Cipher var2;
                  Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                  SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                  byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var3 = 1; var3 < 8; var3++) {
                     var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  String[] var9 = new String[3];
                  int var7 = 0;
                  String var6 = "Å1à±ÅmûuW©\f1Lm\u0001f\u001bÙnª\u0084ì\u0089\u000b\u0085ïqìt\u0090{\n¸s)z\u008eÌ-½\u0010u7J\u0016\u009d\u001d²bhüU\u008a\u001c|\u0088!Øtâi8\u0085èWN¶\u008f8_yÝ&\u0010©MK¡\u0080ÁÆ\u0084¯nàg¾ZhbQ\u00919<T â\u009cx\u0015{\u0001g¢\u009cÿï\u0014\u009c´¢\u008asÛHÁ,W31\u0013\u0095q\u0081úvÙ\\fõÃD¶ ¥áÁêå\u0013\u000b\u0095¥\u00118×tzBU\u0000ÄKHE4òøÞ\u009cÃt<`91ÞÂ\u009d!\tãò\u0094i\u0092\u001c½?>\u000e¹\u0098~\u009dÌ\u0007Âh9ñÑÕ´îÊNq6ÄæN\u009c\u0089ßÆgá®ªrºw85\u0098\u008b¾\u008cÉx{É\u0088\u007f,cén`\rC\u001bçê\u0083~}¶)£\u008b\u0081\u0000ÝË©\u0082×ËV\u008d>ôgv\nÆî\u00adüÕÊ\u0090\u0017ý½á\u001fà ¨¡¸";
                  int var8 = "Å1à±ÅmûuW©\f1Lm\u0001f\u001bÙnª\u0084ì\u0089\u000b\u0085ïqìt\u0090{\n¸s)z\u008eÌ-½\u0010u7J\u0016\u009d\u001d²bhüU\u008a\u001c|\u0088!Øtâi8\u0085èWN¶\u008f8_yÝ&\u0010©MK¡\u0080ÁÆ\u0084¯nàg¾ZhbQ\u00919<T â\u009cx\u0015{\u0001g¢\u009cÿï\u0014\u009c´¢\u008asÛHÁ,W31\u0013\u0095q\u0081úvÙ\\fõÃD¶ ¥áÁêå\u0013\u000b\u0095¥\u00118×tzBU\u0000ÄKHE4òøÞ\u009cÃt<`91ÞÂ\u009d!\tãò\u0094i\u0092\u001c½?>\u000e¹\u0098~\u009dÌ\u0007Âh9ñÑÕ´îÊNq6ÄæN\u009c\u0089ßÆgá®ªrºw85\u0098\u008b¾\u008cÉx{É\u0088\u007f,cén`\rC\u001bçê\u0083~}¶)£\u008b\u0081\u0000ÝË©\u0082×ËV\u008d>ôgv\nÆî\u00adüÕÊ\u0090\u0017ý½á\u001fà ¨¡¸"
                     .length();
                  char var5 = '(';
                  int var4 = -1;

                  while (true) {
                     byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                     String var13 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                     byte var10001 = -1;
                     var9[var7++] = var13;
                     if ((var4 += var5) >= var8) {
                        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var9;
                        IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new String[3];
                        return;
                     }

                     var5 = var6.charAt(var4);
                  }
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
                  int var5 = var0 ^ (int)(var1 & 32767L) ^ 12186;
                  if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5] == null) {
                     Object[] var4;
                     try {
                        Long var3 = Thread.currentThread().threadId();
                        var4 = (Object[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var3);
                        if (var4 == null) {
                           var4 = new Object[]{
                              Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                           };
                           lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.put(var3, var4);
                        }
                     } catch (Exception var10) {
                        throw new RuntimeException(
                           "me/octo/client/modules/impl/macros/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI",
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

               private static CallSite IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  Lookup var0, String var1, MethodType var2
               ) {
                  MutableCallSite var3 = new MutableCallSite(var2);

                  try {
                     var3.setTarget(
                        MethodHandles.explicitCastArguments(
                           MethodHandles.insertArguments(
                              "IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI"
                                 .asCollector(Object[].class, var2.parameterCount()),
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
                        "me/octo/client/modules/impl/macros/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI"
                           + " : "
                           + var1
                           + " : "
                           + var2.toString(),
                        var5
                     );
                  }
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$0f9dbf69cf238525(
                  int argument1Arg,
                  int argument2Arg,
                  byte argument3Arg,
                  lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII p0Arg
               ) {
                  short var9x = 844;
                  argument2Arg = 4727477;
                  argument3Arg = -108;
                  long var5x = ((long)var9x << 32 | (long)argument2Arg << 40 >>> 32 | (long)argument3Arg << 56 >>> 56)
                     ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  int var7x = (int)((var5x ^ 86600449282124L) >>> 32);
                  int var8 = (int)((var5x ^ 86600449282124L) << 32 >>> 32);
                  Intrinsics.checkNotNullParameter(p0Arg, "p0");
                  GoblinMacro.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$ac2110f0cfd0f93f(
                     (GoblinMacro)this.receiver, var7x, p0Arg, var8
                  );
               }
            }
         ),
         var5,
         56,
         null
      );
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$d3fec560eef4040e(
         this,
         lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"f">(31348, 4390756726175275812L ^ var1),
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.KILL,
         IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl<"w">(13291, 4885547082851434317L ^ var1),
         0L,
         GoblinMacro::lIIlIlIIllIlIIIIllIllIIllIIIIIIllllIIllIIIlIlIllIlIIIlIIlIlIIIlIllIIllllllllIIlIlllII,
         false,
         false,
         GoblinMacro::IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl,
         (Function1)(
            new Function1<lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII, Unit>(this) {
               private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 69539155339191L;
               private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

               {
                  long var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 135646698242826L;
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var1, long var2
               ) {
                  var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var2;
                  int var4 = (int)((var2 ^ 42744376430276L) >>> 32);
                  int var5 = (int)((var2 ^ 42744376430276L) << 32 >>> 32);
                  Intrinsics.checkNotNullParameter(
                     var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(11959, 516402769384767675L ^ var2)
                  );
                  GoblinMacro.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                     (GoblinMacro)this.receiver, var4, var1, var5
                  );
               }

               static {
                  long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 38628518652279L;
                  Cipher var2;
                  Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                  SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                  byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var3 = 1; var3 < 8; var3++) {
                     var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  String[] var9 = new String[3];
                  int var7 = 0;
                  String var6 = "iÉSñ\u009eì§Ò\u009f+Ä\u000bÂã\u001d?G\u001frà\u0081\u009dV¥\u0015êv\u0093\u008d\u0018\u008ai Q¨ÈðÅ0Sê\u009eÌ\u0016¢ù6á¬Ù¾!ÍW¿Í\u001f¶\u0082_Ì\u0093\u0080®Á^W\u0091\u000b£øXs\u001bÏc¢\u0097\u0097ºéÕ\u0007ð>äI\u0016e\b¯¾W\u0098FãRXnQ<]\u0085\"\u0005Y\u0098ê#Õùq?Ñîô)\u008e²P\u0097>(_jüÒÁÓ\n§Éü\u00028Þ\bÓ\u009c2J%¥\u001f[$ÜC\b4¥\u001f56\u0000\u0085\u009f¬½iµ\u0095z\u00830;¡1ïÞ¦êN»¤[¢æÑ\u0083&pC<mC«<o£\u0087\u0010ëÐ\u008f:@\u0094\u008eÿÿ÷8öñ\u0019\u0000\u0006GZ ÞÅBJ\u009f(P«\n+ølôÃ\u0011+ÐåÙÄ\u001e'Xì|t\u0083Ym´:aO<\u008dxbº+\u0080äc¨\u0007D\u001f\u0010Ø\u0084}\u008a¿\u0001.\u0005T\u00ad${îÓ'Ñ";
                  int var8 = "iÉSñ\u009eì§Ò\u009f+Ä\u000bÂã\u001d?G\u001frà\u0081\u009dV¥\u0015êv\u0093\u008d\u0018\u008ai Q¨ÈðÅ0Sê\u009eÌ\u0016¢ù6á¬Ù¾!ÍW¿Í\u001f¶\u0082_Ì\u0093\u0080®Á^W\u0091\u000b£øXs\u001bÏc¢\u0097\u0097ºéÕ\u0007ð>äI\u0016e\b¯¾W\u0098FãRXnQ<]\u0085\"\u0005Y\u0098ê#Õùq?Ñîô)\u008e²P\u0097>(_jüÒÁÓ\n§Éü\u00028Þ\bÓ\u009c2J%¥\u001f[$ÜC\b4¥\u001f56\u0000\u0085\u009f¬½iµ\u0095z\u00830;¡1ïÞ¦êN»¤[¢æÑ\u0083&pC<mC«<o£\u0087\u0010ëÐ\u008f:@\u0094\u008eÿÿ÷8öñ\u0019\u0000\u0006GZ ÞÅBJ\u009f(P«\n+ølôÃ\u0011+ÐåÙÄ\u001e'Xì|t\u0083Ym´:aO<\u008dxbº+\u0080äc¨\u0007D\u001f\u0010Ø\u0084}\u008a¿\u0001.\u0005T\u00ad${îÓ'Ñ"
                     .length();
                  char var5 = 216;
                  int var4 = -1;

                  while (true) {
                     byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                     String var13 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                     byte var10001 = -1;
                     var9[var7++] = var13;
                     if ((var4 += var5) >= var8) {
                        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var9;
                        IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new String[3];
                        return;
                     }

                     var5 = var6.charAt(var4);
                  }
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
                  int var5 = var0 ^ (int)(var1 & 32767L) ^ 27409;
                  if (IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5] == null) {
                     Object[] var4;
                     try {
                        Long var3 = Thread.currentThread().threadId();
                        var4 = (Object[])lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.get(var3);
                        if (var4 == null) {
                           var4 = new Object[]{
                              Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                           };
                           lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.put(var3, var4);
                        }
                     } catch (Exception var10) {
                        throw new RuntimeException(
                           "me/octo/client/modules/impl/macros/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI",
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

               private static CallSite IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  Lookup var0, String var1, MethodType var2
               ) {
                  MutableCallSite var3 = new MutableCallSite(var2);

                  try {
                     var3.setTarget(
                        MethodHandles.explicitCastArguments(
                           MethodHandles.insertArguments(
                              "IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI"
                                 .asCollector(Object[].class, var2.parameterCount()),
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
                        "me/octo/client/modules/impl/macros/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI"
                           + " : "
                           + var1
                           + " : "
                           + var2.toString(),
                        var5
                     );
                  }
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$7e99d89c55cfe0db(
                  lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII p0Arg, long argument2Arg
               ) {
                  argument2Arg = 93370013950632L;
                  argument2Arg = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ argument2Arg;
                  int var4 = (int)((argument2Arg ^ 42744376430276L) >>> 32);
                  int var5x = (int)((argument2Arg ^ 42744376430276L) << 32 >>> 32);
                  Intrinsics.checkNotNullParameter(p0Arg, "p0");
                  GoblinMacro.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$ac2110f0cfd0f93f(
                     (GoblinMacro)this.receiver, var4, p0Arg, var5x
                  );
               }
            }
         ),
         var10,
         104,
         (char)var12,
         null
      );
   }

   @Override
   public void llllIIllIIIlIlIIlIllIlIIlIllllIlllIlIIIllllIIllIlIlllllIIlIlllIIlllIllIlllIlllIIlIIll(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIlIlIIlllIIIIllIlIlIIllllIIlllIIllIllIlIlIlIllIlIIlIIllllIIlIlIllIllllllIlllIIIIlllI(char param1, int param2, short param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void llIlllIIllIIIlIIIIlllIIlIllIllIIllIIlIIllllllIllllllIllIIlIIIIIIIllIlIIIIIIIIIIIlllll(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlIIIllIllIIIlIlllIIlIIlIIIllllIlIlIIIIIIIllllllIIlIllIIlIIIlIIIIlllIIIlIlIIIllIIll(int param1, char param2, int param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IlllIllllIIIlllllIIIIIlIlIIIIlIlIllIlIllIIllIIllIIlIlIlIIlIIllIIllIIIlIIllllIIIlIlllI(long var1) {
      var1 = lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII ^ var1;
      long var3 = var1 ^ 17012341781583L;
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.KILL,
         var3
      );
   }

   private final void lIllIllIlIlIIIllIllIIIIIIIIlIlIllIIllllllIlIlllIlIllIIllIIllllIIIIIIlIlIlIllIlIllllII(long var1) {
      var1 = lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII ^ var1;
      long var3 = var1 ^ 66187527821380L;
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.MOVE,
         var3
      );
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = 0;
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var1, int var2, int var3, byte var4
   ) {
      long var5 = ((long)var2 << 32 | (long)var3 << 40 >>> 32 | (long)var4 << 56 >>> 56)
         ^ lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
      long var7 = var5 ^ 112379899235959L;
      long var10001 = var5 ^ 106177376528048L;
      int var9 = (int)((var5 ^ 106177376528048L) >>> 32);
      int var10 = (int)((var5 ^ 106177376528048L) << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      long var12 = var5 ^ 10478236046861L;
      IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl var10000 = this.IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII();
      IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var14 = new IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.DWARVEN_FORGE,
         GoblinMacro::lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll,
         var1.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(),
         0,
         0,
         0L,
         0,
         GoblinMacro::IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII,
         120,
         null
      );
      var10000.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var9, (short)var10, var14, (short)var11);
   }

   private final void lIlIllIIllIIllIIlllllIlIIIllIIllIIlllIllIllIIIlIIIIlIlIIllIIIIIlIIlllIIlllIlIlIlIlllI(long var1) {
      var1 = lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII ^ var1;
      long var3 = var1 ^ 87718778912030L;
      long var5 = var1 ^ 60606385618697L;
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI()
         .lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(var3);
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = 0;
      this.lIIlIlIIllIlIIlllllIllIlIlIIllllIllIIIlIllIlIIlIlIlIllIlllIlIIIllIIlIlIIlIlIllllIIlll(var5);
   }

   @Override
   public void IlIlIIIlllIlIIlIlllIllIllIIlIllIIllIlIIlIIlIllllllIlIIlIllIllllIIlIIIlIIIllIlIIIIlIIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl(long var1) {
      long var3 = var1 ^ 0L;
      long var5 = var1 ^ 17623842614854L;
      long var7 = var1 ^ 122831676074303L;
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI()
         .lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(var7);
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var5, this, false, 1, null
      );
      super.IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl(var3);
   }

   @Override
   public void IIllIllIIlIIIlIlllIlIlllIIIlllIIIlIIIIIIIIllIlIIlIIIIllllllIllIIlllIIlIIIIIlIllllllIl(char var1, int var2, int var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var10001 = var4 ^ 133950269923494L;
      int var6 = (int)((var4 ^ 133950269923494L) >>> 32);
      int var7 = (int)((var4 ^ 133950269923494L) << 32 >>> 48);
      int var8 = (int)(var10001 << 48 >>> 48);
      long var9 = var4 ^ 140408614910228L;
      long var11 = var4 ^ 16406806265912L;
      var10001 = var4 ^ 83849465271128L;
      int var13 = (int)((var4 ^ 83849465271128L) >>> 32);
      int var14 = (int)((var4 ^ 83849465271128L) << 32 >>> 48);
      int var15 = (int)(var10001 << 48 >>> 48);
      lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"f">(2238, 503924030655465742L ^ var4),
         var9,
         0,
         2,
         null
      );
      lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            GoblinMacro::IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI,
            IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI<"i">(19735, 7686740434733665573L ^ var4),
            0,
            var11
         );
      lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            GoblinMacro::IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI,
            IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI<"i">(2524, 6775500943636384239L ^ var4),
            0,
            var11
         );
   }

   private static final long IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(GoblinMacro var0, long var1) {
      var1 = lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII ^ var1;
      return var0.lIllIIIIlllIllllIlIllIIlIllllIllIIllIllIIllIIIIllIllIIIlIllIllllIIIIllIIlllllllIlIIll()
            .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI()
         + IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl<"w">(22168, 7046050321825105617L ^ var1);
   }

   private static final Object llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(GoblinMacro var0) {
      return TuplesKt.to(
         var0.lIllIIIIlllIllllIlIllIIlIllllIllIIllIllIIllIIIIllIllIIIlIllIllllIIIIllIIlllllllIlIIll().getLocation(),
         me.octo.client.utils.skyblock.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI()
      );
   }

   private static final Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(GoblinMacro var0, long var1, int var3) {
      long var4 = (var1 << 32 | (long)var3 << 32 >>> 32) ^ lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
      long var6 = var4 ^ 89773922312551L;
      return new GoblinMacro.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         var0.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI,
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
            .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(),
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var0, 0.0, 1, var6, null
         )
      );
   }

   private static final boolean lIIlIlIIllIlIIIIllIllIIllIIIIIIllllIIllIIIlIlIllIlIIIlIIlIlIIIlIllIIllllllllIIlIlllII() {
      return me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI()
         .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII();
   }

   private static final Object IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long var0, GoblinMacro var2) {
      var0 = lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII ^ var0;
      long var3 = var0 ^ 109643573560273L;
      return new GoblinMacro.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         var2.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI,
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI()
            .lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(var3)
      );
   }

   private static final Unit lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(GoblinMacro var0, long var1) {
      var1 = lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII ^ var1;
      long var3 = var1 ^ 50520418600749L;
      var0.lIllIllIlIlIIIllIllIIIIIIIIlIlIllIIllllllIlIlllIlIllIIllIIllllIIIIIIlIlIlIllIlIllllII(var3);
      return Unit.INSTANCE;
   }

   private static final Unit IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(GoblinMacro var0, long var1) {
      var1 = lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII ^ var1;
      long var3 = var1 ^ 45314836748524L;
      var0.lIlIllIIllIIllIIlllllIlIIIllIIllIIlllIllIllIIIlIIIIlIlIIllIIIIIlIIlllIIlllIlIlIlIlllI(var3);
      return Unit.INSTANCE;
   }

   private static final String IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(
      int var0, GoblinMacro var1, int var2, char var3
   ) {
      long var4 = ((long)var0 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48)
         ^ lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
      String var10000 = var1.IlIIIIIIlIIllIIIIlIllllIllIIlIlIllIIIllIIIIIllllIlllllllIIIlIllllIIlIIlIlIlIlIIIIllll().id;
      return lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"f">(5967, 2634365789408422545L ^ var4) + var10000;
   }

   private static final String IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(
      GoblinMacro var0, int var1, char var2, int var3
   ) {
      long var4 = ((long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48)
         ^ lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
      int var10000 = var0.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
      return lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"f">(3239, 2846687675323269785L ^ var4) + var10000;
   }

   static {
      long var22 = lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII ^ 89391064705250L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var25 = 1; var25 < 8; var25++) {
         var10003[var25] = (byte)(var22 << var25 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[21];
      int var29 = 0;
      String var28 = "\u001cZ¹\u0015p³\u0014÷¼ò\u008fÅåêÃ¿bHÿ¬\u0095v\u0011\u0090V\u00923\u000eJM.³ ]\u001cbõâp2¥G\u009dÌ6n4æ¤ÔØÚWÏSG6gÀYN¸C\u0000\u009d\u0010WY6VýS\u0016¨\u00adZó\u008c\u0089¤þ\u0002(BÓ\u0095µø\u0085R7\u0016{^®üg\u00ad\u0006¡ÆPVX'tº0CR¶i]q93x·Ëæ\u0087J+ \u0011àûgÒ\n²'á6\u0018\u0088<\u009cöÛ\u0002\u0086}\u007f\u0013Ûþ8Î8H^\u009fûqQ@\u001c}Y\u0019q/o¥§UJ/3ï¬¶`e\u008c÷ò$w\u001a\tTëÉ~^\u0096\u0006/T\u0015\u0017ÖTM| \u0018\u0092óJ\u0018ü\u0004s\u001a\u0011\u009e\u000b\u0010UñÚN\u00adQ\u0007¿åoHû8\u0011²íb\u009d\u009e\u0019¼;\u0098j Ð¤]\u001c¢{ã:\u0011Sü\u0015FØý\u009bp.ûÈ9\u00039ß\n,_\u0099q\u0090\u008b\u001a¸oÈ\u0082n\u0013\u001f\u0018k¾\u009dw¬ç'\u0003\u009a©±\u0011\u0010\u0084$\u001b[É\u0010\u001fGnÍ\u0010\u0003\u009e\u0081ôLpr\bíæB@¬%b\u009b|\u001d\u0000¸R<_\u009f\u0014WZ×\r\u0086\u008bÁ@³\u0083b\u0016Õæüºaß÷IÕûöÇ2é\u0088A#û\u0086\u0087\u0017I\u0014¶h3}Rù¶Ø\u0085\u001fÿi\u00962~\u00158ò¹ÙdÂFÞÓôÈ\u007f/Áú\u0085\u0081å\u009dõ2é\u0095A\u0013/Ãª\u00ad8*,:}\u0088@{VÖqòÃ\u008fkÚ,¨Ò\u0001ÖÀ`\u001f\u008d\u000bM\u0018\u0018(7yòä¹h\u001e\u0084\u0006Â4  \u0019Q\u0000O&Í¸¬\u0016\u0014PX¹Æ\u0017FÌr\u009a\u008f¬\u008dÑ\u0013S\u0018\u0010³\bÍÌø«p\u0002^\u009b\tÝ\u0096ÏEHÎU\u001eØàw\u0085\u008b\u0095P«ü%Iÿô\u0003à\u0010¸CªÔQ¸\"\u008eÃ¨LmXÄþ\u0083Í²ÛÀW\u0082Ó³øøcè\u009b \u0019q\u0082©mC¯t\u009b[I\u0090K·w\u0019>Q÷?½ÒÃ\u001bQD¤ôÐ\u0086#\u0004h+\rC´!â\u0092`\u0099,Î\u0005|åå\u0003úÞìáK\u001a\u0081\u0097f:ÉÜ\u0016³\u0016cà\u009fYP\u008e\u0098\u007f9\u0097\fÍ\u0001\u00074\u0014ù+\u009e¬\u0089\u0002R*AÂ.\u000f\u0094\u00806\rÊöÐç|x\u0090¤\u0013KÕ&-\u0085\u0091ß\u008fÑ\u0016è×\u001bw\u008eª!\"Ú»S\u0088\u0087\u0092.ÅQ\u0006øÑ@  \u0015_µ¾\u008aqÓiOÓØk\u0082¦\u001bù!3t^\u0087Â_TôE\u0016\u009efg\"¾(1\t\u008f\u0082ï.ø±n\u0096\u008bÄSú\u0086\u009f\u0092\u008b\u001c\u0011¤\u008d\u0000|¸\u0096\u009ex¶gV|sàf\u0095Ý\nË\u009e nìâØ4¼\u0011É\u00809×#ê~cN¶wÎ(ä¡Ò&B\"« \u0096?©² µn\u0006\u008e\u0096EhN#oVwû'Üha\u001b¯\u00129Þö\u0095ãg®· u\u0011Ê ¾\u0013Ár4q\u001b©f\u0096\u0089q5YzÖe'\u000bß\u009e|;²gç%ã³Ã\u009a¨";
      int var30 = "\u001cZ¹\u0015p³\u0014÷¼ò\u008fÅåêÃ¿bHÿ¬\u0095v\u0011\u0090V\u00923\u000eJM.³ ]\u001cbõâp2¥G\u009dÌ6n4æ¤ÔØÚWÏSG6gÀYN¸C\u0000\u009d\u0010WY6VýS\u0016¨\u00adZó\u008c\u0089¤þ\u0002(BÓ\u0095µø\u0085R7\u0016{^®üg\u00ad\u0006¡ÆPVX'tº0CR¶i]q93x·Ëæ\u0087J+ \u0011àûgÒ\n²'á6\u0018\u0088<\u009cöÛ\u0002\u0086}\u007f\u0013Ûþ8Î8H^\u009fûqQ@\u001c}Y\u0019q/o¥§UJ/3ï¬¶`e\u008c÷ò$w\u001a\tTëÉ~^\u0096\u0006/T\u0015\u0017ÖTM| \u0018\u0092óJ\u0018ü\u0004s\u001a\u0011\u009e\u000b\u0010UñÚN\u00adQ\u0007¿åoHû8\u0011²íb\u009d\u009e\u0019¼;\u0098j Ð¤]\u001c¢{ã:\u0011Sü\u0015FØý\u009bp.ûÈ9\u00039ß\n,_\u0099q\u0090\u008b\u001a¸oÈ\u0082n\u0013\u001f\u0018k¾\u009dw¬ç'\u0003\u009a©±\u0011\u0010\u0084$\u001b[É\u0010\u001fGnÍ\u0010\u0003\u009e\u0081ôLpr\bíæB@¬%b\u009b|\u001d\u0000¸R<_\u009f\u0014WZ×\r\u0086\u008bÁ@³\u0083b\u0016Õæüºaß÷IÕûöÇ2é\u0088A#û\u0086\u0087\u0017I\u0014¶h3}Rù¶Ø\u0085\u001fÿi\u00962~\u00158ò¹ÙdÂFÞÓôÈ\u007f/Áú\u0085\u0081å\u009dõ2é\u0095A\u0013/Ãª\u00ad8*,:}\u0088@{VÖqòÃ\u008fkÚ,¨Ò\u0001ÖÀ`\u001f\u008d\u000bM\u0018\u0018(7yòä¹h\u001e\u0084\u0006Â4  \u0019Q\u0000O&Í¸¬\u0016\u0014PX¹Æ\u0017FÌr\u009a\u008f¬\u008dÑ\u0013S\u0018\u0010³\bÍÌø«p\u0002^\u009b\tÝ\u0096ÏEHÎU\u001eØàw\u0085\u008b\u0095P«ü%Iÿô\u0003à\u0010¸CªÔQ¸\"\u008eÃ¨LmXÄþ\u0083Í²ÛÀW\u0082Ó³øøcè\u009b \u0019q\u0082©mC¯t\u009b[I\u0090K·w\u0019>Q÷?½ÒÃ\u001bQD¤ôÐ\u0086#\u0004h+\rC´!â\u0092`\u0099,Î\u0005|åå\u0003úÞìáK\u001a\u0081\u0097f:ÉÜ\u0016³\u0016cà\u009fYP\u008e\u0098\u007f9\u0097\fÍ\u0001\u00074\u0014ù+\u009e¬\u0089\u0002R*AÂ.\u000f\u0094\u00806\rÊöÐç|x\u0090¤\u0013KÕ&-\u0085\u0091ß\u008fÑ\u0016è×\u001bw\u008eª!\"Ú»S\u0088\u0087\u0092.ÅQ\u0006øÑ@  \u0015_µ¾\u008aqÓiOÓØk\u0082¦\u001bù!3t^\u0087Â_TôE\u0016\u009efg\"¾(1\t\u008f\u0082ï.ø±n\u0096\u008bÄSú\u0086\u009f\u0092\u008b\u001c\u0011¤\u008d\u0000|¸\u0096\u009ex¶gV|sàf\u0095Ý\nË\u009e nìâØ4¼\u0011É\u00809×#ê~cN¶wÎ(ä¡Ò&B\"« \u0096?©² µn\u0006\u008e\u0096EhN#oVwû'Üha\u001b¯\u00129Þö\u0095ãg®· u\u0011Ê ¾\u0013Ár4q\u001b©f\u0096\u0089q5YzÖe'\u000bß\u009e|;²gç%ã³Ã\u009a¨"
         .length();
      char var27 = ' ';
      int var26 = -1;

      while (true) {
         byte[] var32 = var24.doFinal(var28.substring(++var26, var26 + var27).getBytes("ISO-8859-1"));
         String var57 = IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var32).intern();
         byte var10001 = -1;
         var31[var29++] = var57;
         if ((var26 += var27) >= var30) {
            var28 = "±0ÒF\u00adkÀf7\u0092UûTÓ\u009ab0Äô\u0019ÌxØ\u0090\\é)'\u0014e\u0090êpÊË}Ú$®Réõ\u000b(\u0000\u0082\u0011vJ\u000bØ;ÿÑ¼[·NH\u008cf,r\u008f(";
            var30 = "±0ÒF\u00adkÀf7\u0092UûTÓ\u009ab0Äô\u0019ÌxØ\u0090\\é)'\u0014e\u0090êpÊË}Ú$®Réõ\u000b(\u0000\u0082\u0011vJ\u000bØ;ÿÑ¼[·NH\u008cf,r\u008f("
               .length();
            var27 = '\u0010';
            var26 = -1;

            while (true) {
               var32 = var24.doFinal(var28.substring(++var26, var26 + var27).getBytes("ISO-8859-1"));
               String var59 = IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var32).intern();
               int var49 = 0;
               var31[var29++] = var59;
               if ((var26 += var27) >= var30) {
                  IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = var31;
                  lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = new String[21];
                  llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = new HashMap(13);
                  Cipher var11;
                  var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var12 = 1; var12 < 8; var12++) {
                     var10003[var12] = (byte)(var22 << var12 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var17 = new long[2];
                  int var14 = 0;
                  String var15 = "B*e° \u00ad\u0089Ä\u0085ÜKgK\u009cûD";
                  int var16 = "B*e° \u00ad\u0089Ä\u0085ÜKgK\u009cûD".length();
                  byte var13 = 0;

                  do {
                     var49 = var13;
                     var13 += 8;
                     byte[] var18 = var15.substring(var49, var13).getBytes("ISO-8859-1");
                     var49 = var14++;
                     long var19 = (var18[0] & 255L) << 56
                        | (var18[1] & 255L) << 48
                        | (var18[2] & 255L) << 40
                        | (var18[3] & 255L) << 32
                        | (var18[4] & 255L) << 24
                        | (var18[5] & 255L) << 16
                        | (var18[6] & 255L) << 8
                        | var18[7] & 255L;
                     byte[] var21 = var11.doFinal(
                        new byte[]{
                           (byte)(var19 >>> 56),
                           (byte)(var19 >>> 48),
                           (byte)(var19 >>> 40),
                           (byte)(var19 >>> 32),
                           (byte)(var19 >>> 24),
                           (byte)(var19 >>> 16),
                           (byte)(var19 >>> 8),
                           (byte)var19
                        }
                     );
                     long var10004 = (var21[0] & 255L) << 56
                        | (var21[1] & 255L) << 48
                        | (var21[2] & 255L) << 40
                        | (var21[3] & 255L) << 32
                        | (var21[4] & 255L) << 24
                        | (var21[5] & 255L) << 16
                        | (var21[6] & 255L) << 8
                        | var21[7] & 255L;
                     byte var64 = -1;
                     var17[var49] = var10004;
                  } while (var13 < var16);

                  IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = var17;
                  lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = new Integer[2];
                  lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var1 = 1; var1 < 8; var1++) {
                     var10003[var1] = (byte)(var22 << var1 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[4];
                  int var3 = 0;
                  String var4 = "ý\t\u001aRÇØ[Ëlº¹ëD\u0001®\u0085";
                  int var5 = "ý\t\u001aRÇØ[Ëlº¹ëD\u0001®\u0085".length();
                  byte var2 = 0;

                  do {
                     int var53 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var53, var2).getBytes("ISO-8859-1");
                     var53 = var3++;
                     long var8 = (var7[0] & 255L) << 56
                        | (var7[1] & 255L) << 48
                        | (var7[2] & 255L) << 40
                        | (var7[3] & 255L) << 32
                        | (var7[4] & 255L) << 24
                        | (var7[5] & 255L) << 16
                        | (var7[6] & 255L) << 8
                        | var7[7] & 255L;
                     byte[] var10 = var0.doFinal(
                        new byte[]{
                           (byte)(var8 >>> 56),
                           (byte)(var8 >>> 48),
                           (byte)(var8 >>> 40),
                           (byte)(var8 >>> 32),
                           (byte)(var8 >>> 24),
                           (byte)(var8 >>> 16),
                           (byte)(var8 >>> 8),
                           (byte)var8
                        }
                     );
                     long var68 = (var10[0] & 255L) << 56
                        | (var10[1] & 255L) << 48
                        | (var10[2] & 255L) << 40
                        | (var10[3] & 255L) << 32
                        | (var10[4] & 255L) << 24
                        | (var10[5] & 255L) << 16
                        | (var10[6] & 255L) << 8
                        | var10[7] & 255L;
                     byte var66 = -1;
                     var6[var53] = var68;
                  } while (var2 < var5);

                  var4 = "&\u0018üä\u0090ýa\u0093O\u0002N0é\u0012zë";
                  var5 = "&\u0018üä\u0090ýa\u0093O\u0002N0é\u0012zë".length();
                  var2 = 0;

                  do {
                     int var55 = var2;
                     var2 += 8;
                     byte[] var36 = var4.substring(var55, var2).getBytes("ISO-8859-1");
                     var55 = var3++;
                     long var37 = (var36[0] & 255L) << 56
                        | (var36[1] & 255L) << 48
                        | (var36[2] & 255L) << 40
                        | (var36[3] & 255L) << 32
                        | (var36[4] & 255L) << 24
                        | (var36[5] & 255L) << 16
                        | (var36[6] & 255L) << 8
                        | var36[7] & 255L;
                     byte[] var38 = var0.doFinal(
                        new byte[]{
                           (byte)(var37 >>> 56),
                           (byte)(var37 >>> 48),
                           (byte)(var37 >>> 40),
                           (byte)(var37 >>> 32),
                           (byte)(var37 >>> 24),
                           (byte)(var37 >>> 16),
                           (byte)(var37 >>> 8),
                           (byte)var37
                        }
                     );
                     long var69 = (var38[0] & 255L) << 56
                        | (var38[1] & 255L) << 48
                        | (var38[2] & 255L) << 40
                        | (var38[3] & 255L) << 32
                        | (var38[4] & 255L) << 24
                        | (var38[5] & 255L) << 16
                        | (var38[6] & 255L) << 8
                        | var38[7] & 255L;
                     boolean var67 = false;
                     var6[var55] = var69;
                  } while (var2 < var5);

                  lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = var6;
                  IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = new Long[4];
                  lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = new GoblinMacro.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(
                     null
                  );
                  lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = new GoblinMacro();
                  return;
               }

               var27 = var28.charAt(var26);
            }
         }

         var27 = var28.charAt(var26);
      }
   }

   private static MatchException llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(MatchException var0) {
      return var0;
   }

   private static String IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(byte[] var0) {
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

   private static String lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22361;
      if (lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII", var10
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
         byte[] var9 = IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll[var5].getBytes("ISO-8859-1");
         lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl[var5] = IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl[var5];
   }

   private static Object lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var4, var5);
      MethodHandle var8 = MethodHandles.constant(String.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/modules/impl/macros/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static int IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 5833;
      if (lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII", var14
            );
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI[var3] = var15;
      }

      return lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI[var3];
   }

   private static int IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/modules/impl/macros/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static long IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 15009;
      if (IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(var1 >>> 56),
            (byte)(var1 >>> 48),
            (byte)(var1 >>> 40),
            (byte)(var1 >>> 32),
            (byte)(var1 >>> 24),
            (byte)(var1 >>> 16),
            (byte)(var1 >>> 8),
            (byte)var1
         };
         long var5 = lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().threadId();
         Object[] var9 = (Object[])lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII", var14
            );
         }

         long var15 = (var10[0] & 255L) << 56
            | (var10[1] & 255L) << 48
            | (var10[2] & 255L) << 40
            | (var10[3] & 255L) << 32
            | (var10[4] & 255L) << 24
            | (var10[5] & 255L) << 16
            | (var10[6] & 255L) << 8
            | var10[7] & 255L;
         IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII[var3] = var15;
      }

      return IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII[var3];
   }

   private static long IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(var4, var5);
      MethodHandle var9 = MethodHandles.constant(long.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var9, 0, int.class, long.class));
      return var7;
   }

   private static CallSite IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/modules/impl/macros/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$ac2110f0cfd0f93f(
      GoblinMacro var0, int var1, lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var2, int var3
   ) {
      short var9 = 19765;
      var3 = -1921332261;
      long var4 = ((long)var9 << 32 | (long)var3 << 32 >>> 32) ^ lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
      long var10001 = var4 ^ 124745520077802L;
      int var6 = (int)((var4 ^ 124745520077802L) >>> 32);
      int var7 = (int)((var4 ^ 124745520077802L) << 32 >>> 40);
      int var8 = (int)(var10001 << 56 >>> 56);
      var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$d19b48f2916090e8(var2, var6, var7, (byte)var8);
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$d19b48f2916090e8(
      lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var1, int var2, int var3, byte var4
   ) {
      short var15 = 27144;
      var3 = 6616268;
      var4 = -6;
      long var5 = ((long)var15 << 32 | (long)var3 << 40 >>> 32 | (long)var4 << 56 >>> 56)
         ^ lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
      long var7 = var5 ^ 112379899235959L;
      long var10001 = var5 ^ 106177376528048L;
      int var9 = (int)((var5 ^ 106177376528048L) >>> 32);
      int var10 = (int)((var5 ^ 106177376528048L) << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      long var12 = var5 ^ 10478236046861L;
      IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl var10000 = this.IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII();
      IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var14 = new IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.DWARVEN_FORGE,
         GoblinMacro::lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll,
         var1.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(),
         0,
         0,
         0L,
         0,
         GoblinMacro::IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII,
         120,
         null
      );
      var10000.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$2dea6c7ec1619410(
         var9, (short)var10, var14, (short)var11
      );
   }

   private static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final boolean lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private final Triple<Integer, Integer, Integer> playerPos;
      private static long lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = 9898385821825L;
      private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static Map IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new HashMap(13);

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         int argument1Arg, boolean argument2Arg, @NotNull Triple<Integer, Integer, Integer> playerPosArg
      ) {
         long var4 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 35095212364973L;
         Intrinsics.checkNotNullParameter(playerPosArg, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = argument1Arg;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = argument2Arg;
         this.playerPos = playerPosArg;
      }

      public final int IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> getPlayerPos() {
         return this.playerPos;
      }

      public final int IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final boolean lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final GoblinMacro.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         int var1, boolean var2, @NotNull Triple var3, long var4
      ) {
         var4 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ var4;
         Intrinsics.checkNotNullParameter(
            var3, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"l">(24172, 599279893999080628L ^ var4)
         );
         return new GoblinMacro.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(var1, var2, var3);
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 99820023864054L;
         Triple var3 = this.playerPos;
         boolean var4 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var5 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         return "RouteProgress(index=" + var5 + ", walkerFinished=" + var4 + ", playerPos=" + var3 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Boolean.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         return var1 * 31 + this.playerPos.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI ^ 62635974104116L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[5];
         int var7 = 0;
         String var6 = "X\u001eO4Ý\r\u008bè\u009còo\u00003÷â0W{ú+×PßØ¼Ä)Ûðt\u0019ñÈc\u0085¨+g\u001dÀ\u0018ÖÆ\u0093\u000es^\u0016\u001f_£YYïí1\u0097\b\u0085\u0011=ûv\u008a\u0010 ü\u001eçö¯lrôB'\u001a°[l\u009a¼\u008f©L3YZ\u0017\u0085\u0000ø,\u0007RÅÇ\u0002";
         int var8 = "X\u001eO4Ý\r\u008bè\u009còo\u00003÷â0W{ú+×PßØ¼Ä)Ûðt\u0019ñÈc\u0085¨+g\u001dÀ\u0018ÖÆ\u0093\u000es^\u0016\u001f_£YYïí1\u0097\b\u0085\u0011=ûv\u008a\u0010 ü\u001eçö¯lrôB'\u001a°[l\u009a¼\u008f©L3YZ\u0017\u0085\u0000ø,\u0007RÅÇ\u0002"
            .length();
         char var5 = '(';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "ë<2s÷n~ZbâÔ¥¢OúÇ`A ûòMê\u0018mÅÁ\u0004^ú(ïÕ8O_{îüÚ\u0019µ\u009aÏë4Js \u001e:\u0089\u0002tvÈ\u0084.e\u001b<%k|{bÙ\u0083IEÅ]Ñá\u000eªT<\u0003M7";
               var8 = "ë<2s÷n~ZbâÔ¥¢OúÇ`A ûòMê\u0018mÅÁ\u0004^ú(ïÕ8O_{îüÚ\u0019µ\u009aÏë4Js \u001e:\u0089\u0002tvÈ\u0084.e\u001b<%k|{bÙ\u0083IEÅ]Ñá\u000eªT<\u0003M7"
                  .length();
               var5 = '0';
               var4 = -1;

               while (true) {
                  var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                  boolean var19 = false;
                  var9[var7++] = var23;
                  if ((var4 += var5) >= var8) {
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var9;
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new String[5];
                     return;
                  }

                  var5 = var6.charAt(var4);
               }
            }

            var5 = var6.charAt(var4);
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 31232;
         if (IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5] == null) {
            Object[] var4;
            try {
               Long var3 = Thread.currentThread().threadId();
               var4 = (Object[])IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.get(var3);
               if (var4 == null) {
                  var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll.put(var3, var4);
               }
            } catch (Exception var10) {
               throw new RuntimeException(
                  "me/octo/client/modules/impl/macros/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll",
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
            byte[] var9 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5].getBytes("ISO-8859-1");
            IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               ((Cipher)var4[0]).doFinal(var9)
            );
         }

         return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5];
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
               "me/octo/client/modules/impl/macros/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
      }

      @NotNull
      public final GoblinMacro IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return GoblinMacro.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
      }
   }

   private static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI bot;
      private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 89105283843232L;
      private static String[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static Map IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new HashMap(13);

      public llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         int argument1Arg,
         @NotNull lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI botArg
      ) {
         long var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 14505365915313L;
         Intrinsics.checkNotNullParameter(botArg, "bot");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = argument1Arg;
         this.bot = botArg;
      }

      public final int IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI getBot() {
         return this.bot;
      }

      public final int IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final GoblinMacro.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         long var1,
         int var3,
         @NotNull lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var4
      ) {
         var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var1;
         Intrinsics.checkNotNullParameter(
            var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(31679, 7261391975918601502L ^ var1)
         );
         return new GoblinMacro.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(var3, var4);
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 100538888107750L;
         return "CombatProgress(kills="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", bot="
            + this.bot
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         return var1 * 31 + this.bot.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 85800103938815L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[4];
         int var7 = 0;
         String var6 = " ¦¦*\u007f\u0007\n¤OK\u001dN\u001d{÷IO°\u0016\u009ew]4´\u0003\u000fÙk£¥u\u0006Nk£ÎO$Ý×\u0010IÓ\u0083)\u0018èæ<c\u0084\u0096Äè*$T";
         int var8 = " ¦¦*\u007f\u0007\n¤OK\u001dN\u001d{÷IO°\u0016\u009ew]4´\u0003\u000fÙk£¥u\u0006Nk£ÎO$Ý×\u0010IÓ\u0083)\u0018èæ<c\u0084\u0096Äè*$T".length();
         char var5 = '(';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "\u0091óÐã\u0000B\u0081hø<\u0096oª>òn\u0010\u008bf\u009aÅ£ì·ôw<iÖZ½pÅ";
               var8 = "\u0091óÐã\u0000B\u0081hø<\u0096oª>òn\u0010\u008bf\u009aÅ£ì·ôw<iÖZ½pÅ".length();
               var5 = '\u0010';
               var4 = -1;

               while (true) {
                  var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                  boolean var19 = false;
                  var9[var7++] = var23;
                  if ((var4 += var5) >= var8) {
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var9;
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new String[4];
                     return;
                  }

                  var5 = var6.charAt(var4);
               }
            }

            var5 = var6.charAt(var4);
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 24553;
         if (IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5] == null) {
            Object[] var4;
            try {
               Long var3 = Thread.currentThread().threadId();
               var4 = (Object[])IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.get(var3);
               if (var4 == null) {
                  var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI.put(var3, var4);
               }
            } catch (Exception var10) {
               throw new RuntimeException(
                  "me/octo/client/modules/impl/macros/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
            byte[] var9 = lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI[var5].getBytes("ISO-8859-1");
            IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               ((Cipher)var4[0]).doFinal(var9)
            );
         }

         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII[var5];
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
               "me/octo/client/modules/impl/macros/lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
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
