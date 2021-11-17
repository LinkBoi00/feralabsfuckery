package con;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
/* loaded from: classes.dex */
public final class iL3TQF0fR extends Property {
    public Rect q3BipwRCk = new Rect();

    public iL3TQF0fR(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public Object get(Object obj) {
        ((Drawable) obj).copyBounds(this.q3BipwRCk);
        Rect rect = this.q3BipwRCk;
        return new PointF((float) rect.left, (float) rect.top);
    }

    @Override // android.util.Property
    public void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        PointF pointF = (PointF) obj2;
        drawable.copyBounds(this.q3BipwRCk);
        this.q3BipwRCk.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(this.q3BipwRCk);
    }
}
