package con;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class Lfj62JTip implements MenuItem.OnMenuItemClickListener {
    public static final Class[] tGV7Q6urW = {MenuItem.class};
    public Method J4Ux7ym32;
    public Object q3BipwRCk;

    public Lfj62JTip(Object obj, String str) {
        this.q3BipwRCk = obj;
        Class<?> cls = obj.getClass();
        try {
            this.J4Ux7ym32 = cls.getMethod(str, tGV7Q6urW);
        } catch (Exception e) {
            StringBuilder q3BipwRCk = eEPBBadYl.q3BipwRCk("Couldn't resolve menu item onClick handler ", str, " in class ");
            q3BipwRCk.append(cls.getName());
            InflateException inflateException = new InflateException(q3BipwRCk.toString());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        try {
            if (this.J4Ux7ym32.getReturnType() == Boolean.TYPE) {
                return ((Boolean) this.J4Ux7ym32.invoke(this.q3BipwRCk, menuItem)).booleanValue();
            }
            this.J4Ux7ym32.invoke(this.q3BipwRCk, menuItem);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
