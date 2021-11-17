package con;
/* loaded from: classes.dex */
public final class T6mjRn3Wp implements clUYjTSq7 {
    public final Object Bhmn1KIah;
    public final Vy9q8M95G CBQ5d1kRq;
    public final Way959ade PSTqBLTET;
    public long kmSgne1rO;

    public T6mjRn3Wp(Vy9q8M95G vy9q8M95G, long j, Object obj, Way959ade way959ade) {
        this.CBQ5d1kRq = vy9q8M95G;
        this.kmSgne1rO = j;
        this.Bhmn1KIah = obj;
        this.PSTqBLTET = way959ade;
    }

    @Override // con.clUYjTSq7
    public void q3BipwRCk() {
        Vy9q8M95G vy9q8M95G = this.CBQ5d1kRq;
        synchronized (vy9q8M95G) {
            if (this.kmSgne1rO >= vy9q8M95G.Bhmn1KIah()) {
                Object[] objArr = vy9q8M95G.qVUwofr5s;
                int i = (int) this.kmSgne1rO;
                if (objArr[(objArr.length - 1) & i] == this) {
                    objArr[i & (objArr.length - 1)] = dKhv6D4Rg.q3BipwRCk;
                    vy9q8M95G.yWvV4ePLl();
                }
            }
        }
    }
}
