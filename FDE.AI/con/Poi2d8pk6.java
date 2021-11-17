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
    public long GPLPRo6go(long r9, con.bRgfgYIQX r11, int r12) {
        /*
        // Method dump skipped, instructions count: 295
        */
        throw new UnsupportedOperationException("Method not decompiled: con.Poi2d8pk6.GPLPRo6go(long, con.bRgfgYIQX, int):long");
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
    public void kCA6Zs9sL(long r5, long r7, con.bRgfgYIQX r9, int r10) {
        /*
        // Method dump skipped, instructions count: 240
        */
        throw new UnsupportedOperationException("Method not decompiled: con.Poi2d8pk6.kCA6Zs9sL(long, long, con.bRgfgYIQX, int):void");
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
    public void q3BipwRCk(long r6) {
        /*
            r5 = this;
            boolean r0 = r5.Bhmn1KIah()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            float r0 = con.yqaDqocAW.J4Ux7ym32(r6)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 31
            if (r0 <= 0) goto L_0x0028
            android.widget.EdgeEffect r0 = r5.dIocxURUo
            float r3 = con.yqaDqocAW.J4Ux7ym32(r6)
            int r3 = con.D3DEikrvb.Eeka1udhb(r3)
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r2) goto L_0x0021
            goto L_0x0046
        L_0x0021:
            boolean r4 = r0.isFinished()
            if (r4 == 0) goto L_0x0049
            goto L_0x0046
        L_0x0028:
            float r0 = con.yqaDqocAW.J4Ux7ym32(r6)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0049
            android.widget.EdgeEffect r0 = r5.kCA6Zs9sL
            float r3 = con.yqaDqocAW.J4Ux7ym32(r6)
            int r3 = con.D3DEikrvb.Eeka1udhb(r3)
            int r3 = -r3
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r2) goto L_0x0040
            goto L_0x0046
        L_0x0040:
            boolean r4 = r0.isFinished()
            if (r4 == 0) goto L_0x0049
        L_0x0046:
            r0.onAbsorb(r3)
        L_0x0049:
            float r0 = con.yqaDqocAW.tGV7Q6urW(r6)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0067
            android.widget.EdgeEffect r0 = r5.J4Ux7ym32
            float r1 = con.yqaDqocAW.tGV7Q6urW(r6)
            int r1 = con.D3DEikrvb.Eeka1udhb(r1)
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r2) goto L_0x0060
            goto L_0x0085
        L_0x0060:
            boolean r2 = r0.isFinished()
            if (r2 == 0) goto L_0x0088
            goto L_0x0085
        L_0x0067:
            float r0 = con.yqaDqocAW.tGV7Q6urW(r6)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0088
            android.widget.EdgeEffect r0 = r5.tGV7Q6urW
            float r1 = con.yqaDqocAW.tGV7Q6urW(r6)
            int r1 = con.D3DEikrvb.Eeka1udhb(r1)
            int r1 = -r1
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r2) goto L_0x007f
            goto L_0x0085
        L_0x007f:
            boolean r2 = r0.isFinished()
            if (r2 == 0) goto L_0x0088
        L_0x0085:
            r0.onAbsorb(r1)
        L_0x0088:
            con.JhpbRXxsg r0 = con.yqaDqocAW.J4Ux7ym32
            long r0 = con.yqaDqocAW.tGV7Q6urW
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x0092
            r6 = 1
            goto L_0x0093
        L_0x0092:
            r6 = 0
        L_0x0093:
            if (r6 != 0) goto L_0x0098
            r5.PSTqBLTET()
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: con.Poi2d8pk6.q3BipwRCk(long):void");
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
    public long tGV7Q6urW(long r9) {
        /*
        // Method dump skipped, instructions count: 256
        */
        throw new UnsupportedOperationException("Method not decompiled: con.Poi2d8pk6.tGV7Q6urW(long):long");
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
