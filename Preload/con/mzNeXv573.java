package con;

import java.io.InputStream;
import java.util.List;
/* loaded from: classes.dex */
public class mzNeXv573 extends oWabOtI0E {
    public mzNeXv573(InputStream inputStream, List list) {
        super(inputStream, list);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        int parseInt;
        String q3BipwRCk = q3BipwRCk(true);
        if (q3BipwRCk == null) {
            parseInt = 1;
        } else {
            try {
                parseInt = Integer.parseInt(q3BipwRCk);
            } catch (NumberFormatException unused) {
                return 1;
            }
        }
        return Integer.valueOf(parseInt);
    }
}
