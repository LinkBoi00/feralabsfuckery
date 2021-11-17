package con;

import android.view.View;
import android.view.ViewTreeObserver;
/* loaded from: classes.dex */
public final class nEBNqwNJt implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View Bhmn1KIah;
    public final /* synthetic */ int CBQ5d1kRq;
    public final /* synthetic */ PmanMZxiM PSTqBLTET;
    public Integer kmSgne1rO;

    public nEBNqwNJt(View view, PmanMZxiM pmanMZxiM, int i) {
        this.CBQ5d1kRq = i;
        if (i != 1) {
            this.Bhmn1KIah = view;
            this.PSTqBLTET = pmanMZxiM;
            return;
        }
        this.Bhmn1KIah = view;
        this.PSTqBLTET = pmanMZxiM;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        switch (this.CBQ5d1kRq) {
            case 0:
                Integer num = this.kmSgne1rO;
                if (num != null && num.intValue() == this.Bhmn1KIah.getMeasuredHeight()) {
                    this.Bhmn1KIah.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    return;
                } else if (this.Bhmn1KIah.getMeasuredWidth() > 0 && this.Bhmn1KIah.getMeasuredHeight() > 0) {
                    Integer num2 = this.kmSgne1rO;
                    int measuredHeight = this.Bhmn1KIah.getMeasuredHeight();
                    if (num2 == null || num2.intValue() != measuredHeight) {
                        this.kmSgne1rO = Integer.valueOf(this.Bhmn1KIah.getMeasuredHeight());
                        this.PSTqBLTET.IytU16YUK(this.Bhmn1KIah);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            default:
                Integer num3 = this.kmSgne1rO;
                if (num3 != null && num3.intValue() == this.Bhmn1KIah.getMeasuredWidth()) {
                    this.Bhmn1KIah.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    return;
                } else if (this.Bhmn1KIah.getMeasuredWidth() > 0 && this.Bhmn1KIah.getMeasuredHeight() > 0) {
                    Integer num4 = this.kmSgne1rO;
                    int measuredWidth = this.Bhmn1KIah.getMeasuredWidth();
                    if (num4 == null || num4.intValue() != measuredWidth) {
                        this.kmSgne1rO = Integer.valueOf(this.Bhmn1KIah.getMeasuredWidth());
                        this.PSTqBLTET.IytU16YUK(this.Bhmn1KIah);
                        return;
                    }
                    return;
                } else {
                    return;
                }
        }
    }
}
