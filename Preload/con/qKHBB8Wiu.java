package con;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.RG2GI7LDp;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ViewStubCompat;
import com.feravolt.preload.R;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class qKHBB8Wiu implements Window.Callback {
    public final Window.Callback CBQ5d1kRq;
    public final /* synthetic */ Jg0aTLb6g kmSgne1rO;

    public qKHBB8Wiu(Jg0aTLb6g jg0aTLb6g, Window.Callback callback) {
        this.kmSgne1rO = jg0aTLb6g;
        if (callback != null) {
            this.CBQ5d1kRq = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.CBQ5d1kRq.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.kmSgne1rO.ixWaw2akD(keyEvent) || this.CBQ5d1kRq.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r3 != false) goto L_0x006b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r7 != false) goto L_0x006b;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // android.view.Window.Callback
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        RG2GI7LDp rG2GI7LDp;
        if (!this.CBQ5d1kRq.dispatchKeyShortcutEvent(keyEvent)) {
            Jg0aTLb6g jg0aTLb6g = this.kmSgne1rO;
            int keyCode = keyEvent.getKeyCode();
            jg0aTLb6g.qFBXIgpia();
            zhWsuDChl zhwsudchl = jg0aTLb6g.Eeka1udhb;
            if (zhwsudchl != null) {
                jgvfJ83pS jgvfj83ps = ((qTSiJXW5w) zhwsudchl).yWvV4ePLl;
                if (jgvfj83ps == null || (rG2GI7LDp = jgvfj83ps.PSTqBLTET) == null) {
                    z2 = false;
                } else {
                    rG2GI7LDp.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
                    z2 = rG2GI7LDp.performShortcut(keyCode, keyEvent, 0);
                }
            }
            sF46ToYwT sf46toywt = jg0aTLb6g.TyB1UUd72;
            if (sf46toywt == null || !jg0aTLb6g.NyWTwPF6V(sf46toywt, keyEvent.getKeyCode(), keyEvent, 1)) {
                if (jg0aTLb6g.TyB1UUd72 == null) {
                    sF46ToYwT IytU16YUK = jg0aTLb6g.IytU16YUK(0);
                    jg0aTLb6g.vNtjxmzUM(IytU16YUK, keyEvent);
                    boolean NyWTwPF6V = jg0aTLb6g.NyWTwPF6V(IytU16YUK, keyEvent.getKeyCode(), keyEvent, 1);
                    IytU16YUK.vPSbyrYWX = false;
                }
                z = false;
                if (!z) {
                    return false;
                }
            } else {
                sF46ToYwT sf46toywt2 = jg0aTLb6g.TyB1UUd72;
                if (sf46toywt2 != null) {
                    sf46toywt2.CBQ5d1kRq = true;
                }
            }
            z = true;
            if (!z) {
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.CBQ5d1kRq.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.CBQ5d1kRq.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.CBQ5d1kRq.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(ActionMode actionMode) {
        this.CBQ5d1kRq.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(ActionMode actionMode) {
        this.CBQ5d1kRq.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.CBQ5d1kRq.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0 || (menu instanceof RG2GI7LDp)) {
            return this.CBQ5d1kRq.onCreatePanelMenu(i, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public View onCreatePanelView(int i) {
        return this.CBQ5d1kRq.onCreatePanelView(i);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.CBQ5d1kRq.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.CBQ5d1kRq.onMenuItemSelected(i, menuItem);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        this.CBQ5d1kRq.onMenuOpened(i, menu);
        Jg0aTLb6g jg0aTLb6g = this.kmSgne1rO;
        Objects.requireNonNull(jg0aTLb6g);
        if (i == 108) {
            jg0aTLb6g.qFBXIgpia();
            zhWsuDChl zhwsudchl = jg0aTLb6g.Eeka1udhb;
            if (zhwsudchl != null) {
                zhwsudchl.q3BipwRCk(true);
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.CBQ5d1kRq.onPanelClosed(i, menu);
        Jg0aTLb6g jg0aTLb6g = this.kmSgne1rO;
        Objects.requireNonNull(jg0aTLb6g);
        if (i == 108) {
            jg0aTLb6g.qFBXIgpia();
            zhWsuDChl zhwsudchl = jg0aTLb6g.Eeka1udhb;
            if (zhwsudchl != null) {
                zhwsudchl.q3BipwRCk(false);
            }
        } else if (i == 0) {
            sF46ToYwT IytU16YUK = jg0aTLb6g.IytU16YUK(i);
            if (IytU16YUK.kmSgne1rO) {
                jg0aTLb6g.dXrmkklc8(IytU16YUK, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z) {
        this.CBQ5d1kRq.onPointerCaptureChanged(z);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        RG2GI7LDp rG2GI7LDp = menu instanceof RG2GI7LDp ? (RG2GI7LDp) menu : null;
        if (i == 0 && rG2GI7LDp == null) {
            return false;
        }
        if (rG2GI7LDp != null) {
            rG2GI7LDp.WaUP0CF08 = true;
        }
        boolean onPreparePanel = this.CBQ5d1kRq.onPreparePanel(i, view, menu);
        if (rG2GI7LDp != null) {
            rG2GI7LDp.WaUP0CF08 = false;
        }
        return onPreparePanel;
    }

    @Override // android.view.Window.Callback
    public void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        RG2GI7LDp rG2GI7LDp = this.kmSgne1rO.IytU16YUK(0).Puu3Rhg4F;
        if (rG2GI7LDp != null) {
            this.CBQ5d1kRq.onProvideKeyboardShortcuts(list, rG2GI7LDp, i);
        } else {
            this.CBQ5d1kRq.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.CBQ5d1kRq.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.CBQ5d1kRq.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        this.CBQ5d1kRq.onWindowFocusChanged(z);
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.Window.Callback
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        Objects.requireNonNull(this.kmSgne1rO);
        if (i != 0) {
            return this.CBQ5d1kRq.onWindowStartingActionMode(callback, i);
        }
        return q3BipwRCk(callback);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final ActionMode q3BipwRCk(ActionMode.Callback callback) {
        pOLFExxoD polfexxod;
        pOLFExxoD polfexxod2;
        zmOE3WTfy zmoe3wtfy;
        fnUv4KsJz fnuv4ksjz;
        zmOE3WTfy zmoe3wtfy2;
        LKa8y802S lKa8y802S = new LKa8y802S(this.kmSgne1rO.PSTqBLTET, callback);
        Jg0aTLb6g jg0aTLb6g = this.kmSgne1rO;
        Objects.requireNonNull(jg0aTLb6g);
        pOLFExxoD polfexxod3 = jg0aTLb6g.i8XZMQc6Z;
        if (polfexxod3 != null) {
            polfexxod3.tGV7Q6urW();
        }
        nWDNmUg0R nwdnmug0r = new nWDNmUg0R(jg0aTLb6g, lKa8y802S);
        jg0aTLb6g.qFBXIgpia();
        zhWsuDChl zhwsudchl = jg0aTLb6g.Eeka1udhb;
        boolean z = true;
        if (zhwsudchl != null) {
            qTSiJXW5w qtsijxw5w = (qTSiJXW5w) zhwsudchl;
            jgvfJ83pS jgvfj83ps = qtsijxw5w.yWvV4ePLl;
            if (jgvfj83ps != null) {
                jgvfj83ps.tGV7Q6urW();
            }
            qtsijxw5w.tGV7Q6urW.setHideOnContentScrollEnabled(false);
            qtsijxw5w.iiGwOFFnr.Puu3Rhg4F();
            jgvfJ83pS jgvfj83ps2 = new jgvfJ83pS(qtsijxw5w, qtsijxw5w.iiGwOFFnr.getContext(), nwdnmug0r);
            jgvfj83ps2.PSTqBLTET.i8XZMQc6Z();
            try {
                if (jgvfj83ps2.MzoOEjc4X.dIocxURUo(jgvfj83ps2, jgvfj83ps2.PSTqBLTET)) {
                    qtsijxw5w.yWvV4ePLl = jgvfj83ps2;
                    jgvfj83ps2.yWvV4ePLl();
                    qtsijxw5w.iiGwOFFnr.iiGwOFFnr(jgvfj83ps2);
                    qtsijxw5w.kCA6Zs9sL(true);
                    qtsijxw5w.iiGwOFFnr.sendAccessibilityEvent(32);
                } else {
                    jgvfj83ps2 = null;
                }
                jg0aTLb6g.i8XZMQc6Z = jgvfj83ps2;
                if (!(jgvfj83ps2 == null || (zmoe3wtfy2 = jg0aTLb6g.qVUwofr5s) == null)) {
                    zmoe3wtfy2.J4Ux7ym32(jgvfj83ps2);
                }
            } finally {
                jgvfj83ps2.PSTqBLTET.WaUP0CF08();
            }
        }
        if (jg0aTLb6g.i8XZMQc6Z == null) {
            jg0aTLb6g.WaUP0CF08();
            pOLFExxoD polfexxod4 = jg0aTLb6g.i8XZMQc6Z;
            if (polfexxod4 != null) {
                polfexxod4.tGV7Q6urW();
            }
            zmOE3WTfy zmoe3wtfy3 = jg0aTLb6g.qVUwofr5s;
            if (zmoe3wtfy3 != null && !jg0aTLb6g.zHl31GGXU) {
                try {
                    polfexxod = zmoe3wtfy3.iiGwOFFnr(nwdnmug0r);
                } catch (AbstractMethodError unused) {
                }
                if (polfexxod == null) {
                    jg0aTLb6g.i8XZMQc6Z = polfexxod;
                } else {
                    if (jg0aTLb6g.dfpT1j18n == null) {
                        if (jg0aTLb6g.V9LQMKGJe) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = jg0aTLb6g.PSTqBLTET.getTheme();
                            theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme newTheme = jg0aTLb6g.PSTqBLTET.getResources().newTheme();
                                newTheme.setTo(theme);
                                newTheme.applyStyle(typedValue.resourceId, true);
                                fnUv4KsJz fnuv4ksjz2 = new fnUv4KsJz(jg0aTLb6g.PSTqBLTET, 0);
                                fnuv4ksjz2.getTheme().setTo(newTheme);
                                fnuv4ksjz = fnuv4ksjz2;
                            } else {
                                fnuv4ksjz = jg0aTLb6g.PSTqBLTET;
                            }
                            jg0aTLb6g.dfpT1j18n = new ActionBarContextView(fnuv4ksjz, null);
                            PopupWindow popupWindow = new PopupWindow(fnuv4ksjz, (AttributeSet) null, (int) R.attr.actionModePopupWindowStyle);
                            jg0aTLb6g.iMyQMM6Qj = popupWindow;
                            PpOXeTHUw.dIocxURUo(popupWindow, 2);
                            jg0aTLb6g.iMyQMM6Qj.setContentView(jg0aTLb6g.dfpT1j18n);
                            jg0aTLb6g.iMyQMM6Qj.setWidth(-1);
                            fnuv4ksjz.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                            jg0aTLb6g.dfpT1j18n.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, fnuv4ksjz.getResources().getDisplayMetrics()));
                            jg0aTLb6g.iMyQMM6Qj.setHeight(-2);
                            jg0aTLb6g.cAwN510t2 = new vYqi0U9AH(jg0aTLb6g, 1);
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) jg0aTLb6g.qFBXIgpia.findViewById(R.id.action_mode_bar_stub);
                            if (viewStubCompat != null) {
                                jg0aTLb6g.qFBXIgpia();
                                zhWsuDChl zhwsudchl2 = jg0aTLb6g.Eeka1udhb;
                                Context J4Ux7ym32 = zhwsudchl2 != null ? zhwsudchl2.J4Ux7ym32() : null;
                                if (J4Ux7ym32 == null) {
                                    J4Ux7ym32 = jg0aTLb6g.PSTqBLTET;
                                }
                                viewStubCompat.setLayoutInflater(LayoutInflater.from(J4Ux7ym32));
                                jg0aTLb6g.dfpT1j18n = (ActionBarContextView) viewStubCompat.q3BipwRCk();
                            }
                        }
                    }
                    if (jg0aTLb6g.dfpT1j18n != null) {
                        jg0aTLb6g.WaUP0CF08();
                        jg0aTLb6g.dfpT1j18n.Puu3Rhg4F();
                        Context context = jg0aTLb6g.dfpT1j18n.getContext();
                        ActionBarContextView actionBarContextView = jg0aTLb6g.dfpT1j18n;
                        if (jg0aTLb6g.iMyQMM6Qj != null) {
                            z = false;
                        }
                        IZ3p17SRG iZ3p17SRG = new IZ3p17SRG(context, actionBarContextView, nwdnmug0r, z);
                        if (nwdnmug0r.dIocxURUo(iZ3p17SRG, iZ3p17SRG.Eeka1udhb)) {
                            iZ3p17SRG.yWvV4ePLl();
                            jg0aTLb6g.dfpT1j18n.iiGwOFFnr(iZ3p17SRG);
                            jg0aTLb6g.i8XZMQc6Z = iZ3p17SRG;
                            if (jg0aTLb6g.i0Zug1mVk()) {
                                jg0aTLb6g.dfpT1j18n.setAlpha(0.0f);
                                Roohga8FY J4Ux7ym322 = IuQbWntsc.J4Ux7ym32(jg0aTLb6g.dfpT1j18n);
                                J4Ux7ym322.q3BipwRCk(1.0f);
                                jg0aTLb6g.IytU16YUK = J4Ux7ym322;
                                vXCQlFRoO vxcqlfroo = new vXCQlFRoO(jg0aTLb6g);
                                View view = (View) J4Ux7ym322.q3BipwRCk.get();
                                if (view != null) {
                                    J4Ux7ym322.kCA6Zs9sL(view, vxcqlfroo);
                                }
                            } else {
                                jg0aTLb6g.dfpT1j18n.setAlpha(1.0f);
                                jg0aTLb6g.dfpT1j18n.setVisibility(0);
                                jg0aTLb6g.dfpT1j18n.sendAccessibilityEvent(32);
                                if (jg0aTLb6g.dfpT1j18n.getParent() instanceof View) {
                                    WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                                    cyVJjwbRF.tGV7Q6urW((View) jg0aTLb6g.dfpT1j18n.getParent());
                                }
                            }
                            if (jg0aTLb6g.iMyQMM6Qj != null) {
                                jg0aTLb6g.MzoOEjc4X.getDecorView().post(jg0aTLb6g.cAwN510t2);
                            }
                        } else {
                            jg0aTLb6g.i8XZMQc6Z = null;
                        }
                    }
                }
                polfexxod2 = jg0aTLb6g.i8XZMQc6Z;
                if (!(polfexxod2 == null || (zmoe3wtfy = jg0aTLb6g.qVUwofr5s) == null)) {
                    zmoe3wtfy.J4Ux7ym32(polfexxod2);
                }
                jg0aTLb6g.i8XZMQc6Z = jg0aTLb6g.i8XZMQc6Z;
            }
            polfexxod = null;
            if (polfexxod == null) {
            }
            polfexxod2 = jg0aTLb6g.i8XZMQc6Z;
            if (polfexxod2 == null) {
                zmoe3wtfy.J4Ux7ym32(polfexxod2);
            }
            jg0aTLb6g.i8XZMQc6Z = jg0aTLb6g.i8XZMQc6Z;
        }
        pOLFExxoD polfexxod5 = jg0aTLb6g.i8XZMQc6Z;
        if (polfexxod5 != null) {
            return lKa8y802S.vPSbyrYWX(polfexxod5);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.CBQ5d1kRq.onSearchRequested(searchEvent);
    }
}
