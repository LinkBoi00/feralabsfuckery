package con;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class FYfEv1QIw extends rH0APD7hz {
    public static Field CBQ5d1kRq;
    public static boolean Puu3Rhg4F;
    public static Class oon79WMrY;
    public static Field vPSbyrYWX;
    public static Method yWvV4ePLl;
    public BWdUDHRcA GPLPRo6go;
    public BWdUDHRcA[] dIocxURUo;
    public o8nscdGif iiGwOFFnr;
    public BWdUDHRcA kCA6Zs9sL = null;
    public final WindowInsets tGV7Q6urW;

    public FYfEv1QIw(o8nscdGif o8nscdgif, WindowInsets windowInsets) {
        super(o8nscdgif);
        this.tGV7Q6urW = windowInsets;
    }

    @SuppressLint({"PrivateApi"})
    public static void MzoOEjc4X() {
        try {
            yWvV4ePLl = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            oon79WMrY = cls;
            vPSbyrYWX = cls.getDeclaredField("mVisibleInsets");
            CBQ5d1kRq = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            vPSbyrYWX.setAccessible(true);
            CBQ5d1kRq.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Failed to get visible insets. (Reflection error). ");
            q3BipwRCk.append(e.getMessage());
            Log.e("WindowInsetsCompat", q3BipwRCk.toString(), e);
        }
        Puu3Rhg4F = true;
    }

    @Override // con.rH0APD7hz
    public void CBQ5d1kRq(BWdUDHRcA[] bWdUDHRcAArr) {
        this.dIocxURUo = bWdUDHRcAArr;
    }

    public final BWdUDHRcA PSTqBLTET(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!Puu3Rhg4F) {
                MzoOEjc4X();
            }
            Method method = yWvV4ePLl;
            if (!(method == null || oon79WMrY == null || vPSbyrYWX == null)) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) vPSbyrYWX.get(CBQ5d1kRq.get(invoke));
                    if (rect != null) {
                        return BWdUDHRcA.q3BipwRCk(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Failed to get visible insets. (Reflection error). ");
                    q3BipwRCk.append(e.getMessage());
                    Log.e("WindowInsetsCompat", q3BipwRCk.toString(), e);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @Override // con.rH0APD7hz
    public final BWdUDHRcA Puu3Rhg4F() {
        if (this.kCA6Zs9sL == null) {
            this.kCA6Zs9sL = BWdUDHRcA.q3BipwRCk(this.tGV7Q6urW.getSystemWindowInsetLeft(), this.tGV7Q6urW.getSystemWindowInsetTop(), this.tGV7Q6urW.getSystemWindowInsetRight(), this.tGV7Q6urW.getSystemWindowInsetBottom());
        }
        return this.kCA6Zs9sL;
    }

    @Override // con.rH0APD7hz
    public void dIocxURUo(View view) {
        BWdUDHRcA PSTqBLTET = PSTqBLTET(view);
        if (PSTqBLTET == null) {
            PSTqBLTET = BWdUDHRcA.kCA6Zs9sL;
        }
        ilHKhw3Yw(PSTqBLTET);
    }

    @Override // con.rH0APD7hz
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.GPLPRo6go, ((FYfEv1QIw) obj).GPLPRo6go);
    }

    public void ilHKhw3Yw(BWdUDHRcA bWdUDHRcA) {
        this.GPLPRo6go = bWdUDHRcA;
    }

    @Override // con.rH0APD7hz
    public void kmSgne1rO(o8nscdGif o8nscdgif) {
        this.iiGwOFFnr = o8nscdgif;
    }

    @Override // con.rH0APD7hz
    public boolean vPSbyrYWX() {
        return this.tGV7Q6urW.isRound();
    }

    @Override // con.rH0APD7hz
    public o8nscdGif yWvV4ePLl(int i, int i2, int i3, int i4) {
        o8nscdGif Puu3Rhg4F2 = o8nscdGif.Puu3Rhg4F(this.tGV7Q6urW);
        int i5 = Build.VERSION.SDK_INT;
        fPr2OzCjq qprz6rQ4P = i5 >= 30 ? new Qprz6rQ4P(Puu3Rhg4F2) : i5 >= 29 ? new TLfAYfc8I(Puu3Rhg4F2) : new Vo8lDzQhu(Puu3Rhg4F2);
        qprz6rQ4P.dIocxURUo(o8nscdGif.kCA6Zs9sL(Puu3Rhg4F(), i, i2, i3, i4));
        qprz6rQ4P.tGV7Q6urW(o8nscdGif.kCA6Zs9sL(GPLPRo6go(), i, i2, i3, i4));
        return qprz6rQ4P.J4Ux7ym32();
    }
}
