package con;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.mhl5lIdbQ;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes.dex */
public abstract class XticXNngr extends ComponentActivity implements DMhvxwkkS {
    public boolean ixWaw2akD;
    public boolean sk5s77z6Q;
    public final E7EzSrpdW dXrmkklc8 = new E7EzSrpdW(new z0NkpHHvU(this));
    public final N0a4Shkkl RG6kpfv3v = new N0a4Shkkl(this);
    public boolean WaUP0CF08 = true;

    public XticXNngr() {
        this.MzoOEjc4X.J4Ux7ym32.J4Ux7ym32("android:support:fragments", new ATZ6xBjCr(this));
        yWvV4ePLl(new Tb5aRBrPI(this));
    }

    public static boolean CBQ5d1kRq(fVMSvDhE6 fvmsvdhe6, mhl5lIdbQ.EnumC0005mhl5lIdbQ mhl5lidbq) {
        XticXNngr xticXNngr;
        mhl5lIdbQ.EnumC0005mhl5lIdbQ mhl5lidbq2 = mhl5lIdbQ.EnumC0005mhl5lIdbQ.STARTED;
        boolean z = false;
        for (UxHHqhbTP uxHHqhbTP : fvmsvdhe6.tGV7Q6urW.WaUP0CF08()) {
            if (uxHHqhbTP != null) {
                z0NkpHHvU z0nkphhvu = uxHHqhbTP.CpG0imbht;
                if (z0nkphhvu == null) {
                    xticXNngr = null;
                } else {
                    xticXNngr = z0nkphhvu.MzoOEjc4X;
                }
                if (xticXNngr != null) {
                    z |= CBQ5d1kRq(uxHHqhbTP.iiGwOFFnr(), mhl5lidbq);
                }
                hZyIatWA3 hzyiatwa3 = uxHHqhbTP.IzM1cD9ly;
                if (hzyiatwa3 != null) {
                    hzyiatwa3.tGV7Q6urW();
                    if (hzyiatwa3.kmSgne1rO.tGV7Q6urW.compareTo(mhl5lidbq2) >= 0) {
                        N0a4Shkkl n0a4Shkkl = uxHHqhbTP.IzM1cD9ly.kmSgne1rO;
                        n0a4Shkkl.dIocxURUo("setCurrentState");
                        n0a4Shkkl.GPLPRo6go(mhl5lidbq);
                        z = true;
                    }
                }
                if (uxHHqhbTP.wIZEdYHUn.tGV7Q6urW.compareTo(mhl5lidbq2) >= 0) {
                    N0a4Shkkl n0a4Shkkl2 = uxHHqhbTP.wIZEdYHUn;
                    n0a4Shkkl2.dIocxURUo("setCurrentState");
                    n0a4Shkkl2.GPLPRo6go(mhl5lidbq);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.ixWaw2akD);
        printWriter.print(" mResumed=");
        printWriter.print(this.sk5s77z6Q);
        printWriter.print(" mStopped=");
        printWriter.print(this.WaUP0CF08);
        if (getApplication() != null) {
            UOv2ZmhQ5.J4Ux7ym32(this).q3BipwRCk(str2, fileDescriptor, printWriter, strArr);
        }
        ((z0NkpHHvU) this.dXrmkklc8.J4Ux7ym32).PSTqBLTET.iMyQMM6Qj(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.dXrmkklc8.J4Ux7ym32();
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.dXrmkklc8.J4Ux7ym32();
        super.onConfigurationChanged(configuration);
        ((z0NkpHHvU) this.dXrmkklc8.J4Ux7ym32).PSTqBLTET.kmSgne1rO(configuration);
    }

    @Override // androidx.activity.ComponentActivity, con.pc1YcJups, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.RG6kpfv3v.kCA6Zs9sL(mhl5lIdbQ.RG2GI7LDp.ON_CREATE);
        ((z0NkpHHvU) this.dXrmkklc8.J4Ux7ym32).PSTqBLTET.PSTqBLTET();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        E7EzSrpdW e7EzSrpdW = this.dXrmkklc8;
        return onCreatePanelMenu | ((z0NkpHHvU) e7EzSrpdW.J4Ux7ym32).PSTqBLTET.MzoOEjc4X(menu, getMenuInflater());
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((z0NkpHHvU) this.dXrmkklc8.J4Ux7ym32).PSTqBLTET.iiGwOFFnr.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((z0NkpHHvU) this.dXrmkklc8.J4Ux7ym32).PSTqBLTET.ilHKhw3Yw();
        this.RG6kpfv3v.kCA6Zs9sL(mhl5lIdbQ.RG2GI7LDp.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        ((z0NkpHHvU) this.dXrmkklc8.J4Ux7ym32).PSTqBLTET.qVUwofr5s();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return ((z0NkpHHvU) this.dXrmkklc8.J4Ux7ym32).PSTqBLTET.dXrmkklc8(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return ((z0NkpHHvU) this.dXrmkklc8.J4Ux7ym32).PSTqBLTET.Bhmn1KIah(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        ((z0NkpHHvU) this.dXrmkklc8.J4Ux7ym32).PSTqBLTET.Eeka1udhb(z);
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.dXrmkklc8.J4Ux7ym32();
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            ((z0NkpHHvU) this.dXrmkklc8.J4Ux7ym32).PSTqBLTET.RG6kpfv3v(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.sk5s77z6Q = false;
        ((z0NkpHHvU) this.dXrmkklc8.J4Ux7ym32).PSTqBLTET.i8XZMQc6Z(5);
        this.RG6kpfv3v.kCA6Zs9sL(mhl5lIdbQ.RG2GI7LDp.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        ((z0NkpHHvU) this.dXrmkklc8.J4Ux7ym32).PSTqBLTET.sk5s77z6Q(z);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.RG6kpfv3v.kCA6Zs9sL(mhl5lIdbQ.RG2GI7LDp.ON_RESUME);
        fVMSvDhE6 fvmsvdhe6 = ((z0NkpHHvU) this.dXrmkklc8.J4Ux7ym32).PSTqBLTET;
        fvmsvdhe6.cAwN510t2 = false;
        fvmsvdhe6.IytU16YUK = false;
        fvmsvdhe6.vNtjxmzUM.GPLPRo6go = false;
        fvmsvdhe6.i8XZMQc6Z(7);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return super.onPreparePanel(0, view, menu) | ((z0NkpHHvU) this.dXrmkklc8.J4Ux7ym32).PSTqBLTET.WaUP0CF08(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.dXrmkklc8.J4Ux7ym32();
        super.onResume();
        this.sk5s77z6Q = true;
        ((z0NkpHHvU) this.dXrmkklc8.J4Ux7ym32).PSTqBLTET.qFBXIgpia(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.dXrmkklc8.J4Ux7ym32();
        super.onStart();
        this.WaUP0CF08 = false;
        if (!this.ixWaw2akD) {
            this.ixWaw2akD = true;
            fVMSvDhE6 fvmsvdhe6 = ((z0NkpHHvU) this.dXrmkklc8.J4Ux7ym32).PSTqBLTET;
            fvmsvdhe6.cAwN510t2 = false;
            fvmsvdhe6.IytU16YUK = false;
            fvmsvdhe6.vNtjxmzUM.GPLPRo6go = false;
            fvmsvdhe6.i8XZMQc6Z(4);
        }
        ((z0NkpHHvU) this.dXrmkklc8.J4Ux7ym32).PSTqBLTET.qFBXIgpia(true);
        this.RG6kpfv3v.kCA6Zs9sL(mhl5lIdbQ.RG2GI7LDp.ON_START);
        fVMSvDhE6 fvmsvdhe62 = ((z0NkpHHvU) this.dXrmkklc8.J4Ux7ym32).PSTqBLTET;
        fvmsvdhe62.cAwN510t2 = false;
        fvmsvdhe62.IytU16YUK = false;
        fvmsvdhe62.vNtjxmzUM.GPLPRo6go = false;
        fvmsvdhe62.i8XZMQc6Z(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.dXrmkklc8.J4Ux7ym32();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.WaUP0CF08 = true;
        do {
        } while (CBQ5d1kRq(((z0NkpHHvU) this.dXrmkklc8.J4Ux7ym32).PSTqBLTET, mhl5lIdbQ.EnumC0005mhl5lIdbQ.CREATED));
        fVMSvDhE6 fvmsvdhe6 = ((z0NkpHHvU) this.dXrmkklc8.J4Ux7ym32).PSTqBLTET;
        fvmsvdhe6.IytU16YUK = true;
        fvmsvdhe6.vNtjxmzUM.GPLPRo6go = true;
        fvmsvdhe6.i8XZMQc6Z(4);
        this.RG6kpfv3v.kCA6Zs9sL(mhl5lIdbQ.RG2GI7LDp.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((z0NkpHHvU) this.dXrmkklc8.J4Ux7ym32).PSTqBLTET.iiGwOFFnr.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
