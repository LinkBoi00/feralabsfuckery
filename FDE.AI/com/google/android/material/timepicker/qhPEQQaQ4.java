package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.Objects;
/* loaded from: classes.dex */
public class qhPEQQaQ4 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ TimePickerView q3BipwRCk;

    public qhPEQQaQ4(TimePickerView timePickerView) {
        this.q3BipwRCk = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        TimePickerView timePickerView = this.q3BipwRCk;
        int i = TimePickerView.vNtjxmzUM;
        Objects.requireNonNull(timePickerView);
        return false;
    }
}
