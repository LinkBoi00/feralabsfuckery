package con;

import android.content.Context;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.feravolt.preload.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class WAflFGuGp {
    public static final String GPLPRo6go(int i, rJ0s9PfCL rj0s9pfcl) {
        String str;
        int i2;
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.zHl31GGXU(-845575816);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        wpxpbwg1j.oon79WMrY(KApR71V3i.q3BipwRCk);
        Resources resources = ((Context) wpxpbwg1j.oon79WMrY(KApR71V3i.J4Ux7ym32)).getResources();
        ksLrMHgEz kslrmhgez = QGj7N4XWh.q3BipwRCk;
        ksLrMHgEz kslrmhgez2 = QGj7N4XWh.q3BipwRCk;
        if (QGj7N4XWh.q3BipwRCk(i, 0)) {
            i2 = R.string.navigation_menu;
        } else if (QGj7N4XWh.q3BipwRCk(i, 1)) {
            i2 = R.string.close_drawer;
        } else if (QGj7N4XWh.q3BipwRCk(i, 2)) {
            i2 = R.string.close_sheet;
        } else if (QGj7N4XWh.q3BipwRCk(i, 3)) {
            i2 = R.string.default_error_message;
        } else if (QGj7N4XWh.q3BipwRCk(i, 4)) {
            i2 = R.string.dropdown_menu;
        } else {
            str = "";
            wpxpbwg1j.ilHKhw3Yw(false);
            return str;
        }
        str = resources.getString(i2);
        wpxpbwg1j.ilHKhw3Yw(false);
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0115  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void J4Ux7ym32(String str, BgIsSUB3d bgIsSUB3d, GjhoS54Hf gjhoS54Hf, PmanMZxiM pmanMZxiM, int i, boolean z, int i2, rJ0s9PfCL rj0s9pfcl, int i3, int i4) {
        int i5;
        BgIsSUB3d bgIsSUB3d2;
        int i6;
        GjhoS54Hf gjhoS54Hf2;
        int i7;
        PmanMZxiM pmanMZxiM2;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        BgIsSUB3d bgIsSUB3d3;
        vtNW2XFzs vtnw2xfzs;
        BgIsSUB3d bgIsSUB3d4;
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(959236841);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (wpxpbwg1j.iiGwOFFnr(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i13 = i4 & 2;
        if (i13 != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            bgIsSUB3d2 = bgIsSUB3d;
            i5 |= wpxpbwg1j.iiGwOFFnr(bgIsSUB3d2) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 896) == 0) {
                gjhoS54Hf2 = gjhoS54Hf;
                i5 |= wpxpbwg1j.iiGwOFFnr(gjhoS54Hf2) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 7168) == 0) {
                    pmanMZxiM2 = pmanMZxiM;
                    i5 |= wpxpbwg1j.iiGwOFFnr(pmanMZxiM2) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((57344 & i3) == 0) {
                        i9 = i;
                        i5 |= wpxpbwg1j.dIocxURUo(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= 196608;
                        } else if ((458752 & i3) == 0) {
                            z2 = z;
                            i5 |= wpxpbwg1j.GPLPRo6go(z2) ? 131072 : 65536;
                            i11 = i4 & 64;
                            if (i11 == 0) {
                                i5 |= 1572864;
                                i12 = i2;
                            } else {
                                i12 = i2;
                                if ((i3 & 3670016) == 0) {
                                    i5 |= wpxpbwg1j.dIocxURUo(i12) ? 1048576 : 524288;
                                }
                            }
                            if (((i5 & 2995931) ^ 599186) == 0 || !wpxpbwg1j.i8XZMQc6Z()) {
                                if (i13 == 0) {
                                    int i14 = BgIsSUB3d.Puu3Rhg4F;
                                    bgIsSUB3d3 = H11ySchUh.CBQ5d1kRq;
                                } else {
                                    bgIsSUB3d3 = bgIsSUB3d2;
                                }
                                if (i6 != 0) {
                                    Q4TFMtvSV q4TFMtvSV = GjhoS54Hf.Eeka1udhb;
                                    gjhoS54Hf2 = GjhoS54Hf.dXrmkklc8;
                                }
                                if (i7 != 0) {
                                    pmanMZxiM2 = neeMcQ8nW.kmSgne1rO;
                                }
                                if (i8 != 0) {
                                    i9 = 1;
                                }
                                if (i10 != 0) {
                                    z2 = true;
                                }
                                if (i11 != 0) {
                                    i12 = Integer.MAX_VALUE;
                                }
                                if (!(i12 <= 0)) {
                                    vtNW2XFzs vtnw2xfzs2 = (vtNW2XFzs) wpxpbwg1j.oon79WMrY(TwG0AZwit.q3BipwRCk);
                                    hOY2Rgtej hoy2rgtej = PxtnQGBQi.kCA6Zs9sL;
                                    AU29aHa4X aU29aHa4X = (AU29aHa4X) wpxpbwg1j.oon79WMrY(hoy2rgtej);
                                    C2cgp32t9 c2cgp32t9 = (C2cgp32t9) wpxpbwg1j.oon79WMrY(PxtnQGBQi.GPLPRo6go);
                                    MAZDnzQe5 mAZDnzQe5 = new MAZDnzQe5(vtnw2xfzs2);
                                    GQN3dSqKV gQN3dSqKV = GQN3dSqKV.dfpT1j18n;
                                    B6IRYLW14 b6irylw14 = IaRtW3OEX.q3BipwRCk;
                                    long longValue = ((Number) uI1r9gOOH.q3BipwRCk(new Object[]{str, vtnw2xfzs2}, new B6IRYLW14(mAZDnzQe5, gQN3dSqKV), null, new n2FlsPL4M(vtnw2xfzs2, 0), wpxpbwg1j, 4)).longValue();
                                    wpxpbwg1j.zHl31GGXU(-3687241);
                                    Object dfpT1j18n = wpxpbwg1j.dfpT1j18n();
                                    int i15 = rJ0s9PfCL.q3BipwRCk;
                                    if (dfpT1j18n == P7Re99G8L.J4Ux7ym32) {
                                        bgIsSUB3d4 = bgIsSUB3d3;
                                        vtnw2xfzs = vtnw2xfzs2;
                                        dfpT1j18n = new wQYV02pDG(new xnuGrZOEO(new icKZ1RJnW(new joIJ4ANvK(str, (List) null, (List) null, 6), gjhoS54Hf2, i12, z2, i9, aU29aHa4X, c2cgp32t9, (List) null, 128), longValue));
                                        wpxpbwg1j.INnK5Rew6(dfpT1j18n);
                                    } else {
                                        bgIsSUB3d4 = bgIsSUB3d3;
                                        vtnw2xfzs = vtnw2xfzs2;
                                    }
                                    wpxpbwg1j.ilHKhw3Yw(false);
                                    wQYV02pDG wqyv02pdg = (wQYV02pDG) dfpT1j18n;
                                    xnuGrZOEO xnugrzoeo = wqyv02pdg.CBQ5d1kRq;
                                    if (!wpxpbwg1j.vNtjxmzUM) {
                                        icKZ1RJnW ickz1rjnw = xnugrzoeo.q3BipwRCk;
                                        n4f84B5OG n4f84b5og = xL84NgKtE.q3BipwRCk;
                                        if (!anXlDk6fV.tGV7Q6urW(ickz1rjnw.q3BipwRCk.CBQ5d1kRq, str) || !anXlDk6fV.tGV7Q6urW(ickz1rjnw.J4Ux7ym32, gjhoS54Hf2) || ickz1rjnw.dIocxURUo != z2 || !o117kTMoU.q3BipwRCk(ickz1rjnw.kCA6Zs9sL, i9) || ickz1rjnw.tGV7Q6urW != i12 || !anXlDk6fV.tGV7Q6urW(ickz1rjnw.iiGwOFFnr, aU29aHa4X)) {
                                            ickz1rjnw = new icKZ1RJnW(new joIJ4ANvK(str, (List) null, (List) null, 6), gjhoS54Hf2, i12, z2, i9, aU29aHa4X, c2cgp32t9, (List) null, 128);
                                        }
                                        xnugrzoeo.q3BipwRCk = ickz1rjnw;
                                    }
                                    xnugrzoeo.tGV7Q6urW = pmanMZxiM2;
                                    wqyv02pdg.kCA6Zs9sL(vtnw2xfzs);
                                    wpxpbwg1j.zHl31GGXU(959239472);
                                    if (vtnw2xfzs != null) {
                                        xnugrzoeo.Puu3Rhg4F = ((exL1qvzlc) wpxpbwg1j.oon79WMrY(KwPZJNJfx.q3BipwRCk)).J4Ux7ym32;
                                    }
                                    wpxpbwg1j.ilHKhw3Yw(false);
                                    bgIsSUB3d2 = bgIsSUB3d4;
                                    BgIsSUB3d WaUP0CF08 = bgIsSUB3d2.WaUP0CF08(wqyv02pdg.MzoOEjc4X.WaUP0CF08(wqyv02pdg.ilHKhw3Yw));
                                    nBnrGO77H nbnrgo77h = wqyv02pdg.PSTqBLTET;
                                    wpxpbwg1j.zHl31GGXU(1376091099);
                                    AU29aHa4X aU29aHa4X2 = (AU29aHa4X) wpxpbwg1j.V9LQMKGJe(hoy2rgtej, wpxpbwg1j.CBQ5d1kRq());
                                    BFRsKhrQv bFRsKhrQv = (BFRsKhrQv) wpxpbwg1j.oon79WMrY(PxtnQGBQi.oon79WMrY);
                                    fCkNY70T9 fckny70t9 = (fCkNY70T9) wpxpbwg1j.oon79WMrY(PxtnQGBQi.Bhmn1KIah);
                                    BgIsSUB3d qVUwofr5s = gThLCaTO1.qVUwofr5s(wpxpbwg1j, WaUP0CF08);
                                    Objects.requireNonNull(HSwcezbks.tGV7Q6urW);
                                    gdEmqfwpT gdemqfwpt = xUKgrGMGQ.J4Ux7ym32;
                                    wpxpbwg1j.zHl31GGXU(1546164872);
                                    if (wpxpbwg1j.J4Ux7ym32 instanceof GX14exZ1F) {
                                        wpxpbwg1j.wIZEdYHUn();
                                        if (wpxpbwg1j.vNtjxmzUM) {
                                            wpxpbwg1j.vPSbyrYWX(new GunsxZ6tg(gdemqfwpt, 2));
                                        } else {
                                            wpxpbwg1j.ln3nf7LH3();
                                        }
                                        wpxpbwg1j.WaUP0CF08 = false;
                                        pz7YPhQTU.WaUP0CF08(wpxpbwg1j, nbnrgo77h, xUKgrGMGQ.kCA6Zs9sL);
                                        pz7YPhQTU.WaUP0CF08(wpxpbwg1j, aU29aHa4X2, xUKgrGMGQ.dIocxURUo);
                                        pz7YPhQTU.WaUP0CF08(wpxpbwg1j, bFRsKhrQv, xUKgrGMGQ.iiGwOFFnr);
                                        pz7YPhQTU.WaUP0CF08(wpxpbwg1j, fckny70t9, xUKgrGMGQ.GPLPRo6go);
                                        pz7YPhQTU.WaUP0CF08(wpxpbwg1j, qVUwofr5s, xUKgrGMGQ.tGV7Q6urW);
                                        wpxpbwg1j.MzoOEjc4X();
                                        wpxpbwg1j.ilHKhw3Yw(true);
                                        wpxpbwg1j.ilHKhw3Yw(false);
                                        wpxpbwg1j.ilHKhw3Yw(false);
                                    } else {
                                        xpuSUT7Gh.j22ftfeNI();
                                        throw null;
                                    }
                                } else {
                                    throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                                }
                            } else {
                                wpxpbwg1j.igRQEZxnW();
                            }
                            rESgwfV20 Eeka1udhb = wpxpbwg1j.Eeka1udhb();
                            if (Eeka1udhb != null) {
                                Eeka1udhb.dIocxURUo = new e9OfrTphb(str, bgIsSUB3d2, gjhoS54Hf2, pmanMZxiM2, i9, z2, i12, i3, i4);
                                return;
                            }
                            return;
                        }
                        z2 = z;
                        i11 = i4 & 64;
                        if (i11 == 0) {
                        }
                        if (((i5 & 2995931) ^ 599186) == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 != 0) {
                        }
                        if (!(i12 <= 0)) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    z2 = z;
                    i11 = i4 & 64;
                    if (i11 == 0) {
                    }
                    if (((i5 & 2995931) ^ 599186) == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 != 0) {
                    }
                    if (!(i12 <= 0)) {
                    }
                }
                pmanMZxiM2 = pmanMZxiM;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                z2 = z;
                i11 = i4 & 64;
                if (i11 == 0) {
                }
                if (((i5 & 2995931) ^ 599186) == 0) {
                }
                if (i13 == 0) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 != 0) {
                }
                if (!(i12 <= 0)) {
                }
            }
            gjhoS54Hf2 = gjhoS54Hf;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            pmanMZxiM2 = pmanMZxiM;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            z2 = z;
            i11 = i4 & 64;
            if (i11 == 0) {
            }
            if (((i5 & 2995931) ^ 599186) == 0) {
            }
            if (i13 == 0) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 != 0) {
            }
            if (!(i12 <= 0)) {
            }
        }
        bgIsSUB3d2 = bgIsSUB3d;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        gjhoS54Hf2 = gjhoS54Hf;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        pmanMZxiM2 = pmanMZxiM;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        z2 = z;
        i11 = i4 & 64;
        if (i11 == 0) {
        }
        if (((i5 & 2995931) ^ 599186) == 0) {
        }
        if (i13 == 0) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 != 0) {
        }
        if (!(i12 <= 0)) {
        }
    }

    public static final int Puu3Rhg4F(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action == 0) {
            ksLrMHgEz kslrmhgez = le9Z8LIS5.q3BipwRCk;
            ksLrMHgEz kslrmhgez2 = le9Z8LIS5.q3BipwRCk;
            return 2;
        } else if (action != 1) {
            ksLrMHgEz kslrmhgez3 = le9Z8LIS5.q3BipwRCk;
            ksLrMHgEz kslrmhgez4 = le9Z8LIS5.q3BipwRCk;
            return 0;
        } else {
            ksLrMHgEz kslrmhgez5 = le9Z8LIS5.q3BipwRCk;
            ksLrMHgEz kslrmhgez6 = le9Z8LIS5.q3BipwRCk;
            return 1;
        }
    }

    public static final bzmJZsHMu dIocxURUo(AU29aHa4X aU29aHa4X, int i, KNUBbNYxJ kNUBbNYxJ, pZznYi2iw pzznyi2iw, boolean z, int i2) {
        bzmJZsHMu bzmjzshmu;
        if (pzznyi2iw == null) {
            bzmjzshmu = null;
        } else {
            Objects.requireNonNull((zmrz5MjK1) kNUBbNYxJ.J4Ux7ym32);
            bzmjzshmu = pzznyi2iw.tGV7Q6urW(i);
        }
        if (bzmjzshmu == null) {
            ksLrMHgEz kslrmhgez = bzmJZsHMu.kCA6Zs9sL;
            ksLrMHgEz kslrmhgez2 = bzmJZsHMu.kCA6Zs9sL;
            bzmjzshmu = bzmJZsHMu.iiGwOFFnr;
        }
        float f = ULcVOH77q.q3BipwRCk;
        int iiGwOFFnr = aU29aHa4X.iiGwOFFnr(ULcVOH77q.q3BipwRCk);
        float f2 = z ? (((float) i2) - bzmjzshmu.q3BipwRCk) - ((float) iiGwOFFnr) : bzmjzshmu.q3BipwRCk;
        float f3 = z ? ((float) i2) - bzmjzshmu.q3BipwRCk : ((float) iiGwOFFnr) + bzmjzshmu.q3BipwRCk;
        ksLrMHgEz kslrmhgez3 = bzmJZsHMu.kCA6Zs9sL;
        return new bzmJZsHMu(f2, bzmjzshmu.J4Ux7ym32, f3, bzmjzshmu.dIocxURUo);
    }

    public static final long iiGwOFFnr(KeyEvent keyEvent) {
        return ODug2UCW1.tGV7Q6urW(keyEvent.getKeyCode());
    }

    public static final MRJRYaP06 kCA6Zs9sL(Context context) {
        LLsIOxFFo lLsIOxFFo = LLsIOxFFo.q3BipwRCk;
        return new MRJRYaP06(lLsIOxFFo.q3BipwRCk(context, 17170461), lLsIOxFFo.q3BipwRCk(context, 17170462), lLsIOxFFo.q3BipwRCk(context, 17170463), lLsIOxFFo.q3BipwRCk(context, 17170464), lLsIOxFFo.q3BipwRCk(context, 17170465), lLsIOxFFo.q3BipwRCk(context, 17170466), lLsIOxFFo.q3BipwRCk(context, 17170467), lLsIOxFFo.q3BipwRCk(context, 17170468), lLsIOxFFo.q3BipwRCk(context, 17170469), lLsIOxFFo.q3BipwRCk(context, 17170470), lLsIOxFFo.q3BipwRCk(context, 17170471), lLsIOxFFo.q3BipwRCk(context, 17170472), lLsIOxFFo.q3BipwRCk(context, 17170473), lLsIOxFFo.q3BipwRCk(context, 17170474), lLsIOxFFo.q3BipwRCk(context, 17170475), lLsIOxFFo.q3BipwRCk(context, 17170476), lLsIOxFFo.q3BipwRCk(context, 17170477), lLsIOxFFo.q3BipwRCk(context, 17170478), lLsIOxFFo.q3BipwRCk(context, 17170479), lLsIOxFFo.q3BipwRCk(context, 17170480), lLsIOxFFo.q3BipwRCk(context, 17170481), lLsIOxFFo.q3BipwRCk(context, 17170482), lLsIOxFFo.q3BipwRCk(context, 17170483), lLsIOxFFo.q3BipwRCk(context, 17170484), lLsIOxFFo.q3BipwRCk(context, 17170485), lLsIOxFFo.q3BipwRCk(context, 17170486), lLsIOxFFo.q3BipwRCk(context, 17170487), lLsIOxFFo.q3BipwRCk(context, 17170488), lLsIOxFFo.q3BipwRCk(context, 17170489), lLsIOxFFo.q3BipwRCk(context, 17170490), lLsIOxFFo.q3BipwRCk(context, 17170491), lLsIOxFFo.q3BipwRCk(context, 17170492), lLsIOxFFo.q3BipwRCk(context, 17170493), lLsIOxFFo.q3BipwRCk(context, 17170494), lLsIOxFFo.q3BipwRCk(context, 17170495), lLsIOxFFo.q3BipwRCk(context, 17170496), lLsIOxFFo.q3BipwRCk(context, 17170497), lLsIOxFFo.q3BipwRCk(context, 17170498), lLsIOxFFo.q3BipwRCk(context, 17170499), lLsIOxFFo.q3BipwRCk(context, 17170500), lLsIOxFFo.q3BipwRCk(context, 17170501), lLsIOxFFo.q3BipwRCk(context, 17170502), lLsIOxFFo.q3BipwRCk(context, 17170503), lLsIOxFFo.q3BipwRCk(context, 17170504), lLsIOxFFo.q3BipwRCk(context, 17170505), lLsIOxFFo.q3BipwRCk(context, 17170506), lLsIOxFFo.q3BipwRCk(context, 17170507), lLsIOxFFo.q3BipwRCk(context, 17170508), lLsIOxFFo.q3BipwRCk(context, 17170509), lLsIOxFFo.q3BipwRCk(context, 17170510), lLsIOxFFo.q3BipwRCk(context, 17170511), lLsIOxFFo.q3BipwRCk(context, 17170512), lLsIOxFFo.q3BipwRCk(context, 17170513), lLsIOxFFo.q3BipwRCk(context, 17170514), lLsIOxFFo.q3BipwRCk(context, 17170515), lLsIOxFFo.q3BipwRCk(context, 17170516), lLsIOxFFo.q3BipwRCk(context, 17170517), lLsIOxFFo.q3BipwRCk(context, 17170518), lLsIOxFFo.q3BipwRCk(context, 17170519), lLsIOxFFo.q3BipwRCk(context, 17170520), lLsIOxFFo.q3BipwRCk(context, 17170521), lLsIOxFFo.q3BipwRCk(context, 17170522), lLsIOxFFo.q3BipwRCk(context, 17170523), lLsIOxFFo.q3BipwRCk(context, 17170524), lLsIOxFFo.q3BipwRCk(context, 17170525), null);
    }

    public static final long kmSgne1rO(long j, float f) {
        return ODug2UCW1.q3BipwRCk(Math.max(0.0f, yDwaznigW.J4Ux7ym32(j) - f), Math.max(0.0f, yDwaznigW.tGV7Q6urW(j) - f));
    }

    public static InputConnection oon79WMrY(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return inputConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01fe A[LOOP:0: B:126:0x01c7->B:138:0x01fe, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x020c A[EDGE_INSN: B:174:0x020c->B:140:0x020c ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void q3BipwRCk(joIJ4ANvK joij4anvk, BgIsSUB3d bgIsSUB3d, GjhoS54Hf gjhoS54Hf, PmanMZxiM pmanMZxiM, int i, boolean z, int i2, Map map, rJ0s9PfCL rj0s9pfcl, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        PmanMZxiM pmanMZxiM2;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        Map map2;
        int i13;
        boolean z3;
        int i14;
        PmanMZxiM pmanMZxiM3;
        GjhoS54Hf gjhoS54Hf2;
        BgIsSUB3d bgIsSUB3d2;
        int i15;
        boolean z4;
        int i16;
        GjhoS54Hf gjhoS54Hf3;
        BgIsSUB3d bgIsSUB3d3;
        PmanMZxiM pmanMZxiM4;
        Map map3;
        int i17;
        long j;
        PmanMZxiM pmanMZxiM5;
        int i18;
        n4f84B5OG n4f84b5og;
        List list;
        int i19;
        vtNW2XFzs vtnw2xfzs;
        long j2;
        Map map4;
        PmanMZxiM pmanMZxiM6;
        xnuGrZOEO xnugrzoeo;
        boolean z5;
        Object obj;
        boolean z6;
        GjhoS54Hf gjhoS54Hf4;
        Map map5;
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(959241330);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 14) == 0) {
            i5 = (wpxpbwg1j.iiGwOFFnr(joij4anvk) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i20 = i4 & 2;
        if (i20 != 0) {
            i5 |= 48;
        } else if ((i3 & 112) == 0) {
            i5 |= wpxpbwg1j.iiGwOFFnr(bgIsSUB3d) ? 32 : 16;
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else if ((i3 & 896) == 0) {
                i5 |= wpxpbwg1j.iiGwOFFnr(gjhoS54Hf) ? 256 : 128;
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else if ((i3 & 7168) == 0) {
                    pmanMZxiM2 = pmanMZxiM;
                    i5 |= wpxpbwg1j.iiGwOFFnr(pmanMZxiM2) ? 2048 : 1024;
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= 24576;
                    } else if ((57344 & i3) == 0) {
                        i9 = i;
                        i5 |= wpxpbwg1j.dIocxURUo(i9) ? 16384 : 8192;
                        i10 = i4 & 32;
                        if (i10 != 0) {
                            i5 |= 196608;
                        } else if ((458752 & i3) == 0) {
                            z2 = z;
                            i5 |= wpxpbwg1j.GPLPRo6go(z2) ? 131072 : 65536;
                            i11 = i4 & 64;
                            if (i11 == 0) {
                                i5 |= 1572864;
                            } else if ((i3 & 3670016) == 0) {
                                i5 |= wpxpbwg1j.dIocxURUo(i2) ? 1048576 : 524288;
                            }
                            i12 = i4 & 128;
                            if (i12 != 0) {
                                i5 |= 4194304;
                            }
                            if (((~i4) & 128) == 0 || ((23967451 & i5) ^ 4793490) != 0 || !wpxpbwg1j.i8XZMQc6Z()) {
                                wpxpbwg1j.TyB1UUd72();
                                if ((i3 & 1) != 0 || wpxpbwg1j.WaUP0CF08()) {
                                    BgIsSUB3d bgIsSUB3d4 = i20 == 0 ? H11ySchUh.CBQ5d1kRq : bgIsSUB3d;
                                    if (i6 == 0) {
                                        Q4TFMtvSV q4TFMtvSV = GjhoS54Hf.Eeka1udhb;
                                        gjhoS54Hf4 = GjhoS54Hf.dXrmkklc8;
                                    } else {
                                        gjhoS54Hf4 = gjhoS54Hf;
                                    }
                                    if (i7 != 0) {
                                        pmanMZxiM2 = MAu0ncfVP.kmSgne1rO;
                                    }
                                    if (i8 != 0) {
                                        i9 = 1;
                                    }
                                    if (i10 != 0) {
                                        z2 = true;
                                    }
                                    int i21 = i11 == 0 ? Integer.MAX_VALUE : i2;
                                    if (i12 == 0) {
                                        map5 = dmnvfTTyg.CBQ5d1kRq;
                                        i5 &= -29360129;
                                    } else {
                                        map5 = map;
                                    }
                                    i17 = i5;
                                    gjhoS54Hf3 = gjhoS54Hf4;
                                    i15 = i21;
                                    pmanMZxiM4 = pmanMZxiM2;
                                    i16 = i9;
                                    z4 = z2;
                                    bgIsSUB3d3 = bgIsSUB3d4;
                                    map3 = map5;
                                } else {
                                    wpxpbwg1j.igRQEZxnW();
                                    if (i12 != 0) {
                                        i5 &= -29360129;
                                    }
                                    gjhoS54Hf3 = gjhoS54Hf;
                                    i15 = i2;
                                    i17 = i5;
                                    pmanMZxiM4 = pmanMZxiM2;
                                    i16 = i9;
                                    z4 = z2;
                                    bgIsSUB3d3 = bgIsSUB3d;
                                    map3 = map;
                                }
                                wpxpbwg1j.qVUwofr5s();
                                if (!(i15 <= 0)) {
                                    vtNW2XFzs vtnw2xfzs2 = (vtNW2XFzs) wpxpbwg1j.oon79WMrY(TwG0AZwit.q3BipwRCk);
                                    AU29aHa4X aU29aHa4X = (AU29aHa4X) wpxpbwg1j.oon79WMrY(PxtnQGBQi.kCA6Zs9sL);
                                    C2cgp32t9 c2cgp32t9 = (C2cgp32t9) wpxpbwg1j.oon79WMrY(PxtnQGBQi.GPLPRo6go);
                                    long j3 = ((exL1qvzlc) wpxpbwg1j.oon79WMrY(KwPZJNJfx.q3BipwRCk)).J4Ux7ym32;
                                    n4f84B5OG n4f84b5og2 = xL84NgKtE.q3BipwRCk;
                                    if (map3.isEmpty()) {
                                        n4f84b5og = xL84NgKtE.q3BipwRCk;
                                        j = j3;
                                        i18 = i17;
                                        pmanMZxiM5 = pmanMZxiM4;
                                    } else {
                                        int length = joij4anvk.length();
                                        List list2 = joij4anvk.PSTqBLTET;
                                        ArrayList arrayList = new ArrayList(list2.size());
                                        int size = list2.size() - 1;
                                        if (size >= 0) {
                                            int i22 = 0;
                                            j = j3;
                                            while (true) {
                                                int i23 = i22 + 1;
                                                Object obj2 = list2.get(i22);
                                                lzuuVzcu0 lzuuvzcu0 = (lzuuVzcu0) obj2;
                                                i18 = i17;
                                                if (lzuuvzcu0.q3BipwRCk instanceof String) {
                                                    pmanMZxiM5 = pmanMZxiM4;
                                                    if (anXlDk6fV.tGV7Q6urW("androidx.compose.foundation.text.inlineContent", lzuuvzcu0.dIocxURUo) && SXpWpmH9A.tGV7Q6urW(0, length, lzuuvzcu0.J4Ux7ym32, lzuuvzcu0.tGV7Q6urW)) {
                                                        z6 = true;
                                                        if (z6) {
                                                            arrayList.add(obj2);
                                                        }
                                                        if (i23 <= size) {
                                                            break;
                                                        }
                                                        i22 = i23;
                                                        list2 = list2;
                                                        i17 = i18;
                                                        pmanMZxiM4 = pmanMZxiM5;
                                                    }
                                                } else {
                                                    pmanMZxiM5 = pmanMZxiM4;
                                                }
                                                z6 = false;
                                                if (z6) {
                                                }
                                                if (i23 <= size) {
                                                }
                                            }
                                        } else {
                                            j = j3;
                                            i18 = i17;
                                            pmanMZxiM5 = pmanMZxiM4;
                                        }
                                        ArrayList arrayList2 = new ArrayList();
                                        ArrayList arrayList3 = new ArrayList();
                                        int size2 = arrayList.size() - 1;
                                        if (size2 >= 0) {
                                            int i24 = 0;
                                            while (true) {
                                                int i25 = i24 + 1;
                                                K6PL0z3I0.q3BipwRCk(map3.get(((lzuuVzcu0) arrayList.get(i24)).q3BipwRCk));
                                                if (i25 > size2) {
                                                    break;
                                                }
                                                i24 = i25;
                                            }
                                        }
                                        n4f84b5og = new n4f84B5OG(arrayList2, arrayList3);
                                    }
                                    List list3 = (List) n4f84b5og.CBQ5d1kRq;
                                    List list4 = (List) n4f84b5og.kmSgne1rO;
                                    boolean z7 = false;
                                    MAZDnzQe5 mAZDnzQe5 = new MAZDnzQe5(vtnw2xfzs2);
                                    GQN3dSqKV gQN3dSqKV = GQN3dSqKV.dfpT1j18n;
                                    B6IRYLW14 b6irylw14 = IaRtW3OEX.q3BipwRCk;
                                    long longValue = ((Number) uI1r9gOOH.q3BipwRCk(new Object[]{joij4anvk, vtnw2xfzs2}, new B6IRYLW14(mAZDnzQe5, gQN3dSqKV), null, new n2FlsPL4M(vtnw2xfzs2, 1), wpxpbwg1j, 4)).longValue();
                                    wpxpbwg1j.zHl31GGXU(-3687241);
                                    Object dfpT1j18n = wpxpbwg1j.dfpT1j18n();
                                    if (dfpT1j18n == P7Re99G8L.J4Ux7ym32) {
                                        j2 = j;
                                        vtnw2xfzs = vtnw2xfzs2;
                                        i19 = i18;
                                        map4 = map3;
                                        list = list4;
                                        pmanMZxiM6 = pmanMZxiM5;
                                        dfpT1j18n = new wQYV02pDG(new xnuGrZOEO(new icKZ1RJnW(joij4anvk, gjhoS54Hf3, i15, z4, i16, aU29aHa4X, c2cgp32t9, list3, (dnBSj5uJN) null), longValue));
                                        wpxpbwg1j.INnK5Rew6(dfpT1j18n);
                                        z7 = false;
                                    } else {
                                        j2 = j;
                                        vtnw2xfzs = vtnw2xfzs2;
                                        list = list4;
                                        i19 = i18;
                                        pmanMZxiM6 = pmanMZxiM5;
                                        map4 = map3;
                                    }
                                    wpxpbwg1j.ilHKhw3Yw(z7);
                                    wQYV02pDG wqyv02pdg = (wQYV02pDG) dfpT1j18n;
                                    xnuGrZOEO xnugrzoeo2 = wqyv02pdg.CBQ5d1kRq;
                                    if (!wpxpbwg1j.vNtjxmzUM) {
                                        xnugrzoeo = xnugrzoeo2;
                                        xnugrzoeo.q3BipwRCk = xL84NgKtE.J4Ux7ym32(xnugrzoeo2.q3BipwRCk, joij4anvk, gjhoS54Hf3, aU29aHa4X, c2cgp32t9, z4, i16, i15, list3);
                                    } else {
                                        xnugrzoeo = xnugrzoeo2;
                                    }
                                    xnugrzoeo.tGV7Q6urW = pmanMZxiM6;
                                    xnugrzoeo.Puu3Rhg4F = j2;
                                    wqyv02pdg.kCA6Zs9sL(vtnw2xfzs);
                                    if (list.isEmpty()) {
                                        e5NMC9BSx e5nmc9bsx = e5NMC9BSx.q3BipwRCk;
                                        obj = e5NMC9BSx.J4Ux7ym32;
                                        z5 = true;
                                    } else {
                                        obj = xpuSUT7Gh.qFBXIgpia(wpxpbwg1j, -819900852, true, new ezCLJU3uo(joij4anvk, list, i19, 0));
                                        z5 = true;
                                    }
                                    BgIsSUB3d WaUP0CF08 = bgIsSUB3d3.WaUP0CF08(wqyv02pdg.MzoOEjc4X.WaUP0CF08(wqyv02pdg.ilHKhw3Yw));
                                    nBnrGO77H nbnrgo77h = wqyv02pdg.PSTqBLTET;
                                    wpxpbwg1j.zHl31GGXU(1376089394);
                                    AU29aHa4X aU29aHa4X2 = (AU29aHa4X) wpxpbwg1j.oon79WMrY(PxtnQGBQi.kCA6Zs9sL);
                                    BFRsKhrQv bFRsKhrQv = (BFRsKhrQv) wpxpbwg1j.oon79WMrY(PxtnQGBQi.oon79WMrY);
                                    fCkNY70T9 fckny70t9 = (fCkNY70T9) wpxpbwg1j.oon79WMrY(PxtnQGBQi.Bhmn1KIah);
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
                                        wpxpbwg1j.WaUP0CF08 = false;
                                        pz7YPhQTU.WaUP0CF08(wpxpbwg1j, nbnrgo77h, xUKgrGMGQ.kCA6Zs9sL);
                                        pz7YPhQTU.WaUP0CF08(wpxpbwg1j, aU29aHa4X2, xUKgrGMGQ.dIocxURUo);
                                        pz7YPhQTU.WaUP0CF08(wpxpbwg1j, bFRsKhrQv, xUKgrGMGQ.iiGwOFFnr);
                                        pz7YPhQTU.WaUP0CF08(wpxpbwg1j, fckny70t9, xUKgrGMGQ.GPLPRo6go);
                                        wpxpbwg1j.MzoOEjc4X();
                                        ((J9LUUfNUi) IzM1cD9ly).sk5s77z6Q(new uFLsTIS9C(wpxpbwg1j), wpxpbwg1j, 0);
                                        wpxpbwg1j.zHl31GGXU(2058660585);
                                        ((J9LUUfNUi) obj).WaUP0CF08(wpxpbwg1j, 0);
                                        wpxpbwg1j.ilHKhw3Yw(false);
                                        wpxpbwg1j.ilHKhw3Yw(z5);
                                        wpxpbwg1j.ilHKhw3Yw(false);
                                        pmanMZxiM3 = pmanMZxiM6;
                                        bgIsSUB3d2 = bgIsSUB3d3;
                                        gjhoS54Hf2 = gjhoS54Hf3;
                                        i14 = i16;
                                        z3 = z4;
                                        i13 = i15;
                                        map2 = map4;
                                    } else {
                                        xpuSUT7Gh.j22ftfeNI();
                                        throw null;
                                    }
                                } else {
                                    throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                                }
                            } else {
                                wpxpbwg1j.igRQEZxnW();
                                bgIsSUB3d2 = bgIsSUB3d;
                                gjhoS54Hf2 = gjhoS54Hf;
                                i13 = i2;
                                pmanMZxiM3 = pmanMZxiM2;
                                i14 = i9;
                                z3 = z2;
                                map2 = map;
                            }
                            rESgwfV20 Eeka1udhb = wpxpbwg1j.Eeka1udhb();
                            if (Eeka1udhb != null) {
                                Eeka1udhb.dIocxURUo = new EDXLlsWLF(joij4anvk, bgIsSUB3d2, gjhoS54Hf2, pmanMZxiM3, i14, z3, i13, map2, i3, i4);
                                return;
                            }
                            return;
                        }
                        z2 = z;
                        i11 = i4 & 64;
                        if (i11 == 0) {
                        }
                        i12 = i4 & 128;
                        if (i12 != 0) {
                        }
                        if (((~i4) & 128) == 0) {
                        }
                        wpxpbwg1j.TyB1UUd72();
                        if ((i3 & 1) != 0) {
                        }
                        if (i20 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i10 != 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        i17 = i5;
                        gjhoS54Hf3 = gjhoS54Hf4;
                        i15 = i21;
                        pmanMZxiM4 = pmanMZxiM2;
                        i16 = i9;
                        z4 = z2;
                        bgIsSUB3d3 = bgIsSUB3d4;
                        map3 = map5;
                        wpxpbwg1j.qVUwofr5s();
                        if (!(i15 <= 0)) {
                        }
                    }
                    i9 = i;
                    i10 = i4 & 32;
                    if (i10 != 0) {
                    }
                    z2 = z;
                    i11 = i4 & 64;
                    if (i11 == 0) {
                    }
                    i12 = i4 & 128;
                    if (i12 != 0) {
                    }
                    if (((~i4) & 128) == 0) {
                    }
                    wpxpbwg1j.TyB1UUd72();
                    if ((i3 & 1) != 0) {
                    }
                    if (i20 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i12 == 0) {
                    }
                    i17 = i5;
                    gjhoS54Hf3 = gjhoS54Hf4;
                    i15 = i21;
                    pmanMZxiM4 = pmanMZxiM2;
                    i16 = i9;
                    z4 = z2;
                    bgIsSUB3d3 = bgIsSUB3d4;
                    map3 = map5;
                    wpxpbwg1j.qVUwofr5s();
                    if (!(i15 <= 0)) {
                    }
                }
                pmanMZxiM2 = pmanMZxiM;
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i;
                i10 = i4 & 32;
                if (i10 != 0) {
                }
                z2 = z;
                i11 = i4 & 64;
                if (i11 == 0) {
                }
                i12 = i4 & 128;
                if (i12 != 0) {
                }
                if (((~i4) & 128) == 0) {
                }
                wpxpbwg1j.TyB1UUd72();
                if ((i3 & 1) != 0) {
                }
                if (i20 == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (i11 == 0) {
                }
                if (i12 == 0) {
                }
                i17 = i5;
                gjhoS54Hf3 = gjhoS54Hf4;
                i15 = i21;
                pmanMZxiM4 = pmanMZxiM2;
                i16 = i9;
                z4 = z2;
                bgIsSUB3d3 = bgIsSUB3d4;
                map3 = map5;
                wpxpbwg1j.qVUwofr5s();
                if (!(i15 <= 0)) {
                }
            }
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            pmanMZxiM2 = pmanMZxiM;
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i;
            i10 = i4 & 32;
            if (i10 != 0) {
            }
            z2 = z;
            i11 = i4 & 64;
            if (i11 == 0) {
            }
            i12 = i4 & 128;
            if (i12 != 0) {
            }
            if (((~i4) & 128) == 0) {
            }
            wpxpbwg1j.TyB1UUd72();
            if ((i3 & 1) != 0) {
            }
            if (i20 == 0) {
            }
            if (i6 == 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i11 == 0) {
            }
            if (i12 == 0) {
            }
            i17 = i5;
            gjhoS54Hf3 = gjhoS54Hf4;
            i15 = i21;
            pmanMZxiM4 = pmanMZxiM2;
            i16 = i9;
            z4 = z2;
            bgIsSUB3d3 = bgIsSUB3d4;
            map3 = map5;
            wpxpbwg1j.qVUwofr5s();
            if (!(i15 <= 0)) {
            }
        }
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        pmanMZxiM2 = pmanMZxiM;
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i;
        i10 = i4 & 32;
        if (i10 != 0) {
        }
        z2 = z;
        i11 = i4 & 64;
        if (i11 == 0) {
        }
        i12 = i4 & 128;
        if (i12 != 0) {
        }
        if (((~i4) & 128) == 0) {
        }
        wpxpbwg1j.TyB1UUd72();
        if ((i3 & 1) != 0) {
        }
        if (i20 == 0) {
        }
        if (i6 == 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i11 == 0) {
        }
        if (i12 == 0) {
        }
        i17 = i5;
        gjhoS54Hf3 = gjhoS54Hf4;
        i15 = i21;
        pmanMZxiM4 = pmanMZxiM2;
        i16 = i9;
        z4 = z2;
        bgIsSUB3d3 = bgIsSUB3d4;
        map3 = map5;
        wpxpbwg1j.qVUwofr5s();
        if (!(i15 <= 0)) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
        if (r1 == con.P7Re99G8L.J4Ux7ym32) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void tGV7Q6urW(mKU9R6cnm mku9r6cnm, bb216AtXv bb216atxv, ZiaC7TNf1 ziaC7TNf1, pW31wYUjR pw31wyujr, rJ0s9PfCL rj0s9pfcl, int i) {
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(-649386156);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        wpXpbWG1J wpxpbwg1j2 = wpxpbwg1j;
        View view = (View) wpxpbwg1j2.oon79WMrY(KApR71V3i.iiGwOFFnr);
        wpxpbwg1j2.zHl31GGXU(-3686095);
        boolean iiGwOFFnr = wpxpbwg1j2.iiGwOFFnr(pw31wyujr) | wpxpbwg1j2.iiGwOFFnr(mku9r6cnm) | wpxpbwg1j2.iiGwOFFnr(view);
        Object dfpT1j18n = wpxpbwg1j2.dfpT1j18n();
        if (!iiGwOFFnr) {
            int i2 = rJ0s9PfCL.q3BipwRCk;
        }
        wpxpbwg1j2.INnK5Rew6(new WTGSMK63e(mku9r6cnm, bb216atxv, pw31wyujr, ziaC7TNf1, view));
        wpxpbwg1j2.ilHKhw3Yw(false);
        rESgwfV20 Eeka1udhb = wpxpbwg1j2.Eeka1udhb();
        if (Eeka1udhb != null) {
            Eeka1udhb.dIocxURUo = new Z8l8H7cKR(mku9r6cnm, bb216atxv, ziaC7TNf1, pw31wyujr, i);
        }
    }

    public static final Object[] vPSbyrYWX(Object obj) {
        Object[] objArr = new Object[32];
        objArr[0] = obj;
        return objArr;
    }

    public static final RFvh4RAur yWvV4ePLl(R7CNZOOL2 r7cnzool2) {
        RFvh4RAur rFvh4RAur = (RFvh4RAur) r7cnzool2.q3BipwRCk;
        if (rFvh4RAur != null) {
            return rFvh4RAur;
        }
        RFvh4RAur rFvh4RAur2 = new RFvh4RAur(null, null, null, null, 15);
        r7cnzool2.q3BipwRCk = rFvh4RAur2;
        return rFvh4RAur2;
    }
}
