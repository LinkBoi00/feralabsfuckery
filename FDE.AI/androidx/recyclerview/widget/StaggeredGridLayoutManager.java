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
import con.NySN5IVuc;
import con.VDOiBfLc0;
import con.abGBwSu8x;
import con.mcHYF60Gb;
import con.pA5wCkne4;
import con.xkS4L9No5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.LULQkQlc9 implements RecyclerView.kVmRinNH6.RG2GI7LDp {
    public boolean CpG0imbht;
    public Fj4Wp9wly Eeka1udhb;
    public int MzoOEjc4X;
    public int RG6kpfv3v;
    public int dXrmkklc8;
    public BitSet i8XZMQc6Z;
    public dNif5KqqH[] ilHKhw3Yw;
    public final VDOiBfLc0 ixWaw2akD;
    public s7MlVynBG nlGCs0NZs;
    public boolean qFBXIgpia;
    public Fj4Wp9wly qVUwofr5s;
    public boolean sk5s77z6Q;
    public int[] vNtjxmzUM;
    public boolean WaUP0CF08 = false;
    public int dfpT1j18n = -1;
    public int iMyQMM6Qj = Integer.MIN_VALUE;
    public qhPEQQaQ4 cAwN510t2 = new qhPEQQaQ4();
    public int IytU16YUK = 2;
    public final Rect AqaWJg0b4 = new Rect();
    public final mhl5lIdbQ mUqPm6GBh = new mhl5lIdbQ();
    public boolean NyWTwPF6V = true;
    public final Runnable i0Zug1mVk = new RG2GI7LDp();

    /* loaded from: classes.dex */
    public class RG2GI7LDp implements Runnable {
        public RG2GI7LDp() {
            StaggeredGridLayoutManager.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.XGA7b0zuB();
        }
    }

    /* loaded from: classes.dex */
    public static class aXI58Y1kr extends RecyclerView.dgsh68zH8 {
        public dNif5KqqH kCA6Zs9sL;

        public aXI58Y1kr(int i, int i2) {
            super(i, i2);
        }

        public aXI58Y1kr(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public aXI58Y1kr(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public aXI58Y1kr(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* loaded from: classes.dex */
    public class dNif5KqqH {
        public final int kCA6Zs9sL;
        public ArrayList q3BipwRCk = new ArrayList();
        public int J4Ux7ym32 = Integer.MIN_VALUE;
        public int tGV7Q6urW = Integer.MIN_VALUE;
        public int dIocxURUo = 0;

        public dNif5KqqH(int i) {
            StaggeredGridLayoutManager.this = r1;
            this.kCA6Zs9sL = i;
        }

        public void Bhmn1KIah(View view) {
            aXI58Y1kr oon79WMrY = oon79WMrY(view);
            oon79WMrY.kCA6Zs9sL = this;
            this.q3BipwRCk.add(0, view);
            this.J4Ux7ym32 = Integer.MIN_VALUE;
            if (this.q3BipwRCk.size() == 1) {
                this.tGV7Q6urW = Integer.MIN_VALUE;
            }
            if (oon79WMrY.tGV7Q6urW() || oon79WMrY.J4Ux7ym32()) {
                this.dIocxURUo = StaggeredGridLayoutManager.this.qVUwofr5s.tGV7Q6urW(view) + this.dIocxURUo;
            }
        }

        public void CBQ5d1kRq() {
            int size = this.q3BipwRCk.size();
            View view = (View) this.q3BipwRCk.remove(size - 1);
            aXI58Y1kr oon79WMrY = oon79WMrY(view);
            oon79WMrY.kCA6Zs9sL = null;
            if (oon79WMrY.tGV7Q6urW() || oon79WMrY.J4Ux7ym32()) {
                this.dIocxURUo -= StaggeredGridLayoutManager.this.qVUwofr5s.tGV7Q6urW(view);
            }
            if (size == 1) {
                this.J4Ux7ym32 = Integer.MIN_VALUE;
            }
            this.tGV7Q6urW = Integer.MIN_VALUE;
        }

        public int GPLPRo6go(int i, int i2, boolean z) {
            int vPSbyrYWX = StaggeredGridLayoutManager.this.qVUwofr5s.vPSbyrYWX();
            int GPLPRo6go = StaggeredGridLayoutManager.this.qVUwofr5s.GPLPRo6go();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = (View) this.q3BipwRCk.get(i);
                int kCA6Zs9sL = StaggeredGridLayoutManager.this.qVUwofr5s.kCA6Zs9sL(view);
                int J4Ux7ym32 = StaggeredGridLayoutManager.this.qVUwofr5s.J4Ux7ym32(view);
                boolean z2 = false;
                boolean z3 = !z ? kCA6Zs9sL < GPLPRo6go : kCA6Zs9sL <= GPLPRo6go;
                if (!z ? J4Ux7ym32 > vPSbyrYWX : J4Ux7ym32 >= vPSbyrYWX) {
                    z2 = true;
                }
                if (z3 && z2 && (kCA6Zs9sL < vPSbyrYWX || J4Ux7ym32 > GPLPRo6go)) {
                    return StaggeredGridLayoutManager.this.TyB1UUd72(view);
                }
                i += i3;
            }
            return -1;
        }

        public void J4Ux7ym32() {
            ArrayList arrayList = this.q3BipwRCk;
            View view = (View) arrayList.get(arrayList.size() - 1);
            aXI58Y1kr oon79WMrY = oon79WMrY(view);
            this.tGV7Q6urW = StaggeredGridLayoutManager.this.qVUwofr5s.J4Ux7ym32(view);
            Objects.requireNonNull(oon79WMrY);
        }

        public int Puu3Rhg4F(int i) {
            int i2 = this.tGV7Q6urW;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.q3BipwRCk.size() == 0) {
                return i;
            }
            J4Ux7ym32();
            return this.tGV7Q6urW;
        }

        public void dIocxURUo() {
            this.q3BipwRCk.clear();
            this.J4Ux7ym32 = Integer.MIN_VALUE;
            this.tGV7Q6urW = Integer.MIN_VALUE;
            this.dIocxURUo = 0;
        }

        public int iiGwOFFnr() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.sk5s77z6Q) {
                i2 = 0;
                i = this.q3BipwRCk.size();
            } else {
                i2 = this.q3BipwRCk.size() - 1;
                i = -1;
            }
            return GPLPRo6go(i2, i, true);
        }

        public int kCA6Zs9sL() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.sk5s77z6Q) {
                i2 = this.q3BipwRCk.size() - 1;
                i = -1;
            } else {
                i2 = 0;
                i = this.q3BipwRCk.size();
            }
            return GPLPRo6go(i2, i, true);
        }

        public void kmSgne1rO() {
            View view = (View) this.q3BipwRCk.remove(0);
            aXI58Y1kr oon79WMrY = oon79WMrY(view);
            oon79WMrY.kCA6Zs9sL = null;
            if (this.q3BipwRCk.size() == 0) {
                this.tGV7Q6urW = Integer.MIN_VALUE;
            }
            if (oon79WMrY.tGV7Q6urW() || oon79WMrY.J4Ux7ym32()) {
                this.dIocxURUo -= StaggeredGridLayoutManager.this.qVUwofr5s.tGV7Q6urW(view);
            }
            this.J4Ux7ym32 = Integer.MIN_VALUE;
        }

        public aXI58Y1kr oon79WMrY(View view) {
            return (aXI58Y1kr) view.getLayoutParams();
        }

        public void q3BipwRCk(View view) {
            aXI58Y1kr oon79WMrY = oon79WMrY(view);
            oon79WMrY.kCA6Zs9sL = this;
            this.q3BipwRCk.add(view);
            this.tGV7Q6urW = Integer.MIN_VALUE;
            if (this.q3BipwRCk.size() == 1) {
                this.J4Ux7ym32 = Integer.MIN_VALUE;
            }
            if (oon79WMrY.tGV7Q6urW() || oon79WMrY.J4Ux7ym32()) {
                this.dIocxURUo = StaggeredGridLayoutManager.this.qVUwofr5s.tGV7Q6urW(view) + this.dIocxURUo;
            }
        }

        public void tGV7Q6urW() {
            View view = (View) this.q3BipwRCk.get(0);
            aXI58Y1kr oon79WMrY = oon79WMrY(view);
            this.J4Ux7ym32 = StaggeredGridLayoutManager.this.qVUwofr5s.kCA6Zs9sL(view);
            Objects.requireNonNull(oon79WMrY);
        }

        public int vPSbyrYWX(int i) {
            int i2 = this.J4Ux7ym32;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.q3BipwRCk.size() == 0) {
                return i;
            }
            tGV7Q6urW();
            return this.J4Ux7ym32;
        }

        public View yWvV4ePLl(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.q3BipwRCk.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.q3BipwRCk.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.sk5s77z6Q && staggeredGridLayoutManager.TyB1UUd72(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.sk5s77z6Q && staggeredGridLayoutManager2.TyB1UUd72(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.q3BipwRCk.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = (View) this.q3BipwRCk.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.sk5s77z6Q && staggeredGridLayoutManager3.TyB1UUd72(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.sk5s77z6Q && staggeredGridLayoutManager4.TyB1UUd72(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }
    }

    /* loaded from: classes.dex */
    public class mhl5lIdbQ {
        public int J4Ux7ym32;
        public boolean dIocxURUo;
        public int[] iiGwOFFnr;
        public boolean kCA6Zs9sL;
        public int q3BipwRCk;
        public boolean tGV7Q6urW;

        public mhl5lIdbQ() {
            StaggeredGridLayoutManager.this = r1;
            J4Ux7ym32();
        }

        public void J4Ux7ym32() {
            this.q3BipwRCk = -1;
            this.J4Ux7ym32 = Integer.MIN_VALUE;
            this.tGV7Q6urW = false;
            this.dIocxURUo = false;
            this.kCA6Zs9sL = false;
            int[] iArr = this.iiGwOFFnr;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void q3BipwRCk() {
            this.J4Ux7ym32 = this.tGV7Q6urW ? StaggeredGridLayoutManager.this.qVUwofr5s.GPLPRo6go() : StaggeredGridLayoutManager.this.qVUwofr5s.vPSbyrYWX();
        }
    }

    /* loaded from: classes.dex */
    public static class qhPEQQaQ4 {
        public List J4Ux7ym32;
        public int[] q3BipwRCk;

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class RG2GI7LDp implements Parcelable {
            public static final Parcelable.Creator<RG2GI7LDp> CREATOR = new xkS4L9No5(2);
            public int[] Bhmn1KIah;
            public int CBQ5d1kRq;
            public boolean PSTqBLTET;
            public int kmSgne1rO;

            public RG2GI7LDp(Parcel parcel) {
                this.CBQ5d1kRq = parcel.readInt();
                this.kmSgne1rO = parcel.readInt();
                this.PSTqBLTET = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.Bhmn1KIah = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // java.lang.Object
            public String toString() {
                StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("FullSpanItem{mPosition=");
                q3BipwRCk.append(this.CBQ5d1kRq);
                q3BipwRCk.append(", mGapDir=");
                q3BipwRCk.append(this.kmSgne1rO);
                q3BipwRCk.append(", mHasUnwantedGapAfter=");
                q3BipwRCk.append(this.PSTqBLTET);
                q3BipwRCk.append(", mGapPerSpan=");
                q3BipwRCk.append(Arrays.toString(this.Bhmn1KIah));
                q3BipwRCk.append('}');
                return q3BipwRCk.toString();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.CBQ5d1kRq);
                parcel.writeInt(this.kmSgne1rO);
                parcel.writeInt(this.PSTqBLTET ? 1 : 0);
                int[] iArr = this.Bhmn1KIah;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.Bhmn1KIah);
            }
        }

        public void J4Ux7ym32(int i) {
            int[] iArr = this.q3BipwRCk;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.q3BipwRCk = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.q3BipwRCk = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.q3BipwRCk;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
        /* Code decompiled incorrectly, please refer to instructions dump */
        public int dIocxURUo(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.q3BipwRCk
                r1 = -1
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                int r0 = r0.length
                if (r5 < r0) goto L_0x000a
                return r1
            L_0x000a:
                java.util.List r0 = r4.J4Ux7ym32
                if (r0 != 0) goto L_0x0010
            L_0x000e:
                r0 = r1
                goto L_0x0046
            L_0x0010:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$qhPEQQaQ4$RG2GI7LDp r0 = r4.tGV7Q6urW(r5)
                if (r0 == 0) goto L_0x001b
                java.util.List r2 = r4.J4Ux7ym32
                r2.remove(r0)
            L_0x001b:
                java.util.List r0 = r4.J4Ux7ym32
                int r0 = r0.size()
                r2 = 0
            L_0x0022:
                if (r2 >= r0) goto L_0x0034
                java.util.List r3 = r4.J4Ux7ym32
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$qhPEQQaQ4$RG2GI7LDp r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.qhPEQQaQ4.RG2GI7LDp) r3
                int r3 = r3.CBQ5d1kRq
                if (r3 < r5) goto L_0x0031
                goto L_0x0035
            L_0x0031:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0034:
                r2 = r1
            L_0x0035:
                if (r2 == r1) goto L_0x000e
                java.util.List r0 = r4.J4Ux7ym32
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$qhPEQQaQ4$RG2GI7LDp r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.qhPEQQaQ4.RG2GI7LDp) r0
                java.util.List r3 = r4.J4Ux7ym32
                r3.remove(r2)
                int r0 = r0.CBQ5d1kRq
            L_0x0046:
                if (r0 != r1) goto L_0x0052
                int[] r0 = r4.q3BipwRCk
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.q3BipwRCk
                int r5 = r5.length
                return r5
            L_0x0052:
                int r0 = r0 + 1
                int[] r2 = r4.q3BipwRCk
                int r2 = r2.length
                int r0 = java.lang.Math.min(r0, r2)
                int[] r2 = r4.q3BipwRCk
                java.util.Arrays.fill(r2, r5, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.qhPEQQaQ4.dIocxURUo(int):int");
        }

        public void iiGwOFFnr(int i, int i2) {
            int[] iArr = this.q3BipwRCk;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                J4Ux7ym32(i3);
                int[] iArr2 = this.q3BipwRCk;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.q3BipwRCk;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                List list = this.J4Ux7ym32;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        RG2GI7LDp rG2GI7LDp = (RG2GI7LDp) this.J4Ux7ym32.get(size);
                        int i4 = rG2GI7LDp.CBQ5d1kRq;
                        if (i4 >= i) {
                            if (i4 < i3) {
                                this.J4Ux7ym32.remove(size);
                            } else {
                                rG2GI7LDp.CBQ5d1kRq = i4 - i2;
                            }
                        }
                    }
                }
            }
        }

        public void kCA6Zs9sL(int i, int i2) {
            int[] iArr = this.q3BipwRCk;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                J4Ux7ym32(i3);
                int[] iArr2 = this.q3BipwRCk;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.q3BipwRCk, i, i3, -1);
                List list = this.J4Ux7ym32;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        RG2GI7LDp rG2GI7LDp = (RG2GI7LDp) this.J4Ux7ym32.get(size);
                        int i4 = rG2GI7LDp.CBQ5d1kRq;
                        if (i4 >= i) {
                            rG2GI7LDp.CBQ5d1kRq = i4 + i2;
                        }
                    }
                }
            }
        }

        public void q3BipwRCk() {
            int[] iArr = this.q3BipwRCk;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.J4Ux7ym32 = null;
        }

        public RG2GI7LDp tGV7Q6urW(int i) {
            List list = this.J4Ux7ym32;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                RG2GI7LDp rG2GI7LDp = (RG2GI7LDp) this.J4Ux7ym32.get(size);
                if (rG2GI7LDp.CBQ5d1kRq == i) {
                    return rG2GI7LDp;
                }
            }
            return null;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class s7MlVynBG implements Parcelable {
        public static final Parcelable.Creator<s7MlVynBG> CREATOR = new mcHYF60Gb(1);
        public int Bhmn1KIah;
        public int CBQ5d1kRq;
        public boolean Eeka1udhb;
        public int MzoOEjc4X;
        public int[] PSTqBLTET;
        public boolean RG6kpfv3v;
        public boolean dXrmkklc8;
        public int[] ilHKhw3Yw;
        public int kmSgne1rO;
        public List qVUwofr5s;

        public s7MlVynBG() {
        }

        public s7MlVynBG(Parcel parcel) {
            this.CBQ5d1kRq = parcel.readInt();
            this.kmSgne1rO = parcel.readInt();
            int readInt = parcel.readInt();
            this.Bhmn1KIah = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.PSTqBLTET = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.MzoOEjc4X = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.ilHKhw3Yw = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.Eeka1udhb = parcel.readInt() == 1;
            this.dXrmkklc8 = parcel.readInt() == 1;
            this.RG6kpfv3v = parcel.readInt() == 1 ? true : z;
            this.qVUwofr5s = parcel.readArrayList(qhPEQQaQ4.RG2GI7LDp.class.getClassLoader());
        }

        public s7MlVynBG(s7MlVynBG s7mlvynbg) {
            this.Bhmn1KIah = s7mlvynbg.Bhmn1KIah;
            this.CBQ5d1kRq = s7mlvynbg.CBQ5d1kRq;
            this.kmSgne1rO = s7mlvynbg.kmSgne1rO;
            this.PSTqBLTET = s7mlvynbg.PSTqBLTET;
            this.MzoOEjc4X = s7mlvynbg.MzoOEjc4X;
            this.ilHKhw3Yw = s7mlvynbg.ilHKhw3Yw;
            this.Eeka1udhb = s7mlvynbg.Eeka1udhb;
            this.dXrmkklc8 = s7mlvynbg.dXrmkklc8;
            this.RG6kpfv3v = s7mlvynbg.RG6kpfv3v;
            this.qVUwofr5s = s7mlvynbg.qVUwofr5s;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.CBQ5d1kRq);
            parcel.writeInt(this.kmSgne1rO);
            parcel.writeInt(this.Bhmn1KIah);
            if (this.Bhmn1KIah > 0) {
                parcel.writeIntArray(this.PSTqBLTET);
            }
            parcel.writeInt(this.MzoOEjc4X);
            if (this.MzoOEjc4X > 0) {
                parcel.writeIntArray(this.ilHKhw3Yw);
            }
            parcel.writeInt(this.Eeka1udhb ? 1 : 0);
            parcel.writeInt(this.dXrmkklc8 ? 1 : 0);
            parcel.writeInt(this.RG6kpfv3v ? 1 : 0);
            parcel.writeList(this.qVUwofr5s);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.MzoOEjc4X = -1;
        this.sk5s77z6Q = false;
        RecyclerView.LULQkQlc9.mhl5lIdbQ juJ6pnCpu = RecyclerView.LULQkQlc9.juJ6pnCpu(context, attributeSet, i, i2);
        int i3 = juJ6pnCpu.q3BipwRCk;
        if (i3 == 0 || i3 == 1) {
            dIocxURUo(null);
            if (i3 != this.dXrmkklc8) {
                this.dXrmkklc8 = i3;
                Fj4Wp9wly fj4Wp9wly = this.qVUwofr5s;
                this.qVUwofr5s = this.Eeka1udhb;
                this.Eeka1udhb = fj4Wp9wly;
                uSBmk4hFZ();
            }
            int i4 = juJ6pnCpu.J4Ux7ym32;
            dIocxURUo(null);
            if (i4 != this.MzoOEjc4X) {
                this.cAwN510t2.q3BipwRCk();
                uSBmk4hFZ();
                this.MzoOEjc4X = i4;
                this.i8XZMQc6Z = new BitSet(this.MzoOEjc4X);
                this.ilHKhw3Yw = new dNif5KqqH[this.MzoOEjc4X];
                for (int i5 = 0; i5 < this.MzoOEjc4X; i5++) {
                    this.ilHKhw3Yw[i5] = new dNif5KqqH(i5);
                }
                uSBmk4hFZ();
            }
            boolean z = juJ6pnCpu.tGV7Q6urW;
            dIocxURUo(null);
            s7MlVynBG s7mlvynbg = this.nlGCs0NZs;
            if (!(s7mlvynbg == null || s7mlvynbg.Eeka1udhb == z)) {
                s7mlvynbg.Eeka1udhb = z;
            }
            this.sk5s77z6Q = z;
            uSBmk4hFZ();
            this.ixWaw2akD = new VDOiBfLc0();
            this.qVUwofr5s = Fj4Wp9wly.q3BipwRCk(this, this.dXrmkklc8);
            this.Eeka1udhb = Fj4Wp9wly.q3BipwRCk(this, 1 - this.dXrmkklc8);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:236:0x03ee, code lost:
        if (XGA7b0zuB() != false) goto L_0x03f2;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ac  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void ASYHiorQ0(androidx.recyclerview.widget.RecyclerView.V1xq9aVRv r12, androidx.recyclerview.widget.RecyclerView.kvFwRYSUX r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 1040
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.ASYHiorQ0(androidx.recyclerview.widget.RecyclerView$V1xq9aVRv, androidx.recyclerview.widget.RecyclerView$kvFwRYSUX, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0038, code lost:
        if (r8.dXrmkklc8 == 1) goto L_0x005b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
        if (r8.dXrmkklc8 == 0) goto L_0x005b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004b, code lost:
        if (zBLRafG4A() == false) goto L_0x0059;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0057, code lost:
        if (zBLRafG4A() == false) goto L_0x005b;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    /* Code decompiled incorrectly, please refer to instructions dump */
    public android.view.View BL4OzhZBd(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.V1xq9aVRv r11, androidx.recyclerview.widget.RecyclerView.kvFwRYSUX r12) {
        /*
        // Method dump skipped, instructions count: 327
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.BL4OzhZBd(android.view.View, int, androidx.recyclerview.widget.RecyclerView$V1xq9aVRv, androidx.recyclerview.widget.RecyclerView$kvFwRYSUX):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b3, code lost:
        if (r10 == r11) goto L_0x00c7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c5, code lost:
        if (r10 == r11) goto L_0x00c7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c7, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c9, code lost:
        r10 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public android.view.View BRiz0pFYm() {
        /*
        // Method dump skipped, instructions count: 237
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.BRiz0pFYm():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public int Bhmn1KIah(RecyclerView.kvFwRYSUX kvfwrysux) {
        return Xeg1rC5FI(kvfwrysux);
    }

    public final void CBBuS2EIe(RecyclerView.V1xq9aVRv v1xq9aVRv, int i) {
        for (int WaUP0CF08 = WaUP0CF08() - 1; WaUP0CF08 >= 0; WaUP0CF08--) {
            View sk5s77z6Q = sk5s77z6Q(WaUP0CF08);
            if (this.qVUwofr5s.kCA6Zs9sL(sk5s77z6Q) >= i && this.qVUwofr5s.PSTqBLTET(sk5s77z6Q) >= i) {
                aXI58Y1kr axi58y1kr = (aXI58Y1kr) sk5s77z6Q.getLayoutParams();
                Objects.requireNonNull(axi58y1kr);
                if (axi58y1kr.kCA6Zs9sL.q3BipwRCk.size() != 1) {
                    axi58y1kr.kCA6Zs9sL.CBQ5d1kRq();
                    YmNRDyka4(sk5s77z6Q, v1xq9aVRv);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public int CBQ5d1kRq(RecyclerView.kvFwRYSUX kvfwrysux) {
        return eUlgH2VO7(kvfwrysux);
    }

    public final void CK4pxGbcv(int i, int i2) {
        for (int i3 = 0; i3 < this.MzoOEjc4X; i3++) {
            if (!this.ilHKhw3Yw[i3].q3BipwRCk.isEmpty()) {
                TpbsiPM9j(this.ilHKhw3Yw[i3], i, i2);
            }
        }
    }

    public View D91ZKn9BG(boolean z) {
        int vPSbyrYWX = this.qVUwofr5s.vPSbyrYWX();
        int GPLPRo6go = this.qVUwofr5s.GPLPRo6go();
        View view = null;
        for (int WaUP0CF08 = WaUP0CF08() - 1; WaUP0CF08 >= 0; WaUP0CF08--) {
            View sk5s77z6Q = sk5s77z6Q(WaUP0CF08);
            int kCA6Zs9sL = this.qVUwofr5s.kCA6Zs9sL(sk5s77z6Q);
            int J4Ux7ym32 = this.qVUwofr5s.J4Ux7ym32(sk5s77z6Q);
            if (J4Ux7ym32 > vPSbyrYWX && kCA6Zs9sL < GPLPRo6go) {
                if (J4Ux7ym32 <= GPLPRo6go || !z) {
                    return sk5s77z6Q;
                }
                if (view == null) {
                    view = sk5s77z6Q;
                }
            }
        }
        return view;
    }

    public final void DEe4ujgEA(RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux, boolean z) {
        int GPLPRo6go;
        int r2IGhIWDk = r2IGhIWDk(Integer.MIN_VALUE);
        if (r2IGhIWDk != Integer.MIN_VALUE && (GPLPRo6go = this.qVUwofr5s.GPLPRo6go() - r2IGhIWDk) > 0) {
            int i = GPLPRo6go - (-JGeS2kPDj(-GPLPRo6go, v1xq9aVRv, kvfwrysux));
            if (z && i > 0) {
                this.qVUwofr5s.MzoOEjc4X(i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void Dr7UqlxEV(RecyclerView recyclerView, int i, int i2, Object obj) {
        wrUk6NQP6(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void DuuXfa7LE(AccessibilityEvent accessibilityEvent) {
        super.DuuXfa7LE(accessibilityEvent);
        if (WaUP0CF08() > 0) {
            View pwwzaxl9D = pwwzaxl9D(false);
            View D91ZKn9BG = D91ZKn9BG(false);
            if (pwwzaxl9D != null && D91ZKn9BG != null) {
                int TyB1UUd72 = TyB1UUd72(pwwzaxl9D);
                int TyB1UUd722 = TyB1UUd72(D91ZKn9BG);
                if (TyB1UUd72 < TyB1UUd722) {
                    accessibilityEvent.setFromIndex(TyB1UUd72);
                    accessibilityEvent.setToIndex(TyB1UUd722);
                    return;
                }
                accessibilityEvent.setFromIndex(TyB1UUd722);
                accessibilityEvent.setToIndex(TyB1UUd72);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public boolean GPLPRo6go(RecyclerView.dgsh68zH8 dgsh68zh8) {
        return dgsh68zh8 instanceof aXI58Y1kr;
    }

    public final int GpWTsCbvo(RecyclerView.kvFwRYSUX kvfwrysux) {
        if (WaUP0CF08() == 0) {
            return 0;
        }
        return pA5wCkne4.dIocxURUo(kvfwrysux, this.qVUwofr5s, pwwzaxl9D(!this.NyWTwPF6V), D91ZKn9BG(!this.NyWTwPF6V), this, this.NyWTwPF6V);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void IG30YE5GU(Parcelable parcelable) {
        if (parcelable instanceof s7MlVynBG) {
            s7MlVynBG s7mlvynbg = (s7MlVynBG) parcelable;
            this.nlGCs0NZs = s7mlvynbg;
            if (this.dfpT1j18n != -1) {
                s7mlvynbg.PSTqBLTET = null;
                s7mlvynbg.Bhmn1KIah = 0;
                s7mlvynbg.CBQ5d1kRq = -1;
                s7mlvynbg.kmSgne1rO = -1;
                s7mlvynbg.PSTqBLTET = null;
                s7mlvynbg.Bhmn1KIah = 0;
                s7mlvynbg.MzoOEjc4X = 0;
                s7mlvynbg.ilHKhw3Yw = null;
                s7mlvynbg.qVUwofr5s = null;
            }
            uSBmk4hFZ();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void INnK5Rew6(RecyclerView recyclerView) {
        this.cAwN510t2.q3BipwRCk();
        uSBmk4hFZ();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void IzM1cD9ly(int i) {
        super.IzM1cD9ly(i);
        for (int i2 = 0; i2 < this.MzoOEjc4X; i2++) {
            dNif5KqqH dnif5kqqh = this.ilHKhw3Yw[i2];
            int i3 = dnif5kqqh.J4Ux7ym32;
            if (i3 != Integer.MIN_VALUE) {
                dnif5kqqh.J4Ux7ym32 = i3 + i;
            }
            int i4 = dnif5kqqh.tGV7Q6urW;
            if (i4 != Integer.MIN_VALUE) {
                dnif5kqqh.tGV7Q6urW = i4 + i;
            }
        }
    }

    public final int JBD2u58uX(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    public int JGeS2kPDj(int i, RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux) {
        if (WaUP0CF08() == 0 || i == 0) {
            return 0;
        }
        JMpnD40gh(i, kvfwrysux);
        int eylCJcWC7 = eylCJcWC7(v1xq9aVRv, this.ixWaw2akD, kvfwrysux);
        if (this.ixWaw2akD.J4Ux7ym32 >= eylCJcWC7) {
            i = i < 0 ? -eylCJcWC7 : eylCJcWC7;
        }
        this.qVUwofr5s.MzoOEjc4X(-i);
        this.CpG0imbht = this.WaUP0CF08;
        VDOiBfLc0 vDOiBfLc0 = this.ixWaw2akD;
        vDOiBfLc0.J4Ux7ym32 = 0;
        bL31fPM8I(v1xq9aVRv, vDOiBfLc0);
        return i;
    }

    public void JMpnD40gh(int i, RecyclerView.kvFwRYSUX kvfwrysux) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = ZDWv1omvl();
            i2 = 1;
        } else {
            i2 = -1;
            i3 = zH62iiANw();
        }
        this.ixWaw2akD.q3BipwRCk = true;
        Nr79Zh2zt(i3, kvfwrysux);
        PMt6uLcRh(i2);
        VDOiBfLc0 vDOiBfLc0 = this.ixWaw2akD;
        vDOiBfLc0.tGV7Q6urW = i3 + vDOiBfLc0.dIocxURUo;
        vDOiBfLc0.J4Ux7ym32 = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public int JxIJId84K(int i, RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux) {
        return JGeS2kPDj(i, v1xq9aVRv, kvfwrysux);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void KBYw84i3W(RecyclerView recyclerView, int i, int i2) {
        wrUk6NQP6(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void KlYagMRWx(int i) {
        if (i == 0) {
            XGA7b0zuB();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public boolean L4EwGfXiQ() {
        return this.IytU16YUK != 0;
    }

    public final int LFW0KvNFt(int i) {
        if (WaUP0CF08() == 0) {
            return this.WaUP0CF08 ? 1 : -1;
        }
        return (i < zH62iiANw()) != this.WaUP0CF08 ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void M66hQ219i(RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux) {
        ASYHiorQ0(v1xq9aVRv, kvfwrysux, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public int MzoOEjc4X(RecyclerView.kvFwRYSUX kvfwrysux) {
        return GpWTsCbvo(kvfwrysux);
    }

    public final void Nr79Zh2zt(int i, RecyclerView.kvFwRYSUX kvfwrysux) {
        int i2;
        int i3;
        int i4;
        VDOiBfLc0 vDOiBfLc0 = this.ixWaw2akD;
        boolean z = false;
        vDOiBfLc0.J4Ux7ym32 = 0;
        vDOiBfLc0.tGV7Q6urW = i;
        RecyclerView.kVmRinNH6 kvmrinnh6 = this.kCA6Zs9sL;
        if (!(kvmrinnh6 != null && kvmrinnh6.kCA6Zs9sL) || (i4 = kvfwrysux.q3BipwRCk) == -1) {
            i3 = 0;
            i2 = 0;
        } else {
            if (this.WaUP0CF08 == (i4 < i)) {
                i3 = this.qVUwofr5s.CBQ5d1kRq();
                i2 = 0;
            } else {
                i2 = this.qVUwofr5s.CBQ5d1kRq();
                i3 = 0;
            }
        }
        RecyclerView recyclerView = this.J4Ux7ym32;
        if (recyclerView != null && recyclerView.qVUwofr5s) {
            this.ixWaw2akD.iiGwOFFnr = this.qVUwofr5s.vPSbyrYWX() - i2;
            this.ixWaw2akD.GPLPRo6go = this.qVUwofr5s.GPLPRo6go() + i3;
        } else {
            this.ixWaw2akD.GPLPRo6go = this.qVUwofr5s.iiGwOFFnr() + i3;
            this.ixWaw2akD.iiGwOFFnr = -i2;
        }
        VDOiBfLc0 vDOiBfLc02 = this.ixWaw2akD;
        vDOiBfLc02.Puu3Rhg4F = false;
        vDOiBfLc02.q3BipwRCk = true;
        if (this.qVUwofr5s.yWvV4ePLl() == 0 && this.qVUwofr5s.iiGwOFFnr() == 0) {
            z = true;
        }
        vDOiBfLc02.yWvV4ePLl = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void OpLJtmvFM(RecyclerView recyclerView, RecyclerView.V1xq9aVRv v1xq9aVRv) {
        Runnable runnable = this.i0Zug1mVk;
        RecyclerView recyclerView2 = this.J4Ux7ym32;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i = 0; i < this.MzoOEjc4X; i++) {
            this.ilHKhw3Yw[i].dIocxURUo();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void OuoYhTxyj(RecyclerView recyclerView, RecyclerView.kvFwRYSUX kvfwrysux, int i) {
        NySN5IVuc nySN5IVuc = new NySN5IVuc(recyclerView.getContext());
        nySN5IVuc.q3BipwRCk = i;
        tTcQQNK5P(nySN5IVuc);
    }

    public final void PGC7L87Ev(RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux, boolean z) {
        int vPSbyrYWX;
        int RxmCfmRJo = RxmCfmRJo(Integer.MAX_VALUE);
        if (RxmCfmRJo != Integer.MAX_VALUE && (vPSbyrYWX = RxmCfmRJo - this.qVUwofr5s.vPSbyrYWX()) > 0) {
            int JGeS2kPDj = vPSbyrYWX - JGeS2kPDj(vPSbyrYWX, v1xq9aVRv, kvfwrysux);
            if (z && JGeS2kPDj > 0) {
                this.qVUwofr5s.MzoOEjc4X(-JGeS2kPDj);
            }
        }
    }

    public final void PMt6uLcRh(int i) {
        VDOiBfLc0 vDOiBfLc0 = this.ixWaw2akD;
        vDOiBfLc0.kCA6Zs9sL = i;
        int i2 = 1;
        if (this.WaUP0CF08 != (i == -1)) {
            i2 = -1;
        }
        vDOiBfLc0.dIocxURUo = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public int PSTqBLTET(RecyclerView.kvFwRYSUX kvfwrysux) {
        return eUlgH2VO7(kvfwrysux);
    }

    public final void QTMTeusAu(View view, int i, int i2, boolean z) {
        Rect rect = this.AqaWJg0b4;
        RecyclerView recyclerView = this.J4Ux7ym32;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.QNqj6nIzv(view));
        }
        aXI58Y1kr axi58y1kr = (aXI58Y1kr) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) axi58y1kr).leftMargin;
        Rect rect2 = this.AqaWJg0b4;
        int JBD2u58uX = JBD2u58uX(i, i3 + rect2.left, ((ViewGroup.MarginLayoutParams) axi58y1kr).rightMargin + rect2.right);
        int i4 = ((ViewGroup.MarginLayoutParams) axi58y1kr).topMargin;
        Rect rect3 = this.AqaWJg0b4;
        int JBD2u58uX2 = JBD2u58uX(i2, i4 + rect3.top, ((ViewGroup.MarginLayoutParams) axi58y1kr).bottomMargin + rect3.bottom);
        if (z ? CMnfe2r2N(view, JBD2u58uX, JBD2u58uX2, axi58y1kr) : koMoKnP1S(view, JBD2u58uX, JBD2u58uX2, axi58y1kr)) {
            view.measure(JBD2u58uX, JBD2u58uX2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void R2hkbNqWf(RecyclerView.kvFwRYSUX kvfwrysux) {
        this.dfpT1j18n = -1;
        this.iMyQMM6Qj = Integer.MIN_VALUE;
        this.nlGCs0NZs = null;
        this.mUqPm6GBh.J4Ux7ym32();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public RecyclerView.dgsh68zH8 RG6kpfv3v(Context context, AttributeSet attributeSet) {
        return new aXI58Y1kr(context, attributeSet);
    }

    public final int RxmCfmRJo(int i) {
        int vPSbyrYWX = this.ilHKhw3Yw[0].vPSbyrYWX(i);
        for (int i2 = 1; i2 < this.MzoOEjc4X; i2++) {
            int vPSbyrYWX2 = this.ilHKhw3Yw[i2].vPSbyrYWX(i);
            if (vPSbyrYWX2 < vPSbyrYWX) {
                vPSbyrYWX = vPSbyrYWX2;
            }
        }
        return vPSbyrYWX;
    }

    public final void ShOkzyJ3y(RecyclerView.V1xq9aVRv v1xq9aVRv, int i) {
        while (WaUP0CF08() > 0) {
            View sk5s77z6Q = sk5s77z6Q(0);
            if (this.qVUwofr5s.J4Ux7ym32(sk5s77z6Q) <= i && this.qVUwofr5s.Bhmn1KIah(sk5s77z6Q) <= i) {
                aXI58Y1kr axi58y1kr = (aXI58Y1kr) sk5s77z6Q.getLayoutParams();
                Objects.requireNonNull(axi58y1kr);
                if (axi58y1kr.kCA6Zs9sL.q3BipwRCk.size() != 1) {
                    axi58y1kr.kCA6Zs9sL.kmSgne1rO();
                    YmNRDyka4(sk5s77z6Q, v1xq9aVRv);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void SuKhTJIQc(RecyclerView recyclerView, int i, int i2, int i3) {
        wrUk6NQP6(i, i2, 8);
    }

    public final void TpbsiPM9j(dNif5KqqH dnif5kqqh, int i, int i2) {
        int i3 = dnif5kqqh.dIocxURUo;
        if (i == -1) {
            int i4 = dnif5kqqh.J4Ux7ym32;
            if (i4 == Integer.MIN_VALUE) {
                dnif5kqqh.tGV7Q6urW();
                i4 = dnif5kqqh.J4Ux7ym32;
            }
            if (i4 + i3 > i2) {
                return;
            }
        } else {
            int i5 = dnif5kqqh.tGV7Q6urW;
            if (i5 == Integer.MIN_VALUE) {
                dnif5kqqh.J4Ux7ym32();
                i5 = dnif5kqqh.tGV7Q6urW;
            }
            if (i5 - i3 < i2) {
                return;
            }
        }
        this.i8XZMQc6Z.set(dnif5kqqh.kCA6Zs9sL, false);
    }

    public boolean XGA7b0zuB() {
        int i;
        if (!(WaUP0CF08() == 0 || this.IytU16YUK == 0 || !this.GPLPRo6go)) {
            if (this.WaUP0CF08) {
                i = ZDWv1omvl();
                zH62iiANw();
            } else {
                i = zH62iiANw();
                ZDWv1omvl();
            }
            if (i == 0 && BRiz0pFYm() != null) {
                this.cAwN510t2.q3BipwRCk();
                this.iiGwOFFnr = true;
                uSBmk4hFZ();
                return true;
            }
        }
        return false;
    }

    public final int Xeg1rC5FI(RecyclerView.kvFwRYSUX kvfwrysux) {
        if (WaUP0CF08() == 0) {
            return 0;
        }
        return pA5wCkne4.J4Ux7ym32(kvfwrysux, this.qVUwofr5s, pwwzaxl9D(!this.NyWTwPF6V), D91ZKn9BG(!this.NyWTwPF6V), this, this.NyWTwPF6V);
    }

    public int ZDWv1omvl() {
        int WaUP0CF08 = WaUP0CF08();
        if (WaUP0CF08 == 0) {
            return 0;
        }
        return TyB1UUd72(sk5s77z6Q(WaUP0CF08 - 1));
    }

    public final boolean ZNy395opV(int i) {
        if (this.dXrmkklc8 == 0) {
            return (i == -1) != this.WaUP0CF08;
        }
        return ((i == -1) == this.WaUP0CF08) == zBLRafG4A();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public int a8N8UmDyD(int i, RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux) {
        return JGeS2kPDj(i, v1xq9aVRv, kvfwrysux);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void aS2AFthYA(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int igRQEZxnW = igRQEZxnW() + QNqj6nIzv();
        int V9LQMKGJe = V9LQMKGJe() + EBQXiIPmm();
        if (this.dXrmkklc8 == 1) {
            i4 = RecyclerView.LULQkQlc9.Puu3Rhg4F(i2, rect.height() + V9LQMKGJe, i0Zug1mVk());
            i3 = RecyclerView.LULQkQlc9.Puu3Rhg4F(i, (this.RG6kpfv3v * this.MzoOEjc4X) + igRQEZxnW, o4LF8RkoQ());
        } else {
            i3 = RecyclerView.LULQkQlc9.Puu3Rhg4F(i, rect.width() + igRQEZxnW, o4LF8RkoQ());
            i4 = RecyclerView.LULQkQlc9.Puu3Rhg4F(i2, (this.RG6kpfv3v * this.MzoOEjc4X) + V9LQMKGJe, i0Zug1mVk());
        }
        this.J4Ux7ym32.setMeasuredDimension(i3, i4);
    }

    public final void b8mIp5vIr() {
        this.WaUP0CF08 = (this.dXrmkklc8 == 1 || !zBLRafG4A()) ? this.sk5s77z6Q : !this.sk5s77z6Q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r6.kCA6Zs9sL == -1) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void bL31fPM8I(androidx.recyclerview.widget.RecyclerView.V1xq9aVRv r5, con.VDOiBfLc0 r6) {
        /*
            r4 = this;
            boolean r0 = r6.q3BipwRCk
            if (r0 == 0) goto L_0x007c
            boolean r0 = r6.yWvV4ePLl
            if (r0 == 0) goto L_0x000a
            goto L_0x007c
        L_0x000a:
            int r0 = r6.J4Ux7ym32
            r1 = -1
            if (r0 != 0) goto L_0x001f
            int r0 = r6.kCA6Zs9sL
            if (r0 != r1) goto L_0x0019
        L_0x0013:
            int r6 = r6.GPLPRo6go
        L_0x0015:
            r4.CBBuS2EIe(r5, r6)
            goto L_0x007c
        L_0x0019:
            int r6 = r6.iiGwOFFnr
        L_0x001b:
            r4.ShOkzyJ3y(r5, r6)
            goto L_0x007c
        L_0x001f:
            int r0 = r6.kCA6Zs9sL
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x0050
            int r0 = r6.iiGwOFFnr
            androidx.recyclerview.widget.StaggeredGridLayoutManager$dNif5KqqH[] r1 = r4.ilHKhw3Yw
            r1 = r1[r2]
            int r1 = r1.vPSbyrYWX(r0)
        L_0x002f:
            int r2 = r4.MzoOEjc4X
            if (r3 >= r2) goto L_0x0041
            androidx.recyclerview.widget.StaggeredGridLayoutManager$dNif5KqqH[] r2 = r4.ilHKhw3Yw
            r2 = r2[r3]
            int r2 = r2.vPSbyrYWX(r0)
            if (r2 <= r1) goto L_0x003e
            r1 = r2
        L_0x003e:
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0041:
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0045
            goto L_0x0013
        L_0x0045:
            int r1 = r6.GPLPRo6go
            int r6 = r6.J4Ux7ym32
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
            goto L_0x0015
        L_0x0050:
            int r0 = r6.GPLPRo6go
            androidx.recyclerview.widget.StaggeredGridLayoutManager$dNif5KqqH[] r1 = r4.ilHKhw3Yw
            r1 = r1[r2]
            int r1 = r1.Puu3Rhg4F(r0)
        L_0x005a:
            int r2 = r4.MzoOEjc4X
            if (r3 >= r2) goto L_0x006c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$dNif5KqqH[] r2 = r4.ilHKhw3Yw
            r2 = r2[r3]
            int r2 = r2.Puu3Rhg4F(r0)
            if (r2 >= r1) goto L_0x0069
            r1 = r2
        L_0x0069:
            int r3 = r3 + 1
            goto L_0x005a
        L_0x006c:
            int r0 = r6.GPLPRo6go
            int r1 = r1 - r0
            if (r1 >= 0) goto L_0x0072
            goto L_0x0019
        L_0x0072:
            int r0 = r6.iiGwOFFnr
            int r6 = r6.J4Ux7ym32
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
            goto L_0x001b
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.bL31fPM8I(androidx.recyclerview.widget.RecyclerView$V1xq9aVRv, con.VDOiBfLc0):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public Parcelable buPcffgdD() {
        int i;
        int i2;
        int[] iArr;
        s7MlVynBG s7mlvynbg = this.nlGCs0NZs;
        if (s7mlvynbg != null) {
            return new s7MlVynBG(s7mlvynbg);
        }
        s7MlVynBG s7mlvynbg2 = new s7MlVynBG();
        s7mlvynbg2.Eeka1udhb = this.sk5s77z6Q;
        s7mlvynbg2.dXrmkklc8 = this.CpG0imbht;
        s7mlvynbg2.RG6kpfv3v = this.qFBXIgpia;
        qhPEQQaQ4 qhpeqqaq4 = this.cAwN510t2;
        if (qhpeqqaq4 == null || (iArr = qhpeqqaq4.q3BipwRCk) == null) {
            s7mlvynbg2.MzoOEjc4X = 0;
        } else {
            s7mlvynbg2.ilHKhw3Yw = iArr;
            s7mlvynbg2.MzoOEjc4X = iArr.length;
            s7mlvynbg2.qVUwofr5s = qhpeqqaq4.J4Ux7ym32;
        }
        int i3 = -1;
        if (WaUP0CF08() > 0) {
            s7mlvynbg2.CBQ5d1kRq = this.CpG0imbht ? ZDWv1omvl() : zH62iiANw();
            View D91ZKn9BG = this.WaUP0CF08 ? D91ZKn9BG(true) : pwwzaxl9D(true);
            if (D91ZKn9BG != null) {
                i3 = TyB1UUd72(D91ZKn9BG);
            }
            s7mlvynbg2.kmSgne1rO = i3;
            int i4 = this.MzoOEjc4X;
            s7mlvynbg2.Bhmn1KIah = i4;
            s7mlvynbg2.PSTqBLTET = new int[i4];
            for (int i5 = 0; i5 < this.MzoOEjc4X; i5++) {
                if (this.CpG0imbht) {
                    i = this.ilHKhw3Yw[i5].Puu3Rhg4F(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.qVUwofr5s.GPLPRo6go();
                        i -= i2;
                        s7mlvynbg2.PSTqBLTET[i5] = i;
                    } else {
                        s7mlvynbg2.PSTqBLTET[i5] = i;
                    }
                } else {
                    i = this.ilHKhw3Yw[i5].vPSbyrYWX(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.qVUwofr5s.vPSbyrYWX();
                        i -= i2;
                        s7mlvynbg2.PSTqBLTET[i5] = i;
                    } else {
                        s7mlvynbg2.PSTqBLTET[i5] = i;
                    }
                }
            }
        } else {
            s7mlvynbg2.CBQ5d1kRq = -1;
            s7mlvynbg2.kmSgne1rO = -1;
            s7mlvynbg2.Bhmn1KIah = 0;
        }
        return s7mlvynbg2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void dIocxURUo(String str) {
        RecyclerView recyclerView;
        if (this.nlGCs0NZs == null && (recyclerView = this.J4Ux7ym32) != null) {
            recyclerView.yWvV4ePLl(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public RecyclerView.dgsh68zH8 dXrmkklc8() {
        return this.dXrmkklc8 == 0 ? new aXI58Y1kr(-2, -1) : new aXI58Y1kr(-1, -2);
    }

    public final int eUlgH2VO7(RecyclerView.kvFwRYSUX kvfwrysux) {
        if (WaUP0CF08() == 0) {
            return 0;
        }
        return pA5wCkne4.tGV7Q6urW(kvfwrysux, this.qVUwofr5s, pwwzaxl9D(!this.NyWTwPF6V), D91ZKn9BG(!this.NyWTwPF6V), this, this.NyWTwPF6V, this.WaUP0CF08);
    }

    public final int eylCJcWC7(RecyclerView.V1xq9aVRv v1xq9aVRv, VDOiBfLc0 vDOiBfLc0, RecyclerView.kvFwRYSUX kvfwrysux) {
        int i;
        dNif5KqqH dnif5kqqh;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13;
        boolean z4 = false;
        this.i8XZMQc6Z.set(0, this.MzoOEjc4X, true);
        if (this.ixWaw2akD.yWvV4ePLl) {
            i = vDOiBfLc0.kCA6Zs9sL == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = vDOiBfLc0.kCA6Zs9sL == 1 ? vDOiBfLc0.GPLPRo6go + vDOiBfLc0.J4Ux7ym32 : vDOiBfLc0.iiGwOFFnr - vDOiBfLc0.J4Ux7ym32;
        }
        CK4pxGbcv(vDOiBfLc0.kCA6Zs9sL, i);
        int GPLPRo6go = this.WaUP0CF08 ? this.qVUwofr5s.GPLPRo6go() : this.qVUwofr5s.vPSbyrYWX();
        Object[] objArr = null;
        while (true) {
            int i14 = vDOiBfLc0.tGV7Q6urW;
            if (!((i14 < 0 || i14 >= kvfwrysux.J4Ux7ym32()) ? z4 : true) || (!this.ixWaw2akD.yWvV4ePLl && this.i8XZMQc6Z.isEmpty())) {
                break;
            }
            View view = v1xq9aVRv.oon79WMrY(vDOiBfLc0.tGV7Q6urW, z4, Long.MAX_VALUE).q3BipwRCk;
            vDOiBfLc0.tGV7Q6urW += vDOiBfLc0.dIocxURUo;
            aXI58Y1kr axi58y1kr = (aXI58Y1kr) view.getLayoutParams();
            int q3BipwRCk = axi58y1kr.q3BipwRCk();
            int[] iArr = this.cAwN510t2.q3BipwRCk;
            int i15 = (iArr == null || q3BipwRCk >= iArr.length) ? -1 : iArr[q3BipwRCk];
            if (i15 == -1 ? true : z4) {
                if (ZNy395opV(vDOiBfLc0.kCA6Zs9sL)) {
                    i13 = this.MzoOEjc4X - 1;
                    i12 = -1;
                    i11 = -1;
                } else {
                    i12 = this.MzoOEjc4X;
                    int i16 = z4 ? 1 : 0;
                    Object[] objArr2 = z4 ? 1 : 0;
                    Object[] objArr3 = z4 ? 1 : 0;
                    i13 = i16;
                    i11 = 1;
                }
                dNif5KqqH dnif5kqqh2 = null;
                if (vDOiBfLc0.kCA6Zs9sL == 1) {
                    int vPSbyrYWX = this.qVUwofr5s.vPSbyrYWX();
                    int i17 = Integer.MAX_VALUE;
                    while (i13 != i12) {
                        dNif5KqqH dnif5kqqh3 = this.ilHKhw3Yw[i13];
                        int Puu3Rhg4F = dnif5kqqh3.Puu3Rhg4F(vPSbyrYWX);
                        if (Puu3Rhg4F < i17) {
                            dnif5kqqh2 = dnif5kqqh3;
                            i17 = Puu3Rhg4F;
                        }
                        i13 += i11;
                    }
                } else {
                    int GPLPRo6go2 = this.qVUwofr5s.GPLPRo6go();
                    int i18 = Integer.MIN_VALUE;
                    while (i13 != i12) {
                        dNif5KqqH dnif5kqqh4 = this.ilHKhw3Yw[i13];
                        int vPSbyrYWX2 = dnif5kqqh4.vPSbyrYWX(GPLPRo6go2);
                        if (vPSbyrYWX2 > i18) {
                            dnif5kqqh2 = dnif5kqqh4;
                            i18 = vPSbyrYWX2;
                        }
                        i13 += i11;
                    }
                }
                dnif5kqqh = dnif5kqqh2;
                qhPEQQaQ4 qhpeqqaq4 = this.cAwN510t2;
                qhpeqqaq4.J4Ux7ym32(q3BipwRCk);
                qhpeqqaq4.q3BipwRCk[q3BipwRCk] = dnif5kqqh.kCA6Zs9sL;
            } else {
                dnif5kqqh = this.ilHKhw3Yw[i15];
            }
            axi58y1kr.kCA6Zs9sL = dnif5kqqh;
            if (vDOiBfLc0.kCA6Zs9sL == 1) {
                z = false;
                tGV7Q6urW(view, -1, false);
            } else {
                z = false;
                tGV7Q6urW(view, 0, false);
            }
            if (this.dXrmkklc8 == 1) {
                int i19 = this.RG6kpfv3v;
                int i20 = this.CBQ5d1kRq;
                int i21 = ((ViewGroup.MarginLayoutParams) axi58y1kr).width;
                int i22 = z ? 1 : 0;
                int i23 = z ? 1 : 0;
                int i24 = z ? 1 : 0;
                i3 = RecyclerView.LULQkQlc9.i8XZMQc6Z(i19, i20, i22, i21, z);
                i2 = RecyclerView.LULQkQlc9.i8XZMQc6Z(this.PSTqBLTET, this.kmSgne1rO, V9LQMKGJe() + EBQXiIPmm(), ((ViewGroup.MarginLayoutParams) axi58y1kr).height, true);
                z2 = false;
            } else {
                i3 = RecyclerView.LULQkQlc9.i8XZMQc6Z(this.Bhmn1KIah, this.CBQ5d1kRq, igRQEZxnW() + QNqj6nIzv(), ((ViewGroup.MarginLayoutParams) axi58y1kr).width, true);
                z2 = false;
                i2 = RecyclerView.LULQkQlc9.i8XZMQc6Z(this.RG6kpfv3v, this.kmSgne1rO, 0, ((ViewGroup.MarginLayoutParams) axi58y1kr).height, false);
            }
            QTMTeusAu(view, i3, i2, z2);
            if (vDOiBfLc0.kCA6Zs9sL == 1) {
                i5 = dnif5kqqh.Puu3Rhg4F(GPLPRo6go);
                i4 = this.qVUwofr5s.tGV7Q6urW(view) + i5;
            } else {
                i4 = dnif5kqqh.vPSbyrYWX(GPLPRo6go);
                i5 = i4 - this.qVUwofr5s.tGV7Q6urW(view);
            }
            int i25 = vDOiBfLc0.kCA6Zs9sL;
            dNif5KqqH dnif5kqqh5 = axi58y1kr.kCA6Zs9sL;
            if (i25 == 1) {
                dnif5kqqh5.q3BipwRCk(view);
            } else {
                dnif5kqqh5.Bhmn1KIah(view);
            }
            if (!zBLRafG4A() || this.dXrmkklc8 != 1) {
                i6 = this.Eeka1udhb.vPSbyrYWX() + (dnif5kqqh.kCA6Zs9sL * this.RG6kpfv3v);
                i7 = this.Eeka1udhb.tGV7Q6urW(view) + i6;
            } else {
                i7 = this.Eeka1udhb.GPLPRo6go() - (((this.MzoOEjc4X - 1) - dnif5kqqh.kCA6Zs9sL) * this.RG6kpfv3v);
                i6 = i7 - this.Eeka1udhb.tGV7Q6urW(view);
            }
            if (this.dXrmkklc8 == 1) {
                i9 = i7;
                i8 = i4;
                i10 = i6;
                i6 = i5;
            } else {
                i8 = i7;
                i9 = i4;
                i10 = i5;
            }
            ziwPzaoF3(view, i10, i6, i9, i8);
            TpbsiPM9j(dnif5kqqh, this.ixWaw2akD.kCA6Zs9sL, i);
            bL31fPM8I(v1xq9aVRv, this.ixWaw2akD);
            if (!this.ixWaw2akD.Puu3Rhg4F || !view.hasFocusable()) {
                z3 = false;
            } else {
                BitSet bitSet = this.i8XZMQc6Z;
                int i26 = dnif5kqqh.kCA6Zs9sL;
                z3 = false;
                bitSet.set(i26, false);
            }
            z4 = z3;
            objArr = 1;
        }
        if (objArr == null) {
            bL31fPM8I(v1xq9aVRv, this.ixWaw2akD);
        }
        int vPSbyrYWX3 = this.ixWaw2akD.kCA6Zs9sL == -1 ? this.qVUwofr5s.vPSbyrYWX() - RxmCfmRJo(this.qVUwofr5s.vPSbyrYWX()) : r2IGhIWDk(this.qVUwofr5s.GPLPRo6go()) - this.qVUwofr5s.GPLPRo6go();
        if (vPSbyrYWX3 > 0) {
            return Math.min(vDOiBfLc0.J4Ux7ym32, vPSbyrYWX3);
        }
        int i27 = z4 ? 1 : 0;
        int i28 = z4 ? 1 : 0;
        int i29 = z4 ? 1 : 0;
        return i27;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public boolean iiGwOFFnr() {
        return this.dXrmkklc8 == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public RecyclerView.dgsh68zH8 ixWaw2akD(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new aXI58Y1kr((ViewGroup.MarginLayoutParams) layoutParams) : new aXI58Y1kr(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public boolean kCA6Zs9sL() {
        return this.dXrmkklc8 == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public int kmSgne1rO(RecyclerView.kvFwRYSUX kvfwrysux) {
        return GpWTsCbvo(kvfwrysux);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void ln3nf7LH3(RecyclerView recyclerView, int i, int i2) {
        wrUk6NQP6(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void n4UIOvAko(RecyclerView.s7MlVynBG s7mlvynbg, RecyclerView.s7MlVynBG s7mlvynbg2) {
        this.cAwN510t2.q3BipwRCk();
        for (int i = 0; i < this.MzoOEjc4X; i++) {
            this.ilHKhw3Yw[i].dIocxURUo();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public boolean oRfL5Lv1q() {
        return this.nlGCs0NZs == null;
    }

    public View pwwzaxl9D(boolean z) {
        int vPSbyrYWX = this.qVUwofr5s.vPSbyrYWX();
        int GPLPRo6go = this.qVUwofr5s.GPLPRo6go();
        int WaUP0CF08 = WaUP0CF08();
        View view = null;
        for (int i = 0; i < WaUP0CF08; i++) {
            View sk5s77z6Q = sk5s77z6Q(i);
            int kCA6Zs9sL = this.qVUwofr5s.kCA6Zs9sL(sk5s77z6Q);
            if (this.qVUwofr5s.J4Ux7ym32(sk5s77z6Q) > vPSbyrYWX && kCA6Zs9sL < GPLPRo6go) {
                if (kCA6Zs9sL >= vPSbyrYWX || !z) {
                    return sk5s77z6Q;
                }
                if (view == null) {
                    view = sk5s77z6Q;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kVmRinNH6.RG2GI7LDp
    public PointF q3BipwRCk(int i) {
        int LFW0KvNFt = LFW0KvNFt(i);
        PointF pointF = new PointF();
        if (LFW0KvNFt == 0) {
            return null;
        }
        if (this.dXrmkklc8 == 0) {
            pointF.x = (float) LFW0KvNFt;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) LFW0KvNFt;
        }
        return pointF;
    }

    public final int r2IGhIWDk(int i) {
        int Puu3Rhg4F = this.ilHKhw3Yw[0].Puu3Rhg4F(i);
        for (int i2 = 1; i2 < this.MzoOEjc4X; i2++) {
            int Puu3Rhg4F2 = this.ilHKhw3Yw[i2].Puu3Rhg4F(i);
            if (Puu3Rhg4F2 > Puu3Rhg4F) {
                Puu3Rhg4F = Puu3Rhg4F2;
            }
        }
        return Puu3Rhg4F;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void vIbyhVf1d(int i) {
        s7MlVynBG s7mlvynbg = this.nlGCs0NZs;
        if (!(s7mlvynbg == null || s7mlvynbg.CBQ5d1kRq == i)) {
            s7mlvynbg.PSTqBLTET = null;
            s7mlvynbg.Bhmn1KIah = 0;
            s7mlvynbg.CBQ5d1kRq = -1;
            s7mlvynbg.kmSgne1rO = -1;
        }
        this.dfpT1j18n = i;
        this.iMyQMM6Qj = Integer.MIN_VALUE;
        uSBmk4hFZ();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public int vPSbyrYWX(RecyclerView.kvFwRYSUX kvfwrysux) {
        return Xeg1rC5FI(kvfwrysux);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void wIZEdYHUn(int i) {
        super.wIZEdYHUn(i);
        for (int i2 = 0; i2 < this.MzoOEjc4X; i2++) {
            dNif5KqqH dnif5kqqh = this.ilHKhw3Yw[i2];
            int i3 = dnif5kqqh.J4Ux7ym32;
            if (i3 != Integer.MIN_VALUE) {
                dnif5kqqh.J4Ux7ym32 = i3 + i;
            }
            int i4 = dnif5kqqh.tGV7Q6urW;
            if (i4 != Integer.MIN_VALUE) {
                dnif5kqqh.tGV7Q6urW = i4 + i;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void wrUk6NQP6(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.WaUP0CF08
            if (r0 == 0) goto L_0x0009
            int r0 = r6.ZDWv1omvl()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.zH62iiANw()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$qhPEQQaQ4 r4 = r6.cAwN510t2
            r4.dIocxURUo(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$qhPEQQaQ4 r9 = r6.cAwN510t2
            r9.iiGwOFFnr(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$qhPEQQaQ4 r7 = r6.cAwN510t2
            r7.kCA6Zs9sL(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$qhPEQQaQ4 r9 = r6.cAwN510t2
            r9.iiGwOFFnr(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$qhPEQQaQ4 r9 = r6.cAwN510t2
            r9.kCA6Zs9sL(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.WaUP0CF08
            if (r7 == 0) goto L_0x004d
            int r7 = r6.zH62iiANw()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.ZDWv1omvl()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.uSBmk4hFZ()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.wrUk6NQP6(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LULQkQlc9
    public void yWvV4ePLl(int i, int i2, RecyclerView.kvFwRYSUX kvfwrysux, RecyclerView.LULQkQlc9.RG2GI7LDp rG2GI7LDp) {
        int i3;
        int i4;
        if (this.dXrmkklc8 != 0) {
            i = i2;
        }
        if (!(WaUP0CF08() == 0 || i == 0)) {
            JMpnD40gh(i, kvfwrysux);
            int[] iArr = this.vNtjxmzUM;
            if (iArr == null || iArr.length < this.MzoOEjc4X) {
                this.vNtjxmzUM = new int[this.MzoOEjc4X];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.MzoOEjc4X; i6++) {
                VDOiBfLc0 vDOiBfLc0 = this.ixWaw2akD;
                if (vDOiBfLc0.dIocxURUo == -1) {
                    i4 = vDOiBfLc0.iiGwOFFnr;
                    i3 = this.ilHKhw3Yw[i6].vPSbyrYWX(i4);
                } else {
                    i4 = this.ilHKhw3Yw[i6].Puu3Rhg4F(vDOiBfLc0.GPLPRo6go);
                    i3 = this.ixWaw2akD.GPLPRo6go;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.vNtjxmzUM[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.vNtjxmzUM, 0, i5);
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = this.ixWaw2akD.tGV7Q6urW;
                if (i9 >= 0 && i9 < kvfwrysux.J4Ux7ym32()) {
                    ((aXI58Y1kr.RG2GI7LDp) rG2GI7LDp).q3BipwRCk(this.ixWaw2akD.tGV7Q6urW, this.vNtjxmzUM[i8]);
                    VDOiBfLc0 vDOiBfLc02 = this.ixWaw2akD;
                    vDOiBfLc02.tGV7Q6urW += vDOiBfLc02.dIocxURUo;
                } else {
                    return;
                }
            }
        }
    }

    public boolean zBLRafG4A() {
        return vNtjxmzUM() == 1;
    }

    public int zH62iiANw() {
        if (WaUP0CF08() == 0) {
            return 0;
        }
        return TyB1UUd72(sk5s77z6Q(0));
    }
}
