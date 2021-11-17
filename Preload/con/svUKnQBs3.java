package con;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.feravolt.preload.R;
import java.util.Objects;
import java.util.UUID;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class svUKnQBs3 extends wnbPPCp4x implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    public boolean AqaWJg0b4;
    public final Rect CpG0imbht;
    public gdEmqfwpT Eeka1udhb;
    public final Rect IytU16YUK;
    public final View RG6kpfv3v;
    public v7LZYrHVe WaUP0CF08;
    public final Ow3xCcw6e cAwN510t2;
    public dkOQrHvWO dXrmkklc8;
    public final WindowManager ixWaw2akD;
    public final RNEcgN6dQ nlGCs0NZs;
    public boolean qFBXIgpia;
    public final WindowManager.LayoutParams sk5s77z6Q;
    public final RNEcgN6dQ i8XZMQc6Z = u51fgFYkV.dIocxURUo(null, null, 2, null);
    public final RNEcgN6dQ dfpT1j18n = u51fgFYkV.dIocxURUo(null, null, 2, null);
    public final UBY2Inzw8 iMyQMM6Qj = u51fgFYkV.tGV7Q6urW(new nwvyEZJPU(this));

    public svUKnQBs3(gdEmqfwpT gdemqfwpt, dkOQrHvWO dkoqrhvwo, String str, View view, AU29aHa4X aU29aHa4X, v7LZYrHVe v7lzyrhve, UUID uuid) {
        super(view.getContext(), null, 0);
        this.Eeka1udhb = gdemqfwpt;
        this.dXrmkklc8 = dkoqrhvwo;
        this.RG6kpfv3v = view;
        Object systemService = view.getContext().getSystemService("window");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.ixWaw2akD = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        int i = layoutParams.flags & -8552473;
        layoutParams.flags = i;
        layoutParams.flags = i | 262144;
        layoutParams.type = 1000;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.sk5s77z6Q = layoutParams;
        this.WaUP0CF08 = v7lzyrhve;
        float f = (float) 30;
        this.cAwN510t2 = Build.VERSION.SDK_INT >= 29 ? new n3uLds9km() : new G8YbTxhtp();
        this.IytU16YUK = new Rect();
        this.CpG0imbht = new Rect();
        setId(16908290);
        setTag(R.id.view_tree_lifecycle_owner, pA5wCkne4.yWvV4ePLl(view));
        setTag(R.id.view_tree_view_model_store_owner, D3DEikrvb.oon79WMrY(view));
        setTag(R.id.view_tree_saved_state_registry_owner, pA5wCkne4.oon79WMrY(view));
        view.addOnAttachStateChangeListener(this);
        oon79WMrY();
        setTag(R.id.compose_view_saveable_id_tag, anXlDk6fV.iMyQMM6Qj("Popup:", uuid));
        setClipChildren(false);
        setElevation(aU29aHa4X.MzoOEjc4X(f));
        setOutlineProvider(new qao61QYhY());
        Dwnr31ZIj dwnr31ZIj = Dwnr31ZIj.q3BipwRCk;
        this.nlGCs0NZs = u51fgFYkV.dIocxURUo(Dwnr31ZIj.J4Ux7ym32, null, 2, null);
    }

    public final void CBQ5d1kRq() {
        YWiUMZOtw yWiUMZOtw;
        long j;
        QWpF893u7 qWpF893u7 = (QWpF893u7) ((prCJwNx2x) this.i8XZMQc6Z).getValue();
        if (qWpF893u7 != null && (yWiUMZOtw = (YWiUMZOtw) ((prCJwNx2x) this.dfpT1j18n).getValue()) != null) {
            long j2 = yWiUMZOtw.q3BipwRCk;
            Rect rect = this.IytU16YUK;
            this.RG6kpfv3v.getWindowVisibleDisplayFrame(rect);
            long dIocxURUo = D3DEikrvb.dIocxURUo(rect.right - rect.left, rect.bottom - rect.top);
            v7LZYrHVe v7lzyrhve = this.WaUP0CF08;
            int ordinal = v7lzyrhve.q3BipwRCk.ordinal();
            if (ordinal == 0) {
                j = dnBSj5uJN.tGV7Q6urW(ZtJSMDYDl.q3BipwRCk(v7lzyrhve.J4Ux7ym32) + qWpF893u7.q3BipwRCk, ZtJSMDYDl.J4Ux7ym32(v7lzyrhve.J4Ux7ym32) + qWpF893u7.J4Ux7ym32);
            } else if (ordinal == 1) {
                j = dnBSj5uJN.tGV7Q6urW((ZtJSMDYDl.q3BipwRCk(v7lzyrhve.J4Ux7ym32) + qWpF893u7.q3BipwRCk) - YWiUMZOtw.tGV7Q6urW(j2), ZtJSMDYDl.J4Ux7ym32(v7lzyrhve.J4Ux7ym32) + qWpF893u7.J4Ux7ym32);
            } else if (ordinal == 2) {
                j = dnBSj5uJN.tGV7Q6urW((ZtJSMDYDl.q3BipwRCk(v7lzyrhve.J4Ux7ym32) + qWpF893u7.q3BipwRCk) - (YWiUMZOtw.tGV7Q6urW(j2) / 2), ZtJSMDYDl.J4Ux7ym32(v7lzyrhve.J4Ux7ym32) + qWpF893u7.J4Ux7ym32);
            } else {
                throw new dnCerKhAM();
            }
            this.sk5s77z6Q.x = ZtJSMDYDl.q3BipwRCk(j);
            this.sk5s77z6Q.y = ZtJSMDYDl.J4Ux7ym32(j);
            if (this.dXrmkklc8.kCA6Zs9sL) {
                this.cAwN510t2.q3BipwRCk(this, YWiUMZOtw.tGV7Q6urW(dIocxURUo), YWiUMZOtw.J4Ux7ym32(dIocxURUo));
            }
            this.ixWaw2akD.updateViewLayout(this, this.sk5s77z6Q);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.dXrmkklc8.J4Ux7ym32) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                gdEmqfwpT gdemqfwpt = this.Eeka1udhb;
                if (gdemqfwpt != null) {
                    gdemqfwpt.GPLPRo6go();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // con.wnbPPCp4x
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.AqaWJg0b4;
    }

    @Override // con.wnbPPCp4x
    public void iiGwOFFnr(int i, int i2) {
        Objects.requireNonNull(this.dXrmkklc8);
        super.iiGwOFFnr(View.MeasureSpec.makeMeasureSpec(D3DEikrvb.Eeka1udhb(((float) getContext().getResources().getConfiguration().screenWidthDp) * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(D3DEikrvb.Eeka1udhb(((float) getContext().getResources().getConfiguration().screenHeightDp) * getContext().getResources().getDisplayMetrics().density), Integer.MIN_VALUE));
    }

    @Override // con.wnbPPCp4x
    public void kCA6Zs9sL(boolean z, int i, int i2, int i3, int i4) {
        super.kCA6Zs9sL(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt != null) {
            this.sk5s77z6Q.width = childAt.getMeasuredWidth();
            this.sk5s77z6Q.height = childAt.getMeasuredHeight();
            this.ixWaw2akD.updateViewLayout(this, this.sk5s77z6Q);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.RG6kpfv3v.getWindowVisibleDisplayFrame(this.CpG0imbht);
        if (!anXlDk6fV.tGV7Q6urW(this.CpG0imbht, this.IytU16YUK)) {
            CBQ5d1kRq();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.dXrmkklc8.tGV7Q6urW) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z = false;
        if (!(motionEvent != null && motionEvent.getAction() == 0) || (motionEvent.getX() >= 0.0f && motionEvent.getX() < ((float) getWidth()) && motionEvent.getY() >= 0.0f && motionEvent.getY() < ((float) getHeight()))) {
            if (motionEvent != null && motionEvent.getAction() == 4) {
                z = true;
            }
            if (!z) {
                return super.onTouchEvent(motionEvent);
            }
            gdEmqfwpT gdemqfwpt = this.Eeka1udhb;
            if (gdemqfwpt != null) {
                gdemqfwpt.GPLPRo6go();
            }
            return true;
        }
        gdEmqfwpT gdemqfwpt2 = this.Eeka1udhb;
        if (gdemqfwpt2 != null) {
            gdemqfwpt2.GPLPRo6go();
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        oon79WMrY();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        if (this.qFBXIgpia) {
            this.RG6kpfv3v.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.qFBXIgpia = false;
        }
    }

    public final void oon79WMrY() {
        if (!this.qFBXIgpia && this.RG6kpfv3v.isAttachedToWindow()) {
            this.RG6kpfv3v.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.qFBXIgpia = true;
        }
    }

    @Override // con.wnbPPCp4x
    public void q3BipwRCk(rJ0s9PfCL rj0s9pfcl, int i) {
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(-1107814904);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        ((kkcQgCx5G) ((prCJwNx2x) this.nlGCs0NZs).getValue()).WaUP0CF08(wpxpbwg1j, 0);
        rESgwfV20 Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb != null) {
            Eeka1udhb.dIocxURUo = new t7rSdVMuj(this, i);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    public final void vPSbyrYWX(gdEmqfwpT gdemqfwpt, dkOQrHvWO dkoqrhvwo, String str, BFRsKhrQv bFRsKhrQv) {
        this.Eeka1udhb = gdemqfwpt;
        this.dXrmkklc8 = dkoqrhvwo;
        yWvV4ePLl(!dkoqrhvwo.q3BipwRCk ? this.sk5s77z6Q.flags | 8 : this.sk5s77z6Q.flags & -9);
        int i = dkoqrhvwo.dIocxURUo;
        ViewGroup.LayoutParams layoutParams = this.RG6kpfv3v.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i2 = 0;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int tGV7Q6urW = vtDfS6nCt.tGV7Q6urW(i);
        if (tGV7Q6urW != 0) {
            if (tGV7Q6urW == 1) {
                z = true;
            } else if (tGV7Q6urW == 2) {
                z = false;
            } else {
                throw new dnCerKhAM();
            }
        }
        yWvV4ePLl(z ? this.sk5s77z6Q.flags | 8192 : this.sk5s77z6Q.flags & -8193);
        yWvV4ePLl(dkoqrhvwo.iiGwOFFnr ? this.sk5s77z6Q.flags & -513 : this.sk5s77z6Q.flags | 512);
        int ordinal = bFRsKhrQv.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i2 = 1;
            } else {
                throw new dnCerKhAM();
            }
        }
        super.setLayoutDirection(i2);
    }

    public final void yWvV4ePLl(int i) {
        WindowManager.LayoutParams layoutParams = this.sk5s77z6Q;
        layoutParams.flags = i;
        this.ixWaw2akD.updateViewLayout(this, layoutParams);
    }
}
