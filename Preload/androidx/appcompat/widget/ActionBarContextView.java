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
import androidx.appcompat.view.menu.mhl5lIdbQ;
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
    public void iiGwOFFnr(pOLFExxoD polfexxod) {
        TeoeEf1aF teoeEf1aF;
        mhl5lIdbQ mhl5lidbq;
        mhl5lIdbQ mhl5lidbq2;
        View view;
        View view2 = this.ixWaw2akD;
        if (view2 == null) {
            view = LayoutInflater.from(getContext()).inflate(this.qFBXIgpia, (ViewGroup) this, false);
            this.ixWaw2akD = view;
        } else {
            if (view2.getParent() == null) {
                view = this.ixWaw2akD;
            }
            View findViewById = this.ixWaw2akD.findViewById(R.id.action_mode_close_button);
            this.sk5s77z6Q = findViewById;
            findViewById.setOnClickListener(new RG2GI7LDp(this, polfexxod));
            androidx.appcompat.view.menu.RG2GI7LDp rG2GI7LDp = (androidx.appcompat.view.menu.RG2GI7LDp) polfexxod.kCA6Zs9sL();
            teoeEf1aF = this.PSTqBLTET;
            if (teoeEf1aF != null) {
                teoeEf1aF.J4Ux7ym32();
            }
            TeoeEf1aF teoeEf1aF2 = new TeoeEf1aF(getContext());
            this.PSTqBLTET = teoeEf1aF2;
            teoeEf1aF2.sk5s77z6Q = true;
            teoeEf1aF2.WaUP0CF08 = true;
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
            rG2GI7LDp.J4Ux7ym32(this.PSTqBLTET, this.kmSgne1rO);
            TeoeEf1aF teoeEf1aF3 = this.PSTqBLTET;
            mhl5lidbq = teoeEf1aF3.Eeka1udhb;
            if (mhl5lidbq == null) {
                mhl5lIdbQ mhl5lidbq3 = (mhl5lIdbQ) teoeEf1aF3.PSTqBLTET.inflate(teoeEf1aF3.ilHKhw3Yw, (ViewGroup) this, false);
                teoeEf1aF3.Eeka1udhb = mhl5lidbq3;
                mhl5lidbq3.q3BipwRCk(teoeEf1aF3.Bhmn1KIah);
                teoeEf1aF3.oon79WMrY(true);
            }
            mhl5lidbq2 = teoeEf1aF3.Eeka1udhb;
            if (mhl5lidbq != mhl5lidbq2) {
                ((ActionMenuView) mhl5lidbq2).setPresenter(teoeEf1aF3);
            }
            ActionMenuView actionMenuView = (ActionMenuView) mhl5lidbq2;
            this.Bhmn1KIah = actionMenuView;
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            VCCyeOu6I.ilHKhw3Yw(actionMenuView, null);
            addView(this.Bhmn1KIah, layoutParams);
        }
        addView(view);
        View findViewById2 = this.ixWaw2akD.findViewById(R.id.action_mode_close_button);
        this.sk5s77z6Q = findViewById2;
        findViewById2.setOnClickListener(new RG2GI7LDp(this, polfexxod));
        androidx.appcompat.view.menu.RG2GI7LDp rG2GI7LDp2 = (androidx.appcompat.view.menu.RG2GI7LDp) polfexxod.kCA6Zs9sL();
        teoeEf1aF = this.PSTqBLTET;
        if (teoeEf1aF != null) {
        }
        TeoeEf1aF teoeEf1aF22 = new TeoeEf1aF(getContext());
        this.PSTqBLTET = teoeEf1aF22;
        teoeEf1aF22.sk5s77z6Q = true;
        teoeEf1aF22.WaUP0CF08 = true;
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -1);
        rG2GI7LDp2.J4Ux7ym32(this.PSTqBLTET, this.kmSgne1rO);
        TeoeEf1aF teoeEf1aF32 = this.PSTqBLTET;
        mhl5lidbq = teoeEf1aF32.Eeka1udhb;
        if (mhl5lidbq == null) {
        }
        mhl5lidbq2 = teoeEf1aF32.Eeka1udhb;
        if (mhl5lidbq != mhl5lidbq2) {
        }
        ActionMenuView actionMenuView2 = (ActionMenuView) mhl5lidbq2;
        this.Bhmn1KIah = actionMenuView2;
        WeakHashMap weakHashMap2 = IuQbWntsc.q3BipwRCk;
        VCCyeOu6I.ilHKhw3Yw(actionMenuView2, null);
        addView(this.Bhmn1KIah, layoutParams2);
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
