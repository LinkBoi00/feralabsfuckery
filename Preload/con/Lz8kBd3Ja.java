package con;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class Lz8kBd3Ja {
    public Notification CBQ5d1kRq;
    public String Puu3Rhg4F;
    public CharSequence kCA6Zs9sL;
    public String oon79WMrY;
    public Context q3BipwRCk;
    public Bundle yWvV4ePLl;
    public ArrayList J4Ux7ym32 = new ArrayList();
    public ArrayList tGV7Q6urW = new ArrayList();
    public ArrayList dIocxURUo = new ArrayList();
    public boolean GPLPRo6go = true;
    public int iiGwOFFnr = 0;
    @Deprecated
    public ArrayList kmSgne1rO = new ArrayList();
    public boolean vPSbyrYWX = true;

    public Lz8kBd3Ja(Context context, String str) {
        Notification notification = new Notification();
        this.CBQ5d1kRq = notification;
        this.q3BipwRCk = context;
        this.oon79WMrY = str;
        notification.when = System.currentTimeMillis();
        this.CBQ5d1kRq.audioStreamType = -1;
    }

    public final void q3BipwRCk(int i, boolean z) {
        Notification notification;
        int i2;
        if (z) {
            notification = this.CBQ5d1kRq;
            i2 = i | notification.flags;
        } else {
            notification = this.CBQ5d1kRq;
            i2 = (~i) & notification.flags;
        }
        notification.flags = i2;
    }
}
