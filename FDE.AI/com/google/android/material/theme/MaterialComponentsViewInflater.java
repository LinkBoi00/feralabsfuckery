package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import con.CVlUPqBF8;
import con.LYtU53WQj;
import con.Q9gfis7Nk;
import con.VnuSHN10J;
import con.kZAmYIEbq;
import con.qs7k2SwdW;
import con.yHOWpR3Sc;
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends kZAmYIEbq {
    @Override // con.kZAmYIEbq
    public LYtU53WQj J4Ux7ym32(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // con.kZAmYIEbq
    public AppCompatRadioButton dIocxURUo(Context context, AttributeSet attributeSet) {
        return new CVlUPqBF8(context, attributeSet);
    }

    @Override // con.kZAmYIEbq
    public qs7k2SwdW kCA6Zs9sL(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }

    @Override // con.kZAmYIEbq
    public yHOWpR3Sc q3BipwRCk(Context context, AttributeSet attributeSet) {
        return new VnuSHN10J(context, attributeSet);
    }

    @Override // con.kZAmYIEbq
    public AppCompatCheckBox tGV7Q6urW(Context context, AttributeSet attributeSet) {
        return new Q9gfis7Nk(context, attributeSet);
    }
}
