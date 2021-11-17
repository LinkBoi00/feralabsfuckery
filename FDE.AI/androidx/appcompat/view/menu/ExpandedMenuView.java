package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.RG2GI7LDp;
import con.C8A1BseZU;
import con.tDC1iJlG1;
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements RG2GI7LDp.mhl5lIdbQ, mhl5lIdbQ, AdapterView.OnItemClickListener {
    public static final int[] kmSgne1rO = {16842964, 16843049};
    public RG2GI7LDp CBQ5d1kRq;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int resourceId;
        int resourceId2;
        setOnItemClickListener(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kmSgne1rO, 16842868, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            setBackgroundDrawable((!obtainStyledAttributes.hasValue(0) || (resourceId2 = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : C8A1BseZU.q3BipwRCk(context, resourceId2));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            setDivider((!obtainStyledAttributes.hasValue(1) || (resourceId = obtainStyledAttributes.getResourceId(1, 0)) == 0) ? obtainStyledAttributes.getDrawable(1) : C8A1BseZU.q3BipwRCk(context, resourceId));
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.appcompat.view.menu.RG2GI7LDp.mhl5lIdbQ
    public boolean J4Ux7ym32(tDC1iJlG1 tdc1ijlg1) {
        return this.CBQ5d1kRq.qVUwofr5s(tdc1ijlg1, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View, android.widget.AdapterView
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        J4Ux7ym32((tDC1iJlG1) getAdapter().getItem(i));
    }

    @Override // androidx.appcompat.view.menu.mhl5lIdbQ
    public void q3BipwRCk(RG2GI7LDp rG2GI7LDp) {
        this.CBQ5d1kRq = rG2GI7LDp;
    }
}
