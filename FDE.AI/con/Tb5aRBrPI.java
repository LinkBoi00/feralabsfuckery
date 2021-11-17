package con;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
/* loaded from: classes.dex */
public class Tb5aRBrPI implements mCbHTCUdc {
    public final /* synthetic */ Object J4Ux7ym32;
    public final /* synthetic */ int q3BipwRCk = 1;

    public Tb5aRBrPI(grT0kqTxT grt0kqtxt) {
        this.J4Ux7ym32 = grt0kqtxt;
    }

    @Override // con.mCbHTCUdc
    public void q3BipwRCk(Context context) {
        switch (this.q3BipwRCk) {
            case 0:
                yYWQSxv2D kmSgne1rO = ((grT0kqTxT) this.J4Ux7ym32).kmSgne1rO();
                kmSgne1rO.dIocxURUo();
                kmSgne1rO.iiGwOFFnr(((grT0kqTxT) this.J4Ux7ym32).MzoOEjc4X.J4Ux7ym32.q3BipwRCk("androidx:appcompat"));
                return;
            default:
                z0NkpHHvU z0nkphhvu = (z0NkpHHvU) ((XticXNngr) this.J4Ux7ym32).dXrmkklc8.J4Ux7ym32;
                z0nkphhvu.PSTqBLTET.J4Ux7ym32(z0nkphhvu, z0nkphhvu, null);
                Bundle q3BipwRCk = ((XticXNngr) this.J4Ux7ym32).MzoOEjc4X.J4Ux7ym32.q3BipwRCk("android:support:fragments");
                if (q3BipwRCk != null) {
                    Parcelable parcelable = q3BipwRCk.getParcelable("android:support:fragments");
                    z0NkpHHvU z0nkphhvu2 = (z0NkpHHvU) ((XticXNngr) this.J4Ux7ym32).dXrmkklc8.J4Ux7ym32;
                    if (z0nkphhvu2 instanceof LiMUeynem) {
                        z0nkphhvu2.PSTqBLTET.kktL0P5MG(parcelable);
                        return;
                    }
                    throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
                }
                return;
        }
    }

    public Tb5aRBrPI(XticXNngr xticXNngr) {
        this.J4Ux7ym32 = xticXNngr;
    }
}
