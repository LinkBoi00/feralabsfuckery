package con;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class wg3ZoppQg implements Way959ade, gXw4WGPur {
    @Deprecated
    public static final AtomicReferenceFieldUpdater kmSgne1rO = AtomicReferenceFieldUpdater.newUpdater(wg3ZoppQg.class, Object.class, "result");
    public final Way959ade CBQ5d1kRq;
    private volatile Object result;

    public wg3ZoppQg(Way959ade way959ade, Object obj) {
        this.CBQ5d1kRq = way959ade;
        this.result = obj;
    }

    @Override // con.Way959ade
    public void Bhmn1KIah(Object obj) {
        while (true) {
            Object obj2 = this.result;
            kBKJSqCSL kbkjsqcsl = kBKJSqCSL.UNDECIDED;
            if (obj2 != kbkjsqcsl) {
                kBKJSqCSL kbkjsqcsl2 = kBKJSqCSL.COROUTINE_SUSPENDED;
                if (obj2 != kbkjsqcsl2) {
                    throw new IllegalStateException("Already resumed");
                } else if (kmSgne1rO.compareAndSet(this, kbkjsqcsl2, kBKJSqCSL.RESUMED)) {
                    this.CBQ5d1kRq.Bhmn1KIah(obj);
                    return;
                }
            } else if (kmSgne1rO.compareAndSet(this, kbkjsqcsl, obj)) {
                return;
            }
        }
    }

    @Override // con.Way959ade
    public bu5cjmae6 kCA6Zs9sL() {
        return this.CBQ5d1kRq.kCA6Zs9sL();
    }

    @Override // con.gXw4WGPur
    public gXw4WGPur tGV7Q6urW() {
        Way959ade way959ade = this.CBQ5d1kRq;
        if (!(way959ade instanceof gXw4WGPur)) {
            way959ade = null;
        }
        return (gXw4WGPur) way959ade;
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("SafeContinuation for ");
        q3BipwRCk.append(this.CBQ5d1kRq);
        return q3BipwRCk.toString();
    }
}
