package con;

import android.annotation.SuppressLint;
import androidx.lifecycle.aXI58Y1kr;
import androidx.lifecycle.mhl5lIdbQ;
import con.dtGksSk0f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes.dex */
public class N0a4Shkkl extends mhl5lIdbQ {
    public final WeakReference dIocxURUo;
    public pxM8OjpdZ J4Ux7ym32 = new pxM8OjpdZ();
    public int kCA6Zs9sL = 0;
    public boolean iiGwOFFnr = false;
    public boolean GPLPRo6go = false;
    public ArrayList Puu3Rhg4F = new ArrayList();
    public mhl5lIdbQ.EnumC0005mhl5lIdbQ tGV7Q6urW = mhl5lIdbQ.EnumC0005mhl5lIdbQ.INITIALIZED;
    public final boolean yWvV4ePLl = true;

    public N0a4Shkkl(BgHiMFrEI bgHiMFrEI) {
        this.dIocxURUo = new WeakReference(bgHiMFrEI);
    }

    public static mhl5lIdbQ.EnumC0005mhl5lIdbQ iiGwOFFnr(mhl5lIdbQ.EnumC0005mhl5lIdbQ mhl5lidbq, mhl5lIdbQ.EnumC0005mhl5lIdbQ mhl5lidbq2) {
        return (mhl5lidbq2 == null || mhl5lidbq2.compareTo(mhl5lidbq) >= 0) ? mhl5lidbq : mhl5lidbq2;
    }

    public final void GPLPRo6go(mhl5lIdbQ.EnumC0005mhl5lIdbQ mhl5lidbq) {
        if (this.tGV7Q6urW != mhl5lidbq) {
            this.tGV7Q6urW = mhl5lidbq;
            if (this.iiGwOFFnr || this.kCA6Zs9sL != 0) {
                this.GPLPRo6go = true;
                return;
            }
            this.iiGwOFFnr = true;
            yWvV4ePLl();
            this.iiGwOFFnr = false;
        }
    }

    @Override // androidx.lifecycle.mhl5lIdbQ
    public void J4Ux7ym32(mScwA0bsb mscwa0bsb) {
        dIocxURUo("removeObserver");
        this.J4Ux7ym32.Puu3Rhg4F(mscwa0bsb);
    }

    public final void Puu3Rhg4F() {
        ArrayList arrayList = this.Puu3Rhg4F;
        arrayList.remove(arrayList.size() - 1);
    }

    @SuppressLint({"RestrictedApi"})
    public final void dIocxURUo(String str) {
        if (this.yWvV4ePLl && !VYOFNaM3n.J4Ux7ym32().q3BipwRCk()) {
            throw new IllegalStateException(M5g57XBLr.q3BipwRCk("Method ", str, " must be called on the main thread"));
        }
    }

    public void kCA6Zs9sL(mhl5lIdbQ.RG2GI7LDp rG2GI7LDp) {
        dIocxURUo("handleLifecycleEvent");
        GPLPRo6go(rG2GI7LDp.q3BipwRCk());
    }

    @Override // androidx.lifecycle.mhl5lIdbQ
    public void q3BipwRCk(mScwA0bsb mscwa0bsb) {
        BgHiMFrEI bgHiMFrEI;
        dIocxURUo("addObserver");
        mhl5lIdbQ.EnumC0005mhl5lIdbQ mhl5lidbq = this.tGV7Q6urW;
        mhl5lIdbQ.EnumC0005mhl5lIdbQ mhl5lidbq2 = mhl5lIdbQ.EnumC0005mhl5lIdbQ.DESTROYED;
        if (mhl5lidbq != mhl5lidbq2) {
            mhl5lidbq2 = mhl5lIdbQ.EnumC0005mhl5lIdbQ.INITIALIZED;
        }
        aXI58Y1kr axi58y1kr = new aXI58Y1kr(mscwa0bsb, mhl5lidbq2);
        if (((aXI58Y1kr) this.J4Ux7ym32.GPLPRo6go(mscwa0bsb, axi58y1kr)) == null && (bgHiMFrEI = (BgHiMFrEI) this.dIocxURUo.get()) != null) {
            boolean z = this.kCA6Zs9sL != 0 || this.iiGwOFFnr;
            mhl5lIdbQ.EnumC0005mhl5lIdbQ tGV7Q6urW = tGV7Q6urW(mscwa0bsb);
            this.kCA6Zs9sL++;
            while (axi58y1kr.q3BipwRCk.compareTo(tGV7Q6urW) < 0 && this.J4Ux7ym32.MzoOEjc4X.containsKey(mscwa0bsb)) {
                this.Puu3Rhg4F.add(axi58y1kr.q3BipwRCk);
                mhl5lIdbQ.RG2GI7LDp J4Ux7ym32 = mhl5lIdbQ.RG2GI7LDp.J4Ux7ym32(axi58y1kr.q3BipwRCk);
                if (J4Ux7ym32 != null) {
                    axi58y1kr.q3BipwRCk(bgHiMFrEI, J4Ux7ym32);
                    Puu3Rhg4F();
                    tGV7Q6urW = tGV7Q6urW(mscwa0bsb);
                } else {
                    StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("no event up from ");
                    q3BipwRCk.append(axi58y1kr.q3BipwRCk);
                    throw new IllegalStateException(q3BipwRCk.toString());
                }
            }
            if (!z) {
                yWvV4ePLl();
            }
            this.kCA6Zs9sL--;
        }
    }

