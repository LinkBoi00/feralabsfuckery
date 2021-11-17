package con;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes.dex */
public abstract class CZ8R7FG4y {
    public Context J4Ux7ym32;
    public final int dIocxURUo;
    public TextInputLayout q3BipwRCk;
    public CheckableImageButton tGV7Q6urW;

    public CZ8R7FG4y(TextInputLayout textInputLayout, int i) {
        this.q3BipwRCk = textInputLayout;
        this.J4Ux7ym32 = textInputLayout.getContext();
        this.tGV7Q6urW = textInputLayout.getEndIconView();
        this.dIocxURUo = i;
    }

    public boolean J4Ux7ym32(int i) {
        return true;
    }

    public abstract void q3BipwRCk();

    public void tGV7Q6urW(boolean z) {
    }
}
