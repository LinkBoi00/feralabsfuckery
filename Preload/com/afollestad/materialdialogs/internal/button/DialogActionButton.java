package com.afollestad.materialdialogs.internal.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import com.feravolt.preload.R;
import con.D856HTNqd;
import con.LYtU53WQj;
import con.Wk9bO57s4;
import con.gdEmqfwpT;
import con.nHNpaD9No;
import con.pA5wCkne4;
import con.xwNzMLspM;
/* loaded from: classes.dex */
public final class DialogActionButton extends LYtU53WQj {
    public int Bhmn1KIah;
    public int PSTqBLTET;

    /* loaded from: classes.dex */
    public static final class RG2GI7LDp extends Wk9bO57s4 implements gdEmqfwpT {
        public final /* synthetic */ Context kmSgne1rO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RG2GI7LDp(Context context) {
            super(0);
            this.kmSgne1rO = context;
        }

        @Override // con.gdEmqfwpT
        public Object GPLPRo6go() {
            int i;
            Context context = this.kmSgne1rO;
            Integer valueOf = Integer.valueOf((int) R.attr.colorPrimary);
            if (valueOf != null) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{valueOf.intValue()});
                try {
                    i = obtainStyledAttributes.getColor(0, 0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                Object obj = D856HTNqd.q3BipwRCk;
                i = nHNpaD9No.q3BipwRCk(context, 0);
            }
            return Integer.valueOf(i);
        }
    }

    /* loaded from: classes.dex */
    public static final class mhl5lIdbQ extends Wk9bO57s4 implements gdEmqfwpT {
        public final /* synthetic */ Context kmSgne1rO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public mhl5lIdbQ(Context context) {
            super(0);
            this.kmSgne1rO = context;
        }

        @Override // con.gdEmqfwpT
        public Object GPLPRo6go() {
            int i;
            Context context = this.kmSgne1rO;
            Integer valueOf = Integer.valueOf((int) R.attr.colorPrimary);
            if (valueOf != null) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{valueOf.intValue()});
                try {
                    i = obtainStyledAttributes.getColor(0, 0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                Object obj = D856HTNqd.q3BipwRCk;
                i = nHNpaD9No.q3BipwRCk(context, 0);
            }
            return Integer.valueOf(Color.argb((int) (((float) 255) * 0.12f), Color.red(i), Color.green(i), Color.blue(i)));
        }
    }

    public DialogActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyle);
        setClickable(true);
        setFocusable(true);
    }

    public final void q3BipwRCk(Context context, Context context2, boolean z) {
        int tGV7Q6urW;
        xwNzMLspM xwnzmlspm = xwNzMLspM.q3BipwRCk;
        TypedArray obtainStyledAttributes = context2.getTheme().obtainStyledAttributes(new int[]{R.attr.md_button_casing});
        try {
            int i = obtainStyledAttributes.getInt(0, 1);
            obtainStyledAttributes.recycle();
            setSupportAllCaps(i == 1);
            boolean CBQ5d1kRq = pA5wCkne4.CBQ5d1kRq(context2);
            this.Bhmn1KIah = xwNzMLspM.tGV7Q6urW(xwnzmlspm, context2, null, Integer.valueOf((int) R.attr.md_color_button_text), new RG2GI7LDp(context2), 2);
            this.PSTqBLTET = xwNzMLspM.tGV7Q6urW(xwnzmlspm, context, Integer.valueOf(CBQ5d1kRq ? R.color.md_disabled_text_light_theme : R.color.md_disabled_text_dark_theme), null, null, 12);
            setTextColor(this.Bhmn1KIah);
            Integer valueOf = Integer.valueOf((int) R.attr.md_button_selector);
            Drawable drawable = null;
            if (valueOf != null) {
                obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{valueOf.intValue()});
                try {
                    drawable = obtainStyledAttributes.getDrawable(0);
                } finally {
                }
            }
            if ((drawable instanceof RippleDrawable) && (tGV7Q6urW = xwNzMLspM.tGV7Q6urW(xwnzmlspm, context, null, Integer.valueOf((int) R.attr.md_ripple_color), new mhl5lIdbQ(context2), 2)) != 0) {
                ((RippleDrawable) drawable).setColor(ColorStateList.valueOf(tGV7Q6urW));
            }
            setBackground(drawable);
            if (z) {
                setTextAlignment(6);
                setGravity(8388629);
            } else {
                setGravity(17);
            }
            setEnabled(isEnabled());
        } finally {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setTextColor(z ? this.Bhmn1KIah : this.PSTqBLTET);
    }
}
