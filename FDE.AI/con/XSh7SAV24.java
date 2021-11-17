package con;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.RG2GI7LDp;
import com.feravolt.preload.R;
import con.HelDswbLq;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public final class XSh7SAV24 extends gR4fovbO3 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public final int Bhmn1KIah;
    public boolean CpG0imbht;
    public boolean IytU16YUK;
    public final int MzoOEjc4X;
    public HelDswbLq.RG2GI7LDp NyWTwPF6V;
    public final int PSTqBLTET;
    public int cAwN510t2;
    public View dfpT1j18n;
    public PopupWindow.OnDismissListener i0Zug1mVk;
    public View iMyQMM6Qj;
    public final boolean ilHKhw3Yw;
    public final Context kmSgne1rO;
    public boolean mUqPm6GBh;
    public int nlGCs0NZs;
    public boolean o4LF8RkoQ;
    public int qFBXIgpia;
    public final Handler qVUwofr5s;
    public ViewTreeObserver vNtjxmzUM;
    public final List Eeka1udhb = new ArrayList();
    public final List dXrmkklc8 = new ArrayList();
    public final ViewTreeObserver.OnGlobalLayoutListener RG6kpfv3v = new ywLNtYaFP(this);
    public final View.OnAttachStateChangeListener ixWaw2akD = new mYYIIpcht(this);
    public final MNbAFuzGl sk5s77z6Q = new iFKnyAZAM(this);
    public int WaUP0CF08 = 0;
    public int i8XZMQc6Z = 0;
    public boolean AqaWJg0b4 = false;

    public XSh7SAV24(Context context, View view, int i, int i2, boolean z) {
        int i3 = 0;
        this.kmSgne1rO = context;
        this.dfpT1j18n = view;
        this.PSTqBLTET = i;
        this.MzoOEjc4X = i2;
        this.ilHKhw3Yw = z;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        this.cAwN510t2 = RBJDIwG1D.dIocxURUo(view) != 1 ? 1 : i3;
        Resources resources = context.getResources();
        this.Bhmn1KIah = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.qVUwofr5s = new Handler();
    }

    @Override // con.gR4fovbO3
    public void Bhmn1KIah(View view) {
        if (this.dfpT1j18n != view) {
            this.dfpT1j18n = view;
            int i = this.WaUP0CF08;
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            this.i8XZMQc6Z = Gravity.getAbsoluteGravity(i, RBJDIwG1D.dIocxURUo(view));
        }
    }

    @Override // con.JU5oYK2sJ
    public ListView CBQ5d1kRq() {
        if (this.dXrmkklc8.isEmpty()) {
            return null;
        }
        List list = this.dXrmkklc8;
        return ((W85tF8RjC) list.get(list.size() - 1)).q3BipwRCk.Bhmn1KIah;
    }

    @Override // con.gR4fovbO3
    public void Eeka1udhb(boolean z) {
        this.mUqPm6GBh = z;
    }

    @Override // con.JU5oYK2sJ
    public void GPLPRo6go() {
        if (!J4Ux7ym32()) {
            for (RG2GI7LDp rG2GI7LDp : this.Eeka1udhb) {
                ixWaw2akD(rG2GI7LDp);
            }
            this.Eeka1udhb.clear();
            View view = this.dfpT1j18n;
            this.iMyQMM6Qj = view;
            if (view != null) {
                boolean z = this.vNtjxmzUM == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.vNtjxmzUM = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.RG6kpfv3v);
                }
                this.iMyQMM6Qj.addOnAttachStateChangeListener(this.ixWaw2akD);
            }
        }
    }

    @Override // con.JU5oYK2sJ
    public boolean J4Ux7ym32() {
        return this.dXrmkklc8.size() > 0 && ((W85tF8RjC) this.dXrmkklc8.get(0)).q3BipwRCk.J4Ux7ym32();
    }

    @Override // con.gR4fovbO3
    public void MzoOEjc4X(int i) {
        if (this.WaUP0CF08 != i) {
            this.WaUP0CF08 = i;
            View view = this.dfpT1j18n;
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            this.i8XZMQc6Z = Gravity.getAbsoluteGravity(i, RBJDIwG1D.dIocxURUo(view));
        }
    }

    @Override // con.gR4fovbO3
    public void PSTqBLTET(boolean z) {
        this.AqaWJg0b4 = z;
    }

    @Override // con.HelDswbLq
    public void Puu3Rhg4F(HelDswbLq.RG2GI7LDp rG2GI7LDp) {
        this.NyWTwPF6V = rG2GI7LDp;
    }

    @Override // con.gR4fovbO3
    public void dXrmkklc8(int i) {
        this.CpG0imbht = true;
        this.nlGCs0NZs = i;
    }

    @Override // con.JU5oYK2sJ
    public void dismiss() {
        int size = this.dXrmkklc8.size();
        if (size > 0) {
            W85tF8RjC[] w85tF8RjCArr = (W85tF8RjC[]) this.dXrmkklc8.toArray(new W85tF8RjC[size]);
            for (int i = size - 1; i >= 0; i--) {
                W85tF8RjC w85tF8RjC = w85tF8RjCArr[i];
                if (w85tF8RjC.q3BipwRCk.J4Ux7ym32()) {
                    w85tF8RjC.q3BipwRCk.dismiss();
                }
            }
        }
    }

    @Override // con.gR4fovbO3
    public void ilHKhw3Yw(int i) {
        this.IytU16YUK = true;
        this.qFBXIgpia = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0178  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void ixWaw2akD(androidx.appcompat.view.menu.RG2GI7LDp r17) {
        /*
        // Method dump skipped, instructions count: 470
        */
        throw new UnsupportedOperationException("Method not decompiled: con.XSh7SAV24.ixWaw2akD(androidx.appcompat.view.menu.RG2GI7LDp):void");
    }

    @Override // con.HelDswbLq
    public boolean kCA6Zs9sL(anclinfG8 anclinfg8) {
        for (W85tF8RjC w85tF8RjC : this.dXrmkklc8) {
            if (anclinfg8 == w85tF8RjC.J4Ux7ym32) {
                w85tF8RjC.q3BipwRCk.Bhmn1KIah.requestFocus();
                return true;
            }
        }
        if (!anclinfg8.hasVisibleItems()) {
            return false;
        }
        anclinfg8.J4Ux7ym32(this, this.kmSgne1rO);
        if (J4Ux7ym32()) {
            ixWaw2akD(anclinfg8);
        } else {
            this.Eeka1udhb.add(anclinfg8);
        }
        HelDswbLq.RG2GI7LDp rG2GI7LDp = this.NyWTwPF6V;
        if (rG2GI7LDp != null) {
            rG2GI7LDp.Bhmn1KIah(anclinfg8);
        }
        return true;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        W85tF8RjC w85tF8RjC;
        int size = this.dXrmkklc8.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                w85tF8RjC = null;
                break;
            }
            w85tF8RjC = (W85tF8RjC) this.dXrmkklc8.get(i);
            if (!w85tF8RjC.q3BipwRCk.J4Ux7ym32()) {
                break;
            }
            i++;
        }
        if (w85tF8RjC != null) {
            w85tF8RjC.J4Ux7ym32.tGV7Q6urW(false);
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
        for (W85tF8RjC w85tF8RjC : this.dXrmkklc8) {
            ListAdapter adapter = w85tF8RjC.q3BipwRCk.Bhmn1KIah.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((GWe5nrmvt) adapter).notifyDataSetChanged();
        }
    }

    @Override // con.HelDswbLq
    public void q3BipwRCk(RG2GI7LDp rG2GI7LDp, boolean z) {
        int i;
        int size = this.dXrmkklc8.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (rG2GI7LDp == ((W85tF8RjC) this.dXrmkklc8.get(i2)).J4Ux7ym32) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int i3 = i2 + 1;
            if (i3 < this.dXrmkklc8.size()) {
                ((W85tF8RjC) this.dXrmkklc8.get(i3)).J4Ux7ym32.tGV7Q6urW(false);
            }
            W85tF8RjC w85tF8RjC = (W85tF8RjC) this.dXrmkklc8.remove(i2);
            w85tF8RjC.J4Ux7ym32.dXrmkklc8(this);
            if (this.o4LF8RkoQ) {
                w85tF8RjC.q3BipwRCk.vNtjxmzUM.setExitTransition(null);
                w85tF8RjC.q3BipwRCk.vNtjxmzUM.setAnimationStyle(0);
            }
            w85tF8RjC.q3BipwRCk.dismiss();
            int size2 = this.dXrmkklc8.size();
            if (size2 > 0) {
                i = ((W85tF8RjC) this.dXrmkklc8.get(size2 - 1)).tGV7Q6urW;
            } else {
                View view = this.dfpT1j18n;
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                i = RBJDIwG1D.dIocxURUo(view) == 1 ? 0 : 1;
            }
            this.cAwN510t2 = i;
            if (size2 == 0) {
                dismiss();
                HelDswbLq.RG2GI7LDp rG2GI7LDp2 = this.NyWTwPF6V;
                if (rG2GI7LDp2 != null) {
                    rG2GI7LDp2.q3BipwRCk(rG2GI7LDp, true);
                }
                ViewTreeObserver viewTreeObserver = this.vNtjxmzUM;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.vNtjxmzUM.removeGlobalOnLayoutListener(this.RG6kpfv3v);
                    }
                    this.vNtjxmzUM = null;
                }
                this.iMyQMM6Qj.removeOnAttachStateChangeListener(this.ixWaw2akD);
                this.i0Zug1mVk.onDismiss();
            } else if (z) {
                ((W85tF8RjC) this.dXrmkklc8.get(0)).J4Ux7ym32.tGV7Q6urW(false);
            }
        }
    }

    @Override // con.gR4fovbO3
    public void qVUwofr5s(PopupWindow.OnDismissListener onDismissListener) {
        this.i0Zug1mVk = onDismissListener;
    }

    @Override // con.HelDswbLq
    public boolean tGV7Q6urW() {
        return false;
    }

    @Override // con.gR4fovbO3
    public void vPSbyrYWX(RG2GI7LDp rG2GI7LDp) {
        rG2GI7LDp.J4Ux7ym32(this, this.kmSgne1rO);
        if (J4Ux7ym32()) {
            ixWaw2akD(rG2GI7LDp);
        } else {
            this.Eeka1udhb.add(rG2GI7LDp);
        }
    }
}
