package con;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
/* loaded from: classes.dex */
public abstract class yYWQSxv2D {
    public static final qIxSZWcre CBQ5d1kRq = new qIxSZWcre(0);
    public static final Object kmSgne1rO = new Object();

    public static void yWvV4ePLl(yYWQSxv2D yywqsxv2d) {
        synchronized (kmSgne1rO) {
            Iterator it = CBQ5d1kRq.iterator();
            while (it.hasNext()) {
                yYWQSxv2D yywqsxv2d2 = (yYWQSxv2D) ((WeakReference) it.next()).get();
                if (yywqsxv2d2 == yywqsxv2d || yywqsxv2d2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void Bhmn1KIah(CharSequence charSequence);

    public abstract void CBQ5d1kRq(View view);

    public abstract void GPLPRo6go();

    public abstract void Puu3Rhg4F();

    public abstract void dIocxURUo();

    public abstract void iiGwOFFnr(Bundle bundle);

    public abstract void kCA6Zs9sL();

    public abstract void kmSgne1rO(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean oon79WMrY(int i);

    public abstract void tGV7Q6urW(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void vPSbyrYWX(int i);
}
