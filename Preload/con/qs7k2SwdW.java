package con;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public class qs7k2SwdW extends TextView implements c3lBLBWYj {
    public final PlegqbMSA Bhmn1KIah;
    public final SfQ6fqrlg CBQ5d1kRq;
    public Future MzoOEjc4X;
    public boolean PSTqBLTET;
    public final mZIyARhC1 kmSgne1rO;

    public qs7k2SwdW(Context context) {
        this(context, null, 16842884);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qs7k2SwdW(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GV6EZRqr3.q3BipwRCk(context);
        this.PSTqBLTET = false;
        hfLGvn7bI.q3BipwRCk(this, getContext());
        SfQ6fqrlg sfQ6fqrlg = new SfQ6fqrlg(this);
        this.CBQ5d1kRq = sfQ6fqrlg;
        sfQ6fqrlg.iiGwOFFnr(attributeSet, i);
        mZIyARhC1 mziyarhc1 = new mZIyARhC1(this);
        this.kmSgne1rO = mziyarhc1;
        mziyarhc1.kCA6Zs9sL(attributeSet, i);
        mziyarhc1.J4Ux7ym32();
        this.Bhmn1KIah = new PlegqbMSA(this);
    }

    public final void dIocxURUo() {
        Future future = this.MzoOEjc4X;
        if (future != null) {
            try {
                this.MzoOEjc4X = null;
                K6PL0z3I0.q3BipwRCk(future.get());
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                D3DEikrvb.PSTqBLTET(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            sfQ6fqrlg.q3BipwRCk();
        }
        mZIyARhC1 mziyarhc1 = this.kmSgne1rO;
        if (mziyarhc1 != null) {
            mziyarhc1.J4Ux7ym32();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (c3lBLBWYj.q3BipwRCk) {
            return super.getAutoSizeMaxTextSize();
        }
        mZIyARhC1 mziyarhc1 = this.kmSgne1rO;
        if (mziyarhc1 != null) {
            return Math.round(mziyarhc1.yWvV4ePLl.kCA6Zs9sL);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (c3lBLBWYj.q3BipwRCk) {
            return super.getAutoSizeMinTextSize();
        }
        mZIyARhC1 mziyarhc1 = this.kmSgne1rO;
        if (mziyarhc1 != null) {
            return Math.round(mziyarhc1.yWvV4ePLl.dIocxURUo);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (c3lBLBWYj.q3BipwRCk) {
            return super.getAutoSizeStepGranularity();
        }
        mZIyARhC1 mziyarhc1 = this.kmSgne1rO;
        if (mziyarhc1 != null) {
            return Math.round(mziyarhc1.yWvV4ePLl.tGV7Q6urW);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (c3lBLBWYj.q3BipwRCk) {
            return super.getAutoSizeTextAvailableSizes();
        }
        mZIyARhC1 mziyarhc1 = this.kmSgne1rO;
        return mziyarhc1 != null ? mziyarhc1.yWvV4ePLl.iiGwOFFnr : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (c3lBLBWYj.q3BipwRCk) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        mZIyARhC1 mziyarhc1 = this.kmSgne1rO;
        if (mziyarhc1 != null) {
            return mziyarhc1.yWvV4ePLl.q3BipwRCk;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            return sfQ6fqrlg.dIocxURUo();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            return sfQ6fqrlg.kCA6Zs9sL();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        lNNWSSNDS lnnwssnds = this.kmSgne1rO.Puu3Rhg4F;
        if (lnnwssnds != null) {
            return (ColorStateList) lnnwssnds.q3BipwRCk;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        lNNWSSNDS lnnwssnds = this.kmSgne1rO.Puu3Rhg4F;
        if (lnnwssnds != null) {
            return (PorterDuff.Mode) lnnwssnds.J4Ux7ym32;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        dIocxURUo();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        PlegqbMSA plegqbMSA;
        return (Build.VERSION.SDK_INT >= 28 || (plegqbMSA = this.Bhmn1KIah) == null) ? super.getTextClassifier() : plegqbMSA.iiGwOFFnr();
    }

    public alvSTFvn7 getTextMetricsParamsCompat() {
        return D3DEikrvb.PSTqBLTET(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        Objects.requireNonNull(this.kmSgne1rO);
        if (Build.VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            mF8HEm3Oj.J4Ux7ym32(editorInfo, getText());
        }
        WAflFGuGp.oon79WMrY(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mZIyARhC1 mziyarhc1 = this.kmSgne1rO;
        if (mziyarhc1 != null && !c3lBLBWYj.q3BipwRCk) {
            mziyarhc1.yWvV4ePLl.q3BipwRCk();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        dIocxURUo();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        mZIyARhC1 mziyarhc1 = this.kmSgne1rO;
        if (mziyarhc1 != null && !c3lBLBWYj.q3BipwRCk && mziyarhc1.dIocxURUo()) {
            this.kmSgne1rO.yWvV4ePLl.q3BipwRCk();
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (c3lBLBWYj.q3BipwRCk) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        mZIyARhC1 mziyarhc1 = this.kmSgne1rO;
        if (mziyarhc1 != null) {
            mziyarhc1.GPLPRo6go(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (c3lBLBWYj.q3BipwRCk) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        mZIyARhC1 mziyarhc1 = this.kmSgne1rO;
        if (mziyarhc1 != null) {
            mziyarhc1.Puu3Rhg4F(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (c3lBLBWYj.q3BipwRCk) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        mZIyARhC1 mziyarhc1 = this.kmSgne1rO;
        if (mziyarhc1 != null) {
            mziyarhc1.yWvV4ePLl(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            sfQ6fqrlg.GPLPRo6go();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            sfQ6fqrlg.Puu3Rhg4F(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        mZIyARhC1 mziyarhc1 = this.kmSgne1rO;
        if (mziyarhc1 != null) {
            mziyarhc1.J4Ux7ym32();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        mZIyARhC1 mziyarhc1 = this.kmSgne1rO;
        if (mziyarhc1 != null) {
            mziyarhc1.J4Ux7ym32();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable q3BipwRCk = i != 0 ? C8A1BseZU.q3BipwRCk(context, i) : null;
        Drawable q3BipwRCk2 = i2 != 0 ? C8A1BseZU.q3BipwRCk(context, i2) : null;
        Drawable q3BipwRCk3 = i3 != 0 ? C8A1BseZU.q3BipwRCk(context, i3) : null;
        if (i4 != 0) {
            drawable = C8A1BseZU.q3BipwRCk(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(q3BipwRCk, q3BipwRCk2, q3BipwRCk3, drawable);
        mZIyARhC1 mziyarhc1 = this.kmSgne1rO;
        if (mziyarhc1 != null) {
            mziyarhc1.J4Ux7ym32();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable q3BipwRCk = i != 0 ? C8A1BseZU.q3BipwRCk(context, i) : null;
        Drawable q3BipwRCk2 = i2 != 0 ? C8A1BseZU.q3BipwRCk(context, i2) : null;
        Drawable q3BipwRCk3 = i3 != 0 ? C8A1BseZU.q3BipwRCk(context, i3) : null;
        if (i4 != 0) {
            drawable = C8A1BseZU.q3BipwRCk(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(q3BipwRCk, q3BipwRCk2, q3BipwRCk3, drawable);
        mZIyARhC1 mziyarhc1 = this.kmSgne1rO;
        if (mziyarhc1 != null) {
            mziyarhc1.J4Ux7ym32();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(D3DEikrvb.iMyQMM6Qj(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            D3DEikrvb.dXrmkklc8(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            D3DEikrvb.RG6kpfv3v(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        D3DEikrvb.ixWaw2akD(this, i);
    }

    public void setPrecomputedText(x5TJC4uKu x5tjc4uku) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        D3DEikrvb.PSTqBLTET(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            sfQ6fqrlg.oon79WMrY(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            sfQ6fqrlg.vPSbyrYWX(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.kmSgne1rO.oon79WMrY(colorStateList);
        this.kmSgne1rO.J4Ux7ym32();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.kmSgne1rO.vPSbyrYWX(mode);
        this.kmSgne1rO.J4Ux7ym32();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        mZIyARhC1 mziyarhc1 = this.kmSgne1rO;
        if (mziyarhc1 != null) {
            mziyarhc1.iiGwOFFnr(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        PlegqbMSA plegqbMSA;
        if (Build.VERSION.SDK_INT >= 28 || (plegqbMSA = this.Bhmn1KIah) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            plegqbMSA.kmSgne1rO = textClassifier;
        }
    }

    public void setTextFuture(Future<x5TJC4uKu> future) {
        this.MzoOEjc4X = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(alvSTFvn7 alvstfvn7) {
        TextDirectionHeuristic textDirectionHeuristic = alvstfvn7.J4Ux7ym32;
        int i = 1;
        if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(alvstfvn7.q3BipwRCk);
        setBreakStrategy(alvstfvn7.tGV7Q6urW);
        setHyphenationFrequency(alvstfvn7.dIocxURUo);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = c3lBLBWYj.q3BipwRCk;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        mZIyARhC1 mziyarhc1 = this.kmSgne1rO;
        if (mziyarhc1 != null && !z && !mziyarhc1.dIocxURUo()) {
            mziyarhc1.yWvV4ePLl.iiGwOFFnr(i, f);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        if (!this.PSTqBLTET) {
            Typeface typeface2 = null;
            if (typeface != null && i > 0) {
                Context context = getContext();
                LVtOVALR4 lVtOVALR4 = ieVIpzqcX.q3BipwRCk;
                if (context != null) {
                    typeface2 = Typeface.create(typeface, i);
                } else {
                    throw new IllegalArgumentException("Context cannot be null");
                }
            }
            this.PSTqBLTET = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i);
            } finally {
                this.PSTqBLTET = false;
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        mZIyARhC1 mziyarhc1 = this.kmSgne1rO;
        if (mziyarhc1 != null) {
            mziyarhc1.J4Ux7ym32();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        mZIyARhC1 mziyarhc1 = this.kmSgne1rO;
        if (mziyarhc1 != null) {
            mziyarhc1.J4Ux7ym32();
        }
    }
}
