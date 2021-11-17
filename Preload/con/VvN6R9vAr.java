package con;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public final class VvN6R9vAr extends TKRDKLJ3n {
    public final WwFGbLVWX J4Ux7ym32;
    public final W39e6bnPN tGV7Q6urW;

    public VvN6R9vAr(WwFGbLVWX wwFGbLVWX, wjjWl3mHt wjjwl3mht) {
        super(wjjwl3mht, null);
        this.J4Ux7ym32 = wwFGbLVWX;
        this.tGV7Q6urW = new Gs9LVOXRD(wjjwl3mht.q3BipwRCk(), 0);
    }

    @Override // con.LBkrQilnp
    public int dIocxURUo(Object obj) {
        return ((ArrayList) obj).size();
    }

    @Override // con.LBkrQilnp
    public void kCA6Zs9sL(Object obj, int i) {
        ((ArrayList) obj).ensureCapacity(i);
    }

    @Override // con.LBkrQilnp
    public Object oon79WMrY(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Object newInstance = Array.newInstance(idpM54xlp.oon79WMrY(this.J4Ux7ym32), arrayList.size());
        Objects.requireNonNull(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        return arrayList.toArray((Object[]) newInstance);
    }

    @Override // con.TKRDKLJ3n, con.wjjWl3mHt, con.NWqEIvIkR
    public W39e6bnPN q3BipwRCk() {
        return this.tGV7Q6urW;
    }

    @Override // con.LBkrQilnp
    public Object tGV7Q6urW() {
        return new ArrayList();
    }

    @Override // con.TKRDKLJ3n
    public void vPSbyrYWX(Object obj, int i, Object obj2) {
        ((ArrayList) obj).add(i, obj2);
    }

    @Override // con.LBkrQilnp
    public Object yWvV4ePLl(Object obj) {
        return new ArrayList(Arrays.asList((Object[]) obj));
    }
}
