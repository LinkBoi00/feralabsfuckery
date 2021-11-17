package con;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class ynEKnFhv0 extends CancellationException {
    public final JEWwjBE8f CBQ5d1kRq;

    public ynEKnFhv0(String str, Throwable th, JEWwjBE8f jEWwjBE8f) {
        super(str);
        this.CBQ5d1kRq = jEWwjBE8f;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ynEKnFhv0) {
                ynEKnFhv0 yneknfhv0 = (ynEKnFhv0) obj;
                if (!anXlDk6fV.tGV7Q6urW(yneknfhv0.getMessage(), getMessage()) || !anXlDk6fV.tGV7Q6urW(yneknfhv0.CBQ5d1kRq, this.CBQ5d1kRq) || !anXlDk6fV.tGV7Q6urW(yneknfhv0.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (this.CBQ5d1kRq.hashCode() + (getMessage().hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    @Override // java.lang.Throwable, java.lang.Object
    public String toString() {
        return super.toString() + "; job=" + this.CBQ5d1kRq;
    }
}
