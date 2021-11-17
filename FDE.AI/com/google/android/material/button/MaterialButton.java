package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.feravolt.preload.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import con.C8A1BseZU;
import con.EyOPxwF4a;
import con.FSVv1nFjp;
import con.FXBYEZrfX;
import con.IuQbWntsc;
import con.LYtU53WQj;
import con.RBJDIwG1D;
import con.RisoK3egD;
import con.anXlDk6fV;
import con.ba8VhBGaI;
import con.dOSsQaJVg;
import con.dnBSj5uJN;
import con.hF1hMObUZ;
import con.rUYFcNk3O;
import con.rbhQaQiIi;
import con.s7MlVynBG;
import con.uyyOxpvGH;
import con.xT3tobMV0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class MaterialButton extends LYtU53WQj implements Checkable, rUYFcNk3O {
    public final FSVv1nFjp Bhmn1KIah;
    public Drawable Eeka1udhb;
    public mhl5lIdbQ MzoOEjc4X;
    public int RG6kpfv3v;
    public int dXrmkklc8;
    public int dfpT1j18n;
    public PorterDuff.Mode ilHKhw3Yw;
    public int ixWaw2akD;
    public ColorStateList qVUwofr5s;
    public int sk5s77z6Q;
    public static final int[] iMyQMM6Qj = {16842911};
    public static final int[] cAwN510t2 = {16842912};
    public final LinkedHashSet PSTqBLTET = new LinkedHashSet();
    public boolean WaUP0CF08 = false;
    public boolean i8XZMQc6Z = false;

    /* loaded from: classes.dex */
    public interface RG2GI7LDp {
    }

    /* loaded from: classes.dex */
    public static class aXI58Y1kr extends s7MlVynBG {
        public static final Parcelable.Creator<aXI58Y1kr> CREATOR = new EyOPxwF4a(1);
        public boolean Bhmn1KIah;

        public aXI58Y1kr(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                aXI58Y1kr.class.getClassLoader();
            }
            this.Bhmn1KIah = parcel.readInt() != 1 ? false : true;
        }

        public aXI58Y1kr(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // con.s7MlVynBG, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.CBQ5d1kRq, i);
            parcel.writeInt(this.Bhmn1KIah ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public interface mhl5lIdbQ {
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(ba8VhBGaI.q3BipwRCk(context, attributeSet, R.attr.materialButtonStyle, 2131821516), attributeSet, R.attr.materialButtonStyle);
        boolean z = false;
        Context context2 = getContext();
        TypedArray dIocxURUo = hF1hMObUZ.dIocxURUo(context2, attributeSet, RisoK3egD.CBQ5d1kRq, R.attr.materialButtonStyle, 2131821516, new int[0]);
        this.sk5s77z6Q = dIocxURUo.getDimensionPixelSize(12, 0);
        this.ilHKhw3Yw = uyyOxpvGH.J4Ux7ym32(dIocxURUo.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.qVUwofr5s = anXlDk6fV.Bhmn1KIah(getContext(), dIocxURUo, 14);
        this.Eeka1udhb = anXlDk6fV.MzoOEjc4X(getContext(), dIocxURUo, 10);
        this.dfpT1j18n = dIocxURUo.getInteger(11, 1);
        this.dXrmkklc8 = dIocxURUo.getDimensionPixelSize(13, 0);
        FSVv1nFjp fSVv1nFjp = new FSVv1nFjp(this, xT3tobMV0.J4Ux7ym32(context2, attributeSet, R.attr.materialButtonStyle, 2131821516).q3BipwRCk());
        this.Bhmn1KIah = fSVv1nFjp;
        fSVv1nFjp.tGV7Q6urW = dIocxURUo.getDimensionPixelOffset(1, 0);
        fSVv1nFjp.dIocxURUo = dIocxURUo.getDimensionPixelOffset(2, 0);
        fSVv1nFjp.kCA6Zs9sL = dIocxURUo.getDimensionPixelOffset(3, 0);
        fSVv1nFjp.iiGwOFFnr = dIocxURUo.getDimensionPixelOffset(4, 0);
        if (dIocxURUo.hasValue(8)) {
            int dimensionPixelSize = dIocxURUo.getDimensionPixelSize(8, -1);
            fSVv1nFjp.GPLPRo6go = dimensionPixelSize;
            fSVv1nFjp.kCA6Zs9sL(fSVv1nFjp.J4Ux7ym32.kCA6Zs9sL((float) dimensionPixelSize));
            fSVv1nFjp.MzoOEjc4X = true;
        }
        fSVv1nFjp.Puu3Rhg4F = dIocxURUo.getDimensionPixelSize(20, 0);
        fSVv1nFjp.yWvV4ePLl = uyyOxpvGH.J4Ux7ym32(dIocxURUo.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        fSVv1nFjp.oon79WMrY = anXlDk6fV.Bhmn1KIah(getContext(), dIocxURUo, 6);
        fSVv1nFjp.vPSbyrYWX = anXlDk6fV.Bhmn1KIah(getContext(), dIocxURUo, 19);
        fSVv1nFjp.CBQ5d1kRq = anXlDk6fV.Bhmn1KIah(getContext(), dIocxURUo, 16);
        fSVv1nFjp.ilHKhw3Yw = dIocxURUo.getBoolean(5, false);
        fSVv1nFjp.Eeka1udhb = dIocxURUo.getDimensionPixelSize(9, 0);
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        int iiGwOFFnr = RBJDIwG1D.iiGwOFFnr(this);
        int paddingTop = getPaddingTop();
        int kCA6Zs9sL = RBJDIwG1D.kCA6Zs9sL(this);
        int paddingBottom = getPaddingBottom();
        if (dIocxURUo.hasValue(0)) {
            fSVv1nFjp.PSTqBLTET = true;
            setSupportBackgroundTintList(fSVv1nFjp.oon79WMrY);
            setSupportBackgroundTintMode(fSVv1nFjp.yWvV4ePLl);
        } else {
            fSVv1nFjp.GPLPRo6go();
        }
        RBJDIwG1D.vPSbyrYWX(this, iiGwOFFnr + fSVv1nFjp.tGV7Q6urW, paddingTop + fSVv1nFjp.kCA6Zs9sL, kCA6Zs9sL + fSVv1nFjp.dIocxURUo, paddingBottom + fSVv1nFjp.iiGwOFFnr);
        dIocxURUo.recycle();
        setCompoundDrawablePadding(this.sk5s77z6Q);
        GPLPRo6go(this.Eeka1udhb != null ? true : z);
    }

    private String getA11yClassName() {
        return (q3BipwRCk() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    public final void GPLPRo6go(boolean z) {
        Drawable drawable = this.Eeka1udhb;
        boolean z2 = true;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.Eeka1udhb = mutate;
            mutate.setTintList(this.qVUwofr5s);
            PorterDuff.Mode mode = this.ilHKhw3Yw;
            if (mode != null) {
                this.Eeka1udhb.setTintMode(mode);
            }
            int i = this.dXrmkklc8;
            if (i == 0) {
                i = this.Eeka1udhb.getIntrinsicWidth();
            }
            int i2 = this.dXrmkklc8;
            if (i2 == 0) {
                i2 = this.Eeka1udhb.getIntrinsicHeight();
            }
            Drawable drawable2 = this.Eeka1udhb;
            int i3 = this.RG6kpfv3v;
            int i4 = this.ixWaw2akD;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.Eeka1udhb.setVisible(true, z);
        }
        if (z) {
            iiGwOFFnr();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!tGV7Q6urW() || drawable3 == this.Eeka1udhb) && ((!J4Ux7ym32() || drawable5 == this.Eeka1udhb) && (!dIocxURUo() || drawable4 == this.Eeka1udhb))) {
            z2 = false;
        }
        if (z2) {
            iiGwOFFnr();
        }
    }

    public final boolean J4Ux7ym32() {
        int i = this.dfpT1j18n;
        return i == 3 || i == 4;
    }

    public final void Puu3Rhg4F(int i, int i2) {
        if (this.Eeka1udhb != null && getLayout() != null) {
            if (tGV7Q6urW() || J4Ux7ym32()) {
                this.ixWaw2akD = 0;
                int i3 = this.dfpT1j18n;
                boolean z = true;
                if (i3 == 1 || i3 == 3) {
                    this.RG6kpfv3v = 0;
                    GPLPRo6go(false);
                    return;
                }
                int i4 = this.dXrmkklc8;
                if (i4 == 0) {
                    i4 = this.Eeka1udhb.getIntrinsicWidth();
                }
                int textWidth = i - getTextWidth();
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                int kCA6Zs9sL = ((((textWidth - RBJDIwG1D.kCA6Zs9sL(this)) - i4) - this.sk5s77z6Q) - RBJDIwG1D.iiGwOFFnr(this)) / 2;
                boolean z2 = RBJDIwG1D.dIocxURUo(this) == 1;
                if (this.dfpT1j18n != 4) {
                    z = false;
                }
                if (z2 != z) {
                    kCA6Zs9sL = -kCA6Zs9sL;
                }
                if (this.RG6kpfv3v != kCA6Zs9sL) {
                    this.RG6kpfv3v = kCA6Zs9sL;
                    GPLPRo6go(false);
                }
            } else if (dIocxURUo()) {
                this.RG6kpfv3v = 0;
                if (this.dfpT1j18n == 16) {
                    this.ixWaw2akD = 0;
                    GPLPRo6go(false);
                    return;
                }
                int i5 = this.dXrmkklc8;
                if (i5 == 0) {
                    i5 = this.Eeka1udhb.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - i5) - this.sk5s77z6Q) - getPaddingBottom()) / 2;
                if (this.ixWaw2akD != textHeight) {
                    this.ixWaw2akD = textHeight;
                    GPLPRo6go(false);
                }
            }
        }
    }

    public final boolean dIocxURUo() {
        int i = this.dfpT1j18n;
        return i == 16 || i == 32;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (kCA6Zs9sL()) {
            return this.Bhmn1KIah.GPLPRo6go;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.Eeka1udhb;
    }

    public int getIconGravity() {
        return this.dfpT1j18n;
    }

    public int getIconPadding() {
        return this.sk5s77z6Q;
    }

    public int getIconSize() {
        return this.dXrmkklc8;
    }

    public ColorStateList getIconTint() {
        return this.qVUwofr5s;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.ilHKhw3Yw;
    }

    public int getInsetBottom() {
        return this.Bhmn1KIah.iiGwOFFnr;
    }

    public int getInsetTop() {
        return this.Bhmn1KIah.kCA6Zs9sL;
    }

    public ColorStateList getRippleColor() {
        if (kCA6Zs9sL()) {
            return this.Bhmn1KIah.CBQ5d1kRq;
        }
        return null;
    }

    public xT3tobMV0 getShapeAppearanceModel() {
        if (kCA6Zs9sL()) {
            return this.Bhmn1KIah.J4Ux7ym32;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (kCA6Zs9sL()) {
            return this.Bhmn1KIah.vPSbyrYWX;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (kCA6Zs9sL()) {
            return this.Bhmn1KIah.Puu3Rhg4F;
        }
        return 0;
    }

    @Override // con.LYtU53WQj
    public ColorStateList getSupportBackgroundTintList() {
        if (kCA6Zs9sL()) {
            return this.Bhmn1KIah.oon79WMrY;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // con.LYtU53WQj
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (kCA6Zs9sL()) {
            return this.Bhmn1KIah.yWvV4ePLl;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final void iiGwOFFnr() {
        if (tGV7Q6urW()) {
            setCompoundDrawablesRelative(this.Eeka1udhb, null, null, null);
        } else if (J4Ux7ym32()) {
            setCompoundDrawablesRelative(null, null, this.Eeka1udhb, null);
        } else if (dIocxURUo()) {
            setCompoundDrawablesRelative(null, this.Eeka1udhb, null, null);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.WaUP0CF08;
    }

    public final boolean kCA6Zs9sL() {
        FSVv1nFjp fSVv1nFjp = this.Bhmn1KIah;
        return fSVv1nFjp != null && !fSVv1nFjp.PSTqBLTET;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (kCA6Zs9sL()) {
            dnBSj5uJN.cAwN510t2(this, this.Bhmn1KIah.J4Ux7ym32());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (q3BipwRCk()) {
            Button.mergeDrawableStates(onCreateDrawableState, iMyQMM6Qj);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, cAwN510t2);
        }
        return onCreateDrawableState;
    }

    @Override // con.LYtU53WQj, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // con.LYtU53WQj, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(q3BipwRCk());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // con.LYtU53WQj, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof aXI58Y1kr)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        aXI58Y1kr axi58y1kr = (aXI58Y1kr) parcelable;
        super.onRestoreInstanceState(axi58y1kr.CBQ5d1kRq);
        setChecked(axi58y1kr.Bhmn1KIah);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        aXI58Y1kr axi58y1kr = new aXI58Y1kr(super.onSaveInstanceState());
        axi58y1kr.Bhmn1KIah = this.WaUP0CF08;
        return axi58y1kr;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Puu3Rhg4F(i, i2);
    }

    @Override // con.LYtU53WQj, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        Puu3Rhg4F(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public boolean q3BipwRCk() {
        FSVv1nFjp fSVv1nFjp = this.Bhmn1KIah;
        return fSVv1nFjp != null && fSVv1nFjp.ilHKhw3Yw;
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.Eeka1udhb != null) {
            if (this.Eeka1udhb.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (kCA6Zs9sL()) {
            FSVv1nFjp fSVv1nFjp = this.Bhmn1KIah;
            if (fSVv1nFjp.J4Ux7ym32() != null) {
                fSVv1nFjp.J4Ux7ym32().setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // con.LYtU53WQj, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (kCA6Zs9sL()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                FSVv1nFjp fSVv1nFjp = this.Bhmn1KIah;
                fSVv1nFjp.PSTqBLTET = true;
                fSVv1nFjp.q3BipwRCk.setSupportBackgroundTintList(fSVv1nFjp.oon79WMrY);
                fSVv1nFjp.q3BipwRCk.setSupportBackgroundTintMode(fSVv1nFjp.yWvV4ePLl);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // con.LYtU53WQj, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? C8A1BseZU.q3BipwRCk(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (kCA6Zs9sL()) {
            this.Bhmn1KIah.ilHKhw3Yw = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (q3BipwRCk() && isEnabled() && this.WaUP0CF08 != z) {
            this.WaUP0CF08 = z;
            refreshDrawableState();
            if (!this.i8XZMQc6Z) {
                this.i8XZMQc6Z = true;
                Iterator it = this.PSTqBLTET.iterator();
                while (it.hasNext()) {
                    boolean z2 = this.WaUP0CF08;
                    MaterialButtonToggleGroup.aXI58Y1kr axi58y1kr = (MaterialButtonToggleGroup.aXI58Y1kr) ((RG2GI7LDp) it.next());
                    MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
                    if (!materialButtonToggleGroup.qVUwofr5s) {
                        if (materialButtonToggleGroup.Eeka1udhb) {
                            materialButtonToggleGroup.RG6kpfv3v = z2 ? getId() : -1;
                        }
                        if (MaterialButtonToggleGroup.this.iiGwOFFnr(getId(), z2)) {
                            MaterialButtonToggleGroup.this.J4Ux7ym32(getId(), isChecked());
                        }
                        MaterialButtonToggleGroup.this.invalidate();
                    }
                }
                this.i8XZMQc6Z = false;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (kCA6Zs9sL()) {
            FSVv1nFjp fSVv1nFjp = this.Bhmn1KIah;
            if (!fSVv1nFjp.MzoOEjc4X || fSVv1nFjp.GPLPRo6go != i) {
                fSVv1nFjp.GPLPRo6go = i;
                fSVv1nFjp.MzoOEjc4X = true;
                fSVv1nFjp.kCA6Zs9sL(fSVv1nFjp.J4Ux7ym32.kCA6Zs9sL((float) i));
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (kCA6Zs9sL()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (kCA6Zs9sL()) {
            dOSsQaJVg J4Ux7ym32 = this.Bhmn1KIah.J4Ux7ym32();
            rbhQaQiIi rbhqaqiii = J4Ux7ym32.CBQ5d1kRq;
            if (rbhqaqiii.PSTqBLTET != f) {
                rbhqaqiii.PSTqBLTET = f;
                J4Ux7ym32.sk5s77z6Q();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.Eeka1udhb != drawable) {
            this.Eeka1udhb = drawable;
            GPLPRo6go(true);
            Puu3Rhg4F(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.dfpT1j18n != i) {
            this.dfpT1j18n = i;
            Puu3Rhg4F(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.sk5s77z6Q != i) {
            this.sk5s77z6Q = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? C8A1BseZU.q3BipwRCk(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.dXrmkklc8 != i) {
            this.dXrmkklc8 = i;
            GPLPRo6go(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.qVUwofr5s != colorStateList) {
            this.qVUwofr5s = colorStateList;
            GPLPRo6go(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.ilHKhw3Yw != mode) {
            this.ilHKhw3Yw = mode;
            GPLPRo6go(false);
        }
    }

    public void setIconTintResource(int i) {
        Context context = getContext();
        ThreadLocal threadLocal = C8A1BseZU.q3BipwRCk;
        setIconTint(context.getColorStateList(i));
    }

    public void setInsetBottom(int i) {
        FSVv1nFjp fSVv1nFjp = this.Bhmn1KIah;
        fSVv1nFjp.iiGwOFFnr(fSVv1nFjp.kCA6Zs9sL, i);
    }

    public void setInsetTop(int i) {
        FSVv1nFjp fSVv1nFjp = this.Bhmn1KIah;
        fSVv1nFjp.iiGwOFFnr(i, fSVv1nFjp.iiGwOFFnr);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(mhl5lIdbQ mhl5lidbq) {
        this.MzoOEjc4X = mhl5lidbq;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        mhl5lIdbQ mhl5lidbq = this.MzoOEjc4X;
        if (mhl5lidbq != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (kCA6Zs9sL()) {
            FSVv1nFjp fSVv1nFjp = this.Bhmn1KIah;
            if (fSVv1nFjp.CBQ5d1kRq != colorStateList) {
                fSVv1nFjp.CBQ5d1kRq = colorStateList;
                if (fSVv1nFjp.q3BipwRCk.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) fSVv1nFjp.q3BipwRCk.getBackground()).setColor(FXBYEZrfX.q3BipwRCk(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (kCA6Zs9sL()) {
            Context context = getContext();
            ThreadLocal threadLocal = C8A1BseZU.q3BipwRCk;
            setRippleColor(context.getColorStateList(i));
        }
    }

    @Override // con.rUYFcNk3O
    public void setShapeAppearanceModel(xT3tobMV0 xt3tobmv0) {
        if (kCA6Zs9sL()) {
            this.Bhmn1KIah.kCA6Zs9sL(xt3tobmv0);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (kCA6Zs9sL()) {
            FSVv1nFjp fSVv1nFjp = this.Bhmn1KIah;
            fSVv1nFjp.Bhmn1KIah = z;
            fSVv1nFjp.Puu3Rhg4F();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (kCA6Zs9sL()) {
            FSVv1nFjp fSVv1nFjp = this.Bhmn1KIah;
            if (fSVv1nFjp.vPSbyrYWX != colorStateList) {
                fSVv1nFjp.vPSbyrYWX = colorStateList;
                fSVv1nFjp.Puu3Rhg4F();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (kCA6Zs9sL()) {
            Context context = getContext();
            ThreadLocal threadLocal = C8A1BseZU.q3BipwRCk;
            setStrokeColor(context.getColorStateList(i));
        }
    }

    public void setStrokeWidth(int i) {
        if (kCA6Zs9sL()) {
            FSVv1nFjp fSVv1nFjp = this.Bhmn1KIah;
            if (fSVv1nFjp.Puu3Rhg4F != i) {
                fSVv1nFjp.Puu3Rhg4F = i;
                fSVv1nFjp.Puu3Rhg4F();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (kCA6Zs9sL()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // con.LYtU53WQj
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (kCA6Zs9sL()) {
            FSVv1nFjp fSVv1nFjp = this.Bhmn1KIah;
            if (fSVv1nFjp.oon79WMrY != colorStateList) {
                fSVv1nFjp.oon79WMrY = colorStateList;
                if (fSVv1nFjp.J4Ux7ym32() != null) {
                    fSVv1nFjp.J4Ux7ym32().setTintList(fSVv1nFjp.oon79WMrY);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // con.LYtU53WQj
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (kCA6Zs9sL()) {
            FSVv1nFjp fSVv1nFjp = this.Bhmn1KIah;
            if (fSVv1nFjp.yWvV4ePLl != mode) {
                fSVv1nFjp.yWvV4ePLl = mode;
                if (fSVv1nFjp.J4Ux7ym32() != null && fSVv1nFjp.yWvV4ePLl != null) {
                    fSVv1nFjp.J4Ux7ym32().setTintMode(fSVv1nFjp.yWvV4ePLl);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public final boolean tGV7Q6urW() {
        int i = this.dfpT1j18n;
        return i == 1 || i == 2;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.WaUP0CF08);
    }
}
