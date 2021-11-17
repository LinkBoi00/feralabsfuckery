package con;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.RG2GI7LDp;
/* loaded from: classes.dex */
public abstract class zBz8mZEjY extends RG2GI7LDp {
    public int CpG0imbht;
    public Drawable iMyQMM6Qj;
    public boolean qFBXIgpia;
    public final Rect cAwN510t2 = new Rect();
    public final Rect IytU16YUK = new Rect();
    public boolean nlGCs0NZs = false;

    public zBz8mZEjY(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.CpG0imbht = 119;
        this.qFBXIgpia = true;
        int[] iArr = RisoK3egD.yWvV4ePLl;
        hF1hMObUZ.q3BipwRCk(context, attributeSet, i, 0);
        hF1hMObUZ.J4Ux7ym32(context, attributeSet, iArr, i, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        this.CpG0imbht = obtainStyledAttributes.getInt(1, this.CpG0imbht);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.qFBXIgpia = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.iMyQMM6Qj;
        if (drawable != null) {
            if (this.nlGCs0NZs) {
                this.nlGCs0NZs = false;
                Rect rect = this.cAwN510t2;
                Rect rect2 = this.IytU16YUK;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.qFBXIgpia) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.CpG0imbht, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.iMyQMM6Qj;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.iMyQMM6Qj;
        if (drawable != null && drawable.isStateful()) {
            this.iMyQMM6Qj.setState(getDrawableState());
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.iMyQMM6Qj;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.CpG0imbht;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.iMyQMM6Qj;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.RG2GI7LDp, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.nlGCs0NZs = z | this.nlGCs0NZs;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.nlGCs0NZs = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.iMyQMM6Qj;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.iMyQMM6Qj);
            }
            this.iMyQMM6Qj = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.CpG0imbht == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.CpG0imbht != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.CpG0imbht = i;
            if (i == 119 && this.iMyQMM6Qj != null) {
                this.iMyQMM6Qj.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.iMyQMM6Qj;
    }
}
