package con;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ryFFYfAhv implements Parcelable {
    public static final Parcelable.Creator<ryFFYfAhv> CREATOR = new Jt2ZQT8Dj(0);
    public final int Bhmn1KIah;
    public final IntentSender CBQ5d1kRq;
    public final int PSTqBLTET;
    public final Intent kmSgne1rO;

    public ryFFYfAhv(Parcel parcel) {
        this.CBQ5d1kRq = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.kmSgne1rO = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.Bhmn1KIah = parcel.readInt();
        this.PSTqBLTET = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.CBQ5d1kRq, i);
        parcel.writeParcelable(this.kmSgne1rO, i);
        parcel.writeInt(this.Bhmn1KIah);
        parcel.writeInt(this.PSTqBLTET);
    }
}
