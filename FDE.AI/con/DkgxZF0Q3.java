package con;

import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
/* loaded from: classes.dex */
public final class DkgxZF0Q3 extends mERTFaPTS implements AfVJL8w1P {
    public final Object[] CBQ5d1kRq;
    public static final ksLrMHgEz kmSgne1rO = new ksLrMHgEz(null, 7);
    public static final DkgxZF0Q3 Bhmn1KIah = new DkgxZF0Q3(new Object[0]);

    public DkgxZF0Q3(Object[] objArr) {
        this.CBQ5d1kRq = objArr;
    }

    @Override // con.Og6dYSoy7
    public int J4Ux7ym32() {
        return this.CBQ5d1kRq.length;
    }

    @Override // con.kVmRinNH6, java.util.List, con.HrqgPICFj
    public HrqgPICFj add(int i, Object obj) {
        YxlPjG8Es.J4Ux7ym32(i, J4Ux7ym32());
        if (i == J4Ux7ym32()) {
            return add(obj);
        }
        if (J4Ux7ym32() < 32) {
            Object[] objArr = new Object[J4Ux7ym32() + 1];
            Jefa2ExbR.AqaWJg0b4(this.CBQ5d1kRq, objArr, 0, 0, i, 6);
            System.arraycopy(this.CBQ5d1kRq, i, objArr, i + 1, J4Ux7ym32() - i);
            objArr[i] = obj;
            return new DkgxZF0Q3(objArr);
        }
        Object[] objArr2 = this.CBQ5d1kRq;
        Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
        System.arraycopy(this.CBQ5d1kRq, i, copyOf, i + 1, (J4Ux7ym32() - 1) - i);
        copyOf[i] = obj;
        return new GfKw8AtcB(copyOf, WAflFGuGp.vPSbyrYWX(this.CBQ5d1kRq[31]), J4Ux7ym32() + 1, 0);
    }

    @Override // con.mERTFaPTS, con.Og6dYSoy7, java.util.Collection, java.util.List, con.HrqgPICFj
    public HrqgPICFj addAll(Collection collection) {
        if (collection.size() + this.CBQ5d1kRq.length <= 32) {
            Object[] objArr = this.CBQ5d1kRq;
            Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
            int length = this.CBQ5d1kRq.length;
            for (Object obj : collection) {
                length++;
                copyOf[length] = obj;
            }
            return new DkgxZF0Q3(copyOf);
        }
        bYMPHjVnt bymphjvnt = (bYMPHjVnt) dIocxURUo();
        bymphjvnt.addAll(collection);
        return bymphjvnt.iiGwOFFnr();
    }

    @Override // con.HrqgPICFj
    public uynHRf1qF dIocxURUo() {
        return new bYMPHjVnt(this, null, this.CBQ5d1kRq, 0);
    }

    @Override // con.kVmRinNH6, java.util.List
    public Object get(int i) {
        YxlPjG8Es.q3BipwRCk(i, J4Ux7ym32());
        return this.CBQ5d1kRq[i];
    }

    @Override // con.kVmRinNH6, java.util.List
    public int indexOf(Object obj) {
        return Jefa2ExbR.mUqPm6GBh(this.CBQ5d1kRq, obj);
    }

    @Override // con.kVmRinNH6, java.util.List
    public int lastIndexOf(Object obj) {
        Object[] objArr = this.CBQ5d1kRq;
        if (obj == null) {
            for (int length = objArr.length - 1; length >= 0; length--) {
                if (objArr[length] == null) {
                    return length;
                }
            }
            return -1;
        }
        for (int length2 = objArr.length - 1; length2 >= 0; length2--) {
            if (anXlDk6fV.tGV7Q6urW(obj, objArr[length2])) {
                return length2;
            }
        }
        return -1;
    }

