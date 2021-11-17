package con;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.mhl5lIdbQ;
import androidx.savedstate.RG2GI7LDp;
import java.util.Objects;
/* loaded from: classes.dex */
public class ATZ6xBjCr implements RG2GI7LDp.mhl5lIdbQ {
    public final /* synthetic */ Object J4Ux7ym32;
    public final /* synthetic */ int q3BipwRCk = 1;

    public ATZ6xBjCr(grT0kqTxT grt0kqtxt) {
        this.J4Ux7ym32 = grt0kqtxt;
    }

    @Override // androidx.savedstate.RG2GI7LDp.mhl5lIdbQ
    public Bundle q3BipwRCk() {
        switch (this.q3BipwRCk) {
            case 0:
                Bundle bundle = new Bundle();
                Objects.requireNonNull(((grT0kqTxT) this.J4Ux7ym32).kmSgne1rO());
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                do {
                } while (XticXNngr.CBQ5d1kRq(((z0NkpHHvU) ((XticXNngr) this.J4Ux7ym32).dXrmkklc8.J4Ux7ym32).PSTqBLTET, mhl5lIdbQ.EnumC0005mhl5lIdbQ.CREATED));
                ((XticXNngr) this.J4Ux7ym32).RG6kpfv3v.kCA6Zs9sL(mhl5lIdbQ.RG2GI7LDp.ON_STOP);
                Parcelable KBYw84i3W = ((z0NkpHHvU) ((XticXNngr) this.J4Ux7ym32).dXrmkklc8.J4Ux7ym32).PSTqBLTET.KBYw84i3W();
                if (KBYw84i3W != null) {
                    bundle2.putParcelable("android:support:fragments", KBYw84i3W);
                }
                return bundle2;
        }
    }

    public ATZ6xBjCr(XticXNngr xticXNngr) {
        this.J4Ux7ym32 = xticXNngr;
    }
}
