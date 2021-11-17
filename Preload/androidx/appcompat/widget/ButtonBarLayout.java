package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.feravolt.preload.R;
import con.IuQbWntsc;
import con.VCCyeOu6I;
import con.ZolH67hOx;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {
    public boolean CBQ5d1kRq;
    public int kmSgne1rO = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = ZolH67hOx.vPSbyrYWX;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        IuQbWntsc.PSTqBLTET(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.CBQ5d1kRq = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(z ? 8388613 : 80);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(z ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public final boolean J4Ux7ym32() {
        return getOrientation() == 1;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(0, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.CBQ5d1kRq) {
            if (size > this.kmSgne1rO && J4Ux7ym32()) {
                setStacked(false);
            }
            this.kmSgne1rO = size;
        }
        if (J4Ux7ym32() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.CBQ5d1kRq && !J4Ux7ym32()) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int q3BipwRCk = q3BipwRCk(0);
        if (q3BipwRCk >= 0) {
            View childAt = getChildAt(q3BipwRCk);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (J4Ux7ym32()) {
                int q3BipwRCk2 = q3BipwRCk(q3BipwRCk + 1);
                i4 = q3BipwRCk2 >= 0 ? getChildAt(q3BipwRCk2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i4 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        if (VCCyeOu6I.dIocxURUo(this) != i4) {
            setMinimumHeight(i4);
        }
    }

    public final int q3BipwRCk(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void setAllowStacking(boolean z) {
        if (this.CBQ5d1kRq != z) {
            this.CBQ5d1kRq = z;
            if (!z && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
