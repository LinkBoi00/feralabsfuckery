package con;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Iterator;
@jHNqfwCVd(c = "com.feravolt.preload.utils.Utils$Companion$unPreload$2$1", f = "Utils.kt", l = {160}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class uyjMjxZot extends dnd1L2J2K implements kkcQgCx5G {
    public Object MzoOEjc4X;
    public int ilHKhw3Yw;
    public final /* synthetic */ Context qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uyjMjxZot(Context context, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = context;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new uyjMjxZot(this.qVUwofr5s, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new uyjMjxZot(this.qVUwofr5s, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        Iterator it;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.ilHKhw3Yw;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            it = PreferenceManager.getDefaultSharedPreferences(this.qVUwofr5s).getStringSet("preloaded_apps", bSc306J1d.CBQ5d1kRq).iterator();
        } else if (i == 1) {
            it = (Iterator) this.MzoOEjc4X;
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!r6NbD4wnj.mUqPm6GBh(str, "preload", false, 2)) {
                YuSxiExwK yuSxiExwK = tzR8IMGfw.q3BipwRCk;
                String q3BipwRCk = UexvVay3o.q3BipwRCk("am force-stop ", str);
                this.MzoOEjc4X = it;
                this.ilHKhw3Yw = 1;
                if (yuSxiExwK.Bhmn1KIah(q3BipwRCk, this) == kbkjsqcsl) {
                    return kbkjsqcsl;
                }
            }
        }
        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(this.qVUwofr5s).edit();
        edit.putBoolean("preloaded", false);
        edit.putStringSet("preloaded_apps", bSc306J1d.CBQ5d1kRq);
        edit.putInt("sizeofpreload", 0);
        edit.apply();
        return qih4lW99W.q3BipwRCk;
    }
}
