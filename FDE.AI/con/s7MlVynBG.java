package con;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public abstract class s7MlVynBG implements Parcelable {
    public final Parcelable CBQ5d1kRq;
    public static final s7MlVynBG kmSgne1rO = new qhPEQQaQ4();
    public static final Parcelable.Creator<s7MlVynBG> CREATOR = new jSmvdSgdz(1);

    public s7MlVynBG(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.CBQ5d1kRq = readParcelable == null ? kmSgne1rO : readParcelable;
    }

    public s7MlVynBG(Parcelable parcelable) {
        if (parcelable != null) {
            this.CBQ5d1kRq = parcelable == kmSgne1rO ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public s7MlVynBG(qhPEQQaQ4 qhpeqqaq4) {
        this.CBQ5d1kRq = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.CBQ5d1kRq, i);
    }
}
