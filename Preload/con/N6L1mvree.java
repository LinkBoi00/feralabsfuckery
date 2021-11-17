package con;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public class N6L1mvree implements z7BMZ3UDZ {
    public static final Parcelable.Creator<N6L1mvree> CREATOR = new Jt2ZQT8Dj(3);
    public final long CBQ5d1kRq;

    public N6L1mvree(long j) {
        this.CBQ5d1kRq = j;
    }

    public N6L1mvree(long j, Jt2ZQT8Dj jt2ZQT8Dj) {
        this.CBQ5d1kRq = j;
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
        return (obj instanceof N6L1mvree) && this.CBQ5d1kRq == ((N6L1mvree) obj).CBQ5d1kRq;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.CBQ5d1kRq)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.CBQ5d1kRq);
    }
}
