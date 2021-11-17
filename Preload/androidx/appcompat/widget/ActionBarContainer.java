package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.feravolt.preload.R;
import con.IuQbWntsc;
import con.TiJy6t0au;
import con.VCCyeOu6I;
import con.ZolH67hOx;
import con.l7olkyH6l;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public View Bhmn1KIah;
    public boolean CBQ5d1kRq;
    public boolean Eeka1udhb;
    public Drawable MzoOEjc4X;
    public View PSTqBLTET;
    public int RG6kpfv3v;
    public boolean dXrmkklc8;
    public Drawable ilHKhw3Yw;
    public View kmSgne1rO;
    public Drawable qVUwofr5s;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TiJy6t0au tiJy6t0au = new TiJy6t0au(this);
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        VCCyeOu6I.ilHKhw3Yw(this, tiJy6t0au);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZolH67hOx.q3BipwRCk);
        boolean z = false;
        this.MzoOEjc4X = obtainStyledAttributes.getDrawable(0);
        this.ilHKhw3Yw = obtainStyledAttributes.getDrawable(2);
        this.RG6kpfv3v = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.Eeka1udhb = true;
            this.qVUwofr5s = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.Eeka1udhb ? this.MzoOEjc4X == null && this.ilHKhw3Yw == null : this.qVUwofr5s == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    public final boolean J4Ux7ym32(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.MzoOEjc4X;
        if (drawable != null && drawable.isStateful()) {
            this.MzoOEjc4X.setState(getDrawableState());
        }
        Drawable drawable2 = this.ilHKhw3Yw;
        if (drawable2 != null && drawable2.isStateful()) {
            this.ilHKhw3Yw.setState(getDrawableState());
        }
        Drawable drawable3 = this.qVUwofr5s;
        if (drawable3 != null && drawable3.isStateful()) {
            this.qVUwofr5s.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.kmSgne1rO;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.MzoOEjc4X;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.ilHKhw3Yw;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.qVUwofr5s;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.Bhmn1KIah = findViewById(R.id.action_bar);
        this.PSTqBLTET = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.CBQ5d1kRq || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.View, android.view.ViewGroup
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        View view2 = this.kmSgne1rO;
        boolean z2 = true;
        z2 = false;
        boolean z3 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (!(view2 == null || view2.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin;
            view2.layout(i, (measuredHeight - view2.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.Eeka1udhb) {
            Drawable drawable3 = this.qVUwofr5s;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        } else {
            if (this.MzoOEjc4X != null) {
                if (this.Bhmn1KIah.getVisibility() == 0) {
                    drawable2 = this.MzoOEjc4X;
                    left = this.Bhmn1KIah.getLeft();
                    top = this.Bhmn1KIah.getTop();
                    right = this.Bhmn1KIah.getRight();
                    view = this.Bhmn1KIah;
                } else {
                    View view3 = this.PSTqBLTET;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.MzoOEjc4X.setBounds(0, 0, 0, 0);
                        z2 = true;
                    } else {
                        drawable2 = this.MzoOEjc4X;
                        left = this.PSTqBLTET.getLeft();
                        top = this.PSTqBLTET.getTop();
                        right = this.PSTqBLTET.getRight();
                        view = this.PSTqBLTET;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z2 = true;
            }
            this.dXrmkklc8 = z3;
            if (z3 && (drawable = this.ilHKhw3Yw) != null) {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onMeasure(int i, int i2) {
        int i3;
        View view;
        int i4;
        if (this.Bhmn1KIah == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i4 = this.RG6kpfv3v) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.Bhmn1KIah != null) {
            int mode = View.MeasureSpec.getMode(i2);
            View view2 = this.kmSgne1rO;
            if (view2 != null && view2.getVisibility() != 8 && mode != 1073741824) {
                if (!J4Ux7ym32(this.Bhmn1KIah)) {
                    view = this.Bhmn1KIah;
                } else if (!J4Ux7ym32(this.PSTqBLTET)) {
                    view = this.PSTqBLTET;
                } else {
                    i3 = 0;
                    setMeasuredDimension(getMeasuredWidth(), Math.min(q3BipwRCk(this.kmSgne1rO) + i3, mode != Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
                }
                i3 = q3BipwRCk(view);
                setMeasuredDimension(getMeasuredWidth(), Math.min(q3BipwRCk(this.kmSgne1rO) + i3, mode != Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final int q3BipwRCk(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.MzoOEjc4X;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.MzoOEjc4X);
        }
        this.MzoOEjc4X = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.Bhmn1KIah;
            if (view != null) {
                this.MzoOEjc4X.setBounds(view.getLeft(), this.Bhmn1KIah.getTop(), this.Bhmn1KIah.getRight(), this.Bhmn1KIah.getBottom());
            }
        }
        boolean z = true;
        z = false;
        if (!this.Eeka1udhb ? !(this.MzoOEjc4X == null && this.ilHKhw3Yw == null) : this.qVUwofr5s != null) {
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.qVUwofr5s;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.qVUwofr5s);
        }
        this.qVUwofr5s = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.Eeka1udhb && (drawable2 = this.qVUwofr5s) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        z = true;
        if (!this.Eeka1udhb ? this.MzoOEjc4X == null && this.ilHKhw3Yw == null : this.qVUwofr5s == null) {
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.ilHKhw3Yw;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.ilHKhw3Yw);
        }
        this.ilHKhw3Yw = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.dXrmkklc8 && (drawable2 = this.ilHKhw3Yw) != null) {
                drawable2.setBounds(this.kmSgne1rO.getLeft(), this.kmSgne1rO.getTop(), this.kmSgne1rO.getRight(), this.kmSgne1rO.getBottom());
            }
        }
        boolean z = true;
        z = false;
        if (!this.Eeka1udhb ? !(this.MzoOEjc4X == null && this.ilHKhw3Yw == null) : this.qVUwofr5s != null) {
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(l7olkyH6l l7olkyh6l) {
        View view = this.kmSgne1rO;
        if (view != null) {
            removeView(view);
        }
        this.kmSgne1rO = l7olkyh6l;
    }

    public void setTransitioning(boolean z) {
        this.CBQ5d1kRq = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.MzoOEjc4X;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.ilHKhw3Yw;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.qVUwofr5s;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewParent, android.view.ViewGroup
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.MzoOEjc4X && !this.Eeka1udhb) || (drawable == this.ilHKhw3Yw && this.dXrmkklc8) || ((drawable == this.qVUwofr5s && this.Eeka1udhb) || super.verifyDrawable(drawable));
    }
}
