package con;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public final class AcpiZ60A3 implements W39e6bnPN, bq3D8Szxb {
    public final llWJsfBCK CBQ5d1kRq;
    public final W39e6bnPN[] GPLPRo6go;
    public final EMeKvJHwJ J4Ux7ym32;
    public final List[] Puu3Rhg4F;
    public final List dIocxURUo;
    public final String[] iiGwOFFnr;
    public final Set kCA6Zs9sL;
    public final Map oon79WMrY;
    public final String q3BipwRCk;
    public final int tGV7Q6urW;
    public final W39e6bnPN[] vPSbyrYWX;
    public final boolean[] yWvV4ePLl;

    public AcpiZ60A3(String str, EMeKvJHwJ eMeKvJHwJ, int i, List list, oGM5mmQi7 ogm5mmqi7) {
        this.q3BipwRCk = str;
        this.J4Ux7ym32 = eMeKvJHwJ;
        this.tGV7Q6urW = i;
        this.dIocxURUo = ogm5mmqi7.q3BipwRCk;
        List list2 = ogm5mmqi7.J4Ux7ym32;
        HashSet hashSet = new HashSet(anXlDk6fV.WaUP0CF08(CjvsxH2Me.nlGCs0NZs(list2, 12)));
        wkFJfVmcv.ziwPzaoF3(list2, hashSet);
        this.kCA6Zs9sL = hashSet;
        int i2 = 0;
        Object[] array = ogm5mmqi7.J4Ux7ym32.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        this.iiGwOFFnr = (String[]) array;
        this.GPLPRo6go = gScbsbDFV.J4Ux7ym32(ogm5mmqi7.dIocxURUo);
        Object[] array2 = ogm5mmqi7.kCA6Zs9sL.toArray(new List[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
        this.Puu3Rhg4F = (List[]) array2;
        List<Boolean> list3 = ogm5mmqi7.iiGwOFFnr;
        boolean[] zArr = new boolean[list3.size()];
        for (Boolean bool : list3) {
            i2++;
            zArr[i2] = bool.booleanValue();
        }
        this.yWvV4ePLl = zArr;
        xa6IjhTtJ xa6ijhttj = new xa6IjhTtJ(new nwvyEZJPU(this.iiGwOFFnr));
        ArrayList arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(xa6ijhttj, 10));
        Iterator it = xa6ijhttj.iterator();
        while (it.hasNext()) {
            KJq8y1k90 kJq8y1k90 = (KJq8y1k90) it.next();
            arrayList.add(new n4f84B5OG(kJq8y1k90.J4Ux7ym32, Integer.valueOf(kJq8y1k90.q3BipwRCk)));
        }
        this.oon79WMrY = s0tSbdszx.mUqPm6GBh(arrayList);
        this.vPSbyrYWX = gScbsbDFV.J4Ux7ym32(list);
        this.CBQ5d1kRq = anXlDk6fV.ixWaw2akD(new nwvyEZJPU(this));
    }

    @Override // con.W39e6bnPN
    public int CBQ5d1kRq() {
        return this.tGV7Q6urW;
    }

    @Override // con.W39e6bnPN
    public List GPLPRo6go(int i) {
        return this.Puu3Rhg4F[i];
    }

    @Override // con.W39e6bnPN
    public boolean J4Ux7ym32() {
        return false;
    }

    @Override // con.W39e6bnPN
    public W39e6bnPN Puu3Rhg4F(int i) {
        return this.GPLPRo6go[i];
    }

    @Override // con.W39e6bnPN
    public String dIocxURUo() {
        return this.q3BipwRCk;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AcpiZ60A3) {
            W39e6bnPN w39e6bnPN = (W39e6bnPN) obj;
            if (anXlDk6fV.tGV7Q6urW(dIocxURUo(), w39e6bnPN.dIocxURUo()) && Arrays.equals(this.vPSbyrYWX, ((AcpiZ60A3) obj).vPSbyrYWX) && CBQ5d1kRq() == w39e6bnPN.CBQ5d1kRq()) {
                int CBQ5d1kRq = CBQ5d1kRq();
                if (CBQ5d1kRq > 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        if (!anXlDk6fV.tGV7Q6urW(Puu3Rhg4F(i).dIocxURUo(), w39e6bnPN.Puu3Rhg4F(i).dIocxURUo()) || !anXlDk6fV.tGV7Q6urW(Puu3Rhg4F(i).yWvV4ePLl(), w39e6bnPN.Puu3Rhg4F(i).yWvV4ePLl())) {
                            break;
                        } else if (i2 >= CBQ5d1kRq) {
                            return true;
                        } else {
                            i = i2;
                        }
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Number) this.CBQ5d1kRq.getValue()).intValue();
    }

    @Override // con.W39e6bnPN
    public boolean iiGwOFFnr() {
        return false;
    }

    @Override // con.bq3D8Szxb
    public Set kCA6Zs9sL() {
        return this.kCA6Zs9sL;
    }

    @Override // con.W39e6bnPN
    public boolean oon79WMrY(int i) {
        return this.yWvV4ePLl[i];
    }

    @Override // con.W39e6bnPN
    public String q3BipwRCk(int i) {
        return this.iiGwOFFnr[i];
    }

    @Override // con.W39e6bnPN
    public int tGV7Q6urW(String str) {
        Integer num = (Integer) this.oon79WMrY.get(str);
        if (num == null) {
            return -3;
        }
        return num.intValue();
    }

    public String toString() {
        return wkFJfVmcv.EBQXiIPmm(cT9gik1zL.yWvV4ePLl(0, this.tGV7Q6urW), ", ", anXlDk6fV.iMyQMM6Qj(this.q3BipwRCk, "("), ")", 0, null, new nVhenZUxZ(this), 24);
    }

    @Override // con.W39e6bnPN
    public List vPSbyrYWX() {
        return this.dIocxURUo;
    }

    @Override // con.W39e6bnPN
    public EMeKvJHwJ yWvV4ePLl() {
        return this.J4Ux7ym32;
    }
}
