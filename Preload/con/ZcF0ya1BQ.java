package con;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class ZcF0ya1BQ {
    public boolean GPLPRo6go;
    public jn7EwGOqN Puu3Rhg4F;
    public boolean iiGwOFFnr;
    public Q2LDBN4BW kCA6Zs9sL;
    public final PmanMZxiM q3BipwRCk;
    public final kkcQgCx5G J4Ux7ym32 = new MAZDnzQe5(this);
    public final PmanMZxiM tGV7Q6urW = new kO9ZKjPiu(this);
    public final pnuAOe8oh dIocxURUo = new pnuAOe8oh(new jn7EwGOqN[16], 0);

    public ZcF0ya1BQ(PmanMZxiM pmanMZxiM) {
        this.q3BipwRCk = pmanMZxiM;
    }

    public final void J4Ux7ym32(Object obj, PmanMZxiM pmanMZxiM, gdEmqfwpT gdemqfwpt) {
        int i;
        jn7EwGOqN jn7ewgoqn;
        jn7EwGOqN jn7ewgoqn2;
        jn7EwGOqN jn7ewgoqn3;
        Object obj2;
        boolean z;
        int i2;
        s05BzCoHq s05bzcohq;
        s05BzCoHq Puu3Rhg4F;
        YcVx1OAEe ycVx1OAEe;
        PmanMZxiM pmanMZxiM2;
        int i3;
        jn7EwGOqN jn7ewgoqn4 = this.Puu3Rhg4F;
        boolean z2 = this.GPLPRo6go;
        synchronized (this.dIocxURUo) {
            pnuAOe8oh pnuaoe8oh = this.dIocxURUo;
            int i4 = pnuaoe8oh.Bhmn1KIah;
            if (i4 > 0) {
                Object[] objArr = pnuaoe8oh.CBQ5d1kRq;
                i = 0;
                do {
                    if (((jn7EwGOqN) objArr[i]).q3BipwRCk == pmanMZxiM) {
                        break;
                    }
                    i++;
                } while (i < i4);
                i = -1;
            } else {
                i = -1;
            }
            if (i == -1) {
                jn7ewgoqn = new jn7EwGOqN(pmanMZxiM);
                this.dIocxURUo.J4Ux7ym32(jn7ewgoqn);
            } else {
                jn7ewgoqn = (jn7EwGOqN) this.dIocxURUo.CBQ5d1kRq[i];
            }
        }
        Object obj3 = jn7ewgoqn.dIocxURUo;
        jn7ewgoqn.dIocxURUo = obj;
        this.Puu3Rhg4F = jn7ewgoqn;
        this.GPLPRo6go = false;
        synchronized (this.dIocxURUo) {
            Y6HEag5Dd y6HEag5Dd = jn7ewgoqn.J4Ux7ym32;
            int i5 = y6HEag5Dd.dIocxURUo;
            if (i5 > 0) {
                int i6 = 0;
                i2 = 0;
                while (true) {
                    int i7 = i6 + 1;
                    int i8 = y6HEag5Dd.q3BipwRCk[i6];
                    OavOIaZo5 oavOIaZo5 = y6HEag5Dd.tGV7Q6urW[i8];
                    int i9 = oavOIaZo5.CBQ5d1kRq;
                    if (i9 > 0) {
                        z = z2;
                        i3 = 0;
                        int i10 = 0;
                        while (true) {
                            obj2 = obj3;
                            int i11 = i10 + 1;
                            jn7ewgoqn3 = jn7ewgoqn;
                            Object[] objArr2 = oavOIaZo5.kmSgne1rO;
                            jn7ewgoqn2 = jn7ewgoqn4;
                            Object obj4 = objArr2[i10];
                            if (obj4 != null) {
                                if (!(obj4 == obj)) {
                                    if (i3 != i10) {
                                        objArr2[i3] = obj4;
                                    }
                                    i3++;
                                }
                                if (i11 >= i9) {
                                    break;
                                }
                                i10 = i11;
                                obj3 = obj2;
                                jn7ewgoqn = jn7ewgoqn3;
                                jn7ewgoqn4 = jn7ewgoqn2;
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            }
                        }
                    } else {
                        obj2 = obj3;
                        jn7ewgoqn2 = jn7ewgoqn4;
                        z = z2;
                        jn7ewgoqn3 = jn7ewgoqn;
                        i3 = 0;
                    }
                    int i12 = oavOIaZo5.CBQ5d1kRq;
                    if (i3 < i12) {
                        int i13 = i3;
                        while (true) {
                            int i14 = i13 + 1;
                            oavOIaZo5.kmSgne1rO[i13] = null;
                            if (i14 >= i12) {
                                break;
                            }
                            i13 = i14;
                        }
                    }
                    oavOIaZo5.CBQ5d1kRq = i3;
                    if (i3 > 0) {
                        if (i2 != i6) {
                            int[] iArr = y6HEag5Dd.q3BipwRCk;
                            int i15 = iArr[i2];
                            iArr[i2] = i8;
                            iArr[i6] = i15;
                        }
                        i2++;
                    }
                    if (i7 >= i5) {
                        break;
                    }
                    i6 = i7;
                    z2 = z;
                    obj3 = obj2;
                    jn7ewgoqn = jn7ewgoqn3;
                    jn7ewgoqn4 = jn7ewgoqn2;
                }
            } else {
                obj2 = obj3;
                jn7ewgoqn2 = jn7ewgoqn4;
                z = z2;
                jn7ewgoqn3 = jn7ewgoqn;
                i2 = 0;
            }
            int i16 = y6HEag5Dd.dIocxURUo;
            if (i2 < i16) {
                int i17 = i2;
                while (true) {
                    int i18 = i17 + 1;
                    y6HEag5Dd.J4Ux7ym32[y6HEag5Dd.q3BipwRCk[i17]] = null;
                    if (i18 >= i16) {
                        break;
                    }
                    i17 = i18;
                }
            }
            y6HEag5Dd.dIocxURUo = i2;
        }
        if (!this.iiGwOFFnr) {
            this.iiGwOFFnr = true;
            try {
                PmanMZxiM pmanMZxiM3 = this.tGV7Q6urW;
                if (pmanMZxiM3 == null) {
                    gdemqfwpt.GPLPRo6go();
                } else {
                    PlegqbMSA plegqbMSA = UvOuyIFuT.q3BipwRCk;
                    s05BzCoHq s05bzcohq2 = (s05BzCoHq) plegqbMSA.kCA6Zs9sL();
                    try {
                        if (s05bzcohq2 != null && !(s05bzcohq2 instanceof YcVx1OAEe)) {
                            s05bzcohq = s05bzcohq2.PSTqBLTET(pmanMZxiM3);
                            Puu3Rhg4F = s05bzcohq.Puu3Rhg4F();
                            gdemqfwpt.GPLPRo6go();
                            plegqbMSA.CBQ5d1kRq(Puu3Rhg4F);
                            s05bzcohq.J4Ux7ym32();
                        }
                        gdemqfwpt.GPLPRo6go();
                        plegqbMSA.CBQ5d1kRq(Puu3Rhg4F);
                        s05bzcohq.J4Ux7ym32();
                    } catch (Throwable th) {
                        UvOuyIFuT.q3BipwRCk.CBQ5d1kRq(Puu3Rhg4F);
                        throw th;
                    }
                    if (s05bzcohq2 instanceof YcVx1OAEe) {
                        ycVx1OAEe = (YcVx1OAEe) s05bzcohq2;
                        pmanMZxiM2 = null;
                    } else {
                        pmanMZxiM2 = null;
                        ycVx1OAEe = null;
                    }
                    s05bzcohq = new eoAKsyaIj(ycVx1OAEe, pmanMZxiM3, pmanMZxiM2);
                    Puu3Rhg4F = s05bzcohq.Puu3Rhg4F();
                }
                this.iiGwOFFnr = false;
            } catch (Throwable th2) {
                this.iiGwOFFnr = false;
                throw th2;
            }
        } else {
            gdemqfwpt.GPLPRo6go();
        }
        this.Puu3Rhg4F = jn7ewgoqn2;
        jn7ewgoqn3.dIocxURUo = obj2;
        this.GPLPRo6go = z;
    }

    public final void q3BipwRCk() {
        synchronized (this.dIocxURUo) {
            pnuAOe8oh pnuaoe8oh = this.dIocxURUo;
            int i = pnuaoe8oh.Bhmn1KIah;
            if (i > 0) {
                Object[] objArr = pnuaoe8oh.CBQ5d1kRq;
                int i2 = 0;
                do {
                    Y6HEag5Dd y6HEag5Dd = ((jn7EwGOqN) objArr[i2]).J4Ux7ym32;
                    int length = y6HEag5Dd.tGV7Q6urW.length;
                    if (length > 0) {
                        int i3 = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            OavOIaZo5 oavOIaZo5 = y6HEag5Dd.tGV7Q6urW[i3];
                            if (oavOIaZo5 != null) {
                                oavOIaZo5.clear();
                            }
                            y6HEag5Dd.q3BipwRCk[i3] = i3;
                            y6HEag5Dd.J4Ux7ym32[i3] = null;
                            if (i4 >= length) {
                                break;
                            }
                            i3 = i4;
                        }
                    }
                    y6HEag5Dd.dIocxURUo = 0;
                    i2++;
                } while (i2 < i);
            }
        }
    }

    public final void tGV7Q6urW() {
        kkcQgCx5G kkcqgcx5g = this.J4Ux7ym32;
        PlegqbMSA plegqbMSA = UvOuyIFuT.q3BipwRCk;
        UvOuyIFuT.iiGwOFFnr(JHFXdtjfx.dfpT1j18n);
        synchronized (UvOuyIFuT.J4Ux7ym32) {
            ((ArrayList) UvOuyIFuT.kCA6Zs9sL).add(kkcqgcx5g);
        }
        this.kCA6Zs9sL = new WvYaaMLyO(kkcqgcx5g);
    }
}
