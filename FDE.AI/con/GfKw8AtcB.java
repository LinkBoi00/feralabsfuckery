package con;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.Objects;
/* loaded from: classes.dex */
public final class GfKw8AtcB extends mERTFaPTS {
    public final int Bhmn1KIah;
    public final Object[] CBQ5d1kRq;
    public final int PSTqBLTET;
    public final Object[] kmSgne1rO;

    public GfKw8AtcB(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.CBQ5d1kRq = objArr;
        this.kmSgne1rO = objArr2;
        this.Bhmn1KIah = i;
        this.PSTqBLTET = i2;
        if (!(i > 32)) {
            throw new IllegalArgumentException(anXlDk6fV.iMyQMM6Qj("Trie-based persistent vector should have at least 33 elements, got ", Integer.valueOf(i)).toString());
        }
    }

    public final int CBQ5d1kRq() {
        return (J4Ux7ym32() - 1) & -32;
    }

    public final Object[] GPLPRo6go(Object[] objArr, int i, int i2, DGdyNqLvN dGdyNqLvN) {
        Object[] objArr2;
        int i3 = (i2 >> i) & 31;
        if (i == 5) {
            dGdyNqLvN.J4Ux7ym32 = objArr[i3];
            objArr2 = null;
        } else {
            Object obj = objArr[i3];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = GPLPRo6go((Object[]) obj, i - 5, i2, dGdyNqLvN);
        }
        if (objArr2 == null && i3 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        copyOf[i3] = objArr2;
        return copyOf;
    }

    @Override // con.Og6dYSoy7
    public int J4Ux7ym32() {
        return this.Bhmn1KIah;
    }

    public final GfKw8AtcB Puu3Rhg4F(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.Bhmn1KIah >> 5;
        int i2 = this.PSTqBLTET;
        if (i <= (1 << i2)) {
            return new GfKw8AtcB(yWvV4ePLl(objArr, i2, objArr2), objArr3, this.Bhmn1KIah + 1, this.PSTqBLTET);
        }
        Object[] vPSbyrYWX = WAflFGuGp.vPSbyrYWX(objArr);
        int i3 = this.PSTqBLTET + 5;
        return new GfKw8AtcB(yWvV4ePLl(vPSbyrYWX, i3, objArr2), objArr3, this.Bhmn1KIah + 1, i3);
    }

    @Override // con.kVmRinNH6, java.util.List, con.HrqgPICFj
    public HrqgPICFj add(int i, Object obj) {
        YxlPjG8Es.J4Ux7ym32(i, J4Ux7ym32());
        if (i == J4Ux7ym32()) {
            return add(obj);
        }
        int CBQ5d1kRq = CBQ5d1kRq();
        if (i >= CBQ5d1kRq) {
            return iiGwOFFnr(this.CBQ5d1kRq, i - CBQ5d1kRq, obj);
        }
        DGdyNqLvN dGdyNqLvN = new DGdyNqLvN(null, 1);
        return iiGwOFFnr(kCA6Zs9sL(this.CBQ5d1kRq, this.PSTqBLTET, i, obj, dGdyNqLvN), 0, dGdyNqLvN.tGV7Q6urW());
    }

    @Override // con.HrqgPICFj
    public uynHRf1qF dIocxURUo() {
        return new bYMPHjVnt(this, this.CBQ5d1kRq, this.kmSgne1rO, this.PSTqBLTET);
    }

    @Override // con.kVmRinNH6, java.util.List
    public Object get(int i) {
        Object[] objArr;
        YxlPjG8Es.q3BipwRCk(i, J4Ux7ym32());
        if (CBQ5d1kRq() <= i) {
            objArr = this.kmSgne1rO;
        } else {
            objArr = this.CBQ5d1kRq;
            for (int i2 = this.PSTqBLTET; i2 > 0; i2 -= 5) {
                Object obj = objArr[(i >> i2) & 31];
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    public final GfKw8AtcB iiGwOFFnr(Object[] objArr, int i, Object obj) {
        int J4Ux7ym32 = J4Ux7ym32() - CBQ5d1kRq();
        Object[] copyOf = Arrays.copyOf(this.kmSgne1rO, 32);
        if (J4Ux7ym32 < 32) {
            System.arraycopy(this.kmSgne1rO, i, copyOf, i + 1, J4Ux7ym32 - i);
            copyOf[i] = obj;
            return new GfKw8AtcB(objArr, copyOf, J4Ux7ym32() + 1, this.PSTqBLTET);
        }
        Object[] objArr2 = this.kmSgne1rO;
        Object obj2 = objArr2[31];
        System.arraycopy(objArr2, i, copyOf, i + 1, (J4Ux7ym32 - 1) - i);
        copyOf[i] = obj;
        return Puu3Rhg4F(objArr, copyOf, WAflFGuGp.vPSbyrYWX(obj2));
    }

    public final Object[] kCA6Zs9sL(Object[] objArr, int i, int i2, Object obj, DGdyNqLvN dGdyNqLvN) {
        int i3 = (i2 >> i) & 31;
        if (i == 0) {
            Object[] copyOf = i3 == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            System.arraycopy(objArr, i3, copyOf, i3 + 1, 31 - i3);
            dGdyNqLvN.J4Ux7ym32 = objArr[31];
            copyOf[i3] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i4 = i - 5;
        Object obj2 = objArr[i3];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[i3] = kCA6Zs9sL((Object[]) obj2, i4, i2, obj, dGdyNqLvN);
        int i5 = i3 + 1;
        if (i5 < 32) {
            while (true) {
                int i6 = i5 + 1;
                if (copyOf2[i5] == null) {
                    break;
                }
                Object obj3 = objArr[i5];
                Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[i5] = kCA6Zs9sL((Object[]) obj3, i4, 0, dGdyNqLvN.tGV7Q6urW(), dGdyNqLvN);
                if (i6 >= 32) {
                    break;
                }
                i5 = i6;
            }
        }
        return copyOf2;
    }

    public final Object[] kmSgne1rO(Object[] objArr, int i, int i2, Object obj) {
        int i3 = (i2 >> i) & 31;
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        if (i == 0) {
            copyOf[i3] = obj;
        } else {
            Object obj2 = copyOf[i3];
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[i3] = kmSgne1rO((Object[]) obj2, i - 5, i2, obj);
        }
        return copyOf;
    }

    @Override // con.kVmRinNH6, java.util.List
    public ListIterator listIterator(int i) {
        YxlPjG8Es.J4Ux7ym32(i, J4Ux7ym32());
        return new MtOsY9hF5(this.CBQ5d1kRq, this.kmSgne1rO, i, J4Ux7ym32(), (this.PSTqBLTET / 5) + 1);
    }

    public final Object[] oon79WMrY(Object[] objArr, int i, int i2, DGdyNqLvN dGdyNqLvN) {
        int i3 = 31;
        int i4 = (i2 >> i) & 31;
        if (i == 0) {
            Object[] copyOf = i4 == 0 ? new Object[32] : Arrays.copyOf(objArr, 32);
            int i5 = i4 + 1;
            System.arraycopy(objArr, i5, copyOf, i4, 32 - i5);
            copyOf[31] = dGdyNqLvN.tGV7Q6urW();
            dGdyNqLvN.J4Ux7ym32 = objArr[i4];
            return copyOf;
        }
        if (objArr[31] == null) {
            i3 = 31 & ((CBQ5d1kRq() - 1) >> i);
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        int i6 = i - 5;
        int i7 = i4 + 1;
        if (i7 <= i3) {
            while (true) {
                i3--;
                Object obj = copyOf2[i3];
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[i3] = oon79WMrY((Object[]) obj, i6, 0, dGdyNqLvN);
                if (i3 == i7) {
                    break;
                }
            }
        }
        Object obj2 = copyOf2[i4];
        Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[i4] = oon79WMrY((Object[]) obj2, i6, i2, dGdyNqLvN);
        return copyOf2;
    }

    @Override // con.HrqgPICFj
    public HrqgPICFj q3BipwRCk(PmanMZxiM pmanMZxiM) {
        bYMPHjVnt bymphjvnt = new bYMPHjVnt(this, this.CBQ5d1kRq, this.kmSgne1rO, this.PSTqBLTET);
        bymphjvnt.cAwN510t2(pmanMZxiM);
        return bymphjvnt.iiGwOFFnr();
    }

    @Override // con.kVmRinNH6, java.util.List, con.HrqgPICFj
    public HrqgPICFj set(int i, Object obj) {
        YxlPjG8Es.q3BipwRCk(i, J4Ux7ym32());
        if (CBQ5d1kRq() > i) {
            return new GfKw8AtcB(kmSgne1rO(this.CBQ5d1kRq, this.PSTqBLTET, i, obj), this.kmSgne1rO, J4Ux7ym32(), this.PSTqBLTET);
        }
        Object[] copyOf = Arrays.copyOf(this.kmSgne1rO, 32);
        copyOf[i & 31] = obj;
        return new GfKw8AtcB(this.CBQ5d1kRq, copyOf, J4Ux7ym32(), this.PSTqBLTET);
    }

    @Override // con.HrqgPICFj
    public HrqgPICFj tGV7Q6urW(int i) {
        YxlPjG8Es.q3BipwRCk(i, J4Ux7ym32());
        int CBQ5d1kRq = CBQ5d1kRq();
        Object[] objArr = this.CBQ5d1kRq;
        int i2 = this.PSTqBLTET;
        return i >= CBQ5d1kRq ? vPSbyrYWX(objArr, CBQ5d1kRq, i2, i - CBQ5d1kRq) : vPSbyrYWX(oon79WMrY(objArr, i2, i, new DGdyNqLvN(this.kmSgne1rO[0], 1)), CBQ5d1kRq, this.PSTqBLTET, 0);
    }

    public final HrqgPICFj vPSbyrYWX(Object[] objArr, int i, int i2, int i3) {
        GfKw8AtcB gfKw8AtcB;
        int J4Ux7ym32 = J4Ux7ym32() - i;
        if (J4Ux7ym32 != 1) {
            Object[] copyOf = Arrays.copyOf(this.kmSgne1rO, 32);
            int i4 = J4Ux7ym32 - 1;
            if (i3 < i4) {
                int i5 = i3 + 1;
                System.arraycopy(this.kmSgne1rO, i5, copyOf, i3, J4Ux7ym32 - i5);
            }
            copyOf[i4] = null;
            return new GfKw8AtcB(objArr, copyOf, (i + J4Ux7ym32) - 1, i2);
        } else if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
            }
            return new DkgxZF0Q3(objArr);
        } else {
            DGdyNqLvN dGdyNqLvN = new DGdyNqLvN(null, 1);
            Object[] GPLPRo6go = GPLPRo6go(objArr, i2, i - 1, dGdyNqLvN);
            Object tGV7Q6urW = dGdyNqLvN.tGV7Q6urW();
            Objects.requireNonNull(tGV7Q6urW, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            Object[] objArr2 = (Object[]) tGV7Q6urW;
            if (GPLPRo6go[1] == null) {
                Object obj = GPLPRo6go[0];
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                gfKw8AtcB = new GfKw8AtcB((Object[]) obj, objArr2, i, i2 - 5);
            } else {
                gfKw8AtcB = new GfKw8AtcB(GPLPRo6go, objArr2, i, i2);
            }
            return gfKw8AtcB;
        }
    }

    public final Object[] yWvV4ePLl(Object[] objArr, int i, Object[] objArr2) {
        Object[] objArr3;
        int J4Ux7ym32 = ((J4Ux7ym32() - 1) >> i) & 31;
        if (objArr == null) {
            objArr3 = null;
        } else {
            objArr3 = Arrays.copyOf(objArr, 32);
        }
        if (objArr3 == null) {
            objArr3 = new Object[32];
        }
        if (i == 5) {
            objArr3[J4Ux7ym32] = objArr2;
        } else {
            objArr3[J4Ux7ym32] = yWvV4ePLl((Object[]) objArr3[J4Ux7ym32], i - 5, objArr2);
        }
        return objArr3;
    }

    @Override // con.Og6dYSoy7, java.util.Collection, java.util.List, con.HrqgPICFj
    public HrqgPICFj add(Object obj) {
        int J4Ux7ym32 = J4Ux7ym32() - CBQ5d1kRq();
        if (J4Ux7ym32 < 32) {
            Object[] copyOf = Arrays.copyOf(this.kmSgne1rO, 32);
            copyOf[J4Ux7ym32] = obj;
            return new GfKw8AtcB(this.CBQ5d1kRq, copyOf, J4Ux7ym32() + 1, this.PSTqBLTET);
        }
        return Puu3Rhg4F(this.CBQ5d1kRq, this.kmSgne1rO, WAflFGuGp.vPSbyrYWX(obj));
    }
}
