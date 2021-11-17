package con;

import android.content.Context;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import java.io.File;
/* loaded from: classes.dex */
public final class KGIEv8RD5 implements FProNd3NJ {
    @Override // con.FProNd3NJ
    public void q3BipwRCk(Context context, ImageView imageView, String str, int i) {
        boolean z = true;
        if (str == null || !r6NbD4wnj.wIZEdYHUn(str, "http", false, 2)) {
            z = false;
        }
        Picasso with = Picasso.with(context);
        (z ? with.load(str) : with.load(new File(str))).placeholder(i).into(imageView);
    }
}
