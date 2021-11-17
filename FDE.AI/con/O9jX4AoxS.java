package con;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* loaded from: classes.dex */
public final class O9jX4AoxS extends ClickableSpan {
    public final int Bhmn1KIah;
    public final int CBQ5d1kRq;
    public final IqwHQ6O2l kmSgne1rO;

    public O9jX4AoxS(int i, IqwHQ6O2l iqwHQ6O2l, int i2) {
        this.CBQ5d1kRq = i;
        this.kmSgne1rO = iqwHQ6O2l;
        this.Bhmn1KIah = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.CBQ5d1kRq);
        IqwHQ6O2l iqwHQ6O2l = this.kmSgne1rO;
        iqwHQ6O2l.q3BipwRCk.performAction(this.Bhmn1KIah, bundle);
    }
}
