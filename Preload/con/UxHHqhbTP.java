package con;

import android.animation.Animator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.mhl5lIdbQ;
import androidx.savedstate.RG2GI7LDp;
import com.feravolt.preload.R;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public abstract class UxHHqhbTP implements ComponentCallbacks, View.OnCreateContextMenuListener, BgHiMFrEI, LiMUeynem, XHpudBVT5 {
    public static final Object DuuXfa7LE = new Object();
    public int AqaWJg0b4;
    public SparseArray Bhmn1KIah;
    public z0NkpHHvU CpG0imbht;
    public View EBQXiIPmm;
    public fVMSvDhE6 IytU16YUK;
    public hZyIatWA3 IzM1cD9ly;
    public float L4EwGfXiQ;
    public String NyWTwPF6V;
    public Bundle PSTqBLTET;
    public boolean QNqj6nIzv;
    public boolean QSbMsHU5X;
    public boolean TyB1UUd72;
    public boolean WaUP0CF08;
    public int cAwN510t2;
    public int dXrmkklc8;
    public boolean dfpT1j18n;
    public boolean i0Zug1mVk;
    public boolean i8XZMQc6Z;
    public boolean iMyQMM6Qj;
    public ViewGroup igRQEZxnW;
    public Bundle ilHKhw3Yw;
    public boolean ixWaw2akD;
    public rwMIknDWL j22ftfeNI;
    public Bundle kmSgne1rO;
    public int mUqPm6GBh;
    public UxHHqhbTP nlGCs0NZs;
    public boolean o4LF8RkoQ;
    public UxHHqhbTP qVUwofr5s;
    public boolean sk5s77z6Q;
    public boolean vNtjxmzUM;
    public boolean zHl31GGXU;
    public int CBQ5d1kRq = -1;
    public String MzoOEjc4X = UUID.randomUUID().toString();
    public String Eeka1udhb = null;
    public Boolean RG6kpfv3v = null;
    public fVMSvDhE6 qFBXIgpia = new fVMSvDhE6();
    public boolean V9LQMKGJe = true;
    public boolean juJ6pnCpu = true;
    public mhl5lIdbQ.EnumC0005mhl5lIdbQ ziwPzaoF3 = mhl5lIdbQ.EnumC0005mhl5lIdbQ.RESUMED;
    public IKCSn2Mz4 n4UIOvAko = new IKCSn2Mz4();
    public final ArrayList BL4OzhZBd = new ArrayList();
    public N0a4Shkkl wIZEdYHUn = new N0a4Shkkl(this);
    public androidx.savedstate.mhl5lIdbQ OpLJtmvFM = new androidx.savedstate.mhl5lIdbQ(this);

    public UxHHqhbTP() {
        new AtomicInteger();
    }

    public View AqaWJg0b4(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void BL4OzhZBd(Bundle bundle) {
        fVMSvDhE6 fvmsvdhe6 = this.IytU16YUK;
        if (fvmsvdhe6 != null) {
            if (fvmsvdhe6 == null ? false : fvmsvdhe6.zHl31GGXU()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.ilHKhw3Yw = bundle;
    }

    public void Bhmn1KIah() {
        rwMIknDWL rwmikndwl = this.j22ftfeNI;
        if (rwmikndwl != null) {
            Objects.requireNonNull(rwmikndwl);
        }
    }

    public int CBQ5d1kRq() {
        rwMIknDWL rwmikndwl = this.j22ftfeNI;
        if (rwmikndwl == null) {
            return 0;
        }
        return rwmikndwl.kCA6Zs9sL;
    }

    @Deprecated
    public void CpG0imbht(int i, int i2, Intent intent) {
        if (fVMSvDhE6.juJ6pnCpu(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void DuuXfa7LE(View view) {
        tGV7Q6urW().PSTqBLTET = null;
    }

    public boolean EBQXiIPmm(Menu menu, MenuInflater menuInflater) {
        if (!this.vNtjxmzUM) {
            return false | this.qFBXIgpia.MzoOEjc4X(menu, menuInflater);
        }
        return false;
    }

    public int Eeka1udhb() {
        rwMIknDWL rwmikndwl = this.j22ftfeNI;
        if (rwmikndwl == null) {
            return 0;
        }
        return rwmikndwl.GPLPRo6go;
    }

    @Override // con.BgHiMFrEI
    public mhl5lIdbQ GPLPRo6go() {
        return this.wIZEdYHUn;
    }

    public final boolean IytU16YUK() {
        UxHHqhbTP uxHHqhbTP = this.nlGCs0NZs;
        return uxHHqhbTP != null && (uxHHqhbTP.sk5s77z6Q || uxHHqhbTP.IytU16YUK());
    }

    public void IzM1cD9ly(View view) {
        tGV7Q6urW().q3BipwRCk = view;
    }

    public BKr8aejj7 J4Ux7ym32() {
        return new yGccES7sx(this);
    }

    public void L4EwGfXiQ(boolean z) {
        this.qFBXIgpia.sk5s77z6Q(z);
    }

    public final fVMSvDhE6 MzoOEjc4X() {
        fVMSvDhE6 fvmsvdhe6 = this.IytU16YUK;
        if (fvmsvdhe6 != null) {
            return fvmsvdhe6;
        }
        throw new IllegalStateException(sESg70qxo.q3BipwRCk("Fragment ", this, " not associated with a fragment manager."));
    }

    public void NyWTwPF6V() {
        this.QNqj6nIzv = true;
    }

    public void OpLJtmvFM(Animator animator) {
        tGV7Q6urW().J4Ux7ym32 = animator;
    }

    public final int PSTqBLTET() {
        mhl5lIdbQ.EnumC0005mhl5lIdbQ mhl5lidbq = this.ziwPzaoF3;
        return (mhl5lidbq == mhl5lIdbQ.EnumC0005mhl5lIdbQ.INITIALIZED || this.nlGCs0NZs == null) ? mhl5lidbq.ordinal() : Math.min(mhl5lidbq.ordinal(), this.nlGCs0NZs.PSTqBLTET());
    }

    public Context Puu3Rhg4F() {
        z0NkpHHvU z0nkphhvu = this.CpG0imbht;
        if (z0nkphhvu == null) {
            return null;
        }
        return z0nkphhvu.kmSgne1rO;
    }

    public void QNqj6nIzv() {
        this.QNqj6nIzv = true;
    }

    public void QSbMsHU5X(boolean z) {
        this.qFBXIgpia.Eeka1udhb(z);
    }

    public final Resources RG6kpfv3v() {
        return ziwPzaoF3().getResources();
    }

    public void TyB1UUd72(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.qFBXIgpia.IzM1cD9ly();
        boolean z = true;
        this.iMyQMM6Qj = true;
        this.IzM1cD9ly = new hZyIatWA3(this, kCA6Zs9sL());
        View AqaWJg0b4 = AqaWJg0b4(layoutInflater, viewGroup, bundle);
        this.EBQXiIPmm = AqaWJg0b4;
        if (AqaWJg0b4 != null) {
            this.IzM1cD9ly.tGV7Q6urW();
            this.EBQXiIPmm.setTag(R.id.view_tree_lifecycle_owner, this.IzM1cD9ly);
            this.EBQXiIPmm.setTag(R.id.view_tree_view_model_store_owner, this.IzM1cD9ly);
            this.EBQXiIPmm.setTag(R.id.view_tree_saved_state_registry_owner, this.IzM1cD9ly);
            this.n4UIOvAko.iiGwOFFnr(this.IzM1cD9ly);
            return;
        }
        if (this.IzM1cD9ly.kmSgne1rO == null) {
            z = false;
        }
        if (!z) {
            this.IzM1cD9ly = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public void V9LQMKGJe() {
        this.QNqj6nIzv = true;
    }

    public Object WaUP0CF08() {
        rwMIknDWL rwmikndwl = this.j22ftfeNI;
        if (rwmikndwl == null) {
            return null;
        }
        Object obj = rwmikndwl.kmSgne1rO;
        if (obj != DuuXfa7LE) {
            return obj;
        }
        sk5s77z6Q();
        return null;
    }

    public void XYT7vJqNO(boolean z) {
        tGV7Q6urW().MzoOEjc4X = z;
    }

    public boolean cAwN510t2() {
        return false;
    }

    public View dIocxURUo() {
        rwMIknDWL rwmikndwl = this.j22ftfeNI;
        if (rwmikndwl == null) {
            return null;
        }
        return rwmikndwl.q3BipwRCk;
    }

    public Object dXrmkklc8() {
        rwMIknDWL rwmikndwl = this.j22ftfeNI;
        if (rwmikndwl == null) {
            return null;
        }
        Object obj = rwmikndwl.CBQ5d1kRq;
        if (obj != DuuXfa7LE) {
            return obj;
        }
        kmSgne1rO();
        return null;
    }

    public final boolean dfpT1j18n() {
        return this.cAwN510t2 > 0;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return super.hashCode();
    }

    public void i0Zug1mVk(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.QNqj6nIzv = true;
        z0NkpHHvU z0nkphhvu = this.CpG0imbht;
        if ((z0nkphhvu == null ? null : z0nkphhvu.CBQ5d1kRq) != null) {
            this.QNqj6nIzv = false;
            this.QNqj6nIzv = true;
        }
    }

    public final String i8XZMQc6Z(int i) {
        return RG6kpfv3v().getString(i);
    }

    public final boolean iMyQMM6Qj() {
        fVMSvDhE6 fvmsvdhe6;
        return this.V9LQMKGJe && ((fvmsvdhe6 = this.IytU16YUK) == null || fvmsvdhe6.QSbMsHU5X(this.nlGCs0NZs));
    }

    public void igRQEZxnW(Bundle bundle) {
        this.QNqj6nIzv = true;
    }

    public final fVMSvDhE6 iiGwOFFnr() {
        if (this.CpG0imbht != null) {
            return this.qFBXIgpia;
        }
        throw new IllegalStateException(sESg70qxo.q3BipwRCk("Fragment ", this, " has not been attached yet."));
    }

    public boolean ilHKhw3Yw() {
        rwMIknDWL rwmikndwl = this.j22ftfeNI;
        if (rwmikndwl == null) {
            return false;
        }
        return rwmikndwl.tGV7Q6urW;
    }

    public Object ixWaw2akD() {
        rwMIknDWL rwmikndwl = this.j22ftfeNI;
        if (rwmikndwl == null) {
            return null;
        }
        Object obj = rwmikndwl.vPSbyrYWX;
        if (obj != DuuXfa7LE) {
            return obj;
        }
        oon79WMrY();
        return null;
    }

    public void j22ftfeNI() {
        onLowMemory();
        this.qFBXIgpia.qVUwofr5s();
    }

    public void juJ6pnCpu() {
        this.qFBXIgpia.i8XZMQc6Z(1);
        if (this.EBQXiIPmm != null) {
            hZyIatWA3 hzyiatwa3 = this.IzM1cD9ly;
            hzyiatwa3.tGV7Q6urW();
            if (hzyiatwa3.kmSgne1rO.tGV7Q6urW.compareTo(mhl5lIdbQ.EnumC0005mhl5lIdbQ.CREATED) >= 0) {
                this.IzM1cD9ly.J4Ux7ym32(mhl5lIdbQ.RG2GI7LDp.ON_DESTROY);
            }
        }
        this.CBQ5d1kRq = 1;
        this.QNqj6nIzv = false;
        mUqPm6GBh();
        if (this.QNqj6nIzv) {
            BAq5ZKjmp bAq5ZKjmp = ((QTxai6ik5) UOv2ZmhQ5.J4Ux7ym32(this)).J4Ux7ym32;
            if (bAq5ZKjmp.J4Ux7ym32.Puu3Rhg4F() <= 0) {
                this.iMyQMM6Qj = false;
            } else {
                K6PL0z3I0.q3BipwRCk(bAq5ZKjmp.J4Ux7ym32.yWvV4ePLl(0));
                throw null;
            }
        } else {
            throw new Ct9FTk2rW(sESg70qxo.q3BipwRCk("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
    }

    @Override // con.LiMUeynem
    public emw2Oo1fE kCA6Zs9sL() {
        if (this.IytU16YUK == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (PSTqBLTET() != 1) {
            XDvWW0XDE xDvWW0XDE = this.IytU16YUK.vNtjxmzUM;
            emw2Oo1fE emw2oo1fe = (emw2Oo1fE) xDvWW0XDE.dIocxURUo.get(this.MzoOEjc4X);
            if (emw2oo1fe != null) {
                return emw2oo1fe;
            }
            emw2Oo1fE emw2oo1fe2 = new emw2Oo1fE();
            xDvWW0XDE.dIocxURUo.put(this.MzoOEjc4X, emw2oo1fe2);
            return emw2oo1fe2;
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public void kktL0P5MG(boolean z) {
        if (this.j22ftfeNI != null) {
            tGV7Q6urW().tGV7Q6urW = z;
        }
    }

    public Object kmSgne1rO() {
        rwMIknDWL rwmikndwl = this.j22ftfeNI;
        if (rwmikndwl == null) {
            return null;
        }
        Objects.requireNonNull(rwmikndwl);
        return null;
    }

    public void mUqPm6GBh() {
        this.QNqj6nIzv = true;
    }

    public void n4UIOvAko(int i, int i2, int i3, int i4) {
        if (this.j22ftfeNI != null || i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            tGV7Q6urW().dIocxURUo = i;
            tGV7Q6urW().kCA6Zs9sL = i2;
            tGV7Q6urW().iiGwOFFnr = i3;
            tGV7Q6urW().GPLPRo6go = i4;
        }
    }

    public void nlGCs0NZs(Bundle bundle) {
        Parcelable parcelable;
        boolean z = true;
        this.QNqj6nIzv = true;
        if (!(bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null)) {
            this.qFBXIgpia.kktL0P5MG(parcelable);
            this.qFBXIgpia.PSTqBLTET();
        }
        fVMSvDhE6 fvmsvdhe6 = this.qFBXIgpia;
        if (fvmsvdhe6.MzoOEjc4X < 1) {
            z = false;
        }
        if (!z) {
            fvmsvdhe6.PSTqBLTET();
        }
    }

    public abstract void o4LF8RkoQ(Bundle bundle);

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.QNqj6nIzv = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        XticXNngr xticXNngr;
        z0NkpHHvU z0nkphhvu = this.CpG0imbht;
        if (z0nkphhvu == null) {
            xticXNngr = null;
        } else {
            xticXNngr = (XticXNngr) z0nkphhvu.CBQ5d1kRq;
        }
        if (xticXNngr != null) {
            xticXNngr.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException(sESg70qxo.q3BipwRCk("Fragment ", this, " not attached to an activity."));
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.QNqj6nIzv = true;
    }

    public Object oon79WMrY() {
        rwMIknDWL rwmikndwl = this.j22ftfeNI;
        if (rwmikndwl == null) {
            return null;
        }
        Objects.requireNonNull(rwmikndwl);
        return null;
    }

    @Override // con.XHpudBVT5
    public final RG2GI7LDp q3BipwRCk() {
        return this.OpLJtmvFM.J4Ux7ym32;
    }

    public void qFBXIgpia(Context context) {
        this.QNqj6nIzv = true;
        z0NkpHHvU z0nkphhvu = this.CpG0imbht;
        if ((z0nkphhvu == null ? null : z0nkphhvu.CBQ5d1kRq) != null) {
            this.QNqj6nIzv = false;
            this.QNqj6nIzv = true;
        }
    }

    public int qVUwofr5s() {
        rwMIknDWL rwmikndwl = this.j22ftfeNI;
        if (rwmikndwl == null) {
            return 0;
        }
        return rwmikndwl.iiGwOFFnr;
    }

    public Object sk5s77z6Q() {
        rwMIknDWL rwmikndwl = this.j22ftfeNI;
        if (rwmikndwl == null) {
            return null;
        }
        Objects.requireNonNull(rwmikndwl);
        return null;
    }

    public final rwMIknDWL tGV7Q6urW() {
        if (this.j22ftfeNI == null) {
            this.j22ftfeNI = new rwMIknDWL();
        }
        return this.j22ftfeNI;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.MzoOEjc4X);
        if (this.AqaWJg0b4 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.AqaWJg0b4));
        }
        if (this.NyWTwPF6V != null) {
            sb.append(" tag=");
            sb.append(this.NyWTwPF6V);
        }
        sb.append(")");
        return sb.toString();
    }

    public LayoutInflater vNtjxmzUM(Bundle bundle) {
        z0NkpHHvU z0nkphhvu = this.CpG0imbht;
        if (z0nkphhvu != null) {
            LayoutInflater cloneInContext = z0nkphhvu.MzoOEjc4X.getLayoutInflater().cloneInContext(z0nkphhvu.MzoOEjc4X);
            cloneInContext.setFactory2(this.qFBXIgpia.iiGwOFFnr);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void vPSbyrYWX() {
        rwMIknDWL rwmikndwl = this.j22ftfeNI;
        if (rwmikndwl != null) {
            Objects.requireNonNull(rwmikndwl);
        }
    }

    public final View wIZEdYHUn() {
        View view = this.EBQXiIPmm;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(sESg70qxo.q3BipwRCk("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public int yWvV4ePLl() {
        rwMIknDWL rwmikndwl = this.j22ftfeNI;
        if (rwmikndwl == null) {
            return 0;
        }
        return rwmikndwl.dIocxURUo;
    }

    public boolean zHl31GGXU(Menu menu) {
        if (!this.vNtjxmzUM) {
            return false | this.qFBXIgpia.WaUP0CF08(menu);
        }
        return false;
    }

    public final Context ziwPzaoF3() {
        Context Puu3Rhg4F = Puu3Rhg4F();
        if (Puu3Rhg4F != null) {
            return Puu3Rhg4F;
        }
        throw new IllegalStateException(sESg70qxo.q3BipwRCk("Fragment ", this, " not attached to a context."));
    }
}
