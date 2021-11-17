package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
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
import android.util.Log;
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
import con.RBJDIwG1D;
import con.SQ4Lz5bqj;
import con.VCCyeOu6I;
import con.Yg5AJdYv8;
import con.avTFec6Zj;
import con.dnBSj5uJN;
import con.m84IdhKaW;
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
    public Chip(android.content.Context r19, android.util.AttributeSet r20) {
        /*
        // Method dump skipped, instructions count: 877
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
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
    public boolean dispatchHoverEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.cAwN510t2
            if (r0 != 0) goto L_0x0009
            boolean r10 = super.dispatchHoverEvent(r10)
            return r10
        L_0x0009:
            com.google.android.material.chip.Chip$mhl5lIdbQ r0 = r9.iMyQMM6Qj
            android.view.accessibility.AccessibilityManager r1 = r0.Puu3Rhg4F
            boolean r1 = r1.isEnabled()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0074
            android.view.accessibility.AccessibilityManager r1 = r0.Puu3Rhg4F
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L_0x001e
            goto L_0x0074
        L_0x001e:
            int r1 = r10.getAction()
            r4 = 7
            r5 = 256(0x100, float:3.59E-43)
            r6 = 128(0x80, float:1.794E-43)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r4) goto L_0x0044
            r4 = 9
            if (r1 == r4) goto L_0x0044
            r4 = 10
            if (r1 == r4) goto L_0x0034
            goto L_0x0074
        L_0x0034:
            int r1 = r0.kmSgne1rO
            if (r1 == r7) goto L_0x0074
            if (r1 != r7) goto L_0x003b
            goto L_0x0072
        L_0x003b:
            r0.kmSgne1rO = r7
            r0.Eeka1udhb(r7, r6)
            r0.Eeka1udhb(r1, r5)
            goto L_0x0072
        L_0x0044:
            float r1 = r10.getX()
            float r4 = r10.getY()
            com.google.android.material.chip.Chip r8 = com.google.android.material.chip.Chip.this
            boolean r8 = r8.dIocxURUo()
            if (r8 == 0) goto L_0x0062
            com.google.android.material.chip.Chip r8 = com.google.android.material.chip.Chip.this
            android.graphics.RectF r8 = q3BipwRCk(r8)
            boolean r1 = r8.contains(r1, r4)
            if (r1 == 0) goto L_0x0062
            r1 = r2
            goto L_0x0063
        L_0x0062:
            r1 = r3
        L_0x0063:
            int r4 = r0.kmSgne1rO
            if (r4 != r1) goto L_0x0068
            goto L_0x0070
        L_0x0068:
            r0.kmSgne1rO = r1
            r0.Eeka1udhb(r1, r6)
            r0.Eeka1udhb(r4, r5)
        L_0x0070:
            if (r1 == r7) goto L_0x0074
        L_0x0072:
            r0 = r2
            goto L_0x0075
        L_0x0074:
            r0 = r3
        L_0x0075:
            if (r0 != 0) goto L_0x007f
            boolean r10 = super.dispatchHoverEvent(r10)
            if (r10 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r2 = r3
        L_0x007f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
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
        /*
            r4 = this;
            super.drawableStateChanged()
            com.google.android.material.chip.RG2GI7LDp r0 = r4.PSTqBLTET
            r1 = 0
            if (r0 == 0) goto L_0x006e
            android.graphics.drawable.Drawable r0 = r0.wIZEdYHUn
            boolean r0 = com.google.android.material.chip.RG2GI7LDp.mUqPm6GBh(r0)
            if (r0 == 0) goto L_0x006e
            com.google.android.material.chip.RG2GI7LDp r0 = r4.PSTqBLTET
            boolean r2 = r4.isEnabled()
            boolean r3 = r4.sk5s77z6Q
            if (r3 == 0) goto L_0x001c
            int r2 = r2 + 1
        L_0x001c:
            boolean r3 = r4.ixWaw2akD
            if (r3 == 0) goto L_0x0022
            int r2 = r2 + 1
        L_0x0022:
            boolean r3 = r4.RG6kpfv3v
            if (r3 == 0) goto L_0x0028
            int r2 = r2 + 1
        L_0x0028:
            boolean r3 = r4.isChecked()
            if (r3 == 0) goto L_0x0030
            int r2 = r2 + 1
        L_0x0030:
            int[] r2 = new int[r2]
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L_0x003e
            r3 = 16842910(0x101009e, float:2.3694E-38)
            r2[r1] = r3
            r1 = 1
        L_0x003e:
            boolean r3 = r4.sk5s77z6Q
            if (r3 == 0) goto L_0x0049
            r3 = 16842908(0x101009c, float:2.3693995E-38)
            r2[r1] = r3
            int r1 = r1 + 1
        L_0x0049:
            boolean r3 = r4.ixWaw2akD
            if (r3 == 0) goto L_0x0054
            r3 = 16843623(0x1010367, float:2.3696E-38)
            r2[r1] = r3
            int r1 = r1 + 1
        L_0x0054:
            boolean r3 = r4.RG6kpfv3v
            if (r3 == 0) goto L_0x005f
            r3 = 16842919(0x10100a7, float:2.3694026E-38)
            r2[r1] = r3
            int r1 = r1 + 1
        L_0x005f:
            boolean r3 = r4.isChecked()
            if (r3 == 0) goto L_0x006a
            r3 = 16842913(0x10100a1, float:2.369401E-38)
            r2[r1] = r3
        L_0x006a:
            boolean r1 = r0.XYT7vJqNO(r2)
        L_0x006e:
            if (r1 == 0) goto L_0x0073
            r4.invalidate()
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.drawableStateChanged():void");
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
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.RG6kpfv3v
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.RG6kpfv3v
            if (r0 == 0) goto L_0x0034
            r5.iiGwOFFnr()
            r0 = r3
            goto L_0x0035
        L_0x0034:
            r0 = r2
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = r3
            goto L_0x0041
        L_0x0040:
            r0 = r2
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = r3
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
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
    public boolean tGV7Q6urW(int r10) {
        /*
            r9 = this;
            r9.dfpT1j18n = r10
            boolean r0 = r9.WaUP0CF08
            r1 = 0
            if (r0 != 0) goto L_0x0015
            android.graphics.drawable.InsetDrawable r10 = r9.MzoOEjc4X
            if (r10 == 0) goto L_0x000f
            r9.GPLPRo6go()
            goto L_0x0014
        L_0x000f:
            int[] r10 = con.FXBYEZrfX.q3BipwRCk
            r9.yWvV4ePLl()
        L_0x0014:
            return r1
        L_0x0015:
            com.google.android.material.chip.RG2GI7LDp r0 = r9.PSTqBLTET
            float r0 = r0.o4LF8RkoQ
            int r0 = (int) r0
            int r0 = r10 - r0
            int r0 = java.lang.Math.max(r1, r0)
            com.google.android.material.chip.RG2GI7LDp r2 = r9.PSTqBLTET
            int r2 = r2.getIntrinsicWidth()
            int r2 = r10 - r2
            int r2 = java.lang.Math.max(r1, r2)
            if (r2 > 0) goto L_0x003e
            if (r0 > 0) goto L_0x003e
            android.graphics.drawable.InsetDrawable r10 = r9.MzoOEjc4X
            if (r10 == 0) goto L_0x0038
            r9.GPLPRo6go()
            goto L_0x003d
        L_0x0038:
            int[] r10 = con.FXBYEZrfX.q3BipwRCk
            r9.yWvV4ePLl()
        L_0x003d:
            return r1
        L_0x003e:
            if (r2 <= 0) goto L_0x0044
            int r2 = r2 / 2
            r7 = r2
            goto L_0x0045
        L_0x0044:
            r7 = r1
        L_0x0045:
            if (r0 <= 0) goto L_0x0049
            int r1 = r0 / 2
        L_0x0049:
            r8 = r1
            android.graphics.drawable.InsetDrawable r0 = r9.MzoOEjc4X
            r1 = 1
            if (r0 == 0) goto L_0x006f
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.drawable.InsetDrawable r2 = r9.MzoOEjc4X
            r2.getPadding(r0)
            int r2 = r0.top
            if (r2 != r8) goto L_0x006f
            int r2 = r0.bottom
            if (r2 != r8) goto L_0x006f
            int r2 = r0.left
            if (r2 != r7) goto L_0x006f
            int r0 = r0.right
            if (r0 != r7) goto L_0x006f
        L_0x0069:
            int[] r10 = con.FXBYEZrfX.q3BipwRCk
            r9.yWvV4ePLl()
            return r1
        L_0x006f:
            int r0 = r9.getMinHeight()
            if (r0 == r10) goto L_0x0078
            r9.setMinHeight(r10)
        L_0x0078:
            int r0 = r9.getMinWidth()
            if (r0 == r10) goto L_0x0081
            r9.setMinWidth(r10)
        L_0x0081:
            android.graphics.drawable.InsetDrawable r10 = new android.graphics.drawable.InsetDrawable
            com.google.android.material.chip.RG2GI7LDp r4 = r9.PSTqBLTET
            r3 = r10
            r5 = r7
            r6 = r8
            r3.<init>(r4, r5, r6, r7, r8)
            r9.MzoOEjc4X = r10
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.tGV7Q6urW(int):boolean");
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
