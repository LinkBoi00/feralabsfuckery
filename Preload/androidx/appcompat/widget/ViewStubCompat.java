package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import con.ZolH67hOx;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {
    public WeakReference Bhmn1KIah;
    public int CBQ5d1kRq;
    public RG2GI7LDp MzoOEjc4X;
    public LayoutInflater PSTqBLTET;
    public int kmSgne1rO;

    /* loaded from: classes.dex */
    public interface RG2GI7LDp {
        void q3BipwRCk(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.CBQ5d1kRq = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZolH67hOx.iMyQMM6Qj, 0, 0);
        this.kmSgne1rO = obtainStyledAttributes.getResourceId(2, -1);
        this.CBQ5d1kRq = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.kmSgne1rO;
    }

    public LayoutInflater getLayoutInflater() {
        return this.PSTqBLTET;
    }

    public int getLayoutResource() {
        return this.CBQ5d1kRq;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public View q3BipwRCk() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.CBQ5d1kRq != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.PSTqBLTET;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.CBQ5d1kRq, viewGroup, false);
            int i = this.kmSgne1rO;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.Bhmn1KIah = new WeakReference(inflate);
            RG2GI7LDp rG2GI7LDp = this.MzoOEjc4X;
            if (rG2GI7LDp != null) {
                rG2GI7LDp.q3BipwRCk(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public void setInflatedId(int i) {
        this.kmSgne1rO = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.PSTqBLTET = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.CBQ5d1kRq = i;
    }

    public void setOnInflateListener(RG2GI7LDp rG2GI7LDp) {
        this.MzoOEjc4X = rG2GI7LDp;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        WeakReference weakReference = this.Bhmn1KIah;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            q3BipwRCk();
        }
    }
}
