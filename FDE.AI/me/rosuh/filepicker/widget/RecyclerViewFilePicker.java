package me.rosuh.filepicker.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import con.anXlDk6fV;
import con.llWJsfBCK;
import con.n7frFZomx;
import con.nwvyEZJPU;
import java.util.Objects;
/* loaded from: classes.dex */
public final class RecyclerViewFilePicker extends RecyclerView {
    public View XGA7b0zuB;
    public final llWJsfBCK Xeg1rC5FI = anXlDk6fV.ixWaw2akD(new nwvyEZJPU(this));

    public RecyclerViewFilePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final n7frFZomx getAdapterDataObserver() {
        return (n7frFZomx) this.Xeg1rC5FI.getValue();
    }

    public final View getEmptyView() {
        return this.XGA7b0zuB;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.s7MlVynBG s7mlvynbg) {
        super.setAdapter(s7mlvynbg);
        if (s7mlvynbg != null) {
            s7mlvynbg.q3BipwRCk.registerObserver(getAdapterDataObserver());
        }
        getAdapterDataObserver().q3BipwRCk();
    }

    public final void setEmptyView(View view) {
        this.XGA7b0zuB = view;
        View rootView = getRootView();
        Objects.requireNonNull(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) rootView).addView(view);
        View view2 = this.XGA7b0zuB;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }
}
