package con;

import android.animation.Animator;
import android.view.ViewGroup;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
/* loaded from: classes.dex */
public final class SDU9Amek1 extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ ErB1wWwOl Bhmn1KIah;
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SDU9Amek1(ErB1wWwOl erB1wWwOl, int i) {
        super(1);
        this.kmSgne1rO = i;
        if (i == 1) {
            this.Bhmn1KIah = erB1wWwOl;
            super(1);
        } else if (i == 2) {
            this.Bhmn1KIah = erB1wWwOl;
            super(1);
        } else if (i == 3) {
            this.Bhmn1KIah = erB1wWwOl;
            super(1);
        } else if (i != 4) {
            this.Bhmn1KIah = erB1wWwOl;
        } else {
            this.Bhmn1KIah = erB1wWwOl;
            super(1);
        }
    }

    @Override // con.PmanMZxiM
    public /* bridge */ /* synthetic */ Object IytU16YUK(Object obj) {
        switch (this.kmSgne1rO) {
            case 0:
                q3BipwRCk(((Number) obj).intValue());
                return qih4lW99W.q3BipwRCk;
            case 1:
                J4Ux7ym32((ViewGroup) obj);
                return qih4lW99W.q3BipwRCk;
            case 2:
                q3BipwRCk(((Number) obj).intValue());
                return qih4lW99W.q3BipwRCk;
            case 3:
                J4Ux7ym32((ViewGroup) obj);
                return qih4lW99W.q3BipwRCk;
            default:
                q3BipwRCk(((Number) obj).intValue());
                return qih4lW99W.q3BipwRCk;
        }
    }

    public void J4Ux7ym32(ViewGroup viewGroup) {
        switch (this.kmSgne1rO) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = this.Bhmn1KIah.q3BipwRCk;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.IytU16YUK(0);
                    bottomSheetBehavior.CpG0imbht(4);
                    ErB1wWwOl erB1wWwOl = this.Bhmn1KIah;
                    ViewGroup viewGroup2 = erB1wWwOl.J4Ux7ym32;
                    int intValue = ((Number) erB1wWwOl.GPLPRo6go.q3BipwRCk(ErB1wWwOl.Puu3Rhg4F[1])).intValue();
                    nwvyEZJPU nwvyezjpu = new nwvyEZJPU(this);
                    if (intValue != 0) {
                        Animator kCA6Zs9sL = dnBSj5uJN.kCA6Zs9sL(0, intValue, 250, new PmanMZxiM(bottomSheetBehavior) { // from class: con.iXng18Q1h
                            @Override // con.PmanMZxiM
                            public Object IytU16YUK(Object obj) {
                                ((BottomSheetBehavior) this.kmSgne1rO).IytU16YUK(((Number) obj).intValue());
                                return qih4lW99W.q3BipwRCk;
                            }

                            @Override // con.m9DrxOui1
                            public final String dIocxURUo() {
                                return "setPeekHeight";
                            }

                            @Override // con.m9DrxOui1
                            public final String iiGwOFFnr() {
                                return "setPeekHeight(I)V";
                            }

                            @Override // con.m9DrxOui1
                            public final gmO9ra072 kCA6Zs9sL() {
                                return YGTdT21e3.q3BipwRCk(BottomSheetBehavior.class);
                            }
                        }, nwvyezjpu);
                        dnBSj5uJN.iMyQMM6Qj(viewGroup2, new inMzAxvvL(kCA6Zs9sL, 2));
                        kCA6Zs9sL.start();
                    }
                }
                ErB1wWwOl erB1wWwOl2 = this.Bhmn1KIah;
                if (pA5wCkne4.iMyQMM6Qj(erB1wWwOl2.dIocxURUo)) {
                    int measuredHeight = erB1wWwOl2.dIocxURUo.getMeasuredHeight();
                    DialogActionButtonLayout dialogActionButtonLayout = erB1wWwOl2.dIocxURUo;
                    dialogActionButtonLayout.setTranslationY((float) measuredHeight);
                    dialogActionButtonLayout.setVisibility(0);
                    Animator animator = dnBSj5uJN.kCA6Zs9sL(measuredHeight, 0, 180, new SDU9Amek1(erB1wWwOl2, 4), (r12 & 16) != 0 ? SFccbMiBr.WaUP0CF08 : null);
                    dnBSj5uJN.iMyQMM6Qj(erB1wWwOl2.dIocxURUo, new inMzAxvvL(animator, 1));
                    animator.setStartDelay(100);
                    animator.start();
                    return;
                }
                return;
            default:
                ErB1wWwOl erB1wWwOl3 = this.Bhmn1KIah;
                int min = Math.min(erB1wWwOl3.iiGwOFFnr(), Math.min(viewGroup.getMeasuredHeight(), this.Bhmn1KIah.iiGwOFFnr()));
                cRWwgrvAI crwwgrvai = erB1wWwOl3.GPLPRo6go;
                Sd85yPnM9 sd85yPnM9 = ErB1wWwOl.Puu3Rhg4F[1];
                crwwgrvai.q3BipwRCk = Integer.valueOf(min);
                return;
        }
    }

    public void q3BipwRCk(int i) {
        switch (this.kmSgne1rO) {
            case 0:
                this.Bhmn1KIah.dIocxURUo.setTranslationY((float) i);
                return;
            case 1:
            default:
                this.Bhmn1KIah.dIocxURUo.setTranslationY((float) i);
                return;
            case 2:
                int measuredHeight = this.Bhmn1KIah.dIocxURUo.getMeasuredHeight();
                if (1 <= i && measuredHeight >= i) {
                    this.Bhmn1KIah.dIocxURUo.setTranslationY((float) (measuredHeight - i));
                } else if (i > 0) {
                    this.Bhmn1KIah.dIocxURUo.setTranslationY(0.0f);
                }
                ErB1wWwOl.dIocxURUo(this.Bhmn1KIah, i);
                return;
        }
    }
}
