package con;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
/* loaded from: classes.dex */
public abstract class DfseMYa7G {
    public DfseMYa7G(int i) {
    }

    public static Handler tGV7Q6urW(Handler handler) {
        return handler == null ? new Handler(Looper.getMainLooper()) : handler;
    }

    public void J4Ux7ym32(Typeface typeface, Handler handler) {
        tGV7Q6urW(handler).post(new DJbXkgfuR(this, typeface));
    }

    public abstract List dIocxURUo();

    public abstract void iiGwOFFnr(Typeface typeface);

    public abstract void kCA6Zs9sL(int i);

    public void q3BipwRCk(int i, Handler handler) {
        tGV7Q6urW(handler).post(new f7xKYcJSX(this, i));
    }
}
