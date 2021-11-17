package con;

import con.h7j7Zcum2;
import con.jK3ds2GCn;
import con.k007RzV1x;
import java.util.HashSet;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class ZDJ0X2XQ4 {
    public static int J4Ux7ym32;
    public static sArOew9FC q3BipwRCk = new sArOew9FC();
    public static int tGV7Q6urW;

    public static void GPLPRo6go(int i, k007RzV1x k007rzv1x, jK3ds2GCn.RG2GI7LDp rG2GI7LDp) {
        h7j7Zcum2 h7j7zcum2;
        h7j7Zcum2 h7j7zcum22;
        h7j7Zcum2 h7j7zcum23;
        h7j7Zcum2 h7j7zcum24;
        h7j7Zcum2 h7j7zcum25;
        k007RzV1x.RG2GI7LDp rG2GI7LDp2 = k007RzV1x.RG2GI7LDp.MATCH_CONSTRAINT;
        if (!k007rzv1x.MzoOEjc4X) {
            boolean z = true;
            tGV7Q6urW++;
            if (!(k007rzv1x instanceof S5aezmTgi) && k007rzv1x.cAwN510t2() && q3BipwRCk(k007rzv1x)) {
                S5aezmTgi.KBYw84i3W(k007rzv1x, rG2GI7LDp, new sArOew9FC(), 0);
            }
            h7j7Zcum2 yWvV4ePLl = k007rzv1x.yWvV4ePLl(h7j7Zcum2.RG2GI7LDp.TOP);
            h7j7Zcum2 yWvV4ePLl2 = k007rzv1x.yWvV4ePLl(h7j7Zcum2.RG2GI7LDp.BOTTOM);
            int tGV7Q6urW2 = yWvV4ePLl.tGV7Q6urW();
            int tGV7Q6urW3 = yWvV4ePLl2.tGV7Q6urW();
            HashSet hashSet = yWvV4ePLl.q3BipwRCk;
            if (hashSet != null && yWvV4ePLl.tGV7Q6urW) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    h7j7Zcum2 h7j7zcum26 = (h7j7Zcum2) it.next();
                    k007RzV1x k007rzv1x2 = h7j7zcum26.dIocxURUo;
                    int i2 = i + 1;
                    boolean q3BipwRCk2 = q3BipwRCk(k007rzv1x2);
                    if (k007rzv1x2.cAwN510t2() && q3BipwRCk2) {
                        S5aezmTgi.KBYw84i3W(k007rzv1x2, rG2GI7LDp, new sArOew9FC(), 0);
                    }
                    if (k007rzv1x2.Eeka1udhb() != rG2GI7LDp2 || q3BipwRCk2) {
                        if (!k007rzv1x2.cAwN510t2()) {
                            h7j7Zcum2 h7j7zcum27 = k007rzv1x2.o4LF8RkoQ;
                            if (h7j7zcum26 == h7j7zcum27 && k007rzv1x2.QNqj6nIzv.iiGwOFFnr == null) {
                                int dIocxURUo = h7j7zcum27.dIocxURUo() + tGV7Q6urW2;
                                k007rzv1x2.i0Zug1mVk(dIocxURUo, k007rzv1x2.CBQ5d1kRq() + dIocxURUo);
                            } else {
                                h7j7Zcum2 h7j7zcum28 = k007rzv1x2.QNqj6nIzv;
                                if (h7j7zcum26 == h7j7zcum28 && h7j7zcum28.iiGwOFFnr == null) {
                                    int dIocxURUo2 = tGV7Q6urW2 - h7j7zcum28.dIocxURUo();
                                    k007rzv1x2.i0Zug1mVk(dIocxURUo2 - k007rzv1x2.CBQ5d1kRq(), dIocxURUo2);
                                } else if (h7j7zcum26 == h7j7zcum27 && (h7j7zcum23 = h7j7zcum28.iiGwOFFnr) != null && h7j7zcum23.tGV7Q6urW) {
                                    kCA6Zs9sL(i2, rG2GI7LDp, k007rzv1x2);
                                }
                            }
                            GPLPRo6go(i2, k007rzv1x2, rG2GI7LDp);
                        }
                    } else if (k007rzv1x2.Eeka1udhb() == rG2GI7LDp2 && k007rzv1x2.iMyQMM6Qj >= 0 && k007rzv1x2.dfpT1j18n >= 0 && ((k007rzv1x2.Dr7UqlxEV == 8 || (k007rzv1x2.RG6kpfv3v == 0 && k007rzv1x2.n4UIOvAko == 0.0f)) && !k007rzv1x2.iMyQMM6Qj())) {
                        h7j7Zcum2 h7j7zcum29 = k007rzv1x2.o4LF8RkoQ;
                        if ((((h7j7zcum26 != h7j7zcum29 || (h7j7zcum25 = k007rzv1x2.QNqj6nIzv.iiGwOFFnr) == null || !h7j7zcum25.tGV7Q6urW) && (h7j7zcum26 != k007rzv1x2.QNqj6nIzv || (h7j7zcum24 = h7j7zcum29.iiGwOFFnr) == null || !h7j7zcum24.tGV7Q6urW)) ? false : z) && !k007rzv1x2.iMyQMM6Qj()) {
                            iiGwOFFnr(i2, k007rzv1x, rG2GI7LDp, k007rzv1x2);
                        }
                    }
                    z = true;
                }
            }
            if (!(k007rzv1x instanceof SlV7nGkeq)) {
                HashSet hashSet2 = yWvV4ePLl2.q3BipwRCk;
                if (hashSet2 != null && yWvV4ePLl2.tGV7Q6urW) {
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        h7j7Zcum2 h7j7zcum210 = (h7j7Zcum2) it2.next();
                        k007RzV1x k007rzv1x3 = h7j7zcum210.dIocxURUo;
                        int i3 = i + 1;
                        boolean q3BipwRCk3 = q3BipwRCk(k007rzv1x3);
                        if (k007rzv1x3.cAwN510t2() && q3BipwRCk3) {
                            S5aezmTgi.KBYw84i3W(k007rzv1x3, rG2GI7LDp, new sArOew9FC(), 0);
                        }
                        h7j7Zcum2 h7j7zcum211 = k007rzv1x3.o4LF8RkoQ;
                        boolean z2 = (h7j7zcum210 == h7j7zcum211 && (h7j7zcum22 = k007rzv1x3.QNqj6nIzv.iiGwOFFnr) != null && h7j7zcum22.tGV7Q6urW) || (h7j7zcum210 == k007rzv1x3.QNqj6nIzv && (h7j7zcum2 = h7j7zcum211.iiGwOFFnr) != null && h7j7zcum2.tGV7Q6urW);
                        if (k007rzv1x3.Eeka1udhb() != rG2GI7LDp2 || q3BipwRCk3) {
                            if (!k007rzv1x3.cAwN510t2()) {
                                h7j7Zcum2 h7j7zcum212 = k007rzv1x3.o4LF8RkoQ;
                                if (h7j7zcum210 == h7j7zcum212 && k007rzv1x3.QNqj6nIzv.iiGwOFFnr == null) {
                                    int dIocxURUo3 = h7j7zcum212.dIocxURUo() + tGV7Q6urW3;
                                    k007rzv1x3.i0Zug1mVk(dIocxURUo3, k007rzv1x3.CBQ5d1kRq() + dIocxURUo3);
                                } else {
                                    h7j7Zcum2 h7j7zcum213 = k007rzv1x3.QNqj6nIzv;
                                    if (h7j7zcum210 == h7j7zcum213 && h7j7zcum212.iiGwOFFnr == null) {
                                        int dIocxURUo4 = tGV7Q6urW3 - h7j7zcum213.dIocxURUo();
                                        k007rzv1x3.i0Zug1mVk(dIocxURUo4 - k007rzv1x3.CBQ5d1kRq(), dIocxURUo4);
                                    } else if (z2 && !k007rzv1x3.iMyQMM6Qj()) {
                                        kCA6Zs9sL(i3, rG2GI7LDp, k007rzv1x3);
                                    }
                                }
                                GPLPRo6go(i3, k007rzv1x3, rG2GI7LDp);
                            }
                        } else if (k007rzv1x3.Eeka1udhb() == rG2GI7LDp2 && k007rzv1x3.iMyQMM6Qj >= 0 && k007rzv1x3.dfpT1j18n >= 0 && (k007rzv1x3.Dr7UqlxEV == 8 || (k007rzv1x3.RG6kpfv3v == 0 && k007rzv1x3.n4UIOvAko == 0.0f))) {
                            if (!k007rzv1x3.iMyQMM6Qj() && z2 && !k007rzv1x3.iMyQMM6Qj()) {
                                iiGwOFFnr(i3, k007rzv1x, rG2GI7LDp, k007rzv1x3);
                            }
                        }
                    }
                }
                h7j7Zcum2 yWvV4ePLl3 = k007rzv1x.yWvV4ePLl(h7j7Zcum2.RG2GI7LDp.BASELINE);
                if (yWvV4ePLl3.q3BipwRCk != null && yWvV4ePLl3.tGV7Q6urW) {
                    int tGV7Q6urW4 = yWvV4ePLl3.tGV7Q6urW();
                    Iterator it3 = yWvV4ePLl3.q3BipwRCk.iterator();
                    while (it3.hasNext()) {
                        h7j7Zcum2 h7j7zcum214 = (h7j7Zcum2) it3.next();
                        k007RzV1x k007rzv1x4 = h7j7zcum214.dIocxURUo;
                        int i4 = i + 1;
                        boolean q3BipwRCk4 = q3BipwRCk(k007rzv1x4);
                        if (k007rzv1x4.cAwN510t2() && q3BipwRCk4) {
                            S5aezmTgi.KBYw84i3W(k007rzv1x4, rG2GI7LDp, new sArOew9FC(), 0);
                        }
                        if (k007rzv1x4.Eeka1udhb() != rG2GI7LDp2 || q3BipwRCk4) {
                            if (!k007rzv1x4.cAwN510t2() && h7j7zcum214 == k007rzv1x4.igRQEZxnW) {
                                int dIocxURUo5 = h7j7zcum214.dIocxURUo() + tGV7Q6urW4;
                                if (k007rzv1x4.AqaWJg0b4) {
                                    int i5 = dIocxURUo5 - k007rzv1x4.XYT7vJqNO;
                                    int i6 = k007rzv1x4.IzM1cD9ly + i5;
                                    k007rzv1x4.DuuXfa7LE = i5;
                                    k007rzv1x4.o4LF8RkoQ.oon79WMrY(i5);
                                    k007rzv1x4.QNqj6nIzv.oon79WMrY(i6);
                                    h7j7Zcum2 h7j7zcum215 = k007rzv1x4.igRQEZxnW;
                                    h7j7zcum215.J4Ux7ym32 = dIocxURUo5;
                                    h7j7zcum215.tGV7Q6urW = true;
                                    k007rzv1x4.Bhmn1KIah = true;
                                }
                                GPLPRo6go(i4, k007rzv1x4, rG2GI7LDp);
                            }
                        }
                    }
                }
                k007rzv1x.MzoOEjc4X = true;
            }
        }
    }

    public static void J4Ux7ym32(int i, k007RzV1x k007rzv1x, jK3ds2GCn.RG2GI7LDp rG2GI7LDp, boolean z) {
        h7j7Zcum2 h7j7zcum2;
        h7j7Zcum2 h7j7zcum22;
        h7j7Zcum2 h7j7zcum23;
        h7j7Zcum2 h7j7zcum24;
        h7j7Zcum2 h7j7zcum25;
        k007RzV1x.RG2GI7LDp rG2GI7LDp2 = k007RzV1x.RG2GI7LDp.MATCH_CONSTRAINT;
        if (!k007rzv1x.PSTqBLTET) {
            J4Ux7ym32++;
            if (!(k007rzv1x instanceof S5aezmTgi) && k007rzv1x.cAwN510t2() && q3BipwRCk(k007rzv1x)) {
                S5aezmTgi.KBYw84i3W(k007rzv1x, rG2GI7LDp, new sArOew9FC(), 0);
            }
            h7j7Zcum2 yWvV4ePLl = k007rzv1x.yWvV4ePLl(h7j7Zcum2.RG2GI7LDp.LEFT);
            h7j7Zcum2 yWvV4ePLl2 = k007rzv1x.yWvV4ePLl(h7j7Zcum2.RG2GI7LDp.RIGHT);
            int tGV7Q6urW2 = yWvV4ePLl.tGV7Q6urW();
            int tGV7Q6urW3 = yWvV4ePLl2.tGV7Q6urW();
            HashSet hashSet = yWvV4ePLl.q3BipwRCk;
            float f = 0.0f;
            if (hashSet != null && yWvV4ePLl.tGV7Q6urW) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    h7j7Zcum2 h7j7zcum26 = (h7j7Zcum2) it.next();
                    k007RzV1x k007rzv1x2 = h7j7zcum26.dIocxURUo;
                    int i2 = i + 1;
                    boolean q3BipwRCk2 = q3BipwRCk(k007rzv1x2);
                    if (k007rzv1x2.cAwN510t2() && q3BipwRCk2) {
                        S5aezmTgi.KBYw84i3W(k007rzv1x2, rG2GI7LDp, new sArOew9FC(), 0);
                    }
                    if (k007rzv1x2.kmSgne1rO() != rG2GI7LDp2 || q3BipwRCk2) {
                        if (!k007rzv1x2.cAwN510t2()) {
                            h7j7Zcum2 h7j7zcum27 = k007rzv1x2.i0Zug1mVk;
                            if (h7j7zcum26 == h7j7zcum27 && k007rzv1x2.V9LQMKGJe.iiGwOFFnr == null) {
                                int dIocxURUo = h7j7zcum27.dIocxURUo() + tGV7Q6urW2;
                                k007rzv1x2.vNtjxmzUM(dIocxURUo, k007rzv1x2.dXrmkklc8() + dIocxURUo);
                            } else {
                                h7j7Zcum2 h7j7zcum28 = k007rzv1x2.V9LQMKGJe;
                                if (h7j7zcum26 == h7j7zcum28 && h7j7zcum27.iiGwOFFnr == null) {
                                    int dIocxURUo2 = tGV7Q6urW2 - h7j7zcum28.dIocxURUo();
                                    k007rzv1x2.vNtjxmzUM(dIocxURUo2 - k007rzv1x2.dXrmkklc8(), dIocxURUo2);
                                } else if (h7j7zcum26 == h7j7zcum27 && (h7j7zcum23 = h7j7zcum28.iiGwOFFnr) != null && h7j7zcum23.tGV7Q6urW && !k007rzv1x2.dfpT1j18n()) {
                                    tGV7Q6urW(i2, rG2GI7LDp, k007rzv1x2, z);
                                }
                            }
                            J4Ux7ym32(i2, k007rzv1x2, rG2GI7LDp, z);
                        }
                    } else if (k007rzv1x2.kmSgne1rO() == rG2GI7LDp2 && k007rzv1x2.WaUP0CF08 >= 0 && k007rzv1x2.sk5s77z6Q >= 0 && ((k007rzv1x2.Dr7UqlxEV == 8 || (k007rzv1x2.dXrmkklc8 == 0 && k007rzv1x2.n4UIOvAko == f)) && !k007rzv1x2.dfpT1j18n())) {
                        h7j7Zcum2 h7j7zcum29 = k007rzv1x2.i0Zug1mVk;
                        if (((h7j7zcum26 == h7j7zcum29 && (h7j7zcum25 = k007rzv1x2.V9LQMKGJe.iiGwOFFnr) != null && h7j7zcum25.tGV7Q6urW) || (h7j7zcum26 == k007rzv1x2.V9LQMKGJe && (h7j7zcum24 = h7j7zcum29.iiGwOFFnr) != null && h7j7zcum24.tGV7Q6urW)) && !k007rzv1x2.dfpT1j18n()) {
                            dIocxURUo(i2, k007rzv1x, rG2GI7LDp, k007rzv1x2, z);
                        }
                    }
                    f = 0.0f;
                }
            }
            if (!(k007rzv1x instanceof SlV7nGkeq)) {
                HashSet hashSet2 = yWvV4ePLl2.q3BipwRCk;
                if (hashSet2 != null && yWvV4ePLl2.tGV7Q6urW) {
                    Iterator it2 = hashSet2.iterator();
                    while (it2.hasNext()) {
                        h7j7Zcum2 h7j7zcum210 = (h7j7Zcum2) it2.next();
                        k007RzV1x k007rzv1x3 = h7j7zcum210.dIocxURUo;
                        int i3 = i + 1;
                        boolean q3BipwRCk3 = q3BipwRCk(k007rzv1x3);
                        if (k007rzv1x3.cAwN510t2() && q3BipwRCk3) {
                            S5aezmTgi.KBYw84i3W(k007rzv1x3, rG2GI7LDp, new sArOew9FC(), 0);
                        }
                        h7j7Zcum2 h7j7zcum211 = k007rzv1x3.i0Zug1mVk;
                        boolean z2 = (h7j7zcum210 == h7j7zcum211 && (h7j7zcum22 = k007rzv1x3.V9LQMKGJe.iiGwOFFnr) != null && h7j7zcum22.tGV7Q6urW) || (h7j7zcum210 == k007rzv1x3.V9LQMKGJe && (h7j7zcum2 = h7j7zcum211.iiGwOFFnr) != null && h7j7zcum2.tGV7Q6urW);
                        if (k007rzv1x3.kmSgne1rO() != rG2GI7LDp2 || q3BipwRCk3) {
                            if (!k007rzv1x3.cAwN510t2()) {
                                h7j7Zcum2 h7j7zcum212 = k007rzv1x3.i0Zug1mVk;
                                if (h7j7zcum210 == h7j7zcum212 && k007rzv1x3.V9LQMKGJe.iiGwOFFnr == null) {
                                    int dIocxURUo3 = h7j7zcum212.dIocxURUo() + tGV7Q6urW3;
                                    k007rzv1x3.vNtjxmzUM(dIocxURUo3, k007rzv1x3.dXrmkklc8() + dIocxURUo3);
                                } else {
                                    h7j7Zcum2 h7j7zcum213 = k007rzv1x3.V9LQMKGJe;
                                    if (h7j7zcum210 == h7j7zcum213 && h7j7zcum212.iiGwOFFnr == null) {
                                        int dIocxURUo4 = tGV7Q6urW3 - h7j7zcum213.dIocxURUo();
                                        k007rzv1x3.vNtjxmzUM(dIocxURUo4 - k007rzv1x3.dXrmkklc8(), dIocxURUo4);
                                    } else if (z2 && !k007rzv1x3.dfpT1j18n()) {
                                        tGV7Q6urW(i3, rG2GI7LDp, k007rzv1x3, z);
                                    }
                                }
                                J4Ux7ym32(i3, k007rzv1x3, rG2GI7LDp, z);
                            }
                        } else if (k007rzv1x3.kmSgne1rO() == rG2GI7LDp2 && k007rzv1x3.WaUP0CF08 >= 0 && k007rzv1x3.sk5s77z6Q >= 0) {
                            if (k007rzv1x3.Dr7UqlxEV != 8) {
                                if (k007rzv1x3.dXrmkklc8 == 0) {
                                    if (k007rzv1x3.n4UIOvAko == 0.0f) {
                                    }
                                }
                            }
                            if (!k007rzv1x3.dfpT1j18n() && z2 && !k007rzv1x3.dfpT1j18n()) {
                                dIocxURUo(i3, k007rzv1x, rG2GI7LDp, k007rzv1x3, z);
                            }
                        }
                    }
                }
                k007rzv1x.PSTqBLTET = true;
            }
        }
    }

    public static void dIocxURUo(int i, k007RzV1x k007rzv1x, jK3ds2GCn.RG2GI7LDp rG2GI7LDp, k007RzV1x k007rzv1x2, boolean z) {
        float f = k007rzv1x2.INnK5Rew6;
        int dIocxURUo = k007rzv1x2.i0Zug1mVk.dIocxURUo() + k007rzv1x2.i0Zug1mVk.iiGwOFFnr.tGV7Q6urW();
        int tGV7Q6urW2 = k007rzv1x2.V9LQMKGJe.iiGwOFFnr.tGV7Q6urW() - k007rzv1x2.V9LQMKGJe.dIocxURUo();
        if (tGV7Q6urW2 >= dIocxURUo) {
            int dXrmkklc8 = k007rzv1x2.dXrmkklc8();
            if (k007rzv1x2.Dr7UqlxEV != 8) {
                int i2 = k007rzv1x2.dXrmkklc8;
                if (i2 == 2) {
                    if (!(k007rzv1x instanceof S5aezmTgi)) {
                        k007rzv1x = k007rzv1x.ziwPzaoF3;
                    }
                    dXrmkklc8 = (int) (k007rzv1x2.INnK5Rew6 * 0.5f * ((float) k007rzv1x.dXrmkklc8()));
                } else if (i2 == 0) {
                    dXrmkklc8 = tGV7Q6urW2 - dIocxURUo;
                }
                dXrmkklc8 = Math.max(k007rzv1x2.sk5s77z6Q, dXrmkklc8);
                int i3 = k007rzv1x2.WaUP0CF08;
                if (i3 > 0) {
                    dXrmkklc8 = Math.min(i3, dXrmkklc8);
                }
            }
            int i4 = dIocxURUo + ((int) ((f * ((float) ((tGV7Q6urW2 - dIocxURUo) - dXrmkklc8))) + 0.5f));
            k007rzv1x2.vNtjxmzUM(i4, dXrmkklc8 + i4);
            J4Ux7ym32(i + 1, k007rzv1x2, rG2GI7LDp, z);
        }
    }

    public static void iiGwOFFnr(int i, k007RzV1x k007rzv1x, jK3ds2GCn.RG2GI7LDp rG2GI7LDp, k007RzV1x k007rzv1x2) {
        float f = k007rzv1x2.SuKhTJIQc;
        int dIocxURUo = k007rzv1x2.o4LF8RkoQ.dIocxURUo() + k007rzv1x2.o4LF8RkoQ.iiGwOFFnr.tGV7Q6urW();
        int tGV7Q6urW2 = k007rzv1x2.QNqj6nIzv.iiGwOFFnr.tGV7Q6urW() - k007rzv1x2.QNqj6nIzv.dIocxURUo();
        if (tGV7Q6urW2 >= dIocxURUo) {
            int CBQ5d1kRq = k007rzv1x2.CBQ5d1kRq();
            if (k007rzv1x2.Dr7UqlxEV != 8) {
                int i2 = k007rzv1x2.RG6kpfv3v;
                if (i2 == 2) {
                    if (!(k007rzv1x instanceof S5aezmTgi)) {
                        k007rzv1x = k007rzv1x.ziwPzaoF3;
                    }
                    CBQ5d1kRq = (int) (f * 0.5f * ((float) k007rzv1x.CBQ5d1kRq()));
                } else if (i2 == 0) {
                    CBQ5d1kRq = tGV7Q6urW2 - dIocxURUo;
                }
                CBQ5d1kRq = Math.max(k007rzv1x2.dfpT1j18n, CBQ5d1kRq);
                int i3 = k007rzv1x2.iMyQMM6Qj;
                if (i3 > 0) {
                    CBQ5d1kRq = Math.min(i3, CBQ5d1kRq);
                }
            }
            int i4 = dIocxURUo + ((int) ((f * ((float) ((tGV7Q6urW2 - dIocxURUo) - CBQ5d1kRq))) + 0.5f));
            k007rzv1x2.i0Zug1mVk(i4, CBQ5d1kRq + i4);
            GPLPRo6go(i + 1, k007rzv1x2, rG2GI7LDp);
        }
    }

    public static void kCA6Zs9sL(int i, jK3ds2GCn.RG2GI7LDp rG2GI7LDp, k007RzV1x k007rzv1x) {
        float f = k007rzv1x.SuKhTJIQc;
        int tGV7Q6urW2 = k007rzv1x.o4LF8RkoQ.iiGwOFFnr.tGV7Q6urW();
        int tGV7Q6urW3 = k007rzv1x.QNqj6nIzv.iiGwOFFnr.tGV7Q6urW();
        tGV7Q6urW2 = k007rzv1x.o4LF8RkoQ.dIocxURUo() + tGV7Q6urW2;
        tGV7Q6urW3 -= k007rzv1x.QNqj6nIzv.dIocxURUo();
        if (tGV7Q6urW2 == tGV7Q6urW3) {
            f = 0.5f;
        }
        int CBQ5d1kRq = k007rzv1x.CBQ5d1kRq();
        int i2 = (tGV7Q6urW3 - tGV7Q6urW2) - CBQ5d1kRq;
        if (tGV7Q6urW2 > tGV7Q6urW3) {
            i2 = (tGV7Q6urW2 - tGV7Q6urW3) - CBQ5d1kRq;
        }
        int i3 = (int) (i2 > 0 ? (f * ((float) i2)) + 0.5f : f * ((float) i2));
        int i4 = tGV7Q6urW2 + i3;
        int i5 = i4 + CBQ5d1kRq;
        if (tGV7Q6urW2 > tGV7Q6urW3) {
            i4 = tGV7Q6urW2 - i3;
            i5 = i4 - CBQ5d1kRq;
        }
        k007rzv1x.i0Zug1mVk(i4, i5);
        GPLPRo6go(i + 1, k007rzv1x, rG2GI7LDp);
    }

    public static boolean q3BipwRCk(k007RzV1x k007rzv1x) {
        k007RzV1x.RG2GI7LDp rG2GI7LDp = k007RzV1x.RG2GI7LDp.MATCH_CONSTRAINT;
        k007RzV1x.RG2GI7LDp rG2GI7LDp2 = k007RzV1x.RG2GI7LDp.WRAP_CONTENT;
        k007RzV1x.RG2GI7LDp rG2GI7LDp3 = k007RzV1x.RG2GI7LDp.FIXED;
        k007RzV1x.RG2GI7LDp kmSgne1rO = k007rzv1x.kmSgne1rO();
        k007RzV1x.RG2GI7LDp Eeka1udhb = k007rzv1x.Eeka1udhb();
        k007RzV1x k007rzv1x2 = k007rzv1x.ziwPzaoF3;
        S5aezmTgi s5aezmTgi = k007rzv1x2 != null ? (S5aezmTgi) k007rzv1x2 : null;
        if (s5aezmTgi != null) {
            s5aezmTgi.kmSgne1rO();
        }
        if (s5aezmTgi != null) {
            s5aezmTgi.Eeka1udhb();
        }
        boolean z = kmSgne1rO == rG2GI7LDp3 || k007rzv1x.IytU16YUK() || kmSgne1rO == rG2GI7LDp2 || (kmSgne1rO == rG2GI7LDp && k007rzv1x.dXrmkklc8 == 0 && k007rzv1x.n4UIOvAko == 0.0f && k007rzv1x.sk5s77z6Q(0)) || (kmSgne1rO == rG2GI7LDp && k007rzv1x.dXrmkklc8 == 1 && k007rzv1x.WaUP0CF08(0, k007rzv1x.dXrmkklc8()));
        boolean z2 = Eeka1udhb == rG2GI7LDp3 || k007rzv1x.CpG0imbht() || Eeka1udhb == rG2GI7LDp2 || (Eeka1udhb == rG2GI7LDp && k007rzv1x.RG6kpfv3v == 0 && k007rzv1x.n4UIOvAko == 0.0f && k007rzv1x.sk5s77z6Q(1)) || (kmSgne1rO == rG2GI7LDp && k007rzv1x.RG6kpfv3v == 1 && k007rzv1x.WaUP0CF08(1, k007rzv1x.CBQ5d1kRq()));
        if (k007rzv1x.n4UIOvAko <= 0.0f || (!z && !z2)) {
            return z && z2;
        }
        return true;
    }

    public static void tGV7Q6urW(int i, jK3ds2GCn.RG2GI7LDp rG2GI7LDp, k007RzV1x k007rzv1x, boolean z) {
        float f = k007rzv1x.INnK5Rew6;
        int tGV7Q6urW2 = k007rzv1x.i0Zug1mVk.iiGwOFFnr.tGV7Q6urW();
        int tGV7Q6urW3 = k007rzv1x.V9LQMKGJe.iiGwOFFnr.tGV7Q6urW();
        tGV7Q6urW2 = k007rzv1x.i0Zug1mVk.dIocxURUo() + tGV7Q6urW2;
        tGV7Q6urW3 -= k007rzv1x.V9LQMKGJe.dIocxURUo();
        if (tGV7Q6urW2 == tGV7Q6urW3) {
            f = 0.5f;
        }
        int dXrmkklc8 = k007rzv1x.dXrmkklc8();
        int i2 = (tGV7Q6urW3 - tGV7Q6urW2) - dXrmkklc8;
        if (tGV7Q6urW2 > tGV7Q6urW3) {
            i2 = (tGV7Q6urW2 - tGV7Q6urW3) - dXrmkklc8;
        }
        int i3 = ((int) (i2 > 0 ? (f * ((float) i2)) + 0.5f : f * ((float) i2))) + tGV7Q6urW2;
        int i4 = i3 + dXrmkklc8;
        if (tGV7Q6urW2 > tGV7Q6urW3) {
            i4 = i3 - dXrmkklc8;
        }
        k007rzv1x.vNtjxmzUM(i3, i4);
        J4Ux7ym32(i + 1, k007rzv1x, rG2GI7LDp, z);
    }
}
