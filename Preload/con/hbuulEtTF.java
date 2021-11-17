package con;

import java.util.Objects;
/* loaded from: classes.dex */
public final class hbuulEtTF extends Wk9bO57s4 implements kkcQgCx5G {
    public final /* synthetic */ pLYbCSTk0 Bhmn1KIah;
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbuulEtTF(pLYbCSTk0 plybcstk0, int i) {
        super(2);
        this.kmSgne1rO = i;
        if (i != 1) {
            this.Bhmn1KIah = plybcstk0;
            return;
        }
        this.Bhmn1KIah = plybcstk0;
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // con.kkcQgCx5G
    /* Code decompiled incorrectly, please refer to instructions dump */
    public Object WaUP0CF08(Object obj, Object obj2) {
        n0Qzow0z6 n0qzow0z6;
        int i;
        Cb827Z4La cb827Z4La;
        Cb827Z4La cb827Z4La2 = null;
        switch (this.kmSgne1rO) {
            case 0:
                qih4lW99W qih4lw99w = (qih4lW99W) obj;
                azsj7uixB azsj7uixb = (azsj7uixB) obj2;
                pnuAOe8oh pnuaoe8oh = this.Bhmn1KIah.RG6kpfv3v;
                int i2 = pnuaoe8oh.Bhmn1KIah;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    ?? r12 = pnuaoe8oh.CBQ5d1kRq;
                    do {
                        cb827Z4La = r12[i3];
                        Cb827Z4La cb827Z4La3 = (Cb827Z4La) cb827Z4La;
                        if (!(cb827Z4La3.XGA7b0zuB() == azsj7uixb && !cb827Z4La3.i0Zug1mVk)) {
                            i3--;
                        }
                    } while (i3 >= 0);
                    cb827Z4La = null;
                } else {
                    cb827Z4La = null;
                }
                Cb827Z4La cb827Z4La4 = cb827Z4La;
                while (cb827Z4La4 != null) {
                    cb827Z4La4.i0Zug1mVk = true;
                    if (cb827Z4La4.vNtjxmzUM) {
                        qhaZGYFO8 qhazgyfo8 = cb827Z4La4.ilHKhw3Yw;
                        if (qhazgyfo8 instanceof Cb827Z4La) {
                            cb827Z4La4 = (Cb827Z4La) qhazgyfo8;
                        }
                    }
                    cb827Z4La4 = null;
                }
                return qih4lW99W.q3BipwRCk;
            default:
                azsj7uixB azsj7uixb2 = (azsj7uixB) obj;
                qhaZGYFO8 qhazgyfo82 = (qhaZGYFO8) obj2;
                if (azsj7uixb2 instanceof mq5XS6yc8) {
                    ((mq5XS6yc8) azsj7uixb2).CBQ5d1kRq.J4Ux7ym32 = this.Bhmn1KIah;
                }
                pLYbCSTk0 plybcstk0 = this.Bhmn1KIah;
                if (!plybcstk0.RG6kpfv3v.yWvV4ePLl()) {
                    pnuAOe8oh pnuaoe8oh2 = plybcstk0.RG6kpfv3v;
                    int i4 = pnuaoe8oh2.Bhmn1KIah;
                    if (i4 > 0) {
                        i = i4 - 1;
                        Object[] objArr = pnuaoe8oh2.CBQ5d1kRq;
                        do {
                            Cb827Z4La cb827Z4La5 = (Cb827Z4La) objArr[i];
                            if (!(cb827Z4La5.i0Zug1mVk && cb827Z4La5.XGA7b0zuB() == azsj7uixb2)) {
                                i--;
                            }
                        } while (i >= 0);
                        i = -1;
                    } else {
                        i = -1;
                    }
                    if (i < 0) {
                        pnuAOe8oh pnuaoe8oh3 = plybcstk0.RG6kpfv3v;
                        int i5 = pnuaoe8oh3.Bhmn1KIah;
                        if (i5 > 0) {
                            i = i5 - 1;
                            Object[] objArr2 = pnuaoe8oh3.CBQ5d1kRq;
                            do {
                                Cb827Z4La cb827Z4La6 = (Cb827Z4La) objArr2[i];
                                if (!(!cb827Z4La6.i0Zug1mVk && anXlDk6fV.tGV7Q6urW(cb827Z4La6.XGA7b0zuB().getClass(), azsj7uixb2.getClass()))) {
                                    i--;
                                }
                            } while (i >= 0);
                            i = -1;
                        } else {
                            i = -1;
                        }
                    }
                    if (i >= 0) {
                        Cb827Z4La cb827Z4La7 = (Cb827Z4La) plybcstk0.RG6kpfv3v.CBQ5d1kRq[i];
                        cb827Z4La7.GpWTsCbvo(azsj7uixb2);
                        Cb827Z4La cb827Z4La8 = cb827Z4La7;
                        int i6 = i;
                        while (cb827Z4La8.vNtjxmzUM) {
                            i6--;
                            cb827Z4La8 = (Cb827Z4La) plybcstk0.RG6kpfv3v.CBQ5d1kRq[i6];
                            cb827Z4La8.GpWTsCbvo(azsj7uixb2);
                        }
                        pnuAOe8oh pnuaoe8oh4 = plybcstk0.RG6kpfv3v;
                        int i7 = i + 1;
                        Objects.requireNonNull(pnuaoe8oh4);
                        if (i7 > i6) {
                            int i8 = pnuaoe8oh4.Bhmn1KIah;
                            if (i7 < i8) {
                                Object[] objArr3 = pnuaoe8oh4.CBQ5d1kRq;
                                System.arraycopy(objArr3, i7, objArr3, i6, i8 - i7);
                            }
                            int i9 = pnuaoe8oh4.Bhmn1KIah;
                            int i10 = i9 - (i7 - i6);
                            int i11 = i9 - 1;
                            if (i10 <= i11) {
                                int i12 = i10;
                                while (true) {
                                    i12++;
                                    pnuaoe8oh4.CBQ5d1kRq[i12] = null;
                                    if (i12 == i11) {
                                    }
                                }
                            }
                            pnuaoe8oh4.Bhmn1KIah = i10;
                        }
                        cb827Z4La7.mUqPm6GBh = qhazgyfo82;
                        qhazgyfo82.ilHKhw3Yw = cb827Z4La7;
                        cb827Z4La2 = cb827Z4La8;
                    }
                }
                if (cb827Z4La2 == null) {
                    if (azsj7uixb2 instanceof pKrUFkOCk) {
                        n0Qzow0z6 n0qzow0z62 = new n0Qzow0z6(qhazgyfo82, (pKrUFkOCk) azsj7uixb2);
                        qhaZGYFO8 qhazgyfo83 = n0qzow0z62.mUqPm6GBh;
                        n0qzow0z6 = n0qzow0z62;
                        if (qhazgyfo82 != qhazgyfo83) {
                            ((Cb827Z4La) qhazgyfo83).vNtjxmzUM = true;
                            n0qzow0z6 = n0qzow0z62;
                        }
                    } else {
                        n0qzow0z6 = qhazgyfo82;
                    }
                    fb3DLy6Ym fb3dly6ym = n0qzow0z6;
                    if (azsj7uixb2 instanceof n0YGyIgbB) {
                        fb3DLy6Ym fb3dly6ym2 = new fb3DLy6Ym(n0qzow0z6, (n0YGyIgbB) azsj7uixb2);
                        qhaZGYFO8 qhazgyfo84 = fb3dly6ym2.mUqPm6GBh;
                        if (qhazgyfo82 != qhazgyfo84) {
                            ((Cb827Z4La) qhazgyfo84).vNtjxmzUM = true;
                        }
                        fb3dly6ym = fb3dly6ym2;
                    }
                    FxoPRWx5H fxoPRWx5H = fb3dly6ym;
                    if (azsj7uixb2 instanceof rossXWJSA) {
                        fxoPRWx5H = new FxoPRWx5H(fb3dly6ym, (rossXWJSA) azsj7uixb2);
                    }
                    KB2jjcOAK kB2jjcOAK = fxoPRWx5H;
                    if (azsj7uixb2 instanceof PKYIHi40H) {
                        KB2jjcOAK kB2jjcOAK2 = new KB2jjcOAK(fxoPRWx5H, (PKYIHi40H) azsj7uixb2);
                        qhaZGYFO8 qhazgyfo85 = kB2jjcOAK2.mUqPm6GBh;
                        if (qhazgyfo82 != qhazgyfo85) {
                            ((Cb827Z4La) qhazgyfo85).vNtjxmzUM = true;
                        }
                        kB2jjcOAK = kB2jjcOAK2;
                    }
                    L2h0tyRIW l2h0tyRIW = kB2jjcOAK;
                    if (azsj7uixb2 instanceof sfKUwXYBG) {
                        L2h0tyRIW l2h0tyRIW2 = new L2h0tyRIW(kB2jjcOAK, (sfKUwXYBG) azsj7uixb2);
                        qhaZGYFO8 qhazgyfo86 = l2h0tyRIW2.mUqPm6GBh;
                        if (qhazgyfo82 != qhazgyfo86) {
                            ((Cb827Z4La) qhazgyfo86).vNtjxmzUM = true;
                        }
                        l2h0tyRIW = l2h0tyRIW2;
                    }
                    O51H8WtkN o51H8WtkN = l2h0tyRIW;
                    if (azsj7uixb2 instanceof YRMVblbfK) {
                        O51H8WtkN o51H8WtkN2 = new O51H8WtkN(l2h0tyRIW, (YRMVblbfK) azsj7uixb2);
                        qhaZGYFO8 qhazgyfo87 = o51H8WtkN2.mUqPm6GBh;
                        if (qhazgyfo82 != qhazgyfo87) {
                            ((Cb827Z4La) qhazgyfo87).vNtjxmzUM = true;
                        }
                        o51H8WtkN = o51H8WtkN2;
                    }
                    jgMsl7cgu jgmsl7cgu = o51H8WtkN;
                    if (azsj7uixb2 instanceof Awlb99mXV) {
                        jgMsl7cgu jgmsl7cgu2 = new jgMsl7cgu(o51H8WtkN, (Awlb99mXV) azsj7uixb2);
                        qhaZGYFO8 qhazgyfo88 = jgmsl7cgu2.mUqPm6GBh;
                        if (qhazgyfo82 != qhazgyfo88) {
                            ((Cb827Z4La) qhazgyfo88).vNtjxmzUM = true;
                        }
                        jgmsl7cgu = jgmsl7cgu2;
                    }
                    jgMsl7cgu jgmsl7cgu3 = jgmsl7cgu;
                    if (azsj7uixb2 instanceof zbyfFPFas) {
                        jgMsl7cgu jgmsl7cgu4 = new jgMsl7cgu(jgmsl7cgu, (zbyfFPFas) azsj7uixb2);
                        qhaZGYFO8 qhazgyfo89 = jgmsl7cgu4.mUqPm6GBh;
                        if (qhazgyfo82 != qhazgyfo89) {
                            ((Cb827Z4La) qhazgyfo89).vNtjxmzUM = true;
                        }
                        jgmsl7cgu3 = jgmsl7cgu4;
                    }
                    vo9l1HK5r vo9l1hk5r = jgmsl7cgu3;
                    if (azsj7uixb2 instanceof meBzU0nVs) {
                        vo9l1HK5r vo9l1hk5r2 = new vo9l1HK5r(jgmsl7cgu3, (meBzU0nVs) azsj7uixb2);
                        qhaZGYFO8 qhazgyfo810 = vo9l1hk5r2.mUqPm6GBh;
                        if (qhazgyfo82 != qhazgyfo810) {
                            ((Cb827Z4La) qhazgyfo810).vNtjxmzUM = true;
                        }
                        vo9l1hk5r = vo9l1hk5r2;
                    }
                    geBR2jezJ gebr2jezj = vo9l1hk5r;
                    if (azsj7uixb2 instanceof vc1fKXGpx) {
                        geBR2jezJ gebr2jezj2 = new geBR2jezJ(vo9l1hk5r, (vc1fKXGpx) azsj7uixb2);
                        qhaZGYFO8 qhazgyfo811 = gebr2jezj2.mUqPm6GBh;
                        if (qhazgyfo82 != qhazgyfo811) {
                            ((Cb827Z4La) qhazgyfo811).vNtjxmzUM = true;
                        }
                        gebr2jezj = gebr2jezj2;
                    }
                    L2h0tyRIW l2h0tyRIW3 = gebr2jezj;
                    if (azsj7uixb2 instanceof hPR9G3M3R) {
                        L2h0tyRIW l2h0tyRIW4 = new L2h0tyRIW(gebr2jezj, (hPR9G3M3R) azsj7uixb2);
                        qhaZGYFO8 qhazgyfo812 = l2h0tyRIW4.mUqPm6GBh;
                        if (qhazgyfo82 != qhazgyfo812) {
                            ((Cb827Z4La) qhazgyfo812).vNtjxmzUM = true;
                        }
                        l2h0tyRIW3 = l2h0tyRIW4;
                    }
                    mhjbbkjEL mhjbbkjel = l2h0tyRIW3;
                    if (azsj7uixb2 instanceof GobDDNrsi) {
                        mhjbbkjEL mhjbbkjel2 = new mhjbbkjEL(l2h0tyRIW3, (GobDDNrsi) azsj7uixb2);
                        qhaZGYFO8 qhazgyfo813 = mhjbbkjel2.mUqPm6GBh;
                        if (qhazgyfo82 != qhazgyfo813) {
                            ((Cb827Z4La) qhazgyfo813).vNtjxmzUM = true;
                        }
                        mhjbbkjel = mhjbbkjel2;
                    }
                    n0Qzow0z6 n0qzow0z63 = mhjbbkjel;
                    if (azsj7uixb2 instanceof EqtLMm2mw) {
                        n0Qzow0z6 n0qzow0z64 = new n0Qzow0z6(mhjbbkjel, (EqtLMm2mw) azsj7uixb2);
                        qhaZGYFO8 qhazgyfo814 = n0qzow0z64.mUqPm6GBh;
                        if (qhazgyfo82 != qhazgyfo814) {
                            ((Cb827Z4La) qhazgyfo814).vNtjxmzUM = true;
                        }
                        n0qzow0z63 = n0qzow0z64;
                    }
                    if (!(azsj7uixb2 instanceof ZQqp9toUW)) {
                        return n0qzow0z63;
                    }
                    JKF6wk5lB jKF6wk5lB = new JKF6wk5lB(n0qzow0z63, (ZQqp9toUW) azsj7uixb2);
                    qhaZGYFO8 qhazgyfo815 = jKF6wk5lB.mUqPm6GBh;
                    if (qhazgyfo82 != qhazgyfo815) {
                        ((Cb827Z4La) qhazgyfo815).vNtjxmzUM = true;
                    }
                    pLYbCSTk0 plybcstk02 = this.Bhmn1KIah;
                    pnuAOe8oh pnuaoe8oh5 = plybcstk02.juJ6pnCpu;
                    if (pnuaoe8oh5 == null) {
                        pnuaoe8oh5 = new pnuAOe8oh(new JKF6wk5lB[16], 0);
                        plybcstk02.juJ6pnCpu = pnuaoe8oh5;
                    }
                    pnuaoe8oh5.J4Ux7ym32(jKF6wk5lB);
                    return jKF6wk5lB;
                } else if (!(cb827Z4La2 instanceof JKF6wk5lB)) {
                    return cb827Z4La2;
                } else {
                    pLYbCSTk0 plybcstk03 = this.Bhmn1KIah;
                    pnuAOe8oh pnuaoe8oh6 = plybcstk03.juJ6pnCpu;
                    if (pnuaoe8oh6 == null) {
                        pnuaoe8oh6 = new pnuAOe8oh(new JKF6wk5lB[16], 0);
                        plybcstk03.juJ6pnCpu = pnuaoe8oh6;
                    }
                    pnuaoe8oh6.J4Ux7ym32(cb827Z4La2);
                    return cb827Z4La2;
                }
        }
    }
}
