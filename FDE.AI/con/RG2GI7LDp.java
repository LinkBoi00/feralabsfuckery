package con;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class RG2GI7LDp extends CancellationException {
    public final f106ugAzx CBQ5d1kRq;

    public RG2GI7LDp(f106ugAzx f106ugazx) {
        super("Flow was aborted, no more elements needed");
        this.CBQ5d1kRq = f106ugazx;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
