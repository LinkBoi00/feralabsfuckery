package con;

import android.util.Log;
import java.io.Writer;
/* loaded from: classes.dex */
public final class HNCBnvwXJ extends Writer {
    public final String CBQ5d1kRq;
    public StringBuilder kmSgne1rO = new StringBuilder(128);

    public HNCBnvwXJ(String str) {
        this.CBQ5d1kRq = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        q3BipwRCk();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        q3BipwRCk();
    }

    public final void q3BipwRCk() {
        if (this.kmSgne1rO.length() > 0) {
            Log.d(this.CBQ5d1kRq, this.kmSgne1rO.toString());
            StringBuilder sb = this.kmSgne1rO;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                q3BipwRCk();
            } else {
                this.kmSgne1rO.append(c);
            }
        }
    }
}
