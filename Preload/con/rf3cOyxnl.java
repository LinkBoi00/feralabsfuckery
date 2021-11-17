package con;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.feravolt.preload.R;
import com.google.android.material.textfield.TextInputLayout;
import con.xT3tobMV0;
import java.util.Objects;
/* loaded from: classes.dex */
public class rf3cOyxnl extends CZ8R7FG4y {
    public dOSsQaJVg Bhmn1KIah;
    public ValueAnimator MzoOEjc4X;
    public AccessibilityManager PSTqBLTET;
    public ValueAnimator ilHKhw3Yw;
    public StateListDrawable kmSgne1rO;
    public final TextWatcher kCA6Zs9sL = new MhqibLiIM(this);
    public final View.OnFocusChangeListener iiGwOFFnr = new M7tdG3F08(this);
    public final TextInputLayout.s7MlVynBG GPLPRo6go = new c3lse5q9N(this, this.q3BipwRCk);
    public final TextInputLayout.dNif5KqqH Puu3Rhg4F = new y5oh9NJPA(this);
    @SuppressLint({"ClickableViewAccessibility"})
    public final TextInputLayout.WfopS3efW yWvV4ePLl = new MNvNWu3oH(this);
    public boolean oon79WMrY = false;
    public boolean vPSbyrYWX = false;
    public long CBQ5d1kRq = Long.MAX_VALUE;

    public rf3cOyxnl(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
    }

    public static void GPLPRo6go(rf3cOyxnl rf3coyxnl, AutoCompleteTextView autoCompleteTextView) {
        Objects.requireNonNull(rf3coyxnl);
        if (autoCompleteTextView != null) {
            if (rf3coyxnl.yWvV4ePLl()) {
                rf3coyxnl.oon79WMrY = false;
            }
            if (!rf3coyxnl.oon79WMrY) {
                boolean z = rf3coyxnl.vPSbyrYWX;
                boolean z2 = !z;
                if (z != z2) {
                    rf3coyxnl.vPSbyrYWX = z2;
                    rf3coyxnl.ilHKhw3Yw.cancel();
                    rf3coyxnl.MzoOEjc4X.start();
                }
                if (rf3coyxnl.vPSbyrYWX) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            rf3coyxnl.oon79WMrY = false;
        }
    }

    public static AutoCompleteTextView dIocxURUo(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public static void iiGwOFFnr(rf3cOyxnl rf3coyxnl, boolean z) {
        if (rf3coyxnl.vPSbyrYWX != z) {
            rf3coyxnl.vPSbyrYWX = z;
            rf3coyxnl.ilHKhw3Yw.cancel();
            rf3coyxnl.MzoOEjc4X.start();
        }
    }

    public static boolean kCA6Zs9sL(EditText editText) {
        return editText.getKeyListener() != null;
    }

    @Override // con.CZ8R7FG4y
    public boolean J4Ux7ym32(int i) {
        return i != 0;
    }

    public final dOSsQaJVg Puu3Rhg4F(float f, float f2, float f3, int i) {
        xT3tobMV0.RG2GI7LDp rG2GI7LDp = new xT3tobMV0.RG2GI7LDp();
        rG2GI7LDp.kCA6Zs9sL = new dNif5KqqH(f);
        rG2GI7LDp.iiGwOFFnr = new dNif5KqqH(f);
        rG2GI7LDp.Puu3Rhg4F = new dNif5KqqH(f2);
        rG2GI7LDp.GPLPRo6go = new dNif5KqqH(f2);
        xT3tobMV0 q3BipwRCk = rG2GI7LDp.q3BipwRCk();
        Context context = this.J4Ux7ym32;
        String str = dOSsQaJVg.mUqPm6GBh;
        int kCA6Zs9sL = KYuHUB7GA.kCA6Zs9sL(context, R.attr.colorSurface, dOSsQaJVg.class.getSimpleName());
        dOSsQaJVg dossqajvg = new dOSsQaJVg();
        dossqajvg.CBQ5d1kRq.J4Ux7ym32 = new Zgs44gQcc(context);
        dossqajvg.sk5s77z6Q();
        dossqajvg.MzoOEjc4X(ColorStateList.valueOf(kCA6Zs9sL));
        rbhQaQiIi rbhqaqiii = dossqajvg.CBQ5d1kRq;
        if (rbhqaqiii.PSTqBLTET != f3) {
            rbhqaqiii.PSTqBLTET = f3;
            dossqajvg.sk5s77z6Q();
        }
        dossqajvg.CBQ5d1kRq.q3BipwRCk = q3BipwRCk;
        dossqajvg.invalidateSelf();
        rbhQaQiIi rbhqaqiii2 = dossqajvg.CBQ5d1kRq;
        if (rbhqaqiii2.yWvV4ePLl == null) {
            rbhqaqiii2.yWvV4ePLl = new Rect();
        }
        dossqajvg.CBQ5d1kRq.yWvV4ePLl.set(0, i, 0, i);
        dossqajvg.invalidateSelf();
        return dossqajvg;
    }

    @Override // con.CZ8R7FG4y
    public void q3BipwRCk() {
        float dimensionPixelOffset = (float) this.J4Ux7ym32.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.J4Ux7ym32.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.J4Ux7ym32.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        dOSsQaJVg Puu3Rhg4F = Puu3Rhg4F(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        dOSsQaJVg Puu3Rhg4F2 = Puu3Rhg4F(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.Bhmn1KIah = Puu3Rhg4F;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.kmSgne1rO = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, Puu3Rhg4F);
        this.kmSgne1rO.addState(new int[0], Puu3Rhg4F2);
        int i = this.dIocxURUo;
        if (i == 0) {
            i = R.drawable.mtrl_dropdown_arrow;
        }
        this.q3BipwRCk.setEndIconDrawable(i);
        TextInputLayout textInputLayout = this.q3BipwRCk;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.q3BipwRCk.setEndIconOnClickListener(new Q3GvMwgzv(this));
        this.q3BipwRCk.q3BipwRCk(this.Puu3Rhg4F);
        this.q3BipwRCk.YmNRDyka4.add(this.yWvV4ePLl);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = vZAFqpduB.q3BipwRCk;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration((long) 67);
        ofFloat.addUpdateListener(new HOe5eFlJ6(this));
        this.ilHKhw3Yw = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration((long) 50);
        ofFloat2.addUpdateListener(new HOe5eFlJ6(this));
        this.MzoOEjc4X = ofFloat2;
        ofFloat2.addListener(new nHGvav8Uq(this));
        this.PSTqBLTET = (AccessibilityManager) this.J4Ux7ym32.getSystemService("accessibility");
    }

    public final boolean yWvV4ePLl() {
        long currentTimeMillis = System.currentTimeMillis() - this.CBQ5d1kRq;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }
}
