package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import con.EssXmp5ks;
import con.INrKfCE8Y;
import con.JAwcpriIz;
import con.OYW1jCTK3;
import con.S5aezmTgi;
import con.SlV7nGkeq;
import con.WLlBJNJ2W;
import con.ZJ8KC7OWm;
import con.bUxxqKx57;
import con.c0dtGNCXO;
import con.gy98n89o5;
import con.h7j7Zcum2;
import con.jK3ds2GCn;
import con.k007RzV1x;
import con.oi8NqG12l;
import con.q432S6v9T;
import con.qYFy65iys;
import con.sArOew9FC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static oi8NqG12l qFBXIgpia;
    public SparseArray CBQ5d1kRq = new SparseArray();
    public ArrayList kmSgne1rO = new ArrayList(4);
    public S5aezmTgi Bhmn1KIah = new S5aezmTgi();
    public int PSTqBLTET = 0;
    public int MzoOEjc4X = 0;
    public int ilHKhw3Yw = Integer.MAX_VALUE;
    public int qVUwofr5s = Integer.MAX_VALUE;
    public boolean Eeka1udhb = true;
    public int dXrmkklc8 = 257;
    public RG2GI7LDp RG6kpfv3v = null;
    public c0dtGNCXO ixWaw2akD = null;
    public int sk5s77z6Q = -1;
    public HashMap WaUP0CF08 = new HashMap();
    public int i8XZMQc6Z = -1;
    public int dfpT1j18n = -1;
    public SparseArray iMyQMM6Qj = new SparseArray();
    public mhl5lIdbQ cAwN510t2 = new mhl5lIdbQ(this);
    public int IytU16YUK = 0;
    public int CpG0imbht = 0;

    /* loaded from: classes.dex */
    public static class RG2GI7LDp extends ViewGroup.MarginLayoutParams {
        public float AqaWJg0b4;
        public boolean BL4OzhZBd;
        public int Bhmn1KIah;
        public int CBQ5d1kRq;
        public float CpG0imbht;
        public int Dr7UqlxEV;
        public boolean DuuXfa7LE;
        public int EBQXiIPmm;
        public int Eeka1udhb;
        public int GPLPRo6go;
        public int IG30YE5GU;
        public int INnK5Rew6;
        public int IytU16YUK;
        public int IzM1cD9ly;
        public int J4Ux7ym32;
        public int KBYw84i3W;
        public k007RzV1x KlYagMRWx;
        public int L4EwGfXiQ;
        public float M66hQ219i;
        public int MzoOEjc4X;
        public int NyWTwPF6V;
        public boolean OpLJtmvFM;
        public int PSTqBLTET;
        public int Puu3Rhg4F;
        public int QNqj6nIzv;
        public int QSbMsHU5X;
        public int R2hkbNqWf;
        public int RG6kpfv3v;
        public int SuKhTJIQc;
        public float TyB1UUd72;
        public int V9LQMKGJe;
        public int WaUP0CF08;
        public boolean XYT7vJqNO;
        public float buPcffgdD;
        public int cAwN510t2;
        public int dIocxURUo;
        public int dXrmkklc8;
        public int dfpT1j18n;
        public int i0Zug1mVk;
        public int i8XZMQc6Z;
        public int iMyQMM6Qj;
        public int igRQEZxnW;
        public int iiGwOFFnr;
        public float ilHKhw3Yw;
        public int ixWaw2akD;
        public int j22ftfeNI;
        public float juJ6pnCpu;
        public int kCA6Zs9sL;
        public int kktL0P5MG;
        public int kmSgne1rO;
        public int ln3nf7LH3;
        public float mUqPm6GBh;
        public boolean n4UIOvAko;
        public String nlGCs0NZs;
        public int o4LF8RkoQ;
        public int oon79WMrY;
        public int q3BipwRCk;
        public float qFBXIgpia;
        public int qVUwofr5s;
        public int sk5s77z6Q;
        public float tGV7Q6urW;
        public int vNtjxmzUM;
        public int vPSbyrYWX;
        public String wIZEdYHUn;
        public int yWvV4ePLl;
        public boolean zHl31GGXU;
        public boolean ziwPzaoF3;

        public RG2GI7LDp(int i, int i2) {
            super(i, i2);
            this.q3BipwRCk = -1;
            this.J4Ux7ym32 = -1;
            this.tGV7Q6urW = -1.0f;
            this.dIocxURUo = -1;
            this.kCA6Zs9sL = -1;
            this.iiGwOFFnr = -1;
            this.GPLPRo6go = -1;
            this.Puu3Rhg4F = -1;
            this.yWvV4ePLl = -1;
            this.oon79WMrY = -1;
            this.vPSbyrYWX = -1;
            this.CBQ5d1kRq = -1;
            this.kmSgne1rO = -1;
            this.Bhmn1KIah = -1;
            this.PSTqBLTET = -1;
            this.MzoOEjc4X = 0;
            this.ilHKhw3Yw = 0.0f;
            this.qVUwofr5s = -1;
            this.Eeka1udhb = -1;
            this.dXrmkklc8 = -1;
            this.RG6kpfv3v = -1;
            this.ixWaw2akD = Integer.MIN_VALUE;
            this.sk5s77z6Q = Integer.MIN_VALUE;
            this.WaUP0CF08 = Integer.MIN_VALUE;
            this.i8XZMQc6Z = Integer.MIN_VALUE;
            this.dfpT1j18n = Integer.MIN_VALUE;
            this.iMyQMM6Qj = Integer.MIN_VALUE;
            this.cAwN510t2 = Integer.MIN_VALUE;
            this.IytU16YUK = 0;
            this.CpG0imbht = 0.5f;
            this.qFBXIgpia = 0.5f;
            this.nlGCs0NZs = null;
            this.AqaWJg0b4 = -1.0f;
            this.mUqPm6GBh = -1.0f;
            this.NyWTwPF6V = 0;
            this.vNtjxmzUM = 0;
            this.i0Zug1mVk = 0;
            this.o4LF8RkoQ = 0;
            this.V9LQMKGJe = 0;
            this.QNqj6nIzv = 0;
            this.igRQEZxnW = 0;
            this.EBQXiIPmm = 0;
            this.TyB1UUd72 = 1.0f;
            this.juJ6pnCpu = 1.0f;
            this.j22ftfeNI = -1;
            this.QSbMsHU5X = -1;
            this.L4EwGfXiQ = -1;
            this.zHl31GGXU = false;
            this.ziwPzaoF3 = false;
            this.wIZEdYHUn = null;
            this.IzM1cD9ly = 0;
            this.n4UIOvAko = true;
            this.OpLJtmvFM = true;
            this.BL4OzhZBd = false;
            this.DuuXfa7LE = false;
            this.XYT7vJqNO = false;
            this.kktL0P5MG = -1;
            this.KBYw84i3W = -1;
            this.INnK5Rew6 = -1;
            this.SuKhTJIQc = -1;
            this.ln3nf7LH3 = Integer.MIN_VALUE;
            this.Dr7UqlxEV = Integer.MIN_VALUE;
            this.M66hQ219i = 0.5f;
            this.KlYagMRWx = new k007RzV1x();
        }

        public RG2GI7LDp(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            String str;
            this.q3BipwRCk = -1;
            this.J4Ux7ym32 = -1;
            this.tGV7Q6urW = -1.0f;
            this.dIocxURUo = -1;
            this.kCA6Zs9sL = -1;
            this.iiGwOFFnr = -1;
            this.GPLPRo6go = -1;
            this.Puu3Rhg4F = -1;
            this.yWvV4ePLl = -1;
            this.oon79WMrY = -1;
            this.vPSbyrYWX = -1;
            this.CBQ5d1kRq = -1;
            this.kmSgne1rO = -1;
            this.Bhmn1KIah = -1;
            this.PSTqBLTET = -1;
            this.MzoOEjc4X = 0;
            this.ilHKhw3Yw = 0.0f;
            this.qVUwofr5s = -1;
            this.Eeka1udhb = -1;
            this.dXrmkklc8 = -1;
            this.RG6kpfv3v = -1;
            this.ixWaw2akD = Integer.MIN_VALUE;
            this.sk5s77z6Q = Integer.MIN_VALUE;
            this.WaUP0CF08 = Integer.MIN_VALUE;
            this.i8XZMQc6Z = Integer.MIN_VALUE;
            this.dfpT1j18n = Integer.MIN_VALUE;
            this.iMyQMM6Qj = Integer.MIN_VALUE;
            this.cAwN510t2 = Integer.MIN_VALUE;
            this.IytU16YUK = 0;
            this.CpG0imbht = 0.5f;
            this.qFBXIgpia = 0.5f;
            this.nlGCs0NZs = null;
            this.AqaWJg0b4 = -1.0f;
            this.mUqPm6GBh = -1.0f;
            this.NyWTwPF6V = 0;
            this.vNtjxmzUM = 0;
            this.i0Zug1mVk = 0;
            this.o4LF8RkoQ = 0;
            this.V9LQMKGJe = 0;
            this.QNqj6nIzv = 0;
            this.igRQEZxnW = 0;
            this.EBQXiIPmm = 0;
            this.TyB1UUd72 = 1.0f;
            this.juJ6pnCpu = 1.0f;
            this.j22ftfeNI = -1;
            this.QSbMsHU5X = -1;
            this.L4EwGfXiQ = -1;
            this.zHl31GGXU = false;
            this.ziwPzaoF3 = false;
            this.wIZEdYHUn = null;
            this.IzM1cD9ly = 0;
            this.n4UIOvAko = true;
            this.OpLJtmvFM = true;
            this.BL4OzhZBd = false;
            this.DuuXfa7LE = false;
            this.XYT7vJqNO = false;
            this.kktL0P5MG = -1;
            this.KBYw84i3W = -1;
            this.INnK5Rew6 = -1;
            this.SuKhTJIQc = -1;
            this.ln3nf7LH3 = Integer.MIN_VALUE;
            this.Dr7UqlxEV = Integer.MIN_VALUE;
            this.M66hQ219i = 0.5f;
            this.KlYagMRWx = new k007RzV1x();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, EssXmp5ks.J4Ux7ym32);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = q432S6v9T.q3BipwRCk.get(index);
                switch (i2) {
                    case 1:
                        this.L4EwGfXiQ = obtainStyledAttributes.getInt(index, this.L4EwGfXiQ);
                        continue;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.PSTqBLTET);
                        this.PSTqBLTET = resourceId;
                        if (resourceId == -1) {
                            this.PSTqBLTET = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 3:
                        this.MzoOEjc4X = obtainStyledAttributes.getDimensionPixelSize(index, this.MzoOEjc4X);
                        continue;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.ilHKhw3Yw) % 360.0f;
                        this.ilHKhw3Yw = f;
                        if (f < 0.0f) {
                            this.ilHKhw3Yw = (360.0f - f) % 360.0f;
                        } else {
                            continue;
                        }
                    case 5:
                        this.q3BipwRCk = obtainStyledAttributes.getDimensionPixelOffset(index, this.q3BipwRCk);
                        continue;
                    case 6:
                        this.J4Ux7ym32 = obtainStyledAttributes.getDimensionPixelOffset(index, this.J4Ux7ym32);
                        continue;
                    case 7:
                        this.tGV7Q6urW = obtainStyledAttributes.getFloat(index, this.tGV7Q6urW);
                        continue;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.dIocxURUo);
                        this.dIocxURUo = resourceId2;
                        if (resourceId2 == -1) {
                            this.dIocxURUo = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.kCA6Zs9sL);
                        this.kCA6Zs9sL = resourceId3;
                        if (resourceId3 == -1) {
                            this.kCA6Zs9sL = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.iiGwOFFnr);
                        this.iiGwOFFnr = resourceId4;
                        if (resourceId4 == -1) {
                            this.iiGwOFFnr = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.GPLPRo6go);
                        this.GPLPRo6go = resourceId5;
                        if (resourceId5 == -1) {
                            this.GPLPRo6go = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.Puu3Rhg4F);
                        this.Puu3Rhg4F = resourceId6;
                        if (resourceId6 == -1) {
                            this.Puu3Rhg4F = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.yWvV4ePLl);
                        this.yWvV4ePLl = resourceId7;
                        if (resourceId7 == -1) {
                            this.yWvV4ePLl = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.oon79WMrY);
                        this.oon79WMrY = resourceId8;
                        if (resourceId8 == -1) {
                            this.oon79WMrY = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.vPSbyrYWX);
                        this.vPSbyrYWX = resourceId9;
                        if (resourceId9 == -1) {
                            this.vPSbyrYWX = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.CBQ5d1kRq);
                        this.CBQ5d1kRq = resourceId10;
                        if (resourceId10 == -1) {
                            this.CBQ5d1kRq = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.qVUwofr5s);
                        this.qVUwofr5s = resourceId11;
                        if (resourceId11 == -1) {
                            this.qVUwofr5s = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.Eeka1udhb);
                        this.Eeka1udhb = resourceId12;
                        if (resourceId12 == -1) {
                            this.Eeka1udhb = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.dXrmkklc8);
                        this.dXrmkklc8 = resourceId13;
                        if (resourceId13 == -1) {
                            this.dXrmkklc8 = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.RG6kpfv3v);
                        this.RG6kpfv3v = resourceId14;
                        if (resourceId14 == -1) {
                            this.RG6kpfv3v = obtainStyledAttributes.getInt(index, -1);
                        } else {
                            continue;
                        }
                    case 21:
                        this.ixWaw2akD = obtainStyledAttributes.getDimensionPixelSize(index, this.ixWaw2akD);
                        continue;
                    case 22:
                        this.sk5s77z6Q = obtainStyledAttributes.getDimensionPixelSize(index, this.sk5s77z6Q);
                        continue;
                    case 23:
                        this.WaUP0CF08 = obtainStyledAttributes.getDimensionPixelSize(index, this.WaUP0CF08);
                        continue;
                    case 24:
                        this.i8XZMQc6Z = obtainStyledAttributes.getDimensionPixelSize(index, this.i8XZMQc6Z);
                        continue;
                    case 25:
                        this.dfpT1j18n = obtainStyledAttributes.getDimensionPixelSize(index, this.dfpT1j18n);
                        continue;
                    case 26:
                        this.iMyQMM6Qj = obtainStyledAttributes.getDimensionPixelSize(index, this.iMyQMM6Qj);
                        continue;
                    case 27:
                        this.zHl31GGXU = obtainStyledAttributes.getBoolean(index, this.zHl31GGXU);
                        continue;
                    case 28:
                        this.ziwPzaoF3 = obtainStyledAttributes.getBoolean(index, this.ziwPzaoF3);
                        continue;
                    case 29:
                        this.CpG0imbht = obtainStyledAttributes.getFloat(index, this.CpG0imbht);
                        continue;
                    case 30:
                        this.qFBXIgpia = obtainStyledAttributes.getFloat(index, this.qFBXIgpia);
                        continue;
                    case 31:
                        int i3 = obtainStyledAttributes.getInt(index, 0);
                        this.i0Zug1mVk = i3;
                        if (i3 == 1) {
                            str = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 32:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.o4LF8RkoQ = i4;
                        if (i4 == 1) {
                            str = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        } else {
                            continue;
                        }
                    case 33:
                        try {
                            this.V9LQMKGJe = obtainStyledAttributes.getDimensionPixelSize(index, this.V9LQMKGJe);
                            continue;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.V9LQMKGJe) == -2) {
                                this.V9LQMKGJe = -2;
                            }
                        }
                    case 34:
                        try {
                            this.igRQEZxnW = obtainStyledAttributes.getDimensionPixelSize(index, this.igRQEZxnW);
                            continue;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.igRQEZxnW) == -2) {
                                this.igRQEZxnW = -2;
                            }
                        }
                    case 35:
                        this.TyB1UUd72 = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.TyB1UUd72));
                        this.i0Zug1mVk = 2;
                        continue;
                    case 36:
                        try {
                            this.QNqj6nIzv = obtainStyledAttributes.getDimensionPixelSize(index, this.QNqj6nIzv);
                            continue;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.QNqj6nIzv) == -2) {
                                this.QNqj6nIzv = -2;
                            }
                        }
                    case 37:
                        try {
                            this.EBQXiIPmm = obtainStyledAttributes.getDimensionPixelSize(index, this.EBQXiIPmm);
                            continue;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.EBQXiIPmm) == -2) {
                                this.EBQXiIPmm = -2;
                            }
                        }
                    case 38:
                        this.juJ6pnCpu = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.juJ6pnCpu));
                        this.o4LF8RkoQ = 2;
                        continue;
                    default:
                        switch (i2) {
                            case 44:
                                RG2GI7LDp.GPLPRo6go(this, obtainStyledAttributes.getString(index));
                                continue;
                            case 45:
                                this.AqaWJg0b4 = obtainStyledAttributes.getFloat(index, this.AqaWJg0b4);
                                continue;
                            case 46:
                                this.mUqPm6GBh = obtainStyledAttributes.getFloat(index, this.mUqPm6GBh);
                                continue;
                            case 47:
                                this.NyWTwPF6V = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.vNtjxmzUM = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.j22ftfeNI = obtainStyledAttributes.getDimensionPixelOffset(index, this.j22ftfeNI);
                                continue;
                            case 50:
                                this.QSbMsHU5X = obtainStyledAttributes.getDimensionPixelOffset(index, this.QSbMsHU5X);
                                continue;
                            case 51:
                                this.wIZEdYHUn = obtainStyledAttributes.getString(index);
                                continue;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.kmSgne1rO);
                                this.kmSgne1rO = resourceId15;
                                if (resourceId15 == -1) {
                                    this.kmSgne1rO = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.Bhmn1KIah);
                                this.Bhmn1KIah = resourceId16;
                                if (resourceId16 == -1) {
                                    this.Bhmn1KIah = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 54:
                                this.IytU16YUK = obtainStyledAttributes.getDimensionPixelSize(index, this.IytU16YUK);
                                continue;
                            case 55:
                                this.cAwN510t2 = obtainStyledAttributes.getDimensionPixelSize(index, this.cAwN510t2);
                                continue;
                            default:
                                switch (i2) {
                                    case 64:
                                        RG2GI7LDp.iiGwOFFnr(this, obtainStyledAttributes, index, 0);
                                        continue;
                                        continue;
                                        continue;
                                    case 65:
                                        RG2GI7LDp.iiGwOFFnr(this, obtainStyledAttributes, index, 1);
                                        continue;
                                    case 66:
                                        this.IzM1cD9ly = obtainStyledAttributes.getInt(index, this.IzM1cD9ly);
                                        continue;
                                }
                        }
                        break;
                }
                Log.e("ConstraintLayout", str);
            }
            obtainStyledAttributes.recycle();
            q3BipwRCk();
        }

        public RG2GI7LDp(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.q3BipwRCk = -1;
            this.J4Ux7ym32 = -1;
            this.tGV7Q6urW = -1.0f;
            this.dIocxURUo = -1;
            this.kCA6Zs9sL = -1;
            this.iiGwOFFnr = -1;
            this.GPLPRo6go = -1;
            this.Puu3Rhg4F = -1;
            this.yWvV4ePLl = -1;
            this.oon79WMrY = -1;
            this.vPSbyrYWX = -1;
            this.CBQ5d1kRq = -1;
            this.kmSgne1rO = -1;
            this.Bhmn1KIah = -1;
            this.PSTqBLTET = -1;
            this.MzoOEjc4X = 0;
            this.ilHKhw3Yw = 0.0f;
            this.qVUwofr5s = -1;
            this.Eeka1udhb = -1;
            this.dXrmkklc8 = -1;
            this.RG6kpfv3v = -1;
            this.ixWaw2akD = Integer.MIN_VALUE;
            this.sk5s77z6Q = Integer.MIN_VALUE;
            this.WaUP0CF08 = Integer.MIN_VALUE;
            this.i8XZMQc6Z = Integer.MIN_VALUE;
            this.dfpT1j18n = Integer.MIN_VALUE;
            this.iMyQMM6Qj = Integer.MIN_VALUE;
            this.cAwN510t2 = Integer.MIN_VALUE;
            this.IytU16YUK = 0;
            this.CpG0imbht = 0.5f;
            this.qFBXIgpia = 0.5f;
            this.nlGCs0NZs = null;
            this.AqaWJg0b4 = -1.0f;
            this.mUqPm6GBh = -1.0f;
            this.NyWTwPF6V = 0;
            this.vNtjxmzUM = 0;
            this.i0Zug1mVk = 0;
            this.o4LF8RkoQ = 0;
            this.V9LQMKGJe = 0;
            this.QNqj6nIzv = 0;
            this.igRQEZxnW = 0;
            this.EBQXiIPmm = 0;
            this.TyB1UUd72 = 1.0f;
            this.juJ6pnCpu = 1.0f;
            this.j22ftfeNI = -1;
            this.QSbMsHU5X = -1;
            this.L4EwGfXiQ = -1;
            this.zHl31GGXU = false;
            this.ziwPzaoF3 = false;
            this.wIZEdYHUn = null;
            this.IzM1cD9ly = 0;
            this.n4UIOvAko = true;
            this.OpLJtmvFM = true;
            this.BL4OzhZBd = false;
            this.DuuXfa7LE = false;
            this.XYT7vJqNO = false;
            this.kktL0P5MG = -1;
            this.KBYw84i3W = -1;
            this.INnK5Rew6 = -1;
            this.SuKhTJIQc = -1;
            this.ln3nf7LH3 = Integer.MIN_VALUE;
            this.Dr7UqlxEV = Integer.MIN_VALUE;
            this.M66hQ219i = 0.5f;
            this.KlYagMRWx = new k007RzV1x();
        }

        public void q3BipwRCk() {
            this.DuuXfa7LE = false;
            this.n4UIOvAko = true;
            this.OpLJtmvFM = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.zHl31GGXU) {
                this.n4UIOvAko = false;
                if (this.i0Zug1mVk == 0) {
                    this.i0Zug1mVk = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.ziwPzaoF3) {
                this.OpLJtmvFM = false;
                if (this.o4LF8RkoQ == 0) {
                    this.o4LF8RkoQ = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.n4UIOvAko = false;
                if (i == 0 && this.i0Zug1mVk == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.zHl31GGXU = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.OpLJtmvFM = false;
                if (i2 == 0 && this.o4LF8RkoQ == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.ziwPzaoF3 = true;
                }
            }
            if (this.tGV7Q6urW != -1.0f || this.q3BipwRCk != -1 || this.J4Ux7ym32 != -1) {
                this.DuuXfa7LE = true;
                this.n4UIOvAko = true;
                this.OpLJtmvFM = true;
                if (!(this.KlYagMRWx instanceof SlV7nGkeq)) {
                    this.KlYagMRWx = new SlV7nGkeq();
                }
                ((SlV7nGkeq) this.KlYagMRWx).ziwPzaoF3(this.L4EwGfXiQ);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:72:0x00d0, code lost:
            if (r1 > 0) goto L_0x00d2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x00d2, code lost:
            ((android.view.ViewGroup.MarginLayoutParams) r10).rightMargin = r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x00df, code lost:
            if (r1 > 0) goto L_0x00d2;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump */
        public void resolveLayoutDirection(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i8 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            boolean z = false;
            boolean z2 = 1 == getLayoutDirection();
            this.INnK5Rew6 = -1;
            this.SuKhTJIQc = -1;
            this.kktL0P5MG = -1;
            this.KBYw84i3W = -1;
            this.ln3nf7LH3 = -1;
            this.Dr7UqlxEV = -1;
            this.ln3nf7LH3 = this.ixWaw2akD;
            this.Dr7UqlxEV = this.WaUP0CF08;
            float f = this.CpG0imbht;
            this.M66hQ219i = f;
            int i9 = this.q3BipwRCk;
            this.R2hkbNqWf = i9;
            int i10 = this.J4Ux7ym32;
            this.IG30YE5GU = i10;
            float f2 = this.tGV7Q6urW;
            this.buPcffgdD = f2;
            if (z2) {
                int i11 = this.qVUwofr5s;
                if (i11 != -1) {
                    this.INnK5Rew6 = i11;
                } else {
                    int i12 = this.Eeka1udhb;
                    if (i12 != -1) {
                        this.SuKhTJIQc = i12;
                    }
                    i3 = this.dXrmkklc8;
                    if (i3 != -1) {
                        this.KBYw84i3W = i3;
                        z = true;
                    }
                    i4 = this.RG6kpfv3v;
                    if (i4 != -1) {
                        this.kktL0P5MG = i4;
                        z = true;
                    }
                    i5 = this.dfpT1j18n;
                    if (i5 != Integer.MIN_VALUE) {
                        this.Dr7UqlxEV = i5;
                    }
                    i6 = this.iMyQMM6Qj;
                    if (i6 != Integer.MIN_VALUE) {
                        this.ln3nf7LH3 = i6;
                    }
                    if (z) {
                        this.M66hQ219i = 1.0f - f;
                    }
                    if (this.DuuXfa7LE && this.L4EwGfXiQ == 1) {
                        if (f2 == -1.0f) {
                            this.buPcffgdD = 1.0f - f2;
                            this.R2hkbNqWf = -1;
                            this.IG30YE5GU = -1;
                        } else {
                            if (i9 != -1) {
                                this.IG30YE5GU = i9;
                                this.R2hkbNqWf = -1;
                            } else if (i10 != -1) {
                                this.R2hkbNqWf = i10;
                                this.IG30YE5GU = -1;
                            }
                            this.buPcffgdD = -1.0f;
                        }
                    }
                }
                z = true;
                i3 = this.dXrmkklc8;
                if (i3 != -1) {
                }
                i4 = this.RG6kpfv3v;
                if (i4 != -1) {
                }
                i5 = this.dfpT1j18n;
                if (i5 != Integer.MIN_VALUE) {
                }
                i6 = this.iMyQMM6Qj;
                if (i6 != Integer.MIN_VALUE) {
                }
                if (z) {
                }
                if (this.DuuXfa7LE) {
                    if (f2 == -1.0f) {
                    }
                }
            } else {
                int i13 = this.qVUwofr5s;
                if (i13 != -1) {
                    this.KBYw84i3W = i13;
                }
                int i14 = this.Eeka1udhb;
                if (i14 != -1) {
                    this.kktL0P5MG = i14;
                }
                int i15 = this.dXrmkklc8;
                if (i15 != -1) {
                    this.INnK5Rew6 = i15;
                }
                int i16 = this.RG6kpfv3v;
                if (i16 != -1) {
                    this.SuKhTJIQc = i16;
                }
                int i17 = this.dfpT1j18n;
                if (i17 != Integer.MIN_VALUE) {
                    this.ln3nf7LH3 = i17;
                }
                int i18 = this.iMyQMM6Qj;
                if (i18 != Integer.MIN_VALUE) {
                    this.Dr7UqlxEV = i18;
                }
            }
            if (this.dXrmkklc8 == -1 && this.RG6kpfv3v == -1 && this.Eeka1udhb == -1 && this.qVUwofr5s == -1) {
                int i19 = this.iiGwOFFnr;
                if (i19 != -1) {
                    this.INnK5Rew6 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0) {
                    }
                    i2 = this.dIocxURUo;
                    if (i2 == -1) {
                        this.kktL0P5MG = i2;
                        if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i7 <= 0) {
                            return;
                        }
                    } else {
                        int i20 = this.kCA6Zs9sL;
                        if (i20 != -1) {
                            this.KBYw84i3W = i20;
                            if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i7 <= 0) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i7;
                }
                int i21 = this.GPLPRo6go;
                if (i21 != -1) {
                    this.SuKhTJIQc = i21;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0) {
                    }
                }
                i2 = this.dIocxURUo;
                if (i2 == -1) {
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i7;
            }
        }
    }

    /* loaded from: classes.dex */
    public class mhl5lIdbQ implements jK3ds2GCn.RG2GI7LDp {
        public int GPLPRo6go;
        public int J4Ux7ym32;
        public int dIocxURUo;
        public int iiGwOFFnr;
        public int kCA6Zs9sL;
        public ConstraintLayout q3BipwRCk;
        public int tGV7Q6urW;

        public mhl5lIdbQ(ConstraintLayout constraintLayout) {
            ConstraintLayout.this = r1;
            this.q3BipwRCk = constraintLayout;
        }

        /* JADX WARN: Removed duplicated region for block: B:117:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:121:0x01b2  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x01b4  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x01be A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:132:0x01c6 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:137:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:142:0x01da  */
        /* JADX WARN: Removed duplicated region for block: B:147:0x01e5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:148:0x01e6  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x013e  */
        @Override // con.jK3ds2GCn.RG2GI7LDp
        @SuppressLint({"WrongCall"})
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final void J4Ux7ym32(k007RzV1x k007rzv1x, sArOew9FC saroew9fc) {
            int i;
            int ordinal;
            int i2;
            S5aezmTgi s5aezmTgi;
            int i3;
            int i4;
            int i5;
            boolean z;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            k007RzV1x.RG2GI7LDp rG2GI7LDp = k007RzV1x.RG2GI7LDp.FIXED;
            if (k007rzv1x != null) {
                int i11 = 0;
                if (k007rzv1x.Dr7UqlxEV == 8 && !k007rzv1x.mUqPm6GBh) {
                    saroew9fc.kCA6Zs9sL = 0;
                    saroew9fc.iiGwOFFnr = 0;
                    saroew9fc.GPLPRo6go = 0;
                } else if (k007rzv1x.ziwPzaoF3 != null) {
                    k007RzV1x.RG2GI7LDp rG2GI7LDp2 = saroew9fc.q3BipwRCk;
                    k007RzV1x.RG2GI7LDp rG2GI7LDp3 = saroew9fc.J4Ux7ym32;
                    int i12 = saroew9fc.tGV7Q6urW;
                    int i13 = saroew9fc.dIocxURUo;
                    int i14 = this.J4Ux7ym32 + this.tGV7Q6urW;
                    int i15 = this.dIocxURUo;
                    View view = (View) k007rzv1x.ln3nf7LH3;
                    int ordinal2 = rG2GI7LDp2.ordinal();
                    if (ordinal2 == 0) {
                        i11 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                    } else if (ordinal2 == 1) {
                        i11 = ViewGroup.getChildMeasureSpec(this.iiGwOFFnr, i15, -2);
                    } else if (ordinal2 == 2) {
                        i11 = ViewGroup.getChildMeasureSpec(this.iiGwOFFnr, i15, -2);
                        boolean z2 = k007rzv1x.dXrmkklc8 == 1;
                        int i16 = saroew9fc.oon79WMrY;
                        if (i16 == 1 || i16 == 2) {
                            if (saroew9fc.oon79WMrY == 2 || !z2 || (z2 && (view.getMeasuredHeight() == k007rzv1x.CBQ5d1kRq())) || k007rzv1x.IytU16YUK()) {
                                i11 = View.MeasureSpec.makeMeasureSpec(k007rzv1x.dXrmkklc8(), 1073741824);
                            }
                        }
                    } else if (ordinal2 == 3) {
                        int i17 = this.iiGwOFFnr;
                        h7j7Zcum2 h7j7zcum2 = k007rzv1x.i0Zug1mVk;
                        int i18 = h7j7zcum2 != null ? h7j7zcum2.GPLPRo6go + 0 : 0;
                        h7j7Zcum2 h7j7zcum22 = k007rzv1x.V9LQMKGJe;
                        if (h7j7zcum22 != null) {
                            i18 += h7j7zcum22.GPLPRo6go;
                        }
                        i = ViewGroup.getChildMeasureSpec(i17, i15 + i18, -1);
                        ordinal = rG2GI7LDp3.ordinal();
                        if (ordinal == 0) {
                            if (ordinal == 1) {
                                i9 = -2;
                                i10 = this.GPLPRo6go;
                            } else if (ordinal == 2) {
                                i8 = ViewGroup.getChildMeasureSpec(this.GPLPRo6go, i14, -2);
                                boolean z3 = k007rzv1x.RG6kpfv3v == 1;
                                int i19 = saroew9fc.oon79WMrY;
                                if (i19 == 1 || i19 == 2) {
                                    if (saroew9fc.oon79WMrY == 2 || !z3 || (z3 && (view.getMeasuredWidth() == k007rzv1x.dXrmkklc8())) || k007rzv1x.CpG0imbht()) {
                                        i8 = View.MeasureSpec.makeMeasureSpec(k007rzv1x.CBQ5d1kRq(), 1073741824);
                                    }
                                }
                            } else if (ordinal != 3) {
                                i2 = 0;
                                s5aezmTgi = (S5aezmTgi) k007rzv1x.ziwPzaoF3;
                                if (s5aezmTgi != null && bUxxqKx57.J4Ux7ym32(ConstraintLayout.this.dXrmkklc8, 256) && view.getMeasuredWidth() == k007rzv1x.dXrmkklc8() && view.getMeasuredWidth() < s5aezmTgi.dXrmkklc8() && view.getMeasuredHeight() == k007rzv1x.CBQ5d1kRq() && view.getMeasuredHeight() < s5aezmTgi.CBQ5d1kRq() && view.getBaseline() == k007rzv1x.XYT7vJqNO && !k007rzv1x.cAwN510t2()) {
                                    if (!tGV7Q6urW(k007rzv1x.NyWTwPF6V, i, k007rzv1x.dXrmkklc8()) && tGV7Q6urW(k007rzv1x.vNtjxmzUM, i2, k007rzv1x.CBQ5d1kRq())) {
                                        saroew9fc.kCA6Zs9sL = k007rzv1x.dXrmkklc8();
                                        saroew9fc.iiGwOFFnr = k007rzv1x.CBQ5d1kRq();
                                        saroew9fc.GPLPRo6go = k007rzv1x.XYT7vJqNO;
                                        return;
                                    }
                                }
                                k007RzV1x.RG2GI7LDp rG2GI7LDp4 = k007RzV1x.RG2GI7LDp.MATCH_CONSTRAINT;
                                boolean z4 = rG2GI7LDp2 == rG2GI7LDp4;
                                boolean z5 = rG2GI7LDp3 == rG2GI7LDp4;
                                k007RzV1x.RG2GI7LDp rG2GI7LDp5 = k007RzV1x.RG2GI7LDp.MATCH_PARENT;
                                boolean z6 = rG2GI7LDp3 != rG2GI7LDp5 || rG2GI7LDp3 == rG2GI7LDp;
                                boolean z7 = rG2GI7LDp2 != rG2GI7LDp5 || rG2GI7LDp2 == rG2GI7LDp;
                                boolean z8 = !z4 && k007rzv1x.n4UIOvAko > 0.0f;
                                boolean z9 = !z5 && k007rzv1x.n4UIOvAko > 0.0f;
                                if (view != null) {
                                    RG2GI7LDp rG2GI7LDp6 = (RG2GI7LDp) view.getLayoutParams();
                                    int i20 = saroew9fc.oon79WMrY;
                                    if (i20 == 1 || i20 == 2 || !z4 || k007rzv1x.dXrmkklc8 != 0 || !z5 || k007rzv1x.RG6kpfv3v != 0) {
                                        view.measure(i, i2);
                                        k007rzv1x.NyWTwPF6V = i;
                                        k007rzv1x.vNtjxmzUM = i2;
                                        k007rzv1x.GPLPRo6go = false;
                                        int measuredWidth = view.getMeasuredWidth();
                                        int measuredHeight = view.getMeasuredHeight();
                                        i5 = view.getBaseline();
                                        int i21 = k007rzv1x.sk5s77z6Q;
                                        i4 = i21 > 0 ? Math.max(i21, measuredWidth) : measuredWidth;
                                        int i22 = k007rzv1x.WaUP0CF08;
                                        if (i22 > 0) {
                                            i4 = Math.min(i22, i4);
                                        }
                                        int i23 = k007rzv1x.dfpT1j18n;
                                        if (i23 > 0) {
                                            i3 = Math.max(i23, measuredHeight);
                                            i7 = i;
                                        } else {
                                            i7 = i;
                                            i3 = measuredHeight;
                                        }
                                        int i24 = k007rzv1x.iMyQMM6Qj;
                                        if (i24 > 0) {
                                            i3 = Math.min(i24, i3);
                                        }
                                        if (!bUxxqKx57.J4Ux7ym32(ConstraintLayout.this.dXrmkklc8, 1)) {
                                            if (z8 && z6) {
                                                i4 = (int) ((((float) i3) * k007rzv1x.n4UIOvAko) + 0.5f);
                                            } else if (z9 && z7) {
                                                i3 = (int) ((((float) i4) / k007rzv1x.n4UIOvAko) + 0.5f);
                                            }
                                        }
                                        if (measuredWidth == i4 && measuredHeight == i3) {
                                            i6 = -1;
                                            z = false;
                                        } else {
                                            int makeMeasureSpec = measuredWidth != i4 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : i7;
                                            if (measuredHeight != i3) {
                                                i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                            }
                                            view.measure(makeMeasureSpec, i2);
                                            k007rzv1x.NyWTwPF6V = makeMeasureSpec;
                                            k007rzv1x.vNtjxmzUM = i2;
                                            z = false;
                                            k007rzv1x.GPLPRo6go = false;
                                            i4 = view.getMeasuredWidth();
                                            i3 = view.getMeasuredHeight();
                                            i5 = view.getBaseline();
                                            i6 = -1;
                                        }
                                    } else {
                                        i6 = -1;
                                        z = false;
                                        i5 = 0;
                                        i4 = 0;
                                        i3 = 0;
                                    }
                                    boolean z10 = i5 != i6 ? true : z;
                                    saroew9fc.yWvV4ePLl = (i4 == saroew9fc.tGV7Q6urW && i3 == saroew9fc.dIocxURUo) ? z : true;
                                    if (rG2GI7LDp6.BL4OzhZBd) {
                                        z10 = true;
                                    }
                                    if (!(!z10 || i5 == -1 || k007rzv1x.XYT7vJqNO == i5)) {
                                        saroew9fc.yWvV4ePLl = true;
                                    }
                                    saroew9fc.kCA6Zs9sL = i4;
                                    saroew9fc.iiGwOFFnr = i3;
                                    saroew9fc.Puu3Rhg4F = z10;
                                    saroew9fc.GPLPRo6go = i5;
                                    return;
                                }
                                return;
                            } else {
                                i10 = this.GPLPRo6go;
                                int i25 = k007rzv1x.i0Zug1mVk != null ? k007rzv1x.o4LF8RkoQ.GPLPRo6go + 0 : 0;
                                if (k007rzv1x.V9LQMKGJe != null) {
                                    i25 += k007rzv1x.QNqj6nIzv.GPLPRo6go;
                                }
                                i14 += i25;
                                i9 = -1;
                            }
                            i8 = ViewGroup.getChildMeasureSpec(i10, i14, i9);
                        } else {
                            i8 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
                        }
                        i2 = i8;
                        s5aezmTgi = (S5aezmTgi) k007rzv1x.ziwPzaoF3;
                        if (s5aezmTgi != null) {
                            if (!tGV7Q6urW(k007rzv1x.NyWTwPF6V, i, k007rzv1x.dXrmkklc8()) && tGV7Q6urW(k007rzv1x.vNtjxmzUM, i2, k007rzv1x.CBQ5d1kRq())) {
                            }
                        }
                        k007RzV1x.RG2GI7LDp rG2GI7LDp42 = k007RzV1x.RG2GI7LDp.MATCH_CONSTRAINT;
                        if (rG2GI7LDp2 == rG2GI7LDp42) {
                        }
                        if (rG2GI7LDp3 == rG2GI7LDp42) {
                        }
                        k007RzV1x.RG2GI7LDp rG2GI7LDp52 = k007RzV1x.RG2GI7LDp.MATCH_PARENT;
                        if (rG2GI7LDp3 != rG2GI7LDp52) {
                        }
                        if (rG2GI7LDp2 != rG2GI7LDp52) {
                        }
                        if (!z4) {
                        }
                        if (!z5) {
                        }
                        if (view != null) {
                        }
                    }
                    i = i11;
                    ordinal = rG2GI7LDp3.ordinal();
                    if (ordinal == 0) {
                    }
                    i2 = i8;
                    s5aezmTgi = (S5aezmTgi) k007rzv1x.ziwPzaoF3;
                    if (s5aezmTgi != null) {
                    }
                    k007RzV1x.RG2GI7LDp rG2GI7LDp422 = k007RzV1x.RG2GI7LDp.MATCH_CONSTRAINT;
                    if (rG2GI7LDp2 == rG2GI7LDp422) {
                    }
                    if (rG2GI7LDp3 == rG2GI7LDp422) {
                    }
                    k007RzV1x.RG2GI7LDp rG2GI7LDp522 = k007RzV1x.RG2GI7LDp.MATCH_PARENT;
                    if (rG2GI7LDp3 != rG2GI7LDp522) {
                    }
                    if (rG2GI7LDp2 != rG2GI7LDp522) {
                    }
                    if (!z4) {
                    }
                    if (!z5) {
                    }
                    if (view != null) {
                    }
                }
            }
        }

        @Override // con.jK3ds2GCn.RG2GI7LDp
        public final void q3BipwRCk() {
            int childCount = this.q3BipwRCk.getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.q3BipwRCk.getChildAt(i);
            }
            int size = this.q3BipwRCk.kmSgne1rO.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    Objects.requireNonNull((ZJ8KC7OWm) this.q3BipwRCk.kmSgne1rO.get(i2));
                }
            }
        }

        public final boolean tGV7Q6urW(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        oon79WMrY(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        oon79WMrY(attributeSet, i, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static oi8NqG12l getSharedValues() {
        if (qFBXIgpia == null) {
            qFBXIgpia = new oi8NqG12l();
        }
        return qFBXIgpia;
    }

    public final void Bhmn1KIah(k007RzV1x k007rzv1x, RG2GI7LDp rG2GI7LDp, SparseArray sparseArray, int i, h7j7Zcum2.RG2GI7LDp rG2GI7LDp2) {
        View view = (View) this.CBQ5d1kRq.get(i);
        k007RzV1x k007rzv1x2 = (k007RzV1x) sparseArray.get(i);
        if (k007rzv1x2 != null && view != null && (view.getLayoutParams() instanceof RG2GI7LDp)) {
            rG2GI7LDp.BL4OzhZBd = true;
            h7j7Zcum2.RG2GI7LDp rG2GI7LDp3 = h7j7Zcum2.RG2GI7LDp.BASELINE;
            if (rG2GI7LDp2 == rG2GI7LDp3) {
                RG2GI7LDp rG2GI7LDp4 = (RG2GI7LDp) view.getLayoutParams();
                rG2GI7LDp4.BL4OzhZBd = true;
                rG2GI7LDp4.KlYagMRWx.AqaWJg0b4 = true;
            }
            k007rzv1x.yWvV4ePLl(rG2GI7LDp3).q3BipwRCk(k007rzv1x2.yWvV4ePLl(rG2GI7LDp2), rG2GI7LDp.IytU16YUK, rG2GI7LDp.cAwN510t2, true);
            k007rzv1x.AqaWJg0b4 = true;
            k007rzv1x.yWvV4ePLl(h7j7Zcum2.RG2GI7LDp.TOP).Puu3Rhg4F();
            k007rzv1x.yWvV4ePLl(h7j7Zcum2.RG2GI7LDp.BOTTOM).Puu3Rhg4F();
        }
    }

    public void CBQ5d1kRq(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        mhl5lIdbQ mhl5lidbq = this.cAwN510t2;
        int i5 = mhl5lidbq.kCA6Zs9sL;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i3 + mhl5lidbq.dIocxURUo, i, 0);
        int min = Math.min(this.ilHKhw3Yw, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.qVUwofr5s, ViewGroup.resolveSizeAndState(i4 + i5, i2, 0) & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.i8XZMQc6Z = min;
        this.dfpT1j18n = min2;
    }

    /* renamed from: GPLPRo6go */
    public RG2GI7LDp generateDefaultLayoutParams() {
        return new RG2GI7LDp(-2, -2);
    }

    public Object Puu3Rhg4F(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap hashMap = this.WaUP0CF08;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.WaUP0CF08.get(str);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof RG2GI7LDp;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.kmSgne1rO;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                Objects.requireNonNull((ZJ8KC7OWm) this.kmSgne1rO.get(i));
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i3;
                        float f2 = (float) i4;
                        float f3 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void forceLayout() {
        this.Eeka1udhb = true;
        this.i8XZMQc6Z = -1;
        this.dfpT1j18n = -1;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new RG2GI7LDp(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new RG2GI7LDp(layoutParams);
    }

    public int getMaxHeight() {
        return this.qVUwofr5s;
    }

    public int getMaxWidth() {
        return this.ilHKhw3Yw;
    }

    public int getMinHeight() {
        return this.MzoOEjc4X;
    }

    public int getMinWidth() {
        return this.PSTqBLTET;
    }

    public int getOptimizationLevel() {
        return this.Bhmn1KIah.ifDs8fRNm;
    }

    public void kmSgne1rO(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.WaUP0CF08 == null) {
                this.WaUP0CF08 = new HashMap();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.WaUP0CF08.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            RG2GI7LDp rG2GI7LDp = (RG2GI7LDp) childAt.getLayoutParams();
            k007RzV1x k007rzv1x = rG2GI7LDp.KlYagMRWx;
            if (childAt.getVisibility() != 8 || rG2GI7LDp.DuuXfa7LE || rG2GI7LDp.XYT7vJqNO || isInEditMode) {
                int RG6kpfv3v = k007rzv1x.RG6kpfv3v();
                int ixWaw2akD = k007rzv1x.ixWaw2akD();
                childAt.layout(RG6kpfv3v, ixWaw2akD, k007rzv1x.dXrmkklc8() + RG6kpfv3v, k007rzv1x.CBQ5d1kRq() + ixWaw2akD);
            }
        }
        int size = this.kmSgne1rO.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                Objects.requireNonNull((ZJ8KC7OWm) this.kmSgne1rO.get(i6));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0218, code lost:
        if (r6 == 6) goto L_0x021d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x021f, code lost:
        if (r6 == 6) goto L_0x0221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0560, code lost:
        if (r11 == 0) goto L_0x0567;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0576  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onMeasure(int i, int i2) {
        k007RzV1x.RG2GI7LDp rG2GI7LDp;
        k007RzV1x.RG2GI7LDp rG2GI7LDp2;
        int i3;
        int i4;
        k007RzV1x.RG2GI7LDp rG2GI7LDp3;
        int i5;
        k007RzV1x.RG2GI7LDp rG2GI7LDp4;
        boolean z;
        boolean z2;
        k007RzV1x.RG2GI7LDp rG2GI7LDp5;
        k007RzV1x.RG2GI7LDp rG2GI7LDp6;
        int i6;
        boolean z3;
        int i7;
        h7j7Zcum2.RG2GI7LDp rG2GI7LDp7;
        h7j7Zcum2.RG2GI7LDp rG2GI7LDp8;
        h7j7Zcum2.RG2GI7LDp rG2GI7LDp9;
        int i8;
        RG2GI7LDp rG2GI7LDp10;
        char c;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float f;
        h7j7Zcum2.RG2GI7LDp rG2GI7LDp11;
        int i14;
        k007RzV1x k007rzv1x;
        int i15;
        int i16;
        h7j7Zcum2 yWvV4ePLl;
        h7j7Zcum2 yWvV4ePLl2;
        h7j7Zcum2 h7j7zcum2;
        int i17;
        int i18;
        h7j7Zcum2 h7j7zcum22;
        k007RzV1x k007rzv1x2;
        h7j7Zcum2 h7j7zcum23;
        int i19;
        h7j7Zcum2 h7j7zcum24;
        k007RzV1x k007rzv1x3;
        int i20;
        h7j7Zcum2 yWvV4ePLl3;
        h7j7Zcum2 yWvV4ePLl4;
        int i21;
        String str;
        int dIocxURUo;
        String resourceName;
        int id;
        k007RzV1x k007rzv1x4;
        ConstraintLayout constraintLayout = this;
        k007RzV1x.RG2GI7LDp rG2GI7LDp12 = k007RzV1x.RG2GI7LDp.FIXED;
        k007RzV1x.RG2GI7LDp rG2GI7LDp13 = k007RzV1x.RG2GI7LDp.WRAP_CONTENT;
        int i22 = 0;
        if (!constraintLayout.Eeka1udhb) {
            int childCount = getChildCount();
            int i23 = 0;
            while (true) {
                if (i23 >= childCount) {
                    break;
                } else if (constraintLayout.getChildAt(i23).isLayoutRequested()) {
                    constraintLayout.Eeka1udhb = true;
                    break;
                } else {
                    i23++;
                }
            }
        }
        constraintLayout.IytU16YUK = i;
        constraintLayout.CpG0imbht = i2;
        constraintLayout.Bhmn1KIah.vIbyhVf1d = vPSbyrYWX();
        if (constraintLayout.Eeka1udhb) {
            constraintLayout.Eeka1udhb = false;
            int childCount2 = getChildCount();
            int i24 = 0;
            while (true) {
                if (i24 >= childCount2) {
                    z = false;
                    break;
                } else if (constraintLayout.getChildAt(i24).isLayoutRequested()) {
                    z = true;
                    break;
                } else {
                    i24++;
                }
            }
            if (z) {
                boolean isInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i25 = 0; i25 < childCount3; i25++) {
                    k007RzV1x yWvV4ePLl5 = constraintLayout.yWvV4ePLl(constraintLayout.getChildAt(i25));
                    if (yWvV4ePLl5 != null) {
                        yWvV4ePLl5.qFBXIgpia();
                    }
                }
                Object obj = null;
                if (isInEditMode) {
                    for (int i26 = 0; i26 < childCount3; i26++) {
                        View childAt = constraintLayout.getChildAt(i26);
                        try {
                            resourceName = getResources().getResourceName(childAt.getId());
                            constraintLayout.kmSgne1rO(0, resourceName, Integer.valueOf(childAt.getId()));
                            int indexOf = resourceName.indexOf(47);
                            if (indexOf != -1) {
                                resourceName = resourceName.substring(indexOf + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id != 0) {
                            View view = (View) constraintLayout.CBQ5d1kRq.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                k007rzv1x4 = view == null ? null : ((RG2GI7LDp) view.getLayoutParams()).KlYagMRWx;
                                k007rzv1x4.M66hQ219i = resourceName;
                            }
                        }
                        k007rzv1x4 = constraintLayout.Bhmn1KIah;
                        k007rzv1x4.M66hQ219i = resourceName;
                    }
                }
                if (constraintLayout.sk5s77z6Q != -1) {
                    for (int i27 = 0; i27 < childCount3; i27++) {
                        constraintLayout.getChildAt(i27).getId();
                    }
                }
                RG2GI7LDp rG2GI7LDp14 = constraintLayout.RG6kpfv3v;
                if (rG2GI7LDp14 != null) {
                    rG2GI7LDp14.q3BipwRCk(constraintLayout, true);
                }
                constraintLayout.Bhmn1KIah.ShSN9wbzk.clear();
                int size = constraintLayout.kmSgne1rO.size();
                if (size > 0) {
                    int i28 = 0;
                    while (i28 < size) {
                        ZJ8KC7OWm zJ8KC7OWm = (ZJ8KC7OWm) constraintLayout.kmSgne1rO.get(i28);
                        if (zJ8KC7OWm.isInEditMode()) {
                            zJ8KC7OWm.setIds(zJ8KC7OWm.MzoOEjc4X);
                        }
                        JAwcpriIz jAwcpriIz = zJ8KC7OWm.PSTqBLTET;
                        if (jAwcpriIz != null) {
                            INrKfCE8Y iNrKfCE8Y = (INrKfCE8Y) jAwcpriIz;
                            iNrKfCE8Y.Ihm5o4uLx = i22;
                            Arrays.fill(iNrKfCE8Y.ShSN9wbzk, obj);
                            for (int i29 = i22; i29 < zJ8KC7OWm.kmSgne1rO; i29++) {
                                int i30 = zJ8KC7OWm.CBQ5d1kRq[i29];
                                View view2 = (View) constraintLayout.CBQ5d1kRq.get(i30);
                                if (view2 == null && (dIocxURUo = zJ8KC7OWm.dIocxURUo(constraintLayout, (str = (String) zJ8KC7OWm.qVUwofr5s.get(Integer.valueOf(i30))))) != 0) {
                                    zJ8KC7OWm.CBQ5d1kRq[i29] = dIocxURUo;
                                    zJ8KC7OWm.qVUwofr5s.put(Integer.valueOf(dIocxURUo), str);
                                    view2 = (View) constraintLayout.CBQ5d1kRq.get(dIocxURUo);
                                }
                                if (view2 != null) {
                                    ((INrKfCE8Y) zJ8KC7OWm.PSTqBLTET).zHl31GGXU(constraintLayout.yWvV4ePLl(view2));
                                }
                            }
                            Objects.requireNonNull(zJ8KC7OWm.PSTqBLTET);
                        }
                        i28++;
                        obj = null;
                        i22 = 0;
                    }
                }
                for (int i31 = 0; i31 < childCount3; i31++) {
                    constraintLayout.getChildAt(i31);
                }
                constraintLayout.iMyQMM6Qj.clear();
                constraintLayout.iMyQMM6Qj.put(0, constraintLayout.Bhmn1KIah);
                constraintLayout.iMyQMM6Qj.put(getId(), constraintLayout.Bhmn1KIah);
                for (int i32 = 0; i32 < childCount3; i32++) {
                    View childAt2 = constraintLayout.getChildAt(i32);
                    constraintLayout.iMyQMM6Qj.put(childAt2.getId(), constraintLayout.yWvV4ePLl(childAt2));
                }
                int i33 = 0;
                while (i33 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i33);
                    k007RzV1x yWvV4ePLl6 = constraintLayout.yWvV4ePLl(childAt3);
                    if (yWvV4ePLl6 == null) {
                        z3 = z;
                        i7 = childCount3;
                    } else {
                        RG2GI7LDp rG2GI7LDp15 = (RG2GI7LDp) childAt3.getLayoutParams();
                        S5aezmTgi s5aezmTgi = constraintLayout.Bhmn1KIah;
                        s5aezmTgi.ShSN9wbzk.add(yWvV4ePLl6);
                        k007RzV1x k007rzv1x5 = yWvV4ePLl6.ziwPzaoF3;
                        if (k007rzv1x5 != null) {
                            ((qYFy65iys) k007rzv1x5).ShSN9wbzk.remove(yWvV4ePLl6);
                            yWvV4ePLl6.qFBXIgpia();
                        }
                        yWvV4ePLl6.ziwPzaoF3 = s5aezmTgi;
                        SparseArray sparseArray = constraintLayout.iMyQMM6Qj;
                        k007RzV1x.RG2GI7LDp rG2GI7LDp16 = k007RzV1x.RG2GI7LDp.MATCH_PARENT;
                        k007RzV1x.RG2GI7LDp rG2GI7LDp17 = k007RzV1x.RG2GI7LDp.MATCH_CONSTRAINT;
                        h7j7Zcum2.RG2GI7LDp rG2GI7LDp18 = h7j7Zcum2.RG2GI7LDp.RIGHT;
                        h7j7Zcum2.RG2GI7LDp rG2GI7LDp19 = h7j7Zcum2.RG2GI7LDp.LEFT;
                        h7j7Zcum2.RG2GI7LDp rG2GI7LDp20 = h7j7Zcum2.RG2GI7LDp.BOTTOM;
                        i7 = childCount3;
                        h7j7Zcum2.RG2GI7LDp rG2GI7LDp21 = h7j7Zcum2.RG2GI7LDp.TOP;
                        rG2GI7LDp15.q3BipwRCk();
                        yWvV4ePLl6.Dr7UqlxEV = childAt3.getVisibility();
                        yWvV4ePLl6.ln3nf7LH3 = childAt3;
                        if (childAt3 instanceof ZJ8KC7OWm) {
                            boolean z4 = constraintLayout.Bhmn1KIah.vIbyhVf1d;
                            Barrier barrier = (Barrier) ((ZJ8KC7OWm) childAt3);
                            int i34 = barrier.Eeka1udhb;
                            barrier.dXrmkklc8 = i34;
                            z3 = z;
                            if (z4) {
                                if (i34 != 5) {
                                }
                                i21 = 1;
                                barrier.dXrmkklc8 = i21;
                                if (yWvV4ePLl6 instanceof gy98n89o5) {
                                    ((gy98n89o5) yWvV4ePLl6).Ta2zrwkcM = barrier.dXrmkklc8;
                                }
                            } else {
                                if (i34 != 5) {
                                }
                                i21 = 0;
                                barrier.dXrmkklc8 = i21;
                                if (yWvV4ePLl6 instanceof gy98n89o5) {
                                }
                            }
                        } else {
                            z3 = z;
                        }
                        if (rG2GI7LDp15.DuuXfa7LE) {
                            SlV7nGkeq slV7nGkeq = (SlV7nGkeq) yWvV4ePLl6;
                            int i35 = rG2GI7LDp15.R2hkbNqWf;
                            int i36 = rG2GI7LDp15.IG30YE5GU;
                            float f2 = rG2GI7LDp15.buPcffgdD;
                            int i37 = (f2 > -1.0f ? 1 : (f2 == -1.0f ? 0 : -1));
                            if (i37 != 0) {
                                if (i37 > 0) {
                                    slV7nGkeq.ShSN9wbzk = f2;
                                    slV7nGkeq.Ihm5o4uLx = -1;
                                    slV7nGkeq.Ta2zrwkcM = -1;
                                }
                            } else if (i35 != -1) {
                                if (i35 > -1) {
                                    slV7nGkeq.ShSN9wbzk = -1.0f;
                                    slV7nGkeq.Ihm5o4uLx = i35;
                                    slV7nGkeq.Ta2zrwkcM = -1;
                                }
                            } else if (i36 != -1 && i36 > -1) {
                                slV7nGkeq.ShSN9wbzk = -1.0f;
                                slV7nGkeq.Ihm5o4uLx = -1;
                                slV7nGkeq.Ta2zrwkcM = i36;
                            }
                        } else {
                            int i38 = rG2GI7LDp15.kktL0P5MG;
                            int i39 = rG2GI7LDp15.KBYw84i3W;
                            int i40 = rG2GI7LDp15.INnK5Rew6;
                            int i41 = rG2GI7LDp15.SuKhTJIQc;
                            int i42 = rG2GI7LDp15.ln3nf7LH3;
                            i6 = i33;
                            int i43 = rG2GI7LDp15.Dr7UqlxEV;
                            rG2GI7LDp6 = rG2GI7LDp13;
                            float f3 = rG2GI7LDp15.M66hQ219i;
                            rG2GI7LDp5 = rG2GI7LDp12;
                            int i44 = rG2GI7LDp15.PSTqBLTET;
                            z2 = isInEditMode;
                            if (i44 != -1) {
                                k007RzV1x k007rzv1x6 = (k007RzV1x) sparseArray.get(i44);
                                if (k007rzv1x6 != null) {
                                    float f4 = rG2GI7LDp15.ilHKhw3Yw;
                                    int i45 = rG2GI7LDp15.MzoOEjc4X;
                                    h7j7Zcum2.RG2GI7LDp rG2GI7LDp22 = h7j7Zcum2.RG2GI7LDp.CENTER;
                                    yWvV4ePLl6.yWvV4ePLl(rG2GI7LDp22).q3BipwRCk(k007rzv1x6.yWvV4ePLl(rG2GI7LDp22), i45, 0, true);
                                    yWvV4ePLl6.nlGCs0NZs = f4;
                                }
                                rG2GI7LDp9 = rG2GI7LDp20;
                                rG2GI7LDp8 = rG2GI7LDp19;
                                rG2GI7LDp7 = rG2GI7LDp18;
                                rG2GI7LDp10 = rG2GI7LDp15;
                                i8 = -1;
                            } else {
                                if (i38 != -1) {
                                    k007RzV1x k007rzv1x7 = (k007RzV1x) sparseArray.get(i38);
                                    if (k007rzv1x7 != null) {
                                        i20 = ((ViewGroup.MarginLayoutParams) rG2GI7LDp15).leftMargin;
                                        yWvV4ePLl3 = yWvV4ePLl6.yWvV4ePLl(rG2GI7LDp19);
                                        yWvV4ePLl4 = k007rzv1x7.yWvV4ePLl(rG2GI7LDp19);
                                        yWvV4ePLl3.q3BipwRCk(yWvV4ePLl4, i20, i42, true);
                                    }
                                    i10 = -1;
                                } else if (i39 != -1) {
                                    k007RzV1x k007rzv1x8 = (k007RzV1x) sparseArray.get(i39);
                                    if (k007rzv1x8 != null) {
                                        i20 = ((ViewGroup.MarginLayoutParams) rG2GI7LDp15).leftMargin;
                                        yWvV4ePLl3 = yWvV4ePLl6.yWvV4ePLl(rG2GI7LDp19);
                                        yWvV4ePLl4 = k007rzv1x8.yWvV4ePLl(rG2GI7LDp18);
                                        yWvV4ePLl3.q3BipwRCk(yWvV4ePLl4, i20, i42, true);
                                    }
                                    i10 = -1;
                                } else {
                                    i10 = -1;
                                }
                                if (i40 != i10) {
                                    k007RzV1x k007rzv1x9 = (k007RzV1x) sparseArray.get(i40);
                                    if (k007rzv1x9 != null) {
                                        i19 = ((ViewGroup.MarginLayoutParams) rG2GI7LDp15).rightMargin;
                                        h7j7zcum23 = yWvV4ePLl6.yWvV4ePLl(rG2GI7LDp18);
                                        h7j7zcum24 = k007rzv1x9.yWvV4ePLl(rG2GI7LDp19);
                                        h7j7zcum23.q3BipwRCk(h7j7zcum24, i19, i43, true);
                                    }
                                    i11 = rG2GI7LDp15.Puu3Rhg4F;
                                    if (i11 == -1) {
                                        k007RzV1x k007rzv1x10 = (k007RzV1x) sparseArray.get(i11);
                                        if (k007rzv1x10 != null) {
                                            i18 = ((ViewGroup.MarginLayoutParams) rG2GI7LDp15).topMargin;
                                            i17 = rG2GI7LDp15.sk5s77z6Q;
                                            h7j7zcum2 = yWvV4ePLl6.yWvV4ePLl(rG2GI7LDp21);
                                            h7j7zcum22 = k007rzv1x10.yWvV4ePLl(rG2GI7LDp21);
                                            h7j7zcum2.q3BipwRCk(h7j7zcum22, i18, i17, true);
                                        }
                                        i12 = rG2GI7LDp15.oon79WMrY;
                                        if (i12 == -1) {
                                            k007RzV1x k007rzv1x11 = (k007RzV1x) sparseArray.get(i12);
                                            if (k007rzv1x11 != null) {
                                                i15 = ((ViewGroup.MarginLayoutParams) rG2GI7LDp15).bottomMargin;
                                                i16 = rG2GI7LDp15.i8XZMQc6Z;
                                                yWvV4ePLl = yWvV4ePLl6.yWvV4ePLl(rG2GI7LDp20);
                                                yWvV4ePLl2 = k007rzv1x11.yWvV4ePLl(rG2GI7LDp21);
                                                yWvV4ePLl.q3BipwRCk(yWvV4ePLl2, i15, i16, true);
                                            }
                                            i13 = rG2GI7LDp15.CBQ5d1kRq;
                                            if (i13 == -1) {
                                                rG2GI7LDp11 = h7j7Zcum2.RG2GI7LDp.BASELINE;
                                                i14 = i13;
                                            } else {
                                                int i46 = rG2GI7LDp15.kmSgne1rO;
                                                if (i46 != -1) {
                                                    i14 = i46;
                                                    rG2GI7LDp11 = rG2GI7LDp21;
                                                } else {
                                                    int i47 = rG2GI7LDp15.Bhmn1KIah;
                                                    if (i47 != -1) {
                                                        i14 = i47;
                                                        rG2GI7LDp11 = rG2GI7LDp20;
                                                    } else {
                                                        rG2GI7LDp9 = rG2GI7LDp20;
                                                        rG2GI7LDp8 = rG2GI7LDp19;
                                                        rG2GI7LDp7 = rG2GI7LDp18;
                                                        i8 = -1;
                                                        rG2GI7LDp10 = rG2GI7LDp15;
                                                        if (f3 >= 0.0f) {
                                                            yWvV4ePLl6.INnK5Rew6 = f3;
                                                        }
                                                        f = rG2GI7LDp10.qFBXIgpia;
                                                        if (f >= 0.0f) {
                                                            yWvV4ePLl6.SuKhTJIQc = f;
                                                        }
                                                    }
                                                }
                                            }
                                            rG2GI7LDp9 = rG2GI7LDp20;
                                            rG2GI7LDp8 = rG2GI7LDp19;
                                            rG2GI7LDp7 = rG2GI7LDp18;
                                            i8 = -1;
                                            rG2GI7LDp10 = rG2GI7LDp15;
                                            Bhmn1KIah(yWvV4ePLl6, rG2GI7LDp15, sparseArray, i14, rG2GI7LDp11);
                                            if (f3 >= 0.0f) {
                                            }
                                            f = rG2GI7LDp10.qFBXIgpia;
                                            if (f >= 0.0f) {
                                            }
                                        } else {
                                            int i48 = rG2GI7LDp15.vPSbyrYWX;
                                            if (!(i48 == -1 || (k007rzv1x = (k007RzV1x) sparseArray.get(i48)) == null)) {
                                                i15 = ((ViewGroup.MarginLayoutParams) rG2GI7LDp15).bottomMargin;
                                                i16 = rG2GI7LDp15.i8XZMQc6Z;
                                                yWvV4ePLl = yWvV4ePLl6.yWvV4ePLl(rG2GI7LDp20);
                                                yWvV4ePLl2 = k007rzv1x.yWvV4ePLl(rG2GI7LDp20);
                                                yWvV4ePLl.q3BipwRCk(yWvV4ePLl2, i15, i16, true);
                                            }
                                            i13 = rG2GI7LDp15.CBQ5d1kRq;
                                            if (i13 == -1) {
                                            }
                                            rG2GI7LDp9 = rG2GI7LDp20;
                                            rG2GI7LDp8 = rG2GI7LDp19;
                                            rG2GI7LDp7 = rG2GI7LDp18;
                                            i8 = -1;
                                            rG2GI7LDp10 = rG2GI7LDp15;
                                            Bhmn1KIah(yWvV4ePLl6, rG2GI7LDp15, sparseArray, i14, rG2GI7LDp11);
                                            if (f3 >= 0.0f) {
                                            }
                                            f = rG2GI7LDp10.qFBXIgpia;
                                            if (f >= 0.0f) {
                                            }
                                        }
                                    } else {
                                        int i49 = rG2GI7LDp15.yWvV4ePLl;
                                        if (!(i49 == -1 || (k007rzv1x2 = (k007RzV1x) sparseArray.get(i49)) == null)) {
                                            i18 = ((ViewGroup.MarginLayoutParams) rG2GI7LDp15).topMargin;
                                            i17 = rG2GI7LDp15.sk5s77z6Q;
                                            h7j7zcum2 = yWvV4ePLl6.yWvV4ePLl(rG2GI7LDp21);
                                            h7j7zcum22 = k007rzv1x2.yWvV4ePLl(rG2GI7LDp20);
                                            h7j7zcum2.q3BipwRCk(h7j7zcum22, i18, i17, true);
                                        }
                                        i12 = rG2GI7LDp15.oon79WMrY;
                                        if (i12 == -1) {
                                        }
                                    }
                                } else {
                                    if (!(i41 == i10 || (k007rzv1x3 = (k007RzV1x) sparseArray.get(i41)) == null)) {
                                        i19 = ((ViewGroup.MarginLayoutParams) rG2GI7LDp15).rightMargin;
                                        h7j7zcum23 = yWvV4ePLl6.yWvV4ePLl(rG2GI7LDp18);
                                        h7j7zcum24 = k007rzv1x3.yWvV4ePLl(rG2GI7LDp18);
                                        h7j7zcum23.q3BipwRCk(h7j7zcum24, i19, i43, true);
                                    }
                                    i11 = rG2GI7LDp15.Puu3Rhg4F;
                                    if (i11 == -1) {
                                    }
                                }
                            }
                            if (z2 && !((i9 = rG2GI7LDp10.j22ftfeNI) == i8 && rG2GI7LDp10.QSbMsHU5X == i8)) {
                                int i50 = rG2GI7LDp10.QSbMsHU5X;
                                yWvV4ePLl6.BL4OzhZBd = i9;
                                yWvV4ePLl6.DuuXfa7LE = i50;
                            }
                            if (rG2GI7LDp10.n4UIOvAko) {
                                yWvV4ePLl6.zHl31GGXU[0] = rG2GI7LDp5;
                                yWvV4ePLl6.j22ftfeNI(((ViewGroup.MarginLayoutParams) rG2GI7LDp10).width);
                                if (((ViewGroup.MarginLayoutParams) rG2GI7LDp10).width == -2) {
                                    yWvV4ePLl6.zHl31GGXU[0] = rG2GI7LDp6;
                                }
                            } else if (((ViewGroup.MarginLayoutParams) rG2GI7LDp10).width == i8) {
                                if (rG2GI7LDp10.zHl31GGXU) {
                                    yWvV4ePLl6.zHl31GGXU[0] = rG2GI7LDp17;
                                } else {
                                    yWvV4ePLl6.zHl31GGXU[0] = rG2GI7LDp16;
                                }
                                yWvV4ePLl6.yWvV4ePLl(rG2GI7LDp8).GPLPRo6go = ((ViewGroup.MarginLayoutParams) rG2GI7LDp10).leftMargin;
                                yWvV4ePLl6.yWvV4ePLl(rG2GI7LDp7).GPLPRo6go = ((ViewGroup.MarginLayoutParams) rG2GI7LDp10).rightMargin;
                            } else {
                                yWvV4ePLl6.zHl31GGXU[0] = rG2GI7LDp17;
                                yWvV4ePLl6.j22ftfeNI(0);
                            }
                            if (rG2GI7LDp10.OpLJtmvFM) {
                                c = 1;
                                yWvV4ePLl6.zHl31GGXU[1] = rG2GI7LDp5;
                                yWvV4ePLl6.o4LF8RkoQ(((ViewGroup.MarginLayoutParams) rG2GI7LDp10).height);
                                if (((ViewGroup.MarginLayoutParams) rG2GI7LDp10).height == -2) {
                                    yWvV4ePLl6.zHl31GGXU[1] = rG2GI7LDp6;
                                }
                            } else if (((ViewGroup.MarginLayoutParams) rG2GI7LDp10).height == i8) {
                                if (rG2GI7LDp10.ziwPzaoF3) {
                                    c = 1;
                                    yWvV4ePLl6.zHl31GGXU[1] = rG2GI7LDp17;
                                } else {
                                    c = 1;
                                    yWvV4ePLl6.zHl31GGXU[1] = rG2GI7LDp16;
                                }
                                yWvV4ePLl6.yWvV4ePLl(rG2GI7LDp21).GPLPRo6go = ((ViewGroup.MarginLayoutParams) rG2GI7LDp10).topMargin;
                                yWvV4ePLl6.yWvV4ePLl(rG2GI7LDp9).GPLPRo6go = ((ViewGroup.MarginLayoutParams) rG2GI7LDp10).bottomMargin;
                            } else {
                                c = 1;
                                yWvV4ePLl6.zHl31GGXU[1] = rG2GI7LDp17;
                                yWvV4ePLl6.o4LF8RkoQ(0);
                            }
                            yWvV4ePLl6.NyWTwPF6V(rG2GI7LDp10.nlGCs0NZs);
                            float f5 = rG2GI7LDp10.AqaWJg0b4;
                            float[] fArr = yWvV4ePLl6.buPcffgdD;
                            fArr[0] = f5;
                            fArr[c] = rG2GI7LDp10.mUqPm6GBh;
                            yWvV4ePLl6.R2hkbNqWf = rG2GI7LDp10.NyWTwPF6V;
                            yWvV4ePLl6.IG30YE5GU = rG2GI7LDp10.vNtjxmzUM;
                            int i51 = rG2GI7LDp10.IzM1cD9ly;
                            if (i51 >= 0 && i51 <= 3) {
                                yWvV4ePLl6.Eeka1udhb = i51;
                            }
                            yWvV4ePLl6.QNqj6nIzv(rG2GI7LDp10.i0Zug1mVk, rG2GI7LDp10.V9LQMKGJe, rG2GI7LDp10.igRQEZxnW, rG2GI7LDp10.TyB1UUd72);
                            yWvV4ePLl6.juJ6pnCpu(rG2GI7LDp10.o4LF8RkoQ, rG2GI7LDp10.QNqj6nIzv, rG2GI7LDp10.EBQXiIPmm, rG2GI7LDp10.juJ6pnCpu);
                            i33 = i6 + 1;
                            constraintLayout = this;
                            childCount3 = i7;
                            z = z3;
                            rG2GI7LDp13 = rG2GI7LDp6;
                            rG2GI7LDp12 = rG2GI7LDp5;
                            isInEditMode = z2;
                        }
                    }
                    rG2GI7LDp5 = rG2GI7LDp12;
                    rG2GI7LDp6 = rG2GI7LDp13;
                    i6 = i33;
                    z2 = isInEditMode;
                    i33 = i6 + 1;
                    constraintLayout = this;
                    childCount3 = i7;
                    z = z3;
                    rG2GI7LDp13 = rG2GI7LDp6;
                    rG2GI7LDp12 = rG2GI7LDp5;
                    isInEditMode = z2;
                }
            }
            rG2GI7LDp = rG2GI7LDp12;
            rG2GI7LDp2 = rG2GI7LDp13;
            constraintLayout = this;
            if (z) {
                S5aezmTgi s5aezmTgi2 = constraintLayout.Bhmn1KIah;
                s5aezmTgi2.Ihm5o4uLx.tGV7Q6urW(s5aezmTgi2);
            }
        } else {
            rG2GI7LDp = rG2GI7LDp12;
            rG2GI7LDp2 = rG2GI7LDp13;
        }
        S5aezmTgi s5aezmTgi3 = constraintLayout.Bhmn1KIah;
        int i52 = constraintLayout.dXrmkklc8;
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size3 = View.MeasureSpec.getSize(i2);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i53 = max + max2;
        int paddingWidth = getPaddingWidth();
        mhl5lIdbQ mhl5lidbq = constraintLayout.cAwN510t2;
        mhl5lidbq.J4Ux7ym32 = max;
        mhl5lidbq.tGV7Q6urW = max2;
        mhl5lidbq.dIocxURUo = paddingWidth;
        mhl5lidbq.kCA6Zs9sL = i53;
        mhl5lidbq.iiGwOFFnr = i;
        mhl5lidbq.GPLPRo6go = i2;
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            max3 = Math.max(0, getPaddingLeft());
        } else if (vPSbyrYWX()) {
            i3 = max4;
            int i54 = size2 - paddingWidth;
            int i55 = size3 - i53;
            mhl5lIdbQ mhl5lidbq2 = constraintLayout.cAwN510t2;
            int i56 = mhl5lidbq2.kCA6Zs9sL;
            int i57 = mhl5lidbq2.dIocxURUo;
            int childCount4 = getChildCount();
            if (mode == Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode != 1073741824) {
                        rG2GI7LDp4 = rG2GI7LDp;
                    } else {
                        i4 = Math.min(constraintLayout.ilHKhw3Yw - i57, i54);
                        rG2GI7LDp3 = rG2GI7LDp;
                        if (mode2 != Integer.MIN_VALUE) {
                            if (mode2 != 0) {
                                if (mode2 != 1073741824) {
                                    rG2GI7LDp2 = rG2GI7LDp;
                                } else {
                                    i5 = Math.min(constraintLayout.qVUwofr5s - i56, i55);
                                    rG2GI7LDp2 = rG2GI7LDp;
                                }
                            }
                            i5 = 0;
                        } else {
                            if (childCount4 != 0) {
                                i5 = i55;
                            }
                            i5 = Math.max(0, constraintLayout.MzoOEjc4X);
                        }
                        if (i4 == s5aezmTgi3.dXrmkklc8() || i5 != s5aezmTgi3.CBQ5d1kRq()) {
                            s5aezmTgi3.Ta2zrwkcM.tGV7Q6urW = true;
                        }
                        s5aezmTgi3.BL4OzhZBd = 0;
                        s5aezmTgi3.DuuXfa7LE = 0;
                        int[] iArr = s5aezmTgi3.qFBXIgpia;
                        iArr[0] = constraintLayout.ilHKhw3Yw - i57;
                        iArr[1] = constraintLayout.qVUwofr5s - i56;
                        s5aezmTgi3.EBQXiIPmm(0);
                        s5aezmTgi3.igRQEZxnW(0);
                        s5aezmTgi3.zHl31GGXU[0] = rG2GI7LDp3;
                        s5aezmTgi3.j22ftfeNI(i4);
                        s5aezmTgi3.zHl31GGXU[1] = rG2GI7LDp2;
                        s5aezmTgi3.o4LF8RkoQ(i5);
                        s5aezmTgi3.EBQXiIPmm(constraintLayout.PSTqBLTET - i57);
                        s5aezmTgi3.igRQEZxnW(constraintLayout.MzoOEjc4X - i56);
                        s5aezmTgi3.kktL0P5MG(i52, mode, i54, mode2, i55, constraintLayout.i8XZMQc6Z, constraintLayout.dfpT1j18n, i3, max);
                        int dXrmkklc8 = constraintLayout.Bhmn1KIah.dXrmkklc8();
                        int CBQ5d1kRq = constraintLayout.Bhmn1KIah.CBQ5d1kRq();
                        S5aezmTgi s5aezmTgi4 = constraintLayout.Bhmn1KIah;
                        CBQ5d1kRq(i, i2, dXrmkklc8, CBQ5d1kRq, s5aezmTgi4.CMnfe2r2N, s5aezmTgi4.OuoYhTxyj);
                    }
                } else if (childCount4 != 0) {
                    rG2GI7LDp4 = rG2GI7LDp2;
                }
                rG2GI7LDp3 = rG2GI7LDp4;
                i4 = 0;
                if (mode2 != Integer.MIN_VALUE) {
                }
                if (i4 == s5aezmTgi3.dXrmkklc8()) {
                }
                s5aezmTgi3.Ta2zrwkcM.tGV7Q6urW = true;
                s5aezmTgi3.BL4OzhZBd = 0;
                s5aezmTgi3.DuuXfa7LE = 0;
                int[] iArr2 = s5aezmTgi3.qFBXIgpia;
                iArr2[0] = constraintLayout.ilHKhw3Yw - i57;
                iArr2[1] = constraintLayout.qVUwofr5s - i56;
                s5aezmTgi3.EBQXiIPmm(0);
                s5aezmTgi3.igRQEZxnW(0);
                s5aezmTgi3.zHl31GGXU[0] = rG2GI7LDp3;
                s5aezmTgi3.j22ftfeNI(i4);
                s5aezmTgi3.zHl31GGXU[1] = rG2GI7LDp2;
                s5aezmTgi3.o4LF8RkoQ(i5);
                s5aezmTgi3.EBQXiIPmm(constraintLayout.PSTqBLTET - i57);
                s5aezmTgi3.igRQEZxnW(constraintLayout.MzoOEjc4X - i56);
                s5aezmTgi3.kktL0P5MG(i52, mode, i54, mode2, i55, constraintLayout.i8XZMQc6Z, constraintLayout.dfpT1j18n, i3, max);
                int dXrmkklc82 = constraintLayout.Bhmn1KIah.dXrmkklc8();
                int CBQ5d1kRq2 = constraintLayout.Bhmn1KIah.CBQ5d1kRq();
                S5aezmTgi s5aezmTgi42 = constraintLayout.Bhmn1KIah;
                CBQ5d1kRq(i, i2, dXrmkklc82, CBQ5d1kRq2, s5aezmTgi42.CMnfe2r2N, s5aezmTgi42.OuoYhTxyj);
            } else if (childCount4 != 0) {
                i4 = i54;
                rG2GI7LDp3 = rG2GI7LDp2;
                if (mode2 != Integer.MIN_VALUE) {
                }
                if (i4 == s5aezmTgi3.dXrmkklc8()) {
                }
                s5aezmTgi3.Ta2zrwkcM.tGV7Q6urW = true;
                s5aezmTgi3.BL4OzhZBd = 0;
                s5aezmTgi3.DuuXfa7LE = 0;
                int[] iArr22 = s5aezmTgi3.qFBXIgpia;
                iArr22[0] = constraintLayout.ilHKhw3Yw - i57;
                iArr22[1] = constraintLayout.qVUwofr5s - i56;
                s5aezmTgi3.EBQXiIPmm(0);
                s5aezmTgi3.igRQEZxnW(0);
                s5aezmTgi3.zHl31GGXU[0] = rG2GI7LDp3;
                s5aezmTgi3.j22ftfeNI(i4);
                s5aezmTgi3.zHl31GGXU[1] = rG2GI7LDp2;
                s5aezmTgi3.o4LF8RkoQ(i5);
                s5aezmTgi3.EBQXiIPmm(constraintLayout.PSTqBLTET - i57);
                s5aezmTgi3.igRQEZxnW(constraintLayout.MzoOEjc4X - i56);
                s5aezmTgi3.kktL0P5MG(i52, mode, i54, mode2, i55, constraintLayout.i8XZMQc6Z, constraintLayout.dfpT1j18n, i3, max);
                int dXrmkklc822 = constraintLayout.Bhmn1KIah.dXrmkklc8();
                int CBQ5d1kRq22 = constraintLayout.Bhmn1KIah.CBQ5d1kRq();
                S5aezmTgi s5aezmTgi422 = constraintLayout.Bhmn1KIah;
                CBQ5d1kRq(i, i2, dXrmkklc822, CBQ5d1kRq22, s5aezmTgi422.CMnfe2r2N, s5aezmTgi422.OuoYhTxyj);
            }
            i4 = Math.max(0, constraintLayout.PSTqBLTET);
            rG2GI7LDp3 = rG2GI7LDp2;
            if (mode2 != Integer.MIN_VALUE) {
            }
            if (i4 == s5aezmTgi3.dXrmkklc8()) {
            }
            s5aezmTgi3.Ta2zrwkcM.tGV7Q6urW = true;
            s5aezmTgi3.BL4OzhZBd = 0;
            s5aezmTgi3.DuuXfa7LE = 0;
            int[] iArr222 = s5aezmTgi3.qFBXIgpia;
            iArr222[0] = constraintLayout.ilHKhw3Yw - i57;
            iArr222[1] = constraintLayout.qVUwofr5s - i56;
            s5aezmTgi3.EBQXiIPmm(0);
            s5aezmTgi3.igRQEZxnW(0);
            s5aezmTgi3.zHl31GGXU[0] = rG2GI7LDp3;
            s5aezmTgi3.j22ftfeNI(i4);
            s5aezmTgi3.zHl31GGXU[1] = rG2GI7LDp2;
            s5aezmTgi3.o4LF8RkoQ(i5);
            s5aezmTgi3.EBQXiIPmm(constraintLayout.PSTqBLTET - i57);
            s5aezmTgi3.igRQEZxnW(constraintLayout.MzoOEjc4X - i56);
            s5aezmTgi3.kktL0P5MG(i52, mode, i54, mode2, i55, constraintLayout.i8XZMQc6Z, constraintLayout.dfpT1j18n, i3, max);
            int dXrmkklc8222 = constraintLayout.Bhmn1KIah.dXrmkklc8();
            int CBQ5d1kRq222 = constraintLayout.Bhmn1KIah.CBQ5d1kRq();
            S5aezmTgi s5aezmTgi4222 = constraintLayout.Bhmn1KIah;
            CBQ5d1kRq(i, i2, dXrmkklc8222, CBQ5d1kRq222, s5aezmTgi4222.CMnfe2r2N, s5aezmTgi4222.OuoYhTxyj);
        }
        i3 = max3;
        int i542 = size2 - paddingWidth;
        int i552 = size3 - i53;
        mhl5lIdbQ mhl5lidbq22 = constraintLayout.cAwN510t2;
        int i562 = mhl5lidbq22.kCA6Zs9sL;
        int i572 = mhl5lidbq22.dIocxURUo;
        int childCount42 = getChildCount();
        if (mode == Integer.MIN_VALUE) {
        }
        i4 = Math.max(0, constraintLayout.PSTqBLTET);
        rG2GI7LDp3 = rG2GI7LDp2;
        if (mode2 != Integer.MIN_VALUE) {
        }
        if (i4 == s5aezmTgi3.dXrmkklc8()) {
        }
        s5aezmTgi3.Ta2zrwkcM.tGV7Q6urW = true;
        s5aezmTgi3.BL4OzhZBd = 0;
        s5aezmTgi3.DuuXfa7LE = 0;
        int[] iArr2222 = s5aezmTgi3.qFBXIgpia;
        iArr2222[0] = constraintLayout.ilHKhw3Yw - i572;
        iArr2222[1] = constraintLayout.qVUwofr5s - i562;
        s5aezmTgi3.EBQXiIPmm(0);
        s5aezmTgi3.igRQEZxnW(0);
        s5aezmTgi3.zHl31GGXU[0] = rG2GI7LDp3;
        s5aezmTgi3.j22ftfeNI(i4);
        s5aezmTgi3.zHl31GGXU[1] = rG2GI7LDp2;
        s5aezmTgi3.o4LF8RkoQ(i5);
        s5aezmTgi3.EBQXiIPmm(constraintLayout.PSTqBLTET - i572);
        s5aezmTgi3.igRQEZxnW(constraintLayout.MzoOEjc4X - i562);
        s5aezmTgi3.kktL0P5MG(i52, mode, i542, mode2, i552, constraintLayout.i8XZMQc6Z, constraintLayout.dfpT1j18n, i3, max);
        int dXrmkklc82222 = constraintLayout.Bhmn1KIah.dXrmkklc8();
        int CBQ5d1kRq2222 = constraintLayout.Bhmn1KIah.CBQ5d1kRq();
        S5aezmTgi s5aezmTgi42222 = constraintLayout.Bhmn1KIah;
        CBQ5d1kRq(i, i2, dXrmkklc82222, CBQ5d1kRq2222, s5aezmTgi42222.CMnfe2r2N, s5aezmTgi42222.OuoYhTxyj);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        k007RzV1x yWvV4ePLl = yWvV4ePLl(view);
        if ((view instanceof Guideline) && !(yWvV4ePLl instanceof SlV7nGkeq)) {
            RG2GI7LDp rG2GI7LDp = (RG2GI7LDp) view.getLayoutParams();
            SlV7nGkeq slV7nGkeq = new SlV7nGkeq();
            rG2GI7LDp.KlYagMRWx = slV7nGkeq;
            rG2GI7LDp.DuuXfa7LE = true;
            slV7nGkeq.ziwPzaoF3(rG2GI7LDp.L4EwGfXiQ);
        }
        if (view instanceof ZJ8KC7OWm) {
            ZJ8KC7OWm zJ8KC7OWm = (ZJ8KC7OWm) view;
            zJ8KC7OWm.iiGwOFFnr();
            ((RG2GI7LDp) view.getLayoutParams()).XYT7vJqNO = true;
            if (!this.kmSgne1rO.contains(zJ8KC7OWm)) {
                this.kmSgne1rO.add(zJ8KC7OWm);
            }
        }
        this.CBQ5d1kRq.put(view.getId(), view);
        this.Eeka1udhb = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.CBQ5d1kRq.remove(view.getId());
        k007RzV1x yWvV4ePLl = yWvV4ePLl(view);
        this.Bhmn1KIah.ShSN9wbzk.remove(yWvV4ePLl);
        yWvV4ePLl.qFBXIgpia();
        this.kmSgne1rO.remove(view);
        this.Eeka1udhb = true;
    }

    public final void oon79WMrY(AttributeSet attributeSet, int i, int i2) {
        S5aezmTgi s5aezmTgi = this.Bhmn1KIah;
        s5aezmTgi.ln3nf7LH3 = this;
        mhl5lIdbQ mhl5lidbq = this.cAwN510t2;
        s5aezmTgi.a8N8UmDyD = mhl5lidbq;
        s5aezmTgi.Ta2zrwkcM.iiGwOFFnr = mhl5lidbq;
        this.CBQ5d1kRq.put(getId(), this);
        this.RG6kpfv3v = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, EssXmp5ks.J4Ux7ym32, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.PSTqBLTET = obtainStyledAttributes.getDimensionPixelOffset(index, this.PSTqBLTET);
                } else if (index == 17) {
                    this.MzoOEjc4X = obtainStyledAttributes.getDimensionPixelOffset(index, this.MzoOEjc4X);
                } else if (index == 14) {
                    this.ilHKhw3Yw = obtainStyledAttributes.getDimensionPixelOffset(index, this.ilHKhw3Yw);
                } else if (index == 15) {
                    this.qVUwofr5s = obtainStyledAttributes.getDimensionPixelOffset(index, this.qVUwofr5s);
                } else if (index == 112) {
                    this.dXrmkklc8 = obtainStyledAttributes.getInt(index, this.dXrmkklc8);
                } else if (index == 55) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.ixWaw2akD = new c0dtGNCXO(getContext(), this, resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.ixWaw2akD = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        RG2GI7LDp rG2GI7LDp = new RG2GI7LDp();
                        this.RG6kpfv3v = rG2GI7LDp;
                        rG2GI7LDp.kCA6Zs9sL(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.RG6kpfv3v = null;
                    }
                    this.sk5s77z6Q = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.Bhmn1KIah.SuKhTJIQc(this.dXrmkklc8);
    }

    @Override // android.view.ViewParent, android.view.View
    public void requestLayout() {
        this.Eeka1udhb = true;
        this.i8XZMQc6Z = -1;
        this.dfpT1j18n = -1;
        super.requestLayout();
    }

    public void setConstraintSet(RG2GI7LDp rG2GI7LDp) {
        this.RG6kpfv3v = rG2GI7LDp;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.CBQ5d1kRq.remove(getId());
        super.setId(i);
        this.CBQ5d1kRq.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.qVUwofr5s) {
            this.qVUwofr5s = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.ilHKhw3Yw) {
            this.ilHKhw3Yw = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.MzoOEjc4X) {
            this.MzoOEjc4X = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.PSTqBLTET) {
            this.PSTqBLTET = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(OYW1jCTK3 oYW1jCTK3) {
        c0dtGNCXO c0dtgncxo = this.ixWaw2akD;
        if (c0dtgncxo != null) {
            Objects.requireNonNull(c0dtgncxo);
        }
    }

    public void setOptimizationLevel(int i) {
        this.dXrmkklc8 = i;
        S5aezmTgi s5aezmTgi = this.Bhmn1KIah;
        s5aezmTgi.ifDs8fRNm = i;
        WLlBJNJ2W.MzoOEjc4X = s5aezmTgi.INnK5Rew6(512);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean vPSbyrYWX() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public final k007RzV1x yWvV4ePLl(View view) {
        if (view == this) {
            return this.Bhmn1KIah;
        }
        if (view == null) {
            return null;
        }
        if (!(view.getLayoutParams() instanceof RG2GI7LDp)) {
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (!(view.getLayoutParams() instanceof RG2GI7LDp)) {
                return null;
            }
        }
        return ((RG2GI7LDp) view.getLayoutParams()).KlYagMRWx;
    }
}
