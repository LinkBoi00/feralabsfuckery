package con;

import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.fragment.app.RG2GI7LDp;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class j6XJY7rz4 implements TJkYEZky4 {
    public Object Bhmn1KIah;
    public final /* synthetic */ int CBQ5d1kRq;
    public Object PSTqBLTET;
    public Object kmSgne1rO;

    public j6XJY7rz4() {
        this.CBQ5d1kRq = 5;
        this.kmSgne1rO = new ArrayList();
        this.Bhmn1KIah = new HashMap();
    }

    public static j6XJY7rz4 AqaWJg0b4(Context context, AttributeSet attributeSet, int[] iArr) {
        return new j6XJY7rz4(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static j6XJY7rz4 mUqPm6GBh(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new j6XJY7rz4(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public ColorStateList Bhmn1KIah(int i) {
        int resourceId;
        if (((TypedArray) this.Bhmn1KIah).hasValue(i) && (resourceId = ((TypedArray) this.Bhmn1KIah).getResourceId(i, 0)) != 0) {
            ThreadLocal threadLocal = C8A1BseZU.q3BipwRCk;
            ColorStateList colorStateList = ((Context) this.kmSgne1rO).getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return ((TypedArray) this.Bhmn1KIah).getColorStateList(i);
    }

    public int CBQ5d1kRq(int i, int i2) {
        return ((TypedArray) this.Bhmn1KIah).getColor(i, i2);
    }

    public boolean CpG0imbht(int i) {
        return ((TypedArray) this.Bhmn1KIah).hasValue(i);
    }

    public int Eeka1udhb(int i, int i2) {
        return ((TypedArray) this.Bhmn1KIah).getDimensionPixelSize(i, i2);
    }

    public UxHHqhbTP GPLPRo6go(String str) {
        RG2GI7LDp rG2GI7LDp = (RG2GI7LDp) ((HashMap) this.Bhmn1KIah).get(str);
        if (rG2GI7LDp != null) {
            return rG2GI7LDp.tGV7Q6urW;
        }
        return null;
    }

    public CharSequence IytU16YUK(int i) {
        return ((TypedArray) this.Bhmn1KIah).getText(i);
    }

    @Override // con.TJkYEZky4
    public void J4Ux7ym32() {
    }

    @Override // con.TJkYEZky4
    public Uri MzoOEjc4X() {
        return (Uri) this.kmSgne1rO;
    }

    public void NyWTwPF6V() {
        ((TypedArray) this.Bhmn1KIah).recycle();
    }

    @Override // con.TJkYEZky4
    public Object PSTqBLTET() {
        return null;
    }

    public UxHHqhbTP Puu3Rhg4F(String str) {
        for (RG2GI7LDp rG2GI7LDp : ((HashMap) this.Bhmn1KIah).values()) {
            if (rG2GI7LDp != null) {
                UxHHqhbTP uxHHqhbTP = rG2GI7LDp.tGV7Q6urW;
                if (!str.equals(uxHHqhbTP.MzoOEjc4X)) {
                    uxHHqhbTP = uxHHqhbTP.qFBXIgpia.tGV7Q6urW.Puu3Rhg4F(str);
                }
                if (uxHHqhbTP != null) {
                    return uxHHqhbTP;
                }
            }
        }
        return null;
    }

    public Drawable RG6kpfv3v(int i) {
        int resourceId;
        Drawable iiGwOFFnr;
        if (!((TypedArray) this.Bhmn1KIah).hasValue(i) || (resourceId = ((TypedArray) this.Bhmn1KIah).getResourceId(i, 0)) == 0) {
            return null;
        }
        srLS6zLvm q3BipwRCk = srLS6zLvm.q3BipwRCk();
        Context context = (Context) this.kmSgne1rO;
        synchronized (q3BipwRCk) {
            iiGwOFFnr = q3BipwRCk.q3BipwRCk.iiGwOFFnr(context, resourceId, true);
        }
        return iiGwOFFnr;
    }

    public List WaUP0CF08() {
        ArrayList arrayList;
        if (((ArrayList) this.kmSgne1rO).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.kmSgne1rO)) {
            arrayList = new ArrayList((ArrayList) this.kmSgne1rO);
        }
        return arrayList;
    }

    public String cAwN510t2(int i) {
        return ((TypedArray) this.Bhmn1KIah).getString(i);
    }

    public boolean dIocxURUo(String str) {
        return ((HashMap) this.Bhmn1KIah).get(str) != null;
    }

    public Drawable dXrmkklc8(int i) {
        int resourceId;
        return (!((TypedArray) this.Bhmn1KIah).hasValue(i) || (resourceId = ((TypedArray) this.Bhmn1KIah).getResourceId(i, 0)) == 0) ? ((TypedArray) this.Bhmn1KIah).getDrawable(i) : C8A1BseZU.q3BipwRCk((Context) this.kmSgne1rO, resourceId);
    }

    public int dfpT1j18n(int i, int i2) {
        return ((TypedArray) this.Bhmn1KIah).getLayoutDimension(i, i2);
    }

    public int i8XZMQc6Z(int i, int i2) {
        return ((TypedArray) this.Bhmn1KIah).getInt(i, i2);
    }

    public int iMyQMM6Qj(int i, int i2) {
        return ((TypedArray) this.Bhmn1KIah).getResourceId(i, i2);
    }

    public void iiGwOFFnr(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        String q3BipwRCk = UexvVay3o.q3BipwRCk(str, "    ");
        if (!((HashMap) this.Bhmn1KIah).isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (RG2GI7LDp rG2GI7LDp : ((HashMap) this.Bhmn1KIah).values()) {
                printWriter.print(str);
                if (rG2GI7LDp != null) {
                    UxHHqhbTP uxHHqhbTP = rG2GI7LDp.tGV7Q6urW;
                    printWriter.println(uxHHqhbTP);
                    Objects.requireNonNull(uxHHqhbTP);
                    printWriter.print(q3BipwRCk);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(uxHHqhbTP.AqaWJg0b4));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(uxHHqhbTP.mUqPm6GBh));
                    printWriter.print(" mTag=");
                    printWriter.println(uxHHqhbTP.NyWTwPF6V);
                    printWriter.print(q3BipwRCk);
                    printWriter.print("mState=");
                    printWriter.print(uxHHqhbTP.CBQ5d1kRq);
                    printWriter.print(" mWho=");
                    printWriter.print(uxHHqhbTP.MzoOEjc4X);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(uxHHqhbTP.cAwN510t2);
                    printWriter.print(q3BipwRCk);
                    printWriter.print("mAdded=");
                    printWriter.print(uxHHqhbTP.ixWaw2akD);
                    printWriter.print(" mRemoving=");
                    printWriter.print(uxHHqhbTP.sk5s77z6Q);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(uxHHqhbTP.WaUP0CF08);
                    printWriter.print(" mInLayout=");
                    printWriter.println(uxHHqhbTP.i8XZMQc6Z);
                    printWriter.print(q3BipwRCk);
                    printWriter.print("mHidden=");
                    printWriter.print(uxHHqhbTP.vNtjxmzUM);
                    printWriter.print(" mDetached=");
                    printWriter.print(uxHHqhbTP.i0Zug1mVk);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(uxHHqhbTP.V9LQMKGJe);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(q3BipwRCk);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(uxHHqhbTP.o4LF8RkoQ);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(uxHHqhbTP.juJ6pnCpu);
                    if (uxHHqhbTP.IytU16YUK != null) {
                        printWriter.print(q3BipwRCk);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(uxHHqhbTP.IytU16YUK);
                    }
                    if (uxHHqhbTP.CpG0imbht != null) {
                        printWriter.print(q3BipwRCk);
                        printWriter.print("mHost=");
                        printWriter.println(uxHHqhbTP.CpG0imbht);
                    }
                    if (uxHHqhbTP.nlGCs0NZs != null) {
                        printWriter.print(q3BipwRCk);
                        printWriter.print("mParentFragment=");
                        printWriter.println(uxHHqhbTP.nlGCs0NZs);
                    }
                    if (uxHHqhbTP.ilHKhw3Yw != null) {
                        printWriter.print(q3BipwRCk);
                        printWriter.print("mArguments=");
                        printWriter.println(uxHHqhbTP.ilHKhw3Yw);
                    }
                    if (uxHHqhbTP.kmSgne1rO != null) {
                        printWriter.print(q3BipwRCk);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(uxHHqhbTP.kmSgne1rO);
                    }
                    if (uxHHqhbTP.Bhmn1KIah != null) {
                        printWriter.print(q3BipwRCk);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(uxHHqhbTP.Bhmn1KIah);
                    }
                    if (uxHHqhbTP.PSTqBLTET != null) {
                        printWriter.print(q3BipwRCk);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(uxHHqhbTP.PSTqBLTET);
                    }
                    Object obj = uxHHqhbTP.qVUwofr5s;
                    if (obj == null) {
                        fVMSvDhE6 fvmsvdhe6 = uxHHqhbTP.IytU16YUK;
                        obj = (fvmsvdhe6 == null || (str2 = uxHHqhbTP.Eeka1udhb) == null) ? null : fvmsvdhe6.NyWTwPF6V(str2);
                    }
                    if (obj != null) {
                        printWriter.print(q3BipwRCk);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(uxHHqhbTP.dXrmkklc8);
                    }
                    printWriter.print(q3BipwRCk);
                    printWriter.print("mPopDirection=");
                    printWriter.println(uxHHqhbTP.ilHKhw3Yw());
                    if (uxHHqhbTP.yWvV4ePLl() != 0) {
                        printWriter.print(q3BipwRCk);
                        printWriter.print("getEnterAnim=");
                        printWriter.println(uxHHqhbTP.yWvV4ePLl());
                    }
                    if (uxHHqhbTP.CBQ5d1kRq() != 0) {
                        printWriter.print(q3BipwRCk);
                        printWriter.print("getExitAnim=");
                        printWriter.println(uxHHqhbTP.CBQ5d1kRq());
                    }
                    if (uxHHqhbTP.qVUwofr5s() != 0) {
                        printWriter.print(q3BipwRCk);
                        printWriter.print("getPopEnterAnim=");
                        printWriter.println(uxHHqhbTP.qVUwofr5s());
                    }
                    if (uxHHqhbTP.Eeka1udhb() != 0) {
                        printWriter.print(q3BipwRCk);
                        printWriter.print("getPopExitAnim=");
                        printWriter.println(uxHHqhbTP.Eeka1udhb());
                    }
                    if (uxHHqhbTP.igRQEZxnW != null) {
                        printWriter.print(q3BipwRCk);
                        printWriter.print("mContainer=");
                        printWriter.println(uxHHqhbTP.igRQEZxnW);
                    }
                    if (uxHHqhbTP.EBQXiIPmm != null) {
                        printWriter.print(q3BipwRCk);
                        printWriter.print("mView=");
                        printWriter.println(uxHHqhbTP.EBQXiIPmm);
                    }
                    if (uxHHqhbTP.dIocxURUo() != null) {
                        printWriter.print(q3BipwRCk);
                        printWriter.print("mAnimatingAway=");
                        printWriter.println(uxHHqhbTP.dIocxURUo());
                    }
                    if (uxHHqhbTP.Puu3Rhg4F() != null) {
                        UOv2ZmhQ5.J4Ux7ym32(uxHHqhbTP).q3BipwRCk(q3BipwRCk, fileDescriptor, printWriter, strArr);
                    }
                    printWriter.print(q3BipwRCk);
                    printWriter.println("Child " + uxHHqhbTP.qFBXIgpia + ":");
                    uxHHqhbTP.qFBXIgpia.iMyQMM6Qj(UexvVay3o.q3BipwRCk(q3BipwRCk, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = ((ArrayList) this.kmSgne1rO).size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(((UxHHqhbTP) ((ArrayList) this.kmSgne1rO).get(i)).toString());
            }
        }
    }

    public float ilHKhw3Yw(int i, float f) {
        return ((TypedArray) this.Bhmn1KIah).getDimension(i, f);
    }

    public Typeface ixWaw2akD(int i, int i2, DfseMYa7G dfseMYa7G) {
        int resourceId = ((TypedArray) this.Bhmn1KIah).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.PSTqBLTET) == null) {
            this.PSTqBLTET = new TypedValue();
        }
        Context context = (Context) this.kmSgne1rO;
        TypedValue typedValue = (TypedValue) this.PSTqBLTET;
        ThreadLocal threadLocal = K95C08eIr.q3BipwRCk;
        if (context.isRestricted()) {
            return null;
        }
        return K95C08eIr.J4Ux7ym32(context, resourceId, typedValue, i2, dfseMYa7G, null, true, false);
    }

    @Override // con.TJkYEZky4
    public Uri kCA6Zs9sL() {
        return (Uri) this.PSTqBLTET;
    }

    @Override // con.TJkYEZky4
    public ClipDescription kmSgne1rO() {
        return (ClipDescription) this.Bhmn1KIah;
    }

    public void nlGCs0NZs(RG2GI7LDp rG2GI7LDp) {
        UxHHqhbTP uxHHqhbTP = rG2GI7LDp.tGV7Q6urW;
        if (uxHHqhbTP.o4LF8RkoQ) {
            ((XDvWW0XDE) this.PSTqBLTET).J4Ux7ym32(uxHHqhbTP);
        }
        if (((RG2GI7LDp) ((HashMap) this.Bhmn1KIah).put(uxHHqhbTP.MzoOEjc4X, null)) != null && fVMSvDhE6.juJ6pnCpu(2)) {
            Dt6xXPjII.q3BipwRCk("Removed fragment from active set ", uxHHqhbTP, "FragmentManager");
        }
    }

    public List oon79WMrY() {
        ArrayList arrayList = new ArrayList();
        for (RG2GI7LDp rG2GI7LDp : ((HashMap) this.Bhmn1KIah).values()) {
            arrayList.add(rG2GI7LDp != null ? rG2GI7LDp.tGV7Q6urW : null);
        }
        return arrayList;
    }

    public void q3BipwRCk(UxHHqhbTP uxHHqhbTP) {
        if (!((ArrayList) this.kmSgne1rO).contains(uxHHqhbTP)) {
            synchronized (((ArrayList) this.kmSgne1rO)) {
                ((ArrayList) this.kmSgne1rO).add(uxHHqhbTP);
            }
            uxHHqhbTP.ixWaw2akD = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + uxHHqhbTP);
    }

    public void qFBXIgpia(RG2GI7LDp rG2GI7LDp) {
        UxHHqhbTP uxHHqhbTP = rG2GI7LDp.tGV7Q6urW;
        if (!dIocxURUo(uxHHqhbTP.MzoOEjc4X)) {
            ((HashMap) this.Bhmn1KIah).put(uxHHqhbTP.MzoOEjc4X, rG2GI7LDp);
            if (fVMSvDhE6.juJ6pnCpu(2)) {
                Dt6xXPjII.q3BipwRCk("Added fragment to active set ", uxHHqhbTP, "FragmentManager");
            }
        }
    }

    public int qVUwofr5s(int i, int i2) {
        return ((TypedArray) this.Bhmn1KIah).getDimensionPixelOffset(i, i2);
    }

    public RG2GI7LDp sk5s77z6Q(String str) {
        return (RG2GI7LDp) ((HashMap) this.Bhmn1KIah).get(str);
    }

    public void tGV7Q6urW() {
        ((HashMap) this.Bhmn1KIah).values().removeAll(Collections.singleton(null));
    }

    public String toString() {
        switch (this.CBQ5d1kRq) {
            case 2:
                String str = "[ ";
                if (((miIsFJ8kP) this.kmSgne1rO) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk(str);
                        q3BipwRCk.append(((miIsFJ8kP) this.kmSgne1rO).Eeka1udhb[i]);
                        q3BipwRCk.append(" ");
                        str = q3BipwRCk.toString();
                    }
                }
                return str + "] " + ((miIsFJ8kP) this.kmSgne1rO);
            default:
                return super.toString();
        }
    }

    public void vNtjxmzUM(UxHHqhbTP uxHHqhbTP) {
        synchronized (((ArrayList) this.kmSgne1rO)) {
            ((ArrayList) this.kmSgne1rO).remove(uxHHqhbTP);
        }
        uxHHqhbTP.ixWaw2akD = false;
    }

    public boolean vPSbyrYWX(int i, boolean z) {
        return ((TypedArray) this.Bhmn1KIah).getBoolean(i, z);
    }

    public List yWvV4ePLl() {
        ArrayList arrayList = new ArrayList();
        for (RG2GI7LDp rG2GI7LDp : ((HashMap) this.Bhmn1KIah).values()) {
            if (rG2GI7LDp != null) {
                arrayList.add(rG2GI7LDp);
            }
        }
        return arrayList;
    }

    public j6XJY7rz4(Context context, TypedArray typedArray) {
        this.CBQ5d1kRq = 0;
        this.kmSgne1rO = context;
        this.Bhmn1KIah = typedArray;
    }

    public j6XJY7rz4(mYZo3Ot61 myzo3ot61, mYZo3Ot61 myzo3ot612) {
        this.CBQ5d1kRq = 2;
        this.PSTqBLTET = myzo3ot61;
        this.Bhmn1KIah = myzo3ot612;
    }

    public j6XJY7rz4(CharSequence charSequence, TextPaint textPaint, int i) {
        this.CBQ5d1kRq = 1;
        this.kmSgne1rO = anXlDk6fV.RG6kpfv3v(3, new l9c9Vklft(i, charSequence, textPaint));
        this.Bhmn1KIah = anXlDk6fV.RG6kpfv3v(3, new kuvj6DyFF(charSequence, textPaint));
        this.PSTqBLTET = anXlDk6fV.RG6kpfv3v(3, new atgZEnsDc(this, charSequence, textPaint));
    }

    public j6XJY7rz4(Runnable runnable) {
        this.CBQ5d1kRq = 3;
        this.Bhmn1KIah = new CopyOnWriteArrayList();
        this.PSTqBLTET = new HashMap();
        this.kmSgne1rO = runnable;
    }

    public j6XJY7rz4(Method method, Method method2, Method method3) {
        this.CBQ5d1kRq = 6;
        this.kmSgne1rO = method;
        this.Bhmn1KIah = method2;
        this.PSTqBLTET = method3;
    }
}
