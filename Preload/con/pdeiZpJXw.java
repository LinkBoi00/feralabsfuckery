package con;

import java.util.concurrent.CancellationException;
@jHNqfwCVd(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = {291}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class pdeiZpJXw extends dnd1L2J2K implements PmanMZxiM {
    public final /* synthetic */ IxbokG044 Eeka1udhb;
    public Object MzoOEjc4X;
    public final /* synthetic */ eSSARtQU6 RG6kpfv3v;
    public final /* synthetic */ Object dXrmkklc8;
    public Object ilHKhw3Yw;
    public final /* synthetic */ long ixWaw2akD;
    public int qVUwofr5s;
    public final /* synthetic */ PmanMZxiM sk5s77z6Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdeiZpJXw(IxbokG044 ixbokG044, Object obj, eSSARtQU6 essartqu6, long j, PmanMZxiM pmanMZxiM, Way959ade way959ade) {
        super(1, way959ade);
        this.Eeka1udhb = ixbokG044;
        this.dXrmkklc8 = obj;
        this.RG6kpfv3v = essartqu6;
        this.ixWaw2akD = j;
        this.sk5s77z6Q = pmanMZxiM;
    }

    @Override // con.PmanMZxiM
    public Object IytU16YUK(Object obj) {
        return new pdeiZpJXw(this.Eeka1udhb, this.dXrmkklc8, this.RG6kpfv3v, this.ixWaw2akD, this.sk5s77z6Q, (Way959ade) obj).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        rJ2CWKUxs rj2cwkuxs;
        JKe64ATmr jKe64ATmr;
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.qVUwofr5s;
        int i2 = 1;
        try {
            if (i == 0) {
                anXlDk6fV.IytU16YUK(obj);
                IxbokG044 ixbokG044 = this.Eeka1udhb;
                ixbokG044.tGV7Q6urW.Bhmn1KIah = (jOCYbBWA4) ixbokG044.q3BipwRCk.q3BipwRCk.IytU16YUK(this.dXrmkklc8);
                IxbokG044 ixbokG0442 = this.Eeka1udhb;
                ((prCJwNx2x) ixbokG0442.kCA6Zs9sL).CBQ5d1kRq(this.RG6kpfv3v.kCA6Zs9sL());
                ((prCJwNx2x) this.Eeka1udhb.dIocxURUo).CBQ5d1kRq(Boolean.TRUE);
                rJ2CWKUxs rj2cwkuxs2 = this.Eeka1udhb.tGV7Q6urW;
                rJ2CWKUxs rj2cwkuxs3 = new rJ2CWKUxs(rj2cwkuxs2.CBQ5d1kRq, rj2cwkuxs2.getValue(), syekKyXqd.iiGwOFFnr(rj2cwkuxs2.Bhmn1KIah), rj2cwkuxs2.PSTqBLTET, Long.MIN_VALUE, rj2cwkuxs2.ilHKhw3Yw);
                JKe64ATmr jKe64ATmr2 = new JKe64ATmr();
                eSSARtQU6 essartqu6 = this.RG6kpfv3v;
                long j = this.ixWaw2akD;
                ICC2zzYGi iCC2zzYGi = new ICC2zzYGi(this.Eeka1udhb, rj2cwkuxs3, this.sk5s77z6Q, jKe64ATmr2);
                this.MzoOEjc4X = rj2cwkuxs3;
                this.ilHKhw3Yw = jKe64ATmr2;
                this.qVUwofr5s = 1;
                if (cqKak5Wfn.q3BipwRCk(rj2cwkuxs3, essartqu6, j, iCC2zzYGi, this) == kbkjsqcsl) {
                    return kbkjsqcsl;
                }
                jKe64ATmr = jKe64ATmr2;
                rj2cwkuxs = rj2cwkuxs3;
            } else if (i == 1) {
                jKe64ATmr = (JKe64ATmr) this.ilHKhw3Yw;
                rj2cwkuxs = (rJ2CWKUxs) this.MzoOEjc4X;
                anXlDk6fV.IytU16YUK(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (!jKe64ATmr.CBQ5d1kRq) {
                i2 = 2;
            }
            IxbokG044.J4Ux7ym32(this.Eeka1udhb);
            return new Kp2rb7nfh(rj2cwkuxs, i2);
        } catch (CancellationException e) {
            IxbokG044.J4Ux7ym32(this.Eeka1udhb);
            throw e;
        }
    }
}
