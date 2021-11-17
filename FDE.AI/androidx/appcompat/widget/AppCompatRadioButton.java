package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;
import com.feravolt.preload.R;
import con.C8A1BseZU;
import con.GV6EZRqr3;
import con.OpEYJpxVi;
import con.SfQ6fqrlg;
import con.hfLGvn7bI;
import con.mZIyARhC1;
/* loaded from: classes.dex */
public class AppCompatRadioButton extends RadioButton {
    public final mZIyARhC1 Bhmn1KIah;
    public final OpEYJpxVi CBQ5d1kRq;
    public final SfQ6fqrlg kmSgne1rO;

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.radioButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GV6EZRqr3.q3BipwRCk(context);
        hfLGvn7bI.q3BipwRCk(this, getContext());
        OpEYJpxVi opEYJpxVi = new OpEYJpxVi(this);
        this.CBQ5d1kRq = opEYJpxVi;
        opEYJpxVi.J4Ux7ym32(attributeSet, i);
        SfQ6fqrlg sfQ6fqrlg = new SfQ6fqrlg(this);
        this.kmSgne1rO = sfQ6fqrlg;
        sfQ6fqrlg.iiGwOFFnr(attributeSet, i);
        mZIyARhC1 mziyarhc1 = new mZIyARhC1(this);
        this.Bhmn1KIah = mziyarhc1;
        mziyarhc1.kCA6Zs9sL(attributeSet, i);
    }

    @Override // android.widget.TextView, android.widget.CompoundButton, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        SfQ6fqrlg sfQ6fqrlg = this.kmSgne1rO;
        if (sfQ6fqrlg != null) {
            sfQ6fqrlg.q3BipwRCk();
        }
        mZIyARhC1 mziyarhc1 = this.Bhmn1KIah;
        if (mziyarhc1 != null) {
            mziyarhc1.J4Ux7ym32();
        }
    }

    @Override // android.widget.TextView, android.widget.CompoundButton
    public int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft();
    }

    public ColorStateList getSupportBackgroundTintList() {
        SfQ6fqrlg sfQ6fqrlg = this.kmSgne1rO;
        if (sfQ6fqrlg != null) {
            return sfQ6fqrlg.dIocxURUo();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        SfQ6fqrlg sfQ6fqrlg = this.kmSgne1rO;
        if (sfQ6fqrlg != null) {
            return sfQ6fqrlg.kCA6Zs9sL();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        OpEYJpxVi opEYJpxVi = this.CBQ5d1kRq;
        if (opEYJpxVi != null) {
            return opEYJpxVi.J4Ux7ym32;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        OpEYJpxVi opEYJpxVi = this.CBQ5d1kRq;
        if (opEYJpxVi != null) {
            return opEYJpxVi.tGV7Q6urW;
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        SfQ6fqrlg sfQ6fqrlg = this.kmSgne1rO;
        if (sfQ6fqrlg != null) {
            sfQ6fqrlg.GPLPRo6go();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        SfQ6fqrlg sfQ6fqrlg = this.kmSgne1rO;
        if (sfQ6fqrlg != null) {
            sfQ6fqrlg.Puu3Rhg4F(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(C8A1BseZU.q3BipwRCk(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        OpEYJpxVi opEYJpxVi = this.CBQ5d1kRq;
        if (opEYJpxVi == null) {
            return;
        }
        if (opEYJpxVi.iiGwOFFnr) {
            opEYJpxVi.iiGwOFFnr = false;
            return;
        }
        opEYJpxVi.iiGwOFFnr = true;
        opEYJpxVi.q3BipwRCk();
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        SfQ6fqrlg sfQ6fqrlg = this.kmSgne1rO;
        if (sfQ6fqrlg != null) {
            sfQ6fqrlg.oon79WMrY(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        SfQ6fqrlg sfQ6fqrlg = this.kmSgne1rO;
        if (sfQ6fqrlg != null) {
            sfQ6fqrlg.vPSbyrYWX(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        OpEYJpxVi opEYJpxVi = this.CBQ5d1kRq;
        if (opEYJpxVi != null) {
            opEYJpxVi.J4Ux7ym32 = colorStateList;
            opEYJpxVi.dIocxURUo = true;
            opEYJpxVi.q3BipwRCk();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        OpEYJpxVi opEYJpxVi = this.CBQ5d1kRq;
        if (opEYJpxVi != null) {
            opEYJpxVi.tGV7Q6urW = mode;
            opEYJpxVi.kCA6Zs9sL = true;
            opEYJpxVi.q3BipwRCk();
        }
    }
}
