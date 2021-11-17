package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.feravolt.preload.R;
import com.google.android.material.timepicker.ClockHandView;
import con.C8A1BseZU;
import con.IqwHQ6O2l;
import con.IuQbWntsc;
import con.RisoK3egD;
import con.UZwL3ezpe;
import con.XflkRyC2J;
import con.anXlDk6fV;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockFaceView extends UZwL3ezpe implements ClockHandView.aXI58Y1kr {
    public final int EBQXiIPmm;
    public float L4EwGfXiQ;
    public final ClockHandView NyWTwPF6V;
    public final int[] QNqj6nIzv;
    public String[] QSbMsHU5X;
    public final int TyB1UUd72;
    public final XflkRyC2J V9LQMKGJe;
    public final int j22ftfeNI;
    public final int juJ6pnCpu;
    public final SparseArray o4LF8RkoQ;
    public final ColorStateList zHl31GGXU;
    public final Rect vNtjxmzUM = new Rect();
    public final RectF i0Zug1mVk = new RectF();
    public final float[] igRQEZxnW = {0.0f, 0.9f, 1.0f};

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        SparseArray sparseArray = new SparseArray();
        this.o4LF8RkoQ = sparseArray;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, RisoK3egD.dIocxURUo, R.attr.materialClockStyle, 2131821607);
        Resources resources = getResources();
        ColorStateList Bhmn1KIah = anXlDk6fV.Bhmn1KIah(context, obtainStyledAttributes, 1);
        this.zHl31GGXU = Bhmn1KIah;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.NyWTwPF6V = clockHandView;
        this.EBQXiIPmm = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = Bhmn1KIah.getColorForState(new int[]{16842913}, Bhmn1KIah.getDefaultColor());
        this.QNqj6nIzv = new int[]{colorForState, colorForState, Bhmn1KIah.getDefaultColor()};
        clockHandView.MzoOEjc4X.add(this);
        ThreadLocal threadLocal = C8A1BseZU.q3BipwRCk;
        int defaultColor = context.getColorStateList(R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList Bhmn1KIah2 = anXlDk6fV.Bhmn1KIah(context, obtainStyledAttributes, 0);
        setBackgroundColor(Bhmn1KIah2 != null ? Bhmn1KIah2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new RG2GI7LDp(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.V9LQMKGJe = new mhl5lIdbQ(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.QSbMsHU5X = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i = 0; i < Math.max(this.QSbMsHU5X.length, size); i++) {
            TextView textView = (TextView) this.o4LF8RkoQ.get(i);
            if (i >= this.QSbMsHU5X.length) {
                removeView(textView);
                this.o4LF8RkoQ.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    this.o4LF8RkoQ.put(i, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.QSbMsHU5X[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                IuQbWntsc.MzoOEjc4X(textView, this.V9LQMKGJe);
                textView.setTextColor(this.zHl31GGXU);
            }
        }
        this.TyB1UUd72 = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.juJ6pnCpu = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.j22ftfeNI = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    public final void MzoOEjc4X() {
        RectF rectF = this.NyWTwPF6V.dXrmkklc8;
        for (int i = 0; i < this.o4LF8RkoQ.size(); i++) {
            TextView textView = (TextView) this.o4LF8RkoQ.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.vNtjxmzUM);
                this.vNtjxmzUM.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.vNtjxmzUM);
                this.i0Zug1mVk.set(this.vNtjxmzUM);
                textView.getPaint().setShader(!RectF.intersects(rectF, this.i0Zug1mVk) ? null : new RadialGradient(rectF.centerX() - this.i0Zug1mVk.left, rectF.centerY() - this.i0Zug1mVk.top, 0.5f * rectF.width(), this.QNqj6nIzv, this.igRQEZxnW, Shader.TileMode.CLAMP));
                textView.invalidate();
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) IqwHQ6O2l.mhl5lIdbQ.q3BipwRCk(1, this.QSbMsHU5X.length, false, 1).q3BipwRCk);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        MzoOEjc4X();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (((float) this.j22ftfeNI) / Math.max(Math.max(((float) this.TyB1UUd72) / ((float) displayMetrics.heightPixels), ((float) this.juJ6pnCpu) / ((float) displayMetrics.widthPixels)), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
