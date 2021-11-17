package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.feravolt.preload.R;
import con.KYuHUB7GA;
import con.RisoK3egD;
import con.ba8VhBGaI;
import con.qs7k2SwdW;
/* loaded from: classes.dex */
public class MaterialTextView extends qs7k2SwdW {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(ba8VhBGaI.q3BipwRCk(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = getContext();
        boolean z = true;
        if (KYuHUB7GA.dIocxURUo(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = RisoK3egD.dXrmkklc8;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int iiGwOFFnr = iiGwOFFnr(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (!(iiGwOFFnr == -1 ? false : z)) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    kCA6Zs9sL(theme, resourceId);
                }
            }
        }
    }

    public static int iiGwOFFnr(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            int i3 = iArr[i2];
            TypedValue typedValue = new TypedValue();
            if (!typedArray.getValue(i3, typedValue) || typedValue.type != 2) {
                i = typedArray.getDimensionPixelSize(i3, -1);
            } else {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                i = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
            }
        }
        return i;
    }

    public final void kCA6Zs9sL(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, RisoK3egD.Eeka1udhb);
        int iiGwOFFnr = iiGwOFFnr(getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (iiGwOFFnr >= 0) {
            setLineHeight(iiGwOFFnr);
        }
    }

    @Override // con.qs7k2SwdW, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (KYuHUB7GA.dIocxURUo(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            kCA6Zs9sL(context.getTheme(), i);
        }
    }
}
