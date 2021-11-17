package com.afollestad.materialdialogs.internal.list;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import con.PmanMZxiM;
import con.Wk9bO57s4;
import con.anXlDk6fV;
import con.nEBNqwNJt;
/* loaded from: classes.dex */
public final class DialogRecyclerView extends RecyclerView {
    public final mhl5lIdbQ XGA7b0zuB = new mhl5lIdbQ();

    /* loaded from: classes.dex */
    public static final class RG2GI7LDp extends Wk9bO57s4 implements PmanMZxiM {
        public static final RG2GI7LDp kmSgne1rO = new RG2GI7LDp();

        public RG2GI7LDp() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
            if ((r4.YmNRDyka4() && r4.ShSN9wbzk()) != false) goto L_0x0025;
         */
        @Override // con.PmanMZxiM
        /* Code decompiled incorrectly, please refer to instructions dump */
        public java.lang.Object IytU16YUK(java.lang.Object r4) {
            /*
                r3 = this;
                com.afollestad.materialdialogs.internal.list.DialogRecyclerView r4 = (com.afollestad.materialdialogs.internal.list.DialogRecyclerView) r4
                r4.oesmsHQJU()
                int r0 = r4.getChildCount()
                r1 = 1
                r2 = 2
                if (r0 == 0) goto L_0x0025
                int r0 = r4.getMeasuredHeight()
                if (r0 != 0) goto L_0x0014
                goto L_0x0025
            L_0x0014:
                boolean r0 = r4.YmNRDyka4()
                if (r0 == 0) goto L_0x0022
                boolean r0 = r4.ShSN9wbzk()
                if (r0 == 0) goto L_0x0022
                r0 = r1
                goto L_0x0023
            L_0x0022:
                r0 = 0
            L_0x0023:
                if (r0 == 0) goto L_0x0026
            L_0x0025:
                r1 = r2
            L_0x0026:
                r4.setOverScrollMode(r1)
                con.qih4lW99W r4 = con.qih4lW99W.q3BipwRCk
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.afollestad.materialdialogs.internal.list.DialogRecyclerView.RG2GI7LDp.IytU16YUK(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes.dex */
    public static final class mhl5lIdbQ extends RecyclerView.wnbPPCp4x {
        public mhl5lIdbQ() {
            DialogRecyclerView.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.wnbPPCp4x
        public void J4Ux7ym32(RecyclerView recyclerView, int i, int i2) {
            DialogRecyclerView.this.oesmsHQJU();
        }
    }

    public DialogRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean ShSN9wbzk() {
        RecyclerView.LULQkQlc9 layoutManager = getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).DEe4ujgEA() == 0) {
                return true;
            }
        } else if ((layoutManager instanceof GridLayoutManager) && ((GridLayoutManager) layoutManager).DEe4ujgEA() == 0) {
            return true;
        }
        return false;
    }

    public final boolean YmNRDyka4() {
        RecyclerView.s7MlVynBG adapter = getAdapter();
        if (adapter != null) {
            int q3BipwRCk = adapter.q3BipwRCk() - 1;
            RecyclerView.LULQkQlc9 layoutManager = getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                if (((LinearLayoutManager) layoutManager).r2IGhIWDk() == q3BipwRCk) {
                    return true;
                }
            } else if ((layoutManager instanceof GridLayoutManager) && ((GridLayoutManager) layoutManager).r2IGhIWDk() == q3BipwRCk) {
                return true;
            }
            return false;
        }
        anXlDk6fV.cAwN510t2();
        throw null;
    }

    public final void oesmsHQJU() {
        if (getChildCount() != 0) {
            getMeasuredHeight();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        RG2GI7LDp rG2GI7LDp = RG2GI7LDp.kmSgne1rO;
        if (getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0) {
            getViewTreeObserver().addOnGlobalLayoutListener(new nEBNqwNJt(this, rG2GI7LDp, 1));
        } else {
            rG2GI7LDp.IytU16YUK(this);
        }
        Puu3Rhg4F(this.XGA7b0zuB);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        DuuXfa7LE(this.XGA7b0zuB);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        oesmsHQJU();
    }
}
