package con;

import android.app.Activity;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class D856HTNqd {
    public static final Object q3BipwRCk = new Object();

    public static void J4Ux7ym32(Activity activity, String[] strArr, int i) {
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException(my9FFKbZi.q3BipwRCk(abGBwSu8x.q3BipwRCk("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
        }
        if (activity instanceof DMhvxwkkS) {
            Objects.requireNonNull((DMhvxwkkS) activity);
        }
        activity.requestPermissions(strArr, i);
    }

    public static int q3BipwRCk(Context context, String str) {
        Objects.requireNonNull(str, "permission must be non-null");
        return context.checkPermission(str, Process.myPid(), Process.myUid());
    }
}
