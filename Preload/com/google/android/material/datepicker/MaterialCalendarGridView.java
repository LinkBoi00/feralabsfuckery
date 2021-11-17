package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.feravolt.preload.R;
import con.AepEH275c;
import con.IuQbWntsc;
import con.K6PL0z3I0;
import con.YRza28WC3;
import con.wROT9IZc9;
import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes.dex */
public final class MaterialCalendarGridView extends GridView {
    public final boolean CBQ5d1kRq;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AepEH275c.kCA6Zs9sL();
        if (YRza28WC3.M66hQ219i(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.CBQ5d1kRq = YRza28WC3.R2hkbNqWf(getContext(), R.attr.nestedScrollable);
        IuQbWntsc.MzoOEjc4X(this, new RG2GI7LDp(this));
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mhl5lIdbQ q3BipwRCk = getAdapter();
        wROT9IZc9 wrot9izc9 = q3BipwRCk.kmSgne1rO;
        int max = Math.max(q3BipwRCk.J4Ux7ym32(), getFirstVisiblePosition());
        int min = Math.min(q3BipwRCk.dIocxURUo(), getLastVisiblePosition());
        q3BipwRCk.getItem(max);
        q3BipwRCk.getItem(min);
        Iterator it = wrot9izc9.kCA6Zs9sL().iterator();
        if (it.hasNext()) {
            K6PL0z3I0.q3BipwRCk(it.next());
            Objects.requireNonNull(null);
            throw null;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        int i2;
        if (z) {
            if (i == 33) {
                i2 = getAdapter().dIocxURUo();
            } else if (i == 130) {
                i2 = getAdapter().J4Ux7ym32();
            } else {
                super.onFocusChanged(true, i, rect);
                return;
            }
            setSelection(i2);
            return;
        }
        super.onFocusChanged(false, i, rect);
    }

    @Override // android.widget.GridView, android.view.KeyEvent.Callback, android.widget.AbsListView, android.view.View
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().J4Ux7ym32()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().J4Ux7ym32());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.CBQ5d1kRq) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: q3BipwRCk */
    public mhl5lIdbQ getAdapter() {
        return (mhl5lIdbQ) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AbsListView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof mhl5lIdbQ) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), mhl5lIdbQ.class.getCanonicalName()));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter().J4Ux7ym32()) {
            i = getAdapter().J4Ux7ym32();
        }
        super.setSelection(i);
    }
}
