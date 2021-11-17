package con;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;
/* loaded from: classes.dex */
public class jGHCddKf6 extends ToggleButton {
    public final SfQ6fqrlg CBQ5d1kRq;
    public final mZIyARhC1 kmSgne1rO;

    public jGHCddKf6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        hfLGvn7bI.q3BipwRCk(this, getContext());
        SfQ6fqrlg sfQ6fqrlg = new SfQ6fqrlg(this);
        this.CBQ5d1kRq = sfQ6fqrlg;
        sfQ6fqrlg.iiGwOFFnr(attributeSet, 16842827);
        mZIyARhC1 mziyarhc1 = new mZIyARhC1(this);
        this.kmSgne1rO = mziyarhc1;
        mziyarhc1.kCA6Zs9sL(attributeSet, 16842827);
    }

    @Override // android.widget.ToggleButton, android.widget.TextView, android.widget.CompoundButton, android.view.View
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

    @Override // android.widget.ToggleButton, android.view.View
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
}
