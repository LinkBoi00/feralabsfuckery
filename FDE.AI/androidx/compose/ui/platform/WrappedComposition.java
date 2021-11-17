package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.mhl5lIdbQ;
import com.feravolt.preload.R;
import con.BgHiMFrEI;
import con.N0a4Shkkl;
import con.NqHYnWDI1;
import con.PmanMZxiM;
import con.WGohiwKSS;
import con.Wk9bO57s4;
import con.kkcQgCx5G;
import con.qih4lW99W;
import con.v0l3RHDWl;
import con.xpuSUT7Gh;
/* loaded from: classes.dex */
public final class WrappedComposition implements v0l3RHDWl, WGohiwKSS {
    public boolean Bhmn1KIah;
    public final AndroidComposeView CBQ5d1kRq;
    public kkcQgCx5G MzoOEjc4X = NqHYnWDI1.J4Ux7ym32;
    public mhl5lIdbQ PSTqBLTET;
    public final v0l3RHDWl kmSgne1rO;

    /* loaded from: classes.dex */
    public static final class RG2GI7LDp extends Wk9bO57s4 implements PmanMZxiM {
        public final /* synthetic */ kkcQgCx5G Bhmn1KIah;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RG2GI7LDp(kkcQgCx5G kkcqgcx5g) {
            super(1);
            WrappedComposition.this = r1;
            this.Bhmn1KIah = kkcqgcx5g;
        }

        @Override // con.PmanMZxiM
        public Object IytU16YUK(Object obj) {
            AndroidComposeView.RG2GI7LDp rG2GI7LDp = (AndroidComposeView.RG2GI7LDp) obj;
            if (!WrappedComposition.this.Bhmn1KIah) {
                mhl5lIdbQ GPLPRo6go = rG2GI7LDp.q3BipwRCk.GPLPRo6go();
                WrappedComposition wrappedComposition = WrappedComposition.this;
                wrappedComposition.MzoOEjc4X = this.Bhmn1KIah;
                if (wrappedComposition.PSTqBLTET == null) {
                    wrappedComposition.PSTqBLTET = GPLPRo6go;
                    GPLPRo6go.q3BipwRCk(wrappedComposition);
                } else {
                    if (((N0a4Shkkl) GPLPRo6go).tGV7Q6urW.compareTo(mhl5lIdbQ.EnumC0005mhl5lIdbQ.CREATED) >= 0) {
                        WrappedComposition wrappedComposition2 = WrappedComposition.this;
                        wrappedComposition2.kmSgne1rO.dIocxURUo(xpuSUT7Gh.nlGCs0NZs(-985537089, true, new qhPEQQaQ4(wrappedComposition2, this.Bhmn1KIah, 1)));
                    }
                }
            }
            return qih4lW99W.q3BipwRCk;
        }
    }

    public WrappedComposition(AndroidComposeView androidComposeView, v0l3RHDWl v0l3rhdwl) {
        this.CBQ5d1kRq = androidComposeView;
        this.kmSgne1rO = v0l3rhdwl;
        NqHYnWDI1 nqHYnWDI1 = NqHYnWDI1.q3BipwRCk;
    }

    @Override // con.v0l3RHDWl
    public boolean J4Ux7ym32() {
        return this.kmSgne1rO.J4Ux7ym32();
    }

    @Override // con.v0l3RHDWl
    public void dIocxURUo(kkcQgCx5G kkcqgcx5g) {
        this.CBQ5d1kRq.setOnViewTreeOwnersAvailable(new RG2GI7LDp(kkcqgcx5g));
    }

    @Override // con.v0l3RHDWl
    public boolean kCA6Zs9sL() {
        return this.kmSgne1rO.kCA6Zs9sL();
    }

    @Override // con.v0l3RHDWl
    public void q3BipwRCk() {
        if (!this.Bhmn1KIah) {
            this.Bhmn1KIah = true;
            this.CBQ5d1kRq.getView().setTag(R.id.wrapped_composition_tag, null);
            mhl5lIdbQ mhl5lidbq = this.PSTqBLTET;
            if (mhl5lidbq != null) {
                N0a4Shkkl n0a4Shkkl = (N0a4Shkkl) mhl5lidbq;
                n0a4Shkkl.dIocxURUo("removeObserver");
                n0a4Shkkl.J4Ux7ym32.Puu3Rhg4F(this);
            }
        }
        this.kmSgne1rO.q3BipwRCk();
    }

    @Override // con.WGohiwKSS
    public void tGV7Q6urW(BgHiMFrEI bgHiMFrEI, mhl5lIdbQ.RG2GI7LDp rG2GI7LDp) {
        if (rG2GI7LDp == mhl5lIdbQ.RG2GI7LDp.ON_DESTROY) {
            q3BipwRCk();
        } else if (rG2GI7LDp == mhl5lIdbQ.RG2GI7LDp.ON_CREATE && !this.Bhmn1KIah) {
            dIocxURUo(this.MzoOEjc4X);
        }
    }
}
