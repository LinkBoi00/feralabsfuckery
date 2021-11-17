package con;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.internal.MainDispatcherFactory;
/* loaded from: classes.dex */
public abstract class ZezE4t3SB {
    public static final zkUmn2JpE q3BipwRCk;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5 */
    static {
        MainDispatcherFactory mainDispatcherFactory;
        String tGV7Q6urW = bqV8ECpZf.tGV7Q6urW("kotlinx.coroutines.fast.service.loader");
        if (tGV7Q6urW != null) {
            Boolean.parseBoolean(tGV7Q6urW);
        }
        PmYqqGuHi axhkwsbum = new axHKWsBUm(ServiceLoader.load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader()).iterator());
        if (!(axhkwsbum instanceof WSTHXeAv1)) {
            axhkwsbum = new WSTHXeAv1(axhkwsbum);
        }
        List ilHKhw3Yw = IFeOgs2Gp.ilHKhw3Yw(axhkwsbum);
        Iterator it = ilHKhw3Yw.iterator();
        if (!it.hasNext()) {
            mainDispatcherFactory = null;
        } else {
            Object next = it.next();
            if (it.hasNext()) {
                int loadPriority = ((MainDispatcherFactory) next).getLoadPriority();
                do {
                    Object next2 = it.next();
                    int loadPriority2 = ((MainDispatcherFactory) next2).getLoadPriority();
                    if (loadPriority < loadPriority2) {
                        next = next2;
                        loadPriority = loadPriority2;
                    }
                } while (it.hasNext());
            }
            mainDispatcherFactory = next;
        }
        MainDispatcherFactory mainDispatcherFactory2 = mainDispatcherFactory;
        if (mainDispatcherFactory2 != null) {
            q3BipwRCk = mainDispatcherFactory2.createDispatcher(ilHKhw3Yw);
            return;
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
