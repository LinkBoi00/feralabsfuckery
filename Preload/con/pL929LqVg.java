package con;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public abstract class pL929LqVg extends cUyADHjN1 {
    public VelocityTracker Puu3Rhg4F;
    public boolean dIocxURUo;
    public int iiGwOFFnr;
    public OverScroller tGV7Q6urW;
    public int kCA6Zs9sL = -1;
    public int GPLPRo6go = -1;

    public pL929LqVg() {
    }

    public pL929LqVg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public boolean GPLPRo6go(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        View view2;
        int findPointerIndex;
        if (this.GPLPRo6go < 0) {
            this.GPLPRo6go = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.dIocxURUo) {
            int i = this.kCA6Zs9sL;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.iiGwOFFnr) > this.GPLPRo6go) {
                this.iiGwOFFnr = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.kCA6Zs9sL = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            K6PL0z3I0.q3BipwRCk(view);
            WeakReference weakReference = ((AppBarLayout.BaseBehavior) this).oon79WMrY;
            boolean z = (weakReference == null || ((view2 = (View) weakReference.get()) != null && view2.isShown() && !view2.canScrollVertically(-1))) && coordinatorLayout.PSTqBLTET(view, x, y2);
            this.dIocxURUo = z;
            if (z) {
                this.iiGwOFFnr = y2;
                this.kCA6Zs9sL = motionEvent.getPointerId(0);
                if (this.Puu3Rhg4F == null) {
                    this.Puu3Rhg4F = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.tGV7Q6urW;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.tGV7Q6urW.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.Puu3Rhg4F;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean qVUwofr5s(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        int actionMasked = motionEvent.getActionMasked();
        int i = 1;
        if (actionMasked == 1) {
            VelocityTracker velocityTracker2 = this.Puu3Rhg4F;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
                this.Puu3Rhg4F.computeCurrentVelocity(1000);
                this.Puu3Rhg4F.getYVelocity(this.kCA6Zs9sL);
                K6PL0z3I0.q3BipwRCk(view);
                throw null;
            }
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.kCA6Zs9sL);
            if (findPointerIndex == -1) {
                return false;
            }
            this.iiGwOFFnr = (int) motionEvent.getY(findPointerIndex);
            K6PL0z3I0.q3BipwRCk(view);
            throw null;
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                if (motionEvent.getActionIndex() != 0) {
                    i = 0;
                }
                this.kCA6Zs9sL = motionEvent.getPointerId(i);
                this.iiGwOFFnr = (int) (motionEvent.getY(i) + 0.5f);
            }
            velocityTracker = this.Puu3Rhg4F;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return this.dIocxURUo;
        }
        this.dIocxURUo = false;
        this.kCA6Zs9sL = -1;
        VelocityTracker velocityTracker3 = this.Puu3Rhg4F;
        if (velocityTracker3 != null) {
            velocityTracker3.recycle();
            this.Puu3Rhg4F = null;
        }
        velocityTracker = this.Puu3Rhg4F;
        if (velocityTracker != null) {
        }
        return this.dIocxURUo;
    }
}
