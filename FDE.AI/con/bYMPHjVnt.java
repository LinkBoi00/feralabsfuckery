package con;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
/* loaded from: classes.dex */
public final class bYMPHjVnt extends cywn6086a implements uynHRf1qF {
    public Object[] Bhmn1KIah;
    public HrqgPICFj CBQ5d1kRq;
    public int Eeka1udhb;
    public uEb6wTQlg MzoOEjc4X = new uEb6wTQlg(8);
    public int PSTqBLTET;
    public Object[] ilHKhw3Yw;
    public Object[] kmSgne1rO;
    public Object[] qVUwofr5s;

    public bYMPHjVnt(HrqgPICFj hrqgPICFj, Object[] objArr, Object[] objArr2, int i) {
        this.CBQ5d1kRq = hrqgPICFj;
        this.kmSgne1rO = objArr;
        this.Bhmn1KIah = objArr2;
        this.PSTqBLTET = i;
        this.ilHKhw3Yw = objArr;
        this.qVUwofr5s = objArr2;
        this.Eeka1udhb = ((Og6dYSoy7) hrqgPICFj).J4Ux7ym32();
    }

    public final void AqaWJg0b4(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArr4;
        int i4 = 1;
        if (i3 >= 1) {
            Object[] Bhmn1KIah = Bhmn1KIah(objArr);
            objArr2[0] = Bhmn1KIah;
            int i5 = i & 31;
            int size = ((collection.size() + i) - 1) & 31;
            int i6 = i2 - i5;
            int i7 = size + i6;
            if (i7 < 32) {
                System.arraycopy(Bhmn1KIah, i5, objArr3, size + 1, i6);
            } else {
                int i8 = (i7 - 32) + 1;
                if (i3 == 1) {
                    objArr4 = Bhmn1KIah;
                } else {
                    objArr4 = MzoOEjc4X();
                    i3--;
                    objArr2[i3] = objArr4;
                }
                int i9 = i2 - i8;
                System.arraycopy(Bhmn1KIah, i9, objArr3, 0, i2 - i9);
                System.arraycopy(Bhmn1KIah, i5, objArr4, size + 1, i9 - i5);
                objArr3 = objArr4;
            }
            Iterator it = collection.iterator();
            GPLPRo6go(Bhmn1KIah, i5, it);
            if (1 < i3) {
                while (true) {
                    int i10 = i4 + 1;
                    Object[] MzoOEjc4X = MzoOEjc4X();
                    GPLPRo6go(MzoOEjc4X, 0, it);
                    objArr2[i4] = MzoOEjc4X;
                    if (i10 >= i3) {
                        break;
                    }
                    i4 = i10;
                }
            }
            GPLPRo6go(objArr3, 0, it);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final Object[] Bhmn1KIah(Object[] objArr) {
        if (objArr == null) {
            return MzoOEjc4X();
        }
        if (CBQ5d1kRq(objArr)) {
            return objArr;
        }
        Object[] MzoOEjc4X = MzoOEjc4X();
        int length = objArr.length;
        Jefa2ExbR.AqaWJg0b4(objArr, MzoOEjc4X, 0, 0, length > 32 ? 32 : length, 6);
        return MzoOEjc4X;
    }

    public final boolean CBQ5d1kRq(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.MzoOEjc4X;
    }

    public final Object CpG0imbht(Object[] objArr, int i, int i2, int i3) {
        int J4Ux7ym32 = J4Ux7ym32() - i;
        if (J4Ux7ym32 == 1) {
            Object obj = this.qVUwofr5s[0];
            dXrmkklc8(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.qVUwofr5s;
        Object obj2 = objArr2[i3];
        Object[] Bhmn1KIah = Bhmn1KIah(objArr2);
        int i4 = i3 + 1;
        System.arraycopy(objArr2, i4, Bhmn1KIah, i3, J4Ux7ym32 - i4);
        Bhmn1KIah[J4Ux7ym32 - 1] = null;
        this.ilHKhw3Yw = objArr;
        this.qVUwofr5s = Bhmn1KIah;
        this.Eeka1udhb = (i + J4Ux7ym32) - 1;
        this.PSTqBLTET = i2;
        return obj2;
    }

    public final Object[] Eeka1udhb(Object[] objArr, int i, int i2, DGdyNqLvN dGdyNqLvN) {
        Object[] objArr2;
        int i3 = ((i2 - 1) >> i) & 31;
        if (i == 5) {
            dGdyNqLvN.J4Ux7ym32 = objArr[i3];
            objArr2 = null;
        } else {
            Object obj = objArr[i3];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = Eeka1udhb((Object[]) obj, i - 5, i2, dGdyNqLvN);
        }
        if (objArr2 == null && i3 == 0) {
            return null;
        }
        Object[] Bhmn1KIah = Bhmn1KIah(objArr);
        Bhmn1KIah[i3] = objArr2;
        return Bhmn1KIah;
    }

    public final Object[] GPLPRo6go(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            i++;
            objArr[i] = it.next();
        }
        return objArr;
    }

    public final Object[] IytU16YUK(Object[] objArr, int i, int i2, DGdyNqLvN dGdyNqLvN) {
        int i3 = 31;
        int i4 = (i2 >> i) & 31;
        if (i == 0) {
            Object obj = objArr[i4];
            Object[] Bhmn1KIah = Bhmn1KIah(objArr);
            int i5 = i4 + 1;
            System.arraycopy(objArr, i5, Bhmn1KIah, i4, 32 - i5);
            Bhmn1KIah[31] = dGdyNqLvN.tGV7Q6urW();
            dGdyNqLvN.J4Ux7ym32 = obj;
            return Bhmn1KIah;
        }
        if (objArr[31] == null) {
            i3 = 31 & ((qFBXIgpia() - 1) >> i);
        }
        Object[] Bhmn1KIah2 = Bhmn1KIah(objArr);
        int i6 = i - 5;
        int i7 = i4 + 1;
        if (i7 <= i3) {
            while (true) {
                i3--;
                Object obj2 = Bhmn1KIah2[i3];
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Bhmn1KIah2[i3] = IytU16YUK((Object[]) obj2, i6, 0, dGdyNqLvN);
                if (i3 == i7) {
                    break;
                }
            }
        }
        Object obj3 = Bhmn1KIah2[i4];
        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Bhmn1KIah2[i4] = IytU16YUK((Object[]) obj3, i6, i2, dGdyNqLvN);
        return Bhmn1KIah2;
    }

    @Override // con.cywn6086a
    public int J4Ux7ym32() {
        return this.Eeka1udhb;
    }

    public final Object[] MzoOEjc4X() {
        Object[] objArr = new Object[33];
        objArr[32] = this.MzoOEjc4X;
        return objArr;
    }

    public final Object[] PSTqBLTET(Object[] objArr, int i) {
        if (CBQ5d1kRq(objArr)) {
            System.arraycopy(objArr, 0, objArr, i, (32 - i) - 0);
            return objArr;
        }
        Object[] MzoOEjc4X = MzoOEjc4X();
        System.arraycopy(objArr, 0, MzoOEjc4X, i, (32 - i) - 0);
        return MzoOEjc4X;
    }

    public final int Puu3Rhg4F() {
        return ((AbstractList) this).modCount;
    }

    public final Object[] RG6kpfv3v(Object[] objArr, int i, int i2, Iterator it) {
        if (it.hasNext()) {
            if (!(i2 >= 0)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (i2 == 0) {
                return (Object[]) it.next();
            } else {
                Object[] Bhmn1KIah = Bhmn1KIah(objArr);
                int i3 = (i >> i2) & 31;
                int i4 = i2 - 5;
                Bhmn1KIah[i3] = RG6kpfv3v((Object[]) Bhmn1KIah[i3], i, i4, it);
                while (true) {
                    i3++;
                    if (i3 >= 32 || !it.hasNext()) {
                        break;
                    }
                    Bhmn1KIah[i3] = RG6kpfv3v((Object[]) Bhmn1KIah[i3], 0, i4, it);
                }
                return Bhmn1KIah;
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final Object[] WaUP0CF08(Object[] objArr, Object[] objArr2, int i) {
        int J4Ux7ym32 = ((J4Ux7ym32() - 1) >> i) & 31;
        Object[] Bhmn1KIah = Bhmn1KIah(objArr);
        if (i == 5) {
            Bhmn1KIah[J4Ux7ym32] = objArr2;
        } else {
            Bhmn1KIah[J4Ux7ym32] = WaUP0CF08((Object[]) Bhmn1KIah[J4Ux7ym32], objArr2, i - 5);
        }
        return Bhmn1KIah;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        YxlPjG8Es.J4Ux7ym32(i, J4Ux7ym32());
        if (i == J4Ux7ym32()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int qFBXIgpia = qFBXIgpia();
        if (i >= qFBXIgpia) {
            vPSbyrYWX(this.ilHKhw3Yw, i - qFBXIgpia, obj);
            return;
        }
        DGdyNqLvN dGdyNqLvN = new DGdyNqLvN(null, 1);
        vPSbyrYWX(oon79WMrY(this.ilHKhw3Yw, this.PSTqBLTET, i, obj, dGdyNqLvN), 0, dGdyNqLvN.tGV7Q6urW());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        Object[] objArr;
        YxlPjG8Es.J4Ux7ym32(i, this.Eeka1udhb);
        if (i == this.Eeka1udhb) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.Eeka1udhb - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            Object[] objArr2 = this.qVUwofr5s;
            Object[] Bhmn1KIah = Bhmn1KIah(objArr2);
            System.arraycopy(objArr2, i3, Bhmn1KIah, (((collection.size() + i) - 1) & 31) + 1, mUqPm6GBh() - i3);
            GPLPRo6go(Bhmn1KIah, i3, collection.iterator());
            this.qVUwofr5s = Bhmn1KIah;
        } else {
            Object[][] objArr3 = new Object[size];
            int mUqPm6GBh = mUqPm6GBh();
            int size2 = collection.size() + this.Eeka1udhb;
            if (size2 > 32) {
                size2 -= (size2 - 1) & -32;
            }
            if (i >= qFBXIgpia()) {
                objArr = MzoOEjc4X();
                AqaWJg0b4(collection, i, this.qVUwofr5s, mUqPm6GBh, objArr3, size, objArr);
            } else if (size2 > mUqPm6GBh) {
                int i4 = size2 - mUqPm6GBh;
                objArr = PSTqBLTET(this.qVUwofr5s, i4);
                yWvV4ePLl(collection, i, i4, objArr3, size, objArr);
            } else {
                Object[] objArr4 = this.qVUwofr5s;
                objArr = MzoOEjc4X();
                int i5 = mUqPm6GBh - size2;
                System.arraycopy(objArr4, i5, objArr, 0, mUqPm6GBh - i5);
                int i6 = 32 - i5;
                Object[] PSTqBLTET = PSTqBLTET(this.qVUwofr5s, i6);
                int i7 = size - 1;
                objArr3[i7] = PSTqBLTET;
                yWvV4ePLl(collection, i, i6, objArr3, i7, PSTqBLTET);
            }
            this.ilHKhw3Yw = ixWaw2akD(this.ilHKhw3Yw, i2, objArr3);
            this.qVUwofr5s = objArr;
        }
        this.Eeka1udhb = collection.size() + this.Eeka1udhb;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
        if (r0 != r10) goto L_0x004d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
        r14 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (iMyQMM6Qj(r20, r10, r11) != r10) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean cAwN510t2(con.PmanMZxiM r20) {
        /*
        // Method dump skipped, instructions count: 269
        */
        throw new UnsupportedOperationException("Method not decompiled: con.bYMPHjVnt.cAwN510t2(con.PmanMZxiM):boolean");
    }

    public final void dXrmkklc8(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.ilHKhw3Yw = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.qVUwofr5s = objArr;
            this.Eeka1udhb = i;
            this.PSTqBLTET = i2;
            return;
        }
        DGdyNqLvN dGdyNqLvN = new DGdyNqLvN(null, 1);
        Object[] Eeka1udhb = Eeka1udhb(objArr, i2, i, dGdyNqLvN);
        Object tGV7Q6urW = dGdyNqLvN.tGV7Q6urW();
        Objects.requireNonNull(tGV7Q6urW, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.qVUwofr5s = (Object[]) tGV7Q6urW;
        this.Eeka1udhb = i;
        if (Eeka1udhb[1] == null) {
            this.ilHKhw3Yw = (Object[]) Eeka1udhb[0];
            i2 -= 5;
        } else {
            this.ilHKhw3Yw = Eeka1udhb;
        }
        this.PSTqBLTET = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[LOOP:0: B:4:0x0006->B:13:0x002a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0027 A[EDGE_INSN: B:16:0x0027->B:12:0x0027 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final int dfpT1j18n(con.PmanMZxiM r8, java.lang.Object[] r9, int r10, con.DGdyNqLvN r11) {
        /*
            r7 = this;
            if (r10 <= 0) goto L_0x002c
            r0 = 0
            r2 = r9
            r3 = r10
            r1 = r0
        L_0x0006:
            int r4 = r0 + 1
            r5 = r9[r0]
            java.lang.Object r6 = r8.IytU16YUK(r5)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x001e
            if (r1 != 0) goto L_0x0025
            java.lang.Object[] r2 = r7.Bhmn1KIah(r9)
            r1 = 1
            goto L_0x0024
        L_0x001e:
            if (r1 == 0) goto L_0x0025
            int r0 = r3 + 1
            r2[r3] = r5
        L_0x0024:
            r3 = r0
        L_0x0025:
            if (r4 < r10) goto L_0x002a
            r9 = r2
            r10 = r3
            goto L_0x002c
        L_0x002a:
            r0 = r4
            goto L_0x0006
        L_0x002c:
            r11.J4Ux7ym32 = r9
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: con.bYMPHjVnt.dfpT1j18n(con.PmanMZxiM, java.lang.Object[], int, con.DGdyNqLvN):int");
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        Object[] objArr;
        YxlPjG8Es.q3BipwRCk(i, J4Ux7ym32());
        if (qFBXIgpia() <= i) {
            objArr = this.qVUwofr5s;
        } else {
            objArr = this.ilHKhw3Yw;
            for (int i2 = this.PSTqBLTET; i2 > 0; i2 -= 5) {
                Object obj = objArr[(i >> i2) & 31];
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    public final int i8XZMQc6Z(PmanMZxiM pmanMZxiM, Object[] objArr, int i, int i2, DGdyNqLvN dGdyNqLvN, List list, List list2) {
        Object[] objArr2;
        if (CBQ5d1kRq(objArr)) {
            list.add(objArr);
        }
        Object tGV7Q6urW = dGdyNqLvN.tGV7Q6urW();
        Objects.requireNonNull(tGV7Q6urW, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) tGV7Q6urW;
        if (i > 0) {
            objArr2 = objArr3;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                Object obj = objArr[i3];
                if (!((Boolean) pmanMZxiM.IytU16YUK(obj)).booleanValue()) {
                    if (i2 == 32) {
                        objArr2 = list.isEmpty() ^ true ? (Object[]) list.remove(list.size() - 1) : MzoOEjc4X();
                        i2 = 0;
                    }
                    i2++;
                    objArr2[i2] = obj;
                }
                if (i4 >= i) {
                    break;
                }
                i3 = i4;
            }
        } else {
            objArr2 = objArr3;
        }
        dGdyNqLvN.J4Ux7ym32 = objArr2;
        if (objArr3 != dGdyNqLvN.tGV7Q6urW()) {
            list2.add(objArr3);
        }
        return i2;
    }

    public final int iMyQMM6Qj(PmanMZxiM pmanMZxiM, int i, DGdyNqLvN dGdyNqLvN) {
        int dfpT1j18n = dfpT1j18n(pmanMZxiM, this.qVUwofr5s, i, dGdyNqLvN);
        if (dfpT1j18n == i) {
            return i;
        }
        Object tGV7Q6urW = dGdyNqLvN.tGV7Q6urW();
        Objects.requireNonNull(tGV7Q6urW, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) tGV7Q6urW;
        Arrays.fill(objArr, dfpT1j18n, i, (Object) null);
        this.qVUwofr5s = objArr;
        this.Eeka1udhb -= i - dfpT1j18n;
        return dfpT1j18n;
    }

    public HrqgPICFj iiGwOFFnr() {
        HrqgPICFj hrqgPICFj;
        Object[] objArr = this.ilHKhw3Yw;
        if (objArr == this.kmSgne1rO && this.qVUwofr5s == this.Bhmn1KIah) {
            hrqgPICFj = this.CBQ5d1kRq;
        } else {
            this.MzoOEjc4X = new uEb6wTQlg(8);
            this.kmSgne1rO = objArr;
            Object[] objArr2 = this.qVUwofr5s;
            this.Bhmn1KIah = objArr2;
            if (objArr == null) {
                if (objArr2.length == 0) {
                    ksLrMHgEz kslrmhgez = DkgxZF0Q3.kmSgne1rO;
                    ksLrMHgEz kslrmhgez2 = DkgxZF0Q3.kmSgne1rO;
                    hrqgPICFj = DkgxZF0Q3.Bhmn1KIah;
                } else {
                    hrqgPICFj = new DkgxZF0Q3(Arrays.copyOf(this.qVUwofr5s, this.Eeka1udhb));
                }
            } else {
                hrqgPICFj = new GfKw8AtcB(objArr, objArr2, this.Eeka1udhb, this.PSTqBLTET);
            }
        }
        this.CBQ5d1kRq = hrqgPICFj;
        return hrqgPICFj;
    }

    public final Object[] ilHKhw3Yw(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.MzoOEjc4X;
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator();
    }

    public final Object[] ixWaw2akD(Object[] objArr, int i, Object[][] objArr2) {
        lP4K00fUB lp4k00fub = new lP4K00fUB(objArr2);
        int i2 = i >> 5;
        int i3 = this.PSTqBLTET;
        Object[] RG6kpfv3v = i2 < (1 << i3) ? RG6kpfv3v(objArr, i, i3, lp4k00fub) : Bhmn1KIah(objArr);
        while (lp4k00fub.hasNext()) {
            this.PSTqBLTET += 5;
            RG6kpfv3v = ilHKhw3Yw(RG6kpfv3v);
            int i4 = this.PSTqBLTET;
            RG6kpfv3v(RG6kpfv3v, 1 << i4, i4, lp4k00fub);
        }
        return RG6kpfv3v;
    }

    @Override // con.cywn6086a
    public Object kCA6Zs9sL(int i) {
        YxlPjG8Es.q3BipwRCk(i, J4Ux7ym32());
        ((AbstractList) this).modCount++;
        int qFBXIgpia = qFBXIgpia();
        if (i >= qFBXIgpia) {
            return CpG0imbht(this.ilHKhw3Yw, qFBXIgpia, this.PSTqBLTET, i - qFBXIgpia);
        }
        DGdyNqLvN dGdyNqLvN = new DGdyNqLvN(this.qVUwofr5s[0], 1);
        CpG0imbht(IytU16YUK(this.ilHKhw3Yw, this.PSTqBLTET, i, dGdyNqLvN), qFBXIgpia, this.PSTqBLTET, 0);
        return dGdyNqLvN.tGV7Q6urW();
    }

    public final ListIterator kmSgne1rO(int i) {
        if (this.ilHKhw3Yw != null) {
            int qFBXIgpia = qFBXIgpia() >> 5;
            YxlPjG8Es.J4Ux7ym32(i, qFBXIgpia);
            int i2 = this.PSTqBLTET;
            if (i2 == 0) {
                return new pJ2YbbxbH(this.ilHKhw3Yw, i);
            }
            return new vXaCS6jDZ(this.ilHKhw3Yw, i, qFBXIgpia, i2 / 5);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i) {
        YxlPjG8Es.J4Ux7ym32(i, J4Ux7ym32());
        return new gTk6g9BOk(this, i);
    }

    public final int mUqPm6GBh() {
        int i = this.Eeka1udhb;
        return i <= 32 ? i : i - ((i - 1) & -32);
    }

    public final Object[] nlGCs0NZs(Object[] objArr, int i, int i2, Object obj, DGdyNqLvN dGdyNqLvN) {
        int i3 = (i2 >> i) & 31;
        Object[] Bhmn1KIah = Bhmn1KIah(objArr);
        if (i == 0) {
            if (Bhmn1KIah != objArr) {
                ((AbstractList) this).modCount++;
            }
            dGdyNqLvN.J4Ux7ym32 = Bhmn1KIah[i3];
            Bhmn1KIah[i3] = obj;
            return Bhmn1KIah;
        }
        Object obj2 = Bhmn1KIah[i3];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Bhmn1KIah[i3] = nlGCs0NZs((Object[]) obj2, i - 5, i2, obj, dGdyNqLvN);
        return Bhmn1KIah;
    }

    public final Object[] oon79WMrY(Object[] objArr, int i, int i2, Object obj, DGdyNqLvN dGdyNqLvN) {
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            dGdyNqLvN.J4Ux7ym32 = objArr[31];
            Object[] Bhmn1KIah = Bhmn1KIah(objArr);
            System.arraycopy(objArr, i3, Bhmn1KIah, i3 + 1, 31 - i3);
            Bhmn1KIah[i3] = obj;
            return Bhmn1KIah;
        }
        Object[] Bhmn1KIah2 = Bhmn1KIah(objArr);
        int i4 = i - 5;
        Object obj2 = Bhmn1KIah2[i3];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Bhmn1KIah2[i3] = oon79WMrY((Object[]) obj2, i4, i2, obj, dGdyNqLvN);
        int i5 = i3 + 1;
        if (i5 < 32) {
            while (true) {
                int i6 = i5 + 1;
                if (Bhmn1KIah2[i5] == null) {
                    break;
                }
                Object obj3 = Bhmn1KIah2[i5];
                Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Bhmn1KIah2[i5] = oon79WMrY((Object[]) obj3, i4, 0, dGdyNqLvN.tGV7Q6urW(), dGdyNqLvN);
                if (i6 >= 32) {
                    break;
                }
                i5 = i6;
            }
        }
        return Bhmn1KIah2;
    }

    public final int qFBXIgpia() {
        if (J4Ux7ym32() <= 32) {
            return 0;
        }
        return (J4Ux7ym32() - 1) & -32;
    }

    public final Object[] qVUwofr5s(Object[] objArr, int i, int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (i2 == 0) {
            return objArr;
        } else {
            int i3 = (i >> i2) & 31;
            Object obj = objArr[i3];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object qVUwofr5s = qVUwofr5s((Object[]) obj, i, i2 - 5);
            if (i3 < 31) {
                int i4 = i3 + 1;
                if (objArr[i4] != null) {
                    if (CBQ5d1kRq(objArr)) {
                        Arrays.fill(objArr, i4, 32, (Object) null);
                    }
                    Object[] MzoOEjc4X = MzoOEjc4X();
                    System.arraycopy(objArr, 0, MzoOEjc4X, 0, i4 - 0);
                    objArr = MzoOEjc4X;
                }
            }
            if (qVUwofr5s == objArr[i3]) {
                return objArr;
            }
            Object[] Bhmn1KIah = Bhmn1KIah(objArr);
            Bhmn1KIah[i3] = qVUwofr5s;
            return Bhmn1KIah;
        }
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        return cAwN510t2(new Mj7Y8PITn(collection, 1));
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        YxlPjG8Es.q3BipwRCk(i, J4Ux7ym32());
        if (qFBXIgpia() <= i) {
            Object[] Bhmn1KIah = Bhmn1KIah(this.qVUwofr5s);
            if (Bhmn1KIah != this.qVUwofr5s) {
                ((AbstractList) this).modCount++;
            }
            int i2 = i & 31;
            Object obj2 = Bhmn1KIah[i2];
            Bhmn1KIah[i2] = obj;
            this.qVUwofr5s = Bhmn1KIah;
            return obj2;
        }
        DGdyNqLvN dGdyNqLvN = new DGdyNqLvN(null, 1);
        this.ilHKhw3Yw = nlGCs0NZs(this.ilHKhw3Yw, this.PSTqBLTET, i, obj, dGdyNqLvN);
        return dGdyNqLvN.tGV7Q6urW();
    }

    public final void sk5s77z6Q(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.Eeka1udhb >> 5;
        int i2 = this.PSTqBLTET;
        if (i > (1 << i2)) {
            this.ilHKhw3Yw = WaUP0CF08(ilHKhw3Yw(objArr), objArr2, this.PSTqBLTET + 5);
            this.qVUwofr5s = objArr3;
            this.PSTqBLTET += 5;
        } else {
            if (objArr == null) {
                this.ilHKhw3Yw = objArr2;
            } else {
                this.ilHKhw3Yw = WaUP0CF08(objArr, objArr2, i2);
            }
            this.qVUwofr5s = objArr3;
        }
        this.Eeka1udhb++;
    }

    public final void vPSbyrYWX(Object[] objArr, int i, Object obj) {
        int mUqPm6GBh = mUqPm6GBh();
        Object[] Bhmn1KIah = Bhmn1KIah(this.qVUwofr5s);
        if (mUqPm6GBh < 32) {
            System.arraycopy(this.qVUwofr5s, i, Bhmn1KIah, i + 1, mUqPm6GBh - i);
            Bhmn1KIah[i] = obj;
            this.ilHKhw3Yw = objArr;
            this.qVUwofr5s = Bhmn1KIah;
            this.Eeka1udhb = J4Ux7ym32() + 1;
            return;
        }
        Object[] objArr2 = this.qVUwofr5s;
        Object obj2 = objArr2[31];
        System.arraycopy(objArr2, i, Bhmn1KIah, i + 1, 31 - i);
        Bhmn1KIah[i] = obj;
        sk5s77z6Q(objArr, Bhmn1KIah, ilHKhw3Yw(obj2));
    }

    public final void yWvV4ePLl(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.ilHKhw3Yw != null) {
            int i4 = i >> 5;
            ListIterator kmSgne1rO = kmSgne1rO(qFBXIgpia() >> 5);
            int i5 = i3;
            Object[] objArr3 = objArr2;
            while (((wwj2VvJy1) kmSgne1rO).CBQ5d1kRq - 1 != i4) {
                Object[] objArr4 = (Object[]) kmSgne1rO.previous();
                int i6 = 32 - i2;
                System.arraycopy(objArr4, i6, objArr3, 0, 32 - i6);
                objArr3 = PSTqBLTET(objArr4, i2);
                i5--;
                objArr[i5] = objArr3;
            }
            Object[] objArr5 = (Object[]) kmSgne1rO.previous();
            int qFBXIgpia = i3 - (((qFBXIgpia() >> 5) - 1) - i4);
            if (qFBXIgpia < i3) {
                objArr2 = objArr[qFBXIgpia];
            }
            AqaWJg0b4(collection, i, objArr5, 32, objArr, qFBXIgpia, objArr2);
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int mUqPm6GBh = mUqPm6GBh();
        if (mUqPm6GBh < 32) {
            Object[] Bhmn1KIah = Bhmn1KIah(this.qVUwofr5s);
            Bhmn1KIah[mUqPm6GBh] = obj;
            this.qVUwofr5s = Bhmn1KIah;
            this.Eeka1udhb = J4Ux7ym32() + 1;
        } else {
            sk5s77z6Q(this.ilHKhw3Yw, this.qVUwofr5s, ilHKhw3Yw(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int mUqPm6GBh = mUqPm6GBh();
        Iterator it = collection.iterator();
        if (32 - mUqPm6GBh >= collection.size()) {
            Object[] Bhmn1KIah = Bhmn1KIah(this.qVUwofr5s);
            GPLPRo6go(Bhmn1KIah, mUqPm6GBh, it);
            this.qVUwofr5s = Bhmn1KIah;
        } else {
            int size = ((collection.size() + mUqPm6GBh) - 1) / 32;
            Object[][] objArr = new Object[size];
            Object[] Bhmn1KIah2 = Bhmn1KIah(this.qVUwofr5s);
            GPLPRo6go(Bhmn1KIah2, mUqPm6GBh, it);
            objArr[0] = Bhmn1KIah2;
            if (1 < size) {
                int i = 1;
                while (true) {
                    int i2 = i + 1;
                    Object[] MzoOEjc4X = MzoOEjc4X();
                    GPLPRo6go(MzoOEjc4X, 0, it);
                    objArr[i] = MzoOEjc4X;
                    if (i2 >= size) {
                        break;
                    }
                    i = i2;
                }
            }
            this.ilHKhw3Yw = ixWaw2akD(this.ilHKhw3Yw, qFBXIgpia(), objArr);
            Object[] MzoOEjc4X2 = MzoOEjc4X();
            GPLPRo6go(MzoOEjc4X2, 0, it);
            this.qVUwofr5s = MzoOEjc4X2;
        }
        this.Eeka1udhb = collection.size() + J4Ux7ym32();
        return true;
    }
}
