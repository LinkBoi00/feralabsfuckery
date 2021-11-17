package con;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class fF8Q2DdlG extends Property {
    public final /* synthetic */ int q3BipwRCk;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fF8Q2DdlG(Class cls, String str, int i) {
        super(cls, str);
        this.q3BipwRCk = i;
        if (i != 1) {
        } else {
            super(cls, str);
        }
    }

    @Override // android.util.Property
    public Object get(Object obj) {
        switch (this.q3BipwRCk) {
            case 0:
                View view = (View) obj;
                return null;
            default:
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                return Float.valueOf((float) RBJDIwG1D.iiGwOFFnr((View) obj));
        }
    }

    @Override // android.util.Property
    public void set(Object obj, Object obj2) {
        switch (this.q3BipwRCk) {
            case 0:
                View view = (View) obj;
                PointF pointF = (PointF) obj2;
                lSxPlj8FZ.J4Ux7ym32(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
                return;
            default:
                View view2 = (View) obj;
                int intValue = ((Float) obj2).intValue();
                int paddingTop = view2.getPaddingTop();
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                RBJDIwG1D.vPSbyrYWX(view2, intValue, paddingTop, RBJDIwG1D.kCA6Zs9sL(view2), view2.getPaddingBottom());
                return;
        }
    }
}
