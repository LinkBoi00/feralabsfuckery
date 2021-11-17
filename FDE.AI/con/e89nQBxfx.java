package con;

import android.preference.PreferenceManager;
import com.feravolt.preload.MainActivity;
import java.util.List;
@jHNqfwCVd(c = "com.feravolt.preload.MainActivity$preloadThings$2", f = "MainActivity.kt", l = {960}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e89nQBxfx extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ String Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ MainActivity ilHKhw3Yw;
    public final /* synthetic */ List qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e89nQBxfx(MainActivity mainActivity, List list, String str, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = mainActivity;
        this.qVUwofr5s = list;
        this.Eeka1udhb = str;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new e89nQBxfx(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new e89nQBxfx(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            MainActivity.mUqPm6GBh(this.ilHKhw3Yw, true);
            MainActivity.i0Zug1mVk(this.ilHKhw3Yw, false);
            int i2 = PreferenceManager.getDefaultSharedPreferences(this.ilHKhw3Yw).getInt("sizeofpreload", 0);
            xaeEKvU2c xaeekvu2c = tQmFGxsat.tGV7Q6urW;
            aweKky1Hz awekky1hz = new aweKky1Hz(this.qVUwofr5s, i2, this.ilHKhw3Yw, this.Eeka1udhb, null);
            this.MzoOEjc4X = 1;
            if (idpM54xlp.qFBXIgpia(xaeekvu2c, awekky1hz, this) == kbkjsqcsl) {
                return kbkjsqcsl;
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        MainActivity.i0Zug1mVk(this.ilHKhw3Yw, true);
        MainActivity.mUqPm6GBh(this.ilHKhw3Yw, false);
        return qih4lW99W.q3BipwRCk;
    }
}
