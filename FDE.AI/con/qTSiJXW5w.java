package con;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.feravolt.preload.R;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class qTSiJXW5w extends zhWsuDChl implements ActionBarOverlayLayout.qhPEQQaQ4 {
    public static final Interpolator dfpT1j18n = new AccelerateInterpolator();
    public static final Interpolator iMyQMM6Qj = new DecelerateInterpolator();
    public boolean Bhmn1KIah;
    public boolean CBQ5d1kRq;
    public View GPLPRo6go;
    public Context J4Ux7ym32;
    public boolean Puu3Rhg4F;
    public boolean RG6kpfv3v;
    public ActionBarContainer dIocxURUo;
    public p0p8kJ9iW dXrmkklc8;
    public ActionBarContextView iiGwOFFnr;
    public boolean ilHKhw3Yw;
    public boolean ixWaw2akD;
    public KMt2sB4vK kCA6Zs9sL;
    public pOLFExxoD oon79WMrY;
    public Context q3BipwRCk;
    public boolean qVUwofr5s;
    public ActionBarOverlayLayout tGV7Q6urW;
    public uj7tg96A8 vPSbyrYWX;
    public jgvfJ83pS yWvV4ePLl;
    public ArrayList kmSgne1rO = new ArrayList();
    public int PSTqBLTET = 0;
    public boolean MzoOEjc4X = true;
    public boolean Eeka1udhb = true;
    public final DRrV7WVOe sk5s77z6Q = new ttcu894Gp(this);
    public final DRrV7WVOe WaUP0CF08 = new S0HpcZZ96(this);
    public final iFKnyAZAM i8XZMQc6Z = new iFKnyAZAM(this);

    public qTSiJXW5w(Activity activity, boolean z) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        iiGwOFFnr(decorView);
        if (!z) {
            this.GPLPRo6go = decorView.findViewById(16908290);
        }
    }

    public qTSiJXW5w(Dialog dialog) {
        new ArrayList();
        iiGwOFFnr(dialog.getWindow().getDecorView());
    }

    public final void GPLPRo6go(boolean z) {
        Toolbar toolbar;
        Toolbar toolbar2;
        this.Bhmn1KIah = z;
        if (!z) {
            qya5U7BN8 qya5u7bn8 = (qya5U7BN8) this.kCA6Zs9sL;
            View view = qya5u7bn8.tGV7Q6urW;
            if (view != null && view.getParent() == (toolbar2 = qya5u7bn8.q3BipwRCk)) {
                toolbar2.removeView(qya5u7bn8.tGV7Q6urW);
            }
            qya5u7bn8.tGV7Q6urW = null;
            this.dIocxURUo.setTabContainer(null);
        } else {
            this.dIocxURUo.setTabContainer(null);
            qya5U7BN8 qya5u7bn82 = (qya5U7BN8) this.kCA6Zs9sL;
            View view2 = qya5u7bn82.tGV7Q6urW;
            if (view2 != null && view2.getParent() == (toolbar = qya5u7bn82.q3BipwRCk)) {
                toolbar.removeView(qya5u7bn82.tGV7Q6urW);
            }
            qya5u7bn82.tGV7Q6urW = null;
        }
        Objects.requireNonNull(this.kCA6Zs9sL);
        ((qya5U7BN8) this.kCA6Zs9sL).q3BipwRCk.setCollapsible(false);
        this.tGV7Q6urW.setHasNonEmbeddedTabs(false);
    }

    @Override // con.zhWsuDChl
    public Context J4Ux7ym32() {
        if (this.J4Ux7ym32 == null) {
            TypedValue typedValue = new TypedValue();
            this.q3BipwRCk.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.J4Ux7ym32 = new ContextThemeWrapper(this.q3BipwRCk, i);
            } else {
                this.J4Ux7ym32 = this.q3BipwRCk;
            }
        }
        return this.J4Ux7ym32;
    }

    public final void Puu3Rhg4F(boolean z) {
        View view;
        View view2;
        View view3;
        if (this.qVUwofr5s || !this.ilHKhw3Yw) {
            if (!this.Eeka1udhb) {
                this.Eeka1udhb = true;
                p0p8kJ9iW p0p8kj9iw = this.dXrmkklc8;
                if (p0p8kj9iw != null) {
                    p0p8kj9iw.q3BipwRCk();
                }
                this.dIocxURUo.setVisibility(0);
                if (this.PSTqBLTET != 0 || (!this.RG6kpfv3v && !z)) {
                    this.dIocxURUo.setAlpha(1.0f);
                    this.dIocxURUo.setTranslationY(0.0f);
                    if (this.MzoOEjc4X && (view2 = this.GPLPRo6go) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.WaUP0CF08.onAnimationEnd(null);
                } else {
                    this.dIocxURUo.setTranslationY(0.0f);
                    float f = (float) (-this.dIocxURUo.getHeight());
                    if (z) {
                        int[] iArr = {0, 0};
                        this.dIocxURUo.getLocationInWindow(iArr);
                        f -= (float) iArr[1];
                    }
                    this.dIocxURUo.setTranslationY(f);
                    p0p8kJ9iW p0p8kj9iw2 = new p0p8kJ9iW();
                    Roohga8FY J4Ux7ym32 = IuQbWntsc.J4Ux7ym32(this.dIocxURUo);
                    J4Ux7ym32.GPLPRo6go(0.0f);
                    J4Ux7ym32.iiGwOFFnr(this.i8XZMQc6Z);
                    if (!p0p8kj9iw2.kCA6Zs9sL) {
                        p0p8kj9iw2.q3BipwRCk.add(J4Ux7ym32);
                    }
                    if (this.MzoOEjc4X && (view3 = this.GPLPRo6go) != null) {
                        view3.setTranslationY(f);
                        Roohga8FY J4Ux7ym322 = IuQbWntsc.J4Ux7ym32(this.GPLPRo6go);
                        J4Ux7ym322.GPLPRo6go(0.0f);
                        if (!p0p8kj9iw2.kCA6Zs9sL) {
                            p0p8kj9iw2.q3BipwRCk.add(J4Ux7ym322);
                        }
                    }
                    Interpolator interpolator = iMyQMM6Qj;
                    boolean z2 = p0p8kj9iw2.kCA6Zs9sL;
                    if (!z2) {
                        p0p8kj9iw2.tGV7Q6urW = interpolator;
                    }
                    if (!z2) {
                        p0p8kj9iw2.J4Ux7ym32 = 250;
                    }
                    DRrV7WVOe dRrV7WVOe = this.WaUP0CF08;
                    if (!z2) {
                        p0p8kj9iw2.dIocxURUo = dRrV7WVOe;
                    }
                    this.dXrmkklc8 = p0p8kj9iw2;
                    p0p8kj9iw2.J4Ux7ym32();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.tGV7Q6urW;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                    cyVJjwbRF.tGV7Q6urW(actionBarOverlayLayout);
                }
            }
        } else if (this.Eeka1udhb) {
            this.Eeka1udhb = false;
            p0p8kJ9iW p0p8kj9iw3 = this.dXrmkklc8;
            if (p0p8kj9iw3 != null) {
                p0p8kj9iw3.q3BipwRCk();
            }
            if (this.PSTqBLTET != 0 || (!this.RG6kpfv3v && !z)) {
                this.sk5s77z6Q.onAnimationEnd(null);
                return;
            }
            this.dIocxURUo.setAlpha(1.0f);
            this.dIocxURUo.setTransitioning(true);
            p0p8kJ9iW p0p8kj9iw4 = new p0p8kJ9iW();
            float f2 = (float) (-this.dIocxURUo.getHeight());
            if (z) {
                int[] iArr2 = {0, 0};
                this.dIocxURUo.getLocationInWindow(iArr2);
                f2 -= (float) iArr2[1];
            }
            Roohga8FY J4Ux7ym323 = IuQbWntsc.J4Ux7ym32(this.dIocxURUo);
            J4Ux7ym323.GPLPRo6go(f2);
            J4Ux7ym323.iiGwOFFnr(this.i8XZMQc6Z);
            if (!p0p8kj9iw4.kCA6Zs9sL) {
                p0p8kj9iw4.q3BipwRCk.add(J4Ux7ym323);
            }
            if (this.MzoOEjc4X && (view = this.GPLPRo6go) != null) {
                Roohga8FY J4Ux7ym324 = IuQbWntsc.J4Ux7ym32(view);
                J4Ux7ym324.GPLPRo6go(f2);
                if (!p0p8kj9iw4.kCA6Zs9sL) {
                    p0p8kj9iw4.q3BipwRCk.add(J4Ux7ym324);
                }
            }
            Interpolator interpolator2 = dfpT1j18n;
            boolean z3 = p0p8kj9iw4.kCA6Zs9sL;
            if (!z3) {
                p0p8kj9iw4.tGV7Q6urW = interpolator2;
            }
            if (!z3) {
                p0p8kj9iw4.J4Ux7ym32 = 250;
            }
            DRrV7WVOe dRrV7WVOe2 = this.sk5s77z6Q;
            if (!z3) {
                p0p8kj9iw4.dIocxURUo = dRrV7WVOe2;
            }
            this.dXrmkklc8 = p0p8kj9iw4;
            p0p8kj9iw4.J4Ux7ym32();
        }
    }

    @Override // con.zhWsuDChl
    public void dIocxURUo(CharSequence charSequence) {
        qya5U7BN8 qya5u7bn8 = (qya5U7BN8) this.kCA6Zs9sL;
        if (!qya5u7bn8.Puu3Rhg4F) {
            qya5u7bn8.yWvV4ePLl = charSequence;
            if ((qya5u7bn8.J4Ux7ym32 & 8) != 0) {
                qya5u7bn8.q3BipwRCk.setTitle(charSequence);
            }
        }
    }

    public final void iiGwOFFnr(View view) {
        KMt2sB4vK kMt2sB4vK;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.tGV7Q6urW = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof KMt2sB4vK) {
            kMt2sB4vK = (KMt2sB4vK) findViewById;
        } else if (findViewById instanceof Toolbar) {
            kMt2sB4vK = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Can't make a decor toolbar out of ");
            q3BipwRCk.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(q3BipwRCk.toString());
        }
        this.kCA6Zs9sL = kMt2sB4vK;
        this.iiGwOFFnr = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.dIocxURUo = actionBarContainer;
        KMt2sB4vK kMt2sB4vK2 = this.kCA6Zs9sL;
        if (kMt2sB4vK2 == null || this.iiGwOFFnr == null || actionBarContainer == null) {
            throw new IllegalStateException(qTSiJXW5w.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        Context q3BipwRCk2 = ((qya5U7BN8) kMt2sB4vK2).q3BipwRCk();
        this.q3BipwRCk = q3BipwRCk2;
        if ((((qya5U7BN8) this.kCA6Zs9sL).J4Ux7ym32 & 4) != 0) {
            this.Puu3Rhg4F = true;
        }
        int i = q3BipwRCk2.getApplicationInfo().targetSdkVersion;
        Objects.requireNonNull(this.kCA6Zs9sL);
        GPLPRo6go(q3BipwRCk2.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.q3BipwRCk.obtainStyledAttributes(null, ZolH67hOx.q3BipwRCk, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.tGV7Q6urW;
            if (actionBarOverlayLayout2.Eeka1udhb) {
                this.ixWaw2akD = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.dIocxURUo;
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            mJLaJepZo.Eeka1udhb(actionBarContainer2, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public void kCA6Zs9sL(boolean z) {
        Roohga8FY roohga8FY;
        Roohga8FY roohga8FY2;
        if (z) {
            if (!this.qVUwofr5s) {
                this.qVUwofr5s = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.tGV7Q6urW;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                Puu3Rhg4F(false);
            }
        } else if (this.qVUwofr5s) {
            this.qVUwofr5s = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.tGV7Q6urW;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            Puu3Rhg4F(false);
        }
        ActionBarContainer actionBarContainer = this.dIocxURUo;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        if (mN6fklC4R.tGV7Q6urW(actionBarContainer)) {
            if (z) {
                roohga8FY = ((qya5U7BN8) this.kCA6Zs9sL).tGV7Q6urW(4, 100);
                roohga8FY2 = this.iiGwOFFnr.kCA6Zs9sL(0, 200);
            } else {
                roohga8FY2 = ((qya5U7BN8) this.kCA6Zs9sL).tGV7Q6urW(0, 200);
                roohga8FY = this.iiGwOFFnr.kCA6Zs9sL(8, 100);
            }
            p0p8kJ9iW p0p8kj9iw = new p0p8kJ9iW();
            p0p8kj9iw.q3BipwRCk.add(roohga8FY);
            View view = (View) roohga8FY.q3BipwRCk.get();
            long duration = view != null ? view.animate().getDuration() : 0;
            View view2 = (View) roohga8FY2.q3BipwRCk.get();
            if (view2 != null) {
                view2.animate().setStartDelay(duration);
            }
            p0p8kj9iw.q3BipwRCk.add(roohga8FY2);
            p0p8kj9iw.J4Ux7ym32();
        } else if (z) {
            ((qya5U7BN8) this.kCA6Zs9sL).q3BipwRCk.setVisibility(4);
            this.iiGwOFFnr.setVisibility(0);
        } else {
            ((qya5U7BN8) this.kCA6Zs9sL).q3BipwRCk.setVisibility(0);
            this.iiGwOFFnr.setVisibility(8);
        }
    }

    @Override // con.zhWsuDChl
    public void q3BipwRCk(boolean z) {
        if (z != this.CBQ5d1kRq) {
            this.CBQ5d1kRq = z;
            int size = this.kmSgne1rO.size();
            for (int i = 0; i < size; i++) {
                ((gC1V8jvR3) this.kmSgne1rO.get(i)).q3BipwRCk(z);
            }
        }
    }

    @Override // con.zhWsuDChl
    public void tGV7Q6urW(boolean z) {
        if (!this.Puu3Rhg4F) {
            int i = z ? 4 : 0;
            qya5U7BN8 qya5u7bn8 = (qya5U7BN8) this.kCA6Zs9sL;
            int i2 = qya5u7bn8.J4Ux7ym32;
            this.Puu3Rhg4F = true;
            qya5u7bn8.J4Ux7ym32((i & 4) | (i2 & -5));
        }
    }
}
