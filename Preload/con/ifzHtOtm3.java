package con;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ifzHtOtm3 implements Parcelable {
    public static final Parcelable.Creator<ifzHtOtm3> CREATOR = new mcHYF60Gb(0);
    public final int CBQ5d1kRq;

    public ifzHtOtm3(int i) {
        this.CBQ5d1kRq = i;
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
        return (obj instanceof ifzHtOtm3) && this.CBQ5d1kRq == ((ifzHtOtm3) obj).CBQ5d1kRq;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Integer.hashCode(this.CBQ5d1kRq);
    }

    @Override // java.lang.Object
    public String toString() {
        return dbCvJyBoB.q3BipwRCk(abGBwSu8x.q3BipwRCk("DefaultLazyKey(index="), this.CBQ5d1kRq, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.CBQ5d1kRq);
    }
}
