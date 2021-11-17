package con;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class Yg5AJdYv8 {
    public final ZmYjNS8wW q3BipwRCk = new ZmYjNS8wW();
    public final ZmYjNS8wW J4Ux7ym32 = new ZmYjNS8wW();

    public static Yg5AJdYv8 J4Ux7ym32(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return tGV7Q6urW(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return tGV7Q6urW(arrayList);
        } catch (Exception e) {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Can't load animation resource ID #0x");
            q3BipwRCk.append(Integer.toHexString(i));
            Log.w("MotionSpec", q3BipwRCk.toString(), e);
            return null;
        }
    }

    public static Yg5AJdYv8 q3BipwRCk(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return J4Ux7ym32(context, resourceId);
    }

    public static Yg5AJdYv8 tGV7Q6urW(List list) {
        Yg5AJdYv8 yg5AJdYv8 = new Yg5AJdYv8();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                yg5AJdYv8.J4Ux7ym32.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = vZAFqpduB.J4Ux7ym32;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = vZAFqpduB.tGV7Q6urW;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = vZAFqpduB.dIocxURUo;
                }
                cTam6szPC ctam6szpc = new cTam6szPC(startDelay, duration, interpolator);
                ctam6szpc.dIocxURUo = objectAnimator.getRepeatCount();
                ctam6szpc.kCA6Zs9sL = objectAnimator.getRepeatMode();
                yg5AJdYv8.q3BipwRCk.put(propertyName, ctam6szpc);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return yg5AJdYv8;
    }

    public cTam6szPC dIocxURUo(String str) {
        if (this.q3BipwRCk.getOrDefault(str, null) != null) {
            return (cTam6szPC) this.q3BipwRCk.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Yg5AJdYv8)) {
            return false;
        }
        return this.q3BipwRCk.equals(((Yg5AJdYv8) obj).q3BipwRCk);
    }

    public int hashCode() {
        return this.q3BipwRCk.hashCode();
    }

    public String toString() {
        return '\n' + Yg5AJdYv8.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.q3BipwRCk + "}\n";
    }
}
