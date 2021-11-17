package con;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.feravolt.preload.R;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class FSVv1nFjp {
    public ColorStateList CBQ5d1kRq;
    public int Eeka1udhb;
    public int GPLPRo6go;
    public xT3tobMV0 J4Ux7ym32;
    public int Puu3Rhg4F;
    public int dIocxURUo;
    public int iiGwOFFnr;
    public boolean ilHKhw3Yw;
    public int kCA6Zs9sL;
    public Drawable kmSgne1rO;
    public ColorStateList oon79WMrY;
    public final MaterialButton q3BipwRCk;
    public LayerDrawable qVUwofr5s;
    public int tGV7Q6urW;
    public ColorStateList vPSbyrYWX;
    public PorterDuff.Mode yWvV4ePLl;
    public boolean Bhmn1KIah = false;
    public boolean PSTqBLTET = false;
    public boolean MzoOEjc4X = false;

    public FSVv1nFjp(MaterialButton materialButton, xT3tobMV0 xt3tobmv0) {
        this.q3BipwRCk = materialButton;
        this.J4Ux7ym32 = xt3tobmv0;
    }

    public final void GPLPRo6go() {
        MaterialButton materialButton = this.q3BipwRCk;
        dOSsQaJVg dossqajvg = new dOSsQaJVg(this.J4Ux7ym32);
        dossqajvg.Bhmn1KIah(this.q3BipwRCk.getContext());
        dossqajvg.setTintList(this.oon79WMrY);
        PorterDuff.Mode mode = this.yWvV4ePLl;
        if (mode != null) {
            dossqajvg.setTintMode(mode);
        }
        dossqajvg.Eeka1udhb((float) this.Puu3Rhg4F, this.vPSbyrYWX);
        dOSsQaJVg dossqajvg2 = new dOSsQaJVg(this.J4Ux7ym32);
        dossqajvg2.setTint(0);
        dossqajvg2.qVUwofr5s((float) this.Puu3Rhg4F, this.Bhmn1KIah ? D3DEikrvb.CBQ5d1kRq(this.q3BipwRCk, R.attr.colorSurface) : 0);
        dOSsQaJVg dossqajvg3 = new dOSsQaJVg(this.J4Ux7ym32);
        this.kmSgne1rO = dossqajvg3;
        dossqajvg3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(FXBYEZrfX.q3BipwRCk(this.CBQ5d1kRq), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{dossqajvg2, dossqajvg}), this.tGV7Q6urW, this.kCA6Zs9sL, this.dIocxURUo, this.iiGwOFFnr), this.kmSgne1rO);
        this.qVUwofr5s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        dOSsQaJVg J4Ux7ym32 = J4Ux7ym32();
        if (J4Ux7ym32 != null) {
            J4Ux7ym32.PSTqBLTET((float) this.Eeka1udhb);
        }
    }

    public dOSsQaJVg J4Ux7ym32() {
        return tGV7Q6urW(false);
    }

    public final void Puu3Rhg4F() {
        dOSsQaJVg J4Ux7ym32 = J4Ux7ym32();
        dOSsQaJVg dIocxURUo = dIocxURUo();
        if (J4Ux7ym32 != null) {
            J4Ux7ym32.Eeka1udhb((float) this.Puu3Rhg4F, this.vPSbyrYWX);
            if (dIocxURUo != null) {
                dIocxURUo.qVUwofr5s((float) this.Puu3Rhg4F, this.Bhmn1KIah ? D3DEikrvb.CBQ5d1kRq(this.q3BipwRCk, R.attr.colorSurface) : 0);
            }
        }
    }

    public final dOSsQaJVg dIocxURUo() {
        return tGV7Q6urW(true);
    }

    public final void iiGwOFFnr(int i, int i2) {
        MaterialButton materialButton = this.q3BipwRCk;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        int iiGwOFFnr = RBJDIwG1D.iiGwOFFnr(materialButton);
        int paddingTop = this.q3BipwRCk.getPaddingTop();
        int kCA6Zs9sL = RBJDIwG1D.kCA6Zs9sL(this.q3BipwRCk);
        int paddingBottom = this.q3BipwRCk.getPaddingBottom();
        int i3 = this.kCA6Zs9sL;
        int i4 = this.iiGwOFFnr;
        this.iiGwOFFnr = i2;
        this.kCA6Zs9sL = i;
        if (!this.PSTqBLTET) {
            GPLPRo6go();
        }
        RBJDIwG1D.vPSbyrYWX(this.q3BipwRCk, iiGwOFFnr, (paddingTop + i) - i3, kCA6Zs9sL, (paddingBottom + i2) - i4);
    }

    public void kCA6Zs9sL(xT3tobMV0 xt3tobmv0) {
        this.J4Ux7ym32 = xt3tobmv0;
        if (J4Ux7ym32() != null) {
            dOSsQaJVg J4Ux7ym32 = J4Ux7ym32();
            J4Ux7ym32.CBQ5d1kRq.q3BipwRCk = xt3tobmv0;
            J4Ux7ym32.invalidateSelf();
        }
        if (dIocxURUo() != null) {
            dOSsQaJVg dIocxURUo = dIocxURUo();
            dIocxURUo.CBQ5d1kRq.q3BipwRCk = xt3tobmv0;
            dIocxURUo.invalidateSelf();
        }
        if (q3BipwRCk() != null) {
            q3BipwRCk().setShapeAppearanceModel(xt3tobmv0);
        }
    }

    public rUYFcNk3O q3BipwRCk() {
        LayerDrawable layerDrawable = this.qVUwofr5s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (rUYFcNk3O) (this.qVUwofr5s.getNumberOfLayers() > 2 ? this.qVUwofr5s.getDrawable(2) : this.qVUwofr5s.getDrawable(1));
    }

    public final dOSsQaJVg tGV7Q6urW(boolean z) {
        LayerDrawable layerDrawable = this.qVUwofr5s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (dOSsQaJVg) ((LayerDrawable) ((InsetDrawable) this.qVUwofr5s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }
}
