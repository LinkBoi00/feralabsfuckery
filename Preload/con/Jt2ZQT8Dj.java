package con;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
/* loaded from: classes.dex */
public class Jt2ZQT8Dj implements Parcelable.Creator {
    public final /* synthetic */ int q3BipwRCk;

    public Jt2ZQT8Dj(int i) {
        this.q3BipwRCk = i;
    }

    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        switch (this.q3BipwRCk) {
            case 0:
                return new ryFFYfAhv(parcel);
            case 1:
                return new qBIc82vNg(parcel);
            case 2:
                return new LinearLayoutManager.qhPEQQaQ4(parcel);
            default:
                return new N6L1mvree(parcel.readLong(), null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        switch (this.q3BipwRCk) {
            case 0:
                return new ryFFYfAhv[i];
            case 1:
                return new qBIc82vNg[i];
            case 2:
                return new LinearLayoutManager.qhPEQQaQ4[i];
            default:
                return new N6L1mvree[i];
        }
    }
}
