package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.mhl5lIdbQ;
import con.BgHiMFrEI;
import con.N0a4Shkkl;
import con.Pqf3I9o09;
import con.TET2Qfhx1;
import con.WGohiwKSS;
import con.bvrtgBCLi;
import con.fVMSvDhE6;
import java.util.ArrayDeque;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    public final ArrayDeque J4Ux7ym32 = new ArrayDeque();
    public final Runnable q3BipwRCk;

    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements WGohiwKSS, bvrtgBCLi {
        public bvrtgBCLi Bhmn1KIah;
        public final mhl5lIdbQ CBQ5d1kRq;
        public final TET2Qfhx1 kmSgne1rO;

        public LifecycleOnBackPressedCancellable(mhl5lIdbQ mhl5lidbq, TET2Qfhx1 tET2Qfhx1) {
            OnBackPressedDispatcher.this = r1;
            this.CBQ5d1kRq = mhl5lidbq;
            this.kmSgne1rO = tET2Qfhx1;
            mhl5lidbq.q3BipwRCk(this);
        }

        @Override // con.bvrtgBCLi
        public void cancel() {
            N0a4Shkkl n0a4Shkkl = (N0a4Shkkl) this.CBQ5d1kRq;
            n0a4Shkkl.dIocxURUo("removeObserver");
            n0a4Shkkl.J4Ux7ym32.Puu3Rhg4F(this);
            this.kmSgne1rO.J4Ux7ym32.remove(this);
            bvrtgBCLi bvrtgbcli = this.Bhmn1KIah;
            if (bvrtgbcli != null) {
                bvrtgbcli.cancel();
                this.Bhmn1KIah = null;
            }
        }

        @Override // con.WGohiwKSS
        public void tGV7Q6urW(BgHiMFrEI bgHiMFrEI, mhl5lIdbQ.RG2GI7LDp rG2GI7LDp) {
            if (rG2GI7LDp == mhl5lIdbQ.RG2GI7LDp.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                TET2Qfhx1 tET2Qfhx1 = this.kmSgne1rO;
                onBackPressedDispatcher.J4Ux7ym32.add(tET2Qfhx1);
                Pqf3I9o09 pqf3I9o09 = new Pqf3I9o09(onBackPressedDispatcher, tET2Qfhx1);
                tET2Qfhx1.J4Ux7ym32.add(pqf3I9o09);
                this.Bhmn1KIah = pqf3I9o09;
            } else if (rG2GI7LDp == mhl5lIdbQ.RG2GI7LDp.ON_STOP) {
                bvrtgBCLi bvrtgbcli = this.Bhmn1KIah;
                if (bvrtgbcli != null) {
                    bvrtgbcli.cancel();
                }
            } else if (rG2GI7LDp == mhl5lIdbQ.RG2GI7LDp.ON_DESTROY) {
                cancel();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.q3BipwRCk = runnable;
    }

    public void J4Ux7ym32() {
        Iterator descendingIterator = this.J4Ux7ym32.descendingIterator();
        while (descendingIterator.hasNext()) {
            TET2Qfhx1 tET2Qfhx1 = (TET2Qfhx1) descendingIterator.next();
            if (tET2Qfhx1.q3BipwRCk) {
                fVMSvDhE6 fvmsvdhe6 = tET2Qfhx1.tGV7Q6urW;
                fvmsvdhe6.qFBXIgpia(true);
                if (fvmsvdhe6.Puu3Rhg4F.q3BipwRCk) {
                    fvmsvdhe6.n4UIOvAko();
                    return;
                } else {
                    fvmsvdhe6.GPLPRo6go.J4Ux7ym32();
                    return;
                }
            }
        }
        Runnable runnable = this.q3BipwRCk;
        if (runnable != null) {
            runnable.run();
        }
    }

    @SuppressLint({"LambdaLast"})
    public void q3BipwRCk(BgHiMFrEI bgHiMFrEI, TET2Qfhx1 tET2Qfhx1) {
        mhl5lIdbQ GPLPRo6go = bgHiMFrEI.GPLPRo6go();
        if (((N0a4Shkkl) GPLPRo6go).tGV7Q6urW != mhl5lIdbQ.EnumC0005mhl5lIdbQ.DESTROYED) {
            tET2Qfhx1.J4Ux7ym32.add(new LifecycleOnBackPressedCancellable(GPLPRo6go, tET2Qfhx1));
        }
    }
}
