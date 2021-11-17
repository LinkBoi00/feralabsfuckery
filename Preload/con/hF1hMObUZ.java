package con;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.feravolt.preload.R;
/* loaded from: classes.dex */
public abstract class hF1hMObUZ {
    public static final int[] q3BipwRCk = {R.attr.colorPrimary};
    public static final int[] J4Ux7ym32 = {R.attr.colorPrimaryVariant};

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
        if (r0.getResourceId(0, -1) != -1) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static void J4Ux7ym32(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RisoK3egD.IytU16YUK, i, i2);
        boolean z = false;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
        } else if (iArr2 != null && iArr2.length != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i3 : iArr2) {
                if (obtainStyledAttributes2.getResourceId(i3, -1) == -1) {
                    obtainStyledAttributes2.recycle();
                    break;
                }
            }
            obtainStyledAttributes2.recycle();
            z = true;
            obtainStyledAttributes.recycle();
            if (!z) {
                throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
            }
        }
    }

    public static TypedArray dIocxURUo(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        q3BipwRCk(context, attributeSet, i, i2);
        J4Ux7ym32(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static void q3BipwRCk(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RisoK3egD.IytU16YUK, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                tGV7Q6urW(context, J4Ux7ym32, "Theme.MaterialComponents");
            }
        }
        tGV7Q6urW(context, q3BipwRCk, "Theme.AppCompat");
    }

    public static void tGV7Q6urW(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= iArr.length) {
                obtainStyledAttributes.recycle();
                z = true;
                break;
            } else if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            throw new IllegalArgumentException(M5g57XBLr.q3BipwRCk("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }
}
