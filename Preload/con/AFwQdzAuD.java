package con;

import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import com.crazylegend.sharedpreferences.SharedPreferenceChangeListener;
import com.feravolt.preload.MainActivity;
import java.util.Collections;
@jHNqfwCVd(c = "com.feravolt.preload.MainActivity$frgSetup$2", f = "MainActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AFwQdzAuD extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ boolean MzoOEjc4X;
    public final /* synthetic */ boolean ilHKhw3Yw;
    public final /* synthetic */ MainActivity qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwQdzAuD(boolean z, boolean z2, MainActivity mainActivity, Way959ade way959ade) {
        super(2, way959ade);
        this.MzoOEjc4X = z;
        this.ilHKhw3Yw = z2;
        this.qVUwofr5s = mainActivity;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new AFwQdzAuD(this.MzoOEjc4X, this.ilHKhw3Yw, this.qVUwofr5s, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new AFwQdzAuD(this.MzoOEjc4X, this.ilHKhw3Yw, this.qVUwofr5s, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        anXlDk6fV.IytU16YUK(obj);
        if (this.MzoOEjc4X) {
            if (!this.ilHKhw3Yw) {
                MainActivity.AqaWJg0b4(this.qVUwofr5s, false);
            }
            MainActivity mainActivity = this.qVUwofr5s;
            MainActivity.vNtjxmzUM(mainActivity, PreferenceManager.getDefaultSharedPreferences(mainActivity).getBoolean("preloaded", false));
            MainActivity mainActivity2 = this.qVUwofr5s;
            ((prCJwNx2x) mainActivity2.iMyQMM6Qj).CBQ5d1kRq(PreferenceManager.getDefaultSharedPreferences(mainActivity2).getStringSet("preloaded_apps", bSc306J1d.CBQ5d1kRq));
            MainActivity mainActivity3 = this.qVUwofr5s;
            ((prCJwNx2x) mainActivity3.cAwN510t2).CBQ5d1kRq(Collections.singleton(PreferenceManager.getDefaultSharedPreferences(mainActivity3).getString("autopreload", "")));
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.qVUwofr5s);
            MainActivity mainActivity4 = this.qVUwofr5s;
            mainActivity4.PSTqBLTET.q3BipwRCk(new SharedPreferenceChangeListener(defaultSharedPreferences, new UuYoJZ40y(mainActivity4, 1)));
        } else {
            if (Build.VERSION.SDK_INT >= 30 || !this.ilHKhw3Yw) {
                MainActivity.AqaWJg0b4(this.qVUwofr5s, false);
            }
            MainActivity.vNtjxmzUM(this.qVUwofr5s, false);
        }
        return idpM54xlp.RG6kpfv3v(dnBSj5uJN.ilHKhw3Yw(this.qVUwofr5s), null, 0, new Eggv4iEoi(this.ilHKhw3Yw, this.qVUwofr5s, null), 3, null);
    }
}
