package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
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
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.Bhmn1KIah
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.Bhmn1KIah
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            r1 = 2131165322(0x7f07008a, float:1.7944858E38)
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            r2 = 2131165321(0x7f070089, float:1.7944856E38)
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.CBQ5d1kRq
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003e
            r2 = r4
            goto L_0x003f
        L_0x003e:
            r2 = r3
        L_0x003f:
            if (r2 == 0) goto L_0x0058
            int r5 = r7.PSTqBLTET
            if (r5 <= 0) goto L_0x0058
            android.widget.Button r5 = r7.kmSgne1rO
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.PSTqBLTET
            if (r5 <= r6) goto L_0x0058
            int r1 = r0 - r1
            boolean r0 = r7.q3BipwRCk(r4, r0, r1)
            if (r0 == 0) goto L_0x0063
            goto L_0x0062
        L_0x0058:
            if (r2 == 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r0 = r1
        L_0x005c:
            boolean r0 = r7.q3BipwRCk(r3, r0, r0)
            if (r0 == 0) goto L_0x0063
        L_0x0062:
            r3 = r4
        L_0x0063:
            if (r3 == 0) goto L_0x0068
            super.onMeasure(r8, r9)
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
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
