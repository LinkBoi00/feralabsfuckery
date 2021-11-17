package con;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
/* loaded from: classes.dex */
public class OpEYJpxVi {
    public boolean iiGwOFFnr;
    public final CompoundButton q3BipwRCk;
    public ColorStateList J4Ux7ym32 = null;
    public PorterDuff.Mode tGV7Q6urW = null;
    public boolean dIocxURUo = false;
    public boolean kCA6Zs9sL = false;

    public OpEYJpxVi(CompoundButton compoundButton) {
        this.q3BipwRCk = compoundButton;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c A[Catch: all -> 0x007f, TryCatch #1 {all -> 0x007f, blocks: (B:3:0x001f, B:5:0x0025, B:7:0x002b, B:10:0x003c, B:12:0x0042, B:14:0x0048, B:15:0x0055, B:17:0x005c, B:18:0x0065, B:20:0x006c), top: B:29:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c A[Catch: all -> 0x007f, TRY_LEAVE, TryCatch #1 {all -> 0x007f, blocks: (B:3:0x001f, B:5:0x0025, B:7:0x002b, B:10:0x003c, B:12:0x0042, B:14:0x0048, B:15:0x0055, B:17:0x005c, B:18:0x0065, B:20:0x006c), top: B:29:0x001f }] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void J4Ux7ym32(AttributeSet attributeSet, int i) {
        int iMyQMM6Qj;
        int iMyQMM6Qj2;
        Context context = this.q3BipwRCk.getContext();
        int[] iArr = ZolH67hOx.CBQ5d1kRq;
        j6XJY7rz4 mUqPm6GBh = j6XJY7rz4.mUqPm6GBh(context, attributeSet, iArr, i, 0);
        CompoundButton compoundButton = this.q3BipwRCk;
        IuQbWntsc.PSTqBLTET(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) mUqPm6GBh.Bhmn1KIah, i, 0);
        boolean z = true;
        try {
            if (mUqPm6GBh.CpG0imbht(1) && (iMyQMM6Qj2 = mUqPm6GBh.iMyQMM6Qj(1, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.q3BipwRCk;
                    compoundButton2.setButtonDrawable(C8A1BseZU.q3BipwRCk(compoundButton2.getContext(), iMyQMM6Qj2));
                } catch (Resources.NotFoundException unused) {
                }
                if (!z && mUqPm6GBh.CpG0imbht(0) && (iMyQMM6Qj = mUqPm6GBh.iMyQMM6Qj(0, 0)) != 0) {
                    CompoundButton compoundButton3 = this.q3BipwRCk;
                    compoundButton3.setButtonDrawable(C8A1BseZU.q3BipwRCk(compoundButton3.getContext(), iMyQMM6Qj));
                }
                if (mUqPm6GBh.CpG0imbht(2)) {
                    this.q3BipwRCk.setButtonTintList(mUqPm6GBh.Bhmn1KIah(2));
                }
                if (mUqPm6GBh.CpG0imbht(3)) {
                    this.q3BipwRCk.setButtonTintMode(Y4wRqkFOh.tGV7Q6urW(mUqPm6GBh.i8XZMQc6Z(3, -1), null));
                }
            }
            z = false;
            if (!z) {
                CompoundButton compoundButton32 = this.q3BipwRCk;
                compoundButton32.setButtonDrawable(C8A1BseZU.q3BipwRCk(compoundButton32.getContext(), iMyQMM6Qj));
            }
            if (mUqPm6GBh.CpG0imbht(2)) {
            }
            if (mUqPm6GBh.CpG0imbht(3)) {
            }
        } finally {
            mUqPm6GBh.NyWTwPF6V();
        }
    }

    public void q3BipwRCk() {
        Drawable buttonDrawable = this.q3BipwRCk.getButtonDrawable();
        if (buttonDrawable == null) {
            return;
        }
        if (this.dIocxURUo || this.kCA6Zs9sL) {
            Drawable mutate = buttonDrawable.mutate();
            if (this.dIocxURUo) {
                mutate.setTintList(this.J4Ux7ym32);
            }
            if (this.kCA6Zs9sL) {
                mutate.setTintMode(this.tGV7Q6urW);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.q3BipwRCk.getDrawableState());
            }
            this.q3BipwRCk.setButtonDrawable(mutate);
        }
    }
}
