package con;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
/* loaded from: classes.dex */
public class QhIpuFtVf extends LVtOVALR4 {
    @Override // con.LVtOVALR4
    public Typeface J4Ux7ym32(Context context, CancellationSignal cancellationSignal, k9x1izWJn[] k9x1izwjnArr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = k9x1izwjnArr.length;
            int i2 = 0;
            FontFamily.Builder builder = null;
            int i3 = 0;
            while (true) {
                int i4 = 1;
                if (i3 < length) {
                    k9x1izWJn k9x1izwjn = k9x1izwjnArr[i3];
                    try {
                        openFileDescriptor = contentResolver.openFileDescriptor(k9x1izwjn.q3BipwRCk, "r", cancellationSignal);
                    } catch (IOException unused) {
                    }
                    if (openFileDescriptor != null) {
                        try {
                            Font.Builder weight = new Font.Builder(openFileDescriptor).setWeight(k9x1izwjn.tGV7Q6urW);
                            if (!k9x1izwjn.dIocxURUo) {
                                i4 = 0;
                            }
                            Font build = weight.setSlant(i4).setTtcIndex(k9x1izwjn.J4Ux7ym32).build();
                            if (builder == null) {
                                builder = new FontFamily.Builder(build);
                            } else {
                                builder.addFont(build);
                            }
                        } catch (Throwable th) {
                            try {
                                openFileDescriptor.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                            break;
                        }
                    } else if (openFileDescriptor == null) {
                        i3++;
                    }
                    openFileDescriptor.close();
                    i3++;
                } else if (builder == null) {
                    return null;
                } else {
                    int i5 = (i & 1) != 0 ? 700 : 400;
                    if ((i & 2) != 0) {
                        i2 = 1;
                    }
                    return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i5, i2)).build();
                }
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // con.LVtOVALR4
    public Typeface q3BipwRCk(Context context, fyPKNAQNN fypknaqnn, Resources resources, int i) {
        try {
            U90DuDsYT[] u90DuDsYTArr = fypknaqnn.q3BipwRCk;
            int length = u90DuDsYTArr.length;
            int i2 = 0;
            FontFamily.Builder builder = null;
            int i3 = 0;
            while (true) {
                int i4 = 1;
                if (i3 >= length) {
                    break;
                }
                U90DuDsYT u90DuDsYT = u90DuDsYTArr[i3];
                try {
                    Font.Builder weight = new Font.Builder(resources, u90DuDsYT.iiGwOFFnr).setWeight(u90DuDsYT.J4Ux7ym32);
                    if (!u90DuDsYT.tGV7Q6urW) {
                        i4 = 0;
                    }
                    Font build = weight.setSlant(i4).setTtcIndex(u90DuDsYT.kCA6Zs9sL).setFontVariationSettings(u90DuDsYT.dIocxURUo).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
                i3++;
            }
            if (builder == null) {
                return null;
            }
            int i5 = (i & 1) != 0 ? 700 : 400;
            if ((i & 2) != 0) {
                i2 = 1;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i5, i2)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // con.LVtOVALR4
    public Typeface tGV7Q6urW(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }
}
