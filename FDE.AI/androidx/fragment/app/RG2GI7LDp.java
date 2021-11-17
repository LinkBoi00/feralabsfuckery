package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.mhl5lIdbQ;
import com.feravolt.preload.R;
import con.BgHiMFrEI;
import con.C2GhuZDgj;
import con.Ct9FTk2rW;
import con.Dt6xXPjII;
import con.IuQbWntsc;
import con.J3kbcXHdl;
import con.K6PL0z3I0;
import con.Lf6t4dzRk;
import con.LiMUeynem;
import con.N0a4Shkkl;
import con.Sme6YJlaf;
import con.UxHHqhbTP;
import con.WGohiwKSS;
import con.XDvWW0XDE;
import con.abGBwSu8x;
import con.cyVJjwbRF;
import con.emw2Oo1fE;
import con.fVMSvDhE6;
import con.fruufIznR;
import con.hZyIatWA3;
import con.j6XJY7rz4;
import con.kID7DUxu0;
import con.mN6fklC4R;
import con.my9FFKbZi;
import con.qKDOZuDet;
import con.sESg70qxo;
import con.z0NkpHHvU;
import con.zXvxcN9Gl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class RG2GI7LDp {
    public final j6XJY7rz4 J4Ux7ym32;
    public boolean dIocxURUo = false;
    public int kCA6Zs9sL = -1;
    public final fruufIznR q3BipwRCk;
    public final UxHHqhbTP tGV7Q6urW;

    public RG2GI7LDp(fruufIznR fruufiznr, j6XJY7rz4 j6xjy7rz4, UxHHqhbTP uxHHqhbTP) {
        this.q3BipwRCk = fruufiznr;
        this.J4Ux7ym32 = j6xjy7rz4;
        this.tGV7Q6urW = uxHHqhbTP;
    }

    public RG2GI7LDp(fruufIznR fruufiznr, j6XJY7rz4 j6xjy7rz4, UxHHqhbTP uxHHqhbTP, C2GhuZDgj c2GhuZDgj) {
        this.q3BipwRCk = fruufiznr;
        this.J4Ux7ym32 = j6xjy7rz4;
        this.tGV7Q6urW = uxHHqhbTP;
        uxHHqhbTP.Bhmn1KIah = null;
        uxHHqhbTP.PSTqBLTET = null;
        uxHHqhbTP.cAwN510t2 = 0;
        uxHHqhbTP.i8XZMQc6Z = false;
        uxHHqhbTP.ixWaw2akD = false;
        UxHHqhbTP uxHHqhbTP2 = uxHHqhbTP.qVUwofr5s;
        uxHHqhbTP.Eeka1udhb = uxHHqhbTP2 != null ? uxHHqhbTP2.MzoOEjc4X : null;
        uxHHqhbTP.qVUwofr5s = null;
        Bundle bundle = c2GhuZDgj.WaUP0CF08;
        uxHHqhbTP.kmSgne1rO = bundle == null ? new Bundle() : bundle;
    }

    public RG2GI7LDp(fruufIznR fruufiznr, j6XJY7rz4 j6xjy7rz4, ClassLoader classLoader, qKDOZuDet qkdozudet, C2GhuZDgj c2GhuZDgj) {
        this.q3BipwRCk = fruufiznr;
        this.J4Ux7ym32 = j6xjy7rz4;
        UxHHqhbTP q3BipwRCk = qkdozudet.q3BipwRCk(c2GhuZDgj.CBQ5d1kRq);
        this.tGV7Q6urW = q3BipwRCk;
        Bundle bundle = c2GhuZDgj.RG6kpfv3v;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        q3BipwRCk.BL4OzhZBd(c2GhuZDgj.RG6kpfv3v);
        q3BipwRCk.MzoOEjc4X = c2GhuZDgj.kmSgne1rO;
        q3BipwRCk.WaUP0CF08 = c2GhuZDgj.Bhmn1KIah;
        q3BipwRCk.dfpT1j18n = true;
        q3BipwRCk.AqaWJg0b4 = c2GhuZDgj.PSTqBLTET;
        q3BipwRCk.mUqPm6GBh = c2GhuZDgj.MzoOEjc4X;
        q3BipwRCk.NyWTwPF6V = c2GhuZDgj.ilHKhw3Yw;
        q3BipwRCk.o4LF8RkoQ = c2GhuZDgj.qVUwofr5s;
        q3BipwRCk.sk5s77z6Q = c2GhuZDgj.Eeka1udhb;
        q3BipwRCk.i0Zug1mVk = c2GhuZDgj.dXrmkklc8;
        q3BipwRCk.vNtjxmzUM = c2GhuZDgj.ixWaw2akD;
        q3BipwRCk.ziwPzaoF3 = mhl5lIdbQ.EnumC0005mhl5lIdbQ.values()[c2GhuZDgj.sk5s77z6Q];
        Bundle bundle2 = c2GhuZDgj.WaUP0CF08;
        q3BipwRCk.kmSgne1rO = bundle2 == null ? new Bundle() : bundle2;
        if (fVMSvDhE6.juJ6pnCpu(2)) {
            Dt6xXPjII.q3BipwRCk("Instantiated fragment ", q3BipwRCk, "FragmentManager");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void Bhmn1KIah() {
        /*
            r8 = this;
            r0 = 3
            boolean r0 = con.fVMSvDhE6.juJ6pnCpu(r0)
            java.lang.String r1 = "FragmentManager"
            if (r0 == 0) goto L_0x001b
            java.lang.String r0 = "moveto RESUMED: "
            java.lang.StringBuilder r0 = con.abGBwSu8x.q3BipwRCk(r0)
            con.UxHHqhbTP r2 = r8.tGV7Q6urW
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L_0x001b:
            con.UxHHqhbTP r0 = r8.tGV7Q6urW
            con.rwMIknDWL r2 = r0.j22ftfeNI
            r3 = 0
            if (r2 != 0) goto L_0x0024
            r2 = r3
            goto L_0x0026
        L_0x0024:
            android.view.View r2 = r2.PSTqBLTET
        L_0x0026:
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x008d
            android.view.View r0 = r0.EBQXiIPmm
            if (r2 != r0) goto L_0x002f
            goto L_0x003b
        L_0x002f:
            android.view.ViewParent r0 = r2.getParent()
        L_0x0033:
            if (r0 == 0) goto L_0x0042
            con.UxHHqhbTP r6 = r8.tGV7Q6urW
            android.view.View r6 = r6.EBQXiIPmm
            if (r0 != r6) goto L_0x003d
        L_0x003b:
            r0 = r4
            goto L_0x0043
        L_0x003d:
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0033
        L_0x0042:
            r0 = r5
        L_0x0043:
            if (r0 == 0) goto L_0x008d
            boolean r0 = r2.requestFocus()
            r6 = 2
            boolean r6 = con.fVMSvDhE6.juJ6pnCpu(r6)
            if (r6 == 0) goto L_0x008d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "requestFocus: Restoring focused view "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = " "
            r6.append(r2)
            if (r0 == 0) goto L_0x0067
            java.lang.String r0 = "succeeded"
            goto L_0x0069
        L_0x0067:
            java.lang.String r0 = "failed"
        L_0x0069:
            r6.append(r0)
            java.lang.String r0 = " on Fragment "
            r6.append(r0)
            con.UxHHqhbTP r0 = r8.tGV7Q6urW
            r6.append(r0)
            java.lang.String r0 = " resulting in focused view "
            r6.append(r0)
            con.UxHHqhbTP r0 = r8.tGV7Q6urW
            android.view.View r0 = r0.EBQXiIPmm
            android.view.View r0 = r0.findFocus()
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.v(r1, r0)
        L_0x008d:
            con.UxHHqhbTP r0 = r8.tGV7Q6urW
            r0.DuuXfa7LE(r3)
            con.UxHHqhbTP r0 = r8.tGV7Q6urW
            con.fVMSvDhE6 r1 = r0.qFBXIgpia
            r1.IzM1cD9ly()
            con.fVMSvDhE6 r1 = r0.qFBXIgpia
            r1.qFBXIgpia(r4)
            r1 = 7
            r0.CBQ5d1kRq = r1
            r0.QNqj6nIzv = r5
            r0.QNqj6nIzv = r4
            con.N0a4Shkkl r2 = r0.wIZEdYHUn
            androidx.lifecycle.mhl5lIdbQ$RG2GI7LDp r4 = androidx.lifecycle.mhl5lIdbQ.RG2GI7LDp.ON_RESUME
            r2.kCA6Zs9sL(r4)
            android.view.View r2 = r0.EBQXiIPmm
            if (r2 == 0) goto L_0x00b5
            con.hZyIatWA3 r2 = r0.IzM1cD9ly
            r2.J4Ux7ym32(r4)
        L_0x00b5:
            con.fVMSvDhE6 r0 = r0.qFBXIgpia
            r0.cAwN510t2 = r5
            r0.IytU16YUK = r5
            con.XDvWW0XDE r2 = r0.vNtjxmzUM
            r2.GPLPRo6go = r5
            r0.i8XZMQc6Z(r1)
            con.fruufIznR r0 = r8.q3BipwRCk
            con.UxHHqhbTP r1 = r8.tGV7Q6urW
            r0.oon79WMrY(r1, r5)
            con.UxHHqhbTP r0 = r8.tGV7Q6urW
            r0.kmSgne1rO = r3
            r0.Bhmn1KIah = r3
            r0.PSTqBLTET = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.RG2GI7LDp.Bhmn1KIah():void");
    }

    public void CBQ5d1kRq() {
        if (fVMSvDhE6.juJ6pnCpu(3)) {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("movefrom RESUMED: ");
            q3BipwRCk.append(this.tGV7Q6urW);
            Log.d("FragmentManager", q3BipwRCk.toString());
        }
        UxHHqhbTP uxHHqhbTP = this.tGV7Q6urW;
        uxHHqhbTP.qFBXIgpia.i8XZMQc6Z(5);
        if (uxHHqhbTP.EBQXiIPmm != null) {
            uxHHqhbTP.IzM1cD9ly.J4Ux7ym32(mhl5lIdbQ.RG2GI7LDp.ON_PAUSE);
        }
        uxHHqhbTP.wIZEdYHUn.kCA6Zs9sL(mhl5lIdbQ.RG2GI7LDp.ON_PAUSE);
        uxHHqhbTP.CBQ5d1kRq = 6;
        uxHHqhbTP.QNqj6nIzv = false;
        uxHHqhbTP.QNqj6nIzv = true;
        this.q3BipwRCk.GPLPRo6go(this.tGV7Q6urW, false);
    }

    public void GPLPRo6go() {
        UxHHqhbTP GPLPRo6go;
        boolean z;
        if (fVMSvDhE6.juJ6pnCpu(3)) {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("movefrom CREATED: ");
            q3BipwRCk.append(this.tGV7Q6urW);
            Log.d("FragmentManager", q3BipwRCk.toString());
        }
        UxHHqhbTP uxHHqhbTP = this.tGV7Q6urW;
        boolean z2 = uxHHqhbTP.sk5s77z6Q && !uxHHqhbTP.dfpT1j18n();
        if (z2 || ((XDvWW0XDE) this.J4Ux7ym32.PSTqBLTET).tGV7Q6urW(this.tGV7Q6urW)) {
            z0NkpHHvU z0nkphhvu = this.tGV7Q6urW.CpG0imbht;
            if (z0nkphhvu instanceof LiMUeynem) {
                z = ((XDvWW0XDE) this.J4Ux7ym32.PSTqBLTET).iiGwOFFnr;
            } else {
                Context context = z0nkphhvu.kmSgne1rO;
                z = context instanceof Activity ? !((Activity) context).isChangingConfigurations() : true;
            }
            if (z2 || z) {
                XDvWW0XDE xDvWW0XDE = (XDvWW0XDE) this.J4Ux7ym32.PSTqBLTET;
                UxHHqhbTP uxHHqhbTP2 = this.tGV7Q6urW;
                Objects.requireNonNull(xDvWW0XDE);
                if (fVMSvDhE6.juJ6pnCpu(3)) {
                    Log.d("FragmentManager", "Clearing non-config state for " + uxHHqhbTP2);
                }
                XDvWW0XDE xDvWW0XDE2 = (XDvWW0XDE) xDvWW0XDE.tGV7Q6urW.get(uxHHqhbTP2.MzoOEjc4X);
                if (xDvWW0XDE2 != null) {
                    xDvWW0XDE2.q3BipwRCk();
                    xDvWW0XDE.tGV7Q6urW.remove(uxHHqhbTP2.MzoOEjc4X);
                }
                emw2Oo1fE emw2oo1fe = (emw2Oo1fE) xDvWW0XDE.dIocxURUo.get(uxHHqhbTP2.MzoOEjc4X);
                if (emw2oo1fe != null) {
                    emw2oo1fe.q3BipwRCk();
                    xDvWW0XDE.dIocxURUo.remove(uxHHqhbTP2.MzoOEjc4X);
                }
            }
            UxHHqhbTP uxHHqhbTP3 = this.tGV7Q6urW;
            uxHHqhbTP3.qFBXIgpia.ilHKhw3Yw();
            uxHHqhbTP3.wIZEdYHUn.kCA6Zs9sL(mhl5lIdbQ.RG2GI7LDp.ON_DESTROY);
            uxHHqhbTP3.CBQ5d1kRq = 0;
            uxHHqhbTP3.QNqj6nIzv = false;
            uxHHqhbTP3.zHl31GGXU = false;
            uxHHqhbTP3.QNqj6nIzv = true;
            this.q3BipwRCk.kCA6Zs9sL(this.tGV7Q6urW, false);
            Iterator it = ((ArrayList) this.J4Ux7ym32.yWvV4ePLl()).iterator();
            while (it.hasNext()) {
                RG2GI7LDp rG2GI7LDp = (RG2GI7LDp) it.next();
                if (rG2GI7LDp != null) {
                    UxHHqhbTP uxHHqhbTP4 = rG2GI7LDp.tGV7Q6urW;
                    if (this.tGV7Q6urW.MzoOEjc4X.equals(uxHHqhbTP4.Eeka1udhb)) {
                        uxHHqhbTP4.qVUwofr5s = this.tGV7Q6urW;
                        uxHHqhbTP4.Eeka1udhb = null;
                    }
                }
            }
            UxHHqhbTP uxHHqhbTP5 = this.tGV7Q6urW;
            String str = uxHHqhbTP5.Eeka1udhb;
            if (str != null) {
                uxHHqhbTP5.qVUwofr5s = this.J4Ux7ym32.GPLPRo6go(str);
            }
            this.J4Ux7ym32.nlGCs0NZs(this);
            return;
        }
        String str2 = this.tGV7Q6urW.Eeka1udhb;
        if (!(str2 == null || (GPLPRo6go = this.J4Ux7ym32.GPLPRo6go(str2)) == null || !GPLPRo6go.o4LF8RkoQ)) {
            this.tGV7Q6urW.qVUwofr5s = GPLPRo6go;
        }
        this.tGV7Q6urW.CBQ5d1kRq = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r1 >= ((java.util.ArrayList) r0.kmSgne1rO).size()) goto L_0x0057;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        r4 = (con.UxHHqhbTP) ((java.util.ArrayList) r0.kmSgne1rO).get(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r4.igRQEZxnW != r2) goto L_0x0035;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
        r4 = r4.EBQXiIPmm;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
        if (r4 == null) goto L_0x0035;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
        r3 = r2.indexOfChild(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void J4Ux7ym32() {
        /*
            r7 = this;
            con.j6XJY7rz4 r0 = r7.J4Ux7ym32
            con.UxHHqhbTP r1 = r7.tGV7Q6urW
            java.util.Objects.requireNonNull(r0)
            android.view.ViewGroup r2 = r1.igRQEZxnW
            r3 = -1
            if (r2 != 0) goto L_0x000d
            goto L_0x0057
        L_0x000d:
            java.lang.Object r4 = r0.kmSgne1rO
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r1 = r4.indexOf(r1)
            int r4 = r1 + -1
        L_0x0017:
            if (r4 < 0) goto L_0x0035
            java.lang.Object r5 = r0.kmSgne1rO
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r5 = r5.get(r4)
            con.UxHHqhbTP r5 = (con.UxHHqhbTP) r5
            android.view.ViewGroup r6 = r5.igRQEZxnW
            if (r6 != r2) goto L_0x0032
            android.view.View r5 = r5.EBQXiIPmm
            if (r5 == 0) goto L_0x0032
            int r0 = r2.indexOfChild(r5)
            int r3 = r0 + 1
            goto L_0x0057
        L_0x0032:
            int r4 = r4 + -1
            goto L_0x0017
        L_0x0035:
            int r1 = r1 + 1
            java.lang.Object r4 = r0.kmSgne1rO
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r4 = r4.size()
            if (r1 >= r4) goto L_0x0057
            java.lang.Object r4 = r0.kmSgne1rO
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r4 = r4.get(r1)
            con.UxHHqhbTP r4 = (con.UxHHqhbTP) r4
            android.view.ViewGroup r5 = r4.igRQEZxnW
            if (r5 != r2) goto L_0x0035
            android.view.View r4 = r4.EBQXiIPmm
            if (r4 == 0) goto L_0x0035
            int r3 = r2.indexOfChild(r4)
        L_0x0057:
            con.UxHHqhbTP r0 = r7.tGV7Q6urW
            android.view.ViewGroup r1 = r0.igRQEZxnW
            android.view.View r0 = r0.EBQXiIPmm
            r1.addView(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.RG2GI7LDp.J4Ux7ym32():void");
    }

    public void MzoOEjc4X() {
        if (fVMSvDhE6.juJ6pnCpu(3)) {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("moveto STARTED: ");
            q3BipwRCk.append(this.tGV7Q6urW);
            Log.d("FragmentManager", q3BipwRCk.toString());
        }
        UxHHqhbTP uxHHqhbTP = this.tGV7Q6urW;
        uxHHqhbTP.qFBXIgpia.IzM1cD9ly();
        uxHHqhbTP.qFBXIgpia.qFBXIgpia(true);
        uxHHqhbTP.CBQ5d1kRq = 5;
        uxHHqhbTP.QNqj6nIzv = false;
        uxHHqhbTP.V9LQMKGJe();
        if (uxHHqhbTP.QNqj6nIzv) {
            N0a4Shkkl n0a4Shkkl = uxHHqhbTP.wIZEdYHUn;
            mhl5lIdbQ.RG2GI7LDp rG2GI7LDp = mhl5lIdbQ.RG2GI7LDp.ON_START;
            n0a4Shkkl.kCA6Zs9sL(rG2GI7LDp);
            if (uxHHqhbTP.EBQXiIPmm != null) {
                uxHHqhbTP.IzM1cD9ly.J4Ux7ym32(rG2GI7LDp);
            }
            fVMSvDhE6 fvmsvdhe6 = uxHHqhbTP.qFBXIgpia;
            fvmsvdhe6.cAwN510t2 = false;
            fvmsvdhe6.IytU16YUK = false;
            fvmsvdhe6.vNtjxmzUM.GPLPRo6go = false;
            fvmsvdhe6.i8XZMQc6Z(5);
            this.q3BipwRCk.CBQ5d1kRq(this.tGV7Q6urW, false);
            return;
        }
        throw new Ct9FTk2rW(sESg70qxo.q3BipwRCk("Fragment ", uxHHqhbTP, " did not call through to super.onStart()"));
    }

    public void PSTqBLTET() {
        if (this.tGV7Q6urW.EBQXiIPmm != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.tGV7Q6urW.EBQXiIPmm.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.tGV7Q6urW.Bhmn1KIah = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.tGV7Q6urW.IzM1cD9ly.Bhmn1KIah.J4Ux7ym32(bundle);
            if (!bundle.isEmpty()) {
                this.tGV7Q6urW.PSTqBLTET = bundle;
            }
        }
    }

    public void Puu3Rhg4F() {
        View view;
        if (fVMSvDhE6.juJ6pnCpu(3)) {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("movefrom CREATE_VIEW: ");
            q3BipwRCk.append(this.tGV7Q6urW);
            Log.d("FragmentManager", q3BipwRCk.toString());
        }
        UxHHqhbTP uxHHqhbTP = this.tGV7Q6urW;
        ViewGroup viewGroup = uxHHqhbTP.igRQEZxnW;
        if (!(viewGroup == null || (view = uxHHqhbTP.EBQXiIPmm) == null)) {
            viewGroup.removeView(view);
        }
        this.tGV7Q6urW.juJ6pnCpu();
        this.q3BipwRCk.PSTqBLTET(this.tGV7Q6urW, false);
        UxHHqhbTP uxHHqhbTP2 = this.tGV7Q6urW;
        uxHHqhbTP2.igRQEZxnW = null;
        uxHHqhbTP2.EBQXiIPmm = null;
        uxHHqhbTP2.IzM1cD9ly = null;
        uxHHqhbTP2.n4UIOvAko.iiGwOFFnr(null);
        this.tGV7Q6urW.i8XZMQc6Z = false;
    }

    public int dIocxURUo() {
        UxHHqhbTP uxHHqhbTP = this.tGV7Q6urW;
        if (uxHHqhbTP.IytU16YUK == null) {
            return uxHHqhbTP.CBQ5d1kRq;
        }
        int i = this.kCA6Zs9sL;
        int ordinal = uxHHqhbTP.ziwPzaoF3.ordinal();
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        UxHHqhbTP uxHHqhbTP2 = this.tGV7Q6urW;
        if (uxHHqhbTP2.WaUP0CF08) {
            if (uxHHqhbTP2.i8XZMQc6Z) {
                i = Math.max(this.kCA6Zs9sL, 2);
                View view = this.tGV7Q6urW.EBQXiIPmm;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.kCA6Zs9sL < 4 ? Math.min(i, uxHHqhbTP2.CBQ5d1kRq) : Math.min(i, 1);
            }
        }
        if (!this.tGV7Q6urW.ixWaw2akD) {
            i = Math.min(i, 1);
        }
        UxHHqhbTP uxHHqhbTP3 = this.tGV7Q6urW;
        ViewGroup viewGroup = uxHHqhbTP3.igRQEZxnW;
        mhl5lIdbQ mhl5lidbq = null;
        zXvxcN9Gl zxvxcn9gl = null;
        if (viewGroup != null) {
            J3kbcXHdl iiGwOFFnr = J3kbcXHdl.iiGwOFFnr(viewGroup, uxHHqhbTP3.MzoOEjc4X().EBQXiIPmm());
            Objects.requireNonNull(iiGwOFFnr);
            zXvxcN9Gl dIocxURUo = iiGwOFFnr.dIocxURUo(this.tGV7Q6urW);
            mhl5lIdbQ mhl5lidbq2 = dIocxURUo != null ? dIocxURUo.J4Ux7ym32 : null;
            UxHHqhbTP uxHHqhbTP4 = this.tGV7Q6urW;
            Iterator it = iiGwOFFnr.tGV7Q6urW.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                zXvxcN9Gl zxvxcn9gl2 = (zXvxcN9Gl) it.next();
                if (zxvxcn9gl2.tGV7Q6urW.equals(uxHHqhbTP4) && !zxvxcn9gl2.iiGwOFFnr) {
                    zxvxcn9gl = zxvxcn9gl2;
                    break;
                }
            }
            mhl5lidbq = (zxvxcn9gl == null || !(mhl5lidbq2 == null || mhl5lidbq2 == mhl5lIdbQ.NONE)) ? mhl5lidbq2 : zxvxcn9gl.J4Ux7ym32;
        }
        if (mhl5lidbq == mhl5lIdbQ.ADDING) {
            i = Math.min(i, 6);
        } else if (mhl5lidbq == mhl5lIdbQ.REMOVING) {
            i = Math.max(i, 3);
        } else {
            UxHHqhbTP uxHHqhbTP5 = this.tGV7Q6urW;
            if (uxHHqhbTP5.sk5s77z6Q) {
                i = uxHHqhbTP5.dfpT1j18n() ? Math.min(i, 1) : Math.min(i, -1);
            }
        }
        UxHHqhbTP uxHHqhbTP6 = this.tGV7Q6urW;
        if (uxHHqhbTP6.TyB1UUd72 && uxHHqhbTP6.CBQ5d1kRq < 5) {
            i = Math.min(i, 4);
        }
        if (fVMSvDhE6.juJ6pnCpu(2)) {
            StringBuilder q3BipwRCk = Lf6t4dzRk.q3BipwRCk("computeExpectedState() of ", i, " for ");
            q3BipwRCk.append(this.tGV7Q6urW);
            Log.v("FragmentManager", q3BipwRCk.toString());
        }
        return i;
    }

    public void iiGwOFFnr() {
        String str;
        if (!this.tGV7Q6urW.WaUP0CF08) {
            if (fVMSvDhE6.juJ6pnCpu(3)) {
                StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("moveto CREATE_VIEW: ");
                q3BipwRCk.append(this.tGV7Q6urW);
                Log.d("FragmentManager", q3BipwRCk.toString());
            }
            UxHHqhbTP uxHHqhbTP = this.tGV7Q6urW;
            LayoutInflater vNtjxmzUM = uxHHqhbTP.vNtjxmzUM(uxHHqhbTP.kmSgne1rO);
            ViewGroup viewGroup = null;
            UxHHqhbTP uxHHqhbTP2 = this.tGV7Q6urW;
            ViewGroup viewGroup2 = uxHHqhbTP2.igRQEZxnW;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i = uxHHqhbTP2.mUqPm6GBh;
                if (i != 0) {
                    if (i != -1) {
                        viewGroup = (ViewGroup) uxHHqhbTP2.IytU16YUK.qVUwofr5s.tGV7Q6urW(i);
                        if (viewGroup == null) {
                            UxHHqhbTP uxHHqhbTP3 = this.tGV7Q6urW;
                            if (!uxHHqhbTP3.dfpT1j18n) {
                                try {
                                    str = uxHHqhbTP3.RG6kpfv3v().getResourceName(this.tGV7Q6urW.mUqPm6GBh);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                StringBuilder q3BipwRCk2 = abGBwSu8x.q3BipwRCk("No view found for id 0x");
                                q3BipwRCk2.append(Integer.toHexString(this.tGV7Q6urW.mUqPm6GBh));
                                q3BipwRCk2.append(" (");
                                q3BipwRCk2.append(str);
                                q3BipwRCk2.append(") for fragment ");
                                q3BipwRCk2.append(this.tGV7Q6urW);
                                throw new IllegalArgumentException(q3BipwRCk2.toString());
                            }
                        }
                    } else {
                        StringBuilder q3BipwRCk3 = abGBwSu8x.q3BipwRCk("Cannot create fragment ");
                        q3BipwRCk3.append(this.tGV7Q6urW);
                        q3BipwRCk3.append(" for a container view with no id");
                        throw new IllegalArgumentException(q3BipwRCk3.toString());
                    }
                }
            }
            UxHHqhbTP uxHHqhbTP4 = this.tGV7Q6urW;
            uxHHqhbTP4.igRQEZxnW = viewGroup;
            uxHHqhbTP4.TyB1UUd72(vNtjxmzUM, viewGroup, uxHHqhbTP4.kmSgne1rO);
            View view = this.tGV7Q6urW.EBQXiIPmm;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                UxHHqhbTP uxHHqhbTP5 = this.tGV7Q6urW;
                uxHHqhbTP5.EBQXiIPmm.setTag(R.id.fragment_container_view_tag, uxHHqhbTP5);
                if (viewGroup != null) {
                    J4Ux7ym32();
                }
                UxHHqhbTP uxHHqhbTP6 = this.tGV7Q6urW;
                if (uxHHqhbTP6.vNtjxmzUM) {
                    uxHHqhbTP6.EBQXiIPmm.setVisibility(8);
                }
                View view2 = this.tGV7Q6urW.EBQXiIPmm;
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                if (mN6fklC4R.J4Ux7ym32(view2)) {
                    cyVJjwbRF.tGV7Q6urW(this.tGV7Q6urW.EBQXiIPmm);
                } else {
                    View view3 = this.tGV7Q6urW.EBQXiIPmm;
                    view3.addOnAttachStateChangeListener(new Sme6YJlaf(this, view3));
                }
                this.tGV7Q6urW.qFBXIgpia.i8XZMQc6Z(2);
                fruufIznR fruufiznr = this.q3BipwRCk;
                UxHHqhbTP uxHHqhbTP7 = this.tGV7Q6urW;
                fruufiznr.Bhmn1KIah(uxHHqhbTP7, uxHHqhbTP7.EBQXiIPmm, uxHHqhbTP7.kmSgne1rO, false);
                int visibility = this.tGV7Q6urW.EBQXiIPmm.getVisibility();
                this.tGV7Q6urW.tGV7Q6urW().Bhmn1KIah = this.tGV7Q6urW.EBQXiIPmm.getAlpha();
                UxHHqhbTP uxHHqhbTP8 = this.tGV7Q6urW;
                if (uxHHqhbTP8.igRQEZxnW != null && visibility == 0) {
                    View findFocus = uxHHqhbTP8.EBQXiIPmm.findFocus();
                    if (findFocus != null) {
                        this.tGV7Q6urW.tGV7Q6urW().PSTqBLTET = findFocus;
                        if (fVMSvDhE6.juJ6pnCpu(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.tGV7Q6urW);
                        }
                    }
                    this.tGV7Q6urW.EBQXiIPmm.setAlpha(0.0f);
                }
            }
            this.tGV7Q6urW.CBQ5d1kRq = 2;
        }
    }

    public void ilHKhw3Yw() {
        if (fVMSvDhE6.juJ6pnCpu(3)) {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("movefrom STARTED: ");
            q3BipwRCk.append(this.tGV7Q6urW);
            Log.d("FragmentManager", q3BipwRCk.toString());
        }
        UxHHqhbTP uxHHqhbTP = this.tGV7Q6urW;
        fVMSvDhE6 fvmsvdhe6 = uxHHqhbTP.qFBXIgpia;
        fvmsvdhe6.IytU16YUK = true;
        fvmsvdhe6.vNtjxmzUM.GPLPRo6go = true;
        fvmsvdhe6.i8XZMQc6Z(4);
        if (uxHHqhbTP.EBQXiIPmm != null) {
            uxHHqhbTP.IzM1cD9ly.J4Ux7ym32(mhl5lIdbQ.RG2GI7LDp.ON_STOP);
        }
        uxHHqhbTP.wIZEdYHUn.kCA6Zs9sL(mhl5lIdbQ.RG2GI7LDp.ON_STOP);
        uxHHqhbTP.CBQ5d1kRq = 4;
        uxHHqhbTP.QNqj6nIzv = false;
        uxHHqhbTP.QNqj6nIzv();
        if (uxHHqhbTP.QNqj6nIzv) {
            this.q3BipwRCk.kmSgne1rO(this.tGV7Q6urW, false);
            return;
        }
        throw new Ct9FTk2rW(sESg70qxo.q3BipwRCk("Fragment ", uxHHqhbTP, " did not call through to super.onStop()"));
    }

    public void kCA6Zs9sL() {
        Parcelable parcelable;
        if (fVMSvDhE6.juJ6pnCpu(3)) {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("moveto CREATED: ");
            q3BipwRCk.append(this.tGV7Q6urW);
            Log.d("FragmentManager", q3BipwRCk.toString());
        }
        UxHHqhbTP uxHHqhbTP = this.tGV7Q6urW;
        if (!uxHHqhbTP.zHl31GGXU) {
            this.q3BipwRCk.yWvV4ePLl(uxHHqhbTP, uxHHqhbTP.kmSgne1rO, false);
            UxHHqhbTP uxHHqhbTP2 = this.tGV7Q6urW;
            Bundle bundle = uxHHqhbTP2.kmSgne1rO;
            uxHHqhbTP2.qFBXIgpia.IzM1cD9ly();
            uxHHqhbTP2.CBQ5d1kRq = 1;
            uxHHqhbTP2.QNqj6nIzv = false;
            uxHHqhbTP2.wIZEdYHUn.q3BipwRCk(new WGohiwKSS() { // from class: androidx.fragment.app.Fragment$5
                @Override // con.WGohiwKSS
                public void tGV7Q6urW(BgHiMFrEI bgHiMFrEI, mhl5lIdbQ.RG2GI7LDp rG2GI7LDp) {
                    View view;
                    if (rG2GI7LDp == mhl5lIdbQ.RG2GI7LDp.ON_STOP && (view = UxHHqhbTP.this.EBQXiIPmm) != null) {
                        view.cancelPendingInputEvents();
                    }
                }
            });
            uxHHqhbTP2.OpLJtmvFM.q3BipwRCk(bundle);
            uxHHqhbTP2.nlGCs0NZs(bundle);
            uxHHqhbTP2.zHl31GGXU = true;
            if (uxHHqhbTP2.QNqj6nIzv) {
                uxHHqhbTP2.wIZEdYHUn.kCA6Zs9sL(mhl5lIdbQ.RG2GI7LDp.ON_CREATE);
                fruufIznR fruufiznr = this.q3BipwRCk;
                UxHHqhbTP uxHHqhbTP3 = this.tGV7Q6urW;
                fruufiznr.dIocxURUo(uxHHqhbTP3, uxHHqhbTP3.kmSgne1rO, false);
                return;
            }
            throw new Ct9FTk2rW(sESg70qxo.q3BipwRCk("Fragment ", uxHHqhbTP2, " did not call through to super.onCreate()"));
        }
        Bundle bundle2 = uxHHqhbTP.kmSgne1rO;
        if (!(bundle2 == null || (parcelable = bundle2.getParcelable("android:support:fragments")) == null)) {
            uxHHqhbTP.qFBXIgpia.kktL0P5MG(parcelable);
            uxHHqhbTP.qFBXIgpia.PSTqBLTET();
        }
        this.tGV7Q6urW.CBQ5d1kRq = 1;
    }

    public void kmSgne1rO(ClassLoader classLoader) {
        Bundle bundle = this.tGV7Q6urW.kmSgne1rO;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            UxHHqhbTP uxHHqhbTP = this.tGV7Q6urW;
            uxHHqhbTP.Bhmn1KIah = uxHHqhbTP.kmSgne1rO.getSparseParcelableArray("android:view_state");
            UxHHqhbTP uxHHqhbTP2 = this.tGV7Q6urW;
            uxHHqhbTP2.PSTqBLTET = uxHHqhbTP2.kmSgne1rO.getBundle("android:view_registry_state");
            UxHHqhbTP uxHHqhbTP3 = this.tGV7Q6urW;
            uxHHqhbTP3.Eeka1udhb = uxHHqhbTP3.kmSgne1rO.getString("android:target_state");
            UxHHqhbTP uxHHqhbTP4 = this.tGV7Q6urW;
            if (uxHHqhbTP4.Eeka1udhb != null) {
                uxHHqhbTP4.dXrmkklc8 = uxHHqhbTP4.kmSgne1rO.getInt("android:target_req_state", 0);
            }
            UxHHqhbTP uxHHqhbTP5 = this.tGV7Q6urW;
            Objects.requireNonNull(uxHHqhbTP5);
            uxHHqhbTP5.juJ6pnCpu = uxHHqhbTP5.kmSgne1rO.getBoolean("android:user_visible_hint", true);
            UxHHqhbTP uxHHqhbTP6 = this.tGV7Q6urW;
            if (!uxHHqhbTP6.juJ6pnCpu) {
                uxHHqhbTP6.TyB1UUd72 = true;
            }
        }
    }

    public void oon79WMrY() {
        UxHHqhbTP uxHHqhbTP = this.tGV7Q6urW;
        if (uxHHqhbTP.WaUP0CF08 && uxHHqhbTP.i8XZMQc6Z && !uxHHqhbTP.iMyQMM6Qj) {
            if (fVMSvDhE6.juJ6pnCpu(3)) {
                StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("moveto CREATE_VIEW: ");
                q3BipwRCk.append(this.tGV7Q6urW);
                Log.d("FragmentManager", q3BipwRCk.toString());
            }
            UxHHqhbTP uxHHqhbTP2 = this.tGV7Q6urW;
            uxHHqhbTP2.TyB1UUd72(uxHHqhbTP2.vNtjxmzUM(uxHHqhbTP2.kmSgne1rO), null, this.tGV7Q6urW.kmSgne1rO);
            View view = this.tGV7Q6urW.EBQXiIPmm;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                UxHHqhbTP uxHHqhbTP3 = this.tGV7Q6urW;
                uxHHqhbTP3.EBQXiIPmm.setTag(R.id.fragment_container_view_tag, uxHHqhbTP3);
                UxHHqhbTP uxHHqhbTP4 = this.tGV7Q6urW;
                if (uxHHqhbTP4.vNtjxmzUM) {
                    uxHHqhbTP4.EBQXiIPmm.setVisibility(8);
                }
                this.tGV7Q6urW.qFBXIgpia.i8XZMQc6Z(2);
                fruufIznR fruufiznr = this.q3BipwRCk;
                UxHHqhbTP uxHHqhbTP5 = this.tGV7Q6urW;
                fruufiznr.Bhmn1KIah(uxHHqhbTP5, uxHHqhbTP5.EBQXiIPmm, uxHHqhbTP5.kmSgne1rO, false);
                this.tGV7Q6urW.CBQ5d1kRq = 2;
            }
        }
    }

    public void q3BipwRCk() {
        if (fVMSvDhE6.juJ6pnCpu(3)) {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("moveto ACTIVITY_CREATED: ");
            q3BipwRCk.append(this.tGV7Q6urW);
            Log.d("FragmentManager", q3BipwRCk.toString());
        }
        UxHHqhbTP uxHHqhbTP = this.tGV7Q6urW;
        Bundle bundle = uxHHqhbTP.kmSgne1rO;
        uxHHqhbTP.qFBXIgpia.IzM1cD9ly();
        uxHHqhbTP.CBQ5d1kRq = 3;
        uxHHqhbTP.QNqj6nIzv = false;
        uxHHqhbTP.QNqj6nIzv = true;
        if (fVMSvDhE6.juJ6pnCpu(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + uxHHqhbTP);
        }
        View view = uxHHqhbTP.EBQXiIPmm;
        if (view != null) {
            Bundle bundle2 = uxHHqhbTP.kmSgne1rO;
            SparseArray<Parcelable> sparseArray = uxHHqhbTP.Bhmn1KIah;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                uxHHqhbTP.Bhmn1KIah = null;
            }
            if (uxHHqhbTP.EBQXiIPmm != null) {
                hZyIatWA3 hzyiatwa3 = uxHHqhbTP.IzM1cD9ly;
                hzyiatwa3.Bhmn1KIah.q3BipwRCk(uxHHqhbTP.PSTqBLTET);
                uxHHqhbTP.PSTqBLTET = null;
            }
            uxHHqhbTP.QNqj6nIzv = false;
            uxHHqhbTP.igRQEZxnW(bundle2);
            if (!uxHHqhbTP.QNqj6nIzv) {
                throw new Ct9FTk2rW(sESg70qxo.q3BipwRCk("Fragment ", uxHHqhbTP, " did not call through to super.onViewStateRestored()"));
            } else if (uxHHqhbTP.EBQXiIPmm != null) {
                uxHHqhbTP.IzM1cD9ly.J4Ux7ym32(mhl5lIdbQ.RG2GI7LDp.ON_CREATE);
            }
        }
        uxHHqhbTP.kmSgne1rO = null;
        fVMSvDhE6 fvmsvdhe6 = uxHHqhbTP.qFBXIgpia;
        fvmsvdhe6.cAwN510t2 = false;
        fvmsvdhe6.IytU16YUK = false;
        fvmsvdhe6.vNtjxmzUM.GPLPRo6go = false;
        fvmsvdhe6.i8XZMQc6Z(4);
        fruufIznR fruufiznr = this.q3BipwRCk;
        UxHHqhbTP uxHHqhbTP2 = this.tGV7Q6urW;
        fruufiznr.J4Ux7ym32(uxHHqhbTP2, uxHHqhbTP2.kmSgne1rO, false);
    }

    public void tGV7Q6urW() {
        RG2GI7LDp rG2GI7LDp;
        if (fVMSvDhE6.juJ6pnCpu(3)) {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("moveto ATTACHED: ");
            q3BipwRCk.append(this.tGV7Q6urW);
            Log.d("FragmentManager", q3BipwRCk.toString());
        }
        UxHHqhbTP uxHHqhbTP = this.tGV7Q6urW;
        UxHHqhbTP uxHHqhbTP2 = uxHHqhbTP.qVUwofr5s;
        if (uxHHqhbTP2 != null) {
            rG2GI7LDp = this.J4Ux7ym32.sk5s77z6Q(uxHHqhbTP2.MzoOEjc4X);
            if (rG2GI7LDp != null) {
                UxHHqhbTP uxHHqhbTP3 = this.tGV7Q6urW;
                uxHHqhbTP3.Eeka1udhb = uxHHqhbTP3.qVUwofr5s.MzoOEjc4X;
                uxHHqhbTP3.qVUwofr5s = null;
            } else {
                StringBuilder q3BipwRCk2 = abGBwSu8x.q3BipwRCk("Fragment ");
                q3BipwRCk2.append(this.tGV7Q6urW);
                q3BipwRCk2.append(" declared target fragment ");
                q3BipwRCk2.append(this.tGV7Q6urW.qVUwofr5s);
                q3BipwRCk2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(q3BipwRCk2.toString());
            }
        } else {
            String str = uxHHqhbTP.Eeka1udhb;
            if (str != null) {
                rG2GI7LDp = this.J4Ux7ym32.sk5s77z6Q(str);
                if (rG2GI7LDp == null) {
                    StringBuilder q3BipwRCk3 = abGBwSu8x.q3BipwRCk("Fragment ");
                    q3BipwRCk3.append(this.tGV7Q6urW);
                    q3BipwRCk3.append(" declared target fragment ");
                    throw new IllegalStateException(my9FFKbZi.q3BipwRCk(q3BipwRCk3, this.tGV7Q6urW.Eeka1udhb, " that does not belong to this FragmentManager!"));
                }
            } else {
                rG2GI7LDp = null;
            }
        }
        if (rG2GI7LDp != null) {
            rG2GI7LDp.vPSbyrYWX();
        }
        UxHHqhbTP uxHHqhbTP4 = this.tGV7Q6urW;
        fVMSvDhE6 fvmsvdhe6 = uxHHqhbTP4.IytU16YUK;
        uxHHqhbTP4.CpG0imbht = fvmsvdhe6.ilHKhw3Yw;
        uxHHqhbTP4.nlGCs0NZs = fvmsvdhe6.Eeka1udhb;
        this.q3BipwRCk.Puu3Rhg4F(uxHHqhbTP4, false);
        UxHHqhbTP uxHHqhbTP5 = this.tGV7Q6urW;
        Iterator it = uxHHqhbTP5.BL4OzhZBd.iterator();
        if (!it.hasNext()) {
            uxHHqhbTP5.BL4OzhZBd.clear();
            uxHHqhbTP5.qFBXIgpia.J4Ux7ym32(uxHHqhbTP5.CpG0imbht, uxHHqhbTP5.J4Ux7ym32(), uxHHqhbTP5);
            uxHHqhbTP5.CBQ5d1kRq = 0;
            uxHHqhbTP5.QNqj6nIzv = false;
            uxHHqhbTP5.qFBXIgpia(uxHHqhbTP5.CpG0imbht.kmSgne1rO);
            if (uxHHqhbTP5.QNqj6nIzv) {
                fVMSvDhE6 fvmsvdhe62 = uxHHqhbTP5.IytU16YUK;
                Iterator it2 = fvmsvdhe62.PSTqBLTET.iterator();
                while (it2.hasNext()) {
                    ((kID7DUxu0) it2.next()).J4Ux7ym32(fvmsvdhe62, uxHHqhbTP5);
                }
                fVMSvDhE6 fvmsvdhe63 = uxHHqhbTP5.qFBXIgpia;
                fvmsvdhe63.cAwN510t2 = false;
                fvmsvdhe63.IytU16YUK = false;
                fvmsvdhe63.vNtjxmzUM.GPLPRo6go = false;
                fvmsvdhe63.i8XZMQc6Z(0);
                this.q3BipwRCk.tGV7Q6urW(this.tGV7Q6urW, false);
                return;
            }
            throw new Ct9FTk2rW(sESg70qxo.q3BipwRCk("Fragment ", uxHHqhbTP5, " did not call through to super.onAttach()"));
        }
        K6PL0z3I0.q3BipwRCk(it.next());
        throw null;
    }

    public void vPSbyrYWX() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        mhl5lIdbQ mhl5lidbq = mhl5lIdbQ.NONE;
        if (!this.dIocxURUo) {
            try {
                this.dIocxURUo = true;
                while (true) {
                    int dIocxURUo = dIocxURUo();
                    UxHHqhbTP uxHHqhbTP = this.tGV7Q6urW;
                    int i = uxHHqhbTP.CBQ5d1kRq;
                    if (dIocxURUo == i) {
                        if (uxHHqhbTP.QSbMsHU5X) {
                            if (!(uxHHqhbTP.EBQXiIPmm == null || (viewGroup = uxHHqhbTP.igRQEZxnW) == null)) {
                                J3kbcXHdl iiGwOFFnr = J3kbcXHdl.iiGwOFFnr(viewGroup, uxHHqhbTP.MzoOEjc4X().EBQXiIPmm());
                                if (this.tGV7Q6urW.vNtjxmzUM) {
                                    Objects.requireNonNull(iiGwOFFnr);
                                    if (fVMSvDhE6.juJ6pnCpu(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + this.tGV7Q6urW);
                                    }
                                    iiGwOFFnr.q3BipwRCk(aXI58Y1kr.GONE, mhl5lidbq, this);
                                } else {
                                    Objects.requireNonNull(iiGwOFFnr);
                                    if (fVMSvDhE6.juJ6pnCpu(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + this.tGV7Q6urW);
                                    }
                                    iiGwOFFnr.q3BipwRCk(aXI58Y1kr.VISIBLE, mhl5lidbq, this);
                                }
                            }
                            UxHHqhbTP uxHHqhbTP2 = this.tGV7Q6urW;
                            fVMSvDhE6 fvmsvdhe6 = uxHHqhbTP2.IytU16YUK;
                            if (fvmsvdhe6 != null && uxHHqhbTP2.ixWaw2akD && fvmsvdhe6.j22ftfeNI(uxHHqhbTP2)) {
                                fvmsvdhe6.iMyQMM6Qj = true;
                            }
                            this.tGV7Q6urW.QSbMsHU5X = false;
                        }
                        return;
                    } else if (dIocxURUo > i) {
                        switch (i + 1) {
                            case 0:
                                tGV7Q6urW();
                                continue;
                            case 1:
                                kCA6Zs9sL();
                                continue;
                            case 2:
                                oon79WMrY();
                                iiGwOFFnr();
                                continue;
                            case 3:
                                q3BipwRCk();
                                continue;
                            case 4:
                                if (!(uxHHqhbTP.EBQXiIPmm == null || (viewGroup2 = uxHHqhbTP.igRQEZxnW) == null)) {
                                    J3kbcXHdl iiGwOFFnr2 = J3kbcXHdl.iiGwOFFnr(viewGroup2, uxHHqhbTP.MzoOEjc4X().EBQXiIPmm());
                                    aXI58Y1kr J4Ux7ym32 = aXI58Y1kr.J4Ux7ym32(this.tGV7Q6urW.EBQXiIPmm.getVisibility());
                                    Objects.requireNonNull(iiGwOFFnr2);
                                    if (fVMSvDhE6.juJ6pnCpu(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + this.tGV7Q6urW);
                                    }
                                    iiGwOFFnr2.q3BipwRCk(J4Ux7ym32, mhl5lIdbQ.ADDING, this);
                                }
                                this.tGV7Q6urW.CBQ5d1kRq = 4;
                                continue;
                            case 5:
                                MzoOEjc4X();
                                continue;
                            case 6:
                                uxHHqhbTP.CBQ5d1kRq = 6;
                                continue;
                            case 7:
                                Bhmn1KIah();
                                continue;
                            default:
                                continue;
                        }
                    } else {
                        switch (i - 1) {
                            case -1:
                                yWvV4ePLl();
                                continue;
                            case 0:
                                GPLPRo6go();
                                continue;
                            case 1:
                                Puu3Rhg4F();
                                this.tGV7Q6urW.CBQ5d1kRq = 1;
                                continue;
                            case 2:
                                uxHHqhbTP.i8XZMQc6Z = false;
                                uxHHqhbTP.CBQ5d1kRq = 2;
                                continue;
                            case 3:
                                if (fVMSvDhE6.juJ6pnCpu(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.tGV7Q6urW);
                                }
                                UxHHqhbTP uxHHqhbTP3 = this.tGV7Q6urW;
                                if (uxHHqhbTP3.EBQXiIPmm != null && uxHHqhbTP3.Bhmn1KIah == null) {
                                    PSTqBLTET();
                                }
                                UxHHqhbTP uxHHqhbTP4 = this.tGV7Q6urW;
                                if (!(uxHHqhbTP4.EBQXiIPmm == null || (viewGroup3 = uxHHqhbTP4.igRQEZxnW) == null)) {
                                    J3kbcXHdl iiGwOFFnr3 = J3kbcXHdl.iiGwOFFnr(viewGroup3, uxHHqhbTP4.MzoOEjc4X().EBQXiIPmm());
                                    Objects.requireNonNull(iiGwOFFnr3);
                                    if (fVMSvDhE6.juJ6pnCpu(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + this.tGV7Q6urW);
                                    }
                                    iiGwOFFnr3.q3BipwRCk(aXI58Y1kr.REMOVED, mhl5lIdbQ.REMOVING, this);
                                }
                                this.tGV7Q6urW.CBQ5d1kRq = 3;
                                continue;
                            case 4:
                                ilHKhw3Yw();
                                continue;
                            case 5:
                                uxHHqhbTP.CBQ5d1kRq = 5;
                                continue;
                            case 6:
                                CBQ5d1kRq();
                                continue;
                            default:
                                continue;
                        }
                    }
                }
            } finally {
                this.dIocxURUo = false;
            }
        } else if (fVMSvDhE6.juJ6pnCpu(2)) {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Ignoring re-entrant call to moveToExpectedState() for ");
            q3BipwRCk.append(this.tGV7Q6urW);
            Log.v("FragmentManager", q3BipwRCk.toString());
        }
    }

    public void yWvV4ePLl() {
        if (fVMSvDhE6.juJ6pnCpu(3)) {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("movefrom ATTACHED: ");
            q3BipwRCk.append(this.tGV7Q6urW);
            Log.d("FragmentManager", q3BipwRCk.toString());
        }
        UxHHqhbTP uxHHqhbTP = this.tGV7Q6urW;
        uxHHqhbTP.CBQ5d1kRq = -1;
        uxHHqhbTP.QNqj6nIzv = false;
        uxHHqhbTP.NyWTwPF6V();
        if (uxHHqhbTP.QNqj6nIzv) {
            fVMSvDhE6 fvmsvdhe6 = uxHHqhbTP.qFBXIgpia;
            if (!fvmsvdhe6.CpG0imbht) {
                fvmsvdhe6.ilHKhw3Yw();
                uxHHqhbTP.qFBXIgpia = new fVMSvDhE6();
            }
            this.q3BipwRCk.iiGwOFFnr(this.tGV7Q6urW, false);
            UxHHqhbTP uxHHqhbTP2 = this.tGV7Q6urW;
            uxHHqhbTP2.CBQ5d1kRq = -1;
            uxHHqhbTP2.CpG0imbht = null;
            uxHHqhbTP2.nlGCs0NZs = null;
            uxHHqhbTP2.IytU16YUK = null;
            if ((uxHHqhbTP2.sk5s77z6Q && !uxHHqhbTP2.dfpT1j18n()) || ((XDvWW0XDE) this.J4Ux7ym32.PSTqBLTET).tGV7Q6urW(this.tGV7Q6urW)) {
                if (fVMSvDhE6.juJ6pnCpu(3)) {
                    StringBuilder q3BipwRCk2 = abGBwSu8x.q3BipwRCk("initState called for fragment: ");
                    q3BipwRCk2.append(this.tGV7Q6urW);
                    Log.d("FragmentManager", q3BipwRCk2.toString());
                }
                UxHHqhbTP uxHHqhbTP3 = this.tGV7Q6urW;
                Objects.requireNonNull(uxHHqhbTP3);
                uxHHqhbTP3.wIZEdYHUn = new N0a4Shkkl(uxHHqhbTP3);
                uxHHqhbTP3.OpLJtmvFM = new androidx.savedstate.mhl5lIdbQ(uxHHqhbTP3);
                uxHHqhbTP3.MzoOEjc4X = UUID.randomUUID().toString();
                uxHHqhbTP3.ixWaw2akD = false;
                uxHHqhbTP3.sk5s77z6Q = false;
                uxHHqhbTP3.WaUP0CF08 = false;
                uxHHqhbTP3.i8XZMQc6Z = false;
                uxHHqhbTP3.dfpT1j18n = false;
                uxHHqhbTP3.cAwN510t2 = 0;
                uxHHqhbTP3.IytU16YUK = null;
                uxHHqhbTP3.qFBXIgpia = new fVMSvDhE6();
                uxHHqhbTP3.CpG0imbht = null;
                uxHHqhbTP3.AqaWJg0b4 = 0;
                uxHHqhbTP3.mUqPm6GBh = 0;
                uxHHqhbTP3.NyWTwPF6V = null;
                uxHHqhbTP3.vNtjxmzUM = false;
                uxHHqhbTP3.i0Zug1mVk = false;
                return;
            }
            return;
        }
        throw new Ct9FTk2rW(sESg70qxo.q3BipwRCk("Fragment ", uxHHqhbTP, " did not call through to super.onDetach()"));
    }
}
