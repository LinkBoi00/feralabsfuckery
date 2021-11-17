package con;

import java.lang.reflect.Constructor;
import java.util.Comparator;
/* loaded from: classes.dex */
public final class SBwiBzDMY implements Comparator {
    public final /* synthetic */ int q3BipwRCk;

    public SBwiBzDMY(int i) {
        this.q3BipwRCk = i;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        switch (this.q3BipwRCk) {
            case 0:
                pLYbCSTk0 plybcstk0 = (pLYbCSTk0) obj;
                pLYbCSTk0 plybcstk02 = (pLYbCSTk0) obj2;
                int oon79WMrY = anXlDk6fV.oon79WMrY(plybcstk0.Eeka1udhb, plybcstk02.Eeka1udhb);
                return oon79WMrY != 0 ? oon79WMrY : anXlDk6fV.oon79WMrY(plybcstk0.hashCode(), plybcstk02.hashCode());
            default:
                return dnBSj5uJN.Puu3Rhg4F(Integer.valueOf(((Constructor) obj2).getParameterTypes().length), Integer.valueOf(((Constructor) obj).getParameterTypes().length));
        }
    }
}
