package con;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.RG2GI7LDp;
/* loaded from: classes.dex */
public class gaJ1HYyt4 {
    public boolean q3BipwRCk = false;
    public int J4Ux7ym32 = 0;
    public int tGV7Q6urW = 0;
    public float dIocxURUo = 1.0f;
    public float kCA6Zs9sL = Float.NaN;

    public void q3BipwRCk(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, EssXmp5ks.GPLPRo6go);
        this.q3BipwRCk = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.dIocxURUo = obtainStyledAttributes.getFloat(index, this.dIocxURUo);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.J4Ux7ym32);
                this.J4Ux7ym32 = i2;
                int[] iArr = RG2GI7LDp.dIocxURUo;
                this.J4Ux7ym32 = RG2GI7LDp.dIocxURUo[i2];
            } else if (index == 4) {
                this.tGV7Q6urW = obtainStyledAttributes.getInt(index, this.tGV7Q6urW);
            } else if (index == 3) {
                this.kCA6Zs9sL = obtainStyledAttributes.getFloat(index, this.kCA6Zs9sL);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
