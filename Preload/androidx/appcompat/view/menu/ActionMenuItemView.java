package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.RG2GI7LDp;
import androidx.appcompat.view.menu.mhl5lIdbQ;
import androidx.appcompat.widget.ActionMenuView;
import con.JU5oYK2sJ;
import con.VM5RseTzg;
import con.ZolH67hOx;
import con.fub3l8zfX;
import con.qs7k2SwdW;
import con.qt4vMCOja;
import con.tDC1iJlG1;
/* loaded from: classes.dex */
public class ActionMenuItemView extends qs7k2SwdW implements mhl5lIdbQ.RG2GI7LDp, View.OnClickListener, ActionMenuView.RG2GI7LDp {
    public Drawable Eeka1udhb;
    public qt4vMCOja RG6kpfv3v;
    public boolean WaUP0CF08;
    public RG2GI7LDp.mhl5lIdbQ dXrmkklc8;
    public int i8XZMQc6Z;
    public int iMyQMM6Qj;
    public tDC1iJlG1 ilHKhw3Yw;
    public mhl5lIdbQ ixWaw2akD;
    public CharSequence qVUwofr5s;
    public boolean sk5s77z6Q = iiGwOFFnr();
    public int dfpT1j18n = -1;

    /* loaded from: classes.dex */
    public class RG2GI7LDp extends qt4vMCOja {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RG2GI7LDp() {
            super(r1);
            ActionMenuItemView.this = r1;
        }

        @Override // con.qt4vMCOja
        public JU5oYK2sJ J4Ux7ym32() {
            fub3l8zfX fub3l8zfx;
            mhl5lIdbQ mhl5lidbq = ActionMenuItemView.this.ixWaw2akD;
            if (mhl5lidbq == null || (fub3l8zfx = ((VM5RseTzg) mhl5lidbq).q3BipwRCk.qFBXIgpia) == null) {
                return null;
            }
            return fub3l8zfx.q3BipwRCk();
        }

        @Override // con.qt4vMCOja
        public boolean tGV7Q6urW() {
            JU5oYK2sJ J4Ux7ym32;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            RG2GI7LDp.mhl5lIdbQ mhl5lidbq = actionMenuItemView.dXrmkklc8;
            return mhl5lidbq != null && mhl5lidbq.J4Ux7ym32(actionMenuItemView.ilHKhw3Yw) && (J4Ux7ym32 = J4Ux7ym32()) != null && J4Ux7ym32.J4Ux7ym32();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class mhl5lIdbQ {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZolH67hOx.tGV7Q6urW, 0, 0);
        this.i8XZMQc6Z = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.iMyQMM6Qj = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        setSaveEnabled(false);
    }

    public final void GPLPRo6go() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.qVUwofr5s);
        if (this.Eeka1udhb != null) {
            if (!((this.ilHKhw3Yw.i8XZMQc6Z & 4) == 4) || (!this.sk5s77z6Q && !this.WaUP0CF08)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        CharSequence charSequence = null;
        setText(z3 ? this.qVUwofr5s : null);
        CharSequence charSequence2 = this.ilHKhw3Yw.ilHKhw3Yw;
        if (TextUtils.isEmpty(charSequence2)) {
            if (z3) {
                charSequence2 = null;
            } else {
                charSequence2 = this.ilHKhw3Yw.kCA6Zs9sL;
            }
        }
        setContentDescription(charSequence2);
        CharSequence charSequence3 = this.ilHKhw3Yw.qVUwofr5s;
        if (TextUtils.isEmpty(charSequence3)) {
            if (!z3) {
                charSequence = this.ilHKhw3Yw.kCA6Zs9sL;
            }
            setTooltipText(charSequence);
            return;
        }
        setTooltipText(charSequence3);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.RG2GI7LDp
    public boolean J4Ux7ym32() {
        return kCA6Zs9sL() && this.ilHKhw3Yw.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.mhl5lIdbQ.RG2GI7LDp
    public tDC1iJlG1 getItemData() {
        return this.ilHKhw3Yw;
    }

    public final boolean iiGwOFFnr() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public boolean kCA6Zs9sL() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        RG2GI7LDp.mhl5lIdbQ mhl5lidbq = this.dXrmkklc8;
        if (mhl5lidbq != null) {
            mhl5lidbq.J4Ux7ym32(this.ilHKhw3Yw);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.sk5s77z6Q = iiGwOFFnr();
        GPLPRo6go();
    }

    @Override // con.qs7k2SwdW, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean kCA6Zs9sL = kCA6Zs9sL();
        if (kCA6Zs9sL && (i3 = this.dfpT1j18n) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.i8XZMQc6Z) : this.i8XZMQc6Z;
        if (mode != 1073741824 && this.i8XZMQc6Z > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!kCA6Zs9sL && this.Eeka1udhb != null) {
            super.setPadding((getMeasuredWidth() - this.Eeka1udhb.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        qt4vMCOja qt4vmcoja;
        if (!this.ilHKhw3Yw.hasSubMenu() || (qt4vmcoja = this.RG6kpfv3v) == null || !qt4vmcoja.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.RG2GI7LDp
    public boolean q3BipwRCk() {
        return kCA6Zs9sL();
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.WaUP0CF08 != z) {
            this.WaUP0CF08 = z;
            tDC1iJlG1 tdc1ijlg1 = this.ilHKhw3Yw;
            if (tdc1ijlg1 != null) {
                RG2GI7LDp rG2GI7LDp = tdc1ijlg1.Bhmn1KIah;
                rG2GI7LDp.vPSbyrYWX = true;
                rG2GI7LDp.MzoOEjc4X(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.Eeka1udhb = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.iMyQMM6Qj;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i) / ((float) intrinsicWidth)));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i) / ((float) intrinsicHeight)));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        GPLPRo6go();
    }

    public void setItemInvoker(RG2GI7LDp.mhl5lIdbQ mhl5lidbq) {
        this.dXrmkklc8 = mhl5lidbq;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.dfpT1j18n = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(mhl5lIdbQ mhl5lidbq) {
        this.ixWaw2akD = mhl5lidbq;
    }

    public void setTitle(CharSequence charSequence) {
        this.qVUwofr5s = charSequence;
        GPLPRo6go();
    }

    @Override // androidx.appcompat.view.menu.mhl5lIdbQ.RG2GI7LDp
    public void tGV7Q6urW(tDC1iJlG1 tdc1ijlg1, int i) {
        this.ilHKhw3Yw = tdc1ijlg1;
        setIcon(tdc1ijlg1.getIcon());
        setTitle(tdc1ijlg1.getTitleCondensed());
        setId(tdc1ijlg1.q3BipwRCk);
        setVisibility(tdc1ijlg1.isVisible() ? 0 : 8);
        setEnabled(tdc1ijlg1.isEnabled());
        if (tdc1ijlg1.hasSubMenu() && this.RG6kpfv3v == null) {
            this.RG6kpfv3v = new RG2GI7LDp();
        }
    }
}
