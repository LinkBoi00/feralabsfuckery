package con;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public abstract class p62TZmTyO {
    public static final void AqaWJg0b4(KB2jjcOAK kB2jjcOAK, boolean z) {
        int ordinal = kB2jjcOAK.D91ZKn9BG().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                KB2jjcOAK pwwzaxl9D = kB2jjcOAK.pwwzaxl9D();
                if (pwwzaxl9D == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else if (z) {
                    kB2jjcOAK.DEe4ujgEA(kB2jjcOAK.D91ZKn9BG());
                    return;
                } else if (Eeka1udhb(pwwzaxl9D, false, 1)) {
                    IytU16YUK(kB2jjcOAK, z);
                    kB2jjcOAK.zH62iiANw(null);
                    return;
                } else {
                    return;
                }
            } else if (!(ordinal == 2 || ordinal == 3 || ordinal == 4)) {
                if (ordinal == 5) {
                    KB2jjcOAK OpLJtmvFM = kB2jjcOAK.OpLJtmvFM();
                    if (OpLJtmvFM != null) {
                        mUqPm6GBh(OpLJtmvFM, kB2jjcOAK, z);
                        return;
                    } else if (NyWTwPF6V(kB2jjcOAK)) {
                        IytU16YUK(kB2jjcOAK, z);
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        kB2jjcOAK.DEe4ujgEA(kB2jjcOAK.D91ZKn9BG());
    }

    public static final void Bhmn1KIah(KB2jjcOAK kB2jjcOAK) {
        ftmnXRQmW ftmnxrqmw;
        int ordinal = kB2jjcOAK.D91ZKn9BG().ordinal();
        if (ordinal == 3) {
            ftmnxrqmw = ftmnXRQmW.Inactive;
        } else if (ordinal == 4) {
            ftmnxrqmw = ftmnXRQmW.ActiveParent;
        } else {
            return;
        }
        ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).CBQ5d1kRq = ftmnxrqmw;
        kB2jjcOAK.DEe4ujgEA(ftmnxrqmw);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (con.anXlDk6fV.tGV7Q6urW(con.xP6F5SR9v.Bhmn1KIah(r0, con.VSVuhz7Ow.CBQ5d1kRq), java.lang.Boolean.TRUE) == false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final boolean CBQ5d1kRq(or5nbo9ku or5nbo9ku) {
        boolean z;
        ogG45sslV eylCJcWC7;
        ogG45sslV ogg45sslv = or5nbo9ku.kCA6Zs9sL;
        JCsIEQgIX jCsIEQgIX = JCsIEQgIX.q3BipwRCk;
        if (ogg45sslv.J4Ux7ym32(JCsIEQgIX.yWvV4ePLl)) {
            ogG45sslV ogg45sslv2 = or5nbo9ku.kCA6Zs9sL;
            VSVuhz7Ow vSVuhz7Ow = VSVuhz7Ow.q3BipwRCk;
        }
        pLYbCSTk0 WaUP0CF08 = WaUP0CF08(or5nbo9ku.GPLPRo6go, DlhjQ2PrY.AqaWJg0b4);
        if (WaUP0CF08 == null) {
            return false;
        }
        mhjbbkjEL dXrmkklc8 = BBVaGLNaU.dXrmkklc8(WaUP0CF08);
        if (dXrmkklc8 == null || (eylCJcWC7 = dXrmkklc8.eylCJcWC7()) == null) {
            z = false;
        } else {
            VSVuhz7Ow vSVuhz7Ow2 = VSVuhz7Ow.q3BipwRCk;
            z = anXlDk6fV.tGV7Q6urW(xP6F5SR9v.Bhmn1KIah(eylCJcWC7, VSVuhz7Ow.CBQ5d1kRq), Boolean.TRUE);
        }
        return !z;
    }

    public static final boolean CpG0imbht(TB2AsrPRd tB2AsrPRd, boolean z) {
        mnTaxtMa7 mntaxtma7;
        UwmKmkwV0 uwmKmkwV0 = tB2AsrPRd.dIocxURUo;
        if (uwmKmkwV0 == null || (mntaxtma7 = uwmKmkwV0.kCA6Zs9sL) == null) {
            return false;
        }
        mnTaxtMa7 iMyQMM6Qj = iMyQMM6Qj(mntaxtma7);
        bzmJZsHMu ilHKhw3Yw = ilHKhw3Yw(mntaxtma7);
        qhaZGYFO8 qhazgyfo8 = (qhaZGYFO8) iMyQMM6Qj;
        long uSBmk4hFZ = qhazgyfo8.uSBmk4hFZ(ODug2UCW1.dIocxURUo(ilHKhw3Yw.q3BipwRCk, ilHKhw3Yw.J4Ux7ym32));
        long uSBmk4hFZ2 = qhazgyfo8.uSBmk4hFZ(ODug2UCW1.dIocxURUo(ilHKhw3Yw.tGV7Q6urW, ilHKhw3Yw.J4Ux7ym32));
        long uSBmk4hFZ3 = qhazgyfo8.uSBmk4hFZ(ODug2UCW1.dIocxURUo(ilHKhw3Yw.tGV7Q6urW, ilHKhw3Yw.dIocxURUo));
        long uSBmk4hFZ4 = qhazgyfo8.uSBmk4hFZ(ODug2UCW1.dIocxURUo(ilHKhw3Yw.q3BipwRCk, ilHKhw3Yw.dIocxURUo));
        float tGV7Q6urW = bRgfgYIQX.tGV7Q6urW(uSBmk4hFZ);
        float[] fArr = {bRgfgYIQX.tGV7Q6urW(uSBmk4hFZ2), bRgfgYIQX.tGV7Q6urW(uSBmk4hFZ4), bRgfgYIQX.tGV7Q6urW(uSBmk4hFZ3)};
        for (int i = 0; i < 3; i++) {
            tGV7Q6urW = Math.min(tGV7Q6urW, fArr[i]);
        }
        float dIocxURUo = bRgfgYIQX.dIocxURUo(uSBmk4hFZ);
        float[] fArr2 = {bRgfgYIQX.dIocxURUo(uSBmk4hFZ2), bRgfgYIQX.dIocxURUo(uSBmk4hFZ4), bRgfgYIQX.dIocxURUo(uSBmk4hFZ3)};
        for (int i2 = 0; i2 < 3; i2++) {
            dIocxURUo = Math.min(dIocxURUo, fArr2[i2]);
        }
        float tGV7Q6urW2 = bRgfgYIQX.tGV7Q6urW(uSBmk4hFZ);
        float[] fArr3 = {bRgfgYIQX.tGV7Q6urW(uSBmk4hFZ2), bRgfgYIQX.tGV7Q6urW(uSBmk4hFZ4), bRgfgYIQX.tGV7Q6urW(uSBmk4hFZ3)};
        int i3 = 0;
        for (int i4 = 3; i3 < i4; i4 = 3) {
            tGV7Q6urW2 = Math.max(tGV7Q6urW2, fArr3[i3]);
            i3++;
        }
        float dIocxURUo2 = bRgfgYIQX.dIocxURUo(uSBmk4hFZ);
        float[] fArr4 = {bRgfgYIQX.dIocxURUo(uSBmk4hFZ2), bRgfgYIQX.dIocxURUo(uSBmk4hFZ4), bRgfgYIQX.dIocxURUo(uSBmk4hFZ3)};
        for (int i5 = 0; i5 < 3; i5++) {
            dIocxURUo2 = Math.max(dIocxURUo2, fArr4[i5]);
        }
        qhaZGYFO8 qhazgyfo82 = (qhaZGYFO8) mntaxtma7;
        long tTcQQNK5P = qhazgyfo82.tTcQQNK5P(new bzmJZsHMu(tGV7Q6urW, dIocxURUo, tGV7Q6urW2, dIocxURUo2).dIocxURUo());
        long tTcQQNK5P2 = qhazgyfo82.tTcQQNK5P(ODug2UCW1.dIocxURUo(tGV7Q6urW2, dIocxURUo2));
        float tGV7Q6urW3 = bRgfgYIQX.tGV7Q6urW(tTcQQNK5P);
        float dIocxURUo3 = bRgfgYIQX.dIocxURUo(tTcQQNK5P);
        float tGV7Q6urW4 = bRgfgYIQX.tGV7Q6urW(tTcQQNK5P2);
        float dIocxURUo4 = bRgfgYIQX.dIocxURUo(tTcQQNK5P2);
        long Puu3Rhg4F = tB2AsrPRd.Puu3Rhg4F(z);
        float tGV7Q6urW5 = bRgfgYIQX.tGV7Q6urW(Puu3Rhg4F);
        if (tGV7Q6urW3 <= tGV7Q6urW5 && tGV7Q6urW5 <= tGV7Q6urW4) {
            float dIocxURUo5 = bRgfgYIQX.dIocxURUo(Puu3Rhg4F);
            if (dIocxURUo3 <= dIocxURUo5 && dIocxURUo5 <= dIocxURUo4) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean Eeka1udhb(KB2jjcOAK kB2jjcOAK, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        return qVUwofr5s(kB2jjcOAK, z);
    }

    public static final void GPLPRo6go(BgIsSUB3d bgIsSUB3d, JZuV4yGnu jZuV4yGnu, long j, long j2, float f, BgIsSUB3d bgIsSUB3d2, kkcQgCx5G kkcqgcx5g, rJ0s9PfCL rj0s9pfcl, int i) {
        int i2;
        long j3;
        long j4;
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(-750961828);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        if ((i & 14) == 0) {
            i2 = (wpxpbwg1j.iiGwOFFnr(bgIsSUB3d) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= wpxpbwg1j.iiGwOFFnr(jZuV4yGnu) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= wpxpbwg1j.kCA6Zs9sL(j) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= wpxpbwg1j.kCA6Zs9sL(j2) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= wpxpbwg1j.iiGwOFFnr(null) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= wpxpbwg1j.tGV7Q6urW(f) ? 131072 : 65536;
        }
        if ((3670016 & i) == 0) {
            i2 |= wpxpbwg1j.iiGwOFFnr(bgIsSUB3d2) ? 1048576 : 524288;
        }
        if ((29360128 & i) == 0) {
            i2 |= wpxpbwg1j.iiGwOFFnr(kkcqgcx5g) ? 8388608 : 4194304;
        }
        if (((i2 & 23967451) ^ 4793490) != 0 || !wpxpbwg1j.i8XZMQc6Z()) {
            ead9RRQSb ead9rrqsb = (ead9RRQSb) wpxpbwg1j.oon79WMrY(yQA1x14I8.q3BipwRCk);
            hOY2Rgtej hoy2rgtej = yQA1x14I8.J4Ux7ym32;
            float f2 = ((lRwPpHNL9) wpxpbwg1j.oon79WMrY(hoy2rgtej)).CBQ5d1kRq + f;
            wpxpbwg1j.zHl31GGXU(-750961449);
            hOY2Rgtej hoy2rgtej2 = aaizp84lL.q3BipwRCk;
            if (!bO2dbmrf7.tGV7Q6urW(j, ((q56y96RYz) wpxpbwg1j.oon79WMrY(hoy2rgtej2)).yWvV4ePLl()) || ead9rrqsb == null) {
                j3 = j;
            } else {
                q56y96RYz q56y96ryz = (q56y96RYz) wpxpbwg1j.oon79WMrY(hoy2rgtej2);
                if (Float.compare(f2, (float) 0) <= 0 || q56y96ryz.oon79WMrY()) {
                    j4 = j;
                } else {
                    hOY2Rgtej hoy2rgtej3 = yQA1x14I8.q3BipwRCk;
                    j4 = xpuSUT7Gh.AqaWJg0b4(bO2dbmrf7.J4Ux7ym32(aaizp84lL.q3BipwRCk(j, wpxpbwg1j), ((((float) Math.log((double) (((float) 1) + f2))) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14), j);
                }
                j3 = j4;
            }
            wpxpbwg1j.ilHKhw3Yw(false);
            u51fgFYkV.q3BipwRCk(new BaB9IKBYw[]{pJroOTB7B.q3BipwRCk.J4Ux7ym32(new bO2dbmrf7(j2)), hoy2rgtej.J4Ux7ym32(new lRwPpHNL9(f2))}, xpuSUT7Gh.qFBXIgpia(wpxpbwg1j, -819902018, true, new IdeqGXvyg(bgIsSUB3d, f, jZuV4yGnu, j3, bgIsSUB3d2, kkcqgcx5g, i2, 0)), wpxpbwg1j, 56);
        } else {
            wpxpbwg1j.igRQEZxnW();
        }
        rESgwfV20 Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb != null) {
            Eeka1udhb.dIocxURUo = new WNsZsRD1I(bgIsSUB3d, jZuV4yGnu, j, j2, f, bgIsSUB3d2, kkcqgcx5g, i);
        }
    }

    public static final void IytU16YUK(KB2jjcOAK kB2jjcOAK, boolean z) {
        ftmnXRQmW ftmnxrqmw;
        ftmnXRQmW ftmnxrqmw2;
        KB2jjcOAK kB2jjcOAK2 = (KB2jjcOAK) wkFJfVmcv.QNqj6nIzv(kB2jjcOAK.KBYw84i3W(false));
        if (kB2jjcOAK2 == null || !z) {
            int ordinal = kB2jjcOAK.D91ZKn9BG().ordinal();
            if (!(ordinal == 0 || ordinal == 1)) {
                if (ordinal == 2) {
                    ftmnxrqmw = ftmnXRQmW.Captured;
                    ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).CBQ5d1kRq = ftmnxrqmw;
                    kB2jjcOAK.DEe4ujgEA(ftmnxrqmw);
                    return;
                } else if (ordinal == 3 || ordinal == 4) {
                    throw new IllegalStateException("Granting focus to a deactivated node.".toString());
                } else if (ordinal != 5) {
                    throw new dnCerKhAM();
                }
            }
            ftmnxrqmw = ftmnXRQmW.Active;
            ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).CBQ5d1kRq = ftmnxrqmw;
            kB2jjcOAK.DEe4ujgEA(ftmnxrqmw);
            return;
        }
        int ordinal2 = kB2jjcOAK.D91ZKn9BG().ordinal();
        if (!(ordinal2 == 0 || ordinal2 == 1)) {
            if (ordinal2 == 2) {
                return;
            }
            if (ordinal2 == 3 || ordinal2 == 4) {
                ftmnxrqmw2 = ftmnXRQmW.DeactivatedParent;
                ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).CBQ5d1kRq = ftmnxrqmw2;
                kB2jjcOAK.DEe4ujgEA(ftmnxrqmw2);
                ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).kmSgne1rO = kB2jjcOAK2;
                IytU16YUK(kB2jjcOAK2, z);
            } else if (ordinal2 != 5) {
                throw new dnCerKhAM();
            }
        }
        ftmnxrqmw2 = ftmnXRQmW.ActiveParent;
        ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).CBQ5d1kRq = ftmnxrqmw2;
        kB2jjcOAK.DEe4ujgEA(ftmnxrqmw2);
        ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).kmSgne1rO = kB2jjcOAK2;
        IytU16YUK(kB2jjcOAK2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void J4Ux7ym32(D3PUCzPxK d3PUCzPxK, boolean z, BgIsSUB3d bgIsSUB3d, EVoQ2RqaN eVoQ2RqaN, JzLhkMe5F jzLhkMe5F, String str, NzvP5Rex8 nzvP5Rex8, rJ0s9PfCL rj0s9pfcl, int i, int i2) {
        int i3;
        BgIsSUB3d bgIsSUB3d2;
        int i4;
        EVoQ2RqaN eVoQ2RqaN2;
        int i5;
        JzLhkMe5F jzLhkMe5F2;
        int i6;
        String str2;
        String str3;
        JzLhkMe5F jzLhkMe5F3;
        BgIsSUB3d bgIsSUB3d3;
        rESgwfV20 Eeka1udhb;
        BgIsSUB3d bgIsSUB3d4;
        JzLhkMe5F jzLhkMe5F4;
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(1844974544);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        if ((i2 & 1) != 0) {
            i3 = i | 48;
        } else if ((i & 112) == 0) {
            i3 = (wpxpbwg1j.GPLPRo6go(z) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            bgIsSUB3d2 = bgIsSUB3d;
            i3 |= wpxpbwg1j.iiGwOFFnr(bgIsSUB3d2) ? 256 : 128;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                eVoQ2RqaN2 = eVoQ2RqaN;
                i3 |= wpxpbwg1j.iiGwOFFnr(eVoQ2RqaN2) ? 2048 : 1024;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 57344) == 0) {
                    jzLhkMe5F2 = jzLhkMe5F;
                    i3 |= wpxpbwg1j.iiGwOFFnr(jzLhkMe5F2) ? 16384 : 8192;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 196608;
                    } else if ((i & 458752) == 0) {
                        str2 = str;
                        i3 |= wpxpbwg1j.iiGwOFFnr(str2) ? 131072 : 65536;
                        if ((i2 & 32) != 0) {
                            i3 |= 1572864;
                        } else if ((3670016 & i) == 0) {
                            i3 |= wpxpbwg1j.iiGwOFFnr(nzvP5Rex8) ? 1048576 : 524288;
                            if (((2995921 & i3) ^ 599184) == 0 || !wpxpbwg1j.i8XZMQc6Z()) {
                                if (i7 == 0) {
                                    int i8 = BgIsSUB3d.Puu3Rhg4F;
                                    bgIsSUB3d4 = H11ySchUh.CBQ5d1kRq;
                                } else {
                                    bgIsSUB3d4 = bgIsSUB3d2;
                                }
                                EVoQ2RqaN q3BipwRCk = i4 == 0 ? KSdwgSYB6.dIocxURUo(null, 0.0f, 3).q3BipwRCk(KSdwgSYB6.q3BipwRCk(null, null, false, null, 15)) : eVoQ2RqaN2;
                                if (i5 == 0) {
                                    JzLhkMe5F kCA6Zs9sL = KSdwgSYB6.kCA6Zs9sL(null, 0.0f, 3);
                                    O0hQm6WVz iiGwOFFnr = cqKak5Wfn.iiGwOFFnr(0.0f, 400.0f, new YWiUMZOtw(D3DEikrvb.dIocxURUo(1, 1)), 1);
                                    int i9 = B01AuRyT3.q3BipwRCk;
                                    jzLhkMe5F4 = kCA6Zs9sL.q3BipwRCk(KSdwgSYB6.Puu3Rhg4F(iiGwOFFnr, KSdwgSYB6.oon79WMrY(wkHKTCu1d.vPSbyrYWX), true, new a9QAfq4Fp(AdUPdUuqH.PSTqBLTET, 1)));
                                } else {
                                    jzLhkMe5F4 = jzLhkMe5F2;
                                }
                                if (i6 != 0) {
                                    str2 = "AnimatedVisibility";
                                }
                                int i10 = i3 >> 3;
                                q3BipwRCk(syekKyXqd.PSTqBLTET(Boolean.valueOf(z), str2, wpxpbwg1j, (i10 & 14) | ((i3 >> 12) & 112), 0), Bf3OaWXmk.kmSgne1rO, bgIsSUB3d4, q3BipwRCk, jzLhkMe5F4, nzvP5Rex8, wpxpbwg1j, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i10 & 458752));
                                jzLhkMe5F3 = jzLhkMe5F4;
                                str3 = str2;
                                bgIsSUB3d3 = bgIsSUB3d4;
                                eVoQ2RqaN2 = q3BipwRCk;
                            } else {
                                wpxpbwg1j.igRQEZxnW();
                                bgIsSUB3d3 = bgIsSUB3d2;
                                jzLhkMe5F3 = jzLhkMe5F2;
                                str3 = str2;
                            }
                            Eeka1udhb = wpxpbwg1j.Eeka1udhb();
                            if (Eeka1udhb == null) {
                                Eeka1udhb.dIocxURUo = new LBTj74JDl(d3PUCzPxK, z, bgIsSUB3d3, eVoQ2RqaN2, jzLhkMe5F3, str3, nzvP5Rex8, i, i2);
                                return;
                            }
                            return;
                        }
                        if (((2995921 & i3) ^ 599184) == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        int i102 = i3 >> 3;
                        q3BipwRCk(syekKyXqd.PSTqBLTET(Boolean.valueOf(z), str2, wpxpbwg1j, (i102 & 14) | ((i3 >> 12) & 112), 0), Bf3OaWXmk.kmSgne1rO, bgIsSUB3d4, q3BipwRCk, jzLhkMe5F4, nzvP5Rex8, wpxpbwg1j, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i102 & 458752));
                        jzLhkMe5F3 = jzLhkMe5F4;
                        str3 = str2;
                        bgIsSUB3d3 = bgIsSUB3d4;
                        eVoQ2RqaN2 = q3BipwRCk;
                        Eeka1udhb = wpxpbwg1j.Eeka1udhb();
                        if (Eeka1udhb == null) {
                        }
                    }
                    str2 = str;
                    if ((i2 & 32) != 0) {
                    }
                    if (((2995921 & i3) ^ 599184) == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    int i1022 = i3 >> 3;
                    q3BipwRCk(syekKyXqd.PSTqBLTET(Boolean.valueOf(z), str2, wpxpbwg1j, (i1022 & 14) | ((i3 >> 12) & 112), 0), Bf3OaWXmk.kmSgne1rO, bgIsSUB3d4, q3BipwRCk, jzLhkMe5F4, nzvP5Rex8, wpxpbwg1j, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1022 & 458752));
                    jzLhkMe5F3 = jzLhkMe5F4;
                    str3 = str2;
                    bgIsSUB3d3 = bgIsSUB3d4;
                    eVoQ2RqaN2 = q3BipwRCk;
                    Eeka1udhb = wpxpbwg1j.Eeka1udhb();
                    if (Eeka1udhb == null) {
                    }
                }
                jzLhkMe5F2 = jzLhkMe5F;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((i2 & 32) != 0) {
                }
                if (((2995921 & i3) ^ 599184) == 0) {
                }
                if (i7 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 != 0) {
                }
                int i10222 = i3 >> 3;
                q3BipwRCk(syekKyXqd.PSTqBLTET(Boolean.valueOf(z), str2, wpxpbwg1j, (i10222 & 14) | ((i3 >> 12) & 112), 0), Bf3OaWXmk.kmSgne1rO, bgIsSUB3d4, q3BipwRCk, jzLhkMe5F4, nzvP5Rex8, wpxpbwg1j, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i10222 & 458752));
                jzLhkMe5F3 = jzLhkMe5F4;
                str3 = str2;
                bgIsSUB3d3 = bgIsSUB3d4;
                eVoQ2RqaN2 = q3BipwRCk;
                Eeka1udhb = wpxpbwg1j.Eeka1udhb();
                if (Eeka1udhb == null) {
                }
            }
            eVoQ2RqaN2 = eVoQ2RqaN;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            jzLhkMe5F2 = jzLhkMe5F;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str2 = str;
            if ((i2 & 32) != 0) {
            }
            if (((2995921 & i3) ^ 599184) == 0) {
            }
            if (i7 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            int i102222 = i3 >> 3;
            q3BipwRCk(syekKyXqd.PSTqBLTET(Boolean.valueOf(z), str2, wpxpbwg1j, (i102222 & 14) | ((i3 >> 12) & 112), 0), Bf3OaWXmk.kmSgne1rO, bgIsSUB3d4, q3BipwRCk, jzLhkMe5F4, nzvP5Rex8, wpxpbwg1j, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i102222 & 458752));
            jzLhkMe5F3 = jzLhkMe5F4;
            str3 = str2;
            bgIsSUB3d3 = bgIsSUB3d4;
            eVoQ2RqaN2 = q3BipwRCk;
            Eeka1udhb = wpxpbwg1j.Eeka1udhb();
            if (Eeka1udhb == null) {
            }
        }
        bgIsSUB3d2 = bgIsSUB3d;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        eVoQ2RqaN2 = eVoQ2RqaN;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        jzLhkMe5F2 = jzLhkMe5F;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        if ((i2 & 32) != 0) {
        }
        if (((2995921 & i3) ^ 599184) == 0) {
        }
        if (i7 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 != 0) {
        }
        int i1022222 = i3 >> 3;
        q3BipwRCk(syekKyXqd.PSTqBLTET(Boolean.valueOf(z), str2, wpxpbwg1j, (i1022222 & 14) | ((i3 >> 12) & 112), 0), Bf3OaWXmk.kmSgne1rO, bgIsSUB3d4, q3BipwRCk, jzLhkMe5F4, nzvP5Rex8, wpxpbwg1j, (i3 & 57344) | (i3 & 896) | 48 | (i3 & 7168) | (i1022222 & 458752));
        jzLhkMe5F3 = jzLhkMe5F4;
        str3 = str2;
        bgIsSUB3d3 = bgIsSUB3d4;
        eVoQ2RqaN2 = q3BipwRCk;
        Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb == null) {
        }
    }

    public static final bzmJZsHMu MzoOEjc4X(mnTaxtMa7 mntaxtma7) {
        qhaZGYFO8 qhazgyfo8 = (qhaZGYFO8) mntaxtma7;
        mnTaxtMa7 M66hQ219i = qhazgyfo8.M66hQ219i();
        return M66hQ219i == null ? new bzmJZsHMu(0.0f, 0.0f, (float) YWiUMZOtw.tGV7Q6urW(qhazgyfo8.Bhmn1KIah), (float) YWiUMZOtw.J4Ux7ym32(qhazgyfo8.Bhmn1KIah)) : gThLCaTO1.ilHKhw3Yw(M66hQ219i, mntaxtma7, false, 2, null);
    }

    public static final boolean NyWTwPF6V(KB2jjcOAK kB2jjcOAK) {
        jRWr6Yc4S jrwr6yc4s = kB2jjcOAK.MzoOEjc4X.qVUwofr5s;
        if (jrwr6yc4s != null) {
            return jrwr6yc4s.requestFocus();
        }
        throw new IllegalArgumentException("Owner not initialized.".toString());
    }

    public static final Bitmap PSTqBLTET(Y3ibtOJiE y3ibtOJiE) {
        if (y3ibtOJiE instanceof tNgdvtcFW) {
            return ((tNgdvtcFW) y3ibtOJiE).J4Ux7ym32;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0027, code lost:
        if (r1 == con.P7Re99G8L.J4Ux7ym32) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void Puu3Rhg4F(boolean z, sL9xhCFIS sl9xhcfis, TB2AsrPRd tB2AsrPRd, rJ0s9PfCL rj0s9pfcl, int i) {
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(-1630620397);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        Boolean valueOf = Boolean.valueOf(z);
        wpxpbwg1j.zHl31GGXU(-3686552);
        boolean iiGwOFFnr = wpxpbwg1j.iiGwOFFnr(valueOf) | wpxpbwg1j.iiGwOFFnr(tB2AsrPRd);
        Object dfpT1j18n = wpxpbwg1j.dfpT1j18n();
        if (!iiGwOFFnr) {
            int i2 = rJ0s9PfCL.q3BipwRCk;
        }
        dfpT1j18n = new frX9jolH3(tB2AsrPRd, z);
        wpxpbwg1j.INnK5Rew6(dfpT1j18n);
        wpxpbwg1j.ilHKhw3Yw(false);
        NUBOYYpO5 nUBOYYpO5 = (NUBOYYpO5) dfpT1j18n;
        long Puu3Rhg4F = tB2AsrPRd.Puu3Rhg4F(z);
        boolean Puu3Rhg4F2 = czCYotiRn.Puu3Rhg4F(tB2AsrPRd.kCA6Zs9sL.J4Ux7ym32);
        int i3 = BgIsSUB3d.Puu3Rhg4F;
        BgIsSUB3d q3BipwRCk = VpcjuZfOq.q3BipwRCk(H11ySchUh.CBQ5d1kRq, nUBOYYpO5, new WFb41TQqn(nUBOYYpO5, null));
        int i4 = i << 3;
        pz7YPhQTU.iiGwOFFnr(Puu3Rhg4F, z, sl9xhcfis, Puu3Rhg4F2, q3BipwRCk, null, wpxpbwg1j, 196608 | (i4 & 112) | (i4 & 896));
        rESgwfV20 Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb != null) {
            Eeka1udhb.dIocxURUo = new gRy6syfBG(z, sl9xhcfis, tB2AsrPRd, i);
        }
    }

    public static final BgIsSUB3d RG6kpfv3v(BgIsSUB3d bgIsSUB3d, kkcQgCx5G kkcqgcx5g, PmanMZxiM pmanMZxiM, njjwS3RZT njjws3rzt, boolean z, RqP4RtdHY rqP4RtdHY, gdEmqfwpT gdemqfwpt, NzvP5Rex8 nzvP5Rex8, NzvP5Rex8 nzvP5Rex82, boolean z2) {
        boolean z3 = Rjnc3TWC6.q3BipwRCk;
        return gThLCaTO1.vPSbyrYWX(bgIsSUB3d, f7B6YCXHx.kmSgne1rO, new oPtznyhSA(kkcqgcx5g, rqP4RtdHY, gdemqfwpt, pmanMZxiM, nzvP5Rex8, nzvP5Rex82, njjws3rzt, z, z2));
    }

    public static final Bitmap.Config V9LQMKGJe(int i) {
        oWhsE8IPp owhse8ipp = QrGf69nPE.q3BipwRCk;
        oWhsE8IPp owhse8ipp2 = QrGf69nPE.q3BipwRCk;
        if (!QrGf69nPE.q3BipwRCk(i, 0)) {
            if (QrGf69nPE.q3BipwRCk(i, 1)) {
                return Bitmap.Config.ALPHA_8;
            }
            if (QrGf69nPE.q3BipwRCk(i, 2)) {
                return Bitmap.Config.RGB_565;
            }
            if (QrGf69nPE.q3BipwRCk(i, 3)) {
                return Bitmap.Config.RGBA_F16;
            }
            if (QrGf69nPE.q3BipwRCk(i, 4)) {
                return Bitmap.Config.HARDWARE;
            }
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static final pLYbCSTk0 WaUP0CF08(pLYbCSTk0 plybcstk0, PmanMZxiM pmanMZxiM) {
        do {
            plybcstk0 = plybcstk0.oon79WMrY();
            if (plybcstk0 == null) {
                return null;
            }
        } while (!((Boolean) pmanMZxiM.IytU16YUK(plybcstk0)).booleanValue());
        return plybcstk0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /* JADX WARN: Type inference failed for: r0v13, types: [con.qhaZGYFO8] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void cAwN510t2(Region region, or5nbo9ku or5nbo9ku, Map map, or5nbo9ku or5nbo9ku2) {
        bzmJZsHMu bzmjzshmu;
        Region region2;
        int i;
        pLYbCSTk0 plybcstk0;
        if (region.isEmpty() && or5nbo9ku2.iiGwOFFnr != or5nbo9ku.iiGwOFFnr) {
            return;
        }
        if (or5nbo9ku2.GPLPRo6go.nlGCs0NZs || or5nbo9ku2.tGV7Q6urW) {
            mhjbbkjEL tGV7Q6urW = or5nbo9ku2.tGV7Q6urW();
            boolean z = false;
            if (tGV7Q6urW.oesmsHQJU()) {
                ogG45sslV ogg45sslv = ((CBcUvsHpG) ((GobDDNrsi) tGV7Q6urW.NyWTwPF6V)).kmSgne1rO;
                JCsIEQgIX jCsIEQgIX = JCsIEQgIX.q3BipwRCk;
                if (!(xP6F5SR9v.Bhmn1KIah(ogg45sslv, JCsIEQgIX.tGV7Q6urW) != null)) {
                    bzmjzshmu = ilHKhw3Yw(tGV7Q6urW);
                } else {
                    mnTaxtMa7 iMyQMM6Qj = iMyQMM6Qj(tGV7Q6urW);
                    iPoCEXeoL ipocexeol = tGV7Q6urW.IytU16YUK;
                    if (ipocexeol == null) {
                        ipocexeol = new iPoCEXeoL(0.0f, 0.0f, 0.0f, 0.0f);
                        tGV7Q6urW.IytU16YUK = ipocexeol;
                    }
                    long LFW0KvNFt = tGV7Q6urW.LFW0KvNFt(tGV7Q6urW.Dr7UqlxEV());
                    ipocexeol.q3BipwRCk = -tbzY8QG6X.kCA6Zs9sL(LFW0KvNFt);
                    ipocexeol.J4Ux7ym32 = -tbzY8QG6X.tGV7Q6urW(LFW0KvNFt);
                    ipocexeol.tGV7Q6urW = tbzY8QG6X.kCA6Zs9sL(LFW0KvNFt) + ((float) tGV7Q6urW.i0Zug1mVk());
                    ipocexeol.dIocxURUo = tbzY8QG6X.tGV7Q6urW(LFW0KvNFt) + ((float) tGV7Q6urW.vNtjxmzUM());
                    for (mhjbbkjEL mhjbbkjel = tGV7Q6urW; mhjbbkjel != iMyQMM6Qj; mhjbbkjel = mhjbbkjel.ilHKhw3Yw) {
                        mhjbbkjel.koMoKnP1S(ipocexeol, false, true);
                        if (!ipocexeol.J4Ux7ym32()) {
                        }
                    }
                    bzmjzshmu = new bzmJZsHMu(ipocexeol.q3BipwRCk, ipocexeol.J4Ux7ym32, ipocexeol.tGV7Q6urW, ipocexeol.dIocxURUo);
                }
                Rect o4LF8RkoQ = o4LF8RkoQ(bzmjzshmu);
                region2 = new Region();
                region2.set(o4LF8RkoQ);
                i = or5nbo9ku2.iiGwOFFnr;
                if (i == or5nbo9ku.iiGwOFFnr) {
                    i = -1;
                }
                if (!region2.op(region, region2, Region.Op.INTERSECT)) {
                    map.put(Integer.valueOf(i), new BIRL6IXtO(or5nbo9ku2, region2.getBounds()));
                    List yWvV4ePLl = or5nbo9ku2.yWvV4ePLl();
                    int size = yWvV4ePLl.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i2 = size - 1;
                            cAwN510t2(region, or5nbo9ku, map, (or5nbo9ku) yWvV4ePLl.get(size));
                            if (i2 < 0) {
                                break;
                            }
                            size = i2;
                        }
                    }
                    region.op(o4LF8RkoQ, region, Region.Op.REVERSE_DIFFERENCE);
                    return;
                } else if (or5nbo9ku2.tGV7Q6urW) {
                    or5nbo9ku GPLPRo6go = or5nbo9ku2.GPLPRo6go();
                    if (!(GPLPRo6go == null || (plybcstk0 = GPLPRo6go.GPLPRo6go) == null || !plybcstk0.nlGCs0NZs)) {
                        z = true;
                    }
                    map.put(Integer.valueOf(i), new BIRL6IXtO(or5nbo9ku2, o4LF8RkoQ(z ? GPLPRo6go.dIocxURUo() : new bzmJZsHMu(0.0f, 0.0f, 10.0f, 10.0f))));
                    return;
                } else if (i == -1) {
                    map.put(Integer.valueOf(i), new BIRL6IXtO(or5nbo9ku2, region2.getBounds()));
                    return;
                } else {
                    return;
                }
            }
            ksLrMHgEz kslrmhgez = bzmJZsHMu.kCA6Zs9sL;
            ksLrMHgEz kslrmhgez2 = bzmJZsHMu.kCA6Zs9sL;
            bzmjzshmu = bzmJZsHMu.iiGwOFFnr;
            Rect o4LF8RkoQ2 = o4LF8RkoQ(bzmjzshmu);
            region2 = new Region();
            region2.set(o4LF8RkoQ2);
            i = or5nbo9ku2.iiGwOFFnr;
            if (i == or5nbo9ku.iiGwOFFnr) {
            }
            if (!region2.op(region, region2, Region.Op.INTERSECT)) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0143, code lost:
        if (r13 == con.P7Re99G8L.J4Ux7ym32) goto L_0x0145;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void dIocxURUo(gdEmqfwpT gdemqfwpt, BgIsSUB3d bgIsSUB3d, bb216AtXv bb216atxv, mKU9R6cnm mku9r6cnm, E1sOlrROE e1sOlrROE, rJ0s9PfCL rj0s9pfcl, int i, int i2) {
        int i3;
        BgIsSUB3d bgIsSUB3d2;
        bb216AtXv bb216atxv2;
        int i4;
        mKU9R6cnm mku9r6cnm2;
        mKU9R6cnm mku9r6cnm3;
        bb216AtXv bb216atxv3;
        BgIsSUB3d bgIsSUB3d3;
        rESgwfV20 Eeka1udhb;
        mKU9R6cnm mku9r6cnm4;
        int i5;
        bb216AtXv bb216atxv4;
        boolean iiGwOFFnr;
        Object dfpT1j18n;
        wpXpbWG1J wpxpbwg1j;
        int i6;
        wpXpbWG1J wpxpbwg1j2 = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j2.ziwPzaoF3(617315508);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (wpxpbwg1j2.iiGwOFFnr(gdemqfwpt) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            bgIsSUB3d2 = bgIsSUB3d;
            i3 |= wpxpbwg1j2.iiGwOFFnr(bgIsSUB3d2) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    bb216atxv2 = bb216atxv;
                    if (wpxpbwg1j2.iiGwOFFnr(bb216atxv2)) {
                        i6 = 256;
                        i3 |= i6;
                    }
                } else {
                    bb216atxv2 = bb216atxv;
                }
                i6 = 128;
                i3 |= i6;
            } else {
                bb216atxv2 = bb216atxv;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                mku9r6cnm2 = mku9r6cnm;
                i3 |= wpxpbwg1j2.iiGwOFFnr(mku9r6cnm2) ? 2048 : 1024;
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((57344 & i) == 0) {
                    i3 |= wpxpbwg1j2.iiGwOFFnr(e1sOlrROE) ? 16384 : 8192;
                }
                if (((46811 & i3) ^ 9362) == 0) {
                    wpXpbWG1J wpxpbwg1j3 = wpxpbwg1j2;
                    if (wpxpbwg1j3.i8XZMQc6Z()) {
                        wpxpbwg1j3.igRQEZxnW();
                        bgIsSUB3d3 = bgIsSUB3d2;
                        bb216atxv3 = bb216atxv2;
                        mku9r6cnm3 = mku9r6cnm2;
                        Eeka1udhb = wpxpbwg1j2.Eeka1udhb();
                        if (Eeka1udhb != null) {
                            Eeka1udhb.dIocxURUo = new yKPseTOBp(gdemqfwpt, bgIsSUB3d3, bb216atxv3, mku9r6cnm3, e1sOlrROE, i, i2);
                            return;
                        }
                        return;
                    }
                }
                wpXpbWG1J wpxpbwg1j4 = wpxpbwg1j2;
                wpxpbwg1j4.TyB1UUd72();
                if ((i & 1) != 0 || wpxpbwg1j4.WaUP0CF08()) {
                    if (i7 != 0) {
                        int i8 = BgIsSUB3d.Puu3Rhg4F;
                        bgIsSUB3d2 = H11ySchUh.CBQ5d1kRq;
                    }
                    if ((i2 & 4) != 0) {
                        bb216atxv2 = pz7YPhQTU.sk5s77z6Q(wpxpbwg1j2);
                        i3 &= -897;
                    }
                    if (i4 != 0) {
                        mku9r6cnm4 = null;
                        i5 = i3;
                        bgIsSUB3d3 = bgIsSUB3d2;
                        bb216atxv4 = bb216atxv2;
                        wpxpbwg1j4.qVUwofr5s();
                        bb216atxv4.dIocxURUo = gdemqfwpt;
                        wpxpbwg1j4.zHl31GGXU(-2067463802);
                        wpxpbwg1j4.zHl31GGXU(-579869653);
                        dFPeeJFLA dfpeejfla = (dFPeeJFLA) uI1r9gOOH.q3BipwRCk(new Object[0], dFPeeJFLA.dIocxURUo.GPLPRo6go(), null, A3JdLjV3P.kmSgne1rO, wpxpbwg1j4, 4);
                        dfpeejfla.tGV7Q6urW = (dVtF46MWK) wpxpbwg1j4.oon79WMrY(cAJLJrM2D.q3BipwRCk);
                        wpxpbwg1j4.ilHKhw3Yw(false);
                        gdEmqfwpT gdemqfwpt2 = bb216atxv4.dIocxURUo;
                        wpxpbwg1j4.zHl31GGXU(-3686930);
                        iiGwOFFnr = wpxpbwg1j4.iiGwOFFnr(gdemqfwpt2);
                        Object dfpT1j18n2 = wpxpbwg1j4.dfpT1j18n();
                        if (!iiGwOFFnr) {
                            int i9 = rJ0s9PfCL.q3BipwRCk;
                        }
                        dfpT1j18n2 = new ZiaC7TNf1(dfpeejfla, gdemqfwpt2);
                        wpxpbwg1j4.INnK5Rew6(dfpT1j18n2);
                        wpxpbwg1j4.ilHKhw3Yw(false);
                        ZiaC7TNf1 ziaC7TNf1 = (ZiaC7TNf1) dfpT1j18n2;
                        wpxpbwg1j4.ilHKhw3Yw(false);
                        wpxpbwg1j4.zHl31GGXU(-3687241);
                        dfpT1j18n = wpxpbwg1j4.dfpT1j18n();
                        int i10 = rJ0s9PfCL.q3BipwRCk;
                        if (dfpT1j18n == P7Re99G8L.J4Ux7ym32) {
                            dfpT1j18n = new pW31wYUjR(2);
                            wpxpbwg1j4.INnK5Rew6(dfpT1j18n);
                        }
                        wpxpbwg1j4.ilHKhw3Yw(false);
                        pW31wYUjR pw31wyujr = (pW31wYUjR) dfpT1j18n;
                        wpxpbwg1j4.zHl31GGXU(617315976);
                        if (mku9r6cnm4 != null) {
                            wpxpbwg1j = wpxpbwg1j4;
                        } else {
                            wpxpbwg1j = wpxpbwg1j4;
                            WAflFGuGp.tGV7Q6urW(mku9r6cnm4, bb216atxv4, ziaC7TNf1, pw31wyujr, wpxpbwg1j2, ((i5 >> 3) & 112) | ((i5 >> 9) & 14) | 512 | 4096);
                        }
                        wpxpbwg1j.ilHKhw3Yw(false);
                        gThLCaTO1.dIocxURUo(pw31wyujr, bgIsSUB3d3.WaUP0CF08(bb216atxv4.tGV7Q6urW), new aoIh72bBV(ziaC7TNf1, bb216atxv4, e1sOlrROE), wpxpbwg1j2, 8, 0);
                        bb216atxv3 = bb216atxv4;
                        mku9r6cnm3 = mku9r6cnm4;
                        Eeka1udhb = wpxpbwg1j2.Eeka1udhb();
                        if (Eeka1udhb != null) {
                        }
                    }
                } else {
                    wpxpbwg1j4.igRQEZxnW();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                }
                i5 = i3;
                bgIsSUB3d3 = bgIsSUB3d2;
                bb216atxv4 = bb216atxv2;
                mku9r6cnm4 = mku9r6cnm2;
                wpxpbwg1j4.qVUwofr5s();
                bb216atxv4.dIocxURUo = gdemqfwpt;
                wpxpbwg1j4.zHl31GGXU(-2067463802);
                wpxpbwg1j4.zHl31GGXU(-579869653);
                dFPeeJFLA dfpeejfla2 = (dFPeeJFLA) uI1r9gOOH.q3BipwRCk(new Object[0], dFPeeJFLA.dIocxURUo.GPLPRo6go(), null, A3JdLjV3P.kmSgne1rO, wpxpbwg1j4, 4);
                dfpeejfla2.tGV7Q6urW = (dVtF46MWK) wpxpbwg1j4.oon79WMrY(cAJLJrM2D.q3BipwRCk);
                wpxpbwg1j4.ilHKhw3Yw(false);
                gdEmqfwpT gdemqfwpt22 = bb216atxv4.dIocxURUo;
                wpxpbwg1j4.zHl31GGXU(-3686930);
                iiGwOFFnr = wpxpbwg1j4.iiGwOFFnr(gdemqfwpt22);
                Object dfpT1j18n22 = wpxpbwg1j4.dfpT1j18n();
                if (!iiGwOFFnr) {
                }
                dfpT1j18n22 = new ZiaC7TNf1(dfpeejfla2, gdemqfwpt22);
                wpxpbwg1j4.INnK5Rew6(dfpT1j18n22);
                wpxpbwg1j4.ilHKhw3Yw(false);
                ZiaC7TNf1 ziaC7TNf12 = (ZiaC7TNf1) dfpT1j18n22;
                wpxpbwg1j4.ilHKhw3Yw(false);
                wpxpbwg1j4.zHl31GGXU(-3687241);
                dfpT1j18n = wpxpbwg1j4.dfpT1j18n();
                int i102 = rJ0s9PfCL.q3BipwRCk;
                if (dfpT1j18n == P7Re99G8L.J4Ux7ym32) {
                }
                wpxpbwg1j4.ilHKhw3Yw(false);
                pW31wYUjR pw31wyujr2 = (pW31wYUjR) dfpT1j18n;
                wpxpbwg1j4.zHl31GGXU(617315976);
                if (mku9r6cnm4 != null) {
                }
                wpxpbwg1j.ilHKhw3Yw(false);
                gThLCaTO1.dIocxURUo(pw31wyujr2, bgIsSUB3d3.WaUP0CF08(bb216atxv4.tGV7Q6urW), new aoIh72bBV(ziaC7TNf12, bb216atxv4, e1sOlrROE), wpxpbwg1j2, 8, 0);
                bb216atxv3 = bb216atxv4;
                mku9r6cnm3 = mku9r6cnm4;
                Eeka1udhb = wpxpbwg1j2.Eeka1udhb();
                if (Eeka1udhb != null) {
                }
            }
            mku9r6cnm2 = mku9r6cnm;
            if ((i2 & 16) != 0) {
            }
            if (((46811 & i3) ^ 9362) == 0) {
            }
            wpXpbWG1J wpxpbwg1j42 = wpxpbwg1j2;
            wpxpbwg1j42.TyB1UUd72();
            if ((i & 1) != 0) {
            }
            if (i7 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if (i4 != 0) {
            }
            i5 = i3;
            bgIsSUB3d3 = bgIsSUB3d2;
            bb216atxv4 = bb216atxv2;
            mku9r6cnm4 = mku9r6cnm2;
            wpxpbwg1j42.qVUwofr5s();
            bb216atxv4.dIocxURUo = gdemqfwpt;
            wpxpbwg1j42.zHl31GGXU(-2067463802);
            wpxpbwg1j42.zHl31GGXU(-579869653);
            dFPeeJFLA dfpeejfla22 = (dFPeeJFLA) uI1r9gOOH.q3BipwRCk(new Object[0], dFPeeJFLA.dIocxURUo.GPLPRo6go(), null, A3JdLjV3P.kmSgne1rO, wpxpbwg1j42, 4);
            dfpeejfla22.tGV7Q6urW = (dVtF46MWK) wpxpbwg1j42.oon79WMrY(cAJLJrM2D.q3BipwRCk);
            wpxpbwg1j42.ilHKhw3Yw(false);
            gdEmqfwpT gdemqfwpt222 = bb216atxv4.dIocxURUo;
            wpxpbwg1j42.zHl31GGXU(-3686930);
            iiGwOFFnr = wpxpbwg1j42.iiGwOFFnr(gdemqfwpt222);
            Object dfpT1j18n222 = wpxpbwg1j42.dfpT1j18n();
            if (!iiGwOFFnr) {
            }
            dfpT1j18n222 = new ZiaC7TNf1(dfpeejfla22, gdemqfwpt222);
            wpxpbwg1j42.INnK5Rew6(dfpT1j18n222);
            wpxpbwg1j42.ilHKhw3Yw(false);
            ZiaC7TNf1 ziaC7TNf122 = (ZiaC7TNf1) dfpT1j18n222;
            wpxpbwg1j42.ilHKhw3Yw(false);
            wpxpbwg1j42.zHl31GGXU(-3687241);
            dfpT1j18n = wpxpbwg1j42.dfpT1j18n();
            int i1022 = rJ0s9PfCL.q3BipwRCk;
            if (dfpT1j18n == P7Re99G8L.J4Ux7ym32) {
            }
            wpxpbwg1j42.ilHKhw3Yw(false);
            pW31wYUjR pw31wyujr22 = (pW31wYUjR) dfpT1j18n;
            wpxpbwg1j42.zHl31GGXU(617315976);
            if (mku9r6cnm4 != null) {
            }
            wpxpbwg1j.ilHKhw3Yw(false);
            gThLCaTO1.dIocxURUo(pw31wyujr22, bgIsSUB3d3.WaUP0CF08(bb216atxv4.tGV7Q6urW), new aoIh72bBV(ziaC7TNf122, bb216atxv4, e1sOlrROE), wpxpbwg1j2, 8, 0);
            bb216atxv3 = bb216atxv4;
            mku9r6cnm3 = mku9r6cnm4;
            Eeka1udhb = wpxpbwg1j2.Eeka1udhb();
            if (Eeka1udhb != null) {
            }
        }
        bgIsSUB3d2 = bgIsSUB3d;
        if ((i & 896) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        mku9r6cnm2 = mku9r6cnm;
        if ((i2 & 16) != 0) {
        }
        if (((46811 & i3) ^ 9362) == 0) {
        }
        wpXpbWG1J wpxpbwg1j422 = wpxpbwg1j2;
        wpxpbwg1j422.TyB1UUd72();
        if ((i & 1) != 0) {
        }
        if (i7 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if (i4 != 0) {
        }
        i5 = i3;
        bgIsSUB3d3 = bgIsSUB3d2;
        bb216atxv4 = bb216atxv2;
        mku9r6cnm4 = mku9r6cnm2;
        wpxpbwg1j422.qVUwofr5s();
        bb216atxv4.dIocxURUo = gdemqfwpt;
        wpxpbwg1j422.zHl31GGXU(-2067463802);
        wpxpbwg1j422.zHl31GGXU(-579869653);
        dFPeeJFLA dfpeejfla222 = (dFPeeJFLA) uI1r9gOOH.q3BipwRCk(new Object[0], dFPeeJFLA.dIocxURUo.GPLPRo6go(), null, A3JdLjV3P.kmSgne1rO, wpxpbwg1j422, 4);
        dfpeejfla222.tGV7Q6urW = (dVtF46MWK) wpxpbwg1j422.oon79WMrY(cAJLJrM2D.q3BipwRCk);
        wpxpbwg1j422.ilHKhw3Yw(false);
        gdEmqfwpT gdemqfwpt2222 = bb216atxv4.dIocxURUo;
        wpxpbwg1j422.zHl31GGXU(-3686930);
        iiGwOFFnr = wpxpbwg1j422.iiGwOFFnr(gdemqfwpt2222);
        Object dfpT1j18n2222 = wpxpbwg1j422.dfpT1j18n();
        if (!iiGwOFFnr) {
        }
        dfpT1j18n2222 = new ZiaC7TNf1(dfpeejfla222, gdemqfwpt2222);
        wpxpbwg1j422.INnK5Rew6(dfpT1j18n2222);
        wpxpbwg1j422.ilHKhw3Yw(false);
        ZiaC7TNf1 ziaC7TNf1222 = (ZiaC7TNf1) dfpT1j18n2222;
        wpxpbwg1j422.ilHKhw3Yw(false);
        wpxpbwg1j422.zHl31GGXU(-3687241);
        dfpT1j18n = wpxpbwg1j422.dfpT1j18n();
        int i10222 = rJ0s9PfCL.q3BipwRCk;
        if (dfpT1j18n == P7Re99G8L.J4Ux7ym32) {
        }
        wpxpbwg1j422.ilHKhw3Yw(false);
        pW31wYUjR pw31wyujr222 = (pW31wYUjR) dfpT1j18n;
        wpxpbwg1j422.zHl31GGXU(617315976);
        if (mku9r6cnm4 != null) {
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        gThLCaTO1.dIocxURUo(pw31wyujr222, bgIsSUB3d3.WaUP0CF08(bb216atxv4.tGV7Q6urW), new aoIh72bBV(ziaC7TNf1222, bb216atxv4, e1sOlrROE), wpxpbwg1j2, 8, 0);
        bb216atxv3 = bb216atxv4;
        mku9r6cnm3 = mku9r6cnm4;
        Eeka1udhb = wpxpbwg1j2.Eeka1udhb();
        if (Eeka1udhb != null) {
        }
    }

    public static final void dXrmkklc8(KB2jjcOAK kB2jjcOAK) {
        VQ5lQYeWH focusManager;
        ftmnXRQmW ftmnxrqmw = ftmnXRQmW.Deactivated;
        int ordinal = kB2jjcOAK.D91ZKn9BG().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ftmnxrqmw = ftmnXRQmW.DeactivatedParent;
            } else if (ordinal != 2) {
                if (ordinal != 5) {
                    return;
                }
            }
            ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).CBQ5d1kRq = ftmnxrqmw;
            kB2jjcOAK.DEe4ujgEA(ftmnxrqmw);
        }
        jRWr6Yc4S jrwr6yc4s = kB2jjcOAK.MzoOEjc4X.qVUwofr5s;
        if (!(jrwr6yc4s == null || (focusManager = jrwr6yc4s.getFocusManager()) == null)) {
            ((EBke9S31I) focusManager).q3BipwRCk(true);
        }
        ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).CBQ5d1kRq = ftmnxrqmw;
        kB2jjcOAK.DEe4ujgEA(ftmnxrqmw);
    }

    public static final int dfpT1j18n(CharSequence charSequence, int i) {
        int i2 = i - 1;
        if (1 > i2) {
            return 0;
        }
        while (true) {
            int i3 = i2 - 1;
            if (charSequence.charAt(i2 - 1) == '\n') {
                return i2;
            }
            if (1 > i3) {
                return 0;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
        if (((java.lang.Boolean) ((con.prCJwNx2x) r3).getValue()).booleanValue() != false) goto L_0x0091;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
        if (((java.lang.Boolean) r8.IytU16YUK(r7.J4Ux7ym32())).booleanValue() != false) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final AwUV2q7WY i0Zug1mVk(kdbvrtBH1 kdbvrtbh1, PmanMZxiM pmanMZxiM, Object obj, rJ0s9PfCL rj0s9pfcl) {
        AwUV2q7WY awUV2q7WY = AwUV2q7WY.PostExit;
        AwUV2q7WY awUV2q7WY2 = AwUV2q7WY.PreEnter;
        AwUV2q7WY awUV2q7WY3 = AwUV2q7WY.Visible;
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.zHl31GGXU(-721837653);
        Object obj2 = G7WvUK4mQ.q3BipwRCk;
        wpxpbwg1j.j22ftfeNI(-721837546, kdbvrtbh1);
        if (kdbvrtbh1.GPLPRo6go()) {
            if (!((Boolean) pmanMZxiM.IytU16YUK(obj)).booleanValue()) {
            }
            awUV2q7WY = awUV2q7WY3;
        } else {
            wpxpbwg1j.zHl31GGXU(-3687241);
            Object dfpT1j18n = wpxpbwg1j.dfpT1j18n();
            int i = rJ0s9PfCL.q3BipwRCk;
            if (dfpT1j18n == P7Re99G8L.J4Ux7ym32) {
                dfpT1j18n = u51fgFYkV.dIocxURUo(Boolean.FALSE, null, 2, null);
                wpxpbwg1j.INnK5Rew6(dfpT1j18n);
            }
            wpxpbwg1j.ilHKhw3Yw(false);
            RNEcgN6dQ rNEcgN6dQ = (RNEcgN6dQ) dfpT1j18n;
            if (((Boolean) pmanMZxiM.IytU16YUK(kdbvrtbh1.J4Ux7ym32())).booleanValue()) {
                ((prCJwNx2x) rNEcgN6dQ).CBQ5d1kRq(Boolean.TRUE);
            }
            if (!((Boolean) pmanMZxiM.IytU16YUK(obj)).booleanValue()) {
            }
            awUV2q7WY = awUV2q7WY3;
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        wpxpbwg1j.ilHKhw3Yw(false);
        return awUV2q7WY;
    }

    public static final int i8XZMQc6Z(CharSequence charSequence, int i) {
        int i2 = i + 1;
        int length = charSequence.length();
        if (i2 < length) {
            while (true) {
                int i3 = i2 + 1;
                if (charSequence.charAt(i2) == '\n') {
                    return i2;
                }
                if (i3 >= length) {
                    break;
                }
                i2 = i3;
            }
        }
        return charSequence.length();
    }

    public static final mnTaxtMa7 iMyQMM6Qj(mnTaxtMa7 mntaxtma7) {
        qhaZGYFO8 qhazgyfo8;
        while (true) {
            qhazgyfo8 = (qhaZGYFO8) mntaxtma7;
            mnTaxtMa7 M66hQ219i = qhazgyfo8.M66hQ219i();
            if (M66hQ219i == null) {
                break;
            }
            mntaxtma7 = M66hQ219i;
        }
        if (!(mntaxtma7 instanceof qhaZGYFO8)) {
            qhazgyfo8 = null;
        }
        if (qhazgyfo8 == null) {
            return mntaxtma7;
        }
        while (true) {
            qhaZGYFO8 qhazgyfo82 = qhazgyfo8.ilHKhw3Yw;
            if (qhazgyfo82 == null) {
                return qhazgyfo8;
            }
            qhazgyfo8 = qhazgyfo82;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void iiGwOFFnr(BgIsSUB3d bgIsSUB3d, JZuV4yGnu jZuV4yGnu, long j, long j2, float f, kkcQgCx5G kkcqgcx5g, rJ0s9PfCL rj0s9pfcl, int i, int i2) {
        int i3;
        BgIsSUB3d bgIsSUB3d2;
        JZuV4yGnu jZuV4yGnu2;
        long j3;
        long j4;
        int i4;
        float f2;
        float f3;
        long j5;
        long j6;
        JZuV4yGnu jZuV4yGnu3;
        BgIsSUB3d bgIsSUB3d3;
        rESgwfV20 Eeka1udhb;
        int i5;
        float f4;
        long j7;
        int i6;
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(-750968235);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            bgIsSUB3d2 = bgIsSUB3d;
        } else if ((i & 14) == 0) {
            bgIsSUB3d2 = bgIsSUB3d;
            i3 = (wpxpbwg1j.iiGwOFFnr(bgIsSUB3d2) ? 4 : 2) | i;
        } else {
            bgIsSUB3d2 = bgIsSUB3d;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            jZuV4yGnu2 = jZuV4yGnu;
            i3 |= wpxpbwg1j.iiGwOFFnr(jZuV4yGnu2) ? 32 : 16;
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    j3 = j;
                    if (wpxpbwg1j.kCA6Zs9sL(j3)) {
                        i6 = 256;
                        i3 |= i6;
                    }
                } else {
                    j3 = j;
                }
                i6 = 128;
                i3 |= i6;
            } else {
                j3 = j;
            }
            if ((i & 7168) != 0) {
                j4 = j2;
                i3 |= ((i2 & 8) != 0 || !wpxpbwg1j.kCA6Zs9sL(j4)) ? 1024 : 2048;
            } else {
                j4 = j2;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 57344) == 0) {
                i3 |= wpxpbwg1j.iiGwOFFnr(null) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((i & 458752) == 0) {
                f2 = f;
                i3 |= wpxpbwg1j.tGV7Q6urW(f2) ? 131072 : 65536;
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    i3 |= wpxpbwg1j.iiGwOFFnr(kkcqgcx5g) ? 1048576 : 524288;
                }
                if (((i3 & 2995931) ^ 599186) == 0 || !wpxpbwg1j.i8XZMQc6Z()) {
                    wpxpbwg1j.TyB1UUd72();
                    if ((i & 1) != 0 || wpxpbwg1j.WaUP0CF08()) {
                        if (i7 != 0) {
                            int i9 = BgIsSUB3d.Puu3Rhg4F;
                            bgIsSUB3d3 = H11ySchUh.CBQ5d1kRq;
                        } else {
                            bgIsSUB3d3 = bgIsSUB3d2;
                        }
                        if (i8 != 0) {
                            jZuV4yGnu2 = Nb0J8E3sF.q3BipwRCk;
                        }
                        if ((i2 & 4) != 0) {
                            j3 = ((q56y96RYz) wpxpbwg1j.oon79WMrY(aaizp84lL.q3BipwRCk)).yWvV4ePLl();
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            j4 = aaizp84lL.q3BipwRCk(j3, wpxpbwg1j);
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            f4 = (float) 0;
                            i5 = i3;
                            j7 = j4;
                            wpxpbwg1j.qVUwofr5s();
                            int i10 = BgIsSUB3d.Puu3Rhg4F;
                            GPLPRo6go(bgIsSUB3d3, jZuV4yGnu2, j3, j7, f4, VpcjuZfOq.q3BipwRCk(pA5wCkne4.ixWaw2akD(H11ySchUh.CBQ5d1kRq, false, YIpohH2iF.kmSgne1rO), qih4lW99W.q3BipwRCk, new sYCtPKAIO(null)), kkcqgcx5g, wpxpbwg1j, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                            f3 = f4;
                            jZuV4yGnu3 = jZuV4yGnu2;
                            j5 = j7;
                            j6 = j3;
                        }
                    } else {
                        wpxpbwg1j.igRQEZxnW();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        bgIsSUB3d3 = bgIsSUB3d2;
                    }
                    i5 = i3;
                    j7 = j4;
                    f4 = f2;
                    wpxpbwg1j.qVUwofr5s();
                    int i102 = BgIsSUB3d.Puu3Rhg4F;
                    GPLPRo6go(bgIsSUB3d3, jZuV4yGnu2, j3, j7, f4, VpcjuZfOq.q3BipwRCk(pA5wCkne4.ixWaw2akD(H11ySchUh.CBQ5d1kRq, false, YIpohH2iF.kmSgne1rO), qih4lW99W.q3BipwRCk, new sYCtPKAIO(null)), kkcqgcx5g, wpxpbwg1j, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
                    f3 = f4;
                    jZuV4yGnu3 = jZuV4yGnu2;
                    j5 = j7;
                    j6 = j3;
                } else {
                    wpxpbwg1j.igRQEZxnW();
                    bgIsSUB3d3 = bgIsSUB3d2;
                    jZuV4yGnu3 = jZuV4yGnu2;
                    j6 = j3;
                    j5 = j4;
                    f3 = f2;
                }
                Eeka1udhb = wpxpbwg1j.Eeka1udhb();
                if (Eeka1udhb != null) {
                    Eeka1udhb.dIocxURUo = new vmXIadXKy(bgIsSUB3d3, jZuV4yGnu3, j6, j5, f3, kkcqgcx5g, i, i2);
                    return;
                }
                return;
            }
            f2 = f;
            if ((i2 & 64) != 0) {
            }
            if (((i3 & 2995931) ^ 599186) == 0) {
            }
            wpxpbwg1j.TyB1UUd72();
            if ((i & 1) != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if ((i2 & 4) != 0) {
            }
            if ((i2 & 8) != 0) {
            }
            if (i4 != 0) {
            }
            i5 = i3;
            j7 = j4;
            f4 = f2;
            wpxpbwg1j.qVUwofr5s();
            int i1022 = BgIsSUB3d.Puu3Rhg4F;
            GPLPRo6go(bgIsSUB3d3, jZuV4yGnu2, j3, j7, f4, VpcjuZfOq.q3BipwRCk(pA5wCkne4.ixWaw2akD(H11ySchUh.CBQ5d1kRq, false, YIpohH2iF.kmSgne1rO), qih4lW99W.q3BipwRCk, new sYCtPKAIO(null)), kkcqgcx5g, wpxpbwg1j, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
            f3 = f4;
            jZuV4yGnu3 = jZuV4yGnu2;
            j5 = j7;
            j6 = j3;
            Eeka1udhb = wpxpbwg1j.Eeka1udhb();
            if (Eeka1udhb != null) {
            }
        }
        jZuV4yGnu2 = jZuV4yGnu;
        if ((i & 896) != 0) {
        }
        if ((i & 7168) != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        f2 = f;
        if ((i2 & 64) != 0) {
        }
        if (((i3 & 2995931) ^ 599186) == 0) {
        }
        wpxpbwg1j.TyB1UUd72();
        if ((i & 1) != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if ((i2 & 4) != 0) {
        }
        if ((i2 & 8) != 0) {
        }
        if (i4 != 0) {
        }
        i5 = i3;
        j7 = j4;
        f4 = f2;
        wpxpbwg1j.qVUwofr5s();
        int i10222 = BgIsSUB3d.Puu3Rhg4F;
        GPLPRo6go(bgIsSUB3d3, jZuV4yGnu2, j3, j7, f4, VpcjuZfOq.q3BipwRCk(pA5wCkne4.ixWaw2akD(H11ySchUh.CBQ5d1kRq, false, YIpohH2iF.kmSgne1rO), qih4lW99W.q3BipwRCk, new sYCtPKAIO(null)), kkcqgcx5g, wpxpbwg1j, (i5 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | ((i5 << 3) & 29360128));
        f3 = f4;
        jZuV4yGnu3 = jZuV4yGnu2;
        j5 = j7;
        j6 = j3;
        Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb != null) {
        }
    }

    public static final bzmJZsHMu ilHKhw3Yw(mnTaxtMa7 mntaxtma7) {
        return gThLCaTO1.ilHKhw3Yw(iMyQMM6Qj(mntaxtma7), mntaxtma7, false, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0067 A[LOOP:0: B:21:0x0033->B:37:0x0067, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0065 A[EDGE_INSN: B:44:0x0065->B:36:0x0065 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static String ixWaw2akD(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, PmanMZxiM pmanMZxiM, int i2) {
        CharSequence charSequence5;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        String str = "";
        String str2 = null;
        String str3 = (i2 & 2) != 0 ? str : null;
        if ((i2 & 4) == 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            str2 = "...";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str3);
        int size = list.size() - 1;
        int i3 = 0;
        if (size >= 0) {
            int i4 = 0;
            while (true) {
                int i5 = i3 + 1;
                Object obj = list.get(i3);
                boolean z = true;
                i4++;
                if (i4 > 1) {
                    sb.append(charSequence);
                }
                if (i >= 0 && i4 > i) {
                    break;
                }
                if (obj != null) {
                    z = obj instanceof CharSequence;
                }
                if (z) {
                    charSequence5 = (CharSequence) obj;
                } else if (obj instanceof Character) {
                    sb.append(((Character) obj).charValue());
                    if (i5 <= size) {
                        break;
                    }
                    i3 = i5;
                } else {
                    charSequence5 = String.valueOf(obj);
                }
                sb.append(charSequence5);
                if (i5 <= size) {
                }
            }
            i3 = i4;
        }
        if (i >= 0 && i3 > i) {
            sb.append((CharSequence) str2);
        }
        sb.append((CharSequence) str);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void kCA6Zs9sL(gdEmqfwpT gdemqfwpt, BgIsSUB3d bgIsSUB3d, JZuV4yGnu jZuV4yGnu, long j, long j2, float f, RqP4RtdHY rqP4RtdHY, D9Yt6oHyO d9Yt6oHyO, boolean z, String str, qDffvYFss qdffvyfss, kkcQgCx5G kkcqgcx5g, rJ0s9PfCL rj0s9pfcl, int i, int i2, int i3) {
        int i4;
        BgIsSUB3d bgIsSUB3d2;
        int i5;
        JZuV4yGnu jZuV4yGnu2;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        qDffvYFss qdffvyfss2;
        String str2;
        boolean z2;
        D9Yt6oHyO d9Yt6oHyO2;
        RqP4RtdHY rqP4RtdHY2;
        float f3;
        long j3;
        long j4;
        JZuV4yGnu jZuV4yGnu3;
        BgIsSUB3d bgIsSUB3d3;
        rESgwfV20 Eeka1udhb;
        long j5;
        D9Yt6oHyO d9Yt6oHyO3;
        RqP4RtdHY rqP4RtdHY3;
        long j6;
        JZuV4yGnu jZuV4yGnu4;
        BgIsSUB3d bgIsSUB3d4;
        String str3;
        qDffvYFss qdffvyfss3;
        boolean z3;
        int i12;
        int i13;
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(-750962911);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (wpxpbwg1j.iiGwOFFnr(gdemqfwpt) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            bgIsSUB3d2 = bgIsSUB3d;
            i4 |= wpxpbwg1j.iiGwOFFnr(bgIsSUB3d2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i & 896) == 0) {
                jZuV4yGnu2 = jZuV4yGnu;
                i4 |= wpxpbwg1j.iiGwOFFnr(jZuV4yGnu2) ? 256 : 128;
                if ((i & 7168) == 0) {
                    i4 |= ((i3 & 8) != 0 || !wpxpbwg1j.kCA6Zs9sL(j)) ? 1024 : 2048;
                }
                if ((i & 57344) == 0) {
                    i4 |= ((i3 & 16) != 0 || !wpxpbwg1j.kCA6Zs9sL(j2)) ? 8192 : 16384;
                }
                if ((i3 & 32) != 0) {
                    i13 = 196608;
                } else {
                    if ((i & 458752) == 0) {
                        i13 = wpxpbwg1j.iiGwOFFnr(null) ? 131072 : 65536;
                    }
                    i6 = i3 & 64;
                    if (i6 == 0) {
                        i4 |= 1572864;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i & 3670016) == 0) {
                            i4 |= wpxpbwg1j.tGV7Q6urW(f2) ? 1048576 : 524288;
                        }
                    }
                    i7 = i3 & 128;
                    if (i7 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 29360128) == 0) {
                        i4 |= wpxpbwg1j.iiGwOFFnr(rqP4RtdHY) ? 8388608 : 4194304;
                    }
                    if ((i & 234881024) == 0) {
                        if ((i3 & 256) == 0 && wpxpbwg1j.iiGwOFFnr(d9Yt6oHyO)) {
                            i12 = 67108864;
                            i4 |= i12;
                        }
                        i12 = 33554432;
                        i4 |= i12;
                    }
                    i8 = i3 & 512;
                    if (i8 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 1879048192) == 0) {
                        i4 |= wpxpbwg1j.GPLPRo6go(z) ? 536870912 : 268435456;
                    }
                    i9 = i3 & 1024;
                    if (i9 == 0) {
                        i10 = i2 | 6;
                    } else if ((i2 & 14) == 0) {
                        i10 = i2 | (wpxpbwg1j.iiGwOFFnr(str) ? 4 : 2);
                    } else {
                        i10 = i2;
                    }
                    i11 = i3 & 2048;
                    if (i11 == 0) {
                        i10 |= 48;
                    } else if ((i2 & 112) == 0) {
                        i10 |= wpxpbwg1j.iiGwOFFnr(qdffvyfss) ? 32 : 16;
                    }
                    int i15 = i10;
                    if ((i3 & 4096) == 0) {
                        i15 |= 384;
                    } else if ((i2 & 896) == 0) {
                        i15 |= wpxpbwg1j.iiGwOFFnr(kkcqgcx5g) ? 256 : 128;
                        if (((i4 & 1533916891) ^ 306783378) == 0 || ((i15 & 731) ^ 146) != 0 || !wpxpbwg1j.i8XZMQc6Z()) {
                            wpxpbwg1j.TyB1UUd72();
                            if ((i & 1) != 0 || wpxpbwg1j.WaUP0CF08()) {
                                if (i14 != 0) {
                                    int i16 = BgIsSUB3d.Puu3Rhg4F;
                                    bgIsSUB3d4 = H11ySchUh.CBQ5d1kRq;
                                } else {
                                    bgIsSUB3d4 = bgIsSUB3d;
                                }
                                jZuV4yGnu4 = i5 != 0 ? Nb0J8E3sF.q3BipwRCk : jZuV4yGnu2;
                                if ((i3 & 8) != 0) {
                                    j6 = ((q56y96RYz) wpxpbwg1j.oon79WMrY(aaizp84lL.q3BipwRCk)).yWvV4ePLl();
                                    i4 &= -7169;
                                } else {
                                    j6 = j;
                                }
                                if ((i3 & 16) != 0) {
                                    j5 = aaizp84lL.q3BipwRCk(j6, wpxpbwg1j);
                                    i4 &= -57345;
                                } else {
                                    j5 = j2;
                                }
                                if (i6 != 0) {
                                    f2 = (float) 0;
                                }
                                if (i7 != 0) {
                                    wpxpbwg1j.zHl31GGXU(-3687241);
                                    Object dfpT1j18n = wpxpbwg1j.dfpT1j18n();
                                    int i17 = rJ0s9PfCL.q3BipwRCk;
                                    if (dfpT1j18n == P7Re99G8L.J4Ux7ym32) {
                                        dfpT1j18n = new RqP4RtdHY();
                                        wpxpbwg1j.INnK5Rew6(dfpT1j18n);
                                    }
                                    wpxpbwg1j.ilHKhw3Yw(false);
                                    rqP4RtdHY3 = (RqP4RtdHY) dfpT1j18n;
                                } else {
                                    rqP4RtdHY3 = rqP4RtdHY;
                                }
                                if ((i3 & 256) != 0) {
                                    d9Yt6oHyO3 = (D9Yt6oHyO) wpxpbwg1j.oon79WMrY(Da6U4hKvb.q3BipwRCk);
                                    i4 &= -234881025;
                                } else {
                                    d9Yt6oHyO3 = d9Yt6oHyO;
                                }
                                z3 = i8 != 0 ? true : z;
                                str3 = i9 != 0 ? null : str;
                                qdffvyfss3 = i11 != 0 ? null : qdffvyfss;
                            } else {
                                wpxpbwg1j.igRQEZxnW();
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                if ((i3 & 16) != 0) {
                                    i4 &= -57345;
                                }
                                if ((i3 & 256) != 0) {
                                    i4 &= -234881025;
                                }
                                bgIsSUB3d4 = bgIsSUB3d;
                                j6 = j;
                                j5 = j2;
                                rqP4RtdHY3 = rqP4RtdHY;
                                z3 = z;
                                str3 = str;
                                qdffvyfss3 = qdffvyfss;
                                jZuV4yGnu4 = jZuV4yGnu2;
                                d9Yt6oHyO3 = d9Yt6oHyO;
                            }
                            wpxpbwg1j.qVUwofr5s();
                            hOY2Rgtej hoy2rgtej = RPWp2ymxg.q3BipwRCk;
                            BgIsSUB3d CBQ5d1kRq = gThLCaTO1.CBQ5d1kRq(bgIsSUB3d4, null, gSi9xJYHr.qVUwofr5s, 1);
                            int i18 = BgIsSUB3d.Puu3Rhg4F;
                            int i19 = i4 >> 3;
                            GPLPRo6go(CBQ5d1kRq, jZuV4yGnu4, j6, j5, f2, syekKyXqd.kCA6Zs9sL(H11ySchUh.CBQ5d1kRq, rqP4RtdHY3, d9Yt6oHyO3, z3, str3, qdffvyfss3, gdemqfwpt), kkcqgcx5g, wpxpbwg1j, (i19 & 896) | (i19 & 112) | (i19 & 7168) | (i19 & 57344) | (i19 & 458752) | ((i15 << 15) & 29360128));
                            qdffvyfss2 = qdffvyfss3;
                            bgIsSUB3d3 = bgIsSUB3d4;
                            j4 = j6;
                            rqP4RtdHY2 = rqP4RtdHY3;
                            f3 = f2;
                            d9Yt6oHyO2 = d9Yt6oHyO3;
                            z2 = z3;
                            str2 = str3;
                            jZuV4yGnu3 = jZuV4yGnu4;
                            j3 = j5;
                        } else {
                            wpxpbwg1j.igRQEZxnW();
                            j4 = j;
                            j3 = j2;
                            rqP4RtdHY2 = rqP4RtdHY;
                            d9Yt6oHyO2 = d9Yt6oHyO;
                            qdffvyfss2 = qdffvyfss;
                            bgIsSUB3d3 = bgIsSUB3d2;
                            f3 = f2;
                            jZuV4yGnu3 = jZuV4yGnu2;
                            z2 = z;
                            str2 = str;
                        }
                        Eeka1udhb = wpxpbwg1j.Eeka1udhb();
                        if (Eeka1udhb != null) {
                            Eeka1udhb.dIocxURUo = new NagIYCVNO(gdemqfwpt, bgIsSUB3d3, jZuV4yGnu3, j4, j3, f3, rqP4RtdHY2, d9Yt6oHyO2, z2, str2, qdffvyfss2, kkcqgcx5g, i, i2, i3);
                            return;
                        }
                        return;
                    }
                    if (((i4 & 1533916891) ^ 306783378) == 0) {
                    }
                    wpxpbwg1j.TyB1UUd72();
                    if ((i & 1) != 0) {
                    }
                    if (i14 != 0) {
                    }
                    if (i5 != 0) {
                    }
                    if ((i3 & 8) != 0) {
                    }
                    if ((i3 & 16) != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if ((i3 & 256) != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    wpxpbwg1j.qVUwofr5s();
                    hOY2Rgtej hoy2rgtej2 = RPWp2ymxg.q3BipwRCk;
                    BgIsSUB3d CBQ5d1kRq2 = gThLCaTO1.CBQ5d1kRq(bgIsSUB3d4, null, gSi9xJYHr.qVUwofr5s, 1);
                    int i182 = BgIsSUB3d.Puu3Rhg4F;
                    int i192 = i4 >> 3;
                    GPLPRo6go(CBQ5d1kRq2, jZuV4yGnu4, j6, j5, f2, syekKyXqd.kCA6Zs9sL(H11ySchUh.CBQ5d1kRq, rqP4RtdHY3, d9Yt6oHyO3, z3, str3, qdffvyfss3, gdemqfwpt), kkcqgcx5g, wpxpbwg1j, (i192 & 896) | (i192 & 112) | (i192 & 7168) | (i192 & 57344) | (i192 & 458752) | ((i15 << 15) & 29360128));
                    qdffvyfss2 = qdffvyfss3;
                    bgIsSUB3d3 = bgIsSUB3d4;
                    j4 = j6;
                    rqP4RtdHY2 = rqP4RtdHY3;
                    f3 = f2;
                    d9Yt6oHyO2 = d9Yt6oHyO3;
                    z2 = z3;
                    str2 = str3;
                    jZuV4yGnu3 = jZuV4yGnu4;
                    j3 = j5;
                    Eeka1udhb = wpxpbwg1j.Eeka1udhb();
                    if (Eeka1udhb != null) {
                    }
                }
                i4 |= i13;
                i6 = i3 & 64;
                if (i6 == 0) {
                }
                i7 = i3 & 128;
                if (i7 == 0) {
                }
                if ((i & 234881024) == 0) {
                }
                i8 = i3 & 512;
                if (i8 == 0) {
                }
                i9 = i3 & 1024;
                if (i9 == 0) {
                }
                i11 = i3 & 2048;
                if (i11 == 0) {
                }
                int i152 = i10;
                if ((i3 & 4096) == 0) {
                }
                if (((i4 & 1533916891) ^ 306783378) == 0) {
                }
                wpxpbwg1j.TyB1UUd72();
                if ((i & 1) != 0) {
                }
                if (i14 != 0) {
                }
                if (i5 != 0) {
                }
                if ((i3 & 8) != 0) {
                }
                if ((i3 & 16) != 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if ((i3 & 256) != 0) {
                }
                if (i8 != 0) {
                }
                if (i9 != 0) {
                }
                if (i11 != 0) {
                }
                wpxpbwg1j.qVUwofr5s();
                hOY2Rgtej hoy2rgtej22 = RPWp2ymxg.q3BipwRCk;
                BgIsSUB3d CBQ5d1kRq22 = gThLCaTO1.CBQ5d1kRq(bgIsSUB3d4, null, gSi9xJYHr.qVUwofr5s, 1);
                int i1822 = BgIsSUB3d.Puu3Rhg4F;
                int i1922 = i4 >> 3;
                GPLPRo6go(CBQ5d1kRq22, jZuV4yGnu4, j6, j5, f2, syekKyXqd.kCA6Zs9sL(H11ySchUh.CBQ5d1kRq, rqP4RtdHY3, d9Yt6oHyO3, z3, str3, qdffvyfss3, gdemqfwpt), kkcqgcx5g, wpxpbwg1j, (i1922 & 896) | (i1922 & 112) | (i1922 & 7168) | (i1922 & 57344) | (i1922 & 458752) | ((i152 << 15) & 29360128));
                qdffvyfss2 = qdffvyfss3;
                bgIsSUB3d3 = bgIsSUB3d4;
                j4 = j6;
                rqP4RtdHY2 = rqP4RtdHY3;
                f3 = f2;
                d9Yt6oHyO2 = d9Yt6oHyO3;
                z2 = z3;
                str2 = str3;
                jZuV4yGnu3 = jZuV4yGnu4;
                j3 = j5;
                Eeka1udhb = wpxpbwg1j.Eeka1udhb();
                if (Eeka1udhb != null) {
                }
            }
            jZuV4yGnu2 = jZuV4yGnu;
            if ((i & 7168) == 0) {
            }
            if ((i & 57344) == 0) {
            }
            if ((i3 & 32) != 0) {
            }
            i4 |= i13;
            i6 = i3 & 64;
            if (i6 == 0) {
            }
            i7 = i3 & 128;
            if (i7 == 0) {
            }
            if ((i & 234881024) == 0) {
            }
            i8 = i3 & 512;
            if (i8 == 0) {
            }
            i9 = i3 & 1024;
            if (i9 == 0) {
            }
            i11 = i3 & 2048;
            if (i11 == 0) {
            }
            int i1522 = i10;
            if ((i3 & 4096) == 0) {
            }
            if (((i4 & 1533916891) ^ 306783378) == 0) {
            }
            wpxpbwg1j.TyB1UUd72();
            if ((i & 1) != 0) {
            }
            if (i14 != 0) {
            }
            if (i5 != 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            if (i8 != 0) {
            }
            if (i9 != 0) {
            }
            if (i11 != 0) {
            }
            wpxpbwg1j.qVUwofr5s();
            hOY2Rgtej hoy2rgtej222 = RPWp2ymxg.q3BipwRCk;
            BgIsSUB3d CBQ5d1kRq222 = gThLCaTO1.CBQ5d1kRq(bgIsSUB3d4, null, gSi9xJYHr.qVUwofr5s, 1);
            int i18222 = BgIsSUB3d.Puu3Rhg4F;
            int i19222 = i4 >> 3;
            GPLPRo6go(CBQ5d1kRq222, jZuV4yGnu4, j6, j5, f2, syekKyXqd.kCA6Zs9sL(H11ySchUh.CBQ5d1kRq, rqP4RtdHY3, d9Yt6oHyO3, z3, str3, qdffvyfss3, gdemqfwpt), kkcqgcx5g, wpxpbwg1j, (i19222 & 896) | (i19222 & 112) | (i19222 & 7168) | (i19222 & 57344) | (i19222 & 458752) | ((i1522 << 15) & 29360128));
            qdffvyfss2 = qdffvyfss3;
            bgIsSUB3d3 = bgIsSUB3d4;
            j4 = j6;
            rqP4RtdHY2 = rqP4RtdHY3;
            f3 = f2;
            d9Yt6oHyO2 = d9Yt6oHyO3;
            z2 = z3;
            str2 = str3;
            jZuV4yGnu3 = jZuV4yGnu4;
            j3 = j5;
            Eeka1udhb = wpxpbwg1j.Eeka1udhb();
            if (Eeka1udhb != null) {
            }
        }
        bgIsSUB3d2 = bgIsSUB3d;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        jZuV4yGnu2 = jZuV4yGnu;
        if ((i & 7168) == 0) {
        }
        if ((i & 57344) == 0) {
        }
        if ((i3 & 32) != 0) {
        }
        i4 |= i13;
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        if ((i & 234881024) == 0) {
        }
        i8 = i3 & 512;
        if (i8 == 0) {
        }
        i9 = i3 & 1024;
        if (i9 == 0) {
        }
        i11 = i3 & 2048;
        if (i11 == 0) {
        }
        int i15222 = i10;
        if ((i3 & 4096) == 0) {
        }
        if (((i4 & 1533916891) ^ 306783378) == 0) {
        }
        wpxpbwg1j.TyB1UUd72();
        if ((i & 1) != 0) {
        }
        if (i14 != 0) {
        }
        if (i5 != 0) {
        }
        if ((i3 & 8) != 0) {
        }
        if ((i3 & 16) != 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if (i8 != 0) {
        }
        if (i9 != 0) {
        }
        if (i11 != 0) {
        }
        wpxpbwg1j.qVUwofr5s();
        hOY2Rgtej hoy2rgtej2222 = RPWp2ymxg.q3BipwRCk;
        BgIsSUB3d CBQ5d1kRq2222 = gThLCaTO1.CBQ5d1kRq(bgIsSUB3d4, null, gSi9xJYHr.qVUwofr5s, 1);
        int i182222 = BgIsSUB3d.Puu3Rhg4F;
        int i192222 = i4 >> 3;
        GPLPRo6go(CBQ5d1kRq2222, jZuV4yGnu4, j6, j5, f2, syekKyXqd.kCA6Zs9sL(H11ySchUh.CBQ5d1kRq, rqP4RtdHY3, d9Yt6oHyO3, z3, str3, qdffvyfss3, gdemqfwpt), kkcqgcx5g, wpxpbwg1j, (i192222 & 896) | (i192222 & 112) | (i192222 & 7168) | (i192222 & 57344) | (i192222 & 458752) | ((i15222 << 15) & 29360128));
        qdffvyfss2 = qdffvyfss3;
        bgIsSUB3d3 = bgIsSUB3d4;
        j4 = j6;
        rqP4RtdHY2 = rqP4RtdHY3;
        f3 = f2;
        d9Yt6oHyO2 = d9Yt6oHyO3;
        z2 = z3;
        str2 = str3;
        jZuV4yGnu3 = jZuV4yGnu4;
        j3 = j5;
        Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb != null) {
        }
    }

    public static final boolean kmSgne1rO(or5nbo9ku or5nbo9ku) {
        return or5nbo9ku.GPLPRo6go.IytU16YUK == BFRsKhrQv.Rtl;
    }

    public static final boolean mUqPm6GBh(KB2jjcOAK kB2jjcOAK, KB2jjcOAK kB2jjcOAK2, boolean z) {
        if (kB2jjcOAK.KBYw84i3W(false).contains(kB2jjcOAK2)) {
            int ordinal = kB2jjcOAK.D91ZKn9BG().ordinal();
            if (ordinal == 0) {
                ftmnXRQmW ftmnxrqmw = ftmnXRQmW.ActiveParent;
                ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).CBQ5d1kRq = ftmnxrqmw;
                kB2jjcOAK.DEe4ujgEA(ftmnxrqmw);
            } else if (ordinal == 1) {
                KB2jjcOAK pwwzaxl9D = kB2jjcOAK.pwwzaxl9D();
                if (pwwzaxl9D == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else if (!Eeka1udhb(pwwzaxl9D, false, 1)) {
                    return false;
                }
            } else if (ordinal == 2) {
                return false;
            } else {
                if (ordinal == 3) {
                    Bhmn1KIah(kB2jjcOAK);
                    boolean mUqPm6GBh = mUqPm6GBh(kB2jjcOAK, kB2jjcOAK2, z);
                    dXrmkklc8(kB2jjcOAK);
                    return mUqPm6GBh;
                } else if (ordinal == 4) {
                    KB2jjcOAK pwwzaxl9D2 = kB2jjcOAK.pwwzaxl9D();
                    if (pwwzaxl9D2 != null && !Eeka1udhb(pwwzaxl9D2, false, 1)) {
                        return false;
                    }
                } else if (ordinal == 5) {
                    KB2jjcOAK OpLJtmvFM = kB2jjcOAK.OpLJtmvFM();
                    if (OpLJtmvFM == null) {
                        if (!NyWTwPF6V(kB2jjcOAK)) {
                            return false;
                        }
                        ftmnXRQmW ftmnxrqmw2 = ftmnXRQmW.Active;
                        ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).CBQ5d1kRq = ftmnxrqmw2;
                        kB2jjcOAK.DEe4ujgEA(ftmnxrqmw2);
                    } else if (!mUqPm6GBh(OpLJtmvFM, kB2jjcOAK, false)) {
                        return false;
                    }
                    return mUqPm6GBh(kB2jjcOAK, kB2jjcOAK2, z);
                } else {
                    throw new dnCerKhAM();
                }
            }
            ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).kmSgne1rO = kB2jjcOAK2;
            IytU16YUK(kB2jjcOAK2, z);
            return true;
        }
        throw new IllegalStateException("Non child node cannot request focus.".toString());
    }

    public static final long nlGCs0NZs(mnTaxtMa7 mntaxtma7) {
        JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
        return ((qhaZGYFO8) mntaxtma7).Ta2zrwkcM(bRgfgYIQX.tGV7Q6urW);
    }

    public static final Rect o4LF8RkoQ(bzmJZsHMu bzmjzshmu) {
        return new Rect((int) bzmjzshmu.q3BipwRCk, (int) bzmjzshmu.J4Ux7ym32, (int) bzmjzshmu.tGV7Q6urW, (int) bzmjzshmu.dIocxURUo);
    }

    public static final Object oon79WMrY(k0ugT26MT k0ugt26mt, n4f84B5OG n4f84b5og, W1NiVqEgR w1NiVqEgR, CcBVlmP2F ccBVlmP2F, boolean z, njjwS3RZT njjws3rzt, Way959ade way959ade) {
        float floatValue = ((Number) n4f84b5og.kmSgne1rO).floatValue();
        cKAQplqZy ckaqplqzy = (cKAQplqZy) n4f84b5og.CBQ5d1kRq;
        njjwS3RZT njjws3rzt2 = njjwS3RZT.Vertical;
        long dIocxURUo = njjws3rzt == njjws3rzt2 ? ODug2UCW1.dIocxURUo(0.0f, floatValue) : ODug2UCW1.dIocxURUo(floatValue, 0.0f);
        long j = ckaqplqzy.tGV7Q6urW;
        float signum = Math.signum(njjws3rzt == njjws3rzt2 ? bRgfgYIQX.dIocxURUo(j) : bRgfgYIQX.tGV7Q6urW(j));
        long kCA6Zs9sL = bRgfgYIQX.kCA6Zs9sL(j, ODug2UCW1.dIocxURUo(bRgfgYIQX.tGV7Q6urW(dIocxURUo) * signum, bRgfgYIQX.dIocxURUo(dIocxURUo) * signum));
        spFv56w6q spfv56w6q = (spFv56w6q) ccBVlmP2F;
        spfv56w6q.Puu3Rhg4F(new s4NxAcTJi(kCA6Zs9sL, null));
        if (z) {
            floatValue *= (float) -1;
        }
        spfv56w6q.Puu3Rhg4F(new rgshbUd80(floatValue, kCA6Zs9sL, null));
        xn7fPE2PN xn7fpe2pn = new xn7fPE2PN(w1NiVqEgR, njjws3rzt, spfv56w6q, z);
        if (njjws3rzt == njjws3rzt2) {
            return ZEpQDovLv.oon79WMrY(k0ugt26mt, ckaqplqzy.q3BipwRCk, xn7fpe2pn, way959ade);
        }
        return ZEpQDovLv.GPLPRo6go(k0ugt26mt, ckaqplqzy.q3BipwRCk, xn7fpe2pn, way959ade);
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x039f, code lost:
        if (r9 == null) goto L_0x03ae;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03ac, code lost:
        if (r9 == null) goto L_0x03ae;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03b2, code lost:
        r9 = r9.q3BipwRCk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03da, code lost:
        if (r7 == null) goto L_0x03ed;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03eb, code lost:
        if (r7 == null) goto L_0x03ed;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03f1, code lost:
        r7 = r7.q3BipwRCk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04b8, code lost:
        if (r10 == null) goto L_0x04ca;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x04c8, code lost:
        if (r10 == null) goto L_0x04ca;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x04cd, code lost:
        r10 = r10.q3BipwRCk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x04ee, code lost:
        if (r11 == null) goto L_0x0502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x04fb, code lost:
        if (r11 == null) goto L_0x0502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x04fe, code lost:
        r22 = r11.q3BipwRCk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ac, code lost:
        if (r12 == con.P7Re99G8L.J4Ux7ym32) goto L_0x00ae;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0107, code lost:
        if (r15 == con.P7Re99G8L.J4Ux7ym32) goto L_0x0109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01d1, code lost:
        if (r10 == con.P7Re99G8L.J4Ux7ym32) goto L_0x01d3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0222, code lost:
        if (r10 == con.P7Re99G8L.J4Ux7ym32) goto L_0x0224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02a4, code lost:
        if (r9 == con.P7Re99G8L.J4Ux7ym32) goto L_0x02a6;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0696  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x077b  */
    /* JADX WARN: Removed duplicated region for block: B:278:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a0  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void q3BipwRCk(kdbvrtBH1 kdbvrtbh1, PmanMZxiM pmanMZxiM, BgIsSUB3d bgIsSUB3d, EVoQ2RqaN eVoQ2RqaN, JzLhkMe5F jzLhkMe5F, NzvP5Rex8 nzvP5Rex8, rJ0s9PfCL rj0s9pfcl, int i) {
        int i2;
        rESgwfV20 Eeka1udhb;
        boolean z;
        kdbvrtBH1 kdbvrtbh12;
        boolean iiGwOFFnr;
        int i3;
        Object J4Ux7ym32;
        Object obj;
        boolean z2;
        boolean iiGwOFFnr2;
        boolean iiGwOFFnr3;
        boolean iiGwOFFnr4;
        boolean z3;
        RNEcgN6dQ rNEcgN6dQ;
        prCJwNx2x prcjwnx2x;
        BgIsSUB3d bgIsSUB3d2;
        gq2zZKdsH gq2zzkdsh;
        String str;
        int i4;
        UBY2Inzw8 uBY2Inzw8;
        BgIsSUB3d bgIsSUB3d3;
        Object dfpT1j18n;
        gq2zZKdsH gq2zzkdsh2;
        PmanMZxiM pmanMZxiM2;
        int i5;
        float f;
        WyfbJwwBZ wyfbJwwBZ;
        int ordinal;
        WyfbJwwBZ wyfbJwwBZ2;
        long j;
        int ordinal2;
        long j2;
        r9U1gbsBL r9u1gbsbl;
        r9U1gbsBL r9u1gbsbl2;
        gsUpNChDr gsupnchdr;
        float f2;
        gq2zZKdsH gq2zzkdsh3;
        gsUpNChDr gsupnchdr2;
        float f3;
        Boolean bool;
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(-918810774);
        Object obj2 = G7WvUK4mQ.q3BipwRCk;
        if ((i & 14) == 0) {
            i2 = (wpxpbwg1j.iiGwOFFnr(kdbvrtbh1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= wpxpbwg1j.iiGwOFFnr(pmanMZxiM) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= wpxpbwg1j.iiGwOFFnr(bgIsSUB3d) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= wpxpbwg1j.iiGwOFFnr(eVoQ2RqaN) ? 2048 : 1024;
        }
        if ((i & 57344) == 0) {
            i2 |= wpxpbwg1j.iiGwOFFnr(jzLhkMe5F) ? 16384 : 8192;
        }
        if ((i & 458752) == 0) {
            i2 |= wpxpbwg1j.iiGwOFFnr(nzvP5Rex8) ? 131072 : 65536;
        }
        if (((374491 & i2) ^ 74898) != 0 || !wpxpbwg1j.i8XZMQc6Z()) {
            int i6 = i2 & 14;
            wpxpbwg1j.zHl31GGXU(-3686930);
            boolean iiGwOFFnr5 = wpxpbwg1j.iiGwOFFnr(kdbvrtbh1);
            Object dfpT1j18n2 = wpxpbwg1j.dfpT1j18n();
            if (!iiGwOFFnr5) {
                int i7 = rJ0s9PfCL.q3BipwRCk;
            }
            dfpT1j18n2 = u51fgFYkV.dIocxURUo(pmanMZxiM.IytU16YUK(kdbvrtbh1.J4Ux7ym32()), null, 2, null);
            wpxpbwg1j.INnK5Rew6(dfpT1j18n2);
            wpxpbwg1j.ilHKhw3Yw(false);
            RNEcgN6dQ rNEcgN6dQ2 = (RNEcgN6dQ) dfpT1j18n2;
            if (((Boolean) pmanMZxiM.IytU16YUK(kdbvrtbh1.iiGwOFFnr())).booleanValue() || ((Boolean) ((prCJwNx2x) rNEcgN6dQ2).getValue()).booleanValue() || kdbvrtbh1.GPLPRo6go()) {
                int i8 = i6 | 48;
                wpxpbwg1j.zHl31GGXU(1117107336);
                int i9 = i8 & 14;
                wpxpbwg1j.zHl31GGXU(-3686930);
                boolean iiGwOFFnr6 = wpxpbwg1j.iiGwOFFnr(kdbvrtbh1);
                Object dfpT1j18n3 = wpxpbwg1j.dfpT1j18n();
                if (!iiGwOFFnr6) {
                    int i10 = rJ0s9PfCL.q3BipwRCk;
                }
                dfpT1j18n3 = kdbvrtbh1.J4Ux7ym32();
                wpxpbwg1j.INnK5Rew6(dfpT1j18n3);
                wpxpbwg1j.ilHKhw3Yw(false);
                if (kdbvrtbh1.GPLPRo6go()) {
                    dfpT1j18n3 = kdbvrtbh1.J4Ux7ym32();
                }
                wpxpbwg1j.zHl31GGXU(-174039129);
                Object i0Zug1mVk = i0Zug1mVk(kdbvrtbh1, pmanMZxiM, dfpT1j18n3, wpxpbwg1j);
                wpxpbwg1j.ilHKhw3Yw(false);
                Object iiGwOFFnr7 = kdbvrtbh1.iiGwOFFnr();
                wpxpbwg1j.zHl31GGXU(-174039129);
                Object i0Zug1mVk2 = i0Zug1mVk(kdbvrtbh1, pmanMZxiM, iiGwOFFnr7, wpxpbwg1j);
                wpxpbwg1j.ilHKhw3Yw(false);
                int i11 = ((i8 << 6) & 7168) | i9;
                wpxpbwg1j.zHl31GGXU(-382162874);
                wpxpbwg1j.zHl31GGXU(-3686930);
                boolean iiGwOFFnr8 = wpxpbwg1j.iiGwOFFnr(kdbvrtbh1);
                Object dfpT1j18n4 = wpxpbwg1j.dfpT1j18n();
                if (!iiGwOFFnr8) {
                    int i12 = rJ0s9PfCL.q3BipwRCk;
                    if (dfpT1j18n4 != P7Re99G8L.J4Ux7ym32) {
                        z = false;
                        wpxpbwg1j.ilHKhw3Yw(z);
                        kdbvrtbh12 = (kdbvrtBH1) dfpT1j18n4;
                        gLDxq5bwv.q3BipwRCk(kdbvrtbh12, new BMKn6k4cx(kdbvrtbh1, kdbvrtbh12), wpxpbwg1j);
                        if (!kdbvrtbh1.GPLPRo6go()) {
                            kdbvrtbh12.oon79WMrY(i0Zug1mVk, i0Zug1mVk2, kdbvrtbh1.vPSbyrYWX);
                        } else {
                            kdbvrtbh12.Bhmn1KIah(i0Zug1mVk2, wpxpbwg1j, ((i11 >> 6) & 14) | ((i11 >> 3) & 8));
                            ((prCJwNx2x) kdbvrtbh12.oon79WMrY).CBQ5d1kRq(Boolean.FALSE);
                        }
                        wpxpbwg1j.ilHKhw3Yw(false);
                        wpxpbwg1j.ilHKhw3Yw(false);
                        wpxpbwg1j.zHl31GGXU(-3686552);
                        iiGwOFFnr = wpxpbwg1j.iiGwOFFnr(kdbvrtbh12) | wpxpbwg1j.iiGwOFFnr(rNEcgN6dQ2);
                        Object dfpT1j18n5 = wpxpbwg1j.dfpT1j18n();
                        if (!iiGwOFFnr) {
                            int i13 = rJ0s9PfCL.q3BipwRCk;
                        }
                        dfpT1j18n5 = new EUoa3Sdf7(kdbvrtbh12, rNEcgN6dQ2, null);
                        wpxpbwg1j.INnK5Rew6(dfpT1j18n5);
                        wpxpbwg1j.ilHKhw3Yw(false);
                        gLDxq5bwv.J4Ux7ym32(kdbvrtbh12, (kkcQgCx5G) dfpT1j18n5, wpxpbwg1j);
                        int i14 = i2 >> 3;
                        i3 = (i14 & 57344) | (i14 & 112) | (i14 & 896) | (i14 & 7168);
                        wpxpbwg1j.zHl31GGXU(-918809573);
                        J4Ux7ym32 = kdbvrtbh12.J4Ux7ym32();
                        obj = AwUV2q7WY.Visible;
                        if (J4Ux7ym32 != obj || kdbvrtbh12.iiGwOFFnr() == obj) {
                            int i15 = i3 & 14;
                            wpxpbwg1j.zHl31GGXU(-3686930);
                            iiGwOFFnr2 = wpxpbwg1j.iiGwOFFnr(kdbvrtbh12);
                            Object dfpT1j18n6 = wpxpbwg1j.dfpT1j18n();
                            if (!iiGwOFFnr2) {
                                int i16 = rJ0s9PfCL.q3BipwRCk;
                            }
                            dfpT1j18n6 = new gq2zZKdsH(kdbvrtbh12);
                            wpxpbwg1j.INnK5Rew6(dfpT1j18n6);
                            wpxpbwg1j.ilHKhw3Yw(false);
                            gq2zZKdsH gq2zzkdsh4 = (gq2zZKdsH) dfpT1j18n6;
                            int i17 = i3 >> 3;
                            int i18 = i15 | 3072 | (i17 & 112) | (i17 & 896);
                            aVKpYNINy avkpyniny = KSdwgSYB6.q3BipwRCk;
                            wpxpbwg1j.zHl31GGXU(1657239113);
                            int i19 = BgIsSUB3d.Puu3Rhg4F;
                            BgIsSUB3d CBQ5d1kRq = gThLCaTO1.CBQ5d1kRq(gThLCaTO1.CBQ5d1kRq(H11ySchUh.CBQ5d1kRq, null, new smfp5NRyV(kdbvrtbh12, u51fgFYkV.iiGwOFFnr(eVoQ2RqaN.q3BipwRCk.J4Ux7ym32, wpxpbwg1j, 0), u51fgFYkV.iiGwOFFnr(jzLhkMe5F.q3BipwRCk.J4Ux7ym32, wpxpbwg1j, 0), "Built-in", 1), 1), null, new smfp5NRyV(kdbvrtbh12, u51fgFYkV.iiGwOFFnr(eVoQ2RqaN.q3BipwRCk.tGV7Q6urW, wpxpbwg1j, 0), u51fgFYkV.iiGwOFFnr(jzLhkMe5F.q3BipwRCk.tGV7Q6urW, wpxpbwg1j, 0), "Built-in", 0), 1);
                            int i20 = i18 & 14;
                            wpxpbwg1j.zHl31GGXU(-3686930);
                            iiGwOFFnr3 = wpxpbwg1j.iiGwOFFnr(kdbvrtbh12);
                            Object dfpT1j18n7 = wpxpbwg1j.dfpT1j18n();
                            if (!iiGwOFFnr3) {
                                int i21 = rJ0s9PfCL.q3BipwRCk;
                            }
                            Object dIocxURUo = u51fgFYkV.dIocxURUo(Boolean.FALSE, null, 2, null);
                            wpxpbwg1j.INnK5Rew6(dIocxURUo);
                            dfpT1j18n7 = dIocxURUo;
                            wpxpbwg1j.ilHKhw3Yw(false);
                            RNEcgN6dQ rNEcgN6dQ3 = (RNEcgN6dQ) dfpT1j18n7;
                            wpxpbwg1j.zHl31GGXU(-3686930);
                            iiGwOFFnr4 = wpxpbwg1j.iiGwOFFnr(kdbvrtbh12);
                            Object dfpT1j18n8 = wpxpbwg1j.dfpT1j18n();
                            if (!iiGwOFFnr4) {
                                int i22 = rJ0s9PfCL.q3BipwRCk;
                                if (dfpT1j18n8 != P7Re99G8L.J4Ux7ym32) {
                                    z3 = false;
                                    wpxpbwg1j.ilHKhw3Yw(z3);
                                    rNEcgN6dQ = (RNEcgN6dQ) dfpT1j18n8;
                                    if (kdbvrtbh12.J4Ux7ym32() == kdbvrtbh12.iiGwOFFnr() || kdbvrtbh12.GPLPRo6go()) {
                                        if (eVoQ2RqaN.q3BipwRCk.q3BipwRCk == null || jzLhkMe5F.q3BipwRCk.q3BipwRCk != null) {
                                            ((prCJwNx2x) rNEcgN6dQ3).CBQ5d1kRq(Boolean.TRUE);
                                        }
                                        if (eVoQ2RqaN.q3BipwRCk.dIocxURUo == null || jzLhkMe5F.q3BipwRCk.dIocxURUo != null) {
                                            bool = Boolean.TRUE;
                                        }
                                        wpxpbwg1j.zHl31GGXU(1657240548);
                                        prcjwnx2x = (prCJwNx2x) rNEcgN6dQ3;
                                        float f4 = 1.0f;
                                        if (!((Boolean) prcjwnx2x.getValue()).booleanValue()) {
                                            LHI2FvKKi lHI2FvKKi = new LHI2FvKKi(eVoQ2RqaN, jzLhkMe5F, 0);
                                            wpxpbwg1j.zHl31GGXU(-3687241);
                                            Object dfpT1j18n9 = wpxpbwg1j.dfpT1j18n();
                                            int i23 = rJ0s9PfCL.q3BipwRCk;
                                            if (dfpT1j18n9 == P7Re99G8L.J4Ux7ym32) {
                                                dfpT1j18n9 = anXlDk6fV.iMyQMM6Qj("Built-in", " alpha");
                                                wpxpbwg1j.INnK5Rew6(dfpT1j18n9);
                                            }
                                            wpxpbwg1j.ilHKhw3Yw(false);
                                            String str2 = (String) dfpT1j18n9;
                                            int i24 = i20 | 384;
                                            wpxpbwg1j.zHl31GGXU(1399891485);
                                            aVKpYNINy avkpyniny2 = NvSSsPAuJ.q3BipwRCk;
                                            int i25 = i24 & 14;
                                            int i26 = i24 << 3;
                                            int i27 = (i26 & 7168) | i25 | (i26 & 896) | (i26 & 57344);
                                            wpxpbwg1j.zHl31GGXU(1847725064);
                                            wpxpbwg1j.zHl31GGXU(-9519786);
                                            int ordinal3 = ((AwUV2q7WY) kdbvrtbh12.J4Ux7ym32()).ordinal();
                                            if (ordinal3 != 0) {
                                                if (ordinal3 != 1) {
                                                    if (ordinal3 == 2) {
                                                        gsupnchdr = jzLhkMe5F.q3BipwRCk.q3BipwRCk;
                                                    } else {
                                                        throw new dnCerKhAM();
                                                    }
                                                }
                                                f2 = 1.0f;
                                            } else {
                                                gsupnchdr = eVoQ2RqaN.q3BipwRCk.q3BipwRCk;
                                            }
                                            wpxpbwg1j.ilHKhw3Yw(false);
                                            Float valueOf = Float.valueOf(f2);
                                            wpxpbwg1j.zHl31GGXU(-9519786);
                                            int ordinal4 = ((AwUV2q7WY) kdbvrtbh12.iiGwOFFnr()).ordinal();
                                            if (ordinal4 != 0) {
                                                gq2zzkdsh3 = gq2zzkdsh4;
                                                if (ordinal4 != 1) {
                                                    if (ordinal4 == 2) {
                                                        gsupnchdr2 = jzLhkMe5F.q3BipwRCk.q3BipwRCk;
                                                    } else {
                                                        throw new dnCerKhAM();
                                                    }
                                                }
                                                f3 = 1.0f;
                                            } else {
                                                gq2zzkdsh3 = gq2zzkdsh4;
                                                gsupnchdr2 = eVoQ2RqaN.q3BipwRCk.q3BipwRCk;
                                            }
                                            wpxpbwg1j.ilHKhw3Yw(false);
                                            i4 = i20;
                                            z2 = false;
                                            str = "Built-in";
                                            bgIsSUB3d2 = CBQ5d1kRq;
                                            gq2zzkdsh = gq2zzkdsh3;
                                            uBY2Inzw8 = syekKyXqd.Puu3Rhg4F(kdbvrtbh12, valueOf, Float.valueOf(f3), (B82vleiqp) lHI2FvKKi.sk5s77z6Q(kdbvrtbh12.dIocxURUo(), wpxpbwg1j, Integer.valueOf((i27 >> 3) & 112)), avkpyniny2, str2, wpxpbwg1j, ((i27 << 6) & 458752) | (i27 & 14) | ((i27 << 9) & 57344));
                                            wpxpbwg1j.ilHKhw3Yw(false);
                                            wpxpbwg1j.ilHKhw3Yw(false);
                                        } else {
                                            i4 = i20;
                                            bgIsSUB3d2 = CBQ5d1kRq;
                                            str = "Built-in";
                                            gq2zzkdsh = gq2zzkdsh4;
                                            z2 = false;
                                            uBY2Inzw8 = KSdwgSYB6.J4Ux7ym32;
                                        }
                                        wpxpbwg1j.ilHKhw3Yw(z2);
                                        if (!((Boolean) ((prCJwNx2x) rNEcgN6dQ).getValue()).booleanValue()) {
                                            LHI2FvKKi lHI2FvKKi2 = new LHI2FvKKi(eVoQ2RqaN, jzLhkMe5F, 1);
                                            wpxpbwg1j.zHl31GGXU(-3687241);
                                            Object dfpT1j18n10 = wpxpbwg1j.dfpT1j18n();
                                            int i28 = rJ0s9PfCL.q3BipwRCk;
                                            if (dfpT1j18n10 == P7Re99G8L.J4Ux7ym32) {
                                                dfpT1j18n10 = anXlDk6fV.iMyQMM6Qj(str, " scale");
                                                wpxpbwg1j.INnK5Rew6(dfpT1j18n10);
                                            }
                                            wpxpbwg1j.ilHKhw3Yw(z2);
                                            String str3 = (String) dfpT1j18n10;
                                            int i29 = i4 | 384;
                                            wpxpbwg1j.zHl31GGXU(1399891485);
                                            aVKpYNINy avkpyniny3 = NvSSsPAuJ.q3BipwRCk;
                                            int i30 = i29 & 14;
                                            int i31 = i29 << 3;
                                            int i32 = (i31 & 57344) | i30 | (i31 & 896) | (i31 & 7168);
                                            wpxpbwg1j.zHl31GGXU(1847725064);
                                            wpxpbwg1j.zHl31GGXU(-9518895);
                                            int ordinal5 = ((AwUV2q7WY) kdbvrtbh12.J4Ux7ym32()).ordinal();
                                            if (ordinal5 != 0) {
                                                if (ordinal5 != 1) {
                                                    i5 = 2;
                                                    if (ordinal5 == 2) {
                                                        r9u1gbsbl2 = jzLhkMe5F.q3BipwRCk.dIocxURUo;
                                                    } else {
                                                        throw new dnCerKhAM();
                                                    }
                                                } else {
                                                    i5 = 2;
                                                }
                                                f = 1.0f;
                                            } else {
                                                i5 = 2;
                                                r9u1gbsbl2 = eVoQ2RqaN.q3BipwRCk.dIocxURUo;
                                            }
                                            wpxpbwg1j.ilHKhw3Yw(z2);
                                            Float valueOf2 = Float.valueOf(f);
                                            wpxpbwg1j.zHl31GGXU(-9518895);
                                            int ordinal6 = ((AwUV2q7WY) kdbvrtbh12.iiGwOFFnr()).ordinal();
                                            if (ordinal6 != 0) {
                                                if (ordinal6 != 1) {
                                                    if (ordinal6 == i5) {
                                                        r9u1gbsbl = jzLhkMe5F.q3BipwRCk.dIocxURUo;
                                                    } else {
                                                        throw new dnCerKhAM();
                                                    }
                                                }
                                                wpxpbwg1j.ilHKhw3Yw(z2);
                                                UBY2Inzw8 Puu3Rhg4F = syekKyXqd.Puu3Rhg4F(kdbvrtbh12, valueOf2, Float.valueOf(f4), (B82vleiqp) lHI2FvKKi2.sk5s77z6Q(kdbvrtbh12.dIocxURUo(), wpxpbwg1j, Integer.valueOf((i32 >> 3) & 112)), avkpyniny3, str3, wpxpbwg1j, (i32 & 14) | ((i32 << 9) & 57344) | ((i32 << 6) & 458752));
                                                wpxpbwg1j.ilHKhw3Yw(z2);
                                                wpxpbwg1j.ilHKhw3Yw(z2);
                                                if (kdbvrtbh12.J4Ux7ym32() == AwUV2q7WY.PreEnter) {
                                                    r9U1gbsBL r9u1gbsbl3 = eVoQ2RqaN.q3BipwRCk.dIocxURUo;
                                                    if (r9u1gbsbl3 == null) {
                                                        r9U1gbsBL r9u1gbsbl4 = jzLhkMe5F.q3BipwRCk.dIocxURUo;
                                                        if (r9u1gbsbl4 != null) {
                                                            wyfbJwwBZ = new WyfbJwwBZ(r9u1gbsbl4.J4Ux7ym32);
                                                        }
                                                        wyfbJwwBZ = null;
                                                    } else {
                                                        wyfbJwwBZ = new WyfbJwwBZ(r9u1gbsbl3.J4Ux7ym32);
                                                    }
                                                    aVKpYNINy avkpyniny4 = KSdwgSYB6.q3BipwRCk;
                                                    int i33 = i4 | 3136;
                                                    wpxpbwg1j.zHl31GGXU(1847725064);
                                                    wpxpbwg1j.zHl31GGXU(-9518037);
                                                    ordinal = ((AwUV2q7WY) kdbvrtbh12.J4Ux7ym32()).ordinal();
                                                    if (ordinal == 0) {
                                                        if (ordinal == 1) {
                                                            wyfbJwwBZ2 = wyfbJwwBZ;
                                                        } else if (ordinal == 2) {
                                                            r9U1gbsBL r9u1gbsbl5 = jzLhkMe5F.q3BipwRCk.dIocxURUo;
                                                            if (r9u1gbsbl5 == null) {
                                                                r9U1gbsBL r9u1gbsbl6 = eVoQ2RqaN.q3BipwRCk.dIocxURUo;
                                                                if (r9u1gbsbl6 != null) {
                                                                    wyfbJwwBZ2 = new WyfbJwwBZ(r9u1gbsbl6.J4Ux7ym32);
                                                                }
                                                                wyfbJwwBZ2 = null;
                                                            } else {
                                                                wyfbJwwBZ2 = new WyfbJwwBZ(r9u1gbsbl5.J4Ux7ym32);
                                                            }
                                                        } else {
                                                            throw new dnCerKhAM();
                                                        }
                                                        if (wyfbJwwBZ2 != null) {
                                                            ksLrMHgEz kslrmhgez = WyfbJwwBZ.J4Ux7ym32;
                                                            j = WyfbJwwBZ.tGV7Q6urW;
                                                        } else {
                                                            j = wyfbJwwBZ2.q3BipwRCk;
                                                        }
                                                        wpxpbwg1j.ilHKhw3Yw(z2);
                                                        WyfbJwwBZ wyfbJwwBZ3 = new WyfbJwwBZ(j);
                                                        wpxpbwg1j.zHl31GGXU(-9518037);
                                                        ordinal2 = ((AwUV2q7WY) kdbvrtbh12.iiGwOFFnr()).ordinal();
                                                        if (ordinal2 == 0) {
                                                            if (ordinal2 != 1) {
                                                                if (ordinal2 == 2) {
                                                                    r9U1gbsBL r9u1gbsbl7 = jzLhkMe5F.q3BipwRCk.dIocxURUo;
                                                                    if (r9u1gbsbl7 == null) {
                                                                        r9U1gbsBL r9u1gbsbl8 = eVoQ2RqaN.q3BipwRCk.dIocxURUo;
                                                                        if (r9u1gbsbl8 != null) {
                                                                            wyfbJwwBZ = new WyfbJwwBZ(r9u1gbsbl8.J4Ux7ym32);
                                                                        }
                                                                        wyfbJwwBZ = null;
                                                                    } else {
                                                                        wyfbJwwBZ = new WyfbJwwBZ(r9u1gbsbl7.J4Ux7ym32);
                                                                    }
                                                                } else {
                                                                    throw new dnCerKhAM();
                                                                }
                                                            }
                                                            if (wyfbJwwBZ != null) {
                                                                ksLrMHgEz kslrmhgez2 = WyfbJwwBZ.J4Ux7ym32;
                                                                j2 = WyfbJwwBZ.tGV7Q6urW;
                                                            } else {
                                                                j2 = wyfbJwwBZ.q3BipwRCk;
                                                            }
                                                            wpxpbwg1j.ilHKhw3Yw(z2);
                                                            WyfbJwwBZ wyfbJwwBZ4 = new WyfbJwwBZ(j2);
                                                            kdbvrtbh12.dIocxURUo();
                                                            Integer.valueOf((i33 >> 3) & 112).intValue();
                                                            wpxpbwg1j.zHl31GGXU(-251233035);
                                                            O0hQm6WVz iiGwOFFnr9 = cqKak5Wfn.iiGwOFFnr(0.0f, 0.0f, null, 7);
                                                            wpxpbwg1j.ilHKhw3Yw(z2);
                                                            UBY2Inzw8 Puu3Rhg4F2 = syekKyXqd.Puu3Rhg4F(kdbvrtbh12, wyfbJwwBZ3, wyfbJwwBZ4, iiGwOFFnr9, avkpyniny4, "TransformOriginInterruptionHandling", wpxpbwg1j, ((i33 << 6) & 458752) | (i33 & 14) | ((i33 << 9) & 57344));
                                                            wpxpbwg1j.ilHKhw3Yw(z2);
                                                            pmanMZxiM2 = new ZcRbhWzZ1(uBY2Inzw8, Puu3Rhg4F, Puu3Rhg4F2);
                                                        } else {
                                                            r9U1gbsBL r9u1gbsbl9 = eVoQ2RqaN.q3BipwRCk.dIocxURUo;
                                                            if (r9u1gbsbl9 == null) {
                                                                r9U1gbsBL r9u1gbsbl10 = jzLhkMe5F.q3BipwRCk.dIocxURUo;
                                                                if (r9u1gbsbl10 != null) {
                                                                    wyfbJwwBZ = new WyfbJwwBZ(r9u1gbsbl10.J4Ux7ym32);
                                                                }
                                                                wyfbJwwBZ = null;
                                                            } else {
                                                                wyfbJwwBZ = new WyfbJwwBZ(r9u1gbsbl9.J4Ux7ym32);
                                                            }
                                                            if (wyfbJwwBZ != null) {
                                                            }
                                                            wpxpbwg1j.ilHKhw3Yw(z2);
                                                            WyfbJwwBZ wyfbJwwBZ42 = new WyfbJwwBZ(j2);
                                                            kdbvrtbh12.dIocxURUo();
                                                            Integer.valueOf((i33 >> 3) & 112).intValue();
                                                            wpxpbwg1j.zHl31GGXU(-251233035);
                                                            O0hQm6WVz iiGwOFFnr92 = cqKak5Wfn.iiGwOFFnr(0.0f, 0.0f, null, 7);
                                                            wpxpbwg1j.ilHKhw3Yw(z2);
                                                            UBY2Inzw8 Puu3Rhg4F22 = syekKyXqd.Puu3Rhg4F(kdbvrtbh12, wyfbJwwBZ3, wyfbJwwBZ42, iiGwOFFnr92, avkpyniny4, "TransformOriginInterruptionHandling", wpxpbwg1j, ((i33 << 6) & 458752) | (i33 & 14) | ((i33 << 9) & 57344));
                                                            wpxpbwg1j.ilHKhw3Yw(z2);
                                                            pmanMZxiM2 = new ZcRbhWzZ1(uBY2Inzw8, Puu3Rhg4F, Puu3Rhg4F22);
                                                        }
                                                    } else {
                                                        r9U1gbsBL r9u1gbsbl11 = eVoQ2RqaN.q3BipwRCk.dIocxURUo;
                                                        if (r9u1gbsbl11 == null) {
                                                            r9U1gbsBL r9u1gbsbl12 = jzLhkMe5F.q3BipwRCk.dIocxURUo;
                                                            if (r9u1gbsbl12 != null) {
                                                                wyfbJwwBZ2 = new WyfbJwwBZ(r9u1gbsbl12.J4Ux7ym32);
                                                            }
                                                            wyfbJwwBZ2 = null;
                                                        } else {
                                                            wyfbJwwBZ2 = new WyfbJwwBZ(r9u1gbsbl11.J4Ux7ym32);
                                                        }
                                                        if (wyfbJwwBZ2 != null) {
                                                        }
                                                        wpxpbwg1j.ilHKhw3Yw(z2);
                                                        WyfbJwwBZ wyfbJwwBZ32 = new WyfbJwwBZ(j);
                                                        wpxpbwg1j.zHl31GGXU(-9518037);
                                                        ordinal2 = ((AwUV2q7WY) kdbvrtbh12.iiGwOFFnr()).ordinal();
                                                        if (ordinal2 == 0) {
                                                        }
                                                    }
                                                } else {
                                                    r9U1gbsBL r9u1gbsbl13 = jzLhkMe5F.q3BipwRCk.dIocxURUo;
                                                    if (r9u1gbsbl13 == null) {
                                                        r9U1gbsBL r9u1gbsbl14 = eVoQ2RqaN.q3BipwRCk.dIocxURUo;
                                                        if (r9u1gbsbl14 != null) {
                                                            wyfbJwwBZ = new WyfbJwwBZ(r9u1gbsbl14.J4Ux7ym32);
                                                        }
                                                        wyfbJwwBZ = null;
                                                    } else {
                                                        wyfbJwwBZ = new WyfbJwwBZ(r9u1gbsbl13.J4Ux7ym32);
                                                    }
                                                    aVKpYNINy avkpyniny42 = KSdwgSYB6.q3BipwRCk;
                                                    int i332 = i4 | 3136;
                                                    wpxpbwg1j.zHl31GGXU(1847725064);
                                                    wpxpbwg1j.zHl31GGXU(-9518037);
                                                    ordinal = ((AwUV2q7WY) kdbvrtbh12.J4Ux7ym32()).ordinal();
                                                    if (ordinal == 0) {
                                                    }
                                                }
                                            } else {
                                                r9u1gbsbl = eVoQ2RqaN.q3BipwRCk.dIocxURUo;
                                            }
                                        } else if (((Boolean) prcjwnx2x.getValue()).booleanValue()) {
                                            pmanMZxiM2 = new Lf9MVgEK4(uBY2Inzw8, 1);
                                        } else {
                                            bgIsSUB3d3 = bgIsSUB3d2;
                                            wpxpbwg1j.ilHKhw3Yw(z2);
                                            BgIsSUB3d WaUP0CF08 = bgIsSUB3d.WaUP0CF08(bgIsSUB3d3);
                                            wpxpbwg1j.zHl31GGXU(-3687241);
                                            dfpT1j18n = wpxpbwg1j.dfpT1j18n();
                                            int i34 = rJ0s9PfCL.q3BipwRCk;
                                            if (dfpT1j18n == P7Re99G8L.J4Ux7ym32) {
                                                gq2zzkdsh2 = gq2zzkdsh;
                                                dfpT1j18n = new ADRkKYVZo(gq2zzkdsh2);
                                                wpxpbwg1j.INnK5Rew6(dfpT1j18n);
                                            } else {
                                                gq2zzkdsh2 = gq2zzkdsh;
                                            }
                                            wpxpbwg1j.ilHKhw3Yw(z2);
                                            nBnrGO77H nbnrgo77h = (nBnrGO77H) dfpT1j18n;
                                            wpxpbwg1j.zHl31GGXU(1376089335);
                                            AU29aHa4X aU29aHa4X = (AU29aHa4X) wpxpbwg1j.oon79WMrY(PxtnQGBQi.kCA6Zs9sL);
                                            BFRsKhrQv bFRsKhrQv = (BFRsKhrQv) wpxpbwg1j.oon79WMrY(PxtnQGBQi.oon79WMrY);
                                            Objects.requireNonNull(HSwcezbks.tGV7Q6urW);
                                            gdEmqfwpT gdemqfwpt = xUKgrGMGQ.J4Ux7ym32;
                                            NzvP5Rex8 IzM1cD9ly = xpuSUT7Gh.IzM1cD9ly(WaUP0CF08);
                                            if (wpxpbwg1j.J4Ux7ym32 instanceof GX14exZ1F) {
                                                wpxpbwg1j.wIZEdYHUn();
                                                if (wpxpbwg1j.vNtjxmzUM) {
                                                    wpxpbwg1j.vPSbyrYWX(gdemqfwpt);
                                                } else {
                                                    wpxpbwg1j.ln3nf7LH3();
                                                }
                                                wpxpbwg1j.WaUP0CF08 = z2;
                                                pz7YPhQTU.WaUP0CF08(wpxpbwg1j, nbnrgo77h, xUKgrGMGQ.kCA6Zs9sL);
                                                pz7YPhQTU.WaUP0CF08(wpxpbwg1j, aU29aHa4X, xUKgrGMGQ.dIocxURUo);
                                                pz7YPhQTU.WaUP0CF08(wpxpbwg1j, bFRsKhrQv, xUKgrGMGQ.iiGwOFFnr);
                                                wpxpbwg1j.MzoOEjc4X();
                                                Object uflstis9c = new uFLsTIS9C(wpxpbwg1j);
                                                int i35 = z2 ? 1 : 0;
                                                int i36 = z2 ? 1 : 0;
                                                int i37 = z2 ? 1 : 0;
                                                int i38 = z2 ? 1 : 0;
                                                ((J9LUUfNUi) IzM1cD9ly).sk5s77z6Q(uflstis9c, wpxpbwg1j, Integer.valueOf(i35));
                                                wpxpbwg1j.zHl31GGXU(2058660585);
                                                wpxpbwg1j.zHl31GGXU(-174037785);
                                                nzvP5Rex8.sk5s77z6Q(gq2zzkdsh2, wpxpbwg1j, Integer.valueOf(((i3 >> 9) & 112) | 8));
                                                wpxpbwg1j.ilHKhw3Yw(z2);
                                                wpxpbwg1j.ilHKhw3Yw(z2);
                                                wpxpbwg1j.ilHKhw3Yw(true);
                                                wpxpbwg1j.ilHKhw3Yw(z2);
                                            } else {
                                                xpuSUT7Gh.j22ftfeNI();
                                                throw null;
                                            }
                                        }
                                        bgIsSUB3d3 = ODug2UCW1.ixWaw2akD(bgIsSUB3d2, pmanMZxiM2);
                                        wpxpbwg1j.ilHKhw3Yw(z2);
                                        BgIsSUB3d WaUP0CF082 = bgIsSUB3d.WaUP0CF08(bgIsSUB3d3);
                                        wpxpbwg1j.zHl31GGXU(-3687241);
                                        dfpT1j18n = wpxpbwg1j.dfpT1j18n();
                                        int i342 = rJ0s9PfCL.q3BipwRCk;
                                        if (dfpT1j18n == P7Re99G8L.J4Ux7ym32) {
                                        }
                                        wpxpbwg1j.ilHKhw3Yw(z2);
                                        nBnrGO77H nbnrgo77h2 = (nBnrGO77H) dfpT1j18n;
                                        wpxpbwg1j.zHl31GGXU(1376089335);
                                        AU29aHa4X aU29aHa4X2 = (AU29aHa4X) wpxpbwg1j.oon79WMrY(PxtnQGBQi.kCA6Zs9sL);
                                        BFRsKhrQv bFRsKhrQv2 = (BFRsKhrQv) wpxpbwg1j.oon79WMrY(PxtnQGBQi.oon79WMrY);
                                        Objects.requireNonNull(HSwcezbks.tGV7Q6urW);
                                        gdEmqfwpT gdemqfwpt2 = xUKgrGMGQ.J4Ux7ym32;
                                        NzvP5Rex8 IzM1cD9ly2 = xpuSUT7Gh.IzM1cD9ly(WaUP0CF082);
                                        if (wpxpbwg1j.J4Ux7ym32 instanceof GX14exZ1F) {
                                        }
                                    } else {
                                        bool = Boolean.FALSE;
                                        ((prCJwNx2x) rNEcgN6dQ3).CBQ5d1kRq(bool);
                                    }
                                    ((prCJwNx2x) rNEcgN6dQ).CBQ5d1kRq(bool);
                                    wpxpbwg1j.zHl31GGXU(1657240548);
                                    prcjwnx2x = (prCJwNx2x) rNEcgN6dQ3;
                                    float f42 = 1.0f;
                                    if (!((Boolean) prcjwnx2x.getValue()).booleanValue()) {
                                    }
                                    wpxpbwg1j.ilHKhw3Yw(z2);
                                    if (!((Boolean) ((prCJwNx2x) rNEcgN6dQ).getValue()).booleanValue()) {
                                    }
                                    bgIsSUB3d3 = ODug2UCW1.ixWaw2akD(bgIsSUB3d2, pmanMZxiM2);
                                    wpxpbwg1j.ilHKhw3Yw(z2);
                                    BgIsSUB3d WaUP0CF0822 = bgIsSUB3d.WaUP0CF08(bgIsSUB3d3);
                                    wpxpbwg1j.zHl31GGXU(-3687241);
                                    dfpT1j18n = wpxpbwg1j.dfpT1j18n();
                                    int i3422 = rJ0s9PfCL.q3BipwRCk;
                                    if (dfpT1j18n == P7Re99G8L.J4Ux7ym32) {
                                    }
                                    wpxpbwg1j.ilHKhw3Yw(z2);
                                    nBnrGO77H nbnrgo77h22 = (nBnrGO77H) dfpT1j18n;
                                    wpxpbwg1j.zHl31GGXU(1376089335);
                                    AU29aHa4X aU29aHa4X22 = (AU29aHa4X) wpxpbwg1j.oon79WMrY(PxtnQGBQi.kCA6Zs9sL);
                                    BFRsKhrQv bFRsKhrQv22 = (BFRsKhrQv) wpxpbwg1j.oon79WMrY(PxtnQGBQi.oon79WMrY);
                                    Objects.requireNonNull(HSwcezbks.tGV7Q6urW);
                                    gdEmqfwpT gdemqfwpt22 = xUKgrGMGQ.J4Ux7ym32;
                                    NzvP5Rex8 IzM1cD9ly22 = xpuSUT7Gh.IzM1cD9ly(WaUP0CF0822);
                                    if (wpxpbwg1j.J4Ux7ym32 instanceof GX14exZ1F) {
                                    }
                                }
                            }
                            Object dIocxURUo2 = u51fgFYkV.dIocxURUo(Boolean.FALSE, null, 2, null);
                            wpxpbwg1j.INnK5Rew6(dIocxURUo2);
                            dfpT1j18n8 = dIocxURUo2;
                            z3 = false;
                            wpxpbwg1j.ilHKhw3Yw(z3);
                            rNEcgN6dQ = (RNEcgN6dQ) dfpT1j18n8;
                            if (kdbvrtbh12.J4Ux7ym32() == kdbvrtbh12.iiGwOFFnr()) {
                            }
                            if (eVoQ2RqaN.q3BipwRCk.q3BipwRCk == null) {
                            }
                            ((prCJwNx2x) rNEcgN6dQ3).CBQ5d1kRq(Boolean.TRUE);
                            if (eVoQ2RqaN.q3BipwRCk.dIocxURUo == null) {
                            }
                            bool = Boolean.TRUE;
                            ((prCJwNx2x) rNEcgN6dQ).CBQ5d1kRq(bool);
                            wpxpbwg1j.zHl31GGXU(1657240548);
                            prcjwnx2x = (prCJwNx2x) rNEcgN6dQ3;
                            float f422 = 1.0f;
                            if (!((Boolean) prcjwnx2x.getValue()).booleanValue()) {
                            }
                            wpxpbwg1j.ilHKhw3Yw(z2);
                            if (!((Boolean) ((prCJwNx2x) rNEcgN6dQ).getValue()).booleanValue()) {
                            }
                            bgIsSUB3d3 = ODug2UCW1.ixWaw2akD(bgIsSUB3d2, pmanMZxiM2);
                            wpxpbwg1j.ilHKhw3Yw(z2);
                            BgIsSUB3d WaUP0CF08222 = bgIsSUB3d.WaUP0CF08(bgIsSUB3d3);
                            wpxpbwg1j.zHl31GGXU(-3687241);
                            dfpT1j18n = wpxpbwg1j.dfpT1j18n();
                            int i34222 = rJ0s9PfCL.q3BipwRCk;
                            if (dfpT1j18n == P7Re99G8L.J4Ux7ym32) {
                            }
                            wpxpbwg1j.ilHKhw3Yw(z2);
                            nBnrGO77H nbnrgo77h222 = (nBnrGO77H) dfpT1j18n;
                            wpxpbwg1j.zHl31GGXU(1376089335);
                            AU29aHa4X aU29aHa4X222 = (AU29aHa4X) wpxpbwg1j.oon79WMrY(PxtnQGBQi.kCA6Zs9sL);
                            BFRsKhrQv bFRsKhrQv222 = (BFRsKhrQv) wpxpbwg1j.oon79WMrY(PxtnQGBQi.oon79WMrY);
                            Objects.requireNonNull(HSwcezbks.tGV7Q6urW);
                            gdEmqfwpT gdemqfwpt222 = xUKgrGMGQ.J4Ux7ym32;
                            NzvP5Rex8 IzM1cD9ly222 = xpuSUT7Gh.IzM1cD9ly(WaUP0CF08222);
                            if (wpxpbwg1j.J4Ux7ym32 instanceof GX14exZ1F) {
                            }
                        } else {
                            z2 = false;
                        }
                        wpxpbwg1j.ilHKhw3Yw(z2);
                        Eeka1udhb = wpxpbwg1j.Eeka1udhb();
                        if (Eeka1udhb == null) {
                            Eeka1udhb.dIocxURUo = new lrQHoEwn7(kdbvrtbh1, pmanMZxiM, bgIsSUB3d, eVoQ2RqaN, jzLhkMe5F, nzvP5Rex8, i);
                            return;
                        }
                        return;
                    }
                }
                dfpT1j18n4 = new kdbvrtBH1(new hObCm0yul(i0Zug1mVk), ((Object) kdbvrtbh1.J4Ux7ym32) + " > EnterExitTransition");
                wpxpbwg1j.INnK5Rew6(dfpT1j18n4);
                z = false;
                wpxpbwg1j.ilHKhw3Yw(z);
                kdbvrtbh12 = (kdbvrtBH1) dfpT1j18n4;
                gLDxq5bwv.q3BipwRCk(kdbvrtbh12, new BMKn6k4cx(kdbvrtbh1, kdbvrtbh12), wpxpbwg1j);
                if (!kdbvrtbh1.GPLPRo6go()) {
                }
                wpxpbwg1j.ilHKhw3Yw(false);
                wpxpbwg1j.ilHKhw3Yw(false);
                wpxpbwg1j.zHl31GGXU(-3686552);
                iiGwOFFnr = wpxpbwg1j.iiGwOFFnr(kdbvrtbh12) | wpxpbwg1j.iiGwOFFnr(rNEcgN6dQ2);
                Object dfpT1j18n52 = wpxpbwg1j.dfpT1j18n();
                if (!iiGwOFFnr) {
                }
                dfpT1j18n52 = new EUoa3Sdf7(kdbvrtbh12, rNEcgN6dQ2, null);
                wpxpbwg1j.INnK5Rew6(dfpT1j18n52);
                wpxpbwg1j.ilHKhw3Yw(false);
                gLDxq5bwv.J4Ux7ym32(kdbvrtbh12, (kkcQgCx5G) dfpT1j18n52, wpxpbwg1j);
                int i142 = i2 >> 3;
                i3 = (i142 & 57344) | (i142 & 112) | (i142 & 896) | (i142 & 7168);
                wpxpbwg1j.zHl31GGXU(-918809573);
                J4Ux7ym32 = kdbvrtbh12.J4Ux7ym32();
                obj = AwUV2q7WY.Visible;
                if (J4Ux7ym32 != obj) {
                }
                int i152 = i3 & 14;
                wpxpbwg1j.zHl31GGXU(-3686930);
                iiGwOFFnr2 = wpxpbwg1j.iiGwOFFnr(kdbvrtbh12);
                Object dfpT1j18n62 = wpxpbwg1j.dfpT1j18n();
                if (!iiGwOFFnr2) {
                }
                dfpT1j18n62 = new gq2zZKdsH(kdbvrtbh12);
                wpxpbwg1j.INnK5Rew6(dfpT1j18n62);
                wpxpbwg1j.ilHKhw3Yw(false);
                gq2zZKdsH gq2zzkdsh42 = (gq2zZKdsH) dfpT1j18n62;
                int i172 = i3 >> 3;
                int i182 = i152 | 3072 | (i172 & 112) | (i172 & 896);
                aVKpYNINy avkpyniny5 = KSdwgSYB6.q3BipwRCk;
                wpxpbwg1j.zHl31GGXU(1657239113);
                int i192 = BgIsSUB3d.Puu3Rhg4F;
                BgIsSUB3d CBQ5d1kRq2 = gThLCaTO1.CBQ5d1kRq(gThLCaTO1.CBQ5d1kRq(H11ySchUh.CBQ5d1kRq, null, new smfp5NRyV(kdbvrtbh12, u51fgFYkV.iiGwOFFnr(eVoQ2RqaN.q3BipwRCk.J4Ux7ym32, wpxpbwg1j, 0), u51fgFYkV.iiGwOFFnr(jzLhkMe5F.q3BipwRCk.J4Ux7ym32, wpxpbwg1j, 0), "Built-in", 1), 1), null, new smfp5NRyV(kdbvrtbh12, u51fgFYkV.iiGwOFFnr(eVoQ2RqaN.q3BipwRCk.tGV7Q6urW, wpxpbwg1j, 0), u51fgFYkV.iiGwOFFnr(jzLhkMe5F.q3BipwRCk.tGV7Q6urW, wpxpbwg1j, 0), "Built-in", 0), 1);
                int i202 = i182 & 14;
                wpxpbwg1j.zHl31GGXU(-3686930);
                iiGwOFFnr3 = wpxpbwg1j.iiGwOFFnr(kdbvrtbh12);
                Object dfpT1j18n72 = wpxpbwg1j.dfpT1j18n();
                if (!iiGwOFFnr3) {
                }
                Object dIocxURUo3 = u51fgFYkV.dIocxURUo(Boolean.FALSE, null, 2, null);
                wpxpbwg1j.INnK5Rew6(dIocxURUo3);
                dfpT1j18n72 = dIocxURUo3;
                wpxpbwg1j.ilHKhw3Yw(false);
                RNEcgN6dQ rNEcgN6dQ32 = (RNEcgN6dQ) dfpT1j18n72;
                wpxpbwg1j.zHl31GGXU(-3686930);
                iiGwOFFnr4 = wpxpbwg1j.iiGwOFFnr(kdbvrtbh12);
                Object dfpT1j18n82 = wpxpbwg1j.dfpT1j18n();
                if (!iiGwOFFnr4) {
                }
                Object dIocxURUo22 = u51fgFYkV.dIocxURUo(Boolean.FALSE, null, 2, null);
                wpxpbwg1j.INnK5Rew6(dIocxURUo22);
                dfpT1j18n82 = dIocxURUo22;
                z3 = false;
                wpxpbwg1j.ilHKhw3Yw(z3);
                rNEcgN6dQ = (RNEcgN6dQ) dfpT1j18n82;
                if (kdbvrtbh12.J4Ux7ym32() == kdbvrtbh12.iiGwOFFnr()) {
                }
                if (eVoQ2RqaN.q3BipwRCk.q3BipwRCk == null) {
                }
                ((prCJwNx2x) rNEcgN6dQ32).CBQ5d1kRq(Boolean.TRUE);
                if (eVoQ2RqaN.q3BipwRCk.dIocxURUo == null) {
                }
                bool = Boolean.TRUE;
                ((prCJwNx2x) rNEcgN6dQ).CBQ5d1kRq(bool);
                wpxpbwg1j.zHl31GGXU(1657240548);
                prcjwnx2x = (prCJwNx2x) rNEcgN6dQ32;
                float f4222 = 1.0f;
                if (!((Boolean) prcjwnx2x.getValue()).booleanValue()) {
                }
                wpxpbwg1j.ilHKhw3Yw(z2);
                if (!((Boolean) ((prCJwNx2x) rNEcgN6dQ).getValue()).booleanValue()) {
                }
                bgIsSUB3d3 = ODug2UCW1.ixWaw2akD(bgIsSUB3d2, pmanMZxiM2);
                wpxpbwg1j.ilHKhw3Yw(z2);
                BgIsSUB3d WaUP0CF082222 = bgIsSUB3d.WaUP0CF08(bgIsSUB3d3);
                wpxpbwg1j.zHl31GGXU(-3687241);
                dfpT1j18n = wpxpbwg1j.dfpT1j18n();
                int i342222 = rJ0s9PfCL.q3BipwRCk;
                if (dfpT1j18n == P7Re99G8L.J4Ux7ym32) {
                }
                wpxpbwg1j.ilHKhw3Yw(z2);
                nBnrGO77H nbnrgo77h2222 = (nBnrGO77H) dfpT1j18n;
                wpxpbwg1j.zHl31GGXU(1376089335);
                AU29aHa4X aU29aHa4X2222 = (AU29aHa4X) wpxpbwg1j.oon79WMrY(PxtnQGBQi.kCA6Zs9sL);
                BFRsKhrQv bFRsKhrQv2222 = (BFRsKhrQv) wpxpbwg1j.oon79WMrY(PxtnQGBQi.oon79WMrY);
                Objects.requireNonNull(HSwcezbks.tGV7Q6urW);
                gdEmqfwpT gdemqfwpt2222 = xUKgrGMGQ.J4Ux7ym32;
                NzvP5Rex8 IzM1cD9ly2222 = xpuSUT7Gh.IzM1cD9ly(WaUP0CF082222);
                if (wpxpbwg1j.J4Ux7ym32 instanceof GX14exZ1F) {
                }
            }
        } else {
            wpxpbwg1j.igRQEZxnW();
        }
        Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x044b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b1  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final xNzBgcwLi qFBXIgpia(int i, rJ0s9PfCL rj0s9pfcl, int i2) {
        boolean z;
        boolean z2;
        xNzBgcwLi xnzbgcwli;
        int next;
        long j;
        int i3;
        char c;
        int i4;
        int i5;
        char c2;
        int i6;
        int i7;
        String str;
        String str2;
        int i8;
        int i9;
        int qVUwofr5s;
        int i10;
        String str3;
        int i11;
        boolean z3;
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.zHl31GGXU(-738265664);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        Context context = (Context) wpxpbwg1j.oon79WMrY(KApR71V3i.J4Ux7ym32);
        Resources resources = context.getResources();
        wpxpbwg1j.zHl31GGXU(-3687241);
        Object dfpT1j18n = wpxpbwg1j.dfpT1j18n();
        int i12 = rJ0s9PfCL.q3BipwRCk;
        Object obj2 = P7Re99G8L.J4Ux7ym32;
        if (dfpT1j18n == obj2) {
            dfpT1j18n = new TypedValue();
            wpxpbwg1j.INnK5Rew6(dfpT1j18n);
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        TypedValue typedValue = (TypedValue) dfpT1j18n;
        int i13 = 1;
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            if (charSequence instanceof String) {
                z3 = ((String) charSequence).endsWith(".xml");
            } else {
                z3 = r6NbD4wnj.L4EwGfXiQ(charSequence, charSequence.length() - ".xml".length(), ".xml", 0, ".xml".length(), false);
            }
            if (z3) {
                z = true;
                yicY0FhlC yicy0fhlc = null;
                if (!z) {
                    wpxpbwg1j.zHl31GGXU(-738265321);
                    Resources.Theme theme = context.getTheme();
                    wpxpbwg1j.zHl31GGXU(-995791636);
                    msAS1mvLD msas1mvld = (msAS1mvLD) wpxpbwg1j.oon79WMrY(KApR71V3i.tGV7Q6urW);
                    WVvHeoaET wVvHeoaET = new WVvHeoaET(theme, i);
                    WeakReference weakReference = (WeakReference) msas1mvld.q3BipwRCk.get(wVvHeoaET);
                    if (weakReference != null) {
                        yicy0fhlc = (yicY0FhlC) weakReference.get();
                    }
                    if (yicy0fhlc == null) {
                        XmlResourceParser xml = resources.getXml(i);
                        do {
                            next = xml.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        } else if (anXlDk6fV.tGV7Q6urW(xml.getName(), "vector")) {
                            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                            IOOiTD5XG iOOiTD5XG = new IOOiTD5XG(xml, 0, 2);
                            TypedArray tGV7Q6urW = iOOiTD5XG.tGV7Q6urW(resources, theme, asAttributeSet, EYXJ3pgeK.q3BipwRCk);
                            float ilHKhw3Yw = BBVaGLNaU.ilHKhw3Yw(tGV7Q6urW, xml, "viewportWidth", 7, 0.0f);
                            iOOiTD5XG.dIocxURUo(tGV7Q6urW.getChangingConfigurations());
                            float ilHKhw3Yw2 = BBVaGLNaU.ilHKhw3Yw(tGV7Q6urW, xml, "viewportHeight", 8, 0.0f);
                            iOOiTD5XG.dIocxURUo(tGV7Q6urW.getChangingConfigurations());
                            if (ilHKhw3Yw <= 0.0f) {
                                throw new XmlPullParserException(anXlDk6fV.iMyQMM6Qj(tGV7Q6urW.getPositionDescription(), "<VectorGraphic> tag requires viewportWidth > 0"));
                            } else if (ilHKhw3Yw2 > 0.0f) {
                                int i14 = 3;
                                float dimension = tGV7Q6urW.getDimension(3, 0.0f);
                                iOOiTD5XG.dIocxURUo(tGV7Q6urW.getChangingConfigurations());
                                float dimension2 = tGV7Q6urW.getDimension(2, 0.0f);
                                iOOiTD5XG.dIocxURUo(tGV7Q6urW.getChangingConfigurations());
                                if (tGV7Q6urW.hasValue(1)) {
                                    TypedValue typedValue2 = new TypedValue();
                                    tGV7Q6urW.getValue(1, typedValue2);
                                    if (typedValue2.type != 2) {
                                        ColorStateList PSTqBLTET = BBVaGLNaU.PSTqBLTET(tGV7Q6urW, xml, theme, "tint", 1);
                                        iOOiTD5XG.dIocxURUo(tGV7Q6urW.getChangingConfigurations());
                                        if (PSTqBLTET != null) {
                                            j = xpuSUT7Gh.tGV7Q6urW(PSTqBLTET.getDefaultColor());
                                            i3 = tGV7Q6urW.getInt(6, -1);
                                            iOOiTD5XG.dIocxURUo(tGV7Q6urW.getChangingConfigurations());
                                            c = '\t';
                                            i4 = 5;
                                            if (i3 != -1) {
                                                if (i3 == 3) {
                                                    ksLrMHgEz kslrmhgez = KtdRQT1Je.q3BipwRCk;
                                                    ksLrMHgEz kslrmhgez2 = KtdRQT1Je.q3BipwRCk;
                                                    i5 = 3;
                                                } else if (i3 != 5) {
                                                    if (i3 != 9) {
                                                        ksLrMHgEz kslrmhgez3 = KtdRQT1Je.q3BipwRCk;
                                                        switch (i3) {
                                                            case 14:
                                                                ksLrMHgEz kslrmhgez4 = KtdRQT1Je.q3BipwRCk;
                                                                i11 = 13;
                                                                break;
                                                            case 15:
                                                                ksLrMHgEz kslrmhgez5 = KtdRQT1Je.q3BipwRCk;
                                                                i11 = 14;
                                                                break;
                                                            case 16:
                                                                ksLrMHgEz kslrmhgez6 = KtdRQT1Je.q3BipwRCk;
                                                                i11 = 12;
                                                                break;
                                                            default:
                                                                ksLrMHgEz kslrmhgez7 = KtdRQT1Je.q3BipwRCk;
                                                                i5 = 5;
                                                                break;
                                                        }
                                                    } else {
                                                        ksLrMHgEz kslrmhgez8 = KtdRQT1Je.q3BipwRCk;
                                                        ksLrMHgEz kslrmhgez9 = KtdRQT1Je.q3BipwRCk;
                                                        i11 = 9;
                                                    }
                                                    i5 = i11;
                                                }
                                                tGV7Q6urW.recycle();
                                                XQv1Q2Zj2 xQv1Q2Zj2 = new XQv1Q2Zj2(null, dimension / resources.getDisplayMetrics().density, dimension2 / resources.getDisplayMetrics().density, ilHKhw3Yw, ilHKhw3Yw2, j, i5, 1);
                                                int i15 = 0;
                                                while (true) {
                                                    if (((xml.getEventType() != i13 || (xml.getDepth() < i13 && xml.getEventType() == i14)) ? i13 : 0) == 0) {
                                                        int eventType = iOOiTD5XG.q3BipwRCk.getEventType();
                                                        if (eventType != 2) {
                                                            if (eventType == i14 && anXlDk6fV.tGV7Q6urW("group", iOOiTD5XG.q3BipwRCk.getName())) {
                                                                int i16 = i15 + 1;
                                                                for (int i17 = 0; i17 < i16; i17++) {
                                                                    xQv1Q2Zj2.iiGwOFFnr();
                                                                }
                                                                c2 = c;
                                                                i7 = i13;
                                                                i6 = i14;
                                                                i15 = 0;
                                                                xml.next();
                                                                i13 = i7;
                                                                i14 = i6;
                                                                c = c2;
                                                                i4 = 5;
                                                            }
                                                            c2 = c;
                                                            i7 = i13;
                                                            i6 = i14;
                                                            xml.next();
                                                            i13 = i7;
                                                            i14 = i6;
                                                            c = c2;
                                                            i4 = 5;
                                                        } else {
                                                            String name = iOOiTD5XG.q3BipwRCk.getName();
                                                            if (name != null) {
                                                                int hashCode = name.hashCode();
                                                                if (hashCode != -1649314686) {
                                                                    if (hashCode != 3433509) {
                                                                        if (hashCode == 98629247 && name.equals("group")) {
                                                                            TypedArray tGV7Q6urW2 = iOOiTD5XG.tGV7Q6urW(resources, theme, asAttributeSet, EYXJ3pgeK.J4Ux7ym32);
                                                                            float ilHKhw3Yw3 = BBVaGLNaU.ilHKhw3Yw(tGV7Q6urW2, iOOiTD5XG.q3BipwRCk, "rotation", i4, 0.0f);
                                                                            iOOiTD5XG.dIocxURUo(tGV7Q6urW2.getChangingConfigurations());
                                                                            float f = tGV7Q6urW2.getFloat(i13, 0.0f);
                                                                            iOOiTD5XG.dIocxURUo(tGV7Q6urW2.getChangingConfigurations());
                                                                            float f2 = tGV7Q6urW2.getFloat(2, 0.0f);
                                                                            iOOiTD5XG.dIocxURUo(tGV7Q6urW2.getChangingConfigurations());
                                                                            float ilHKhw3Yw4 = BBVaGLNaU.ilHKhw3Yw(tGV7Q6urW2, iOOiTD5XG.q3BipwRCk, "scaleX", i14, 1.0f);
                                                                            iOOiTD5XG.dIocxURUo(tGV7Q6urW2.getChangingConfigurations());
                                                                            float ilHKhw3Yw5 = BBVaGLNaU.ilHKhw3Yw(tGV7Q6urW2, iOOiTD5XG.q3BipwRCk, "scaleY", 4, 1.0f);
                                                                            iOOiTD5XG.dIocxURUo(tGV7Q6urW2.getChangingConfigurations());
                                                                            float ilHKhw3Yw6 = BBVaGLNaU.ilHKhw3Yw(tGV7Q6urW2, iOOiTD5XG.q3BipwRCk, "translateX", 6, 0.0f);
                                                                            iOOiTD5XG.dIocxURUo(tGV7Q6urW2.getChangingConfigurations());
                                                                            float ilHKhw3Yw7 = BBVaGLNaU.ilHKhw3Yw(tGV7Q6urW2, iOOiTD5XG.q3BipwRCk, "translateY", 7, 0.0f);
                                                                            iOOiTD5XG.dIocxURUo(tGV7Q6urW2.getChangingConfigurations());
                                                                            String J4Ux7ym32 = iOOiTD5XG.J4Ux7ym32(tGV7Q6urW2, 0);
                                                                            if (J4Ux7ym32 == null) {
                                                                                str3 = "";
                                                                            } else {
                                                                                str3 = J4Ux7ym32;
                                                                            }
                                                                            tGV7Q6urW2.recycle();
                                                                            int i18 = fpjpWAHwn.q3BipwRCk;
                                                                            xQv1Q2Zj2.q3BipwRCk(str3, ilHKhw3Yw3, f, f2, ilHKhw3Yw4, ilHKhw3Yw5, ilHKhw3Yw6, ilHKhw3Yw7, Dqz1pJHWH.CBQ5d1kRq);
                                                                        }
                                                                    } else if (name.equals("path")) {
                                                                        TypedArray tGV7Q6urW3 = iOOiTD5XG.tGV7Q6urW(resources, theme, asAttributeSet, EYXJ3pgeK.tGV7Q6urW);
                                                                        if (BBVaGLNaU.iMyQMM6Qj(iOOiTD5XG.q3BipwRCk, "pathData")) {
                                                                            String J4Ux7ym322 = iOOiTD5XG.J4Ux7ym32(tGV7Q6urW3, 0);
                                                                            if (J4Ux7ym322 == null) {
                                                                                str2 = "";
                                                                            } else {
                                                                                str2 = J4Ux7ym322;
                                                                            }
                                                                            List q3BipwRCk = fpjpWAHwn.q3BipwRCk(iOOiTD5XG.J4Ux7ym32(tGV7Q6urW3, 2));
                                                                            i6 = 3;
                                                                            QuZ1OlV57 q3BipwRCk2 = iOOiTD5XG.q3BipwRCk(tGV7Q6urW3, theme, "fillColor", 1, 0);
                                                                            float ilHKhw3Yw8 = BBVaGLNaU.ilHKhw3Yw(tGV7Q6urW3, iOOiTD5XG.q3BipwRCk, "fillAlpha", 12, 1.0f);
                                                                            iOOiTD5XG.dIocxURUo(tGV7Q6urW3.getChangingConfigurations());
                                                                            int qVUwofr5s2 = BBVaGLNaU.qVUwofr5s(tGV7Q6urW3, iOOiTD5XG.q3BipwRCk, "strokeLineCap", 8, -1);
                                                                            iOOiTD5XG.dIocxURUo(tGV7Q6urW3.getChangingConfigurations());
                                                                            if (qVUwofr5s2 != 0) {
                                                                                i9 = 2;
                                                                                if (qVUwofr5s2 == 1) {
                                                                                    i8 = 1;
                                                                                } else if (qVUwofr5s2 == 2) {
                                                                                    i8 = 2;
                                                                                }
                                                                                int qVUwofr5s3 = BBVaGLNaU.qVUwofr5s(tGV7Q6urW3, iOOiTD5XG.q3BipwRCk, "strokeLineJoin", 9, -1);
                                                                                iOOiTD5XG.dIocxURUo(tGV7Q6urW3.getChangingConfigurations());
                                                                                int i19 = qVUwofr5s3 == 0 ? qVUwofr5s3 != 1 ? i9 : 1 : 0;
                                                                                float ilHKhw3Yw9 = BBVaGLNaU.ilHKhw3Yw(tGV7Q6urW3, iOOiTD5XG.q3BipwRCk, "strokeMiterLimit", 10, 1.0f);
                                                                                iOOiTD5XG.dIocxURUo(tGV7Q6urW3.getChangingConfigurations());
                                                                                c2 = '\t';
                                                                                QuZ1OlV57 q3BipwRCk3 = iOOiTD5XG.q3BipwRCk(tGV7Q6urW3, theme, "strokeColor", 3, 0);
                                                                                float ilHKhw3Yw10 = BBVaGLNaU.ilHKhw3Yw(tGV7Q6urW3, iOOiTD5XG.q3BipwRCk, "strokeAlpha", 11, 1.0f);
                                                                                iOOiTD5XG.dIocxURUo(tGV7Q6urW3.getChangingConfigurations());
                                                                                float ilHKhw3Yw11 = BBVaGLNaU.ilHKhw3Yw(tGV7Q6urW3, iOOiTD5XG.q3BipwRCk, "strokeWidth", 4, 1.0f);
                                                                                iOOiTD5XG.dIocxURUo(tGV7Q6urW3.getChangingConfigurations());
                                                                                float ilHKhw3Yw12 = BBVaGLNaU.ilHKhw3Yw(tGV7Q6urW3, iOOiTD5XG.q3BipwRCk, "trimPathEnd", 6, 1.0f);
                                                                                iOOiTD5XG.dIocxURUo(tGV7Q6urW3.getChangingConfigurations());
                                                                                float ilHKhw3Yw13 = BBVaGLNaU.ilHKhw3Yw(tGV7Q6urW3, iOOiTD5XG.q3BipwRCk, "trimPathOffset", 7, 0.0f);
                                                                                iOOiTD5XG.dIocxURUo(tGV7Q6urW3.getChangingConfigurations());
                                                                                float ilHKhw3Yw14 = BBVaGLNaU.ilHKhw3Yw(tGV7Q6urW3, iOOiTD5XG.q3BipwRCk, "trimPathStart", 5, 0.0f);
                                                                                iOOiTD5XG.dIocxURUo(tGV7Q6urW3.getChangingConfigurations());
                                                                                qVUwofr5s = BBVaGLNaU.qVUwofr5s(tGV7Q6urW3, iOOiTD5XG.q3BipwRCk, "fillType", 13, 0);
                                                                                iOOiTD5XG.dIocxURUo(tGV7Q6urW3.getChangingConfigurations());
                                                                                tGV7Q6urW3.recycle();
                                                                                bZmnXN812 q3BipwRCk4 = AQOR4pZOP.q3BipwRCk(q3BipwRCk2);
                                                                                bZmnXN812 q3BipwRCk5 = AQOR4pZOP.q3BipwRCk(q3BipwRCk3);
                                                                                ksLrMHgEz kslrmhgez10 = BM5bZVvAe.J4Ux7ym32;
                                                                                if (qVUwofr5s != 0) {
                                                                                    ksLrMHgEz kslrmhgez11 = BM5bZVvAe.J4Ux7ym32;
                                                                                    i10 = 0;
                                                                                } else {
                                                                                    ksLrMHgEz kslrmhgez12 = BM5bZVvAe.J4Ux7ym32;
                                                                                    i10 = 1;
                                                                                }
                                                                                xQv1Q2Zj2.J4Ux7ym32(q3BipwRCk, i10, str2, q3BipwRCk4, ilHKhw3Yw8, q3BipwRCk5, ilHKhw3Yw10, ilHKhw3Yw11, i8, i19, ilHKhw3Yw9, ilHKhw3Yw14, ilHKhw3Yw12, ilHKhw3Yw13);
                                                                            } else {
                                                                                i9 = 2;
                                                                            }
                                                                            i8 = 0;
                                                                            int qVUwofr5s32 = BBVaGLNaU.qVUwofr5s(tGV7Q6urW3, iOOiTD5XG.q3BipwRCk, "strokeLineJoin", 9, -1);
                                                                            iOOiTD5XG.dIocxURUo(tGV7Q6urW3.getChangingConfigurations());
                                                                            if (qVUwofr5s32 == 0) {
                                                                            }
                                                                            float ilHKhw3Yw92 = BBVaGLNaU.ilHKhw3Yw(tGV7Q6urW3, iOOiTD5XG.q3BipwRCk, "strokeMiterLimit", 10, 1.0f);
                                                                            iOOiTD5XG.dIocxURUo(tGV7Q6urW3.getChangingConfigurations());
                                                                            c2 = '\t';
                                                                            QuZ1OlV57 q3BipwRCk32 = iOOiTD5XG.q3BipwRCk(tGV7Q6urW3, theme, "strokeColor", 3, 0);
                                                                            float ilHKhw3Yw102 = BBVaGLNaU.ilHKhw3Yw(tGV7Q6urW3, iOOiTD5XG.q3BipwRCk, "strokeAlpha", 11, 1.0f);
                                                                            iOOiTD5XG.dIocxURUo(tGV7Q6urW3.getChangingConfigurations());
                                                                            float ilHKhw3Yw112 = BBVaGLNaU.ilHKhw3Yw(tGV7Q6urW3, iOOiTD5XG.q3BipwRCk, "strokeWidth", 4, 1.0f);
                                                                            iOOiTD5XG.dIocxURUo(tGV7Q6urW3.getChangingConfigurations());
                                                                            float ilHKhw3Yw122 = BBVaGLNaU.ilHKhw3Yw(tGV7Q6urW3, iOOiTD5XG.q3BipwRCk, "trimPathEnd", 6, 1.0f);
                                                                            iOOiTD5XG.dIocxURUo(tGV7Q6urW3.getChangingConfigurations());
                                                                            float ilHKhw3Yw132 = BBVaGLNaU.ilHKhw3Yw(tGV7Q6urW3, iOOiTD5XG.q3BipwRCk, "trimPathOffset", 7, 0.0f);
                                                                            iOOiTD5XG.dIocxURUo(tGV7Q6urW3.getChangingConfigurations());
                                                                            float ilHKhw3Yw142 = BBVaGLNaU.ilHKhw3Yw(tGV7Q6urW3, iOOiTD5XG.q3BipwRCk, "trimPathStart", 5, 0.0f);
                                                                            iOOiTD5XG.dIocxURUo(tGV7Q6urW3.getChangingConfigurations());
                                                                            qVUwofr5s = BBVaGLNaU.qVUwofr5s(tGV7Q6urW3, iOOiTD5XG.q3BipwRCk, "fillType", 13, 0);
                                                                            iOOiTD5XG.dIocxURUo(tGV7Q6urW3.getChangingConfigurations());
                                                                            tGV7Q6urW3.recycle();
                                                                            bZmnXN812 q3BipwRCk42 = AQOR4pZOP.q3BipwRCk(q3BipwRCk2);
                                                                            bZmnXN812 q3BipwRCk52 = AQOR4pZOP.q3BipwRCk(q3BipwRCk32);
                                                                            ksLrMHgEz kslrmhgez102 = BM5bZVvAe.J4Ux7ym32;
                                                                            if (qVUwofr5s != 0) {
                                                                            }
                                                                            xQv1Q2Zj2.J4Ux7ym32(q3BipwRCk, i10, str2, q3BipwRCk42, ilHKhw3Yw8, q3BipwRCk52, ilHKhw3Yw102, ilHKhw3Yw112, i8, i19, ilHKhw3Yw92, ilHKhw3Yw142, ilHKhw3Yw122, ilHKhw3Yw132);
                                                                        } else {
                                                                            throw new IllegalArgumentException("No path data available");
                                                                        }
                                                                    }
                                                                    i7 = i13;
                                                                    i6 = i14;
                                                                    c2 = '\t';
                                                                    xml.next();
                                                                    i13 = i7;
                                                                    i14 = i6;
                                                                    c = c2;
                                                                    i4 = 5;
                                                                } else {
                                                                    c2 = c;
                                                                    i6 = i14;
                                                                    if (name.equals("clip-path")) {
                                                                        TypedArray tGV7Q6urW4 = iOOiTD5XG.tGV7Q6urW(resources, theme, asAttributeSet, EYXJ3pgeK.dIocxURUo);
                                                                        String J4Ux7ym323 = iOOiTD5XG.J4Ux7ym32(tGV7Q6urW4, 0);
                                                                        if (J4Ux7ym323 == null) {
                                                                            str = "";
                                                                        } else {
                                                                            str = J4Ux7ym323;
                                                                        }
                                                                        i7 = 1;
                                                                        List q3BipwRCk6 = fpjpWAHwn.q3BipwRCk(iOOiTD5XG.J4Ux7ym32(tGV7Q6urW4, 1));
                                                                        tGV7Q6urW4.recycle();
                                                                        xQv1Q2Zj2.q3BipwRCk(str, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, q3BipwRCk6);
                                                                        i15++;
                                                                        xml.next();
                                                                        i13 = i7;
                                                                        i14 = i6;
                                                                        c = c2;
                                                                        i4 = 5;
                                                                    }
                                                                }
                                                                i7 = 1;
                                                                xml.next();
                                                                i13 = i7;
                                                                i14 = i6;
                                                                c = c2;
                                                                i4 = 5;
                                                            }
                                                            c2 = c;
                                                            i7 = i13;
                                                            i6 = i14;
                                                            xml.next();
                                                            i13 = i7;
                                                            i14 = i6;
                                                            c = c2;
                                                            i4 = 5;
                                                        }
                                                    } else {
                                                        yicy0fhlc = new yicY0FhlC(xQv1Q2Zj2.kCA6Zs9sL(), iOOiTD5XG.J4Ux7ym32);
                                                        msas1mvld.q3BipwRCk.put(wVvHeoaET, new WeakReference(yicy0fhlc));
                                                    }
                                                }
                                            }
                                            ksLrMHgEz kslrmhgez13 = KtdRQT1Je.q3BipwRCk;
                                            ksLrMHgEz kslrmhgez72 = KtdRQT1Je.q3BipwRCk;
                                            i5 = 5;
                                            tGV7Q6urW.recycle();
                                            XQv1Q2Zj2 xQv1Q2Zj22 = new XQv1Q2Zj2(null, dimension / resources.getDisplayMetrics().density, dimension2 / resources.getDisplayMetrics().density, ilHKhw3Yw, ilHKhw3Yw2, j, i5, 1);
                                            int i152 = 0;
                                            while (true) {
                                                if (((xml.getEventType() != i13 || (xml.getDepth() < i13 && xml.getEventType() == i14)) ? i13 : 0) == 0) {
                                                }
                                                xml.next();
                                                i13 = i7;
                                                i14 = i6;
                                                c = c2;
                                                i4 = 5;
                                            }
                                        }
                                    }
                                }
                                JhpbRXxsg jhpbRXxsg = bO2dbmrf7.J4Ux7ym32;
                                j = bO2dbmrf7.Puu3Rhg4F;
                                i3 = tGV7Q6urW.getInt(6, -1);
                                iOOiTD5XG.dIocxURUo(tGV7Q6urW.getChangingConfigurations());
                                c = '\t';
                                i4 = 5;
                                if (i3 != -1) {
                                }
                                ksLrMHgEz kslrmhgez132 = KtdRQT1Je.q3BipwRCk;
                                ksLrMHgEz kslrmhgez722 = KtdRQT1Je.q3BipwRCk;
                                i5 = 5;
                                tGV7Q6urW.recycle();
                                XQv1Q2Zj2 xQv1Q2Zj222 = new XQv1Q2Zj2(null, dimension / resources.getDisplayMetrics().density, dimension2 / resources.getDisplayMetrics().density, ilHKhw3Yw, ilHKhw3Yw2, j, i5, 1);
                                int i1522 = 0;
                                while (true) {
                                    if (((xml.getEventType() != i13 || (xml.getDepth() < i13 && xml.getEventType() == i14)) ? i13 : 0) == 0) {
                                    }
                                    xml.next();
                                    i13 = i7;
                                    i14 = i6;
                                    c = c2;
                                    i4 = 5;
                                }
                            } else {
                                throw new XmlPullParserException(anXlDk6fV.iMyQMM6Qj(tGV7Q6urW.getPositionDescription(), "<VectorGraphic> tag requires viewportHeight > 0"));
                            }
                        } else {
                            throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG");
                        }
                    }
                    vdahrAJJh vdahrajjh = yicy0fhlc.q3BipwRCk;
                    wpxpbwg1j.ilHKhw3Yw(false);
                    xnzbgcwli = xpuSUT7Gh.KBYw84i3W(vdahrajjh, wpxpbwg1j);
                    wpxpbwg1j.ilHKhw3Yw(false);
                    z2 = false;
                } else {
                    wpxpbwg1j.zHl31GGXU(-738265196);
                    Integer valueOf = Integer.valueOf(i);
                    wpxpbwg1j.zHl31GGXU(-3686552);
                    boolean iiGwOFFnr = wpxpbwg1j.iiGwOFFnr(valueOf) | wpxpbwg1j.iiGwOFFnr(charSequence);
                    Object dfpT1j18n2 = wpxpbwg1j.dfpT1j18n();
                    if (iiGwOFFnr || dfpT1j18n2 == obj2) {
                        int i20 = Y3ibtOJiE.q3BipwRCk;
                        Drawable drawable = resources.getDrawable(i, null);
                        Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                        dfpT1j18n2 = new tNgdvtcFW(((BitmapDrawable) drawable).getBitmap());
                        wpxpbwg1j.INnK5Rew6(dfpT1j18n2);
                    }
                    wpxpbwg1j.ilHKhw3Yw(false);
                    Y3ibtOJiE y3ibtOJiE = (Y3ibtOJiE) dfpT1j18n2;
                    joOFKdxvJ joofkdxvj = ZtJSMDYDl.J4Ux7ym32;
                    tNgdvtcFW tngdvtcfw = (tNgdvtcFW) y3ibtOJiE;
                    xnzbgcwli = new Xmo2tfT6i(y3ibtOJiE, ZtJSMDYDl.tGV7Q6urW, D3DEikrvb.dIocxURUo(tngdvtcfw.J4Ux7ym32(), tngdvtcfw.q3BipwRCk()), null);
                    z2 = false;
                    wpxpbwg1j.ilHKhw3Yw(false);
                }
                wpxpbwg1j.ilHKhw3Yw(z2);
                return xnzbgcwli;
            }
        }
        z = false;
        yicY0FhlC yicy0fhlc2 = null;
        if (!z) {
        }
        wpxpbwg1j.ilHKhw3Yw(z2);
        return xnzbgcwli;
    }

    public static final boolean qVUwofr5s(KB2jjcOAK kB2jjcOAK, boolean z) {
        boolean qVUwofr5s;
        ftmnXRQmW ftmnxrqmw = ftmnXRQmW.Inactive;
        int ordinal = kB2jjcOAK.D91ZKn9BG().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                KB2jjcOAK pwwzaxl9D = kB2jjcOAK.pwwzaxl9D();
                if (pwwzaxl9D != null) {
                    qVUwofr5s = qVUwofr5s(pwwzaxl9D, z);
                    if (!qVUwofr5s) {
                        return qVUwofr5s;
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        KB2jjcOAK pwwzaxl9D2 = kB2jjcOAK.pwwzaxl9D();
                        if (pwwzaxl9D2 != null) {
                            qVUwofr5s = qVUwofr5s(pwwzaxl9D2, z);
                            if (!qVUwofr5s) {
                                return qVUwofr5s;
                            }
                            ftmnxrqmw = ftmnXRQmW.Deactivated;
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else if (ordinal != 5) {
                        throw new dnCerKhAM();
                    }
                }
            } else if (!z) {
                return z;
            } else {
                ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).CBQ5d1kRq = ftmnxrqmw;
                kB2jjcOAK.DEe4ujgEA(ftmnxrqmw);
                return z;
            }
            ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).CBQ5d1kRq = ftmnxrqmw;
            kB2jjcOAK.DEe4ujgEA(ftmnxrqmw);
            kB2jjcOAK.zH62iiANw(null);
            return qVUwofr5s;
        }
        ((PKYIHi40H) kB2jjcOAK.NyWTwPF6V).CBQ5d1kRq = ftmnxrqmw;
        kB2jjcOAK.DEe4ujgEA(ftmnxrqmw);
        return true;
    }

    public static final u1Gs6N2OQ sk5s77z6Q(List list, int i) {
        int size = list.size() - 1;
        if (size < 0) {
            return null;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (((u1Gs6N2OQ) list.get(i2)).CBQ5d1kRq == i) {
                return (u1Gs6N2OQ) list.get(i2);
            }
            if (i3 > size) {
                return null;
            }
            i2 = i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void tGV7Q6urW(boolean z, BgIsSUB3d bgIsSUB3d, EVoQ2RqaN eVoQ2RqaN, JzLhkMe5F jzLhkMe5F, String str, NzvP5Rex8 nzvP5Rex8, rJ0s9PfCL rj0s9pfcl, int i, int i2) {
        int i3;
        BgIsSUB3d bgIsSUB3d2;
        int i4;
        EVoQ2RqaN eVoQ2RqaN2;
        int i5;
        JzLhkMe5F jzLhkMe5F2;
        int i6;
        String str2;
        String str3;
        JzLhkMe5F jzLhkMe5F3;
        BgIsSUB3d bgIsSUB3d3;
        rESgwfV20 Eeka1udhb;
        EVoQ2RqaN eVoQ2RqaN3;
        int i7;
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(1844970278);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (wpxpbwg1j.GPLPRo6go(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            bgIsSUB3d2 = bgIsSUB3d;
            i3 |= wpxpbwg1j.iiGwOFFnr(bgIsSUB3d2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                eVoQ2RqaN2 = eVoQ2RqaN;
                i3 |= wpxpbwg1j.iiGwOFFnr(eVoQ2RqaN2) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 7168) == 0) {
                    jzLhkMe5F2 = jzLhkMe5F;
                    i3 |= wpxpbwg1j.iiGwOFFnr(jzLhkMe5F2) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 57344) == 0) {
                        str2 = str;
                        i3 |= wpxpbwg1j.iiGwOFFnr(str2) ? 16384 : 8192;
                        if ((i2 & 32) != 0) {
                            i3 |= 196608;
                        } else if ((i & 458752) == 0) {
                            i3 |= wpxpbwg1j.iiGwOFFnr(nzvP5Rex8) ? 131072 : 65536;
                            if (((374491 & i3) ^ 74898) == 0) {
                                wpXpbWG1J wpxpbwg1j2 = wpxpbwg1j;
                                if (wpxpbwg1j2.i8XZMQc6Z()) {
                                    wpxpbwg1j2.igRQEZxnW();
                                    bgIsSUB3d3 = bgIsSUB3d2;
                                    jzLhkMe5F3 = jzLhkMe5F2;
                                    str3 = str2;
                                    Eeka1udhb = wpxpbwg1j.Eeka1udhb();
                                    if (Eeka1udhb != null) {
                                        Eeka1udhb.dIocxURUo = new AY7xHMUYC(z, bgIsSUB3d3, eVoQ2RqaN2, jzLhkMe5F3, str3, nzvP5Rex8, i, i2);
                                        return;
                                    }
                                    return;
                                }
                            }
                            if (i8 == 0) {
                                int i9 = BgIsSUB3d.Puu3Rhg4F;
                                bgIsSUB3d3 = H11ySchUh.CBQ5d1kRq;
                            } else {
                                bgIsSUB3d3 = bgIsSUB3d2;
                            }
                            if (i4 == 0) {
                                eVoQ2RqaN3 = KSdwgSYB6.dIocxURUo(null, 0.0f, 3).q3BipwRCk(KSdwgSYB6.tGV7Q6urW(null, null, false, null, 15));
                                i7 = 15;
                            } else {
                                i7 = 15;
                                eVoQ2RqaN3 = eVoQ2RqaN2;
                            }
                            jzLhkMe5F3 = i5 == 0 ? KSdwgSYB6.yWvV4ePLl(null, null, false, null, i7).q3BipwRCk(KSdwgSYB6.kCA6Zs9sL(null, 0.0f, 3)) : jzLhkMe5F2;
                            str3 = i6 == 0 ? "AnimatedVisibility" : str2;
                            int i10 = i3 << 3;
                            q3BipwRCk(syekKyXqd.PSTqBLTET(Boolean.valueOf(z), str3, wpxpbwg1j, (i3 & 14) | ((i3 >> 9) & 112), 0), X6i9Y71Z6.kmSgne1rO, bgIsSUB3d3, eVoQ2RqaN3, jzLhkMe5F3, nzvP5Rex8, wpxpbwg1j, (i3 & 458752) | (i10 & 57344) | (i10 & 896) | 48 | (i10 & 7168));
                            eVoQ2RqaN2 = eVoQ2RqaN3;
                            Eeka1udhb = wpxpbwg1j.Eeka1udhb();
                            if (Eeka1udhb != null) {
                            }
                        }
                        if (((374491 & i3) ^ 74898) == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        int i102 = i3 << 3;
                        q3BipwRCk(syekKyXqd.PSTqBLTET(Boolean.valueOf(z), str3, wpxpbwg1j, (i3 & 14) | ((i3 >> 9) & 112), 0), X6i9Y71Z6.kmSgne1rO, bgIsSUB3d3, eVoQ2RqaN3, jzLhkMe5F3, nzvP5Rex8, wpxpbwg1j, (i3 & 458752) | (i102 & 57344) | (i102 & 896) | 48 | (i102 & 7168));
                        eVoQ2RqaN2 = eVoQ2RqaN3;
                        Eeka1udhb = wpxpbwg1j.Eeka1udhb();
                        if (Eeka1udhb != null) {
                        }
                    }
                    str2 = str;
                    if ((i2 & 32) != 0) {
                    }
                    if (((374491 & i3) ^ 74898) == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    int i1022 = i3 << 3;
                    q3BipwRCk(syekKyXqd.PSTqBLTET(Boolean.valueOf(z), str3, wpxpbwg1j, (i3 & 14) | ((i3 >> 9) & 112), 0), X6i9Y71Z6.kmSgne1rO, bgIsSUB3d3, eVoQ2RqaN3, jzLhkMe5F3, nzvP5Rex8, wpxpbwg1j, (i3 & 458752) | (i1022 & 57344) | (i1022 & 896) | 48 | (i1022 & 7168));
                    eVoQ2RqaN2 = eVoQ2RqaN3;
                    Eeka1udhb = wpxpbwg1j.Eeka1udhb();
                    if (Eeka1udhb != null) {
                    }
                }
                jzLhkMe5F2 = jzLhkMe5F;
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                str2 = str;
                if ((i2 & 32) != 0) {
                }
                if (((374491 & i3) ^ 74898) == 0) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                int i10222 = i3 << 3;
                q3BipwRCk(syekKyXqd.PSTqBLTET(Boolean.valueOf(z), str3, wpxpbwg1j, (i3 & 14) | ((i3 >> 9) & 112), 0), X6i9Y71Z6.kmSgne1rO, bgIsSUB3d3, eVoQ2RqaN3, jzLhkMe5F3, nzvP5Rex8, wpxpbwg1j, (i3 & 458752) | (i10222 & 57344) | (i10222 & 896) | 48 | (i10222 & 7168));
                eVoQ2RqaN2 = eVoQ2RqaN3;
                Eeka1udhb = wpxpbwg1j.Eeka1udhb();
                if (Eeka1udhb != null) {
                }
            }
            eVoQ2RqaN2 = eVoQ2RqaN;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            jzLhkMe5F2 = jzLhkMe5F;
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            str2 = str;
            if ((i2 & 32) != 0) {
            }
            if (((374491 & i3) ^ 74898) == 0) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (i6 == 0) {
            }
            int i102222 = i3 << 3;
            q3BipwRCk(syekKyXqd.PSTqBLTET(Boolean.valueOf(z), str3, wpxpbwg1j, (i3 & 14) | ((i3 >> 9) & 112), 0), X6i9Y71Z6.kmSgne1rO, bgIsSUB3d3, eVoQ2RqaN3, jzLhkMe5F3, nzvP5Rex8, wpxpbwg1j, (i3 & 458752) | (i102222 & 57344) | (i102222 & 896) | 48 | (i102222 & 7168));
            eVoQ2RqaN2 = eVoQ2RqaN3;
            Eeka1udhb = wpxpbwg1j.Eeka1udhb();
            if (Eeka1udhb != null) {
            }
        }
        bgIsSUB3d2 = bgIsSUB3d;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        eVoQ2RqaN2 = eVoQ2RqaN;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        jzLhkMe5F2 = jzLhkMe5F;
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        str2 = str;
        if ((i2 & 32) != 0) {
        }
        if (((374491 & i3) ^ 74898) == 0) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        if (i6 == 0) {
        }
        int i1022222 = i3 << 3;
        q3BipwRCk(syekKyXqd.PSTqBLTET(Boolean.valueOf(z), str3, wpxpbwg1j, (i3 & 14) | ((i3 >> 9) & 112), 0), X6i9Y71Z6.kmSgne1rO, bgIsSUB3d3, eVoQ2RqaN3, jzLhkMe5F3, nzvP5Rex8, wpxpbwg1j, (i3 & 458752) | (i1022222 & 57344) | (i1022222 & 896) | 48 | (i1022222 & 7168));
        eVoQ2RqaN2 = eVoQ2RqaN3;
        Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb != null) {
        }
    }

    public static final BgIsSUB3d vNtjxmzUM(BgIsSUB3d bgIsSUB3d, float f, JZuV4yGnu jZuV4yGnu, boolean z) {
        if (Float.compare(f, (float) 0) <= 0 && !z) {
            return bgIsSUB3d;
        }
        boolean z2 = Rjnc3TWC6.q3BipwRCk;
        f7B6YCXHx f7b6ycxhx = f7B6YCXHx.kmSgne1rO;
        int i = BgIsSUB3d.Puu3Rhg4F;
        OUek6J1C1 oUek6J1C1 = new OUek6J1C1(f, jZuV4yGnu, z, 0);
        boolean z3 = Rjnc3TWC6.q3BipwRCk;
        return Rjnc3TWC6.q3BipwRCk(bgIsSUB3d, f7b6ycxhx, new ihwWLIzx8(oUek6J1C1, f7B6YCXHx.kmSgne1rO));
    }

    public static final boolean vPSbyrYWX(or5nbo9ku or5nbo9ku) {
        ogG45sslV iiGwOFFnr = or5nbo9ku.iiGwOFFnr();
        VSVuhz7Ow vSVuhz7Ow = VSVuhz7Ow.q3BipwRCk;
        return xP6F5SR9v.Bhmn1KIah(iiGwOFFnr, VSVuhz7Ow.oon79WMrY) == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final Object yWvV4ePLl(k0ugT26MT k0ugt26mt, UBY2Inzw8 uBY2Inzw8, UBY2Inzw8 uBY2Inzw82, W1NiVqEgR w1NiVqEgR, njjwS3RZT njjws3rzt, Way959ade way959ade) {
        gdpGQkO7V gdpgqko7v;
        int i;
        sl5e2Y3xY sl5e2y3xy;
        cKAQplqZy ckaqplqzy;
        n4f84B5OG n4f84b5og;
        cKAQplqZy ckaqplqzy2;
        Object obj;
        if (way959ade instanceof gdpGQkO7V) {
            gdpgqko7v = (gdpGQkO7V) way959ade;
            int i2 = gdpgqko7v.RG6kpfv3v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gdpgqko7v.RG6kpfv3v = i2 - Integer.MIN_VALUE;
                Object obj2 = gdpgqko7v.dXrmkklc8;
                kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
                i = gdpgqko7v.RG6kpfv3v;
                if (i != 0) {
                    anXlDk6fV.IytU16YUK(obj2);
                    gdpgqko7v.PSTqBLTET = k0ugt26mt;
                    gdpgqko7v.MzoOEjc4X = uBY2Inzw8;
                    gdpgqko7v.ilHKhw3Yw = uBY2Inzw82;
                    gdpgqko7v.qVUwofr5s = w1NiVqEgR;
                    gdpgqko7v.Eeka1udhb = njjws3rzt;
                    gdpgqko7v.RG6kpfv3v = 1;
                    obj2 = fpplAiKys.J4Ux7ym32(k0ugt26mt, false, gdpgqko7v);
                    if (obj2 == kbkjsqcsl) {
                        return kbkjsqcsl;
                    }
                } else if (i == 1) {
                    njjws3rzt = (njjwS3RZT) gdpgqko7v.Eeka1udhb;
                    w1NiVqEgR = (W1NiVqEgR) gdpgqko7v.qVUwofr5s;
                    uBY2Inzw82 = (UBY2Inzw8) gdpgqko7v.ilHKhw3Yw;
                    uBY2Inzw8 = (UBY2Inzw8) gdpgqko7v.MzoOEjc4X;
                    k0ugt26mt = (k0ugT26MT) gdpgqko7v.PSTqBLTET;
                    anXlDk6fV.IytU16YUK(obj2);
                } else if (i == 2 || i == 3) {
                    sl5e2y3xy = (sl5e2Y3xY) gdpgqko7v.PSTqBLTET;
                    anXlDk6fV.IytU16YUK(obj2);
                    ckaqplqzy = (cKAQplqZy) obj2;
                    if (ckaqplqzy != null) {
                        n4f84b5og = new n4f84B5OG(ckaqplqzy, new Float(sl5e2y3xy.CBQ5d1kRq));
                        return n4f84b5og;
                    }
                    return null;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ckaqplqzy2 = (cKAQplqZy) obj2;
                gThLCaTO1.iiGwOFFnr(w1NiVqEgR, ckaqplqzy2);
                if (((Boolean) ((PmanMZxiM) uBY2Inzw8.getValue()).IytU16YUK(ckaqplqzy2)).booleanValue()) {
                    if (((Boolean) ((gdEmqfwpT) uBY2Inzw82.getValue()).GPLPRo6go()).booleanValue()) {
                        n4f84b5og = new n4f84B5OG(ckaqplqzy2, new Float(0.0f));
                        return n4f84b5og;
                    }
                    sl5e2Y3xY sl5e2y3xy2 = new sl5e2Y3xY();
                    s49RbLNOF s49rblnof = new s49RbLNOF(w1NiVqEgR, sl5e2y3xy2);
                    if (njjws3rzt == njjwS3RZT.Vertical) {
                        long j = ckaqplqzy2.q3BipwRCk;
                        int i3 = ckaqplqzy2.yWvV4ePLl;
                        gdpgqko7v.PSTqBLTET = sl5e2y3xy2;
                        gdpgqko7v.MzoOEjc4X = null;
                        gdpgqko7v.ilHKhw3Yw = null;
                        gdpgqko7v.qVUwofr5s = null;
                        gdpgqko7v.Eeka1udhb = null;
                        gdpgqko7v.RG6kpfv3v = 2;
                        obj = ZEpQDovLv.kCA6Zs9sL(k0ugt26mt, j, i3, s49rblnof, gdpgqko7v);
                        if (obj == kbkjsqcsl) {
                            return kbkjsqcsl;
                        }
                    } else {
                        long j2 = ckaqplqzy2.q3BipwRCk;
                        int i4 = ckaqplqzy2.yWvV4ePLl;
                        gdpgqko7v.PSTqBLTET = sl5e2y3xy2;
                        gdpgqko7v.MzoOEjc4X = null;
                        gdpgqko7v.ilHKhw3Yw = null;
                        gdpgqko7v.qVUwofr5s = null;
                        gdpgqko7v.Eeka1udhb = null;
                        gdpgqko7v.RG6kpfv3v = 3;
                        obj = ZEpQDovLv.tGV7Q6urW(k0ugt26mt, j2, i4, s49rblnof, gdpgqko7v);
                        if (obj == kbkjsqcsl) {
                            return kbkjsqcsl;
                        }
                    }
                    obj2 = obj;
                    sl5e2y3xy = sl5e2y3xy2;
                    ckaqplqzy = (cKAQplqZy) obj2;
                    if (ckaqplqzy != null) {
                    }
                }
                return null;
            }
        }
        gdpgqko7v = new gdpGQkO7V(way959ade);
        Object obj22 = gdpgqko7v.dXrmkklc8;
        kBKJSqCSL kbkjsqcsl2 = kBKJSqCSL.COROUTINE_SUSPENDED;
        i = gdpgqko7v.RG6kpfv3v;
        if (i != 0) {
        }
        ckaqplqzy2 = (cKAQplqZy) obj22;
        gThLCaTO1.iiGwOFFnr(w1NiVqEgR, ckaqplqzy2);
        if (((Boolean) ((PmanMZxiM) uBY2Inzw8.getValue()).IytU16YUK(ckaqplqzy2)).booleanValue()) {
        }
        return null;
    }
}
