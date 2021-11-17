package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.platform.AndroidComposeView;
import con.AU29aHa4X;
import con.AdUPdUuqH;
import con.Awlb99mXV;
import con.BBVaGLNaU;
import con.BFRsKhrQv;
import con.BgHiMFrEI;
import con.BgIsSUB3d;
import con.C2cgp32t9;
import con.CBcUvsHpG;
import con.Chhh90LYe;
import con.D7JlMB0DC;
import con.EBke9S31I;
import con.H8Cq8Y88s;
import con.HXRw132ar;
import con.IuQbWntsc;
import con.J008eMQIc;
import con.JhpbRXxsg;
import con.K5PjwoFCN;
import con.K6PL0z3I0;
import con.KB2jjcOAK;
import con.Kfj0pfb90;
import con.KyeAEIfPn;
import con.LBUvXIUJ7;
import con.LCXryTULd;
import con.LKa8y802S;
import con.LdCs16gwx;
import con.N0a4Shkkl;
import con.OD5M57NUq;
import con.ODug2UCW1;
import con.OHS7Jvxri;
import con.OIP2vionU;
import con.PKYIHi40H;
import con.PPcH1Yg6X;
import con.PZAPy5kDf;
import con.PlegqbMSA;
import con.PmanMZxiM;
import con.Q2LDBN4BW;
import con.Q4TFMtvSV;
import con.RCIIpuNjf;
import con.RNEcgN6dQ;
import con.SBy3PdRIl;
import con.THtcUO7dj;
import con.Tpuv1V0a9;
import con.Updw121tb;
import con.VQ5lQYeWH;
import con.WAflFGuGp;
import con.Wk9bO57s4;
import con.WvYaaMLyO;
import con.XHpudBVT5;
import con.YSo0hTREC;
import con.ZY8Th66Rr;
import con.Zp6BB9iOY;
import con.ZtJSMDYDl;
import con.ZxiP1t48m;
import con.aY3UdkO3G;
import con.anXlDk6fV;
import con.bRgfgYIQX;
import con.bWetWC3NJ;
import con.cjQ255nrQ;
import con.dK8imq773;
import con.dnBSj5uJN;
import con.eut9mmvYo;
import con.fCkNY70T9;
import con.ftmnXRQmW;
import con.gdEmqfwpT;
import con.hrAjOnL52;
import con.iEPfl89zU;
import con.iFKnyAZAM;
import con.iUgWrj1f5;
import con.jRWr6Yc4S;
import con.jgMsl7cgu;
import con.joOFKdxvJ;
import con.jz2wLk9jK;
import con.kVHvlpsMs;
import con.ksLrMHgEz;
import con.kvS6fwO6H;
import con.le9Z8LIS5;
import con.mS4pA2jQ7;
import con.mSdY2IgoN;
import con.n4f84B5OG;
import con.nghVD4tWN;
import con.p20sE4qqm;
import con.p62TZmTyO;
import con.pA5wCkne4;
import con.pLYbCSTk0;
import con.pnuAOe8oh;
import con.prCJwNx2x;
import con.pz7YPhQTU;
import con.qe4AUqI9T;
import con.qih4lW99W;
import con.s2CbOR66h;
import con.sFlvsftwE;
import con.sQduB7jbp;
import con.tEqEOtm8X;
import con.tcFbS2CQx;
import con.u2NVWksuO;
import con.u51fgFYkV;
import con.uEb6wTQlg;
import con.vk135kjc7;
import con.wDfIorp2q;
import con.xJMblIIqI;
import con.zEm3MQbi0;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
@SuppressLint({"ViewConstructor", "VisibleForTests"})
/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements jRWr6Yc4S, ZxiP1t48m, vk135kjc7, PPcH1Yg6X {
    public static Method Ihm5o4uLx;
    public static Class ShSN9wbzk;
    public final iEPfl89zU AqaWJg0b4;
    public final sQduB7jbp Dr7UqlxEV;
    public final fCkNY70T9 EBQXiIPmm;
    public long IG30YE5GU;
    public final C2cgp32t9 INnK5Rew6;
    public final aY3UdkO3G KBYw84i3W;
    public final WfopS3efW KlYagMRWx;
    public final bWetWC3NJ M66hQ219i;
    public final EBke9S31I MzoOEjc4X;
    public PmanMZxiM OpLJtmvFM;
    public AU29aHa4X PSTqBLTET;
    public boolean QNqj6nIzv;
    public MotionEvent R2hkbNqWf;
    public final RNEcgN6dQ SuKhTJIQc;
    public K5PjwoFCN V9LQMKGJe;
    public final jz2wLk9jK YmNRDyka4;
    public final PlegqbMSA buPcffgdD;
    public final pLYbCSTk0 dXrmkklc8;
    public List dfpT1j18n;
    public LdCs16gwx i0Zug1mVk;
    public boolean iMyQMM6Qj;
    public final LCXryTULd kktL0P5MG;
    public final tcFbS2CQx ln3nf7LH3;
    public final gdEmqfwpT lqFHPHdW3;
    public final OHS7Jvxri mUqPm6GBh;
    public boolean nlGCs0NZs;
    public kvS6fwO6H o4LF8RkoQ;
    public Chhh90LYe oesmsHQJU;
    public final Awlb99mXV qVUwofr5s;
    public final Tpuv1V0a9 sk5s77z6Q;
    public boolean vNtjxmzUM;
    public boolean ziwPzaoF3;
    public long CBQ5d1kRq = bRgfgYIQX.kCA6Zs9sL;
    public boolean kmSgne1rO = true;
    public final HXRw132ar Bhmn1KIah = new HXRw132ar(null, 1);
    public final sFlvsftwE ilHKhw3Yw = new sFlvsftwE();
    public final iFKnyAZAM Eeka1udhb = new iFKnyAZAM(7);
    public final ZxiP1t48m RG6kpfv3v = this;
    public final qe4AUqI9T ixWaw2akD = new qe4AUqI9T(getRoot());
    public final mS4pA2jQ7 WaUP0CF08 = new mS4pA2jQ7();
    public final List i8XZMQc6Z = new ArrayList();
    public final ZY8Th66Rr cAwN510t2 = new ZY8Th66Rr();
    public final LKa8y802S IytU16YUK = new LKa8y802S(getRoot());
    public PmanMZxiM CpG0imbht = aXI58Y1kr.kmSgne1rO;
    public final kVHvlpsMs qFBXIgpia = new kVHvlpsMs(this, getAutofillTree());
    public final OIP2vionU NyWTwPF6V = new OIP2vionU(new Rma6SHcSH());
    public final cjQ255nrQ igRQEZxnW = new cjQ255nrQ(getRoot());
    public long TyB1UUd72 = ZtJSMDYDl.tGV7Q6urW;
    public final int[] juJ6pnCpu = {0, 0};
    public final float[] j22ftfeNI = p20sE4qqm.q3BipwRCk(null, 1);
    public final float[] QSbMsHU5X = p20sE4qqm.q3BipwRCk(null, 1);
    public final float[] L4EwGfXiQ = p20sE4qqm.q3BipwRCk(null, 1);
    public long zHl31GGXU = -1;
    public long wIZEdYHUn = bRgfgYIQX.dIocxURUo;
    public boolean IzM1cD9ly = true;
    public final RNEcgN6dQ n4UIOvAko = u51fgFYkV.dIocxURUo(null, null, 2, null);
    public final ViewTreeObserver.OnGlobalLayoutListener BL4OzhZBd = new xJMblIIqI(this);
    public final ViewTreeObserver.OnScrollChangedListener DuuXfa7LE = new ViewTreeObserver.OnScrollChangedListener() { // from class: con.z2o4JID0E
        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public final void onScrollChanged() {
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            Class cls = AndroidComposeView.ShSN9wbzk;
            androidComposeView.sk5s77z6Q();
        }
    };
    public final ViewTreeObserver.OnTouchModeChangeListener XYT7vJqNO = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: con.oyq5uJAxG
        @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
        public final void onTouchModeChanged(boolean z) {
            AndroidComposeView androidComposeView = AndroidComposeView.this;
            ((prCJwNx2x) androidComposeView.Dr7UqlxEV.q3BipwRCk).CBQ5d1kRq(new J008eMQIc(z ? 1 : 2));
            xpuSUT7Gh.buPcffgdD(androidComposeView.MzoOEjc4X.q3BipwRCk.tGV7Q6urW());
        }
    };

    /* loaded from: classes.dex */
    public static final class PMYI4lLJM extends Wk9bO57s4 implements PmanMZxiM {
        public static final PMYI4lLJM kmSgne1rO = new PMYI4lLJM();

        public PMYI4lLJM() {
            super(1);
        }

        @Override // con.PmanMZxiM
        public /* bridge */ /* synthetic */ Object IytU16YUK(Object obj) {
            hrAjOnL52 hrajonl52 = (hrAjOnL52) obj;
            return qih4lW99W.q3BipwRCk;
        }
    }

    /* loaded from: classes.dex */
    public static final class RG2GI7LDp {
        public final XHpudBVT5 J4Ux7ym32;
        public final BgHiMFrEI q3BipwRCk;

        public RG2GI7LDp(BgHiMFrEI bgHiMFrEI, XHpudBVT5 xHpudBVT5) {
            this.q3BipwRCk = bgHiMFrEI;
            this.J4Ux7ym32 = xHpudBVT5;
        }
    }

    /* loaded from: classes.dex */
    public static final class Rma6SHcSH extends Wk9bO57s4 implements PmanMZxiM {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Rma6SHcSH() {
            super(1);
            AndroidComposeView.this = r1;
        }

        @Override // con.PmanMZxiM
        public Object IytU16YUK(Object obj) {
            gdEmqfwpT gdemqfwpt = (gdEmqfwpT) obj;
            Handler handler = AndroidComposeView.this.getHandler();
            if ((handler == null ? null : handler.getLooper()) == Looper.myLooper()) {
                gdemqfwpt.GPLPRo6go();
            } else {
                Handler handler2 = AndroidComposeView.this.getHandler();
                if (handler2 != null) {
                    handler2.post(new OD5M57NUq(gdemqfwpt, 0));
                }
            }
            return qih4lW99W.q3BipwRCk;
        }
    }

    /* loaded from: classes.dex */
    public static final class WfopS3efW implements Runnable {
        public WfopS3efW() {
            AndroidComposeView.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidComposeView.this.removeCallbacks(this);
            MotionEvent motionEvent = AndroidComposeView.this.R2hkbNqWf;
            if (motionEvent != null) {
                boolean z = false;
                boolean z2 = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (!z2 ? actionMasked != 1 : !(actionMasked == 10 || actionMasked == 1)) {
                    z = true;
                }
                if (z) {
                    int i = 7;
                    if (!(actionMasked == 7 || actionMasked == 9)) {
                        i = 2;
                    }
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    androidComposeView.RG6kpfv3v(motionEvent, i, androidComposeView.IG30YE5GU, false);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class aXI58Y1kr extends Wk9bO57s4 implements PmanMZxiM {
        public static final aXI58Y1kr kmSgne1rO = new aXI58Y1kr();

        public aXI58Y1kr() {
            super(1);
        }

        @Override // con.PmanMZxiM
        public /* bridge */ /* synthetic */ Object IytU16YUK(Object obj) {
            Configuration configuration = (Configuration) obj;
            return qih4lW99W.q3BipwRCk;
        }
    }

    /* loaded from: classes.dex */
    public static final class dNif5KqqH extends Wk9bO57s4 implements gdEmqfwpT {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dNif5KqqH() {
            super(0);
            AndroidComposeView.this = r1;
        }

        @Override // con.gdEmqfwpT
        public Object GPLPRo6go() {
            int actionMasked;
            MotionEvent motionEvent = AndroidComposeView.this.R2hkbNqWf;
            if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                AndroidComposeView.this.IG30YE5GU = SystemClock.uptimeMillis();
                AndroidComposeView androidComposeView = AndroidComposeView.this;
                androidComposeView.post(androidComposeView.KlYagMRWx);
            }
            return qih4lW99W.q3BipwRCk;
        }
    }

    /* loaded from: classes.dex */
    public static final class mhl5lIdbQ extends Wk9bO57s4 implements PmanMZxiM {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public mhl5lIdbQ() {
            super(1);
            AndroidComposeView.this = r1;
        }

        @Override // con.PmanMZxiM
        public Object IytU16YUK(Object obj) {
            int i = ((J008eMQIc) obj).q3BipwRCk;
            boolean z = true;
            if (J008eMQIc.q3BipwRCk(i, 1)) {
                z = AndroidComposeView.this.isInTouchMode();
            } else if (!J008eMQIc.q3BipwRCk(i, 2)) {
                z = false;
            } else if (AndroidComposeView.this.isInTouchMode()) {
                z = AndroidComposeView.this.requestFocusFromTouch();
            }
            return Boolean.valueOf(z);
        }
    }

    /* loaded from: classes.dex */
    public static final class qhPEQQaQ4 extends Wk9bO57s4 implements PmanMZxiM {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public qhPEQQaQ4() {
            super(1);
            AndroidComposeView.this = r1;
        }

        @Override // con.PmanMZxiM
        public Object IytU16YUK(Object obj) {
            SBy3PdRIl sBy3PdRIl;
            boolean z;
            boolean z2;
            SBy3PdRIl sBy3PdRIl2;
            KeyEvent keyEvent = ((PZAPy5kDf) obj).q3BipwRCk;
            Objects.requireNonNull(AndroidComposeView.this);
            long iiGwOFFnr = WAflFGuGp.iiGwOFFnr(keyEvent);
            uEb6wTQlg ueb6wtqlg = nghVD4tWN.q3BipwRCk;
            boolean z3 = true;
            int i = 1;
            if (nghVD4tWN.q3BipwRCk(iiGwOFFnr, nghVD4tWN.Puu3Rhg4F)) {
                if (keyEvent.isShiftPressed()) {
                    ksLrMHgEz kslrmhgez = SBy3PdRIl.J4Ux7ym32;
                    ksLrMHgEz kslrmhgez2 = SBy3PdRIl.J4Ux7ym32;
                    i = 2;
                } else {
                    ksLrMHgEz kslrmhgez3 = SBy3PdRIl.J4Ux7ym32;
                    ksLrMHgEz kslrmhgez4 = SBy3PdRIl.J4Ux7ym32;
                }
                sBy3PdRIl = new SBy3PdRIl(i);
            } else {
                if (nghVD4tWN.q3BipwRCk(iiGwOFFnr, nghVD4tWN.iiGwOFFnr)) {
                    ksLrMHgEz kslrmhgez5 = SBy3PdRIl.J4Ux7ym32;
                    ksLrMHgEz kslrmhgez6 = SBy3PdRIl.J4Ux7ym32;
                    sBy3PdRIl2 = new SBy3PdRIl(4);
                } else if (nghVD4tWN.q3BipwRCk(iiGwOFFnr, nghVD4tWN.kCA6Zs9sL)) {
                    ksLrMHgEz kslrmhgez7 = SBy3PdRIl.J4Ux7ym32;
                    ksLrMHgEz kslrmhgez8 = SBy3PdRIl.J4Ux7ym32;
                    sBy3PdRIl2 = new SBy3PdRIl(3);
                } else if (nghVD4tWN.q3BipwRCk(iiGwOFFnr, nghVD4tWN.tGV7Q6urW)) {
                    ksLrMHgEz kslrmhgez9 = SBy3PdRIl.J4Ux7ym32;
                    ksLrMHgEz kslrmhgez10 = SBy3PdRIl.J4Ux7ym32;
                    sBy3PdRIl2 = new SBy3PdRIl(5);
                } else if (nghVD4tWN.q3BipwRCk(iiGwOFFnr, nghVD4tWN.dIocxURUo)) {
                    ksLrMHgEz kslrmhgez11 = SBy3PdRIl.J4Ux7ym32;
                    ksLrMHgEz kslrmhgez12 = SBy3PdRIl.J4Ux7ym32;
                    sBy3PdRIl2 = new SBy3PdRIl(6);
                } else {
                    if (nghVD4tWN.q3BipwRCk(iiGwOFFnr, nghVD4tWN.GPLPRo6go)) {
                        z = true;
                    } else {
                        z = nghVD4tWN.q3BipwRCk(iiGwOFFnr, nghVD4tWN.yWvV4ePLl);
                    }
                    if (z) {
                        z2 = true;
                    } else {
                        z2 = nghVD4tWN.q3BipwRCk(iiGwOFFnr, nghVD4tWN.vPSbyrYWX);
                    }
                    if (z2) {
                        ksLrMHgEz kslrmhgez13 = SBy3PdRIl.J4Ux7ym32;
                        ksLrMHgEz kslrmhgez14 = SBy3PdRIl.J4Ux7ym32;
                        sBy3PdRIl2 = new SBy3PdRIl(7);
                    } else {
                        if (!nghVD4tWN.q3BipwRCk(iiGwOFFnr, nghVD4tWN.J4Ux7ym32)) {
                            z3 = nghVD4tWN.q3BipwRCk(iiGwOFFnr, nghVD4tWN.oon79WMrY);
                        }
                        if (z3) {
                            ksLrMHgEz kslrmhgez15 = SBy3PdRIl.J4Ux7ym32;
                            ksLrMHgEz kslrmhgez16 = SBy3PdRIl.J4Ux7ym32;
                            sBy3PdRIl2 = new SBy3PdRIl(8);
                        } else {
                            sBy3PdRIl = null;
                        }
                    }
                }
                sBy3PdRIl = sBy3PdRIl2;
            }
            if (sBy3PdRIl != null) {
                int Puu3Rhg4F = WAflFGuGp.Puu3Rhg4F(keyEvent);
                ksLrMHgEz kslrmhgez17 = le9Z8LIS5.q3BipwRCk;
                ksLrMHgEz kslrmhgez18 = le9Z8LIS5.q3BipwRCk;
                if (le9Z8LIS5.q3BipwRCk(Puu3Rhg4F, 2)) {
                    return Boolean.valueOf(((EBke9S31I) AndroidComposeView.this.getFocusManager()).J4Ux7ym32(sBy3PdRIl.q3BipwRCk));
                }
            }
            return Boolean.FALSE;
        }
    }

    /* loaded from: classes.dex */
    public static final class s7MlVynBG implements jz2wLk9jK {
        public s7MlVynBG() {
            AndroidComposeView.this = r1;
        }
    }

    public AndroidComposeView(Context context) {
        super(context);
        JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
        this.PSTqBLTET = BBVaGLNaU.q3BipwRCk(context);
        Q4TFMtvSV q4TFMtvSV = CBcUvsHpG.Bhmn1KIah;
        CBcUvsHpG cBcUvsHpG = new CBcUvsHpG(CBcUvsHpG.PSTqBLTET.addAndGet(1), false, false, PMYI4lLJM.kmSgne1rO);
        EBke9S31I eBke9S31I = new EBke9S31I(null, 1);
        this.MzoOEjc4X = eBke9S31I;
        Awlb99mXV awlb99mXV = new Awlb99mXV(new qhPEQQaQ4(), null);
        this.qVUwofr5s = awlb99mXV;
        pLYbCSTk0 plybcstk0 = new pLYbCSTk0(false);
        plybcstk0.mUqPm6GBh(Zp6BB9iOY.J4Ux7ym32);
        int i = BgIsSUB3d.Puu3Rhg4F;
        plybcstk0.NyWTwPF6V(pz7YPhQTU.i8XZMQc6Z(cBcUvsHpG, eBke9S31I.q3BipwRCk).WaUP0CF08(awlb99mXV));
        plybcstk0.AqaWJg0b4(getDensity());
        this.dXrmkklc8 = plybcstk0;
        Tpuv1V0a9 tpuv1V0a9 = new Tpuv1V0a9(this);
        this.sk5s77z6Q = tpuv1V0a9;
        this.AqaWJg0b4 = new iEPfl89zU(context);
        this.mUqPm6GBh = new OHS7Jvxri(context);
        this.EBQXiIPmm = new wDfIorp2q(ViewConfiguration.get(context));
        joOFKdxvJ joofkdxvj = ZtJSMDYDl.J4Ux7ym32;
        int i2 = 2;
        LCXryTULd lCXryTULd = new LCXryTULd(this);
        this.kktL0P5MG = lCXryTULd;
        PmanMZxiM pmanMZxiM = Updw121tb.q3BipwRCk;
        this.KBYw84i3W = (aY3UdkO3G) ((AdUPdUuqH) Updw121tb.q3BipwRCk).IytU16YUK(lCXryTULd);
        this.INnK5Rew6 = new THtcUO7dj(context);
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        BFRsKhrQv bFRsKhrQv = BFRsKhrQv.Ltr;
        if (layoutDirection != 0 && layoutDirection == 1) {
            bFRsKhrQv = BFRsKhrQv.Rtl;
        }
        this.SuKhTJIQc = u51fgFYkV.dIocxURUo(bFRsKhrQv, null, 2, null);
        this.ln3nf7LH3 = new D7JlMB0DC(this);
        this.Dr7UqlxEV = new sQduB7jbp(isInTouchMode() ? 1 : i2, new mhl5lIdbQ(), null);
        this.M66hQ219i = new tEqEOtm8X(this);
        this.buPcffgdD = new PlegqbMSA(6);
        this.KlYagMRWx = new WfopS3efW();
        this.lqFHPHdW3 = new dNif5KqqH();
        setWillNotDraw(false);
        setFocusable(true);
        mSdY2IgoN.q3BipwRCk.q3BipwRCk(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        setTransitionGroup(true);
        IuQbWntsc.MzoOEjc4X(this, tpuv1V0a9);
        getRoot().q3BipwRCk(this);
        this.YmNRDyka4 = new s7MlVynBG();
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public static /* synthetic */ void getTextInputService$annotations() {
    }

    private void setLayoutDirection(BFRsKhrQv bFRsKhrQv) {
        ((prCJwNx2x) this.SuKhTJIQc).CBQ5d1kRq(bFRsKhrQv);
    }

    private final void setViewTreeOwners(RG2GI7LDp rG2GI7LDp) {
        ((prCJwNx2x) this.n4UIOvAko).CBQ5d1kRq(rG2GI7LDp);
    }

    public void Bhmn1KIah() {
        Tpuv1V0a9 tpuv1V0a9 = this.sk5s77z6Q;
        tpuv1V0a9.MzoOEjc4X = true;
        if (tpuv1V0a9.Eeka1udhb() && !tpuv1V0a9.ixWaw2akD) {
            tpuv1V0a9.ixWaw2akD = true;
            tpuv1V0a9.GPLPRo6go.post(tpuv1V0a9.sk5s77z6Q);
        }
    }

    public final void CBQ5d1kRq(H8Cq8Y88s h8Cq8Y88s, boolean z) {
        List list;
        if (z) {
            if (!this.iMyQMM6Qj) {
                list = this.i8XZMQc6Z;
            } else {
                list = this.dfpT1j18n;
                if (list == null) {
                    list = new ArrayList();
                    this.dfpT1j18n = list;
                }
            }
            list.add(h8Cq8Y88s);
        } else if (!this.iMyQMM6Qj && !this.i8XZMQc6Z.remove(h8Cq8Y88s)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public final void Eeka1udhb(pLYbCSTk0 plybcstk0) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (this.QNqj6nIzv && plybcstk0 != null) {
                while (plybcstk0 != null && plybcstk0.vNtjxmzUM == LBUvXIUJ7.InMeasureBlock) {
                    plybcstk0 = plybcstk0.oon79WMrY();
                }
                if (plybcstk0 == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() == 0 || getHeight() == 0) {
                requestLayout();
            } else {
                invalidate();
            }
        }
    }

    public final void GPLPRo6go(pLYbCSTk0 plybcstk0) {
        plybcstk0.ilHKhw3Yw();
        pnuAOe8oh CBQ5d1kRq = plybcstk0.CBQ5d1kRq();
        int i = CBQ5d1kRq.Bhmn1KIah;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = CBQ5d1kRq.CBQ5d1kRq;
            do {
                GPLPRo6go((pLYbCSTk0) objArr[i2]);
                i2++;
            } while (i2 < i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        throw new java.lang.NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void J4Ux7ym32() {
        /*
        // Method dump skipped, instructions count: 206
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.J4Ux7ym32():void");
    }

    public final void MzoOEjc4X() {
        if (!this.ziwPzaoF3) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.zHl31GGXU) {
                this.zHl31GGXU = currentAnimationTimeMillis;
                p20sE4qqm.dIocxURUo(this.j22ftfeNI);
                ixWaw2akD(this, this.j22ftfeNI);
                BBVaGLNaU.IytU16YUK(this.j22ftfeNI, this.QSbMsHU5X);
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                view.getLocationOnScreen(this.juJ6pnCpu);
                int[] iArr = this.juJ6pnCpu;
                view.getLocationInWindow(iArr);
                int[] iArr2 = this.juJ6pnCpu;
                this.wIZEdYHUn = ODug2UCW1.dIocxURUo(((float) iArr[0]) - ((float) iArr2[0]), ((float) iArr[1]) - ((float) iArr2[1]));
            }
        }
    }

    public final void PSTqBLTET(float[] fArr, float f, float f2) {
        p20sE4qqm.dIocxURUo(this.L4EwGfXiQ);
        p20sE4qqm.kCA6Zs9sL(this.L4EwGfXiQ, f, f2, 0.0f, 4);
        Updw121tb.q3BipwRCk(fArr, this.L4EwGfXiQ);
    }

    public final void Puu3Rhg4F(pLYbCSTk0 plybcstk0) {
        this.igRQEZxnW.iiGwOFFnr(plybcstk0);
        pnuAOe8oh CBQ5d1kRq = plybcstk0.CBQ5d1kRq();
        int i = CBQ5d1kRq.Bhmn1KIah;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = CBQ5d1kRq.CBQ5d1kRq;
            do {
                Puu3Rhg4F((pLYbCSTk0) objArr[i2]);
                i2++;
            } while (i2 < i);
        }
    }

    public final void RG6kpfv3v(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int i2 = 0;
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount != 0) {
            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
            for (int i3 = 0; i3 < pointerCount; i3++) {
                pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
            }
            MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
            for (int i4 = 0; i4 < pointerCount; i4++) {
                pointerCoordsArr[i4] = new MotionEvent.PointerCoords();
            }
            if (pointerCount > 0) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    int i7 = ((actionIndex < 0 || i5 < actionIndex) ? 0 : 1) + i5;
                    motionEvent.getPointerProperties(i7, pointerPropertiesArr[i5]);
                    motionEvent.getPointerCoords(i7, pointerCoordsArr[i5]);
                    if (i6 >= pointerCount) {
                        break;
                    }
                    i5 = i6;
                }
            }
            if (!z) {
                i2 = motionEvent.getButtonState();
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), i2, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
            this.IytU16YUK.qVUwofr5s(this.cAwN510t2.q3BipwRCk(obtain, this), this, true);
            obtain.recycle();
        }
    }

    @Override // android.view.View
    public void autofill(SparseArray sparseArray) {
        int size;
        kVHvlpsMs kvhvlpsms = this.qFBXIgpia;
        if (kvhvlpsms != null && (size = sparseArray.size()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                int keyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
                eut9mmvYo eut9mmvyo = eut9mmvYo.q3BipwRCk;
                if (eut9mmvyo.dIocxURUo(autofillValue)) {
                    mS4pA2jQ7 ms4pa2jq7 = kvhvlpsms.J4Ux7ym32;
                    eut9mmvyo.yWvV4ePLl(autofillValue).toString();
                    K6PL0z3I0.q3BipwRCk(ms4pa2jq7.q3BipwRCk.get(Integer.valueOf(keyAt)));
                } else if (eut9mmvyo.J4Ux7ym32(autofillValue)) {
                    throw new zEm3MQbi0("An operation is not implemented: b/138604541: Add onFill() callback for date");
                } else if (eut9mmvyo.tGV7Q6urW(autofillValue)) {
                    throw new zEm3MQbi0("An operation is not implemented: b/138604541: Add onFill() callback for list");
                } else if (eut9mmvyo.kCA6Zs9sL(autofillValue)) {
                    throw new zEm3MQbi0("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
                if (i2 < size) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        return this.sk5s77z6Q.vPSbyrYWX(false, i, this.CBQ5d1kRq);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return this.sk5s77z6Q.vPSbyrYWX(true, i, this.CBQ5d1kRq);
    }

    public final n4f84B5OG dIocxURUo(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return new n4f84B5OG(0, Integer.valueOf(size));
        }
        if (mode == 0) {
            return new n4f84B5OG(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return new n4f84B5OG(Integer.valueOf(size), Integer.valueOf(size));
        }
        throw new IllegalStateException();
    }

    public long dXrmkklc8(long j) {
        MzoOEjc4X();
        return p20sE4qqm.J4Ux7ym32(this.QSbMsHU5X, ODug2UCW1.dIocxURUo(bRgfgYIQX.tGV7Q6urW(j) - bRgfgYIQX.tGV7Q6urW(this.wIZEdYHUn), bRgfgYIQX.dIocxURUo(j) - bRgfgYIQX.dIocxURUo(this.wIZEdYHUn)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int size;
        if (!isAttachedToWindow()) {
            GPLPRo6go(getRoot());
        }
        ODug2UCW1.qFBXIgpia(this, false, 1, null);
        this.iMyQMM6Qj = true;
        iFKnyAZAM ifknyazam = this.Eeka1udhb;
        Object obj = ifknyazam.kmSgne1rO;
        Canvas canvas2 = ((YSo0hTREC) obj).q3BipwRCk;
        ((YSo0hTREC) obj).q3BipwRCk = canvas;
        getRoot().V9LQMKGJe.ilHKhw3Yw.QSbMsHU5X((YSo0hTREC) obj);
        ((YSo0hTREC) ifknyazam.kmSgne1rO).q3BipwRCk = canvas2;
        if ((!this.i8XZMQc6Z.isEmpty()) && (size = this.i8XZMQc6Z.size()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                ((H8Cq8Y88s) this.i8XZMQc6Z.get(i)).kCA6Zs9sL();
                if (i2 >= size) {
                    break;
                }
                i = i2;
            }
        }
        Kfj0pfb90 kfj0pfb90 = iUgWrj1f5.WaUP0CF08;
        if (iUgWrj1f5.IytU16YUK) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.i8XZMQc6Z.clear();
        this.iMyQMM6Qj = false;
        List list = this.dfpT1j18n;
        if (list != null) {
            this.i8XZMQc6Z.addAll(list);
            list.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e3, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x00e7;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012c A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean dispatchHoverEvent(android.view.MotionEvent r10) {
        /*
        // Method dump skipped, instructions count: 310
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KB2jjcOAK MzoOEjc4X;
        jgMsl7cgu XYT7vJqNO;
        if (!isFocused()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        jgMsl7cgu jgmsl7cgu = this.qVUwofr5s.Bhmn1KIah;
        jgMsl7cgu jgmsl7cgu2 = null;
        if (jgmsl7cgu == null) {
            jgmsl7cgu = null;
        }
        KB2jjcOAK DuuXfa7LE = jgmsl7cgu.DuuXfa7LE();
        if (!(DuuXfa7LE == null || (MzoOEjc4X = ODug2UCW1.MzoOEjc4X(DuuXfa7LE)) == null || (XYT7vJqNO = MzoOEjc4X.MzoOEjc4X.o4LF8RkoQ.XYT7vJqNO()) == MzoOEjc4X)) {
            jgmsl7cgu2 = XYT7vJqNO;
        }
        if (jgmsl7cgu2 == null) {
            throw new IllegalStateException("KeyEvent can't be processed because this key input node is not active.".toString());
        } else if (jgmsl7cgu2.pwwzaxl9D(keyEvent)) {
            return true;
        } else {
            return jgmsl7cgu2.D91ZKn9BG(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (yWvV4ePLl(motionEvent)) {
            return false;
        }
        int iiGwOFFnr = iiGwOFFnr(motionEvent);
        if ((iiGwOFFnr & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (iiGwOFFnr & 1) != 0;
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return kCA6Zs9sL(i, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // con.jRWr6Yc4S
    public OHS7Jvxri getAccessibilityManager() {
        return this.mUqPm6GBh;
    }

    public final LdCs16gwx getAndroidViewsHandler$ui_release() {
        if (this.i0Zug1mVk == null) {
            LdCs16gwx ldCs16gwx = new LdCs16gwx(getContext());
            this.i0Zug1mVk = ldCs16gwx;
            addView(ldCs16gwx);
        }
        return this.i0Zug1mVk;
    }

    @Override // con.jRWr6Yc4S
    public dK8imq773 getAutofill() {
        return this.qFBXIgpia;
    }

    @Override // con.jRWr6Yc4S
    public mS4pA2jQ7 getAutofillTree() {
        return this.WaUP0CF08;
    }

    @Override // con.jRWr6Yc4S
    public iEPfl89zU getClipboardManager() {
        return this.AqaWJg0b4;
    }

    public final PmanMZxiM getConfigurationChangeObserver() {
        return this.CpG0imbht;
    }

    @Override // con.jRWr6Yc4S
    public AU29aHa4X getDensity() {
        return this.PSTqBLTET;
    }

    @Override // con.jRWr6Yc4S
    public VQ5lQYeWH getFocusManager() {
        return this.MzoOEjc4X;
    }

    @Override // con.jRWr6Yc4S
    public C2cgp32t9 getFontLoader() {
        return this.INnK5Rew6;
    }

    @Override // con.jRWr6Yc4S
    public tcFbS2CQx getHapticFeedBack() {
        return this.ln3nf7LH3;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return !this.igRQEZxnW.J4Ux7ym32.tGV7Q6urW();
    }

    @Override // con.jRWr6Yc4S
    public s2CbOR66h getInputModeManager() {
        return this.Dr7UqlxEV;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.zHl31GGXU;
    }

    @Override // android.view.ViewParent, android.view.View, con.jRWr6Yc4S
    public BFRsKhrQv getLayoutDirection() {
        return (BFRsKhrQv) this.SuKhTJIQc.getValue();
    }

    @Override // con.jRWr6Yc4S
    public long getMeasureIteration() {
        cjQ255nrQ cjq255nrq = this.igRQEZxnW;
        if (cjq255nrq.tGV7Q6urW) {
            return cjq255nrq.kCA6Zs9sL;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    @Override // con.jRWr6Yc4S
    public jz2wLk9jK getPointerIconService() {
        return this.YmNRDyka4;
    }

    public pLYbCSTk0 getRoot() {
        return this.dXrmkklc8;
    }

    public ZxiP1t48m getRootForTest() {
        return this.RG6kpfv3v;
    }

    public qe4AUqI9T getSemanticsOwner() {
        return this.ixWaw2akD;
    }

    @Override // con.jRWr6Yc4S
    public HXRw132ar getSharedDrawScope() {
        return this.Bhmn1KIah;
    }

    @Override // con.jRWr6Yc4S
    public boolean getShowLayoutBounds() {
        return this.vNtjxmzUM;
    }

    @Override // con.jRWr6Yc4S
    public OIP2vionU getSnapshotObserver() {
        return this.NyWTwPF6V;
    }

    @Override // con.jRWr6Yc4S
    public aY3UdkO3G getTextInputService() {
        return this.KBYw84i3W;
    }

    @Override // con.jRWr6Yc4S
    public bWetWC3NJ getTextToolbar() {
        return this.M66hQ219i;
    }

    public View getView() {
        return this;
    }

    @Override // con.jRWr6Yc4S
    public fCkNY70T9 getViewConfiguration() {
        return this.EBQXiIPmm;
    }

    public final RG2GI7LDp getViewTreeOwners() {
        return (RG2GI7LDp) this.n4UIOvAko.getValue();
    }

    @Override // con.jRWr6Yc4S
    public KyeAEIfPn getWindowInfo() {
        return this.ilHKhw3Yw;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098 A[Catch: all -> 0x0102, TryCatch #1 {all -> 0x0107, blocks: (B:3:0x0006, B:62:0x00f5, B:4:0x0017, B:6:0x0024, B:13:0x0036, B:20:0x0047, B:24:0x0055, B:27:0x005a, B:37:0x006e, B:41:0x0081, B:43:0x0089, B:46:0x0098, B:47:0x009b, B:49:0x00a9, B:50:0x00b3, B:52:0x00b9, B:55:0x00c5, B:58:0x00ca, B:59:0x00ce, B:60:0x00d5), top: B:68:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a9 A[Catch: all -> 0x0102, TryCatch #1 {all -> 0x0107, blocks: (B:3:0x0006, B:62:0x00f5, B:4:0x0017, B:6:0x0024, B:13:0x0036, B:20:0x0047, B:24:0x0055, B:27:0x005a, B:37:0x006e, B:41:0x0081, B:43:0x0089, B:46:0x0098, B:47:0x009b, B:49:0x00a9, B:50:0x00b3, B:52:0x00b9, B:55:0x00c5, B:58:0x00ca, B:59:0x00ce, B:60:0x00d5), top: B:68:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d5 A[Catch: all -> 0x0102, TRY_LEAVE, TryCatch #1 {all -> 0x0107, blocks: (B:3:0x0006, B:62:0x00f5, B:4:0x0017, B:6:0x0024, B:13:0x0036, B:20:0x0047, B:24:0x0055, B:27:0x005a, B:37:0x006e, B:41:0x0081, B:43:0x0089, B:46:0x0098, B:47:0x009b, B:49:0x00a9, B:50:0x00b3, B:52:0x00b9, B:55:0x00c5, B:58:0x00ca, B:59:0x00ce, B:60:0x00d5), top: B:68:0x0006 }] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final int iiGwOFFnr(android.view.MotionEvent r15) {
        /*
        // Method dump skipped, instructions count: 267
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.iiGwOFFnr(android.view.MotionEvent):int");
    }

    public final void ilHKhw3Yw(MotionEvent motionEvent) {
        this.zHl31GGXU = AnimationUtils.currentAnimationTimeMillis();
        p20sE4qqm.dIocxURUo(this.j22ftfeNI);
        ixWaw2akD(this, this.j22ftfeNI);
        BBVaGLNaU.IytU16YUK(this.j22ftfeNI, this.QSbMsHU5X);
        long J4Ux7ym32 = p20sE4qqm.J4Ux7ym32(this.j22ftfeNI, ODug2UCW1.dIocxURUo(motionEvent.getX(), motionEvent.getY()));
        this.wIZEdYHUn = ODug2UCW1.dIocxURUo(motionEvent.getRawX() - bRgfgYIQX.tGV7Q6urW(J4Ux7ym32), motionEvent.getRawY() - bRgfgYIQX.dIocxURUo(J4Ux7ym32));
    }

    public final void ixWaw2akD(View view, float[] fArr) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            ixWaw2akD((View) parent, fArr);
            PSTqBLTET(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()));
            PSTqBLTET(fArr, (float) view.getLeft(), (float) view.getTop());
        } else {
            view.getLocationInWindow(this.juJ6pnCpu);
            PSTqBLTET(fArr, -((float) view.getScrollX()), -((float) view.getScrollY()));
            int[] iArr = this.juJ6pnCpu;
            PSTqBLTET(fArr, (float) iArr[0], (float) iArr[1]);
        }
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            ODug2UCW1.i0Zug1mVk(this.L4EwGfXiQ, matrix);
            Updw121tb.q3BipwRCk(fArr, this.L4EwGfXiQ);
        }
    }

    public final View kCA6Zs9sL(int i, View view) {
        ViewGroup viewGroup;
        int childCount;
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        int i2 = 0;
        Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (anXlDk6fV.tGV7Q6urW(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i))) {
            return view;
        }
        if (!(view instanceof ViewGroup) || (childCount = (viewGroup = (ViewGroup) view).getChildCount()) <= 0) {
            return null;
        }
        while (true) {
            int i3 = i2 + 1;
            View kCA6Zs9sL = kCA6Zs9sL(i, viewGroup.getChildAt(i2));
            if (kCA6Zs9sL != null) {
                return kCA6Zs9sL;
            }
            if (i3 >= childCount) {
                return null;
            }
            i2 = i3;
        }
    }

    public void kmSgne1rO(pLYbCSTk0 plybcstk0) {
        Tpuv1V0a9 tpuv1V0a9 = this.sk5s77z6Q;
        tpuv1V0a9.MzoOEjc4X = true;
        if (tpuv1V0a9.Eeka1udhb()) {
            tpuv1V0a9.dXrmkklc8(plybcstk0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        androidx.lifecycle.mhl5lIdbQ GPLPRo6go;
        BgHiMFrEI bgHiMFrEI;
        super.onAttachedToWindow();
        Puu3Rhg4F(getRoot());
        GPLPRo6go(getRoot());
        getSnapshotObserver().q3BipwRCk.tGV7Q6urW();
        kVHvlpsMs kvhvlpsms = this.qFBXIgpia;
        if (kvhvlpsms != null) {
            RCIIpuNjf.q3BipwRCk.q3BipwRCk(kvhvlpsms);
        }
        BgHiMFrEI yWvV4ePLl = pA5wCkne4.yWvV4ePLl(this);
        XHpudBVT5 oon79WMrY = pA5wCkne4.oon79WMrY(this);
        RG2GI7LDp viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || !(yWvV4ePLl == null || oon79WMrY == null || (yWvV4ePLl == (bgHiMFrEI = viewTreeOwners.q3BipwRCk) && oon79WMrY == bgHiMFrEI))) {
            if (yWvV4ePLl == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            } else if (oon79WMrY != null) {
                if (!(viewTreeOwners == null || (GPLPRo6go = viewTreeOwners.q3BipwRCk.GPLPRo6go()) == null)) {
                    N0a4Shkkl n0a4Shkkl = (N0a4Shkkl) GPLPRo6go;
                    n0a4Shkkl.dIocxURUo("removeObserver");
                    n0a4Shkkl.J4Ux7ym32.Puu3Rhg4F(this);
                }
                yWvV4ePLl.GPLPRo6go().q3BipwRCk(this);
                RG2GI7LDp rG2GI7LDp = new RG2GI7LDp(yWvV4ePLl, oon79WMrY);
                setViewTreeOwners(rG2GI7LDp);
                PmanMZxiM pmanMZxiM = this.OpLJtmvFM;
                if (pmanMZxiM != null) {
                    pmanMZxiM.IytU16YUK(rG2GI7LDp);
                }
                this.OpLJtmvFM = null;
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
        }
        getViewTreeOwners().q3BipwRCk.GPLPRo6go().q3BipwRCk(this);
        getViewTreeObserver().addOnGlobalLayoutListener(this.BL4OzhZBd);
        getViewTreeObserver().addOnScrollChangedListener(this.DuuXfa7LE);
        getViewTreeObserver().addOnTouchModeChangeListener(this.XYT7vJqNO);
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        return this.kktL0P5MG.tGV7Q6urW;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.PSTqBLTET = BBVaGLNaU.q3BipwRCk(getContext());
        this.CpG0imbht.IytU16YUK(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0104  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r14) {
        /*
        // Method dump skipped, instructions count: 342
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.lifecycle.mhl5lIdbQ GPLPRo6go;
        super.onDetachedFromWindow();
        OIP2vionU snapshotObserver = getSnapshotObserver();
        Q2LDBN4BW q2ldbn4bw = snapshotObserver.q3BipwRCk.kCA6Zs9sL;
        if (q2ldbn4bw != null) {
            ((WvYaaMLyO) q2ldbn4bw).q3BipwRCk();
        }
        snapshotObserver.q3BipwRCk.q3BipwRCk();
        RG2GI7LDp viewTreeOwners = getViewTreeOwners();
        if (!(viewTreeOwners == null || (GPLPRo6go = viewTreeOwners.q3BipwRCk.GPLPRo6go()) == null)) {
            N0a4Shkkl n0a4Shkkl = (N0a4Shkkl) GPLPRo6go;
            n0a4Shkkl.dIocxURUo("removeObserver");
            n0a4Shkkl.J4Ux7ym32.Puu3Rhg4F(this);
        }
        kVHvlpsMs kvhvlpsms = this.qFBXIgpia;
        if (kvhvlpsms != null) {
            RCIIpuNjf.q3BipwRCk.J4Ux7ym32(kvhvlpsms);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.BL4OzhZBd);
        getViewTreeObserver().removeOnScrollChangedListener(this.DuuXfa7LE);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.XYT7vJqNO);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        Log.d("Compose Focus", "Owner FocusChanged(" + z + ')');
        EBke9S31I eBke9S31I = this.MzoOEjc4X;
        if (z) {
            PKYIHi40H pKYIHi40H = eBke9S31I.q3BipwRCk;
            if (pKYIHi40H.CBQ5d1kRq == ftmnXRQmW.Inactive) {
                pKYIHi40H.CBQ5d1kRq = ftmnXRQmW.Active;
                return;
            }
            return;
        }
        p62TZmTyO.qVUwofr5s(eBke9S31I.q3BipwRCk.tGV7Q6urW(), true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.V9LQMKGJe = null;
        sk5s77z6Q();
        if (this.i0Zug1mVk != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                Puu3Rhg4F(getRoot());
            }
            n4f84B5OG dIocxURUo = dIocxURUo(i);
            int intValue = ((Number) dIocxURUo.CBQ5d1kRq).intValue();
            int intValue2 = ((Number) dIocxURUo.kmSgne1rO).intValue();
            n4f84B5OG dIocxURUo2 = dIocxURUo(i2);
            long q3BipwRCk = dnBSj5uJN.q3BipwRCk(intValue, intValue2, ((Number) dIocxURUo2.CBQ5d1kRq).intValue(), ((Number) dIocxURUo2.kmSgne1rO).intValue());
            K5PjwoFCN k5PjwoFCN = this.V9LQMKGJe;
            if (k5PjwoFCN == null) {
                this.V9LQMKGJe = new K5PjwoFCN(q3BipwRCk);
                this.QNqj6nIzv = false;
            } else if (!K5PjwoFCN.J4Ux7ym32(k5PjwoFCN.q3BipwRCk, q3BipwRCk)) {
                this.QNqj6nIzv = true;
            }
            this.igRQEZxnW.GPLPRo6go(q3BipwRCk);
            this.igRQEZxnW.dIocxURUo(this.lqFHPHdW3);
            setMeasuredDimension(getRoot().V9LQMKGJe.CBQ5d1kRq, getRoot().V9LQMKGJe.kmSgne1rO);
            if (this.i0Zug1mVk != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().V9LQMKGJe.CBQ5d1kRq, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().V9LQMKGJe.kmSgne1rO, 1073741824));
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        kVHvlpsMs kvhvlpsms;
        if (!(viewStructure == null || (kvhvlpsms = this.qFBXIgpia) == null)) {
            int q3BipwRCk = u2NVWksuO.q3BipwRCk.q3BipwRCk(viewStructure, kvhvlpsms.J4Ux7ym32.q3BipwRCk.size());
            for (Map.Entry entry : kvhvlpsms.J4Ux7ym32.q3BipwRCk.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                K6PL0z3I0.q3BipwRCk(entry.getValue());
                u2NVWksuO u2nvwksuo = u2NVWksuO.q3BipwRCk;
                ViewStructure J4Ux7ym32 = u2nvwksuo.J4Ux7ym32(viewStructure, q3BipwRCk);
                if (J4Ux7ym32 == null) {
                    q3BipwRCk++;
                } else {
                    eut9mmvYo eut9mmvyo = eut9mmvYo.q3BipwRCk;
                    eut9mmvyo.GPLPRo6go(J4Ux7ym32, eut9mmvyo.q3BipwRCk(viewStructure), intValue);
                    u2nvwksuo.dIocxURUo(J4Ux7ym32, intValue, kvhvlpsms.q3BipwRCk.getContext().getPackageName(), null, null);
                    eut9mmvyo.Puu3Rhg4F(J4Ux7ym32, 1);
                    Objects.requireNonNull(null);
                    throw null;
                }
            }
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (this.kmSgne1rO) {
            PmanMZxiM pmanMZxiM = Updw121tb.q3BipwRCk;
            BFRsKhrQv bFRsKhrQv = BFRsKhrQv.Ltr;
            if (i != 0 && i == 1) {
                bFRsKhrQv = BFRsKhrQv.Rtl;
            }
            setLayoutDirection(bFRsKhrQv);
            this.MzoOEjc4X.J4Ux7ym32 = bFRsKhrQv;
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        ((prCJwNx2x) this.ilHKhw3Yw.q3BipwRCk).CBQ5d1kRq(Boolean.valueOf(z));
        super.onWindowFocusChanged(z);
    }

    public long oon79WMrY(long j) {
        MzoOEjc4X();
        long J4Ux7ym32 = p20sE4qqm.J4Ux7ym32(this.j22ftfeNI, j);
        return ODug2UCW1.dIocxURUo(bRgfgYIQX.tGV7Q6urW(this.wIZEdYHUn) + bRgfgYIQX.tGV7Q6urW(J4Ux7ym32), bRgfgYIQX.dIocxURUo(this.wIZEdYHUn) + bRgfgYIQX.dIocxURUo(J4Ux7ym32));
    }

    public final void q3BipwRCk(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        if (childCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof AndroidComposeView) {
                    ((AndroidComposeView) childAt).J4Ux7ym32();
                } else if (childAt instanceof ViewGroup) {
                    q3BipwRCk((ViewGroup) childAt);
                }
                if (i2 < childCount) {
                    i = i2;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean qVUwofr5s(H8Cq8Y88s h8Cq8Y88s) {
        if (this.o4LF8RkoQ != null) {
            Kfj0pfb90 kfj0pfb90 = iUgWrj1f5.WaUP0CF08;
            boolean z = iUgWrj1f5.IytU16YUK;
        }
        PlegqbMSA plegqbMSA = this.buPcffgdD;
        plegqbMSA.tGV7Q6urW();
        ((pnuAOe8oh) plegqbMSA.CBQ5d1kRq).J4Ux7ym32(new WeakReference(h8Cq8Y88s, (ReferenceQueue) plegqbMSA.kmSgne1rO));
        return true;
    }

    public final void setConfigurationChangeObserver(PmanMZxiM pmanMZxiM) {
        this.CpG0imbht = pmanMZxiM;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.zHl31GGXU = j;
    }

    public final void setOnViewTreeOwnersAvailable(PmanMZxiM pmanMZxiM) {
        RG2GI7LDp viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            pmanMZxiM.IytU16YUK(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.OpLJtmvFM = pmanMZxiM;
        }
    }

    @Override // con.jRWr6Yc4S
    public void setShowLayoutBounds(boolean z) {
        this.vNtjxmzUM = z;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void sk5s77z6Q() {
        getLocationOnScreen(this.juJ6pnCpu);
        boolean z = false;
        if (!(ZtJSMDYDl.q3BipwRCk(this.TyB1UUd72) == this.juJ6pnCpu[0] && ZtJSMDYDl.J4Ux7ym32(this.TyB1UUd72) == this.juJ6pnCpu[1])) {
            int[] iArr = this.juJ6pnCpu;
            this.TyB1UUd72 = dnBSj5uJN.tGV7Q6urW(iArr[0], iArr[1]);
            z = true;
        }
        this.igRQEZxnW.J4Ux7ym32(z);
    }

    public void vPSbyrYWX(boolean z) {
        if (this.igRQEZxnW.dIocxURUo(z ? this.lqFHPHdW3 : null)) {
            requestLayout();
        }
        this.igRQEZxnW.J4Ux7ym32(false);
    }

    public final boolean yWvV4ePLl(MotionEvent motionEvent) {
        return Float.isNaN(motionEvent.getX()) || Float.isNaN(motionEvent.getY()) || Float.isNaN(motionEvent.getRawX()) || Float.isNaN(motionEvent.getRawY());
    }
}
