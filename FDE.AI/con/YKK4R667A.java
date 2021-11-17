package con;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.widget.NestedScrollView;
/* loaded from: classes.dex */
public class YKK4R667A implements NestedScrollView.mhl5lIdbQ {
    public static YKK4R667A dIocxURUo;
    public final Object J4Ux7ym32;
    public final Object q3BipwRCk;
    public final Object tGV7Q6urW = new AcTXRPxx6();

    public YKK4R667A(Context context, LocationManager locationManager) {
        this.q3BipwRCk = context;
        this.J4Ux7ym32 = locationManager;
    }

    public Location q3BipwRCk(String str) {
        try {
            if (((LocationManager) this.J4Ux7ym32).isProviderEnabled(str)) {
                return ((LocationManager) this.J4Ux7ym32).getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }
}
