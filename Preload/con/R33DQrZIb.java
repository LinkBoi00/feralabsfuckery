package con;

import android.graphics.Color;
/* loaded from: classes.dex */
public abstract class R33DQrZIb {
    static {
        new ThreadLocal();
    }

    public static int J4Ux7ym32(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i3, tGV7Q6urW(Color.red(i), alpha2, Color.red(i2), alpha, i3), tGV7Q6urW(Color.green(i), alpha2, Color.green(i2), alpha, i3), tGV7Q6urW(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    public static int dIocxURUo(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static int kCA6Zs9sL(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    public static int q3BipwRCk(double d, double d2, double d3) {
        double d4 = ((-0.4986d * d3) + ((-1.5372d * d2) + (3.2406d * d))) / 100.0d;
        double d5 = ((0.0415d * d3) + ((1.8758d * d2) + (-0.9689d * d))) / 100.0d;
        double d6 = ((1.057d * d3) + ((-0.204d * d2) + (0.0557d * d))) / 100.0d;
        return Color.rgb(dIocxURUo((int) Math.round((d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d) * 255.0d), 0, 255), dIocxURUo((int) Math.round((d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d) * 255.0d), 0, 255), dIocxURUo((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d), 0, 255));
    }

    public static int tGV7Q6urW(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * 255) * i2)) / (i5 * 255);
    }
}
