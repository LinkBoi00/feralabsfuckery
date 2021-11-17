package con;

import android.os.Build;
import android.os.PowerManager;
import com.feravolt.preload.MainActivity;
import com.feravolt.preload.R;
import java.util.Objects;
@jHNqfwCVd(c = "com.feravolt.preload.MainActivity$frgSetup$2$2", f = "MainActivity.kt", l = {474}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Eggv4iEoi extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public final /* synthetic */ boolean ilHKhw3Yw;
    public final /* synthetic */ MainActivity qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eggv4iEoi(boolean z, MainActivity mainActivity, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = z;
        this.qVUwofr5s = mainActivity;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new Eggv4iEoi(this.ilHKhw3Yw, this.qVUwofr5s, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new Eggv4iEoi(this.ilHKhw3Yw, this.qVUwofr5s, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            if (Build.VERSION.SDK_INT >= 31 && this.ilHKhw3Yw) {
                Object systemService = this.qVUwofr5s.getApplicationContext().getSystemService("power");
                Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                PowerManager powerManager = (PowerManager) systemService;
                if (!powerManager.isIgnoringBatteryOptimizations("com.feravolt.preload.pro") || !powerManager.isIgnoringBatteryOptimizations(this.qVUwofr5s.getPackageName())) {
                    Pf8Spcrui pf8Spcrui = new Pf8Spcrui(this.qVUwofr5s);
                    V8gQUs5xA v8gQUs5xA = (V8gQUs5xA) pf8Spcrui.q3BipwRCk;
                    v8gQUs5xA.kCA6Zs9sL = v8gQUs5xA.q3BipwRCk.getText(R.string.doze_alert_title);
                    V8gQUs5xA v8gQUs5xA2 = (V8gQUs5xA) pf8Spcrui.q3BipwRCk;
                    v8gQUs5xA2.tGV7Q6urW = R.drawable.ic_round_developer_mode_24;
                    v8gQUs5xA2.GPLPRo6go = v8gQUs5xA2.q3BipwRCk.getText(R.string.doze_alert_text);
                    u6pX9iZ52 u6px9iz52 = new u6pX9iZ52(this.qVUwofr5s, 2);
                    V8gQUs5xA v8gQUs5xA3 = (V8gQUs5xA) pf8Spcrui.q3BipwRCk;
                    v8gQUs5xA3.Puu3Rhg4F = v8gQUs5xA3.q3BipwRCk.getText(R.string.open_settings);
                    V8gQUs5xA v8gQUs5xA4 = (V8gQUs5xA) pf8Spcrui.q3BipwRCk;
                    v8gQUs5xA4.yWvV4ePLl = u6px9iz52;
                    v8gQUs5xA4.CBQ5d1kRq = false;
                    pf8Spcrui.yWvV4ePLl();
                }
            }
            xaeEKvU2c xaeekvu2c = tQmFGxsat.tGV7Q6urW;
            LVJWpbaq8 lVJWpbaq8 = new LVJWpbaq8(this.qVUwofr5s, null);
            this.MzoOEjc4X = 1;
            if (idpM54xlp.qFBXIgpia(xaeekvu2c, lVJWpbaq8, this) == kbkjsqcsl) {
                return kbkjsqcsl;
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return qih4lW99W.q3BipwRCk;
    }
}
