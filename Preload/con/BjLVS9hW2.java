package con;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.feravolt.preload.R;
import com.google.android.material.chip.ChipGroup;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class BjLVS9hW2 extends ViewGroup {
    public boolean Bhmn1KIah = false;
    public int CBQ5d1kRq;
    public int PSTqBLTET;
    public int kmSgne1rO;

    public BjLVS9hW2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, RisoK3egD.Puu3Rhg4F, 0, 0);
        this.CBQ5d1kRq = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.kmSgne1rO = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public int getItemSpacing() {
        return this.kmSgne1rO;
    }

    public int getLineSpacing() {
        return this.CBQ5d1kRq;
    }

    public int getRowCount() {
        return this.PSTqBLTET;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() == 0) {
            this.PSTqBLTET = 0;
            return;
        }
        this.PSTqBLTET = 1;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        boolean z2 = RBJDIwG1D.dIocxURUo(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingLeft;
        int i8 = paddingRight;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = marginLayoutParams.getMarginStart();
                    i6 = marginLayoutParams.getMarginEnd();
                } else {
                    i6 = 0;
                    i5 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i8 + i5;
                if (!this.Bhmn1KIah && measuredWidth > i7) {
                    i9 = this.CBQ5d1kRq + paddingTop;
                    this.PSTqBLTET++;
                    i8 = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.PSTqBLTET - 1));
                int i11 = i8 + i5;
                int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                if (z2) {
                    i11 = i7 - measuredWidth2;
                    measuredWidth2 = (i7 - i8) - i5;
                }
                childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                i8 += childAt.getMeasuredWidth() + i5 + i6 + this.kmSgne1rO;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + 0;
                    i5 = marginLayoutParams.rightMargin + 0;
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (childAt.getMeasuredWidth() + paddingLeft + i4 > paddingRight && !((ChipGroup) this).Bhmn1KIah) {
                    paddingLeft = getPaddingLeft();
                    i7 = paddingTop + this.CBQ5d1kRq;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i4;
                paddingTop = childAt.getMeasuredHeight() + i7;
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft = childAt.getMeasuredWidth() + i4 + i5 + this.kmSgne1rO + paddingLeft;
                if (i9 == getChildCount() - 1) {
                    i8 += i5;
                }
            }
        }
        int paddingRight2 = getPaddingRight() + i8;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i3 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i3 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i3) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i) {
        this.kmSgne1rO = i;
    }

    public void setLineSpacing(int i) {
        this.CBQ5d1kRq = i;
    }

    public void setSingleLine(boolean z) {
        this.Bhmn1KIah = z;
    }
}
