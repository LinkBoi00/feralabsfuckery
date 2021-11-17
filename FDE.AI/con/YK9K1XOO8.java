package con;

import android.text.Layout;
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
    public YK9K1XOO8(java.lang.CharSequence r19, float r20, android.text.TextPaint r21, int r22, android.text.TextUtils.TruncateAt r23, int r24, float r25, float r26, boolean r27, int r28, int r29, int r30, int r31, int[] r32, int[] r33, con.j6XJY7rz4 r34, int r35) {
        /*
        // Method dump skipped, instructions count: 563
        */
        throw new UnsupportedOperationException("Method not decompiled: con.YK9K1XOO8.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, int, int, int, int, int[], int[], con.j6XJY7rz4, int):void");
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
