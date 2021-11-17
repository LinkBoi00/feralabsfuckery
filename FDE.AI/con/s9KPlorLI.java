package con;
/* loaded from: classes.dex */
public final class s9KPlorLI extends grdjLPaeu implements vc1fKXGpx {
    public final int CBQ5d1kRq;
    public final float kmSgne1rO;

    public s9KPlorLI(int i, float f, PmanMZxiM pmanMZxiM) {
        super(pmanMZxiM);
        this.CBQ5d1kRq = i;
        this.kmSgne1rO = f;
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
        if (obj instanceof s9KPlorLI) {
            s9KPlorLI s9kplorli = (s9KPlorLI) obj;
            if (this.CBQ5d1kRq == s9kplorli.CBQ5d1kRq) {
                if (this.kmSgne1rO == s9kplorli.kmSgne1rO) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.hashCode(this.kmSgne1rO) + (vtDfS6nCt.tGV7Q6urW(this.CBQ5d1kRq) * 31);
    }

    @Override // con.BgIsSUB3d
    public boolean i8XZMQc6Z(PmanMZxiM pmanMZxiM) {
        return pz7YPhQTU.PSTqBLTET(this, pmanMZxiM);
    }

    @Override // con.vc1fKXGpx
    public aZDaaZZJA kCA6Zs9sL(FRJidynr8 fRJidynr8, hKxHUWEcH hkxhuwech, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        if (!K5PjwoFCN.kCA6Zs9sL(j) || this.CBQ5d1kRq == 1) {
            i2 = K5PjwoFCN.vPSbyrYWX(j);
            i = K5PjwoFCN.yWvV4ePLl(j);
        } else {
            i2 = cT9gik1zL.kCA6Zs9sL(D3DEikrvb.Eeka1udhb(((float) K5PjwoFCN.yWvV4ePLl(j)) * this.kmSgne1rO), K5PjwoFCN.vPSbyrYWX(j), K5PjwoFCN.yWvV4ePLl(j));
            i = i2;
        }
        if (!K5PjwoFCN.dIocxURUo(j) || this.CBQ5d1kRq == 2) {
            i4 = K5PjwoFCN.oon79WMrY(j);
            i3 = K5PjwoFCN.Puu3Rhg4F(j);
        } else {
            i4 = cT9gik1zL.kCA6Zs9sL(D3DEikrvb.Eeka1udhb(((float) K5PjwoFCN.Puu3Rhg4F(j)) * this.kmSgne1rO), K5PjwoFCN.oon79WMrY(j), K5PjwoFCN.Puu3Rhg4F(j));
            i3 = i4;
        }
        n2gATecRC dIocxURUo = hkxhuwech.dIocxURUo(dnBSj5uJN.q3BipwRCk(i2, i, i4, i3));
        return fRJidynr8.nlGCs0NZs(dIocxURUo.CBQ5d1kRq, dIocxURUo.kmSgne1rO, (r5 & 4) != 0 ? dmnvfTTyg.CBQ5d1kRq : null, new VDA3chfQE(dIocxURUo, 1));
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
