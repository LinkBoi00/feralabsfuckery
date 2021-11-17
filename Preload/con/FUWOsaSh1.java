package con;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
@SuppressLint({"SoonBlockedPrivateApi"})
/* loaded from: classes.dex */
public abstract class FUWOsaSh1 {
    public static Field J4Ux7ym32;
    public static boolean dIocxURUo;
    public static Field q3BipwRCk;
    public static Field tGV7Q6urW;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            q3BipwRCk = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            J4Ux7ym32 = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            tGV7Q6urW = declaredField3;
            declaredField3.setAccessible(true);
            dIocxURUo = true;
        } catch (ReflectiveOperationException e) {
            StringBuilder q3BipwRCk2 = abGBwSu8x.q3BipwRCk("Failed to get visible insets from AttachInfo ");
            q3BipwRCk2.append(e.getMessage());
            Log.w("WindowInsetsCompat", q3BipwRCk2.toString(), e);
        }
    }
}
