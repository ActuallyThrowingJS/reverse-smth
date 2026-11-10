package me.octo.client.utils.client;

import java.awt.AWTException;
import java.awt.SystemTray;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
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
import javax.imageio.ImageIO;
import kotlin.io.CloseableKt;
import kotlin.text.StringsKt;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll {
   @NotNull
   public static IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
   @Nullable
   private static TrayIcon lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
   private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 21909790890164L;
   private static String[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
   private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private static Map IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new HashMap(13);

   private IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll() {
   }

   private final TrayIcon IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1) {
      var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var1;
      TrayIcon var27;
      if (SystemTray.isSupported()) {
         SystemTray var3 = SystemTray.getSystemTray();

         BufferedImage var5;
         try {
            label82: {
               InputStream var10000 = this.getClass()
                  .getResourceAsStream(
                     IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(17421, 4465689347487970838L ^ var1)
                  );
               if (var10000 != null) {
                  var var7 = var10000;
                  Throwable var8 = null;

                  BufferedImage var24;
                  try {
                     InputStream var9 = var7;
                     boolean var10 = false;
                     var24 = ImageIO.read(var9);
                  } catch (Throwable var17) {
                     var8 = var17;
                     throw var17;
                  } finally {
                     CloseableKt.closeFinally(var7, var8);
                  }

                  var26 = var24;
                  if (var24 != null) {
                     break label82;
                  }
               }

               IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var23 = this;
               long var10001 = 1307494176350495208L ^ var1;
               boolean var25 = false;
               System.out.println(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(5119, var10001));
               var26 = null;
            }

            var5 = var26;
         } catch (IOException var20) {
            var20.printStackTrace();
            var5 = null;
         }

         BufferedImage var4 = var5;

         try {
            if (var4 == null) {
               System.out
                  .println(IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(1770, 3525945117878809812L ^ var1));
               return null;
            }
         } catch (Throwable var19) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var19, 3145100247248491593L, var1
            );
         }

         TrayIcon var22 = new TrayIcon(
            var5, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(16333, 572781595567836660L ^ var1)
         );
         var22.setImageAutoSize(true);

         TrayIcon var6;
         try {
            var3.add(var22);
            var6 = var22;
         } catch (AWTException var16) {
            var16.printStackTrace();
            var6 = null;
         }

         var27 = var6;
      } else {
         var27 = null;
      }

      return var27;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull String param1, @NotNull String param2, long param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(String var1, String var2, int var3, int var4) {
      long var5 = ((long)var3 << 32 | (long)var4 << 32 >>> 32) ^ IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      int var7 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -1299470378870656709L, var5
      );

      TrayIcon var10000;
      label32: {
         label27: {
            try {
               var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               if (var7 != 0) {
                  break label32;
               }

               if (lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
                  break label27;
               }
            } catch (Exception var13) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var13, -1172063696758337449L, var5
               );
            }

            var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            break label32;
         }

         try {
            String var8 = StringsKt.replace$default(
               var1,
               "'",
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(9875, 2714287694663782571L ^ var5),
               false,
               4,
               null
            );
            String var9 = StringsKt.replace$default(
               var2,
               "'",
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(9689, 1388916552577717239L ^ var5),
               false,
               4,
               null
            );
            String var10 = StringsKt.trimIndent(
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(14585, 3075188778738421464L ^ var5)
                  + var8
                  + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(24664, 7841186602238170733L ^ var5)
                  + var9
                  + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(19698, 1145009232982571723L ^ var5)
            );
            Runtime var14 = Runtime.getRuntime();
            String[] var11 = new String[]{
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(16122, 6359745164184029382L ^ var5),
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(16050, 1015891015763888276L ^ var5),
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(32255, 3869628118538832888L ^ var5),
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(27929, 988957832113019707L ^ var5),
               var10
            };
            var14.exec(var11);
         } catch (Exception var12) {
            var12.printStackTrace();
         }

         return;
      }

      var10000.displayMessage(var1, var2, MessageType.INFO);
   }

   private final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(String var1, String var2, long var3) {
      var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var3;

      try {
         Runtime var10000 = Runtime.getRuntime();
         String[] var6 = new String[]{
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(7464, 8249094799145876251L ^ var3),
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(8436, 8548321417126840055L ^ var3),
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(1114, 5154384831399207503L ^ var3)
               + var2
               + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(9753, 2889822518429515794L ^ var3)
               + var1
               + "\""
         };
         Process var5 = var10000.exec(var6);
         var5.waitFor();
      } catch (Exception var7) {
         var7.printStackTrace();
      }
   }

   private final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(String var1, String var2, long var3) {
      var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var3;
      long var10001 = var3 ^ 70795007562925L;
      int var5 = (int)((var3 ^ 70795007562925L) >>> 48);
      int var6 = (int)((var3 ^ 70795007562925L) << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      int var9 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -7759384443319498595L, var3
      );

      try {
         IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var28;
         label66: {
            label65: {
               IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var12;
               label73: {
                  try {
                     var12 = this;
                     if (var9 != 0) {
                        break label73;
                     }

                     if (!this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        (char)var5,
                        var6,
                        IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(26665, 7823518941633488818L ^ var3),
                        (short)var7
                     )) {
                        break label65;
                     }
                  } catch (Exception var18) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var18, -7629796912535901711L, var3
                     );
                  }

                  Runtime var10000 = Runtime.getRuntime();
                  String[] var11 = new String[]{
                     IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(19808, 7637111910248579821L ^ var3), var1, var2
                  };
                  Process var10 = var10000.exec(var11);
                  int var23 = var10.waitFor();

                  try {
                     if (var23 == 0) {
                        return;
                     }
                     break label65;
                  } catch (Exception var17) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var17, -7629796912535901711L, var3
                     );
                  }
               }

               var28 = var12;
               break label66;
            }

            var28 = this;
         }

         String var14 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(26452, 1587743298951948537L ^ var3);
         IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var13 = var28;
         String var32;
         if (var9 == 0) {
            if (var13.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI((char)var5, var6, var14, (short)var7)) {
               Runtime var29 = Runtime.getRuntime();
               String[] var24 = new String[]{
                  IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(2285, 6138167403837179773L ^ var3),
                  IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(45, 1641348849245245369L ^ var3),
                  var2,
                  "5",
                  IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(19059, 6486839904831604223L ^ var3),
                  var1
               };
               Process var21 = var29.exec(var24);
               int var25 = var21.waitFor();

               try {
                  if (var25 == 0) {
                     return;
                  }
               } catch (Exception var16) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var16, -7629796912535901711L, var3
                  );
               }
            }

            var28 = this;
            var32 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(11613, 5351613171936748242L ^ var3);
         } else {
            var28 = var13;
            var32 = var14;
         }

         String var8 = var32;
         if (var28.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI((char)var5, var6, var8, (short)var7)) {
            Runtime var31 = Runtime.getRuntime();
            String[] var26 = new String[]{
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(6003, 7706485369455204567L ^ var3),
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(12699, 7470678013333765687L ^ var3),
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(6366, 3041353200636680009L ^ var3)
                  + var1
                  + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(22538, 1479581290990147460L ^ var3)
                  + var2
            };
            Process var22 = var31.exec(var26);
            if (var9 != 0) {
               return;
            }

            int var27 = var22.waitFor();

            try {
               if (var27 == 0) {
                  return;
               }
            } catch (Exception var15) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var15, -7629796912535901711L, var3
               );
            }
         }

         System.out
            .println(
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(11228, 3865159656072307789L ^ var3)
                  + var1
                  + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(8222, 1142346286107619227L ^ var3)
                  + var2
            );
      } catch (Exception var19) {
         var19.printStackTrace();
         System.out
            .println(
               IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(28212, 5276085446465823130L ^ var3)
                  + var1
                  + IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(6753, 711933313150047741L ^ var3)
                  + var2
            );
      }
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(char var1, int var2, String var3, short var4) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48)
         ^ IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      int var7 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         1749775430811206788L, var5
      );

      int var8;
      try {
         Runtime var10000 = Runtime.getRuntime();
         String[] var9 = new String[]{
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(16857, 4761253434607075906L ^ var5),
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(9759, 6350152781338174884L ^ var5),
            IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"i">(25120, 2466945871652692403L ^ var5) + var3
         };
         Process var12 = var10000.exec(var9);
         int var13 = var12.waitFor();

         label27: {
            label26: {
               try {
                  var14 = var13;
                  if (var7 != 0) {
                     break label27;
                  }

                  if (var13 == 0) {
                     break label26;
                  }
               } catch (Exception var10) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var10, 1874860494161339880L, var5
                  );
               }

               var14 = 0;
               break label27;
            }

            var14 = 1;
         }

         var8 = var14;
      } catch (Exception var11) {
         var8 = 0;
      }

      return (boolean)var8;
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
      if (lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII != null) {
         TrayIcon var1 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         boolean var2 = false;
         SystemTray.getSystemTray().remove(var1);
      }
   }

   static {
      long var9 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 29261735614849L;
      long var11 = var9 ^ 35506049872875L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[44];
      int var5 = 0;
      String var4 = "\u008fî\u0001S\u0098¹8rÿÚÏ\u0007!\u009c\u0017P\u0004Îé¤úÌ!\u001b\u0010ã\ttOTõì`ãäcÏ\u0088:}r@\b¤\u0003ó\u00072v¸¶\u0091|y\"nî¼Ûo\u0002Þª\u009eDä?E6ñ^\u009e_h-\u0085§Ù\u0000÷,çÁ\u0099ð¬¹\"4\u000fz\b¾J80í9û¹×\u008a\u0086[:\u0001ʠÌi\u009a\u0085\u0017M5ÿ*\u0007YX0<\u001c×$E]\u001f.Ëª\u009c÷º!ì=\u001eR\u0003Òm\"gÛ¹í\u0097\u0001G\u0096\u001b*`¨\u001aÑìñøÑs\u0005+ÿ8\u009a_È`ñ\u0086ÛÂ\bM\u0092\u0090CÅÝ\u0092næ(\u0086\u0093\u0002q\u0088ëÛÓ\b\u008c\"3Úk>éFñ©\u000føê{þ¶\u0094æ\fC>pÀ\u009e\u000fÂÏ\u0001àÿe¬§B\u0091B\u0084\u001aåß\u0003M\u009d5\u000e\u0013Å%ôWÜ\u0013\u0012ºhØÏÞL»3J®\u0010\u0098\u0098S4ñÔWgI¥+õ\u000f\u008cÄ|¬%B\n\r×\u0080¯ñO´¬ææ\u0096pÎÞö\u0085%qX]hùg`\u001aô'öl©R\u0018zw¹>OÍsÌ-(¥\u00adÊ\u000b>è0À.F\u0091yDÏÒ\u0094ùý@\u0093y\u008dOÎ\u000fFÿÔ¬ÊjaÍZÊY\u0004ìûtµ¿\u0010ê\u00067¸\u0017Ä\u0085¶åNN¥J $Ûc\u0080ËÍ\u0093\u0099V[OÑ>´Ï|\u008d:u»ðç\u0090\u0090\u0086åÖ@V\u0093\u0084´]÷5\u00958\u008c1\u00075¸Z\u0010Q`è\u0018µ\u0086\u0010)\u0000ò\u0007hHõKV\u008c¿\u001a³Û\u0089(h\u0010b7ãÁ½-\\\u000f\u0000GUåÿ\rr¾\\S\u00969ï\u009d«¶\rÕ\u0096Mã(\u0097aD\u0014\u0094l¾\u001d\nÊ=¦.¤cÝ¹4Öd©\u0093ÿÇ\u0005C\u0011[\u001c\u0001\u00ad\u001c\u009dÿx\u0099À\u00ad\u009bAÐ_ÿTg\fÀü£â\u0093hÖ\t·ZÂ7wWâ¸Rl\u008auË\u009cÓ\u0087ÏçOZÍÌ¨k¥Ãy\u001f\u0010ø\u0018QÇ¨\u000b¿m÷\u009eU\"\u001d\u0019=\u001d\u009bVb©d©\u009b5t¨é\u0080Tî\u0099åÃ<ÆÏ\u0000èï®îä©\u0015¹uóFYkº\u00036\u0004±\u0007>Ç,¥ Àc\u0090$´\u0089³ÇB?:y8\f\u0018m¬ºVé\u0012£Éd^sÕ5µþ¦d j7ò\u0091ÙrBT\u0087.úKð\u009d\\])\u0083äJ1ªSÊ\u0015JÌÒì!\u0080ËØg\bÏ\u009c+\u0003Ð\u0002¹Ôö\u008c\u0093\u0081s?Ç58¿\u000bsE\b:Mê#e|\u0000°4ò\u0019#*,J\u008e{u9Å\u00126þ`§}\u0084\u0086H\u0081þÅ´\u0081¼ý\u0081\t¦HÀ@Ò\u0093÷ÌXû\u0010PÕvëxîß)òqF\u0007&Ð{\u0088q\\ÏVR ;¨\u001c\u00ad\u001b$¾\u0016Ø\u008e$èü\u0099\u0094 = ØQ±l~_\u000f\u009e3Ê\u008a\u0094\u0011|\u0010ë¢à\u0002\u0092Ù\u0002Ljß\u0005Ût\u0004£¶\u0010¯÷ê\u009f\u0012©\u0002ÝìZÁð®ÈäÐ(w/Ê\u0089'\u0093.1Õ\u0005u\u001c/9\u009câ\u00ad(Oª\u0097\\\u009a¸lôé\u0002\\\u0084B\u008c¨bi{(Rª\u0016\u0010ÍTx\r³\u0080[=Øb'<Î`wU \u0098PÙu8Ì\"#'!\u008c\u0015\u0016íÅÔí³â]ÉÈ6LîW÷ÿº6\u0098\u009a\u0010\u008aÒü6CÔ\u009b\u009aÉ£\u0085]Ê\u0092ån\u0010>Ê¿ã÷\u0016Ï}Ë\u0097Y4BaÙ7\u0010\u0082åß\u0084\u008e\f\u009a\tò[¼HÓ-o+\u0010ð\u008d±¼L\u0083O·Ã9Óñ×\u0083Ù¯\u0018<ø4\u0089ß<ç~Æ\u0081\u0080\u0001åÇóÅ\u0091'¿U1Ø\u000eÝ(H\u001e\u0091JR\u001b\u0083ß-=«GÆ\u001c\u0007RÉ\u0083AØ^\u0003|>\u001aqÅg-\u0007¤l\u009d\u0094¾\u009c:¥6`\u0018.ù¦ð$÷\u0099ã\u008açñ}BÁì1SúCc\u001aÎf\u008b\u0010\n3Ø¶ð5vqûË\\Éîwÿ\u0098\u0010ZL\u007f²wÏçÊ\u009dæj ¤\u0080\u0084\u001f\u0010\u0012\u001d|êb¼ÀÑ\u0097*½TÐ\u008dÒM\u0010\u001er/<Ï\rª\u0080ú+_\r&hÁj(Âs´O¢öDy¸;ëº\u00157ÿn\u008bhm>\n¦\u0013d\u0015ËY´P*£óÜö<4æ}*@\u00105{n{Ó\u0098©ëä÷ Bª7\u009f²\u0080Z5\u0004ø\n¼8$Tx£ß{p\u008a\u0003«@©I\u0015Z£@¼¯sÏ\u0003\u001f\u0005.RüiGÙ#Õ:\u0085ÔÁ\u008e\u0014E\u0000àxdXÅ\u0011$\u0094tÆtn}\u0001Î\\üÓ\u009cÛ©\u0080àÔ((ò8$\u00adW\u008býÛzwßÎ0\u0082\u009bþ9E¶í¤Jìåiìä\u0015×Ûø\t&jOú¸\u009e\u0086[³y±Øn\u0085èy¤ùùÔA\u001d\u008b\u0010Fò`Jwá^\t=~\bÂÏá\u009a\u001f ?\u001f[óu.æOÙ\u0082e(fr§$×÷¦³à/\u0014\u0018Òã¸\u0086²V5[\u0010¶£z\u007f;vlâ\u009c6\u0087ßù;\u0018\u0011Řj\u0001f\u00adsÏ^\u001fE`þ(1\u000eùõLn\u00ad\u0095\u009fd%(²H3åhâ-ä°Ù\u0006\"é¶¦\u0002|/$5\nÑÆ\u001bÂ\u008c¿øRµ\u0090,\u0088Tmà_Ó\u0016£\u001dÓ©¹(Çu¿¸\u0007ûRÕ\u0017\u0088\u0080\u0081In\u0091r°Sí\u0086(Ã¥\u0092\u001aaÏ\u001d,d\u008c£ü\u0099<ïw»\u0019Ýðh<\u001c¾8¼\u0007tneF\u001cÆ®¶\u00adÑ\u0018¥\u000e\u009b\u001cþ\u0092V;¤\u0096\u0019c\u007fîýë&\u0083\b¢4mõ¹¤#\u0089Ç\u0016cR\u0000x·VÉ\u0090×\u001d\u001bK\u008füPEùlÏülÔVõPU¶\r¸\u0015`\u0005IÓ7\u000eÏ+\u008dõWÞuØ\u0001é#èªt\u0012-\u008dUî`£\u008eë>\u009b²+©\u009aÝX¦\\ó+õX\u001c\tü¦§\u0092k\u0014U\u007fp\tD'ÿ\u0091XØ\u009en\u0014cWv\u0007XsuË©¦èW¥\u0081\u008d\u009fËpµto{Ña37â\f\u0095ä\u0002\u009eí¤ Ík2\u0088«\u0002Náò\u001få¶©·nÞ}ß\u0089W\u009c_Û \u0011/°þgËDÄà\u0016Øýäs¥æ¥²-_ßn\u0082µÅÚö\u0097ëª~\u0096ÁQ\u0010êN\u001b\u0085áèMraÙ\u0082=\u0099Sà^\u0018ªØ\u0087Ê\u0012r\u008c-\u0095ªsx\u009a\u001c¸9hyô´ÀÝQx TÇ¾¬²ºì\u00934'\u0015L¦\u0007X{°Þ¿$v\f\u001a\u0085òAÈ\u0083ñ\u0017Âé â¨ÐQ\u008c_¾\u000b§U\u0002XÆ\u0098²$ùå\u001f\u009daWà\u001dl\u0088/ì\râwV\u0010\u0005\nßU\u0092CtÓ_[\u000f\u0092ì©ö\u001f E(}m\u0007\u001a\u0014O¹\nÖ}Çv\u001d\u008b\u0002\u0003gÞÔ\u000eëà\u000eûÖ·I½\u0088Ì\u0010^Àñ°n÷s~í\u009e7jÅÌÊE(ó \b¤Ï\u0018\u0017\u0080\u0080ñ¤d\u001b\u0004%±?ad\u0080o\u001bF\u0012\u0015TC\u0092º8e\u001fÅsU\u0084®çX·PÍk¡Z\u001bÏ|{Ä*]´2\u0012c\u008b½\r¶\u0093\u008aÿç\n¦BU4Dª¤\u0001e\u0010\u0093ê»NB±¾y\u0081\u009f\u008fËÃbzhµõUZ)\u0003|\u0011í\\\u008c\u0099ì\u0088³èNb\u0005øKúLØ\u009a.ªî±T ¨\u000eÜ4\u008aÑ\u0080_ë\rCÞ\u009f³ð::örQ\u0011\rÓ£\u0092\u0000ßJ0ÿ\u009c6\u0010P\u001eüfÜ\u0080Ì0ÿÑ\u0012¿·ûmê8\u008a_fyõXÆìÀÉÉ\u0015îî\u0015¶t\u0082i¿\u001cÐþÇ\u0082F:ÔDÓ\u008bÇm0Ì¸ç/íï\u000e\u0004©©\u0098åb©¼^(ú\u001eü\u0085é Ï\u000f7K0ýrI\u0087Y»úQæ?fÒ)\u0092méÅÔ\u0083¶¢è'\u008b\u0018ô²\u0010û\u0098\u00854\u000f{ÖÕ£ÒÕ\u001f)-í\u0097";
      int var6 = "\u008fî\u0001S\u0098¹8rÿÚÏ\u0007!\u009c\u0017P\u0004Îé¤úÌ!\u001b\u0010ã\ttOTõì`ãäcÏ\u0088:}r@\b¤\u0003ó\u00072v¸¶\u0091|y\"nî¼Ûo\u0002Þª\u009eDä?E6ñ^\u009e_h-\u0085§Ù\u0000÷,çÁ\u0099ð¬¹\"4\u000fz\b¾J80í9û¹×\u008a\u0086[:\u0001ʠÌi\u009a\u0085\u0017M5ÿ*\u0007YX0<\u001c×$E]\u001f.Ëª\u009c÷º!ì=\u001eR\u0003Òm\"gÛ¹í\u0097\u0001G\u0096\u001b*`¨\u001aÑìñøÑs\u0005+ÿ8\u009a_È`ñ\u0086ÛÂ\bM\u0092\u0090CÅÝ\u0092næ(\u0086\u0093\u0002q\u0088ëÛÓ\b\u008c\"3Úk>éFñ©\u000føê{þ¶\u0094æ\fC>pÀ\u009e\u000fÂÏ\u0001àÿe¬§B\u0091B\u0084\u001aåß\u0003M\u009d5\u000e\u0013Å%ôWÜ\u0013\u0012ºhØÏÞL»3J®\u0010\u0098\u0098S4ñÔWgI¥+õ\u000f\u008cÄ|¬%B\n\r×\u0080¯ñO´¬ææ\u0096pÎÞö\u0085%qX]hùg`\u001aô'öl©R\u0018zw¹>OÍsÌ-(¥\u00adÊ\u000b>è0À.F\u0091yDÏÒ\u0094ùý@\u0093y\u008dOÎ\u000fFÿÔ¬ÊjaÍZÊY\u0004ìûtµ¿\u0010ê\u00067¸\u0017Ä\u0085¶åNN¥J $Ûc\u0080ËÍ\u0093\u0099V[OÑ>´Ï|\u008d:u»ðç\u0090\u0090\u0086åÖ@V\u0093\u0084´]÷5\u00958\u008c1\u00075¸Z\u0010Q`è\u0018µ\u0086\u0010)\u0000ò\u0007hHõKV\u008c¿\u001a³Û\u0089(h\u0010b7ãÁ½-\\\u000f\u0000GUåÿ\rr¾\\S\u00969ï\u009d«¶\rÕ\u0096Mã(\u0097aD\u0014\u0094l¾\u001d\nÊ=¦.¤cÝ¹4Öd©\u0093ÿÇ\u0005C\u0011[\u001c\u0001\u00ad\u001c\u009dÿx\u0099À\u00ad\u009bAÐ_ÿTg\fÀü£â\u0093hÖ\t·ZÂ7wWâ¸Rl\u008auË\u009cÓ\u0087ÏçOZÍÌ¨k¥Ãy\u001f\u0010ø\u0018QÇ¨\u000b¿m÷\u009eU\"\u001d\u0019=\u001d\u009bVb©d©\u009b5t¨é\u0080Tî\u0099åÃ<ÆÏ\u0000èï®îä©\u0015¹uóFYkº\u00036\u0004±\u0007>Ç,¥ Àc\u0090$´\u0089³ÇB?:y8\f\u0018m¬ºVé\u0012£Éd^sÕ5µþ¦d j7ò\u0091ÙrBT\u0087.úKð\u009d\\])\u0083äJ1ªSÊ\u0015JÌÒì!\u0080ËØg\bÏ\u009c+\u0003Ð\u0002¹Ôö\u008c\u0093\u0081s?Ç58¿\u000bsE\b:Mê#e|\u0000°4ò\u0019#*,J\u008e{u9Å\u00126þ`§}\u0084\u0086H\u0081þÅ´\u0081¼ý\u0081\t¦HÀ@Ò\u0093÷ÌXû\u0010PÕvëxîß)òqF\u0007&Ð{\u0088q\\ÏVR ;¨\u001c\u00ad\u001b$¾\u0016Ø\u008e$èü\u0099\u0094 = ØQ±l~_\u000f\u009e3Ê\u008a\u0094\u0011|\u0010ë¢à\u0002\u0092Ù\u0002Ljß\u0005Ût\u0004£¶\u0010¯÷ê\u009f\u0012©\u0002ÝìZÁð®ÈäÐ(w/Ê\u0089'\u0093.1Õ\u0005u\u001c/9\u009câ\u00ad(Oª\u0097\\\u009a¸lôé\u0002\\\u0084B\u008c¨bi{(Rª\u0016\u0010ÍTx\r³\u0080[=Øb'<Î`wU \u0098PÙu8Ì\"#'!\u008c\u0015\u0016íÅÔí³â]ÉÈ6LîW÷ÿº6\u0098\u009a\u0010\u008aÒü6CÔ\u009b\u009aÉ£\u0085]Ê\u0092ån\u0010>Ê¿ã÷\u0016Ï}Ë\u0097Y4BaÙ7\u0010\u0082åß\u0084\u008e\f\u009a\tò[¼HÓ-o+\u0010ð\u008d±¼L\u0083O·Ã9Óñ×\u0083Ù¯\u0018<ø4\u0089ß<ç~Æ\u0081\u0080\u0001åÇóÅ\u0091'¿U1Ø\u000eÝ(H\u001e\u0091JR\u001b\u0083ß-=«GÆ\u001c\u0007RÉ\u0083AØ^\u0003|>\u001aqÅg-\u0007¤l\u009d\u0094¾\u009c:¥6`\u0018.ù¦ð$÷\u0099ã\u008açñ}BÁì1SúCc\u001aÎf\u008b\u0010\n3Ø¶ð5vqûË\\Éîwÿ\u0098\u0010ZL\u007f²wÏçÊ\u009dæj ¤\u0080\u0084\u001f\u0010\u0012\u001d|êb¼ÀÑ\u0097*½TÐ\u008dÒM\u0010\u001er/<Ï\rª\u0080ú+_\r&hÁj(Âs´O¢öDy¸;ëº\u00157ÿn\u008bhm>\n¦\u0013d\u0015ËY´P*£óÜö<4æ}*@\u00105{n{Ó\u0098©ëä÷ Bª7\u009f²\u0080Z5\u0004ø\n¼8$Tx£ß{p\u008a\u0003«@©I\u0015Z£@¼¯sÏ\u0003\u001f\u0005.RüiGÙ#Õ:\u0085ÔÁ\u008e\u0014E\u0000àxdXÅ\u0011$\u0094tÆtn}\u0001Î\\üÓ\u009cÛ©\u0080àÔ((ò8$\u00adW\u008býÛzwßÎ0\u0082\u009bþ9E¶í¤Jìåiìä\u0015×Ûø\t&jOú¸\u009e\u0086[³y±Øn\u0085èy¤ùùÔA\u001d\u008b\u0010Fò`Jwá^\t=~\bÂÏá\u009a\u001f ?\u001f[óu.æOÙ\u0082e(fr§$×÷¦³à/\u0014\u0018Òã¸\u0086²V5[\u0010¶£z\u007f;vlâ\u009c6\u0087ßù;\u0018\u0011Řj\u0001f\u00adsÏ^\u001fE`þ(1\u000eùõLn\u00ad\u0095\u009fd%(²H3åhâ-ä°Ù\u0006\"é¶¦\u0002|/$5\nÑÆ\u001bÂ\u008c¿øRµ\u0090,\u0088Tmà_Ó\u0016£\u001dÓ©¹(Çu¿¸\u0007ûRÕ\u0017\u0088\u0080\u0081In\u0091r°Sí\u0086(Ã¥\u0092\u001aaÏ\u001d,d\u008c£ü\u0099<ïw»\u0019Ýðh<\u001c¾8¼\u0007tneF\u001cÆ®¶\u00adÑ\u0018¥\u000e\u009b\u001cþ\u0092V;¤\u0096\u0019c\u007fîýë&\u0083\b¢4mõ¹¤#\u0089Ç\u0016cR\u0000x·VÉ\u0090×\u001d\u001bK\u008füPEùlÏülÔVõPU¶\r¸\u0015`\u0005IÓ7\u000eÏ+\u008dõWÞuØ\u0001é#èªt\u0012-\u008dUî`£\u008eë>\u009b²+©\u009aÝX¦\\ó+õX\u001c\tü¦§\u0092k\u0014U\u007fp\tD'ÿ\u0091XØ\u009en\u0014cWv\u0007XsuË©¦èW¥\u0081\u008d\u009fËpµto{Ña37â\f\u0095ä\u0002\u009eí¤ Ík2\u0088«\u0002Náò\u001få¶©·nÞ}ß\u0089W\u009c_Û \u0011/°þgËDÄà\u0016Øýäs¥æ¥²-_ßn\u0082µÅÚö\u0097ëª~\u0096ÁQ\u0010êN\u001b\u0085áèMraÙ\u0082=\u0099Sà^\u0018ªØ\u0087Ê\u0012r\u008c-\u0095ªsx\u009a\u001c¸9hyô´ÀÝQx TÇ¾¬²ºì\u00934'\u0015L¦\u0007X{°Þ¿$v\f\u001a\u0085òAÈ\u0083ñ\u0017Âé â¨ÐQ\u008c_¾\u000b§U\u0002XÆ\u0098²$ùå\u001f\u009daWà\u001dl\u0088/ì\râwV\u0010\u0005\nßU\u0092CtÓ_[\u000f\u0092ì©ö\u001f E(}m\u0007\u001a\u0014O¹\nÖ}Çv\u001d\u008b\u0002\u0003gÞÔ\u000eëà\u000eûÖ·I½\u0088Ì\u0010^Àñ°n÷s~í\u009e7jÅÌÊE(ó \b¤Ï\u0018\u0017\u0080\u0080ñ¤d\u001b\u0004%±?ad\u0080o\u001bF\u0012\u0015TC\u0092º8e\u001fÅsU\u0084®çX·PÍk¡Z\u001bÏ|{Ä*]´2\u0012c\u008b½\r¶\u0093\u008aÿç\n¦BU4Dª¤\u0001e\u0010\u0093ê»NB±¾y\u0081\u009f\u008fËÃbzhµõUZ)\u0003|\u0011í\\\u008c\u0099ì\u0088³èNb\u0005øKúLØ\u009a.ªî±T ¨\u000eÜ4\u008aÑ\u0080_ë\rCÞ\u009f³ð::örQ\u0011\rÓ£\u0092\u0000ßJ0ÿ\u009c6\u0010P\u001eüfÜ\u0080Ì0ÿÑ\u0012¿·ûmê8\u008a_fyõXÆìÀÉÉ\u0015îî\u0015¶t\u0082i¿\u001cÐþÇ\u0082F:ÔDÓ\u008bÇm0Ì¸ç/íï\u000e\u0004©©\u0098åb©¼^(ú\u001eü\u0085é Ï\u000f7K0ýrI\u0087Y»úQæ?fÒ)\u0092méÅÔ\u0083¶¢è'\u008b\u0018ô²\u0010û\u0098\u00854\u000f{ÖÕ£ÒÕ\u001f)-í\u0097"
         .length();
      char var3 = '\u0018';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
         byte var10001 = -1;
         var7[var5++] = var23;
         if ((var2 += var3) >= var6) {
            var4 = "\u0088\u009b\rÎ\u0086ºÚ\u0003U`V\u0019rÉ~8ù#\"Þé\u0004\bj#9\u008dò®ùçÜ¼\u0089\u0000%G_ÖÂ8+lÍ\u009aË\u0099§\u00adß2\u0099Ò_ÿ(SÉßA\u0083°Ý%1\nªJµ¬§¢\u000b\tósYÂ'ÿ:9`Ë\u0083\tpVô<«=t+Yï³";
            var6 = "\u0088\u009b\rÎ\u0086ºÚ\u0003U`V\u0019rÉ~8ù#\"Þé\u0004\bj#9\u008dò®ùçÜ¼\u0089\u0000%G_ÖÂ8+lÍ\u009aË\u0099§\u00adß2\u0099Ò_ÿ(SÉßA\u0083°Ý%1\nªJµ¬§¢\u000b\tósYÂ'ÿ:9`Ë\u0083\tpVô<«=t+Yï³"
               .length();
            var3 = '(';
            var2 = -1;

            while (true) {
               var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
               String var25 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
               boolean var21 = false;
               var7[var5++] = var25;
               if ((var2 += var3) >= var6) {
                  lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var7;
                  IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new String[44];
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll();
                  lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$5a5f98e7e6a477dc(
                     var11
                  );
                  return;
               }

               var3 = var4.charAt(var2);
            }
         }

         var3 = var4.charAt(var2);
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 22614;
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
               "me/octo/client/utils/client/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll", var10
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
            "me/octo/client/utils/client/IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$070b60110ace0458(
      @NotNull String titleArg, @NotNull String messageArg, long argument3Arg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final TrayIcon IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$5a5f98e7e6a477dc(long var1) {
      var1 = 45331893695198L;
      var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var1;
      TrayIcon var30;
      if (SystemTray.isSupported()) {
         SystemTray var3 = SystemTray.getSystemTray();

         BufferedImage var5;
         try {
            label82: {
               InputStream var10000 = this.getClass().getResourceAsStream("/assets/polinex/logo64.png");
               if (var10000 != null) {
                  var var7 = var10000;
                  Throwable var8 = null;

                  BufferedImage var26;
                  try {
                     InputStream var9 = var7;
                     boolean var10 = false;
                     var26 = ImageIO.read(var9);
                  } catch (Throwable var18) {
                     var8 = var18;
                     throw var18;
                  } finally {
                     CloseableKt.closeFinally(var7, var8);
                  }

                  var28 = var26;
                  if (var26 != null) {
                     break label82;
                  }
               }

               short var29 = 5119;
               IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var25 = this;
               long var10001 = 1307494176350495208L ^ var1;
               boolean var27 = false;
               System.out.println("Resource not found: logo64");
               var28 = null;
            }

            var5 = var28;
         } catch (IOException var21) {
            var21.printStackTrace();
            var5 = null;
         }

         BufferedImage var4 = var5;

         try {
            if (var4 == null) {
               System.out.println("Failed to load notification icon.");
               return null;
            }
         } catch (Throwable var20) {
            throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var20);
         }

         TrayIcon var24 = new TrayIcon(var5, "Polinex");
         var24.setImageAutoSize(true);

         TrayIcon var6;
         try {
            var3.add(var24);
            var6 = var24;
         } catch (AWTException var17) {
            var17.printStackTrace();
            var6 = null;
         }

         var30 = var6;
      } else {
         var30 = null;
      }

      return var30;
   }

   private final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII$recovered$2d308125b9ab2034(
      String var1, String var2, long var3
   ) {
      var3 = 136585752733424L;
      var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var3;

      try {
         Runtime var10000 = Runtime.getRuntime();
         String[] var6 = new String[]{"osascript", "-e", "display notification \"" + var2 + "\" with title \"" + var1 + "\""};
         Process var5 = var10000.exec(var6);
         var5.waitFor();
      } catch (Exception var7) {
         var7.printStackTrace();
      }
   }

   private final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl$recovered$5a550bdec9b0141d(
      String var1, String var2, long var3
   ) {
      var3 = 10005876707174L;
      var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var3;
      long var10001 = var3 ^ 70795007562925L;
      int var5 = (int)((var3 ^ 70795007562925L) >>> 48);
      int var6 = (int)((var3 ^ 70795007562925L) << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      int var9 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();

      try {
         IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var33;
         label66: {
            label65: {
               IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var16;
               label73: {
                  try {
                     var16 = this;
                     if (var9 != 0) {
                        break label73;
                     }

                     if (!this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$4a6728be3834c3f7(
                        (char)var5, var6, "notify-send", (short)var7
                     )) {
                        break label65;
                     }
                  } catch (Exception var22) {
                     throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var22);
                  }

                  Runtime var10000 = Runtime.getRuntime();
                  String[] var11 = new String[]{"notify-send", var1, var2};
                  Process var10 = var10000.exec(var11);
                  int var28 = var10.waitFor();

                  try {
                     if (var28 == 0) {
                        return;
                     }
                     break label65;
                  } catch (Exception var21) {
                     throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var21);
                  }
               }

               var33 = var16;
               break label66;
            }

            var33 = this;
         }

         String var18 = "kdialog";
         IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll var17 = var33;
         String var37;
         if (var9 == 0) {
            if (var17.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$4a6728be3834c3f7(
               (char)var5, var6, var18, (short)var7
            )) {
               Runtime var34 = Runtime.getRuntime();
               String[] var29 = new String[]{"kdialog", "--passivepopup", var2, "5", "--title", var1};
               Process var26 = var34.exec(var29);
               int var30 = var26.waitFor();

               try {
                  if (var30 == 0) {
                     return;
                  }
               } catch (Exception var20) {
                  throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var20);
               }
            }

            var33 = this;
            var37 = "zenity";
         } else {
            var33 = var17;
            var37 = var18;
         }

         String var8 = var37;
         if (var33.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$4a6728be3834c3f7(
            (char)var5, var6, var8, (short)var7
         )) {
            Runtime var36 = Runtime.getRuntime();
            String[] var31 = new String[]{"zenity", "--notification", "--text=" + var1 + ": " + var2};
            Process var27 = var36.exec(var31);
            if (var9 != 0) {
               return;
            }

            int var32 = var27.waitFor();

            try {
               if (var32 == 0) {
                  return;
               }
            } catch (Exception var19) {
               throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var19);
            }
         }

         System.out.println("Desktop Notification: " + var1 + " - " + var2);
      } catch (Exception var23) {
         var23.printStackTrace();
         System.out.println("Desktop Notification: " + var1 + " - " + var2);
      }
   }

   private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI$recovered$dfa1c224b04efef9(
      String var1, String var2, int var3, int var4
   ) {
      short var15 = 29567;
      var4 = 1606448832;
      long var5 = ((long)var15 << 32 | (long)var4 << 32 >>> 32) ^ IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      int var7 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();

      TrayIcon var10000;
      label32: {
         label27: {
            try {
               var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               if (var7 != 0) {
                  break label32;
               }

               if (lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII == null) {
                  break label27;
               }
            } catch (Exception var14) {
               throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var14);
            }

            var10000 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
            break label32;
         }

         try {
            String var8 = StringsKt.replace$default(var1, "'", "\\'", false, 4, null);
            String var9 = StringsKt.replace$default(var2, "'", "\\'", false, 4, null);
            String var10 = StringsKt.trimIndent(
               "\n                [Windows.UI.Notifications.ToastNotificationManager, Windows.UI.Notifications, ContentType = WindowsRuntime] | Out-Null\n                $template = [Windows.UI.Notifications.ToastNotificationManager]::GetTemplateContent([Windows.UI.Notifications.ToastTemplateType]::ToastText02)\n                $nodes = $template.GetElementsByTagName('text')\n                $nodes.Item(0).AppendChild($template.CreateTextNode('"
                  + var8
                  + "')) | Out-Null\n                $nodes.Item(1).AppendChild($template.CreateTextNode('"
                  + var9
                  + "')) | Out-Null\n                $toast = [Windows.UI.Notifications.ToastNotification]::new($template)\n                [Windows.UI.Notifications.ToastNotificationManager]::CreateToastNotifier('Polinex').Show($toast)\n            "
            );
            Runtime var17 = Runtime.getRuntime();
            String[] var11 = new String[]{"powershell", "-NoProfile", "-NonInteractive", "-Command", var10};
            var17.exec(var11);
         } catch (Exception var13) {
            var13.printStackTrace();
         }

         return;
      }

      var10000.displayMessage(var1, var2, MessageType.INFO);
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$4a6728be3834c3f7(
      char var1, int var2, String var3, short var4
   ) {
      byte var13 = 0;
      var2 = 1519900336;
      var4 = -31873;
      long var5 = ((long)var13 << 48 | (long)var2 << 32 >>> 16 | (long)var4 << 48 >>> 48)
         ^ IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      int var7 = llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI();

      int var8;
      try {
         Runtime var10000 = Runtime.getRuntime();
         String[] var9 = new String[]{"sh", "-c", "command -v " + var3};
         Process var16 = var10000.exec(var9);
         int var17 = var16.waitFor();

         label27: {
            label26: {
               try {
                  var18 = var17;
                  if (var7 != 0) {
                     break label27;
                  }

                  if (var17 == 0) {
                     break label26;
                  }
               } catch (Exception var11) {
                  throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var11);
               }

               var18 = 0;
               break label27;
            }

            var18 = 1;
         }

         var8 = var18;
      } catch (Exception var12) {
         var8 = 0;
      }

      return (boolean)var8;
   }
}
