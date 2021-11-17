package con;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.feravolt.preload.R;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class AtjDcRag6 extends FrameLayout {
    public static final View.OnTouchListener RG6kpfv3v = new MkKFEVD5e();
    public int Bhmn1KIah;
    public ZHApfhaDn CBQ5d1kRq;
    public ColorStateList Eeka1udhb;
    public final float MzoOEjc4X;
    public final float PSTqBLTET;
    public PorterDuff.Mode dXrmkklc8;
    public final int ilHKhw3Yw;
    public icyg42ouk kmSgne1rO;
    public final int qVUwofr5s;

    public AtjDcRag6(Context context, AttributeSet attributeSet) {
        super(ba8VhBGaI.q3BipwRCk(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, RisoK3egD.i8XZMQc6Z);
        if (obtainStyledAttributes.hasValue(6)) {
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            mJLaJepZo.Eeka1udhb(this, (float) obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.Bhmn1KIah = obtainStyledAttributes.getInt(2, 0);
        this.PSTqBLTET = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(anXlDk6fV.Bhmn1KIah(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(uyyOxpvGH.J4Ux7ym32(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.MzoOEjc4X = obtainStyledAttributes.getFloat(1, 1.0f);
        this.ilHKhw3Yw = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.qVUwofr5s = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(RG6kpfv3v);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(D3DEikrvb.ilHKhw3Yw(D3DEikrvb.CBQ5d1kRq(this, R.attr.colorSurface), D3DEikrvb.CBQ5d1kRq(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha()));
            ColorStateList colorStateList = this.Eeka1udhb;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            WeakHashMap weakHashMap2 = IuQbWntsc.q3BipwRCk;
            VCCyeOu6I.ilHKhw3Yw(this, gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.MzoOEjc4X;
    }

    public int getAnimationMode() {
        return this.Bhmn1KIah;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.PSTqBLTET;
    }

    public int getMaxInlineActionWidth() {
        return this.qVUwofr5s;
    }

    public int getMaxWidth() {
        return this.ilHKhw3Yw;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        icyg42ouk icyg42ouk = this.kmSgne1rO;
        if (icyg42ouk != null) {
            icyg42ouk.onViewAttachedToWindow(this);
        }
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        cyVJjwbRF.tGV7Q6urW(this);
    }

    @Override // android.view.View, android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        icyg42ouk icyg42ouk = this.kmSgne1rO;
        if (icyg42ouk != null) {
            icyg42ouk.onViewDetachedFromWindow(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View, android.view.ViewGroup
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ZHApfhaDn zHApfhaDn = this.CBQ5d1kRq;
        if (zHApfhaDn != null) {
            zHApfhaDn.q3BipwRCk(this, i, i2, i3, i4);
        }
    }

    public void setAnimationMode(int i) {
        this.Bhmn1KIah = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.Eeka1udhb == null)) {
            drawable = drawable.mutate();
            drawable.setTintList(this.Eeka1udhb);
            drawable.setTintMode(this.dXrmkklc8);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.Eeka1udhb = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.dXrmkklc8);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.dXrmkklc8 = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public void setOnAttachStateChangeListener(icyg42ouk icyg42ouk) {
        this.kmSgne1rO = icyg42ouk;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : RG6kpfv3v);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(ZHApfhaDn zHApfhaDn) {
        this.CBQ5d1kRq = zHApfhaDn;
    }
}
