package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.aXI58Y1kr;
import con.IqwHQ6O2l;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public int[] AqaWJg0b4;
    public View[] mUqPm6GBh;
    public boolean qFBXIgpia = false;
    public int nlGCs0NZs = -1;
    public final SparseIntArray NyWTwPF6V = new SparseIntArray();
    public final SparseIntArray vNtjxmzUM = new SparseIntArray();
    public aXI58Y1kr i0Zug1mVk = new RG2GI7LDp();
    public final Rect o4LF8RkoQ = new Rect();

    /* loaded from: classes.dex */
    public static final class RG2GI7LDp extends aXI58Y1kr {
    }

    /* loaded from: classes.dex */
    public static abstract class aXI58Y1kr {
        public final SparseIntArray q3BipwRCk = new SparseIntArray();
        public final SparseIntArray J4Ux7ym32 = new SparseIntArray();

        public int q3BipwRCk(int i, int i2) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i3++;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = 1;
                }
            }
            return i3 + 1 > i2 ? i4 + 1 : i4;
        }
    }

    /* loaded from: classes.dex */
    public static class mhl5lIdbQ extends RecyclerView.dgsh68zH8 {
        public int kCA6Zs9sL = -1;
        public int iiGwOFFnr = 0;

        public mhl5lIdbQ(int i, int i2) {
            super(i, i2);
        }

        public mhl5lIdbQ(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public mhl5lIdbQ(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public mhl5lIdbQ(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(i2, z);
        PcmVp0Rvw(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        PcmVp0Rvw(RecyclerView.LULQkQlc9.juJ6pnCpu(context, attributeSet, i, i2).J4Ux7ym32);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cc, code lost:
        if (r13 == (r2 > r15)) goto L_0x00ce;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fe, code lost:
        if (r13 == (r2 > r9)) goto L_0x0100;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010a  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    /* Code decompiled incorrectly, please refer to instructions dump */
    public View BL4OzhZBd(View view, int i, RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux) {
        int i2;
        int i3;
        int i4;
        int i5;
        View view2;
        View view3;
        int i6;
        boolean z;
        RecyclerView.V1xq9aVRv v1xq9aVRv2 = v1xq9aVRv;
        RecyclerView.kvFwRYSUX kvfwrysux2 = kvfwrysux;
        View qVUwofr5s = qVUwofr5s(view);
        View view4 = null;
        if (qVUwofr5s == null) {
            return null;
        }
        mhl5lIdbQ mhl5lidbq = (mhl5lIdbQ) qVUwofr5s.getLayoutParams();
        int i7 = mhl5lidbq.kCA6Zs9sL;
        int i8 = mhl5lidbq.iiGwOFFnr + i7;
        if (super.BL4OzhZBd(view, i, v1xq9aVRv, kvfwrysux) == null) {
            return null;
        }
        if ((eylCJcWC7(i) == 1) != this.RG6kpfv3v) {
            i4 = WaUP0CF08() - 1;
            i3 = -1;
            i2 = -1;
        } else {
            i3 = WaUP0CF08();
            i2 = 1;
            i4 = 0;
        }
        boolean z2 = this.MzoOEjc4X == 1 && bL31fPM8I();
        int PEj1y2vLv = PEj1y2vLv(v1xq9aVRv2, kvfwrysux2, i4);
        int i9 = -1;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = i4;
        View view5 = null;
        while (i13 != i3) {
            int PEj1y2vLv2 = PEj1y2vLv(v1xq9aVRv2, kvfwrysux2, i13);
            View sk5s77z6Q = sk5s77z6Q(i13);
            if (sk5s77z6Q == qVUwofr5s) {
                break;
            }
            if (!sk5s77z6Q.hasFocusable() || PEj1y2vLv2 == PEj1y2vLv) {
                mhl5lIdbQ mhl5lidbq2 = (mhl5lIdbQ) sk5s77z6Q.getLayoutParams();
                int i14 = mhl5lidbq2.kCA6Zs9sL;
                view2 = qVUwofr5s;
                int i15 = mhl5lidbq2.iiGwOFFnr + i14;
                if (sk5s77z6Q.hasFocusable() && i14 == i7 && i15 == i8) {
                    return sk5s77z6Q;
                }
                if ((!sk5s77z6Q.hasFocusable() || view4 != null) && (sk5s77z6Q.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int min = Math.min(i15, i8) - Math.max(i14, i7);
                    if (sk5s77z6Q.hasFocusable()) {
                        if (min <= i11) {
                            if (min == i11) {
                            }
                        }
                    } else if (view4 == null) {
                        i6 = i11;
                        i5 = PEj1y2vLv;
                        if (!(this.tGV7Q6urW.GPLPRo6go(sk5s77z6Q, 24579) && this.dIocxURUo.GPLPRo6go(sk5s77z6Q, 24579))) {
                            if (min <= i12) {
                                if (min == i12) {
                                }
                            }
                            z = true;
                            if (z) {
                                if (sk5s77z6Q.hasFocusable()) {
                                    i10 = mhl5lidbq2.kCA6Zs9sL;
                                    i11 = Math.min(i15, i8) - Math.max(i14, i7);
                                    view5 = view3;
                                    view4 = sk5s77z6Q;
                                } else {
                                    i9 = mhl5lidbq2.kCA6Zs9sL;
                                    i12 = Math.min(i15, i8) - Math.max(i14, i7);
                                    i11 = i6;
                                    view5 = sk5s77z6Q;
                                }
                                i13 += i2;
                                v1xq9aVRv2 = v1xq9aVRv;
                                kvfwrysux2 = kvfwrysux;
                                i3 = i3;
                                qVUwofr5s = view2;
                                PEj1y2vLv = i5;
                            }
                        }
                        z = false;
                        if (z) {
                        }
                    }
                    i6 = i11;
                    i5 = PEj1y2vLv;
                    z = false;
                    if (z) {
                    }
                } else {
                    view3 = view5;
                }
                i6 = i11;
                i5 = PEj1y2vLv;
                z = true;
                if (z) {
                }
            } else if (view4 != null) {
                break;
            } else {
                view2 = qVUwofr5s;
                view3 = view5;
                i6 = i11;
                i5 = PEj1y2vLv;
            }
            i11 = i6;
            view5 = view3;
            i13 += i2;
            v1xq9aVRv2 = v1xq9aVRv;
            kvfwrysux2 = kvfwrysux;
            i3 = i3;
            qVUwofr5s = view2;
            PEj1y2vLv = i5;
        }
        return view4 != null ? view4 : view5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
        r22.J4Ux7ym32 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void CBBuS2EIe(RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux, LinearLayoutManager.aXI58Y1kr axi58y1kr, LinearLayoutManager.mhl5lIdbQ mhl5lidbq) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        View tGV7Q6urW;
        int oon79WMrY = this.qVUwofr5s.oon79WMrY();
        boolean z = oon79WMrY != 1073741824;
        int i20 = WaUP0CF08() > 0 ? this.AqaWJg0b4[this.nlGCs0NZs] : 0;
        if (z) {
            YOAvvoczt();
        }
        boolean z2 = axi58y1kr.kCA6Zs9sL == 1;
        int i21 = this.nlGCs0NZs;
        if (!z2) {
            i21 = u3Funie2w(v1xq9aVRv, kvfwrysux, axi58y1kr.dIocxURUo) + rDCncSZqf(v1xq9aVRv, kvfwrysux, axi58y1kr.dIocxURUo);
        }
        int i22 = 0;
        while (i22 < this.nlGCs0NZs && axi58y1kr.J4Ux7ym32(kvfwrysux) && i21 > 0) {
            int i23 = axi58y1kr.dIocxURUo;
            int rDCncSZqf = rDCncSZqf(v1xq9aVRv, kvfwrysux, i23);
            if (rDCncSZqf <= this.nlGCs0NZs) {
                i21 -= rDCncSZqf;
                if (i21 < 0 || (tGV7Q6urW = axi58y1kr.tGV7Q6urW(v1xq9aVRv)) == null) {
                    break;
                }
                this.mUqPm6GBh[i22] = tGV7Q6urW;
                i22++;
            } else {
                throw new IllegalArgumentException("Item at position " + i23 + " requires " + rDCncSZqf + " spans but GridLayoutManager has only " + this.nlGCs0NZs + " spans.");
            }
        }
        if (z2) {
            i4 = 0;
            i2 = 0;
            i = 1;
            i3 = i22;
        } else {
            i4 = i22 - 1;
            i2 = 0;
            i3 = -1;
            i = -1;
        }
        while (i4 != i3) {
            View view = this.mUqPm6GBh[i4];
            mhl5lIdbQ mhl5lidbq2 = (mhl5lIdbQ) view.getLayoutParams();
            int rDCncSZqf2 = rDCncSZqf(v1xq9aVRv, kvfwrysux, TyB1UUd72(view));
            mhl5lidbq2.iiGwOFFnr = rDCncSZqf2;
            mhl5lidbq2.kCA6Zs9sL = i2;
            i2 += rDCncSZqf2;
            i4 += i;
        }
        float f = 0.0f;
        int i24 = 0;
        for (int i25 = 0; i25 < i22; i25++) {
            View view2 = this.mUqPm6GBh[i25];
            if (axi58y1kr.vPSbyrYWX == null) {
                if (z2) {
                    J4Ux7ym32(view2);
                } else {
                    tGV7Q6urW(view2, 0, false);
                }
            } else if (z2) {
                tGV7Q6urW(view2, -1, true);
            } else {
                tGV7Q6urW(view2, 0, true);
            }
            Rect rect = this.o4LF8RkoQ;
            RecyclerView recyclerView = this.J4Ux7ym32;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.QNqj6nIzv(view2));
            }
            epbSQ9d3y(view2, oon79WMrY, false);
            int tGV7Q6urW2 = this.qVUwofr5s.tGV7Q6urW(view2);
            if (tGV7Q6urW2 > i24) {
                i24 = tGV7Q6urW2;
            }
            float dIocxURUo = (((float) this.qVUwofr5s.dIocxURUo(view2)) * 1.0f) / ((float) ((mhl5lIdbQ) view2.getLayoutParams()).iiGwOFFnr);
            if (dIocxURUo > f) {
                f = dIocxURUo;
            }
        }
        if (z) {
            sTB0vhytu(Math.max(Math.round(f * ((float) this.nlGCs0NZs)), i20));
            i24 = 0;
            for (int i26 = 0; i26 < i22; i26++) {
                View view3 = this.mUqPm6GBh[i26];
                epbSQ9d3y(view3, 1073741824, true);
                int tGV7Q6urW3 = this.qVUwofr5s.tGV7Q6urW(view3);
                if (tGV7Q6urW3 > i24) {
                    i24 = tGV7Q6urW3;
                }
            }
        }
        for (int i27 = 0; i27 < i22; i27++) {
            View view4 = this.mUqPm6GBh[i27];
            if (this.qVUwofr5s.tGV7Q6urW(view4) != i24) {
                mhl5lIdbQ mhl5lidbq3 = (mhl5lIdbQ) view4.getLayoutParams();
                Rect rect2 = mhl5lidbq3.J4Ux7ym32;
                int i28 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) mhl5lidbq3).topMargin + ((ViewGroup.MarginLayoutParams) mhl5lidbq3).bottomMargin;
                int i29 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) mhl5lidbq3).leftMargin + ((ViewGroup.MarginLayoutParams) mhl5lidbq3).rightMargin;
                int RyI1CYQEZ = RyI1CYQEZ(mhl5lidbq3.kCA6Zs9sL, mhl5lidbq3.iiGwOFFnr);
                if (this.MzoOEjc4X == 1) {
                    i19 = RecyclerView.LULQkQlc9.i8XZMQc6Z(RyI1CYQEZ, 1073741824, i29, ((ViewGroup.MarginLayoutParams) mhl5lidbq3).width, false);
                    i18 = View.MeasureSpec.makeMeasureSpec(i24 - i28, 1073741824);
                } else {
                    i19 = View.MeasureSpec.makeMeasureSpec(i24 - i29, 1073741824);
                    i18 = RecyclerView.LULQkQlc9.i8XZMQc6Z(RyI1CYQEZ, 1073741824, i28, ((ViewGroup.MarginLayoutParams) mhl5lidbq3).height, false);
                }
                lVOrs59Vi(view4, i19, i18, true);
            }
        }
        mhl5lidbq.q3BipwRCk = i24;
        if (this.MzoOEjc4X == 1) {
            if (axi58y1kr.iiGwOFFnr == -1) {
                i8 = axi58y1kr.J4Ux7ym32;
                i17 = i8 - i24;
            } else {
                i17 = axi58y1kr.J4Ux7ym32;
                i8 = i24 + i17;
            }
            i5 = i17;
            i7 = 0;
            i6 = 0;
        } else {
            if (axi58y1kr.iiGwOFFnr == -1) {
                i16 = axi58y1kr.J4Ux7ym32;
                i15 = i16 - i24;
            } else {
                i15 = axi58y1kr.J4Ux7ym32;
                i16 = i24 + i15;
            }
            i6 = i15;
            i5 = 0;
            i7 = i16;
            i8 = 0;
        }
        int i30 = 0;
        while (i30 < i22) {
            View view5 = this.mUqPm6GBh[i30];
            mhl5lIdbQ mhl5lidbq4 = (mhl5lIdbQ) view5.getLayoutParams();
            if (this.MzoOEjc4X == 1) {
                if (bL31fPM8I()) {
                    i14 = QNqj6nIzv() + this.AqaWJg0b4[this.nlGCs0NZs - mhl5lidbq4.kCA6Zs9sL];
                    i13 = i14 - this.qVUwofr5s.dIocxURUo(view5);
                } else {
                    i13 = this.AqaWJg0b4[mhl5lidbq4.kCA6Zs9sL] + QNqj6nIzv();
                    i14 = this.qVUwofr5s.dIocxURUo(view5) + i13;
                }
                i12 = i8;
                i11 = i14;
                i10 = i13;
                i9 = i5;
            } else {
                int EBQXiIPmm = EBQXiIPmm() + this.AqaWJg0b4[mhl5lidbq4.kCA6Zs9sL];
                i12 = this.qVUwofr5s.dIocxURUo(view5) + EBQXiIPmm;
                i9 = EBQXiIPmm;
                i11 = i7;
                i10 = i6;
            }
            ziwPzaoF3(view5, i10, i9, i11, i12);
            if (mhl5lidbq4.tGV7Q6urW() || mhl5lidbq4.J4Ux7ym32()) {
                mhl5lidbq.tGV7Q6urW = true;
            }
            mhl5lidbq.dIocxURUo |= view5.hasFocusable();
            i30++;
            i8 = i12;
            i7 = i11;
            i6 = i10;
            i5 = i9;
        }
        Arrays.fill(this.mUqPm6GBh, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public int CBQ5d1kRq(RecyclerView.kvFwRYSUX kvfwrysux) {
        return eUlgH2VO7(kvfwrysux);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void Dr7UqlxEV(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.i0Zug1mVk.q3BipwRCk.clear();
        this.i0Zug1mVk.J4Ux7ym32.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public boolean GPLPRo6go(RecyclerView.dgsh68zH8 dgsh68zh8) {
        return dgsh68zh8 instanceof mhl5lIdbQ;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void INnK5Rew6(RecyclerView recyclerView) {
        this.i0Zug1mVk.q3BipwRCk.clear();
        this.i0Zug1mVk.J4Ux7ym32.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void JBD2u58uX(boolean z) {
        if (!z) {
            dIocxURUo(null);
            if (this.ixWaw2akD) {
                this.ixWaw2akD = false;
                uSBmk4hFZ();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public int JxIJId84K(int i, RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux) {
        YOAvvoczt();
        Wii4Y5Ipj();
        if (this.MzoOEjc4X == 0) {
            return 0;
        }
        return Nr79Zh2zt(i, v1xq9aVRv, kvfwrysux);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void KBYw84i3W(RecyclerView recyclerView, int i, int i2) {
        this.i0Zug1mVk.q3BipwRCk.clear();
        this.i0Zug1mVk.J4Ux7ym32.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void M66hQ219i(RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux) {
        if (kvfwrysux.GPLPRo6go) {
            int WaUP0CF08 = WaUP0CF08();
            for (int i = 0; i < WaUP0CF08; i++) {
                mhl5lIdbQ mhl5lidbq = (mhl5lIdbQ) sk5s77z6Q(i).getLayoutParams();
                int q3BipwRCk = mhl5lidbq.q3BipwRCk();
                this.NyWTwPF6V.put(q3BipwRCk, mhl5lidbq.iiGwOFFnr);
                this.vNtjxmzUM.put(q3BipwRCk, mhl5lidbq.kCA6Zs9sL);
            }
        }
        super.M66hQ219i(v1xq9aVRv, kvfwrysux);
        this.NyWTwPF6V.clear();
        this.vNtjxmzUM.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public int MzoOEjc4X(RecyclerView.kvFwRYSUX kvfwrysux) {
        return GpWTsCbvo(kvfwrysux);
    }

    public final int PEj1y2vLv(RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux, int i) {
        if (!kvfwrysux.GPLPRo6go) {
            return this.i0Zug1mVk.q3BipwRCk(i, this.nlGCs0NZs);
        }
        int tGV7Q6urW = v1xq9aVRv.tGV7Q6urW(i);
        if (tGV7Q6urW != -1) {
            return this.i0Zug1mVk.q3BipwRCk(tGV7Q6urW, this.nlGCs0NZs);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public int PSTqBLTET(RecyclerView.kvFwRYSUX kvfwrysux) {
        return eUlgH2VO7(kvfwrysux);
    }

    public void PcmVp0Rvw(int i) {
        if (i != this.nlGCs0NZs) {
            this.qFBXIgpia = true;
            if (i >= 1) {
                this.nlGCs0NZs = i;
                this.i0Zug1mVk.q3BipwRCk.clear();
                uSBmk4hFZ();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void R2hkbNqWf(RecyclerView.kvFwRYSUX kvfwrysux) {
        this.dfpT1j18n = null;
        this.WaUP0CF08 = -1;
        this.i8XZMQc6Z = Integer.MIN_VALUE;
        this.iMyQMM6Qj.dIocxURUo();
        this.qFBXIgpia = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public RecyclerView.dgsh68zH8 RG6kpfv3v(Context context, AttributeSet attributeSet) {
        return new mhl5lIdbQ(context, attributeSet);
    }

    public int RyI1CYQEZ(int i, int i2) {
        if (this.MzoOEjc4X != 1 || !bL31fPM8I()) {
            int[] iArr = this.AqaWJg0b4;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.AqaWJg0b4;
        int i3 = this.nlGCs0NZs;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void ShOkzyJ3y(RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux, LinearLayoutManager.RG2GI7LDp rG2GI7LDp, int i) {
        YOAvvoczt();
        if (kvfwrysux.J4Ux7ym32() > 0 && !kvfwrysux.GPLPRo6go) {
            boolean z = i == 1;
            int u3Funie2w = u3Funie2w(v1xq9aVRv, kvfwrysux, rG2GI7LDp.J4Ux7ym32);
            if (z) {
                while (u3Funie2w > 0) {
                    int i2 = rG2GI7LDp.J4Ux7ym32;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    rG2GI7LDp.J4Ux7ym32 = i3;
                    u3Funie2w = u3Funie2w(v1xq9aVRv, kvfwrysux, i3);
                }
            } else {
                int J4Ux7ym32 = kvfwrysux.J4Ux7ym32() - 1;
                int i4 = rG2GI7LDp.J4Ux7ym32;
                while (i4 < J4Ux7ym32) {
                    int i5 = i4 + 1;
                    int u3Funie2w2 = u3Funie2w(v1xq9aVRv, kvfwrysux, i5);
                    if (u3Funie2w2 <= u3Funie2w) {
                        break;
                    }
                    i4 = i5;
                    u3Funie2w = u3Funie2w2;
                }
                rG2GI7LDp.J4Ux7ym32 = i4;
            }
        }
        Wii4Y5Ipj();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void SuKhTJIQc(RecyclerView recyclerView, int i, int i2, int i3) {
        this.i0Zug1mVk.q3BipwRCk.clear();
        this.i0Zug1mVk.J4Ux7ym32.clear();
    }

    public final void Wii4Y5Ipj() {
        View[] viewArr = this.mUqPm6GBh;
        if (viewArr == null || viewArr.length != this.nlGCs0NZs) {
            this.mUqPm6GBh = new View[this.nlGCs0NZs];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void XGA7b0zuB(RecyclerView.kvFwRYSUX kvfwrysux, LinearLayoutManager.aXI58Y1kr axi58y1kr, RecyclerView.LULQkQlc9.RG2GI7LDp rG2GI7LDp) {
        int i = this.nlGCs0NZs;
        for (int i2 = 0; i2 < this.nlGCs0NZs && axi58y1kr.J4Ux7ym32(kvfwrysux) && i > 0; i2++) {
            ((aXI58Y1kr.RG2GI7LDp) rG2GI7LDp).q3BipwRCk(axi58y1kr.dIocxURUo, Math.max(0, axi58y1kr.GPLPRo6go));
            Objects.requireNonNull(this.i0Zug1mVk);
            i--;
            axi58y1kr.dIocxURUo += axi58y1kr.kCA6Zs9sL;
        }
    }

    public final void YOAvvoczt() {
        int i;
        int i2;
        if (this.MzoOEjc4X == 1) {
            i2 = this.Bhmn1KIah - igRQEZxnW();
            i = QNqj6nIzv();
        } else {
            i2 = this.PSTqBLTET - V9LQMKGJe();
            i = EBQXiIPmm();
        }
        sTB0vhytu(i2 - i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public int a8N8UmDyD(int i, RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux) {
        YOAvvoczt();
        Wii4Y5Ipj();
        if (this.MzoOEjc4X == 1) {
            return 0;
        }
        return Nr79Zh2zt(i, v1xq9aVRv, kvfwrysux);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void aS2AFthYA(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.AqaWJg0b4 == null) {
            super.aS2AFthYA(rect, i, i2);
        }
        int igRQEZxnW = igRQEZxnW() + QNqj6nIzv();
        int V9LQMKGJe = V9LQMKGJe() + EBQXiIPmm();
        if (this.MzoOEjc4X == 1) {
            i4 = RecyclerView.LULQkQlc9.Puu3Rhg4F(i2, rect.height() + V9LQMKGJe, i0Zug1mVk());
            int[] iArr = this.AqaWJg0b4;
            i3 = RecyclerView.LULQkQlc9.Puu3Rhg4F(i, iArr[iArr.length - 1] + igRQEZxnW, o4LF8RkoQ());
        } else {
            i3 = RecyclerView.LULQkQlc9.Puu3Rhg4F(i, rect.width() + igRQEZxnW, o4LF8RkoQ());
            int[] iArr2 = this.AqaWJg0b4;
            i4 = RecyclerView.LULQkQlc9.Puu3Rhg4F(i2, iArr2[iArr2.length - 1] + V9LQMKGJe, i0Zug1mVk());
        }
        this.J4Ux7ym32.setMeasuredDimension(i3, i4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public RecyclerView.dgsh68zH8 dXrmkklc8() {
        return this.MzoOEjc4X == 0 ? new mhl5lIdbQ(-2, -1) : new mhl5lIdbQ(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public int dfpT1j18n(RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux) {
        if (this.MzoOEjc4X == 1) {
            return this.nlGCs0NZs;
        }
        if (kvfwrysux.J4Ux7ym32() < 1) {
            return 0;
        }
        return PEj1y2vLv(v1xq9aVRv, kvfwrysux, kvfwrysux.J4Ux7ym32() - 1) + 1;
    }

    public final void epbSQ9d3y(View view, int i, boolean z) {
        int i2;
        int i3;
        mhl5lIdbQ mhl5lidbq = (mhl5lIdbQ) view.getLayoutParams();
        Rect rect = mhl5lidbq.J4Ux7ym32;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) mhl5lidbq).topMargin + ((ViewGroup.MarginLayoutParams) mhl5lidbq).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) mhl5lidbq).leftMargin + ((ViewGroup.MarginLayoutParams) mhl5lidbq).rightMargin;
        int RyI1CYQEZ = RyI1CYQEZ(mhl5lidbq.kCA6Zs9sL, mhl5lidbq.iiGwOFFnr);
        if (this.MzoOEjc4X == 1) {
            i2 = RecyclerView.LULQkQlc9.i8XZMQc6Z(RyI1CYQEZ, i, i5, ((ViewGroup.MarginLayoutParams) mhl5lidbq).width, false);
            i3 = RecyclerView.LULQkQlc9.i8XZMQc6Z(this.qVUwofr5s.CBQ5d1kRq(), this.kmSgne1rO, i4, ((ViewGroup.MarginLayoutParams) mhl5lidbq).height, true);
        } else {
            int i8XZMQc6Z = RecyclerView.LULQkQlc9.i8XZMQc6Z(RyI1CYQEZ, i, i4, ((ViewGroup.MarginLayoutParams) mhl5lidbq).height, false);
            i2 = RecyclerView.LULQkQlc9.i8XZMQc6Z(this.qVUwofr5s.CBQ5d1kRq(), this.CBQ5d1kRq, i5, ((ViewGroup.MarginLayoutParams) mhl5lidbq).width, true);
            i3 = i8XZMQc6Z;
        }
        lVOrs59Vi(view, i2, i3, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public RecyclerView.dgsh68zH8 ixWaw2akD(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new mhl5lIdbQ((ViewGroup.MarginLayoutParams) layoutParams) : new mhl5lIdbQ(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public int j22ftfeNI(RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux) {
        if (this.MzoOEjc4X == 0) {
            return this.nlGCs0NZs;
        }
        if (kvfwrysux.J4Ux7ym32() < 1) {
            return 0;
        }
        return PEj1y2vLv(v1xq9aVRv, kvfwrysux, kvfwrysux.J4Ux7ym32() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void kktL0P5MG(RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux, View view, IqwHQ6O2l iqwHQ6O2l) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof mhl5lIdbQ)) {
            XYT7vJqNO(view, iqwHQ6O2l);
            return;
        }
        mhl5lIdbQ mhl5lidbq = (mhl5lIdbQ) layoutParams;
        int PEj1y2vLv = PEj1y2vLv(v1xq9aVRv, kvfwrysux, mhl5lidbq.q3BipwRCk());
        if (this.MzoOEjc4X == 0) {
            i4 = mhl5lidbq.kCA6Zs9sL;
            i3 = mhl5lidbq.iiGwOFFnr;
            i = 1;
            z2 = false;
            z = false;
            i2 = PEj1y2vLv;
        } else {
            i3 = 1;
            i2 = mhl5lidbq.kCA6Zs9sL;
            i = mhl5lidbq.iiGwOFFnr;
            z2 = false;
            z = false;
            i4 = PEj1y2vLv;
        }
        iqwHQ6O2l.PSTqBLTET(IqwHQ6O2l.aXI58Y1kr.q3BipwRCk(i4, i3, i2, i, z2, z));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public int kmSgne1rO(RecyclerView.kvFwRYSUX kvfwrysux) {
        return GpWTsCbvo(kvfwrysux);
    }

    public final void lVOrs59Vi(View view, int i, int i2, boolean z) {
        RecyclerView.dgsh68zH8 dgsh68zh8 = (RecyclerView.dgsh68zH8) view.getLayoutParams();
        if (z ? CMnfe2r2N(view, i, i2, dgsh68zh8) : koMoKnP1S(view, i, i2, dgsh68zh8)) {
            view.measure(i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void ln3nf7LH3(RecyclerView recyclerView, int i, int i2) {
        this.i0Zug1mVk.q3BipwRCk.clear();
        this.i0Zug1mVk.J4Ux7ym32.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public boolean oRfL5Lv1q() {
        return this.dfpT1j18n == null && !this.qFBXIgpia;
    }

    public final int rDCncSZqf(RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux, int i) {
        if (!kvfwrysux.GPLPRo6go) {
            Objects.requireNonNull(this.i0Zug1mVk);
            return 1;
        }
        int i2 = this.NyWTwPF6V.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (v1xq9aVRv.tGV7Q6urW(i) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        Objects.requireNonNull(this.i0Zug1mVk);
        return 1;
    }

    public final void sTB0vhytu(int i) {
        int i2;
        int[] iArr = this.AqaWJg0b4;
        int i3 = this.nlGCs0NZs;
        if (!(iArr != null && iArr.length == i3 + 1 && iArr[iArr.length - 1] == i)) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.AqaWJg0b4 = iArr;
    }

    public final int u3Funie2w(RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux, int i) {
        if (!kvfwrysux.GPLPRo6go) {
            aXI58Y1kr axi58y1kr = this.i0Zug1mVk;
            int i2 = this.nlGCs0NZs;
            Objects.requireNonNull(axi58y1kr);
            return i % i2;
        }
        int i3 = this.vNtjxmzUM.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int tGV7Q6urW = v1xq9aVRv.tGV7Q6urW(i);
        if (tGV7Q6urW == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        aXI58Y1kr axi58y1kr2 = this.i0Zug1mVk;
        int i4 = this.nlGCs0NZs;
        Objects.requireNonNull(axi58y1kr2);
        return tGV7Q6urW % i4;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View zBLRafG4A(RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux, boolean z, boolean z2) {
        int i;
        r0 = WaUP0CF08();
        int i2 = -1;
        int i3 = 1;
        if (z2) {
            i = WaUP0CF08() - 1;
            i3 = -1;
        } else {
            i = 0;
        }
        int J4Ux7ym32 = kvfwrysux.J4Ux7ym32();
        D91ZKn9BG();
        int vPSbyrYWX = this.qVUwofr5s.vPSbyrYWX();
        int GPLPRo6go = this.qVUwofr5s.GPLPRo6go();
        View view = null;
        View view2 = null;
        while (i != i2) {
            View sk5s77z6Q = sk5s77z6Q(i);
            int TyB1UUd72 = TyB1UUd72(sk5s77z6Q);
            if (TyB1UUd72 >= 0 && TyB1UUd72 < J4Ux7ym32 && u3Funie2w(v1xq9aVRv, kvfwrysux, TyB1UUd72) == 0) {
                if (((RecyclerView.dgsh68zH8) sk5s77z6Q.getLayoutParams()).tGV7Q6urW()) {
                    if (view2 == null) {
                        view2 = sk5s77z6Q;
                    }
                } else if (this.qVUwofr5s.kCA6Zs9sL(sk5s77z6Q) < GPLPRo6go && this.qVUwofr5s.J4Ux7ym32(sk5s77z6Q) >= vPSbyrYWX) {
                    return sk5s77z6Q;
                } else {
                    if (view == null) {
                        view = sk5s77z6Q;
                    }
                }
            }
            i += i3;
        }
        return view != null ? view : view2;
    }
}
