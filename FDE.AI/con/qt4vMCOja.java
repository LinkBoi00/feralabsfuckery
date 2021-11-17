package con;

import android.view.View;
import android.view.ViewConfiguration;
/* loaded from: classes.dex */
public abstract class qt4vMCOja implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final int Bhmn1KIah;
    public final float CBQ5d1kRq;
    public int Eeka1udhb;
    public Runnable MzoOEjc4X;
    public final View PSTqBLTET;
    public final int[] dXrmkklc8 = new int[2];
    public Runnable ilHKhw3Yw;
    public final int kmSgne1rO;
    public boolean qVUwofr5s;

    public qt4vMCOja(View view) {
        this.PSTqBLTET = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.CBQ5d1kRq = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.kmSgne1rO = tapTimeout;
        this.Bhmn1KIah = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public abstract JU5oYK2sJ J4Ux7ym32();

    public boolean dIocxURUo() {
        JU5oYK2sJ J4Ux7ym32 = J4Ux7ym32();
        if (J4Ux7ym32 == null || !J4Ux7ym32.J4Ux7ym32()) {
            return true;
        }
        J4Ux7ym32.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
        if (r4 != 3) goto L_0x0079;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0113  */
    @Override // android.view.View.OnTouchListener
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
        // Method dump skipped, instructions count: 305
        */
        throw new UnsupportedOperationException("Method not decompiled: con.qt4vMCOja.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.qVUwofr5s = false;
        this.Eeka1udhb = -1;
        Runnable runnable = this.MzoOEjc4X;
        if (runnable != null) {
            this.PSTqBLTET.removeCallbacks(runnable);
        }
    }

    public final void q3BipwRCk() {
        Runnable runnable = this.ilHKhw3Yw;
        if (runnable != null) {
            this.PSTqBLTET.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.MzoOEjc4X;
        if (runnable2 != null) {
            this.PSTqBLTET.removeCallbacks(runnable2);
        }
    }

    public abstract boolean tGV7Q6urW();
}
