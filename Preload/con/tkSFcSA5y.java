package con;

import com.feravolt.preload.R;
/* loaded from: classes.dex */
public final class tkSFcSA5y implements y0FAKpZVf {
    public final /* synthetic */ Object J4Ux7ym32;
    public final /* synthetic */ int q3BipwRCk = 0;

    public tkSFcSA5y(G9VdDqs1M g9VdDqs1M) {
        this.J4Ux7ym32 = g9VdDqs1M;
    }

    @Override // con.y0FAKpZVf
    public void q3BipwRCk() {
        switch (this.q3BipwRCk) {
            case 0:
                ((G9VdDqs1M) this.J4Ux7ym32).q3BipwRCk = null;
                return;
            case 1:
                ((TB2AsrPRd) this.J4Ux7ym32).yWvV4ePLl();
                return;
            case 2:
                ((v0l3RHDWl) this.J4Ux7ym32).q3BipwRCk();
                return;
            case 3:
                pW31wYUjR pw31wyujr = (pW31wYUjR) this.J4Ux7ym32;
                for (e3ALPxmyo e3alpxmyo : pw31wyujr.GPLPRo6go.values()) {
                    e3alpxmyo.tGV7Q6urW.q3BipwRCk();
                }
                pw31wyujr.GPLPRo6go.clear();
                pw31wyujr.Puu3Rhg4F.clear();
                return;
            case 4:
                ((IxQRHSwcX) this.J4Ux7ym32).q3BipwRCk.GPLPRo6go();
                return;
            default:
                svUKnQBs3 svuknqbs3 = (svUKnQBs3) this.J4Ux7ym32;
                v0l3RHDWl v0l3rhdwl = svuknqbs3.Bhmn1KIah;
                if (v0l3rhdwl != null) {
                    v0l3rhdwl.q3BipwRCk();
                }
                svuknqbs3.Bhmn1KIah = null;
                svuknqbs3.requestLayout();
                svUKnQBs3 svuknqbs32 = (svUKnQBs3) this.J4Ux7ym32;
                svuknqbs32.setTag(R.id.view_tree_lifecycle_owner, null);
                if (svuknqbs32.qFBXIgpia) {
                    svuknqbs32.RG6kpfv3v.getViewTreeObserver().removeOnGlobalLayoutListener(svuknqbs32);
                    svuknqbs32.qFBXIgpia = false;
                }
                svuknqbs32.RG6kpfv3v.removeOnAttachStateChangeListener(svuknqbs32);
                svuknqbs32.ixWaw2akD.removeViewImmediate(svuknqbs32);
                return;
        }
    }

    public tkSFcSA5y(v0l3RHDWl v0l3rhdwl) {
        this.J4Ux7ym32 = v0l3rhdwl;
    }

    public tkSFcSA5y(IxQRHSwcX ixQRHSwcX) {
        this.J4Ux7ym32 = ixQRHSwcX;
    }

    public tkSFcSA5y(svUKnQBs3 svuknqbs3) {
        this.J4Ux7ym32 = svuknqbs3;
    }

    public tkSFcSA5y(pW31wYUjR pw31wyujr) {
        this.J4Ux7ym32 = pw31wyujr;
    }

    public tkSFcSA5y(TB2AsrPRd tB2AsrPRd) {
        this.J4Ux7ym32 = tB2AsrPRd;
    }
}
