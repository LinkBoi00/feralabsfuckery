package con;
/* loaded from: classes.dex */
public abstract class pjo68E62a {
    public static final znEUQamgy q3BipwRCk;

    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        int i;
        Object obj;
        znEUQamgy zneuqamgy;
        Object obj2;
        String property = System.getProperty("java.specification.version");
        if (property != null) {
            int QNqj6nIzv = r6NbD4wnj.QNqj6nIzv(property, '.', 0, false, 6);
            try {
                if (QNqj6nIzv < 0) {
                    i = Integer.parseInt(property) * 65536;
                } else {
                    int i2 = QNqj6nIzv + 1;
                    int QNqj6nIzv2 = r6NbD4wnj.QNqj6nIzv(property, '.', i2, false, 4);
                    if (QNqj6nIzv2 < 0) {
                        QNqj6nIzv2 = property.length();
                    }
                    String substring = property.substring(0, QNqj6nIzv);
                    String substring2 = property.substring(i2, QNqj6nIzv2);
                    i = Integer.parseInt(substring2) + (Integer.parseInt(substring) * 65536);
                }
            } catch (NumberFormatException unused) {
            }
            if (i >= 65544) {
                try {
                    try {
                        try {
                            zneuqamgy = (znEUQamgy) llHm3sEr4.class.newInstance();
                        } catch (ClassCastException e) {
                            ClassLoader classLoader = obj2.getClass().getClassLoader();
                            ClassLoader classLoader2 = znEUQamgy.class.getClassLoader();
                            throw new ClassCastException("Instance classloader: " + classLoader + ", base type classloader: " + classLoader2).initCause(e);
                        }
                    } catch (ClassNotFoundException unused2) {
                    }
                } catch (ClassNotFoundException unused3) {
                    try {
                        zneuqamgy = (znEUQamgy) Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    } catch (ClassCastException e2) {
                        ClassLoader classLoader3 = obj.getClass().getClassLoader();
                        ClassLoader classLoader4 = znEUQamgy.class.getClassLoader();
                        throw new ClassCastException("Instance classloader: " + classLoader3 + ", base type classloader: " + classLoader4).initCause(e2);
                    }
                }
                q3BipwRCk = zneuqamgy;
            }
            if (i >= 65543) {
                try {
                    Object newInstance = x8igccjGb.class.newInstance();
                    try {
                        try {
                            zneuqamgy = (znEUQamgy) newInstance;
                        } catch (ClassCastException e3) {
                            ClassLoader classLoader5 = newInstance.getClass().getClassLoader();
                            ClassLoader classLoader6 = znEUQamgy.class.getClassLoader();
                            throw new ClassCastException("Instance classloader: " + classLoader5 + ", base type classloader: " + classLoader6).initCause(e3);
                        }
                    } catch (ClassNotFoundException unused4) {
                    }
                } catch (ClassNotFoundException unused5) {
                    Object newInstance2 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                    try {
                        zneuqamgy = (znEUQamgy) newInstance2;
                    } catch (ClassCastException e4) {
                        ClassLoader classLoader7 = newInstance2.getClass().getClassLoader();
                        ClassLoader classLoader8 = znEUQamgy.class.getClassLoader();
                        throw new ClassCastException("Instance classloader: " + classLoader7 + ", base type classloader: " + classLoader8).initCause(e4);
                    }
                }
                q3BipwRCk = zneuqamgy;
            }
            zneuqamgy = new znEUQamgy();
            q3BipwRCk = zneuqamgy;
        }
        i = 65542;
        if (i >= 65544) {
        }
        if (i >= 65543) {
        }
        zneuqamgy = new znEUQamgy();
        q3BipwRCk = zneuqamgy;
    }
}
