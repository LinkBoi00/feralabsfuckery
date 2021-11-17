package con;

import android.os.SystemClock;
import android.view.MotionEvent;
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
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        wRt60CcGM wrt60ccgm;
        boolean z4 = this.qVUwofr5s;
        if (z4) {
            View view2 = this.PSTqBLTET;
            JU5oYK2sJ J4Ux7ym32 = J4Ux7ym32();
            if (J4Ux7ym32 != null && J4Ux7ym32.J4Ux7ym32() && (wrt60ccgm = (wRt60CcGM) J4Ux7ym32.CBQ5d1kRq()) != null && wrt60ccgm.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.dXrmkklc8;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation((float) iArr[0], (float) iArr[1]);
                int[] iArr2 = this.dXrmkklc8;
                wrt60ccgm.getLocationOnScreen(iArr2);
                obtainNoHistory.offsetLocation((float) (-iArr2[0]), (float) (-iArr2[1]));
                boolean J4Ux7ym322 = wrt60ccgm.J4Ux7ym32(obtainNoHistory, this.Eeka1udhb);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z5 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (J4Ux7ym322 && z5) {
                    z3 = true;
                    z = !z3 || !dIocxURUo();
                }
            }
            z3 = false;
            if (!z3) {
            }
        } else {
            View view3 = this.PSTqBLTET;
            if (view3.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.Eeka1udhb);
                            if (findPointerIndex >= 0) {
                                float x = motionEvent.getX(findPointerIndex);
                                float y = motionEvent.getY(findPointerIndex);
                                float f = this.CBQ5d1kRq;
                                float f2 = -f;
                                if (!(x >= f2 && y >= f2 && x < ((float) (view3.getRight() - view3.getLeft())) + f && y < ((float) (view3.getBottom() - view3.getTop())) + f)) {
                                    q3BipwRCk();
                                    view3.getParent().requestDisallowInterceptTouchEvent(true);
                                    z2 = true;
                                    z = !z2 && tGV7Q6urW();
                                    if (z) {
                                        long uptimeMillis = SystemClock.uptimeMillis();
                                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                        this.PSTqBLTET.onTouchEvent(obtain);
                                        obtain.recycle();
                                    }
                                }
                            }
                        }
                    }
                    q3BipwRCk();
                } else {
                    this.Eeka1udhb = motionEvent.getPointerId(0);
                    if (this.MzoOEjc4X == null) {
                        this.MzoOEjc4X = new Ohkja0BCf(this, 0);
                    }
                    view3.postDelayed(this.MzoOEjc4X, (long) this.kmSgne1rO);
                    if (this.ilHKhw3Yw == null) {
                        this.ilHKhw3Yw = new Ohkja0BCf(this, 1);
                    }
                    view3.postDelayed(this.ilHKhw3Yw, (long) this.Bhmn1KIah);
                }
            }
            z2 = false;
            if (!z2) {
            }
            if (z) {
            }
        }
        this.qVUwofr5s = z;
        return z || z4;
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
