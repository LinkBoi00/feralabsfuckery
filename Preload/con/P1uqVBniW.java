package con;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import androidx.fragment.app.aXI58Y1kr;
/* loaded from: classes.dex */
public abstract class P1uqVBniW {
    public final Object J4Ux7ym32;
    public Object q3BipwRCk;

    public P1uqVBniW(Jg0aTLb6g jg0aTLb6g) {
        this.J4Ux7ym32 = jg0aTLb6g;
    }

    public void GPLPRo6go() {
        q3BipwRCk();
        IntentFilter tGV7Q6urW = tGV7Q6urW();
        if (tGV7Q6urW != null && tGV7Q6urW.countActions() != 0) {
            if (((BroadcastReceiver) this.q3BipwRCk) == null) {
                this.q3BipwRCk = new V5gNfrP5J(this);
            }
            ((Jg0aTLb6g) this.J4Ux7ym32).PSTqBLTET.registerReceiver((BroadcastReceiver) this.q3BipwRCk, tGV7Q6urW);
        }
    }

    public void J4Ux7ym32() {
        zXvxcN9Gl zxvxcn9gl = (zXvxcN9Gl) this.q3BipwRCk;
        if (zxvxcn9gl.kCA6Zs9sL.remove((ce8tBZHr1) this.J4Ux7ym32) && zxvxcn9gl.kCA6Zs9sL.isEmpty()) {
            zxvxcn9gl.J4Ux7ym32();
        }
    }

    public abstract int dIocxURUo();

    public abstract void iiGwOFFnr();

    public boolean kCA6Zs9sL() {
        aXI58Y1kr axi58y1kr;
        aXI58Y1kr tGV7Q6urW = aXI58Y1kr.tGV7Q6urW(((zXvxcN9Gl) this.q3BipwRCk).tGV7Q6urW.EBQXiIPmm);
        aXI58Y1kr axi58y1kr2 = ((zXvxcN9Gl) this.q3BipwRCk).q3BipwRCk;
        return tGV7Q6urW == axi58y1kr2 || !(tGV7Q6urW == (axi58y1kr = aXI58Y1kr.VISIBLE) || axi58y1kr2 == axi58y1kr);
    }

    public void q3BipwRCk() {
        Object obj = this.q3BipwRCk;
        if (((BroadcastReceiver) obj) != null) {
            try {
                ((Jg0aTLb6g) this.J4Ux7ym32).PSTqBLTET.unregisterReceiver((BroadcastReceiver) obj);
            } catch (IllegalArgumentException unused) {
            }
            this.q3BipwRCk = null;
        }
    }

    public abstract IntentFilter tGV7Q6urW();

    public P1uqVBniW(zXvxcN9Gl zxvxcn9gl, ce8tBZHr1 ce8tbzhr1) {
        this.q3BipwRCk = zxvxcn9gl;
        this.J4Ux7ym32 = ce8tbzhr1;
    }
}
