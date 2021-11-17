package con;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public abstract class jaM2zCRJ5 implements Closeable {
    public final List Bhmn1KIah = new ArrayList();
    public List CBQ5d1kRq;
    public xheEapSkC PSTqBLTET;
    public List kmSgne1rO;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final MCXoBhXFn J4Ux7ym32() {
        List list;
        boolean z = this.PSTqBLTET.Bhmn1KIah;
        if (z) {
            this.kmSgne1rO = this.CBQ5d1kRq;
        }
        MCXoBhXFn mCXoBhXFn = new MCXoBhXFn();
        List list2 = this.CBQ5d1kRq;
        try {
            try {
                if (list2 != null && list2 == this.kmSgne1rO) {
                    if (BPyGi2K5m.J4Ux7ym32 == null) {
                        if (nGmxdG7rV.CBQ5d1kRq == null) {
                            nGmxdG7rV.CBQ5d1kRq = new nGmxdG7rV();
                        }
                        BPyGi2K5m.J4Ux7ym32 = Collections.synchronizedCollection(nGmxdG7rV.CBQ5d1kRq).getClass();
                    }
                    if (!BPyGi2K5m.J4Ux7ym32.isInstance(list2)) {
                        list = Collections.synchronizedList(this.CBQ5d1kRq);
                        mCXoBhXFn.q3BipwRCk = list;
                        mCXoBhXFn.J4Ux7ym32 = list;
                        list = null;
                        this.PSTqBLTET.q3BipwRCk(new J04tmp6cG(this.Bhmn1KIah, mCXoBhXFn));
                        close();
                        mCXoBhXFn.q3BipwRCk = this.CBQ5d1kRq;
                        if (!z) {
                            list = this.kmSgne1rO;
                        }
                        mCXoBhXFn.J4Ux7ym32 = list;
                        return mCXoBhXFn;
                    }
                }
                this.PSTqBLTET.q3BipwRCk(new J04tmp6cG(this.Bhmn1KIah, mCXoBhXFn));
                close();
                mCXoBhXFn.q3BipwRCk = this.CBQ5d1kRq;
                if (!z) {
                }
                mCXoBhXFn.J4Ux7ym32 = list;
                return mCXoBhXFn;
            } catch (IOException e) {
                if (e instanceof zvaoA6CCz) {
                    MCXoBhXFn mCXoBhXFn2 = MCXoBhXFn.dIocxURUo;
                    close();
                    mCXoBhXFn.q3BipwRCk = this.CBQ5d1kRq;
                    if (!z) {
                        list = this.kmSgne1rO;
                    }
                    mCXoBhXFn.J4Ux7ym32 = list;
                    return mCXoBhXFn2;
                }
                BPyGi2K5m.q3BipwRCk(e);
                MCXoBhXFn mCXoBhXFn3 = MCXoBhXFn.tGV7Q6urW;
                close();
                mCXoBhXFn.q3BipwRCk = this.CBQ5d1kRq;
                if (!z) {
                    list = this.kmSgne1rO;
                }
                mCXoBhXFn.J4Ux7ym32 = list;
                return mCXoBhXFn3;
            }
            mCXoBhXFn.J4Ux7ym32 = list;
            list = null;
        } catch (Throwable th) {
            close();
            mCXoBhXFn.q3BipwRCk = this.CBQ5d1kRq;
            if (!z) {
                list = this.kmSgne1rO;
            }
            mCXoBhXFn.J4Ux7ym32 = list;
            throw th;
        }
        mCXoBhXFn.q3BipwRCk = this.CBQ5d1kRq;
        list = this.kmSgne1rO;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        for (sgrtxoGa0 sgrtxoga0 : this.Bhmn1KIah) {
            Objects.requireNonNull(sgrtxoga0);
        }
    }

    public abstract void dIocxURUo(Executor executor, SErPKGCcc sErPKGCcc);

    public abstract DfseMYa7G q3BipwRCk();

    public void tGV7Q6urW() {
        dIocxURUo(RJRwDKpCU.J4Ux7ym32, null);
    }
}
