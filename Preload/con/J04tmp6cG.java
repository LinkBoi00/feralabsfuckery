package con;

import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* loaded from: classes.dex */
public class J04tmp6cG implements CWSdmCLrj {
    public static final byte[] dIocxURUo;
    public static final String tGV7Q6urW;
    public final MCXoBhXFn J4Ux7ym32;
    public final List q3BipwRCk;

    static {
        String uuid = UUID.randomUUID().toString();
        tGV7Q6urW = uuid;
        dIocxURUo = String.format("__RET=$?;echo %1$s;echo %1$s >&2;echo $__RET;unset __RET\n", uuid).getBytes(BPyGi2K5m.q3BipwRCk);
    }

    public J04tmp6cG(List list, MCXoBhXFn mCXoBhXFn) {
        this.q3BipwRCk = list;
        this.J4Ux7ym32 = mCXoBhXFn;
    }

    public void q3BipwRCk(OutputStream outputStream, InputStream inputStream, InputStream inputStream2) {
        Future submit = xheEapSkC.Eeka1udhb.submit(new mzNeXv573(inputStream, this.J4Ux7ym32.q3BipwRCk));
        Future submit2 = xheEapSkC.Eeka1udhb.submit(new OAYjXcE3Y(inputStream2, this.J4Ux7ym32.J4Ux7ym32));
        for (sgrtxoGa0 sgrtxoga0 : this.q3BipwRCk) {
            for (String str : sgrtxoga0.CBQ5d1kRq) {
                outputStream.write(str.getBytes(BPyGi2K5m.q3BipwRCk));
                outputStream.write(10);
                Charset charset = BPyGi2K5m.q3BipwRCk;
            }
        }
        outputStream.write(dIocxURUo);
        outputStream.flush();
        try {
            MCXoBhXFn mCXoBhXFn = this.J4Ux7ym32;
            ((Integer) submit.get()).intValue();
            Objects.requireNonNull(mCXoBhXFn);
            submit2.get();
        } catch (InterruptedException | ExecutionException e) {
            throw ((InterruptedIOException) new InterruptedIOException().initCause(e));
        }
    }
}
