package con;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class IosOyUQuh {
    public final int J4Ux7ym32;
    public final YK9K1XOO8 dIocxURUo;
    public final llWJsfBCK iiGwOFFnr;
    public final List kCA6Zs9sL;
    public final AyMB2YALh q3BipwRCk;
    public final float tGV7Q6urW;

    public IosOyUQuh(AyMB2YALh ayMB2YALh, int i, boolean z, float f) {
        boolean z2;
        int i2;
        boolean z3;
        List list;
        bzmJZsHMu bzmjzshmu;
        float f2;
        float f3;
        float f4;
        int i3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        this.q3BipwRCk = ayMB2YALh;
        this.J4Ux7ym32 = i;
        this.tGV7Q6urW = f;
        if ((i >= 1 ? 1 : null) != null) {
            if ((f >= 0.0f ? 1 : null) != null) {
                GjhoS54Hf gjhoS54Hf = ayMB2YALh.J4Ux7ym32;
                vZSd4byf0 vzsd4byf0 = gjhoS54Hf.PSTqBLTET;
                if (vzsd4byf0 == null) {
                    z2 = false;
                } else {
                    z2 = vZSd4byf0.q3BipwRCk(vzsd4byf0.q3BipwRCk, 1);
                }
                if (z2) {
                    i2 = 3;
                } else {
                    if (vzsd4byf0 == null) {
                        z4 = false;
                    } else {
                        z4 = vZSd4byf0.q3BipwRCk(vzsd4byf0.q3BipwRCk, 2);
                    }
                    if (z4) {
                        i2 = 4;
                    } else {
                        if (vzsd4byf0 == null) {
                            z5 = false;
                        } else {
                            z5 = vZSd4byf0.q3BipwRCk(vzsd4byf0.q3BipwRCk, 3);
                        }
                        if (z5) {
                            i2 = 2;
                        } else {
                            if (vzsd4byf0 == null) {
                                z6 = false;
                            } else {
                                z6 = vZSd4byf0.q3BipwRCk(vzsd4byf0.q3BipwRCk, 5);
                            }
                            if (!z6) {
                                if (vzsd4byf0 == null) {
                                    z7 = false;
                                } else {
                                    z7 = vZSd4byf0.q3BipwRCk(vzsd4byf0.q3BipwRCk, 6);
                                }
                                if (z7) {
                                    i2 = 1;
                                }
                            }
                            i2 = 0;
                        }
                    }
                }
                vZSd4byf0 vzsd4byf02 = gjhoS54Hf.PSTqBLTET;
                if (vzsd4byf02 == null) {
                    z3 = false;
                } else {
                    z3 = vZSd4byf0.q3BipwRCk(vzsd4byf02.q3BipwRCk, 4);
                }
                TextUtils.TruncateAt truncateAt = z ? TextUtils.TruncateAt.END : null;
                CharSequence charSequence = ayMB2YALh.Puu3Rhg4F;
                tDoi4vPEw tdoi4vpew = ayMB2YALh.GPLPRo6go;
                int i4 = ayMB2YALh.oon79WMrY;
                j6XJY7rz4 j6xjy7rz4 = ayMB2YALh.yWvV4ePLl;
                int i5 = z3 ? 1 : 0;
                int i6 = z3 ? 1 : 0;
                int i7 = z3 ? 1 : 0;
                this.dIocxURUo = new YK9K1XOO8(charSequence, f, tdoi4vpew, i2, truncateAt, i4, 1.0f, 0.0f, false, i, 0, 0, i5, null, null, j6xjy7rz4, 28032);
                CharSequence charSequence2 = ayMB2YALh.Puu3Rhg4F;
                if (!(charSequence2 instanceof Spanned)) {
                    list = Dqz1pJHWH.CBQ5d1kRq;
                } else {
                    Object[] spans = ((Spanned) charSequence2).getSpans(0, charSequence2.length(), fV9DNy8vC.class);
                    ArrayList arrayList = new ArrayList(spans.length);
                    for (Object obj : spans) {
                        fV9DNy8vC fv9dny8vc = (fV9DNy8vC) obj;
                        Spanned spanned = (Spanned) charSequence2;
                        int spanStart = spanned.getSpanStart(fv9dny8vc);
                        int spanEnd = spanned.getSpanEnd(fv9dny8vc);
                        int dIocxURUo = this.dIocxURUo.dIocxURUo(spanStart);
                        boolean z8 = this.dIocxURUo.J4Ux7ym32.getEllipsisCount(dIocxURUo) > 0 && spanEnd > this.dIocxURUo.J4Ux7ym32.getEllipsisStart(dIocxURUo);
                        boolean z9 = spanEnd > this.dIocxURUo.tGV7Q6urW(dIocxURUo);
                        if (z8 || z9) {
                            bzmjzshmu = null;
                        } else {
                            int ordinal = (this.dIocxURUo.J4Ux7ym32.isRtlCharAt(spanStart) ? sL9xhCFIS.Rtl : sL9xhCFIS.Ltr).ordinal();
                            if (ordinal == 0) {
                                f2 = J4Ux7ym32(spanStart, true);
                            } else if (ordinal == 1) {
                                f2 = J4Ux7ym32(spanStart, true) - ((float) fv9dny8vc.tGV7Q6urW());
                            } else {
                                throw new dnCerKhAM();
                            }
                            float tGV7Q6urW = ((float) fv9dny8vc.tGV7Q6urW()) + f2;
                            YK9K1XOO8 yk9k1xoo8 = this.dIocxURUo;
                            switch (fv9dny8vc.ilHKhw3Yw) {
                                case 0:
                                    f4 = yk9k1xoo8.q3BipwRCk(dIocxURUo);
                                    f3 = f4 - ((float) fv9dny8vc.J4Ux7ym32());
                                    break;
                                case 1:
                                    f3 = yk9k1xoo8.kCA6Zs9sL(dIocxURUo);
                                    break;
                                case 2:
                                    f4 = yk9k1xoo8.J4Ux7ym32(dIocxURUo);
                                    f3 = f4 - ((float) fv9dny8vc.J4Ux7ym32());
                                    break;
                                case 3:
                                    f3 = ((yk9k1xoo8.J4Ux7ym32(dIocxURUo) + yk9k1xoo8.kCA6Zs9sL(dIocxURUo)) - ((float) fv9dny8vc.J4Ux7ym32())) / ((float) 2);
                                    break;
                                case 4:
                                    i3 = fv9dny8vc.q3BipwRCk().ascent;
                                    f3 = yk9k1xoo8.q3BipwRCk(dIocxURUo) + ((float) i3);
                                    break;
                                case 5:
                                    f4 = yk9k1xoo8.q3BipwRCk(dIocxURUo) + ((float) fv9dny8vc.q3BipwRCk().descent);
                                    f3 = f4 - ((float) fv9dny8vc.J4Ux7ym32());
                                    break;
                                case 6:
                                    Paint.FontMetricsInt q3BipwRCk = fv9dny8vc.q3BipwRCk();
                                    i3 = ((q3BipwRCk.ascent + q3BipwRCk.descent) - fv9dny8vc.J4Ux7ym32()) / 2;
                                    f3 = yk9k1xoo8.q3BipwRCk(dIocxURUo) + ((float) i3);
                                    break;
                                default:
                                    throw new IllegalStateException("unexpected verticalAlignment");
                            }
                            bzmjzshmu = new bzmJZsHMu(f2, f3, tGV7Q6urW, ((float) fv9dny8vc.J4Ux7ym32()) + f3);
                        }
                        arrayList.add(bzmjzshmu);
                    }
                    list = arrayList;
                }
                this.kCA6Zs9sL = list;
                this.iiGwOFFnr = anXlDk6fV.RG6kpfv3v(3, new nwvyEZJPU(this));
                return;
            }
            throw new IllegalArgumentException("width should not be negative".toString());
        }
        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
    }

    public float J4Ux7ym32(int i, boolean z) {
        if (z) {
            return this.dIocxURUo.J4Ux7ym32.getPrimaryHorizontal(i);
        }
        return this.dIocxURUo.J4Ux7ym32.getSecondaryHorizontal(i);
    }

    public float q3BipwRCk() {
        YK9K1XOO8 yk9k1xoo8 = this.dIocxURUo;
        return (float) (yk9k1xoo8.q3BipwRCk ? yk9k1xoo8.J4Ux7ym32.getLineBottom(yk9k1xoo8.tGV7Q6urW - 1) : yk9k1xoo8.J4Ux7ym32.getHeight());
    }
}
