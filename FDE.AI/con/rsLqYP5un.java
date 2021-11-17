package con;

import android.annotation.SuppressLint;
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
    public android.view.LayoutInflater vNtjxmzUM(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r0 = super.vNtjxmzUM(r8)
            boolean r1 = r7.M66hQ219i
            java.lang.String r2 = "FragmentManager"
            r3 = 2
            if (r1 == 0) goto L_0x009b
            boolean r4 = r7.IG30YE5GU
            if (r4 == 0) goto L_0x0011
            goto L_0x009b
        L_0x0011:
            if (r1 != 0) goto L_0x0014
            goto L_0x006f
        L_0x0014:
            boolean r1 = r7.YmNRDyka4
            if (r1 != 0) goto L_0x006f
            r1 = 0
            r4 = 1
            r7.IG30YE5GU = r4     // Catch: all -> 0x006b
            android.app.Dialog r8 = r7.INnK5Rew6(r8)     // Catch: all -> 0x006b
            r7.KlYagMRWx = r8     // Catch: all -> 0x006b
            boolean r5 = r7.M66hQ219i     // Catch: all -> 0x006b
            if (r5 == 0) goto L_0x0065
            int r5 = r7.SuKhTJIQc     // Catch: all -> 0x006b
            if (r5 == r4) goto L_0x003b
            if (r5 == r3) goto L_0x003b
            r6 = 3
            if (r5 == r6) goto L_0x0030
            goto L_0x003e
        L_0x0030:
            android.view.Window r5 = r8.getWindow()     // Catch: all -> 0x006b
            if (r5 == 0) goto L_0x003b
            r6 = 24
            r5.addFlags(r6)     // Catch: all -> 0x006b
        L_0x003b:
            r8.requestWindowFeature(r4)     // Catch: all -> 0x006b
        L_0x003e:
            android.content.Context r8 = r7.Puu3Rhg4F()     // Catch: all -> 0x006b
            boolean r5 = r8 instanceof android.app.Activity     // Catch: all -> 0x006b
            if (r5 == 0) goto L_0x004d
            android.app.Dialog r5 = r7.KlYagMRWx     // Catch: all -> 0x006b
            android.app.Activity r8 = (android.app.Activity) r8     // Catch: all -> 0x006b
            r5.setOwnerActivity(r8)     // Catch: all -> 0x006b
        L_0x004d:
            android.app.Dialog r8 = r7.KlYagMRWx     // Catch: all -> 0x006b
            boolean r5 = r7.Dr7UqlxEV     // Catch: all -> 0x006b
            r8.setCancelable(r5)     // Catch: all -> 0x006b
            android.app.Dialog r8 = r7.KlYagMRWx     // Catch: all -> 0x006b
            android.content.DialogInterface$OnCancelListener r5 = r7.KBYw84i3W     // Catch: all -> 0x006b
            r8.setOnCancelListener(r5)     // Catch: all -> 0x006b
            android.app.Dialog r8 = r7.KlYagMRWx     // Catch: all -> 0x006b
            android.content.DialogInterface$OnDismissListener r5 = r7.INnK5Rew6     // Catch: all -> 0x006b
            r8.setOnDismissListener(r5)     // Catch: all -> 0x006b
            r7.YmNRDyka4 = r4     // Catch: all -> 0x006b
            goto L_0x0068
        L_0x0065:
            r8 = 0
            r7.KlYagMRWx = r8     // Catch: all -> 0x006b
        L_0x0068:
            r7.IG30YE5GU = r1
            goto L_0x006f
        L_0x006b:
            r8 = move-exception
            r7.IG30YE5GU = r1
            throw r8
        L_0x006f:
            boolean r8 = con.fVMSvDhE6.juJ6pnCpu(r3)
            if (r8 == 0) goto L_0x008e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "get layout inflater for DialogFragment "
            r8.append(r1)
            r8.append(r7)
            java.lang.String r1 = " from dialog context"
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r2, r8)
        L_0x008e:
            android.app.Dialog r8 = r7.KlYagMRWx
            if (r8 == 0) goto L_0x009a
            android.content.Context r8 = r8.getContext()
            android.view.LayoutInflater r0 = r0.cloneInContext(r8)
        L_0x009a:
            return r0
        L_0x009b:
            boolean r8 = con.fVMSvDhE6.juJ6pnCpu(r3)
            if (r8 == 0) goto L_0x00d2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "getting layout inflater for DialogFragment "
            r8.append(r1)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            boolean r1 = r7.M66hQ219i
            if (r1 != 0) goto L_0x00be
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "mShowsDialog = false: "
            goto L_0x00c5
        L_0x00be:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "mCreatingDialog = true: "
        L_0x00c5:
            r1.append(r3)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            android.util.Log.d(r2, r8)
        L_0x00d2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: con.rsLqYP5un.vNtjxmzUM(android.os.Bundle):android.view.LayoutInflater");
    }
}
