package con;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class Of4EROl6B {
    public final Set J4Ux7ym32 = new LinkedHashSet();
    public final ogG45sslV q3BipwRCk;

    public Of4EROl6B(or5nbo9ku or5nbo9ku, Map map) {
        this.q3BipwRCk = or5nbo9ku.kCA6Zs9sL;
        List yWvV4ePLl = or5nbo9ku.yWvV4ePLl();
        int i = 0;
        int size = yWvV4ePLl.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = i + 1;
                or5nbo9ku or5nbo9ku2 = (or5nbo9ku) yWvV4ePLl.get(i);
                if (map.containsKey(Integer.valueOf(or5nbo9ku2.iiGwOFFnr))) {
                    this.J4Ux7ym32.add(Integer.valueOf(or5nbo9ku2.iiGwOFFnr));
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
