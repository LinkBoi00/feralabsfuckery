package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RG2GI7LDp;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class s7MlVynBG implements RG2GI7LDp.AbstractC0007RG2GI7LDp {
    public final /* synthetic */ RecyclerView q3BipwRCk;

    public s7MlVynBG(RecyclerView recyclerView) {
        this.q3BipwRCk = recyclerView;
    }

    public RecyclerView.cywn6086a J4Ux7ym32(int i) {
        RecyclerView recyclerView = this.q3BipwRCk;
        int Puu3Rhg4F = recyclerView.MzoOEjc4X.Puu3Rhg4F();
        int i2 = 0;
        RecyclerView.cywn6086a cywn6086a = null;
        while (true) {
            if (i2 >= Puu3Rhg4F) {
                break;
            }
            RecyclerView.cywn6086a V9LQMKGJe = RecyclerView.V9LQMKGJe(recyclerView.MzoOEjc4X.GPLPRo6go(i2));
            if (V9LQMKGJe != null && !V9LQMKGJe.CBQ5d1kRq() && V9LQMKGJe.tGV7Q6urW == i) {
                if (!recyclerView.MzoOEjc4X.vPSbyrYWX(V9LQMKGJe.q3BipwRCk)) {
                    cywn6086a = V9LQMKGJe;
                    break;
                }
                cywn6086a = V9LQMKGJe;
            }
            i2++;
        }
        if (cywn6086a != null && !this.q3BipwRCk.MzoOEjc4X.vPSbyrYWX(cywn6086a.q3BipwRCk)) {
            return cywn6086a;
        }
        return null;
    }

    public void dIocxURUo(int i, int i2) {
        RecyclerView recyclerView = this.q3BipwRCk;
        int Puu3Rhg4F = recyclerView.MzoOEjc4X.Puu3Rhg4F();
        for (int i3 = 0; i3 < Puu3Rhg4F; i3++) {
            RecyclerView.cywn6086a V9LQMKGJe = RecyclerView.V9LQMKGJe(recyclerView.MzoOEjc4X.GPLPRo6go(i3));
            if (V9LQMKGJe != null && !V9LQMKGJe.dXrmkklc8() && V9LQMKGJe.tGV7Q6urW >= i) {
                V9LQMKGJe.MzoOEjc4X(i2, false);
                recyclerView.KlYagMRWx.iiGwOFFnr = true;
            }
        }
        RecyclerView.V1xq9aVRv v1xq9aVRv = recyclerView.kmSgne1rO;
        int size = v1xq9aVRv.tGV7Q6urW.size();
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.cywn6086a cywn6086a = (RecyclerView.cywn6086a) v1xq9aVRv.tGV7Q6urW.get(i4);
            if (cywn6086a != null && cywn6086a.tGV7Q6urW >= i) {
                cywn6086a.MzoOEjc4X(i2, false);
            }
        }
        recyclerView.requestLayout();
        this.q3BipwRCk.YmNRDyka4 = true;
    }

    public void kCA6Zs9sL(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.q3BipwRCk;
        int Puu3Rhg4F = recyclerView.MzoOEjc4X.Puu3Rhg4F();
        int i10 = -1;
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i11 = 0; i11 < Puu3Rhg4F; i11++) {
            RecyclerView.cywn6086a V9LQMKGJe = RecyclerView.V9LQMKGJe(recyclerView.MzoOEjc4X.GPLPRo6go(i11));
            if (V9LQMKGJe != null && (i9 = V9LQMKGJe.tGV7Q6urW) >= i5 && i9 <= i4) {
                if (i9 == i) {
                    V9LQMKGJe.MzoOEjc4X(i2 - i, false);
                } else {
                    V9LQMKGJe.MzoOEjc4X(i3, false);
                }
                recyclerView.KlYagMRWx.iiGwOFFnr = true;
            }
        }
        RecyclerView.V1xq9aVRv v1xq9aVRv = recyclerView.kmSgne1rO;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = v1xq9aVRv.tGV7Q6urW.size();
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.cywn6086a cywn6086a = (RecyclerView.cywn6086a) v1xq9aVRv.tGV7Q6urW.get(i12);
            if (cywn6086a != null && (i8 = cywn6086a.tGV7Q6urW) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    cywn6086a.MzoOEjc4X(i2 - i, false);
                } else {
                    cywn6086a.MzoOEjc4X(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.q3BipwRCk.YmNRDyka4 = true;
    }

    public void q3BipwRCk(RG2GI7LDp.mhl5lIdbQ mhl5lidbq) {
        int i = mhl5lidbq.q3BipwRCk;
        if (i == 1) {
            RecyclerView recyclerView = this.q3BipwRCk;
            recyclerView.WaUP0CF08.KBYw84i3W(recyclerView, mhl5lidbq.J4Ux7ym32, mhl5lidbq.dIocxURUo);
        } else if (i == 2) {
            RecyclerView recyclerView2 = this.q3BipwRCk;
            recyclerView2.WaUP0CF08.ln3nf7LH3(recyclerView2, mhl5lidbq.J4Ux7ym32, mhl5lidbq.dIocxURUo);
        } else if (i == 4) {
            RecyclerView recyclerView3 = this.q3BipwRCk;
            recyclerView3.WaUP0CF08.Dr7UqlxEV(recyclerView3, mhl5lidbq.J4Ux7ym32, mhl5lidbq.dIocxURUo, mhl5lidbq.tGV7Q6urW);
        } else if (i == 8) {
            RecyclerView recyclerView4 = this.q3BipwRCk;
            recyclerView4.WaUP0CF08.SuKhTJIQc(recyclerView4, mhl5lidbq.J4Ux7ym32, mhl5lidbq.dIocxURUo, 1);
        }
    }

    public void tGV7Q6urW(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.q3BipwRCk;
        int Puu3Rhg4F = recyclerView.MzoOEjc4X.Puu3Rhg4F();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < Puu3Rhg4F; i6++) {
            View GPLPRo6go = recyclerView.MzoOEjc4X.GPLPRo6go(i6);
            RecyclerView.cywn6086a V9LQMKGJe = RecyclerView.V9LQMKGJe(GPLPRo6go);
            if (V9LQMKGJe != null && !V9LQMKGJe.dXrmkklc8() && (i4 = V9LQMKGJe.tGV7Q6urW) >= i && i4 < i5) {
                V9LQMKGJe.J4Ux7ym32(2);
                V9LQMKGJe.q3BipwRCk(obj);
                ((RecyclerView.dgsh68zH8) GPLPRo6go.getLayoutParams()).tGV7Q6urW = true;
            }
        }
        RecyclerView.V1xq9aVRv v1xq9aVRv = recyclerView.kmSgne1rO;
        int size = v1xq9aVRv.tGV7Q6urW.size();
        while (true) {
            size--;
            if (size >= 0) {
                RecyclerView.cywn6086a cywn6086a = (RecyclerView.cywn6086a) v1xq9aVRv.tGV7Q6urW.get(size);
                if (cywn6086a != null && (i3 = cywn6086a.tGV7Q6urW) >= i && i3 < i5) {
                    cywn6086a.J4Ux7ym32(2);
                    v1xq9aVRv.iiGwOFFnr(size);
                }
            } else {
                this.q3BipwRCk.ShSN9wbzk = true;
                return;
            }
        }
    }
}
