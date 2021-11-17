package con;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class Q8LMXT0zT implements nBnrGO77H {
    public static final Q8LMXT0zT q3BipwRCk = new Q8LMXT0zT();

    @Override // con.nBnrGO77H
    public final aZDaaZZJA J4Ux7ym32(FRJidynr8 fRJidynr8, List list, long j) {
        PmanMZxiM pmanMZxiM;
        Map map;
        int i;
        int i2;
        int i3;
        int i4;
        int size = list.size();
        if (size != 0) {
            int i5 = 0;
            if (size != 1) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size() - 1;
                if (size2 >= 0) {
                    int i6 = 0;
                    while (true) {
                        int i7 = i6 + 1;
                        arrayList.add(((hKxHUWEcH) list.get(i6)).dIocxURUo(j));
                        if (i7 > size2) {
                            break;
                        }
                        i6 = i7;
                    }
                }
                int CBQ5d1kRq = idpM54xlp.CBQ5d1kRq(arrayList);
                if (CBQ5d1kRq >= 0) {
                    int i8 = 0;
                    int i9 = 0;
                    while (true) {
                        int i10 = i5 + 1;
                        n2gATecRC n2gatecrc = (n2gATecRC) arrayList.get(i5);
                        i8 = Math.max(i8, n2gatecrc.CBQ5d1kRq);
                        i9 = Math.max(i9, n2gatecrc.kmSgne1rO);
                        if (i5 == CBQ5d1kRq) {
                            break;
                        }
                        i5 = i10;
                    }
                    i4 = i8;
                    i3 = i9;
                } else {
                    i4 = 0;
                    i3 = 0;
                }
                return fRJidynr8.nlGCs0NZs(i4, i3, (r5 & 4) != 0 ? dmnvfTTyg.CBQ5d1kRq : null, new bvjNsSY6E(arrayList, 6));
            }
            n2gATecRC dIocxURUo = ((hKxHUWEcH) list.get(0)).dIocxURUo(j);
            i2 = dIocxURUo.CBQ5d1kRq;
            i = dIocxURUo.kmSgne1rO;
            map = null;
            pmanMZxiM = new VDA3chfQE(dIocxURUo, 7);
        } else {
            i2 = 0;
            i = 0;
            map = null;
            pmanMZxiM = ninsTdFW8.kmSgne1rO;
        }
        return fRJidynr8.nlGCs0NZs(i2, i, (r5 & 4) != 0 ? dmnvfTTyg.CBQ5d1kRq : null, pmanMZxiM);
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
