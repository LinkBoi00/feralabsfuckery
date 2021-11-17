package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.feravolt.preload.R;
import con.D856HTNqd;
import con.IuQbWntsc;
import con.KHy3Nhjbh;
import con.KTMDafsbu;
import con.LKa8y802S;
import con.N1zulf8pH;
import con.P5t4sPPG0;
import con.QiVwQCcLp;
import con.RBJDIwG1D;
import con.UexvVay3o;
import con.VCCyeOu6I;
import con.WpheuUJER;
import con.ZmYjNS8wW;
import con.abGBwSu8x;
import con.blGiSoWm3;
import con.cyVJjwbRF;
import con.jsNC7SjP9;
import con.mJLaJepZo;
import con.mN6fklC4R;
import con.mmX2UQLSo;
import con.nOPp9PCGN;
import con.o8nscdGif;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements QiVwQCcLp, mmX2UQLSo {
    public static final ThreadLocal AqaWJg0b4;
    public static final nOPp9PCGN NyWTwPF6V;
    public static final Comparator mUqPm6GBh;
    public static final Class[] nlGCs0NZs;
    public static final String qFBXIgpia;
    public boolean Eeka1udhb;
    public N1zulf8pH IytU16YUK;
    public View RG6kpfv3v;
    public boolean WaUP0CF08;
    public ViewGroup.OnHierarchyChangeListener cAwN510t2;
    public int[] dXrmkklc8;
    public boolean dfpT1j18n;
    public o8nscdGif i8XZMQc6Z;
    public Drawable iMyQMM6Qj;
    public View ixWaw2akD;
    public boolean qVUwofr5s;
    public dNif5KqqH sk5s77z6Q;
    public final List CBQ5d1kRq = new ArrayList();
    public final LKa8y802S kmSgne1rO = new LKa8y802S(5);
    public final List Bhmn1KIah = new ArrayList();
    public final List PSTqBLTET = new ArrayList();
    public final int[] MzoOEjc4X = new int[2];
    public final int[] ilHKhw3Yw = new int[2];
    public final KTMDafsbu CpG0imbht = new KTMDafsbu();

    /* loaded from: classes.dex */
    public static class PMYI4lLJM implements Comparator {
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            float kmSgne1rO = mJLaJepZo.kmSgne1rO((View) obj);
            float kmSgne1rO2 = mJLaJepZo.kmSgne1rO((View) obj2);
            if (kmSgne1rO > kmSgne1rO2) {
                return -1;
            }
            return kmSgne1rO < kmSgne1rO2 ? 1 : 0;
        }
    }

    /* loaded from: classes.dex */
    public class RG2GI7LDp implements N1zulf8pH {
        public RG2GI7LDp() {
            CoordinatorLayout.this = r1;
        }

        @Override // con.N1zulf8pH
        public o8nscdGif J4Ux7ym32(View view, o8nscdGif o8nscdgif) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.i8XZMQc6Z, o8nscdgif)) {
                coordinatorLayout.i8XZMQc6Z = o8nscdgif;
                boolean z = true;
                boolean z2 = o8nscdgif.dIocxURUo() > 0;
                coordinatorLayout.dfpT1j18n = z2;
                if (z2 || coordinatorLayout.getBackground() != null) {
                    z = false;
                }
                coordinatorLayout.setWillNotDraw(z);
                if (!o8nscdgif.iiGwOFFnr()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                        if (VCCyeOu6I.J4Ux7ym32(childAt) && ((s7MlVynBG) childAt.getLayoutParams()).q3BipwRCk != null && o8nscdgif.iiGwOFFnr()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return o8nscdgif;
        }
    }

    /* loaded from: classes.dex */
    public static class WfopS3efW extends con.s7MlVynBG {
        public static final Parcelable.Creator<WfopS3efW> CREATOR = new KHy3Nhjbh(1);
        public SparseArray Bhmn1KIah;

        public WfopS3efW(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.Bhmn1KIah = new SparseArray(readInt);
            for (int i = 0; i < readInt; i++) {
                this.Bhmn1KIah.append(iArr[i], readParcelableArray[i]);
            }
        }

        public WfopS3efW(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // con.s7MlVynBG, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.CBQ5d1kRq, i);
            SparseArray sparseArray = this.Bhmn1KIah;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.Bhmn1KIah.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.Bhmn1KIah.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface aXI58Y1kr {
        Class value();
    }

    /* loaded from: classes.dex */
    public class dNif5KqqH implements ViewTreeObserver.OnPreDrawListener {
        public dNif5KqqH() {
            CoordinatorLayout.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.MzoOEjc4X(0);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class mhl5lIdbQ {
        public mhl5lIdbQ() {
        }

        public mhl5lIdbQ(Context context, AttributeSet attributeSet) {
        }

        public void Bhmn1KIah(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public void CBQ5d1kRq(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }

        public boolean GPLPRo6go(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean J4Ux7ym32(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public boolean MzoOEjc4X(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return false;
        }

        public Parcelable PSTqBLTET(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public abstract boolean Puu3Rhg4F(CoordinatorLayout coordinatorLayout, View view, int i);

        public boolean dIocxURUo(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void iiGwOFFnr() {
        }

        public void ilHKhw3Yw(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        }

        public void kCA6Zs9sL(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public boolean kmSgne1rO(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            return false;
        }

        public boolean oon79WMrY(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2) {
            return false;
        }

        public boolean q3BipwRCk(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public boolean qVUwofr5s(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public void tGV7Q6urW(s7MlVynBG s7mlvynbg) {
        }

        public void vPSbyrYWX(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        }

        public boolean yWvV4ePLl(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class qhPEQQaQ4 implements ViewGroup.OnHierarchyChangeListener {
        public qhPEQQaQ4() {
            CoordinatorLayout.this = r1;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.cAwN510t2;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.MzoOEjc4X(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.cAwN510t2;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class s7MlVynBG extends ViewGroup.MarginLayoutParams {
        public boolean Bhmn1KIah;
        public View CBQ5d1kRq;
        public int GPLPRo6go;
        public boolean J4Ux7ym32;
        public boolean MzoOEjc4X;
        public boolean PSTqBLTET;
        public int Puu3Rhg4F;
        public int dIocxURUo;
        public int iiGwOFFnr;
        public final Rect ilHKhw3Yw;
        public int kCA6Zs9sL;
        public boolean kmSgne1rO;
        public int oon79WMrY;
        public mhl5lIdbQ q3BipwRCk;
        public int tGV7Q6urW;
        public View vPSbyrYWX;
        public int yWvV4ePLl;

        public s7MlVynBG(int i, int i2) {
            super(i, i2);
            this.J4Ux7ym32 = false;
            this.tGV7Q6urW = 0;
            this.dIocxURUo = 0;
            this.kCA6Zs9sL = -1;
            this.iiGwOFFnr = -1;
            this.GPLPRo6go = 0;
            this.Puu3Rhg4F = 0;
            this.ilHKhw3Yw = new Rect();
        }

        public s7MlVynBG(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            mhl5lIdbQ mhl5lidbq;
            this.J4Ux7ym32 = false;
            this.tGV7Q6urW = 0;
            this.dIocxURUo = 0;
            this.kCA6Zs9sL = -1;
            this.iiGwOFFnr = -1;
            this.GPLPRo6go = 0;
            this.Puu3Rhg4F = 0;
            this.ilHKhw3Yw = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, P5t4sPPG0.J4Ux7ym32);
            this.tGV7Q6urW = obtainStyledAttributes.getInteger(0, 0);
            this.iiGwOFFnr = obtainStyledAttributes.getResourceId(1, -1);
            this.dIocxURUo = obtainStyledAttributes.getInteger(2, 0);
            this.kCA6Zs9sL = obtainStyledAttributes.getInteger(6, -1);
            this.GPLPRo6go = obtainStyledAttributes.getInt(5, 0);
            this.Puu3Rhg4F = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.J4Ux7ym32 = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.qFBXIgpia;
                if (TextUtils.isEmpty(string)) {
                    mhl5lidbq = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.qFBXIgpia;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal threadLocal = CoordinatorLayout.AqaWJg0b4;
                        Map map = (Map) threadLocal.get();
                        if (map == null) {
                            map = new HashMap();
                            threadLocal.set(map);
                        }
                        Constructor<?> constructor = (Constructor) map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.nlGCs0NZs);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        mhl5lidbq = (mhl5lIdbQ) constructor.newInstance(context, attributeSet);
                    } catch (Exception e) {
                        throw new RuntimeException(UexvVay3o.q3BipwRCk("Could not inflate Behavior subclass ", string), e);
                    }
                }
                this.q3BipwRCk = mhl5lidbq;
            }
            obtainStyledAttributes.recycle();
            mhl5lIdbQ mhl5lidbq2 = this.q3BipwRCk;
            if (mhl5lidbq2 != null) {
                mhl5lidbq2.tGV7Q6urW(this);
            }
        }

        public s7MlVynBG(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.J4Ux7ym32 = false;
            this.tGV7Q6urW = 0;
            this.dIocxURUo = 0;
            this.kCA6Zs9sL = -1;
            this.iiGwOFFnr = -1;
            this.GPLPRo6go = 0;
            this.Puu3Rhg4F = 0;
            this.ilHKhw3Yw = new Rect();
        }

        public s7MlVynBG(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.J4Ux7ym32 = false;
            this.tGV7Q6urW = 0;
            this.dIocxURUo = 0;
            this.kCA6Zs9sL = -1;
            this.iiGwOFFnr = -1;
            this.GPLPRo6go = 0;
            this.Puu3Rhg4F = 0;
            this.ilHKhw3Yw = new Rect();
        }

        public s7MlVynBG(s7MlVynBG s7mlvynbg) {
            super((ViewGroup.MarginLayoutParams) s7mlvynbg);
            this.J4Ux7ym32 = false;
            this.tGV7Q6urW = 0;
            this.dIocxURUo = 0;
            this.kCA6Zs9sL = -1;
            this.iiGwOFFnr = -1;
            this.GPLPRo6go = 0;
            this.Puu3Rhg4F = 0;
            this.ilHKhw3Yw = new Rect();
        }

        public void J4Ux7ym32(int i, boolean z) {
            if (i == 0) {
                this.Bhmn1KIah = z;
            } else if (i == 1) {
                this.PSTqBLTET = z;
            }
        }

        public boolean q3BipwRCk(int i) {
            if (i == 0) {
                return this.Bhmn1KIah;
            }
            if (i != 1) {
                return false;
            }
            return this.PSTqBLTET;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        qFBXIgpia = r0 != null ? r0.getName() : null;
        mUqPm6GBh = new PMYI4lLJM();
        nlGCs0NZs = new Class[]{Context.class, AttributeSet.class};
        AqaWJg0b4 = new ThreadLocal();
        NyWTwPF6V = new WpheuUJER(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        int[] iArr = P5t4sPPG0.q3BipwRCk;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.dXrmkklc8 = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.dXrmkklc8.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.dXrmkklc8;
                iArr2[i] = (int) (((float) iArr2[i]) * f);
            }
        }
        this.iMyQMM6Qj = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        sk5s77z6Q();
        super.setOnHierarchyChangeListener(new qhPEQQaQ4());
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        if (VCCyeOu6I.tGV7Q6urW(this) == 0) {
            VCCyeOu6I.Eeka1udhb(this, 1);
        }
    }

    public static Rect GPLPRo6go() {
        Rect rect = (Rect) NyWTwPF6V.q3BipwRCk();
        return rect == null ? new Rect() : rect;
    }

    public s7MlVynBG Bhmn1KIah(View view) {
        s7MlVynBG s7mlvynbg = (s7MlVynBG) view.getLayoutParams();
        if (!s7mlvynbg.J4Ux7ym32) {
            aXI58Y1kr axi58y1kr = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                axi58y1kr = (aXI58Y1kr) cls.getAnnotation(aXI58Y1kr.class);
                if (axi58y1kr != null) {
                    break;
                }
            }
            if (axi58y1kr != null) {
                try {
                    mhl5lIdbQ mhl5lidbq = (mhl5lIdbQ) axi58y1kr.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    mhl5lIdbQ mhl5lidbq2 = s7mlvynbg.q3BipwRCk;
                    if (mhl5lidbq2 != mhl5lidbq) {
                        if (mhl5lidbq2 != null) {
                            mhl5lidbq2.iiGwOFFnr();
                        }
                        s7mlvynbg.q3BipwRCk = mhl5lidbq;
                        s7mlvynbg.J4Ux7ym32 = true;
                        if (mhl5lidbq != null) {
                            mhl5lidbq.tGV7Q6urW(s7mlvynbg);
                        }
                    }
                } catch (Exception e) {
                    StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Default behavior class ");
                    q3BipwRCk.append(axi58y1kr.value().getName());
                    q3BipwRCk.append(" could not be instantiated. Did you forget a default constructor?");
                    Log.e("CoordinatorLayout", q3BipwRCk.toString(), e);
                }
            }
            s7mlvynbg.J4Ux7ym32 = true;
        }
        return s7mlvynbg;
    }

    public final void CBQ5d1kRq(int i, Rect rect, Rect rect2, s7MlVynBG s7mlvynbg, int i2, int i3) {
        int i4 = s7mlvynbg.tGV7Q6urW;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = s7mlvynbg.dIocxURUo;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int width = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            width -= i2 / 2;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 == 16) {
            height -= i3 / 2;
        } else if (i7 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
        if (r5 != false) goto L_0x00c4;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void Eeka1udhb() {
        boolean z;
        mhl5lIdbQ mhl5lidbq;
        boolean z2;
        this.CBQ5d1kRq.clear();
        LKa8y802S lKa8y802S = this.kmSgne1rO;
        int i = ((ZmYjNS8wW) lKa8y802S.dIocxURUo).Bhmn1KIah;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList = (ArrayList) ((ZmYjNS8wW) lKa8y802S.dIocxURUo).vPSbyrYWX(i2);
            if (arrayList != null) {
                lKa8y802S.ilHKhw3Yw(arrayList);
            }
        }
        ((ZmYjNS8wW) lKa8y802S.dIocxURUo).clear();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            s7MlVynBG Bhmn1KIah = Bhmn1KIah(childAt);
            if (Bhmn1KIah.iiGwOFFnr == -1) {
                Bhmn1KIah.CBQ5d1kRq = null;
                Bhmn1KIah.vPSbyrYWX = null;
            } else {
                View view = Bhmn1KIah.vPSbyrYWX;
                if (view != null) {
                    if (view.getId() == Bhmn1KIah.iiGwOFFnr) {
                        View view2 = Bhmn1KIah.vPSbyrYWX;
                        for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                            if (parent == null || parent == childAt) {
                                Bhmn1KIah.CBQ5d1kRq = null;
                                Bhmn1KIah.vPSbyrYWX = null;
                            } else {
                                if (parent instanceof View) {
                                    view2 = (View) parent;
                                }
                            }
                        }
                        Bhmn1KIah.CBQ5d1kRq = view2;
                        z2 = true;
                    }
                    z2 = false;
                    break;
                }
                View findViewById = findViewById(Bhmn1KIah.iiGwOFFnr);
                Bhmn1KIah.vPSbyrYWX = findViewById;
                if (findViewById != null) {
                    if (findViewById != this) {
                        ViewParent parent2 = findViewById.getParent();
                        while (parent2 != this && parent2 != null) {
                            if (parent2 != childAt) {
                                if (parent2 instanceof View) {
                                    findViewById = (View) parent2;
                                }
                                parent2 = parent2.getParent();
                            } else if (!isInEditMode()) {
                                throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                            }
                        }
                        Bhmn1KIah.CBQ5d1kRq = findViewById;
                    } else if (!isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                } else if (!isInEditMode()) {
                    StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Could not find CoordinatorLayout descendant view with id ");
                    q3BipwRCk.append(getResources().getResourceName(Bhmn1KIah.iiGwOFFnr));
                    q3BipwRCk.append(" to anchor view ");
                    q3BipwRCk.append(childAt);
                    throw new IllegalStateException(q3BipwRCk.toString());
                }
                Bhmn1KIah.CBQ5d1kRq = null;
                Bhmn1KIah.vPSbyrYWX = null;
            }
            this.kmSgne1rO.iiGwOFFnr(childAt);
            for (int i4 = 0; i4 < childCount; i4++) {
                if (i4 != i3) {
                    View childAt2 = getChildAt(i4);
                    if (childAt2 != Bhmn1KIah.CBQ5d1kRq) {
                        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                        int dIocxURUo = RBJDIwG1D.dIocxURUo(this);
                        int absoluteGravity = Gravity.getAbsoluteGravity(((s7MlVynBG) childAt2.getLayoutParams()).GPLPRo6go, dIocxURUo);
                        if (!(absoluteGravity != 0 && (Gravity.getAbsoluteGravity(Bhmn1KIah.Puu3Rhg4F, dIocxURUo) & absoluteGravity) == absoluteGravity) && ((mhl5lidbq = Bhmn1KIah.q3BipwRCk) == null || !mhl5lidbq.J4Ux7ym32(this, childAt, childAt2))) {
                            z = false;
                            if (!z) {
                                continue;
                            } else {
                                if (!(((ZmYjNS8wW) this.kmSgne1rO.dIocxURUo).kCA6Zs9sL(childAt2) >= 0)) {
                                    this.kmSgne1rO.iiGwOFFnr(childAt2);
                                }
                                LKa8y802S lKa8y802S2 = this.kmSgne1rO;
                                if (((ZmYjNS8wW) lKa8y802S2.dIocxURUo).kCA6Zs9sL(childAt2) >= 0) {
                                    if (((ZmYjNS8wW) lKa8y802S2.dIocxURUo).kCA6Zs9sL(childAt) >= 0) {
                                        ArrayList arrayList2 = (ArrayList) ((ZmYjNS8wW) lKa8y802S2.dIocxURUo).getOrDefault(childAt2, null);
                                        if (arrayList2 == null) {
                                            arrayList2 = lKa8y802S2.kmSgne1rO();
                                            ((ZmYjNS8wW) lKa8y802S2.dIocxURUo).put(childAt2, arrayList2);
                                        }
                                        arrayList2.add(childAt);
                                    }
                                }
                                throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                            }
                        }
                    }
                    z = true;
                    if (!z) {
                    }
                }
            }
        }
        List list = this.CBQ5d1kRq;
        LKa8y802S lKa8y802S3 = this.kmSgne1rO;
        ((ArrayList) lKa8y802S3.tGV7Q6urW).clear();
        ((HashSet) lKa8y802S3.J4Ux7ym32).clear();
        int i5 = ((ZmYjNS8wW) lKa8y802S3.dIocxURUo).Bhmn1KIah;
        for (int i6 = 0; i6 < i5; i6++) {
            lKa8y802S3.oon79WMrY(((ZmYjNS8wW) lKa8y802S3.dIocxURUo).Puu3Rhg4F(i6), (ArrayList) lKa8y802S3.tGV7Q6urW, (HashSet) lKa8y802S3.J4Ux7ym32);
        }
        list.addAll((ArrayList) lKa8y802S3.tGV7Q6urW);
        Collections.reverse(this.CBQ5d1kRq);
    }

    @Override // con.QiVwQCcLp
    public void J4Ux7ym32(View view, int i) {
        KTMDafsbu kTMDafsbu = this.CpG0imbht;
        if (i == 1) {
            kTMDafsbu.J4Ux7ym32 = 0;
        } else {
            kTMDafsbu.q3BipwRCk = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            s7MlVynBG s7mlvynbg = (s7MlVynBG) childAt.getLayoutParams();
            if (s7mlvynbg.q3BipwRCk(i)) {
                mhl5lIdbQ mhl5lidbq = s7mlvynbg.q3BipwRCk;
                if (mhl5lidbq != null) {
                    mhl5lidbq.ilHKhw3Yw(this, childAt, view, i);
                }
                s7mlvynbg.J4Ux7ym32(i, false);
                s7mlvynbg.MzoOEjc4X = false;
            }
        }
        this.ixWaw2akD = null;
    }

    public final void MzoOEjc4X(int i) {
        int i2;
        Rect rect;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        Rect rect2;
        int i10;
        int i11;
        int i12;
        s7MlVynBG s7mlvynbg;
        mhl5lIdbQ mhl5lidbq;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        int dIocxURUo = RBJDIwG1D.dIocxURUo(this);
        int size = this.CBQ5d1kRq.size();
        Rect GPLPRo6go = GPLPRo6go();
        Rect GPLPRo6go2 = GPLPRo6go();
        Rect GPLPRo6go3 = GPLPRo6go();
        int i13 = 0;
        while (i13 < size) {
            View view = (View) this.CBQ5d1kRq.get(i13);
            s7MlVynBG s7mlvynbg2 = (s7MlVynBG) view.getLayoutParams();
            if (i == 0 && view.getVisibility() == 8) {
                i3 = size;
                rect = GPLPRo6go3;
                i2 = i13;
            } else {
                int i14 = 0;
                while (i14 < i13) {
                    if (s7mlvynbg2.CBQ5d1kRq == ((View) this.CBQ5d1kRq.get(i14))) {
                        s7MlVynBG s7mlvynbg3 = (s7MlVynBG) view.getLayoutParams();
                        if (s7mlvynbg3.vPSbyrYWX != null) {
                            Rect GPLPRo6go4 = GPLPRo6go();
                            Rect GPLPRo6go5 = GPLPRo6go();
                            Rect GPLPRo6go6 = GPLPRo6go();
                            vPSbyrYWX(s7mlvynbg3.vPSbyrYWX, GPLPRo6go4);
                            yWvV4ePLl(view, false, GPLPRo6go5);
                            int measuredWidth = view.getMeasuredWidth();
                            i12 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            i11 = i13;
                            i10 = i14;
                            rect2 = GPLPRo6go3;
                            s7mlvynbg = s7mlvynbg2;
                            CBQ5d1kRq(dIocxURUo, GPLPRo6go4, GPLPRo6go6, s7mlvynbg3, measuredWidth, measuredHeight);
                            boolean z4 = (GPLPRo6go6.left == GPLPRo6go5.left && GPLPRo6go6.top == GPLPRo6go5.top) ? false : true;
                            Puu3Rhg4F(s7mlvynbg3, GPLPRo6go6, measuredWidth, measuredHeight);
                            int i15 = GPLPRo6go6.left - GPLPRo6go5.left;
                            int i16 = GPLPRo6go6.top - GPLPRo6go5.top;
                            if (i15 != 0) {
                                WeakHashMap weakHashMap2 = IuQbWntsc.q3BipwRCk;
                                view.offsetLeftAndRight(i15);
                            }
                            if (i16 != 0) {
                                WeakHashMap weakHashMap3 = IuQbWntsc.q3BipwRCk;
                                view.offsetTopAndBottom(i16);
                            }
                            if (z4 && (mhl5lidbq = s7mlvynbg3.q3BipwRCk) != null) {
                                mhl5lidbq.dIocxURUo(this, view, s7mlvynbg3.vPSbyrYWX);
                            }
                            GPLPRo6go4.setEmpty();
                            nOPp9PCGN nopp9pcgn = NyWTwPF6V;
                            nopp9pcgn.tGV7Q6urW(GPLPRo6go4);
                            GPLPRo6go5.setEmpty();
                            nopp9pcgn.tGV7Q6urW(GPLPRo6go5);
                            GPLPRo6go6.setEmpty();
                            nopp9pcgn.tGV7Q6urW(GPLPRo6go6);
                            i14 = i10 + 1;
                            s7mlvynbg2 = s7mlvynbg;
                            size = i12;
                            i13 = i11;
                            GPLPRo6go3 = rect2;
                        }
                    }
                    i10 = i14;
                    i12 = size;
                    rect2 = GPLPRo6go3;
                    i11 = i13;
                    s7mlvynbg = s7mlvynbg2;
                    i14 = i10 + 1;
                    s7mlvynbg2 = s7mlvynbg;
                    size = i12;
                    i13 = i11;
                    GPLPRo6go3 = rect2;
                }
                i2 = i13;
                yWvV4ePLl(view, true, GPLPRo6go2);
                if (s7mlvynbg2.GPLPRo6go != 0 && !GPLPRo6go2.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(s7mlvynbg2.GPLPRo6go, dIocxURUo);
                    int i17 = absoluteGravity & 112;
                    if (i17 == 48) {
                        GPLPRo6go.top = Math.max(GPLPRo6go.top, GPLPRo6go2.bottom);
                    } else if (i17 == 80) {
                        GPLPRo6go.bottom = Math.max(GPLPRo6go.bottom, getHeight() - GPLPRo6go2.top);
                    }
                    int i18 = absoluteGravity & 7;
                    if (i18 == 3) {
                        GPLPRo6go.left = Math.max(GPLPRo6go.left, GPLPRo6go2.right);
                    } else if (i18 == 5) {
                        GPLPRo6go.right = Math.max(GPLPRo6go.right, getWidth() - GPLPRo6go2.left);
                    }
                }
                if (s7mlvynbg2.Puu3Rhg4F != 0 && view.getVisibility() == 0) {
                    WeakHashMap weakHashMap4 = IuQbWntsc.q3BipwRCk;
                    if (mN6fklC4R.tGV7Q6urW(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                        s7MlVynBG s7mlvynbg4 = (s7MlVynBG) view.getLayoutParams();
                        mhl5lIdbQ mhl5lidbq2 = s7mlvynbg4.q3BipwRCk;
                        Rect GPLPRo6go7 = GPLPRo6go();
                        Rect GPLPRo6go8 = GPLPRo6go();
                        GPLPRo6go8.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (mhl5lidbq2 == null || !mhl5lidbq2.q3BipwRCk(this, view, GPLPRo6go7)) {
                            GPLPRo6go7.set(GPLPRo6go8);
                        } else if (!GPLPRo6go8.contains(GPLPRo6go7)) {
                            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Rect should be within the child's bounds. Rect:");
                            q3BipwRCk.append(GPLPRo6go7.toShortString());
                            q3BipwRCk.append(" | Bounds:");
                            q3BipwRCk.append(GPLPRo6go8.toShortString());
                            throw new IllegalArgumentException(q3BipwRCk.toString());
                        }
                        GPLPRo6go8.setEmpty();
                        nOPp9PCGN nopp9pcgn2 = NyWTwPF6V;
                        nopp9pcgn2.tGV7Q6urW(GPLPRo6go8);
                        if (!GPLPRo6go7.isEmpty()) {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(s7mlvynbg4.Puu3Rhg4F, dIocxURUo);
                            if ((absoluteGravity2 & 48) != 48 || (i8 = (GPLPRo6go7.top - ((ViewGroup.MarginLayoutParams) s7mlvynbg4).topMargin) - s7mlvynbg4.oon79WMrY) >= (i9 = GPLPRo6go.top)) {
                                z2 = false;
                            } else {
                                ixWaw2akD(view, i9 - i8);
                                z2 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - GPLPRo6go7.bottom) - ((ViewGroup.MarginLayoutParams) s7mlvynbg4).bottomMargin) + s7mlvynbg4.oon79WMrY) < (i7 = GPLPRo6go.bottom)) {
                                ixWaw2akD(view, height - i7);
                                z2 = true;
                            }
                            if (!z2) {
                                ixWaw2akD(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i5 = (GPLPRo6go7.left - ((ViewGroup.MarginLayoutParams) s7mlvynbg4).leftMargin) - s7mlvynbg4.yWvV4ePLl) >= (i6 = GPLPRo6go.left)) {
                                z3 = false;
                            } else {
                                RG6kpfv3v(view, i6 - i5);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - GPLPRo6go7.right) - ((ViewGroup.MarginLayoutParams) s7mlvynbg4).rightMargin) + s7mlvynbg4.yWvV4ePLl) < (i4 = GPLPRo6go.right)) {
                                RG6kpfv3v(view, width - i4);
                                z3 = true;
                            }
                            if (!z3) {
                                RG6kpfv3v(view, 0);
                            }
                        }
                        GPLPRo6go7.setEmpty();
                        nopp9pcgn2.tGV7Q6urW(GPLPRo6go7);
                    }
                }
                if (i != 2) {
                    rect = GPLPRo6go3;
                    rect.set(((s7MlVynBG) view.getLayoutParams()).ilHKhw3Yw);
                    if (rect.equals(GPLPRo6go2)) {
                        i3 = size;
                    } else {
                        ((s7MlVynBG) view.getLayoutParams()).ilHKhw3Yw.set(GPLPRo6go2);
                    }
                } else {
                    rect = GPLPRo6go3;
                }
                i3 = size;
                for (int i19 = i2 + 1; i19 < i3; i19++) {
                    View view2 = (View) this.CBQ5d1kRq.get(i19);
                    s7MlVynBG s7mlvynbg5 = (s7MlVynBG) view2.getLayoutParams();
                    mhl5lIdbQ mhl5lidbq3 = s7mlvynbg5.q3BipwRCk;
                    if (mhl5lidbq3 != null && mhl5lidbq3.J4Ux7ym32(this, view2, view)) {
                        if (i != 0 || !s7mlvynbg5.MzoOEjc4X) {
                            if (i != 2) {
                                z = mhl5lidbq3.dIocxURUo(this, view2, view);
                            } else {
                                mhl5lidbq3.kCA6Zs9sL(this, view2, view);
                                z = true;
                            }
                            if (i == 1) {
                                s7mlvynbg5.MzoOEjc4X = z;
                            }
                        } else {
                            s7mlvynbg5.MzoOEjc4X = false;
                        }
                    }
                }
            }
            i13 = i2 + 1;
            size = i3;
            GPLPRo6go3 = rect;
        }
        GPLPRo6go.setEmpty();
        nOPp9PCGN nopp9pcgn3 = NyWTwPF6V;
        nopp9pcgn3.tGV7Q6urW(GPLPRo6go);
        GPLPRo6go2.setEmpty();
        nopp9pcgn3.tGV7Q6urW(GPLPRo6go2);
        GPLPRo6go3.setEmpty();
        nopp9pcgn3.tGV7Q6urW(GPLPRo6go3);
    }

    public boolean PSTqBLTET(View view, int i, int i2) {
        Rect GPLPRo6go = GPLPRo6go();
        vPSbyrYWX(view, GPLPRo6go);
        try {
            return GPLPRo6go.contains(i, i2);
        } finally {
            GPLPRo6go.setEmpty();
            NyWTwPF6V.tGV7Q6urW(GPLPRo6go);
        }
    }

    public final void Puu3Rhg4F(s7MlVynBG s7mlvynbg, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) s7mlvynbg).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) s7mlvynbg).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) s7mlvynbg).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) s7mlvynbg).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public final void RG6kpfv3v(View view, int i) {
        s7MlVynBG s7mlvynbg = (s7MlVynBG) view.getLayoutParams();
        int i2 = s7mlvynbg.yWvV4ePLl;
        if (i2 != i) {
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            view.offsetLeftAndRight(i - i2);
            s7mlvynbg.yWvV4ePLl = i;
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof s7MlVynBG) && super.checkLayoutParams(layoutParams);
    }

    @Override // con.mmX2UQLSo
    public void dIocxURUo(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        mhl5lIdbQ mhl5lidbq;
        boolean z;
        int i6;
        int childCount = getChildCount();
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                s7MlVynBG s7mlvynbg = (s7MlVynBG) childAt.getLayoutParams();
                if (s7mlvynbg.q3BipwRCk(i5) && (mhl5lidbq = s7mlvynbg.q3BipwRCk) != null) {
                    int[] iArr2 = this.MzoOEjc4X;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    mhl5lidbq.CBQ5d1kRq(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.MzoOEjc4X;
                    i7 = i3 > 0 ? Math.max(i7, iArr3[0]) : Math.min(i7, iArr3[0]);
                    if (i4 > 0) {
                        z = true;
                        i6 = Math.max(i8, this.MzoOEjc4X[1]);
                    } else {
                        z = true;
                        i6 = Math.min(i8, this.MzoOEjc4X[1]);
                    }
                    i8 = i6;
                    z2 = z;
                }
            }
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i8;
        if (z2) {
            MzoOEjc4X(1);
        }
    }

    public final void dXrmkklc8(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            mhl5lIdbQ mhl5lidbq = ((s7MlVynBG) childAt.getLayoutParams()).q3BipwRCk;
            if (mhl5lidbq != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    mhl5lidbq.GPLPRo6go(this, childAt, obtain);
                } else {
                    mhl5lidbq.qVUwofr5s(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((s7MlVynBG) getChildAt(i2).getLayoutParams()).kmSgne1rO = false;
        }
        this.RG6kpfv3v = null;
        this.qVUwofr5s = false;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        mhl5lIdbQ mhl5lidbq = ((s7MlVynBG) view.getLayoutParams()).q3BipwRCk;
        if (mhl5lidbq != null) {
            Objects.requireNonNull(mhl5lidbq);
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.iMyQMM6Qj;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new s7MlVynBG(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new s7MlVynBG(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        Eeka1udhb();
        return Collections.unmodifiableList(this.CBQ5d1kRq);
    }

    public final o8nscdGif getLastWindowInsets() {
        return this.i8XZMQc6Z;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.CpG0imbht.q3BipwRCk();
    }

    public Drawable getStatusBarBackground() {
        return this.iMyQMM6Qj;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // con.QiVwQCcLp
    public boolean iiGwOFFnr(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                s7MlVynBG s7mlvynbg = (s7MlVynBG) childAt.getLayoutParams();
                mhl5lIdbQ mhl5lidbq = s7mlvynbg.q3BipwRCk;
                if (mhl5lidbq != null) {
                    boolean MzoOEjc4X = mhl5lidbq.MzoOEjc4X(this, childAt, view, view2, i, i2);
                    z |= MzoOEjc4X;
                    s7mlvynbg.J4Ux7ym32(i2, MzoOEjc4X);
                } else {
                    s7mlvynbg.J4Ux7ym32(i2, false);
                }
            }
        }
        return z;
    }

    public void ilHKhw3Yw(View view, int i) {
        Rect GPLPRo6go;
        Rect GPLPRo6go2;
        nOPp9PCGN nopp9pcgn;
        s7MlVynBG s7mlvynbg = (s7MlVynBG) view.getLayoutParams();
        View view2 = s7mlvynbg.vPSbyrYWX;
        int i2 = 0;
        if (view2 == null && s7mlvynbg.iiGwOFFnr != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (view2 != null) {
            GPLPRo6go = GPLPRo6go();
            GPLPRo6go2 = GPLPRo6go();
            try {
                vPSbyrYWX(view2, GPLPRo6go);
                s7MlVynBG s7mlvynbg2 = (s7MlVynBG) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                CBQ5d1kRq(i, GPLPRo6go, GPLPRo6go2, s7mlvynbg2, measuredWidth, measuredHeight);
                Puu3Rhg4F(s7mlvynbg2, GPLPRo6go2, measuredWidth, measuredHeight);
                view.layout(GPLPRo6go2.left, GPLPRo6go2.top, GPLPRo6go2.right, GPLPRo6go2.bottom);
            } finally {
                GPLPRo6go.setEmpty();
                nopp9pcgn = NyWTwPF6V;
                nopp9pcgn.tGV7Q6urW(GPLPRo6go);
                GPLPRo6go2.setEmpty();
                nopp9pcgn.tGV7Q6urW(GPLPRo6go2);
            }
        } else {
            int i3 = s7mlvynbg.kCA6Zs9sL;
            if (i3 >= 0) {
                s7MlVynBG s7mlvynbg3 = (s7MlVynBG) view.getLayoutParams();
                int i4 = s7mlvynbg3.tGV7Q6urW;
                if (i4 == 0) {
                    i4 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
                int i5 = absoluteGravity & 7;
                int i6 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i == 1) {
                    i3 = width - i3;
                }
                int kmSgne1rO = kmSgne1rO(i3) - measuredWidth2;
                if (i5 == 1) {
                    kmSgne1rO += measuredWidth2 / 2;
                } else if (i5 == 5) {
                    kmSgne1rO += measuredWidth2;
                }
                if (i6 == 16) {
                    i2 = 0 + (measuredHeight2 / 2);
                } else if (i6 == 80) {
                    i2 = measuredHeight2 + 0;
                }
                int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) s7mlvynbg3).leftMargin, Math.min(kmSgne1rO, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) s7mlvynbg3).rightMargin));
                int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) s7mlvynbg3).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) s7mlvynbg3).bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            s7MlVynBG s7mlvynbg4 = (s7MlVynBG) view.getLayoutParams();
            GPLPRo6go = GPLPRo6go();
            GPLPRo6go.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) s7mlvynbg4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) s7mlvynbg4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) s7mlvynbg4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) s7mlvynbg4).bottomMargin);
            if (this.i8XZMQc6Z != null) {
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                if (VCCyeOu6I.J4Ux7ym32(this) && !VCCyeOu6I.J4Ux7ym32(view)) {
                    GPLPRo6go.left = this.i8XZMQc6Z.J4Ux7ym32() + GPLPRo6go.left;
                    GPLPRo6go.top = this.i8XZMQc6Z.dIocxURUo() + GPLPRo6go.top;
                    GPLPRo6go.right -= this.i8XZMQc6Z.tGV7Q6urW();
                    GPLPRo6go.bottom -= this.i8XZMQc6Z.q3BipwRCk();
                }
            }
            GPLPRo6go2 = GPLPRo6go();
            int i7 = s7mlvynbg4.tGV7Q6urW;
            if ((i7 & 7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            Gravity.apply(i7, view.getMeasuredWidth(), view.getMeasuredHeight(), GPLPRo6go, GPLPRo6go2, i);
            view.layout(GPLPRo6go2.left, GPLPRo6go2.top, GPLPRo6go2.right, GPLPRo6go2.bottom);
        }
    }

    public final void ixWaw2akD(View view, int i) {
        s7MlVynBG s7mlvynbg = (s7MlVynBG) view.getLayoutParams();
        int i2 = s7mlvynbg.oon79WMrY;
        if (i2 != i) {
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            view.offsetTopAndBottom(i - i2);
            s7mlvynbg.oon79WMrY = i;
        }
    }

    @Override // con.QiVwQCcLp
    public void kCA6Zs9sL(View view, int i, int i2, int i3, int i4, int i5) {
        dIocxURUo(view, i, i2, i3, i4, 0, this.ilHKhw3Yw);
    }

    public final int kmSgne1rO(int i) {
        StringBuilder sb;
        int[] iArr = this.dXrmkklc8;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        dXrmkklc8(false);
        if (this.WaUP0CF08) {
            if (this.sk5s77z6Q == null) {
                this.sk5s77z6Q = new dNif5KqqH();
            }
            getViewTreeObserver().addOnPreDrawListener(this.sk5s77z6Q);
        }
        if (this.i8XZMQc6Z == null) {
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            if (VCCyeOu6I.J4Ux7ym32(this)) {
                cyVJjwbRF.tGV7Q6urW(this);
            }
        }
        this.Eeka1udhb = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        dXrmkklc8(false);
        if (this.WaUP0CF08 && this.sk5s77z6Q != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.sk5s77z6Q);
        }
        View view = this.ixWaw2akD;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.Eeka1udhb = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.dfpT1j18n && this.iMyQMM6Qj != null) {
            o8nscdGif o8nscdgif = this.i8XZMQc6Z;
            int dIocxURUo = o8nscdgif != null ? o8nscdgif.dIocxURUo() : 0;
            if (dIocxURUo > 0) {
                this.iMyQMM6Qj.setBounds(0, 0, getWidth(), dIocxURUo);
                this.iMyQMM6Qj.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            dXrmkklc8(true);
        }
        boolean qVUwofr5s = qVUwofr5s(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            dXrmkklc8(true);
        }
        return qVUwofr5s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        mhl5lIdbQ mhl5lidbq;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        int dIocxURUo = RBJDIwG1D.dIocxURUo(this);
        int size = this.CBQ5d1kRq.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.CBQ5d1kRq.get(i5);
            if (view.getVisibility() != 8 && ((mhl5lidbq = ((s7MlVynBG) view.getLayoutParams()).q3BipwRCk) == null || !mhl5lidbq.Puu3Rhg4F(this, view, dIocxURUo))) {
                ilHKhw3Yw(view, dIocxURUo);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0184, code lost:
        if (r0.yWvV4ePLl(r30, r20, r8, r21, r23, 0) == false) goto L_0x0194;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0187  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        mhl5lIdbQ mhl5lidbq;
        int i10;
        s7MlVynBG s7mlvynbg;
        int i11;
        int i12;
        boolean z2;
        Eeka1udhb();
        int childCount = getChildCount();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i14);
            LKa8y802S lKa8y802S = this.kmSgne1rO;
            int i15 = ((ZmYjNS8wW) lKa8y802S.dIocxURUo).Bhmn1KIah;
            int i16 = 0;
            while (true) {
                if (i16 < i15) {
                    ArrayList arrayList = (ArrayList) ((ZmYjNS8wW) lKa8y802S.dIocxURUo).vPSbyrYWX(i16);
                    if (arrayList != null && arrayList.contains(childAt)) {
                        z2 = true;
                        break;
                    }
                    i16++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                z = true;
                break;
            }
            i14++;
        }
        if (z != this.WaUP0CF08) {
            if (z) {
                if (this.Eeka1udhb) {
                    if (this.sk5s77z6Q == null) {
                        this.sk5s77z6Q = new dNif5KqqH();
                    }
                    getViewTreeObserver().addOnPreDrawListener(this.sk5s77z6Q);
                }
                this.WaUP0CF08 = true;
            } else {
                if (this.Eeka1udhb && this.sk5s77z6Q != null) {
                    getViewTreeObserver().removeOnPreDrawListener(this.sk5s77z6Q);
                }
                this.WaUP0CF08 = false;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        int dIocxURUo = RBJDIwG1D.dIocxURUo(this);
        boolean z3 = dIocxURUo == 1;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i17 = paddingLeft + paddingRight;
        int i18 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        boolean z4 = this.i8XZMQc6Z != null && VCCyeOu6I.J4Ux7ym32(this);
        int size3 = this.CBQ5d1kRq.size();
        int i19 = suggestedMinimumWidth;
        int i20 = suggestedMinimumHeight;
        int i21 = 0;
        int i22 = 0;
        while (i22 < size3) {
            View view = (View) this.CBQ5d1kRq.get(i22);
            if (view.getVisibility() == 8) {
                i5 = i22;
                i3 = size3;
                i4 = paddingLeft;
            } else {
                s7MlVynBG s7mlvynbg2 = (s7MlVynBG) view.getLayoutParams();
                int i23 = s7mlvynbg2.kCA6Zs9sL;
                if (i23 < 0 || mode == 0) {
                    i6 = i21;
                } else {
                    int kmSgne1rO = kmSgne1rO(i23);
                    int i24 = s7mlvynbg2.tGV7Q6urW;
                    if (i24 == 0) {
                        i24 = 8388661;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i24, dIocxURUo) & 7;
                    i6 = i21;
                    if ((absoluteGravity == 3 && !z3) || (absoluteGravity == 5 && z3)) {
                        i7 = Math.max(0, (size - paddingRight) - kmSgne1rO);
                    } else if ((absoluteGravity != 5 || z3) && (absoluteGravity != 3 || !z3)) {
                        i13 = 0;
                    } else {
                        i7 = Math.max(0, kmSgne1rO - paddingLeft);
                    }
                    if (z4 || VCCyeOu6I.J4Ux7ym32(view)) {
                        i9 = i;
                        i8 = i2;
                    } else {
                        int tGV7Q6urW = this.i8XZMQc6Z.tGV7Q6urW() + this.i8XZMQc6Z.J4Ux7ym32();
                        int q3BipwRCk = this.i8XZMQc6Z.q3BipwRCk() + this.i8XZMQc6Z.dIocxURUo();
                        i9 = View.MeasureSpec.makeMeasureSpec(size - tGV7Q6urW, mode);
                        i8 = View.MeasureSpec.makeMeasureSpec(size2 - q3BipwRCk, mode2);
                    }
                    mhl5lidbq = s7mlvynbg2.q3BipwRCk;
                    if (mhl5lidbq == null) {
                        s7mlvynbg = s7mlvynbg2;
                        i11 = i6;
                        i5 = i22;
                        i10 = i20;
                        i4 = paddingLeft;
                        i12 = i19;
                        i3 = size3;
                    } else {
                        s7mlvynbg = s7mlvynbg2;
                        i10 = i20;
                        i3 = size3;
                        i4 = paddingLeft;
                        i11 = i6;
                        i5 = i22;
                        i12 = i19;
                    }
                    measureChildWithMargins(view, i9, i7, i8, 0);
                    i19 = Math.max(i12, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) s7mlvynbg).leftMargin + ((ViewGroup.MarginLayoutParams) s7mlvynbg).rightMargin);
                    i20 = Math.max(i10, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) s7mlvynbg).topMargin + ((ViewGroup.MarginLayoutParams) s7mlvynbg).bottomMargin);
                    i21 = View.combineMeasuredStates(i11, view.getMeasuredState());
                }
                i7 = i13;
                if (z4) {
                }
                i9 = i;
                i8 = i2;
                mhl5lidbq = s7mlvynbg2.q3BipwRCk;
                if (mhl5lidbq == null) {
                }
                measureChildWithMargins(view, i9, i7, i8, 0);
                i19 = Math.max(i12, view.getMeasuredWidth() + i17 + ((ViewGroup.MarginLayoutParams) s7mlvynbg).leftMargin + ((ViewGroup.MarginLayoutParams) s7mlvynbg).rightMargin);
                i20 = Math.max(i10, view.getMeasuredHeight() + i18 + ((ViewGroup.MarginLayoutParams) s7mlvynbg).topMargin + ((ViewGroup.MarginLayoutParams) s7mlvynbg).bottomMargin);
                i21 = View.combineMeasuredStates(i11, view.getMeasuredState());
            }
            i22 = i5 + 1;
            paddingLeft = i4;
            size3 = i3;
            i13 = 0;
        }
        setMeasuredDimension(View.resolveSizeAndState(i19, i, -16777216 & i21), View.resolveSizeAndState(i20, i2, i21 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                s7MlVynBG s7mlvynbg = (s7MlVynBG) childAt.getLayoutParams();
                if (s7mlvynbg.q3BipwRCk(0)) {
                    mhl5lIdbQ mhl5lidbq = s7mlvynbg.q3BipwRCk;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        mhl5lIdbQ mhl5lidbq;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                s7MlVynBG s7mlvynbg = (s7MlVynBG) childAt.getLayoutParams();
                if (s7mlvynbg.q3BipwRCk(0) && (mhl5lidbq = s7mlvynbg.q3BipwRCk) != null) {
                    z |= mhl5lidbq.oon79WMrY(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        tGV7Q6urW(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dIocxURUo(view, i, i2, i3, i4, 0, this.ilHKhw3Yw);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        q3BipwRCk(view, view2, i, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof WfopS3efW)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        WfopS3efW wfopS3efW = (WfopS3efW) parcelable;
        super.onRestoreInstanceState(wfopS3efW.CBQ5d1kRq);
        SparseArray sparseArray = wfopS3efW.Bhmn1KIah;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            mhl5lIdbQ mhl5lidbq = Bhmn1KIah(childAt).q3BipwRCk;
            if (!(id == -1 || mhl5lidbq == null || (parcelable2 = (Parcelable) sparseArray.get(id)) == null)) {
                mhl5lidbq.Bhmn1KIah(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable PSTqBLTET;
        WfopS3efW wfopS3efW = new WfopS3efW(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            mhl5lIdbQ mhl5lidbq = ((s7MlVynBG) childAt.getLayoutParams()).q3BipwRCk;
            if (!(id == -1 || mhl5lidbq == null || (PSTqBLTET = mhl5lidbq.PSTqBLTET(this, childAt)) == null)) {
                sparseArray.append(id, PSTqBLTET);
            }
        }
        wfopS3efW.Bhmn1KIah = sparseArray;
        return wfopS3efW;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return iiGwOFFnr(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        J4Ux7ym32(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (this.RG6kpfv3v == null) {
            z2 = qVUwofr5s(motionEvent, 1);
        } else {
            z2 = false;
        }
        mhl5lIdbQ mhl5lidbq = ((s7MlVynBG) this.RG6kpfv3v.getLayoutParams()).q3BipwRCk;
        if (mhl5lidbq != null) {
            z = mhl5lidbq.qVUwofr5s(this, this.RG6kpfv3v, motionEvent);
            motionEvent2 = null;
            if (this.RG6kpfv3v != null) {
                z |= super.onTouchEvent(motionEvent);
            } else if (z2) {
                long uptimeMillis = SystemClock.uptimeMillis();
                motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEvent2);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            if (actionMasked != 1 || actionMasked == 3) {
                dXrmkklc8(false);
            }
            return z;
        }
        z = false;
        motionEvent2 = null;
        if (this.RG6kpfv3v != null) {
        }
        if (motionEvent2 != null) {
        }
        if (actionMasked != 1) {
        }
        dXrmkklc8(false);
        return z;
    }

    public List oon79WMrY(View view) {
        LKa8y802S lKa8y802S = this.kmSgne1rO;
        int i = ((ZmYjNS8wW) lKa8y802S.dIocxURUo).Bhmn1KIah;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) ((ZmYjNS8wW) lKa8y802S.dIocxURUo).vPSbyrYWX(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((ZmYjNS8wW) lKa8y802S.dIocxURUo).Puu3Rhg4F(i2));
            }
        }
        this.PSTqBLTET.clear();
        if (arrayList != null) {
            this.PSTqBLTET.addAll(arrayList);
        }
        return this.PSTqBLTET;
    }

    @Override // con.QiVwQCcLp
    public void q3BipwRCk(View view, View view2, int i, int i2) {
        KTMDafsbu kTMDafsbu = this.CpG0imbht;
        if (i2 == 1) {
            kTMDafsbu.J4Ux7ym32 = i;
        } else {
            kTMDafsbu.q3BipwRCk = i;
        }
        this.ixWaw2akD = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((s7MlVynBG) getChildAt(i3).getLayoutParams()).q3BipwRCk(i2);
        }
    }

    public final boolean qVUwofr5s(MotionEvent motionEvent, int i) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        List list = this.Bhmn1KIah;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator comparator = mUqPm6GBh;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) list.get(i3);
            s7MlVynBG s7mlvynbg = (s7MlVynBG) view.getLayoutParams();
            mhl5lIdbQ mhl5lidbq = s7mlvynbg.q3BipwRCk;
            if (!(z2 || z3) || actionMasked == 0) {
                if (!z2 && mhl5lidbq != null) {
                    if (i == 0) {
                        z2 = mhl5lidbq.GPLPRo6go(this, view, motionEvent);
                    } else if (i == 1) {
                        z2 = mhl5lidbq.qVUwofr5s(this, view, motionEvent);
                    }
                    if (z2) {
                        this.RG6kpfv3v = view;
                    }
                }
                if (s7mlvynbg.q3BipwRCk == null) {
                    s7mlvynbg.kmSgne1rO = false;
                }
                boolean z4 = s7mlvynbg.kmSgne1rO;
                if (z4) {
                    z = true;
                } else {
                    z = z4 | false;
                    s7mlvynbg.kmSgne1rO = z;
                }
                z3 = z && !z4;
                if (z && !z3) {
                    break;
                }
            } else if (mhl5lidbq != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    mhl5lidbq.GPLPRo6go(this, view, motionEvent2);
                } else if (i == 1) {
                    mhl5lidbq.qVUwofr5s(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        mhl5lIdbQ mhl5lidbq = ((s7MlVynBG) view.getLayoutParams()).q3BipwRCk;
        if (mhl5lidbq == null || !mhl5lidbq.kmSgne1rO(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.qVUwofr5s) {
            dXrmkklc8(false);
            this.qVUwofr5s = true;
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        sk5s77z6Q();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.cAwN510t2 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.iMyQMM6Qj;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.iMyQMM6Qj = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.iMyQMM6Qj.setState(getDrawableState());
                }
                Drawable drawable4 = this.iMyQMM6Qj;
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                drawable4.setLayoutDirection(RBJDIwG1D.dIocxURUo(this));
                this.iMyQMM6Qj.setVisible(getVisibility() == 0, false);
                this.iMyQMM6Qj.setCallback(this);
            }
            WeakHashMap weakHashMap2 = IuQbWntsc.q3BipwRCk;
            VCCyeOu6I.vPSbyrYWX(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            Context context = getContext();
            Object obj = D856HTNqd.q3BipwRCk;
            drawable = jsNC7SjP9.J4Ux7ym32(context, i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.iMyQMM6Qj;
        if (drawable != null && drawable.isVisible() != z) {
            this.iMyQMM6Qj.setVisible(z, false);
        }
    }

    public final void sk5s77z6Q() {
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        if (VCCyeOu6I.J4Ux7ym32(this)) {
            if (this.IytU16YUK == null) {
                this.IytU16YUK = new RG2GI7LDp();
            }
            mJLaJepZo.RG6kpfv3v(this, this.IytU16YUK);
            setSystemUiVisibility(1280);
            return;
        }
        mJLaJepZo.RG6kpfv3v(this, null);
    }

    @Override // con.QiVwQCcLp
    public void tGV7Q6urW(View view, int i, int i2, int[] iArr, int i3) {
        mhl5lIdbQ mhl5lidbq;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                s7MlVynBG s7mlvynbg = (s7MlVynBG) childAt.getLayoutParams();
                if (s7mlvynbg.q3BipwRCk(i3) && (mhl5lidbq = s7mlvynbg.q3BipwRCk) != null) {
                    int[] iArr2 = this.MzoOEjc4X;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    mhl5lidbq.vPSbyrYWX(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.MzoOEjc4X;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.MzoOEjc4X;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            MzoOEjc4X(1);
        }
    }

    public void vPSbyrYWX(View view, Rect rect) {
        ThreadLocal threadLocal = blGiSoWm3.q3BipwRCk;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = blGiSoWm3.q3BipwRCk;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        blGiSoWm3.q3BipwRCk(this, view, matrix);
        ThreadLocal threadLocal3 = blGiSoWm3.J4Ux7ym32;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.iMyQMM6Qj;
    }

    public void yWvV4ePLl(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            vPSbyrYWX(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof s7MlVynBG) {
            return new s7MlVynBG((s7MlVynBG) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new s7MlVynBG((ViewGroup.MarginLayoutParams) layoutParams) : new s7MlVynBG(layoutParams);
    }
}
