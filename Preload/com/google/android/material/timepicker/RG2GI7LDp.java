package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;
/* loaded from: classes.dex */
public class RG2GI7LDp implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView CBQ5d1kRq;

    public RG2GI7LDp(ClockFaceView clockFaceView) {
        this.CBQ5d1kRq = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        if (!this.CBQ5d1kRq.isShown()) {
            return true;
        }
        this.CBQ5d1kRq.getViewTreeObserver().removeOnPreDrawListener(this);
        ClockFaceView clockFaceView = this.CBQ5d1kRq;
        int height = ((this.CBQ5d1kRq.getHeight() / 2) - clockFaceView.NyWTwPF6V.ilHKhw3Yw) - clockFaceView.EBQXiIPmm;
        if (height != clockFaceView.AqaWJg0b4) {
            clockFaceView.AqaWJg0b4 = height;
            clockFaceView.PSTqBLTET();
            ClockHandView clockHandView = clockFaceView.NyWTwPF6V;
            clockHandView.i8XZMQc6Z = clockFaceView.AqaWJg0b4;
            clockHandView.invalidate();
        }
        return true;
    }
}
