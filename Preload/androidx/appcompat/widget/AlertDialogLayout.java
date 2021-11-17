package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.RG2GI7LDp;
import com.feravolt.preload.R;
import con.IuQbWntsc;
import con.RBJDIwG1D;
import con.VCCyeOu6I;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class AlertDialogLayout extends RG2GI7LDp {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public static int CBQ5d1kRq(View view) {
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        int dIocxURUo = VCCyeOu6I.dIocxURUo(view);
        if (dIocxURUo > 0) {
            return dIocxURUo;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return CBQ5d1kRq(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    @Override // androidx.appcompat.widget.RG2GI7LDp, android.view.ViewGroup, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i8 = gravity & 112;
        int i9 = gravity & 8388615;
        int paddingTop = i8 != 16 ? i8 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - measuredHeight : (((i4 - i2) - measuredHeight) / 2) + getPaddingTop();
        Drawable dividerDrawable = getDividerDrawable();
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                RG2GI7LDp.C0002RG2GI7LDp rG2GI7LDp = (RG2GI7LDp.C0002RG2GI7LDp) childAt.getLayoutParams();
                i9 = ((LinearLayout.LayoutParams) rG2GI7LDp).gravity;
                if (i9 < 0) {
                }
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                int absoluteGravity = Gravity.getAbsoluteGravity(i9, RBJDIwG1D.dIocxURUo(this)) & 7;
                if (absoluteGravity == 1) {
                    i6 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) rG2GI7LDp).leftMargin;
                } else if (absoluteGravity != 5) {
                    i5 = ((LinearLayout.LayoutParams) rG2GI7LDp).leftMargin + paddingLeft;
                    if (vPSbyrYWX(i10)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i11 = paddingTop + ((LinearLayout.LayoutParams) rG2GI7LDp).topMargin;
                    childAt.layout(i5, i11, measuredWidth + i5, measuredHeight2 + i11);
                    paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) rG2GI7LDp).bottomMargin + i11;
                } else {
                    i6 = paddingRight - measuredWidth;
                }
                i5 = i6 - ((LinearLayout.LayoutParams) rG2GI7LDp).rightMargin;
                if (vPSbyrYWX(i10)) {
                }
                int i112 = paddingTop + ((LinearLayout.LayoutParams) rG2GI7LDp).topMargin;
                childAt.layout(i5, i112, measuredWidth + i5, measuredHeight2 + i112);
                paddingTop = measuredHeight2 + ((LinearLayout.LayoutParams) rG2GI7LDp).bottomMargin + i112;
            }
        }
    }

    @Override // androidx.appcompat.widget.RG2GI7LDp, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int childCount = getChildCount();
        View view = null;
        boolean z = false;
        View view2 = null;
        View view3 = null;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id != R.id.buttonPanel) {
                    if (!((id == R.id.contentPanel || id == R.id.customPanel) && view3 == null)) {
                        break;
                    }
                    view3 = childAt;
                } else {
                    view2 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i, 0);
            paddingBottom += view.getMeasuredHeight();
            i3 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i3 = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            i5 = CBQ5d1kRq(view2);
            i4 = view2.getMeasuredHeight() - i5;
            paddingBottom += i5;
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (view3 != null) {
            view3.measure(i, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            i6 = view3.getMeasuredHeight();
            paddingBottom += i6;
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        } else {
            i6 = 0;
        }
        int i8 = size - paddingBottom;
        if (view2 != null) {
            int i9 = paddingBottom - i5;
            int min = Math.min(i8, i4);
            if (min > 0) {
                i8 -= min;
                i5 += min;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(i5, 1073741824));
            paddingBottom = i9 + view2.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
        }
        if (view3 != null && i8 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(i6 + i8, mode));
            paddingBottom = (paddingBottom - i6) + view3.getMeasuredHeight();
            i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                i10 = Math.max(i10, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + i10, i, i3), View.resolveSizeAndState(paddingBottom, i2, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt3 = getChildAt(i12);
                if (childAt3.getVisibility() != 8) {
                    RG2GI7LDp.C0002RG2GI7LDp rG2GI7LDp = (RG2GI7LDp.C0002RG2GI7LDp) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) rG2GI7LDp).width == -1) {
                        int i13 = ((LinearLayout.LayoutParams) rG2GI7LDp).height;
                        ((LinearLayout.LayoutParams) rG2GI7LDp).height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, makeMeasureSpec, 0, i2, 0);
                        ((LinearLayout.LayoutParams) rG2GI7LDp).height = i13;
                    }
                }
            }
        }
        z = true;
        if (!z) {
            super.onMeasure(i, i2);
        }
    }
}
