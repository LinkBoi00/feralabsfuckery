package con;

import android.animation.Animator;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.RG2GI7LDp;
import androidx.lifecycle.mhl5lIdbQ;
import com.feravolt.preload.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class fVMSvDhE6 {
    public ArrayList AqaWJg0b4;
    public boolean CpG0imbht;
    public UxHHqhbTP Eeka1udhb;
    public OnBackPressedDispatcher GPLPRo6go;
    public boolean IytU16YUK;
    public boolean J4Ux7ym32;
    public ArrayList NyWTwPF6V;
    public UBpyZCltz WaUP0CF08;
    public boolean cAwN510t2;
    public ArrayList dIocxURUo;
    public UxHHqhbTP dXrmkklc8;
    public UBpyZCltz i8XZMQc6Z;
    public boolean iMyQMM6Qj;
    public z0NkpHHvU ilHKhw3Yw;
    public ArrayList kCA6Zs9sL;
    public ArrayList mUqPm6GBh;
    public ArrayList nlGCs0NZs;
    public boolean qFBXIgpia;
    public BKr8aejj7 qVUwofr5s;
    public UBpyZCltz sk5s77z6Q;
    public XDvWW0XDE vNtjxmzUM;
    public final ArrayList q3BipwRCk = new ArrayList();
    public final j6XJY7rz4 tGV7Q6urW = new j6XJY7rz4();
    public final Jxi1NxKkk iiGwOFFnr = new Jxi1NxKkk(this);
    public final TET2Qfhx1 Puu3Rhg4F = new TET2Qfhx1(this, false);
    public final AtomicInteger yWvV4ePLl = new AtomicInteger();
    public final Map oon79WMrY = Collections.synchronizedMap(new HashMap());
    public final Map vPSbyrYWX = Collections.synchronizedMap(new HashMap());
    public Map CBQ5d1kRq = Collections.synchronizedMap(new HashMap());
    public final uRyiqsiNk kmSgne1rO = new uRyiqsiNk(this, 2);
    public final fruufIznR Bhmn1KIah = new fruufIznR(this);
    public final CopyOnWriteArrayList PSTqBLTET = new CopyOnWriteArrayList();
    public int MzoOEjc4X = -1;
    public qKDOZuDet RG6kpfv3v = new qKDOZuDet(this);
    public uRyiqsiNk ixWaw2akD = new uRyiqsiNk(this, 3);
    public ArrayDeque dfpT1j18n = new ArrayDeque();
    public Runnable i0Zug1mVk = new Ybx9VCssc(this);

    public static boolean juJ6pnCpu(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public final void AqaWJg0b4(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList3 = arrayList2;
        boolean z = ((xkmNtxX26) arrayList.get(i)).PSTqBLTET;
        ArrayList arrayList4 = this.mUqPm6GBh;
        if (arrayList4 == null) {
            this.mUqPm6GBh = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.mUqPm6GBh.addAll(this.tGV7Q6urW.WaUP0CF08());
        UxHHqhbTP uxHHqhbTP = this.dXrmkklc8;
        int i5 = i;
        boolean z2 = false;
        while (true) {
            int i6 = 1;
            if (i5 < i2) {
                xkmNtxX26 xkmntxx26 = (xkmNtxX26) arrayList.get(i5);
                int i7 = 3;
                if (!((Boolean) arrayList3.get(i5)).booleanValue()) {
                    ArrayList arrayList5 = this.mUqPm6GBh;
                    int i8 = 0;
                    while (i8 < xkmntxx26.q3BipwRCk.size()) {
                        ah1jjZN55 ah1jjzn55 = (ah1jjZN55) xkmntxx26.q3BipwRCk.get(i8);
                        int i9 = ah1jjzn55.q3BipwRCk;
                        if (i9 == i6) {
                            i3 = i6;
                        } else if (i9 != 2) {
                            if (i9 == i7 || i9 == 6) {
                                arrayList5.remove(ah1jjzn55.J4Ux7ym32);
                                UxHHqhbTP uxHHqhbTP2 = ah1jjzn55.J4Ux7ym32;
                                if (uxHHqhbTP2 == uxHHqhbTP) {
                                    xkmntxx26.q3BipwRCk.add(i8, new ah1jjZN55(9, uxHHqhbTP2));
                                    i8++;
                                    i3 = 1;
                                    uxHHqhbTP = null;
                                    i8 += i3;
                                    i6 = i3;
                                    i7 = 3;
                                }
                            } else if (i9 == 7) {
                                i3 = 1;
                            } else if (i9 == 8) {
                                xkmntxx26.q3BipwRCk.add(i8, new ah1jjZN55(9, uxHHqhbTP));
                                i8++;
                                uxHHqhbTP = ah1jjzn55.J4Ux7ym32;
                            }
                            i3 = 1;
                            i8 += i3;
                            i6 = i3;
                            i7 = 3;
                        } else {
                            UxHHqhbTP uxHHqhbTP3 = ah1jjzn55.J4Ux7ym32;
                            int i10 = uxHHqhbTP3.mUqPm6GBh;
                            int size = arrayList5.size() - 1;
                            boolean z3 = false;
                            while (size >= 0) {
                                UxHHqhbTP uxHHqhbTP4 = (UxHHqhbTP) arrayList5.get(size);
                                if (uxHHqhbTP4.mUqPm6GBh != i10) {
                                    i4 = i10;
                                } else if (uxHHqhbTP4 == uxHHqhbTP3) {
                                    i4 = i10;
                                    z3 = true;
                                } else {
                                    if (uxHHqhbTP4 == uxHHqhbTP) {
                                        i4 = i10;
                                        xkmntxx26.q3BipwRCk.add(i8, new ah1jjZN55(9, uxHHqhbTP4));
                                        i8++;
                                        uxHHqhbTP = null;
                                    } else {
                                        i4 = i10;
                                    }
                                    ah1jjZN55 ah1jjzn552 = new ah1jjZN55(3, uxHHqhbTP4);
                                    ah1jjzn552.tGV7Q6urW = ah1jjzn55.tGV7Q6urW;
                                    ah1jjzn552.kCA6Zs9sL = ah1jjzn55.kCA6Zs9sL;
                                    ah1jjzn552.dIocxURUo = ah1jjzn55.dIocxURUo;
                                    ah1jjzn552.iiGwOFFnr = ah1jjzn55.iiGwOFFnr;
                                    xkmntxx26.q3BipwRCk.add(i8, ah1jjzn552);
                                    arrayList5.remove(uxHHqhbTP4);
                                    i8++;
                                }
                                size--;
                                i10 = i4;
                            }
                            if (z3) {
                                xkmntxx26.q3BipwRCk.remove(i8);
                                i8--;
                                i3 = 1;
                                i8 += i3;
                                i6 = i3;
                                i7 = 3;
                            } else {
                                i3 = 1;
                                ah1jjzn55.q3BipwRCk = 1;
                                arrayList5.add(uxHHqhbTP3);
                                i8 += i3;
                                i6 = i3;
                                i7 = 3;
                            }
                        }
                        arrayList5.add(ah1jjzn55.J4Ux7ym32);
                        i8 += i3;
                        i6 = i3;
                        i7 = 3;
                    }
                } else {
                    int i11 = 1;
                    ArrayList arrayList6 = this.mUqPm6GBh;
                    int size2 = xkmntxx26.q3BipwRCk.size() - 1;
                    while (size2 >= 0) {
                        ah1jjZN55 ah1jjzn553 = (ah1jjZN55) xkmntxx26.q3BipwRCk.get(size2);
                        int i12 = ah1jjzn553.q3BipwRCk;
                        if (i12 != i11) {
                            if (i12 != 3) {
                                switch (i12) {
                                    case 8:
                                        uxHHqhbTP = null;
                                        break;
                                    case 9:
                                        uxHHqhbTP = ah1jjzn553.J4Ux7ym32;
                                        break;
                                    case 10:
                                        ah1jjzn553.Puu3Rhg4F = ah1jjzn553.GPLPRo6go;
                                        break;
                                }
                                size2--;
                                i11 = 1;
                            }
                            arrayList6.add(ah1jjzn553.J4Ux7ym32);
                            size2--;
                            i11 = 1;
                        }
                        arrayList6.remove(ah1jjzn553.J4Ux7ym32);
                        size2--;
                        i11 = 1;
                    }
                }
                z2 = z2 || xkmntxx26.GPLPRo6go;
                i5++;
                arrayList3 = arrayList2;
            } else {
                this.mUqPm6GBh.clear();
                if (!z && this.MzoOEjc4X >= 1) {
                    for (int i13 = i; i13 < i2; i13++) {
                        Iterator it = ((xkmNtxX26) arrayList.get(i13)).q3BipwRCk.iterator();
                        while (it.hasNext()) {
                            UxHHqhbTP uxHHqhbTP5 = ((ah1jjZN55) it.next()).J4Ux7ym32;
                            if (!(uxHHqhbTP5 == null || uxHHqhbTP5.IytU16YUK == null)) {
                                this.tGV7Q6urW.qFBXIgpia(oon79WMrY(uxHHqhbTP5));
                            }
                        }
                    }
                }
                int i14 = i;
                while (i14 < i2) {
                    xkmNtxX26 xkmntxx262 = (xkmNtxX26) arrayList.get(i14);
                    if (((Boolean) arrayList2.get(i14)).booleanValue()) {
                        xkmntxx262.tGV7Q6urW(-1);
                        xkmntxx262.Puu3Rhg4F(i14 == i2 + -1);
                    } else {
                        xkmntxx262.tGV7Q6urW(1);
                        xkmntxx262.GPLPRo6go();
                    }
                    i14++;
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i15 = i; i15 < i2; i15++) {
                    xkmNtxX26 xkmntxx263 = (xkmNtxX26) arrayList.get(i15);
                    if (booleanValue) {
                        for (int size3 = xkmntxx263.q3BipwRCk.size() - 1; size3 >= 0; size3--) {
                            UxHHqhbTP uxHHqhbTP6 = ((ah1jjZN55) xkmntxx263.q3BipwRCk.get(size3)).J4Ux7ym32;
                            if (uxHHqhbTP6 != null) {
                                oon79WMrY(uxHHqhbTP6).vPSbyrYWX();
                            }
                        }
                    } else {
                        Iterator it2 = xkmntxx263.q3BipwRCk.iterator();
                        while (it2.hasNext()) {
                            UxHHqhbTP uxHHqhbTP7 = ((ah1jjZN55) it2.next()).J4Ux7ym32;
                            if (uxHHqhbTP7 != null) {
                                oon79WMrY(uxHHqhbTP7).vPSbyrYWX();
                            }
                        }
                    }
                }
                ziwPzaoF3(this.MzoOEjc4X, true);
                int i16 = i;
                Iterator it3 = ((HashSet) Puu3Rhg4F(arrayList, i16, i2)).iterator();
                while (it3.hasNext()) {
                    J3kbcXHdl j3kbcXHdl = (J3kbcXHdl) it3.next();
                    j3kbcXHdl.dIocxURUo = booleanValue;
                    j3kbcXHdl.Puu3Rhg4F();
                    j3kbcXHdl.tGV7Q6urW();
                }
                while (i16 < i2) {
                    xkmNtxX26 xkmntxx264 = (xkmNtxX26) arrayList.get(i16);
                    if (((Boolean) arrayList2.get(i16)).booleanValue() && xkmntxx264.qVUwofr5s >= 0) {
                        xkmntxx264.qVUwofr5s = -1;
                    }
                    Objects.requireNonNull(xkmntxx264);
                    i16++;
                }
                return;
            }
        }
    }

    public boolean BL4OzhZBd(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        ArrayList arrayList3 = this.dIocxURUo;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.dIocxURUo.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            int i3 = -1;
            if (str != null || i >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    xkmNtxX26 xkmntxx26 = (xkmNtxX26) this.dIocxURUo.get(size2);
                    if ((str != null && str.equals(xkmntxx26.Puu3Rhg4F)) || (i >= 0 && i == xkmntxx26.qVUwofr5s)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        xkmNtxX26 xkmntxx262 = (xkmNtxX26) this.dIocxURUo.get(size2);
                        if (str == null || !str.equals(xkmntxx262.Puu3Rhg4F)) {
                            if (i < 0 || i != xkmntxx262.qVUwofr5s) {
                                break;
                            }
                        }
                    }
                }
                i3 = size2;
            }
            if (i3 == this.dIocxURUo.size() - 1) {
                return false;
            }
            for (int size3 = this.dIocxURUo.size() - 1; size3 > i3; size3--) {
                arrayList.add(this.dIocxURUo.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public boolean Bhmn1KIah(MenuItem menuItem) {
        if (this.MzoOEjc4X >= 1) {
            for (UxHHqhbTP uxHHqhbTP : this.tGV7Q6urW.WaUP0CF08()) {
                if (uxHHqhbTP != null) {
                    if (!uxHHqhbTP.vNtjxmzUM ? uxHHqhbTP.qFBXIgpia.Bhmn1KIah(menuItem) : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void CBQ5d1kRq(UxHHqhbTP uxHHqhbTP) {
        if (juJ6pnCpu(2)) {
            Dt6xXPjII.q3BipwRCk("detach: ", uxHHqhbTP, "FragmentManager");
        }
        if (!uxHHqhbTP.i0Zug1mVk) {
            uxHHqhbTP.i0Zug1mVk = true;
            if (uxHHqhbTP.ixWaw2akD) {
                if (juJ6pnCpu(2)) {
                    Dt6xXPjII.q3BipwRCk("remove from detach: ", uxHHqhbTP, "FragmentManager");
                }
                this.tGV7Q6urW.vNtjxmzUM(uxHHqhbTP);
                if (j22ftfeNI(uxHHqhbTP)) {
                    this.iMyQMM6Qj = true;
                }
                M66hQ219i(uxHHqhbTP);
            }
        }
    }

    public final void CpG0imbht(boolean z) {
        if (this.J4Ux7ym32) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.ilHKhw3Yw == null) {
            if (this.CpG0imbht) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.ilHKhw3Yw.Bhmn1KIah.getLooper()) {
            if (!z) {
                kCA6Zs9sL();
            }
            if (this.nlGCs0NZs == null) {
                this.nlGCs0NZs = new ArrayList();
                this.AqaWJg0b4 = new ArrayList();
            }
            this.J4Ux7ym32 = true;
            try {
                mUqPm6GBh(null, null);
            } finally {
                this.J4Ux7ym32 = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    public void Dr7UqlxEV(UxHHqhbTP uxHHqhbTP) {
        if (uxHHqhbTP == null || (uxHHqhbTP.equals(NyWTwPF6V(uxHHqhbTP.MzoOEjc4X)) && (uxHHqhbTP.CpG0imbht == null || uxHHqhbTP.IytU16YUK == this))) {
            UxHHqhbTP uxHHqhbTP2 = this.dXrmkklc8;
            this.dXrmkklc8 = uxHHqhbTP;
            ixWaw2akD(uxHHqhbTP2);
            ixWaw2akD(this.dXrmkklc8);
            return;
        }
        throw new IllegalArgumentException("Fragment " + uxHHqhbTP + " is not an active fragment of FragmentManager " + this);
    }

    public void DuuXfa7LE(UxHHqhbTP uxHHqhbTP) {
        if (juJ6pnCpu(2)) {
            Log.v("FragmentManager", "remove: " + uxHHqhbTP + " nesting=" + uxHHqhbTP.cAwN510t2);
        }
        boolean z = !uxHHqhbTP.dfpT1j18n();
        if (!uxHHqhbTP.i0Zug1mVk || z) {
            this.tGV7Q6urW.vNtjxmzUM(uxHHqhbTP);
            if (j22ftfeNI(uxHHqhbTP)) {
                this.iMyQMM6Qj = true;
            }
            uxHHqhbTP.sk5s77z6Q = true;
            M66hQ219i(uxHHqhbTP);
        }
    }

    public uRyiqsiNk EBQXiIPmm() {
        UxHHqhbTP uxHHqhbTP = this.Eeka1udhb;
        return uxHHqhbTP != null ? uxHHqhbTP.IytU16YUK.EBQXiIPmm() : this.ixWaw2akD;
    }

    public void Eeka1udhb(boolean z) {
        for (UxHHqhbTP uxHHqhbTP : this.tGV7Q6urW.WaUP0CF08()) {
            if (uxHHqhbTP != null) {
                uxHHqhbTP.QSbMsHU5X(z);
            }
        }
    }

    public final Set GPLPRo6go() {
        HashSet hashSet = new HashSet();
        Iterator it = ((ArrayList) this.tGV7Q6urW.yWvV4ePLl()).iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((RG2GI7LDp) it.next()).tGV7Q6urW.igRQEZxnW;
            if (viewGroup != null) {
                hashSet.add(J3kbcXHdl.iiGwOFFnr(viewGroup, EBQXiIPmm()));
            }
        }
        return hashSet;
    }

    public final void IG30YE5GU() {
        Iterator it = ((ArrayList) this.tGV7Q6urW.yWvV4ePLl()).iterator();
        while (it.hasNext()) {
            RG2GI7LDp rG2GI7LDp = (RG2GI7LDp) it.next();
            UxHHqhbTP uxHHqhbTP = rG2GI7LDp.tGV7Q6urW;
            if (uxHHqhbTP.TyB1UUd72) {
                if (this.J4Ux7ym32) {
                    this.qFBXIgpia = true;
                } else {
                    uxHHqhbTP.TyB1UUd72 = false;
                    rG2GI7LDp.vPSbyrYWX();
                }
            }
        }
    }

    public void INnK5Rew6() {
        synchronized (this.q3BipwRCk) {
            ArrayList arrayList = this.NyWTwPF6V;
            boolean z = false;
            boolean z2 = arrayList != null && !arrayList.isEmpty();
            if (this.q3BipwRCk.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.ilHKhw3Yw.Bhmn1KIah.removeCallbacks(this.i0Zug1mVk);
                this.ilHKhw3Yw.Bhmn1KIah.post(this.i0Zug1mVk);
                buPcffgdD();
            }
        }
    }

    public void IytU16YUK(p7CzANhGx p7czanhgx, boolean z) {
        if (!z) {
            if (this.ilHKhw3Yw != null) {
                kCA6Zs9sL();
            } else if (this.CpG0imbht) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.q3BipwRCk) {
            if (this.ilHKhw3Yw != null) {
                this.q3BipwRCk.add(p7czanhgx);
                INnK5Rew6();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public void IzM1cD9ly() {
        if (this.ilHKhw3Yw != null) {
            this.cAwN510t2 = false;
            this.IytU16YUK = false;
            this.vNtjxmzUM.GPLPRo6go = false;
            for (UxHHqhbTP uxHHqhbTP : this.tGV7Q6urW.WaUP0CF08()) {
                if (uxHHqhbTP != null) {
                    uxHHqhbTP.qFBXIgpia.IzM1cD9ly();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void J4Ux7ym32(z0NkpHHvU z0nkphhvu, BKr8aejj7 bKr8aejj7, UxHHqhbTP uxHHqhbTP) {
        z0NkpHHvU z0nkphhvu2;
        XDvWW0XDE xDvWW0XDE;
        if (this.ilHKhw3Yw == null) {
            this.ilHKhw3Yw = z0nkphhvu;
            this.qVUwofr5s = bKr8aejj7;
            this.Eeka1udhb = uxHHqhbTP;
            if (uxHHqhbTP != null) {
                this.PSTqBLTET.add(new NYXVxODWB(this, uxHHqhbTP));
            } else if (z0nkphhvu instanceof kID7DUxu0) {
                this.PSTqBLTET.add(z0nkphhvu);
            }
            if (this.Eeka1udhb != null) {
                buPcffgdD();
            }
            if (z0nkphhvu instanceof ueHOpDHaX) {
                OnBackPressedDispatcher Puu3Rhg4F = z0nkphhvu.Puu3Rhg4F();
                this.GPLPRo6go = Puu3Rhg4F;
                Puu3Rhg4F.q3BipwRCk(uxHHqhbTP != null ? uxHHqhbTP : z0nkphhvu, this.Puu3Rhg4F);
            }
            if (uxHHqhbTP != null) {
                xDvWW0XDE = uxHHqhbTP.IytU16YUK.V9LQMKGJe(uxHHqhbTP);
            } else if (z0nkphhvu instanceof LiMUeynem) {
                emw2Oo1fE kCA6Zs9sL = z0nkphhvu.kCA6Zs9sL();
                String canonicalName = XDvWW0XDE.class.getCanonicalName();
                if (canonicalName != null) {
                    String iMyQMM6Qj = anXlDk6fV.iMyQMM6Qj("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
                    Object obj = (TuTk89oZt) kCA6Zs9sL.q3BipwRCk.get(iMyQMM6Qj);
                    if (XDvWW0XDE.class.isInstance(obj)) {
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
                    } else {
                        obj = new XDvWW0XDE(true);
                        TuTk89oZt tuTk89oZt = (TuTk89oZt) kCA6Zs9sL.q3BipwRCk.put(iMyQMM6Qj, obj);
                        if (tuTk89oZt != null) {
                            tuTk89oZt.q3BipwRCk();
                        }
                    }
                    this.vNtjxmzUM = (XDvWW0XDE) obj;
                    this.vNtjxmzUM.GPLPRo6go = zHl31GGXU();
                    this.tGV7Q6urW.PSTqBLTET = this.vNtjxmzUM;
                    z0nkphhvu2 = this.ilHKhw3Yw;
                    if (!(z0nkphhvu2 instanceof TTqseSZOY)) {
                        androidx.activity.result.RG2GI7LDp iiGwOFFnr = z0nkphhvu2.iiGwOFFnr();
                        String q3BipwRCk = UexvVay3o.q3BipwRCk("FragmentManager:", uxHHqhbTP != null ? my9FFKbZi.q3BipwRCk(new StringBuilder(), uxHHqhbTP.MzoOEjc4X, ":") : "");
                        this.sk5s77z6Q = iiGwOFFnr.J4Ux7ym32(UexvVay3o.q3BipwRCk(q3BipwRCk, "StartActivityForResult"), new c9X8wPO8d(), new uRyiqsiNk(this, 4));
                        this.WaUP0CF08 = iiGwOFFnr.J4Ux7ym32(UexvVay3o.q3BipwRCk(q3BipwRCk, "StartIntentSenderForResult"), new lOuj5AbZX(), new uRyiqsiNk(this, 1));
                        this.i8XZMQc6Z = iiGwOFFnr.J4Ux7ym32(UexvVay3o.q3BipwRCk(q3BipwRCk, "RequestPermissions"), new ajXYnNhtv(), new uRyiqsiNk(this, 0));
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            } else {
                xDvWW0XDE = new XDvWW0XDE(false);
            }
            this.vNtjxmzUM = xDvWW0XDE;
            this.vNtjxmzUM.GPLPRo6go = zHl31GGXU();
            this.tGV7Q6urW.PSTqBLTET = this.vNtjxmzUM;
            z0nkphhvu2 = this.ilHKhw3Yw;
            if (!(z0nkphhvu2 instanceof TTqseSZOY)) {
            }
        } else {
            throw new IllegalStateException("Already attached");
        }
    }

    public Parcelable KBYw84i3W() {
        int i;
        kIZDNwKrn[] kizdnwkrnArr;
        ArrayList arrayList;
        int size;
        i0Zug1mVk();
        cAwN510t2();
        qFBXIgpia(true);
        this.cAwN510t2 = true;
        this.vNtjxmzUM.GPLPRo6go = true;
        j6XJY7rz4 j6xjy7rz4 = this.tGV7Q6urW;
        Objects.requireNonNull(j6xjy7rz4);
        ArrayList arrayList2 = new ArrayList(((HashMap) j6xjy7rz4.Bhmn1KIah).size());
        Iterator it = ((HashMap) j6xjy7rz4.Bhmn1KIah).values().iterator();
        while (true) {
            kizdnwkrnArr = null;
            Bundle bundle = null;
            kizdnwkrnArr = null;
            if (!it.hasNext()) {
                break;
            }
            RG2GI7LDp rG2GI7LDp = (RG2GI7LDp) it.next();
            if (rG2GI7LDp != null) {
                UxHHqhbTP uxHHqhbTP = rG2GI7LDp.tGV7Q6urW;
                C2GhuZDgj c2GhuZDgj = new C2GhuZDgj(uxHHqhbTP);
                UxHHqhbTP uxHHqhbTP2 = rG2GI7LDp.tGV7Q6urW;
                if (uxHHqhbTP2.CBQ5d1kRq <= -1 || c2GhuZDgj.WaUP0CF08 != null) {
                    c2GhuZDgj.WaUP0CF08 = uxHHqhbTP2.kmSgne1rO;
                } else {
                    Bundle bundle2 = new Bundle();
                    UxHHqhbTP uxHHqhbTP3 = rG2GI7LDp.tGV7Q6urW;
                    uxHHqhbTP3.o4LF8RkoQ(bundle2);
                    uxHHqhbTP3.OpLJtmvFM.J4Ux7ym32(bundle2);
                    Parcelable KBYw84i3W = uxHHqhbTP3.qFBXIgpia.KBYw84i3W();
                    if (KBYw84i3W != null) {
                        bundle2.putParcelable("android:support:fragments", KBYw84i3W);
                    }
                    rG2GI7LDp.q3BipwRCk.vPSbyrYWX(rG2GI7LDp.tGV7Q6urW, bundle2, false);
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                    if (rG2GI7LDp.tGV7Q6urW.EBQXiIPmm != null) {
                        rG2GI7LDp.PSTqBLTET();
                    }
                    if (rG2GI7LDp.tGV7Q6urW.Bhmn1KIah != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putSparseParcelableArray("android:view_state", rG2GI7LDp.tGV7Q6urW.Bhmn1KIah);
                    }
                    if (rG2GI7LDp.tGV7Q6urW.PSTqBLTET != null) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBundle("android:view_registry_state", rG2GI7LDp.tGV7Q6urW.PSTqBLTET);
                    }
                    if (!rG2GI7LDp.tGV7Q6urW.juJ6pnCpu) {
                        if (bundle == null) {
                            bundle = new Bundle();
                        }
                        bundle.putBoolean("android:user_visible_hint", rG2GI7LDp.tGV7Q6urW.juJ6pnCpu);
                    }
                    c2GhuZDgj.WaUP0CF08 = bundle;
                    if (rG2GI7LDp.tGV7Q6urW.Eeka1udhb != null) {
                        if (bundle == null) {
                            c2GhuZDgj.WaUP0CF08 = new Bundle();
                        }
                        c2GhuZDgj.WaUP0CF08.putString("android:target_state", rG2GI7LDp.tGV7Q6urW.Eeka1udhb);
                        int i2 = rG2GI7LDp.tGV7Q6urW.dXrmkklc8;
                        if (i2 != 0) {
                            c2GhuZDgj.WaUP0CF08.putInt("android:target_req_state", i2);
                        }
                    }
                }
                arrayList2.add(c2GhuZDgj);
                if (juJ6pnCpu(2)) {
                    Log.v("FragmentManager", "Saved state of " + uxHHqhbTP + ": " + c2GhuZDgj.WaUP0CF08);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            j6XJY7rz4 j6xjy7rz42 = this.tGV7Q6urW;
            synchronized (((ArrayList) j6xjy7rz42.kmSgne1rO)) {
                if (((ArrayList) j6xjy7rz42.kmSgne1rO).isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(((ArrayList) j6xjy7rz42.kmSgne1rO).size());
                    Iterator it2 = ((ArrayList) j6xjy7rz42.kmSgne1rO).iterator();
                    while (it2.hasNext()) {
                        UxHHqhbTP uxHHqhbTP4 = (UxHHqhbTP) it2.next();
                        arrayList.add(uxHHqhbTP4.MzoOEjc4X);
                        if (juJ6pnCpu(2)) {
                            Log.v("FragmentManager", "saveAllState: adding fragment (" + uxHHqhbTP4.MzoOEjc4X + "): " + uxHHqhbTP4);
                        }
                    }
                }
            }
            ArrayList arrayList3 = this.dIocxURUo;
            if (arrayList3 != null && (size = arrayList3.size()) > 0) {
                kizdnwkrnArr = new kIZDNwKrn[size];
                for (i = 0; i < size; i++) {
                    kizdnwkrnArr[i] = new kIZDNwKrn((xkmNtxX26) this.dIocxURUo.get(i));
                    if (juJ6pnCpu(2)) {
                        StringBuilder q3BipwRCk = Lf6t4dzRk.q3BipwRCk("saveAllState: adding back stack #", i, ": ");
                        q3BipwRCk.append(this.dIocxURUo.get(i));
                        Log.v("FragmentManager", q3BipwRCk.toString());
                    }
                }
            }
            n3uCpBhbq n3ucpbhbq = new n3uCpBhbq();
            n3ucpbhbq.CBQ5d1kRq = arrayList2;
            n3ucpbhbq.kmSgne1rO = arrayList;
            n3ucpbhbq.Bhmn1KIah = kizdnwkrnArr;
            n3ucpbhbq.PSTqBLTET = this.yWvV4ePLl.get();
            UxHHqhbTP uxHHqhbTP5 = this.dXrmkklc8;
            if (uxHHqhbTP5 != null) {
                n3ucpbhbq.MzoOEjc4X = uxHHqhbTP5.MzoOEjc4X;
            }
            n3ucpbhbq.ilHKhw3Yw.addAll(this.oon79WMrY.keySet());
            n3ucpbhbq.qVUwofr5s.addAll(this.oon79WMrY.values());
            n3ucpbhbq.Eeka1udhb = new ArrayList(this.dfpT1j18n);
            return n3ucpbhbq;
        } else if (!juJ6pnCpu(2)) {
            return null;
        } else {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return null;
        }
    }

    public boolean L4EwGfXiQ(UxHHqhbTP uxHHqhbTP) {
        if (uxHHqhbTP == null) {
            return true;
        }
        fVMSvDhE6 fvmsvdhe6 = uxHHqhbTP.IytU16YUK;
        if (!uxHHqhbTP.equals(fvmsvdhe6.dXrmkklc8) || !L4EwGfXiQ(fvmsvdhe6.Eeka1udhb)) {
            return false;
        }
        return true;
    }

    public final void M66hQ219i(UxHHqhbTP uxHHqhbTP) {
        ViewGroup QNqj6nIzv = QNqj6nIzv(uxHHqhbTP);
        if (QNqj6nIzv != null) {
            if (uxHHqhbTP.Eeka1udhb() + uxHHqhbTP.qVUwofr5s() + uxHHqhbTP.CBQ5d1kRq() + uxHHqhbTP.yWvV4ePLl() > 0) {
                if (QNqj6nIzv.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    QNqj6nIzv.setTag(R.id.visible_removing_fragment_view_tag, uxHHqhbTP);
                }
                ((UxHHqhbTP) QNqj6nIzv.getTag(R.id.visible_removing_fragment_view_tag)).kktL0P5MG(uxHHqhbTP.ilHKhw3Yw());
            }
        }
    }

    public boolean MzoOEjc4X(Menu menu, MenuInflater menuInflater) {
        if (this.MzoOEjc4X < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (UxHHqhbTP uxHHqhbTP : this.tGV7Q6urW.WaUP0CF08()) {
            if (uxHHqhbTP != null && QSbMsHU5X(uxHHqhbTP) && uxHHqhbTP.EBQXiIPmm(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(uxHHqhbTP);
                z = true;
            }
        }
        if (this.kCA6Zs9sL != null) {
            for (int i = 0; i < this.kCA6Zs9sL.size(); i++) {
                UxHHqhbTP uxHHqhbTP2 = (UxHHqhbTP) this.kCA6Zs9sL.get(i);
                if (arrayList == null || !arrayList.contains(uxHHqhbTP2)) {
                    Objects.requireNonNull(uxHHqhbTP2);
                }
            }
        }
        this.kCA6Zs9sL = arrayList;
        return z;
    }

    public UxHHqhbTP NyWTwPF6V(String str) {
        return this.tGV7Q6urW.GPLPRo6go(str);
    }

    public final boolean OpLJtmvFM(String str, int i, int i2) {
        qFBXIgpia(false);
        CpG0imbht(true);
        UxHHqhbTP uxHHqhbTP = this.dXrmkklc8;
        if (uxHHqhbTP != null && i < 0 && uxHHqhbTP.iiGwOFFnr().n4UIOvAko()) {
            return true;
        }
        boolean BL4OzhZBd = BL4OzhZBd(this.nlGCs0NZs, this.AqaWJg0b4, null, i, i2);
        if (BL4OzhZBd) {
            this.J4Ux7ym32 = true;
            try {
                XYT7vJqNO(this.nlGCs0NZs, this.AqaWJg0b4);
            } finally {
                iiGwOFFnr();
            }
        }
        buPcffgdD();
        dfpT1j18n();
        this.tGV7Q6urW.tGV7Q6urW();
        return BL4OzhZBd;
    }

    public void PSTqBLTET() {
        this.cAwN510t2 = false;
        this.IytU16YUK = false;
        this.vNtjxmzUM.GPLPRo6go = false;
        i8XZMQc6Z(1);
    }

    public final Set Puu3Rhg4F(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((xkmNtxX26) arrayList.get(i)).q3BipwRCk.iterator();
            while (it.hasNext()) {
                UxHHqhbTP uxHHqhbTP = ((ah1jjZN55) it.next()).J4Ux7ym32;
                if (!(uxHHqhbTP == null || (viewGroup = uxHHqhbTP.igRQEZxnW) == null)) {
                    hashSet.add(J3kbcXHdl.iiGwOFFnr(viewGroup, EBQXiIPmm()));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final ViewGroup QNqj6nIzv(UxHHqhbTP uxHHqhbTP) {
        ViewGroup viewGroup = uxHHqhbTP.igRQEZxnW;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (uxHHqhbTP.mUqPm6GBh > 0 && this.qVUwofr5s.dIocxURUo()) {
            View tGV7Q6urW = this.qVUwofr5s.tGV7Q6urW(uxHHqhbTP.mUqPm6GBh);
            if (tGV7Q6urW instanceof ViewGroup) {
                return (ViewGroup) tGV7Q6urW;
            }
        }
        return null;
    }

    public boolean QSbMsHU5X(UxHHqhbTP uxHHqhbTP) {
        if (uxHHqhbTP == null) {
            return true;
        }
        return uxHHqhbTP.iMyQMM6Qj();
    }

    public void R2hkbNqWf(UxHHqhbTP uxHHqhbTP) {
        if (juJ6pnCpu(2)) {
            Dt6xXPjII.q3BipwRCk("show: ", uxHHqhbTP, "FragmentManager");
        }
        if (uxHHqhbTP.vNtjxmzUM) {
            uxHHqhbTP.vNtjxmzUM = false;
            uxHHqhbTP.QSbMsHU5X = !uxHHqhbTP.QSbMsHU5X;
        }
    }

    public void RG6kpfv3v(Menu menu) {
        if (this.MzoOEjc4X >= 1) {
            for (UxHHqhbTP uxHHqhbTP : this.tGV7Q6urW.WaUP0CF08()) {
                if (uxHHqhbTP != null && !uxHHqhbTP.vNtjxmzUM) {
                    uxHHqhbTP.qFBXIgpia.RG6kpfv3v(menu);
                }
            }
        }
    }

    public void SuKhTJIQc(UxHHqhbTP uxHHqhbTP, boolean z) {
        ViewGroup QNqj6nIzv = QNqj6nIzv(uxHHqhbTP);
        if (QNqj6nIzv != null && (QNqj6nIzv instanceof GUiwkn9Tb)) {
            ((GUiwkn9Tb) QNqj6nIzv).setDrawDisappearingViewsLast(!z);
        }
    }

    public void TyB1UUd72(UxHHqhbTP uxHHqhbTP) {
        if (juJ6pnCpu(2)) {
            Dt6xXPjII.q3BipwRCk("hide: ", uxHHqhbTP, "FragmentManager");
        }
        if (!uxHHqhbTP.vNtjxmzUM) {
            uxHHqhbTP.vNtjxmzUM = true;
            uxHHqhbTP.QSbMsHU5X = true ^ uxHHqhbTP.QSbMsHU5X;
            M66hQ219i(uxHHqhbTP);
        }
    }

    public final XDvWW0XDE V9LQMKGJe(UxHHqhbTP uxHHqhbTP) {
        XDvWW0XDE xDvWW0XDE = this.vNtjxmzUM;
        XDvWW0XDE xDvWW0XDE2 = (XDvWW0XDE) xDvWW0XDE.tGV7Q6urW.get(uxHHqhbTP.MzoOEjc4X);
        if (xDvWW0XDE2 != null) {
            return xDvWW0XDE2;
        }
        XDvWW0XDE xDvWW0XDE3 = new XDvWW0XDE(xDvWW0XDE.kCA6Zs9sL);
        xDvWW0XDE.tGV7Q6urW.put(uxHHqhbTP.MzoOEjc4X, xDvWW0XDE3);
        return xDvWW0XDE3;
    }

    public boolean WaUP0CF08(Menu menu) {
        boolean z = false;
        if (this.MzoOEjc4X >= 1) {
            for (UxHHqhbTP uxHHqhbTP : this.tGV7Q6urW.WaUP0CF08()) {
                if (uxHHqhbTP != null && QSbMsHU5X(uxHHqhbTP) && uxHHqhbTP.zHl31GGXU(menu)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final void XYT7vJqNO(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                mUqPm6GBh(arrayList, arrayList2);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!((xkmNtxX26) arrayList.get(i)).PSTqBLTET) {
                        if (i2 != i) {
                            AqaWJg0b4(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (((Boolean) arrayList2.get(i)).booleanValue()) {
                            while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((xkmNtxX26) arrayList.get(i2)).PSTqBLTET) {
                                i2++;
                            }
                        }
                        AqaWJg0b4(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    AqaWJg0b4(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public final void buPcffgdD() {
        synchronized (this.q3BipwRCk) {
            boolean z = true;
            if (!this.q3BipwRCk.isEmpty()) {
                this.Puu3Rhg4F.q3BipwRCk = true;
                return;
            }
            TET2Qfhx1 tET2Qfhx1 = this.Puu3Rhg4F;
            ArrayList arrayList = this.dIocxURUo;
            if ((arrayList != null ? arrayList.size() : 0) <= 0 || !L4EwGfXiQ(this.Eeka1udhb)) {
                z = false;
            }
            tET2Qfhx1.q3BipwRCk = z;
        }
    }

    public final void cAwN510t2() {
        Iterator it = ((HashSet) GPLPRo6go()).iterator();
        while (it.hasNext()) {
            ((J3kbcXHdl) it.next()).kCA6Zs9sL();
        }
    }

    public final void dIocxURUo(UxHHqhbTP uxHHqhbTP) {
        HashSet hashSet = (HashSet) this.CBQ5d1kRq.get(uxHHqhbTP);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((ce8tBZHr1) it.next()).q3BipwRCk();
            }
            hashSet.clear();
            vPSbyrYWX(uxHHqhbTP);
            this.CBQ5d1kRq.remove(uxHHqhbTP);
        }
    }

    public boolean dXrmkklc8(MenuItem menuItem) {
        if (this.MzoOEjc4X >= 1) {
            for (UxHHqhbTP uxHHqhbTP : this.tGV7Q6urW.WaUP0CF08()) {
                if (uxHHqhbTP != null) {
                    if (!uxHHqhbTP.vNtjxmzUM ? uxHHqhbTP.qFBXIgpia.dXrmkklc8(menuItem) : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void dfpT1j18n() {
        if (this.qFBXIgpia) {
            this.qFBXIgpia = false;
            IG30YE5GU();
        }
    }

    public final void i0Zug1mVk() {
        Iterator it = ((HashSet) GPLPRo6go()).iterator();
        while (it.hasNext()) {
            J3kbcXHdl j3kbcXHdl = (J3kbcXHdl) it.next();
            if (j3kbcXHdl.kCA6Zs9sL) {
                j3kbcXHdl.kCA6Zs9sL = false;
                j3kbcXHdl.tGV7Q6urW();
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void i8XZMQc6Z(int i) {
        try {
            this.J4Ux7ym32 = true;
            for (RG2GI7LDp rG2GI7LDp : ((HashMap) this.tGV7Q6urW.Bhmn1KIah).values()) {
                if (rG2GI7LDp != null) {
                    rG2GI7LDp.kCA6Zs9sL = i;
                }
            }
            ziwPzaoF3(i, false);
            Iterator it = ((HashSet) GPLPRo6go()).iterator();
            while (it.hasNext()) {
                ((J3kbcXHdl) it.next()).kCA6Zs9sL();
            }
            this.J4Ux7ym32 = false;
            qFBXIgpia(true);
        } catch (Throwable th) {
            this.J4Ux7ym32 = false;
            throw th;
        }
    }

    public void iMyQMM6Qj(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String q3BipwRCk = UexvVay3o.q3BipwRCk(str, "    ");
        this.tGV7Q6urW.iiGwOFFnr(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.kCA6Zs9sL;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(((UxHHqhbTP) this.kCA6Zs9sL.get(i)).toString());
            }
        }
        ArrayList arrayList2 = this.dIocxURUo;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i2 = 0; i2 < size; i2++) {
                xkmNtxX26 xkmntxx26 = (xkmNtxX26) this.dIocxURUo.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(xkmntxx26.toString());
                xkmntxx26.iiGwOFFnr(q3BipwRCk, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.yWvV4ePLl.get());
        synchronized (this.q3BipwRCk) {
            int size3 = this.q3BipwRCk.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i3 = 0; i3 < size3; i3++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println((p7CzANhGx) this.q3BipwRCk.get(i3));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.ilHKhw3Yw);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.qVUwofr5s);
        if (this.Eeka1udhb != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.Eeka1udhb);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.MzoOEjc4X);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.cAwN510t2);
        printWriter.print(" mStopped=");
        printWriter.print(this.IytU16YUK);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.CpG0imbht);
        if (this.iMyQMM6Qj) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.iMyQMM6Qj);
        }
    }

    public qKDOZuDet igRQEZxnW() {
        UxHHqhbTP uxHHqhbTP = this.Eeka1udhb;
        return uxHHqhbTP != null ? uxHHqhbTP.IytU16YUK.igRQEZxnW() : this.RG6kpfv3v;
    }

    public final void iiGwOFFnr() {
        this.J4Ux7ym32 = false;
        this.AqaWJg0b4.clear();
        this.nlGCs0NZs.clear();
    }

    public void ilHKhw3Yw() {
        this.CpG0imbht = true;
        qFBXIgpia(true);
        cAwN510t2();
        i8XZMQc6Z(-1);
        this.ilHKhw3Yw = null;
        this.qVUwofr5s = null;
        this.Eeka1udhb = null;
        if (this.GPLPRo6go != null) {
            Iterator it = this.Puu3Rhg4F.J4Ux7ym32.iterator();
            while (it.hasNext()) {
                ((bvrtgBCLi) it.next()).cancel();
            }
            this.GPLPRo6go = null;
        }
        UBpyZCltz uBpyZCltz = this.sk5s77z6Q;
        if (uBpyZCltz != null) {
            uBpyZCltz.q3BipwRCk();
            this.WaUP0CF08.q3BipwRCk();
            this.i8XZMQc6Z.q3BipwRCk();
        }
    }

    public final void ixWaw2akD(UxHHqhbTP uxHHqhbTP) {
        if (uxHHqhbTP != null && uxHHqhbTP.equals(NyWTwPF6V(uxHHqhbTP.MzoOEjc4X))) {
            boolean L4EwGfXiQ = uxHHqhbTP.IytU16YUK.L4EwGfXiQ(uxHHqhbTP);
            Boolean bool = uxHHqhbTP.RG6kpfv3v;
            if (bool == null || bool.booleanValue() != L4EwGfXiQ) {
                uxHHqhbTP.RG6kpfv3v = Boolean.valueOf(L4EwGfXiQ);
                fVMSvDhE6 fvmsvdhe6 = uxHHqhbTP.qFBXIgpia;
                fvmsvdhe6.buPcffgdD();
                fvmsvdhe6.ixWaw2akD(fvmsvdhe6.dXrmkklc8);
            }
        }
    }

    public final boolean j22ftfeNI(UxHHqhbTP uxHHqhbTP) {
        fVMSvDhE6 fvmsvdhe6 = uxHHqhbTP.qFBXIgpia;
        Iterator it = ((ArrayList) fvmsvdhe6.tGV7Q6urW.oon79WMrY()).iterator();
        boolean z = false;
        while (it.hasNext()) {
            UxHHqhbTP uxHHqhbTP2 = (UxHHqhbTP) it.next();
            if (uxHHqhbTP2 != null) {
                z = fvmsvdhe6.j22ftfeNI(uxHHqhbTP2);
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final void kCA6Zs9sL() {
        if (zHl31GGXU()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public void kktL0P5MG(Parcelable parcelable) {
        RG2GI7LDp rG2GI7LDp;
        if (parcelable != null) {
            n3uCpBhbq n3ucpbhbq = (n3uCpBhbq) parcelable;
            if (n3ucpbhbq.CBQ5d1kRq != null) {
                ((HashMap) this.tGV7Q6urW.Bhmn1KIah).clear();
                Iterator it = n3ucpbhbq.CBQ5d1kRq.iterator();
                while (it.hasNext()) {
                    C2GhuZDgj c2GhuZDgj = (C2GhuZDgj) it.next();
                    if (c2GhuZDgj != null) {
                        UxHHqhbTP uxHHqhbTP = (UxHHqhbTP) this.vNtjxmzUM.J4Ux7ym32.get(c2GhuZDgj.kmSgne1rO);
                        if (uxHHqhbTP != null) {
                            if (juJ6pnCpu(2)) {
                                Dt6xXPjII.q3BipwRCk("restoreSaveState: re-attaching retained ", uxHHqhbTP, "FragmentManager");
                            }
                            rG2GI7LDp = new RG2GI7LDp(this.Bhmn1KIah, this.tGV7Q6urW, uxHHqhbTP, c2GhuZDgj);
                        } else {
                            rG2GI7LDp = new RG2GI7LDp(this.Bhmn1KIah, this.tGV7Q6urW, this.ilHKhw3Yw.kmSgne1rO.getClassLoader(), igRQEZxnW(), c2GhuZDgj);
                        }
                        UxHHqhbTP uxHHqhbTP2 = rG2GI7LDp.tGV7Q6urW;
                        uxHHqhbTP2.IytU16YUK = this;
                        if (juJ6pnCpu(2)) {
                            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("restoreSaveState: active (");
                            q3BipwRCk.append(uxHHqhbTP2.MzoOEjc4X);
                            q3BipwRCk.append("): ");
                            q3BipwRCk.append(uxHHqhbTP2);
                            Log.v("FragmentManager", q3BipwRCk.toString());
                        }
                        rG2GI7LDp.kmSgne1rO(this.ilHKhw3Yw.kmSgne1rO.getClassLoader());
                        this.tGV7Q6urW.qFBXIgpia(rG2GI7LDp);
                        rG2GI7LDp.kCA6Zs9sL = this.MzoOEjc4X;
                    }
                }
                XDvWW0XDE xDvWW0XDE = this.vNtjxmzUM;
                Objects.requireNonNull(xDvWW0XDE);
                Iterator it2 = new ArrayList(xDvWW0XDE.J4Ux7ym32.values()).iterator();
                while (it2.hasNext()) {
                    UxHHqhbTP uxHHqhbTP3 = (UxHHqhbTP) it2.next();
                    if (!this.tGV7Q6urW.dIocxURUo(uxHHqhbTP3.MzoOEjc4X)) {
                        if (juJ6pnCpu(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + uxHHqhbTP3 + " that was not found in the set of active Fragments " + n3ucpbhbq.CBQ5d1kRq);
                        }
                        this.vNtjxmzUM.J4Ux7ym32(uxHHqhbTP3);
                        uxHHqhbTP3.IytU16YUK = this;
                        RG2GI7LDp rG2GI7LDp2 = new RG2GI7LDp(this.Bhmn1KIah, this.tGV7Q6urW, uxHHqhbTP3);
                        rG2GI7LDp2.kCA6Zs9sL = 1;
                        rG2GI7LDp2.vPSbyrYWX();
                        uxHHqhbTP3.sk5s77z6Q = true;
                        rG2GI7LDp2.vPSbyrYWX();
                    }
                }
                j6XJY7rz4 j6xjy7rz4 = this.tGV7Q6urW;
                ArrayList<String> arrayList = n3ucpbhbq.kmSgne1rO;
                ((ArrayList) j6xjy7rz4.kmSgne1rO).clear();
                if (arrayList != null) {
                    for (String str : arrayList) {
                        UxHHqhbTP GPLPRo6go = j6xjy7rz4.GPLPRo6go(str);
                        if (GPLPRo6go != null) {
                            if (juJ6pnCpu(2)) {
                                Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + GPLPRo6go);
                            }
                            j6xjy7rz4.q3BipwRCk(GPLPRo6go);
                        } else {
                            throw new IllegalStateException(M5g57XBLr.q3BipwRCk("No instantiated fragment for (", str, ")"));
                        }
                    }
                }
                if (n3ucpbhbq.Bhmn1KIah != null) {
                    this.dIocxURUo = new ArrayList(n3ucpbhbq.Bhmn1KIah.length);
                    int i = 0;
                    while (true) {
                        kIZDNwKrn[] kizdnwkrnArr = n3ucpbhbq.Bhmn1KIah;
                        if (i >= kizdnwkrnArr.length) {
                            break;
                        }
                        kIZDNwKrn kizdnwkrn = kizdnwkrnArr[i];
                        Objects.requireNonNull(kizdnwkrn);
                        xkmNtxX26 xkmntxx26 = new xkmNtxX26(this);
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            int[] iArr = kizdnwkrn.CBQ5d1kRq;
                            if (i2 >= iArr.length) {
                                break;
                            }
                            ah1jjZN55 ah1jjzn55 = new ah1jjZN55();
                            int i4 = i2 + 1;
                            ah1jjzn55.q3BipwRCk = iArr[i2];
                            if (juJ6pnCpu(2)) {
                                Log.v("FragmentManager", "Instantiate " + xkmntxx26 + " op #" + i3 + " base fragment #" + kizdnwkrn.CBQ5d1kRq[i4]);
                            }
                            String str2 = (String) kizdnwkrn.kmSgne1rO.get(i3);
                            ah1jjzn55.J4Ux7ym32 = str2 != null ? this.tGV7Q6urW.GPLPRo6go(str2) : null;
                            ah1jjzn55.GPLPRo6go = mhl5lIdbQ.EnumC0005mhl5lIdbQ.values()[kizdnwkrn.Bhmn1KIah[i3]];
                            ah1jjzn55.Puu3Rhg4F = mhl5lIdbQ.EnumC0005mhl5lIdbQ.values()[kizdnwkrn.PSTqBLTET[i3]];
                            int[] iArr2 = kizdnwkrn.CBQ5d1kRq;
                            int i5 = i4 + 1;
                            int i6 = iArr2[i4];
                            ah1jjzn55.tGV7Q6urW = i6;
                            int i7 = i5 + 1;
                            int i8 = iArr2[i5];
                            ah1jjzn55.dIocxURUo = i8;
                            int i9 = i7 + 1;
                            int i10 = iArr2[i7];
                            ah1jjzn55.kCA6Zs9sL = i10;
                            i2 = i9 + 1;
                            int i11 = iArr2[i9];
                            ah1jjzn55.iiGwOFFnr = i11;
                            xkmntxx26.J4Ux7ym32 = i6;
                            xkmntxx26.tGV7Q6urW = i8;
                            xkmntxx26.dIocxURUo = i10;
                            xkmntxx26.kCA6Zs9sL = i11;
                            xkmntxx26.J4Ux7ym32(ah1jjzn55);
                            i3++;
                        }
                        xkmntxx26.iiGwOFFnr = kizdnwkrn.MzoOEjc4X;
                        xkmntxx26.Puu3Rhg4F = kizdnwkrn.ilHKhw3Yw;
                        xkmntxx26.qVUwofr5s = kizdnwkrn.qVUwofr5s;
                        xkmntxx26.GPLPRo6go = true;
                        xkmntxx26.yWvV4ePLl = kizdnwkrn.Eeka1udhb;
                        xkmntxx26.oon79WMrY = kizdnwkrn.dXrmkklc8;
                        xkmntxx26.vPSbyrYWX = kizdnwkrn.RG6kpfv3v;
                        xkmntxx26.CBQ5d1kRq = kizdnwkrn.ixWaw2akD;
                        xkmntxx26.kmSgne1rO = kizdnwkrn.sk5s77z6Q;
                        xkmntxx26.Bhmn1KIah = kizdnwkrn.WaUP0CF08;
                        xkmntxx26.PSTqBLTET = kizdnwkrn.i8XZMQc6Z;
                        xkmntxx26.tGV7Q6urW(1);
                        if (juJ6pnCpu(2)) {
                            StringBuilder q3BipwRCk2 = Lf6t4dzRk.q3BipwRCk("restoreAllState: back stack #", i, " (index ");
                            q3BipwRCk2.append(xkmntxx26.qVUwofr5s);
                            q3BipwRCk2.append("): ");
                            q3BipwRCk2.append(xkmntxx26);
                            Log.v("FragmentManager", q3BipwRCk2.toString());
                            PrintWriter printWriter = new PrintWriter(new HNCBnvwXJ("FragmentManager"));
                            xkmntxx26.iiGwOFFnr("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.dIocxURUo.add(xkmntxx26);
                        i++;
                    }
                } else {
                    this.dIocxURUo = null;
                }
                this.yWvV4ePLl.set(n3ucpbhbq.PSTqBLTET);
                String str3 = n3ucpbhbq.MzoOEjc4X;
                if (str3 != null) {
                    UxHHqhbTP NyWTwPF6V = NyWTwPF6V(str3);
                    this.dXrmkklc8 = NyWTwPF6V;
                    ixWaw2akD(NyWTwPF6V);
                }
                ArrayList arrayList2 = n3ucpbhbq.ilHKhw3Yw;
                if (arrayList2 != null) {
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        Bundle bundle = (Bundle) n3ucpbhbq.qVUwofr5s.get(i12);
                        bundle.setClassLoader(this.ilHKhw3Yw.kmSgne1rO.getClassLoader());
                        this.oon79WMrY.put(arrayList2.get(i12), bundle);
                    }
                }
                this.dfpT1j18n = new ArrayDeque(n3ucpbhbq.Eeka1udhb);
            }
        }
    }

    public void kmSgne1rO(Configuration configuration) {
        for (UxHHqhbTP uxHHqhbTP : this.tGV7Q6urW.WaUP0CF08()) {
            if (uxHHqhbTP != null) {
                uxHHqhbTP.onConfigurationChanged(configuration);
                uxHHqhbTP.qFBXIgpia.kmSgne1rO(configuration);
            }
        }
    }

    public void ln3nf7LH3(UxHHqhbTP uxHHqhbTP, mhl5lIdbQ.EnumC0005mhl5lIdbQ mhl5lidbq) {
        if (!uxHHqhbTP.equals(NyWTwPF6V(uxHHqhbTP.MzoOEjc4X)) || !(uxHHqhbTP.CpG0imbht == null || uxHHqhbTP.IytU16YUK == this)) {
            throw new IllegalArgumentException("Fragment " + uxHHqhbTP + " is not an active fragment of FragmentManager " + this);
        }
        uxHHqhbTP.ziwPzaoF3 = mhl5lidbq;
    }

    public final void mUqPm6GBh(ArrayList arrayList, ArrayList arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList arrayList3 = this.NyWTwPF6V;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            ZB2fSf4bm zB2fSf4bm = (ZB2fSf4bm) this.NyWTwPF6V.get(i);
            if (arrayList == null || zB2fSf4bm.q3BipwRCk || (indexOf2 = arrayList.indexOf(zB2fSf4bm.J4Ux7ym32)) == -1 || arrayList2 == null || !((Boolean) arrayList2.get(indexOf2)).booleanValue()) {
                if ((zB2fSf4bm.tGV7Q6urW == 0) || (arrayList != null && zB2fSf4bm.J4Ux7ym32.oon79WMrY(arrayList, 0, arrayList.size()))) {
                    this.NyWTwPF6V.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || zB2fSf4bm.q3BipwRCk || (indexOf = arrayList.indexOf(zB2fSf4bm.J4Ux7ym32)) == -1 || arrayList2 == null || !((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                        zB2fSf4bm.q3BipwRCk();
                    }
                }
                i++;
            } else {
                this.NyWTwPF6V.remove(i);
                i--;
                size--;
            }
            xkmNtxX26 xkmntxx26 = zB2fSf4bm.J4Ux7ym32;
            xkmntxx26.MzoOEjc4X.yWvV4ePLl(xkmntxx26, zB2fSf4bm.q3BipwRCk, false, false);
            i++;
        }
    }

    public boolean n4UIOvAko() {
        return OpLJtmvFM(null, -1, 0);
    }

    /* JADX WARN: Finally extract failed */
    public void nlGCs0NZs(p7CzANhGx p7czanhgx, boolean z) {
        if (!z || (this.ilHKhw3Yw != null && !this.CpG0imbht)) {
            CpG0imbht(z);
            ((xkmNtxX26) p7czanhgx).q3BipwRCk(this.nlGCs0NZs, this.AqaWJg0b4);
            this.J4Ux7ym32 = true;
            try {
                XYT7vJqNO(this.nlGCs0NZs, this.AqaWJg0b4);
                iiGwOFFnr();
                buPcffgdD();
                dfpT1j18n();
                this.tGV7Q6urW.tGV7Q6urW();
            } catch (Throwable th) {
                iiGwOFFnr();
                throw th;
            }
        }
    }

    public final boolean o4LF8RkoQ(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.q3BipwRCk) {
            if (this.q3BipwRCk.isEmpty()) {
                return false;
            }
            int size = this.q3BipwRCk.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                z |= ((p7CzANhGx) this.q3BipwRCk.get(i)).q3BipwRCk(arrayList, arrayList2);
            }
            this.q3BipwRCk.clear();
            this.ilHKhw3Yw.Bhmn1KIah.removeCallbacks(this.i0Zug1mVk);
            return z;
        }
    }

    public RG2GI7LDp oon79WMrY(UxHHqhbTP uxHHqhbTP) {
        RG2GI7LDp sk5s77z6Q = this.tGV7Q6urW.sk5s77z6Q(uxHHqhbTP.MzoOEjc4X);
        if (sk5s77z6Q != null) {
            return sk5s77z6Q;
        }
        RG2GI7LDp rG2GI7LDp = new RG2GI7LDp(this.Bhmn1KIah, this.tGV7Q6urW, uxHHqhbTP);
        rG2GI7LDp.kmSgne1rO(this.ilHKhw3Yw.kmSgne1rO.getClassLoader());
        rG2GI7LDp.kCA6Zs9sL = this.MzoOEjc4X;
        return rG2GI7LDp;
    }

    public RG2GI7LDp q3BipwRCk(UxHHqhbTP uxHHqhbTP) {
        if (juJ6pnCpu(2)) {
            Dt6xXPjII.q3BipwRCk("add: ", uxHHqhbTP, "FragmentManager");
        }
        RG2GI7LDp oon79WMrY = oon79WMrY(uxHHqhbTP);
        uxHHqhbTP.IytU16YUK = this;
        this.tGV7Q6urW.qFBXIgpia(oon79WMrY);
        if (!uxHHqhbTP.i0Zug1mVk) {
            this.tGV7Q6urW.q3BipwRCk(uxHHqhbTP);
            uxHHqhbTP.sk5s77z6Q = false;
            if (uxHHqhbTP.EBQXiIPmm == null) {
                uxHHqhbTP.QSbMsHU5X = false;
            }
            if (j22ftfeNI(uxHHqhbTP)) {
                this.iMyQMM6Qj = true;
            }
        }
        return oon79WMrY;
    }

    /* JADX WARN: Finally extract failed */
    public boolean qFBXIgpia(boolean z) {
        CpG0imbht(z);
        boolean z2 = false;
        while (o4LF8RkoQ(this.nlGCs0NZs, this.AqaWJg0b4)) {
            this.J4Ux7ym32 = true;
            try {
                XYT7vJqNO(this.nlGCs0NZs, this.AqaWJg0b4);
                iiGwOFFnr();
                z2 = true;
            } catch (Throwable th) {
                iiGwOFFnr();
                throw th;
            }
        }
        buPcffgdD();
        dfpT1j18n();
        this.tGV7Q6urW.tGV7Q6urW();
        return z2;
    }

    public void qVUwofr5s() {
        for (UxHHqhbTP uxHHqhbTP : this.tGV7Q6urW.WaUP0CF08()) {
            if (uxHHqhbTP != null) {
                uxHHqhbTP.j22ftfeNI();
            }
        }
    }

    public void sk5s77z6Q(boolean z) {
        for (UxHHqhbTP uxHHqhbTP : this.tGV7Q6urW.WaUP0CF08()) {
            if (uxHHqhbTP != null) {
                uxHHqhbTP.L4EwGfXiQ(z);
            }
        }
    }

    public void tGV7Q6urW(UxHHqhbTP uxHHqhbTP) {
        if (juJ6pnCpu(2)) {
            Dt6xXPjII.q3BipwRCk("attach: ", uxHHqhbTP, "FragmentManager");
        }
        if (uxHHqhbTP.i0Zug1mVk) {
            uxHHqhbTP.i0Zug1mVk = false;
            if (!uxHHqhbTP.ixWaw2akD) {
                this.tGV7Q6urW.q3BipwRCk(uxHHqhbTP);
                if (juJ6pnCpu(2)) {
                    Dt6xXPjII.q3BipwRCk("add from attach: ", uxHHqhbTP, "FragmentManager");
                }
                if (j22ftfeNI(uxHHqhbTP)) {
                    this.iMyQMM6Qj = true;
                }
            }
        }
    }

    public String toString() {
        String str;
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        UxHHqhbTP uxHHqhbTP = this.Eeka1udhb;
        if (uxHHqhbTP != null) {
            sb.append(uxHHqhbTP.getClass().getSimpleName());
            sb.append("{");
            obj = this.Eeka1udhb;
        } else if (this.ilHKhw3Yw != null) {
            sb.append(z0NkpHHvU.class.getSimpleName());
            sb.append("{");
            obj = this.ilHKhw3Yw;
        } else {
            str = "null";
            sb.append(str);
            sb.append("}}");
            return sb.toString();
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        str = "}";
        sb.append(str);
        sb.append("}}");
        return sb.toString();
    }

    public UxHHqhbTP vNtjxmzUM(int i) {
        j6XJY7rz4 j6xjy7rz4 = this.tGV7Q6urW;
        int size = ((ArrayList) j6xjy7rz4.kmSgne1rO).size();
        while (true) {
            size--;
            if (size >= 0) {
                UxHHqhbTP uxHHqhbTP = (UxHHqhbTP) ((ArrayList) j6xjy7rz4.kmSgne1rO).get(size);
                if (uxHHqhbTP != null && uxHHqhbTP.AqaWJg0b4 == i) {
                    return uxHHqhbTP;
                }
            } else {
                for (RG2GI7LDp rG2GI7LDp : ((HashMap) j6xjy7rz4.Bhmn1KIah).values()) {
                    if (rG2GI7LDp != null) {
                        UxHHqhbTP uxHHqhbTP2 = rG2GI7LDp.tGV7Q6urW;
                        if (uxHHqhbTP2.AqaWJg0b4 == i) {
                            return uxHHqhbTP2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final void vPSbyrYWX(UxHHqhbTP uxHHqhbTP) {
        uxHHqhbTP.juJ6pnCpu();
        this.Bhmn1KIah.PSTqBLTET(uxHHqhbTP, false);
        uxHHqhbTP.igRQEZxnW = null;
        uxHHqhbTP.EBQXiIPmm = null;
        uxHHqhbTP.IzM1cD9ly = null;
        uxHHqhbTP.n4UIOvAko.iiGwOFFnr(null);
        uxHHqhbTP.i8XZMQc6Z = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r1 != 5) goto L_0x01ba;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void wIZEdYHUn(UxHHqhbTP uxHHqhbTP, int i) {
        int i2;
        ViewGroup viewGroup;
        RG2GI7LDp sk5s77z6Q = this.tGV7Q6urW.sk5s77z6Q(uxHHqhbTP.MzoOEjc4X);
        if (sk5s77z6Q == null) {
            sk5s77z6Q = new RG2GI7LDp(this.Bhmn1KIah, this.tGV7Q6urW, uxHHqhbTP);
            sk5s77z6Q.kCA6Zs9sL = 1;
        }
        int min = Math.min((!uxHHqhbTP.WaUP0CF08 || !uxHHqhbTP.i8XZMQc6Z || uxHHqhbTP.CBQ5d1kRq != 2) ? i : Math.max(i, 2), sk5s77z6Q.dIocxURUo());
        int i3 = uxHHqhbTP.CBQ5d1kRq;
        if (i3 <= min) {
            if (i3 < min && !this.CBQ5d1kRq.isEmpty()) {
                dIocxURUo(uxHHqhbTP);
            }
            int i4 = uxHHqhbTP.CBQ5d1kRq;
            if (i4 != -1) {
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 4) {
                            }
                            if (min > 4) {
                                sk5s77z6Q.MzoOEjc4X();
                            }
                            if (min > 5) {
                                sk5s77z6Q.Bhmn1KIah();
                            }
                        }
                        if (min > 2) {
                            sk5s77z6Q.q3BipwRCk();
                        }
                        if (min > 4) {
                        }
                        if (min > 5) {
                        }
                    }
                    if (min > -1) {
                        sk5s77z6Q.oon79WMrY();
                    }
                    if (min > 1) {
                        sk5s77z6Q.iiGwOFFnr();
                    }
                    if (min > 2) {
                    }
                    if (min > 4) {
                    }
                    if (min > 5) {
                    }
                }
            } else if (min > -1) {
                sk5s77z6Q.tGV7Q6urW();
            }
            if (min > 0) {
                sk5s77z6Q.kCA6Zs9sL();
            }
            if (min > -1) {
            }
            if (min > 1) {
            }
            if (min > 2) {
            }
            if (min > 4) {
            }
            if (min > 5) {
            }
        } else if (i3 > min) {
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 4) {
                            if (i3 != 5) {
                                if (i3 == 7) {
                                    if (min < 7) {
                                        sk5s77z6Q.CBQ5d1kRq();
                                    }
                                }
                            }
                            if (min < 5) {
                                sk5s77z6Q.ilHKhw3Yw();
                            }
                        }
                        if (min < 4) {
                            if (juJ6pnCpu(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + uxHHqhbTP);
                            }
                            if (uxHHqhbTP.EBQXiIPmm != null && (!this.ilHKhw3Yw.MzoOEjc4X.isFinishing()) && uxHHqhbTP.Bhmn1KIah == null) {
                                sk5s77z6Q.PSTqBLTET();
                            }
                        }
                    }
                    if (min < 2) {
                        LmlART9vy lmlART9vy = null;
                        View view = uxHHqhbTP.EBQXiIPmm;
                        if (!(view == null || (viewGroup = uxHHqhbTP.igRQEZxnW) == null)) {
                            viewGroup.endViewTransition(view);
                            uxHHqhbTP.EBQXiIPmm.clearAnimation();
                            if (!uxHHqhbTP.IytU16YUK()) {
                                if (this.MzoOEjc4X > -1 && !this.CpG0imbht && uxHHqhbTP.EBQXiIPmm.getVisibility() == 0 && uxHHqhbTP.L4EwGfXiQ >= 0.0f) {
                                    lmlART9vy = GlIdhFNeJ.q3BipwRCk(this.ilHKhw3Yw.kmSgne1rO, uxHHqhbTP, false, uxHHqhbTP.ilHKhw3Yw());
                                }
                                uxHHqhbTP.L4EwGfXiQ = 0.0f;
                                ViewGroup viewGroup2 = uxHHqhbTP.igRQEZxnW;
                                View view2 = uxHHqhbTP.EBQXiIPmm;
                                if (lmlART9vy != null) {
                                    uRyiqsiNk uryiqsink = this.kmSgne1rO;
                                    viewGroup2.startViewTransition(view2);
                                    ce8tBZHr1 ce8tbzhr1 = new ce8tBZHr1();
                                    ce8tbzhr1.J4Ux7ym32(new E7EzSrpdW(uxHHqhbTP));
                                    uryiqsink.dIocxURUo(uxHHqhbTP, ce8tbzhr1);
                                    if (lmlART9vy.q3BipwRCk != null) {
                                        KisXf5Up4 kisXf5Up4 = new KisXf5Up4(lmlART9vy.q3BipwRCk, viewGroup2, view2);
                                        uxHHqhbTP.IzM1cD9ly(uxHHqhbTP.EBQXiIPmm);
                                        kisXf5Up4.setAnimationListener(new ZlZSxeZ6Q(viewGroup2, uxHHqhbTP, uryiqsink, ce8tbzhr1));
                                        uxHHqhbTP.EBQXiIPmm.startAnimation(kisXf5Up4);
                                    } else {
                                        Animator animator = lmlART9vy.J4Ux7ym32;
                                        uxHHqhbTP.OpLJtmvFM(animator);
                                        animator.addListener(new iYvrLb2Ie(viewGroup2, view2, uxHHqhbTP, uryiqsink, ce8tbzhr1));
                                        animator.setTarget(uxHHqhbTP.EBQXiIPmm);
                                        animator.start();
                                    }
                                }
                                viewGroup2.removeView(view2);
                                if (juJ6pnCpu(2)) {
                                    Log.v("FragmentManager", "Removing view " + view2 + " for fragment " + uxHHqhbTP + " from container " + viewGroup2);
                                }
                                if (viewGroup2 != uxHHqhbTP.igRQEZxnW) {
                                    return;
                                }
                            }
                        }
                        if (this.CBQ5d1kRq.get(uxHHqhbTP) == null) {
                            sk5s77z6Q.Puu3Rhg4F();
                        }
                    }
                }
                if (min < 1) {
                    if (this.CBQ5d1kRq.get(uxHHqhbTP) != null) {
                        i2 = 1;
                        if (i2 < 0) {
                            sk5s77z6Q.yWvV4ePLl();
                        }
                        min = i2;
                    } else {
                        sk5s77z6Q.GPLPRo6go();
                    }
                }
            }
            i2 = min;
            if (i2 < 0) {
            }
            min = i2;
        }
        if (uxHHqhbTP.CBQ5d1kRq != min) {
            if (juJ6pnCpu(3)) {
                Log.d("FragmentManager", "moveToState: Fragment state for " + uxHHqhbTP + " not updated inline; expected state " + min + " found " + uxHHqhbTP.CBQ5d1kRq);
            }
            uxHHqhbTP.CBQ5d1kRq = min;
        }
    }

    public void yWvV4ePLl(xkmNtxX26 xkmntxx26, boolean z, boolean z2, boolean z3) {
        if (z) {
            xkmntxx26.Puu3Rhg4F(z3);
        } else {
            xkmntxx26.GPLPRo6go();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(xkmntxx26);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.MzoOEjc4X >= 1) {
            XU5bm7KSu.MzoOEjc4X(this.ilHKhw3Yw.kmSgne1rO, this.qVUwofr5s, arrayList, arrayList2, 0, 1, true, this.kmSgne1rO);
        }
        if (z3) {
            ziwPzaoF3(this.MzoOEjc4X, true);
        }
        Iterator it = ((ArrayList) this.tGV7Q6urW.oon79WMrY()).iterator();
        while (it.hasNext()) {
            UxHHqhbTP uxHHqhbTP = (UxHHqhbTP) it.next();
            if (uxHHqhbTP != null) {
                View view = uxHHqhbTP.EBQXiIPmm;
            }
        }
    }

    public boolean zHl31GGXU() {
        return this.cAwN510t2 || this.IytU16YUK;
    }

    public void ziwPzaoF3(int i, boolean z) {
        z0NkpHHvU z0nkphhvu;
        if (this.ilHKhw3Yw == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.MzoOEjc4X) {
            this.MzoOEjc4X = i;
            j6XJY7rz4 j6xjy7rz4 = this.tGV7Q6urW;
            Iterator it = ((ArrayList) j6xjy7rz4.kmSgne1rO).iterator();
            while (it.hasNext()) {
                RG2GI7LDp rG2GI7LDp = (RG2GI7LDp) ((HashMap) j6xjy7rz4.Bhmn1KIah).get(((UxHHqhbTP) it.next()).MzoOEjc4X);
                if (rG2GI7LDp != null) {
                    rG2GI7LDp.vPSbyrYWX();
                }
            }
            Iterator it2 = ((HashMap) j6xjy7rz4.Bhmn1KIah).values().iterator();
            while (true) {
                boolean z2 = false;
                if (!it2.hasNext()) {
                    break;
                }
                RG2GI7LDp rG2GI7LDp2 = (RG2GI7LDp) it2.next();
                if (rG2GI7LDp2 != null) {
                    rG2GI7LDp2.vPSbyrYWX();
                    UxHHqhbTP uxHHqhbTP = rG2GI7LDp2.tGV7Q6urW;
                    if (uxHHqhbTP.sk5s77z6Q && !uxHHqhbTP.dfpT1j18n()) {
                        z2 = true;
                    }
                    if (z2) {
                        j6xjy7rz4.nlGCs0NZs(rG2GI7LDp2);
                    }
                }
            }
            IG30YE5GU();
            if (this.iMyQMM6Qj && (z0nkphhvu = this.ilHKhw3Yw) != null && this.MzoOEjc4X == 7) {
                ((grT0kqTxT) z0nkphhvu.MzoOEjc4X).kmSgne1rO().kCA6Zs9sL();
                this.iMyQMM6Qj = false;
            }
        }
    }
}
