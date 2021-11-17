package con;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
/* loaded from: classes.dex */
public class wz74Hj7PC extends View.BaseSavedState {
    public static final Parcelable.Creator<wz74Hj7PC> CREATOR = new nszw3jam6(1);
    public boolean CBQ5d1kRq;

    public wz74Hj7PC(Parcel parcel) {
        super(parcel);
        this.CBQ5d1kRq = parcel.readByte() != 0;
    }

    public wz74Hj7PC(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.os.Parcelable, android.view.AbsSavedState
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.CBQ5d1kRq ? (byte) 1 : 0);
    }
}
