package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import con.C8A1BseZU;
import con.IuQbWntsc;
import con.RBJDIwG1D;
import con.ZolH67hOx;
import con.abGBwSu8x;
import con.qyCamnJnJ;
import java.util.WeakHashMap;
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
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 8;
        int i17 = 5;
        if (this.PSTqBLTET == 1) {
            int paddingLeft = getPaddingLeft();
            int i18 = i3 - i;
            int paddingRight = i18 - getPaddingRight();
            int paddingRight2 = (i18 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i19 = this.MzoOEjc4X;
            int i20 = i19 & 112;
            int i21 = 8388615 & i19;
            int paddingTop = i20 != 16 ? i20 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.ilHKhw3Yw : getPaddingTop() + (((i4 - i2) - this.ilHKhw3Yw) / 2);
            int i22 = 0;
            while (i22 < virtualChildCount) {
                View childAt = getChildAt(i22);
                if (childAt == null) {
                    paddingTop += 0;
                } else if (childAt.getVisibility() != i16) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    C0002RG2GI7LDp rG2GI7LDp = (C0002RG2GI7LDp) childAt.getLayoutParams();
                    int i23 = ((LinearLayout.LayoutParams) rG2GI7LDp).gravity;
                    if (i23 < 0) {
                        i23 = i21;
                    }
                    WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                    int absoluteGravity = Gravity.getAbsoluteGravity(i23, RBJDIwG1D.dIocxURUo(this)) & 7;
                    if (absoluteGravity == 1) {
                        i15 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) rG2GI7LDp).leftMargin;
                    } else if (absoluteGravity != i17) {
                        i14 = ((LinearLayout.LayoutParams) rG2GI7LDp).leftMargin + paddingLeft;
                        if (vPSbyrYWX(i22)) {
                            paddingTop += this.WaUP0CF08;
                        }
                        int i24 = paddingTop + ((LinearLayout.LayoutParams) rG2GI7LDp).topMargin;
                        int i25 = i24 + 0;
                        childAt.layout(i14, i25, measuredWidth + i14, measuredHeight + i25);
                        paddingTop = measuredHeight + ((LinearLayout.LayoutParams) rG2GI7LDp).bottomMargin + 0 + i24;
                        i22 += 0;
                    } else {
                        i15 = paddingRight - measuredWidth;
                    }
                    i14 = i15 - ((LinearLayout.LayoutParams) rG2GI7LDp).rightMargin;
                    if (vPSbyrYWX(i22)) {
                    }
                    int i242 = paddingTop + ((LinearLayout.LayoutParams) rG2GI7LDp).topMargin;
                    int i252 = i242 + 0;
                    childAt.layout(i14, i252, measuredWidth + i14, measuredHeight + i252);
                    paddingTop = measuredHeight + ((LinearLayout.LayoutParams) rG2GI7LDp).bottomMargin + 0 + i242;
                    i22 += 0;
                }
                i22++;
                i16 = 8;
                i17 = 5;
            }
            return;
        }
        boolean J4Ux7ym32 = qyCamnJnJ.J4Ux7ym32(this);
        int paddingTop2 = getPaddingTop();
        int i26 = i4 - i2;
        int paddingBottom = i26 - getPaddingBottom();
        int paddingBottom2 = (i26 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i27 = this.MzoOEjc4X;
        int i28 = 8388615 & i27;
        int i29 = i27 & 112;
        boolean z2 = this.CBQ5d1kRq;
        int[] iArr = this.dXrmkklc8;
        int[] iArr2 = this.RG6kpfv3v;
        WeakHashMap weakHashMap2 = IuQbWntsc.q3BipwRCk;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i28, RBJDIwG1D.dIocxURUo(this));
        int paddingLeft2 = absoluteGravity2 != 1 ? absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.ilHKhw3Yw : getPaddingLeft() + (((i3 - i) - this.ilHKhw3Yw) / 2);
        if (J4Ux7ym32) {
            i6 = virtualChildCount2 - 1;
            i5 = -1;
        } else {
            i5 = 1;
            i6 = 0;
        }
        int i30 = paddingLeft2;
        int i31 = 0;
        while (i31 < virtualChildCount2) {
            int i32 = (i5 * i31) + i6;
            View childAt2 = getChildAt(i32);
            if (childAt2 == null) {
                i30 += 0;
            } else if (childAt2.getVisibility() != 8) {
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                C0002RG2GI7LDp rG2GI7LDp2 = (C0002RG2GI7LDp) childAt2.getLayoutParams();
                i7 = i6;
                if (z2) {
                    i8 = virtualChildCount2;
                    if (((LinearLayout.LayoutParams) rG2GI7LDp2).height != -1) {
                        i9 = childAt2.getBaseline();
                        i10 = ((LinearLayout.LayoutParams) rG2GI7LDp2).gravity;
                        if (i10 < 0) {
                            i10 = i29;
                        }
                        i11 = i10 & 112;
                        i12 = i29;
                        if (i11 != 16) {
                            i13 = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) rG2GI7LDp2).topMargin) - ((LinearLayout.LayoutParams) rG2GI7LDp2).bottomMargin;
                        } else if (i11 == 48) {
                            i13 = ((LinearLayout.LayoutParams) rG2GI7LDp2).topMargin + paddingTop2;
                            if (i9 != -1) {
                                i13 = (iArr[1] - i9) + i13;
                            }
                        } else if (i11 != 80) {
                            i13 = paddingTop2;
                        } else {
                            i13 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) rG2GI7LDp2).bottomMargin;
                            if (i9 != -1) {
                                i13 -= iArr2[2] - (childAt2.getMeasuredHeight() - i9);
                            }
                        }
                        if (vPSbyrYWX(i32)) {
                            i30 += this.sk5s77z6Q;
                        }
                        int i33 = i30 + ((LinearLayout.LayoutParams) rG2GI7LDp2).leftMargin;
                        int i34 = i33 + 0;
                        childAt2.layout(i34, i13, measuredWidth2 + i34, measuredHeight2 + i13);
                        i30 = measuredWidth2 + ((LinearLayout.LayoutParams) rG2GI7LDp2).rightMargin + 0 + i33;
                        i31 += 0;
                        i31++;
                        i6 = i7;
                        virtualChildCount2 = i8;
                        i29 = i12;
                    }
                } else {
                    i8 = virtualChildCount2;
                }
                i9 = -1;
                i10 = ((LinearLayout.LayoutParams) rG2GI7LDp2).gravity;
                if (i10 < 0) {
                }
                i11 = i10 & 112;
                i12 = i29;
                if (i11 != 16) {
                }
                if (vPSbyrYWX(i32)) {
                }
                int i332 = i30 + ((LinearLayout.LayoutParams) rG2GI7LDp2).leftMargin;
                int i342 = i332 + 0;
                childAt2.layout(i342, i13, measuredWidth2 + i342, measuredHeight2 + i13);
                i30 = measuredWidth2 + ((LinearLayout.LayoutParams) rG2GI7LDp2).rightMargin + 0 + i332;
                i31 += 0;
                i31++;
                i6 = i7;
                virtualChildCount2 = i8;
                i29 = i12;
            }
            i7 = i6;
            i8 = virtualChildCount2;
            i12 = i29;
            i31++;
            i6 = i7;
            virtualChildCount2 = i8;
            i29 = i12;
        }
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
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f;
        int i9;
        char c;
        int i10;
        int i11;
        int i12;
        float f2;
        int i13;
        boolean z;
        int baseline;
        int i14;
        int i15;
        char c2;
        boolean z2;
        boolean z3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z4;
        C0002RG2GI7LDp rG2GI7LDp;
        int i21;
        boolean z5;
        int i22;
        int i23;
        int baseline2;
        int i24;
        float f3;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z6;
        int i29;
        int i30;
        int i31;
        boolean z7;
        int i32;
        int i33;
        int i34;
        int i35;
        C0002RG2GI7LDp rG2GI7LDp2;
        boolean z8;
        boolean z9;
        int i36;
        int i37;
        int i38 = -2;
        int i39 = Integer.MIN_VALUE;
        int i40 = 8;
        float f4 = 0.0f;
        int i41 = 1073741824;
        boolean z10 = true;
        int i42 = 0;
        if (this.PSTqBLTET == 1) {
            this.ilHKhw3Yw = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i43 = this.kmSgne1rO;
            boolean z11 = this.Eeka1udhb;
            int i44 = 0;
            int i45 = 0;
            int i46 = 0;
            int i47 = 0;
            int i48 = 0;
            boolean z12 = false;
            boolean z13 = false;
            int i49 = 0;
            boolean z14 = true;
            float f5 = 0.0f;
            while (i44 < virtualChildCount) {
                View childAt = getChildAt(i44);
                if (childAt == null) {
                    this.ilHKhw3Yw += i42;
                } else if (childAt.getVisibility() == i40) {
                    i44 += 0;
                } else {
                    if (vPSbyrYWX(i44)) {
                        this.ilHKhw3Yw += this.WaUP0CF08;
                    }
                    C0002RG2GI7LDp rG2GI7LDp3 = (C0002RG2GI7LDp) childAt.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) rG2GI7LDp3).weight;
                    f5 += f6;
                    if (mode2 == i41 && ((LinearLayout.LayoutParams) rG2GI7LDp3).height == 0 && f6 > f4) {
                        int i50 = this.ilHKhw3Yw;
                        this.ilHKhw3Yw = Math.max(i50, ((LinearLayout.LayoutParams) rG2GI7LDp3).topMargin + i50 + ((LinearLayout.LayoutParams) rG2GI7LDp3).bottomMargin);
                        i32 = i43;
                        i31 = mode2;
                        i35 = mode;
                        i30 = virtualChildCount;
                        rG2GI7LDp2 = rG2GI7LDp3;
                        z8 = true;
                        z7 = true;
                    } else {
                        if (((LinearLayout.LayoutParams) rG2GI7LDp3).height != 0 || f6 <= f4) {
                            i36 = i39;
                        } else {
                            ((LinearLayout.LayoutParams) rG2GI7LDp3).height = i38;
                            i36 = 0;
                        }
                        if (f5 == f4) {
                            i37 = this.ilHKhw3Yw;
                            i32 = i43;
                        } else {
                            i32 = i43;
                            i37 = 0;
                        }
                        i31 = mode2;
                        i35 = mode;
                        i30 = virtualChildCount;
                        rG2GI7LDp2 = rG2GI7LDp3;
                        z7 = true;
                        measureChildWithMargins(childAt, i, 0, i2, i37);
                        if (i36 != i39) {
                            ((LinearLayout.LayoutParams) rG2GI7LDp2).height = i36;
                        }
                        int measuredHeight = childAt.getMeasuredHeight();
                        int i51 = this.ilHKhw3Yw;
                        this.ilHKhw3Yw = Math.max(i51, i51 + measuredHeight + ((LinearLayout.LayoutParams) rG2GI7LDp2).topMargin + ((LinearLayout.LayoutParams) rG2GI7LDp2).bottomMargin + 0);
                        if (z11) {
                            i46 = Math.max(measuredHeight, i46);
                        }
                        z8 = z12;
                    }
                    if (i32 >= 0 && i32 == i44 + 1) {
                        this.Bhmn1KIah = this.ilHKhw3Yw;
                    }
                    if (i44 >= i32 || ((LinearLayout.LayoutParams) rG2GI7LDp2).weight <= 0.0f) {
                        i34 = i35;
                        if (i34 == 1073741824 || ((LinearLayout.LayoutParams) rG2GI7LDp2).width != -1) {
                            z9 = false;
                        } else {
                            z9 = z7;
                            z13 = z9;
                        }
                        int i52 = ((LinearLayout.LayoutParams) rG2GI7LDp2).leftMargin + ((LinearLayout.LayoutParams) rG2GI7LDp2).rightMargin;
                        int measuredWidth = childAt.getMeasuredWidth() + i52;
                        i33 = Math.max(i45, measuredWidth);
                        i49 = View.combineMeasuredStates(i49, childAt.getMeasuredState());
                        boolean z15 = (!z14 || ((LinearLayout.LayoutParams) rG2GI7LDp2).width != -1) ? false : z7;
                        if (((LinearLayout.LayoutParams) rG2GI7LDp2).weight > 0.0f) {
                            if (!z9) {
                                i52 = measuredWidth;
                            }
                            i48 = Math.max(i48, i52);
                        } else {
                            if (!z9) {
                                i52 = measuredWidth;
                            }
                            i47 = Math.max(i47, i52);
                            i48 = i48;
                        }
                        i44 += 0;
                        z12 = z8;
                        z14 = z15;
                        i44++;
                        mode = i34;
                        i45 = i33;
                        i43 = i32;
                        z10 = z7;
                        mode2 = i31;
                        virtualChildCount = i30;
                        i42 = 0;
                        i38 = -2;
                        i39 = Integer.MIN_VALUE;
                        i40 = 8;
                        f4 = 0.0f;
                        i41 = 1073741824;
                    } else {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                }
                i32 = i43;
                i31 = mode2;
                i34 = mode;
                i30 = virtualChildCount;
                i33 = i45;
                z7 = true;
                i44++;
                mode = i34;
                i45 = i33;
                i43 = i32;
                z10 = z7;
                mode2 = i31;
                virtualChildCount = i30;
                i42 = 0;
                i38 = -2;
                i39 = Integer.MIN_VALUE;
                i40 = 8;
                f4 = 0.0f;
                i41 = 1073741824;
            }
            int i53 = i45;
            int i54 = i47;
            int i55 = i49;
            if (this.ilHKhw3Yw > 0 && vPSbyrYWX(virtualChildCount)) {
                this.ilHKhw3Yw += this.WaUP0CF08;
            }
            int i56 = mode2;
            if (z11 && (i56 == Integer.MIN_VALUE || i56 == 0)) {
                int i57 = 0;
                this.ilHKhw3Yw = 0;
                int i58 = 0;
                while (i58 < virtualChildCount) {
                    View childAt2 = getChildAt(i58);
                    if (childAt2 == null) {
                        this.ilHKhw3Yw += i57;
                    } else if (childAt2.getVisibility() == 8) {
                        i58 += 0;
                    } else {
                        C0002RG2GI7LDp rG2GI7LDp4 = (C0002RG2GI7LDp) childAt2.getLayoutParams();
                        int i59 = this.ilHKhw3Yw;
                        this.ilHKhw3Yw = Math.max(i59, i59 + i46 + ((LinearLayout.LayoutParams) rG2GI7LDp4).topMargin + ((LinearLayout.LayoutParams) rG2GI7LDp4).bottomMargin + 0);
                    }
                    i58++;
                    i57 = 0;
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.ilHKhw3Yw;
            this.ilHKhw3Yw = paddingBottom;
            int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, 0);
            int i60 = (16777215 & resolveSizeAndState) - this.ilHKhw3Yw;
            if (z12 || (i60 != 0 && f5 > 0.0f)) {
                float f7 = this.qVUwofr5s;
                if (f7 > 0.0f) {
                    f5 = f7;
                }
                this.ilHKhw3Yw = 0;
                int i61 = 0;
                while (i61 < virtualChildCount) {
                    View childAt3 = getChildAt(i61);
                    if (childAt3.getVisibility() == 8) {
                        i26 = i56;
                    } else {
                        C0002RG2GI7LDp rG2GI7LDp5 = (C0002RG2GI7LDp) childAt3.getLayoutParams();
                        float f8 = ((LinearLayout.LayoutParams) rG2GI7LDp5).weight;
                        if (f8 > 0.0f) {
                            int i62 = (int) ((((float) i60) * f8) / f5);
                            f5 -= f8;
                            i60 -= i62;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) rG2GI7LDp5).leftMargin + ((LinearLayout.LayoutParams) rG2GI7LDp5).rightMargin, ((LinearLayout.LayoutParams) rG2GI7LDp5).width);
                            if (((LinearLayout.LayoutParams) rG2GI7LDp5).height == 0 && i56 == 1073741824) {
                                if (i62 > 0) {
                                    i29 = i62;
                                    childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i29, 1073741824));
                                    i55 = View.combineMeasuredStates(i55, childAt3.getMeasuredState() & -256);
                                }
                                i29 = 0;
                                childAt3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i29, 1073741824));
                                i55 = View.combineMeasuredStates(i55, childAt3.getMeasuredState() & -256);
                            } else {
                                i29 = childAt3.getMeasuredHeight() + i62;
                            }
                        }
                        int i63 = ((LinearLayout.LayoutParams) rG2GI7LDp5).leftMargin + ((LinearLayout.LayoutParams) rG2GI7LDp5).rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i63;
                        i53 = Math.max(i53, measuredWidth2);
                        i26 = i56;
                        if (mode != 1073741824) {
                            i27 = i60;
                            i28 = -1;
                            if (((LinearLayout.LayoutParams) rG2GI7LDp5).width == -1) {
                                z6 = z10;
                                if (!z6) {
                                    i63 = measuredWidth2;
                                }
                                i54 = Math.max(i54, i63);
                                boolean z16 = (z14 || ((LinearLayout.LayoutParams) rG2GI7LDp5).width != i28) ? false : z10;
                                int i64 = this.ilHKhw3Yw;
                                this.ilHKhw3Yw = Math.max(i64, childAt3.getMeasuredHeight() + i64 + ((LinearLayout.LayoutParams) rG2GI7LDp5).topMargin + ((LinearLayout.LayoutParams) rG2GI7LDp5).bottomMargin + 0);
                                z14 = z16;
                                i60 = i27;
                            }
                        } else {
                            i27 = i60;
                            i28 = -1;
                        }
                        z6 = false;
                        if (!z6) {
                        }
                        i54 = Math.max(i54, i63);
                        if (z14) {
                        }
                        int i642 = this.ilHKhw3Yw;
                        this.ilHKhw3Yw = Math.max(i642, childAt3.getMeasuredHeight() + i642 + ((LinearLayout.LayoutParams) rG2GI7LDp5).topMargin + ((LinearLayout.LayoutParams) rG2GI7LDp5).bottomMargin + 0);
                        z14 = z16;
                        i60 = i27;
                    }
                    i61++;
                    i56 = i26;
                }
                this.ilHKhw3Yw = getPaddingBottom() + getPaddingTop() + this.ilHKhw3Yw;
            } else {
                i54 = Math.max(i54, i48);
                if (z11 && i56 != 1073741824) {
                    for (int i65 = 0; i65 < virtualChildCount; i65++) {
                        View childAt4 = getChildAt(i65);
                        if (!(childAt4 == null || childAt4.getVisibility() == 8 || ((LinearLayout.LayoutParams) ((C0002RG2GI7LDp) childAt4.getLayoutParams())).weight <= 0.0f)) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i46, 1073741824));
                        }
                    }
                }
            }
            if (z14 || mode == 1073741824) {
                i54 = i53;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i54, getSuggestedMinimumWidth()), i, i55), resolveSizeAndState);
            if (z13) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i66 = 0; i66 < virtualChildCount; i66++) {
                    View childAt5 = getChildAt(i66);
                    if (childAt5.getVisibility() != 8) {
                        C0002RG2GI7LDp rG2GI7LDp6 = (C0002RG2GI7LDp) childAt5.getLayoutParams();
                        if (((LinearLayout.LayoutParams) rG2GI7LDp6).width == -1) {
                            int i67 = ((LinearLayout.LayoutParams) rG2GI7LDp6).height;
                            ((LinearLayout.LayoutParams) rG2GI7LDp6).height = childAt5.getMeasuredHeight();
                            measureChildWithMargins(childAt5, makeMeasureSpec, 0, i2, 0);
                            ((LinearLayout.LayoutParams) rG2GI7LDp6).height = i67;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.ilHKhw3Yw = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (this.dXrmkklc8 == null || this.RG6kpfv3v == null) {
            this.dXrmkklc8 = new int[4];
            this.RG6kpfv3v = new int[4];
        }
        int[] iArr = this.dXrmkklc8;
        int[] iArr2 = this.RG6kpfv3v;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z17 = this.CBQ5d1kRq;
        boolean z18 = this.Eeka1udhb;
        boolean z19 = mode3 == 1073741824;
        boolean z20 = true;
        int i68 = 0;
        float f9 = 0.0f;
        int i69 = 0;
        int i70 = 0;
        int i71 = 0;
        int i72 = 0;
        int i73 = 0;
        boolean z21 = false;
        boolean z22 = false;
        while (i70 < virtualChildCount2) {
            View childAt6 = getChildAt(i70);
            if (childAt6 == null) {
                this.ilHKhw3Yw += 0;
                i17 = i68;
                i16 = i69;
            } else {
                i17 = i68;
                i16 = i69;
                if (childAt6.getVisibility() == 8) {
                    i70 += 0;
                } else {
                    if (vPSbyrYWX(i70)) {
                        this.ilHKhw3Yw += this.sk5s77z6Q;
                    }
                    C0002RG2GI7LDp rG2GI7LDp7 = (C0002RG2GI7LDp) childAt6.getLayoutParams();
                    float f10 = ((LinearLayout.LayoutParams) rG2GI7LDp7).weight;
                    float f11 = f9 + f10;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) rG2GI7LDp7).width == 0 && f10 > 0.0f) {
                        if (z19) {
                            i25 = i70;
                            this.ilHKhw3Yw = ((LinearLayout.LayoutParams) rG2GI7LDp7).leftMargin + ((LinearLayout.LayoutParams) rG2GI7LDp7).rightMargin + this.ilHKhw3Yw;
                        } else {
                            i25 = i70;
                            int i74 = this.ilHKhw3Yw;
                            this.ilHKhw3Yw = Math.max(i74, ((LinearLayout.LayoutParams) rG2GI7LDp7).leftMargin + i74 + ((LinearLayout.LayoutParams) rG2GI7LDp7).rightMargin);
                        }
                        if (z17) {
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt6.measure(makeMeasureSpec2, makeMeasureSpec2);
                            rG2GI7LDp = rG2GI7LDp7;
                            i19 = i17;
                            i18 = i16;
                            i20 = i25;
                            z3 = z18;
                            z2 = z17;
                        } else {
                            rG2GI7LDp = rG2GI7LDp7;
                            i19 = i17;
                            i18 = i16;
                            i20 = i25;
                            i21 = 1073741824;
                            z3 = z18;
                            z2 = z17;
                            z4 = true;
                            if (mode4 == i21 && ((LinearLayout.LayoutParams) rG2GI7LDp).height == -1) {
                                z5 = true;
                                z22 = true;
                            } else {
                                z5 = false;
                            }
                            i22 = ((LinearLayout.LayoutParams) rG2GI7LDp).topMargin + ((LinearLayout.LayoutParams) rG2GI7LDp).bottomMargin;
                            int measuredHeight2 = childAt6.getMeasuredHeight() + i22;
                            i72 = View.combineMeasuredStates(i72, childAt6.getMeasuredState());
                            if (z2 || (baseline2 = childAt6.getBaseline()) == -1) {
                                i23 = i22;
                            } else {
                                int i75 = ((LinearLayout.LayoutParams) rG2GI7LDp).gravity;
                                if (i75 < 0) {
                                    i75 = this.MzoOEjc4X;
                                }
                                int i76 = (((i75 & 112) >> 4) & -2) >> 1;
                                i23 = i22;
                                iArr[i76] = Math.max(iArr[i76], baseline2);
                                iArr2[i76] = Math.max(iArr2[i76], measuredHeight2 - baseline2);
                            }
                            i73 = Math.max(i73, measuredHeight2);
                            boolean z23 = !z20 && ((LinearLayout.LayoutParams) rG2GI7LDp).height == -1;
                            if (((LinearLayout.LayoutParams) rG2GI7LDp).weight <= 0.0f) {
                                if (z5) {
                                    measuredHeight2 = i23;
                                }
                                i68 = Math.max(i19, measuredHeight2);
                            } else {
                                if (z5) {
                                    measuredHeight2 = i23;
                                }
                                i18 = Math.max(i18, measuredHeight2);
                                i68 = i19;
                            }
                            i70 = i20 + 0;
                            z21 = z4;
                            z20 = z23;
                            f9 = f11;
                            i69 = i18;
                            i70++;
                            z18 = z3;
                            z17 = z2;
                        }
                    } else {
                        if (((LinearLayout.LayoutParams) rG2GI7LDp7).width == 0) {
                            f3 = 0.0f;
                            if (f10 > 0.0f) {
                                ((LinearLayout.LayoutParams) rG2GI7LDp7).width = -2;
                                i24 = 0;
                                i19 = i17;
                                i18 = i16;
                                i20 = i70;
                                z3 = z18;
                                z2 = z17;
                                measureChildWithMargins(childAt6, i, f11 != f3 ? this.ilHKhw3Yw : 0, i2, 0);
                                if (i24 == Integer.MIN_VALUE) {
                                    rG2GI7LDp = rG2GI7LDp7;
                                    ((LinearLayout.LayoutParams) rG2GI7LDp).width = i24;
                                } else {
                                    rG2GI7LDp = rG2GI7LDp7;
                                }
                                int measuredWidth3 = childAt6.getMeasuredWidth();
                                if (!z19) {
                                    this.ilHKhw3Yw = ((LinearLayout.LayoutParams) rG2GI7LDp).leftMargin + measuredWidth3 + ((LinearLayout.LayoutParams) rG2GI7LDp).rightMargin + 0 + this.ilHKhw3Yw;
                                } else {
                                    int i77 = this.ilHKhw3Yw;
                                    this.ilHKhw3Yw = Math.max(i77, i77 + measuredWidth3 + ((LinearLayout.LayoutParams) rG2GI7LDp).leftMargin + ((LinearLayout.LayoutParams) rG2GI7LDp).rightMargin + 0);
                                }
                                if (z3) {
                                    i71 = Math.max(measuredWidth3, i71);
                                }
                            }
                        } else {
                            f3 = 0.0f;
                        }
                        i24 = Integer.MIN_VALUE;
                        i19 = i17;
                        i18 = i16;
                        i20 = i70;
                        z3 = z18;
                        z2 = z17;
                        measureChildWithMargins(childAt6, i, f11 != f3 ? this.ilHKhw3Yw : 0, i2, 0);
                        if (i24 == Integer.MIN_VALUE) {
                        }
                        int measuredWidth32 = childAt6.getMeasuredWidth();
                        if (!z19) {
                        }
                        if (z3) {
                        }
                    }
                    z4 = z21;
                    i21 = 1073741824;
                    if (mode4 == i21) {
                    }
                    z5 = false;
                    i22 = ((LinearLayout.LayoutParams) rG2GI7LDp).topMargin + ((LinearLayout.LayoutParams) rG2GI7LDp).bottomMargin;
                    int measuredHeight22 = childAt6.getMeasuredHeight() + i22;
                    i72 = View.combineMeasuredStates(i72, childAt6.getMeasuredState());
                    if (z2) {
                    }
                    i23 = i22;
                    i73 = Math.max(i73, measuredHeight22);
                    if (!z20) {
                    }
                    if (((LinearLayout.LayoutParams) rG2GI7LDp).weight <= 0.0f) {
                    }
                    i70 = i20 + 0;
                    z21 = z4;
                    z20 = z23;
                    f9 = f11;
                    i69 = i18;
                    i70++;
                    z18 = z3;
                    z17 = z2;
                }
            }
            z2 = z17;
            i68 = i17;
            i69 = i16;
            z3 = z18;
            i70++;
            z18 = z3;
            z17 = z2;
        }
        int i78 = i69;
        if (this.ilHKhw3Yw > 0 && vPSbyrYWX(virtualChildCount2)) {
            this.ilHKhw3Yw += this.sk5s77z6Q;
        }
        if (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c2 = 3;
            if (iArr[3] == -1) {
                i3 = i72;
                if (z18 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                    int i79 = 0;
                    this.ilHKhw3Yw = 0;
                    i15 = 0;
                    while (i15 < virtualChildCount2) {
                        View childAt7 = getChildAt(i15);
                        if (childAt7 == null) {
                            this.ilHKhw3Yw += i79;
                        } else if (childAt7.getVisibility() == 8) {
                            i15 += 0;
                        } else {
                            C0002RG2GI7LDp rG2GI7LDp8 = (C0002RG2GI7LDp) childAt7.getLayoutParams();
                            if (z19) {
                                this.ilHKhw3Yw = ((LinearLayout.LayoutParams) rG2GI7LDp8).leftMargin + i71 + ((LinearLayout.LayoutParams) rG2GI7LDp8).rightMargin + 0 + this.ilHKhw3Yw;
                            } else {
                                int i80 = this.ilHKhw3Yw;
                                this.ilHKhw3Yw = Math.max(i80, i80 + i71 + ((LinearLayout.LayoutParams) rG2GI7LDp8).leftMargin + ((LinearLayout.LayoutParams) rG2GI7LDp8).rightMargin + 0);
                            }
                        }
                        i15++;
                        i79 = 0;
                    }
                }
                int paddingRight = getPaddingRight() + getPaddingLeft() + this.ilHKhw3Yw;
                this.ilHKhw3Yw = paddingRight;
                int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, 0);
                i4 = (16777215 & resolveSizeAndState2) - this.ilHKhw3Yw;
                if (!z21 || (i4 != 0 && f9 > 0.0f)) {
                    f = this.qVUwofr5s;
                    if (f > 0.0f) {
                        f9 = f;
                    }
                    iArr[3] = -1;
                    iArr[2] = -1;
                    iArr[1] = -1;
                    iArr[0] = -1;
                    iArr2[3] = -1;
                    iArr2[2] = -1;
                    iArr2[1] = -1;
                    iArr2[0] = -1;
                    this.ilHKhw3Yw = 0;
                    int i81 = i4;
                    i6 = i3;
                    int i82 = -1;
                    i9 = 0;
                    while (i9 < virtualChildCount2) {
                        View childAt8 = getChildAt(i9);
                        if (childAt8 == null || childAt8.getVisibility() == 8) {
                            i11 = virtualChildCount2;
                            i10 = i81;
                        } else {
                            C0002RG2GI7LDp rG2GI7LDp9 = (C0002RG2GI7LDp) childAt8.getLayoutParams();
                            float f12 = ((LinearLayout.LayoutParams) rG2GI7LDp9).weight;
                            if (f12 > 0.0f) {
                                i11 = virtualChildCount2;
                                int i83 = (int) ((((float) i81) * f12) / f9);
                                f9 -= f12;
                                i12 = i81 - i83;
                                int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) rG2GI7LDp9).topMargin + ((LinearLayout.LayoutParams) rG2GI7LDp9).bottomMargin, ((LinearLayout.LayoutParams) rG2GI7LDp9).height);
                                if (((LinearLayout.LayoutParams) rG2GI7LDp9).width == 0 && mode3 == 1073741824) {
                                    if (i83 > 0) {
                                        i14 = i83;
                                        childAt8.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), childMeasureSpec2);
                                        i6 = View.combineMeasuredStates(i6, childAt8.getMeasuredState() & -16777216);
                                    }
                                    i14 = 0;
                                    childAt8.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), childMeasureSpec2);
                                    i6 = View.combineMeasuredStates(i6, childAt8.getMeasuredState() & -16777216);
                                } else {
                                    i14 = childAt8.getMeasuredWidth() + i83;
                                }
                            } else {
                                i12 = i81;
                                i11 = virtualChildCount2;
                            }
                            if (z19) {
                                f2 = f9;
                                this.ilHKhw3Yw = childAt8.getMeasuredWidth() + ((LinearLayout.LayoutParams) rG2GI7LDp9).leftMargin + ((LinearLayout.LayoutParams) rG2GI7LDp9).rightMargin + 0 + this.ilHKhw3Yw;
                                i10 = i12;
                            } else {
                                f2 = f9;
                                int i84 = this.ilHKhw3Yw;
                                i10 = i12;
                                this.ilHKhw3Yw = Math.max(i84, childAt8.getMeasuredWidth() + i84 + ((LinearLayout.LayoutParams) rG2GI7LDp9).leftMargin + ((LinearLayout.LayoutParams) rG2GI7LDp9).rightMargin + 0);
                            }
                            boolean z24 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) rG2GI7LDp9).height == -1;
                            int i85 = ((LinearLayout.LayoutParams) rG2GI7LDp9).topMargin + ((LinearLayout.LayoutParams) rG2GI7LDp9).bottomMargin;
                            int measuredHeight3 = childAt8.getMeasuredHeight() + i85;
                            i82 = Math.max(i82, measuredHeight3);
                            if (!z24) {
                                i85 = measuredHeight3;
                            }
                            i78 = Math.max(i78, i85);
                            if (z20) {
                                i13 = -1;
                                if (((LinearLayout.LayoutParams) rG2GI7LDp9).height == -1) {
                                    z = true;
                                    if (!z17 && (baseline = childAt8.getBaseline()) != i13) {
                                        int i86 = ((LinearLayout.LayoutParams) rG2GI7LDp9).gravity;
                                        if (i86 < 0) {
                                            i86 = this.MzoOEjc4X;
                                        }
                                        int i87 = (((i86 & 112) >> 4) & -2) >> 1;
                                        iArr[i87] = Math.max(iArr[i87], baseline);
                                        iArr2[i87] = Math.max(iArr2[i87], measuredHeight3 - baseline);
                                    }
                                    z20 = z;
                                    f9 = f2;
                                }
                            } else {
                                i13 = -1;
                            }
                            z = false;
                            if (!z17) {
                            }
                            z20 = z;
                            f9 = f2;
                        }
                        i9++;
                        virtualChildCount2 = i11;
                        i81 = i10;
                    }
                    i7 = i2;
                    i5 = virtualChildCount2;
                    this.ilHKhw3Yw = getPaddingRight() + getPaddingLeft() + this.ilHKhw3Yw;
                    if (iArr[1] != -1 && iArr[0] == -1 && iArr[2] == -1) {
                        c = 3;
                        if (iArr[3] == -1) {
                            i73 = i82;
                        }
                    } else {
                        c = 3;
                    }
                    i8 = 0;
                    i73 = Math.max(i82, Math.max(iArr2[c], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
                    if (!z20 || mode4 == 1073741824) {
                        i78 = i73;
                    }
                    setMeasuredDimension((-16777216 & i6) | resolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i78, getSuggestedMinimumHeight()), i7, i6 << 16));
                    if (z22) {
                        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                        for (int i88 = i8; i88 < i5; i88++) {
                            View childAt9 = getChildAt(i88);
                            if (childAt9.getVisibility() != 8) {
                                C0002RG2GI7LDp rG2GI7LDp10 = (C0002RG2GI7LDp) childAt9.getLayoutParams();
                                if (((LinearLayout.LayoutParams) rG2GI7LDp10).height == -1) {
                                    int i89 = ((LinearLayout.LayoutParams) rG2GI7LDp10).width;
                                    ((LinearLayout.LayoutParams) rG2GI7LDp10).width = childAt9.getMeasuredWidth();
                                    measureChildWithMargins(childAt9, i, 0, makeMeasureSpec3, 0);
                                    ((LinearLayout.LayoutParams) rG2GI7LDp10).width = i89;
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                i78 = Math.max(i78, i68);
                if (z18 && mode3 != 1073741824) {
                    for (int i90 = 0; i90 < virtualChildCount2; i90++) {
                        View childAt10 = getChildAt(i90);
                        if (!(childAt10 == null || childAt10.getVisibility() == 8 || ((LinearLayout.LayoutParams) ((C0002RG2GI7LDp) childAt10.getLayoutParams())).weight <= 0.0f)) {
                            childAt10.measure(View.MeasureSpec.makeMeasureSpec(i71, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt10.getMeasuredHeight(), 1073741824));
                        }
                    }
                }
                i7 = i2;
                i5 = virtualChildCount2;
                i6 = i3;
                i8 = 0;
                if (!z20) {
                }
                i78 = i73;
                setMeasuredDimension((-16777216 & i6) | resolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i78, getSuggestedMinimumHeight()), i7, i6 << 16));
                if (z22) {
                }
            }
        } else {
            c2 = 3;
        }
        i3 = i72;
        i73 = Math.max(i73, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        if (z18) {
            int i792 = 0;
            this.ilHKhw3Yw = 0;
            i15 = 0;
            while (i15 < virtualChildCount2) {
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.ilHKhw3Yw;
        this.ilHKhw3Yw = paddingRight2;
        int resolveSizeAndState22 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i, 0);
        i4 = (16777215 & resolveSizeAndState22) - this.ilHKhw3Yw;
        if (!z21) {
        }
        f = this.qVUwofr5s;
        if (f > 0.0f) {
        }
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        this.ilHKhw3Yw = 0;
        int i812 = i4;
        i6 = i3;
        int i822 = -1;
        i9 = 0;
        while (i9 < virtualChildCount2) {
        }
        i7 = i2;
        i5 = virtualChildCount2;
        this.ilHKhw3Yw = getPaddingRight() + getPaddingLeft() + this.ilHKhw3Yw;
        if (iArr[1] != -1) {
        }
        c = 3;
        i8 = 0;
        i73 = Math.max(i822, Math.max(iArr2[c], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        if (!z20) {
        }
        i78 = i73;
        setMeasuredDimension((-16777216 & i6) | resolveSizeAndState22, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + i78, getSuggestedMinimumHeight()), i7, i6 << 16));
        if (z22) {
        }
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
