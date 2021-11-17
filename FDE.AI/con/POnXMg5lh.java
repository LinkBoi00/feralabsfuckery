package con;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public abstract class POnXMg5lh {
    public static final Q4TFMtvSV q3BipwRCk = new Q4TFMtvSV(21);

    public static final int J4Ux7ym32(W39e6bnPN w39e6bnPN, Hncu9o7E0 hncu9o7E0, String str) {
        int tGV7Q6urW = w39e6bnPN.tGV7Q6urW(str);
        if (tGV7Q6urW != -3) {
            return tGV7Q6urW;
        }
        if (!hncu9o7E0.q3BipwRCk.CBQ5d1kRq) {
            return tGV7Q6urW;
        }
        Integer num = (Integer) ((Map) hncu9o7E0.tGV7Q6urW.J4Ux7ym32(w39e6bnPN, q3BipwRCk, new gdEmqfwpT(w39e6bnPN) { // from class: con.SlyhI8xie
            @Override // con.gdEmqfwpT
            public Object GPLPRo6go() {
                return POnXMg5lh.q3BipwRCk((W39e6bnPN) this.kmSgne1rO);
            }
        })).get(str);
        if (num == null) {
            return -3;
        }
        return num.intValue();
    }

    public static final Map q3BipwRCk(W39e6bnPN w39e6bnPN) {
        String[] names;
        int CBQ5d1kRq = w39e6bnPN.CBQ5d1kRq();
        ConcurrentHashMap concurrentHashMap = null;
        if (CBQ5d1kRq > 0) {
            ConcurrentHashMap concurrentHashMap2 = null;
            int i = 0;
            while (true) {
                int i2 = i + 1;
                List GPLPRo6go = w39e6bnPN.GPLPRo6go(i);
                ArrayList arrayList = new ArrayList();
                for (Object obj : GPLPRo6go) {
                    if (obj instanceof dqG1vphO9) {
                        arrayList.add(obj);
                    }
                }
                dqG1vphO9 dqg1vpho9 = (dqG1vphO9) (arrayList.size() == 1 ? arrayList.get(0) : null);
                if (!(dqg1vpho9 == null || (names = dqg1vpho9.names()) == null)) {
                    for (String str : names) {
                        if (concurrentHashMap2 == null) {
                            concurrentHashMap2 = new ConcurrentHashMap(w39e6bnPN.CBQ5d1kRq());
                        }
                        if (!concurrentHashMap2.containsKey(str)) {
                            concurrentHashMap2.put(str, Integer.valueOf(i));
                        } else {
                            StringBuilder q3BipwRCk2 = eEPBBadYl.q3BipwRCk("The suggested name '", str, "' for property ");
                            q3BipwRCk2.append(w39e6bnPN.q3BipwRCk(i));
                            q3BipwRCk2.append(" is already one of the names for property ");
                            q3BipwRCk2.append(w39e6bnPN.q3BipwRCk(((Number) s0tSbdszx.nlGCs0NZs(concurrentHashMap2, str)).intValue()));
                            q3BipwRCk2.append(" in ");
                            q3BipwRCk2.append(w39e6bnPN);
                            throw new ti5UUcLvO(q3BipwRCk2.toString());
                        }
                    }
                }
                if (i2 >= CBQ5d1kRq) {
                    concurrentHashMap = concurrentHashMap2;
                    break;
                }
                i = i2;
            }
        }
        return concurrentHashMap == null ? dmnvfTTyg.CBQ5d1kRq : concurrentHashMap;
    }

    public static final int tGV7Q6urW(W39e6bnPN w39e6bnPN, Hncu9o7E0 hncu9o7E0, String str) {
        int J4Ux7ym32 = J4Ux7ym32(w39e6bnPN, hncu9o7E0, str);
        if (J4Ux7ym32 != -3) {
            return J4Ux7ym32;
        }
        throw new oPOFYJ4Sr(w39e6bnPN.dIocxURUo() + " does not contain element with name '" + str + '\'');
    }
}
