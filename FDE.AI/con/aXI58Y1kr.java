package con;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.RG2GI7LDp;
import androidx.appcompat.widget.ActionMenuView;
import com.feravolt.preload.R;
/* loaded from: classes.dex */
public abstract class aXI58Y1kr extends ViewGroup {
    public ActionMenuView Bhmn1KIah;
    public final mhl5lIdbQ CBQ5d1kRq = new mhl5lIdbQ(this);
    public boolean Eeka1udhb;
    public int MzoOEjc4X;
    public TeoeEf1aF PSTqBLTET;
    public Roohga8FY ilHKhw3Yw;
    public final Context kmSgne1rO;
    public boolean qVUwofr5s;

    public aXI58Y1kr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.kmSgne1rO = context;
        } else {
            this.kmSgne1rO = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public int dIocxURUo(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public Roohga8FY kCA6Zs9sL(int i, long j) {
        Roohga8FY roohga8FY = this.ilHKhw3Yw;
        if (roohga8FY != null) {
            roohga8FY.J4Ux7ym32();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            Roohga8FY J4Ux7ym32 = IuQbWntsc.J4Ux7ym32(this);
            J4Ux7ym32.q3BipwRCk(1.0f);
            J4Ux7ym32.tGV7Q6urW(j);
            mhl5lIdbQ mhl5lidbq = this.CBQ5d1kRq;
            mhl5lidbq.tGV7Q6urW.ilHKhw3Yw = J4Ux7ym32;
            mhl5lidbq.J4Ux7ym32 = i;
            View view = (View) J4Ux7ym32.q3BipwRCk.get();
            if (view != null) {
                J4Ux7ym32.kCA6Zs9sL(view, mhl5lidbq);
            }
            return J4Ux7ym32;
        }
        Roohga8FY J4Ux7ym322 = IuQbWntsc.J4Ux7ym32(this);
        J4Ux7ym322.q3BipwRCk(0.0f);
        J4Ux7ym322.tGV7Q6urW(j);
        mhl5lIdbQ mhl5lidbq2 = this.CBQ5d1kRq;
        mhl5lidbq2.tGV7Q6urW.ilHKhw3Yw = J4Ux7ym322;
        mhl5lidbq2.J4Ux7ym32 = i;
        View view2 = (View) J4Ux7ym322.q3BipwRCk.get();
        if (view2 != null) {
            J4Ux7ym322.kCA6Zs9sL(view2, mhl5lidbq2);
        }
        return J4Ux7ym322;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, ZolH67hOx.q3BipwRCk, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        TeoeEf1aF teoeEf1aF = this.PSTqBLTET;
        if (teoeEf1aF != null) {
            Configuration configuration2 = teoeEf1aF.kmSgne1rO.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            teoeEf1aF.iMyQMM6Qj = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            RG2GI7LDp rG2GI7LDp = teoeEf1aF.Bhmn1KIah;
            if (rG2GI7LDp != null) {
                rG2GI7LDp.MzoOEjc4X(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.Eeka1udhb = false;
        }
        if (!this.Eeka1udhb) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.Eeka1udhb = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.Eeka1udhb = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.qVUwofr5s = false;
        }
        if (!this.qVUwofr5s) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.qVUwofr5s = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.qVUwofr5s = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            Roohga8FY roohga8FY = this.ilHKhw3Yw;
            if (roohga8FY != null) {
                roohga8FY.J4Ux7ym32();
            }
            super.setVisibility(i);
        }
    }

    public int tGV7Q6urW(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }
}
