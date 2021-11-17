package con;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.widget.NestedScrollView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
/* loaded from: classes.dex */
public class nszw3jam6 implements Parcelable.Creator {
    public final /* synthetic */ int q3BipwRCk;

    public nszw3jam6(int i) {
        this.q3BipwRCk = i;
    }

    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        switch (this.q3BipwRCk) {
            case 0:
                return new ullZnRGKg(parcel);
            case 1:
                return new wz74Hj7PC(parcel);
            case 2:
                return new NestedScrollView.aXI58Y1kr(parcel);
            case 3:
                return new C2GhuZDgj(parcel);
            case 4:
                return new SwipeRefreshLayout.Rma6SHcSH(parcel);
            default:
                return new gw5v9K7ct(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        switch (this.q3BipwRCk) {
            case 0:
                return new ullZnRGKg[i];
            case 1:
                return new wz74Hj7PC[i];
            case 2:
                return new NestedScrollView.aXI58Y1kr[i];
            case 3:
                return new C2GhuZDgj[i];
            case 4:
                return new SwipeRefreshLayout.Rma6SHcSH[i];
            default:
                return new gw5v9K7ct[i];
        }
    }
}
