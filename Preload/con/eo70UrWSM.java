package con;
/* loaded from: classes.dex */
public final class eo70UrWSM extends grdjLPaeu implements vc1fKXGpx {
    public final float CBQ5d1kRq;
    public final float kmSgne1rO;

    public eo70UrWSM(float f, float f2, PmanMZxiM pmanMZxiM, dnBSj5uJN dnbsj5ujn) {
        super(pmanMZxiM);
        this.CBQ5d1kRq = f;
        this.kmSgne1rO = f2;
    }

    @Override // con.vc1fKXGpx
    public int Bhmn1KIah(KaIKYh6OP kaIKYh6OP, HqmYLYbvB hqmYLYbvB, int i) {
        int cAwN510t2 = hqmYLYbvB.cAwN510t2(i);
        int iiGwOFFnr = !lRwPpHNL9.q3BipwRCk(this.CBQ5d1kRq, Float.NaN) ? kaIKYh6OP.iiGwOFFnr(this.CBQ5d1kRq) : 0;
        return cAwN510t2 < iiGwOFFnr ? iiGwOFFnr : cAwN510t2;
    }

    @Override // con.vc1fKXGpx
    public int Puu3Rhg4F(KaIKYh6OP kaIKYh6OP, HqmYLYbvB hqmYLYbvB, int i) {
        int qFBXIgpia = hqmYLYbvB.qFBXIgpia(i);
        int iiGwOFFnr = !lRwPpHNL9.q3BipwRCk(this.kmSgne1rO, Float.NaN) ? kaIKYh6OP.iiGwOFFnr(this.kmSgne1rO) : 0;
        return qFBXIgpia < iiGwOFFnr ? iiGwOFFnr : qFBXIgpia;
    }

    @Override // con.vc1fKXGpx
    public int RG6kpfv3v(KaIKYh6OP kaIKYh6OP, HqmYLYbvB hqmYLYbvB, int i) {
        int RG6kpfv3v = hqmYLYbvB.RG6kpfv3v(i);
        int iiGwOFFnr = !lRwPpHNL9.q3BipwRCk(this.CBQ5d1kRq, Float.NaN) ? kaIKYh6OP.iiGwOFFnr(this.CBQ5d1kRq) : 0;
        return RG6kpfv3v < iiGwOFFnr ? iiGwOFFnr : RG6kpfv3v;
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
        if (!(obj instanceof eo70UrWSM)) {
            return false;
        }
        eo70UrWSM eo70urwsm = (eo70UrWSM) obj;
        if (!lRwPpHNL9.q3BipwRCk(this.CBQ5d1kRq, eo70urwsm.CBQ5d1kRq) || !lRwPpHNL9.q3BipwRCk(this.kmSgne1rO, eo70urwsm.kmSgne1rO)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Float.hashCode(this.CBQ5d1kRq) * 31) + Float.hashCode(this.kmSgne1rO);
    }

    @Override // con.BgIsSUB3d
    public boolean i8XZMQc6Z(PmanMZxiM pmanMZxiM) {
        return pz7YPhQTU.PSTqBLTET(this, pmanMZxiM);
    }

    @Override // con.vc1fKXGpx
    public aZDaaZZJA kCA6Zs9sL(FRJidynr8 fRJidynr8, hKxHUWEcH hkxhuwech, long j) {
        int i;
        int i2 = 0;
        if (lRwPpHNL9.q3BipwRCk(this.CBQ5d1kRq, Float.NaN) || K5PjwoFCN.vPSbyrYWX(j) != 0) {
            i = K5PjwoFCN.vPSbyrYWX(j);
        } else {
            i = fRJidynr8.iiGwOFFnr(this.CBQ5d1kRq);
            int yWvV4ePLl = K5PjwoFCN.yWvV4ePLl(j);
            if (i > yWvV4ePLl) {
                i = yWvV4ePLl;
            }
            if (i < 0) {
                i = 0;
            }
        }
        int yWvV4ePLl2 = K5PjwoFCN.yWvV4ePLl(j);
        if (lRwPpHNL9.q3BipwRCk(this.kmSgne1rO, Float.NaN) || K5PjwoFCN.oon79WMrY(j) != 0) {
            i2 = K5PjwoFCN.oon79WMrY(j);
        } else {
            int iiGwOFFnr = fRJidynr8.iiGwOFFnr(this.kmSgne1rO);
            int Puu3Rhg4F = K5PjwoFCN.Puu3Rhg4F(j);
            if (iiGwOFFnr > Puu3Rhg4F) {
                iiGwOFFnr = Puu3Rhg4F;
            }
            if (iiGwOFFnr >= 0) {
                i2 = iiGwOFFnr;
            }
        }
        n2gATecRC dIocxURUo = hkxhuwech.dIocxURUo(dnBSj5uJN.q3BipwRCk(i, yWvV4ePLl2, i2, K5PjwoFCN.Puu3Rhg4F(j)));
        return fRJidynr8.nlGCs0NZs(dIocxURUo.CBQ5d1kRq, dIocxURUo.kmSgne1rO, (r5 & 4) != 0 ? dmnvfTTyg.CBQ5d1kRq : null, new VDA3chfQE(dIocxURUo, 3));
    }

    @Override // con.vc1fKXGpx
    public int kmSgne1rO(KaIKYh6OP kaIKYh6OP, HqmYLYbvB hqmYLYbvB, int i) {
        int kCA6Zs9sL = hqmYLYbvB.kCA6Zs9sL(i);
        int iiGwOFFnr = !lRwPpHNL9.q3BipwRCk(this.kmSgne1rO, Float.NaN) ? kaIKYh6OP.iiGwOFFnr(this.kmSgne1rO) : 0;
        return kCA6Zs9sL < iiGwOFFnr ? iiGwOFFnr : kCA6Zs9sL;
    }

    @Override // con.BgIsSUB3d
    public Object sk5s77z6Q(Object obj, kkcQgCx5G kkcqgcx5g) {
        return kkcqgcx5g.WaUP0CF08(obj, this);
    }
}
