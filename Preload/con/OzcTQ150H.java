package con;

import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class OzcTQ150H implements FRJidynr8 {
    public float Bhmn1KIah;
    public BFRsKhrQv CBQ5d1kRq = BFRsKhrQv.Rtl;
    public final /* synthetic */ pW31wYUjR PSTqBLTET;
    public float kmSgne1rO;

    public OzcTQ150H(pW31wYUjR pw31wyujr) {
        this.PSTqBLTET = pw31wyujr;
    }

    public List J4Ux7ym32(Object obj, kkcQgCx5G kkcqgcx5g) {
        pW31wYUjR pw31wyujr = this.PSTqBLTET;
        pw31wyujr.tGV7Q6urW();
        LCC21UP9O lcc21up9o = pw31wyujr.J4Ux7ym32().dXrmkklc8;
        boolean z = false;
        if (lcc21up9o == LCC21UP9O.Measuring || lcc21up9o == LCC21UP9O.LayingOut) {
            Map map = pw31wyujr.Puu3Rhg4F;
            Object obj2 = map.get(obj);
            if (obj2 == null) {
                obj2 = (pLYbCSTk0) pw31wyujr.oon79WMrY.remove(obj);
                if (obj2 != null) {
                    int i = pw31wyujr.CBQ5d1kRq;
                    if (i > 0) {
                        z = true;
                    }
                    if (z) {
                        pw31wyujr.CBQ5d1kRq = i - 1;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    obj2 = pw31wyujr.vPSbyrYWX > 0 ? pw31wyujr.iiGwOFFnr(obj) : pw31wyujr.q3BipwRCk(pw31wyujr.iiGwOFFnr);
                }
                map.put(obj, obj2);
            }
            pLYbCSTk0 plybcstk0 = (pLYbCSTk0) obj2;
            int indexOf = pw31wyujr.J4Ux7ym32().yWvV4ePLl().indexOf(plybcstk0);
            int i2 = pw31wyujr.iiGwOFFnr;
            if (indexOf >= i2) {
                if (i2 != indexOf) {
                    pw31wyujr.dIocxURUo(indexOf, i2, 1);
                }
                pw31wyujr.iiGwOFFnr++;
                pw31wyujr.kCA6Zs9sL(plybcstk0, obj, kkcqgcx5g);
                return plybcstk0.Puu3Rhg4F();
            }
            throw new IllegalArgumentException("Key " + obj + " was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
        }
        throw new IllegalStateException("subcompose can only be used inside the measure or layout blocks".toString());
    }

    @Override // con.AU29aHa4X
    public float MzoOEjc4X(float f) {
        return iOdo7IZgc.iiGwOFFnr(this, f);
    }

    @Override // con.AU29aHa4X
    public long PSTqBLTET(long j) {
        return iOdo7IZgc.GPLPRo6go(this, j);
    }

    @Override // con.AU29aHa4X
    public float dfpT1j18n(int i) {
        return iOdo7IZgc.dIocxURUo(this, i);
    }

    @Override // con.AU29aHa4X
    public float getDensity() {
        return this.kmSgne1rO;
    }

    @Override // con.KaIKYh6OP
    public BFRsKhrQv getLayoutDirection() {
        return this.CBQ5d1kRq;
    }

    @Override // con.AU29aHa4X
    public int iiGwOFFnr(float f) {
        return iOdo7IZgc.tGV7Q6urW(this, f);
    }

    @Override // con.AU29aHa4X
    public float ilHKhw3Yw(long j) {
        return iOdo7IZgc.kCA6Zs9sL(this, j);
    }

    @Override // con.FRJidynr8
    public aZDaaZZJA nlGCs0NZs(int i, int i2, Map map, PmanMZxiM pmanMZxiM) {
        return xpuSUT7Gh.L4EwGfXiQ(this, i, i2, map, pmanMZxiM);
    }

    @Override // con.AU29aHa4X
    public float yWvV4ePLl() {
        return this.Bhmn1KIah;
    }
}
