package con;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.feravolt.preload.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class rlVtIza8D {
    public static final ArrayList dIocxURUo = new ArrayList();
    public WeakHashMap q3BipwRCk = null;
    public SparseArray J4Ux7ym32 = null;
    public WeakReference tGV7Q6urW = null;

    public final boolean J4Ux7ym32(View view, KeyEvent keyEvent) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((GjXT9DEd0) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public final View q3BipwRCk(View view, KeyEvent keyEvent) {
        WeakHashMap weakHashMap = this.q3BipwRCk;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View q3BipwRCk = q3BipwRCk(viewGroup.getChildAt(childCount), keyEvent);
                    if (q3BipwRCk != null) {
                        return q3BipwRCk;
                    }
                }
            }
            if (J4Ux7ym32(view, keyEvent)) {
                return view;
            }
        }
        return null;
    }
}
