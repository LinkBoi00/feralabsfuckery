package con;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public abstract class xobLfQFEO {
    public static boolean Puu3Rhg4F(List list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    public static void dIocxURUo(List list, View view) {
        int size = list.size();
        if (!Puu3Rhg4F(list, view, size)) {
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            if (mJLaJepZo.vPSbyrYWX(view) != null) {
                list.add(view);
            }
            for (int i = size; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!Puu3Rhg4F(list, childAt, size) && mJLaJepZo.vPSbyrYWX(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static boolean vPSbyrYWX(List list) {
        return list == null || list.isEmpty();
    }

    public ArrayList Bhmn1KIah(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            arrayList2.add(mJLaJepZo.vPSbyrYWX(view));
            mJLaJepZo.ixWaw2akD(view, null);
        }
        return arrayList2;
    }

    public abstract Object CBQ5d1kRq(Object obj, Object obj2, Object obj3);

    public abstract void Eeka1udhb(Object obj, Rect rect);

    public abstract Object GPLPRo6go(Object obj);

    public abstract void J4Ux7ym32(Object obj, ArrayList arrayList);

    public abstract void MzoOEjc4X(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract void PSTqBLTET(Object obj, View view);

    public void RG6kpfv3v(UxHHqhbTP uxHHqhbTP, Object obj, ce8tBZHr1 ce8tbzhr1, Runnable runnable) {
        runnable.run();
    }

    public abstract void WaUP0CF08(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract void dXrmkklc8(Object obj, View view);

    public abstract Object i8XZMQc6Z(Object obj);

    public void iiGwOFFnr(ArrayList arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z = view instanceof ViewGroup;
            ViewGroup viewGroup = view;
            if (z) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                boolean isTransitionGroup = viewGroup2.isTransitionGroup();
                viewGroup = viewGroup2;
                if (!isTransitionGroup) {
                    int childCount = viewGroup2.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        iiGwOFFnr(arrayList, viewGroup2.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(viewGroup == 1 ? 1 : 0);
        }
    }

    public abstract void ilHKhw3Yw(Object obj, View view, ArrayList arrayList);

    public void ixWaw2akD(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            String vPSbyrYWX = mJLaJepZo.vPSbyrYWX(view2);
            arrayList4.add(vPSbyrYWX);
            if (vPSbyrYWX != null) {
                mJLaJepZo.ixWaw2akD(view2, null);
                String str = (String) ((ZmYjNS8wW) map).getOrDefault(vPSbyrYWX, null);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        mJLaJepZo.ixWaw2akD((View) arrayList2.get(i2), vPSbyrYWX);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        zgCCamJKk.q3BipwRCk(view, new xkQf4jTWZ(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract boolean kCA6Zs9sL(Object obj);

    public abstract Object kmSgne1rO(Object obj, Object obj2, Object obj3);

    public void oon79WMrY(View view, Rect rect) {
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        if (mN6fklC4R.J4Ux7ym32(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract void q3BipwRCk(Object obj, View view);

    public abstract void qVUwofr5s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void sk5s77z6Q(Object obj, View view, ArrayList arrayList);

    public abstract void tGV7Q6urW(ViewGroup viewGroup, Object obj);

    public void yWvV4ePLl(Map map, View view) {
        if (view.getVisibility() == 0) {
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            String vPSbyrYWX = mJLaJepZo.vPSbyrYWX(view);
            if (vPSbyrYWX != null) {
                map.put(vPSbyrYWX, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    yWvV4ePLl(map, viewGroup.getChildAt(i));
                }
            }
        }
    }
}
