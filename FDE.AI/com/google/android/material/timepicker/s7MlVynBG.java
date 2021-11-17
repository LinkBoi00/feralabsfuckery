package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
/* loaded from: classes.dex */
public class s7MlVynBG implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector CBQ5d1kRq;

    public s7MlVynBG(TimePickerView timePickerView, GestureDetector gestureDetector) {
        this.CBQ5d1kRq = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.CBQ5d1kRq.onTouchEvent(motionEvent);
        }
        return false;
    }
}
