package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import con.AtjDcRag6;
import con.LKa8y802S;
import con.iFKnyAZAM;
import con.yCyhNTFLv;
import java.util.Objects;
/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final iFKnyAZAM Puu3Rhg4F = new iFKnyAZAM((SwipeDismissBehavior) this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public boolean Eeka1udhb(View view) {
        Objects.requireNonNull(this.Puu3Rhg4F);
        return view instanceof AtjDcRag6;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public boolean GPLPRo6go(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        iFKnyAZAM ifknyazam = this.Puu3Rhg4F;
        Objects.requireNonNull(ifknyazam);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (LKa8y802S.kCA6Zs9sL == null) {
                    LKa8y802S.kCA6Zs9sL = new LKa8y802S(8);
                }
                LKa8y802S lKa8y802S = LKa8y802S.kCA6Zs9sL;
                yCyhNTFLv ycyhntflv = (yCyhNTFLv) ifknyazam.kmSgne1rO;
                synchronized (lKa8y802S.q3BipwRCk) {
                    lKa8y802S.PSTqBLTET(ycyhntflv);
                }
            }
        } else if (coordinatorLayout.PSTqBLTET(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (LKa8y802S.kCA6Zs9sL == null) {
                LKa8y802S.kCA6Zs9sL = new LKa8y802S(8);
            }
            LKa8y802S lKa8y802S2 = LKa8y802S.kCA6Zs9sL;
            yCyhNTFLv ycyhntflv2 = (yCyhNTFLv) ifknyazam.kmSgne1rO;
            synchronized (lKa8y802S2.q3BipwRCk) {
                lKa8y802S2.PSTqBLTET(ycyhntflv2);
            }
        }
        return super.GPLPRo6go(coordinatorLayout, view, motionEvent);
    }
}
