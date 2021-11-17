package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import con.CVu4W89kR;
import con.EV4wl6Jg6;
import con.Jg0aTLb6g;
import con.TeoeEf1aF;
import con.qya5U7BN8;
import java.util.Objects;
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue Bhmn1KIah;
    public TypedValue CBQ5d1kRq;
    public RG2GI7LDp Eeka1udhb;
    public TypedValue MzoOEjc4X;
    public TypedValue PSTqBLTET;
    public TypedValue ilHKhw3Yw;
    public TypedValue kmSgne1rO;
    public final Rect qVUwofr5s = new Rect();

    /* loaded from: classes.dex */
    public interface RG2GI7LDp {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.MzoOEjc4X == null) {
            this.MzoOEjc4X = new TypedValue();
        }
        return this.MzoOEjc4X;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.ilHKhw3Yw == null) {
            this.ilHKhw3Yw = new TypedValue();
        }
        return this.ilHKhw3Yw;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.Bhmn1KIah == null) {
            this.Bhmn1KIah = new TypedValue();
        }
        return this.Bhmn1KIah;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.PSTqBLTET == null) {
            this.PSTqBLTET = new TypedValue();
        }
        return this.PSTqBLTET;
    }

    public TypedValue getMinWidthMajor() {
        if (this.CBQ5d1kRq == null) {
            this.CBQ5d1kRq = new TypedValue();
        }
        return this.CBQ5d1kRq;
    }

    public TypedValue getMinWidthMinor() {
        if (this.kmSgne1rO == null) {
            this.kmSgne1rO = new TypedValue();
        }
        return this.kmSgne1rO;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        RG2GI7LDp rG2GI7LDp = this.Eeka1udhb;
        if (rG2GI7LDp != null) {
            Objects.requireNonNull(rG2GI7LDp);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void onDetachedFromWindow() {
        TeoeEf1aF teoeEf1aF;
        super.onDetachedFromWindow();
        RG2GI7LDp rG2GI7LDp = this.Eeka1udhb;
        if (rG2GI7LDp != null) {
            Jg0aTLb6g jg0aTLb6g = ((EV4wl6Jg6) rG2GI7LDp).kmSgne1rO;
            CVu4W89kR cVu4W89kR = jg0aTLb6g.ixWaw2akD;
            if (cVu4W89kR != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) cVu4W89kR;
                actionBarOverlayLayout.Bhmn1KIah();
                ActionMenuView actionMenuView = ((qya5U7BN8) actionBarOverlayLayout.MzoOEjc4X).q3BipwRCk.CBQ5d1kRq;
                if (!(actionMenuView == null || (teoeEf1aF = actionMenuView.qFBXIgpia) == null)) {
                    teoeEf1aF.J4Ux7ym32();
                }
            }
            if (jg0aTLb6g.iMyQMM6Qj != null) {
                jg0aTLb6g.MzoOEjc4X.getDecorView().removeCallbacks(jg0aTLb6g.cAwN510t2);
                if (jg0aTLb6g.iMyQMM6Qj.isShowing()) {
                    try {
                        jg0aTLb6g.iMyQMM6Qj.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                jg0aTLb6g.iMyQMM6Qj = null;
            }
            jg0aTLb6g.WaUP0CF08();
            androidx.appcompat.view.menu.RG2GI7LDp rG2GI7LDp2 = jg0aTLb6g.IytU16YUK(0).Puu3Rhg4F;
            if (rG2GI7LDp2 != null) {
                rG2GI7LDp2.tGV7Q6urW(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onMeasure(int i, int i2) {
        boolean z;
        int measuredWidth;
        TypedValue typedValue;
        int i3;
        int i4;
        float fraction;
        int i5;
        int i6;
        float fraction2;
        int i7;
        int i8;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z2 = true;
        boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z3 ? this.PSTqBLTET : this.Bhmn1KIah;
            if (!(typedValue2 == null || (i7 = typedValue2.type) == 0)) {
                if (i7 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i7 == 6) {
                    int i9 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction((float) i9, (float) i9);
                } else {
                    i8 = 0;
                    if (i8 > 0) {
                        Rect rect = this.qVUwofr5s;
                        i = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z3 ? this.MzoOEjc4X : this.ilHKhw3Yw;
                            if (!(typedValue3 == null || (i5 = typedValue3.type) == 0)) {
                                if (i5 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i5 == 6) {
                                    int i10 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction((float) i10, (float) i10);
                                } else {
                                    i6 = 0;
                                    if (i6 > 0) {
                                        Rect rect2 = this.qVUwofr5s;
                                        i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect2.top + rect2.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                                    }
                                }
                                i6 = (int) fraction2;
                                if (i6 > 0) {
                                }
                            }
                        }
                        super.onMeasure(i, i2);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z && mode == Integer.MIN_VALUE) {
                            typedValue = !z3 ? this.kmSgne1rO : this.CBQ5d1kRq;
                            if (!(typedValue == null || (i3 = typedValue.type) == 0)) {
                                if (i3 != 5) {
                                    fraction = typedValue.getDimension(displayMetrics);
                                } else if (i3 == 6) {
                                    int i11 = displayMetrics.widthPixels;
                                    fraction = typedValue.getFraction((float) i11, (float) i11);
                                } else {
                                    i4 = 0;
                                    if (i4 > 0) {
                                        Rect rect3 = this.qVUwofr5s;
                                        i4 -= rect3.left + rect3.right;
                                    }
                                    if (measuredWidth < i4) {
                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                                        if (z2) {
                                            super.onMeasure(makeMeasureSpec, i2);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                i4 = (int) fraction;
                                if (i4 > 0) {
                                }
                                if (measuredWidth < i4) {
                                }
                            }
                        }
                        z2 = false;
                        if (z2) {
                        }
                    }
                }
                i8 = (int) fraction3;
                if (i8 > 0) {
                }
            }
        }
        z = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        super.onMeasure(i, i2);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z) {
            if (!z3) {
            }
            if (typedValue == null) {
                if (i3 != 5) {
                }
                i4 = (int) fraction;
                if (i4 > 0) {
                }
                if (measuredWidth < i4) {
                }
            }
        }
        z2 = false;
        if (z2) {
        }
    }

    public void setAttachListener(RG2GI7LDp rG2GI7LDp) {
        this.Eeka1udhb = rG2GI7LDp;
    }
}
