package con;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class zhWsuDChl {

    /* loaded from: classes.dex */
    public static class RG2GI7LDp extends ViewGroup.MarginLayoutParams {
        public int q3BipwRCk;

        public RG2GI7LDp(int i, int i2) {
            super(i, i2);
            this.q3BipwRCk = 0;
            this.q3BipwRCk = 8388627;
        }

        public RG2GI7LDp(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.q3BipwRCk = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZolH67hOx.J4Ux7ym32);
            this.q3BipwRCk = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public RG2GI7LDp(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.q3BipwRCk = 0;
        }

        public RG2GI7LDp(RG2GI7LDp rG2GI7LDp) {
            super((ViewGroup.MarginLayoutParams) rG2GI7LDp);
            this.q3BipwRCk = 0;
            this.q3BipwRCk = rG2GI7LDp.q3BipwRCk;
        }
    }

    public abstract Context J4Ux7ym32();

    public abstract void dIocxURUo(CharSequence charSequence);

    public abstract void q3BipwRCk(boolean z);

    public abstract void tGV7Q6urW(boolean z);
}
