package con;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
/* loaded from: classes.dex */
public class jSmvdSgdz implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int q3BipwRCk;

    public jSmvdSgdz(int i) {
        this.q3BipwRCk = i;
    }

    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        switch (this.q3BipwRCk) {
            case 0:
                return new Toolbar.WfopS3efW(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return s7MlVynBG.kmSgne1rO;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new BottomSheetBehavior.qhPEQQaQ4(parcel, (ClassLoader) null);
            default:
                return new TextInputLayout.PMYI4lLJM(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        switch (this.q3BipwRCk) {
            case 0:
                return new Toolbar.WfopS3efW[i];
            case 1:
                return new s7MlVynBG[i];
            case 2:
                return new BottomSheetBehavior.qhPEQQaQ4[i];
            default:
                return new TextInputLayout.PMYI4lLJM[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.q3BipwRCk) {
            case 0:
                return new Toolbar.WfopS3efW(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return s7MlVynBG.kmSgne1rO;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new BottomSheetBehavior.qhPEQQaQ4(parcel, classLoader);
            default:
                return new TextInputLayout.PMYI4lLJM(parcel, classLoader);
        }
    }
}
