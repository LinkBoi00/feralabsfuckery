package con;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.feravolt.preload.MainActivity;
@jHNqfwCVd(c = "com.feravolt.preload.MainActivity$frgSetup$2$2$2", f = "MainActivity.kt", l = {476, 477}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LVJWpbaq8 extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ MainActivity qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LVJWpbaq8(MainActivity mainActivity, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = mainActivity;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        LVJWpbaq8 lVJWpbaq8 = new LVJWpbaq8(this.qVUwofr5s, (Way959ade) obj2);
        lVJWpbaq8.ilHKhw3Yw = (oQkvjGXIr) obj;
        return lVJWpbaq8.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        LVJWpbaq8 lVJWpbaq8 = new LVJWpbaq8(this.qVUwofr5s, way959ade);
        lVJWpbaq8.ilHKhw3Yw = obj;
        return lVJWpbaq8;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object yWvV4ePLl(Object obj) {
        Object obj2;
        oQkvjGXIr oqkvjgxir;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            oqkvjgxir = (oQkvjGXIr) this.ilHKhw3Yw;
            if (PreferenceManager.getDefaultSharedPreferences(this.qVUwofr5s).getBoolean("first_launch", true)) {
                this.ilHKhw3Yw = oqkvjgxir;
                this.MzoOEjc4X = 1;
                if (dnBSj5uJN.Bhmn1KIah(1200, this) == kbkjsqcsl) {
                    return kbkjsqcsl;
                }
            }
            return qih4lW99W.q3BipwRCk;
        } else if (i == 1) {
            oqkvjgxir = (oQkvjGXIr) this.ilHKhw3Yw;
            anXlDk6fV.IytU16YUK(obj);
        } else if (i == 2) {
            oQkvjGXIr oqkvjgxir2 = (oQkvjGXIr) this.ilHKhw3Yw;
            anXlDk6fV.IytU16YUK(obj);
            if (tzR8IMGfw.q3BipwRCk.oon79WMrY(this.qVUwofr5s)) {
                try {
                    String str = this.qVUwofr5s.getApplicationInfo().dataDir;
                    obj2 = idpM54xlp.iiGwOFFnr("https://github.com/feravolt/Preload-docs/releases/download/1.0/ver.json", str + "/ver", null, 4);
                } catch (Throwable th) {
                    obj2 = new qlt0VySXJ(th);
                }
                boolean z = obj2 instanceof qlt0VySXJ;
            }
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.qVUwofr5s).edit();
            edit.putBoolean("first_launch", false);
            edit.apply();
            return qih4lW99W.q3BipwRCk;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xaeEKvU2c xaeekvu2c = tQmFGxsat.q3BipwRCk;
        zkUmn2JpE zkumn2jpe = ZezE4t3SB.q3BipwRCk;
        op02snQYG op02snqyg = new op02snQYG(this.qVUwofr5s, null);
        this.ilHKhw3Yw = oqkvjgxir;
        this.MzoOEjc4X = 2;
        if (idpM54xlp.qFBXIgpia(zkumn2jpe, op02snqyg, this) == kbkjsqcsl) {
            return kbkjsqcsl;
        }
        if (tzR8IMGfw.q3BipwRCk.oon79WMrY(this.qVUwofr5s)) {
        }
        SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(this.qVUwofr5s).edit();
        edit2.putBoolean("first_launch", false);
        edit2.apply();
        return qih4lW99W.q3BipwRCk;
    }
}
