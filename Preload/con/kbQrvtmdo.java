package con;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class kbQrvtmdo extends Property {
    public final /* synthetic */ int q3BipwRCk;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kbQrvtmdo(Class cls, String str, int i) {
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
                View view = (View) obj;
                return null;
            case 1:
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                return zDglqb3ZC.q3BipwRCk((View) obj);
            default:
                return Float.valueOf((float) ((View) obj).getLayoutParams().height);
        }
    }

    @Override // android.util.Property
    public void set(Object obj, Object obj2) {
        switch (this.q3BipwRCk) {
            case 0:
                View view = (View) obj;
                PointF pointF = (PointF) obj2;
                lSxPlj8FZ.J4Ux7ym32(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
                return;
            case 1:
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                zDglqb3ZC.tGV7Q6urW((View) obj, (Rect) obj2);
                return;
            default:
                View view2 = (View) obj;
                view2.getLayoutParams().height = ((Float) obj2).intValue();
                view2.requestLayout();
                return;
        }
    }
}
