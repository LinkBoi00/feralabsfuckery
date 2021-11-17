package con;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes.dex */
public class WxHrHceCL implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public SBj41z1W0 CBQ5d1kRq;
    public ViewGroup kmSgne1rO;

    public WxHrHceCL(SBj41z1W0 sBj41z1W0, ViewGroup viewGroup) {
        this.CBQ5d1kRq = sBj41z1W0;
        this.kmSgne1rO = viewGroup;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0204 A[EDGE_INSN: B:143:0x0204->B:93:0x0204 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0209  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onPreDraw() {
        ArrayList arrayList;
        int i;
        SBj41z1W0 sBj41z1W0;
        LKa8y802S lKa8y802S;
        rwhamSOu2 rwhamsou2;
        rwhamSOu2 rwhamsou22;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        jVyKY5GQn jvyky5gqn;
        LKa8y802S lKa8y802S2;
        kw8QXWz47 kw8qxwz47;
        View view;
        View view2;
        LKa8y802S lKa8y802S3;
        this.kmSgne1rO.getViewTreeObserver().removeOnPreDrawListener(this);
        this.kmSgne1rO.removeOnAttachStateChangeListener(this);
        int i6 = 1;
        if (!XczobwRut.tGV7Q6urW.remove(this.kmSgne1rO)) {
            return true;
        }
        rwhamSOu2 J4Ux7ym32 = XczobwRut.J4Ux7ym32();
        ArrayList arrayList2 = (ArrayList) J4Ux7ym32.get(this.kmSgne1rO);
        Object obj = null;
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            J4Ux7ym32.put(this.kmSgne1rO, arrayList2);
        } else if (arrayList2.size() > 0) {
            arrayList = new ArrayList(arrayList2);
            arrayList2.add(this.CBQ5d1kRq);
            this.CBQ5d1kRq.q3BipwRCk(new Ui7MxKF7n(this, J4Ux7ym32));
            i = 0;
            this.CBQ5d1kRq.Puu3Rhg4F(this.kmSgne1rO, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((SBj41z1W0) it.next()).WaUP0CF08(this.kmSgne1rO);
                }
            }
            sBj41z1W0 = this.CBQ5d1kRq;
            ViewGroup viewGroup = this.kmSgne1rO;
            Objects.requireNonNull(sBj41z1W0);
            sBj41z1W0.ixWaw2akD = new ArrayList();
            sBj41z1W0.sk5s77z6Q = new ArrayList();
            lKa8y802S = sBj41z1W0.qVUwofr5s;
            LKa8y802S lKa8y802S4 = sBj41z1W0.Eeka1udhb;
            rwhamsou2 = new rwhamSOu2((rwhamSOu2) lKa8y802S.q3BipwRCk);
            rwhamsou22 = new rwhamSOu2((rwhamSOu2) lKa8y802S4.q3BipwRCk);
            i2 = 0;
            while (true) {
                iArr = sBj41z1W0.RG6kpfv3v;
                if (i2 < iArr.length) {
                    break;
                }
                int i7 = iArr[i2];
                if (i7 == i6) {
                    lKa8y802S2 = lKa8y802S;
                    int i8 = rwhamsou2.Bhmn1KIah;
                    while (true) {
                        i8--;
                        if (i8 >= 0) {
                            View view3 = (View) rwhamsou2.Puu3Rhg4F(i8);
                            if (view3 != null && sBj41z1W0.Eeka1udhb(view3) && (kw8qxwz47 = (kw8QXWz47) rwhamsou22.remove(view3)) != null && sBj41z1W0.Eeka1udhb(kw8qxwz47.J4Ux7ym32)) {
                                sBj41z1W0.ixWaw2akD.add((kw8QXWz47) rwhamsou2.yWvV4ePLl(i8));
                                sBj41z1W0.sk5s77z6Q.add(kw8qxwz47);
                            }
                        }
                    }
                } else if (i7 == 2) {
                    lKa8y802S2 = lKa8y802S;
                    rwhamSOu2 rwhamsou23 = (rwhamSOu2) lKa8y802S2.dIocxURUo;
                    rwhamSOu2 rwhamsou24 = (rwhamSOu2) lKa8y802S4.dIocxURUo;
                    int i9 = rwhamsou23.Bhmn1KIah;
                    for (int i10 = 0; i10 < i9; i10++) {
                        View view4 = (View) rwhamsou23.vPSbyrYWX(i10);
                        if (view4 != null && sBj41z1W0.Eeka1udhb(view4) && (view = (View) rwhamsou24.get(rwhamsou23.Puu3Rhg4F(i10))) != null && sBj41z1W0.Eeka1udhb(view)) {
                            kw8QXWz47 kw8qxwz472 = (kw8QXWz47) rwhamsou2.getOrDefault(view4, null);
                            kw8QXWz47 kw8qxwz473 = (kw8QXWz47) rwhamsou22.getOrDefault(view, null);
                            if (!(kw8qxwz472 == null || kw8qxwz473 == null)) {
                                sBj41z1W0.ixWaw2akD.add(kw8qxwz472);
                                sBj41z1W0.sk5s77z6Q.add(kw8qxwz473);
                                rwhamsou2.remove(view4);
                                rwhamsou22.remove(view);
                            }
                        }
                    }
                } else if (i7 != 3) {
                    if (i7 == 4) {
                        NRnsbVC1Y nRnsbVC1Y = (NRnsbVC1Y) lKa8y802S.tGV7Q6urW;
                        NRnsbVC1Y nRnsbVC1Y2 = (NRnsbVC1Y) lKa8y802S4.tGV7Q6urW;
                        int GPLPRo6go = nRnsbVC1Y.GPLPRo6go();
                        int i11 = i;
                        while (i11 < GPLPRo6go) {
                            View view5 = (View) nRnsbVC1Y.Puu3Rhg4F(i11);
                            if (view5 == null || !sBj41z1W0.Eeka1udhb(view5)) {
                                lKa8y802S3 = lKa8y802S;
                            } else {
                                if (nRnsbVC1Y.CBQ5d1kRq) {
                                    nRnsbVC1Y.tGV7Q6urW();
                                }
                                lKa8y802S3 = lKa8y802S;
                                View view6 = (View) nRnsbVC1Y2.dIocxURUo(nRnsbVC1Y.kmSgne1rO[i11]);
                                if (view6 != null && sBj41z1W0.Eeka1udhb(view6)) {
                                    kw8QXWz47 kw8qxwz474 = (kw8QXWz47) rwhamsou2.getOrDefault(view5, obj);
                                    kw8QXWz47 kw8qxwz475 = (kw8QXWz47) rwhamsou22.getOrDefault(view6, obj);
                                    if (!(kw8qxwz474 == null || kw8qxwz475 == null)) {
                                        sBj41z1W0.ixWaw2akD.add(kw8qxwz474);
                                        sBj41z1W0.sk5s77z6Q.add(kw8qxwz475);
                                        rwhamsou2.remove(view5);
                                        rwhamsou22.remove(view6);
                                    }
                                }
                            }
                            i11++;
                            lKa8y802S = lKa8y802S3;
                            obj = null;
                        }
                    }
                    lKa8y802S2 = lKa8y802S;
                } else {
                    lKa8y802S2 = lKa8y802S;
                    SparseArray sparseArray = (SparseArray) lKa8y802S2.J4Ux7ym32;
                    SparseArray sparseArray2 = (SparseArray) lKa8y802S4.J4Ux7ym32;
                    int size = sparseArray.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        View view7 = (View) sparseArray.valueAt(i12);
                        if (view7 != null && sBj41z1W0.Eeka1udhb(view7) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i12))) != null && sBj41z1W0.Eeka1udhb(view2)) {
                            kw8QXWz47 kw8qxwz476 = (kw8QXWz47) rwhamsou2.getOrDefault(view7, null);
                            kw8QXWz47 kw8qxwz477 = (kw8QXWz47) rwhamsou22.getOrDefault(view2, null);
                            if (!(kw8qxwz476 == null || kw8qxwz477 == null)) {
                                sBj41z1W0.ixWaw2akD.add(kw8qxwz476);
                                sBj41z1W0.sk5s77z6Q.add(kw8qxwz477);
                                rwhamsou2.remove(view7);
                                rwhamsou22.remove(view2);
                            }
                        }
                    }
                }
                i2++;
                lKa8y802S = lKa8y802S2;
                i6 = 1;
                obj = null;
                i = 0;
            }
            for (i3 = 0; i3 < rwhamsou2.Bhmn1KIah; i3++) {
                kw8QXWz47 kw8qxwz478 = (kw8QXWz47) rwhamsou2.vPSbyrYWX(i3);
                if (sBj41z1W0.Eeka1udhb(kw8qxwz478.J4Ux7ym32)) {
                    sBj41z1W0.ixWaw2akD.add(kw8qxwz478);
                    sBj41z1W0.sk5s77z6Q.add(null);
                }
            }
            for (i4 = 0; i4 < rwhamsou22.Bhmn1KIah; i4++) {
                kw8QXWz47 kw8qxwz479 = (kw8QXWz47) rwhamsou22.vPSbyrYWX(i4);
                if (sBj41z1W0.Eeka1udhb(kw8qxwz479.J4Ux7ym32)) {
                    sBj41z1W0.sk5s77z6Q.add(kw8qxwz479);
                    sBj41z1W0.ixWaw2akD.add(null);
                }
            }
            rwhamSOu2 PSTqBLTET = SBj41z1W0.PSTqBLTET();
            int i13 = PSTqBLTET.Bhmn1KIah;
            ZNRZ3lc8t zNRZ3lc8t = lSxPlj8FZ.q3BipwRCk;
            WindowId windowId = viewGroup.getWindowId();
            for (i5 = i13 - 1; i5 >= 0; i5--) {
                Animator animator = (Animator) PSTqBLTET.Puu3Rhg4F(i5);
                if (!(animator == null || (jvyky5gqn = (jVyKY5GQn) PSTqBLTET.getOrDefault(animator, null)) == null || jvyky5gqn.q3BipwRCk == null)) {
                    Llvfl7w4w llvfl7w4w = jvyky5gqn.dIocxURUo;
                    if ((llvfl7w4w instanceof omx3ORKqP) && ((omx3ORKqP) llvfl7w4w).q3BipwRCk.equals(windowId)) {
                        kw8QXWz47 kw8qxwz4710 = jvyky5gqn.tGV7Q6urW;
                        View view8 = jvyky5gqn.q3BipwRCk;
                        kw8QXWz47 ilHKhw3Yw = sBj41z1W0.ilHKhw3Yw(view8, true);
                        kw8QXWz47 Bhmn1KIah = sBj41z1W0.Bhmn1KIah(view8, true);
                        if (ilHKhw3Yw == null && Bhmn1KIah == null) {
                            Bhmn1KIah = (kw8QXWz47) ((rwhamSOu2) sBj41z1W0.Eeka1udhb.q3BipwRCk).get(view8);
                        }
                        if (!(ilHKhw3Yw == null && Bhmn1KIah == null) && jvyky5gqn.kCA6Zs9sL.qVUwofr5s(kw8qxwz4710, Bhmn1KIah)) {
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                PSTqBLTET.remove(animator);
                            }
                        }
                    }
                }
            }
            sBj41z1W0.CBQ5d1kRq(viewGroup, sBj41z1W0.qVUwofr5s, sBj41z1W0.Eeka1udhb, sBj41z1W0.ixWaw2akD, sBj41z1W0.sk5s77z6Q);
            sBj41z1W0.i8XZMQc6Z();
            return true;
        }
        arrayList = null;
        arrayList2.add(this.CBQ5d1kRq);
        this.CBQ5d1kRq.q3BipwRCk(new Ui7MxKF7n(this, J4Ux7ym32));
        i = 0;
        this.CBQ5d1kRq.Puu3Rhg4F(this.kmSgne1rO, false);
        if (arrayList != null) {
        }
        sBj41z1W0 = this.CBQ5d1kRq;
        ViewGroup viewGroup2 = this.kmSgne1rO;
        Objects.requireNonNull(sBj41z1W0);
        sBj41z1W0.ixWaw2akD = new ArrayList();
        sBj41z1W0.sk5s77z6Q = new ArrayList();
        lKa8y802S = sBj41z1W0.qVUwofr5s;
        LKa8y802S lKa8y802S42 = sBj41z1W0.Eeka1udhb;
        rwhamsou2 = new rwhamSOu2((rwhamSOu2) lKa8y802S.q3BipwRCk);
        rwhamsou22 = new rwhamSOu2((rwhamSOu2) lKa8y802S42.q3BipwRCk);
        i2 = 0;
        while (true) {
            iArr = sBj41z1W0.RG6kpfv3v;
            if (i2 < iArr.length) {
            }
            i2++;
            lKa8y802S = lKa8y802S2;
            i6 = 1;
            obj = null;
            i = 0;
        }
        while (i3 < rwhamsou2.Bhmn1KIah) {
        }
        while (i4 < rwhamsou22.Bhmn1KIah) {
        }
        rwhamSOu2 PSTqBLTET2 = SBj41z1W0.PSTqBLTET();
        int i132 = PSTqBLTET2.Bhmn1KIah;
        ZNRZ3lc8t zNRZ3lc8t2 = lSxPlj8FZ.q3BipwRCk;
        WindowId windowId2 = viewGroup2.getWindowId();
        while (i5 >= 0) {
        }
        sBj41z1W0.CBQ5d1kRq(viewGroup2, sBj41z1W0.qVUwofr5s, sBj41z1W0.Eeka1udhb, sBj41z1W0.ixWaw2akD, sBj41z1W0.sk5s77z6Q);
        sBj41z1W0.i8XZMQc6Z();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.kmSgne1rO.getViewTreeObserver().removeOnPreDrawListener(this);
        this.kmSgne1rO.removeOnAttachStateChangeListener(this);
        XczobwRut.tGV7Q6urW.remove(this.kmSgne1rO);
        ArrayList arrayList = (ArrayList) XczobwRut.J4Ux7ym32().get(this.kmSgne1rO);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((SBj41z1W0) it.next()).WaUP0CF08(this.kmSgne1rO);
            }
        }
        this.CBQ5d1kRq.yWvV4ePLl(true);
    }
}
