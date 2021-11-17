package con;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;
@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public abstract class Y4wRqkFOh {
    public static Class dIocxURUo;
    public static final int[] q3BipwRCk = {16842912};
    public static final int[] J4Ux7ym32 = new int[0];
    public static final Rect tGV7Q6urW = new Rect();

    static {
        try {
            dIocxURUo = Class.forName("android.graphics.Insets");
        } catch (ClassNotFoundException unused) {
        }
    }

    public static Rect J4Ux7ym32(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 29) {
            Insets opticalInsets = drawable.getOpticalInsets();
            Rect rect = new Rect();
            rect.left = opticalInsets.left;
            rect.right = opticalInsets.right;
            rect.top = opticalInsets.top;
            rect.bottom = opticalInsets.bottom;
            return rect;
        }
        if (dIocxURUo != null) {
            try {
                Drawable q3BipwRCk2 = m84IdhKaW.q3BipwRCk(drawable);
                Object invoke = q3BipwRCk2.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(q3BipwRCk2, new Object[0]);
                if (invoke != null) {
                    Rect rect2 = new Rect();
                    Field[] fields = dIocxURUo.getFields();
                    for (Field field : fields) {
                        String name = field.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            rect2.left = field.getInt(invoke);
                        } else if (c == 1) {
                            rect2.top = field.getInt(invoke);
                        } else if (c == 2) {
                            rect2.right = field.getInt(invoke);
                        } else if (c == 3) {
                            rect2.bottom = field.getInt(invoke);
                        }
                    }
                    return rect2;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return tGV7Q6urW;
    }

    public static boolean q3BipwRCk(Drawable drawable) {
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable drawable2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!q3BipwRCk(drawable2)) {
                    return false;
                }
            }
            return true;
        } else if (drawable instanceof Y5t3ksRSA) {
            return q3BipwRCk(((K3o3RJQ0K) ((Y5t3ksRSA) drawable)).CBQ5d1kRq);
        } else {
            if (drawable instanceof ffsBxLfwm) {
                return q3BipwRCk(((ffsBxLfwm) drawable).CBQ5d1kRq);
            }
            if (drawable instanceof ScaleDrawable) {
                return q3BipwRCk(((ScaleDrawable) drawable).getDrawable());
            }
            return true;
        }
    }

    public static PorterDuff.Mode tGV7Q6urW(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
