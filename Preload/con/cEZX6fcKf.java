package con;

import con.k007RzV1x;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class cEZX6fcKf extends yUQFqpqgq {
    public int CBQ5d1kRq;
    public ArrayList vPSbyrYWX = new ArrayList();

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        if (r2 == 1) goto L_0x003f;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public cEZX6fcKf(k007RzV1x k007rzv1x, int i) {
        super(k007rzv1x);
        cEZX6fcKf cezx6fckf;
        yUQFqpqgq yuqfqpqgq;
        int i2;
        this.iiGwOFFnr = i;
        k007RzV1x k007rzv1x2 = this.J4Ux7ym32;
        while (true) {
            k007RzV1x ilHKhw3Yw = k007rzv1x2.ilHKhw3Yw(this.iiGwOFFnr);
            if (ilHKhw3Yw == null) {
                break;
            }
            k007rzv1x2 = ilHKhw3Yw;
        }
        this.J4Ux7ym32 = k007rzv1x2;
        ArrayList arrayList = this.vPSbyrYWX;
        int i3 = this.iiGwOFFnr;
        if (i3 == 0) {
            cezx6fckf = this;
            yuqfqpqgq = k007rzv1x2.dIocxURUo;
            arrayList.add(yuqfqpqgq);
            k007rzv1x2 = k007rzv1x2.MzoOEjc4X(cezx6fckf.iiGwOFFnr);
            if (k007rzv1x2 == null) {
                arrayList = cezx6fckf.vPSbyrYWX;
                int i4 = cezx6fckf.iiGwOFFnr;
                if (i4 != 0) {
                }
                yuqfqpqgq = k007rzv1x2.dIocxURUo;
                arrayList.add(yuqfqpqgq);
                k007rzv1x2 = k007rzv1x2.MzoOEjc4X(cezx6fckf.iiGwOFFnr);
                if (k007rzv1x2 == null) {
                    Iterator it = cezx6fckf.vPSbyrYWX.iterator();
                    while (it.hasNext()) {
                        yUQFqpqgq yuqfqpqgq2 = (yUQFqpqgq) it.next();
                        int i5 = cezx6fckf.iiGwOFFnr;
                        if (i5 == 0) {
                            yuqfqpqgq2.J4Ux7ym32.J4Ux7ym32 = cezx6fckf;
                        } else if (i5 == 1) {
                            yuqfqpqgq2.J4Ux7ym32.tGV7Q6urW = cezx6fckf;
                        }
                    }
                    if ((cezx6fckf.iiGwOFFnr == 0 && ((S5aezmTgi) cezx6fckf.J4Ux7ym32.ziwPzaoF3).vIbyhVf1d) && cezx6fckf.vPSbyrYWX.size() > 1) {
                        ArrayList arrayList2 = cezx6fckf.vPSbyrYWX;
                        cezx6fckf.J4Ux7ym32 = ((yUQFqpqgq) arrayList2.get(arrayList2.size() - 1)).J4Ux7ym32;
                    }
                    if (cezx6fckf.iiGwOFFnr == 0) {
                        i2 = cezx6fckf.J4Ux7ym32.R2hkbNqWf;
                    } else {
                        i2 = cezx6fckf.J4Ux7ym32.IG30YE5GU;
                    }
                    cezx6fckf.CBQ5d1kRq = i2;
                }
            }
        } else if (i3 == 1) {
            cezx6fckf = this;
            yuqfqpqgq = k007rzv1x2.kCA6Zs9sL;
            arrayList.add(yuqfqpqgq);
            k007rzv1x2 = k007rzv1x2.MzoOEjc4X(cezx6fckf.iiGwOFFnr);
            if (k007rzv1x2 == null) {
            }
        } else {
            cezx6fckf = this;
            yuqfqpqgq = null;
            arrayList.add(yuqfqpqgq);
            k007rzv1x2 = k007rzv1x2.MzoOEjc4X(cezx6fckf.iiGwOFFnr);
            if (k007rzv1x2 == null) {
            }
        }
    }

    public final k007RzV1x Bhmn1KIah() {
        for (int size = this.vPSbyrYWX.size() - 1; size >= 0; size--) {
            k007RzV1x k007rzv1x = ((yUQFqpqgq) this.vPSbyrYWX.get(size)).J4Ux7ym32;
            if (k007rzv1x.Dr7UqlxEV != 8) {
                return k007rzv1x;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
        if (r1 != null) goto L_0x0078;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
        r2 = r6.yWvV4ePLl;
        r2.CBQ5d1kRq.add(r1);
        r2.iiGwOFFnr = -r0;
        r1.vPSbyrYWX.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c4, code lost:
        if (r1 != null) goto L_0x0078;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c7, code lost:
        r6.Puu3Rhg4F.q3BipwRCk = r6;
        r6.yWvV4ePLl.q3BipwRCk = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cf, code lost:
        return;
     */
    @Override // con.yUQFqpqgq
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void dIocxURUo() {
        fTuF5tuYZ yWvV4ePLl;
        int dIocxURUo;
        Iterator it = this.vPSbyrYWX.iterator();
        while (it.hasNext()) {
            ((yUQFqpqgq) it.next()).dIocxURUo();
        }
        int size = this.vPSbyrYWX.size();
        if (size >= 1) {
            k007RzV1x k007rzv1x = ((yUQFqpqgq) this.vPSbyrYWX.get(0)).J4Ux7ym32;
            k007RzV1x k007rzv1x2 = ((yUQFqpqgq) this.vPSbyrYWX.get(size - 1)).J4Ux7ym32;
            if (this.iiGwOFFnr == 0) {
                h7j7Zcum2 h7j7zcum2 = k007rzv1x.i0Zug1mVk;
                h7j7Zcum2 h7j7zcum22 = k007rzv1x2.V9LQMKGJe;
                fTuF5tuYZ yWvV4ePLl2 = yWvV4ePLl(h7j7zcum2, 0);
                int dIocxURUo2 = h7j7zcum2.dIocxURUo();
                k007RzV1x kmSgne1rO = kmSgne1rO();
                if (kmSgne1rO != null) {
                    dIocxURUo2 = kmSgne1rO.i0Zug1mVk.dIocxURUo();
                }
                if (yWvV4ePLl2 != null) {
                    fTuF5tuYZ ftuf5tuyz = this.Puu3Rhg4F;
                    ftuf5tuyz.CBQ5d1kRq.add(yWvV4ePLl2);
                    ftuf5tuyz.iiGwOFFnr = dIocxURUo2;
                    yWvV4ePLl2.vPSbyrYWX.add(ftuf5tuyz);
                }
                yWvV4ePLl = yWvV4ePLl(h7j7zcum22, 0);
                dIocxURUo = h7j7zcum22.dIocxURUo();
                k007RzV1x Bhmn1KIah = Bhmn1KIah();
                if (Bhmn1KIah != null) {
                    dIocxURUo = Bhmn1KIah.V9LQMKGJe.dIocxURUo();
                }
            } else {
                h7j7Zcum2 h7j7zcum23 = k007rzv1x.o4LF8RkoQ;
                h7j7Zcum2 h7j7zcum24 = k007rzv1x2.QNqj6nIzv;
                fTuF5tuYZ yWvV4ePLl3 = yWvV4ePLl(h7j7zcum23, 1);
                int dIocxURUo3 = h7j7zcum23.dIocxURUo();
                k007RzV1x kmSgne1rO2 = kmSgne1rO();
                if (kmSgne1rO2 != null) {
                    dIocxURUo3 = kmSgne1rO2.o4LF8RkoQ.dIocxURUo();
                }
                if (yWvV4ePLl3 != null) {
                    fTuF5tuYZ ftuf5tuyz2 = this.Puu3Rhg4F;
                    ftuf5tuyz2.CBQ5d1kRq.add(yWvV4ePLl3);
                    ftuf5tuyz2.iiGwOFFnr = dIocxURUo3;
                    yWvV4ePLl3.vPSbyrYWX.add(ftuf5tuyz2);
                }
                yWvV4ePLl = yWvV4ePLl(h7j7zcum24, 1);
                dIocxURUo = h7j7zcum24.dIocxURUo();
                k007RzV1x Bhmn1KIah2 = Bhmn1KIah();
                if (Bhmn1KIah2 != null) {
                    dIocxURUo = Bhmn1KIah2.QNqj6nIzv.dIocxURUo();
                }
            }
        }
    }

    @Override // con.yUQFqpqgq
    public void iiGwOFFnr() {
        this.tGV7Q6urW = null;
        Iterator it = this.vPSbyrYWX.iterator();
        while (it.hasNext()) {
            ((yUQFqpqgq) it.next()).iiGwOFFnr();
        }
    }

    @Override // con.yUQFqpqgq
    public void kCA6Zs9sL() {
        for (int i = 0; i < this.vPSbyrYWX.size(); i++) {
            ((yUQFqpqgq) this.vPSbyrYWX.get(i)).kCA6Zs9sL();
        }
    }

    public final k007RzV1x kmSgne1rO() {
        for (int i = 0; i < this.vPSbyrYWX.size(); i++) {
            k007RzV1x k007rzv1x = ((yUQFqpqgq) this.vPSbyrYWX.get(i)).J4Ux7ym32;
            if (k007rzv1x.Dr7UqlxEV != 8) {
                return k007rzv1x;
            }
        }
        return null;
    }

    @Override // con.yUQFqpqgq
    public long oon79WMrY() {
        int size = this.vPSbyrYWX.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            yUQFqpqgq yuqfqpqgq = (yUQFqpqgq) this.vPSbyrYWX.get(i);
            j = ((long) yuqfqpqgq.yWvV4ePLl.iiGwOFFnr) + yuqfqpqgq.oon79WMrY() + j + ((long) yuqfqpqgq.Puu3Rhg4F.iiGwOFFnr);
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:271:0x03a3, code lost:
        r10 = r10 - r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00db  */
    @Override // con.yUQFqpqgq, con.OA9bkVDuZ
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void q3BipwRCk(OA9bkVDuZ oA9bkVDuZ) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        boolean z;
        k007RzV1x.RG2GI7LDp rG2GI7LDp;
        int i6;
        int i7;
        int i8;
        float f2;
        k007RzV1x.RG2GI7LDp rG2GI7LDp2;
        boolean z2;
        float f3;
        k007RzV1x.RG2GI7LDp rG2GI7LDp3;
        int i9;
        int i10;
        int i11;
        boolean z3;
        int i12;
        int i13;
        k007RzV1x.RG2GI7LDp rG2GI7LDp4 = k007RzV1x.RG2GI7LDp.MATCH_CONSTRAINT;
        fTuF5tuYZ ftuf5tuyz = this.Puu3Rhg4F;
        if (ftuf5tuyz.oon79WMrY) {
            fTuF5tuYZ ftuf5tuyz2 = this.yWvV4ePLl;
            if (ftuf5tuyz2.oon79WMrY) {
                k007RzV1x k007rzv1x = this.J4Ux7ym32.ziwPzaoF3;
                boolean z4 = k007rzv1x instanceof S5aezmTgi ? ((S5aezmTgi) k007rzv1x).vIbyhVf1d : false;
                int i14 = ftuf5tuyz2.GPLPRo6go - ftuf5tuyz.GPLPRo6go;
                int size = this.vPSbyrYWX.size();
                int i15 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i15 >= size) {
                        i15 = -1;
                        break;
                    }
                    if (((yUQFqpqgq) this.vPSbyrYWX.get(i15)).J4Ux7ym32.Dr7UqlxEV != 8) {
                        break;
                    }
                    i15++;
                }
                int i16 = size - 1;
                int i17 = i16;
                while (true) {
                    if (i17 < 0) {
                        break;
                    }
                    if (((yUQFqpqgq) this.vPSbyrYWX.get(i17)).J4Ux7ym32.Dr7UqlxEV != 8) {
                        i = i17;
                        break;
                    }
                    i17--;
                }
                int i18 = 0;
                while (i18 < 2) {
                    int i19 = 0;
                    i5 = 0;
                    int i20 = 0;
                    int i21 = 0;
                    f = 0.0f;
                    while (i19 < size) {
                        yUQFqpqgq yuqfqpqgq = (yUQFqpqgq) this.vPSbyrYWX.get(i19);
                        k007RzV1x k007rzv1x2 = yuqfqpqgq.J4Ux7ym32;
                        if (k007rzv1x2.Dr7UqlxEV != i2) {
                            i21++;
                            if (i19 > 0 && i19 >= i15) {
                                i5 += yuqfqpqgq.Puu3Rhg4F.iiGwOFFnr;
                            }
                            kI6UYBIBf ki6uybibf = yuqfqpqgq.kCA6Zs9sL;
                            int i22 = ki6uybibf.GPLPRo6go;
                            boolean z5 = yuqfqpqgq.dIocxURUo != rG2GI7LDp4;
                            if (z5) {
                                int i23 = this.iiGwOFFnr;
                                i13 = i22;
                                if (i23 == 0 && !k007rzv1x2.dIocxURUo.kCA6Zs9sL.oon79WMrY) {
                                    return;
                                }
                                if (i23 != 1 || k007rzv1x2.kCA6Zs9sL.kCA6Zs9sL.oon79WMrY) {
                                    z3 = z5;
                                } else {
                                    return;
                                }
                            } else {
                                i13 = i22;
                                z3 = z5;
                                if (yuqfqpqgq.q3BipwRCk == 1 && i18 == 0) {
                                    i12 = ki6uybibf.kmSgne1rO;
                                    i20++;
                                } else if (ki6uybibf.oon79WMrY) {
                                    i12 = i13;
                                }
                                z3 = true;
                                if (z3) {
                                    i20++;
                                    float f4 = k007rzv1x2.buPcffgdD[this.iiGwOFFnr];
                                    if (f4 >= 0.0f) {
                                        f += f4;
                                    }
                                } else {
                                    i5 += i12;
                                }
                                if (i19 < i16 && i19 < i) {
                                    i5 += -yuqfqpqgq.yWvV4ePLl.iiGwOFFnr;
                                }
                            }
                            i12 = i13;
                            if (z3) {
                            }
                            if (i19 < i16) {
                                i5 += -yuqfqpqgq.yWvV4ePLl.iiGwOFFnr;
                            }
                        }
                        i19++;
                        i2 = 8;
                    }
                    if (i5 < i14 || i20 == 0) {
                        i3 = i20;
                        i4 = i21;
                        break;
                    }
                    i18++;
                    i2 = 8;
                }
                i3 = 0;
                i4 = 0;
                i5 = 0;
                f = 0.0f;
                int i24 = this.Puu3Rhg4F.GPLPRo6go;
                if (z4) {
                    i24 = this.yWvV4ePLl.GPLPRo6go;
                }
                if (i5 > i14) {
                    int i25 = (int) ((((float) (i5 - i14)) / 2.0f) + 0.5f);
                    i24 = z4 ? i24 + i25 : i24 - i25;
                }
                if (i3 > 0) {
                    float f5 = (float) (i14 - i5);
                    int i26 = (int) ((f5 / ((float) i3)) + 0.5f);
                    int i27 = 0;
                    int i28 = 0;
                    while (i27 < size) {
                        yUQFqpqgq yuqfqpqgq2 = (yUQFqpqgq) this.vPSbyrYWX.get(i27);
                        k007RzV1x k007rzv1x3 = yuqfqpqgq2.J4Ux7ym32;
                        if (k007rzv1x3.Dr7UqlxEV != 8 && yuqfqpqgq2.dIocxURUo == rG2GI7LDp4) {
                            kI6UYBIBf ki6uybibf2 = yuqfqpqgq2.kCA6Zs9sL;
                            if (!ki6uybibf2.oon79WMrY) {
                                if (f > 0.0f) {
                                    rG2GI7LDp3 = rG2GI7LDp4;
                                    i9 = (int) (((k007rzv1x3.buPcffgdD[this.iiGwOFFnr] * f5) / f) + 0.5f);
                                } else {
                                    rG2GI7LDp3 = rG2GI7LDp4;
                                    i9 = i26;
                                }
                                if (this.iiGwOFFnr == 0) {
                                    i10 = k007rzv1x3.WaUP0CF08;
                                    i11 = k007rzv1x3.sk5s77z6Q;
                                } else {
                                    i10 = k007rzv1x3.iMyQMM6Qj;
                                    i11 = k007rzv1x3.dfpT1j18n;
                                }
                                f3 = f5;
                                z2 = z4;
                                int max = Math.max(i11, yuqfqpqgq2.q3BipwRCk == 1 ? Math.min(i9, ki6uybibf2.kmSgne1rO) : i9);
                                if (i10 > 0) {
                                    max = Math.min(i10, max);
                                }
                                if (max != i9) {
                                    i28++;
                                    i9 = max;
                                }
                                yuqfqpqgq2.kCA6Zs9sL.tGV7Q6urW(i9);
                                i27++;
                                i26 = i26;
                                i5 = i5;
                                i24 = i24;
                                rG2GI7LDp4 = rG2GI7LDp3;
                                f5 = f3;
                                z4 = z2;
                            }
                        }
                        rG2GI7LDp3 = rG2GI7LDp4;
                        z2 = z4;
                        f3 = f5;
                        i27++;
                        i26 = i26;
                        i5 = i5;
                        i24 = i24;
                        rG2GI7LDp4 = rG2GI7LDp3;
                        f5 = f3;
                        z4 = z2;
                    }
                    rG2GI7LDp = rG2GI7LDp4;
                    z = z4;
                    i6 = i24;
                    if (i28 > 0) {
                        i3 -= i28;
                        int i29 = 0;
                        for (int i30 = 0; i30 < size; i30++) {
                            yUQFqpqgq yuqfqpqgq3 = (yUQFqpqgq) this.vPSbyrYWX.get(i30);
                            if (yuqfqpqgq3.J4Ux7ym32.Dr7UqlxEV != 8) {
                                if (i30 > 0 && i30 >= i15) {
                                    i29 += yuqfqpqgq3.Puu3Rhg4F.iiGwOFFnr;
                                }
                                i29 += yuqfqpqgq3.kCA6Zs9sL.GPLPRo6go;
                                if (i30 < i16 && i30 < i) {
                                    i29 += -yuqfqpqgq3.yWvV4ePLl.iiGwOFFnr;
                                }
                            }
                        }
                        i5 = i29;
                    } else {
                        i5 = i5;
                    }
                    i7 = 2;
                    if (this.CBQ5d1kRq == 2 && i28 == 0) {
                        i8 = 0;
                        this.CBQ5d1kRq = 0;
                    } else {
                        i8 = 0;
                    }
                } else {
                    rG2GI7LDp = rG2GI7LDp4;
                    z = z4;
                    i6 = i24;
                    i8 = 0;
                    i7 = 2;
                }
                if (i5 > i14) {
                    this.CBQ5d1kRq = i7;
                }
                if (i4 > 0 && i3 == 0 && i15 == i) {
                    this.CBQ5d1kRq = i7;
                }
                int i31 = this.CBQ5d1kRq;
                if (i31 == 1) {
                    int i32 = i4 > 1 ? (i14 - i5) / (i4 - 1) : i4 == 1 ? (i14 - i5) / 2 : i8;
                    if (i3 > 0) {
                        i32 = i8;
                    }
                    int i33 = i8;
                    int i34 = i6;
                    while (i33 < size) {
                        yUQFqpqgq yuqfqpqgq4 = (yUQFqpqgq) this.vPSbyrYWX.get(z ? size - (i33 + 1) : i33);
                        if (yuqfqpqgq4.J4Ux7ym32.Dr7UqlxEV == 8) {
                            yuqfqpqgq4.Puu3Rhg4F.tGV7Q6urW(i34);
                            yuqfqpqgq4.yWvV4ePLl.tGV7Q6urW(i34);
                            rG2GI7LDp2 = rG2GI7LDp;
                        } else {
                            if (i33 > 0) {
                                i34 = z ? i34 - i32 : i34 + i32;
                            }
                            if (i33 > 0 && i33 >= i15) {
                                int i35 = yuqfqpqgq4.Puu3Rhg4F.iiGwOFFnr;
                                i34 = z ? i34 - i35 : i34 + i35;
                            }
                            (z ? yuqfqpqgq4.yWvV4ePLl : yuqfqpqgq4.Puu3Rhg4F).tGV7Q6urW(i34);
                            kI6UYBIBf ki6uybibf3 = yuqfqpqgq4.kCA6Zs9sL;
                            int i36 = ki6uybibf3.GPLPRo6go;
                            rG2GI7LDp2 = rG2GI7LDp;
                            if (yuqfqpqgq4.dIocxURUo == rG2GI7LDp2 && yuqfqpqgq4.q3BipwRCk == 1) {
                                i36 = ki6uybibf3.kmSgne1rO;
                            }
                            i34 = z ? i34 - i36 : i34 + i36;
                            (z ? yuqfqpqgq4.Puu3Rhg4F : yuqfqpqgq4.yWvV4ePLl).tGV7Q6urW(i34);
                            yuqfqpqgq4.GPLPRo6go = true;
                            if (i33 < i16 && i33 < i) {
                                int i37 = -yuqfqpqgq4.yWvV4ePLl.iiGwOFFnr;
                                i34 = z ? i34 - i37 : i34 + i37;
                            }
                        }
                        i33++;
                        rG2GI7LDp = rG2GI7LDp2;
                    }
                } else if (i31 == 0) {
                    int i38 = (i14 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i38 = i8;
                    }
                    int i39 = i6;
                    for (int i40 = i8; i40 < size; i40++) {
                        yUQFqpqgq yuqfqpqgq5 = (yUQFqpqgq) this.vPSbyrYWX.get(z ? size - (i40 + 1) : i40);
                        if (yuqfqpqgq5.J4Ux7ym32.Dr7UqlxEV == 8) {
                            yuqfqpqgq5.Puu3Rhg4F.tGV7Q6urW(i39);
                            yuqfqpqgq5.yWvV4ePLl.tGV7Q6urW(i39);
                        } else {
                            int i41 = z ? i39 - i38 : i39 + i38;
                            if (i40 > 0 && i40 >= i15) {
                                int i42 = yuqfqpqgq5.Puu3Rhg4F.iiGwOFFnr;
                                i41 = z ? i41 - i42 : i41 + i42;
                            }
                            (z ? yuqfqpqgq5.yWvV4ePLl : yuqfqpqgq5.Puu3Rhg4F).tGV7Q6urW(i41);
                            kI6UYBIBf ki6uybibf4 = yuqfqpqgq5.kCA6Zs9sL;
                            int i43 = ki6uybibf4.GPLPRo6go;
                            if (yuqfqpqgq5.dIocxURUo == rG2GI7LDp && yuqfqpqgq5.q3BipwRCk == 1) {
                                i43 = Math.min(i43, ki6uybibf4.kmSgne1rO);
                            }
                            i39 = z ? i41 - i43 : i41 + i43;
                            (z ? yuqfqpqgq5.Puu3Rhg4F : yuqfqpqgq5.yWvV4ePLl).tGV7Q6urW(i39);
                            if (i40 < i16 && i40 < i) {
                                int i44 = -yuqfqpqgq5.yWvV4ePLl.iiGwOFFnr;
                                i39 = z ? i39 - i44 : i39 + i44;
                            }
                        }
                    }
                } else if (i31 == 2) {
                    if (this.iiGwOFFnr == 0) {
                        f2 = this.J4Ux7ym32.INnK5Rew6;
                    } else {
                        f2 = this.J4Ux7ym32.SuKhTJIQc;
                    }
                    if (z) {
                        f2 = 1.0f - f2;
                    }
                    int i45 = (int) ((((float) (i14 - i5)) * f2) + 0.5f);
                    if (i45 < 0 || i3 > 0) {
                        i45 = i8;
                    }
                    int i46 = z ? i6 - i45 : i6 + i45;
                    for (int i47 = i8; i47 < size; i47++) {
                        yUQFqpqgq yuqfqpqgq6 = (yUQFqpqgq) this.vPSbyrYWX.get(z ? size - (i47 + 1) : i47);
                        if (yuqfqpqgq6.J4Ux7ym32.Dr7UqlxEV == 8) {
                            yuqfqpqgq6.Puu3Rhg4F.tGV7Q6urW(i46);
                            yuqfqpqgq6.yWvV4ePLl.tGV7Q6urW(i46);
                        } else {
                            if (i47 > 0 && i47 >= i15) {
                                int i48 = yuqfqpqgq6.Puu3Rhg4F.iiGwOFFnr;
                                i46 = z ? i46 - i48 : i46 + i48;
                            }
                            (z ? yuqfqpqgq6.yWvV4ePLl : yuqfqpqgq6.Puu3Rhg4F).tGV7Q6urW(i46);
                            kI6UYBIBf ki6uybibf5 = yuqfqpqgq6.kCA6Zs9sL;
                            int i49 = ki6uybibf5.GPLPRo6go;
                            if (yuqfqpqgq6.dIocxURUo == rG2GI7LDp && yuqfqpqgq6.q3BipwRCk == 1) {
                                i49 = ki6uybibf5.kmSgne1rO;
                            }
                            i46 += i49;
                            (z ? yuqfqpqgq6.Puu3Rhg4F : yuqfqpqgq6.yWvV4ePLl).tGV7Q6urW(i46);
                            if (i47 < i16 && i47 < i) {
                                int i50 = -yuqfqpqgq6.yWvV4ePLl.iiGwOFFnr;
                                i46 = z ? i46 - i50 : i46 + i50;
                            }
                        }
                    }
                }
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.iiGwOFFnr == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.vPSbyrYWX.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append((yUQFqpqgq) it.next());
            sb.append("> ");
        }
        return sb.toString();
    }

    @Override // con.yUQFqpqgq
    public boolean vPSbyrYWX() {
        int size = this.vPSbyrYWX.size();
        for (int i = 0; i < size; i++) {
            if (!((yUQFqpqgq) this.vPSbyrYWX.get(i)).vPSbyrYWX()) {
                return false;
            }
        }
        return true;
    }
}
