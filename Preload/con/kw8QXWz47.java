package con;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class kw8QXWz47 {
    public View J4Ux7ym32;
    public final Map q3BipwRCk = new HashMap();
    public final ArrayList tGV7Q6urW = new ArrayList();

    public kw8QXWz47(View view) {
        this.J4Ux7ym32 = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof kw8QXWz47)) {
            return false;
        }
        kw8QXWz47 kw8qxwz47 = (kw8QXWz47) obj;
        return this.J4Ux7ym32 == kw8qxwz47.J4Ux7ym32 && this.q3BipwRCk.equals(kw8qxwz47.q3BipwRCk);
    }

    public int hashCode() {
        return this.q3BipwRCk.hashCode() + (this.J4Ux7ym32.hashCode() * 31);
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("TransitionValues@");
        q3BipwRCk.append(Integer.toHexString(hashCode()));
        q3BipwRCk.append(":\n");
        String q3BipwRCk2 = UexvVay3o.q3BipwRCk(q3BipwRCk.toString() + "    view = " + this.J4Ux7ym32 + "\n", "    values:");
        for (String str : this.q3BipwRCk.keySet()) {
            q3BipwRCk2 = q3BipwRCk2 + "    " + str + ": " + this.q3BipwRCk.get(str) + "\n";
        }
        return q3BipwRCk2;
    }
}
