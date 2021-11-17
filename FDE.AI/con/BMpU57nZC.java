package con;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class BMpU57nZC extends bLi3v8XK4 {
    public final SeekBar dIocxURUo;
    public Drawable kCA6Zs9sL;
    public ColorStateList iiGwOFFnr = null;
    public PorterDuff.Mode GPLPRo6go = null;
    public boolean Puu3Rhg4F = false;
    public boolean yWvV4ePLl = false;

    public BMpU57nZC(SeekBar seekBar) {
        super(seekBar);
        this.dIocxURUo = seekBar;
    }

    public void dIocxURUo(Canvas canvas) {
        if (this.kCA6Zs9sL != null) {
            int max = this.dIocxURUo.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.kCA6Zs9sL.getIntrinsicWidth();
                int intrinsicHeight = this.kCA6Zs9sL.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.kCA6Zs9sL.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.dIocxURUo.getWidth() - this.dIocxURUo.getPaddingLeft()) - this.dIocxURUo.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.dIocxURUo.getPaddingLeft(), (float) (this.dIocxURUo.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.kCA6Zs9sL.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // con.bLi3v8XK4
    public void q3BipwRCk(AttributeSet attributeSet, int i) {
        super.q3BipwRCk(attributeSet, i);
        Context context = this.dIocxURUo.getContext();
        int[] iArr = ZolH67hOx.GPLPRo6go;
        j6XJY7rz4 mUqPm6GBh = j6XJY7rz4.mUqPm6GBh(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.dIocxURUo;
        IuQbWntsc.PSTqBLTET(seekBar, seekBar.getContext(), iArr, attributeSet, (TypedArray) mUqPm6GBh.Bhmn1KIah, i, 0);
        Drawable RG6kpfv3v = mUqPm6GBh.RG6kpfv3v(0);
        if (RG6kpfv3v != null) {
            this.dIocxURUo.setThumb(RG6kpfv3v);
        }
        Drawable dXrmkklc8 = mUqPm6GBh.dXrmkklc8(1);
        Drawable drawable = this.kCA6Zs9sL;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.kCA6Zs9sL = dXrmkklc8;
        if (dXrmkklc8 != null) {
            dXrmkklc8.setCallback(this.dIocxURUo);
            SeekBar seekBar2 = this.dIocxURUo;
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            dXrmkklc8.setLayoutDirection(RBJDIwG1D.dIocxURUo(seekBar2));
            if (dXrmkklc8.isStateful()) {
                dXrmkklc8.setState(this.dIocxURUo.getDrawableState());
            }
            tGV7Q6urW();
        }
        this.dIocxURUo.invalidate();
        if (mUqPm6GBh.CpG0imbht(3)) {
            this.GPLPRo6go = Y4wRqkFOh.tGV7Q6urW(mUqPm6GBh.i8XZMQc6Z(3, -1), this.GPLPRo6go);
            this.yWvV4ePLl = true;
        }
        if (mUqPm6GBh.CpG0imbht(2)) {
            this.iiGwOFFnr = mUqPm6GBh.Bhmn1KIah(2);
            this.Puu3Rhg4F = true;
        }
        mUqPm6GBh.NyWTwPF6V();
        tGV7Q6urW();
    }

    public final void tGV7Q6urW() {
        Drawable drawable = this.kCA6Zs9sL;
        if (drawable == null) {
            return;
        }
        if (this.Puu3Rhg4F || this.yWvV4ePLl) {
            Drawable mutate = drawable.mutate();
            this.kCA6Zs9sL = mutate;
            if (this.Puu3Rhg4F) {
                mutate.setTintList(this.iiGwOFFnr);
            }
            if (this.yWvV4ePLl) {
                this.kCA6Zs9sL.setTintMode(this.GPLPRo6go);
            }
            if (this.kCA6Zs9sL.isStateful()) {
                this.kCA6Zs9sL.setState(this.dIocxURUo.getDrawableState());
            }
        }
    }
}
