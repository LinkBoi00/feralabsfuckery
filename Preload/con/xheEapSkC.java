package con;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class xheEapSkC implements Closeable {
    public static ExecutorService Eeka1udhb = Executors.newCachedThreadPool();
    public final boolean Bhmn1KIah;
    public int CBQ5d1kRq;
    public final iAY3k6ZKW MzoOEjc4X;
    public final Process PSTqBLTET;
    public final KuEkF45BF ilHKhw3Yw;
    public final ExecutorService kmSgne1rO;
    public final KuEkF45BF qVUwofr5s;

    public xheEapSkC(long j, boolean z, String... strArr) {
        this.CBQ5d1kRq = -1;
        this.Bhmn1KIah = z;
        TextUtils.join(" ", strArr);
        Charset charset = BPyGi2K5m.q3BipwRCk;
        Process exec = Runtime.getRuntime().exec(strArr);
        this.PSTqBLTET = exec;
        this.MzoOEjc4X = new iAY3k6ZKW(exec.getOutputStream());
        this.ilHKhw3Yw = new KuEkF45BF(exec.getInputStream());
        this.qVUwofr5s = new KuEkF45BF(exec.getErrorStream());
        gbRhJKuGc gbrhjkugc = new gbRhJKuGc();
        this.kmSgne1rO = gbrhjkugc;
        if (strArr.length >= 2 && TextUtils.equals(strArr[1], "--mount-master")) {
            this.CBQ5d1kRq = 2;
        }
        try {
            try {
                try {
                    gbrhjkugc.submit(new Callable() { // from class: con.ZShS5DJKW
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            xheEapSkC xheeapskc = xheEapSkC.this;
                            D3DEikrvb.GPLPRo6go(xheeapskc.ilHKhw3Yw);
                            D3DEikrvb.GPLPRo6go(xheeapskc.qVUwofr5s);
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(xheeapskc.ilHKhw3Yw));
                            try {
                                iAY3k6ZKW iay3k6zkw = xheeapskc.MzoOEjc4X;
                                Charset charset2 = BPyGi2K5m.q3BipwRCk;
                                iay3k6zkw.write("echo SHELL_TEST\n".getBytes(charset2));
                                xheeapskc.MzoOEjc4X.flush();
                                String readLine = bufferedReader.readLine();
                                if (TextUtils.isEmpty(readLine) || !readLine.contains("SHELL_TEST")) {
                                    throw new IOException("Created process is not a shell");
                                }
                                int i = 0;
                                xheeapskc.MzoOEjc4X.write("id\n".getBytes(charset2));
                                xheeapskc.MzoOEjc4X.flush();
                                String readLine2 = bufferedReader.readLine();
                                if (!TextUtils.isEmpty(readLine2) && readLine2.contains("uid=0")) {
                                    i = 1;
                                }
                                if (i == 1 && xheeapskc.CBQ5d1kRq == 2) {
                                    i = 2;
                                }
                                xheeapskc.CBQ5d1kRq = i;
                                bufferedReader.close();
                                return null;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    try {
                                        bufferedReader.close();
                                    } catch (Throwable th3) {
                                        th.addSuppressed(th3);
                                    }
                                    throw th2;
                                }
                            }
                        }
                    }).get(j, TimeUnit.SECONDS);
                } catch (TimeoutException e) {
                    throw new IOException("Shell timeout", e);
                }
            } catch (InterruptedException e2) {
                throw new IOException("Shell initialization interrupted", e2);
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new IOException("Unknown ExecutionException", cause);
            }
        } catch (IOException e4) {
            this.kmSgne1rO.shutdownNow();
            tGV7Q6urW();
            throw e4;
        }
    }

    public static jaM2zCRJ5 dIocxURUo(String... strArr) {
        FIC2AFxvd fIC2AFxvd = new FIC2AFxvd(false);
        if (strArr.length > 0) {
            fIC2AFxvd.Bhmn1KIah.add(new sgrtxoGa0(strArr));
        }
        return fIC2AFxvd;
    }

    public static jaM2zCRJ5 kCA6Zs9sL(String... strArr) {
        FIC2AFxvd fIC2AFxvd = new FIC2AFxvd(true);
        if (strArr.length > 0) {
            fIC2AFxvd.Bhmn1KIah.add(new sgrtxoGa0(strArr));
        }
        return fIC2AFxvd;
    }

    public boolean J4Ux7ym32() {
        return this.CBQ5d1kRq >= 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.CBQ5d1kRq >= 0) {
            this.kmSgne1rO.shutdownNow();
            tGV7Q6urW();
        }
    }

    public synchronized void q3BipwRCk(CWSdmCLrj cWSdmCLrj) {
        if (this.CBQ5d1kRq >= 0) {
            D3DEikrvb.GPLPRo6go(this.ilHKhw3Yw);
            D3DEikrvb.GPLPRo6go(this.qVUwofr5s);
            try {
                this.MzoOEjc4X.write(10);
                this.MzoOEjc4X.flush();
                ((J04tmp6cG) cWSdmCLrj).q3BipwRCk(this.MzoOEjc4X, this.ilHKhw3Yw, this.qVUwofr5s);
            } catch (IOException unused) {
                tGV7Q6urW();
                throw new zvaoA6CCz();
            }
        } else {
            throw new zvaoA6CCz();
        }
    }

    public final void tGV7Q6urW() {
        this.CBQ5d1kRq = -1;
        try {
            this.MzoOEjc4X.q3BipwRCk();
        } catch (IOException unused) {
        }
        try {
            this.qVUwofr5s.q3BipwRCk();
        } catch (IOException unused2) {
        }
        try {
            this.ilHKhw3Yw.q3BipwRCk();
        } catch (IOException unused3) {
        }
        this.PSTqBLTET.destroy();
    }
}
