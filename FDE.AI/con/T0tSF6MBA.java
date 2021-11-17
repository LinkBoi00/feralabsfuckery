package con;

import java.util.List;
/* loaded from: classes.dex */
public abstract class T0tSF6MBA {
    public static final void q3BipwRCk(A2fLYD2UL a2fLYD2UL, List list) {
        Object obj;
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                hKxHUWEcH hkxhuwech = (hKxHUWEcH) list.get(i);
                Object Bhmn1KIah = hkxhuwech.Bhmn1KIah();
                ldH4l9sHo ldh4l9sho = null;
                FiQJL8Ct3 fiQJL8Ct3 = Bhmn1KIah instanceof FiQJL8Ct3 ? (FiQJL8Ct3) Bhmn1KIah : null;
                if (fiQJL8Ct3 != null) {
                    ldh4l9sho = fiQJL8Ct3.CBQ5d1kRq;
                }
                if (ldh4l9sho == null) {
                    obj = ODug2UCW1.RG6kpfv3v(hkxhuwech);
                } else {
                    obj = ldh4l9sho.q3BipwRCk;
                }
                if (obj == null) {
                    obj = new JhpbRXxsg(28);
                }
                HAVKqwFVy q3BipwRCk = a2fLYD2UL.q3BipwRCk(obj);
                if (q3BipwRCk instanceof HAVKqwFVy) {
                    q3BipwRCk.cAwN510t2 = hkxhuwech;
                    k007RzV1x k007rzv1x = q3BipwRCk.IytU16YUK;
                    if (k007rzv1x != null) {
                        k007rzv1x.ln3nf7LH3 = hkxhuwech;
                    }
                }
                if (i2 <= size) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }
}
