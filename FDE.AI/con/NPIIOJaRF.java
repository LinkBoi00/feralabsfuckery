package con;

import java.lang.reflect.Method;
@Deprecated
/* loaded from: classes.dex */
public final class NPIIOJaRF {
    public final Method J4Ux7ym32;
    public final int q3BipwRCk;

    public NPIIOJaRF(int i, Method method) {
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = method;
        method.setAccessible(true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NPIIOJaRF)) {
            return false;
        }
        NPIIOJaRF nPIIOJaRF = (NPIIOJaRF) obj;
        return this.q3BipwRCk == nPIIOJaRF.q3BipwRCk && this.J4Ux7ym32.getName().equals(nPIIOJaRF.J4Ux7ym32.getName());
    }

    public int hashCode() {
        return this.J4Ux7ym32.getName().hashCode() + (this.q3BipwRCk * 31);
    }
}
