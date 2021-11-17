package com.afollestad.materialdialogs.internal.main;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import com.afollestad.materialdialogs.internal.message.DialogContentLayout;
import com.feravolt.preload.R;
import con.WQpIMzWun;
import con.ZaxjSdKpQ;
import con.anXlDk6fV;
import con.idpM54xlp;
import con.n4f84B5OG;
import con.pA5wCkne4;
import con.y5mNuzXIA;
/* loaded from: classes.dex */
public final class DialogLayout extends FrameLayout {
    public int CBQ5d1kRq;
    public DialogTitleLayout Eeka1udhb;
    public Paint PSTqBLTET;
    public DialogActionButtonLayout RG6kpfv3v;
    public DialogContentLayout dXrmkklc8;
    public boolean kmSgne1rO;
    public WQpIMzWun qVUwofr5s;
    public float[] Bhmn1KIah = new float[0];
    public final int MzoOEjc4X = getContext().getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin_vertical);
    public final int ilHKhw3Yw = getContext().getResources().getDimensionPixelSize(R.dimen.md_dialog_frame_margin_vertical_less);
    public ZaxjSdKpQ ixWaw2akD = ZaxjSdKpQ.WRAP_CONTENT;
    public boolean sk5s77z6Q = true;
    public int WaUP0CF08 = -1;
    public final Path i8XZMQc6Z = new Path();
    public final RectF dfpT1j18n = new RectF();

    public DialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void q3BipwRCk(DialogLayout dialogLayout, Canvas canvas, int i, float f, float f2, int i2) {
        if ((i2 & 2) != 0) {
            f = (float) dialogLayout.getMeasuredHeight();
        }
        canvas.drawLine(0.0f, f, (float) dialogLayout.getMeasuredWidth(), (i2 & 4) != 0 ? f : f2, dialogLayout.J4Ux7ym32(i, 1.0f));
    }

    public static void tGV7Q6urW(DialogLayout dialogLayout, Canvas canvas, int i, float f, float f2, int i2) {
        canvas.drawLine(f, 0.0f, (i2 & 4) != 0 ? f : f2, (float) dialogLayout.getMeasuredHeight(), dialogLayout.J4Ux7ym32(i, 1.0f));
    }

    public final Paint J4Ux7ym32(int i, float f) {
        if (this.PSTqBLTET == null) {
            Paint paint = new Paint();
            paint.setStrokeWidth(pA5wCkne4.kCA6Zs9sL(this, 1));
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            this.PSTqBLTET = paint;
        }
        Paint paint2 = this.PSTqBLTET;
        if (paint2 != null) {
            paint2.setColor(i);
            setAlpha(f);
            return paint2;
        }
        anXlDk6fV.cAwN510t2();
        throw null;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void dispatchDraw(Canvas canvas) {
        if (!(this.Bhmn1KIah.length == 0)) {
            canvas.clipPath(this.i8XZMQc6Z);
        }
        super.dispatchDraw(canvas);
    }

    public final DialogActionButtonLayout getButtonsLayout() {
        return this.RG6kpfv3v;
    }

    public final DialogContentLayout getContentLayout() {
        return this.dXrmkklc8;
    }

    public final float[] getCornerRadii() {
        return this.Bhmn1KIah;
    }

    public final boolean getDebugMode() {
        return this.kmSgne1rO;
    }

    public final WQpIMzWun getDialog() {
        return this.qVUwofr5s;
    }

    public final int getFrameMarginVertical$core() {
        return this.MzoOEjc4X;
    }

    public final int getFrameMarginVerticalLess$core() {
        return this.ilHKhw3Yw;
    }

    @Override // android.view.ViewGroup
    public final ZaxjSdKpQ getLayoutMode() {
        return this.ixWaw2akD;
    }

    public final int getMaxHeight() {
        return this.CBQ5d1kRq;
    }

    public final DialogTitleLayout getTitleLayout() {
        return this.Eeka1udhb;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object systemService = getContext().getSystemService("window");
        if (systemService != null) {
            Point point = new Point();
            ((WindowManager) systemService).getDefaultDisplay().getSize(point);
            this.WaUP0CF08 = ((Number) new n4f84B5OG(Integer.valueOf(point.x), Integer.valueOf(point.y)).kmSgne1rO).intValue();
            return;
        }
        throw new y5mNuzXIA("null cannot be cast to non-null type android.view.WindowManager");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        int i;
        super.onDraw(canvas);
        if (this.kmSgne1rO) {
            tGV7Q6urW(this, canvas, -16776961, pA5wCkne4.kCA6Zs9sL(this, 24), 0.0f, 4);
            q3BipwRCk(this, canvas, -16776961, pA5wCkne4.kCA6Zs9sL(this, 24), 0.0f, 4);
            tGV7Q6urW(this, canvas, -16776961, ((float) getMeasuredWidth()) - pA5wCkne4.kCA6Zs9sL(this, 24), 0.0f, 4);
            if (idpM54xlp.qVUwofr5s(this.Eeka1udhb)) {
                q3BipwRCk(this, canvas, -65536, (float) this.Eeka1udhb.getBottom(), 0.0f, 4);
            }
            if (idpM54xlp.qVUwofr5s(this.dXrmkklc8)) {
                q3BipwRCk(this, canvas, -256, (float) this.dXrmkklc8.getTop(), 0.0f, 4);
            }
            if (pA5wCkne4.iMyQMM6Qj(this.RG6kpfv3v)) {
                tGV7Q6urW(this, canvas, -16711681, idpM54xlp.ilHKhw3Yw(this) ? pA5wCkne4.kCA6Zs9sL(this, 8) : ((float) getMeasuredWidth()) - pA5wCkne4.kCA6Zs9sL(this, 8), 0.0f, 4);
                DialogActionButtonLayout dialogActionButtonLayout = this.RG6kpfv3v;
                int i2 = 0;
                if (dialogActionButtonLayout == null || !dialogActionButtonLayout.getStackButtons$core()) {
                    DialogActionButtonLayout dialogActionButtonLayout2 = this.RG6kpfv3v;
                    if (dialogActionButtonLayout2 != null) {
                        DialogActionButton[] visibleButtons = dialogActionButtonLayout2.getVisibleButtons();
                        int length = visibleButtons.length;
                        while (i2 < length) {
                            DialogActionButton dialogActionButton = visibleButtons[i2];
                            DialogActionButtonLayout dialogActionButtonLayout3 = this.RG6kpfv3v;
                            if (dialogActionButtonLayout3 != null) {
                                float kCA6Zs9sL = pA5wCkne4.kCA6Zs9sL(this, 8) + ((float) dialogActionButtonLayout3.getTop()) + ((float) dialogActionButton.getTop());
                                DialogActionButtonLayout dialogActionButtonLayout4 = this.RG6kpfv3v;
                                if (dialogActionButtonLayout4 != null) {
                                    canvas.drawRect(pA5wCkne4.kCA6Zs9sL(this, 4) + ((float) dialogActionButton.getLeft()), kCA6Zs9sL, ((float) dialogActionButton.getRight()) - pA5wCkne4.kCA6Zs9sL(this, 4), ((float) dialogActionButtonLayout4.getBottom()) - pA5wCkne4.kCA6Zs9sL(this, 8), J4Ux7ym32(-16711681, 0.4f));
                                    i2++;
                                } else {
                                    anXlDk6fV.cAwN510t2();
                                    throw null;
                                }
                            } else {
                                anXlDk6fV.cAwN510t2();
                                throw null;
                            }
                        }
                        DialogActionButtonLayout dialogActionButtonLayout5 = this.RG6kpfv3v;
                        if (dialogActionButtonLayout5 != null) {
                            q3BipwRCk(this, canvas, -65281, (float) dialogActionButtonLayout5.getTop(), 0.0f, 4);
                            float measuredHeight = ((float) getMeasuredHeight()) - (pA5wCkne4.kCA6Zs9sL(this, 52) - pA5wCkne4.kCA6Zs9sL(this, 8));
                            q3BipwRCk(this, canvas, -65536, measuredHeight, 0.0f, 4);
                            q3BipwRCk(this, canvas, -65536, ((float) getMeasuredHeight()) - pA5wCkne4.kCA6Zs9sL(this, 8), 0.0f, 4);
                            i = -16776961;
                            f = measuredHeight - pA5wCkne4.kCA6Zs9sL(this, 8);
                        } else {
                            anXlDk6fV.cAwN510t2();
                            throw null;
                        }
                    } else {
                        return;
                    }
                } else {
                    DialogActionButtonLayout dialogActionButtonLayout6 = this.RG6kpfv3v;
                    if (dialogActionButtonLayout6 != null) {
                        float kCA6Zs9sL2 = pA5wCkne4.kCA6Zs9sL(this, 8) + ((float) dialogActionButtonLayout6.getTop());
                        DialogActionButtonLayout dialogActionButtonLayout7 = this.RG6kpfv3v;
                        if (dialogActionButtonLayout7 != null) {
                            DialogActionButton[] visibleButtons2 = dialogActionButtonLayout7.getVisibleButtons();
                            int length2 = visibleButtons2.length;
                            while (i2 < length2) {
                                DialogActionButton dialogActionButton2 = visibleButtons2[i2];
                                float kCA6Zs9sL3 = pA5wCkne4.kCA6Zs9sL(this, 36) + kCA6Zs9sL2;
                                canvas.drawRect((float) dialogActionButton2.getLeft(), kCA6Zs9sL2, ((float) getMeasuredWidth()) - pA5wCkne4.kCA6Zs9sL(this, 8), kCA6Zs9sL3, J4Ux7ym32(-16711681, 0.4f));
                                kCA6Zs9sL2 = pA5wCkne4.kCA6Zs9sL(this, 16) + kCA6Zs9sL3;
                                i2++;
                            }
                            DialogActionButtonLayout dialogActionButtonLayout8 = this.RG6kpfv3v;
                            if (dialogActionButtonLayout8 != null) {
                                q3BipwRCk(this, canvas, -16776961, (float) dialogActionButtonLayout8.getTop(), 0.0f, 4);
                                DialogActionButtonLayout dialogActionButtonLayout9 = this.RG6kpfv3v;
                                if (dialogActionButtonLayout9 != null) {
                                    float kCA6Zs9sL4 = pA5wCkne4.kCA6Zs9sL(this, 8) + ((float) dialogActionButtonLayout9.getTop());
                                    f = ((float) getMeasuredHeight()) - pA5wCkne4.kCA6Zs9sL(this, 8);
                                    i = -65536;
                                    q3BipwRCk(this, canvas, -65536, kCA6Zs9sL4, 0.0f, 4);
                                } else {
                                    anXlDk6fV.cAwN510t2();
                                    throw null;
                                }
                            } else {
                                anXlDk6fV.cAwN510t2();
                                throw null;
                            }
                        } else {
                            anXlDk6fV.cAwN510t2();
                            throw null;
                        }
                    } else {
                        anXlDk6fV.cAwN510t2();
                        throw null;
                    }
                }
                q3BipwRCk(this, canvas, i, f, 0.0f, 4);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.Eeka1udhb = (DialogTitleLayout) findViewById(R.id.md_title_layout);
        this.dXrmkklc8 = (DialogContentLayout) findViewById(R.id.md_content_layout);
        this.RG6kpfv3v = (DialogActionButtonLayout) findViewById(R.id.md_button_layout);
    }

    @Override // android.widget.FrameLayout, android.view.View, android.view.ViewGroup
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = this.Eeka1udhb.getMeasuredHeight();
        this.Eeka1udhb.layout(0, 0, measuredWidth, measuredHeight);
        if (this.sk5s77z6Q) {
            int measuredHeight2 = getMeasuredHeight();
            DialogActionButtonLayout dialogActionButtonLayout = this.RG6kpfv3v;
            i5 = measuredHeight2 - (dialogActionButtonLayout != null ? dialogActionButtonLayout.getMeasuredHeight() : 0);
            if (pA5wCkne4.iMyQMM6Qj(this.RG6kpfv3v)) {
                int measuredWidth2 = getMeasuredWidth();
                int measuredHeight3 = getMeasuredHeight();
                DialogActionButtonLayout dialogActionButtonLayout2 = this.RG6kpfv3v;
                if (dialogActionButtonLayout2 != null) {
                    dialogActionButtonLayout2.layout(0, i5, measuredWidth2, measuredHeight3);
                } else {
                    anXlDk6fV.cAwN510t2();
                    throw null;
                }
            }
        } else {
            i5 = getMeasuredHeight();
        }
        this.dXrmkklc8.layout(0, measuredHeight, getMeasuredWidth(), i5);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.CBQ5d1kRq;
        if (1 <= i3 && size2 > i3) {
            size2 = i3;
        }
        boolean z = false;
        this.Eeka1udhb.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        if (pA5wCkne4.iMyQMM6Qj(this.RG6kpfv3v)) {
            DialogActionButtonLayout dialogActionButtonLayout = this.RG6kpfv3v;
            if (dialogActionButtonLayout != null) {
                dialogActionButtonLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            } else {
                anXlDk6fV.cAwN510t2();
                throw null;
            }
        }
        int measuredHeight = this.Eeka1udhb.getMeasuredHeight();
        DialogActionButtonLayout dialogActionButtonLayout2 = this.RG6kpfv3v;
        this.dXrmkklc8.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2 - (measuredHeight + (dialogActionButtonLayout2 != null ? dialogActionButtonLayout2.getMeasuredHeight() : 0)), Integer.MIN_VALUE));
        if (this.ixWaw2akD == ZaxjSdKpQ.WRAP_CONTENT) {
            int measuredHeight2 = this.dXrmkklc8.getMeasuredHeight() + this.Eeka1udhb.getMeasuredHeight();
            DialogActionButtonLayout dialogActionButtonLayout3 = this.RG6kpfv3v;
            setMeasuredDimension(size, measuredHeight2 + (dialogActionButtonLayout3 != null ? dialogActionButtonLayout3.getMeasuredHeight() : 0));
        } else {
            setMeasuredDimension(size, this.WaUP0CF08);
        }
        if (this.Bhmn1KIah.length == 0) {
            z = true;
        }
        if (!z) {
            RectF rectF = this.dfpT1j18n;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            rectF.right = (float) getMeasuredWidth();
            rectF.bottom = (float) getMeasuredHeight();
            this.i8XZMQc6Z.addRoundRect(this.dfpT1j18n, this.Bhmn1KIah, Path.Direction.CW);
        }
    }

    public final void setButtonsLayout(DialogActionButtonLayout dialogActionButtonLayout) {
        this.RG6kpfv3v = dialogActionButtonLayout;
    }

    public final void setContentLayout(DialogContentLayout dialogContentLayout) {
        this.dXrmkklc8 = dialogContentLayout;
    }

    public final void setCornerRadii(float[] fArr) {
        this.Bhmn1KIah = fArr;
        if (!this.i8XZMQc6Z.isEmpty()) {
            this.i8XZMQc6Z.reset();
        }
        invalidate();
    }

    public final void setDebugMode(boolean z) {
        this.kmSgne1rO = z;
        setWillNotDraw(!z);
    }

    public final void setDialog(WQpIMzWun wQpIMzWun) {
        this.qVUwofr5s = wQpIMzWun;
    }

    public final void setLayoutMode(ZaxjSdKpQ zaxjSdKpQ) {
        this.ixWaw2akD = zaxjSdKpQ;
    }

    public final void setMaxHeight(int i) {
        this.CBQ5d1kRq = i;
    }

    public final void setTitleLayout(DialogTitleLayout dialogTitleLayout) {
        this.Eeka1udhb = dialogTitleLayout;
    }
}
