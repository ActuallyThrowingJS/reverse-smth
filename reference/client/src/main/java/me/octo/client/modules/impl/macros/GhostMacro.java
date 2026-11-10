package me.octo.client.modules.impl.macros;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import me.octo.client.events.impl.base.EventPriority;
import me.octo.client.events.impl.base.annotations.SubscribeEvent;
import me.octo.client.events.impl.entity.EntityDataUpdateEvent;
import me.octo.client.events.impl.other.llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI;
import me.octo.client.events.impl.packet.PacketReceivedEvent;
import me.octo.client.events.impl.render.WorldRenderEvent;
import me.octo.client.gui.clickgui.ModuleCategory;
import me.octo.client.gui.clickgui.settings.Setting;
import me.octo.client.modules.IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl;
import me.octo.client.modules.IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl;
import me.octo.client.modules.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl;
import me.octo.client.modules.lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI;
import me.octo.client.modules.helpers.general.Scheduler;
import me.octo.client.modules.impl.features.hud.lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI;
import me.octo.client.modules.impl.features.hud.llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII;
import me.octo.client.utils.IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl;
import me.octo.client.utils.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll;
import me.octo.client.utils.player.MovementUtils;
import me.octo.client.utils.player.lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI;
import me.octo.client.utils.player.lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class GhostMacro extends me.octo.client.modules.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
   @NotNull
   public static GhostMacro.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl;
   @NotNull
   private GhostMacro.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI;
   private boolean lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII;
   private int llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI;
   @Nullable
   private Vec3 lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII;
   @NotNull
   private final llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII;
   @NotNull
   private final llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll;
   private final double lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl;
   private final double IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll;
   private final long IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll;
   private final double lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI;
   private final double llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl;
   private final double lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII;
   private final double IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII;
   private final double lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl;
   private final double IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll;
   private final double lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI;
   private final double lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI;
   private final double IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII;
   private final double lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll;
   private final double IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl;
   private final double lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl;
   private final double llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI;
   private final double IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII;
   private final double IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll;
   private final double IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI;
   private final double IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll;
   private final double llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll;
   private final double IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll;
   private final long IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI;
   private final long lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl;
   private final double lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll;
   private final double llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII;
   private final double IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl;
   private final double IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII;
   private final double IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI;
   private final double IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI;
   private final int llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl;
   private final double IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII;
   @NotNull
   private final HashMap<Integer, Long> lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII;
   private final long lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII;
   private int lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl;
   @NotNull
   private final llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll;
   @NotNull
   private final llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII;
   private int llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl;
   private int llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI;
   @NotNull
   private final IIIlllIIIlllIllIIIlIIlIlIIlIIlIIIlIlIlllIIIllIllllIIIIllIllIIIlllIlllIllIIIIIIIllllll IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll;
   @NotNull
   private final llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl;
   @NotNull
   private final llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI;
   private double IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll;
   private double lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI;
   private double IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll;
   private double llllIllIllllIIIlIIIlIIIIIIlIIIIIIlllIIllIllIIlIlIIllIlIIlIIlIlllllIllIIlIIllIlIllllII;
   private int IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII;
   private boolean IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII;
   private int IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl;
   private float IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl;
   private int IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI;
   private float lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll;
   private float IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll;
   private int IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI;
   private boolean IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI;
   private float lIllIIIllllllIIIIllIIlIllIlllllIIIIlIIlIIIlllIIIIlIIllIlIllllIlIIIlIIlllllllllllIIllI;
   @Nullable
   private boolean[] IllllllIlIIlIIIlIIlIllIllllIIlIlllllIlIIIllIIIIIIllIllIIllllllllIllIllIIlIIIIIIIlIlIl;
   @NotNull
   private final List<boolean[]> lIIIllIIIIlllllllllllllllllllIIlIIIIIlIIllIIlIIlIllIIllllIIIIlllIlIlIlllllIIIIlIlIIIl;
   @NotNull
   private final llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll lIIIIIIIlllIlllIlIIlIIlIlIllIIIIIIllllIlIlllIIIlIlIIIlIlllllllllIIIlIlllIIIIIllllllIl;
   private final long llIIIlIIllIIlllIlllllIlIllIIlIIllllIIlIlIllIIIllIIIIlIlIIlIIIllIlIlllllIIlIIIIlIIIllI;
   @NotNull
   private final llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll IlllIllIlllIlIlIIlIlIIlIIlIlIIIlllIllllIIIIlllIlllllIIlIlIIIIlIllllllllIIlIlIIlllllII;
   private final long llllllllllIIIIIlllllIIIlIlIlIlIlIIIlIlIlllIlIllIlIIIlIIIIllIIlIlIIlIIllIllllIIIIllIII;
   private long llllIIIIIIlIllIllIlIIllIlIlIlIIIlIIIIIIIIIlIIIllIIIIlIlIlllIlIllIIIIIlIlIllIIlIIllIIl;
   private final long IIllIlIlIIIllIIlIIIIIlIIllllllIIllllIIIIIIIlllIIIllIIIlllllIlIlIlIllIlIlIIlIlllllIlll;
   private long llIlIlIlIIlIlIIllIIIIIllIIIllllIIllllllIllIIIlllllIIIIlIIlIIllIIIIlIIlIIIlIlIIlIIIlll;
   private final long lIlIlIlIllIlIIlIIllIllIlIllIIlIIlIIlIlllIIIIllIIlIlIIIIIlIllIIIllllllllIlIIlIlIllIlll;
   private final int llIllIlIlIlIIlIIIlIIlIlIIlllIllIlIIllIIlIIIlIlIIllIllIlIlIIIIlIIllllllIllIIIlllIIlIIl;
   private final double lIIllIlllIIlIlIllIIlIlIIIllIllIllIlllllIIIlllIlllIlIlIIIlIIllIIIIIllIlIIlllIIIIIIIIlI;
   private final double lIIllIIlIIlIIllllIIlIllllllIlIIIllllIIlIIlIIIIlIlIIIlIIIIlIllIIIIIIlIlIIIlIlllIllIIlI;
   private final double lllIlllIllIIlIlIllIlIIIllIllIIlllllIIIllllIIlIlIIIlIIIlllIlllllIlIlIllIlllllllIllIlIl;
   private final double IIlIlIllIIllIlIIlllllIIlIlIIIIlIlIlllIIIlIIllIllIIlIIlllIIllIlIIlllllIllllllllllIIIlI;
   private final int IlllIlllIIIlllIIlIlIlllIlllllIIlIIIIllIIIIIlllIIllIIlIIllllIllllIlIIlllIlIIIlIlIlIllI;
   private final int llllllIIlIlIIlIIIIlIlIIIIIIlIIlIllIIIlIlIlIllIIIIlIIlIIIIlIlllIIllllllIIlllIlIIllIIIl;
   private final int lllIlIlIllllIIIIlIllIIllIIIllllIlIllIllIIlIIlIIIIlIlllIlIIIlIlllIllllIIIllIllIIIIIIII;
   private final int IIlIlllllIIllIIIlllIIIIlIIIlIIIIlIlIllllIlIIlIIlIlIIIlIIllIllIIIlllIlIllllIIIIlllllII;
   private final int lIIllIIIIlIlIIIIlIlllllIIIlIIllIllIlllllIlIllIIIIIIlIlIIIIIIllIIlllIlllllllIllIlIllII;
   private final double lIIllIlIIIIlIIlIlIllIIllIIllIIIIIIlIIlIIIllllIlIlllIlIlllIlIllIIIIIllIIIIlIlIIIlIIIlI;
   private final double llIIllllIlIIIlIIIIIllIIlllllIllllIIIlllIlIIlIlllIIlIIllIlllllIlIIIlllIllIllllllIIIllI;
   private final double lIlIIlIlIIllIlIllIIIllIIllllIIllIIIIlllllIIlllIlIlIlIlIIIlIIIlIlIIllllllllIIIllIIIIIl;
   private final double lIIlIlIllIlIlIIlIIIllIIlIlllllIIIIllIlIIIlIIllIIIIlIIIlIIllIIllIlllIIIIlIlIIIIllllllI;
   private final double IlIllIlIIlIIlIIIIIIlIlIIIlllIIllIllIIIlIIlIIlIIIlIIllIIIIIIllllIlIlIllIlllIIIIllIIIII;
   private final double IlIllIIIIIIIIIIlIllIIlIlIlIllIIIlIIIIllIlllllIIIlIIIIIIlIllIIlIIlIIIIIIllIIllllllIlII;
   private final double llIlllIIIllllIIllIlIIIllIIIIlIlIllIIIIlIllIIIlIIllIlIllIIIIIlIIIlIIllIllIIIIlIIIllIIl;
   private final double IlIIlllIIIlIlIllIllllIIIIllIlIIIlIllllIllIIlIlIlIlIlIIIllllIllIlllllIIlIIIlIIIlllIIlI;
   private final double IlIIlIlIIIIlllIIIllIIlIIlIIlIIIllllllIIlIlIIlllIIllIlllIlIlIIIlIlIIlIIIlIlIlllIIIlIIl;
   private final double IIlIllIllIlllllIIllIlIIIIllllIllllIlIIllIlIlIIllIlllllIllIIIlIlIIIIIIIIlIlIlIIlIIIlll;
   @NotNull
   private final GhostMacro.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IlllIIllIlIlllIIllIlIIIllIIIlllllIllIIllIlllIIIlllIIlIllIlIlllIIlIlIlIllIlllIlIIIIlll;
   @NotNull
   private final GhostMacro.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll IlIlIIlIIIIIIlllllllIIIllllIllIllIlIlIlllllIIIIlIIlllllIlIllIllllIllIlIIlllIIIIIIIIIl;
   @NotNull
   private List<? extends Creeper> lIIllllIlIIIIIIIlllIlIIIlIlIlIIlIlIlIIIIlIlIlIIlIIlIIlIllIlIIlIIIIIlIlllIlIllIIIlIlII;
   private volatile int IlIIlllIlIlIIllIIIIlIIllIIIIllIlIlllIIlllIlllIIlllIlIIlIIllIlllllIIIIlIIIIIllllllIIIl;
   @NotNull
   private volatile List<GhostMacro.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI> llIIIllllIIIllIlIlIlIIllIIIlIllIIIllIlIlIIllIIIlIIlIIIIIlIIIIllIlllIlllIIIlIlIlIIIIlI;
   private volatile int IlIllIIlIIlIlIIlIlIllIIIlllIlllllIlIIIIIlIlIlIIllllllIIlIIIlIllIIIIIIIIlIIlllIIIIllIl;
   private volatile boolean lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI;
   private int lIIIlIllIlllllllIIlIIIIllIIIIIlIIllllllIIlIIIIIlIIIlIIllIIIlIIIIlIllllIIllIIlllIIlllI;
   private int lIllllIIlIlIIIlIIIllIIIIIllIIIIlllIlIIIlIlIIIIlIlIIIIllIIIIlIlIIIIlIIIIllIlIIllIIllIl;
   private int IllIIllIllIIIlIIIIIIIIIlIlllIllIIllIlIllIlIlllllllllIlllIIlIllIlIllIlIlIllIIlIIIIlIlI;
   private int IIlllIIIllIlIIIlllIIlllIIllIlIIIIlllIlllIllIllIllIllllllllllllllIlIllllIIllIIIIlIlIll;
   private int lIlIIIIIIIllIlllIlIlIIIIIIIIlllllIIlllIIllIlllIIIlIIlllIlllIllIIlIllIIIlIllllllIIllII;
   @NotNull
   private final Regex lIIlIIIlIIlIlIlllIIllIIlIIIlllIllllIlIIlIIlIIIIllIIIllIlIlIIIlIIlllIllIIIlIlIlIllIIlI;
   @NotNull
   private final Regex IlIIlIIIllIlIIlIlIIllIllllllIlIIIllIIIllIIIIllIlllIlIIIIIlIIllIIlllIllIlIIIlIlllIlIll;
   private int IlIllIlIIIIIIIIllIlIIlIllllIIIIIlIlllIllllIIIlllIlIllllIlIllIIIIIIIlIllIlIIllIIIIIlll;
   @NotNull
   private ArrayList<IIIlIlIIlIIIlIIIIIllIIllIIllllIIIIIIIIIlIIIlIIlIlIllIIIIIIIllllIlIlllIIlIlIlIIlIlIlIl> IIIlllllllllllllIIlIlllIllIlIIlIIlIllIlIIIlIlIlIIIIIllIlIlllIIlIIIIIllIIIIlIllllIIlIl;
   @Nullable
   private me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll lllIlIIlIIlllIIllIIlIllIlllIllIIlIlllIllllllIlIllIIIIIlllIIIlIIIIllllIlIllIIllIllIlII;
   @Nullable
   private me.octo.client.utils.player.llIIlllIIllIlllllllIllIlIIIIllllllIlIlIIllllllIllllIIIIlIIIlllllIlllIlIIlIlIllIIIlIIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll IlIIIIllIIIIllIllIIIllllllIIlIIIlIlIllIIllIllllIlIIIlllllllIlllIllIIIIIIIlllIlllIIlII;
   @NotNull
   private final ArrayList<BlockPos> IllIlIIIIlllIIllIlllIlIIlllIIlllllIllIlIllllIlIIllIIIllIlIIllllIIlIIllIlIlllIlIIllllI;
   @Nullable
   private BlockPos lllIlIlllIIlIIIllIIlIIllllllllIIlllIlIIllIlIIIIlIlllIIlIIIIlIIlIIIIIIlllIIlllIlIlIlII;
   private boolean lIllllIIllllIlIIlllIIIlIIIlIllIIlIIIlllIlIIIllIIIIIIIlIIIIIIIlIllIIIlIIIlIIIIIIlIIlIl;
   private volatile boolean IllIlIIllIlIIlIIIllIIlllIlIlIlllllIIlllllIIIlIlIlllIlIlIllIIIIIllIlIlllllIIIIIlllllll;
   private volatile int IlIlIlllIlllIIlIlIIIIIIllIIlIIIIIllIIlIlIlIIIIlIIIlIIIIlIlIllIlIIIIlIIIlIllllIIllllIl;
   @Nullable
   private volatile BlockPos lIIlIllllIlllllIllIIIIlIIIlllIIlIIIllIIlIIllIIIlIIIIlIIllllIlIIIIIlIlIllIIllIlIIIIIIl;
   @Nullable
   private volatile BlockPos lIlllIllllIIllIIIIllIIIIIlllIIlIIIIllllIllIlIlIIlIlIlIIlIIllIlllllIlIIIlIIlllIIlllIII;
   @Nullable
   private volatile List<me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> IllIIIllIIllIlIIllIIlIIIIIllIlllIlllllIIIIlIIIIlIIIIlIIlIlIlIIIlIIllIlIlIlIlIllIIlllI;
   private final boolean IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI;
   @NotNull
   private static lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI IlllIlIIlllIIlIIIIIllllIIIIIlIIllllIlllIIIIlIIllIlIlIllIIlIIIIllllIlIlIllIlIlIlIIlIll;
   @NotNull
   private static GhostMacro lIIIlIllllllIIllIIlIlllIllllIlIlllllIIIllIlllIIlllllIlIIIlIlIIllllIIllIIIlllIllIIlIII;
   private static long lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl = 51454469491618L;
   private static String[] lIllIIlIIIllIlllIIlllIllIIllllIllIllIIIIIllIllIllIIlIIIIIlllIlIllIlIIllIIIllIIllIIIll;
   private static String[] IlIIlllllIlIIIIlIIIIlIllIlIIIlllIlIIIllIlIIIllIIlIIlIIIIllIIlIIIIIllIlllIIIIIlIIIIllI;
   private static Map lIlllIIIIIlllllIIllIllIlIIlIllllllIllIIlllIIllIIIIIlIlIlIllIlIlIIlIlIIlIlIIIIIlllIIlI = new HashMap(13);
   private static long[] lllIlIlIlIlIlIIllIIllIIIIIlIlIIlIIllllIlllIIlllllIlllIlIlIlIIllIlIIllllIlIlIlllIIIIlI;
   private static Integer[] IIllllIlIIlIIIIllIIIIlIlIIIIIlIlIllIlIllIlIlIIIIIllllIlllIIllIllIIllIlllIlIlllIIlIllI;
   private static Map IIlIlllIIIIIlIlIIIlIIlllllIIllllIIIlllllIllIlIlIIllIIlIIIIlIIIIIlIIIIlllllIIIIIIIlIlI;
   private static long[] llIlIIlIlIlllllIllIIIIlIIIlIlIIIIlIlllIlIlllIIlIIIIIIlllIllIIIllIlllIIIllllIIIlIlIIII;
   private static Long[] lllIllIlIlIllIIIIlIIIIIlIlIIlIIlllIIIllIIIIllIIIlllIIllIlIlllIllIIIlIlllIIlllIllIlIII;
   private static Map IllIllIIIIIIIIIlIIllllIlllllIIIlIIIIIIIIlllllIlllllIlIIllIlIllllIlIIIIIIlIIIllllllIlI;

   public GhostMacro() {
      long var1 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ 123537878631675L;
      long var3 = var1 ^ 138552641430181L;
      long var5 = (var1 ^ 24741809771818L) >>> 32;
      int var7 = (int)((var1 ^ 24741809771818L) << 32 >>> 32);
      ModuleCategory var10003 = ModuleCategory.MACROS;
      String[] var8 = new String[]{
         "This macro kills ghosts in the Dwarven Mines",
         "Supports one tap mode for faster killing",
         "Can clear edge ghosts first",
         "Has player detection and avoidance"
      };
      List var10005 = CollectionsKt.listOf(var8);
      var8 = new String[]{"Make sure you have a good combat pet", "Use a strong melee weapon", "Etherwarp is required for routes with WARP waypoints"};
      List var10006 = CollectionsKt.listOf(var8);
      Setting[] var11 = new Setting[]{
         lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(),
         lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(),
         lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(),
         lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(),
         lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(),
         lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(),
         lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(),
         lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(),
         lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(),
         lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(),
         lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(),
         lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(),
         lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII(),
         lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(),
         lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            .IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI()
      };
      super("Ghost Macro", "Kills Ghosts in Dwarven Mines, with optional One-Tap Mode.", var10003, "Dwarven", var10005, var10006, true, var11);
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = GhostMacro.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.SCAN;
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = -1;
      this.lIllllIIIIIIlIlIIlIIlIlIllIIIlllllIlllIIIIlIlllIIIlIIlIIllllIllllIllIlIIllIlIllIIIlII = new llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll = new llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl = 3.75;
      this.IIllIIllIllIIlIlIlIllIlIIlIIlIIlIIIIIlIIIIIllIllIIIIIllllIIIlIIllllIIIIllIIllIllIllll = this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl
         + 0.75;
      this.IIIlIIllIIlIlIlIlllIIIIlIlIIIIlIllllllIIlllIllIlllIlIllIIllllIIIllllIIlIlIllIIIIllIll = IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl<"a">(
         11594, 1978889435893334098L ^ var1
      );
      this.lIIIIlIIIIlIIllIlIlIIlIlIlIIlIIlIllIIllllIlIllIllIIllIIIIllllllIlIlIlIIllIIlIIIlIlllI = 3.4;
      this.llIlllIlIlllllllIlllIIlllIlIIIllllIIlIlIIIIIIIIlIIIIIIIIlIIllIIIIIIIIlIllllIlllIlllIl = 3.4;
      this.lIlIIlIIIlIllIIIlIIIIlllllllllIIlllIlIllllIIIIIIlIlIIlIIIIIllIllllIllllIlllIlIlIlllII = 8.0;
      this.IIIIIIIIllIllIIIlIllIllllIlIIlIIIIllIIIIIllIIIllIIlllIIlIIIlIIllIIllIIlIlIIIIIIIlllII = 6.5;
      this.lIlIlIIllIIIllIIlllllIlIIlIllIlIIlIllIIIlIIlllIlIllllllllllIIIIlIIIlIllIIlIlIlIlIlIIl = 8.0;
      this.IllllIlIIllIlIlIlllIlllIIllIIlIllIIlIIIIllIllIIIIllIIlIlIlIIlIllIIIllIlIllIlIlllIlIll = 8.0;
      this.lllIIllIIIlIllIllIlllIIlllIIIIlIIIllIIIlIlIIlIIlIllIlllIIllIlIllllIIlIIIllllIllIlIllI = 7.0;
      this.lIIIIIIIllIllIlIIIlllIlIIlIIllIllllIlIlIIlIIllIIllIIIlIIlllIlIIIIIlllllIllllllIIlIllI = 0.5;
      this.IllIIlIllIIIlIllIlIIlIIIIlllIIIIIIlIllIllIllIIlIIIIIlIIIlIIlllIlllIIlllIIIlIIlIlIlIII = 1.5;
      this.lIIIlIlIlIIlIIlIllIlIIlllIIIlIIlIlIIIlIlIIlIllIlllllIllIIIIlIlIlIIllIllIlIllIlIIIIIll = 60.0;
      this.IIIIlIIIlIllllIlIIlIlIlllllIIlIllIIIlIlllIIllIIlIIIIlIIlIIIIIIlllIIlIlIllIIlIIIllllIl = 25.0;
      this.lllIIllIIlIIIlllIIlllIIIlIlIllIIIlIIIllIlllIIlIIIlIlIlIIlllIIlllIlIlllIlIIlllIlIIIIIl = 12.0;
      this.llIIIlIIlllllllllllIIllllIllIIIIlIlIIIlIlllIlIllIIlIlIllIlIIllllIllIIlllIlllllllIlIlI = 15.0;
      this.IllllIlIIIIIIIlIllIlIIIlIllIIlllIIllIIllIIIIIllIIIlIllIlIlIIIlIIIIIlIIIlllIllllllIIII = 18.0;
      this.IllIllIIllIlllIIIllllIllIIIlIIIIllllIIllIlIIIIIIIIlIIllllllIIIllIIIIlIlIlIIlIlIlIlIll = 5.0;
      this.IllIIlIlIlIlIIllIIllIIIIIIIIIlllIIlllIlIllIIlIlllIIIIIlIllllIIlIlIllllIllllllIIIIIllI = 0.3;
      this.IIIIIlIIIIllllIlIIIllIIIlIIllIIllIllIIlIIlIllIllIIIIlllIIIlIllIlIllIlllIllIlIllIlllll = 0.5;
      this.llIllllIIlllIlIIllIIIIIIIIIIlIIlIlIllIIlIIlIlIlIllIllllllllIIllllIlIllIllIIIIllIIIlll = 30.0;
      this.IIllIIIIIIlllIIlIIlIIllIlllIlIllIlIllIlIIIlIllIIIlIIllllIIIlllIIIIlIlIlIllIIIllIllIll = 1.0;
      this.IlllllIlIIIIIIlIIIllIIIIIIIIIIIllIllllllIIlIIllIIIIIIlllllIIIIIlIlllIIIlIllIlllIllllI = IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl<"a">(
         28534, 4259576164343267941L ^ var1
      );
      this.lIIIIIllllIlIllIllIIIlIlIlIlllIIlIIIIIIIIlIlIllIlIIlIIIIlIIIIlIIIIIIIllIlIIIIIlllIIIl = IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl<"a">(
         5555, 1078830805078227112L ^ var1
      );
      this.lIllllIIIlIllIIIllllIIIlIIIlllIIlllIIllllIIlllIlllIIlIIIllIlllIllIlllIlIIIIIlIIIIIIll = 70.0;
      this.llIIIIlIlIllIllIllIIIlIllIIlIIlIIllIlIlIIIllIllIlIIllIllIIlIIIIllIIIIllIIIIIIIIlIllII = 3.35;
      this.IlIIlIlIIllIllllllIlIIlIIIIIllIIIIIIlIIIIllIIIIlIIlIIIIIlIlllIlIlIlIllIIIIlIIIllIIIIl = 2.35;
      this.IlIIlIIllIIlllIllllllIlIllIIlllIIlIlIIlllIlIllIIIllIlIIllllIlIIIlIlIlllIllIllIlllllII = 12.0;
      this.IlIllIIlllIIlIlIIIlllIlIlllIIlIlIIlIlllIIIllllIlIllIIlIlIlIIIIIIIllIlIIlIllIIlllIIllI = 0.75;
      this.IIIIlIlllIIlllIIIIlllIlIIlllIIlIIlllllIlIIllIIIlllIIlIIlIIlIlIllIIIllIIlIlIIllIIIlIlI = 35.0;
      this.llIlllIIIIlllllIIIlIIIlIIIIllIllIIIlIlIIIllIIlIlllIIlllIIIlIIIIlIIIlIlIllllIllIlIllIl = IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI<"p">(
         17892, 5860093997566687654L ^ var1
      );
      this.IIlIIIIlllIlIIIlllllllIIIIllIllIIlIIllIlIlllIlIlllIIlllIlIllIllIIIIIIIlllIlIlllllIIII = 3.5;
      this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII = new HashMap<>();
      this.lIlIllIIlIlIIIIlIIIllIIIIIIlIIlIIlIlIIllIIllllllIlIIIIIlllllIlIlIIIllIlIlIIlllllIllII = IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl<"a">(
         17481, 4927881340149328220L ^ var1
      );
      this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl = -1;
      this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll = new llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII = new llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.llIlIIlIIIlIllIIlIIIIIllIIlllIIlIllIlllIIIllIlIlIlllIIlllIlIIIIIIIIIIIIlIlllllIlllIlI = -1;
      this.IIIllIlIlIlIlIIIlIIIllllIlIlIIIIIIllIIIlllllIIlIlIIIlIlIlIlIlIlllllIllllllIlIlIIlIIll = new IIIlllIIIlllIllIIIlIIlIlIIlIIlIIIlIlIlllIIIllIllllIIIIllIllIIIlllIlllIllIIIIIIIllllll(
         null, 0L, 3, null
      );
      this.IllIlIlIllIlllllIIIIIIIlIllIIllllIIIlIlllllIlIlIIIIlllIIllIIlIllllIlllIIIlIIIIIIlIIIl = new llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.lllllIIIlIIllIIlIllIIIIlIIlIIllIlIlIIlIlIIlIllIIlIIlIIlIIlIlIllIllIIIlllIIlIlllIlIIlI = new llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.IIlllIllIIIIIIlIlIIIllIIlIlIllIIIIIIIIIIIIllIIIlIlllIIllIIllIIIllllIlIIllIlIIlIIIlIll = Random.Default.nextDouble(2.8, 3.0);
      this.lIIIlIIllllIIIlIlIIllIlIIIllllIllllIlllIIIlIIIIIlIllllllllIIlIIIIllIIIIlIIIIllllllIlI = Random.Default.nextDouble(-0.1, 0.0);
      this.IIIIIlIllIIIlIllIIIIIIlIlIlllIllIlIlIllIlIlIIlIlIIlIlIIllIIIlIlIlIIIlllIIIIllIlIIlIll = -1.0;
      this.IlllIllllllIIIlIlIlllIlIIlIIIIlIlIIIllllIlllIlIlllIlllIllIIIIlIIllIIIIlIllIIlllllllII = -1;
      this.IllllIllIlIIIllIlIIlIIllllIllIIllllIIIllIllIIllllIIllIlIlllllIlIlIIIIIllllIIlIlIIllIl = (float)Random.Default.nextDouble(0.0, 5.0);
      this.IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI = -1;
      this.IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI = -1;
      boolean[][] var12 = new boolean[8][];
      boolean[] var9 = new boolean[]{true, false, false, false};
      var12[0] = var9;
      var9 = new boolean[]{false, true, false, false};
      var12[1] = var9;
      var9 = new boolean[]{false, false, true, false};
      var12[2] = var9;
      var9 = new boolean[]{false, false, false, true};
      var12[3] = var9;
      var9 = new boolean[]{true, false, true, false};
      var12[4] = var9;
      var9 = new boolean[]{true, false, false, true};
      var12[5] = var9;
      var9 = new boolean[]{false, true, true, false};
      var12[6] = var9;
      var9 = new boolean[]{false, true, false, true};
      var12[7] = var9;
      this.lIIIllIIIIlllllllllllllllllllIIlIIIIIlIIllIIlIIlIllIIllllIIIIlllIlIlIlllllIIIIlIlIIIl = CollectionsKt.listOf((Object[])var12);
      this.lIIIIIIIlllIlllIlIIlIIlIlIllIIIIIIllllIlIlllIIIlIlIIIlIlllllllllIIIlIlllIIIIIllllllIl = new llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.llIIIlIIllIIlllIlllllIlIllIIlIIllllIIlIlIllIIIllIIIIlIlIIlIIIllIlIlllllIIlIIIIlIIIllI = IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl<"a">(
         13100, 4180569034009189938L ^ var1
      );
      this.IlllIllIlllIlIlIIlIlIIlIIlIlIIIlllIllllIIIIlllIlllllIIlIlIIIIlIllllllllIIlIlIIlllllII = new llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll();
      this.llllllllllIIIIIlllllIIIlIlIlIlIlIIIlIlIlllIlIllIlIIIlIIIIllIIlIlIIlIIllIllllIIIIllIII = IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl<"a">(
         16232, 233182247208686201L ^ var1
      );
      this.IIllIlIlIIIllIIlIIIIIlIIllllllIIllllIIIIIIIlllIIIllIIIlllllIlIlIlIllIlIlIIlIlllllIlll = IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl<"a">(
         25588, 7105778240179097323L ^ var1
      );
      this.lIlIlIlIllIlIIlIIllIllIlIllIIlIIlIIlIlllIIIIllIIlIlIIIIIlIllIIIllllllllIlIIlIlIllIlll = IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl<"a">(
         4013, 1828076883659039408L ^ var1
      );
      this.llIllIlIlIlIIlIIIlIIlIlIIlllIllIlIIllIIlIIIlIlIIllIllIlIlIIIIlIIllllllIllIIIlllIIlIIl = IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI<"p">(
         29734, 4050273377116276834L ^ var1
      );
      this.lIIllIlllIIlIlIllIIlIlIIIllIllIllIlllllIIIlllIlllIlIlIIIlIIllIIIIIllIlIIlllIIIIIIIIlI = 96.0;
      this.lIIllIIlIIlIIllllIIlIllllllIlIIIllllIIlIIlIIIIlIlIIIlIIIIlIllIIIIIIlIlIIIlIlllIllIIlI = 112.0;
      this.lllIlllIllIIlIlIllIlIIIllIllIIlllllIIIllllIIlIlIIIlIIIlllIlllllIlIlIllIlllllllIllIlIl = 74.0;
      this.IIlIlIllIIllIlIIlllllIIlIlIIIIlIlIlllIIIlIIllIllIIlIIlllIIllIlIIlllllIllllllllllIIIlI = 91.0;
      this.IlllIlllIIIlllIIlIlIlllIlllllIIlIIIIllIIIIIlllIIllIIlIIllllIllllIlIIlllIlIIIlIlIlIllI = IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI<"p">(
         5402, 6558607802817947993L ^ var1
      );
      this.llllllIIlIlIIlIIIIlIlIIIIIIlIIlIllIIIlIlIlIllIIIIlIIlIIIIlIlllIIllllllIIlllIlIIllIIIl = IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI<"p">(
         8516, 5180136472136817925L ^ var1
      );
      this.lllIlIlIllllIIIIlIllIIllIIIllllIlIllIllIIlIIlIIIIlIlllIlIIIlIlllIllllIIIllIllIIIIIIII = IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI<"p">(
         19374, 1174674189128890345L ^ var1
      );
      this.IIlIlllllIIllIIIlllIIIIlIIIlIIIIlIlIllllIlIIlIIlIlIIIlIIllIllIIIlllIlIllllIIIIlllllII = IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI<"p">(
         26393, 5125997239187921744L ^ var1
      );
      this.lIIllIIIIlIlIIIIlIlllllIIIlIIllIllIlllllIlIllIIIIIIlIlIIIIIIllIIlllIlllllllIllIlIllII = IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI<"p">(
         96, 4276725769641344037L ^ var1
      );
      this.lIIllIlIIIIlIIlIlIllIIllIIllIIIIIIlIIlIIIllllIlIlllIlIlllIlIllIIIIIllIIIIlIlIIIlIIIlI = 8.0;
      this.llIIllllIlIIIlIIIIIllIIlllllIllllIIIlllIlIIlIlllIIlIIllIlllllIlIIIlllIllIllllllIIIllI = 22.0;
      this.lIlIIlIlIIllIlIllIIIllIIllllIIllIIIIlllllIIlllIlIlIlIlIIIlIIIlIlIIllllllllIIIllIIIIIl = 15.0;
      this.lIIlIlIllIlIlIIlIIIllIIlIlllllIIIIllIlIIIlIIllIIIIlIIIlIIllIIllIlllIIIIlIlIIIIllllllI = 6.0;
      this.IlIllIlIIlIIlIIIIIIlIlIIIlllIIllIllIIIlIIlIIlIIIlIIllIIIIIIllllIlIlIllIlllIIIIllIIIII = 2.0;
      this.IlIllIIIIIIIIIIlIllIIlIlIlIllIIIlIIIIllIlllllIIIlIIIIIIlIllIIlIIlIIIIIIllIIllllllIlII = 1.0;
      this.llIlllIIIllllIIllIlIIIllIIIIlIlIllIIIIlIllIIIlIIllIlIllIIIIIlIIIlIIllIllIIIIlIIIllIIl = 8.0;
      this.IlIIlllIIIlIlIllIllllIIIIllIlIIIlIllllIllIIlIlIlIlIlIIIllllIllIlllllIIlIIIlIIIlllIIlI = 120.0;
      this.IlIIlIlIIIIlllIIIllIIlIIlIIlIIIllllllIIlIlIIlllIIllIlllIlIlIIIlIlIIlIIIlIlIlllIIIlIIl = 100.0;
      this.IIlIllIllIlllllIIllIlIIIIllllIllllIlIIllIlIlIIllIlllllIllIIIlIlIIIIIIIIlIlIlIIlIIIlll = 1000.0;
      this.IlllIIllIlIlllIIllIlIIIllIIIlllllIllIIllIlllIIIlllIIlIllIlIlllIIlIlIlIllIlllIlIIIIlll = new GhostMacro.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         109.0,
         85.0,
         182.0,
         36.0,
         97.0,
         80.0,
         GhostMacro::lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll,
         GhostMacro::IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII
      );
      this.IlIlIIlIIIIIIlllllllIIIllllIllIllIlIlIlllllIIIIlIIlllllIlIllIllllIllIlIIlllIIIIIIIIIl = new GhostMacro.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         -57.0, null, 95.0, 45.0, 160.0, 80.0, null, null, 192, null
      );
      this.lIIllllIlIIIIIIIlllIlIIIlIlIlIIlIlIlIIIIlIlIlIIlIIlIIlIllIlIIlIIIIIlIlllIlIllIIIlIlII = CollectionsKt.emptyList();
      this.llIIIllllIIIllIlIlIlIIllIIIlIllIIIllIlIlIIllIIIlIIlIIIIIlIIIIllIlllIlllIIIlIlIlIIIIlI = CollectionsKt.emptyList();
      this.IlIllIIlIIlIlIIlIlIllIIIlllIlllllIlIIIIIlIlIlIIllllllIIlIIIlIllIIIIIIIIlIIlllIIIIllIl = -1;
      this.lIIIlIllIlllllllIIlIIIIllIIIIIlIIllllllIIlIIIIIlIIIlIIllIIIlIIIIlIllllIIllIIlllIIlllI = -1;
      this.lIIlIIIlIIlIlIlllIIllIIlIIIlllIllllIlIIlIIlIIIIllIIIllIlIlIIIlIIlllIllIIIlIlIlIllIIlI = new Regex(
         "^\\+(\\d+)\\s+KILL\\s+COMBO!?", RegexOption.IGNORE_CASE
      );
      this.IlIIlIIIllIlIIlIlIIllIllllllIlIIIllIIIllIIIIllIlllIlIIIIIlIIllIIlllIllIlIIIlIlllIlIll = new Regex(
         "^Your Kill Combo has expired! You reached a ([\\d,]+)\\s+Kill\\s+Combo!?$", RegexOption.IGNORE_CASE
      );
      this.IIIlllllllllllllIIlIlllIllIlIIlIIlIllIlIIIlIlIlIIIIIllIlIlllIIlIIIIIllIIIIlIllllIIlIl = new ArrayList<>();
      BlockPos[] var13 = new BlockPos[]{new BlockPos(131, 75, 56), new BlockPos(161, 75, 49), new BlockPos(152, 75, 78), new BlockPos(144, 75, 67)};
      this.IllIlIIIIlllIIllIlllIlIIlllIIlllllIllIlIllllIlIIllIIIllIlIIllllIIlIIllIlIlllIlIIllllI = CollectionsKt.arrayListOf(var13);
      this.IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI = true;
   }

   @Override
   protected void lIllIlIlllIlIllllllIIIllllllllIIIlllllIllIlIllIllIllIIIIIIlIIlllIlIlllIlIIllIlIIIIIII(long var1) {
      long var3 = var1 ^ 38666634225439L;
      int var5 = (int)((var1 ^ 80611479426883L) >>> 48);
      long var6 = (var1 ^ 80611479426883L) << 16 >>> 16;
      long var8 = var1 ^ 26927438315355L;
      long var10 = var1 ^ 14314994529389L;
      long var12 = var1 ^ 128252868131153L;
      long var14 = var1 ^ 67406543704305L;
      int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -5432526036792174896L, var1
      );
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         this,
         lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(4227, 7536440752244582146L ^ var1),
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.TRAVEL,
         GhostMacro::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI,
         IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl<"a">(31134, 1455190622906936793L ^ var1),
         false,
         false,
         GhostMacro::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI,
         (Function1)(
            new Function1<me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII, Unit>(this) {
               private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 109755838387425L;
               private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

               {
                  long var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 85364137882867L;
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var1, long var2
               ) {
                  var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var2;
                  long var4 = var2 ^ 43596930748064L;
                  Intrinsics.checkNotNullParameter(
                     var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"o">(25519, 177521580740136756L ^ var2)
                  );
                  GhostMacro.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI((GhostMacro)this.receiver, var4, var1);
               }

               static {
                  long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 21014225521631L;
                  Cipher var2;
                  Cipher var10000x = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                  SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
                  byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var3x = 1; var3x < 8; var3x++) {
                     var10003[var3x] = (byte)(var0 << var3x * 8 >>> 56);
                  }

                  var10000x.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  String[] var9 = new String[3];
                  int var7 = 0;
                  String var6x = "¢zv\u0010IvØÄ%¿\u001f,×o\u009f]cô\u0015Ç\u0098Ü!è\t13V\nÊ\u0082ëb+§\u0000Ü\röbìÃ-\u0011\u0089T4¸Íõ?K&½\u0002Eò/ºw+|5Xt\u0012\u0083ð»v\r¬\u009aó\u0010Ès?\u009b7*| \u000bà£\u0091qµ\u0082\tç'¤¾iQÒG\u0089¯½üa\\©X\u000fµ\u000e\n!wÝ\u0010Ðj\u008eÓY\u0007\u0082\fÎ-\u0000¾¾B\u0014@C1\b,\u009dÑõ\u008fY\u009f´\u00803Í#º~ü~®\u008b\u001e¢\u0011\u008fÄ\u008f Ìy\u0098O*¾Õ\u00853ÂR¦¶Ø®rx\u001ei?Pd\"õæª.\u0089¨{~o\u000b\u008a'½|¶¡\u001d\u007fz³Æ\u0007\u0012á½\u0095\u0010¥\u0089¶·¾\u0015D\u0098ËqHº\u008aÆ\u009c8(¦\u0095yü\u0017\u008aüâÁ=(à½\u0090¸G6=à\u0090à\u008e K\u0085\u0094\u0007\u009a7ûô¾\u00ad\u0086,á\u0004\u0001ËÛ";
                  int var8x = "¢zv\u0010IvØÄ%¿\u001f,×o\u009f]cô\u0015Ç\u0098Ü!è\t13V\nÊ\u0082ëb+§\u0000Ü\röbìÃ-\u0011\u0089T4¸Íõ?K&½\u0002Eò/ºw+|5Xt\u0012\u0083ð»v\r¬\u009aó\u0010Ès?\u009b7*| \u000bà£\u0091qµ\u0082\tç'¤¾iQÒG\u0089¯½üa\\©X\u000fµ\u000e\n!wÝ\u0010Ðj\u008eÓY\u0007\u0082\fÎ-\u0000¾¾B\u0014@C1\b,\u009dÑõ\u008fY\u009f´\u00803Í#º~ü~®\u008b\u001e¢\u0011\u008fÄ\u008f Ìy\u0098O*¾Õ\u00853ÂR¦¶Ø®rx\u001ei?Pd\"õæª.\u0089¨{~o\u000b\u008a'½|¶¡\u001d\u007fz³Æ\u0007\u0012á½\u0095\u0010¥\u0089¶·¾\u0015D\u0098ËqHº\u008aÆ\u009c8(¦\u0095yü\u0017\u008aüâÁ=(à½\u0090¸G6=à\u0090à\u008e K\u0085\u0094\u0007\u009a7ûô¾\u00ad\u0086,á\u0004\u0001ËÛ"
                     .length();
                  char var5x = 208;
                  int var4 = -1;

                  while (true) {
                     byte[] var10x = var2.doFinal(var6x.substring(++var4, var4 + var5x).getBytes("ISO-8859-1"));
                     String var13 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10x).intern();
                     byte var10001 = -1;
                     var9[var7++] = var13;
                     if ((var4 += var5x) >= var8x) {
                        lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var9;
                        IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = new String[3];
                        return;
                     }

                     var5x = var6x.charAt(var4);
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
                        char var6x = (char)((char)(var5x & 31) << 6);
                        byte var8x = var0[++var4];
                        var6x = (char)(var6x | (char)(var8x & 63));
                        var3x[var1x++] = var6x;
                     } else if (var4 < var2 - 2) {
                        char var12x = (char)((char)(var5x & 15) << '\f');
                        byte var9 = var0[++var4];
                        var12x = (char)(var12x | (char)(var9 & 63) << 6);
                        var9 = var0[++var4];
                        var12x = (char)(var12x | (char)(var9 & 63));
                        var3x[var1x++] = var12x;
                     }
                  }

                  return new String(var3x, 0, var1x);
               }

               private static String IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(int var0, long var1x) {
                  int var5x = var0 ^ (int)(var1x & 32767L) ^ 8447;
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
                           "me/octo/client/modules/impl/macros/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI",
                           var10x
                        );
                     }

                     byte[] var6x = new byte[8];
                     var6x[0] = (byte)(var1x >>> 56);

                     for (int var7 = 1; var7 < 8; var7++) {
                        var6x[var7] = (byte)(var1x << var7 * 8 >>> 56);
                     }

                     DESKeySpec var11 = new DESKeySpec(var6x);
                     SecretKey var8x = ((SecretKeyFactory)var4[1]).generateSecret(var11);
                     ((Cipher)var4[0]).init(2, var8x, (IvParameterSpec)var4[2]);
                     byte[] var9 = lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII[var5x].getBytes("ISO-8859-1");
                     IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5x] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                        ((Cipher)var4[0]).doFinal(var9)
                     );
                  }

                  return IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl[var5x];
               }

               private static Object IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  Lookup var0, MutableCallSite var1x, String var2, Object[] var3x
               ) {
                  int var4 = (Integer)var3x[0];
                  long var5x = (Long)var3x[1];
                  String var7 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var4, var5x);
                  MethodHandle var8x = MethodHandles.constant(String.class, var7);
                  var1x.setTarget(MethodHandles.dropArguments(var8x, 0, int.class, long.class));
                  return var7;
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
                        "me/octo/client/modules/impl/macros/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI"
                           + " : "
                           + var1x
                           + " : "
                           + var2.toString(),
                        var5x
                     );
                  }
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$18d69781fee41c72(
                  me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII p0Arg, long argument2Arg
               ) {
                  argument2Arg = 137406948104324L;
                  argument2Arg = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ argument2Arg;
                  long var4 = argument2Arg ^ 43596930748064L;
                  Intrinsics.checkNotNullParameter(p0Arg, "p0");
                  GhostMacro.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$f90e102f36a866ea(
                     (GhostMacro)this.receiver, var4, p0Arg
                  );
               }
            }
         ),
         48,
         null,
         var3
      );
      int[] var16 = var10000;
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$2030c455b41fd429(
         this,
         lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(9900, 373138133767508262L ^ var1),
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.MOVE,
         IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl<"a">(19861, 3703761454294718941L ^ var1),
         0L,
         false,
         false,
         GhostMacro::IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII,
         (Function1)(
            new Function1<me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII, Unit>(this) {
               private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 87654551491627L;
               private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

               {
                  long var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 25148889983658L;
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var1,
                  int var2,
                  int var3x,
                  byte var4
               ) {
                  long var5x = ((long)var2 << 32 | (long)var3x << 40 >>> 32 | (long)var4 << 56 >>> 56)
                     ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  long var7 = var5x ^ 69277515020916L;
                  Intrinsics.checkNotNullParameter(
                     var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"n">(17777, 720465255233471489L ^ var5x)
                  );
                  GhostMacro.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI((GhostMacro)this.receiver, var7, var1);
               }

               static {
                  long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 43043205631902L;
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
                  String var6 = "¦Z.\"\u00891ü¡%ýhßÍ\u0019þ\u0002}\u0015\b\u0085A¿\f\u008dáHxÉ}\u000fó²8eBR\u008aZ·\u000fÐ§»ÜsÉr@ÛÂ\"\u009a\u00838E®\u0084\u0006ü\u001b\u008cÉá\u0001\u0014(Å\t³\nrÅØÆÍTË¬1ý]È÷i\u001b\u0000\u00ad\u008bu8dWO¯>bK9kÐãP[b[TÊ\u0010${Ò\u0097/\u0013¹\u0097·ä7<ÒCcð®1évM\u009b\u009fQGÚ\u00ad\u0097I\u0080 \u0095×P\\\"£ñÝ\u0015znÜ§#Ó\u0089h÷t·4\u008bãþÓjmóÏR\u009b{F6\u0080\u0089îäÃÓ\u0086c4~LJ\u009f\u0081/à[-\u008f9ÆÁy\u0083Î\r\u0094\u001b\u0004Ãüë\"\u0017Ú\u0007Ê\fojõî \u00adIx¯ÉfÿuCY\u0092\u001e\u009dA\u007f\u001a\u009aÆc®ÃÅ\u001d'¿c\u0016óºTIÏQ\u0010ê\u008f¹÷\rõ×gXø4z´\u008b$ë";
                  int var8 = "¦Z.\"\u00891ü¡%ýhßÍ\u0019þ\u0002}\u0015\b\u0085A¿\f\u008dáHxÉ}\u000fó²8eBR\u008aZ·\u000fÐ§»ÜsÉr@ÛÂ\"\u009a\u00838E®\u0084\u0006ü\u001b\u008cÉá\u0001\u0014(Å\t³\nrÅØÆÍTË¬1ý]È÷i\u001b\u0000\u00ad\u008bu8dWO¯>bK9kÐãP[b[TÊ\u0010${Ò\u0097/\u0013¹\u0097·ä7<ÒCcð®1évM\u009b\u009fQGÚ\u00ad\u0097I\u0080 \u0095×P\\\"£ñÝ\u0015znÜ§#Ó\u0089h÷t·4\u008bãþÓjmóÏR\u009b{F6\u0080\u0089îäÃÓ\u0086c4~LJ\u009f\u0081/à[-\u008f9ÆÁy\u0083Î\r\u0094\u001b\u0004Ãüë\"\u0017Ú\u0007Ê\fojõî \u00adIx¯ÉfÿuCY\u0092\u001e\u009dA\u007f\u001a\u009aÆc®ÃÅ\u001d'¿c\u0016óºTIÏQ\u0010ê\u008f¹÷\rõ×gXø4z´\u008b$ë"
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
                  int var5 = var0 ^ (int)(var1 & 32767L) ^ 31171;
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
                           "me/octo/client/modules/impl/macros/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll",
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
                        "me/octo/client/modules/impl/macros/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll"
                           + " : "
                           + var1
                           + " : "
                           + var2.toString(),
                        var5
                     );
                  }
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$4e0015f1abb21a1e(
                  me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII p0Arg,
                  int argument2Arg,
                  int argument3Arg,
                  byte argument4Arg
               ) {
                  short var9 = 18485;
                  argument3Arg = 16633708;
                  argument4Arg = -102;
                  long var5x = ((long)var9 << 32 | (long)argument3Arg << 40 >>> 32 | (long)argument4Arg << 56 >>> 56)
                     ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  long var7 = var5x ^ 69277515020916L;
                  Intrinsics.checkNotNullParameter(p0Arg, "p0");
                  GhostMacro.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$f90e102f36a866ea(
                     (GhostMacro)this.receiver, var7, p0Arg
                  );
               }
            }
         ),
         var8,
         56,
         null
      );
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var20 = this;
      String var10001 = lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(4453, 8868529008445875869L ^ var1);
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[] var17 = new me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[]{
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.SETUP,
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.KILL
      };
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$e7b1948516808058(
         var20,
         var10001,
         var12,
         SetsKt.setOf(var17),
         IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl<"a">(389, 2797142221167498700L ^ var1),
         0L,
         null,
         false,
         false,
         GhostMacro::IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl,
         (Function1)(
            new Function1<me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII, Unit>(this) {
               private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 547548514251L;
               private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
               private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
               private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

               {
                  long var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 103462869639678L;
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                  me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var1,
                  short var2,
                  int var3x,
                  char var4
               ) {
                  long var5x = ((long)var2 << 48 | (long)var3x << 32 >>> 16 | (long)var4 << 48 >>> 48)
                     ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  long var7 = var5x ^ 97688525142873L;
                  Intrinsics.checkNotNullParameter(
                     var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"y">(22245, 3089907648787726466L ^ var5x)
                  );
                  GhostMacro.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI((GhostMacro)this.receiver, var7, var1);
               }

               static {
                  long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 20858517049015L;
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
                  String var6 = "\u0003+\npU·\u0093ñàåÀF\u0002\u0090àÆ}ù7\u001a\u0002\u0015\u0097°S\u0006¥ò÷GYjÐ\u0083³\u0011r\u0095¢gbî\u0081ì\u0002\u00124Ï:ÍÞ\u008fDRa'IpðYÂ©»Å,\\¨M§};ìâ^\u0091æ\u001eéÓT\u0099¬2(øÂ¼©ð\u009có'«.A\u0087ØÊ @\u0019wñyÿ¯ÇV½Ù\u008b\u009c¢rÂ¼l7\u0018G\u0011»üº2$m\u000f\r\u000f\u0097Iu¾¦¶\u0087\u0017\u0005·\u0001ç±\u0010$öï6)\u0093åppÔaª»\u009c!\u0014\u00ad\fáv\\|¢\u0006d\u000b\u000ezê[©hu\u0080\u0087m\u009f!\u009aî\u008f5´\u0000^î\b¢c\u000e¿5ô-é\u008d<Ïfð(\u0017\u0090ü\u0017VÂEåÔl\n!\u009b°Û^\u00adÂ·à\u0004I\n;¢\u0093dÝ>\u0001ùíìl÷¹\u0010×l\u0088\u0080à\u008b7¾Ë;1QÁ©H7";
                  int var8 = "\u0003+\npU·\u0093ñàåÀF\u0002\u0090àÆ}ù7\u001a\u0002\u0015\u0097°S\u0006¥ò÷GYjÐ\u0083³\u0011r\u0095¢gbî\u0081ì\u0002\u00124Ï:ÍÞ\u008fDRa'IpðYÂ©»Å,\\¨M§};ìâ^\u0091æ\u001eéÓT\u0099¬2(øÂ¼©ð\u009có'«.A\u0087ØÊ @\u0019wñyÿ¯ÇV½Ù\u008b\u009c¢rÂ¼l7\u0018G\u0011»üº2$m\u000f\r\u000f\u0097Iu¾¦¶\u0087\u0017\u0005·\u0001ç±\u0010$öï6)\u0093åppÔaª»\u009c!\u0014\u00ad\fáv\\|¢\u0006d\u000b\u000ezê[©hu\u0080\u0087m\u009f!\u009aî\u008f5´\u0000^î\b¢c\u000e¿5ô-é\u008d<Ïfð(\u0017\u0090ü\u0017VÂEåÔl\n!\u009b°Û^\u00adÂ·à\u0004I\n;¢\u0093dÝ>\u0001ùíìl÷¹\u0010×l\u0088\u0080à\u008b7¾Ë;1QÁ©H7"
                     .length();
                  char var5 = ' ';
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
                  int var5 = var0 ^ (int)(var1 & 32767L) ^ 28665;
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
                           "me/octo/client/modules/impl/macros/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI",
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
                        "me/octo/client/modules/impl/macros/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI"
                           + " : "
                           + var1
                           + " : "
                           + var2.toString(),
                        var5
                     );
                  }
               }

               public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$bc7d67ff3cc99b9b(
                  me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII p0Arg,
                  short argument2Arg,
                  int argument3Arg,
                  char argument4Arg
               ) {
                  byte var9 = 0;
                  argument3Arg = 1613440957;
                  short var11 = 15959;
                  long var5x = ((long)var9 << 48 | (long)argument3Arg << 32 >>> 16 | (long)var11 << 48 >>> 48)
                     ^ IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  long var7 = var5x ^ 97688525142873L;
                  Intrinsics.checkNotNullParameter(p0Arg, "p0");
                  GhostMacro.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$f90e102f36a866ea(
                     (GhostMacro)this.receiver, var7, p0Arg
                  );
               }
            }
         ),
         120,
         null
      );
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll var21 = this;
      var10001 = lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(23619, 5668097453288663949L ^ var1);
      var17 = new me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll[2];

      try {
         var17[0] = me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.SETUP;
         var17[1] = me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.KILL;
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$e7b1948516808058(
            var21,
            var10001,
            var12,
            SetsKt.setOf(var17),
            IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl<"a">(21610, 8314393219493642276L ^ var1),
            0L,
            null,
            false,
            false,
            GhostMacro::lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll,
            (Function1)(
               new Function1<me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII, Unit>(this) {
                  private static long IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = 60328415182945L;
                  private static String[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
                  private static String[] IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
                  private static Map lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = new HashMap(13);

                  {
                     long var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 60469711665052L;
                  }

                  public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
                     me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var1, long var2
                  ) {
                     var2 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ var2;
                     long var4 = var2 ^ 132835212717330L;
                     Intrinsics.checkNotNullParameter(
                        var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(28277, 9195582774841917335L ^ var2)
                     );
                     GhostMacro.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI((GhostMacro)this.receiver, var4, var1);
                  }

                  static {
                     long var0 = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ 51508672904749L;
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
                     String var6 = "\u008fbÉ¶¢É¢\n@à#$Â\u0001§éï¿/\u0091\u008ddÜzH\u009dVAÃÔEªÈô\u0006 âË\u0012§\u0010ÏÑ\u0016(N¨\u009bEpE\u0018þtu¯¿Ð\u008d ®è\u0094°\u008cJ´¤Ý.\u000e¬Q÷æ.ÇÄ¿ð»%ÍJA4lþº\u0089øw¡Z½\u008a\u009e\u0003\u001fµ\u000byG\u0096üö@\u0081s\u0007\b8·\u008bPiÀ\u0089E¢\t´ç)\u0097\u007ft¯\u008f¬!\b\u008b´\u008d<\u0006nZ\u0094r\u0092i·ªRx\\¶T¼êô#\u0090z\u0016b\u009b8ºèD\u009bðf\u0089¢(Ì\u008bý§±Ð©BÜ\u0014Ã{\u009eW\u00adÿ¾M\u0019>¨\u008cÏ4}}§Tv'î\u0098NÒ\u008fÙ~¦\rw1o\u009bmk\u0080\u008c }\r[[JÇ}ö2màM3\u0004Wm\u000b>rn¯\u0090Þ\u0019\u008aFV\r\u0012\u001b>1\u008cDm½[7$\u0012\u00adQ\u0000UtÂ¨9ð";
                     int var8 = "\u008fbÉ¶¢É¢\n@à#$Â\u0001§éï¿/\u0091\u008ddÜzH\u009dVAÃÔEªÈô\u0006 âË\u0012§\u0010ÏÑ\u0016(N¨\u009bEpE\u0018þtu¯¿Ð\u008d ®è\u0094°\u008cJ´¤Ý.\u000e¬Q÷æ.ÇÄ¿ð»%ÍJA4lþº\u0089øw¡Z½\u008a\u009e\u0003\u001fµ\u000byG\u0096üö@\u0081s\u0007\b8·\u008bPiÀ\u0089E¢\t´ç)\u0097\u007ft¯\u008f¬!\b\u008b´\u008d<\u0006nZ\u0094r\u0092i·ªRx\\¶T¼êô#\u0090z\u0016b\u009b8ºèD\u009bðf\u0089¢(Ì\u008bý§±Ð©BÜ\u0014Ã{\u009eW\u00adÿ¾M\u0019>¨\u008cÏ4}}§Tv'î\u0098NÒ\u008fÙ~¦\rw1o\u009bmk\u0080\u008c }\r[[JÇ}ö2màM3\u0004Wm\u000b>rn¯\u0090Þ\u0019\u008aFV\r\u0012\u001b>1\u008cDm½[7$\u0012\u00adQ\u0000UtÂ¨9ð"
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
                     int var5 = var0 ^ (int)(var1 & 32767L) ^ 15924;
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
                              "me/octo/client/modules/impl/macros/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll",
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
                           "me/octo/client/modules/impl/macros/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$IIllIIIlIllllIlIlIIIlIIIlIIIlIIllIIllIIlIllIIIIlIlIIllIIllIIllllIlIIllIIIIIIllIllIlll"
                              + " : "
                              + var1
                              + " : "
                              + var2.toString(),
                           var5
                        );
                     }
                  }

                  public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$c6c51d2229c83dd3(
                     me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII p0Arg, long argument2Arg
                  ) {
                     argument2Arg = 130304684568502L;
                     argument2Arg = IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl ^ argument2Arg;
                     long var4 = argument2Arg ^ 132835212717330L;
                     Intrinsics.checkNotNullParameter(p0Arg, "p0");
                     GhostMacro.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$f90e102f36a866ea(
                        (GhostMacro)this.receiver, var4, p0Arg
                     );
                  }
               }
            ),
            48,
            null
         );
         if (var16 != null) {
            lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               new int[1], -5416416701047508843L, var1
            );
         }
      } catch (NoWhenBranchMatchedException var18) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var18, -5388515728463009128L, var1
         );
      }
   }

   @SubscribeEvent(priority = EventPriority.HIGH)
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull WorldRenderEvent eventArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
      @NotNull me.octo.client.events.impl.game.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll eventArg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void lllIIllIIIlIlIIIlIIlIlIlIIIIIIIIlIlllllIIIIlllIIllIllllIllIIIlIIIIIlIllIIllllIIIlllll(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull EntityDataUpdateEvent eventArg) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void llllIIllIIIlIlIIlIllIlIIlIllllIlllIlIIIllllIIllIlIlllllIIlIlllIIlllIllIlllIlllIIlIIll(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(@NotNull PacketReceivedEvent param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @NotNull
   @Override
   protected lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl llIlIlIIIlIIllIlllIIIllIlllllllIlIlIIllIlllllIIIllIIIIIIIIllIIIlIllIlllIIlIIlIIIllllI(
      long var1
   ) {
      me.octo.client.modules.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll[] var3 = new me.octo.client.modules.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll[]{
         new me.octo.client.modules.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll(
            lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(29248, 6057293821198961225L ^ var1),
            lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(19133, 5227779715414274809L ^ var1)
         ),
         new me.octo.client.modules.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll(
            lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(24408, 7363500015850530581L ^ var1),
            lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(25311, 6933602420144282250L ^ var1)
         ),
         new me.octo.client.modules.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll(
            lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(22098, 7434970448711495242L ^ var1),
            lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(21833, 1053839569330056517L ^ var1)
         ),
         new me.octo.client.modules.llIIlIllIllllIIIIlllIlIllIlIIIlllIllIlllIIlIIllIlIllIlIIllIIlIIIIlIIlIlIllllIIIIIlIll(
            lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(19164, 3736070909544477416L ^ var1),
            lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(20096, 1581431249136269003L ^ var1)
         )
      };
      return new lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl(true, true, true, true, true, CollectionsKt.listOf(var3));
   }

   private final void IIlIlIIlllIIIIllIlIlIIllllIIlllIIllIllIlIlIlIllIlIIlIIllllIIlIlIllIllllllIlllIIIIlllI(long var1) {
      var1 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var1;
      int var3 = (int)((var1 ^ 19102018135414L) >>> 56);
      long var4 = (var1 ^ 19102018135414L) << 8 >>> 8;
      long var6 = var1 ^ 102109313155628L;
      long var8 = var1 ^ 81618945542537L;
      this.lIIlIIllIIlIlIIIIlIIIlIIIllIIlIIllIlIIIIIlIlIlllIIlIlIIIIIlllllIlllllIllIIlllIllIIlIl((byte)var3, var4);
      this.lIllllIIlIlIIIlIIIllIIIIIllIIIIlllIlIIIlIlIIIIlIlIIIIllIIIIlIlIIIIlIIIIllIlIIllIIllIl = 0;
      this.IllIIllIllIIIlIIIIIIIIIlIlllIllIIllIlIllIlIlllllllllIlllIIlIllIlIllIlIlIllIIlIIIIlIlI = 0;
      this.IIlllIIIllIlIIIlllIIlllIIllIlIIIIlllIlllIllIllIllIllllllllllllllIlIllllIIllIIIIlIlIll = 0;
      this.lIlIIIIIIIllIlllIlIlIIIIIIIIlllllIIlllIIllIlllIIIlIIlllIlllIllIIlIllIIIlIllllllIIllII = 0;
      llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
            var6, lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(4886, 6494670954431748324L ^ var1)
         );
      this.lIlIllIIllIIllIIlllllIlIIIllIIllIIlllIllIllIIIlIIIIlIlIIllIIIIIlIIlllIIlllIlIlIlIlllI(var8);
   }

   @Override
   public void IlIIIlIlIIIIllllllllIIllIIIlIIIIIIIlIllIIIllIIlIIIllllllllIllllIIllIlIllIIIIllIlIlIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl(long var1) {
      long var3 = var1 ^ 73008348599167L;
      long var5 = var1 ^ 0L;
      long var7 = var1 ^ 30926010954645L;
      long var9 = var1 ^ 17623842614854L;
      long var11 = var1 ^ 74977923374630L;
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
         .lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(var11);
      IlllIlIIlllIIlIIIIIllllIIIIIlIIllllIlllIIIIlIIllIlIlIllIIlIIIIllllIlIlIllIlIlIlIIlIll.lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl(
         var7
      );
      this.lIIlIIIllIlllIlIIlIlIIIllllllIlIIlIIlIIIlIIIlllIIIIIlllIIlllIIllllIlllIlIIlIlIllIlIII();
      this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var3);
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var9, this, false, 1, null
      );
      super.IlllIIIllIIlllIlllIlIIIlllIlIlllIllIlIIllIlIllIllllllIIIlIIIlIlllIIIlIlllIIlIIIlIIlIl(var5);
   }

   @Override
   public void IlIlIIIlllIlIIlIlllIllIllIIlIllIIllIlIIlIIlIllllllIlIIlIllIllllIIlIIIlIIIllIlIIIIlIIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void IIIIIIlIlIIIlIIIIIlllIIlIlIllIllIlllIIIIIllIlIIlIlIIIIIIllllIIIllIIllllIlIIlIIllllllI(int var1, short var2, short var3) {
      long var4 = (long)var1 << 32 | (long)var2 << 48 >>> 32 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 45500378991535L;
      this.IlIlIIIlllIlIIlIlllIllIllIIlIllIIllIlIIlIIlIllllllIlIIlIllIllllIIlIIIlIIIllIlIIIIlIIl(var6);
   }

   @Override
   public void llIlIIIIIllIIlIllIIlIIIIIIIIIlIlIlIllIlllllIlIllIIIIIllllllIIIllIIlIlIIlIIIlllllIlIlI(long var1) {
      long var3 = var1 ^ 16281341477396L;
      long var5 = var1 ^ 102948816433412L;
      IIllIlIllIllllIIllllllIIlIlIIIlllIlIIllIllIllIIlIIIlIlIIIllIIIllllIlIIIIllllIIlIlIlIl.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl<"a">(27092, 7676760224939639719L ^ var1),
            GhostMacro::IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI,
            var5
         );
   }

   @Override
   public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long var1, @NotNull me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var3, int var4
   ) {
      long var5 = var1 ^ 63209871364372L;
      long var7 = var1 ^ 113503648575998L;
      long var9 = var1 ^ 0L;
      long var11 = var1 ^ 69451990948941L;
      Intrinsics.checkNotNullParameter(
         var3, lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(7006, 4164417882894013022L ^ var1)
      );
      super.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var9, var3, var4);
      this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var5);
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
         .lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(var11);
      IlllIlIIlllIIlIIIIIllllIIIIIlIIllllIlllIIIIlIIllIlIlIllIIlIIIIllllIlIlIllIlIlIlIIlIll.lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl(
         var7
      );
      this.lIIlIIIllIlllIlIIlIlIIIllllllIlIIlIIlIIIlIIIlllIIIIIlllIIlllIIllllIlllIlIIlIlIllIlIII();
   }

   private final void llIlllIIllIIIlIIIIlllIIlIllIllIIllIIlIIllllllIllllllIllIIlIIIIIIIllIlIIIIIIIIIIIlllll(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlIIIllIllIIIlIlllIIlIIlIIIllllIlIlIIIIIIIllllllIIlIllIIlIIIlIIIIlllIIIlIlIIIllIIll(int param1, char param2, short param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IlllIllllIIIlllllIIIIIlIlIIIIlIlIllIlIllIIllIIllIIlIlIlIIlIIllIIllIIIlIIllllIIIlIlllI(short param1, int param2, short param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void lIllIllIlIlIIIllIllIIIIIIIIlIlIllIIllllllIlIlllIlIllIIllIIllllIIIIIIlIlIlIllIlIllllII(int param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(long param1, boolean param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long var1, int var3) {
      var1 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var1;
      long var4 = var1 ^ 7465253837711L;
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = var3;
      this.llllIIIIIIlIllIllIlIIllIlIlIlIIIlIIIIIIIIIlIIIllIIIIlIlIlllIlIllIIIIIlIlIllIIlIIllIIl = System.currentTimeMillis();
      this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII = false;
      this.IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl = 0;
      this.IlIllllIlIIIIlIIIIIIllIlIllIlIlIIllIlIIlllIIllllllIIIIlIlIlIIlIIlIlIlIlIlIIIIIlllIIlI = -1;
      this.IIIlIIIlIlllIIllIlIllllIIlIllIllIIIIIIllIlllIlIllllIIllllIIIIlIllIlIlllIIlIlIIllIIIlI = false;
      this.llIllIIlllIlIlIIllIlllIlIllIIllllllIllllIllIIIllIllllIIIIlIIllIIIIIlIllIllIlIIIIIllIl(var4);
   }

   private final void lIlIllIIllIIllIIlllllIlIIIllIIllIIlllIllIllIIIlIIIIlIlIIllIIIIIlIIlllIIlllIlIlIlIlllI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void lIIlIlIIllIlIIIIllIllIIllIIIIIIllllIIllIIIlIlIllIlIIIlIIlIlIIIlIllIIllllllllIIlIlllII(short param1, char param2, int param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      LivingEntity param1, int param2, int param3, boolean param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(LivingEntity param1, long param2, boolean param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var1, int var3, float var4, float var5) {
      var1 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var1;
      long var6 = var1 ^ 7526510154180L;
      this.IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI = var3;
      this.lIIlIIIIlIlIIIIlllIlllllllIIllllllIIlIlIlIIlIIllllIIlIllIIlIlIlIIIlIIIlllIIIlIIlIIIll = var4;
      this.IIIlIIIlIllIIIllIllIIlIlIlIIllIIllIIIlIIIlIIlllIIIlllIIIIIIIlIlIlIlIIlIlIIlllIIIllIll = var5;
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         var4, var5, var6
      );
   }

   private final Vec3 IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(LivingEntity var1, long var2, boolean var4) {
      var2 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var2;
      long var5 = var2 ^ 101194460383784L;
      AABB var10000 = var1.getBoundingBox();
      Intrinsics.checkNotNullExpressionValue(
         var10000, lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(26966, 4323040742525407882L ^ var2)
      );
      AABB var7 = var10000;
      double var8 = var7.getYsize();

      label31: {
         try {
            if (this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1, var5)) {
               var18 = 0.46;
               break label31;
            }
         } catch (NoWhenBranchMatchedException var16) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var16, -5105860231000004988L, var2
            );
         }

         var18 = 0.54;
      }

      double var10 = var18;

      label23: {
         try {
            if (var4) {
               var19 = 2.0;
               break label23;
            }
         } catch (NoWhenBranchMatchedException var15) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var15, -5105860231000004988L, var2
            );
         }

         var19 = 1.25;
      }

      double var12 = var19;
      Vec3 var20 = var1.getDeltaMovement().scale(var12);
      Intrinsics.checkNotNullExpressionValue(
         var20, lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(25158, 7672277033732708764L ^ var2)
      );
      Vec3 var14 = var20;
      return new Vec3(var1.getX() + var14.x, var7.minY + var8 * var10, var1.getZ() + var14.z);
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(LivingEntity param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final float lIIIIlIIIIIlIlIIIllIIIIlIllllIlIllIIlIIllIlIIllllIIIlIlllIIIIIIllIllllIlIlIIlIllllIIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      short param1, LivingEntity param2, int param3, short param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      LivingEntity param1, long param2, GhostMacro.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(LivingEntity var1, long var2) {
      var2 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var2;
      long var4 = var2 ^ 53411874789442L;
      long var6 = var2 ^ 121865311385768L;
      this.lIIIlIllIlllllllIIlIIIIllIIIIIlIIllllllIIlIIIIIlIIIlIIllIIIlIIIIlIllllIIllIIlllIIlllI = var1.getId();
      IlllIlIIlllIIlIIIIIllllIIIIIlIIllllIlllIIIIlIIllIlIlIllIIlIIIIllllIlIlIllIlIlIlIIlIll.lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl(
         var6
      );
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = var1.getEyePosition();
      this.IlllIllIlllIlIlIIlIlIIlIIlIlIIIlllIllllIIIIlllIlllllIIlIlIIIIlIllllllllIIlIlIIlllllII
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var4);
   }

   private final void IlIIllIllIIIlIIIllIIllllIllIIlIIIIlllIlllIlIlIIlllllIlllIIllIIIIlllIlIlIIIllIllIIlIlI(long var1) {
      var1 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var1;
      long var3 = var1 ^ 90645663726124L;
      IlllIlIIlllIIlIIIIIllllIIIIIlIIllllIlllIIIIlIIllIlIlIllIIlIIIIllllIlIlIllIlIlIlIIlIll.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         false
      );
      me.octo.client.utils.player.pathfinder.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll();
      me.octo.client.utils.player.lIIlllIlIlllllIlIIlIllIlIllIIlllIlIllIllIIIllllllIIIlIlllIlIllIllIllllIllIlIlIlIlIIIl.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(var3);
   }

   private final void lllllIllllIlIlIIIlIlIllIlIllIIIlIIIIIllllllIllIIIIIIIlIIlllllIIIllIlllllIlIIlIllllIIl(char param1, char param2, int param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, LivingEntity param3, double param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IlIllIlIIIIlIlllIllllIIIlIllIIlllllIIIlIIlIlllIIIIlIlIlllIlIIIIIlIlIIlIlIlIlIIIIlllll(long var1) {
      var1 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var1;
      long var3 = var1 ^ 97388636438650L;
      lllIlIIllIlIIIIIllllIllIlllllIlIIIIIIlIlIllIIlIIlllIllIlllllIIIIIIlIIIIIlIllllIlllIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(var3);
   }

   private final void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(boolean param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final LivingEntity IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(boolean param1, int param2, long param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final LivingEntity IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(long var1, boolean var3) {
      var1 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var1;
      long var4 = var1 ^ 114842294004855L;
      long var6 = var1 ^ 62119762194689L;
      long var10001 = var1 ^ 92865930030058L;
      int var8 = (int)((var1 ^ 92865930030058L) >>> 48);
      int var9 = (int)((var1 ^ 92865930030058L) << 16 >>> 32);
      int var10 = (int)(var10001 << 48 >>> 48);
      long var11 = var1 ^ 68862188594131L;
      int[] var13 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -4264410464606722406L, var1
      );

      LocalPlayer var10000;
      try {
         var10000 = this.lIlIlIIIIlIIllllIlIlIIIIIlIIIIIllIIlIllIIllIllIlIIlIIIIlIIlIIIIlIlIlIlIIlIlIIIllllllI().player;
         if (var10000 == null) {
            return null;
         }
      } catch (NoWhenBranchMatchedException var26) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var26, -4219263300279330094L, var1
         );
      }

      LocalPlayer var14 = var10000;
      Object var15 = null;
      double var16 = Double.MAX_VALUE;
      Iterator var18 = this.lIIllllIlIIIIIIIlllIlIIIlIlIlIIlIlIlIIIIlIlIlIIlIIlIIlIllIlIIlIIIIIlIlllIlIllIIIlIlII.iterator();

      while (true) {
         if (!var18.hasNext()) {
            var28 = (LivingEntity)var15;
            break;
         }

         var28 = (Creeper)var18.next();
         if (var13 != null) {
            break;
         }

         Object var19 = var28;

         try {
            if (!this.IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
               (LivingEntity)var19, var3, (short)var8, var9, (short)var10
            )) {
               continue;
            }
         } catch (NoWhenBranchMatchedException var25) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var25, -4219263300279330094L, var1
            );
         }

         try {
            me.octo.client.utils.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var29 = me.octo.client.utils.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
            Vec3 var32 = var19.getEyePosition();
            Intrinsics.checkNotNullExpressionValue(
               var32, lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(30539, 1769721334867194058L ^ var1)
            );
            double var34;
            var30 = (
                     var34 = var29.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var6, var32, true)
                        - this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl
                  )
                  == 0.0
               ? 0
               : (var34 < 0.0 ? -1 : 1);
         } catch (NoWhenBranchMatchedException var22) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var22, -4219263300279330094L, var1
            );
         }

         if (var30 <= 0) {
            double var31 = Math.abs(
               (double)lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                  .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI((Entity)var19, var4)
                  .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
            );
            GhostMacro var33 = this;

            try {
               if (var31 > var33.IlIIlIlIIIIlllIIIllIIlIIlIIlIIIllllllIIlIlIIlllIIllIlllIlIlIIIlIlIIlIIIlIlIlllIIIlIIl) {
                  continue;
               }
            } catch (NoWhenBranchMatchedException var24) {
               throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                  var24, -4219263300279330094L, var1
               );
            }

            if (var14.hasLineOfSight((Entity)var19)) {
               double var20 = this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI((Creeper)var19, var11);

               try {
                  if (!(var20 < var16)) {
                     continue;
                  }
               } catch (NoWhenBranchMatchedException var23) {
                  throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                     var23, -4219263300279330094L, var1
                  );
               }

               var15 = var19;
               var16 = var20;
            }
         }
      }

      return (LivingEntity)var28;
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(boolean param1, boolean param2, long param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final List IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(long param1, byte param3, boolean param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final LivingEntity IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(long var1, boolean var3) {
      var1 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var1;
      long var4 = var1 ^ 69795617017354L;
      long var6 = var1 ^ 122557471511420L;
      long var10001 = var1 ^ 3840909986199L;
      int var8 = (int)((var1 ^ 3840909986199L) >>> 48);
      int var9 = (int)((var1 ^ 3840909986199L) << 16 >>> 32);
      int var10 = (int)(var10001 << 48 >>> 48);
      Creeper var12 = null;
      int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -1824922881117764377L, var1
      );
      double var13 = Double.MAX_VALUE;
      Iterator var15 = this.lIIllllIlIIIIIIIlllIlIIIlIlIlIIlIlIlIIIIlIlIlIIlIIlIIlIllIlIIlIIIIIlIlllIlIllIIIlIlII.iterator();
      int[] var11 = var10000;

      label50:
      while (true) {
         Iterator var27 = var15;

         while (var27.hasNext()) {
            var27 = var15;
            if (var11 == null) {
               Creeper var16 = (Creeper)var15.next();
               if (this.IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
                  (LivingEntity)var16, var3, (short)var8, var9, (short)var10
               )) {
                  me.octo.client.utils.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var28 = me.octo.client.utils.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
                  Vec3 var29 = var16.getEyePosition();
                  Intrinsics.checkNotNullExpressionValue(
                     var29, lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(26822, 6758327997182954790L ^ var1)
                  );
                  double var17 = var28.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var6, var29, true);

                  try {
                     if (var17 > this.llIlllIIIllllIIllIlIIIllIIIIlIlIllIIIIlIllIIIlIIllIlIllIIIIIlIIIlIIllIllIIIIlIIIllIIl) {
                        continue label50;
                     }
                  } catch (NoWhenBranchMatchedException var25) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var25, -1797079830771779409L, var1
                     );
                  }

                  double var19 = Math.abs(
                     (double)lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI((Entity)var16, var4)
                        .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI()
                  );

                  try {
                     if (var19 > this.IlIIlIlIIIIlllIIIllIIlIIlIIlIIIllllllIIlIlIIlllIIllIlllIlIlIIIlIlIIlIIIlIlIlllIIIlIIl) {
                        continue label50;
                     }
                  } catch (NoWhenBranchMatchedException var24) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var24, -1797079830771779409L, var1
                     );
                  }

                  double var21 = var17 + var19 / 20.0;

                  try {
                     if (!(var21 < var13)) {
                        continue label50;
                     }
                  } catch (NoWhenBranchMatchedException var23) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var23, -1797079830771779409L, var1
                     );
                  }

                  var12 = var16;
                  var13 = var21;
               }
               continue label50;
            }
         }

         return (LivingEntity)var12;
      }
   }

   private final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long param1, LivingEntity param3, boolean param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(LivingEntity param1, boolean param2, long param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      LivingEntity param1, long param2, boolean param4, GhostMacro.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(LivingEntity param1, double param2, long param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long param1, LivingEntity param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(long param1, LivingEntity param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void llIlllIlIlIlIIIIIIllIIIIIlIIllllIIIllllIIllIIIllllIlIIIIIIllIlIllllIlIIIIlIIllllIlIll(long var1) {
      var1 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var1;
      long var3 = var1 ^ 98010881466569L;
      IlllIlIIlllIIlIIIIIllllIIIIIlIIllllIlllIIIIlIIllIlIlIllIIlIIIIllllIlIlIllIlIlIlIIlIll.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
         true
      );
      this.IlIllIlIIIIlIlllIllllIIIlIllIIlllllIIIlIIlIlllIIIIlIlIlllIlIIIIIlIlIIlIlIlIlIIIIlllll(var3);
      this.IlIIlIlIllIlIlIIlIIIlllIlIIIlIlIllllIllIIlIIIlIIlllIIIIlllIIlllIllIIlIIlIlIIllIlIllII = false;
      this.IIllllIIIlllIIIIIIIIIIlllIlIIlllIllIlIIlIlIlIIllllIlIlllIlIlIllIlIlllIlIIlIIIlIllIlIl = 0;
   }

   private final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long param1, LivingEntity param3, double param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void llIllIIlllIlIlIIllIlllIlIllIIllllllIllllIllIIIllIllllIIIIlIIllIIIIIlIllIllIlIIIIIllIl(long var1) {
      var1 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var1;
      long var3 = var1 ^ 56484616569408L;
      this.lIIIlIlIlIllllIllIIIIIlIlIllIIIIlIlIllllIIllllIIIlIllllIllIlIlIlllIllIlIIlIIIlIIIIlIl = -1;
      this.IIIIlllIIlIIIIIlIIlIlIllIlIIIIlIllIllIlIlIIIlIIIIIIllIIIIllIllllllllIlllllIIllllIlIll
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var3);
      this.lIlllIllllllIlIIlIllIlIllIlIIlIIlIlllIlIIllIlIIIIIlIlIIIIllllIIIIllIllIllIllIlIIIIIII
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var3);
      this.llIIIllllIIIIIIIllIIIlIIlIIIIllIllIlIIllIIIIllllIlIlIllIlIlIllIlIlIIIlllllIIlIIIIIIIl = 0;
   }

   private final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(LivingEntity var1, double var2, long var4) {
      var4 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var4;
      long var6 = var4 ^ 41713371649802L;
      this.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var1, var6, var2);
   }

   private final void lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(LivingEntity param1, long param2, double param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
      short param1, char param2, int param3, LivingEntity param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final double lIIllllIIlllIIllllllIIIIlIIIIlIIIllIIlIIIllllIlIllIIllIlllIlIIIllIlIllIIlIIIlIIIIIIII(char param1, int param2, int param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(long param1, LivingEntity param3, double param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(LivingEntity param1, long param2, double param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean[] IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      Vec3 param1, Vec3 param2, boolean param3, long param4, boolean param6, boolean param7
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final double IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      double param1, double param3, double param5, double param7, double param9, long param11
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(LivingEntity param1, long param2, double param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(LivingEntity param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final LivingEntity IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(
      LivingEntity param1, double param2, long param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIlIllIllIllIlIIIlIIllIllllIIlIIlIIIIIIllllIlIllIIIIIlllIIIlIIIlIIIlIIlIlllIlIIIlllll(int param1, int param2, char param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(boolean param1, long param2, char param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final LivingEntity lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(boolean param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final double IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Creeper param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final GhostMacro.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll lIIlIIllIIllIlIllIIlIIlIIIIIlIlIlIIlIlIIIIIIllIllIIIlIIllllIlllllIllIlllIlIlIllIllIII(
      long param1, byte param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean lllllIIlIIlIlllIIlllIlIlIlIIIlIIIlIlIllIIlIlIIlllIIllllIIllIlIllIlIlIIIIIllllIllIIlII(char var1, int var2, int var3) {
      long var4 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48)
         ^ lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl;
      long var6 = var4 ^ 112531566096955L;
      return lIllIllllIllIllIlIlIllllIllllIIIIIIIllIlIlIIllllllIlllIlIllIllllIlIlllIllIIllIllIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII()
         .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
            lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(14430, 707507202985171529L ^ var4), var6
         );
   }

   private final boolean IlIlIIlIlllIIlIllIIlIlIlIllllllIlllIllIlIlIllIlIlIIlIIIllllllIlIllIllIIIIIlIlIIIllIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Creeper param1, long param2, boolean param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      char param1, int param2, Creeper param3, int param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      Creeper param1, int param2, int param3, int param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
      LivingEntity param1, boolean param2, short param3, int param4, short param5
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long param1, Creeper param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void lIIlIIIllIlllIlIIlIlIIIllllllIlIIlIIlIIIlIIIlllIIIIIlllIIlllIIllllIlllIlIIlIlIllIlIII() {
      int var1 = this.IlIIlllIlIlIIllIIIIlIIllIIIIllIlIlllIIlllIlllIIlllIlIIlIIllIlllllIIIIlIIIIIllllllIIIl++;
      this.llIIIllllIIIllIlIlIlIIllIIIlIllIIIllIlIlIIllIIIlIIlIIIIIlIIIIllIlllIlllIIIlIlIlIIIIlI = CollectionsKt.emptyList();
      this.IlIllIIlIIlIlIIlIlIllIIIlllIlllllIlIIIIIlIlIlIIllllllIIlIIIlIllIIIIIIIIlIIlllIIIIllIl = -1;
      this.lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI = false;
      this.lIIIlIllIlllllllIIlIIIIllIIIIIlIIllllllIIlIIIIIlIIIlIIllIIIlIIIIlIllllIIllIIlllIIlllI = -1;
      this.IIllIIIIIIllIlIlIIllIlIlIllIIIIlllIllllllIlllllIIlIIIlllIlIIIllIIIlIIIlllIllIIlIllllI = -1;
   }

   private final boolean llIlIlIIIllIIllIIIIlllIIIlllIIllIllIlllllIIIlIllIIlIllllIlIIIIIlIIllIllIIllIIIlIIIllI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      short param1, int param2, int param3, char param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(long param1, LivingEntity param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final LivingEntity IIIlIllllIlIlllIllllIllllIlIllIllIllIlIIlIIlIIIIllIIIllIIIIlIIIIlIllIIlllIIIlIllllIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(long param1, LivingEntity param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, LivingEntity param3, float param4) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(LivingEntity var1, long var2, double var4) {
      var2 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var2;
      long var6 = var2 ^ 62865027423847L;
      int[] var8 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -8382943187585717790L, var2
      );

      LocalPlayer var10000;
      try {
         var10000 = this.lIlIlIIIIlIIllllIlIlIIIIIlIIIIIllIIlIllIIllIllIlIIlIIIIlIIlIIIIlIlIlIlIIlIlIIIllllllI().player;
         if (var10000 == null) {
            return false;
         }
      } catch (NoWhenBranchMatchedException var15) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var15, -8499943201526360662L, var2
         );
      }

      LocalPlayer var9 = var10000;

      label56: {
         try {
            boolean var17 = this.IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(var6, var1);
            if (var8 != null) {
               return var17;
            }

            if (!var17) {
               break label56;
            }
         } catch (NoWhenBranchMatchedException var14) {
            throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
               var14, -8499943201526360662L, var2
            );
         }

         return true;
      }

      AABB var18 = var1.getBoundingBox().inflate(var4);
      Intrinsics.checkNotNullExpressionValue(
         var18, lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(31586, 3265210645741974425L ^ var2)
      );
      AABB var10 = var18;

      try {
         if (var10.contains(var9.getEyePosition())) {
            return true;
         }
      } catch (NoWhenBranchMatchedException var13) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var13, -8499943201526360662L, var2
         );
      }

      Vec3 var19 = var9.getEyePosition();
      Intrinsics.checkNotNullExpressionValue(
         var19, lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(30539, 1769731027316785074L ^ var2)
      );
      Vec3 var11 = var19;
      Vec3 var20 = var11.add(var9.getLookAngle().scale(this.lIIlIIIIIIIIIIlIlllIlIlIIlllIlIllIIIIIlllIlIlIlllIIIlIlllllllllllllllllllIIIllIIIlIIl + 0.5));
      Intrinsics.checkNotNullExpressionValue(
         var20, lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(8903, 4276951446132615681L ^ var2)
      );
      Vec3 var12 = var20;
      return var10.clip(var11, var12).isPresent();
   }

   private final void IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long param1, int param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(int param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void lIIllIlIlIIlIlIIIIllIllIIIIIIlIIlIIIIIIllIIIIlIllIlllIIIIlIllIlIIllllllIIlIIIIlIIIlII(long var1) {
      var1 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var1;
      long var3 = var1 ^ 133633501274378L;
      long var5 = System.currentTimeMillis();
      this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII
         .entrySet()
         .removeIf(GhostMacro::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI);
   }

   private final int llIIIIllIllllIlllIIIIIlIIIIIlIIlIlIllIIllIlIllIIIIlIllIIIlIIlIIlIIIllIIIlllIllllIIIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean llIIlIllllIlIIIIIIIIIIlllllIIIIlIIllIlllllIlIllIlIIIIlIIlllllllIllIIIllIlIlllIIllIIlI(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIllllIIIlIlIlIlIlIIlllIllIIIIIIIllllIlllllIIlIllIlllllIIIIIlllIllIlIIlIllIIlIIlIIIl(long var1, byte var3) {
      long var4 = (var1 << 8 | (long)var3 << 56 >>> 56) ^ lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl;
      long var6 = var4 ^ 127265966081688L;
      this.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll.MOVE,
         var6
      );
      this.IlIllIlIIIIIIIIllIlIIlIllllIIIIIlIlllIllllIIIlllIlIllllIlIllIIIIIIIlIllIlIIllIIIIIlll = 0;
   }

   private final void lIIlIIllIIlIlIIIIlIIIlIIIllIIlIIllIlIIIIIlIlIlllIIlIlIIIIIlllllIlllllIllIIlllIllIIlIl(byte var1, long var2) {
      long var4 = ((long)var1 << 56 | var2 << 8 >>> 8) ^ lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl;
      long var6 = var4 ^ 109448556927245L;
      this.IIIlllllllllllllIIlIlllIllIlIIlIIlIllIlIIIlIlIlIIIIIllIlIlllIIlIIIIIllIIIIlIllllIIlIl = IIIIIIlIIIlIIIIllIllIlIllIIIIIIlIIIllIllllllIIIllllIlIIlIlIIIlllIIIIllllIIIIlIIIllllI.llIlIIlIlIIllIlIIIlIIlIlIIIlIlIIIIIIIIIllllIlIllIIlIIlIllIIIIIIlIlIllIIIllIlllllIlllI
         .lIIlIllIlllIIIlllIIllIIlIllIllIllIIIIIllllllIllIllllIIIIlllIllIlIIIIlIIlIlllIlIIIllll(var6);
      this.IlIllIlIIIIIIIIllIlIIlIllllIIIIIlIlllIllllIIIlllIlIllllIlIllIIIIIIIlIllIlIIllIIIIIlll = 0;
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      short var1, int var2, int var3, me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var4
   ) {
      long var5 = ((long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48)
         ^ lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl;
      long var10001 = var5 ^ 98183392276552L;
      int var7 = (int)((var5 ^ 98183392276552L) >>> 48);
      int var8 = (int)((var5 ^ 98183392276552L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      var10001 = var5 ^ 64586552993991L;
      int var10 = (int)((var5 ^ 64586552993991L) >>> 32);
      int var11 = (int)((var5 ^ 64586552993991L) << 32 >>> 48);
      int var12 = (int)(var10001 << 48 >>> 48);
      var10001 = var5 ^ 101250758749629L;
      int var13 = (int)((var5 ^ 101250758749629L) >>> 32);
      int var14 = (int)((var5 ^ 101250758749629L) << 32 >>> 48);
      int var15 = (int)(var10001 << 48 >>> 48);
      IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl var10000 = this.IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII();
      IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var16 = new IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.DWARVEN_FORGE,
         GhostMacro::IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl,
         var4.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(),
         0,
         0,
         0L,
         0,
         GhostMacro::IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll,
         120,
         null
      );
      var10000.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10, (short)var11, var16, (short)var12);
   }

   private final void IIIIIIllIIIlIlIIlIIIlllIlllllIIIIIlIIllIIIIIlIIIIIlIIlIlllIIlIIlllIlIIIIlIIIllllllllI(long var1) {
      var1 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var1;
      long var3 = var1 ^ 84806601232154L;
      long var5 = var1 ^ 101295488765235L;
      long var7 = var1 ^ 3493074955028L;
      long var9 = var1 ^ 4608973381760L;
      this.lIlIIIIIlIlIIIllIIIIlIlIllllllllllIIIIIIIIIIllIIlIlIIIlllIllIIlIIIlllIlIlIlIlllllIlII = false;
      this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI = GhostMacro.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.SCAN;
      this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI = -1;
      this.lIIIlIllIlllllllIIlIIIIllIIIIIlIIllllllIIlIIIIIlIIIlIIllIIIlIIIIlIllllIIllIIlllIIlllI = -1;
      this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII = null;
      this.lIllllIIllllIlIIlllIIIlIIIlIllIIlIIIlllIlIIIllIIIIIIIlIIIIIIIlIllIIIlIIIlIIIIIIlIIlIl = false;
      this.lllIlIlllIIlIIIllIIlIIllllllllIIlllIlIIllIlIIIIlIlllIIlIIIIlIIlIIIIIIlllIIlllIlIlIlII = null;
      this.IIIlIIIIIlllllIIllIIIlIIlIIlIIIIlIllIIIIlIllIlIIlIIIIlIlIIlIllIlllIIlIlIIlllIIIIIllII();
      this.lIIlIIIllIlllIlIIlIlIIIllllllIlIIlIIlIIIlIIIlllIIIIIlllIIlllIIllllIlllIlIIlIlIllIlIII();
      IlllIlIIlllIIlIIIIIllllIIIIIlIIllllIlllIIIIlIIllIlIlIllIIlIIIIllllIlIlIllIlIlIlIIlIll.lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl(
         var5
      );
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
         .lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(var9);
      MovementUtils.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll(var3);
      this.IlIllIlIIIIlIlllIllllIIIlIllIIlllllIIIlIIlIlllIIIIlIlIlllIlIIIIIlIlIIlIlIlIlIIIIlllll(var7);
   }

   @Override
   public boolean llIIllllllIIllIlIlllIIlIIIIIIllIlIIIlIlIlIIIlIIIIllIIlIllIIlIIllIIIIlIIIIIllIIIllIlII() {
      return this.IllllIIIIIllllIllIllIIIllllIlIIlIIIllIllIlIIlIllIIllllIIIlIIllllIllllIIlIlllIllIIlllI;
   }

   @Override
   public void IlIlIIIIllllIlIIlIlllllllllIlllIllIlIIIIllIIlIIlIlIlIIlllIIlIlllllIIIlIIlIIlIIlIIlIII(long var1) {
      long var3 = var1 ^ 28938843279206L;
      long var5 = var1 ^ 0L;
      long var7 = var1 ^ 101121323573131L;
      this.IIIIIIllIIIlIlIIlIIIlllIlllllIIIIIlIIllIIIIIlIIIIIlIIlIlllIIlIIlllIlIIIIlIIIllllllllI(var3);
      this.IlIIllIllIIIlIIIllIIllllIllIIlIIIIlllIlllIlIlIIlllllIlllIIllIIIIlllIlIlIIIllIllIIlIlI(var7);
      super.IlIlIIIIllllIlIIlIlllllllllIlllIllIlIIIIllIIlIIlIlIlIIlllIIlIlllllIIIlIIlIIlIIlIIlIII(var5);
   }

   private final void IIlIIIIIIllIlIlIlllllllIIIIIIIlllIlIIlIlllIIlIlIlIIllIlllllIlllIIllllIlIIlllIIlIlIIll(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void lIIllllIlllIIIllIlIIIllIIlIIllIlllIIllIIlIIlIlIllIIlllIIlllllIIIllIllllIllllIlIIIIIll(short param1, long param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IlIIIlllIIIIIIlIIIllllllIllIlllIIIIIllIlIIIIlIlllIllllIIllIIlIIllllllIlIIIIIIIIIlIlIl(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long param1, BlockPos param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlIIIIIlllllIIllIIIlIIlIIlIIIIlIllIIIIlIllIlIIlIIIIlIlIIlIllIlllIIlIlIIlllIIIIIllII() {
      int var1 = this.IlIlIlllIlllIIlIlIIIIIIllIIlIIIIIllIIlIlIlIIIIlIIIlIIIIlIlIllIlIIIIlIIIlIllllIIllllIl++;
      this.IllIlIIllIlIIlIIIllIIlllIlIlIlllllIIlllllIIIlIlIlllIlIlIllIIIIIllIlIlllllIIIIIlllllll = false;
      this.lIIlIllllIlllllIllIIIIlIIIlllIIlIIIllIIlIIllIIIlIIIIlIIllllIlIIIIIlIlIllIIllIlIIIIIIl = null;
      this.lIlllIllllIIllIIIIllIIIIIlllIIlIIIIllllIllIlIlIIlIlIlIIlIIllIlllllIlIIIlIIlllIIlllIII = null;
      this.IllIIIllIIllIlIIllIIlIIIIIllIlllIlllllIIIIlIIIIlIIIIlIIlIlIlIIIlIIllIlIlIlIlIllIIlllI = null;
   }

   private final BlockPos llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      char param1, BlockPos param2, int param3, int param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final double IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Vec3 var1, long var2, Vec3 var4) {
      var2 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var2;
      long var5 = var2 ^ 100501393318556L;
      long var10001 = var2 ^ 62774418416898L;
      int var7 = (int)((var2 ^ 62774418416898L) >>> 48);
      int var8 = (int)((var2 ^ 62774418416898L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);

      LocalPlayer var10000;
      try {
         var10000 = this.lIlIlIIIIlIIllllIlIlIIIIIlIIIIIllIIlIllIIllIllIlIIlIIIIlIIlIIIIlIlIlIlIIlIlIIIllllllI().player;
         if (var10000 == null) {
            return 50.0;
         }
      } catch (NoWhenBranchMatchedException var12) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var12, -7779655025812091991L, var2
         );
      }

      LocalPlayer var10 = var10000;
      float var11 = lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var1, var5, var4)
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI();
      return Math.abs(
         (double)lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var11 - var10.getYRot(), (char)var7, var8, (char)var9)
      );
   }

   private final double llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long param1, double param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(
      int param1, int param2, int param3, BlockPos param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final double IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(BlockPos param1, char param2, long param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @SubscribeEvent
   public final void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      @NotNull llIlIllIllIllIlIllllIIlIlllIIIlllIlIllIllIIlIIIlIIlIIllllllIIlIlIIllIIIlIlIllIIllIllI eventArg
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   @Override
   public void IIllIllIIlIIIlIlllIlIlllIIIlllIIIlIIIIIIIIllIlIIlIIIIllllllIllIIlllIIlIIIIIlIllllllIl(char var1, int var2, int var3) {
      long var4 = (long)var1 << 48 | (long)var2 << 32 >>> 16 | (long)var3 << 48 >>> 48;
      long var6 = var4 ^ 38693911105680L;
      int var8 = (int)((var4 ^ 47260476692685L) >>> 32);
      long var9 = (var4 ^ 47260476692685L) << 32 >>> 32;
      long var11 = var4 ^ 15536881857150L;
      long var13 = var4 ^ 140408614910228L;
      long var15 = var4 ^ 16406806265912L;
      long var10001 = var4 ^ 128640377461893L;
      int var17 = (int)((var4 ^ 128640377461893L) >>> 32);
      int var18 = (int)((var4 ^ 128640377461893L) << 32 >>> 48);
      int var19 = (int)(var10001 << 48 >>> 48);
      long var20 = var4 ^ 82900764129601L;
      long var22 = var4 ^ 109118802936316L;
      lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl,
         lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(24768, 7506689017199327194L ^ var4),
         var13,
         0,
         2,
         null
      );
      lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            GhostMacro::IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl,
            IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI<"p">(15674, 8610210660173273304L ^ var4),
            0,
            var15
         );
      lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            GhostMacro::IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI,
            IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI<"p">(18641, 7775372888726646069L ^ var4),
            0,
            var15
         );
      lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            GhostMacro::IIIlIlIlIlIIlIIllllIlllIIIIlIIIIIlIlIIllIlllIlIlIlllIIIIIllIllIIIIIlIIIlIIIlIIlllIllI,
            IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI<"p">(18641, 7775372888726646069L ^ var4),
            0,
            var15
         );
      lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            GhostMacro::IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII,
            IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI<"p">(18641, 7775372888726646069L ^ var4),
            0,
            var15
         );
      lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            GhostMacro::IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII,
            IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI<"p">(18641, 7775372888726646069L ^ var4),
            0,
            var15
         );
      lIIlIlIlIIlllllIlIlIIllIllIIllIllIIIIIllIlIlIllIIIIlIlllIlIIlIIIlIIlllIIlIlllIIlIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            GhostMacro::IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI,
            IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI<"p">(18641, 7775372888726646069L ^ var4),
            0,
            var15
         );
   }

   private final GhostMacro.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll lIlIIIIlIlIIIllIllIlIIIIIIlllllIIIIllllllIllIllllIIlIIIlIlllllllIllIIlIIlllllllIIllll(
      long var1
   ) {
      var1 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var1;
      long var3 = var1 ^ 45252853087902L;
      return new GhostMacro.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
         this.IllIllIIllIIIIlIIlIlIIlIllIIIlIIlllIlIllIIlIlIIlllllIIIlIlIlIllIIIIIIlIlIIIIlllIllllI,
         this.llIlllIlIIllIlIllIIIIIIlllllIlIlIllIlIllIIIlIIIIIlIllIlIllIIIlllIllIlIIIllIllIIlIlllI,
         this.lIIIlIllIlllllllIIlIIIIllIIIIIlIIllllllIIlIIIIIlIIIlIIllIIIlIIIIlIllllIIllIIlllIIlllI,
         this.lIIIIIlIlIIIIIIlIIlIIIlIlIIIllIlIIlIlIlllIllIllIIIlIlIllIlIlIlIIIIIIIIIllIIIlIIIIllII,
         IlllIlIIlllIIlIIIIIllllIIIIIlIIllllIlllIIIIlIIllIlIlIllIIlIIIIllllIlIlIllIlIlIlIIlIll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(),
         IlllIlIIlllIIlIIIIIllllIIIIIlIIllllIlllIIIIlIIllIlIlIllIIlIIIIllllIlIlIllIlIlIlIIlIll.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(),
         IlllIlIIlllIIlIIIIIllllIIIIIlIIllllIlllIIIIlIIllIlIlIllIIlIIIIllllIlIlIllIlIlIlIIlIll.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(),
         this.lIllllIIllllIlIIlllIIIlIIIlIllIIlIIIlllIlIIIllIIIIIIIlIIIIIIIlIllIIIlIIIlIIIIIIlIIlIl,
         this.lllIlIlllIIlIIIllIIlIIllllllllIIlllIlIIllIlIIIIlIlllIIlIIIIlIIlIIIIIIlllIIlllIlIlIlII,
         this.lIIllllIlIIIIIIIlllIlIIIlIlIlIIlIlIlIIIIlIlIlIIlIIlIIlIllIlIIlIIIIIlIlllIlIllIIIlIlII.size(),
         this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII.size(),
         this.llIIIllllIIIllIlIlIlIIllIIIlIllIIIllIlIlIIllIIIlIIlIIIIIlIIIIllIlllIlllIIIlIlIlIIIIlI.size(),
         this.lIIlIllIlIlIIlllIlIlIlIIIIIIIIIllIIIIllIIIIIIlIIIIIIIlIlIIllllIIIlllIIlIlllIllIllIllI,
         this.IllIlIIllIlIIlIIIllIIlllIlIlIlllllIIlllllIIIlIlIlllIlIlIllIIIIIllIlIlllllIIIIIlllllll,
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            this, 0.0, 1, var3, null
         )
      );
   }

   private static final boolean lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(long param0, int param2, Creeper param3) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final boolean IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(long param0, Creeper param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final long IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(GhostMacro var0, char var1, long var2) {
      long var4 = ((long)var1 << 48 | var2 << 16 >>> 16) ^ lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl;
      return var0.lIllIIIIlllIllllIlIllIIlIllllIllIIllIllIIllIIIIllIllIIIlIllIllllIIIIllIIlllllllIlIIll()
            .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI()
         + IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl<"a">(21491, 8322683934434499422L ^ var4);
   }

   private static final Object llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(GhostMacro var0) {
      return TuplesKt.to(
         var0.lIllIIIIlllIllllIlIllIIlIllllIllIIllIllIIllIIIIllIllIIIlIllIllllIIIIllIIlllllllIlIIll().getLocation(),
         me.octo.client.utils.skyblock.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI()
      );
   }

   private static final Object IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(long var0, GhostMacro var2) {
      var0 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var0;
      long var3 = var0 ^ 97140754694556L;
      return new GhostMacro.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
         var2.IlIllIlIIIIIIIIllIlIIlIllllIIIIIlIlllIllllIIIlllIlIllllIlIllIIIIIIIlIllIlIIllIIIIIlll,
         var2.IIIlllllllllllllIIlIlllIllIlIIlIIlIllIlIIIlIlIlIIIIIllIlIlllIIlIIIIIllIIIIlIllllIIlIl.size(),
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
            .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
            .IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(),
         me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            var2, 0.0, 1, var3, null
         )
      );
   }

   private static final Object IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(long var0, GhostMacro var2) {
      var0 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var0;
      long var3 = var0 ^ 123108833398844L;
      return var2.lIlIIIIlIlIIIllIllIlIIIIIIlllllIIIIllllllIllIllllIIlIIIlIlllllllIllIIlIIlllllllIIllll(var3);
   }

   private static final Object lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(GhostMacro var0) {
      return new GhostMacro.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(
         var0.IllIIllIllIIIlIIIIIIIIIlIlllIllIIllIlIllIlIlllllllllIlllIIlIllIlIllIlIlIllIIlIIIIlIlI,
         var0.lIllllIIlIlIIIlIIIllIIIIIllIIIIlllIlIIIlIlIIIIlIlIIIIllIIIIlIlIIIIlIIIIllIlIIllIIllIl,
         var0.IIlllIIIllIlIIIlllIIlllIIllIlIIIIlllIlllIllIllIllIllllllllllllllIlIllllIIllIIIIlIlIll,
         var0.lIlIIIIIIIllIlllIlIlIIIIIIIIlllllIIlllIIllIlllIIIlIIlllIlllIllIIlIllIIIlIllllllIIllII
      );
   }

   private static final boolean IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(long param0, GhostMacro param2) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final boolean IlllIIlIIllIIlIllllIllIIlllIIIlIllllIIlllIllIIIIlIIIlIIlIlIIlIlIllIIIIIIllIIlIIIllllI(long var0) {
      var0 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var0;
      long var2 = var0 ^ 110693747015949L;
      return Scheduler.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var2);
   }

   private static final boolean IlIlllIIIlIlIlIIIIIllIIIIlIlIIlIlIlIIIIIlllllllIlIllIlIIlIIIIlIIllllIIIllIlIIlllIllIl(long var0) {
      var0 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var0;
      long var2 = var0 ^ 8823114096959L;
      return me.octo.client.modules.helpers.general.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var2);
   }

   private static final boolean IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(
      int param0, GhostMacro param1, char param2, int param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final Unit IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(long var0, GhostMacro var2) {
      var0 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var0;
      long var3 = var0 ^ 50394782632218L;

      try {
         if (me.octo.client.utils.skyblock.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI()
            != me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.DWARVEN_FORGE) {
            var2.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               var3, me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.DWARVEN_FORGE, 2000
            );
         }
      } catch (NoWhenBranchMatchedException var5) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var5, -4413727216592282337L, var0
         );
      }

      return Unit.INSTANCE;
   }

   private static final Unit IIllIIllIlIlIlIllIIlllIIIIlIIIllllllIIIlIllIlllIllIIIlIllIlllIIlIlIIllIIIllIIlllIllIl(long var0) {
      var0 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var0;
      long var2 = var0 ^ 93827790798074L;
      me.octo.client.utils.skyblock.mining.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
         .llIIIllIIIIllllllIIIlIIIIIIIlllIIllllIlllIlIlIIlIIIIlIIIlllllIIllIllllllIlIIlIIlIlIII(var2);
      return Unit.INSTANCE;
   }

   private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      long param0, short param2, LivingEntity param3, Creeper param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      GhostMacro var0, long var1, boolean var3, Creeper var4
   ) {
      var1 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var1;
      long var10001 = var1 ^ 91772339928030L;
      int var5 = (int)((var1 ^ 91772339928030L) >>> 48);
      int var6 = (int)((var1 ^ 91772339928030L) << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var4, lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(10987, 4448946755042475369L ^ var1)
      );
      return var0.IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
         (LivingEntity)var4, var3, (short)var5, var6, (short)var7
      );
   }

   // $VF: Extended synchronized range to monitorexit
   private static final GhostMacro.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(
      long var0, Creeper var2
   ) {
      var0 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var0;
      long var3 = var0 ^ 4824196192932L;
      Intrinsics.checkNotNullParameter(
         var2, lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(25077, 7360497906140590826L ^ var0)
      );
      me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI var6 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      BlockPos var10000;
      synchronized (var6) {
         boolean var7 = false;
         BlockPos var12 = me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
            .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var3, (Entity)var2);
         var10000 = var12;
      }

      try {
         if (var10000 == null) {
            return null;
         }
      } catch (NoWhenBranchMatchedException var10) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var10, 1265894116564979249L, var0
         );
      }

      BlockPos var5 = var10000;
      return new GhostMacro.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var2.getId(), var5);
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      List param0, Vec3 param1, long param2, GhostMacro param4, int param5, int param6, BlockPos param7
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var0, GhostMacro var2, Creeper var3) {
      var0 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var0;
      long var4 = var0 ^ 66757237131639L;
      int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         5908984574912426059L, var0
      );
      Intrinsics.checkNotNullParameter(
         var3, lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(25840, 800182651299329418L ^ var0)
      );
      int[] var6 = var10000;

      try {
         boolean var9 = var2.lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(var3.getId(), var4);
         if (var6 != null) {
            return var9;
         }

         if (!var9) {
            return true;
         }
      } catch (NoWhenBranchMatchedException var7) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var7, 6026661883296123907L, var0
         );
      }

      return false;
   }

   private static final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long param0, LivingEntity param2, Creeper param3
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
      long var0, GhostMacro var2, int var3, Creeper var4
   ) {
      long var5 = (var0 << 32 | (long)var3 << 32 >>> 32) ^ lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl;
      long var10001 = var5 ^ 57191068357164L;
      int var7 = (int)((var5 ^ 57191068357164L) >>> 32);
      int var8 = (int)((var5 ^ 57191068357164L) << 32 >>> 48);
      int var9 = (int)(var10001 << 48 >>> 48);
      Intrinsics.checkNotNullParameter(
         var4, lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(10987, 4448891475468243390L ^ var5)
      );
      return var2.IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII(var4, var7, var8, var9);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      LocalPlayer var0, long var1, float var3, double var4, Creeper var6
   ) {
      var1 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var1;
      long var7 = var1 ^ 121784591684320L;
      Intrinsics.checkNotNullParameter(
         var6, lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(25077, 7360517284092249870L ^ var1)
      );
      int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         2726584846209222557L, var1
      );
      lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI var10001 = lllIlIIIIllIIIlIllIllIlIIlIllIIlIlllIIlllIlIllIllIllIIIlllIIlIIIlIIIlIllIlllIIllIIIlI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      Vec3 var10002 = var0.getEyePosition();
      Intrinsics.checkNotNullExpressionValue(
         var10002, lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(30539, 1769724521744142797L ^ var1)
      );
      Vec3 var10003 = var6.getEyePosition();
      Intrinsics.checkNotNullExpressionValue(
         var10003, lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(30539, 1769724521744142797L ^ var1)
      );
      float var10 = var10001.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10002, var7, var10003)
         .IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI();
      int[] var9 = var10000;
      float var11 = var10 - var3;

      label61: {
         label60: {
            float var14;
            label59:
            while (true) {
               float var19;
               if (var11 > 180.0F) {
                  float var13 = var11 - 360.0F;
                  if (var9 == null) {
                     var11 = var13;
                     continue;
                  }

                  var19 = var13;
               } else {
                  var19 = var11;
               }

               while (true) {
                  try {
                     if (!(var19 < -180.0F)) {
                        break label60;
                     }

                     var14 = var11;
                     if (var9 != null) {
                        break label59;
                     }

                     var20 = var11;
                  } catch (NoWhenBranchMatchedException var17) {
                     throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
                        var17, 2627051432987720661L, var1
                     );
                  }

                  var11 = var20 + 360.0F;
                  var19 = var11;
               }
            }

            var21 = var14;
            break label61;
         }

         var21 = Math.abs(var11);
      }

      float var12 = var21;

      try {
         double var23;
         int var15 = (var23 = var12 - var4) == 0.0 ? 0 : (var23 < 0.0 ? -1 : 1);
         if (var9 != null) {
            return (boolean)var15;
         }

         if (var15 <= 0) {
            return (boolean)1;
         }
      } catch (NoWhenBranchMatchedException var16) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var16, 2627051432987720661L, var1
         );
      }

      return (boolean)0;
   }

   private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(double var0, long var2, Creeper var4) {
      var2 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var2;
      long var5 = var2 ^ 28235642351194L;
      int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -7238722110538040895L, var2
      );
      Intrinsics.checkNotNullParameter(
         var4, lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(22440, 5574308442538938199L ^ var2)
      );
      int[] var7 = var10000;
      me.octo.client.utils.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var12 = me.octo.client.utils.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      Vec3 var10001 = var4.getEyePosition();
      Intrinsics.checkNotNullExpressionValue(
         var10001, lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(30539, 1769758505742708625L ^ var2)
      );
      double var8 = var12.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var5, var10001, true);

      try {
         double var14;
         int var13 = (var14 = var8 - (var0 - 1.0)) == 0.0 ? 0 : (var14 < 0.0 ? -1 : 1);
         if (var7 != null) {
            return (boolean)var13;
         }

         if (var13 < 0) {
            return (boolean)1;
         }
      } catch (NoWhenBranchMatchedException var10) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var10, -7338321252513790583L, var2
         );
      }

      return (boolean)0;
   }

   private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(long var0, long var2, Entry var4) {
      var0 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var0;
      int[] var10000 = lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
         -3662688141487870112L, var0
      );
      Intrinsics.checkNotNullParameter(
         var4, lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(10987, 4448873969401930919L ^ var0)
      );
      int[] var5 = var10000;

      try {
         long var9;
         int var8 = (var9 = ((Number)var4.getValue()).longValue() - var2) == 0L ? 0 : (var9 < 0L ? -1 : 1);
         if (var5 != null) {
            return (boolean)var8;
         }

         if (var8 <= 0) {
            return (boolean)1;
         }
      } catch (NoWhenBranchMatchedException var6) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var6, -3708595897161084120L, var0
         );
      }

      return (boolean)0;
   }

   private static final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(Function1 var0, Object var1) {
      return (Boolean)var0.invoke(var1);
   }

   private static final Unit IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(
      char var0, int var1, int var2, GhostMacro var3
   ) {
      long var4 = ((long)var0 << 48 | (long)var1 << 32 >>> 16 | (long)var2 << 48 >>> 48)
         ^ lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl;
      int var6 = (int)((var4 ^ 9141039598272L) >>> 56);
      long var7 = (var4 ^ 9141039598272L) << 8 >>> 8;
      long var9 = (var4 ^ 7877620050361L) >>> 8;
      int var11 = (int)((var4 ^ 7877620050361L) << 56 >>> 56);
      var3.lIIlIIllIIlIlIIIIlIIIlIIIllIIlIIllIlIIIIIlIlIlllIIlIlIIIIIlllllIlllllIllIIlllIllIIlIl((byte)var6, var7);
      var3.IIIllllIIIlIlIlIlIlIIlllIllIIIIIIIllllIlllllIIlIllIlllllIIIIIlllIllIlIIlIllIIlIIlIIIl(var9, (byte)var11);
      return Unit.INSTANCE;
   }

   private static final Unit IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(
      int var0, int var1, char var2, GhostMacro var3
   ) {
      long var4 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48)
         ^ lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl;
      long var6 = var4 ^ 78043791083436L;
      var3.IIIIIIllIIIlIlIIlIIIlllIlllllIIIIIlIIllIIIIIlIIIIIlIIlIlllIIlIIlllIlIIIIlIIIllllllllI(var6);
      return Unit.INSTANCE;
   }

   private static final Unit IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      char param0, int param1, GhostMacro param2, int param3, BlockPos param4, int param5, BlockPos param6
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private static final Unit lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl(GhostMacro var0, long var1) {
      var1 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var1;
      long var3 = var1 ^ 105643356485860L;

      try {
         if (me.octo.client.utils.skyblock.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI
               .IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI()
            == me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.DWARVEN_FORGE) {
            return Unit.INSTANCE;
         }
      } catch (NoWhenBranchMatchedException var5) {
         throw lIIIllIIIllllIIllIlIlIlIllIIlIlllIIlIllIllIIlIlIIlIIIIlIIlIlIIlllIIlIIlIIlllIIlIllllI.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"Î">(
            var5, -5530130366382641951L, var1
         );
      }

      var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         var3, me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.DWARVEN_FORGE, 3000
      );
      return Unit.INSTANCE;
   }

   private static final String IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl(long var0, GhostMacro var2) {
      var0 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var0;
      String var10000 = var2.IlIIIIIIlIIllIIIIlIllllIllIIlIlIllIIIllIIIIIllllIlllllllIIIlIllllIIlIIlIlIlIlIIIIllll().id;
      return lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(19959, 6860829825555325716L ^ var0) + var10000;
   }

   private static final String IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI(GhostMacro var0, long var1) {
      var1 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var1;
      int var10000 = var0.IllIIllIllIIIlIIIIIIIIIlIlllIllIIllIlIllIlIlllllllllIlllIIlIllIlIllIlIlIllIIlIIIIlIlI;
      return lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(21364, 5757444615239945848L ^ var1) + var10000;
   }

   private static final String IIIlIlIlIlIIlIIllllIlllIIIIlIIIIIlIlIIllIlllIlIlIlllIIIIIllIllIIIIIlIIIlIIIlIIlllIllI(long var0) {
      var0 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var0;
      long var10001 = var0 ^ 102631088101770L;
      int var2 = (int)((var0 ^ 102631088101770L) >>> 48);
      int var3 = (int)((var0 ^ 102631088101770L) << 16 >>> 48);
      int var4 = (int)(var10001 << 32 >>> 32);
      var10001 = var0 ^ 126248305459198L;
      int var5 = (int)((var0 ^ 126248305459198L) >>> 48);
      int var6 = (int)((var0 ^ 126248305459198L) << 16 >>> 32);
      int var7 = (int)(var10001 << 48 >>> 48);
      return lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(30421, 6781023346348341945L ^ var0)
         + me.octo.client.utils.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
            (char)var2,
            (short)var3,
            llIlIIIIlIlllIIllllIIllIllIIIlIIIIIIIlIIIllIIllIllllllllllIllIIIllIlIlIlIlIIlIIIllIII.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               .llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
                  lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(29502, 1676219900631203657L ^ var0),
                  (short)var5,
                  var6,
                  var7
               ),
            var4
         );
   }

   private static final String IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII(
      int var0, short var1, short var2, GhostMacro var3
   ) {
      long var4 = ((long)var0 << 32 | (long)var1 << 48 >>> 32 | (long)var2 << 48 >>> 48)
         ^ lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl;
      int var10000 = var3.lIllllIIlIlIIIlIIIllIIIIIllIIIIlllIlIIIlIlIIIIlIlIIIIllIIIIlIlIIIIlIIIIllIlIIllIIllIl;
      return lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(3158, 7922850987968384079L ^ var4) + var10000;
   }

   private static final String IIlllIlIlIllIIlIlIlIlllIllIIllllIIllllllIlllIlIlIIllIlIIllllllIlIIIlllIIIIlllIIllIlII(GhostMacro var0, int var1, long var2) {
      long var4 = ((long)var1 << 32 | var2 << 32 >>> 32) ^ lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl;
      int var10000 = var0.IIlllIIIllIlIIIlllIIlllIIllIlIIIIlllIlllIllIllIllIllllllllllllllIlIllllIIllIIIIlIlIll;
      return lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(6976, 8586785856465051465L ^ var4) + var10000;
   }

   private static final String IIIIIIlllIIlIIIIlllIIIlIIlIIlIllllIlllIlIIIllllIIlIIIIllIlIIIllllIllllIlIllIIllIIIIlI(GhostMacro var0, long var1) {
      var1 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var1;
      int var10000 = var0.lIlIIIIIIIllIlllIlIlIIIIIIIIlllllIIlllIIllIlllIIIlIIlllIlllIllIIlIllIIIlIllllllIIllII;
      return lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll<"t">(7554, 1095607968931166269L ^ var1) + var10000;
   }

   @NotNull
   public static final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI lIIllIIlIlIIlIlIlIlIllIIlllllIIlIllIIIllIlIlIIIllIllllIlIIlllIIIlIlIIIlIlllIIIllllIll() {
      return lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI();
   }

   static {
      long var22 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ 24338140487207L;
      Cipher var24;
      Cipher var10000 = var24 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
      byte[] var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

      for (int var25 = 1; var25 < 8; var25++) {
         var10003[var25] = (byte)(var22 << var25 * 8 >>> 56);
      }

      var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
      String[] var31 = new String[126];
      int var29 = 0;
      String var28 = "QNü¡«»²1Ý×ësm¦°O)9.ýº÷f\rØS·'Dvý8TÑÇm¨\u0011\f}HgÕ)\u001cy\u009dß3Ü\u009bmQcNñùØH\u0014¦\u0006'³gR,íÂ´/\u0003 8\u001d.\u008eâ=äL:\u0013\u0081XÄl3~:DüKsÅ¶/\u000bZÉ&0\u0002¿\u0011¡\u0010à½}Ã´Ö(\u0016\u0004Ö/§Ü¦edð\u0015\\o\"\u009egN\"\r\u001eI¶è×Ø\u0093»ÊzÍ¨\u009feELYÛ¿!Ô@ÒøÖ0ò¯m¬\u0094\u0094pé.\u0094\u0094=N\"w+2¹XíV;\r«q¹ÒÎÏ½×æ\u0081zËzáu\u0092°dÜº%J«èOiÃ\u008döãìº\u0090Ý\u008f&Á ³µ\u0003\u0018\u0082\u0017¸ÊÅ\u0086\u009d\u008dª\ro ø~«\u001a6ëµ¥¿r#Z=+\u009a\u0081\u0010\u007f\bm\u0087Tþ\u001fÇöý¤\\mÊ³fHÙå_6È°t$\n\tÅ\u0017\u0082:Û¨Q\u0098¬\u0004\u008cBX\u0081ãm+D\u008fK\u0088Ð¡\\\u00988Ãaü®\u0003\fF¬æzð\u009d³o\u000e§Ò§Þ±.\u009e\u0000 \u0003\u000bû\u008c\u001b\u008csç!%^Å@\u0093B\u0006ú\u009c°Þ\u009d\u00809U+d\u001d\u001fmÁróV)«²â\u0089j\u0093×o\u008d\u0001mw{í±\u001fx[¹O:8\u0093«\f'3´÷ã·¢+\u0006Û\u0018\u0092S«üT\u0098o\u0018\tö\u0095- \u0082q¡:|t!1|S\u0086ùç\u0014¦é\u009a#È\u0010ÅÎa\nÒÄÛ*´èµ2FK~Ð\u0010,].á\f(5å\b\u0002±\u0087é¼´,@6t^@\u001c×êª·¡\t?5\u009e\u009eJâ÷¥\u001c+Es\u0016Â/×zI.\u0088,ëÿ\u009ePgoßCU\u001bRä\u008d¢Ã\u001fügüuªU\u0005\u0084$P²Ë\u007f\u0084(Ç\u0010xQ\rYÇ=ð\u001c2\u0098\u0013ß@0\u008f\u009d8\u009eÌä\u008cÑ\u0081æÓ\u008cõ}zÜª2ý\u0014Xÿ\u0007,XÚ6yP/\u0018²c1÷¶c|\u0000üjËHÝe¾Ìfº\u0095è×\u000b\u008cS\u0099r:Ã £z$~*«aÀ7<\u001f\u008c\u0005½Q^¸Å#ýl\u009eÏ\u0097\u0085ÀTt4§\t5\u0010U[\u008eß8;z\u0094\u0083N\u000e¦*\u0084}~xútÅx\u0015Ô}Ùí\u0012þ;\\I\u0014\u0097m\u0086§\rB\u0017èfEËï\u001ecF{¹À\u000e\u0099.Ð\u000fÊS\u001bÒ\u0091ûFÏ\u000bÝ\u009düT/\u007f\u0004\u000fMqYKù'º\u000e1-Y3M\u001c,ú\u0093/µ\u008aÜÔ1\u009fo\u008cLÁf&\u0004$,J\u0015¹~©àW\u000e\u000b}\u0005+Ó[¸\u00954\u001aä\u0013hc\u009fè!\u001d\n8¯Ö\u00adj\u0010g&ª}\u0093\u0002\tÐLo[ÓìS\fÈ û\r\u008fi»ð\u0018\u00ad\rz\u000e8¢ùßî\u0003¿=µ\u0013î£\u000b\r\\Ù9æ\ta\u0001\u0018\u0094óª/ éGc\u0086]\u0097·\u0082\u009duv4c *1¼lWHfÃ¼6P°÷\u007fJ\u000f]\u008ajJ\u00821Í¾-¨\u0099.1XfªµCZBÒãu$}`\u008aD\u0092k\u009e\u008dØ«¬[v¿\u001enÄÏÒsÆ\u0082\u00057\u0080~Ç\u0012\u0095)\u007f\u009c³\u001bnxÝz &\u0010Àz\u000f¯=ýåï\u000eè\u009c°\u009fg`Ù.\u009f|Z\"³\u0010Ô\u0004WÏ\u001aMÃ 8\fÁ\u0090\u00015Ê×âº_O\u0085â\u0007ÕÃ¯\u0096z29Éù@\u0000õ\u0080ùÑ\u0082, yö\u000b(\u0002E\u009eö\u0083í¤¢\u0014²\fW¢$T\u008a\u0081W¿ºËì\"¬H\u0000\u008eö W\u00ad\u00adÁ\u0016ô\u009f\u009cüñ=ô\u008c\u0007\u0081;Uë¦1\u0001úÆS{}OR0ØR\u0096@4[\u0081/8\u0016cì\u0090t¨}P£\u009c¾#f\u0097Ç^ÖÓð¼N\u0015D¨\u0011Ù)\u0091>\u007fNAy\u000fö\u0011>¿\t~\u007f«w\u000e\u0011\u008f3(ËIÈË\r©\u001aV\u001d_þ\u0010\u0086\rãFiKÎi.½~¤?\u0095\u008fu\u0010ëz{D\u000bI`Ü ¿\u008a§<\u0086?ë\u0010Á\n\u0011ø\u0011?äî;Ùy|M8YR8\u008aB\u000b\u0082½¹ÊüVEÀ}½¡ÑúZ\u0002ï\u008d\u0082ñl\u001b\u008f\u0097\u0091$pµ\u008dä>9JÃM«¨\u0003¼Âu\u0016 T|ãã?\u0083'±:\u0002)\u0010½B\u009d~2\u0095C¬û\u0085\t}\u0014íöb \u008dÀÇ=ÏÅfê|ß}ºÓVïûy\u0002FäÝx\u0086ñ\u0093<\u008b|¥f\\-(Öç¼:\u0083Å\u0088Ê!|\u0085\u0000[0\u0010Ê·JA.Q\u009b}Ê±À÷V²õ%³bÉ#^U\rÛ\u0085(\u0090E\u001e\u000e\u0019è\u0002¿f\u0087Â\u0097C8\u007f©\u000eIùê\b¥è\u000bä\u0017é·VY\u0093?rì¥=Äk\u0000î@\u000b Z\u001e{\u001a\t2\u0007Ì\u008fõE\u009eÖä®\u0012L'\u0014Ä\u0014¬øÒü,\u000eLoqiô\u0089\u0019ÿe2YÇ(\u009b\u001b$ABSqó ÷Ò âØz\u0019\u0094É\u0090ßÏª\u0010.ýeV£XB,J$w\u0084È{ÉA(\u008dèä\u0087æ]; ßú\u008ejêiWMô\u0003n¶¤\u0092m<\u001dN¨\u0084~\u00986¨¬\u0013\u0087êw¡\u008e×pé6_B\r.\u0019ëÿ\u0007\u0090ÖÉ\u0097\u0087þuMU\u0003\u009f\u0000\tFõ½ñ \u00ad{À6\u0016àG×5¡«·º\u009dçÝB:`¯ÓÝÐ¢O+f\u001ci\u009c¾°«hºýbÁ\u00ad÷ÁÀJ\u0010í\bX\u00adÒ|\u001e\u0014¬ïµÚÕ<\u0014'îòýE\u0082F»>\u0080\u008bÝ·\u008e\u0084Ü½¡^\u0012ð\"\u008e±a\u0010ï\"\u00109\u0086}[ÌÂX\u009ej\u001d\u0084F5(Bs¹Ä¤\u001a\u0087áS\u0097Õ\u0085u\u0093£\u009eãaå-È0\u0011èæ»\u009d:áÍMi6o\u008dóÒvYÚ@\u00ad2\u0093\u009eúÓ3¯y¹\u001e>k\u0086*\u0017:¸¨ÈÖ=VÆç\u0004\r%§\u009düA´\u009aÖÆEÛ6Û¹Ç`ò¥Û±§¼µ\u001fÀ+ïpÂ^eã|¸ïá5H1¡\u0016gDîë8×}\u008bß\u0085>ø;ªF<lÅ8\u0095¥¯I\u008a\u009dÈ²¨z±®·ÿïd\u0016\u0098¤UøÔçR·Bi\u0096×«`iÃ\u009d|!(aâF\u0085l\u007fYÇ¨¤¡ !\u0010\u009bc«ûó\u0011\"\u0097ëº\u0089ìË3Àô\u0018_oÅÖtâh\r33\u0017\u0080=-øÇ¯\t\nÎ¯E\u0098,@\trógÉH\u0017ºñ*ãàÄØ\u0096qlq÷\u0017\u008fòËV-Ý\u001f Ò\u000bH\u0096¼=ÿðûß.¦\u0087Tb\u0011\u0003\u0015:Oªh\u0090ÉÉô\u009e\u000er¨-\u008f\u0090\u0098\u008ad\u0010\u0090\u0092[Ö¹è)Ýý\u0093éàtí£;\u0010\u0019`D÷}<Lt\u0093£\u001b¹q_Sï\u0010\u001cC\u0000UoÌ\u000f%\u0094\u0097=×\u0017Ìîó(a+©sâ\u0099Â8\u009d³SÖk´VO\u0005×\u001fv°IÏKøXª\b¬j\u0091eªT\u009fÃ\u0000;¡®\u0018¦\u008fã\u0015\u0017:\n¢OLÝ?Ô\u0088Ø±LÚ[éÔ ¡ú ÃC\u0098~\u008cÁÛµ²÷Áá÷®}\b\u007f]\u0094\u009dj/2|\u0092ÚÛ=vèïp J^^@È?:kú\u0012ýbþ*iVÔ\u0003\u0080ÄdÀ`:\u001dòÚX\r[üº(|\u0095°ÂhO\r½\u0088\u009bÒ>MÅü6ãv\r³r\u0087î4I\u0084î\u001bh\u008d\u008aÂÃ\u0093\u001c\u001fS\f\u007fs\u0010\u000b\u001c\u0080\u001aË\u0082&\t§/Û_\n@*«\u0018\u008bD\u001a+Ù²á¥¨ÛÂú\u009a(R\u0086vyòÅ4lü]\u0018\u0004Bi \u0014\u0013\u009bç\u001eþx<B\u000b§\u00936T\u0003§\u0012\u0098\u0085\u008e \u0015\u0099'¯ê5\u008flúú¡\u0017ðg`Y¢\u0084\u0012ÈjqÎÊ¸üA\n\u001cF\u0017« Å\u009d²\u001b÷«»\u0012Ù¤!ÖÉVÊ±\u009bêøVë\u007føV¤\f0\n\u001d¼\u0094\u0099\u0010,M\u000e\u0098\u0088\u008f\b¨,Ò\u008c)\u009b\u0095Õ\u0086(\u0088^Áuùo,\u0096\u001a90#SL \u009a\u0012\u0087ÔÊè'¹>eé\u0080\u008fø\u009eÞt\u0006oI\u009c#Ê\u0005\u001f\u0010(¹±\u0018\u0093ê9êá¶V'³\u009c|\u0084\u0018×Y\u008e\u0087\u009ai\u0086\u0082à7Ëæ\u0080¾²N\u008câ¯{Co\u000f\u00930ôL[n!8Üã\u0095×qå\u0011Ú©!\u0019¯\u0095.\u0016¡ÙÍ³.ïÁL\u0000=égzF{º \u001fò\u001cóS³¿¾{P\u0010iB¯\\ Á^¡Ý[E\u0086Ã\u0018àp\u0010ÝG\t\u0089âO¶îW>õ9\u001dú=M(ÛE«^jßp#/ë\u0084ø\u0090Ã\u008fí»¾i·\u009aÃ²·<a\u009aÖlô\u0091\\D±biÝõ\u00137\u0018 ô\u0097ñè;½\u0084øÊ\u008aÅ\u00adö5\u0088ý\u007f\u0010â\rt5ì8\u0081¯°5\u0011\u0084GÛ»ÜËîwáøfÕFÄ\u0016\u0019×=#Î8&íô\u0098/wÊüJI\u0093>¢¸´i¸\u001aÚc^\u009bö\u0097\r¨\u00adhK±0)\u008e]\u0097\u0012\u009a§täð×ÿ\u008a©ðfé8C\u0015 \u0002\u000b\u0004GB¾\u0013ç\u001eø¸\u001e\u0002M\u0007µ¼Û²\u00ad\u0091\u000e\u0003\u0088\u009b È8_Ä7µ\u0016Ujûº\u0003Féû×¬)mØÌ\u009aê~úá\u0094\u0001Ü7÷¸\u009eiËx\u0082\\\u009b!'ÉàTÄm\u0096#<¹\u008c\u0001Ô ÷È\b[\u0010öÏár\u0091\u0084¥Lð\u007f\u009aAþj\u009eN\u0010Ö*²\u0007A¿ÒK\u0099]¥\u0010±P]£ ±\u000f9;ÄDØ8¸\u0016§ê;\u008d>¸¬Z\u0082\u001af\u0016ø¿^í¸Â\u009dÁÙã\u0018æ ½\u0099<AèØ}\n\u0001È/QÃ\u0090\u008db¨ðÉ\b\u008d6@ið²\u0000\u008a4;]\u0093a\u001f^Å~¶SÁÑüÖrÙ@Ü{\u007f}\u007f\u0087O\t5P2Lð¼\u0013iÝ å yÁù\u0006@3G{5D±\u0093H#Jí\u009dN>¶C\u0010|\u0097þ\u0091¢9©\u0010zJä\f\u008eõÓO \u009eå¾¿;+\u0091\u000eÍ±ì\u00075ç\tÀ\u0091þkJ%ì\u0000\u0095\u0019À¹\u0019\u0095\u0014åN8¥\u0082P«\u008b\u0012\"=±Z3áö\u0013Q\u0015y0È2`{G&\u0006\u0010£ç§ì'\n\u009dÜù\u008b\u0094-W\u0084J×5t¿~Ì'\u00897çÍê<2È\u0010Ø\u0089t#Ä°¡\u009a#´ý\u009báîni\u0010\u001cT¾\u0081\"\u008aç\tS\u0081â2¥è\u008a«(\n\u0004u\u0012B6VN0\u0004j\u0093\u0087\u008d¯³áiF\u0018-û\u0003::â\u0019Sj\u0082Àqÿ.\\$7ó4Û\u0010ªwé\u0089!Q\nÒÈü«\u00909ÿs®\u0018C·ê;ºã\u0004\u0084°7Û\u0080\u0000mÈÿÏØ¥\"\u008fµ\t\u00928\u0005ÔË}\u001eèYÏn°}þÝäýi\u0004dNÀèM÷gT\"\u0088\u0089È\u0084\u0083\u008eew¼\u0097|\u0094mý\u0097\u0085¶¦×ä\u009eÙYÿïNÃ\u0019[à\u0010.¬`¬`Q\u0093BD^£/#-@> \u00074çp\u0004í3Ï\b@U\u0083îú`4MÞá6\u0016\u0093#\u0003Ñ¹aê2ß¢>\u0010oØ\u0019vQ,R±J66ðA\u0018Gò@ÿº\".¤\u008eÌx% \u000b¶Hö\u0087©í\u00805\u0095#Æ6'|Ü\u008f\u0082qÆl_\u0013»²Ñ¯ËÞ\u0007\u0002\u0012\u0004åc\u0081x%X0piz\b\u008e´\u008aFUi}0\u0094\u0080\u0018²\u0011Ã×¿\u001bØ\u0096cGâXK\u0097¡Q\u0018W»\u0082ÖE\u0087k(`8\u0005QC5\u0001\u0012£vÍù¹UcmÙ~)3\nI\u0000Î\u009eö¼ð¾ýÍ\u0081\u0007B0ÆÄþ\u009f§0\u0085Sd\u009d\u0012f±\f\u001e<Ë\u0094\t\b'3ï^Ø\u0097\u0016\u009aÛÈ&\u0003^ãÈá3Lª{å+Ø\u0010jgùQ\u0006PeÅi\u009d \"\u009eê\fV8\u0006°ÃíÏ\u009aRªÿ}Qò6Ú\u0018(õûÓk|\u001d[\u0082ý\t ½Ö$éôý¡)ùi\u0010Kk\u0000\u0086×æ^²Åe\u008d\u000ej\u0082;\r·\u0011\t#$0¬\u0083^u\u001fvåÂ¶½\u000e@°íÄÆ%?ÛÚL[ª³ju\n\u000e\u0092¿< GÔ\u009ax\u0094\u001b\u0011ÿ\u0082«\u0016GÓnRþ ÐÖ*«ô\f\u007f¸·¬7\u0098¶kª#øA'\u0019Ë\u0013\u0010LÚ\u0086ÆG8°\u008cN\u0010eUè=\n·v§ÜÅ\u0094o\u0094\u009ddÄ\u0010\u008d\rJ\u0017÷*ÔcÈ¯)\u009c®\u008fk\u009d\u0018\u009d·\u009c/$X\"øi\u001bh×X¢\u001eðÊX\u001aU\u001cMêÇ\u0018P\u001b\u0001ñÆKÅ\u0099ß«s\u001a¸¨\u00ad£D«\u0088/ÿ\u00011S`À\u00022¤+\"\u0091°W_½\u00929¸¾\u0015û#lBçz\u0087×Ç¹4n-Ö\u008b\u0081\u0002.)Û^\u0087±I¹\u008c#_\u000fHE\"¸jÿ\u0019\u0094>?iø\u0001^D<\u0019\u009a¼_\\Y«ñ¶ä\u0087Q\u0083Ê¹Æ\u0081¨5Góc\ruÙ\u008aö-[v\u0081PÊÃÖ`E8íÀ\u0093ù\u0082 ÏmT:Ù|V[\u0087\u0011\u000eá\u0007ù0ÿôóùí\u008d?·\f\u0082Ç¦ÉOH4gº=\u009aÁ»d¯õ\u001a\u0007£l\u0093ËÙ[ÇÝBT<åÐXõ×\u001fß\u008b¬\u0095w½\u008c\u009aJ?Å¦\u0010%¸á¶\u0003\u0088\u00078F\rÔ´\u009fÆ\u001b\u00958ë\u0080Z¶\u0014$\u008aÃÍ~#ô\u001dßØ\\w72Ø^\u0002Ö\u0014\u0086\u008e\u001a\u008eð¹Ó\u009dîx\u0087\u0081\u007f¦5;Óî·\u0003\rè²\u0010 Áà·\\\u0081\u0093¨H\u0013<£®Ì\u0007\u0085^Fc5\u0001\n»G\u001cm/a,Ý=ÜÛý\u0089\u0015\u0003#\\Ê3¾¢»Ï¬ÞìqÂê)]\u0004ÖºµöVÉ\u0016\u001cËÖ±\u0005çîÖ\"¹pb\u0096Ëñ0Õ öcP\u0086ßj\u000e®\u009eD¿û²Û°F\u009añ\u0004\u001c\u0082ü\u0005\u0006\u001e÷\u008d\u008eÔª ®Üd\u0007\u0013\u009dAEÈ.Ç\u00ad^\u0016ÂLü\u00ad\u0016\u0086/øKÙX\u0091z\u0093¼ck~\u0015N\u009e\"\boF/T4\u000fìäz\u0013þ\u0082\u0003ë\u00180èQ|Mw¶B\u0003ún\u0018\"Þ\u009fÐ;e\u008f\u0087?j\u0013\u0006u\u0081-\u0088qe¡ÉÑß§\u0017»%`\u008d\u0089Å§§¸\u009b~\u0004/ \u008d@ÍÉ¡\u009f~Qgp\u001a\u0089Ö\f£ÑÿßºS\u0094\u00844°ü@»ä+©³® M®uüò^Âz\u0094Úm-=O¯\u0083uä\u00adÂs¥\u0000{à\u009cYâ\u0087O×\u0099(wÃôg\t¶\u008f\u0017ùmR\u001fÈ\u0081\u0092é¢\u001aÏôvó\u009aûøÔ¾d\u0000F\u0013\u007fK·j@\u008bi\u009cü\u0018$_ýà«¥¼=Ú\u007føÜõ>oK)«vßpSôÉ\u0018\u0082äñÒ\u009b\u008bëÉàüË¼M^)^}ÃdÂ)lMÃ\u0010ÚåPIPb\u0012=ð\u0099J\u0099C\u0002²è\u0010X½¬F\u008aÿÔl«µ\u009fÇKA\u0092\u0080\u0018\u001a×pÙZ>½b\tQs´ñb¿\u0013\u0013]\u0018¾¸áh} \u008aí hù\u009f\u000bÓ\u007f\u001eüTþY©Ü²y>g´\u0014oç«3\u0082\r\u0002\u0014Ó¥\u0010y\u0004ú!ðQkØ©sX%4É¶ú(\u0005ÚØÆ\u001dµ-Çà÷B\u001c}\u001eä8Ë\u008aõMôë\u0001\u0011²ñn\"¦Ì¼*t¬¢\u008f\u0007\u0090Sá æRtä_:3ñåDtá\u009c\u000bzÀªÅ®Â&\u0086Ñ?\u0006/nä]S¬è\u0010xzç\u000bðqáö[$\u0019q\u0011ö{I\u0018\u0014|Db\\_#Ý\u008e\u000e#re©áä`Ô7Í³b$»PæS¨\tÃó\u001d¢(r©ô\t\u0089\u0093-\u0096È¦5\u008bztéøo\u009dìöÏ1\u0094\u008e\"ªRn\u0014e\u0013\u0018¿TP\u008c\u008d\u009b\u0004U³\u0092Q\u0084nÛQ\u0097ê\u0084Å½«ixhfÔþ&!jÃ\\k\u0005,Ðn\u008aÈ -¿\u0097Ïq¼Ò~è´\u007f¯0_\u0087áaÇNàr<³\u0013+aV÷\u008eV r@´9\u009e½¯÷\u00ad\r\u008a\u0017\u0010\u00800ZÝÅòÅ\u001f°ó\u008b#³\u008d\u0097M®\u0005òß@·\u0012D\u008fÈ\"¢R[{À¸ÿ\u0011c|WÃ(½SC\u0080q\b¯)B\u0098\u0096(R n3Z4r\u001cO\u001cäP\u000f¬].SI5\u0013^\\²\u001c¡Þ\u008dí·éGáWY\u0010±\bHh\u001f\u0003T\u009fÔm\u009a\u0099Ì]ýÆ";
      int var30 = "QNü¡«»²1Ý×ësm¦°O)9.ýº÷f\rØS·'Dvý8TÑÇm¨\u0011\f}HgÕ)\u001cy\u009dß3Ü\u009bmQcNñùØH\u0014¦\u0006'³gR,íÂ´/\u0003 8\u001d.\u008eâ=äL:\u0013\u0081XÄl3~:DüKsÅ¶/\u000bZÉ&0\u0002¿\u0011¡\u0010à½}Ã´Ö(\u0016\u0004Ö/§Ü¦edð\u0015\\o\"\u009egN\"\r\u001eI¶è×Ø\u0093»ÊzÍ¨\u009feELYÛ¿!Ô@ÒøÖ0ò¯m¬\u0094\u0094pé.\u0094\u0094=N\"w+2¹XíV;\r«q¹ÒÎÏ½×æ\u0081zËzáu\u0092°dÜº%J«èOiÃ\u008döãìº\u0090Ý\u008f&Á ³µ\u0003\u0018\u0082\u0017¸ÊÅ\u0086\u009d\u008dª\ro ø~«\u001a6ëµ¥¿r#Z=+\u009a\u0081\u0010\u007f\bm\u0087Tþ\u001fÇöý¤\\mÊ³fHÙå_6È°t$\n\tÅ\u0017\u0082:Û¨Q\u0098¬\u0004\u008cBX\u0081ãm+D\u008fK\u0088Ð¡\\\u00988Ãaü®\u0003\fF¬æzð\u009d³o\u000e§Ò§Þ±.\u009e\u0000 \u0003\u000bû\u008c\u001b\u008csç!%^Å@\u0093B\u0006ú\u009c°Þ\u009d\u00809U+d\u001d\u001fmÁróV)«²â\u0089j\u0093×o\u008d\u0001mw{í±\u001fx[¹O:8\u0093«\f'3´÷ã·¢+\u0006Û\u0018\u0092S«üT\u0098o\u0018\tö\u0095- \u0082q¡:|t!1|S\u0086ùç\u0014¦é\u009a#È\u0010ÅÎa\nÒÄÛ*´èµ2FK~Ð\u0010,].á\f(5å\b\u0002±\u0087é¼´,@6t^@\u001c×êª·¡\t?5\u009e\u009eJâ÷¥\u001c+Es\u0016Â/×zI.\u0088,ëÿ\u009ePgoßCU\u001bRä\u008d¢Ã\u001fügüuªU\u0005\u0084$P²Ë\u007f\u0084(Ç\u0010xQ\rYÇ=ð\u001c2\u0098\u0013ß@0\u008f\u009d8\u009eÌä\u008cÑ\u0081æÓ\u008cõ}zÜª2ý\u0014Xÿ\u0007,XÚ6yP/\u0018²c1÷¶c|\u0000üjËHÝe¾Ìfº\u0095è×\u000b\u008cS\u0099r:Ã £z$~*«aÀ7<\u001f\u008c\u0005½Q^¸Å#ýl\u009eÏ\u0097\u0085ÀTt4§\t5\u0010U[\u008eß8;z\u0094\u0083N\u000e¦*\u0084}~xútÅx\u0015Ô}Ùí\u0012þ;\\I\u0014\u0097m\u0086§\rB\u0017èfEËï\u001ecF{¹À\u000e\u0099.Ð\u000fÊS\u001bÒ\u0091ûFÏ\u000bÝ\u009düT/\u007f\u0004\u000fMqYKù'º\u000e1-Y3M\u001c,ú\u0093/µ\u008aÜÔ1\u009fo\u008cLÁf&\u0004$,J\u0015¹~©àW\u000e\u000b}\u0005+Ó[¸\u00954\u001aä\u0013hc\u009fè!\u001d\n8¯Ö\u00adj\u0010g&ª}\u0093\u0002\tÐLo[ÓìS\fÈ û\r\u008fi»ð\u0018\u00ad\rz\u000e8¢ùßî\u0003¿=µ\u0013î£\u000b\r\\Ù9æ\ta\u0001\u0018\u0094óª/ éGc\u0086]\u0097·\u0082\u009duv4c *1¼lWHfÃ¼6P°÷\u007fJ\u000f]\u008ajJ\u00821Í¾-¨\u0099.1XfªµCZBÒãu$}`\u008aD\u0092k\u009e\u008dØ«¬[v¿\u001enÄÏÒsÆ\u0082\u00057\u0080~Ç\u0012\u0095)\u007f\u009c³\u001bnxÝz &\u0010Àz\u000f¯=ýåï\u000eè\u009c°\u009fg`Ù.\u009f|Z\"³\u0010Ô\u0004WÏ\u001aMÃ 8\fÁ\u0090\u00015Ê×âº_O\u0085â\u0007ÕÃ¯\u0096z29Éù@\u0000õ\u0080ùÑ\u0082, yö\u000b(\u0002E\u009eö\u0083í¤¢\u0014²\fW¢$T\u008a\u0081W¿ºËì\"¬H\u0000\u008eö W\u00ad\u00adÁ\u0016ô\u009f\u009cüñ=ô\u008c\u0007\u0081;Uë¦1\u0001úÆS{}OR0ØR\u0096@4[\u0081/8\u0016cì\u0090t¨}P£\u009c¾#f\u0097Ç^ÖÓð¼N\u0015D¨\u0011Ù)\u0091>\u007fNAy\u000fö\u0011>¿\t~\u007f«w\u000e\u0011\u008f3(ËIÈË\r©\u001aV\u001d_þ\u0010\u0086\rãFiKÎi.½~¤?\u0095\u008fu\u0010ëz{D\u000bI`Ü ¿\u008a§<\u0086?ë\u0010Á\n\u0011ø\u0011?äî;Ùy|M8YR8\u008aB\u000b\u0082½¹ÊüVEÀ}½¡ÑúZ\u0002ï\u008d\u0082ñl\u001b\u008f\u0097\u0091$pµ\u008dä>9JÃM«¨\u0003¼Âu\u0016 T|ãã?\u0083'±:\u0002)\u0010½B\u009d~2\u0095C¬û\u0085\t}\u0014íöb \u008dÀÇ=ÏÅfê|ß}ºÓVïûy\u0002FäÝx\u0086ñ\u0093<\u008b|¥f\\-(Öç¼:\u0083Å\u0088Ê!|\u0085\u0000[0\u0010Ê·JA.Q\u009b}Ê±À÷V²õ%³bÉ#^U\rÛ\u0085(\u0090E\u001e\u000e\u0019è\u0002¿f\u0087Â\u0097C8\u007f©\u000eIùê\b¥è\u000bä\u0017é·VY\u0093?rì¥=Äk\u0000î@\u000b Z\u001e{\u001a\t2\u0007Ì\u008fõE\u009eÖä®\u0012L'\u0014Ä\u0014¬øÒü,\u000eLoqiô\u0089\u0019ÿe2YÇ(\u009b\u001b$ABSqó ÷Ò âØz\u0019\u0094É\u0090ßÏª\u0010.ýeV£XB,J$w\u0084È{ÉA(\u008dèä\u0087æ]; ßú\u008ejêiWMô\u0003n¶¤\u0092m<\u001dN¨\u0084~\u00986¨¬\u0013\u0087êw¡\u008e×pé6_B\r.\u0019ëÿ\u0007\u0090ÖÉ\u0097\u0087þuMU\u0003\u009f\u0000\tFõ½ñ \u00ad{À6\u0016àG×5¡«·º\u009dçÝB:`¯ÓÝÐ¢O+f\u001ci\u009c¾°«hºýbÁ\u00ad÷ÁÀJ\u0010í\bX\u00adÒ|\u001e\u0014¬ïµÚÕ<\u0014'îòýE\u0082F»>\u0080\u008bÝ·\u008e\u0084Ü½¡^\u0012ð\"\u008e±a\u0010ï\"\u00109\u0086}[ÌÂX\u009ej\u001d\u0084F5(Bs¹Ä¤\u001a\u0087áS\u0097Õ\u0085u\u0093£\u009eãaå-È0\u0011èæ»\u009d:áÍMi6o\u008dóÒvYÚ@\u00ad2\u0093\u009eúÓ3¯y¹\u001e>k\u0086*\u0017:¸¨ÈÖ=VÆç\u0004\r%§\u009düA´\u009aÖÆEÛ6Û¹Ç`ò¥Û±§¼µ\u001fÀ+ïpÂ^eã|¸ïá5H1¡\u0016gDîë8×}\u008bß\u0085>ø;ªF<lÅ8\u0095¥¯I\u008a\u009dÈ²¨z±®·ÿïd\u0016\u0098¤UøÔçR·Bi\u0096×«`iÃ\u009d|!(aâF\u0085l\u007fYÇ¨¤¡ !\u0010\u009bc«ûó\u0011\"\u0097ëº\u0089ìË3Àô\u0018_oÅÖtâh\r33\u0017\u0080=-øÇ¯\t\nÎ¯E\u0098,@\trógÉH\u0017ºñ*ãàÄØ\u0096qlq÷\u0017\u008fòËV-Ý\u001f Ò\u000bH\u0096¼=ÿðûß.¦\u0087Tb\u0011\u0003\u0015:Oªh\u0090ÉÉô\u009e\u000er¨-\u008f\u0090\u0098\u008ad\u0010\u0090\u0092[Ö¹è)Ýý\u0093éàtí£;\u0010\u0019`D÷}<Lt\u0093£\u001b¹q_Sï\u0010\u001cC\u0000UoÌ\u000f%\u0094\u0097=×\u0017Ìîó(a+©sâ\u0099Â8\u009d³SÖk´VO\u0005×\u001fv°IÏKøXª\b¬j\u0091eªT\u009fÃ\u0000;¡®\u0018¦\u008fã\u0015\u0017:\n¢OLÝ?Ô\u0088Ø±LÚ[éÔ ¡ú ÃC\u0098~\u008cÁÛµ²÷Áá÷®}\b\u007f]\u0094\u009dj/2|\u0092ÚÛ=vèïp J^^@È?:kú\u0012ýbþ*iVÔ\u0003\u0080ÄdÀ`:\u001dòÚX\r[üº(|\u0095°ÂhO\r½\u0088\u009bÒ>MÅü6ãv\r³r\u0087î4I\u0084î\u001bh\u008d\u008aÂÃ\u0093\u001c\u001fS\f\u007fs\u0010\u000b\u001c\u0080\u001aË\u0082&\t§/Û_\n@*«\u0018\u008bD\u001a+Ù²á¥¨ÛÂú\u009a(R\u0086vyòÅ4lü]\u0018\u0004Bi \u0014\u0013\u009bç\u001eþx<B\u000b§\u00936T\u0003§\u0012\u0098\u0085\u008e \u0015\u0099'¯ê5\u008flúú¡\u0017ðg`Y¢\u0084\u0012ÈjqÎÊ¸üA\n\u001cF\u0017« Å\u009d²\u001b÷«»\u0012Ù¤!ÖÉVÊ±\u009bêøVë\u007føV¤\f0\n\u001d¼\u0094\u0099\u0010,M\u000e\u0098\u0088\u008f\b¨,Ò\u008c)\u009b\u0095Õ\u0086(\u0088^Áuùo,\u0096\u001a90#SL \u009a\u0012\u0087ÔÊè'¹>eé\u0080\u008fø\u009eÞt\u0006oI\u009c#Ê\u0005\u001f\u0010(¹±\u0018\u0093ê9êá¶V'³\u009c|\u0084\u0018×Y\u008e\u0087\u009ai\u0086\u0082à7Ëæ\u0080¾²N\u008câ¯{Co\u000f\u00930ôL[n!8Üã\u0095×qå\u0011Ú©!\u0019¯\u0095.\u0016¡ÙÍ³.ïÁL\u0000=égzF{º \u001fò\u001cóS³¿¾{P\u0010iB¯\\ Á^¡Ý[E\u0086Ã\u0018àp\u0010ÝG\t\u0089âO¶îW>õ9\u001dú=M(ÛE«^jßp#/ë\u0084ø\u0090Ã\u008fí»¾i·\u009aÃ²·<a\u009aÖlô\u0091\\D±biÝõ\u00137\u0018 ô\u0097ñè;½\u0084øÊ\u008aÅ\u00adö5\u0088ý\u007f\u0010â\rt5ì8\u0081¯°5\u0011\u0084GÛ»ÜËîwáøfÕFÄ\u0016\u0019×=#Î8&íô\u0098/wÊüJI\u0093>¢¸´i¸\u001aÚc^\u009bö\u0097\r¨\u00adhK±0)\u008e]\u0097\u0012\u009a§täð×ÿ\u008a©ðfé8C\u0015 \u0002\u000b\u0004GB¾\u0013ç\u001eø¸\u001e\u0002M\u0007µ¼Û²\u00ad\u0091\u000e\u0003\u0088\u009b È8_Ä7µ\u0016Ujûº\u0003Féû×¬)mØÌ\u009aê~úá\u0094\u0001Ü7÷¸\u009eiËx\u0082\\\u009b!'ÉàTÄm\u0096#<¹\u008c\u0001Ô ÷È\b[\u0010öÏár\u0091\u0084¥Lð\u007f\u009aAþj\u009eN\u0010Ö*²\u0007A¿ÒK\u0099]¥\u0010±P]£ ±\u000f9;ÄDØ8¸\u0016§ê;\u008d>¸¬Z\u0082\u001af\u0016ø¿^í¸Â\u009dÁÙã\u0018æ ½\u0099<AèØ}\n\u0001È/QÃ\u0090\u008db¨ðÉ\b\u008d6@ið²\u0000\u008a4;]\u0093a\u001f^Å~¶SÁÑüÖrÙ@Ü{\u007f}\u007f\u0087O\t5P2Lð¼\u0013iÝ å yÁù\u0006@3G{5D±\u0093H#Jí\u009dN>¶C\u0010|\u0097þ\u0091¢9©\u0010zJä\f\u008eõÓO \u009eå¾¿;+\u0091\u000eÍ±ì\u00075ç\tÀ\u0091þkJ%ì\u0000\u0095\u0019À¹\u0019\u0095\u0014åN8¥\u0082P«\u008b\u0012\"=±Z3áö\u0013Q\u0015y0È2`{G&\u0006\u0010£ç§ì'\n\u009dÜù\u008b\u0094-W\u0084J×5t¿~Ì'\u00897çÍê<2È\u0010Ø\u0089t#Ä°¡\u009a#´ý\u009báîni\u0010\u001cT¾\u0081\"\u008aç\tS\u0081â2¥è\u008a«(\n\u0004u\u0012B6VN0\u0004j\u0093\u0087\u008d¯³áiF\u0018-û\u0003::â\u0019Sj\u0082Àqÿ.\\$7ó4Û\u0010ªwé\u0089!Q\nÒÈü«\u00909ÿs®\u0018C·ê;ºã\u0004\u0084°7Û\u0080\u0000mÈÿÏØ¥\"\u008fµ\t\u00928\u0005ÔË}\u001eèYÏn°}þÝäýi\u0004dNÀèM÷gT\"\u0088\u0089È\u0084\u0083\u008eew¼\u0097|\u0094mý\u0097\u0085¶¦×ä\u009eÙYÿïNÃ\u0019[à\u0010.¬`¬`Q\u0093BD^£/#-@> \u00074çp\u0004í3Ï\b@U\u0083îú`4MÞá6\u0016\u0093#\u0003Ñ¹aê2ß¢>\u0010oØ\u0019vQ,R±J66ðA\u0018Gò@ÿº\".¤\u008eÌx% \u000b¶Hö\u0087©í\u00805\u0095#Æ6'|Ü\u008f\u0082qÆl_\u0013»²Ñ¯ËÞ\u0007\u0002\u0012\u0004åc\u0081x%X0piz\b\u008e´\u008aFUi}0\u0094\u0080\u0018²\u0011Ã×¿\u001bØ\u0096cGâXK\u0097¡Q\u0018W»\u0082ÖE\u0087k(`8\u0005QC5\u0001\u0012£vÍù¹UcmÙ~)3\nI\u0000Î\u009eö¼ð¾ýÍ\u0081\u0007B0ÆÄþ\u009f§0\u0085Sd\u009d\u0012f±\f\u001e<Ë\u0094\t\b'3ï^Ø\u0097\u0016\u009aÛÈ&\u0003^ãÈá3Lª{å+Ø\u0010jgùQ\u0006PeÅi\u009d \"\u009eê\fV8\u0006°ÃíÏ\u009aRªÿ}Qò6Ú\u0018(õûÓk|\u001d[\u0082ý\t ½Ö$éôý¡)ùi\u0010Kk\u0000\u0086×æ^²Åe\u008d\u000ej\u0082;\r·\u0011\t#$0¬\u0083^u\u001fvåÂ¶½\u000e@°íÄÆ%?ÛÚL[ª³ju\n\u000e\u0092¿< GÔ\u009ax\u0094\u001b\u0011ÿ\u0082«\u0016GÓnRþ ÐÖ*«ô\f\u007f¸·¬7\u0098¶kª#øA'\u0019Ë\u0013\u0010LÚ\u0086ÆG8°\u008cN\u0010eUè=\n·v§ÜÅ\u0094o\u0094\u009ddÄ\u0010\u008d\rJ\u0017÷*ÔcÈ¯)\u009c®\u008fk\u009d\u0018\u009d·\u009c/$X\"øi\u001bh×X¢\u001eðÊX\u001aU\u001cMêÇ\u0018P\u001b\u0001ñÆKÅ\u0099ß«s\u001a¸¨\u00ad£D«\u0088/ÿ\u00011S`À\u00022¤+\"\u0091°W_½\u00929¸¾\u0015û#lBçz\u0087×Ç¹4n-Ö\u008b\u0081\u0002.)Û^\u0087±I¹\u008c#_\u000fHE\"¸jÿ\u0019\u0094>?iø\u0001^D<\u0019\u009a¼_\\Y«ñ¶ä\u0087Q\u0083Ê¹Æ\u0081¨5Góc\ruÙ\u008aö-[v\u0081PÊÃÖ`E8íÀ\u0093ù\u0082 ÏmT:Ù|V[\u0087\u0011\u000eá\u0007ù0ÿôóùí\u008d?·\f\u0082Ç¦ÉOH4gº=\u009aÁ»d¯õ\u001a\u0007£l\u0093ËÙ[ÇÝBT<åÐXõ×\u001fß\u008b¬\u0095w½\u008c\u009aJ?Å¦\u0010%¸á¶\u0003\u0088\u00078F\rÔ´\u009fÆ\u001b\u00958ë\u0080Z¶\u0014$\u008aÃÍ~#ô\u001dßØ\\w72Ø^\u0002Ö\u0014\u0086\u008e\u001a\u008eð¹Ó\u009dîx\u0087\u0081\u007f¦5;Óî·\u0003\rè²\u0010 Áà·\\\u0081\u0093¨H\u0013<£®Ì\u0007\u0085^Fc5\u0001\n»G\u001cm/a,Ý=ÜÛý\u0089\u0015\u0003#\\Ê3¾¢»Ï¬ÞìqÂê)]\u0004ÖºµöVÉ\u0016\u001cËÖ±\u0005çîÖ\"¹pb\u0096Ëñ0Õ öcP\u0086ßj\u000e®\u009eD¿û²Û°F\u009añ\u0004\u001c\u0082ü\u0005\u0006\u001e÷\u008d\u008eÔª ®Üd\u0007\u0013\u009dAEÈ.Ç\u00ad^\u0016ÂLü\u00ad\u0016\u0086/øKÙX\u0091z\u0093¼ck~\u0015N\u009e\"\boF/T4\u000fìäz\u0013þ\u0082\u0003ë\u00180èQ|Mw¶B\u0003ún\u0018\"Þ\u009fÐ;e\u008f\u0087?j\u0013\u0006u\u0081-\u0088qe¡ÉÑß§\u0017»%`\u008d\u0089Å§§¸\u009b~\u0004/ \u008d@ÍÉ¡\u009f~Qgp\u001a\u0089Ö\f£ÑÿßºS\u0094\u00844°ü@»ä+©³® M®uüò^Âz\u0094Úm-=O¯\u0083uä\u00adÂs¥\u0000{à\u009cYâ\u0087O×\u0099(wÃôg\t¶\u008f\u0017ùmR\u001fÈ\u0081\u0092é¢\u001aÏôvó\u009aûøÔ¾d\u0000F\u0013\u007fK·j@\u008bi\u009cü\u0018$_ýà«¥¼=Ú\u007føÜõ>oK)«vßpSôÉ\u0018\u0082äñÒ\u009b\u008bëÉàüË¼M^)^}ÃdÂ)lMÃ\u0010ÚåPIPb\u0012=ð\u0099J\u0099C\u0002²è\u0010X½¬F\u008aÿÔl«µ\u009fÇKA\u0092\u0080\u0018\u001a×pÙZ>½b\tQs´ñb¿\u0013\u0013]\u0018¾¸áh} \u008aí hù\u009f\u000bÓ\u007f\u001eüTþY©Ü²y>g´\u0014oç«3\u0082\r\u0002\u0014Ó¥\u0010y\u0004ú!ðQkØ©sX%4É¶ú(\u0005ÚØÆ\u001dµ-Çà÷B\u001c}\u001eä8Ë\u008aõMôë\u0001\u0011²ñn\"¦Ì¼*t¬¢\u008f\u0007\u0090Sá æRtä_:3ñåDtá\u009c\u000bzÀªÅ®Â&\u0086Ñ?\u0006/nä]S¬è\u0010xzç\u000bðqáö[$\u0019q\u0011ö{I\u0018\u0014|Db\\_#Ý\u008e\u000e#re©áä`Ô7Í³b$»PæS¨\tÃó\u001d¢(r©ô\t\u0089\u0093-\u0096È¦5\u008bztéøo\u009dìöÏ1\u0094\u008e\"ªRn\u0014e\u0013\u0018¿TP\u008c\u008d\u009b\u0004U³\u0092Q\u0084nÛQ\u0097ê\u0084Å½«ixhfÔþ&!jÃ\\k\u0005,Ðn\u008aÈ -¿\u0097Ïq¼Ò~è´\u007f¯0_\u0087áaÇNàr<³\u0013+aV÷\u008eV r@´9\u009e½¯÷\u00ad\r\u008a\u0017\u0010\u00800ZÝÅòÅ\u001f°ó\u008b#³\u008d\u0097M®\u0005òß@·\u0012D\u008fÈ\"¢R[{À¸ÿ\u0011c|WÃ(½SC\u0080q\b¯)B\u0098\u0096(R n3Z4r\u001cO\u001cäP\u000f¬].SI5\u0013^\\²\u001c¡Þ\u008dí·éGáWY\u0010±\bHh\u001f\u0003T\u009fÔm\u009a\u0099Ì]ýÆ"
         .length();
      char var27 = '(';
      int var26 = -1;

      while (true) {
         byte[] var32 = var24.doFinal(var28.substring(++var26, var26 + var27).getBytes("ISO-8859-1"));
         String var65 = IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var32).intern();
         byte var10001 = -1;
         var31[var29++] = var65;
         if ((var26 += var27) >= var30) {
            var28 = "ËX\u001c\u0007»Ìbì\u0002\tO\rOÐ\u008d¤\u0010Ø\u0086/d2\u0096ÜÍ²\u0012ÏÎÞô´\u0099";
            var30 = "ËX\u001c\u0007»Ìbì\u0002\tO\rOÐ\u008d¤\u0010Ø\u0086/d2\u0096ÜÍ²\u0012ÏÎÞô´\u0099".length();
            var27 = '\u0010';
            var26 = -1;

            while (true) {
               var32 = var24.doFinal(var28.substring(++var26, var26 + var27).getBytes("ISO-8859-1"));
               String var67 = IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var32).intern();
               int var55 = 0;
               var31[var29++] = var67;
               if ((var26 += var27) >= var30) {
                  lIllIIlIIIllIlllIIlllIllIIllllIllIllIIIIIllIllIllIIlIIIIIlllIlIllIlIIllIIIllIIllIIIll = var31;
                  IlIIlllllIlIIIIlIIIIlIllIlIIIlllIlIIIllIlIIIllIIlIIlIIIIllIIlIIIIIllIlllIIIIIlIIIIllI = new String[126];
                  IIlIlllIIIIIlIlIIIlIIlllllIIllllIIIlllllIllIlIlIIllIIlIIIIlIIIIIlIIIIlllllIIIIIIIlIlI = new HashMap(13);
                  Cipher var11;
                  var10000 = var11 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var12 = 1; var12 < 8; var12++) {
                     var10003[var12] = (byte)(var22 << var12 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var17 = new long[9];
                  int var14 = 0;
                  String var15 = "ÉôF\ntáïu\u001fòÖýAÇÓ\u008dÍ}ßSBF\u0012aÐ½Å,\u0019·|\u0083\u0080',öiX6$Á\u008f2\u0007\u0083\u0091ÆåiÃY0¿iÅk";
                  int var16 = "ÉôF\ntáïu\u001fòÖýAÇÓ\u008dÍ}ßSBF\u0012aÐ½Å,\u0019·|\u0083\u0080',öiX6$Á\u008f2\u0007\u0083\u0091ÆåiÃY0¿iÅk".length();
                  byte var13 = 0;

                  do {
                     var55 = var13;
                     var13 += 8;
                     byte[] var18 = var15.substring(var55, var13).getBytes("ISO-8859-1");
                     var55 = var14++;
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
                     byte var72 = -1;
                     var17[var55] = var10004;
                  } while (var13 < var16);

                  var15 = "\u000b=\u0094\u0017Hj÷Ìdld?ÈØÜ¨";
                  var16 = "\u000b=\u0094\u0017Hj÷Ìdld?ÈØÜ¨".length();
                  var13 = 0;

                  do {
                     int var59 = var13;
                     var13 += 8;
                     byte[] var42 = var15.substring(var59, var13).getBytes("ISO-8859-1");
                     var59 = var14++;
                     long var43 = (var42[0] & 255L) << 56
                        | (var42[1] & 255L) << 48
                        | (var42[2] & 255L) << 40
                        | (var42[3] & 255L) << 32
                        | (var42[4] & 255L) << 24
                        | (var42[5] & 255L) << 16
                        | (var42[6] & 255L) << 8
                        | var42[7] & 255L;
                     byte[] var44 = var11.doFinal(
                        new byte[]{
                           (byte)(var43 >>> 56),
                           (byte)(var43 >>> 48),
                           (byte)(var43 >>> 40),
                           (byte)(var43 >>> 32),
                           (byte)(var43 >>> 24),
                           (byte)(var43 >>> 16),
                           (byte)(var43 >>> 8),
                           (byte)var43
                        }
                     );
                     long var77 = (var44[0] & 255L) << 56
                        | (var44[1] & 255L) << 48
                        | (var44[2] & 255L) << 40
                        | (var44[3] & 255L) << 32
                        | (var44[4] & 255L) << 24
                        | (var44[5] & 255L) << 16
                        | (var44[6] & 255L) << 8
                        | var44[7] & 255L;
                     boolean var73 = false;
                     var17[var59] = var77;
                  } while (var13 < var16);

                  lllIlIlIlIlIlIIllIIllIIIIIlIlIIlIIllllIlllIIlllllIlllIlIlIlIIllIlIIllllIlIlIlllIIIIlI = var17;
                  IIllllIlIIlIIIIllIIIIlIlIIIIIlIlIllIlIllIlIlIIIIIllllIlllIIllIllIIllIlllIlIlllIIlIllI = new Integer[9];
                  IllIllIIIIIIIIIlIIllllIlllllIIIlIIIIIIIIlllllIlllllIlIIllIlIllllIlIIIIIIlIIIllllllIlI = new HashMap(13);
                  Cipher var0;
                  var10000 = var0 = Cipher.getInstance("DES/CBC/NoPadding");
                  var10002 = SecretKeyFactory.getInstance("DES");
                  var10003 = new byte[]{(byte)(var22 >>> 56), 0, 0, 0, 0, 0, 0, 0};

                  for (int var1 = 1; var1 < 8; var1++) {
                     var10003[var1] = (byte)(var22 << var1 * 8 >>> 56);
                  }

                  var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
                  long[] var6 = new long[15];
                  int var3 = 0;
                  String var4 = "Õß\u0091\u009c§Ç\u007f\u0095µ³OÁº\u0088\u0098wFq\u0088\u0012´È\u0005yÑMÀþ,\u008b2\u0015·è\u0007ÅªÁ(ûá·9À\u001b{\u001e\u0088B\u0085È¦xÑºÇ\u008a9m\n¤\u0012\u00867¦\u0091$Èþ\u007foÜ¶\u0098a ¢^ç\u0083\u0090ëÙ/H@\u001dÃ\u008eQ;\u0002÷²äD\u009fò\u001fÛD<§_";
                  int var5 = "Õß\u0091\u009c§Ç\u007f\u0095µ³OÁº\u0088\u0098wFq\u0088\u0012´È\u0005yÑMÀþ,\u008b2\u0015·è\u0007ÅªÁ(ûá·9À\u001b{\u001e\u0088B\u0085È¦xÑºÇ\u008a9m\n¤\u0012\u00867¦\u0091$Èþ\u007foÜ¶\u0098a ¢^ç\u0083\u0090ëÙ/H@\u001dÃ\u008eQ;\u0002÷²äD\u009fò\u001fÛD<§_"
                     .length();
                  byte var2 = 0;

                  do {
                     int var61 = var2;
                     var2 += 8;
                     byte[] var7 = var4.substring(var61, var2).getBytes("ISO-8859-1");
                     var61 = var3++;
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
                     long var78 = (var10[0] & 255L) << 56
                        | (var10[1] & 255L) << 48
                        | (var10[2] & 255L) << 40
                        | (var10[3] & 255L) << 32
                        | (var10[4] & 255L) << 24
                        | (var10[5] & 255L) << 16
                        | (var10[6] & 255L) << 8
                        | var10[7] & 255L;
                     byte var75 = -1;
                     var6[var61] = var78;
                  } while (var2 < var5);

                  var4 = ":AQõOý|_\u0082lð\u009b·ê\u0096È";
                  var5 = ":AQõOý|_\u0082lð\u009b·ê\u0096È".length();
                  var2 = 0;

                  do {
                     int var63 = var2;
                     var2 += 8;
                     byte[] var36 = var4.substring(var63, var2).getBytes("ISO-8859-1");
                     var63 = var3++;
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
                     long var79 = (var38[0] & 255L) << 56
                        | (var38[1] & 255L) << 48
                        | (var38[2] & 255L) << 40
                        | (var38[3] & 255L) << 32
                        | (var38[4] & 255L) << 24
                        | (var38[5] & 255L) << 16
                        | (var38[6] & 255L) << 8
                        | var38[7] & 255L;
                     boolean var76 = false;
                     var6[var63] = var79;
                  } while (var2 < var5);

                  llIlIIlIlIlllllIllIIIIlIIIlIlIIIIlIlllIlIlllIIlIIIIIIlllIllIIIllIlllIIIllllIIIlIlIIII = var6;
                  lllIllIlIlIllIIIIlIIIIIlIlIIlIIlllIIIllIIIIllIIIlllIIllIlIlllIllIIIlIlllIIlllIllIlIII = new Long[15];
                  lIIIllIlIIIlllIIllIIlllIIIlIIIllIIlIlllllllllIIIIIIllllllIllIllIIlIIIIIllIIIllIIIIlIl = new GhostMacro.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
                     null
                  );
                  IlllIlIIlllIIlIIIIIllllIIIIIlIIllllIlllIIIIlIIllIlIlIllIIlIIIIllllIlIlIllIlIlIlIIlIll = new lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI();
                  lIIIlIllllllIIllIIlIlllIllllIlIlllllIIIllIlllIIlllllIlIIIlIlIIllllIIllIIIlllIllIIlIII = new GhostMacro();
                  return;
               }

               var27 = var28.charAt(var26);
            }
         }

         var27 = var28.charAt(var26);
      }
   }

   private static NoWhenBranchMatchedException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
      NoWhenBranchMatchedException var0
   ) {
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

   private static String IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(int var0, long var1) {
      int var5 = var0 ^ (int)(var1 & 32767L) ^ 16887;
      if (IlIIlllllIlIIIIlIIIIlIllIlIIIlllIlIIIllIlIIIllIIlIIlIIIIllIIlIIIIIllIlllIIIIIlIIIIllI[var5] == null) {
         Object[] var4;
         try {
            Long var3 = Thread.currentThread().threadId();
            var4 = (Object[])lIlllIIIIIlllllIIllIllIlIIlIllllllIllIIlllIIllIIIIIlIlIlIllIlIlIIlIlIIlIlIIIIIlllIIlI.get(var3);
            if (var4 == null) {
               var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               lIlllIIIIIlllllIIllIllIlIIlIllllllIllIIlllIIllIIIIIlIlIlIllIlIlIIlIlIIlIlIIIIIlllIIlI.put(var3, var4);
            }
         } catch (Exception var10) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl", var10
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
         byte[] var9 = lIllIIlIIIllIlllIIlllIllIIllllIllIllIIIIIllIllIllIIlIIIIIlllIlIllIlIIllIIIllIIllIIIll[var5].getBytes("ISO-8859-1");
         IlIIlllllIlIIIIlIIIIlIllIlIIIlllIlIIIllIlIIIllIIlIIlIIIIllIIlIIIIIllIlllIIIIIlIIIIllI[var5] = IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(
            ((Cipher)var4[0]).doFinal(var9)
         );
      }

      return IlIIlllllIlIIIIlIIIIlIllIlIIIlllIlIIIllIlIIIllIIlIIlIIIIllIIlIIIIIllIlllIIIIIlIIIIllI[var5];
   }

   private static Object lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      String var7 = IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII(var4, var5);
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
            "me/octo/client/modules/impl/macros/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static int IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 13080;
      if (IIllllIlIIlIIIIllIIIIlIlIIIIIlIlIllIlIllIlIlIIIIIllllIlllIIllIllIIllIlllIlIlllIIlIllI[var3] == null) {
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
         long var5 = lllIlIlIlIlIlIIllIIllIIIIIlIlIIlIIllllIlllIIlllllIlllIlIlIlIIllIlIIllllIlIlIlllIIIIlI[var3];
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
         Object[] var9 = (Object[])IIlIlllIIIIIlIlIIIlIIlllllIIllllIIIlllllIllIlIlIIllIIlIIIIlIIIIIlIIIIlllllIIIIIIIlIlI.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IIlIlllIIIIIlIlIIIlIIlllllIIllllIIIlllllIllIlIlIIllIIlIIIIlIIIIIlIIIIlllllIIIIIIIlIlI.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl", var14
            );
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         IIllllIlIIlIIIIllIIIIlIlIIIIIlIlIllIlIllIlIlIIIIIllllIlllIIllIllIIllIlllIlIlllIIlIllI[var3] = var15;
      }

      return IIllllIlIIlIIIIllIIIIlIlIIIIIlIlIllIlIllIlIlIIIIIllllIlllIIllIllIIllIlllIlIlllIIlIllI[var3];
   }

   private static int IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      int var7 = IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI(var4, var5);
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
            "me/octo/client/modules/impl/macros/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private static long IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8770;
      if (lllIllIlIlIllIIIIlIIIIIlIlIIlIIlllIIIllIIIIllIIIlllIIllIlIlllIllIIIlIlllIIlllIllIlIII[var3] == null) {
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
         long var5 = llIlIIlIlIlllllIllIIIIlIIIlIlIIIIlIlllIlIlllIIlIIIIIIlllIllIIIllIlllIIIllllIIIlIlIIII[var3];
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
         Object[] var9 = (Object[])IllIllIIIIIIIIIlIIllllIlllllIIIlIIIIIIIIlllllIlllllIlIIllIlIllllIlIIIIIIlIIIllllllIlI.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
               IllIllIIIIIIIIIlIIllllIlllllIIIlIIIIIIIIlllllIlllllIlIIllIlIllllIlIIIIIIlIIIllllllIlI.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException(
               "me/octo/client/modules/impl/macros/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl", var14
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
         lllIllIlIlIllIIIIlIIIIIlIlIIlIIlllIIIllIIIIllIIIlllIIllIlIlllIllIIIlIlllIIlllIllIlIII[var3] = var15;
      }

      return lllIllIlIlIllIIIIlIIIIIlIlIIlIIlllIIIllIIIIllIIIlllIIllIlIlllIllIIIlIlllIIlllIllIlIII[var3];
   }

   private static long IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl(
      Lookup var0, MutableCallSite var1, String var2, Object[] var3
   ) {
      int var4 = (Integer)var3[0];
      long var5 = (Long)var3[1];
      long var7 = IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll(var4, var5);
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
            "me/octo/client/modules/impl/macros/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl"
               + " : "
               + var1
               + " : "
               + var2.toString(),
            var5
         );
      }
   }

   private final LivingEntity IIIlIllllIlIlllIllllIllllIlIllIllIllIlIIlIIlIIIIllIIIllIIIIlIIIIlIllIIlllIIIlIllllIlI$recovered$4aa1b7b369e5e83d(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void lIIllIlIlIIlIlIIIIllIllIIIIIIlIIlIIIIIIllIIIIlIllIlllIIIIlIllIlIIllllllIIlIIIIlIIIlII$recovered$8cd8d1d5cc2e49b6(long var1) {
      var1 = 55058566770365L;
      var1 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var1;
      long var3 = var1 ^ 133633501274378L;
      long var5 = System.currentTimeMillis();
      this.lIllIIllIIllIIIlIlIlIIlllllllIllIIllIlIlIIlIlIIlIIlllIIlIlIIlIllIlIllIllIIllIlllIIlII
         .entrySet()
         .removeIf(GhostMacro::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI);
   }

   private final void lllIIllIIIlIlIIIlIIlIlIlIIIIIIIIlIlllllIIIIlllIIllIllllIllIIIlIIIIIlIllIIllllIIIlllll$recovered$1796e49eaf1ca7df(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static final double IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII$recovered$2a362f06ad00a55e(
      long var0, GhostMacro var2, Creeper var3
   ) {
      var0 = 31075926306239L;
      var0 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var0;
      long var4 = var0 ^ 7116401525635L;
      return var2.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$c50b99bc2f7b95d2(var3, var4);
   }

   private final boolean llIIlIllllIlIIIIIIIIIIlllllIIIIlIIllIlllllIlIllIlIIIIlIIlllllllIllIIIllIlIlllIIllIIlI$recovered$ccd12ecbd78c3faf(long param1) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$b8694060aa37d1cf(
      long argument1Arg,
      @NotNull me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll locationArg,
      int argument3Arg
   ) {
      argument1Arg = 78730267773082L;
      long var5 = argument1Arg ^ 63209871364372L;
      long var7 = argument1Arg ^ 113503648575998L;
      long var9 = argument1Arg ^ 0L;
      long var11 = argument1Arg ^ 69451990948941L;
      Intrinsics.checkNotNullParameter(locationArg, "location");
      super.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$239fc8b35ef3c4bc(var9, locationArg, argument3Arg);
      this.IIIllIIlIIlllllIlIlIIIIllIIIIlIlIlllIlIlIlIlIIlIIIlIIllIllIIIIIllllllIlIlIIIIIIIlllll
         .IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII$recovered$1183759324039697(var5);
      me.octo.client.modules.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl
         .lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll()
         .lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl$recovered$965bb352d7d8653b(var11);
      IlllIlIIlllIIlIIIIIllllIIIIIlIIllllIlllIIIIlIIllIlIlIllIIlIIIIllllIlIlIllIlIlIlIIlIll.lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl$recovered$c8607e0a24bfc0e0(
         var7
      );
      this.lIIlIIIllIlllIlIIlIlIIIllllllIlIIlIIlIIIlIIIlllIIIIIlllIIlllIIllllIlllIlIIlIlIllIlIII();
   }

   private final double IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$c50b99bc2f7b95d2(
      Creeper param1, long param2
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   public static final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$f90e102f36a866ea(
      GhostMacro var0, long var1, me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var3
   ) {
      var1 = 62177067434693L;
      var1 = lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl ^ var1;
      long var10001 = var1 ^ 104321556733059L;
      int var4 = (int)((var1 ^ 104321556733059L) >>> 48);
      int var5 = (int)((var1 ^ 104321556733059L) << 16 >>> 32);
      int var6 = (int)(var10001 << 48 >>> 48);
      var0.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$07a7733128e337d5((short)var4, var5, var6, var3);
   }

   private final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII$recovered$5e5d241c1b8f3b75(
      short param1, int param2, int param3, char param4
   ) {
      // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
   }

   private final void IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$07a7733128e337d5(
      short var1, int var2, int var3, me.octo.client.modules.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var4
   ) {
      byte var17 = 0;
      var2 = 1218565680;
      short var19 = 5604;
      long var5 = ((long)var17 << 48 | (long)var2 << 32 >>> 16 | (long)var19 << 48 >>> 48)
         ^ lIIIIlIllIlIlIllIllIlIIlIIIIlIIlllllIlIIIllIIIlIlIlIIIIlllIIlIllIIlIIlIllIlIlIlIIllIl;
      long var10001 = var5 ^ 98183392276552L;
      int var7 = (int)((var5 ^ 98183392276552L) >>> 48);
      int var8 = (int)((var5 ^ 98183392276552L) << 16 >>> 32);
      int var9 = (int)(var10001 << 48 >>> 48);
      var10001 = var5 ^ 64586552993991L;
      int var10 = (int)((var5 ^ 64586552993991L) >>> 32);
      int var11 = (int)((var5 ^ 64586552993991L) << 32 >>> 48);
      int var12 = (int)(var10001 << 48 >>> 48);
      var10001 = var5 ^ 101250758749629L;
      int var13 = (int)((var5 ^ 101250758749629L) >>> 32);
      int var14 = (int)((var5 ^ 101250758749629L) << 32 >>> 48);
      int var15 = (int)(var10001 << 48 >>> 48);
      IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl var10000 = this.IlllIIlllIIIIIlllIllIIIIIIlIIIIIIllIllIlIlIlIIlIllIlIlllIIIlIIllIlIIlllIIIIlIIIIlllII();
      IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll var16 = new IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll(
         me.octo.client.modules.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.DWARVEN_FORGE,
         GhostMacro::IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl,
         var4.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl(),
         0,
         0,
         0L,
         0,
         GhostMacro::IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll,
         120,
         null
      );
      var10000.IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$2dea6c7ec1619410(
         var10, (short)var11, var16, (short)var12
      );
   }

   private static final class IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @Nullable
      private final List<me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 32192622895069L;
      private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static Map lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap(13);

      public IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(
         int var1,
         int var2,
         boolean var3,
         @Nullable List<me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> var4
      ) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      }

      public final int IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final List<me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final List<me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final GhostMacro.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         int var1,
         int var2,
         boolean var3,
         @Nullable List<me.octo.client.utils.player.pathfinder.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll> var4
      ) {
         return new GhostMacro.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI(var1, var2, var3, var4);
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 17740341558714L;
         List var3 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         boolean var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var5 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var6 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         return "PrefetchedGhostPath(fromTargetId=" + var6 + ", targetId=" + var5 + ", directOnly=" + var4 + ", path=" + var3 + ")";
      }

      @Override
      public int hashCode() {
         long var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 110495829213269L;
         int[] var10000 = GhostMacro.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl();
         int var4 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         int[] var3 = var10000;
         int var9 = var4 * 31;
         GhostMacro.IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI var10001 = this;
         if (var3 == null) {
            var4 = var9 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
            var4 = var4 * 31 + Boolean.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);

            try {
               var9 = var4 * 31;
               if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == null) {
                  return var9 + 0;
               }
            } catch (MatchException var6) {
               throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var6);
            }

            var10001 = this;
         }

         return var9 + var10001.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 84676836598990L;
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
         String var6 = "Ð\u009bH\u0081¿ÜD4È×8¦N/JÙâË\u0015Àb\u0001@\u0096\u0091\u0083Â¯e*^tuR\u0007æ\u0014\f¿\u008d%yøú/ÒüI¼¿\u001c\u008eÈó-Ê2Ò\\õÈ/\u008d¡ \u008e\u001ab\u008a,Ð\u0097V\bã\u0096'dJ5ùú¬Ê\u0088Áî\u001a\u009dªGàAó§Aa";
         int var8 = "Ð\u009bH\u0081¿ÜD4È×8¦N/JÙâË\u0015Àb\u0001@\u0096\u0091\u0083Â¯e*^tuR\u0007æ\u0014\f¿\u008d%yøú/ÒüI¼¿\u001c\u008eÈó-Ê2Ò\\õÈ/\u008d¡ \u008e\u001ab\u008a,Ð\u0097V\bã\u0096'dJ5ùú¬Ê\u0088Áî\u001a\u009dªGàAó§Aa"
            .length();
         char var5 = '@';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "\u0010í¿ëÜÄûÊb¨\u009dº!\u009fÖR\u0018\u009f0Ê\u0004\u0082\u001e\u0019(Q\u0087¼\u0018ù\t«+Ï!>\rÿPo[";
               var8 = "\u0010í¿ëÜÄûÊb¨\u009dº!\u009fÖR\u0018\u009f0Ê\u0004\u0082\u001e\u0019(Q\u0087¼\u0018ù\t«+Ï!>\rÿPo[".length();
               var5 = '\u0010';
               var4 = -1;

               while (true) {
                  var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                  boolean var19 = false;
                  var9[var7++] = var23;
                  if ((var4 += var5) >= var8) {
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var9;
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new String[4];
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 32071;
         if (IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5] == null) {
            Object[] var4;
            try {
               Long var3 = Thread.currentThread().threadId();
               var4 = (Object[])lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.get(var3);
               if (var4 == null) {
                  var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.put(var3, var4);
               }
            } catch (Exception var10) {
               throw new RuntimeException(
                  "me/octo/client/modules/impl/macros/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI",
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
            byte[] var9 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5].getBytes("ISO-8859-1");
            IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               ((Cipher)var4[0]).doFinal(var9)
            );
         }

         return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5];
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
               "me/octo/client/modules/impl/macros/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$IIIIIIIIlIIIIIlIlllIllllIllllIlIlllIIllIIlllIIIlIIIlllIlIlIlIIlllIIlllIIIIIlIIIlIIllI"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }

   private static final class IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll {
      private final double IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @Nullable
      private final Double lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final double IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final double lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final double IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final double IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      @Nullable
      private final Function1<Creeper, Boolean> IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      @Nullable
      private final Function1<Creeper, Boolean> lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      private static long IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = 69685924695770L;

      public IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll(
         double var1,
         @Nullable Double var3,
         double var4,
         double var6,
         double var8,
         double var10,
         @Nullable Function1<? super Creeper, Boolean> var12,
         @Nullable Function1<? super Creeper, Boolean> var13
      ) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var3;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var4;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var6;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = var8;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var10;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = var12;
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = var13;
      }

      public final double IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @Nullable
      public final Double llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final double IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final double IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final double lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final double IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      @Nullable
      public final Function1<Creeper, Boolean> IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      @Nullable
      public final Function1<Creeper, Boolean> IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         int argument1Arg, @NotNull Creeper eArg, boolean argument3Arg, int argument4Arg
      ) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(@NotNull Creeper eArg, long argument2Arg) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      public final boolean llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(long argument1Arg, @NotNull Creeper eArg) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      public final boolean IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll != null;
      }

      private static MatchException IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(MatchException var0) {
         return var0;
      }

      public final boolean IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI$recovered$c4daecdb29028e84(
         int argument1Arg, @NotNull Creeper eArg, boolean argument3Arg, int argument4Arg
      ) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }
   }

   private static final class IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll {
      @NotNull
      private final GhostMacro.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII combatState;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @Nullable
      private final Vec3 lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private final boolean IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private final boolean IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private final boolean IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private final boolean lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      @Nullable
      private final BlockPos IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      private final int llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      private final int lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      private final int lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      private final boolean lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      private final boolean lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      @NotNull
      private final Triple<Integer, Integer, Integer> playerPos;
      private static long llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI = 53129449519017L;
      private static String[] IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl;
      private static String[] IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl;
      private static Map IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll = new HashMap(13);

      public IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
         @NotNull GhostMacro.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII combatStateArg,
         int argument2Arg,
         int argument3Arg,
         @Nullable Vec3 argument4Arg,
         boolean argument5Arg,
         boolean argument6Arg,
         boolean argument7Arg,
         boolean argument8Arg,
         @Nullable BlockPos argument9Arg,
         int argument10Arg,
         int argument11Arg,
         int argument12Arg,
         boolean argument13Arg,
         boolean argument14Arg,
         @NotNull Triple<Integer, Integer, Integer> playerPosArg
      ) {
         long var16 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI ^ 97990797103559L;
         Intrinsics.checkNotNullParameter(combatStateArg, "combatState");
         Intrinsics.checkNotNullParameter(playerPosArg, "playerPos");
         super();
         this.combatState = combatStateArg;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = argument2Arg;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = argument3Arg;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = argument4Arg;
         this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = argument5Arg;
         this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = argument6Arg;
         this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = argument7Arg;
         this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = argument8Arg;
         this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII = argument9Arg;
         this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI = argument10Arg;
         this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl = argument11Arg;
         this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI = argument12Arg;
         this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl = argument13Arg;
         this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll = argument14Arg;
         this.playerPos = playerPosArg;
      }

      @NotNull
      public final GhostMacro.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII getCombatState() {
         return this.combatState;
      }

      public final int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final Vec3 IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final boolean lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final boolean IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final boolean IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final boolean IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      @Nullable
      public final BlockPos IIlIlIlllllIIlIllIllIlIlIlIllIIllIIlIlIllIlllIlllIIlIIIIIlIllllllIIIlllllIlllIIIIlIIl() {
         return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      public final int IIlIllllIlIllIlIIIlIlllIlIIlIlIIIIIllIIIIllIIIIIlllIlIllllIIIlIlIllIlIIIIIIIllIlIIIll() {
         return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      public final int lIIIIIlIlIIlllIlIIIllIlIllIlIIllIlllIIllllIlIIllIlllIIIlIlIllllllIllIlllIllIlIIlIllIl() {
         return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      public final int IIIIIllIIllIlIIllIllIIIIIIlllIlIIIIlllIlIIlIlIlIlIIllIlIllIlllIIllIIlIIlllIIllIIIIlIl() {
         return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      public final boolean IIIlllllIIIlIIllIllllIIllIIIlllllIlIlIllIIllIIllIlIIIlIlIIllIlIIlllIIIIlllIlIlllllllI() {
         return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      }

      public final boolean IlIllIIIIIlllIlllIlllIllIIIIIIIIlIIlIlllIIlllIIIIlIlIlIlIIlIllllIIllIIIlIlIlIIIIllIII() {
         return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> getPlayerPos() {
         return this.playerPos;
      }

      public final int llllIIllIlIlIlIlllIIIIlIIllIlllIIIIIlllIlIIlIIIlllIIIlIlIIlIllIIlIIlIllIIIllIllIIIIIl() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int lIIlIIIllIIIllIllIIlIIIIlllIllIIlIlIIlIllIlIllllllllIllIllllIlIIlIIIllIIllIIlllllIllI() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @Nullable
      public final Vec3 IlIllIIIIllllIIlIlIlIlIlIllIIlIIIIlIIIlIIIllllIIIIlIlIlllIlIlIIIllIIllIllIIIllIIlllll() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final boolean IIlIIIllllllIIIlllIlIIlIllIlIIllIlIIlIIIIIIIIlIIIlllIlllIIllllIIlIIIIlIlIIIllllIIlllI() {
         return this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      }

      public final boolean lllIIllIIlIlIlIIIIIlIIIllIIlIlIIllIlIIIlIlIlIIIlIIlIlIlIllIllllIlllIIlIlIIllIlIlIllIl() {
         return this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      }

      public final boolean lIlIIllIIlIIlIIlIlIllllllIlIlIlllIlIIIllIIIIlIlIllIllIIIlIIIIIIIlllIIllIIllIlIllIllIl() {
         return this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      }

      public final boolean IIlllIlllIlIIIlIIIlllIlllIlIIllIlIlIIIIIlIIIllIIlIllllllIlIllIIIlllIlllllIlIlllllllll() {
         return this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
      }

      @Nullable
      public final BlockPos llIIIllIIIIllllllIIIlIIIIIIIlllIIllllIlllIlIlIIlIIIIlIIIlllllIIllIllllllIlIIlIIlIlIII() {
         return this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
      }

      public final int IIIlIlIllllIlIlIIIIIIlIIllllIllIllIlIllIlIIllIIIllIIIlllIllIIlIlllIIIllIIlIllIIllllIl() {
         return this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
      }

      public final int IlIlIlIlIlIlIlIlIllIIlIlIlIlIlIIIllllIlIIIlIIIIIIlIlIlIIllllIlIIIIlllIIlIIIlllIIIIlII() {
         return this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
      }

      public final int lIlIlIlIIIlIlIIIIIIIIIIIlIllIIIIIIIllIIIIlIIIIIlIllIIIIlIIIIlIIlIllIllIlIlIllIIIlIlll() {
         return this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
      }

      public final boolean IIIIIlIIlIlIlllIlIIlllIIIlIlllIllIllIllIllIlIIIIIIIIIlIlIlIllIlIlIlIllIlIIlIlIllIIIIl() {
         return this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
      }

      public final boolean IlllIllIIIIIlIIlIlIIIIlIIlIIIIIlIlIlIlIllIIIlIIlllllIIllIIlIlllIlIIIllIIlIlIIllllllll() {
         return this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
      }

      @NotNull
      public final GhostMacro.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         @NotNull GhostMacro.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var1,
         int var2,
         int var3,
         @Nullable Vec3 var4,
         boolean var5,
         boolean var6,
         boolean var7,
         boolean var8,
         @Nullable BlockPos var9,
         int var10,
         int var11,
         int var12,
         boolean var13,
         long var14,
         boolean var16,
         @NotNull Triple var17
      ) {
         var14 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI ^ var14;
         Intrinsics.checkNotNullParameter(
            var1, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(6900, 9151461767794186172L ^ var14)
         );
         Intrinsics.checkNotNullParameter(
            var17, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"v">(957, 2611402806836285169L ^ var14)
         );
         return new GhostMacro.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll(
            var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var16, var17
         );
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI ^ 77294151382262L;
         Triple var3 = this.playerPos;
         boolean var4 = this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll;
         boolean var5 = this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl;
         int var6 = this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI;
         int var7 = this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl;
         int var8 = this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI;
         BlockPos var9 = this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII;
         boolean var10 = this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll;
         boolean var11 = this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
         boolean var12 = this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
         boolean var13 = this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
         Vec3 var14 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         int var15 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var16 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         GhostMacro.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII var17 = this.combatState;
         return "GhostCombatProgress(combatState="
            + var17
            + ", targetId="
            + var16
            + ", directWalkTargetId="
            + var15
            + ", lastPathTargetPos="
            + var14
            + ", ghostWalkerFinished="
            + var13
            + ", ghostWalkerFailed="
            + var12
            + ", ghostWalkerComputing="
            + var11
            + ", idleWalking="
            + var10
            + ", idleWaypoint="
            + var9
            + ", cachedGhosts="
            + var8
            + ", blacklisted="
            + var7
            + ", prefetchedPaths="
            + var6
            + ", prefetchRunning="
            + var5
            + ", idlePrefetchRunning="
            + var4
            + ", playerPos="
            + var3
            + ")";
      }

      @Override
      public int hashCode() {
         int[] var3;
         int var30;
         int var32;
         label63: {
            long var1 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI ^ 58778735666592L;
            int[] var10000 = GhostMacro.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl();
            int var4 = this.combatState.hashCode();
            var4 = var4 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
            var3 = var10000;
            int var9 = var4 * 31;
            GhostMacro.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var10001;
            if (var3 == null) {
               var4 = var9 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);

               try {
                  var30 = var4 * 31;
                  if (this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI == null) {
                     var32 = 0;
                     break label63;
                  }
               } catch (MatchException var15) {
                  throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var15);
               }

               var10001 = this;
            } else {
               var30 = var9;
               var10001 = this;
            }

            var32 = var10001.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI.hashCode();
         }

         label64: {
            int var18 = var30 + var32;
            var18 = var18 * 31 + Boolean.hashCode(this.IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII);
            int var11 = var18 * 31;
            GhostMacro.IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll var33;
            if (var3 == null) {
               var18 = var11 + Boolean.hashCode(this.IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI);
               var18 = var18 * 31 + Boolean.hashCode(this.IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll);
               var18 = var18 * 31 + Boolean.hashCode(this.lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll);

               try {
                  var30 = var18 * 31;
                  if (this.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII == null) {
                     var32 = 0;
                     break label64;
                  }
               } catch (MatchException var14) {
                  throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var14);
               }

               var33 = this;
            } else {
               var30 = var11;
               var33 = this;
            }

            var32 = var33.IlIIlllIllIIlIlllIlIIlIIlIIIlllIIIllIlIllllllIlllIIIIIIlIlIIIIllIIlllIIlIlIIIIlllllII.hashCode();
         }

         int var23 = var30 + var32;
         var23 = var23 * 31 + Integer.hashCode(this.llIllIllIllllllIllIlIIIlIllIIlIlIllIllIllIIIllIIlIlIIIllllllllIllIlllllIlIIlIlIlllllI);
         var23 = var23 * 31 + Integer.hashCode(this.lIIIIIIlllIlllllIlllIllIIIlIlllIllIlIllIIIlllIlIllIlIllllllIIlIIlIlllIIIlIIIlIIlIlIIl);
         var23 = var23 * 31 + Integer.hashCode(this.lllIlIIIIIllIIIIlllIlllIIIlllIllllIIIlIIlIlIIlllIIIIIlIllIlIlIlllIlIIlllIIlIlIIlllIlI);
         var23 = var23 * 31 + Boolean.hashCode(this.lIIlIlIlIllIlIIIlllIllllIllIIlllllIlIlIIlIIlIIlIIlllIlllIIllIIlllIIIIIlIIIIIlIlllllIl);
         var23 = var23 * 31 + Boolean.hashCode(this.lIlIIIlIlIllllIlIIllIIllIIIIllllIIlIIlllIlIIIlIIlIIIlllIlIllIIlIllllIIIlIlIllIIllIlll);
         var23 = var23 * 31 + this.playerPos.hashCode();

         try {
            if (me.octo.client.utils.IIIlIlllIlllIIIIlllIIIlIIlIlIIlIlIlIlIIIllIIIlllllllIlIlIlIIIIllllIllIllIIIlllIlIIlll.IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII()
               == null) {
               int[] var7 = new int[5];
               GhostMacro.llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(
                  var7
               );
            }

            return var23;
         } catch (MatchException var13) {
            throw IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var13);
         }
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = llIIlIIIlIlIlIIIllIlIlllllllllIllIlIlIIIlIlIllIllIIIllIIlllllIIllIlIIlIllllIlIllIlllI ^ 39026571619667L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[19];
         int var7 = 0;
         String var6 = "b¨)ãë¦r\u008b{ÝðÜf®'4.\u0088\u0010ø« e(\u0019Ï\u0085ÒÂý=s\u0004&\u008dï¹V¶8\u0018¯\u0082Á\u009bÁ§¢õj¾ö\u0016Y/óÆ\u0089¹tïºÆi\"\u0018?¬S\u008cQÝ,\t\"Z\u0007\u0094¶dÈÎD·í&±À^\u0087 z\u0018ÑBÉ!Þê\u0007Ñ\u0093Wð¾Â\u0096L¨µ\u008d×f\nò>óKÔXt\u0011£(Ë\u0088æ²\u007fï¾¼à\u000e\u0011æ\u0005øÂI\u0081w\u008a\u009fwì¤H\u00028\u000e,}ß¡=¾X\u008aÝ\u0085¥*z ½ìÙ\u0095\u0012>k»B\u0013\u0018?\u008b=Ïú\u0092\\ðÔmL÷å\u0016(Ó¡KøÀø\u0018\u008bê¹X$r°dô\n)\u000e\u0011}Z,\u000eA&\u0015/k.2(k-Qër\u008d\u0001~\u001d\u0014´á\u00066\u0010¯r%K´Òëz\u0014\"Ê7\u0006\u000b\u0081\u009e\u0099\u00adù¥\u0013è«Ý\u0098 =êß\u0019lT·z\u0007uz\u001bÏÃ\u0094\u008dUm·¼© Äo\u0016½»:{?\\\" ÏJî¥9Æ2[©úÙ¡\u001a\u0087Ø\u0000í_K\u009d¥L\u000eKï#\u0012Àúáëz0ÆÇê@ñÿ~Ã3Úá\u0099îq±^°\u009bü\u0085'\u0082p\\¤/'4ø:é\u0003cõ\u0001/H\u0010\u0095m\u0018dÌ\fg#È| \u0019&\u001e\u0018ë^oÉ³Ì÷\u000f5ç\u001f\u001c\u0091(+\u0001D\u00907\u009asï:÷ù¤i]\u0018ws¼XO}aeV>xGhìÖ-\u0019\u007f\\yâ\u0000\u008c; Pè¯zú\u00ad)\u001cÍU\u008eõ§?¾\u008c\u0093\u009a\u0016&ªÕp\u0000\u008c1çR·:lg(².\u0011\u0098\u000eÆm7\u001a3·¢\u0085\u008b\u000b¿\u0097#:øc\u0094h5ôúê¤\u0080\u0005Ø\u0093í&wF\u0089\u0016\u008ba(ý×\u0085?\u0011ùë%v\u0001Û^(Åq»\u009d7\u0014×¤Ï\u0015¸sè\u0011¤ý\u009e}\u0014\u0016\u0093\u009es¤¶=n(&\u0083\u0018\\\u0094§æCI¨\u008bXÞ¹\u0089¬g$¬V\u00023iä\u001a\u009b\u009b¤u\u0091U\u001fW°\u0004é5¶\u0099\u0096";
         int var8 = "b¨)ãë¦r\u008b{ÝðÜf®'4.\u0088\u0010ø« e(\u0019Ï\u0085ÒÂý=s\u0004&\u008dï¹V¶8\u0018¯\u0082Á\u009bÁ§¢õj¾ö\u0016Y/óÆ\u0089¹tïºÆi\"\u0018?¬S\u008cQÝ,\t\"Z\u0007\u0094¶dÈÎD·í&±À^\u0087 z\u0018ÑBÉ!Þê\u0007Ñ\u0093Wð¾Â\u0096L¨µ\u008d×f\nò>óKÔXt\u0011£(Ë\u0088æ²\u007fï¾¼à\u000e\u0011æ\u0005øÂI\u0081w\u008a\u009fwì¤H\u00028\u000e,}ß¡=¾X\u008aÝ\u0085¥*z ½ìÙ\u0095\u0012>k»B\u0013\u0018?\u008b=Ïú\u0092\\ðÔmL÷å\u0016(Ó¡KøÀø\u0018\u008bê¹X$r°dô\n)\u000e\u0011}Z,\u000eA&\u0015/k.2(k-Qër\u008d\u0001~\u001d\u0014´á\u00066\u0010¯r%K´Òëz\u0014\"Ê7\u0006\u000b\u0081\u009e\u0099\u00adù¥\u0013è«Ý\u0098 =êß\u0019lT·z\u0007uz\u001bÏÃ\u0094\u008dUm·¼© Äo\u0016½»:{?\\\" ÏJî¥9Æ2[©úÙ¡\u001a\u0087Ø\u0000í_K\u009d¥L\u000eKï#\u0012Àúáëz0ÆÇê@ñÿ~Ã3Úá\u0099îq±^°\u009bü\u0085'\u0082p\\¤/'4ø:é\u0003cõ\u0001/H\u0010\u0095m\u0018dÌ\fg#È| \u0019&\u001e\u0018ë^oÉ³Ì÷\u000f5ç\u001f\u001c\u0091(+\u0001D\u00907\u009asï:÷ù¤i]\u0018ws¼XO}aeV>xGhìÖ-\u0019\u007f\\yâ\u0000\u008c; Pè¯zú\u00ad)\u001cÍU\u008eõ§?¾\u008c\u0093\u009a\u0016&ªÕp\u0000\u008c1çR·:lg(².\u0011\u0098\u000eÆm7\u001a3·¢\u0085\u008b\u000b¿\u0097#:øc\u0094h5ôúê¤\u0080\u0005Ø\u0093í&wF\u0089\u0016\u008ba(ý×\u0085?\u0011ùë%v\u0001Û^(Åq»\u009d7\u0014×¤Ï\u0015¸sè\u0011¤ý\u009e}\u0014\u0016\u0093\u009es¤¶=n(&\u0083\u0018\\\u0094§æCI¨\u008bXÞ¹\u0089¬g$¬V\u00023iä\u001a\u009b\u009b¤u\u0091U\u001fW°\u0004é5¶\u0099\u0096"
            .length();
         char var5 = '(';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "ÿÍ\u008d´®ÁW¼\u0005ÆK5N7\u0012öô¢\u0002¡\u0097\u001bï\u0013Æ<\u0091uýësp\u0088±®¾ú\u0099K\t@\u000fFÎ\t\u009a¹l\u0098Y\u0016\u0096\u0016t ÔÏÄÒ\u001d¾Á_UÜ4mm9\u00adÒ;Óg3î¡eÓèRéÆ¶\u0090\u0089õTC±ÀN>Ü50\u0015\u0005\u009c\u0017ÖA@\u0007Þ";
               var8 = "ÿÍ\u008d´®ÁW¼\u0005ÆK5N7\u0012öô¢\u0002¡\u0097\u001bï\u0013Æ<\u0091uýësp\u0088±®¾ú\u0099K\t@\u000fFÎ\t\u009a¹l\u0098Y\u0016\u0096\u0016t ÔÏÄÒ\u001d¾Á_UÜ4mm9\u00adÒ;Óg3î¡eÓèRéÆ¶\u0090\u0089õTC±ÀN>Ü50\u0015\u0005\u009c\u0017ÖA@\u0007Þ"
                  .length();
               var5 = '(';
               var4 = -1;

               while (true) {
                  var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                  boolean var19 = false;
                  var9[var7++] = var23;
                  if ((var4 += var5) >= var8) {
                     IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl = var9;
                     IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl = new String[19];
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 25979;
         if (IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl[var5] == null) {
            Object[] var4;
            try {
               Long var3 = Thread.currentThread().threadId();
               var4 = (Object[])IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.get(var3);
               if (var4 == null) {
                  var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  IIllllIllllIIIIllIIlIllIIlIllIlIlllIlIlIlIIIllIllIllIllIlIIIlllIlllIlIllllIlIIlIIllll.put(var3, var4);
               }
            } catch (Exception var10) {
               throw new RuntimeException(
                  "me/octo/client/modules/impl/macros/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll",
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
            byte[] var9 = IllIlllIlIIlIlIllIlllIlIlIIIIIIIllllllIIIIIllIIIlIlIllllIlllIllIllllIllllIlllllIllIIl[var5].getBytes("ISO-8859-1");
            IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               ((Cipher)var4[0]).doFinal(var9)
            );
         }

         return IlIlIlIIIIIlIllllllIllIIIIllIlIIlIIIlllllIllIIlIIlIIIllIlIlIIllIlIIllIIllllIlIIllIlIl[var5];
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
               "me/octo/client/modules/impl/macros/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$IIlllIlIIIlllllllIIlllllIIIlIIllIIlllIlllllIIlIllllIIlllIIllllIIlIlIllllIllIlllllIlll"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }

   private static final class IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final boolean IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      @NotNull
      private final Triple<Integer, Integer, Integer> playerPos;
      private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 84870750446534L;
      private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static Map lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap(13);

      public IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(
         int argument1Arg, int argument2Arg, boolean argument3Arg, @NotNull Triple<Integer, Integer, Integer> playerPosArg
      ) {
         long var5 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 76593852389820L;
         Intrinsics.checkNotNullParameter(playerPosArg, "playerPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = argument1Arg;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = argument2Arg;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = argument3Arg;
         this.playerPos = playerPosArg;
      }

      public final int IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final Triple<Integer, Integer, Integer> getPlayerPos() {
         return this.playerPos;
      }

      public final int lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final boolean IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      @NotNull
      public final GhostMacro.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         long var1, int var3, int var4, boolean var5, @NotNull Triple var6
      ) {
         var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ var1;
         Intrinsics.checkNotNullParameter(
            var6, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"w">(30108, 6010271798764103299L ^ var1)
         );
         return new GhostMacro.IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI(var3, var4, var5, var6);
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 123127598343371L;
         Triple var3 = this.playerPos;
         boolean var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var5 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var6 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         return "RouteProgress(routeIndex=" + var6 + ", routeSize=" + var5 + ", walkerFinished=" + var4 + ", playerPos=" + var3 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1 = var1 * 31 + Boolean.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         return var1 * 31 + this.playerPos.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 131967710618972L;
         Cipher var2;
         Cipher var10000 = var2 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var0 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var3 = 1; var3 < 8; var3++) {
            var10003[var3] = (byte)(var0 << var3 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var9 = new String[6];
         int var7 = 0;
         String var6 = "e!u\u001aI\u0012ºçáVÇ%´\r¨\u0098dH\u0082½S¿£-\u000fü\u000f\u0087£Í¶êhU&å\u0091üP\n çÙ(¡\"6-\b\u0098@YÕ¡¢\u0082A\u007f1Oú\u001a«\u008a\u0018£wa^Ö®uÿ08Ý¯JÇ\u000f\u0093Õu{kßõÅ4>SÆd¿xé]ÒG4Ê\u001b\\\u0094\u009du\u0083'|òÝÊÿðôüK+6@\u0093g `\u009b7\u009e\tû{\u000f;9ûÄ\u00ad\u009d bâÏ?ñ÷)\u0007!\u0093ÛüÓßb6\u0018";
         int var8 = "e!u\u001aI\u0012ºçáVÇ%´\r¨\u0098dH\u0082½S¿£-\u000fü\u000f\u0087£Í¶êhU&å\u0091üP\n çÙ(¡\"6-\b\u0098@YÕ¡¢\u0082A\u007f1Oú\u001a«\u008a\u0018£wa^Ö®uÿ08Ý¯JÇ\u000f\u0093Õu{kßõÅ4>SÆd¿xé]ÒG4Ê\u001b\\\u0094\u009du\u0083'|òÝÊÿðôüK+6@\u0093g `\u009b7\u009e\tû{\u000f;9ûÄ\u00ad\u009d bâÏ?ñ÷)\u0007!\u0093ÛüÓßb6\u0018"
            .length();
         char var5 = '(';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "'Äù\u001bñâ'À'Yªÿ\u00007ã£ \u0080ÒT\u0012Ûv¤|{\u0080E\u009b\u0013uÜ\u0018µ©²ÿß\nß$óÿð|\u0097\u0082ßaRØ\u0080\"(L\u0013ò";
               var8 = "'Äù\u001bñâ'À'Yªÿ\u00007ã£ \u0080ÒT\u0012Ûv¤|{\u0080E\u009b\u0013uÜ\u0018µ©²ÿß\nß$óÿð|\u0097\u0082ßaRØ\u0080\"(L\u0013ò".length();
               var5 = ' ';
               var4 = -1;

               while (true) {
                  var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                  boolean var19 = false;
                  var9[var7++] = var23;
                  if ((var4 += var5) >= var8) {
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var9;
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new String[6];
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 6724;
         if (IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5] == null) {
            Object[] var4;
            try {
               Long var3 = Thread.currentThread().threadId();
               var4 = (Object[])lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.get(var3);
               if (var4 == null) {
                  var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.put(var3, var4);
               }
            } catch (Exception var10) {
               throw new RuntimeException(
                  "me/octo/client/modules/impl/macros/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI",
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
            byte[] var9 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5].getBytes("ISO-8859-1");
            IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               ((Cipher)var4[0]).doFinal(var9)
            );
         }

         return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5];
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
               "me/octo/client/modules/impl/macros/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$IlIllIIllIIIlllIlIIlIlIIIIIIlIIlIIlllIIIlIllIllllIlIIlIIlllIIIllIllIllIIlIIIlllllIllI"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }

   private static final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      @NotNull
      private final BlockPos pathPos;
      private static long IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = 88576596508681L;
      private static String[] lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static String[] IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII;
      private static Map IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = new HashMap(13);

      public IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(int argument1Arg, @NotNull BlockPos pathPosArg) {
         long var3 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 51155409472069L;
         Intrinsics.checkNotNullParameter(pathPosArg, "pathPos");
         super();
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = argument1Arg;
         this.pathPos = pathPosArg;
      }

      public final int IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final BlockPos getPathPos() {
         return this.pathPos;
      }

      public final int IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      @NotNull
      public final GhostMacro.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         int var1, long var2, @NotNull BlockPos var4
      ) {
         var2 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ var2;
         Intrinsics.checkNotNullParameter(
            var4, IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI<"n">(21966, 228749612869299916L ^ var2)
         );
         return new GhostMacro.IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI(var1, var4);
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 23519348702722L;
         return "GhostCandidateSnapshot(id="
            + this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
            + ", pathPos="
            + this.pathPos
            + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         return var1 * 31 + this.pathPos.hashCode();
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl ^ 93991079623269L;
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
         String var6 = "¶ü\u00983\u0087Êý\u0083d^?ó\u0096yCÅ\u0010jwØO\u008f\u009dÉ»:\u0007-¦aýLÌ";
         int var8 = "¶ü\u00983\u0087Êý\u0083d^?ó\u0096yCÅ\u0010jwØO\u008f\u009dÉ»:\u0007-¦aýLÌ".length();
         char var5 = '\u0010';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "`´b¼§£xc\u008c¯üÁ\u007f'kèñ\u0093¾jYá=Ç\u001a4&à ìW[´\u0001?\u0084\u0095úÉL\tï9ðê*\u001ai~\u0003Ä\u0001Á¥õ'\u0018D«'è-\u001eMð\tô\u008dÀ<\u009b\u00939åj¸\u009f7ï\u0090Í";
               var8 = "`´b¼§£xc\u008c¯üÁ\u007f'kèñ\u0093¾jYá=Ç\u001a4&à ìW[´\u0001?\u0084\u0095úÉL\tï9ðê*\u001ai~\u0003Ä\u0001Á¥õ'\u0018D«'è-\u001eMð\tô\u008dÀ<\u009b\u00939åj¸\u009f7ï\u0090Í"
                  .length();
               var5 = '8';
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 21483;
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
                  "me/octo/client/modules/impl/macros/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI",
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
               "me/octo/client/modules/impl/macros/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI"
                  + " : "
                  + var1
                  + " : "
                  + var2.toString(),
               var5
            );
         }
      }
   }

   private static enum lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII {
      SCAN,
      PATH,
      ATTACK;

      @NotNull
      public static EnumEntries<GhostMacro.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII> IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      // $VF: Failed to inline enum fields
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      static {
         long var9 = 75354904100872L ^ 24962165117350L;
         Cipher var1;
         Cipher var10000 = var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
         SecretKeyFactory var10002 = SecretKeyFactory.getInstance("DES");
         byte[] var10003 = new byte[]{(byte)(var9 >>> 56), 0, 0, 0, 0, 0, 0, 0};

         for (int var2 = 1; var2 < 8; var2++) {
            var10003[var2] = (byte)(var9 << var2 * 8 >>> 56);
         }

         var10000.init(2, var10002.generateSecret(new DESKeySpec(var10003)), new IvParameterSpec(new byte[8]));
         String[] var0 = new String[3];
         int var6 = 0;
         String var5 = "\u0019\u0080§x-\u0080U4\b\u0014_È¡2Ó\u008b(\b«f }\u001d)4Ì";
         int var7 = "\u0019\u0080§x-\u0080U4\b\u0014_È¡2Ó\u008b(\b«f }\u001d)4Ì".length();
         char var4 = '\b';
         int var3 = -1;

         while (true) {
            byte[] var8 = var1.doFinal(var5.substring(++var3, var3 + var4).getBytes("ISO-8859-1"));
            String var13 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var8).intern();
            byte var10001 = -1;
            var0[var6++] = var13;
            if ((var3 += var4) >= var7) {
               SCAN = new GhostMacro.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII();
               PATH = new GhostMacro.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII();
               ATTACK = new GhostMacro.lIIllIIIlIlIIIlIIIIIlIlIIlIIIIIIIIlIIllIIIIlIlllIIllIIllIIlllllllIIllIllIlllllIlIlIII();
               lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = EnumEntriesKt.enumEntries(
                  IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl
               );
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

   public static final class llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll {
      private static int[] lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;

      private llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll() {
      }

      @NotNull
      public final lllllIllIlIIllIIlIllllIlIIlIlllllIlIllllIIIlIllIlllllllllIllIIlllIIIIIlIllIIllllIlllI IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return GhostMacro.IlllIlIIlllIIlIIIIIllllIIIIIlIIllllIlllIIIIlIIllIlIlIllIIlIIIIllllIlIlIllIlIlIlIIlIll;
      }

      @NotNull
      public final GhostMacro IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return GhostMacro.lIIIlIllllllIIllIIlIlllIllllIlIlllllIIIllIlllIIlllllIlIIIlIlIIllllIIllIIIlllIllIIlIII;
      }

      public static void llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(int[] var0) {
         lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var0;
      }

      public static int[] IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      static {
         long var0 = 24632878684801L ^ 92502920537328L;
         if (IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() != null) {
            int[] var2 = new int[1];
            llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI(var2);
         }
      }
   }

   private static final class llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll {
      private final int IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      private final int lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      private final int IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      private final int lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      private static long IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII = 133199938021733L;
      private static String[] IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI;
      private static String[] IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll;
      private static Map lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll = new HashMap(13);

      public llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(int var1, int var2, int var3, int var4) {
         this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = var1;
         this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII = var2;
         this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl = var3;
         this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI = var4;
      }

      public final int IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int IlIllIlIIllIIIIllIIIIIllIlIllllllIlIIIIllIlllllllIIlIlIlllIIlllIlIIlIlllllIIlllllllII() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int IlIlllIllIIIIlIIllIlllIIIIlIIlIIIlIIIlIllllIIlIIIIIIIlIIIIllIllIlIlIIIIIIIIlIllIlIlIl() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      public final int lIlIlIIlIIllllllIllIIIlIlIlIIllIIIllIIllIIIllllIllllIlllIlIlIllIlllIlIlIlIIlllIllllll() {
         return this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
      }

      public final int IllIlllIlllIIllllIIlllIIlllIlIllIlllllIlIllIlllIIIIIIllIIlIlllIllIIlIIlllIllllIlIIIII() {
         return this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
      }

      public final int IIlllllIIIlllIIllllIIlIlIIlllIIIIlllIlIIIlIlllIlIllIlIllIlIIIIlIIIllIIIlIlIllIIIIIllI() {
         return this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
      }

      public final int IIIlIlIIlIllIIlIIIllIlIIIlIIllIIlIllIlIlllIIIIlllIllllIIIIIllIlIIllIIIlllIlIlIlIllIlI() {
         return this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
      }

      @NotNull
      public final GhostMacro.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
         int var1, int var2, int var3, int var4
      ) {
         return new GhostMacro.llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll(var1, var2, var3, var4);
      }

      @NotNull
      @Override
      public String toString() {
         long var1 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 68898785494592L;
         int var3 = this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI;
         int var4 = this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl;
         int var5 = this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII;
         int var6 = this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
         return "KillProgress(kills=" + var6 + ", sorrow=" + var5 + ", killCombo=" + var4 + ", lastKillCombo=" + var3 + ")";
      }

      @Override
      public int hashCode() {
         int var1 = Integer.hashCode(this.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
         var1 = var1 * 31 + Integer.hashCode(this.lIIIIIllIIlIlllIllIIIllllIIIIIlIlllllllIIIlIIIIllIlIllIlIIlIIllllIIlIlIIlIIlIIlIlIIII);
         var1 = var1 * 31 + Integer.hashCode(this.IllllIlIIIlIlIIlIlIIIlIlIllllIIIlIllIIIIlllllIlIIIlIIlllIIIIlIIllIlIIlIlllIlIIIlIlIIl);
         return var1 * 31 + Integer.hashCode(this.lIIIlIIlIIIllIIIlIlllIIlllIlIlIIlIIlIIIllIlIlIIlIllIIllIlIlIIIlllIlIIIIIlIlIlIIlIlIlI);
      }

      @Override
      public boolean equals(@Nullable Object param1) {
         // UNRECOVERED: ZKM control flow; see reports/decompiler-failures.json.
      }

      static {
         long var0 = IIIlIlIIlIIIIIIlIllIlllIIlIllllIllIIIIIIIIIlIllllllIIllIllIllIllIIlllIlllllIlIllIlIII ^ 16770160940368L;
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
         String var6 = "+o!Ceá²Iê3\u000f¹\u0004JÊ¬#\u009fE\u0092\u008e:\u0017/(\u0015l\u0092³\u009c¬éå\u009b¡ú¬[¡s\u0093 5\u0084¿*7@-\u0085 nÌ,\u001956×Ýõ\f;H\u008eµ";
         int var8 = "+o!Ceá²Iê3\u000f¹\u0004JÊ¬#\u009fE\u0092\u008e:\u0017/(\u0015l\u0092³\u009c¬éå\u009b¡ú¬[¡s\u0093 5\u0084¿*7@-\u0085 nÌ,\u001956×Ýõ\f;H\u008eµ"
            .length();
         char var5 = '\u0018';
         int var4 = -1;

         while (true) {
            byte[] var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
            String var21 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
            byte var10001 = -1;
            var9[var7++] = var21;
            if ((var4 += var5) >= var8) {
               var6 = "QHp5«\u0018¢À\u0087ÕH\u007fÐ\u009cKã\u00975ü\u0005\u001f¹{Ð\u008c.®þQÐcã(\u007f8½ä¸$`\u007fj\f\u00adØ4Ý\u000e?gÊy¹e©¤È\tïè¥q¦\u00ad·\u0093(8s{'*]";
               var8 = "QHp5«\u0018¢À\u0087ÕH\u007fÐ\u009cKã\u00975ü\u0005\u001f¹{Ð\u008c.®þQÐcã(\u007f8½ä¸$`\u007fj\f\u00adØ4Ý\u000e?gÊy¹e©¤È\tïè¥q¦\u00ad·\u0093(8s{'*]"
                  .length();
               var5 = ' ';
               var4 = -1;

               while (true) {
                  var10 = var2.doFinal(var6.substring(++var4, var4 + var5).getBytes("ISO-8859-1"));
                  String var23 = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(var10).intern();
                  boolean var19 = false;
                  var9[var7++] = var23;
                  if ((var4 += var5) >= var8) {
                     IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI = var9;
                     IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll = new String[4];
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
         int var5 = var0 ^ (int)(var1 & 32767L) ^ 28815;
         if (IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5] == null) {
            Object[] var4;
            try {
               Long var3 = Thread.currentThread().threadId();
               var4 = (Object[])lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.get(var3);
               if (var4 == null) {
                  var4 = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                  lIlIIllIIIIIIIIlIllIllIllIIIlIlllIlIlIllIlIIlllIllIIIllllllIlIlIIlIIIllIIIlIIlIIIIlll.put(var3, var4);
               }
            } catch (Exception var10) {
               throw new RuntimeException(
                  "me/octo/client/modules/impl/macros/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll",
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
            byte[] var9 = IIIIlIlllllIlIlIIIlllIlIIIllIlIIIIlIllllIlllIIlllIlllllIIIlIlIllllIlllllIllIlIIlllllI[var5].getBytes("ISO-8859-1");
            IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5] = IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI(
               ((Cipher)var4[0]).doFinal(var9)
            );
         }

         return IIIIlIIIIlllllIlIllIllIIllIIlllllIlllIllllIlIllIIIIlIIIllIIIlIllIllIIlllIIIIIIIIlllll[var5];
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
               "me/octo/client/modules/impl/macros/IllIIlIllIIIllIlIIlIIIlllllllllIIIIIIIIIlIlllIIIlIlIIIlIlIIlllIIIlIllllIIlIlIIlIlllIl$llllIllIIlllIllIIlllIllIIIIlIlIIIIIllIIIlIlllIIllIIllllllIlIlllIIIllIlIIlIlIIllIIIIll"
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
