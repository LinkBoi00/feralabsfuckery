package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode vPSbyrYWX = PorterDuff.Mode.SRC_IN;
    public Object J4Ux7ym32;
    public String oon79WMrY;
    public int q3BipwRCk = -1;
    public byte[] tGV7Q6urW = null;
    public Parcelable dIocxURUo = null;
    public int kCA6Zs9sL = 0;
    public int iiGwOFFnr = 0;
    public ColorStateList GPLPRo6go = null;
    public PorterDuff.Mode Puu3Rhg4F = vPSbyrYWX;
    public String yWvV4ePLl = null;

    public int q3BipwRCk() {
        int i = this.q3BipwRCk;
        if (i == -1) {
            int i2 = Build.VERSION.SDK_INT;
            Icon icon = (Icon) this.J4Ux7ym32;
            if (i2 >= 28) {
                return icon.getResId();
            }
            try {
                return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                Log.e("IconCompat", "Unable to get icon resource", e);
                return 0;
            }
        } else if (i == 2) {
            return this.kCA6Zs9sL;
        } else {
            throw new IllegalStateException("called getResId() on " + this);
        }
    }

    public String toString() {
        String str;
        int i;
        if (this.q3BipwRCk == -1) {
            return String.valueOf(this.J4Ux7ym32);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.q3BipwRCk) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.q3BipwRCk) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.J4Ux7ym32).getWidth());
                sb.append("x");
                i = ((Bitmap) this.J4Ux7ym32).getHeight();
                sb.append(i);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.oon79WMrY);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(q3BipwRCk())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.kCA6Zs9sL);
                if (this.iiGwOFFnr != 0) {
                    sb.append(" off=");
                    i = this.iiGwOFFnr;
                    sb.append(i);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.J4Ux7ym32);
                break;
        }
        if (this.GPLPRo6go != null) {
            sb.append(" tint=");
            sb.append(this.GPLPRo6go);
        }
        if (this.Puu3Rhg4F != vPSbyrYWX) {
            sb.append(" mode=");
            sb.append(this.Puu3Rhg4F);
        }
        sb.append(")");
        return sb.toString();
    }
}
