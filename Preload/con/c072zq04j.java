package con;

import android.text.Layout;
/* loaded from: classes.dex */
public abstract class c072zq04j {
    public static final Layout.Alignment J4Ux7ym32;
    public static final c072zq04j q3BipwRCk = null;
    public static final Layout.Alignment tGV7Q6urW;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        int length = values.length;
        int i = 0;
        Layout.Alignment alignment2 = alignment;
        while (i < length) {
            Layout.Alignment alignment3 = values[i];
            i++;
            if (anXlDk6fV.tGV7Q6urW(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (anXlDk6fV.tGV7Q6urW(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        J4Ux7ym32 = alignment;
        tGV7Q6urW = alignment2;
    }
}
