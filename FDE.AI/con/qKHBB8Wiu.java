package con;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.RG2GI7LDp;
import java.util.List;
import java.util.Objects;
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
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.view.Window$Callback r0 = r6.CBQ5d1kRq
            boolean r0 = r0.dispatchKeyShortcutEvent(r7)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0070
            con.Jg0aTLb6g r0 = r6.kmSgne1rO
            int r3 = r7.getKeyCode()
            r0.qFBXIgpia()
            con.zhWsuDChl r4 = r0.Eeka1udhb
            if (r4 == 0) goto L_0x003f
            con.qTSiJXW5w r4 = (con.qTSiJXW5w) r4
            con.jgvfJ83pS r4 = r4.yWvV4ePLl
            if (r4 != 0) goto L_0x001e
            goto L_0x003b
        L_0x001e:
            androidx.appcompat.view.menu.RG2GI7LDp r4 = r4.PSTqBLTET
            if (r4 == 0) goto L_0x003b
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r2) goto L_0x0032
            r5 = r2
            goto L_0x0033
        L_0x0032:
            r5 = r1
        L_0x0033:
            r4.setQwertyMode(r5)
            boolean r3 = r4.performShortcut(r3, r7, r1)
            goto L_0x003c
        L_0x003b:
            r3 = r1
        L_0x003c:
            if (r3 == 0) goto L_0x003f
            goto L_0x006b
        L_0x003f:
            con.sF46ToYwT r3 = r0.TyB1UUd72
            if (r3 == 0) goto L_0x0054
            int r4 = r7.getKeyCode()
            boolean r3 = r0.NyWTwPF6V(r3, r4, r7, r2)
            if (r3 == 0) goto L_0x0054
            con.sF46ToYwT r7 = r0.TyB1UUd72
            if (r7 == 0) goto L_0x006b
            r7.CBQ5d1kRq = r2
            goto L_0x006b
        L_0x0054:
            con.sF46ToYwT r3 = r0.TyB1UUd72
            if (r3 != 0) goto L_0x006d
            con.sF46ToYwT r3 = r0.IytU16YUK(r1)
            r0.vNtjxmzUM(r3, r7)
            int r4 = r7.getKeyCode()
            boolean r7 = r0.NyWTwPF6V(r3, r4, r7, r2)
            r3.vPSbyrYWX = r1
            if (r7 == 0) goto L_0x006d
        L_0x006b:
            r7 = r2
            goto L_0x006e
        L_0x006d:
            r7 = r1
        L_0x006e:
            if (r7 == 0) goto L_0x0071
        L_0x0070:
            r1 = r2
        L_0x0071:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: con.qKHBB8Wiu.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
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
    public final android.view.ActionMode q3BipwRCk(android.view.ActionMode.Callback r11) {
        /*
        // Method dump skipped, instructions count: 521
        */
        throw new UnsupportedOperationException("Method not decompiled: con.qKHBB8Wiu.q3BipwRCk(android.view.ActionMode$Callback):android.view.ActionMode");
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.CBQ5d1kRq.onSearchRequested(searchEvent);
    }
}
