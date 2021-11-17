package con;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class Uhy55gmtq implements Iterable, f7VKpcPHS {
    public static final Uhy55gmtq MzoOEjc4X = new Uhy55gmtq(0, 0, 0, null);
    public final int Bhmn1KIah;
    public final long CBQ5d1kRq;
    public final int[] PSTqBLTET;
    public final long kmSgne1rO;

    public Uhy55gmtq(long j, long j2, int i, int[] iArr) {
        this.CBQ5d1kRq = j;
        this.kmSgne1rO = j2;
        this.Bhmn1KIah = i;
        this.PSTqBLTET = iArr;
    }

    public final Uhy55gmtq GPLPRo6go(Uhy55gmtq uhy55gmtq) {
        int[] iArr;
        Uhy55gmtq uhy55gmtq2 = MzoOEjc4X;
        if (uhy55gmtq == uhy55gmtq2) {
            return this;
        }
        if (this == uhy55gmtq2) {
            return uhy55gmtq;
        }
        int i = uhy55gmtq.Bhmn1KIah;
        int i2 = this.Bhmn1KIah;
        if (i == i2 && uhy55gmtq.PSTqBLTET == (iArr = this.PSTqBLTET)) {
            return new Uhy55gmtq(this.CBQ5d1kRq | uhy55gmtq.CBQ5d1kRq, this.kmSgne1rO | uhy55gmtq.kmSgne1rO, i2, iArr);
        }
        if (this.PSTqBLTET == null) {
            Iterator it = iterator();
            while (it.hasNext()) {
                uhy55gmtq = uhy55gmtq.Puu3Rhg4F(((Number) it.next()).intValue());
            }
            return uhy55gmtq;
        }
        Iterator it2 = uhy55gmtq.iterator();
        Uhy55gmtq uhy55gmtq3 = this;
        while (it2.hasNext()) {
            uhy55gmtq3 = uhy55gmtq3.Puu3Rhg4F(((Number) it2.next()).intValue());
        }
        return uhy55gmtq3;
    }

    public final Uhy55gmtq J4Ux7ym32(Uhy55gmtq uhy55gmtq) {
        int[] iArr;
        Uhy55gmtq uhy55gmtq2 = MzoOEjc4X;
        if (uhy55gmtq == uhy55gmtq2) {
            return this;
        }
        if (this == uhy55gmtq2) {
            return uhy55gmtq2;
        }
        int i = uhy55gmtq.Bhmn1KIah;
        int i2 = this.Bhmn1KIah;
        if (i == i2 && uhy55gmtq.PSTqBLTET == (iArr = this.PSTqBLTET)) {
            return new Uhy55gmtq(this.CBQ5d1kRq & (~uhy55gmtq.CBQ5d1kRq), this.kmSgne1rO & (~uhy55gmtq.kmSgne1rO), i2, iArr);
        }
        Iterator it = uhy55gmtq.iterator();
        Uhy55gmtq uhy55gmtq3 = this;
        while (it.hasNext()) {
            uhy55gmtq3 = uhy55gmtq3.kCA6Zs9sL(((Number) it.next()).intValue());
        }
        return uhy55gmtq3;
    }

    public final Uhy55gmtq Puu3Rhg4F(int i) {
        int[] iArr;
        int i2 = this.Bhmn1KIah;
        int i3 = i - i2;
        long j = 0;
        if (i3 >= 0 && i3 < 64) {
            long j2 = 1 << i3;
            long j3 = this.kmSgne1rO;
            if ((j3 & j2) == 0) {
                return new Uhy55gmtq(this.CBQ5d1kRq, j3 | j2, i2, this.PSTqBLTET);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j4 = 1 << (i3 - 64);
            long j5 = this.CBQ5d1kRq;
            if ((j5 & j4) == 0) {
                return new Uhy55gmtq(j5 | j4, this.kmSgne1rO, i2, this.PSTqBLTET);
            }
        } else if (i3 < 128) {
            int[] iArr2 = this.PSTqBLTET;
            if (iArr2 == null) {
                return new Uhy55gmtq(this.CBQ5d1kRq, this.kmSgne1rO, i2, new int[]{i});
            }
            int cAwN510t2 = xpuSUT7Gh.cAwN510t2(iArr2, i);
            if (cAwN510t2 < 0) {
                int i4 = -(cAwN510t2 + 1);
                int length = iArr2.length + 1;
                int[] iArr3 = new int[length];
                System.arraycopy(iArr2, 0, iArr3, 0, i4 + 0);
                System.arraycopy(iArr2, i4, iArr3, i4 + 1, (length - 1) - i4);
                iArr3[i4] = i;
                return new Uhy55gmtq(this.CBQ5d1kRq, this.kmSgne1rO, this.Bhmn1KIah, iArr3);
            }
        } else if (!iiGwOFFnr(i)) {
            long j6 = this.CBQ5d1kRq;
            long j7 = this.kmSgne1rO;
            int i5 = this.Bhmn1KIah;
            int i6 = ((i + 1) / 64) * 64;
            ArrayList<Number> arrayList = null;
            while (true) {
                if (i5 >= i6) {
                    break;
                }
                if (j7 != j) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        int[] iArr4 = this.PSTqBLTET;
                        if (iArr4 != null) {
                            for (int i7 : iArr4) {
                                arrayList.add(Integer.valueOf(i7));
                            }
                        }
                    }
                    for (int i8 = 0; i8 < 64; i8++) {
                        if (((1 << i8) & j7) != 0) {
                            arrayList.add(Integer.valueOf(i8 + i5));
                        }
                    }
                    j = 0;
                }
                if (j6 == j) {
                    i5 = i6;
                    j7 = j;
                    break;
                }
                i5 += 64;
                j7 = j6;
                j6 = j;
            }
            if (arrayList == null) {
                iArr = null;
            } else {
                iArr = new int[arrayList.size()];
                int i9 = 0;
                for (Number number : arrayList) {
                    i9++;
                    iArr[i9] = number.intValue();
                }
            }
            return new Uhy55gmtq(j6, j7, i5, iArr == null ? this.PSTqBLTET : iArr).Puu3Rhg4F(i);
        }
        return this;
    }

    public final boolean iiGwOFFnr(int i) {
        int[] iArr;
        int i2 = i - this.Bhmn1KIah;
        boolean z = true;
        if (i2 >= 0 && i2 < 64) {
            return ((1 << i2) & this.kmSgne1rO) != 0;
        }
        if (i2 >= 64 && i2 < 128) {
            return ((1 << (i2 - 64)) & this.CBQ5d1kRq) != 0;
        }
        if (i2 > 0 || (iArr = this.PSTqBLTET) == null) {
            return false;
        }
        if (xpuSUT7Gh.cAwN510t2(iArr, i) < 0) {
            z = false;
        }
        return z;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        JoV8VJYqI joV8VJYqI = new JoV8VJYqI(this, null);
        QScS9iO33 qScS9iO33 = new QScS9iO33();
        qScS9iO33.Bhmn1KIah = idpM54xlp.dIocxURUo(joV8VJYqI, qScS9iO33, qScS9iO33);
        return qScS9iO33;
    }

    public final Uhy55gmtq kCA6Zs9sL(int i) {
        int[] iArr;
        int cAwN510t2;
        int i2 = this.Bhmn1KIah;
        int i3 = i - i2;
        if (i3 >= 0 && i3 < 64) {
            long j = 1 << i3;
            long j2 = this.kmSgne1rO;
            if ((j2 & j) != 0) {
                return new Uhy55gmtq(this.CBQ5d1kRq, j2 & (~j), i2, this.PSTqBLTET);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j3 = 1 << (i3 - 64);
            long j4 = this.CBQ5d1kRq;
            if ((j4 & j3) != 0) {
                return new Uhy55gmtq(j4 & (~j3), this.kmSgne1rO, i2, this.PSTqBLTET);
            }
        } else if (i3 < 0 && (iArr = this.PSTqBLTET) != null && (cAwN510t2 = xpuSUT7Gh.cAwN510t2(iArr, i)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new Uhy55gmtq(this.CBQ5d1kRq, this.kmSgne1rO, this.Bhmn1KIah, null);
            }
            int[] iArr2 = new int[length];
            if (cAwN510t2 > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, cAwN510t2 + 0);
            }
            if (cAwN510t2 < length) {
                int i4 = cAwN510t2 + 1;
                System.arraycopy(iArr, i4, iArr2, cAwN510t2, (length + 1) - i4);
            }
            return new Uhy55gmtq(this.CBQ5d1kRq, this.kmSgne1rO, this.Bhmn1KIah, iArr2);
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007d A[LOOP:1: B:9:0x004c->B:22:0x007d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f A[EDGE_INSN: B:26:0x007f->B:23:0x007f ?: BREAK  , SYNTHETIC] */
    @Override // java.lang.Object
    /* Code decompiled incorrectly, please refer to instructions dump */
    public String toString() {
        CharSequence charSequence;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size() - 1;
        int i = 0;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i + 1;
                Object obj = arrayList.get(i);
                boolean z = true;
                i2++;
                if (i2 > 1) {
                    sb2.append((CharSequence) ", ");
                }
                if (obj != null) {
                    z = obj instanceof CharSequence;
                }
                if (z) {
                    charSequence = (CharSequence) obj;
                } else if (obj instanceof Character) {
                    sb2.append(((Character) obj).charValue());
                    if (i3 <= size) {
                        break;
                    }
                    i = i3;
                } else {
                    charSequence = String.valueOf(obj);
                }
                sb2.append(charSequence);
                if (i3 <= size) {
                }
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
