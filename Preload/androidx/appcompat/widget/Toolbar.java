package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import com.feravolt.preload.R;
import con.C8A1BseZU;
import con.GsWcrrhpK;
import con.HelDswbLq;
import con.IuQbWntsc;
import con.KMt2sB4vK;
import con.PQnXPgcS3;
import con.RBJDIwG1D;
import con.TeoeEf1aF;
import con.VCCyeOu6I;
import con.ZolH67hOx;
import con.anclinfG8;
import con.j6XJY7rz4;
import con.jJtQlby2Y;
import con.jSmvdSgdz;
import con.qs7k2SwdW;
import con.qyCamnJnJ;
import con.qya5U7BN8;
import con.tDC1iJlG1;
import con.tNtRtnI5N;
import con.yrZre3UbR;
import con.zhWsuDChl;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public int AqaWJg0b4;
    public TextView Bhmn1KIah;
    public ActionMenuView CBQ5d1kRq;
    public int CpG0imbht;
    public final ArrayList EBQXiIPmm;
    public ImageButton Eeka1udhb;
    public int IytU16YUK;
    public TeoeEf1aF L4EwGfXiQ;
    public ImageView MzoOEjc4X;
    public CharSequence NyWTwPF6V;
    public ImageButton PSTqBLTET;
    public boolean QNqj6nIzv;
    public qya5U7BN8 QSbMsHU5X;
    public Context RG6kpfv3v;
    public final int[] TyB1UUd72;
    public boolean V9LQMKGJe;
    public int WaUP0CF08;
    public int cAwN510t2;
    public View dXrmkklc8;
    public int dfpT1j18n;
    public ColorStateList i0Zug1mVk;
    public int i8XZMQc6Z;
    public int iMyQMM6Qj;
    public final ArrayList igRQEZxnW;
    public Drawable ilHKhw3Yw;
    public int ixWaw2akD;
    public final ActionMenuView.s7MlVynBG j22ftfeNI;
    public dNif5KqqH juJ6pnCpu;
    public TextView kmSgne1rO;
    public int mUqPm6GBh;
    public int nlGCs0NZs;
    public ColorStateList o4LF8RkoQ;
    public yrZre3UbR qFBXIgpia;
    public CharSequence qVUwofr5s;
    public int sk5s77z6Q;
    public CharSequence vNtjxmzUM;
    public final Runnable wIZEdYHUn;
    public qhPEQQaQ4 zHl31GGXU;
    public boolean ziwPzaoF3;

    /* loaded from: classes.dex */
    public class RG2GI7LDp implements ActionMenuView.s7MlVynBG {
        public RG2GI7LDp() {
            Toolbar.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public static class WfopS3efW extends con.s7MlVynBG {
        public static final Parcelable.Creator<WfopS3efW> CREATOR = new jSmvdSgdz(0);
        public int Bhmn1KIah;
        public boolean PSTqBLTET;

        public WfopS3efW(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Bhmn1KIah = parcel.readInt();
            this.PSTqBLTET = parcel.readInt() != 0;
        }

        public WfopS3efW(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // con.s7MlVynBG, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.CBQ5d1kRq, i);
            parcel.writeInt(this.Bhmn1KIah);
            parcel.writeInt(this.PSTqBLTET ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public class aXI58Y1kr implements View.OnClickListener {
        public aXI58Y1kr() {
            Toolbar.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            qhPEQQaQ4 qhpeqqaq4 = Toolbar.this.zHl31GGXU;
            tDC1iJlG1 tdc1ijlg1 = qhpeqqaq4 == null ? null : qhpeqqaq4.kmSgne1rO;
            if (tdc1ijlg1 != null) {
                tdc1ijlg1.collapseActionView();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface dNif5KqqH {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public class mhl5lIdbQ implements Runnable {
        public mhl5lIdbQ() {
            Toolbar.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.RG6kpfv3v();
        }
    }

    /* loaded from: classes.dex */
    public class qhPEQQaQ4 implements HelDswbLq {
        public androidx.appcompat.view.menu.RG2GI7LDp CBQ5d1kRq;
        public tDC1iJlG1 kmSgne1rO;

        public qhPEQQaQ4() {
            Toolbar.this = r1;
        }

        @Override // con.HelDswbLq
        public void dIocxURUo(Context context, androidx.appcompat.view.menu.RG2GI7LDp rG2GI7LDp) {
            tDC1iJlG1 tdc1ijlg1;
            androidx.appcompat.view.menu.RG2GI7LDp rG2GI7LDp2 = this.CBQ5d1kRq;
            if (!(rG2GI7LDp2 == null || (tdc1ijlg1 = this.kmSgne1rO) == null)) {
                rG2GI7LDp2.dIocxURUo(tdc1ijlg1);
            }
            this.CBQ5d1kRq = rG2GI7LDp;
        }

        @Override // con.HelDswbLq
        public boolean iiGwOFFnr(androidx.appcompat.view.menu.RG2GI7LDp rG2GI7LDp, tDC1iJlG1 tdc1ijlg1) {
            Toolbar.this.tGV7Q6urW();
            ViewParent parent = Toolbar.this.Eeka1udhb.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.Eeka1udhb);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.Eeka1udhb);
            }
            Toolbar.this.dXrmkklc8 = tdc1ijlg1.getActionView();
            this.kmSgne1rO = tdc1ijlg1;
            ViewParent parent2 = Toolbar.this.dXrmkklc8.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.dXrmkklc8);
                }
                s7MlVynBG Puu3Rhg4F = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                Puu3Rhg4F.q3BipwRCk = 8388611 | (toolbar4.i8XZMQc6Z & 112);
                Puu3Rhg4F.J4Ux7ym32 = 2;
                toolbar4.dXrmkklc8.setLayoutParams(Puu3Rhg4F);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.dXrmkklc8);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (!(((s7MlVynBG) childAt.getLayoutParams()).J4Ux7ym32 == 2 || childAt == toolbar6.CBQ5d1kRq)) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.EBQXiIPmm.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            tdc1ijlg1.IytU16YUK = true;
            tdc1ijlg1.Bhmn1KIah.MzoOEjc4X(false);
            View view = Toolbar.this.dXrmkklc8;
            if (view instanceof GsWcrrhpK) {
                ((GsWcrrhpK) view).dIocxURUo();
            }
            return true;
        }

        @Override // con.HelDswbLq
        public boolean kCA6Zs9sL(anclinfG8 anclinfg8) {
            return false;
        }

        @Override // con.HelDswbLq
        public void oon79WMrY(boolean z) {
            if (this.kmSgne1rO != null) {
                androidx.appcompat.view.menu.RG2GI7LDp rG2GI7LDp = this.CBQ5d1kRq;
                boolean z2 = false;
                if (rG2GI7LDp != null) {
                    int size = rG2GI7LDp.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.CBQ5d1kRq.getItem(i) == this.kmSgne1rO) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    yWvV4ePLl(this.CBQ5d1kRq, this.kmSgne1rO);
                }
            }
        }

        @Override // con.HelDswbLq
        public void q3BipwRCk(androidx.appcompat.view.menu.RG2GI7LDp rG2GI7LDp, boolean z) {
        }

        @Override // con.HelDswbLq
        public boolean tGV7Q6urW() {
            return false;
        }

        @Override // con.HelDswbLq
        public boolean yWvV4ePLl(androidx.appcompat.view.menu.RG2GI7LDp rG2GI7LDp, tDC1iJlG1 tdc1ijlg1) {
            View view = Toolbar.this.dXrmkklc8;
            if (view instanceof GsWcrrhpK) {
                ((GsWcrrhpK) view).kCA6Zs9sL();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.dXrmkklc8);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.Eeka1udhb);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.dXrmkklc8 = null;
            int size = toolbar3.EBQXiIPmm.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar3.addView((View) toolbar3.EBQXiIPmm.get(size));
                } else {
                    toolbar3.EBQXiIPmm.clear();
                    this.kmSgne1rO = null;
                    Toolbar.this.requestLayout();
                    tdc1ijlg1.IytU16YUK = false;
                    tdc1ijlg1.Bhmn1KIah.MzoOEjc4X(false);
                    return true;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class s7MlVynBG extends zhWsuDChl.RG2GI7LDp {
        public int J4Ux7ym32;

        public s7MlVynBG(int i, int i2) {
            super(i, i2);
            this.J4Ux7ym32 = 0;
            this.q3BipwRCk = 8388627;
        }

        public s7MlVynBG(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.J4Ux7ym32 = 0;
        }

        public s7MlVynBG(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.J4Ux7ym32 = 0;
        }

        public s7MlVynBG(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.J4Ux7ym32 = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public s7MlVynBG(s7MlVynBG s7mlvynbg) {
            super((zhWsuDChl.RG2GI7LDp) s7mlvynbg);
            this.J4Ux7ym32 = 0;
            this.J4Ux7ym32 = s7mlvynbg.J4Ux7ym32;
        }

        public s7MlVynBG(zhWsuDChl.RG2GI7LDp rG2GI7LDp) {
            super(rG2GI7LDp);
            this.J4Ux7ym32 = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mUqPm6GBh = 8388627;
        this.igRQEZxnW = new ArrayList();
        this.EBQXiIPmm = new ArrayList();
        this.TyB1UUd72 = new int[2];
        this.j22ftfeNI = new RG2GI7LDp();
        this.wIZEdYHUn = new mhl5lIdbQ();
        Context context2 = getContext();
        int[] iArr = ZolH67hOx.WaUP0CF08;
        j6XJY7rz4 mUqPm6GBh = j6XJY7rz4.mUqPm6GBh(context2, attributeSet, iArr, i, 0);
        IuQbWntsc.PSTqBLTET(this, context, iArr, attributeSet, (TypedArray) mUqPm6GBh.Bhmn1KIah, i, 0);
        this.sk5s77z6Q = mUqPm6GBh.iMyQMM6Qj(28, 0);
        this.WaUP0CF08 = mUqPm6GBh.iMyQMM6Qj(19, 0);
        this.mUqPm6GBh = ((TypedArray) mUqPm6GBh.Bhmn1KIah).getInteger(0, this.mUqPm6GBh);
        this.i8XZMQc6Z = ((TypedArray) mUqPm6GBh.Bhmn1KIah).getInteger(2, 48);
        int qVUwofr5s = mUqPm6GBh.qVUwofr5s(22, 0);
        qVUwofr5s = mUqPm6GBh.CpG0imbht(27) ? mUqPm6GBh.qVUwofr5s(27, qVUwofr5s) : qVUwofr5s;
        this.CpG0imbht = qVUwofr5s;
        this.IytU16YUK = qVUwofr5s;
        this.cAwN510t2 = qVUwofr5s;
        this.iMyQMM6Qj = qVUwofr5s;
        int qVUwofr5s2 = mUqPm6GBh.qVUwofr5s(25, -1);
        if (qVUwofr5s2 >= 0) {
            this.iMyQMM6Qj = qVUwofr5s2;
        }
        int qVUwofr5s3 = mUqPm6GBh.qVUwofr5s(24, -1);
        if (qVUwofr5s3 >= 0) {
            this.cAwN510t2 = qVUwofr5s3;
        }
        int qVUwofr5s4 = mUqPm6GBh.qVUwofr5s(26, -1);
        if (qVUwofr5s4 >= 0) {
            this.IytU16YUK = qVUwofr5s4;
        }
        int qVUwofr5s5 = mUqPm6GBh.qVUwofr5s(23, -1);
        if (qVUwofr5s5 >= 0) {
            this.CpG0imbht = qVUwofr5s5;
        }
        this.dfpT1j18n = mUqPm6GBh.Eeka1udhb(13, -1);
        int qVUwofr5s6 = mUqPm6GBh.qVUwofr5s(9, Integer.MIN_VALUE);
        int qVUwofr5s7 = mUqPm6GBh.qVUwofr5s(5, Integer.MIN_VALUE);
        int Eeka1udhb = mUqPm6GBh.Eeka1udhb(7, 0);
        int Eeka1udhb2 = mUqPm6GBh.Eeka1udhb(8, 0);
        dIocxURUo();
        yrZre3UbR yrzre3ubr = this.qFBXIgpia;
        yrzre3ubr.Puu3Rhg4F = false;
        if (Eeka1udhb != Integer.MIN_VALUE) {
            yrzre3ubr.kCA6Zs9sL = Eeka1udhb;
            yrzre3ubr.q3BipwRCk = Eeka1udhb;
        }
        if (Eeka1udhb2 != Integer.MIN_VALUE) {
            yrzre3ubr.iiGwOFFnr = Eeka1udhb2;
            yrzre3ubr.J4Ux7ym32 = Eeka1udhb2;
        }
        if (!(qVUwofr5s6 == Integer.MIN_VALUE && qVUwofr5s7 == Integer.MIN_VALUE)) {
            yrzre3ubr.q3BipwRCk(qVUwofr5s6, qVUwofr5s7);
        }
        this.nlGCs0NZs = mUqPm6GBh.qVUwofr5s(10, Integer.MIN_VALUE);
        this.AqaWJg0b4 = mUqPm6GBh.qVUwofr5s(6, Integer.MIN_VALUE);
        this.ilHKhw3Yw = mUqPm6GBh.dXrmkklc8(4);
        this.qVUwofr5s = mUqPm6GBh.IytU16YUK(3);
        CharSequence IytU16YUK = mUqPm6GBh.IytU16YUK(21);
        if (!TextUtils.isEmpty(IytU16YUK)) {
            setTitle(IytU16YUK);
        }
        CharSequence IytU16YUK2 = mUqPm6GBh.IytU16YUK(18);
        if (!TextUtils.isEmpty(IytU16YUK2)) {
            setSubtitle(IytU16YUK2);
        }
        this.RG6kpfv3v = getContext();
        setPopupTheme(mUqPm6GBh.iMyQMM6Qj(17, 0));
        Drawable dXrmkklc8 = mUqPm6GBh.dXrmkklc8(16);
        if (dXrmkklc8 != null) {
            setNavigationIcon(dXrmkklc8);
        }
        CharSequence IytU16YUK3 = mUqPm6GBh.IytU16YUK(15);
        if (!TextUtils.isEmpty(IytU16YUK3)) {
            setNavigationContentDescription(IytU16YUK3);
        }
        Drawable dXrmkklc82 = mUqPm6GBh.dXrmkklc8(11);
        if (dXrmkklc82 != null) {
            setLogo(dXrmkklc82);
        }
        CharSequence IytU16YUK4 = mUqPm6GBh.IytU16YUK(12);
        if (!TextUtils.isEmpty(IytU16YUK4)) {
            setLogoDescription(IytU16YUK4);
        }
        if (mUqPm6GBh.CpG0imbht(29)) {
            setTitleTextColor(mUqPm6GBh.Bhmn1KIah(29));
        }
        if (mUqPm6GBh.CpG0imbht(20)) {
            setSubtitleTextColor(mUqPm6GBh.Bhmn1KIah(20));
        }
        if (mUqPm6GBh.CpG0imbht(14)) {
            getMenuInflater().inflate(mUqPm6GBh.iMyQMM6Qj(14, 0), getMenu());
        }
        mUqPm6GBh.NyWTwPF6V();
    }

    private MenuInflater getMenuInflater() {
        return new tNtRtnI5N(getContext());
    }

    public final boolean Bhmn1KIah(View view) {
        return view.getParent() == this || this.EBQXiIPmm.contains(view);
    }

    public final int CBQ5d1kRq(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public final void Eeka1udhb(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void GPLPRo6go() {
        if (this.PSTqBLTET == null) {
            this.PSTqBLTET = new jJtQlby2Y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            s7MlVynBG Puu3Rhg4F = generateDefaultLayoutParams();
            Puu3Rhg4F.q3BipwRCk = 8388611 | (this.i8XZMQc6Z & 112);
            this.PSTqBLTET.setLayoutParams(Puu3Rhg4F);
        }
    }

    public final void J4Ux7ym32(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        s7MlVynBG Puu3Rhg4F = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (s7MlVynBG) layoutParams;
        Puu3Rhg4F.J4Ux7ym32 = 1;
        if (!z || this.dXrmkklc8 == null) {
            addView(view, Puu3Rhg4F);
            return;
        }
        view.setLayoutParams(Puu3Rhg4F);
        this.EBQXiIPmm.add(view);
    }

    public final int MzoOEjc4X(View view, int i, int[] iArr, int i2) {
        s7MlVynBG s7mlvynbg = (s7MlVynBG) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) s7mlvynbg).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int vPSbyrYWX = vPSbyrYWX(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, vPSbyrYWX, max + measuredWidth, view.getMeasuredHeight() + vPSbyrYWX);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) s7mlvynbg).rightMargin + max;
    }

    public boolean PSTqBLTET() {
        ActionMenuView actionMenuView = this.CBQ5d1kRq;
        if (actionMenuView != null) {
            TeoeEf1aF teoeEf1aF = actionMenuView.qFBXIgpia;
            if (teoeEf1aF != null && teoeEf1aF.kmSgne1rO()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: Puu3Rhg4F */
    public s7MlVynBG generateDefaultLayoutParams() {
        return new s7MlVynBG(-2, -2);
    }

    public boolean RG6kpfv3v() {
        ActionMenuView actionMenuView = this.CBQ5d1kRq;
        if (actionMenuView != null) {
            TeoeEf1aF teoeEf1aF = actionMenuView.qFBXIgpia;
            if (teoeEf1aF != null && teoeEf1aF.Bhmn1KIah()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof s7MlVynBG);
    }

    public final void dIocxURUo() {
        if (this.qFBXIgpia == null) {
            this.qFBXIgpia = new yrZre3UbR();
        }
    }

    public final boolean dXrmkklc8(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new s7MlVynBG(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.Eeka1udhb;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.Eeka1udhb;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        yrZre3UbR yrzre3ubr = this.qFBXIgpia;
        if (yrzre3ubr != null) {
            return yrzre3ubr.GPLPRo6go ? yrzre3ubr.q3BipwRCk : yrzre3ubr.J4Ux7ym32;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.AqaWJg0b4;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        yrZre3UbR yrzre3ubr = this.qFBXIgpia;
        if (yrzre3ubr != null) {
            return yrzre3ubr.q3BipwRCk;
        }
        return 0;
    }

    public int getContentInsetRight() {
        yrZre3UbR yrzre3ubr = this.qFBXIgpia;
        if (yrzre3ubr != null) {
            return yrzre3ubr.J4Ux7ym32;
        }
        return 0;
    }

    public int getContentInsetStart() {
        yrZre3UbR yrzre3ubr = this.qFBXIgpia;
        if (yrzre3ubr != null) {
            return yrzre3ubr.GPLPRo6go ? yrzre3ubr.J4Ux7ym32 : yrzre3ubr.q3BipwRCk;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.nlGCs0NZs;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.RG2GI7LDp rG2GI7LDp;
        ActionMenuView actionMenuView = this.CBQ5d1kRq;
        return actionMenuView != null && (rG2GI7LDp = actionMenuView.iMyQMM6Qj) != null && rG2GI7LDp.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.AqaWJg0b4, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        return RBJDIwG1D.dIocxURUo(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        return RBJDIwG1D.dIocxURUo(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.nlGCs0NZs, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.MzoOEjc4X;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.MzoOEjc4X;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        kCA6Zs9sL();
        return this.CBQ5d1kRq.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.PSTqBLTET;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.PSTqBLTET;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public TeoeEf1aF getOuterActionMenuPresenter() {
        return this.L4EwGfXiQ;
    }

    public Drawable getOverflowIcon() {
        kCA6Zs9sL();
        return this.CBQ5d1kRq.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.RG6kpfv3v;
    }

    public int getPopupTheme() {
        return this.ixWaw2akD;
    }

    public CharSequence getSubtitle() {
        return this.vNtjxmzUM;
    }

    public final TextView getSubtitleTextView() {
        return this.Bhmn1KIah;
    }

    public CharSequence getTitle() {
        return this.NyWTwPF6V;
    }

    public int getTitleMarginBottom() {
        return this.CpG0imbht;
    }

    public int getTitleMarginEnd() {
        return this.cAwN510t2;
    }

    public int getTitleMarginStart() {
        return this.iMyQMM6Qj;
    }

    public int getTitleMarginTop() {
        return this.IytU16YUK;
    }

    public final TextView getTitleTextView() {
        return this.kmSgne1rO;
    }

    public KMt2sB4vK getWrapper() {
        if (this.QSbMsHU5X == null) {
            this.QSbMsHU5X = new qya5U7BN8(this, true);
        }
        return this.QSbMsHU5X;
    }

    public final void iiGwOFFnr() {
        if (this.CBQ5d1kRq == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.CBQ5d1kRq = actionMenuView;
            actionMenuView.setPopupTheme(this.ixWaw2akD);
            this.CBQ5d1kRq.setOnMenuItemClickListener(this.j22ftfeNI);
            ActionMenuView actionMenuView2 = this.CBQ5d1kRq;
            actionMenuView2.nlGCs0NZs = null;
            actionMenuView2.AqaWJg0b4 = null;
            s7MlVynBG Puu3Rhg4F = generateDefaultLayoutParams();
            Puu3Rhg4F.q3BipwRCk = 8388613 | (this.i8XZMQc6Z & 112);
            this.CBQ5d1kRq.setLayoutParams(Puu3Rhg4F);
            J4Ux7ym32(this.CBQ5d1kRq, false);
        }
    }

    public final int ilHKhw3Yw(View view, int i, int[] iArr, int i2) {
        s7MlVynBG s7mlvynbg = (s7MlVynBG) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) s7mlvynbg).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int vPSbyrYWX = vPSbyrYWX(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, vPSbyrYWX, max, view.getMeasuredHeight() + vPSbyrYWX);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) s7mlvynbg).leftMargin);
    }

    public final void kCA6Zs9sL() {
        iiGwOFFnr();
        ActionMenuView actionMenuView = this.CBQ5d1kRq;
        if (actionMenuView.iMyQMM6Qj == null) {
            androidx.appcompat.view.menu.RG2GI7LDp rG2GI7LDp = (androidx.appcompat.view.menu.RG2GI7LDp) actionMenuView.getMenu();
            if (this.zHl31GGXU == null) {
                this.zHl31GGXU = new qhPEQQaQ4();
            }
            this.CBQ5d1kRq.setExpandedActionViewsExclusive(true);
            rG2GI7LDp.J4Ux7ym32(this.zHl31GGXU, this.RG6kpfv3v);
        }
    }

    public final int kmSgne1rO(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.wIZEdYHUn);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.QNqj6nIzv = false;
        }
        if (!this.QNqj6nIzv) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.QNqj6nIzv = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.QNqj6nIzv = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0297 A[LOOP:0: B:108:0x0295->B:109:0x0297, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b9 A[LOOP:1: B:111:0x02b7->B:112:0x02b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02de A[LOOP:2: B:114:0x02dc->B:115:0x02de, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0333 A[LOOP:3: B:122:0x0331->B:123:0x0333, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean dXrmkklc8;
        boolean dXrmkklc82;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int size;
        int i12;
        int i13;
        int size2;
        int i14;
        int size3;
        int i15;
        int i16;
        int size4;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        boolean z2 = RBJDIwG1D.dIocxURUo(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i25 = width - paddingRight;
        int[] iArr = this.TyB1UUd72;
        iArr[1] = 0;
        iArr[0] = 0;
        int dIocxURUo = VCCyeOu6I.dIocxURUo(this);
        int min = dIocxURUo >= 0 ? Math.min(dIocxURUo, i4 - i2) : 0;
        if (dXrmkklc8(this.PSTqBLTET)) {
            ImageButton imageButton = this.PSTqBLTET;
            if (z2) {
                i5 = ilHKhw3Yw(imageButton, i25, iArr, min);
                i6 = paddingLeft;
                if (dXrmkklc8(this.Eeka1udhb)) {
                    ImageButton imageButton2 = this.Eeka1udhb;
                    if (z2) {
                        i5 = ilHKhw3Yw(imageButton2, i5, iArr, min);
                    } else {
                        i6 = MzoOEjc4X(imageButton2, i6, iArr, min);
                    }
                }
                if (dXrmkklc8(this.CBQ5d1kRq)) {
                    ActionMenuView actionMenuView = this.CBQ5d1kRq;
                    if (z2) {
                        i6 = MzoOEjc4X(actionMenuView, i6, iArr, min);
                    } else {
                        i5 = ilHKhw3Yw(actionMenuView, i5, iArr, min);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i6);
                iArr[1] = Math.max(0, currentContentInsetRight - (i25 - i5));
                int max = Math.max(i6, currentContentInsetLeft);
                int min2 = Math.min(i5, i25 - currentContentInsetRight);
                if (dXrmkklc8(this.dXrmkklc8)) {
                    View view = this.dXrmkklc8;
                    if (z2) {
                        min2 = ilHKhw3Yw(view, min2, iArr, min);
                    } else {
                        max = MzoOEjc4X(view, max, iArr, min);
                    }
                }
                if (dXrmkklc8(this.MzoOEjc4X)) {
                    ImageView imageView = this.MzoOEjc4X;
                    if (z2) {
                        min2 = ilHKhw3Yw(imageView, min2, iArr, min);
                    } else {
                        max = MzoOEjc4X(imageView, max, iArr, min);
                    }
                }
                dXrmkklc8 = dXrmkklc8(this.kmSgne1rO);
                dXrmkklc82 = dXrmkklc8(this.Bhmn1KIah);
                if (!dXrmkklc8) {
                    s7MlVynBG s7mlvynbg = (s7MlVynBG) this.kmSgne1rO.getLayoutParams();
                    i7 = paddingRight;
                    i8 = this.kmSgne1rO.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) s7mlvynbg).topMargin + ((ViewGroup.MarginLayoutParams) s7mlvynbg).bottomMargin + 0;
                } else {
                    i7 = paddingRight;
                    i8 = 0;
                }
                if (!dXrmkklc82) {
                    s7MlVynBG s7mlvynbg2 = (s7MlVynBG) this.Bhmn1KIah.getLayoutParams();
                    i9 = width;
                    i8 += this.Bhmn1KIah.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) s7mlvynbg2).topMargin + ((ViewGroup.MarginLayoutParams) s7mlvynbg2).bottomMargin;
                } else {
                    i9 = width;
                }
                if (!dXrmkklc8 || dXrmkklc82) {
                    TextView textView = !dXrmkklc8 ? this.kmSgne1rO : this.Bhmn1KIah;
                    TextView textView2 = !dXrmkklc82 ? this.Bhmn1KIah : this.kmSgne1rO;
                    s7MlVynBG s7mlvynbg3 = (s7MlVynBG) textView.getLayoutParams();
                    s7MlVynBG s7mlvynbg4 = (s7MlVynBG) textView2.getLayoutParams();
                    boolean z3 = (!dXrmkklc8 && this.kmSgne1rO.getMeasuredWidth() > 0) || (dXrmkklc82 && this.Bhmn1KIah.getMeasuredWidth() > 0);
                    i18 = this.mUqPm6GBh & 112;
                    i11 = paddingLeft;
                    if (i18 != 48) {
                        i19 = max;
                        i10 = min;
                        i20 = getPaddingTop() + ((ViewGroup.MarginLayoutParams) s7mlvynbg3).topMargin + this.IytU16YUK;
                    } else if (i18 != 80) {
                        int i26 = (((height - paddingTop) - paddingBottom) - i8) / 2;
                        int i27 = ((ViewGroup.MarginLayoutParams) s7mlvynbg3).topMargin;
                        i10 = min;
                        int i28 = this.IytU16YUK;
                        i19 = max;
                        if (i26 < i27 + i28) {
                            i26 = i27 + i28;
                        } else {
                            int i29 = (((height - paddingBottom) - i8) - i26) - paddingTop;
                            int i30 = ((ViewGroup.MarginLayoutParams) s7mlvynbg3).bottomMargin;
                            int i31 = this.CpG0imbht;
                            if (i29 < i30 + i31) {
                                i26 = Math.max(0, i26 - ((((ViewGroup.MarginLayoutParams) s7mlvynbg4).bottomMargin + i31) - i29));
                            }
                        }
                        i20 = paddingTop + i26;
                    } else {
                        i19 = max;
                        i10 = min;
                        i20 = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) s7mlvynbg4).bottomMargin) - this.CpG0imbht) - i8;
                    }
                    if (!z2) {
                        int i32 = (z3 ? this.iMyQMM6Qj : 0) - iArr[1];
                        min2 -= Math.max(0, i32);
                        iArr[1] = Math.max(0, -i32);
                        if (dXrmkklc8) {
                            int measuredWidth = min2 - this.kmSgne1rO.getMeasuredWidth();
                            int measuredHeight = this.kmSgne1rO.getMeasuredHeight() + i20;
                            this.kmSgne1rO.layout(measuredWidth, i20, min2, measuredHeight);
                            i23 = measuredWidth - this.cAwN510t2;
                            i20 = measuredHeight + ((ViewGroup.MarginLayoutParams) ((s7MlVynBG) this.kmSgne1rO.getLayoutParams())).bottomMargin;
                        } else {
                            i23 = min2;
                        }
                        if (dXrmkklc82) {
                            int i33 = i20 + ((ViewGroup.MarginLayoutParams) ((s7MlVynBG) this.Bhmn1KIah.getLayoutParams())).topMargin;
                            this.Bhmn1KIah.layout(min2 - this.Bhmn1KIah.getMeasuredWidth(), i33, min2, this.Bhmn1KIah.getMeasuredHeight() + i33);
                            i24 = min2 - this.cAwN510t2;
                        } else {
                            i24 = min2;
                        }
                        if (z3) {
                            min2 = Math.min(i23, i24);
                        }
                        max = i19;
                    } else {
                        int i34 = (z3 ? this.iMyQMM6Qj : 0) - iArr[0];
                        int max2 = Math.max(0, i34) + i19;
                        iArr[0] = Math.max(0, -i34);
                        if (dXrmkklc8) {
                            int measuredWidth2 = this.kmSgne1rO.getMeasuredWidth() + max2;
                            int measuredHeight2 = this.kmSgne1rO.getMeasuredHeight() + i20;
                            this.kmSgne1rO.layout(max2, i20, measuredWidth2, measuredHeight2);
                            i21 = measuredWidth2 + this.cAwN510t2;
                            i20 = measuredHeight2 + ((ViewGroup.MarginLayoutParams) ((s7MlVynBG) this.kmSgne1rO.getLayoutParams())).bottomMargin;
                        } else {
                            i21 = max2;
                        }
                        if (dXrmkklc82) {
                            int i35 = i20 + ((ViewGroup.MarginLayoutParams) ((s7MlVynBG) this.Bhmn1KIah.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.Bhmn1KIah.getMeasuredWidth() + max2;
                            this.Bhmn1KIah.layout(max2, i35, measuredWidth3, this.Bhmn1KIah.getMeasuredHeight() + i35);
                            i22 = measuredWidth3 + this.cAwN510t2;
                        } else {
                            i22 = max2;
                        }
                        max = z3 ? Math.max(i21, i22) : max2;
                    }
                } else {
                    i11 = paddingLeft;
                    i10 = min;
                }
                q3BipwRCk(this.igRQEZxnW, 3);
                size = this.igRQEZxnW.size();
                i12 = max;
                for (i13 = 0; i13 < size; i13++) {
                    i12 = MzoOEjc4X((View) this.igRQEZxnW.get(i13), i12, iArr, i10);
                }
                q3BipwRCk(this.igRQEZxnW, 5);
                size2 = this.igRQEZxnW.size();
                for (i14 = 0; i14 < size2; i14++) {
                    min2 = ilHKhw3Yw((View) this.igRQEZxnW.get(i14), min2, iArr, i10);
                }
                q3BipwRCk(this.igRQEZxnW, 1);
                ArrayList arrayList = this.igRQEZxnW;
                int i36 = iArr[0];
                int i37 = iArr[1];
                size3 = arrayList.size();
                int i38 = 0;
                for (i15 = 0; i15 < size3; i15++) {
                    View view2 = (View) arrayList.get(i15);
                    s7MlVynBG s7mlvynbg5 = (s7MlVynBG) view2.getLayoutParams();
                    int i39 = ((ViewGroup.MarginLayoutParams) s7mlvynbg5).leftMargin - i36;
                    int i40 = ((ViewGroup.MarginLayoutParams) s7mlvynbg5).rightMargin - i37;
                    int max3 = Math.max(0, i39);
                    int max4 = Math.max(0, i40);
                    i36 = Math.max(0, -i39);
                    i37 = Math.max(0, -i40);
                    i38 += view2.getMeasuredWidth() + max3 + max4;
                }
                i16 = ((((i9 - i11) - i7) / 2) + i11) - (i38 / 2);
                int i41 = i38 + i16;
                if (i16 >= i12) {
                    i12 = i41 > min2 ? i16 - (i41 - min2) : i16;
                }
                size4 = this.igRQEZxnW.size();
                int i42 = i12;
                for (i17 = 0; i17 < size4; i17++) {
                    i42 = MzoOEjc4X((View) this.igRQEZxnW.get(i17), i42, iArr, i10);
                }
                this.igRQEZxnW.clear();
            }
            i6 = MzoOEjc4X(imageButton, paddingLeft, iArr, min);
        } else {
            i6 = paddingLeft;
        }
        i5 = i25;
        if (dXrmkklc8(this.Eeka1udhb)) {
        }
        if (dXrmkklc8(this.CBQ5d1kRq)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i6);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i25 - i5));
        int max5 = Math.max(i6, currentContentInsetLeft2);
        int min22 = Math.min(i5, i25 - currentContentInsetRight2);
        if (dXrmkklc8(this.dXrmkklc8)) {
        }
        if (dXrmkklc8(this.MzoOEjc4X)) {
        }
        dXrmkklc8 = dXrmkklc8(this.kmSgne1rO);
        dXrmkklc82 = dXrmkklc8(this.Bhmn1KIah);
        if (!dXrmkklc8) {
        }
        if (!dXrmkklc82) {
        }
        if (!dXrmkklc8) {
        }
        if (!dXrmkklc8) {
        }
        if (!dXrmkklc82) {
        }
        s7MlVynBG s7mlvynbg32 = (s7MlVynBG) textView.getLayoutParams();
        s7MlVynBG s7mlvynbg42 = (s7MlVynBG) textView2.getLayoutParams();
        if (!dXrmkklc8) {
        }
        i18 = this.mUqPm6GBh & 112;
        i11 = paddingLeft;
        if (i18 != 48) {
        }
        if (!z2) {
        }
        q3BipwRCk(this.igRQEZxnW, 3);
        size = this.igRQEZxnW.size();
        i12 = max5;
        while (i13 < size) {
        }
        q3BipwRCk(this.igRQEZxnW, 5);
        size2 = this.igRQEZxnW.size();
        while (i14 < size2) {
        }
        q3BipwRCk(this.igRQEZxnW, 1);
        ArrayList arrayList2 = this.igRQEZxnW;
        int i362 = iArr[0];
        int i372 = iArr[1];
        size3 = arrayList2.size();
        int i382 = 0;
        while (i15 < size3) {
        }
        i16 = ((((i9 - i11) - i7) / 2) + i11) - (i382 / 2);
        int i412 = i382 + i16;
        if (i16 >= i12) {
        }
        size4 = this.igRQEZxnW.size();
        int i422 = i12;
        while (i17 < size4) {
        }
        this.igRQEZxnW.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0292  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.TyB1UUd72;
        boolean J4Ux7ym32 = qyCamnJnJ.J4Ux7ym32(this);
        boolean z = true;
        int i10 = 0;
        int i11 = !J4Ux7ym32 ? 1 : 0;
        if (dXrmkklc8(this.PSTqBLTET)) {
            Eeka1udhb(this.PSTqBLTET, i, 0, i2, 0, this.dfpT1j18n);
            i5 = CBQ5d1kRq(this.PSTqBLTET) + this.PSTqBLTET.getMeasuredWidth();
            i4 = Math.max(0, kmSgne1rO(this.PSTqBLTET) + this.PSTqBLTET.getMeasuredHeight());
            i3 = View.combineMeasuredStates(0, this.PSTqBLTET.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (dXrmkklc8(this.Eeka1udhb)) {
            Eeka1udhb(this.Eeka1udhb, i, 0, i2, 0, this.dfpT1j18n);
            i5 = CBQ5d1kRq(this.Eeka1udhb) + this.Eeka1udhb.getMeasuredWidth();
            i4 = Math.max(i4, kmSgne1rO(this.Eeka1udhb) + this.Eeka1udhb.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.Eeka1udhb.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i5) + 0;
        iArr[J4Ux7ym32 ? 1 : 0] = Math.max(0, currentContentInsetStart - i5);
        if (dXrmkklc8(this.CBQ5d1kRq)) {
            Eeka1udhb(this.CBQ5d1kRq, i, max, i2, 0, this.dfpT1j18n);
            i6 = CBQ5d1kRq(this.CBQ5d1kRq) + this.CBQ5d1kRq.getMeasuredWidth();
            i4 = Math.max(i4, kmSgne1rO(this.CBQ5d1kRq) + this.CBQ5d1kRq.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.CBQ5d1kRq.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = Math.max(currentContentInsetEnd, i6) + max;
        iArr[i11] = Math.max(0, currentContentInsetEnd - i6);
        if (dXrmkklc8(this.dXrmkklc8)) {
            max2 += qVUwofr5s(this.dXrmkklc8, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, kmSgne1rO(this.dXrmkklc8) + this.dXrmkklc8.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.dXrmkklc8.getMeasuredState());
        }
        if (dXrmkklc8(this.MzoOEjc4X)) {
            max2 += qVUwofr5s(this.MzoOEjc4X, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, kmSgne1rO(this.MzoOEjc4X) + this.MzoOEjc4X.getMeasuredHeight());
            i3 = View.combineMeasuredStates(i3, this.MzoOEjc4X.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((s7MlVynBG) childAt.getLayoutParams()).J4Ux7ym32 == 0 && dXrmkklc8(childAt)) {
                max2 += qVUwofr5s(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, kmSgne1rO(childAt) + childAt.getMeasuredHeight());
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i13 = this.IytU16YUK + this.CpG0imbht;
        int i14 = this.iMyQMM6Qj + this.cAwN510t2;
        if (dXrmkklc8(this.kmSgne1rO)) {
            qVUwofr5s(this.kmSgne1rO, i, max2 + i14, i2, i13, iArr);
            i8 = CBQ5d1kRq(this.kmSgne1rO) + this.kmSgne1rO.getMeasuredWidth();
            i7 = kmSgne1rO(this.kmSgne1rO) + this.kmSgne1rO.getMeasuredHeight();
            i9 = View.combineMeasuredStates(i3, this.kmSgne1rO.getMeasuredState());
        } else {
            i7 = 0;
            i9 = i3;
            i8 = 0;
        }
        if (dXrmkklc8(this.Bhmn1KIah)) {
            i8 = Math.max(i8, qVUwofr5s(this.Bhmn1KIah, i, max2 + i14, i2, i7 + i13, iArr));
            i7 = kmSgne1rO(this.Bhmn1KIah) + this.Bhmn1KIah.getMeasuredHeight() + i7;
            i9 = View.combineMeasuredStates(i9, this.Bhmn1KIah.getMeasuredState());
        }
        int max3 = Math.max(i4, i7);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max3;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max2 + i8, getSuggestedMinimumWidth()), i, -16777216 & i9);
        i10 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (this.ziwPzaoF3) {
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
                if (!dXrmkklc8(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            if (!z) {
            }
            setMeasuredDimension(resolveSizeAndState, i10);
        }
        z = false;
        if (!z) {
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof WfopS3efW)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        WfopS3efW wfopS3efW = (WfopS3efW) parcelable;
        super.onRestoreInstanceState(wfopS3efW.CBQ5d1kRq);
        ActionMenuView actionMenuView = this.CBQ5d1kRq;
        androidx.appcompat.view.menu.RG2GI7LDp rG2GI7LDp = actionMenuView != null ? actionMenuView.iMyQMM6Qj : null;
        int i = wfopS3efW.Bhmn1KIah;
        if (!(i == 0 || this.zHl31GGXU == null || rG2GI7LDp == null || (findItem = rG2GI7LDp.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (wfopS3efW.PSTqBLTET) {
            removeCallbacks(this.wIZEdYHUn);
            post(this.wIZEdYHUn);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x003e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x003e;
     */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onRtlPropertiesChanged(int i) {
        int i2;
        super.onRtlPropertiesChanged(i);
        dIocxURUo();
        yrZre3UbR yrzre3ubr = this.qFBXIgpia;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != yrzre3ubr.GPLPRo6go) {
            yrzre3ubr.GPLPRo6go = z;
            if (!yrzre3ubr.Puu3Rhg4F) {
                yrzre3ubr.q3BipwRCk = yrzre3ubr.kCA6Zs9sL;
            } else if (z) {
                int i3 = yrzre3ubr.dIocxURUo;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = yrzre3ubr.kCA6Zs9sL;
                }
                yrzre3ubr.q3BipwRCk = i3;
                i2 = yrzre3ubr.tGV7Q6urW;
            } else {
                int i4 = yrzre3ubr.tGV7Q6urW;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = yrzre3ubr.kCA6Zs9sL;
                }
                yrzre3ubr.q3BipwRCk = i4;
                i2 = yrzre3ubr.dIocxURUo;
            }
            i2 = yrzre3ubr.iiGwOFFnr;
            yrzre3ubr.J4Ux7ym32 = i2;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        tDC1iJlG1 tdc1ijlg1;
        WfopS3efW wfopS3efW = new WfopS3efW(super.onSaveInstanceState());
        qhPEQQaQ4 qhpeqqaq4 = this.zHl31GGXU;
        if (!(qhpeqqaq4 == null || (tdc1ijlg1 = qhpeqqaq4.kmSgne1rO) == null)) {
            wfopS3efW.Bhmn1KIah = tdc1ijlg1.q3BipwRCk;
        }
        wfopS3efW.PSTqBLTET = PSTqBLTET();
        return wfopS3efW;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.V9LQMKGJe = false;
        }
        if (!this.V9LQMKGJe) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.V9LQMKGJe = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.V9LQMKGJe = false;
        }
        return true;
    }

    public final int oon79WMrY(int i) {
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        int dIocxURUo = RBJDIwG1D.dIocxURUo(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i, dIocxURUo) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return dIocxURUo == 1 ? 5 : 3;
    }

    public final void q3BipwRCk(List list, int i) {
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        boolean z = RBJDIwG1D.dIocxURUo(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, RBJDIwG1D.dIocxURUo(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                s7MlVynBG s7mlvynbg = (s7MlVynBG) childAt.getLayoutParams();
                if (s7mlvynbg.J4Ux7ym32 == 0 && dXrmkklc8(childAt) && oon79WMrY(s7mlvynbg.q3BipwRCk) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            s7MlVynBG s7mlvynbg2 = (s7MlVynBG) childAt2.getLayoutParams();
            if (s7mlvynbg2.J4Ux7ym32 == 0 && dXrmkklc8(childAt2) && oon79WMrY(s7mlvynbg2.q3BipwRCk) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    public final int qVUwofr5s(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            tGV7Q6urW();
        }
        ImageButton imageButton = this.Eeka1udhb;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C8A1BseZU.q3BipwRCk(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            tGV7Q6urW();
            this.Eeka1udhb.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.Eeka1udhb;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.ilHKhw3Yw);
        }
    }

    public void setCollapsible(boolean z) {
        this.ziwPzaoF3 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.AqaWJg0b4) {
            this.AqaWJg0b4 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.nlGCs0NZs) {
            this.nlGCs0NZs = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C8A1BseZU.q3BipwRCk(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.MzoOEjc4X == null) {
                this.MzoOEjc4X = new PQnXPgcS3(getContext(), null, 0);
            }
            if (!Bhmn1KIah(this.MzoOEjc4X)) {
                J4Ux7ym32(this.MzoOEjc4X, true);
            }
        } else {
            ImageView imageView = this.MzoOEjc4X;
            if (imageView != null && Bhmn1KIah(imageView)) {
                removeView(this.MzoOEjc4X);
                this.EBQXiIPmm.remove(this.MzoOEjc4X);
            }
        }
        ImageView imageView2 = this.MzoOEjc4X;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.MzoOEjc4X == null) {
            this.MzoOEjc4X = new PQnXPgcS3(getContext(), null, 0);
        }
        ImageView imageView = this.MzoOEjc4X;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            GPLPRo6go();
        }
        ImageButton imageButton = this.PSTqBLTET;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C8A1BseZU.q3BipwRCk(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            GPLPRo6go();
            if (!Bhmn1KIah(this.PSTqBLTET)) {
                J4Ux7ym32(this.PSTqBLTET, true);
            }
        } else {
            ImageButton imageButton = this.PSTqBLTET;
            if (imageButton != null && Bhmn1KIah(imageButton)) {
                removeView(this.PSTqBLTET);
                this.EBQXiIPmm.remove(this.PSTqBLTET);
            }
        }
        ImageButton imageButton2 = this.PSTqBLTET;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        GPLPRo6go();
        this.PSTqBLTET.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(dNif5KqqH dnif5kqqh) {
        this.juJ6pnCpu = dnif5kqqh;
    }

    public void setOverflowIcon(Drawable drawable) {
        kCA6Zs9sL();
        this.CBQ5d1kRq.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.ixWaw2akD != i) {
            this.ixWaw2akD = i;
            if (i == 0) {
                this.RG6kpfv3v = getContext();
            } else {
                this.RG6kpfv3v = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.Bhmn1KIah == null) {
                Context context = getContext();
                qs7k2SwdW qs7k2swdw = new qs7k2SwdW(context);
                this.Bhmn1KIah = qs7k2swdw;
                qs7k2swdw.setSingleLine();
                this.Bhmn1KIah.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.WaUP0CF08;
                if (i != 0) {
                    this.Bhmn1KIah.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.o4LF8RkoQ;
                if (colorStateList != null) {
                    this.Bhmn1KIah.setTextColor(colorStateList);
                }
            }
            if (!Bhmn1KIah(this.Bhmn1KIah)) {
                J4Ux7ym32(this.Bhmn1KIah, true);
            }
        } else {
            TextView textView = this.Bhmn1KIah;
            if (textView != null && Bhmn1KIah(textView)) {
                removeView(this.Bhmn1KIah);
                this.EBQXiIPmm.remove(this.Bhmn1KIah);
            }
        }
        TextView textView2 = this.Bhmn1KIah;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.vNtjxmzUM = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.o4LF8RkoQ = colorStateList;
        TextView textView = this.Bhmn1KIah;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.kmSgne1rO == null) {
                Context context = getContext();
                qs7k2SwdW qs7k2swdw = new qs7k2SwdW(context);
                this.kmSgne1rO = qs7k2swdw;
                qs7k2swdw.setSingleLine();
                this.kmSgne1rO.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.sk5s77z6Q;
                if (i != 0) {
                    this.kmSgne1rO.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.i0Zug1mVk;
                if (colorStateList != null) {
                    this.kmSgne1rO.setTextColor(colorStateList);
                }
            }
            if (!Bhmn1KIah(this.kmSgne1rO)) {
                J4Ux7ym32(this.kmSgne1rO, true);
            }
        } else {
            TextView textView = this.kmSgne1rO;
            if (textView != null && Bhmn1KIah(textView)) {
                removeView(this.kmSgne1rO);
                this.EBQXiIPmm.remove(this.kmSgne1rO);
            }
        }
        TextView textView2 = this.kmSgne1rO;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.NyWTwPF6V = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.CpG0imbht = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.cAwN510t2 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.iMyQMM6Qj = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.IytU16YUK = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.i0Zug1mVk = colorStateList;
        TextView textView = this.kmSgne1rO;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void tGV7Q6urW() {
        if (this.Eeka1udhb == null) {
            jJtQlby2Y jjtqlby2y = new jJtQlby2Y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.Eeka1udhb = jjtqlby2y;
            jjtqlby2y.setImageDrawable(this.ilHKhw3Yw);
            this.Eeka1udhb.setContentDescription(this.qVUwofr5s);
            s7MlVynBG Puu3Rhg4F = generateDefaultLayoutParams();
            Puu3Rhg4F.q3BipwRCk = 8388611 | (this.i8XZMQc6Z & 112);
            Puu3Rhg4F.J4Ux7ym32 = 2;
            this.Eeka1udhb.setLayoutParams(Puu3Rhg4F);
            this.Eeka1udhb.setOnClickListener(new aXI58Y1kr());
        }
    }

    public final int vPSbyrYWX(View view, int i) {
        s7MlVynBG s7mlvynbg = (s7MlVynBG) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = s7mlvynbg.q3BipwRCk & 112;
        if (!(i3 == 16 || i3 == 48 || i3 == 80)) {
            i3 = this.mUqPm6GBh & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) s7mlvynbg).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) s7mlvynbg).topMargin;
        if (i4 < i5) {
            i4 = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) s7mlvynbg).bottomMargin;
            if (i6 < i7) {
                i4 = Math.max(0, i4 - (i7 - i6));
            }
        }
        return paddingTop + i4;
    }

    /* renamed from: yWvV4ePLl */
    public s7MlVynBG generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof s7MlVynBG ? new s7MlVynBG((s7MlVynBG) layoutParams) : layoutParams instanceof zhWsuDChl.RG2GI7LDp ? new s7MlVynBG((zhWsuDChl.RG2GI7LDp) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new s7MlVynBG((ViewGroup.MarginLayoutParams) layoutParams) : new s7MlVynBG(layoutParams);
    }
}
