package con;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public class Vo8lDzQhu extends fPr2OzCjq {
    public static boolean GPLPRo6go = false;
    public static Field dIocxURUo = null;
    public static Constructor iiGwOFFnr = null;
    public static boolean kCA6Zs9sL = false;
    public WindowInsets J4Ux7ym32;
    public BWdUDHRcA tGV7Q6urW;

    public Vo8lDzQhu() {
        this.J4Ux7ym32 = kCA6Zs9sL();
    }

    public Vo8lDzQhu(o8nscdGif o8nscdgif) {
        super(o8nscdgif);
        this.J4Ux7ym32 = o8nscdgif.GPLPRo6go();
    }

    public static WindowInsets kCA6Zs9sL() {
        if (!kCA6Zs9sL) {
            try {
                dIocxURUo = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            kCA6Zs9sL = true;
        }
        Field field = dIocxURUo;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!GPLPRo6go) {
            try {
                iiGwOFFnr = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            GPLPRo6go = true;
        }
        Constructor constructor = iiGwOFFnr;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }

    @Override // con.fPr2OzCjq
    public o8nscdGif J4Ux7ym32() {
        q3BipwRCk();
        o8nscdGif Puu3Rhg4F = o8nscdGif.Puu3Rhg4F(this.J4Ux7ym32);
        Puu3Rhg4F.q3BipwRCk.CBQ5d1kRq(null);
        Puu3Rhg4F.q3BipwRCk.Bhmn1KIah(this.tGV7Q6urW);
        return Puu3Rhg4F;
    }

    @Override // con.fPr2OzCjq
    public void dIocxURUo(BWdUDHRcA bWdUDHRcA) {
        WindowInsets windowInsets = this.J4Ux7ym32;
        if (windowInsets != null) {
            this.J4Ux7ym32 = windowInsets.replaceSystemWindowInsets(bWdUDHRcA.q3BipwRCk, bWdUDHRcA.J4Ux7ym32, bWdUDHRcA.tGV7Q6urW, bWdUDHRcA.dIocxURUo);
        }
    }

    @Override // con.fPr2OzCjq
    public void tGV7Q6urW(BWdUDHRcA bWdUDHRcA) {
        this.tGV7Q6urW = bWdUDHRcA;
    }
}
