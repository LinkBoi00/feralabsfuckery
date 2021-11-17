package con;

import android.net.Uri;
import com.feravolt.preload.MainActivity;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
@jHNqfwCVd(c = "com.feravolt.preload.MainActivity$checkAndShowRemoteUpdates$2", f = "MainActivity.kt", l = {1258, 1259, 1262, 1269}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PvO1Gwhy6 extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ MainActivity Eeka1udhb;
    public Object MzoOEjc4X;
    public int ilHKhw3Yw;
    public /* synthetic */ Object qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PvO1Gwhy6(MainActivity mainActivity, Way959ade way959ade) {
        super(2, way959ade);
        this.Eeka1udhb = mainActivity;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        PvO1Gwhy6 pvO1Gwhy6 = new PvO1Gwhy6(this.Eeka1udhb, (Way959ade) obj2);
        pvO1Gwhy6.qVUwofr5s = (oQkvjGXIr) obj;
        return pvO1Gwhy6.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        PvO1Gwhy6 pvO1Gwhy6 = new PvO1Gwhy6(this.Eeka1udhb, way959ade);
        pvO1Gwhy6.qVUwofr5s = obj;
        return pvO1Gwhy6;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:12:0x0026, B:38:0x00b8, B:42:0x00db, B:44:0x00df, B:45:0x0110, B:46:0x0117), top: B:58:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0110 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:12:0x0026, B:38:0x00b8, B:42:0x00db, B:44:0x00df, B:45:0x0110, B:46:0x0117), top: B:58:0x000b }] */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object yWvV4ePLl(Object obj) {
        qlt0VySXJ qlt0vysxj;
        Jv1Fju7cm jv1Fju7cm;
        String str;
        String str2;
        String str3;
        Uri uri;
        Object obj2;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.ilHKhw3Yw;
        qlt0VySXJ qlt0vysxj2 = null;
        try {
        } catch (Throwable th) {
            qlt0vysxj = new qlt0VySXJ(th);
        }
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            oQkvjGXIr oqkvjgxir = (oQkvjGXIr) this.qVUwofr5s;
            if (!tzR8IMGfw.q3BipwRCk.oon79WMrY(this.Eeka1udhb)) {
                return qih4lW99W.q3BipwRCk;
            }
            str3 = this.Eeka1udhb.getApplicationInfo().dataDir;
            try {
                obj2 = idpM54xlp.iiGwOFFnr("https://github.com/feravolt/Preload-docs/releases/download/1.0/data.json", str3 + "/current-version", null, 4);
            } catch (Throwable th2) {
                obj2 = new qlt0VySXJ(th2);
            }
            if (obj2 instanceof qlt0VySXJ) {
                obj2 = null;
            }
            uri = (Uri) obj2;
            this.qVUwofr5s = str3;
            this.MzoOEjc4X = uri;
            this.ilHKhw3Yw = 1;
            if (dnBSj5uJN.Bhmn1KIah(100, this) == kbkjsqcsl) {
                return kbkjsqcsl;
            }
        } else if (i == 1) {
            uri = (Uri) this.MzoOEjc4X;
            str3 = (String) this.qVUwofr5s;
            anXlDk6fV.IytU16YUK(obj);
        } else if (i == 2) {
            str2 = (String) this.qVUwofr5s;
            anXlDk6fV.IytU16YUK(obj);
            if (((Boolean) obj).booleanValue()) {
                Hncu9o7E0 hncu9o7E0 = Hncu9o7E0.dIocxURUo;
                this.qVUwofr5s = hncu9o7E0;
                this.ilHKhw3Yw = 3;
                Object Bhmn1KIah = tzR8IMGfw.q3BipwRCk.Bhmn1KIah("cat " + str2 + "/current-version", this);
                if (Bhmn1KIah == kbkjsqcsl) {
                    return kbkjsqcsl;
                }
                jv1Fju7cm = hncu9o7E0;
                obj = Bhmn1KIah;
                str = (String) obj;
                if (str == null) {
                }
            }
            return qih4lW99W.q3BipwRCk;
        } else if (i == 3) {
            jv1Fju7cm = (Jv1Fju7cm) this.qVUwofr5s;
            anXlDk6fV.IytU16YUK(obj);
            str = (String) obj;
            if (str == null) {
                String obj3 = r6NbD4wnj.BL4OzhZBd(str).toString();
                IOYQk1Nz8 iOYQk1Nz8 = ((Hncu9o7E0) jv1Fju7cm).J4Ux7ym32;
                sXaMULvdn sxamulvdn = YGTdT21e3.q3BipwRCk;
                WwFGbLVWX q3BipwRCk = YGTdT21e3.q3BipwRCk(GM8XBNWtz.class);
                List emptyList = Collections.emptyList();
                Objects.requireNonNull(sxamulvdn);
                K6PL0z3I0.q3BipwRCk(((Hncu9o7E0) jv1Fju7cm).q3BipwRCk(B2GV5CTcl.dIocxURUo(iOYQk1Nz8, new v1smVeB0h(q3BipwRCk, emptyList, false)), obj3));
                qlt0vysxj = null;
                if (!(qlt0vysxj instanceof qlt0VySXJ)) {
                    qlt0vysxj2 = qlt0vysxj;
                }
                K6PL0z3I0.q3BipwRCk(qlt0vysxj2);
                return qih4lW99W.q3BipwRCk;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        } else if (i == 4) {
            anXlDk6fV.IytU16YUK(obj);
            return qih4lW99W.q3BipwRCk;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (uri != null) {
            YuSxiExwK yuSxiExwK = tzR8IMGfw.q3BipwRCk;
            String q3BipwRCk2 = UexvVay3o.q3BipwRCk(str3, "/current-version");
            this.qVUwofr5s = str3;
            this.MzoOEjc4X = null;
            this.ilHKhw3Yw = 2;
            Object dIocxURUo = yuSxiExwK.dIocxURUo(q3BipwRCk2, this);
            if (dIocxURUo == kbkjsqcsl) {
                return kbkjsqcsl;
            }
            str2 = str3;
            obj = dIocxURUo;
            if (((Boolean) obj).booleanValue()) {
            }
        }
        return qih4lW99W.q3BipwRCk;
    }
}
