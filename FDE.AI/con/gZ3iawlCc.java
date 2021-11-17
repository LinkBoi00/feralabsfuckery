package con;
/* loaded from: classes.dex */
public abstract class gZ3iawlCc extends LxklW3zxE {
    public gZ3iawlCc(Way959ade way959ade) {
        super(way959ade);
        if (way959ade != null) {
            if (!(way959ade.kCA6Zs9sL() == HbUTGjFCZ.CBQ5d1kRq)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // con.Way959ade
    public bu5cjmae6 kCA6Zs9sL() {
        return HbUTGjFCZ.CBQ5d1kRq;
    }
}
