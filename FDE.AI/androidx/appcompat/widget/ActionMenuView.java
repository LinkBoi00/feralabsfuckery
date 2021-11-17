package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.RG2GI7LDp;
import androidx.appcompat.widget.RG2GI7LDp;
import androidx.appcompat.widget.Toolbar;
import con.HelDswbLq;
import con.TeoeEf1aF;
import con.qyCamnJnJ;
import con.tDC1iJlG1;
import con.wTUTXyz5r;
/* loaded from: classes.dex */
public class ActionMenuView extends RG2GI7LDp implements RG2GI7LDp.mhl5lIdbQ, androidx.appcompat.view.menu.mhl5lIdbQ {
    public RG2GI7LDp.AbstractC0001RG2GI7LDp AqaWJg0b4;
    public boolean CpG0imbht;
    public int IytU16YUK = 0;
    public int NyWTwPF6V;
    public Context cAwN510t2;
    public int i0Zug1mVk;
    public androidx.appcompat.view.menu.RG2GI7LDp iMyQMM6Qj;
    public boolean mUqPm6GBh;
    public HelDswbLq.RG2GI7LDp nlGCs0NZs;
    public s7MlVynBG o4LF8RkoQ;
    public TeoeEf1aF qFBXIgpia;
    public int vNtjxmzUM;

    /* loaded from: classes.dex */
    public interface RG2GI7LDp {
        boolean J4Ux7ym32();

        boolean q3BipwRCk();
    }

    /* loaded from: classes.dex */
    public static class aXI58Y1kr extends RG2GI7LDp.C0002RG2GI7LDp {
        @ViewDebug.ExportedProperty
        public int J4Ux7ym32;
        @ViewDebug.ExportedProperty
        public boolean dIocxURUo;
        public boolean iiGwOFFnr;
        @ViewDebug.ExportedProperty
        public boolean kCA6Zs9sL;
        @ViewDebug.ExportedProperty
        public boolean q3BipwRCk;
        @ViewDebug.ExportedProperty
        public int tGV7Q6urW;

        public aXI58Y1kr(int i, int i2) {
            super(i, i2);
            this.q3BipwRCk = false;
        }

        public aXI58Y1kr(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public aXI58Y1kr(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public aXI58Y1kr(aXI58Y1kr axi58y1kr) {
            super(axi58y1kr);
            this.q3BipwRCk = axi58y1kr.q3BipwRCk;
        }
    }

    /* loaded from: classes.dex */
    public static class mhl5lIdbQ implements HelDswbLq.RG2GI7LDp {
        @Override // con.HelDswbLq.RG2GI7LDp
        public boolean Bhmn1KIah(androidx.appcompat.view.menu.RG2GI7LDp rG2GI7LDp) {
            return false;
        }

        @Override // con.HelDswbLq.RG2GI7LDp
        public void q3BipwRCk(androidx.appcompat.view.menu.RG2GI7LDp rG2GI7LDp, boolean z) {
        }
    }

    /* loaded from: classes.dex */
    public class qhPEQQaQ4 implements RG2GI7LDp.AbstractC0001RG2GI7LDp {
        public qhPEQQaQ4() {
            ActionMenuView.this = r1;
        }

        @Override // androidx.appcompat.view.menu.RG2GI7LDp.AbstractC0001RG2GI7LDp
        public void J4Ux7ym32(androidx.appcompat.view.menu.RG2GI7LDp rG2GI7LDp) {
            RG2GI7LDp.AbstractC0001RG2GI7LDp rG2GI7LDp2 = ActionMenuView.this.AqaWJg0b4;
            if (rG2GI7LDp2 != null) {
                rG2GI7LDp2.J4Ux7ym32(rG2GI7LDp);
            }
        }

        @Override // androidx.appcompat.view.menu.RG2GI7LDp.AbstractC0001RG2GI7LDp
        public boolean q3BipwRCk(androidx.appcompat.view.menu.RG2GI7LDp rG2GI7LDp, MenuItem menuItem) {
            s7MlVynBG s7mlvynbg = ActionMenuView.this.o4LF8RkoQ;
            if (s7mlvynbg == null) {
                return false;
            }
            Toolbar.dNif5KqqH dnif5kqqh = Toolbar.this.juJ6pnCpu;
            return dnif5kqqh != null ? dnif5kqqh.onMenuItemClick(menuItem) : false;
        }
    }

    /* loaded from: classes.dex */
    public interface s7MlVynBG {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.vNtjxmzUM = (int) (56.0f * f);
        this.i0Zug1mVk = (int) (f * 4.0f);
        this.cAwN510t2 = context;
    }

    public static int PSTqBLTET(View view, int i, int i2, int i3, int i4) {
        aXI58Y1kr axi58y1kr = (aXI58Y1kr) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = false;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.kCA6Zs9sL();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (!axi58y1kr.q3BipwRCk && z2) {
            z = true;
        }
        axi58y1kr.dIocxURUo = z;
        axi58y1kr.J4Ux7ym32 = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    public boolean Bhmn1KIah(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof RG2GI7LDp)) {
            z = false | ((RG2GI7LDp) childAt).q3BipwRCk();
        }
        return (i <= 0 || !(childAt2 instanceof RG2GI7LDp)) ? z : z | ((RG2GI7LDp) childAt2).J4Ux7ym32();
    }

