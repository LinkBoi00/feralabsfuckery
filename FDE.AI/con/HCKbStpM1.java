package con;

import android.view.View;
import java.util.Collection;
/* loaded from: classes.dex */
public abstract class HCKbStpM1 {
    public static void Bhmn1KIah(View view, int i) {
        view.setNextClusterForwardId(i);
    }

    public static void CBQ5d1kRq(View view, int i) {
        view.setImportantForAutofill(i);
    }

    public static boolean GPLPRo6go(View view) {
        return view.isKeyboardNavigationCluster();
    }

    public static int J4Ux7ym32(View view) {
        return view.getImportantForAutofill();
    }

    public static void PSTqBLTET(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }

    public static View Puu3Rhg4F(View view, View view2, int i) {
        return view.keyboardNavigationClusterSearch(view2, i);
    }

    public static boolean dIocxURUo(View view) {
        return view.hasExplicitFocusable();
    }

    public static boolean iiGwOFFnr(View view) {
        return view.isImportantForAutofill();
    }

    public static boolean kCA6Zs9sL(View view) {
        return view.isFocusedByDefault();
    }

    public static void kmSgne1rO(View view, boolean z) {
        view.setKeyboardNavigationCluster(z);
    }

    public static void oon79WMrY(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    public static void q3BipwRCk(View view, Collection<View> collection, int i) {
        view.addKeyboardNavigationClusters(collection, i);
    }

    public static int tGV7Q6urW(View view) {
        return view.getNextClusterForwardId();
    }

    public static void vPSbyrYWX(View view, boolean z) {
        view.setFocusedByDefault(z);
    }

    public static boolean yWvV4ePLl(View view) {
        return view.restoreDefaultFocus();
    }
}
