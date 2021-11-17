package con;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
/* loaded from: classes.dex */
public class xkS4L9No5 implements Parcelable.Creator {
    public final /* synthetic */ int q3BipwRCk;

    public xkS4L9No5(int i) {
        this.q3BipwRCk = i;
    }

    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        switch (this.q3BipwRCk) {
            case 0:
                return new kIZDNwKrn(parcel);
            case 1:
                return new n3uCpBhbq(parcel);
            case 2:
                return new StaggeredGridLayoutManager.qhPEQQaQ4.RG2GI7LDp(parcel);
            default:
                return mznBSeryj.iiGwOFFnr(parcel.readInt(), parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        switch (this.q3BipwRCk) {
            case 0:
                return new kIZDNwKrn[i];
            case 1:
                return new n3uCpBhbq[i];
            case 2:
                return new StaggeredGridLayoutManager.qhPEQQaQ4.RG2GI7LDp[i];
            default:
                return new mznBSeryj[i];
        }
    }
}
