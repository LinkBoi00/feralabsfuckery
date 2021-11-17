package con;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
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
import java.util.WeakHashMap;
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
    public boolean kCA6Zs9sL(anclinfG8 anclinfg8) {
        boolean z;
        if (anclinfg8.hasVisibleItems()) {
            Ct2GXtyrO ct2GXtyrO = new Ct2GXtyrO(this.kmSgne1rO, anclinfg8, this.i8XZMQc6Z, this.MzoOEjc4X, this.qVUwofr5s, this.Eeka1udhb);
            ct2GXtyrO.dIocxURUo(this.dfpT1j18n);
            boolean RG6kpfv3v = gR4fovbO3.RG6kpfv3v(anclinfg8);
            ct2GXtyrO.Puu3Rhg4F = RG6kpfv3v;
            gR4fovbO3 gr4fovbo3 = ct2GXtyrO.oon79WMrY;
            if (gr4fovbo3 != null) {
                gr4fovbo3.PSTqBLTET(RG6kpfv3v);
            }
            ct2GXtyrO.vPSbyrYWX = this.sk5s77z6Q;
            this.sk5s77z6Q = null;
            this.Bhmn1KIah.tGV7Q6urW(false);
            joJz6MnqC jojz6mnqc = this.dXrmkklc8;
            int i = jojz6mnqc.ilHKhw3Yw;
            int i2 = !jojz6mnqc.dXrmkklc8 ? 0 : jojz6mnqc.qVUwofr5s;
            int i3 = this.qFBXIgpia;
            View view = this.WaUP0CF08;
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            if ((Gravity.getAbsoluteGravity(i3, RBJDIwG1D.dIocxURUo(view)) & 7) == 5) {
                i += this.WaUP0CF08.getWidth();
            }
            if (!ct2GXtyrO.J4Ux7ym32()) {
                if (ct2GXtyrO.iiGwOFFnr == null) {
                    z = false;
                    if (z) {
                        HelDswbLq.RG2GI7LDp rG2GI7LDp = this.dfpT1j18n;
                        if (rG2GI7LDp != null) {
                            rG2GI7LDp.Bhmn1KIah(anclinfg8);
                        }
                        return true;
                    }
                } else {
                    ct2GXtyrO.kCA6Zs9sL(i, i2, true, true);
                }
            }
            z = true;
            if (z) {
            }
        }
        return false;
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
