package con;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
/* loaded from: classes.dex */
public final class rK8LfnpMt extends CharacterStyle {
    public final boolean J4Ux7ym32;
    public final boolean q3BipwRCk;

    public rK8LfnpMt(boolean z, boolean z2) {
        this.q3BipwRCk = z;
        this.J4Ux7ym32 = z2;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.q3BipwRCk);
        textPaint.setStrikeThruText(this.J4Ux7ym32);
    }
}
