package con;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
/* loaded from: classes.dex */
public class mcHYF60Gb implements Parcelable.Creator {
    public final /* synthetic */ int q3BipwRCk;

    public mcHYF60Gb(int i) {
        this.q3BipwRCk = i;
    }

    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        switch (this.q3BipwRCk) {
            case 0:
                return new ifzHtOtm3(parcel.readInt());
            case 1:
                return new StaggeredGridLayoutManager.s7MlVynBG(parcel);
            default:
                return new RAxgJWiGj((mznBSeryj) parcel.readParcelable(mznBSeryj.class.getClassLoader()), (mznBSeryj) parcel.readParcelable(mznBSeryj.class.getClassLoader()), (z7BMZ3UDZ) parcel.readParcelable(z7BMZ3UDZ.class.getClassLoader()), (mznBSeryj) parcel.readParcelable(mznBSeryj.class.getClassLoader()), null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        switch (this.q3BipwRCk) {
            case 0:
                return new ifzHtOtm3[i];
            case 1:
                return new StaggeredGridLayoutManager.s7MlVynBG[i];
            default:
                return new RAxgJWiGj[i];
        }
    }
}
