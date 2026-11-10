//
// Decompiled by Procyon v0.6.0
//

package me.octo.client.utils.client;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import java.util.HashSet;
import kotlin.jvm.JvmField;
import java.util.HashMap;
import me.octo.client.utils.fastutil.Pool;
import org.jetbrains.annotations.NotNull;

public final class GenericPools
{
    @NotNull
    public static GenericPools IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl;
    @JvmField
    @NotNull
    public static Pool<HashMap<Object, Object>> HASH_MAP;
    @JvmField
    @NotNull
    public static Pool<HashSet<Object>> HASH_SET;

    private GenericPools() {
    }

    private static final HashMap IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI() {
        return new HashMap();
    }

    private static final HashSet llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI() {
        return new HashSet();
    }

    static {
        GenericPools.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl = new GenericPools();
        GenericPools.HASH_MAP = new Pool<HashMap<Object, Object>>((kotlin.jvm.functions.Function0<? extends HashMap<Object, Object>>)GenericPools::IIIlllIIIIIIIlIIlllIlIlIlIlIIIIIIIlllIIlllIlIllllIIIIIIIllIllIlIIIIIlllllllllllIIIIlI, (kotlin.jvm.functions.Function1<? super HashMap<Object, Object>, Unit>)GenericPools$llIIllllIllIIlIllIIIIIlllIIIIIIllIIlllIIlIllIIIlIlIIIlIlIIlIlIIIIlllIIlIIllIlIlIlIIll.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
        GenericPools.HASH_SET = new Pool<HashSet<Object>>((kotlin.jvm.functions.Function0<? extends HashSet<Object>>)GenericPools::llIIlllIlIllIlIIllllIllllIIIlIIIIIllIIlIlIllIlIIllllIlllllllIlIIIlIllIlIIIlllllIIlIlI, (kotlin.jvm.functions.Function1<? super HashSet<Object>, Unit>)GenericPools$IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI.IIIIIIIIIllIlIllIIllIlIIIllIllIlIlIIIllllIlllIIlIllIIlllIIIIIIllIIlllIIIIlIIllIIlllIl);
    }
}
