package con;

import android.content.Context;
import com.feravolt.preload.R;
/* loaded from: classes.dex */
public class Zgs44gQcc {
    public static final int iiGwOFFnr = (int) Math.round(5.1000000000000005d);
    public final int J4Ux7ym32;
    public final int dIocxURUo;
    public final float kCA6Zs9sL;
    public final boolean q3BipwRCk;
    public final int tGV7Q6urW;

    public Zgs44gQcc(Context context) {
        boolean dIocxURUo = KYuHUB7GA.dIocxURUo(context, R.attr.elevationOverlayEnabled, false);
        int vPSbyrYWX = D3DEikrvb.vPSbyrYWX(context, R.attr.elevationOverlayColor, 0);
        int vPSbyrYWX2 = D3DEikrvb.vPSbyrYWX(context, R.attr.elevationOverlayAccentColor, 0);
        int vPSbyrYWX3 = D3DEikrvb.vPSbyrYWX(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.q3BipwRCk = dIocxURUo;
        this.J4Ux7ym32 = vPSbyrYWX;
        this.tGV7Q6urW = vPSbyrYWX2;
        this.dIocxURUo = vPSbyrYWX3;
        this.kCA6Zs9sL = f;
    }
}
