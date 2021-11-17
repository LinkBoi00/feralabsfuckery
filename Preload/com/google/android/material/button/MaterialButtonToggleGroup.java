package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.feravolt.preload.R;
import com.google.android.material.button.MaterialButton;
import con.BR8wFu8f7;
import con.IqwHQ6O2l;
import con.IuQbWntsc;
import con.RBJDIwG1D;
import con.RisoK3egD;
import con.VCCyeOu6I;
import con.XflkRyC2J;
import con.ba8VhBGaI;
import con.hF1hMObUZ;
import con.uyyOxpvGH;
import con.xT3tobMV0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final /* synthetic */ int ixWaw2akD;
    public boolean Eeka1udhb;
    public int RG6kpfv3v;
    public boolean dXrmkklc8;
    public Integer[] ilHKhw3Yw;
    public final List CBQ5d1kRq = new ArrayList();
    public final aXI58Y1kr kmSgne1rO = new aXI58Y1kr(null);
    public final dNif5KqqH Bhmn1KIah = new dNif5KqqH(null);
    public final LinkedHashSet PSTqBLTET = new LinkedHashSet();
    public final Comparator MzoOEjc4X = new RG2GI7LDp();
    public boolean qVUwofr5s = false;

    /* loaded from: classes.dex */
    public class RG2GI7LDp implements Comparator<MaterialButton> {
        public RG2GI7LDp() {
            MaterialButtonToggleGroup.this = r1;
        }

        @Override // java.util.Comparator
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int compareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton3)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton4)));
        }
    }

    /* loaded from: classes.dex */
    public class aXI58Y1kr implements MaterialButton.RG2GI7LDp {
        public aXI58Y1kr(RG2GI7LDp rG2GI7LDp) {
            MaterialButtonToggleGroup.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public class dNif5KqqH implements MaterialButton.mhl5lIdbQ {
        public dNif5KqqH(RG2GI7LDp rG2GI7LDp) {
            MaterialButtonToggleGroup.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public class mhl5lIdbQ extends XflkRyC2J {
        public mhl5lIdbQ() {
            MaterialButtonToggleGroup.this = r1;
        }

        @Override // con.XflkRyC2J
        public void dIocxURUo(View view, IqwHQ6O2l iqwHQ6O2l) {
            this.q3BipwRCk.onInitializeAccessibilityNodeInfo(view, iqwHQ6O2l.q3BipwRCk);
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            int i = MaterialButtonToggleGroup.ixWaw2akD;
            Objects.requireNonNull(materialButtonToggleGroup);
            int i2 = -1;
            if (view instanceof MaterialButton) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= materialButtonToggleGroup.getChildCount()) {
                        break;
                    } else if (materialButtonToggleGroup.getChildAt(i3) == view) {
                        i2 = i4;
                        break;
                    } else {
                        if ((materialButtonToggleGroup.getChildAt(i3) instanceof MaterialButton) && materialButtonToggleGroup.dIocxURUo(i3)) {
                            i4++;
                        }
                        i3++;
                    }
                }
            }
            iqwHQ6O2l.PSTqBLTET(IqwHQ6O2l.aXI58Y1kr.q3BipwRCk(0, 1, i2, 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* loaded from: classes.dex */
    public static class qhPEQQaQ4 {
        public static final BR8wFu8f7 kCA6Zs9sL = new con.dNif5KqqH(0.0f);
        public BR8wFu8f7 J4Ux7ym32;
        public BR8wFu8f7 dIocxURUo;
        public BR8wFu8f7 q3BipwRCk;
        public BR8wFu8f7 tGV7Q6urW;

        public qhPEQQaQ4(BR8wFu8f7 bR8wFu8f7, BR8wFu8f7 bR8wFu8f72, BR8wFu8f7 bR8wFu8f73, BR8wFu8f7 bR8wFu8f74) {
            this.q3BipwRCk = bR8wFu8f7;
            this.J4Ux7ym32 = bR8wFu8f73;
            this.tGV7Q6urW = bR8wFu8f74;
            this.dIocxURUo = bR8wFu8f72;
        }
    }

    /* loaded from: classes.dex */
    public interface s7MlVynBG {
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(ba8VhBGaI.q3BipwRCk(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2131821548), attributeSet, R.attr.materialButtonToggleGroupStyle);
        TypedArray dIocxURUo = hF1hMObUZ.dIocxURUo(getContext(), attributeSet, RisoK3egD.kmSgne1rO, R.attr.materialButtonToggleGroupStyle, 2131821548, new int[0]);
        setSingleSelection(dIocxURUo.getBoolean(2, false));
        this.RG6kpfv3v = dIocxURUo.getResourceId(0, -1);
        this.dXrmkklc8 = dIocxURUo.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        dIocxURUo.recycle();
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        VCCyeOu6I.Eeka1udhb(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (dIocxURUo(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (dIocxURUo(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && dIocxURUo(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setCheckedId(int i) {
        this.RG6kpfv3v = i;
        J4Ux7ym32(i, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            materialButton.setId(RBJDIwG1D.q3BipwRCk());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.PSTqBLTET.add(this.kmSgne1rO);
        materialButton.setOnPressedChangeListenerInternal(this.Bhmn1KIah);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public void GPLPRo6go() {
        qhPEQQaQ4 qhpeqqaq4;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton tGV7Q6urW = tGV7Q6urW(i);
            if (tGV7Q6urW.getVisibility() != 8) {
                xT3tobMV0 shapeAppearanceModel = tGV7Q6urW.getShapeAppearanceModel();
                Objects.requireNonNull(shapeAppearanceModel);
                xT3tobMV0.RG2GI7LDp rG2GI7LDp = new xT3tobMV0.RG2GI7LDp(shapeAppearanceModel);
                qhPEQQaQ4 qhpeqqaq42 = (qhPEQQaQ4) this.CBQ5d1kRq.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    if (i == firstVisibleChildIndex) {
                        if (!z) {
                            BR8wFu8f7 bR8wFu8f7 = qhpeqqaq42.q3BipwRCk;
                            BR8wFu8f7 bR8wFu8f72 = qhPEQQaQ4.kCA6Zs9sL;
                            qhpeqqaq4 = new qhPEQQaQ4(bR8wFu8f7, bR8wFu8f72, qhpeqqaq42.J4Ux7ym32, bR8wFu8f72);
                        } else if (uyyOxpvGH.q3BipwRCk(this)) {
                            BR8wFu8f7 bR8wFu8f73 = qhPEQQaQ4.kCA6Zs9sL;
                            qhpeqqaq4 = new qhPEQQaQ4(bR8wFu8f73, bR8wFu8f73, qhpeqqaq42.J4Ux7ym32, qhpeqqaq42.tGV7Q6urW);
                        } else {
                            BR8wFu8f7 bR8wFu8f74 = qhpeqqaq42.q3BipwRCk;
                            BR8wFu8f7 bR8wFu8f75 = qhpeqqaq42.dIocxURUo;
                            BR8wFu8f7 bR8wFu8f76 = qhPEQQaQ4.kCA6Zs9sL;
                            qhpeqqaq4 = new qhPEQQaQ4(bR8wFu8f74, bR8wFu8f75, bR8wFu8f76, bR8wFu8f76);
                        }
                    } else if (i != lastVisibleChildIndex) {
                        qhpeqqaq42 = null;
                    } else if (!z) {
                        BR8wFu8f7 bR8wFu8f77 = qhPEQQaQ4.kCA6Zs9sL;
                        qhpeqqaq4 = new qhPEQQaQ4(bR8wFu8f77, qhpeqqaq42.dIocxURUo, bR8wFu8f77, qhpeqqaq42.tGV7Q6urW);
                    } else if (uyyOxpvGH.q3BipwRCk(this)) {
                        BR8wFu8f7 bR8wFu8f78 = qhpeqqaq42.q3BipwRCk;
                        BR8wFu8f7 bR8wFu8f79 = qhpeqqaq42.dIocxURUo;
                        BR8wFu8f7 bR8wFu8f710 = qhPEQQaQ4.kCA6Zs9sL;
                        qhpeqqaq4 = new qhPEQQaQ4(bR8wFu8f78, bR8wFu8f79, bR8wFu8f710, bR8wFu8f710);
                    } else {
                        BR8wFu8f7 bR8wFu8f711 = qhPEQQaQ4.kCA6Zs9sL;
                        qhpeqqaq4 = new qhPEQQaQ4(bR8wFu8f711, bR8wFu8f711, qhpeqqaq42.J4Ux7ym32, qhpeqqaq42.tGV7Q6urW);
                    }
                    qhpeqqaq42 = qhpeqqaq4;
                }
                if (qhpeqqaq42 == null) {
                    rG2GI7LDp.tGV7Q6urW(0.0f);
                } else {
                    rG2GI7LDp.kCA6Zs9sL = qhpeqqaq42.q3BipwRCk;
                    rG2GI7LDp.Puu3Rhg4F = qhpeqqaq42.dIocxURUo;
                    rG2GI7LDp.iiGwOFFnr = qhpeqqaq42.J4Ux7ym32;
                    rG2GI7LDp.GPLPRo6go = qhpeqqaq42.tGV7Q6urW;
                }
                tGV7Q6urW.setShapeAppearanceModel(rG2GI7LDp.q3BipwRCk());
            }
        }
    }

    public final void J4Ux7ym32(int i, boolean z) {
        Iterator it = this.PSTqBLTET.iterator();
        while (it.hasNext()) {
            ((com.google.android.material.timepicker.aXI58Y1kr) ((s7MlVynBG) it.next())).q3BipwRCk(this, i, z);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            iiGwOFFnr(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        xT3tobMV0 shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.CBQ5d1kRq.add(new qhPEQQaQ4(shapeAppearanceModel.kCA6Zs9sL, shapeAppearanceModel.Puu3Rhg4F, shapeAppearanceModel.iiGwOFFnr, shapeAppearanceModel.GPLPRo6go));
        IuQbWntsc.MzoOEjc4X(materialButton, new mhl5lIdbQ());
    }

    public final boolean dIocxURUo(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.MzoOEjc4X);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(tGV7Q6urW(i), Integer.valueOf(i));
        }
        this.ilHKhw3Yw = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View, android.view.ViewGroup
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.Eeka1udhb) {
            return this.RG6kpfv3v;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton tGV7Q6urW = tGV7Q6urW(i);
            if (tGV7Q6urW.isChecked()) {
                arrayList.add(Integer.valueOf(tGV7Q6urW.getId()));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.ilHKhw3Yw;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MaterialButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    public final boolean iiGwOFFnr(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (!this.dXrmkklc8 || !checkedButtonIds.isEmpty()) {
            if (z && this.Eeka1udhb) {
                checkedButtonIds.remove(Integer.valueOf(i));
                for (Integer num : checkedButtonIds) {
                    int intValue = num.intValue();
                    kCA6Zs9sL(intValue, false);
                    J4Ux7ym32(intValue, false);
                }
            }
            return true;
        }
        kCA6Zs9sL(i, true);
        this.RG6kpfv3v = i;
        return false;
    }

    public final void kCA6Zs9sL(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.qVUwofr5s = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.qVUwofr5s = false;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        MaterialButton materialButton;
        super.onFinishInflate();
        int i = this.RG6kpfv3v;
        if (i != -1 && (materialButton = (MaterialButton) findViewById(i)) != null) {
            materialButton.setChecked(true);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) IqwHQ6O2l.mhl5lIdbQ.q3BipwRCk(1, getVisibleButtonCount(), false, this.Eeka1udhb ? 1 : 2).q3BipwRCk);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        GPLPRo6go();
        q3BipwRCk();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.PSTqBLTET.remove(this.kmSgne1rO);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.CBQ5d1kRq.remove(indexOfChild);
        }
        GPLPRo6go();
        q3BipwRCk();
    }

    public final void q3BipwRCk() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton tGV7Q6urW = tGV7Q6urW(i);
                int min = Math.min(tGV7Q6urW.getStrokeWidth(), tGV7Q6urW(i - 1).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams = tGV7Q6urW.getLayoutParams();
                LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
                if (getOrientation() == 0) {
                    layoutParams2.setMarginEnd(0);
                    layoutParams2.setMarginStart(-min);
                    layoutParams2.topMargin = 0;
                } else {
                    layoutParams2.bottomMargin = 0;
                    layoutParams2.topMargin = -min;
                    layoutParams2.setMarginStart(0);
                }
                tGV7Q6urW.setLayoutParams(layoutParams2);
            }
            if (!(getChildCount() == 0 || firstVisibleChildIndex == -1)) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                    return;
                }
                layoutParams3.setMarginEnd(0);
                layoutParams3.setMarginStart(0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    public void setSelectionRequired(boolean z) {
        this.dXrmkklc8 = z;
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    public void setSingleSelection(boolean z) {
        if (this.Eeka1udhb != z) {
            this.Eeka1udhb = z;
            this.qVUwofr5s = true;
            for (int i = 0; i < getChildCount(); i++) {
                MaterialButton tGV7Q6urW = tGV7Q6urW(i);
                tGV7Q6urW.setChecked(false);
                J4Ux7ym32(tGV7Q6urW.getId(), false);
            }
            this.qVUwofr5s = false;
            setCheckedId(-1);
        }
    }

    public final MaterialButton tGV7Q6urW(int i) {
        return (MaterialButton) getChildAt(i);
    }
}
