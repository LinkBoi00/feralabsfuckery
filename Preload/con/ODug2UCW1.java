package con;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.text.Spanned;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public abstract class ODug2UCW1 {
    public static int AqaWJg0b4(nBnrGO77H nbnrgo77h, KaIKYh6OP kaIKYh6OP, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                arrayList.add(new jSV6xiZIZ((HqmYLYbvB) list.get(i2), GoaU3WtDA.Min, PzGxiAaKK.Width));
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        }
        return nbnrgo77h.J4Ux7ym32(new BCUbIDEJH(kaIKYh6OP, kaIKYh6OP.getLayoutDirection()), arrayList, dnBSj5uJN.J4Ux7ym32(0, 0, 0, i, 7)).q3BipwRCk();
    }

    public static final void Bhmn1KIah(cKAQplqZy ckaqplqzy) {
        if (ckaqplqzy.dIocxURUo != ckaqplqzy.GPLPRo6go) {
            ckaqplqzy.Puu3Rhg4F.J4Ux7ym32 = true;
        }
    }

    public static void CBQ5d1kRq(SI0VpKubr sI0VpKubr, A128gLXzp a128gLXzp, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            oWhsE8IPp owhse8ipp = c8C9YlOpy.q3BipwRCk;
            oWhsE8IPp owhse8ipp2 = c8C9YlOpy.q3BipwRCk;
            i = 1;
        }
        sI0VpKubr.kmSgne1rO(a128gLXzp, i);
    }

    public static int CpG0imbht(nBnrGO77H nbnrgo77h, KaIKYh6OP kaIKYh6OP, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                arrayList.add(new jSV6xiZIZ((HqmYLYbvB) list.get(i2), GoaU3WtDA.Max, PzGxiAaKK.Width));
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        }
        return nbnrgo77h.J4Ux7ym32(new BCUbIDEJH(kaIKYh6OP, kaIKYh6OP.getLayoutDirection()), arrayList, dnBSj5uJN.J4Ux7ym32(0, 0, 0, i, 7)).q3BipwRCk();
    }

    public static final List Eeka1udhb(pLYbCSTk0 plybcstk0, List list) {
        ArrayList arrayList;
        if (!plybcstk0.Eeka1udhb()) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList();
        List Puu3Rhg4F = plybcstk0.Puu3Rhg4F();
        int size = Puu3Rhg4F.size() - 1;
        int i = 0;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                pLYbCSTk0 plybcstk02 = (pLYbCSTk0) Puu3Rhg4F.get(i2);
                if (plybcstk02.Eeka1udhb()) {
                    arrayList2.add(new NOGO0aGs4(plybcstk0, plybcstk02));
                }
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        }
        try {
            NOGO0aGs4.MzoOEjc4X = 1;
            arrayList = new ArrayList(arrayList2);
            if (arrayList.size() > 1) {
                Collections.sort(arrayList);
            }
        } catch (IllegalArgumentException unused) {
            NOGO0aGs4.MzoOEjc4X = 2;
            arrayList = new ArrayList(arrayList2);
            if (arrayList.size() > 1) {
                Collections.sort(arrayList);
            }
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                arrayList3.add(((NOGO0aGs4) arrayList.get(i4)).kmSgne1rO);
                if (i5 > size2) {
                    break;
                }
                i4 = i5;
            }
        }
        int size3 = arrayList3.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i6 = i + 1;
                pLYbCSTk0 plybcstk03 = (pLYbCSTk0) arrayList3.get(i);
                mhjbbkjEL dXrmkklc8 = BBVaGLNaU.dXrmkklc8(plybcstk03);
                if (dXrmkklc8 != null) {
                    list.add(dXrmkklc8);
                } else {
                    Eeka1udhb(plybcstk03, list);
                }
                if (i6 > size3) {
                    break;
                }
                i = i6;
            }
        }
        return list;
    }

    public static void GPLPRo6go(A128gLXzp a128gLXzp, A128gLXzp a128gLXzp2, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
            j = bRgfgYIQX.tGV7Q6urW;
        }
        Path path = ((Q3Qxqu4re) a128gLXzp).q3BipwRCk;
        if (a128gLXzp2 instanceof Q3Qxqu4re) {
            path.addPath(((Q3Qxqu4re) a128gLXzp2).q3BipwRCk, bRgfgYIQX.tGV7Q6urW(j), bRgfgYIQX.dIocxURUo(j));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public static int IytU16YUK(nBnrGO77H nbnrgo77h, KaIKYh6OP kaIKYh6OP, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                arrayList.add(new jSV6xiZIZ((HqmYLYbvB) list.get(i2), GoaU3WtDA.Max, PzGxiAaKK.Height));
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        }
        return nbnrgo77h.J4Ux7ym32(new BCUbIDEJH(kaIKYh6OP, kaIKYh6OP.getLayoutDirection()), arrayList, dnBSj5uJN.J4Ux7ym32(0, i, 0, 0, 13)).J4Ux7ym32();
    }

    public static /* synthetic */ long J4Ux7ym32(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = f;
        }
        return q3BipwRCk(f, f2);
    }

    public static final KB2jjcOAK MzoOEjc4X(KB2jjcOAK kB2jjcOAK) {
        int ordinal = kB2jjcOAK.D91ZKn9BG().ordinal();
        if (ordinal == 0) {
            return kB2jjcOAK;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return kB2jjcOAK;
            }
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        throw new dnCerKhAM();
                    }
                }
            }
            return null;
        }
        KB2jjcOAK pwwzaxl9D = kB2jjcOAK.pwwzaxl9D();
        if (pwwzaxl9D != null) {
            return MzoOEjc4X(pwwzaxl9D);
        }
        return null;
    }

    public static final long NyWTwPF6V(cKAQplqZy ckaqplqzy) {
        return vNtjxmzUM(ckaqplqzy, false);
    }

    public static final void PSTqBLTET(cKAQplqZy ckaqplqzy) {
        long NyWTwPF6V = NyWTwPF6V(ckaqplqzy);
        JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
        if (!bRgfgYIQX.q3BipwRCk(NyWTwPF6V, bRgfgYIQX.tGV7Q6urW)) {
            ckaqplqzy.Puu3Rhg4F.q3BipwRCk = true;
        }
    }

    public static final boolean Puu3Rhg4F(cKAQplqZy ckaqplqzy) {
        return !ckaqplqzy.Puu3Rhg4F.J4Ux7ym32 && !ckaqplqzy.GPLPRo6go && ckaqplqzy.dIocxURUo;
    }

    public static final Object RG6kpfv3v(hKxHUWEcH hkxhuwech) {
        Object Bhmn1KIah = hkxhuwech.Bhmn1KIah();
        FBt0Qj7Qb fBt0Qj7Qb = Bhmn1KIah instanceof FBt0Qj7Qb ? (FBt0Qj7Qb) Bhmn1KIah : null;
        if (fBt0Qj7Qb == null) {
            return null;
        }
        return fBt0Qj7Qb.q3BipwRCk();
    }

    public static void V9LQMKGJe(String str, char[] cArr, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = str.length();
        }
        for (int i5 = i2; i5 < i3; i5++) {
            cArr[(i + i5) - i2] = str.charAt(i5);
        }
    }

    public static final boolean WaUP0CF08(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final BgIsSUB3d cAwN510t2(BgIsSUB3d bgIsSUB3d, Object obj) {
        boolean z = Rjnc3TWC6.q3BipwRCk;
        return new znGkSWjb4(obj, f7B6YCXHx.kmSgne1rO);
    }

    public static final long dIocxURUo(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32);
        JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
        return floatToIntBits2;
    }

    public static final qhaZGYFO8 dXrmkklc8(pLYbCSTk0 plybcstk0) {
        mhjbbkjEL Eeka1udhb = BBVaGLNaU.Eeka1udhb(plybcstk0);
        if (Eeka1udhb != null) {
            return Eeka1udhb;
        }
        mhjbbkjEL dXrmkklc8 = BBVaGLNaU.dXrmkklc8(plybcstk0);
        return dXrmkklc8 == null ? plybcstk0.o4LF8RkoQ : dXrmkklc8;
    }

    public static final boolean dfpT1j18n(cKAQplqZy ckaqplqzy, long j, long j2) {
        if (!S1s03piHw.q3BipwRCk(ckaqplqzy.yWvV4ePLl, 1)) {
            return i8XZMQc6Z(ckaqplqzy, j);
        }
        long j3 = ckaqplqzy.tGV7Q6urW;
        float tGV7Q6urW = bRgfgYIQX.tGV7Q6urW(j3);
        float dIocxURUo = bRgfgYIQX.dIocxURUo(j3);
        float kCA6Zs9sL = tbzY8QG6X.kCA6Zs9sL(j2) + ((float) YWiUMZOtw.tGV7Q6urW(j));
        float f = -tbzY8QG6X.tGV7Q6urW(j2);
        float tGV7Q6urW2 = tbzY8QG6X.tGV7Q6urW(j2) + ((float) YWiUMZOtw.J4Ux7ym32(j));
        if (tGV7Q6urW < (-tbzY8QG6X.kCA6Zs9sL(j2)) || tGV7Q6urW > kCA6Zs9sL || dIocxURUo < f || dIocxURUo > tGV7Q6urW2) {
            return true;
        }
        return false;
    }

    public static final void i0Zug1mVk(float[] fArr, Matrix matrix) {
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        fArr[0] = f;
        fArr[1] = f4;
        fArr[2] = 0.0f;
        fArr[3] = f7;
        fArr[4] = f2;
        fArr[5] = f5;
        fArr[6] = 0.0f;
        fArr[7] = f8;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f3;
        fArr[13] = f6;
        fArr[14] = 0.0f;
        fArr[15] = f9;
    }

    public static final boolean i8XZMQc6Z(cKAQplqZy ckaqplqzy, long j) {
        long j2 = ckaqplqzy.tGV7Q6urW;
        float tGV7Q6urW = bRgfgYIQX.tGV7Q6urW(j2);
        float dIocxURUo = bRgfgYIQX.dIocxURUo(j2);
        return tGV7Q6urW < 0.0f || tGV7Q6urW > ((float) YWiUMZOtw.tGV7Q6urW(j)) || dIocxURUo < 0.0f || dIocxURUo > ((float) YWiUMZOtw.J4Ux7ym32(j));
    }

    public static final boolean iMyQMM6Qj(wOXdxhlrk woxdxhlrk) {
        if (yDwaznigW.J4Ux7ym32(woxdxhlrk.kCA6Zs9sL) == yDwaznigW.tGV7Q6urW(woxdxhlrk.kCA6Zs9sL)) {
            if (yDwaznigW.J4Ux7ym32(woxdxhlrk.kCA6Zs9sL) == yDwaznigW.J4Ux7ym32(woxdxhlrk.iiGwOFFnr)) {
                if (yDwaznigW.J4Ux7ym32(woxdxhlrk.kCA6Zs9sL) == yDwaznigW.tGV7Q6urW(woxdxhlrk.iiGwOFFnr)) {
                    if (yDwaznigW.J4Ux7ym32(woxdxhlrk.kCA6Zs9sL) == yDwaznigW.J4Ux7ym32(woxdxhlrk.GPLPRo6go)) {
                        if (yDwaznigW.J4Ux7ym32(woxdxhlrk.kCA6Zs9sL) == yDwaznigW.tGV7Q6urW(woxdxhlrk.GPLPRo6go)) {
                            if (yDwaznigW.J4Ux7ym32(woxdxhlrk.kCA6Zs9sL) == yDwaznigW.J4Ux7ym32(woxdxhlrk.Puu3Rhg4F)) {
                                if (yDwaznigW.J4Ux7ym32(woxdxhlrk.kCA6Zs9sL) == yDwaznigW.tGV7Q6urW(woxdxhlrk.Puu3Rhg4F)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long iiGwOFFnr(int i, int i2) {
        boolean z = true;
        if (i >= 0) {
            if (i2 < 0) {
                z = false;
            }
            if (z) {
                long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
                JhpbRXxsg jhpbRXxsg = czCYotiRn.J4Ux7ym32;
                return j;
            }
            throw new IllegalArgumentException(("end cannot negative. [end: " + i2 + ']').toString());
        }
        throw new IllegalArgumentException(("start cannot be negative. [start: " + i + ']').toString());
    }

    public static final KB2jjcOAK ilHKhw3Yw(KB2jjcOAK kB2jjcOAK) {
        KB2jjcOAK OpLJtmvFM = kB2jjcOAK.OpLJtmvFM();
        if (OpLJtmvFM == null) {
            return null;
        }
        int ordinal = kB2jjcOAK.D91ZKn9BG().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return kB2jjcOAK;
            }
            if (!(ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5)) {
                throw new dnCerKhAM();
            }
        }
        return ilHKhw3Yw(OpLJtmvFM);
    }

    public static final BgIsSUB3d ixWaw2akD(BgIsSUB3d bgIsSUB3d, PmanMZxiM pmanMZxiM) {
        boolean z = Rjnc3TWC6.q3BipwRCk;
        return bgIsSUB3d.WaUP0CF08(new ihwWLIzx8(pmanMZxiM, f7B6YCXHx.kmSgne1rO));
    }

    public static final wOXdxhlrk kCA6Zs9sL(float f, float f2, float f3, float f4, long j) {
        long q3BipwRCk = q3BipwRCk(yDwaznigW.J4Ux7ym32(j), yDwaznigW.tGV7Q6urW(j));
        return new wOXdxhlrk(f, f2, f3, f4, q3BipwRCk, q3BipwRCk, q3BipwRCk, q3BipwRCk, null);
    }

    public static final long kmSgne1rO(long j, int i, int i2) {
        int kCA6Zs9sL = cT9gik1zL.kCA6Zs9sL(czCYotiRn.yWvV4ePLl(j), i, i2);
        int kCA6Zs9sL2 = cT9gik1zL.kCA6Zs9sL(czCYotiRn.dIocxURUo(j), i, i2);
        return (kCA6Zs9sL == czCYotiRn.yWvV4ePLl(j) && kCA6Zs9sL2 == czCYotiRn.dIocxURUo(j)) ? j : iiGwOFFnr(kCA6Zs9sL, kCA6Zs9sL2);
    }

    public static final BgIsSUB3d mUqPm6GBh(BgIsSUB3d bgIsSUB3d, PmanMZxiM pmanMZxiM) {
        boolean z = Rjnc3TWC6.q3BipwRCk;
        return bgIsSUB3d.WaUP0CF08(new fZbtdGidt(pmanMZxiM, f7B6YCXHx.kmSgne1rO));
    }

    public static int nlGCs0NZs(nBnrGO77H nbnrgo77h, KaIKYh6OP kaIKYh6OP, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                arrayList.add(new jSV6xiZIZ((HqmYLYbvB) list.get(i2), GoaU3WtDA.Min, PzGxiAaKK.Height));
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        }
        return nbnrgo77h.J4Ux7ym32(new BCUbIDEJH(kaIKYh6OP, kaIKYh6OP.getLayoutDirection()), arrayList, dnBSj5uJN.J4Ux7ym32(0, i, 0, 0, 13)).J4Ux7ym32();
    }

    public static final String o4LF8RkoQ(int i, rJ0s9PfCL rj0s9pfcl) {
        Object obj = G7WvUK4mQ.q3BipwRCk;
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.oon79WMrY(KApR71V3i.q3BipwRCk);
        return ((Context) wpxpbwg1j.oon79WMrY(KApR71V3i.J4Ux7ym32)).getResources().getString(i);
    }

    public static final boolean oon79WMrY(cKAQplqZy ckaqplqzy) {
        return !ckaqplqzy.Puu3Rhg4F.J4Ux7ym32 && ckaqplqzy.GPLPRo6go && !ckaqplqzy.dIocxURUo;
    }

    public static final long q3BipwRCk(float f, float f2) {
        long floatToIntBits = (long) Float.floatToIntBits(f);
        long floatToIntBits2 = (((long) Float.floatToIntBits(f2)) & 4294967295L) | (floatToIntBits << 32);
        JhpbRXxsg jhpbRXxsg = yDwaznigW.q3BipwRCk;
        return floatToIntBits2;
    }

    public static /* synthetic */ void qFBXIgpia(jRWr6Yc4S jrwr6yc4s, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        ((AndroidComposeView) jrwr6yc4s).vPSbyrYWX(z);
    }

    public static final pLYbCSTk0 qVUwofr5s(pLYbCSTk0 plybcstk0, PmanMZxiM pmanMZxiM) {
        if (((Boolean) pmanMZxiM.IytU16YUK(plybcstk0)).booleanValue()) {
            return plybcstk0;
        }
        List Puu3Rhg4F = plybcstk0.Puu3Rhg4F();
        int i = 0;
        int size = Puu3Rhg4F.size() - 1;
        if (size < 0) {
            return null;
        }
        while (true) {
            int i2 = i + 1;
            pLYbCSTk0 qVUwofr5s = qVUwofr5s((pLYbCSTk0) Puu3Rhg4F.get(i), pmanMZxiM);
            if (qVUwofr5s != null) {
                return qVUwofr5s;
            }
            if (i2 > size) {
                return null;
            }
            i = i2;
        }
    }

    public static BgIsSUB3d sk5s77z6Q(BgIsSUB3d bgIsSUB3d, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, JZuV4yGnu jZuV4yGnu, boolean z, int i) {
        long j2;
        float f11 = (i & 1) != 0 ? 1.0f : f;
        float f12 = (i & 2) != 0 ? 1.0f : f2;
        float f13 = (i & 4) != 0 ? 1.0f : f3;
        float f14 = (i & 8) != 0 ? 0.0f : f4;
        float f15 = (i & 16) != 0 ? 0.0f : f5;
        float f16 = (i & 32) != 0 ? 0.0f : f6;
        float f17 = (i & 64) != 0 ? 0.0f : f7;
        float f18 = (i & 128) != 0 ? 0.0f : f8;
        float f19 = (i & 256) != 0 ? 0.0f : f9;
        float f20 = (i & 512) != 0 ? 8.0f : f10;
        if ((i & 1024) != 0) {
            ksLrMHgEz kslrmhgez = WyfbJwwBZ.J4Ux7ym32;
            j2 = WyfbJwwBZ.tGV7Q6urW;
        } else {
            j2 = j;
        }
        JZuV4yGnu jZuV4yGnu2 = (i & 2048) != 0 ? Nb0J8E3sF.q3BipwRCk : jZuV4yGnu;
        boolean z2 = (i & 4096) != 0 ? false : z;
        boolean z3 = Rjnc3TWC6.q3BipwRCk;
        return bgIsSUB3d.WaUP0CF08(new gqCoYRWVZ(f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, j2, jZuV4yGnu2, z2, null, f7B6YCXHx.kmSgne1rO, null));
    }

    public static final long tGV7Q6urW(int i) {
        long j = (((long) i) << 32) | (((long) 0) & 4294967295L);
        uEb6wTQlg ueb6wtqlg = nghVD4tWN.q3BipwRCk;
        return j;
    }

    public static final long vNtjxmzUM(cKAQplqZy ckaqplqzy, boolean z) {
        long kCA6Zs9sL = bRgfgYIQX.kCA6Zs9sL(ckaqplqzy.tGV7Q6urW, ckaqplqzy.iiGwOFFnr);
        if (z || !ckaqplqzy.Puu3Rhg4F.q3BipwRCk) {
            return kCA6Zs9sL;
        }
        JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
        return bRgfgYIQX.tGV7Q6urW;
    }

    public static final boolean vPSbyrYWX(cKAQplqZy ckaqplqzy) {
        return ckaqplqzy.GPLPRo6go && !ckaqplqzy.dIocxURUo;
    }

    public static final boolean yWvV4ePLl(cKAQplqZy ckaqplqzy) {
        return !ckaqplqzy.GPLPRo6go && ckaqplqzy.dIocxURUo;
    }
}
