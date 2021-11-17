package con;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
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
    public Animator vPSbyrYWX(ViewGroup viewGroup, kw8QXWz47 kw8qxwz47, kw8QXWz47 kw8qxwz472) {
        int i;
        ObjectAnimator objectAnimator;
        ZGLVjdFR3 zGLVjdFR3;
        Property property;
        Path path;
        if (kw8qxwz47 == null || kw8qxwz472 == null) {
            return null;
        }
        Map map = kw8qxwz47.q3BipwRCk;
        Map map2 = kw8qxwz472.q3BipwRCk;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = kw8qxwz472.J4Ux7ym32;
        Rect rect = (Rect) kw8qxwz47.q3BipwRCk.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) kw8qxwz472.q3BipwRCk.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) kw8qxwz47.q3BipwRCk.get("android:changeBounds:clip");
        Rect rect4 = (Rect) kw8qxwz472.q3BipwRCk.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (!(i6 == i7 && i8 == i9)) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        if (i <= 0) {
            return null;
        }
        lSxPlj8FZ.J4Ux7ym32(view, i2, i4, i6, i8);
        if (i != 2) {
            zGLVjdFR3 = this;
            if (i2 == i3 && i4 == i5) {
                path = zGLVjdFR3.qFBXIgpia.tGV7Q6urW((float) i6, (float) i8, (float) i7, (float) i9);
                property = o4LF8RkoQ;
            } else {
                path = zGLVjdFR3.qFBXIgpia.tGV7Q6urW((float) i2, (float) i4, (float) i3, (float) i5);
                property = V9LQMKGJe;
            }
        } else if (i10 == i12 && i11 == i13) {
            zGLVjdFR3 = this;
            path = zGLVjdFR3.qFBXIgpia.tGV7Q6urW((float) i2, (float) i4, (float) i3, (float) i5);
            property = QNqj6nIzv;
        } else {
            zGLVjdFR3 = this;
            L4dgYjUX0 l4dgYjUX0 = new L4dgYjUX0(view);
            ObjectAnimator i8XZMQc6Z = dnBSj5uJN.i8XZMQc6Z(l4dgYjUX0, vNtjxmzUM, zGLVjdFR3.qFBXIgpia.tGV7Q6urW((float) i2, (float) i4, (float) i3, (float) i5));
            ObjectAnimator i8XZMQc6Z2 = dnBSj5uJN.i8XZMQc6Z(l4dgYjUX0, i0Zug1mVk, zGLVjdFR3.qFBXIgpia.tGV7Q6urW((float) i6, (float) i8, (float) i7, (float) i9));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(i8XZMQc6Z, i8XZMQc6Z2);
            animatorSet.addListener(new TrUkkUfyq(zGLVjdFR3, l4dgYjUX0));
            objectAnimator = animatorSet;
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                b0fskPUIL.q3BipwRCk(viewGroup4, true);
                zGLVjdFR3.q3BipwRCk(new UloWEc3Hs(zGLVjdFR3, viewGroup4));
            }
            return objectAnimator;
        }
        objectAnimator = dnBSj5uJN.i8XZMQc6Z(view, property, path);
        if (view.getParent() instanceof ViewGroup) {
        }
        return objectAnimator;
    }
}
