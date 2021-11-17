package con;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class O30O4Sjfj implements View.OnTouchListener {
    public static final int IytU16YUK = ViewConfiguration.getTapTimeout();
    public final View Bhmn1KIah;
    public final hod7ZTZdj CBQ5d1kRq;
    public Runnable PSTqBLTET;
    public boolean WaUP0CF08;
    public final ListView cAwN510t2;
    public boolean dfpT1j18n;
    public boolean i8XZMQc6Z;
    public boolean iMyQMM6Qj;
    public boolean sk5s77z6Q;
    public final Interpolator kmSgne1rO = new AccelerateInterpolator();
    public float[] MzoOEjc4X = {0.0f, 0.0f};
    public float[] ilHKhw3Yw = {Float.MAX_VALUE, Float.MAX_VALUE};
    public float[] dXrmkklc8 = {0.0f, 0.0f};
    public float[] RG6kpfv3v = {0.0f, 0.0f};
    public float[] ixWaw2akD = {Float.MAX_VALUE, Float.MAX_VALUE};
    public int qVUwofr5s = 1;
    public int Eeka1udhb = IytU16YUK;

    public O30O4Sjfj(ListView listView) {
        hod7ZTZdj hod7ztzdj = new hod7ZTZdj();
        this.CBQ5d1kRq = hod7ztzdj;
        this.Bhmn1KIah = listView;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.ixWaw2akD;
        float f2 = ((float) ((int) ((1575.0f * f) + 0.5f))) / 1000.0f;
        fArr[0] = f2;
        fArr[1] = f2;
        float[] fArr2 = this.RG6kpfv3v;
        float f3 = ((float) ((int) ((f * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f3;
        fArr2[1] = f3;
        float[] fArr3 = this.ilHKhw3Yw;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.MzoOEjc4X;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.dXrmkklc8;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        hod7ztzdj.q3BipwRCk = 500;
        hod7ztzdj.J4Ux7ym32 = 500;
        this.cAwN510t2 = listView;
    }

    public static float J4Ux7ym32(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    public final void GPLPRo6go() {
        int i;
        if (this.PSTqBLTET == null) {
            this.PSTqBLTET = new go0qReAcx(this);
        }
        this.dfpT1j18n = true;
        this.WaUP0CF08 = true;
        if (this.sk5s77z6Q || (i = this.Eeka1udhb) <= 0) {
            this.PSTqBLTET.run();
        } else {
            View view = this.Bhmn1KIah;
            Runnable runnable = this.PSTqBLTET;
            long j = (long) i;
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            VCCyeOu6I.Bhmn1KIah(view, runnable, j);
        }
        this.sk5s77z6Q = true;
    }

    public final float dIocxURUo(float f, float f2, float f3, float f4) {
        float f5;
        float J4Ux7ym32 = J4Ux7ym32(f * f2, 0.0f, f3);
        float tGV7Q6urW = tGV7Q6urW(f2 - f4, J4Ux7ym32) - tGV7Q6urW(f4, J4Ux7ym32);
        if (tGV7Q6urW < 0.0f) {
            f5 = -this.kmSgne1rO.getInterpolation(-tGV7Q6urW);
        } else if (tGV7Q6urW <= 0.0f) {
            return 0.0f;
        } else {
            f5 = this.kmSgne1rO.getInterpolation(tGV7Q6urW);
        }
        return J4Ux7ym32(f5, -1.0f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean iiGwOFFnr() {
        boolean z;
        hod7ZTZdj hod7ztzdj = this.CBQ5d1kRq;
        float f = hod7ztzdj.dIocxURUo;
        int abs = (int) (f / Math.abs(f));
        Math.abs(hod7ztzdj.tGV7Q6urW);
        if (abs != 0) {
            ListView listView = this.cAwN510t2;
            int count = listView.getCount();
            if (count != 0) {
                int childCount = listView.getChildCount();
                int firstVisiblePosition = listView.getFirstVisiblePosition();
                int i = firstVisiblePosition + childCount;
                if (abs <= 0 ? !(abs >= 0 || (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0)) : !(i >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight())) {
                    z = true;
                    if (z) {
                        return true;
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        return false;
    }

    public final void kCA6Zs9sL() {
        int i = 0;
        if (this.WaUP0CF08) {
            this.dfpT1j18n = false;
            return;
        }
        hod7ZTZdj hod7ztzdj = this.CBQ5d1kRq;
        Objects.requireNonNull(hod7ztzdj);
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - hod7ztzdj.kCA6Zs9sL);
        int i3 = hod7ztzdj.J4Ux7ym32;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        hod7ztzdj.vPSbyrYWX = i;
        hod7ztzdj.oon79WMrY = hod7ztzdj.q3BipwRCk(currentAnimationTimeMillis);
        hod7ztzdj.yWvV4ePLl = currentAnimationTimeMillis;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
        if (r0 != 3) goto L_0x0059;
     */
    @Override // android.view.View.OnTouchListener
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.iMyQMM6Qj) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                kCA6Zs9sL();
            } else {
                this.i8XZMQc6Z = true;
                this.sk5s77z6Q = false;
            }
            float q3BipwRCk = q3BipwRCk(0, motionEvent.getX(), (float) view.getWidth(), (float) this.Bhmn1KIah.getWidth());
            float q3BipwRCk2 = q3BipwRCk(1, motionEvent.getY(), (float) view.getHeight(), (float) this.Bhmn1KIah.getHeight());
            hod7ZTZdj hod7ztzdj = this.CBQ5d1kRq;
            hod7ztzdj.tGV7Q6urW = q3BipwRCk;
            hod7ztzdj.dIocxURUo = q3BipwRCk2;
            if (!this.dfpT1j18n && iiGwOFFnr()) {
                GPLPRo6go();
            }
        }
        return false;
    }

    public final float q3BipwRCk(int i, float f, float f2, float f3) {
        float dIocxURUo = dIocxURUo(this.MzoOEjc4X[i], f2, this.ilHKhw3Yw[i], f);
        int i2 = (dIocxURUo > 0.0f ? 1 : (dIocxURUo == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.dXrmkklc8[i];
        float f5 = this.RG6kpfv3v[i];
        float f6 = this.ixWaw2akD[i];
        float f7 = f4 * f3;
        return i2 > 0 ? J4Ux7ym32(dIocxURUo * f7, f5, f6) : -J4Ux7ym32((-dIocxURUo) * f7, f5, f6);
    }

    public final float tGV7Q6urW(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.qVUwofr5s;
        if (i == 0 || i == 1) {
            if (f >= f2) {
                return 0.0f;
            }
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            return (!this.dfpT1j18n || i != 1) ? 0.0f : 1.0f;
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        } else {
            return 0.0f;
        }
    }
}
