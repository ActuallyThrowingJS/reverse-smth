package me.octo.client.gui;

import java.io.File;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import me.octo.client.gui.clickgui.endgameGUI.ThemeColors;
import me.octo.client.modules.impl.features.GeneralModules;
import me.octo.client.modules.impl.macros.lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI;
import me.octo.client.utils.render.shapes.NVGRenderer;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl
   extends me.octo.client.gui.clickgui.endgameGUI.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl {
   @NotNull
   public static lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
   @NotNull
   private final me.octo.client.gui.clickgui.endgameGUI.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   private final float IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   private final float IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   private final float lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   private final float IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   private float llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   @NotNull
   private final me.octo.client.utils.render.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   private final float lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   @NotNull
   private IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   @Nullable
   private File lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   @NotNull
   private final ArrayList<StringBuilder> IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   @NotNull
   private final ArrayList<IlllllllIIIlIlllllIIIllIlIIIlIlIlIIllllIlIlIlIlllIIIIlIIlIlllIllllIlIlIIlIIIlIIIIIIll> llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   @NotNull
   private final ArrayList<IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl> IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   private int IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   private int IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   private int IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   private float llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   private boolean IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   private boolean lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   private boolean llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   @NotNull
   private final lIIlllllIIIlllIIIllIIlllIllllllIIIIIlllllIIlIIIIIIIlllIlIlIIlIlllIIlIIlIIlIIlllIIlllI lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   @NotNull
   private List<IIllIlllIIIIIllllIlllIIllIIIlIIllIIllIIlIllIIllIIIlIllIIlIIIIIlIIIIlIlIIIIIIlIlllIllI> IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   @Nullable
   private String IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   private int IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   private boolean llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   private boolean lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   private float IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   private int IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   private boolean lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   private long lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   private int IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   private boolean IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   private boolean IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
   private boolean IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
   private boolean IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
   private boolean lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
   private int lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
   private int lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   private final float IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   private float llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
   private float llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
   private boolean IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
   private boolean llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
   private boolean lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   private float IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   private long lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   @NotNull
   private final float[] llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   @NotNull
   private final float[] lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   private boolean lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
   private boolean IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   private int lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   private int IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   private boolean IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   private boolean lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   private boolean llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   private boolean lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   private boolean IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
   @NotNull
   private List<String> lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
   @NotNull
   private List<lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
   @Nullable
   private IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI;
   @Nullable
   private me.octo.client.gui.clickgui.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI;
   @Nullable
   private IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII;
   @Nullable
   private me.octo.client.gui.clickgui.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll;
   private boolean IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl;
   private int lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl;
   private boolean llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI;
   private boolean IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII;
   private boolean IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll;
   private final float IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI;
   private int IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll;
   private int llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll;
   private int IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll;
   private int IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI;
   private boolean lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl;
   private boolean lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll;
   private float llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII;
   private boolean IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl;
   private boolean IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII;
   private boolean IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI;
   private boolean IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI;
   private boolean llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl;
   private float IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII;
   private float lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII;
   private float lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII;
   private float lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl;
   private boolean IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll;
   private final float lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII;
   private final float llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl;
   private final float llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI;
   private boolean IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll;
   private int IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl;
   private float lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI;
   private float IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll;
   private boolean lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI;
   private float IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll;
   private boolean llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII;
   private boolean IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII;
   private boolean IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII;
   @Nullable
   private IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl;
   @Nullable
   private me.octo.client.gui.clickgui.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl;
   @Nullable
   private lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI;
   @Nullable
   private me.octo.client.gui.clickgui.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll;
   @Nullable
   private lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll;
   @Nullable
   private File IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI;
   private boolean IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI;
   private double lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI;
   private boolean IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl;
   private float lIIIllIIIIlllllllllllllllllllIIlIIIIIlIIllIIlIIlIllIIllllIIIIlllIlIlIlllllIIIIlIlIIIl;
   private float lIIIIIIIlllIlllIlIIlIIlIlIllIIIIIIllllIlIlllIIIlIlIIIlIlllllllllIIIlIlllIIIIIllllllIl;
   private float llIIIlIIllIIlllIlllllIlIllIIlIIllllIIlIlIllIIIllIIIIlIlIIlIIIllIlIlllllIIlIIIIlIIIllI;
   private float IlllIllIlllIlIlIIlIlIIlIIlIlIIIlllIllllIIIIlllIlllllIIlIlIIIIlIllllllllIIlIlIIlllllII;
   @NotNull
   private final HashSet<String> llllllllllIIIIIlllllIIIlIlIlIlIlIIIlIlIlllIlIllIlIIIlIIIIllIIlIlIIlIIllIllllIIIIllIII;
   @NotNull
   private final HashSet<String> llllIIIIIIlIllIllIlIIllIlIlIlIIIlIIIIIIIIIlIIIllIIIIlIlIlllIlIllIIIIIlIlIllIIlIIllIIl;
   private boolean IIllIlIlIIIllIIlIIIIIlIIllllllIIllllIIIIIIIlllIIIllIIIlllllIlIlIlIllIlIlIIlIlllllIlll;
   private boolean llIlIlIlIIlIlIIllIIIIIllIIIllllIIllllllIllIIIlllllIIIIlIIlIIllIIIIlIIlIIIlIlIIlIIIlll;
   @NotNull
   private final List<File> lIlIlIlIllIlIIlIIllIllIlIllIIlIIlIIlIlllIIIIllIIlIlIIIIIlIllIIIllllllllIlIIlIlIllIlll;
   private boolean llIllIlIlIlIIlIIIlIIlIlIIlllIllIlIIllIIlIIIlIlIIllIllIlIlIIIIlIIllllllIllIIIlllIIlIIl;
   private boolean lIIllIlllIIlIlIllIIlIlIIIllIllIllIlllllIIIlllIlllIlIlIIIlIIllIIIIIllIlIIlllIIIIIIIIlI;
   private int lIIllIIlIIlIIllllIIlIllllllIlIIIllllIIlIIlIIIIlIlIIIlIIIIlIllIIIIIIlIlIIIlIlllIllIIlI;
   private int lllIlllIllIIlIlIllIlIIIllIllIIlllllIIIllllIIlIlIIIlIIIlllIlllllIlIlIllIlllllllIllIlIl;
   private float IIlIlIllIIllIlIIlllllIIlIlIIIIlIlIlllIIIlIIllIllIIlIIlllIIllIlIIlllllIllllllllllIIIlI;
   private float IlllIlllIIIlllIIlIlIlllIlllllIIlIIIIllIIIIIlllIIllIIlIIllllIllllIlIIlllIlIIIlIlIlIllI;
   private float llllllIIlIlIIlIIIIlIlIIIIIIlIIlIllIIIlIlIlIllIIIIlIIlIIIIlIlllIIllllllIIlllIlIIllIIIl;
   private boolean lllIlIlIllllIIIIlIllIIllIIIllllIlIllIllIIlIIlIIIIlIlllIlIIIlIlllIllllIIIllIllIIIIIIII;
   @NotNull
   private List<lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IIlIlllllIIllIIIlllIIIIlIIIlIIIIlIlIllllIlIIlIIlIlIIIlIIllIllIIIlllIlIllllIIIIlllllII;
   private int lIIllIIIIlIlIIIIlIlllllIIIlIIllIllIlllllIlIllIIIIIIlIlIIIIIIllIIlllIlllllllIllIlIllII;
   private int lIIllIlIIIIlIIlIlIllIIllIIllIIIIIIlIIlIIIllllIlIlllIlIlllIlIllIIIIIllIIIIlIlIIIlIIIlI;
   private int llIIllllIlIIIlIIIIIllIIlllllIllllIIIlllIlIIlIlllIIlIIllIlllllIlIIIlllIllIllllllIIIllI;
   @Nullable
   private String lIlIIlIlIIllIlIllIIIllIIllllIIllIIIIlllllIIlllIlIlIlIlIIIlIIIlIlIIllllllllIIIllIIIIIl;
   private final int lIIlIlIllIlIlIIlIIIllIIlIlllllIIIIllIlIIIlIIllIIIIlIIIlIIllIIllIlllIIIIlIlIIIIllllllI;
   private int IlIllIlIIlIIlIIIIIIlIlIIIlllIIllIllIIIlIIlIIlIIIlIIllIIIIIIllllIlIlIllIlllIIIIllIIIII;
   private boolean IlIllIIIIIIIIIIlIllIIlIlIlIllIIIlIIIIllIlllllIIIlIIIIIIlIllIIlIIlIIIIIIllIIllllllIlII;
   private boolean llIlllIIIllllIIllIlIIIllIIIIlIlIllIIIIlIllIIIlIIllIlIllIIIIIlIIIlIIllIllIIIIlIIIllIIl;
   @NotNull
   private final Map<Character, Character> IlIIlllIIIlIlIllIllllIIIIllIlIIIlIllllIllIIlIlIlIlIlIIIllllIllIlllllIIlIIIlIIIlllIIlI;
   @NotNull
   private final Set<Character> IlIIlIlIIIIlllIIIllIIlIIlIIlIIIllllllIIlIlIIlllIIllIlllIlIlIIIlIlIIlIIIlIlIlllIIIlIIl;
   private int IIlIllIllIlllllIIllIlIIIIllllIllllIlIIllIlIlIIllIlllllIllIIIlIlIIIIIIIIlIlIlIIlIIIlll;
   private int IlllIIllIlIlllIIllIlIIIllIIIlllllIllIIllIlllIIIlllIIlIllIlIlllIIlIlIlIllIlllIlIIIIlll;
   @NotNull
   private List<IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IlIlIIlIIIIIIlllllllIIIllllIllIllIlIlIlllllIIIIlIIlllllIlIllIllllIllIlIIlllIIIIIIIIIl;
   @NotNull
   private Map<Integer, IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lIIllllIlIIIIIIIlllIlIIIlIlIlIIlIlIlIIIIlIlIlIIlIIlIIlIllIlIIlIIIIIlIlllIlIllIIIlIlII;
   private long IlIIlllIlIlIIllIIIIlIIllIIIIllIlIlllIIlllIlllIIlllIlIIlIIllIlllllIIIIlIIIIIllllllIIIl;
   private int llIIIllllIIIllIlIlIlIIllIIIlIllIIIllIlIlIIllIIIlIIlIIIIIlIIIIllIlllIlllIIIlIlIlIIIIlI;
   @NotNull
   private final HashMap<String, Double> IlIllIIlIIlIlIIlIlIllIIIlllIlllllIlIIIIIlIlIlIIllllllIIlIIIlIllIIIIIIIIlIIlllIIIIllIl;
   @NotNull
   private final HashMap<String, Double> lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI;
   private double lIIIlIllIlllllllIIlIIIIllIIIIIlIIllllllIIlIIIIIlIIIlIIllIIIlIIIIlIllllIIllIIlllIIlllI;
   private double lIllllIIlIlIIIlIIIllIIIIIllIIIIlllIlIIIlIlIIIIlIlIIIIllIIIIlIlIIIIlIIIIllIlIIllIIllIl;
   private boolean IllIIllIllIIIlIIIIIIIIIlIlllIllIIllIlIllIlIlllllllllIlllIIlIllIlIllIlIlIllIIlIIIIlIlI;
   @NotNull
   private final ArrayList<lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI> IIlllIIIllIlIIIlllIIlllIIllIlIIIIlllIlllIllIllIllIllllllllllllllIlIllllIIllIIIIlIlIll;
   @NotNull
   private final ArrayList<lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI> lIlIIIIIIIllIlllIlIlIIIIIIIIlllllIIlllIIllIlllIIIlIIlllIlllIllIIlIllIIIlIllllllIIllII;
   private final int lIIlIIIlIIlIlIlllIIllIIlIIIlllIllllIlIIlIIlIIIIllIIIllIlIlIIIlIIlllIllIIIlIlIlIllIIlI;
   private long IlIIlIIIllIlIIlIlIIllIllllllIlIIIllIIIllIIIIllIlllIlIIIIIlIIllIIlllIllIlIIIlIlllIlIll;
   @NotNull
   private String IlIllIlIIIIIIIIllIlIIlIllllIIIIIlIlllIllllIIIlllIlIllllIlIllIIIIIIIlIllIlIIllIIIIIlll;
   private boolean IIIlllllllllllllIIlIlllIllIlIIlIIlIllIlIIIlIlIlIIIIIllIlIlllIIlIIIIIllIIIIlIllllIIlIl;
   private long lllIlIIlIIlllIIllIIlIllIlllIllIIlIlllIllllllIlIllIIIIIlllIIIlIIIIllllIlIllIIllIllIlII;
   private int IlIIIIllIIIIllIllIIIllllllIIlIIIlIlIllIIllIllllIlIIIlllllllIlllIllIIIIIIIlllIlllIIlII;
   private int IllIlIIIIlllIIllIlllIlIIlllIIlllllIllIlIllllIlIIllIIIllIlIIllllIIlIIllIlIlllIlIIllllI;
   private float lllIlIlllIIlIIIllIIlIIllllllllIIlllIlIIllIlIIIIlIlllIIlIIIIlIIlIIIIIIlllIIlllIlIlIlII;
   private float lIllllIIllllIlIIlllIIIlIIIlIllIIlIIIlllIlIIIllIIIIIIIlIIIIIIIlIllIIIlIIIlIIIIIIlIIlIl;
   private float IllIlIIllIlIIlIIIllIIlllIlIlIlllllIIlllllIIIlIlIlllIlIlIllIIIIIllIlIlllllIIIIIlllllll;
   @NotNull
   private final IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI IlIlIlllIlllIIlIlIIIIIIllIIlIIIIIllIIlIlIlIIIIlIIIlIIIIlIlIllIlIIIIlIIIlIllllIIllllIl;
   @NotNull
   private final lIlllIlllllIIIIllIlIIlIlIllllIIIIllIIllIIlIlIIlIllIlIllIlIIIIlIIIIlIlIIllIIllIIIlllII lIIlIllllIlllllIllIIIIlIIIlllIIlIIIllIIlIIllIIIlIIIIlIIllllIlIIIIIlIlIllIIllIlIIIIIIl;
   @NotNull
   private final lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII lIlllIllllIIllIIIIllIIIIIlllIIlIIIIllllIllIlIlIIlIlIlIIlIIllIlllllIlIIIlIIlllIIlllIII;
   @NotNull
   private final llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl IllIIIllIIllIlIIllIIlIIIIIllIlllIlllllIIIIlIIIIlIIIIlIIlIlIlIIIlIIllIlIlIlIlIllIIlllI;
   @NotNull
   private final llllIlIIIlllIIlIIIlIIlIIllIlIlIlllIIIIIIIIlIlIIllIIlllIIIlIllIIIIllIllllIIIIIIIllIllI IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI;
   @NotNull
   private final llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll IlllIlIIlllIIlIIIIIllllIIIIIlIIllllIlllIIIIlIIllIlIlIllIIlIIIIllllIlIlIllIlIlIlIIlIll;
   @NotNull
   private final IIIIIIIlllIIllIlllIlllIIlIIIIllIllIlllIlIIllllllIlIIlIIlllIllIllIIlIIlIlIllIlllllIIlI lIIIlIllllllIIllIIlIlllIllllIlIlllllIIIllIlllIIlllllIlIIIlIlIIllllIIllIIIlllIllIIlIII;
   @NotNull
   private final lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII IIIIlllIlllIlIIlIlIllIIlIIIIIIlIllIIIllllllIllIIllIIllIlIIllllllllIIIlIIlIIlIIlIllllI;
   @NotNull
   private static Set<String> IIIlllIIllllIlllllIlIlIlIIIlIIlIlllIIllIlIlIlllIIIIIllllIlIlllllllIIIIIIlIlIlIlIIllII;
   @NotNull
   private static Regex lllIlllIlIlIllllIllllIIllIllIlIllIlIIlIllIIllIllIllIIIIlIIllllIllllIIlIlIIllIlllIllII;
   @NotNull
   private static List<IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl> IllllIlllllIIllIlIIIllllIllIllIllllIIIllIllIllIIIIIIIIlllllIIIlIIlllIIIIIllIIllIllIll;
   private static int lIlllIlIIIIlIIIIIIIIlIIIIlIllIllIlIlIIIlIIIIIIIlIIllllIllIIIIIlllllIllIlIlIIIlIlIIIlI;
   private static int llIlIIIIlIllllIlllllIllIIIIlllIlIlIIlllIllllIIlIIllIIIIIIlllIlIlIllIlllIlIlIIlIIIlIlI;
   @Nullable
   private static String lIIlIllIlllIllllIIlIllIIlIIIIllIIlIIlIIllIIllIllllIIIIIIIIllllIIIIlIIIIllIlIlIIllIIII;
   private static boolean lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl;
   private static String[] IIlIllIlllIIIIlIllIllIlIllllIIIIIlIllIIlIIIllIIlIllIlllIIIllIIllIllIllIllIlIIIIIlIlll;
   private static long lIIlllIIlIlllllIIIllIlIlIIlIlIlIlIIIllIlIlIIIIlllIIlIIIlllllIllllIIIIllllIIlIlIIllIII = 117337616268914L;
   private static String[] lllIIlllIlllllllIIlIIIlIIllIllIllIIllIllIlllIIlIlIIIIIlllIlIIlIlIlllIlIIlIIllIIIlIlII;
   private static String[] llIlllIlllIlIIlllIlIlllIlllllIlllIlIIllIllllIIIIlIlIIIllIIIlllIIIIIIIlIIlIlllIllllIlI;
   private static Map llIllIllIlIIIlIlIIIIlIIIIlllIlllllIlIlIlllIIlllIIIIIIIIllIIIIllIIIIIlIIlllIIlIlllllll = new HashMap(13);
   private static long[] lIllIIlIIIllIlllIIlllIllIIllllIllIllIIIIIllIllIllIIlIIIIIlllIlIllIlIIllIIIllIIllIIIll;
   private static Integer[] IlIIlllllIlIIIIlIIIIlIllIlIIIlllIlIIIllIlIIIllIIlIIlIIIIllIIlIIIIIllIlllIIIIIlIIIIllI;
   private static Map lIlllIIIIIlllllIIllIllIlIIlIllllllIllIIlllIIllIIIIIlIlIlIllIlIlIIlIlIIlIlIIIIIlllIIlI;

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   public lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl(@Nullable File var1) {
      long var2 = lIIlllIIlIlllllIIIllIlIlIIlIlIlIlIIIllIlIlIIIIlllIIlIIIlllllIllllIIIIllllIIlIlIIllIII ^ 118072917124892L;
      long var4 = var2 ^ 95000842610784L;
      long var6 = var2 ^ 137539244058456L;
      long var8 = var2 ^ 3710309854405L;
      long var10 = var2 ^ 15291640675481L;
      long var12 = var2 ^ 25572623565622L;
      long var14 = var2 ^ 35373230707693L;
      super();
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = new me.octo.client.gui.clickgui.endgameGUI.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl(
         1180.0F, 720.0F
      );
      this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = 44.0F;
      this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = 24.0F;
      this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = 28.0F;
      this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 20.0F;
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = 200.0F;
      this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = me.octo.client.utils.render.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = (float)(
         me.octo.client.utils.render.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               var14, this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl, false, 1, null
            )
            + 6.0
      );
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.LIST;
      this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl = new ArrayList<>();
      this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = new ArrayList<>();
      this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = new ArrayList<>();
      this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll = new lIIlllllIIIlllIIIllIIlllIllllllIIIIIlllllIIlIIIIIIIlllIlIlIIlIlllIIlIIlIIlIIlllIIlllI(
         lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI,
         lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI
      );
      this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = CollectionsKt.emptyList();
      this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = -1;
      this.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = -1;
      this.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = -1;
      this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll = 46.0F;
      float[] var17 = new float[]{0.0F, 0.0F, 0.0F, 0.0F};
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = var17;
      String[] var10000 = lIlIIIIIIllIIllllIIIIlIIlIIlIIIIIIlIlIIIlIIIlIIlllIIlIIIlIlllIlIlIIIllIllIIIlIlIlllIl();
      var17 = new float[]{0.0F, 0.0F, 0.0F, 0.0F};
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = var17;
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = -1;
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = -1;
      this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = CollectionsKt.emptyList();
      this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = CollectionsKt.emptyList();
      this.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl = -1;
      this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI = 13.0F;
      this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"b">(
         17657, 507213681019306283L ^ var2
      );
      this.llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"b">(
         18102, 3865608242275238752L ^ var2
      );
      this.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll = -1;
      this.IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI = -1;
      this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII = 26.0F;
      this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl = 6.0F;
      this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI = 70.0F;
      this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI = true;
      this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll = 200.0F;
      this.llllllllllIIIIIlllllIIIlIlIlIlIlIIIlIlIlllIlIllIlIIIlIIIIllIIlIlIIlIIllIllllIIIIllIII = new HashSet<>();
      this.llllIIIIIIlIllIllIlIIllIlIlIlIIIlIIIIIIIIIlIIIllIIIIlIlIlllIlIllIIIIIlIlIllIIlIIllIIl = new HashSet<>();
      this.lIlIlIlIllIlIIlIIllIllIlIllIIlIIlIIlIlllIIIIllIIlIlIIIIIlIllIIIllllllllIlIIlIlIllIlll = new ArrayList<>();
      this.lIIllIIlIIlIIllllIIlIllllllIlIIIllllIIlIIlIIIIlIlIIIlIIIIlIllIIIIIIlIlIIIlIlllIllIIlI = -1;
      String[] var16 = var10000;
      this.lllIlllIllIIlIlIllIlIIIllIllIIlllllIIIllllIIlIlIIIlIIIlllIlllllIlIlIllIlllllllIllIlIl = -1;
      this.IIlIlllllIIllIIIlllIIIIlIIIlIIIIlIlIllllIlIIlIIlIlIIIlIIllIllIIIlllIlIllllIIIIlllllII = CollectionsKt.emptyList();
      this.lIIlIlIllIlIlIIlIIIllIIlIlllllIIIIllIlIIIlIIllIIIIlIIIlIIllIIllIlllIIIIlIlIIIIllllllI = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"b">(
         6596, 932851663776783379L ^ var2
      );
      this.IlIllIlIIlIIlIIIIIIlIlIIIlllIIllIllIIIlIIlIIlIIIlIIllIIIIIIllllIlIlIllIlllIIIIllIIIII = -1;
      lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl var28 = this;
      Pair[] var27 = new Pair[6];

      label39: {
         label38: {
            label37: {
               try {
                  var27[0] = TuplesKt.to('(', ')');
                  var27[1] = TuplesKt.to('[', ']');
                  var27[2] = TuplesKt.to('{', '}');
                  var27[3] = TuplesKt.to('"', '"');
                  var27[4] = TuplesKt.to('\'', '\'');
                  var27[5] = TuplesKt.to('`', '`');
                  var28.IlIIlllIIIlIlIllIllllIIIIllIlIIIlIllllIllIIlIlIlIlIlIIIllllIllIlllllIIlIIIlIIIlllIIlI = MapsKt.mapOf(var27);
                  this.IlIIlIlIIIIlllIIIllIIlIIlIIlIIIllllllIIlIlIIlllIIllIlllIlIlIIIlIlIIlIIIlIlIlllIIIlIIl = this.IlIIlllIIIlIlIllIllllIIIIllIlIIIlIllllIllIIlIlIlIlIlIIIllllIllIlllllIIlIIIlIIIlllIIlI
                     .keySet();
                  this.IIlIllIllIlllllIIllIlIIIIllllIllllIlIIllIlIlIIllIlllllIllIIIlIlIIIIIIIIlIlIlIIlIIIlll = -1;
                  this.IlIlIIlIIIIIIlllllllIIIllllIllIllIlIlIlllllIIIIlIIlllllIlIllIllllIllIlIIlllIIIIIIIIIl = CollectionsKt.emptyList();
                  this.lIIllllIlIIIIIIIlllIlIIIlIlIlIIlIlIlIIIIlIlIlIIlIIlIIlIllIlIIlIIIIIlIlllIlIllIIIlIlII = MapsKt.emptyMap();
                  this.llIIIllllIIIllIlIlIlIIllIIIlIllIIIllIlIlIIllIIIlIIlIIIIIlIIIIllIlllIlllIIIlIlIlIIIIlI = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"b">(
                     27110, 4673675773898058803L ^ var2
                  );
                  this.IlIllIIlIIlIlIIlIlIllIIIlllIlllllIlIIIIIlIlIlIIllllllIIlIIIlIllIIIIIIIIlIIlllIIIIllIl = new HashMap<>();
                  this.lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI = new HashMap<>();
                  this.IllIIllIllIIIlIIIIIIIIIlIlllIllIIllIlIllIlIlllllllllIlllIIlIllIlIllIlIlIllIIlIIIIlIlI = true;
                  this.IIlllIIIllIlIIIlllIIlllIIllIlIIIIlllIlllIllIllIllIllllllllllllllIlIllllIIllIIIIlIlIll = new ArrayList<>();
                  this.lIlIIIIIIIllIlllIlIlIIIIIIIIlllllIIlllIIllIlllIIIlIIlllIlllIllIIlIllIIIlIllllllIIllII = new ArrayList<>();
                  this.lIIlIIIlIIlIlIlllIIllIIlIIIlllIllllIlIIlIIlIIIIllIIIllIlIlIIIlIIlllIllIIIlIlIlIllIIlI = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl<"b">(
                     32396, 5424706998063725400L ^ var2
                  );
                  this.IlIllIlIIIIIIIIllIlIIlIllllIIIIIlIlllIllllIIIlllIlIllllIlIllIIIIIIIlIllIlIIllIIIIIlll = "";
                  this.IlIIIIllIIIIllIllIIIllllllIIlIIIlIlIllIIllIllllIlIIIlllllllIlllIllIIIIIIIlllIlllIIlII = -1;
                  this.IllIlIIIIlllIIllIlllIlIIlllIIlllllIllIlIllllIlIIllIIIllIlIIllllIIlIIllIlIlllIlIIllllI = -1;
                  this.IlIlIlllIlllIIlIlIIIIIIllIIlIIIIIllIIlIlIlIIIIlIIIlIIIIlIlIllIlIIIIlIIIlIllllIIllllIl = new IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI(
                     this
                  );
                  var29 = this;
                  if (var16 == null) {
                     break label38;
                  }

                  this.lIIlIllllIlllllIllIIIIlIIIlllIIlIIIllIIlIIllIIIlIIIIlIIllllIlIIIIIlIlIllIIllIlIIIIIIl = new lIlllIlllllIIIIllIlIIlIlIllllIIIIllIIllIIlIlIIlIllIlIllIlIIIIlIIIIlIlIIllIIllIIIlllII(
                     this
                  );
                  this.lIlllIllllIIllIIIIllIIIIIlllIIlIIIIllllIllIlIlIIlIlIlIIlIIllIlllllIlIIIlIIlllIIlllIII = new lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII(
                     this
                  );
                  this.IllIIIllIIllIlIIllIIlIIIIIllIlllIlllllIIIIlIIIIlIIIIlIIlIlIlIIIlIIllIlIlIlIlIllIIlllI = new llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl(
                     this
                  );
                  this.IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI = new llllIlIIIlllIIlIIIlIIlIIllIlIlIlllIIIIIIIIlIlIIllIIlllIIIlIllIIIIllIllllIIIIIIIllIllI(
                     this
                  );
                  this.IlllIlIIlllIIlIIIIIllllIIIIIlIIllllIlllIIIIlIIllIlIlIllIIlIIIIllllIlIlIllIlIlIlIIlIll = new llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll(
                     this
                  );
                  this.lIIIlIllllllIIllIIlIlllIllllIlIlllllIIIllIlllIIlllllIlIIIlIlIIllllIIllIIIlllIllIIlIII = new IIIIIIIlllIIllIlllIlllIIlIIIIllIllIlllIlIIllllllIlIIlIIlllIllIllIIlIIlIlIllIlllllIIlI(
                     this
                  );
                  this.IIIIlllIlllIlIIlIlIllIIlIIIIIIlIllIIIllllllIllIIllIIllIlIIllllllllIIIlIIlIIlIIlIllllI = new lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII(
                     this
                  );
                  if (var1 == null) {
                     break label37;
                  }
               } catch (NoWhenBranchMatchedException var25) {
                  throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var25);
               }

               try {
                  this.IlIlIlllIlllIIlIlIIIIIIllIIlIIIIIllIIlIlIlIIIIlIIIlIIIIlIlIllIlIIIIlIIIlIllllIIllllIl
                     .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1, true, var6);
                  if (var16 != null) {
                     break label39;
                  }
               } catch (NoWhenBranchMatchedException var24) {
                  throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var24);
               }
            }

            try {
               var29 = this;
            } catch (NoWhenBranchMatchedException var23) {
               throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var23);
            }
         }

         var29.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll
            .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var12);
      }

      try {
         me.octo.client.utils.IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
               lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl::llIIlIlIllIIIlIIIIIIIIlIIIllIIllllIIlIIIlIIIIIIIllIlIIIIIIllIllIIlIlIIIIIlIIlIIlIIIIl,
               var8
            );
         me.octo.client.utils.IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
               lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl::IllllIlIlIIlllIIllIlIIIllIlllIIIIlIlIIllIlllIlIlIIlIlllIIIlIIlIIIlIlIIllllllIIlIIllII,
               var8
            );
         if (me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII()
            == null) {
            String[] var20 = new String[4];
            llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var20);
         }
      } catch (NoWhenBranchMatchedException var22) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var22);
      }
   }

   @NotNull
   public final me.octo.client.gui.clickgui.endgameGUI.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
      return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
   }

   public final float IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
      return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
   }

   public final float IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl() {
      return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
   }

   public final float IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll() {
      return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
   }

   public final float lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl() {
      return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
   }

   public final float IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl() {
      return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(float var1) {
      this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = var1;
   }

   @NotNull
   public final me.octo.client.utils.render.IIlllIllIIllIIllIlIIlIlIlIlllllllIllIllIIIIllllIlIIIIIIlIllIIlllIlIlIIIIllllIlllllIIl IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI() {
      return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
   }

   public final float IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII() {
      return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
   }

   @NotNull
   public final IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII() {
      return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var1, long var2
   ) {
      var2 = lIIlllIIlIlllllIIIllIlIlIIlIlIlIlIIIllIlIlIIIIlllIIlIIIlllllIllllIIIIllllIIlIlIIllIII ^ var2;
      Intrinsics.checkNotNullParameter(
         var1, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"z">(8262, 3194500798059867169L ^ var2)
      );
      this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = var1;
   }

   @Nullable
   public final File IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI() {
      return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@Nullable File var1) {
      this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = var1;
   }

   @NotNull
   public final ArrayList<StringBuilder> llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl() {
      return this.IIllIlIIIIlIllllllllllIlIIllIIIIllIlIllIlllIIlIIlIIIIIlIlIIlIlIIlIllIllIIIIIllllIlIIl;
   }

   @NotNull
   public final ArrayList<IlllllllIIIlIlllllIIIllIlIIIlIlIlIIllllIlIlIlIlllIIIIlIIlIlllIllllIlIlIIlIIIlIIIIIIll> lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI() {
      return this.llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI;
   }

   @NotNull
   public final ArrayList<IIIIlllIlllIllIlllIIlIlIlIIIlIlIlllIlIlIlIIIlIlIllIlllIlIllllIlIlIIllllIllIllIlIIlIIl> IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll() {
      return this.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
   }

   public final int IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI() {
      return this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1) {
      this.IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = var1;
   }

   public final int lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl() {
      return this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll;
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(int var1) {
      this.IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = var1;
   }

   public final int lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl() {
      return this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl;
   }

   public final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(int var1) {
      this.IIllIlIlIlIIlIIIlIIIIlIlIllllIlIlIIIIlIIlIIlIIlllIllllllIlIIIlIllIllIlllIlIllIllIllIl = var1;
   }

   public final float IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll() {
      return this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI;
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(float var1) {
      this.llIIllIIllIlIIlIIllllIlIlIIllIlIIIlIIlIIIIlIIIIllIllllIIlIIlllIllIllIlIllIIlllIlIlIlI = var1;
   }

   public final boolean llIIIllIIIIllllllIIIlIIIIIIIlllIIllllIlllIlIlIIlIIIIlIIIlllllIIllIllllllIlIIlIIlIlIII() {
      return this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(boolean var1) {
      this.IllIIlllIIIlllllIlIIIllllIllIIlIIIIIlIIIIIIlIlllllllIIIlllIIllllIlIlIlIIlIlIIlllIllll = var1;
   }

   public final boolean IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl() {
      return this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll;
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(boolean var1) {
      this.lllllIllllIlIIIIIIlllIIllllllIlIlIIlIIllIIlllllIIlIIIIIIlllllIIllllllllIIIlllIlllllll = var1;
   }

   public final boolean IlIlIlIlIlIlIlIlIllIIlIlIlIlIlIIIllllIlIIIlIIIIIIlIlIlIIllllIlIIIIlllIIlIIIlllIIIIlII() {
      return this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl;
   }

   public final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(boolean var1) {
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = var1;
   }

   @NotNull
   public final lIIlllllIIIlllIIIllIIlllIllllllIIIIIlllllIIlIIIIIIIlllIlIlIIlIlllIIlIIlIIlIIlllIIlllI lIlIlIlIIIlIlIIIIIIIIIIIlIllIIIIIIIllIIIIlIIIIIlIllIIIIlIIIIlIIlIllIllIlIlIllIIIlIlll() {
      return this.lIIIIIllIllIllIllllIIlllIlIlllIIIlIllIlIlIIIIIIIIlIIllllIIIIIIIllIlIlIIIlIlIllIllIlll;
   }

   @NotNull
   public final List<IIllIlllIIIIIllllIlllIIllIIIlIIllIIllIIlIllIIllIIIlIllIIlIIIIIlIIIIlIlIIIIIIlIlllIllI> IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl() {
      return this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, @NotNull List var3) {
      var1 = lIIlllIIlIlllllIIIllIlIlIIlIlIlIlIIIllIlIlIIIIlllIIlIIIlllllIllllIIIIllllIIlIlIIllIII ^ var1;
      Intrinsics.checkNotNullParameter(
         var3, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"z">(8262, 3194467441909372816L ^ var1)
      );
      this.IIllIllIlllIlllIIllIlIIlllIlIIlIIIIIIIlIllIlIlIlIIIlIIIlllIIIIlIllIlIlIlllIIIllIllIll = var3;
   }

   @Nullable
   public final String IlllIllIIIIIlIIlIlIIIIlIIlIIIIIlIlIlIlIllIIIlIIlllllIIllIIlIlllIlIIIllIIlIlIIllllllll() {
      return this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@Nullable String var1) {
      this.IIlllllIlIIlIllIllllIlIIlIIIlllllIIllIlIlIlIIIIlllIIlllIllIllIIIIIllllIIIIllllIIlIlII = var1;
   }

   public final int lIIIlIIlIllIlIIIIIllIlIllllIIlIlIIIlIlIIIIIlIlllllIllllIIIIlllIlIlIlIlIIllIlIIIIIIIII() {
      return this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll;
   }

   public final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(int var1) {
      this.IIlllllIlIlIIIIIlIIlllllIIIIllIlIIIIllIIllIIIIllIIIIIIIIlllIllIllIlIllIIlllIlllIlIlll = var1;
   }

   public final boolean lIlllIIIIIIIIIIllIlIllIlIllIIlIIlIIIIlIllIllIlIIIllIlllIlIIlllIIlIIIllIllIlIIIIllIlll() {
      return this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI;
   }

   public final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(boolean var1) {
      this.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI = var1;
   }

   public final boolean IllIlllllIIlIIIIIIIllIllIlIllIIlllIIIIIlIlIIllIlIlIllIlIIIlIIIlllIlIlIlIlllIIllIlIIlI() {
      return this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII;
   }

   public final void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(boolean var1) {
      this.lIllIIllIlllIlIlllIllIlIlIIIllllllllllIlllIllIlIIlIIlllIlIIlllIlIIIlllIIllIIllIllIlII = var1;
   }

   public final float IIIlIIlIllIlllIIIIlllIlIIIlIIIlIIlIIlIIllIIIlIlIlIlllIllIlIllIllIIlIlIllIIIIIllIlllll() {
      return this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll;
   }

   public final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(float var1) {
      this.IIIlIIIIIlIllIIllIlIIllIIllIlllIllIIIllIlIlIlIIIIIllIIIIlIlllIIIIIllIIlIIlIllIllIIIll = var1;
   }

   public final int lllIIlIIIIIllIIlIllIIlIllllIlIIIIlIIlIlIIllIllIIIIIIlIlIlIIIlllllIIIIIIIllIIIlllIIIlI() {
      return this.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI;
   }

   public final void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(int var1) {
      this.IIIlllIIIIlIIllIlIIIllIIIllllllIIIIIIlIIIlllllIIIlllllIIIIIlIIlIIlIIIIIIIIlIlllIIlIlI = var1;
   }

   public final boolean IIlIIIIllIlIIlIIIlllIlIlIIllllIlIIIllIIlIlllIlIlllIIlIIIIllIIllllIlIlllIlIlIIlllllIII() {
      return this.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI;
   }

   public final void IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(boolean var1) {
      this.lIIlllIlIIlIIIllIllllllIIIIIIllIIllIIIIIllIllIllllllIIlIIlIIIlllIIIIIlIIllIlIIIIIIIlI = var1;
   }

   public final long lIllIllIlIllIlIlIIIlllIlllIlllIIIIIIIlIllllIIlIIIlIllIllIlIlIIlIIIlIlIlllIlllIIIIlIII() {
      return this.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1) {
      this.lIlllllIIIIlllllIlIIIIIIIllllIlIllIllIIlIIIIIIIIIlIlIIIlIIlIlIIIlIlllIllIIllIllIllllI = var1;
   }

   public final int llllIIIIllllllIllIIlIlIIIIllIIlIllIIlIlIlIIlllllIlIlIlIllllIIIIIllIlIlIIllIlIIllIIIII() {
      return this.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl;
   }

   public final void IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(int var1) {
      this.IlllllIllIlIIlIllllIlIlIIlIIllIlIIlIIllIlllllllllIlIIlIIlIlIlIIIllIlIllllIIIlIIlllIIl = var1;
   }

   public final boolean IIIlIllIIIIllIIlIlIIlIIllllllllIlIIlllIlIlllIllIlIIlIlIlIlIIllllIllIIIlIIllIlllIlIlIl() {
      return this.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI;
   }

   public final void IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(boolean var1) {
      this.IlllIIllIlIllIIllIIIIlIlIllIlIIlllIIIIlIIIIIIIIIIlIlIIlllIllIlIlIlIllIIllIIlIIlIllllI = var1;
   }

   public final boolean IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI() {
      return this.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI;
   }

   public final void IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(boolean var1) {
      this.IIllIlIlIIIIIIIIIlIlIlIIllllIIlllIlllIlIIIlIllIIIIIlllIIIlllIIIIllIlIlllIlIIllIIIlIlI = var1;
   }

   public final boolean IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl() {
      return this.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII;
   }

   public final void IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(boolean var1) {
      this.IIIllIllIllllIIlIIIIIIIlIlIIllIIlIlIIlIIlIllIllIIIlIIllIIlllIlIlllIlllIlIlIlIllIIIIII = var1;
   }

   public final boolean IIllIllIIlIIIlIlllIlIlllIIIlllIIIlIIIIIIIIllIlIIlIIIIllllllIllIIlllIIlIIIIIlIllllllIl() {
      return this.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII;
   }

   public final void lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(boolean var1) {
      this.IIllllIllIlIIIIIllIIllIlllIIlIIIIlIllIIlllllIIlllIIIllIlllIIlIlIIlIIlIIIlIIlllIlIIIII = var1;
   }

   public final boolean IllIIlIlIlIlIIllIIllIlIlIIlllIIllllllIIIIlIlIllIIlllIlIIIIlllIIIllIIIIIlllllllIlIllIl() {
      return this.lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII;
   }

   public final void IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(boolean var1) {
      this.lIIIIlllllIlIllIllllllllllllIIllIllIIlllllIlIIIlIlIIIIIIlIIllIIIIIlIIIllIIIIlIIlIIlII = var1;
   }

   public final int lIIIlIlIllIIlIlIIllllIIlIlllIlIllllIIIllllIIllIIlIlllllllllIlIlIlIIllllIIlllllllllIII() {
      return this.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI;
   }

   public final void IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(int var1) {
      this.lIllllIlllIIllIllllllIIIIIIIIIIllIIlllIIIlllIIlIIIIllIIllIIllIIllIIIIlllIIIlIlllIlIlI = var1;
   }

   public final int llIllIllIllIlIIlIlIlIIllIIIlIlIlllIIlIlllIIlIllllIllIlIlIIIllIIlIIllIIIIlIIIlIIlIlIlI() {
      return this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI;
   }

   public final void IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(int var1) {
      this.lIlIllIlIlIIlIllIlllllIlIllIlIIllIlIIIIlllIIIIlIIIIIlllIIIlIIIIlIIIIllllllIIIIllIIllI = var1;
   }

   public final float lIIlIllIlllIIIlllIIllIIlIllIllIllIIIIIllllllIllIllllIIIIlllIllIlIIIIlIIlIlllIlIIIllll() {
      return this.IIlIllIIlllllIlIlllllllIllllIIlIIIllIIllIIllIlIIIllllIIIlllIllIIIIlIlIIIllIllllIlIlll;
   }

   public final float lIIIlIIIllllllIllIlIIIIIIlIlllIIIlIlIIIIIlIlllIllIlIlIIIIllllIIlllIIlIIllIIIllIIIIIIl() {
      return this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll;
   }

   public final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(float var1) {
      this.llllIIlIIIIlIIllIIIIIllIlIlIllIlIllllIlllIIlIllIIlIIIIllllllIllllIIllIIlIIlIlllIlllll = var1;
   }

   public final float IlllIIIIIllIlllIIIIlIIlIIIlllIIlIIlIlllIllIIIIIlIllIIlIIIIllllIIIllIIllIIlllIIllIllll() {
      return this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll;
   }

   public final void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(float var1) {
      this.llIlIIllIIllIIlIIlIlIlIIlIlllIlIlIIIIllIlllIlIllIIlIIIIIIIlIIllllIIIIlIIllIlIIIIIllll = var1;
   }

   public final boolean IlIlllIIIlIllIlIlIIlIlIIlllIIIIIIIIIlllIlIlIlllllIIIlIIIllIlIllllIlllllllIllIlIlllIll() {
      return this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII;
   }

   public final void IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(boolean var1) {
      this.IIIlllIIlIIIIlIIIIIllIIIIlllIllIlIIIlllIlIlllllllllIlIIIllIIlIIlllIlIlllIllIllIIIIIII = var1;
   }

   public final boolean IlIlIllIIlIIIlIIIIlIIIlllIIlIIllIIIIIlllIlIlllIllllIIIllIIIlIIIlIIlIllllIIIIlIllllIIl() {
      return this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl;
   }

   public final void IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII(boolean var1) {
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = var1;
   }

   public final boolean IlIIIIIIlIIllIIIIlIllllIllIIlIlIllIIIllIIIIIllllIlllllllIIIlIllllIIlIIlIlIlIlIIIIllll() {
      return this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   }

   public final void IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(boolean var1) {
      this.lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = var1;
   }

   public final float IIIIIIIIllIlIlIIllIlllIIIlllIIlllIIIIIlIIlIIIIlllIlIIIllllIllIIIIIlllIlIllllIllIlIlll() {
      return this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   }

   public final void IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(float var1) {
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = var1;
   }

   public final long lIllIllIIlllIllIlIIlllIllIIllIIlIIIlIIIIlIIllIlIlllIIIIlIlIIllIllIIIlIIIIIlIIIIlllIII() {
      return this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var1) {
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = var1;
   }

   @NotNull
   public final float[] lIlIIIllIIlIlIlIlIlllIIIIlIIllIIIIIlIIlIlllIIIlIIlIlIllIIlllIIlIllIlllIllIlllIlllIllI() {
      return this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   }

   @NotNull
   public final float[] lIIIIlIIIIIIIIIlIIllllIlIIIIllIlllIlIIIllIlIIlIlIlllllIIlllIlIIllIlllIlIIIIIllIlIIllI() {
      return this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   }

   public final boolean IlIlIIIIIlIllllIIIIIllIIIIIlllIIlIllIIlIllIlIlIIIIllIlIlIlIIllIllIlllIlIlIllIIlllIIlI() {
      return this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
   }

   public final void IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(boolean var1) {
      this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = var1;
   }

   public final boolean llIllIIlIlIlIlIIllIIlIlllIIIlllIlllIIIlIIlllIIIIlIIlIlIlllIllIIIIIIIIlIIlIlIIlIIllIII() {
      return this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   }

   public final void llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(boolean var1) {
      this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = var1;
   }

   public final int IlllllllIlIlIllIlIlIlIllllIIIIIIllIllIlIIllIlIIlIIlIIIIlIIIlIIIlIlIIIIIIllIIlIIllllII() {
      return this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   }

   public final void IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(int var1) {
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = var1;
   }

   public final int IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII() {
      return this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   }

   public final void lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(int var1) {
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = var1;
   }

   public final boolean lllIIllllllIlIIIIIIlIlIlIlIllllIlIlllIllIIIIllIIllllIIllIlIlIlIIlIIIIIllIIIIIIllIIllI() {
      return this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   }

   public final void lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(boolean var1) {
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = var1;
   }

   public final boolean IlIlIIIIllllIlIIlIlllllllllIlllIllIlIIIIllIIlIIlIlIlIIlllIIlIlllllIIIlIIlIIlIIlIIlIII() {
      return this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   }

   public final void IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(boolean var1) {
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = var1;
   }

   public final boolean IllIIlIIlIlIIlIllIllIIIllIIIllIlIIllIlllIlllIIIlIlIlIIlIIIllIlIlIIIIlIllIIIlIIIlIIlII() {
      return this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   }

   public final void IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI(boolean var1) {
      this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = var1;
   }

   public final boolean llIIllllllIIllIlIlllIIlIIIIIIllIlIIIlIlIlIIIlIIIIllIIlIllIIlIIllIIIIlIIIIIllIIIllIlII() {
      return this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   }

   public final void lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl(boolean var1) {
      this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = var1;
   }

   public final boolean IlIllllIIlIllIIllIIlIlIIIlllIlIIlIIIIIIlllIIIlIllIlIllIIIIIlllIIIlIllIlIIlIIllllIIIlI() {
      return this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
   }

   public final void lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl(boolean var1) {
      this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = var1;
   }

   @NotNull
   public final List<String> IIIIIIlIlIIIlIIIIIlllIIlIlIllIllIlllIIIIIllIlIIlIlIIIIIIllllIIIllIIllllIlIIlIIllllllI() {
      return this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var1, @NotNull List var3) {
      var1 = lIIlllIIlIlllllIIIllIlIlIIlIlIlIlIIIllIlIlIIIIlllIIlIIIlllllIllllIIIIllllIIlIlIIllIII ^ var1;
      Intrinsics.checkNotNullParameter(
         var3, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"z">(8262, 3194568998712973918L ^ var1)
      );
      this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = var3;
   }

   @NotNull
   public final List<lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IllIlllllllllIlllIIllIIlIllIllllIlIIlIIllllIIllIlIIIlIlIlIlIlIllIIlIlIIlIIllIlIIIlIIl() {
      return this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(@NotNull List var1, long var2) {
      var2 = lIIlllIIlIlllllIIIllIlIlIIlIlIlIlIIIllIlIlIIIIlllIIlIIIlllllIllllIIIIllllIIlIlIIllIII ^ var2;
      Intrinsics.checkNotNullParameter(
         var1, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"z">(12979, 4799535124425189398L ^ var2)
      );
      this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = var1;
   }

   @Nullable
   public final IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII lIIllllIIlIlIIlIllIIlllIlIIIIIlIlIlIllIllIllIIIlllIlIllIIIIIIllIllIllllIIIllllIlIIlll() {
      return this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @Nullable IllIIlIlIlllIIIIllllIIllIlIIIIIllIllIIIllllIlllllIlIlIIlIIlIlIIIlIlIIIIIIlllIllllIIII var1
   ) {
      this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI = var1;
   }

   @Nullable
   public final me.octo.client.gui.clickgui.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII IIlIIllIlIIIIlIllIlIlllIllIIlIlIIlIlIIIlIlIIIlIIllIlIlIlllllIIlIlIIIlIllllIlIlIIIllll() {
      return this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @Nullable me.octo.client.gui.clickgui.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII var1
   ) {
      this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI = var1;
   }

   @Nullable
   public final IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI lIIIIllllIIlIlIIIlllIIIIlIlllIIIIlIllIIllIlIlIIIIIlIllIllllIIIlIllIIIIllIIIIIlllIlIII() {
      return this.IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @Nullable IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI var1
   ) {
      this.IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII = var1;
   }

   @Nullable
   public final me.octo.client.gui.clickgui.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII llIlIIIlIllIIIIIIlllIIIIIIllIIIIIIlIIIIIllIIIIlIllIIlIlllIIIlIIlIllIIIlIIllllllIlIlIl() {
      return this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll;
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @Nullable me.octo.client.gui.clickgui.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII var1
   ) {
      this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll = var1;
   }

   public final boolean IlIlIIIIlllIIllIlIlllIIlIIlIIllllIlIIIllIIIIlIlIIllllllIIIIllIIIlllIIllllllIllIlIllll() {
      return this.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl;
   }

   public final void IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll(boolean var1) {
      this.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl = var1;
   }

   public final int IIlIIIIllllIlIlIllllIIIIIIIlllIIlIIIllllIlIlIIlIIIIlIlIlIlIllIIIIIIlIIIlIllIIlIIIlllI() {
      return this.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl;
   }

   public final void IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(int var1) {
      this.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl = var1;
   }

   public final boolean lIlIlIIIIlIIllllIlIlIIIIIlIIIIIllIIlIllIIllIllIlIIlIIIIlIIlIIIIlIlIlIlIIlIlIIIllllllI() {
      return this.llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI;
   }

   public final void llIIIllIIIIllllllIIIlIIIIIIIlllIIllllIlllIlIlIIlIIIIlIIIlllllIIllIllllllIlIIlIIlIlIII(boolean var1) {
      this.llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI = var1;
   }

   public final boolean llIIIllIllIIIllllllIlIlIlIIIIIIIlllIIIIlIIlIIIIIIIllllIlllIIllIllIIIIIIIIlIIIlIIIlIII() {
      return this.IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII;
   }

   public final void IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl(boolean var1) {
      this.IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII = var1;
   }

   public final boolean IlIIIllIlIlIlllIIlIIlIllllllIIIlllIllllIllllllIllIlllIllIIlIllllIlIIIIllIIIIIIIlllIll() {
      return this.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll;
   }

   public final void IlIlIlIlIlIlIlIlIllIIlIlIlIlIlIIIllllIlIIIlIIIIIIlIlIlIIllllIlIIIIlllIIlIIIlllIIIIlII(boolean var1) {
      this.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll = var1;
   }

   public final float IllllIIIIIIIlIlIllIIIlIIIIIIlIIIlIIllllIIIlIIIlIllllIIIlIllIllIlIIlllIlllIlIIIlIIlIII() {
      return this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI;
   }

   public final int lIlIIIlIllIlllllIIIllllllIllIIlIIlllIlIIlIIlllIlllIlIlIIlIIlllIlllIlllllIIlllIIIIIIll() {
      return this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll;
   }

   public final void IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(int var1) {
      this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = var1;
   }

   public final int lIllIllIIIlIlIlIlllIllIIlIllllIIlIlllIlIIIlIllIIlIlIIIIIlIIlllIIIIlIIIIllIlllIlIIlIlI() {
      return this.llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll;
   }

   public final void IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII(int var1) {
      this.llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll = var1;
   }

   public final int IIIIIlIIlIllIIlllIIIIlIIllllllllIIIllIllIIIlllIllIIIIIlIIlIIIllllllIlllllIIllIllIllII() {
      return this.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll;
   }

   public final void IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(int var1) {
      this.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll = var1;
   }

   public final int IIIlIlIIllllIIlIllllIlIlIlllllllllIlIlllIIlIIlIlIlIIllIIIIllIllllIIlllIIIlIIIIllllIlI() {
      return this.IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI;
   }

   public final void IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(int var1) {
      this.IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI = var1;
   }

   public final boolean llIIIIIlIIllIllIIIlllIllIlllIIlllIIlllIlIIIIlIlIlllIIIIlIIlIllIIIIIllIllIIIlIIlIlllll() {
      return this.lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl;
   }

   public final void lIlIlIlIIIlIlIIIIIIIIIIIlIllIIIIIIIllIIIIlIIIIIlIllIIIIlIIIIlIIlIllIllIlIlIllIIIlIlll(boolean var1) {
      this.lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl = var1;
   }

   public final boolean lllIIIllllllIllllllllIlIlIIIIIIIllIIIlIIIlIllIIIlIIlIllIIIIIIIlIIllIIIIIlIllIIlIllllI() {
      return this.lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll;
   }

   public final void IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl(boolean var1) {
      this.lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll = var1;
   }

   public final float llllIIllIIIlIlIIlIllIlIIlIllllIlllIlIIIllllIIllIlIlllllIIlIlllIIlllIllIlllIlllIIlIIll() {
      return this.llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII;
   }

   public final void IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(float var1) {
      this.llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII = var1;
   }

   public final boolean lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII() {
      return this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl;
   }

   public final void IlllIllIIIIIlIIlIlIIIIlIIlIIIIIlIlIlIlIllIIIlIIlllllIIllIIlIlllIlIIIllIIlIlIIllllllll(boolean var1) {
      this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl = var1;
   }

   public final boolean lIlIllIllIIIlllIIIIIlIllIIIIIlllllIIIIIIllIIllIIIIllIlIIlIlIIIIllIIllIIIIIIIlIlIIIIII() {
      return this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII;
   }

   public final void lIIIlIIlIllIlIIIIIllIlIllllIIlIlIIIlIlIIIIIlIlllllIllllIIIIlllIlIlIlIlIIllIlIIIIIIIII(boolean var1) {
      this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII = var1;
   }

   public final boolean lIIIIIllllIIlIlllIlIlIIIIIIllIllIlIIlIlIllIllIllIlIIlllIlIlIIIIIlllllIIIlIIIIlllIIIlI() {
      return this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI;
   }

   public final void lIlllIIIIIIIIIIllIlIllIlIllIIlIIlIIIIlIllIllIlIIIllIlllIlIIlllIIlIIIllIllIlIIIIllIlll(boolean var1) {
      this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI = var1;
   }

   public final boolean lIlllIIlIlIlllIIIIIlIIlIlllIlIIlIIIIlllIlIlIIlIlIIlIllIIIllIIllIIIlIIlIIIlllIIllIIlll() {
      return this.IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI;
   }

   public final void IllIlllllIIlIIIIIIIllIllIlIllIIlllIIIIIlIlIIllIlIlIllIlIIIlIIIlllIlIlIlIlllIIllIlIIlI(boolean var1) {
      this.IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI = var1;
   }

   @Nullable
   public final IIllIlllIllIIlIIIIlIllIIlIlIIlIIlllllIlIlIllIIIllIIIIIIllllllllIIlIIllIIllIIllIlllIll llIlIIIIIllIIlIllIIlIIIIIIIIIlIlIlIllIlllllIlIllIIIIIllllllIIIllIIlIlIIlIIIlllllIlIlI() {
      try {
         IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl var10000 = (IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl)CollectionsKt.getOrNull(
            IllllIlllllIIllIlIIIllllIllIllIllllIIIllIllIllIIIIIIIIlllllIIIlIIlllIIIIIllIIllIllIll,
            lIlllIlIIIIlIIIIIIIIlIIIIlIllIllIlIlIIIlIIIIIIIlIIllllIllIIIIIlllllIllIlIlIIIlIlIIIlI
         );
         if (var10000 != null) {
            return var10000.getEngine();
         }
      } catch (NoWhenBranchMatchedException var1) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1);
      }

      return null;
   }

   @Nullable
   public final IlIIlllIlIIllIIIlIIlIIIlIIllllIllIllllIllIIllIIllIlIllIIIIIlllllIlllIlIllIIIIlIIlIlIl lIlIllIIIllllllIlIIlllIllIlIlllIlIlIlIllIIllllIIIlIIllIlllIlIlIIlIlllllIlIllIIlIIllIl() {
      try {
         IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl var10000 = (IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl)CollectionsKt.getOrNull(
            IllllIlllllIIllIlIIIllllIllIllIllllIIIllIllIllIIIIIIIIlllllIIIlIIlllIIIIIllIIllIllIll,
            lIlllIlIIIIlIIIIIIIIlIIIIlIllIllIlIlIIIlIIIIIIIlIIllllIllIIIIIlllllIllIlIlIIIlIlIIIlI
         );
         if (var10000 != null) {
            return var10000.getScreen();
         }
      } catch (NoWhenBranchMatchedException var1) {
         throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1);
      }

      return null;
   }

   public final boolean lIllIIIIlllIllllIlIllIIlIllllIllIIllIllIIllIIIIllIllIIIlIllIllllIIIIllIIlllllllIlIIll() {
      return this.llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl;
   }

   public final void IIIlIIlIllIlllIIIIlllIlIIIlIIIlIIlIIlIIllIIIlIlIlIlllIllIlIllIllIIlIlIllIIIIIllIlllll(boolean var1) {
      this.llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl = var1;
   }

   public final float lllIllIIllIIIllllllIIIlIIlIlIlIIlllllIllllIIIllIllllllllIIlIIlIlIlIIIIIIlIIIlllllllIl() {
      return this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII;
   }

   public final void IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(float var1) {
      this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII = var1;
   }

   public final float llIlIlIIIlIIllIlllIIIllIlllllllIlIlIIllIlllllIIIllIIIIIIIIllIIIlIllIlllIIlIIlIIIllllI() {
      return this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII;
   }

   public final void IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(float var1) {
      this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII = var1;
   }

   public final float IIlIIIllIllllIIlIIlIIIIIIllIIllIIIIlIIllIlIllllIlIIIllIIIlllllllllIlIIIlIlIllIlIIlIlI() {
      return this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII;
   }

   public final void lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(float var1) {
      this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII = var1;
   }

   public final float lIIlIlIIllIlIIlllllIllIlIlIIllllIllIIIlIllIlIIlIlIlIllIlllIlIIIllIIlIlIIlIlIllllIIlll() {
      return this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl;
   }

   public final void IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(float var1) {
      this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl = var1;
   }

   public final boolean IIIllIIlllIIIlIIIIllIIIlllllIIllllIIIIIlIIIlIllIlIlIIlIIlllllIIllIllIIlIIlllllIIIIIIl() {
      return this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll;
   }

   public final void lllIIlIIIIIllIIlIllIIlIllllIlIIIIlIIlIlIIllIllIIIIIIlIlIlIIIlllllIIIIIIIllIIIlllIIIlI(boolean var1) {
      this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll = var1;
   }

   public final float IIIIIlllIllllIIllIIIIIlIlllIIlIllllIIlIIlllIIlIIIllIIlIlIllIIlIllIllIlIIllIlIIlIIIllI() {
      return this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII;
   }

   public final float IIllIlIlIIlIllIllIllllIllIlllIIIIIllIlllIIlIlllllIIIlIlIllIIIIIIIllllIIllIIlIIlllllIl() {
      return this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl;
   }

   public final float IlllllIIllIllIIlIlIllllIIIllIllllIIlIIIIlIlIlIlIIIllIllIlIllIlIlIlIIIllllIlIlIIlIIIll() {
      return this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI;
   }

   public final boolean lllIlllIlllIlIlIlIlIIlIIIllIIIIllIIlIlIIllIlIllIIlllIlIlIIIllIllIlIIIlIlIIlIIIllIlIIl() {
      return this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll;
   }

   public final void IIlIIIIllIlIIlIIIlllIlIlIIllllIlIIIllIIlIlllIlIlllIIlIIIIllIIllllIlIlllIlIlIIlllllIII(boolean var1) {
      this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll = var1;
   }

   public final int IIIIIlIIlIIllIlIIIlllIIllllllIIIlIIIIIllIlIlIIIllllIIllllIIIllIIlIlIlIIlIIIIIlIIIlIII() {
      return this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl;
   }

   public final void llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(int var1) {
      this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl = var1;
   }

   public final float lllIIlIIlIlllIIIlIllIllllIlIIllIlllIlllIllIIIllIllllIlIlIIllIlIllllIllllllIIIIlIIlIlI() {
      return this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI;
   }

   public final void IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(float var1) {
      this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI = var1;
   }

   public final float IlIlIlllIIlllIlIlllIIIlllIlIIllIllIIIlIIIlllIllIlIllIlIlIlllIIllIlIlllIllllllIIIIllll() {
      return this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll;
   }

   public final void IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII(float var1) {
      this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll = var1;
   }

   public final boolean lIlIlllIlIlIIIlIlIIlllIlIlllllIIIIIIIlIlllIlIIIlllIlllIlIlIllllIIllIIllllIlIIIlllllII() {
      return this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI;
   }

   public final void lIllIllIlIllIlIlIIIlllIlllIlllIIIIIIIlIllllIIlIIIlIllIllIlIlIIlIIIlIlIlllIlllIIIIlIII(boolean var1) {
      this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI = var1;
   }

   public final float IlIlIIllIllIlIIIIlllIIIlIllllIIlIlIIlIlIIIIIlllIllIIllIIIIIIlIllIllIIIIlllIlIIlIlIIll() {
      return this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll;
   }

   public final void IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(float var1) {
      this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll = var1;
   }

   public final boolean IllIllIIlIllIIIlllllIIllIlIllllIlIlIIIIIIIIlIlIIlIlIllllIllIllIIlllIlIIIlIlIlIllIIlIl() {
      return this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII;
   }

   public final void llllIIIIllllllIllIIlIlIIIIllIIlIllIIlIlIlIIlllllIlIlIlIllllIIIIIllIlIlIIllIlIIllIIIII(boolean var1) {
      this.llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII = var1;
   }

   public final boolean lIIIllIIIIlIIIIlIIIIlIlllllIllIlllllIIIlIIllIlIIllIllllIIlIIlIIIlllIlllIllIIlllIIIIlI() {
      return this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII;
   }

   public final void IIIlIllIIIIllIIlIlIIlIIllllllllIlIIlllIlIlllIllIlIIlIlIlIlIIllllIllIIIlIIllIlllIlIlIl(boolean var1) {
      this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = var1;
   }

   public final boolean IIlllIIIlIlIIlIIIllIIIlIIIIlIllIllllIIIIIIlIllIllllIIlIIIlIllIIllIIIllllIlIllIlIIIllI() {
      return this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII;
   }

   public final void IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI(boolean var1) {
      this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII = var1;
   }

   @Nullable
   public final IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl lIlllllIIlIllIIIllIllIIIIIIlllIlIlllIIlIllllllIllIIIlIlIIllIIIIlIlIIIlIllIIIlIIlIIlIl() {
      return this.IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @Nullable IIIlllIIIIIlIIllIllIlllllIIlllIIlllIlIIllIllllllIlIllllllIIlIlllllIlIlIIIlIlllIIlllIl var1
   ) {
      this.IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl = var1;
   }

   @Nullable
   public final me.octo.client.gui.clickgui.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII lIllIllIIIIIIlIIIllllIllllIlIIIIllllIIIIllllIlIIIIllIlIllllIlIIlIllIIlIIIllIlllIIllll() {
      return this.IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl;
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      @Nullable me.octo.client.gui.clickgui.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII var1
   ) {
      this.IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl = var1;
   }

   @Nullable
   public final lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII lIIIIllIlIIIlIllIlIIIIIIlllllIllIIIllIllIIllIIlIllIIIIIlIIllllIIlIlllIlIllIIlllIllllI() {
      return this.IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @Nullable lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var1
   ) {
      this.IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI = var1;
   }

   @Nullable
   public final me.octo.client.gui.clickgui.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII IIIIIIllllIIlIlIllIIlIlllIllIlllIllllIlIIIIIlIlllIlIllllIIllllIlllIIllIIIlIllllIlIIII() {
      return this.lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll;
   }

   public final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      @Nullable me.octo.client.gui.clickgui.lIlIIIlIlIllllllIllllIIIIllIlllIIllIlllIlIIllIlllllllIllIIIIlIIIIIIIIllllIIIlllIlIlII var1
   ) {
      this.lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll = var1;
   }

   @Nullable
   public final lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI llllIlllIIIlIllIlIIIIIIlllIlIlIIIIIIIlllIlllIIllIlIIlIIlIIlIIllllIIllIIIlIlIlIlllllIl() {
      return this.IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @Nullable lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI var1
   ) {
      this.IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll = var1;
   }

   @Nullable
   public final File IIIIIlIlIlIlllIIlIIllIlIIlIIlIlllIllllIllIIlIIIlIIllIllllIlllIllIIIlIlllIIIIllIIIIlII() {
      return this.IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI;
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(@Nullable File var1) {
      this.IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI = var1;
   }

   public final boolean IIIllIllllIllIlllIIlIIIIIllIIIIIllIIllIlIlllllllllllIlIlIlIIlIIIIIIlIlIIIlllIIlIIIlIl() {
      return this.IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI;
   }

   public final void IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl(boolean var1) {
      this.IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI = var1;
   }

   public final double IlIlIIIlllIlIIlIlllIllIllIIlIllIIllIlIIlIIlIllllllIlIIlIllIllllIIlIIIlIIIllIlIIIIlIIl() {
      return this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(double var1) {
      this.lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI = var1;
   }

   public final boolean llllIlIlIlIlIllIlIlIIIlIlIIIllllIllIIIIIllllIIlIlIIlIlIIIllIIIIlIIIIIlIIlIllIIllIIIII() {
      return this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl;
   }

   public final void IIllIllIIlIIIlIlllIlIlllIIIlllIIIlIIIIIIIIllIlIIlIIIIllllllIllIIlllIIlIIIIIlIllllllIl(boolean var1) {
      this.IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl = var1;
   }

   public final float lIllIIIllIlIIlIlIlIlIlIllIlIIlIIlIlllIIIllllllIIllIlIllIllIlllIIIIlIIIlllIlllllllIIlI() {
      return this.lIIIllIIIIlllllllllllllllllllIIlIIIIIlIIllIIlIIlIllIIllllIIIIlllIlIlIlllllIIIIlIlIIIl;
   }

   public final void IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(float var1) {
      this.lIIIllIIIIlllllllllllllllllllIIlIIIIIlIIllIIlIIlIllIIllllIIIIlllIlIlIlllllIIIIlIlIIIl = var1;
   }

   public final float IIIlIlIlIllIIIllIllIIlllIIIlIlllIlllIIIIIlllIIllIllIllIIIllIIIlIlIIIllIIlIllIlllIIIll() {
      return this.lIIIIIIIlllIlllIlIIlIIlIlIllIIIIIIllllIlIlllIIIlIlIIIlIlllllllllIIIlIlllIIIIIllllllIl;
   }

   public final void llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl(float var1) {
      this.lIIIIIIIlllIlllIlIIlIIlIlIllIIIIIIllllIlIlllIIIlIlIIIlIlllllllllIIIlIlllIIIIIllllllIl = var1;
   }

   public final float IllIIIIllIIlIllIIIIIlIllIIllIIIlIllIIlIlIIIIlIllIlIIlIIllIIlIIIllIlIIlIIlllllIIIIllII() {
      return this.llIIIlIIllIIlllIlllllIlIllIIlIIllllIIlIlIllIIIllIIIIlIlIIlIIIllIlIlllllIIlIIIIlIIIllI;
   }

   public final void lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(float var1) {
      this.llIIIlIIllIIlllIlllllIlIllIIlIIllllIIlIlIllIIIllIIIIlIlIIlIIIllIlIlllllIIlIIIIlIIIllI = var1;
   }

   public final float lllIIllIIIlIlIIIlIIlIlIlIIIIIIIIlIlllllIIIIlllIIllIllllIllIIIlIIIIIlIllIIllllIIIlllll() {
      return this.IlllIllIlllIlIlIIlIlIIlIIlIlIIIlllIllllIIIIlllIlllllIIlIlIIIIlIllllllllIIlIlIIlllllII;
   }

   public final void IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(float var1) {
      this.IlllIllIlllIlIlIIlIlIIlIIlIlIIIlllIllllIIIIlllIlllllIIlIlIIIIlIllllllllIIlIlIIlllllII = var1;
   }

   @NotNull
   public final HashSet<String> IIlIlIIlllIIIIllIlIlIIllllIIlllIIllIllIlIlIlIllIlIIlIIllllIIlIlIllIllllllIlllIIIIlllI() {
      return this.llllllllllIIIIIlllllIIIlIlIlIlIlIIIlIlIlllIlIllIlIIIlIIIIllIIlIlIIlIIllIllllIIIIllIII;
   }

   @NotNull
   public final HashSet<String> llIlllIIllIIIlIIIIlllIIlIllIllIIllIIlIIllllllIllllllIllIIlIIIIIIIllIlIIIIIIIIIIIlllll() {
      return this.llllIIIIIIlIllIllIlIIllIlIlIlIIIlIIIIIIIIIlIIIllIIIIlIlIlllIlIllIIIIIlIlIllIIlIIllIIl;
   }

   public final boolean IIIlIIIllIllIIIlIlllIIlIIlIIIllllIlIlIIIIIIIllllllIIlIllIIlIIIlIIIIlllIIIlIlIIIllIIll() {
      return this.IIllIlIlIIIllIIlIIIIIlIIllllllIIllllIIIIIIIlllIIIllIIIlllllIlIlIlIllIlIlIIlIlllllIlll;
   }

   public final void IllIIlIlIlIlIIllIIllIlIlIIlllIIllllllIIIIlIlIllIIlllIlIIIIlllIIIllIIIIIlllllllIlIllIl(boolean var1) {
      this.IIllIlIlIIIllIIlIIIIIlIIllllllIIllllIIIIIIIlllIIIllIIIlllllIlIlIlIllIlIlIIlIlllllIlll = var1;
   }

   public final boolean IlllIllllIIIlllllIIIIIlIlIIIIlIlIllIlIllIIllIIllIIlIlIlIIlIIllIIllIIIlIIllllIIIlIlllI() {
      return this.llIlIlIlIIlIlIIllIIIIIllIIIllllIIllllllIllIIIlllllIIIIlIIlIIllIIIIlIIlIIIlIlIIlIIIlll;
   }

   public final void lIIIlIlIllIIlIlIIllllIIlIlllIlIllllIIIllllIIllIIlIlllllllllIlIlIlIIllllIIlllllllllIII(boolean var1) {
      this.llIlIlIlIIlIlIIllIIIIIllIIIllllIIllllllIllIIIlllllIIIIlIIlIIllIIIIlIIlIIIlIlIIlIIIlll = var1;
   }

   @NotNull
   public final List<File> lIllIllIlIlIIIllIllIIIIIIIIlIlIllIIllllllIlIlllIlIllIIllIIllllIIIIIIlIlIlIllIlIllllII() {
      return this.lIlIlIlIllIlIIlIIllIllIlIllIIlIIlIIlIlllIIIIllIIlIlIIIIIlIllIIIllllllllIlIIlIlIllIlll;
   }

   public final boolean lIlIllIIllIIllIIlllllIlIIIllIIllIIlllIllIllIIIlIIIIlIlIIllIIIIIlIIlllIIlllIlIlIlIlllI() {
      return this.llIllIlIlIlIIlIIIlIIlIlIIlllIllIlIIllIIlIIIlIlIIllIllIlIlIIIIlIIllllllIllIIIlllIIlIIl;
   }

   public final void llIllIllIllIlIIlIlIlIIllIIIlIlIlllIIlIlllIIlIllllIllIlIlIIIllIIlIIllIIIIlIIIlIIlIlIlI(boolean var1) {
      this.llIllIlIlIlIIlIIIlIIlIlIIlllIllIlIIllIIlIIIlIlIIllIllIlIlIIIIlIIllllllIllIIIlllIIlIIl = var1;
   }

   public final boolean lIIlIlIIllIlIIIIllIllIIllIIIIIIllllIIllIIIlIlIllIlIIIlIIlIlIIIlIllIIllllllllIIlIlllII() {
      return this.lIIllIlllIIlIlIllIIlIlIIIllIllIllIlllllIIIlllIlllIlIlIIIlIIllIIIIIllIlIIlllIIIIIIIIlI;
   }

   public final void lIIlIllIlllIIIlllIIllIIlIllIllIllIIIIIllllllIllIllllIIIIlllIllIlIIIIlIIlIlllIlIIIllll(boolean var1) {
      this.lIIllIlllIIlIlIllIIlIlIIIllIllIllIlllllIIIlllIlllIlIlIIIlIIllIIIIIllIlIIlllIIIIIIIIlI = var1;
   }

   public final int lIIIIlIIIIIlIlIIIllIIIIlIllllIlIllIIlIIllIlIIllllIIIlIlllIIIIIIllIllllIlIlIIlIllllIIl() {
      return this.lIIllIIlIIlIIllllIIlIllllllIlIIIllllIIlIIlIIIIlIlIIIlIIIIlIllIIIIIIlIlIIIlIlllIllIIlI;
   }

   public final void lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI(int var1) {
      this.lIIllIIlIIlIIllllIIlIllllllIlIIIllllIIlIIlIIIIlIlIIIlIIIIlIllIIIIIIlIlIIIlIlllIllIIlI = var1;
   }

   public final int IlIIllIllIIIlIIIllIIllllIllIIlIIIIlllIlllIlIlIIlllllIlllIIllIIIIlllIlIlIIIllIllIIlIlI() {
      return this.lllIlllIllIIlIlIllIlIIIllIllIIlllllIIIllllIIlIlIIIlIIIlllIlllllIlIlIllIlllllllIllIlIl;
   }

   public final void IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(int var1) {
      this.lllIlllIllIIlIlIllIlIIIllIllIIlllllIIIllllIIlIlIIIlIIIlllIlllllIlIlIllIlllllllIllIlIl = var1;
   }

   public final float lllllIllllIlIlIIIlIlIllIlIllIIIlIIIIIllllllIllIIIIIIIlIIlllllIIIllIlllllIlIIlIllllIIl() {
      return this.IIlIlIllIIllIlIIlllllIIlIlIIIIlIlIlllIIIlIIllIllIIlIIlllIIllIlIIlllllIllllllllllIIIlI;
   }

   public final void IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI(float var1) {
      this.IIlIlIllIIllIlIIlllllIIlIlIIIIlIlIlllIIIlIIllIllIIlIIlllIIllIlIIlllllIllllllllllIIIlI = var1;
   }

   public final float IlIllIlIIIIlIlllIllllIIIlIllIIlllllIIIlIIlIlllIIIIlIlIlllIlIIIIIlIlIIlIlIlIlIIIIlllll() {
      return this.IlllIlllIIIlllIIlIlIlllIlllllIIlIIIIllIIIIIlllIIllIIlIIllllIllllIlIIlllIlIIIlIlIlIllI;
   }

   public final void lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl(float var1) {
      this.IlllIlllIIIlllIIlIlIlllIlllllIIlIIIIllIIIIIlllIIllIIlIIllllIllllIlIIlllIlIIIlIlIlIllI = var1;
   }

   public final float llIlllIlIlIlIIIIIIllIIIIIlIIllllIIIllllIIllIIIllllIlIIIIIIllIlIllllIlIIIIlIIllllIlIll() {
      return this.llllllIIlIlIIlIIIIlIlIIIIIIlIIlIllIIIlIlIlIllIIIIlIIlIIIIlIlllIIllllllIIlllIlIIllIIIl;
   }

   public final void lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl(float var1) {
      this.llllllIIlIlIIlIIIIlIlIIIIIIlIIlIllIIIlIlIlIllIIIIlIIlIIIIlIlllIIllllllIIlllIlIIllIIIl = var1;
   }

   public final boolean llIllIIlllIlIlIIllIlllIlIllIIllllllIllllIllIIIllIllllIIIIlIIllIIIIIlIllIllIlIIIIIllIl() {
      return this.lllIlIlIllllIIIIlIllIIllIIIllllIlIllIllIIlIIlIIIIlIlllIlIIIlIlllIllllIIIllIllIIIIIIII;
   }

   public final void lIIIlIIIllllllIllIlIIIIIIlIlllIIIlIlIIIIIlIlllIllIlIlIIIIllllIIlllIIlIIllIIIllIIIIIIl(boolean var1) {
      this.lllIlIlIllllIIIIlIllIIllIIIllllIlIllIllIIlIIlIIIIlIlllIlIIIlIlllIllllIIIllIllIIIIIIII = var1;
   }

   @NotNull
   public final List<lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> lIIllllIIlllIIllllllIIIIlIIIIlIIIllIIlIIIllllIlIllIIllIlllIlIIIllIlIllIIlIIIlIIIIIIII() {
      return this.IIlIlllllIIllIIIlllIIIIlIIIlIIIIlIlIllllIlIIlIIlIlIIIlIIllIllIIIlllIlIllllIIIIlllllII;
   }

   public final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(@NotNull List var1, long var2) {
      var2 = lIIlllIIlIlllllIIIllIlIlIIlIlIlIlIIIllIlIlIIIIlllIIlIIIlllllIllllIIIIllllIIlIlIIllIII ^ var2;
      Intrinsics.checkNotNullParameter(
         var1, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"z">(8262, 3194518096418937879L ^ var2)
      );
      this.IIlIlllllIIllIIIlllIIIIlIIIlIIIIlIlIllllIlIIlIIlIlIIIlIIllIllIIIlllIlIllllIIIIlllllII = var1;
   }

   public final int IIlIllIllIllIlIIIlIIllIllllIIlIIlIIIIIIllllIlIllIIIIIlllIIIlIIIlIIIlIIlIlllIlIIIlllll() {
      return this.lIIllIIIIlIlIIIIlIlllllIIIlIIllIllIlllllIlIllIIIIIIlIlIIIIIIllIIlllIlllllllIllIlIllII;
   }

   public final void IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI(int var1) {
      this.lIIllIIIIlIlIIIIlIlllllIIIlIIllIllIlllllIlIllIIIIIIlIlIIIIIIllIIlllIlllllllIllIlIllII = var1;
   }

   public final int lIIlIIllIIllIlIllIIlIIlIIIIIlIlIlIIlIlIIIIIIllIllIIIlIIllllIlllllIllIlllIlIlIllIllIII() {
      return this.lIIllIlIIIIlIIlIlIllIIllIIllIIIIIIlIIlIIIllllIlIlllIlIlllIlIllIIIIIllIIIIlIlIIIlIIIlI;
   }

   public final void lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl(int var1) {
      this.lIIllIlIIIIlIIlIlIllIIllIIllIIIIIIlIIlIIIllllIlIlllIlIlllIlIllIIIIIllIIIIlIlIIIlIIIlI = var1;
   }

   public final int lllllIIlIIlIlllIIlllIlIlIlIIIlIIIlIlIllIIlIlIIlllIIllllIIllIlIllIlIlIIIIIllllIllIIlII() {
      return this.llIIllllIlIIIlIIIIIllIIlllllIllllIIIlllIlIIlIlllIIlIIllIlllllIlIIIlllIllIllllllIIIllI;
   }

   public final void lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl(int var1) {
      this.llIIllllIlIIIlIIIIIllIIlllllIllllIIIlllIlIIlIlllIIlIIllIlllllIlIIIlllIllIllllllIIIllI = var1;
   }

   @Nullable
   public final String IlIlIIlIlllIIlIllIIlIlIlIllllllIlllIllIlIlIllIlIlIIlIIIllllllIlIllIllIIIIIlIlIIIllIlI() {
      return this.lIlIIlIlIIllIlIllIIIllIIllllIIllIIIIlllllIIlllIlIlIlIlIIIlIIIlIlIIllllllllIIIllIIIIIl;
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(@Nullable String var1) {
      this.lIlIIlIlIIllIlIllIIIllIIllllIIllIIIIlllllIIlllIlIlIlIlIIIlIIIlIlIIllllllllIIIllIIIIIl = var1;
   }

   public final int lIIlIIIllIlllIlIIlIlIIIllllllIlIIlIIlIIIlIIIlllIIIIIlllIIlllIIllllIlllIlIIlIlIllIlIII() {
      return this.lIIlIlIllIlIlIIlIIIllIIlIlllllIIIIllIlIIIlIIllIIIIlIIIlIIllIIllIlllIIIIlIlIIIIllllllI;
   }

   public final int llIlIlIIIllIIllIIIIlllIIIlllIIllIllIlllllIIIlIllIIlIllllIlIIIIIlIIllIllIIllIIIlIIIllI() {
      return this.IlIllIlIIlIIlIIIIIIlIlIIIlllIIllIllIIIlIIlIIlIIIlIIllIIIIIIllllIlIlIllIlllIIIIllIIIII;
   }

   public final void IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll(int var1) {
      this.IlIllIlIIlIIlIIIIIIlIlIIIlllIIllIllIIIlIIlIIlIIIlIIllIIIIIIllllIlIlIllIlllIIIIllIIIII = var1;
   }

   public final boolean IIIlIllllIlIlllIllllIllllIlIllIllIllIlIIlIIlIIIIllIIIllIIIIlIIIIlIllIIlllIIIlIllllIlI() {
      return this.IlIllIIIIIIIIIIlIllIIlIlIlIllIIIlIIIIllIlllllIIIlIIIIIIlIllIIlIIlIIIIIIllIIllllllIlII;
   }

   public final void IlllIIIIIllIlllIIIIlIIlIIIlllIIlIIlIlllIllIIIIIlIllIIlIIIIllllIIIllIIllIIlllIIllIllll(boolean var1) {
      this.IlIllIIIIIIIIIIlIllIIlIlIlIllIIIlIIIIllIlllllIIIlIIIIIIlIllIIlIIlIIIIIIllIIllllllIlII = var1;
   }

   public final boolean lIIllIlIlIIlIlIIIIllIllIIIIIIlIIlIIIIIIllIIIIlIllIlllIIIIlIllIlIIllllllIIlIIIIlIIIlII() {
      return this.llIlllIIIllllIIllIlIIIllIIIIlIlIllIIIIlIllIIIlIIllIlIllIIIIIlIIIlIIllIllIIIIlIIIllIIl;
   }

   public final void IlIlllIIIlIllIlIlIIlIlIIlllIIIIIIIIIlllIlIlIlllllIIIlIIIllIlIllllIlllllllIllIlIlllIll(boolean var1) {
      this.llIlllIIIllllIIllIlIIIllIIIIlIlIllIIIIlIllIIIlIIllIlIllIIIIIlIIIlIIllIllIIIIlIIIllIIl = var1;
   }

   @NotNull
   public final Map<Character, Character> llIIIIllIllllIlllIIIIIlIIIIIlIIlIlIllIIllIlIllIIIIlIllIIIlIIlIIlIIIllIIIlllIllllIIIlI() {
      return this.IlIIlllIIIlIlIllIllllIIIIllIlIIIlIllllIllIIlIlIlIlIlIIIllllIllIlllllIIlIIIlIIIlllIIlI;
   }

   @NotNull
   public final Set<Character> llIIlIllllIlIIIIIIIIIIlllllIIIIlIIllIlllllIlIllIlIIIIlIIlllllllIllIIIllIlIlllIIllIIlI() {
      return this.IlIIlIlIIIIlllIIIllIIlIIlIIlIIIllllllIIlIlIIlllIIllIlllIlIlIIIlIlIIlIIIlIlIlllIIIlIIl;
   }

   public final int IIIllllIIIlIlIlIlIlIIlllIllIIIIIIIllllIlllllIIlIllIlllllIIIIIlllIllIlIIlIllIIlIIlIIIl() {
      return this.IIlIllIllIlllllIIllIlIIIIllllIllllIlIIllIlIlIIllIlllllIllIIIlIlIIIIIIIIlIlIlIIlIIIlll;
   }

   public final void llIIIllIIIIllllllIIIlIIIIIIIlllIIllllIlllIlIlIIlIIIIlIIIlllllIIllIllllllIlIIlIIlIlIII(int var1) {
      this.IIlIllIllIlllllIIllIlIIIIllllIllllIlIIllIlIlIIllIlllllIllIIIlIlIIIIIIIIlIlIlIIlIIIlll = var1;
   }

   public final int lIIlIIllIIlIlIIIIlIIIlIIIllIIlIIllIlIIIIIlIlIlllIIlIlIIIIIlllllIlllllIllIIlllIllIIlIl() {
      return this.IlllIIllIlIlllIIllIlIIIllIIIlllllIllIIllIlllIIIlllIIlIllIlIlllIIlIlIlIllIlllIlIIIIlll;
   }

   public final void IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl(int var1) {
      this.IlllIIllIlIlllIIllIlIIIllIIIlllllIllIIllIlllIIIlllIIlIllIlIlllIIlIlIlIllIlllIlIIIIlll = var1;
   }

   @NotNull
   public final List<IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IIIIIIllIIIlIlIIlIIIlllIlllllIIIIIlIIllIIIIIlIIIIIlIIlIlllIIlIIlllIlIIIIlIIIllllllllI() {
      return this.IlIlIIlIIIIIIlllllllIIIllllIllIllIlIlIlllllIIIIlIIlllllIlIllIllllIllIlIIlllIIIIIIIIIl;
   }

   public final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(long var1, @NotNull List var3) {
      var1 = lIIlllIIlIlllllIIIllIlIlIIlIlIlIlIIIllIlIlIIIIlllIIlIIIlllllIllllIIIIllllIIlIlIIllIII ^ var1;
      Intrinsics.checkNotNullParameter(
         var3, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"z">(8262, 3194492440838589069L ^ var1)
      );
      this.IlIlIIlIIIIIIlllllllIIIllllIllIllIlIlIlllllIIIIlIIlllllIlIllIllllIllIlIIlllIIIIIIIIIl = var3;
   }

   @NotNull
   public final Map<Integer, IlIlIlllllIIlIIIIIllllIIIIlIlIlIIIlIlllIlIlllIIllIIIlIllIllIllIlllIlIllllIIlIlIlllIll.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll> IIlIIIIIIllIlIlIlllllllIIIIIIIlllIlIIlIlllIIlIlIlIIllIlllllIlllIIllllIlIIlllIIlIlIIll() {
      return this.lIIllllIlIIIIIIIlllIlIIIlIlIlIIlIlIlIIIIlIlIlIIlIIlIIlIllIlIIlIIIIIlIlllIlIllIIIlIlII;
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, @NotNull Map var3) {
      var1 = lIIlllIIlIlllllIIIllIlIlIIlIlIlIlIIIllIlIlIIIIlllIIlIIIlllllIllllIIIIllllIIlIlIIllIII ^ var1;
      Intrinsics.checkNotNullParameter(
         var3, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"z">(8262, 3194553590754169188L ^ var1)
      );
      this.lIIllllIlIIIIIIIlllIlIIIlIlIlIIlIlIlIIIIlIlIlIIlIIlIIlIllIlIIlIIIIIlIlllIlIllIIIlIlII = var3;
   }

   public final long lIIllllIlllIIIllIlIIIllIIlIIllIlllIIllIIlIIlIlIllIIlllIIlllllIIIllIllllIllllIlIIIIIll() {
      return this.IlIIlllIlIlIIllIIIIlIIllIIIIllIlIlllIIlllIlllIIlllIlIIlIIllIlllllIIIIlIIIIIllllllIIIl;
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long var1) {
      this.IlIIlllIlIlIIllIIIIlIIllIIIIllIlIlllIIlllIlllIIlllIlIIlIIllIlllllIIIIlIIIIIllllllIIIl = var1;
   }

   public final int IlIIIlllIIIIIIlIIIllllllIllIlllIIIIIllIlIIIIlIlllIllllIIllIIlIIllllllIlIIIIIIIIIlIlIl() {
      return this.llIIIllllIIIllIlIlIlIIllIIIlIllIIIllIlIlIIllIIIlIIlIIIIIlIIIIllIlllIlllIIIlIlIlIIIIlI;
   }

   public final void IlIlIlIlIlIlIlIlIllIIlIlIlIlIlIIIllllIlIIIlIIIIIIlIlIlIIllllIlIIIIlllIIlIIIlllIIIIlII(int var1) {
      this.llIIIllllIIIllIlIlIlIIllIIIlIllIIIllIlIlIIllIIIlIIlIIIIIlIIIIllIlllIlllIIIlIlIlIIIIlI = var1;
   }

   @NotNull
   public final HashMap<String, Double> IIIlIIIIIlllllIIllIIIlIIlIIlIIIIlIllIIIIlIllIlIIlIIIIlIlIIlIllIlllIIlIlIIlllIIIIIllII() {
      return this.IlIllIIlIIlIlIIlIlIllIIIlllIlllllIlIIIIIlIlIlIIllllllIIlIIIlIllIIIIIIIIlIIlllIIIIllIl;
   }

   @NotNull
   public final HashMap<String, Double> lIlIIIIlIlIIIllIllIlIIIIIIlllllIIIIllllllIllIllllIIlIIIlIlllllllIllIIlIIlllllllIIllll() {
      return this.lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI;
   }

   public final double IlllIIlIIllIIlIllllIllIIlllIIIlIllllIIlllIllIIIIlIIIlIIlIlIIlIlIllIIIIIIllIIlIIIllllI() {
      return this.lIIIlIllIlllllllIIlIIIIllIIIIIlIIllllllIIlIIIIIlIIIlIIllIIIlIIIIlIllllIIllIIlllIIlllI;
   }

   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(double var1) {
      this.lIIIlIllIlllllllIIlIIIIllIIIIIlIIllllllIIlIIIIIlIIIlIIllIIIlIIIIlIllllIIllIIlllIIlllI = var1;
   }

   public final double IlIlllIIIlIlIlIIIIIllIIIIlIlIIlIlIlIIIIIlllllllIlIllIlIIlIIIIlIIllllIIIllIlIIlllIllIl() {
      return this.lIllllIIlIlIIIlIIIllIIIIIllIIIIlllIlIIIlIlIIIIlIlIIIIllIIIIlIlIIIIlIIIIllIlIIllIIllIl;
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(double var1) {
      this.lIllllIIlIlIIIlIIIllIIIIIllIIIIlllIlIIIlIlIIIIlIlIIIIllIIIIlIlIIIIlIIIIllIlIIllIIllIl = var1;
   }

   public final boolean IIllIIllIlIlIlIllIIlllIIIIlIIIllllllIIIlIllIlllIllIIIlIllIlllIIlIlIIllIIIllIIlllIllIl() {
      return this.IllIIllIllIIIlIIIIIIIIIlIlllIllIIllIlIllIlIlllllllllIlllIIlIllIlIllIlIlIllIIlIIIIlIlI;
   }

   public final void IlIlIllIIlIIIlIIIIlIIIlllIIlIIllIIIIIlllIlIlllIllllIIIllIIIlIIIlIIlIllllIIIIlIllllIIl(boolean var1) {
      this.IllIIllIllIIIlIIIIIIIIIlIlllIllIIllIlIllIlIlllllllllIlllIIlIllIlIllIlIlIllIIlIIIIlIlI = var1;
   }

   @NotNull
   public final ArrayList<lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI> IIIlIlIlIlIIlIIllllIlllIIIIlIIIIIlIlIIllIlllIlIlIlllIIIIIllIllIIIIIlIIIlIIIlIIlllIllI() {
      return this.IIlllIIIllIlIIIlllIIlllIIllIlIIIIlllIlllIllIllIllIllllllllllllllIlIllllIIllIIIIlIlIll;
   }

   @NotNull
   public final ArrayList<lIIIlIllllIIllIlIlIllIlIllllIIlIIlIIIllllIlIllIIllIIIlllIIIIllIlIIllIlllIIIIllIIlIIlI> lIIllIIlIlIIlIlIlIlIllIIlllllIIlIllIIIllIlIlIIIllIllllIlIIlllIIIlIlIIIlIlllIIIllllIll() {
      return this.lIlIIIIIIIllIlllIlIlIIIIIIIIlllllIIlllIIllIlllIIIlIIlllIlllIllIIlIllIIIlIllllllIIllII;
   }

   public final int lllIIlIlllIIllIlIlllIIllIIlIlIIllIIIIllIlIlllIIlIlllIIIlIIlllIlIIIlIIllllIIlIIllllIII() {
      return this.lIIlIIIlIIlIlIlllIIllIIlIIIlllIllllIlIIlIIlIIIIllIIIllIlIlIIIlIIlllIllIIIlIlIlIllIIlI;
   }

   public final long IIlIIIIlIIIlIIIIIIlIIIlIlllllIlllIIllIIlIllIIIIIllllIIIlIIIllIIIIlllIIlIllIlIIIIllllI() {
      return this.IlIIlIIIllIlIIlIlIIllIllllllIlIIIllIIIllIIIIllIlllIlIIIIIlIIllIIlllIllIlIIIlIlllIlIll;
   }

   public final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long var1) {
      this.IlIIlIIIllIlIIlIlIIllIllllllIlIIIllIIIllIIIIllIlllIlIIIIIlIIllIIlllIllIlIIIlIlllIlIll = var1;
   }

   @NotNull
   public final String llIlIllIIIIIlIlIlIIlIIllIlllIlIlIIIlIllIllIlIlIlIllIlIllIlIlllIIlIIllIIllIlllIIlIlllI() {
      return this.IlIllIlIIIIIIIIllIlIIlIllllIIIIIlIlllIllllIIIlllIlIllllIlIllIIIIIIIlIllIlIIllIIIIIlll;
   }

   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(@NotNull String var1, long var2) {
      var2 = lIIlllIIlIlllllIIIllIlIlIIlIlIlIlIIIllIlIlIIIIlllIIlIIIlllllIllllIIIIllllIIlIlIIllIII ^ var2;
      Intrinsics.checkNotNullParameter(
         var1, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"z">(8262, 3194537379678770904L ^ var2)
      );
      this.IlIllIlIIIIIIIIllIlIIlIllllIIIIIlIlllIllllIIIlllIlIllllIlIllIIIIIIIlIllIlIIllIIIIIlll = var1;
   }

   public final boolean IIllIlIIllllIlIlIllIIlIlllllIIIIllllIIlIlIlIlIIlIlIlllIlIIlIllIIlllIIlIlIlllllIllIllI() {
      return this.IIIlllllllllllllIIlIlllIllIlIIlIIlIllIlIIIlIlIlIIIIIllIlIlllIIlIIIIIllIIIIlIllllIIlIl;
   }

   public final void IlIIIIIIlIIllIIIIlIllllIllIIlIlIllIIIllIIIIIllllIlllllllIIIlIllllIIlIIlIlIlIlIIIIllll(boolean var1) {
      this.IIIlllllllllllllIIlIlllIllIlIIlIIlIllIlIIIlIlIlIIIIIllIlIlllIIlIIIIIllIIIIlIllllIIlIl = var1;
   }

   public final long llIIlIIIlllllIllIIllIllIllIIIlIIIIllIIIlIllIlllllllIIlIIIIIIllIlIIlIIllIIlIIllllIIllI() {
      return this.lllIlIIlIIlllIIllIIlIllIlllIllIIlIlllIllllllIlIllIIIIIlllIIIlIIIIllllIlIllIIllIllIlII;
   }

   public final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(long var1) {
      this.lllIlIIlIIlllIIllIIlIllIlllIllIIlIlllIllllllIlIllIIIIIlllIIIlIIIIllllIlIllIIllIllIlII = var1;
   }

   public final int IIIIlIlIllllIlIlIllIlIIlIIlIIlllIlIlllIIlIlIlIlllIlIIllIllIlIIIllllllllllIIIllIIlIIll() {
      return this.IlIIIIllIIIIllIllIIIllllllIIlIIIlIlIllIIllIllllIlIIIlllllllIlllIllIIIIIIIlllIlllIIlII;
   }

   public final void lIlIlIlIIIlIlIIIIIIIIIIIlIllIIIIIIIllIIIIlIIIIIlIllIIIIlIIIIlIIlIllIllIlIlIllIIIlIlll(int var1) {
      this.IlIIIIllIIIIllIllIIIllllllIIlIIIlIlIllIIllIllllIlIIIlllllllIlllIllIIIIIIIlllIlllIIlII = var1;
   }

   public final int IIIIIIIIIlIlIllIlIIllllllIIlIllllIIIlIIIlIllIlIIlIlllllllllIlIIIllllIlIIllIIIlIIllIII() {
      return this.IllIlIIIIlllIIllIlllIlIIlllIIlllllIllIlIllllIlIIllIIIllIlIIllllIIlIIllIlIlllIlIIllllI;
   }

   public final void IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl(int var1) {
      this.IllIlIIIIlllIIllIlllIlIIlllIIlllllIllIlIllllIlIIllIIIllIlIIllllIIlIIllIlIlllIlIIllllI = var1;
   }

   public final float lIIlllIlIlIIlIIlIlIIIlllllIlIIlIIIllIIlIIlIIIIlIIIIlIIIlIIlIlIIlllllllIlIllIlIIIlllll() {
      return this.lllIlIlllIIlIIIllIIlIIllllllllIIlllIlIIllIlIIIIlIlllIIlIIIIlIIlIIIIIIlllIIlllIlIlIlII;
   }

   public final void IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll(float var1) {
      this.lllIlIlllIIlIIIllIIlIIllllllllIIlllIlIIllIlIIIIlIlllIIlIIIIlIIlIIIIIIlllIIlllIlIlIlII = var1;
   }

   public final float IlllIllIIllIIlIIIIIIIIlllIIIIlllIIlIlIllIIllIlllllIIIIlllIIIIllIlIlllIllIIIlIIllIIIll() {
      return this.lIllllIIllllIlIIlllIIIlIIIlIllIIlIIIlllIlIIIllIIIIIIIlIIIIIIIlIllIIIlIIIlIIIIIIlIIlIl;
   }

   public final void llIIIllIIIIllllllIIIlIIIIIIIlllIIllllIlllIlIlIIlIIIIlIIIlllllIIllIllllllIlIIlIIlIlIII(float var1) {
      this.lIllllIIllllIlIIlllIIIlIIIlIllIIlIIIlllIlIIIllIIIIIIIlIIIIIIIlIllIIIlIIIlIIIIIIlIIlIl = var1;
   }

   public final float llIlIIlIlIIlllIIIlIlllIIIIIllIIIlIlIlllIIlllIlIllllIIllIIlIlIlllllIllIlIIllIIIIllIIll() {
      return this.IllIlIIllIlIIlIIIllIIlllIlIlIlllllIIlllllIIIlIlIlllIlIlIllIIIIIllIlIlllllIIIIIlllllll;
   }

   public final void IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl(float var1) {
      this.IllIlIIllIlIIlIIIllIIlllIlIlIlllllIIlllllIIIlIlIlllIlIlIllIIIIIllIlIlllllIIIIIlllllll = var1;
   }

   @NotNull
   public final IIllIIIlllllIlIIIIlIllllIIlIlllIlIllIlllllllIIIIlIlIIlIllIlIIllllIlllIlIIllIIlIlllIlI IlllllIllIlIlIlIllIIlllllIlIIIllIIlIIlIlllIlIIllllIllllIIIIIlIIIIllIlIlIlllIIlIIlIIIl() {
      return this.IlIlIlllIlllIIlIlIIIIIIllIIlIIIIIllIIlIlIlIIIIlIIIlIIIIlIlIllIlIIIIlIIIlIllllIIllllIl;
   }

   @NotNull
   public final lIlllIlllllIIIIllIlIIlIlIllllIIIIllIIllIIlIlIIlIllIlIllIlIIIIlIIIIlIlIIllIIllIIIlllII IlIlIIlllIIIIIlllIllIIIIlIllllllIllIIlIIIIlIIllIlIIIlIIlIIIlllIlIIllIIlIllllIlIIlIlII() {
      return this.lIIlIllllIlllllIllIIIIlIIIlllIIlIIIllIIlIIllIIIlIIIIlIIllllIlIIIIIlIlIllIIllIlIIIIIIl;
   }

   @NotNull
   public final lIlIllIlllIlllIIllllllIIlIIlIllllIIlIIIIllIlIIIIlIIlIlllllIlIlllIIIlIIIlIlIlIlIllllII llIIllIllIllllllllIIIIIlllIIlIIIlIIIlllIIIIllllIIllIllIlIllIllllIIIIIIllIIIlllIllIlII() {
      return this.lIlllIllllIIllIIIIllIIIIIlllIIlIIIIllllIllIlIlIIlIlIlIIlIIllIlllllIlIIIlIIlllIIlllIII;
   }

   @NotNull
   public final llIIlllIlIlllIIllIllIIIIIlIlIlIlIlIIlllIlllllIlIIlIIIlIlllllIIIIllIIIIllIIIlllIlllIIl IllIIIIlIIlIlIlIIlIIIlIlIIIlIlllIIlIlIlllIllIlllIIlIIIIllIIIIIlIIllIllIlIIllIlIllllII() {
      return this.IllIIIllIIllIlIIllIIlIIIIIllIlllIlllllIIIIlIIIIlIIIIlIIlIlIlIIIlIIllIlIlIlIlIllIIlllI;
   }

   @NotNull
   public final llllIlIIIlllIIlIIIlIIlIIllIlIlIlllIIIIIIIIlIlIIllIIlllIIIlIllIIIIllIllllIIIIIIIllIllI IIIIlllIIIlIIIlIlIIlIllIlIIIIIIllllIlllIlIlIlllIIlIIIIlIIlIllllIIlIIlIIIlIIlllllIIIll() {
      return this.IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI;
   }

   @NotNull
   public final llllIIlIIlIIIlIllIIIlIIIllIlIlIIllIIllIIllIlIIlIlllIIIIIlIlIllllIlIIlIlIllIIlllIIllll lIIllIlllIIlIlIllIIIIlIIIIllllIlIIllllIlIlIIlIIlIIIIIIIIlllIIlIIlIIllIllIIllllIlIllll() {
      return this.IlllIlIIlllIIlIIIIIllllIIIIIlIIllllIlllIIIIlIIllIlIlIllIIlIIIIllllIlIlIllIlIlIlIIlIll;
   }

   @NotNull
   public final IIIIIIIlllIIllIlllIlllIIlIIIIllIllIlllIlIIllllllIlIIlIIlllIllIllIIlIIlIlIllIlllllIIlI lIlIIllllIIIIlIIlllIIlIIIllIIIIllIIlIIllllIIIlIlIIIIIIlIlIllIlIIIIlllIIlIlIIlIIllllll() {
      return this.lIIIlIllllllIIllIIlIlllIllllIlIlllllIIIllIlllIIlllllIlIIIlIlIIllllIIllIIIlllIllIIlIII;
   }

   @NotNull
   public final lIlIIIllllllIlIIlllIllIIIlIllllIIllllIIllllIIIIIlIIlIIIlIlIlIIIIllIIIIIllIIlIIllIllII llIIIIIlIIlIIIIlIIIlllIIIlllIIlllIllIIllIIlIllIIlIllIIIllIlIIIIlIIlllIlIllIllllIlIlIl() {
      return this.IIIIlllIlllIlIIlIlIllIIlIIIIIIlIllIIIllllllIllIIllIIllIlIIllllllllIIIlIIlIIlIIlIllllI;
   }

   @Override
   public void onClose() {
      long var1 = lIIlllIIlIlllllIIIllIlIlIIlIlIlIlIIIllIlIlIIIIlllIIlIIIlllllIllllIIIIllllIIlIlIIllIII ^ 130434046303781L;
      long var3 = var1 ^ 48609653819733L;
      long var5 = var1 ^ 38775273927961L;
      long var7 = var1 ^ 58468998028429L;
      this.lIIIlIllllllIIllIIlIlllIllllIlIlllllIIIllIlllIIlllllIlIIIlIlIIllllIIllIIIlllIllIIlIII
         .lIlIlIlIIIlIlIIIIIIIIIIIlIllIIIIIIIllIIIIlIIIIIlIllIIIIlIIIIlIIlIllIllIlIlIllIIIlIlll(var3);
      this.llllllIIIlIlIIIllllIIIIllIIlIlIlIIIlIIlIlIIIlllIlIllIlllIIllIlIIIIIllIlIlIlIlllllllIl = true;
      this.IllIIIllIIllIlIIllIIlIIIIIllIlllIlllllIIIIlIIIIlIIIIlIIlIlIlIIIlIIllIlIlIlIlIllIIlllI
         .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var5);
      lIlIlIlIIIlIIIIIllIlIIIIllllIIIlllIIlllIllIlllllIIIllIIlllIllIlIlllIllIlIIlIIllllIlll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(null, var7);
      super.onClose();
   }

   @Override
   public void extractRenderState(@NotNull GuiGraphicsExtractor contextArg, int argument2Arg, int argument3Arg, float argument4Arg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, int param3, int param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      @NotNull List var1, float var2, long var3, float var5
   ) {
      var3 = lIIlllIIlIlllllIIIllIlIlIIlIlIlIlIIIllIlIlIIIIlllIIlIIIlllllIllllIIIIllllIIlIlIIllIII ^ var3;
      Intrinsics.checkNotNullParameter(
         var1, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"z">(13778, 376691962800189286L ^ var3)
      );
      this.llIllIIIlllIlIIIIlIlIIlIlIllllIlIlllIIlllllIlIllllIIllIIllllIIIllIIIlIIlIIlllIlllllIl = false;
      this.IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll = new lIllIIlIlIlIlllllIlIIIIlIIlllllllIlllIllIIIlllIIlIIlIllllllllIlIlIlllIlIIIIllIlIIIllI(
         var1, var2, var5
      );
   }

   public final void IlIlIIIllIIllIlllIIIlIllllllIIlIlIIlIIIlIIlllIlllIIlIllIlllllIllllIIlllIIIlIlIIlIlIll(long var1) {
      label11: {
         var1 = lIIlllIIlIlllllIIIllIlIlIIlIlIlIlIIIllIlIlIIIIlllIIlIIIlllllIllllIIIIllllIIlIlIIllIII ^ var1;
         long var3 = var1 ^ 64660400016250L;
         String[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            -1559780098015360659L, var1
         );
         float[] var6 = this.lIlIIIIIllIlIlIIIIIIllllllIIIllIIIIIlllIllIIIIIllIIllIIIllIIllIllIlIllIlIllIlIIIllIIl(var3);
         String[] var5 = var10000;
         if (this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII) {
            float var7 = 2.0F;
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var6[0] + var7);
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var6[1] + var7);
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var6[2] - var7);
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
               .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var6[3] - var7);
            if (var5 != null) {
               break label11;
            }
         }

         float var10 = (var6[0] + var6[2]) / 2.0F;
         float var8 = (var6[1] + var6[3]) / 2.0F;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               var10
                  - this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                     / 2.0F
            );
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
               var10
                  + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                     / 2.0F
            );
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
               var8
                  - this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                        .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI()
                     / 2.0F
            );
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
               var8
                  + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                        .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI()
                     / 2.0F
            );
      }

      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                  .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
               - this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                  .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII()
         );
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
            this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                  .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII()
               - this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                  .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl()
         );
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(
            (
                  this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                        .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII()
                     + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                        .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
               )
               / 2.0F
         );
      this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(
            (
                  this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                        .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl()
                     + this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
                        .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII()
               )
               / 2.0F
         );
   }

   @NotNull
   public final float[] lIlIIIIIllIlIlIIIIIIllllllIIIllIIIIIlllIllIIIIIllIIllIIIllIIllIllIlIllIlIllIlIIIllIIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param1, int param3, int param4, float param5, float param6, float param7, float param8
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      byte var1, double var2, int var4, double var5, int var7, int var8
   ) {
      long var9 = (long)var1 << 56 | (long)var4 << 32 >>> 8 | (long)var8 << 40 >>> 40;
      long var11 = var9 ^ 59637919178115L;
      return this.IIIIlllIlllIlIIlIlIllIIlIIIIIIlIllIIIllllllIllIIllIIllIlIIllllllllIIIlIIlIIlIIlIllllI
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2, var5, var7, var11);
   }

   @Override
   public boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      double param1, double param3, long param5, int param7, double param8, double param10
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(double param1, double param3, int param5, long param6) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public boolean mouseScrolled(double var1, double var3, double var5, double var7) {
      long var9 = lIIlllIIlIlllllIIIllIlIlIIlIlIlIlIIIllIlIlIIIIlllIIlIIIlllllIllllIIIIllllIIlIlIIllIII ^ 113827484090643L;
      long var11 = var9 ^ 76934243923644L;
      return this.IIIIlllIlllIlIIlIlIllIIlIIIIIIlIllIIIllllllIllIIllIIllIlIIllllllllIIIlIIlIIlIIlIllllI
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1, var3, var11, var5, var7);
   }

   @Override
   public boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int param1, int param2, int param3, int param4, char param5, int param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, char var3, int var4) {
      long var5 = var1 ^ 124078731626846L;
      return this.IIIIlllIlllIlIIlIlIllIIlIIIIIIlIllIIIllllllIllIIllIIllIlIIllllllllIIIlIIlIIlIIlIllllI
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, var4, var5);
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl var0, long var1, File var3
   ) {
      var1 = lIIlllIIlIlllllIIIllIlIlIIlIlIlIlIIIllIlIlIIIIlllIIlIIIlllllIllllIIIIllllIIlIlIIllIII ^ var1;
      long var4 = var1 ^ 28900028065203L;
      Intrinsics.checkNotNullParameter(
         var3, IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII<"z">(24778, 8970097728000136957L ^ var1)
      );
      var0.IlIlIlllIlllIIlIlIIIIIIllIIlIIIIIllIIlIlIlIIIIlIIIlIIIIlIlIllIlIIIIlIIIlIllllIIllllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, true, var4);
      return Unit.INSTANCE;
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var0, lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl var2
   ) {
      var0 = lIIlllIIlIlllllIIIllIlIlIIlIlIlIlIIIllIlIlIIIIlllIIlIIIlllllIllllIIIIllllIIlIlIIllIII ^ var0;
      long var10001 = var0 ^ 19091578036418L;
      int var3 = (int)((var0 ^ 19091578036418L) >>> 56);
      int var4 = (int)((var0 ^ 19091578036418L) << 8 >>> 32);
      int var5 = (int)(var10001 << 40 >>> 40);
      var2.IlIlIlllIlllIIlIlIIIIIIllIIlIIIIIllIIlIlIlIIIIlIIIlIIIIlIlIllIlIIIIlIIIlIllllIIllllIl
         .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI((byte)var3, var4, var5);
      return Unit.INSTANCE;
   }

   private static final Unit llIIlIlIllIIIlIIIIIIIIlIIIllIIllllIIlIIIlIIIIIIIllIlIIIIIIllIllIIlIlIIIIIlIIlIIlIIIIl() {
      lIlIIIIIlIIlllllIllIlIIlIIllIllIIIlllIllIllIIIllIIlIllllIllIllIIIlIlIIIlIIIllIIIIlIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII();
      return Unit.INSTANCE;
   }

   private static final Unit IllllIlIlIIlllIIllIlIIIllIlllIIIIlIlIIllIlllIlIlIIlIlllIIIlIIlIIIlIlIIllllllIIlIIllII() {
      IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII();
      return Unit.INSTANCE;
   }

   // $VF: Handled exception range with multiple entry points by splitting it
   // $VF: Duplicated exception handlers to handle obfuscated exceptions
   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      int var0,
      int var1,
      long var2,
      lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl var4,
      boolean var5,
      int var6,
      GuiGraphicsExtractor var7,
      int var8
   ) {
      var2 = lIIlllIIlIlllllIIIllIlIlIIlIlIlIlIIIllIlIlIIIIlllIIlIIIlllllIllllIIIIllllIIlIlIIllIII ^ var2;
      long var10001 = var2 ^ 68384602879348L;
      int var9 = (int)((var2 ^ 68384602879348L) >>> 32);
      int var10 = (int)((var2 ^ 68384602879348L) << 32 >>> 48);
      int var11 = (int)(var10001 << 48 >>> 48);
      long var12 = var2 ^ 126059647411805L;
      long var14 = var2 ^ 126716271586825L;
      long var16 = var2 ^ 18927884981364L;
      long var18 = var2 ^ 75439735243075L;
      NVGRenderer.rect(
         0.0F,
         0.0F,
         var0,
         var1,
         ThemeColors.INSTANCE
            .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(0.6F),
         0.0F
      );
      NVGRenderer.IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(var14);
      float var21 = var0 / 2.0F;
      String[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -4150704420557478574L, var2
      );
      float var22 = var1 / 2.0F;
      String[] var20 = var10000;
      NVGRenderer.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var9, var10, (short)var11, var21, var22);
      float var23 = GeneralModules.Companion
            .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII()
            .IllIIlIlIlIlIIllIIllIlIlIIlllIIllllllIIIIlIlIllIIlllIlIIIIlllIIIllIIIIIlllllllIlIllIl()
         * var4.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII
            .lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl();
      NVGRenderer.INSTANCE.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var23, var16, var23);
      NVGRenderer.INSTANCE.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var9, var10, (short)var11, -var21, -var22);
      int var24 = 0;
      int var25 = 0;

      label33: {
         label32: {
            label37: {
               try {
                  var35 = var5;
                  if (var20 == null) {
                     break label32;
                  }

                  if (var5 == 0) {
                     break label37;
                  }
               } catch (NoWhenBranchMatchedException var30) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var30, -4036355712743509215L, var2
                  );
               }

               var24 = (int)((float)var6 * var0 / var7.guiWidth());
               var10000 = var20;
               var25 = (int)((float)var8 * var1 / var7.guiHeight());

               try {
                  if (var10000 != null) {
                     break label33;
                  }
               } catch (NoWhenBranchMatchedException var29) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var29, -4036355712743509215L, var2
                  );
               }
            }

            try {
               var35 = var4.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI().getWindow().getGuiScale();
            } catch (NoWhenBranchMatchedException var28) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var28, -4036355712743509215L, var2
               );
            }
         }

         int var26 = var35;
         var24 = var6 * var26;
         var25 = var8 * var26;
      }

      int var34 = (int)(var21 + (var24 - var21) / var23);
      int var27 = (int)(var22 + (var25 - var22) / var23);
      var4.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var12, var34, var27);
      NVGRenderer.lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(var18);
      return Unit.INSTANCE;
   }

   private static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var0,
      long var1
   ) {
      var1 = lIIlllIIlIlllllIIIllIlIlIIlIlIlIlIIIllIlIlIIIIlllIIlIIIlllllIllllIIIIllllIIlIlIIllIII ^ var1;
      Iterable var4 = IllllIlllllIIllIlIIIllllIllIllIllllIIIllIllIllIIIIIIIIlllllIIIlIIlllIIIIIllIIllIllIll;
      String[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -7927463466611936564L, var1
      );
      boolean var5 = false;
      String[] var3 = var10000;

      for (Object var7 : var4) {
         IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl var8 = (IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl)var7;
         boolean var9 = false;

         try {
            boolean var12 = false;
            if (var3 == null) {
               break;
            }

            var8.getEngine().close();
            Object var15 = Result.constructor-impl(Unit.INSTANCE);
         } catch (Throwable var13) {
            Object var11 = Result.constructor-impl(ResultKt.createFailure(var13));
         }

         if (var3 == null) {
            break;
         }
      }
   }

   public lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl() {
      this(null, 1, null);
   }

   static {
      long var20 = lIIlllIIlIlllllIIIllIlIlIIlIlIlIlIIIllIlIlIIIIlllIIlIIIlllllIllllIIIIllllIIlIlIIllIII ^ 100834492052045L;
      long var22 = var20 ^ 122346159792358L;
      String[] var10000 = new String[5];
      String[] var27 = var10000;
      llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var27);
      Cipher var11;
      Cipher var34 = var11 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var12 = 1; var12 < 8; var12++) {
         var10003[var12] = (byte)(var20 << var12 * 8 >>> 56);
      }

      var34.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var18 = new String[19];
      int var16 = 0;
      String var15 = "a¶Aè´¥ÅjÂ\u0084\u0011ON$©¤\u0010}§\u008eç]«\u001d_B'\"\u008aW\u008d\u0015´\u0010t\u0088ïªH\u0003!¬\u0012\u00885Á\u001b\u001d\u001a)\u0010UÃNCU\tN,\u0098+í\u001e\u00adßk[\u0010!\u0099÷ôuÙåÌdJ\u0097\u009a©;z¯\u0010ä»ç\f\u0019\u0080\u007fH×\u008d\u0018\u001fÇA\u0089î\u0010\"7\u001eèn\u0000ã\u0010Ïºüu\u0086µ\u008a¯0å®}ú¾u¨\u000e\u009dîBÊ\u0018á!Ñ±va\u00159¤_{\u008cûA\u0000\u0084©\u0012¶\u00806y\u009f\u0099ºy\u008f\n1b{8Ãªè\u0010\u000f\u001eJ¸\u009aØÒD£,\u001eE\f×\u0092\u0098 À¼êß2ß\u0098\u008e\u007f\b Z\u0090«\r\u0013\u001dî\u000f\u0090\u0001$nÙ;GuÙ-\u0095\u0001'\u0010x\u0019cè\u0086k·\u0080`»\u0098ÄAnAk(h)ñ«ã\u008bw\n©4\u009d\u0096\u000eÄ\u001cÉ\u0081\u0087Ý)þpØgÐ\u0001Ò\u0018ê\u0099mD\u008eÃ®\u0085?[G\u0080\u0010Ý)´þR\u009bÑ\u0016®!B\u0085ÛÚ3á\u0010õ3\u0004\u0081 @\f/\u008e¸`ìÑ:\u001dÈ(\u0010Ú\u001fia=«|¥ê\u008e\u0011\u0089\u0088\u008f0\u008fIÇ\u0089?\u009aÁ\u00ad\u0001f\u0002ç\u000e°!GN\u0005¥*ÐTYØX½ÝP\u0092\u001eOÜU®H\u0003Yaî!\u008d[0Ã^yÝ°\u0094\u0098háÊ\u009a\t¡\"\u008b\u0019òF½¶FYÃE$\u009egÕ´ÈÁVL;ÚIin'U\u001fT\u0010òÞj\u0006@µyv\u000b\u001bw6\u0017\u001aZ\u0093K\u0086ÈaÓ\u0091@q\u008eºÆ(ò5ËW\u0087\u0005Ó%\u000fÞëõ\u0099jIÂóA¡÷C\u0001¶:YÎWe\u0094ü$-8g$PN\u0011)H";
      int var17 = "a¶Aè´¥ÅjÂ\u0084\u0011ON$©¤\u0010}§\u008eç]«\u001d_B'\"\u008aW\u008d\u0015´\u0010t\u0088ïªH\u0003!¬\u0012\u00885Á\u001b\u001d\u001a)\u0010UÃNCU\tN,\u0098+í\u001e\u00adßk[\u0010!\u0099÷ôuÙåÌdJ\u0097\u009a©;z¯\u0010ä»ç\f\u0019\u0080\u007fH×\u008d\u0018\u001fÇA\u0089î\u0010\"7\u001eèn\u0000ã\u0010Ïºüu\u0086µ\u008a¯0å®}ú¾u¨\u000e\u009dîBÊ\u0018á!Ñ±va\u00159¤_{\u008cûA\u0000\u0084©\u0012¶\u00806y\u009f\u0099ºy\u008f\n1b{8Ãªè\u0010\u000f\u001eJ¸\u009aØÒD£,\u001eE\f×\u0092\u0098 À¼êß2ß\u0098\u008e\u007f\b Z\u0090«\r\u0013\u001dî\u000f\u0090\u0001$nÙ;GuÙ-\u0095\u0001'\u0010x\u0019cè\u0086k·\u0080`»\u0098ÄAnAk(h)ñ«ã\u008bw\n©4\u009d\u0096\u000eÄ\u001cÉ\u0081\u0087Ý)þpØgÐ\u0001Ò\u0018ê\u0099mD\u008eÃ®\u0085?[G\u0080\u0010Ý)´þR\u009bÑ\u0016®!B\u0085ÛÚ3á\u0010õ3\u0004\u0081 @\f/\u008e¸`ìÑ:\u001dÈ(\u0010Ú\u001fia=«|¥ê\u008e\u0011\u0089\u0088\u008f0\u008fIÇ\u0089?\u009aÁ\u00ad\u0001f\u0002ç\u000e°!GN\u0005¥*ÐTYØX½ÝP\u0092\u001eOÜU®H\u0003Yaî!\u008d[0Ã^yÝ°\u0094\u0098háÊ\u009a\t¡\"\u008b\u0019òF½¶FYÃE$\u009egÕ´ÈÁVL;ÚIin'U\u001fT\u0010òÞj\u0006@µyv\u000b\u001bw6\u0017\u001aZ\u0093K\u0086ÈaÓ\u0091@q\u008eºÆ(ò5ËW\u0087\u0005Ó%\u000fÞëõ\u0099jIÂóA¡÷C\u0001¶:YÎWe\u0094ü$-8g$PN\u0011)H"
         .length();
      char var14 = 16;
      int var31 = -1;

      label64:
      while (true) {
         String var35 = var15.substring(++var31, var31 + var14);
         int var10001 = -1;

         while (true) {
            byte[] var19 = var11.doFinal(var35.getBytes("ISO-8859-1"));
            String var46 = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var19).intern();
            switch (var10001) {
               case 0:
                  var18[var16++] = var46;
                  if ((var31 += var14) >= var17) {
                     lllIIlllIlllllllIIlIIIlIIllIllIllIIllIllIlllIIlIlIIIIIlllIlIIlIlIlllIlIIlIIllIIIlIlII = var18;
                     llIlllIlllIlIIlllIlIlllIlllllIlllIlIIllIllllIIIIlIlIIIllIIIlllIIIIIIIlIIlIlllIllllIlI = new String[19];
                     lIlllIIIIIlllllIIllIllIlIIlIllllllIllIIlllIIllIIIIIlIlIlIllIlIlIIlIlIIlIlIIIIIlllIIlI = new HashMap(13);
                     Cipher var0;
                     Cipher var37 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                     var10002 = SecretKeyFactory.getInstance("DES");
                     var10003 = new byte[]{(byte)(var20 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                     for (int var1 = 1; var1 < 8; var1++) {
                        var10003[var1] = (byte)(var20 << var1 * 8 >>> 56);
                     }

                     var37.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                     long[] var6 = new long[5];
                     int var3 = 0;
                     String var4 = "R©©Å:2\u00940\u0000\u000b\u007f &h$B\u001750¶\u00197í\u001c";
                     int var5 = "R©©Å:2\u00940\u0000\u000b\u007f &h$B\u001750¶\u00197í\u001c".length();
                     byte var2 = 0;

                     label46:
                     while (true) {
                        var10001 = var2;
                        var2 += 8;
                        byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
                        long[] var38 = var6;
                        var10001 = var3++;
                        long var50 = (var7[0] & 255L) << 56
                           | (var7[1] & 255L) << 48
                           | (var7[2] & 255L) << 40
                           | (var7[3] & 255L) << 32
                           | (var7[4] & 255L) << 24
                           | (var7[5] & 255L) << 16
                           | (var7[6] & 255L) << 8
                           | var7[7] & 255L;
                        byte var53 = -1;

                        while (true) {
                           long var8 = var50;
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
                           long var55 = (var10[0] & 255L) << 56
                              | (var10[1] & 255L) << 48
                              | (var10[2] & 255L) << 40
                              | (var10[3] & 255L) << 32
                              | (var10[4] & 255L) << 24
                              | (var10[5] & 255L) << 16
                              | (var10[6] & 255L) << 8
                              | var10[7] & 255L;
                           switch (var53) {
                              case 0:
                                 var38[var10001] = var55;
                                 if (var2 >= var5) {
                                    lIllIIlIIIllIlllIIlllIllIIllllIllIllIIIIIllIllIllIIlIIIIIlllIlIllIlIIllIIIllIIllIIIll = var6;
                                    IlIIlllllIlIIIIlIIIIlIllIlIIIlllIlIIIllIlIIIllIIlIIlIIIIllIIlIIIIIllIlllIIIIIlIIIIllI = new Integer[5];
                                    IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                                       null
                                    );
                                    String[] var24 = new String[]{"js", "json", "txt", "md"};
                                    IIIlllIIllllIlllllIlIlIlIIIlIIlIlllIIllIlIlIlllIIIIIllllIlIlllllllIIIIIIlIlIlIlIIllII = SetsKt.setOf(var24);
                                    lllIlllIlIlIllllIllllIIllIllIlIllIlIIlIllIIllIllIllIIIIlIIllllIllllIIlIlIIllIlllIllII = new Regex(
                                       "\\b(?:const|let|var)\\s+([A-Za-z_$][\\w$]*)\\s*=\\s*(.+)"
                                    );
                                    IllllIlllllIIllIlIIIllllIllIllIllllIIIllIllIllIIIIIIIIlllllIIIlIIlllIIIIIllIIllIllIll = new ArrayList<>();
                                    lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var32 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;

                                    try {
                                       boolean var26 = false;
                                       Runtime.getRuntime()
                                          .addShutdownHook(
                                             new Thread(
                                                lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI
                                             )
                                          );
                                       Object var33 = Result.constructor-impl(Unit.INSTANCE);
                                    } catch (Throwable var28) {
                                       Object var25 = Result.constructor-impl(ResultKt.createFailure(var28));
                                    }

                                    return;
                                 }
                                 break;
                              default:
                                 var38[var10001] = var55;
                                 if (var2 < var5) {
                                    continue label46;
                                 }

                                 var4 = "Äi2\u0019\b\"¬\u001f\u001aÎÇä¦8U~";
                                 var5 = "Äi2\u0019\b\"¬\u001f\u001aÎÇä¦8U~".length();
                                 var2 = 0;
                           }

                           byte var44 = var2;
                           var2 += 8;
                           var7 = var4.substring(var44, var2).getBytes("ISO-8859-1");
                           var38 = var6;
                           var10001 = var3++;
                           var50 = (var7[0] & 255L) << 56
                              | (var7[1] & 255L) << 48
                              | (var7[2] & 255L) << 40
                              | (var7[3] & 255L) << 32
                              | (var7[4] & 255L) << 24
                              | (var7[5] & 255L) << 16
                              | (var7[6] & 255L) << 8
                              | var7[7] & 255L;
                           var53 = 0;
                        }
                     }
                  }

                  var14 = var15.charAt(var31);
                  break;
               default:
                  var18[var16++] = var46;
                  if ((var31 += var14) < var17) {
                     var14 = var15.charAt(var31);
                     continue label64;
                  }

                  var15 = "\ng8\"¿ ?ùø?ÿì5v\\S\u0010$Ì\nå·§i\u0082\u00078@ö²Û\u0085\r";
                  var17 = "\ng8\"¿ ?ùø?ÿì5v\\S\u0010$Ì\nå·§i\u0082\u00078@ö²Û\u0085\r".length();
                  var14 = 16;
                  var31 = -1;
            }

            var35 = var15.substring(++var31, var31 + var14);
            var10001 = 0;
         }
      }
   }

   public static void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(String[] var0) {
      IIlIllIlllIIIIlIllIllIlIllllIIIIIlIllIIlIIIllIIlIllIlllIIIllIIllIllIllIllIlIIIIIlIlll = var0;
   }

   public static String[] lIlIIIIIIllIIllllIIIIlIIlIIlIIIIIIlIlIIIlIIIlIIlllIIlIIIlIlllIlIlIIIllIllIIIlIlIlllIl() {
      return IIlIllIlllIIIIlIllIllIlIllllIIIIIlIllIIlIIIllIIlIllIlllIIIllIIllIllIllIllIlIIIIIlIlll;
   }

   private static NoWhenBranchMatchedException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      NoWhenBranchMatchedException var0
   ) {
      return var0;
   }

   private static String IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(byte[] var0) {
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
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 28064;
      if (llIlllIlllIlIIlllIlIlllIlllllIlllIlIIllIllllIIIIlIlIIIllIIIlllIIIIIIIlIIlIlllIllllIlI[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])llIllIllIlIIIlIlIIIIlIIIIlllIlllllIlIlIlllIIlllIIIIIIIIllIIIIllIIIIIlIIlllIIlIlllllll.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               llIllIllIlIIIlIlIIIIlIIIIlllIlllllIlIlIlllIIlllIIIIIIIIllIIIIllIIIIIlIIlllIIlIlllllll.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException("me/octo/client/gui/lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl", var10);
         }

         byte[] var6 = new byte[8];
         var6[0] = (byte)(var1 >>> 56);

         for (int var7 = 1; var7 < 8; var7++) {
            var6[var7] = (byte)(var1 << var7 * 8 >>> 56);
         }

         DESKeySpec var11 = new DESKeySpec(var6);
         SecretKey var8 = ((SecretKeyFactory)var4[1]).generateSecret(var11);
         ((Cipher)var4[0]).init(2, var8, (IvParameterSpec)var4[2]);
         byte[] var9 = lllIIlllIlllllllIIlIIIlIIllIllIllIIllIllIlllIIlIlIIIIIlllIlIIlIlIlllIlIIlIIllIIIlIlII[var5].getBytes("ISO-8859-1");
         llIlllIlllIlIIlllIlIlllIlllllIlllIlIIllIllllIIIIlIlIIIllIIIlllIIIIIIIlIIlIlllIllllIlI[var5] = IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return llIlllIlllIlIIlllIlIlllIlllllIlllIlIIllIllllIIIIlIlIIIllIIIlllIIIIIIIlIIlIlllIllllIlI[var5];
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

   private static CallSite IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/gui/lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl" + " : " + var1 + " : " + var2.toString(),
            var5
         );
      }
   }

   private static int IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 23736;
      if (IlIIlllllIlIIIIlIIIIlIllIlIIIlllIlIIIllIlIIIllIIlIIlIIIIllIIlIIIIIllIlllIIIIIlIIIIllI[var3] == null) {
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
         long var5 = lIllIIlIIIllIlllIIlllIllIIllllIllIllIIIIIllIllIllIIlIIIIIlllIlIllIlIIllIIIllIIllIIIll[var3];
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
         Object[] var9 = (Object[])lIlllIIIIIlllllIIllIllIlIIlIllllllIllIIlllIIllIIIIIlIlIlIllIlIlIIlIlIIlIlIIIIIlllIIlI.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIlllIIIIIlllllIIllIllIlIIlIllllllIllIIlllIIllIIIIIlIlIlIllIlIlIIlIlIIlIlIIIIIlllIIlI.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("me/octo/client/gui/lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         IlIIlllllIlIIIIlIIIIlIllIlIIIlllIlIIIllIlIIIllIIlIIlIIIIllIIlIIIIIllIlllIIIIIlIIIIllI[var3] = var15;
      }

      return IlIIlllllIlIIIIlIIIIlIllIlIIIlllIlIIIllIlIIIllIIlIIlIIIIllIIlIIIIIllIlllIIIIIlIIIIllI[var3];
   }

   private static int IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(var4, var5);
      MethodHandle var8 = MethodHandles.constant(int.class, var7);
      var1.setTarget(MethodHandles.dropArguments(var8, 0, int.class, long.class));
      return var7;
   }

   private static CallSite IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(Lookup var0, String var1, MethodType var2) {
      MutableCallSite var3 = new MutableCallSite(var2);

      try {
         var3.setTarget(
            MethodHandles.explicitCastArguments(
               MethodHandles.insertArguments(
                  "IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl".asCollector(Object[].class, var2.parameterCount()),
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
            "me/octo/client/gui/lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl" + " : " + var1 + " : " + var2.toString(),
            var5
         );
      }
   }

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final Set<String> IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.IIIlllIIllllIlllllIlIlIlIIIlIIlIlllIIllIlIlIlllIIIIIllllIlIlllllllIIIIIIlIlIlIlIIllII;
      }

      @NotNull
      public final Regex llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.lllIlllIlIlIllllIllllIIllIllIlIllIlIIlIllIIllIllIllIIIIlIIllllIllllIIlIlIIllIlllIllII;
      }

      @NotNull
      public final List<IlllIlllllIIIlIIllIIIlIlIIlIIIlIlIIIlIllIIIIllllIIIIlIllIllllIlllIlIIlIllIIIlIIIlIlIl> IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.IllllIlllllIIllIlIIIllllIllIllIllllIIIllIllIllIIIIIIIIlllllIIIlIIlllIIIIIllIIllIllIll;
      }

      public final int IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.lIlllIlIIIIlIIIIIIIIlIIIIlIllIllIlIlIIIlIIIIIIIlIIllllIllIIIIIlllllIllIlIlIIIlIlIIIlI;
      }

      public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var1) {
         lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.lIlllIlIIIIlIIIIIIIIlIIIIlIllIllIlIlIIIlIIIIIIIlIIllllIllIIIIIlllllIllIlIlIIIlIlIIIlI = var1;
      }

      public final int lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
         return lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.llIlIIIIlIllllIlllllIllIIIIlllIlIlIIlllIllllIIlIIllIIIIIIlllIlIlIllIlllIlIlIIlIIIlIlI;
      }

      public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int var1) {
         lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.llIlIIIIlIllllIlllllIllIIIIlllIlIlIIlllIllllIIlIIllIIIIIIlllIlIlIllIlllIlIlIIlIIIlIlI = var1;
      }

      @Nullable
      public final String IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
         return lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.lIIlIllIlllIllllIIlIllIIlIIIIllIIlIIlIIllIIllIllllIIIIIIIIllllIIIIlIIIIllIlIlIIllIIII;
      }

      public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@Nullable String var1) {
         lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.lIIlIllIlllIllllIIlIllIIlIIIIllIIlIIlIIllIIllIllllIIIIIIIIllllIIIIlIIIIllIlIlIIllIIII = var1;
      }

      public final boolean IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
         return lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl;
      }

      public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(boolean var1) {
         lIIIIIlIIllIlIIIlIllIIlIIlllllIIIlIlllIlIllllIlIlIlIlIIIlllIIIIllIIIlIIIlIIIlIIlllIIl.lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl = var1;
      }
   }
}
