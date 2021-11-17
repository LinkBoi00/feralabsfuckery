package con;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
/* loaded from: classes.dex */
public final class z7LwLZVxA extends CharacterStyle {
    public final float J4Ux7ym32;
    public final float dIocxURUo;
    public final int q3BipwRCk;
    public final float tGV7Q6urW;

    public z7LwLZVxA(int i, float f, float f2, float f3) {
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = f;
        this.tGV7Q6urW = f2;
        this.dIocxURUo = f3;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.dIocxURUo, this.J4Ux7ym32, this.tGV7Q6urW, this.q3BipwRCk);
    }
}
