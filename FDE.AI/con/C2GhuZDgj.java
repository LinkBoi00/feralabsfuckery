package con;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class C2GhuZDgj implements Parcelable {
    public static final Parcelable.Creator<C2GhuZDgj> CREATOR = new nszw3jam6(3);
    public final boolean Bhmn1KIah;
    public final String CBQ5d1kRq;
    public final boolean Eeka1udhb;
    public final int MzoOEjc4X;
    public final int PSTqBLTET;
    public final Bundle RG6kpfv3v;
    public Bundle WaUP0CF08;
    public final boolean dXrmkklc8;
    public final String ilHKhw3Yw;
    public final boolean ixWaw2akD;
    public final String kmSgne1rO;
    public final boolean qVUwofr5s;
    public final int sk5s77z6Q;

    public C2GhuZDgj(Parcel parcel) {
        this.CBQ5d1kRq = parcel.readString();
        this.kmSgne1rO = parcel.readString();
        boolean z = true;
        this.Bhmn1KIah = parcel.readInt() != 0;
        this.PSTqBLTET = parcel.readInt();
        this.MzoOEjc4X = parcel.readInt();
        this.ilHKhw3Yw = parcel.readString();
        this.qVUwofr5s = parcel.readInt() != 0;
        this.Eeka1udhb = parcel.readInt() != 0;
        this.dXrmkklc8 = parcel.readInt() != 0;
        this.RG6kpfv3v = parcel.readBundle();
        this.ixWaw2akD = parcel.readInt() == 0 ? false : z;
        this.WaUP0CF08 = parcel.readBundle();
        this.sk5s77z6Q = parcel.readInt();
    }

    public C2GhuZDgj(UxHHqhbTP uxHHqhbTP) {
        this.CBQ5d1kRq = uxHHqhbTP.getClass().getName();
        this.kmSgne1rO = uxHHqhbTP.MzoOEjc4X;
        this.Bhmn1KIah = uxHHqhbTP.WaUP0CF08;
        this.PSTqBLTET = uxHHqhbTP.AqaWJg0b4;
        this.MzoOEjc4X = uxHHqhbTP.mUqPm6GBh;
        this.ilHKhw3Yw = uxHHqhbTP.NyWTwPF6V;
        this.qVUwofr5s = uxHHqhbTP.o4LF8RkoQ;
        this.Eeka1udhb = uxHHqhbTP.sk5s77z6Q;
        this.dXrmkklc8 = uxHHqhbTP.i0Zug1mVk;
        this.RG6kpfv3v = uxHHqhbTP.ilHKhw3Yw;
        this.ixWaw2akD = uxHHqhbTP.vNtjxmzUM;
        this.sk5s77z6Q = uxHHqhbTP.ziwPzaoF3.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.CBQ5d1kRq);
        sb.append(" (");
        sb.append(this.kmSgne1rO);
        sb.append(")}:");
        if (this.Bhmn1KIah) {
            sb.append(" fromLayout");
        }
        if (this.MzoOEjc4X != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.MzoOEjc4X));
        }
        String str = this.ilHKhw3Yw;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.ilHKhw3Yw);
        }
        if (this.qVUwofr5s) {
            sb.append(" retainInstance");
        }
        if (this.Eeka1udhb) {
            sb.append(" removing");
        }
        if (this.dXrmkklc8) {
            sb.append(" detached");
        }
        if (this.ixWaw2akD) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.CBQ5d1kRq);
        parcel.writeString(this.kmSgne1rO);
        parcel.writeInt(this.Bhmn1KIah ? 1 : 0);
        parcel.writeInt(this.PSTqBLTET);
        parcel.writeInt(this.MzoOEjc4X);
        parcel.writeString(this.ilHKhw3Yw);
        parcel.writeInt(this.qVUwofr5s ? 1 : 0);
        parcel.writeInt(this.Eeka1udhb ? 1 : 0);
        parcel.writeInt(this.dXrmkklc8 ? 1 : 0);
        parcel.writeBundle(this.RG6kpfv3v);
        parcel.writeInt(this.ixWaw2akD ? 1 : 0);
        parcel.writeBundle(this.WaUP0CF08);
        parcel.writeInt(this.sk5s77z6Q);
    }
}
