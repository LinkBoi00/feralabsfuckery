package con;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.feravolt.preload.R;
/* loaded from: classes.dex */
public final class t88cbG83c implements FProNd3NJ {
    @Override // con.FProNd3NJ
    public void q3BipwRCk(Context context, ImageView imageView, String str, int i) {
        if (context != null && imageView != null) {
            RequestBuilder load = Glide.with(context).asBitmap().load(str);
            int width = imageView.getWidth();
            int applyDimension = (int) TypedValue.applyDimension(1, (float) 40, Resources.getSystem().getDisplayMetrics());
            if (width < applyDimension) {
                width = applyDimension;
            }
            load.override(width).error((int) R.drawable.ic_unknown_file_picker).into(imageView);
        }
    }
}
