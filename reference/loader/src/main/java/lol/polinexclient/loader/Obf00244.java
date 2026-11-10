// Recovery view; aliases are not original names. Not verified to compile.
package lol.polinexclient.loader;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

public final class Obf00244 {
   public static Map<String, String> Obf00487;
   private static String[] Obf00120;
   private static String[] Obf00013;
   private static long Obf00025;
   private static final long[] a;
   private static final Integer[] b;
   private static final long[] c;
   private static final Long[] d;

   private Obf00244() {
   }

   public static HttpsURLConnection Obf00099(long var0, URL var2) throws Exception {
      long var3 = var0 ^ 133570665211460L;
      long var5 = var0 ^ 45863905069682L;
      String var7 = var2.getHost();
      HttpsURLConnection var8 = (HttpsURLConnection)var2.openConnection();

      try {
         if (!Obf00453.Obf00099<"À">(
               2574344179627641438L, var0
            )
            .containsKey(var7)) {
            Obf00453.Obf00099<"D">(
               Obf00099(-1412148180 + -19208, 1412148180 + 6539, (int)var0),
               var5,
               2560948502181579227L,
               var0
            );
         }

         HostnameVerifier var9 = HttpsURLConnection.getDefaultHostnameVerifier();
         var8.setHostnameVerifier(
            Obf00244::Obf00099
         );
         var8.setConnectTimeout(30000);
         var8.setReadTimeout((int)Obf00025);
         return var8;
      } catch (Exception var10) {
         return null;
      }
   }

