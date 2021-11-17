package com.afollestad.materialdialogs.internal.message;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import com.afollestad.materialdialogs.internal.main.DialogLayout;
import com.afollestad.materialdialogs.internal.main.DialogScrollView;
import com.feravolt.preload.R;
import con.PmanMZxiM;
import con.Sd85yPnM9;
import con.WQpIMzWun;
import con.Wk9bO57s4;
import con.YGTdT21e3;
import con.anXlDk6fV;
import con.gdEmqfwpT;
import con.lNNWSSNDS;
import con.llWJsfBCK;
import con.oQOTo2h4p;
import con.qih4lW99W;
import con.xwNzMLspM;
import con.y5mNuzXIA;
import java.util.Objects;
/* loaded from: classes.dex */
public final class DialogContentLayout extends FrameLayout {
    public static final /* synthetic */ Sd85yPnM9[] qVUwofr5s;
    public final llWJsfBCK Bhmn1KIah = anXlDk6fV.ixWaw2akD(new RG2GI7LDp());
    public ViewGroup CBQ5d1kRq;
    public DialogRecyclerView MzoOEjc4X;
    public DialogScrollView PSTqBLTET;
    public View ilHKhw3Yw;
    public TextView kmSgne1rO;

    /* loaded from: classes.dex */
    public static final class RG2GI7LDp extends Wk9bO57s4 implements gdEmqfwpT {
        public RG2GI7LDp() {
            super(0);
        }

