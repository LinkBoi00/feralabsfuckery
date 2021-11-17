package con;

import android.os.Process;
import com.feravolt.preload.MainActivity;
import com.feravolt.preload.R;
@jHNqfwCVd(c = "com.feravolt.preload.MainActivity$suicide$2", f = "MainActivity.kt", l = {1348}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CyYrQ4qwz extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public final /* synthetic */ MainActivity ilHKhw3Yw;
    public final /* synthetic */ String qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CyYrQ4qwz(MainActivity mainActivity, String str, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = mainActivity;
        this.qVUwofr5s = str;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new CyYrQ4qwz(this.ilHKhw3Yw, this.qVUwofr5s, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new CyYrQ4qwz(this.ilHKhw3Yw, this.qVUwofr5s, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            MainActivity mainActivity = this.ilHKhw3Yw;
            String string = mainActivity.getString(R.string.error);
            String str = this.qVUwofr5s;
            anXlDk6fV.sk5s77z6Q(mainActivity, string + " " + str);
            this.ilHKhw3Yw.finish();
            this.MzoOEjc4X = 1;
            if (dnBSj5uJN.Bhmn1KIah(1500, this) == kbkjsqcsl) {
                return kbkjsqcsl;
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Process.killProcess(Process.myPid());
        return qih4lW99W.q3BipwRCk;
    }
}
