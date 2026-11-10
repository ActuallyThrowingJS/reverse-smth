package me.octo.client.modules.impl.features.visuals;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.ArraysKt;
import me.octo.client.gui.clickgui.settings.Setting;
import me.octo.client.gui.clickgui.settings.impl.BooleanSetting;
import me.octo.client.gui.clickgui.settings.impl.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import org.jetbrains.annotations.NotNull;

public final class IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII {
   @NotNull
   public static IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII();
   @NotNull
   private static Setting[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = (Setting[])ArraysKt.plus(
      ArraysKt.plus(
         ArraysKt.plus(
            ArraysKt.plus(
               ArraysKt.plus(
                  IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(),
                  IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                     .lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl()
               ),
               IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                  .lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl()
            ),
            IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl()
         ),
         IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI()
      ),
      IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI()
   );

   private IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII() {
   }

   @NotNull
   public final Setting[] IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
      return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   }

   public static final class IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI {
      @NotNull
      public static IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private static BooleanSetting lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      @NotNull
      private static Setting[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;

      private IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI() {
      }

      @NotNull
      public final BooleanSetting IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
         return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
         return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
         return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
         return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl() {
         return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll() {
         return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      @NotNull
      public final Setting[] lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl() {
         return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      static {
         long var9 = 76408837527091L ^ 76458310753568L;
         Cipher var1;
         Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var2 = 1; var2 < 8; var2++) {
            var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var0 = new String[2];
         int var6 = 0;
         String var5 = "§\u001b>\u0080¡©\u008e1\u0005Fà\u008bh¾c¤¨vp\u0097\u0095Þ\u0019Å.\u00ad¶úÃ8Æ¿øUÂh\u009aá\u00ad\u001f\u008d^\u0001¡\u008c\u009e\u009cî\u00109\u008ervAÀhÂ®Ýà\u0092f^øì";
         int var7 = "§\u001b>\u0080¡©\u008e1\u0005Fà\u008bh¾c¤¨vp\u0097\u0095Þ\u0019Å.\u00ad¶úÃ8Æ¿øUÂh\u009aá\u00ad\u001f\u008d^\u0001¡\u008c\u009e\u009cî\u00109\u008ervAÀhÂ®Ýà\u0092f^øì"
            .length();
         char var4 = '0';
         int var3 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
            String var14 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            byte var10001 = -1;
            var0[var6++] = var14;
            if ((var3 += var4) >= var7) {
               IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI();
               lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new BooleanSetting(var0[1], var0[0], false);
               IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 30397251598549L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1x = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 7249012434057L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     long var3x = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                     String[] var5x = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        -1621373992949735860L, var3x
                     );

                     try {
                        boolean var10000x = IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                           .isToggled();
                        if (var5x != null) {
                           return var10000x;
                        }

                        if (!var10000x) {
                           return true;
                        }
                     } catch (MatchException var6x) {
                        throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           var6x, -1686314498718425506L, var3x
                        );
                     }

                     return false;
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 104114022357611L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "¼[)o\u0000â\u0086\u000f\u0087}íæÏM\u001e1P:;\u0081\u008f5\u008b\u0098\u0081ÝÿjÌ¨»O¿\u0002¥Ð$$F\u0089Z\u008bç´Ø©äÊ¨'\b\u0010R\u009a\u001a\u0089Òb\u0005lÒ:\u009f\nI\u001ck>Îò³\u0011\u001fèz\u0080êx4|¯\u009b`}ð:j\u00adû±Vú\u001d\u0012k\u008a.";
                     int var8 = "¼[)o\u0000â\u0086\u000f\u0087}íæÏM\u001e1P:;\u0081\u008f5\u008b\u0098\u0081ÝÿjÌ¨»O¿\u0002¥Ð$$F\u0089Z\u008bç´Ø©äÊ¨'\b\u0010R\u009a\u001a\u0089Òb\u0005lÒ:\u009f\nI\u001ck>Îò³\u0011\u001fèz\u0080êx4|¯\u009b`}ð:j\u00adû±Vú\u001d\u0012k\u008a."
                        .length();
                     char var5 = 16;
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0x) {
                     return var0x;
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0x) {
                     int var1x = 0;
                     int var2;
                     char[] var3x = new char[var2 = var0x.length];

                     for (int var4x = 0; var4x < var2; var4x++) {
                        int var5x;
                        if ((var5x = 255 & var0x[var4x]) < 192) {
                           var3x[var1x++] = (char)var5x;
                        } else if (var5x < 224) {
                           char var6x = (char)((char)(var5x & 31) << 6);
                           byte var8x = var0x[++var4x];
                           var6x = (char)(var6x | (char)(var8x & 63));
                           var3x[var1x++] = var6x;
                        } else if (var4x < var2 - 2) {
                           char var12 = (char)((char)(var5x & 15) << '\f');
                           byte var9x = var0x[++var4x];
                           var12 = (char)(var12 | (char)(var9x & 63) << 6);
                           var9x = var0x[++var4x];
                           var12 = (char)(var12 | (char)(var9x & 63));
                           var3x[var1x++] = var12;
                        }
                     }

                     return new String(var3x, 0, var1x);
                  }

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0x, long var1x) {
                     int var5x = var0x ^ (int)(var1x & 32767L) ^ 29504;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5x] == null) {
                        Object[] var4x;
                        try {
                           Long var3x = Thread.currentThread().threadId();
                           var4x = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3x);
                           if (var4x == null) {
                              var4x = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3x, var4x);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll",
                              var10
                           );
                        }

                        byte[] var6x = new byte[8];
                        var6x[0] = (byte)(var1x >>> 56);

                        for (int var7x = 1; var7x < 8; var7x++) {
                           var6x[var7x] = (byte)(var1x << var7x * 8 >>> 56);
                        }

