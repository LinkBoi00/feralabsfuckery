package con;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.feravolt.preload.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;
/* loaded from: classes.dex */
public class VnuSHN10J extends yHOWpR3Sc {
    public final AccessibilityManager MzoOEjc4X;
    public final uBkGbmfhd PSTqBLTET;
    public final Rect ilHKhw3Yw = new Rect();

    public VnuSHN10J(Context context, AttributeSet attributeSet) {
        super(ba8VhBGaI.q3BipwRCk(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        Context context2 = getContext();
        TypedArray dIocxURUo = hF1hMObUZ.dIocxURUo(context2, attributeSet, RisoK3egD.vPSbyrYWX, R.attr.autoCompleteTextViewStyle, 2131821286, new int[0]);
        if (dIocxURUo.hasValue(0) && dIocxURUo.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.MzoOEjc4X = (AccessibilityManager) context2.getSystemService("accessibility");
        uBkGbmfhd ubkgbmfhd = new uBkGbmfhd(context2, null, R.attr.listPopupWindowStyle, 0);
        this.PSTqBLTET = ubkgbmfhd;
        ubkgbmfhd.Eeka1udhb(true);
        ubkgbmfhd.dfpT1j18n = this;
        ubkgbmfhd.vNtjxmzUM.setInputMethodMode(2);
        ubkgbmfhd.MzoOEjc4X(getAdapter());
        ubkgbmfhd.iMyQMM6Qj = new SlAofNF57(this);
        dIocxURUo.recycle();
    }

    public static void q3BipwRCk(VnuSHN10J vnuSHN10J, Object obj) {
        vnuSHN10J.setText(vnuSHN10J.convertSelectionToString(obj), false);
    }

    public final TextInputLayout J4Ux7ym32() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout J4Ux7ym32 = J4Ux7ym32();
        return (J4Ux7ym32 == null || !J4Ux7ym32.EBQXiIPmm) ? super.getHint() : J4Ux7ym32.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout J4Ux7ym32 = J4Ux7ym32();
        if (J4Ux7ym32 != null && J4Ux7ym32.EBQXiIPmm && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout J4Ux7ym32 = J4Ux7ym32();
            int i3 = 0;
            if (!(adapter == null || J4Ux7ym32 == null)) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                uBkGbmfhd ubkgbmfhd = this.PSTqBLTET;
                int min = Math.min(adapter.getCount(), Math.max(0, !ubkgbmfhd.J4Ux7ym32() ? -1 : ubkgbmfhd.Bhmn1KIah.getSelectedItemPosition()) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, J4Ux7ym32);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable oon79WMrY = this.PSTqBLTET.oon79WMrY();
                if (oon79WMrY != null) {
                    oon79WMrY.getPadding(this.ilHKhw3Yw);
                    Rect rect = this.ilHKhw3Yw;
                    i4 += rect.left + rect.right;
                }
                i3 = J4Ux7ym32.getEndIconView().getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.PSTqBLTET.MzoOEjc4X(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.MzoOEjc4X;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.PSTqBLTET.GPLPRo6go();
        }
    }
}
