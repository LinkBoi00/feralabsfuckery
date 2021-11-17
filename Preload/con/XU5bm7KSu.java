package con;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class XU5bm7KSu {
    public static final xobLfQFEO tGV7Q6urW;
    public static final int[] q3BipwRCk = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    public static final xobLfQFEO J4Ux7ym32 = new ymwkPoInc();

    static {
        xobLfQFEO xoblfqfeo;
        try {
            xoblfqfeo = (xobLfQFEO) JCSn1vIoh.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            xoblfqfeo = null;
        }
        tGV7Q6urW = xoblfqfeo;
    }

    public static void Bhmn1KIah(xobLfQFEO xoblfqfeo, Object obj, Object obj2, rwhamSOu2 rwhamsou2, boolean z, xkmNtxX26 xkmntxx26) {
        ArrayList arrayList = xkmntxx26.kmSgne1rO;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = (View) rwhamsou2.get((String) (z ? xkmntxx26.Bhmn1KIah : xkmntxx26.kmSgne1rO).get(0));
            xoblfqfeo.dXrmkklc8(obj, view);
            if (obj2 != null) {
                xoblfqfeo.dXrmkklc8(obj2, view);
            }
        }
    }

    public static Object CBQ5d1kRq(xobLfQFEO xoblfqfeo, UxHHqhbTP uxHHqhbTP, UxHHqhbTP uxHHqhbTP2, boolean z) {
        Object obj;
        if (z) {
            obj = uxHHqhbTP2.WaUP0CF08();
        } else {
            uxHHqhbTP.sk5s77z6Q();
            obj = null;
        }
        return xoblfqfeo.i8XZMQc6Z(xoblfqfeo.GPLPRo6go(obj));
    }

    public static xobLfQFEO GPLPRo6go(UxHHqhbTP uxHHqhbTP, UxHHqhbTP uxHHqhbTP2) {
        ArrayList arrayList = new ArrayList();
        if (uxHHqhbTP != null) {
            uxHHqhbTP.kmSgne1rO();
            Object ixWaw2akD = uxHHqhbTP.ixWaw2akD();
            if (ixWaw2akD != null) {
                arrayList.add(ixWaw2akD);
            }
            Object WaUP0CF08 = uxHHqhbTP.WaUP0CF08();
            if (WaUP0CF08 != null) {
                arrayList.add(WaUP0CF08);
            }
        }
        if (uxHHqhbTP2 != null) {
            uxHHqhbTP2.oon79WMrY();
            Object dXrmkklc8 = uxHHqhbTP2.dXrmkklc8();
            if (dXrmkklc8 != null) {
                arrayList.add(dXrmkklc8);
            }
            uxHHqhbTP2.sk5s77z6Q();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        xobLfQFEO xoblfqfeo = J4Ux7ym32;
        if (dIocxURUo(xoblfqfeo, arrayList)) {
            return xoblfqfeo;
        }
        xobLfQFEO xoblfqfeo2 = tGV7Q6urW;
        if (xoblfqfeo2 != null && dIocxURUo(xoblfqfeo2, arrayList)) {
            return xoblfqfeo2;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0039, code lost:
        if (r0.ixWaw2akD != false) goto L_0x0089;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0075, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0087, code lost:
        if (r0.vNtjxmzUM != false) goto L_0x007f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0089, code lost:
        r9 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static void J4Ux7ym32(xkmNtxX26 xkmntxx26, ah1jjZN55 ah1jjzn55, SparseArray sparseArray, boolean z, boolean z2) {
        int i;
        boolean z3;
        boolean z4;
        pIv3jHZsn piv3jhzsn;
        UxHHqhbTP uxHHqhbTP = ah1jjzn55.J4Ux7ym32;
        if (uxHHqhbTP != null && (i = uxHHqhbTP.mUqPm6GBh) != 0) {
            int i2 = z ? q3BipwRCk[ah1jjzn55.q3BipwRCk] : ah1jjzn55.q3BipwRCk;
            boolean z5 = true;
            boolean z6 = false;
            if (i2 != 1) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        boolean z7 = !z2 ? false : false;
                        z4 = z7;
                        z3 = false;
                        z6 = true;
                        z5 = false;
                        piv3jhzsn = (pIv3jHZsn) sparseArray.get(i);
                        if (z3) {
                        }
                        if (!z2) {
                        }
                        if (z4) {
                        }
                        if (!z2) {
                        }
                    } else if (i2 != 5) {
                        if (i2 != 6) {
                            if (i2 != 7) {
                                z3 = false;
                                z5 = false;
                                z4 = false;
                                piv3jhzsn = (pIv3jHZsn) sparseArray.get(i);
                                if (z3) {
                                    if (piv3jhzsn == null) {
                                        pIv3jHZsn piv3jhzsn2 = new pIv3jHZsn();
                                        sparseArray.put(i, piv3jhzsn2);
                                        piv3jhzsn = piv3jhzsn2;
                                    }
                                    piv3jhzsn.q3BipwRCk = uxHHqhbTP;
                                    piv3jhzsn.J4Ux7ym32 = z;
                                    piv3jhzsn.tGV7Q6urW = xkmntxx26;
                                }
                                if (!z2 && z5) {
                                    if (piv3jhzsn != null && piv3jhzsn.dIocxURUo == uxHHqhbTP) {
                                        piv3jhzsn.dIocxURUo = null;
                                    }
                                    if (!xkmntxx26.PSTqBLTET) {
                                        fVMSvDhE6 fvmsvdhe6 = xkmntxx26.MzoOEjc4X;
                                        fvmsvdhe6.tGV7Q6urW.qFBXIgpia(fvmsvdhe6.oon79WMrY(uxHHqhbTP));
                                        fvmsvdhe6.wIZEdYHUn(uxHHqhbTP, fvmsvdhe6.MzoOEjc4X);
                                    }
                                }
                                if (z4 && (piv3jhzsn == null || piv3jhzsn.dIocxURUo == null)) {
                                    if (piv3jhzsn == null) {
                                        pIv3jHZsn piv3jhzsn3 = new pIv3jHZsn();
                                        sparseArray.put(i, piv3jhzsn3);
                                        piv3jhzsn = piv3jhzsn3;
                                    }
                                    piv3jhzsn.dIocxURUo = uxHHqhbTP;
                                    piv3jhzsn.kCA6Zs9sL = z;
                                    piv3jhzsn.iiGwOFFnr = xkmntxx26;
                                }
                                if (!z2 && z6 && piv3jhzsn != null && piv3jhzsn.q3BipwRCk == uxHHqhbTP) {
                                    piv3jhzsn.q3BipwRCk = null;
                                    return;
                                }
                                return;
                            }
                        }
                    } else if (z2) {
                        if (uxHHqhbTP.QSbMsHU5X) {
                            if (!uxHHqhbTP.vNtjxmzUM) {
                            }
                        }
                        z3 = false;
                        z4 = false;
                        piv3jhzsn = (pIv3jHZsn) sparseArray.get(i);
                        if (z3) {
                        }
                        if (!z2) {
                            if (piv3jhzsn != null) {
                                piv3jhzsn.dIocxURUo = null;
                            }
                            if (!xkmntxx26.PSTqBLTET) {
                            }
                        }
                        if (z4) {
                            if (piv3jhzsn == null) {
                            }
                            piv3jhzsn.dIocxURUo = uxHHqhbTP;
                            piv3jhzsn.kCA6Zs9sL = z;
                            piv3jhzsn.iiGwOFFnr = xkmntxx26;
                        }
                        if (!z2) {
                            return;
                        }
                        return;
                    } else {
                        z3 = uxHHqhbTP.vNtjxmzUM;
                        z4 = false;
                        piv3jhzsn = (pIv3jHZsn) sparseArray.get(i);
                        if (z3) {
                        }
                        if (!z2) {
                        }
                        if (z4) {
                        }
                        if (!z2) {
                        }
                    }
                }
                boolean z8 = uxHHqhbTP.ixWaw2akD;
                if (!z2) {
                }
                z4 = z7;
                z3 = false;
                z6 = true;
                z5 = false;
                piv3jhzsn = (pIv3jHZsn) sparseArray.get(i);
                if (z3) {
                }
                if (!z2) {
                }
                if (z4) {
                }
                if (!z2) {
                }
            }
            if (!z2) {
                if (!uxHHqhbTP.ixWaw2akD) {
                }
            }
            z3 = false;
            z4 = false;
            piv3jhzsn = (pIv3jHZsn) sparseArray.get(i);
            if (z3) {
            }
            if (!z2) {
            }
            if (z4) {
            }
            if (!z2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0233  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static void MzoOEjc4X(Context context, BKr8aejj7 bKr8aejj7, ArrayList arrayList, ArrayList arrayList2, int i, int i2, boolean z, uRyiqsiNk uryiqsink) {
        int i3;
        SparseArray sparseArray;
        int i4;
        ViewGroup viewGroup;
        int i5;
        rwhamSOu2 rwhamsou2;
        ArrayList arrayList3;
        Object obj;
        uRyiqsiNk uryiqsink2;
        ArrayList Puu3Rhg4F;
        Object kmSgne1rO;
        uRyiqsiNk uryiqsink3;
        ArrayList arrayList4;
        Object obj2;
        rwhamSOu2 rwhamsou22;
        Object obj3;
        Rect rect;
        UxHHqhbTP uxHHqhbTP;
        UxHHqhbTP uxHHqhbTP2;
        boolean z2;
        ArrayList arrayList5;
        rwhamSOu2 rwhamsou23;
        UxHHqhbTP uxHHqhbTP3;
        Object obj4;
        uRyiqsiNk uryiqsink4;
        Object kmSgne1rO2;
        Rect rect2;
        View view;
        ArrayList arrayList6 = arrayList;
        ArrayList arrayList7 = arrayList2;
        int i6 = i2;
        boolean z3 = z;
        uRyiqsiNk uryiqsink5 = uryiqsink;
        SparseArray sparseArray2 = new SparseArray();
        for (int i7 = i; i7 < i6; i7++) {
            xkmNtxX26 xkmntxx26 = (xkmNtxX26) arrayList6.get(i7);
            if (!((Boolean) arrayList7.get(i7)).booleanValue()) {
                int size = xkmntxx26.q3BipwRCk.size();
                for (int i8 = 0; i8 < size; i8++) {
                    J4Ux7ym32(xkmntxx26, (ah1jjZN55) xkmntxx26.q3BipwRCk.get(i8), sparseArray2, false, z3);
                }
            } else if (xkmntxx26.MzoOEjc4X.qVUwofr5s.dIocxURUo()) {
                for (int size2 = xkmntxx26.q3BipwRCk.size() - 1; size2 >= 0; size2--) {
                    J4Ux7ym32(xkmntxx26, (ah1jjZN55) xkmntxx26.q3BipwRCk.get(size2), sparseArray2, true, z3);
                }
            }
        }
        if (sparseArray2.size() != 0) {
            View view2 = new View(context);
            int size3 = sparseArray2.size();
            uRyiqsiNk uryiqsink6 = uryiqsink5;
            int i9 = 0;
            while (i9 < size3) {
                int keyAt = sparseArray2.keyAt(i9);
                rwhamSOu2 rwhamsou24 = new rwhamSOu2();
                int i10 = i6 - 1;
                while (i10 >= i) {
                    xkmNtxX26 xkmntxx262 = (xkmNtxX26) arrayList6.get(i10);
                    if (xkmntxx262.yWvV4ePLl(keyAt)) {
                        boolean booleanValue = ((Boolean) arrayList7.get(i10)).booleanValue();
                        ArrayList arrayList8 = xkmntxx262.kmSgne1rO;
                        if (arrayList8 != null) {
                            int size4 = arrayList8.size();
                            ArrayList arrayList9 = xkmntxx262.kmSgne1rO;
                            ArrayList arrayList10 = xkmntxx262.Bhmn1KIah;
                            if (!booleanValue) {
                                arrayList10 = arrayList9;
                                arrayList9 = arrayList10;
                            }
                            int i11 = 0;
                            while (i11 < size4) {
                                String str = (String) arrayList10.get(i11);
                                String str2 = (String) arrayList9.get(i11);
                                String str3 = (String) rwhamsou24.remove(str2);
                                if (str3 != null) {
                                    rwhamsou24.put(str, str3);
                                } else {
                                    rwhamsou24.put(str, str2);
                                }
                                i11++;
                                size4 = size4;
                                arrayList9 = arrayList9;
                            }
                        }
                    }
                    i10--;
                    arrayList6 = arrayList;
                    arrayList7 = arrayList2;
                }
                pIv3jHZsn piv3jhzsn = (pIv3jHZsn) sparseArray2.valueAt(i9);
                if (!bKr8aejj7.dIocxURUo() || (viewGroup = (ViewGroup) bKr8aejj7.tGV7Q6urW(keyAt)) == null) {
                    sparseArray = sparseArray2;
                    i3 = i9;
                    i4 = size3;
                    uryiqsink6 = uryiqsink6;
                } else {
                    if (z3) {
                        UxHHqhbTP uxHHqhbTP4 = piv3jhzsn.q3BipwRCk;
                        UxHHqhbTP uxHHqhbTP5 = piv3jhzsn.dIocxURUo;
                        xobLfQFEO GPLPRo6go = GPLPRo6go(uxHHqhbTP5, uxHHqhbTP4);
                        if (GPLPRo6go == null) {
                            sparseArray = sparseArray2;
                            i3 = i9;
                            i5 = size3;
                        } else {
                            boolean z4 = piv3jhzsn.J4Ux7ym32;
                            boolean z5 = piv3jhzsn.kCA6Zs9sL;
                            ArrayList arrayList11 = new ArrayList();
                            ArrayList arrayList12 = new ArrayList();
                            Object yWvV4ePLl = yWvV4ePLl(GPLPRo6go, uxHHqhbTP4, z4);
                            Object oon79WMrY = oon79WMrY(GPLPRo6go, uxHHqhbTP5, z5);
                            sparseArray = sparseArray2;
                            UxHHqhbTP uxHHqhbTP6 = piv3jhzsn.q3BipwRCk;
                            UxHHqhbTP uxHHqhbTP7 = piv3jhzsn.dIocxURUo;
                            i3 = i9;
                            if (uxHHqhbTP6 != null) {
                                i5 = size3;
                                uxHHqhbTP6.wIZEdYHUn().setVisibility(0);
                            } else {
                                i5 = size3;
                            }
                            if (uxHHqhbTP6 == null || uxHHqhbTP7 == null) {
                                arrayList5 = arrayList11;
                                uxHHqhbTP3 = uxHHqhbTP4;
                            } else {
                                boolean z6 = piv3jhzsn.J4Ux7ym32;
                                Object CBQ5d1kRq = rwhamsou24.isEmpty() ? null : CBQ5d1kRq(GPLPRo6go, uxHHqhbTP6, uxHHqhbTP7, z6);
                                rwhamSOu2 iiGwOFFnr = iiGwOFFnr(GPLPRo6go, rwhamsou24, CBQ5d1kRq, piv3jhzsn);
                                uxHHqhbTP3 = uxHHqhbTP4;
                                rwhamSOu2 kCA6Zs9sL = kCA6Zs9sL(GPLPRo6go, rwhamsou24, CBQ5d1kRq, piv3jhzsn);
                                if (rwhamsou24.isEmpty()) {
                                    if (iiGwOFFnr != null) {
                                        iiGwOFFnr.clear();
                                    }
                                    if (kCA6Zs9sL != null) {
                                        kCA6Zs9sL.clear();
                                    }
                                    obj4 = null;
                                } else {
                                    q3BipwRCk(arrayList12, iiGwOFFnr, rwhamsou24.keySet());
                                    q3BipwRCk(arrayList11, kCA6Zs9sL, rwhamsou24.values());
                                    obj4 = CBQ5d1kRq;
                                }
                                if (yWvV4ePLl == null && oon79WMrY == null && obj4 == null) {
                                    arrayList5 = arrayList11;
                                } else {
                                    rwhamsou23 = rwhamsou24;
                                    tGV7Q6urW(uxHHqhbTP6, uxHHqhbTP7, z6, iiGwOFFnr, true);
                                    if (obj4 != null) {
                                        arrayList11.add(view2);
                                        GPLPRo6go.sk5s77z6Q(obj4, view2, arrayList12);
                                        arrayList5 = arrayList11;
                                        Bhmn1KIah(GPLPRo6go, obj4, oon79WMrY, iiGwOFFnr, piv3jhzsn.kCA6Zs9sL, piv3jhzsn.iiGwOFFnr);
                                        Rect rect3 = new Rect();
                                        View vPSbyrYWX = vPSbyrYWX(kCA6Zs9sL, piv3jhzsn, yWvV4ePLl, z6);
                                        if (vPSbyrYWX != null) {
                                            GPLPRo6go.Eeka1udhb(yWvV4ePLl, rect3);
                                        }
                                        view = vPSbyrYWX;
                                        rect2 = rect3;
                                    } else {
                                        arrayList5 = arrayList11;
                                        view = null;
                                        rect2 = null;
                                    }
                                    zgCCamJKk.q3BipwRCk(viewGroup, new TEVOiLnrc(uxHHqhbTP6, uxHHqhbTP7, z6, kCA6Zs9sL, view, GPLPRo6go, rect2));
                                    if (yWvV4ePLl != null && obj4 == null && oon79WMrY == null) {
                                        uryiqsink4 = uryiqsink;
                                    } else {
                                        ArrayList Puu3Rhg4F2 = Puu3Rhg4F(GPLPRo6go, oon79WMrY, uxHHqhbTP5, arrayList12, view2);
                                        ArrayList Puu3Rhg4F3 = Puu3Rhg4F(GPLPRo6go, yWvV4ePLl, uxHHqhbTP3, arrayList5, view2);
                                        PSTqBLTET(Puu3Rhg4F3, 4);
                                        kmSgne1rO2 = GPLPRo6go.kmSgne1rO(oon79WMrY, yWvV4ePLl, obj4);
                                        if (uxHHqhbTP5 != null || Puu3Rhg4F2 == null || (Puu3Rhg4F2.size() <= 0 && arrayList12.size() <= 0)) {
                                            uryiqsink4 = uryiqsink;
                                        } else {
                                            ce8tBZHr1 ce8tbzhr1 = new ce8tBZHr1();
                                            uryiqsink4 = uryiqsink;
                                            uryiqsink4.dIocxURUo(uxHHqhbTP5, ce8tbzhr1);
                                            GPLPRo6go.RG6kpfv3v(uxHHqhbTP5, kmSgne1rO2, ce8tbzhr1, new ilRFFqvx8(uryiqsink4, uxHHqhbTP5, ce8tbzhr1, 0));
                                        }
                                        if (kmSgne1rO2 != null) {
                                            if (uxHHqhbTP5 != null && oon79WMrY != null && uxHHqhbTP5.ixWaw2akD && uxHHqhbTP5.vNtjxmzUM && uxHHqhbTP5.QSbMsHU5X) {
                                                uxHHqhbTP5.XYT7vJqNO(true);
                                                GPLPRo6go.ilHKhw3Yw(oon79WMrY, uxHHqhbTP5.EBQXiIPmm, Puu3Rhg4F2);
                                                zgCCamJKk.q3BipwRCk(uxHHqhbTP5.igRQEZxnW, new Ybx9VCssc(Puu3Rhg4F2));
                                            }
                                            ArrayList Bhmn1KIah = GPLPRo6go.Bhmn1KIah(arrayList5);
                                            GPLPRo6go.qVUwofr5s(kmSgne1rO2, yWvV4ePLl, Puu3Rhg4F3, oon79WMrY, Puu3Rhg4F2, obj4, arrayList5);
                                            GPLPRo6go.tGV7Q6urW(viewGroup, kmSgne1rO2);
                                            GPLPRo6go.ixWaw2akD(viewGroup, arrayList12, arrayList5, Bhmn1KIah, rwhamsou23);
                                            PSTqBLTET(Puu3Rhg4F3, 0);
                                            GPLPRo6go.WaUP0CF08(obj4, arrayList12, arrayList5);
                                        }
                                    }
                                    uryiqsink6 = uryiqsink4;
                                }
                            }
                            rwhamsou23 = rwhamsou24;
                            obj4 = null;
                            if (yWvV4ePLl != null) {
                            }
                            ArrayList Puu3Rhg4F22 = Puu3Rhg4F(GPLPRo6go, oon79WMrY, uxHHqhbTP5, arrayList12, view2);
                            ArrayList Puu3Rhg4F32 = Puu3Rhg4F(GPLPRo6go, yWvV4ePLl, uxHHqhbTP3, arrayList5, view2);
                            PSTqBLTET(Puu3Rhg4F32, 4);
                            kmSgne1rO2 = GPLPRo6go.kmSgne1rO(oon79WMrY, yWvV4ePLl, obj4);
                            if (uxHHqhbTP5 != null) {
                            }
                            uryiqsink4 = uryiqsink;
                            if (kmSgne1rO2 != null) {
                            }
                            uryiqsink6 = uryiqsink4;
                        }
                    } else {
                        sparseArray = sparseArray2;
                        i3 = i9;
                        i5 = size3;
                        UxHHqhbTP uxHHqhbTP8 = piv3jhzsn.q3BipwRCk;
                        UxHHqhbTP uxHHqhbTP9 = piv3jhzsn.dIocxURUo;
                        xobLfQFEO GPLPRo6go2 = GPLPRo6go(uxHHqhbTP9, uxHHqhbTP8);
                        if (GPLPRo6go2 != null) {
                            boolean z7 = piv3jhzsn.J4Ux7ym32;
                            boolean z8 = piv3jhzsn.kCA6Zs9sL;
                            Object yWvV4ePLl2 = yWvV4ePLl(GPLPRo6go2, uxHHqhbTP8, z7);
                            Object oon79WMrY2 = oon79WMrY(GPLPRo6go2, uxHHqhbTP9, z8);
                            ArrayList arrayList13 = new ArrayList();
                            ArrayList arrayList14 = new ArrayList();
                            UxHHqhbTP uxHHqhbTP10 = piv3jhzsn.q3BipwRCk;
                            UxHHqhbTP uxHHqhbTP11 = piv3jhzsn.dIocxURUo;
                            if (uxHHqhbTP10 == null || uxHHqhbTP11 == null) {
                                uryiqsink3 = uryiqsink6;
                                arrayList3 = arrayList14;
                                i4 = i5;
                                rwhamsou2 = rwhamsou24;
                            } else {
                                boolean z9 = piv3jhzsn.J4Ux7ym32;
                                if (rwhamsou24.isEmpty()) {
                                    uryiqsink3 = uryiqsink6;
                                    arrayList4 = arrayList14;
                                    rwhamsou22 = rwhamsou24;
                                    obj2 = null;
                                } else {
                                    obj2 = CBQ5d1kRq(GPLPRo6go2, uxHHqhbTP10, uxHHqhbTP11, z9);
                                    uryiqsink3 = uryiqsink6;
                                    arrayList4 = arrayList14;
                                    rwhamsou22 = rwhamsou24;
                                }
                                rwhamSOu2 iiGwOFFnr2 = iiGwOFFnr(GPLPRo6go2, rwhamsou22, obj2, piv3jhzsn);
                                if (rwhamsou22.isEmpty()) {
                                    obj3 = null;
                                } else {
                                    arrayList13.addAll(iiGwOFFnr2.values());
                                    obj3 = obj2;
                                }
                                if (yWvV4ePLl2 == null && oon79WMrY2 == null && obj3 == null) {
                                    rwhamsou2 = rwhamsou22;
                                    arrayList3 = arrayList4;
                                    i4 = i5;
                                } else {
                                    tGV7Q6urW(uxHHqhbTP10, uxHHqhbTP11, z9, iiGwOFFnr2, true);
                                    if (obj3 != null) {
                                        Rect rect4 = new Rect();
                                        GPLPRo6go2.sk5s77z6Q(obj3, view2, arrayList13);
                                        z2 = z9;
                                        uxHHqhbTP2 = uxHHqhbTP11;
                                        uxHHqhbTP = uxHHqhbTP10;
                                        Bhmn1KIah(GPLPRo6go2, obj3, oon79WMrY2, iiGwOFFnr2, piv3jhzsn.kCA6Zs9sL, piv3jhzsn.iiGwOFFnr);
                                        if (yWvV4ePLl2 != null) {
                                            GPLPRo6go2.Eeka1udhb(yWvV4ePLl2, rect4);
                                        }
                                        rect = rect4;
                                    } else {
                                        z2 = z9;
                                        uxHHqhbTP2 = uxHHqhbTP11;
                                        uxHHqhbTP = uxHHqhbTP10;
                                        rect = null;
                                    }
                                    rwhamsou2 = rwhamsou22;
                                    arrayList3 = arrayList4;
                                    i4 = i5;
                                    zgCCamJKk.q3BipwRCk(viewGroup, new vv61aJl28(GPLPRo6go2, rwhamsou22, obj3, piv3jhzsn, arrayList3, view2, uxHHqhbTP, uxHHqhbTP2, z2, arrayList13, yWvV4ePLl2, rect));
                                    uryiqsink2 = uryiqsink;
                                    obj = obj3;
                                    if (!(yWvV4ePLl2 != null && obj == null && oon79WMrY2 == null)) {
                                        Puu3Rhg4F = Puu3Rhg4F(GPLPRo6go2, oon79WMrY2, uxHHqhbTP9, arrayList13, view2);
                                        if (Puu3Rhg4F != null || Puu3Rhg4F.isEmpty()) {
                                            oon79WMrY2 = null;
                                        }
                                        GPLPRo6go2.q3BipwRCk(yWvV4ePLl2, view2);
                                        kmSgne1rO = GPLPRo6go2.kmSgne1rO(oon79WMrY2, yWvV4ePLl2, obj);
                                        if (!(uxHHqhbTP9 == null || Puu3Rhg4F == null || (Puu3Rhg4F.size() <= 0 && arrayList13.size() <= 0))) {
                                            ce8tBZHr1 ce8tbzhr12 = new ce8tBZHr1();
                                            uryiqsink2.dIocxURUo(uxHHqhbTP9, ce8tbzhr12);
                                            GPLPRo6go2.RG6kpfv3v(uxHHqhbTP9, kmSgne1rO, ce8tbzhr12, new ilRFFqvx8(uryiqsink2, uxHHqhbTP9, ce8tbzhr12, 1));
                                        }
                                        if (kmSgne1rO != null) {
                                            ArrayList arrayList15 = new ArrayList();
                                            GPLPRo6go2.qVUwofr5s(kmSgne1rO, yWvV4ePLl2, arrayList15, oon79WMrY2, Puu3Rhg4F, obj, arrayList3);
                                            zgCCamJKk.q3BipwRCk(viewGroup, new FBoi8InCZ(yWvV4ePLl2, GPLPRo6go2, view2, uxHHqhbTP8, arrayList3, arrayList15, Puu3Rhg4F, oon79WMrY2));
                                            zgCCamJKk.q3BipwRCk(viewGroup, new NdeNx9ZYu(GPLPRo6go2, arrayList3, rwhamsou2, 0));
                                            GPLPRo6go2.tGV7Q6urW(viewGroup, kmSgne1rO);
                                            zgCCamJKk.q3BipwRCk(viewGroup, new NdeNx9ZYu(GPLPRo6go2, arrayList3, rwhamsou2, 1));
                                            uryiqsink6 = uryiqsink2;
                                        }
                                    }
                                    uryiqsink6 = uryiqsink2;
                                }
                            }
                            uryiqsink2 = uryiqsink3;
                            obj = null;
                            if (yWvV4ePLl2 != null) {
                            }
                            Puu3Rhg4F = Puu3Rhg4F(GPLPRo6go2, oon79WMrY2, uxHHqhbTP9, arrayList13, view2);
                            if (Puu3Rhg4F != null) {
                            }
                            oon79WMrY2 = null;
                            GPLPRo6go2.q3BipwRCk(yWvV4ePLl2, view2);
                            kmSgne1rO = GPLPRo6go2.kmSgne1rO(oon79WMrY2, yWvV4ePLl2, obj);
                            if (uxHHqhbTP9 == null) {
                                ce8tBZHr1 ce8tbzhr122 = new ce8tBZHr1();
                                uryiqsink2.dIocxURUo(uxHHqhbTP9, ce8tbzhr122);
                                GPLPRo6go2.RG6kpfv3v(uxHHqhbTP9, kmSgne1rO, ce8tbzhr122, new ilRFFqvx8(uryiqsink2, uxHHqhbTP9, ce8tbzhr122, 1));
                            }
                            if (kmSgne1rO != null) {
                            }
                            uryiqsink6 = uryiqsink2;
                        }
                    }
                    i4 = i5;
                }
                i9 = i3 + 1;
                arrayList6 = arrayList;
                arrayList7 = arrayList2;
                i6 = i2;
                z3 = z;
                uryiqsink5 = uryiqsink;
                size3 = i4;
                sparseArray2 = sparseArray;
            }
        }
    }

    public static void PSTqBLTET(ArrayList arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    public static ArrayList Puu3Rhg4F(xobLfQFEO xoblfqfeo, Object obj, UxHHqhbTP uxHHqhbTP, ArrayList arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        View view2 = uxHHqhbTP.EBQXiIPmm;
        if (view2 != null) {
            xoblfqfeo.iiGwOFFnr(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        xoblfqfeo.J4Ux7ym32(obj, arrayList2);
        return arrayList2;
    }

    public static boolean dIocxURUo(xobLfQFEO xoblfqfeo, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!xoblfqfeo.kCA6Zs9sL(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static rwhamSOu2 iiGwOFFnr(xobLfQFEO xoblfqfeo, rwhamSOu2 rwhamsou2, Object obj, pIv3jHZsn piv3jhzsn) {
        ArrayList arrayList;
        if (rwhamsou2.isEmpty() || obj == null) {
            rwhamsou2.clear();
            return null;
        }
        UxHHqhbTP uxHHqhbTP = piv3jhzsn.dIocxURUo;
        rwhamSOu2 rwhamsou22 = new rwhamSOu2();
        xoblfqfeo.yWvV4ePLl(rwhamsou22, uxHHqhbTP.wIZEdYHUn());
        xkmNtxX26 xkmntxx26 = piv3jhzsn.iiGwOFFnr;
        if (piv3jhzsn.kCA6Zs9sL) {
            uxHHqhbTP.vPSbyrYWX();
            arrayList = xkmntxx26.Bhmn1KIah;
        } else {
            uxHHqhbTP.Bhmn1KIah();
            arrayList = xkmntxx26.kmSgne1rO;
        }
        if (arrayList != null) {
            XicO3QTQd.yWvV4ePLl(rwhamsou22, arrayList);
        }
        XicO3QTQd.yWvV4ePLl(rwhamsou2, rwhamsou22.keySet());
        return rwhamsou22;
    }

    public static rwhamSOu2 kCA6Zs9sL(xobLfQFEO xoblfqfeo, rwhamSOu2 rwhamsou2, Object obj, pIv3jHZsn piv3jhzsn) {
        ArrayList arrayList;
        UxHHqhbTP uxHHqhbTP = piv3jhzsn.q3BipwRCk;
        View view = uxHHqhbTP.EBQXiIPmm;
        if (rwhamsou2.isEmpty() || obj == null || view == null) {
            rwhamsou2.clear();
            return null;
        }
        rwhamSOu2 rwhamsou22 = new rwhamSOu2();
        xoblfqfeo.yWvV4ePLl(rwhamsou22, view);
        xkmNtxX26 xkmntxx26 = piv3jhzsn.tGV7Q6urW;
        if (piv3jhzsn.J4Ux7ym32) {
            uxHHqhbTP.Bhmn1KIah();
            arrayList = xkmntxx26.kmSgne1rO;
        } else {
            uxHHqhbTP.vPSbyrYWX();
            arrayList = xkmntxx26.Bhmn1KIah;
        }
        if (arrayList != null) {
            XicO3QTQd.yWvV4ePLl(rwhamsou22, arrayList);
            XicO3QTQd.yWvV4ePLl(rwhamsou22, rwhamsou2.values());
        }
        kmSgne1rO(rwhamsou2, rwhamsou22);
        return rwhamsou22;
    }

    public static void kmSgne1rO(rwhamSOu2 rwhamsou2, rwhamSOu2 rwhamsou22) {
        int i = rwhamsou2.Bhmn1KIah;
        while (true) {
            i--;
            if (i < 0) {
                return;
            }
            if (!rwhamsou22.containsKey((String) rwhamsou2.vPSbyrYWX(i))) {
                rwhamsou2.yWvV4ePLl(i);
            }
        }
    }

    public static Object oon79WMrY(xobLfQFEO xoblfqfeo, UxHHqhbTP uxHHqhbTP, boolean z) {
        Object obj = null;
        if (uxHHqhbTP == null) {
            return null;
        }
        if (z) {
            obj = uxHHqhbTP.ixWaw2akD();
        } else {
            uxHHqhbTP.kmSgne1rO();
        }
        return xoblfqfeo.GPLPRo6go(obj);
    }

    public static void q3BipwRCk(ArrayList arrayList, rwhamSOu2 rwhamsou2, Collection collection) {
        for (int i = rwhamsou2.Bhmn1KIah - 1; i >= 0; i--) {
            View view = (View) rwhamsou2.vPSbyrYWX(i);
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            if (collection.contains(mJLaJepZo.vPSbyrYWX(view))) {
                arrayList.add(view);
            }
        }
    }

    public static void tGV7Q6urW(UxHHqhbTP uxHHqhbTP, UxHHqhbTP uxHHqhbTP2, boolean z, rwhamSOu2 rwhamsou2, boolean z2) {
        if (z) {
            uxHHqhbTP2.vPSbyrYWX();
        } else {
            uxHHqhbTP.vPSbyrYWX();
        }
    }

    public static View vPSbyrYWX(rwhamSOu2 rwhamsou2, pIv3jHZsn piv3jhzsn, Object obj, boolean z) {
        ArrayList arrayList;
        xkmNtxX26 xkmntxx26 = piv3jhzsn.tGV7Q6urW;
        if (obj == null || rwhamsou2 == null || (arrayList = xkmntxx26.kmSgne1rO) == null || arrayList.isEmpty()) {
            return null;
        }
        return (View) rwhamsou2.get((String) (z ? xkmntxx26.kmSgne1rO : xkmntxx26.Bhmn1KIah).get(0));
    }

    public static Object yWvV4ePLl(xobLfQFEO xoblfqfeo, UxHHqhbTP uxHHqhbTP, boolean z) {
        Object obj = null;
        if (uxHHqhbTP == null) {
            return null;
        }
        if (z) {
            obj = uxHHqhbTP.dXrmkklc8();
        } else {
            uxHHqhbTP.oon79WMrY();
        }
        return xoblfqfeo.GPLPRo6go(obj);
    }
}
