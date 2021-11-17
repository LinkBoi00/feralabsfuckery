package con;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.RG2GI7LDp;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class joJz6MnqC extends uBkGbmfhd implements MNbAFuzGl {
    public static Method QNqj6nIzv;
    public MNbAFuzGl V9LQMKGJe;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                QNqj6nIzv = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public joJz6MnqC(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // con.MNbAFuzGl
    public void iiGwOFFnr(RG2GI7LDp rG2GI7LDp, MenuItem menuItem) {
        MNbAFuzGl mNbAFuzGl = this.V9LQMKGJe;
        if (mNbAFuzGl != null) {
            mNbAFuzGl.iiGwOFFnr(rG2GI7LDp, menuItem);
        }
    }

    @Override // con.uBkGbmfhd
    public wRt60CcGM q3BipwRCk(Context context, boolean z) {
        z9GudWZlF z9gudwzlf = new z9GudWZlF(context, z);
        z9gudwzlf.setHoverListener(this);
        return z9gudwzlf;
    }

    @Override // con.MNbAFuzGl
    public void yWvV4ePLl(RG2GI7LDp rG2GI7LDp, MenuItem menuItem) {
        MNbAFuzGl mNbAFuzGl = this.V9LQMKGJe;
        if (mNbAFuzGl != null) {
            mNbAFuzGl.yWvV4ePLl(rG2GI7LDp, menuItem);
        }
    }
}