    public final mhl5lIdbQ.EnumC0005mhl5lIdbQ tGV7Q6urW(mScwA0bsb mscwa0bsb) {
        pxM8OjpdZ pxm8ojpdz = this.J4Ux7ym32;
        mhl5lIdbQ.EnumC0005mhl5lIdbQ mhl5lidbq = null;
        VbWI3BZ7c vbWI3BZ7c = pxm8ojpdz.MzoOEjc4X.containsKey(mscwa0bsb) ? ((VbWI3BZ7c) pxm8ojpdz.MzoOEjc4X.get(mscwa0bsb)).PSTqBLTET : null;
        mhl5lIdbQ.EnumC0005mhl5lIdbQ mhl5lidbq2 = vbWI3BZ7c != null ? ((aXI58Y1kr) vbWI3BZ7c.kmSgne1rO).q3BipwRCk : null;
        if (!this.Puu3Rhg4F.isEmpty()) {
            ArrayList arrayList = this.Puu3Rhg4F;
            mhl5lidbq = (mhl5lIdbQ.EnumC0005mhl5lIdbQ) arrayList.get(arrayList.size() - 1);
        }
        return iiGwOFFnr(iiGwOFFnr(this.tGV7Q6urW, mhl5lidbq2), mhl5lidbq);
    }

    public final void yWvV4ePLl() {
        mhl5lIdbQ.EnumC0005mhl5lIdbQ mhl5lidbq;
        BgHiMFrEI bgHiMFrEI = (BgHiMFrEI) this.dIocxURUo.get();
        if (bgHiMFrEI != null) {
            while (true) {
                pxM8OjpdZ pxm8ojpdz = this.J4Ux7ym32;
                boolean z = true;
                if (!(pxm8ojpdz.PSTqBLTET == 0 || (((aXI58Y1kr) pxm8ojpdz.CBQ5d1kRq.kmSgne1rO).q3BipwRCk == (mhl5lidbq = ((aXI58Y1kr) pxm8ojpdz.kmSgne1rO.kmSgne1rO).q3BipwRCk) && this.tGV7Q6urW == mhl5lidbq))) {
                    z = false;
                }
                this.GPLPRo6go = false;
                if (!z) {
                    if (this.tGV7Q6urW.compareTo(((aXI58Y1kr) pxm8ojpdz.CBQ5d1kRq.kmSgne1rO).q3BipwRCk) < 0) {
                        pxM8OjpdZ pxm8ojpdz2 = this.J4Ux7ym32;
                        E07C0EbJE e07C0EbJE = new E07C0EbJE(pxm8ojpdz2.kmSgne1rO, pxm8ojpdz2.CBQ5d1kRq);
                        pxm8ojpdz2.Bhmn1KIah.put(e07C0EbJE, Boolean.FALSE);
                        while (e07C0EbJE.hasNext() && !this.GPLPRo6go) {
                            Map.Entry entry = (Map.Entry) e07C0EbJE.next();
                            aXI58Y1kr axi58y1kr = (aXI58Y1kr) entry.getValue();
                            while (axi58y1kr.q3BipwRCk.compareTo(this.tGV7Q6urW) > 0 && !this.GPLPRo6go && this.J4Ux7ym32.contains((mScwA0bsb) entry.getKey())) {
                                int ordinal = axi58y1kr.q3BipwRCk.ordinal();
                                mhl5lIdbQ.RG2GI7LDp rG2GI7LDp = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : mhl5lIdbQ.RG2GI7LDp.ON_PAUSE : mhl5lIdbQ.RG2GI7LDp.ON_STOP : mhl5lIdbQ.RG2GI7LDp.ON_DESTROY;
                                if (rG2GI7LDp != null) {
                                    this.Puu3Rhg4F.add(rG2GI7LDp.q3BipwRCk());
                                    axi58y1kr.q3BipwRCk(bgHiMFrEI, rG2GI7LDp);
                                    Puu3Rhg4F();
                                } else {
                                    StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("no event down from ");
                                    q3BipwRCk.append(axi58y1kr.q3BipwRCk);
                                    throw new IllegalStateException(q3BipwRCk.toString());
                                }
                            }
                        }
                    }
                    VbWI3BZ7c vbWI3BZ7c = this.J4Ux7ym32.kmSgne1rO;
                    if (!this.GPLPRo6go && vbWI3BZ7c != null && this.tGV7Q6urW.compareTo(((aXI58Y1kr) vbWI3BZ7c.kmSgne1rO).q3BipwRCk) > 0) {
                        dtGksSk0f.RG2GI7LDp kCA6Zs9sL = this.J4Ux7ym32.kCA6Zs9sL();
                        while (kCA6Zs9sL.hasNext() && !this.GPLPRo6go) {
                            Map.Entry entry2 = (Map.Entry) kCA6Zs9sL.next();
                            aXI58Y1kr axi58y1kr2 = (aXI58Y1kr) entry2.getValue();
                            while (axi58y1kr2.q3BipwRCk.compareTo(this.tGV7Q6urW) < 0 && !this.GPLPRo6go && this.J4Ux7ym32.contains((mScwA0bsb) entry2.getKey())) {
                                this.Puu3Rhg4F.add(axi58y1kr2.q3BipwRCk);
                                mhl5lIdbQ.RG2GI7LDp J4Ux7ym32 = mhl5lIdbQ.RG2GI7LDp.J4Ux7ym32(axi58y1kr2.q3BipwRCk);
                                if (J4Ux7ym32 != null) {
                                    axi58y1kr2.q3BipwRCk(bgHiMFrEI, J4Ux7ym32);
                                    Puu3Rhg4F();
                                } else {
                                    StringBuilder q3BipwRCk2 = abGBwSu8x.q3BipwRCk("no event up from ");
                                    q3BipwRCk2.append(axi58y1kr2.q3BipwRCk);
                                    throw new IllegalStateException(q3BipwRCk2.toString());
                                }
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }
}
