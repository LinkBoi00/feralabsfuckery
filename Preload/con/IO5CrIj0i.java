package con;
/* loaded from: classes.dex */
public abstract class IO5CrIj0i {
    public static final ThreadLocal J4Ux7ym32 = new ThreadLocal();
    public static final IO5CrIj0i q3BipwRCk;

    public static final ev1IlyvL8 q3BipwRCk() {
        ThreadLocal threadLocal = J4Ux7ym32;
        ev1IlyvL8 ev1ilyvl8 = (ev1IlyvL8) threadLocal.get();
        if (ev1ilyvl8 != null) {
            return ev1ilyvl8;
        }
        yJxt3ZYOz yjxt3zyoz = new yJxt3ZYOz(Thread.currentThread());
        threadLocal.set(yjxt3zyoz);
        return yjxt3zyoz;
    }
}
