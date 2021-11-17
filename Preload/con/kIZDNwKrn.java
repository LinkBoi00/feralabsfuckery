package con;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class kIZDNwKrn implements Parcelable {
    public static final Parcelable.Creator<kIZDNwKrn> CREATOR = new xkS4L9No5(0);
    public final int[] Bhmn1KIah;
    public final int[] CBQ5d1kRq;
    public final int Eeka1udhb;
    public final int MzoOEjc4X;
    public final int[] PSTqBLTET;
    public final int RG6kpfv3v;
    public final ArrayList WaUP0CF08;
    public final CharSequence dXrmkklc8;
    public final boolean i8XZMQc6Z;
    public final String ilHKhw3Yw;
    public final CharSequence ixWaw2akD;
    public final ArrayList kmSgne1rO;
    public final int qVUwofr5s;
    public final ArrayList sk5s77z6Q;

    public kIZDNwKrn(Parcel parcel) {
        this.CBQ5d1kRq = parcel.createIntArray();
        this.kmSgne1rO = parcel.createStringArrayList();
        this.Bhmn1KIah = parcel.createIntArray();
        this.PSTqBLTET = parcel.createIntArray();
        this.MzoOEjc4X = parcel.readInt();
        this.ilHKhw3Yw = parcel.readString();
        this.qVUwofr5s = parcel.readInt();
        this.Eeka1udhb = parcel.readInt();
        this.dXrmkklc8 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.RG6kpfv3v = parcel.readInt();
        this.ixWaw2akD = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.sk5s77z6Q = parcel.createStringArrayList();
        this.WaUP0CF08 = parcel.createStringArrayList();
        this.i8XZMQc6Z = parcel.readInt() != 0;
    }

    public kIZDNwKrn(xkmNtxX26 xkmntxx26) {
        int size = xkmntxx26.q3BipwRCk.size();
        this.CBQ5d1kRq = new int[size * 5];
        if (xkmntxx26.GPLPRo6go) {
            this.kmSgne1rO = new ArrayList(size);
            this.Bhmn1KIah = new int[size];
            this.PSTqBLTET = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                ah1jjZN55 ah1jjzn55 = (ah1jjZN55) xkmntxx26.q3BipwRCk.get(i2);
                int i3 = i + 1;
                this.CBQ5d1kRq[i] = ah1jjzn55.q3BipwRCk;
                ArrayList arrayList = this.kmSgne1rO;
                UxHHqhbTP uxHHqhbTP = ah1jjzn55.J4Ux7ym32;
                arrayList.add(uxHHqhbTP != null ? uxHHqhbTP.MzoOEjc4X : null);
                int[] iArr = this.CBQ5d1kRq;
                int i4 = i3 + 1;
                iArr[i3] = ah1jjzn55.tGV7Q6urW;
                int i5 = i4 + 1;
                iArr[i4] = ah1jjzn55.dIocxURUo;
                int i6 = i5 + 1;
                iArr[i5] = ah1jjzn55.kCA6Zs9sL;
                i = i6 + 1;
                iArr[i6] = ah1jjzn55.iiGwOFFnr;
                this.Bhmn1KIah[i2] = ah1jjzn55.GPLPRo6go.ordinal();
                this.PSTqBLTET[i2] = ah1jjzn55.Puu3Rhg4F.ordinal();
            }
            this.MzoOEjc4X = xkmntxx26.iiGwOFFnr;
            this.ilHKhw3Yw = xkmntxx26.Puu3Rhg4F;
            this.qVUwofr5s = xkmntxx26.qVUwofr5s;
            this.Eeka1udhb = xkmntxx26.yWvV4ePLl;
            this.dXrmkklc8 = xkmntxx26.oon79WMrY;
            this.RG6kpfv3v = xkmntxx26.vPSbyrYWX;
            this.ixWaw2akD = xkmntxx26.CBQ5d1kRq;
            this.sk5s77z6Q = xkmntxx26.kmSgne1rO;
            this.WaUP0CF08 = xkmntxx26.Bhmn1KIah;
            this.i8XZMQc6Z = xkmntxx26.PSTqBLTET;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.CBQ5d1kRq);
        parcel.writeStringList(this.kmSgne1rO);
        parcel.writeIntArray(this.Bhmn1KIah);
        parcel.writeIntArray(this.PSTqBLTET);
        parcel.writeInt(this.MzoOEjc4X);
        parcel.writeString(this.ilHKhw3Yw);
        parcel.writeInt(this.qVUwofr5s);
        parcel.writeInt(this.Eeka1udhb);
        TextUtils.writeToParcel(this.dXrmkklc8, parcel, 0);
        parcel.writeInt(this.RG6kpfv3v);
        TextUtils.writeToParcel(this.ixWaw2akD, parcel, 0);
        parcel.writeStringList(this.sk5s77z6Q);
        parcel.writeStringList(this.WaUP0CF08);
        parcel.writeInt(this.i8XZMQc6Z ? 1 : 0);
    }
}
