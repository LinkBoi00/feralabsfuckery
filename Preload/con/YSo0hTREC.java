package con;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
/* loaded from: classes.dex */
public final class YSo0hTREC implements SI0VpKubr {
    public Canvas q3BipwRCk = RvtysjeZn.q3BipwRCk;
    public final llWJsfBCK J4Ux7ym32 = anXlDk6fV.RG6kpfv3v(3, juufjqtjC.dXrmkklc8);
    public final llWJsfBCK tGV7Q6urW = anXlDk6fV.RG6kpfv3v(3, ZKEa6x2aW.RG6kpfv3v);

    @Override // con.SI0VpKubr
    public void Bhmn1KIah(bzmJZsHMu bzmjzshmu, AA4ZBBPJq aA4ZBBPJq) {
        this.q3BipwRCk.saveLayer(bzmjzshmu.q3BipwRCk, bzmjzshmu.J4Ux7ym32, bzmjzshmu.tGV7Q6urW, bzmjzshmu.dIocxURUo, aA4ZBBPJq.q3BipwRCk, 31);
    }

    @Override // con.SI0VpKubr
    public void CBQ5d1kRq(bzmJZsHMu bzmjzshmu, AA4ZBBPJq aA4ZBBPJq) {
        Puu3Rhg4F(bzmjzshmu.q3BipwRCk, bzmjzshmu.J4Ux7ym32, bzmjzshmu.tGV7Q6urW, bzmjzshmu.dIocxURUo, aA4ZBBPJq);
    }

    @Override // con.SI0VpKubr
    public void Eeka1udhb(float f, float f2, float f3, float f4, int i) {
        this.q3BipwRCk.clipRect(f, f2, f3, f4, ixWaw2akD(i));
    }

    @Override // con.SI0VpKubr
    public void GPLPRo6go() {
        this.q3BipwRCk.save();
    }

    @Override // con.SI0VpKubr
    public void J4Ux7ym32() {
        this.q3BipwRCk.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
        if (r3 <= 3) goto L_0x00ef;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
        r2 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    @Override // con.SI0VpKubr
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void MzoOEjc4X(float[] fArr) {
        boolean z;
        boolean z2;
        int i = 0;
        loop0: while (true) {
            int i2 = i + 1;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (!(fArr[(i * 4) + i3] == (i == i3 ? 1.0f : 0.0f))) {
                    z = false;
                    break loop0;
                } else if (i4 > 3) {
                    break;
                } else {
                    i3 = i4;
                }
            }
            i = i2;
        }
        if (!z) {
            Matrix matrix = new Matrix();
            if (fArr[2] == 0.0f) {
                if (fArr[6] == 0.0f) {
                    if (fArr[10] == 1.0f) {
                        if (fArr[14] == 0.0f) {
                            if (fArr[8] == 0.0f) {
                                if (fArr[9] == 0.0f) {
                                    if (fArr[11] == 0.0f) {
                                        z2 = true;
                                        if (!z2) {
                                            float f = fArr[0];
                                            float f2 = fArr[1];
                                            float f3 = fArr[2];
                                            float f4 = fArr[3];
                                            float f5 = fArr[4];
                                            float f6 = fArr[5];
                                            float f7 = fArr[6];
                                            float f8 = fArr[7];
                                            float f9 = fArr[8];
                                            float f10 = fArr[12];
                                            float f11 = fArr[13];
                                            float f12 = fArr[15];
                                            fArr[0] = f;
                                            fArr[1] = f5;
                                            fArr[2] = f10;
                                            fArr[3] = f2;
                                            fArr[4] = f6;
                                            fArr[5] = f11;
                                            fArr[6] = f4;
                                            fArr[7] = f8;
                                            fArr[8] = f12;
                                            matrix.setValues(fArr);
                                            fArr[0] = f;
                                            fArr[1] = f2;
                                            fArr[2] = f3;
                                            fArr[3] = f4;
                                            fArr[4] = f5;
                                            fArr[5] = f6;
                                            fArr[6] = f7;
                                            fArr[7] = f8;
                                            fArr[8] = f9;
                                            this.q3BipwRCk.concat(matrix);
                                            return;
                                        }
                                        throw new IllegalArgumentException("Android does not support arbitrary transforms".toString());
                                    }
                                }
                            }
                        }
                    }
                }
            }
            z2 = false;
            if (!z2) {
            }
        }
    }

    @Override // con.SI0VpKubr
    public void PSTqBLTET(Y3ibtOJiE y3ibtOJiE, long j, long j2, long j3, long j4, AA4ZBBPJq aA4ZBBPJq) {
        Canvas canvas = this.q3BipwRCk;
        Bitmap PSTqBLTET = p62TZmTyO.PSTqBLTET(y3ibtOJiE);
        Rect rect = (Rect) this.J4Ux7ym32.getValue();
        rect.left = ZtJSMDYDl.q3BipwRCk(j);
        rect.top = ZtJSMDYDl.J4Ux7ym32(j);
        rect.right = YWiUMZOtw.tGV7Q6urW(j2) + ZtJSMDYDl.q3BipwRCk(j);
        rect.bottom = YWiUMZOtw.J4Ux7ym32(j2) + ZtJSMDYDl.J4Ux7ym32(j);
        Rect rect2 = (Rect) this.tGV7Q6urW.getValue();
        rect2.left = ZtJSMDYDl.q3BipwRCk(j3);
        rect2.top = ZtJSMDYDl.J4Ux7ym32(j3);
        rect2.right = YWiUMZOtw.tGV7Q6urW(j4) + ZtJSMDYDl.q3BipwRCk(j3);
        rect2.bottom = YWiUMZOtw.J4Ux7ym32(j4) + ZtJSMDYDl.J4Ux7ym32(j3);
        canvas.drawBitmap(PSTqBLTET, rect, rect2, aA4ZBBPJq.q3BipwRCk);
    }

