package con;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import con.k007RzV1x;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public abstract class dnBSj5uJN {
    public static final Object Bhmn1KIah(long j, Way959ade way959ade) {
        if (j <= 0) {
            return qih4lW99W.q3BipwRCk;
        }
        tmgChDFqU tmgchdfqu = new tmgChDFqU(idpM54xlp.PSTqBLTET(way959ade), 1);
        tmgchdfqu.Eeka1udhb();
        if (j < Long.MAX_VALUE) {
            MzoOEjc4X(tmgchdfqu.MzoOEjc4X).dIocxURUo(j, tmgchdfqu);
        }
        Object qVUwofr5s = tmgchdfqu.qVUwofr5s();
        return qVUwofr5s == kBKJSqCSL.COROUTINE_SUSPENDED ? qVUwofr5s : qih4lW99W.q3BipwRCk;
    }

    public static qdam7I1O8 CBQ5d1kRq(int i) {
        if (i == 0) {
            return new d6ChEZHmJ();
        }
        if (i != 1) {
            return new d6ChEZHmJ();
        }
        return new VU05rwNLK();
    }

    public static Intent Eeka1udhb(Context context, ComponentName componentName) {
        String dXrmkklc8 = dXrmkklc8(context, componentName);
        if (dXrmkklc8 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), dXrmkklc8);
        return dXrmkklc8(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:181:0x02db, code lost:
        if (r3[r17].iiGwOFFnr.dIocxURUo == r9) goto L_0x02df;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0142, code lost:
        if (r4[r2].iiGwOFFnr.dIocxURUo == r5) goto L_0x0146;
     */
    /* JADX WARN: Removed duplicated region for block: B:211:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x049c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0508 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0604 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0712 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:407:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0753 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0770 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static void GPLPRo6go(S5aezmTgi s5aezmTgi, WLlBJNJ2W wLlBJNJ2W, ArrayList arrayList, int i) {
        int i2;
        Putqqk1FR[] putqqk1FRArr;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        k007RzV1x.RG2GI7LDp rG2GI7LDp;
        boolean z2;
        int i7;
        boolean z3;
        boolean z4;
        ArrayList arrayList2;
        k007RzV1x k007rzv1x;
        k007RzV1x k007rzv1x2;
        h7j7Zcum2 h7j7zcum2;
        k007RzV1x k007rzv1x3;
        int i8;
        h7j7Zcum2 h7j7zcum22;
        miIsFJ8kP miisfj8kp;
        miIsFJ8kP miisfj8kp2;
        int i9;
        k007RzV1x k007rzv1x4;
        h7j7Zcum2 h7j7zcum23;
        h7j7Zcum2 h7j7zcum24;
        h7j7Zcum2 h7j7zcum25;
        k007RzV1x k007rzv1x5;
        k007RzV1x k007rzv1x6;
        miIsFJ8kP miisfj8kp3;
        miIsFJ8kP miisfj8kp4;
        h7j7Zcum2 h7j7zcum26;
        k007RzV1x k007rzv1x7;
        h7j7Zcum2 h7j7zcum27;
        int i10;
        int i11;
        k007RzV1x k007rzv1x8;
        k007RzV1x k007rzv1x9;
        int i12;
        k007RzV1x k007rzv1x10;
        miIsFJ8kP miisfj8kp5;
        h7j7Zcum2 h7j7zcum28;
        h7j7Zcum2 h7j7zcum29;
        int size;
        int i13;
        ArrayList arrayList3;
        int i14;
        float f;
        k007RzV1x.RG2GI7LDp rG2GI7LDp2;
        miIsFJ8kP miisfj8kp6;
        int i15;
        int i16;
        miIsFJ8kP miisfj8kp7;
        k007RzV1x k007rzv1x11;
        int i17;
        k007RzV1x k007rzv1x12;
        k007RzV1x k007rzv1x13;
        int i18;
        boolean z5;
        boolean z6;
        boolean z7;
        int i19;
        boolean z8;
        h7j7Zcum2 h7j7zcum210;
        k007RzV1x k007rzv1x14;
        S5aezmTgi s5aezmTgi2 = s5aezmTgi;
        ArrayList arrayList4 = arrayList;
        k007RzV1x.RG2GI7LDp rG2GI7LDp3 = k007RzV1x.RG2GI7LDp.MATCH_CONSTRAINT;
        int i20 = 2;
        if (i == 0) {
            i3 = s5aezmTgi2.aS2AFthYA;
            putqqk1FRArr = s5aezmTgi2.koMoKnP1S;
            i2 = 0;
        } else {
            i3 = s5aezmTgi2.tFD7BDQ71;
            putqqk1FRArr = s5aezmTgi2.BqpzfZavo;
            i2 = 2;
        }
        int i21 = 0;
        while (i21 < i3) {
            Putqqk1FR putqqk1FR = putqqk1FRArr[i21];
            miIsFJ8kP miisfj8kp8 = null;
            int i22 = 8;
            int i23 = 1;
            if (!putqqk1FR.dXrmkklc8) {
                int i24 = putqqk1FR.PSTqBLTET * i20;
                k007RzV1x k007rzv1x15 = putqqk1FR.q3BipwRCk;
                k007RzV1x k007rzv1x16 = k007rzv1x15;
                boolean z9 = false;
                while (!z9) {
                    putqqk1FR.yWvV4ePLl += i23;
                    k007RzV1x[] k007rzv1xArr = k007rzv1x15.lqFHPHdW3;
                    int i25 = putqqk1FR.PSTqBLTET;
                    k007rzv1xArr[i25] = null;
                    k007rzv1x15.KlYagMRWx[i25] = null;
                    if (k007rzv1x15.Dr7UqlxEV != i22) {
                        putqqk1FR.CBQ5d1kRq += i23;
                        if (k007rzv1x15.vPSbyrYWX(i25) != rG2GI7LDp3) {
                            int i26 = putqqk1FR.kmSgne1rO;
                            int i27 = putqqk1FR.PSTqBLTET;
                            putqqk1FR.kmSgne1rO = i26 + (i27 == 0 ? k007rzv1x15.dXrmkklc8() : i27 == i23 ? k007rzv1x15.CBQ5d1kRq() : 0);
                        }
                        int dIocxURUo = k007rzv1x15.j22ftfeNI[i24].dIocxURUo() + putqqk1FR.kmSgne1rO;
                        putqqk1FR.kmSgne1rO = dIocxURUo;
                        int i28 = i24 + 1;
                        putqqk1FR.kmSgne1rO = k007rzv1x15.j22ftfeNI[i28].dIocxURUo() + dIocxURUo;
                        int dIocxURUo2 = k007rzv1x15.j22ftfeNI[i24].dIocxURUo() + putqqk1FR.Bhmn1KIah;
                        putqqk1FR.Bhmn1KIah = dIocxURUo2;
                        putqqk1FR.Bhmn1KIah = k007rzv1x15.j22ftfeNI[i28].dIocxURUo() + dIocxURUo2;
                        if (putqqk1FR.J4Ux7ym32 == null) {
                            putqqk1FR.J4Ux7ym32 = k007rzv1x15;
                        }
                        putqqk1FR.dIocxURUo = k007rzv1x15;
                        k007RzV1x.RG2GI7LDp[] rG2GI7LDpArr = k007rzv1x15.zHl31GGXU;
                        int i29 = putqqk1FR.PSTqBLTET;
                        if (rG2GI7LDpArr[i29] == rG2GI7LDp3) {
                            int[] iArr = k007rzv1x15.ixWaw2akD;
                            if (iArr[i29] == 0 || iArr[i29] == 3 || iArr[i29] == 2) {
                                putqqk1FR.oon79WMrY++;
                                float[] fArr = k007rzv1x15.buPcffgdD;
                                float f2 = fArr[i29];
                                if (f2 > 0.0f) {
                                    z8 = z9;
                                    putqqk1FR.vPSbyrYWX += fArr[i29];
                                } else {
                                    z8 = z9;
                                }
                                if (k007rzv1x15.Dr7UqlxEV != 8 && rG2GI7LDpArr[i29] == rG2GI7LDp3 && (iArr[i29] == 0 || iArr[i29] == 3)) {
                                    if (f2 < 0.0f) {
                                        putqqk1FR.ilHKhw3Yw = true;
                                    } else {
                                        putqqk1FR.qVUwofr5s = true;
                                    }
                                    if (putqqk1FR.Puu3Rhg4F == null) {
                                        putqqk1FR.Puu3Rhg4F = new ArrayList();
                                    }
                                    putqqk1FR.Puu3Rhg4F.add(k007rzv1x15);
                                }
                                if (putqqk1FR.iiGwOFFnr == null) {
                                    putqqk1FR.iiGwOFFnr = k007rzv1x15;
                                }
                                k007RzV1x k007rzv1x17 = putqqk1FR.GPLPRo6go;
                                if (k007rzv1x17 != null) {
                                    k007rzv1x17.KlYagMRWx[putqqk1FR.PSTqBLTET] = k007rzv1x15;
                                }
                                putqqk1FR.GPLPRo6go = k007rzv1x15;
                                if (k007rzv1x16 != k007rzv1x15) {
                                    k007rzv1x16.lqFHPHdW3[putqqk1FR.PSTqBLTET] = k007rzv1x15;
                                }
                                h7j7zcum210 = k007rzv1x15.j22ftfeNI[i24 + 1].iiGwOFFnr;
                                if (h7j7zcum210 != null) {
                                    k007rzv1x14 = h7j7zcum210.dIocxURUo;
                                    h7j7Zcum2[] h7j7zcum2Arr = k007rzv1x14.j22ftfeNI;
                                    if (h7j7zcum2Arr[i24].iiGwOFFnr != null) {
                                    }
                                }
                                k007rzv1x14 = null;
                                if (k007rzv1x14 == null) {
                                    z9 = z8;
                                } else {
                                    k007rzv1x14 = k007rzv1x15;
                                    z9 = true;
                                }
                                k007rzv1x16 = k007rzv1x15;
                                i23 = 1;
                                i22 = 8;
                                k007rzv1x15 = k007rzv1x14;
                            }
                        }
                    }
                    z8 = z9;
                    if (k007rzv1x16 != k007rzv1x15) {
                    }
                    h7j7zcum210 = k007rzv1x15.j22ftfeNI[i24 + 1].iiGwOFFnr;
                    if (h7j7zcum210 != null) {
                    }
                    k007rzv1x14 = null;
                    if (k007rzv1x14 == null) {
                    }
                    k007rzv1x16 = k007rzv1x15;
                    i23 = 1;
                    i22 = 8;
                    k007rzv1x15 = k007rzv1x14;
                }
                k007RzV1x k007rzv1x18 = putqqk1FR.J4Ux7ym32;
                if (k007rzv1x18 != null) {
                    putqqk1FR.kmSgne1rO -= k007rzv1x18.j22ftfeNI[i24].dIocxURUo();
                }
                k007RzV1x k007rzv1x19 = putqqk1FR.dIocxURUo;
                if (k007rzv1x19 != null) {
                    putqqk1FR.kmSgne1rO -= k007rzv1x19.j22ftfeNI[i24 + 1].dIocxURUo();
                }
                putqqk1FR.tGV7Q6urW = k007rzv1x15;
                if (putqqk1FR.PSTqBLTET != 0 || !putqqk1FR.MzoOEjc4X) {
                    putqqk1FR.kCA6Zs9sL = putqqk1FR.q3BipwRCk;
                } else {
                    putqqk1FR.kCA6Zs9sL = k007rzv1x15;
                }
                putqqk1FR.Eeka1udhb = putqqk1FR.qVUwofr5s && putqqk1FR.ilHKhw3Yw;
                z = true;
            } else {
                z = true;
            }
            putqqk1FR.dXrmkklc8 = z;
            if (arrayList4 == null || arrayList4.contains(putqqk1FR.q3BipwRCk)) {
                k007RzV1x k007rzv1x20 = putqqk1FR.q3BipwRCk;
                k007RzV1x k007rzv1x21 = putqqk1FR.tGV7Q6urW;
                k007RzV1x k007rzv1x22 = putqqk1FR.J4Ux7ym32;
                k007RzV1x k007rzv1x23 = putqqk1FR.dIocxURUo;
                k007RzV1x k007rzv1x24 = putqqk1FR.kCA6Zs9sL;
                float f3 = putqqk1FR.vPSbyrYWX;
                boolean z10 = s5aezmTgi2.zHl31GGXU[i] == k007RzV1x.RG2GI7LDp.WRAP_CONTENT;
                if (i == 0) {
                    int i30 = k007rzv1x24.R2hkbNqWf;
                    boolean z11 = i30 == 0;
                    if (i30 == 1) {
                        z5 = true;
                        i7 = i21;
                        i19 = 2;
                    } else {
                        i7 = i21;
                        i19 = 2;
                        z5 = false;
                    }
                    if (i30 == i19) {
                        z7 = z11;
                        z2 = z5;
                        z3 = z7;
                        z4 = true;
                    } else {
                        z6 = z11;
                        z2 = z5;
                        z3 = z6;
                        z4 = false;
                    }
                } else {
                    i7 = i21;
                    int i31 = k007rzv1x24.IG30YE5GU;
                    boolean z12 = i31 == 0;
                    boolean z13 = i31 == 1;
                    if (i31 == 2) {
                        z7 = z12;
                        z5 = z13;
                        z2 = z5;
                        z3 = z7;
                        z4 = true;
                    } else {
                        z6 = z12;
                        z5 = z13;
                        z2 = z5;
                        z3 = z6;
                        z4 = false;
                    }
                }
                k007RzV1x k007rzv1x25 = k007rzv1x20;
                boolean z14 = false;
                while (!z14) {
                    h7j7Zcum2 h7j7zcum211 = k007rzv1x25.j22ftfeNI[i2];
                    int i32 = z4 ? 1 : 4;
                    int dIocxURUo3 = h7j7zcum211.dIocxURUo();
                    boolean z15 = k007rzv1x25.zHl31GGXU[i] == rG2GI7LDp3 && k007rzv1x25.ixWaw2akD[i] == 0;
                    h7j7Zcum2 h7j7zcum212 = h7j7zcum211.iiGwOFFnr;
                    if (!(h7j7zcum212 == null || k007rzv1x25 == k007rzv1x20)) {
                        dIocxURUo3 = h7j7zcum212.dIocxURUo() + dIocxURUo3;
                    }
                    if (!z4 || k007rzv1x25 == k007rzv1x20 || k007rzv1x25 == k007rzv1x22) {
                        i17 = i3;
                    } else {
                        i17 = i3;
                        i32 = 8;
                    }
                    h7j7Zcum2 h7j7zcum213 = h7j7zcum211.iiGwOFFnr;
                    if (h7j7zcum213 != null) {
                        if (k007rzv1x25 == k007rzv1x22) {
                            k007rzv1x12 = k007rzv1x20;
                            wLlBJNJ2W.iiGwOFFnr(h7j7zcum211.yWvV4ePLl, h7j7zcum213.yWvV4ePLl, dIocxURUo3, 6);
                        } else {
                            k007rzv1x12 = k007rzv1x20;
                            wLlBJNJ2W.iiGwOFFnr(h7j7zcum211.yWvV4ePLl, h7j7zcum213.yWvV4ePLl, dIocxURUo3, 8);
                        }
                        if (z15 && !z4) {
                            i32 = 5;
                        }
                        wLlBJNJ2W.dIocxURUo(h7j7zcum211.yWvV4ePLl, h7j7zcum211.iiGwOFFnr.yWvV4ePLl, dIocxURUo3, (k007rzv1x25 != k007rzv1x22 || !z4 || !k007rzv1x25.L4EwGfXiQ[i]) ? i32 : 5);
                    } else {
                        k007rzv1x12 = k007rzv1x20;
                    }
                    if (z10) {
                        if (k007rzv1x25.Dr7UqlxEV == 8 || k007rzv1x25.zHl31GGXU[i] != rG2GI7LDp3) {
                            i18 = 0;
                        } else {
                            h7j7Zcum2[] h7j7zcum2Arr2 = k007rzv1x25.j22ftfeNI;
                            i18 = 0;
                            wLlBJNJ2W.iiGwOFFnr(h7j7zcum2Arr2[i2 + 1].yWvV4ePLl, h7j7zcum2Arr2[i2].yWvV4ePLl, 0, 5);
                        }
                        wLlBJNJ2W.iiGwOFFnr(k007rzv1x25.j22ftfeNI[i2].yWvV4ePLl, s5aezmTgi2.j22ftfeNI[i2].yWvV4ePLl, i18, 8);
                    }
                    h7j7Zcum2 h7j7zcum214 = k007rzv1x25.j22ftfeNI[i2 + 1].iiGwOFFnr;
                    if (h7j7zcum214 != null) {
                        k007rzv1x13 = h7j7zcum214.dIocxURUo;
                        h7j7Zcum2[] h7j7zcum2Arr3 = k007rzv1x13.j22ftfeNI;
                        if (h7j7zcum2Arr3[i2].iiGwOFFnr != null) {
                        }
                    }
                    k007rzv1x13 = null;
                    if (k007rzv1x13 != null) {
                        k007rzv1x25 = k007rzv1x13;
                        z14 = z14;
                    } else {
                        z14 = true;
                    }
                    i3 = i17;
                    k007rzv1x24 = k007rzv1x24;
                    k007rzv1x20 = k007rzv1x12;
                }
                i4 = i3;
                if (k007rzv1x23 != null) {
                    int i33 = i2 + 1;
                    if (k007rzv1x21.j22ftfeNI[i33].iiGwOFFnr != null) {
                        h7j7Zcum2 h7j7zcum215 = k007rzv1x23.j22ftfeNI[i33];
                        if ((k007rzv1x23.zHl31GGXU[i] == rG2GI7LDp3 && k007rzv1x23.ixWaw2akD[i] == 0) && !z4) {
                            h7j7Zcum2 h7j7zcum216 = h7j7zcum215.iiGwOFFnr;
                            if (h7j7zcum216.dIocxURUo == s5aezmTgi2) {
                                wLlBJNJ2W.dIocxURUo(h7j7zcum215.yWvV4ePLl, h7j7zcum216.yWvV4ePLl, -h7j7zcum215.dIocxURUo(), 5);
                                wLlBJNJ2W.GPLPRo6go(h7j7zcum215.yWvV4ePLl, k007rzv1x21.j22ftfeNI[i33].iiGwOFFnr.yWvV4ePLl, -h7j7zcum215.dIocxURUo(), 6);
                                if (z10) {
                                    int i34 = i2 + 1;
                                    miIsFJ8kP miisfj8kp9 = s5aezmTgi2.j22ftfeNI[i34].yWvV4ePLl;
                                    h7j7Zcum2[] h7j7zcum2Arr4 = k007rzv1x21.j22ftfeNI;
                                    wLlBJNJ2W.iiGwOFFnr(miisfj8kp9, h7j7zcum2Arr4[i34].yWvV4ePLl, h7j7zcum2Arr4[i34].dIocxURUo(), 8);
                                }
                                arrayList2 = putqqk1FR.Puu3Rhg4F;
                                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                                    float f4 = (putqqk1FR.ilHKhw3Yw || putqqk1FR.Eeka1udhb) ? f3 : (float) putqqk1FR.oon79WMrY;
                                    k007RzV1x k007rzv1x26 = null;
                                    float f5 = 0.0f;
                                    i13 = 0;
                                    while (i13 < size) {
                                        k007RzV1x k007rzv1x27 = (k007RzV1x) arrayList2.get(i13);
                                        float f6 = k007rzv1x27.buPcffgdD[i];
                                        if (f6 < 0.0f) {
                                            if (putqqk1FR.Eeka1udhb) {
                                                h7j7Zcum2[] h7j7zcum2Arr5 = k007rzv1x27.j22ftfeNI;
                                                miisfj8kp6 = h7j7zcum2Arr5[i2 + 1].yWvV4ePLl;
                                                miisfj8kp7 = h7j7zcum2Arr5[i2].yWvV4ePLl;
                                                rG2GI7LDp2 = rG2GI7LDp3;
                                                i16 = 0;
                                                i15 = 4;
                                                wLlBJNJ2W.dIocxURUo(miisfj8kp6, miisfj8kp7, i16, i15);
                                                arrayList3 = arrayList2;
                                                i14 = size;
                                                f = f4;
                                                i13++;
                                                rG2GI7LDp3 = rG2GI7LDp2;
                                                f4 = f;
                                                size = i14;
                                                arrayList2 = arrayList3;
                                            } else {
                                                f6 = 1.0f;
                                            }
                                        }
                                        int i35 = (f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1));
                                        if (i35 == 0) {
                                            h7j7Zcum2[] h7j7zcum2Arr6 = k007rzv1x27.j22ftfeNI;
                                            miisfj8kp6 = h7j7zcum2Arr6[i2 + 1].yWvV4ePLl;
                                            miisfj8kp7 = h7j7zcum2Arr6[i2].yWvV4ePLl;
                                            rG2GI7LDp2 = rG2GI7LDp3;
                                            i16 = 0;
                                            i15 = 8;
                                            wLlBJNJ2W.dIocxURUo(miisfj8kp6, miisfj8kp7, i16, i15);
                                            arrayList3 = arrayList2;
                                            i14 = size;
                                            f = f4;
                                            i13++;
                                            rG2GI7LDp3 = rG2GI7LDp2;
                                            f4 = f;
                                            size = i14;
                                            arrayList2 = arrayList3;
                                        } else {
                                            rG2GI7LDp2 = rG2GI7LDp3;
                                            if (k007rzv1x26 != null) {
                                                h7j7Zcum2[] h7j7zcum2Arr7 = k007rzv1x26.j22ftfeNI;
                                                miIsFJ8kP miisfj8kp10 = h7j7zcum2Arr7[i2].yWvV4ePLl;
                                                int i36 = i2 + 1;
                                                miIsFJ8kP miisfj8kp11 = h7j7zcum2Arr7[i36].yWvV4ePLl;
                                                h7j7Zcum2[] h7j7zcum2Arr8 = k007rzv1x27.j22ftfeNI;
                                                arrayList3 = arrayList2;
                                                miIsFJ8kP miisfj8kp12 = h7j7zcum2Arr8[i2].yWvV4ePLl;
                                                miIsFJ8kP miisfj8kp13 = h7j7zcum2Arr8[i36].yWvV4ePLl;
                                                i14 = size;
                                                uXZOTWgvT kmSgne1rO = wLlBJNJ2W.kmSgne1rO();
                                                k007rzv1x11 = k007rzv1x27;
                                                kmSgne1rO.J4Ux7ym32 = 0.0f;
                                                if (f4 == 0.0f || f5 == f6) {
                                                    f = f4;
                                                    kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp10, 1.0f);
                                                    kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp11, -1.0f);
                                                    kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp13, 1.0f);
                                                    kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp12, -1.0f);
                                                } else {
                                                    if (f5 == 0.0f) {
                                                        kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp10, 1.0f);
                                                        kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp11, -1.0f);
                                                    } else if (i35 == 0) {
                                                        kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp12, 1.0f);
                                                        kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp13, -1.0f);
                                                    } else {
                                                        float f7 = (f5 / f4) / (f6 / f4);
                                                        f = f4;
                                                        kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp10, 1.0f);
                                                        kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp11, -1.0f);
                                                        kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp13, f7);
                                                        kmSgne1rO.dIocxURUo.J4Ux7ym32(miisfj8kp12, -f7);
                                                    }
                                                    f = f4;
                                                }
                                                wLlBJNJ2W.tGV7Q6urW(kmSgne1rO);
                                            } else {
                                                arrayList3 = arrayList2;
                                                i14 = size;
                                                f = f4;
                                                k007rzv1x11 = k007rzv1x27;
                                            }
                                            f5 = f6;
                                            k007rzv1x26 = k007rzv1x11;
                                            i13++;
                                            rG2GI7LDp3 = rG2GI7LDp2;
                                            f4 = f;
                                            size = i14;
                                            arrayList2 = arrayList3;
                                        }
                                    }
                                }
                                rG2GI7LDp = rG2GI7LDp3;
                                if (k007rzv1x22 != null || (k007rzv1x22 != k007rzv1x23 && !z4)) {
                                    k007rzv1x2 = k007rzv1x23;
                                    k007rzv1x = k007rzv1x22;
                                    i9 = i7;
                                    i6 = 2;
                                    if (z3 || k007rzv1x == null) {
                                        i5 = i9;
                                        int i37 = 8;
                                        if (z2 && k007rzv1x != null) {
                                            int i38 = putqqk1FR.oon79WMrY;
                                            boolean z16 = i38 <= 0 && putqqk1FR.yWvV4ePLl == i38;
                                            k007RzV1x k007rzv1x28 = k007rzv1x;
                                            for (k007rzv1x4 = k007rzv1x28; k007rzv1x4 != null; k007rzv1x4 = k007rzv1x6) {
                                                k007RzV1x k007rzv1x29 = k007rzv1x4.lqFHPHdW3[i];
                                                while (k007rzv1x29 != null && k007rzv1x29.Dr7UqlxEV == i37) {
                                                    k007rzv1x29 = k007rzv1x29.lqFHPHdW3[i];
                                                }
                                                if (k007rzv1x4 == k007rzv1x || k007rzv1x4 == k007rzv1x2 || k007rzv1x29 == null) {
                                                    k007rzv1x5 = k007rzv1x28;
                                                    k007rzv1x6 = k007rzv1x29;
                                                } else {
                                                    k007RzV1x k007rzv1x30 = k007rzv1x29 == k007rzv1x2 ? null : k007rzv1x29;
                                                    h7j7Zcum2 h7j7zcum217 = k007rzv1x4.j22ftfeNI[i2];
                                                    miIsFJ8kP miisfj8kp14 = h7j7zcum217.yWvV4ePLl;
                                                    int i39 = i2 + 1;
                                                    miIsFJ8kP miisfj8kp15 = k007rzv1x28.j22ftfeNI[i39].yWvV4ePLl;
                                                    int dIocxURUo4 = h7j7zcum217.dIocxURUo();
                                                    int dIocxURUo5 = k007rzv1x4.j22ftfeNI[i39].dIocxURUo();
                                                    if (k007rzv1x30 != null) {
                                                        h7j7zcum26 = k007rzv1x30.j22ftfeNI[i2];
                                                        miisfj8kp4 = h7j7zcum26.yWvV4ePLl;
                                                        h7j7zcum27 = h7j7zcum26.iiGwOFFnr;
                                                        if (h7j7zcum27 == null) {
                                                            miisfj8kp3 = null;
                                                            int dIocxURUo6 = h7j7zcum26 == null ? h7j7zcum26.dIocxURUo() + dIocxURUo5 : dIocxURUo5;
                                                            int dIocxURUo7 = k007rzv1x28.j22ftfeNI[i39].dIocxURUo() + dIocxURUo4;
                                                            int i40 = !z16 ? 8 : 4;
                                                            if (miisfj8kp14 != null || miisfj8kp15 == null || miisfj8kp4 == null || miisfj8kp3 == null) {
                                                                k007rzv1x7 = k007rzv1x30;
                                                                k007rzv1x5 = k007rzv1x28;
                                                            } else {
                                                                k007rzv1x7 = k007rzv1x30;
                                                                k007rzv1x5 = k007rzv1x28;
                                                                wLlBJNJ2W.J4Ux7ym32(miisfj8kp14, miisfj8kp15, dIocxURUo7, 0.5f, miisfj8kp4, miisfj8kp3, dIocxURUo6, i40);
                                                            }
                                                            k007rzv1x6 = k007rzv1x7;
                                                        }
                                                    } else {
                                                        h7j7zcum26 = k007rzv1x2.j22ftfeNI[i2];
                                                        miisfj8kp4 = h7j7zcum26 != null ? h7j7zcum26.yWvV4ePLl : null;
                                                        h7j7zcum27 = k007rzv1x4.j22ftfeNI[i39];
                                                    }
                                                    miisfj8kp3 = h7j7zcum27.yWvV4ePLl;
                                                    if (h7j7zcum26 == null) {
                                                    }
                                                    int dIocxURUo72 = k007rzv1x28.j22ftfeNI[i39].dIocxURUo() + dIocxURUo4;
                                                    if (!z16) {
                                                    }
                                                    if (miisfj8kp14 != null) {
                                                    }
                                                    k007rzv1x7 = k007rzv1x30;
                                                    k007rzv1x5 = k007rzv1x28;
                                                    k007rzv1x6 = k007rzv1x7;
                                                }
                                                k007rzv1x28 = k007rzv1x4.Dr7UqlxEV != 8 ? k007rzv1x4 : k007rzv1x5;
                                                i37 = 8;
                                            }
                                            h7j7Zcum2 h7j7zcum218 = k007rzv1x.j22ftfeNI[i2];
                                            h7j7zcum23 = k007rzv1x20.j22ftfeNI[i2].iiGwOFFnr;
                                            int i41 = i2 + 1;
                                            h7j7zcum24 = k007rzv1x2.j22ftfeNI[i41];
                                            h7j7zcum25 = k007rzv1x21.j22ftfeNI[i41].iiGwOFFnr;
                                            if (h7j7zcum23 != null) {
                                                if (k007rzv1x != k007rzv1x2) {
                                                    wLlBJNJ2W.dIocxURUo(h7j7zcum218.yWvV4ePLl, h7j7zcum23.yWvV4ePLl, h7j7zcum218.dIocxURUo(), 5);
                                                } else if (h7j7zcum25 != null) {
                                                    wLlBJNJ2W.J4Ux7ym32(h7j7zcum218.yWvV4ePLl, h7j7zcum23.yWvV4ePLl, h7j7zcum218.dIocxURUo(), 0.5f, h7j7zcum24.yWvV4ePLl, h7j7zcum25.yWvV4ePLl, h7j7zcum24.dIocxURUo(), 5);
                                                }
                                            }
                                            if (!(h7j7zcum25 == null || k007rzv1x == k007rzv1x2)) {
                                                wLlBJNJ2W.dIocxURUo(h7j7zcum24.yWvV4ePLl, h7j7zcum25.yWvV4ePLl, -h7j7zcum24.dIocxURUo(), 5);
                                            }
                                        }
                                        if (!((z3 && !z2) || k007rzv1x == null || k007rzv1x == k007rzv1x2)) {
                                            h7j7Zcum2[] h7j7zcum2Arr9 = k007rzv1x.j22ftfeNI;
                                            h7j7zcum2 = h7j7zcum2Arr9[i2];
                                            k007rzv1x3 = k007rzv1x2 == null ? k007rzv1x : k007rzv1x2;
                                            i8 = i2 + 1;
                                            h7j7zcum22 = k007rzv1x3.j22ftfeNI[i8];
                                            h7j7Zcum2 h7j7zcum219 = h7j7zcum2.iiGwOFFnr;
                                            miisfj8kp = h7j7zcum219 != null ? h7j7zcum219.yWvV4ePLl : null;
                                            h7j7Zcum2 h7j7zcum220 = h7j7zcum22.iiGwOFFnr;
                                            miIsFJ8kP miisfj8kp16 = h7j7zcum220 != null ? h7j7zcum220.yWvV4ePLl : null;
                                            if (k007rzv1x21 != k007rzv1x3) {
                                                h7j7Zcum2 h7j7zcum221 = k007rzv1x21.j22ftfeNI[i8].iiGwOFFnr;
                                                if (h7j7zcum221 != null) {
                                                    miisfj8kp8 = h7j7zcum221.yWvV4ePLl;
                                                }
                                                miisfj8kp2 = miisfj8kp8;
                                            } else {
                                                miisfj8kp2 = miisfj8kp16;
                                            }
                                            if (k007rzv1x == k007rzv1x3) {
                                                h7j7zcum2 = h7j7zcum2Arr9[i2];
                                                h7j7zcum22 = h7j7zcum2Arr9[i8];
                                            }
                                            if (!(miisfj8kp != null || miisfj8kp2 == null)) {
                                                wLlBJNJ2W.J4Ux7ym32(h7j7zcum2.yWvV4ePLl, miisfj8kp, h7j7zcum2.dIocxURUo(), 0.5f, miisfj8kp2, h7j7zcum22.yWvV4ePLl, k007rzv1x3.j22ftfeNI[i8].dIocxURUo(), 5);
                                            }
                                        }
                                    } else {
                                        int i42 = putqqk1FR.oon79WMrY;
                                        boolean z17 = i42 > 0 && putqqk1FR.yWvV4ePLl == i42;
                                        k007RzV1x k007rzv1x31 = k007rzv1x;
                                        k007RzV1x k007rzv1x32 = k007rzv1x31;
                                        while (k007rzv1x32 != null) {
                                            k007RzV1x k007rzv1x33 = k007rzv1x32.lqFHPHdW3[i];
                                            while (true) {
                                                if (k007rzv1x33 == null) {
                                                    i10 = 8;
                                                    break;
                                                }
                                                i10 = 8;
                                                if (k007rzv1x33.Dr7UqlxEV != 8) {
                                                    break;
                                                }
                                                k007rzv1x33 = k007rzv1x33.lqFHPHdW3[i];
                                            }
                                            if (k007rzv1x33 != null || k007rzv1x32 == k007rzv1x2) {
                                                h7j7Zcum2 h7j7zcum222 = k007rzv1x32.j22ftfeNI[i2];
                                                miIsFJ8kP miisfj8kp17 = h7j7zcum222.yWvV4ePLl;
                                                h7j7Zcum2 h7j7zcum223 = h7j7zcum222.iiGwOFFnr;
                                                miIsFJ8kP miisfj8kp18 = h7j7zcum223 != null ? h7j7zcum223.yWvV4ePLl : null;
                                                if (k007rzv1x31 != k007rzv1x32) {
                                                    h7j7zcum29 = k007rzv1x31.j22ftfeNI[i2 + 1];
                                                } else {
                                                    if (k007rzv1x32 == k007rzv1x) {
                                                        h7j7Zcum2[] h7j7zcum2Arr10 = k007rzv1x20.j22ftfeNI;
                                                        if (h7j7zcum2Arr10[i2].iiGwOFFnr != null) {
                                                            h7j7zcum29 = h7j7zcum2Arr10[i2].iiGwOFFnr;
                                                        } else {
                                                            miisfj8kp18 = null;
                                                        }
                                                    }
                                                    int dIocxURUo8 = h7j7zcum222.dIocxURUo();
                                                    int i43 = i2 + 1;
                                                    int dIocxURUo9 = k007rzv1x32.j22ftfeNI[i43].dIocxURUo();
                                                    if (k007rzv1x33 == null) {
                                                        h7j7zcum28 = k007rzv1x33.j22ftfeNI[i2];
                                                    } else {
                                                        h7j7zcum28 = k007rzv1x21.j22ftfeNI[i43].iiGwOFFnr;
                                                        if (h7j7zcum28 == null) {
                                                            k007rzv1x10 = k007rzv1x33;
                                                            miisfj8kp5 = null;
                                                            miIsFJ8kP miisfj8kp19 = k007rzv1x32.j22ftfeNI[i43].yWvV4ePLl;
                                                            if (h7j7zcum28 != null) {
                                                                dIocxURUo9 += h7j7zcum28.dIocxURUo();
                                                            }
                                                            int dIocxURUo10 = k007rzv1x31.j22ftfeNI[i43].dIocxURUo() + dIocxURUo8;
                                                            if (miisfj8kp17 != null || miisfj8kp18 == null || miisfj8kp5 == null || miisfj8kp19 == null) {
                                                                k007rzv1x8 = k007rzv1x31;
                                                                i11 = i9;
                                                                k007rzv1x9 = k007rzv1x10;
                                                                i12 = 8;
                                                            } else {
                                                                if (k007rzv1x32 == k007rzv1x) {
                                                                    dIocxURUo10 = k007rzv1x.j22ftfeNI[i2].dIocxURUo();
                                                                }
                                                                i11 = i9;
                                                                i12 = 8;
                                                                k007rzv1x9 = k007rzv1x10;
                                                                k007rzv1x8 = k007rzv1x31;
                                                                wLlBJNJ2W.J4Ux7ym32(miisfj8kp17, miisfj8kp18, dIocxURUo10, 0.5f, miisfj8kp5, miisfj8kp19, k007rzv1x32 == k007rzv1x2 ? k007rzv1x2.j22ftfeNI[i43].dIocxURUo() : dIocxURUo9, z17 ? 8 : 5);
                                                            }
                                                        }
                                                    }
                                                    miisfj8kp5 = h7j7zcum28.yWvV4ePLl;
                                                    k007rzv1x10 = k007rzv1x33;
                                                    miIsFJ8kP miisfj8kp192 = k007rzv1x32.j22ftfeNI[i43].yWvV4ePLl;
                                                    if (h7j7zcum28 != null) {
                                                    }
                                                    int dIocxURUo102 = k007rzv1x31.j22ftfeNI[i43].dIocxURUo() + dIocxURUo8;
                                                    if (miisfj8kp17 != null) {
                                                    }
                                                    k007rzv1x8 = k007rzv1x31;
                                                    i11 = i9;
                                                    k007rzv1x9 = k007rzv1x10;
                                                    i12 = 8;
                                                }
                                                miisfj8kp18 = h7j7zcum29.yWvV4ePLl;
                                                int dIocxURUo82 = h7j7zcum222.dIocxURUo();
                                                int i432 = i2 + 1;
                                                int dIocxURUo92 = k007rzv1x32.j22ftfeNI[i432].dIocxURUo();
                                                if (k007rzv1x33 == null) {
                                                }
                                                miisfj8kp5 = h7j7zcum28.yWvV4ePLl;
                                                k007rzv1x10 = k007rzv1x33;
                                                miIsFJ8kP miisfj8kp1922 = k007rzv1x32.j22ftfeNI[i432].yWvV4ePLl;
                                                if (h7j7zcum28 != null) {
                                                }
                                                int dIocxURUo1022 = k007rzv1x31.j22ftfeNI[i432].dIocxURUo() + dIocxURUo82;
                                                if (miisfj8kp17 != null) {
                                                }
                                                k007rzv1x8 = k007rzv1x31;
                                                i11 = i9;
                                                k007rzv1x9 = k007rzv1x10;
                                                i12 = 8;
                                            } else {
                                                k007rzv1x9 = k007rzv1x33;
                                                k007rzv1x8 = k007rzv1x31;
                                                i11 = i9;
                                                i12 = i10;
                                            }
                                            k007rzv1x31 = k007rzv1x32.Dr7UqlxEV != i12 ? k007rzv1x32 : k007rzv1x8;
                                            k007rzv1x32 = k007rzv1x9;
                                            i9 = i11;
                                        }
                                    }
                                } else {
                                    h7j7Zcum2 h7j7zcum224 = k007rzv1x20.j22ftfeNI[i2];
                                    int i44 = i2 + 1;
                                    h7j7Zcum2 h7j7zcum225 = k007rzv1x21.j22ftfeNI[i44];
                                    h7j7Zcum2 h7j7zcum226 = h7j7zcum224.iiGwOFFnr;
                                    miIsFJ8kP miisfj8kp20 = h7j7zcum226 != null ? h7j7zcum226.yWvV4ePLl : null;
                                    h7j7Zcum2 h7j7zcum227 = h7j7zcum225.iiGwOFFnr;
                                    miIsFJ8kP miisfj8kp21 = h7j7zcum227 != null ? h7j7zcum227.yWvV4ePLl : null;
                                    h7j7Zcum2 h7j7zcum228 = k007rzv1x22.j22ftfeNI[i2];
                                    if (k007rzv1x23 != null) {
                                        h7j7zcum225 = k007rzv1x23.j22ftfeNI[i44];
                                    }
                                    if (miisfj8kp20 == null || miisfj8kp21 == null) {
                                        k007rzv1x2 = k007rzv1x23;
                                        k007rzv1x = k007rzv1x22;
                                        i9 = i7;
                                        i6 = 2;
                                    } else {
                                        k007rzv1x2 = k007rzv1x23;
                                        k007rzv1x = k007rzv1x22;
                                        i9 = i7;
                                        i6 = 2;
                                        wLlBJNJ2W.J4Ux7ym32(h7j7zcum228.yWvV4ePLl, miisfj8kp20, h7j7zcum228.dIocxURUo(), i == 0 ? k007rzv1x24.INnK5Rew6 : k007rzv1x24.SuKhTJIQc, miisfj8kp21, h7j7zcum225.yWvV4ePLl, h7j7zcum225.dIocxURUo(), 7);
                                    }
                                }
                                i5 = i9;
                                if (z3) {
                                }
                                h7j7Zcum2[] h7j7zcum2Arr92 = k007rzv1x.j22ftfeNI;
                                h7j7zcum2 = h7j7zcum2Arr92[i2];
                                if (k007rzv1x2 == null) {
                                }
                                i8 = i2 + 1;
                                h7j7zcum22 = k007rzv1x3.j22ftfeNI[i8];
                                h7j7Zcum2 h7j7zcum2192 = h7j7zcum2.iiGwOFFnr;
                                if (h7j7zcum2192 != null) {
                                }
                                h7j7Zcum2 h7j7zcum2202 = h7j7zcum22.iiGwOFFnr;
                                if (h7j7zcum2202 != null) {
                                }
                                if (k007rzv1x21 != k007rzv1x3) {
                                }
                                if (k007rzv1x == k007rzv1x3) {
                                }
                                if (miisfj8kp != null) {
                                    wLlBJNJ2W.J4Ux7ym32(h7j7zcum2.yWvV4ePLl, miisfj8kp, h7j7zcum2.dIocxURUo(), 0.5f, miisfj8kp2, h7j7zcum22.yWvV4ePLl, k007rzv1x3.j22ftfeNI[i8].dIocxURUo(), 5);
                                }
                            }
                        }
                        if (z4) {
                            h7j7Zcum2 h7j7zcum229 = h7j7zcum215.iiGwOFFnr;
                            if (h7j7zcum229.dIocxURUo == s5aezmTgi2) {
                                wLlBJNJ2W.dIocxURUo(h7j7zcum215.yWvV4ePLl, h7j7zcum229.yWvV4ePLl, -h7j7zcum215.dIocxURUo(), 4);
                                wLlBJNJ2W.GPLPRo6go(h7j7zcum215.yWvV4ePLl, k007rzv1x21.j22ftfeNI[i33].iiGwOFFnr.yWvV4ePLl, -h7j7zcum215.dIocxURUo(), 6);
                                if (z10) {
                                }
                                arrayList2 = putqqk1FR.Puu3Rhg4F;
                                if (arrayList2 != null) {
                                    if (putqqk1FR.ilHKhw3Yw) {
                                    }
                                    k007RzV1x k007rzv1x262 = null;
                                    float f52 = 0.0f;
                                    i13 = 0;
                                    while (i13 < size) {
                                    }
                                }
                                rG2GI7LDp = rG2GI7LDp3;
                                if (k007rzv1x22 != null) {
                                }
                                k007rzv1x2 = k007rzv1x23;
                                k007rzv1x = k007rzv1x22;
                                i9 = i7;
                                i6 = 2;
                                if (z3) {
                                }
                                i5 = i9;
                                int i372 = 8;
                                if (z2) {
                                    int i382 = putqqk1FR.oon79WMrY;
                                    if (i382 <= 0) {
                                    }
                                    k007RzV1x k007rzv1x282 = k007rzv1x;
                                    while (k007rzv1x4 != null) {
                                    }
                                    h7j7Zcum2 h7j7zcum2182 = k007rzv1x.j22ftfeNI[i2];
                                    h7j7zcum23 = k007rzv1x20.j22ftfeNI[i2].iiGwOFFnr;
                                    int i412 = i2 + 1;
                                    h7j7zcum24 = k007rzv1x2.j22ftfeNI[i412];
                                    h7j7zcum25 = k007rzv1x21.j22ftfeNI[i412].iiGwOFFnr;
                                    if (h7j7zcum23 != null) {
                                    }
                                    if (h7j7zcum25 == null) {
                                        wLlBJNJ2W.dIocxURUo(h7j7zcum24.yWvV4ePLl, h7j7zcum25.yWvV4ePLl, -h7j7zcum24.dIocxURUo(), 5);
                                    }
                                }
                                if (z3) {
                                }
                                h7j7Zcum2[] h7j7zcum2Arr922 = k007rzv1x.j22ftfeNI;
                                h7j7zcum2 = h7j7zcum2Arr922[i2];
                                if (k007rzv1x2 == null) {
                                }
                                i8 = i2 + 1;
                                h7j7zcum22 = k007rzv1x3.j22ftfeNI[i8];
                                h7j7Zcum2 h7j7zcum21922 = h7j7zcum2.iiGwOFFnr;
                                if (h7j7zcum21922 != null) {
                                }
                                h7j7Zcum2 h7j7zcum22022 = h7j7zcum22.iiGwOFFnr;
                                if (h7j7zcum22022 != null) {
                                }
                                if (k007rzv1x21 != k007rzv1x3) {
                                }
                                if (k007rzv1x == k007rzv1x3) {
                                }
                                if (miisfj8kp != null) {
                                }
                            }
                        }
                        wLlBJNJ2W.GPLPRo6go(h7j7zcum215.yWvV4ePLl, k007rzv1x21.j22ftfeNI[i33].iiGwOFFnr.yWvV4ePLl, -h7j7zcum215.dIocxURUo(), 6);
                        if (z10) {
                        }
                        arrayList2 = putqqk1FR.Puu3Rhg4F;
                        if (arrayList2 != null) {
                        }
                        rG2GI7LDp = rG2GI7LDp3;
                        if (k007rzv1x22 != null) {
                        }
                        k007rzv1x2 = k007rzv1x23;
                        k007rzv1x = k007rzv1x22;
                        i9 = i7;
                        i6 = 2;
                        if (z3) {
                        }
                        i5 = i9;
                        int i3722 = 8;
                        if (z2) {
                        }
                        if (z3) {
                        }
                        h7j7Zcum2[] h7j7zcum2Arr9222 = k007rzv1x.j22ftfeNI;
                        h7j7zcum2 = h7j7zcum2Arr9222[i2];
                        if (k007rzv1x2 == null) {
                        }
                        i8 = i2 + 1;
                        h7j7zcum22 = k007rzv1x3.j22ftfeNI[i8];
                        h7j7Zcum2 h7j7zcum219222 = h7j7zcum2.iiGwOFFnr;
                        if (h7j7zcum219222 != null) {
                        }
                        h7j7Zcum2 h7j7zcum220222 = h7j7zcum22.iiGwOFFnr;
                        if (h7j7zcum220222 != null) {
                        }
                        if (k007rzv1x21 != k007rzv1x3) {
                        }
                        if (k007rzv1x == k007rzv1x3) {
                        }
                        if (miisfj8kp != null) {
                        }
                    }
                }
                if (z10) {
                }
                arrayList2 = putqqk1FR.Puu3Rhg4F;
                if (arrayList2 != null) {
                }
                rG2GI7LDp = rG2GI7LDp3;
                if (k007rzv1x22 != null) {
                }
                k007rzv1x2 = k007rzv1x23;
                k007rzv1x = k007rzv1x22;
                i9 = i7;
                i6 = 2;
                if (z3) {
                }
                i5 = i9;
                int i37222 = 8;
                if (z2) {
                }
                if (z3) {
                }
                h7j7Zcum2[] h7j7zcum2Arr92222 = k007rzv1x.j22ftfeNI;
                h7j7zcum2 = h7j7zcum2Arr92222[i2];
                if (k007rzv1x2 == null) {
                }
                i8 = i2 + 1;
                h7j7zcum22 = k007rzv1x3.j22ftfeNI[i8];
                h7j7Zcum2 h7j7zcum2192222 = h7j7zcum2.iiGwOFFnr;
                if (h7j7zcum2192222 != null) {
                }
                h7j7Zcum2 h7j7zcum2202222 = h7j7zcum22.iiGwOFFnr;
                if (h7j7zcum2202222 != null) {
                }
                if (k007rzv1x21 != k007rzv1x3) {
                }
                if (k007rzv1x == k007rzv1x3) {
                }
                if (miisfj8kp != null) {
                }
            } else {
                i5 = i21;
                rG2GI7LDp = rG2GI7LDp3;
                i4 = i3;
                i6 = 2;
            }
            i21 = i5 + 1;
            s5aezmTgi2 = s5aezmTgi;
            arrayList4 = arrayList;
            rG2GI7LDp3 = rG2GI7LDp;
            i20 = i6;
            i3 = i4;
        }
    }

    public static final long IytU16YUK(long j, long j2) {
        int GPLPRo6go = czCYotiRn.GPLPRo6go(j);
        int iiGwOFFnr = czCYotiRn.iiGwOFFnr(j);
        boolean z = true;
        if (czCYotiRn.GPLPRo6go(j2) < czCYotiRn.iiGwOFFnr(j) && czCYotiRn.GPLPRo6go(j) < czCYotiRn.iiGwOFFnr(j2)) {
            if (czCYotiRn.q3BipwRCk(j2, j)) {
                GPLPRo6go = czCYotiRn.GPLPRo6go(j2);
                iiGwOFFnr = GPLPRo6go;
            } else {
                if (!czCYotiRn.q3BipwRCk(j, j2)) {
                    int GPLPRo6go2 = czCYotiRn.GPLPRo6go(j2);
                    if (GPLPRo6go >= czCYotiRn.iiGwOFFnr(j2) || GPLPRo6go2 > GPLPRo6go) {
                        z = false;
                    }
                    if (z) {
                        GPLPRo6go = czCYotiRn.GPLPRo6go(j2);
                    } else {
                        iiGwOFFnr = czCYotiRn.GPLPRo6go(j2);
                    }
                }
                iiGwOFFnr -= czCYotiRn.kCA6Zs9sL(j2);
            }
        } else if (iiGwOFFnr > czCYotiRn.GPLPRo6go(j2)) {
            GPLPRo6go -= czCYotiRn.kCA6Zs9sL(j2);
            iiGwOFFnr -= czCYotiRn.kCA6Zs9sL(j2);
        }
        return ODug2UCW1.iiGwOFFnr(GPLPRo6go, iiGwOFFnr);
    }

    public static /* synthetic */ long J4Ux7ym32(int i, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return q3BipwRCk(i, i2, i3, i4);
    }

    public static final XUDDOHuAx MzoOEjc4X(bu5cjmae6 bu5cjmae6) {
        int i = V2LokvvBN.dIocxURUo;
        zG81huwZq zg81huwzq = bu5cjmae6.get(wrCZc9nGY.CBQ5d1kRq);
        XUDDOHuAx xUDDOHuAx = zg81huwzq instanceof XUDDOHuAx ? (XUDDOHuAx) zg81huwzq : null;
        return xUDDOHuAx == null ? JfPi3Rw8a.q3BipwRCk : xUDDOHuAx;
    }

    public static Typeface PSTqBLTET(WQpIMzWun wQpIMzWun, Integer num, Integer num2, int i) {
        int i2 = i & 2;
        Typeface typeface = null;
        if (i2 != 0) {
            num2 = null;
        }
        if (num2 == null) {
            throw new IllegalArgumentException("font: You must specify a resource ID or literal value");
        } else if (num2 != null) {
            TypedArray obtainStyledAttributes = wQpIMzWun.WaUP0CF08.getTheme().obtainStyledAttributes(new int[]{num2.intValue()});
            try {
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    typeface = K95C08eIr.q3BipwRCk(wQpIMzWun.WaUP0CF08, resourceId);
                }
                return typeface;
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public static final int Puu3Rhg4F(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final joIJ4ANvK RG6kpfv3v(eTxfvEx3L etxfvex3l) {
        joIJ4ANvK joij4anvk = etxfvex3l.q3BipwRCk;
        long j = etxfvex3l.J4Ux7ym32;
        Objects.requireNonNull(joij4anvk);
        return joij4anvk.subSequence(czCYotiRn.GPLPRo6go(j), czCYotiRn.iiGwOFFnr(j));
    }

    public static final boolean WaUP0CF08(dBWPON5YR dbwpon5yr) {
        return (dbwpon5yr.iiGwOFFnr == null && dbwpon5yr.dIocxURUo == null && dbwpon5yr.tGV7Q6urW == null) ? false : true;
    }

    public static void cAwN510t2(View view, dOSsQaJVg dossqajvg) {
        Zgs44gQcc zgs44gQcc = dossqajvg.CBQ5d1kRq.J4Ux7ym32;
        if (zgs44gQcc != null && zgs44gQcc.q3BipwRCk) {
            float f = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                f += mJLaJepZo.yWvV4ePLl((View) parent);
            }
            rbhQaQiIi rbhqaqiii = dossqajvg.CBQ5d1kRq;
            if (rbhqaqiii.Bhmn1KIah != f) {
                rbhqaqiii.Bhmn1KIah = f;
                dossqajvg.sk5s77z6Q();
            }
        }
    }

    public static final void dIocxURUo(Throwable th, Throwable th2) {
        if (th != th2) {
            pjo68E62a.q3BipwRCk.q3BipwRCk(th, th2);
        }
    }

    public static String dXrmkklc8(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final long dfpT1j18n(long j, int i, int i2) {
        int vPSbyrYWX = K5PjwoFCN.vPSbyrYWX(j) + i;
        int i3 = 0;
        if (vPSbyrYWX < 0) {
            vPSbyrYWX = 0;
        }
        int yWvV4ePLl = K5PjwoFCN.yWvV4ePLl(j);
        if (yWvV4ePLl != Integer.MAX_VALUE && (yWvV4ePLl = yWvV4ePLl + i) < 0) {
            yWvV4ePLl = 0;
        }
        int oon79WMrY = K5PjwoFCN.oon79WMrY(j) + i2;
        if (oon79WMrY < 0) {
            oon79WMrY = 0;
        }
        i3 = K5PjwoFCN.Puu3Rhg4F(j);
        if (i3 == Integer.MAX_VALUE || (i3 = i3 + i2) >= 0) {
        }
        return q3BipwRCk(vPSbyrYWX, yWvV4ePLl, oon79WMrY, i3);
    }

    public static ObjectAnimator i8XZMQc6Z(Object obj, Property property, Path path) {
        return ObjectAnimator.ofObject(obj, property, (TypeConverter) null, path);
    }

    public static final void iMyQMM6Qj(View view, PmanMZxiM pmanMZxiM) {
        view.addOnAttachStateChangeListener(new Sme6YJlaf(view, pmanMZxiM));
    }

    public static final q9dGs9SI6 ilHKhw3Yw(BgHiMFrEI bgHiMFrEI) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        N0a4Shkkl n0a4Shkkl = ((ComponentActivity) bgHiMFrEI).PSTqBLTET;
        while (true) {
            lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) n0a4Shkkl.q3BipwRCk.get();
            if (lifecycleCoroutineScopeImpl == null) {
                s4WYBMesc s4wybmesc = new s4WYBMesc(null);
                xaeEKvU2c xaeekvu2c = tQmFGxsat.q3BipwRCk;
                VWNUggT0w vWNUggT0w = (VWNUggT0w) ZezE4t3SB.q3BipwRCk;
                lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(n0a4Shkkl, idpM54xlp.dfpT1j18n(s4wybmesc, vWNUggT0w.MzoOEjc4X));
                if (n0a4Shkkl.q3BipwRCk.compareAndSet(null, lifecycleCoroutineScopeImpl)) {
                    idpM54xlp.RG6kpfv3v(lifecycleCoroutineScopeImpl, vWNUggT0w.MzoOEjc4X, 0, new i9gAjCQHS(lifecycleCoroutineScopeImpl, null), 2, null);
                    break;
                }
            } else {
                break;
            }
        }
        return lifecycleCoroutineScopeImpl;
    }

    public static final joIJ4ANvK ixWaw2akD(eTxfvEx3L etxfvex3l, int i) {
        return etxfvex3l.q3BipwRCk.subSequence(czCYotiRn.iiGwOFFnr(etxfvex3l.J4Ux7ym32), Math.min(czCYotiRn.iiGwOFFnr(etxfvex3l.J4Ux7ym32) + i, etxfvex3l.q3BipwRCk.CBQ5d1kRq.length()));
    }

    public static final Animator kCA6Zs9sL(int i, int i2, long j, PmanMZxiM pmanMZxiM, gdEmqfwpT gdemqfwpt) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new cnCOeRyMp(j, pmanMZxiM, gdemqfwpt));
        ofInt.addListener(new Vq90F9M5C(j, pmanMZxiM, gdemqfwpt));
        return ofInt;
    }

    public static oWhsE8IPp kmSgne1rO() {
        return new oWhsE8IPp(0);
    }

    public static final int oon79WMrY(long j, int i) {
        return cT9gik1zL.kCA6Zs9sL(i, K5PjwoFCN.oon79WMrY(j), K5PjwoFCN.Puu3Rhg4F(j));
    }

    public static final long q3BipwRCk(int i, int i2, int i3, int i4) {
        boolean z = true;
        if (i2 >= i) {
            if (i4 >= i3) {
                if (i < 0 || i3 < 0) {
                    z = false;
                }
                if (z) {
                    return K5PjwoFCN.J4Ux7ym32.tGV7Q6urW(i, i2, i3, i4);
                }
                throw new IllegalArgumentException(("minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0").toString());
            }
            throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')').toString());
        }
        throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')').toString());
    }

    public static Intent qVUwofr5s(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String dXrmkklc8 = dXrmkklc8(activity, activity.getComponentName());
            if (dXrmkklc8 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, dXrmkklc8);
            try {
                return dXrmkklc8(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + dXrmkklc8 + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static final joIJ4ANvK sk5s77z6Q(eTxfvEx3L etxfvex3l, int i) {
        return etxfvex3l.q3BipwRCk.subSequence(Math.max(0, czCYotiRn.GPLPRo6go(etxfvex3l.J4Ux7ym32) - i), czCYotiRn.GPLPRo6go(etxfvex3l.J4Ux7ym32));
    }

    public static final long tGV7Q6urW(int i, int i2) {
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        joOFKdxvJ joofkdxvj = ZtJSMDYDl.J4Ux7ym32;
        return j;
    }

    public static final int vPSbyrYWX(long j, int i) {
        return cT9gik1zL.kCA6Zs9sL(i, K5PjwoFCN.vPSbyrYWX(j), K5PjwoFCN.yWvV4ePLl(j));
    }

    public static final long yWvV4ePLl(long j, long j2) {
        return D3DEikrvb.dIocxURUo(cT9gik1zL.kCA6Zs9sL(YWiUMZOtw.tGV7Q6urW(j2), K5PjwoFCN.vPSbyrYWX(j), K5PjwoFCN.yWvV4ePLl(j)), cT9gik1zL.kCA6Zs9sL(YWiUMZOtw.J4Ux7ym32(j2), K5PjwoFCN.oon79WMrY(j), K5PjwoFCN.Puu3Rhg4F(j)));
    }
}
