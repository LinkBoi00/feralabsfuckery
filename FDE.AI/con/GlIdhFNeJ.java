package con;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.feravolt.preload.R;
/* loaded from: classes.dex */
public abstract class GlIdhFNeJ {
    public static LmlART9vy q3BipwRCk(Context context, UxHHqhbTP uxHHqhbTP, boolean z, boolean z2) {
        rwMIknDWL rwmikndwl = uxHHqhbTP.j22ftfeNI;
        boolean z3 = false;
        int i = rwmikndwl == null ? 0 : rwmikndwl.Puu3Rhg4F;
        int qVUwofr5s = z2 ? z ? uxHHqhbTP.qVUwofr5s() : uxHHqhbTP.Eeka1udhb() : z ? uxHHqhbTP.yWvV4ePLl() : uxHHqhbTP.CBQ5d1kRq();
        uxHHqhbTP.n4UIOvAko(0, 0, 0, 0);
        ViewGroup viewGroup = uxHHqhbTP.igRQEZxnW;
        if (!(viewGroup == null || viewGroup.getTag(R.id.visible_removing_fragment_view_tag) == null)) {
            uxHHqhbTP.igRQEZxnW.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = uxHHqhbTP.igRQEZxnW;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        if (qVUwofr5s == 0 && i != 0) {
            qVUwofr5s = i != 4097 ? i != 4099 ? i != 8194 ? -1 : z ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
        }
        if (qVUwofr5s != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(qVUwofr5s));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, qVUwofr5s);
                    if (loadAnimation != null) {
                        return new LmlART9vy(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, qVUwofr5s);
                    if (loadAnimator != null) {
                        return new LmlART9vy(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, qVUwofr5s);
                        if (loadAnimation2 != null) {
                            return new LmlART9vy(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        return null;
    }
}
