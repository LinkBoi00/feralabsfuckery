package con;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;
/* loaded from: classes.dex */
public class TiJy6t0au extends Drawable {
    public final ActionBarContainer q3BipwRCk;

    public TiJy6t0au(ActionBarContainer actionBarContainer) {
        this.q3BipwRCk = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.q3BipwRCk;
        if (actionBarContainer.Eeka1udhb) {
            Drawable drawable = actionBarContainer.qVUwofr5s;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.MzoOEjc4X;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.q3BipwRCk;
        Drawable drawable3 = actionBarContainer2.ilHKhw3Yw;
        if (drawable3 != null && actionBarContainer2.dXrmkklc8) {
            drawable3.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.q3BipwRCk;
        if (actionBarContainer.Eeka1udhb) {
            drawable = actionBarContainer.qVUwofr5s;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.MzoOEjc4X;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
