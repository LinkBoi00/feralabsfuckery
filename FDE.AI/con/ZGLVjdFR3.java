package con;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class ZGLVjdFR3 extends SBj41z1W0 {
    public static final String[] NyWTwPF6V = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property vNtjxmzUM = new wqO9tBcnn(PointF.class, "topLeft", 0);
    public static final Property i0Zug1mVk = new Igb0CxGE0(PointF.class, "bottomRight", 0);
    public static final Property o4LF8RkoQ = new kbQrvtmdo(PointF.class, "bottomRight", 0);
    public static final Property V9LQMKGJe = new fF8Q2DdlG(PointF.class, "topLeft", 0);
    public static final Property QNqj6nIzv = new wqO9tBcnn(PointF.class, "position", 1);

    static {
        new iL3TQF0fR(PointF.class, "boundsOrigin");
    }

    @Override // con.SBj41z1W0
    public void GPLPRo6go(kw8QXWz47 kw8qxwz47) {
        mUqPm6GBh(kw8qxwz47);
    }

    @Override // con.SBj41z1W0
    public String[] MzoOEjc4X() {
        return NyWTwPF6V;
    }

    @Override // con.SBj41z1W0
    public void dIocxURUo(kw8QXWz47 kw8qxwz47) {
        mUqPm6GBh(kw8qxwz47);
    }

    public final void mUqPm6GBh(kw8QXWz47 kw8qxwz47) {
        View view = kw8qxwz47.J4Ux7ym32;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        if (mN6fklC4R.tGV7Q6urW(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            kw8qxwz47.q3BipwRCk.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            kw8qxwz47.q3BipwRCk.put("android:changeBounds:parent", kw8qxwz47.J4Ux7ym32.getParent());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114  */
    @Override // con.SBj41z1W0
    /* Code decompiled incorrectly, please refer to instructions dump */
    public android.animation.Animator vPSbyrYWX(android.view.ViewGroup r19, con.kw8QXWz47 r20, con.kw8QXWz47 r21) {
        /*
        // Method dump skipped, instructions count: 302
        */
        throw new UnsupportedOperationException("Method not decompiled: con.ZGLVjdFR3.vPSbyrYWX(android.view.ViewGroup, con.kw8QXWz47, con.kw8QXWz47):android.animation.Animator");
    }
}
