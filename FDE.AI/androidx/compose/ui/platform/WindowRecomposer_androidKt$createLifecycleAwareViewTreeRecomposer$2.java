package androidx.compose.ui.platform;

import androidx.lifecycle.mhl5lIdbQ;
import con.BgHiMFrEI;
import con.Lkusa3sxO;
import con.WGohiwKSS;
import con.Way959ade;
import con.anXlDk6fV;
import con.dnd1L2J2K;
import con.gknx5HUb7;
import con.idpM54xlp;
import con.j2NZwJrE0;
import con.jHNqfwCVd;
import con.kBKJSqCSL;
import con.kkcQgCx5G;
import con.oQkvjGXIr;
import con.qih4lW99W;
import con.rQamjxEL9;
import con.xpuSUT7Gh;
import con.zo6TlNWDT;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2 implements WGohiwKSS {
    public final /* synthetic */ rQamjxEL9 Bhmn1KIah;
    public final /* synthetic */ oQkvjGXIr CBQ5d1kRq;
    public final /* synthetic */ Lkusa3sxO kmSgne1rO;

    /* loaded from: classes.dex */
    public /* synthetic */ class RG2GI7LDp {
        public static final /* synthetic */ int[] q3BipwRCk;

        static {
            int[] iArr = new int[mhl5lIdbQ.RG2GI7LDp.values().length];
            iArr[mhl5lIdbQ.RG2GI7LDp.ON_CREATE.ordinal()] = 1;
            iArr[mhl5lIdbQ.RG2GI7LDp.ON_START.ordinal()] = 2;
            iArr[mhl5lIdbQ.RG2GI7LDp.ON_STOP.ordinal()] = 3;
            iArr[mhl5lIdbQ.RG2GI7LDp.ON_DESTROY.ordinal()] = 4;
            q3BipwRCk = iArr;
        }
    }

    @jHNqfwCVd(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {271}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class mhl5lIdbQ extends dnd1L2J2K implements kkcQgCx5G {
        public final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2 Eeka1udhb;
        public int MzoOEjc4X;
        public final /* synthetic */ rQamjxEL9 ilHKhw3Yw;
        public final /* synthetic */ BgHiMFrEI qVUwofr5s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public mhl5lIdbQ(rQamjxEL9 rqamjxel9, BgHiMFrEI bgHiMFrEI, WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2, Way959ade way959ade) {
            super(2, way959ade);
            this.ilHKhw3Yw = rqamjxel9;
            this.qVUwofr5s = bgHiMFrEI;
            this.Eeka1udhb = windowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2;
        }

        @Override // con.kkcQgCx5G
        public Object WaUP0CF08(Object obj, Object obj2) {
            oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
            return new mhl5lIdbQ(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
        }

        @Override // con.LxklW3zxE
        public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
            return new mhl5lIdbQ(this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, way959ade);
        }

        /* JADX WARN: Finally extract failed */
        @Override // con.LxklW3zxE
        public final Object yWvV4ePLl(Object obj) {
            Object obj2 = kBKJSqCSL.COROUTINE_SUSPENDED;
            int i = this.MzoOEjc4X;
            try {
                if (i == 0) {
                    anXlDk6fV.IytU16YUK(obj);
                    rQamjxEL9 rqamjxel9 = this.ilHKhw3Yw;
                    this.MzoOEjc4X = 1;
                    Objects.requireNonNull(rqamjxel9);
                    Object qFBXIgpia = idpM54xlp.qFBXIgpia(rqamjxel9.J4Ux7ym32, new j2NZwJrE0(rqamjxel9, new zo6TlNWDT(rqamjxel9, null), xpuSUT7Gh.juJ6pnCpu(kCA6Zs9sL()), null), this);
                    if (qFBXIgpia != obj2) {
                        qFBXIgpia = qih4lW99W.q3BipwRCk;
                    }
                    if (qFBXIgpia != obj2) {
                        qFBXIgpia = qih4lW99W.q3BipwRCk;
                    }
                    if (qFBXIgpia == obj2) {
                        return obj2;
                    }
                } else if (i == 1) {
                    anXlDk6fV.IytU16YUK(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.qVUwofr5s.GPLPRo6go().J4Ux7ym32(this.Eeka1udhb);
                return qih4lW99W.q3BipwRCk;
            } catch (Throwable th) {
                this.qVUwofr5s.GPLPRo6go().J4Ux7ym32(this.Eeka1udhb);
                throw th;
            }
        }
    }

    public WindowRecomposer_androidKt$createLifecycleAwareViewTreeRecomposer$2(oQkvjGXIr oqkvjgxir, Lkusa3sxO lkusa3sxO, rQamjxEL9 rqamjxel9) {
        this.CBQ5d1kRq = oqkvjgxir;
        this.kmSgne1rO = lkusa3sxO;
        this.Bhmn1KIah = rqamjxel9;
    }

    @Override // con.WGohiwKSS
    public void tGV7Q6urW(BgHiMFrEI bgHiMFrEI, mhl5lIdbQ.RG2GI7LDp rG2GI7LDp) {
        boolean z;
        int i = RG2GI7LDp.q3BipwRCk[rG2GI7LDp.ordinal()];
        if (i != 1) {
            int i2 = 0;
            if (i == 2) {
                Lkusa3sxO lkusa3sxO = this.kmSgne1rO;
                if (lkusa3sxO != null) {
                    gknx5HUb7 gknx5hub7 = lkusa3sxO.kmSgne1rO;
                    synchronized (gknx5hub7.J4Ux7ym32) {
                        synchronized (gknx5hub7.J4Ux7ym32) {
                            z = gknx5hub7.kCA6Zs9sL;
                        }
                        if (!z) {
                            List list = (List) gknx5hub7.tGV7Q6urW;
                            gknx5hub7.tGV7Q6urW = (List) gknx5hub7.dIocxURUo;
                            gknx5hub7.dIocxURUo = list;
                            gknx5hub7.kCA6Zs9sL = true;
                            int size = list.size();
                            if (size > 0) {
                                while (true) {
                                    int i3 = i2 + 1;
                                    ((Way959ade) list.get(i2)).Bhmn1KIah(qih4lW99W.q3BipwRCk);
                                    if (i3 >= size) {
                                        break;
                                    }
                                    i2 = i3;
                                }
                            }
                            list.clear();
                        }
                    }
                }
            } else if (i == 3) {
                Lkusa3sxO lkusa3sxO2 = this.kmSgne1rO;
                if (lkusa3sxO2 != null) {
                    gknx5HUb7 gknx5hub72 = lkusa3sxO2.kmSgne1rO;
                    synchronized (gknx5hub72.J4Ux7ym32) {
                        gknx5hub72.kCA6Zs9sL = false;
                    }
                }
            } else if (i == 4) {
                this.Bhmn1KIah.ilHKhw3Yw();
            }
        } else {
            idpM54xlp.RG6kpfv3v(this.CBQ5d1kRq, null, 4, new mhl5lIdbQ(this.Bhmn1KIah, bgHiMFrEI, this, null), 1, null);
        }
    }
}
