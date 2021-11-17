package con;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.ColorSpace;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.util.DisplayMetrics;
import java.util.List;
/* loaded from: classes.dex */
public abstract class xP6F5SR9v {
    public static final Object Bhmn1KIah(ogG45sslV ogg45sslv, SHlGWJTIu sHlGWJTIu) {
        SFccbMiBr sFccbMiBr = SFccbMiBr.ixWaw2akD;
        Object obj = ogg45sslv.CBQ5d1kRq.get(sHlGWJTIu);
        return obj != null ? obj : sFccbMiBr.GPLPRo6go();
    }

    public static final float CBQ5d1kRq(long j, long j2) {
        return tbzY8QG6X.kCA6Zs9sL(j2) / tbzY8QG6X.kCA6Zs9sL(j);
    }

    public static final BlendMode Eeka1udhb(int i) {
        ksLrMHgEz kslrmhgez = KtdRQT1Je.q3BipwRCk;
        ksLrMHgEz kslrmhgez2 = KtdRQT1Je.q3BipwRCk;
        if (KtdRQT1Je.q3BipwRCk(i, 0)) {
            return BlendMode.CLEAR;
        }
        if (KtdRQT1Je.q3BipwRCk(i, 1)) {
            return BlendMode.SRC;
        }
        if (KtdRQT1Je.q3BipwRCk(i, 2)) {
            return BlendMode.DST;
        }
        if (!KtdRQT1Je.q3BipwRCk(i, 3)) {
            if (KtdRQT1Je.q3BipwRCk(i, 4)) {
                return BlendMode.DST_OVER;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 5)) {
                return BlendMode.SRC_IN;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 6)) {
                return BlendMode.DST_IN;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 7)) {
                return BlendMode.SRC_OUT;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 8)) {
                return BlendMode.DST_OUT;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 9)) {
                return BlendMode.SRC_ATOP;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 10)) {
                return BlendMode.DST_ATOP;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 11)) {
                return BlendMode.XOR;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 12)) {
                return BlendMode.PLUS;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 13)) {
                return BlendMode.MODULATE;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 14)) {
                return BlendMode.SCREEN;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 15)) {
                return BlendMode.OVERLAY;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 16)) {
                return BlendMode.DARKEN;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 17)) {
                return BlendMode.LIGHTEN;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 18)) {
                return BlendMode.COLOR_DODGE;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 19)) {
                return BlendMode.COLOR_BURN;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 20)) {
                return BlendMode.HARD_LIGHT;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 21)) {
                return BlendMode.SOFT_LIGHT;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 22)) {
                return BlendMode.DIFFERENCE;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 23)) {
                return BlendMode.EXCLUSION;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 24)) {
                return BlendMode.MULTIPLY;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 25)) {
                return BlendMode.HUE;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 26)) {
                return BlendMode.SATURATION;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 27)) {
                return BlendMode.COLOR;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 28)) {
                return BlendMode.LUMINOSITY;
            }
        }
        return BlendMode.SRC_OVER;
    }

    public static final int GPLPRo6go(List list, kkcQgCx5G kkcqgcx5g, kkcQgCx5G kkcqgcx5g2, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        int i6;
        int i7;
        boolean z = true;
        int i8 = 0;
        float f2 = 0.0f;
        if (i3 == i4) {
            int size = list.size() - 1;
            if (size >= 0) {
                int i9 = 0;
                i7 = 0;
                int i10 = 0;
                float f3 = 0.0f;
                while (true) {
                    int i11 = i9 + 1;
                    HqmYLYbvB hqmYLYbvB = (HqmYLYbvB) list.get(i9);
                    float PSTqBLTET = PSTqBLTET(kmSgne1rO(hqmYLYbvB));
                    int intValue = ((Number) kkcqgcx5g.WaUP0CF08(hqmYLYbvB, Integer.valueOf(i))).intValue();
                    if (PSTqBLTET == 0.0f) {
                        i7 += intValue;
                    } else if (PSTqBLTET > 0.0f) {
                        f3 += PSTqBLTET;
                        i10 = Math.max(i10, D3DEikrvb.Eeka1udhb(((float) intValue) / PSTqBLTET));
                    }
                    if (i11 > size) {
                        break;
                    }
                    i9 = i11;
                }
                f2 = f3;
                i8 = i10;
            } else {
                i7 = 0;
            }
            return ((list.size() - 1) * i2) + D3DEikrvb.Eeka1udhb(((float) i8) * f2) + i7;
        }
        int size2 = list.size() - 1;
        if (size2 >= 0) {
            int i12 = 0;
            i6 = 0;
            i5 = 0;
            f = 0.0f;
            while (true) {
                int i13 = i12 + 1;
                HqmYLYbvB hqmYLYbvB2 = (HqmYLYbvB) list.get(i12);
                float PSTqBLTET2 = PSTqBLTET(kmSgne1rO(hqmYLYbvB2));
                if (PSTqBLTET2 == 0.0f) {
                    int min = Math.min(((Number) kkcqgcx5g2.WaUP0CF08(hqmYLYbvB2, Integer.MAX_VALUE)).intValue(), i - i6);
                    i6 += min;
                    i5 = Math.max(i5, ((Number) kkcqgcx5g.WaUP0CF08(hqmYLYbvB2, Integer.valueOf(min))).intValue());
                } else if (PSTqBLTET2 > 0.0f) {
                    f += PSTqBLTET2;
                }
                if (i13 > size2) {
                    break;
                }
                i12 = i13;
            }
        } else {
            i6 = 0;
            i5 = 0;
            f = 0.0f;
        }
        if (f != 0.0f) {
            z = false;
        }
        int Eeka1udhb = z ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : D3DEikrvb.Eeka1udhb(((float) Math.max(i - i6, 0)) / f);
        int size3 = list.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i14 = i8 + 1;
                HqmYLYbvB hqmYLYbvB3 = (HqmYLYbvB) list.get(i8);
                float PSTqBLTET3 = PSTqBLTET(kmSgne1rO(hqmYLYbvB3));
                if (PSTqBLTET3 > 0.0f) {
                    i5 = Math.max(i5, ((Number) kkcqgcx5g.WaUP0CF08(hqmYLYbvB3, Integer.valueOf(Eeka1udhb != Integer.MAX_VALUE ? D3DEikrvb.Eeka1udhb(((float) Eeka1udhb) * PSTqBLTET3) : Integer.MAX_VALUE))).intValue());
                }
                if (i14 > size3) {
                    break;
                }
                i8 = i14;
            }
        }
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
        if (r6 == con.P7Re99G8L.J4Ux7ym32) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void J4Ux7ym32(con.xNzBgcwLi r18, java.lang.String r19, con.BgIsSUB3d r20, con.B01AuRyT3 r21, con.Z3himwdYy r22, float r23, con.jvKy1qifN r24, con.rJ0s9PfCL r25, int r26, int r27) {
        /*
        // Method dump skipped, instructions count: 327
        */
        throw new UnsupportedOperationException("Method not decompiled: con.xP6F5SR9v.J4Ux7ym32(con.xNzBgcwLi, java.lang.String, con.BgIsSUB3d, con.B01AuRyT3, con.Z3himwdYy, float, con.jvKy1qifN, con.rJ0s9PfCL, int, int):void");
    }

    public static final boolean MzoOEjc4X(A128gLXzp a128gLXzp, float f, float f2, A128gLXzp a128gLXzp2, A128gLXzp a128gLXzp3) {
        bzmJZsHMu bzmjzshmu = new bzmJZsHMu(f - 0.005f, f2 - 0.005f, f + 0.005f, f2 + 0.005f);
        if (a128gLXzp2 == null) {
            a128gLXzp2 = iiGwOFFnr();
        }
        Q3Qxqu4re q3Qxqu4re = (Q3Qxqu4re) a128gLXzp2;
        q3Qxqu4re.q3BipwRCk(bzmjzshmu);
        if (a128gLXzp3 == null) {
            a128gLXzp3 = iiGwOFFnr();
        }
        oWhsE8IPp owhse8ipp = anYMrvy8z.q3BipwRCk;
        oWhsE8IPp owhse8ipp2 = anYMrvy8z.q3BipwRCk;
        Q3Qxqu4re q3Qxqu4re2 = (Q3Qxqu4re) a128gLXzp3;
        q3Qxqu4re2.dIocxURUo(a128gLXzp, q3Qxqu4re, 1);
        boolean isEmpty = q3Qxqu4re2.q3BipwRCk.isEmpty();
        q3Qxqu4re2.q3BipwRCk.reset();
        q3Qxqu4re.q3BipwRCk.reset();
        return !isEmpty;
    }

    public static final float PSTqBLTET(iPxyBBmfH ipxybbmfh) {
        if (ipxybbmfh == null) {
            return 0.0f;
        }
        return ipxybbmfh.q3BipwRCk;
    }

    public static final int Puu3Rhg4F(n2gATecRC n2gatecrc, int i) {
        if (i == 1) {
            return n2gatecrc.CBQ5d1kRq;
        }
        return n2gatecrc.kmSgne1rO;
    }

    public static Y3ibtOJiE dIocxURUo(int i, int i2, int i3, boolean z, J8UIfudgU j8UIfudgU, int i4) {
        mVycGceov mvycgceov;
        ColorSpace.Named named;
        if ((i4 & 4) != 0) {
            oWhsE8IPp owhse8ipp = QrGf69nPE.q3BipwRCk;
            oWhsE8IPp owhse8ipp2 = QrGf69nPE.q3BipwRCk;
            i3 = 0;
        }
        if ((i4 & 8) != 0) {
            z = true;
        }
        if ((i4 & 16) != 0) {
            FVP3dB50k fVP3dB50k = FVP3dB50k.q3BipwRCk;
            mvycgceov = FVP3dB50k.dIocxURUo;
        } else {
            mvycgceov = null;
        }
        p62TZmTyO.V9LQMKGJe(i3);
        Bitmap.Config V9LQMKGJe = p62TZmTyO.V9LQMKGJe(i3);
        FVP3dB50k fVP3dB50k2 = FVP3dB50k.q3BipwRCk;
        if (!anXlDk6fV.tGV7Q6urW(mvycgceov, FVP3dB50k.dIocxURUo)) {
            if (anXlDk6fV.tGV7Q6urW(mvycgceov, FVP3dB50k.MzoOEjc4X)) {
                named = ColorSpace.Named.ACES;
            } else if (anXlDk6fV.tGV7Q6urW(mvycgceov, FVP3dB50k.ilHKhw3Yw)) {
                named = ColorSpace.Named.ACESCG;
            } else if (anXlDk6fV.tGV7Q6urW(mvycgceov, FVP3dB50k.Bhmn1KIah)) {
                named = ColorSpace.Named.ADOBE_RGB;
            } else if (anXlDk6fV.tGV7Q6urW(mvycgceov, FVP3dB50k.yWvV4ePLl)) {
                named = ColorSpace.Named.BT2020;
            } else if (anXlDk6fV.tGV7Q6urW(mvycgceov, FVP3dB50k.Puu3Rhg4F)) {
                named = ColorSpace.Named.BT709;
            } else if (anXlDk6fV.tGV7Q6urW(mvycgceov, FVP3dB50k.Eeka1udhb)) {
                named = ColorSpace.Named.CIE_LAB;
            } else if (anXlDk6fV.tGV7Q6urW(mvycgceov, FVP3dB50k.qVUwofr5s)) {
                named = ColorSpace.Named.CIE_XYZ;
            } else if (anXlDk6fV.tGV7Q6urW(mvycgceov, FVP3dB50k.oon79WMrY)) {
                named = ColorSpace.Named.DCI_P3;
            } else if (anXlDk6fV.tGV7Q6urW(mvycgceov, FVP3dB50k.vPSbyrYWX)) {
                named = ColorSpace.Named.DISPLAY_P3;
            } else if (anXlDk6fV.tGV7Q6urW(mvycgceov, FVP3dB50k.iiGwOFFnr)) {
                named = ColorSpace.Named.EXTENDED_SRGB;
            } else if (anXlDk6fV.tGV7Q6urW(mvycgceov, FVP3dB50k.GPLPRo6go)) {
                named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            } else if (anXlDk6fV.tGV7Q6urW(mvycgceov, FVP3dB50k.kCA6Zs9sL)) {
                named = ColorSpace.Named.LINEAR_SRGB;
            } else if (anXlDk6fV.tGV7Q6urW(mvycgceov, FVP3dB50k.CBQ5d1kRq)) {
                named = ColorSpace.Named.NTSC_1953;
            } else if (anXlDk6fV.tGV7Q6urW(mvycgceov, FVP3dB50k.PSTqBLTET)) {
                named = ColorSpace.Named.PRO_PHOTO_RGB;
            } else if (anXlDk6fV.tGV7Q6urW(mvycgceov, FVP3dB50k.kmSgne1rO)) {
                named = ColorSpace.Named.SMPTE_C;
            }
            return new tNgdvtcFW(Bitmap.createBitmap((DisplayMetrics) null, i, i2, V9LQMKGJe, z, ColorSpace.get(named)));
        }
        named = ColorSpace.Named.SRGB;
        return new tNgdvtcFW(Bitmap.createBitmap((DisplayMetrics) null, i, i2, V9LQMKGJe, z, ColorSpace.get(named)));
    }

    public static final PorterDuff.Mode dXrmkklc8(int i) {
        ksLrMHgEz kslrmhgez = KtdRQT1Je.q3BipwRCk;
        ksLrMHgEz kslrmhgez2 = KtdRQT1Je.q3BipwRCk;
        if (KtdRQT1Je.q3BipwRCk(i, 0)) {
            return PorterDuff.Mode.CLEAR;
        }
        if (KtdRQT1Je.q3BipwRCk(i, 1)) {
            return PorterDuff.Mode.SRC;
        }
        if (KtdRQT1Je.q3BipwRCk(i, 2)) {
            return PorterDuff.Mode.DST;
        }
        if (!KtdRQT1Je.q3BipwRCk(i, 3)) {
            if (KtdRQT1Je.q3BipwRCk(i, 4)) {
                return PorterDuff.Mode.DST_OVER;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 5)) {
                return PorterDuff.Mode.SRC_IN;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 6)) {
                return PorterDuff.Mode.DST_IN;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 7)) {
                return PorterDuff.Mode.SRC_OUT;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 8)) {
                return PorterDuff.Mode.DST_OUT;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 9)) {
                return PorterDuff.Mode.SRC_ATOP;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 10)) {
                return PorterDuff.Mode.DST_ATOP;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 11)) {
                return PorterDuff.Mode.XOR;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 12)) {
                return PorterDuff.Mode.ADD;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 14)) {
                return PorterDuff.Mode.SCREEN;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 15)) {
                return PorterDuff.Mode.OVERLAY;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 16)) {
                return PorterDuff.Mode.DARKEN;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 17)) {
                return PorterDuff.Mode.LIGHTEN;
            }
            if (KtdRQT1Je.q3BipwRCk(i, 13)) {
                return PorterDuff.Mode.MULTIPLY;
            }
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static final A128gLXzp iiGwOFFnr() {
        return new Q3Qxqu4re(new Path());
    }

    public static final boolean ilHKhw3Yw(float f, float f2, long j, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float J4Ux7ym32 = yDwaznigW.J4Ux7ym32(j);
        float tGV7Q6urW = yDwaznigW.tGV7Q6urW(j);
        return ((f6 * f6) / (tGV7Q6urW * tGV7Q6urW)) + ((f5 * f5) / (J4Ux7ym32 * J4Ux7ym32)) <= 1.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x01c8, code lost:
        if (r12 == con.P7Re99G8L.J4Ux7ym32) goto L_0x01ca;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01f0, code lost:
        if (r6 == con.P7Re99G8L.J4Ux7ym32) goto L_0x01f2;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void kCA6Zs9sL(con.BgIsSUB3d r27, con.cnnoFa4Tx r28, con.MHv2Ig8xA r29, boolean r30, con.MEtaL9md5 r31, con.phqQlbVE3 r32, con.IzQNDLr32 r33, con.PmanMZxiM r34, con.rJ0s9PfCL r35, int r36, int r37) {
        /*
        // Method dump skipped, instructions count: 619
        */
        throw new UnsupportedOperationException("Method not decompiled: con.xP6F5SR9v.kCA6Zs9sL(con.BgIsSUB3d, con.cnnoFa4Tx, con.MHv2Ig8xA, boolean, con.MEtaL9md5, con.phqQlbVE3, con.IzQNDLr32, con.PmanMZxiM, con.rJ0s9PfCL, int, int):void");
    }

    public static final iPxyBBmfH kmSgne1rO(HqmYLYbvB hqmYLYbvB) {
        Object Bhmn1KIah = hqmYLYbvB.Bhmn1KIah();
        if (Bhmn1KIah instanceof iPxyBBmfH) {
            return (iPxyBBmfH) Bhmn1KIah;
        }
        return null;
    }

    public static /* synthetic */ Object oon79WMrY(S4g0LufWW s4g0LufWW, float f, SmsTS63dj smsTS63dj, Way959ade way959ade, int i) {
        int i2 = i & 2;
        O0hQm6WVz o0hQm6WVz = null;
        if (i2 != 0) {
            o0hQm6WVz = cqKak5Wfn.iiGwOFFnr(0.0f, 0.0f, null, 7);
        }
        return yWvV4ePLl(s4g0LufWW, f, o0hQm6WVz, way959ade);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015b A[EDGE_INSN: B:109:0x015b->B:73:0x015b ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014f A[LOOP:0: B:70:0x0146->B:72:0x014f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0177 A[LOOP:1: B:77:0x0171->B:79:0x0177, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f5  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void q3BipwRCk(java.lang.Object r20, con.BgIsSUB3d r21, con.B82vleiqp r22, con.NzvP5Rex8 r23, con.rJ0s9PfCL r24, int r25, int r26) {
        /*
        // Method dump skipped, instructions count: 714
        */
        throw new UnsupportedOperationException("Method not decompiled: con.xP6F5SR9v.q3BipwRCk(java.lang.Object, con.BgIsSUB3d, con.B82vleiqp, con.NzvP5Rex8, con.rJ0s9PfCL, int, int):void");
    }

    public static final nBnrGO77H qVUwofr5s(int i, a9Q6ojHoZ a9q6ojhoz, float f, int i2, pennnCA24 pennnca24) {
        return new cVu2JxkoY(i, f, i2, a9q6ojhoz, pennnca24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
        if (r11 == con.P7Re99G8L.J4Ux7ym32) goto L_0x0073;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void tGV7Q6urW(con.Y3ibtOJiE r21, java.lang.String r22, con.BgIsSUB3d r23, con.B01AuRyT3 r24, con.Z3himwdYy r25, float r26, con.jvKy1qifN r27, int r28, con.rJ0s9PfCL r29, int r30, int r31) {
        /*
        // Method dump skipped, instructions count: 227
        */
        throw new UnsupportedOperationException("Method not decompiled: con.xP6F5SR9v.tGV7Q6urW(con.Y3ibtOJiE, java.lang.String, con.BgIsSUB3d, con.B01AuRyT3, con.Z3himwdYy, float, con.jvKy1qifN, int, con.rJ0s9PfCL, int, int):void");
    }

    public static final float vPSbyrYWX(long j, long j2) {
        return tbzY8QG6X.tGV7Q6urW(j2) / tbzY8QG6X.tGV7Q6urW(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final java.lang.Object yWvV4ePLl(con.S4g0LufWW r7, float r8, con.SmsTS63dj r9, con.Way959ade r10) {
        /*
            boolean r0 = r10 instanceof con.XCjd3yuts
            if (r0 == 0) goto L_0x0013
            r0 = r10
            con.XCjd3yuts r0 = (con.XCjd3yuts) r0
            int r1 = r0.ilHKhw3Yw
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.ilHKhw3Yw = r1
            goto L_0x0018
        L_0x0013:
            con.XCjd3yuts r0 = new con.XCjd3yuts
            r0.<init>(r10)
        L_0x0018:
            r4 = r0
            java.lang.Object r10 = r4.MzoOEjc4X
            con.kBKJSqCSL r0 = con.kBKJSqCSL.COROUTINE_SUSPENDED
            int r1 = r4.ilHKhw3Yw
            r2 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 != r2) goto L_0x002c
            java.lang.Object r7 = r4.PSTqBLTET
            con.sl5e2Y3xY r7 = (con.sl5e2Y3xY) r7
            con.anXlDk6fV.IytU16YUK(r10)
            goto L_0x0055
        L_0x002c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0034:
            con.anXlDk6fV.IytU16YUK(r10)
            con.sl5e2Y3xY r10 = new con.sl5e2Y3xY
            r10.<init>()
            r3 = 0
            con.ZELD0kKTa r5 = new con.ZELD0kKTa
            r1 = 0
            r5.<init>(r8, r9, r10, r1)
            r8 = 1
            r6 = 0
            r4.PSTqBLTET = r10
            r4.ilHKhw3Yw = r2
            r1 = r7
            r2 = r3
            r3 = r5
            r5 = r8
            java.lang.Object r7 = con.WAflFGuGp.CBQ5d1kRq(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L_0x0054
            return r0
        L_0x0054:
            r7 = r10
        L_0x0055:
            float r7 = r7.CBQ5d1kRq
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: con.xP6F5SR9v.yWvV4ePLl(con.S4g0LufWW, float, con.SmsTS63dj, con.Way959ade):java.lang.Object");
    }
}
