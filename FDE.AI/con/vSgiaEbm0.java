package con;
/* loaded from: classes.dex */
public final class vSgiaEbm0 extends yu2QUAlaV {
    public static final xaeEKvU2c Eeka1udhb;
    public static final vSgiaEbm0 qVUwofr5s;

    static {
        vSgiaEbm0 vsgiaebm0 = new vSgiaEbm0();
        qVUwofr5s = vsgiaebm0;
        int i = iG7KBFGGv.q3BipwRCk;
        Eeka1udhb = new Iu1wdxGcB(vsgiaebm0, bqV8ECpZf.dIocxURUo("kotlinx.coroutines.io.parallelism", 64 < i ? i : 64, 0, 0, 12, null), "Dispatchers.IO", 1);
    }

    public vSgiaEbm0() {
        super(0, 0, null, 7);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // con.xaeEKvU2c, java.lang.Object
    public String toString() {
        return "Dispatchers.Default";
    }
}
