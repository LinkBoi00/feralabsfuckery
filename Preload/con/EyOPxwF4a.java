package con;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
/* loaded from: classes.dex */
public class EyOPxwF4a implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int q3BipwRCk;

    public EyOPxwF4a(int i) {
        this.q3BipwRCk = i;
    }

    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        switch (this.q3BipwRCk) {
            case 0:
                return new RecyclerView.BScqaI6mx(parcel, null);
            default:
                return new MaterialButton.aXI58Y1kr(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        switch (this.q3BipwRCk) {
            case 0:
                return new RecyclerView.BScqaI6mx[i];
            default:
                return new MaterialButton.aXI58Y1kr[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.q3BipwRCk) {
            case 0:
                return new RecyclerView.BScqaI6mx(parcel, classLoader);
            default:
                return new MaterialButton.aXI58Y1kr(parcel, classLoader);
        }
    }
}
