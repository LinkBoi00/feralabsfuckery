package con;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionMenuView;
import com.feravolt.preload.R;
/* loaded from: classes.dex */
public class wTUTXyz5r extends PQnXPgcS3 implements ActionMenuView.RG2GI7LDp {
    public final /* synthetic */ TeoeEf1aF Bhmn1KIah;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wTUTXyz5r(TeoeEf1aF teoeEf1aF, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.Bhmn1KIah = teoeEf1aF;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        setTooltipText(getContentDescription());
        setOnTouchListener(new J36hVzW7e(this, this, teoeEf1aF));
    }

    @Override // androidx.appcompat.widget.ActionMenuView.RG2GI7LDp
    public boolean J4Ux7ym32() {
        return false;
    }

    @Override // android.view.View
    public boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.Bhmn1KIah.Bhmn1KIah();
        return true;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.RG2GI7LDp
    public boolean q3BipwRCk() {
        return false;
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
