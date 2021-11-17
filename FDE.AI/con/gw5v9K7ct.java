package con;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public class gw5v9K7ct implements Parcelable {
    public static final Parcelable.Creator<gw5v9K7ct> CREATOR = new nszw3jam6(5);
    public int Bhmn1KIah;
    public final int CBQ5d1kRq;
    public int PSTqBLTET;
    public int kmSgne1rO;

    public gw5v9K7ct(Parcel parcel) {
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        this.kmSgne1rO = readInt;
        this.Bhmn1KIah = readInt2;
        this.PSTqBLTET = readInt3;
        this.CBQ5d1kRq = readInt4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw5v9K7ct)) {
            return false;
        }
        gw5v9K7ct gw5v9k7ct = (gw5v9K7ct) obj;
        return this.kmSgne1rO == gw5v9k7ct.kmSgne1rO && this.Bhmn1KIah == gw5v9k7ct.Bhmn1KIah && this.CBQ5d1kRq == gw5v9k7ct.CBQ5d1kRq && this.PSTqBLTET == gw5v9k7ct.PSTqBLTET;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.CBQ5d1kRq), Integer.valueOf(this.kmSgne1rO), Integer.valueOf(this.Bhmn1KIah), Integer.valueOf(this.PSTqBLTET)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.kmSgne1rO);
        parcel.writeInt(this.Bhmn1KIah);
        parcel.writeInt(this.PSTqBLTET);
        parcel.writeInt(this.CBQ5d1kRq);
    }
}
