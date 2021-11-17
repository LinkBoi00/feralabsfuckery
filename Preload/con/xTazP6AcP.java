package con;

import java.util.Objects;
/* loaded from: classes.dex */
public final class xTazP6AcP extends gZ3iawlCc {
    public final /* synthetic */ kkcQgCx5G Bhmn1KIah;
    public final /* synthetic */ Object PSTqBLTET;
    public int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xTazP6AcP(Way959ade way959ade, Way959ade way959ade2, kkcQgCx5G kkcqgcx5g, Object obj) {
        super(way959ade2);
        this.Bhmn1KIah = kkcqgcx5g;
        this.PSTqBLTET = obj;
    }

    @Override // con.LxklW3zxE
    public Object yWvV4ePLl(Object obj) {
        int i = this.kmSgne1rO;
        if (i == 0) {
            this.kmSgne1rO = 1;
            anXlDk6fV.IytU16YUK(obj);
            kkcQgCx5G kkcqgcx5g = this.Bhmn1KIah;
            Objects.requireNonNull(kkcqgcx5g, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            cOutqbkMD.J4Ux7ym32(kkcqgcx5g, 2);
            return kkcqgcx5g.WaUP0CF08(this.PSTqBLTET, this);
        } else if (i == 1) {
            this.kmSgne1rO = 2;
            anXlDk6fV.IytU16YUK(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
