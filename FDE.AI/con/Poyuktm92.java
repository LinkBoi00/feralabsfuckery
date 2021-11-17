package con;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
/* loaded from: classes.dex */
public class Poyuktm92 extends P1uqVBniW {
    public final Object dIocxURUo;
    public final /* synthetic */ Jg0aTLb6g kCA6Zs9sL;
    public final /* synthetic */ int tGV7Q6urW = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Poyuktm92(Jg0aTLb6g jg0aTLb6g, Context context) {
        super(jg0aTLb6g);
        this.kCA6Zs9sL = jg0aTLb6g;
        this.dIocxURUo = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0109 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010b  */
    @Override // con.P1uqVBniW
    /* Code decompiled incorrectly, please refer to instructions dump */
    public int dIocxURUo() {
        /*
        // Method dump skipped, instructions count: 276
        */
        throw new UnsupportedOperationException("Method not decompiled: con.Poyuktm92.dIocxURUo():int");
    }

    @Override // con.P1uqVBniW
    public void iiGwOFFnr() {
        switch (this.tGV7Q6urW) {
            case 0:
                this.kCA6Zs9sL.PSTqBLTET();
                return;
            default:
                this.kCA6Zs9sL.PSTqBLTET();
                return;
        }
    }

    @Override // con.P1uqVBniW
    public IntentFilter tGV7Q6urW() {
        switch (this.tGV7Q6urW) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Poyuktm92(Jg0aTLb6g jg0aTLb6g, YKK4R667A ykk4r667a) {
        super(jg0aTLb6g);
        this.kCA6Zs9sL = jg0aTLb6g;
        this.dIocxURUo = ykk4r667a;
    }
}
