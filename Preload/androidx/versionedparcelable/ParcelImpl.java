package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import con.ZYfyy7xWN;
import con.vaMyoIs7w;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new RG2GI7LDp();
    public final ZYfyy7xWN CBQ5d1kRq;

    /* loaded from: classes.dex */
    public static class RG2GI7LDp implements Parcelable.Creator<ParcelImpl> {
        @Override // android.os.Parcelable.Creator
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.CBQ5d1kRq = new vaMyoIs7w(parcel).vPSbyrYWX();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        new vaMyoIs7w(parcel).PSTqBLTET(this.CBQ5d1kRq);
    }
}
