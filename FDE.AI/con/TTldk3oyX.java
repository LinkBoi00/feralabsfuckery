package con;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public abstract class TTldk3oyX extends mUx47mhWb {
    public static final /* synthetic */ AtomicReferenceFieldUpdater q3BipwRCk = AtomicReferenceFieldUpdater.newUpdater(TTldk3oyX.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = LAYIWZZwP.q3BipwRCk;

    public abstract void J4Ux7ym32(Object obj, Object obj2);

    @Override // con.mUx47mhWb
    public final Object q3BipwRCk(Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = LAYIWZZwP.q3BipwRCk;
        if (obj2 == obj3) {
            obj2 = tGV7Q6urW(obj);
            Object obj4 = this._consensus;
            if (obj4 != obj3) {
                obj2 = obj4;
            } else if (!q3BipwRCk.compareAndSet(this, obj3, obj2)) {
                obj2 = this._consensus;
            }
        }
        J4Ux7ym32(obj, obj2);
        return obj2;
    }

    public abstract Object tGV7Q6urW(Object obj);
}