    /* renamed from: CBQ5d1kRq */
    public aXI58Y1kr generateDefaultLayoutParams() {
        aXI58Y1kr axi58y1kr = new aXI58Y1kr(-2, -2);
        ((LinearLayout.LayoutParams) axi58y1kr).gravity = 16;
        return axi58y1kr;
    }

    @Override // androidx.appcompat.view.menu.RG2GI7LDp.mhl5lIdbQ
    public boolean J4Ux7ym32(tDC1iJlG1 tdc1ijlg1) {
        return this.iMyQMM6Qj.qVUwofr5s(tdc1ijlg1, null, 0);
    }

    @Override // androidx.appcompat.widget.RG2GI7LDp, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof aXI58Y1kr;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.RG2GI7LDp, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new aXI58Y1kr(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.iMyQMM6Qj == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.RG2GI7LDp rG2GI7LDp = new androidx.appcompat.view.menu.RG2GI7LDp(context);
            this.iMyQMM6Qj = rG2GI7LDp;
            rG2GI7LDp.kCA6Zs9sL = new qhPEQQaQ4();
            TeoeEf1aF teoeEf1aF = new TeoeEf1aF(context);
            this.qFBXIgpia = teoeEf1aF;
            teoeEf1aF.sk5s77z6Q = true;
            teoeEf1aF.WaUP0CF08 = true;
            HelDswbLq.RG2GI7LDp rG2GI7LDp2 = this.nlGCs0NZs;
            if (rG2GI7LDp2 == null) {
                rG2GI7LDp2 = new mhl5lIdbQ();
            }
            teoeEf1aF.MzoOEjc4X = rG2GI7LDp2;
            this.iMyQMM6Qj.J4Ux7ym32(teoeEf1aF, this.cAwN510t2);
            TeoeEf1aF teoeEf1aF2 = this.qFBXIgpia;
            teoeEf1aF2.Eeka1udhb = this;
            this.iMyQMM6Qj = teoeEf1aF2.Bhmn1KIah;
        }
        return this.iMyQMM6Qj;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        TeoeEf1aF teoeEf1aF = this.qFBXIgpia;
        wTUTXyz5r wtutxyz5r = teoeEf1aF.dXrmkklc8;
        if (wtutxyz5r != null) {
            return wtutxyz5r.getDrawable();
        }
        if (teoeEf1aF.ixWaw2akD) {
            return teoeEf1aF.RG6kpfv3v;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.IytU16YUK;
    }

    public int getWindowAnimations() {
        return 0;
    }

