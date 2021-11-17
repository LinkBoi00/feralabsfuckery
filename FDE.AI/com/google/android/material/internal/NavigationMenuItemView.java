package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.mhl5lIdbQ;
import androidx.appcompat.widget.RG2GI7LDp;
import com.feravolt.preload.R;
import con.IqwHQ6O2l;
import con.IuQbWntsc;
import con.K95C08eIr;
import con.VCCyeOu6I;
import con.XflkRyC2J;
import con.tDC1iJlG1;
import con.zBz8mZEjY;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class NavigationMenuItemView extends zBz8mZEjY implements mhl5lIdbQ.RG2GI7LDp {
    public static final int[] TyB1UUd72 = {16842912};
    public int AqaWJg0b4;
    public final XflkRyC2J EBQXiIPmm;
    public boolean NyWTwPF6V;
    public boolean QNqj6nIzv;
    public ColorStateList V9LQMKGJe;
    public FrameLayout i0Zug1mVk;
    public Drawable igRQEZxnW;
    public boolean mUqPm6GBh;
    public tDC1iJlG1 o4LF8RkoQ;
    public final CheckedTextView vNtjxmzUM;

    /* loaded from: classes.dex */
    public class RG2GI7LDp extends XflkRyC2J {
        public RG2GI7LDp() {
        }

        @Override // con.XflkRyC2J
        public void dIocxURUo(View view, IqwHQ6O2l iqwHQ6O2l) {
            this.q3BipwRCk.onInitializeAccessibilityNodeInfo(view, iqwHQ6O2l.q3BipwRCk);
            iqwHQ6O2l.q3BipwRCk.setCheckable(NavigationMenuItemView.this.NyWTwPF6V);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        RG2GI7LDp rG2GI7LDp = new RG2GI7LDp();
        this.EBQXiIPmm = rG2GI7LDp;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.vNtjxmzUM = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        IuQbWntsc.MzoOEjc4X(checkedTextView, rG2GI7LDp);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.i0Zug1mVk == null) {
                this.i0Zug1mVk = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.i0Zug1mVk.removeAllViews();
            this.i0Zug1mVk.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.mhl5lIdbQ.RG2GI7LDp
    public tDC1iJlG1 getItemData() {
        return this.o4LF8RkoQ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        tDC1iJlG1 tdc1ijlg1 = this.o4LF8RkoQ;
        if (tdc1ijlg1 != null && tdc1ijlg1.isCheckable() && this.o4LF8RkoQ.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, TyB1UUd72);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.NyWTwPF6V != z) {
            this.NyWTwPF6V = z;
            this.EBQXiIPmm.Puu3Rhg4F(this.vNtjxmzUM, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.vNtjxmzUM.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.QNqj6nIzv) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.V9LQMKGJe);
            }
            int i = this.AqaWJg0b4;
            drawable.setBounds(0, 0, i, i);
        } else if (this.mUqPm6GBh) {
            if (this.igRQEZxnW == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = K95C08eIr.q3BipwRCk;
                Drawable drawable2 = resources.getDrawable(R.drawable.navigation_empty_icon, theme);
                this.igRQEZxnW = drawable2;
                if (drawable2 != null) {
                    int i2 = this.AqaWJg0b4;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.igRQEZxnW;
        }
        this.vNtjxmzUM.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.vNtjxmzUM.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.AqaWJg0b4 = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.V9LQMKGJe = colorStateList;
        this.QNqj6nIzv = colorStateList != null;
        tDC1iJlG1 tdc1ijlg1 = this.o4LF8RkoQ;
        if (tdc1ijlg1 != null) {
            setIcon(tdc1ijlg1.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.vNtjxmzUM.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.mUqPm6GBh = z;
    }

    public void setTextAppearance(int i) {
        this.vNtjxmzUM.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.vNtjxmzUM.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.vNtjxmzUM.setText(charSequence);
    }

    @Override // androidx.appcompat.view.menu.mhl5lIdbQ.RG2GI7LDp
    public void tGV7Q6urW(tDC1iJlG1 tdc1ijlg1, int i) {
        int i2;
        RG2GI7LDp.C0002RG2GI7LDp rG2GI7LDp;
        StateListDrawable stateListDrawable;
        this.o4LF8RkoQ = tdc1ijlg1;
        int i3 = tdc1ijlg1.q3BipwRCk;
        if (i3 > 0) {
            setId(i3);
        }
        setVisibility(tdc1ijlg1.isVisible() ? 0 : 8);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(TyB1UUd72, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            VCCyeOu6I.ilHKhw3Yw(this, stateListDrawable);
        }
        setCheckable(tdc1ijlg1.isCheckable());
        setChecked(tdc1ijlg1.isChecked());
        setEnabled(tdc1ijlg1.isEnabled());
        setTitle(tdc1ijlg1.kCA6Zs9sL);
        setIcon(tdc1ijlg1.getIcon());
        setActionView(tdc1ijlg1.getActionView());
        setContentDescription(tdc1ijlg1.ilHKhw3Yw);
        setTooltipText(tdc1ijlg1.qVUwofr5s);
        tDC1iJlG1 tdc1ijlg12 = this.o4LF8RkoQ;
        if (!(tdc1ijlg12.kCA6Zs9sL == null && tdc1ijlg12.getIcon() == null && this.o4LF8RkoQ.getActionView() != null)) {
            z = false;
        }
        if (z) {
            this.vNtjxmzUM.setVisibility(8);
            FrameLayout frameLayout = this.i0Zug1mVk;
            if (frameLayout != null) {
                rG2GI7LDp = (RG2GI7LDp.C0002RG2GI7LDp) frameLayout.getLayoutParams();
                i2 = -1;
            } else {
                return;
            }
        } else {
            this.vNtjxmzUM.setVisibility(0);
            FrameLayout frameLayout2 = this.i0Zug1mVk;
            if (frameLayout2 != null) {
                rG2GI7LDp = (RG2GI7LDp.C0002RG2GI7LDp) frameLayout2.getLayoutParams();
                i2 = -2;
            } else {
                return;
            }
        }
        ((LinearLayout.LayoutParams) rG2GI7LDp).width = i2;
        this.i0Zug1mVk.setLayoutParams(rG2GI7LDp);
    }
}
