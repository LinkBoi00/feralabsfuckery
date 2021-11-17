package con;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
/* loaded from: classes.dex */
public class LYtU53WQj extends Button implements c3lBLBWYj {
    public final SfQ6fqrlg CBQ5d1kRq;
    public final mZIyARhC1 kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LYtU53WQj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GV6EZRqr3.q3BipwRCk(context);
        hfLGvn7bI.q3BipwRCk(this, getContext());
        SfQ6fqrlg sfQ6fqrlg = new SfQ6fqrlg(this);
        this.CBQ5d1kRq = sfQ6fqrlg;
        sfQ6fqrlg.iiGwOFFnr(attributeSet, i);
        mZIyARhC1 mziyarhc1 = new mZIyARhC1(this);
        this.kmSgne1rO = mziyarhc1;
        mziyarhc1.kCA6Zs9sL(attributeSet, i);
        mziyarhc1.J4Ux7ym32();
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mZIyARhC1 mziyarhc1 = this.kmSgne1rO;
        if (mziyarhc1 != null && !c3lBLBWYj.q3BipwRCk) {
            mziyarhc1.yWvV4ePLl.q3BipwRCk();
        }
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(D3DEikrvb.iMyQMM6Qj(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        mZIyARhC1 mziyarhc1 = this.kmSgne1rO;
        if (mziyarhc1 != null) {
            mziyarhc1.q3BipwRCk.setAllCaps(z);
        }
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
}
