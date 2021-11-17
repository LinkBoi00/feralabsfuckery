package con;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
/* loaded from: classes.dex */
public class J6Ggjrgp5 implements Comparator {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r0 == null) goto L_0x0019;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
        if (r0 != false) goto L_0x001b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        return -1;
     */
    @Override // java.util.Comparator
    /* Code decompiled incorrectly, please refer to instructions dump */
    public int compare(Object obj, Object obj2) {
        k5WAg6czX k5wag6czx = (k5WAg6czX) obj;
        k5WAg6czX k5wag6czx2 = (k5WAg6czX) obj2;
        RecyclerView recyclerView = k5wag6czx.dIocxURUo;
        if ((recyclerView == null) == (k5wag6czx2.dIocxURUo == null)) {
            boolean z = k5wag6czx.q3BipwRCk;
            if (z == k5wag6czx2.q3BipwRCk) {
                int i = k5wag6czx2.J4Ux7ym32 - k5wag6czx.J4Ux7ym32;
                if (i != 0) {
                    return i;
                }
                int i2 = k5wag6czx.tGV7Q6urW - k5wag6czx2.tGV7Q6urW;
                if (i2 != 0) {
                    return i2;
                }
                return 0;
            }
        }
    }
}
