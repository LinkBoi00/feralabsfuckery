package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import con.ZolH67hOx;
import con.qs7k2SwdW;
/* loaded from: classes.dex */
public class DialogTitle extends qs7k2SwdW {
    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842884);
    }

    @Override // con.qs7k2SwdW, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int lineCount;
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
            setSingleLine(false);
            setMaxLines(2);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, ZolH67hOx.sk5s77z6Q, 16842817, 16973892);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                setTextSize(0, (float) dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            super.onMeasure(i, i2);
        }
    }
}