    @Override // con.SI0VpKubr
    public void Puu3Rhg4F(float f, float f2, float f3, float f4, AA4ZBBPJq aA4ZBBPJq) {
        this.q3BipwRCk.drawRect(f, f2, f3, f4, aA4ZBBPJq.q3BipwRCk);
    }

    @Override // con.SI0VpKubr
    public void RG6kpfv3v(Y3ibtOJiE y3ibtOJiE, long j, AA4ZBBPJq aA4ZBBPJq) {
        this.q3BipwRCk.drawBitmap(p62TZmTyO.PSTqBLTET(y3ibtOJiE), bRgfgYIQX.tGV7Q6urW(j), bRgfgYIQX.dIocxURUo(j), aA4ZBBPJq.q3BipwRCk);
    }

    @Override // con.SI0VpKubr
    public void dIocxURUo(A128gLXzp a128gLXzp, AA4ZBBPJq aA4ZBBPJq) {
        Canvas canvas = this.q3BipwRCk;
        if (a128gLXzp instanceof Q3Qxqu4re) {
            canvas.drawPath(((Q3Qxqu4re) a128gLXzp).q3BipwRCk, aA4ZBBPJq.q3BipwRCk);
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // con.SI0VpKubr
    public void dXrmkklc8(float f, float f2) {
        this.q3BipwRCk.translate(f, f2);
    }

    @Override // con.SI0VpKubr
    public void iiGwOFFnr(float f, float f2) {
        this.q3BipwRCk.scale(f, f2);
    }

    @Override // con.SI0VpKubr
    public void ilHKhw3Yw() {
        xaVKXuZUb.q3BipwRCk(this.q3BipwRCk, true);
    }

    public final Region.Op ixWaw2akD(int i) {
        oWhsE8IPp owhse8ipp = c8C9YlOpy.q3BipwRCk;
        oWhsE8IPp owhse8ipp2 = c8C9YlOpy.q3BipwRCk;
        return i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // con.SI0VpKubr
    public void kCA6Zs9sL(float f, float f2, float f3, float f4, float f5, float f6, AA4ZBBPJq aA4ZBBPJq) {
        this.q3BipwRCk.drawRoundRect(f, f2, f3, f4, f5, f6, aA4ZBBPJq.q3BipwRCk);
    }

    @Override // con.SI0VpKubr
    public void kmSgne1rO(A128gLXzp a128gLXzp, int i) {
        Canvas canvas = this.q3BipwRCk;
        if (a128gLXzp instanceof Q3Qxqu4re) {
            canvas.clipPath(((Q3Qxqu4re) a128gLXzp).q3BipwRCk, ixWaw2akD(i));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // con.SI0VpKubr
    public void oon79WMrY(float f) {
        this.q3BipwRCk.rotate(f);
    }

    @Override // con.SI0VpKubr
    public void q3BipwRCk(bzmJZsHMu bzmjzshmu, int i) {
        Eeka1udhb(bzmjzshmu.q3BipwRCk, bzmjzshmu.J4Ux7ym32, bzmjzshmu.tGV7Q6urW, bzmjzshmu.dIocxURUo, i);
    }

    @Override // con.SI0VpKubr
    public void qVUwofr5s(long j, float f, AA4ZBBPJq aA4ZBBPJq) {
        this.q3BipwRCk.drawCircle(bRgfgYIQX.tGV7Q6urW(j), bRgfgYIQX.dIocxURUo(j), f, aA4ZBBPJq.q3BipwRCk);
    }

    @Override // con.SI0VpKubr
    public void tGV7Q6urW(long j, long j2, AA4ZBBPJq aA4ZBBPJq) {
        this.q3BipwRCk.drawLine(bRgfgYIQX.tGV7Q6urW(j), bRgfgYIQX.dIocxURUo(j), bRgfgYIQX.tGV7Q6urW(j2), bRgfgYIQX.dIocxURUo(j2), aA4ZBBPJq.q3BipwRCk);
    }

    @Override // con.SI0VpKubr
    public void vPSbyrYWX() {
        xaVKXuZUb.q3BipwRCk(this.q3BipwRCk, false);
    }

    @Override // con.SI0VpKubr
    public void yWvV4ePLl(float f, float f2, float f3, float f4, float f5, float f6, boolean z, AA4ZBBPJq aA4ZBBPJq) {
        this.q3BipwRCk.drawArc(f, f2, f3, f4, f5, f6, z, aA4ZBBPJq.q3BipwRCk);
    }
}
