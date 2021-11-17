package androidx.lifecycle;

import con.YQRnmeVtH;
import con.mScwA0bsb;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public abstract class mhl5lIdbQ {
    public AtomicReference q3BipwRCk = new AtomicReference();

    /* loaded from: classes.dex */
    public enum RG2GI7LDp {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static RG2GI7LDp J4Ux7ym32(EnumC0005mhl5lIdbQ mhl5lidbq) {
            int ordinal = mhl5lidbq.ordinal();
            if (ordinal == 1) {
                return ON_CREATE;
            }
            if (ordinal == 2) {
                return ON_START;
            }
            if (ordinal != 3) {
                return null;
            }
            return ON_RESUME;
        }

        public EnumC0005mhl5lIdbQ q3BipwRCk() {
            switch (YQRnmeVtH.J4Ux7ym32[ordinal()]) {
                case 1:
                case 2:
                    return EnumC0005mhl5lIdbQ.CREATED;
                case 3:
                case 4:
                    return EnumC0005mhl5lIdbQ.STARTED;
                case 5:
                    return EnumC0005mhl5lIdbQ.RESUMED;
                case 6:
                    return EnumC0005mhl5lIdbQ.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: androidx.lifecycle.mhl5lIdbQ$mhl5lIdbQ */
    /* loaded from: classes.dex */
    public enum EnumC0005mhl5lIdbQ {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED
    }

    public abstract void J4Ux7ym32(mScwA0bsb mscwa0bsb);

    public abstract void q3BipwRCk(mScwA0bsb mscwa0bsb);
}
