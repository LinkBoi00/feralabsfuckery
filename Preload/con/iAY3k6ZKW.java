package con;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.OutputStream;
/* loaded from: classes.dex */
public class iAY3k6ZKW extends FilterOutputStream {
    public iAY3k6ZKW(OutputStream outputStream) {
        super(!(outputStream instanceof BufferedOutputStream) ? new BufferedOutputStream(outputStream) : outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterOutputStream) this).out.flush();
    }

    public void q3BipwRCk() {
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        ((FilterOutputStream) this).out.write(bArr, i, i2);
    }
}
