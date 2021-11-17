package con;
/* loaded from: classes.dex */
public final class qWURyrQd0 extends grdjLPaeu implements vc1fKXGpx {
    public final float Bhmn1KIah;
    public final OGQYjfdsY CBQ5d1kRq;
    public final float kmSgne1rO;

    public qWURyrQd0(OGQYjfdsY oGQYjfdsY, float f, float f2, PmanMZxiM pmanMZxiM, dnBSj5uJN dnbsj5ujn) {
        super(pmanMZxiM);
        this.CBQ5d1kRq = oGQYjfdsY;
        this.kmSgne1rO = f;
        this.Bhmn1KIah = f2;
        if (!((f >= 0.0f || lRwPpHNL9.q3BipwRCk(f, Float.NaN)) && (f2 >= 0.0f || lRwPpHNL9.q3BipwRCk(f2, Float.NaN)))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number".toString());
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
        if (this == obj) {
            return true;
        }
        qWURyrQd0 qwuryrqd0 = obj instanceof qWURyrQd0 ? (qWURyrQd0) obj : null;
        if (qwuryrqd0 == null) {
            return false;
        }
        return anXlDk6fV.tGV7Q6urW(this.CBQ5d1kRq, qwuryrqd0.CBQ5d1kRq) && lRwPpHNL9.q3BipwRCk(this.kmSgne1rO, qwuryrqd0.kmSgne1rO) && lRwPpHNL9.q3BipwRCk(this.Bhmn1KIah, qwuryrqd0.Bhmn1KIah);
    }

    public int hashCode() {
        return (((this.CBQ5d1kRq.hashCode() * 31) + Float.hashCode(this.kmSgne1rO)) * 31) + Float.hashCode(this.Bhmn1KIah);
    }

    @Override // con.BgIsSUB3d
    public boolean i8XZMQc6Z(PmanMZxiM pmanMZxiM) {
        return pz7YPhQTU.PSTqBLTET(this, pmanMZxiM);
    }

    @Override // con.vc1fKXGpx
    public aZDaaZZJA kCA6Zs9sL(FRJidynr8 fRJidynr8, hKxHUWEcH hkxhuwech, long j) {
        return pz7YPhQTU.oon79WMrY(fRJidynr8, this.CBQ5d1kRq, this.kmSgne1rO, this.Bhmn1KIah, hkxhuwech, j);
    }

    @Override // con.vc1fKXGpx
    public int kmSgne1rO(KaIKYh6OP kaIKYh6OP, HqmYLYbvB hqmYLYbvB, int i) {
        return gThLCaTO1.Eeka1udhb(this, kaIKYh6OP, hqmYLYbvB, i);
    }

    @Override // con.BgIsSUB3d
    public Object sk5s77z6Q(Object obj, kkcQgCx5G kkcqgcx5g) {
        return kkcqgcx5g.WaUP0CF08(obj, this);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("AlignmentLineOffset(alignmentLine=");
        q3BipwRCk.append(this.CBQ5d1kRq);
        q3BipwRCk.append(", before=");
        q3BipwRCk.append((Object) lRwPpHNL9.J4Ux7ym32(this.kmSgne1rO));
        q3BipwRCk.append(", after=");
        q3BipwRCk.append((Object) lRwPpHNL9.J4Ux7ym32(this.Bhmn1KIah));
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
