package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import con.C8A1BseZU;
import con.IuQbWntsc;
import con.ZolH67hOx;
import con.abGBwSu8x;
import con.qyCamnJnJ;
/* loaded from: classes.dex */
public abstract class RG2GI7LDp extends ViewGroup {
    public boolean Eeka1udhb;
    public int PSTqBLTET;
    public int[] RG6kpfv3v;
    public int WaUP0CF08;
    public int[] dXrmkklc8;
    public int dfpT1j18n;
    public int i8XZMQc6Z;
    public int ilHKhw3Yw;
    public Drawable ixWaw2akD;
    public int kmSgne1rO;
    public float qVUwofr5s;
    public int sk5s77z6Q;
    public boolean CBQ5d1kRq = true;
    public int Bhmn1KIah = 0;
    public int MzoOEjc4X = 8388659;

    /* renamed from: androidx.appcompat.widget.RG2GI7LDp$RG2GI7LDp */
    /* loaded from: classes.dex */
    public static class C0002RG2GI7LDp extends LinearLayout.LayoutParams {
        public C0002RG2GI7LDp(int i, int i2) {
            super(i, i2);
        }

        public C0002RG2GI7LDp(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0002RG2GI7LDp(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public RG2GI7LDp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int resourceId;
        this.kmSgne1rO = -1;
        int[] iArr = ZolH67hOx.kmSgne1rO;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        IuQbWntsc.PSTqBLTET(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = obtainStyledAttributes.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = obtainStyledAttributes.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = obtainStyledAttributes.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.qVUwofr5s = obtainStyledAttributes.getFloat(4, -1.0f);
        this.kmSgne1rO = obtainStyledAttributes.getInt(3, -1);
        this.Eeka1udhb = obtainStyledAttributes.getBoolean(7, false);
        setDividerDrawable((!obtainStyledAttributes.hasValue(5) || (resourceId = obtainStyledAttributes.getResourceId(5, 0)) == 0) ? obtainStyledAttributes.getDrawable(5) : C8A1BseZU.q3BipwRCk(context, resourceId));
        this.i8XZMQc6Z = obtainStyledAttributes.getInt(8, 0);
        this.dfpT1j18n = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }

    public void GPLPRo6go(Canvas canvas, int i) {
        this.ixWaw2akD.setBounds(i, getPaddingTop() + this.dfpT1j18n, this.sk5s77z6Q + i, (getHeight() - getPaddingBottom()) - this.dfpT1j18n);
        this.ixWaw2akD.draw(canvas);
    }

    /* renamed from: Puu3Rhg4F */
    public C0002RG2GI7LDp generateDefaultLayoutParams() {
        int i = this.PSTqBLTET;
        if (i == 0) {
            return new C0002RG2GI7LDp(-2, -2);
        }
        if (i == 1) {
            return new C0002RG2GI7LDp(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0002RG2GI7LDp;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.kmSgne1rO < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.kmSgne1rO;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.Bhmn1KIah;
                if (this.PSTqBLTET == 1 && (i = this.MzoOEjc4X & 112) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.ilHKhw3Yw) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.ilHKhw3Yw;
                    }
                }
                return i3 + ((LinearLayout.LayoutParams) ((C0002RG2GI7LDp) childAt.getLayoutParams())).topMargin + baseline;
            } else if (this.kmSgne1rO == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.kmSgne1rO;
    }

    public Drawable getDividerDrawable() {
        return this.ixWaw2akD;
    }

    public int getDividerPadding() {
        return this.dfpT1j18n;
    }

    public int getDividerWidth() {
        return this.sk5s77z6Q;
    }

    public int getGravity() {
        return this.MzoOEjc4X;
    }

    public int getOrientation() {
        return this.PSTqBLTET;
    }

    public int getShowDividers() {
        return this.i8XZMQc6Z;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.qVUwofr5s;
    }

    public void iiGwOFFnr(Canvas canvas, int i) {
        this.ixWaw2akD.setBounds(getPaddingLeft() + this.dfpT1j18n, i, (getWidth() - getPaddingRight()) - this.dfpT1j18n, this.WaUP0CF08 + i);
        this.ixWaw2akD.draw(canvas);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        if (this.ixWaw2akD != null) {
            int i4 = 0;
            if (this.PSTqBLTET == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i4 < virtualChildCount) {
                    View childAt = getChildAt(i4);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !vPSbyrYWX(i4))) {
                        iiGwOFFnr(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((C0002RG2GI7LDp) childAt.getLayoutParams())).topMargin) - this.WaUP0CF08);
                    }
                    i4++;
                }
                if (vPSbyrYWX(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    iiGwOFFnr(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.WaUP0CF08 : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0002RG2GI7LDp) childAt2.getLayoutParams())).bottomMargin);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean J4Ux7ym32 = qyCamnJnJ.J4Ux7ym32(this);
            while (i4 < virtualChildCount2) {
                View childAt3 = getChildAt(i4);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !vPSbyrYWX(i4))) {
                    C0002RG2GI7LDp rG2GI7LDp = (C0002RG2GI7LDp) childAt3.getLayoutParams();
                    GPLPRo6go(canvas, J4Ux7ym32 ? childAt3.getRight() + ((LinearLayout.LayoutParams) rG2GI7LDp).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) rG2GI7LDp).leftMargin) - this.sk5s77z6Q);
                }
                i4++;
            }
            if (vPSbyrYWX(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    C0002RG2GI7LDp rG2GI7LDp2 = (C0002RG2GI7LDp) childAt4.getLayoutParams();
                    if (J4Ux7ym32) {
                        i3 = childAt4.getLeft();
                        i2 = ((LinearLayout.LayoutParams) rG2GI7LDp2).leftMargin;
                        i = (i3 - i2) - this.sk5s77z6Q;
                        GPLPRo6go(canvas, i);
                    }
                    i = childAt4.getRight() + ((LinearLayout.LayoutParams) rG2GI7LDp2).rightMargin;
                    GPLPRo6go(canvas, i);
                } else if (J4Ux7ym32) {
                    i = getPaddingLeft();
                    GPLPRo6go(canvas, i);
                } else {
                    i3 = getWidth();
                    i2 = getPaddingRight();
                    i = (i3 - i2) - this.sk5s77z6Q;
                    GPLPRo6go(canvas, i);
                }
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a7  */
    @Override // android.view.ViewGroup, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onLayout(boolean r26, int r27, int r28, int r29, int r30) {
        /*
        // Method dump skipped, instructions count: 466
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.RG2GI7LDp.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x02b2, code lost:
        if (r13 < 0) goto L_0x02b4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0731, code lost:
        if (r7 < 0) goto L_0x0733;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0862  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:423:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onMeasure(int r38, int r39) {
        /*
        // Method dump skipped, instructions count: 2250
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.RG2GI7LDp.onMeasure(int, int):void");
    }

    /* renamed from: oon79WMrY */
    public C0002RG2GI7LDp generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0002RG2GI7LDp(layoutParams);
    }

    public void setBaselineAligned(boolean z) {
        this.CBQ5d1kRq = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("base aligned child index out of range (0, ");
            q3BipwRCk.append(getChildCount());
            q3BipwRCk.append(")");
            throw new IllegalArgumentException(q3BipwRCk.toString());
        }
        this.kmSgne1rO = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.ixWaw2akD) {
            this.ixWaw2akD = drawable;
            boolean z = false;
            if (drawable != null) {
                this.sk5s77z6Q = drawable.getIntrinsicWidth();
                this.WaUP0CF08 = drawable.getIntrinsicHeight();
            } else {
                this.sk5s77z6Q = 0;
                this.WaUP0CF08 = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.dfpT1j18n = i;
    }

    public void setGravity(int i) {
        if (this.MzoOEjc4X != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.MzoOEjc4X = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.MzoOEjc4X;
        if ((8388615 & i3) != i2) {
            this.MzoOEjc4X = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.Eeka1udhb = z;
    }

    public void setOrientation(int i) {
        if (this.PSTqBLTET != i) {
            this.PSTqBLTET = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.i8XZMQc6Z) {
            requestLayout();
        }
        this.i8XZMQc6Z = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.MzoOEjc4X;
        if ((i3 & 112) != i2) {
            this.MzoOEjc4X = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.qVUwofr5s = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean vPSbyrYWX(int i) {
        if (i == 0) {
            return (this.i8XZMQc6Z & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.i8XZMQc6Z & 4) != 0;
        }
        if ((this.i8XZMQc6Z & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: yWvV4ePLl */
    public C0002RG2GI7LDp generateLayoutParams(AttributeSet attributeSet) {
        return new C0002RG2GI7LDp(getContext(), attributeSet);
    }
}
