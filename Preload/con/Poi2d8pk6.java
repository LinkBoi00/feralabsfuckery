package con;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.widget.EdgeEffect;
import java.util.List;
/* loaded from: classes.dex */
public final class Poi2d8pk6 implements ypLiboX2O {
    public final RNEcgN6dQ CBQ5d1kRq;
    public final EdgeEffect GPLPRo6go;
    public final EdgeEffect J4Ux7ym32;
    public final EdgeEffect Puu3Rhg4F;
    public final EdgeEffect dIocxURUo;
    public final List iiGwOFFnr;
    public final EdgeEffect kCA6Zs9sL;
    public final RNEcgN6dQ kmSgne1rO;
    public final EdgeEffect oon79WMrY;
    public final AmtOCvNhs q3BipwRCk;
    public final EdgeEffect tGV7Q6urW;
    public final RNEcgN6dQ vPSbyrYWX;
    public final EdgeEffect yWvV4ePLl;

    public Poi2d8pk6(Context context, AmtOCvNhs amtOCvNhs) {
        this.q3BipwRCk = amtOCvNhs;
        EdgeEffect q3BipwRCk = dUHWk3ytt.q3BipwRCk(context, null);
        this.J4Ux7ym32 = q3BipwRCk;
        EdgeEffect q3BipwRCk2 = dUHWk3ytt.q3BipwRCk(context, null);
        this.tGV7Q6urW = q3BipwRCk2;
        EdgeEffect q3BipwRCk3 = dUHWk3ytt.q3BipwRCk(context, null);
        this.dIocxURUo = q3BipwRCk3;
        EdgeEffect q3BipwRCk4 = dUHWk3ytt.q3BipwRCk(context, null);
        this.kCA6Zs9sL = q3BipwRCk4;
        List ixWaw2akD = idpM54xlp.ixWaw2akD(q3BipwRCk3, q3BipwRCk, q3BipwRCk4, q3BipwRCk2);
        this.iiGwOFFnr = ixWaw2akD;
        this.GPLPRo6go = dUHWk3ytt.q3BipwRCk(context, null);
        this.Puu3Rhg4F = dUHWk3ytt.q3BipwRCk(context, null);
        this.yWvV4ePLl = dUHWk3ytt.q3BipwRCk(context, null);
        this.oon79WMrY = dUHWk3ytt.q3BipwRCk(context, null);
        int size = ixWaw2akD.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                ((EdgeEffect) ixWaw2akD.get(i)).setColor(xpuSUT7Gh.R2hkbNqWf(this.q3BipwRCk.q3BipwRCk));
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        this.vPSbyrYWX = u51fgFYkV.dIocxURUo(0, null, 2, null);
        ksLrMHgEz kslrmhgez = tbzY8QG6X.J4Ux7ym32;
        this.CBQ5d1kRq = u51fgFYkV.dIocxURUo(new tbzY8QG6X(tbzY8QG6X.tGV7Q6urW), null, 2, null);
        this.kmSgne1rO = u51fgFYkV.dIocxURUo(Boolean.FALSE, null, 2, null);
    }

    public final boolean Bhmn1KIah() {
        return !this.q3BipwRCk.J4Ux7ym32 && !((Boolean) ((prCJwNx2x) this.kmSgne1rO).getValue()).booleanValue();
    }