    /* renamed from: kmSgne1rO */
    public aXI58Y1kr oon79WMrY(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        aXI58Y1kr axi58y1kr = layoutParams instanceof aXI58Y1kr ? new aXI58Y1kr((aXI58Y1kr) layoutParams) : new aXI58Y1kr(layoutParams);
        if (((LinearLayout.LayoutParams) axi58y1kr).gravity <= 0) {
            ((LinearLayout.LayoutParams) axi58y1kr).gravity = 16;
        }
        return axi58y1kr;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TeoeEf1aF teoeEf1aF = this.qFBXIgpia;
        if (teoeEf1aF != null) {
            teoeEf1aF.oon79WMrY(false);
            if (this.qFBXIgpia.kmSgne1rO()) {
                this.qFBXIgpia.vPSbyrYWX();
                this.qFBXIgpia.Bhmn1KIah();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        TeoeEf1aF teoeEf1aF = this.qFBXIgpia;
        if (teoeEf1aF != null) {
            teoeEf1aF.J4Ux7ym32();
        }
    }

    @Override // androidx.appcompat.widget.RG2GI7LDp, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (!this.mUqPm6GBh) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i7 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean J4Ux7ym32 = qyCamnJnJ.J4Ux7ym32(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                aXI58Y1kr axi58y1kr = (aXI58Y1kr) childAt.getLayoutParams();
                if (axi58y1kr.q3BipwRCk) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (Bhmn1KIah(i11)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (J4Ux7ym32) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) axi58y1kr).leftMargin;
                        i6 = i5 + measuredWidth;
                    } else {
                        i6 = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) axi58y1kr).rightMargin;
                        i5 = i6 - measuredWidth;
                    }
                    int i12 = i7 - (measuredHeight / 2);
                    childAt.layout(i5, i12, i6, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) axi58y1kr).leftMargin) + ((LinearLayout.LayoutParams) axi58y1kr).rightMargin;
                    Bhmn1KIah(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1 && i9 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i13 = (i8 / 2) - (measuredWidth2 / 2);
            int i14 = i7 - (measuredHeight2 / 2);
            childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
            return;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (J4Ux7ym32) {
            int width = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                aXI58Y1kr axi58y1kr2 = (aXI58Y1kr) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !axi58y1kr2.q3BipwRCk) {
                    int i17 = width - ((LinearLayout.LayoutParams) axi58y1kr2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i7 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width = i17 - ((measuredWidth3 + ((LinearLayout.LayoutParams) axi58y1kr2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            aXI58Y1kr axi58y1kr3 = (aXI58Y1kr) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !axi58y1kr3.q3BipwRCk) {
                int i20 = paddingLeft + ((LinearLayout.LayoutParams) axi58y1kr3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i7 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) axi58y1kr3).rightMargin + max + i20;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // androidx.appcompat.widget.RG2GI7LDp, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onMeasure(int r30, int r31) {
        /*
        // Method dump skipped, instructions count: 685
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.onMeasure(int, int):void");
    }

    @Override // androidx.appcompat.view.menu.mhl5lIdbQ
    public void q3BipwRCk(androidx.appcompat.view.menu.RG2GI7LDp rG2GI7LDp) {
        this.iMyQMM6Qj = rG2GI7LDp;
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.qFBXIgpia.cAwN510t2 = z;
    }

    public void setOnMenuItemClickListener(s7MlVynBG s7mlvynbg) {
        this.o4LF8RkoQ = s7mlvynbg;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        TeoeEf1aF teoeEf1aF = this.qFBXIgpia;
        wTUTXyz5r wtutxyz5r = teoeEf1aF.dXrmkklc8;
        if (wtutxyz5r != null) {
            wtutxyz5r.setImageDrawable(drawable);
            return;
        }
        teoeEf1aF.ixWaw2akD = true;
        teoeEf1aF.RG6kpfv3v = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.CpG0imbht = z;
    }

    public void setPopupTheme(int i) {
        if (this.IytU16YUK != i) {
            this.IytU16YUK = i;
            if (i == 0) {
                this.cAwN510t2 = getContext();
            } else {
                this.cAwN510t2 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(TeoeEf1aF teoeEf1aF) {
        this.qFBXIgpia = teoeEf1aF;
        teoeEf1aF.Eeka1udhb = this;
        this.iMyQMM6Qj = teoeEf1aF.Bhmn1KIah;
    }

    @Override // androidx.appcompat.widget.RG2GI7LDp
    public RG2GI7LDp.C0002RG2GI7LDp yWvV4ePLl(AttributeSet attributeSet) {
        return new aXI58Y1kr(getContext(), attributeSet);
    }
}
