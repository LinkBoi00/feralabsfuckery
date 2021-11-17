package con;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class Pzd2J3aOK extends RecyclerView.Og6dYSoy7 {
    public final RecyclerView.wnbPPCp4x J4Ux7ym32 = new KIyQKya50(this);
    public Fj4Wp9wly dIocxURUo;
    public RecyclerView q3BipwRCk;
    public Fj4Wp9wly tGV7Q6urW;

    public final void GPLPRo6go() {
        if (this.q3BipwRCk.getOnFlingListener() == null) {
            this.q3BipwRCk.Puu3Rhg4F(this.J4Ux7ym32);
            this.q3BipwRCk.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    public final void J4Ux7ym32() {
        this.q3BipwRCk.DuuXfa7LE(this.J4Ux7ym32);
        this.q3BipwRCk.setOnFlingListener(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00be, code lost:
        if (r2 < r7) goto L_0x00c1;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean Puu3Rhg4F(RecyclerView.LULQkQlc9 lULQkQlc9, int i, int i2) {
        VsIWrpzEb vsIWrpzEb;
        int i3;
        PointF q3BipwRCk;
        boolean z = lULQkQlc9 instanceof RecyclerView.kVmRinNH6.RG2GI7LDp;
        if (z) {
            View view = null;
            if (!z) {
                vsIWrpzEb = null;
            } else {
                vsIWrpzEb = new VsIWrpzEb(this, this.q3BipwRCk.getContext());
            }
            if (vsIWrpzEb != null) {
                int NyWTwPF6V = lULQkQlc9.NyWTwPF6V();
                if (NyWTwPF6V != 0) {
                    Fj4Wp9wly iiGwOFFnr = lULQkQlc9.iiGwOFFnr() ? iiGwOFFnr(lULQkQlc9) : lULQkQlc9.kCA6Zs9sL() ? kCA6Zs9sL(lULQkQlc9) : null;
                    if (iiGwOFFnr != null) {
                        int WaUP0CF08 = lULQkQlc9.WaUP0CF08();
                        int i4 = Integer.MAX_VALUE;
                        int i5 = Integer.MIN_VALUE;
                        View view2 = null;
                        for (int i6 = 0; i6 < WaUP0CF08; i6++) {
                            View sk5s77z6Q = lULQkQlc9.sk5s77z6Q(i6);
                            if (sk5s77z6Q != null) {
                                int tGV7Q6urW = tGV7Q6urW(sk5s77z6Q, iiGwOFFnr);
                                if (tGV7Q6urW <= 0 && tGV7Q6urW > i5) {
                                    i5 = tGV7Q6urW;
                                    view2 = sk5s77z6Q;
                                }
                                if (tGV7Q6urW >= 0 && tGV7Q6urW < i4) {
                                    i4 = tGV7Q6urW;
                                    view = sk5s77z6Q;
                                }
                            }
                        }
                        boolean z2 = !lULQkQlc9.kCA6Zs9sL() ? i2 > 0 : i > 0;
                        if (z2 && view != null) {
                            i3 = lULQkQlc9.TyB1UUd72(view);
                        } else if (z2 || view2 == null) {
                            if (z2) {
                                view = view2;
                            }
                            if (view != null) {
                                i3 = ((z && (q3BipwRCk = ((RecyclerView.kVmRinNH6.RG2GI7LDp) lULQkQlc9).q3BipwRCk(lULQkQlc9.NyWTwPF6V() - 1)) != null && ((q3BipwRCk.x > 0.0f ? 1 : (q3BipwRCk.x == 0.0f ? 0 : -1)) < 0 || (q3BipwRCk.y > 0.0f ? 1 : (q3BipwRCk.y == 0.0f ? 0 : -1)) < 0)) == z2 ? -1 : 1) + lULQkQlc9.TyB1UUd72(view);
                                if (i3 >= 0) {
                                }
                            }
                        } else {
                            i3 = lULQkQlc9.TyB1UUd72(view2);
                        }
                        if (i3 != -1) {
                            vsIWrpzEb.q3BipwRCk = i3;
                            lULQkQlc9.tTcQQNK5P(vsIWrpzEb);
                            return true;
                        }
                    }
                }
                i3 = -1;
                if (i3 != -1) {
                }
            }
        }
        return false;
    }

    public final View dIocxURUo(RecyclerView.LULQkQlc9 lULQkQlc9, Fj4Wp9wly fj4Wp9wly) {
        int WaUP0CF08 = lULQkQlc9.WaUP0CF08();
        View view = null;
        if (WaUP0CF08 == 0) {
            return null;
        }
        int CBQ5d1kRq = (fj4Wp9wly.CBQ5d1kRq() / 2) + fj4Wp9wly.vPSbyrYWX();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < WaUP0CF08; i2++) {
            View sk5s77z6Q = lULQkQlc9.sk5s77z6Q(i2);
            int abs = Math.abs(((fj4Wp9wly.tGV7Q6urW(sk5s77z6Q) / 2) + fj4Wp9wly.kCA6Zs9sL(sk5s77z6Q)) - CBQ5d1kRq);
            if (abs < i) {
                view = sk5s77z6Q;
                i = abs;
            }
        }
        return view;
    }

    public final Fj4Wp9wly iiGwOFFnr(RecyclerView.LULQkQlc9 lULQkQlc9) {
        Fj4Wp9wly fj4Wp9wly = this.tGV7Q6urW;
        if (fj4Wp9wly == null || fj4Wp9wly.q3BipwRCk != lULQkQlc9) {
            this.tGV7Q6urW = new Q58fcynSX(lULQkQlc9);
        }
        return this.tGV7Q6urW;
    }

    public final Fj4Wp9wly kCA6Zs9sL(RecyclerView.LULQkQlc9 lULQkQlc9) {
        Fj4Wp9wly fj4Wp9wly = this.dIocxURUo;
        if (fj4Wp9wly == null || fj4Wp9wly.q3BipwRCk != lULQkQlc9) {
            this.dIocxURUo = new zBnrA98bV(lULQkQlc9);
        }
        return this.dIocxURUo;
    }

    public int[] q3BipwRCk(RecyclerView.LULQkQlc9 lULQkQlc9, View view) {
        int[] iArr = new int[2];
        if (lULQkQlc9.kCA6Zs9sL()) {
            iArr[0] = tGV7Q6urW(view, kCA6Zs9sL(lULQkQlc9));
        } else {
            iArr[0] = 0;
        }
        if (lULQkQlc9.iiGwOFFnr()) {
            iArr[1] = tGV7Q6urW(view, iiGwOFFnr(lULQkQlc9));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final int tGV7Q6urW(View view, Fj4Wp9wly fj4Wp9wly) {
        return ((fj4Wp9wly.tGV7Q6urW(view) / 2) + fj4Wp9wly.kCA6Zs9sL(view)) - ((fj4Wp9wly.CBQ5d1kRq() / 2) + fj4Wp9wly.vPSbyrYWX());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void yWvV4ePLl() {
        RecyclerView.LULQkQlc9 layoutManager;
        View view;
        Fj4Wp9wly fj4Wp9wly;
        RecyclerView recyclerView = this.q3BipwRCk;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            if (layoutManager.iiGwOFFnr()) {
                fj4Wp9wly = iiGwOFFnr(layoutManager);
            } else if (layoutManager.kCA6Zs9sL()) {
                fj4Wp9wly = kCA6Zs9sL(layoutManager);
            } else {
                view = null;
                if (view == null) {
                    int[] q3BipwRCk = q3BipwRCk(layoutManager, view);
                    if (q3BipwRCk[0] != 0 || q3BipwRCk[1] != 0) {
                        this.q3BipwRCk.Dr7UqlxEV(q3BipwRCk[0], q3BipwRCk[1], null, Integer.MIN_VALUE, false);
                        return;
                    }
                    return;
                }
                return;
            }
            view = dIocxURUo(layoutManager, fj4Wp9wly);
            if (view == null) {
            }
        }
    }
}
