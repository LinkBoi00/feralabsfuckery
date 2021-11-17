package con;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class WJknYg2ot extends prCJwNx2x implements Parcelable {
    public static final Parcelable.Creator<WJknYg2ot<Object>> CREATOR = new KHy3Nhjbh(0);

    public WJknYg2ot(Object obj, jdeJZ7JPq jdejz7jpq) {
        super(obj, jdejz7jpq);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        jdeJZ7JPq jdejz7jpq = this.CBQ5d1kRq;
        if (anXlDk6fV.tGV7Q6urW(jdejz7jpq, VpkLDqhd7.q3BipwRCk)) {
            i2 = 0;
        } else if (anXlDk6fV.tGV7Q6urW(jdejz7jpq, PSAOlugDJ.q3BipwRCk)) {
            i2 = 1;
        } else if (anXlDk6fV.tGV7Q6urW(jdejz7jpq, AE51MWSQF.q3BipwRCk)) {
            i2 = 2;
        } else {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
        }
        parcel.writeInt(i2);
    }
}
