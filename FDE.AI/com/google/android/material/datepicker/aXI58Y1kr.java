package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import con.N6L1mvree;
import con.fUfhthdYl;
import con.gBRio1gPW;
import java.util.Iterator;
/* loaded from: classes.dex */
public class aXI58Y1kr implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView CBQ5d1kRq;
    public final /* synthetic */ s7MlVynBG kmSgne1rO;

    public aXI58Y1kr(s7MlVynBG s7mlvynbg, MaterialCalendarGridView materialCalendarGridView) {
        this.kmSgne1rO = s7mlvynbg;
        this.CBQ5d1kRq = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        mhl5lIdbQ q3BipwRCk = this.CBQ5d1kRq.getAdapter();
        boolean z = true;
        if (i >= q3BipwRCk.J4Ux7ym32() && i <= q3BipwRCk.dIocxURUo()) {
            gBRio1gPW.s7MlVynBG s7mlvynbg = this.kmSgne1rO.GPLPRo6go;
            long longValue = this.CBQ5d1kRq.getAdapter().getItem(i).longValue();
            gBRio1gPW.qhPEQQaQ4 qhpeqqaq4 = (gBRio1gPW.qhPEQQaQ4) s7mlvynbg;
            gBRio1gPW gbrio1gpw = gBRio1gPW.this;
            if (longValue < ((N6L1mvree) gbrio1gpw.INnK5Rew6.Bhmn1KIah).CBQ5d1kRq) {
                z = false;
            }
            if (z) {
                gbrio1gpw.KBYw84i3W.yWvV4ePLl(longValue);
                Iterator it = gBRio1gPW.this.XYT7vJqNO.iterator();
                while (it.hasNext()) {
                    ((fUfhthdYl) it.next()).q3BipwRCk(gBRio1gPW.this.KBYw84i3W.q3BipwRCk());
                }
                gBRio1gPW.this.R2hkbNqWf.getAdapter().q3BipwRCk.J4Ux7ym32();
                RecyclerView recyclerView = gBRio1gPW.this.M66hQ219i;
                if (recyclerView != null) {
                    recyclerView.getAdapter().q3BipwRCk.J4Ux7ym32();
                }
            }
        }
    }
}
