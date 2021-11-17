package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import con.PmanMZxiM;
import con.Wk9bO57s4;
import con.nEBNqwNJt;
/* loaded from: classes.dex */
public final class DialogScrollView extends ScrollView {
    public DialogLayout CBQ5d1kRq;

    /* loaded from: classes.dex */
    public static final class RG2GI7LDp extends Wk9bO57s4 implements PmanMZxiM {
        public static final RG2GI7LDp kmSgne1rO = new RG2GI7LDp();

        public RG2GI7LDp() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
            if (r0 == false) goto L_0x0024;
         */
        @Override // con.PmanMZxiM
        /* Code decompiled incorrectly, please refer to instructions dump */
        public java.lang.Object IytU16YUK(java.lang.Object r5) {
            /*
                r4 = this;
                com.afollestad.materialdialogs.internal.main.DialogScrollView r5 = (com.afollestad.materialdialogs.internal.main.DialogScrollView) r5
                r5.q3BipwRCk()
                int r0 = r5.getChildCount()
                r1 = 1
                if (r0 == 0) goto L_0x0024
                int r0 = r5.getMeasuredHeight()
                if (r0 == 0) goto L_0x0024
                r0 = 0
                android.view.View r2 = r5.getChildAt(r0)
                int r2 = r2.getMeasuredHeight()
                int r3 = r5.getHeight()
                if (r2 <= r3) goto L_0x0022
                r0 = r1
            L_0x0022:
                if (r0 != 0) goto L_0x0025
            L_0x0024:
                r1 = 2
            L_0x0025:
                r5.setOverScrollMode(r1)
                con.qih4lW99W r5 = con.qih4lW99W.q3BipwRCk
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.main.DialogScrollView.RG2GI7LDp.IytU16YUK(java.lang.Object):java.lang.Object");
        }
    }

    public DialogScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final DialogLayout getRootView() {
        return this.CBQ5d1kRq;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        RG2GI7LDp rG2GI7LDp = RG2GI7LDp.kmSgne1rO;
        if (getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0) {
            getViewTreeObserver().addOnGlobalLayoutListener(new nEBNqwNJt(this, rG2GI7LDp, 1));
        } else {
            rG2GI7LDp.IytU16YUK(this);
        }
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        q3BipwRCk();
    }

    public final void q3BipwRCk() {
        boolean z = false;
        if (!(getChildCount() == 0 || getMeasuredHeight() == 0)) {
            if (getChildAt(0).getMeasuredHeight() > getHeight()) {
                int bottom = getChildAt(getChildCount() - 1).getBottom() - (getScrollY() + getMeasuredHeight());
                DialogLayout dialogLayout = this.CBQ5d1kRq;
                if (dialogLayout != null) {
                    boolean z2 = getScrollY() > 0;
                    if (bottom > 0) {
                        z = true;
                    }
                    dialogLayout.Eeka1udhb.setDrawDivider(z2);
                    DialogActionButtonLayout dialogActionButtonLayout = dialogLayout.RG6kpfv3v;
                    if (dialogActionButtonLayout != null) {
                        dialogActionButtonLayout.setDrawDivider(z);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        DialogLayout dialogLayout2 = this.CBQ5d1kRq;
        if (dialogLayout2 != null) {
            dialogLayout2.Eeka1udhb.setDrawDivider(false);
            DialogActionButtonLayout dialogActionButtonLayout2 = dialogLayout2.RG6kpfv3v;
            if (dialogActionButtonLayout2 != null) {
                dialogActionButtonLayout2.setDrawDivider(false);
            }
        }
    }

    public final void setRootView(DialogLayout dialogLayout) {
        this.CBQ5d1kRq = dialogLayout;
    }
}
