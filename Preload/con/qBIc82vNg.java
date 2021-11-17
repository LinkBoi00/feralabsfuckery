package con;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class qBIc82vNg implements Parcelable {
    public static final Parcelable.Creator<qBIc82vNg> CREATOR = new Jt2ZQT8Dj(1);
    public String CBQ5d1kRq;
    public int kmSgne1rO;

    public qBIc82vNg(Parcel parcel) {
        this.CBQ5d1kRq = parcel.readString();
        this.kmSgne1rO = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.CBQ5d1kRq);
        parcel.writeInt(this.kmSgne1rO);
    }
}
