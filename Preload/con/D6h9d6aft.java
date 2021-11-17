package con;

import java.util.concurrent.ThreadFactory;
/* loaded from: classes.dex */
public class D6h9d6aft implements ThreadFactory {
    public int J4Ux7ym32;
    public String q3BipwRCk;

    public D6h9d6aft(String str, int i) {
        this.q3BipwRCk = str;
        this.J4Ux7ym32 = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new bB9AMtHCI(runnable, this.q3BipwRCk, this.J4Ux7ym32);
    }
}
