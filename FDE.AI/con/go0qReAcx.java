package con;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.mhl5lIdbQ;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class go0qReAcx implements Runnable {
    public final /* synthetic */ int CBQ5d1kRq = 9;
    public final /* synthetic */ Object kmSgne1rO;

    public go0qReAcx(View view) {
        this.kmSgne1rO = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z = true;
        switch (this.CBQ5d1kRq) {
            case 0:
                try {
                    go0qReAcx.super.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                }
            case 1:
                ((dERotAvCn) this.kmSgne1rO).q3BipwRCk(true);
                ((dERotAvCn) this.kmSgne1rO).invalidateSelf();
                return;
            case 2:
                wRt60CcGM wrt60ccgm = (wRt60CcGM) this.kmSgne1rO;
                wrt60ccgm.WaUP0CF08 = null;
                wrt60ccgm.drawableStateChanged();
                return;
            case 3:
            case 6:
            default:
                ((UZwL3ezpe) this.kmSgne1rO).PSTqBLTET();
                return;
            case 4:
                O30O4Sjfj o30O4Sjfj = (O30O4Sjfj) this.kmSgne1rO;
                if (o30O4Sjfj.dfpT1j18n) {
                    if (o30O4Sjfj.WaUP0CF08) {
                        o30O4Sjfj.WaUP0CF08 = false;
                        hod7ZTZdj hod7ztzdj = o30O4Sjfj.CBQ5d1kRq;
                        Objects.requireNonNull(hod7ztzdj);
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        hod7ztzdj.kCA6Zs9sL = currentAnimationTimeMillis;
                        hod7ztzdj.yWvV4ePLl = -1;
                        hod7ztzdj.iiGwOFFnr = currentAnimationTimeMillis;
                        hod7ztzdj.oon79WMrY = 0.5f;
                        hod7ztzdj.GPLPRo6go = 0;
                        hod7ztzdj.Puu3Rhg4F = 0;
                    }
                    hod7ZTZdj hod7ztzdj2 = ((O30O4Sjfj) this.kmSgne1rO).CBQ5d1kRq;
                    if (hod7ztzdj2.yWvV4ePLl <= 0 || AnimationUtils.currentAnimationTimeMillis() <= hod7ztzdj2.yWvV4ePLl + ((long) hod7ztzdj2.vPSbyrYWX)) {
                        z = false;
                    }
                    if (z || !((O30O4Sjfj) this.kmSgne1rO).iiGwOFFnr()) {
                        ((O30O4Sjfj) this.kmSgne1rO).dfpT1j18n = false;
                        return;
                    }
                    O30O4Sjfj o30O4Sjfj2 = (O30O4Sjfj) this.kmSgne1rO;
                    if (o30O4Sjfj2.i8XZMQc6Z) {
                        o30O4Sjfj2.i8XZMQc6Z = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        o30O4Sjfj2.Bhmn1KIah.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (hod7ztzdj2.iiGwOFFnr != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float q3BipwRCk = hod7ztzdj2.q3BipwRCk(currentAnimationTimeMillis2);
                        hod7ztzdj2.iiGwOFFnr = currentAnimationTimeMillis2;
                        float f = ((float) (currentAnimationTimeMillis2 - hod7ztzdj2.iiGwOFFnr)) * ((q3BipwRCk * 4.0f) + (-4.0f * q3BipwRCk * q3BipwRCk));
                        hod7ztzdj2.GPLPRo6go = (int) (hod7ztzdj2.tGV7Q6urW * f);
                        int i = (int) (f * hod7ztzdj2.dIocxURUo);
                        hod7ztzdj2.Puu3Rhg4F = i;
                        ((O30O4Sjfj) this.kmSgne1rO).cAwN510t2.scrollListBy(i);
                        View view = ((O30O4Sjfj) this.kmSgne1rO).Bhmn1KIah;
                        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                        VCCyeOu6I.kmSgne1rO(view, this);
                        return;
                    }
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                return;
            case 5:
                ((LozNPPdAO) this.kmSgne1rO).Eeka1udhb(0);
                return;
            case 7:
                K3JGdRcke k3JGdRcke = (K3JGdRcke) this.kmSgne1rO;
                if (k3JGdRcke.kmSgne1rO == 0) {
                    k3JGdRcke.Bhmn1KIah = true;
                    k3JGdRcke.ilHKhw3Yw.kCA6Zs9sL(mhl5lIdbQ.RG2GI7LDp.ON_PAUSE);
                }
                K3JGdRcke k3JGdRcke2 = (K3JGdRcke) this.kmSgne1rO;
                if (k3JGdRcke2.CBQ5d1kRq == 0 && k3JGdRcke2.Bhmn1KIah) {
                    k3JGdRcke2.ilHKhw3Yw.kCA6Zs9sL(mhl5lIdbQ.RG2GI7LDp.ON_STOP);
                    k3JGdRcke2.PSTqBLTET = true;
                    return;
                }
                return;
            case 8:
                isrYs6b4I isrys6b4i = (isrYs6b4I) this.kmSgne1rO;
                int i2 = isrys6b4i.iMyQMM6Qj;
                if (i2 == 1) {
                    isrys6b4i.dfpT1j18n.cancel();
                } else if (i2 != 2) {
                    return;
                }
                isrys6b4i.iMyQMM6Qj = 3;
                ValueAnimator valueAnimator = isrys6b4i.dfpT1j18n;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                isrys6b4i.dfpT1j18n.setDuration((long) 500);
                isrys6b4i.dfpT1j18n.start();
                return;
            case 9:
                ((InputMethodManager) ((View) this.kmSgne1rO).getContext().getSystemService("input_method")).showSoftInput((View) this.kmSgne1rO, 1);
                return;
        }
    }

    public go0qReAcx(ComponentActivity componentActivity) {
        this.kmSgne1rO = componentActivity;
    }

    public go0qReAcx(wRt60CcGM wrt60ccgm) {
        this.kmSgne1rO = wrt60ccgm;
    }

    public go0qReAcx(isrYs6b4I isrys6b4i) {
        this.kmSgne1rO = isrys6b4i;
    }

    public go0qReAcx(O30O4Sjfj o30O4Sjfj) {
        this.kmSgne1rO = o30O4Sjfj;
    }

    public go0qReAcx(K3JGdRcke k3JGdRcke) {
        this.kmSgne1rO = k3JGdRcke;
    }

    public go0qReAcx(UZwL3ezpe uZwL3ezpe) {
        this.kmSgne1rO = uZwL3ezpe;
    }

    public go0qReAcx(LozNPPdAO lozNPPdAO) {
        this.kmSgne1rO = lozNPPdAO;
    }
}
