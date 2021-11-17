package con;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
/* loaded from: classes.dex */
public class JMfjgYvcq extends Spinner {
    public static final int[] dXrmkklc8 = {16843505};
    public qt4vMCOja Bhmn1KIah;
    public final boolean MzoOEjc4X;
    public SpinnerAdapter PSTqBLTET;
    public i8dsFkRky ilHKhw3Yw;
    public final Context kmSgne1rO;
    public int qVUwofr5s;
    public final Rect Eeka1udhb = new Rect();
    public final SfQ6fqrlg CBQ5d1kRq = new SfQ6fqrlg(this);

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
        if (r5 == null) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public JMfjgYvcq(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r10 = this;
            r0 = 2130969491(0x7f040393, float:1.7547665E38)
            r10.<init>(r11, r12, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r10.Eeka1udhb = r1
            android.content.Context r1 = r10.getContext()
            con.hfLGvn7bI.q3BipwRCk(r10, r1)
            int[] r1 = con.ZolH67hOx.RG6kpfv3v
            r2 = 0
            android.content.res.TypedArray r1 = r11.obtainStyledAttributes(r12, r1, r0, r2)
            con.SfQ6fqrlg r3 = new con.SfQ6fqrlg
            r3.<init>(r10)
            r10.CBQ5d1kRq = r3
            r3 = 4
            int r3 = r1.getResourceId(r3, r2)
            if (r3 == 0) goto L_0x0031
            con.fnUv4KsJz r4 = new con.fnUv4KsJz
            r4.<init>(r11, r3)
            r10.kmSgne1rO = r4
            goto L_0x0033
        L_0x0031:
            r10.kmSgne1rO = r11
        L_0x0033:
            r3 = 0
            r4 = -1
            int[] r5 = con.JMfjgYvcq.dXrmkklc8     // Catch: Exception -> 0x004f, all -> 0x004c
            android.content.res.TypedArray r5 = r11.obtainStyledAttributes(r12, r5, r0, r2)     // Catch: Exception -> 0x004f, all -> 0x004c
            boolean r6 = r5.hasValue(r2)     // Catch: Exception -> 0x004a, all -> 0x0046
            if (r6 == 0) goto L_0x005b
            int r4 = r5.getInt(r2, r2)     // Catch: Exception -> 0x004a, all -> 0x0046
            goto L_0x005b
        L_0x0046:
            r11 = move-exception
            r3 = r5
            goto L_0x00d1
        L_0x004a:
            r6 = move-exception
            goto L_0x0052
        L_0x004c:
            r11 = move-exception
            goto L_0x00d1
        L_0x004f:
            r5 = move-exception
            r6 = r5
            r5 = r3
        L_0x0052:
            java.lang.String r7 = "AppCompatSpinner"
            java.lang.String r8 = "Could not read android:spinnerMode"
            android.util.Log.i(r7, r8, r6)     // Catch: all -> 0x0046
            if (r5 == 0) goto L_0x005e
        L_0x005b:
            r5.recycle()
        L_0x005e:
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0098
            if (r4 == r6) goto L_0x0065
            goto L_0x00a6
        L_0x0065:
            con.iSPvE3YGn r4 = new con.iSPvE3YGn
            android.content.Context r7 = r10.kmSgne1rO
            r4.<init>(r10, r7, r12, r0)
            android.content.Context r7 = r10.kmSgne1rO
            int[] r8 = con.ZolH67hOx.RG6kpfv3v
            con.j6XJY7rz4 r7 = con.j6XJY7rz4.mUqPm6GBh(r7, r12, r8, r0, r2)
            r8 = 3
            r9 = -2
            int r8 = r7.dfpT1j18n(r8, r9)
            r10.qVUwofr5s = r8
            android.graphics.drawable.Drawable r8 = r7.dXrmkklc8(r6)
            android.widget.PopupWindow r9 = r4.vNtjxmzUM
            r9.setBackgroundDrawable(r8)
            java.lang.String r5 = r1.getString(r5)
            r4.V9LQMKGJe = r5
            r7.NyWTwPF6V()
            r10.ilHKhw3Yw = r4
            con.J36hVzW7e r5 = new con.J36hVzW7e
            r5.<init>(r10, r10, r4)
            r10.Bhmn1KIah = r5
            goto L_0x00a6
        L_0x0098:
            con.RleTyY0Vy r4 = new con.RleTyY0Vy
            r4.<init>(r10)
            r10.ilHKhw3Yw = r4
            java.lang.String r5 = r1.getString(r5)
            r4.kmSgne1rO(r5)
        L_0x00a6:
            java.lang.CharSequence[] r2 = r1.getTextArray(r2)
            if (r2 == 0) goto L_0x00bd
            android.widget.ArrayAdapter r4 = new android.widget.ArrayAdapter
            r5 = 17367048(0x1090008, float:2.5162948E-38)
            r4.<init>(r11, r5, r2)
            r11 = 2131492998(0x7f0c0086, float:1.8609464E38)
            r4.setDropDownViewResource(r11)
            r10.setAdapter(r4)
        L_0x00bd:
            r1.recycle()
            r10.MzoOEjc4X = r6
            android.widget.SpinnerAdapter r11 = r10.PSTqBLTET
            if (r11 == 0) goto L_0x00cb
            r10.setAdapter(r11)
            r10.PSTqBLTET = r3
        L_0x00cb:
            con.SfQ6fqrlg r11 = r10.CBQ5d1kRq
            r11.iiGwOFFnr(r12, r0)
            return
        L_0x00d1:
            if (r3 == 0) goto L_0x00d6
            r3.recycle()
        L_0x00d6:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: con.JMfjgYvcq.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void J4Ux7ym32() {
        this.ilHKhw3Yw.kCA6Zs9sL(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.View, android.view.ViewGroup
    public void drawableStateChanged() {
        super.drawableStateChanged();
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            sfQ6fqrlg.q3BipwRCk();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        i8dsFkRky i8dsfkrky = this.ilHKhw3Yw;
        return i8dsfkrky != null ? i8dsfkrky.dIocxURUo() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        i8dsFkRky i8dsfkrky = this.ilHKhw3Yw;
        return i8dsfkrky != null ? i8dsfkrky.Puu3Rhg4F() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.ilHKhw3Yw != null ? this.qVUwofr5s : super.getDropDownWidth();
    }

    public final i8dsFkRky getInternalPopup() {
        return this.ilHKhw3Yw;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        i8dsFkRky i8dsfkrky = this.ilHKhw3Yw;
        return i8dsfkrky != null ? i8dsfkrky.oon79WMrY() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.kmSgne1rO;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        i8dsFkRky i8dsfkrky = this.ilHKhw3Yw;
        return i8dsfkrky != null ? i8dsfkrky.vPSbyrYWX() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            return sfQ6fqrlg.dIocxURUo();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            return sfQ6fqrlg.kCA6Zs9sL();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.view.View, android.widget.AdapterView, android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i8dsFkRky i8dsfkrky = this.ilHKhw3Yw;
        if (i8dsfkrky != null && i8dsfkrky.J4Ux7ym32()) {
            this.ilHKhw3Yw.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.ilHKhw3Yw != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), q3BipwRCk(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        wz74Hj7PC wz74hj7pc = (wz74Hj7PC) parcelable;
        super.onRestoreInstanceState(wz74hj7pc.getSuperState());
        if (wz74hj7pc.CBQ5d1kRq && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ywLNtYaFP(this));
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        wz74Hj7PC wz74hj7pc = new wz74Hj7PC(super.onSaveInstanceState());
        i8dsFkRky i8dsfkrky = this.ilHKhw3Yw;
        wz74hj7pc.CBQ5d1kRq = i8dsfkrky != null && i8dsfkrky.J4Ux7ym32();
        return wz74hj7pc;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        qt4vMCOja qt4vmcoja = this.Bhmn1KIah;
        if (qt4vmcoja == null || !qt4vmcoja.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        i8dsFkRky i8dsfkrky = this.ilHKhw3Yw;
        if (i8dsfkrky == null) {
            return super.performClick();
        }
        if (i8dsfkrky.J4Ux7ym32()) {
            return true;
        }
        J4Ux7ym32();
        return true;
    }

    public int q3BipwRCk(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.Eeka1udhb);
        Rect rect = this.Eeka1udhb;
        return i2 + rect.left + rect.right;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.MzoOEjc4X) {
            this.PSTqBLTET = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.ilHKhw3Yw != null) {
            Context context = this.kmSgne1rO;
            if (context == null) {
                context = getContext();
            }
            this.ilHKhw3Yw.MzoOEjc4X(new UQOAP72v0(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            sfQ6fqrlg.GPLPRo6go();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            sfQ6fqrlg.Puu3Rhg4F(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        i8dsFkRky i8dsfkrky = this.ilHKhw3Yw;
        if (i8dsfkrky != null) {
            i8dsfkrky.ilHKhw3Yw(i);
            this.ilHKhw3Yw.tGV7Q6urW(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        i8dsFkRky i8dsfkrky = this.ilHKhw3Yw;
        if (i8dsfkrky != null) {
            i8dsfkrky.PSTqBLTET(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.ilHKhw3Yw != null) {
            this.qVUwofr5s = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        i8dsFkRky i8dsfkrky = this.ilHKhw3Yw;
        if (i8dsfkrky != null) {
            i8dsfkrky.Bhmn1KIah(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C8A1BseZU.q3BipwRCk(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        i8dsFkRky i8dsfkrky = this.ilHKhw3Yw;
        if (i8dsfkrky != null) {
            i8dsfkrky.kmSgne1rO(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            sfQ6fqrlg.oon79WMrY(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        SfQ6fqrlg sfQ6fqrlg = this.CBQ5d1kRq;
        if (sfQ6fqrlg != null) {
            sfQ6fqrlg.vPSbyrYWX(mode);
        }
    }
}
