package con;

import java.util.ArrayList;
import java.util.List;
@jHNqfwCVd(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = {681}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class j2NZwJrE0 extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ rQamjxEL9 Eeka1udhb;
    public Object MzoOEjc4X;
    public final /* synthetic */ Kh7ffW4RH RG6kpfv3v;
    public final /* synthetic */ NzvP5Rex8 dXrmkklc8;
    public int ilHKhw3Yw;
    public /* synthetic */ Object qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2NZwJrE0(rQamjxEL9 rqamjxel9, NzvP5Rex8 nzvP5Rex8, Kh7ffW4RH kh7ffW4RH, Way959ade way959ade) {
        super(2, way959ade);
        this.Eeka1udhb = rqamjxel9;
        this.dXrmkklc8 = nzvP5Rex8;
        this.RG6kpfv3v = kh7ffW4RH;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        j2NZwJrE0 j2nzwjre0 = new j2NZwJrE0(this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, (Way959ade) obj2);
        j2nzwjre0.qVUwofr5s = (oQkvjGXIr) obj;
        return j2nzwjre0.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        j2NZwJrE0 j2nzwjre0 = new j2NZwJrE0(this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, way959ade);
        j2nzwjre0.qVUwofr5s = obj;
        return j2nzwjre0;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // con.LxklW3zxE
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final Object yWvV4ePLl(Object obj) {
        Throwable th;
        JEWwjBE8f jEWwjBE8f;
        Q2LDBN4BW q2ldbn4bw;
        rQamjxEL9 rqamjxel9;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.ilHKhw3Yw;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            bu5cjmae6 dIocxURUo = ((oQkvjGXIr) this.qVUwofr5s).dIocxURUo();
            int i2 = JEWwjBE8f.GPLPRo6go;
            jEWwjBE8f = (JEWwjBE8f) dIocxURUo.get(y5p19vMdC.CBQ5d1kRq);
            if (jEWwjBE8f != null) {
                rQamjxEL9 rqamjxel92 = this.Eeka1udhb;
                synchronized (rqamjxel92.kCA6Zs9sL) {
                    Throwable th2 = rqamjxel92.GPLPRo6go;
                    if (th2 != null) {
                        throw th2;
                    } else if (((XUuUfkdDV) ((I5LF8ecws) rqamjxel92.kmSgne1rO).Puu3Rhg4F()).compareTo(XUuUfkdDV.ShuttingDown) <= 0) {
                        throw new IllegalStateException("Recomposer shut down".toString());
                    } else if (rqamjxel92.iiGwOFFnr == null) {
                        rqamjxel92.iiGwOFFnr = jEWwjBE8f;
                        rqamjxel92.qVUwofr5s();
                    } else {
                        throw new IllegalStateException("Recomposer already running".toString());
                    }
                }
                MAZDnzQe5 mAZDnzQe5 = new MAZDnzQe5(this.Eeka1udhb);
                PlegqbMSA plegqbMSA = UvOuyIFuT.q3BipwRCk;
                UvOuyIFuT.iiGwOFFnr(JHFXdtjfx.dfpT1j18n);
                synchronized (UvOuyIFuT.J4Ux7ym32) {
                    ((ArrayList) UvOuyIFuT.kCA6Zs9sL).add(mAZDnzQe5);
                }
                WvYaaMLyO wvYaaMLyO = new WvYaaMLyO(mAZDnzQe5);
                rQamjxEL9.PSTqBLTET.q3BipwRCk(this.Eeka1udhb.Bhmn1KIah);
                try {
                    rQamjxEL9 rqamjxel93 = this.Eeka1udhb;
                    synchronized (rqamjxel93.kCA6Zs9sL) {
                        List list = rqamjxel93.Puu3Rhg4F;
                        int i3 = 0;
                        int size = list.size() - 1;
                        if (size >= 0) {
                            while (true) {
                                int i4 = i3 + 1;
                                ((qg6veklqT) ((USS5dphka) list.get(i3))).CBQ5d1kRq();
                                if (i4 > size) {
                                    break;
                                }
                                i3 = i4;
                            }
                        }
                    }
                    y8BpyylDX y8bpyyldx = new y8BpyylDX(this.dXrmkklc8, this.RG6kpfv3v, null);
                    this.qVUwofr5s = jEWwjBE8f;
                    this.MzoOEjc4X = wvYaaMLyO;
                    this.ilHKhw3Yw = 1;
                    if (D3DEikrvb.yWvV4ePLl(y8bpyyldx, this) == kbkjsqcsl) {
                        return kbkjsqcsl;
                    }
                    q2ldbn4bw = wvYaaMLyO;
                } catch (Throwable th3) {
                    th = th3;
                    q2ldbn4bw = wvYaaMLyO;
                    ((WvYaaMLyO) q2ldbn4bw).q3BipwRCk();
                    rqamjxel9 = this.Eeka1udhb;
                    synchronized (rqamjxel9.kCA6Zs9sL) {
                        if (rqamjxel9.iiGwOFFnr == jEWwjBE8f) {
                            rqamjxel9.iiGwOFFnr = null;
                        }
                        rqamjxel9.qVUwofr5s();
                    }
                    rQamjxEL9.PSTqBLTET.kCA6Zs9sL(this.Eeka1udhb.Bhmn1KIah);
                    throw th;
                }
            } else {
                throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("Current context doesn't contain Job in it: ", dIocxURUo).toString());
            }
        } else if (i == 1) {
            q2ldbn4bw = (Q2LDBN4BW) this.MzoOEjc4X;
            jEWwjBE8f = (JEWwjBE8f) this.qVUwofr5s;
            try {
                anXlDk6fV.IytU16YUK(obj);
            } catch (Throwable th4) {
                th = th4;
                ((WvYaaMLyO) q2ldbn4bw).q3BipwRCk();
                rqamjxel9 = this.Eeka1udhb;
                synchronized (rqamjxel9.kCA6Zs9sL) {
                }
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ((WvYaaMLyO) q2ldbn4bw).q3BipwRCk();
        rQamjxEL9 rqamjxel94 = this.Eeka1udhb;
        synchronized (rqamjxel94.kCA6Zs9sL) {
            if (rqamjxel94.iiGwOFFnr == jEWwjBE8f) {
                rqamjxel94.iiGwOFFnr = null;
            }
            rqamjxel94.qVUwofr5s();
        }
        rQamjxEL9.PSTqBLTET.kCA6Zs9sL(this.Eeka1udhb.Bhmn1KIah);
        return qih4lW99W.q3BipwRCk;
    }
}
