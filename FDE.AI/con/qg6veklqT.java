package con;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class qg6veklqT implements USS5dphka {
    public final z3ICU5k15 CBQ5d1kRq;
    public final HashSet MzoOEjc4X;
    public final wpXpbWG1J WaUP0CF08;
    public final List dXrmkklc8;
    public boolean i8XZMQc6Z;
    public final W3r8jsmHE ilHKhw3Yw;
    public final GX14exZ1F kmSgne1rO;
    public boolean sk5s77z6Q;
    public final AtomicReference Bhmn1KIah = new AtomicReference(null);
    public final Object PSTqBLTET = new Object();
    public final Y6HEag5Dd qVUwofr5s = new Y6HEag5Dd();
    public final Y6HEag5Dd Eeka1udhb = new Y6HEag5Dd();
    public final Y6HEag5Dd RG6kpfv3v = new Y6HEag5Dd();
    public QuZ1OlV57 ixWaw2akD = new QuZ1OlV57(0, 1);

    public qg6veklqT(z3ICU5k15 z3icu5k15, GX14exZ1F gX14exZ1F, bu5cjmae6 bu5cjmae6, int i) {
        this.CBQ5d1kRq = z3icu5k15;
        this.kmSgne1rO = gX14exZ1F;
        HashSet hashSet = new HashSet();
        this.MzoOEjc4X = hashSet;
        W3r8jsmHE w3r8jsmHE = new W3r8jsmHE();
        this.ilHKhw3Yw = w3r8jsmHE;
        ArrayList arrayList = new ArrayList();
        this.dXrmkklc8 = arrayList;
        wpXpbWG1J wpxpbwg1j = new wpXpbWG1J(gX14exZ1F, z3icu5k15, w3r8jsmHE, hashSet, arrayList, this);
        z3icu5k15.yWvV4ePLl(wpxpbwg1j);
        this.WaUP0CF08 = wpxpbwg1j;
        boolean z = z3icu5k15 instanceof rQamjxEL9;
        MZTtfy1Hp mZTtfy1Hp = MZTtfy1Hp.q3BipwRCk;
        kkcQgCx5G kkcqgcx5g = MZTtfy1Hp.J4Ux7ym32;
    }

    public static final void iiGwOFFnr(qg6veklqT qg6veklqt, IXMg0nBBI iXMg0nBBI, Object obj) {
        Y6HEag5Dd y6HEag5Dd = qg6veklqt.qVUwofr5s;
        int tGV7Q6urW = y6HEag5Dd.tGV7Q6urW(obj);
        if (tGV7Q6urW >= 0) {
            OavOIaZo5 oavOIaZo5 = y6HEag5Dd.tGV7Q6urW[y6HEag5Dd.q3BipwRCk[tGV7Q6urW]];
            Objects.requireNonNull(oavOIaZo5);
            lP4K00fUB lp4k00fub = new lP4K00fUB(oavOIaZo5);
            while (lp4k00fub.hasNext()) {
                rESgwfV20 resgwfv20 = (rESgwfV20) lp4k00fub.next();
                if (!qg6veklqt.RG6kpfv3v.dIocxURUo(obj, resgwfv20) && resgwfv20.tGV7Q6urW(obj) != 1) {
                    HashSet hashSet = (HashSet) iXMg0nBBI.CBQ5d1kRq;
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        iXMg0nBBI.CBQ5d1kRq = hashSet;
                    }
                    hashSet.add(resgwfv20);
                }
            }
        }
    }

    public boolean Bhmn1KIah() {
        boolean z;
        synchronized (this.PSTqBLTET) {
            yWvV4ePLl();
            wpXpbWG1J wpxpbwg1j = this.WaUP0CF08;
            QuZ1OlV57 quZ1OlV57 = this.ixWaw2akD;
            z = false;
            this.ixWaw2akD = new QuZ1OlV57(0, 1);
            if (wpxpbwg1j.iiGwOFFnr.isEmpty()) {
                if ((quZ1OlV57.J4Ux7ym32 > 0) || (!wpxpbwg1j.qVUwofr5s.isEmpty())) {
                    wpxpbwg1j.Bhmn1KIah(quZ1OlV57, null);
                    z = !wpxpbwg1j.iiGwOFFnr.isEmpty();
                }
                if (!z) {
                    oon79WMrY();
                }
            } else {
                G7WvUK4mQ.tGV7Q6urW("Expected applyChanges() to have been called".toString());
                throw null;
            }
        }
        return z;
    }

    public void CBQ5d1kRq() {
        synchronized (this.PSTqBLTET) {
            Object[] objArr = this.ilHKhw3Yw.Bhmn1KIah;
            for (Object obj : objArr) {
                rESgwfV20 resgwfv20 = obj instanceof rESgwfV20 ? (rESgwfV20) obj : null;
                if (resgwfv20 != null) {
                    resgwfv20.J4Ux7ym32();
                }
            }
        }
    }

    public void GPLPRo6go() {
        Throwable th;
        ZVqfObOve kCA6Zs9sL;
        gl0eeduiq gl0eeduiq;
        int i;
        int i2;
        int i3;
        int i4;
        synchronized (this.PSTqBLTET) {
            gl0eeduiq gl0eeduiq2 = new gl0eeduiq(this.MzoOEjc4X);
            try {
                Objects.requireNonNull(this.kmSgne1rO);
                kCA6Zs9sL = this.ilHKhw3Yw.kCA6Zs9sL();
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                GX14exZ1F gX14exZ1F = this.kmSgne1rO;
                List list = this.dXrmkklc8;
                int size = list.size() - 1;
                int i5 = 0;
                if (size >= 0) {
                    int i6 = 0;
                    while (true) {
                        int i7 = i6 + 1;
                        ((NzvP5Rex8) list.get(i6)).sk5s77z6Q(gX14exZ1F, kCA6Zs9sL, gl0eeduiq2);
                        if (i7 > size) {
                            break;
                        }
                        i6 = i7;
                    }
                }
                this.dXrmkklc8.clear();
                kCA6Zs9sL.iiGwOFFnr();
                this.kmSgne1rO.tGV7Q6urW();
                gl0eeduiq2.J4Ux7ym32();
                if (!gl0eeduiq2.dIocxURUo.isEmpty()) {
                    List list2 = gl0eeduiq2.dIocxURUo;
                    int size2 = list2.size() - 1;
                    if (size2 >= 0) {
                        int i8 = 0;
                        while (true) {
                            int i9 = i8 + 1;
                            ((gdEmqfwpT) list2.get(i8)).GPLPRo6go();
                            if (i9 > size2) {
                                break;
                            }
                            i8 = i9;
                        }
                    }
                    gl0eeduiq2.dIocxURUo.clear();
                }
                if (this.sk5s77z6Q) {
                    this.sk5s77z6Q = false;
                    Y6HEag5Dd y6HEag5Dd = this.qVUwofr5s;
                    int i10 = y6HEag5Dd.dIocxURUo;
                    if (i10 > 0) {
                        int i11 = 0;
                        i = 0;
                        while (true) {
                            int i12 = i11 + 1;
                            int i13 = y6HEag5Dd.q3BipwRCk[i11];
                            OavOIaZo5 oavOIaZo5 = y6HEag5Dd.tGV7Q6urW[i13];
                            int i14 = oavOIaZo5.CBQ5d1kRq;
                            if (i14 > 0) {
                                int i15 = i5;
                                i4 = i15;
                                while (true) {
                                    int i16 = i15 + 1;
                                    Object obj = oavOIaZo5.kmSgne1rO[i15];
                                    if (obj != null) {
                                        if (!(!((rESgwfV20) obj).q3BipwRCk())) {
                                            if (i4 != i15) {
                                                oavOIaZo5.kmSgne1rO[i4] = obj;
                                            }
                                            i4++;
                                        }
                                        if (i16 >= i14) {
                                            break;
                                        }
                                        i15 = i16;
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    }
                                }
                            } else {
                                i4 = 0;
                            }
                            int i17 = oavOIaZo5.CBQ5d1kRq;
                            if (i4 < i17) {
                                int i18 = i4;
                                while (true) {
                                    int i19 = i18 + 1;
                                    oavOIaZo5.kmSgne1rO[i18] = null;
                                    if (i19 >= i17) {
                                        break;
                                    }
                                    i18 = i19;
                                }
                            }
                            oavOIaZo5.CBQ5d1kRq = i4;
                            if (i4 > 0) {
                                if (i != i11) {
                                    int[] iArr = y6HEag5Dd.q3BipwRCk;
                                    int i20 = iArr[i];
                                    iArr[i] = i13;
                                    iArr[i11] = i20;
                                }
                                i++;
                            }
                            if (i12 >= i10) {
                                break;
                            }
                            i11 = i12;
                            i5 = 0;
                        }
                    } else {
                        i = 0;
                    }
                    int i21 = y6HEag5Dd.dIocxURUo;
                    if (i < i21) {
                        int i22 = i;
                        while (true) {
                            int i23 = i22 + 1;
                            y6HEag5Dd.J4Ux7ym32[y6HEag5Dd.q3BipwRCk[i22]] = null;
                            if (i23 >= i21) {
                                break;
                            }
                            i22 = i23;
                        }
                    }
                    y6HEag5Dd.dIocxURUo = i;
                    Y6HEag5Dd y6HEag5Dd2 = this.Eeka1udhb;
                    int i24 = y6HEag5Dd2.dIocxURUo;
                    if (i24 > 0) {
                        int i25 = 0;
                        i2 = 0;
                        while (true) {
                            int i26 = i25 + 1;
                            int i27 = y6HEag5Dd2.q3BipwRCk[i25];
                            OavOIaZo5 oavOIaZo52 = y6HEag5Dd2.tGV7Q6urW[i27];
                            int i28 = oavOIaZo52.CBQ5d1kRq;
                            if (i28 > 0) {
                                int i29 = 0;
                                i3 = 0;
                                while (true) {
                                    int i30 = i29 + 1;
                                    Object obj2 = oavOIaZo52.kmSgne1rO[i29];
                                    if (obj2 != null) {
                                        gl0eeduiq = gl0eeduiq2;
                                        if (!(!(this.qVUwofr5s.tGV7Q6urW((vhdnXl5MS) obj2) >= 0))) {
                                            if (i3 != i29) {
                                                oavOIaZo52.kmSgne1rO[i3] = obj2;
                                            }
                                            i3++;
                                        }
                                        if (i30 >= i28) {
                                            break;
                                        }
                                        i29 = i30;
                                        gl0eeduiq2 = gl0eeduiq;
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                    }
                                }
                            } else {
                                gl0eeduiq = gl0eeduiq2;
                                i3 = 0;
                            }
                            int i31 = oavOIaZo52.CBQ5d1kRq;
                            if (i3 < i31) {
                                int i32 = i3;
                                while (true) {
                                    int i33 = i32 + 1;
                                    oavOIaZo52.kmSgne1rO[i32] = null;
                                    if (i33 >= i31) {
                                        break;
                                    }
                                    i32 = i33;
                                }
                            }
                            oavOIaZo52.CBQ5d1kRq = i3;
                            if (i3 > 0) {
                                if (i2 != i25) {
                                    int[] iArr2 = y6HEag5Dd2.q3BipwRCk;
                                    int i34 = iArr2[i2];
                                    iArr2[i2] = i27;
                                    iArr2[i25] = i34;
                                }
                                i2++;
                            }
                            if (i26 >= i24) {
                                break;
                            }
                            i25 = i26;
                            gl0eeduiq2 = gl0eeduiq;
                        }
                    } else {
                        gl0eeduiq = gl0eeduiq2;
                        i2 = 0;
                    }
                    int i35 = y6HEag5Dd2.dIocxURUo;
                    if (i2 < i35) {
                        int i36 = i2;
                        while (true) {
                            int i37 = i36 + 1;
                            y6HEag5Dd2.J4Ux7ym32[y6HEag5Dd2.q3BipwRCk[i36]] = null;
                            if (i37 >= i35) {
                                break;
                            }
                            i36 = i37;
                        }
                    }
                    y6HEag5Dd2.dIocxURUo = i2;
                } else {
                    gl0eeduiq = gl0eeduiq2;
                }
                gl0eeduiq.q3BipwRCk();
                oon79WMrY();
            } catch (Throwable th3) {
                th = th3;
                gl0eeduiq2.q3BipwRCk();
                throw th;
            }
        }
    }

    @Override // con.v0l3RHDWl
    public boolean J4Ux7ym32() {
        return this.i8XZMQc6Z;
    }

    public void MzoOEjc4X(Object obj) {
        synchronized (this.PSTqBLTET) {
            kmSgne1rO(obj);
            Y6HEag5Dd y6HEag5Dd = this.Eeka1udhb;
            int tGV7Q6urW = y6HEag5Dd.tGV7Q6urW(obj);
            if (tGV7Q6urW >= 0) {
                for (vhdnXl5MS vhdnxl5ms : y6HEag5Dd.tGV7Q6urW[y6HEag5Dd.q3BipwRCk[tGV7Q6urW]]) {
                    kmSgne1rO(vhdnxl5ms);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d7  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void PSTqBLTET(java.lang.Object r21) {
        /*
        // Method dump skipped, instructions count: 506
        */
        throw new UnsupportedOperationException("Method not decompiled: con.qg6veklqT.PSTqBLTET(java.lang.Object):void");
    }

    public void Puu3Rhg4F(kkcQgCx5G kkcqgcx5g) {
        try {
            synchronized (this.PSTqBLTET) {
                yWvV4ePLl();
                wpXpbWG1J wpxpbwg1j = this.WaUP0CF08;
                QuZ1OlV57 quZ1OlV57 = this.ixWaw2akD;
                this.ixWaw2akD = new QuZ1OlV57(0, 1);
                if (wpxpbwg1j.iiGwOFFnr.isEmpty()) {
                    wpxpbwg1j.Bhmn1KIah(quZ1OlV57, kkcqgcx5g);
                } else {
                    G7WvUK4mQ.tGV7Q6urW("Expected applyChanges() to have been called".toString());
                    throw null;
                }
            }
        } catch (Throwable th) {
            if (!this.MzoOEjc4X.isEmpty()) {
                HashSet hashSet = this.MzoOEjc4X;
                new ArrayList();
                new ArrayList();
                new ArrayList();
                if (true ^ hashSet.isEmpty()) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        it.remove();
                        ((knaaJ6t3r) it.next()).tGV7Q6urW();
                    }
                }
            }
            throw th;
        }
    }

    @Override // con.v0l3RHDWl
    public void dIocxURUo(kkcQgCx5G kkcqgcx5g) {
        if (!this.i8XZMQc6Z) {
            this.CBQ5d1kRq.q3BipwRCk(this, kkcqgcx5g);
            return;
        }
        throw new IllegalStateException("The composition is disposed".toString());
    }

    @Override // con.v0l3RHDWl
    public boolean kCA6Zs9sL() {
        boolean z;
        synchronized (this.PSTqBLTET) {
            z = this.ixWaw2akD.J4Ux7ym32 > 0;
        }
        return z;
    }

    public final void kmSgne1rO(Object obj) {
        Y6HEag5Dd y6HEag5Dd = this.qVUwofr5s;
        int tGV7Q6urW = y6HEag5Dd.tGV7Q6urW(obj);
        if (tGV7Q6urW >= 0) {
            OavOIaZo5 oavOIaZo5 = y6HEag5Dd.tGV7Q6urW[y6HEag5Dd.q3BipwRCk[tGV7Q6urW]];
            Objects.requireNonNull(oavOIaZo5);
            lP4K00fUB lp4k00fub = new lP4K00fUB(oavOIaZo5);
            while (lp4k00fub.hasNext()) {
                rESgwfV20 resgwfv20 = (rESgwfV20) lp4k00fub.next();
                if (resgwfv20.tGV7Q6urW(obj) == 4) {
                    this.RG6kpfv3v.q3BipwRCk(obj, resgwfv20);
                }
            }
        }
    }

    public final void oon79WMrY() {
        Object andSet = this.Bhmn1KIah.getAndSet(null);
        Object obj = MLnKY8xDo.q3BipwRCk;
        if (!anXlDk6fV.tGV7Q6urW(andSet, MLnKY8xDo.q3BipwRCk)) {
            if (andSet instanceof Set) {
                tGV7Q6urW((Set) andSet);
            } else if (andSet instanceof Object[]) {
                Set[] setArr = (Set[]) andSet;
                int i = 0;
                int length = setArr.length;
                while (i < length) {
                    Set set = setArr[i];
                    i++;
                    tGV7Q6urW(set);
                }
            } else if (andSet == null) {
                throw new IllegalStateException("calling recordModificationsOf and applyChanges concurrently is not supported".toString());
            } else {
                throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("corrupt pendingModifications drain: ", this.Bhmn1KIah).toString());
            }
        }
    }

    @Override // con.v0l3RHDWl
    public void q3BipwRCk() {
        synchronized (this.PSTqBLTET) {
            if (!this.i8XZMQc6Z) {
                this.i8XZMQc6Z = true;
                MZTtfy1Hp mZTtfy1Hp = MZTtfy1Hp.q3BipwRCk;
                kkcQgCx5G kkcqgcx5g = MZTtfy1Hp.tGV7Q6urW;
                boolean z = this.ilHKhw3Yw.kmSgne1rO > 0;
                if (z || (true ^ this.MzoOEjc4X.isEmpty())) {
                    gl0eeduiq gl0eeduiq = new gl0eeduiq(this.MzoOEjc4X);
                    if (z) {
                        ZVqfObOve kCA6Zs9sL = this.ilHKhw3Yw.kCA6Zs9sL();
                        G7WvUK4mQ.kCA6Zs9sL(kCA6Zs9sL, gl0eeduiq);
                        kCA6Zs9sL.iiGwOFFnr();
                        WfopS3efW wfopS3efW = (WfopS3efW) this.kmSgne1rO;
                        wfopS3efW.J4Ux7ym32.clear();
                        wfopS3efW.tGV7Q6urW = wfopS3efW.q3BipwRCk;
                        wfopS3efW.iiGwOFFnr();
                        gl0eeduiq.J4Ux7ym32();
                    }
                    gl0eeduiq.q3BipwRCk();
                }
                this.WaUP0CF08.kmSgne1rO();
            }
        }
        this.CBQ5d1kRq.CBQ5d1kRq(this);
    }

    public final void tGV7Q6urW(Set set) {
        int i;
        int i2;
        IXMg0nBBI iXMg0nBBI = new IXMg0nBBI();
        for (Object obj : set) {
            if (obj instanceof rESgwfV20) {
                ((rESgwfV20) obj).tGV7Q6urW(null);
            } else {
                iiGwOFFnr(this, iXMg0nBBI, obj);
                Y6HEag5Dd y6HEag5Dd = this.Eeka1udhb;
                int tGV7Q6urW = y6HEag5Dd.tGV7Q6urW(obj);
                if (tGV7Q6urW >= 0) {
                    OavOIaZo5 oavOIaZo5 = y6HEag5Dd.tGV7Q6urW[y6HEag5Dd.q3BipwRCk[tGV7Q6urW]];
                    Objects.requireNonNull(oavOIaZo5);
                    lP4K00fUB lp4k00fub = new lP4K00fUB(oavOIaZo5);
                    while (lp4k00fub.hasNext()) {
                        iiGwOFFnr(this, iXMg0nBBI, (vhdnXl5MS) lp4k00fub.next());
                    }
                }
            }
        }
        HashSet hashSet = (HashSet) iXMg0nBBI.CBQ5d1kRq;
        if (hashSet != null) {
            Y6HEag5Dd y6HEag5Dd2 = this.qVUwofr5s;
            int i3 = y6HEag5Dd2.dIocxURUo;
            if (i3 > 0) {
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int i6 = i4 + 1;
                    int i7 = y6HEag5Dd2.q3BipwRCk[i4];
                    OavOIaZo5 oavOIaZo52 = y6HEag5Dd2.tGV7Q6urW[i7];
                    int i8 = oavOIaZo52.CBQ5d1kRq;
                    if (i8 > 0) {
                        int i9 = 0;
                        i2 = 0;
                        while (true) {
                            int i10 = i9 + 1;
                            Object obj2 = oavOIaZo52.kmSgne1rO[i9];
                            Objects.requireNonNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            if (!hashSet.contains((rESgwfV20) obj2)) {
                                if (i2 != i9) {
                                    oavOIaZo52.kmSgne1rO[i2] = obj2;
                                }
                                i2++;
                            }
                            if (i10 >= i8) {
                                break;
                            }
                            i9 = i10;
                        }
                    } else {
                        i2 = 0;
                    }
                    int i11 = oavOIaZo52.CBQ5d1kRq;
                    if (i2 < i11) {
                        int i12 = i2;
                        while (true) {
                            int i13 = i12 + 1;
                            oavOIaZo52.kmSgne1rO[i12] = null;
                            if (i13 >= i11) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    oavOIaZo52.CBQ5d1kRq = i2;
                    if (i2 > 0) {
                        if (i5 != i4) {
                            int[] iArr = y6HEag5Dd2.q3BipwRCk;
                            int i14 = iArr[i5];
                            iArr[i5] = i7;
                            iArr[i4] = i14;
                        }
                        i5++;
                    }
                    if (i6 >= i3) {
                        break;
                    }
                    i4 = i6;
                }
                i = i5;
            } else {
                i = 0;
            }
            int i15 = y6HEag5Dd2.dIocxURUo;
            if (i < i15) {
                int i16 = i;
                while (true) {
                    int i17 = i16 + 1;
                    y6HEag5Dd2.J4Ux7ym32[y6HEag5Dd2.q3BipwRCk[i16]] = null;
                    if (i17 >= i15) {
                        break;
                    }
                    i16 = i17;
                }
            }
            y6HEag5Dd2.dIocxURUo = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a6 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final int vPSbyrYWX(con.rESgwfV20 r10, java.lang.Object r11) {
        /*
        // Method dump skipped, instructions count: 235
        */
        throw new UnsupportedOperationException("Method not decompiled: con.qg6veklqT.vPSbyrYWX(con.rESgwfV20, java.lang.Object):int");
    }

    public final void yWvV4ePLl() {
        AtomicReference atomicReference = this.Bhmn1KIah;
        Object obj = MLnKY8xDo.q3BipwRCk;
        Object obj2 = MLnKY8xDo.q3BipwRCk;
        Object andSet = atomicReference.getAndSet(obj2);
        if (andSet != null) {
            if (anXlDk6fV.tGV7Q6urW(andSet, obj2)) {
                throw new IllegalStateException("pending composition has not been applied".toString());
            } else if (andSet instanceof Set) {
                tGV7Q6urW((Set) andSet);
            } else if (andSet instanceof Object[]) {
                Set[] setArr = (Set[]) andSet;
                int i = 0;
                int length = setArr.length;
                while (i < length) {
                    Set set = setArr[i];
                    i++;
                    tGV7Q6urW(set);
                }
            } else {
                throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("corrupt pendingModifications drain: ", this.Bhmn1KIah).toString());
            }
        }
    }
}
