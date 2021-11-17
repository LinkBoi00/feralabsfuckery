package con;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class YyAOG9Su3 implements nBnrGO77H {
    public static final YyAOG9Su3 q3BipwRCk = new YyAOG9Su3();

    @Override // con.nBnrGO77H
    public final aZDaaZZJA J4Ux7ym32(FRJidynr8 fRJidynr8, List list, long j) {
        Integer num;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size() - 1;
        int i = 0;
        Integer num2 = 0;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                arrayList.add(((hKxHUWEcH) list.get(i2)).dIocxURUo(j));
                if (i3 > size) {
                    break;
                }
                i2 = i3;
            }
        }
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            num = num2;
            while (true) {
                int i5 = i4 + 1;
                num = Integer.valueOf(Math.max(num.intValue(), ((n2gATecRC) arrayList.get(i4)).CBQ5d1kRq));
                if (i5 > size2) {
                    break;
                }
                i4 = i5;
            }
        } else {
            num = num2;
        }
        int intValue = num.intValue();
        int size3 = arrayList.size() - 1;
        if (size3 >= 0) {
            while (true) {
                int i6 = i + 1;
                num2 = Integer.valueOf(Math.max(num2.intValue(), ((n2gATecRC) arrayList.get(i)).kmSgne1rO));
                if (i6 > size3) {
                    break;
                }
                i = i6;
            }
        }
        return fRJidynr8.nlGCs0NZs(intValue, num2.intValue(), (r5 & 4) != 0 ? dmnvfTTyg.CBQ5d1kRq : null, new bvjNsSY6E(arrayList, 3));
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
