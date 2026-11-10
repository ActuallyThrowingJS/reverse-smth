package me.octo.client.utils;

import com.google.gson.Gson;
import java.io.File;
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
import kotlin.Unit;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;

public class IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl {
   private static String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   private static Gson lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 59616499961402L;
   private static String[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static Map IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new HashMap(13);

   private static String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll param0,
      int param1,
      char param2,
      String param3,
      int param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static String llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      short var0,
      int var1,
      IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var2,
      String var3,
      int var4
   ) {
      long var5 = ((long)var0 << 48 | (long)var1 << 32 >>> 16 | (long)var4 << 48 >>> 48)
         ^ IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      long var10001 = var5 ^ 111317377694924L;
      int var7 = (int)((var5 ^ 111317377694924L) >>> 32);
      int var8 = (int)((var5 ^ 111317377694924L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      return lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var7, (char)var8, var3, var9), 5524667084195584093L, var5
      );
   }

   private static String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(short param0, long param1, File param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static File IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll param0,
      long param1
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var0) {
      var0 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var0;
      long var2 = var0 ^ 131002508201558L;
      long var10001 = var0 ^ 19292472939393L;
      int var4 = (int)((var0 ^ 19292472939393L) >>> 48);
      int var5 = (int)((var0 ^ 19292472939393L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            () -> {
               long var3 = ((long)var0x << 48 | (long)var5 << 32 >>> 16 | (long)var2x << 48 >>> 48)
                  ^ IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               long var5x = var3 ^ 92406725400947L;
               int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  7287305881544423207L, var3
               );
               IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll[] var8 = IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.values();
               int var9 = var8.length;
               int[] var7x = var10000;
               int var10 = 0;

               while (var10 < var9) {
                  IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var11 = var8[var10];

                  try {
                     IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var11, var5x);
                  } catch (Exception var13) {
                     System.err
                        .println(
                           IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(25047, 3825697386422604722L ^ var3)
                              + var11.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                              + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"q">(9672, 4102500422287120295L ^ var3)
                              + var13.getMessage()
                        );
                  }

                  var10++;
                  if (var7x == null) {
                     break;
                  }
               }

               return Unit.INSTANCE;
            },
            var2
         );
   }

   static {
      long var9 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 73468344048399L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[15];
      int var5 = 0;
      String var4 = "/â\u000et[\u0019T»\u008dâ{Åh¥\u009a\u001e4\u001e 7JãRí¥yÚt°-\"¹h=§7qøhÑì\u009d´\b\u0098ªTd\t\u0000Ü1[¼&ÕðÞx+@ÖÈ|\u000b¯¯\u0006qn\u008a²\u0091çnqæ\u0094þ¶H\u001fa\u0097\u0085]ò\u008dÂYw\u008c§ô\u009f¤Ü\rÉ\u008cõGÈ×»zú½lÀºÜ\u000b`<HçUõA,i~~ê3Åôº\u0095´÷S¸ç\u0013\u0011G\r Óãa\u0094v\u0096q\u0007\fbyÄºHù#\u0014x5§µ\u0099¦)Ì¥\u0089\u009fN/ë¹à\u0010ÓùlØè`à?>Kasð\u001aü\u0090\bsìµÁ\u0019þ\u007f\u000e\\\u001c+Áÿ)×7³\u0093;¬ÇÈÍ\u008dàË\u008cs6±Bä\u008cáº\u0010\u001f¿×wÁ\u0002\u000bèRíZÊ\u0092>KÌ /êAþ\u0014W.ÉëÅî\u0096È\u0019çö\u0099T\u0082\u0002\u0091\u0089\u0099Ïy\u00895$\u009d\u008e?fP\\¯ø` \u0006u\u0095º\u009e\u0099¹Ô\u0093D\u009a\t`ÐmÇË\bÓë\rOy¢»í\"\u0093\u001dëÃ3\u000b\u008fáêíùp\u009d\u001617^\u0082\u0081bwæJbún\u0096>\u0018¹Ç\u009d\f®\u001a¨AÍÊ\u009a\u0097l\u0004\u0013K¹£÷( ÚâQow\u0081,\u0086ÿøüÉ,\u0001éE\u0097\u0014!\u0003\u009c\u008b\u0010C\u0083Äûå\u008dÛ\t'\u009a\u0001.ÑÍ\u00adË\u0018Ë\u0004,]\f$)Ck!¤¦V\u0098ÀK~p\t\u0080ª\u008aÁ*\u0010\u001d³\n±T\u0093à¡\u009c\u0091þÐÓÄÚaxP\u0087Í\u0087yç°(\u009e#í\u009a\u0002\u0096w\u000e\u008a\u0083®ø\u0081CF2ÉÈ\u0097\u0000Ö\u0016%¡A\u0007,Êªa3§Áþ(\u0090gè\u009e¢>1¯L?\u001d\t\u0005Ù0z\u0000\u0003Ô\u008aX¨s®\u0097\u0010Aü=¯úþ¿Î¦\u0011²ÃÖ×\u009f\u0015²X]\"qQ°\u001a¨+W\u0001*\u0099ü\u0091°\u009d\u0004\u0007}\u0001+}Ë .ÇÓúéC\u0088\t\u0083\u0010\u0089ÔI¡AX¼{_\u0082M\u0013q¾Ú³\u0010¿«\u009dí\u0016\u009aõ=ÉFÂÖ\u001d$TÑ\u0010÷\n\u008fZ±Wpe\u000fu1ÙNú\u008a¹";
      int var6 = "/â\u000et[\u0019T»\u008dâ{Åh¥\u009a\u001e4\u001e 7JãRí¥yÚt°-\"¹h=§7qøhÑì\u009d´\b\u0098ªTd\t\u0000Ü1[¼&ÕðÞx+@ÖÈ|\u000b¯¯\u0006qn\u008a²\u0091çnqæ\u0094þ¶H\u001fa\u0097\u0085]ò\u008dÂYw\u008c§ô\u009f¤Ü\rÉ\u008cõGÈ×»zú½lÀºÜ\u000b`<HçUõA,i~~ê3Åôº\u0095´÷S¸ç\u0013\u0011G\r Óãa\u0094v\u0096q\u0007\fbyÄºHù#\u0014x5§µ\u0099¦)Ì¥\u0089\u009fN/ë¹à\u0010ÓùlØè`à?>Kasð\u001aü\u0090\bsìµÁ\u0019þ\u007f\u000e\\\u001c+Áÿ)×7³\u0093;¬ÇÈÍ\u008dàË\u008cs6±Bä\u008cáº\u0010\u001f¿×wÁ\u0002\u000bèRíZÊ\u0092>KÌ /êAþ\u0014W.ÉëÅî\u0096È\u0019çö\u0099T\u0082\u0002\u0091\u0089\u0099Ïy\u00895$\u009d\u008e?fP\\¯ø` \u0006u\u0095º\u009e\u0099¹Ô\u0093D\u009a\t`ÐmÇË\bÓë\rOy¢»í\"\u0093\u001dëÃ3\u000b\u008fáêíùp\u009d\u001617^\u0082\u0081bwæJbún\u0096>\u0018¹Ç\u009d\f®\u001a¨AÍÊ\u009a\u0097l\u0004\u0013K¹£÷( ÚâQow\u0081,\u0086ÿøüÉ,\u0001éE\u0097\u0014!\u0003\u009c\u008b\u0010C\u0083Äûå\u008dÛ\t'\u009a\u0001.ÑÍ\u00adË\u0018Ë\u0004,]\f$)Ck!¤¦V\u0098ÀK~p\t\u0080ª\u008aÁ*\u0010\u001d³\n±T\u0093à¡\u009c\u0091þÐÓÄÚaxP\u0087Í\u0087yç°(\u009e#í\u009a\u0002\u0096w\u000e\u008a\u0083®ø\u0081CF2ÉÈ\u0097\u0000Ö\u0016%¡A\u0007,Êªa3§Áþ(\u0090gè\u009e¢>1¯L?\u001d\t\u0005Ù0z\u0000\u0003Ô\u008aX¨s®\u0097\u0010Aü=¯úþ¿Î¦\u0011²ÃÖ×\u009f\u0015²X]\"qQ°\u001a¨+W\u0001*\u0099ü\u0091°\u009d\u0004\u0007}\u0001+}Ë .ÇÓúéC\u0088\t\u0083\u0010\u0089ÔI¡AX¼{_\u0082M\u0013q¾Ú³\u0010¿«\u009dí\u0016\u009aõ=ÉFÂÖ\u001d$TÑ\u0010÷\n\u008fZ±Wpe\u000fu1ÙNú\u008a¹"
         .length();
      char var3 = 'P';
      int var12 = -1;

      label27:
      while (true) {
         String var13 = var4.substring(++var12, var12 + var3);
         byte var10001 = -1;

         while (true) {
            byte[] var8 = var0.doFinal(var13.getBytes("ISO-8859-1"));
            String var19 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            switch (var10001) {
               case 0:
                  var7[var5++] = var19;
                  if ((var12 += var3) >= var6) {
                     lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var7;
                     IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new String[15];
                     IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = ModUtils.mc.gameDirectory.getAbsolutePath()
                        + "/polinex/pathfind-cache";
                     lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = new Gson();
                     return;
                  }

                  var3 = var4.charAt(var12);
                  break;
               default:
                  var7[var5++] = var19;
                  if ((var12 += var3) < var6) {
                     var3 = var4.charAt(var12);
                     continue label27;
                  }

                  var4 = "\u000f]Àj\u0082ûZ@Áíò¼\u0092ù]ª\u0018äf/G\u000f/K\u008cLGââÙÃ1\u0097>Üg,ýËÈÔ";
                  var6 = "\u000f]Àj\u0082ûZ@Áíò¼\u0092ù]ª\u0018äf/G\u000f/K\u008cLGââÙÃ1\u0097>Üg,ýËÈÔ".length();
                  var3 = 16;
                  var12 = -1;
            }

            var13 = var4.substring(++var12, var12 + var3);
            var10001 = 0;
         }
      }
   }

   private static Throwable IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Throwable var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 5155;
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
            throw new RuntimeException("me/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl", var10);
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
            "me/octo/client/utils/IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public static enum llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      HUB,
      DWARVEN_CAMP,
      DWARVEN_MINES,
      CRIMSON_ISLE,
      GALATEA,
      BARN,
      MUSHROOM_DESERT,
      SPIDER_DEN;

      private final String IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(String var3) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var3;
      }

      public String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      static {
         long var9 = 6596020948734L ^ 97897785848317L;
         Cipher var1;
         Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var2 = 1; var2 < 8; var2++) {
            var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var0 = new String[16];
         int var6 = 0;
         String var5 = "\u0019»·\u001dÿ\u0096å \u009b¼wÌß\u0082\u0081\u001d\b{òw\u0006ß\u009cD\u0086\u0010l&\u0091¥5gX\u0013ªä\u0014l:ÖÎ7\bê\"vÑ\u0018ûHÂ\u0010¦¨Ó_l/1\u009fÓø¾J¦Ê¸\u001b\b{òw\u0006ß\u009cD\u0086\u0010¦¨Ó_l/1\u009fÓø¾J¦Ê¸\u001b\u0010\u0019»·\u001dÿ\u0096å ¥\u0085Ô\u00019h\u009ai\béûxL\u0085JÕ¸\u0010\u0019»·\u001dÿ\u0096å \u009b¼wÌß\u0082\u0081\u001d\u0010l&\u0091¥5gX\u0013ªä\u0014l:ÖÎ7\bê\"vÑ\u0018ûHÂ\u0010jó\u0082®4\u0095ÿé\u0085Û\u0011\u009f÷|uä\u0010jó\u0082®4\u0095ÿé\u0085Û\u0011\u009f÷|uä";
         int var7 = "\u0019»·\u001dÿ\u0096å \u009b¼wÌß\u0082\u0081\u001d\b{òw\u0006ß\u009cD\u0086\u0010l&\u0091¥5gX\u0013ªä\u0014l:ÖÎ7\bê\"vÑ\u0018ûHÂ\u0010¦¨Ó_l/1\u009fÓø¾J¦Ê¸\u001b\b{òw\u0006ß\u009cD\u0086\u0010¦¨Ó_l/1\u009fÓø¾J¦Ê¸\u001b\u0010\u0019»·\u001dÿ\u0096å ¥\u0085Ô\u00019h\u009ai\béûxL\u0085JÕ¸\u0010\u0019»·\u001dÿ\u0096å \u009b¼wÌß\u0082\u0081\u001d\u0010l&\u0091¥5gX\u0013ªä\u0014l:ÖÎ7\bê\"vÑ\u0018ûHÂ\u0010jó\u0082®4\u0095ÿé\u0085Û\u0011\u009f÷|uä\u0010jó\u0082®4\u0095ÿé\u0085Û\u0011\u009f÷|uä"
            .length();
         char var4 = 16;
         int var12 = -1;

         label28:
         while (true) {
            String var13 = var5.substring(++var12, var12 + var4);
            byte var10001 = -1;

            while (true) {
               byte[] var8 = var1.doFinal(var13.getBytes("ISO-8859-1"));
               String var19 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               switch (var10001) {
                  case 0:
                     var0[var6++] = var19;
                     if ((var12 += var4) >= var7) {
                        HUB = new IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           var0[3]
                        );
                        DWARVEN_CAMP = new IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           var0[9]
                        );
                        DWARVEN_MINES = new IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           var0[15]
                        );
                        CRIMSON_ISLE = new IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           var0[10]
                        );
                        GALATEA = new IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           var0[8]
                        );
                        BARN = new IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           var0[1]
                        );
                        MUSHROOM_DESERT = new IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           var0[4]
                        );
                        SPIDER_DEN = new IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                           var0[12]
                        );
                        return;
                     }

                     var4 = var5.charAt(var12);
                     break;
                  default:
                     var0[var6++] = var19;
                     if ((var12 += var4) < var7) {
                        var4 = var5.charAt(var12);
                        continue label28;
                     }

                     var5 = "éûxL\u0085JÕ¸\u0010\u0019»·\u001dÿ\u0096å ¥\u0085Ô\u00019h\u009ai";
                     var7 = "éûxL\u0085JÕ¸\u0010\u0019»·\u001dÿ\u0096å ¥\u0085Ô\u00019h\u009ai".length();
                     var4 = '\b';
                     var12 = -1;
               }

               var13 = var5.substring(++var12, var12 + var4);
               var10001 = 0;
            }
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
