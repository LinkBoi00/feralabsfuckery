package con;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.feravolt.preload.R;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes.dex */
public class vC6Qh7mvD extends CZ8R7FG4y {
    public ValueAnimator oon79WMrY;
    public AnimatorSet yWvV4ePLl;
    public final TextWatcher kCA6Zs9sL = new kPOyr2xfh(this);
    public final View.OnFocusChangeListener iiGwOFFnr = new M7tdG3F08(this);
    public final TextInputLayout.dNif5KqqH GPLPRo6go = new y5oh9NJPA(this);
    public final TextInputLayout.WfopS3efW Puu3Rhg4F = new MNvNWu3oH(this);

    public vC6Qh7mvD(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
    }

    public static boolean dIocxURUo(vC6Qh7mvD vc6qh7mvd) {
        EditText editText = vc6qh7mvd.q3BipwRCk.getEditText();
        return editText != null && (editText.hasFocus() || vc6qh7mvd.tGV7Q6urW.hasFocus()) && editText.getText().length() > 0;
    }

    public final ValueAnimator iiGwOFFnr(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(vZAFqpduB.q3BipwRCk);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new UaOcQlKQj(this, 0));
        return ofFloat;
    }

    public final void kCA6Zs9sL(boolean z) {
        boolean z2 = this.q3BipwRCk.kmSgne1rO() == z;
        if (z && !this.yWvV4ePLl.isRunning()) {
            this.oon79WMrY.cancel();
            this.yWvV4ePLl.start();
            if (z2) {
                this.yWvV4ePLl.end();
            }
        } else if (!z) {
            this.yWvV4ePLl.cancel();
            this.oon79WMrY.start();
            if (z2) {
                this.oon79WMrY.end();
            }
        }
    }

    @Override // con.CZ8R7FG4y
    public void q3BipwRCk() {
        TextInputLayout textInputLayout = this.q3BipwRCk;
        int i = this.dIocxURUo;
        if (i == 0) {
            i = R.drawable.mtrl_ic_cancel;
        }
        textInputLayout.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.q3BipwRCk;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.q3BipwRCk.setEndIconOnClickListener(new Q3GvMwgzv(this));
        this.q3BipwRCk.q3BipwRCk(this.GPLPRo6go);
        this.q3BipwRCk.YmNRDyka4.add(this.Puu3Rhg4F);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(vZAFqpduB.dIocxURUo);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new UaOcQlKQj(this, 1));
        ValueAnimator iiGwOFFnr = iiGwOFFnr(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.yWvV4ePLl = animatorSet;
        animatorSet.playTogether(ofFloat, iiGwOFFnr);
        this.yWvV4ePLl.addListener(new TvyYuEyuG(this));
        ValueAnimator iiGwOFFnr2 = iiGwOFFnr(1.0f, 0.0f);
        this.oon79WMrY = iiGwOFFnr2;
        iiGwOFFnr2.addListener(new bWNFfjmZq(this));
    }

    @Override // con.CZ8R7FG4y
    public void tGV7Q6urW(boolean z) {
        if (this.q3BipwRCk.getSuffixText() != null) {
            kCA6Zs9sL(z);
        }
    }
}
