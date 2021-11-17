package con;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;
/* loaded from: classes.dex */
public final class zgCCamJKk implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final Runnable Bhmn1KIah;
    public final View CBQ5d1kRq;
    public ViewTreeObserver kmSgne1rO;

    public zgCCamJKk(View view, Runnable runnable) {
        this.CBQ5d1kRq = view;
        this.kmSgne1rO = view.getViewTreeObserver();
        this.Bhmn1KIah = runnable;
    }

    public static zgCCamJKk q3BipwRCk(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        zgCCamJKk zgccamjkk = new zgCCamJKk(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(zgccamjkk);
        view.addOnAttachStateChangeListener(zgccamjkk);
        return zgccamjkk;
    }

    public void J4Ux7ym32() {
        (this.kmSgne1rO.isAlive() ? this.kmSgne1rO : this.CBQ5d1kRq.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.CBQ5d1kRq.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        J4Ux7ym32();
        this.Bhmn1KIah.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.kmSgne1rO = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        J4Ux7ym32();
    }
}
