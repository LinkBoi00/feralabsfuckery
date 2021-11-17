package con;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.RG2GI7LDp;
import com.feravolt.preload.R;
import con.HelDswbLq;
import java.util.Objects;
/* loaded from: classes.dex */
public final class tDVlVoCRy extends gR4fovbO3 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final RG2GI7LDp Bhmn1KIah;
    public int CpG0imbht;
    public final int Eeka1udhb;
    public boolean IytU16YUK;
    public final boolean MzoOEjc4X;
    public final GWe5nrmvt PSTqBLTET;
    public View WaUP0CF08;
    public boolean cAwN510t2;
    public final joJz6MnqC dXrmkklc8;
    public HelDswbLq.RG2GI7LDp dfpT1j18n;
    public View i8XZMQc6Z;
    public ViewTreeObserver iMyQMM6Qj;
    public final int ilHKhw3Yw;
    public final Context kmSgne1rO;
    public boolean nlGCs0NZs;
    public final int qVUwofr5s;
    public PopupWindow.OnDismissListener sk5s77z6Q;
    public final ViewTreeObserver.OnGlobalLayoutListener RG6kpfv3v = new ywLNtYaFP(this);
    public final View.OnAttachStateChangeListener ixWaw2akD = new mYYIIpcht(this);
    public int qFBXIgpia = 0;

    public tDVlVoCRy(Context context, RG2GI7LDp rG2GI7LDp, View view, int i, int i2, boolean z) {
        this.kmSgne1rO = context;
        this.Bhmn1KIah = rG2GI7LDp;
        this.MzoOEjc4X = z;
        this.PSTqBLTET = new GWe5nrmvt(rG2GI7LDp, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.qVUwofr5s = i;
        this.Eeka1udhb = i2;
        Resources resources = context.getResources();
        this.ilHKhw3Yw = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.WaUP0CF08 = view;
        this.dXrmkklc8 = new joJz6MnqC(context, null, i, i2);
        rG2GI7LDp.J4Ux7ym32(this, context);
    }

    @Override // con.gR4fovbO3
    public void Bhmn1KIah(View view) {
        this.WaUP0CF08 = view;
    }

    @Override // con.JU5oYK2sJ
    public ListView CBQ5d1kRq() {
        return this.dXrmkklc8.Bhmn1KIah;
    }

    @Override // con.gR4fovbO3
    public void Eeka1udhb(boolean z) {
        this.nlGCs0NZs = z;
    }

    @Override // con.JU5oYK2sJ
    public void GPLPRo6go() {
        View view;
        boolean z = true;
        if (!J4Ux7ym32()) {
            if (this.cAwN510t2 || (view = this.WaUP0CF08) == null) {
                z = false;
            } else {
                this.i8XZMQc6Z = view;
                this.dXrmkklc8.vNtjxmzUM.setOnDismissListener(this);
                joJz6MnqC jojz6mnqc = this.dXrmkklc8;
                jojz6mnqc.iMyQMM6Qj = this;
                jojz6mnqc.Eeka1udhb(true);
                View view2 = this.i8XZMQc6Z;
                boolean z2 = this.iMyQMM6Qj == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.iMyQMM6Qj = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.RG6kpfv3v);
                }
                view2.addOnAttachStateChangeListener(this.ixWaw2akD);
                joJz6MnqC jojz6mnqc2 = this.dXrmkklc8;
                jojz6mnqc2.dfpT1j18n = view2;
                jojz6mnqc2.sk5s77z6Q = this.qFBXIgpia;
                if (!this.IytU16YUK) {
                    this.CpG0imbht = gR4fovbO3.kmSgne1rO(this.PSTqBLTET, null, this.kmSgne1rO, this.ilHKhw3Yw);
                    this.IytU16YUK = true;
                }
                this.dXrmkklc8.qVUwofr5s(this.CpG0imbht);
                this.dXrmkklc8.vNtjxmzUM.setInputMethodMode(2);
                joJz6MnqC jojz6mnqc3 = this.dXrmkklc8;
                Rect rect = this.CBQ5d1kRq;
                Objects.requireNonNull(jojz6mnqc3);
                jojz6mnqc3.mUqPm6GBh = rect != null ? new Rect(rect) : null;
                this.dXrmkklc8.GPLPRo6go();
                wRt60CcGM wrt60ccgm = this.dXrmkklc8.Bhmn1KIah;
                wrt60ccgm.setOnKeyListener(this);
                if (this.nlGCs0NZs && this.Bhmn1KIah.kmSgne1rO != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.kmSgne1rO).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) wrt60ccgm, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.Bhmn1KIah.kmSgne1rO);
                    }
                    frameLayout.setEnabled(false);
                    wrt60ccgm.addHeaderView(frameLayout, null, false);
                }
                this.dXrmkklc8.MzoOEjc4X(this.PSTqBLTET);
                this.dXrmkklc8.GPLPRo6go();
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // con.JU5oYK2sJ
    public boolean J4Ux7ym32() {
        return !this.cAwN510t2 && this.dXrmkklc8.J4Ux7ym32();
    }

    @Override // con.gR4fovbO3
    public void MzoOEjc4X(int i) {
        this.qFBXIgpia = i;
    }

    @Override // con.gR4fovbO3
    public void PSTqBLTET(boolean z) {
        this.PSTqBLTET.Bhmn1KIah = z;
    }

    @Override // con.HelDswbLq
    public void Puu3Rhg4F(HelDswbLq.RG2GI7LDp rG2GI7LDp) {
        this.dfpT1j18n = rG2GI7LDp;
    }

    @Override // con.gR4fovbO3
    public void dXrmkklc8(int i) {
        joJz6MnqC jojz6mnqc = this.dXrmkklc8;
        jojz6mnqc.qVUwofr5s = i;
        jojz6mnqc.dXrmkklc8 = true;
    }

    @Override // con.JU5oYK2sJ
    public void dismiss() {
        if (J4Ux7ym32()) {
            this.dXrmkklc8.dismiss();
        }
    }

    @Override // con.gR4fovbO3
    public void ilHKhw3Yw(int i) {
        this.dXrmkklc8.ilHKhw3Yw = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    @Override // con.HelDswbLq
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean kCA6Zs9sL(con.anclinfG8 r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x0078
            con.Ct2GXtyrO r0 = new con.Ct2GXtyrO
            android.content.Context r3 = r9.kmSgne1rO
            android.view.View r5 = r9.i8XZMQc6Z
            boolean r6 = r9.MzoOEjc4X
            int r7 = r9.qVUwofr5s
            int r8 = r9.Eeka1udhb
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            con.HelDswbLq$RG2GI7LDp r2 = r9.dfpT1j18n
            r0.dIocxURUo(r2)
            boolean r2 = con.gR4fovbO3.RG6kpfv3v(r10)
            r0.Puu3Rhg4F = r2
            con.gR4fovbO3 r3 = r0.oon79WMrY
            if (r3 == 0) goto L_0x002a
            r3.PSTqBLTET(r2)
        L_0x002a:
            android.widget.PopupWindow$OnDismissListener r2 = r9.sk5s77z6Q
            r0.vPSbyrYWX = r2
            r2 = 0
            r9.sk5s77z6Q = r2
            androidx.appcompat.view.menu.RG2GI7LDp r2 = r9.Bhmn1KIah
            r2.tGV7Q6urW(r1)
            con.joJz6MnqC r2 = r9.dXrmkklc8
            int r3 = r2.ilHKhw3Yw
            boolean r4 = r2.dXrmkklc8
            if (r4 != 0) goto L_0x0040
            r2 = r1
            goto L_0x0042
        L_0x0040:
            int r2 = r2.qVUwofr5s
        L_0x0042:
            int r4 = r9.qFBXIgpia
            android.view.View r5 = r9.WaUP0CF08
            java.util.WeakHashMap r6 = con.IuQbWntsc.q3BipwRCk
            int r5 = con.RBJDIwG1D.dIocxURUo(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x005c
            android.view.View r4 = r9.WaUP0CF08
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L_0x005c:
            boolean r4 = r0.J4Ux7ym32()
            r5 = 1
            if (r4 == 0) goto L_0x0064
            goto L_0x006d
        L_0x0064:
            android.view.View r4 = r0.iiGwOFFnr
            if (r4 != 0) goto L_0x006a
            r0 = r1
            goto L_0x006e
        L_0x006a:
            r0.kCA6Zs9sL(r3, r2, r5, r5)
        L_0x006d:
            r0 = r5
        L_0x006e:
            if (r0 == 0) goto L_0x0078
            con.HelDswbLq$RG2GI7LDp r0 = r9.dfpT1j18n
            if (r0 == 0) goto L_0x0077
            r0.Bhmn1KIah(r10)
        L_0x0077:
            return r5
        L_0x0078:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: con.tDVlVoCRy.kCA6Zs9sL(con.anclinfG8):boolean");
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.cAwN510t2 = true;
        this.Bhmn1KIah.tGV7Q6urW(true);
        ViewTreeObserver viewTreeObserver = this.iMyQMM6Qj;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.iMyQMM6Qj = this.i8XZMQc6Z.getViewTreeObserver();
            }
            this.iMyQMM6Qj.removeGlobalOnLayoutListener(this.RG6kpfv3v);
            this.iMyQMM6Qj = null;
        }
        this.i8XZMQc6Z.removeOnAttachStateChangeListener(this.ixWaw2akD);
        PopupWindow.OnDismissListener onDismissListener = this.sk5s77z6Q;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // con.HelDswbLq
    public void oon79WMrY(boolean z) {
        this.IytU16YUK = false;
        GWe5nrmvt gWe5nrmvt = this.PSTqBLTET;
        if (gWe5nrmvt != null) {
            gWe5nrmvt.notifyDataSetChanged();
        }
    }

    @Override // con.HelDswbLq
    public void q3BipwRCk(RG2GI7LDp rG2GI7LDp, boolean z) {
        if (rG2GI7LDp == this.Bhmn1KIah) {
            dismiss();
            HelDswbLq.RG2GI7LDp rG2GI7LDp2 = this.dfpT1j18n;
            if (rG2GI7LDp2 != null) {
                rG2GI7LDp2.q3BipwRCk(rG2GI7LDp, z);
            }
        }
    }

    @Override // con.gR4fovbO3
    public void qVUwofr5s(PopupWindow.OnDismissListener onDismissListener) {
        this.sk5s77z6Q = onDismissListener;
    }

    @Override // con.HelDswbLq
    public boolean tGV7Q6urW() {
        return false;
    }

    @Override // con.gR4fovbO3
    public void vPSbyrYWX(RG2GI7LDp rG2GI7LDp) {
    }
}
