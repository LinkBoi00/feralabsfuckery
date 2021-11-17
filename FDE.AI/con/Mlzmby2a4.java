package con;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes.dex */
public final class Mlzmby2a4 extends JQhKJ2jfw {
    public static final /* synthetic */ AtomicReferenceFieldUpdater q3BipwRCk = AtomicReferenceFieldUpdater.newUpdater(Mlzmby2a4.class, Object.class, "_state");
    public volatile /* synthetic */ Object _state = null;

    @Override // con.JQhKJ2jfw
    public Way959ade[] J4Ux7ym32(Object obj) {
        I5LF8ecws i5LF8ecws = (I5LF8ecws) obj;
        this._state = null;
        return OYElP68OS.q3BipwRCk;
    }

    @Override // con.JQhKJ2jfw
    public boolean q3BipwRCk(Object obj) {
        I5LF8ecws i5LF8ecws = (I5LF8ecws) obj;
        if (this._state != null) {
            return false;
        }
        this._state = oKXqDRKlG.q3BipwRCk;
        return true;
    }
}
