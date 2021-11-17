package com.google.android.material.timepicker;

import android.view.View;
import com.feravolt.preload.R;
import con.IqwHQ6O2l;
import con.XflkRyC2J;
/* loaded from: classes.dex */
public class mhl5lIdbQ extends XflkRyC2J {
    public final /* synthetic */ ClockFaceView dIocxURUo;

    public mhl5lIdbQ(ClockFaceView clockFaceView) {
        this.dIocxURUo = clockFaceView;
    }

    @Override // con.XflkRyC2J
    public void dIocxURUo(View view, IqwHQ6O2l iqwHQ6O2l) {
        this.q3BipwRCk.onInitializeAccessibilityNodeInfo(view, iqwHQ6O2l.q3BipwRCk);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            iqwHQ6O2l.q3BipwRCk.setTraversalAfter((View) this.dIocxURUo.o4LF8RkoQ.get(intValue - 1));
        }
        iqwHQ6O2l.PSTqBLTET(IqwHQ6O2l.aXI58Y1kr.q3BipwRCk(0, 1, intValue, 1, false, view.isSelected()));
    }
}
