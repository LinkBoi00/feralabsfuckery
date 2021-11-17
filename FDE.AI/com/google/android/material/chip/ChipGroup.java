package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.feravolt.preload.R;
import con.BjLVS9hW2;
import con.IqwHQ6O2l;
import con.IuQbWntsc;
import con.RBJDIwG1D;
import con.RisoK3egD;
import con.VCCyeOu6I;
import con.ba8VhBGaI;
import con.hF1hMObUZ;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class ChipGroup extends BjLVS9hW2 {
    public boolean Eeka1udhb;
    public int MzoOEjc4X;
    public qhPEQQaQ4 dXrmkklc8;
    public int ilHKhw3Yw;
    public boolean qVUwofr5s;
    public int sk5s77z6Q;
    public final mhl5lIdbQ RG6kpfv3v = new mhl5lIdbQ(null);
    public s7MlVynBG ixWaw2akD = new s7MlVynBG(null);
    public boolean WaUP0CF08 = false;

    /* loaded from: classes.dex */
    public static class aXI58Y1kr extends ViewGroup.MarginLayoutParams {
        public aXI58Y1kr(int i, int i2) {
            super(i, i2);
        }

        public aXI58Y1kr(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public aXI58Y1kr(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* loaded from: classes.dex */
    public class mhl5lIdbQ implements CompoundButton.OnCheckedChangeListener {
        public mhl5lIdbQ(RG2GI7LDp rG2GI7LDp) {
            ChipGroup.this = r1;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ChipGroup chipGroup = ChipGroup.this;
            if (!chipGroup.WaUP0CF08) {
                if (chipGroup.getCheckedChipIds().isEmpty()) {
                    ChipGroup chipGroup2 = ChipGroup.this;
                    if (chipGroup2.Eeka1udhb) {
                        chipGroup2.tGV7Q6urW(compoundButton.getId(), true);
                        ChipGroup.this.sk5s77z6Q = compoundButton.getId();
                        return;
                    }
                }
                int id = compoundButton.getId();
                if (z) {
                    ChipGroup chipGroup3 = ChipGroup.this;
                    int i = chipGroup3.sk5s77z6Q;
                    if (!(i == -1 || i == id || !chipGroup3.qVUwofr5s)) {
                        chipGroup3.tGV7Q6urW(i, false);
                    }
                    ChipGroup.this.setCheckedId(id);
                    return;
                }
                ChipGroup chipGroup4 = ChipGroup.this;
                if (chipGroup4.sk5s77z6Q == id) {
                    chipGroup4.setCheckedId(-1);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface qhPEQQaQ4 {
        void q3BipwRCk(ChipGroup chipGroup, int i);
    }

    /* loaded from: classes.dex */
    public class s7MlVynBG implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroup.OnHierarchyChangeListener q3BipwRCk;

        public s7MlVynBG(RG2GI7LDp rG2GI7LDp) {
            ChipGroup.this = r1;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                    view2.setId(RBJDIwG1D.q3BipwRCk());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).J4Ux7ym32(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(ChipGroup.this.RG6kpfv3v);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.q3BipwRCk;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.q3BipwRCk;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(ba8VhBGaI.q3BipwRCk(context, attributeSet, R.attr.chipGroupStyle, 2131821534), attributeSet, R.attr.chipGroupStyle);
        this.sk5s77z6Q = -1;
        TypedArray dIocxURUo = hF1hMObUZ.dIocxURUo(getContext(), attributeSet, RisoK3egD.tGV7Q6urW, R.attr.chipGroupStyle, 2131821534, new int[0]);
        int dimensionPixelOffset = dIocxURUo.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(dIocxURUo.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(dIocxURUo.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(dIocxURUo.getBoolean(5, false));
        setSingleSelection(dIocxURUo.getBoolean(6, false));
        setSelectionRequired(dIocxURUo.getBoolean(4, false));
        int resourceId = dIocxURUo.getResourceId(0, -1);
        if (resourceId != -1) {
            this.sk5s77z6Q = resourceId;
        }
        dIocxURUo.recycle();
        super.setOnHierarchyChangeListener(this.ixWaw2akD);
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        VCCyeOu6I.Eeka1udhb(this, 1);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    public void setCheckedId(int i) {
        this.sk5s77z6Q = i;
        qhPEQQaQ4 qhpeqqaq4 = this.dXrmkklc8;
        if (qhpeqqaq4 != null && this.qVUwofr5s) {
            qhpeqqaq4.q3BipwRCk(this, i);
        }
    }

    public void J4Ux7ym32(int i) {
        int i2 = this.sk5s77z6Q;
        if (i != i2) {
            if (i2 != -1 && this.qVUwofr5s) {
                tGV7Q6urW(i2, false);
            }
            if (i != -1) {
                tGV7Q6urW(i, true);
            }
            setCheckedId(i);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.sk5s77z6Q;
                if (i2 != -1 && this.qVUwofr5s) {
                    tGV7Q6urW(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof aXI58Y1kr);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new aXI58Y1kr(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new aXI58Y1kr(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new aXI58Y1kr(layoutParams);
    }

    public int getCheckedChipId() {
        if (this.qVUwofr5s) {
            return this.sk5s77z6Q;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.qVUwofr5s) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.MzoOEjc4X;
    }

    public int getChipSpacingVertical() {
        return this.ilHKhw3Yw;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.sk5s77z6Q;
        if (i != -1) {
            tGV7Q6urW(i, true);
            setCheckedId(this.sk5s77z6Q);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) IqwHQ6O2l.mhl5lIdbQ.q3BipwRCk(getRowCount(), this.Bhmn1KIah ? getChipCount() : -1, false, this.qVUwofr5s ? 1 : 2).q3BipwRCk);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.MzoOEjc4X != i) {
            this.MzoOEjc4X = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.ilHKhw3Yw != i) {
            this.ilHKhw3Yw = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(qhPEQQaQ4 qhpeqqaq4) {
        this.dXrmkklc8 = qhpeqqaq4;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.ixWaw2akD.q3BipwRCk = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.Eeka1udhb = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    @Override // con.BjLVS9hW2
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.qVUwofr5s != z) {
            this.qVUwofr5s = z;
            this.WaUP0CF08 = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.WaUP0CF08 = false;
            setCheckedId(-1);
        }
    }

    public final void tGV7Q6urW(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.WaUP0CF08 = true;
            ((Chip) findViewById).setChecked(z);
            this.WaUP0CF08 = false;
        }
    }
}
