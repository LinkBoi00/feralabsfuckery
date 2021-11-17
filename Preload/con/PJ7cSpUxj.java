package con;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public final class PJ7cSpUxj extends zo6RfsWe2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater tGV7Q6urW = AtomicIntegerFieldUpdater.newUpdater(PJ7cSpUxj.class, "_resumed");
    private volatile /* synthetic */ int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public PJ7cSpUxj(Way959ade way959ade, Throwable th, boolean z) {
        super(th, z);
        if (th == null) {
            th = new CancellationException("Continuation " + way959ade + " was cancelled normally");
        }
        this._resumed = 0;
    }
}
