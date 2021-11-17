package con;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import androidx.appcompat.view.menu.RG2GI7LDp;
import java.lang.reflect.Method;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class DJbXkgfuR implements Runnable {
    public final /* synthetic */ Object Bhmn1KIah;
    public final /* synthetic */ int CBQ5d1kRq = 2;
    public Object kmSgne1rO;

    public DJbXkgfuR(Application application, KLR4KBNKI klr4kbnki) {
        this.kmSgne1rO = application;
        this.Bhmn1KIah = klr4kbnki;
    }

    @Override // java.lang.Runnable
    public void run() {
        RG2GI7LDp.AbstractC0001RG2GI7LDp rG2GI7LDp;
        switch (this.CBQ5d1kRq) {
            case 0:
                RG2GI7LDp rG2GI7LDp2 = ((TeoeEf1aF) this.Bhmn1KIah).Bhmn1KIah;
                if (!(rG2GI7LDp2 == null || (rG2GI7LDp = rG2GI7LDp2.kCA6Zs9sL) == null)) {
                    rG2GI7LDp.J4Ux7ym32(rG2GI7LDp2);
                }
                View view = (View) ((TeoeEf1aF) this.Bhmn1KIah).Eeka1udhb;
                if (!(view == null || view.getWindowToken() == null || !((fub3l8zfX) this.kmSgne1rO).iiGwOFFnr())) {
                    ((TeoeEf1aF) this.Bhmn1KIah).CpG0imbht = (fub3l8zfX) this.kmSgne1rO;
                }
                ((TeoeEf1aF) this.Bhmn1KIah).nlGCs0NZs = null;
                return;
            case 1:
                ((KLR4KBNKI) this.kmSgne1rO).q3BipwRCk = this.Bhmn1KIah;
                return;
            case 2:
                ((Application) this.kmSgne1rO).unregisterActivityLifecycleCallbacks((KLR4KBNKI) this.Bhmn1KIah);
                return;
            case 3:
                try {
                    Method method = QvXlJJNbM.dIocxURUo;
                    if (method != null) {
                        method.invoke(this.kmSgne1rO, this.Bhmn1KIah, Boolean.FALSE, "AppCompat recreation");
                        return;
                    } else {
                        QvXlJJNbM.kCA6Zs9sL.invoke(this.kmSgne1rO, this.Bhmn1KIah, Boolean.FALSE);
                        return;
                    }
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 4:
                ((DfseMYa7G) this.Bhmn1KIah).iiGwOFFnr((Typeface) this.kmSgne1rO);
                return;
            case 5:
                XU5bm7KSu.PSTqBLTET((ArrayList) this.kmSgne1rO, 4);
                return;
            case 6:
                ((Sp3ioRUSh) this.kmSgne1rO).J4Ux7ym32();
                return;
            case 7:
                ((J3kbcXHdl) this.kmSgne1rO).tGV7Q6urW();
                return;
            case 8:
                ((EditText) this.kmSgne1rO).removeTextChangedListener(((vC6Qh7mvD) ((MNvNWu3oH) this.Bhmn1KIah).J4Ux7ym32).kCA6Zs9sL);
                return;
            case 9:
                boolean isPopupShowing = ((AutoCompleteTextView) this.kmSgne1rO).isPopupShowing();
                rf3cOyxnl.iiGwOFFnr((rf3cOyxnl) ((MhqibLiIM) this.Bhmn1KIah).kmSgne1rO, isPopupShowing);
                ((rf3cOyxnl) ((MhqibLiIM) this.Bhmn1KIah).kmSgne1rO).oon79WMrY = isPopupShowing;
                return;
            case 10:
                ((AutoCompleteTextView) this.kmSgne1rO).removeTextChangedListener(((rf3cOyxnl) ((MNvNWu3oH) this.Bhmn1KIah).J4Ux7ym32).kCA6Zs9sL);
                return;
            case 11:
                ((EditText) this.kmSgne1rO).removeTextChangedListener(((eV9inabdD) ((MNvNWu3oH) this.Bhmn1KIah).J4Ux7ym32).kCA6Zs9sL);
                return;
            default:
                ((tmgChDFqU) ((Z3EvbqMGQ) this.kmSgne1rO)).cAwN510t2((VWNUggT0w) this.Bhmn1KIah, qih4lW99W.q3BipwRCk);
                return;
        }
    }

    public DJbXkgfuR(TeoeEf1aF teoeEf1aF, fub3l8zfX fub3l8zfx) {
        this.Bhmn1KIah = teoeEf1aF;
        this.kmSgne1rO = fub3l8zfx;
    }

    public DJbXkgfuR(KLR4KBNKI klr4kbnki, Object obj) {
        this.kmSgne1rO = klr4kbnki;
        this.Bhmn1KIah = obj;
    }

    public DJbXkgfuR(Z3EvbqMGQ z3EvbqMGQ, VWNUggT0w vWNUggT0w) {
        this.kmSgne1rO = z3EvbqMGQ;
        this.Bhmn1KIah = vWNUggT0w;
    }

    public DJbXkgfuR(MNvNWu3oH mNvNWu3oH, AutoCompleteTextView autoCompleteTextView) {
        this.Bhmn1KIah = mNvNWu3oH;
        this.kmSgne1rO = autoCompleteTextView;
    }

    public DJbXkgfuR(MNvNWu3oH mNvNWu3oH, EditText editText) {
        this.Bhmn1KIah = mNvNWu3oH;
        this.kmSgne1rO = editText;
    }

    public DJbXkgfuR(MNvNWu3oH mNvNWu3oH, EditText editText, lkxf5bnfn lkxf5bnfn) {
        this.Bhmn1KIah = mNvNWu3oH;
        this.kmSgne1rO = editText;
    }

    public DJbXkgfuR(t5E8jan4S t5e8jan4s, Sp3ioRUSh sp3ioRUSh) {
        this.Bhmn1KIah = t5e8jan4s;
        this.kmSgne1rO = sp3ioRUSh;
    }

    public DJbXkgfuR(t5E8jan4S t5e8jan4s, ArrayList arrayList) {
        this.Bhmn1KIah = t5e8jan4s;
        this.kmSgne1rO = arrayList;
    }

    public DJbXkgfuR(MhqibLiIM mhqibLiIM, AutoCompleteTextView autoCompleteTextView) {
        this.Bhmn1KIah = mhqibLiIM;
        this.kmSgne1rO = autoCompleteTextView;
    }

    public DJbXkgfuR(DfseMYa7G dfseMYa7G, Typeface typeface) {
        this.Bhmn1KIah = dfseMYa7G;
        this.kmSgne1rO = typeface;
    }

    public DJbXkgfuR(Object obj, Object obj2) {
        this.kmSgne1rO = obj;
        this.Bhmn1KIah = obj2;
    }
}
