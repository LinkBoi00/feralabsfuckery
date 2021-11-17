package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.feravolt.preload.R;
import con.C8A1BseZU;
import con.D3DEikrvb;
import con.IuQbWntsc;
import con.Y4wRqkFOh;
import con.ZolH67hOx;
import con.hfLGvn7bI;
import con.j6XJY7rz4;
import con.mN6fklC4R;
import con.mPmVqiuID;
import con.mZIyARhC1;
import con.qEkvsEHI1;
import con.qyCamnJnJ;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public PorterDuff.Mode Bhmn1KIah;
    public Drawable CBQ5d1kRq;
    public int CpG0imbht;
    public int EBQXiIPmm;
    public PorterDuff.Mode Eeka1udhb;
    public int IytU16YUK;
    public TransformationMethod L4EwGfXiQ;
    public boolean MzoOEjc4X;
    public float NyWTwPF6V;
    public boolean PSTqBLTET;
    public int QNqj6nIzv;
    public Layout QSbMsHU5X;
    public boolean RG6kpfv3v;
    public final TextPaint TyB1UUd72;
    public int V9LQMKGJe;
    public int WaUP0CF08;
    public boolean cAwN510t2;
    public boolean dXrmkklc8;
    public CharSequence dfpT1j18n;
    public int i0Zug1mVk;
    public boolean i8XZMQc6Z;
    public CharSequence iMyQMM6Qj;
    public int igRQEZxnW;
    public Drawable ilHKhw3Yw;
    public int ixWaw2akD;
    public Layout j22ftfeNI;
    public ColorStateList juJ6pnCpu;
    public ColorStateList kmSgne1rO;
    public int mUqPm6GBh;
    public float nlGCs0NZs;
    public int o4LF8RkoQ;
    public float qFBXIgpia;
    public ColorStateList qVUwofr5s;
    public int sk5s77z6Q;
    public int vNtjxmzUM;
    public ObjectAnimator zHl31GGXU;
    public static final Property wIZEdYHUn = new RG2GI7LDp(Float.class, "thumbPos");
    public static final int[] IzM1cD9ly = {16842912};
    public VelocityTracker AqaWJg0b4 = VelocityTracker.obtain();
    public final Rect ziwPzaoF3 = new Rect();

    /* loaded from: classes.dex */
    public class RG2GI7LDp extends Property<SwitchCompat, Float> {
        public RG2GI7LDp(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.NyWTwPF6V);
        }

        @Override // android.util.Property
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0110, code lost:
        if (r10 != null) goto L_0x0117;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public SwitchCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchStyle);
        ColorStateList colorStateList;
        int resourceId;
        qEkvsEHI1 qekvsehi1 = null;
        this.kmSgne1rO = null;
        this.Bhmn1KIah = null;
        this.PSTqBLTET = false;
        this.MzoOEjc4X = false;
        this.qVUwofr5s = null;
        this.Eeka1udhb = null;
        this.dXrmkklc8 = false;
        this.RG6kpfv3v = false;
        hfLGvn7bI.q3BipwRCk(this, getContext());
        boolean z = true;
        TextPaint textPaint = new TextPaint(1);
        this.TyB1UUd72 = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = ZolH67hOx.ixWaw2akD;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.switchStyle, 0);
        j6XJY7rz4 j6xjy7rz4 = new j6XJY7rz4(context, obtainStyledAttributes);
        IuQbWntsc.PSTqBLTET(this, context, iArr, attributeSet, obtainStyledAttributes, R.attr.switchStyle, 0);
        Drawable dXrmkklc8 = j6xjy7rz4.dXrmkklc8(2);
        this.CBQ5d1kRq = dXrmkklc8;
        if (dXrmkklc8 != null) {
            dXrmkklc8.setCallback(this);
        }
        Drawable dXrmkklc82 = j6xjy7rz4.dXrmkklc8(11);
        this.ilHKhw3Yw = dXrmkklc82;
        if (dXrmkklc82 != null) {
            dXrmkklc82.setCallback(this);
        }
        this.dfpT1j18n = j6xjy7rz4.IytU16YUK(0);
        this.iMyQMM6Qj = j6xjy7rz4.IytU16YUK(1);
        this.cAwN510t2 = j6xjy7rz4.vPSbyrYWX(3, true);
        this.ixWaw2akD = j6xjy7rz4.Eeka1udhb(8, 0);
        this.sk5s77z6Q = j6xjy7rz4.Eeka1udhb(5, 0);
        this.WaUP0CF08 = j6xjy7rz4.Eeka1udhb(6, 0);
        this.i8XZMQc6Z = j6xjy7rz4.vPSbyrYWX(4, false);
        ColorStateList Bhmn1KIah = j6xjy7rz4.Bhmn1KIah(9);
        if (Bhmn1KIah != null) {
            this.kmSgne1rO = Bhmn1KIah;
            this.PSTqBLTET = true;
        }
        PorterDuff.Mode tGV7Q6urW = Y4wRqkFOh.tGV7Q6urW(j6xjy7rz4.i8XZMQc6Z(10, -1), null);
        if (this.Bhmn1KIah != tGV7Q6urW) {
            this.Bhmn1KIah = tGV7Q6urW;
            this.MzoOEjc4X = true;
        }
        if (this.PSTqBLTET || this.MzoOEjc4X) {
            q3BipwRCk();
        }
        ColorStateList Bhmn1KIah2 = j6xjy7rz4.Bhmn1KIah(12);
        if (Bhmn1KIah2 != null) {
            this.qVUwofr5s = Bhmn1KIah2;
            this.dXrmkklc8 = true;
        }
        PorterDuff.Mode tGV7Q6urW2 = Y4wRqkFOh.tGV7Q6urW(j6xjy7rz4.i8XZMQc6Z(13, -1), null);
        if (this.Eeka1udhb != tGV7Q6urW2) {
            this.Eeka1udhb = tGV7Q6urW2;
            this.RG6kpfv3v = true;
        }
        if (this.dXrmkklc8 || this.RG6kpfv3v) {
            J4Ux7ym32();
        }
        int iMyQMM6Qj = j6xjy7rz4.iMyQMM6Qj(7, 0);
        if (iMyQMM6Qj != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iMyQMM6Qj, ZolH67hOx.sk5s77z6Q);
            if (obtainStyledAttributes2.hasValue(3) && (resourceId = obtainStyledAttributes2.getResourceId(3, 0)) != 0) {
                ThreadLocal threadLocal = C8A1BseZU.q3BipwRCk;
                colorStateList = context.getColorStateList(resourceId);
            }
            colorStateList = obtainStyledAttributes2.getColorStateList(3);
            this.juJ6pnCpu = colorStateList == null ? getTextColors() : colorStateList;
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f = (float) dimensionPixelSize;
                if (f != textPaint.getTextSize()) {
                    textPaint.setTextSize(f);
                    requestLayout();
                }
            }
            int i = obtainStyledAttributes2.getInt(1, -1);
            int i2 = obtainStyledAttributes2.getInt(2, -1);
            Typeface typeface = i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            float f2 = 0.0f;
            if (i2 > 0) {
                Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i2) : Typeface.create(typeface, i2);
                setSwitchTypeface(defaultFromStyle);
                int i3 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i2;
                textPaint.setFakeBoldText((i3 & 1) == 0 ? false : z);
                textPaint.setTextSkewX((i3 & 2) != 0 ? -0.25f : f2);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            this.L4EwGfXiQ = obtainStyledAttributes2.getBoolean(14, false) ? new qEkvsEHI1(getContext()) : qekvsehi1;
            obtainStyledAttributes2.recycle();
        }
        new mZIyARhC1(this).kCA6Zs9sL(attributeSet, R.attr.switchStyle);
        j6xjy7rz4.NyWTwPF6V();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.CpG0imbht = viewConfiguration.getScaledTouchSlop();
        this.mUqPm6GBh = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    private boolean getTargetCheckedState() {
        return this.NyWTwPF6V > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((qyCamnJnJ.J4Ux7ym32(this) ? 1.0f - this.NyWTwPF6V : this.NyWTwPF6V) * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.ilHKhw3Yw;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.ziwPzaoF3;
        drawable.getPadding(rect);
        Drawable drawable2 = this.CBQ5d1kRq;
        Rect J4Ux7ym32 = drawable2 != null ? Y4wRqkFOh.J4Ux7ym32(drawable2) : Y4wRqkFOh.tGV7Q6urW;
        return ((((this.vNtjxmzUM - this.o4LF8RkoQ) - rect.left) - rect.right) - J4Ux7ym32.left) - J4Ux7ym32.right;
    }

    public final void J4Ux7ym32() {
        Drawable drawable = this.ilHKhw3Yw;
        if (drawable == null) {
            return;
        }
        if (this.dXrmkklc8 || this.RG6kpfv3v) {
            Drawable mutate = drawable.mutate();
            this.ilHKhw3Yw = mutate;
            if (this.dXrmkklc8) {
                mutate.setTintList(this.qVUwofr5s);
            }
            if (this.RG6kpfv3v) {
                this.ilHKhw3Yw.setTintMode(this.Eeka1udhb);
            }
            if (this.ilHKhw3Yw.isStateful()) {
                this.ilHKhw3Yw.setState(getDrawableState());
            }
        }
    }

    public final void dIocxURUo() {
        if (Build.VERSION.SDK_INT >= 30) {
            Object obj = this.iMyQMM6Qj;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_off);
            }
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            new mPmVqiuID(R.id.tag_state_description, CharSequence.class, 64, 30).kCA6Zs9sL(this, obj);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.ziwPzaoF3;
        int i3 = this.V9LQMKGJe;
        int i4 = this.QNqj6nIzv;
        int i5 = this.igRQEZxnW;
        int i6 = this.EBQXiIPmm;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.CBQ5d1kRq;
        Rect J4Ux7ym32 = drawable != null ? Y4wRqkFOh.J4Ux7ym32(drawable) : Y4wRqkFOh.tGV7Q6urW;
        Drawable drawable2 = this.ilHKhw3Yw;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (J4Ux7ym32 != null) {
                int i8 = J4Ux7ym32.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = J4Ux7ym32.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = J4Ux7ym32.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = J4Ux7ym32.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.ilHKhw3Yw.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.ilHKhw3Yw.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.CBQ5d1kRq;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.o4LF8RkoQ + rect.right;
            this.CBQ5d1kRq.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                background.setHotspotBounds(i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.CBQ5d1kRq;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
        Drawable drawable2 = this.ilHKhw3Yw;
        if (drawable2 != null) {
            drawable2.setHotspot(f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.CBQ5d1kRq;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.ilHKhw3Yw;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!qyCamnJnJ.J4Ux7ym32(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.vNtjxmzUM;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.WaUP0CF08 : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (qyCamnJnJ.J4Ux7ym32(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.vNtjxmzUM;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.WaUP0CF08 : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.cAwN510t2;
    }

    public boolean getSplitTrack() {
        return this.i8XZMQc6Z;
    }

    public int getSwitchMinWidth() {
        return this.sk5s77z6Q;
    }

    public int getSwitchPadding() {
        return this.WaUP0CF08;
    }

    public CharSequence getTextOff() {
        return this.iMyQMM6Qj;
    }

    public CharSequence getTextOn() {
        return this.dfpT1j18n;
    }

    public Drawable getThumbDrawable() {
        return this.CBQ5d1kRq;
    }

    public int getThumbTextPadding() {
        return this.ixWaw2akD;
    }

    public ColorStateList getThumbTintList() {
        return this.kmSgne1rO;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.Bhmn1KIah;
    }

    public Drawable getTrackDrawable() {
        return this.ilHKhw3Yw;
    }

    public ColorStateList getTrackTintList() {
        return this.qVUwofr5s;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.Eeka1udhb;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.CBQ5d1kRq;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.ilHKhw3Yw;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.zHl31GGXU;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.zHl31GGXU.end();
            this.zHl31GGXU = null;
        }
    }

    public final void kCA6Zs9sL() {
        if (Build.VERSION.SDK_INT >= 30) {
            Object obj = this.dfpT1j18n;
            if (obj == null) {
                obj = getResources().getString(R.string.abc_capital_on);
            }
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            new mPmVqiuID(R.id.tag_state_description, CharSequence.class, 64, 30).kCA6Zs9sL(this, obj);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, IzM1cD9ly);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.ziwPzaoF3;
        Drawable drawable = this.ilHKhw3Yw;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.QNqj6nIzv;
        int i3 = this.EBQXiIPmm;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.CBQ5d1kRq;
        if (drawable != null) {
            if (!this.i8XZMQc6Z || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect J4Ux7ym32 = Y4wRqkFOh.J4Ux7ym32(drawable2);
                drawable2.copyBounds(rect);
                rect.left += J4Ux7ym32.left;
                rect.right -= J4Ux7ym32.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.j22ftfeNI : this.QSbMsHU5X;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.juJ6pnCpu;
            if (colorStateList != null) {
                this.TyB1UUd72.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.TyB1UUd72.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.dfpT1j18n : this.iMyQMM6Qj;
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        super.onLayout(z, i, i2, i3, i4);
        int i10 = 0;
        if (this.CBQ5d1kRq != null) {
            Rect rect = this.ziwPzaoF3;
            Drawable drawable = this.ilHKhw3Yw;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect J4Ux7ym32 = Y4wRqkFOh.J4Ux7ym32(this.CBQ5d1kRq);
            i5 = Math.max(0, J4Ux7ym32.left - rect.left);
            i10 = Math.max(0, J4Ux7ym32.right - rect.right);
        } else {
            i5 = 0;
        }
        if (qyCamnJnJ.J4Ux7ym32(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.vNtjxmzUM + i7) - i5) - i10;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i10;
            i7 = (i6 - this.vNtjxmzUM) + i5 + i10;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int i11 = this.i0Zug1mVk;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i11 / 2);
            i8 = i11 + height;
            i9 = height;
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i8 = this.i0Zug1mVk + i9;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.i0Zug1mVk;
        }
        this.V9LQMKGJe = i7;
        this.QNqj6nIzv = i9;
        this.EBQXiIPmm = i8;
        this.igRQEZxnW = i6;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.cAwN510t2) {
            if (this.j22ftfeNI == null) {
                this.j22ftfeNI = tGV7Q6urW(this.dfpT1j18n);
            }
            if (this.QSbMsHU5X == null) {
                this.QSbMsHU5X = tGV7Q6urW(this.iMyQMM6Qj);
            }
        }
        Rect rect = this.ziwPzaoF3;
        Drawable drawable = this.CBQ5d1kRq;
        int i6 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.CBQ5d1kRq.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.CBQ5d1kRq.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        if (this.cAwN510t2) {
            i5 = (this.ixWaw2akD * 2) + Math.max(this.j22ftfeNI.getWidth(), this.QSbMsHU5X.getWidth());
        } else {
            i5 = 0;
        }
        this.o4LF8RkoQ = Math.max(i5, i4);
        Drawable drawable2 = this.ilHKhw3Yw;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.ilHKhw3Yw.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i7 = rect.left;
        int i8 = rect.right;
        Drawable drawable3 = this.CBQ5d1kRq;
        if (drawable3 != null) {
            Rect J4Ux7ym32 = Y4wRqkFOh.J4Ux7ym32(drawable3);
            i7 = Math.max(i7, J4Ux7ym32.left);
            i8 = Math.max(i8, J4Ux7ym32.right);
        }
        int max = Math.max(this.sk5s77z6Q, (this.o4LF8RkoQ * 2) + i7 + i8);
        int max2 = Math.max(i6, i3);
        this.vNtjxmzUM = max;
        this.i0Zug1mVk = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.dfpT1j18n : this.iMyQMM6Qj;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r0 != 3) goto L_0x0150;
     */
    @Override // android.widget.TextView, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        this.AqaWJg0b4.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = false;
        if (actionMasked != 0) {
            float f = 0.0f;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.IytU16YUK;
                    if (i == 1) {
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        if (Math.abs(x - this.qFBXIgpia) > ((float) this.CpG0imbht) || Math.abs(y - this.nlGCs0NZs) > ((float) this.CpG0imbht)) {
                            this.IytU16YUK = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.qFBXIgpia = x;
                            this.nlGCs0NZs = y;
                            return true;
                        }
                    } else if (i == 2) {
                        float x2 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f2 = x2 - this.qFBXIgpia;
                        float f3 = thumbScrollRange != 0 ? f2 / ((float) thumbScrollRange) : f2 > 0.0f ? 1.0f : -1.0f;
                        if (qyCamnJnJ.J4Ux7ym32(this)) {
                            f3 = -f3;
                        }
                        float f4 = this.NyWTwPF6V;
                        float f5 = f3 + f4;
                        if (f5 >= 0.0f) {
                            f = f5 > 1.0f ? 1.0f : f5;
                        }
                        if (f != f4) {
                            this.qFBXIgpia = x2;
                            setThumbPosition(f);
                        }
                        return true;
                    }
                }
            }
            if (this.IytU16YUK == 2) {
                this.IytU16YUK = 0;
                boolean z3 = motionEvent.getAction() == 1 && isEnabled();
                boolean isChecked = isChecked();
                if (z3) {
                    this.AqaWJg0b4.computeCurrentVelocity(1000);
                    float xVelocity = this.AqaWJg0b4.getXVelocity();
                    z = Math.abs(xVelocity) > ((float) this.mUqPm6GBh) ? !qyCamnJnJ.J4Ux7ym32(this) ? xVelocity > 0.0f : xVelocity < 0.0f : getTargetCheckedState();
                } else {
                    z = isChecked;
                }
                if (z != isChecked) {
                    playSoundEffect(0);
                }
                setChecked(z);
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.IytU16YUK = 0;
            this.AqaWJg0b4.clear();
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled()) {
                if (this.CBQ5d1kRq != null) {
                    int thumbOffset = getThumbOffset();
                    this.CBQ5d1kRq.getPadding(this.ziwPzaoF3);
                    int i2 = this.QNqj6nIzv;
                    int i3 = this.CpG0imbht;
                    int i4 = i2 - i3;
                    int i5 = (this.V9LQMKGJe + thumbOffset) - i3;
                    Rect rect = this.ziwPzaoF3;
                    int i6 = this.o4LF8RkoQ + i5 + rect.left + rect.right + i3;
                    int i7 = this.EBQXiIPmm + i3;
                    if (x3 > ((float) i5) && x3 < ((float) i6) && y2 > ((float) i4) && y2 < ((float) i7)) {
                        z2 = true;
                    }
                }
                if (z2) {
                    this.IytU16YUK = 1;
                    this.qFBXIgpia = x3;
                    this.nlGCs0NZs = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void q3BipwRCk() {
        Drawable drawable = this.CBQ5d1kRq;
        if (drawable == null) {
            return;
        }
        if (this.PSTqBLTET || this.MzoOEjc4X) {
            Drawable mutate = drawable.mutate();
            this.CBQ5d1kRq = mutate;
            if (this.PSTqBLTET) {
                mutate.setTintList(this.kmSgne1rO);
            }
            if (this.MzoOEjc4X) {
                this.CBQ5d1kRq.setTintMode(this.Bhmn1KIah);
            }
            if (this.CBQ5d1kRq.isStateful()) {
                this.CBQ5d1kRq.setState(getDrawableState());
            }
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            kCA6Zs9sL();
        } else {
            dIocxURUo();
        }
        float f = 1.0f;
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            if (mN6fklC4R.tGV7Q6urW(this)) {
                if (!isChecked) {
                    f = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, wIZEdYHUn, f);
                this.zHl31GGXU = ofFloat;
                ofFloat.setDuration(250L);
                this.zHl31GGXU.setAutoCancel(true);
                this.zHl31GGXU.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.zHl31GGXU;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!isChecked) {
            f = 0.0f;
        }
        setThumbPosition(f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(D3DEikrvb.iMyQMM6Qj(this, callback));
    }

    public void setShowText(boolean z) {
        if (this.cAwN510t2 != z) {
            this.cAwN510t2 = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.i8XZMQc6Z = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.sk5s77z6Q = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.WaUP0CF08 = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.TyB1UUd72.getTypeface() != null && !this.TyB1UUd72.getTypeface().equals(typeface)) || (this.TyB1UUd72.getTypeface() == null && typeface != null)) {
            this.TyB1UUd72.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.iMyQMM6Qj = charSequence;
        requestLayout();
        if (!isChecked()) {
            dIocxURUo();
        }
    }

    public void setTextOn(CharSequence charSequence) {
        this.dfpT1j18n = charSequence;
        requestLayout();
        if (isChecked()) {
            kCA6Zs9sL();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.CBQ5d1kRq;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.CBQ5d1kRq = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.NyWTwPF6V = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C8A1BseZU.q3BipwRCk(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.ixWaw2akD = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.kmSgne1rO = colorStateList;
        this.PSTqBLTET = true;
        q3BipwRCk();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.Bhmn1KIah = mode;
        this.MzoOEjc4X = true;
        q3BipwRCk();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.ilHKhw3Yw;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.ilHKhw3Yw = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C8A1BseZU.q3BipwRCk(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.qVUwofr5s = colorStateList;
        this.dXrmkklc8 = true;
        J4Ux7ym32();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.Eeka1udhb = mode;
        this.RG6kpfv3v = true;
        J4Ux7ym32();
    }

    public final Layout tGV7Q6urW(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.L4EwGfXiQ;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        TextPaint textPaint = this.TyB1UUd72;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.CBQ5d1kRq || drawable == this.ilHKhw3Yw;
    }
}
