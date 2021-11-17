package con;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.RG2GI7LDp;
import com.feravolt.preload.R;
import con.HelDswbLq;
import java.lang.reflect.Method;
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
    public final void ixWaw2akD(RG2GI7LDp rG2GI7LDp) {
        W85tF8RjC w85tF8RjC;
        int i;
        MenuItem menuItem;
        int i2;
        GWe5nrmvt gWe5nrmvt;
        int firstVisiblePosition;
        LayoutInflater from = LayoutInflater.from(this.kmSgne1rO);
        GWe5nrmvt gWe5nrmvt2 = new GWe5nrmvt(rG2GI7LDp, from, this.ilHKhw3Yw, R.layout.abc_cascading_menu_item_layout);
        if (!J4Ux7ym32() && this.AqaWJg0b4) {
            gWe5nrmvt2.Bhmn1KIah = true;
        } else if (J4Ux7ym32()) {
            gWe5nrmvt2.Bhmn1KIah = gR4fovbO3.RG6kpfv3v(rG2GI7LDp);
        }
        View view = null;
        int kmSgne1rO = gR4fovbO3.kmSgne1rO(gWe5nrmvt2, null, this.kmSgne1rO, this.Bhmn1KIah);
        joJz6MnqC jojz6mnqc = new joJz6MnqC(this.kmSgne1rO, null, this.PSTqBLTET, this.MzoOEjc4X);
        jojz6mnqc.V9LQMKGJe = this.sk5s77z6Q;
        jojz6mnqc.iMyQMM6Qj = this;
        jojz6mnqc.vNtjxmzUM.setOnDismissListener(this);
        jojz6mnqc.dfpT1j18n = this.dfpT1j18n;
        jojz6mnqc.sk5s77z6Q = this.i8XZMQc6Z;
        jojz6mnqc.Eeka1udhb(true);
        jojz6mnqc.vNtjxmzUM.setInputMethodMode(2);
        jojz6mnqc.MzoOEjc4X(gWe5nrmvt2);
        jojz6mnqc.qVUwofr5s(kmSgne1rO);
        jojz6mnqc.sk5s77z6Q = this.i8XZMQc6Z;
        if (this.dXrmkklc8.size() > 0) {
            List list = this.dXrmkklc8;
            w85tF8RjC = (W85tF8RjC) list.get(list.size() - 1);
            RG2GI7LDp rG2GI7LDp2 = w85tF8RjC.J4Ux7ym32;
            int size = rG2GI7LDp2.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = rG2GI7LDp2.getItem(i3);
                if (menuItem.hasSubMenu() && rG2GI7LDp == menuItem.getSubMenu()) {
                    break;
                }
                i3++;
            }
            if (menuItem != null) {
                wRt60CcGM wrt60ccgm = w85tF8RjC.q3BipwRCk.Bhmn1KIah;
                ListAdapter adapter = wrt60ccgm.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i2 = headerViewListAdapter.getHeadersCount();
                    gWe5nrmvt = (GWe5nrmvt) headerViewListAdapter.getWrappedAdapter();
                } else {
                    gWe5nrmvt = (GWe5nrmvt) adapter;
                    i2 = 0;
                }
                int count = gWe5nrmvt.getCount();
                int i4 = 0;
                while (true) {
                    if (i4 >= count) {
                        i4 = -1;
                        break;
                    } else if (menuItem == gWe5nrmvt.getItem(i4)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 != -1 && (firstVisiblePosition = (i4 + i2) - wrt60ccgm.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < wrt60ccgm.getChildCount()) {
                    view = wrt60ccgm.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                if (Build.VERSION.SDK_INT <= 28) {
                    Method method = joJz6MnqC.QNqj6nIzv;
                    if (method != null) {
                        try {
                            method.invoke(jojz6mnqc.vNtjxmzUM, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    jojz6mnqc.vNtjxmzUM.setTouchModal(false);
                }
                jojz6mnqc.vNtjxmzUM.setEnterTransition(null);
                List list2 = this.dXrmkklc8;
                wRt60CcGM wrt60ccgm2 = ((W85tF8RjC) list2.get(list2.size() - 1)).q3BipwRCk.Bhmn1KIah;
                int[] iArr = new int[2];
                wrt60ccgm2.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.iMyQMM6Qj.getWindowVisibleDisplayFrame(rect);
                int i5 = (this.cAwN510t2 != 1 ? iArr[0] - kmSgne1rO >= 0 : (wrt60ccgm2.getWidth() + iArr[0]) + kmSgne1rO > rect.right) ? 0 : 1;
                boolean z = i5 == 1;
                this.cAwN510t2 = i5;
                jojz6mnqc.dfpT1j18n = view;
                if ((this.i8XZMQc6Z & 5) == 5) {
                    if (!z) {
                        kmSgne1rO = view.getWidth();
                        i = 0 - kmSgne1rO;
                    }
                    i = kmSgne1rO + 0;
                } else {
                    if (z) {
                        kmSgne1rO = view.getWidth();
                        i = kmSgne1rO + 0;
                    }
                    i = 0 - kmSgne1rO;
                }
                jojz6mnqc.ilHKhw3Yw = i;
                jojz6mnqc.ixWaw2akD = true;
                jojz6mnqc.RG6kpfv3v = true;
                jojz6mnqc.PSTqBLTET(0);
            } else {
                if (this.IytU16YUK) {
                    jojz6mnqc.ilHKhw3Yw = this.qFBXIgpia;
                }
                if (this.CpG0imbht) {
                    jojz6mnqc.PSTqBLTET(this.nlGCs0NZs);
                }
                Rect rect2 = this.CBQ5d1kRq;
                jojz6mnqc.mUqPm6GBh = rect2 != null ? new Rect(rect2) : null;
            }
            this.dXrmkklc8.add(new W85tF8RjC(jojz6mnqc, rG2GI7LDp, this.cAwN510t2));
            jojz6mnqc.GPLPRo6go();
            wRt60CcGM wrt60ccgm3 = jojz6mnqc.Bhmn1KIah;
            wrt60ccgm3.setOnKeyListener(this);
            if (w85tF8RjC == null && this.mUqPm6GBh && rG2GI7LDp.kmSgne1rO != null) {
                FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) wrt60ccgm3, false);
                frameLayout.setEnabled(false);
                ((TextView) frameLayout.findViewById(16908310)).setText(rG2GI7LDp.kmSgne1rO);
                wrt60ccgm3.addHeaderView(frameLayout, null, false);
                jojz6mnqc.GPLPRo6go();
                return;
            }
            return;
        }
        w85tF8RjC = null;
        view = null;
        if (view == null) {
        }
        this.dXrmkklc8.add(new W85tF8RjC(jojz6mnqc, rG2GI7LDp, this.cAwN510t2));
        jojz6mnqc.GPLPRo6go();
        wRt60CcGM wrt60ccgm32 = jojz6mnqc.Bhmn1KIah;
        wrt60ccgm32.setOnKeyListener(this);
        if (w85tF8RjC == null) {
        }
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
