package con;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class YK9K1XOO8 {
    public final Layout J4Ux7ym32;
    public final boolean q3BipwRCk;
    public final int tGV7Q6urW;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0152  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public YK9K1XOO8(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, float f2, float f3, boolean z, int i3, int i4, int i5, int i6, int[] iArr, int[] iArr2, j6XJY7rz4 j6xjy7rz4, int i7) {
        Layout.Alignment alignment;
        int i8;
        int i9;
        boolean z2;
        BoringLayout.Metrics metrics;
        BoringLayout boringLayout;
        YK9K1XOO8 yk9k1xoo8;
        StaticLayout staticLayout;
        int length;
        float f4 = (i7 & 2) != 0 ? 0.0f : f;
        int i10 = (i7 & 8) != 0 ? 0 : i;
        TextUtils.TruncateAt truncateAt2 = (i7 & 16) != 0 ? null : truncateAt;
        int i11 = (i7 & 32) != 0 ? 2 : i2;
        float f5 = (i7 & 64) != 0 ? 1.0f : f2;
        float f6 = (i7 & 128) != 0 ? 0.0f : f3;
        boolean z3 = (i7 & 256) != 0 ? true : z;
        int i12 = (i7 & 512) != 0 ? Integer.MAX_VALUE : i3;
        int i13 = (i7 & 1024) != 0 ? 0 : i4;
        int i14 = (i7 & 2048) != 0 ? 0 : i5;
        int i15 = (i7 & 4096) != 0 ? 0 : i6;
        j6XJY7rz4 j6xjy7rz42 = (i7 & 32768) != 0 ? new j6XJY7rz4(charSequence, textPaint, i11) : j6xjy7rz4;
        int length2 = charSequence.length();
        TextDirectionHeuristic Bhmn1KIah = D3DEikrvb.Bhmn1KIah(i11);
        c072zq04j c072zq04j = c072zq04j.q3BipwRCk;
        if (i10 != 0) {
            if (i10 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i10 == 2) {
                alignment = Layout.Alignment.ALIGN_CENTER;
            } else if (i10 == 3) {
                alignment = c072zq04j.J4Ux7ym32;
            } else if (i10 == 4) {
                alignment = c072zq04j.tGV7Q6urW;
            }
            if (!(charSequence instanceof Spanned)) {
                i9 = i15;
                i8 = i14;
                if (((Spanned) charSequence).nextSpanTransition(-1, length2, flYb1EqxA.class) < length2) {
                    z2 = true;
                    metrics = (BoringLayout.Metrics) ((llWJsfBCK) j6xjy7rz42.kmSgne1rO).getValue();
                    double d = (double) f4;
                    int ceil = (int) ((float) Math.ceil(d));
                    if (metrics != null || ((Number) ((llWJsfBCK) j6xjy7rz42.PSTqBLTET).getValue()).floatValue() > f4 || z2) {
                        length = charSequence.length();
                        int ceil2 = (int) ((float) Math.ceil(d));
                        if (length >= 0) {
                            if (length >= 0 && length <= charSequence.length()) {
                                if (i12 >= 0) {
                                    if (ceil >= 0) {
                                        if (ceil2 >= 0) {
                                            if (f5 >= 0.0f) {
                                                StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, length, textPaint, ceil);
                                                obtain.setTextDirection(Bhmn1KIah);
                                                obtain.setAlignment(alignment);
                                                obtain.setMaxLines(i12);
                                                obtain.setEllipsize(truncateAt2);
                                                obtain.setEllipsizedWidth(ceil2);
                                                obtain.setLineSpacing(f6, f5);
                                                obtain.setIncludePad(z3);
                                                obtain.setBreakStrategy(i13);
                                                obtain.setHyphenationFrequency(i8);
                                                obtain.setIndents(null, null);
                                                int i16 = Build.VERSION.SDK_INT;
                                                obtain.setJustificationMode(i9);
                                                if (i16 >= 28) {
                                                    obtain.setUseLineSpacingFromFallbacks(true);
                                                }
                                                StaticLayout build = obtain.build();
                                                yk9k1xoo8 = this;
                                                staticLayout = build;
                                                boringLayout = build;
                                            } else {
                                                throw new IllegalArgumentException("Failed requirement.".toString());
                                            }
                                        } else {
                                            throw new IllegalArgumentException("Failed requirement.".toString());
                                        }
                                    } else {
                                        throw new IllegalArgumentException("Failed requirement.".toString());
                                    }
                                } else {
                                    throw new IllegalArgumentException("Failed requirement.".toString());
                                }
                            } else {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                        } else {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                    } else {
                        if (ceil >= 0) {
                            if (ceil >= 0) {
                                BoringLayout boringLayout2 = truncateAt2 == null ? new BoringLayout(charSequence, textPaint, ceil, alignment, 1.0f, 0.0f, metrics, z3) : new BoringLayout(charSequence, textPaint, ceil, alignment, 1.0f, 0.0f, metrics, z3, truncateAt2, ceil);
                                staticLayout = null;
                                yk9k1xoo8 = this;
                                boringLayout = boringLayout2;
                            } else {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                        } else {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                    }
                    yk9k1xoo8.J4Ux7ym32 = boringLayout;
                    int min = Math.min(boringLayout.getLineCount(), i12);
                    yk9k1xoo8.tGV7Q6urW = min;
                    boolean z4 = staticLayout;
                    if (min >= i12) {
                        if (boringLayout.getEllipsisCount(min - 1) <= 0) {
                            z4 = staticLayout;
                            if (boringLayout.getLineEnd(min - 1) != charSequence.length()) {
                                z4 = 1;
                            }
                        } else {
                            z4 = 1;
                        }
                    }
                    yk9k1xoo8.q3BipwRCk = z4;
                    return;
                }
            } else {
                i8 = i14;
                i9 = i15;
            }
            z2 = false;
            metrics = (BoringLayout.Metrics) ((llWJsfBCK) j6xjy7rz42.kmSgne1rO).getValue();
            double d2 = (double) f4;
            int ceil3 = (int) ((float) Math.ceil(d2));
            if (metrics != null) {
            }
            length = charSequence.length();
            int ceil22 = (int) ((float) Math.ceil(d2));
            if (length >= 0) {
            }
        }
        alignment = Layout.Alignment.ALIGN_NORMAL;
        if (!(charSequence instanceof Spanned)) {
        }
        z2 = false;
        metrics = (BoringLayout.Metrics) ((llWJsfBCK) j6xjy7rz42.kmSgne1rO).getValue();
        double d22 = (double) f4;
        int ceil32 = (int) ((float) Math.ceil(d22));
        if (metrics != null) {
        }
        length = charSequence.length();
        int ceil222 = (int) ((float) Math.ceil(d22));
        if (length >= 0) {
        }
    }

    public final float J4Ux7ym32(int i) {
        return (float) this.J4Ux7ym32.getLineBottom(i);
    }

    public final int dIocxURUo(int i) {
        return this.J4Ux7ym32.getLineForOffset(i);
    }

    public final float iiGwOFFnr(int i) {
        return this.J4Ux7ym32.getPrimaryHorizontal(i);
    }

    public final float kCA6Zs9sL(int i) {
        return (float) this.J4Ux7ym32.getLineTop(i);
    }

    public final float q3BipwRCk(int i) {
        return (float) this.J4Ux7ym32.getLineBaseline(i);
    }

    public final int tGV7Q6urW(int i) {
        return this.J4Ux7ym32.getEllipsisStart(i) == 0 ? this.J4Ux7ym32.getLineEnd(i) : this.J4Ux7ym32.getText().length();
    }
}
