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
    public static void J4Ux7ym32(android.content.Context r4, android.util.AttributeSet r5, int[] r6, int r7, int r8, int... r9) {
        /*
            int[] r0 = con.RisoK3egD.IytU16YUK
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0, r7, r8)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L_0x0012
            r0.recycle()
            return
        L_0x0012:
            r1 = -1
            if (r9 == 0) goto L_0x0034
            int r3 = r9.length
            if (r3 != 0) goto L_0x0019
            goto L_0x0034
        L_0x0019:
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r6, r7, r8)
            int r5 = r9.length
            r6 = r2
        L_0x001f:
            if (r6 >= r5) goto L_0x0030
            r7 = r9[r6]
            int r7 = r4.getResourceId(r7, r1)
            if (r7 != r1) goto L_0x002d
            r4.recycle()
            goto L_0x003b
        L_0x002d:
            int r6 = r6 + 1
            goto L_0x001f
        L_0x0030:
            r4.recycle()
            goto L_0x003a
        L_0x0034:
            int r4 = r0.getResourceId(r2, r1)
            if (r4 == r1) goto L_0x003b
        L_0x003a:
            r2 = 1
        L_0x003b:
            r0.recycle()
            if (r2 == 0) goto L_0x0041
            return
        L_0x0041:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: con.hF1hMObUZ.J4Ux7ym32(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
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
