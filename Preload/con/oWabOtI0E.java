package con;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public abstract class oWabOtI0E implements Callable {
    public final InputStream CBQ5d1kRq;
    public final List kmSgne1rO;

    public oWabOtI0E(InputStream inputStream, List list) {
        this.CBQ5d1kRq = inputStream;
        this.kmSgne1rO = list;
    }

    public String q3BipwRCk(boolean z) {
        boolean z2;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.CBQ5d1kRq, BPyGi2K5m.q3BipwRCk));
        do {
            String readLine = bufferedReader.readLine();
            z2 = false;
            if (readLine != null) {
                int length = readLine.length();
                int i = length - 36;
                boolean startsWith = readLine.startsWith(J04tmp6cG.tGV7Q6urW, i);
                if (startsWith) {
                    if (length == 36) {
                        continue;
                    } else {
                        readLine = readLine.substring(0, i);
                    }
                }
                List list = this.kmSgne1rO;
                if (list != null) {
                    list.add(readLine);
                    Charset charset = BPyGi2K5m.q3BipwRCk;
                }
                z2 = !startsWith;
                continue;
            }
        } while (z2);
        if (z) {
            return bufferedReader.readLine();
        }
        return null;
    }
}
