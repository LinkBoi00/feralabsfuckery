package con;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.feravolt.preload.R;
/* loaded from: classes.dex */
public class Q9gfis7Nk extends AppCompatCheckBox {
    public static final int[][] ilHKhw3Yw = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    public boolean MzoOEjc4X;
    public ColorStateList PSTqBLTET;

    public Q9gfis7Nk(Context context, AttributeSet attributeSet) {
        super(ba8VhBGaI.q3BipwRCk(context, attributeSet, R.attr.checkboxStyle, 2131821540), attributeSet, R.attr.checkboxStyle);
        Context context2 = getContext();
        TypedArray dIocxURUo = hF1hMObUZ.dIocxURUo(context2, attributeSet, RisoK3egD.MzoOEjc4X, R.attr.checkboxStyle, 2131821540, new int[0]);
        if (dIocxURUo.hasValue(0)) {
            setButtonTintList(anXlDk6fV.Bhmn1KIah(context2, dIocxURUo, 0));
        }
        this.MzoOEjc4X = dIocxURUo.getBoolean(1, false);
        dIocxURUo.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.PSTqBLTET == null) {
            int[][] iArr = ilHKhw3Yw;
            int[] iArr2 = new int[iArr.length];
            int CBQ5d1kRq = D3DEikrvb.CBQ5d1kRq(this, R.attr.colorControlActivated);
            int CBQ5d1kRq2 = D3DEikrvb.CBQ5d1kRq(this, R.attr.colorSurface);
            int CBQ5d1kRq3 = D3DEikrvb.CBQ5d1kRq(this, R.attr.colorOnSurface);
            iArr2[0] = D3DEikrvb.ilHKhw3Yw(CBQ5d1kRq2, CBQ5d1kRq, 1.0f);
            iArr2[1] = D3DEikrvb.ilHKhw3Yw(CBQ5d1kRq2, CBQ5d1kRq3, 0.54f);
            iArr2[2] = D3DEikrvb.ilHKhw3Yw(CBQ5d1kRq2, CBQ5d1kRq3, 0.38f);
            iArr2[3] = D3DEikrvb.ilHKhw3Yw(CBQ5d1kRq2, CBQ5d1kRq3, 0.38f);
            this.PSTqBLTET = new ColorStateList(iArr, iArr2);
        }
        return this.PSTqBLTET;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.MzoOEjc4X && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.MzoOEjc4X = z;
        setButtonTintList(z ? getMaterialThemeColorsTintList() : null);
    }
}
