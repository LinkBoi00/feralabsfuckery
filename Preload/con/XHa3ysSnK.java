package con;
/* loaded from: classes.dex */
public abstract class XHa3ysSnK {
    public static final vX9ZKIhAp J4Ux7ym32;
    public static final KkUQJJyYY dIocxURUo;
    public static final KkUQJJyYY kCA6Zs9sL;
    public static final vX9ZKIhAp q3BipwRCk = new vX9ZKIhAp("UNLOCK_FAIL");
    public static final vX9ZKIhAp tGV7Q6urW;

    static {
        vX9ZKIhAp vx9zkihap = new vX9ZKIhAp("LOCKED");
        J4Ux7ym32 = vx9zkihap;
        vX9ZKIhAp vx9zkihap2 = new vX9ZKIhAp("UNLOCKED");
        tGV7Q6urW = vx9zkihap2;
        dIocxURUo = new KkUQJJyYY(vx9zkihap);
        kCA6Zs9sL = new KkUQJJyYY(vx9zkihap2);
    }

    public static BoHshzX5h q3BipwRCk(boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        return new eIPvIAVtY(z);
    }
}
