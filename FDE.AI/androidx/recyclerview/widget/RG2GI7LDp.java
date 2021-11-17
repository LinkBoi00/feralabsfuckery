package androidx.recyclerview.widget;

import con.iFKnyAZAM;
import con.k68bWXYb8;
import con.nOPp9PCGN;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class RG2GI7LDp implements k68bWXYb8 {
    public final AbstractC0007RG2GI7LDp dIocxURUo;
    public nOPp9PCGN q3BipwRCk = new nOPp9PCGN(30, 1);
    public final ArrayList J4Ux7ym32 = new ArrayList();
    public final ArrayList tGV7Q6urW = new ArrayList();
    public int iiGwOFFnr = 0;
    public final iFKnyAZAM kCA6Zs9sL = new iFKnyAZAM((k68bWXYb8) this);

    /* renamed from: androidx.recyclerview.widget.RG2GI7LDp$RG2GI7LDp */
    /* loaded from: classes.dex */
    public interface AbstractC0007RG2GI7LDp {
    }

    /* loaded from: classes.dex */
    public static final class mhl5lIdbQ {
        public int J4Ux7ym32;
        public int dIocxURUo;
        public int q3BipwRCk;
        public Object tGV7Q6urW;

        public mhl5lIdbQ(int i, int i2, int i3, Object obj) {
            this.q3BipwRCk = i;
            this.J4Ux7ym32 = i2;
            this.dIocxURUo = i3;
            this.tGV7Q6urW = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof mhl5lIdbQ)) {
                return false;
            }
            mhl5lIdbQ mhl5lidbq = (mhl5lIdbQ) obj;
            int i = this.q3BipwRCk;
            if (i != mhl5lidbq.q3BipwRCk) {
                return false;
            }
            if (i == 8 && Math.abs(this.dIocxURUo - this.J4Ux7ym32) == 1 && this.dIocxURUo == mhl5lidbq.J4Ux7ym32 && this.J4Ux7ym32 == mhl5lidbq.dIocxURUo) {
                return true;
            }
            if (this.dIocxURUo != mhl5lidbq.dIocxURUo || this.J4Ux7ym32 != mhl5lidbq.J4Ux7ym32) {
                return false;
            }
            Object obj2 = this.tGV7Q6urW;
            Object obj3 = mhl5lidbq.tGV7Q6urW;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.q3BipwRCk * 31) + this.J4Ux7ym32) * 31) + this.dIocxURUo;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.q3BipwRCk;
            sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.J4Ux7ym32);
            sb.append("c:");
            sb.append(this.dIocxURUo);
            sb.append(",p:");
            sb.append(this.tGV7Q6urW);
            sb.append("]");
            return sb.toString();
        }
    }

    public RG2GI7LDp(AbstractC0007RG2GI7LDp rG2GI7LDp) {
        this.dIocxURUo = rG2GI7LDp;
    }

    public void CBQ5d1kRq(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            vPSbyrYWX((mhl5lIdbQ) list.get(i));
        }
        list.clear();
    }

    public boolean GPLPRo6go() {
        return this.J4Ux7ym32.size() > 0;
    }

    public void J4Ux7ym32() {
        int size = this.tGV7Q6urW.size();
        for (int i = 0; i < size; i++) {
            ((s7MlVynBG) this.dIocxURUo).q3BipwRCk((mhl5lIdbQ) this.tGV7Q6urW.get(i));
        }
        CBQ5d1kRq(this.tGV7Q6urW);
        this.iiGwOFFnr = 0;
    }

    public mhl5lIdbQ Puu3Rhg4F(int i, int i2, int i3, Object obj) {
        mhl5lIdbQ mhl5lidbq = (mhl5lIdbQ) this.q3BipwRCk.q3BipwRCk();
        if (mhl5lidbq == null) {
            return new mhl5lIdbQ(i, i2, i3, obj);
        }
        mhl5lidbq.q3BipwRCk = i;
        mhl5lidbq.J4Ux7ym32 = i2;
        mhl5lidbq.dIocxURUo = i3;
        mhl5lidbq.tGV7Q6urW = obj;
        return mhl5lidbq;
    }

    public final void dIocxURUo(mhl5lIdbQ mhl5lidbq) {
        int i;
        int i2 = mhl5lidbq.q3BipwRCk;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int kmSgne1rO = kmSgne1rO(mhl5lidbq.J4Ux7ym32, i2);
        int i3 = mhl5lidbq.J4Ux7ym32;
        int i4 = mhl5lidbq.q3BipwRCk;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + mhl5lidbq);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < mhl5lidbq.dIocxURUo; i6++) {
            int kmSgne1rO2 = kmSgne1rO((i * i6) + mhl5lidbq.J4Ux7ym32, mhl5lidbq.q3BipwRCk);
            int i7 = mhl5lidbq.q3BipwRCk;
            if (i7 == 2 ? kmSgne1rO2 == kmSgne1rO : i7 == 4 && kmSgne1rO2 == kmSgne1rO + 1) {
                i5++;
            } else {
                mhl5lIdbQ Puu3Rhg4F = Puu3Rhg4F(i7, kmSgne1rO, i5, mhl5lidbq.tGV7Q6urW);
                kCA6Zs9sL(Puu3Rhg4F, i3);
                Puu3Rhg4F.tGV7Q6urW = null;
                this.q3BipwRCk.tGV7Q6urW(Puu3Rhg4F);
                if (mhl5lidbq.q3BipwRCk == 4) {
                    i3 += i5;
                }
                i5 = 1;
                kmSgne1rO = kmSgne1rO2;
            }
        }
        Object obj = mhl5lidbq.tGV7Q6urW;
        mhl5lidbq.tGV7Q6urW = null;
        this.q3BipwRCk.tGV7Q6urW(mhl5lidbq);
        if (i5 > 0) {
            mhl5lIdbQ Puu3Rhg4F2 = Puu3Rhg4F(mhl5lidbq.q3BipwRCk, kmSgne1rO, i5, obj);
            kCA6Zs9sL(Puu3Rhg4F2, i3);
            Puu3Rhg4F2.tGV7Q6urW = null;
            this.q3BipwRCk.tGV7Q6urW(Puu3Rhg4F2);
        }
    }

    public int iiGwOFFnr(int i, int i2) {
        int size = this.tGV7Q6urW.size();
        while (i2 < size) {
            mhl5lIdbQ mhl5lidbq = (mhl5lIdbQ) this.tGV7Q6urW.get(i2);
            int i3 = mhl5lidbq.q3BipwRCk;
            if (i3 == 8) {
                int i4 = mhl5lidbq.J4Ux7ym32;
                if (i4 == i) {
                    i = mhl5lidbq.dIocxURUo;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (mhl5lidbq.dIocxURUo <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = mhl5lidbq.J4Ux7ym32;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = mhl5lidbq.dIocxURUo;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += mhl5lidbq.dIocxURUo;
                }
            }
            i2++;
        }
        return i;
    }

    public void kCA6Zs9sL(mhl5lIdbQ mhl5lidbq, int i) {
        ((s7MlVynBG) this.dIocxURUo).q3BipwRCk(mhl5lidbq);
        int i2 = mhl5lidbq.q3BipwRCk;
        if (i2 == 2) {
            AbstractC0007RG2GI7LDp rG2GI7LDp = this.dIocxURUo;
            int i3 = mhl5lidbq.dIocxURUo;
            s7MlVynBG s7mlvynbg = (s7MlVynBG) rG2GI7LDp;
            s7mlvynbg.q3BipwRCk.QSbMsHU5X(i, i3, true);
            RecyclerView recyclerView = s7mlvynbg.q3BipwRCk;
            recyclerView.YmNRDyka4 = true;
            recyclerView.KlYagMRWx.tGV7Q6urW += i3;
        } else if (i2 == 4) {
            ((s7MlVynBG) this.dIocxURUo).tGV7Q6urW(i, mhl5lidbq.dIocxURUo, mhl5lidbq.tGV7Q6urW);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    public final int kmSgne1rO(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        for (int size = this.tGV7Q6urW.size() - 1; size >= 0; size--) {
            mhl5lIdbQ mhl5lidbq = (mhl5lIdbQ) this.tGV7Q6urW.get(size);
            int i9 = mhl5lidbq.q3BipwRCk;
            if (i9 == 8) {
                int i10 = mhl5lidbq.J4Ux7ym32;
                int i11 = mhl5lidbq.dIocxURUo;
                if (i10 < i11) {
                    i5 = i10;
                    i4 = i11;
                } else {
                    i4 = i10;
                    i5 = i11;
                }
                if (i < i5 || i > i4) {
                    if (i < i10) {
                        if (i2 == 1) {
                            mhl5lidbq.J4Ux7ym32 = i10 + 1;
                            i6 = i11 + 1;
                        } else if (i2 == 2) {
                            mhl5lidbq.J4Ux7ym32 = i10 - 1;
                            i6 = i11 - 1;
                        }
                        mhl5lidbq.dIocxURUo = i6;
                    }
                } else if (i5 == i10) {
                    if (i2 == 1) {
                        i8 = i11 + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = i11 - 1;
                        }
                        i++;
                    }
                    mhl5lidbq.dIocxURUo = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = i10 + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = i10 - 1;
                        }
                        i--;
                    }
                    mhl5lidbq.J4Ux7ym32 = i7;
                    i--;
                }
            } else {
                int i12 = mhl5lidbq.J4Ux7ym32;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    mhl5lidbq.J4Ux7ym32 = i3;
                } else if (i9 == 1) {
                    i -= mhl5lidbq.dIocxURUo;
                } else if (i9 == 2) {
                    i += mhl5lidbq.dIocxURUo;
                }
            }
        }
        for (int size2 = this.tGV7Q6urW.size() - 1; size2 >= 0; size2--) {
            mhl5lIdbQ mhl5lidbq2 = (mhl5lIdbQ) this.tGV7Q6urW.get(size2);
            if (mhl5lidbq2.q3BipwRCk == 8) {
                int i13 = mhl5lidbq2.dIocxURUo;
                if (i13 != mhl5lidbq2.J4Ux7ym32 && i13 >= 0) {
                }
                this.tGV7Q6urW.remove(size2);
                mhl5lidbq2.tGV7Q6urW = null;
                this.q3BipwRCk.tGV7Q6urW(mhl5lidbq2);
            } else {
                if (mhl5lidbq2.dIocxURUo > 0) {
                }
                this.tGV7Q6urW.remove(size2);
                mhl5lidbq2.tGV7Q6urW = null;
                this.q3BipwRCk.tGV7Q6urW(mhl5lidbq2);
            }
        }
        return i;
    }

    public void oon79WMrY() {
        boolean z;
        boolean z2;
        iFKnyAZAM ifknyazam = this.kCA6Zs9sL;
        ArrayList arrayList = this.J4Ux7ym32;
        while (true) {
            int ixWaw2akD = ifknyazam.ixWaw2akD(arrayList);
            if (ixWaw2akD == -1) {
                break;
            }
            ifknyazam.AqaWJg0b4(arrayList, ixWaw2akD, ixWaw2akD + 1);
        }
        int size = this.J4Ux7ym32.size();
        for (int i = 0; i < size; i++) {
            mhl5lIdbQ mhl5lidbq = (mhl5lIdbQ) this.J4Ux7ym32.get(i);
            int i2 = mhl5lidbq.q3BipwRCk;
            if (i2 == 1) {
                yWvV4ePLl(mhl5lidbq);
            } else if (i2 == 2) {
                int i3 = mhl5lidbq.J4Ux7ym32;
                int i4 = mhl5lidbq.dIocxURUo + i3;
                int i5 = 0;
                boolean z3 = true;
                int i6 = i3;
                while (i6 < i4) {
                    if (((s7MlVynBG) this.dIocxURUo).J4Ux7ym32(i6) != null || q3BipwRCk(i6)) {
                        if (!z3) {
                            dIocxURUo(Puu3Rhg4F(2, i3, i5, null));
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z = true;
                    } else {
                        if (z3) {
                            yWvV4ePLl(Puu3Rhg4F(2, i3, i5, null));
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z = false;
                    }
                    if (z2) {
                        i6 -= i5;
                        i4 -= i5;
                        i5 = 1;
                    } else {
                        i5++;
                    }
                    i6++;
                    z3 = z;
                }
                if (i5 != mhl5lidbq.dIocxURUo) {
                    mhl5lidbq.tGV7Q6urW = null;
                    this.q3BipwRCk.tGV7Q6urW(mhl5lidbq);
                    mhl5lidbq = Puu3Rhg4F(2, i3, i5, null);
                }
                if (!z3) {
                    dIocxURUo(mhl5lidbq);
                } else {
                    yWvV4ePLl(mhl5lidbq);
                }
            } else if (i2 == 4) {
                int i7 = mhl5lidbq.J4Ux7ym32;
                int i8 = mhl5lidbq.dIocxURUo + i7;
                int i9 = 0;
                boolean z4 = true;
                int i10 = i7;
                while (i7 < i8) {
                    if (((s7MlVynBG) this.dIocxURUo).J4Ux7ym32(i7) != null || q3BipwRCk(i7)) {
                        if (!z4) {
                            dIocxURUo(Puu3Rhg4F(4, i10, i9, mhl5lidbq.tGV7Q6urW));
                            i9 = 0;
                            i10 = i7;
                        }
                        z4 = true;
                    } else {
                        if (z4) {
                            yWvV4ePLl(Puu3Rhg4F(4, i10, i9, mhl5lidbq.tGV7Q6urW));
                            i9 = 0;
                            i10 = i7;
                        }
                        z4 = false;
                    }
                    i9++;
                    i7++;
                }
                if (i9 != mhl5lidbq.dIocxURUo) {
                    Object obj = mhl5lidbq.tGV7Q6urW;
                    mhl5lidbq.tGV7Q6urW = null;
                    this.q3BipwRCk.tGV7Q6urW(mhl5lidbq);
                    mhl5lidbq = Puu3Rhg4F(4, i10, i9, obj);
                }
                if (!z4) {
                    dIocxURUo(mhl5lidbq);
                } else {
                    yWvV4ePLl(mhl5lidbq);
                }
            } else if (i2 == 8) {
                yWvV4ePLl(mhl5lidbq);
            }
        }
        this.J4Ux7ym32.clear();
    }

    public final boolean q3BipwRCk(int i) {
        int size = this.tGV7Q6urW.size();
        for (int i2 = 0; i2 < size; i2++) {
            mhl5lIdbQ mhl5lidbq = (mhl5lIdbQ) this.tGV7Q6urW.get(i2);
            int i3 = mhl5lidbq.q3BipwRCk;
            if (i3 == 8) {
                if (iiGwOFFnr(mhl5lidbq.dIocxURUo, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = mhl5lidbq.J4Ux7ym32;
                int i5 = mhl5lidbq.dIocxURUo + i4;
                while (i4 < i5) {
                    if (iiGwOFFnr(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void tGV7Q6urW() {
        J4Ux7ym32();
        int size = this.J4Ux7ym32.size();
        for (int i = 0; i < size; i++) {
            mhl5lIdbQ mhl5lidbq = (mhl5lIdbQ) this.J4Ux7ym32.get(i);
            int i2 = mhl5lidbq.q3BipwRCk;
            if (i2 == 1) {
                ((s7MlVynBG) this.dIocxURUo).q3BipwRCk(mhl5lidbq);
                ((s7MlVynBG) this.dIocxURUo).dIocxURUo(mhl5lidbq.J4Ux7ym32, mhl5lidbq.dIocxURUo);
            } else if (i2 == 2) {
                ((s7MlVynBG) this.dIocxURUo).q3BipwRCk(mhl5lidbq);
                AbstractC0007RG2GI7LDp rG2GI7LDp = this.dIocxURUo;
                int i3 = mhl5lidbq.J4Ux7ym32;
                int i4 = mhl5lidbq.dIocxURUo;
                s7MlVynBG s7mlvynbg = (s7MlVynBG) rG2GI7LDp;
                s7mlvynbg.q3BipwRCk.QSbMsHU5X(i3, i4, true);
                RecyclerView recyclerView = s7mlvynbg.q3BipwRCk;
                recyclerView.YmNRDyka4 = true;
                recyclerView.KlYagMRWx.tGV7Q6urW += i4;
            } else if (i2 == 4) {
                ((s7MlVynBG) this.dIocxURUo).q3BipwRCk(mhl5lidbq);
                ((s7MlVynBG) this.dIocxURUo).tGV7Q6urW(mhl5lidbq.J4Ux7ym32, mhl5lidbq.dIocxURUo, mhl5lidbq.tGV7Q6urW);
            } else if (i2 == 8) {
                ((s7MlVynBG) this.dIocxURUo).q3BipwRCk(mhl5lidbq);
                ((s7MlVynBG) this.dIocxURUo).kCA6Zs9sL(mhl5lidbq.J4Ux7ym32, mhl5lidbq.dIocxURUo);
            }
        }
        CBQ5d1kRq(this.J4Ux7ym32);
        this.iiGwOFFnr = 0;
    }

    public void vPSbyrYWX(mhl5lIdbQ mhl5lidbq) {
        mhl5lidbq.tGV7Q6urW = null;
        this.q3BipwRCk.tGV7Q6urW(mhl5lidbq);
    }

    public final void yWvV4ePLl(mhl5lIdbQ mhl5lidbq) {
        this.tGV7Q6urW.add(mhl5lidbq);
        int i = mhl5lidbq.q3BipwRCk;
        if (i == 1) {
            ((s7MlVynBG) this.dIocxURUo).dIocxURUo(mhl5lidbq.J4Ux7ym32, mhl5lidbq.dIocxURUo);
        } else if (i == 2) {
            AbstractC0007RG2GI7LDp rG2GI7LDp = this.dIocxURUo;
            s7MlVynBG s7mlvynbg = (s7MlVynBG) rG2GI7LDp;
            s7mlvynbg.q3BipwRCk.QSbMsHU5X(mhl5lidbq.J4Ux7ym32, mhl5lidbq.dIocxURUo, false);
            s7mlvynbg.q3BipwRCk.YmNRDyka4 = true;
        } else if (i == 4) {
            ((s7MlVynBG) this.dIocxURUo).tGV7Q6urW(mhl5lidbq.J4Ux7ym32, mhl5lidbq.dIocxURUo, mhl5lidbq.tGV7Q6urW);
        } else if (i == 8) {
            ((s7MlVynBG) this.dIocxURUo).kCA6Zs9sL(mhl5lidbq.J4Ux7ym32, mhl5lidbq.dIocxURUo);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + mhl5lidbq);
        }
    }
}
