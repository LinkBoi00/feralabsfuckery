package con;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class WPKZSgOZD implements nBnrGO77H {
    public final /* synthetic */ nPZZG1232 J4Ux7ym32;
    public final /* synthetic */ RNEcgN6dQ dIocxURUo;
    public final /* synthetic */ RUkE4Bs9R q3BipwRCk;
    public final /* synthetic */ int tGV7Q6urW;

    public WPKZSgOZD(RUkE4Bs9R rUkE4Bs9R, nPZZG1232 npzzg1232, int i, RNEcgN6dQ rNEcgN6dQ) {
        this.q3BipwRCk = rUkE4Bs9R;
        this.J4Ux7ym32 = npzzg1232;
        this.tGV7Q6urW = i;
        this.dIocxURUo = rNEcgN6dQ;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02d0  */
    @Override // con.nBnrGO77H
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final aZDaaZZJA J4Ux7ym32(FRJidynr8 fRJidynr8, List list, long j) {
        lJSYWcEGq ljsywcegq;
        lJSYWcEGq ljsywcegq2;
        boolean z;
        Iterator it;
        Integer num;
        Integer num2;
        k007RzV1x dIocxURUo;
        RUkE4Bs9R rUkE4Bs9R = this.q3BipwRCk;
        BFRsKhrQv layoutDirection = fRJidynr8.getLayoutDirection();
        nPZZG1232 npzzg1232 = this.J4Ux7ym32;
        int i = this.tGV7Q6urW;
        rUkE4Bs9R.kCA6Zs9sL = fRJidynr8;
        A2fLYD2UL tGV7Q6urW = rUkE4Bs9R.tGV7Q6urW();
        if (K5PjwoFCN.GPLPRo6go(j)) {
            int yWvV4ePLl = K5PjwoFCN.yWvV4ePLl(j);
            ljsywcegq = new lJSYWcEGq(lJSYWcEGq.GPLPRo6go);
            ljsywcegq.kCA6Zs9sL = null;
            ljsywcegq.dIocxURUo = yWvV4ePLl;
        } else {
            ljsywcegq = new lJSYWcEGq(lJSYWcEGq.Puu3Rhg4F);
            int vPSbyrYWX = K5PjwoFCN.vPSbyrYWX(j);
            if (vPSbyrYWX >= 0) {
                ljsywcegq.q3BipwRCk = vPSbyrYWX;
            }
        }
        tGV7Q6urW.dIocxURUo.dfpT1j18n = ljsywcegq;
        A2fLYD2UL tGV7Q6urW2 = rUkE4Bs9R.tGV7Q6urW();
        if (K5PjwoFCN.iiGwOFFnr(j)) {
            int Puu3Rhg4F = K5PjwoFCN.Puu3Rhg4F(j);
            ljsywcegq2 = new lJSYWcEGq(lJSYWcEGq.GPLPRo6go);
            ljsywcegq2.kCA6Zs9sL = null;
            ljsywcegq2.dIocxURUo = Puu3Rhg4F;
        } else {
            ljsywcegq2 = new lJSYWcEGq(lJSYWcEGq.Puu3Rhg4F);
            int oon79WMrY = K5PjwoFCN.oon79WMrY(j);
            if (oon79WMrY >= 0) {
                ljsywcegq2.q3BipwRCk = oon79WMrY;
            }
        }
        tGV7Q6urW2.dIocxURUo.iMyQMM6Qj = ljsywcegq2;
        rUkE4Bs9R.tGV7Q6urW().GPLPRo6go = j;
        rUkE4Bs9R.tGV7Q6urW().Puu3Rhg4F = layoutDirection;
        rUkE4Bs9R.J4Ux7ym32.clear();
        rUkE4Bs9R.tGV7Q6urW.clear();
        rUkE4Bs9R.dIocxURUo.clear();
        if (!npzzg1232.PSTqBLTET && list.size() == npzzg1232.ilHKhw3Yw.size()) {
            int size = list.size() - 1;
            if (size >= 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    Object Bhmn1KIah = ((hKxHUWEcH) list.get(i2)).Bhmn1KIah();
                    if (!anXlDk6fV.tGV7Q6urW(Bhmn1KIah instanceof FiQJL8Ct3 ? (FiQJL8Ct3) Bhmn1KIah : null, npzzg1232.ilHKhw3Yw.get(i2))) {
                        break;
                    } else if (i3 > size) {
                        break;
                    } else {
                        i2 = i3;
                    }
                }
            }
            z = false;
            if (!z) {
                A2fLYD2UL tGV7Q6urW3 = rUkE4Bs9R.tGV7Q6urW();
                for (Map.Entry entry : tGV7Q6urW3.q3BipwRCk.entrySet()) {
                    stVpOZKoA stvpozkoa = (stVpOZKoA) entry.getValue();
                    if (!(stvpozkoa == null || (dIocxURUo = stvpozkoa.dIocxURUo()) == null)) {
                        dIocxURUo.qFBXIgpia();
                    }
                }
                tGV7Q6urW3.q3BipwRCk.clear();
                tGV7Q6urW3.q3BipwRCk.put(Tu4W68Wme.kCA6Zs9sL, tGV7Q6urW3.dIocxURUo);
                tGV7Q6urW3.yWvV4ePLl.clear();
                tGV7Q6urW3.oon79WMrY = true;
                tGV7Q6urW3.J4Ux7ym32.clear();
                tGV7Q6urW3.tGV7Q6urW.clear();
                A2fLYD2UL tGV7Q6urW4 = rUkE4Bs9R.tGV7Q6urW();
                for (PmanMZxiM pmanMZxiM : npzzg1232.CBQ5d1kRq.q3BipwRCk) {
                    pmanMZxiM.IytU16YUK(tGV7Q6urW4);
                }
                npzzg1232.ilHKhw3Yw.clear();
                npzzg1232.Bhmn1KIah.J4Ux7ym32(qih4lW99W.q3BipwRCk, npzzg1232.MzoOEjc4X, new atgZEnsDc(list, tGV7Q6urW4, npzzg1232));
                npzzg1232.PSTqBLTET = false;
                T0tSF6MBA.q3BipwRCk(rUkE4Bs9R.tGV7Q6urW(), list);
                A2fLYD2UL tGV7Q6urW5 = rUkE4Bs9R.tGV7Q6urW();
                S5aezmTgi s5aezmTgi = rUkE4Bs9R.q3BipwRCk;
                Objects.requireNonNull(tGV7Q6urW5);
                s5aezmTgi.ShSN9wbzk.clear();
                tGV7Q6urW5.dIocxURUo.dfpT1j18n.J4Ux7ym32(s5aezmTgi, 0);
                tGV7Q6urW5.dIocxURUo.iMyQMM6Qj.J4Ux7ym32(s5aezmTgi, 1);
                Iterator it2 = tGV7Q6urW5.J4Ux7ym32.keySet().iterator();
                if (!it2.hasNext()) {
                    for (Object obj : tGV7Q6urW5.q3BipwRCk.keySet()) {
                        stVpOZKoA stvpozkoa2 = (stVpOZKoA) tGV7Q6urW5.q3BipwRCk.get(obj);
                        if (stvpozkoa2 != tGV7Q6urW5.dIocxURUo) {
                            stvpozkoa2.tGV7Q6urW();
                        }
                    }
                    for (Object obj2 : tGV7Q6urW5.q3BipwRCk.keySet()) {
                        stVpOZKoA stvpozkoa3 = (stVpOZKoA) tGV7Q6urW5.q3BipwRCk.get(obj2);
                        if (stvpozkoa3 != tGV7Q6urW5.dIocxURUo) {
                            k007RzV1x dIocxURUo2 = stvpozkoa3.dIocxURUo();
                            dIocxURUo2.M66hQ219i = stvpozkoa3.getKey().toString();
                            dIocxURUo2.ziwPzaoF3 = null;
                            if (stvpozkoa3.tGV7Q6urW() instanceof auO4JQva1) {
                                stvpozkoa3.J4Ux7ym32();
                            }
                            s5aezmTgi.ShSN9wbzk.add(dIocxURUo2);
                            k007RzV1x k007rzv1x = dIocxURUo2.ziwPzaoF3;
                            if (k007rzv1x != null) {
                                ((qYFy65iys) k007rzv1x).ShSN9wbzk.remove(dIocxURUo2);
                                dIocxURUo2.qFBXIgpia();
                            }
                            dIocxURUo2.ziwPzaoF3 = s5aezmTgi;
                        } else {
                            stvpozkoa3.q3BipwRCk(s5aezmTgi);
                        }
                    }
                    Iterator it3 = tGV7Q6urW5.J4Ux7ym32.keySet().iterator();
                    if (!it3.hasNext()) {
                        for (Object obj3 : tGV7Q6urW5.q3BipwRCk.keySet()) {
                            stVpOZKoA stvpozkoa4 = (stVpOZKoA) tGV7Q6urW5.q3BipwRCk.get(obj3);
                            if (stvpozkoa4 != tGV7Q6urW5.dIocxURUo) {
                                stvpozkoa4.tGV7Q6urW();
                            }
                        }
                        for (Object obj4 : tGV7Q6urW5.q3BipwRCk.keySet()) {
                            stVpOZKoA stvpozkoa5 = (stVpOZKoA) tGV7Q6urW5.q3BipwRCk.get(obj4);
                            stvpozkoa5.J4Ux7ym32();
                            k007RzV1x dIocxURUo3 = stvpozkoa5.dIocxURUo();
                            if (dIocxURUo3 != null && (obj4 instanceof String)) {
                                dIocxURUo3.CBQ5d1kRq = (String) obj4;
                            }
                        }
                    } else {
                        K6PL0z3I0.q3BipwRCk(tGV7Q6urW5.J4Ux7ym32.get(it3.next()));
                        throw null;
                    }
                } else {
                    K6PL0z3I0.q3BipwRCk(tGV7Q6urW5.J4Ux7ym32.get(it2.next()));
                    throw null;
                }
            } else {
                T0tSF6MBA.q3BipwRCk(rUkE4Bs9R.tGV7Q6urW(), list);
            }
            rUkE4Bs9R.q3BipwRCk.j22ftfeNI(K5PjwoFCN.yWvV4ePLl(j));
            rUkE4Bs9R.q3BipwRCk.o4LF8RkoQ(K5PjwoFCN.Puu3Rhg4F(j));
            Objects.requireNonNull(rUkE4Bs9R.q3BipwRCk);
            Objects.requireNonNull(rUkE4Bs9R.q3BipwRCk);
            S5aezmTgi s5aezmTgi2 = rUkE4Bs9R.q3BipwRCk;
            s5aezmTgi2.Ihm5o4uLx.tGV7Q6urW(s5aezmTgi2);
            S5aezmTgi s5aezmTgi3 = rUkE4Bs9R.q3BipwRCk;
            s5aezmTgi3.ifDs8fRNm = i;
            WLlBJNJ2W.MzoOEjc4X = s5aezmTgi3.INnK5Rew6(512);
            S5aezmTgi s5aezmTgi4 = rUkE4Bs9R.q3BipwRCk;
            s5aezmTgi4.kktL0P5MG(s5aezmTgi4.ifDs8fRNm, 0, 0, 0, 0, 0, 0, 0, 0);
            it = rUkE4Bs9R.q3BipwRCk.ShSN9wbzk.iterator();
            while (it.hasNext()) {
                k007RzV1x k007rzv1x2 = (k007RzV1x) it.next();
                Object obj5 = k007rzv1x2.ln3nf7LH3;
                if (obj5 instanceof hKxHUWEcH) {
                    n2gATecRC n2gatecrc = (n2gATecRC) rUkE4Bs9R.J4Ux7ym32.get(obj5);
                    if (n2gatecrc == null) {
                        num = null;
                    } else {
                        num = Integer.valueOf(n2gatecrc.CBQ5d1kRq);
                    }
                    if (n2gatecrc == null) {
                        num2 = null;
                    } else {
                        num2 = Integer.valueOf(n2gatecrc.kmSgne1rO);
                    }
                    int dXrmkklc8 = k007rzv1x2.dXrmkklc8();
                    if (num != null && dXrmkklc8 == num.intValue()) {
                        int CBQ5d1kRq = k007rzv1x2.CBQ5d1kRq();
                        if (num2 != null && CBQ5d1kRq == num2.intValue()) {
                        }
                    }
                    rUkE4Bs9R.J4Ux7ym32.put(obj5, ((hKxHUWEcH) obj5).dIocxURUo(K5PjwoFCN.J4Ux7ym32.dIocxURUo(k007rzv1x2.dXrmkklc8(), k007rzv1x2.CBQ5d1kRq())));
                }
            }
            long dIocxURUo4 = D3DEikrvb.dIocxURUo(rUkE4Bs9R.q3BipwRCk.dXrmkklc8(), rUkE4Bs9R.q3BipwRCk.CBQ5d1kRq());
            ((prCJwNx2x) this.dIocxURUo).getValue();
            return fRJidynr8.nlGCs0NZs(YWiUMZOtw.tGV7Q6urW(dIocxURUo4), YWiUMZOtw.J4Ux7ym32(dIocxURUo4), (r5 & 4) != 0 ? dmnvfTTyg.CBQ5d1kRq : null, new Idi5q1pZn(this.q3BipwRCk, list));
        }
        z = true;
        if (!z) {
        }
        rUkE4Bs9R.q3BipwRCk.j22ftfeNI(K5PjwoFCN.yWvV4ePLl(j));
        rUkE4Bs9R.q3BipwRCk.o4LF8RkoQ(K5PjwoFCN.Puu3Rhg4F(j));
        Objects.requireNonNull(rUkE4Bs9R.q3BipwRCk);
        Objects.requireNonNull(rUkE4Bs9R.q3BipwRCk);
        S5aezmTgi s5aezmTgi22 = rUkE4Bs9R.q3BipwRCk;
        s5aezmTgi22.Ihm5o4uLx.tGV7Q6urW(s5aezmTgi22);
        S5aezmTgi s5aezmTgi32 = rUkE4Bs9R.q3BipwRCk;
        s5aezmTgi32.ifDs8fRNm = i;
        WLlBJNJ2W.MzoOEjc4X = s5aezmTgi32.INnK5Rew6(512);
        S5aezmTgi s5aezmTgi42 = rUkE4Bs9R.q3BipwRCk;
        s5aezmTgi42.kktL0P5MG(s5aezmTgi42.ifDs8fRNm, 0, 0, 0, 0, 0, 0, 0, 0);
        it = rUkE4Bs9R.q3BipwRCk.ShSN9wbzk.iterator();
        while (it.hasNext()) {
        }
        long dIocxURUo42 = D3DEikrvb.dIocxURUo(rUkE4Bs9R.q3BipwRCk.dXrmkklc8(), rUkE4Bs9R.q3BipwRCk.CBQ5d1kRq());
        ((prCJwNx2x) this.dIocxURUo).getValue();
        return fRJidynr8.nlGCs0NZs(YWiUMZOtw.tGV7Q6urW(dIocxURUo42), YWiUMZOtw.J4Ux7ym32(dIocxURUo42), (r5 & 4) != 0 ? dmnvfTTyg.CBQ5d1kRq : null, new Idi5q1pZn(this.q3BipwRCk, list));
    }

    @Override // con.nBnrGO77H
    public int dIocxURUo(KaIKYh6OP kaIKYh6OP, List list, int i) {
        return ODug2UCW1.nlGCs0NZs(this, kaIKYh6OP, list, i);
    }

    @Override // con.nBnrGO77H
    public int kCA6Zs9sL(KaIKYh6OP kaIKYh6OP, List list, int i) {
        return ODug2UCW1.IytU16YUK(this, kaIKYh6OP, list, i);
    }

    @Override // con.nBnrGO77H
    public int q3BipwRCk(KaIKYh6OP kaIKYh6OP, List list, int i) {
        return ODug2UCW1.CpG0imbht(this, kaIKYh6OP, list, i);
    }

    @Override // con.nBnrGO77H
    public int tGV7Q6urW(KaIKYh6OP kaIKYh6OP, List list, int i) {
        return ODug2UCW1.AqaWJg0b4(this, kaIKYh6OP, list, i);
    }
}
