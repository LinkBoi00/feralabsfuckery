package con;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
/* loaded from: classes.dex */
public class mrqhBRukL extends ftUv7nIZr {
    public static boolean yWvV4ePLl = true;

    @Override // con.ZNRZ3lc8t
    @SuppressLint({"NewApi"})
    public void Puu3Rhg4F(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.Puu3Rhg4F(view, i);
        } else if (yWvV4ePLl) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                yWvV4ePLl = false;
            }
        }
    }
}
