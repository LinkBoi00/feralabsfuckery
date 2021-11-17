package con;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
/* loaded from: classes.dex */
public final class RCIIpuNjf extends AutofillManager.AutofillCallback {
    public static final RCIIpuNjf q3BipwRCk = new RCIIpuNjf();

    public final void J4Ux7ym32(kVHvlpsMs kvhvlpsms) {
        kvhvlpsms.tGV7Q6urW.unregisterCallback(this);
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public void onAutofillEvent(View view, int i, int i2) {
        super.onAutofillEvent(view, i, i2);
        Log.d("Autofill Status", i2 != 1 ? i2 != 2 ? i2 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }

    public final void q3BipwRCk(kVHvlpsMs kvhvlpsms) {
        kvhvlpsms.tGV7Q6urW.registerCallback(this);
    }
}
