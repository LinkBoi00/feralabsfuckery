package con;
/* loaded from: classes.dex */
public abstract class plqClx8zg {
    public static final vX9ZKIhAp q3BipwRCk = new vX9ZKIhAp("REMOVED_TASK");
    public static final vX9ZKIhAp J4Ux7ym32 = new vX9ZKIhAp("CLOSED_EMPTY");

    public static final long q3BipwRCk(long j) {
        if (j <= 0) {
            return 0;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j;
    }
}
