package con;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.feravolt.preload.R;
/* loaded from: classes.dex */
public abstract class VYFSnTUcw extends ViewGroup {
    public WQpIMzWun Bhmn1KIah;
    public final Paint CBQ5d1kRq;
    public boolean PSTqBLTET;
    public final int kmSgne1rO = getContext().getResources().getDimensionPixelSize(R.dimen.md_divider_height);

    public VYFSnTUcw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.CBQ5d1kRq = paint;
        setWillNotDraw(false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(context.getResources().getDimension(R.dimen.md_divider_height));
        paint.setAntiAlias(true);
    }

    private final int getDividerColor() {
        Context context = this.Bhmn1KIah.getContext();
        Integer valueOf = Integer.valueOf((int) R.attr.md_divider_color);
        if (true && true) {
            valueOf = null;
        }
        if (valueOf != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{valueOf.intValue()});
            try {
                return obtainStyledAttributes.getColor(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            Object obj = D856HTNqd.q3BipwRCk;
            return nHNpaD9No.q3BipwRCk(context, 0);
        }
    }

    public final WQpIMzWun getDialog() {
        return this.Bhmn1KIah;
    }

    public final int getDividerHeight() {
        return this.kmSgne1rO;
    }

    public final boolean getDrawDivider() {
        return this.PSTqBLTET;
    }

    public final Paint q3BipwRCk() {
        this.CBQ5d1kRq.setColor(getDividerColor());
        return this.CBQ5d1kRq;
    }

    public final void setDialog(WQpIMzWun wQpIMzWun) {
        this.Bhmn1KIah = wQpIMzWun;
    }

    public final void setDrawDivider(boolean z) {
        this.PSTqBLTET = z;
        invalidate();
    }
}
