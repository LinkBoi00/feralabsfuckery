package con;

import android.animation.Animator;
import android.view.View;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
/* loaded from: classes.dex */
public final class inMzAxvvL extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ Animator Bhmn1KIah;
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public inMzAxvvL(Animator animator, int i) {
        super(1);
        this.kmSgne1rO = i;
        if (i == 1) {
            this.Bhmn1KIah = animator;
            super(1);
        } else if (i != 2) {
            this.Bhmn1KIah = animator;
        } else {
            this.Bhmn1KIah = animator;
            super(1);
        }
    }

    @Override // con.PmanMZxiM
    public Object IytU16YUK(Object obj) {
        int i = this.kmSgne1rO;
        switch (i) {
            case 0:
                DialogActionButtonLayout dialogActionButtonLayout = (DialogActionButtonLayout) obj;
                switch (i) {
                    case 0:
                        this.Bhmn1KIah.cancel();
                        break;
                    default:
                        this.Bhmn1KIah.cancel();
                        break;
                }
                return qih4lW99W.q3BipwRCk;
            case 1:
                DialogActionButtonLayout dialogActionButtonLayout2 = (DialogActionButtonLayout) obj;
                switch (i) {
                    case 0:
                        this.Bhmn1KIah.cancel();
                        break;
                    default:
                        this.Bhmn1KIah.cancel();
                        break;
                }
                return qih4lW99W.q3BipwRCk;
            default:
                View view = (View) obj;
                this.Bhmn1KIah.cancel();
                return qih4lW99W.q3BipwRCk;
        }
    }
}