        @Override // con.gdEmqfwpT
        public Object GPLPRo6go() {
            return Integer.valueOf(DialogContentLayout.this.getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin_horizontal));
        }
    }

    static {
        oQOTo2h4p oqoto2h4p = new oQOTo2h4p(YGTdT21e3.q3BipwRCk(DialogContentLayout.class), "frameHorizontalMargin", "getFrameHorizontalMargin()I");
        Objects.requireNonNull(YGTdT21e3.q3BipwRCk);
        qVUwofr5s = new Sd85yPnM9[]{oqoto2h4p};
    }

    public DialogContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final int getFrameHorizontalMargin() {
        llWJsfBCK llwjsfbck = this.Bhmn1KIah;
        Sd85yPnM9 sd85yPnM9 = qVUwofr5s[0];
        return ((Number) llwjsfbck.getValue()).intValue();
    }

    private final DialogLayout getRootLayout() {
        ViewParent parent = getParent();
        if (parent != null) {
            return (DialogLayout) parent;
        }
        throw new y5mNuzXIA("null cannot be cast to non-null type com.afollestad.materialdialogs.internal.main.DialogLayout");
    }

    /* JADX WARN: Finally extract failed */
    public final void J4Ux7ym32(WQpIMzWun wQpIMzWun, Integer num, CharSequence charSequence, Typeface typeface, PmanMZxiM pmanMZxiM) {
        int i = 0;
        if (this.PSTqBLTET == null) {
            DialogScrollView dialogScrollView = (DialogScrollView) LayoutInflater.from(getContext()).inflate(R.layout.md_dialog_stub_scrollview, (ViewGroup) this, false);
            dialogScrollView.setRootView(getRootLayout());
            View childAt = dialogScrollView.getChildAt(0);
            if (childAt != null) {
                this.CBQ5d1kRq = (ViewGroup) childAt;
                int dimensionPixelSize = dialogScrollView.getContext().getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin_vertical);
                int paddingLeft = true & true ? dialogScrollView.getPaddingLeft() : 0;
                int paddingTop = true & true ? dialogScrollView.getPaddingTop() : 0;
                int paddingRight = true & true ? dialogScrollView.getPaddingRight() : 0;
                if (true && true) {
                    dimensionPixelSize = dialogScrollView.getPaddingBottom();
                }
                if (!(paddingLeft == dialogScrollView.getPaddingLeft() && paddingTop == dialogScrollView.getPaddingTop() && paddingRight == dialogScrollView.getPaddingRight() && dimensionPixelSize == dialogScrollView.getPaddingBottom())) {
                    dialogScrollView.setPadding(paddingLeft, paddingTop, paddingRight, dimensionPixelSize);
                }
                this.PSTqBLTET = dialogScrollView;
                addView(dialogScrollView);
            } else {
                throw new y5mNuzXIA("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        CharSequence charSequence2 = null;
        if (this.kmSgne1rO == null) {
            ViewGroup viewGroup = this.CBQ5d1kRq;
            if (viewGroup != null) {
                TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.md_dialog_stub_message, viewGroup, false);
                ViewGroup viewGroup2 = this.CBQ5d1kRq;
                if (viewGroup2 != null) {
                    viewGroup2.addView(textView);
                    this.kmSgne1rO = textView;
                } else {
                    anXlDk6fV.cAwN510t2();
                    throw null;
                }
            } else {
                anXlDk6fV.cAwN510t2();
                throw null;
            }
        }
        TextView textView2 = this.kmSgne1rO;
        if (textView2 != null) {
            lNNWSSNDS lnnwssnds = new lNNWSSNDS(wQpIMzWun, textView2);
            if (pmanMZxiM != null) {
                qih4lW99W qih4lw99w = (qih4lW99W) pmanMZxiM.IytU16YUK(lnnwssnds);
            }
            TextView textView3 = this.kmSgne1rO;
            if (textView3 != null) {
                if (typeface != null) {
                    textView3.setTypeface(typeface);
                }
                xwNzMLspM.q3BipwRCk(xwNzMLspM.q3BipwRCk, textView3, wQpIMzWun.WaUP0CF08, Integer.valueOf((int) R.attr.md_color_content), null, 4);
                if (!lnnwssnds.dIocxURUo) {
                    TypedArray obtainStyledAttributes = ((WQpIMzWun) lnnwssnds.q3BipwRCk).WaUP0CF08.getTheme().obtainStyledAttributes(new int[]{R.attr.md_line_spacing_body});
                    try {
                        float f = obtainStyledAttributes.getFloat(0, 1.1f);
                        obtainStyledAttributes.recycle();
                        lnnwssnds.dIocxURUo = true;
                        ((TextView) lnnwssnds.J4Ux7ym32).setLineSpacing(0.0f, f);
                    } catch (Throwable th) {
                        obtainStyledAttributes.recycle();
                        throw th;
                    }
                }
                TextView textView4 = (TextView) lnnwssnds.J4Ux7ym32;
                CharSequence q3BipwRCk = lnnwssnds.q3BipwRCk(charSequence, lnnwssnds.tGV7Q6urW);
                if (q3BipwRCk != null) {
                    charSequence2 = q3BipwRCk;
                } else {
                    boolean z = lnnwssnds.tGV7Q6urW;
                    Context context = ((WQpIMzWun) lnnwssnds.q3BipwRCk).WaUP0CF08;
                    if (num != null) {
                        i = num.intValue();
                    }
                    if (i != 0) {
                        CharSequence text = context.getResources().getText(i);
                        if (z) {
                            text = Html.fromHtml(text.toString());
                        }
                        charSequence2 = text;
                    }
                }
                textView4.setText(charSequence2);
                return;
            }
            return;
        }
        anXlDk6fV.cAwN510t2();
        throw null;
    }

    public final View getCustomView() {
        return this.ilHKhw3Yw;
    }

    public final DialogRecyclerView getRecyclerView() {
        return this.MzoOEjc4X;
    }

    public final DialogScrollView getScrollView() {
        return this.PSTqBLTET;
    }

    @Override // android.widget.FrameLayout, android.view.View, android.view.ViewGroup
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            int measuredHeight = childAt.getMeasuredHeight() + i6;
            anXlDk6fV.tGV7Q6urW(childAt, this.ilHKhw3Yw);
            childAt.layout(0, i6, getMeasuredWidth(), measuredHeight);
            i5++;
            i6 = measuredHeight;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        DialogScrollView dialogScrollView = this.PSTqBLTET;
        if (dialogScrollView != null) {
            dialogScrollView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
        }
        DialogScrollView dialogScrollView2 = this.PSTqBLTET;
        int measuredHeight = dialogScrollView2 != null ? dialogScrollView2.getMeasuredHeight() : 0;
        int i3 = size2 - measuredHeight;
        int childCount = this.PSTqBLTET != null ? getChildCount() - 1 : getChildCount();
        if (childCount == 0) {
            setMeasuredDimension(size, measuredHeight);
            return;
        }
        int i4 = i3 / childCount;
        int childCount2 = getChildCount();
        for (int i5 = 0; i5 < childCount2; i5++) {
            View childAt = getChildAt(i5);
            int id = childAt.getId();
            DialogScrollView dialogScrollView3 = this.PSTqBLTET;
            if (dialogScrollView3 == null || id != dialogScrollView3.getId()) {
                anXlDk6fV.tGV7Q6urW(childAt, this.ilHKhw3Yw);
                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE));
                measuredHeight = childAt.getMeasuredHeight() + measuredHeight;
            }
        }
        setMeasuredDimension(size, measuredHeight);
    }

    public final void q3BipwRCk(int i, int i2) {
        if (i != -1) {
            View childAt = getChildAt(0);
            int paddingLeft = (!true || !true || childAt == null) ? 0 : childAt.getPaddingLeft();
            if (true && true) {
                i = childAt != null ? childAt.getPaddingTop() : 0;
            }
            int paddingRight = (!true || !true || childAt == null) ? 0 : childAt.getPaddingRight();
            int paddingBottom = (!true || !true || childAt == null) ? 0 : childAt.getPaddingBottom();
            if (!((childAt != null && paddingLeft == childAt.getPaddingLeft() && i == childAt.getPaddingTop() && paddingRight == childAt.getPaddingRight() && paddingBottom == childAt.getPaddingBottom()) || childAt == null)) {
                childAt.setPadding(paddingLeft, i, paddingRight, paddingBottom);
            }
        }
        if (i2 != -1) {
            View childAt2 = getChildAt(getChildCount() - 1);
            int paddingLeft2 = (!true || !true || childAt2 == null) ? 0 : childAt2.getPaddingLeft();
            int paddingTop = (!true || !true || childAt2 == null) ? 0 : childAt2.getPaddingTop();
            int paddingRight2 = (!true || !true || childAt2 == null) ? 0 : childAt2.getPaddingRight();
            if (true && true) {
                i2 = childAt2 != null ? childAt2.getPaddingBottom() : 0;
            }
            if ((childAt2 == null || paddingLeft2 != childAt2.getPaddingLeft() || paddingTop != childAt2.getPaddingTop() || paddingRight2 != childAt2.getPaddingRight() || i2 != childAt2.getPaddingBottom()) && childAt2 != null) {
                childAt2.setPadding(paddingLeft2, paddingTop, paddingRight2, i2);
            }
        }
    }

    public final void setCustomView(View view) {
        this.ilHKhw3Yw = view;
    }

    public final void setRecyclerView(DialogRecyclerView dialogRecyclerView) {
        this.MzoOEjc4X = dialogRecyclerView;
    }

    public final void setScrollView(DialogScrollView dialogScrollView) {
        this.PSTqBLTET = dialogScrollView;
    }
}
