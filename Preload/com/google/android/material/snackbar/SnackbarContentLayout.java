package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.feravolt.preload.R;
import con.IuQbWntsc;
import con.RBJDIwG1D;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {
    public int Bhmn1KIah;
    public TextView CBQ5d1kRq;
    public int PSTqBLTET;
    public Button kmSgne1rO;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Button getActionView() {
        return this.kmSgne1rO;
    }

    public TextView getMessageView() {
        return this.CBQ5d1kRq;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.CBQ5d1kRq = (TextView) findViewById(R.id.snackbar_text);
        this.kmSgne1rO = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (q3BipwRCk(1, r0, r0 - r1) != false) goto L_0x0062;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
        if (q3BipwRCk(0, r0, r0) != false) goto L_0x0062;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
        r3 = true;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (this.Bhmn1KIah > 0 && getMeasuredWidth() > (i3 = this.Bhmn1KIah)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            super.onMeasure(i, i2);
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        boolean z = false;
        boolean z2 = this.CBQ5d1kRq.getLayout().getLineCount() > 1;
        if (!z2 || this.PSTqBLTET <= 0 || this.kmSgne1rO.getMeasuredWidth() <= this.PSTqBLTET) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
    }

    public final boolean q3BipwRCk(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.CBQ5d1kRq.getPaddingTop() == i2 && this.CBQ5d1kRq.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.CBQ5d1kRq;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        if (RBJDIwG1D.GPLPRo6go(textView)) {
            RBJDIwG1D.vPSbyrYWX(textView, RBJDIwG1D.iiGwOFFnr(textView), i2, RBJDIwG1D.kCA6Zs9sL(textView), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public void setMaxInlineActionWidth(int i) {
        this.PSTqBLTET = i;
    }

    public void setMaxWidth(int i) {
        this.Bhmn1KIah = i;
    }
}
