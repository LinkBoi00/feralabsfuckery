package androidx.compose.ui.tooling;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import con.AllhocNWS;
import con.Dj3S6Ugny;
import con.GF8yApJaC;
import con.NSHW2VKuh;
import con.PmYqqGuHi;
import con.anXlDk6fV;
import con.jl2eHUpq8;
import con.r6NbD4wnj;
import con.ufrUqYgoW;
import con.wvCfm8VkF;
import con.xpuSUT7Gh;
import java.lang.reflect.Constructor;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class PreviewActivity extends ComponentActivity {
    public final String dXrmkklc8 = "PreviewActivity";

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f1, code lost:
        if (r8 == false) goto L_0x00f3;
     */
    @Override // androidx.activity.ComponentActivity, con.pc1YcJups, android.app.Activity
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onCreate(Bundle bundle) {
        String stringExtra;
        Class<?> cls;
        Object[] objArr;
        Object obj;
        Object obj2;
        int i;
        super.onCreate(bundle);
        if ((getApplicationInfo().flags & 2) == 0) {
            Log.d(this.dXrmkklc8, "Application is not debuggable. Compose Preview not allowed.");
            finish();
            return;
        }
        Intent intent = getIntent();
        if (!(intent == null || (stringExtra = intent.getStringExtra("composable")) == null)) {
            Log.d(this.dXrmkklc8, anXlDk6fV.iMyQMM6Qj("PreviewActivity has composable ", stringExtra));
            int TyB1UUd72 = r6NbD4wnj.TyB1UUd72(stringExtra, '.', 0, false, 6);
            String substring = TyB1UUd72 == -1 ? stringExtra : stringExtra.substring(0, TyB1UUd72);
            String OpLJtmvFM = r6NbD4wnj.OpLJtmvFM(stringExtra, '.', null, 2);
            String stringExtra2 = getIntent().getStringExtra("parameterProviderClassName");
            if (stringExtra2 == null) {
                Log.d(this.dXrmkklc8, "Previewing '" + OpLJtmvFM + "' without a parameter provider.");
                AllhocNWS.q3BipwRCk(this, null, xpuSUT7Gh.nlGCs0NZs(-985531688, true, new GF8yApJaC(substring, OpLJtmvFM)), 1);
                return;
            }
            Log.d(this.dXrmkklc8, "Previewing '" + OpLJtmvFM + "' with parameter provider: '" + stringExtra2 + '\'');
            try {
                cls = Class.forName(stringExtra2);
            } catch (ClassNotFoundException e) {
                Log.e("PreviewProvider", "Unable to find provider '" + stringExtra2 + '\'', e);
                cls = null;
            }
            int intExtra = getIntent().getIntExtra("parameterProviderIndex", -1);
            if (cls != null) {
                try {
                    Constructor<?>[] constructors = cls.getConstructors();
                    int length = constructors.length;
                    int i2 = 0;
                    boolean z = false;
                    Constructor<?> constructor = null;
                    while (true) {
                        if (i2 < length) {
                            Constructor<?> constructor2 = constructors[i2];
                            if (constructor2.getParameterTypes().length == 0) {
                                if (z) {
                                    break;
                                }
                                z = true;
                                constructor = constructor2;
                            }
                            i2++;
                        }
                    }
                    constructor = null;
                    if (constructor == null) {
                        constructor = null;
                    } else {
                        constructor.setAccessible(true);
                    }
                    if (constructor != null) {
                        Object newInstance = constructor.newInstance(new Object[0]);
                        if (newInstance != null) {
                            Dj3S6Ugny dj3S6Ugny = (Dj3S6Ugny) newInstance;
                            if (intExtra < 0) {
                                PmYqqGuHi q3BipwRCk = dj3S6Ugny.q3BipwRCk();
                                int count = dj3S6Ugny.getCount();
                                Iterator it = q3BipwRCk.iterator();
                                objArr = new Object[count];
                                for (int i3 = 0; i3 < count; i3++) {
                                    objArr[i3] = it.next();
                                }
                            } else {
                                objArr = new Object[1];
                                PmYqqGuHi q3BipwRCk2 = dj3S6Ugny.q3BipwRCk();
                                ufrUqYgoW ufruqygow = new ufrUqYgoW(intExtra, 1);
                                if (intExtra >= 0) {
                                    Iterator it2 = q3BipwRCk2.iterator();
                                    int i4 = 0;
                                    while (it2.hasNext()) {
                                        obj = it2.next();
                                        i4++;
                                        if (intExtra == i4) {
                                            break;
                                        }
                                    }
                                }
                                obj = ufruqygow.IytU16YUK(Integer.valueOf(intExtra));
                                objArr[0] = obj;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>");
                        }
                    } else {
                        throw new IllegalArgumentException("PreviewParameterProvider constructor can not have parameters");
                    }
                } catch (NSHW2VKuh unused) {
                    throw new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
                }
            } else {
                objArr = new Object[0];
            }
            if (objArr.length > 1) {
                i = -985538154;
                obj2 = new wvCfm8VkF(objArr, substring, OpLJtmvFM);
            } else {
                i = -985537892;
                obj2 = new jl2eHUpq8(substring, OpLJtmvFM, objArr);
            }
            AllhocNWS.q3BipwRCk(this, null, xpuSUT7Gh.nlGCs0NZs(i, true, obj2), 1);
        }
    }
}
