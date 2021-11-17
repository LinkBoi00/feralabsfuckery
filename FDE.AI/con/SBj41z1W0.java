package con;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class SBj41z1W0 implements Cloneable {
    public RG2GI7LDp CpG0imbht;
    public ArrayList ixWaw2akD;
    public ArrayList sk5s77z6Q;
    public static final int[] nlGCs0NZs = {2, 1, 3, 4};
    public static final ZNRZ3lc8t AqaWJg0b4 = new ZNRZ3lc8t(0);
    public static ThreadLocal mUqPm6GBh = new ThreadLocal();
    public String CBQ5d1kRq = getClass().getName();
    public long kmSgne1rO = -1;
    public long Bhmn1KIah = -1;
    public TimeInterpolator PSTqBLTET = null;
    public ArrayList MzoOEjc4X = new ArrayList();
    public ArrayList ilHKhw3Yw = new ArrayList();
    public LKa8y802S qVUwofr5s = new LKa8y802S(7);
    public LKa8y802S Eeka1udhb = new LKa8y802S(7);
    public yO301sien dXrmkklc8 = null;
    public int[] RG6kpfv3v = nlGCs0NZs;
    public ArrayList WaUP0CF08 = new ArrayList();
    public int i8XZMQc6Z = 0;
    public boolean dfpT1j18n = false;
    public boolean iMyQMM6Qj = false;
    public ArrayList cAwN510t2 = null;
    public ArrayList IytU16YUK = new ArrayList();
    public ZNRZ3lc8t qFBXIgpia = AqaWJg0b4;

    /* loaded from: classes.dex */
    public static abstract class RG2GI7LDp {
    }

    /* loaded from: classes.dex */
    public interface mhl5lIdbQ {
        void J4Ux7ym32(SBj41z1W0 sBj41z1W0);

        void dIocxURUo(SBj41z1W0 sBj41z1W0);

        void kCA6Zs9sL(SBj41z1W0 sBj41z1W0);

        void q3BipwRCk(SBj41z1W0 sBj41z1W0);

        void tGV7Q6urW(SBj41z1W0 sBj41z1W0);
    }

    public static rwhamSOu2 PSTqBLTET() {
        rwhamSOu2 rwhamsou2 = (rwhamSOu2) mUqPm6GBh.get();
        if (rwhamsou2 != null) {
            return rwhamsou2;
        }
        rwhamSOu2 rwhamsou22 = new rwhamSOu2();
        mUqPm6GBh.set(rwhamsou22);
        return rwhamsou22;
    }

    public static boolean dXrmkklc8(kw8QXWz47 kw8qxwz47, kw8QXWz47 kw8qxwz472, String str) {
        Object obj = kw8qxwz47.q3BipwRCk.get(str);
        Object obj2 = kw8qxwz472.q3BipwRCk.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    public static void tGV7Q6urW(LKa8y802S lKa8y802S, View view, kw8QXWz47 kw8qxwz47) {
        ((rwhamSOu2) lKa8y802S.q3BipwRCk).put(view, kw8qxwz47);
        int id = view.getId();
        if (id >= 0) {
            if (((SparseArray) lKa8y802S.J4Ux7ym32).indexOfKey(id) >= 0) {
                ((SparseArray) lKa8y802S.J4Ux7ym32).put(id, null);
            } else {
                ((SparseArray) lKa8y802S.J4Ux7ym32).put(id, view);
            }
        }
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        String vPSbyrYWX = mJLaJepZo.vPSbyrYWX(view);
        if (vPSbyrYWX != null) {
            if (((rwhamSOu2) lKa8y802S.dIocxURUo).kCA6Zs9sL(vPSbyrYWX) >= 0) {
                ((rwhamSOu2) lKa8y802S.dIocxURUo).put(vPSbyrYWX, null);
            } else {
                ((rwhamSOu2) lKa8y802S.dIocxURUo).put(vPSbyrYWX, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                NRnsbVC1Y nRnsbVC1Y = (NRnsbVC1Y) lKa8y802S.tGV7Q6urW;
                if (nRnsbVC1Y.CBQ5d1kRq) {
                    nRnsbVC1Y.tGV7Q6urW();
                }
                if (PhWyMtRZm.J4Ux7ym32(nRnsbVC1Y.kmSgne1rO, nRnsbVC1Y.PSTqBLTET, itemIdAtPosition) >= 0) {
                    View view2 = (View) ((NRnsbVC1Y) lKa8y802S.tGV7Q6urW).dIocxURUo(itemIdAtPosition);
                    if (view2 != null) {
                        VCCyeOu6I.qVUwofr5s(view2, false);
                        ((NRnsbVC1Y) lKa8y802S.tGV7Q6urW).iiGwOFFnr(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                VCCyeOu6I.qVUwofr5s(view, true);
                ((NRnsbVC1Y) lKa8y802S.tGV7Q6urW).iiGwOFFnr(itemIdAtPosition, view);
            }
        }
    }

    public String AqaWJg0b4(String str) {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk(str);
        q3BipwRCk.append(getClass().getSimpleName());
        q3BipwRCk.append("@");
        q3BipwRCk.append(Integer.toHexString(hashCode()));
        q3BipwRCk.append(": ");
        String sb = q3BipwRCk.toString();
        if (this.Bhmn1KIah != -1) {
            sb = sb + "dur(" + this.Bhmn1KIah + ") ";
        }
        if (this.kmSgne1rO != -1) {
            sb = sb + "dly(" + this.kmSgne1rO + ") ";
        }
        if (this.PSTqBLTET != null) {
            sb = sb + "interp(" + this.PSTqBLTET + ") ";
        }
        if (this.MzoOEjc4X.size() <= 0 && this.ilHKhw3Yw.size() <= 0) {
            return sb;
        }
        String q3BipwRCk2 = UexvVay3o.q3BipwRCk(sb, "tgts(");
        if (this.MzoOEjc4X.size() > 0) {
            for (int i = 0; i < this.MzoOEjc4X.size(); i++) {
                if (i > 0) {
                    q3BipwRCk2 = UexvVay3o.q3BipwRCk(q3BipwRCk2, ", ");
                }
                StringBuilder q3BipwRCk3 = abGBwSu8x.q3BipwRCk(q3BipwRCk2);
                q3BipwRCk3.append(this.MzoOEjc4X.get(i));
                q3BipwRCk2 = q3BipwRCk3.toString();
            }
        }
        if (this.ilHKhw3Yw.size() > 0) {
            for (int i2 = 0; i2 < this.ilHKhw3Yw.size(); i2++) {
                if (i2 > 0) {
                    q3BipwRCk2 = UexvVay3o.q3BipwRCk(q3BipwRCk2, ", ");
                }
                StringBuilder q3BipwRCk4 = abGBwSu8x.q3BipwRCk(q3BipwRCk2);
                q3BipwRCk4.append(this.ilHKhw3Yw.get(i2));
                q3BipwRCk2 = q3BipwRCk4.toString();
            }
        }
        return UexvVay3o.q3BipwRCk(q3BipwRCk2, ")");
    }

    public kw8QXWz47 Bhmn1KIah(View view, boolean z) {
        yO301sien yo301sien = this.dXrmkklc8;
        if (yo301sien != null) {
            return yo301sien.Bhmn1KIah(view, z);
        }
        ArrayList arrayList = z ? this.ixWaw2akD : this.sk5s77z6Q;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            kw8QXWz47 kw8qxwz47 = (kw8QXWz47) arrayList.get(i2);
            if (kw8qxwz47 == null) {
                return null;
            }
            if (kw8qxwz47.J4Ux7ym32 == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (kw8QXWz47) (z ? this.sk5s77z6Q : this.ixWaw2akD).get(i);
    }

    public void CBQ5d1kRq(ViewGroup viewGroup, LKa8y802S lKa8y802S, LKa8y802S lKa8y802S2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        Animator vPSbyrYWX;
        Animator animator;
        kw8QXWz47 kw8qxwz47;
        View view;
        kw8QXWz47 kw8qxwz472;
        Animator animator2;
        rwhamSOu2 PSTqBLTET = PSTqBLTET();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            kw8QXWz47 kw8qxwz473 = (kw8QXWz47) arrayList.get(i2);
            kw8QXWz47 kw8qxwz474 = (kw8QXWz47) arrayList2.get(i2);
            if (kw8qxwz473 != null && !kw8qxwz473.tGV7Q6urW.contains(this)) {
                kw8qxwz473 = null;
            }
            if (kw8qxwz474 != null && !kw8qxwz474.tGV7Q6urW.contains(this)) {
                kw8qxwz474 = null;
            }
            if (!(kw8qxwz473 == null && kw8qxwz474 == null)) {
                if ((kw8qxwz473 == null || kw8qxwz474 == null || qVUwofr5s(kw8qxwz473, kw8qxwz474)) && (vPSbyrYWX = vPSbyrYWX(viewGroup, kw8qxwz473, kw8qxwz474)) != null) {
                    if (kw8qxwz474 != null) {
                        View view2 = kw8qxwz474.J4Ux7ym32;
                        String[] MzoOEjc4X = MzoOEjc4X();
                        if (MzoOEjc4X != null && MzoOEjc4X.length > 0) {
                            kw8qxwz472 = new kw8QXWz47(view2);
                            kw8QXWz47 kw8qxwz475 = (kw8QXWz47) ((rwhamSOu2) lKa8y802S2.q3BipwRCk).get(view2);
                            if (kw8qxwz475 != null) {
                                int i3 = 0;
                                while (i3 < MzoOEjc4X.length) {
                                    kw8qxwz472.q3BipwRCk.put(MzoOEjc4X[i3], kw8qxwz475.q3BipwRCk.get(MzoOEjc4X[i3]));
                                    i3++;
                                    vPSbyrYWX = vPSbyrYWX;
                                    size = size;
                                    kw8qxwz475 = kw8qxwz475;
                                }
                            }
                            i = size;
                            int i4 = PSTqBLTET.Bhmn1KIah;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator2 = vPSbyrYWX;
                                    break;
                                }
                                jVyKY5GQn jvyky5gqn = (jVyKY5GQn) PSTqBLTET.get((Animator) PSTqBLTET.Puu3Rhg4F(i5));
                                if (jvyky5gqn.tGV7Q6urW != null && jvyky5gqn.q3BipwRCk == view2 && jvyky5gqn.J4Ux7ym32.equals(this.CBQ5d1kRq) && jvyky5gqn.tGV7Q6urW.equals(kw8qxwz472)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            animator2 = vPSbyrYWX;
                            kw8qxwz472 = null;
                        }
                        view = view2;
                        animator = animator2;
                        kw8qxwz47 = kw8qxwz472;
                    } else {
                        i = size;
                        view = kw8qxwz473.J4Ux7ym32;
                        animator = vPSbyrYWX;
                        kw8qxwz47 = null;
                    }
                    if (animator != null) {
                        String str = this.CBQ5d1kRq;
                        ZNRZ3lc8t zNRZ3lc8t = lSxPlj8FZ.q3BipwRCk;
                        PSTqBLTET.put(animator, new jVyKY5GQn(view, str, this, new omx3ORKqP(viewGroup), kw8qxwz47));
                        this.IytU16YUK.add(animator);
                    }
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator3 = (Animator) this.IytU16YUK.get(sparseIntArray.keyAt(i6));
                animator3.setStartDelay(animator3.getStartDelay() + (((long) sparseIntArray.valueAt(i6)) - Long.MAX_VALUE));
            }
        }
    }

    public void CpG0imbht(idpM54xlp idpm54xlp) {
    }

    public boolean Eeka1udhb(View view) {
        return (this.MzoOEjc4X.size() == 0 && this.ilHKhw3Yw.size() == 0) || this.MzoOEjc4X.contains(Integer.valueOf(view.getId())) || this.ilHKhw3Yw.contains(view);
    }

    public abstract void GPLPRo6go(kw8QXWz47 kw8qxwz47);

    public void IytU16YUK(ZNRZ3lc8t zNRZ3lc8t) {
        if (zNRZ3lc8t == null) {
            zNRZ3lc8t = AqaWJg0b4;
        }
        this.qFBXIgpia = zNRZ3lc8t;
    }

    public SBj41z1W0 J4Ux7ym32(View view) {
        this.ilHKhw3Yw.add(view);
        return this;
    }

    public String[] MzoOEjc4X() {
        return null;
    }

    public void Puu3Rhg4F(ViewGroup viewGroup, boolean z) {
        yWvV4ePLl(z);
        if (this.MzoOEjc4X.size() > 0 || this.ilHKhw3Yw.size() > 0) {
            for (int i = 0; i < this.MzoOEjc4X.size(); i++) {
                View findViewById = viewGroup.findViewById(((Integer) this.MzoOEjc4X.get(i)).intValue());
                if (findViewById != null) {
                    kw8QXWz47 kw8qxwz47 = new kw8QXWz47(findViewById);
                    if (z) {
                        GPLPRo6go(kw8qxwz47);
                    } else {
                        dIocxURUo(kw8qxwz47);
                    }
                    kw8qxwz47.tGV7Q6urW.add(this);
                    iiGwOFFnr(kw8qxwz47);
                    tGV7Q6urW(z ? this.qVUwofr5s : this.Eeka1udhb, findViewById, kw8qxwz47);
                }
            }
            for (int i2 = 0; i2 < this.ilHKhw3Yw.size(); i2++) {
                View view = (View) this.ilHKhw3Yw.get(i2);
                kw8QXWz47 kw8qxwz472 = new kw8QXWz47(view);
                if (z) {
                    GPLPRo6go(kw8qxwz472);
                } else {
                    dIocxURUo(kw8qxwz472);
                }
                kw8qxwz472.tGV7Q6urW.add(this);
                iiGwOFFnr(kw8qxwz472);
                tGV7Q6urW(z ? this.qVUwofr5s : this.Eeka1udhb, view, kw8qxwz472);
            }
            return;
        }
        kCA6Zs9sL(viewGroup, z);
    }

    public void RG6kpfv3v(View view) {
        int i;
        if (!this.iMyQMM6Qj) {
            rwhamSOu2 PSTqBLTET = PSTqBLTET();
            int i2 = PSTqBLTET.Bhmn1KIah;
            ZNRZ3lc8t zNRZ3lc8t = lSxPlj8FZ.q3BipwRCk;
            WindowId windowId = view.getWindowId();
            int i3 = i2 - 1;
            while (true) {
                i = 0;
                if (i3 < 0) {
                    break;
                }
                jVyKY5GQn jvyky5gqn = (jVyKY5GQn) PSTqBLTET.vPSbyrYWX(i3);
                if (jvyky5gqn.q3BipwRCk != null) {
                    Llvfl7w4w llvfl7w4w = jvyky5gqn.dIocxURUo;
                    if ((llvfl7w4w instanceof omx3ORKqP) && ((omx3ORKqP) llvfl7w4w).q3BipwRCk.equals(windowId)) {
                        i = 1;
                    }
                    if (i != 0) {
                        ((Animator) PSTqBLTET.Puu3Rhg4F(i3)).pause();
                    }
                }
                i3--;
            }
            ArrayList arrayList = this.cAwN510t2;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.cAwN510t2.clone();
                int size = arrayList2.size();
                while (i < size) {
                    ((mhl5lIdbQ) arrayList2.get(i)).q3BipwRCk(this);
                    i++;
                }
            }
            this.dfpT1j18n = true;
        }
    }

    public void WaUP0CF08(View view) {
        if (this.dfpT1j18n) {
            if (!this.iMyQMM6Qj) {
                rwhamSOu2 PSTqBLTET = PSTqBLTET();
                int i = PSTqBLTET.Bhmn1KIah;
                ZNRZ3lc8t zNRZ3lc8t = lSxPlj8FZ.q3BipwRCk;
                WindowId windowId = view.getWindowId();
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    jVyKY5GQn jvyky5gqn = (jVyKY5GQn) PSTqBLTET.vPSbyrYWX(i2);
                    if (jvyky5gqn.q3BipwRCk != null) {
                        Llvfl7w4w llvfl7w4w = jvyky5gqn.dIocxURUo;
                        if ((llvfl7w4w instanceof omx3ORKqP) && ((omx3ORKqP) llvfl7w4w).q3BipwRCk.equals(windowId)) {
                            ((Animator) PSTqBLTET.Puu3Rhg4F(i2)).resume();
                        }
                    }
                }
                ArrayList arrayList = this.cAwN510t2;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.cAwN510t2.clone();
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((mhl5lIdbQ) arrayList2.get(i3)).kCA6Zs9sL(this);
                    }
                }
            }
            this.dfpT1j18n = false;
        }
    }

    public SBj41z1W0 cAwN510t2(TimeInterpolator timeInterpolator) {
        this.PSTqBLTET = timeInterpolator;
        return this;
    }

    public abstract void dIocxURUo(kw8QXWz47 kw8qxwz47);

    public SBj41z1W0 dfpT1j18n(long j) {
        this.Bhmn1KIah = j;
        return this;
    }

    public void i8XZMQc6Z() {
        nlGCs0NZs();
        rwhamSOu2 PSTqBLTET = PSTqBLTET();
        Iterator it = this.IytU16YUK.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (PSTqBLTET.containsKey(animator)) {
                nlGCs0NZs();
                if (animator != null) {
                    animator.addListener(new KIxB6ke5V(this, PSTqBLTET));
                    long j = this.Bhmn1KIah;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.kmSgne1rO;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.PSTqBLTET;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new D3StUN0h9(this));
                    animator.start();
                }
            }
        }
        this.IytU16YUK.clear();
        kmSgne1rO();
    }

    public void iMyQMM6Qj(RG2GI7LDp rG2GI7LDp) {
        this.CpG0imbht = rG2GI7LDp;
    }

    public void iiGwOFFnr(kw8QXWz47 kw8qxwz47) {
    }

    public kw8QXWz47 ilHKhw3Yw(View view, boolean z) {
        yO301sien yo301sien = this.dXrmkklc8;
        if (yo301sien != null) {
            return yo301sien.ilHKhw3Yw(view, z);
        }
        return (kw8QXWz47) ((rwhamSOu2) (z ? this.qVUwofr5s : this.Eeka1udhb).q3BipwRCk).getOrDefault(view, null);
    }

    public SBj41z1W0 ixWaw2akD(mhl5lIdbQ mhl5lidbq) {
        ArrayList arrayList = this.cAwN510t2;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(mhl5lidbq);
        if (this.cAwN510t2.size() == 0) {
            this.cAwN510t2 = null;
        }
        return this;
    }

    public final void kCA6Zs9sL(View view, boolean z) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                kw8QXWz47 kw8qxwz47 = new kw8QXWz47(view);
                if (z) {
                    GPLPRo6go(kw8qxwz47);
                } else {
                    dIocxURUo(kw8qxwz47);
                }
                kw8qxwz47.tGV7Q6urW.add(this);
                iiGwOFFnr(kw8qxwz47);
                tGV7Q6urW(z ? this.qVUwofr5s : this.Eeka1udhb, view, kw8qxwz47);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    kCA6Zs9sL(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    public void kmSgne1rO() {
        int i = this.i8XZMQc6Z - 1;
        this.i8XZMQc6Z = i;
        if (i == 0) {
            ArrayList arrayList = this.cAwN510t2;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.cAwN510t2.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((mhl5lIdbQ) arrayList2.get(i2)).J4Ux7ym32(this);
                }
            }
            for (int i3 = 0; i3 < ((NRnsbVC1Y) this.qVUwofr5s.tGV7Q6urW).GPLPRo6go(); i3++) {
                View view = (View) ((NRnsbVC1Y) this.qVUwofr5s.tGV7Q6urW).Puu3Rhg4F(i3);
                if (view != null) {
                    WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                    VCCyeOu6I.qVUwofr5s(view, false);
                }
            }
            for (int i4 = 0; i4 < ((NRnsbVC1Y) this.Eeka1udhb.tGV7Q6urW).GPLPRo6go(); i4++) {
                View view2 = (View) ((NRnsbVC1Y) this.Eeka1udhb.tGV7Q6urW).Puu3Rhg4F(i4);
                if (view2 != null) {
                    WeakHashMap weakHashMap2 = IuQbWntsc.q3BipwRCk;
                    VCCyeOu6I.qVUwofr5s(view2, false);
                }
            }
            this.iMyQMM6Qj = true;
        }
    }

    public void nlGCs0NZs() {
        if (this.i8XZMQc6Z == 0) {
            ArrayList arrayList = this.cAwN510t2;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.cAwN510t2.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((mhl5lIdbQ) arrayList2.get(i)).tGV7Q6urW(this);
                }
            }
            this.iMyQMM6Qj = false;
        }
        this.i8XZMQc6Z++;
    }

    /* renamed from: oon79WMrY */
    public SBj41z1W0 clone() {
        try {
            SBj41z1W0 sBj41z1W0 = (SBj41z1W0) super.clone();
            sBj41z1W0.IytU16YUK = new ArrayList();
            sBj41z1W0.qVUwofr5s = new LKa8y802S(7);
            sBj41z1W0.Eeka1udhb = new LKa8y802S(7);
            sBj41z1W0.ixWaw2akD = null;
            sBj41z1W0.sk5s77z6Q = null;
            return sBj41z1W0;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public SBj41z1W0 q3BipwRCk(mhl5lIdbQ mhl5lidbq) {
        if (this.cAwN510t2 == null) {
            this.cAwN510t2 = new ArrayList();
        }
        this.cAwN510t2.add(mhl5lidbq);
        return this;
    }

    public SBj41z1W0 qFBXIgpia(long j) {
        this.kmSgne1rO = j;
        return this;
    }

    public boolean qVUwofr5s(kw8QXWz47 kw8qxwz47, kw8QXWz47 kw8qxwz472) {
        if (kw8qxwz47 == null || kw8qxwz472 == null) {
            return false;
        }
        String[] MzoOEjc4X = MzoOEjc4X();
        if (MzoOEjc4X != null) {
            for (String str : MzoOEjc4X) {
                if (!dXrmkklc8(kw8qxwz47, kw8qxwz472, str)) {
                }
            }
            return false;
        }
        for (String str2 : kw8qxwz47.q3BipwRCk.keySet()) {
            if (dXrmkklc8(kw8qxwz47, kw8qxwz472, str2)) {
            }
        }
        return false;
        return true;
    }

    public SBj41z1W0 sk5s77z6Q(View view) {
        this.ilHKhw3Yw.remove(view);
        return this;
    }

    @Override // java.lang.Object
    public String toString() {
        return AqaWJg0b4("");
    }

    public Animator vPSbyrYWX(ViewGroup viewGroup, kw8QXWz47 kw8qxwz47, kw8QXWz47 kw8qxwz472) {
        return null;
    }

    public void yWvV4ePLl(boolean z) {
        LKa8y802S lKa8y802S;
        if (z) {
            ((rwhamSOu2) this.qVUwofr5s.q3BipwRCk).clear();
            ((SparseArray) this.qVUwofr5s.J4Ux7ym32).clear();
            lKa8y802S = this.qVUwofr5s;
        } else {
            ((rwhamSOu2) this.Eeka1udhb.q3BipwRCk).clear();
            ((SparseArray) this.Eeka1udhb.J4Ux7ym32).clear();
            lKa8y802S = this.Eeka1udhb;
        }
        ((NRnsbVC1Y) lKa8y802S.tGV7Q6urW).q3BipwRCk();
    }
}
