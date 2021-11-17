package con;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.preference.PreferenceManager;
import com.feravolt.preload.MainActivity;
import com.feravolt.preload.R;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
@jHNqfwCVd(c = "com.feravolt.preload.MainActivity$AppBlock$2$1", f = "MainActivity.kt", l = {1046, 1057}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class Rx05bWjdX extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ MainActivity Eeka1udhb;
    public Object MzoOEjc4X;
    public final /* synthetic */ attbzuWdD dXrmkklc8;
    public int ilHKhw3Yw;
    public final /* synthetic */ PmYqqGuHi qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rx05bWjdX(PmYqqGuHi pmYqqGuHi, MainActivity mainActivity, attbzuWdD attbzuwdd, Way959ade way959ade) {
        super(2, way959ade);
        this.qVUwofr5s = pmYqqGuHi;
        this.Eeka1udhb = mainActivity;
        this.dXrmkklc8 = attbzuwdd;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new Rx05bWjdX(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new Rx05bWjdX(this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        String str;
        String str2;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.ilHKhw3Yw;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            PmYqqGuHi<ApplicationInfo> pmYqqGuHi = this.qVUwofr5s;
            attbzuWdD attbzuwdd = this.dXrmkklc8;
            for (ApplicationInfo applicationInfo : pmYqqGuHi) {
                if (r6NbD4wnj.mUqPm6GBh(applicationInfo.sourceDir, attbzuwdd.tGV7Q6urW, false, 2)) {
                    MainActivity mainActivity = this.Eeka1udhb;
                    MainActivity.NyWTwPF6V(mainActivity, mainActivity.getString(R.string.selected_stuff));
                    String str3 = applicationInfo.packageName;
                    String kmSgne1rO = str3 == null ? null : tzR8IMGfw.q3BipwRCk.kmSgne1rO(str3);
                    MainActivity mainActivity2 = this.Eeka1udhb;
                    ((prCJwNx2x) mainActivity2.i8XZMQc6Z).CBQ5d1kRq(M5g57XBLr.q3BipwRCk(MainActivity.cAwN510t2(mainActivity2), kmSgne1rO, "\n"));
                    YuSxiExwK yuSxiExwK = tzR8IMGfw.q3BipwRCk;
                    String kmSgne1rO2 = yuSxiExwK.kmSgne1rO(applicationInfo.sourceDir);
                    String kmSgne1rO3 = yuSxiExwK.kmSgne1rO(applicationInfo.dataDir);
                    String kmSgne1rO4 = yuSxiExwK.kmSgne1rO(applicationInfo.nativeLibraryDir);
                    this.MzoOEjc4X = kmSgne1rO;
                    this.ilHKhw3Yw = 1;
                    Object kCA6Zs9sL = yuSxiExwK.kCA6Zs9sL(mainActivity2, kmSgne1rO, kmSgne1rO2, kmSgne1rO3, kmSgne1rO4, this);
                    if (kCA6Zs9sL == kbkjsqcsl) {
                        return kbkjsqcsl;
                    }
                    str2 = kmSgne1rO;
                    obj = kCA6Zs9sL;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        } else if (i == 1) {
            str2 = (String) this.MzoOEjc4X;
            anXlDk6fV.IytU16YUK(obj);
        } else if (i == 2) {
            str = (String) this.MzoOEjc4X;
            anXlDk6fV.IytU16YUK(obj);
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.Eeka1udhb);
            MainActivity mainActivity3 = this.Eeka1udhb;
            SharedPreferences.Editor edit = defaultSharedPreferences.edit();
            Set set = (Set) ((prCJwNx2x) mainActivity3.iMyQMM6Qj).getValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet(anXlDk6fV.WaUP0CF08(set.size() + 1));
            linkedHashSet.addAll(set);
            linkedHashSet.add(str);
            edit.putStringSet("preloaded_apps", wkFJfVmcv.n4UIOvAko(linkedHashSet));
            edit.apply();
            return qih4lW99W.q3BipwRCk;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        List list = (List) obj;
        if (!list.isEmpty()) {
            MainActivity mainActivity4 = this.Eeka1udhb;
            this.MzoOEjc4X = str2;
            this.ilHKhw3Yw = 2;
            if (MainActivity.qFBXIgpia(mainActivity4, list, str2, this) == kbkjsqcsl) {
                return kbkjsqcsl;
            }
            str = str2;
            SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(this.Eeka1udhb);
            MainActivity mainActivity32 = this.Eeka1udhb;
            SharedPreferences.Editor edit2 = defaultSharedPreferences2.edit();
            Set set2 = (Set) ((prCJwNx2x) mainActivity32.iMyQMM6Qj).getValue();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(anXlDk6fV.WaUP0CF08(set2.size() + 1));
            linkedHashSet2.addAll(set2);
            linkedHashSet2.add(str);
            edit2.putStringSet("preloaded_apps", wkFJfVmcv.n4UIOvAko(linkedHashSet2));
            edit2.apply();
            return qih4lW99W.q3BipwRCk;
        }
        MainActivity.mUqPm6GBh(this.Eeka1udhb, false);
        MainActivity.i0Zug1mVk(this.Eeka1udhb, true);
        return qih4lW99W.q3BipwRCk;
    }
}
