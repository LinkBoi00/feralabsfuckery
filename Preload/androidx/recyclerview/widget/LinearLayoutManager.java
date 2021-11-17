package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.aXI58Y1kr;
import con.Fj4Wp9wly;
import con.Jt2ZQT8Dj;
import con.NySN5IVuc;
import con.abGBwSu8x;
import con.pA5wCkne4;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.LULQkQlc9 implements RecyclerView.kVmRinNH6.RG2GI7LDp {
    public int[] CpG0imbht;
    public boolean Eeka1udhb;
    public int IytU16YUK;
    public int MzoOEjc4X;
    public boolean RG6kpfv3v;
    public int WaUP0CF08;
    public final mhl5lIdbQ cAwN510t2;
    public boolean dXrmkklc8;
    public qhPEQQaQ4 dfpT1j18n;
    public int i8XZMQc6Z;
    public final RG2GI7LDp iMyQMM6Qj;
    public aXI58Y1kr ilHKhw3Yw;
    public boolean ixWaw2akD;
    public Fj4Wp9wly qVUwofr5s;
    public boolean sk5s77z6Q;

    /* loaded from: classes.dex */
    public static class RG2GI7LDp {
        public int J4Ux7ym32;
        public boolean dIocxURUo;
        public boolean kCA6Zs9sL;
        public Fj4Wp9wly q3BipwRCk;
        public int tGV7Q6urW;

        public RG2GI7LDp() {
            dIocxURUo();
        }

        public void J4Ux7ym32(View view, int i) {
            if (this.dIocxURUo) {
                this.tGV7Q6urW = this.q3BipwRCk.kmSgne1rO() + this.q3BipwRCk.J4Ux7ym32(view);
            } else {
                this.tGV7Q6urW = this.q3BipwRCk.kCA6Zs9sL(view);
            }
            this.J4Ux7ym32 = i;
        }

        public void dIocxURUo() {
            this.J4Ux7ym32 = -1;
            this.tGV7Q6urW = Integer.MIN_VALUE;
            this.dIocxURUo = false;
            this.kCA6Zs9sL = false;
        }

        public void q3BipwRCk() {
            this.tGV7Q6urW = this.dIocxURUo ? this.q3BipwRCk.GPLPRo6go() : this.q3BipwRCk.vPSbyrYWX();
        }

        public void tGV7Q6urW(View view, int i) {
            int i2;
            int kmSgne1rO = this.q3BipwRCk.kmSgne1rO();
            if (kmSgne1rO >= 0) {
                J4Ux7ym32(view, i);
                return;
            }
            this.J4Ux7ym32 = i;
            if (this.dIocxURUo) {
                int GPLPRo6go = (this.q3BipwRCk.GPLPRo6go() - kmSgne1rO) - this.q3BipwRCk.J4Ux7ym32(view);
                this.tGV7Q6urW = this.q3BipwRCk.GPLPRo6go() - GPLPRo6go;
                if (GPLPRo6go > 0) {
                    int tGV7Q6urW = this.tGV7Q6urW - this.q3BipwRCk.tGV7Q6urW(view);
                    int vPSbyrYWX = this.q3BipwRCk.vPSbyrYWX();
                    int min = tGV7Q6urW - (Math.min(this.q3BipwRCk.kCA6Zs9sL(view) - vPSbyrYWX, 0) + vPSbyrYWX);
                    if (min < 0) {
                        i2 = Math.min(GPLPRo6go, -min) + this.tGV7Q6urW;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                int kCA6Zs9sL = this.q3BipwRCk.kCA6Zs9sL(view);
                int vPSbyrYWX2 = kCA6Zs9sL - this.q3BipwRCk.vPSbyrYWX();
                this.tGV7Q6urW = kCA6Zs9sL;
                if (vPSbyrYWX2 > 0) {
                    int GPLPRo6go2 = (this.q3BipwRCk.GPLPRo6go() - Math.min(0, (this.q3BipwRCk.GPLPRo6go() - kmSgne1rO) - this.q3BipwRCk.J4Ux7ym32(view))) - (this.q3BipwRCk.tGV7Q6urW(view) + kCA6Zs9sL);
                    if (GPLPRo6go2 < 0) {
                        i2 = this.tGV7Q6urW - Math.min(vPSbyrYWX2, -GPLPRo6go2);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.tGV7Q6urW = i2;
        }

        public String toString() {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("AnchorInfo{mPosition=");
            q3BipwRCk.append(this.J4Ux7ym32);
            q3BipwRCk.append(", mCoordinate=");
            q3BipwRCk.append(this.tGV7Q6urW);
            q3BipwRCk.append(", mLayoutFromEnd=");
            q3BipwRCk.append(this.dIocxURUo);
            q3BipwRCk.append(", mValid=");
            q3BipwRCk.append(this.kCA6Zs9sL);
            q3BipwRCk.append('}');
            return q3BipwRCk.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class aXI58Y1kr {
        public boolean CBQ5d1kRq;
        public int GPLPRo6go;
        public int J4Ux7ym32;
        public int dIocxURUo;
        public int iiGwOFFnr;
        public int kCA6Zs9sL;
        public int oon79WMrY;
        public int tGV7Q6urW;
        public boolean q3BipwRCk = true;
        public int Puu3Rhg4F = 0;
        public int yWvV4ePLl = 0;
        public List vPSbyrYWX = null;

        public boolean J4Ux7ym32(RecyclerView.kvFwRYSUX kvfwrysux) {
            int i = this.dIocxURUo;
            return i >= 0 && i < kvfwrysux.J4Ux7ym32();
        }

        public void q3BipwRCk(View view) {
            int i;
            int q3BipwRCk;
            int size = this.vPSbyrYWX.size();
            View view2 = null;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = ((RecyclerView.cywn6086a) this.vPSbyrYWX.get(i3)).q3BipwRCk;
                RecyclerView.dgsh68zH8 dgsh68zh8 = (RecyclerView.dgsh68zH8) view3.getLayoutParams();
                if (view3 != view && !dgsh68zh8.tGV7Q6urW() && (q3BipwRCk = (dgsh68zh8.q3BipwRCk() - this.dIocxURUo) * this.kCA6Zs9sL) >= 0 && q3BipwRCk < i2) {
                    view2 = view3;
                    if (q3BipwRCk == 0) {
                        break;
                    }
                    i2 = q3BipwRCk;
                }
            }
            if (view2 == null) {
                i = -1;
            } else {
                i = ((RecyclerView.dgsh68zH8) view2.getLayoutParams()).q3BipwRCk();
            }
            this.dIocxURUo = i;
        }

        public View tGV7Q6urW(RecyclerView.V1xq9aVRv v1xq9aVRv) {
            List list = this.vPSbyrYWX;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    View view = ((RecyclerView.cywn6086a) this.vPSbyrYWX.get(i)).q3BipwRCk;
                    RecyclerView.dgsh68zH8 dgsh68zh8 = (RecyclerView.dgsh68zH8) view.getLayoutParams();
                    if (!dgsh68zh8.tGV7Q6urW() && this.dIocxURUo == dgsh68zh8.q3BipwRCk()) {
                        q3BipwRCk(view);
                        return view;
                    }
                }
                return null;
            }
            View view2 = v1xq9aVRv.oon79WMrY(this.dIocxURUo, false, Long.MAX_VALUE).q3BipwRCk;
            this.dIocxURUo += this.kCA6Zs9sL;
            return view2;
        }
    }

    /* loaded from: classes.dex */
    public static class mhl5lIdbQ {
        public boolean J4Ux7ym32;
        public boolean dIocxURUo;
        public int q3BipwRCk;
        public boolean tGV7Q6urW;
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class qhPEQQaQ4 implements Parcelable {
        public static final Parcelable.Creator<qhPEQQaQ4> CREATOR = new Jt2ZQT8Dj(2);
        public boolean Bhmn1KIah;
        public int CBQ5d1kRq;
        public int kmSgne1rO;

        public qhPEQQaQ4() {
        }

        public qhPEQQaQ4(Parcel parcel) {
            this.CBQ5d1kRq = parcel.readInt();
            this.kmSgne1rO = parcel.readInt();
            this.Bhmn1KIah = parcel.readInt() != 1 ? false : true;
        }

        public qhPEQQaQ4(qhPEQQaQ4 qhpeqqaq4) {
            this.CBQ5d1kRq = qhpeqqaq4.CBQ5d1kRq;
            this.kmSgne1rO = qhpeqqaq4.kmSgne1rO;
            this.Bhmn1KIah = qhpeqqaq4.Bhmn1KIah;
        }

        public boolean J4Ux7ym32() {
            return this.CBQ5d1kRq >= 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.CBQ5d1kRq);
            parcel.writeInt(this.kmSgne1rO);
            parcel.writeInt(this.Bhmn1KIah ? 1 : 0);
        }
    }

    public LinearLayoutManager(int i, boolean z) {
        this.MzoOEjc4X = 1;
        this.dXrmkklc8 = false;
        this.RG6kpfv3v = false;
        this.ixWaw2akD = false;
        this.sk5s77z6Q = true;
        this.WaUP0CF08 = -1;
        this.i8XZMQc6Z = Integer.MIN_VALUE;
        this.dfpT1j18n = null;
        this.iMyQMM6Qj = new RG2GI7LDp();
        this.cAwN510t2 = new mhl5lIdbQ();
        this.IytU16YUK = 2;
        this.CpG0imbht = new int[2];
        TpbsiPM9j(i);
        dIocxURUo(null);
        if (z != this.dXrmkklc8) {
            this.dXrmkklc8 = z;
            uSBmk4hFZ();
        }
    }

    public final int ASYHiorQ0(int i, RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux, boolean z) {
        int vPSbyrYWX;
        int vPSbyrYWX2 = i - this.qVUwofr5s.vPSbyrYWX();
        if (vPSbyrYWX2 <= 0) {
            return 0;
        }
        int i2 = -Nr79Zh2zt(vPSbyrYWX2, v1xq9aVRv, kvfwrysux);
        int i3 = i + i2;
        if (!z || (vPSbyrYWX = i3 - this.qVUwofr5s.vPSbyrYWX()) <= 0) {
            return i2;
        }
        this.qVUwofr5s.MzoOEjc4X(-vPSbyrYWX);
        return i2 - vPSbyrYWX;
    }

    public final void Ar5KPv1W1(int i, int i2) {
        this.ilHKhw3Yw.tGV7Q6urW = this.qVUwofr5s.GPLPRo6go() - i2;
        aXI58Y1kr axi58y1kr = this.ilHKhw3Yw;
        axi58y1kr.kCA6Zs9sL = this.RG6kpfv3v ? -1 : 1;
        axi58y1kr.dIocxURUo = i;
        axi58y1kr.iiGwOFFnr = 1;
        axi58y1kr.J4Ux7ym32 = i2;
        axi58y1kr.GPLPRo6go = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public View BL4OzhZBd(View view, int i, RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux) {
        int eylCJcWC7;
        View view2;
        CK4pxGbcv();
        if (WaUP0CF08() == 0 || (eylCJcWC7 = eylCJcWC7(i)) == Integer.MIN_VALUE) {
            return null;
        }
        D91ZKn9BG();
        ZxgfQJSvV(eylCJcWC7, (int) (((float) this.qVUwofr5s.CBQ5d1kRq()) * 0.33333334f), false, kvfwrysux);
        aXI58Y1kr axi58y1kr = this.ilHKhw3Yw;
        axi58y1kr.GPLPRo6go = Integer.MIN_VALUE;
        axi58y1kr.q3BipwRCk = false;
        pwwzaxl9D(v1xq9aVRv, axi58y1kr, kvfwrysux, true);
        if (eylCJcWC7 == -1) {
            if (this.RG6kpfv3v) {
                view2 = wrUk6NQP6(WaUP0CF08() - 1, -1);
            } else {
                view2 = wrUk6NQP6(0, WaUP0CF08());
            }
        } else if (this.RG6kpfv3v) {
            view2 = wrUk6NQP6(0, WaUP0CF08());
        } else {
            view2 = wrUk6NQP6(WaUP0CF08() - 1, -1);
        }
        View JMpnD40gh = eylCJcWC7 == -1 ? JMpnD40gh() : ZNy395opV();
        if (!JMpnD40gh.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return JMpnD40gh;
    }

    public View BRiz0pFYm(int i, int i2, boolean z, boolean z2) {
        D91ZKn9BG();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return (this.MzoOEjc4X == 0 ? this.tGV7Q6urW : this.dIocxURUo).dIocxURUo(i, i2, i4, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public int Bhmn1KIah(RecyclerView.kvFwRYSUX kvfwrysux) {
        return Xeg1rC5FI(kvfwrysux);
    }

    public void CBBuS2EIe(RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux, aXI58Y1kr axi58y1kr, mhl5lIdbQ mhl5lidbq) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View tGV7Q6urW = axi58y1kr.tGV7Q6urW(v1xq9aVRv);
        if (tGV7Q6urW == null) {
            mhl5lidbq.J4Ux7ym32 = true;
            return;
        }
        RecyclerView.dgsh68zH8 dgsh68zh8 = (RecyclerView.dgsh68zH8) tGV7Q6urW.getLayoutParams();
        if (axi58y1kr.vPSbyrYWX == null) {
            if (this.RG6kpfv3v == (axi58y1kr.iiGwOFFnr == -1)) {
                tGV7Q6urW(tGV7Q6urW, -1, false);
            } else {
                tGV7Q6urW(tGV7Q6urW, 0, false);
            }
        } else {
            if (this.RG6kpfv3v == (axi58y1kr.iiGwOFFnr == -1)) {
                tGV7Q6urW(tGV7Q6urW, -1, true);
            } else {
                tGV7Q6urW(tGV7Q6urW, 0, true);
            }
        }
        RecyclerView.dgsh68zH8 dgsh68zh82 = (RecyclerView.dgsh68zH8) tGV7Q6urW.getLayoutParams();
        Rect QNqj6nIzv = this.J4Ux7ym32.QNqj6nIzv(tGV7Q6urW);
        int i8XZMQc6Z = RecyclerView.LULQkQlc9.i8XZMQc6Z(this.Bhmn1KIah, this.CBQ5d1kRq, igRQEZxnW() + QNqj6nIzv() + ((ViewGroup.MarginLayoutParams) dgsh68zh82).leftMargin + ((ViewGroup.MarginLayoutParams) dgsh68zh82).rightMargin + QNqj6nIzv.left + QNqj6nIzv.right + 0, ((ViewGroup.MarginLayoutParams) dgsh68zh82).width, kCA6Zs9sL());
        int i8XZMQc6Z2 = RecyclerView.LULQkQlc9.i8XZMQc6Z(this.PSTqBLTET, this.kmSgne1rO, V9LQMKGJe() + EBQXiIPmm() + ((ViewGroup.MarginLayoutParams) dgsh68zh82).topMargin + ((ViewGroup.MarginLayoutParams) dgsh68zh82).bottomMargin + QNqj6nIzv.top + QNqj6nIzv.bottom + 0, ((ViewGroup.MarginLayoutParams) dgsh68zh82).height, iiGwOFFnr());
        if (koMoKnP1S(tGV7Q6urW, i8XZMQc6Z, i8XZMQc6Z2, dgsh68zh82)) {
            tGV7Q6urW.measure(i8XZMQc6Z, i8XZMQc6Z2);
        }
        mhl5lidbq.q3BipwRCk = this.qVUwofr5s.tGV7Q6urW(tGV7Q6urW);
        if (this.MzoOEjc4X == 1) {
            if (bL31fPM8I()) {
                i5 = this.Bhmn1KIah - igRQEZxnW();
                i4 = i5 - this.qVUwofr5s.dIocxURUo(tGV7Q6urW);
            } else {
                i4 = QNqj6nIzv();
                i5 = this.qVUwofr5s.dIocxURUo(tGV7Q6urW) + i4;
            }
            int i6 = axi58y1kr.iiGwOFFnr;
            int i7 = axi58y1kr.J4Ux7ym32;
            if (i6 == -1) {
                i3 = i7 - mhl5lidbq.q3BipwRCk;
                i = i7;
                i2 = i5;
            } else {
                i = mhl5lidbq.q3BipwRCk + i7;
                i3 = i7;
                i2 = i5;
            }
        } else {
            int EBQXiIPmm = EBQXiIPmm();
            int dIocxURUo = this.qVUwofr5s.dIocxURUo(tGV7Q6urW) + EBQXiIPmm;
            int i8 = axi58y1kr.iiGwOFFnr;
            int i9 = axi58y1kr.J4Ux7ym32;
            if (i8 == -1) {
                i4 = i9 - mhl5lidbq.q3BipwRCk;
                i2 = i9;
                i3 = EBQXiIPmm;
                i = dIocxURUo;
            } else {
                i2 = mhl5lidbq.q3BipwRCk + i9;
                i3 = EBQXiIPmm;
                i = dIocxURUo;
                i4 = i9;
            }
        }
        ziwPzaoF3(tGV7Q6urW, i4, i3, i2, i);
        if (dgsh68zh8.tGV7Q6urW() || dgsh68zh8.J4Ux7ym32()) {
            mhl5lidbq.tGV7Q6urW = true;
        }
        mhl5lidbq.dIocxURUo = tGV7Q6urW.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public int CBQ5d1kRq(RecyclerView.kvFwRYSUX kvfwrysux) {
        return eUlgH2VO7(kvfwrysux);
    }

    public final void CK4pxGbcv() {
        this.RG6kpfv3v = (this.MzoOEjc4X == 1 || !bL31fPM8I()) ? this.dXrmkklc8 : !this.dXrmkklc8;
    }

    public void D91ZKn9BG() {
        if (this.ilHKhw3Yw == null) {
            this.ilHKhw3Yw = new aXI58Y1kr();
        }
    }

    public int DEe4ujgEA() {
        View BRiz0pFYm = BRiz0pFYm(0, WaUP0CF08(), true, false);
        if (BRiz0pFYm == null) {
            return -1;
        }
        return TyB1UUd72(BRiz0pFYm);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void DuuXfa7LE(AccessibilityEvent accessibilityEvent) {
        super.DuuXfa7LE(accessibilityEvent);
        if (WaUP0CF08() > 0) {
            accessibilityEvent.setFromIndex(ZDWv1omvl());
            accessibilityEvent.setToIndex(RxmCfmRJo());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public View Eeka1udhb(int i) {
        int WaUP0CF08 = WaUP0CF08();
        if (WaUP0CF08 == 0) {
            return null;
        }
        int TyB1UUd72 = i - TyB1UUd72(sk5s77z6Q(0));
        if (TyB1UUd72 >= 0 && TyB1UUd72 < WaUP0CF08) {
            View sk5s77z6Q = sk5s77z6Q(TyB1UUd72);
            if (TyB1UUd72(sk5s77z6Q) == i) {
                return sk5s77z6Q;
            }
        }
        return super.Eeka1udhb(i);
    }

    public final int GpWTsCbvo(RecyclerView.kvFwRYSUX kvfwrysux) {
        if (WaUP0CF08() == 0) {
            return 0;
        }
        D91ZKn9BG();
        return pA5wCkne4.dIocxURUo(kvfwrysux, this.qVUwofr5s, zH62iiANw(!this.sk5s77z6Q, true), PGC7L87Ev(!this.sk5s77z6Q, true), this, this.sk5s77z6Q);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void IG30YE5GU(Parcelable parcelable) {
        if (parcelable instanceof qhPEQQaQ4) {
            qhPEQQaQ4 qhpeqqaq4 = (qhPEQQaQ4) parcelable;
            this.dfpT1j18n = qhpeqqaq4;
            if (this.WaUP0CF08 != -1) {
                qhpeqqaq4.CBQ5d1kRq = -1;
            }
            uSBmk4hFZ();
        }
    }

    public void JBD2u58uX(boolean z) {
        dIocxURUo(null);
        if (this.ixWaw2akD != z) {
            this.ixWaw2akD = z;
            uSBmk4hFZ();
        }
    }

    public final void JGeS2kPDj(RecyclerView.V1xq9aVRv v1xq9aVRv, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    ShSN9wbzk(i3, v1xq9aVRv);
                }
                return;
            }
            while (i > i2) {
                ShSN9wbzk(i, v1xq9aVRv);
                i--;
            }
        }
    }

    public final View JMpnD40gh() {
        return sk5s77z6Q(this.RG6kpfv3v ? WaUP0CF08() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public int JxIJId84K(int i, RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux) {
        if (this.MzoOEjc4X == 0) {
            return 0;
        }
        return Nr79Zh2zt(i, v1xq9aVRv, kvfwrysux);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public boolean L4EwGfXiQ() {
        return true;
    }

    public void LFW0KvNFt(RecyclerView.kvFwRYSUX kvfwrysux, int[] iArr) {
        int i;
        int CBQ5d1kRq = kvfwrysux.q3BipwRCk != -1 ? this.qVUwofr5s.CBQ5d1kRq() : 0;
        if (this.ilHKhw3Yw.iiGwOFFnr == -1) {
            i = 0;
        } else {
            i = CBQ5d1kRq;
            CBQ5d1kRq = 0;
        }
        iArr[0] = CBQ5d1kRq;
        iArr[1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0175  */
    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void M66hQ219i(RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View Eeka1udhb;
        int i7;
        int i8;
        boolean z;
        boolean z2;
        View zBLRafG4A;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (!(this.dfpT1j18n == null && this.WaUP0CF08 == -1) && kvfwrysux.J4Ux7ym32() == 0) {
            lqFHPHdW3(v1xq9aVRv);
            return;
        }
        qhPEQQaQ4 qhpeqqaq4 = this.dfpT1j18n;
        if (qhpeqqaq4 != null && qhpeqqaq4.J4Ux7ym32()) {
            this.WaUP0CF08 = this.dfpT1j18n.CBQ5d1kRq;
        }
        D91ZKn9BG();
        this.ilHKhw3Yw.q3BipwRCk = false;
        CK4pxGbcv();
        View mUqPm6GBh = mUqPm6GBh();
        RG2GI7LDp rG2GI7LDp = this.iMyQMM6Qj;
        boolean z3 = true;
        if (!rG2GI7LDp.kCA6Zs9sL || this.WaUP0CF08 != -1 || this.dfpT1j18n != null) {
            rG2GI7LDp.dIocxURUo();
            RG2GI7LDp rG2GI7LDp2 = this.iMyQMM6Qj;
            rG2GI7LDp2.dIocxURUo = this.RG6kpfv3v ^ this.ixWaw2akD;
            if (!kvfwrysux.GPLPRo6go && (i9 = this.WaUP0CF08) != -1) {
                if (i9 < 0 || i9 >= kvfwrysux.J4Ux7ym32()) {
                    this.WaUP0CF08 = -1;
                    this.i8XZMQc6Z = Integer.MIN_VALUE;
                } else {
                    rG2GI7LDp2.J4Ux7ym32 = this.WaUP0CF08;
                    qhPEQQaQ4 qhpeqqaq42 = this.dfpT1j18n;
                    if (qhpeqqaq42 != null && qhpeqqaq42.J4Ux7ym32()) {
                        boolean z4 = this.dfpT1j18n.Bhmn1KIah;
                        rG2GI7LDp2.dIocxURUo = z4;
                        if (z4) {
                            i14 = this.qVUwofr5s.GPLPRo6go();
                            i13 = this.dfpT1j18n.kmSgne1rO;
                            i10 = i14 - i13;
                        } else {
                            i12 = this.qVUwofr5s.vPSbyrYWX();
                            i11 = this.dfpT1j18n.kmSgne1rO;
                            i10 = i12 + i11;
                        }
                    } else if (this.i8XZMQc6Z == Integer.MIN_VALUE) {
                        View Eeka1udhb2 = Eeka1udhb(this.WaUP0CF08);
                        if (Eeka1udhb2 != null) {
                            if (this.qVUwofr5s.tGV7Q6urW(Eeka1udhb2) <= this.qVUwofr5s.CBQ5d1kRq()) {
                                if (this.qVUwofr5s.kCA6Zs9sL(Eeka1udhb2) - this.qVUwofr5s.vPSbyrYWX() < 0) {
                                    rG2GI7LDp2.tGV7Q6urW = this.qVUwofr5s.vPSbyrYWX();
                                    rG2GI7LDp2.dIocxURUo = false;
                                } else if (this.qVUwofr5s.GPLPRo6go() - this.qVUwofr5s.J4Ux7ym32(Eeka1udhb2) < 0) {
                                    rG2GI7LDp2.tGV7Q6urW = this.qVUwofr5s.GPLPRo6go();
                                    rG2GI7LDp2.dIocxURUo = true;
                                } else {
                                    rG2GI7LDp2.tGV7Q6urW = rG2GI7LDp2.dIocxURUo ? this.qVUwofr5s.kmSgne1rO() + this.qVUwofr5s.J4Ux7ym32(Eeka1udhb2) : this.qVUwofr5s.kCA6Zs9sL(Eeka1udhb2);
                                }
                                z = true;
                                if (!z) {
                                    if (WaUP0CF08() != 0) {
                                        View mUqPm6GBh2 = mUqPm6GBh();
                                        if (mUqPm6GBh2 != null) {
                                            RecyclerView.dgsh68zH8 dgsh68zh8 = (RecyclerView.dgsh68zH8) mUqPm6GBh2.getLayoutParams();
                                            if (!dgsh68zh8.tGV7Q6urW() && dgsh68zh8.q3BipwRCk() >= 0 && dgsh68zh8.q3BipwRCk() < kvfwrysux.J4Ux7ym32()) {
                                                rG2GI7LDp2.tGV7Q6urW(mUqPm6GBh2, TyB1UUd72(mUqPm6GBh2));
                                                z2 = true;
                                                if (!z2) {
                                                    rG2GI7LDp2.q3BipwRCk();
                                                    rG2GI7LDp2.J4Ux7ym32 = this.ixWaw2akD ? kvfwrysux.J4Ux7ym32() - 1 : 0;
                                                }
                                            }
                                        }
                                        boolean z5 = this.Eeka1udhb;
                                        boolean z6 = this.ixWaw2akD;
                                        if (z5 == z6 && (zBLRafG4A = zBLRafG4A(v1xq9aVRv, kvfwrysux, rG2GI7LDp2.dIocxURUo, z6)) != null) {
                                            rG2GI7LDp2.J4Ux7ym32(zBLRafG4A, TyB1UUd72(zBLRafG4A));
                                            if (!kvfwrysux.GPLPRo6go && oRfL5Lv1q()) {
                                                int kCA6Zs9sL = this.qVUwofr5s.kCA6Zs9sL(zBLRafG4A);
                                                int J4Ux7ym32 = this.qVUwofr5s.J4Ux7ym32(zBLRafG4A);
                                                int vPSbyrYWX = this.qVUwofr5s.vPSbyrYWX();
                                                int GPLPRo6go = this.qVUwofr5s.GPLPRo6go();
                                                boolean z7 = J4Ux7ym32 <= vPSbyrYWX && kCA6Zs9sL < vPSbyrYWX;
                                                boolean z8 = kCA6Zs9sL >= GPLPRo6go && J4Ux7ym32 > GPLPRo6go;
                                                if (z7 || z8) {
                                                    if (rG2GI7LDp2.dIocxURUo) {
                                                        vPSbyrYWX = GPLPRo6go;
                                                    }
                                                    rG2GI7LDp2.tGV7Q6urW = vPSbyrYWX;
                                                }
                                            }
                                            z2 = true;
                                            if (!z2) {
                                            }
                                        }
                                    }
                                    z2 = false;
                                    if (!z2) {
                                    }
                                }
                                this.iMyQMM6Qj.kCA6Zs9sL = true;
                            }
                        } else if (WaUP0CF08() > 0) {
                            rG2GI7LDp2.dIocxURUo = (this.WaUP0CF08 < TyB1UUd72(sk5s77z6Q(0))) == this.RG6kpfv3v;
                        }
                        rG2GI7LDp2.q3BipwRCk();
                        z = true;
                        if (!z) {
                        }
                        this.iMyQMM6Qj.kCA6Zs9sL = true;
                    } else {
                        boolean z9 = this.RG6kpfv3v;
                        rG2GI7LDp2.dIocxURUo = z9;
                        if (z9) {
                            i14 = this.qVUwofr5s.GPLPRo6go();
                            i13 = this.i8XZMQc6Z;
                            i10 = i14 - i13;
                        } else {
                            i12 = this.qVUwofr5s.vPSbyrYWX();
                            i11 = this.i8XZMQc6Z;
                            i10 = i12 + i11;
                        }
                    }
                    rG2GI7LDp2.tGV7Q6urW = i10;
                    z = true;
                    if (!z) {
                    }
                    this.iMyQMM6Qj.kCA6Zs9sL = true;
                }
            }
            z = false;
            if (!z) {
            }
            this.iMyQMM6Qj.kCA6Zs9sL = true;
        } else if (mUqPm6GBh != null && (this.qVUwofr5s.kCA6Zs9sL(mUqPm6GBh) >= this.qVUwofr5s.GPLPRo6go() || this.qVUwofr5s.J4Ux7ym32(mUqPm6GBh) <= this.qVUwofr5s.vPSbyrYWX())) {
            this.iMyQMM6Qj.tGV7Q6urW(mUqPm6GBh, TyB1UUd72(mUqPm6GBh));
        }
        aXI58Y1kr axi58y1kr = this.ilHKhw3Yw;
        axi58y1kr.iiGwOFFnr = axi58y1kr.oon79WMrY >= 0 ? 1 : -1;
        int[] iArr = this.CpG0imbht;
        iArr[0] = 0;
        iArr[1] = 0;
        LFW0KvNFt(kvfwrysux, iArr);
        int vPSbyrYWX2 = this.qVUwofr5s.vPSbyrYWX() + Math.max(0, this.CpG0imbht[0]);
        int Puu3Rhg4F = this.qVUwofr5s.Puu3Rhg4F() + Math.max(0, this.CpG0imbht[1]);
        if (!(!kvfwrysux.GPLPRo6go || (i6 = this.WaUP0CF08) == -1 || this.i8XZMQc6Z == Integer.MIN_VALUE || (Eeka1udhb = Eeka1udhb(i6)) == null)) {
            if (this.RG6kpfv3v) {
                i7 = this.qVUwofr5s.GPLPRo6go() - this.qVUwofr5s.J4Ux7ym32(Eeka1udhb);
                i8 = this.i8XZMQc6Z;
            } else {
                i8 = this.qVUwofr5s.kCA6Zs9sL(Eeka1udhb) - this.qVUwofr5s.vPSbyrYWX();
                i7 = this.i8XZMQc6Z;
            }
            int i15 = i7 - i8;
            if (i15 > 0) {
                vPSbyrYWX2 += i15;
            } else {
                Puu3Rhg4F -= i15;
            }
        }
        RG2GI7LDp rG2GI7LDp3 = this.iMyQMM6Qj;
        ShOkzyJ3y(v1xq9aVRv, kvfwrysux, rG2GI7LDp3, (!rG2GI7LDp3.dIocxURUo ? !this.RG6kpfv3v : this.RG6kpfv3v) ? 1 : -1);
        ilHKhw3Yw(v1xq9aVRv);
        this.ilHKhw3Yw.CBQ5d1kRq = PMt6uLcRh();
        Objects.requireNonNull(this.ilHKhw3Yw);
        this.ilHKhw3Yw.yWvV4ePLl = 0;
        RG2GI7LDp rG2GI7LDp4 = this.iMyQMM6Qj;
        if (rG2GI7LDp4.dIocxURUo) {
            T8Uf8qCOA(rG2GI7LDp4.J4Ux7ym32, rG2GI7LDp4.tGV7Q6urW);
            aXI58Y1kr axi58y1kr2 = this.ilHKhw3Yw;
            axi58y1kr2.Puu3Rhg4F = vPSbyrYWX2;
            pwwzaxl9D(v1xq9aVRv, axi58y1kr2, kvfwrysux, false);
            aXI58Y1kr axi58y1kr3 = this.ilHKhw3Yw;
            i2 = axi58y1kr3.J4Ux7ym32;
            int i16 = axi58y1kr3.dIocxURUo;
            int i17 = axi58y1kr3.tGV7Q6urW;
            if (i17 > 0) {
                Puu3Rhg4F += i17;
            }
            RG2GI7LDp rG2GI7LDp5 = this.iMyQMM6Qj;
            Ar5KPv1W1(rG2GI7LDp5.J4Ux7ym32, rG2GI7LDp5.tGV7Q6urW);
            aXI58Y1kr axi58y1kr4 = this.ilHKhw3Yw;
            axi58y1kr4.Puu3Rhg4F = Puu3Rhg4F;
            axi58y1kr4.dIocxURUo += axi58y1kr4.kCA6Zs9sL;
            pwwzaxl9D(v1xq9aVRv, axi58y1kr4, kvfwrysux, false);
            aXI58Y1kr axi58y1kr5 = this.ilHKhw3Yw;
            i = axi58y1kr5.J4Ux7ym32;
            int i18 = axi58y1kr5.tGV7Q6urW;
            if (i18 > 0) {
                T8Uf8qCOA(i16, i2);
                aXI58Y1kr axi58y1kr6 = this.ilHKhw3Yw;
                axi58y1kr6.Puu3Rhg4F = i18;
                pwwzaxl9D(v1xq9aVRv, axi58y1kr6, kvfwrysux, false);
                i2 = this.ilHKhw3Yw.J4Ux7ym32;
            }
        } else {
            Ar5KPv1W1(rG2GI7LDp4.J4Ux7ym32, rG2GI7LDp4.tGV7Q6urW);
            aXI58Y1kr axi58y1kr7 = this.ilHKhw3Yw;
            axi58y1kr7.Puu3Rhg4F = Puu3Rhg4F;
            pwwzaxl9D(v1xq9aVRv, axi58y1kr7, kvfwrysux, false);
            aXI58Y1kr axi58y1kr8 = this.ilHKhw3Yw;
            i = axi58y1kr8.J4Ux7ym32;
            int i19 = axi58y1kr8.dIocxURUo;
            int i20 = axi58y1kr8.tGV7Q6urW;
            if (i20 > 0) {
                vPSbyrYWX2 += i20;
            }
            RG2GI7LDp rG2GI7LDp6 = this.iMyQMM6Qj;
            T8Uf8qCOA(rG2GI7LDp6.J4Ux7ym32, rG2GI7LDp6.tGV7Q6urW);
            aXI58Y1kr axi58y1kr9 = this.ilHKhw3Yw;
            axi58y1kr9.Puu3Rhg4F = vPSbyrYWX2;
            axi58y1kr9.dIocxURUo += axi58y1kr9.kCA6Zs9sL;
            pwwzaxl9D(v1xq9aVRv, axi58y1kr9, kvfwrysux, false);
            aXI58Y1kr axi58y1kr10 = this.ilHKhw3Yw;
            i2 = axi58y1kr10.J4Ux7ym32;
            int i21 = axi58y1kr10.tGV7Q6urW;
            if (i21 > 0) {
                Ar5KPv1W1(i19, i);
                aXI58Y1kr axi58y1kr11 = this.ilHKhw3Yw;
                axi58y1kr11.Puu3Rhg4F = i21;
                pwwzaxl9D(v1xq9aVRv, axi58y1kr11, kvfwrysux, false);
                i = this.ilHKhw3Yw.J4Ux7ym32;
            }
        }
        if (WaUP0CF08() > 0) {
            if (this.RG6kpfv3v ^ this.ixWaw2akD) {
                int QTMTeusAu = QTMTeusAu(i, v1xq9aVRv, kvfwrysux, true);
                i4 = i2 + QTMTeusAu;
                i3 = i + QTMTeusAu;
                i5 = ASYHiorQ0(i4, v1xq9aVRv, kvfwrysux, false);
            } else {
                int ASYHiorQ0 = ASYHiorQ0(i2, v1xq9aVRv, kvfwrysux, true);
                i4 = i2 + ASYHiorQ0;
                i3 = i + ASYHiorQ0;
                i5 = QTMTeusAu(i3, v1xq9aVRv, kvfwrysux, false);
            }
            i2 = i4 + i5;
            i = i3 + i5;
        }
        if (kvfwrysux.vPSbyrYWX && WaUP0CF08() != 0 && !kvfwrysux.GPLPRo6go && oRfL5Lv1q()) {
            List list = v1xq9aVRv.dIocxURUo;
            int size = list.size();
            int TyB1UUd72 = TyB1UUd72(sk5s77z6Q(0));
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            while (i22 < size) {
                RecyclerView.cywn6086a cywn6086a = (RecyclerView.cywn6086a) list.get(i22);
                if (!cywn6086a.CBQ5d1kRq()) {
                    boolean z10 = (cywn6086a.kCA6Zs9sL() < TyB1UUd72 ? z3 : false) != this.RG6kpfv3v ? true : true;
                    int tGV7Q6urW = this.qVUwofr5s.tGV7Q6urW(cywn6086a.q3BipwRCk);
                    if (z10) {
                        i23 += tGV7Q6urW;
                    } else {
                        i24 += tGV7Q6urW;
                    }
                }
                i22++;
                z3 = true;
            }
            this.ilHKhw3Yw.vPSbyrYWX = list;
            if (i23 > 0) {
                T8Uf8qCOA(TyB1UUd72(JMpnD40gh()), i2);
                aXI58Y1kr axi58y1kr12 = this.ilHKhw3Yw;
                axi58y1kr12.Puu3Rhg4F = i23;
                axi58y1kr12.tGV7Q6urW = 0;
                axi58y1kr12.q3BipwRCk(null);
                pwwzaxl9D(v1xq9aVRv, this.ilHKhw3Yw, kvfwrysux, false);
            }
            if (i24 > 0) {
                Ar5KPv1W1(TyB1UUd72(ZNy395opV()), i);
                aXI58Y1kr axi58y1kr13 = this.ilHKhw3Yw;
                axi58y1kr13.Puu3Rhg4F = i24;
                axi58y1kr13.tGV7Q6urW = 0;
                axi58y1kr13.q3BipwRCk(null);
                pwwzaxl9D(v1xq9aVRv, this.ilHKhw3Yw, kvfwrysux, false);
            }
            this.ilHKhw3Yw.vPSbyrYWX = null;
        }
        if (!kvfwrysux.GPLPRo6go) {
            Fj4Wp9wly fj4Wp9wly = this.qVUwofr5s;
            fj4Wp9wly.J4Ux7ym32 = fj4Wp9wly.CBQ5d1kRq();
        } else {
            this.iMyQMM6Qj.dIocxURUo();
        }
        this.Eeka1udhb = this.ixWaw2akD;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public int MzoOEjc4X(RecyclerView.kvFwRYSUX kvfwrysux) {
        return GpWTsCbvo(kvfwrysux);
    }

    public int Nr79Zh2zt(int i, RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux) {
        if (WaUP0CF08() == 0 || i == 0) {
            return 0;
        }
        D91ZKn9BG();
        this.ilHKhw3Yw.q3BipwRCk = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        ZxgfQJSvV(i2, abs, true, kvfwrysux);
        aXI58Y1kr axi58y1kr = this.ilHKhw3Yw;
        int pwwzaxl9D = pwwzaxl9D(v1xq9aVRv, axi58y1kr, kvfwrysux, false) + axi58y1kr.GPLPRo6go;
        if (pwwzaxl9D < 0) {
            return 0;
        }
        if (abs > pwwzaxl9D) {
            i = i2 * pwwzaxl9D;
        }
        this.qVUwofr5s.MzoOEjc4X(-i);
        this.ilHKhw3Yw.oon79WMrY = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void OpLJtmvFM(RecyclerView recyclerView, RecyclerView.V1xq9aVRv v1xq9aVRv) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void OuoYhTxyj(RecyclerView recyclerView, RecyclerView.kvFwRYSUX kvfwrysux, int i) {
        NySN5IVuc nySN5IVuc = new NySN5IVuc(recyclerView.getContext());
        nySN5IVuc.q3BipwRCk = i;
        tTcQQNK5P(nySN5IVuc);
    }

    public View PGC7L87Ev(boolean z, boolean z2) {
        int WaUP0CF08;
        int i;
        if (this.RG6kpfv3v) {
            WaUP0CF08 = 0;
            i = WaUP0CF08();
        } else {
            WaUP0CF08 = WaUP0CF08() - 1;
            i = -1;
        }
        return BRiz0pFYm(WaUP0CF08, i, z, z2);
    }

    public boolean PMt6uLcRh() {
        return this.qVUwofr5s.yWvV4ePLl() == 0 && this.qVUwofr5s.iiGwOFFnr() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public int PSTqBLTET(RecyclerView.kvFwRYSUX kvfwrysux) {
        return eUlgH2VO7(kvfwrysux);
    }

    public final int QTMTeusAu(int i, RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux, boolean z) {
        int GPLPRo6go;
        int GPLPRo6go2 = this.qVUwofr5s.GPLPRo6go() - i;
        if (GPLPRo6go2 <= 0) {
            return 0;
        }
        int i2 = -Nr79Zh2zt(-GPLPRo6go2, v1xq9aVRv, kvfwrysux);
        int i3 = i + i2;
        if (!z || (GPLPRo6go = this.qVUwofr5s.GPLPRo6go() - i3) <= 0) {
            return i2;
        }
        this.qVUwofr5s.MzoOEjc4X(GPLPRo6go);
        return GPLPRo6go + i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void R2hkbNqWf(RecyclerView.kvFwRYSUX kvfwrysux) {
        this.dfpT1j18n = null;
        this.WaUP0CF08 = -1;
        this.i8XZMQc6Z = Integer.MIN_VALUE;
        this.iMyQMM6Qj.dIocxURUo();
    }

    public int RxmCfmRJo() {
        View BRiz0pFYm = BRiz0pFYm(WaUP0CF08() - 1, -1, false, true);
        if (BRiz0pFYm == null) {
            return -1;
        }
        return TyB1UUd72(BRiz0pFYm);
    }

    public void ShOkzyJ3y(RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux, RG2GI7LDp rG2GI7LDp, int i) {
    }

    public final void T8Uf8qCOA(int i, int i2) {
        this.ilHKhw3Yw.tGV7Q6urW = i2 - this.qVUwofr5s.vPSbyrYWX();
        aXI58Y1kr axi58y1kr = this.ilHKhw3Yw;
        axi58y1kr.dIocxURUo = i;
        axi58y1kr.kCA6Zs9sL = this.RG6kpfv3v ? 1 : -1;
        axi58y1kr.iiGwOFFnr = -1;
        axi58y1kr.J4Ux7ym32 = i2;
        axi58y1kr.GPLPRo6go = Integer.MIN_VALUE;
    }

    public void TpbsiPM9j(int i) {
        if (i == 0 || i == 1) {
            dIocxURUo(null);
            if (i != this.MzoOEjc4X || this.qVUwofr5s == null) {
                Fj4Wp9wly q3BipwRCk = Fj4Wp9wly.q3BipwRCk(this, i);
                this.qVUwofr5s = q3BipwRCk;
                this.iMyQMM6Qj.q3BipwRCk = q3BipwRCk;
                this.MzoOEjc4X = i;
                uSBmk4hFZ();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }

    public void XGA7b0zuB(RecyclerView.kvFwRYSUX kvfwrysux, aXI58Y1kr axi58y1kr, RecyclerView.LULQkQlc9.RG2GI7LDp rG2GI7LDp) {
        int i = axi58y1kr.dIocxURUo;
        if (i >= 0 && i < kvfwrysux.J4Ux7ym32()) {
            ((aXI58Y1kr.RG2GI7LDp) rG2GI7LDp).q3BipwRCk(i, Math.max(0, axi58y1kr.GPLPRo6go));
        }
    }

    public final int Xeg1rC5FI(RecyclerView.kvFwRYSUX kvfwrysux) {
        if (WaUP0CF08() == 0) {
            return 0;
        }
        D91ZKn9BG();
        return pA5wCkne4.J4Ux7ym32(kvfwrysux, this.qVUwofr5s, zH62iiANw(!this.sk5s77z6Q, true), PGC7L87Ev(!this.sk5s77z6Q, true), this, this.sk5s77z6Q);
    }

    public int ZDWv1omvl() {
        View BRiz0pFYm = BRiz0pFYm(0, WaUP0CF08(), false, true);
        if (BRiz0pFYm == null) {
            return -1;
        }
        return TyB1UUd72(BRiz0pFYm);
    }

    public final View ZNy395opV() {
        return sk5s77z6Q(this.RG6kpfv3v ? 0 : WaUP0CF08() - 1);
    }

    public final void ZxgfQJSvV(int i, int i2, boolean z, RecyclerView.kvFwRYSUX kvfwrysux) {
        int i3;
        this.ilHKhw3Yw.CBQ5d1kRq = PMt6uLcRh();
        this.ilHKhw3Yw.iiGwOFFnr = i;
        int[] iArr = this.CpG0imbht;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        LFW0KvNFt(kvfwrysux, iArr);
        int max = Math.max(0, this.CpG0imbht[0]);
        int max2 = Math.max(0, this.CpG0imbht[1]);
        if (i == 1) {
            z2 = true;
        }
        aXI58Y1kr axi58y1kr = this.ilHKhw3Yw;
        int i5 = z2 ? max2 : max;
        axi58y1kr.Puu3Rhg4F = i5;
        if (!z2) {
            max = max2;
        }
        axi58y1kr.yWvV4ePLl = max;
        if (z2) {
            axi58y1kr.Puu3Rhg4F = this.qVUwofr5s.Puu3Rhg4F() + i5;
            View ZNy395opV = ZNy395opV();
            aXI58Y1kr axi58y1kr2 = this.ilHKhw3Yw;
            if (this.RG6kpfv3v) {
                i4 = -1;
            }
            axi58y1kr2.kCA6Zs9sL = i4;
            int TyB1UUd72 = TyB1UUd72(ZNy395opV);
            aXI58Y1kr axi58y1kr3 = this.ilHKhw3Yw;
            axi58y1kr2.dIocxURUo = TyB1UUd72 + axi58y1kr3.kCA6Zs9sL;
            axi58y1kr3.J4Ux7ym32 = this.qVUwofr5s.J4Ux7ym32(ZNy395opV);
            i3 = this.qVUwofr5s.J4Ux7ym32(ZNy395opV) - this.qVUwofr5s.GPLPRo6go();
        } else {
            View JMpnD40gh = JMpnD40gh();
            aXI58Y1kr axi58y1kr4 = this.ilHKhw3Yw;
            axi58y1kr4.Puu3Rhg4F = this.qVUwofr5s.vPSbyrYWX() + axi58y1kr4.Puu3Rhg4F;
            aXI58Y1kr axi58y1kr5 = this.ilHKhw3Yw;
            if (!this.RG6kpfv3v) {
                i4 = -1;
            }
            axi58y1kr5.kCA6Zs9sL = i4;
            int TyB1UUd722 = TyB1UUd72(JMpnD40gh);
            aXI58Y1kr axi58y1kr6 = this.ilHKhw3Yw;
            axi58y1kr5.dIocxURUo = TyB1UUd722 + axi58y1kr6.kCA6Zs9sL;
            axi58y1kr6.J4Ux7ym32 = this.qVUwofr5s.kCA6Zs9sL(JMpnD40gh);
            i3 = (-this.qVUwofr5s.kCA6Zs9sL(JMpnD40gh)) + this.qVUwofr5s.vPSbyrYWX();
        }
        aXI58Y1kr axi58y1kr7 = this.ilHKhw3Yw;
        axi58y1kr7.tGV7Q6urW = i2;
        if (z) {
            axi58y1kr7.tGV7Q6urW = i2 - i3;
        }
        axi58y1kr7.GPLPRo6go = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public int a8N8UmDyD(int i, RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux) {
        if (this.MzoOEjc4X == 1) {
            return 0;
        }
        return Nr79Zh2zt(i, v1xq9aVRv, kvfwrysux);
    }

    public final void b8mIp5vIr(RecyclerView.V1xq9aVRv v1xq9aVRv, aXI58Y1kr axi58y1kr) {
        if (axi58y1kr.q3BipwRCk && !axi58y1kr.CBQ5d1kRq) {
            int i = axi58y1kr.GPLPRo6go;
            int i2 = axi58y1kr.yWvV4ePLl;
            if (axi58y1kr.iiGwOFFnr == -1) {
                int WaUP0CF08 = WaUP0CF08();
                if (i >= 0) {
                    int iiGwOFFnr = (this.qVUwofr5s.iiGwOFFnr() - i) + i2;
                    if (this.RG6kpfv3v) {
                        for (int i3 = 0; i3 < WaUP0CF08; i3++) {
                            View sk5s77z6Q = sk5s77z6Q(i3);
                            if (this.qVUwofr5s.kCA6Zs9sL(sk5s77z6Q) < iiGwOFFnr || this.qVUwofr5s.PSTqBLTET(sk5s77z6Q) < iiGwOFFnr) {
                                JGeS2kPDj(v1xq9aVRv, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = WaUP0CF08 - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View sk5s77z6Q2 = sk5s77z6Q(i5);
                        if (this.qVUwofr5s.kCA6Zs9sL(sk5s77z6Q2) < iiGwOFFnr || this.qVUwofr5s.PSTqBLTET(sk5s77z6Q2) < iiGwOFFnr) {
                            JGeS2kPDj(v1xq9aVRv, i4, i5);
                            return;
                        }
                    }
                }
            } else if (i >= 0) {
                int i6 = i - i2;
                int WaUP0CF082 = WaUP0CF08();
                if (this.RG6kpfv3v) {
                    int i7 = WaUP0CF082 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View sk5s77z6Q3 = sk5s77z6Q(i8);
                        if (this.qVUwofr5s.J4Ux7ym32(sk5s77z6Q3) > i6 || this.qVUwofr5s.Bhmn1KIah(sk5s77z6Q3) > i6) {
                            JGeS2kPDj(v1xq9aVRv, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < WaUP0CF082; i9++) {
                    View sk5s77z6Q4 = sk5s77z6Q(i9);
                    if (this.qVUwofr5s.J4Ux7ym32(sk5s77z6Q4) > i6 || this.qVUwofr5s.Bhmn1KIah(sk5s77z6Q4) > i6) {
                        JGeS2kPDj(v1xq9aVRv, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    public boolean bL31fPM8I() {
        return vNtjxmzUM() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public Parcelable buPcffgdD() {
        qhPEQQaQ4 qhpeqqaq4 = this.dfpT1j18n;
        if (qhpeqqaq4 != null) {
            return new qhPEQQaQ4(qhpeqqaq4);
        }
        qhPEQQaQ4 qhpeqqaq42 = new qhPEQQaQ4();
        if (WaUP0CF08() > 0) {
            D91ZKn9BG();
            boolean z = this.Eeka1udhb ^ this.RG6kpfv3v;
            qhpeqqaq42.Bhmn1KIah = z;
            if (z) {
                View ZNy395opV = ZNy395opV();
                qhpeqqaq42.kmSgne1rO = this.qVUwofr5s.GPLPRo6go() - this.qVUwofr5s.J4Ux7ym32(ZNy395opV);
                qhpeqqaq42.CBQ5d1kRq = TyB1UUd72(ZNy395opV);
            } else {
                View JMpnD40gh = JMpnD40gh();
                qhpeqqaq42.CBQ5d1kRq = TyB1UUd72(JMpnD40gh);
                qhpeqqaq42.kmSgne1rO = this.qVUwofr5s.kCA6Zs9sL(JMpnD40gh) - this.qVUwofr5s.vPSbyrYWX();
            }
        } else {
            qhpeqqaq42.CBQ5d1kRq = -1;
        }
        return qhpeqqaq42;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void dIocxURUo(String str) {
        RecyclerView recyclerView;
        if (this.dfpT1j18n == null && (recyclerView = this.J4Ux7ym32) != null) {
            recyclerView.yWvV4ePLl(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public RecyclerView.dgsh68zH8 dXrmkklc8() {
        return new RecyclerView.dgsh68zH8(-2, -2);
    }

    public final int eUlgH2VO7(RecyclerView.kvFwRYSUX kvfwrysux) {
        if (WaUP0CF08() == 0) {
            return 0;
        }
        D91ZKn9BG();
        return pA5wCkne4.tGV7Q6urW(kvfwrysux, this.qVUwofr5s, zH62iiANw(!this.sk5s77z6Q, true), PGC7L87Ev(!this.sk5s77z6Q, true), this, this.sk5s77z6Q, this.RG6kpfv3v);
    }

    public int eylCJcWC7(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.MzoOEjc4X == 1) ? 1 : Integer.MIN_VALUE : this.MzoOEjc4X == 0 ? 1 : Integer.MIN_VALUE : this.MzoOEjc4X == 1 ? -1 : Integer.MIN_VALUE : this.MzoOEjc4X == 0 ? -1 : Integer.MIN_VALUE : (this.MzoOEjc4X != 1 && bL31fPM8I()) ? -1 : 1 : (this.MzoOEjc4X != 1 && bL31fPM8I()) ? 1 : -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public boolean ifDs8fRNm() {
        boolean z;
        if (this.kmSgne1rO == 1073741824 || this.CBQ5d1kRq == 1073741824) {
            return false;
        }
        int WaUP0CF08 = WaUP0CF08();
        int i = 0;
        while (true) {
            if (i >= WaUP0CF08) {
                z = false;
                break;
            }
            ViewGroup.LayoutParams layoutParams = sk5s77z6Q(i).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                z = true;
                break;
            }
            i++;
        }
        return z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public boolean iiGwOFFnr() {
        return this.MzoOEjc4X == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public boolean kCA6Zs9sL() {
        return this.MzoOEjc4X == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public int kmSgne1rO(RecyclerView.kvFwRYSUX kvfwrysux) {
        return GpWTsCbvo(kvfwrysux);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public boolean oRfL5Lv1q() {
        return this.dfpT1j18n == null && this.Eeka1udhb == this.ixWaw2akD;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void oon79WMrY(int i, RecyclerView.LULQkQlc9.RG2GI7LDp rG2GI7LDp) {
        boolean z;
        int i2;
        qhPEQQaQ4 qhpeqqaq4 = this.dfpT1j18n;
        int i3 = -1;
        if (qhpeqqaq4 == null || !qhpeqqaq4.J4Ux7ym32()) {
            CK4pxGbcv();
            z = this.RG6kpfv3v;
            i2 = this.WaUP0CF08;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            qhPEQQaQ4 qhpeqqaq42 = this.dfpT1j18n;
            z = qhpeqqaq42.Bhmn1KIah;
            i2 = qhpeqqaq42.CBQ5d1kRq;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.IytU16YUK && i2 >= 0 && i2 < i; i4++) {
            ((aXI58Y1kr.RG2GI7LDp) rG2GI7LDp).q3BipwRCk(i2, 0);
            i2 += i3;
        }
    }

    public int pwwzaxl9D(RecyclerView.V1xq9aVRv v1xq9aVRv, aXI58Y1kr axi58y1kr, RecyclerView.kvFwRYSUX kvfwrysux, boolean z) {
        int i = axi58y1kr.tGV7Q6urW;
        int i2 = axi58y1kr.GPLPRo6go;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                axi58y1kr.GPLPRo6go = i2 + i;
            }
            b8mIp5vIr(v1xq9aVRv, axi58y1kr);
        }
        int i3 = axi58y1kr.tGV7Q6urW + axi58y1kr.Puu3Rhg4F;
        mhl5lIdbQ mhl5lidbq = this.cAwN510t2;
        while (true) {
            if ((!axi58y1kr.CBQ5d1kRq && i3 <= 0) || !axi58y1kr.J4Ux7ym32(kvfwrysux)) {
                break;
            }
            mhl5lidbq.q3BipwRCk = 0;
            mhl5lidbq.J4Ux7ym32 = false;
            mhl5lidbq.tGV7Q6urW = false;
            mhl5lidbq.dIocxURUo = false;
            CBBuS2EIe(v1xq9aVRv, kvfwrysux, axi58y1kr, mhl5lidbq);
            if (!mhl5lidbq.J4Ux7ym32) {
                int i4 = axi58y1kr.J4Ux7ym32;
                int i5 = mhl5lidbq.q3BipwRCk;
                axi58y1kr.J4Ux7ym32 = (axi58y1kr.iiGwOFFnr * i5) + i4;
                if (!mhl5lidbq.tGV7Q6urW || axi58y1kr.vPSbyrYWX != null || !kvfwrysux.GPLPRo6go) {
                    axi58y1kr.tGV7Q6urW -= i5;
                    i3 -= i5;
                }
                int i6 = axi58y1kr.GPLPRo6go;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    axi58y1kr.GPLPRo6go = i7;
                    int i8 = axi58y1kr.tGV7Q6urW;
                    if (i8 < 0) {
                        axi58y1kr.GPLPRo6go = i7 + i8;
                    }
                    b8mIp5vIr(v1xq9aVRv, axi58y1kr);
                }
                if (z && mhl5lidbq.dIocxURUo) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - axi58y1kr.tGV7Q6urW;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kVmRinNH6.RG2GI7LDp
    public PointF q3BipwRCk(int i) {
        if (WaUP0CF08() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < TyB1UUd72(sk5s77z6Q(0))) {
            z = true;
        }
        if (z != this.RG6kpfv3v) {
            i2 = -1;
        }
        return this.MzoOEjc4X == 0 ? new PointF((float) i2, 0.0f) : new PointF(0.0f, (float) i2);
    }

    public int r2IGhIWDk() {
        View BRiz0pFYm = BRiz0pFYm(WaUP0CF08() - 1, -1, true, false);
        if (BRiz0pFYm == null) {
            return -1;
        }
        return TyB1UUd72(BRiz0pFYm);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void vIbyhVf1d(int i) {
        this.WaUP0CF08 = i;
        this.i8XZMQc6Z = Integer.MIN_VALUE;
        qhPEQQaQ4 qhpeqqaq4 = this.dfpT1j18n;
        if (qhpeqqaq4 != null) {
            qhpeqqaq4.CBQ5d1kRq = -1;
        }
        uSBmk4hFZ();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public int vPSbyrYWX(RecyclerView.kvFwRYSUX kvfwrysux) {
        return Xeg1rC5FI(kvfwrysux);
    }

    public View wrUk6NQP6(int i, int i2) {
        int i3;
        int i4;
        D91ZKn9BG();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return sk5s77z6Q(i);
        }
        if (this.qVUwofr5s.kCA6Zs9sL(sk5s77z6Q(i)) < this.qVUwofr5s.vPSbyrYWX()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return (this.MzoOEjc4X == 0 ? this.tGV7Q6urW : this.dIocxURUo).dIocxURUo(i, i2, i4, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void yWvV4ePLl(int i, int i2, RecyclerView.kvFwRYSUX kvfwrysux, RecyclerView.LULQkQlc9.RG2GI7LDp rG2GI7LDp) {
        if (this.MzoOEjc4X != 0) {
            i = i2;
        }
        if (WaUP0CF08() != 0 && i != 0) {
            D91ZKn9BG();
            ZxgfQJSvV(i > 0 ? 1 : -1, Math.abs(i), true, kvfwrysux);
            XGA7b0zuB(kvfwrysux, this.ilHKhw3Yw, rG2GI7LDp);
        }
    }

    public View zBLRafG4A(RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux, boolean z, boolean z2) {
        int i;
        int i2;
        D91ZKn9BG();
        r2 = WaUP0CF08();
        int i3 = -1;
        if (z2) {
            i2 = WaUP0CF08() - 1;
            i = -1;
        } else {
            i2 = 0;
            i = 1;
        }
        int J4Ux7ym32 = kvfwrysux.J4Ux7ym32();
        int vPSbyrYWX = this.qVUwofr5s.vPSbyrYWX();
        int GPLPRo6go = this.qVUwofr5s.GPLPRo6go();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i3) {
            View sk5s77z6Q = sk5s77z6Q(i2);
            int TyB1UUd72 = TyB1UUd72(sk5s77z6Q);
            int kCA6Zs9sL = this.qVUwofr5s.kCA6Zs9sL(sk5s77z6Q);
            int J4Ux7ym322 = this.qVUwofr5s.J4Ux7ym32(sk5s77z6Q);
            if (TyB1UUd72 >= 0 && TyB1UUd72 < J4Ux7ym32) {
                if (!((RecyclerView.dgsh68zH8) sk5s77z6Q.getLayoutParams()).tGV7Q6urW()) {
                    boolean z3 = J4Ux7ym322 <= vPSbyrYWX && kCA6Zs9sL < vPSbyrYWX;
                    boolean z4 = kCA6Zs9sL >= GPLPRo6go && J4Ux7ym322 > GPLPRo6go;
                    if (!z3 && !z4) {
                        return sk5s77z6Q;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = sk5s77z6Q;
                        }
                        view2 = sk5s77z6Q;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = sk5s77z6Q;
                        }
                        view2 = sk5s77z6Q;
                    }
                } else if (view3 == null) {
                    view3 = sk5s77z6Q;
                }
            }
            i2 += i;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    public View zH62iiANw(boolean z, boolean z2) {
        int i;
        int WaUP0CF08;
        if (this.RG6kpfv3v) {
            i = WaUP0CF08() - 1;
            WaUP0CF08 = -1;
        } else {
            i = 0;
            WaUP0CF08 = WaUP0CF08();
        }
        return BRiz0pFYm(i, WaUP0CF08, z, z2);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.MzoOEjc4X = 1;
        this.dXrmkklc8 = false;
        this.RG6kpfv3v = false;
        this.ixWaw2akD = false;
        this.sk5s77z6Q = true;
        this.WaUP0CF08 = -1;
        this.i8XZMQc6Z = Integer.MIN_VALUE;
        this.dfpT1j18n = null;
        this.iMyQMM6Qj = new RG2GI7LDp();
        this.cAwN510t2 = new mhl5lIdbQ();
        this.IytU16YUK = 2;
        this.CpG0imbht = new int[2];
        RecyclerView.LULQkQlc9.mhl5lIdbQ juJ6pnCpu = RecyclerView.LULQkQlc9.juJ6pnCpu(context, attributeSet, i, i2);
        TpbsiPM9j(juJ6pnCpu.q3BipwRCk);
        boolean z = juJ6pnCpu.tGV7Q6urW;
        dIocxURUo(null);
        if (z != this.dXrmkklc8) {
            this.dXrmkklc8 = z;
            uSBmk4hFZ();
        }
        JBD2u58uX(juJ6pnCpu.dIocxURUo);
    }
}
