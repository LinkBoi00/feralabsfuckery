package con;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes.dex */
public class xpHkAvZqZ implements View.OnClickListener {
    public Method Bhmn1KIah;
    public final View CBQ5d1kRq;
    public Context PSTqBLTET;
    public final String kmSgne1rO;

    public xpHkAvZqZ(View view, String str) {
        this.CBQ5d1kRq = view;
        this.kmSgne1rO = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        Method method;
        if (this.Bhmn1KIah == null) {
            Context context = this.CBQ5d1kRq.getContext();
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.kmSgne1rO, View.class)) != null) {
                        this.Bhmn1KIah = method;
                        this.PSTqBLTET = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.CBQ5d1kRq.getId();
            if (id == -1) {
                str = "";
            } else {
                StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk(" with id '");
                q3BipwRCk.append(this.CBQ5d1kRq.getContext().getResources().getResourceEntryName(id));
                q3BipwRCk.append("'");
                str = q3BipwRCk.toString();
            }
            StringBuilder q3BipwRCk2 = abGBwSu8x.q3BipwRCk("Could not find method ");
            q3BipwRCk2.append(this.kmSgne1rO);
            q3BipwRCk2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            q3BipwRCk2.append(this.CBQ5d1kRq.getClass());
            q3BipwRCk2.append(str);
            throw new IllegalStateException(q3BipwRCk2.toString());
        }
        try {
            this.Bhmn1KIah.invoke(this.PSTqBLTET, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
