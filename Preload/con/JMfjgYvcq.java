package con;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.feravolt.preload.R;
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
    public JMfjgYvcq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        Throwable th;
        TypedArray typedArray;
        int i;
        TypedArray typedArray2;
        Exception e;
        hfLGvn7bI.q3BipwRCk(this, getContext());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZolH67hOx.RG6kpfv3v, R.attr.spinnerStyle, 0);
        int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            this.kmSgne1rO = new fnUv4KsJz(context, resourceId);
        } else {
            this.kmSgne1rO = context;
        }
        try {
            typedArray = null;
            i = -1;
        } catch (Throwable th2) {
            th = th2;
            typedArray = typedArray2;
        }
        try {
            typedArray2 = context.obtainStyledAttributes(attributeSet, dXrmkklc8, R.attr.spinnerStyle, 0);
            try {
                if (typedArray2.hasValue(0)) {
                    i = typedArray2.getInt(0, 0);
                }
            } catch (Exception e2) {
                e = e2;
                Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
            }
        } catch (Exception e3) {
            e = e3;
            typedArray2 = null;
        } catch (Throwable th3) {
            th = th3;
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
        typedArray2.recycle();
        if (i == 0) {
            RleTyY0Vy rleTyY0Vy = new RleTyY0Vy(this);
            this.ilHKhw3Yw = rleTyY0Vy;
            rleTyY0Vy.kmSgne1rO(obtainStyledAttributes.getString(2));
        } else if (i == 1) {
            iSPvE3YGn ispve3ygn = new iSPvE3YGn(this, this.kmSgne1rO, attributeSet, R.attr.spinnerStyle);
            j6XJY7rz4 mUqPm6GBh = j6XJY7rz4.mUqPm6GBh(this.kmSgne1rO, attributeSet, ZolH67hOx.RG6kpfv3v, R.attr.spinnerStyle, 0);
            this.qVUwofr5s = mUqPm6GBh.dfpT1j18n(3, -2);
            ispve3ygn.vNtjxmzUM.setBackgroundDrawable(mUqPm6GBh.dXrmkklc8(1));
            ispve3ygn.V9LQMKGJe = obtainStyledAttributes.getString(2);
            mUqPm6GBh.NyWTwPF6V();
            this.ilHKhw3Yw = ispve3ygn;
            this.Bhmn1KIah = new J36hVzW7e(this, this, ispve3ygn);
        }
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367048, textArray);
            arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        obtainStyledAttributes.recycle();
        this.MzoOEjc4X = true;
        SpinnerAdapter spinnerAdapter = this.PSTqBLTET;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.PSTqBLTET = null;
        }
        this.CBQ5d1kRq.iiGwOFFnr(attributeSet, R.attr.spinnerStyle);
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