    @Override // con.kVmRinNH6, java.util.List
    public ListIterator listIterator(int i) {
        YxlPjG8Es.J4Ux7ym32(i, J4Ux7ym32());
        return new pJ2YbbxbH(this.CBQ5d1kRq, i, J4Ux7ym32());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033 A[LOOP:0: B:5:0x0009->B:13:0x0033, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035 A[EDGE_INSN: B:21:0x0035->B:14:0x0035 ?: BREAK  , SYNTHETIC] */
    @Override // con.HrqgPICFj
    /* Code decompiled incorrectly, please refer to instructions dump */
    public con.HrqgPICFj q3BipwRCk(con.PmanMZxiM r10) {
        /*
            r9 = this;
            java.lang.Object[] r0 = r9.CBQ5d1kRq
            int r1 = r0.length
            int r2 = r0.length
            r3 = 0
            if (r2 <= 0) goto L_0x0035
            r4 = r3
            r5 = r4
        L_0x0009:
            int r6 = r4 + 1
            java.lang.Object[] r7 = r9.CBQ5d1kRq
            r7 = r7[r4]
            r8 = r10
            con.Mj7Y8PITn r8 = (con.Mj7Y8PITn) r8
            java.lang.Object r8 = r8.IytU16YUK(r7)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0029
            if (r5 != 0) goto L_0x0030
            java.lang.Object[] r0 = r9.CBQ5d1kRq
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            r5 = 1
            goto L_0x002f
        L_0x0029:
            if (r5 == 0) goto L_0x0030
            int r4 = r1 + 1
            r0[r1] = r7
        L_0x002f:
            r1 = r4
        L_0x0030:
            if (r6 < r2) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r4 = r6
            goto L_0x0009
        L_0x0035:
            java.lang.Object[] r10 = r9.CBQ5d1kRq
            int r10 = r10.length
            if (r1 != r10) goto L_0x003c
            r10 = r9
            goto L_0x004e
        L_0x003c:
            if (r1 != 0) goto L_0x0041
            con.DkgxZF0Q3 r10 = con.DkgxZF0Q3.Bhmn1KIah
            goto L_0x004e
        L_0x0041:
            con.DkgxZF0Q3 r10 = new con.DkgxZF0Q3
            int r2 = r0.length
            con.idpM54xlp.tGV7Q6urW(r1, r2)
            java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r0, r3, r1)
            r10.<init>(r0)
        L_0x004e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: con.DkgxZF0Q3.q3BipwRCk(con.PmanMZxiM):con.HrqgPICFj");
    }

    @Override // con.kVmRinNH6, java.util.List, con.HrqgPICFj
    public HrqgPICFj set(int i, Object obj) {
        YxlPjG8Es.q3BipwRCk(i, J4Ux7ym32());
        Object[] objArr = this.CBQ5d1kRq;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        copyOf[i] = obj;
        return new DkgxZF0Q3(copyOf);
    }

    @Override // con.HrqgPICFj
    public HrqgPICFj tGV7Q6urW(int i) {
        YxlPjG8Es.q3BipwRCk(i, J4Ux7ym32());
        if (J4Ux7ym32() == 1) {
            return Bhmn1KIah;
        }
        Object[] copyOf = Arrays.copyOf(this.CBQ5d1kRq, J4Ux7ym32() - 1);
        int i2 = i + 1;
        System.arraycopy(this.CBQ5d1kRq, i2, copyOf, i, J4Ux7ym32() - i2);
        return new DkgxZF0Q3(copyOf);
    }

    @Override // con.Og6dYSoy7, java.util.Collection, java.util.List, con.HrqgPICFj
    public HrqgPICFj add(Object obj) {
        if (J4Ux7ym32() < 32) {
            Object[] copyOf = Arrays.copyOf(this.CBQ5d1kRq, J4Ux7ym32() + 1);
            copyOf[J4Ux7ym32()] = obj;
            return new DkgxZF0Q3(copyOf);
        }
        return new GfKw8AtcB(this.CBQ5d1kRq, WAflFGuGp.vPSbyrYWX(obj), J4Ux7ym32() + 1, 0);
    }
}
