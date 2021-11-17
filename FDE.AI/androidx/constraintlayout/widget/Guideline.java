package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes.dex */
public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.RG2GI7LDp rG2GI7LDp = (ConstraintLayout.RG2GI7LDp) getLayoutParams();
        rG2GI7LDp.q3BipwRCk = i;
        setLayoutParams(rG2GI7LDp);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.RG2GI7LDp rG2GI7LDp = (ConstraintLayout.RG2GI7LDp) getLayoutParams();
        rG2GI7LDp.J4Ux7ym32 = i;
        setLayoutParams(rG2GI7LDp);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.RG2GI7LDp rG2GI7LDp = (ConstraintLayout.RG2GI7LDp) getLayoutParams();
        rG2GI7LDp.tGV7Q6urW = f;
        setLayoutParams(rG2GI7LDp);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
