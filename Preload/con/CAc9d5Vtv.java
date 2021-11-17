package con;

import com.feravolt.preload.R;
import com.feravolt.preload.services.PreloadService;
@jHNqfwCVd(c = "com.feravolt.preload.services.PreloadService$onCreate$1$2", f = "PreloadService.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CAc9d5Vtv extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ PreloadService MzoOEjc4X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CAc9d5Vtv(PreloadService preloadService, Way959ade way959ade) {
        super(2, way959ade);
        this.MzoOEjc4X = preloadService;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        CAc9d5Vtv cAc9d5Vtv = new CAc9d5Vtv(this.MzoOEjc4X, (Way959ade) obj2);
        qih4lW99W qih4lw99w = qih4lW99W.q3BipwRCk;
        cAc9d5Vtv.yWvV4ePLl(qih4lw99w);
        return qih4lw99w;
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new CAc9d5Vtv(this.MzoOEjc4X, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        anXlDk6fV.IytU16YUK(obj);
        PreloadService preloadService = this.MzoOEjc4X;
        String string = preloadService.getString(R.string.preloading_success);
        String str = this.MzoOEjc4X.CBQ5d1kRq;
        anXlDk6fV.sk5s77z6Q(preloadService, string + "\n" + str);
        return qih4lW99W.q3BipwRCk;
    }
}
