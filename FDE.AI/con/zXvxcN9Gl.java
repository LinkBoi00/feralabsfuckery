package con;

import android.util.Log;
import android.view.View;
import androidx.fragment.app.RG2GI7LDp;
import androidx.fragment.app.aXI58Y1kr;
import androidx.fragment.app.mhl5lIdbQ;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class zXvxcN9Gl {
    public mhl5lIdbQ J4Ux7ym32;
    public final RG2GI7LDp Puu3Rhg4F;
    public aXI58Y1kr q3BipwRCk;
    public final UxHHqhbTP tGV7Q6urW;
    public final List dIocxURUo = new ArrayList();
    public final HashSet kCA6Zs9sL = new HashSet();
    public boolean iiGwOFFnr = false;
    public boolean GPLPRo6go = false;

    public zXvxcN9Gl(aXI58Y1kr axi58y1kr, mhl5lIdbQ mhl5lidbq, RG2GI7LDp rG2GI7LDp, ce8tBZHr1 ce8tbzhr1) {
        UxHHqhbTP uxHHqhbTP = rG2GI7LDp.tGV7Q6urW;
        this.q3BipwRCk = axi58y1kr;
        this.J4Ux7ym32 = mhl5lidbq;
        this.tGV7Q6urW = uxHHqhbTP;
        ce8tbzhr1.J4Ux7ym32(new E7EzSrpdW(this));
        this.Puu3Rhg4F = rG2GI7LDp;
    }

    public void J4Ux7ym32() {
        if (!this.GPLPRo6go) {
            if (fVMSvDhE6.juJ6pnCpu(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.GPLPRo6go = true;
            for (Runnable runnable : this.dIocxURUo) {
                runnable.run();
            }
        }
        this.Puu3Rhg4F.vPSbyrYWX();
    }

    public void dIocxURUo() {
        if (this.J4Ux7ym32 == mhl5lIdbQ.ADDING) {
            UxHHqhbTP uxHHqhbTP = this.Puu3Rhg4F.tGV7Q6urW;
            View findFocus = uxHHqhbTP.EBQXiIPmm.findFocus();
            if (findFocus != null) {
                uxHHqhbTP.tGV7Q6urW().PSTqBLTET = findFocus;
                if (fVMSvDhE6.juJ6pnCpu(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + uxHHqhbTP);
                }
            }
            View wIZEdYHUn = this.tGV7Q6urW.wIZEdYHUn();
            if (wIZEdYHUn.getParent() == null) {
                this.Puu3Rhg4F.J4Ux7ym32();
                wIZEdYHUn.setAlpha(0.0f);
            }
            if (wIZEdYHUn.getAlpha() == 0.0f && wIZEdYHUn.getVisibility() == 0) {
                wIZEdYHUn.setVisibility(4);
            }
            rwMIknDWL rwmikndwl = uxHHqhbTP.j22ftfeNI;
            wIZEdYHUn.setAlpha(rwmikndwl == null ? 1.0f : rwmikndwl.Bhmn1KIah);
        }
    }

    public final void q3BipwRCk() {
        if (!this.iiGwOFFnr) {
            this.iiGwOFFnr = true;
            if (this.kCA6Zs9sL.isEmpty()) {
                J4Ux7ym32();
                return;
            }
            Iterator it = new ArrayList(this.kCA6Zs9sL).iterator();
            while (it.hasNext()) {
                ((ce8tBZHr1) it.next()).q3BipwRCk();
            }
        }
    }

    public final void tGV7Q6urW(aXI58Y1kr axi58y1kr, mhl5lIdbQ mhl5lidbq) {
        mhl5lIdbQ mhl5lidbq2;
        aXI58Y1kr axi58y1kr2 = aXI58Y1kr.REMOVED;
        int ordinal = mhl5lidbq.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (fVMSvDhE6.juJ6pnCpu(2)) {
                        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("SpecialEffectsController: For fragment ");
                        q3BipwRCk.append(this.tGV7Q6urW);
                        q3BipwRCk.append(" mFinalState = ");
                        q3BipwRCk.append(this.q3BipwRCk);
                        q3BipwRCk.append(" -> REMOVED. mLifecycleImpact  = ");
                        q3BipwRCk.append(this.J4Ux7ym32);
                        q3BipwRCk.append(" to REMOVING.");
                        Log.v("FragmentManager", q3BipwRCk.toString());
                    }
                    this.q3BipwRCk = axi58y1kr2;
                    mhl5lidbq2 = mhl5lIdbQ.REMOVING;
                } else {
                    return;
                }
            } else if (this.q3BipwRCk == axi58y1kr2) {
                if (fVMSvDhE6.juJ6pnCpu(2)) {
                    StringBuilder q3BipwRCk2 = abGBwSu8x.q3BipwRCk("SpecialEffectsController: For fragment ");
                    q3BipwRCk2.append(this.tGV7Q6urW);
                    q3BipwRCk2.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                    q3BipwRCk2.append(this.J4Ux7ym32);
                    q3BipwRCk2.append(" to ADDING.");
                    Log.v("FragmentManager", q3BipwRCk2.toString());
                }
                this.q3BipwRCk = aXI58Y1kr.VISIBLE;
                mhl5lidbq2 = mhl5lIdbQ.ADDING;
            } else {
                return;
            }
            this.J4Ux7ym32 = mhl5lidbq2;
        } else if (this.q3BipwRCk != axi58y1kr2) {
            if (fVMSvDhE6.juJ6pnCpu(2)) {
                StringBuilder q3BipwRCk3 = abGBwSu8x.q3BipwRCk("SpecialEffectsController: For fragment ");
                q3BipwRCk3.append(this.tGV7Q6urW);
                q3BipwRCk3.append(" mFinalState = ");
                q3BipwRCk3.append(this.q3BipwRCk);
                q3BipwRCk3.append(" -> ");
                q3BipwRCk3.append(axi58y1kr);
                q3BipwRCk3.append(". ");
                Log.v("FragmentManager", q3BipwRCk3.toString());
            }
            this.q3BipwRCk = axi58y1kr;
        }
    }

    public String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.q3BipwRCk + "} {mLifecycleImpact = " + this.J4Ux7ym32 + "} {mFragment = " + this.tGV7Q6urW + "}";
    }
}
