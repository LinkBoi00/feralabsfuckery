package con;

import android.content.Context;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class OnIfqvynM {
    public static volatile OnIfqvynM dIocxURUo;
    public static final Object kCA6Zs9sL = new Object();
    public final Set J4Ux7ym32 = new HashSet();
    public final Map q3BipwRCk = new HashMap();
    public final Context tGV7Q6urW;

    public OnIfqvynM(Context context) {
        this.tGV7Q6urW = context.getApplicationContext();
    }

    public Object q3BipwRCk(Class cls, Set set) {
        Object obj;
        synchronized (kCA6Zs9sL) {
            if (QWJmHBGHJ.q3BipwRCk()) {
                Trace.beginSection(cls.getSimpleName());
            }
            if (!set.contains(cls)) {
                if (!this.q3BipwRCk.containsKey(cls)) {
                    set.add(cls);
                    try {
                        UgMB5z3WN ugMB5z3WN = (UgMB5z3WN) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        List<Class> q3BipwRCk = ugMB5z3WN.q3BipwRCk();
                        if (!q3BipwRCk.isEmpty()) {
                            for (Class cls2 : q3BipwRCk) {
                                if (!this.q3BipwRCk.containsKey(cls2)) {
                                    q3BipwRCk(cls2, set);
                                }
                            }
                        }
                        obj = ugMB5z3WN.J4Ux7ym32(this.tGV7Q6urW);
                        set.remove(cls);
                        this.q3BipwRCk.put(cls, obj);
                    } catch (Throwable th) {
                        throw new cWAoh0O7N(th);
                    }
                } else {
                    obj = this.q3BipwRCk.get(cls);
                }
                Trace.endSection();
            } else {
                throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
            }
        }
        return obj;
    }
}
