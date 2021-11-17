package con;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class emw2Oo1fE {
    public final HashMap q3BipwRCk = new HashMap();

    public final void q3BipwRCk() {
        for (TuTk89oZt tuTk89oZt : this.q3BipwRCk.values()) {
            Map map = tuTk89oZt.q3BipwRCk;
            if (map != null) {
                synchronized (map) {
                    for (Object obj : tuTk89oZt.q3BipwRCk.values()) {
                        if (obj instanceof Closeable) {
                            try {
                                ((Closeable) obj).close();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                    }
                }
            }
            tuTk89oZt.q3BipwRCk();
        }
        this.q3BipwRCk.clear();
    }
}
