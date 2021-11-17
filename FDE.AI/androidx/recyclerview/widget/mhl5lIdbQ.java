package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import con.CvY5I9Zfv;
import con.IuQbWntsc;
import con.Rwvkmr87Y;
import con.VCCyeOu6I;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class mhl5lIdbQ {
    public final RG2GI7LDp q3BipwRCk;
    public final CvY5I9Zfv J4Ux7ym32 = new CvY5I9Zfv();
    public final List tGV7Q6urW = new ArrayList();

    /* loaded from: classes.dex */
    public interface RG2GI7LDp {
    }

    public mhl5lIdbQ(RG2GI7LDp rG2GI7LDp) {
        this.q3BipwRCk = rG2GI7LDp;
    }

    public final boolean CBQ5d1kRq(View view) {
        if (!this.tGV7Q6urW.remove(view)) {
            return false;
        }
        qhPEQQaQ4 qhpeqqaq4 = (qhPEQQaQ4) this.q3BipwRCk;
        Objects.requireNonNull(qhpeqqaq4);
        RecyclerView.cywn6086a V9LQMKGJe = RecyclerView.V9LQMKGJe(view);
        if (V9LQMKGJe == null) {
            return true;
        }
        qhpeqqaq4.q3BipwRCk.ln3nf7LH3(V9LQMKGJe, V9LQMKGJe.MzoOEjc4X);
        V9LQMKGJe.MzoOEjc4X = 0;
        return true;
    }

    public View GPLPRo6go(int i) {
        return ((qhPEQQaQ4) this.q3BipwRCk).q3BipwRCk.getChildAt(i);
    }

    public void J4Ux7ym32(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int J4Ux7ym32 = i < 0 ? ((qhPEQQaQ4) this.q3BipwRCk).J4Ux7ym32() : iiGwOFFnr(i);
        this.J4Ux7ym32.kCA6Zs9sL(J4Ux7ym32, z);
        if (z) {
            yWvV4ePLl(view);
        }
        qhPEQQaQ4 qhpeqqaq4 = (qhPEQQaQ4) this.q3BipwRCk;
        Objects.requireNonNull(qhpeqqaq4);
        RecyclerView.cywn6086a V9LQMKGJe = RecyclerView.V9LQMKGJe(view);
        if (V9LQMKGJe != null) {
            if (V9LQMKGJe.Bhmn1KIah() || V9LQMKGJe.dXrmkklc8()) {
                V9LQMKGJe.oon79WMrY &= -257;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(V9LQMKGJe);
                throw new IllegalArgumentException(Rwvkmr87Y.q3BipwRCk(qhpeqqaq4.q3BipwRCk, sb));
            }
        }
        qhpeqqaq4.q3BipwRCk.attachViewToParent(view, J4Ux7ym32, layoutParams);
    }

    public int Puu3Rhg4F() {
        return ((qhPEQQaQ4) this.q3BipwRCk).J4Ux7ym32();
    }

    public View dIocxURUo(int i) {
        return ((qhPEQQaQ4) this.q3BipwRCk).q3BipwRCk(iiGwOFFnr(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r4.J4Ux7ym32.dIocxURUo(r2) == false) goto L_0x0026;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final int iiGwOFFnr(int r5) {
        /*
            r4 = this;
            r0 = -1
            if (r5 >= 0) goto L_0x0004
            return r0
        L_0x0004:
            androidx.recyclerview.widget.mhl5lIdbQ$RG2GI7LDp r1 = r4.q3BipwRCk
            androidx.recyclerview.widget.qhPEQQaQ4 r1 = (androidx.recyclerview.widget.qhPEQQaQ4) r1
            int r1 = r1.J4Ux7ym32()
            r2 = r5
        L_0x000d:
            if (r2 >= r1) goto L_0x0029
            con.CvY5I9Zfv r3 = r4.J4Ux7ym32
            int r3 = r3.J4Ux7ym32(r2)
            int r3 = r2 - r3
            int r3 = r5 - r3
            if (r3 != 0) goto L_0x0027
        L_0x001b:
            con.CvY5I9Zfv r5 = r4.J4Ux7ym32
            boolean r5 = r5.dIocxURUo(r2)
            if (r5 == 0) goto L_0x0026
            int r2 = r2 + 1
            goto L_0x001b
        L_0x0026:
            return r2
        L_0x0027:
            int r2 = r2 + r3
            goto L_0x000d
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.mhl5lIdbQ.iiGwOFFnr(int):int");
    }

    public int kCA6Zs9sL() {
        return ((qhPEQQaQ4) this.q3BipwRCk).J4Ux7ym32() - this.tGV7Q6urW.size();
    }

    public int oon79WMrY(View view) {
        int indexOfChild = ((qhPEQQaQ4) this.q3BipwRCk).q3BipwRCk.indexOfChild(view);
        if (indexOfChild != -1 && !this.J4Ux7ym32.dIocxURUo(indexOfChild)) {
            return indexOfChild - this.J4Ux7ym32.J4Ux7ym32(indexOfChild);
        }
        return -1;
    }

    public void q3BipwRCk(View view, int i, boolean z) {
        int J4Ux7ym32 = i < 0 ? ((qhPEQQaQ4) this.q3BipwRCk).J4Ux7ym32() : iiGwOFFnr(i);
        this.J4Ux7ym32.kCA6Zs9sL(J4Ux7ym32, z);
        if (z) {
            yWvV4ePLl(view);
        }
        qhPEQQaQ4 qhpeqqaq4 = (qhPEQQaQ4) this.q3BipwRCk;
        qhpeqqaq4.q3BipwRCk.addView(view, J4Ux7ym32);
        Objects.requireNonNull(qhpeqqaq4.q3BipwRCk);
        RecyclerView.V9LQMKGJe(view);
    }

    public void tGV7Q6urW(int i) {
        RecyclerView.cywn6086a V9LQMKGJe;
        int iiGwOFFnr = iiGwOFFnr(i);
        this.J4Ux7ym32.iiGwOFFnr(iiGwOFFnr);
        qhPEQQaQ4 qhpeqqaq4 = (qhPEQQaQ4) this.q3BipwRCk;
        View childAt = qhpeqqaq4.q3BipwRCk.getChildAt(iiGwOFFnr);
        if (!(childAt == null || (V9LQMKGJe = RecyclerView.V9LQMKGJe(childAt)) == null)) {
            if (!V9LQMKGJe.Bhmn1KIah() || V9LQMKGJe.dXrmkklc8()) {
                V9LQMKGJe.J4Ux7ym32(256);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(V9LQMKGJe);
                throw new IllegalArgumentException(Rwvkmr87Y.q3BipwRCk(qhpeqqaq4.q3BipwRCk, sb));
            }
        }
        qhpeqqaq4.q3BipwRCk.detachViewFromParent(iiGwOFFnr);
    }

    public String toString() {
        return this.J4Ux7ym32.toString() + ", hidden list:" + this.tGV7Q6urW.size();
    }

    public boolean vPSbyrYWX(View view) {
        return this.tGV7Q6urW.contains(view);
    }

    public final void yWvV4ePLl(View view) {
        this.tGV7Q6urW.add(view);
        qhPEQQaQ4 qhpeqqaq4 = (qhPEQQaQ4) this.q3BipwRCk;
        Objects.requireNonNull(qhpeqqaq4);
        RecyclerView.cywn6086a V9LQMKGJe = RecyclerView.V9LQMKGJe(view);
        if (V9LQMKGJe != null) {
            RecyclerView recyclerView = qhpeqqaq4.q3BipwRCk;
            int i = V9LQMKGJe.ilHKhw3Yw;
            if (i == -1) {
                View view2 = V9LQMKGJe.q3BipwRCk;
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                i = VCCyeOu6I.tGV7Q6urW(view2);
            }
            V9LQMKGJe.MzoOEjc4X = i;
            recyclerView.ln3nf7LH3(V9LQMKGJe, 4);
        }
    }
}
