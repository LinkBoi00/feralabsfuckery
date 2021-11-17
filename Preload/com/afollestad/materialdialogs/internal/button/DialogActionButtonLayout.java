package com.afollestad.materialdialogs.internal.button;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.afollestad.materialdialogs.internal.list.DialogRecyclerView;
import com.feravolt.preload.R;
import con.Dqz1pJHWH;
import con.LzT8CF9ie;
import con.VYFSnTUcw;
import con.WQpIMzWun;
import con.idpM54xlp;
import con.p5Q4EA2Wh;
import con.pA5wCkne4;
import con.y5mNuzXIA;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class DialogActionButtonLayout extends VYFSnTUcw {
    public boolean RG6kpfv3v;
    public DialogActionButton[] ixWaw2akD;
    public AppCompatCheckBox sk5s77z6Q;
    public final int MzoOEjc4X = getContext().getResources().getDimensionPixelSize(R.dimen.md_action_button_frame_padding) - getContext().getResources().getDimensionPixelSize(R.dimen.md_action_button_inset_horizontal);
    public final int ilHKhw3Yw = getContext().getResources().getDimensionPixelSize(R.dimen.md_action_button_frame_padding_neutral);
    public final int qVUwofr5s = getContext().getResources().getDimensionPixelSize(R.dimen.md_action_button_frame_spec_height);
    public final int Eeka1udhb = getContext().getResources().getDimensionPixelSize(R.dimen.md_checkbox_prompt_margin_vertical);
    public final int dXrmkklc8 = getContext().getResources().getDimensionPixelSize(R.dimen.md_checkbox_prompt_margin_horizontal);

    /* loaded from: classes.dex */
    public static final class RG2GI7LDp implements View.OnClickListener {
        public final /* synthetic */ LzT8CF9ie kmSgne1rO;

        public RG2GI7LDp(LzT8CF9ie lzT8CF9ie) {
            DialogActionButtonLayout.this = r1;
            this.kmSgne1rO = lzT8CF9ie;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            List list;
            WQpIMzWun dialog = DialogActionButtonLayout.this.getDialog();
            LzT8CF9ie lzT8CF9ie = this.kmSgne1rO;
            Objects.requireNonNull(dialog);
            int ordinal = lzT8CF9ie.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    list = dialog.ixWaw2akD;
                } else if (ordinal == 2) {
                    list = dialog.sk5s77z6Q;
                }
                idpM54xlp.MzoOEjc4X(list, dialog);
            } else {
                idpM54xlp.MzoOEjc4X(dialog.RG6kpfv3v, dialog);
                DialogRecyclerView recyclerView = dialog.Eeka1udhb.getContentLayout().getRecyclerView();
                if (recyclerView != null) {
                    recyclerView.getAdapter();
                }
            }
            if (dialog.kmSgne1rO) {
                dialog.dismiss();
            }
        }
    }

    public DialogActionButtonLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final DialogActionButton[] getActionButtons() {
        return this.ixWaw2akD;
    }

    public final AppCompatCheckBox getCheckBoxPrompt() {
        return this.sk5s77z6Q;
    }

    public final boolean getStackButtons$core() {
        return this.RG6kpfv3v;
    }

    public final DialogActionButton[] getVisibleButtons() {
        DialogActionButton[] dialogActionButtonArr = this.ixWaw2akD;
        ArrayList arrayList = new ArrayList();
        for (DialogActionButton dialogActionButton : dialogActionButtonArr) {
            if (idpM54xlp.qVUwofr5s(dialogActionButton)) {
                arrayList.add(dialogActionButton);
            }
        }
        Object[] array = arrayList.toArray(new DialogActionButton[0]);
        if (array != null) {
            return (DialogActionButton[]) array;
        }
        throw new y5mNuzXIA("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getDrawDivider()) {
            canvas.drawLine(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getDividerHeight(), q3BipwRCk());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        LzT8CF9ie lzT8CF9ie;
        super.onFinishInflate();
        this.ixWaw2akD = new DialogActionButton[]{(DialogActionButton) findViewById(R.id.md_button_positive), (DialogActionButton) findViewById(R.id.md_button_negative), (DialogActionButton) findViewById(R.id.md_button_neutral)};
        this.sk5s77z6Q = (AppCompatCheckBox) findViewById(R.id.md_checkbox_prompt);
        DialogActionButton[] dialogActionButtonArr = this.ixWaw2akD;
        int length = dialogActionButtonArr.length;
        for (int i = 0; i < length; i++) {
            DialogActionButton dialogActionButton = dialogActionButtonArr[i];
            if (i == 0) {
                lzT8CF9ie = LzT8CF9ie.POSITIVE;
            } else if (i == 1) {
                lzT8CF9ie = LzT8CF9ie.NEGATIVE;
            } else if (i == 2) {
                lzT8CF9ie = LzT8CF9ie.NEUTRAL;
            } else {
                throw new IndexOutOfBoundsException(i + " is not an action button index.");
            }
            dialogActionButton.setOnClickListener(new RG2GI7LDp(lzT8CF9ie));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        List<DialogActionButton> list;
        int i5;
        int i6;
        int i7;
        if (pA5wCkne4.iMyQMM6Qj(this)) {
            if (idpM54xlp.qVUwofr5s(this.sk5s77z6Q)) {
                if (idpM54xlp.ilHKhw3Yw(this)) {
                    i7 = getMeasuredWidth() - this.dXrmkklc8;
                    i6 = this.Eeka1udhb;
                    i5 = i7 - this.sk5s77z6Q.getMeasuredWidth();
                } else {
                    i5 = this.dXrmkklc8;
                    i6 = this.Eeka1udhb;
                    i7 = this.sk5s77z6Q.getMeasuredWidth() + i5;
                }
                this.sk5s77z6Q.layout(i5, i6, i7, this.sk5s77z6Q.getMeasuredHeight() + i6);
            }
            boolean z2 = true;
            if (this.RG6kpfv3v) {
                int i8 = this.MzoOEjc4X;
                int measuredWidth = getMeasuredWidth() - this.MzoOEjc4X;
                int measuredHeight = getMeasuredHeight();
                DialogActionButton[] visibleButtons = getVisibleButtons();
                if (visibleButtons.length != 0) {
                    z2 = false;
                }
                if (z2) {
                    list = Dqz1pJHWH.CBQ5d1kRq;
                } else {
                    list = new ArrayList(new p5Q4EA2Wh(visibleButtons, false));
                    Collections.reverse(list);
                }
                for (DialogActionButton dialogActionButton : list) {
                    int i9 = measuredHeight - this.qVUwofr5s;
                    dialogActionButton.layout(i8, i9, measuredWidth, measuredHeight);
                    measuredHeight = i9;
                }
                return;
            }
            int measuredHeight2 = getMeasuredHeight() - this.qVUwofr5s;
            int measuredHeight3 = getMeasuredHeight();
            if (idpM54xlp.ilHKhw3Yw(this)) {
                if (idpM54xlp.qVUwofr5s(this.ixWaw2akD[2])) {
                    DialogActionButton dialogActionButton2 = this.ixWaw2akD[2];
                    int measuredWidth2 = getMeasuredWidth() - this.ilHKhw3Yw;
                    dialogActionButton2.layout(measuredWidth2 - dialogActionButton2.getMeasuredWidth(), measuredHeight2, measuredWidth2, measuredHeight3);
                }
                int i10 = this.MzoOEjc4X;
                if (idpM54xlp.qVUwofr5s(this.ixWaw2akD[0])) {
                    DialogActionButton dialogActionButton3 = this.ixWaw2akD[0];
                    int measuredWidth3 = dialogActionButton3.getMeasuredWidth() + i10;
                    dialogActionButton3.layout(i10, measuredHeight2, measuredWidth3, measuredHeight3);
                    i10 = measuredWidth3;
                }
                if (idpM54xlp.qVUwofr5s(this.ixWaw2akD[1])) {
                    DialogActionButton dialogActionButton4 = this.ixWaw2akD[1];
                    dialogActionButton4.layout(i10, measuredHeight2, dialogActionButton4.getMeasuredWidth() + i10, measuredHeight3);
                    return;
                }
                return;
            }
            if (idpM54xlp.qVUwofr5s(this.ixWaw2akD[2])) {
                DialogActionButton dialogActionButton5 = this.ixWaw2akD[2];
                int i11 = this.ilHKhw3Yw;
                dialogActionButton5.layout(i11, measuredHeight2, dialogActionButton5.getMeasuredWidth() + i11, measuredHeight3);
            }
            int measuredWidth4 = getMeasuredWidth() - this.MzoOEjc4X;
            if (idpM54xlp.qVUwofr5s(this.ixWaw2akD[0])) {
                DialogActionButton dialogActionButton6 = this.ixWaw2akD[0];
                int measuredWidth5 = measuredWidth4 - dialogActionButton6.getMeasuredWidth();
                dialogActionButton6.layout(measuredWidth5, measuredHeight2, measuredWidth4, measuredHeight3);
                measuredWidth4 = measuredWidth5;
            }
            if (idpM54xlp.qVUwofr5s(this.ixWaw2akD[1])) {
                DialogActionButton dialogActionButton7 = this.ixWaw2akD[1];
                dialogActionButton7.layout(measuredWidth4 - dialogActionButton7.getMeasuredWidth(), measuredHeight2, measuredWidth4, measuredHeight3);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = 0;
        if (!pA5wCkne4.iMyQMM6Qj(this)) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        if (idpM54xlp.qVUwofr5s(this.sk5s77z6Q)) {
            this.sk5s77z6Q.measure(View.MeasureSpec.makeMeasureSpec(size - (this.dXrmkklc8 * 2), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        Context context = getDialog().getContext();
        Context context2 = getDialog().WaUP0CF08;
        DialogActionButton[] visibleButtons = getVisibleButtons();
        for (DialogActionButton dialogActionButton : visibleButtons) {
            dialogActionButton.q3BipwRCk(context, context2, this.RG6kpfv3v);
            dialogActionButton.measure(this.RG6kpfv3v ? View.MeasureSpec.makeMeasureSpec(size, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(this.qVUwofr5s, 1073741824));
        }
        boolean z = true;
        if ((!(getVisibleButtons().length == 0)) && !this.RG6kpfv3v) {
            int i4 = 0;
            for (DialogActionButton dialogActionButton2 : getVisibleButtons()) {
                i4 += dialogActionButton2.getMeasuredWidth();
            }
            if (i4 >= size && !this.RG6kpfv3v) {
                this.RG6kpfv3v = true;
                DialogActionButton[] visibleButtons2 = getVisibleButtons();
                for (DialogActionButton dialogActionButton3 : visibleButtons2) {
                    dialogActionButton3.q3BipwRCk(context, context2, true);
                    dialogActionButton3.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(this.qVUwofr5s, 1073741824));
                }
            }
        }
        if (getVisibleButtons().length != 0) {
            z = false;
        }
        if (!z) {
            i3 = this.RG6kpfv3v ? this.qVUwofr5s * getVisibleButtons().length : this.qVUwofr5s;
        }
        if (idpM54xlp.qVUwofr5s(this.sk5s77z6Q)) {
            i3 += (this.Eeka1udhb * 2) + this.sk5s77z6Q.getMeasuredHeight();
        }
        setMeasuredDimension(size, i3);
    }

    public final void setActionButtons(DialogActionButton[] dialogActionButtonArr) {
        this.ixWaw2akD = dialogActionButtonArr;
    }

    public final void setCheckBoxPrompt(AppCompatCheckBox appCompatCheckBox) {
        this.sk5s77z6Q = appCompatCheckBox;
    }

    public final void setStackButtons$core(boolean z) {
        this.RG6kpfv3v = z;
    }
}
