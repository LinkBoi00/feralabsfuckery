package con;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.view.menu.RG2GI7LDp;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.mhl5lIdbQ;
import com.feravolt.preload.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class Jg0aTLb6g extends yYWQSxv2D implements RG2GI7LDp.AbstractC0001RG2GI7LDp, LayoutInflater.Factory2 {
    public View AqaWJg0b4;
    public P1uqVBniW BL4OzhZBd;
    public final Object Bhmn1KIah;
    public boolean CpG0imbht;
    public boolean DuuXfa7LE;
    public sF46ToYwT[] EBQXiIPmm;
    public zhWsuDChl Eeka1udhb;
    public Rect INnK5Rew6;
    public boolean IzM1cD9ly;
    public boolean KBYw84i3W;
    public boolean L4EwGfXiQ;
    public Window MzoOEjc4X;
    public boolean NyWTwPF6V;
    public P1uqVBniW OpLJtmvFM;
    public final Context PSTqBLTET;
    public boolean QNqj6nIzv;
    public boolean QSbMsHU5X;
    public CharSequence RG6kpfv3v;
    public Rect SuKhTJIQc;
    public sF46ToYwT TyB1UUd72;
    public boolean V9LQMKGJe;
    public EV4wl6Jg6 WaUP0CF08;
    public int XYT7vJqNO;
    public Runnable cAwN510t2;
    public MenuInflater dXrmkklc8;
    public ActionBarContextView dfpT1j18n;
    public boolean i0Zug1mVk;
    public pOLFExxoD i8XZMQc6Z;
    public PopupWindow iMyQMM6Qj;
    public boolean igRQEZxnW;
    public qKHBB8Wiu ilHKhw3Yw;
    public CVu4W89kR ixWaw2akD;
    public boolean j22ftfeNI;
    public boolean juJ6pnCpu;
    public kZAmYIEbq ln3nf7LH3;
    public boolean mUqPm6GBh;
    public boolean n4UIOvAko;
    public TextView nlGCs0NZs;
    public boolean o4LF8RkoQ;
    public ViewGroup qFBXIgpia;
    public final zmOE3WTfy qVUwofr5s;
    public EV4wl6Jg6 sk5s77z6Q;
    public boolean vNtjxmzUM;
    public int wIZEdYHUn;
    public boolean zHl31GGXU;
    public int ziwPzaoF3;
    public static final ZmYjNS8wW Dr7UqlxEV = new ZmYjNS8wW();
    public static final int[] M66hQ219i = {16842836};
    public static final boolean R2hkbNqWf = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean IG30YE5GU = true;
    public Roohga8FY IytU16YUK = null;
    public final Runnable kktL0P5MG = new vYqi0U9AH(this, 0);

    public Jg0aTLb6g(Context context, Window window, zmOE3WTfy zmoe3wtfy, Object obj) {
        grT0kqTxT grt0kqtxt;
        this.ziwPzaoF3 = -100;
        this.PSTqBLTET = context;
        this.qVUwofr5s = zmoe3wtfy;
        this.Bhmn1KIah = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof grT0kqTxT)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    grt0kqtxt = (grT0kqTxT) context;
                    break;
                }
            }
            grt0kqtxt = null;
            if (grt0kqtxt != null) {
                this.ziwPzaoF3 = ((Jg0aTLb6g) grt0kqtxt.kmSgne1rO()).ziwPzaoF3;
            }
        }
        if (this.ziwPzaoF3 == -100) {
            ZmYjNS8wW zmYjNS8wW = Dr7UqlxEV;
            Integer num = (Integer) zmYjNS8wW.getOrDefault(this.Bhmn1KIah.getClass().getName(), null);
            if (num != null) {
                this.ziwPzaoF3 = num.intValue();
                zmYjNS8wW.remove(this.Bhmn1KIah.getClass().getName());
            }
        }
        if (window != null) {
            ilHKhw3Yw(window);
        }
        srLS6zLvm.kCA6Zs9sL();
    }

    public int AqaWJg0b4(Context context, int i) {
        P1uqVBniW cAwN510t2;
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (!(i == 1 || i == 2)) {
                    if (i == 3) {
                        if (this.BL4OzhZBd == null) {
                            this.BL4OzhZBd = new Poyuktm92(this, context);
                        }
                        cAwN510t2 = this.BL4OzhZBd;
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                cAwN510t2 = cAwN510t2(context);
            }
            return cAwN510t2.dIocxURUo();
        }
        return i;
    }

    @Override // con.yYWQSxv2D
    public final void Bhmn1KIah(CharSequence charSequence) {
        this.RG6kpfv3v = charSequence;
        CVu4W89kR cVu4W89kR = this.ixWaw2akD;
        if (cVu4W89kR != null) {
            cVu4W89kR.setWindowTitle(charSequence);
            return;
        }
        zhWsuDChl zhwsudchl = this.Eeka1udhb;
        if (zhwsudchl != null) {
            zhwsudchl.dIocxURUo(charSequence);
            return;
        }
        TextView textView = this.nlGCs0NZs;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // con.yYWQSxv2D
    public void CBQ5d1kRq(View view) {
        i8XZMQc6Z();
        ViewGroup viewGroup = (ViewGroup) this.qFBXIgpia.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.ilHKhw3Yw.CBQ5d1kRq.onContentChanged();
    }

    public final Window.Callback CpG0imbht() {
        return this.MzoOEjc4X.getCallback();
    }

    public void Eeka1udhb(RG2GI7LDp rG2GI7LDp) {
        TeoeEf1aF teoeEf1aF;
        if (!this.igRQEZxnW) {
            this.igRQEZxnW = true;
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.ixWaw2akD;
            actionBarOverlayLayout.Bhmn1KIah();
            ActionMenuView actionMenuView = ((qya5U7BN8) actionBarOverlayLayout.MzoOEjc4X).q3BipwRCk.CBQ5d1kRq;
            if (!(actionMenuView == null || (teoeEf1aF = actionMenuView.qFBXIgpia) == null)) {
                teoeEf1aF.J4Ux7ym32();
            }
            Window.Callback CpG0imbht = CpG0imbht();
            if (CpG0imbht != null && !this.zHl31GGXU) {
                CpG0imbht.onPanelClosed(108, rG2GI7LDp);
            }
            this.igRQEZxnW = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // con.yYWQSxv2D
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void GPLPRo6go() {
        zhWsuDChl zhwsudchl;
        P1uqVBniW p1uqVBniW;
        P1uqVBniW p1uqVBniW2;
        if (this.Bhmn1KIah instanceof Activity) {
            synchronized (yYWQSxv2D.kmSgne1rO) {
                yYWQSxv2D.yWvV4ePLl(this);
            }
        }
        if (this.DuuXfa7LE) {
            this.MzoOEjc4X.getDecorView().removeCallbacks(this.kktL0P5MG);
        }
        this.L4EwGfXiQ = false;
        this.zHl31GGXU = true;
        if (this.ziwPzaoF3 != -100) {
            Object obj = this.Bhmn1KIah;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                Dr7UqlxEV.put(this.Bhmn1KIah.getClass().getName(), Integer.valueOf(this.ziwPzaoF3));
                zhwsudchl = this.Eeka1udhb;
                if (zhwsudchl != null) {
                    Objects.requireNonNull(zhwsudchl);
                }
                p1uqVBniW = this.OpLJtmvFM;
                if (p1uqVBniW != null) {
                    p1uqVBniW.q3BipwRCk();
                }
                p1uqVBniW2 = this.BL4OzhZBd;
                if (p1uqVBniW2 == null) {
                    p1uqVBniW2.q3BipwRCk();
                    return;
                }
                return;
            }
        }
        Dr7UqlxEV.remove(this.Bhmn1KIah.getClass().getName());
        zhwsudchl = this.Eeka1udhb;
        if (zhwsudchl != null) {
        }
        p1uqVBniW = this.OpLJtmvFM;
        if (p1uqVBniW != null) {
        }
        p1uqVBniW2 = this.BL4OzhZBd;
        if (p1uqVBniW2 == null) {
        }
    }

    public sF46ToYwT IytU16YUK(int i) {
        sF46ToYwT[] sf46toywtArr = this.EBQXiIPmm;
        if (sf46toywtArr == null || sf46toywtArr.length <= i) {
            sF46ToYwT[] sf46toywtArr2 = new sF46ToYwT[i + 1];
            if (sf46toywtArr != null) {
                System.arraycopy(sf46toywtArr, 0, sf46toywtArr2, 0, sf46toywtArr.length);
            }
            this.EBQXiIPmm = sf46toywtArr2;
            sf46toywtArr = sf46toywtArr2;
        }
        sF46ToYwT sf46toywt = sf46toywtArr[i];
        if (sf46toywt != null) {
            return sf46toywt;
        }
        sF46ToYwT sf46toywt2 = new sF46ToYwT(i);
        sf46toywtArr[i] = sf46toywt2;
        return sf46toywt2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
        if (r6 == false) goto L_0x00b7;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    @Override // androidx.appcompat.view.menu.RG2GI7LDp.AbstractC0001RG2GI7LDp
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void J4Ux7ym32(RG2GI7LDp rG2GI7LDp) {
        boolean z;
        boolean z2;
        CVu4W89kR cVu4W89kR = this.ixWaw2akD;
        if (cVu4W89kR != null && ((ActionBarOverlayLayout) cVu4W89kR).Puu3Rhg4F()) {
            if (ViewConfiguration.get(this.PSTqBLTET).hasPermanentMenuKey()) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.ixWaw2akD;
                actionBarOverlayLayout.Bhmn1KIah();
                ActionMenuView actionMenuView = ((qya5U7BN8) actionBarOverlayLayout.MzoOEjc4X).q3BipwRCk.CBQ5d1kRq;
                if (actionMenuView != null) {
                    TeoeEf1aF teoeEf1aF = actionMenuView.qFBXIgpia;
                    if (teoeEf1aF != null) {
                        if (teoeEf1aF.nlGCs0NZs != null || teoeEf1aF.kmSgne1rO()) {
                            z2 = true;
                            if (z2) {
                                z = true;
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                }
                z = false;
            }
            Window.Callback CpG0imbht = CpG0imbht();
            if (((ActionBarOverlayLayout) this.ixWaw2akD).kmSgne1rO()) {
                ((ActionBarOverlayLayout) this.ixWaw2akD).oon79WMrY();
                if (!this.zHl31GGXU) {
                    CpG0imbht.onPanelClosed(108, IytU16YUK(0).Puu3Rhg4F);
                    return;
                }
                return;
            } else if (CpG0imbht != null && !this.zHl31GGXU) {
                if (this.DuuXfa7LE && (1 & this.XYT7vJqNO) != 0) {
                    this.MzoOEjc4X.getDecorView().removeCallbacks(this.kktL0P5MG);
                    this.kktL0P5MG.run();
                }
                sF46ToYwT IytU16YUK = IytU16YUK(0);
                RG2GI7LDp rG2GI7LDp2 = IytU16YUK.Puu3Rhg4F;
                if (rG2GI7LDp2 != null && !IytU16YUK.PSTqBLTET && CpG0imbht.onPreparePanel(0, IytU16YUK.GPLPRo6go, rG2GI7LDp2)) {
                    CpG0imbht.onMenuOpened(108, IytU16YUK.Puu3Rhg4F);
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.ixWaw2akD;
                    actionBarOverlayLayout2.Bhmn1KIah();
                    ((qya5U7BN8) actionBarOverlayLayout2.MzoOEjc4X).q3BipwRCk.RG6kpfv3v();
                    return;
                }
                return;
            } else {
                return;
            }
        }
        sF46ToYwT IytU16YUK2 = IytU16YUK(0);
        IytU16YUK2.Bhmn1KIah = true;
        dXrmkklc8(IytU16YUK2, false);
        mUqPm6GBh(IytU16YUK2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x010a, code lost:
        if (r1 != false) goto L_0x0111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010f, code lost:
        if (r10.L4EwGfXiQ != false) goto L_0x0111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0111, code lost:
        r11.onConfigurationChanged(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014c  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean MzoOEjc4X(boolean z) {
        boolean z2;
        int i;
        int i2;
        boolean z3;
        Object obj;
        Activity activity;
        boolean z4 = false;
        if (this.zHl31GGXU) {
            return false;
        }
        int i3 = this.ziwPzaoF3;
        if (i3 == -100) {
            i3 = -100;
        }
        Configuration RG6kpfv3v = RG6kpfv3v(this.PSTqBLTET, AqaWJg0b4(this.PSTqBLTET, i3), null);
        boolean z5 = true;
        if (!this.n4UIOvAko && (this.Bhmn1KIah instanceof Activity)) {
            PackageManager packageManager = this.PSTqBLTET.getPackageManager();
            if (packageManager == null) {
                z2 = false;
                i = this.PSTqBLTET.getResources().getConfiguration().uiMode & 48;
                i2 = RG6kpfv3v.uiMode & 48;
                if (i != i2 && z && !z2 && this.j22ftfeNI && (R2hkbNqWf || this.QSbMsHU5X)) {
                    obj = this.Bhmn1KIah;
                    if ((obj instanceof Activity) && !((Activity) obj).isChild()) {
                        activity = (Activity) this.Bhmn1KIah;
                        Object obj2 = D856HTNqd.q3BipwRCk;
                        if (Build.VERSION.SDK_INT < 28 || !QvXlJJNbM.J4Ux7ym32(activity)) {
                            activity.recreate();
                        }
                        z3 = true;
                        if (!z3 || i == i2) {
                            z5 = z3;
                        } else {
                            Resources resources = this.PSTqBLTET.getResources();
                            Configuration configuration = new Configuration(resources.getConfiguration());
                            configuration.uiMode = i2 | (resources.getConfiguration().uiMode & -49);
                            resources.updateConfiguration(configuration, null);
                            int i4 = this.wIZEdYHUn;
                            if (i4 != 0) {
                                this.PSTqBLTET.setTheme(i4);
                                this.PSTqBLTET.getTheme().applyStyle(this.wIZEdYHUn, true);
                            }
                            if (z2) {
                                Object obj3 = this.Bhmn1KIah;
                                if (obj3 instanceof Activity) {
                                    Activity activity2 = (Activity) obj3;
                                    if (activity2 instanceof BgHiMFrEI) {
                                        if (((N0a4Shkkl) ((BgHiMFrEI) activity2).GPLPRo6go()).tGV7Q6urW.compareTo(mhl5lIdbQ.EnumC0005mhl5lIdbQ.STARTED) >= 0) {
                                            z4 = true;
                                        }
                                    }
                                }
                            }
                        }
                        if (z5) {
                            Object obj4 = this.Bhmn1KIah;
                            if (obj4 instanceof grT0kqTxT) {
                                Objects.requireNonNull((grT0kqTxT) obj4);
                            }
                        }
                        if (i3 != 0) {
                            cAwN510t2(this.PSTqBLTET).GPLPRo6go();
                        } else {
                            P1uqVBniW p1uqVBniW = this.OpLJtmvFM;
                            if (p1uqVBniW != null) {
                                p1uqVBniW.q3BipwRCk();
                            }
                        }
                        if (i3 != 3) {
                            Context context = this.PSTqBLTET;
                            if (this.BL4OzhZBd == null) {
                                this.BL4OzhZBd = new Poyuktm92(this, context);
                            }
                            this.BL4OzhZBd.GPLPRo6go();
                        } else {
                            P1uqVBniW p1uqVBniW2 = this.BL4OzhZBd;
                            if (p1uqVBniW2 != null) {
                                p1uqVBniW2.q3BipwRCk();
                            }
                        }
                        return z5;
                    }
                }
                z3 = false;
                if (!z3) {
                }
                z5 = z3;
                if (z5) {
                }
                if (i3 != 0) {
                }
                if (i3 != 3) {
                }
                return z5;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.PSTqBLTET, this.Bhmn1KIah.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                this.IzM1cD9ly = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.IzM1cD9ly = false;
            }
        }
        this.n4UIOvAko = true;
        z2 = this.IzM1cD9ly;
        i = this.PSTqBLTET.getResources().getConfiguration().uiMode & 48;
        i2 = RG6kpfv3v.uiMode & 48;
        if (i != i2) {
            obj = this.Bhmn1KIah;
            if (obj instanceof Activity) {
                activity = (Activity) this.Bhmn1KIah;
                Object obj22 = D856HTNqd.q3BipwRCk;
                if (Build.VERSION.SDK_INT < 28) {
                }
                activity.recreate();
                z3 = true;
                if (!z3) {
                }
                z5 = z3;
                if (z5) {
                }
                if (i3 != 0) {
                }
                if (i3 != 3) {
                }
                return z5;
            }
        }
        z3 = false;
        if (!z3) {
        }
        z5 = z3;
        if (z5) {
        }
        if (i3 != 0) {
        }
        if (i3 != 3) {
        }
        return z5;
    }

    public final boolean NyWTwPF6V(sF46ToYwT sf46toywt, int i, KeyEvent keyEvent, int i2) {
        RG2GI7LDp rG2GI7LDp;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((sf46toywt.vPSbyrYWX || vNtjxmzUM(sf46toywt, keyEvent)) && (rG2GI7LDp = sf46toywt.Puu3Rhg4F) != null) {
            z = rG2GI7LDp.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.ixWaw2akD == null) {
            dXrmkklc8(sf46toywt, true);
        }
        return z;
    }

    public boolean PSTqBLTET() {
        return MzoOEjc4X(true);
    }

    @Override // con.yYWQSxv2D
    public void Puu3Rhg4F() {
        this.L4EwGfXiQ = false;
        qFBXIgpia();
        zhWsuDChl zhwsudchl = this.Eeka1udhb;
        if (zhwsudchl != null) {
            qTSiJXW5w qtsijxw5w = (qTSiJXW5w) zhwsudchl;
            qtsijxw5w.RG6kpfv3v = false;
            p0p8kJ9iW p0p8kj9iw = qtsijxw5w.dXrmkklc8;
            if (p0p8kj9iw != null) {
                p0p8kj9iw.q3BipwRCk();
            }
        }
    }

    public final Configuration RG6kpfv3v(Context context, int i, Configuration configuration) {
        int i2 = i != 1 ? i != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        return configuration2;
    }

    public final int V9LQMKGJe(o8nscdGif o8nscdgif, Rect rect) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        Context context;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3;
        int i4 = 0;
        int dIocxURUo = o8nscdgif != null ? o8nscdgif.dIocxURUo() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.dfpT1j18n;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.dfpT1j18n.getLayoutParams();
            boolean z3 = true;
            if (this.dfpT1j18n.isShown()) {
                if (this.INnK5Rew6 == null) {
                    this.INnK5Rew6 = new Rect();
                    this.SuKhTJIQc = new Rect();
                }
                Rect rect2 = this.INnK5Rew6;
                Rect rect3 = this.SuKhTJIQc;
                if (o8nscdgif == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(o8nscdgif.J4Ux7ym32(), o8nscdgif.dIocxURUo(), o8nscdgif.tGV7Q6urW(), o8nscdgif.q3BipwRCk());
                }
                qyCamnJnJ.q3BipwRCk(this.qFBXIgpia, rect2, rect3);
                int i5 = rect2.top;
                int i6 = rect2.left;
                int i7 = rect2.right;
                ViewGroup viewGroup = this.qFBXIgpia;
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                o8nscdGif q3BipwRCk = tJeYlszdE.q3BipwRCk(viewGroup);
                if (q3BipwRCk == null) {
                    i = 0;
                } else {
                    i = q3BipwRCk.J4Ux7ym32();
                }
                int tGV7Q6urW = q3BipwRCk == null ? 0 : q3BipwRCk.tGV7Q6urW();
                if (marginLayoutParams2.topMargin == i5 && marginLayoutParams2.leftMargin == i6 && marginLayoutParams2.rightMargin == i7) {
                    z2 = false;
                } else {
                    marginLayoutParams2.topMargin = i5;
                    marginLayoutParams2.leftMargin = i6;
                    marginLayoutParams2.rightMargin = i7;
                    z2 = true;
                }
                if (i5 <= 0 || this.AqaWJg0b4 != null) {
                    View view = this.AqaWJg0b4;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i3 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i && marginLayoutParams.rightMargin == tGV7Q6urW))) {
                        marginLayoutParams.height = i3;
                        marginLayoutParams.leftMargin = i;
                        marginLayoutParams.rightMargin = tGV7Q6urW;
                        this.AqaWJg0b4.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.PSTqBLTET);
                    this.AqaWJg0b4 = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i;
                    layoutParams.rightMargin = tGV7Q6urW;
                    this.qFBXIgpia.addView(this.AqaWJg0b4, -1, layoutParams);
                }
                View view3 = this.AqaWJg0b4;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    View view4 = this.AqaWJg0b4;
                    if ((VCCyeOu6I.GPLPRo6go(view4) & 8192) == 0) {
                        z3 = false;
                    }
                    if (z3) {
                        context = this.PSTqBLTET;
                        i2 = R.color.abc_decor_view_status_guard_light;
                    } else {
                        context = this.PSTqBLTET;
                        i2 = R.color.abc_decor_view_status_guard;
                    }
                    Object obj = D856HTNqd.q3BipwRCk;
                    view4.setBackgroundColor(nHNpaD9No.q3BipwRCk(context, i2));
                }
                if (!this.o4LF8RkoQ && z) {
                    dIocxURUo = 0;
                }
                z3 = z2;
            } else if (marginLayoutParams2.topMargin != 0) {
                marginLayoutParams2.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.dfpT1j18n.setLayoutParams(marginLayoutParams2);
            }
        }
        View view5 = this.AqaWJg0b4;
        if (view5 != null) {
            if (!z) {
                i4 = 8;
            }
            view5.setVisibility(i4);
        }
        return dIocxURUo;
    }

    public void WaUP0CF08() {
        Roohga8FY roohga8FY = this.IytU16YUK;
        if (roohga8FY != null) {
            roohga8FY.J4Ux7ym32();
        }
    }

    public final P1uqVBniW cAwN510t2(Context context) {
        if (this.OpLJtmvFM == null) {
            if (YKK4R667A.dIocxURUo == null) {
                Context applicationContext = context.getApplicationContext();
                YKK4R667A.dIocxURUo = new YKK4R667A(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.OpLJtmvFM = new Poyuktm92(this, YKK4R667A.dIocxURUo);
        }
        return this.OpLJtmvFM;
    }

    @Override // con.yYWQSxv2D
    public void dIocxURUo() {
        LayoutInflater from = LayoutInflater.from(this.PSTqBLTET);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof Jg0aTLb6g)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public void dXrmkklc8(sF46ToYwT sf46toywt, boolean z) {
        ViewGroup viewGroup;
        CVu4W89kR cVu4W89kR;
        if (!z || sf46toywt.q3BipwRCk != 0 || (cVu4W89kR = this.ixWaw2akD) == null || !((ActionBarOverlayLayout) cVu4W89kR).kmSgne1rO()) {
            WindowManager windowManager = (WindowManager) this.PSTqBLTET.getSystemService("window");
            if (!(windowManager == null || !sf46toywt.kmSgne1rO || (viewGroup = sf46toywt.kCA6Zs9sL) == null)) {
                windowManager.removeView(viewGroup);
                if (z) {
                    qVUwofr5s(sf46toywt.q3BipwRCk, sf46toywt, null);
                }
            }
            sf46toywt.vPSbyrYWX = false;
            sf46toywt.CBQ5d1kRq = false;
            sf46toywt.kmSgne1rO = false;
            sf46toywt.iiGwOFFnr = null;
            sf46toywt.Bhmn1KIah = true;
            if (this.TyB1UUd72 == sf46toywt) {
                this.TyB1UUd72 = null;
                return;
            }
            return;
        }
        Eeka1udhb(sf46toywt.Puu3Rhg4F);
    }

    public final void dfpT1j18n() {
        if (this.MzoOEjc4X == null) {
            Object obj = this.Bhmn1KIah;
            if (obj instanceof Activity) {
                ilHKhw3Yw(((Activity) obj).getWindow());
            }
        }
        if (this.MzoOEjc4X == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final boolean i0Zug1mVk() {
        ViewGroup viewGroup;
        if (this.CpG0imbht && (viewGroup = this.qFBXIgpia) != null) {
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            if (mN6fklC4R.tGV7Q6urW(viewGroup)) {
                return true;
            }
        }
        return false;
    }

    public final void i8XZMQc6Z() {
        ViewGroup viewGroup;
        Throwable e;
        if (!this.CpG0imbht) {
            TypedArray obtainStyledAttributes = this.PSTqBLTET.obtainStyledAttributes(ZolH67hOx.oon79WMrY);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    oon79WMrY(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    oon79WMrY(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    oon79WMrY(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    oon79WMrY(10);
                }
                this.V9LQMKGJe = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                dfpT1j18n();
                this.MzoOEjc4X.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.PSTqBLTET);
                if (this.QNqj6nIzv) {
                    viewGroup = (ViewGroup) from.inflate(this.o4LF8RkoQ ? R.layout.abc_screen_simple_overlay_action_mode : R.layout.abc_screen_simple, (ViewGroup) null);
                } else if (this.V9LQMKGJe) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.i0Zug1mVk = false;
                    this.vNtjxmzUM = false;
                } else if (this.vNtjxmzUM) {
                    TypedValue typedValue = new TypedValue();
                    this.PSTqBLTET.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new fnUv4KsJz(this.PSTqBLTET, typedValue.resourceId) : this.PSTqBLTET).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                    CVu4W89kR cVu4W89kR = (CVu4W89kR) viewGroup.findViewById(R.id.decor_content_parent);
                    this.ixWaw2akD = cVu4W89kR;
                    cVu4W89kR.setWindowCallback(CpG0imbht());
                    if (this.i0Zug1mVk) {
                        ((ActionBarOverlayLayout) this.ixWaw2akD).CBQ5d1kRq(109);
                    }
                    if (this.mUqPm6GBh) {
                        ((ActionBarOverlayLayout) this.ixWaw2akD).CBQ5d1kRq(2);
                    }
                    if (this.NyWTwPF6V) {
                        ((ActionBarOverlayLayout) this.ixWaw2akD).CBQ5d1kRq(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    EV4wl6Jg6 eV4wl6Jg6 = new EV4wl6Jg6(this, 0);
                    WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                    mJLaJepZo.RG6kpfv3v(viewGroup, eV4wl6Jg6);
                    if (this.ixWaw2akD == null) {
                        this.nlGCs0NZs = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    Method method = qyCamnJnJ.q3BipwRCk;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (IllegalAccessException e2) {
                        e = e2;
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e3) {
                        e = e3;
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.MzoOEjc4X.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.MzoOEjc4X.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new EV4wl6Jg6(this, 2));
                    this.qFBXIgpia = viewGroup;
                    Object obj = this.Bhmn1KIah;
                    CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.RG6kpfv3v;
                    if (!TextUtils.isEmpty(title)) {
                        CVu4W89kR cVu4W89kR2 = this.ixWaw2akD;
                        if (cVu4W89kR2 != null) {
                            cVu4W89kR2.setWindowTitle(title);
                        } else {
                            zhWsuDChl zhwsudchl = this.Eeka1udhb;
                            if (zhwsudchl != null) {
                                zhwsudchl.dIocxURUo(title);
                            } else {
                                TextView textView = this.nlGCs0NZs;
                                if (textView != null) {
                                    textView.setText(title);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.qFBXIgpia.findViewById(16908290);
                    View decorView = this.MzoOEjc4X.getDecorView();
                    contentFrameLayout2.qVUwofr5s.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap weakHashMap2 = IuQbWntsc.q3BipwRCk;
                    if (mN6fklC4R.tGV7Q6urW(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.PSTqBLTET.obtainStyledAttributes(ZolH67hOx.oon79WMrY);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.CpG0imbht = true;
                    sF46ToYwT IytU16YUK = IytU16YUK(0);
                    if (!this.zHl31GGXU && IytU16YUK.Puu3Rhg4F == null) {
                        nlGCs0NZs(108);
                        return;
                    }
                    return;
                }
                StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("AppCompat does not support the current theme features: { windowActionBar: ");
                q3BipwRCk.append(this.vNtjxmzUM);
                q3BipwRCk.append(", windowActionBarOverlay: ");
                q3BipwRCk.append(this.i0Zug1mVk);
                q3BipwRCk.append(", android:windowIsFloating: ");
                q3BipwRCk.append(this.V9LQMKGJe);
                q3BipwRCk.append(", windowActionModeOverlay: ");
                q3BipwRCk.append(this.o4LF8RkoQ);
                q3BipwRCk.append(", windowNoTitle: ");
                q3BipwRCk.append(this.QNqj6nIzv);
                q3BipwRCk.append(" }");
                throw new IllegalArgumentException(q3BipwRCk.toString());
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public sF46ToYwT iMyQMM6Qj(Menu menu) {
        sF46ToYwT[] sf46toywtArr = this.EBQXiIPmm;
        int length = sf46toywtArr != null ? sf46toywtArr.length : 0;
        for (int i = 0; i < length; i++) {
            sF46ToYwT sf46toywt = sf46toywtArr[i];
            if (sf46toywt != null && sf46toywt.Puu3Rhg4F == menu) {
                return sf46toywt;
            }
        }
        return null;
    }

    @Override // con.yYWQSxv2D
    public void iiGwOFFnr(Bundle bundle) {
        this.j22ftfeNI = true;
        MzoOEjc4X(false);
        dfpT1j18n();
        Object obj = this.Bhmn1KIah;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    str = dnBSj5uJN.dXrmkklc8(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                zhWsuDChl zhwsudchl = this.Eeka1udhb;
                if (zhwsudchl == null) {
                    this.KBYw84i3W = true;
                } else {
                    zhwsudchl.tGV7Q6urW(true);
                }
            }
            synchronized (yYWQSxv2D.kmSgne1rO) {
                yYWQSxv2D.yWvV4ePLl(this);
                yYWQSxv2D.CBQ5d1kRq.add(new WeakReference(this));
            }
        }
        this.QSbMsHU5X = true;
    }

    public final void ilHKhw3Yw(Window window) {
        if (this.MzoOEjc4X == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof qKHBB8Wiu)) {
                qKHBB8Wiu qkhbb8wiu = new qKHBB8Wiu(this, callback);
                this.ilHKhw3Yw = qkhbb8wiu;
                window.setCallback(qkhbb8wiu);
                j6XJY7rz4 AqaWJg0b4 = j6XJY7rz4.AqaWJg0b4(this.PSTqBLTET, null, M66hQ219i);
                Drawable RG6kpfv3v = AqaWJg0b4.RG6kpfv3v(0);
                if (RG6kpfv3v != null) {
                    window.setBackgroundDrawable(RG6kpfv3v);
                }
                AqaWJg0b4.NyWTwPF6V();
                this.MzoOEjc4X = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0145, code lost:
        if (r7 == false) goto L_0x0149;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean ixWaw2akD(KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        tDC1iJlG1 tdc1ijlg1;
        boolean z3;
        boolean z4;
        View decorView;
        Object obj = this.Bhmn1KIah;
        boolean z5 = true;
        if (((obj instanceof PXqoNfOJ8) || (obj instanceof dF3gF5M3i)) && (decorView = this.MzoOEjc4X.getDecorView()) != null && qXUxYxCuO.q3BipwRCk(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.ilHKhw3Yw.CBQ5d1kRq.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                if ((keyEvent.getFlags() & 128) == 0) {
                    z5 = false;
                }
                this.juJ6pnCpu = z5;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                sF46ToYwT IytU16YUK = IytU16YUK(0);
                if (IytU16YUK.kmSgne1rO) {
                    return true;
                }
                vNtjxmzUM(IytU16YUK, keyEvent);
                return true;
            }
        } else if (keyCode == 4) {
            boolean z6 = this.juJ6pnCpu;
            this.juJ6pnCpu = false;
            sF46ToYwT IytU16YUK2 = IytU16YUK(0);
            if (!IytU16YUK2.kmSgne1rO) {
                pOLFExxoD polfexxod = this.i8XZMQc6Z;
                if (polfexxod != null) {
                    polfexxod.tGV7Q6urW();
                } else {
                    qFBXIgpia();
                    zhWsuDChl zhwsudchl = this.Eeka1udhb;
                    if (zhwsudchl != null) {
                        KMt2sB4vK kMt2sB4vK = ((qTSiJXW5w) zhwsudchl).kCA6Zs9sL;
                        if (kMt2sB4vK != null) {
                            Toolbar.qhPEQQaQ4 qhpeqqaq4 = ((qya5U7BN8) kMt2sB4vK).q3BipwRCk.zHl31GGXU;
                            if ((qhpeqqaq4 == null || qhpeqqaq4.kmSgne1rO == null) ? false : true) {
                                if (qhpeqqaq4 == null) {
                                    tdc1ijlg1 = null;
                                } else {
                                    tdc1ijlg1 = qhpeqqaq4.kmSgne1rO;
                                }
                                if (tdc1ijlg1 != null) {
                                    tdc1ijlg1.collapseActionView();
                                }
                                z2 = true;
                            }
                        }
                        z2 = false;
                    }
                    z = false;
                    if (z) {
                        return true;
                    }
                }
                z = true;
                if (z) {
                }
            } else if (z6) {
                return true;
            } else {
                dXrmkklc8(IytU16YUK2, true);
                return true;
            }
        } else if (keyCode == 82) {
            if (this.i8XZMQc6Z != null) {
                return true;
            }
            sF46ToYwT IytU16YUK3 = IytU16YUK(0);
            CVu4W89kR cVu4W89kR = this.ixWaw2akD;
            if (cVu4W89kR == null || !((ActionBarOverlayLayout) cVu4W89kR).Puu3Rhg4F() || ViewConfiguration.get(this.PSTqBLTET).hasPermanentMenuKey()) {
                boolean z7 = IytU16YUK3.kmSgne1rO;
                if (z7 || IytU16YUK3.CBQ5d1kRq) {
                    dXrmkklc8(IytU16YUK3, true);
                    z3 = z7;
                } else {
                    if (IytU16YUK3.vPSbyrYWX) {
                        if (IytU16YUK3.PSTqBLTET) {
                            IytU16YUK3.vPSbyrYWX = false;
                            z4 = vNtjxmzUM(IytU16YUK3, keyEvent);
                        } else {
                            z4 = true;
                        }
                        if (z4) {
                            mUqPm6GBh(IytU16YUK3, keyEvent);
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                if (z3) {
                    return true;
                }
                AudioManager audioManager = (AudioManager) this.PSTqBLTET.getApplicationContext().getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
            }
            if (!((ActionBarOverlayLayout) this.ixWaw2akD).kmSgne1rO()) {
                if (!this.zHl31GGXU && vNtjxmzUM(IytU16YUK3, keyEvent)) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.ixWaw2akD;
                    actionBarOverlayLayout.Bhmn1KIah();
                    z3 = ((qya5U7BN8) actionBarOverlayLayout.MzoOEjc4X).q3BipwRCk.RG6kpfv3v();
                }
                z3 = false;
            } else {
                z3 = ((ActionBarOverlayLayout) this.ixWaw2akD).oon79WMrY();
            }
            if (z3) {
            }
        }
        return false;
    }

    @Override // con.yYWQSxv2D
    public void kCA6Zs9sL() {
        qFBXIgpia();
        zhWsuDChl zhwsudchl = this.Eeka1udhb;
        nlGCs0NZs(0);
    }

    @Override // con.yYWQSxv2D
    public void kmSgne1rO(View view, ViewGroup.LayoutParams layoutParams) {
        i8XZMQc6Z();
        ViewGroup viewGroup = (ViewGroup) this.qFBXIgpia.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.ilHKhw3Yw.CBQ5d1kRq.onContentChanged();
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0158, code lost:
        if (r3 != null) goto L_0x015a;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015f  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void mUqPm6GBh(sF46ToYwT sf46toywt, KeyEvent keyEvent) {
        int i;
        boolean z;
        ViewGroup.LayoutParams layoutParams;
        if (!sf46toywt.kmSgne1rO && !this.zHl31GGXU) {
            if (sf46toywt.q3BipwRCk == 0) {
                if ((this.PSTqBLTET.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback CpG0imbht = CpG0imbht();
            if (CpG0imbht == null || CpG0imbht.onMenuOpened(sf46toywt.q3BipwRCk, sf46toywt.Puu3Rhg4F)) {
                WindowManager windowManager = (WindowManager) this.PSTqBLTET.getSystemService("window");
                if (windowManager != null && vNtjxmzUM(sf46toywt, keyEvent)) {
                    ViewGroup viewGroup = sf46toywt.kCA6Zs9sL;
                    if (viewGroup == null || sf46toywt.Bhmn1KIah) {
                        if (viewGroup == null) {
                            qFBXIgpia();
                            zhWsuDChl zhwsudchl = this.Eeka1udhb;
                            Context J4Ux7ym32 = zhwsudchl != null ? zhwsudchl.J4Ux7ym32() : null;
                            if (J4Ux7ym32 == null) {
                                J4Ux7ym32 = this.PSTqBLTET;
                            }
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme newTheme = J4Ux7ym32.getResources().newTheme();
                            newTheme.setTo(J4Ux7ym32.getTheme());
                            newTheme.resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true);
                            int i2 = typedValue.resourceId;
                            if (i2 != 0) {
                                newTheme.applyStyle(i2, true);
                            }
                            newTheme.resolveAttribute(R.attr.panelMenuListTheme, typedValue, true);
                            int i3 = typedValue.resourceId;
                            if (i3 == 0) {
                                i3 = 2131821078;
                            }
                            newTheme.applyStyle(i3, true);
                            fnUv4KsJz fnuv4ksjz = new fnUv4KsJz(J4Ux7ym32, 0);
                            fnuv4ksjz.getTheme().setTo(newTheme);
                            sf46toywt.oon79WMrY = fnuv4ksjz;
                            TypedArray obtainStyledAttributes = fnuv4ksjz.obtainStyledAttributes(ZolH67hOx.oon79WMrY);
                            sf46toywt.J4Ux7ym32 = obtainStyledAttributes.getResourceId(86, 0);
                            sf46toywt.dIocxURUo = obtainStyledAttributes.getResourceId(1, 0);
                            obtainStyledAttributes.recycle();
                            sf46toywt.kCA6Zs9sL = new ac56gvUNR(this, sf46toywt.oon79WMrY);
                            sf46toywt.tGV7Q6urW = 81;
                        } else if (sf46toywt.Bhmn1KIah && viewGroup.getChildCount() > 0) {
                            sf46toywt.kCA6Zs9sL.removeAllViews();
                        }
                        View view = sf46toywt.GPLPRo6go;
                        if (view != null) {
                            sf46toywt.iiGwOFFnr = view;
                        } else {
                            if (sf46toywt.Puu3Rhg4F != null) {
                                if (this.WaUP0CF08 == null) {
                                    this.WaUP0CF08 = new EV4wl6Jg6(this, 4);
                                }
                                EV4wl6Jg6 eV4wl6Jg6 = this.WaUP0CF08;
                                if (sf46toywt.yWvV4ePLl == null) {
                                    vAM8bdoEe vam8bdoee = new vAM8bdoEe(sf46toywt.oon79WMrY, R.layout.abc_list_menu_item_layout);
                                    sf46toywt.yWvV4ePLl = vam8bdoee;
                                    vam8bdoee.MzoOEjc4X = eV4wl6Jg6;
                                    RG2GI7LDp rG2GI7LDp = sf46toywt.Puu3Rhg4F;
                                    rG2GI7LDp.J4Ux7ym32(vam8bdoee, rG2GI7LDp.q3BipwRCk);
                                }
                                vAM8bdoEe vam8bdoee2 = sf46toywt.yWvV4ePLl;
                                ViewGroup viewGroup2 = sf46toywt.kCA6Zs9sL;
                                if (vam8bdoee2.PSTqBLTET == null) {
                                    vam8bdoee2.PSTqBLTET = (ExpandedMenuView) vam8bdoee2.kmSgne1rO.inflate(R.layout.abc_expanded_menu_layout, viewGroup2, false);
                                    if (vam8bdoee2.ilHKhw3Yw == null) {
                                        vam8bdoee2.ilHKhw3Yw = new mMP42If7n(vam8bdoee2);
                                    }
                                    vam8bdoee2.PSTqBLTET.setAdapter((ListAdapter) vam8bdoee2.ilHKhw3Yw);
                                    vam8bdoee2.PSTqBLTET.setOnItemClickListener(vam8bdoee2);
                                }
                                ExpandedMenuView expandedMenuView = vam8bdoee2.PSTqBLTET;
                                sf46toywt.iiGwOFFnr = expandedMenuView;
                            }
                            z = false;
                            if (z) {
                                if (sf46toywt.iiGwOFFnr != null && (sf46toywt.GPLPRo6go != null || ((mMP42If7n) sf46toywt.yWvV4ePLl.J4Ux7ym32()).getCount() > 0)) {
                                    ViewGroup.LayoutParams layoutParams2 = sf46toywt.iiGwOFFnr.getLayoutParams();
                                    if (layoutParams2 == null) {
                                        layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                                    }
                                    sf46toywt.kCA6Zs9sL.setBackgroundResource(sf46toywt.J4Ux7ym32);
                                    ViewParent parent = sf46toywt.iiGwOFFnr.getParent();
                                    if (parent instanceof ViewGroup) {
                                        ((ViewGroup) parent).removeView(sf46toywt.iiGwOFFnr);
                                    }
                                    sf46toywt.kCA6Zs9sL.addView(sf46toywt.iiGwOFFnr, layoutParams2);
                                    if (!sf46toywt.iiGwOFFnr.hasFocus()) {
                                        sf46toywt.iiGwOFFnr.requestFocus();
                                    }
                                }
                            }
                            sf46toywt.Bhmn1KIah = true;
                            return;
                        }
                        z = true;
                        if (z) {
                        }
                        sf46toywt.Bhmn1KIah = true;
                        return;
                    }
                    View view2 = sf46toywt.GPLPRo6go;
                    if (!(view2 == null || (layoutParams = view2.getLayoutParams()) == null || layoutParams.width != -1)) {
                        i = -1;
                        sf46toywt.CBQ5d1kRq = false;
                        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                        layoutParams3.gravity = sf46toywt.tGV7Q6urW;
                        layoutParams3.windowAnimations = sf46toywt.dIocxURUo;
                        windowManager.addView(sf46toywt.kCA6Zs9sL, layoutParams3);
                        sf46toywt.kmSgne1rO = true;
                        return;
                    }
                    i = -2;
                    sf46toywt.CBQ5d1kRq = false;
                    WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                    layoutParams32.gravity = sf46toywt.tGV7Q6urW;
                    layoutParams32.windowAnimations = sf46toywt.dIocxURUo;
                    windowManager.addView(sf46toywt.kCA6Zs9sL, layoutParams32);
                    sf46toywt.kmSgne1rO = true;
                    return;
                }
                return;
            }
            dXrmkklc8(sf46toywt, true);
        }
    }

    public final void nlGCs0NZs(int i) {
        this.XYT7vJqNO = (1 << i) | this.XYT7vJqNO;
        if (!this.DuuXfa7LE) {
            View decorView = this.MzoOEjc4X.getDecorView();
            Runnable runnable = this.kktL0P5MG;
            WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
            VCCyeOu6I.kmSgne1rO(decorView, runnable);
            this.DuuXfa7LE = true;
        }
    }

    public final void o4LF8RkoQ() {
        if (this.CpG0imbht) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010e, code lost:
        if (r9.equals("ImageButton") == false) goto L_0x013d;
     */
    @Override // android.view.LayoutInflater.Factory2
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View view2;
        kZAmYIEbq kzamyiebq;
        if (this.ln3nf7LH3 == null) {
            String string = this.PSTqBLTET.obtainStyledAttributes(ZolH67hOx.oon79WMrY).getString(116);
            if (string == null) {
                kzamyiebq = new kZAmYIEbq();
            } else {
                try {
                    this.ln3nf7LH3 = (kZAmYIEbq) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    kzamyiebq = new kZAmYIEbq();
                }
            }
            this.ln3nf7LH3 = kzamyiebq;
        }
        kZAmYIEbq kzamyiebq2 = this.ln3nf7LH3;
        int i = BJDnPwIjV.q3BipwRCk;
        Objects.requireNonNull(kzamyiebq2);
        char c = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZolH67hOx.i8XZMQc6Z, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        Context fnuv4ksjz = (resourceId == 0 || ((context instanceof fnUv4KsJz) && ((fnUv4KsJz) context).q3BipwRCk == resourceId)) ? context : new fnUv4KsJz(context, resourceId);
        Objects.requireNonNull(str);
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -937446323:
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        View view3 = null;
        switch (c) {
            case 0:
                view2 = new TUluWcWHA(fnuv4ksjz, attributeSet);
                break;
            case 1:
                view2 = new y0dYoMLsd(fnuv4ksjz, attributeSet);
                break;
            case 2:
                view2 = new jkxnNrP7Z(fnuv4ksjz, attributeSet);
                break;
            case 3:
                view2 = kzamyiebq2.kCA6Zs9sL(fnuv4ksjz, attributeSet);
                kzamyiebq2.GPLPRo6go(view2, str);
                break;
            case 4:
                view2 = new jJtQlby2Y(fnuv4ksjz, attributeSet, R.attr.imageButtonStyle);
                break;
            case 5:
                view2 = new cxFeSPc2D(fnuv4ksjz, attributeSet);
                break;
            case 6:
                view2 = new JMfjgYvcq(fnuv4ksjz, attributeSet);
                break;
            case 7:
                view2 = kzamyiebq2.dIocxURUo(fnuv4ksjz, attributeSet);
                kzamyiebq2.GPLPRo6go(view2, str);
                break;
            case '\b':
                view2 = new jGHCddKf6(fnuv4ksjz, attributeSet);
                break;
            case '\t':
                view2 = new PQnXPgcS3(fnuv4ksjz, attributeSet, 0);
                break;
            case '\n':
                view2 = kzamyiebq2.q3BipwRCk(fnuv4ksjz, attributeSet);
                kzamyiebq2.GPLPRo6go(view2, str);
                break;
            case 11:
                view2 = kzamyiebq2.tGV7Q6urW(fnuv4ksjz, attributeSet);
                kzamyiebq2.GPLPRo6go(view2, str);
                break;
            case '\f':
                view2 = new JalUT392R(fnuv4ksjz, attributeSet, R.attr.editTextStyle);
                break;
            case '\r':
                view2 = kzamyiebq2.J4Ux7ym32(fnuv4ksjz, attributeSet);
                kzamyiebq2.GPLPRo6go(view2, str);
                break;
            default:
                view2 = null;
                break;
        }
        if (view2 == null && context != fnuv4ksjz) {
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                Object[] objArr = kzamyiebq2.q3BipwRCk;
                objArr[0] = fnuv4ksjz;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = kZAmYIEbq.dIocxURUo;
                        if (i2 < strArr.length) {
                            View iiGwOFFnr = kzamyiebq2.iiGwOFFnr(fnuv4ksjz, str, strArr[i2]);
                            if (iiGwOFFnr != null) {
                                Object[] objArr2 = kzamyiebq2.q3BipwRCk;
                                objArr2[0] = null;
                                objArr2[1] = null;
                                view3 = iiGwOFFnr;
                            } else {
                                i2++;
                            }
                        }
                    }
                } else {
                    view3 = kzamyiebq2.iiGwOFFnr(fnuv4ksjz, str, null);
                }
            } catch (Exception unused) {
            } finally {
                Object[] objArr3 = kzamyiebq2.q3BipwRCk;
                objArr3[0] = null;
                objArr3[1] = null;
            }
            view2 = view3;
        }
        if (view2 != null) {
            Context context2 = view2.getContext();
            if (context2 instanceof ContextWrapper) {
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                if (DptFihFec.q3BipwRCk(view2)) {
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, kZAmYIEbq.tGV7Q6urW);
                    String string2 = obtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        view2.setOnClickListener(new xpHkAvZqZ(view2, string2));
                    }
                    obtainStyledAttributes2.recycle();
                }
            }
        }
        return view2;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // con.yYWQSxv2D
    public boolean oon79WMrY(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.QNqj6nIzv && i == 108) {
            return false;
        }
        if (this.vNtjxmzUM && i == 1) {
            this.vNtjxmzUM = false;
        }
        if (i == 1) {
            o4LF8RkoQ();
            this.QNqj6nIzv = true;
            return true;
        } else if (i == 2) {
            o4LF8RkoQ();
            this.mUqPm6GBh = true;
            return true;
        } else if (i == 5) {
            o4LF8RkoQ();
            this.NyWTwPF6V = true;
            return true;
        } else if (i == 10) {
            o4LF8RkoQ();
            this.o4LF8RkoQ = true;
            return true;
        } else if (i == 108) {
            o4LF8RkoQ();
            this.vNtjxmzUM = true;
            return true;
        } else if (i != 109) {
            return this.MzoOEjc4X.requestFeature(i);
        } else {
            o4LF8RkoQ();
            this.i0Zug1mVk = true;
            return true;
        }
    }

    @Override // androidx.appcompat.view.menu.RG2GI7LDp.AbstractC0001RG2GI7LDp
    public boolean q3BipwRCk(RG2GI7LDp rG2GI7LDp, MenuItem menuItem) {
        sF46ToYwT iMyQMM6Qj;
        Window.Callback CpG0imbht = CpG0imbht();
        if (CpG0imbht == null || this.zHl31GGXU || (iMyQMM6Qj = iMyQMM6Qj(rG2GI7LDp.vPSbyrYWX())) == null) {
            return false;
        }
        return CpG0imbht.onMenuItemSelected(iMyQMM6Qj.q3BipwRCk, menuItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void qFBXIgpia() {
        zhWsuDChl zhwsudchl;
        qTSiJXW5w qtsijxw5w;
        i8XZMQc6Z();
        if (this.vNtjxmzUM && this.Eeka1udhb == null) {
            Object obj = this.Bhmn1KIah;
            if (obj instanceof Activity) {
                qtsijxw5w = new qTSiJXW5w((Activity) this.Bhmn1KIah, this.i0Zug1mVk);
            } else {
                if (obj instanceof Dialog) {
                    qtsijxw5w = new qTSiJXW5w((Dialog) this.Bhmn1KIah);
                }
                zhwsudchl = this.Eeka1udhb;
                if (zhwsudchl == null) {
                    zhwsudchl.tGV7Q6urW(this.KBYw84i3W);
                    return;
                }
                return;
            }
            this.Eeka1udhb = qtsijxw5w;
            zhwsudchl = this.Eeka1udhb;
            if (zhwsudchl == null) {
            }
        }
    }

    public void qVUwofr5s(int i, sF46ToYwT sf46toywt, Menu menu) {
        if (menu == null) {
            menu = sf46toywt.Puu3Rhg4F;
        }
        if (sf46toywt.kmSgne1rO && !this.zHl31GGXU) {
            this.ilHKhw3Yw.CBQ5d1kRq.onPanelClosed(i, menu);
        }
    }

    public void sk5s77z6Q(int i) {
        sF46ToYwT IytU16YUK = IytU16YUK(i);
        if (IytU16YUK.Puu3Rhg4F != null) {
            Bundle bundle = new Bundle();
            IytU16YUK.Puu3Rhg4F.ixWaw2akD(bundle);
            if (bundle.size() > 0) {
                IytU16YUK.MzoOEjc4X = bundle;
            }
            IytU16YUK.Puu3Rhg4F.i8XZMQc6Z();
            IytU16YUK.Puu3Rhg4F.clear();
        }
        IytU16YUK.PSTqBLTET = true;
        IytU16YUK.Bhmn1KIah = true;
        if ((i == 108 || i == 0) && this.ixWaw2akD != null) {
            sF46ToYwT IytU16YUK2 = IytU16YUK(0);
            IytU16YUK2.vPSbyrYWX = false;
            vNtjxmzUM(IytU16YUK2, null);
        }
    }

    @Override // con.yYWQSxv2D
    public void tGV7Q6urW(View view, ViewGroup.LayoutParams layoutParams) {
        i8XZMQc6Z();
        ((ViewGroup) this.qFBXIgpia.findViewById(16908290)).addView(view, layoutParams);
        this.ilHKhw3Yw.CBQ5d1kRq.onContentChanged();
    }

    public final boolean vNtjxmzUM(sF46ToYwT sf46toywt, KeyEvent keyEvent) {
        CVu4W89kR cVu4W89kR;
        CVu4W89kR cVu4W89kR2;
        CVu4W89kR cVu4W89kR3;
        Resources.Theme theme;
        CVu4W89kR cVu4W89kR4;
        if (this.zHl31GGXU) {
            return false;
        }
        if (sf46toywt.vPSbyrYWX) {
            return true;
        }
        sF46ToYwT sf46toywt2 = this.TyB1UUd72;
        if (!(sf46toywt2 == null || sf46toywt2 == sf46toywt)) {
            dXrmkklc8(sf46toywt2, false);
        }
        Window.Callback CpG0imbht = CpG0imbht();
        if (CpG0imbht != null) {
            sf46toywt.GPLPRo6go = CpG0imbht.onCreatePanelView(sf46toywt.q3BipwRCk);
        }
        int i = sf46toywt.q3BipwRCk;
        boolean z = i == 0 || i == 108;
        if (z && (cVu4W89kR4 = this.ixWaw2akD) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) cVu4W89kR4;
            actionBarOverlayLayout.Bhmn1KIah();
            ((qya5U7BN8) actionBarOverlayLayout.MzoOEjc4X).kmSgne1rO = true;
        }
        if (sf46toywt.GPLPRo6go == null) {
            RG2GI7LDp rG2GI7LDp = sf46toywt.Puu3Rhg4F;
            if (rG2GI7LDp == null || sf46toywt.PSTqBLTET) {
                if (rG2GI7LDp == null) {
                    Context context = this.PSTqBLTET;
                    int i2 = sf46toywt.q3BipwRCk;
                    if ((i2 == 0 || i2 == 108) && this.ixWaw2akD != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            fnUv4KsJz fnuv4ksjz = new fnUv4KsJz(context, 0);
                            fnuv4ksjz.getTheme().setTo(theme);
                            context = fnuv4ksjz;
                        }
                    }
                    RG2GI7LDp rG2GI7LDp2 = new RG2GI7LDp(context);
                    rG2GI7LDp2.kCA6Zs9sL = this;
                    sf46toywt.q3BipwRCk(rG2GI7LDp2);
                    if (sf46toywt.Puu3Rhg4F == null) {
                        return false;
                    }
                }
                if (z && (cVu4W89kR3 = this.ixWaw2akD) != null) {
                    if (this.sk5s77z6Q == null) {
                        this.sk5s77z6Q = new EV4wl6Jg6(this, 3);
                    }
                    ((ActionBarOverlayLayout) cVu4W89kR3).PSTqBLTET(sf46toywt.Puu3Rhg4F, this.sk5s77z6Q);
                }
                sf46toywt.Puu3Rhg4F.i8XZMQc6Z();
                if (!CpG0imbht.onCreatePanelMenu(sf46toywt.q3BipwRCk, sf46toywt.Puu3Rhg4F)) {
                    sf46toywt.q3BipwRCk(null);
                    if (z && (cVu4W89kR2 = this.ixWaw2akD) != null) {
                        ((ActionBarOverlayLayout) cVu4W89kR2).PSTqBLTET(null, this.sk5s77z6Q);
                    }
                    return false;
                }
                sf46toywt.PSTqBLTET = false;
            }
            sf46toywt.Puu3Rhg4F.i8XZMQc6Z();
            Bundle bundle = sf46toywt.MzoOEjc4X;
            if (bundle != null) {
                sf46toywt.Puu3Rhg4F.RG6kpfv3v(bundle);
                sf46toywt.MzoOEjc4X = null;
            }
            if (!CpG0imbht.onPreparePanel(0, sf46toywt.GPLPRo6go, sf46toywt.Puu3Rhg4F)) {
                if (z && (cVu4W89kR = this.ixWaw2akD) != null) {
                    ((ActionBarOverlayLayout) cVu4W89kR).PSTqBLTET(null, this.sk5s77z6Q);
                }
                sf46toywt.Puu3Rhg4F.WaUP0CF08();
                return false;
            }
            sf46toywt.Puu3Rhg4F.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            sf46toywt.Puu3Rhg4F.WaUP0CF08();
        }
        sf46toywt.vPSbyrYWX = true;
        sf46toywt.CBQ5d1kRq = false;
        this.TyB1UUd72 = sf46toywt;
        return true;
    }

    @Override // con.yYWQSxv2D
    public void vPSbyrYWX(int i) {
        i8XZMQc6Z();
        ViewGroup viewGroup = (ViewGroup) this.qFBXIgpia.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.PSTqBLTET).inflate(i, viewGroup);
        this.ilHKhw3Yw.CBQ5d1kRq.onContentChanged();
    }
}
