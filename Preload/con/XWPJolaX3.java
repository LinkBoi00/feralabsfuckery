package con;

import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public final class XWPJolaX3 extends CancellationException {
    public XWPJolaX3(long j) {
        super("Timed out waiting for " + j + " ms");
    }
}
