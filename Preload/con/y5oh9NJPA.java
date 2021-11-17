package con;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.feravolt.preload.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class y5oh9NJPA implements TextInputLayout.dNif5KqqH {
    public final /* synthetic */ Object J4Ux7ym32;
    public final /* synthetic */ int q3BipwRCk = 2;

    public y5oh9NJPA(vC6Qh7mvD vc6qh7mvd) {
        this.J4Ux7ym32 = vc6qh7mvd;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void q3BipwRCk(TextInputLayout textInputLayout) {
        Drawable drawable;
        boolean z = false;
        switch (this.q3BipwRCk) {
            case 0:
                EditText editText = textInputLayout.getEditText();
                textInputLayout.setEndIconVisible(vC6Qh7mvD.dIocxURUo((vC6Qh7mvD) this.J4Ux7ym32));
                textInputLayout.setEndIconCheckable(false);
                editText.setOnFocusChangeListener(((vC6Qh7mvD) this.J4Ux7ym32).iiGwOFFnr);
                vC6Qh7mvD vc6qh7mvd = (vC6Qh7mvD) this.J4Ux7ym32;
                vc6qh7mvd.tGV7Q6urW.setOnFocusChangeListener(vc6qh7mvd.iiGwOFFnr);
                editText.removeTextChangedListener(((vC6Qh7mvD) this.J4Ux7ym32).kCA6Zs9sL);
                editText.addTextChangedListener(((vC6Qh7mvD) this.J4Ux7ym32).kCA6Zs9sL);
                return;
            case 1:
                AutoCompleteTextView dIocxURUo = rf3cOyxnl.dIocxURUo(textInputLayout.getEditText());
                rf3cOyxnl rf3coyxnl = (rf3cOyxnl) this.J4Ux7ym32;
                int boxBackgroundMode = rf3coyxnl.q3BipwRCk.getBoxBackgroundMode();
                if (boxBackgroundMode == 2) {
                    drawable = rf3coyxnl.Bhmn1KIah;
                } else {
                    if (boxBackgroundMode == 1) {
                        drawable = rf3coyxnl.kmSgne1rO;
                    }
                    rf3cOyxnl rf3coyxnl2 = (rf3cOyxnl) this.J4Ux7ym32;
                    Objects.requireNonNull(rf3coyxnl2);
                    if (!(dIocxURUo.getKeyListener() == null)) {
                        int boxBackgroundMode2 = rf3coyxnl2.q3BipwRCk.getBoxBackgroundMode();
                        dOSsQaJVg boxBackground = rf3coyxnl2.q3BipwRCk.getBoxBackground();
                        int CBQ5d1kRq = D3DEikrvb.CBQ5d1kRq(dIocxURUo, R.attr.colorControlHighlight);
                        int[][] iArr = {new int[]{16842919}, new int[0]};
                        if (boxBackgroundMode2 == 2) {
                            int CBQ5d1kRq2 = D3DEikrvb.CBQ5d1kRq(dIocxURUo, R.attr.colorSurface);
                            dOSsQaJVg dossqajvg = new dOSsQaJVg(boxBackground.CBQ5d1kRq.q3BipwRCk);
                            int ilHKhw3Yw = D3DEikrvb.ilHKhw3Yw(CBQ5d1kRq, CBQ5d1kRq2, 0.1f);
                            dossqajvg.MzoOEjc4X(new ColorStateList(iArr, new int[]{ilHKhw3Yw, 0}));
                            dossqajvg.setTint(CBQ5d1kRq2);
                            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{ilHKhw3Yw, CBQ5d1kRq2});
                            dOSsQaJVg dossqajvg2 = new dOSsQaJVg(boxBackground.CBQ5d1kRq.q3BipwRCk);
                            dossqajvg2.setTint(-1);
                            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, dossqajvg, dossqajvg2), boxBackground});
                            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                            VCCyeOu6I.ilHKhw3Yw(dIocxURUo, layerDrawable);
                        } else if (boxBackgroundMode2 == 1) {
                            int boxBackgroundColor = rf3coyxnl2.q3BipwRCk.getBoxBackgroundColor();
                            RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{D3DEikrvb.ilHKhw3Yw(CBQ5d1kRq, boxBackgroundColor, 0.1f), boxBackgroundColor}), boxBackground, boxBackground);
                            WeakHashMap weakHashMap2 = IuQbWntsc.q3BipwRCk;
                            VCCyeOu6I.ilHKhw3Yw(dIocxURUo, rippleDrawable);
                        }
                    }
                    rf3cOyxnl rf3coyxnl3 = (rf3cOyxnl) this.J4Ux7ym32;
                    Objects.requireNonNull(rf3coyxnl3);
                    dIocxURUo.setOnTouchListener(new NDdSbKQHH(rf3coyxnl3, dIocxURUo));
                    dIocxURUo.setOnFocusChangeListener(rf3coyxnl3.iiGwOFFnr);
                    dIocxURUo.setOnDismissListener(new sFazzyHPy(rf3coyxnl3));
                    dIocxURUo.setThreshold(0);
                    dIocxURUo.removeTextChangedListener(((rf3cOyxnl) this.J4Ux7ym32).kCA6Zs9sL);
                    dIocxURUo.addTextChangedListener(((rf3cOyxnl) this.J4Ux7ym32).kCA6Zs9sL);
                    textInputLayout.setEndIconCheckable(true);
                    textInputLayout.setErrorIconDrawable((Drawable) null);
                    if (dIocxURUo.getKeyListener() != null) {
                        z = true;
                    }
                    if (!z) {
                        CheckableImageButton checkableImageButton = ((rf3cOyxnl) this.J4Ux7ym32).tGV7Q6urW;
                        WeakHashMap weakHashMap3 = IuQbWntsc.q3BipwRCk;
                        VCCyeOu6I.Eeka1udhb(checkableImageButton, 2);
                    }
                    textInputLayout.setTextInputAccessibilityDelegate(((rf3cOyxnl) this.J4Ux7ym32).GPLPRo6go);
                    textInputLayout.setEndIconVisible(true);
                    return;
                }
                dIocxURUo.setDropDownBackgroundDrawable(drawable);
                rf3cOyxnl rf3coyxnl22 = (rf3cOyxnl) this.J4Ux7ym32;
                Objects.requireNonNull(rf3coyxnl22);
                if (!(dIocxURUo.getKeyListener() == null)) {
                }
                rf3cOyxnl rf3coyxnl32 = (rf3cOyxnl) this.J4Ux7ym32;
                Objects.requireNonNull(rf3coyxnl32);
                dIocxURUo.setOnTouchListener(new NDdSbKQHH(rf3coyxnl32, dIocxURUo));
                dIocxURUo.setOnFocusChangeListener(rf3coyxnl32.iiGwOFFnr);
                dIocxURUo.setOnDismissListener(new sFazzyHPy(rf3coyxnl32));
                dIocxURUo.setThreshold(0);
                dIocxURUo.removeTextChangedListener(((rf3cOyxnl) this.J4Ux7ym32).kCA6Zs9sL);
                dIocxURUo.addTextChangedListener(((rf3cOyxnl) this.J4Ux7ym32).kCA6Zs9sL);
                textInputLayout.setEndIconCheckable(true);
                textInputLayout.setErrorIconDrawable((Drawable) null);
                if (dIocxURUo.getKeyListener() != null) {
                }
                if (!z) {
                }
                textInputLayout.setTextInputAccessibilityDelegate(((rf3cOyxnl) this.J4Ux7ym32).GPLPRo6go);
                textInputLayout.setEndIconVisible(true);
                return;
            default:
                EditText editText2 = textInputLayout.getEditText();
                textInputLayout.setEndIconVisible(true);
                textInputLayout.setEndIconCheckable(true);
                eV9inabdD ev9inabdd = (eV9inabdD) this.J4Ux7ym32;
                ev9inabdd.tGV7Q6urW.setChecked(!eV9inabdD.dIocxURUo(ev9inabdd));
                editText2.removeTextChangedListener(((eV9inabdD) this.J4Ux7ym32).kCA6Zs9sL);
                editText2.addTextChangedListener(((eV9inabdD) this.J4Ux7ym32).kCA6Zs9sL);
                return;
        }
    }

    public y5oh9NJPA(rf3cOyxnl rf3coyxnl) {
        this.J4Ux7ym32 = rf3coyxnl;
    }

    public y5oh9NJPA(eV9inabdD ev9inabdd) {
        this.J4Ux7ym32 = ev9inabdd;
    }
}
