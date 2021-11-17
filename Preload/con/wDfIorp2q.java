package con;

import android.view.ViewConfiguration;
/* loaded from: classes.dex */
public final class wDfIorp2q implements fCkNY70T9 {
    public final ViewConfiguration q3BipwRCk;

    public wDfIorp2q(ViewConfiguration viewConfiguration) {
        this.q3BipwRCk = viewConfiguration;
    }

    @Override // con.fCkNY70T9
    public long J4Ux7ym32() {
        return (long) ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // con.fCkNY70T9
    public long dIocxURUo() {
        return (long) ViewConfiguration.getLongPressTimeout();
    }

    @Override // con.fCkNY70T9
    public long kCA6Zs9sL() {
        float f = (float) 48;
        return D3DEikrvb.tGV7Q6urW(f, f);
    }

    @Override // con.fCkNY70T9
    public float q3BipwRCk() {
        return (float) this.q3BipwRCk.getScaledTouchSlop();
    }

    @Override // con.fCkNY70T9
    public long tGV7Q6urW() {
        return 40;
    }
}
