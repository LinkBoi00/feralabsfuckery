package con;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;
/* loaded from: classes.dex */
public class QTxai6ik5 extends UOv2ZmhQ5 {
    public final BAq5ZKjmp J4Ux7ym32;
    public final BgHiMFrEI q3BipwRCk;

    public QTxai6ik5(BgHiMFrEI bgHiMFrEI, emw2Oo1fE emw2oo1fe) {
        this.q3BipwRCk = bgHiMFrEI;
        String canonicalName = BAq5ZKjmp.class.getCanonicalName();
        if (canonicalName != null) {
            String iMyQMM6Qj = anXlDk6fV.iMyQMM6Qj("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            Object obj = (TuTk89oZt) emw2oo1fe.q3BipwRCk.get(iMyQMM6Qj);
            if (BAq5ZKjmp.class.isInstance(obj)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            } else {
                obj = new BAq5ZKjmp();
                TuTk89oZt tuTk89oZt = (TuTk89oZt) emw2oo1fe.q3BipwRCk.put(iMyQMM6Qj, obj);
                if (tuTk89oZt != null) {
                    tuTk89oZt.q3BipwRCk();
                }
            }
            this.J4Ux7ym32 = (BAq5ZKjmp) obj;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // con.UOv2ZmhQ5
    @Deprecated
    public void q3BipwRCk(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        BAq5ZKjmp bAq5ZKjmp = this.J4Ux7ym32;
        if (bAq5ZKjmp.J4Ux7ym32.Bhmn1KIah > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            aT3qVrmRB at3qvrmrb = bAq5ZKjmp.J4Ux7ym32;
            if (at3qvrmrb.Bhmn1KIah > 0) {
                K6PL0z3I0.q3BipwRCk(at3qvrmrb.kmSgne1rO[0]);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(bAq5ZKjmp.J4Ux7ym32.CBQ5d1kRq[0]);
                printWriter.print(": ");
                throw null;
            }
        }
    }

    public String toString() {
        String str;
        int lastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        BgHiMFrEI bgHiMFrEI = this.q3BipwRCk;
        if (bgHiMFrEI == null) {
            str = "null";
        } else {
            String simpleName = bgHiMFrEI.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = bgHiMFrEI.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            str = Integer.toHexString(System.identityHashCode(bgHiMFrEI));
        }
        sb.append(str);
        sb.append("}}");
        return sb.toString();
    }
}
