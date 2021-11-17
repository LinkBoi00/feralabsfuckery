package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.RG2GI7LDp;
import com.feravolt.preload.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import con.IuQbWntsc;
import con.RBJDIwG1D;
import con.mN6fklC4R;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int vNtjxmzUM;
    public final Chip AqaWJg0b4;
    public final View.OnClickListener NyWTwPF6V;
    public final MaterialButtonToggleGroup mUqPm6GBh;
    public final Chip nlGCs0NZs;

    /* loaded from: classes.dex */
    public class RG2GI7LDp implements View.OnClickListener {
        public RG2GI7LDp() {
            TimePickerView.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TimePickerView timePickerView = TimePickerView.this;
            int i = TimePickerView.vNtjxmzUM;
            Objects.requireNonNull(timePickerView);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        RG2GI7LDp rG2GI7LDp = new RG2GI7LDp();
        this.NyWTwPF6V = rG2GI7LDp;
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.mUqPm6GBh = materialButtonToggleGroup;
        materialButtonToggleGroup.PSTqBLTET.add(new aXI58Y1kr(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        this.nlGCs0NZs = chip;
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.AqaWJg0b4 = chip2;
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        mN6fklC4R.iiGwOFFnr(chip, 2);
        mN6fklC4R.iiGwOFFnr(chip2, 2);
        s7MlVynBG s7mlvynbg = new s7MlVynBG(this, new GestureDetector(getContext(), new qhPEQQaQ4(this)));
        chip.setOnTouchListener(s7mlvynbg);
        chip2.setOnTouchListener(s7mlvynbg);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(rG2GI7LDp);
        chip2.setOnClickListener(rG2GI7LDp);
    }

    public final void PSTqBLTET() {
        RG2GI7LDp.C0003RG2GI7LDp rG2GI7LDp;
        if (this.mUqPm6GBh.getVisibility() == 0) {
            androidx.constraintlayout.widget.RG2GI7LDp rG2GI7LDp2 = new androidx.constraintlayout.widget.RG2GI7LDp();
            rG2GI7LDp2.J4Ux7ym32(this);
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            char c = RBJDIwG1D.dIocxURUo(this) == 0 ? (char) 2 : 1;
            if (rG2GI7LDp2.tGV7Q6urW.containsKey(Integer.valueOf((int) R.id.material_clock_display)) && (rG2GI7LDp = (RG2GI7LDp.C0003RG2GI7LDp) rG2GI7LDp2.tGV7Q6urW.get(Integer.valueOf((int) R.id.material_clock_display))) != null) {
                switch (c) {
                    case 1:
                        RG2GI7LDp.mhl5lIdbQ mhl5lidbq = rG2GI7LDp.dIocxURUo;
                        mhl5lidbq.yWvV4ePLl = -1;
                        mhl5lidbq.Puu3Rhg4F = -1;
                        mhl5lidbq.nlGCs0NZs = -1;
                        mhl5lidbq.V9LQMKGJe = Integer.MIN_VALUE;
                        break;
                    case 2:
                        RG2GI7LDp.mhl5lIdbQ mhl5lidbq2 = rG2GI7LDp.dIocxURUo;
                        mhl5lidbq2.vPSbyrYWX = -1;
                        mhl5lidbq2.oon79WMrY = -1;
                        mhl5lidbq2.AqaWJg0b4 = -1;
                        mhl5lidbq2.igRQEZxnW = Integer.MIN_VALUE;
                        break;
                    case 3:
                        RG2GI7LDp.mhl5lIdbQ mhl5lidbq3 = rG2GI7LDp.dIocxURUo;
                        mhl5lidbq3.kmSgne1rO = -1;
                        mhl5lidbq3.CBQ5d1kRq = -1;
                        mhl5lidbq3.mUqPm6GBh = 0;
                        mhl5lidbq3.QNqj6nIzv = Integer.MIN_VALUE;
                        break;
                    case 4:
                        RG2GI7LDp.mhl5lIdbQ mhl5lidbq4 = rG2GI7LDp.dIocxURUo;
                        mhl5lidbq4.Bhmn1KIah = -1;
                        mhl5lidbq4.PSTqBLTET = -1;
                        mhl5lidbq4.NyWTwPF6V = 0;
                        mhl5lidbq4.EBQXiIPmm = Integer.MIN_VALUE;
                        break;
                    case 5:
                        RG2GI7LDp.mhl5lIdbQ mhl5lidbq5 = rG2GI7LDp.dIocxURUo;
                        mhl5lidbq5.MzoOEjc4X = -1;
                        mhl5lidbq5.ilHKhw3Yw = -1;
                        mhl5lidbq5.qVUwofr5s = -1;
                        mhl5lidbq5.o4LF8RkoQ = 0;
                        mhl5lidbq5.j22ftfeNI = Integer.MIN_VALUE;
                        break;
                    case 6:
                        RG2GI7LDp.mhl5lIdbQ mhl5lidbq6 = rG2GI7LDp.dIocxURUo;
                        mhl5lidbq6.Eeka1udhb = -1;
                        mhl5lidbq6.dXrmkklc8 = -1;
                        mhl5lidbq6.i0Zug1mVk = 0;
                        mhl5lidbq6.juJ6pnCpu = Integer.MIN_VALUE;
                        break;
                    case 7:
                        RG2GI7LDp.mhl5lIdbQ mhl5lidbq7 = rG2GI7LDp.dIocxURUo;
                        mhl5lidbq7.RG6kpfv3v = -1;
                        mhl5lidbq7.ixWaw2akD = -1;
                        mhl5lidbq7.vNtjxmzUM = 0;
                        mhl5lidbq7.TyB1UUd72 = Integer.MIN_VALUE;
                        break;
                    case '\b':
                        RG2GI7LDp.mhl5lIdbQ mhl5lidbq8 = rG2GI7LDp.dIocxURUo;
                        mhl5lidbq8.cAwN510t2 = -1.0f;
                        mhl5lidbq8.iMyQMM6Qj = -1;
                        mhl5lidbq8.dfpT1j18n = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            rG2GI7LDp2.q3BipwRCk(this, true);
            setConstraintSet(null);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        PSTqBLTET();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            PSTqBLTET();
        }
    }
}
