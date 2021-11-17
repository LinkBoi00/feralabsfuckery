package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.feravolt.preload.R;
import com.google.android.material.chip.RG2GI7LDp;
import con.C8A1BseZU;
import con.FXBYEZrfX;
import con.IqwHQ6O2l;
import con.IuQbWntsc;
import con.MWOH6OZjg;
import con.RBJDIwG1D;
import con.RisoK3egD;
import con.SQ4Lz5bqj;
import con.VCCyeOu6I;
import con.Yg5AJdYv8;
import con.anXlDk6fV;
import con.avTFec6Zj;
import con.ba8VhBGaI;
import con.dnBSj5uJN;
import con.hF1hMObUZ;
import con.m84IdhKaW;
import con.mJLaJepZo;
import con.mVCAZ6E2C;
import con.pDLEDo7dT;
import con.rUYFcNk3O;
import con.rbhQaQiIi;
import con.xT3tobMV0;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class Chip extends AppCompatCheckBox implements RG2GI7LDp.AbstractC0009RG2GI7LDp, rUYFcNk3O {
    public CompoundButton.OnCheckedChangeListener Eeka1udhb;
    public InsetDrawable MzoOEjc4X;
    public RG2GI7LDp PSTqBLTET;
    public boolean RG6kpfv3v;
    public boolean WaUP0CF08;
    public boolean cAwN510t2;
    public boolean dXrmkklc8;
    public int dfpT1j18n;
    public int i8XZMQc6Z;
    public final mhl5lIdbQ iMyQMM6Qj;
    public RippleDrawable ilHKhw3Yw;
    public boolean ixWaw2akD;
    public View.OnClickListener qVUwofr5s;
    public boolean sk5s77z6Q;
    public static final Rect nlGCs0NZs = new Rect();
    public static final int[] AqaWJg0b4 = {16842913};
    public static final int[] mUqPm6GBh = {16842911};
    public final Rect IytU16YUK = new Rect();
    public final RectF CpG0imbht = new RectF();
    public final SQ4Lz5bqj qFBXIgpia = new RG2GI7LDp();

    /* loaded from: classes.dex */
    public class RG2GI7LDp extends SQ4Lz5bqj {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RG2GI7LDp() {
            super(2);
            Chip.this = r1;
        }

        @Override // con.SQ4Lz5bqj
        public void J4Ux7ym32(Typeface typeface, boolean z) {
            CharSequence charSequence;
            Chip chip = Chip.this;
            RG2GI7LDp rG2GI7LDp = chip.PSTqBLTET;
            if (rG2GI7LDp.eylCJcWC7) {
                charSequence = rG2GI7LDp.TyB1UUd72;
            } else {
                charSequence = chip.getText();
            }
            chip.setText(charSequence);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }

        @Override // con.SQ4Lz5bqj
        public void q3BipwRCk(int i) {
        }
    }

    /* loaded from: classes.dex */
    public class mhl5lIdbQ extends mVCAZ6E2C {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public mhl5lIdbQ(Chip chip) {
            super(chip);
            Chip.this = r1;
        }

        @Override // con.mVCAZ6E2C
        public boolean MzoOEjc4X(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.iiGwOFFnr();
            }
            return false;
        }

        @Override // con.mVCAZ6E2C
        public void ilHKhw3Yw(int i, IqwHQ6O2l iqwHQ6O2l) {
            String str = "";
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription == null) {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        str = text;
                    }
                    objArr[0] = str;
                    closeIconContentDescription = context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim();
                }
                iqwHQ6O2l.q3BipwRCk.setContentDescription(closeIconContentDescription);
                iqwHQ6O2l.q3BipwRCk.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
                iqwHQ6O2l.q3BipwRCk(IqwHQ6O2l.RG2GI7LDp.kCA6Zs9sL);
                iqwHQ6O2l.q3BipwRCk.setEnabled(Chip.this.isEnabled());
                return;
            }
            iqwHQ6O2l.q3BipwRCk.setContentDescription(str);
            iqwHQ6O2l.q3BipwRCk.setBoundsInParent(Chip.nlGCs0NZs);
        }

        @Override // con.mVCAZ6E2C
        public void kmSgne1rO(List list) {
            boolean z = false;
            list.add(0);
            Chip chip = Chip.this;
            Rect rect = Chip.nlGCs0NZs;
            if (chip.dIocxURUo()) {
                Chip chip2 = Chip.this;
                RG2GI7LDp rG2GI7LDp = chip2.PSTqBLTET;
                if (rG2GI7LDp != null && rG2GI7LDp.ziwPzaoF3) {
                    z = true;
                }
                if (z && chip2.qVUwofr5s != null) {
                    list.add(1);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x033d  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public Chip(Context context, AttributeSet attributeSet) {
        super(ba8VhBGaI.q3BipwRCk(context, attributeSet, R.attr.chipStyle, 2131821530), attributeSet, R.attr.chipStyle);
        boolean hasValue;
        TextUtils.TruncateAt truncateAt;
        int resourceId;
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        RG2GI7LDp rG2GI7LDp = new RG2GI7LDp(context2, attributeSet, R.attr.chipStyle, 2131821530);
        Context context3 = rG2GI7LDp.oesmsHQJU;
        int[] iArr = RisoK3egD.J4Ux7ym32;
        TypedArray dIocxURUo = hF1hMObUZ.dIocxURUo(context3, attributeSet, iArr, R.attr.chipStyle, 2131821530, new int[0]);
        rG2GI7LDp.pwwzaxl9D = dIocxURUo.hasValue(37);
        ColorStateList Bhmn1KIah = anXlDk6fV.Bhmn1KIah(rG2GI7LDp.oesmsHQJU, dIocxURUo, 24);
        if (rG2GI7LDp.vNtjxmzUM != Bhmn1KIah) {
            rG2GI7LDp.vNtjxmzUM = Bhmn1KIah;
            rG2GI7LDp.onStateChange(rG2GI7LDp.getState());
        }
        rG2GI7LDp.igRQEZxnW(anXlDk6fV.Bhmn1KIah(rG2GI7LDp.oesmsHQJU, dIocxURUo, 11));
        rG2GI7LDp.zHl31GGXU(dIocxURUo.getDimension(19, 0.0f));
        if (dIocxURUo.hasValue(12)) {
            rG2GI7LDp.EBQXiIPmm(dIocxURUo.getDimension(12, 0.0f));
        }
        rG2GI7LDp.wIZEdYHUn(anXlDk6fV.Bhmn1KIah(rG2GI7LDp.oesmsHQJU, dIocxURUo, 22));
        rG2GI7LDp.IzM1cD9ly(dIocxURUo.getDimension(23, 0.0f));
        rG2GI7LDp.ln3nf7LH3(anXlDk6fV.Bhmn1KIah(rG2GI7LDp.oesmsHQJU, dIocxURUo, 36));
        rG2GI7LDp.Dr7UqlxEV(dIocxURUo.getText(5));
        avTFec6Zj avtfec6zj = (!dIocxURUo.hasValue(0) || (resourceId = dIocxURUo.getResourceId(0, 0)) == 0) ? null : new avTFec6Zj(rG2GI7LDp.oesmsHQJU, resourceId);
        avtfec6zj.vPSbyrYWX = dIocxURUo.getDimension(1, avtfec6zj.vPSbyrYWX);
        rG2GI7LDp.M66hQ219i(avtfec6zj);
        int i = dIocxURUo.getInt(3, 0);
        if (i == 1) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (i != 2) {
            if (i == 3) {
                truncateAt = TextUtils.TruncateAt.END;
            }
            rG2GI7LDp.L4EwGfXiQ(dIocxURUo.getBoolean(18, false));
            if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
                rG2GI7LDp.L4EwGfXiQ(dIocxURUo.getBoolean(15, false));
            }
            rG2GI7LDp.juJ6pnCpu(anXlDk6fV.MzoOEjc4X(rG2GI7LDp.oesmsHQJU, dIocxURUo, 14));
            if (dIocxURUo.hasValue(17)) {
                rG2GI7LDp.QSbMsHU5X(anXlDk6fV.Bhmn1KIah(rG2GI7LDp.oesmsHQJU, dIocxURUo, 17));
            }
            rG2GI7LDp.j22ftfeNI(dIocxURUo.getDimension(16, -1.0f));
            rG2GI7LDp.KBYw84i3W(dIocxURUo.getBoolean(31, false));
            if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
                rG2GI7LDp.KBYw84i3W(dIocxURUo.getBoolean(26, false));
            }
            rG2GI7LDp.n4UIOvAko(anXlDk6fV.MzoOEjc4X(rG2GI7LDp.oesmsHQJU, dIocxURUo, 25));
            rG2GI7LDp.kktL0P5MG(anXlDk6fV.Bhmn1KIah(rG2GI7LDp.oesmsHQJU, dIocxURUo, 30));
            rG2GI7LDp.BL4OzhZBd(dIocxURUo.getDimension(28, 0.0f));
            rG2GI7LDp.i0Zug1mVk(dIocxURUo.getBoolean(6, false));
            rG2GI7LDp.QNqj6nIzv(dIocxURUo.getBoolean(10, false));
            if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
                rG2GI7LDp.QNqj6nIzv(dIocxURUo.getBoolean(8, false));
            }
            rG2GI7LDp.o4LF8RkoQ(anXlDk6fV.MzoOEjc4X(rG2GI7LDp.oesmsHQJU, dIocxURUo, 7));
            if (dIocxURUo.hasValue(9)) {
                rG2GI7LDp.V9LQMKGJe(anXlDk6fV.Bhmn1KIah(rG2GI7LDp.oesmsHQJU, dIocxURUo, 9));
            }
            rG2GI7LDp.INnK5Rew6 = Yg5AJdYv8.q3BipwRCk(rG2GI7LDp.oesmsHQJU, dIocxURUo, 39);
            rG2GI7LDp.SuKhTJIQc = Yg5AJdYv8.q3BipwRCk(rG2GI7LDp.oesmsHQJU, dIocxURUo, 33);
            rG2GI7LDp.ziwPzaoF3(dIocxURUo.getDimension(21, 0.0f));
            rG2GI7LDp.SuKhTJIQc(dIocxURUo.getDimension(35, 0.0f));
            rG2GI7LDp.INnK5Rew6(dIocxURUo.getDimension(34, 0.0f));
            rG2GI7LDp.IG30YE5GU(dIocxURUo.getDimension(41, 0.0f));
            rG2GI7LDp.R2hkbNqWf(dIocxURUo.getDimension(40, 0.0f));
            rG2GI7LDp.DuuXfa7LE(dIocxURUo.getDimension(29, 0.0f));
            rG2GI7LDp.OpLJtmvFM(dIocxURUo.getDimension(27, 0.0f));
            rG2GI7LDp.TyB1UUd72(dIocxURUo.getDimension(13, 0.0f));
            rG2GI7LDp.D91ZKn9BG = dIocxURUo.getDimensionPixelSize(4, Integer.MAX_VALUE);
            dIocxURUo.recycle();
            hF1hMObUZ.q3BipwRCk(context2, attributeSet, R.attr.chipStyle, 2131821530);
            hF1hMObUZ.J4Ux7ym32(context2, attributeSet, iArr, R.attr.chipStyle, 2131821530, new int[0]);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.chipStyle, 2131821530);
            this.WaUP0CF08 = obtainStyledAttributes.getBoolean(32, false);
            this.dfpT1j18n = (int) Math.ceil((double) obtainStyledAttributes.getDimension(20, (float) Math.ceil((double) TypedValue.applyDimension(1, (float) 48, getContext().getResources().getDisplayMetrics()))));
            obtainStyledAttributes.recycle();
            setChipDrawable(rG2GI7LDp);
            rG2GI7LDp.PSTqBLTET(mJLaJepZo.yWvV4ePLl(this));
            hF1hMObUZ.q3BipwRCk(context2, attributeSet, R.attr.chipStyle, 2131821530);
            hF1hMObUZ.J4Ux7ym32(context2, attributeSet, iArr, R.attr.chipStyle, 2131821530, new int[0]);
            TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.chipStyle, 2131821530);
            hasValue = obtainStyledAttributes2.hasValue(37);
            obtainStyledAttributes2.recycle();
            this.iMyQMM6Qj = new mhl5lIdbQ(this);
            Puu3Rhg4F();
            if (!hasValue) {
                setOutlineProvider(new MWOH6OZjg(this));
            }
            setChecked(this.dXrmkklc8);
            setText(rG2GI7LDp.TyB1UUd72);
            setEllipsize(rG2GI7LDp.GpWTsCbvo);
            vPSbyrYWX();
            if (!this.PSTqBLTET.eylCJcWC7) {
                setLines(1);
                setHorizontallyScrolling(true);
            }
            setGravity(8388627);
            oon79WMrY();
            if (this.WaUP0CF08) {
                setMinHeight(this.dfpT1j18n);
            }
            this.i8XZMQc6Z = RBJDIwG1D.dIocxURUo(this);
        } else {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        }
        rG2GI7LDp.GpWTsCbvo = truncateAt;
        rG2GI7LDp.L4EwGfXiQ(dIocxURUo.getBoolean(18, false));
        if (attributeSet == null) {
            rG2GI7LDp.L4EwGfXiQ(dIocxURUo.getBoolean(15, false));
        }
        rG2GI7LDp.juJ6pnCpu(anXlDk6fV.MzoOEjc4X(rG2GI7LDp.oesmsHQJU, dIocxURUo, 14));
        if (dIocxURUo.hasValue(17)) {
        }
        rG2GI7LDp.j22ftfeNI(dIocxURUo.getDimension(16, -1.0f));
        rG2GI7LDp.KBYw84i3W(dIocxURUo.getBoolean(31, false));
        if (attributeSet == null) {
            rG2GI7LDp.KBYw84i3W(dIocxURUo.getBoolean(26, false));
        }
        rG2GI7LDp.n4UIOvAko(anXlDk6fV.MzoOEjc4X(rG2GI7LDp.oesmsHQJU, dIocxURUo, 25));
        rG2GI7LDp.kktL0P5MG(anXlDk6fV.Bhmn1KIah(rG2GI7LDp.oesmsHQJU, dIocxURUo, 30));
        rG2GI7LDp.BL4OzhZBd(dIocxURUo.getDimension(28, 0.0f));
        rG2GI7LDp.i0Zug1mVk(dIocxURUo.getBoolean(6, false));
        rG2GI7LDp.QNqj6nIzv(dIocxURUo.getBoolean(10, false));
        if (attributeSet == null) {
            rG2GI7LDp.QNqj6nIzv(dIocxURUo.getBoolean(8, false));
        }
        rG2GI7LDp.o4LF8RkoQ(anXlDk6fV.MzoOEjc4X(rG2GI7LDp.oesmsHQJU, dIocxURUo, 7));
        if (dIocxURUo.hasValue(9)) {
        }
        rG2GI7LDp.INnK5Rew6 = Yg5AJdYv8.q3BipwRCk(rG2GI7LDp.oesmsHQJU, dIocxURUo, 39);
        rG2GI7LDp.SuKhTJIQc = Yg5AJdYv8.q3BipwRCk(rG2GI7LDp.oesmsHQJU, dIocxURUo, 33);
        rG2GI7LDp.ziwPzaoF3(dIocxURUo.getDimension(21, 0.0f));
        rG2GI7LDp.SuKhTJIQc(dIocxURUo.getDimension(35, 0.0f));
        rG2GI7LDp.INnK5Rew6(dIocxURUo.getDimension(34, 0.0f));
        rG2GI7LDp.IG30YE5GU(dIocxURUo.getDimension(41, 0.0f));
        rG2GI7LDp.R2hkbNqWf(dIocxURUo.getDimension(40, 0.0f));
        rG2GI7LDp.DuuXfa7LE(dIocxURUo.getDimension(29, 0.0f));
        rG2GI7LDp.OpLJtmvFM(dIocxURUo.getDimension(27, 0.0f));
        rG2GI7LDp.TyB1UUd72(dIocxURUo.getDimension(13, 0.0f));
        rG2GI7LDp.D91ZKn9BG = dIocxURUo.getDimensionPixelSize(4, Integer.MAX_VALUE);
        dIocxURUo.recycle();
        hF1hMObUZ.q3BipwRCk(context2, attributeSet, R.attr.chipStyle, 2131821530);
        hF1hMObUZ.J4Ux7ym32(context2, attributeSet, iArr, R.attr.chipStyle, 2131821530, new int[0]);
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.chipStyle, 2131821530);
        this.WaUP0CF08 = obtainStyledAttributes3.getBoolean(32, false);
        this.dfpT1j18n = (int) Math.ceil((double) obtainStyledAttributes3.getDimension(20, (float) Math.ceil((double) TypedValue.applyDimension(1, (float) 48, getContext().getResources().getDisplayMetrics()))));
        obtainStyledAttributes3.recycle();
        setChipDrawable(rG2GI7LDp);
        rG2GI7LDp.PSTqBLTET(mJLaJepZo.yWvV4ePLl(this));
        hF1hMObUZ.q3BipwRCk(context2, attributeSet, R.attr.chipStyle, 2131821530);
        hF1hMObUZ.J4Ux7ym32(context2, attributeSet, iArr, R.attr.chipStyle, 2131821530, new int[0]);
        TypedArray obtainStyledAttributes22 = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.chipStyle, 2131821530);
        hasValue = obtainStyledAttributes22.hasValue(37);
        obtainStyledAttributes22.recycle();
        this.iMyQMM6Qj = new mhl5lIdbQ(this);
        Puu3Rhg4F();
        if (!hasValue) {
        }
        setChecked(this.dXrmkklc8);
        setText(rG2GI7LDp.TyB1UUd72);
        setEllipsize(rG2GI7LDp.GpWTsCbvo);
        vPSbyrYWX();
        if (!this.PSTqBLTET.eylCJcWC7) {
        }
        setGravity(8388627);
        oon79WMrY();
        if (this.WaUP0CF08) {
        }
        this.i8XZMQc6Z = RBJDIwG1D.dIocxURUo(this);
    }

    public RectF getCloseIconTouchBounds() {
        this.CpG0imbht.setEmpty();
        if (dIocxURUo() && this.qVUwofr5s != null) {
            RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
            rG2GI7LDp.cAwN510t2(rG2GI7LDp.getBounds(), this.CpG0imbht);
        }
        return this.CpG0imbht;
    }

    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.IytU16YUK.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.IytU16YUK;
    }

    private avTFec6Zj getTextAppearance() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.a8N8UmDyD.iiGwOFFnr;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.ixWaw2akD != z) {
            this.ixWaw2akD = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.RG6kpfv3v != z) {
            this.RG6kpfv3v = z;
            refreshDrawableState();
        }
    }

    public final void GPLPRo6go() {
        if (this.MzoOEjc4X != null) {
            this.MzoOEjc4X = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            int[] iArr = FXBYEZrfX.q3BipwRCk;
            yWvV4ePLl();
        }
    }

    public final void Puu3Rhg4F() {
        if (dIocxURUo()) {
            RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
            if ((rG2GI7LDp != null && rG2GI7LDp.ziwPzaoF3) && this.qVUwofr5s != null) {
                IuQbWntsc.MzoOEjc4X(this, this.iMyQMM6Qj);
                this.cAwN510t2 = true;
                return;
            }
        }
        IuQbWntsc.MzoOEjc4X(this, null);
        this.cAwN510t2 = false;
    }

    public final boolean dIocxURUo() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        return (rG2GI7LDp == null || rG2GI7LDp.qFBXIgpia() == null) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x0072;
     */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        boolean z;
        int i;
        if (!this.cAwN510t2) {
            return super.dispatchHoverEvent(motionEvent);
        }
        mhl5lIdbQ mhl5lidbq = this.iMyQMM6Qj;
        if (mhl5lidbq.Puu3Rhg4F.isEnabled() && mhl5lidbq.Puu3Rhg4F.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int i2 = (!Chip.this.dIocxURUo() || !Chip.this.getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY())) ? 0 : 1;
                int i3 = mhl5lidbq.kmSgne1rO;
                if (i3 != i2) {
                    mhl5lidbq.kmSgne1rO = i2;
                    mhl5lidbq.Eeka1udhb(i2, 128);
                    mhl5lidbq.Eeka1udhb(i3, 256);
                }
            } else if (action == 10 && (i = mhl5lidbq.kmSgne1rO) != Integer.MIN_VALUE) {
                if (i != Integer.MIN_VALUE) {
                    mhl5lidbq.kmSgne1rO = Integer.MIN_VALUE;
                    mhl5lidbq.Eeka1udhb(Integer.MIN_VALUE, 128);
                    mhl5lidbq.Eeka1udhb(i, 256);
                }
                z = true;
            }
            return z || super.dispatchHoverEvent(motionEvent);
        }
        z = false;
        if (z) {
            return true;
        }
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.cAwN510t2) {
            return super.dispatchKeyEvent(keyEvent);
        }
        mhl5lIdbQ mhl5lidbq = this.iMyQMM6Qj;
        Objects.requireNonNull(mhl5lidbq);
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z2 = false;
                                while (i < repeatCount && mhl5lidbq.Bhmn1KIah(i2, null)) {
                                    i++;
                                    z2 = true;
                                }
                                z = z2;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = mhl5lidbq.CBQ5d1kRq;
                    if (i3 != Integer.MIN_VALUE) {
                        mhl5lidbq.MzoOEjc4X(i3, 16, null);
                    }
                    z = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z = mhl5lidbq.Bhmn1KIah(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z = mhl5lidbq.Bhmn1KIah(1, null);
            }
        }
        if (!z || this.iMyQMM6Qj.CBQ5d1kRq == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView, android.widget.CompoundButton, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        boolean z = false;
        int i = 0;
        z = false;
        if (rG2GI7LDp != null && RG2GI7LDp.mUqPm6GBh(rG2GI7LDp.wIZEdYHUn)) {
            RG2GI7LDp rG2GI7LDp2 = this.PSTqBLTET;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.sk5s77z6Q) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.ixWaw2akD) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.RG6kpfv3v) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.sk5s77z6Q) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.ixWaw2akD) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.RG6kpfv3v) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            z = rG2GI7LDp2.XYT7vJqNO(iArr);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.TextView, android.widget.CompoundButton, android.widget.Button, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!kCA6Zs9sL()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return (!(parent instanceof ChipGroup) || !((ChipGroup) parent).qVUwofr5s) ? "android.widget.CompoundButton" : "android.widget.RadioButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.MzoOEjc4X;
        return insetDrawable == null ? this.PSTqBLTET : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.kktL0P5MG;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.KBYw84i3W;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.i0Zug1mVk;
        }
        return null;
    }

    public float getChipCornerRadius() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return Math.max(0.0f, rG2GI7LDp.CpG0imbht());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.PSTqBLTET;
    }

    public float getChipEndPadding() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.lqFHPHdW3;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp == null || (drawable = rG2GI7LDp.j22ftfeNI) == null) {
            return null;
        }
        return m84IdhKaW.q3BipwRCk(drawable);
    }

    public float getChipIconSize() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.L4EwGfXiQ;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.QSbMsHU5X;
        }
        return null;
    }

    public float getChipMinHeight() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.o4LF8RkoQ;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.ln3nf7LH3;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.QNqj6nIzv;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.igRQEZxnW;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.qFBXIgpia();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.BL4OzhZBd;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.KlYagMRWx;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.OpLJtmvFM;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.buPcffgdD;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.n4UIOvAko;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.GpWTsCbvo;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.cAwN510t2) {
            mhl5lIdbQ mhl5lidbq = this.iMyQMM6Qj;
            if (mhl5lidbq.CBQ5d1kRq == 1 || mhl5lidbq.vPSbyrYWX == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public Yg5AJdYv8 getHideMotionSpec() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.SuKhTJIQc;
        }
        return null;
    }

    public float getIconEndPadding() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.M66hQ219i;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.Dr7UqlxEV;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.EBQXiIPmm;
        }
        return null;
    }

    public xT3tobMV0 getShapeAppearanceModel() {
        return this.PSTqBLTET.CBQ5d1kRq.q3BipwRCk;
    }

    public Yg5AJdYv8 getShowMotionSpec() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.INnK5Rew6;
        }
        return null;
    }

    public float getTextEndPadding() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.IG30YE5GU;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.R2hkbNqWf;
        }
        return 0.0f;
    }

    public boolean iiGwOFFnr() {
        boolean z = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.qVUwofr5s;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        if (this.cAwN510t2) {
            this.iMyQMM6Qj.Eeka1udhb(1, 1);
        }
        return z;
    }

    public boolean kCA6Zs9sL() {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        return rG2GI7LDp != null && rG2GI7LDp.DuuXfa7LE;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        dnBSj5uJN.cAwN510t2(this, this.PSTqBLTET);
    }

    @Override // android.widget.TextView, android.widget.CompoundButton, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, AqaWJg0b4);
        }
        if (kCA6Zs9sL()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, mUqPm6GBh);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.cAwN510t2) {
            mhl5lIdbQ mhl5lidbq = this.iMyQMM6Qj;
            int i2 = mhl5lidbq.CBQ5d1kRq;
            if (i2 != Integer.MIN_VALUE) {
                mhl5lidbq.vPSbyrYWX(i2);
            }
            if (z) {
                mhl5lidbq.Bhmn1KIah(i, rect);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                z = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        z = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(z);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(kCA6Zs9sL());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            int i2 = -1;
            if (chipGroup.Bhmn1KIah) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= chipGroup.getChildCount()) {
                        i4 = -1;
                        break;
                    }
                    if (chipGroup.getChildAt(i3) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i3)) == this) {
                            break;
                        }
                        i4++;
                    }
                    i3++;
                }
                i = i4;
            } else {
                i = -1;
            }
            Object tag = getTag(R.id.row_index_key);
            if (tag instanceof Integer) {
                i2 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) IqwHQ6O2l.aXI58Y1kr.q3BipwRCk(i2, 1, i, 1, false, isChecked()).q3BipwRCk);
        }
    }

    @Override // android.widget.TextView, android.widget.Button, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.i8XZMQc6Z != i) {
            this.i8XZMQc6Z = i;
            oon79WMrY();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.RG6kpfv3v) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z = true;
                    }
                }
                z = false;
            } else if (this.RG6kpfv3v) {
                iiGwOFFnr();
                z = true;
                setCloseIconPressed(false);
            }
            z = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z = true;
            }
            z = false;
        }
        return z || super.onTouchEvent(motionEvent);
    }

    public final void oon79WMrY() {
        RG2GI7LDp rG2GI7LDp;
        if (!TextUtils.isEmpty(getText()) && (rG2GI7LDp = this.PSTqBLTET) != null) {
            int IytU16YUK = (int) (rG2GI7LDp.IytU16YUK() + rG2GI7LDp.lqFHPHdW3 + rG2GI7LDp.IG30YE5GU);
            RG2GI7LDp rG2GI7LDp2 = this.PSTqBLTET;
            int dfpT1j18n = (int) (rG2GI7LDp2.dfpT1j18n() + rG2GI7LDp2.ln3nf7LH3 + rG2GI7LDp2.R2hkbNqWf);
            if (this.MzoOEjc4X != null) {
                Rect rect = new Rect();
                this.MzoOEjc4X.getPadding(rect);
                dfpT1j18n += rect.left;
                IytU16YUK += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            RBJDIwG1D.vPSbyrYWX(this, dfpT1j18n, paddingTop, IytU16YUK, paddingBottom);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.ilHKhw3Yw) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.ilHKhw3Yw) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.i0Zug1mVk(z);
        }
    }

    public void setCheckableResource(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.i0Zug1mVk(rG2GI7LDp.oesmsHQJU.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp == null) {
            this.dXrmkklc8 = z;
        } else if (rG2GI7LDp.DuuXfa7LE) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.Eeka1udhb) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.o4LF8RkoQ(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.o4LF8RkoQ(C8A1BseZU.q3BipwRCk(rG2GI7LDp.oesmsHQJU, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.V9LQMKGJe(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            Context context = rG2GI7LDp.oesmsHQJU;
            ThreadLocal threadLocal = C8A1BseZU.q3BipwRCk;
            rG2GI7LDp.V9LQMKGJe(context.getColorStateList(i));
        }
    }

    public void setCheckedIconVisible(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.QNqj6nIzv(rG2GI7LDp.oesmsHQJU.getResources().getBoolean(i));
        }
    }

    public void setCheckedIconVisible(boolean z) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.QNqj6nIzv(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null && rG2GI7LDp.i0Zug1mVk != colorStateList) {
            rG2GI7LDp.i0Zug1mVk = colorStateList;
            rG2GI7LDp.onStateChange(rG2GI7LDp.getState());
        }
    }

    public void setChipBackgroundColorResource(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            Context context = rG2GI7LDp.oesmsHQJU;
            ThreadLocal threadLocal = C8A1BseZU.q3BipwRCk;
            rG2GI7LDp.igRQEZxnW(context.getColorStateList(i));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.EBQXiIPmm(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.EBQXiIPmm(rG2GI7LDp.oesmsHQJU.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(RG2GI7LDp rG2GI7LDp) {
        RG2GI7LDp rG2GI7LDp2 = this.PSTqBLTET;
        if (rG2GI7LDp2 != rG2GI7LDp) {
            if (rG2GI7LDp2 != null) {
                rG2GI7LDp2.eUlgH2VO7 = new WeakReference(null);
            }
            this.PSTqBLTET = rG2GI7LDp;
            rG2GI7LDp.eylCJcWC7 = false;
            Objects.requireNonNull(rG2GI7LDp);
            rG2GI7LDp.eUlgH2VO7 = new WeakReference(this);
            tGV7Q6urW(this.dfpT1j18n);
        }
    }

    public void setChipEndPadding(float f) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null && rG2GI7LDp.lqFHPHdW3 != f) {
            rG2GI7LDp.lqFHPHdW3 = f;
            rG2GI7LDp.invalidateSelf();
            rG2GI7LDp.NyWTwPF6V();
        }
    }

    public void setChipEndPaddingResource(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.TyB1UUd72(rG2GI7LDp.oesmsHQJU.getResources().getDimension(i));
        }
    }

    public void setChipIcon(Drawable drawable) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.juJ6pnCpu(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.juJ6pnCpu(C8A1BseZU.q3BipwRCk(rG2GI7LDp.oesmsHQJU, i));
        }
    }

    public void setChipIconSize(float f) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.j22ftfeNI(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.j22ftfeNI(rG2GI7LDp.oesmsHQJU.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.QSbMsHU5X(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            Context context = rG2GI7LDp.oesmsHQJU;
            ThreadLocal threadLocal = C8A1BseZU.q3BipwRCk;
            rG2GI7LDp.QSbMsHU5X(context.getColorStateList(i));
        }
    }

    public void setChipIconVisible(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.L4EwGfXiQ(rG2GI7LDp.oesmsHQJU.getResources().getBoolean(i));
        }
    }

    public void setChipIconVisible(boolean z) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.L4EwGfXiQ(z);
        }
    }

    public void setChipMinHeight(float f) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null && rG2GI7LDp.o4LF8RkoQ != f) {
            rG2GI7LDp.o4LF8RkoQ = f;
            rG2GI7LDp.invalidateSelf();
            rG2GI7LDp.NyWTwPF6V();
        }
    }

    public void setChipMinHeightResource(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.zHl31GGXU(rG2GI7LDp.oesmsHQJU.getResources().getDimension(i));
        }
    }

    public void setChipStartPadding(float f) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null && rG2GI7LDp.ln3nf7LH3 != f) {
            rG2GI7LDp.ln3nf7LH3 = f;
            rG2GI7LDp.invalidateSelf();
            rG2GI7LDp.NyWTwPF6V();
        }
    }

    public void setChipStartPaddingResource(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.ziwPzaoF3(rG2GI7LDp.oesmsHQJU.getResources().getDimension(i));
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.wIZEdYHUn(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            Context context = rG2GI7LDp.oesmsHQJU;
            ThreadLocal threadLocal = C8A1BseZU.q3BipwRCk;
            rG2GI7LDp.wIZEdYHUn(context.getColorStateList(i));
        }
    }

    public void setChipStrokeWidth(float f) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.IzM1cD9ly(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.IzM1cD9ly(rG2GI7LDp.oesmsHQJU.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.n4UIOvAko(drawable);
        }
        Puu3Rhg4F();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null && rG2GI7LDp.BL4OzhZBd != charSequence) {
            pDLEDo7dT tGV7Q6urW = pDLEDo7dT.tGV7Q6urW();
            rG2GI7LDp.BL4OzhZBd = tGV7Q6urW.dIocxURUo(charSequence, tGV7Q6urW.tGV7Q6urW, true);
            rG2GI7LDp.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.OpLJtmvFM(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.OpLJtmvFM(rG2GI7LDp.oesmsHQJU.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.n4UIOvAko(C8A1BseZU.q3BipwRCk(rG2GI7LDp.oesmsHQJU, i));
        }
        Puu3Rhg4F();
    }

    public void setCloseIconSize(float f) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.BL4OzhZBd(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.BL4OzhZBd(rG2GI7LDp.oesmsHQJU.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.DuuXfa7LE(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.DuuXfa7LE(rG2GI7LDp.oesmsHQJU.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.kktL0P5MG(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            Context context = rG2GI7LDp.oesmsHQJU;
            ThreadLocal threadLocal = C8A1BseZU.q3BipwRCk;
            rG2GI7LDp.kktL0P5MG(context.getColorStateList(i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.KBYw84i3W(z);
        }
        Puu3Rhg4F();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rbhQaQiIi rbhqaqiii = rG2GI7LDp.CBQ5d1kRq;
            if (rbhqaqiii.PSTqBLTET != f) {
                rbhqaqiii.PSTqBLTET = f;
                rG2GI7LDp.sk5s77z6Q();
            }
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.PSTqBLTET != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
                if (rG2GI7LDp != null) {
                    rG2GI7LDp.GpWTsCbvo = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.WaUP0CF08 = z;
        tGV7Q6urW(this.dfpT1j18n);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(Yg5AJdYv8 yg5AJdYv8) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.SuKhTJIQc = yg5AJdYv8;
        }
    }

    public void setHideMotionSpecResource(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.SuKhTJIQc = Yg5AJdYv8.J4Ux7ym32(rG2GI7LDp.oesmsHQJU, i);
        }
    }

    public void setIconEndPadding(float f) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.INnK5Rew6(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.INnK5Rew6(rG2GI7LDp.oesmsHQJU.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.SuKhTJIQc(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.SuKhTJIQc(rG2GI7LDp.oesmsHQJU.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.PSTqBLTET != null) {
            super.setLayoutDirection(i);
        }
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.D91ZKn9BG = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.Eeka1udhb = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.qVUwofr5s = onClickListener;
        Puu3Rhg4F();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.ln3nf7LH3(colorStateList);
        }
        if (!this.PSTqBLTET.XGA7b0zuB) {
            yWvV4ePLl();
        }
    }

    public void setRippleColorResource(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            Context context = rG2GI7LDp.oesmsHQJU;
            ThreadLocal threadLocal = C8A1BseZU.q3BipwRCk;
            rG2GI7LDp.ln3nf7LH3(context.getColorStateList(i));
            if (!this.PSTqBLTET.XGA7b0zuB) {
                yWvV4ePLl();
            }
        }
    }

    @Override // con.rUYFcNk3O
    public void setShapeAppearanceModel(xT3tobMV0 xt3tobmv0) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        rG2GI7LDp.CBQ5d1kRq.q3BipwRCk = xt3tobmv0;
        rG2GI7LDp.invalidateSelf();
    }

    public void setShowMotionSpec(Yg5AJdYv8 yg5AJdYv8) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.INnK5Rew6 = yg5AJdYv8;
        }
    }

    public void setShowMotionSpecResource(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.INnK5Rew6 = Yg5AJdYv8.J4Ux7ym32(rG2GI7LDp.oesmsHQJU, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(rG2GI7LDp.eylCJcWC7 ? null : charSequence, bufferType);
            RG2GI7LDp rG2GI7LDp2 = this.PSTqBLTET;
            if (rG2GI7LDp2 != null) {
                rG2GI7LDp2.Dr7UqlxEV(charSequence);
            }
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.M66hQ219i(new avTFec6Zj(rG2GI7LDp.oesmsHQJU, i));
        }
        vPSbyrYWX();
    }

    public void setTextAppearance(avTFec6Zj avtfec6zj) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.M66hQ219i(avtfec6zj);
        }
        vPSbyrYWX();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null && rG2GI7LDp.IG30YE5GU != f) {
            rG2GI7LDp.IG30YE5GU = f;
            rG2GI7LDp.invalidateSelf();
            rG2GI7LDp.NyWTwPF6V();
        }
    }

    public void setTextEndPaddingResource(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.R2hkbNqWf(rG2GI7LDp.oesmsHQJU.getResources().getDimension(i));
        }
    }

    public void setTextStartPadding(float f) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null && rG2GI7LDp.R2hkbNqWf != f) {
            rG2GI7LDp.R2hkbNqWf = f;
            rG2GI7LDp.invalidateSelf();
            rG2GI7LDp.NyWTwPF6V();
        }
    }

    public void setTextStartPaddingResource(int i) {
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.IG30YE5GU(rG2GI7LDp.oesmsHQJU.getResources().getDimension(i));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
        if (r0.right == r7) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean tGV7Q6urW(int i) {
        this.dfpT1j18n = i;
        int i2 = 0;
        if (!this.WaUP0CF08) {
            if (this.MzoOEjc4X != null) {
                GPLPRo6go();
            } else {
                int[] iArr = FXBYEZrfX.q3BipwRCk;
                yWvV4ePLl();
            }
            return false;
        }
        int max = Math.max(0, i - ((int) this.PSTqBLTET.o4LF8RkoQ));
        int max2 = Math.max(0, i - this.PSTqBLTET.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            int i3 = max2 > 0 ? max2 / 2 : 0;
            if (max > 0) {
                i2 = max / 2;
            }
            if (this.MzoOEjc4X != null) {
                Rect rect = new Rect();
                this.MzoOEjc4X.getPadding(rect);
                if (rect.top == i2) {
                    if (rect.bottom == i2) {
                        if (rect.left == i3) {
                        }
                    }
                }
            }
            if (getMinHeight() != i) {
                setMinHeight(i);
            }
            if (getMinWidth() != i) {
                setMinWidth(i);
            }
            this.MzoOEjc4X = new InsetDrawable((Drawable) this.PSTqBLTET, i3, i2, i3, i2);
            int[] iArr2 = FXBYEZrfX.q3BipwRCk;
            yWvV4ePLl();
            return true;
        }
        if (this.MzoOEjc4X != null) {
            GPLPRo6go();
        } else {
            int[] iArr3 = FXBYEZrfX.q3BipwRCk;
            yWvV4ePLl();
        }
        return false;
    }

    public final void vPSbyrYWX() {
        TextPaint paint = getPaint();
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            paint.drawableState = rG2GI7LDp.getState();
        }
        avTFec6Zj textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.kCA6Zs9sL(getContext(), paint, this.qFBXIgpia);
        }
    }

    public final void yWvV4ePLl() {
        this.ilHKhw3Yw = new RippleDrawable(FXBYEZrfX.q3BipwRCk(this.PSTqBLTET.EBQXiIPmm), getBackgroundDrawable(), null);
        this.PSTqBLTET.buPcffgdD(false);
        RippleDrawable rippleDrawable = this.ilHKhw3Yw;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        VCCyeOu6I.ilHKhw3Yw(this, rippleDrawable);
        oon79WMrY();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        RG2GI7LDp rG2GI7LDp = this.PSTqBLTET;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.M66hQ219i(new avTFec6Zj(rG2GI7LDp.oesmsHQJU, i));
        }
        vPSbyrYWX();
    }
}
