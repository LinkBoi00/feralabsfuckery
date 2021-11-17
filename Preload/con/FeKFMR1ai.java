package con;

import android.graphics.Typeface;
import android.os.Build;
/* loaded from: classes.dex */
public class FeKFMR1ai {
    public final uEb6wTQlg q3BipwRCk;
    public static final JhpbRXxsg J4Ux7ym32 = new JhpbRXxsg(0);
    public static final m0AevvDOv tGV7Q6urW = m0AevvDOv.MzoOEjc4X;
    public static final sRvcTfY85 dIocxURUo = new sRvcTfY85(16);

    static {
        JhpbRXxsg jhpbRXxsg = m0AevvDOv.kmSgne1rO;
    }

    public FeKFMR1ai(uEb6wTQlg ueb6wtqlg, C2cgp32t9 c2cgp32t9, int i) {
        this.q3BipwRCk = (i & 1) != 0 ? new uEb6wTQlg(24) : null;
    }

    public final Typeface J4Ux7ym32(String str, m0AevvDOv m0aevvdov, int i) {
        boolean z = false;
        if (JI2JIz7iN.q3BipwRCk(i, 0)) {
            JhpbRXxsg jhpbRXxsg = m0AevvDOv.kmSgne1rO;
            if (anXlDk6fV.tGV7Q6urW(m0aevvdov, m0AevvDOv.qVUwofr5s)) {
                if (str == null || str.length() == 0) {
                    return Typeface.DEFAULT;
                }
            }
        }
        if (Build.VERSION.SDK_INT < 28) {
            int tGV7Q6urW2 = J4Ux7ym32.tGV7Q6urW(m0aevvdov, i);
            if (str == null || str.length() == 0) {
                z = true;
            }
            return z ? Typeface.defaultFromStyle(tGV7Q6urW2) : Typeface.create(str, tGV7Q6urW2);
        }
        return H0cZgvVsM.q3BipwRCk.q3BipwRCk(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), m0aevvdov.CBQ5d1kRq, JI2JIz7iN.q3BipwRCk(i, 1));
    }

    public Typeface q3BipwRCk(Vyo35YgKP vyo35YgKP, m0AevvDOv m0aevvdov, int i, int i2) {
        String str;
        WI3XTEIMS wi3xteims = new WI3XTEIMS(vyo35YgKP, m0aevvdov, i, i2, null);
        sRvcTfY85 srvctfy85 = dIocxURUo;
        Typeface typeface = (Typeface) srvctfy85.q3BipwRCk(wi3xteims);
        if (typeface != null) {
            return typeface;
        }
        if (vyo35YgKP instanceof RxEtsNHUB) {
            str = ((RxEtsNHUB) vyo35YgKP).dIocxURUo;
        } else {
            boolean z = true;
            if (!(vyo35YgKP instanceof J3iDVzeXw) && vyo35YgKP != null) {
                z = false;
            }
            if (z) {
                str = null;
            } else {
                throw new dnCerKhAM();
            }
        }
        Typeface J4Ux7ym322 = J4Ux7ym32(str, m0aevvdov, i);
        srvctfy85.J4Ux7ym32(wi3xteims, J4Ux7ym322);
        return J4Ux7ym322;
    }
}
