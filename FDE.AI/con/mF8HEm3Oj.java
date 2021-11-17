package con;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import java.util.Objects;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public abstract class mF8HEm3Oj {
    public static final String[] q3BipwRCk = new String[0];

    public static void J4Ux7ym32(EditorInfo editorInfo, CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            editorInfo.setInitialSurroundingSubText(charSequence, 0);
            return;
        }
        Objects.requireNonNull(charSequence);
        if (i >= 30) {
            editorInfo.setInitialSurroundingSubText(charSequence, 0);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 + 0 : i2 + 0;
        int i5 = i2 > i3 ? i2 - 0 : i3 + 0;
        int length = charSequence.length();
        if (i4 >= 0 && i5 <= length) {
            int i6 = editorInfo.inputType & 4095;
            if (!(i6 == 129 || i6 == 225 || i6 == 18)) {
                if (length <= 2048) {
                    tGV7Q6urW(editorInfo, charSequence, i4, i5);
                    return;
                }
                int i7 = i5 - i4;
                int i8 = i7 > 1024 ? 0 : i7;
                int i9 = 2048 - i8;
                int min = Math.min(charSequence.length() - i5, i9 - Math.min(i4, (int) (((double) i9) * 0.8d)));
                int min2 = Math.min(i4, i9 - min);
                int i10 = i4 - min2;
                if (q3BipwRCk(charSequence, i10, 0)) {
                    i10++;
                    min2--;
                }
                if (q3BipwRCk(charSequence, (i5 + min) - 1, 1)) {
                    min--;
                }
                CharSequence concat = i8 != i7 ? TextUtils.concat(charSequence.subSequence(i10, i10 + min2), charSequence.subSequence(i5, min + i5)) : charSequence.subSequence(i10, min2 + i8 + min + i10);
                int i11 = min2 + 0;
                tGV7Q6urW(editorInfo, concat, i11, i8 + i11);
                return;
            }
        }
        tGV7Q6urW(editorInfo, null, 0, 0);
    }

    public static boolean q3BipwRCk(CharSequence charSequence, int i, int i2) {
        if (i2 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i));
        }
        if (i2 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i));
    }

    public static void tGV7Q6urW(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }
}
