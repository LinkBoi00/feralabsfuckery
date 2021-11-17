package con;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.util.Objects;
/* loaded from: classes.dex */
public final class OHS7Jvxri implements xKJuigiBl {
    public final AccessibilityManager q3BipwRCk;

    public OHS7Jvxri(Context context) {
        Object systemService = context.getSystemService("accessibility");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.q3BipwRCk = (AccessibilityManager) systemService;
    }
}
