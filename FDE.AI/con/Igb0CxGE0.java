package con;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;
import java.util.Objects;
/* loaded from: classes.dex */
public final class Igb0CxGE0 extends Property {
    public final /* synthetic */ int q3BipwRCk;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Igb0CxGE0(Class cls, String str, int i) {
        super(cls, str);
        this.q3BipwRCk = i;
        if (i == 1) {
            super(cls, str);
        } else if (i != 2) {
        } else {
            super(cls, str);
        }
    }

    public void J4Ux7ym32(View view, Float f) {
        switch (this.q3BipwRCk) {
            case 1:
                lSxPlj8FZ.q3BipwRCk.GPLPRo6go(view, f.floatValue());
                return;
            default:
                view.getLayoutParams().width = f.intValue();
                view.requestLayout();
                return;
        }
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ Object get(Object obj) {
        switch (this.q3BipwRCk) {
            case 0:
                L4dgYjUX0 l4dgYjUX0 = (L4dgYjUX0) obj;
                return null;
            case 1:
                return q3BipwRCk((View) obj);
            default:
                return q3BipwRCk((View) obj);
        }
    }

    public Float q3BipwRCk(View view) {
        switch (this.q3BipwRCk) {
            case 1:
                return Float.valueOf(lSxPlj8FZ.q3BipwRCk(view));
            default:
                return Float.valueOf((float) view.getLayoutParams().width);
        }
    }

    @Override // android.util.Property
    public void set(Object obj, Object obj2) {
        switch (this.q3BipwRCk) {
            case 0:
                L4dgYjUX0 l4dgYjUX0 = (L4dgYjUX0) obj;
                PointF pointF = (PointF) obj2;
                Objects.requireNonNull(l4dgYjUX0);
                l4dgYjUX0.tGV7Q6urW = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                l4dgYjUX0.dIocxURUo = round;
                int i = l4dgYjUX0.GPLPRo6go + 1;
                l4dgYjUX0.GPLPRo6go = i;
                if (l4dgYjUX0.iiGwOFFnr == i) {
                    lSxPlj8FZ.J4Ux7ym32(l4dgYjUX0.kCA6Zs9sL, l4dgYjUX0.q3BipwRCk, l4dgYjUX0.J4Ux7ym32, l4dgYjUX0.tGV7Q6urW, round);
                    l4dgYjUX0.iiGwOFFnr = 0;
                    l4dgYjUX0.GPLPRo6go = 0;
                    return;
                }
                return;
            case 1:
                J4Ux7ym32((View) obj, (Float) obj2);
                return;
            default:
                J4Ux7ym32((View) obj, (Float) obj2);
                return;
        }
    }
}
