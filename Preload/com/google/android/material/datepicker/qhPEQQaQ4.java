package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.feravolt.preload.R;
import con.IuQbWntsc;
import con.tkhJyvA4F;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class qhPEQQaQ4 extends RecyclerView.cywn6086a {
    public final TextView RG6kpfv3v;
    public final MaterialCalendarGridView ixWaw2akD;

    public qhPEQQaQ4(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.RG6kpfv3v = textView;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        new tkhJyvA4F(R.id.tag_accessibility_heading, Boolean.class, 28).kCA6Zs9sL(textView, Boolean.TRUE);
        this.ixWaw2akD = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z) {
            textView.setVisibility(8);
        }
    }
}
