package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.feravolt.preload.R;
import con.C8A1BseZU;
import con.IuQbWntsc;
import con.TeoeEf1aF;
import con.VCCyeOu6I;
import con.ZolH67hOx;
import con.aXI58Y1kr;
import con.pOLFExxoD;
import con.qyCamnJnJ;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class ActionBarContextView extends aXI58Y1kr {
    public boolean CpG0imbht;
    public int IytU16YUK;
    public CharSequence RG6kpfv3v;
    public View WaUP0CF08;
    public int cAwN510t2;
    public CharSequence dXrmkklc8;
    public TextView dfpT1j18n;
    public LinearLayout i8XZMQc6Z;
    public TextView iMyQMM6Qj;
    public View ixWaw2akD;
    public int qFBXIgpia;
    public View sk5s77z6Q;

    /* loaded from: classes.dex */
    public class RG2GI7LDp implements View.OnClickListener {
        public final /* synthetic */ pOLFExxoD CBQ5d1kRq;

        public RG2GI7LDp(ActionBarContextView actionBarContextView, pOLFExxoD polfexxod) {
            this.CBQ5d1kRq = polfexxod;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.CBQ5d1kRq.tGV7Q6urW();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZolH67hOx.dIocxURUo, R.attr.actionModeStyle, 0);
        Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : C8A1BseZU.q3BipwRCk(context, resourceId);
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        VCCyeOu6I.ilHKhw3Yw(this, drawable);
        this.cAwN510t2 = obtainStyledAttributes.getResourceId(5, 0);
        this.IytU16YUK = obtainStyledAttributes.getResourceId(4, 0);
        this.MzoOEjc4X = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.qFBXIgpia = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public final void GPLPRo6go() {
        if (this.i8XZMQc6Z == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.i8XZMQc6Z = linearLayout;
            this.dfpT1j18n = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.iMyQMM6Qj = (TextView) this.i8XZMQc6Z.findViewById(R.id.action_bar_subtitle);
            if (this.cAwN510t2 != 0) {
                this.dfpT1j18n.setTextAppearance(getContext(), this.cAwN510t2);
            }
            if (this.IytU16YUK != 0) {
                this.iMyQMM6Qj.setTextAppearance(getContext(), this.IytU16YUK);
            }
        }
        this.dfpT1j18n.setText(this.dXrmkklc8);
        this.iMyQMM6Qj.setText(this.RG6kpfv3v);
        boolean z = !TextUtils.isEmpty(this.dXrmkklc8);
        boolean z2 = !TextUtils.isEmpty(this.RG6kpfv3v);
        int i = 0;
        this.iMyQMM6Qj.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.i8XZMQc6Z;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.i8XZMQc6Z.getParent() == null) {
            addView(this.i8XZMQc6Z);
        }
    }

    public void Puu3Rhg4F() {
        removeAllViews();
        this.WaUP0CF08 = null;
        this.Bhmn1KIah = null;
        this.PSTqBLTET = null;
        View view = this.sk5s77z6Q;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.ilHKhw3Yw != null ? this.CBQ5d1kRq.J4Ux7ym32 : getVisibility();
    }

    public int getContentHeight() {
        return this.MzoOEjc4X;
    }

    public CharSequence getSubtitle() {
        return this.RG6kpfv3v;
    }

    public CharSequence getTitle() {
        return this.dXrmkklc8;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void iiGwOFFnr(con.pOLFExxoD r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.ixWaw2akD
            r1 = 0
            if (r0 != 0) goto L_0x0016
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r6.qFBXIgpia
            android.view.View r0 = r0.inflate(r2, r6, r1)
            r6.ixWaw2akD = r0
            goto L_0x001e
        L_0x0016:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0021
            android.view.View r0 = r6.ixWaw2akD
        L_0x001e:
            r6.addView(r0)
        L_0x0021:
            android.view.View r0 = r6.ixWaw2akD
            r2 = 2131296322(0x7f090042, float:1.8210557E38)
            android.view.View r0 = r0.findViewById(r2)
            r6.sk5s77z6Q = r0
            androidx.appcompat.widget.ActionBarContextView$RG2GI7LDp r2 = new androidx.appcompat.widget.ActionBarContextView$RG2GI7LDp
            r2.<init>(r6, r7)
            r0.setOnClickListener(r2)
            android.view.Menu r7 = r7.kCA6Zs9sL()
            androidx.appcompat.view.menu.RG2GI7LDp r7 = (androidx.appcompat.view.menu.RG2GI7LDp) r7
            con.TeoeEf1aF r0 = r6.PSTqBLTET
            if (r0 == 0) goto L_0x0041
            r0.J4Ux7ym32()
        L_0x0041:
            con.TeoeEf1aF r0 = new con.TeoeEf1aF
            android.content.Context r2 = r6.getContext()
            r0.<init>(r2)
            r6.PSTqBLTET = r0
            r2 = 1
            r0.sk5s77z6Q = r2
            r0.WaUP0CF08 = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r3 = -2
            r4 = -1
            r0.<init>(r3, r4)
            con.TeoeEf1aF r3 = r6.PSTqBLTET
            android.content.Context r4 = r6.kmSgne1rO
            r7.J4Ux7ym32(r3, r4)
            con.TeoeEf1aF r7 = r6.PSTqBLTET
            androidx.appcompat.view.menu.mhl5lIdbQ r3 = r7.Eeka1udhb
            if (r3 != 0) goto L_0x0079
            android.view.LayoutInflater r4 = r7.PSTqBLTET
            int r5 = r7.ilHKhw3Yw
            android.view.View r1 = r4.inflate(r5, r6, r1)
            androidx.appcompat.view.menu.mhl5lIdbQ r1 = (androidx.appcompat.view.menu.mhl5lIdbQ) r1
            r7.Eeka1udhb = r1
            androidx.appcompat.view.menu.RG2GI7LDp r4 = r7.Bhmn1KIah
            r1.q3BipwRCk(r4)
            r7.oon79WMrY(r2)
        L_0x0079:
            androidx.appcompat.view.menu.mhl5lIdbQ r1 = r7.Eeka1udhb
            if (r3 == r1) goto L_0x0083
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r7)
        L_0x0083:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r6.Bhmn1KIah = r1
            r7 = 0
            java.util.WeakHashMap r2 = con.IuQbWntsc.q3BipwRCk
            con.VCCyeOu6I.ilHKhw3Yw(r1, r7)
            androidx.appcompat.widget.ActionMenuView r7 = r6.Bhmn1KIah
            r6.addView(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.iiGwOFFnr(con.pOLFExxoD):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        TeoeEf1aF teoeEf1aF = this.PSTqBLTET;
        if (teoeEf1aF != null) {
            teoeEf1aF.vPSbyrYWX();
            this.PSTqBLTET.CBQ5d1kRq();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.dXrmkklc8);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean J4Ux7ym32 = qyCamnJnJ.J4Ux7ym32(this);
        int paddingRight = J4Ux7ym32 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.ixWaw2akD;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.ixWaw2akD.getLayoutParams();
            int i5 = J4Ux7ym32 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = J4Ux7ym32 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = J4Ux7ym32 ? paddingRight - i5 : paddingRight + i5;
            int dIocxURUo = i7 + dIocxURUo(this.ixWaw2akD, i7, paddingTop, paddingTop2, J4Ux7ym32);
            paddingRight = J4Ux7ym32 ? dIocxURUo - i6 : dIocxURUo + i6;
        }
        LinearLayout linearLayout = this.i8XZMQc6Z;
        if (!(linearLayout == null || this.WaUP0CF08 != null || linearLayout.getVisibility() == 8)) {
            paddingRight += dIocxURUo(this.i8XZMQc6Z, paddingRight, paddingTop, paddingTop2, J4Ux7ym32);
        }
        View view2 = this.WaUP0CF08;
        if (view2 != null) {
            dIocxURUo(view2, paddingRight, paddingTop, paddingTop2, J4Ux7ym32);
        }
        int paddingLeft = J4Ux7ym32 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.Bhmn1KIah;
        if (actionMenuView != null) {
            dIocxURUo(actionMenuView, paddingLeft, paddingTop, paddingTop2, !J4Ux7ym32);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = 1073741824;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) != 0) {
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.MzoOEjc4X;
            if (i4 <= 0) {
                i4 = View.MeasureSpec.getSize(i2);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i5 = i4 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
            View view = this.ixWaw2akD;
            if (view != null) {
                int tGV7Q6urW = tGV7Q6urW(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.ixWaw2akD.getLayoutParams();
                paddingLeft = tGV7Q6urW - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.Bhmn1KIah;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = tGV7Q6urW(this.Bhmn1KIah, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.i8XZMQc6Z;
            if (linearLayout != null && this.WaUP0CF08 == null) {
                if (this.CpG0imbht) {
                    this.i8XZMQc6Z.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.i8XZMQc6Z.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.i8XZMQc6Z.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = tGV7Q6urW(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.WaUP0CF08;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i6 = layoutParams.width;
                int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i6 >= 0) {
                    paddingLeft = Math.min(i6, paddingLeft);
                }
                int i8 = layoutParams.height;
                if (i8 == -2) {
                    i3 = Integer.MIN_VALUE;
                }
                if (i8 >= 0) {
                    i5 = Math.min(i8, i5);
                }
                this.WaUP0CF08.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(i5, i3));
            }
            if (this.MzoOEjc4X <= 0) {
                int childCount = getChildCount();
                i4 = 0;
                for (int i9 = 0; i9 < childCount; i9++) {
                    int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i4) {
                        i4 = measuredHeight;
                    }
                }
            }
            setMeasuredDimension(size, i4);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    @Override // con.aXI58Y1kr
    public void setContentHeight(int i) {
        this.MzoOEjc4X = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.WaUP0CF08;
        if (view2 != null) {
            removeView(view2);
        }
        this.WaUP0CF08 = view;
        if (!(view == null || (linearLayout = this.i8XZMQc6Z) == null)) {
            removeView(linearLayout);
            this.i8XZMQc6Z = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.RG6kpfv3v = charSequence;
        GPLPRo6go();
    }

    public void setTitle(CharSequence charSequence) {
        this.dXrmkklc8 = charSequence;
        GPLPRo6go();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.CpG0imbht) {
            requestLayout();
        }
        this.CpG0imbht = z;
    }

    @Override // con.aXI58Y1kr, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
