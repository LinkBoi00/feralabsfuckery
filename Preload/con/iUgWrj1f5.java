package con;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class iUgWrj1f5 extends View implements H8Cq8Y88s {
    public static boolean IytU16YUK;
    public static boolean cAwN510t2;
    public static Method dfpT1j18n;
    public static Field iMyQMM6Qj;
    public PmanMZxiM Bhmn1KIah;
    public final AndroidComposeView CBQ5d1kRq;
    public boolean Eeka1udhb;
    public final xj4ka7JlA MzoOEjc4X;
    public gdEmqfwpT PSTqBLTET;
    public boolean dXrmkklc8;
    public boolean ilHKhw3Yw;
    public final kvS6fwO6H kmSgne1rO;
    public Rect qVUwofr5s;
    public static final Kfj0pfb90 WaUP0CF08 = new Kfj0pfb90(0);
    public static final ViewOutlineProvider i8XZMQc6Z = new HLK5D9kAL();
    public final iFKnyAZAM RG6kpfv3v = new iFKnyAZAM(7);
    public final hrJ1tyVgP ixWaw2akD = new hrJ1tyVgP(ncKm8DzZ7.cAwN510t2);
    public long sk5s77z6Q = WyfbJwwBZ.tGV7Q6urW;

    public iUgWrj1f5(AndroidComposeView androidComposeView, kvS6fwO6H kvs6fwo6h, PmanMZxiM pmanMZxiM, gdEmqfwpT gdemqfwpt) {
        super(androidComposeView.getContext());
        this.CBQ5d1kRq = androidComposeView;
        this.kmSgne1rO = kvs6fwo6h;
        this.Bhmn1KIah = pmanMZxiM;
        this.PSTqBLTET = gdemqfwpt;
        this.MzoOEjc4X = new xj4ka7JlA(androidComposeView.getDensity());
        ksLrMHgEz kslrmhgez = WyfbJwwBZ.J4Ux7ym32;
        setWillNotDraw(false);
        setId(View.generateViewId());
        kvs6fwo6h.addView(this);
    }

    private final A128gLXzp getManualClipPath() {
        if (getClipToOutline()) {
            xj4ka7JlA xj4ka7jla = this.MzoOEjc4X;
            if (!(!xj4ka7jla.yWvV4ePLl)) {
                xj4ka7jla.kCA6Zs9sL();
                return xj4ka7jla.GPLPRo6go;
            }
        }
        return null;
    }

    private final void setInvalidated(boolean z) {
        if (z != this.Eeka1udhb) {
            this.Eeka1udhb = z;
            this.CBQ5d1kRq.CBQ5d1kRq(this, z);
        }
    }

    @Override // con.H8Cq8Y88s
    public void GPLPRo6go(SI0VpKubr sI0VpKubr) {
        boolean z = getElevation() > 0.0f;
        this.dXrmkklc8 = z;
        if (z) {
            sI0VpKubr.ilHKhw3Yw();
        }
        this.kmSgne1rO.q3BipwRCk(sI0VpKubr, this, getDrawingTime());
        if (this.dXrmkklc8) {
            sI0VpKubr.vPSbyrYWX();
        }
    }

    @Override // con.H8Cq8Y88s
    public void J4Ux7ym32() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.CBQ5d1kRq;
        androidComposeView.nlGCs0NZs = true;
        this.Bhmn1KIah = null;
        this.PSTqBLTET = null;
        androidComposeView.qVUwofr5s(this);
        this.kmSgne1rO.removeViewInLayout(this);
    }

    @Override // con.H8Cq8Y88s
    public void Puu3Rhg4F(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, JZuV4yGnu jZuV4yGnu, boolean z, yA4i3FtpV ya4i3ftpv, BFRsKhrQv bFRsKhrQv, AU29aHa4X aU29aHa4X) {
        gdEmqfwpT gdemqfwpt;
        this.sk5s77z6Q = j;
        setScaleX(f);
        setScaleY(f2);
        setAlpha(f3);
        setTranslationX(f4);
        setTranslationY(f5);
        setElevation(f6);
        setRotation(f9);
        setRotationX(f7);
        setRotationY(f8);
        setPivotX(WyfbJwwBZ.q3BipwRCk(this.sk5s77z6Q) * ((float) getWidth()));
        setPivotY(WyfbJwwBZ.J4Ux7ym32(this.sk5s77z6Q) * ((float) getHeight()));
        setCameraDistancePx(f10);
        boolean z2 = true;
        this.ilHKhw3Yw = z && jZuV4yGnu == Nb0J8E3sF.q3BipwRCk;
        vPSbyrYWX();
        boolean z3 = getManualClipPath() != null;
        setClipToOutline(z && jZuV4yGnu != Nb0J8E3sF.q3BipwRCk);
        boolean dIocxURUo = this.MzoOEjc4X.dIocxURUo(jZuV4yGnu, getAlpha(), getClipToOutline(), getElevation(), bFRsKhrQv, aU29aHa4X);
        setOutlineProvider(this.MzoOEjc4X.J4Ux7ym32() != null ? i8XZMQc6Z : null);
        if (getManualClipPath() == null) {
            z2 = false;
        }
        if (z3 != z2 || (z2 && dIocxURUo)) {
            invalidate();
        }
        if (!this.dXrmkklc8 && getElevation() > 0.0f && (gdemqfwpt = this.PSTqBLTET) != null) {
            gdemqfwpt.GPLPRo6go();
        }
        this.ixWaw2akD.tGV7Q6urW();
        if (Build.VERSION.SDK_INT >= 31) {
            vpiqOzM17.q3BipwRCk.q3BipwRCk(this, null);
        }
    }

    @Override // con.H8Cq8Y88s
    public void dIocxURUo(long j) {
        int q3BipwRCk = ZtJSMDYDl.q3BipwRCk(j);
        if (q3BipwRCk != getLeft()) {
            offsetLeftAndRight(q3BipwRCk - getLeft());
            this.ixWaw2akD.tGV7Q6urW();
        }
        int J4Ux7ym32 = ZtJSMDYDl.J4Ux7ym32(j);
        if (J4Ux7ym32 != getTop()) {
            offsetTopAndBottom(J4Ux7ym32 - getTop());
            this.ixWaw2akD.tGV7Q6urW();
        }
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean z = false;
        setInvalidated(false);
        iFKnyAZAM ifknyazam = this.RG6kpfv3v;
        Object obj = ifknyazam.kmSgne1rO;
        Canvas canvas2 = ((YSo0hTREC) obj).q3BipwRCk;
        ((YSo0hTREC) obj).q3BipwRCk = canvas;
        YSo0hTREC ySo0hTREC = (YSo0hTREC) obj;
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            z = true;
            ySo0hTREC.GPLPRo6go();
            this.MzoOEjc4X.q3BipwRCk(ySo0hTREC);
        }
        PmanMZxiM pmanMZxiM = this.Bhmn1KIah;
        if (pmanMZxiM != null) {
            pmanMZxiM.IytU16YUK(ySo0hTREC);
        }
        if (z) {
            ySo0hTREC.J4Ux7ym32();
        }
        ((YSo0hTREC) ifknyazam.kmSgne1rO).q3BipwRCk = canvas2;
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / ((float) getResources().getDisplayMetrics().densityDpi);
    }

    public final kvS6fwO6H getContainer() {
        return this.kmSgne1rO;
    }

    public long getLayerId() {
        return (long) getId();
    }

    public final AndroidComposeView getOwnerView() {
        return this.CBQ5d1kRq;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT < 29) {
            return -1;
        }
        ksLrMHgEz kslrmhgez = tMGwJC1yB.q3BipwRCk;
        return this.CBQ5d1kRq.getUniqueDrawingId();
    }

    @Override // con.H8Cq8Y88s
    public void iiGwOFFnr(long j) {
        int tGV7Q6urW = YWiUMZOtw.tGV7Q6urW(j);
        int J4Ux7ym32 = YWiUMZOtw.J4Ux7ym32(j);
        if (tGV7Q6urW != getWidth() || J4Ux7ym32 != getHeight()) {
            float f = (float) tGV7Q6urW;
            setPivotX(WyfbJwwBZ.q3BipwRCk(this.sk5s77z6Q) * f);
            float f2 = (float) J4Ux7ym32;
            setPivotY(WyfbJwwBZ.J4Ux7ym32(this.sk5s77z6Q) * f2);
            xj4ka7JlA xj4ka7jla = this.MzoOEjc4X;
            long J4Ux7ym322 = gThLCaTO1.J4Ux7ym32(f, f2);
            if (!tbzY8QG6X.J4Ux7ym32(xj4ka7jla.dIocxURUo, J4Ux7ym322)) {
                xj4ka7jla.dIocxURUo = J4Ux7ym322;
                xj4ka7jla.Puu3Rhg4F = true;
            }
            setOutlineProvider(this.MzoOEjc4X.J4Ux7ym32() != null ? i8XZMQc6Z : null);
            layout(getLeft(), getTop(), getLeft() + tGV7Q6urW, getTop() + J4Ux7ym32);
            vPSbyrYWX();
            this.ixWaw2akD.tGV7Q6urW();
        }
    }

    @Override // android.view.View, con.H8Cq8Y88s
    public void invalidate() {
        if (!this.Eeka1udhb) {
            setInvalidated(true);
            super.invalidate();
            this.CBQ5d1kRq.invalidate();
        }
    }

    @Override // con.H8Cq8Y88s
    public void kCA6Zs9sL() {
        if (this.Eeka1udhb && !IytU16YUK) {
            setInvalidated(false);
            WaUP0CF08.q3BipwRCk(this);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // con.H8Cq8Y88s
    public boolean oon79WMrY(long j) {
        float tGV7Q6urW = bRgfgYIQX.tGV7Q6urW(j);
        float dIocxURUo = bRgfgYIQX.dIocxURUo(j);
        if (this.ilHKhw3Yw) {
            return 0.0f <= tGV7Q6urW && tGV7Q6urW < ((float) getWidth()) && 0.0f <= dIocxURUo && dIocxURUo < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.MzoOEjc4X.tGV7Q6urW(j);
        }
        return true;
    }

    @Override // con.H8Cq8Y88s
    public void q3BipwRCk(PmanMZxiM pmanMZxiM, gdEmqfwpT gdemqfwpt) {
        this.kmSgne1rO.addView(this);
        this.ilHKhw3Yw = false;
        this.dXrmkklc8 = false;
        ksLrMHgEz kslrmhgez = WyfbJwwBZ.J4Ux7ym32;
        this.sk5s77z6Q = WyfbJwwBZ.tGV7Q6urW;
        this.Bhmn1KIah = pmanMZxiM;
        this.PSTqBLTET = gdemqfwpt;
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * ((float) getResources().getDisplayMetrics().densityDpi));
    }

    @Override // con.H8Cq8Y88s
    public long tGV7Q6urW(long j, boolean z) {
        if (!z) {
            return p20sE4qqm.J4Ux7ym32(this.ixWaw2akD.J4Ux7ym32(this), j);
        }
        float[] q3BipwRCk = this.ixWaw2akD.q3BipwRCk(this);
        bRgfgYIQX brgfgyiqx = q3BipwRCk == null ? null : new bRgfgYIQX(p20sE4qqm.J4Ux7ym32(q3BipwRCk, j));
        if (brgfgyiqx != null) {
            return brgfgyiqx.q3BipwRCk;
        }
        JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
        return bRgfgYIQX.dIocxURUo;
    }

    public final void vPSbyrYWX() {
        Rect rect;
        if (this.ilHKhw3Yw) {
            Rect rect2 = this.qVUwofr5s;
            if (rect2 == null) {
                this.qVUwofr5s = new Rect(0, 0, getWidth(), getHeight());
            } else {
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.qVUwofr5s;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // con.H8Cq8Y88s
    public void yWvV4ePLl(iPoCEXeoL ipocexeol, boolean z) {
        if (z) {
            float[] q3BipwRCk = this.ixWaw2akD.q3BipwRCk(this);
            if (q3BipwRCk != null) {
                p20sE4qqm.tGV7Q6urW(q3BipwRCk, ipocexeol);
                return;
            }
            ipocexeol.q3BipwRCk = 0.0f;
            ipocexeol.J4Ux7ym32 = 0.0f;
            ipocexeol.tGV7Q6urW = 0.0f;
            ipocexeol.dIocxURUo = 0.0f;
            return;
        }
        p20sE4qqm.tGV7Q6urW(this.ixWaw2akD.J4Ux7ym32(this), ipocexeol);
    }
}
