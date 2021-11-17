package con;

import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
/* loaded from: classes.dex */
public final class bKLvaluG6 {
    public static final bKLvaluG6 q3BipwRCk = new bKLvaluG6();

    public final void q3BipwRCk(AndroidComposeView androidComposeView) {
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