                        DESKeySpec var11 = new DESKeySpec(var6x);
                        SecretKey var8x = ((SecretKeyFactory)var4x[1]).generateSecret(var11);
                        ((Cipher)var4x[0]).init(2, var8x, (IvParameterSpec)var4x[2]);
                        byte[] var9x = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5x] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4x[0]).doFinal(var9x)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5x];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0x, MutableCallSite var1x, String var2, Object[] var3x
                  ) {
                     int var4x = (Integer)var3x[0];
                     long var5x = (Long)var3x[1];
                     String var7x = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4x, var5x);
                     MethodHandle var8x = MethodHandles.constant(String.class, var7x);
                     var1x.setTarget(MethodHandles.dropArguments(var8x, 0, int.class, long.class));
                     return var7x;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0x, String var1x, MethodType var2
                  ) {
                     MutableCallSite var3x = new MutableCallSite(var2);

                     try {
                        var3x.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
                                    .asCollector(Object[].class, var2.parameterCount()),
                                 0,
                                 var0x,
                                 var3x,
                                 var1x
                              ),
                              var2
                           )
                        );
                        return var3x;
                     } catch (Exception var5x) {
                        throw new RuntimeException(
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll"
                              + " : "
                              + var1x
                              + " : "
                              + var2.toString(),
                           var5x
                        );
                     }
                  }
               };
               lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 6444144350649L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 2187696306984L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     long var3 = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                     String[] var5 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        -1621373992949735860L, var3
                     );

                     try {
                        boolean var10000 = IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                           .isToggled();
                        if (var5 != null) {
                           return var10000;
                        }

                        if (!var10000) {
                           return true;
                        }
                     } catch (MatchException var6) {
                        throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           var6, -1639992704186844084L, var3
                        );
                     }

                     return false;
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 66548206269061L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = ",IÝè\u0015¼ÏÀ¡ñ\u0011\u0098DªLÎ@y\u0095Ý½h\u0012FgÃÛÆN«N#*à\u000eKn\u008ce\u001fðÇNÉ}\u0011À°\u000fö\u001ax;.²\u0097¤9Êd)\u008aÝËa`\r\u008eð°q1 wz<\u0085Â\\õ©";
                     int var8 = ",IÝè\u0015¼ÏÀ¡ñ\u0011\u0098DªLÎ@y\u0095Ý½h\u0012FgÃÛÆN«N#*à\u000eKn\u008ce\u001fðÇNÉ}\u0011À°\u000fö\u001ax;.²\u0097¤9Êd)\u008aÝËa`\r\u008eð°q1 wz<\u0085Â\\õ©"
                        .length();
                     char var5 = 16;
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
                     return var0;
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 27286;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI",
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
                        byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 121817992923735L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 39224836104978L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     long var3 = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                     String[] var5 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        -1621373992949735860L, var3
                     );

                     try {
                        boolean var10000 = IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                           .isToggled();
                        if (var5 != null) {
                           return var10000;
                        }

                        if (!var10000) {
                           return true;
                        }
                     } catch (MatchException var6) {
                        throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           var6, -1605185534266087229L, var3
                        );
                     }

                     return false;
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 36093701994901L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "Í\u0098Ä\u0088\u0084®M¿\u007fó\u001côÚø~ÒÁðæ¶ñ_\u0005(ó\u0095Üâ\u0080¤ßÌÌ7Å\u0084\u007f\bÅ[ÉÑ\u0094>ÆSÅ3¦î÷æ×EÃ\u0088\u009cGlâ\u0091Ë~u\u0010ßìM»°\u001a=Î\u0080EòòØæÝQ";
                     int var8 = "Í\u0098Ä\u0088\u0084®M¿\u007fó\u001côÚø~ÒÁðæ¶ñ_\u0005(ó\u0095Üâ\u0080¤ßÌÌ7Å\u0084\u007f\bÅ[ÉÑ\u0094>ÆSÅ3¦î÷æ×EÃ\u0088\u009cGlâ\u0091Ë~u\u0010ßìM»°\u001a=Î\u0080EòòØæÝQ"
                        .length();
                     char var5 = '@';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
                     return var0;
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 31456;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII",
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
                        byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 25812420217179L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 35851685552624L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 76112713027983L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "ß\u0086S\u001fÊ:úÕx§Óâ\u0007L\u0001\u009dz\u0084£&Hõ£ÿéJÅ\u0091úX\u0005Ã1-\u0084xn\u0007rc'\u0084þ4\u008b\u008c\u000f\u0017ý\u0001O\u001fì<v#+\u001eq7ð\u0091YÞ\u0018dv\u0099¡ak\u0092\u008a\u008cyé\td\u007f¹\u001d1á\u0005V\u0010¸4:";
                     int var8 = "ß\u0086S\u001fÊ:úÕx§Óâ\u0007L\u0001\u009dz\u0084£&Hõ£ÿéJÅ\u0091úX\u0005Ã1-\u0084xn\u0007rc'\u0084þ4\u008b\u008c\u000f\u0017ý\u0001O\u001fì<v#+\u001eq7ð\u0091YÞ\u0018dv\u0099¡ak\u0092\u008a\u008cyé\td\u007f¹\u001d1á\u0005V\u0010¸4:"
                        .length();
                     char var5 = '@';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 30355;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll",
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
                        byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 113425836810332L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 10713781785216L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 92466588586197L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "#/~©g\u009b²\u0094Ó×paô\u0080J¯\u0092¤Àh&UHá\u001fà\u0000ùmy\u0000\u008f@Jê\u008c\u0018NÂk\u0018/íÍ\fu\u001dØ×6~\u009f\\*Ã\u0086\u0097@\u001b-\u0011Oì\u0087M\u0095±\u008a\u0091nÆGÏ[\u0087\u0011è\u000fm\u0080Õ\u0091ó\u007f \u0017_µ\u001c»\u0082\u001e+©JNs";
                     int var8 = "#/~©g\u009b²\u0094Ó×paô\u0080J¯\u0092¤Àh&UHá\u001fà\u0000ùmy\u0000\u008f@Jê\u008c\u0018NÂk\u0018/íÍ\fu\u001dØ×6~\u009f\\*Ã\u0086\u0097@\u001b-\u0011Oì\u0087M\u0095±\u008a\u0091nÆGÏ[\u0087\u0011è\u000fm\u0080Õ\u0091ó\u007f \u0017_µ\u001c»\u0082\u001e+©JNs"
                        .length();
                     char var5 = ' ';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 14386;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
                        byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 83878583058858L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 11586348829830L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 110534243564331L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "\"ù`\u008aí\u001aÜwÉò©\u0088LXw¸Ìm\u0083én\u0084`l9~\u0094O2bÎ<@'OxóÀ«ª\u008d\u0013[\u0096\u0011×bß»0GÙ(³%hø\u0088t-¹öÁj\u0016ë\u009c\u0099\u0018PÏ\\ÛçÒ\u0096\u0087a\u0000\u009a\u0019\u009d\u0082¬]÷\u0091\u001b\u009e\u009c\u0011â\u000f\u0005$\u001bË";
                     int var8 = "\"ù`\u008aí\u001aÜwÉò©\u0088LXw¸Ìm\u0083én\u0084`l9~\u0094O2bÎ<@'OxóÀ«ª\u008d\u0013[\u0096\u0011×bß»0GÙ(³%hø\u0088t-¹öÁj\u0016ë\u009c\u0099\u0018PÏ\\ÛçÒ\u0096\u0087a\u0000\u009a\u0019\u009d\u0082¬]÷\u0091\u001b\u009e\u009c\u0011â\u000f\u0005$\u001bË"
                        .length();
                     char var5 = ' ';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 32621;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll",
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
                        byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 55352964883124L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 33561012716009L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 53517988887520L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "gØµ\u0004\u000e\u0003/\u0099²¾e\u000e(\u00adµ}\u008aØ5Éô\u0019|hXbX=³K\u0096\u0016\u0005\u0001Ö$\u0013Ù®6Òí\r\u000bx6\u0082\u008b\u0086äömegª¤C\u008eRëq\u0003å\u0018\u0018ÊÒª6\u008d\"öpA¼IÍ\u0017\u0094z£\"í¯×ù\u0005©Ç";
                     int var8 = "gØµ\u0004\u000e\u0003/\u0099²¾e\u000e(\u00adµ}\u008aØ5Éô\u0019|hXbX=³K\u0096\u0016\u0005\u0001Ö$\u0013Ù®6Òí\r\u000bx6\u0082\u008b\u0086äömegª¤C\u008eRëq\u0003å\u0018\u0018ÊÒª6\u008d\"öpA¼IÍ\u0017\u0094z£\"í¯×ù\u0005©Ç"
                        .length();
                     char var5 = '@';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 15444;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl",
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
                        byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 65947125512961L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 42555090149954L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 79862871958778L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "(ZDÁ\u0003©ÉI\u008d\u001f\u0087°\u0091áB\u0014¸ß\u009eßXÀ\u0019\u0092@\u0089G\fàæ³j×G\u0016ë1¨ÐPo'ÝtøÒÖ«T*-}¹6=eU(3P-(\u0003o\u000eE\u0005jën\u001aèñ]Ò¬Ð\u0080L\u0004,Vûß\u0090pÝ\u0012\u008c";
                     int var8 = "(ZDÁ\u0003©ÉI\u008d\u001f\u0087°\u0091áB\u0014¸ß\u009eßXÀ\u0019\u0092@\u0089G\fàæ³j×G\u0016ë1¨ÐPo'ÝtøÒÖ«T*-}¹6=eU(3P-(\u0003o\u000eE\u0005jën\u001aèñ]Ò¬Ð\u0080L\u0004,Vûß\u0090pÝ\u0012\u008c"
                        .length();
                     char var5 = 24;
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 27544;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI",
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
                        byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 62477379282002L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 48948881945684L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 78037579283372L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "ÜQÛO\u0011\u0002ëåõyWj\u001f\u001aþK¾à#å\u001a*ÍÕø\u0003¬f\u0010¼`¨@ìQN³¤_\u0006?%\u001dôã\u0098Þ<¡\u0086]§e\u0010:åÎ¡Ä8\u009f1võ\u0099g.¨\u0004ÚMiK¶\u009c\u000bÌôP!Ïw®÷»e$9¯6\u0092\u001d\u0081W\u0013ç+";
                     int var8 = "ÜQÛO\u0011\u0002ëåõyWj\u001f\u001aþK¾à#å\u001a*ÍÕø\u0003¬f\u0010¼`¨@ìQN³¤_\u0006?%\u001dôã\u0098Þ<¡\u0086]§e\u0010:åÎ¡Ä8\u009f1võ\u0099g.¨\u0004ÚMiK¶\u009c\u000bÌôP!Ïw®÷»e$9¯6\u0092\u001d\u0081W\u0013ç+"
                        .length();
                     char var5 = ' ';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 11957;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll",
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
                        byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI$IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               Setting[] var11 = new Setting[]{
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
                  llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
                  lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
               };
               lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var11;
               return;
            }

            var4 = var5.charAt(var3);
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
   }

   public static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      @NotNull
      public static IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private static BooleanSetting lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      @NotNull
      private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      @NotNull
      private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      @NotNull
      private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      @NotNull
      private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      @NotNull
      private static Setting[] lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;

      private IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll() {
      }

      @NotNull
      public final BooleanSetting IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
         return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
         return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
         return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      @NotNull
      public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
         return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      @NotNull
      public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl() {
         return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      @NotNull
      public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll() {
         return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      @NotNull
      public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl() {
         return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl() {
         return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      }

      @NotNull
      public final Setting[] IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI() {
         return lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      }

      static {
         long var9 = 74481154538706L ^ 78897002776195L;
         Cipher var1;
         Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var2 = 1; var2 < 8; var2++) {
            var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var0 = new String[2];
         int var6 = 0;
         String var5 = "Ñ\u0014ô\u008e\r\u0011\u0004Ø¦X¹ÆN\t»×FU}¦\u0093\u0001\u001eµ\u0098\u0084\u008cp^\u008f*Ñ\u0019µe2\u0099â\u009eÁÔ·\u0003\u0007\u0006o\u000e±|\u009f\u00106·ÊÆÄÊ\u001fÇiR»Á¼\u0011f_\\{ª\u000es0«û²ÎäûÑoE\fçÖ1ÉÒ\bÙJK'ýÃ|¼";
         int var7 = "Ñ\u0014ô\u008e\r\u0011\u0004Ø¦X¹ÆN\t»×FU}¦\u0093\u0001\u001eµ\u0098\u0084\u008cp^\u008f*Ñ\u0019µe2\u0099â\u009eÁÔ·\u0003\u0007\u0006o\u000e±|\u009f\u00106·ÊÆÄÊ\u001fÇiR»Á¼\u0011f_\\{ª\u000es0«û²ÎäûÑoE\fçÖ1ÉÒ\bÙJK'ýÃ|¼"
            .length();
         char var4 = 'X';
         int var3 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
            String var14 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            byte var10001 = -1;
            var0[var6++] = var14;
            if ((var3 += var4) >= var7) {
               IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll();
               lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new BooleanSetting(var0[1], var0[0], false);
               IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 125073090493787L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1x = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 1339308993857L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 30176262587861L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "Æêå>\u0016\u0089¨PgªTÓ\u0011z¦/ç#!kÁÀJ\u0000q ÌÚ\u0015(k§@2®.c}©F½W´I0äB\u0016\u0001\u0015\u000et\u000eëI\u000f\u001bâr\u0012Ìâ\u0014\u0084_\u0017}Õ\u0004dá\u0013ØK¿ÖZøþç)W?ä\u0004\u001e\t5\u0099¸} \u008aÉ§r\u008c";
                     int var8 = "Æêå>\u0016\u0089¨PgªTÓ\u0011z¦/ç#!kÁÀJ\u0000q ÌÚ\u0015(k§@2®.c}©F½W´I0äB\u0016\u0001\u0015\u000et\u000eëI\u000f\u001bâr\u0012Ìâ\u0014\u0084_\u0017}Õ\u0004dá\u0013ØK¿ÖZøþç)W?ä\u0004\u001e\t5\u0099¸} \u008aÉ§r\u008c"
                        .length();
                     char var5 = ' ';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0x) {
                     int var1x = 0;
                     int var2;
                     char[] var3x = new char[var2 = var0x.length];

                     for (int var4x = 0; var4x < var2; var4x++) {
                        int var5x;
                        if ((var5x = 255 & var0x[var4x]) < 192) {
                           var3x[var1x++] = (char)var5x;
                        } else if (var5x < 224) {
                           char var6x = (char)((char)(var5x & 31) << 6);
                           byte var8x = var0x[++var4x];
                           var6x = (char)(var6x | (char)(var8x & 63));
                           var3x[var1x++] = var6x;
                        } else if (var4x < var2 - 2) {
                           char var12 = (char)((char)(var5x & 15) << '\f');
                           byte var9x = var0x[++var4x];
                           var12 = (char)(var12 | (char)(var9x & 63) << 6);
                           var9x = var0x[++var4x];
                           var12 = (char)(var12 | (char)(var9x & 63));
                           var3x[var1x++] = var12;
                        }
                     }

                     return new String(var3x, 0, var1x);
                  }

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0x, long var1x) {
                     int var5x = var0x ^ (int)(var1x & 32767L) ^ 6658;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5x] == null) {
                        Object[] var4x;
                        try {
                           Long var3x = Thread.currentThread().threadId();
                           var4x = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3x);
                           if (var4x == null) {
                              var4x = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3x, var4x);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll$lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI",
                              var10
                           );
                        }

                        byte[] var6x = new byte[8];
                        var6x[0] = (byte)(var1x >>> 56);

                        for (int var7x = 1; var7x < 8; var7x++) {
                           var6x[var7x] = (byte)(var1x << var7x * 8 >>> 56);
                        }

                        DESKeySpec var11 = new DESKeySpec(var6x);
                        SecretKey var8x = ((SecretKeyFactory)var4x[1]).generateSecret(var11);
                        ((Cipher)var4x[0]).init(2, var8x, (IvParameterSpec)var4x[2]);
                        byte[] var9x = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5x] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4x[0]).doFinal(var9x)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5x];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0x, MutableCallSite var1x, String var2, Object[] var3x
                  ) {
                     int var4x = (Integer)var3x[0];
                     long var5x = (Long)var3x[1];
                     String var7x = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4x, var5x);
                     MethodHandle var8x = MethodHandles.constant(String.class, var7x);
                     var1x.setTarget(MethodHandles.dropArguments(var8x, 0, int.class, long.class));
                     return var7x;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0x, String var1x, MethodType var2
                  ) {
                     MutableCallSite var3x = new MutableCallSite(var2);

                     try {
                        var3x.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
                                    .asCollector(Object[].class, var2.parameterCount()),
                                 0,
                                 var0x,
                                 var3x,
                                 var1x
                              ),
                              var2
                           )
                        );
                        return var3x;
                     } catch (Exception var5x) {
                        throw new RuntimeException(
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll$lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI"
                              + " : "
                              + var1x
                              + " : "
                              + var2.toString(),
                           var5x
                        );
                     }
                  }
               };
               lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 60194725133968L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 5217876707689L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 19775952523528L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "\u000bî<1AOH\u008aÃ\u008a\u0018\u0096\u00ad\u0011f¾ï<MBw(Ï2@ê\n\u0018£²\u0016\u0015\u00adÀ.\u0096È\u008c7£ö\u0092û¡\u0083~î^F0\u0010 \u001b\tX>\n\"\u0083£z¼ýáOÇæ\u009aï_$¨\n·§Å©2<Äs\u008e\u0082°ü,\u0090öm";
                     int var8 = "\u000bî<1AOH\u008aÃ\u008a\u0018\u0096\u00ad\u0011f¾ï<MBw(Ï2@ê\n\u0018£²\u0016\u0015\u00adÀ.\u0096È\u008c7£ö\u0092û¡\u0083~î^F0\u0010 \u001b\tX>\n\"\u0083£z¼ýáOÇæ\u009aï_$¨\n·§Å©2<Äs\u008e\u0082°ü,\u0090öm"
                        .length();
                     char var5 = 24;
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 17905;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl",
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
                        byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 113695112826694L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 63700138540901L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 41231737002044L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "VPC\u0091þ@_\u0081ÿ!X\u001d\u0085ìW\u0002ÀáÛ#v\nc\u0084H¸C\u0099Uïú\u0015Û\u00952ò ÑÂ\u009c\u0082\u009dòû¨°wÛ\u001f\u00164Û¢1fÓgal!»*hEù\u00988V\u001dS9z\f\u007f\u009aöéS\u009cië1\u009d\u0000_ÏÚ¼B\u0002\tò³L\u0013\u001d³";
                     int var8 = "VPC\u0091þ@_\u0081ÿ!X\u001d\u0085ìW\u0002ÀáÛ#v\nc\u0084H¸C\u0099Uïú\u0015Û\u00952ò ÑÂ\u009c\u0082\u009dòû¨°wÛ\u001f\u00164Û¢1fÓgal!»*hEù\u00988V\u001dS9z\f\u007f\u009aöéS\u009cië1\u009d\u0000_ÏÚ¼B\u0002\tò³L\u0013\u001d³"
                        .length();
                     char var5 = 24;
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 31699;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll",
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
                        byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 1320932022374L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 90372623829693L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 119096187644403L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "£Y@^$\u000boÿç\u0081£Ã\u0000\u0085\u00000\u0088V¥l}ÙÁÓ1\u0010ã\u00026\u0005\u000f\u0003@V(e¶7\u0098îo9x²mÏ\r.¹©\u009fMÌjJïÒá*M\u0088´SÁz\u008f\u0092íMsÊ>+F\u0019C\u000e¹£*dyÕo,¨\u0091ï§`r7/\u0019\u0018\u0018\u0001";
                     int var8 = "£Y@^$\u000boÿç\u0081£Ã\u0000\u0085\u00000\u0088V¥l}ÙÁÓ1\u0010ã\u00026\u0005\u000f\u0003@V(e¶7\u0098îo9x²mÏ\r.¹©\u009fMÌjJïÒá*M\u0088´SÁz\u008f\u0092íMsÊ>+F\u0019C\u000e¹£*dyÕo,¨\u0091ï§`r7/\u0019\u0018\u0018\u0001"
                        .length();
                     char var5 = ' ';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 10217;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
                        byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 22963791872412L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 117059823705811L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 10851130906359L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "\u0019\u0098ÿ\u0095hÅ\u0082vw3%¾\u001aöOÀ\u0017ö!\u0002_g4È@ù®ÙÆ\bç\u0011\u0006z\u001c\\\u0011K\u0000÷¬µ\u001a)õ\u00074\u008fì\tÞdx¤£Jå+\u0011^äÓâ¸øj\u0006\\\u008bÿ¶\u0096JÝ\u008a!f\u00ad\u0015\u0015\u0082EVfKÍdèf";
                     int var8 = "\u0019\u0098ÿ\u0095hÅ\u0082vw3%¾\u001aöOÀ\u0017ö!\u0002_g4È@ù®ÙÆ\bç\u0011\u0006z\u001c\\\u0011K\u0000÷¬µ\u001a)õ\u00074\u008fì\tÞdx¤£Jå+\u0011^äÓâ¸øj\u0006\\\u008bÿ¶\u0096JÝ\u008a!f\u00ad\u0015\u0015\u0082EVfKÍdèf"
                        .length();
                     char var5 = 24;
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 6280;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll$IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll",
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
                        byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll$IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 87549791390707L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 9663118882690L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 112236854682814L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = " Þ\u0004äÃvgÌÅ©\u001f¨\u000eý´$iÕ\u001a¤uk/=e{Ò0¬\u0099\u0006\u0085>à\n»\u00929$¥ð\u0012S\u009bco\u0098AÞ\u001ck'¤WàA[î]ExFô/µEUj¹{>\u0085#Â,\u0013$Î\\â©\u00807ëP2:¬\u0018Æ?Ëe\u008a)\u0089\u009cGPß\u000e\u0090\f\u0091\r2ó\u0093\f+\u000bª¾";
                     int var8 = " Þ\u0004äÃvgÌÅ©\u001f¨\u000eý´$iÕ\u001a¤uk/=e{Ò0¬\u0099\u0006\u0085>à\n»\u00929$¥ð\u0012S\u009bco\u0098AÞ\u001ck'¤WàA[î]ExFô/µEUj¹{>\u0085#Â,\u0013$Î\\â©\u00807ëP2:¬\u0018Æ?Ëe\u008a)\u0089\u009cGPß\u000e\u0090\f\u0091\r2ó\u0093\f+\u000bª¾"
                        .length();
                     char var5 = 'X';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 11461;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll",
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
                        byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll() {
                  private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 112278498883649L;
                  private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

                  {
                     long var1 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 119261631081662L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 83228704271282L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "öÖ\u0019ÛndµiJÿ\u0005ê\u009d6\u009fÆ.&ËO»Äç\u008at«Ù!%\u0099rr\u0085¥\u000fÛ\u00175Y\u0013\u007f±VÙY\b¨Ú F|L¾¥ùmd¨G´É]Ì3~»\u0092lGñ!à.L\u0085¥\u00ad¨Â'9";
                     int var8 = "öÖ\u0019ÛndµiJÿ\u0005ê\u009d6\u009fÆ.&ËO»Äç\u008at«Ù!%\u0099rr\u0085¥\u000fÛ\u00175Y\u0013\u007f±VÙY\b¨Ú F|L¾¥ùmd¨G´É]Ì3~»\u0092lGñ!à.L\u0085¥\u00ad¨Â'9"
                        .length();
                     char var5 = '0';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 1702;
                     if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI",
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
                        byte[] var9 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5].getBytes("ISO-8859-1");
                        lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll() {
                  private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 48302658190178L;
                  private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

                  {
                     long var1 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 89283500794268L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 78459434900062L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "=j÷T1!QH*\u0083ª:2\u008c·îâr©¯ô¼`\u0003\u0099UbxPäãÅF\u008a¶¼\u0014üc\u0010\u0017?\u0019·(_¦3ô¾{¤Å\u008a/\u009f\u0018ºÒ\u009aS.<Öù)C\u0013\u0099«öÑzE7|U¸IÓ_";
                     int var8 = "=j÷T1!QH*\u0083ª:2\u008c·îâr©¯ô¼`\u0003\u0099UbxPäãÅF\u008a¶¼\u0014üc\u0010\u0017?\u0019·(_¦3ô¾{¤Å\u008a/\u009f\u0018ºÒ\u009aS.<Öù)C\u0013\u0099«öÑzE7|U¸IÓ_"
                        .length();
                     char var5 = '8';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 4419;
                     if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI",
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
                        byte[] var9 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5].getBytes("ISO-8859-1");
                        lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll() {
                  private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 34177118263214L;
                  private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

                  {
                     long var1 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 71950324808496L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 129465954549631L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "`Ï\u008dC\u008fÌõW$÷ix\u009d\u0097\u0012o×ZøÌ\b÷\u009dÅ0óe1]\\\u009aÙ÷³]ï\u0098©¦]`U\u0019 E\u007fÊÝ\u0013þXFµ\u0099ÇJ6\u00864`ÄòéH§¶ãT©\u0003ßøA";
                     int var8 = "`Ï\u008dC\u008fÌõW$÷ix\u009d\u0097\u0012o×ZøÌ\b÷\u009dÅ0óe1]\\\u009aÙ÷³]ï\u0098©¦]`U\u0019 E\u007fÊÝ\u0013þXFµ\u0099ÇJ6\u00864`ÄòéH§¶ãT©\u0003ßøA"
                        .length();
                     char var5 = 24;
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 8607;
                     if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI",
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
                        byte[] var9 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5].getBytes("ISO-8859-1");
                        lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll() {
                  private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 63268170703609L;
                  private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

                  {
                     long var1 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 70469449373383L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 51075577928735L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "C±\u009a1|\u001eº:Z\b,Ú\u00adB\u009a÷i_+U{saa'HoY\u001dÖ\u007fô\u001eýÁ\n\u0012Ðås\u001bóËSÝy\\è;ã%¶AFv\u0004Ó\u009fRwOPm?\u0013aV¿Îÿ\u000b\b \u0098\u0092\u009e\u0082!/ðÞ].\u000e\u000fª\u0011þRÊû:Î\u0001\u001a3\u008d\u0098\u00934\u0003à@\u009a\u009d";
                     int var8 = "C±\u009a1|\u001eº:Z\b,Ú\u00adB\u009a÷i_+U{saa'HoY\u001dÖ\u007fô\u001eýÁ\n\u0012Ðås\u001bóËSÝy\\è;ã%¶AFv\u0004Ó\u009fRwOPm?\u0013aV¿Îÿ\u000b\b \u0098\u0092\u009e\u0082!/ðÞ].\u000e\u000fª\u0011þRÊû:Î\u0001\u001a3\u008d\u0098\u00934\u0003à@\u009a\u009d"
                        .length();
                     char var5 = 'H';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 20443;
                     if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll$llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII",
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
                        byte[] var9 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5].getBytes("ISO-8859-1");
                        lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll$llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 94128345186822L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 74719109353131L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 66156813692435L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "-\u008ev\u008cE¬Á·\u000bE)Æoÿfÿ=^\u007fµ\u0011¨@â\u001f2u%ì³4\u000f£&§:ïY/ú_\\\u0010a´kXN¡Nª;HÐÂ½p@*kY\\iàw{\"¸\u0005i\u009eï\u008d?å°ÄeÓPnÅ¶Í\u0096\u00838\u009fôÁ\u0019óâ\u0099#\u0094\u001cÿ?¦/\u0001`\u000fF\u008e¿¹\u009b¯íñ\u0017\u009ab\u0006\r\u0016\u0005wXýê\u0091\u001dÌ æòKàKabi\b·\u008eÜ\u0097{0¿q\u0005&\u0011\u0019Os¹\u009b\u0005\u001eoÉ©\u0096[ÞuN ¢\u0000\u008d¹\u008a[";
                     int var8 = "-\u008ev\u008cE¬Á·\u000bE)Æoÿfÿ=^\u007fµ\u0011¨@â\u001f2u%ì³4\u000f£&§:ïY/ú_\\\u0010a´kXN¡Nª;HÐÂ½p@*kY\\iàw{\"¸\u0005i\u009eï\u008d?å°ÄeÓPnÅ¶Í\u0096\u00838\u009fôÁ\u0019óâ\u0099#\u0094\u001cÿ?¦/\u0001`\u000fF\u008e¿¹\u009b¯íñ\u0017\u009ab\u0006\r\u0016\u0005wXýê\u0091\u001dÌ æòKàKabi\b·\u008eÜ\u0097{0¿q\u0005&\u0011\u0019Os¹\u009b\u0005\u001eoÉ©\u0096[ÞuN ¢\u0000\u008d¹\u008a["
                        .length();
                     char var5 = '8';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 24972;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll$lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII",
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
                        byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll$lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               Setting[] var11 = new Setting[]{
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
                  llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
                  lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl,
                  lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI,
                  lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl
               };
               lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var11;
               return;
            }

            var4 = var5.charAt(var3);
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
   }

   public static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
      @NotNull
      public static IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private static BooleanSetting lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      @NotNull
      private static Setting[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;

      private IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
      }

      @NotNull
      public final BooleanSetting IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
         return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
         return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
         return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
         return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl() {
         return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll() {
         return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      @NotNull
      public final Setting[] lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl() {
         return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      static {
         long var9 = 42571698371566L ^ 110032871655025L;
         Cipher var1;
         Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var2 = 1; var2 < 8; var2++) {
            var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var0 = new String[2];
         int var6 = 0;
         String var5 = "ÅcØW¶UA\u0090\u0013ÿôoÈKÉ<0$µ\u0085\u001c\u0089³xóD#:\u0099tñÞs\u008e\u008fÀ\u009b¼s`tZÌ¨wx³qª d\u001b\u0017\u0014\u001a%² ÖCÉZ\u0082±W";
         int var7 = "ÅcØW¶UA\u0090\u0013ÿôoÈKÉ<0$µ\u0085\u001c\u0089³xóD#:\u0099tñÞs\u008e\u008fÀ\u009b¼s`tZÌ¨wx³qª d\u001b\u0017\u0014\u001a%² ÖCÉZ\u0082±W"
            .length();
         char var4 = 16;
         int var3 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
            String var14 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            byte var10001 = -1;
            var0[var6++] = var14;
            if ((var3 += var4) >= var7) {
               IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll();
               lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new BooleanSetting(var0[0], var0[1], false);
               IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 12591283381893L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1x = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 30788673624311L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     long var3x = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                     String[] var5x = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        -1621373992949735860L, var3x
                     );

                     try {
                        boolean var10000x = IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                           .isToggled();
                        if (var5x != null) {
                           return var10000x;
                        }

                        if (!var10000x) {
                           return true;
                        }
                     } catch (MatchException var6x) {
                        throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           var6x, -1646831332587212106L, var3x
                        );
                     }

                     return false;
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 18944176088942L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "ÙÉ\u007f+('\u0011î\u008dÂ-;bn?Ño\u0083ÝÓ¹ü8´8*Ê°ÌóÝ{]É\u0084vË;8\u001bÓ\u008c[ä0¿Ó\u008f°Z_\u0093\u0097\u008d&(\u0089X\u0000ü\u00adatW«>Ö÷\u0094#B\u0080Í \u0017\u001cC%\u0001ù\u0091";
                     int var8 = "ÙÉ\u007f+('\u0011î\u008dÂ-;bn?Ño\u0083ÝÓ¹ü8´8*Ê°ÌóÝ{]É\u0084vË;8\u001bÓ\u008c[ä0¿Ó\u008f°Z_\u0093\u0097\u008d&(\u0089X\u0000ü\u00adatW«>Ö÷\u0094#B\u0080Í \u0017\u001cC%\u0001ù\u0091"
                        .length();
                     char var5 = 24;
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0x) {
                     return var0x;
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0x) {
                     int var1x = 0;
                     int var2;
                     char[] var3x = new char[var2 = var0x.length];

                     for (int var4x = 0; var4x < var2; var4x++) {
                        int var5x;
                        if ((var5x = 255 & var0x[var4x]) < 192) {
                           var3x[var1x++] = (char)var5x;
                        } else if (var5x < 224) {
                           char var6x = (char)((char)(var5x & 31) << 6);
                           byte var8x = var0x[++var4x];
                           var6x = (char)(var6x | (char)(var8x & 63));
                           var3x[var1x++] = var6x;
                        } else if (var4x < var2 - 2) {
                           char var12 = (char)((char)(var5x & 15) << '\f');
                           byte var9x = var0x[++var4x];
                           var12 = (char)(var12 | (char)(var9x & 63) << 6);
                           var9x = var0x[++var4x];
                           var12 = (char)(var12 | (char)(var9x & 63));
                           var3x[var1x++] = var12;
                        }
                     }

                     return new String(var3x, 0, var1x);
                  }

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0x, long var1x) {
                     int var5x = var0x ^ (int)(var1x & 32767L) ^ 10642;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5x] == null) {
                        Object[] var4x;
                        try {
                           Long var3x = Thread.currentThread().threadId();
                           var4x = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3x);
                           if (var4x == null) {
                              var4x = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3x, var4x);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI",
                              var10
                           );
                        }

                        byte[] var6x = new byte[8];
                        var6x[0] = (byte)(var1x >>> 56);

                        for (int var7x = 1; var7x < 8; var7x++) {
                           var6x[var7x] = (byte)(var1x << var7x * 8 >>> 56);
                        }

                        DESKeySpec var11 = new DESKeySpec(var6x);
                        SecretKey var8x = ((SecretKeyFactory)var4x[1]).generateSecret(var11);
                        ((Cipher)var4x[0]).init(2, var8x, (IvParameterSpec)var4x[2]);
                        byte[] var9x = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5x] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4x[0]).doFinal(var9x)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5x];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0x, MutableCallSite var1x, String var2, Object[] var3x
                  ) {
                     int var4x = (Integer)var3x[0];
                     long var5x = (Long)var3x[1];
                     String var7x = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4x, var5x);
                     MethodHandle var8x = MethodHandles.constant(String.class, var7x);
                     var1x.setTarget(MethodHandles.dropArguments(var8x, 0, int.class, long.class));
                     return var7x;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0x, String var1x, MethodType var2
                  ) {
                     MutableCallSite var3x = new MutableCallSite(var2);

                     try {
                        var3x.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
                                    .asCollector(Object[].class, var2.parameterCount()),
                                 0,
                                 var0x,
                                 var3x,
                                 var1x
                              ),
                              var2
                           )
                        );
                        return var3x;
                     } catch (Exception var5x) {
                        throw new RuntimeException(
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI"
                              + " : "
                              + var1x
                              + " : "
                              + var2.toString(),
                           var5x
                        );
                     }
                  }
               };
               lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 1179398653181L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 104557126703459L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     long var3 = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                     String[] var5 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        -1621373992949735860L, var3
                     );

                     try {
                        boolean var10000 = IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                           .isToggled();
                        if (var5 != null) {
                           return var10000;
                        }

                        if (!var10000) {
                           return true;
                        }
                     } catch (MatchException var6) {
                        throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           var6, -1681767645760866400L, var3
                        );
                     }

                     return false;
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 32274187386906L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "Rõ{î«ü\u0097y\u0093\u0096^\u0016¿æøn\u00add¶Æ\u008b¶^\u00858Þ÷Ïq-\u0081\u0097Ùæò\u0017\fr\u0080[ç¼\u000eI¼¦\u001eZ å\u00adj#öJpô]æ·\u009bH\u0006\u0001[ô\u001dìÄ^\u00adFeM«\u0019²j\u007fFã";
                     int var8 = "Rõ{î«ü\u0097y\u0093\u0096^\u0016¿æøn\u00add¶Æ\u008b¶^\u00858Þ÷Ïq-\u0081\u0097Ùæò\u0017\fr\u0080[ç¼\u000eI¼¦\u001eZ å\u00adj#öJpô]æ·\u009bH\u0006\u0001[ô\u001dìÄ^\u00adFeM«\u0019²j\u007fFã"
                        .length();
                     char var5 = '0';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
                     return var0;
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 8118;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI",
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
                        byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 93078035047461L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 68893648193475L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     long var3 = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                     String[] var5 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        -1621373992949735860L, var3
                     );

                     try {
                        boolean var10000 = IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                           .isToggled();
                        if (var5 != null) {
                           return var10000;
                        }

                        if (!var10000) {
                           return true;
                        }
                     } catch (MatchException var6) {
                        throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           var6, -1658162375145245961L, var3
                        );
                     }

                     return false;
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 31823072687028L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "0dE?T ý\u0017\u001a\"w]ÈìkäJ\u0005Wj\u0005Þ¦]Yã¤\u0018îG\u0081\u0082\u001d\u0018iø\u0014\nAõÄÆ÷96\u0096B\u0000\u0017ö2»\u0084\u0080\u001a+\u009c/»\u009b\u0083hWàË/\u008d@³¹\u0007k\b\u0097$Y-v°ÿ¯ãÔbå\u0099\u0004º é\u000e\u00056Èà\u009d\u0019Ç¤ï\u0006O¢§\n½4a\u009bíÁ\u0085k\u0007\u008cû\u009cí{¨ù";
                     int var8 = "0dE?T ý\u0017\u001a\"w]ÈìkäJ\u0005Wj\u0005Þ¦]Yã¤\u0018îG\u0081\u0082\u001d\u0018iø\u0014\nAõÄÆ÷96\u0096B\u0000\u0017ö2»\u0084\u0080\u001a+\u009c/»\u009b\u0083hWàË/\u008d@³¹\u0007k\b\u0097$Y-v°ÿ¯ãÔbå\u0099\u0004º é\u000e\u00056Èà\u009d\u0019Ç¤ï\u0006O¢§\n½4a\u009bíÁ\u0085k\u0007\u008cû\u009cí{¨ù"
                        .length();
                     char var5 = 'X';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
                     return var0;
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 14530;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll",
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
                        byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 75047701334961L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 64038596544834L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 8628888688248L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "\u0006íê.¬&3\u0089\u0017\u008cô\u001fy_Ó÷\u0093m[\u001a\u001aèÁÙ]¼¾õ\u0089Û¬Ü8V÷¤\u009cè×\u0085ìÀ£\u0087ÊQ\u0093Ç\\ \u001cÙ23)M+\u009b2\u000f'jR«ÀÖ«ïÒþ¤`Ø\u0094v\u007f\u0016\u0006ýßJ\u0004\fhþ\u001e¡\u0005U";
                     int var8 = "\u0006íê.¬&3\u0089\u0017\u008cô\u001fy_Ó÷\u0093m[\u001a\u001aèÁÙ]¼¾õ\u0089Û¬Ü8V÷¤\u009cè×\u0085ìÀ£\u0087ÊQ\u0093Ç\\ \u001cÙ23)M+\u009b2\u000f'jR«ÀÖ«ïÒþ¤`Ø\u0094v\u007f\u0016\u0006ýßJ\u0004\fhþ\u001e¡\u0005U"
                        .length();
                     char var5 = ' ';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 4025;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI",
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
                        byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 12096550916886L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 71340892837178L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 119991841962417L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "\u0000\u0099\u0093û\u0016DhV\u0090iô\u009f\fJ®[\u00ad·\r\u0004{ïÁÿ\u0002î\u0015\u009fèu'¤¸\u0089\u0096\u008a¬õ\u001dg\u001cjSô2ðMNÜØ0\u0007Ä\u0086Ô°\u0018Òôì\u0086\u0005r¢\u000b#/b7\u0001ä j\u0082lx@rÈ^ï";
                     int var8 = "\u0000\u0099\u0093û\u0016DhV\u0090iô\u009f\fJ®[\u00ad·\r\u0004{ïÁÿ\u0002î\u0015\u009fèu'¤¸\u0089\u0096\u008a¬õ\u001dg\u001cjSô2ðMNÜØ0\u0007Ä\u0086Ô°\u0018Òôì\u0086\u0005r¢\u000b#/b7\u0001ä j\u0082lx@rÈ^ï"
                        .length();
                     char var5 = '8';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 29816;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll",
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
                        byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 132750908580448L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 21654680422500L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 85708297666701L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "Sfçi\u008e\u0081B\u007f\u008e\u0015ßÆó\u0097FMQ\u0003uQ¯8\u0083\"\u0016C\u0014ÀxóàVX\u0092öDØ É\u008c¼\u0092Na\u00159äcÃ¿{ÝeqÒõSØK\u0016\u0095Æ(¢Ç×?Øá\u0088mt²;ì,%\tón\u008bB\u0012²6M`Ó>r´fÅC\u0087Äò\u009dA\u0004øfÕCrÒ%`²\u008aQ*óÂTøu\u009dåDõ";
                     int var8 = "Sfçi\u008e\u0081B\u007f\u008e\u0015ßÆó\u0097FMQ\u0003uQ¯8\u0083\"\u0016C\u0014ÀxóàVX\u0092öDØ É\u008c¼\u0092Na\u00159äcÃ¿{ÝeqÒõSØK\u0016\u0095Æ(¢Ç×?Øá\u0088mt²;ì,%\tón\u008bB\u0012²6M`Ó>r´fÅC\u0087Äò\u009dA\u0004øfÕCrÒ%`²\u008aQ*óÂTøu\u009dåDõ"
                        .length();
                     char var5 = ' ';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 5603;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll",
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
                        byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 46526533548199L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 54044672974877L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 138385132364839L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "\u0012\u0011Á¨\u0089\u001b\u0016\n,k®* ÑxzÜhw\u001c}LÜÚ)Ê\u0000àÏò\bssç»\u008e\u0084.îèñX®1íì\u009f\u009b cÜÅæ\u009dâ\u0088\u0015ijíõ±~³(\u0082m´\t÷\u008bÀ)(Ï[\u0087¨\u0006§\u0019Cqn+9\u0006uR@ÜF¿ãÖÒÉºµ0¦@ßáM";
                     int var8 = "\u0012\u0011Á¨\u0089\u001b\u0016\n,k®* ÑxzÜhw\u001c}LÜÚ)Ê\u0000àÏò\bssç»\u008e\u0084.îèñX®1íì\u009f\u009b cÜÅæ\u009dâ\u0088\u0015ijíõ±~³(\u0082m´\t÷\u008bÀ)(Ï[\u0087¨\u0006§\u0019Cqn+9\u0006uR@ÜF¿ãÖÒÉºµ0¦@ßáM"
                        .length();
                     char var5 = '@';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 16376;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
                        byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 107463718745890L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 58130893717249L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 69167310910486L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "¨E~=,Ò`µê-Í\u0000VÞ\u0014¡\u000bìú\u001b\u009eÜ?\u0099\u0095ÈìH I¿Ô÷ \u0085óó¡%YX\u0080µ\u008d\u0081'£J\u000fèb\rA,lª\u0085¿\u001b`Rg\f{(E\u0018²Æ%HuWÕ\u008a¿·+\u0013Û\u0006ï(þ¨ôìIuÐ\u0096ØbV\u0003K\u0095¿¤\u00050ás@ô";
                     int var8 = "¨E~=,Ò`µê-Í\u0000VÞ\u0014¡\u000bìú\u001b\u009eÜ?\u0099\u0095ÈìH I¿Ô÷ \u0085óó¡%YX\u0080µ\u008d\u0081'£J\u000fèb\rA,lª\u0085¿\u001b`Rg\f{(E\u0018²Æ%HuWÕ\u008a¿·+\u0013Û\u0006ï(þ¨ôìIuÐ\u0096ØbV\u0003K\u0095¿¤\u00050ás@ô"
                        .length();
                     char var5 = '@';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 12849;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII",
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
                        byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 51333865637953L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 82821232825039L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 136308160134868L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "\u0017ó*v\u0019òì'yþ¬²\u0084,Ü\u0081zçP\u0088Ýü\u0090è¦'\u007fvÛ½1V\u0085äá\u009c\u007fp'ÀXà\t.k\u009ck\u001b\ns\u0010¿U3\u008e¬àé`²È\u001d,\u0019÷Àt\u00865\u0011\u0087ôc÷FÌ´æ\u0092±\u000fìS¯kèP¿ì\u0012\r\u0089\nîÊ&\rq>¼\u0086t\u0086¢ÄõÕ¢\u0017OQ¥ö3\rPê¼ò?\u0016¤¸Þ¯)í\u0083 ";
                     int var8 = "\u0017ó*v\u0019òì'yþ¬²\u0084,Ü\u0081zçP\u0088Ýü\u0090è¦'\u007fvÛ½1V\u0085äá\u009c\u007fp'ÀXà\t.k\u009ck\u001b\ns\u0010¿U3\u008e¬àé`²È\u001d,\u0019÷Àt\u00865\u0011\u0087ôc÷FÌ´æ\u0092±\u000fìS¯kèP¿ì\u0012\r\u0089\nîÊ&\rq>¼\u0086t\u0086¢ÄõÕ¢\u0017OQ¥ö3\rPê¼ò?\u0016¤¸Þ¯)í\u0083 "
                        .length();
                     char var5 = '(';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 25144;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl",
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
                        byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               Setting[] var11 = new Setting[]{
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
                  llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
                  lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
               };
               lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var11;
               return;
            }

            var4 = var5.charAt(var3);
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
   }

   public static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      @NotNull
      public static IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private static BooleanSetting lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      @NotNull
      private static BooleanSetting IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      @NotNull
      private static Setting[] lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;

      private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final BooleanSetting IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
         return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final BooleanSetting IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
         return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @NotNull
      public final Setting[] IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
         return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      static {
         long var9 = 122031873743984L ^ 116781545618426L;
         Cipher var1;
         Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var2 = 1; var2 < 8; var2++) {
            var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var0 = new String[17];
         int var6 = 0;
         String var5 = "8£\u007fìg\u0012,ªñ\u0014\u001eGkßü\u00160òX_\u008f^ôr\u000e±\u009dé¸\u008e7ý\u008c(\u0091\fÁ£ÅJ=@²ÌÛ|ì¼Ç\u008c/.Ò8ºÕGM!p|\u0000²Hf@¦ÜM;±T\u0003\bUþo*\u0081=¡2à\u001a]»zn\u00036Í1}vºF\u0099V\u0010*¢k\u0019_C\u0098{Atz\u0083Û\u000727\u0089zá\u0011\u0004\u000eõxjÓ´Jé\u0082v\u0010åGtY\u0018$:\u001f \u0085\u0081$\u0000;LL\u0010Ê«z\f;£\u0086ºxÄíÆZÊ£ã@Õ6Å´R\u0006ï®Ý¡\"]\u0006!\u0094¶{Í\u001a \u0098\u0094ÅÛ¹ÙÝ xªÀ\u0095^\u0097ó[½²ò\u0004\u0095ueÙ¶\u009eU\u00034Û~Â¸5B\u008f\u0014\u009480\u0016Ìg»(ëu\u009eY5,\u0018,ÒE\u008c\u0007\u00069$5òb\u0010\u009a,Q÷åpoý\u0084\"ó§\f\u0013\u000fÄ\u009c\u008aî?Ý\u0010adè\u008f¡\u0006³6²jb¹Q]h¦@Õ6Å´R\u0006ï®¶¥µ\u001cËu(L\u000e¨yN\u009d\t²mSÇÀiÚ\u0095Åc¨ä\u0094 ¡t\u0014¶ÚSLzn¨WÏ¼Â¦ÌUálü8\u0007E\u0013÷\u0081\u00adÍ\u0010}\u0081GdÅ\u0095\u0000\u0004\u001côr\u0001'ûðk\u0010\u0019Úx\fààD3D±Îuá\u0091°Ý\bÃ\u009cÛ\u0087z\u0096wÌ8\u0093Õ\u008b\u008cá\u0011¢ß\n\u001f×þ1Ì@´ê`\u001fGbÐÄó¥gc\u0014HöBo]øÐwºÕ«Ã\u001dI\bc\u0085 \u009a¾67¹\u0094Ê¾ò(\u0010bÌæh«$Q\u0007\u001bWÃª\u0017oxÀ\u0018O\u0005e¾(/\u001a\u0084vÀÐ.\u009f\u0011\u008b÷\u009eIºë\u009eÄùA";
         int var7 = "8£\u007fìg\u0012,ªñ\u0014\u001eGkßü\u00160òX_\u008f^ôr\u000e±\u009dé¸\u008e7ý\u008c(\u0091\fÁ£ÅJ=@²ÌÛ|ì¼Ç\u008c/.Ò8ºÕGM!p|\u0000²Hf@¦ÜM;±T\u0003\bUþo*\u0081=¡2à\u001a]»zn\u00036Í1}vºF\u0099V\u0010*¢k\u0019_C\u0098{Atz\u0083Û\u000727\u0089zá\u0011\u0004\u000eõxjÓ´Jé\u0082v\u0010åGtY\u0018$:\u001f \u0085\u0081$\u0000;LL\u0010Ê«z\f;£\u0086ºxÄíÆZÊ£ã@Õ6Å´R\u0006ï®Ý¡\"]\u0006!\u0094¶{Í\u001a \u0098\u0094ÅÛ¹ÙÝ xªÀ\u0095^\u0097ó[½²ò\u0004\u0095ueÙ¶\u009eU\u00034Û~Â¸5B\u008f\u0014\u009480\u0016Ìg»(ëu\u009eY5,\u0018,ÒE\u008c\u0007\u00069$5òb\u0010\u009a,Q÷åpoý\u0084\"ó§\f\u0013\u000fÄ\u009c\u008aî?Ý\u0010adè\u008f¡\u0006³6²jb¹Q]h¦@Õ6Å´R\u0006ï®¶¥µ\u001cËu(L\u000e¨yN\u009d\t²mSÇÀiÚ\u0095Åc¨ä\u0094 ¡t\u0014¶ÚSLzn¨WÏ¼Â¦ÌUálü8\u0007E\u0013÷\u0081\u00adÍ\u0010}\u0081GdÅ\u0095\u0000\u0004\u001côr\u0001'ûðk\u0010\u0019Úx\fààD3D±Îuá\u0091°Ý\bÃ\u009cÛ\u0087z\u0096wÌ8\u0093Õ\u008b\u008cá\u0011¢ß\n\u001f×þ1Ì@´ê`\u001fGbÐÄó¥gc\u0014HöBo]øÐwºÕ«Ã\u001dI\bc\u0085 \u009a¾67¹\u0094Ê¾ò(\u0010bÌæh«$Q\u0007\u001bWÃª\u0017oxÀ\u0018O\u0005e¾(/\u001a\u0084vÀÐ.\u009f\u0011\u008b÷\u009eIºë\u009eÄùA"
            .length();
         char var4 = '\u0010';
         int var3 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
            String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            byte var10001 = -1;
            var0[var6++] = var23;
            if ((var3 += var4) >= var7) {
               var5 = "N2ÃÂQ\u0095ü\u0084Aæ\u0014-ðÐu\u0089\u0018\u0010\u008e\u009açq^íJL\u0084\u001c\u0005;\u0080Ö*Z&Ca\u0087R0\u001c";
               var7 = "N2ÃÂQ\u0095ü\u0084Aæ\u0014-ðÐu\u0089\u0018\u0010\u008e\u009açq^íJL\u0084\u001c\u0005;\u0080Ö*Z&Ca\u0087R0\u001c".length();
               var4 = '\u0010';
               var3 = -1;

               while (true) {
                  var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
                  String var25 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
                  boolean var21 = false;
                  var0[var6++] = var25;
                  if ((var3 += var4) >= var7) {
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI();
                     String var27 = var0[13];
                     String var28 = var0[1];
                     String[] var11 = new String[]{var0[9], var0[7], var0[4], var0[0], var0[11]};
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new me.octo.client.gui.clickgui.settings.impl.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
                        var27, var28, var11
                     );
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                        var0[10], var0[6], 0, 20, 6, 1
                     );
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new BooleanSetting(var0[3], var0[12], false);
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                        var0[14], var0[5], 0.0F, 1.0F, 0.0F, 0.025F, 0, 64, null
                     );
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
                        var0[16], var0[8], 0.0F, 1.0F, 0.0F, 0.025F, 0, 64, null
                     );
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new BooleanSetting(var0[15], var0[2], true);
                     Setting[] var19 = new Setting[]{
                        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                        IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                        lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                        IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
                        IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                        IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll
                     };
                     lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var19;
                     return;
                  }

                  var4 = var5.charAt(var3);
               }
            }

            var4 = var5.charAt(var3);
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
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      @NotNull
      public static IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private static BooleanSetting lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @NotNull
      private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      @NotNull
      private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      @NotNull
      private static me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      @NotNull
      private static Setting[] IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final BooleanSetting IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
         return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
         return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @NotNull
      public final me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
         return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      @NotNull
      public final Setting[] IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
         return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      static {
         long var9 = 55497907964123L ^ 77575588182933L;
         Cipher var1;
         Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var2 = 1; var2 < 8; var2++) {
            var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var0 = new String[2];
         int var6 = 0;
         String var5 = "_\u008d\u0095ygwv¢)Ü¯õ\u001c\u0018#å;z\u009b.\u0012~.\u008e\tb¢÷\u009b\u009ac;\u001fÚK¯\u0002$ûéÃ\u0098lF¶Ùr·\u0010.¨Bþ\u001a\u001e\u0018Ù2ËI\u0001×°#\u0006";
         int var7 = "_\u008d\u0095ygwv¢)Ü¯õ\u001c\u0018#å;z\u009b.\u0012~.\u008e\tb¢÷\u009b\u009ac;\u001fÚK¯\u0002$ûéÃ\u0098lF¶Ùr·\u0010.¨Bþ\u001a\u001e\u0018Ù2ËI\u0001×°#\u0006"
            .length();
         char var4 = '0';
         int var3 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
            String var14 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            byte var10001 = -1;
            var0[var6++] = var14;
            if ((var3 += var4) >= var7) {
               IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll();
               lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new BooleanSetting(var0[1], var0[0], false);
               IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll() {
                  private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 48098090599508L;
                  private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

                  {
                     long var1x = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 98862653463061L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     long var3x = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                     String[] var5x = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        -1621373992949735860L, var3x
                     );

                     try {
                        boolean var10000x = IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                           .isToggled();
                        if (var5x != null) {
                           return var10000x;
                        }

                        if (!var10000x) {
                           return true;
                        }
                     } catch (MatchException var6x) {
                        throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           var6x, -1615526223656600096L, var3x
                        );
                     }

                     return false;
                  }

                  static {
                     long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 133772384283467L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "«V:Æ\u0085m¬N°\u009aMµ\u009b-éw£y_è¨\u000eÁ¼ñ\u008c%S\f \u008eª¬e#\u0002ç¬3UJË\u0098\u0093 \u0016¤\u0093~\"¸ ©!ª\u009e\u0082\tX\u000fÒ1ê÷\">\u0083qù\u0094Uh\u0088(á(4[\u0096z\u0010l?N\nm%¡»R{\u00ad\u0092_\u0001¸Î";
                     int var8 = "«V:Æ\u0085m¬N°\u009aMµ\u009b-éw£y_è¨\u000eÁ¼ñ\u008c%S\f \u008eª¬e#\u0002ç¬3UJË\u0098\u0093 \u0016¤\u0093~\"¸ ©!ª\u009e\u0082\tX\u000fÒ1ê÷\">\u0083qù\u0094Uh\u0088(á(4[\u0096z\u0010l?N\nm%¡»R{\u00ad\u0092_\u0001¸Î"
                        .length();
                     char var5 = 'P';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0x) {
                     return var0x;
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0x) {
                     int var1x = 0;
                     int var2;
                     char[] var3x = new char[var2 = var0x.length];

                     for (int var4x = 0; var4x < var2; var4x++) {
                        int var5x;
                        if ((var5x = 255 & var0x[var4x]) < 192) {
                           var3x[var1x++] = (char)var5x;
                        } else if (var5x < 224) {
                           char var6x = (char)((char)(var5x & 31) << 6);
                           byte var8x = var0x[++var4x];
                           var6x = (char)(var6x | (char)(var8x & 63));
                           var3x[var1x++] = var6x;
                        } else if (var4x < var2 - 2) {
                           char var12 = (char)((char)(var5x & 15) << '\f');
                           byte var9x = var0x[++var4x];
                           var12 = (char)(var12 | (char)(var9x & 63) << 6);
                           var9x = var0x[++var4x];
                           var12 = (char)(var12 | (char)(var9x & 63));
                           var3x[var1x++] = var12;
                        }
                     }

                     return new String(var3x, 0, var1x);
                  }

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0x, long var1x) {
                     int var5x = var0x ^ (int)(var1x & 32767L) ^ 12875;
                     if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x] == null) {
                        Object[] var4x;
                        try {
                           Long var3x = Thread.currentThread().threadId();
                           var4x = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3x);
                           if (var4x == null) {
                              var4x = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3x, var4x);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll",
                              var10
                           );
                        }

                        byte[] var6x = new byte[8];
                        var6x[0] = (byte)(var1x >>> 56);

                        for (int var7x = 1; var7x < 8; var7x++) {
                           var6x[var7x] = (byte)(var1x << var7x * 8 >>> 56);
                        }

                        DESKeySpec var11 = new DESKeySpec(var6x);
                        SecretKey var8x = ((SecretKeyFactory)var4x[1]).generateSecret(var11);
                        ((Cipher)var4x[0]).init(2, var8x, (IvParameterSpec)var4x[2]);
                        byte[] var9x = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5x].getBytes("ISO-8859-1");
                        lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4x[0]).doFinal(var9x)
                        );
                     }

                     return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0x, MutableCallSite var1x, String var2, Object[] var3x
                  ) {
                     int var4x = (Integer)var3x[0];
                     long var5x = (Long)var3x[1];
                     String var7x = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4x, var5x);
                     MethodHandle var8x = MethodHandles.constant(String.class, var7x);
                     var1x.setTarget(MethodHandles.dropArguments(var8x, 0, int.class, long.class));
                     return var7x;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0x, String var1x, MethodType var2
                  ) {
                     MutableCallSite var3x = new MutableCallSite(var2);

                     try {
                        var3x.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
                                    .asCollector(Object[].class, var2.parameterCount()),
                                 0,
                                 var0x,
                                 var3x,
                                 var1x
                              ),
                              var2
                           )
                        );
                        return var3x;
                     } catch (Exception var5x) {
                        throw new RuntimeException(
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll"
                              + " : "
                              + var1x
                              + " : "
                              + var2.toString(),
                           var5x
                        );
                     }
                  }
               };
               lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 134814928521877L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 60337298873879L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     long var3 = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                     String[] var5 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        -1621373992949735860L, var3
                     );

                     try {
                        boolean var10000 = IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                           .isToggled();
                        if (var5 != null) {
                           return var10000;
                        }

                        if (!var10000) {
                           return true;
                        }
                     } catch (MatchException var6) {
                        throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           var6, -1647945297959504109L, var3
                        );
                     }

                     return false;
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 123798012384375L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "'¦Ç©Óï\f¸¿WsaâÞ\u0093A\u0081\u0093\u0086\n\u009føCq2&65Á-\u008dx\u0002W\u008d\u008c\u0081\u0096\u0090ØçÄ\u0087ýÃ4¡´\u0017ôfW\"\u008e;\u0096Ê^ì\u0089¤¦s(0¶ÆÈÐãÙV8\r\u000b!;\u0081\u0087\u0004¿\u0086W\u008eÚë\u0094· Vú\u0098\\\u001d'\u007f¿íßNµZ\u001a\u0087\u000b8ApfÖ9¯/n_\u0003\r4ûÖ¯";
                     int var8 = "'¦Ç©Óï\f¸¿WsaâÞ\u0093A\u0081\u0093\u0086\n\u009føCq2&65Á-\u008dx\u0002W\u008d\u008c\u0081\u0096\u0090ØçÄ\u0087ýÃ4¡´\u0017ôfW\"\u008e;\u0096Ê^ì\u0089¤¦s(0¶ÆÈÐãÙV8\r\u000b!;\u0081\u0087\u0004¿\u0086W\u008eÚë\u0094· Vú\u0098\\\u001d'\u007f¿íßNµZ\u001a\u0087\u000b8ApfÖ9¯/n_\u0003\r4ûÖ¯"
                        .length();
                     char var5 = 'X';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
                     return var0;
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 12410;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI",
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
                        byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll() {
                  private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 41719778981294L;
                  private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

                  {
                     long var1 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 88718186659621L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 15682555973906L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "Ç2êÐ'\u0019\fx$ÀõÕr{]9lúÈ\n\u0081®¨\u008eP<\u0093\u000f\u007fmç*ÎÛg4ÙõBrÿ ÕwÐ\u0015\tL¯8\u0095\u009dÓ#\u0083a\u0098\u0096\u0000Pí±MÊtþ\u008cdY·K\u0010<\u0004\u0097_\u008a\u0096\u008aOKU6êY·pQ#¼ Ü]\u0084!wsÕRß4Â\u001aE?";
                     int var8 = "Ç2êÐ'\u0019\fx$ÀõÕr{]9lúÈ\n\u0081®¨\u008eP<\u0093\u000f\u007fmç*ÎÛg4ÙõBrÿ ÕwÐ\u0015\tL¯8\u0095\u009dÓ#\u0083a\u0098\u0096\u0000Pí±MÊtþ\u008cdY·K\u0010<\u0004\u0097_\u008a\u0096\u008aOKU6êY·pQ#¼ Ü]\u0084!wsÕRß4Â\u001aE?"
                        .length();
                     char var5 = 24;
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 11406;
                     if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll",
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
                        byte[] var9 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5].getBytes("ISO-8859-1");
                        lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 39000714705641L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 30978271716739L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 125141341617338L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "Ë\u009c×DH\u001eÓ0ô:Û,un³ä{Ëv\u008a\u009cá\u0092Ü\u0017\u009a*(\u0004e\r\u000e§ÜÓ\u00935ËR¢hÛüB¡\u0090ó\\uzâ§>6±®]@7À9a6¥ß²iÇ\u00926:\u0097Ý6ÿ\u001d/UUxÇ*yV\t\u008cètÎ³×Ô,t2{÷YÒâ%ó²»^\u0099Ùo>$\r_H®àVâ/Þ\u008a´\u0090²\u0003@·±H¥\u009e\u0007çAóiR¸s±\u001d|bØ:,";
                     int var8 = "Ë\u009c×DH\u001eÓ0ô:Û,un³ä{Ëv\u008a\u009cá\u0092Ü\u0017\u009a*(\u0004e\r\u000e§ÜÓ\u00935ËR¢hÛüB¡\u0090ó\\uzâ§>6±®]@7À9a6¥ß²iÇ\u00926:\u0097Ý6ÿ\u001d/UUxÇ*yV\t\u008cètÎ³×Ô,t2{÷YÒâ%ó²»^\u0099Ùo>$\r_H®àVâ/Þ\u008a´\u0090²\u0003@·±H¥\u009e\u0007çAóiR¸s±\u001d|bØ:,"
                        .length();
                     char var5 = '(';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 11022;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI",
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
                        byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll() {
                  private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 111674812926763L;
                  private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

                  {
                     long var1 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 106023540317437L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 118824521312045L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "H\u0085\u0005´»£ÊÝY/\u0002ê\u0002Î[\u0088ì\u0091\u0002L<\u0087-\u0090¨òâÑ¬6AùPËø<T©\b7{úº\u009cÄ\u0006¾l\u001d\u0083ïï¿obA\u009aV\u0093\\¼Nõ\u001ac\u0017guZ\u0098øÑ\"sùÔìÝÔ[×sÛ_êT\u0000ðkËf©\u0097Ö\n£¸Â=vK|¾7Z\u0001\r9D\u001dJA¹";
                     int var8 = "H\u0085\u0005´»£ÊÝY/\u0002ê\u0002Î[\u0088ì\u0091\u0002L<\u0087-\u0090¨òâÑ¬6AùPËø<T©\b7{úº\u009cÄ\u0006¾l\u001d\u0083ïï¿obA\u009aV\u0093\\¼Nõ\u001ac\u0017guZ\u0098øÑ\"sùÔìÝÔ[×sÛ_êT\u0000ðkËf©\u0097Ö\n£¸Â=vK|¾7Z\u0001\r9D\u001dJA¹"
                        .length();
                     char var5 = ' ';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 27986;
                     if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI",
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
                        byte[] var9 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5].getBytes("ISO-8859-1");
                        lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new me.octo.client.gui.clickgui.settings.impl.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll() {
                  private static long lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = 2828252863218L;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static String[] lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
                  private static Map lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = new HashMap(13);

                  {
                     long var1 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 26616276461802L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl ^ 107653646175501L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "Ï,6\u0096-\u0083fê{º9â.\u008eo³àÁ\u0099È\u008fsF\u0090yë÷Øð\u0014H\u00ad\u0091î\u009fÅO\u0005^ëó÷y\u0018ívDs\u0011åh\u0086\u0097'´a\\¬ñ>¯\u0091¦a0¥Å>Ùdùë\u0002QÉÉ©ÄêÑ¯Z\u0003¾\u001e\u0001\u0085\u008c\u0086\u000eó\u0094\u00126Î\n(4@x¶cßÆ\r ¯<¸¢¢o\nW-Káµu¹A\u008fL\u001b\u008d(kh\u00968>\\\u0098\u001fzZð";
                     int var8 = "Ï,6\u0096-\u0083fê{º9â.\u008eo³àÁ\u0099È\u008fsF\u0090yë÷Øð\u0014H\u00ad\u0091î\u009fÅO\u0005^ëó÷y\u0018ívDs\u0011åh\u0086\u0097'´a\\¬ñ>¯\u0091¦a0¥Å>Ùdùë\u0002QÉÉ©ÄêÑ¯Z\u0003¾\u001e\u0001\u0085\u008c\u0086\u000eó\u0094\u00126Î\n(4@x¶cßÆ\r ¯<¸¢¢o\nW-Káµu¹A\u008fL\u001b\u008d(kh\u00968>\\\u0098\u001fzZð"
                        .length();
                     char var5 = '`';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var9;
                           lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 7211;
                     if (lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll",
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
                        byte[] var9 = lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5].getBytes("ISO-8859-1");
                        lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               Setting[] var11 = new Setting[]{
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll
               };
               IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = var11;
               return;
            }

            var4 = var5.charAt(var3);
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
   }

   public static final class llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll {
      @NotNull
      public static IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private static BooleanSetting lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      @NotNull
      private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      @NotNull
      private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      @NotNull
      private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      @NotNull
      private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      @NotNull
      private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      @NotNull
      private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      @NotNull
      private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      @NotNull
      private static lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      @NotNull
      private static Setting[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;

      private llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll() {
      }

      @NotNull
      public final BooleanSetting IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      @NotNull
      public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      @NotNull
      public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
         return IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @NotNull
      public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
         return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @NotNull
      public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
         return lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      @NotNull
      public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
         return IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      @NotNull
      public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl() {
         return llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      @NotNull
      public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll() {
         return lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      @NotNull
      public final Setting[] lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl() {
         return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      static {
         long var9 = 1552487528281L ^ 50512880192376L;
         Cipher var1;
         Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var2 = 1; var2 < 8; var2++) {
            var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var0 = new String[2];
         int var6 = 0;
         String var5 = "\u0080ý\u000bºWe\u009câÏß\u0093l\u0096¯¡\u00970s,Ñ3\u0083\u009d×\u009dü>+úß\\I±¥\u0000ò\\Ã\u0004²´ÒXÏ3w\u0097db\u001e\u0081Z^Ù?\u0013c8Æõ\u0081\u0011úô\u0002";
         int var7 = "\u0080ý\u000bºWe\u009câÏß\u0093l\u0096¯¡\u00970s,Ñ3\u0083\u009d×\u009dü>+úß\\I±¥\u0000ò\\Ã\u0004²´ÒXÏ3w\u0097db\u001e\u0081Z^Ù?\u0013c8Æõ\u0081\u0011úô\u0002"
            .length();
         char var4 = 16;
         int var3 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
            String var14 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            byte var10001 = -1;
            var0[var6++] = var14;
            if ((var3 += var4) >= var7) {
               IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll();
               lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new BooleanSetting(var0[0], var0[1], false);
               IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll() {
                  private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 96335750787008L;
                  private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

                  {
                     long var1x = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 64913585698872L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     long var3x = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                     String[] var5x = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        -1621373992949735860L, var3x
                     );

                     try {
                        boolean var10000x = IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                           .isToggled();
                        if (var5x != null) {
                           return var10000x;
                        }

                        if (!var10000x) {
                           return true;
                        }
                     } catch (MatchException var6x) {
                        throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           var6x, -1724255778668730797L, var3x
                        );
                     }

                     return false;
                  }

                  static {
                     long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 76562849964270L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "i ½\u0096\u0017õo:\u0012Ù\u000e\u0099¨{ýÈ\u00ad\u0092]xJ\u009cqª\u0084\u009a\u0005ÙKï\u001920Â\u0081U\u0084Î\u008dW6¼fÞB°\b\u007f4\u008eOâàW;PVsë\u0099\u0094ñáé# · \u0015=¬oÏlÚÏ\u0096é\u007f\u0095Ò";
                     int var8 = "i ½\u0096\u0017õo:\u0012Ù\u000e\u0099¨{ýÈ\u00ad\u0092]xJ\u009cqª\u0084\u009a\u0005ÙKï\u001920Â\u0081U\u0084Î\u008dW6¼fÞB°\b\u007f4\u008eOâàW;PVsë\u0099\u0094ñáé# · \u0015=¬oÏlÚÏ\u0096é\u007f\u0095Ò"
                        .length();
                     char var5 = ' ';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0x) {
                     return var0x;
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0x) {
                     int var1x = 0;
                     int var2;
                     char[] var3x = new char[var2 = var0x.length];

                     for (int var4x = 0; var4x < var2; var4x++) {
                        int var5x;
                        if ((var5x = 255 & var0x[var4x]) < 192) {
                           var3x[var1x++] = (char)var5x;
                        } else if (var5x < 224) {
                           char var6x = (char)((char)(var5x & 31) << 6);
                           byte var8x = var0x[++var4x];
                           var6x = (char)(var6x | (char)(var8x & 63));
                           var3x[var1x++] = var6x;
                        } else if (var4x < var2 - 2) {
                           char var12 = (char)((char)(var5x & 15) << '\f');
                           byte var9x = var0x[++var4x];
                           var12 = (char)(var12 | (char)(var9x & 63) << 6);
                           var9x = var0x[++var4x];
                           var12 = (char)(var12 | (char)(var9x & 63));
                           var3x[var1x++] = var12;
                        }
                     }

                     return new String(var3x, 0, var1x);
                  }

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0x, long var1x) {
                     int var5x = var0x ^ (int)(var1x & 32767L) ^ 490;
                     if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x] == null) {
                        Object[] var4x;
                        try {
                           Long var3x = Thread.currentThread().threadId();
                           var4x = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3x);
                           if (var4x == null) {
                              var4x = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3x, var4x);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI",
                              var10
                           );
                        }

                        byte[] var6x = new byte[8];
                        var6x[0] = (byte)(var1x >>> 56);

                        for (int var7x = 1; var7x < 8; var7x++) {
                           var6x[var7x] = (byte)(var1x << var7x * 8 >>> 56);
                        }

                        DESKeySpec var11 = new DESKeySpec(var6x);
                        SecretKey var8x = ((SecretKeyFactory)var4x[1]).generateSecret(var11);
                        ((Cipher)var4x[0]).init(2, var8x, (IvParameterSpec)var4x[2]);
                        byte[] var9x = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5x].getBytes("ISO-8859-1");
                        lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4x[0]).doFinal(var9x)
                        );
                     }

                     return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5x];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0x, MutableCallSite var1x, String var2, Object[] var3x
                  ) {
                     int var4x = (Integer)var3x[0];
                     long var5x = (Long)var3x[1];
                     String var7x = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4x, var5x);
                     MethodHandle var8x = MethodHandles.constant(String.class, var7x);
                     var1x.setTarget(MethodHandles.dropArguments(var8x, 0, int.class, long.class));
                     return var7x;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0x, String var1x, MethodType var2
                  ) {
                     MutableCallSite var3x = new MutableCallSite(var2);

                     try {
                        var3x.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
                                    .asCollector(Object[].class, var2.parameterCount()),
                                 0,
                                 var0x,
                                 var3x,
                                 var1x
                              ),
                              var2
                           )
                        );
                        return var3x;
                     } catch (Exception var5x) {
                        throw new RuntimeException(
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI"
                              + " : "
                              + var1x
                              + " : "
                              + var2.toString(),
                           var5x
                        );
                     }
                  }
               };
               lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll() {
                  private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 61652446720488L;
                  private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

                  {
                     long var1 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 113847251429760L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     long var3 = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                     String[] var5 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        -1621373992949735860L, var3
                     );

                     try {
                        boolean var10000 = IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                           .isToggled();
                        if (var5 != null) {
                           return var10000;
                        }

                        if (!var10000) {
                           return true;
                        }
                     } catch (MatchException var6) {
                        throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           var6, -1655798832906590927L, var3
                        );
                     }

                     return false;
                  }

                  static {
                     long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 48166941583006L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "ÿÓ7_\u0092\u0011£5tò\u0019\u0096/x\u0082ÝX±YèDx\u000b\t\u0018\u0002jUæJ\u001cËN:ú\u0092+\u001cy¢Ã'ß\u009aíæ+\u0017\u000f";
                     int var8 = "ÿÓ7_\u0092\u0011£5tò\u0019\u0096/x\u0082ÝX±YèDx\u000b\t\u0018\u0002jUæJ\u001cËN:ú\u0092+\u001cy¢Ã'ß\u009aíæ+\u0017\u000f"
                        .length();
                     char var5 = 24;
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
                     return var0;
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 11966;
                     if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll",
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
                        byte[] var9 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5].getBytes("ISO-8859-1");
                        lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll() {
                  private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 36549590555070L;
                  private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

                  {
                     long var1 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 64642476157487L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     long var3 = (long)var1 << 32 | (long)var2 << 32 >>> 32;
                     String[] var5 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        -1621373992949735860L, var3
                     );

                     try {
                        boolean var10000 = IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                           .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                           .isToggled();
                        if (var5 != null) {
                           return var10000;
                        }

                        if (!var10000) {
                           return true;
                        }
                     } catch (MatchException var6) {
                        throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                           var6, -1658755669404602817L, var3
                        );
                     }

                     return false;
                  }

                  static {
                     long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 55998056788247L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "ÕF\u0092/>\b\u007fdÁx\u001d66»§\u009cg¢\u008aéò¯c\u00adH\u0080\u0096ÌµäXÌ(Ë\u001cW\u008cÄq\u008e^UI\u00800\u0003ltñ\u008e\u0000¥ª\u008c\u001düÎÒ;ÿ¶h¹?\f\fLFâÃÑsê";
                     int var8 = "ÕF\u0092/>\b\u007fdÁx\u001d66»§\u009cg¢\u008aéò¯c\u00adH\u0080\u0096ÌµäXÌ(Ë\u001cW\u008cÄq\u008e^UI\u00800\u0003ltñ\u008e\u0000¥ª\u008c\u001düÎÒ;ÿ¶h¹?\f\fLFâÃÑsê"
                        .length();
                     char var5 = ' ';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
                     return var0;
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 28289;
                     if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll",
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
                        byte[] var9 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5].getBytes("ISO-8859-1");
                        lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll() {
                  private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 107752044981594L;
                  private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

                  {
                     long var1 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 137247598272086L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 24864431497324L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "=*\u0092v\u0083MKW\u0093É5\u00950ùUÁA¹Ø\u001få\u0002\u0086\u000fÓ<o%y:b(;å\u008e§¹©·p\u0018t,Ð·Êt\u001aR\u0093¬ßN\u0085úeòï¤\u0007Ä\u00845²ð";
                     int var8 = "=*\u0092v\u0083MKW\u0093É5\u00950ùUÁA¹Ø\u001få\u0002\u0086\u000fÓ<o%y:b(;å\u008e§¹©·p\u0018t,Ð·Êt\u001aR\u0093¬ßN\u0085úeòï¤\u0007Ä\u00845²ð"
                        .length();
                     char var5 = '(';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 8689;
                     if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI",
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
                        byte[] var9 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5].getBytes("ISO-8859-1");
                        lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll() {
                  private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 65325260093394L;
                  private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

                  {
                     long var1 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 468144139643L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 92636751114048L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "x\u0015<\u009a+ðß\r(\u0098·f\u0018\u0082`ãL,·õEª1« z\n\u0089õ\u0013¶\u0001¦Yù\u008eÕèwí Ëý\u0098ñ>A\u009e\u0081ýfÂë\u0097gýfÝ\u0090=®DÝµc-\"p\u009d\u0007$àd";
                     int var8 = "x\u0015<\u009a+ðß\r(\u0098·f\u0018\u0082`ãL,·õEª1« z\n\u0089õ\u0013¶\u0001¦Yù\u008eÕèwí Ëý\u0098ñ>A\u009e\u0081ýfÂë\u0097gýfÝ\u0090=®DÝµc-\"p\u009d\u0007$àd"
                        .length();
                     char var5 = '(';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 30209;
                     if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll",
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
                        byte[] var9 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5].getBytes("ISO-8859-1");
                        lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll() {
                  private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 38960058850155L;
                  private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

                  {
                     long var1 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 128740697712614L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 121219809678457L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "²¼\u008aHë\nç&r\u0080e4é\u0013,-b\u0010Â \u0018¾ã\u0098úkÜýr\u0084;åU\u008býÝ\u009aÊ¦L\u0018\u001fíFc´\nØ\tZ\u0006\u0090p\u0010)\u008b\u00adÐ%\u001díî\u001dñÓ";
                     int var8 = "²¼\u008aHë\nç&r\u0080e4é\u0013,-b\u0010Â \u0018¾ã\u0098úkÜýr\u0084;åU\u008býÝ\u009aÊ¦L\u0018\u001fíFc´\nØ\tZ\u0006\u0090p\u0010)\u008b\u00adÐ%\u001díî\u001dñÓ"
                        .length();
                     char var5 = '(';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 31429;
                     if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI",
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
                        byte[] var9 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5].getBytes("ISO-8859-1");
                        lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll() {
                  private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 90022952607402L;
                  private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

                  {
                     long var1 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 14287554564073L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 19913264369998L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "k\u008fþ0\u009e\u0082zµ5ë=2P°q\u0018Àa\u0088_ïÈ\u0017ë«~Úc>\u0091,\u001fJXK_\\ñüT\u0090\u0005\u008awà\u0005õ°(ç.Ú\u0082*m[ùÿz 0\u0001eÃ\u0013o»1\u0091\u008e \u001a!\u0005pàv\u0083\u0016\u0088\u0018\u0015j\u0005ðýC\u000eì";
                     int var8 = "k\u008fþ0\u009e\u0082zµ5ë=2P°q\u0018Àa\u0088_ïÈ\u0017ë«~Úc>\u0091,\u001fJXK_\\ñüT\u0090\u0005\u008awà\u0005õ°(ç.Ú\u0082*m[ùÿz 0\u0001eÃ\u0013o»1\u0091\u008e \u001a!\u0005pàv\u0083\u0016\u0088\u0018\u0015j\u0005ðýC\u000eì"
                        .length();
                     char var5 = '0';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 31447;
                     if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl",
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
                        byte[] var9 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5].getBytes("ISO-8859-1");
                        lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll() {
                  private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 59615199026718L;
                  private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

                  {
                     long var1 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 90420466854065L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 79669941335822L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "`rD%0e\u0098©ü\u00942o)Ê³È`d\u0087\u0089'ò>ä@Ê£È¥¦´Ý\u007f@ú\u0014\u0003]«\u00910=¸ô?î61úLý\u0090ã\u001c\u0087\u009e¶ÅÒ\u0016îèá¼dá;\u0012\u0081µòÎD\u008bv¿D~Kl\u009c&zÊ£Ð\u0090\u0093k";
                     int var8 = "`rD%0e\u0098©ü\u00942o)Ê³È`d\u0087\u0089'ò>ä@Ê£È¥¦´Ý\u007f@ú\u0014\u0003]«\u00910=¸ô?î61úLý\u0090ã\u001c\u0087\u009e¶ÅÒ\u0016îèá¼dá;\u0012\u0081µòÎD\u008bv¿D~Kl\u009c&zÊ£Ð\u0090\u0093k"
                        .length();
                     char var5 = '(';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 13898;
                     if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII",
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
                        byte[] var9 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5].getBytes("ISO-8859-1");
                        lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$llIlllIlIIIIlIlIIIIlIIIlIIIIIIlIlIIIIlIllIllllllIlIIlIIIlllIIlllIIllIIIIllIllllIlIIII"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll() {
                  private static long llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 70105888940507L;
                  private static String[] lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
                  private static String[] lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
                  private static Map lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = new HashMap(13);

                  {
                     long var1 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 94365030519432L;
                  }

                  @Override
                  public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1, int var2) {
                     return IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                        .isToggled();
                  }

                  static {
                     long var0 = llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI ^ 122184600577383L;
                     Cipher var2;
                     Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                     SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                     byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var3 = 1; var3 < 8; var3++) {
                        var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
                     }

                     var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     String[] var9 = new String[2];
                     int var7 = 0;
                     String var6 = "7Ù£/|\u001fÍÚÿ¼°\u0018\u0091©Ï{è\u001c\u0011{$\u0093èó¼$h\u0089\u009ft½\u0083\bØià\u000fºW}(!\u00adéñ4·ý\u001a×\u009d\u0085*h*ðDø\u0015Öº\u0099\u0080dÅ÷;\b\\nÒ\u009dmoän\u0084å5\u000e\u0002";
                     int var8 = "7Ù£/|\u001fÍÚÿ¼°\u0018\u0091©Ï{è\u001c\u0011{$\u0093èó¼$h\u0089\u009ft½\u0083\bØià\u000fºW}(!\u00adéñ4·ý\u001a×\u009d\u0085*h*ðDø\u0015Öº\u0099\u0080dÅ÷;\b\\nÒ\u009dmoän\u0084å5\u000e\u0002"
                        .length();
                     char var5 = '(';
                     int var4 = -1;

                     while (true) {
                        byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                        String var13 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var10).intern();
                        byte var10001 = -1;
                        var9[var7++] = var13;
                        if ((var4 += var5) >= var8) {
                           lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = var9;
                           lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = new String[2];
                           return;
                        }

                        var5 = var6.charAt(var4);
                     }
                  }

                  private static String IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(byte[] var0) {
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

                  private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var0, long var1) {
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 10784;
                     if (lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] == null) {
                        Object[] var4;
                        try {
                           Long var3 = Thread.currentThread().threadId();
                           var4 = (Object[])lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.get(var3);
                           if (var4 == null) {
                              var4 = new Object[]{
                                 Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])
                              };
                              lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl.put(var3, var4);
                           }
                        } catch (Exception var10) {
                           throw new RuntimeException(
                              "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll",
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
                        byte[] var9 = lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl[var5].getBytes("ISO-8859-1");
                        lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5] = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
                           ((Cipher)var4[0]).doFinal(var9)
                        );
                     }

                     return lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI[var5];
                  }

                  private static Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, MutableCallSite var1, String var2, Object[] var3
                  ) {
                     int var4 = (Integer)var3[0];
                     long var5 = (Long)var3[1];
                     String var7 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var5);
                     MethodHandle var8 = MethodHandles.constant(String.class, var7);
                     var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
                     return var7;
                  }

                  private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
                     Lookup var0, String var1, MethodType var2
                  ) {
                     MutableCallSite var3 = new MutableCallSite(var2);

                     try {
                        var3.setTarget(
                           MethodHandles.explicitCastArguments(
                              MethodHandles.insertArguments(
                                 "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII"
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
                           "me/octo/client/modules/impl/features/visuals/IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }
               };
               Setting[] var11 = new Setting[]{
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII,
                  IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl,
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI,
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII,
                  IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI,
                  IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll,
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll,
                  IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII,
                  llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI,
                  lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl
               };
               lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = var11;
               return;
            }

            var4 = var5.charAt(var3);
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
   }
}
