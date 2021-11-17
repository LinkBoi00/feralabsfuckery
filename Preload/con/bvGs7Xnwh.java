package con;

import com.feravolt.preload.R;
import com.feravolt.preload.services.PreloadService;
@jHNqfwCVd(c = "com.feravolt.preload.services.PreloadService$onCreate$1$3", f = "PreloadService.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class bvGs7Xnwh extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ PreloadService MzoOEjc4X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvGs7Xnwh(PreloadService preloadService, Way959ade way959ade) {
        super(2, way959ade);
        this.MzoOEjc4X = preloadService;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        bvGs7Xnwh bvgs7xnwh = new bvGs7Xnwh(this.MzoOEjc4X, (Way959ade) obj2);
        qih4lW99W qih4lw99w = qih4lW99W.q3BipwRCk;
        bvgs7xnwh.yWvV4ePLl(qih4lw99w);
        return qih4lw99w;
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new bvGs7Xnwh(this.MzoOEjc4X, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        anXlDk6fV.IytU16YUK(obj);
        PreloadService preloadService = this.MzoOEjc4X;
        String string = preloadService.getString(R.string.preloading_fail);
        String str = this.MzoOEjc4X.CBQ5d1kRq;
        anXlDk6fV.sk5s77z6Q(preloadService, string + "\n" + str);
        return qih4lW99W.q3BipwRCk;
    }
}
