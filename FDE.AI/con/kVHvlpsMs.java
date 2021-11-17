package con;

import android.view.View;
import android.view.autofill.AutofillManager;
/* loaded from: classes.dex */
public final class kVHvlpsMs implements dK8imq773 {
    public final mS4pA2jQ7 J4Ux7ym32;
    public final View q3BipwRCk;
    public final AutofillManager tGV7Q6urW;

    public kVHvlpsMs(View view, mS4pA2jQ7 ms4pa2jq7) {
        this.q3BipwRCk = view;
        this.J4Ux7ym32 = ms4pa2jq7;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.tGV7Q6urW = autofillManager;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.".toString());
    }
}
