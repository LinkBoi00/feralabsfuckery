package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.feravolt.preload.R;
import con.IuQbWntsc;
import con.RisoK3egD;
import con.VCCyeOu6I;
import con.Zgs44gQcc;
import con.anXlDk6fV;
import con.ba8VhBGaI;
import con.dOSsQaJVg;
import con.dnBSj5uJN;
import con.hF1hMObUZ;
import con.mJLaJepZo;
import con.rbhQaQiIi;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public Integer IzM1cD9ly;
    public boolean OpLJtmvFM;
    public boolean n4UIOvAko;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(ba8VhBGaI.q3BipwRCk(context, attributeSet, R.attr.toolbarStyle, 2131821615), attributeSet, R.attr.toolbarStyle);
        Context context2 = getContext();
        int i = 0;
        TypedArray dIocxURUo = hF1hMObUZ.dIocxURUo(context2, attributeSet, RisoK3egD.RG6kpfv3v, R.attr.toolbarStyle, 2131821615, new int[0]);
        if (dIocxURUo.hasValue(0)) {
            setNavigationIconTint(dIocxURUo.getColor(0, -1));
        }
        this.n4UIOvAko = dIocxURUo.getBoolean(2, false);
        this.OpLJtmvFM = dIocxURUo.getBoolean(1, false);
        dIocxURUo.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            dOSsQaJVg dossqajvg = new dOSsQaJVg();
            dossqajvg.MzoOEjc4X(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : i));
            dossqajvg.CBQ5d1kRq.J4Ux7ym32 = new Zgs44gQcc(context2);
            dossqajvg.sk5s77z6Q();
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            dossqajvg.PSTqBLTET(mJLaJepZo.yWvV4ePLl(this));
            VCCyeOu6I.ilHKhw3Yw(this, dossqajvg);
        }
    }

    public Integer getNavigationIconTint() {
        return this.IzM1cD9ly;
    }

    public final void ixWaw2akD(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof dOSsQaJVg) {
            dnBSj5uJN.cAwN510t2(this, (dOSsQaJVg) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.n4UIOvAko || this.OpLJtmvFM) {
            TextView ilHKhw3Yw = anXlDk6fV.ilHKhw3Yw(this, getTitle());
            TextView ilHKhw3Yw2 = anXlDk6fV.ilHKhw3Yw(this, getSubtitle());
            if (!(ilHKhw3Yw == null && ilHKhw3Yw2 == null)) {
                int measuredWidth = getMeasuredWidth();
                int i5 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    View childAt = getChildAt(i6);
                    if (!(childAt.getVisibility() == 8 || childAt == ilHKhw3Yw || childAt == ilHKhw3Yw2)) {
                        if (childAt.getRight() < i5 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i5 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.n4UIOvAko && ilHKhw3Yw != null) {
                    ixWaw2akD(ilHKhw3Yw, pair);
                }
                if (this.OpLJtmvFM && ilHKhw3Yw2 != null) {
                    ixWaw2akD(ilHKhw3Yw2, pair);
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof dOSsQaJVg) {
            dOSsQaJVg dossqajvg = (dOSsQaJVg) background;
            rbhQaQiIi rbhqaqiii = dossqajvg.CBQ5d1kRq;
            if (rbhqaqiii.PSTqBLTET != f) {
                rbhqaqiii.PSTqBLTET = f;
                dossqajvg.sk5s77z6Q();
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (!(drawable == null || this.IzM1cD9ly == null)) {
            drawable = drawable.mutate();
            drawable.setTint(this.IzM1cD9ly.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.IzM1cD9ly = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.OpLJtmvFM != z) {
            this.OpLJtmvFM = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.n4UIOvAko != z) {
            this.n4UIOvAko = z;
            requestLayout();
        }
    }
}
