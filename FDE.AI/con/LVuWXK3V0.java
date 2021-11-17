package con;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class LVuWXK3V0 extends dV9j1WF3U {
    @Override // con.dV9j1WF3U
    public Method PSTqBLTET(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // con.dV9j1WF3U
    public Typeface yWvV4ePLl(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.GPLPRo6go, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.kmSgne1rO.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
