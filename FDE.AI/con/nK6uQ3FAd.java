package con;
/* loaded from: classes.dex */
public final class nK6uQ3FAd implements vc1fKXGpx {
    public final KNUBbNYxJ Bhmn1KIah;
    public final K0KMmkEKu CBQ5d1kRq;
    public final gdEmqfwpT PSTqBLTET;
    public final int kmSgne1rO;

    public nK6uQ3FAd(K0KMmkEKu k0KMmkEKu, int i, KNUBbNYxJ kNUBbNYxJ, gdEmqfwpT gdemqfwpt) {
        this.CBQ5d1kRq = k0KMmkEKu;
        this.kmSgne1rO = i;
        this.Bhmn1KIah = kNUBbNYxJ;
        this.PSTqBLTET = gdemqfwpt;
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
        if (!(obj instanceof nK6uQ3FAd)) {
            return false;
        }
        nK6uQ3FAd nk6uq3fad = (nK6uQ3FAd) obj;
        return anXlDk6fV.tGV7Q6urW(this.CBQ5d1kRq, nk6uq3fad.CBQ5d1kRq) && this.kmSgne1rO == nk6uq3fad.kmSgne1rO && anXlDk6fV.tGV7Q6urW(this.Bhmn1KIah, nk6uq3fad.Bhmn1KIah) && anXlDk6fV.tGV7Q6urW(this.PSTqBLTET, nk6uq3fad.PSTqBLTET);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.kmSgne1rO);
        int hashCode2 = this.Bhmn1KIah.hashCode();
        return this.PSTqBLTET.hashCode() + ((hashCode2 + ((hashCode + (this.CBQ5d1kRq.hashCode() * 31)) * 31)) * 31);
    }

    @Override // con.BgIsSUB3d
    public boolean i8XZMQc6Z(PmanMZxiM pmanMZxiM) {
        return pz7YPhQTU.PSTqBLTET(this, pmanMZxiM);
    }

    @Override // con.vc1fKXGpx
    public aZDaaZZJA kCA6Zs9sL(FRJidynr8 fRJidynr8, hKxHUWEcH hkxhuwech, long j) {
        n2gATecRC dIocxURUo = hkxhuwech.dIocxURUo(K5PjwoFCN.q3BipwRCk(j, 0, 0, 0, Integer.MAX_VALUE, 7));
        int min = Math.min(dIocxURUo.kmSgne1rO, K5PjwoFCN.Puu3Rhg4F(j));
        return fRJidynr8.nlGCs0NZs(dIocxURUo.CBQ5d1kRq, min, (r5 & 4) != 0 ? dmnvfTTyg.CBQ5d1kRq : null, new m9IHB3DHH(fRJidynr8, this, dIocxURUo, min));
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
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("VerticalScrollLayoutModifier(scrollerPosition=");
        q3BipwRCk.append(this.CBQ5d1kRq);
        q3BipwRCk.append(", cursorOffset=");
        q3BipwRCk.append(this.kmSgne1rO);
        q3BipwRCk.append(", transformedText=");
        q3BipwRCk.append(this.Bhmn1KIah);
        q3BipwRCk.append(", textLayoutResultProvider=");
        q3BipwRCk.append(this.PSTqBLTET);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
