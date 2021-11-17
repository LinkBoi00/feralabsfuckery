package con;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import com.feravolt.preload.R;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes.dex */
public class eV9inabdD extends CZ8R7FG4y {
    public final TextWatcher kCA6Zs9sL = new MhqibLiIM(this);
    public final TextInputLayout.dNif5KqqH iiGwOFFnr = new y5oh9NJPA(this);
    public final TextInputLayout.WfopS3efW GPLPRo6go = new MNvNWu3oH(this);

    public eV9inabdD(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
    }

    public static boolean dIocxURUo(eV9inabdD ev9inabdd) {
        EditText editText = ev9inabdd.q3BipwRCk.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    @Override // con.CZ8R7FG4y
    public void q3BipwRCk() {
        TextInputLayout textInputLayout = this.q3BipwRCk;
        int i = this.dIocxURUo;
        if (i == 0) {
            i = R.drawable.design_password_eye;
        }
        textInputLayout.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.q3BipwRCk;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.password_toggle_content_description));
        this.q3BipwRCk.setEndIconOnClickListener(new Q3GvMwgzv(this));
        this.q3BipwRCk.q3BipwRCk(this.iiGwOFFnr);
        this.q3BipwRCk.YmNRDyka4.add(this.GPLPRo6go);
        EditText editText = this.q3BipwRCk.getEditText();
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
