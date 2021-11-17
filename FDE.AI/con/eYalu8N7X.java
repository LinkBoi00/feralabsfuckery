package con;

import android.content.SharedPreferences;
import com.feravolt.preload.services.PreloadService;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
@jHNqfwCVd(c = "com.feravolt.preload.services.PreloadService$onCreate$1$1", f = "PreloadService.kt", l = {96}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class eYalu8N7X extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ PreloadService Eeka1udhb;
    public int MzoOEjc4X;
    public final /* synthetic */ SharedPreferences dXrmkklc8;
    public final /* synthetic */ String ilHKhw3Yw;
    public final /* synthetic */ List qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eYalu8N7X(String str, List list, PreloadService preloadService, SharedPreferences sharedPreferences, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = str;
        this.qVUwofr5s = list;
        this.Eeka1udhb = preloadService;
        this.dXrmkklc8 = sharedPreferences;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new eYalu8N7X(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new eYalu8N7X(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, this.dXrmkklc8, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            YuSxiExwK yuSxiExwK = tzR8IMGfw.q3BipwRCk;
            String str = this.ilHKhw3Yw;
            String EBQXiIPmm = wkFJfVmcv.EBQXiIPmm(this.qVUwofr5s, " ", null, null, 0, null, null, 62);
            String str2 = this.Eeka1udhb.CBQ5d1kRq;
            this.MzoOEjc4X = 1;
            if (yuSxiExwK.J4Ux7ym32(str, true, EBQXiIPmm, str2, this) == kbkjsqcsl) {
                return kbkjsqcsl;
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Set<String> stringSet = this.dXrmkklc8.getStringSet("preloaded_apps", bSc306J1d.CBQ5d1kRq);
        fhHgxp0FC fhhgxp0fc = new fhHgxp0FC();
        fhhgxp0fc.addAll(stringSet);
        SharedPreferences sharedPreferences = this.dXrmkklc8;
        PreloadService preloadService = this.Eeka1udhb;
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean("preloaded", true);
        String str3 = preloadService.CBQ5d1kRq;
        ArrayList arrayList = new ArrayList(fhhgxp0fc.size() + 1);
        arrayList.addAll(fhhgxp0fc);
        arrayList.add(str3);
        edit.putStringSet("preloaded_apps", wkFJfVmcv.n4UIOvAko(arrayList));
        edit.apply();
        return qih4lW99W.q3BipwRCk;
    }
}
