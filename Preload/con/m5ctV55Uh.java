package con;

import java.util.Objects;
/* loaded from: classes.dex */
public final class m5ctV55Uh extends H9pO9gJ32 {
    public final /* synthetic */ kkcQgCx5G MzoOEjc4X;
    public int PSTqBLTET;
    public final /* synthetic */ Object ilHKhw3Yw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5ctV55Uh(Way959ade way959ade, bu5cjmae6 bu5cjmae6, Way959ade way959ade2, bu5cjmae6 bu5cjmae62, kkcQgCx5G kkcqgcx5g, Object obj) {
        super(way959ade2, bu5cjmae62);
        this.MzoOEjc4X = kkcqgcx5g;
        this.ilHKhw3Yw = obj;
    }

    @Override // con.LxklW3zxE
    public Object yWvV4ePLl(Object obj) {
        int i = this.PSTqBLTET;
        if (i == 0) {
            this.PSTqBLTET = 1;
            anXlDk6fV.IytU16YUK(obj);
            kkcQgCx5G kkcqgcx5g = this.MzoOEjc4X;
            Objects.requireNonNull(kkcqgcx5g, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            cOutqbkMD.J4Ux7ym32(kkcqgcx5g, 2);
            return kkcqgcx5g.WaUP0CF08(this.ilHKhw3Yw, this);
        } else if (i == 1) {
            this.PSTqBLTET = 2;
            anXlDk6fV.IytU16YUK(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