    public final boolean CBQ5d1kRq(wvIIkk6mx wviikk6mx, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.translate(0.0f, wviikk6mx.MzoOEjc4X(this.q3BipwRCk.tGV7Q6urW.J4Ux7ym32));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final float Eeka1udhb(long j, long j2) {
        float tGV7Q6urW = bRgfgYIQX.tGV7Q6urW(j2) / tbzY8QG6X.kCA6Zs9sL(kmSgne1rO());
        float dIocxURUo = bRgfgYIQX.dIocxURUo(j) / tbzY8QG6X.tGV7Q6urW(kmSgne1rO());
        EdgeEffect edgeEffect = this.J4Ux7ym32;
        if (Build.VERSION.SDK_INT >= 31) {
            dIocxURUo = kzRylvL0f.q3BipwRCk.tGV7Q6urW(edgeEffect, dIocxURUo, tGV7Q6urW);
        } else {
            edgeEffect.onPull(dIocxURUo, tGV7Q6urW);
        }
        return tbzY8QG6X.tGV7Q6urW(kmSgne1rO()) * dIocxURUo;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    @Override // con.ypLiboX2O
    /* Code decompiled incorrectly, please refer to instructions dump */
    public long GPLPRo6go(long j, bRgfgYIQX brgfgyiqx, int i) {
        long j2;
        float f;
        long dIocxURUo;
        EdgeEffect edgeEffect;
        float f2;
        EdgeEffect edgeEffect2;
        if (!Bhmn1KIah()) {
            ksLrMHgEz kslrmhgez = tcSzM3TgQ.q3BipwRCk;
            ksLrMHgEz kslrmhgez2 = tcSzM3TgQ.q3BipwRCk;
            boolean z = false;
            if (i == 1) {
                if (brgfgyiqx == null) {
                    j2 = gThLCaTO1.Bhmn1KIah(kmSgne1rO());
                } else {
                    j2 = brgfgyiqx.q3BipwRCk;
                }
                float f3 = 0.0f;
                if (!(bRgfgYIQX.dIocxURUo(j) == 0.0f)) {
                    EdgeEffect edgeEffect3 = this.J4Ux7ym32;
                    int i2 = Build.VERSION.SDK_INT;
                    if (!((i2 >= 31 ? kzRylvL0f.q3BipwRCk.J4Ux7ym32(edgeEffect3) : 0.0f) == 0.0f)) {
                        f = Eeka1udhb(j, j2);
                        if ((i2 >= 31 ? kzRylvL0f.q3BipwRCk.J4Ux7ym32(this.J4Ux7ym32) : 0.0f) == 0.0f) {
                            edgeEffect2 = this.J4Ux7ym32;
                            edgeEffect2.onRelease();
                        }
                        if (!(bRgfgYIQX.tGV7Q6urW(j) == 0.0f)) {
                            EdgeEffect edgeEffect4 = this.dIocxURUo;
                            int i3 = Build.VERSION.SDK_INT;
                            if (!((i3 >= 31 ? kzRylvL0f.q3BipwRCk.J4Ux7ym32(edgeEffect4) : 0.0f) == 0.0f)) {
                                f2 = ilHKhw3Yw(j, j2);
                                if ((i3 >= 31 ? kzRylvL0f.q3BipwRCk.J4Ux7ym32(this.dIocxURUo) : 0.0f) == 0.0f) {
                                    z = true;
                                }
                                if (z) {
                                    edgeEffect = this.dIocxURUo;
                                    edgeEffect.onRelease();
                                }
                                f3 = f2;
                            } else {
                                if (!((i3 >= 31 ? kzRylvL0f.q3BipwRCk.J4Ux7ym32(this.kCA6Zs9sL) : 0.0f) == 0.0f)) {
                                    f2 = qVUwofr5s(j, j2);
                                    if ((i3 >= 31 ? kzRylvL0f.q3BipwRCk.J4Ux7ym32(this.kCA6Zs9sL) : 0.0f) == 0.0f) {
                                        z = true;
                                    }
                                    if (z) {
                                        edgeEffect = this.kCA6Zs9sL;
                                        edgeEffect.onRelease();
                                    }
                                    f3 = f2;
                                }
                            }
                        }
                        dIocxURUo = ODug2UCW1.dIocxURUo(f3, f);
                        JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
                        if (!bRgfgYIQX.q3BipwRCk(dIocxURUo, bRgfgYIQX.tGV7Q6urW)) {
                            PSTqBLTET();
                        }
                        return dIocxURUo;
                    }
                    if (!((i2 >= 31 ? kzRylvL0f.q3BipwRCk.J4Ux7ym32(this.tGV7Q6urW) : 0.0f) == 0.0f)) {
                        f = MzoOEjc4X(j, j2);
                        if ((i2 >= 31 ? kzRylvL0f.q3BipwRCk.J4Ux7ym32(this.tGV7Q6urW) : 0.0f) == 0.0f) {
                            edgeEffect2 = this.tGV7Q6urW;
                            edgeEffect2.onRelease();
                        }
                        if (!(bRgfgYIQX.tGV7Q6urW(j) == 0.0f)) {
                        }
                        dIocxURUo = ODug2UCW1.dIocxURUo(f3, f);
                        JhpbRXxsg jhpbRXxsg2 = bRgfgYIQX.J4Ux7ym32;
                        if (!bRgfgYIQX.q3BipwRCk(dIocxURUo, bRgfgYIQX.tGV7Q6urW)) {
                        }
                        return dIocxURUo;
                    }
                }
                f = 0.0f;
                if (!(bRgfgYIQX.tGV7Q6urW(j) == 0.0f)) {
                }
                dIocxURUo = ODug2UCW1.dIocxURUo(f3, f);
                JhpbRXxsg jhpbRXxsg22 = bRgfgYIQX.J4Ux7ym32;
                if (!bRgfgYIQX.q3BipwRCk(dIocxURUo, bRgfgYIQX.tGV7Q6urW)) {
                }
                return dIocxURUo;
            }
        }
        JhpbRXxsg jhpbRXxsg3 = bRgfgYIQX.J4Ux7ym32;
        return bRgfgYIQX.tGV7Q6urW;
    }

    @Override // con.ypLiboX2O
    public void J4Ux7ym32() {
        if (!Bhmn1KIah()) {
            List list = this.iiGwOFFnr;
            int size = list.size() - 1;
            boolean z = false;
            if (size >= 0) {
                int i = 0;
                boolean z2 = false;
                while (true) {
                    int i2 = i + 1;
                    EdgeEffect edgeEffect = (EdgeEffect) list.get(i);
                    edgeEffect.onRelease();
                    z2 = edgeEffect.isFinished() || z2;
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                }
                z = z2;
            }
            if (z) {
                PSTqBLTET();
            }
        }
    }

    public final float MzoOEjc4X(long j, long j2) {
        float tGV7Q6urW = bRgfgYIQX.tGV7Q6urW(j2) / tbzY8QG6X.kCA6Zs9sL(kmSgne1rO());
        float dIocxURUo = bRgfgYIQX.dIocxURUo(j) / tbzY8QG6X.tGV7Q6urW(kmSgne1rO());
        EdgeEffect edgeEffect = this.tGV7Q6urW;
        float f = -dIocxURUo;
        float f2 = ((float) 1) - tGV7Q6urW;
        if (Build.VERSION.SDK_INT >= 31) {
            f = kzRylvL0f.q3BipwRCk.tGV7Q6urW(edgeEffect, f, f2);
        } else {
            edgeEffect.onPull(f, f2);
        }
        return tbzY8QG6X.tGV7Q6urW(kmSgne1rO()) * (-f);
    }

    public final void PSTqBLTET() {
        prCJwNx2x prcjwnx2x = (prCJwNx2x) this.vPSbyrYWX;
        prcjwnx2x.CBQ5d1kRq(Integer.valueOf(((Number) prcjwnx2x.getValue()).intValue() + 1));
    }

    @Override // con.ypLiboX2O
    public void Puu3Rhg4F(wvIIkk6mx wviikk6mx) {
        boolean z;
        SI0VpKubr q3BipwRCk = ((HXRw132ar) wviikk6mx).CBQ5d1kRq.kmSgne1rO.q3BipwRCk();
        ((prCJwNx2x) this.vPSbyrYWX).getValue();
        if (!Bhmn1KIah()) {
            Canvas canvas = RvtysjeZn.q3BipwRCk;
            Canvas canvas2 = ((YSo0hTREC) q3BipwRCk).q3BipwRCk;
            boolean z2 = true;
            if (!(dUHWk3ytt.J4Ux7ym32(this.yWvV4ePLl) == 0.0f)) {
                vPSbyrYWX(wviikk6mx, this.yWvV4ePLl, canvas2);
                this.yWvV4ePLl.finish();
            }
            if (!this.dIocxURUo.isFinished()) {
                z = oon79WMrY(wviikk6mx, this.dIocxURUo, canvas2);
                dUHWk3ytt.tGV7Q6urW(this.yWvV4ePLl, dUHWk3ytt.J4Ux7ym32(this.dIocxURUo), 0.0f);
            } else {
                z = false;
            }
            if (!(dUHWk3ytt.J4Ux7ym32(this.GPLPRo6go) == 0.0f)) {
                yWvV4ePLl(wviikk6mx, this.GPLPRo6go, canvas2);
                this.GPLPRo6go.finish();
            }
            if (!this.J4Ux7ym32.isFinished()) {
                z = CBQ5d1kRq(wviikk6mx, this.J4Ux7ym32, canvas2) || z;
                dUHWk3ytt.tGV7Q6urW(this.GPLPRo6go, dUHWk3ytt.J4Ux7ym32(this.J4Ux7ym32), 0.0f);
            }
            if (!(dUHWk3ytt.J4Ux7ym32(this.oon79WMrY) == 0.0f)) {
                oon79WMrY(wviikk6mx, this.oon79WMrY, canvas2);
                this.oon79WMrY.finish();
            }
            if (!this.kCA6Zs9sL.isFinished()) {
                z = vPSbyrYWX(wviikk6mx, this.kCA6Zs9sL, canvas2) || z;
                dUHWk3ytt.tGV7Q6urW(this.oon79WMrY, dUHWk3ytt.J4Ux7ym32(this.kCA6Zs9sL), 0.0f);
            }
            if (!(dUHWk3ytt.J4Ux7ym32(this.Puu3Rhg4F) == 0.0f)) {
                CBQ5d1kRq(wviikk6mx, this.Puu3Rhg4F, canvas2);
                this.Puu3Rhg4F.finish();
            }
            if (!this.tGV7Q6urW.isFinished()) {
                if (!yWvV4ePLl(wviikk6mx, this.tGV7Q6urW, canvas2) && !z) {
                    z2 = false;
                }
                dUHWk3ytt.tGV7Q6urW(this.Puu3Rhg4F, dUHWk3ytt.J4Ux7ym32(this.tGV7Q6urW), 0.0f);
                z = z2;
            }
            if (z) {
                PSTqBLTET();
            }
        }
    }

    @Override // con.ypLiboX2O
    public void dIocxURUo(long j, boolean z) {
        boolean z2 = true;
        boolean z3 = !tbzY8QG6X.J4Ux7ym32(j, kmSgne1rO());
        if (((Boolean) ((prCJwNx2x) this.kmSgne1rO).getValue()).booleanValue() == z) {
            z2 = false;
        }
        ((prCJwNx2x) this.CBQ5d1kRq).CBQ5d1kRq(new tbzY8QG6X(j));
        ((prCJwNx2x) this.kmSgne1rO).CBQ5d1kRq(Boolean.valueOf(z));
        if (z3) {
            this.J4Ux7ym32.setSize(D3DEikrvb.Eeka1udhb(tbzY8QG6X.kCA6Zs9sL(j)), D3DEikrvb.Eeka1udhb(tbzY8QG6X.tGV7Q6urW(j)));
            this.tGV7Q6urW.setSize(D3DEikrvb.Eeka1udhb(tbzY8QG6X.kCA6Zs9sL(j)), D3DEikrvb.Eeka1udhb(tbzY8QG6X.tGV7Q6urW(j)));
            this.dIocxURUo.setSize(D3DEikrvb.Eeka1udhb(tbzY8QG6X.tGV7Q6urW(j)), D3DEikrvb.Eeka1udhb(tbzY8QG6X.kCA6Zs9sL(j)));
            this.kCA6Zs9sL.setSize(D3DEikrvb.Eeka1udhb(tbzY8QG6X.tGV7Q6urW(j)), D3DEikrvb.Eeka1udhb(tbzY8QG6X.kCA6Zs9sL(j)));
            this.GPLPRo6go.setSize(D3DEikrvb.Eeka1udhb(tbzY8QG6X.kCA6Zs9sL(j)), D3DEikrvb.Eeka1udhb(tbzY8QG6X.tGV7Q6urW(j)));
            this.Puu3Rhg4F.setSize(D3DEikrvb.Eeka1udhb(tbzY8QG6X.kCA6Zs9sL(j)), D3DEikrvb.Eeka1udhb(tbzY8QG6X.tGV7Q6urW(j)));
            this.yWvV4ePLl.setSize(D3DEikrvb.Eeka1udhb(tbzY8QG6X.tGV7Q6urW(j)), D3DEikrvb.Eeka1udhb(tbzY8QG6X.kCA6Zs9sL(j)));
            this.oon79WMrY.setSize(D3DEikrvb.Eeka1udhb(tbzY8QG6X.tGV7Q6urW(j)), D3DEikrvb.Eeka1udhb(tbzY8QG6X.kCA6Zs9sL(j)));
        }
        if (z2 || z3) {
            J4Ux7ym32();
        }
    }

    @Override // con.ypLiboX2O
    public boolean iiGwOFFnr() {
        boolean z;
        long Bhmn1KIah = gThLCaTO1.Bhmn1KIah(kmSgne1rO());
        boolean z2 = false;
        if (!((Build.VERSION.SDK_INT >= 31 ? kzRylvL0f.q3BipwRCk.J4Ux7ym32(this.dIocxURUo) : 0.0f) == 0.0f)) {
            JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
            ilHKhw3Yw(bRgfgYIQX.tGV7Q6urW, Bhmn1KIah);
            z = true;
        } else {
            z = false;
        }
        if (!((Build.VERSION.SDK_INT >= 31 ? kzRylvL0f.q3BipwRCk.J4Ux7ym32(this.kCA6Zs9sL) : 0.0f) == 0.0f)) {
            JhpbRXxsg jhpbRXxsg2 = bRgfgYIQX.J4Ux7ym32;
            qVUwofr5s(bRgfgYIQX.tGV7Q6urW, Bhmn1KIah);
            z = true;
        }
        if (!((Build.VERSION.SDK_INT >= 31 ? kzRylvL0f.q3BipwRCk.J4Ux7ym32(this.J4Ux7ym32) : 0.0f) == 0.0f)) {
            JhpbRXxsg jhpbRXxsg3 = bRgfgYIQX.J4Ux7ym32;
            Eeka1udhb(bRgfgYIQX.tGV7Q6urW, Bhmn1KIah);
            z = true;
        }
        if ((Build.VERSION.SDK_INT >= 31 ? kzRylvL0f.q3BipwRCk.J4Ux7ym32(this.tGV7Q6urW) : 0.0f) == 0.0f) {
            z2 = true;
        }
        if (z2) {
            return z;
        }
        JhpbRXxsg jhpbRXxsg4 = bRgfgYIQX.J4Ux7ym32;
        MzoOEjc4X(bRgfgYIQX.tGV7Q6urW, Bhmn1KIah);
        return true;
    }

    public final float ilHKhw3Yw(long j, long j2) {
        float dIocxURUo = bRgfgYIQX.dIocxURUo(j2) / tbzY8QG6X.tGV7Q6urW(kmSgne1rO());
        float tGV7Q6urW = bRgfgYIQX.tGV7Q6urW(j) / tbzY8QG6X.kCA6Zs9sL(kmSgne1rO());
        EdgeEffect edgeEffect = this.dIocxURUo;
        float f = ((float) 1) - dIocxURUo;
        if (Build.VERSION.SDK_INT >= 31) {
            tGV7Q6urW = kzRylvL0f.q3BipwRCk.tGV7Q6urW(edgeEffect, tGV7Q6urW, f);
        } else {
            edgeEffect.onPull(tGV7Q6urW, f);
        }
        return tbzY8QG6X.kCA6Zs9sL(kmSgne1rO()) * tGV7Q6urW;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    @Override // con.ypLiboX2O
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void kCA6Zs9sL(long j, long j2, bRgfgYIQX brgfgyiqx, int i) {
        boolean z;
        boolean z2;
        long j3;
        if (!Bhmn1KIah()) {
            ksLrMHgEz kslrmhgez = tcSzM3TgQ.q3BipwRCk;
            ksLrMHgEz kslrmhgez2 = tcSzM3TgQ.q3BipwRCk;
            boolean z3 = true;
            if (i == 1) {
                if (brgfgyiqx == null) {
                    j3 = gThLCaTO1.Bhmn1KIah(kmSgne1rO());
                } else {
                    j3 = brgfgyiqx.q3BipwRCk;
                }
                if (bRgfgYIQX.tGV7Q6urW(j2) > 0.0f) {
                    ilHKhw3Yw(j2, j3);
                } else if (bRgfgYIQX.tGV7Q6urW(j2) < 0.0f) {
                    qVUwofr5s(j2, j3);
                }
                if (bRgfgYIQX.dIocxURUo(j2) > 0.0f) {
                    Eeka1udhb(j2, j3);
                } else if (bRgfgYIQX.dIocxURUo(j2) < 0.0f) {
                    MzoOEjc4X(j2, j3);
                }
                JhpbRXxsg jhpbRXxsg = bRgfgYIQX.J4Ux7ym32;
                if (!bRgfgYIQX.q3BipwRCk(j2, bRgfgYIQX.tGV7Q6urW)) {
                    z = true;
                    if (!this.dIocxURUo.isFinished() || bRgfgYIQX.tGV7Q6urW(j) >= 0.0f) {
                        z2 = false;
                    } else {
                        this.dIocxURUo.onRelease();
                        z2 = this.dIocxURUo.isFinished();
                    }
                    if (!this.kCA6Zs9sL.isFinished() && bRgfgYIQX.tGV7Q6urW(j) > 0.0f) {
                        this.kCA6Zs9sL.onRelease();
                        z2 = !z2 || this.kCA6Zs9sL.isFinished();
                    }
                    if (!this.J4Ux7ym32.isFinished() && bRgfgYIQX.dIocxURUo(j) < 0.0f) {
                        this.J4Ux7ym32.onRelease();
                        z2 = !z2 || this.J4Ux7ym32.isFinished();
                    }
                    if (!this.tGV7Q6urW.isFinished() && bRgfgYIQX.dIocxURUo(j) > 0.0f) {
                        this.tGV7Q6urW.onRelease();
                        z2 = !z2 || this.tGV7Q6urW.isFinished();
                    }
                    if (!z2 && !z) {
                        z3 = false;
                    }
                    if (!z3) {
                        PSTqBLTET();
                        return;
                    }
                    return;
                }
            }
            z = false;
            if (!this.dIocxURUo.isFinished()) {
            }
            z2 = false;
            if (!this.kCA6Zs9sL.isFinished()) {
                this.kCA6Zs9sL.onRelease();
                if (!z2) {
                }
            }
            if (!this.J4Ux7ym32.isFinished()) {
                this.J4Ux7ym32.onRelease();
                if (!z2) {
                }
            }
            if (!this.tGV7Q6urW.isFinished()) {
                this.tGV7Q6urW.onRelease();
                if (!z2) {
                }
            }
            if (!z2) {
                z3 = false;
            }
            if (!z3) {
            }
        }
    }

    public final long kmSgne1rO() {
        return ((tbzY8QG6X) this.CBQ5d1kRq.getValue()).q3BipwRCk;
    }

    public final boolean oon79WMrY(wvIIkk6mx wviikk6mx, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-tbzY8QG6X.tGV7Q6urW(kmSgne1rO()), wviikk6mx.MzoOEjc4X(this.q3BipwRCk.tGV7Q6urW.q3BipwRCk(wviikk6mx.getLayoutDirection())));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r0.isFinished() != false) goto L_0x0046;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
        if (r0.isFinished() != false) goto L_0x0046;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
        if (r0.isFinished() != false) goto L_0x0085;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0083, code lost:
        if (r0.isFinished() != false) goto L_0x0085;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    @Override // con.ypLiboX2O
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void q3BipwRCk(long j) {
        int i;
        EdgeEffect edgeEffect;
        int i2;
        EdgeEffect edgeEffect2;
        if (!Bhmn1KIah()) {
            if (yqaDqocAW.J4Ux7ym32(j) > 0.0f) {
                edgeEffect2 = this.dIocxURUo;
                i2 = D3DEikrvb.Eeka1udhb(yqaDqocAW.J4Ux7ym32(j));
                if (Build.VERSION.SDK_INT < 31) {
                }
                edgeEffect2.onAbsorb(i2);
                if (yqaDqocAW.tGV7Q6urW(j) <= 0.0f) {
                    edgeEffect = this.J4Ux7ym32;
                    i = D3DEikrvb.Eeka1udhb(yqaDqocAW.tGV7Q6urW(j));
                    if (Build.VERSION.SDK_INT < 31) {
                    }
                    edgeEffect.onAbsorb(i);
                    JhpbRXxsg jhpbRXxsg = yqaDqocAW.J4Ux7ym32;
                    if (j != yqaDqocAW.tGV7Q6urW) {
                        PSTqBLTET();
                        return;
                    }
                    return;
                }
                if (yqaDqocAW.tGV7Q6urW(j) < 0.0f) {
                    edgeEffect = this.tGV7Q6urW;
                    i = -D3DEikrvb.Eeka1udhb(yqaDqocAW.tGV7Q6urW(j));
                    if (Build.VERSION.SDK_INT < 31) {
                    }
                    edgeEffect.onAbsorb(i);
                }
                JhpbRXxsg jhpbRXxsg2 = yqaDqocAW.J4Ux7ym32;
                if (j != yqaDqocAW.tGV7Q6urW) {
                }
            } else {
                if (yqaDqocAW.J4Ux7ym32(j) < 0.0f) {
                    edgeEffect2 = this.kCA6Zs9sL;
                    i2 = -D3DEikrvb.Eeka1udhb(yqaDqocAW.J4Ux7ym32(j));
                    if (Build.VERSION.SDK_INT < 31) {
                    }
                    edgeEffect2.onAbsorb(i2);
                }
                if (yqaDqocAW.tGV7Q6urW(j) <= 0.0f) {
                }
            }
        }
    }

    public final float qVUwofr5s(long j, long j2) {
        float dIocxURUo = bRgfgYIQX.dIocxURUo(j2) / tbzY8QG6X.tGV7Q6urW(kmSgne1rO());
        float tGV7Q6urW = bRgfgYIQX.tGV7Q6urW(j) / tbzY8QG6X.kCA6Zs9sL(kmSgne1rO());
        EdgeEffect edgeEffect = this.kCA6Zs9sL;
        float f = -tGV7Q6urW;
        if (Build.VERSION.SDK_INT >= 31) {
            f = kzRylvL0f.q3BipwRCk.tGV7Q6urW(edgeEffect, f, dIocxURUo);
        } else {
            edgeEffect.onPull(f, dIocxURUo);
        }
        return tbzY8QG6X.kCA6Zs9sL(kmSgne1rO()) * (-f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
        if (r0.isFinished() != false) goto L_0x0076;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0074, code lost:
        if (r0.isFinished() != false) goto L_0x0076;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00af, code lost:
        if (r1.isFinished() != false) goto L_0x00e5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e3, code lost:
        if (r1.isFinished() != false) goto L_0x00e5;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fc  */
    @Override // con.ypLiboX2O
    /* Code decompiled incorrectly, please refer to instructions dump */
    public long tGV7Q6urW(long j) {
        float f;
        long q3BipwRCk;
        int i;
        EdgeEffect edgeEffect;
        int i2;
        EdgeEffect edgeEffect2;
        if (Bhmn1KIah()) {
            JhpbRXxsg jhpbRXxsg = yqaDqocAW.J4Ux7ym32;
            return yqaDqocAW.tGV7Q6urW;
        }
        float f2 = 0.0f;
        boolean z = true;
        if (yqaDqocAW.J4Ux7ym32(j) > 0.0f) {
            EdgeEffect edgeEffect3 = this.dIocxURUo;
            int i3 = Build.VERSION.SDK_INT;
            if (!((i3 >= 31 ? kzRylvL0f.q3BipwRCk.J4Ux7ym32(edgeEffect3) : 0.0f) == 0.0f)) {
                edgeEffect2 = this.dIocxURUo;
                i2 = D3DEikrvb.Eeka1udhb(yqaDqocAW.J4Ux7ym32(j));
                if (i3 < 31) {
                }
                edgeEffect2.onAbsorb(i2);
                f = yqaDqocAW.J4Ux7ym32(j);
                if (yqaDqocAW.tGV7Q6urW(j) > 0.0f) {
                    EdgeEffect edgeEffect4 = this.J4Ux7ym32;
                    int i4 = Build.VERSION.SDK_INT;
                    if (!((i4 >= 31 ? kzRylvL0f.q3BipwRCk.J4Ux7ym32(edgeEffect4) : 0.0f) == 0.0f)) {
                        edgeEffect = this.J4Ux7ym32;
                        i = D3DEikrvb.Eeka1udhb(yqaDqocAW.tGV7Q6urW(j));
                        if (i4 < 31) {
                        }
                        edgeEffect.onAbsorb(i);
                        f2 = yqaDqocAW.tGV7Q6urW(j);
                        q3BipwRCk = iOdo7IZgc.q3BipwRCk(f, f2);
                        JhpbRXxsg jhpbRXxsg2 = yqaDqocAW.J4Ux7ym32;
                        if (q3BipwRCk != yqaDqocAW.tGV7Q6urW) {
                            z = false;
                        }
                        if (!z) {
                            PSTqBLTET();
                        }
                        return q3BipwRCk;
                    }
                }
                if (yqaDqocAW.tGV7Q6urW(j) < 0.0f) {
                    EdgeEffect edgeEffect5 = this.tGV7Q6urW;
                    int i5 = Build.VERSION.SDK_INT;
                    if (!((i5 >= 31 ? kzRylvL0f.q3BipwRCk.J4Ux7ym32(edgeEffect5) : 0.0f) == 0.0f)) {
                        edgeEffect = this.tGV7Q6urW;
                        i = -D3DEikrvb.Eeka1udhb(yqaDqocAW.tGV7Q6urW(j));
                        if (i5 < 31) {
                        }
                        edgeEffect.onAbsorb(i);
                        f2 = yqaDqocAW.tGV7Q6urW(j);
                    }
                }
                q3BipwRCk = iOdo7IZgc.q3BipwRCk(f, f2);
                JhpbRXxsg jhpbRXxsg22 = yqaDqocAW.J4Ux7ym32;
                if (q3BipwRCk != yqaDqocAW.tGV7Q6urW) {
                }
                if (!z) {
                }
                return q3BipwRCk;
            }
        }
        if (yqaDqocAW.J4Ux7ym32(j) < 0.0f) {
            EdgeEffect edgeEffect6 = this.kCA6Zs9sL;
            int i6 = Build.VERSION.SDK_INT;
            if (!((i6 >= 31 ? kzRylvL0f.q3BipwRCk.J4Ux7ym32(edgeEffect6) : 0.0f) == 0.0f)) {
                edgeEffect2 = this.kCA6Zs9sL;
                i2 = -D3DEikrvb.Eeka1udhb(yqaDqocAW.J4Ux7ym32(j));
                if (i6 < 31) {
                }
                edgeEffect2.onAbsorb(i2);
                f = yqaDqocAW.J4Ux7ym32(j);
                if (yqaDqocAW.tGV7Q6urW(j) > 0.0f) {
                }
                if (yqaDqocAW.tGV7Q6urW(j) < 0.0f) {
                }
                q3BipwRCk = iOdo7IZgc.q3BipwRCk(f, f2);
                JhpbRXxsg jhpbRXxsg222 = yqaDqocAW.J4Ux7ym32;
                if (q3BipwRCk != yqaDqocAW.tGV7Q6urW) {
                }
                if (!z) {
                }
                return q3BipwRCk;
            }
        }
        f = 0.0f;
        if (yqaDqocAW.tGV7Q6urW(j) > 0.0f) {
        }
        if (yqaDqocAW.tGV7Q6urW(j) < 0.0f) {
        }
        q3BipwRCk = iOdo7IZgc.q3BipwRCk(f, f2);
        JhpbRXxsg jhpbRXxsg2222 = yqaDqocAW.J4Ux7ym32;
        if (q3BipwRCk != yqaDqocAW.tGV7Q6urW) {
        }
        if (!z) {
        }
        return q3BipwRCk;
    }

    public final boolean vPSbyrYWX(wvIIkk6mx wviikk6mx, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        int Eeka1udhb = D3DEikrvb.Eeka1udhb(tbzY8QG6X.kCA6Zs9sL(kmSgne1rO()));
        float J4Ux7ym32 = this.q3BipwRCk.tGV7Q6urW.J4Ux7ym32(wviikk6mx.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, wviikk6mx.MzoOEjc4X(J4Ux7ym32) + (-((float) Eeka1udhb)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public final boolean yWvV4ePLl(wvIIkk6mx wviikk6mx, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-tbzY8QG6X.kCA6Zs9sL(kmSgne1rO()), (-tbzY8QG6X.tGV7Q6urW(kmSgne1rO())) + wviikk6mx.MzoOEjc4X(this.q3BipwRCk.tGV7Q6urW.dIocxURUo));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }
}
