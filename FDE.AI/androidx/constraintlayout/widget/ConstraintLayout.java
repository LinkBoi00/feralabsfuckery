package androidx.constraintlayout.widget;

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
import con.OYW1jCTK3;
import con.S5aezmTgi;
import con.SlV7nGkeq;
import con.WLlBJNJ2W;
import con.ZJ8KC7OWm;
import con.c0dtGNCXO;
import con.h7j7Zcum2;
import con.jK3ds2GCn;
import con.k007RzV1x;
import con.oi8NqG12l;
import con.q432S6v9T;
import java.util.ArrayList;
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
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump */
        public void resolveLayoutDirection(int r11) {
            /*
            // Method dump skipped, instructions count: 255
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.RG2GI7LDp.resolveLayoutDirection(int):void");
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
        @android.annotation.SuppressLint({"WrongCall"})
        /* Code decompiled incorrectly, please refer to instructions dump */
        public final void J4Ux7ym32(con.k007RzV1x r18, con.sArOew9FC r19) {
            /*
            // Method dump skipped, instructions count: 712
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mhl5lIdbQ.J4Ux7ym32(con.k007RzV1x, con.sArOew9FC):void");
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
    public void onMeasure(int r34, int r35) {
        /*
        // Method dump skipped, instructions count: 1516
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
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
