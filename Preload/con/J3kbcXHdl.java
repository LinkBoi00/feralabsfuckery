package con;

import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.RG2GI7LDp;
import androidx.fragment.app.aXI58Y1kr;
import androidx.fragment.app.mhl5lIdbQ;
import com.feravolt.preload.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class J3kbcXHdl {
    public final ViewGroup q3BipwRCk;
    public final ArrayList J4Ux7ym32 = new ArrayList();
    public final ArrayList tGV7Q6urW = new ArrayList();
    public boolean dIocxURUo = false;
    public boolean kCA6Zs9sL = false;

    public J3kbcXHdl(ViewGroup viewGroup) {
        this.q3BipwRCk = viewGroup;
    }

    public static J3kbcXHdl GPLPRo6go(ViewGroup viewGroup, fVMSvDhE6 fvmsvdhe6) {
        return iiGwOFFnr(viewGroup, fvmsvdhe6.EBQXiIPmm());
    }

    public static J3kbcXHdl iiGwOFFnr(ViewGroup viewGroup, uRyiqsiNk uryiqsink) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof J3kbcXHdl) {
            return (J3kbcXHdl) tag;
        }
        Objects.requireNonNull(uryiqsink);
        t5E8jan4S t5e8jan4s = new t5E8jan4S(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, t5e8jan4s);
        return t5e8jan4s;
    }

    public abstract void J4Ux7ym32(List list, boolean z);

    public void Puu3Rhg4F() {
        synchronized (this.J4Ux7ym32) {
            yWvV4ePLl();
            this.kCA6Zs9sL = false;
            int size = this.J4Ux7ym32.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                zXvxcN9Gl zxvxcn9gl = (zXvxcN9Gl) this.J4Ux7ym32.get(size);
                aXI58Y1kr tGV7Q6urW = aXI58Y1kr.tGV7Q6urW(zxvxcn9gl.tGV7Q6urW.EBQXiIPmm);
                aXI58Y1kr axi58y1kr = zxvxcn9gl.q3BipwRCk;
                aXI58Y1kr axi58y1kr2 = aXI58Y1kr.VISIBLE;
                if (axi58y1kr == axi58y1kr2 && tGV7Q6urW != axi58y1kr2) {
                    this.kCA6Zs9sL = zxvxcn9gl.tGV7Q6urW.cAwN510t2();
                    break;
                }
                size--;
            }
        }
    }

    public final zXvxcN9Gl dIocxURUo(UxHHqhbTP uxHHqhbTP) {
        Iterator it = this.J4Ux7ym32.iterator();
        while (it.hasNext()) {
            zXvxcN9Gl zxvxcn9gl = (zXvxcN9Gl) it.next();
            if (zxvxcn9gl.tGV7Q6urW.equals(uxHHqhbTP) && !zxvxcn9gl.iiGwOFFnr) {
                return zxvxcn9gl;
            }
        }
        return null;
    }

    public void kCA6Zs9sL() {
        String str;
        String str2;
        ViewGroup viewGroup = this.q3BipwRCk;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        boolean J4Ux7ym32 = mN6fklC4R.J4Ux7ym32(viewGroup);
        synchronized (this.J4Ux7ym32) {
            yWvV4ePLl();
            Iterator it = this.J4Ux7ym32.iterator();
            while (it.hasNext()) {
                ((zXvxcN9Gl) it.next()).dIocxURUo();
            }
            Iterator it2 = new ArrayList(this.tGV7Q6urW).iterator();
            while (it2.hasNext()) {
                zXvxcN9Gl zxvxcn9gl = (zXvxcN9Gl) it2.next();
                if (fVMSvDhE6.juJ6pnCpu(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (J4Ux7ym32) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.q3BipwRCk + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(zxvxcn9gl);
                    Log.v("FragmentManager", sb.toString());
                }
                zxvxcn9gl.q3BipwRCk();
            }
            Iterator it3 = new ArrayList(this.J4Ux7ym32).iterator();
            while (it3.hasNext()) {
                zXvxcN9Gl zxvxcn9gl2 = (zXvxcN9Gl) it3.next();
                if (fVMSvDhE6.juJ6pnCpu(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (J4Ux7ym32) {
                        str = "";
                    } else {
                        str = "Container " + this.q3BipwRCk + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(zxvxcn9gl2);
                    Log.v("FragmentManager", sb2.toString());
                }
                zxvxcn9gl2.q3BipwRCk();
            }
        }
    }

    public final void q3BipwRCk(aXI58Y1kr axi58y1kr, mhl5lIdbQ mhl5lidbq, RG2GI7LDp rG2GI7LDp) {
        synchronized (this.J4Ux7ym32) {
            ce8tBZHr1 ce8tbzhr1 = new ce8tBZHr1();
            zXvxcN9Gl dIocxURUo = dIocxURUo(rG2GI7LDp.tGV7Q6urW);
            if (dIocxURUo != null) {
                dIocxURUo.tGV7Q6urW(axi58y1kr, mhl5lidbq);
                return;
            }
            zXvxcN9Gl zxvxcn9gl = new zXvxcN9Gl(axi58y1kr, mhl5lidbq, rG2GI7LDp, ce8tbzhr1);
            this.J4Ux7ym32.add(zxvxcn9gl);
            zxvxcn9gl.dIocxURUo.add(new aQYuuNulZ(this, zxvxcn9gl, 0));
            zxvxcn9gl.dIocxURUo.add(new aQYuuNulZ(this, zxvxcn9gl, 1));
        }
    }

    public void tGV7Q6urW() {
        if (!this.kCA6Zs9sL) {
            ViewGroup viewGroup = this.q3BipwRCk;
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            if (!mN6fklC4R.J4Ux7ym32(viewGroup)) {
                kCA6Zs9sL();
                this.dIocxURUo = false;
                return;
            }
            synchronized (this.J4Ux7ym32) {
                if (!this.J4Ux7ym32.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.tGV7Q6urW);
                    this.tGV7Q6urW.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        zXvxcN9Gl zxvxcn9gl = (zXvxcN9Gl) it.next();
                        if (fVMSvDhE6.juJ6pnCpu(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + zxvxcn9gl);
                        }
                        zxvxcn9gl.q3BipwRCk();
                        if (!zxvxcn9gl.GPLPRo6go) {
                            this.tGV7Q6urW.add(zxvxcn9gl);
                        }
                    }
                    yWvV4ePLl();
                    ArrayList arrayList2 = new ArrayList(this.J4Ux7ym32);
                    this.J4Ux7ym32.clear();
                    this.tGV7Q6urW.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((zXvxcN9Gl) it2.next()).dIocxURUo();
                    }
                    J4Ux7ym32(arrayList2, this.dIocxURUo);
                    this.dIocxURUo = false;
                }
            }
        }
    }

    public final void yWvV4ePLl() {
        Iterator it = this.J4Ux7ym32.iterator();
        while (it.hasNext()) {
            zXvxcN9Gl zxvxcn9gl = (zXvxcN9Gl) it.next();
            if (zxvxcn9gl.J4Ux7ym32 == mhl5lIdbQ.ADDING) {
                zxvxcn9gl.tGV7Q6urW(aXI58Y1kr.J4Ux7ym32(zxvxcn9gl.tGV7Q6urW.wIZEdYHUn().getVisibility()), mhl5lIdbQ.NONE);
            }
        }
    }
}
