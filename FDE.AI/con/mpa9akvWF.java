package con;

import android.os.Build;
import android.view.View;
/* loaded from: classes.dex */
public abstract class mpa9akvWF {
    public final Class J4Ux7ym32;
    public final int dIocxURUo;
    public final int q3BipwRCk;
    public final int tGV7Q6urW;

    public mpa9akvWF(int i, Class cls, int i2) {
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = cls;
        this.dIocxURUo = 0;
        this.tGV7Q6urW = i2;
    }

    public mpa9akvWF(int i, Class cls, int i2, int i3) {
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = cls;
        this.dIocxURUo = i2;
        this.tGV7Q6urW = i3;
    }

    public abstract Object J4Ux7ym32(View view);

    public Object dIocxURUo(View view) {
        if (Build.VERSION.SDK_INT >= this.tGV7Q6urW) {
            return J4Ux7ym32(view);
        }
        Object tag = view.getTag(this.q3BipwRCk);
        if (this.J4Ux7ym32.isInstance(tag)) {
            return tag;
        }
        return null;
    }

    public abstract boolean iiGwOFFnr(Object obj, Object obj2);

    public void kCA6Zs9sL(View view, Object obj) {
        if (Build.VERSION.SDK_INT >= this.tGV7Q6urW) {
            tGV7Q6urW(view, obj);
        } else if (iiGwOFFnr(dIocxURUo(view), obj)) {
            XflkRyC2J kCA6Zs9sL = IuQbWntsc.kCA6Zs9sL(view);
            if (kCA6Zs9sL == null) {
                kCA6Zs9sL = new XflkRyC2J();
            }
            IuQbWntsc.MzoOEjc4X(view, kCA6Zs9sL);
            view.setTag(this.q3BipwRCk, obj);
            IuQbWntsc.oon79WMrY(view, this.dIocxURUo);
        }
    }

    public boolean q3BipwRCk(Boolean bool, Boolean bool2) {
        return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
    }

    public abstract void tGV7Q6urW(View view, Object obj);
}
