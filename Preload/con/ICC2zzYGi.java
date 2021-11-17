package con;
/* loaded from: classes.dex */
public final class ICC2zzYGi extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ Object Bhmn1KIah;
    public final /* synthetic */ Object MzoOEjc4X;
    public final /* synthetic */ Object PSTqBLTET;
    public final /* synthetic */ Object ilHKhw3Yw;
    public final /* synthetic */ int kmSgne1rO = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ICC2zzYGi(IxbokG044 ixbokG044, rJ2CWKUxs rj2cwkuxs, PmanMZxiM pmanMZxiM, JKe64ATmr jKe64ATmr) {
        super(1);
        this.Bhmn1KIah = ixbokG044;
        this.PSTqBLTET = rj2cwkuxs;
        this.MzoOEjc4X = pmanMZxiM;
        this.ilHKhw3Yw = jKe64ATmr;
    }

    @Override // con.PmanMZxiM
    public Object IytU16YUK(Object obj) {
        String str;
        StringBuilder sb;
        String str2;
        switch (this.kmSgne1rO) {
            case 0:
                zPnrAb5l5 zpnrab5l5 = (zPnrAb5l5) obj;
                cqKak5Wfn.Puu3Rhg4F(zpnrab5l5, ((IxbokG044) this.Bhmn1KIah).tGV7Q6urW);
                Object q3BipwRCk = IxbokG044.q3BipwRCk((IxbokG044) this.Bhmn1KIah, zpnrab5l5.q3BipwRCk());
                if (!anXlDk6fV.tGV7Q6urW(q3BipwRCk, zpnrab5l5.q3BipwRCk())) {
                    ((IxbokG044) this.Bhmn1KIah).tGV7Q6urW.q3BipwRCk(q3BipwRCk);
                    ((rJ2CWKUxs) this.PSTqBLTET).q3BipwRCk(q3BipwRCk);
                    PmanMZxiM pmanMZxiM = (PmanMZxiM) this.MzoOEjc4X;
                    if (pmanMZxiM != null) {
                        pmanMZxiM.IytU16YUK((IxbokG044) this.Bhmn1KIah);
                    }
                    zpnrab5l5.J4Ux7ym32(false);
                    zpnrab5l5.dIocxURUo.GPLPRo6go();
                    ((JKe64ATmr) this.ilHKhw3Yw).CBQ5d1kRq = true;
                } else {
                    PmanMZxiM pmanMZxiM2 = (PmanMZxiM) this.MzoOEjc4X;
                    if (pmanMZxiM2 != null) {
                        pmanMZxiM2.IytU16YUK((IxbokG044) this.Bhmn1KIah);
                    }
                }
                return qih4lW99W.q3BipwRCk;
            case 1:
                cqKak5Wfn.tGV7Q6urW((zPnrAb5l5) ((IXMg0nBBI) this.Bhmn1KIah).CBQ5d1kRq, ((Number) obj).longValue(), (eSSARtQU6) this.ilHKhw3Yw, (rJ2CWKUxs) this.PSTqBLTET, (PmanMZxiM) this.MzoOEjc4X);
                return qih4lW99W.q3BipwRCk;
            default:
                ro5oMV4A2 ro5omv4a2 = (ro5oMV4A2) obj;
                Object obj2 = this.ilHKhw3Yw;
                dVtF46MWK dvtf46mwk = (dVtF46MWK) this.Bhmn1KIah;
                WRL6bb9Fk wRL6bb9Fk = new WRL6bb9Fk((RNEcgN6dQ) this.MzoOEjc4X, obj2, dvtf46mwk);
                Object GPLPRo6go = wRL6bb9Fk.GPLPRo6go();
                if (GPLPRo6go == null || dvtf46mwk.q3BipwRCk(GPLPRo6go)) {
                    return new Bpr19MoOK(((dVtF46MWK) this.Bhmn1KIah).dIocxURUo((String) this.PSTqBLTET, wRL6bb9Fk));
                }
                if (GPLPRo6go instanceof RNEcgN6dQ) {
                    prCJwNx2x prcjwnx2x = (prCJwNx2x) ((RNEcgN6dQ) GPLPRo6go);
                    jdeJZ7JPq jdejz7jpq = prcjwnx2x.CBQ5d1kRq;
                    if (jdejz7jpq == VpkLDqhd7.q3BipwRCk || jdejz7jpq == PSAOlugDJ.q3BipwRCk || jdejz7jpq == AE51MWSQF.q3BipwRCk) {
                        sb = new StringBuilder();
                        sb.append("MutableState containing ");
                        sb.append(prcjwnx2x.getValue());
                        str2 = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                    } else {
                        str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                        throw new IllegalArgumentException(str);
                    }
                } else {
                    sb = new StringBuilder();
                    sb.append(GPLPRo6go);
                    str2 = " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
                }
                sb.append(str2);
                str = sb.toString();
                throw new IllegalArgumentException(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ICC2zzYGi(IXMg0nBBI iXMg0nBBI, eSSARtQU6 essartqu6, rJ2CWKUxs rj2cwkuxs, PmanMZxiM pmanMZxiM) {
        super(1);
        this.Bhmn1KIah = iXMg0nBBI;
        this.ilHKhw3Yw = essartqu6;
        this.PSTqBLTET = rj2cwkuxs;
        this.MzoOEjc4X = pmanMZxiM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ICC2zzYGi(dVtF46MWK dvtf46mwk, String str, RNEcgN6dQ rNEcgN6dQ, Object obj) {
        super(1);
        this.Bhmn1KIah = dvtf46mwk;
        this.PSTqBLTET = str;
        this.MzoOEjc4X = rNEcgN6dQ;
        this.ilHKhw3Yw = obj;
    }
}
