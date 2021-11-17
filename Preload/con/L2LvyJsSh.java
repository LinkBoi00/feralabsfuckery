package con;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes.dex */
public class L2LvyJsSh implements Runnable {
    public final /* synthetic */ sSVv3dJln Bhmn1KIah;
    public final /* synthetic */ int CBQ5d1kRq;
    public final /* synthetic */ ArrayList kmSgne1rO;

    public L2LvyJsSh(sSVv3dJln ssvv3djln, ArrayList arrayList, int i) {
        this.CBQ5d1kRq = i;
        if (i == 1) {
            this.Bhmn1KIah = ssvv3djln;
            this.kmSgne1rO = arrayList;
        } else if (i != 2) {
            this.Bhmn1KIah = ssvv3djln;
            this.kmSgne1rO = arrayList;
        } else {
            this.Bhmn1KIah = ssvv3djln;
            this.kmSgne1rO = arrayList;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        switch (this.CBQ5d1kRq) {
            case 0:
                Iterator it = this.kmSgne1rO.iterator();
                while (it.hasNext()) {
                    WgCAwL00L wgCAwL00L = (WgCAwL00L) it.next();
                    sSVv3dJln ssvv3djln = this.Bhmn1KIah;
                    RecyclerView.cywn6086a cywn6086a = wgCAwL00L.q3BipwRCk;
                    int i = wgCAwL00L.J4Ux7ym32;
                    int i2 = wgCAwL00L.tGV7Q6urW;
                    int i3 = wgCAwL00L.dIocxURUo;
                    int i4 = wgCAwL00L.kCA6Zs9sL;
                    Objects.requireNonNull(ssvv3djln);
                    View view = cywn6086a.q3BipwRCk;
                    int i5 = i3 - i;
                    int i6 = i4 - i2;
                    if (i5 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i6 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator animate = view.animate();
                    ssvv3djln.MzoOEjc4X.add(cywn6086a);
                    animate.setDuration(ssvv3djln.kCA6Zs9sL).setListener(new LhSojGIUT(ssvv3djln, cywn6086a, i5, view, i6, animate)).start();
                }
                this.kmSgne1rO.clear();
                this.Bhmn1KIah.kmSgne1rO.remove(this.kmSgne1rO);
                return;
            case 1:
                Iterator it2 = this.kmSgne1rO.iterator();
                while (it2.hasNext()) {
                    ltHymUmUx lthymumux = (ltHymUmUx) it2.next();
                    sSVv3dJln ssvv3djln2 = this.Bhmn1KIah;
                    Objects.requireNonNull(ssvv3djln2);
                    RecyclerView.cywn6086a cywn6086a2 = lthymumux.q3BipwRCk;
                    View view2 = null;
                    View view3 = cywn6086a2 == null ? null : cywn6086a2.q3BipwRCk;
                    RecyclerView.cywn6086a cywn6086a3 = lthymumux.J4Ux7ym32;
                    if (cywn6086a3 != null) {
                        view2 = cywn6086a3.q3BipwRCk;
                    }
                    if (view3 != null) {
                        ViewPropertyAnimator duration = view3.animate().setDuration(ssvv3djln2.iiGwOFFnr);
                        ssvv3djln2.qVUwofr5s.add(lthymumux.q3BipwRCk);
                        duration.translationX((float) (lthymumux.kCA6Zs9sL - lthymumux.tGV7Q6urW));
                        duration.translationY((float) (lthymumux.iiGwOFFnr - lthymumux.dIocxURUo));
                        duration.alpha(0.0f).setListener(new VoOtBvrhx(ssvv3djln2, lthymumux, duration, view3)).start();
                    }
                    if (view2 != null) {
                        ViewPropertyAnimator animate2 = view2.animate();
                        ssvv3djln2.qVUwofr5s.add(lthymumux.J4Ux7ym32);
                        animate2.translationX(0.0f).translationY(0.0f).setDuration(ssvv3djln2.iiGwOFFnr).alpha(1.0f).setListener(new RjdGrrvpc(ssvv3djln2, lthymumux, animate2, view2)).start();
                    }
                }
                this.kmSgne1rO.clear();
                this.Bhmn1KIah.Bhmn1KIah.remove(this.kmSgne1rO);
                return;
            default:
                Iterator it3 = this.kmSgne1rO.iterator();
                while (it3.hasNext()) {
                    RecyclerView.cywn6086a cywn6086a4 = (RecyclerView.cywn6086a) it3.next();
                    sSVv3dJln ssvv3djln3 = this.Bhmn1KIah;
                    Objects.requireNonNull(ssvv3djln3);
                    View view4 = cywn6086a4.q3BipwRCk;
                    ViewPropertyAnimator animate3 = view4.animate();
                    ssvv3djln3.PSTqBLTET.add(cywn6086a4);
                    animate3.alpha(1.0f).setDuration(ssvv3djln3.tGV7Q6urW).setListener(new KIsSJYyFq(ssvv3djln3, cywn6086a4, view4, animate3)).start();
                }
                this.kmSgne1rO.clear();
                this.Bhmn1KIah.CBQ5d1kRq.remove(this.kmSgne1rO);
                return;
        }
    }
}
