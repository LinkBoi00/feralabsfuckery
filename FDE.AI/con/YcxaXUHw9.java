package con;

import android.view.KeyEvent;
import android.view.View;
import com.feravolt.preload.R;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class YcxaXUHw9 {
    public static void GPLPRo6go(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static CharSequence J4Ux7ym32(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static void Puu3Rhg4F(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static boolean dIocxURUo(View view) {
        return view.isScreenReaderFocusable();
    }

    public static <T> T iiGwOFFnr(View view, int i) {
        return (T) view.requireViewById(i);
    }

    public static void kCA6Zs9sL(View view, GjXT9DEd0 gjXT9DEd0) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        ZmYjNS8wW zmYjNS8wW = (ZmYjNS8wW) view.getTag(R.id.tag_unhandled_key_listeners);
        if (zmYjNS8wW != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) zmYjNS8wW.getOrDefault(gjXT9DEd0, null)) != null) {
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }
    }

    public static void q3BipwRCk(View view, GjXT9DEd0 gjXT9DEd0) {
        ZmYjNS8wW zmYjNS8wW = (ZmYjNS8wW) view.getTag(R.id.tag_unhandled_key_listeners);
        if (zmYjNS8wW == null) {
            zmYjNS8wW = new ZmYjNS8wW();
            view.setTag(R.id.tag_unhandled_key_listeners, zmYjNS8wW);
        }
        Objects.requireNonNull(gjXT9DEd0);
        View.OnUnhandledKeyEventListener ty74ltud4 = new View.OnUnhandledKeyEventListener() { // from class: con.tY74lTud4
            @Override // android.view.View.OnUnhandledKeyEventListener
            public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                return GjXT9DEd0.this.onUnhandledKeyEvent(view2, keyEvent);
            }
        };
        zmYjNS8wW.put(gjXT9DEd0, ty74ltud4);
        view.addOnUnhandledKeyEventListener(ty74ltud4);
    }

    public static boolean tGV7Q6urW(View view) {
        return view.isAccessibilityHeading();
    }

    public static void yWvV4ePLl(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
