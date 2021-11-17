package con;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class XDvWW0XDE extends TuTk89oZt {
    public static final L9RuSJz5i Puu3Rhg4F = new rstHZ5Gu8(1);
    public final boolean kCA6Zs9sL;
    public final HashMap J4Ux7ym32 = new HashMap();
    public final HashMap tGV7Q6urW = new HashMap();
    public final HashMap dIocxURUo = new HashMap();
    public boolean iiGwOFFnr = false;
    public boolean GPLPRo6go = false;

    public XDvWW0XDE(boolean z) {
        this.kCA6Zs9sL = z;
    }

    public void J4Ux7ym32(UxHHqhbTP uxHHqhbTP) {
        if (!this.GPLPRo6go) {
            if ((this.J4Ux7ym32.remove(uxHHqhbTP.MzoOEjc4X) != null) && fVMSvDhE6.juJ6pnCpu(2)) {
                Dt6xXPjII.q3BipwRCk("Updating retained Fragments: Removed ", uxHHqhbTP, "FragmentManager");
            }
        } else if (fVMSvDhE6.juJ6pnCpu(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || XDvWW0XDE.class != obj.getClass()) {
            return false;
        }
        XDvWW0XDE xDvWW0XDE = (XDvWW0XDE) obj;
        return this.J4Ux7ym32.equals(xDvWW0XDE.J4Ux7ym32) && this.tGV7Q6urW.equals(xDvWW0XDE.tGV7Q6urW) && this.dIocxURUo.equals(xDvWW0XDE.dIocxURUo);
    }

    public int hashCode() {
        int hashCode = this.tGV7Q6urW.hashCode();
        return this.dIocxURUo.hashCode() + ((hashCode + (this.J4Ux7ym32.hashCode() * 31)) * 31);
    }

    @Override // con.TuTk89oZt
    public void q3BipwRCk() {
        if (fVMSvDhE6.juJ6pnCpu(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.iiGwOFFnr = true;
    }

    public boolean tGV7Q6urW(UxHHqhbTP uxHHqhbTP) {
        if (this.J4Ux7ym32.containsKey(uxHHqhbTP.MzoOEjc4X) && this.kCA6Zs9sL) {
            return this.iiGwOFFnr;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.J4Ux7ym32.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.tGV7Q6urW.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.dIocxURUo.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
