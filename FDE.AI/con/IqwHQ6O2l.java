package con;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class IqwHQ6O2l {
    public final AccessibilityNodeInfo q3BipwRCk;
    public int J4Ux7ym32 = -1;
    public int tGV7Q6urW = -1;

    /* loaded from: classes.dex */
    public static class RG2GI7LDp {
        public final int J4Ux7ym32;
        public final Sq43ZrsXU dIocxURUo;
        public final Object q3BipwRCk;
        public final Class tGV7Q6urW;
        public static final RG2GI7LDp kCA6Zs9sL = new RG2GI7LDp(16, null);
        public static final RG2GI7LDp iiGwOFFnr = new RG2GI7LDp(64, null);
        public static final RG2GI7LDp GPLPRo6go = new RG2GI7LDp(128, null);
        public static final RG2GI7LDp Puu3Rhg4F = new RG2GI7LDp(4096, null);
        public static final RG2GI7LDp yWvV4ePLl = new RG2GI7LDp(8192, null);
        public static final RG2GI7LDp oon79WMrY = new RG2GI7LDp(262144, null);
        public static final RG2GI7LDp vPSbyrYWX = new RG2GI7LDp(524288, null);
        public static final RG2GI7LDp CBQ5d1kRq = new RG2GI7LDp(1048576, null);
        public static final RG2GI7LDp kmSgne1rO = new RG2GI7LDp(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null, null, null);
        public static final RG2GI7LDp Bhmn1KIah = new RG2GI7LDp(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null, null, null);
        public static final RG2GI7LDp PSTqBLTET = new RG2GI7LDp(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null, null, null);
        public static final RG2GI7LDp MzoOEjc4X = new RG2GI7LDp(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null, null, null);

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new RG2GI7LDp(1, null);
            new RG2GI7LDp(2, null);
            new RG2GI7LDp(4, null);
            new RG2GI7LDp(8, null);
            new RG2GI7LDp(32, null);
            new RG2GI7LDp(256, null, iKdQJERG6.class);
            new RG2GI7LDp(512, null, iKdQJERG6.class);
            new RG2GI7LDp(1024, null, JsfPlJZ8P.class);
            new RG2GI7LDp(2048, null, JsfPlJZ8P.class);
            new RG2GI7LDp(16384, null);
            new RG2GI7LDp(32768, null);
            new RG2GI7LDp(65536, null);
            new RG2GI7LDp(131072, null, TmYg8gxBQ.class);
            new RG2GI7LDp(2097152, null, Fmg10ypBA.class);
            int i = Build.VERSION.SDK_INT;
            new RG2GI7LDp(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null, null, null);
            new RG2GI7LDp(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, null, null, hhYUB2bDY.class);
            new RG2GI7LDp(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            new RG2GI7LDp(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            new RG2GI7LDp(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            new RG2GI7LDp(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            new RG2GI7LDp(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null, null, null);
            new RG2GI7LDp(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, null, null, FEZNVGeDq.class);
            new RG2GI7LDp(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, 16908354, null, null, QMJmgeHX8.class);
            new RG2GI7LDp(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            new RG2GI7LDp(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
            new RG2GI7LDp(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
            if (i >= 30) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            }
            new RG2GI7LDp(accessibilityAction, 16908372, null, null, null);
        }

        public RG2GI7LDp(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        public RG2GI7LDp(int i, CharSequence charSequence, Class cls) {
            this(null, i, null, null, cls);
        }

        public RG2GI7LDp(Object obj, int i, CharSequence charSequence, Sq43ZrsXU sq43ZrsXU, Class cls) {
            this.J4Ux7ym32 = i;
            this.dIocxURUo = sq43ZrsXU;
            this.q3BipwRCk = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i, charSequence) : obj;
            this.tGV7Q6urW = cls;
        }

        public CharSequence J4Ux7ym32() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.q3BipwRCk).getLabel();
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof RG2GI7LDp)) {
                return false;
            }
            Object obj2 = this.q3BipwRCk;
            Object obj3 = ((RG2GI7LDp) obj).q3BipwRCk;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.q3BipwRCk;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public int q3BipwRCk() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.q3BipwRCk).getId();
        }
    }

    /* loaded from: classes.dex */
    public static class aXI58Y1kr {
        public final Object q3BipwRCk;

        public aXI58Y1kr(Object obj) {
            this.q3BipwRCk = obj;
        }

        public static aXI58Y1kr q3BipwRCk(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new aXI58Y1kr(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    /* loaded from: classes.dex */
    public static class mhl5lIdbQ {
        public final Object q3BipwRCk;

        public mhl5lIdbQ(Object obj) {
            this.q3BipwRCk = obj;
        }

        public static mhl5lIdbQ q3BipwRCk(int i, int i2, boolean z, int i3) {
            return new mhl5lIdbQ(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    public IqwHQ6O2l(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.q3BipwRCk = accessibilityNodeInfo;
    }

    public static IqwHQ6O2l CBQ5d1kRq() {
        return new IqwHQ6O2l(AccessibilityNodeInfo.obtain());
    }

    public static ClickableSpan[] dIocxURUo(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public static String tGV7Q6urW(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908372:
                return "ACTION_IME_ENTER";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    public void Bhmn1KIah(Object obj) {
        this.q3BipwRCk.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((mhl5lIdbQ) obj).q3BipwRCk);
    }

    public int GPLPRo6go() {
        return this.q3BipwRCk.getMovementGranularities();
    }

    public final List J4Ux7ym32(String str) {
        ArrayList<Integer> integerArrayList = this.q3BipwRCk.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.q3BipwRCk.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public void MzoOEjc4X(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.q3BipwRCk.setPaneTitle(charSequence);
        } else {
            this.q3BipwRCk.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void PSTqBLTET(Object obj) {
        this.q3BipwRCk.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((aXI58Y1kr) obj).q3BipwRCk);
    }

    public CharSequence Puu3Rhg4F() {
        return Build.VERSION.SDK_INT >= 30 ? this.q3BipwRCk.getStateDescription() : this.q3BipwRCk.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IqwHQ6O2l)) {
            return false;
        }
        IqwHQ6O2l iqwHQ6O2l = (IqwHQ6O2l) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.q3BipwRCk;
        if (accessibilityNodeInfo == null) {
            if (iqwHQ6O2l.q3BipwRCk != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(iqwHQ6O2l.q3BipwRCk)) {
            return false;
        }
        return this.tGV7Q6urW == iqwHQ6O2l.tGV7Q6urW && this.J4Ux7ym32 == iqwHQ6O2l.J4Ux7ym32;
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.q3BipwRCk;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public Bundle iiGwOFFnr() {
        return this.q3BipwRCk.getExtras();
    }

    public void ilHKhw3Yw(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.q3BipwRCk.setStateDescription(charSequence);
        } else {
            this.q3BipwRCk.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public CharSequence kCA6Zs9sL() {
        return this.q3BipwRCk.getContentDescription();
    }

    public final void kmSgne1rO(int i, boolean z) {
        Bundle iiGwOFFnr = iiGwOFFnr();
        if (iiGwOFFnr != null) {
            int i2 = iiGwOFFnr.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            iiGwOFFnr.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public boolean oon79WMrY() {
        return this.q3BipwRCk.isFocusable();
    }

    public void q3BipwRCk(RG2GI7LDp rG2GI7LDp) {
        this.q3BipwRCk.addAction((AccessibilityNodeInfo.AccessibilityAction) rG2GI7LDp.q3BipwRCk);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 402
        */
        throw new UnsupportedOperationException("Method not decompiled: con.IqwHQ6O2l.toString():java.lang.String");
    }

    public boolean vPSbyrYWX() {
        return this.q3BipwRCk.isFocused();
    }

    public CharSequence yWvV4ePLl() {
        if (!(!J4Ux7ym32("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.q3BipwRCk.getText();
        }
        List J4Ux7ym32 = J4Ux7ym32("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List J4Ux7ym322 = J4Ux7ym32("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List J4Ux7ym323 = J4Ux7ym32("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List J4Ux7ym324 = J4Ux7ym32("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.q3BipwRCk.getText(), 0, this.q3BipwRCk.getText().length()));
        for (int i = 0; i < J4Ux7ym32.size(); i++) {
            spannableString.setSpan(new O9jX4AoxS(((Integer) J4Ux7ym324.get(i)).intValue(), this, iiGwOFFnr().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) J4Ux7ym32.get(i)).intValue(), ((Integer) J4Ux7ym322.get(i)).intValue(), ((Integer) J4Ux7ym323.get(i)).intValue());
        }
        return spannableString;
    }
}
