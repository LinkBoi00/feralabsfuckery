package con;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.feravolt.preload.R;
import java.lang.reflect.Constructor;
/* loaded from: classes.dex */
public class kZAmYIEbq {
    public final Object[] q3BipwRCk = new Object[2];
    public static final Class[] J4Ux7ym32 = {Context.class, AttributeSet.class};
    public static final int[] tGV7Q6urW = {16843375};
    public static final String[] dIocxURUo = {"android.widget.", "android.view.", "android.webkit."};
    public static final ZmYjNS8wW kCA6Zs9sL = new ZmYjNS8wW();

    public final void GPLPRo6go(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    public LYtU53WQj J4Ux7ym32(Context context, AttributeSet attributeSet) {
        return new LYtU53WQj(context, attributeSet, R.attr.buttonStyle);
    }

    public AppCompatRadioButton dIocxURUo(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public final View iiGwOFFnr(Context context, String str, String str2) {
        String str3;
        ZmYjNS8wW zmYjNS8wW = kCA6Zs9sL;
        Constructor constructor = (Constructor) zmYjNS8wW.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(J4Ux7ym32);
            zmYjNS8wW.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.q3BipwRCk);
    }

    public qs7k2SwdW kCA6Zs9sL(Context context, AttributeSet attributeSet) {
        return new qs7k2SwdW(context, attributeSet, 16842884);
    }

    public yHOWpR3Sc q3BipwRCk(Context context, AttributeSet attributeSet) {
        return new yHOWpR3Sc(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public AppCompatCheckBox tGV7Q6urW(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }
}
