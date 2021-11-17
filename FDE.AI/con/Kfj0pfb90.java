package con;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public final class Kfj0pfb90 {
    public Kfj0pfb90(int i) {
    }

    @SuppressLint({"BanUncheckedReflection"})
    public void q3BipwRCk(View view) {
        Field field;
        try {
            if (!iUgWrj1f5.cAwN510t2) {
                iUgWrj1f5.cAwN510t2 = true;
                if (Build.VERSION.SDK_INT < 28) {
                    iUgWrj1f5.dfpT1j18n = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                    field = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    iUgWrj1f5.dfpT1j18n = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                iUgWrj1f5.iMyQMM6Qj = field;
                Method method = iUgWrj1f5.dfpT1j18n;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field2 = iUgWrj1f5.iMyQMM6Qj;
                if (field2 != null) {
                    field2.setAccessible(true);
                }
            }
            Field field3 = iUgWrj1f5.iMyQMM6Qj;
            if (field3 != null) {
                field3.setBoolean(view, true);
            }
            Method method2 = iUgWrj1f5.dfpT1j18n;
            if (method2 != null) {
                method2.invoke(view, new Object[0]);
            }
        } catch (Throwable unused) {
            iUgWrj1f5.IytU16YUK = true;
        }
    }
}