   private static boolean Obf00099(
      String var0, HostnameVerifier var1, long var2, String var4, SSLSession var5
   ) {
      if (Obf00453.Obf00099<"À">(
         5039661446623445297L, var2
      )) {
         boolean var11 = var4.equalsIgnoreCase(var0);
         if (var2 >= 0L) {
            boolean var9 = var11;
            var11 = var9;
         }

         return var11;
      } else {
         boolean var10000 = var4.equalsIgnoreCase(var0);
         if (var2 >= 0L) {
            boolean var7 = var10000;
            if (!var7) {
               return false;
            }

            var10000 = var1.verify(var4, var5);
         }

         return var10000;
      }
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      String[] var16 = new String[2];
      int var20 = 0;
      String var19 = "\u008cVý\u0002\u001dáão^\u0084\u0088¬/¡Ù³ÎcÖÍêmXS \u0096\u0003ú\u009dßäª/øEþÙ:\u009e¶áYÑ³Ïeô½mþ^´ð$*\u0004¦Ð\u0007ÊëÅó\u008eÅRé\u008e^}Â,ÀÊ¨&ØR¥1\u00140`ú:ÞÄL_\u009f$/w²×à\u008cmt&îd\r\u001b-\u008eY#ß\u008a\u009b&c4ÁÔ\u008bT¯\u0092£Á?sSis.4¶\u009fÒzHù'#XüÔ±³óLÿÉdÌ\u0084\u0094qËÄÕ\u0088?É³\u00ad\u0012X\u0017å\u0082î^S:²<g}¸\u0083\u0013\u0011c¢H'a\rE»»[jçsc\u001bøQJáo^\u008f\"¤|Ó\u0014mÕÍÉÈÆx-w¨yGÌX\u00856\u0094åYE´yD:Ú\u0099Ó¨nl·@Ôÿ]\u0098\u000b«ð¦®'×X\u0018\u008f_\u0084{Û\u008eÔ\u0082XªæV&Vá\u0004èsøÝûÑáN(¨\u0096ÐÍØ=\u008b¡Yv\u000f\u0014ez\u0016è ÆQÓ\u0092\u0081³¾+mPJ\u0002a±\r\u001fñ\u001bÛÆïA\u0019U³\u0091ãËÚÏO\u0093èZÇj²\u001d®F\u0004.ã\u001c\u0001s\r^û¸f\u0013E=\u001ekÖrO÷\u0097ôæ\u0097·ÈXb\u008a\u008bÇ\u008c¤iõµäÅ\u0085¼9\u0085\u0091\u009e.o]2\u0087eoLg\u0098\tK\\Ü·¼Ú\u0088LÖ´ú@Áãm$¿¨È\u009bDÚó5öòÎ+Ï;äEk\u0000ó¯\u0088ææÀ$\u0007äé\u00adõ\u0091]3¿s§9í'SVâ««S\u008d³Ò\n\b\\U§Ýæ§0Ð*\u0001«T\u0088\u009b=(.¿\u008fý\u001bn4\u001b\u009atA\u008e0\u000bfè\u0004ÑÁÚç°ëAÅ\u0006ý\u0083\u0002Y\u0082\"SÿHá_@ê¥lU\u001c9\u009coc\u0091Z=WÅêS\u0012*AwT\b(6\n\u0095Ó)\u0018§\u0015\u008e\u00ad³ªslÿÌèûjÆûéÁ¥Õ\u0083B\u0080\u0015(ÕÖÒÑc\u0018(ç³\u008b\u0090ÅUD\u0083\u0013oZiaîW/\u000fçØõ_9]PMÊ\u009c_\u0087pmd\u009bY\"IÔ\td°n¢\"\u0011Ñ\u0011%\u0081U´W\u0005CU×ÖëvF=\u009fí6ÖÛ?¯ôRS:äª&¢´o\u0089äÂnè¥Û¼\u000f\u0003~\\\u001a8~ú}\u0089+\u001e4Ñ\u0016l7\u0015\u0018\u001aTúh3\u008f·\u0084N\u0018Zz¸\u009a§@\u0013\u0004ç\fuBFíjÀVß¦]\b\u008ayÁvË\u001cÊ\u0007½&Ò¨c'-kÝCfù/Ì\u001b\u0012°»ó\u001eÊ¦(ø\u0019rÅ\\Pç\u0094S\u0093°\u0080Mºu®\u00ad¿\b\u0082\u0002a`Dê4Ï\u0080(È1Z¦\u0010HÔ»Ùkì¦í#ò\u007f\u0084=\u0006«\u0094S\u00874\u0004Dï)gõð\"¢A:É[8(\u0093¦g\u000b\u009aÇ á\u009cèq\u008a])\u0085ø!ü×aqÿ×\u001a\u0093÷\u0017\u008fÎí´[\u0084\u0083üî0ÜÜiÀ\u0087Ä\t\u009bKÎ\u001cÚ²{>\u0089{£i¥õ\u0080ý\u0090ä\u008eJc\np\u0096Å¢O\u001bò¹\u008c¡\u008a`\u0082\u0019\u000e×\u0003\u0095Á(è\u0019\u0081\u009f5\u009dG¯é¶©u qr\u0088½\b?Õl\u001fy«\u009eÚ\u007fù\u0094\u0005®~ßÿ\u000f·DÎ";
      int var21 = "\u008cVý\u0002\u001dáão^\u0084\u0088¬/¡Ù³ÎcÖÍêmXS \u0096\u0003ú\u009dßäª/øEþÙ:\u009e¶áYÑ³Ïeô½mþ^´ð$*\u0004¦Ð\u0007ÊëÅó\u008eÅRé\u008e^}Â,ÀÊ¨&ØR¥1\u00140`ú:ÞÄL_\u009f$/w²×à\u008cmt&îd\r\u001b-\u008eY#ß\u008a\u009b&c4ÁÔ\u008bT¯\u0092£Á?sSis.4¶\u009fÒzHù'#XüÔ±³óLÿÉdÌ\u0084\u0094qËÄÕ\u0088?É³\u00ad\u0012X\u0017å\u0082î^S:²<g}¸\u0083\u0013\u0011c¢H'a\rE»»[jçsc\u001bøQJáo^\u008f\"¤|Ó\u0014mÕÍÉÈÆx-w¨yGÌX\u00856\u0094åYE´yD:Ú\u0099Ó¨nl·@Ôÿ]\u0098\u000b«ð¦®'×X\u0018\u008f_\u0084{Û\u008eÔ\u0082XªæV&Vá\u0004èsøÝûÑáN(¨\u0096ÐÍØ=\u008b¡Yv\u000f\u0014ez\u0016è ÆQÓ\u0092\u0081³¾+mPJ\u0002a±\r\u001fñ\u001bÛÆïA\u0019U³\u0091ãËÚÏO\u0093èZÇj²\u001d®F\u0004.ã\u001c\u0001s\r^û¸f\u0013E=\u001ekÖrO÷\u0097ôæ\u0097·ÈXb\u008a\u008bÇ\u008c¤iõµäÅ\u0085¼9\u0085\u0091\u009e.o]2\u0087eoLg\u0098\tK\\Ü·¼Ú\u0088LÖ´ú@Áãm$¿¨È\u009bDÚó5öòÎ+Ï;äEk\u0000ó¯\u0088ææÀ$\u0007äé\u00adõ\u0091]3¿s§9í'SVâ««S\u008d³Ò\n\b\\U§Ýæ§0Ð*\u0001«T\u0088\u009b=(.¿\u008fý\u001bn4\u001b\u009atA\u008e0\u000bfè\u0004ÑÁÚç°ëAÅ\u0006ý\u0083\u0002Y\u0082\"SÿHá_@ê¥lU\u001c9\u009coc\u0091Z=WÅêS\u0012*AwT\b(6\n\u0095Ó)\u0018§\u0015\u008e\u00ad³ªslÿÌèûjÆûéÁ¥Õ\u0083B\u0080\u0015(ÕÖÒÑc\u0018(ç³\u008b\u0090ÅUD\u0083\u0013oZiaîW/\u000fçØõ_9]PMÊ\u009c_\u0087pmd\u009bY\"IÔ\td°n¢\"\u0011Ñ\u0011%\u0081U´W\u0005CU×ÖëvF=\u009fí6ÖÛ?¯ôRS:äª&¢´o\u0089äÂnè¥Û¼\u000f\u0003~\\\u001a8~ú}\u0089+\u001e4Ñ\u0016l7\u0015\u0018\u001aTúh3\u008f·\u0084N\u0018Zz¸\u009a§@\u0013\u0004ç\fuBFíjÀVß¦]\b\u008ayÁvË\u001cÊ\u0007½&Ò¨c'-kÝCfù/Ì\u001b\u0012°»ó\u001eÊ¦(ø\u0019rÅ\\Pç\u0094S\u0093°\u0080Mºu®\u00ad¿\b\u0082\u0002a`Dê4Ï\u0080(È1Z¦\u0010HÔ»Ùkì¦í#ò\u007f\u0084=\u0006«\u0094S\u00874\u0004Dï)gõð\"¢A:É[8(\u0093¦g\u000b\u009aÇ á\u009cèq\u008a])\u0085ø!ü×aqÿ×\u001a\u0093÷\u0017\u008fÎí´[\u0084\u0083üî0ÜÜiÀ\u0087Ä\t\u009bKÎ\u001cÚ²{>\u0089{£i¥õ\u0080ý\u0090ä\u008eJc\np\u0096Å¢O\u001bò¹\u008c¡\u008a`\u0082\u0019\u000e×\u0003\u0095Á(è\u0019\u0081\u009f5\u009dG¯é¶©u qr\u0088½\b?Õl\u001fy«\u009eÚ\u007fù\u0094\u0005®~ßÿ\u000f·DÎ"
         .length();
      char var18 = 809;
      int var17 = -1;

      while (true) {
         char[] var71;
         label116: {
            char[] var10001 = var19.substring(++var17, var17 + var18).toCharArray();
            int var10003 = var10001.length;
            int var22 = 0;
            var71 = var10001;
            int var47 = var10003;
            char[] var88;
            int var10004;
            if (var10003 <= 1) {
               var88 = var10001;
               var10004 = var22;
            } else {
               var71 = var10001;
               var47 = var10003;
               if (var10003 <= var22) {
                  break label116;
               }

               var88 = var10001;
               var10004 = var22;
            }

            while (true) {
               var88[var10004] = (char)(var88[var10004] ^ switch (var22 % 7) {
                  case 0 -> 50;
                  case 1 -> 84;
                  case 2 -> 12;
                  case 3 -> 19;
                  case 4 -> 125;
                  case 5 -> 83;
                  default -> 120;
               });
               var22++;
               if (var47 == 0) {
                  var10004 = var47;
                  var88 = var71;
               } else {
                  if (var47 <= var22) {
                     break;
                  }

                  var88 = var71;
                  var10004 = var22;
               }
            }
         }

         String var95 = new String(var71).intern();
         int var51 = -1;
         var16[var20++] = var95;
         if ((var17 += var18) >= var21) {
            long var8 = 5596655729059437075L;
            long[] var14 = new long[8];
            int var11 = 0;
            String var12 = "£qV3% \u0095»L\u008c\u0003\u001d\u0087\u001að\f\u0005\u001e\u0085Æ\u0099æ]®\u0004h\u0004\u008aK\u0000%ª\u0000\u0097a\u0091¬\f¾Ú\b7S,¬ø ý";
            int var13 = "£qV3% \u0095»L\u008c\u0003\u001d\u0087\u001að\f\u0005\u001e\u0085Æ\u0099æ]®\u0004h\u0004\u008aK\u0000%ª\u0000\u0097a\u0091¬\f¾Ú\b7S,¬ø ý"
               .length();
            byte var10 = 0;

            do {
               var51 = var10;
               var10 += 8;
               byte[] var15 = var12.substring(var51, var10).getBytes("ISO-8859-1");
               var51 = var11++;
               long var111 = (
                     (var15[0] & 255L) << 56
                        | (var15[1] & 255L) << 48
                        | (var15[2] & 255L) << 40
                        | (var15[3] & 255L) << 32
                        | (var15[4] & 255L) << 24
                        | (var15[5] & 255L) << 16
                        | (var15[6] & 255L) << 8
                        | var15[7] & 255L
                  )
                  ^ var8;
               byte var96 = -1;
               var14[var51] = var111;
            } while (var10 < var13);

            var12 = "\u0098ª5\u0097÷8Ì\r@I\u001c\u0010\u009d±|\u0090";
            var13 = "\u0098ª5\u0097÷8Ì\r@I\u001c\u0010\u009d±|\u0090".length();
            var10 = 0;

            do {
               int var54 = var10;
               var10 += 8;
               byte[] var40 = var12.substring(var54, var10).getBytes("ISO-8859-1");
               var54 = var11++;
               long var112 = (
                     (var40[0] & 255L) << 56
                        | (var40[1] & 255L) << 48
                        | (var40[2] & 255L) << 40
                        | (var40[3] & 255L) << 32
                        | (var40[4] & 255L) << 24
                        | (var40[5] & 255L) << 16
                        | (var40[6] & 255L) << 8
                        | var40[7] & 255L
                  )
                  ^ var8;
               boolean var97 = false;
               var14[var54] = var112;
            } while (var10 < var13);

            a = var14;
            b = new Integer[8];
            long var0 = 752903026579688599L;
            long[] var6 = new long[7];
            int var3 = 0;
            String var4 = "dÒ¼¦,Ö\u00ad.²\u001c¿\u0086\u0001S\u009diO\u0094..;ùCT#ßÜO¦kð\u0017\u001dplcV\u008a\u0087ì";
            int var5 = "dÒ¼¦,Ö\u00ad.²\u001c¿\u0086\u0001S\u009diO\u0094..;ùCT#ßÜO¦kð\u0017\u001dplcV\u008a\u0087ì".length();
            byte var2 = 0;

            do {
               int var56 = var2;
               var2 += 8;
               byte[] var7 = var4.substring(var56, var2).getBytes("ISO-8859-1");
               var56 = var3++;
               long var113 = (
                     (var7[0] & 255L) << 56
                        | (var7[1] & 255L) << 48
                        | (var7[2] & 255L) << 40
                        | (var7[3] & 255L) << 32
                        | (var7[4] & 255L) << 24
                        | (var7[5] & 255L) << 16
                        | (var7[6] & 255L) << 8
                        | var7[7] & 255L
                  )
                  ^ var0;
               byte var98 = -1;
               var6[var56] = var113;
            } while (var2 < var5);

            var4 = "!kN\u009e&/PµqÈÉ\r\u0091\u000b\u0090\u007f";
            var5 = "!kN\u009e&/PµqÈÉ\r\u0091\u000b\u0090\u007f".length();
            var2 = 0;

            do {
               int var58 = var2;
               var2 += 8;
               byte[] var36 = var4.substring(var58, var2).getBytes("ISO-8859-1");
               var58 = var3++;
               long var114 = (
                     (var36[0] & 255L) << 56
                        | (var36[1] & 255L) << 48
                        | (var36[2] & 255L) << 40
                        | (var36[3] & 255L) << 32
                        | (var36[4] & 255L) << 24
                        | (var36[5] & 255L) << 16
                        | (var36[6] & 255L) << 8
                        | var36[7] & 255L
                  )
                  ^ var0;
               boolean var99 = false;
               var6[var58] = var114;
            } while (var2 < var5);

            c = var6;
            d = new Long[7];
            long var30 = 139669115450983L;
            String[] var28 = new String[17];
            int var26 = 0;
            String var25;
            int var27 = (var25 = var16[0]).length();
            char var24 = 21;
            int var43 = -1;

            label80:
            while (true) {
               String var10000 = var25.substring(++var43, var43 + var24);
               int var60 = -1;

               while (true) {
                  label75: {
                     char[] var62 = var10000.toCharArray();
                     int var100 = var62.length;
                     int var29 = 0;
                     var71 = var62;
                     var60 = var100;
                     char[] var103;
                     int var115;
                     if (var100 <= 1) {
                        var103 = var62;
                        var115 = var29;
                     } else {
                        var71 = var62;
                        var60 = var100;
                        if (var100 <= var29) {
                           break label75;
                        }

                        var103 = var62;
                        var115 = var29;
                     }

                     while (true) {
                        var103[var115] = (char)(var103[var115] ^ switch (var29 % 7) {
                           case 0 -> 75;
                           case 1 -> 90;
                           case 2 -> 107;
                           case 3 -> 74;
                           case 4 -> 7;
                           case 5 -> 93;
                           default -> 101;
                        });
                        var29++;
                        if (var60 == 0) {
                           var115 = var60;
                           var103 = var71;
                        } else {
                           if (var60 <= var29) {
                              break;
                           }

                           var103 = var71;
                           var115 = var29;
                        }
                     }
                  }

                  var95 = new String(var71).intern();
                  switch (var60) {
                     case 0:
                        var28[var26++] = var95;
                        if ((var43 += var24) >= var27) {
                           Obf00120 = var28;
                           Obf00013 = new String[17];
                           long var85 = -9019892780402222073L ^ var30;
                           byte var69 = -1;
                           Obf00025 = var85;
                           LinkedHashMap var32 = new LinkedHashMap();
                           var32.put(
                              Obf00099(
                                 1073987580 - (char)-23783, 1073987580 - 20760, (int)var30
                              ),
                              Obf00099(
                                 1073987580 - (char)-23791, 1073987580 - 31283, (int)var30
                              )
                           );
                           var32.put(
                              Obf00099(
                                 1073987580 - (char)-23788, -1073987580 - -30152, (int)var30
                              ),
                              Obf00099(
                                 1073987580 - (char)-23789, -1073987580 - -((char)-19377), (int)var30
                              )
                           );
                           var32.put(
                              Obf00099(
                                 1073987580 - (char)-23786, -1073987580 - -26879, (int)var30
                              ),
                              Obf00099(
                                 1073987580 - (char)-23784, -1073987580 - -((char)-18612), (int)var30
                              )
                           );
                           var32.put(
                              Obf00099(
                                 1073987580 - (char)-23796, 1073987580 - (char)-32045, (int)var30
                              ),
                              Obf00099(
                                 1073987580 - (char)-23795, 1073987580 - (char)-22816, (int)var30
                              )
                           );
                           var32.put(
                              Obf00099(
                                 1073987580 - (char)-23793, 1073987580 - 31831, (int)var30
                              ),
                              Obf00099(
                                 1073987580 - (char)-23785, 1073987580 - 31061, (int)var30
                              )
                           );
                           var32.put(
                              Obf00099(
                                 1073987580 - (char)-23790, 1073987580 - 19577, (int)var30
                              ),
                              Obf00099(
                                 1073987580 - (char)-23781, -1073987580 - -30773, (int)var30
                              )
                           );
                           var32.put(
                              Obf00099(
                                 1073987580 - (char)-23787, 1073987580 - (char)-32514, (int)var30
                              ),
                              Obf00099(
                                 1073987580 - (char)-23792, 1073987580 - 25520, (int)var30
                              )
                           );
                           var32.put(
                              Obf00099(
                                 1073987580 - (char)-23780, -1073987580 - -((char)-29942), (int)var30
                              ),
                              Obf00099(
                                 1073987580 - (char)-23794, -1073987580 - -28714, (int)var30
                              )
                           );
                           Obf00487 = var32;
                           return;
                        }

                        var24 = var25.charAt(var43);
                        break;
                     default:
                        var28[var26++] = var95;
                        if ((var43 += var24) < var27) {
                           var24 = var25.charAt(var43);
                           continue label80;
                        }

                        var27 = (var25 = var16[1]).length();
                        var24 = '_';
                        var43 = -1;
                  }

                  var10000 = var25.substring(++var43, var43 + var24);
                  var60 = 0;
               }
            }
         }

         var18 = var19.charAt(var17);
      }
   }

