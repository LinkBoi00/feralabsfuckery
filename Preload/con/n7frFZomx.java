package con;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import me.rosuh.filepicker.widget.RecyclerViewFilePicker;
/* loaded from: classes.dex */
public final class n7frFZomx extends RecyclerView.WfopS3efW {
    public final /* synthetic */ RecyclerViewFilePicker q3BipwRCk;

    public n7frFZomx(RecyclerViewFilePicker recyclerViewFilePicker) {
        this.q3BipwRCk = recyclerViewFilePicker;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.WfopS3efW
    public void J4Ux7ym32(int i, int i2, Object obj) {
        q3BipwRCk();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.WfopS3efW
    public void q3BipwRCk() {
        RecyclerViewFilePicker recyclerViewFilePicker;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator withEndAction;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator alpha2;
        ViewPropertyAnimator withStartAction;
        RecyclerView.s7MlVynBG adapter = this.q3BipwRCk.getAdapter();
        int i = 0;
        if ((adapter == null ? 0 : adapter.q3BipwRCk()) != 0 || this.q3BipwRCk.getEmptyView() == null) {
            View emptyView = this.q3BipwRCk.getEmptyView();
            if (!(emptyView == null || (animate = emptyView.animate()) == null || (alpha = animate.alpha(0.0f)) == null || (withEndAction = alpha.withEndAction(new Runnable(this.q3BipwRCk, 1) { // from class: con.xuf8D6UxV
                public final /* synthetic */ int CBQ5d1kRq;
                public final /* synthetic */ RecyclerViewFilePicker kmSgne1rO;

                {
                    this.CBQ5d1kRq = r3;
                    this.kmSgne1rO = r2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.CBQ5d1kRq) {
                        case 0:
                            View emptyView2 = this.kmSgne1rO.getEmptyView();
                            if (emptyView2 != null) {
                                emptyView2.setVisibility(0);
                                return;
                            }
                            return;
                        default:
                            View emptyView3 = this.kmSgne1rO.getEmptyView();
                            if (emptyView3 != null) {
                                emptyView3.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            })) == null)) {
                withEndAction.start();
            }
            recyclerViewFilePicker = this.q3BipwRCk;
        } else {
            View emptyView2 = this.q3BipwRCk.getEmptyView();
            if (!(emptyView2 == null || (animate2 = emptyView2.animate()) == null || (alpha2 = animate2.alpha(1.0f)) == null || (withStartAction = alpha2.withStartAction(new Runnable(this.q3BipwRCk, 0) { // from class: con.xuf8D6UxV
                public final /* synthetic */ int CBQ5d1kRq;
                public final /* synthetic */ RecyclerViewFilePicker kmSgne1rO;

                {
                    this.CBQ5d1kRq = r3;
                    this.kmSgne1rO = r2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.CBQ5d1kRq) {
                        case 0:
                            View emptyView22 = this.kmSgne1rO.getEmptyView();
                            if (emptyView22 != null) {
                                emptyView22.setVisibility(0);
                                return;
                            }
                            return;
                        default:
                            View emptyView3 = this.kmSgne1rO.getEmptyView();
                            if (emptyView3 != null) {
                                emptyView3.setVisibility(8);
                                return;
                            }
                            return;
                    }
                }
            })) == null)) {
                withStartAction.start();
            }
            recyclerViewFilePicker = this.q3BipwRCk;
            i = 8;
        }
        recyclerViewFilePicker.setVisibility(i);
    }
}
