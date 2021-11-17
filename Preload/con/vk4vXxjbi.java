package con;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.CheckableImageButton;
/* loaded from: classes.dex */
public class vk4vXxjbi implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int q3BipwRCk;

    public vk4vXxjbi(int i) {
        this.q3BipwRCk = i;
    }

    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        switch (this.q3BipwRCk) {
            case 0:
                return new SearchView.Og6dYSoy7(parcel, null);
            case 1:
                return new AppBarLayout.BaseBehavior.RG2GI7LDp(parcel, null);
            default:
                return new CheckableImageButton.RG2GI7LDp(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        switch (this.q3BipwRCk) {
            case 0:
                return new SearchView.Og6dYSoy7[i];
            case 1:
                return new AppBarLayout.BaseBehavior.RG2GI7LDp[i];
            default:
                return new CheckableImageButton.RG2GI7LDp[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.q3BipwRCk) {
            case 0:
                return new SearchView.Og6dYSoy7(parcel, classLoader);
            case 1:
                return new AppBarLayout.BaseBehavior.RG2GI7LDp(parcel, classLoader);
            default:
                return new CheckableImageButton.RG2GI7LDp(parcel, classLoader);
        }
    }
}