   private static String Obf00099(int var0, int var1, int var2) {
      int var3 = (var0 ^ var2 ^ 10887) & 65535;
      if (Obf00013[var3] == null) {
         char[] var4 = Obf00120[var3].toCharArray();

         short var5 = switch (var4[0] & 0xFF) {
            case 0 -> 238;
            case 1 -> 29;
            case 2 -> 129;
            case 3 -> 198;
            case 4 -> 239;
            case 5 -> 10;
            case 6 -> 118;
            case 7 -> 215;
            case 8 -> 21;
            case 9 -> 167;
            case 10 -> 9;
            case 11 -> 170;
            case 12 -> 126;
            case 13 -> 41;
            case 14 -> 168;
            case 15 -> 67;
            case 16 -> 125;
            case 17 -> 242;
            case 18 -> 34;
            case 19 -> 54;
            case 20 -> 75;
            case 21 -> 70;
            case 22 -> 31;
            case 23 -> 251;
            case 24 -> 236;
            case 25 -> 94;
            case 26 -> 76;
            case 27 -> 132;
            case 28 -> 116;
            case 29 -> 163;
            case 30 -> 115;
            case 31 -> 214;
            case 32 -> 237;
            case 33 -> 134;
            case 34 -> 151;
            case 35 -> 82;
            case 36 -> 97;
            case 37 -> 171;
            case 38 -> 157;
            case 39 -> 240;
            case 40 -> 73;
            case 41 -> 145;
            case 42 -> 154;
            case 43 -> 138;
            case 44 -> 230;
            case 45 -> 5;
            case 46 -> 108;
            case 47 -> 65;
            case 48 -> 186;
            case 49 -> 48;
            case 50 -> 23;
            case 51 -> 174;
            case 52 -> 220;
            case 53 -> 200;
            case 54 -> 181;
            case 55 -> 249;
            case 56 -> 124;
            case 57 -> 45;
            case 58 -> 69;
            case 59 -> 79;
            case 60 -> 149;
            case 61 -> 123;
            case 62 -> 205;
            case 63 -> 38;
            case 64 -> 35;
            case 65 -> 59;
            case 66 -> 136;
            case 67 -> 217;
            case 68 -> 84;
            case 69 -> 22;
            case 70 -> 193;
            case 71 -> 89;
            case 72 -> 135;
            case 73 -> 27;
            case 74 -> 245;
            case 75 -> 46;
            case 76 -> 246;
            case 77 -> 85;
            case 78 -> 88;
            case 79 -> 156;
            case 80 -> 144;
            case 81 -> 33;
            case 82 -> 141;
            case 83 -> 247;
            case 84 -> 51;
            case 85 -> 14;
            case 86 -> 95;
            case 87 -> 99;
            case 88 -> 158;
            case 89 -> 25;
            case 90 -> 37;
            case 91 -> 119;
            case 92 -> 120;
            case 93 -> 155;
            case 94 -> 195;
            case 95 -> 192;
            case 96 -> 55;
            case 97 -> 47;
            case 98 -> 92;
            case 99 -> 187;
            case 100 -> 78;
            case 101 -> 121;
            case 102 -> 36;
            case 103 -> 131;
            case 104 -> 101;
            case 105 -> 68;
            case 106 -> 196;
            case 107 -> 183;
            case 108 -> 107;
            case 109 -> 83;
            case 110 -> 42;
            case 111 -> 103;
            case 112 -> 160;
            case 113 -> 44;
            case 114 -> 72;
            case 115 -> 177;
            case 116 -> 96;
            case 117 -> 128;
            case 118 -> 28;
            case 119 -> 66;
            case 120 -> 86;
            case 121 -> 114;
            case 122 -> 49;
            case 123 -> 226;
            case 124 -> 152;
            case 125 -> 122;
            case 126 -> 161;
            case 127 -> 232;
            case 128 -> 62;
            case 129 -> 15;
            case 130 -> 243;
            case 131 -> 182;
            case 132 -> 30;
            case 133 -> 32;
            case 134 -> 40;
            case 135 -> 147;
            case 136 -> 77;
            case 137 -> 8;
            case 138 -> 221;
            case 139 -> 148;
            case 140 -> 175;
            case 141 -> 63;
            case 142 -> 222;
            case 143 -> 229;
            case 144 -> 252;
            case 145 -> 216;
            case 146 -> 7;
            case 147 -> 185;
            case 148 -> 91;
            case 149 -> 112;
            case 150 -> 219;
            case 151 -> 102;
            case 152 -> 201;
            case 153 -> 197;
            case 154 -> 105;
            case 155 -> 16;
            case 156 -> 39;
            case 157 -> 165;
            case 158 -> 210;
            case 159 -> 255;
            case 160 -> 98;
            case 161 -> 93;
            case 162 -> 100;
            case 163 -> 153;
            case 164 -> 117;
            case 165 -> 234;
            case 166 -> 18;
            case 167 -> 24;
            case 168 -> 253;
            case 169 -> 104;
            case 170 -> 109;
            case 171 -> 61;
            case 172 -> 12;
            case 173 -> 178;
            case 174 -> 225;
            case 175 -> 189;
            case 176 -> 74;
            case 177 -> 1;
            case 178 -> 50;
            case 179 -> 137;
            case 180 -> 2;
            case 181 -> 140;
            case 182 -> 231;
            case 183 -> 209;
            case 184 -> 90;
            case 185 -> 176;
            case 186 -> 150;
            case 187 -> 4;
            case 188 -> 52;
            case 189 -> 203;
            case 190 -> 254;
            case 191 -> 248;
            case 192 -> 211;
            case 193 -> 111;
            case 194 -> 218;
            case 195 -> 206;
            case 196 -> 130;
            case 197 -> 228;
            case 198 -> 173;
            case 199 -> 164;
            case 200 -> 113;
            case 201 -> 60;
            case 202 -> 71;
            case 203 -> 81;
            case 204 -> 110;
            case 205 -> 244;
            case 206 -> 224;
            case 207 -> 53;
            case 208 -> 56;
            case 209 -> 6;
            case 210 -> 172;
            case 211 -> 57;
            case 212 -> 166;
            case 213 -> 0;
            case 214 -> 133;
            case 215 -> 223;
            case 216 -> 190;
            case 217 -> 180;
            case 218 -> 194;
            case 219 -> 241;
            case 220 -> 233;
            case 221 -> 17;
            case 222 -> 3;
            case 223 -> 146;
            case 224 -> 106;
            case 225 -> 26;
            case 226 -> 80;
            case 227 -> 13;
            case 228 -> 43;
            case 229 -> 191;
            case 230 -> 87;
            case 231 -> 207;
            case 232 -> 199;
            case 233 -> 127;
            case 234 -> 250;
            case 235 -> 162;
            case 236 -> 227;
            case 237 -> 11;
            case 238 -> 143;
            case 239 -> 64;
            case 240 -> 20;
            case 241 -> 142;
            case 242 -> 19;
            case 243 -> 202;
            case 244 -> 212;
            case 245 -> 213;
            case 246 -> 208;
            case 247 -> 179;
            case 248 -> 58;
            case 249 -> 188;
            case 250 -> 184;
            case 251 -> 159;
            case 252 -> 235;
            case 253 -> 139;
            case 254 -> 204;
            default -> 169;
         };
         int var10;
         int var6 = ((var10 = var1 ^ var2) & 0xFF) - var5;
         if (var6 < 0) {
            var6 += 256;
         }

         int var7 = ((var10 & 65535) >>> 8) - var5;
         if (var7 < 0) {
            var7 += 256;
         }

         for (int var8 = 0; var8 < var4.length; var8++) {
            int var9 = var8 % 2;
            char var10002 = var4[var8];
            if (var9 == 0) {
               var4[var8] = (char)(var10002 ^ var6);
               var6 = ((var6 >>> 3 | var6 << 5) ^ var4[var8]) & 0xFF;
            } else {
               var4[var8] = (char)(var10002 ^ var7);
               var7 = ((var7 >>> 3 | var7 << 5) ^ var4[var8]) & 0xFF;
            }
         }

         Obf00013[var3] = new String(var4).intern();
      }

      return Obf00013[var3];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2838;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }

   private static long b(int var0, long var1) {
      int var3 = (var0 ^ (int)var1 ^ 110) & 32767;
      if (d[var3] == null) {
         d[var3] = c[var3] ^ var1;
      }

      return d[var3];
   }
}
