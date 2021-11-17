package con;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class vaiCLUymU implements Kh7ffW4RH {
    public Throwable Bhmn1KIah;
    public final gdEmqfwpT CBQ5d1kRq;
    public final Object kmSgne1rO = new Object();
    public List PSTqBLTET = new ArrayList();
    public List MzoOEjc4X = new ArrayList();

    public vaiCLUymU(gdEmqfwpT gdemqfwpt) {
        this.CBQ5d1kRq = gdemqfwpt;
    }

    public final void dIocxURUo(long j) {
        synchronized (this.kmSgne1rO) {
            List list = this.PSTqBLTET;
            this.PSTqBLTET = this.MzoOEjc4X;
            this.MzoOEjc4X = list;
            int i = 0;
            int size = list.size();
            if (size > 0) {
                while (true) {
                    int i2 = i + 1;
                    G4Xj7GMiq g4Xj7GMiq = (G4Xj7GMiq) list.get(i);
                    g4Xj7GMiq.J4Ux7ym32.Bhmn1KIah(g4Xj7GMiq.q3BipwRCk.IytU16YUK(Long.valueOf(j)));
                    if (i2 >= size) {
                        break;
                    }
                    i = i2;
                }
            }
            list.clear();
        }
    }

    @Override // con.bu5cjmae6
    public Object fold(Object obj, kkcQgCx5G kkcqgcx5g) {
        return kkcqgcx5g.WaUP0CF08(obj, this);
    }

    @Override // con.zG81huwZq, con.bu5cjmae6
    public zG81huwZq get(adUS3SHb2 adus3shb2) {
        return idpM54xlp.Puu3Rhg4F(this, adus3shb2);
    }

    @Override // con.zG81huwZq
    public adUS3SHb2 getKey() {
        return LQcLPKzab.CBQ5d1kRq;
    }

    @Override // con.bu5cjmae6
    public bu5cjmae6 minusKey(adUS3SHb2 adus3shb2) {
        return pz7YPhQTU.RG6kpfv3v(this, adus3shb2);
    }

    @Override // con.bu5cjmae6
    public bu5cjmae6 plus(bu5cjmae6 bu5cjmae6) {
        return idpM54xlp.dfpT1j18n(this, bu5cjmae6);
    }

    @Override // con.Kh7ffW4RH
    public Object q3BipwRCk(PmanMZxiM pmanMZxiM, Way959ade way959ade) {
        gdEmqfwpT gdemqfwpt;
        tmgChDFqU tmgchdfqu = new tmgChDFqU(idpM54xlp.PSTqBLTET(way959ade), 1);
        tmgchdfqu.Eeka1udhb();
        IXMg0nBBI iXMg0nBBI = new IXMg0nBBI();
        synchronized (this.kmSgne1rO) {
            try {
                Throwable th = this.Bhmn1KIah;
                if (th != null) {
                    tmgchdfqu.Bhmn1KIah(new qlt0VySXJ(th));
                } else {
                    iXMg0nBBI.CBQ5d1kRq = new G4Xj7GMiq(pmanMZxiM, tmgchdfqu);
                    int i = 0;
                    boolean z = !this.PSTqBLTET.isEmpty();
                    List list = this.PSTqBLTET;
                    Object obj = iXMg0nBBI.CBQ5d1kRq;
                    list.add(obj == null ? null : (G4Xj7GMiq) obj);
                    boolean z2 = !z;
                    tmgchdfqu.RG6kpfv3v(new dMQC97DHs(this, iXMg0nBBI));
                    if (z2 && (gdemqfwpt = this.CBQ5d1kRq) != null) {
                        try {
                            gdemqfwpt.GPLPRo6go();
                        } catch (Throwable th2) {
                            synchronized (this.kmSgne1rO) {
                                try {
                                    if (this.Bhmn1KIah == null) {
                                        this.Bhmn1KIah = th2;
                                        List list2 = this.PSTqBLTET;
                                        int size = list2.size() - 1;
                                        if (size >= 0) {
                                            while (true) {
                                                int i2 = i + 1;
                                                ((G4Xj7GMiq) list2.get(i)).J4Ux7ym32.Bhmn1KIah(new qlt0VySXJ(th2));
                                                if (i2 > size) {
                                                    break;
                                                }
                                                i = i2;
                                            }
                                        }
                                        this.PSTqBLTET.clear();
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return tmgchdfqu.qVUwofr5s();
    }

    public final boolean tGV7Q6urW() {
        boolean z;
        synchronized (this.kmSgne1rO) {
            z = !this.PSTqBLTET.isEmpty();
        }
        return z;
    }
}
