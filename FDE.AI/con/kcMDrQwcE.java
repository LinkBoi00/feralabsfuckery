package con;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.RG2GI7LDp;
import java.io.File;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class kcMDrQwcE {
    public boolean GPLPRo6go = false;
    public final Executor J4Ux7ym32;
    public fzKoojKuv[] Puu3Rhg4F;
    public final byte[] dIocxURUo;
    public final String iiGwOFFnr;
    public final File kCA6Zs9sL;
    public final AssetManager q3BipwRCk;
    public final RG2GI7LDp.AbstractC0006RG2GI7LDp tGV7Q6urW;
    public byte[] yWvV4ePLl;

    public kcMDrQwcE(AssetManager assetManager, Executor executor, RG2GI7LDp.AbstractC0006RG2GI7LDp rG2GI7LDp, String str, String str2, String str3, File file) {
        byte[] bArr;
        this.q3BipwRCk = assetManager;
        this.J4Ux7ym32 = executor;
        this.tGV7Q6urW = rG2GI7LDp;
        this.iiGwOFFnr = str;
        this.kCA6Zs9sL = file;
        switch (Build.VERSION.SDK_INT) {
            case 26:
                bArr = oN2zCBlPe.tGV7Q6urW;
                break;
            case 27:
                bArr = oN2zCBlPe.J4Ux7ym32;
                break;
            case 28:
            case 29:
            case 30:
                bArr = oN2zCBlPe.q3BipwRCk;
                break;
            default:
                bArr = null;
                break;
        }
        this.dIocxURUo = bArr;
    }

    public final void J4Ux7ym32(int i, Object obj) {
        this.J4Ux7ym32.execute(new Runnable(this, i, obj) { // from class: con.sPVccFlP9
            public final /* synthetic */ int Bhmn1KIah;
            public final /* synthetic */ int CBQ5d1kRq = 0;
            public final /* synthetic */ Object PSTqBLTET;
            public final /* synthetic */ Object kmSgne1rO;

            {
                this.kmSgne1rO = r2;
                this.Bhmn1KIah = r3;
                this.PSTqBLTET = r4;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (this.CBQ5d1kRq) {
                    case 0:
                        ((kcMDrQwcE) this.kmSgne1rO).tGV7Q6urW.q3BipwRCk(this.Bhmn1KIah, this.PSTqBLTET);
                        return;
                    default:
                        ((RG2GI7LDp.AbstractC0006RG2GI7LDp) this.kmSgne1rO).q3BipwRCk(this.Bhmn1KIah, this.PSTqBLTET);
                        return;
                }
            }
        });
    }

    public final void q3BipwRCk() {
        if (!this.GPLPRo6go) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }
}
