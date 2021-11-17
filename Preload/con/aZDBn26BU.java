package con;

import android.view.View;
import com.feravolt.preload.R;
@jHNqfwCVd(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", l = {164}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class aZDBn26BU extends dnd1L2J2K implements kkcQgCx5G {
    public int MzoOEjc4X;
    public final /* synthetic */ rQamjxEL9 ilHKhw3Yw;
    public final /* synthetic */ View qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aZDBn26BU(rQamjxEL9 rqamjxel9, View view, Way959ade way959ade) {
        super(2, way959ade);
        this.ilHKhw3Yw = rqamjxel9;
        this.qVUwofr5s = view;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        return new aZDBn26BU(this.ilHKhw3Yw, this.qVUwofr5s, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new aZDBn26BU(this.ilHKhw3Yw, this.qVUwofr5s, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        Object obj2 = kBKJSqCSL.COROUTINE_SUSPENDED;
        int i = this.MzoOEjc4X;
        try {
            if (i == 0) {
                anXlDk6fV.IytU16YUK(obj);
                rQamjxEL9 rqamjxel9 = this.ilHKhw3Yw;
                this.MzoOEjc4X = 1;
                Object dIocxURUo = rTcohQ78k.dIocxURUo(rqamjxel9.kmSgne1rO, new B036QOyhI(null), this);
                if (dIocxURUo != obj2) {
                    dIocxURUo = qih4lW99W.q3BipwRCk;
                }
                if (dIocxURUo == obj2) {
                    return obj2;
                }
            } else if (i == 1) {
                anXlDk6fV.IytU16YUK(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return qih4lW99W.q3BipwRCk;
        } finally {
            if (prIU0SrzN.q3BipwRCk(this.qVUwofr5s) == this.ilHKhw3Yw) {
                this.qVUwofr5s.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
        }
    }
}
