package con;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
/* loaded from: classes.dex */
public final class lKCpVfxs7 extends RippleDrawable {
    public Integer Bhmn1KIah;
    public final boolean CBQ5d1kRq;
    public boolean PSTqBLTET;
    public bO2dbmrf7 kmSgne1rO;

    public lKCpVfxs7(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.CBQ5d1kRq = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        if (!this.CBQ5d1kRq) {
            this.PSTqBLTET = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.PSTqBLTET = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.PSTqBLTET;
    }
}
