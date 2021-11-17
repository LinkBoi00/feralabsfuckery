package con;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.feravolt.preload.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class GC006c8s6 {
    public int Bhmn1KIah;
    public TextView CBQ5d1kRq;
    public int Eeka1udhb;
    public final float GPLPRo6go;
    public final TextInputLayout J4Ux7ym32;
    public CharSequence MzoOEjc4X;
    public ColorStateList PSTqBLTET;
    public int Puu3Rhg4F;
    public Typeface RG6kpfv3v;
    public int dIocxURUo;
    public ColorStateList dXrmkklc8;
    public Animator iiGwOFFnr;
    public boolean ilHKhw3Yw;
    public FrameLayout kCA6Zs9sL;
    public CharSequence kmSgne1rO;
    public CharSequence oon79WMrY;
    public final Context q3BipwRCk;
    public TextView qVUwofr5s;
    public LinearLayout tGV7Q6urW;
    public boolean vPSbyrYWX;
    public int yWvV4ePLl;

    public GC006c8s6(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.q3BipwRCk = context;
        this.J4Ux7ym32 = textInputLayout;
        this.GPLPRo6go = (float) context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public final void CBQ5d1kRq(int i, int i2, boolean z) {
        TextView iiGwOFFnr;
        TextView iiGwOFFnr2;
        if (i != i2) {
            if (z) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.iiGwOFFnr = animatorSet;
                ArrayList arrayList = new ArrayList();
                dIocxURUo(arrayList, this.ilHKhw3Yw, this.qVUwofr5s, 2, i, i2);
                dIocxURUo(arrayList, this.vPSbyrYWX, this.CBQ5d1kRq, 1, i, i2);
                anXlDk6fV.i8XZMQc6Z(animatorSet, arrayList);
                animatorSet.addListener(new ncNI5dOX0(this, i2, iiGwOFFnr(i), i, iiGwOFFnr(i2)));
                animatorSet.start();
            } else if (i != i2) {
                if (!(i2 == 0 || (iiGwOFFnr2 = iiGwOFFnr(i2)) == null)) {
                    iiGwOFFnr2.setVisibility(0);
                    iiGwOFFnr2.setAlpha(1.0f);
                }
                if (!(i == 0 || (iiGwOFFnr = iiGwOFFnr(i)) == null)) {
                    iiGwOFFnr.setVisibility(4);
                    if (i == 1) {
                        iiGwOFFnr.setText((CharSequence) null);
                    }
                }
                this.Puu3Rhg4F = i2;
            }
            this.J4Ux7ym32.i8XZMQc6Z();
            this.J4Ux7ym32.iMyQMM6Qj(z, false);
            this.J4Ux7ym32.mUqPm6GBh();
        }
    }

    public int GPLPRo6go() {
        TextView textView = this.CBQ5d1kRq;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public void J4Ux7ym32() {
        if ((this.tGV7Q6urW == null || this.J4Ux7ym32.getEditText() == null) ? false : true) {
            EditText editText = this.J4Ux7ym32.getEditText();
            boolean Eeka1udhb = anXlDk6fV.Eeka1udhb(this.q3BipwRCk);
            LinearLayout linearLayout = this.tGV7Q6urW;
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            RBJDIwG1D.vPSbyrYWX(linearLayout, Puu3Rhg4F(Eeka1udhb, R.dimen.material_helper_text_font_1_3_padding_horizontal, RBJDIwG1D.iiGwOFFnr(editText)), Puu3Rhg4F(Eeka1udhb, R.dimen.material_helper_text_font_1_3_padding_top, this.q3BipwRCk.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), Puu3Rhg4F(Eeka1udhb, R.dimen.material_helper_text_font_1_3_padding_horizontal, RBJDIwG1D.kCA6Zs9sL(editText)), 0);
        }
    }

    public final int Puu3Rhg4F(boolean z, int i, int i2) {
        return z ? this.q3BipwRCk.getResources().getDimensionPixelSize(i) : i2;
    }

    public final void dIocxURUo(List list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, i3 == i ? 1.0f : 0.0f);
                ofFloat.setDuration(167L);
                ofFloat.setInterpolator(vZAFqpduB.q3BipwRCk);
                list.add(ofFloat);
                if (i3 == i) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.GPLPRo6go, 0.0f);
                    ofFloat2.setDuration(217L);
                    ofFloat2.setInterpolator(vZAFqpduB.dIocxURUo);
                    list.add(ofFloat2);
                }
            }
        }
    }

    public final TextView iiGwOFFnr(int i) {
        if (i == 1) {
            return this.CBQ5d1kRq;
        }
        if (i != 2) {
            return null;
        }
        return this.qVUwofr5s;
    }

    public boolean kCA6Zs9sL() {
        return this.yWvV4ePLl == 1 && this.CBQ5d1kRq != null && !TextUtils.isEmpty(this.oon79WMrY);
    }

    public void oon79WMrY(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.tGV7Q6urW;
        if (linearLayout != null) {
            if (!(i == 0 || i == 1) || (frameLayout = this.kCA6Zs9sL) == null) {
                linearLayout.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i2 = this.dIocxURUo - 1;
            this.dIocxURUo = i2;
            LinearLayout linearLayout2 = this.tGV7Q6urW;
            if (i2 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public void q3BipwRCk(TextView textView, int i) {
        if (this.tGV7Q6urW == null && this.kCA6Zs9sL == null) {
            LinearLayout linearLayout = new LinearLayout(this.q3BipwRCk);
            this.tGV7Q6urW = linearLayout;
            linearLayout.setOrientation(0);
            this.J4Ux7ym32.addView(this.tGV7Q6urW, -1, -2);
            this.kCA6Zs9sL = new FrameLayout(this.q3BipwRCk);
            this.tGV7Q6urW.addView(this.kCA6Zs9sL, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.J4Ux7ym32.getEditText() != null) {
                J4Ux7ym32();
            }
        }
        if (i == 0 || i == 1) {
            this.kCA6Zs9sL.setVisibility(0);
            this.kCA6Zs9sL.addView(textView);
        } else {
            this.tGV7Q6urW.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.tGV7Q6urW.setVisibility(0);
        this.dIocxURUo++;
    }

    public void tGV7Q6urW() {
        Animator animator = this.iiGwOFFnr;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final boolean vPSbyrYWX(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.J4Ux7ym32;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        return mN6fklC4R.tGV7Q6urW(textInputLayout) && this.J4Ux7ym32.isEnabled() && (this.yWvV4ePLl != this.Puu3Rhg4F || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    public void yWvV4ePLl() {
        this.oon79WMrY = null;
        tGV7Q6urW();
        if (this.Puu3Rhg4F == 1) {
            this.yWvV4ePLl = (!this.ilHKhw3Yw || TextUtils.isEmpty(this.MzoOEjc4X)) ? 0 : 2;
        }
        CBQ5d1kRq(this.Puu3Rhg4F, this.yWvV4ePLl, vPSbyrYWX(this.CBQ5d1kRq, null));
    }
}
