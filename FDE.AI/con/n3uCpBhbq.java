package con;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class n3uCpBhbq implements Parcelable {
    public static final Parcelable.Creator<n3uCpBhbq> CREATOR = new xkS4L9No5(1);
    public kIZDNwKrn[] Bhmn1KIah;
    public ArrayList CBQ5d1kRq;
    public ArrayList Eeka1udhb;
    public String MzoOEjc4X;
    public int PSTqBLTET;
    public ArrayList ilHKhw3Yw;
    public ArrayList kmSgne1rO;
    public ArrayList qVUwofr5s;

    public n3uCpBhbq() {
        this.MzoOEjc4X = null;
        this.ilHKhw3Yw = new ArrayList();
        this.qVUwofr5s = new ArrayList();
    }

    public n3uCpBhbq(Parcel parcel) {
        this.MzoOEjc4X = null;
        this.ilHKhw3Yw = new ArrayList();
        this.qVUwofr5s = new ArrayList();
        this.CBQ5d1kRq = parcel.createTypedArrayList(C2GhuZDgj.CREATOR);
        this.kmSgne1rO = parcel.createStringArrayList();
        this.Bhmn1KIah = (kIZDNwKrn[]) parcel.createTypedArray(kIZDNwKrn.CREATOR);
        this.PSTqBLTET = parcel.readInt();
        this.MzoOEjc4X = parcel.readString();
        this.ilHKhw3Yw = parcel.createStringArrayList();
        this.qVUwofr5s = parcel.createTypedArrayList(Bundle.CREATOR);
        this.Eeka1udhb = parcel.createTypedArrayList(qBIc82vNg.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.CBQ5d1kRq);
        parcel.writeStringList(this.kmSgne1rO);
        parcel.writeTypedArray(this.Bhmn1KIah, i);
        parcel.writeInt(this.PSTqBLTET);
        parcel.writeString(this.MzoOEjc4X);
        parcel.writeStringList(this.ilHKhw3Yw);
        parcel.writeTypedList(this.qVUwofr5s);
        parcel.writeTypedList(this.Eeka1udhb);
    }
}
