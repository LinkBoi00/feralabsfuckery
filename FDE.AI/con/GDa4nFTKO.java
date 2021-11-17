package con;

import android.content.pm.ApplicationInfo;
import com.feravolt.preload.services.PreloadService;
import java.util.List;
@jHNqfwCVd(c = "com.feravolt.preload.services.PreloadService$onCreate$1$pathsOfApk$1", f = "PreloadService.kt", l = {76}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class GDa4nFTKO extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public final /* synthetic */ ApplicationInfo ilHKhw3Yw;
    public final /* synthetic */ PreloadService qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GDa4nFTKO(ApplicationInfo applicationInfo, PreloadService preloadService, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = applicationInfo;
        this.qVUwofr5s = preloadService;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new GDa4nFTKO(this.ilHKhw3Yw, this.qVUwofr5s, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new GDa4nFTKO(this.ilHKhw3Yw, this.qVUwofr5s, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            ApplicationInfo applicationInfo = this.ilHKhw3Yw;
            if (applicationInfo == null) {
                return null;
            }
            PreloadService preloadService = this.qVUwofr5s;
            YuSxiExwK yuSxiExwK = tzR8IMGfw.q3BipwRCk;
            String str = preloadService.CBQ5d1kRq;
            String kmSgne1rO = yuSxiExwK.kmSgne1rO(applicationInfo.sourceDir);
            String kmSgne1rO2 = yuSxiExwK.kmSgne1rO(applicationInfo.dataDir);
            String kmSgne1rO3 = yuSxiExwK.kmSgne1rO(applicationInfo.nativeLibraryDir);
            this.MzoOEjc4X = 1;
            obj = yuSxiExwK.kCA6Zs9sL(preloadService, str, kmSgne1rO, kmSgne1rO2, kmSgne1rO3, this);
            if (obj == kbkjsqcsl) {
                return kbkjsqcsl;
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return (List) obj;
    }
}
