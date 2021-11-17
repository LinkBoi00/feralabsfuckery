package con;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* loaded from: classes.dex */
public final class KHy3Nhjbh implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int q3BipwRCk;

    public KHy3Nhjbh(int i) {
        this.q3BipwRCk = i;
    }

    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        switch (this.q3BipwRCk) {
            case 0:
                return q3BipwRCk(parcel, null);
            default:
                return new CoordinatorLayout.WfopS3efW(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        switch (this.q3BipwRCk) {
            case 0:
                return new WJknYg2ot[i];
            default:
                return new CoordinatorLayout.WfopS3efW[i];
        }
    }

    public WJknYg2ot q3BipwRCk(Parcel parcel, ClassLoader classLoader) {
        jdeJZ7JPq jdejz7jpq;
        if (classLoader == null) {
            classLoader = KHy3Nhjbh.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            jdejz7jpq = VpkLDqhd7.q3BipwRCk;
        } else if (readInt == 1) {
            jdejz7jpq = PSAOlugDJ.q3BipwRCk;
        } else if (readInt == 2) {
            jdejz7jpq = AE51MWSQF.q3BipwRCk;
        } else {
            throw new IllegalStateException("Unsupported MutableState policy " + readInt + " was restored");
        }
        return new WJknYg2ot(readValue, jdejz7jpq);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.q3BipwRCk) {
            case 0:
                return q3BipwRCk(parcel, classLoader);
            default:
                return new CoordinatorLayout.WfopS3efW(parcel, classLoader);
        }
    }
}
