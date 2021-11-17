package con;

import android.transition.Transition;
import androidx.fragment.app.aXI58Y1kr;
/* loaded from: classes.dex */
public class Sp3ioRUSh extends P1uqVBniW {
    public final boolean dIocxURUo;
    public final Object kCA6Zs9sL;
    public final Object tGV7Q6urW;

    public Sp3ioRUSh(zXvxcN9Gl zxvxcn9gl, ce8tBZHr1 ce8tbzhr1, boolean z, boolean z2) {
        super(zxvxcn9gl, ce8tbzhr1);
        Object obj;
        Object obj2;
        if (zxvxcn9gl.q3BipwRCk == aXI58Y1kr.VISIBLE) {
            if (z) {
                obj2 = zxvxcn9gl.tGV7Q6urW.dXrmkklc8();
            } else {
                zxvxcn9gl.tGV7Q6urW.oon79WMrY();
                obj2 = null;
            }
            this.tGV7Q6urW = obj2;
            if (z) {
                rwMIknDWL rwmikndwl = zxvxcn9gl.tGV7Q6urW.j22ftfeNI;
            } else {
                rwMIknDWL rwmikndwl2 = zxvxcn9gl.tGV7Q6urW.j22ftfeNI;
            }
        } else {
            if (z) {
                obj = zxvxcn9gl.tGV7Q6urW.ixWaw2akD();
            } else {
                zxvxcn9gl.tGV7Q6urW.kmSgne1rO();
                obj = null;
            }
            this.tGV7Q6urW = obj;
        }
        this.dIocxURUo = true;
        if (z2) {
            if (z) {
                this.kCA6Zs9sL = zxvxcn9gl.tGV7Q6urW.WaUP0CF08();
                return;
            }
            zxvxcn9gl.tGV7Q6urW.sk5s77z6Q();
        }
        this.kCA6Zs9sL = null;
    }

    public final xobLfQFEO Puu3Rhg4F(Object obj) {
        if (obj == null) {
            return null;
        }
        xobLfQFEO xoblfqfeo = XU5bm7KSu.J4Ux7ym32;
        if (obj instanceof Transition) {
            return xoblfqfeo;
        }
        xobLfQFEO xoblfqfeo2 = XU5bm7KSu.tGV7Q6urW;
        if (xoblfqfeo2 != null && xoblfqfeo2.kCA6Zs9sL(obj)) {
            return xoblfqfeo2;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + ((zXvxcN9Gl) this.q3BipwRCk).tGV7Q6urW + " is not a valid framework Transition or AndroidX Transition");
    }
}
