package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.feravolt.preload.R;
import con.IuQbWntsc;
import con.RisoK3egD;
import con.VCCyeOu6I;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class ClockHandView extends View {
    public static final /* synthetic */ int dfpT1j18n;
    public float Bhmn1KIah;
    public ValueAnimator CBQ5d1kRq;
    public final Paint Eeka1udhb;
    public int PSTqBLTET;
    public final int RG6kpfv3v;
    public double WaUP0CF08;
    public int i8XZMQc6Z;
    public final int ilHKhw3Yw;
    public float ixWaw2akD;
    public float kmSgne1rO;
    public final float qVUwofr5s;
    public boolean sk5s77z6Q;
    public final List MzoOEjc4X = new ArrayList();
    public final RectF dXrmkklc8 = new RectF();

    /* loaded from: classes.dex */
    public class RG2GI7LDp implements ValueAnimator.AnimatorUpdateListener {
        public RG2GI7LDp() {
            ClockHandView.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ClockHandView clockHandView = ClockHandView.this;
            int i = ClockHandView.dfpT1j18n;
            clockHandView.tGV7Q6urW(floatValue, true);
        }
    }

    /* loaded from: classes.dex */
    public interface aXI58Y1kr {
    }

    /* loaded from: classes.dex */
    public class mhl5lIdbQ extends AnimatorListenerAdapter {
        public mhl5lIdbQ(ClockHandView clockHandView) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        Paint paint = new Paint();
        this.Eeka1udhb = paint;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RisoK3egD.kCA6Zs9sL, R.attr.materialClockStyle, 2131821607);
        this.i8XZMQc6Z = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.ilHKhw3Yw = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.RG6kpfv3v = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.qVUwofr5s = (float) resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        J4Ux7ym32(0.0f, false);
        this.PSTqBLTET = ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        VCCyeOu6I.Eeka1udhb(this, 2);
        obtainStyledAttributes.recycle();
    }

    public void J4Ux7ym32(float f, boolean z) {
        ValueAnimator valueAnimator = this.CBQ5d1kRq;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            tGV7Q6urW(f, false);
            return;
        }
        float f2 = this.ixWaw2akD;
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f2), Float.valueOf(f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        this.CBQ5d1kRq = ofFloat;
        ofFloat.setDuration(200L);
        this.CBQ5d1kRq.addUpdateListener(new RG2GI7LDp());
        this.CBQ5d1kRq.addListener(new mhl5lIdbQ(this));
        this.CBQ5d1kRq.start();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = (float) width;
        float f2 = (float) height;
        this.Eeka1udhb.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) this.i8XZMQc6Z) * ((float) Math.cos(this.WaUP0CF08))) + f, (((float) this.i8XZMQc6Z) * ((float) Math.sin(this.WaUP0CF08))) + f2, (float) this.ilHKhw3Yw, this.Eeka1udhb);
        double sin = Math.sin(this.WaUP0CF08);
        double cos = Math.cos(this.WaUP0CF08);
        double d = (double) ((float) (this.i8XZMQc6Z - this.ilHKhw3Yw));
        this.Eeka1udhb.setStrokeWidth((float) this.RG6kpfv3v);
        canvas.drawLine(f, f2, (float) (width + ((int) (cos * d))), (float) (height + ((int) (d * sin))), this.Eeka1udhb);
        canvas.drawCircle(f, f2, this.qVUwofr5s, this.Eeka1udhb);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        J4Ux7ym32(this.ixWaw2akD, false);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.kmSgne1rO = x;
            this.Bhmn1KIah = y;
            this.sk5s77z6Q = false;
            z2 = false;
            z = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.sk5s77z6Q;
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.sk5s77z6Q;
        float q3BipwRCk = (float) q3BipwRCk(x, y);
        boolean z5 = this.ixWaw2akD != q3BipwRCk;
        if (!z || !z5) {
            if (z5 || z2) {
                J4Ux7ym32(q3BipwRCk, false);
            }
            this.sk5s77z6Q = z4 | z3;
            return true;
        }
        z3 = true;
        this.sk5s77z6Q = z4 | z3;
        return true;
    }

    public final int q3BipwRCk(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (f2 - ((float) (getHeight() / 2))), (double) (f - ((float) (getWidth() / 2)))))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    public final void tGV7Q6urW(float f, boolean z) {
        float f2 = f % 360.0f;
        this.ixWaw2akD = f2;
        this.WaUP0CF08 = Math.toRadians((double) (f2 - 90.0f));
        float cos = (((float) this.i8XZMQc6Z) * ((float) Math.cos(this.WaUP0CF08))) + ((float) (getWidth() / 2));
        float sin = (((float) this.i8XZMQc6Z) * ((float) Math.sin(this.WaUP0CF08))) + ((float) (getHeight() / 2));
        RectF rectF = this.dXrmkklc8;
        int i = this.ilHKhw3Yw;
        rectF.set(cos - ((float) i), sin - ((float) i), cos + ((float) i), sin + ((float) i));
        for (aXI58Y1kr axi58y1kr : this.MzoOEjc4X) {
            ClockFaceView clockFaceView = (ClockFaceView) axi58y1kr;
            if (Math.abs(clockFaceView.L4EwGfXiQ - f2) > 0.001f) {
                clockFaceView.L4EwGfXiQ = f2;
                clockFaceView.MzoOEjc4X();
            }
        }
        invalidate();
    }
}
