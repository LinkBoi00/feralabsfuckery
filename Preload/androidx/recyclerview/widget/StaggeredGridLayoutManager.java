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
        public int dIocxURUo(int i) {
            int i2;
            int[] iArr = this.q3BipwRCk;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            if (this.J4Ux7ym32 != null) {
                RG2GI7LDp tGV7Q6urW = tGV7Q6urW(i);
                if (tGV7Q6urW != null) {
                    this.J4Ux7ym32.remove(tGV7Q6urW);
                }
                int size = this.J4Ux7ym32.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        i3 = -1;
                        break;
                    } else if (((RG2GI7LDp) this.J4Ux7ym32.get(i3)).CBQ5d1kRq >= i) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (i3 != -1) {
                    this.J4Ux7ym32.remove(i3);
                    i2 = ((RG2GI7LDp) this.J4Ux7ym32.get(i3)).CBQ5d1kRq;
                    if (i2 != -1) {
                        int[] iArr2 = this.q3BipwRCk;
                        Arrays.fill(iArr2, i, iArr2.length, -1);
                        return this.q3BipwRCk.length;
                    }
                    int min = Math.min(i2 + 1, this.q3BipwRCk.length);
                    Arrays.fill(this.q3BipwRCk, i, min, -1);
                    return min;
                }
            }
            i2 = -1;
            if (i2 != -1) {
            }
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
    public final void ASYHiorQ0(RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux, boolean z) {
        s7MlVynBG s7mlvynbg;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3;
        mhl5lIdbQ mhl5lidbq = this.mUqPm6GBh;
        if (!(this.nlGCs0NZs == null && this.dfpT1j18n == -1) && kvfwrysux.J4Ux7ym32() == 0) {
            lqFHPHdW3(v1xq9aVRv);
            mhl5lidbq.J4Ux7ym32();
            return;
        }
        boolean z4 = true;
        boolean z5 = (mhl5lidbq.kCA6Zs9sL && this.dfpT1j18n == -1 && this.nlGCs0NZs == null) ? false : true;
        if (z5) {
            mhl5lidbq.J4Ux7ym32();
            s7MlVynBG s7mlvynbg2 = this.nlGCs0NZs;
            if (s7mlvynbg2 != null) {
                int i7 = s7mlvynbg2.Bhmn1KIah;
                if (i7 > 0) {
                    if (i7 == this.MzoOEjc4X) {
                        for (int i8 = 0; i8 < this.MzoOEjc4X; i8++) {
                            this.ilHKhw3Yw[i8].dIocxURUo();
                            s7MlVynBG s7mlvynbg3 = this.nlGCs0NZs;
                            int i9 = s7mlvynbg3.PSTqBLTET[i8];
                            if (i9 != Integer.MIN_VALUE) {
                                i9 += s7mlvynbg3.dXrmkklc8 ? this.qVUwofr5s.GPLPRo6go() : this.qVUwofr5s.vPSbyrYWX();
                            }
                            dNif5KqqH dnif5kqqh = this.ilHKhw3Yw[i8];
                            dnif5kqqh.J4Ux7ym32 = i9;
                            dnif5kqqh.tGV7Q6urW = i9;
                        }
                    } else {
                        s7mlvynbg2.PSTqBLTET = null;
                        s7mlvynbg2.Bhmn1KIah = 0;
                        s7mlvynbg2.MzoOEjc4X = 0;
                        s7mlvynbg2.ilHKhw3Yw = null;
                        s7mlvynbg2.qVUwofr5s = null;
                        s7mlvynbg2.CBQ5d1kRq = s7mlvynbg2.kmSgne1rO;
                    }
                }
                s7MlVynBG s7mlvynbg4 = this.nlGCs0NZs;
                this.qFBXIgpia = s7mlvynbg4.RG6kpfv3v;
                boolean z6 = s7mlvynbg4.Eeka1udhb;
                dIocxURUo(null);
                s7MlVynBG s7mlvynbg5 = this.nlGCs0NZs;
                if (!(s7mlvynbg5 == null || s7mlvynbg5.Eeka1udhb == z6)) {
                    s7mlvynbg5.Eeka1udhb = z6;
                }
                this.sk5s77z6Q = z6;
                uSBmk4hFZ();
                b8mIp5vIr();
                s7MlVynBG s7mlvynbg6 = this.nlGCs0NZs;
                int i10 = s7mlvynbg6.CBQ5d1kRq;
                if (i10 != -1) {
                    this.dfpT1j18n = i10;
                    z3 = s7mlvynbg6.dXrmkklc8;
                } else {
                    z3 = this.WaUP0CF08;
                }
                mhl5lidbq.tGV7Q6urW = z3;
                if (s7mlvynbg6.MzoOEjc4X > 1) {
                    qhPEQQaQ4 qhpeqqaq4 = this.cAwN510t2;
                    qhpeqqaq4.q3BipwRCk = s7mlvynbg6.ilHKhw3Yw;
                    qhpeqqaq4.J4Ux7ym32 = s7mlvynbg6.qVUwofr5s;
                }
            } else {
                b8mIp5vIr();
                mhl5lidbq.tGV7Q6urW = this.WaUP0CF08;
            }
            if (!kvfwrysux.GPLPRo6go && (i2 = this.dfpT1j18n) != -1) {
                if (i2 < 0 || i2 >= kvfwrysux.J4Ux7ym32()) {
                    this.dfpT1j18n = -1;
                    this.iMyQMM6Qj = Integer.MIN_VALUE;
                } else {
                    s7MlVynBG s7mlvynbg7 = this.nlGCs0NZs;
                    if (s7mlvynbg7 == null || s7mlvynbg7.CBQ5d1kRq == -1 || s7mlvynbg7.Bhmn1KIah < 1) {
                        View Eeka1udhb = Eeka1udhb(this.dfpT1j18n);
                        if (Eeka1udhb != null) {
                            mhl5lidbq.q3BipwRCk = this.WaUP0CF08 ? ZDWv1omvl() : zH62iiANw();
                            if (this.iMyQMM6Qj != Integer.MIN_VALUE) {
                                if (mhl5lidbq.tGV7Q6urW) {
                                    i5 = this.qVUwofr5s.GPLPRo6go() - this.iMyQMM6Qj;
                                    i6 = this.qVUwofr5s.J4Ux7ym32(Eeka1udhb);
                                } else {
                                    i5 = this.qVUwofr5s.vPSbyrYWX() + this.iMyQMM6Qj;
                                    i6 = this.qVUwofr5s.kCA6Zs9sL(Eeka1udhb);
                                }
                                i3 = i5 - i6;
                            } else {
                                if (this.qVUwofr5s.tGV7Q6urW(Eeka1udhb) > this.qVUwofr5s.CBQ5d1kRq()) {
                                    i4 = mhl5lidbq.tGV7Q6urW ? this.qVUwofr5s.GPLPRo6go() : this.qVUwofr5s.vPSbyrYWX();
                                } else {
                                    int kCA6Zs9sL = this.qVUwofr5s.kCA6Zs9sL(Eeka1udhb) - this.qVUwofr5s.vPSbyrYWX();
                                    if (kCA6Zs9sL < 0) {
                                        i4 = -kCA6Zs9sL;
                                    } else {
                                        i3 = this.qVUwofr5s.GPLPRo6go() - this.qVUwofr5s.J4Ux7ym32(Eeka1udhb);
                                        if (i3 >= 0) {
                                            mhl5lidbq.J4Ux7ym32 = Integer.MIN_VALUE;
                                        }
                                    }
                                }
                                mhl5lidbq.J4Ux7ym32 = i4;
                            }
                            mhl5lidbq.J4Ux7ym32 = i3;
                        } else {
                            int i11 = this.dfpT1j18n;
                            mhl5lidbq.q3BipwRCk = i11;
                            int i12 = this.iMyQMM6Qj;
                            if (i12 == Integer.MIN_VALUE) {
                                mhl5lidbq.tGV7Q6urW = LFW0KvNFt(i11) == 1;
                                mhl5lidbq.q3BipwRCk();
                            } else {
                                mhl5lidbq.J4Ux7ym32 = mhl5lidbq.tGV7Q6urW ? StaggeredGridLayoutManager.this.qVUwofr5s.GPLPRo6go() - i12 : StaggeredGridLayoutManager.this.qVUwofr5s.vPSbyrYWX() + i12;
                            }
                            mhl5lidbq.dIocxURUo = true;
                        }
                    } else {
                        mhl5lidbq.J4Ux7ym32 = Integer.MIN_VALUE;
                        mhl5lidbq.q3BipwRCk = this.dfpT1j18n;
                    }
                    z2 = true;
                    if (!z2) {
                        boolean z7 = this.CpG0imbht;
                        int J4Ux7ym32 = kvfwrysux.J4Ux7ym32();
                        if (z7) {
                            int WaUP0CF08 = WaUP0CF08();
                            while (true) {
                                WaUP0CF08--;
                                if (WaUP0CF08 < 0) {
                                    break;
                                }
                                i = TyB1UUd72(sk5s77z6Q(WaUP0CF08));
                                if (i >= 0 && i < J4Ux7ym32) {
                                    break;
                                }
                            }
                            i = 0;
                            mhl5lidbq.q3BipwRCk = i;
                            mhl5lidbq.J4Ux7ym32 = Integer.MIN_VALUE;
                        } else {
                            int WaUP0CF082 = WaUP0CF08();
                            for (int i13 = 0; i13 < WaUP0CF082; i13++) {
                                int TyB1UUd72 = TyB1UUd72(sk5s77z6Q(i13));
                                if (TyB1UUd72 >= 0 && TyB1UUd72 < J4Ux7ym32) {
                                    i = TyB1UUd72;
                                    break;
                                }
                            }
                            i = 0;
                            mhl5lidbq.q3BipwRCk = i;
                            mhl5lidbq.J4Ux7ym32 = Integer.MIN_VALUE;
                        }
                    }
                    mhl5lidbq.kCA6Zs9sL = true;
                }
            }
            z2 = false;
            if (!z2) {
            }
            mhl5lidbq.kCA6Zs9sL = true;
        }
        if (this.nlGCs0NZs == null && this.dfpT1j18n == -1 && !(mhl5lidbq.tGV7Q6urW == this.CpG0imbht && zBLRafG4A() == this.qFBXIgpia)) {
            this.cAwN510t2.q3BipwRCk();
            mhl5lidbq.dIocxURUo = true;
        }
        if (WaUP0CF08() > 0 && ((s7mlvynbg = this.nlGCs0NZs) == null || s7mlvynbg.Bhmn1KIah < 1)) {
            if (mhl5lidbq.dIocxURUo) {
                for (int i14 = 0; i14 < this.MzoOEjc4X; i14++) {
                    this.ilHKhw3Yw[i14].dIocxURUo();
                    int i15 = mhl5lidbq.J4Ux7ym32;
                    if (i15 != Integer.MIN_VALUE) {
                        dNif5KqqH dnif5kqqh2 = this.ilHKhw3Yw[i14];
                        dnif5kqqh2.J4Ux7ym32 = i15;
                        dnif5kqqh2.tGV7Q6urW = i15;
                    }
                }
            } else if (z5 || this.mUqPm6GBh.iiGwOFFnr == null) {
                for (int i16 = 0; i16 < this.MzoOEjc4X; i16++) {
                    dNif5KqqH dnif5kqqh3 = this.ilHKhw3Yw[i16];
                    boolean z8 = this.WaUP0CF08;
                    int i17 = mhl5lidbq.J4Ux7ym32;
                    int Puu3Rhg4F = z8 ? dnif5kqqh3.Puu3Rhg4F(Integer.MIN_VALUE) : dnif5kqqh3.vPSbyrYWX(Integer.MIN_VALUE);
                    dnif5kqqh3.dIocxURUo();
                    if (Puu3Rhg4F != Integer.MIN_VALUE && ((!z8 || Puu3Rhg4F >= StaggeredGridLayoutManager.this.qVUwofr5s.GPLPRo6go()) && (z8 || Puu3Rhg4F <= StaggeredGridLayoutManager.this.qVUwofr5s.vPSbyrYWX()))) {
                        if (i17 != Integer.MIN_VALUE) {
                            Puu3Rhg4F += i17;
                        }
                        dnif5kqqh3.tGV7Q6urW = Puu3Rhg4F;
                        dnif5kqqh3.J4Ux7ym32 = Puu3Rhg4F;
                    }
                }
                mhl5lIdbQ mhl5lidbq2 = this.mUqPm6GBh;
                dNif5KqqH[] dnif5kqqhArr = this.ilHKhw3Yw;
                Objects.requireNonNull(mhl5lidbq2);
                int length = dnif5kqqhArr.length;
                int[] iArr = mhl5lidbq2.iiGwOFFnr;
                if (iArr == null || iArr.length < length) {
                    mhl5lidbq2.iiGwOFFnr = new int[StaggeredGridLayoutManager.this.ilHKhw3Yw.length];
                }
                for (int i18 = 0; i18 < length; i18++) {
                    mhl5lidbq2.iiGwOFFnr[i18] = dnif5kqqhArr[i18].vPSbyrYWX(Integer.MIN_VALUE);
                }
            } else {
                for (int i19 = 0; i19 < this.MzoOEjc4X; i19++) {
                    dNif5KqqH dnif5kqqh4 = this.ilHKhw3Yw[i19];
                    dnif5kqqh4.dIocxURUo();
                    int i20 = this.mUqPm6GBh.iiGwOFFnr[i19];
                    dnif5kqqh4.J4Ux7ym32 = i20;
                    dnif5kqqh4.tGV7Q6urW = i20;
                }
            }
        }
        ilHKhw3Yw(v1xq9aVRv);
        this.ixWaw2akD.q3BipwRCk = false;
        int CBQ5d1kRq = this.Eeka1udhb.CBQ5d1kRq();
        this.RG6kpfv3v = CBQ5d1kRq / this.MzoOEjc4X;
        View.MeasureSpec.makeMeasureSpec(CBQ5d1kRq, this.Eeka1udhb.yWvV4ePLl());
        Nr79Zh2zt(mhl5lidbq.q3BipwRCk, kvfwrysux);
        if (mhl5lidbq.tGV7Q6urW) {
            PMt6uLcRh(-1);
            eylCJcWC7(v1xq9aVRv, this.ixWaw2akD, kvfwrysux);
            PMt6uLcRh(1);
        } else {
            PMt6uLcRh(1);
            eylCJcWC7(v1xq9aVRv, this.ixWaw2akD, kvfwrysux);
            PMt6uLcRh(-1);
        }
        VDOiBfLc0 vDOiBfLc0 = this.ixWaw2akD;
        vDOiBfLc0.tGV7Q6urW = mhl5lidbq.q3BipwRCk + vDOiBfLc0.dIocxURUo;
        eylCJcWC7(v1xq9aVRv, vDOiBfLc0, kvfwrysux);
        if (this.Eeka1udhb.yWvV4ePLl() != 1073741824) {
            float f = 0.0f;
            int WaUP0CF083 = WaUP0CF08();
            for (int i21 = 0; i21 < WaUP0CF083; i21++) {
                View sk5s77z6Q = sk5s77z6Q(i21);
                float tGV7Q6urW = (float) this.Eeka1udhb.tGV7Q6urW(sk5s77z6Q);
                if (tGV7Q6urW >= f) {
                    Objects.requireNonNull((aXI58Y1kr) sk5s77z6Q.getLayoutParams());
                    f = Math.max(f, tGV7Q6urW);
                }
            }
            int i22 = this.RG6kpfv3v;
            int round = Math.round(f * ((float) this.MzoOEjc4X));
            if (this.Eeka1udhb.yWvV4ePLl() == Integer.MIN_VALUE) {
                round = Math.min(round, this.Eeka1udhb.CBQ5d1kRq());
            }
            this.RG6kpfv3v = round / this.MzoOEjc4X;
            View.MeasureSpec.makeMeasureSpec(round, this.Eeka1udhb.yWvV4ePLl());
            if (this.RG6kpfv3v != i22) {
                for (int i23 = 0; i23 < WaUP0CF083; i23++) {
                    View sk5s77z6Q2 = sk5s77z6Q(i23);
                    aXI58Y1kr axi58y1kr = (aXI58Y1kr) sk5s77z6Q2.getLayoutParams();
                    Objects.requireNonNull(axi58y1kr);
                    if (!zBLRafG4A() || this.dXrmkklc8 != 1) {
                        int i24 = axi58y1kr.kCA6Zs9sL.kCA6Zs9sL;
                        int i25 = this.dXrmkklc8;
                        int i26 = (this.RG6kpfv3v * i24) - (i24 * i22);
                        if (i25 == 1) {
                            sk5s77z6Q2.offsetLeftAndRight(i26);
                        } else {
                            sk5s77z6Q2.offsetTopAndBottom(i26);
                        }
                    } else {
                        int i27 = this.MzoOEjc4X;
                        int i28 = axi58y1kr.kCA6Zs9sL.kCA6Zs9sL;
                        sk5s77z6Q2.offsetLeftAndRight(((-((i27 - 1) - i28)) * this.RG6kpfv3v) - ((-((i27 - 1) - i28)) * i22));
                    }
                }
            }
        }
        if (WaUP0CF08() > 0) {
            if (this.WaUP0CF08) {
                DEe4ujgEA(v1xq9aVRv, kvfwrysux, true);
                PGC7L87Ev(v1xq9aVRv, kvfwrysux, false);
            } else {
                PGC7L87Ev(v1xq9aVRv, kvfwrysux, true);
                DEe4ujgEA(v1xq9aVRv, kvfwrysux, false);
            }
        }
        if (z && !kvfwrysux.GPLPRo6go) {
            if ((this.IytU16YUK == 0 || WaUP0CF08() <= 0 || BRiz0pFYm() == null) ? false : true) {
                Runnable runnable = this.i0Zug1mVk;
                RecyclerView recyclerView = this.J4Ux7ym32;
                if (recyclerView != null) {
                    recyclerView.removeCallbacks(runnable);
                }
            }
        }
        z4 = false;
        if (kvfwrysux.GPLPRo6go) {
            this.mUqPm6GBh.J4Ux7ym32();
        }
        this.CpG0imbht = mhl5lidbq.tGV7Q6urW;
        this.qFBXIgpia = zBLRafG4A();
        if (z4) {
            this.mUqPm6GBh.J4Ux7ym32();
            ASYHiorQ0(v1xq9aVRv, kvfwrysux, false);
        }
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
    public View BL4OzhZBd(View view, int i, RecyclerView.V1xq9aVRv v1xq9aVRv, RecyclerView.kvFwRYSUX kvfwrysux) {
        View qVUwofr5s;
        int i2;
        if (WaUP0CF08() == 0 || (qVUwofr5s = qVUwofr5s(view)) == null) {
            return null;
        }
        b8mIp5vIr();
        if (i == 1) {
            if (this.dXrmkklc8 != 1) {
            }
            i2 = -1;
        } else if (i == 2) {
            if (this.dXrmkklc8 != 1) {
            }
            i2 = 1;
        } else if (i != 17) {
            if (i != 33) {
                if (i == 66) {
                }
            }
            i2 = Integer.MIN_VALUE;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        aXI58Y1kr axi58y1kr = (aXI58Y1kr) qVUwofr5s.getLayoutParams();
        Objects.requireNonNull(axi58y1kr);
        dNif5KqqH dnif5kqqh = axi58y1kr.kCA6Zs9sL;
        int ZDWv1omvl = i2 == 1 ? ZDWv1omvl() : zH62iiANw();
        Nr79Zh2zt(ZDWv1omvl, kvfwrysux);
        PMt6uLcRh(i2);
        VDOiBfLc0 vDOiBfLc0 = this.ixWaw2akD;
        vDOiBfLc0.tGV7Q6urW = vDOiBfLc0.dIocxURUo + ZDWv1omvl;
        vDOiBfLc0.J4Ux7ym32 = (int) (((float) this.qVUwofr5s.CBQ5d1kRq()) * 0.33333334f);
        VDOiBfLc0 vDOiBfLc02 = this.ixWaw2akD;
        vDOiBfLc02.Puu3Rhg4F = true;
        vDOiBfLc02.q3BipwRCk = false;
        eylCJcWC7(v1xq9aVRv, vDOiBfLc02, kvfwrysux);
        this.CpG0imbht = this.WaUP0CF08;
        View yWvV4ePLl = dnif5kqqh.yWvV4ePLl(ZDWv1omvl, i2);
        if (!(yWvV4ePLl == null || yWvV4ePLl == qVUwofr5s)) {
            return yWvV4ePLl;
        }
        if (ZNy395opV(i2)) {
            for (int i3 = this.MzoOEjc4X - 1; i3 >= 0; i3--) {
                View yWvV4ePLl2 = this.ilHKhw3Yw[i3].yWvV4ePLl(ZDWv1omvl, i2);
                if (!(yWvV4ePLl2 == null || yWvV4ePLl2 == qVUwofr5s)) {
                    return yWvV4ePLl2;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.MzoOEjc4X; i4++) {
                View yWvV4ePLl3 = this.ilHKhw3Yw[i4].yWvV4ePLl(ZDWv1omvl, i2);
                if (!(yWvV4ePLl3 == null || yWvV4ePLl3 == qVUwofr5s)) {
                    return yWvV4ePLl3;
                }
            }
        }
        boolean z = (this.sk5s77z6Q ^ true) == (i2 == -1);
        View Eeka1udhb = Eeka1udhb(z ? dnif5kqqh.kCA6Zs9sL() : dnif5kqqh.iiGwOFFnr());
        if (!(Eeka1udhb == null || Eeka1udhb == qVUwofr5s)) {
            return Eeka1udhb;
        }
        if (ZNy395opV(i2)) {
            for (int i5 = this.MzoOEjc4X - 1; i5 >= 0; i5--) {
                if (i5 != dnif5kqqh.kCA6Zs9sL) {
                    dNif5KqqH[] dnif5kqqhArr = this.ilHKhw3Yw;
                    View Eeka1udhb2 = Eeka1udhb(z ? dnif5kqqhArr[i5].kCA6Zs9sL() : dnif5kqqhArr[i5].iiGwOFFnr());
                    if (!(Eeka1udhb2 == null || Eeka1udhb2 == qVUwofr5s)) {
                        return Eeka1udhb2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.MzoOEjc4X; i6++) {
                dNif5KqqH[] dnif5kqqhArr2 = this.ilHKhw3Yw;
                View Eeka1udhb3 = Eeka1udhb(z ? dnif5kqqhArr2[i6].kCA6Zs9sL() : dnif5kqqhArr2[i6].iiGwOFFnr());
                if (!(Eeka1udhb3 == null || Eeka1udhb3 == qVUwofr5s)) {
                    return Eeka1udhb3;
                }
            }
        }
        return null;
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
    public View BRiz0pFYm() {
        int i;
        boolean z;
        boolean z2;
        Object obj;
        int WaUP0CF08 = WaUP0CF08() - 1;
        BitSet bitSet = new BitSet(this.MzoOEjc4X);
        bitSet.set(0, this.MzoOEjc4X, true);
        int i2 = -1;
        char c = (this.dXrmkklc8 != 1 || !zBLRafG4A()) ? (char) 65535 : 1;
        if (this.WaUP0CF08) {
            i = -1;
        } else {
            i = WaUP0CF08 + 1;
            WaUP0CF08 = 0;
        }
        if (WaUP0CF08 < i) {
            i2 = 1;
        }
        while (WaUP0CF08 != i) {
            View sk5s77z6Q = sk5s77z6Q(WaUP0CF08);
            aXI58Y1kr axi58y1kr = (aXI58Y1kr) sk5s77z6Q.getLayoutParams();
            if (bitSet.get(axi58y1kr.kCA6Zs9sL.kCA6Zs9sL)) {
                dNif5KqqH dnif5kqqh = axi58y1kr.kCA6Zs9sL;
                if (this.WaUP0CF08) {
                    int i3 = dnif5kqqh.tGV7Q6urW;
                    if (i3 == Integer.MIN_VALUE) {
                        dnif5kqqh.J4Ux7ym32();
                        i3 = dnif5kqqh.tGV7Q6urW;
                    }
                    if (i3 < this.qVUwofr5s.GPLPRo6go()) {
                        ArrayList arrayList = dnif5kqqh.q3BipwRCk;
                        obj = arrayList.get(arrayList.size() - 1);
                        Objects.requireNonNull(dnif5kqqh.oon79WMrY((View) obj));
                        z2 = true;
                    }
                    z2 = false;
                } else {
                    int i4 = dnif5kqqh.J4Ux7ym32;
                    if (i4 == Integer.MIN_VALUE) {
                        dnif5kqqh.tGV7Q6urW();
                        i4 = dnif5kqqh.J4Ux7ym32;
                    }
                    if (i4 > this.qVUwofr5s.vPSbyrYWX()) {
                        obj = dnif5kqqh.q3BipwRCk.get(0);
                        Objects.requireNonNull(dnif5kqqh.oon79WMrY((View) obj));
                        z2 = true;
                    }
                    z2 = false;
                }
                if (z2) {
                    return sk5s77z6Q;
                }
                bitSet.clear(axi58y1kr.kCA6Zs9sL.kCA6Zs9sL);
            }
            int i5 = WaUP0CF08 + i2;
            if (i5 != i) {
                View sk5s77z6Q2 = sk5s77z6Q(i5);
                if (this.WaUP0CF08) {
                    int J4Ux7ym32 = this.qVUwofr5s.J4Ux7ym32(sk5s77z6Q);
                    int J4Ux7ym322 = this.qVUwofr5s.J4Ux7ym32(sk5s77z6Q2);
                    if (J4Ux7ym32 < J4Ux7ym322) {
                        return sk5s77z6Q;
                    }
                } else {
                    int kCA6Zs9sL = this.qVUwofr5s.kCA6Zs9sL(sk5s77z6Q);
                    int kCA6Zs9sL2 = this.qVUwofr5s.kCA6Zs9sL(sk5s77z6Q2);
                    if (kCA6Zs9sL > kCA6Zs9sL2) {
                        return sk5s77z6Q;
                    }
                }
                if (!z) {
                    continue;
                } else {
                    if ((axi58y1kr.kCA6Zs9sL.kCA6Zs9sL - ((aXI58Y1kr) sk5s77z6Q2.getLayoutParams()).kCA6Zs9sL.kCA6Zs9sL < 0) != (c < 0)) {
                        return sk5s77z6Q;
                    }
                }
            }
            WaUP0CF08 += i2;
        }
        return null;
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
    public final void bL31fPM8I(RecyclerView.V1xq9aVRv v1xq9aVRv, VDOiBfLc0 vDOiBfLc0) {
        int min;
        int min2;
        if (vDOiBfLc0.q3BipwRCk && !vDOiBfLc0.yWvV4ePLl) {
            if (vDOiBfLc0.J4Ux7ym32 != 0) {
                int i = 1;
                if (vDOiBfLc0.kCA6Zs9sL == -1) {
                    int i2 = vDOiBfLc0.iiGwOFFnr;
                    int vPSbyrYWX = this.ilHKhw3Yw[0].vPSbyrYWX(i2);
                    while (i < this.MzoOEjc4X) {
                        int vPSbyrYWX2 = this.ilHKhw3Yw[i].vPSbyrYWX(i2);
                        if (vPSbyrYWX2 > vPSbyrYWX) {
                            vPSbyrYWX = vPSbyrYWX2;
                        }
                        i++;
                    }
                    int i3 = i2 - vPSbyrYWX;
                    if (i3 >= 0) {
                        min2 = vDOiBfLc0.GPLPRo6go - Math.min(i3, vDOiBfLc0.J4Ux7ym32);
                        CBBuS2EIe(v1xq9aVRv, min2);
                        return;
                    }
                    min2 = vDOiBfLc0.GPLPRo6go;
                    CBBuS2EIe(v1xq9aVRv, min2);
                    return;
                }
                int i4 = vDOiBfLc0.GPLPRo6go;
                int Puu3Rhg4F = this.ilHKhw3Yw[0].Puu3Rhg4F(i4);
                while (i < this.MzoOEjc4X) {
                    int Puu3Rhg4F2 = this.ilHKhw3Yw[i].Puu3Rhg4F(i4);
                    if (Puu3Rhg4F2 < Puu3Rhg4F) {
                        Puu3Rhg4F = Puu3Rhg4F2;
                    }
                    i++;
                }
                int i5 = Puu3Rhg4F - vDOiBfLc0.GPLPRo6go;
                if (i5 >= 0) {
                    min = Math.min(i5, vDOiBfLc0.J4Ux7ym32) + vDOiBfLc0.iiGwOFFnr;
                    ShOkzyJ3y(v1xq9aVRv, min);
                }
                min = vDOiBfLc0.iiGwOFFnr;
                ShOkzyJ3y(v1xq9aVRv, min);
            }
        }
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
    public final void wrUk6NQP6(int i, int i2, int i3) {
        int i4;
        int i5;
        int ZDWv1omvl = this.WaUP0CF08 ? ZDWv1omvl() : zH62iiANw();
        if (i3 != 8) {
            i5 = i + i2;
        } else if (i < i2) {
            i5 = i2 + 1;
        } else {
            i5 = i + 1;
            i4 = i2;
            this.cAwN510t2.dIocxURUo(i4);
            if (i3 != 1) {
                this.cAwN510t2.kCA6Zs9sL(i, i2);
            } else if (i3 == 2) {
                this.cAwN510t2.iiGwOFFnr(i, i2);
            } else if (i3 == 8) {
                this.cAwN510t2.iiGwOFFnr(i, 1);
                this.cAwN510t2.kCA6Zs9sL(i2, 1);
            }
            if (i5 <= ZDWv1omvl) {
                if (i4 <= (this.WaUP0CF08 ? zH62iiANw() : ZDWv1omvl())) {
                    uSBmk4hFZ();
                    return;
                }
                return;
            }
            return;
        }
        i4 = i;
        this.cAwN510t2.dIocxURUo(i4);
        if (i3 != 1) {
        }
        if (i5 <= ZDWv1omvl) {
        }
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
