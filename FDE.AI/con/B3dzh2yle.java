package con;
/* loaded from: classes.dex */
public final class B3dzh2yle extends grdjLPaeu implements vc1fKXGpx {
    public final float Bhmn1KIah;
    public final float CBQ5d1kRq;
    public final float PSTqBLTET;
    public final float kmSgne1rO;

    public B3dzh2yle(float f, float f2, float f3, float f4, boolean z, PmanMZxiM pmanMZxiM, dnBSj5uJN dnbsj5ujn) {
        super(pmanMZxiM);
        this.CBQ5d1kRq = f;
        this.kmSgne1rO = f2;
        this.Bhmn1KIah = f3;
        this.PSTqBLTET = f4;
        if (!((f >= 0.0f || lRwPpHNL9.q3BipwRCk(f, Float.NaN)) && (f2 >= 0.0f || lRwPpHNL9.q3BipwRCk(f2, Float.NaN)) && ((f3 >= 0.0f || lRwPpHNL9.q3BipwRCk(f3, Float.NaN)) && (f4 >= 0.0f || lRwPpHNL9.q3BipwRCk(f4, Float.NaN))))) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    @Override // con.vc1fKXGpx
    public int Bhmn1KIah(KaIKYh6OP kaIKYh6OP, HqmYLYbvB hqmYLYbvB, int i) {
        return gThLCaTO1.dXrmkklc8(this, kaIKYh6OP, hqmYLYbvB, i);
    }

    @Override // con.vc1fKXGpx
    public int Puu3Rhg4F(KaIKYh6OP kaIKYh6OP, HqmYLYbvB hqmYLYbvB, int i) {
        return gThLCaTO1.RG6kpfv3v(this, kaIKYh6OP, hqmYLYbvB, i);
    }

    @Override // con.vc1fKXGpx
    public int RG6kpfv3v(KaIKYh6OP kaIKYh6OP, HqmYLYbvB hqmYLYbvB, int i) {
        return gThLCaTO1.ixWaw2akD(this, kaIKYh6OP, hqmYLYbvB, i);
    }

    @Override // con.BgIsSUB3d
    public BgIsSUB3d WaUP0CF08(BgIsSUB3d bgIsSUB3d) {
        return pz7YPhQTU.i8XZMQc6Z(this, bgIsSUB3d);
    }

    @Override // con.BgIsSUB3d
    public Object dXrmkklc8(Object obj, kkcQgCx5G kkcqgcx5g) {
        return kkcqgcx5g.WaUP0CF08(this, obj);
    }

    public boolean equals(Object obj) {
        B3dzh2yle b3dzh2yle = obj instanceof B3dzh2yle ? (B3dzh2yle) obj : null;
        if (b3dzh2yle != null && lRwPpHNL9.q3BipwRCk(this.CBQ5d1kRq, b3dzh2yle.CBQ5d1kRq) && lRwPpHNL9.q3BipwRCk(this.kmSgne1rO, b3dzh2yle.kmSgne1rO) && lRwPpHNL9.q3BipwRCk(this.Bhmn1KIah, b3dzh2yle.Bhmn1KIah) && lRwPpHNL9.q3BipwRCk(this.PSTqBLTET, b3dzh2yle.PSTqBLTET)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Boolean.hashCode(true) + (((((((Float.hashCode(this.CBQ5d1kRq) * 31) + Float.hashCode(this.kmSgne1rO)) * 31) + Float.hashCode(this.Bhmn1KIah)) * 31) + Float.hashCode(this.PSTqBLTET)) * 31);
    }

    @Override // con.BgIsSUB3d
    public boolean i8XZMQc6Z(PmanMZxiM pmanMZxiM) {
        return pz7YPhQTU.PSTqBLTET(this, pmanMZxiM);
    }

    @Override // con.vc1fKXGpx
    public aZDaaZZJA kCA6Zs9sL(FRJidynr8 fRJidynr8, hKxHUWEcH hkxhuwech, long j) {
        int iiGwOFFnr = fRJidynr8.iiGwOFFnr(this.Bhmn1KIah) + fRJidynr8.iiGwOFFnr(this.CBQ5d1kRq);
        int iiGwOFFnr2 = fRJidynr8.iiGwOFFnr(this.PSTqBLTET) + fRJidynr8.iiGwOFFnr(this.kmSgne1rO);
        n2gATecRC dIocxURUo = hkxhuwech.dIocxURUo(dnBSj5uJN.dfpT1j18n(j, -iiGwOFFnr, -iiGwOFFnr2));
        return fRJidynr8.nlGCs0NZs(dnBSj5uJN.vPSbyrYWX(j, dIocxURUo.CBQ5d1kRq + iiGwOFFnr), dnBSj5uJN.oon79WMrY(j, dIocxURUo.kmSgne1rO + iiGwOFFnr2), (r5 & 4) != 0 ? dmnvfTTyg.CBQ5d1kRq : null, new Yddxl55m6(this, dIocxURUo, fRJidynr8));
    }

    @Override // con.vc1fKXGpx
    public int kmSgne1rO(KaIKYh6OP kaIKYh6OP, HqmYLYbvB hqmYLYbvB, int i) {
        return gThLCaTO1.Eeka1udhb(this, kaIKYh6OP, hqmYLYbvB, i);
    }

    @Override // con.BgIsSUB3d
    public Object sk5s77z6Q(Object obj, kkcQgCx5G kkcqgcx5g) {
        return kkcqgcx5g.WaUP0CF08(obj, this);
    }
}
