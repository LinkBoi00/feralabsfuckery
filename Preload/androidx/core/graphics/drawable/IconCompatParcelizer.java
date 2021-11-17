package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import con.LSrfLcuPd;
import con.vaMyoIs7w;
import java.nio.charset.Charset;
import java.util.Objects;
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(LSrfLcuPd lSrfLcuPd) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.q3BipwRCk = lSrfLcuPd.yWvV4ePLl(iconCompat.q3BipwRCk, 1);
        byte[] bArr = iconCompat.tGV7Q6urW;
        if (lSrfLcuPd.Puu3Rhg4F(2)) {
            vaMyoIs7w vamyois7w = (vaMyoIs7w) lSrfLcuPd;
            int readInt = vamyois7w.kCA6Zs9sL.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                vamyois7w.kCA6Zs9sL.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.tGV7Q6urW = bArr;
        iconCompat.dIocxURUo = lSrfLcuPd.oon79WMrY(iconCompat.dIocxURUo, 3);
        iconCompat.kCA6Zs9sL = lSrfLcuPd.yWvV4ePLl(iconCompat.kCA6Zs9sL, 4);
        iconCompat.iiGwOFFnr = lSrfLcuPd.yWvV4ePLl(iconCompat.iiGwOFFnr, 5);
        iconCompat.GPLPRo6go = (ColorStateList) lSrfLcuPd.oon79WMrY(iconCompat.GPLPRo6go, 6);
        String str = iconCompat.yWvV4ePLl;
        if (lSrfLcuPd.Puu3Rhg4F(7)) {
            str = ((vaMyoIs7w) lSrfLcuPd).kCA6Zs9sL.readString();
        }
        iconCompat.yWvV4ePLl = str;
        String str2 = iconCompat.oon79WMrY;
        if (lSrfLcuPd.Puu3Rhg4F(8)) {
            str2 = ((vaMyoIs7w) lSrfLcuPd).kCA6Zs9sL.readString();
        }
        iconCompat.oon79WMrY = str2;
        iconCompat.Puu3Rhg4F = PorterDuff.Mode.valueOf(iconCompat.yWvV4ePLl);
        switch (iconCompat.q3BipwRCk) {
            case -1:
                parcelable = iconCompat.dIocxURUo;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.J4Ux7ym32 = parcelable;
                break;
            case 1:
            case 5:
                parcelable = iconCompat.dIocxURUo;
                if (parcelable == null) {
                    byte[] bArr3 = iconCompat.tGV7Q6urW;
                    iconCompat.J4Ux7ym32 = bArr3;
                    iconCompat.q3BipwRCk = 3;
                    iconCompat.kCA6Zs9sL = 0;
                    iconCompat.iiGwOFFnr = bArr3.length;
                    break;
                }
                iconCompat.J4Ux7ym32 = parcelable;
                break;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.tGV7Q6urW, Charset.forName("UTF-16"));
                iconCompat.J4Ux7ym32 = str3;
                if (iconCompat.q3BipwRCk == 2 && iconCompat.oon79WMrY == null) {
                    iconCompat.oon79WMrY = str3.split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                iconCompat.J4Ux7ym32 = iconCompat.tGV7Q6urW;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, LSrfLcuPd lSrfLcuPd) {
        Objects.requireNonNull(lSrfLcuPd);
        iconCompat.yWvV4ePLl = iconCompat.Puu3Rhg4F.name();
        switch (iconCompat.q3BipwRCk) {
            case -1:
            case 1:
            case 5:
                iconCompat.dIocxURUo = (Parcelable) iconCompat.J4Ux7ym32;
                break;
            case 2:
                iconCompat.tGV7Q6urW = ((String) iconCompat.J4Ux7ym32).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.tGV7Q6urW = (byte[]) iconCompat.J4Ux7ym32;
                break;
            case 4:
            case 6:
                iconCompat.tGV7Q6urW = iconCompat.J4Ux7ym32.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.q3BipwRCk;
        if (-1 != i) {
            lSrfLcuPd.kmSgne1rO(i, 1);
        }
        byte[] bArr = iconCompat.tGV7Q6urW;
        if (bArr != null) {
            lSrfLcuPd.CBQ5d1kRq(2);
            vaMyoIs7w vamyois7w = (vaMyoIs7w) lSrfLcuPd;
            vamyois7w.kCA6Zs9sL.writeInt(bArr.length);
            vamyois7w.kCA6Zs9sL.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.dIocxURUo;
        if (parcelable != null) {
            lSrfLcuPd.CBQ5d1kRq(3);
            ((vaMyoIs7w) lSrfLcuPd).kCA6Zs9sL.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.kCA6Zs9sL;
        if (i2 != 0) {
            lSrfLcuPd.kmSgne1rO(i2, 4);
        }
        int i3 = iconCompat.iiGwOFFnr;
        if (i3 != 0) {
            lSrfLcuPd.kmSgne1rO(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.GPLPRo6go;
        if (colorStateList != null) {
            lSrfLcuPd.CBQ5d1kRq(6);
            ((vaMyoIs7w) lSrfLcuPd).kCA6Zs9sL.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.yWvV4ePLl;
        if (str != null) {
            lSrfLcuPd.CBQ5d1kRq(7);
            ((vaMyoIs7w) lSrfLcuPd).kCA6Zs9sL.writeString(str);
        }
        String str2 = iconCompat.oon79WMrY;
        if (str2 != null) {
            lSrfLcuPd.CBQ5d1kRq(8);
            ((vaMyoIs7w) lSrfLcuPd).kCA6Zs9sL.writeString(str2);
        }
    }
}
