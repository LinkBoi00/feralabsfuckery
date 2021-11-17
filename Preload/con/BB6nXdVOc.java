package con;

import android.graphics.Rect;
/* loaded from: classes.dex */
public abstract class BB6nXdVOc {
    public static boolean J4Ux7ym32(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static int dIocxURUo(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i3 = rect.left;
            i2 = rect2.right;
        } else if (i == 33) {
            i3 = rect.top;
            i2 = rect2.bottom;
        } else if (i == 66) {
            i3 = rect2.left;
            i2 = rect.right;
        } else if (i == 130) {
            i3 = rect2.top;
            i2 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i3 - i2);
    }

    public static int kCA6Zs9sL(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        int i4;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            i3 = (rect.width() / 2) + rect.left;
            i4 = rect2.left;
            i2 = rect2.width();
            return Math.abs(i3 - ((i2 / 2) + i4));
        }
        i3 = (rect.height() / 2) + rect.top;
        i4 = rect2.top;
        i2 = rect2.height();
        return Math.abs(i3 - ((i2 / 2) + i4));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L_0x0043;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r10.right <= r12.left) goto L_0x0043;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L_0x0043;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r10.left >= r12.right) goto L_0x0043;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:
        r7 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static boolean q3BipwRCk(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean z;
        int i2;
        int i3;
        boolean J4Ux7ym32 = J4Ux7ym32(i, rect, rect2);
        if (J4Ux7ym32(i, rect, rect3) || !J4Ux7ym32) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
        }
        if (!z || i == 17 || i == 66) {
            return true;
        }
        int dIocxURUo = dIocxURUo(i, rect, rect2);
        if (i == 17) {
            i3 = rect.left;
            i2 = rect3.left;
        } else if (i == 33) {
            i3 = rect.top;
            i2 = rect3.top;
        } else if (i == 66) {
            i3 = rect3.right;
            i2 = rect.right;
        } else if (i == 130) {
            i3 = rect3.bottom;
            i2 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return dIocxURUo < Math.max(1, i3 - i2);
    }

    public static boolean tGV7Q6urW(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }
}
