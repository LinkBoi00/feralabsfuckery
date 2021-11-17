package con;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class ullZnRGKg implements Parcelable {
    public static final Parcelable.Creator<ullZnRGKg> CREATOR = new nszw3jam6(0);
    public final int CBQ5d1kRq;
    public final Intent kmSgne1rO;

    public ullZnRGKg(int i, Intent intent) {
        this.CBQ5d1kRq = i;
        this.kmSgne1rO = intent;
    }

    public ullZnRGKg(Parcel parcel) {
        this.CBQ5d1kRq = parcel.readInt();
        this.kmSgne1rO = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("ActivityResult{resultCode=");
        int i = this.CBQ5d1kRq;
        q3BipwRCk.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        q3BipwRCk.append(", data=");
        q3BipwRCk.append(this.kmSgne1rO);
        q3BipwRCk.append('}');
        return q3BipwRCk.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.CBQ5d1kRq);
        parcel.writeInt(this.kmSgne1rO == null ? 0 : 1);
        Intent intent = this.kmSgne1rO;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
