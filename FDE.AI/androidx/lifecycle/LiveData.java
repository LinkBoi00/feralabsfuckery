package androidx.lifecycle;

import android.util.Log;
import android.view.View;
import androidx.lifecycle.LiveData.mhl5lIdbQ;
import androidx.lifecycle.mhl5lIdbQ;
import con.BgHiMFrEI;
import con.M5g57XBLr;
import con.VYOFNaM3n;
import con.WGohiwKSS;
import con.dtGksSk0f;
import con.fVMSvDhE6;
import con.rsLqYP5un;
import con.vfNFBCmCL;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class LiveData {
    public static final Object oon79WMrY = new Object();
    public boolean Puu3Rhg4F;
    public boolean dIocxURUo;
    public volatile Object iiGwOFFnr;
    public volatile Object kCA6Zs9sL;
    public boolean yWvV4ePLl;
    public final Object q3BipwRCk = new Object();
    public dtGksSk0f J4Ux7ym32 = new dtGksSk0f();
    public int tGV7Q6urW = 0;
    public int GPLPRo6go = -1;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends mhl5lIdbQ implements WGohiwKSS {
        public void J4Ux7ym32() {
            throw null;
        }

        public boolean dIocxURUo() {
            throw null;
        }

        @Override // con.WGohiwKSS
        public void tGV7Q6urW(BgHiMFrEI bgHiMFrEI, mhl5lIdbQ.RG2GI7LDp rG2GI7LDp) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public class RG2GI7LDp extends mhl5lIdbQ {
        public RG2GI7LDp(LiveData liveData, vfNFBCmCL vfnfbcmcl) {
            super(vfnfbcmcl);
        }

        @Override // androidx.lifecycle.LiveData.mhl5lIdbQ
        public boolean dIocxURUo() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class mhl5lIdbQ {
        public int Bhmn1KIah = -1;
        public final vfNFBCmCL CBQ5d1kRq;
        public boolean kmSgne1rO;

        public mhl5lIdbQ(vfNFBCmCL vfnfbcmcl) {
            LiveData.this = r1;
            this.CBQ5d1kRq = vfnfbcmcl;
        }

        public void J4Ux7ym32() {
        }

        public abstract boolean dIocxURUo();

        public void q3BipwRCk(boolean z) {
            if (z != this.kmSgne1rO) {
                this.kmSgne1rO = z;
                LiveData liveData = LiveData.this;
                int i = z ? 1 : -1;
                int i2 = liveData.tGV7Q6urW;
                liveData.tGV7Q6urW = i + i2;
                if (!liveData.dIocxURUo) {
                    liveData.dIocxURUo = true;
                    while (true) {
                        try {
                            int i3 = liveData.tGV7Q6urW;
                            if (i2 == i3) {
                                break;
                            }
                            i2 = i3;
                        } finally {
                            liveData.dIocxURUo = false;
                        }
                    }
                }
                if (this.kmSgne1rO) {
                    LiveData.this.tGV7Q6urW(this);
                }
            }
        }
    }

    public LiveData() {
        Object obj = oon79WMrY;
        this.iiGwOFFnr = obj;
        this.kCA6Zs9sL = obj;
    }

    public static void q3BipwRCk(String str) {
        if (!VYOFNaM3n.J4Ux7ym32().q3BipwRCk()) {
            throw new IllegalStateException(M5g57XBLr.q3BipwRCk("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void J4Ux7ym32(mhl5lIdbQ mhl5lidbq) {
        if (mhl5lidbq.kmSgne1rO) {
            if (!mhl5lidbq.dIocxURUo()) {
                mhl5lidbq.q3BipwRCk(false);
                return;
            }
            int i = mhl5lidbq.Bhmn1KIah;
            int i2 = this.GPLPRo6go;
            if (i < i2) {
                mhl5lidbq.Bhmn1KIah = i2;
                vfNFBCmCL vfnfbcmcl = mhl5lidbq.CBQ5d1kRq;
                Object obj = this.kCA6Zs9sL;
                rsLqYP5un.qhPEQQaQ4 qhpeqqaq4 = (rsLqYP5un.qhPEQQaQ4) vfnfbcmcl;
                Objects.requireNonNull(qhpeqqaq4);
                if (((BgHiMFrEI) obj) != null) {
                    rsLqYP5un rslqyp5un = rsLqYP5un.this;
                    if (rslqyp5un.M66hQ219i) {
                        View wIZEdYHUn = rslqyp5un.wIZEdYHUn();
                        if (wIZEdYHUn.getParent() != null) {
                            throw new IllegalStateException("DialogFragment can not be attached to a container view");
                        } else if (rsLqYP5un.this.KlYagMRWx != null) {
                            if (fVMSvDhE6.juJ6pnCpu(3)) {
                                Log.d("FragmentManager", "DialogFragment " + qhpeqqaq4 + " setting the content view on " + rsLqYP5un.this.KlYagMRWx);
                            }
                            rsLqYP5un.this.KlYagMRWx.setContentView(wIZEdYHUn);
                        }
                    }
                }
            }
        }
    }

    public void dIocxURUo(vfNFBCmCL vfnfbcmcl) {
        q3BipwRCk("observeForever");
        RG2GI7LDp rG2GI7LDp = new RG2GI7LDp(this, vfnfbcmcl);
        mhl5lIdbQ mhl5lidbq = (mhl5lIdbQ) this.J4Ux7ym32.GPLPRo6go(vfnfbcmcl, rG2GI7LDp);
        if (mhl5lidbq instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (mhl5lidbq == null) {
            rG2GI7LDp.q3BipwRCk(true);
        }
    }

    public void kCA6Zs9sL(vfNFBCmCL vfnfbcmcl) {
        q3BipwRCk("removeObserver");
        mhl5lIdbQ mhl5lidbq = (mhl5lIdbQ) this.J4Ux7ym32.Puu3Rhg4F(vfnfbcmcl);
        if (mhl5lidbq != null) {
            mhl5lidbq.J4Ux7ym32();
            mhl5lidbq.q3BipwRCk(false);
        }
    }

    public void tGV7Q6urW(mhl5lIdbQ mhl5lidbq) {
        if (this.Puu3Rhg4F) {
            this.yWvV4ePLl = true;
            return;
        }
        this.Puu3Rhg4F = true;
        do {
            this.yWvV4ePLl = false;
            if (mhl5lidbq == null) {
                dtGksSk0f.RG2GI7LDp kCA6Zs9sL = this.J4Ux7ym32.kCA6Zs9sL();
                while (kCA6Zs9sL.hasNext()) {
                    J4Ux7ym32((mhl5lIdbQ) ((Map.Entry) kCA6Zs9sL.next()).getValue());
                    if (this.yWvV4ePLl) {
                        break;
                    }
                }
            } else {
                J4Ux7ym32(mhl5lidbq);
                mhl5lidbq = null;
            }
        } while (this.yWvV4ePLl);
        this.Puu3Rhg4F = false;
    }
}
