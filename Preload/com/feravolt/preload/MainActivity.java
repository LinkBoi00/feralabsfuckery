package com.feravolt.preload;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import androidx.activity.ComponentActivity;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.feravolt.preload.services.PreloadService;
import con.A71OEYWpv;
import con.AU29aHa4X;
import con.AllhocNWS;
import con.BBVaGLNaU;
import con.BEG6ENxHu;
import con.BFRsKhrQv;
import con.BPBXLXpsE;
import con.BaMMm5shD;
import con.BgIsSUB3d;
import con.CTn8ClAXF;
import con.CxqHP5W0n;
import con.CyYrQ4qwz;
import con.D7JlMB0DC;
import con.DlhjQ2PrY;
import con.E4m3TqUyM;
import con.EVoQ2RqaN;
import con.EWfLYpJMy;
import con.ErB1wWwOl;
import con.FlUNLBZ9n;
import con.FqhrNqZrt;
import con.G1HNBOPfv;
import con.G7WvUK4mQ;
import con.GLlRXMAbf;
import con.GX14exZ1F;
import con.GjhoS54Hf;
import con.Gm3ZWPl0I;
import con.H11ySchUh;
import con.HSwcezbks;
import con.HZDtN0XJv;
import con.HbUTGjFCZ;
import con.HyywYLgnK;
import con.J9LUUfNUi;
import con.JI2JIz7iN;
import con.JhpbRXxsg;
import con.JqVWgnx1C;
import con.JyuTiwi92;
import con.JzLhkMe5F;
import con.KApR71V3i;
import con.KPGMfmvlR;
import con.KSdwgSYB6;
import con.KYuHUB7GA;
import con.LA6o9xrM4;
import con.LzT8CF9ie;
import con.M5g57XBLr;
import con.MjwlnlH2D;
import con.NvSSsPAuJ;
import con.NzvP5Rex8;
import con.O0hQm6WVz;
import con.ODug2UCW1;
import con.OZOygOALp;
import con.P7Re99G8L;
import con.PV8WgmiL7;
import con.PVDPmuuqs;
import con.Pf8Spcrui;
import con.PfRpI7wcU;
import con.PmYqqGuHi;
import con.PmanMZxiM;
import con.PvO1Gwhy6;
import con.PxtnQGBQi;
import con.R1Jgfbkkf;
import con.RNEcgN6dQ;
import con.RUkE4Bs9R;
import con.Rjnc3TWC6;
import con.RxEtsNHUB;
import con.SLFBujE8J;
import con.SjSqjFCuO;
import con.SmsTS63dj;
import con.T0XFCDCob;
import con.TnnOXJDZc;
import con.TqRcaVEga;
import con.UBY2Inzw8;
import con.UuYoJZ40y;
import con.V8gQUs5xA;
import con.VGh7XGpXv;
import con.VqT05HRsg;
import con.Vyo35YgKP;
import con.WPKZSgOZD;
import con.WQpIMzWun;
import con.Way959ade;
import con.Wk9bO57s4;
import con.Wo3zCKWLb;
import con.XDcLh2vc4;
import con.XaTXMCyTz;
import con.Y3ibtOJiE;
import con.YuSxiExwK;
import con.Z6wpHNDNp;
import con.Z7oCchjRS;
import con.ZaxjSdKpQ;
import con.ZezE4t3SB;
import con.ZtJSMDYDl;
import con.a6VKBsrxC;
import con.a8XGvLktb;
import con.a9QAfq4Fp;
import con.anXlDk6fV;
import con.asc9xrIdl;
import con.atgZEnsDc;
import con.attbzuWdD;
import con.bO2dbmrf7;
import con.bSc306J1d;
import con.cqKak5Wfn;
import con.d3W76zKHG;
import con.dBWPON5YR;
import con.dMGlVaFwN;
import con.dXtqngZHf;
import con.dnBSj5uJN;
import con.dnd1L2J2K;
import con.dpz3OQGkY;
import con.e89nQBxfx;
import con.eTXQs9h9T;
import con.f7B6YCXHx;
import con.fCkNY70T9;
import con.fhHgxp0FC;
import con.fvo1VzahC;
import con.gCZ85GFk1;
import con.gLDxq5bwv;
import con.gThLCaTO1;
import con.gdEmqfwpT;
import con.ghqvDXzkf;
import con.gq2zZKdsH;
import con.grAfiZycg;
import con.gsUpNChDr;
import con.hOY2Rgtej;
import con.hS6b8VSvI;
import con.hrmqyyOPt;
import con.icndHY7dz;
import con.idpM54xlp;
import con.jHNqfwCVd;
import con.jWXG2lIB3;
import con.joIJ4ANvK;
import con.jwVWEyVe4;
import con.jynIhewPb;
import con.k4mj87xxa;
import con.kBKJSqCSL;
import con.kkcQgCx5G;
import con.kuvj6DyFF;
import con.lDSGv8N6A;
import con.lMtae7YYQ;
import con.lOtvezK70;
import con.lTg88Bp1o;
import con.lXExmygLE;
import con.llWJsfBCK;
import con.lrQHoEwn7;
import con.m0AevvDOv;
import con.n4f84B5OG;
import con.nBnrGO77H;
import con.nC4pwCCkv;
import con.nPZZG1232;
import con.nVhenZUxZ;
import con.oQkvjGXIr;
import con.oWhsE8IPp;
import con.ovzTyaH09;
import con.p62TZmTyO;
import con.pA5wCkne4;
import con.pR9C5RpTS;
import con.prCJwNx2x;
import con.pz7YPhQTU;
import con.q4OLPt0Jo;
import con.qFsffqw4z;
import con.qih4lW99W;
import con.r6NbD4wnj;
import con.r9U1gbsBL;
import con.rESgwfV20;
import con.rJ0s9PfCL;
import con.rKKfiOTQO;
import con.rf159feB2;
import con.s9KPlorLI;
import con.sfGSnVX2z;
import con.syekKyXqd;
import con.tDbWPSedY;
import con.tQmFGxsat;
import con.tcFbS2CQx;
import con.tzR8IMGfw;
import con.u51fgFYkV;
import con.u6pX9iZ52;
import con.uFLsTIS9C;
import con.uI1r9gOOH;
import con.vOkrObwRv;
import con.vZSd4byf0;
import con.wYVUeP1PD;
import con.wkHKTCu1d;
import con.wnw63thGA;
import con.wpXpbWG1J;
import con.xP6F5SR9v;
import con.xSTZH8Y9P;
import con.xUKgrGMGQ;
import con.xUiBDp6G4;
import con.xaeEKvU2c;
import con.xheEapSkC;
import con.xpuSUT7Gh;
import con.y2KA9qgKw;
import con.y4A3w2Ci6;
import con.yGEA2YLT7;
import con.yOg3ACGm2;
import con.yTRKqbn7P;
import con.ytuQRHHQE;
import con.zAup6mKHj;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class MainActivity extends ComponentActivity {
    public static final /* synthetic */ int mUqPm6GBh;
    public final RNEcgN6dQ AqaWJg0b4;
    public final RNEcgN6dQ CpG0imbht;
    public final RNEcgN6dQ IytU16YUK;
    public final RNEcgN6dQ WaUP0CF08;
    public final RNEcgN6dQ cAwN510t2;
    public boolean dXrmkklc8;
    public final RNEcgN6dQ iMyQMM6Qj;
    public final RNEcgN6dQ nlGCs0NZs;
    public final RNEcgN6dQ qFBXIgpia;
    public final llWJsfBCK RG6kpfv3v = anXlDk6fV.ixWaw2akD(new dNif5KqqH());
    public final hOY2Rgtej ixWaw2akD = u51fgFYkV.J4Ux7ym32(null, PMYI4lLJM.kmSgne1rO, 1);
    public final hOY2Rgtej sk5s77z6Q = u51fgFYkV.J4Ux7ym32(null, WfopS3efW.kmSgne1rO, 1);
    public final RNEcgN6dQ i8XZMQc6Z = u51fgFYkV.dIocxURUo("", null, 2, null);
    public final List dfpT1j18n = idpM54xlp.WaUP0CF08("");

    /* loaded from: classes.dex */
    public static final class PMYI4lLJM extends Wk9bO57s4 implements gdEmqfwpT {
        public static final PMYI4lLJM kmSgne1rO = new PMYI4lLJM();

        public PMYI4lLJM() {
            super(0);
        }

        @Override // con.gdEmqfwpT
        public /* bridge */ /* synthetic */ Object GPLPRo6go() {
            return Boolean.FALSE;
        }
    }

    @jHNqfwCVd(c = "com.feravolt.preload.MainActivity$setupActivity$2", f = "MainActivity.kt", l = {203, 204, 205}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class Q6hF6Z6Ad extends dnd1L2J2K implements kkcQgCx5G {
        public int MzoOEjc4X;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Q6hF6Z6Ad(Way959ade way959ade) {
            super(2, way959ade);
            MainActivity.this = r1;
        }

        @Override // con.kkcQgCx5G
        public Object WaUP0CF08(Object obj, Object obj2) {
            oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
            return new Q6hF6Z6Ad((Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
        }

        @Override // con.LxklW3zxE
        public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
            return new Q6hF6Z6Ad(way959ade);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
        @Override // con.LxklW3zxE
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final Object yWvV4ePLl(Object obj) {
            Object qFBXIgpia;
            Object obj2 = kBKJSqCSL.COROUTINE_SUSPENDED;
            int i = this.MzoOEjc4X;
            if (i == 0) {
                anXlDk6fV.IytU16YUK(obj);
                MainActivity mainActivity = MainActivity.this;
                this.MzoOEjc4X = 1;
                int i2 = MainActivity.mUqPm6GBh;
                Objects.requireNonNull(mainActivity);
                Object qFBXIgpia2 = idpM54xlp.qFBXIgpia(tQmFGxsat.tGV7Q6urW, new dXtqngZHf(mainActivity, null), this);
                if (qFBXIgpia2 != obj2) {
                    qFBXIgpia2 = qih4lW99W.q3BipwRCk;
                }
                if (qFBXIgpia2 == obj2) {
                    return obj2;
                }
            } else if (i == 1) {
                anXlDk6fV.IytU16YUK(obj);
            } else if (i == 2) {
                anXlDk6fV.IytU16YUK(obj);
                MainActivity mainActivity2 = MainActivity.this;
                this.MzoOEjc4X = 3;
                int i3 = MainActivity.mUqPm6GBh;
                Objects.requireNonNull(mainActivity2);
                qFBXIgpia = idpM54xlp.qFBXIgpia(tQmFGxsat.tGV7Q6urW, new PvO1Gwhy6(mainActivity2, null), this);
                if (qFBXIgpia != obj2) {
                    qFBXIgpia = qih4lW99W.q3BipwRCk;
                }
                if (qFBXIgpia == obj2) {
                    return obj2;
                }
                if (Build.VERSION.SDK_INT >= 30) {
                    MainActivity.this.startActivity(new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION"));
                }
                if (MainActivity.this.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                }
                return qih4lW99W.q3BipwRCk;
            } else if (i == 3) {
                anXlDk6fV.IytU16YUK(obj);
                if (Build.VERSION.SDK_INT >= 30 && !Environment.isExternalStorageManager()) {
                    MainActivity.this.startActivity(new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION"));
                }
                if (MainActivity.this.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    MainActivity.this.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 10201);
                }
                return qih4lW99W.q3BipwRCk;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MainActivity mainActivity3 = MainActivity.this;
            this.MzoOEjc4X = 2;
            int i4 = MainActivity.mUqPm6GBh;
            Objects.requireNonNull(mainActivity3);
            Object qFBXIgpia3 = idpM54xlp.qFBXIgpia(tQmFGxsat.q3BipwRCk, new asc9xrIdl(mainActivity3, null), this);
            if (qFBXIgpia3 != obj2) {
                qFBXIgpia3 = qih4lW99W.q3BipwRCk;
            }
            if (qFBXIgpia3 == obj2) {
                return obj2;
            }
            MainActivity mainActivity22 = MainActivity.this;
            this.MzoOEjc4X = 3;
            int i32 = MainActivity.mUqPm6GBh;
            Objects.requireNonNull(mainActivity22);
            qFBXIgpia = idpM54xlp.qFBXIgpia(tQmFGxsat.tGV7Q6urW, new PvO1Gwhy6(mainActivity22, null), this);
            if (qFBXIgpia != obj2) {
            }
            if (qFBXIgpia == obj2) {
            }
            if (Build.VERSION.SDK_INT >= 30) {
            }
            if (MainActivity.this.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            }
            return qih4lW99W.q3BipwRCk;
        }
    }

    /* loaded from: classes.dex */
    public static final class RG2GI7LDp extends Wk9bO57s4 implements kkcQgCx5G {
        public final /* synthetic */ float Bhmn1KIah;
        public final /* synthetic */ int MzoOEjc4X;
        public final /* synthetic */ BgIsSUB3d PSTqBLTET;
        public final /* synthetic */ int ilHKhw3Yw;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RG2GI7LDp(float f, BgIsSUB3d bgIsSUB3d, int i, int i2) {
            super(2);
            MainActivity.this = r1;
            this.Bhmn1KIah = f;
            this.PSTqBLTET = bgIsSUB3d;
            this.MzoOEjc4X = i;
            this.ilHKhw3Yw = i2;
        }

        @Override // con.kkcQgCx5G
        public Object WaUP0CF08(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            MainActivity.this.kmSgne1rO(this.Bhmn1KIah, this.PSTqBLTET, (rJ0s9PfCL) obj, this.MzoOEjc4X | 1, this.ilHKhw3Yw);
            return qih4lW99W.q3BipwRCk;
        }
    }

    @jHNqfwCVd(c = "com.feravolt.preload.MainActivity$onActivityResult$1", f = "MainActivity.kt", l = {1376, 1378, 1379, 1382, 1383}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class Rma6SHcSH extends dnd1L2J2K implements kkcQgCx5G {
        public int Eeka1udhb;
        public Object MzoOEjc4X;
        public final /* synthetic */ MainActivity RG6kpfv3v;
        public final /* synthetic */ List dXrmkklc8;
        public Object ilHKhw3Yw;
        public Object qVUwofr5s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Rma6SHcSH(List list, MainActivity mainActivity, Way959ade way959ade) {
            super(2, way959ade);
            this.dXrmkklc8 = list;
            this.RG6kpfv3v = mainActivity;
        }

        @Override // con.kkcQgCx5G
        public Object WaUP0CF08(Object obj, Object obj2) {
            oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
            return new Rma6SHcSH(this.dXrmkklc8, this.RG6kpfv3v, (Way959ade) obj2).yWvV4ePLl(qih4lW99W.q3BipwRCk);
        }

        @Override // con.LxklW3zxE
        public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
            return new Rma6SHcSH(this.dXrmkklc8, this.RG6kpfv3v, way959ade);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0140  */
        @Override // con.LxklW3zxE
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final Object yWvV4ePLl(Object obj) {
            kBKJSqCSL kbkjsqcsl;
            Rma6SHcSH rma6SHcSH;
            MainActivity mainActivity;
            Iterator it;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            kBKJSqCSL kbkjsqcsl2;
            Rma6SHcSH rma6SHcSH2;
            String str;
            Rma6SHcSH rma6SHcSH3;
            Iterator it2;
            MainActivity mainActivity2;
            kBKJSqCSL kbkjsqcsl3 = kBKJSqCSL.COROUTINE_SUSPENDED;
            int i6 = this.Eeka1udhb;
            int i7 = 1;
            int i8 = 2;
            int i9 = 3;
            int i10 = 4;
            int i11 = 5;
            if (i6 == 0) {
                anXlDk6fV.IytU16YUK(obj);
                List list = this.dXrmkklc8;
                mainActivity2 = this.RG6kpfv3v;
                it2 = list.iterator();
                rma6SHcSH3 = this;
                if (it2.hasNext()) {
                }
            } else if (i6 == 1) {
                str = (String) this.qVUwofr5s;
                it = (Iterator) this.ilHKhw3Yw;
                mainActivity = (MainActivity) this.MzoOEjc4X;
                anXlDk6fV.IytU16YUK(obj);
                i = 5;
                i2 = 4;
                i3 = 3;
                i4 = 2;
                i5 = 1;
                kbkjsqcsl2 = kbkjsqcsl3;
                rma6SHcSH2 = this;
                if (!((Boolean) obj).booleanValue()) {
                }
            } else if (i6 == 2) {
                str = (String) this.qVUwofr5s;
                it = (Iterator) this.ilHKhw3Yw;
                mainActivity = (MainActivity) this.MzoOEjc4X;
                anXlDk6fV.IytU16YUK(obj);
                i = 5;
                i2 = 4;
                i3 = 3;
                i4 = 2;
                i5 = 1;
                kbkjsqcsl2 = kbkjsqcsl3;
                rma6SHcSH2 = this;
                if (((Boolean) obj).booleanValue()) {
                }
                rma6SHcSH3 = rma6SHcSH2;
                kbkjsqcsl3 = kbkjsqcsl2;
                i7 = i5;
                i8 = i4;
                i9 = i3;
                i10 = i2;
                i11 = i;
                it2 = it;
                mainActivity2 = mainActivity;
                if (it2.hasNext()) {
                }
            } else if (i6 == 3) {
                Collection collection = (Collection) this.qVUwofr5s;
                it = (Iterator) this.ilHKhw3Yw;
                mainActivity = (MainActivity) this.MzoOEjc4X;
                anXlDk6fV.IytU16YUK(obj);
                i = 5;
                i2 = 4;
                i3 = 3;
                i4 = 2;
                i5 = 1;
                kbkjsqcsl2 = kbkjsqcsl3;
                rma6SHcSH2 = this;
                lXExmygLE.mUqPm6GBh(collection, (Iterable) obj);
                rma6SHcSH3 = rma6SHcSH2;
                kbkjsqcsl3 = kbkjsqcsl2;
                i7 = i5;
                i8 = i4;
                i9 = i3;
                i10 = i2;
                i11 = i;
                it2 = it;
                mainActivity2 = mainActivity;
                if (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    ((prCJwNx2x) mainActivity2.i8XZMQc6Z).CBQ5d1kRq(M5g57XBLr.q3BipwRCk(MainActivity.cAwN510t2(mainActivity2), str2, "\n"));
                    YuSxiExwK yuSxiExwK = tzR8IMGfw.q3BipwRCk;
                    rma6SHcSH3.MzoOEjc4X = mainActivity2;
                    rma6SHcSH3.ilHKhw3Yw = it2;
                    rma6SHcSH3.qVUwofr5s = str2;
                    rma6SHcSH3.Eeka1udhb = i7;
                    Object tGV7Q6urW = yuSxiExwK.tGV7Q6urW(str2, rma6SHcSH3);
                    if (tGV7Q6urW == kbkjsqcsl3) {
                        return kbkjsqcsl3;
                    }
                    rma6SHcSH2 = rma6SHcSH3;
                    obj = tGV7Q6urW;
                    mainActivity = mainActivity2;
                    it = it2;
                    i = i11;
                    i2 = i10;
                    i3 = i9;
                    i4 = i8;
                    i5 = i7;
                    str = str2;
                    kbkjsqcsl2 = kbkjsqcsl3;
                    if (!((Boolean) obj).booleanValue()) {
                        mainActivity.dfpT1j18n.add(tzR8IMGfw.q3BipwRCk.kmSgne1rO(str));
                        rma6SHcSH3 = rma6SHcSH2;
                        kbkjsqcsl3 = kbkjsqcsl2;
                        i7 = i5;
                        i8 = i4;
                        i9 = i3;
                        i10 = i2;
                        i11 = i;
                        it2 = it;
                        mainActivity2 = mainActivity;
                        if (it2.hasNext()) {
                            YuSxiExwK yuSxiExwK2 = tzR8IMGfw.q3BipwRCk;
                            MainActivity mainActivity3 = rma6SHcSH3.RG6kpfv3v;
                            List list2 = mainActivity3.dfpT1j18n;
                            rma6SHcSH3.MzoOEjc4X = null;
                            rma6SHcSH3.ilHKhw3Yw = null;
                            rma6SHcSH3.qVUwofr5s = null;
                            rma6SHcSH3.Eeka1udhb = i10;
                            Object qFBXIgpia = idpM54xlp.qFBXIgpia(tQmFGxsat.tGV7Q6urW, new TnnOXJDZc(list2, mainActivity3, null), rma6SHcSH3);
                            if (qFBXIgpia == kbkjsqcsl3) {
                                return kbkjsqcsl3;
                            }
                            rma6SHcSH = rma6SHcSH3;
                            obj = qFBXIgpia;
                            kbkjsqcsl = kbkjsqcsl3;
                            if (((Boolean) obj).booleanValue()) {
                            }
                            return qih4lW99W.q3BipwRCk;
                        }
                    } else {
                        YuSxiExwK yuSxiExwK3 = tzR8IMGfw.q3BipwRCk;
                        rma6SHcSH2.MzoOEjc4X = mainActivity;
                        rma6SHcSH2.ilHKhw3Yw = it;
                        rma6SHcSH2.qVUwofr5s = str;
                        rma6SHcSH2.Eeka1udhb = i4;
                        obj = yuSxiExwK3.dIocxURUo(str, rma6SHcSH2);
                        if (obj == kbkjsqcsl2) {
                            return kbkjsqcsl2;
                        }
                        if (((Boolean) obj).booleanValue()) {
                            List list3 = mainActivity.dfpT1j18n;
                            YuSxiExwK yuSxiExwK4 = tzR8IMGfw.q3BipwRCk;
                            String kmSgne1rO = yuSxiExwK4.kmSgne1rO(str);
                            rma6SHcSH2.MzoOEjc4X = mainActivity;
                            rma6SHcSH2.ilHKhw3Yw = it;
                            rma6SHcSH2.qVUwofr5s = list3;
                            rma6SHcSH2.Eeka1udhb = i3;
                            Object iiGwOFFnr = yuSxiExwK4.iiGwOFFnr(kmSgne1rO, rma6SHcSH2);
                            if (iiGwOFFnr == kbkjsqcsl2) {
                                return kbkjsqcsl2;
                            }
                            collection = list3;
                            obj = iiGwOFFnr;
                            lXExmygLE.mUqPm6GBh(collection, (Iterable) obj);
                        }
                        rma6SHcSH3 = rma6SHcSH2;
                        kbkjsqcsl3 = kbkjsqcsl2;
                        i7 = i5;
                        i8 = i4;
                        i9 = i3;
                        i10 = i2;
                        i11 = i;
                        it2 = it;
                        mainActivity2 = mainActivity;
                        if (it2.hasNext()) {
                        }
                    }
                }
            } else if (i6 == 4) {
                anXlDk6fV.IytU16YUK(obj);
                kbkjsqcsl = kbkjsqcsl3;
                rma6SHcSH = this;
                if (((Boolean) obj).booleanValue()) {
                    MainActivity mainActivity4 = rma6SHcSH.RG6kpfv3v;
                    List list4 = mainActivity4.dfpT1j18n;
                    rma6SHcSH.Eeka1udhb = i11;
                    if (MainActivity.qFBXIgpia(mainActivity4, list4, "", rma6SHcSH) == kbkjsqcsl) {
                        return kbkjsqcsl;
                    }
                }
                return qih4lW99W.q3BipwRCk;
            } else if (i6 == 5) {
                anXlDk6fV.IytU16YUK(obj);
                return qih4lW99W.q3BipwRCk;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class WfopS3efW extends Wk9bO57s4 implements gdEmqfwpT {
        public static final WfopS3efW kmSgne1rO = new WfopS3efW();

        public WfopS3efW() {
            super(0);
        }

        @Override // con.gdEmqfwpT
        public /* bridge */ /* synthetic */ Object GPLPRo6go() {
            return Boolean.FALSE;
        }
    }

    /* loaded from: classes.dex */
    public static final class aXI58Y1kr extends Wk9bO57s4 implements kkcQgCx5G {
        public final /* synthetic */ BgIsSUB3d Bhmn1KIah;
        public final /* synthetic */ int MzoOEjc4X;
        public final /* synthetic */ int PSTqBLTET;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public aXI58Y1kr(BgIsSUB3d bgIsSUB3d, int i, int i2) {
            super(2);
            MainActivity.this = r1;
            this.Bhmn1KIah = bgIsSUB3d;
            this.PSTqBLTET = i;
            this.MzoOEjc4X = i2;
        }

        @Override // con.kkcQgCx5G
        public Object WaUP0CF08(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            MainActivity.this.Bhmn1KIah(this.Bhmn1KIah, (rJ0s9PfCL) obj, this.PSTqBLTET | 1, this.MzoOEjc4X);
            return qih4lW99W.q3BipwRCk;
        }
    }

    /* loaded from: classes.dex */
    public static final class dNif5KqqH extends Wk9bO57s4 implements gdEmqfwpT {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public dNif5KqqH() {
            super(0);
            MainActivity.this = r1;
        }

        @Override // con.gdEmqfwpT
        public Object GPLPRo6go() {
            return Boolean.valueOf(tzR8IMGfw.q3BipwRCk.GPLPRo6go(MainActivity.this));
        }
    }

    /* loaded from: classes.dex */
    public static final class lamBDew8Z extends Wk9bO57s4 implements kkcQgCx5G {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public lamBDew8Z() {
            super(2);
            MainActivity.this = r1;
        }

        @Override // con.kkcQgCx5G
        public Object WaUP0CF08(Object obj, Object obj2) {
            rJ0s9PfCL rj0s9pfcl = (rJ0s9PfCL) obj;
            if (((((Number) obj2).intValue() & 11) ^ 2) == 0) {
                wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
                if (wpxpbwg1j.i8XZMQc6Z()) {
                    wpxpbwg1j.igRQEZxnW();
                    return qih4lW99W.q3BipwRCk;
                }
            }
            gCZ85GFk1.q3BipwRCk(false, xpuSUT7Gh.qFBXIgpia(rj0s9pfcl, -819890037, true, new UuYoJZ40y(MainActivity.this, 4)), rj0s9pfcl, 48, 1);
            return qih4lW99W.q3BipwRCk;
        }
    }

    /* loaded from: classes.dex */
    public static final class mhl5lIdbQ extends Wk9bO57s4 implements gdEmqfwpT {
        public final /* synthetic */ tcFbS2CQx Bhmn1KIah;
        public final /* synthetic */ oQkvjGXIr PSTqBLTET;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public mhl5lIdbQ(tcFbS2CQx tcfbs2cqx, oQkvjGXIr oqkvjgxir) {
            super(0);
            MainActivity.this = r1;
            this.Bhmn1KIah = tcfbs2cqx;
            this.PSTqBLTET = oqkvjgxir;
        }

        @Override // con.gdEmqfwpT
        public Object GPLPRo6go() {
            MainActivity mainActivity = MainActivity.this;
            int i = MainActivity.mUqPm6GBh;
            if (mainActivity.EBQXiIPmm()) {
                tcFbS2CQx tcfbs2cqx = this.Bhmn1KIah;
                oWhsE8IPp owhse8ipp = q4OLPt0Jo.q3BipwRCk;
                JyuTiwi92 jyuTiwi92 = JyuTiwi92.q3BipwRCk;
                ((D7JlMB0DC) tcfbs2cqx).q3BipwRCk(0);
                oQkvjGXIr oqkvjgxir = this.PSTqBLTET;
                xaeEKvU2c xaeekvu2c = tQmFGxsat.q3BipwRCk;
                idpM54xlp.RG6kpfv3v(oqkvjgxir, ZezE4t3SB.q3BipwRCk, 0, new XaTXMCyTz(MainActivity.this, null), 2, null);
            }
            return qih4lW99W.q3BipwRCk;
        }
    }

    /* loaded from: classes.dex */
    public static final class qhPEQQaQ4 extends Wk9bO57s4 implements NzvP5Rex8 {
        public final /* synthetic */ tcFbS2CQx Bhmn1KIah;
        public final /* synthetic */ oQkvjGXIr PSTqBLTET;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public qhPEQQaQ4(tcFbS2CQx tcfbs2cqx, oQkvjGXIr oqkvjgxir) {
            super(3);
            MainActivity.this = r1;
            this.Bhmn1KIah = tcfbs2cqx;
            this.PSTqBLTET = oqkvjgxir;
        }

        @Override // con.NzvP5Rex8
        public Object sk5s77z6Q(Object obj, Object obj2, Object obj3) {
            gq2zZKdsH gq2zzkdsh = (gq2zZKdsH) obj;
            rJ0s9PfCL rj0s9pfcl = (rJ0s9PfCL) obj2;
            ((Number) obj3).intValue();
            MainActivity mainActivity = MainActivity.this;
            int i = MainActivity.mUqPm6GBh;
            boolean z = !mainActivity.igRQEZxnW();
            atgZEnsDc atgzensdc = new atgZEnsDc(MainActivity.this, this.Bhmn1KIah, this.PSTqBLTET);
            JqVWgnx1C jqVWgnx1C = JqVWgnx1C.q3BipwRCk;
            Wo3zCKWLb.J4Ux7ym32(atgzensdc, null, z, null, null, null, null, null, JqVWgnx1C.tGV7Q6urW, rj0s9pfcl, 805306368, 506);
            return qih4lW99W.q3BipwRCk;
        }
    }

    /* loaded from: classes.dex */
    public static final class s7MlVynBG extends Wk9bO57s4 implements kkcQgCx5G {
        public final /* synthetic */ BgIsSUB3d Bhmn1KIah;
        public final /* synthetic */ int MzoOEjc4X;
        public final /* synthetic */ int PSTqBLTET;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s7MlVynBG(BgIsSUB3d bgIsSUB3d, int i, int i2) {
            super(2);
            MainActivity.this = r1;
            this.Bhmn1KIah = bgIsSUB3d;
            this.PSTqBLTET = i;
            this.MzoOEjc4X = i2;
        }

        @Override // con.kkcQgCx5G
        public Object WaUP0CF08(Object obj, Object obj2) {
            ((Number) obj2).intValue();
            MainActivity.this.PSTqBLTET(this.Bhmn1KIah, (rJ0s9PfCL) obj, this.PSTqBLTET | 1, this.MzoOEjc4X);
            return qih4lW99W.q3BipwRCk;
        }
    }

    public MainActivity() {
        ExecutorService executorService = xheEapSkC.Eeka1udhb;
        PVDPmuuqs.J4Ux7ym32();
        Boolean bool = Boolean.FALSE;
        this.WaUP0CF08 = u51fgFYkV.dIocxURUo(bool, null, 2, null);
        bSc306J1d bsc306j1d = bSc306J1d.CBQ5d1kRq;
        this.iMyQMM6Qj = u51fgFYkV.dIocxURUo(bsc306j1d, null, 2, null);
        this.cAwN510t2 = u51fgFYkV.dIocxURUo(bsc306j1d, null, 2, null);
        this.IytU16YUK = u51fgFYkV.dIocxURUo(bool, null, 2, null);
        Boolean bool2 = Boolean.TRUE;
        this.CpG0imbht = u51fgFYkV.dIocxURUo(bool2, null, 2, null);
        this.qFBXIgpia = u51fgFYkV.dIocxURUo(bool2, null, 2, null);
        this.nlGCs0NZs = u51fgFYkV.dIocxURUo(bool, null, 2, null);
        this.AqaWJg0b4 = u51fgFYkV.dIocxURUo(bool, null, 2, null);
    }

    public static final void AqaWJg0b4(MainActivity mainActivity, boolean z) {
        ((prCJwNx2x) mainActivity.CpG0imbht).CBQ5d1kRq(Boolean.valueOf(z));
    }

    public static final boolean CpG0imbht(MainActivity mainActivity) {
        return ((Boolean) ((prCJwNx2x) mainActivity.WaUP0CF08).getValue()).booleanValue();
    }

    public static final void Eeka1udhb(MainActivity mainActivity, BgIsSUB3d bgIsSUB3d, rJ0s9PfCL rj0s9pfcl, int i, int i2) {
        BgIsSUB3d bgIsSUB3d2;
        Objects.requireNonNull(mainActivity);
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(1236098553);
        if ((i2 & 1) != 0) {
            int i3 = BgIsSUB3d.Puu3Rhg4F;
            bgIsSUB3d2 = H11ySchUh.CBQ5d1kRq;
        } else {
            bgIsSUB3d2 = bgIsSUB3d;
        }
        wpxpbwg1j.zHl31GGXU(-3687241);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        Object dfpT1j18n = wpxpbwg1j.dfpT1j18n();
        int i4 = rJ0s9PfCL.q3BipwRCk;
        if (dfpT1j18n == P7Re99G8L.J4Ux7ym32) {
            dfpT1j18n = u51fgFYkV.dIocxURUo(Boolean.FALSE, null, 2, null);
            wpxpbwg1j.INnK5Rew6(dfpT1j18n);
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        mainActivity.CBQ5d1kRq(ODug2UCW1.o4LF8RkoQ(R.string.apps_info, wpxpbwg1j), BEG6ENxHu.iiGwOFFnr(bgIsSUB3d2, (float) 6), 0, ((CTn8ClAXF) wpxpbwg1j.oon79WMrY(wYVUeP1PD.q3BipwRCk)).vPSbyrYWX, null, null, 0, false, (RNEcgN6dQ) dfpT1j18n, wpxpbwg1j, 1174405120, 244);
        rESgwfV20 Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb != null) {
            Eeka1udhb.dIocxURUo = new eTXQs9h9T(mainActivity, bgIsSUB3d2, i, i2);
        }
    }

    public static final boolean IytU16YUK(MainActivity mainActivity) {
        return ((Boolean) ((prCJwNx2x) mainActivity.IytU16YUK).getValue()).booleanValue();
    }

    public static final void MzoOEjc4X(MainActivity mainActivity, BgIsSUB3d bgIsSUB3d, rJ0s9PfCL rj0s9pfcl, int i, int i2) {
        Objects.requireNonNull(mainActivity);
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(-518201137);
        if ((i2 & 1) != 0) {
            int i3 = BgIsSUB3d.Puu3Rhg4F;
            bgIsSUB3d = H11ySchUh.CBQ5d1kRq;
        }
        hOY2Rgtej hoy2rgtej = PxtnQGBQi.Puu3Rhg4F;
        Object obj = G7WvUK4mQ.q3BipwRCk;
        PfRpI7wcU pfRpI7wcU = new PfRpI7wcU((tcFbS2CQx) wpxpbwg1j.oon79WMrY(hoy2rgtej), mainActivity);
        JqVWgnx1C jqVWgnx1C = JqVWgnx1C.q3BipwRCk;
        a6VKBsrxC.q3BipwRCk(pfRpI7wcU, bgIsSUB3d, false, null, JqVWgnx1C.J4Ux7ym32, wpxpbwg1j, ((i << 3) & 112) | 24576, 12);
        rESgwfV20 Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb != null) {
            Eeka1udhb.dIocxURUo = new FlUNLBZ9n(mainActivity, bgIsSUB3d, i, i2);
        }
    }

    public static final void NyWTwPF6V(MainActivity mainActivity, String str) {
        ((prCJwNx2x) mainActivity.i8XZMQc6Z).CBQ5d1kRq(str);
    }

    public static final void RG6kpfv3v(MainActivity mainActivity, BgIsSUB3d bgIsSUB3d, rJ0s9PfCL rj0s9pfcl, int i, int i2) {
        Objects.requireNonNull(mainActivity);
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(-1986804758);
        if ((i2 & 1) != 0) {
            int i3 = BgIsSUB3d.Puu3Rhg4F;
            bgIsSUB3d = H11ySchUh.CBQ5d1kRq;
        }
        hOY2Rgtej hoy2rgtej = PxtnQGBQi.Puu3Rhg4F;
        Object obj = G7WvUK4mQ.q3BipwRCk;
        tcFbS2CQx tcfbs2cqx = (tcFbS2CQx) wpxpbwg1j.oon79WMrY(hoy2rgtej);
        boolean booleanValue = ((Boolean) wpxpbwg1j.oon79WMrY(mainActivity.ixWaw2akD)).booleanValue();
        wpxpbwg1j.zHl31GGXU(-723524056);
        wpxpbwg1j.zHl31GGXU(-3687241);
        Object dfpT1j18n = wpxpbwg1j.dfpT1j18n();
        int i4 = rJ0s9PfCL.q3BipwRCk;
        if (dfpT1j18n == P7Re99G8L.J4Ux7ym32) {
            VqT05HRsg vqT05HRsg = new VqT05HRsg(gLDxq5bwv.iiGwOFFnr(HbUTGjFCZ.CBQ5d1kRq, wpxpbwg1j));
            wpxpbwg1j.INnK5Rew6(vqT05HRsg);
            dfpT1j18n = vqT05HRsg;
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        oQkvjGXIr oqkvjgxir = ((VqT05HRsg) dfpT1j18n).CBQ5d1kRq;
        wpxpbwg1j.ilHKhw3Yw(false);
        boolean EBQXiIPmm = mainActivity.EBQXiIPmm();
        hS6b8VSvI hs6b8vsvi = new hS6b8VSvI(mainActivity, tcfbs2cqx, oqkvjgxir, booleanValue);
        JqVWgnx1C jqVWgnx1C = JqVWgnx1C.q3BipwRCk;
        a6VKBsrxC.q3BipwRCk(hs6b8vsvi, bgIsSUB3d, EBQXiIPmm, null, JqVWgnx1C.oon79WMrY, wpxpbwg1j, ((i << 3) & 112) | 24576, 8);
        rESgwfV20 Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb != null) {
            Eeka1udhb.dIocxURUo = new yOg3ACGm2(mainActivity, bgIsSUB3d, i, i2);
        }
    }

    public static final Object V9LQMKGJe(MainActivity mainActivity, String str, Way959ade way959ade) {
        Objects.requireNonNull(mainActivity);
        xaeEKvU2c xaeekvu2c = tQmFGxsat.q3BipwRCk;
        Object qFBXIgpia = idpM54xlp.qFBXIgpia(ZezE4t3SB.q3BipwRCk, new CyYrQ4qwz(mainActivity, str, null), way959ade);
        return qFBXIgpia == kBKJSqCSL.COROUTINE_SUSPENDED ? qFBXIgpia : qih4lW99W.q3BipwRCk;
    }

    public static final void WaUP0CF08(MainActivity mainActivity, BgIsSUB3d bgIsSUB3d, rJ0s9PfCL rj0s9pfcl, int i, int i2) {
        BgIsSUB3d bgIsSUB3d2;
        Objects.requireNonNull(mainActivity);
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(1520523082);
        if ((i2 & 1) != 0) {
            int i3 = BgIsSUB3d.Puu3Rhg4F;
            bgIsSUB3d2 = H11ySchUh.CBQ5d1kRq;
        } else {
            bgIsSUB3d2 = bgIsSUB3d;
        }
        float f = (float) 16;
        d3W76zKHG.q3BipwRCk(BEG6ENxHu.yWvV4ePLl(bgIsSUB3d2, f, (float) 0, f, f), LA6o9xrM4.q3BipwRCk(f), 0, 0, (float) 1, 0.0f, xpuSUT7Gh.qFBXIgpia(wpxpbwg1j, -819861141, true, new nC4pwCCkv(mainActivity)), wpxpbwg1j, 12607488, 108);
        rESgwfV20 Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb != null) {
            Eeka1udhb.dIocxURUo = new jWXG2lIB3(mainActivity, bgIsSUB3d2, i, i2);
        }
    }

    public static final String cAwN510t2(MainActivity mainActivity) {
        return (String) ((prCJwNx2x) mainActivity.i8XZMQc6Z).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void dXrmkklc8(MainActivity mainActivity, BgIsSUB3d bgIsSUB3d, rJ0s9PfCL rj0s9pfcl, int i, int i2) {
        rESgwfV20 Eeka1udhb;
        Objects.requireNonNull(mainActivity);
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(216710559);
        BgIsSUB3d bgIsSUB3d2 = (i2 & 1) != 0 ? H11ySchUh.CBQ5d1kRq : bgIsSUB3d;
        xSTZH8Y9P xstzh8y9p = xSTZH8Y9P.q3BipwRCk;
        sfGSnVX2z sfgsnvx2z = new sfGSnVX2z((float) 16, true, null, null);
        int i3 = (i & 14) | 48;
        wpxpbwg1j.zHl31GGXU(-1989997165);
        int i4 = i3 >> 3;
        nBnrGO77H q3BipwRCk = lMtae7YYQ.q3BipwRCk(sfgsnvx2z, wkHKTCu1d.GPLPRo6go, wpxpbwg1j, (i4 & 112) | (i4 & 14));
        wpxpbwg1j.zHl31GGXU(1376089394);
        AU29aHa4X aU29aHa4X = (AU29aHa4X) wpxpbwg1j.oon79WMrY(PxtnQGBQi.kCA6Zs9sL);
        BFRsKhrQv bFRsKhrQv = (BFRsKhrQv) wpxpbwg1j.oon79WMrY(PxtnQGBQi.oon79WMrY);
        fCkNY70T9 fckny70t9 = (fCkNY70T9) wpxpbwg1j.oon79WMrY(PxtnQGBQi.Bhmn1KIah);
        Objects.requireNonNull(HSwcezbks.tGV7Q6urW);
        gdEmqfwpT gdemqfwpt = xUKgrGMGQ.J4Ux7ym32;
        NzvP5Rex8 IzM1cD9ly = xpuSUT7Gh.IzM1cD9ly(bgIsSUB3d2);
        int i5 = ((((i3 << 3) & 112) << 9) & 7168) | 6;
        if (wpxpbwg1j.J4Ux7ym32 instanceof GX14exZ1F) {
            wpxpbwg1j.wIZEdYHUn();
            if (wpxpbwg1j.vNtjxmzUM) {
                wpxpbwg1j.vPSbyrYWX(gdemqfwpt);
            } else {
                wpxpbwg1j.ln3nf7LH3();
            }
            wpxpbwg1j.WaUP0CF08 = false;
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, q3BipwRCk, xUKgrGMGQ.kCA6Zs9sL);
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, aU29aHa4X, xUKgrGMGQ.dIocxURUo);
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, bFRsKhrQv, xUKgrGMGQ.iiGwOFFnr);
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, fckny70t9, xUKgrGMGQ.GPLPRo6go);
            wpxpbwg1j.MzoOEjc4X();
            ((J9LUUfNUi) IzM1cD9ly).sk5s77z6Q(new uFLsTIS9C(wpxpbwg1j), wpxpbwg1j, Integer.valueOf((i5 >> 3) & 112));
            wpxpbwg1j.zHl31GGXU(2058660585);
            wpxpbwg1j.zHl31GGXU(-326682362);
            int i6 = 2;
            if (((((i5 >> 9) & 14) & 11) ^ 2) != 0 || !wpxpbwg1j.i8XZMQc6Z()) {
                EWfLYpJMy eWfLYpJMy = EWfLYpJMy.q3BipwRCk;
                int i7 = ((i3 >> 6) & 112) | 6;
                if ((i7 & 14) == 0) {
                    if (wpxpbwg1j.iiGwOFFnr(eWfLYpJMy)) {
                        i6 = 4;
                    }
                    i7 |= i6;
                }
                if (((i7 & 91) ^ 18) != 0 || !wpxpbwg1j.i8XZMQc6Z()) {
                    H11ySchUh h11ySchUh = H11ySchUh.CBQ5d1kRq;
                    mainActivity.PSTqBLTET(syekKyXqd.MzoOEjc4X(eWfLYpJMy, h11ySchUh, 0.5f, false, 2, null), wpxpbwg1j, 64, 0);
                    mainActivity.Bhmn1KIah(syekKyXqd.MzoOEjc4X(eWfLYpJMy, h11ySchUh, 0.5f, false, 2, null), wpxpbwg1j, 64, 0);
                    xUiBDp6G4.q3BipwRCk(wpxpbwg1j, false, false, true, false);
                    wpxpbwg1j.ilHKhw3Yw(false);
                    Eeka1udhb = wpxpbwg1j.Eeka1udhb();
                    if (Eeka1udhb == null) {
                        Eeka1udhb.dIocxURUo = new XDcLh2vc4(mainActivity, bgIsSUB3d2, i, i2);
                        return;
                    }
                    return;
                }
            }
            wpxpbwg1j.igRQEZxnW();
            xUiBDp6G4.q3BipwRCk(wpxpbwg1j, false, false, true, false);
            wpxpbwg1j.ilHKhw3Yw(false);
            Eeka1udhb = wpxpbwg1j.Eeka1udhb();
            if (Eeka1udhb == null) {
            }
        } else {
            xpuSUT7Gh.j22ftfeNI();
            throw null;
        }
    }

    public static final void dfpT1j18n(MainActivity mainActivity, PackageManager packageManager, rJ0s9PfCL rj0s9pfcl, int i) {
        SmsTS63dj smsTS63dj;
        Objects.requireNonNull(mainActivity);
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(-1821122835);
        hOY2Rgtej hoy2rgtej = mainActivity.ixWaw2akD;
        Object obj = G7WvUK4mQ.q3BipwRCk;
        boolean booleanValue = ((Boolean) wpxpbwg1j.oon79WMrY(hoy2rgtej)).booleanValue();
        boolean booleanValue2 = ((Boolean) wpxpbwg1j.oon79WMrY(mainActivity.sk5s77z6Q)).booleanValue();
        wpxpbwg1j.zHl31GGXU(-3687241);
        Object dfpT1j18n = wpxpbwg1j.dfpT1j18n();
        int i2 = rJ0s9PfCL.q3BipwRCk;
        Object obj2 = P7Re99G8L.J4Ux7ym32;
        if (dfpT1j18n == obj2) {
            dfpT1j18n = u51fgFYkV.dIocxURUo(Float.valueOf(0.5f), null, 2, null);
            wpxpbwg1j.INnK5Rew6(dfpT1j18n);
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        RNEcgN6dQ rNEcgN6dQ = (RNEcgN6dQ) dfpT1j18n;
        wpxpbwg1j.zHl31GGXU(-3687241);
        Object dfpT1j18n2 = wpxpbwg1j.dfpT1j18n();
        if (dfpT1j18n2 == obj2) {
            dfpT1j18n2 = u51fgFYkV.dIocxURUo(0, null, 2, null);
            wpxpbwg1j.INnK5Rew6(dfpT1j18n2);
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        RNEcgN6dQ rNEcgN6dQ2 = (RNEcgN6dQ) dfpT1j18n2;
        prCJwNx2x prcjwnx2x = (prCJwNx2x) rNEcgN6dQ;
        float floatValue = ((Number) prcjwnx2x.getValue()).floatValue();
        lOtvezK70 lotvezk70 = TqRcaVEga.q3BipwRCk;
        lOtvezK70 lotvezk702 = TqRcaVEga.J4Ux7ym32;
        VGh7XGpXv GPLPRo6go = cqKak5Wfn.GPLPRo6go(700, 0, lotvezk702, 2);
        O0hQm6WVz o0hQm6WVz = y2KA9qgKw.q3BipwRCk;
        wpxpbwg1j.zHl31GGXU(841393235);
        wpxpbwg1j.zHl31GGXU(841393485);
        if (GPLPRo6go == y2KA9qgKw.q3BipwRCk) {
            Float valueOf = Float.valueOf(0.01f);
            wpxpbwg1j.zHl31GGXU(-3686930);
            boolean iiGwOFFnr = wpxpbwg1j.iiGwOFFnr(valueOf);
            Object dfpT1j18n3 = wpxpbwg1j.dfpT1j18n();
            if (iiGwOFFnr || dfpT1j18n3 == obj2) {
                dfpT1j18n3 = cqKak5Wfn.iiGwOFFnr(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                wpxpbwg1j.INnK5Rew6(dfpT1j18n3);
            }
            wpxpbwg1j.ilHKhw3Yw(false);
            smsTS63dj = (SmsTS63dj) dfpT1j18n3;
        } else {
            smsTS63dj = GPLPRo6go;
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        UBY2Inzw8 q3BipwRCk = y2KA9qgKw.q3BipwRCk(Float.valueOf(floatValue), NvSSsPAuJ.q3BipwRCk, smsTS63dj, Float.valueOf(0.01f), null, wpxpbwg1j, 0, 0);
        wpxpbwg1j.ilHKhw3Yw(false);
        prCJwNx2x prcjwnx2x2 = (prCJwNx2x) rNEcgN6dQ2;
        int intValue = ((Number) prcjwnx2x2.getValue()).intValue();
        VGh7XGpXv GPLPRo6go2 = cqKak5Wfn.GPLPRo6go(700, 0, lotvezk702, 2);
        wpxpbwg1j.zHl31GGXU(-887370562);
        UBY2Inzw8 q3BipwRCk2 = y2KA9qgKw.q3BipwRCk(Integer.valueOf(intValue), NvSSsPAuJ.J4Ux7ym32, GPLPRo6go2, null, null, wpxpbwg1j, 0, 8);
        wpxpbwg1j.ilHKhw3Yw(false);
        gLDxq5bwv.J4Ux7ym32(qih4lW99W.q3BipwRCk, new jynIhewPb(mainActivity, booleanValue, booleanValue2, prcjwnx2x2, prcjwnx2x, null), wpxpbwg1j);
        int i3 = BgIsSUB3d.Puu3Rhg4F;
        s9KPlorLI s9kplorli = PV8WgmiL7.J4Ux7ym32;
        wpxpbwg1j.zHl31GGXU(-270266961);
        wpxpbwg1j.zHl31GGXU(-3687241);
        Object dfpT1j18n4 = wpxpbwg1j.dfpT1j18n();
        if (dfpT1j18n4 == obj2) {
            dfpT1j18n4 = new RUkE4Bs9R();
            wpxpbwg1j.INnK5Rew6(dfpT1j18n4);
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        RUkE4Bs9R rUkE4Bs9R = (RUkE4Bs9R) dfpT1j18n4;
        wpxpbwg1j.zHl31GGXU(-3687241);
        Object dfpT1j18n5 = wpxpbwg1j.dfpT1j18n();
        if (dfpT1j18n5 == obj2) {
            dfpT1j18n5 = new A71OEYWpv();
            wpxpbwg1j.INnK5Rew6(dfpT1j18n5);
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        A71OEYWpv a71OEYWpv = (A71OEYWpv) dfpT1j18n5;
        wpxpbwg1j.zHl31GGXU(-3687241);
        Object dfpT1j18n6 = wpxpbwg1j.dfpT1j18n();
        if (dfpT1j18n6 == obj2) {
            dfpT1j18n6 = u51fgFYkV.dIocxURUo(Boolean.FALSE, null, 2, null);
            wpxpbwg1j.INnK5Rew6(dfpT1j18n6);
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        RNEcgN6dQ rNEcgN6dQ3 = (RNEcgN6dQ) dfpT1j18n6;
        wpxpbwg1j.zHl31GGXU(-441911125);
        wpxpbwg1j.zHl31GGXU(-3687241);
        Object dfpT1j18n7 = wpxpbwg1j.dfpT1j18n();
        if (dfpT1j18n7 == obj2) {
            dfpT1j18n7 = new nPZZG1232(a71OEYWpv);
            wpxpbwg1j.INnK5Rew6(dfpT1j18n7);
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        nPZZG1232 npzzg1232 = (nPZZG1232) dfpT1j18n7;
        wpxpbwg1j.zHl31GGXU(-3686930);
        boolean iiGwOFFnr2 = wpxpbwg1j.iiGwOFFnr(257);
        Object dfpT1j18n8 = wpxpbwg1j.dfpT1j18n();
        if (iiGwOFFnr2 || dfpT1j18n8 == obj2) {
            dfpT1j18n8 = new n4f84B5OG(new WPKZSgOZD(rUkE4Bs9R, npzzg1232, 257, rNEcgN6dQ3), new kuvj6DyFF(rNEcgN6dQ3, npzzg1232));
            wpxpbwg1j.INnK5Rew6(dfpT1j18n8);
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        n4f84B5OG n4f84b5og = (n4f84B5OG) dfpT1j18n8;
        wpxpbwg1j.ilHKhw3Yw(false);
        xpuSUT7Gh.GPLPRo6go(pA5wCkne4.sk5s77z6Q(s9kplorli, false, new nVhenZUxZ(rUkE4Bs9R), 1), xpuSUT7Gh.qFBXIgpia(wpxpbwg1j, -819890232, true, new lrQHoEwn7(a71OEYWpv, 6, (gdEmqfwpT) n4f84b5og.kmSgne1rO, mainActivity, packageManager, q3BipwRCk, q3BipwRCk2)), (nBnrGO77H) n4f84b5og.CBQ5d1kRq, wpxpbwg1j, 48, 0);
        wpxpbwg1j.ilHKhw3Yw(false);
        rESgwfV20 Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb != null) {
            Eeka1udhb.dIocxURUo = new vOkrObwRv(mainActivity, packageManager, i);
        }
    }

    public static final void i0Zug1mVk(MainActivity mainActivity, boolean z) {
        ((prCJwNx2x) mainActivity.qFBXIgpia).CBQ5d1kRq(Boolean.valueOf(z));
    }

    public static final void i8XZMQc6Z(MainActivity mainActivity, rJ0s9PfCL rj0s9pfcl, int i) {
        Objects.requireNonNull(mainActivity);
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(1152171584);
        boolean igRQEZxnW = mainActivity.igRQEZxnW();
        EVoQ2RqaN dIocxURUo = KSdwgSYB6.dIocxURUo(null, 0.0f, 3);
        JzLhkMe5F kCA6Zs9sL = KSdwgSYB6.kCA6Zs9sL(null, 0.0f, 3);
        JqVWgnx1C jqVWgnx1C = JqVWgnx1C.q3BipwRCk;
        p62TZmTyO.tGV7Q6urW(igRQEZxnW, null, dIocxURUo, kCA6Zs9sL, null, JqVWgnx1C.yWvV4ePLl, wpxpbwg1j, 200064, 18);
        rESgwfV20 Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb != null) {
            Eeka1udhb.dIocxURUo = new qFsffqw4z(mainActivity, i);
        }
    }

    public static final void iMyQMM6Qj(MainActivity mainActivity, BgIsSUB3d bgIsSUB3d, long j, rJ0s9PfCL rj0s9pfcl, int i, int i2) {
        BgIsSUB3d bgIsSUB3d2;
        long j2;
        Objects.requireNonNull(mainActivity);
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(-397601950);
        if ((i2 & 1) != 0) {
            int i3 = BgIsSUB3d.Puu3Rhg4F;
            bgIsSUB3d2 = H11ySchUh.CBQ5d1kRq;
        } else {
            bgIsSUB3d2 = bgIsSUB3d;
        }
        if ((i2 & 2) != 0) {
            JhpbRXxsg jhpbRXxsg = bO2dbmrf7.J4Ux7ym32;
            j2 = bO2dbmrf7.Puu3Rhg4F;
        } else {
            j2 = j;
        }
        String o4LF8RkoQ = ODug2UCW1.o4LF8RkoQ(mainActivity.QNqj6nIzv() ? R.string.slogan_pro : R.string.slogan, wpxpbwg1j);
        String o4LF8RkoQ2 = ODug2UCW1.o4LF8RkoQ(R.string.full, wpxpbwg1j);
        int igRQEZxnW = r6NbD4wnj.igRQEZxnW(o4LF8RkoQ, o4LF8RkoQ2, 0, false, 6);
        wpxpbwg1j.zHl31GGXU(-397601640);
        rKKfiOTQO rkkfiotqo = new rKKfiOTQO(0, 1);
        ((StringBuilder) rkkfiotqo.J4Ux7ym32).append(o4LF8RkoQ);
        if (igRQEZxnW != -1) {
            Object obj = G7WvUK4mQ.q3BipwRCk;
            rkkfiotqo.J4Ux7ym32(new dBWPON5YR(((grAfiZycg) wpxpbwg1j.oon79WMrY(BPBXLXpsE.q3BipwRCk)).Eeka1udhb(), 0, (m0AevvDOv) null, (JI2JIz7iN) null, (Z7oCchjRS) null, (Vyo35YgKP) null, (String) null, 0, (SLFBujE8J) null, (dMGlVaFwN) null, (Z6wpHNDNp) null, 0, (hrmqyyOPt) null, (lDSGv8N6A) null, 16382), igRQEZxnW, o4LF8RkoQ2.length() + igRQEZxnW);
        }
        joIJ4ANvK GPLPRo6go = rkkfiotqo.GPLPRo6go();
        wpxpbwg1j.ilHKhw3Yw(false);
        RxEtsNHUB rxEtsNHUB = Vyo35YgKP.tGV7Q6urW;
        Object obj2 = G7WvUK4mQ.q3BipwRCk;
        GjhoS54Hf gjhoS54Hf = ((CTn8ClAXF) wpxpbwg1j.oon79WMrY(wYVUeP1PD.q3BipwRCk)).CBQ5d1kRq;
        long sk5s77z6Q = BBVaGLNaU.sk5s77z6Q(12);
        JhpbRXxsg jhpbRXxsg2 = m0AevvDOv.kmSgne1rO;
        int i4 = i << 3;
        CxqHP5W0n.J4Ux7ym32(GPLPRo6go, bgIsSUB3d2, j2, sk5s77z6Q, null, m0AevvDOv.dXrmkklc8, rxEtsNHUB, 0, null, new vZSd4byf0(3), 0, 2, false, 1, null, null, gjhoS54Hf, wpxpbwg1j, (i4 & 112) | 199680 | (i4 & 896), 3120, 54672);
        rESgwfV20 Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb != null) {
            Eeka1udhb.dIocxURUo = new Gm3ZWPl0I(mainActivity, bgIsSUB3d2, j2, i, i2);
        }
    }

    public static final void ilHKhw3Yw(MainActivity mainActivity, attbzuWdD attbzuwdd, BgIsSUB3d bgIsSUB3d, PmYqqGuHi pmYqqGuHi, rJ0s9PfCL rj0s9pfcl, int i, int i2) {
        boolean z;
        boolean z2;
        Objects.requireNonNull(mainActivity);
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(-580494867);
        BgIsSUB3d bgIsSUB3d2 = (i2 & 2) != 0 ? H11ySchUh.CBQ5d1kRq : bgIsSUB3d;
        Context context = (Context) wpxpbwg1j.oon79WMrY(KApR71V3i.J4Ux7ym32);
        wpxpbwg1j.zHl31GGXU(-723524056);
        wpxpbwg1j.zHl31GGXU(-3687241);
        Object dfpT1j18n = wpxpbwg1j.dfpT1j18n();
        if (dfpT1j18n == P7Re99G8L.J4Ux7ym32) {
            VqT05HRsg vqT05HRsg = new VqT05HRsg(gLDxq5bwv.iiGwOFFnr(HbUTGjFCZ.CBQ5d1kRq, wpxpbwg1j));
            wpxpbwg1j.INnK5Rew6(vqT05HRsg);
            dfpT1j18n = vqT05HRsg;
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        oQkvjGXIr oqkvjgxir = ((VqT05HRsg) dfpT1j18n).CBQ5d1kRq;
        wpxpbwg1j.ilHKhw3Yw(false);
        T0XFCDCob t0XFCDCob = wkHKTCu1d.Puu3Rhg4F;
        float f = (float) 16;
        BgIsSUB3d vPSbyrYWX = gThLCaTO1.vPSbyrYWX(gThLCaTO1.yWvV4ePLl(bgIsSUB3d2, LA6o9xrM4.q3BipwRCk(f)), f7B6YCXHx.kmSgne1rO, new ytuQRHHQE(!mainActivity.igRQEZxnW(), null, null, null, new HyywYLgnK(mainActivity, context, attbzuwdd), null, new GLlRXMAbf(mainActivity, oqkvjgxir, pmYqqGuHi, attbzuwdd)));
        wpxpbwg1j.zHl31GGXU(-1989997165);
        xSTZH8Y9P xstzh8y9p = xSTZH8Y9P.q3BipwRCk;
        nBnrGO77H q3BipwRCk = lMtae7YYQ.q3BipwRCk(xSTZH8Y9P.J4Ux7ym32, t0XFCDCob, wpxpbwg1j, 48);
        wpxpbwg1j.zHl31GGXU(1376089394);
        hOY2Rgtej hoy2rgtej = PxtnQGBQi.kCA6Zs9sL;
        AU29aHa4X aU29aHa4X = (AU29aHa4X) wpxpbwg1j.oon79WMrY(hoy2rgtej);
        hOY2Rgtej hoy2rgtej2 = PxtnQGBQi.oon79WMrY;
        BFRsKhrQv bFRsKhrQv = (BFRsKhrQv) wpxpbwg1j.oon79WMrY(hoy2rgtej2);
        hOY2Rgtej hoy2rgtej3 = PxtnQGBQi.Bhmn1KIah;
        fCkNY70T9 fckny70t9 = (fCkNY70T9) wpxpbwg1j.oon79WMrY(hoy2rgtej3);
        Objects.requireNonNull(HSwcezbks.tGV7Q6urW);
        gdEmqfwpT gdemqfwpt = xUKgrGMGQ.J4Ux7ym32;
        NzvP5Rex8 IzM1cD9ly = xpuSUT7Gh.IzM1cD9ly(vPSbyrYWX);
        if (wpxpbwg1j.J4Ux7ym32 instanceof GX14exZ1F) {
            wpxpbwg1j.wIZEdYHUn();
            if (wpxpbwg1j.vNtjxmzUM) {
                wpxpbwg1j.vPSbyrYWX(gdemqfwpt);
            } else {
                wpxpbwg1j.ln3nf7LH3();
            }
            wpxpbwg1j.WaUP0CF08 = false;
            kkcQgCx5G kkcqgcx5g = xUKgrGMGQ.kCA6Zs9sL;
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, q3BipwRCk, kkcqgcx5g);
            kkcQgCx5G kkcqgcx5g2 = xUKgrGMGQ.dIocxURUo;
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, aU29aHa4X, kkcqgcx5g2);
            kkcQgCx5G kkcqgcx5g3 = xUKgrGMGQ.iiGwOFFnr;
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, bFRsKhrQv, kkcqgcx5g3);
            kkcQgCx5G kkcqgcx5g4 = xUKgrGMGQ.GPLPRo6go;
            pz7YPhQTU.WaUP0CF08(wpxpbwg1j, fckny70t9, kkcqgcx5g4);
            wpxpbwg1j.MzoOEjc4X();
            ((J9LUUfNUi) IzM1cD9ly).sk5s77z6Q(new uFLsTIS9C(wpxpbwg1j), wpxpbwg1j, 0);
            wpxpbwg1j.zHl31GGXU(2058660585);
            wpxpbwg1j.zHl31GGXU(-326682362);
            EWfLYpJMy eWfLYpJMy = EWfLYpJMy.q3BipwRCk;
            Y3ibtOJiE y3ibtOJiE = attbzuwdd.q3BipwRCk;
            H11ySchUh h11ySchUh = H11ySchUh.CBQ5d1kRq;
            xP6F5SR9v.tGV7Q6urW(y3ibtOJiE, "App Icon", gThLCaTO1.yWvV4ePLl(PV8WgmiL7.iiGwOFFnr(h11ySchUh, (float) 48), LA6o9xrM4.q3BipwRCk(f)), null, null, 0.0f, null, 0, wpxpbwg1j, 56, 248);
            float f2 = (float) 8;
            BgIsSUB3d MzoOEjc4X = syekKyXqd.MzoOEjc4X(eWfLYpJMy, BEG6ENxHu.Puu3Rhg4F(h11ySchUh, f2, 0.0f, 2), 1.0f, false, 2, null);
            wpxpbwg1j.zHl31GGXU(-1113030915);
            nBnrGO77H q3BipwRCk2 = k4mj87xxa.q3BipwRCk(xSTZH8Y9P.tGV7Q6urW, wkHKTCu1d.yWvV4ePLl, wpxpbwg1j, 0);
            wpxpbwg1j.zHl31GGXU(1376089394);
            AU29aHa4X aU29aHa4X2 = (AU29aHa4X) wpxpbwg1j.oon79WMrY(hoy2rgtej);
            BFRsKhrQv bFRsKhrQv2 = (BFRsKhrQv) wpxpbwg1j.oon79WMrY(hoy2rgtej2);
            fCkNY70T9 fckny70t92 = (fCkNY70T9) wpxpbwg1j.oon79WMrY(hoy2rgtej3);
            NzvP5Rex8 IzM1cD9ly2 = xpuSUT7Gh.IzM1cD9ly(MzoOEjc4X);
            if (wpxpbwg1j.J4Ux7ym32 instanceof GX14exZ1F) {
                wpxpbwg1j.wIZEdYHUn();
                if (wpxpbwg1j.vNtjxmzUM) {
                    wpxpbwg1j.vPSbyrYWX(gdemqfwpt);
                } else {
                    wpxpbwg1j.ln3nf7LH3();
                }
                wpxpbwg1j.WaUP0CF08 = false;
                pz7YPhQTU.WaUP0CF08(wpxpbwg1j, q3BipwRCk2, kkcqgcx5g);
                pz7YPhQTU.WaUP0CF08(wpxpbwg1j, aU29aHa4X2, kkcqgcx5g2);
                pz7YPhQTU.WaUP0CF08(wpxpbwg1j, bFRsKhrQv2, kkcqgcx5g3);
                pz7YPhQTU.WaUP0CF08(wpxpbwg1j, fckny70t92, kkcqgcx5g4);
                wpxpbwg1j.MzoOEjc4X();
                ((J9LUUfNUi) IzM1cD9ly2).sk5s77z6Q(new uFLsTIS9C(wpxpbwg1j), wpxpbwg1j, 0);
                wpxpbwg1j.zHl31GGXU(2058660585);
                wpxpbwg1j.zHl31GGXU(276693625);
                CxqHP5W0n.tGV7Q6urW(attbzuwdd.J4Ux7ym32, null, 0, 0, null, null, null, 0, null, null, 0, 2, false, 1, null, null, wpxpbwg1j, 0, 3120, 55294);
                CxqHP5W0n.tGV7Q6urW(attbzuwdd.tGV7Q6urW, null, 0, 0, null, null, null, 0, null, null, 0, 2, false, 1, null, ((CTn8ClAXF) wpxpbwg1j.oon79WMrY(wYVUeP1PD.q3BipwRCk)).CBQ5d1kRq, wpxpbwg1j, 0, 3120, 22526);
                xUiBDp6G4.q3BipwRCk(wpxpbwg1j, false, false, true, false);
                wpxpbwg1j.ilHKhw3Yw(false);
                Set<String> set = (Set) ((prCJwNx2x) mainActivity.cAwN510t2).getValue();
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    for (String str : set) {
                        if (anXlDk6fV.tGV7Q6urW(attbzuwdd.tGV7Q6urW, str)) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                YuSxiExwK yuSxiExwK = tzR8IMGfw.q3BipwRCk;
                EVoQ2RqaN iiGwOFFnr = KSdwgSYB6.iiGwOFFnr(cqKak5Wfn.GPLPRo6go(300, 0, new pR9C5RpTS(new AnticipateOvershootInterpolator()), 2), 0.0f, 0, 6);
                JzLhkMe5F GPLPRo6go = KSdwgSYB6.GPLPRo6go(cqKak5Wfn.GPLPRo6go(125, 0, new pR9C5RpTS(new AccelerateDecelerateInterpolator()), 2), 0.0f, 0, 6);
                BgIsSUB3d iiGwOFFnr2 = PV8WgmiL7.iiGwOFFnr(BEG6ENxHu.oon79WMrY(H11ySchUh.CBQ5d1kRq, f2, 0.0f, f, 0.0f, 10), f);
                JqVWgnx1C jqVWgnx1C = JqVWgnx1C.q3BipwRCk;
                p62TZmTyO.J4Ux7ym32(eWfLYpJMy, z, iiGwOFFnr2, iiGwOFFnr, GPLPRo6go, null, JqVWgnx1C.vPSbyrYWX, wpxpbwg1j, 1573254, 16);
                Set<String> set2 = (Set) ((prCJwNx2x) mainActivity.iMyQMM6Qj).getValue();
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    for (String str2 : set2) {
                        if (anXlDk6fV.tGV7Q6urW(attbzuwdd.tGV7Q6urW, str2)) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                YuSxiExwK yuSxiExwK2 = tzR8IMGfw.q3BipwRCk;
                EVoQ2RqaN iiGwOFFnr3 = KSdwgSYB6.iiGwOFFnr(cqKak5Wfn.GPLPRo6go(300, 0, new pR9C5RpTS(new AnticipateOvershootInterpolator()), 2), 0.0f, 0, 6);
                JzLhkMe5F GPLPRo6go2 = KSdwgSYB6.GPLPRo6go(cqKak5Wfn.GPLPRo6go(125, 0, new pR9C5RpTS(new AccelerateDecelerateInterpolator()), 2), 0.0f, 0, 6);
                BgIsSUB3d iiGwOFFnr4 = PV8WgmiL7.iiGwOFFnr(BEG6ENxHu.oon79WMrY(H11ySchUh.CBQ5d1kRq, f2, 0.0f, f, 0.0f, 10), f2);
                JqVWgnx1C jqVWgnx1C2 = JqVWgnx1C.q3BipwRCk;
                p62TZmTyO.J4Ux7ym32(eWfLYpJMy, z2, iiGwOFFnr4, iiGwOFFnr3, GPLPRo6go2, null, JqVWgnx1C.CBQ5d1kRq, wpxpbwg1j, 1573254, 16);
                xUiBDp6G4.q3BipwRCk(wpxpbwg1j, false, false, true, false);
                wpxpbwg1j.ilHKhw3Yw(false);
                rESgwfV20 Eeka1udhb = wpxpbwg1j.Eeka1udhb();
                if (Eeka1udhb != null) {
                    Eeka1udhb.dIocxURUo = new fvo1VzahC(mainActivity, attbzuwdd, bgIsSUB3d2, pmYqqGuHi, i, i2);
                    return;
                }
                return;
            }
            xpuSUT7Gh.j22ftfeNI();
            throw null;
        }
        xpuSUT7Gh.j22ftfeNI();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final void ixWaw2akD(MainActivity mainActivity, BgIsSUB3d bgIsSUB3d, long j, rJ0s9PfCL rj0s9pfcl, int i, int i2) {
        int i3;
        BgIsSUB3d bgIsSUB3d2;
        long j2;
        wpXpbWG1J wpxpbwg1j;
        long j3;
        BgIsSUB3d bgIsSUB3d3;
        rESgwfV20 Eeka1udhb;
        BgIsSUB3d bgIsSUB3d4;
        long j4;
        Objects.requireNonNull(mainActivity);
        wpXpbWG1J wpxpbwg1j2 = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j2.ziwPzaoF3(1535246866);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            bgIsSUB3d2 = bgIsSUB3d;
        } else if ((i & 14) == 0) {
            bgIsSUB3d2 = bgIsSUB3d;
            i3 = i | (wpxpbwg1j2.iiGwOFFnr(bgIsSUB3d2) ? 4 : 2);
        } else {
            bgIsSUB3d2 = bgIsSUB3d;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            j2 = j;
            i3 |= wpxpbwg1j2.kCA6Zs9sL(j2) ? 32 : 16;
            if (((i3 & 91) ^ 18) == 0 || !wpxpbwg1j2.i8XZMQc6Z()) {
                if (i4 == 0) {
                    int i6 = BgIsSUB3d.Puu3Rhg4F;
                    bgIsSUB3d4 = H11ySchUh.CBQ5d1kRq;
                } else {
                    bgIsSUB3d4 = bgIsSUB3d2;
                }
                if (i5 == 0) {
                    JhpbRXxsg jhpbRXxsg = bO2dbmrf7.J4Ux7ym32;
                    j4 = bO2dbmrf7.Puu3Rhg4F;
                } else {
                    j4 = j2;
                }
                RxEtsNHUB rxEtsNHUB = Vyo35YgKP.tGV7Q6urW;
                Object obj = G7WvUK4mQ.q3BipwRCk;
                GjhoS54Hf gjhoS54Hf = ((CTn8ClAXF) wpxpbwg1j2.oon79WMrY(wYVUeP1PD.q3BipwRCk)).CBQ5d1kRq;
                long sk5s77z6Q = BBVaGLNaU.sk5s77z6Q(21);
                JhpbRXxsg jhpbRXxsg2 = m0AevvDOv.kmSgne1rO;
                int i7 = i3 << 3;
                wpxpbwg1j = wpxpbwg1j2;
                CxqHP5W0n.tGV7Q6urW("Preload", bgIsSUB3d4, j4, sk5s77z6Q, null, m0AevvDOv.dXrmkklc8, rxEtsNHUB, 0, null, new vZSd4byf0(3), 0, 2, false, 1, null, gjhoS54Hf, wpxpbwg1j, 199686 | (i7 & 112) | (i7 & 896), 3120, 21904);
                bgIsSUB3d3 = bgIsSUB3d4;
                j3 = j4;
            } else {
                wpxpbwg1j2.igRQEZxnW();
                wpxpbwg1j = wpxpbwg1j2;
                j3 = j2;
                bgIsSUB3d3 = bgIsSUB3d2;
            }
            Eeka1udhb = wpxpbwg1j.Eeka1udhb();
            if (Eeka1udhb == null) {
                Eeka1udhb.dIocxURUo = new G1HNBOPfv(mainActivity, bgIsSUB3d3, j3, i, i2);
                return;
            }
            return;
        }
        j2 = j;
        if (((i3 & 91) ^ 18) == 0) {
        }
        if (i4 == 0) {
        }
        if (i5 == 0) {
        }
        RxEtsNHUB rxEtsNHUB2 = Vyo35YgKP.tGV7Q6urW;
        Object obj2 = G7WvUK4mQ.q3BipwRCk;
        GjhoS54Hf gjhoS54Hf2 = ((CTn8ClAXF) wpxpbwg1j2.oon79WMrY(wYVUeP1PD.q3BipwRCk)).CBQ5d1kRq;
        long sk5s77z6Q2 = BBVaGLNaU.sk5s77z6Q(21);
        JhpbRXxsg jhpbRXxsg22 = m0AevvDOv.kmSgne1rO;
        int i72 = i3 << 3;
        wpxpbwg1j = wpxpbwg1j2;
        CxqHP5W0n.tGV7Q6urW("Preload", bgIsSUB3d4, j4, sk5s77z6Q2, null, m0AevvDOv.dXrmkklc8, rxEtsNHUB2, 0, null, new vZSd4byf0(3), 0, 2, false, 1, null, gjhoS54Hf2, wpxpbwg1j, 199686 | (i72 & 112) | (i72 & 896), 3120, 21904);
        bgIsSUB3d3 = bgIsSUB3d4;
        j3 = j4;
        Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb == null) {
        }
    }

    public static final void mUqPm6GBh(MainActivity mainActivity, boolean z) {
        ((prCJwNx2x) mainActivity.AqaWJg0b4).CBQ5d1kRq(Boolean.valueOf(z));
    }

    public static final void nlGCs0NZs(MainActivity mainActivity, boolean z) {
        ((prCJwNx2x) mainActivity.IytU16YUK).CBQ5d1kRq(Boolean.valueOf(z));
    }

    public static final void o4LF8RkoQ(MainActivity mainActivity) {
        PmanMZxiM pmanMZxiM;
        Integer num;
        Objects.requireNonNull(mainActivity);
        WQpIMzWun wQpIMzWun = new WQpIMzWun(mainActivity, new ErB1wWwOl(ZaxjSdKpQ.WRAP_CONTENT));
        WQpIMzWun.dIocxURUo(wQpIMzWun, Integer.valueOf((int) R.string.about_header), null, 2);
        WQpIMzWun.q3BipwRCk(wQpIMzWun, Integer.valueOf((int) R.string.about_message), null, null, 6);
        WQpIMzWun.tGV7Q6urW(wQpIMzWun, Integer.valueOf((int) R.string.close), null, null, 6);
        if (mainActivity.dXrmkklc8) {
            Integer valueOf = Integer.valueOf((int) R.string.get_fde);
            wQpIMzWun.sk5s77z6Q.add(new ovzTyaH09(mainActivity));
            DialogActionButton yWvV4ePLl = idpM54xlp.yWvV4ePLl(wQpIMzWun, LzT8CF9ie.NEUTRAL);
            if (valueOf != null || !idpM54xlp.qVUwofr5s(yWvV4ePLl)) {
                KYuHUB7GA.J4Ux7ym32(wQpIMzWun, yWvV4ePLl, valueOf, null, 0, wQpIMzWun.MzoOEjc4X, null, 40);
            }
        }
        if (!mainActivity.QNqj6nIzv()) {
            num = Integer.valueOf((int) R.string.get_pro);
            pmanMZxiM = new E4m3TqUyM(mainActivity);
        } else {
            num = Integer.valueOf((int) R.string.faq);
            pmanMZxiM = new yTRKqbn7P(mainActivity);
        }
        WQpIMzWun.J4Ux7ym32(wQpIMzWun, num, null, pmanMZxiM, 2);
        wQpIMzWun.show();
    }

    public static final Object qFBXIgpia(MainActivity mainActivity, List list, String str, Way959ade way959ade) {
        Objects.requireNonNull(mainActivity);
        return idpM54xlp.RG6kpfv3v(dnBSj5uJN.ilHKhw3Yw(mainActivity), null, 0, new e89nQBxfx(mainActivity, list, str, null), 3, null);
    }

    public static final void qVUwofr5s(MainActivity mainActivity, BgIsSUB3d bgIsSUB3d, PackageManager packageManager, PmYqqGuHi pmYqqGuHi, rJ0s9PfCL rj0s9pfcl, int i, int i2) {
        BgIsSUB3d bgIsSUB3d2;
        Objects.requireNonNull(mainActivity);
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(683185730);
        if ((i2 & 1) != 0) {
            int i3 = BgIsSUB3d.Puu3Rhg4F;
            bgIsSUB3d2 = H11ySchUh.CBQ5d1kRq;
        } else {
            bgIsSUB3d2 = bgIsSUB3d;
        }
        wpxpbwg1j.zHl31GGXU(-3687241);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        Object dfpT1j18n = wpxpbwg1j.dfpT1j18n();
        int i4 = rJ0s9PfCL.q3BipwRCk;
        Object obj2 = P7Re99G8L.J4Ux7ym32;
        if (dfpT1j18n == obj2) {
            dfpT1j18n = new fhHgxp0FC();
            wpxpbwg1j.INnK5Rew6(dfpT1j18n);
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        fhHgxp0FC fhhgxp0fc = (fhHgxp0FC) dfpT1j18n;
        wpxpbwg1j.zHl31GGXU(-3687241);
        Object dfpT1j18n2 = wpxpbwg1j.dfpT1j18n();
        if (dfpT1j18n2 == obj2) {
            dfpT1j18n2 = new fhHgxp0FC();
            wpxpbwg1j.INnK5Rew6(dfpT1j18n2);
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        fhHgxp0FC fhhgxp0fc2 = (fhHgxp0FC) dfpT1j18n2;
        wpxpbwg1j.zHl31GGXU(-3687241);
        Object dfpT1j18n3 = wpxpbwg1j.dfpT1j18n();
        if (dfpT1j18n3 == obj2) {
            dfpT1j18n3 = u51fgFYkV.dIocxURUo(Boolean.FALSE, null, 2, null);
            wpxpbwg1j.INnK5Rew6(dfpT1j18n3);
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        RNEcgN6dQ rNEcgN6dQ = (RNEcgN6dQ) dfpT1j18n3;
        wpxpbwg1j.zHl31GGXU(-3687241);
        Object dfpT1j18n4 = wpxpbwg1j.dfpT1j18n();
        if (dfpT1j18n4 == obj2) {
            dfpT1j18n4 = u51fgFYkV.dIocxURUo(Boolean.TRUE, null, 2, null);
            wpxpbwg1j.INnK5Rew6(dfpT1j18n4);
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        RNEcgN6dQ rNEcgN6dQ2 = (RNEcgN6dQ) dfpT1j18n4;
        wpxpbwg1j.zHl31GGXU(-723524056);
        wpxpbwg1j.zHl31GGXU(-3687241);
        Object dfpT1j18n5 = wpxpbwg1j.dfpT1j18n();
        if (dfpT1j18n5 == obj2) {
            VqT05HRsg vqT05HRsg = new VqT05HRsg(gLDxq5bwv.iiGwOFFnr(HbUTGjFCZ.CBQ5d1kRq, wpxpbwg1j));
            wpxpbwg1j.INnK5Rew6(vqT05HRsg);
            dfpT1j18n5 = vqT05HRsg;
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        oQkvjGXIr oqkvjgxir = ((VqT05HRsg) dfpT1j18n5).CBQ5d1kRq;
        wpxpbwg1j.ilHKhw3Yw(false);
        float f = (float) 16;
        VGh7XGpXv GPLPRo6go = cqKak5Wfn.GPLPRo6go(300, 0, null, 6);
        boolean z = Rjnc3TWC6.q3BipwRCk;
        d3W76zKHG.q3BipwRCk(BEG6ENxHu.yWvV4ePLl(gThLCaTO1.vPSbyrYWX(bgIsSUB3d2, f7B6YCXHx.kmSgne1rO, new ghqvDXzkf((kkcQgCx5G) null, GPLPRo6go)), f, (float) 0, f, f), LA6o9xrM4.q3BipwRCk(f), 0, 0, (float) 1, 0.0f, xpuSUT7Gh.qFBXIgpia(wpxpbwg1j, -819916828, true, new MjwlnlH2D(rNEcgN6dQ2, fhhgxp0fc2, fhhgxp0fc, mainActivity, oqkvjgxir, rNEcgN6dQ, pmYqqGuHi, packageManager)), wpxpbwg1j, 12607488, 108);
        rESgwfV20 Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb != null) {
            Eeka1udhb.dIocxURUo = new tDbWPSedY(mainActivity, bgIsSUB3d2, packageManager, pmYqqGuHi, i, i2);
        }
    }

    public static final void sk5s77z6Q(MainActivity mainActivity, BgIsSUB3d bgIsSUB3d, rJ0s9PfCL rj0s9pfcl, int i, int i2) {
        BgIsSUB3d bgIsSUB3d2;
        Objects.requireNonNull(mainActivity);
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(-289056668);
        if ((i2 & 1) != 0) {
            int i3 = BgIsSUB3d.Puu3Rhg4F;
            bgIsSUB3d2 = H11ySchUh.CBQ5d1kRq;
        } else {
            bgIsSUB3d2 = bgIsSUB3d;
        }
        String str = (String) ((prCJwNx2x) mainActivity.i8XZMQc6Z).getValue();
        RxEtsNHUB rxEtsNHUB = Vyo35YgKP.tGV7Q6urW;
        long sk5s77z6Q = BBVaGLNaU.sk5s77z6Q(15);
        float f = icndHY7dz.q3BipwRCk;
        wpxpbwg1j.zHl31GGXU(122203352);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        JhpbRXxsg jhpbRXxsg = yGEA2YLT7.iiGwOFFnr;
        yGEA2YLT7 ygea2ylt7 = (yGEA2YLT7) uI1r9gOOH.q3BipwRCk(new Object[0], yGEA2YLT7.GPLPRo6go, null, new FqhrNqZrt(0), wpxpbwg1j, 4);
        wpxpbwg1j.ilHKhw3Yw(false);
        boolean z = Rjnc3TWC6.q3BipwRCk;
        CxqHP5W0n.tGV7Q6urW(str, BEG6ENxHu.iiGwOFFnr(gThLCaTO1.vPSbyrYWX(bgIsSUB3d2, f7B6YCXHx.kmSgne1rO, new R1Jgfbkkf(true, ygea2ylt7, true, null, false)), (float) 16), 0, sk5s77z6Q, null, null, rxEtsNHUB, 0, null, null, 0, 0, false, 0, null, null, wpxpbwg1j, 3072, 0, 65460);
        rESgwfV20 Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb != null) {
            Eeka1udhb.dIocxURUo = new SjSqjFCuO(mainActivity, bgIsSUB3d2, i, i2);
        }
    }

    public static final void vNtjxmzUM(MainActivity mainActivity, boolean z) {
        ((prCJwNx2x) mainActivity.nlGCs0NZs).CBQ5d1kRq(Boolean.valueOf(z));
    }

    public final void Bhmn1KIah(BgIsSUB3d bgIsSUB3d, rJ0s9PfCL rj0s9pfcl, int i, int i2) {
        BgIsSUB3d bgIsSUB3d2;
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(925049350);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        if ((i2 & 1) != 0) {
            int i3 = BgIsSUB3d.Puu3Rhg4F;
            bgIsSUB3d2 = H11ySchUh.CBQ5d1kRq;
        } else {
            bgIsSUB3d2 = bgIsSUB3d;
        }
        wpXpbWG1J wpxpbwg1j2 = wpxpbwg1j;
        tcFbS2CQx tcfbs2cqx = (tcFbS2CQx) wpxpbwg1j2.oon79WMrY(PxtnQGBQi.Puu3Rhg4F);
        wpxpbwg1j2.zHl31GGXU(-723524056);
        wpxpbwg1j2.zHl31GGXU(-3687241);
        Object dfpT1j18n = wpxpbwg1j2.dfpT1j18n();
        int i4 = rJ0s9PfCL.q3BipwRCk;
        if (dfpT1j18n == P7Re99G8L.J4Ux7ym32) {
            VqT05HRsg vqT05HRsg = new VqT05HRsg(gLDxq5bwv.iiGwOFFnr(HbUTGjFCZ.CBQ5d1kRq, wpxpbwg1j));
            wpxpbwg1j2.INnK5Rew6(vqT05HRsg);
            dfpT1j18n = vqT05HRsg;
        }
        wpxpbwg1j2.ilHKhw3Yw(false);
        oQkvjGXIr oqkvjgxir = ((VqT05HRsg) dfpT1j18n).CBQ5d1kRq;
        wpxpbwg1j2.ilHKhw3Yw(false);
        boolean EBQXiIPmm = EBQXiIPmm();
        mhl5lIdbQ mhl5lidbq = new mhl5lIdbQ(tcfbs2cqx, oqkvjgxir);
        JqVWgnx1C jqVWgnx1C = JqVWgnx1C.q3BipwRCk;
        Wo3zCKWLb.J4Ux7ym32(mhl5lidbq, bgIsSUB3d2, EBQXiIPmm, null, null, null, null, null, JqVWgnx1C.dIocxURUo, wpxpbwg1j, ((i << 3) & 112) | 805306368, 504);
        rESgwfV20 Eeka1udhb = wpxpbwg1j2.Eeka1udhb();
        if (Eeka1udhb != null) {
            Eeka1udhb.dIocxURUo = new aXI58Y1kr(bgIsSUB3d2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x024c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011c  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void CBQ5d1kRq(String str, BgIsSUB3d bgIsSUB3d, long j, GjhoS54Hf gjhoS54Hf, Vyo35YgKP vyo35YgKP, m0AevvDOv m0aevvdov, int i, boolean z, RNEcgN6dQ rNEcgN6dQ, rJ0s9PfCL rj0s9pfcl, int i2, int i3) {
        int i4;
        BgIsSUB3d bgIsSUB3d2;
        int i5;
        long j2;
        GjhoS54Hf gjhoS54Hf2;
        Vyo35YgKP vyo35YgKP2;
        int i6;
        m0AevvDOv m0aevvdov2;
        int i7;
        boolean z2;
        int i8;
        m0AevvDOv m0aevvdov3;
        Vyo35YgKP vyo35YgKP3;
        GjhoS54Hf gjhoS54Hf3;
        long j3;
        BgIsSUB3d bgIsSUB3d3;
        rESgwfV20 Eeka1udhb;
        int i9;
        m0AevvDOv m0aevvdov4;
        Vyo35YgKP vyo35YgKP4;
        long j4;
        GjhoS54Hf gjhoS54Hf4;
        BgIsSUB3d bgIsSUB3d4;
        int i10;
        boolean z3;
        Object dfpT1j18n;
        Object obj;
        Object dfpT1j18n2;
        GjhoS54Hf gjhoS54Hf5;
        boolean iiGwOFFnr;
        Object dfpT1j18n3;
        boolean iiGwOFFnr2;
        Object dfpT1j18n4;
        int i11;
        int i12;
        int i13;
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(-960148743);
        Object obj2 = G7WvUK4mQ.q3BipwRCk;
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (wpxpbwg1j.iiGwOFFnr(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            bgIsSUB3d2 = bgIsSUB3d;
            i4 |= wpxpbwg1j.iiGwOFFnr(bgIsSUB3d2) ? 32 : 16;
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else if ((i2 & 896) == 0) {
                j2 = j;
                i4 |= wpxpbwg1j.kCA6Zs9sL(j2) ? 256 : 128;
                if ((i2 & 7168) == 0) {
                    if ((i3 & 8) == 0) {
                        gjhoS54Hf2 = gjhoS54Hf;
                        if (wpxpbwg1j.iiGwOFFnr(gjhoS54Hf2)) {
                            i13 = 2048;
                            i4 |= i13;
                        }
                    } else {
                        gjhoS54Hf2 = gjhoS54Hf;
                    }
                    i13 = 1024;
                    i4 |= i13;
                } else {
                    gjhoS54Hf2 = gjhoS54Hf;
                }
                if ((57344 & i2) == 0) {
                    if ((i3 & 16) == 0) {
                        vyo35YgKP2 = vyo35YgKP;
                        if (wpxpbwg1j.iiGwOFFnr(vyo35YgKP2)) {
                            i12 = 16384;
                            i4 |= i12;
                        }
                    } else {
                        vyo35YgKP2 = vyo35YgKP;
                    }
                    i12 = 8192;
                    i4 |= i12;
                } else {
                    vyo35YgKP2 = vyo35YgKP;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                    m0aevvdov2 = m0aevvdov;
                } else {
                    m0aevvdov2 = m0aevvdov;
                    if ((i2 & 458752) == 0) {
                        i4 |= wpxpbwg1j.iiGwOFFnr(m0aevvdov2) ? 131072 : 65536;
                    }
                }
                if ((i2 & 3670016) == 0) {
                    i4 |= ((i3 & 64) != 0 || !wpxpbwg1j.dIocxURUo(i)) ? 524288 : 1048576;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i4 |= wpxpbwg1j.GPLPRo6go(z) ? 8388608 : 4194304;
                }
                if ((i3 & 256) != 0) {
                    i11 = 100663296;
                } else {
                    if ((234881024 & i2) == 0) {
                        i11 = wpxpbwg1j.iiGwOFFnr(rNEcgN6dQ) ? 67108864 : 33554432;
                    }
                    if (((191739611 & i4) ^ 38347922) == 0 || !wpxpbwg1j.i8XZMQc6Z()) {
                        wpxpbwg1j.TyB1UUd72();
                        if ((i2 & 1) != 0 || wpxpbwg1j.WaUP0CF08()) {
                            if (i14 == 0) {
                                int i15 = BgIsSUB3d.Puu3Rhg4F;
                                bgIsSUB3d4 = H11ySchUh.CBQ5d1kRq;
                            } else {
                                bgIsSUB3d4 = bgIsSUB3d;
                            }
                            if (i5 == 0) {
                                JhpbRXxsg jhpbRXxsg = bO2dbmrf7.J4Ux7ym32;
                                j4 = bO2dbmrf7.Puu3Rhg4F;
                            } else {
                                j4 = j2;
                            }
                            if ((i3 & 8) == 0) {
                                gjhoS54Hf4 = ((CTn8ClAXF) wpxpbwg1j.oon79WMrY(wYVUeP1PD.q3BipwRCk)).oon79WMrY;
                                i4 &= -7169;
                            } else {
                                gjhoS54Hf4 = gjhoS54Hf2;
                            }
                            if ((i3 & 16) == 0) {
                                vyo35YgKP4 = Vyo35YgKP.tGV7Q6urW;
                                i4 &= -57345;
                            } else {
                                vyo35YgKP4 = vyo35YgKP2;
                            }
                            if (i6 == 0) {
                                JhpbRXxsg jhpbRXxsg2 = m0AevvDOv.kmSgne1rO;
                                m0aevvdov4 = m0AevvDOv.dXrmkklc8;
                            } else {
                                m0aevvdov4 = m0aevvdov2;
                            }
                            if ((i3 & 64) == 0) {
                                i9 = 3;
                                i4 &= -3670017;
                            } else {
                                i9 = i;
                            }
                            if (i7 != 0) {
                                i10 = i4;
                                z3 = false;
                                wpxpbwg1j.qVUwofr5s();
                                wpxpbwg1j.zHl31GGXU(-3687241);
                                dfpT1j18n = wpxpbwg1j.dfpT1j18n();
                                int i16 = rJ0s9PfCL.q3BipwRCk;
                                obj = P7Re99G8L.J4Ux7ym32;
                                if (dfpT1j18n == obj) {
                                    dfpT1j18n = u51fgFYkV.dIocxURUo(gjhoS54Hf4, null, 2, null);
                                    wpxpbwg1j.INnK5Rew6(dfpT1j18n);
                                }
                                wpxpbwg1j.ilHKhw3Yw(false);
                                RNEcgN6dQ rNEcgN6dQ2 = (RNEcgN6dQ) dfpT1j18n;
                                wpxpbwg1j.zHl31GGXU(-3687241);
                                dfpT1j18n2 = wpxpbwg1j.dfpT1j18n();
                                if (dfpT1j18n2 == obj) {
                                    gjhoS54Hf5 = gjhoS54Hf4;
                                    dfpT1j18n2 = u51fgFYkV.dIocxURUo(Boolean.FALSE, null, 2, null);
                                    wpxpbwg1j.INnK5Rew6(dfpT1j18n2);
                                } else {
                                    gjhoS54Hf5 = gjhoS54Hf4;
                                }
                                wpxpbwg1j.ilHKhw3Yw(false);
                                RNEcgN6dQ rNEcgN6dQ3 = (RNEcgN6dQ) dfpT1j18n2;
                                wpxpbwg1j.zHl31GGXU(-3686930);
                                iiGwOFFnr = wpxpbwg1j.iiGwOFFnr(rNEcgN6dQ3);
                                dfpT1j18n3 = wpxpbwg1j.dfpT1j18n();
                                if (!iiGwOFFnr || dfpT1j18n3 == obj) {
                                    dfpT1j18n3 = new dpz3OQGkY(rNEcgN6dQ3);
                                    wpxpbwg1j.INnK5Rew6(dfpT1j18n3);
                                }
                                wpxpbwg1j.ilHKhw3Yw(false);
                                BgIsSUB3d V9LQMKGJe = xpuSUT7Gh.V9LQMKGJe(bgIsSUB3d4, (PmanMZxiM) dfpT1j18n3);
                                prCJwNx2x prcjwnx2x = (prCJwNx2x) rNEcgN6dQ2;
                                GjhoS54Hf gjhoS54Hf6 = (GjhoS54Hf) prcjwnx2x.getValue();
                                vZSd4byf0 vzsd4byf0 = new vZSd4byf0(i9);
                                wpxpbwg1j.zHl31GGXU(-3686095);
                                iiGwOFFnr2 = wpxpbwg1j.iiGwOFFnr(rNEcgN6dQ) | wpxpbwg1j.iiGwOFFnr(prcjwnx2x) | wpxpbwg1j.iiGwOFFnr(rNEcgN6dQ3);
                                dfpT1j18n4 = wpxpbwg1j.dfpT1j18n();
                                if (!iiGwOFFnr2 || dfpT1j18n4 == obj) {
                                    dfpT1j18n4 = new jwVWEyVe4(rNEcgN6dQ, prcjwnx2x, rNEcgN6dQ3);
                                    wpxpbwg1j.INnK5Rew6(dfpT1j18n4);
                                }
                                wpxpbwg1j.ilHKhw3Yw(false);
                                CxqHP5W0n.tGV7Q6urW(str, V9LQMKGJe, j4, 0, null, m0aevvdov4, vyo35YgKP4, 0, null, vzsd4byf0, 0, 0, z3, 0, (PmanMZxiM) dfpT1j18n4, gjhoS54Hf6, wpxpbwg1j, (i10 & 14) | (i10 & 896) | (458752 & i10) | ((i10 << 6) & 3670016) | (1879048192 & (i10 << 9)), (i10 >> 15) & 896, 11672);
                                bgIsSUB3d3 = bgIsSUB3d4;
                                z2 = z3;
                                j3 = j4;
                                vyo35YgKP3 = vyo35YgKP4;
                                m0aevvdov3 = m0aevvdov4;
                                gjhoS54Hf3 = gjhoS54Hf5;
                                i8 = i9;
                            }
                        } else {
                            wpxpbwg1j.igRQEZxnW();
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 64) != 0) {
                                i4 &= -3670017;
                            }
                            bgIsSUB3d4 = bgIsSUB3d;
                            j4 = j2;
                            gjhoS54Hf4 = gjhoS54Hf2;
                            vyo35YgKP4 = vyo35YgKP2;
                            m0aevvdov4 = m0aevvdov2;
                            i9 = i;
                        }
                        i10 = i4;
                        z3 = z;
                        wpxpbwg1j.qVUwofr5s();
                        wpxpbwg1j.zHl31GGXU(-3687241);
                        dfpT1j18n = wpxpbwg1j.dfpT1j18n();
                        int i162 = rJ0s9PfCL.q3BipwRCk;
                        obj = P7Re99G8L.J4Ux7ym32;
                        if (dfpT1j18n == obj) {
                        }
                        wpxpbwg1j.ilHKhw3Yw(false);
                        RNEcgN6dQ rNEcgN6dQ22 = (RNEcgN6dQ) dfpT1j18n;
                        wpxpbwg1j.zHl31GGXU(-3687241);
                        dfpT1j18n2 = wpxpbwg1j.dfpT1j18n();
                        if (dfpT1j18n2 == obj) {
                        }
                        wpxpbwg1j.ilHKhw3Yw(false);
                        RNEcgN6dQ rNEcgN6dQ32 = (RNEcgN6dQ) dfpT1j18n2;
                        wpxpbwg1j.zHl31GGXU(-3686930);
                        iiGwOFFnr = wpxpbwg1j.iiGwOFFnr(rNEcgN6dQ32);
                        dfpT1j18n3 = wpxpbwg1j.dfpT1j18n();
                        if (!iiGwOFFnr) {
                        }
                        dfpT1j18n3 = new dpz3OQGkY(rNEcgN6dQ32);
                        wpxpbwg1j.INnK5Rew6(dfpT1j18n3);
                        wpxpbwg1j.ilHKhw3Yw(false);
                        BgIsSUB3d V9LQMKGJe2 = xpuSUT7Gh.V9LQMKGJe(bgIsSUB3d4, (PmanMZxiM) dfpT1j18n3);
                        prCJwNx2x prcjwnx2x2 = (prCJwNx2x) rNEcgN6dQ22;
                        GjhoS54Hf gjhoS54Hf62 = (GjhoS54Hf) prcjwnx2x2.getValue();
                        vZSd4byf0 vzsd4byf02 = new vZSd4byf0(i9);
                        wpxpbwg1j.zHl31GGXU(-3686095);
                        iiGwOFFnr2 = wpxpbwg1j.iiGwOFFnr(rNEcgN6dQ) | wpxpbwg1j.iiGwOFFnr(prcjwnx2x2) | wpxpbwg1j.iiGwOFFnr(rNEcgN6dQ32);
                        dfpT1j18n4 = wpxpbwg1j.dfpT1j18n();
                        if (!iiGwOFFnr2) {
                        }
                        dfpT1j18n4 = new jwVWEyVe4(rNEcgN6dQ, prcjwnx2x2, rNEcgN6dQ32);
                        wpxpbwg1j.INnK5Rew6(dfpT1j18n4);
                        wpxpbwg1j.ilHKhw3Yw(false);
                        CxqHP5W0n.tGV7Q6urW(str, V9LQMKGJe2, j4, 0, null, m0aevvdov4, vyo35YgKP4, 0, null, vzsd4byf02, 0, 0, z3, 0, (PmanMZxiM) dfpT1j18n4, gjhoS54Hf62, wpxpbwg1j, (i10 & 14) | (i10 & 896) | (458752 & i10) | ((i10 << 6) & 3670016) | (1879048192 & (i10 << 9)), (i10 >> 15) & 896, 11672);
                        bgIsSUB3d3 = bgIsSUB3d4;
                        z2 = z3;
                        j3 = j4;
                        vyo35YgKP3 = vyo35YgKP4;
                        m0aevvdov3 = m0aevvdov4;
                        gjhoS54Hf3 = gjhoS54Hf5;
                        i8 = i9;
                    } else {
                        wpxpbwg1j.igRQEZxnW();
                        bgIsSUB3d3 = bgIsSUB3d2;
                        j3 = j2;
                        gjhoS54Hf3 = gjhoS54Hf2;
                        vyo35YgKP3 = vyo35YgKP2;
                        m0aevvdov3 = m0aevvdov2;
                        i8 = i;
                        z2 = z;
                    }
                    Eeka1udhb = wpxpbwg1j.Eeka1udhb();
                    if (Eeka1udhb == null) {
                        Eeka1udhb.dIocxURUo = new zAup6mKHj(this, str, bgIsSUB3d3, j3, gjhoS54Hf3, vyo35YgKP3, m0aevvdov3, i8, z2, rNEcgN6dQ, i2, i3);
                        return;
                    }
                    return;
                }
                i4 |= i11;
                if (((191739611 & i4) ^ 38347922) == 0) {
                }
                wpxpbwg1j.TyB1UUd72();
                if ((i2 & 1) != 0) {
                }
                if (i14 == 0) {
                }
                if (i5 == 0) {
                }
                if ((i3 & 8) == 0) {
                }
                if ((i3 & 16) == 0) {
                }
                if (i6 == 0) {
                }
                if ((i3 & 64) == 0) {
                }
                if (i7 != 0) {
                }
                i10 = i4;
                z3 = z;
                wpxpbwg1j.qVUwofr5s();
                wpxpbwg1j.zHl31GGXU(-3687241);
                dfpT1j18n = wpxpbwg1j.dfpT1j18n();
                int i1622 = rJ0s9PfCL.q3BipwRCk;
                obj = P7Re99G8L.J4Ux7ym32;
                if (dfpT1j18n == obj) {
                }
                wpxpbwg1j.ilHKhw3Yw(false);
                RNEcgN6dQ rNEcgN6dQ222 = (RNEcgN6dQ) dfpT1j18n;
                wpxpbwg1j.zHl31GGXU(-3687241);
                dfpT1j18n2 = wpxpbwg1j.dfpT1j18n();
                if (dfpT1j18n2 == obj) {
                }
                wpxpbwg1j.ilHKhw3Yw(false);
                RNEcgN6dQ rNEcgN6dQ322 = (RNEcgN6dQ) dfpT1j18n2;
                wpxpbwg1j.zHl31GGXU(-3686930);
                iiGwOFFnr = wpxpbwg1j.iiGwOFFnr(rNEcgN6dQ322);
                dfpT1j18n3 = wpxpbwg1j.dfpT1j18n();
                if (!iiGwOFFnr) {
                }
                dfpT1j18n3 = new dpz3OQGkY(rNEcgN6dQ322);
                wpxpbwg1j.INnK5Rew6(dfpT1j18n3);
                wpxpbwg1j.ilHKhw3Yw(false);
                BgIsSUB3d V9LQMKGJe22 = xpuSUT7Gh.V9LQMKGJe(bgIsSUB3d4, (PmanMZxiM) dfpT1j18n3);
                prCJwNx2x prcjwnx2x22 = (prCJwNx2x) rNEcgN6dQ222;
                GjhoS54Hf gjhoS54Hf622 = (GjhoS54Hf) prcjwnx2x22.getValue();
                vZSd4byf0 vzsd4byf022 = new vZSd4byf0(i9);
                wpxpbwg1j.zHl31GGXU(-3686095);
                iiGwOFFnr2 = wpxpbwg1j.iiGwOFFnr(rNEcgN6dQ) | wpxpbwg1j.iiGwOFFnr(prcjwnx2x22) | wpxpbwg1j.iiGwOFFnr(rNEcgN6dQ322);
                dfpT1j18n4 = wpxpbwg1j.dfpT1j18n();
                if (!iiGwOFFnr2) {
                }
                dfpT1j18n4 = new jwVWEyVe4(rNEcgN6dQ, prcjwnx2x22, rNEcgN6dQ322);
                wpxpbwg1j.INnK5Rew6(dfpT1j18n4);
                wpxpbwg1j.ilHKhw3Yw(false);
                CxqHP5W0n.tGV7Q6urW(str, V9LQMKGJe22, j4, 0, null, m0aevvdov4, vyo35YgKP4, 0, null, vzsd4byf022, 0, 0, z3, 0, (PmanMZxiM) dfpT1j18n4, gjhoS54Hf622, wpxpbwg1j, (i10 & 14) | (i10 & 896) | (458752 & i10) | ((i10 << 6) & 3670016) | (1879048192 & (i10 << 9)), (i10 >> 15) & 896, 11672);
                bgIsSUB3d3 = bgIsSUB3d4;
                z2 = z3;
                j3 = j4;
                vyo35YgKP3 = vyo35YgKP4;
                m0aevvdov3 = m0aevvdov4;
                gjhoS54Hf3 = gjhoS54Hf5;
                i8 = i9;
                Eeka1udhb = wpxpbwg1j.Eeka1udhb();
                if (Eeka1udhb == null) {
                }
            }
            j2 = j;
            if ((i2 & 7168) == 0) {
            }
            if ((57344 & i2) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            if ((i2 & 3670016) == 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            if ((i3 & 256) != 0) {
            }
            i4 |= i11;
            if (((191739611 & i4) ^ 38347922) == 0) {
            }
            wpxpbwg1j.TyB1UUd72();
            if ((i2 & 1) != 0) {
            }
            if (i14 == 0) {
            }
            if (i5 == 0) {
            }
            if ((i3 & 8) == 0) {
            }
            if ((i3 & 16) == 0) {
            }
            if (i6 == 0) {
            }
            if ((i3 & 64) == 0) {
            }
            if (i7 != 0) {
            }
            i10 = i4;
            z3 = z;
            wpxpbwg1j.qVUwofr5s();
            wpxpbwg1j.zHl31GGXU(-3687241);
            dfpT1j18n = wpxpbwg1j.dfpT1j18n();
            int i16222 = rJ0s9PfCL.q3BipwRCk;
            obj = P7Re99G8L.J4Ux7ym32;
            if (dfpT1j18n == obj) {
            }
            wpxpbwg1j.ilHKhw3Yw(false);
            RNEcgN6dQ rNEcgN6dQ2222 = (RNEcgN6dQ) dfpT1j18n;
            wpxpbwg1j.zHl31GGXU(-3687241);
            dfpT1j18n2 = wpxpbwg1j.dfpT1j18n();
            if (dfpT1j18n2 == obj) {
            }
            wpxpbwg1j.ilHKhw3Yw(false);
            RNEcgN6dQ rNEcgN6dQ3222 = (RNEcgN6dQ) dfpT1j18n2;
            wpxpbwg1j.zHl31GGXU(-3686930);
            iiGwOFFnr = wpxpbwg1j.iiGwOFFnr(rNEcgN6dQ3222);
            dfpT1j18n3 = wpxpbwg1j.dfpT1j18n();
            if (!iiGwOFFnr) {
            }
            dfpT1j18n3 = new dpz3OQGkY(rNEcgN6dQ3222);
            wpxpbwg1j.INnK5Rew6(dfpT1j18n3);
            wpxpbwg1j.ilHKhw3Yw(false);
            BgIsSUB3d V9LQMKGJe222 = xpuSUT7Gh.V9LQMKGJe(bgIsSUB3d4, (PmanMZxiM) dfpT1j18n3);
            prCJwNx2x prcjwnx2x222 = (prCJwNx2x) rNEcgN6dQ2222;
            GjhoS54Hf gjhoS54Hf6222 = (GjhoS54Hf) prcjwnx2x222.getValue();
            vZSd4byf0 vzsd4byf0222 = new vZSd4byf0(i9);
            wpxpbwg1j.zHl31GGXU(-3686095);
            iiGwOFFnr2 = wpxpbwg1j.iiGwOFFnr(rNEcgN6dQ) | wpxpbwg1j.iiGwOFFnr(prcjwnx2x222) | wpxpbwg1j.iiGwOFFnr(rNEcgN6dQ3222);
            dfpT1j18n4 = wpxpbwg1j.dfpT1j18n();
            if (!iiGwOFFnr2) {
            }
            dfpT1j18n4 = new jwVWEyVe4(rNEcgN6dQ, prcjwnx2x222, rNEcgN6dQ3222);
            wpxpbwg1j.INnK5Rew6(dfpT1j18n4);
            wpxpbwg1j.ilHKhw3Yw(false);
            CxqHP5W0n.tGV7Q6urW(str, V9LQMKGJe222, j4, 0, null, m0aevvdov4, vyo35YgKP4, 0, null, vzsd4byf0222, 0, 0, z3, 0, (PmanMZxiM) dfpT1j18n4, gjhoS54Hf6222, wpxpbwg1j, (i10 & 14) | (i10 & 896) | (458752 & i10) | ((i10 << 6) & 3670016) | (1879048192 & (i10 << 9)), (i10 >> 15) & 896, 11672);
            bgIsSUB3d3 = bgIsSUB3d4;
            z2 = z3;
            j3 = j4;
            vyo35YgKP3 = vyo35YgKP4;
            m0aevvdov3 = m0aevvdov4;
            gjhoS54Hf3 = gjhoS54Hf5;
            i8 = i9;
            Eeka1udhb = wpxpbwg1j.Eeka1udhb();
            if (Eeka1udhb == null) {
            }
        }
        bgIsSUB3d2 = bgIsSUB3d;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        j2 = j;
        if ((i2 & 7168) == 0) {
        }
        if ((57344 & i2) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        if ((i2 & 3670016) == 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        if ((i3 & 256) != 0) {
        }
        i4 |= i11;
        if (((191739611 & i4) ^ 38347922) == 0) {
        }
        wpxpbwg1j.TyB1UUd72();
        if ((i2 & 1) != 0) {
        }
        if (i14 == 0) {
        }
        if (i5 == 0) {
        }
        if ((i3 & 8) == 0) {
        }
        if ((i3 & 16) == 0) {
        }
        if (i6 == 0) {
        }
        if ((i3 & 64) == 0) {
        }
        if (i7 != 0) {
        }
        i10 = i4;
        z3 = z;
        wpxpbwg1j.qVUwofr5s();
        wpxpbwg1j.zHl31GGXU(-3687241);
        dfpT1j18n = wpxpbwg1j.dfpT1j18n();
        int i162222 = rJ0s9PfCL.q3BipwRCk;
        obj = P7Re99G8L.J4Ux7ym32;
        if (dfpT1j18n == obj) {
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        RNEcgN6dQ rNEcgN6dQ22222 = (RNEcgN6dQ) dfpT1j18n;
        wpxpbwg1j.zHl31GGXU(-3687241);
        dfpT1j18n2 = wpxpbwg1j.dfpT1j18n();
        if (dfpT1j18n2 == obj) {
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        RNEcgN6dQ rNEcgN6dQ32222 = (RNEcgN6dQ) dfpT1j18n2;
        wpxpbwg1j.zHl31GGXU(-3686930);
        iiGwOFFnr = wpxpbwg1j.iiGwOFFnr(rNEcgN6dQ32222);
        dfpT1j18n3 = wpxpbwg1j.dfpT1j18n();
        if (!iiGwOFFnr) {
        }
        dfpT1j18n3 = new dpz3OQGkY(rNEcgN6dQ32222);
        wpxpbwg1j.INnK5Rew6(dfpT1j18n3);
        wpxpbwg1j.ilHKhw3Yw(false);
        BgIsSUB3d V9LQMKGJe2222 = xpuSUT7Gh.V9LQMKGJe(bgIsSUB3d4, (PmanMZxiM) dfpT1j18n3);
        prCJwNx2x prcjwnx2x2222 = (prCJwNx2x) rNEcgN6dQ22222;
        GjhoS54Hf gjhoS54Hf62222 = (GjhoS54Hf) prcjwnx2x2222.getValue();
        vZSd4byf0 vzsd4byf02222 = new vZSd4byf0(i9);
        wpxpbwg1j.zHl31GGXU(-3686095);
        iiGwOFFnr2 = wpxpbwg1j.iiGwOFFnr(rNEcgN6dQ) | wpxpbwg1j.iiGwOFFnr(prcjwnx2x2222) | wpxpbwg1j.iiGwOFFnr(rNEcgN6dQ32222);
        dfpT1j18n4 = wpxpbwg1j.dfpT1j18n();
        if (!iiGwOFFnr2) {
        }
        dfpT1j18n4 = new jwVWEyVe4(rNEcgN6dQ, prcjwnx2x2222, rNEcgN6dQ32222);
        wpxpbwg1j.INnK5Rew6(dfpT1j18n4);
        wpxpbwg1j.ilHKhw3Yw(false);
        CxqHP5W0n.tGV7Q6urW(str, V9LQMKGJe2222, j4, 0, null, m0aevvdov4, vyo35YgKP4, 0, null, vzsd4byf02222, 0, 0, z3, 0, (PmanMZxiM) dfpT1j18n4, gjhoS54Hf62222, wpxpbwg1j, (i10 & 14) | (i10 & 896) | (458752 & i10) | ((i10 << 6) & 3670016) | (1879048192 & (i10 << 9)), (i10 >> 15) & 896, 11672);
        bgIsSUB3d3 = bgIsSUB3d4;
        z2 = z3;
        j3 = j4;
        vyo35YgKP3 = vyo35YgKP4;
        m0aevvdov3 = m0aevvdov4;
        gjhoS54Hf3 = gjhoS54Hf5;
        i8 = i9;
        Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb == null) {
        }
    }

    public final boolean EBQXiIPmm() {
        return ((Boolean) this.qFBXIgpia.getValue()).booleanValue();
    }

    public final void PSTqBLTET(BgIsSUB3d bgIsSUB3d, rJ0s9PfCL rj0s9pfcl, int i, int i2) {
        BgIsSUB3d bgIsSUB3d2;
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(722669223);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        if ((i2 & 1) != 0) {
            int i3 = BgIsSUB3d.Puu3Rhg4F;
            bgIsSUB3d2 = H11ySchUh.CBQ5d1kRq;
        } else {
            bgIsSUB3d2 = bgIsSUB3d;
        }
        tcFbS2CQx tcfbs2cqx = (tcFbS2CQx) wpxpbwg1j.oon79WMrY(PxtnQGBQi.Puu3Rhg4F);
        wpxpbwg1j.zHl31GGXU(-723524056);
        wpxpbwg1j.zHl31GGXU(-3687241);
        Object dfpT1j18n = wpxpbwg1j.dfpT1j18n();
        int i4 = rJ0s9PfCL.q3BipwRCk;
        if (dfpT1j18n == P7Re99G8L.J4Ux7ym32) {
            VqT05HRsg vqT05HRsg = new VqT05HRsg(gLDxq5bwv.iiGwOFFnr(HbUTGjFCZ.CBQ5d1kRq, wpxpbwg1j));
            wpxpbwg1j.INnK5Rew6(vqT05HRsg);
            dfpT1j18n = vqT05HRsg;
        }
        wpxpbwg1j.ilHKhw3Yw(false);
        oQkvjGXIr oqkvjgxir = ((VqT05HRsg) dfpT1j18n).CBQ5d1kRq;
        wpxpbwg1j.ilHKhw3Yw(false);
        boolean booleanValue = ((Boolean) ((prCJwNx2x) this.nlGCs0NZs).getValue()).booleanValue();
        EVoQ2RqaN q3BipwRCk = KSdwgSYB6.q3BipwRCk(null, null, false, null, 15);
        JzLhkMe5F kCA6Zs9sL = KSdwgSYB6.kCA6Zs9sL(null, 0.0f, 3);
        BaMMm5shD baMMm5shD = new BaMMm5shD(new a9QAfq4Fp(DlhjQ2PrY.MzoOEjc4X, 2), cqKak5Wfn.iiGwOFFnr(0.0f, 400.0f, new ZtJSMDYDl(OZOygOALp.q3BipwRCk(ZtJSMDYDl.J4Ux7ym32)), 1));
        if (true && true) {
            baMMm5shD = null;
        }
        y4A3w2Ci6 y4a3w2ci6 = kCA6Zs9sL.q3BipwRCk;
        gsUpNChDr gsupnchdr = y4a3w2ci6.q3BipwRCk;
        if (gsupnchdr == null) {
            gsupnchdr = null;
        }
        BaMMm5shD baMMm5shD2 = y4a3w2ci6.J4Ux7ym32;
        if (baMMm5shD2 != null) {
            baMMm5shD = baMMm5shD2;
        }
        lTg88Bp1o ltg88bp1o = y4a3w2ci6.tGV7Q6urW;
        if (ltg88bp1o == null) {
            ltg88bp1o = null;
        }
        r9U1gbsBL r9u1gbsbl = y4a3w2ci6.dIocxURUo;
        if (r9u1gbsbl == null) {
            r9u1gbsbl = null;
        }
        p62TZmTyO.tGV7Q6urW(booleanValue, bgIsSUB3d2, q3BipwRCk, new JzLhkMe5F(new y4A3w2Ci6(gsupnchdr, baMMm5shD, ltg88bp1o, r9u1gbsbl)), null, xpuSUT7Gh.qFBXIgpia(wpxpbwg1j, -819905315, true, new qhPEQQaQ4(tcfbs2cqx, oqkvjgxir)), wpxpbwg1j, ((i << 3) & 112) | 200064, 16);
        rESgwfV20 Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb != null) {
            Eeka1udhb.dIocxURUo = new s7MlVynBG(bgIsSUB3d2, i, i2);
        }
    }

    public final boolean QNqj6nIzv() {
        return ((Boolean) this.RG6kpfv3v.getValue()).booleanValue();
    }

    public final void TyB1UUd72() {
        AllhocNWS.q3BipwRCk(this, null, xpuSUT7Gh.nlGCs0NZs(-985535319, true, new lamBDew8Z()), 1);
        idpM54xlp.RG6kpfv3v(dnBSj5uJN.ilHKhw3Yw(this), null, 0, new Q6hF6Z6Ad(null), 3, null);
    }

    public final boolean igRQEZxnW() {
        return ((Boolean) this.AqaWJg0b4.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void kmSgne1rO(float f, BgIsSUB3d bgIsSUB3d, rJ0s9PfCL rj0s9pfcl, int i, int i2) {
        int i3;
        BgIsSUB3d bgIsSUB3d2;
        rESgwfV20 Eeka1udhb;
        BgIsSUB3d bgIsSUB3d3;
        wpXpbWG1J wpxpbwg1j = (wpXpbWG1J) rj0s9pfcl;
        wpxpbwg1j.ziwPzaoF3(1788888142);
        Object obj = G7WvUK4mQ.q3BipwRCk;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = i | (wpxpbwg1j.tGV7Q6urW(f) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            bgIsSUB3d2 = bgIsSUB3d;
            i3 |= wpxpbwg1j.iiGwOFFnr(bgIsSUB3d2) ? 32 : 16;
            if (((i3 & 91) ^ 18) == 0 || !wpxpbwg1j.i8XZMQc6Z()) {
                if (i4 == 0) {
                    int i5 = BgIsSUB3d.Puu3Rhg4F;
                    bgIsSUB3d3 = H11ySchUh.CBQ5d1kRq;
                } else {
                    bgIsSUB3d3 = bgIsSUB3d2;
                }
                float f2 = (float) 16;
                s9KPlorLI s9kplorli = PV8WgmiL7.q3BipwRCk;
                boolean z = Rjnc3TWC6.q3BipwRCk;
                BgIsSUB3d yWvV4ePLl = gThLCaTO1.yWvV4ePLl(bgIsSUB3d3.WaUP0CF08(new wnw63thGA(0.0f, f2, 0.0f, f2, true, (PmanMZxiM) f7B6YCXHx.kmSgne1rO, 5)), LA6o9xrM4.q3BipwRCk(f2));
                Object obj2 = G7WvUK4mQ.q3BipwRCk;
                long Eeka1udhb2 = ((grAfiZycg) wpxpbwg1j.oon79WMrY(BPBXLXpsE.q3BipwRCk)).Eeka1udhb();
                Object obj3 = G7WvUK4mQ.q3BipwRCk;
                a8XGvLktb.tGV7Q6urW(f, yWvV4ePLl, Eeka1udhb2, ((grAfiZycg) wpxpbwg1j.oon79WMrY(BPBXLXpsE.q3BipwRCk)).ixWaw2akD(), wpxpbwg1j, i3 & 14, 0);
                bgIsSUB3d2 = bgIsSUB3d3;
            } else {
                wpxpbwg1j.igRQEZxnW();
            }
            Eeka1udhb = wpxpbwg1j.Eeka1udhb();
            if (Eeka1udhb == null) {
                Eeka1udhb.dIocxURUo = new RG2GI7LDp(f, bgIsSUB3d2, i, i2);
                return;
            }
            return;
        }
        bgIsSUB3d2 = bgIsSUB3d;
        if (((i3 & 91) ^ 18) == 0) {
        }
        if (i4 == 0) {
        }
        float f22 = (float) 16;
        s9KPlorLI s9kplorli2 = PV8WgmiL7.q3BipwRCk;
        boolean z2 = Rjnc3TWC6.q3BipwRCk;
        BgIsSUB3d yWvV4ePLl2 = gThLCaTO1.yWvV4ePLl(bgIsSUB3d3.WaUP0CF08(new wnw63thGA(0.0f, f22, 0.0f, f22, true, (PmanMZxiM) f7B6YCXHx.kmSgne1rO, 5)), LA6o9xrM4.q3BipwRCk(f22));
        Object obj22 = G7WvUK4mQ.q3BipwRCk;
        long Eeka1udhb22 = ((grAfiZycg) wpxpbwg1j.oon79WMrY(BPBXLXpsE.q3BipwRCk)).Eeka1udhb();
        Object obj32 = G7WvUK4mQ.q3BipwRCk;
        a8XGvLktb.tGV7Q6urW(f, yWvV4ePLl2, Eeka1udhb22, ((grAfiZycg) wpxpbwg1j.oon79WMrY(BPBXLXpsE.q3BipwRCk)).ixWaw2akD(), wpxpbwg1j, i3 & 14, 0);
        bgIsSUB3d2 = bgIsSUB3d3;
        Eeka1udhb = wpxpbwg1j.Eeka1udhb();
        if (Eeka1udhb == null) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10401 && i2 == -1) {
            List list = HZDtN0XJv.dIocxURUo;
            ((prCJwNx2x) this.i8XZMQc6Z).CBQ5d1kRq(getString(R.string.selected_stuff));
            this.dfpT1j18n.clear();
            idpM54xlp.RG6kpfv3v(dnBSj5uJN.ilHKhw3Yw(this), tQmFGxsat.tGV7Q6urW, 0, new KPGMfmvlR(new Rma6SHcSH(list, this, null), null), 2, null);
        }
    }

    @Override // androidx.activity.ComponentActivity, con.pc1YcJups, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 31) {
            TypedArray obtainStyledAttributes = obtainStyledAttributes(rf159feB2.q3BipwRCk);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
            if (resourceId != 0) {
                setTheme(resourceId);
            }
        }
        if (PreferenceManager.getDefaultSharedPreferences(this).getBoolean("eulaAccepted", false)) {
            this.dXrmkklc8 = tzR8IMGfw.q3BipwRCk.vPSbyrYWX();
            TyB1UUd72();
            return;
        }
        setFinishOnTouchOutside(false);
        Pf8Spcrui pf8Spcrui = new Pf8Spcrui(this);
        pf8Spcrui.vPSbyrYWX(getString(R.string.eula));
        ((V8gQUs5xA) pf8Spcrui.q3BipwRCk).GPLPRo6go = getString(R.string.eula_itself);
        String string = getString(R.string.nolae);
        u6pX9iZ52 u6px9iz52 = new u6pX9iZ52(this, 0);
        V8gQUs5xA v8gQUs5xA = (V8gQUs5xA) pf8Spcrui.q3BipwRCk;
        v8gQUs5xA.oon79WMrY = string;
        v8gQUs5xA.vPSbyrYWX = u6px9iz52;
        String string2 = getString(R.string.accept);
        u6pX9iZ52 u6px9iz522 = new u6pX9iZ52(this, 1);
        V8gQUs5xA v8gQUs5xA2 = (V8gQUs5xA) pf8Spcrui.q3BipwRCk;
        v8gQUs5xA2.Puu3Rhg4F = string2;
        v8gQUs5xA2.yWvV4ePLl = u6px9iz522;
        pf8Spcrui.yWvV4ePLl().setCancelable(false);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        HZDtN0XJv.q3BipwRCk(this).q3BipwRCk();
        stopService(new Intent(this, PreloadService.class));
        ExecutorService executorService = xheEapSkC.Eeka1udhb;
        xheEapSkC J4Ux7ym32 = PVDPmuuqs.J4Ux7ym32();
        if (J4Ux7ym32 != null) {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (J4Ux7ym32.CBQ5d1kRq >= 0) {
                J4Ux7ym32.kmSgne1rO.shutdown();
                if (J4Ux7ym32.kmSgne1rO.awaitTermination(3, timeUnit)) {
                    J4Ux7ym32.tGV7Q6urW();
                } else {
                    J4Ux7ym32.CBQ5d1kRq = -1;
                }
            }
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        (this.dXrmkklc8 ? xheEapSkC.kCA6Zs9sL("am force-stop com.feravolt.preload.pro") : xheEapSkC.dIocxURUo("am force-stop com.feravolt.preload.pro")).q3BipwRCk();
    }
}
