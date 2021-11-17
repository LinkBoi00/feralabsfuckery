package con;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* loaded from: classes.dex */
public final class oGM5mmQi7 {
    public List q3BipwRCk = Dqz1pJHWH.CBQ5d1kRq;
    public final List J4Ux7ym32 = new ArrayList();
    public final Set tGV7Q6urW = new HashSet();
    public final List dIocxURUo = new ArrayList();
    public final List kCA6Zs9sL = new ArrayList();
    public final List iiGwOFFnr = new ArrayList();

    public oGM5mmQi7(String str) {
    }

    public static void q3BipwRCk(oGM5mmQi7 ogm5mmqi7, String str, W39e6bnPN w39e6bnPN, List list, boolean z, int i) {
        Dqz1pJHWH dqz1pJHWH = (i & 4) != 0 ? Dqz1pJHWH.CBQ5d1kRq : null;
        if ((i & 8) != 0) {
            z = false;
        }
        if (ogm5mmqi7.tGV7Q6urW.add(str)) {
            ogm5mmqi7.J4Ux7ym32.add(str);
            ogm5mmqi7.dIocxURUo.add(w39e6bnPN);
            ogm5mmqi7.kCA6Zs9sL.add(dqz1pJHWH);
            ogm5mmqi7.iiGwOFFnr.add(Boolean.valueOf(z));
            return;
        }
        throw new IllegalArgumentException(M5g57XBLr.q3BipwRCk("Element with name '", str, "' is already registered").toString());
    }
}
