package con;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
/* loaded from: classes.dex */
public class yHOWpR3Sc extends AutoCompleteTextView {
    public static final int[] Bhmn1KIah = {16843126};
    public final SfQ6fqrlg CBQ5d1kRq;
    public final mZIyARhC1 kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yHOWpR3Sc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GV6EZRqr3.q3BipwRCk(context);
        hfLGvn7bI.q3BipwRCk(this, getContext());
        j6XJY7rz4 mUqPm6GBh = j6XJY7rz4.mUqPm6GBh(getContext(), attributeSet, Bhmn1KIah, i, 0);
        if (mUqPm6GBh.CpG0imbht(0)) {
            setDropDownBackgroundDrawable(mUqPm6GBh.dXrmkklc8(0));
        }
        mUqPm6GBh.NyWTwPF6V();
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        WAflFGuGp.oon79WMrY(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C8A1BseZU.q3BipwRCk(getContext(), i));
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

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        mZIyARhC1 mziyarhc1 = this.kmSgne1rO;
        if (mziyarhc1 != null) {
            mziyarhc1.iiGwOFFnr(context, i);
        }
    }
}
