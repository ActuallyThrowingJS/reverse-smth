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
import java.util.NoSuchElementException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.CollectionsKt;
import me.octo.client.utils.skyblock.mining.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import net.minecraft.core.BlockPos;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class llIlIlIlIllllIlIIllIllIllllIIIllIIIIIIlllIIIIlIIllllIlIIIIlllIIIIIIIIIIlIIIlIlIIIlIlI
   extends me.octo.client.modules.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII {
   @NotNull
   public static llIlIlIlIllllIlIIllIllIllllIIIllIIIIIIlllIIIIlIIllllIlIIIIlllIIIIIIIIIIlIIIlIlIIIlIlI llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   @NotNull
   private static HashMap<String, me.octo.client.utils.skyblock.mining.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI> lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   private static long IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = 120331022779731L;
   private static String[] IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   private static String[] lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   private static Map IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = new HashMap(13);

   private llIlIlIlIllllIlIIllIllIllllIIIllIIIIIIlllIIIIlIIllllIlIIIIlllIIIIIIIIIIlIIIlIlIIIlIlI() {
      long var1 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll ^ 38975675596712L;
      me.octo.client.modules.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[] var3 = new me.octo.client.modules.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI[]{
         me.octo.client.modules.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.MINE
      };
      List var10005 = CollectionsKt.arrayListOf(var3);
      me.octo.client.modules.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10007 = me.octo.client.modules.lIIllIlIIllIIIlIIlIIlIIllIIllIIIllIIIlIlIIlIlIlIlIlIllIllIlIIlIIIllIlIIIlIIlIIlIIIlII.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.FOLDER;
      String[] var4 = new String[]{
         "Lava Springs", "Upper Mines", "Royal Mines", "Cliffside Veins", "Rampart's Quarry", "Goblin Slayer", "Glacite Walker Slayer"
      };
      super(
         "Dwarven Commission Editor",
         "DwarvenCommissionMacro-Routes",
         "DwarvenCommissionMacro",
         "dwarven_commission",
         var10005,
         "dwarven",
         var10007,
         null,
         CollectionsKt.listOf(var4),
         false,
         false,
         false,
         false,
         7808,
         null
      );
   }

   @Override
   public boolean IIIlIIlIllIlllIIIIlllIlIIIlIIIlIIlIIlIIllIIIlIlIlIlllIllIlIllIllIIlIlIllIIIIIllIlllll(long var1) {
      return false;
   }

   @Override
   public boolean IIlIIIIllIlIIlIIIlllIlIlIIllllIlIIIllIIlIlllIlIlllIIlIIIIllIIllllIlIlllIlIlIIlllllIII(long var1) {
      return me.octo.client.utils.skyblock.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI()
         == me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.DWARVEN_MINES;
   }

   @Nullable
   @Override
   public String lIIIlIIlIllIlIIIIIllIlIllllIIlIlIIIlIlIIIIIlIlllllIllllIIIIlllIlIlIlIlIIllIlIIIIIIIII(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   @Override
   public String lIlllIIIIIIIIIIllIlIllIlIllIIlIIlIIIIlIllIllIlIIIllIlllIlIIlllIIlIIIllIllIlIIIIllIlll(long var1) {
      long var3 = var1 ^ 104542227572120L;
      String var5 = IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII()
         .IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl(var3);

      try {
         if (this.getTargetNames().contains(var5)) {
            return var5;
         }
      } catch (NoSuchElementException var6) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var6, -2579938724283621915L, var1
         );
      }

      return null;
   }

   @NotNull
   @Override
   public ArrayList IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl(int param1, short param2, char param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Nullable
   @Override
   public ArrayList llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(short param1, long param2, int param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   @Override
   public me.octo.client.gui.clickgui.settings.impl.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI lIllIllIlIllIlIlIIIlllIlllIlllIIIIIIIlIllllIIlIIIlIllIllIlIlIIlIIIlIlIlllIlllIIIIlIII() {
      return IllIIIIlIIIIIllllIlIIllIIllllIIIIlllIllIllllIIlIIlIIIIlIlIIlIIlIIlIIIlllIIllllllIIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI();
   }

   @Nullable
   public final me.octo.client.utils.skyblock.mining.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(
      @NotNull String param1, long param2
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   public final lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll lIIlIllIlllIIIlllIIllIIlIllIllIllIIIIIllllllIllIllllIIIIlllIllIlIIIIlIIlIlllIlIIIllll(
      int param1, short param2, char param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   static {
      long var9 = IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll ^ 112824863890813L;
      long var11 = var9 ^ 121441587704785L;
      long var13 = var9 ^ 120580756680395L;
      long var10001 = var9 ^ 7169955881064L;
      int var15 = (int)((var9 ^ 7169955881064L) >>> 32);
      int var16 = (int)((var9 ^ 7169955881064L) << 32 >>> 48);
      int var17 = (int)(var10001 << 48 >>> 48);
      var10001 = var9 ^ 106164417115471L;
      int var18 = (int)((var9 ^ 106164417115471L) >>> 32);
      int var19 = (int)((var9 ^ 106164417115471L) << 32 >>> 48);
      int var20 = (int)(var10001 << 48 >>> 48);
      long var21 = var9 ^ 121310488029536L;
      long var23 = var9 ^ 55324463665232L;
      long var25 = var9 ^ 110664534234499L;
      Cipher var0;
      Cipher var10000 = var0 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var1 = 1; var1 < 8; var1++) {
         var10003[var1] = (byte)(var9 << var1 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var7 = new String[16];
      int var5 = 0;
      String var4 = "÷z;\byÑáuñGgp\u008d!\u0098¸Ö»¨&\u008aÉ\u0018ò(\u0003Ôò\u009cÝ+Êèw©Å×\u0014\u0013LT\u0083³8®\u0098Î\u0011'\u0004\u000e\u008f\u0013\u007fçE\u000b\u0002\u00173Cmè\u0084Í(k\u0005*#\u0085LS\u0013¬\u0090\täÉ\u001amé§ðZ\"ÙÎ9Ïâ iYõë5¤¯½ÎÞàT~N8Ñ\u0002õ]é\u008b÷³b\u007fj³$£U·|;§<ñÉF\u0082\b\"ä\u0080éQÆyÍ÷k.ô,ç\u000bKÅëùúÅûVB¸Æ\u0007\u008d\u0017ý®(\u001a\u008a\u0017qê\u0094\u00174\r\u0016Ý¸\u0097@ßÄÖhºV\u0092\u0094}«Ä\u0089G\u008aTÜþ\u0087n'\u0004ô\u008a\u001c®d !ðúäUòWïþcq*tàÈ\u0012^¤¾Êqß¬UÇO\u008c\u0007®l\u0082+(\u0015x¥B\u0081ÁQw\u0003y@ÛF7Röáº·d ßÈk\u007fr\u0086\\\u0089Õ\u001d\u001aèo[FïDÛÕ ùVEuá\u0098\u001b\u0094W1\u0007\u0012ÿ\u0093_£\u0089Äº\u0016aÃW\u0018RõÛ(E\u0019°»0T¾µ\u009d\u008fþÿÁ1Å\u001f,\u009bÆ0µ\u0004Pî\n\u008cÞ\\Bod\fÏ\u0091\u0088æ\u001c\u000e}\u0016à¼+M8{<Õ\u008f~\u0003\u0014· ê¿À}Ôb\u000fkÛ6hg¾`\nO\u0007IØèÿP,\u0081\"dãÍbãb\u0007 I¤\u001eÊ\fVÛâ_®*\u001a\u000e\u0092\bà§»\u0001`PÝªÑk|Ô¬\u0000õ\u0082\\\u0010(×MOÀ|nÌ\\\tä\u0010\u0091÷\u009ee(\u0089Ë D\u0088\u000f½\u0014êCþ½\rZ\u0003ZXï\u009e@ò\u00048Ã{T\u0083|É\u0097;ü¦\"\"3ç7Øø í\u001e\u0098\u00856]g6Â¼\u0098»»\u000e\b¢\u0002ÌÿH\u0000Úç(Éá_ï¸\u000e\u00937";
      int var6 = "÷z;\byÑáuñGgp\u008d!\u0098¸Ö»¨&\u008aÉ\u0018ò(\u0003Ôò\u009cÝ+Êèw©Å×\u0014\u0013LT\u0083³8®\u0098Î\u0011'\u0004\u000e\u008f\u0013\u007fçE\u000b\u0002\u00173Cmè\u0084Í(k\u0005*#\u0085LS\u0013¬\u0090\täÉ\u001amé§ðZ\"ÙÎ9Ïâ iYõë5¤¯½ÎÞàT~N8Ñ\u0002õ]é\u008b÷³b\u007fj³$£U·|;§<ñÉF\u0082\b\"ä\u0080éQÆyÍ÷k.ô,ç\u000bKÅëùúÅûVB¸Æ\u0007\u008d\u0017ý®(\u001a\u008a\u0017qê\u0094\u00174\r\u0016Ý¸\u0097@ßÄÖhºV\u0092\u0094}«Ä\u0089G\u008aTÜþ\u0087n'\u0004ô\u008a\u001c®d !ðúäUòWïþcq*tàÈ\u0012^¤¾Êqß¬UÇO\u008c\u0007®l\u0082+(\u0015x¥B\u0081ÁQw\u0003y@ÛF7Röáº·d ßÈk\u007fr\u0086\\\u0089Õ\u001d\u001aèo[FïDÛÕ ùVEuá\u0098\u001b\u0094W1\u0007\u0012ÿ\u0093_£\u0089Äº\u0016aÃW\u0018RõÛ(E\u0019°»0T¾µ\u009d\u008fþÿÁ1Å\u001f,\u009bÆ0µ\u0004Pî\n\u008cÞ\\Bod\fÏ\u0091\u0088æ\u001c\u000e}\u0016à¼+M8{<Õ\u008f~\u0003\u0014· ê¿À}Ôb\u000fkÛ6hg¾`\nO\u0007IØèÿP,\u0081\"dãÍbãb\u0007 I¤\u001eÊ\fVÛâ_®*\u001a\u000e\u0092\bà§»\u0001`PÝªÑk|Ô¬\u0000õ\u0082\\\u0010(×MOÀ|nÌ\\\tä\u0010\u0091÷\u009ee(\u0089Ë D\u0088\u000f½\u0014êCþ½\rZ\u0003ZXï\u009e@ò\u00048Ã{T\u0083|É\u0097;ü¦\"\"3ç7Øø í\u001e\u0098\u00856]g6Â¼\u0098»»\u000e\b¢\u0002ÌÿH\u0000Úç(Éá_ï¸\u000e\u00937"
         .length();
      char var3 = '\u0018';
      int var2 = -1;

      while (true) {
         byte[] var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
         String var61 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var8).intern();
         byte var57 = -1;
         var7[var5++] = var61;
         if ((var2 += var3) >= var6) {
            var4 = "Ãs\u0017º\u000e(@\u0001\u0006a\u0081ÙTÂ.¥76É Ý8äÃ\u0018e¿7\u0093@¡\u00919ø8±<\n.¦ñ\u009c\u0089È\u0005Z¬â`";
            var6 = "Ãs\u0017º\u000e(@\u0001\u0006a\u0081ÙTÂ.¥76É Ý8äÃ\u0018e¿7\u0093@¡\u00919ø8±<\n.¦ñ\u009c\u0089È\u0005Z¬â`".length();
            var3 = '\u0018';
            var2 = -1;

            while (true) {
               var8 = var0.doFinal(var4.substring(++var2, var2 + var3).getBytes("ISO-8859-1"));
               String var63 = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var8).intern();
               boolean var59 = false;
               var7[var5++] = var63;
               if ((var2 += var3) >= var6) {
                  IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = var7;
                  lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = new String[16];
                  llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = new llIlIlIlIllllIlIIllIllIllllIIIllIIIIIIlllIIIIlIIllllIlIIIIlllIIIIIIIIIIlIIIlIlIIIlIlI();
                  lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = new HashMap<>();
                  Map var27 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
                  Object var28 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(0);
                  String var65 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(0);
                  lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll var70 = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     new BlockPos(58, 197, -10), new Vec3(58.5, 199.52, -8.5)
                  );
                  BlockPos[] var29 = new BlockPos[]{new BlockPos(52, 197, -25), new BlockPos(43, 197, -19), new BlockPos(60, 220, -30)};
                  List var10004 = CollectionsKt.listOf(var29);
                  var29 = new BlockPos[]{new BlockPos(52, 214, -30), new BlockPos(52, 205, 16)};
                  me.octo.client.utils.skyblock.mining.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var46 = new me.octo.client.utils.skyblock.mining.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
                     var65,
                     var70,
                     var10004,
                     CollectionsKt.listOf(var29),
                     me.octo.client.utils.skyblock.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI::IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll
                  );
                  var27.put(var28, var46);
                  var27 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
                  var28 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(1);
                  String var66 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(1);
                  lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll var71 = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     new BlockPos(-132, 173, -52), new Vec3(-132.5, 175.52, -50.5)
                  );
                  var29 = new BlockPos[]{new BlockPos(-111, 166, -75), new BlockPos(-124, 170, -74), new BlockPos(-77, 187, -71)};
                  me.octo.client.utils.skyblock.mining.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var48 = new me.octo.client.utils.skyblock.mining.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
                     var66,
                     var71,
                     CollectionsKt.listOf(var29),
                     CollectionsKt.emptyList(),
                     me.octo.client.utils.skyblock.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI::lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl
                  );
                  var27.put(var28, var48);
                  var27 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
                  var28 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(2);
                  String var67 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(2);
                  lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll var72 = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     new BlockPos(170, 149, 32), new Vec3(171.5, 151.52, 31.5)
                  );
                  var29 = new BlockPos[]{new BlockPos(140, 152, 30), new BlockPos(141, 152, 26), new BlockPos(167, 148, 87)};
                  var10004 = CollectionsKt.listOf(var29);
                  var29 = new BlockPos[]{new BlockPos(114, 158, 23), new BlockPos(106, 163, 31)};
                  me.octo.client.utils.skyblock.mining.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var51 = new me.octo.client.utils.skyblock.mining.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
                     var67,
                     var72,
                     var10004,
                     CollectionsKt.listOf(var29),
                     me.octo.client.utils.skyblock.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI::IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl
                  );
                  var27.put(var28, var51);
                  var27 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
                  var28 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(3);
                  String var68 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(3);
                  lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll var73 = new lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll(
                     new BlockPos(43, 134, 21), new Vec3(42.5, 136.02, 22.5)
                  );
                  var29 = new BlockPos[]{new BlockPos(13, 127, 37), new BlockPos(-14, 126, 34), new BlockPos(8, 128, 39)};
                  me.octo.client.utils.skyblock.mining.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var53 = new me.octo.client.utils.skyblock.mining.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
                     var68,
                     var73,
                     CollectionsKt.listOf(var29),
                     CollectionsKt.listOf(new BlockPos(-8, 135, 35)),
                     me.octo.client.utils.skyblock.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI::IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI
                  );
                  var27.put(var28, var53);
                  var27 = lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
                  var28 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(4);
                  String var69 = llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(4);
                  var10004 = CollectionsKt.listOf(new BlockPos(-89, 146, -13));
                  var29 = new BlockPos[]{new BlockPos(-74, 169, -59), new BlockPos(-70, 178, -60)};
                  me.octo.client.utils.skyblock.mining.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI var55 = new me.octo.client.utils.skyblock.mining.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
                     var69,
                     null,
                     var10004,
                     CollectionsKt.listOf(var29),
                     me.octo.client.utils.skyblock.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI::IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII
                  );
                  var27.put(var28, var55);
                  lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.put(
                     llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(5),
                     new me.octo.client.utils.skyblock.mining.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(5),
                        null,
                        CollectionsKt.listOf(new BlockPos(-104, 144, 139)),
                        CollectionsKt.emptyList(),
                        me.octo.client.utils.skyblock.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI::IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI
                     )
                  );
                  lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII.put(
                     llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(6),
                     new me.octo.client.utils.skyblock.mining.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
                        llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI.getTargetNames().get(6),
                        null,
                        CollectionsKt.listOf(new BlockPos(5, 127, 151)),
                        CollectionsKt.emptyList(),
                        me.octo.client.utils.skyblock.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI::IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII
                     )
                  );
                  return;
               }

               var3 = var4.charAt(var2);
            }
         }

         var3 = var4.charAt(var2);
      }
   }

   private static NoSuchElementException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(NoSuchElementException var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 4153;
      if (lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/llIlIlIlIllllIlIIllIllIllllIIIllIIIIIIlllIIIIlIIllllIlIIIIlllIIIIIIIIIIlIIIlIlIIIlIlI", var10
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
         byte[] var9 = IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI[var5].getBytes("ISO-8859-1");
         lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI[var5] = llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI[var5];
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
            "me/octo/client/modules/impl/macros/llIlIlIlIllllIlIIllIllIllllIIIllIIIIIIlllIIIIlIIllllIlIIIIlllIIIIIIIIIIlIIIlIlIIIlIlI"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   @Nullable
   public final me.octo.client.utils.skyblock.mining.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI$recovered$e2bf7048f1a92c2f(
      @NotNull String commissionNameArg, long argument2Arg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }
}
