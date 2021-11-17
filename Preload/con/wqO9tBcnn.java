package con;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class wqO9tBcnn extends Property {
    public final /* synthetic */ int q3BipwRCk;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqO9tBcnn(Class cls, String str, int i) {
        super(cls, str);
        this.q3BipwRCk = i;
        if (i == 1) {
            super(cls, str);
        } else if (i != 2) {
        } else {
            super(cls, str);
        }
    }

    @Override // android.util.Property
    public Object get(Object obj) {
        switch (this.q3BipwRCk) {
            case 0:
                L4dgYjUX0 l4dgYjUX0 = (L4dgYjUX0) obj;
                return null;
            case 1:
                View view = (View) obj;
                return null;
            default:
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                return Float.valueOf((float) RBJDIwG1D.kCA6Zs9sL((View) obj));
        }
    }

    @Override // android.util.Property
    public void set(Object obj, Object obj2) {
        switch (this.q3BipwRCk) {
            case 0:
                L4dgYjUX0 l4dgYjUX0 = (L4dgYjUX0) obj;
                PointF pointF = (PointF) obj2;
                Objects.requireNonNull(l4dgYjUX0);
                l4dgYjUX0.q3BipwRCk = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                l4dgYjUX0.J4Ux7ym32 = round;
                int i = l4dgYjUX0.iiGwOFFnr + 1;
                l4dgYjUX0.iiGwOFFnr = i;
                if (i == l4dgYjUX0.GPLPRo6go) {
                    lSxPlj8FZ.J4Ux7ym32(l4dgYjUX0.kCA6Zs9sL, l4dgYjUX0.q3BipwRCk, round, l4dgYjUX0.tGV7Q6urW, l4dgYjUX0.dIocxURUo);
                    l4dgYjUX0.iiGwOFFnr = 0;
                    l4dgYjUX0.GPLPRo6go = 0;
                    return;
                }
                return;
            case 1:
                View view = (View) obj;
                PointF pointF2 = (PointF) obj2;
                int round2 = Math.round(pointF2.x);
                int round3 = Math.round(pointF2.y);
                lSxPlj8FZ.J4Ux7ym32(view, round2, round3, view.getWidth() + round2, view.getHeight() + round3);
                return;
            default:
                View view2 = (View) obj;
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                RBJDIwG1D.vPSbyrYWX(view2, RBJDIwG1D.iiGwOFFnr(view2), view2.getPaddingTop(), ((Float) obj2).intValue(), view2.getPaddingBottom());
                return;
        }
    }
}
