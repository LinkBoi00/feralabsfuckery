package con;

import kotlinx.serialization.json.JsonElement;
@jHNqfwCVd(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {110}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r75h8KOeT extends xBFrXAfL4 implements NzvP5Rex8 {
    public int Bhmn1KIah;
    public final /* synthetic */ O4xeEjEdD MzoOEjc4X;
    public /* synthetic */ Object PSTqBLTET;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r75h8KOeT(O4xeEjEdD o4xeEjEdD, Way959ade way959ade) {
        super(3, way959ade);
        this.MzoOEjc4X = o4xeEjEdD;
    }

    @Override // con.NzvP5Rex8
    public Object sk5s77z6Q(Object obj, Object obj2, Object obj3) {
        qih4lW99W qih4lw99w = (qih4lW99W) obj2;
        r75h8KOeT r75h8koet = new r75h8KOeT(this.MzoOEjc4X, (Way959ade) obj3);
        r75h8koet.PSTqBLTET = (EZxKDd411) obj;
        return r75h8koet.yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        kBKJSqCSL kbkjsqcsl = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.Bhmn1KIah;
        if (i == 0) {
            anXlDk6fV.IytU16YUK(obj);
            EZxKDd411 eZxKDd411 = (EZxKDd411) this.PSTqBLTET;
            byte ixWaw2akD = this.MzoOEjc4X.q3BipwRCk.ixWaw2akD();
            if (ixWaw2akD == 1) {
                return this.MzoOEjc4X.dIocxURUo(true);
            }
            if (ixWaw2akD == 0) {
                return this.MzoOEjc4X.dIocxURUo(false);
            }
            if (ixWaw2akD == 6) {
                O4xeEjEdD o4xeEjEdD = this.MzoOEjc4X;
                this.Bhmn1KIah = 1;
                obj = O4xeEjEdD.q3BipwRCk(o4xeEjEdD, eZxKDd411, this);
                if (obj == kbkjsqcsl) {
                    return kbkjsqcsl;
                }
            } else if (ixWaw2akD == 8) {
                return this.MzoOEjc4X.tGV7Q6urW();
            } else {
                JyP4fsVuo.dXrmkklc8(this.MzoOEjc4X.q3BipwRCk, "Can't begin reading element, unexpected token", 0, 2, null);
                throw null;
            }
        } else if (i == 1) {
            anXlDk6fV.IytU16YUK(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return (JsonElement) obj;
    }
}
