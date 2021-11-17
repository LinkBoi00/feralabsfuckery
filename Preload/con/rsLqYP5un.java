package con;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.feravolt.preload.R;
/* loaded from: classes.dex */
public class rsLqYP5un extends UxHHqhbTP implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public boolean IG30YE5GU;
    public Dialog KlYagMRWx;
    public Handler XYT7vJqNO;
    public boolean lqFHPHdW3;
    public boolean oesmsHQJU;
    public Runnable kktL0P5MG = new RG2GI7LDp();
    public DialogInterface.OnCancelListener KBYw84i3W = new mhl5lIdbQ();
    public DialogInterface.OnDismissListener INnK5Rew6 = new aXI58Y1kr();
    public int SuKhTJIQc = 0;
    public int ln3nf7LH3 = 0;
    public boolean Dr7UqlxEV = true;
    public boolean M66hQ219i = true;
    public int R2hkbNqWf = -1;
    public vfNFBCmCL buPcffgdD = new qhPEQQaQ4();
    public boolean YmNRDyka4 = false;

    /* loaded from: classes.dex */
    public class RG2GI7LDp implements Runnable {
        public RG2GI7LDp() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            rsLqYP5un rslqyp5un = rsLqYP5un.this;
            rslqyp5un.INnK5Rew6.onDismiss(rslqyp5un.KlYagMRWx);
        }
    }

    /* loaded from: classes.dex */
    public class aXI58Y1kr implements DialogInterface.OnDismissListener {
        public aXI58Y1kr() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            rsLqYP5un rslqyp5un = rsLqYP5un.this;
            Dialog dialog = rslqyp5un.KlYagMRWx;
            if (dialog != null) {
                rslqyp5un.onDismiss(dialog);
            }
        }
    }

    /* loaded from: classes.dex */
    public class mhl5lIdbQ implements DialogInterface.OnCancelListener {
        public mhl5lIdbQ() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            rsLqYP5un rslqyp5un = rsLqYP5un.this;
            Dialog dialog = rslqyp5un.KlYagMRWx;
            if (dialog != null) {
                rslqyp5un.onCancel(dialog);
            }
        }
    }

    /* loaded from: classes.dex */
    public class qhPEQQaQ4 implements vfNFBCmCL {
        public qhPEQQaQ4() {
        }
    }

    /* loaded from: classes.dex */
    public class s7MlVynBG extends BKr8aejj7 {
        public final /* synthetic */ BKr8aejj7 q3BipwRCk;

        public s7MlVynBG(BKr8aejj7 bKr8aejj7) {
            this.q3BipwRCk = bKr8aejj7;
        }

        @Override // con.BKr8aejj7
        public boolean dIocxURUo() {
            return this.q3BipwRCk.dIocxURUo() || rsLqYP5un.this.YmNRDyka4;
        }

        @Override // con.BKr8aejj7
        public View tGV7Q6urW(int i) {
            if (this.q3BipwRCk.dIocxURUo()) {
                return this.q3BipwRCk.tGV7Q6urW(i);
            }
            Dialog dialog = rsLqYP5un.this.KlYagMRWx;
            if (dialog != null) {
                return dialog.findViewById(i);
            }
            return null;
        }
    }

    public Dialog INnK5Rew6(Bundle bundle) {
        if (fVMSvDhE6.juJ6pnCpu(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(ziwPzaoF3(), this.ln3nf7LH3);
    }

    @Override // con.UxHHqhbTP
    public BKr8aejj7 J4Ux7ym32() {
        return new s7MlVynBG(new yGccES7sx(this));
    }

    public final void KBYw84i3W(boolean z, boolean z2) {
        if (!this.oesmsHQJU) {
            this.oesmsHQJU = true;
            Dialog dialog = this.KlYagMRWx;
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                this.KlYagMRWx.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.XYT7vJqNO.getLooper()) {
                        onDismiss(this.KlYagMRWx);
                    } else {
                        this.XYT7vJqNO.post(this.kktL0P5MG);
                    }
                }
            }
            this.lqFHPHdW3 = true;
            if (this.R2hkbNqWf >= 0) {
                fVMSvDhE6 MzoOEjc4X = MzoOEjc4X();
                int i = this.R2hkbNqWf;
                if (i >= 0) {
                    MzoOEjc4X.IytU16YUK(new lwJiW1Mqz(MzoOEjc4X, null, i, 1), false);
                    this.R2hkbNqWf = -1;
                    return;
                }
                throw new IllegalArgumentException("Bad id: " + i);
            }
            xkmNtxX26 xkmntxx26 = new xkmNtxX26(MzoOEjc4X());
            fVMSvDhE6 fvmsvdhe6 = this.IytU16YUK;
            if (fvmsvdhe6 == null || fvmsvdhe6 == xkmntxx26.MzoOEjc4X) {
                xkmntxx26.J4Ux7ym32(new ah1jjZN55(3, this));
                if (z) {
                    xkmntxx26.dIocxURUo(true);
                } else {
                    xkmntxx26.dIocxURUo(false);
                }
            } else {
                StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
                q3BipwRCk.append(toString());
                q3BipwRCk.append(" is already attached to a FragmentManager.");
                throw new IllegalStateException(q3BipwRCk.toString());
            }
        }
    }

    @Override // con.UxHHqhbTP
    public void NyWTwPF6V() {
        this.QNqj6nIzv = true;
        if (!this.oesmsHQJU) {
            this.oesmsHQJU = true;
        }
        this.n4UIOvAko.kCA6Zs9sL(this.buPcffgdD);
    }

    @Override // con.UxHHqhbTP
    public void QNqj6nIzv() {
        this.QNqj6nIzv = true;
        Dialog dialog = this.KlYagMRWx;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final Dialog SuKhTJIQc() {
        Dialog dialog = this.KlYagMRWx;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // con.UxHHqhbTP
    public void TyB1UUd72(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.TyB1UUd72(layoutInflater, viewGroup, bundle);
        if (this.EBQXiIPmm == null && this.KlYagMRWx != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.KlYagMRWx.onRestoreInstanceState(bundle2);
        }
    }

    @Override // con.UxHHqhbTP
    public void V9LQMKGJe() {
        this.QNqj6nIzv = true;
        Dialog dialog = this.KlYagMRWx;
        if (dialog != null) {
            this.lqFHPHdW3 = false;
            dialog.show();
            View decorView = this.KlYagMRWx.getWindow().getDecorView();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    @Override // con.UxHHqhbTP
    public void igRQEZxnW(Bundle bundle) {
        Bundle bundle2;
        this.QNqj6nIzv = true;
        if (this.KlYagMRWx != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.KlYagMRWx.onRestoreInstanceState(bundle2);
        }
    }

    @Override // con.UxHHqhbTP
    public void mUqPm6GBh() {
        this.QNqj6nIzv = true;
        Dialog dialog = this.KlYagMRWx;
        if (dialog != null) {
            this.lqFHPHdW3 = true;
            dialog.setOnDismissListener(null);
            this.KlYagMRWx.dismiss();
            if (!this.oesmsHQJU) {
                onDismiss(this.KlYagMRWx);
            }
            this.KlYagMRWx = null;
            this.YmNRDyka4 = false;
        }
    }

    @Override // con.UxHHqhbTP
    public void nlGCs0NZs(Bundle bundle) {
        super.nlGCs0NZs(bundle);
        this.XYT7vJqNO = new Handler();
        this.M66hQ219i = this.mUqPm6GBh == 0;
        if (bundle != null) {
            this.SuKhTJIQc = bundle.getInt("android:style", 0);
            this.ln3nf7LH3 = bundle.getInt("android:theme", 0);
            this.Dr7UqlxEV = bundle.getBoolean("android:cancelable", true);
            this.M66hQ219i = bundle.getBoolean("android:showsDialog", this.M66hQ219i);
            this.R2hkbNqWf = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // con.UxHHqhbTP
    public void o4LF8RkoQ(Bundle bundle) {
        Dialog dialog = this.KlYagMRWx;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.SuKhTJIQc;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.ln3nf7LH3;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.Dr7UqlxEV;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.M66hQ219i;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.R2hkbNqWf;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.lqFHPHdW3) {
            if (fVMSvDhE6.juJ6pnCpu(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            KBYw84i3W(true, true);
        }
    }

    @Override // con.UxHHqhbTP
    public void qFBXIgpia(Context context) {
        super.qFBXIgpia(context);
        this.n4UIOvAko.dIocxURUo(this.buPcffgdD);
        this.oesmsHQJU = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0046 A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x0030, B:20:0x0036, B:21:0x003b, B:22:0x003e, B:24:0x0046, B:25:0x004d, B:26:0x0065), top: B:46:0x001a }] */
    @Override // con.UxHHqhbTP
    /* Code decompiled incorrectly, please refer to instructions dump */
    public LayoutInflater vNtjxmzUM(Bundle bundle) {
        String str;
        StringBuilder sb;
        Context Puu3Rhg4F;
        LayoutInflater vNtjxmzUM = super.vNtjxmzUM(bundle);
        boolean z = this.M66hQ219i;
        if (!z || this.IG30YE5GU) {
            if (fVMSvDhE6.juJ6pnCpu(2)) {
                String str2 = "getting layout inflater for DialogFragment " + this;
                if (!this.M66hQ219i) {
                    sb = new StringBuilder();
                    str = "mShowsDialog = false: ";
                } else {
                    sb = new StringBuilder();
                    str = "mCreatingDialog = true: ";
                }
                sb.append(str);
                sb.append(str2);
                Log.d("FragmentManager", sb.toString());
            }
            return vNtjxmzUM;
        }
        if (z && !this.YmNRDyka4) {
            try {
                this.IG30YE5GU = true;
                Dialog INnK5Rew6 = INnK5Rew6(bundle);
                this.KlYagMRWx = INnK5Rew6;
                if (this.M66hQ219i) {
                    int i = this.SuKhTJIQc;
                    if (!(i == 1 || i == 2)) {
                        if (i == 3) {
                            Window window = INnK5Rew6.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                        } else {
                            Puu3Rhg4F = Puu3Rhg4F();
                            if (Puu3Rhg4F instanceof Activity) {
                                this.KlYagMRWx.setOwnerActivity((Activity) Puu3Rhg4F);
                            }
                            this.KlYagMRWx.setCancelable(this.Dr7UqlxEV);
                            this.KlYagMRWx.setOnCancelListener(this.KBYw84i3W);
                            this.KlYagMRWx.setOnDismissListener(this.INnK5Rew6);
                            this.YmNRDyka4 = true;
                        }
                    }
                    INnK5Rew6.requestWindowFeature(1);
                    Puu3Rhg4F = Puu3Rhg4F();
                    if (Puu3Rhg4F instanceof Activity) {
                    }
                    this.KlYagMRWx.setCancelable(this.Dr7UqlxEV);
                    this.KlYagMRWx.setOnCancelListener(this.KBYw84i3W);
                    this.KlYagMRWx.setOnDismissListener(this.INnK5Rew6);
                    this.YmNRDyka4 = true;
                } else {
                    this.KlYagMRWx = null;
                }
            } finally {
                this.IG30YE5GU = false;
            }
        }
        if (fVMSvDhE6.juJ6pnCpu(2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.KlYagMRWx;
        return dialog != null ? vNtjxmzUM.cloneInContext(dialog.getContext()) : vNtjxmzUM;
    }
}
