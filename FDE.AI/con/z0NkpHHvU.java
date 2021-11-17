package con;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.RG2GI7LDp;
import androidx.lifecycle.mhl5lIdbQ;
import java.util.Objects;
/* loaded from: classes.dex */
public class z0NkpHHvU extends BKr8aejj7 implements LiMUeynem, ueHOpDHaX, TTqseSZOY, kID7DUxu0 {
    public final Handler Bhmn1KIah;
    public final Activity CBQ5d1kRq;
    public final /* synthetic */ XticXNngr MzoOEjc4X;
    public final fVMSvDhE6 PSTqBLTET = new fVMSvDhE6();
    public final Context kmSgne1rO;

    public z0NkpHHvU(XticXNngr xticXNngr) {
        this.MzoOEjc4X = xticXNngr;
        Handler handler = new Handler();
        this.CBQ5d1kRq = xticXNngr;
        this.kmSgne1rO = xticXNngr;
        this.Bhmn1KIah = handler;
    }

    @Override // con.BgHiMFrEI
    public mhl5lIdbQ GPLPRo6go() {
        return this.MzoOEjc4X.RG6kpfv3v;
    }

    @Override // con.kID7DUxu0
    public void J4Ux7ym32(fVMSvDhE6 fvmsvdhe6, UxHHqhbTP uxHHqhbTP) {
        Objects.requireNonNull(this.MzoOEjc4X);
    }

    public OnBackPressedDispatcher Puu3Rhg4F() {
        return this.MzoOEjc4X.qVUwofr5s;
    }

    @Override // con.BKr8aejj7
    public boolean dIocxURUo() {
        Window window = this.MzoOEjc4X.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    public RG2GI7LDp iiGwOFFnr() {
        return this.MzoOEjc4X.Eeka1udhb;
    }

    @Override // con.LiMUeynem
    public emw2Oo1fE kCA6Zs9sL() {
        return this.MzoOEjc4X.kCA6Zs9sL();
    }

    @Override // con.BKr8aejj7
    public View tGV7Q6urW(int i) {
        return this.MzoOEjc4X.findViewById(i);
    }
}
