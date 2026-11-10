package me.octo.client.utils.player.pathfinder;

import java.util.HashMap;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import net.minecraft.core.BlockPos;
import org.jetbrains.annotations.NotNull;

public final class IllIIlIIIIlIIIlIlIlllllIIIIlllllIlIllIllIIllIIlllIllllIIIlIIIllIIlIIIIllIlIlIIIlllIll {
   private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 120276481500775L;

   @NotNull
   public static final HashMap IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var0) {
      var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var0;
      String var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -6655622227970470353L, var0
      );
      Pair[] var3 = new Pair[3];
      me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10003 = me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.DWARVEN_MINES;
      Pair[] var4 = new Pair[67];
      var4[0] = TuplesKt.to(new BlockPos(41, 127, 41), CollectionsKt.listOf(new BlockPos(51, 161, 59)));
      var4[1] = TuplesKt.to(new BlockPos(-8, 135, 35), CollectionsKt.listOf(new BlockPos(6, 127, 45)));
      var4[2] = TuplesKt.to(new BlockPos(6, 127, 45), CollectionsKt.listOf(new BlockPos(-8, 135, 35)));
      var4[3] = TuplesKt.to(new BlockPos(-16, 127, 47), CollectionsKt.listOf(new BlockPos(-8, 135, 35)));
      var4[4] = TuplesKt.to(new BlockPos(-37, 132, 27), CollectionsKt.listOf(new BlockPos(-9, 135, 35)));
      var4[5] = TuplesKt.to(new BlockPos(97, 148, 40), CollectionsKt.listOf(new BlockPos(69, 137, 40)));
      var4[6] = TuplesKt.to(new BlockPos(69, 137, 40), CollectionsKt.listOf(new BlockPos(50, 135, 22)));
      var4[7] = TuplesKt.to(new BlockPos(66, 137, 40), CollectionsKt.listOf(new BlockPos(22, 127, 41)));
      var4[8] = TuplesKt.to(new BlockPos(12, 127, 48), CollectionsKt.listOf(new BlockPos(8, 128, 39)));
      BlockPos var10006 = new BlockPos(39, 127, 41);
      BlockPos[] var5 = new BlockPos[]{new BlockPos(41, 134, 24), new BlockPos(37, 135, 17)};
      var4[9] = TuplesKt.to(var10006, CollectionsKt.listOf(var5));
      var4[10] = TuplesKt.to(new BlockPos(41, 134, 24), CollectionsKt.listOf(new BlockPos(22, 127, 41)));
      var4[11] = TuplesKt.to(new BlockPos(11, 127, 55), CollectionsKt.listOf(new BlockPos(41, 134, 24)));
      var4[12] = TuplesKt.to(new BlockPos(-89, 145, 1), CollectionsKt.listOf(new BlockPos(-89, 146, -6)));
      var10006 = new BlockPos(-81, 155, -40);
      var5 = new BlockPos[]{new BlockPos(-75, 169, -51), new BlockPos(-71, 178, -51)};
      var4[13] = TuplesKt.to(var10006, CollectionsKt.listOf(var5));
      var4[14] = TuplesKt.to(new BlockPos(-75, 169, -51), CollectionsKt.listOf(new BlockPos(-92, 187, -49)));
      var4[15] = TuplesKt.to(new BlockPos(2, 181, -32), CollectionsKt.listOf(new BlockPos(33, 197, -6)));
      var4[16] = TuplesKt.to(new BlockPos(-82, 155, -41), CollectionsKt.listOf(new BlockPos(-81, 182, -51)));
      var4[17] = TuplesKt.to(new BlockPos(-107, 185, -64), CollectionsKt.listOf(new BlockPos(-79, 187, -70)));
      var4[18] = TuplesKt.to(new BlockPos(-80, 186, -65), CollectionsKt.listOf(new BlockPos(-78, 187, -70)));
      var10006 = new BlockPos(0, 148, -67);
      var5 = new BlockPos[]{new BlockPos(3, 165, -12), new BlockPos(-3, 165, -12), new BlockPos(6, 146, -32), new BlockPos(-6, 146, -31)};
      var4[19] = TuplesKt.to(var10006, CollectionsKt.listOf(var5));
      var4[20] = TuplesKt.to(new BlockPos(3, 165, -12), CollectionsKt.listOf(new BlockPos(34, 200, -11)));
      var4[21] = TuplesKt.to(new BlockPos(55, 197, -13), CollectionsKt.listOf(new BlockPos(55, 213, -24)));
      var4[22] = TuplesKt.to(new BlockPos(60, 213, -23), CollectionsKt.listOf(new BlockPos(60, 213, -23)));
      var10006 = new BlockPos(55, 213, -24);
      var5 = new BlockPos[]{new BlockPos(52, 214, -30), new BlockPos(57, 197, -12)};
      var4[23] = TuplesKt.to(var10006, CollectionsKt.listOf(var5));
      var4[24] = TuplesKt.to(new BlockPos(45, 197, -14), CollectionsKt.listOf(new BlockPos(47, 206, -6)));
      var4[25] = TuplesKt.to(new BlockPos(47, 206, -6), CollectionsKt.listOf(new BlockPos(52, 205, 16)));
      var4[26] = TuplesKt.to(new BlockPos(53, 205, 16), CollectionsKt.listOf(new BlockPos(52, 209, -2)));
      var4[27] = TuplesKt.to(new BlockPos(52, 209, -2), CollectionsKt.listOf(new BlockPos(52, 197, -19)));
      var4[28] = TuplesKt.to(new BlockPos(34, 197, -7), CollectionsKt.listOf(new BlockPos(-15, 181, -29)));
      var4[29] = TuplesKt.to(new BlockPos(-25, 181, -33), CollectionsKt.listOf(new BlockPos(-52, 165, -44)));
      var4[30] = TuplesKt.to(new BlockPos(112, 153, 40), CollectionsKt.listOf(new BlockPos(112, 160, 33)));
      var4[31] = TuplesKt.to(new BlockPos(112, 160, 27), CollectionsKt.listOf(new BlockPos(114, 158, 23)));
      var4[32] = TuplesKt.to(new BlockPos(109, 153, 40), CollectionsKt.listOf(new BlockPos(106, 163, 31)));
      var4[33] = TuplesKt.to(new BlockPos(112, 160, 33), CollectionsKt.listOf(new BlockPos(106, 163, 31)));
      var4[34] = TuplesKt.to(new BlockPos(111, 153, 44), CollectionsKt.listOf(new BlockPos(149, 147, 79)));
      var4[35] = TuplesKt.to(new BlockPos(149, 147, 79), CollectionsKt.listOf(new BlockPos(114, 153, 47)));
      var4[36] = TuplesKt.to(new BlockPos(106, 163, 31), CollectionsKt.listOf(new BlockPos(153, 150, 32)));
      var4[37] = TuplesKt.to(new BlockPos(123, 154, 36), CollectionsKt.listOf(new BlockPos(117, 185, 21)));
      var4[38] = TuplesKt.to(new BlockPos(-41, 137, -8), CollectionsKt.listOf(new BlockPos(-53, 167, -25)));
      var10006 = new BlockPos(37, 142, 167);
      var5 = new BlockPos[]{new BlockPos(45, 132, 150), new BlockPos(23, 127, 157), new BlockPos(4, 127, 167)};
      var4[39] = TuplesKt.to(var10006, CollectionsKt.listOf(var5));
      var4[40] = TuplesKt.to(new BlockPos(10, 127, 162), CollectionsKt.listOf(new BlockPos(36, 142, 168)));
      var4[41] = TuplesKt.to(new BlockPos(38, 130, 153), CollectionsKt.listOf(new BlockPos(45, 138, 155)));
      var10006 = new BlockPos(63, 139, 150);
      var5 = new BlockPos[]{new BlockPos(70, 149, 144), new BlockPos(69, 145, 151)};
      var4[42] = TuplesKt.to(var10006, CollectionsKt.listOf(var5));
      var4[43] = TuplesKt.to(new BlockPos(68, 142, 159), CollectionsKt.listOf(new BlockPos(75, 150, 158)));
      var4[44] = TuplesKt.to(new BlockPos(-3, 201, -68), CollectionsKt.listOf(new BlockPos(-46, 167, -48)));
      var4[45] = TuplesKt.to(new BlockPos(19, 182, -55), CollectionsKt.listOf(new BlockPos(0, 201, -67)));
      var4[46] = TuplesKt.to(new BlockPos(-3, 180, -57), CollectionsKt.listOf(new BlockPos(0, 201, -67)));
      var4[47] = TuplesKt.to(new BlockPos(-149, 164, -6), CollectionsKt.listOf(new BlockPos(-147, 148, 46)));
      var4[48] = TuplesKt.to(new BlockPos(-147, 148, 46), CollectionsKt.listOf(new BlockPos(-149, 164, -6)));
      var4[49] = TuplesKt.to(new BlockPos(-75, 169, -51), CollectionsKt.listOf(new BlockPos(-78, 182, -54)));
      var4[50] = TuplesKt.to(new BlockPos(-81, 186, -63), CollectionsKt.listOf(new BlockPos(-78, 187, -70)));
      var4[51] = TuplesKt.to(new BlockPos(-28, 75, 124), CollectionsKt.listOf(new BlockPos(-16, 102, 123)));
      var4[52] = TuplesKt.to(new BlockPos(-16, 102, 123), CollectionsKt.listOf(new BlockPos(-9, 128, 127)));
      var4[53] = TuplesKt.to(new BlockPos(30, 75, 124), CollectionsKt.listOf(new BlockPos(25, 101, 107)));
      var4[54] = TuplesKt.to(new BlockPos(25, 101, 107), CollectionsKt.listOf(new BlockPos(9, 128, 126)));
      var10006 = new BlockPos(-174, 104, 172);
      var5 = new BlockPos[]{new BlockPos(-164, 144, 161), new BlockPos(-170, 139, 165)};
      var4[55] = TuplesKt.to(var10006, CollectionsKt.listOf(var5));
      var10006 = new BlockPos(-170, 139, 165);
      var5 = new BlockPos[]{new BlockPos(-165, 144, 161), new BlockPos(-160, 141, 166)};
      var4[56] = TuplesKt.to(var10006, CollectionsKt.listOf(var5));
      var10006 = new BlockPos(54, 197, -14);
      var5 = new BlockPos[]{new BlockPos(58, 213, -23), new BlockPos(59, 213, -23), new BlockPos(60, 213, -23), new BlockPos(61, 213, -24)};
      var4[57] = TuplesKt.to(var10006, CollectionsKt.listOf(var5));
      var10006 = new BlockPos(60, 206, -12);
      var5 = new BlockPos[]{new BlockPos(57, 216, 14), new BlockPos(56, 216, 14), new BlockPos(55, 216, 14)};
      var4[58] = TuplesKt.to(var10006, CollectionsKt.listOf(var5));
      var10006 = new BlockPos(62, 197, -18);
      var5 = new BlockPos[]{new BlockPos(61, 206, -12), new BlockPos(60, 206, -12), new BlockPos(59, 206, -12)};
      var4[59] = TuplesKt.to(var10006, CollectionsKt.listOf(var5));
      var4[60] = TuplesKt.to(new BlockPos(46, 197, -14), CollectionsKt.listOf(new BlockPos(43, 203, -25)));
      var10006 = new BlockPos(-109, 185, -62);
      var5 = new BlockPos[]{new BlockPos(-94, 201, -73), new BlockPos(-94, 201, -74)};
      var4[61] = TuplesKt.to(var10006, CollectionsKt.listOf(var5));
      var10006 = new BlockPos(-109, 185, -62);
      var5 = new BlockPos[]{new BlockPos(-99, 194, -71), new BlockPos(-98, 194, -71), new BlockPos(-99, 194, -72)};
      var4[62] = TuplesKt.to(var10006, CollectionsKt.listOf(var5));
      var10006 = new BlockPos(150, 150, 37);
      var5 = new BlockPos[]{new BlockPos(162, 160, 25), new BlockPos(161, 160, 25)};
      var4[63] = TuplesKt.to(var10006, CollectionsKt.listOf(var5));
      var10006 = new BlockPos(32, 127, 42);
      var5 = new BlockPos[]{new BlockPos(16, 167, 34), new BlockPos(17, 167, 33), new BlockPos(18, 167, 33)};
      var4[64] = TuplesKt.to(var10006, CollectionsKt.listOf(var5));
      var4[65] = TuplesKt.to(new BlockPos(42, 127, 38), CollectionsKt.listOf(new BlockPos(27, 138, 22)));
      var4[66] = TuplesKt.to(new BlockPos(-52, 167, -25), CollectionsKt.listOf(new BlockPos(-48, 135, 16)));
      var3[0] = TuplesKt.to(var10003, MapsKt.hashMapOf(var4));
      var10003 = me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.DWARVEN_CAMP;
      var4 = new Pair[]{
         TuplesKt.to(new BlockPos(84, 142, 273), CollectionsKt.listOf(new BlockPos(91, 154, 277))),
         TuplesKt.to(new BlockPos(94, 153, 281), CollectionsKt.listOf(new BlockPos(91, 154, 277))),
         TuplesKt.to(new BlockPos(91, 154, 277), CollectionsKt.listOf(new BlockPos(84, 142, 272))),
         TuplesKt.to(new BlockPos(-7, 120, 232), CollectionsKt.listOf(new BlockPos(-4, 147, 239))),
         TuplesKt.to(new BlockPos(-13, 120, 230), CollectionsKt.listOf(new BlockPos(-16, 145, 236))),
         TuplesKt.to(new BlockPos(-16, 145, 239), CollectionsKt.listOf(new BlockPos(-6, 147, 241))),
         TuplesKt.to(new BlockPos(-1, 148, 241), CollectionsKt.listOf(new BlockPos(-16, 145, 239))),
         TuplesKt.to(new BlockPos(-77, 146, 388), CollectionsKt.listOf(new BlockPos(-72, 143, 408))),
         TuplesKt.to(new BlockPos(-72, 143, 408), CollectionsKt.listOf(new BlockPos(-73, 144, 397))),
         TuplesKt.to(new BlockPos(44, 130, 308), CollectionsKt.listOf(new BlockPos(51, 131, 319))),
         TuplesKt.to(new BlockPos(55, 132, 321), CollectionsKt.listOf(new BlockPos(47, 130, 310))),
         TuplesKt.to(new BlockPos(-11, 132, 386), CollectionsKt.listOf(new BlockPos(6, 136, 406))),
         TuplesKt.to(new BlockPos(9, 136, 404), CollectionsKt.listOf(new BlockPos(-10, 131, 384))),
         TuplesKt.to(new BlockPos(-76, 130, 401), CollectionsKt.listOf(new BlockPos(-75, 143, 405))),
         TuplesKt.to(new BlockPos(-50, 126, 410), CollectionsKt.listOf(new BlockPos(-54, 131, 410))),
         TuplesKt.to(new BlockPos(-52, 126, 409), CollectionsKt.listOf(new BlockPos(-52, 141, 412))),
         TuplesKt.to(new BlockPos(-66, 122, 297), CollectionsKt.listOf(new BlockPos(-63, 130, 298))),
         TuplesKt.to(new BlockPos(-76, 135, 285), CollectionsKt.listOf(new BlockPos(-73, 145, 288))),
         TuplesKt.to(new BlockPos(41, 120, 366), CollectionsKt.listOf(new BlockPos(33, 134, 361))),
         TuplesKt.to(new BlockPos(18, 123, 352), CollectionsKt.listOf(new BlockPos(29, 134, 358))),
         null,
         null
      };
      var10006 = new BlockPos(50, 118, 317);
      var5 = new BlockPos[]{new BlockPos(47, 130, 312), new BlockPos(53, 131, 318)};
      var4[20] = TuplesKt.to(var10006, CollectionsKt.listOf(var5));
      var4[21] = TuplesKt.to(new BlockPos(32, 129, 304), CollectionsKt.listOf(new BlockPos(20, 145, 303)));
      var3[1] = TuplesKt.to(var10003, MapsKt.hashMapOf(var4));
      String var2 = var10000;
      Pair[] var25 = var3;
      byte var10001 = 2;
      me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var10002 = me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.MUSHROOM_DESERT;
      var4 = new Pair[70];

      try {
         var4[0] = TuplesKt.to(new BlockPos(175, 76, -502), CollectionsKt.listOf(new BlockPos(172, 85, -506)));
         var4[1] = TuplesKt.to(new BlockPos(147, 75, -505), CollectionsKt.listOf(new BlockPos(136, 104, -505)));
         var4[2] = TuplesKt.to(new BlockPos(173, 92, -543), CollectionsKt.listOf(new BlockPos(156, 101, -533)));
         var4[3] = TuplesKt.to(new BlockPos(160, 91, -558), CollectionsKt.listOf(new BlockPos(153, 104, -550)));
         var4[4] = TuplesKt.to(new BlockPos(177, 92, -561), CollectionsKt.listOf(new BlockPos(170, 118, -555)));
         var4[5] = TuplesKt.to(new BlockPos(193, 89, -582), CollectionsKt.listOf(new BlockPos(182, 112, -574)));
         var4[6] = TuplesKt.to(new BlockPos(212, 94, -597), CollectionsKt.listOf(new BlockPos(194, 110, -597)));
         var4[7] = TuplesKt.to(new BlockPos(163, 89, -586), CollectionsKt.listOf(new BlockPos(151, 104, -592)));
         var4[8] = TuplesKt.to(new BlockPos(120, 80, -540), CollectionsKt.listOf(new BlockPos(113, 87, -530)));
         var4[9] = TuplesKt.to(new BlockPos(104, 75, -514), CollectionsKt.listOf(new BlockPos(113, 98, -515)));
         var4[10] = TuplesKt.to(new BlockPos(117, 75, -505), CollectionsKt.listOf(new BlockPos(131, 101, -504)));
         var4[11] = TuplesKt.to(new BlockPos(152, 75, -503), CollectionsKt.listOf(new BlockPos(167, 86, -504)));
         var4[12] = TuplesKt.to(new BlockPos(186, 75, -491), CollectionsKt.listOf(new BlockPos(191, 97, -477)));
         var4[13] = TuplesKt.to(new BlockPos(189, 76, -467), CollectionsKt.listOf(new BlockPos(191, 93, -453)));
         var4[14] = TuplesKt.to(new BlockPos(182, 76, -469), CollectionsKt.listOf(new BlockPos(171, 90, -461)));
         var4[15] = TuplesKt.to(new BlockPos(159, 76, -466), CollectionsKt.listOf(new BlockPos(151, 89, -461)));
         var4[16] = TuplesKt.to(new BlockPos(163, 76, -465), CollectionsKt.listOf(new BlockPos(154, 90, -446)));
         var4[17] = TuplesKt.to(new BlockPos(157, 75, -438), CollectionsKt.listOf(new BlockPos(166, 87, -438)));
         var4[18] = TuplesKt.to(new BlockPos(142, 66, -482), CollectionsKt.listOf(new BlockPos(133, 78, -468)));
         var4[19] = TuplesKt.to(new BlockPos(104, 64, -473), CollectionsKt.listOf(new BlockPos(113, 84, -465)));
         var4[20] = TuplesKt.to(new BlockPos(100, 64, -458), CollectionsKt.listOf(new BlockPos(90, 80, -462)));
         var4[21] = TuplesKt.to(new BlockPos(104, 64, -456), CollectionsKt.listOf(new BlockPos(93, 84, -456)));
         var4[22] = TuplesKt.to(new BlockPos(99, 64, -458), CollectionsKt.listOf(new BlockPos(107, 78, -450)));
         var4[23] = TuplesKt.to(new BlockPos(101, 64, -430), CollectionsKt.listOf(new BlockPos(109, 84, -435)));
         var4[24] = TuplesKt.to(new BlockPos(103, 64, -433), CollectionsKt.listOf(new BlockPos(120, 76, -432)));
         var4[25] = TuplesKt.to(new BlockPos(116, 64, -424), CollectionsKt.listOf(new BlockPos(124, 81, -417)));
         var4[26] = TuplesKt.to(new BlockPos(114, 64, -419), CollectionsKt.listOf(new BlockPos(122, 86, -409)));
         var4[27] = TuplesKt.to(new BlockPos(174, 92, -539), CollectionsKt.listOf(new BlockPos(159, 96, -527)));
         var4[28] = TuplesKt.to(new BlockPos(143, 74, -505), CollectionsKt.listOf(new BlockPos(154, 80, -500)));
         var4[29] = TuplesKt.to(new BlockPos(116, 75, -504), CollectionsKt.listOf(new BlockPos(100, 80, -497)));
         var4[30] = TuplesKt.to(new BlockPos(112, 77, -530), CollectionsKt.listOf(new BlockPos(97, 82, -524)));
         var4[31] = TuplesKt.to(new BlockPos(144, 88, -559), CollectionsKt.listOf(new BlockPos(128, 104, -559)));
         var4[32] = TuplesKt.to(new BlockPos(142, 88, -562), CollectionsKt.listOf(new BlockPos(127, 110, -568)));
         var4[33] = TuplesKt.to(new BlockPos(162, 92, -551), CollectionsKt.listOf(new BlockPos(146, 92, -531)));
         var4[34] = TuplesKt.to(new BlockPos(187, 92, -541), CollectionsKt.listOf(new BlockPos(212, 117, -522)));
         var4[35] = TuplesKt.to(new BlockPos(187, 92, -549), CollectionsKt.listOf(new BlockPos(214, 118, -549)));
         var4[36] = TuplesKt.to(new BlockPos(214, 94, -594), CollectionsKt.listOf(new BlockPos(225, 109, -577)));
         var4[37] = TuplesKt.to(new BlockPos(244, 99, -595), CollectionsKt.listOf(new BlockPos(247, 150, -570)));
         var4[38] = TuplesKt.to(new BlockPos(254, 99, -603), CollectionsKt.listOf(new BlockPos(273, 135, -575)));
         var4[39] = TuplesKt.to(new BlockPos(260, 99, -601), CollectionsKt.listOf(new BlockPos(253, 132, -579)));
         var4[40] = TuplesKt.to(new BlockPos(297, 101, -569), CollectionsKt.listOf(new BlockPos(285, 153, -551)));
         var4[41] = TuplesKt.to(new BlockPos(285, 155, -547), CollectionsKt.listOf(new BlockPos(266, 161, -559)));
         var4[42] = TuplesKt.to(new BlockPos(292, 104, -524), CollectionsKt.listOf(new BlockPos(261, 129, -505)));
         var4[43] = TuplesKt.to(new BlockPos(304, 104, -484), CollectionsKt.listOf(new BlockPos(278, 143, -466)));
         var4[44] = TuplesKt.to(new BlockPos(316, 103, -483), CollectionsKt.listOf(new BlockPos(279, 142, -464)));
         var4[45] = TuplesKt.to(new BlockPos(295, 103, -482), CollectionsKt.listOf(new BlockPos(272, 141, -470)));
         var4[46] = TuplesKt.to(new BlockPos(247, 151, -567), CollectionsKt.listOf(new BlockPos(239, 150, -552)));
         var4[47] = TuplesKt.to(new BlockPos(239, 149, -550), CollectionsKt.listOf(new BlockPos(230, 148, -543)));
         var4[48] = TuplesKt.to(new BlockPos(255, 99, -597), CollectionsKt.listOf(new BlockPos(247, 150, -570)));
         var4[49] = TuplesKt.to(new BlockPos(199, 91, -439), CollectionsKt.listOf(new BlockPos(214, 102, -465)));
         var4[50] = TuplesKt.to(new BlockPos(183, 76, -499), CollectionsKt.listOf(new BlockPos(224, 114, -484)));
         var4[51] = TuplesKt.to(new BlockPos(187, 75, -487), CollectionsKt.listOf(new BlockPos(216, 100, -473)));
         var4[52] = TuplesKt.to(new BlockPos(181, 76, -451), CollectionsKt.listOf(new BlockPos(196, 91, -438)));
         var4[53] = TuplesKt.to(new BlockPos(206, 91, -429), CollectionsKt.listOf(new BlockPos(225, 123, -429)));
         var4[54] = TuplesKt.to(new BlockPos(206, 91, -436), CollectionsKt.listOf(new BlockPos(229, 122, -441)));
         var4[55] = TuplesKt.to(new BlockPos(231, 123, -440), CollectionsKt.listOf(new BlockPos(232, 136, -426)));
         var4[56] = TuplesKt.to(new BlockPos(208, 76, -383), CollectionsKt.listOf(new BlockPos(230, 95, -404)));
         var4[57] = TuplesKt.to(new BlockPos(304, 75, -388), CollectionsKt.listOf(new BlockPos(297, 89, -410)));
         var4[58] = TuplesKt.to(new BlockPos(300, 75, -381), CollectionsKt.listOf(new BlockPos(302, 103, -412)));
         var4[59] = TuplesKt.to(new BlockPos(303, 101, -461), CollectionsKt.listOf(new BlockPos(280, 147, -445)));
         var4[60] = TuplesKt.to(new BlockPos(307, 101, -447), CollectionsKt.listOf(new BlockPos(295, 124, -423)));
         var4[61] = TuplesKt.to(new BlockPos(257, 131, -503), CollectionsKt.listOf(new BlockPos(253, 140, -481)));
         var4[62] = TuplesKt.to(new BlockPos(243, 99, -601), CollectionsKt.listOf(new BlockPos(243, 127, -575)));
         var4[63] = TuplesKt.to(new BlockPos(244, 126, -577), CollectionsKt.listOf(new BlockPos(235, 156, -555)));
         var4[64] = TuplesKt.to(new BlockPos(247, 99, -600), CollectionsKt.listOf(new BlockPos(246, 127, -579)));
         var4[65] = TuplesKt.to(new BlockPos(247, 126, -581), CollectionsKt.listOf(new BlockPos(234, 157, -555)));
         var4[66] = TuplesKt.to(new BlockPos(245, 99, -599), CollectionsKt.listOf(new BlockPos(247, 126, -580)));
         var4[67] = TuplesKt.to(new BlockPos(265, 170, -559), CollectionsKt.listOf(new BlockPos(264, 187, -560)));
         var4[68] = TuplesKt.to(new BlockPos(270, 156, -552), CollectionsKt.listOf(new BlockPos(264, 187, -560)));
         var4[69] = TuplesKt.to(new BlockPos(285, 155, -544), CollectionsKt.listOf(new BlockPos(265, 186, -563)));
         var25[var10001] = TuplesKt.to(var10002, MapsKt.hashMapOf(var4));
         HashMap var26 = MapsKt.hashMapOf(var3);
         if (var2 != null) {
            lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               new int[1], -6879984269262134075L, var0
            );
         }

         return var26;
      } catch (MatchException var6) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var6, -6877756300049141036L, var0
         );
      }
   }

   private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
      return var0;
   }
}
