package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.feravolt.preload.R;
import con.VYFSnTUcw;
import con.idpM54xlp;
/* loaded from: classes.dex */
public final class DialogTitleLayout extends VYFSnTUcw {
    public ImageView RG6kpfv3v;
    public TextView ixWaw2akD;
    public final int MzoOEjc4X = getContext().getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin_vertical);
    public final int ilHKhw3Yw = getContext().getResources().getDimensionPixelSize(R.dimen.md_dialog_title_layout_margin_bottom);
    public final int qVUwofr5s = getContext().getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin_horizontal);
    public final int Eeka1udhb = getContext().getResources().getDimensionPixelSize(R.dimen.md_icon_margin);
    public final int dXrmkklc8 = getContext().getResources().getDimensionPixelSize(R.dimen.md_icon_size);

    public DialogTitleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean J4Ux7ym32() {
        if (!(!idpM54xlp.qVUwofr5s(this.RG6kpfv3v)) || !(!idpM54xlp.qVUwofr5s(this.ixWaw2akD))) {
            return false;
        }
        return true;
    }

    public final ImageView getIconView$core() {
        return this.RG6kpfv3v;
    }

    public final TextView getTitleView$core() {
        return this.ixWaw2akD;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getDrawDivider()) {
            canvas.drawLine(0.0f, ((float) getMeasuredHeight()) - ((float) getDividerHeight()), (float) getMeasuredWidth(), (float) getMeasuredHeight(), q3BipwRCk());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.RG6kpfv3v = (ImageView) findViewById(R.id.md_icon_title);
        this.ixWaw2akD = (TextView) findViewById(R.id.md_text_title);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        if (!J4Ux7ym32()) {
            int i9 = this.MzoOEjc4X;
            int measuredHeight = getMeasuredHeight() - this.ilHKhw3Yw;
            int i10 = measuredHeight - ((measuredHeight - i9) / 2);
            int measuredHeight2 = this.ixWaw2akD.getMeasuredHeight() / 2;
            int i11 = i10 - measuredHeight2;
            int i12 = measuredHeight2 + i10;
            TextView textView = this.ixWaw2akD;
            Paint.FontMetrics fontMetrics = textView.getPaint().getFontMetrics();
            float f = fontMetrics.descent - fontMetrics.ascent;
            int measuredHeight3 = i12 + (f > ((float) textView.getMeasuredHeight()) ? (int) (f - ((float) textView.getMeasuredHeight())) : 0);
            if (idpM54xlp.ilHKhw3Yw(this)) {
                i6 = getMeasuredWidth() - this.qVUwofr5s;
                i5 = i6 - this.ixWaw2akD.getMeasuredWidth();
            } else {
                i5 = this.qVUwofr5s;
                i6 = this.ixWaw2akD.getMeasuredWidth() + i5;
            }
            if (idpM54xlp.qVUwofr5s(this.RG6kpfv3v)) {
                int measuredHeight4 = this.RG6kpfv3v.getMeasuredHeight() / 2;
                int i13 = i10 - measuredHeight4;
                int i14 = i10 + measuredHeight4;
                if (idpM54xlp.ilHKhw3Yw(this)) {
                    i5 = i6 - this.RG6kpfv3v.getMeasuredWidth();
                    i8 = i5 - this.Eeka1udhb;
                    i7 = i8 - this.ixWaw2akD.getMeasuredWidth();
                } else {
                    i6 = this.RG6kpfv3v.getMeasuredWidth() + i5;
                    int i15 = this.Eeka1udhb + i6;
                    i8 = this.ixWaw2akD.getMeasuredWidth() + i15;
                    i7 = i15;
                }
                this.RG6kpfv3v.layout(i5, i13, i6, i14);
                i6 = i8;
                i5 = i7;
            }
            this.ixWaw2akD.layout(i5, i11, i6, measuredHeight3);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = 0;
        if (J4Ux7ym32()) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int i4 = size - (this.qVUwofr5s * 2);
        if (idpM54xlp.qVUwofr5s(this.RG6kpfv3v)) {
            this.RG6kpfv3v.measure(View.MeasureSpec.makeMeasureSpec(this.dXrmkklc8, 1073741824), View.MeasureSpec.makeMeasureSpec(this.dXrmkklc8, 1073741824));
            i4 -= this.RG6kpfv3v.getMeasuredWidth() + this.Eeka1udhb;
        }
        this.ixWaw2akD.measure(View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (idpM54xlp.qVUwofr5s(this.RG6kpfv3v)) {
            i3 = this.RG6kpfv3v.getMeasuredHeight();
        }
        int measuredHeight = this.ixWaw2akD.getMeasuredHeight();
        if (i3 < measuredHeight) {
            i3 = measuredHeight;
        }
        setMeasuredDimension(size, i3 + this.MzoOEjc4X + this.ilHKhw3Yw);
    }

    public final void setIconView$core(ImageView imageView) {
        this.RG6kpfv3v = imageView;
    }

    public final void setTitleView$core(TextView textView) {
        this.ixWaw2akD = textView;
    }
}
