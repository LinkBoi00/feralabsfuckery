package con;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
/* loaded from: classes.dex */
public final class eut9mmvYo {
    public static final eut9mmvYo q3BipwRCk = new eut9mmvYo();

    public final void GPLPRo6go(ViewStructure viewStructure, AutofillId autofillId, int i) {
        viewStructure.setAutofillId(autofillId, i);
    }

    public final boolean J4Ux7ym32(AutofillValue autofillValue) {
        return autofillValue.isDate();
    }

    public final void Puu3Rhg4F(ViewStructure viewStructure, int i) {
        viewStructure.setAutofillType(i);
    }

    public final boolean dIocxURUo(AutofillValue autofillValue) {
        return autofillValue.isText();
    }

    public final void iiGwOFFnr(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public final boolean kCA6Zs9sL(AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }

    public final AutofillId q3BipwRCk(ViewStructure viewStructure) {
        return viewStructure.getAutofillId();
    }

    public final boolean tGV7Q6urW(AutofillValue autofillValue) {
        return autofillValue.isList();
    }

    public final CharSequence yWvV4ePLl(AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }
}
