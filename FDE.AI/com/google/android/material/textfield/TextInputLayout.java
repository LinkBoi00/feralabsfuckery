package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.feravolt.preload.R;
import com.google.android.material.internal.CheckableImageButton;
import con.Ay5WVso1Y;
import con.C8A1BseZU;
import con.CZ8R7FG4y;
import con.D856HTNqd;
import con.DJbXkgfuR;
import con.DptFihFec;
import con.GC006c8s6;
import con.IuQbWntsc;
import con.MNvNWu3oH;
import con.N9VbYkh38;
import con.RBJDIwG1D;
import con.VCCyeOu6I;
import con.XczobwRut;
import con.XflkRyC2J;
import con.Y4wRqkFOh;
import con.abGBwSu8x;
import con.avTFec6Zj;
import con.dOSsQaJVg;
import con.iFKnyAZAM;
import con.jHwJ5gMKj;
import con.jSmvdSgdz;
import con.mN6fklC4R;
import con.nHNpaD9No;
import con.pDLEDo7dT;
import con.qs7k2SwdW;
import con.rf3cOyxnl;
import con.srLS6zLvm;
import con.vC6Qh7mvD;
import con.vZAFqpduB;
import con.wc5pSEgHR;
import con.xKPlRztCM;
import con.xT3tobMV0;
import con.y5oh9NJPA;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    public xKPlRztCM AqaWJg0b4;
    public final LinearLayout Bhmn1KIah;
    public ColorStateList BqpzfZavo;
    public final FrameLayout CBQ5d1kRq;
    public int CMnfe2r2N;
    public ColorStateList CpG0imbht;
    public boolean D91ZKn9BG;
    public ValueAnimator DEe4ujgEA;
    public boolean Dr7UqlxEV;
    public boolean EBQXiIPmm;
    public boolean GpWTsCbvo;
    public View.OnLongClickListener IG30YE5GU;
    public ColorStateList INnK5Rew6;
    public boolean Ihm5o4uLx;
    public TextView IytU16YUK;
    public int IzM1cD9ly;
    public Drawable JxIJId84K;
    public final CheckableImageButton KBYw84i3W;
    public int L4EwGfXiQ;
    public int LFW0KvNFt;
    public Drawable M66hQ219i;
    public EditText MzoOEjc4X;
    public ColorStateList NyWTwPF6V;
    public int OpLJtmvFM;
    public int OuoYhTxyj;
    public boolean PGC7L87Ev;
    public final FrameLayout PSTqBLTET;
    public boolean QNqj6nIzv;
    public final int QSbMsHU5X;
    public int R2hkbNqWf;
    public boolean RG6kpfv3v;
    public ColorStateList ShSN9wbzk;
    public boolean SuKhTJIQc;
    public PorterDuff.Mode Ta2zrwkcM;
    public dOSsQaJVg TyB1UUd72;
    public final TextView V9LQMKGJe;
    public TextView WaUP0CF08;
    public int XGA7b0zuB;
    public int Xeg1rC5FI;
    public Drawable a8N8UmDyD;
    public final CheckableImageButton aS2AFthYA;
    public boolean cAwN510t2;
    public int dfpT1j18n;
    public int eUlgH2VO7;
    public final N9VbYkh38 eylCJcWC7;
    public View.OnLongClickListener hKeU0pt2N;
    public final TextView i0Zug1mVk;
    public int i8XZMQc6Z;
    public CharSequence iMyQMM6Qj;
    public int ifDs8fRNm;
    public CharSequence igRQEZxnW;
    public CharSequence ilHKhw3Yw;
    public int ixWaw2akD;
    public xT3tobMV0 j22ftfeNI;
    public dOSsQaJVg juJ6pnCpu;
    public Typeface kktL0P5MG;
    public final LinearLayout kmSgne1rO;
    public ColorStateList koMoKnP1S;
    public PorterDuff.Mode ln3nf7LH3;
    public final SparseArray lqFHPHdW3;
    public ColorStateList mUqPm6GBh;
    public int n4UIOvAko;
    public xKPlRztCM nlGCs0NZs;
    public CharSequence o4LF8RkoQ;
    public int oRfL5Lv1q;
    public final CheckableImageButton oesmsHQJU;
    public boolean pwwzaxl9D;
    public int qFBXIgpia;
    public boolean sk5s77z6Q;
    public View.OnLongClickListener suAKJqyYV;
    public ColorStateList tFD7BDQ71;
    public ColorStateList tTcQQNK5P;
    public boolean uSBmk4hFZ;
    public int vIbyhVf1d;
    public CharSequence vNtjxmzUM;
    public int wIZEdYHUn;
    public boolean zH62iiANw;
    public int zHl31GGXU;
    public int ziwPzaoF3;
    public int qVUwofr5s = -1;
    public int Eeka1udhb = -1;
    public final GC006c8s6 dXrmkklc8 = new GC006c8s6(this);
    public final Rect BL4OzhZBd = new Rect();
    public final Rect DuuXfa7LE = new Rect();
    public final RectF XYT7vJqNO = new RectF();
    public final LinkedHashSet buPcffgdD = new LinkedHashSet();
    public int KlYagMRWx = 0;
    public final LinkedHashSet YmNRDyka4 = new LinkedHashSet();

    /* loaded from: classes.dex */
    public static class PMYI4lLJM extends con.s7MlVynBG {
        public static final Parcelable.Creator<PMYI4lLJM> CREATOR = new jSmvdSgdz(3);
        public CharSequence Bhmn1KIah;
        public CharSequence MzoOEjc4X;
        public boolean PSTqBLTET;
        public CharSequence ilHKhw3Yw;
        public CharSequence qVUwofr5s;

        public PMYI4lLJM(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Bhmn1KIah = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.PSTqBLTET = parcel.readInt() != 1 ? false : true;
            this.MzoOEjc4X = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.ilHKhw3Yw = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.qVUwofr5s = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public PMYI4lLJM(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("TextInputLayout.SavedState{");
            q3BipwRCk.append(Integer.toHexString(System.identityHashCode(this)));
            q3BipwRCk.append(" error=");
            q3BipwRCk.append((Object) this.Bhmn1KIah);
            q3BipwRCk.append(" hint=");
            q3BipwRCk.append((Object) this.MzoOEjc4X);
            q3BipwRCk.append(" helperText=");
            q3BipwRCk.append((Object) this.ilHKhw3Yw);
            q3BipwRCk.append(" placeholderText=");
            q3BipwRCk.append((Object) this.qVUwofr5s);
            q3BipwRCk.append("}");
            return q3BipwRCk.toString();
        }

        @Override // con.s7MlVynBG, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.CBQ5d1kRq, i);
            TextUtils.writeToParcel(this.Bhmn1KIah, parcel, i);
            parcel.writeInt(this.PSTqBLTET ? 1 : 0);
            TextUtils.writeToParcel(this.MzoOEjc4X, parcel, i);
            TextUtils.writeToParcel(this.ilHKhw3Yw, parcel, i);
            TextUtils.writeToParcel(this.qVUwofr5s, parcel, i);
        }
    }

    /* loaded from: classes.dex */
    public class RG2GI7LDp implements TextWatcher {
        public RG2GI7LDp() {
            TextInputLayout.this = r1;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.iMyQMM6Qj(!textInputLayout.zH62iiANw, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.RG6kpfv3v) {
                textInputLayout2.ixWaw2akD(editable.length());
            }
            TextInputLayout textInputLayout3 = TextInputLayout.this;
            if (textInputLayout3.cAwN510t2) {
                textInputLayout3.cAwN510t2(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes.dex */
    public interface WfopS3efW {
    }

    /* loaded from: classes.dex */
    public class aXI58Y1kr implements Runnable {
        public aXI58Y1kr() {
            TextInputLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.MzoOEjc4X.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public interface dNif5KqqH {
    }

    /* loaded from: classes.dex */
    public class mhl5lIdbQ implements Runnable {
        public mhl5lIdbQ() {
            TextInputLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.oesmsHQJU.performClick();
            TextInputLayout.this.oesmsHQJU.jumpDrawablesToCurrentState();
        }
    }

    /* loaded from: classes.dex */
    public class qhPEQQaQ4 implements ValueAnimator.AnimatorUpdateListener {
        public qhPEQQaQ4() {
            TextInputLayout.this = r1;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.eylCJcWC7.Bhmn1KIah(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes.dex */
    public static class s7MlVynBG extends XflkRyC2J {
        public final TextInputLayout dIocxURUo;

        public s7MlVynBG(TextInputLayout textInputLayout) {
            this.dIocxURUo = textInputLayout;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
            if (r3 != null) goto L_0x008b;
         */
        @Override // con.XflkRyC2J
        /* Code decompiled incorrectly, please refer to instructions dump */
        public void dIocxURUo(android.view.View r13, con.IqwHQ6O2l r14) {
            /*
                r12 = this;
                android.view.View$AccessibilityDelegate r0 = r12.q3BipwRCk
                android.view.accessibility.AccessibilityNodeInfo r1 = r14.q3BipwRCk
                r0.onInitializeAccessibilityNodeInfo(r13, r1)
                com.google.android.material.textfield.TextInputLayout r13 = r12.dIocxURUo
                android.widget.EditText r13 = r13.getEditText()
                if (r13 == 0) goto L_0x0014
                android.text.Editable r0 = r13.getText()
                goto L_0x0015
            L_0x0014:
                r0 = 0
            L_0x0015:
                com.google.android.material.textfield.TextInputLayout r1 = r12.dIocxURUo
                java.lang.CharSequence r1 = r1.getHint()
                com.google.android.material.textfield.TextInputLayout r2 = r12.dIocxURUo
                java.lang.CharSequence r2 = r2.getError()
                com.google.android.material.textfield.TextInputLayout r3 = r12.dIocxURUo
                java.lang.CharSequence r3 = r3.getPlaceholderText()
                com.google.android.material.textfield.TextInputLayout r4 = r12.dIocxURUo
                int r4 = r4.getCounterMaxLength()
                com.google.android.material.textfield.TextInputLayout r5 = r12.dIocxURUo
                java.lang.CharSequence r5 = r5.getCounterOverflowDescription()
                boolean r6 = android.text.TextUtils.isEmpty(r0)
                r7 = 1
                r6 = r6 ^ r7
                boolean r8 = android.text.TextUtils.isEmpty(r1)
                r8 = r8 ^ r7
                com.google.android.material.textfield.TextInputLayout r9 = r12.dIocxURUo
                boolean r9 = r9.GpWTsCbvo
                r9 = r9 ^ r7
                boolean r10 = android.text.TextUtils.isEmpty(r2)
                r10 = r10 ^ r7
                if (r10 != 0) goto L_0x0053
                boolean r11 = android.text.TextUtils.isEmpty(r5)
                if (r11 != 0) goto L_0x0051
                goto L_0x0053
            L_0x0051:
                r11 = 0
                goto L_0x0054
            L_0x0053:
                r11 = r7
            L_0x0054:
                if (r8 == 0) goto L_0x005b
                java.lang.String r1 = r1.toString()
                goto L_0x005d
            L_0x005b:
                java.lang.String r1 = ""
            L_0x005d:
                if (r6 == 0) goto L_0x0065
                android.view.accessibility.AccessibilityNodeInfo r3 = r14.q3BipwRCk
                r3.setText(r0)
                goto L_0x0090
            L_0x0065:
                boolean r8 = android.text.TextUtils.isEmpty(r1)
                if (r8 != 0) goto L_0x0089
                android.view.accessibility.AccessibilityNodeInfo r8 = r14.q3BipwRCk
                r8.setText(r1)
                if (r9 == 0) goto L_0x0090
                if (r3 == 0) goto L_0x0090
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r1)
                java.lang.String r9 = ", "
                r8.append(r9)
                r8.append(r3)
                java.lang.String r3 = r8.toString()
                goto L_0x008b
            L_0x0089:
                if (r3 == 0) goto L_0x0090
            L_0x008b:
                android.view.accessibility.AccessibilityNodeInfo r8 = r14.q3BipwRCk
                r8.setText(r3)
            L_0x0090:
                boolean r3 = android.text.TextUtils.isEmpty(r1)
                if (r3 != 0) goto L_0x00a2
                android.view.accessibility.AccessibilityNodeInfo r3 = r14.q3BipwRCk
                r3.setHintText(r1)
                r1 = r6 ^ 1
                android.view.accessibility.AccessibilityNodeInfo r3 = r14.q3BipwRCk
                r3.setShowingHintText(r1)
            L_0x00a2:
                if (r0 == 0) goto L_0x00ab
                int r0 = r0.length()
                if (r0 != r4) goto L_0x00ab
                goto L_0x00ac
            L_0x00ab:
                r4 = -1
            L_0x00ac:
                android.view.accessibility.AccessibilityNodeInfo r0 = r14.q3BipwRCk
                r0.setMaxTextLength(r4)
                if (r11 == 0) goto L_0x00bc
                if (r10 == 0) goto L_0x00b6
                goto L_0x00b7
            L_0x00b6:
                r2 = r5
            L_0x00b7:
                android.view.accessibility.AccessibilityNodeInfo r14 = r14.q3BipwRCk
                r14.setError(r2)
            L_0x00bc:
                if (r13 == 0) goto L_0x00c4
                r14 = 2131296730(0x7f0901da, float:1.8211385E38)
                r13.setLabelFor(r14)
            L_0x00c4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.s7MlVynBG.dIocxURUo(android.view.View, con.IqwHQ6O2l):void");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0592  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0583  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public TextInputLayout(android.content.Context r31, android.util.AttributeSet r32) {
        /*
        // Method dump skipped, instructions count: 1590
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static void Eeka1udhb(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        boolean q3BipwRCk = DptFihFec.q3BipwRCk(checkableImageButton);
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (q3BipwRCk || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(q3BipwRCk);
        checkableImageButton.setPressable(q3BipwRCk);
        checkableImageButton.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        VCCyeOu6I.Eeka1udhb(checkableImageButton, i);
    }

    public static void MzoOEjc4X(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                MzoOEjc4X((ViewGroup) childAt, z);
            }
        }
    }

    private CZ8R7FG4y getEndIconDelegate() {
        CZ8R7FG4y cZ8R7FG4y = (CZ8R7FG4y) this.lqFHPHdW3.get(this.KlYagMRWx);
        return cZ8R7FG4y != null ? cZ8R7FG4y : (CZ8R7FG4y) this.lqFHPHdW3.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.aS2AFthYA.getVisibility() == 0) {
            return this.aS2AFthYA;
        }
        if (!vPSbyrYWX() || !kmSgne1rO()) {
            return null;
        }
        return this.oesmsHQJU;
    }

    private void setEditText(EditText editText) {
        if (this.MzoOEjc4X == null) {
            if (this.KlYagMRWx != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.MzoOEjc4X = editText;
            setMinWidth(this.qVUwofr5s);
            setMaxWidth(this.Eeka1udhb);
            Bhmn1KIah();
            setTextInputAccessibilityDelegate(new s7MlVynBG(this));
            this.eylCJcWC7.MzoOEjc4X(this.MzoOEjc4X.getTypeface());
            N9VbYkh38 n9VbYkh38 = this.eylCJcWC7;
            float textSize = this.MzoOEjc4X.getTextSize();
            if (n9VbYkh38.oon79WMrY != textSize) {
                n9VbYkh38.oon79WMrY = textSize;
                n9VbYkh38.oon79WMrY();
            }
            int gravity = this.MzoOEjc4X.getGravity();
            this.eylCJcWC7.kmSgne1rO((gravity & -113) | 48);
            N9VbYkh38 n9VbYkh382 = this.eylCJcWC7;
            if (n9VbYkh382.Puu3Rhg4F != gravity) {
                n9VbYkh382.Puu3Rhg4F = gravity;
                n9VbYkh382.oon79WMrY();
            }
            this.MzoOEjc4X.addTextChangedListener(new RG2GI7LDp());
            if (this.BqpzfZavo == null) {
                this.BqpzfZavo = this.MzoOEjc4X.getHintTextColors();
            }
            if (this.QNqj6nIzv) {
                if (TextUtils.isEmpty(this.igRQEZxnW)) {
                    CharSequence hint = this.MzoOEjc4X.getHint();
                    this.ilHKhw3Yw = hint;
                    setHint(hint);
                    this.MzoOEjc4X.setHint((CharSequence) null);
                }
                this.EBQXiIPmm = true;
            }
            if (this.WaUP0CF08 != null) {
                ixWaw2akD(this.MzoOEjc4X.getText().length());
            }
            i8XZMQc6Z();
            this.dXrmkklc8.J4Ux7ym32();
            this.kmSgne1rO.bringToFront();
            this.Bhmn1KIah.bringToFront();
            this.PSTqBLTET.bringToFront();
            this.aS2AFthYA.bringToFront();
            Iterator it = this.buPcffgdD.iterator();
            while (it.hasNext()) {
                ((y5oh9NJPA) ((dNif5KqqH) it.next())).q3BipwRCk(this);
            }
            IytU16YUK();
            nlGCs0NZs();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            iMyQMM6Qj(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z) {
        int i = 0;
        this.aS2AFthYA.setVisibility(z ? 0 : 8);
        FrameLayout frameLayout = this.PSTqBLTET;
        if (z) {
            i = 8;
        }
        frameLayout.setVisibility(i);
        nlGCs0NZs();
        if (!vPSbyrYWX()) {
            WaUP0CF08();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.igRQEZxnW)) {
            this.igRQEZxnW = charSequence;
            N9VbYkh38 n9VbYkh38 = this.eylCJcWC7;
            if (charSequence == null || !TextUtils.equals(n9VbYkh38.WaUP0CF08, charSequence)) {
                n9VbYkh38.WaUP0CF08 = charSequence;
                n9VbYkh38.i8XZMQc6Z = null;
                Bitmap bitmap = n9VbYkh38.iMyQMM6Qj;
                if (bitmap != null) {
                    bitmap.recycle();
                    n9VbYkh38.iMyQMM6Qj = null;
                }
                n9VbYkh38.oon79WMrY();
            }
            if (!this.GpWTsCbvo) {
                PSTqBLTET();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.cAwN510t2 != z) {
            if (z) {
                qs7k2SwdW qs7k2swdw = new qs7k2SwdW(getContext());
                this.IytU16YUK = qs7k2swdw;
                qs7k2swdw.setId(R.id.textinput_placeholder);
                xKPlRztCM xkplrztcm = new xKPlRztCM();
                xkplrztcm.Bhmn1KIah = 87;
                TimeInterpolator timeInterpolator = vZAFqpduB.q3BipwRCk;
                xkplrztcm.PSTqBLTET = timeInterpolator;
                this.nlGCs0NZs = xkplrztcm;
                xkplrztcm.kmSgne1rO = 67;
                xKPlRztCM xkplrztcm2 = new xKPlRztCM();
                xkplrztcm2.Bhmn1KIah = 87;
                xkplrztcm2.PSTqBLTET = timeInterpolator;
                this.AqaWJg0b4 = xkplrztcm2;
                mN6fklC4R.iiGwOFFnr(this.IytU16YUK, 1);
                setPlaceholderTextAppearance(this.qFBXIgpia);
                setPlaceholderTextColor(this.CpG0imbht);
                TextView textView = this.IytU16YUK;
                if (textView != null) {
                    this.CBQ5d1kRq.addView(textView);
                    this.IytU16YUK.setVisibility(0);
                }
            } else {
                TextView textView2 = this.IytU16YUK;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                this.IytU16YUK = null;
            }
            this.cAwN510t2 = z;
        }
    }

    public final void AqaWJg0b4() {
        int visibility = this.V9LQMKGJe.getVisibility();
        int i = 0;
        boolean z = this.o4LF8RkoQ != null && !this.GpWTsCbvo;
        TextView textView = this.V9LQMKGJe;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        if (visibility != this.V9LQMKGJe.getVisibility()) {
            getEndIconDelegate().tGV7Q6urW(z);
        }
        WaUP0CF08();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void Bhmn1KIah() {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.Bhmn1KIah():void");
    }

    public final void CBQ5d1kRq() {
        TextView textView = this.IytU16YUK;
        if (textView != null && this.cAwN510t2) {
            textView.setText((CharSequence) null);
            XczobwRut.q3BipwRCk(this.CBQ5d1kRq, this.AqaWJg0b4);
            this.IytU16YUK.setVisibility(4);
        }
    }

    public final void CpG0imbht() {
        this.i0Zug1mVk.setVisibility((this.vNtjxmzUM == null || this.GpWTsCbvo) ? 8 : 0);
        WaUP0CF08();
    }

    public final int GPLPRo6go() {
        float kCA6Zs9sL;
        if (!this.QNqj6nIzv) {
            return 0;
        }
        int i = this.L4EwGfXiQ;
        if (i == 0 || i == 1) {
            kCA6Zs9sL = this.eylCJcWC7.kCA6Zs9sL();
        } else if (i != 2) {
            return 0;
        } else {
            kCA6Zs9sL = this.eylCJcWC7.kCA6Zs9sL() / 2.0f;
        }
        return (int) kCA6Zs9sL;
    }

    public final void IytU16YUK() {
        if (this.MzoOEjc4X != null) {
            int i = 0;
            if (!(this.KBYw84i3W.getVisibility() == 0)) {
                EditText editText = this.MzoOEjc4X;
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                i = RBJDIwG1D.iiGwOFFnr(editText);
            }
            TextView textView = this.i0Zug1mVk;
            int compoundPaddingTop = this.MzoOEjc4X.getCompoundPaddingTop();
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int compoundPaddingBottom = this.MzoOEjc4X.getCompoundPaddingBottom();
            WeakHashMap weakHashMap2 = IuQbWntsc.q3BipwRCk;
            RBJDIwG1D.vPSbyrYWX(textView, i, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
        }
    }

    public void J4Ux7ym32(float f) {
        if (this.eylCJcWC7.tGV7Q6urW != f) {
            if (this.DEe4ujgEA == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.DEe4ujgEA = valueAnimator;
                valueAnimator.setInterpolator(vZAFqpduB.J4Ux7ym32);
                this.DEe4ujgEA.setDuration(167L);
                this.DEe4ujgEA.addUpdateListener(new qhPEQQaQ4());
            }
            this.DEe4ujgEA.setFloatValues(this.eylCJcWC7.tGV7Q6urW, f);
            this.DEe4ujgEA.start();
        }
    }

    public final void PSTqBLTET() {
        float f;
        float f2;
        float f3;
        float f4;
        if (Puu3Rhg4F()) {
            RectF rectF = this.XYT7vJqNO;
            N9VbYkh38 n9VbYkh38 = this.eylCJcWC7;
            int width = this.MzoOEjc4X.getWidth();
            int gravity = this.MzoOEjc4X.getGravity();
            boolean J4Ux7ym32 = n9VbYkh38.J4Ux7ym32(n9VbYkh38.WaUP0CF08);
            n9VbYkh38.dfpT1j18n = J4Ux7ym32;
            if (gravity == 17 || (gravity & 7) == 1) {
                f4 = ((float) width) / 2.0f;
                f3 = n9VbYkh38.EBQXiIPmm / 2.0f;
            } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? !J4Ux7ym32 : J4Ux7ym32) {
                f4 = (float) n9VbYkh38.iiGwOFFnr.right;
                f3 = n9VbYkh38.EBQXiIPmm;
            } else {
                f = (float) n9VbYkh38.iiGwOFFnr.left;
                rectF.left = f;
                Rect rect = n9VbYkh38.iiGwOFFnr;
                float f5 = (float) rect.top;
                rectF.top = f5;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f2 = (((float) width) / 2.0f) + (n9VbYkh38.EBQXiIPmm / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (J4Ux7ym32) {
                        f2 = n9VbYkh38.EBQXiIPmm + f;
                    }
                    f2 = (float) rect.right;
                } else {
                    if (!J4Ux7ym32) {
                        f2 = n9VbYkh38.EBQXiIPmm + f;
                    }
                    f2 = (float) rect.right;
                }
                rectF.right = f2;
                rectF.bottom = n9VbYkh38.kCA6Zs9sL() + f5;
                float f6 = rectF.left;
                float f7 = (float) this.QSbMsHU5X;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset((float) (-getPaddingLeft()), (((float) (-getPaddingTop())) - (rectF.height() / 2.0f)) + ((float) this.ziwPzaoF3));
                Ay5WVso1Y ay5WVso1Y = (Ay5WVso1Y) this.TyB1UUd72;
                Objects.requireNonNull(ay5WVso1Y);
                ay5WVso1Y.WaUP0CF08(rectF.left, rectF.top, rectF.right, rectF.bottom);
            }
            f = f4 - f3;
            rectF.left = f;
            Rect rect2 = n9VbYkh38.iiGwOFFnr;
            float f52 = (float) rect2.top;
            rectF.top = f52;
            if (gravity != 17) {
            }
            f2 = (((float) width) / 2.0f) + (n9VbYkh38.EBQXiIPmm / 2.0f);
            rectF.right = f2;
            rectF.bottom = n9VbYkh38.kCA6Zs9sL() + f52;
            float f62 = rectF.left;
            float f72 = (float) this.QSbMsHU5X;
            rectF.left = f62 - f72;
            rectF.right += f72;
            rectF.offset((float) (-getPaddingLeft()), (((float) (-getPaddingTop())) - (rectF.height() / 2.0f)) + ((float) this.ziwPzaoF3));
            Ay5WVso1Y ay5WVso1Y2 = (Ay5WVso1Y) this.TyB1UUd72;
            Objects.requireNonNull(ay5WVso1Y2);
            ay5WVso1Y2.WaUP0CF08(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    public final boolean Puu3Rhg4F() {
        return this.QNqj6nIzv && !TextUtils.isEmpty(this.igRQEZxnW) && (this.TyB1UUd72 instanceof Ay5WVso1Y);
    }

    public final void RG6kpfv3v() {
        if (this.WaUP0CF08 != null) {
            EditText editText = this.MzoOEjc4X;
            ixWaw2akD(editText == null ? 0 : editText.getText().length());
        }
    }

    public final boolean WaUP0CF08() {
        boolean z;
        if (this.MzoOEjc4X == null) {
            return false;
        }
        boolean z2 = true;
        if (!(getStartIconDrawable() == null && this.vNtjxmzUM == null) && this.kmSgne1rO.getMeasuredWidth() > 0) {
            int measuredWidth = this.kmSgne1rO.getMeasuredWidth() - this.MzoOEjc4X.getPaddingLeft();
            if (this.M66hQ219i == null || this.R2hkbNqWf != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.M66hQ219i = colorDrawable;
                this.R2hkbNqWf = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.MzoOEjc4X.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.M66hQ219i;
            if (drawable != drawable2) {
                this.MzoOEjc4X.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.M66hQ219i != null) {
                Drawable[] compoundDrawablesRelative2 = this.MzoOEjc4X.getCompoundDrawablesRelative();
                this.MzoOEjc4X.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.M66hQ219i = null;
                z = true;
            }
            z = false;
        }
        if ((this.aS2AFthYA.getVisibility() == 0 || ((vPSbyrYWX() && kmSgne1rO()) || this.o4LF8RkoQ != null)) && this.Bhmn1KIah.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.V9LQMKGJe.getMeasuredWidth() - this.MzoOEjc4X.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()).getMarginStart() + endIconToUpdateDummyDrawable.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative3 = this.MzoOEjc4X.getCompoundDrawablesRelative();
            Drawable drawable3 = this.a8N8UmDyD;
            if (drawable3 == null || this.vIbyhVf1d == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.a8N8UmDyD = colorDrawable2;
                    this.vIbyhVf1d = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = compoundDrawablesRelative3[2];
                Drawable drawable5 = this.a8N8UmDyD;
                if (drawable4 != drawable5) {
                    this.JxIJId84K = compoundDrawablesRelative3[2];
                    this.MzoOEjc4X.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.vIbyhVf1d = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.MzoOEjc4X.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.a8N8UmDyD, compoundDrawablesRelative3[3]);
            }
        } else if (this.a8N8UmDyD == null) {
            return z;
        } else {
            Drawable[] compoundDrawablesRelative4 = this.MzoOEjc4X.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.a8N8UmDyD) {
                this.MzoOEjc4X.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.JxIJId84K, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.a8N8UmDyD = null;
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.CBQ5d1kRq.addView(view, layoutParams2);
            this.CBQ5d1kRq.setLayoutParams(layoutParams);
            dfpT1j18n();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public final void cAwN510t2(int i) {
        if (i != 0 || this.GpWTsCbvo) {
            CBQ5d1kRq();
            return;
        }
        TextView textView = this.IytU16YUK;
        if (textView != null && this.cAwN510t2) {
            textView.setText(this.iMyQMM6Qj);
            XczobwRut.q3BipwRCk(this.CBQ5d1kRq, this.nlGCs0NZs);
            this.IytU16YUK.setVisibility(0);
            this.IytU16YUK.bringToFront();
        }
    }

    public final void dIocxURUo() {
        kCA6Zs9sL(this.oesmsHQJU, this.Ihm5o4uLx, this.ShSN9wbzk, this.uSBmk4hFZ, this.Ta2zrwkcM);
    }

    public void dXrmkklc8(TextView textView, int i) {
        boolean z = true;
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            textView.setTextAppearance(2131820979);
            Context context = getContext();
            Object obj = D856HTNqd.q3BipwRCk;
            textView.setTextColor(nHNpaD9No.q3BipwRCk(context, R.color.design_error));
        }
    }

    public final void dfpT1j18n() {
        if (this.L4EwGfXiQ != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.CBQ5d1kRq.getLayoutParams();
            int GPLPRo6go = GPLPRo6go();
            if (GPLPRo6go != layoutParams.topMargin) {
                layoutParams.topMargin = GPLPRo6go;
                this.CBQ5d1kRq.requestLayout();
            }
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.MzoOEjc4X;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.ilHKhw3Yw != null) {
            boolean z = this.EBQXiIPmm;
            this.EBQXiIPmm = false;
            CharSequence hint = editText.getHint();
            this.MzoOEjc4X.setHint(this.ilHKhw3Yw);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.MzoOEjc4X.setHint(hint);
                this.EBQXiIPmm = z;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            viewStructure.setChildCount(this.CBQ5d1kRq.getChildCount());
            for (int i2 = 0; i2 < this.CBQ5d1kRq.getChildCount(); i2++) {
                View childAt = this.CBQ5d1kRq.getChildAt(i2);
                ViewStructure newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.MzoOEjc4X) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.zH62iiANw = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.zH62iiANw = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.QNqj6nIzv) {
            N9VbYkh38 n9VbYkh38 = this.eylCJcWC7;
            Objects.requireNonNull(n9VbYkh38);
            int save = canvas.save();
            if (n9VbYkh38.i8XZMQc6Z != null && n9VbYkh38.J4Ux7ym32) {
                n9VbYkh38.igRQEZxnW.getLineLeft(0);
                n9VbYkh38.nlGCs0NZs.setTextSize(n9VbYkh38.IytU16YUK);
                float f = n9VbYkh38.qVUwofr5s;
                float f2 = n9VbYkh38.Eeka1udhb;
                float f3 = n9VbYkh38.cAwN510t2;
                if (f3 != 1.0f) {
                    canvas.scale(f3, f3, f, f2);
                }
                canvas.translate(f, f2);
                n9VbYkh38.igRQEZxnW.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        dOSsQaJVg dossqajvg = this.juJ6pnCpu;
        if (dossqajvg != null) {
            Rect bounds = dossqajvg.getBounds();
            bounds.top = bounds.bottom - this.ziwPzaoF3;
            this.juJ6pnCpu.draw(canvas);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void drawableStateChanged() {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        if (!this.PGC7L87Ev) {
            boolean z3 = true;
            this.PGC7L87Ev = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            N9VbYkh38 n9VbYkh38 = this.eylCJcWC7;
            if (n9VbYkh38 != null) {
                n9VbYkh38.CpG0imbht = drawableState;
                ColorStateList colorStateList2 = n9VbYkh38.kmSgne1rO;
                if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = n9VbYkh38.CBQ5d1kRq) != null && colorStateList.isStateful())) {
                    n9VbYkh38.oon79WMrY();
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = z2 | false;
            } else {
                z = false;
            }
            if (this.MzoOEjc4X != null) {
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                if (!mN6fklC4R.tGV7Q6urW(this) || !isEnabled()) {
                    z3 = false;
                }
                iMyQMM6Qj(z3, false);
            }
            i8XZMQc6Z();
            mUqPm6GBh();
            if (z) {
                invalidate();
            }
            this.PGC7L87Ev = false;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.MzoOEjc4X;
        if (editText == null) {
            return super.getBaseline();
        }
        return GPLPRo6go() + getPaddingTop() + editText.getBaseline();
    }

    public dOSsQaJVg getBoxBackground() {
        int i = this.L4EwGfXiQ;
        if (i == 1 || i == 2) {
            return this.TyB1UUd72;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.OpLJtmvFM;
    }

    public int getBoxBackgroundMode() {
        return this.L4EwGfXiQ;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.zHl31GGXU;
    }

    public float getBoxCornerRadiusBottomEnd() {
        dOSsQaJVg dossqajvg = this.TyB1UUd72;
        return dossqajvg.CBQ5d1kRq.q3BipwRCk.Puu3Rhg4F.q3BipwRCk(dossqajvg.Puu3Rhg4F());
    }

    public float getBoxCornerRadiusBottomStart() {
        dOSsQaJVg dossqajvg = this.TyB1UUd72;
        return dossqajvg.CBQ5d1kRq.q3BipwRCk.GPLPRo6go.q3BipwRCk(dossqajvg.Puu3Rhg4F());
    }

    public float getBoxCornerRadiusTopEnd() {
        dOSsQaJVg dossqajvg = this.TyB1UUd72;
        return dossqajvg.CBQ5d1kRq.q3BipwRCk.iiGwOFFnr.q3BipwRCk(dossqajvg.Puu3Rhg4F());
    }

    public float getBoxCornerRadiusTopStart() {
        return this.TyB1UUd72.CBQ5d1kRq();
    }

    public int getBoxStrokeColor() {
        return this.OuoYhTxyj;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.tTcQQNK5P;
    }

    public int getBoxStrokeWidth() {
        return this.wIZEdYHUn;
    }

    public int getBoxStrokeWidthFocused() {
        return this.IzM1cD9ly;
    }

    public int getCounterMaxLength() {
        return this.ixWaw2akD;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.RG6kpfv3v || !this.sk5s77z6Q || (textView = this.WaUP0CF08) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.mUqPm6GBh;
    }

    public ColorStateList getCounterTextColor() {
        return this.mUqPm6GBh;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.BqpzfZavo;
    }

    public EditText getEditText() {
        return this.MzoOEjc4X;
    }

    public CharSequence getEndIconContentDescription() {
        return this.oesmsHQJU.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.oesmsHQJU.getDrawable();
    }

    public int getEndIconMode() {
        return this.KlYagMRWx;
    }

    public CheckableImageButton getEndIconView() {
        return this.oesmsHQJU;
    }

    public CharSequence getError() {
        GC006c8s6 gC006c8s6 = this.dXrmkklc8;
        if (gC006c8s6.vPSbyrYWX) {
            return gC006c8s6.oon79WMrY;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.dXrmkklc8.kmSgne1rO;
    }

    public int getErrorCurrentTextColors() {
        return this.dXrmkklc8.GPLPRo6go();
    }

    public Drawable getErrorIconDrawable() {
        return this.aS2AFthYA.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.dXrmkklc8.GPLPRo6go();
    }

    public CharSequence getHelperText() {
        GC006c8s6 gC006c8s6 = this.dXrmkklc8;
        if (gC006c8s6.ilHKhw3Yw) {
            return gC006c8s6.MzoOEjc4X;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.dXrmkklc8.qVUwofr5s;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.QNqj6nIzv) {
            return this.igRQEZxnW;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.eylCJcWC7.kCA6Zs9sL();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.eylCJcWC7.iiGwOFFnr();
    }

    public ColorStateList getHintTextColor() {
        return this.koMoKnP1S;
    }

    public int getMaxWidth() {
        return this.Eeka1udhb;
    }

    public int getMinWidth() {
        return this.qVUwofr5s;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.oesmsHQJU.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.oesmsHQJU.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.cAwN510t2) {
            return this.iMyQMM6Qj;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.qFBXIgpia;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.CpG0imbht;
    }

    public CharSequence getPrefixText() {
        return this.vNtjxmzUM;
    }

    public ColorStateList getPrefixTextColor() {
        return this.i0Zug1mVk.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.i0Zug1mVk;
    }

    public CharSequence getStartIconContentDescription() {
        return this.KBYw84i3W.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.KBYw84i3W.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.o4LF8RkoQ;
    }

    public ColorStateList getSuffixTextColor() {
        return this.V9LQMKGJe.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.V9LQMKGJe;
    }

    public Typeface getTypeface() {
        return this.kktL0P5MG;
    }

    public void i8XZMQc6Z() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.MzoOEjc4X;
        if (editText != null && this.L4EwGfXiQ == 0 && (background = editText.getBackground()) != null) {
            if (Y4wRqkFOh.q3BipwRCk(background)) {
                background = background.mutate();
            }
            if (this.dXrmkklc8.kCA6Zs9sL()) {
                currentTextColor = this.dXrmkklc8.GPLPRo6go();
            } else if (!this.sk5s77z6Q || (textView = this.WaUP0CF08) == null) {
                background.clearColorFilter();
                this.MzoOEjc4X.refreshDrawableState();
                return;
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            background.setColorFilter(srLS6zLvm.tGV7Q6urW(currentTextColor, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void iMyQMM6Qj(boolean z, boolean z2) {
        N9VbYkh38 n9VbYkh38;
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.MzoOEjc4X;
        int i = 0;
        boolean z3 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.MzoOEjc4X;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean kCA6Zs9sL = this.dXrmkklc8.kCA6Zs9sL();
        ColorStateList colorStateList2 = this.BqpzfZavo;
        if (colorStateList2 != null) {
            N9VbYkh38 n9VbYkh382 = this.eylCJcWC7;
            if (n9VbYkh382.kmSgne1rO != colorStateList2) {
                n9VbYkh382.kmSgne1rO = colorStateList2;
                n9VbYkh382.oon79WMrY();
            }
            N9VbYkh38 n9VbYkh383 = this.eylCJcWC7;
            ColorStateList colorStateList3 = this.BqpzfZavo;
            if (n9VbYkh383.CBQ5d1kRq != colorStateList3) {
                n9VbYkh383.CBQ5d1kRq = colorStateList3;
                n9VbYkh383.oon79WMrY();
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.BqpzfZavo;
            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(new int[]{-16842910}, this.eUlgH2VO7) : this.eUlgH2VO7;
            this.eylCJcWC7.CBQ5d1kRq(ColorStateList.valueOf(colorForState));
            N9VbYkh38 n9VbYkh384 = this.eylCJcWC7;
            ColorStateList valueOf = ColorStateList.valueOf(colorForState);
            if (n9VbYkh384.CBQ5d1kRq != valueOf) {
                n9VbYkh384.CBQ5d1kRq = valueOf;
                n9VbYkh384.oon79WMrY();
            }
        } else if (kCA6Zs9sL) {
            N9VbYkh38 n9VbYkh385 = this.eylCJcWC7;
            TextView textView2 = this.dXrmkklc8.CBQ5d1kRq;
            n9VbYkh385.CBQ5d1kRq(textView2 != null ? textView2.getTextColors() : null);
        } else {
            if (this.sk5s77z6Q && (textView = this.WaUP0CF08) != null) {
                n9VbYkh38 = this.eylCJcWC7;
                colorStateList = textView.getTextColors();
            } else if (z4 && (colorStateList = this.koMoKnP1S) != null) {
                n9VbYkh38 = this.eylCJcWC7;
            }
            n9VbYkh38.CBQ5d1kRq(colorStateList);
        }
        if (z3 || !this.D91ZKn9BG || (isEnabled() && z4)) {
            if (z2 || this.GpWTsCbvo) {
                ValueAnimator valueAnimator = this.DEe4ujgEA;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.DEe4ujgEA.cancel();
                }
                if (!z || !this.pwwzaxl9D) {
                    this.eylCJcWC7.Bhmn1KIah(1.0f);
                } else {
                    J4Ux7ym32(1.0f);
                }
                this.GpWTsCbvo = false;
                if (Puu3Rhg4F()) {
                    PSTqBLTET();
                }
                EditText editText3 = this.MzoOEjc4X;
                if (editText3 != null) {
                    i = editText3.getText().length();
                }
                cAwN510t2(i);
                CpG0imbht();
                AqaWJg0b4();
            }
        } else if (z2 || !this.GpWTsCbvo) {
            ValueAnimator valueAnimator2 = this.DEe4ujgEA;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.DEe4ujgEA.cancel();
            }
            if (!z || !this.pwwzaxl9D) {
                this.eylCJcWC7.Bhmn1KIah(0.0f);
            } else {
                J4Ux7ym32(0.0f);
            }
            if (Puu3Rhg4F() && (!((Ay5WVso1Y) this.TyB1UUd72).i0Zug1mVk.isEmpty()) && Puu3Rhg4F()) {
                ((Ay5WVso1Y) this.TyB1UUd72).WaUP0CF08(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.GpWTsCbvo = true;
            CBQ5d1kRq();
            CpG0imbht();
            AqaWJg0b4();
        }
    }

    public final void iiGwOFFnr() {
        kCA6Zs9sL(this.KBYw84i3W, this.SuKhTJIQc, this.INnK5Rew6, this.Dr7UqlxEV, this.ln3nf7LH3);
    }

    public void ilHKhw3Yw() {
        qVUwofr5s(this.oesmsHQJU, this.ShSN9wbzk);
    }

    public void ixWaw2akD(int i) {
        boolean z = this.sk5s77z6Q;
        int i2 = this.ixWaw2akD;
        String str = null;
        if (i2 == -1) {
            this.WaUP0CF08.setText(String.valueOf(i));
            this.WaUP0CF08.setContentDescription(null);
            this.sk5s77z6Q = false;
        } else {
            this.sk5s77z6Q = i > i2;
            Context context = getContext();
            this.WaUP0CF08.setContentDescription(context.getString(this.sk5s77z6Q ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(this.ixWaw2akD)));
            if (z != this.sk5s77z6Q) {
                sk5s77z6Q();
            }
            pDLEDo7dT tGV7Q6urW = pDLEDo7dT.tGV7Q6urW();
            TextView textView = this.WaUP0CF08;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.ixWaw2akD));
            jHwJ5gMKj jhwj5gmkj = tGV7Q6urW.tGV7Q6urW;
            if (string != null) {
                str = tGV7Q6urW.dIocxURUo(string, jhwj5gmkj, true).toString();
            }
            textView.setText(str);
        }
        if (this.MzoOEjc4X != null && z != this.sk5s77z6Q) {
            iMyQMM6Qj(false, false);
            mUqPm6GBh();
            i8XZMQc6Z();
        }
    }

    public final void kCA6Zs9sL(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = drawable.mutate();
            if (z) {
                drawable.setTintList(colorStateList);
            }
            if (z2) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public boolean kmSgne1rO() {
        return this.PSTqBLTET.getVisibility() == 0 && this.oesmsHQJU.getVisibility() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void mUqPm6GBh() {
        /*
        // Method dump skipped, instructions count: 290
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mUqPm6GBh():void");
    }

    public final void nlGCs0NZs() {
        if (this.MzoOEjc4X != null) {
            int i = 0;
            if (!kmSgne1rO()) {
                if (!(this.aS2AFthYA.getVisibility() == 0)) {
                    EditText editText = this.MzoOEjc4X;
                    WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                    i = RBJDIwG1D.kCA6Zs9sL(editText);
                }
            }
            TextView textView = this.V9LQMKGJe;
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int paddingTop = this.MzoOEjc4X.getPaddingTop();
            int paddingBottom = this.MzoOEjc4X.getPaddingBottom();
            WeakHashMap weakHashMap2 = IuQbWntsc.q3BipwRCk;
            RBJDIwG1D.vPSbyrYWX(textView, dimensionPixelSize, paddingTop, i, paddingBottom);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0175  */
    @Override // android.widget.LinearLayout, android.view.View, android.view.ViewGroup
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 386
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        boolean z = false;
        if (this.MzoOEjc4X != null && this.MzoOEjc4X.getMeasuredHeight() < (max = Math.max(this.Bhmn1KIah.getMeasuredHeight(), this.kmSgne1rO.getMeasuredHeight()))) {
            this.MzoOEjc4X.setMinimumHeight(max);
            z = true;
        }
        boolean WaUP0CF08 = WaUP0CF08();
        if (z || WaUP0CF08) {
            this.MzoOEjc4X.post(new aXI58Y1kr());
        }
        if (!(this.IytU16YUK == null || (editText = this.MzoOEjc4X) == null)) {
            this.IytU16YUK.setGravity(editText.getGravity());
            this.IytU16YUK.setPadding(this.MzoOEjc4X.getCompoundPaddingLeft(), this.MzoOEjc4X.getCompoundPaddingTop(), this.MzoOEjc4X.getCompoundPaddingRight(), this.MzoOEjc4X.getCompoundPaddingBottom());
        }
        IytU16YUK();
        nlGCs0NZs();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof PMYI4lLJM)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        PMYI4lLJM pMYI4lLJM = (PMYI4lLJM) parcelable;
        super.onRestoreInstanceState(pMYI4lLJM.CBQ5d1kRq);
        setError(pMYI4lLJM.Bhmn1KIah);
        if (pMYI4lLJM.PSTqBLTET) {
            this.oesmsHQJU.post(new mhl5lIdbQ());
        }
        setHint(pMYI4lLJM.MzoOEjc4X);
        setHelperText(pMYI4lLJM.ilHKhw3Yw);
        setPlaceholderText(pMYI4lLJM.qVUwofr5s);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        PMYI4lLJM pMYI4lLJM = new PMYI4lLJM(super.onSaveInstanceState());
        if (this.dXrmkklc8.kCA6Zs9sL()) {
            pMYI4lLJM.Bhmn1KIah = getError();
        }
        pMYI4lLJM.PSTqBLTET = vPSbyrYWX() && this.oesmsHQJU.isChecked();
        pMYI4lLJM.MzoOEjc4X = getHint();
        pMYI4lLJM.ilHKhw3Yw = getHelperText();
        pMYI4lLJM.qVUwofr5s = getPlaceholderText();
        return pMYI4lLJM;
    }

    public final int oon79WMrY(int i, boolean z) {
        int compoundPaddingRight = i - this.MzoOEjc4X.getCompoundPaddingRight();
        return (this.vNtjxmzUM == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.i0Zug1mVk.getMeasuredWidth() - this.i0Zug1mVk.getPaddingRight());
    }

    public void q3BipwRCk(dNif5KqqH dnif5kqqh) {
        this.buPcffgdD.add(dnif5kqqh);
        if (this.MzoOEjc4X != null) {
            ((y5oh9NJPA) dnif5kqqh).q3BipwRCk(this);
        }
    }

    public final void qFBXIgpia(boolean z, boolean z2) {
        int defaultColor = this.tTcQQNK5P.getDefaultColor();
        int colorForState = this.tTcQQNK5P.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.tTcQQNK5P.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.n4UIOvAko = colorForState2;
        } else if (z2) {
            this.n4UIOvAko = colorForState;
        } else {
            this.n4UIOvAko = defaultColor;
        }
    }

    public final void qVUwofr5s(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            mutate.setTintList(ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.OpLJtmvFM != i) {
            this.OpLJtmvFM = i;
            this.oRfL5Lv1q = i;
            this.XGA7b0zuB = i;
            this.Xeg1rC5FI = i;
            tGV7Q6urW();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        Context context = getContext();
        Object obj = D856HTNqd.q3BipwRCk;
        setBoxBackgroundColor(nHNpaD9No.q3BipwRCk(context, i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.oRfL5Lv1q = defaultColor;
        this.OpLJtmvFM = defaultColor;
        this.LFW0KvNFt = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.XGA7b0zuB = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.Xeg1rC5FI = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        tGV7Q6urW();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.L4EwGfXiQ) {
            this.L4EwGfXiQ = i;
            if (this.MzoOEjc4X != null) {
                Bhmn1KIah();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.zHl31GGXU = i;
    }

    public void setBoxStrokeColor(int i) {
        if (this.OuoYhTxyj != i) {
            this.OuoYhTxyj = i;
            mUqPm6GBh();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (colorStateList.isStateful()) {
            this.ifDs8fRNm = colorStateList.getDefaultColor();
            this.eUlgH2VO7 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.CMnfe2r2N = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else {
            if (this.OuoYhTxyj != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            mUqPm6GBh();
        }
        this.OuoYhTxyj = defaultColor;
        mUqPm6GBh();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.tTcQQNK5P != colorStateList) {
            this.tTcQQNK5P = colorStateList;
            mUqPm6GBh();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.wIZEdYHUn = i;
        mUqPm6GBh();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.IzM1cD9ly = i;
        mUqPm6GBh();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.RG6kpfv3v != z) {
            if (z) {
                qs7k2SwdW qs7k2swdw = new qs7k2SwdW(getContext());
                this.WaUP0CF08 = qs7k2swdw;
                qs7k2swdw.setId(R.id.textinput_counter);
                Typeface typeface = this.kktL0P5MG;
                if (typeface != null) {
                    this.WaUP0CF08.setTypeface(typeface);
                }
                this.WaUP0CF08.setMaxLines(1);
                this.dXrmkklc8.q3BipwRCk(this.WaUP0CF08, 2);
                ((ViewGroup.MarginLayoutParams) this.WaUP0CF08.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                sk5s77z6Q();
                RG6kpfv3v();
            } else {
                this.dXrmkklc8.oon79WMrY(this.WaUP0CF08, 2);
                this.WaUP0CF08 = null;
            }
            this.RG6kpfv3v = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.ixWaw2akD != i) {
            if (i <= 0) {
                i = -1;
            }
            this.ixWaw2akD = i;
            if (this.RG6kpfv3v) {
                RG6kpfv3v();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.i8XZMQc6Z != i) {
            this.i8XZMQc6Z = i;
            sk5s77z6Q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.NyWTwPF6V != colorStateList) {
            this.NyWTwPF6V = colorStateList;
            sk5s77z6Q();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.dfpT1j18n != i) {
            this.dfpT1j18n = i;
            sk5s77z6Q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.mUqPm6GBh != colorStateList) {
            this.mUqPm6GBh = colorStateList;
            sk5s77z6Q();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.BqpzfZavo = colorStateList;
        this.koMoKnP1S = colorStateList;
        if (this.MzoOEjc4X != null) {
            iMyQMM6Qj(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        MzoOEjc4X(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.oesmsHQJU.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.oesmsHQJU.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.oesmsHQJU.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C8A1BseZU.q3BipwRCk(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.oesmsHQJU.setImageDrawable(drawable);
        if (drawable != null) {
            dIocxURUo();
            ilHKhw3Yw();
        }
    }

    public void setEndIconMode(int i) {
        int i2 = this.KlYagMRWx;
        this.KlYagMRWx = i;
        Iterator it = this.YmNRDyka4.iterator();
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                MNvNWu3oH mNvNWu3oH = (MNvNWu3oH) ((WfopS3efW) it.next());
                switch (mNvNWu3oH.q3BipwRCk) {
                    case 0:
                        EditText editText = getEditText();
                        if (editText != null && i2 == 2) {
                            editText.post(new DJbXkgfuR(mNvNWu3oH, editText));
                            if (editText.getOnFocusChangeListener() == ((vC6Qh7mvD) mNvNWu3oH.J4Ux7ym32).iiGwOFFnr) {
                                editText.setOnFocusChangeListener(null);
                            }
                            View.OnFocusChangeListener onFocusChangeListener = ((vC6Qh7mvD) mNvNWu3oH.J4Ux7ym32).tGV7Q6urW.getOnFocusChangeListener();
                            vC6Qh7mvD vc6qh7mvd = (vC6Qh7mvD) mNvNWu3oH.J4Ux7ym32;
                            if (onFocusChangeListener != vc6qh7mvd.iiGwOFFnr) {
                                break;
                            } else {
                                vc6qh7mvd.tGV7Q6urW.setOnFocusChangeListener(null);
                                break;
                            }
                        }
                        break;
                    case 1:
                        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) getEditText();
                        if (autoCompleteTextView != null && i2 == 3) {
                            autoCompleteTextView.post(new DJbXkgfuR(mNvNWu3oH, autoCompleteTextView));
                            if (autoCompleteTextView.getOnFocusChangeListener() == ((rf3cOyxnl) mNvNWu3oH.J4Ux7ym32).iiGwOFFnr) {
                                autoCompleteTextView.setOnFocusChangeListener(null);
                            }
                            autoCompleteTextView.setOnTouchListener(null);
                            autoCompleteTextView.setOnDismissListener(null);
                            break;
                        }
                        break;
                    default:
                        EditText editText2 = getEditText();
                        if (editText2 != null && i2 == 1) {
                            editText2.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            editText2.post(new DJbXkgfuR(mNvNWu3oH, editText2, null));
                            break;
                        }
                        break;
                }
            } else {
                if (i == 0) {
                    z = false;
                }
                setEndIconVisible(z);
                if (getEndIconDelegate().J4Ux7ym32(this.L4EwGfXiQ)) {
                    getEndIconDelegate().q3BipwRCk();
                    dIocxURUo();
                    return;
                }
                StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("The current box background mode ");
                q3BipwRCk.append(this.L4EwGfXiQ);
                q3BipwRCk.append(" is not supported by the end icon mode ");
                q3BipwRCk.append(i);
                throw new IllegalStateException(q3BipwRCk.toString());
            }
        }
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.oesmsHQJU;
        View.OnLongClickListener onLongClickListener = this.suAKJqyYV;
        checkableImageButton.setOnClickListener(onClickListener);
        Eeka1udhb(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.suAKJqyYV = onLongClickListener;
        CheckableImageButton checkableImageButton = this.oesmsHQJU;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        Eeka1udhb(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.ShSN9wbzk != colorStateList) {
            this.ShSN9wbzk = colorStateList;
            this.Ihm5o4uLx = true;
            dIocxURUo();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.Ta2zrwkcM != mode) {
            this.Ta2zrwkcM = mode;
            this.uSBmk4hFZ = true;
            dIocxURUo();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (kmSgne1rO() != z) {
            this.oesmsHQJU.setVisibility(z ? 0 : 8);
            nlGCs0NZs();
            WaUP0CF08();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.dXrmkklc8.vPSbyrYWX) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            GC006c8s6 gC006c8s6 = this.dXrmkklc8;
            gC006c8s6.tGV7Q6urW();
            gC006c8s6.oon79WMrY = charSequence;
            gC006c8s6.CBQ5d1kRq.setText(charSequence);
            int i = gC006c8s6.Puu3Rhg4F;
            if (i != 1) {
                gC006c8s6.yWvV4ePLl = 1;
            }
            gC006c8s6.CBQ5d1kRq(i, gC006c8s6.yWvV4ePLl, gC006c8s6.vPSbyrYWX(gC006c8s6.CBQ5d1kRq, charSequence));
            return;
        }
        this.dXrmkklc8.yWvV4ePLl();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        GC006c8s6 gC006c8s6 = this.dXrmkklc8;
        gC006c8s6.kmSgne1rO = charSequence;
        TextView textView = gC006c8s6.CBQ5d1kRq;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        GC006c8s6 gC006c8s6 = this.dXrmkklc8;
        if (gC006c8s6.vPSbyrYWX != z) {
            gC006c8s6.tGV7Q6urW();
            if (z) {
                qs7k2SwdW qs7k2swdw = new qs7k2SwdW(gC006c8s6.q3BipwRCk);
                gC006c8s6.CBQ5d1kRq = qs7k2swdw;
                qs7k2swdw.setId(R.id.textinput_error);
                gC006c8s6.CBQ5d1kRq.setTextAlignment(5);
                Typeface typeface = gC006c8s6.RG6kpfv3v;
                if (typeface != null) {
                    gC006c8s6.CBQ5d1kRq.setTypeface(typeface);
                }
                int i = gC006c8s6.Bhmn1KIah;
                gC006c8s6.Bhmn1KIah = i;
                TextView textView = gC006c8s6.CBQ5d1kRq;
                if (textView != null) {
                    gC006c8s6.J4Ux7ym32.dXrmkklc8(textView, i);
                }
                ColorStateList colorStateList = gC006c8s6.PSTqBLTET;
                gC006c8s6.PSTqBLTET = colorStateList;
                TextView textView2 = gC006c8s6.CBQ5d1kRq;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                CharSequence charSequence = gC006c8s6.kmSgne1rO;
                gC006c8s6.kmSgne1rO = charSequence;
                TextView textView3 = gC006c8s6.CBQ5d1kRq;
                if (textView3 != null) {
                    textView3.setContentDescription(charSequence);
                }
                gC006c8s6.CBQ5d1kRq.setVisibility(4);
                mN6fklC4R.iiGwOFFnr(gC006c8s6.CBQ5d1kRq, 1);
                gC006c8s6.q3BipwRCk(gC006c8s6.CBQ5d1kRq, 0);
            } else {
                gC006c8s6.yWvV4ePLl();
                gC006c8s6.oon79WMrY(gC006c8s6.CBQ5d1kRq, 0);
                gC006c8s6.CBQ5d1kRq = null;
                gC006c8s6.J4Ux7ym32.i8XZMQc6Z();
                gC006c8s6.J4Ux7ym32.mUqPm6GBh();
            }
            gC006c8s6.vPSbyrYWX = z;
        }
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C8A1BseZU.q3BipwRCk(getContext(), i) : null);
        qVUwofr5s(this.aS2AFthYA, this.tFD7BDQ71);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.aS2AFthYA;
        View.OnLongClickListener onLongClickListener = this.hKeU0pt2N;
        checkableImageButton.setOnClickListener(onClickListener);
        Eeka1udhb(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.hKeU0pt2N = onLongClickListener;
        CheckableImageButton checkableImageButton = this.aS2AFthYA;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        Eeka1udhb(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.tFD7BDQ71 = colorStateList;
        Drawable drawable = this.aS2AFthYA.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintList(colorStateList);
        }
        if (this.aS2AFthYA.getDrawable() != drawable) {
            this.aS2AFthYA.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.aS2AFthYA.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintMode(mode);
        }
        if (this.aS2AFthYA.getDrawable() != drawable) {
            this.aS2AFthYA.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        GC006c8s6 gC006c8s6 = this.dXrmkklc8;
        gC006c8s6.Bhmn1KIah = i;
        TextView textView = gC006c8s6.CBQ5d1kRq;
        if (textView != null) {
            gC006c8s6.J4Ux7ym32.dXrmkklc8(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        GC006c8s6 gC006c8s6 = this.dXrmkklc8;
        gC006c8s6.PSTqBLTET = colorStateList;
        TextView textView = gC006c8s6.CBQ5d1kRq;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.D91ZKn9BG != z) {
            this.D91ZKn9BG = z;
            iMyQMM6Qj(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!this.dXrmkklc8.ilHKhw3Yw) {
                setHelperTextEnabled(true);
            }
            GC006c8s6 gC006c8s6 = this.dXrmkklc8;
            gC006c8s6.tGV7Q6urW();
            gC006c8s6.MzoOEjc4X = charSequence;
            gC006c8s6.qVUwofr5s.setText(charSequence);
            int i = gC006c8s6.Puu3Rhg4F;
            if (i != 2) {
                gC006c8s6.yWvV4ePLl = 2;
            }
            gC006c8s6.CBQ5d1kRq(i, gC006c8s6.yWvV4ePLl, gC006c8s6.vPSbyrYWX(gC006c8s6.qVUwofr5s, charSequence));
        } else if (this.dXrmkklc8.ilHKhw3Yw) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        GC006c8s6 gC006c8s6 = this.dXrmkklc8;
        gC006c8s6.dXrmkklc8 = colorStateList;
        TextView textView = gC006c8s6.qVUwofr5s;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        GC006c8s6 gC006c8s6 = this.dXrmkklc8;
        if (gC006c8s6.ilHKhw3Yw != z) {
            gC006c8s6.tGV7Q6urW();
            if (z) {
                qs7k2SwdW qs7k2swdw = new qs7k2SwdW(gC006c8s6.q3BipwRCk);
                gC006c8s6.qVUwofr5s = qs7k2swdw;
                qs7k2swdw.setId(R.id.textinput_helper_text);
                gC006c8s6.qVUwofr5s.setTextAlignment(5);
                Typeface typeface = gC006c8s6.RG6kpfv3v;
                if (typeface != null) {
                    gC006c8s6.qVUwofr5s.setTypeface(typeface);
                }
                gC006c8s6.qVUwofr5s.setVisibility(4);
                mN6fklC4R.iiGwOFFnr(gC006c8s6.qVUwofr5s, 1);
                int i = gC006c8s6.Eeka1udhb;
                gC006c8s6.Eeka1udhb = i;
                TextView textView = gC006c8s6.qVUwofr5s;
                if (textView != null) {
                    textView.setTextAppearance(i);
                }
                ColorStateList colorStateList = gC006c8s6.dXrmkklc8;
                gC006c8s6.dXrmkklc8 = colorStateList;
                TextView textView2 = gC006c8s6.qVUwofr5s;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                gC006c8s6.q3BipwRCk(gC006c8s6.qVUwofr5s, 1);
            } else {
                gC006c8s6.tGV7Q6urW();
                int i2 = gC006c8s6.Puu3Rhg4F;
                if (i2 == 2) {
                    gC006c8s6.yWvV4ePLl = 0;
                }
                gC006c8s6.CBQ5d1kRq(i2, gC006c8s6.yWvV4ePLl, gC006c8s6.vPSbyrYWX(gC006c8s6.qVUwofr5s, null));
                gC006c8s6.oon79WMrY(gC006c8s6.qVUwofr5s, 1);
                gC006c8s6.qVUwofr5s = null;
                gC006c8s6.J4Ux7ym32.i8XZMQc6Z();
                gC006c8s6.J4Ux7ym32.mUqPm6GBh();
            }
            gC006c8s6.ilHKhw3Yw = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        GC006c8s6 gC006c8s6 = this.dXrmkklc8;
        gC006c8s6.Eeka1udhb = i;
        TextView textView = gC006c8s6.qVUwofr5s;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.QNqj6nIzv) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.pwwzaxl9D = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.QNqj6nIzv) {
            this.QNqj6nIzv = z;
            if (!z) {
                this.EBQXiIPmm = false;
                if (!TextUtils.isEmpty(this.igRQEZxnW) && TextUtils.isEmpty(this.MzoOEjc4X.getHint())) {
                    this.MzoOEjc4X.setHint(this.igRQEZxnW);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.MzoOEjc4X.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.igRQEZxnW)) {
                        setHint(hint);
                    }
                    this.MzoOEjc4X.setHint((CharSequence) null);
                }
                this.EBQXiIPmm = true;
            }
            if (this.MzoOEjc4X != null) {
                dfpT1j18n();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        N9VbYkh38 n9VbYkh38 = this.eylCJcWC7;
        avTFec6Zj avtfec6zj = new avTFec6Zj(n9VbYkh38.q3BipwRCk.getContext(), i);
        ColorStateList colorStateList = avtfec6zj.oon79WMrY;
        if (colorStateList != null) {
            n9VbYkh38.kmSgne1rO = colorStateList;
        }
        float f = avtfec6zj.vPSbyrYWX;
        if (f != 0.0f) {
            n9VbYkh38.vPSbyrYWX = f;
        }
        ColorStateList colorStateList2 = avtfec6zj.q3BipwRCk;
        if (colorStateList2 != null) {
            n9VbYkh38.V9LQMKGJe = colorStateList2;
        }
        n9VbYkh38.i0Zug1mVk = avtfec6zj.kCA6Zs9sL;
        n9VbYkh38.o4LF8RkoQ = avtfec6zj.iiGwOFFnr;
        n9VbYkh38.vNtjxmzUM = avtfec6zj.GPLPRo6go;
        n9VbYkh38.QNqj6nIzv = avtfec6zj.yWvV4ePLl;
        wc5pSEgHR wc5pseghr = n9VbYkh38.sk5s77z6Q;
        if (wc5pseghr != null) {
            wc5pseghr.tGV7Q6urW = true;
        }
        iFKnyAZAM ifknyazam = new iFKnyAZAM(n9VbYkh38);
        avtfec6zj.q3BipwRCk();
        n9VbYkh38.sk5s77z6Q = new wc5pSEgHR(ifknyazam, avtfec6zj.Bhmn1KIah);
        avtfec6zj.tGV7Q6urW(n9VbYkh38.q3BipwRCk.getContext(), n9VbYkh38.sk5s77z6Q);
        n9VbYkh38.oon79WMrY();
        this.koMoKnP1S = this.eylCJcWC7.kmSgne1rO;
        if (this.MzoOEjc4X != null) {
            iMyQMM6Qj(false, false);
            dfpT1j18n();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.koMoKnP1S != colorStateList) {
            if (this.BqpzfZavo == null) {
                N9VbYkh38 n9VbYkh38 = this.eylCJcWC7;
                if (n9VbYkh38.kmSgne1rO != colorStateList) {
                    n9VbYkh38.kmSgne1rO = colorStateList;
                    n9VbYkh38.oon79WMrY();
                }
            }
            this.koMoKnP1S = colorStateList;
            if (this.MzoOEjc4X != null) {
                iMyQMM6Qj(false, false);
            }
        }
    }

    public void setMaxWidth(int i) {
        this.Eeka1udhb = i;
        EditText editText = this.MzoOEjc4X;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinWidth(int i) {
        this.qVUwofr5s = i;
        EditText editText = this.MzoOEjc4X;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.oesmsHQJU.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C8A1BseZU.q3BipwRCk(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.oesmsHQJU.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.KlYagMRWx != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.ShSN9wbzk = colorStateList;
        this.Ihm5o4uLx = true;
        dIocxURUo();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.Ta2zrwkcM = mode;
        this.uSBmk4hFZ = true;
        dIocxURUo();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        int i = 0;
        if (!this.cAwN510t2 || !TextUtils.isEmpty(charSequence)) {
            if (!this.cAwN510t2) {
                setPlaceholderTextEnabled(true);
            }
            this.iMyQMM6Qj = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        EditText editText = this.MzoOEjc4X;
        if (editText != null) {
            i = editText.getText().length();
        }
        cAwN510t2(i);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.qFBXIgpia = i;
        TextView textView = this.IytU16YUK;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.CpG0imbht != colorStateList) {
            this.CpG0imbht = colorStateList;
            TextView textView = this.IytU16YUK;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.vNtjxmzUM = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.i0Zug1mVk.setText(charSequence);
        CpG0imbht();
    }

    public void setPrefixTextAppearance(int i) {
        this.i0Zug1mVk.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.i0Zug1mVk.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.KBYw84i3W.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.KBYw84i3W.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C8A1BseZU.q3BipwRCk(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.KBYw84i3W.setImageDrawable(drawable);
        if (drawable != null) {
            iiGwOFFnr();
            setStartIconVisible(true);
            qVUwofr5s(this.KBYw84i3W, this.INnK5Rew6);
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.KBYw84i3W;
        View.OnLongClickListener onLongClickListener = this.IG30YE5GU;
        checkableImageButton.setOnClickListener(onClickListener);
        Eeka1udhb(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.IG30YE5GU = onLongClickListener;
        CheckableImageButton checkableImageButton = this.KBYw84i3W;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        Eeka1udhb(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.INnK5Rew6 != colorStateList) {
            this.INnK5Rew6 = colorStateList;
            this.SuKhTJIQc = true;
            iiGwOFFnr();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.ln3nf7LH3 != mode) {
            this.ln3nf7LH3 = mode;
            this.Dr7UqlxEV = true;
            iiGwOFFnr();
        }
    }

    public void setStartIconVisible(boolean z) {
        int i = 0;
        if ((this.KBYw84i3W.getVisibility() == 0) != z) {
            CheckableImageButton checkableImageButton = this.KBYw84i3W;
            if (!z) {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            IytU16YUK();
            WaUP0CF08();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.o4LF8RkoQ = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.V9LQMKGJe.setText(charSequence);
        AqaWJg0b4();
    }

    public void setSuffixTextAppearance(int i) {
        this.V9LQMKGJe.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.V9LQMKGJe.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(s7MlVynBG s7mlvynbg) {
        EditText editText = this.MzoOEjc4X;
        if (editText != null) {
            IuQbWntsc.MzoOEjc4X(editText, s7mlvynbg);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.kktL0P5MG) {
            this.kktL0P5MG = typeface;
            this.eylCJcWC7.MzoOEjc4X(typeface);
            GC006c8s6 gC006c8s6 = this.dXrmkklc8;
            if (typeface != gC006c8s6.RG6kpfv3v) {
                gC006c8s6.RG6kpfv3v = typeface;
                TextView textView = gC006c8s6.CBQ5d1kRq;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = gC006c8s6.qVUwofr5s;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.WaUP0CF08;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    public final void sk5s77z6Q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.WaUP0CF08;
        if (textView != null) {
            dXrmkklc8(textView, this.sk5s77z6Q ? this.i8XZMQc6Z : this.dfpT1j18n);
            if (!this.sk5s77z6Q && (colorStateList2 = this.mUqPm6GBh) != null) {
                this.WaUP0CF08.setTextColor(colorStateList2);
            }
            if (this.sk5s77z6Q && (colorStateList = this.NyWTwPF6V) != null) {
                this.WaUP0CF08.setTextColor(colorStateList);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void tGV7Q6urW() {
        /*
            r6 = this;
            con.dOSsQaJVg r0 = r6.TyB1UUd72
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            con.xT3tobMV0 r1 = r6.j22ftfeNI
            r0.setShapeAppearanceModel(r1)
            int r0 = r6.L4EwGfXiQ
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L_0x0021
            int r0 = r6.ziwPzaoF3
            if (r0 <= r2) goto L_0x001c
            int r0 = r6.n4UIOvAko
            if (r0 == 0) goto L_0x001c
            r0 = r4
            goto L_0x001d
        L_0x001c:
            r0 = r3
        L_0x001d:
            if (r0 == 0) goto L_0x0021
            r0 = r4
            goto L_0x0022
        L_0x0021:
            r0 = r3
        L_0x0022:
            if (r0 == 0) goto L_0x002e
            con.dOSsQaJVg r0 = r6.TyB1UUd72
            int r1 = r6.ziwPzaoF3
            float r1 = (float) r1
            int r5 = r6.n4UIOvAko
            r0.qVUwofr5s(r1, r5)
        L_0x002e:
            int r0 = r6.OpLJtmvFM
            int r1 = r6.L4EwGfXiQ
            if (r1 != r4) goto L_0x0045
            r0 = 2130968828(0x7f0400fc, float:1.754632E38)
            android.content.Context r1 = r6.getContext()
            int r0 = con.D3DEikrvb.vPSbyrYWX(r1, r0, r3)
            int r1 = r6.OpLJtmvFM
            int r0 = con.R33DQrZIb.J4Ux7ym32(r1, r0)
        L_0x0045:
            r6.OpLJtmvFM = r0
            con.dOSsQaJVg r1 = r6.TyB1UUd72
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.MzoOEjc4X(r0)
            int r0 = r6.KlYagMRWx
            r1 = 3
            if (r0 != r1) goto L_0x005e
            android.widget.EditText r0 = r6.MzoOEjc4X
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.invalidateSelf()
        L_0x005e:
            con.dOSsQaJVg r0 = r6.juJ6pnCpu
            if (r0 != 0) goto L_0x0063
            goto L_0x007a
        L_0x0063:
            int r1 = r6.ziwPzaoF3
            if (r1 <= r2) goto L_0x006c
            int r1 = r6.n4UIOvAko
            if (r1 == 0) goto L_0x006c
            r3 = r4
        L_0x006c:
            if (r3 == 0) goto L_0x0077
            int r1 = r6.n4UIOvAko
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.MzoOEjc4X(r1)
        L_0x0077:
            r6.invalidate()
        L_0x007a:
            r6.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.tGV7Q6urW():void");
    }

    public final boolean vPSbyrYWX() {
        return this.KlYagMRWx != 0;
    }

    public final int yWvV4ePLl(int i, boolean z) {
        int compoundPaddingLeft = this.MzoOEjc4X.getCompoundPaddingLeft() + i;
        return (this.vNtjxmzUM == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.i0Zug1mVk.getMeasuredWidth()) + this.i0Zug1mVk.getPaddingLeft();
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.aS2AFthYA.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.dXrmkklc8.vPSbyrYWX);
    }
}
