package con;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class sSVv3dJln extends RecyclerView.lamBDew8Z {
    public static TimeInterpolator Eeka1udhb;
    public boolean GPLPRo6go = true;
    public ArrayList Puu3Rhg4F = new ArrayList();
    public ArrayList yWvV4ePLl = new ArrayList();
    public ArrayList oon79WMrY = new ArrayList();
    public ArrayList vPSbyrYWX = new ArrayList();
    public ArrayList CBQ5d1kRq = new ArrayList();
    public ArrayList kmSgne1rO = new ArrayList();
    public ArrayList Bhmn1KIah = new ArrayList();
    public ArrayList PSTqBLTET = new ArrayList();
    public ArrayList MzoOEjc4X = new ArrayList();
    public ArrayList ilHKhw3Yw = new ArrayList();
    public ArrayList qVUwofr5s = new ArrayList();

    public final void Bhmn1KIah(RecyclerView.cywn6086a cywn6086a) {
        if (Eeka1udhb == null) {
            Eeka1udhb = new ValueAnimator().getInterpolator();
        }
        cywn6086a.q3BipwRCk.animate().setInterpolator(Eeka1udhb);
        kCA6Zs9sL(cywn6086a);
    }

    public final void CBQ5d1kRq(List list, RecyclerView.cywn6086a cywn6086a) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ltHymUmUx lthymumux = (ltHymUmUx) list.get(size);
                if (kmSgne1rO(lthymumux, cywn6086a) && lthymumux.q3BipwRCk == null && lthymumux.J4Ux7ym32 == null) {
                    list.remove(lthymumux);
                }
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.lamBDew8Z
    public boolean GPLPRo6go() {
        return !this.yWvV4ePLl.isEmpty() || !this.vPSbyrYWX.isEmpty() || !this.oon79WMrY.isEmpty() || !this.Puu3Rhg4F.isEmpty() || !this.MzoOEjc4X.isEmpty() || !this.ilHKhw3Yw.isEmpty() || !this.PSTqBLTET.isEmpty() || !this.qVUwofr5s.isEmpty() || !this.kmSgne1rO.isEmpty() || !this.CBQ5d1kRq.isEmpty() || !this.Bhmn1KIah.isEmpty();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.lamBDew8Z
    public void iiGwOFFnr() {
        int size = this.oon79WMrY.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            WgCAwL00L wgCAwL00L = (WgCAwL00L) this.oon79WMrY.get(size);
            View view = wgCAwL00L.q3BipwRCk.q3BipwRCk;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            tGV7Q6urW(wgCAwL00L.q3BipwRCk);
            this.oon79WMrY.remove(size);
        }
        int size2 = this.Puu3Rhg4F.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            tGV7Q6urW((RecyclerView.cywn6086a) this.Puu3Rhg4F.get(size2));
            this.Puu3Rhg4F.remove(size2);
        }
        int size3 = this.yWvV4ePLl.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.cywn6086a cywn6086a = (RecyclerView.cywn6086a) this.yWvV4ePLl.get(size3);
            cywn6086a.q3BipwRCk.setAlpha(1.0f);
            tGV7Q6urW(cywn6086a);
            this.yWvV4ePLl.remove(size3);
        }
        int size4 = this.vPSbyrYWX.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            ltHymUmUx lthymumux = (ltHymUmUx) this.vPSbyrYWX.get(size4);
            RecyclerView.cywn6086a cywn6086a2 = lthymumux.q3BipwRCk;
            if (cywn6086a2 != null) {
                kmSgne1rO(lthymumux, cywn6086a2);
            }
            RecyclerView.cywn6086a cywn6086a3 = lthymumux.J4Ux7ym32;
            if (cywn6086a3 != null) {
                kmSgne1rO(lthymumux, cywn6086a3);
            }
        }
        this.vPSbyrYWX.clear();
        if (GPLPRo6go()) {
            int size5 = this.kmSgne1rO.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList = (ArrayList) this.kmSgne1rO.get(size5);
                int size6 = arrayList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        WgCAwL00L wgCAwL00L2 = (WgCAwL00L) arrayList.get(size6);
                        View view2 = wgCAwL00L2.q3BipwRCk.q3BipwRCk;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        tGV7Q6urW(wgCAwL00L2.q3BipwRCk);
                        arrayList.remove(size6);
                        if (arrayList.isEmpty()) {
                            this.kmSgne1rO.remove(arrayList);
                        }
                    }
                }
            }
            int size7 = this.CBQ5d1kRq.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList arrayList2 = (ArrayList) this.CBQ5d1kRq.get(size7);
                int size8 = arrayList2.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        RecyclerView.cywn6086a cywn6086a4 = (RecyclerView.cywn6086a) arrayList2.get(size8);
                        cywn6086a4.q3BipwRCk.setAlpha(1.0f);
                        tGV7Q6urW(cywn6086a4);
                        arrayList2.remove(size8);
                        if (arrayList2.isEmpty()) {
                            this.CBQ5d1kRq.remove(arrayList2);
                        }
                    }
                }
            }
            int size9 = this.Bhmn1KIah.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    ArrayList arrayList3 = (ArrayList) this.Bhmn1KIah.get(size9);
                    int size10 = arrayList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            ltHymUmUx lthymumux2 = (ltHymUmUx) arrayList3.get(size10);
                            RecyclerView.cywn6086a cywn6086a5 = lthymumux2.q3BipwRCk;
                            if (cywn6086a5 != null) {
                                kmSgne1rO(lthymumux2, cywn6086a5);
                            }
                            RecyclerView.cywn6086a cywn6086a6 = lthymumux2.J4Ux7ym32;
                            if (cywn6086a6 != null) {
                                kmSgne1rO(lthymumux2, cywn6086a6);
                            }
                            if (arrayList3.isEmpty()) {
                                this.Bhmn1KIah.remove(arrayList3);
                            }
                        }
                    }
                } else {
                    oon79WMrY(this.ilHKhw3Yw);
                    oon79WMrY(this.MzoOEjc4X);
                    oon79WMrY(this.PSTqBLTET);
                    oon79WMrY(this.qVUwofr5s);
                    dIocxURUo();
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.lamBDew8Z
    public void kCA6Zs9sL(RecyclerView.cywn6086a cywn6086a) {
        View view = cywn6086a.q3BipwRCk;
        view.animate().cancel();
        int size = this.oon79WMrY.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((WgCAwL00L) this.oon79WMrY.get(size)).q3BipwRCk == cywn6086a) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                tGV7Q6urW(cywn6086a);
                this.oon79WMrY.remove(size);
            }
        }
        CBQ5d1kRq(this.vPSbyrYWX, cywn6086a);
        if (this.Puu3Rhg4F.remove(cywn6086a)) {
            view.setAlpha(1.0f);
            tGV7Q6urW(cywn6086a);
        }
        if (this.yWvV4ePLl.remove(cywn6086a)) {
            view.setAlpha(1.0f);
            tGV7Q6urW(cywn6086a);
        }
        int size2 = this.Bhmn1KIah.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.Bhmn1KIah.get(size2);
            CBQ5d1kRq(arrayList, cywn6086a);
            if (arrayList.isEmpty()) {
                this.Bhmn1KIah.remove(size2);
            }
        }
        int size3 = this.kmSgne1rO.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.kmSgne1rO.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((WgCAwL00L) arrayList2.get(size4)).q3BipwRCk == cywn6086a) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    tGV7Q6urW(cywn6086a);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.kmSgne1rO.remove(size3);
                    }
                }
            }
        }
        int size5 = this.CBQ5d1kRq.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList3 = (ArrayList) this.CBQ5d1kRq.get(size5);
                if (arrayList3.remove(cywn6086a)) {
                    view.setAlpha(1.0f);
                    tGV7Q6urW(cywn6086a);
                    if (arrayList3.isEmpty()) {
                        this.CBQ5d1kRq.remove(size5);
                    }
                }
            } else {
                this.ilHKhw3Yw.remove(cywn6086a);
                this.PSTqBLTET.remove(cywn6086a);
                this.qVUwofr5s.remove(cywn6086a);
                this.MzoOEjc4X.remove(cywn6086a);
                vPSbyrYWX();
                return;
            }
        }
    }

    public final boolean kmSgne1rO(ltHymUmUx lthymumux, RecyclerView.cywn6086a cywn6086a) {
        if (lthymumux.J4Ux7ym32 == cywn6086a) {
            lthymumux.J4Ux7ym32 = null;
        } else if (lthymumux.q3BipwRCk != cywn6086a) {
            return false;
        } else {
            lthymumux.q3BipwRCk = null;
        }
        cywn6086a.q3BipwRCk.setAlpha(1.0f);
        cywn6086a.q3BipwRCk.setTranslationX(0.0f);
        cywn6086a.q3BipwRCk.setTranslationY(0.0f);
        tGV7Q6urW(cywn6086a);
        return true;
    }

    public void oon79WMrY(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((RecyclerView.cywn6086a) list.get(size)).q3BipwRCk.animate().cancel();
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.lamBDew8Z
    public boolean q3BipwRCk(RecyclerView.cywn6086a cywn6086a, RecyclerView.cywn6086a cywn6086a2, RecyclerView.lamBDew8Z.mhl5lIdbQ mhl5lidbq, RecyclerView.lamBDew8Z.mhl5lIdbQ mhl5lidbq2) {
        int i;
        int i2;
        int i3 = mhl5lidbq.q3BipwRCk;
        int i4 = mhl5lidbq.J4Ux7ym32;
        if (cywn6086a2.dXrmkklc8()) {
            i2 = mhl5lidbq.q3BipwRCk;
            i = mhl5lidbq.J4Ux7ym32;
        } else {
            i2 = mhl5lidbq2.q3BipwRCk;
            i = mhl5lidbq2.J4Ux7ym32;
        }
        if (cywn6086a == cywn6086a2) {
            return yWvV4ePLl(cywn6086a, i3, i4, i2, i);
        }
        float translationX = cywn6086a.q3BipwRCk.getTranslationX();
        float translationY = cywn6086a.q3BipwRCk.getTranslationY();
        float alpha = cywn6086a.q3BipwRCk.getAlpha();
        Bhmn1KIah(cywn6086a);
        cywn6086a.q3BipwRCk.setTranslationX(translationX);
        cywn6086a.q3BipwRCk.setTranslationY(translationY);
        cywn6086a.q3BipwRCk.setAlpha(alpha);
        Bhmn1KIah(cywn6086a2);
        cywn6086a2.q3BipwRCk.setTranslationX((float) (-((int) (((float) (i2 - i3)) - translationX))));
        cywn6086a2.q3BipwRCk.setTranslationY((float) (-((int) (((float) (i - i4)) - translationY))));
        cywn6086a2.q3BipwRCk.setAlpha(0.0f);
        this.vPSbyrYWX.add(new ltHymUmUx(cywn6086a, cywn6086a2, i3, i4, i2, i));
        return true;
    }

    public void vPSbyrYWX() {
        if (!GPLPRo6go()) {
            dIocxURUo();
        }
    }

    public boolean yWvV4ePLl(RecyclerView.cywn6086a cywn6086a, int i, int i2, int i3, int i4) {
        View view = cywn6086a.q3BipwRCk;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) cywn6086a.q3BipwRCk.getTranslationY());
        Bhmn1KIah(cywn6086a);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            tGV7Q6urW(cywn6086a);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.oon79WMrY.add(new WgCAwL00L(cywn6086a, translationX, translationY, i3, i4));
        return true;
    }
}
