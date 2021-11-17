package androidx.lifecycle;

import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.mhl5lIdbQ;
import con.BgHiMFrEI;
import con.PPcH1Yg6X;
import con.WGohiwKSS;
import java.lang.reflect.Method;
import java.util.Objects;
/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements WGohiwKSS {
    public final PPcH1Yg6X CBQ5d1kRq;
    public final WGohiwKSS kmSgne1rO;

    /* loaded from: classes.dex */
    public static /* synthetic */ class RG2GI7LDp {
        public static final /* synthetic */ int[] q3BipwRCk;

        static {
            int[] iArr = new int[mhl5lIdbQ.RG2GI7LDp.values().length];
            q3BipwRCk = iArr;
            try {
                iArr[mhl5lIdbQ.RG2GI7LDp.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                q3BipwRCk[mhl5lIdbQ.RG2GI7LDp.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                q3BipwRCk[mhl5lIdbQ.RG2GI7LDp.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                q3BipwRCk[mhl5lIdbQ.RG2GI7LDp.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                q3BipwRCk[mhl5lIdbQ.RG2GI7LDp.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                q3BipwRCk[mhl5lIdbQ.RG2GI7LDp.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                q3BipwRCk[mhl5lIdbQ.RG2GI7LDp.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public FullLifecycleObserverAdapter(PPcH1Yg6X pPcH1Yg6X, WGohiwKSS wGohiwKSS) {
        this.CBQ5d1kRq = pPcH1Yg6X;
        this.kmSgne1rO = wGohiwKSS;
    }

    @Override // con.WGohiwKSS
    public void tGV7Q6urW(BgHiMFrEI bgHiMFrEI, mhl5lIdbQ.RG2GI7LDp rG2GI7LDp) {
        Object obj;
        switch (RG2GI7LDp.q3BipwRCk[rG2GI7LDp.ordinal()]) {
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                Objects.requireNonNull(this.CBQ5d1kRq);
                break;
            case 3:
                AndroidComposeView androidComposeView = (AndroidComposeView) this.CBQ5d1kRq;
                Objects.requireNonNull(androidComposeView);
                boolean z = false;
                try {
                    if (AndroidComposeView.ShSN9wbzk == null) {
                        Class<?> cls = Class.forName("android.os.SystemProperties");
                        AndroidComposeView.ShSN9wbzk = cls;
                        AndroidComposeView.Ihm5o4uLx = cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                    }
                    Method method = AndroidComposeView.Ihm5o4uLx;
                    Boolean bool = null;
                    if (method == null) {
                        obj = null;
                    } else {
                        obj = method.invoke(null, "debug.layout", Boolean.FALSE);
                    }
                    if (obj instanceof Boolean) {
                        bool = (Boolean) obj;
                    }
                    if (bool != null) {
                        z = bool.booleanValue();
                    }
                } catch (Exception unused) {
                }
                androidComposeView.setShowLayoutBounds(z);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        WGohiwKSS wGohiwKSS = this.kmSgne1rO;
        if (wGohiwKSS != null) {
            wGohiwKSS.tGV7Q6urW(bgHiMFrEI, rG2GI7LDp);
        }
    }
}
