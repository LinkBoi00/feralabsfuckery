package con;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
/* loaded from: classes.dex */
public class jJtQlby2Y extends ImageButton {
    public final SfQ6fqrlg CBQ5d1kRq;
    public final LKa8y802S kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jJtQlby2Y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        GV6EZRqr3.q3BipwRCk(context);
        hfLGvn7bI.q3BipwRCk(this, getContext());
        SfQ6fqrlg sfQ6fqrlg = new SfQ6fqrlg(this);
        this.CBQ5d1kRq = sfQ6fqrlg;
        sfQ6fqrlg.iiGwOFFnr(attributeSet, i);
        LKa8y802S lKa8y802S = new LKa8y802S(this);
        this.kmSgne1rO = lKa8y802S;
        lKa8y802S.MzoOEjc4X(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            sfQ6fqrlg.q3BipwRCk();
        }
        LKa8y802S lKa8y802S = this.kmSgne1rO;
        if (lKa8y802S != null) {
            lKa8y802S.Puu3Rhg4F();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            return sfQ6fqrlg.dIocxURUo();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            return sfQ6fqrlg.kCA6Zs9sL();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        lNNWSSNDS lnnwssnds;
        LKa8y802S lKa8y802S = this.kmSgne1rO;
        if (lKa8y802S == null || (lnnwssnds = (lNNWSSNDS) lKa8y802S.tGV7Q6urW) == null) {
            return null;
        }
        return (ColorStateList) lnnwssnds.q3BipwRCk;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        lNNWSSNDS lnnwssnds;
        LKa8y802S lKa8y802S = this.kmSgne1rO;
        if (lKa8y802S == null || (lnnwssnds = (lNNWSSNDS) lKa8y802S.tGV7Q6urW) == null) {
            return null;
        }
        return (PorterDuff.Mode) lnnwssnds.J4Ux7ym32;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        if (!(!(((ImageView) this.kmSgne1rO.q3BipwRCk).getBackground() instanceof RippleDrawable)) || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            sfQ6fqrlg.GPLPRo6go();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            sfQ6fqrlg.Puu3Rhg4F(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        LKa8y802S lKa8y802S = this.kmSgne1rO;
        if (lKa8y802S != null) {
            lKa8y802S.Puu3Rhg4F();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        LKa8y802S lKa8y802S = this.kmSgne1rO;
        if (lKa8y802S != null) {
            lKa8y802S.Puu3Rhg4F();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.kmSgne1rO.Eeka1udhb(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        LKa8y802S lKa8y802S = this.kmSgne1rO;
        if (lKa8y802S != null) {
            lKa8y802S.Puu3Rhg4F();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            sfQ6fqrlg.oon79WMrY(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            sfQ6fqrlg.vPSbyrYWX(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        LKa8y802S lKa8y802S = this.kmSgne1rO;
        if (lKa8y802S != null) {
            lKa8y802S.dXrmkklc8(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        LKa8y802S lKa8y802S = this.kmSgne1rO;
        if (lKa8y802S != null) {
            lKa8y802S.RG6kpfv3v(mode);
        }
    }
}
