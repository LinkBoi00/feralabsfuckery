package con;

import java.util.List;
/* loaded from: classes.dex */
public final class fcHY0T0e7 implements nBnrGO77H {
    public final /* synthetic */ B01AuRyT3 J4Ux7ym32;
    public final /* synthetic */ boolean q3BipwRCk;

    public fcHY0T0e7(boolean z, B01AuRyT3 b01AuRyT3) {
        this.q3BipwRCk = z;
        this.J4Ux7ym32 = b01AuRyT3;
    }

    @Override // con.nBnrGO77H
    public final aZDaaZZJA J4Ux7ym32(FRJidynr8 fRJidynr8, List list, long j) {
        int i;
        if (list.isEmpty()) {
            return fRJidynr8.nlGCs0NZs(K5PjwoFCN.vPSbyrYWX(j), K5PjwoFCN.oon79WMrY(j), (r5 & 4) != 0 ? dmnvfTTyg.CBQ5d1kRq : null, GQN3dSqKV.i8XZMQc6Z);
        }
        long q3BipwRCk = this.q3BipwRCk ? j : K5PjwoFCN.q3BipwRCk(j, 0, 0, 0, 0, 10);
        i = 0;
        if (list.size() == 1) {
            hKxHUWEcH hkxhuwech = (hKxHUWEcH) list.get(0);
            hkxhuwech.Bhmn1KIah();
            n2gATecRC dIocxURUo = hkxhuwech.dIocxURUo(q3BipwRCk);
            int max = Math.max(K5PjwoFCN.vPSbyrYWX(j), dIocxURUo.CBQ5d1kRq);
            int max2 = Math.max(K5PjwoFCN.oon79WMrY(j), dIocxURUo.kmSgne1rO);
            return fRJidynr8.nlGCs0NZs(max, max2, (r5 & 4) != 0 ? dmnvfTTyg.CBQ5d1kRq : null, new zGizS1NLT(dIocxURUo, hkxhuwech, fRJidynr8, max, max2, this.J4Ux7ym32));
        }
        n2gATecRC[] n2gatecrcArr = new n2gATecRC[list.size()];
        BdFQ0RqNz bdFQ0RqNz = new BdFQ0RqNz();
        bdFQ0RqNz.CBQ5d1kRq = K5PjwoFCN.vPSbyrYWX(j);
        BdFQ0RqNz bdFQ0RqNz2 = new BdFQ0RqNz();
        bdFQ0RqNz2.CBQ5d1kRq = K5PjwoFCN.oon79WMrY(j);
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = i + 1;
                hKxHUWEcH hkxhuwech2 = (hKxHUWEcH) list.get(i);
                hkxhuwech2.Bhmn1KIah();
                n2gATecRC dIocxURUo2 = hkxhuwech2.dIocxURUo(q3BipwRCk);
                n2gatecrcArr[i] = dIocxURUo2;
                bdFQ0RqNz.CBQ5d1kRq = Math.max(bdFQ0RqNz.CBQ5d1kRq, dIocxURUo2.CBQ5d1kRq);
                bdFQ0RqNz2.CBQ5d1kRq = Math.max(bdFQ0RqNz2.CBQ5d1kRq, dIocxURUo2.kmSgne1rO);
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return fRJidynr8.nlGCs0NZs(bdFQ0RqNz.CBQ5d1kRq, bdFQ0RqNz2.CBQ5d1kRq, (r5 & 4) != 0 ? dmnvfTTyg.CBQ5d1kRq : null, new U48BhvBiX(n2gatecrcArr, list, fRJidynr8, bdFQ0RqNz, bdFQ0RqNz2, this.J4Ux7ym32));
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
