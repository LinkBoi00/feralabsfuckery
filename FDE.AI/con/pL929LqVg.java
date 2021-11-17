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
    public boolean qVUwofr5s(androidx.coordinatorlayout.widget.CoordinatorLayout r6, android.view.View r7, android.view.MotionEvent r8) {
        /*
            r5 = this;
            int r6 = r8.getActionMasked()
            r0 = -1
            r1 = 0
            r2 = 1
            r3 = 0
            if (r6 == r2) goto L_0x0041
            r4 = 2
            if (r6 == r4) goto L_0x002d
            r7 = 3
            if (r6 == r7) goto L_0x0045
            r7 = 6
            if (r6 == r7) goto L_0x0014
            goto L_0x0052
        L_0x0014:
            int r6 = r8.getActionIndex()
            if (r6 != 0) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r2 = r3
        L_0x001c:
            int r6 = r8.getPointerId(r2)
            r5.kCA6Zs9sL = r6
            float r6 = r8.getY(r2)
            r7 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r7
            int r6 = (int) r6
            r5.iiGwOFFnr = r6
            goto L_0x0052
        L_0x002d:
            int r6 = r5.kCA6Zs9sL
            int r6 = r8.findPointerIndex(r6)
            if (r6 != r0) goto L_0x0036
            return r3
        L_0x0036:
            float r6 = r8.getY(r6)
            int r6 = (int) r6
            r5.iiGwOFFnr = r6
            con.K6PL0z3I0.q3BipwRCk(r7)
            throw r1
        L_0x0041:
            android.view.VelocityTracker r6 = r5.Puu3Rhg4F
            if (r6 != 0) goto L_0x005c
        L_0x0045:
            r5.dIocxURUo = r3
            r5.kCA6Zs9sL = r0
            android.view.VelocityTracker r6 = r5.Puu3Rhg4F
            if (r6 == 0) goto L_0x0052
            r6.recycle()
            r5.Puu3Rhg4F = r1
        L_0x0052:
            android.view.VelocityTracker r6 = r5.Puu3Rhg4F
            if (r6 == 0) goto L_0x0059
            r6.addMovement(r8)
        L_0x0059:
            boolean r6 = r5.dIocxURUo
            return r6
        L_0x005c:
            r6.addMovement(r8)
            android.view.VelocityTracker r6 = r5.Puu3Rhg4F
            r8 = 1000(0x3e8, float:1.401E-42)
            r6.computeCurrentVelocity(r8)
            android.view.VelocityTracker r6 = r5.Puu3Rhg4F
            int r8 = r5.kCA6Zs9sL
            r6.getYVelocity(r8)
            con.K6PL0z3I0.q3BipwRCk(r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: con.pL929LqVg.qVUwofr5s(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }
}
