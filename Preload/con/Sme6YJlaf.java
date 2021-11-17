package con;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.RG2GI7LDp;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class Sme6YJlaf implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Object Bhmn1KIah;
    public final /* synthetic */ int CBQ5d1kRq = 3;
    public final /* synthetic */ Object kmSgne1rO;

    public Sme6YJlaf(View view, PmanMZxiM pmanMZxiM) {
        this.kmSgne1rO = view;
        this.Bhmn1KIah = pmanMZxiM;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        switch (this.CBQ5d1kRq) {
            case 1:
                RG2GI7LDp rG2GI7LDp = (RG2GI7LDp) this.kmSgne1rO;
                UxHHqhbTP uxHHqhbTP = rG2GI7LDp.tGV7Q6urW;
                rG2GI7LDp.vPSbyrYWX();
                J3kbcXHdl.GPLPRo6go((ViewGroup) uxHHqhbTP.EBQXiIPmm.getParent(), ((Jxi1NxKkk) this.Bhmn1KIah).CBQ5d1kRq).kCA6Zs9sL();
                return;
            case 2:
                ((View) this.kmSgne1rO).removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                cyVJjwbRF.tGV7Q6urW((View) this.kmSgne1rO);
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        switch (this.CBQ5d1kRq) {
            case 0:
                ((View) this.kmSgne1rO).removeOnAttachStateChangeListener(this);
                ((rQamjxEL9) this.Bhmn1KIah).ilHKhw3Yw();
                return;
            case 1:
            case 2:
                return;
            default:
                ((View) this.kmSgne1rO).removeOnAttachStateChangeListener(this);
                ((PmanMZxiM) this.Bhmn1KIah).IytU16YUK(view);
                return;
        }
    }

    public Sme6YJlaf(View view, rQamjxEL9 rqamjxel9) {
        this.kmSgne1rO = view;
        this.Bhmn1KIah = rqamjxel9;
    }

    public Sme6YJlaf(RG2GI7LDp rG2GI7LDp, View view) {
        this.Bhmn1KIah = rG2GI7LDp;
        this.kmSgne1rO = view;
    }

    public Sme6YJlaf(Jxi1NxKkk jxi1NxKkk, RG2GI7LDp rG2GI7LDp) {
        this.Bhmn1KIah = jxi1NxKkk;
        this.kmSgne1rO = rG2GI7LDp;
    }
}
