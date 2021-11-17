package con;

import java.util.Random;
/* loaded from: classes.dex */
public final class z9wyptW64 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public Object initialValue() {
        return new Random();
    }
}
