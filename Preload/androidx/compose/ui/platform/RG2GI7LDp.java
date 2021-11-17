package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import con.A128gLXzp;
import con.Du7hlPDkT;
import con.ODug2UCW1;
import con.PmanMZxiM;
import con.YSo0hTREC;
import con.iFKnyAZAM;
import con.yA4i3FtpV;
/* loaded from: classes.dex */
public final class RG2GI7LDp implements Du7hlPDkT {
    public static boolean GPLPRo6go = true;
    public int J4Ux7ym32;
    public int dIocxURUo;
    public boolean iiGwOFFnr;
    public int kCA6Zs9sL;
    public final RenderNode q3BipwRCk;
    public int tGV7Q6urW;

    public RG2GI7LDp(AndroidComposeView androidComposeView) {
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        this.q3BipwRCk = create;
        if (GPLPRo6go) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            create.discardDisplayList();
            GPLPRo6go = false;
        }
    }

    @Override // con.Du7hlPDkT
    public void AqaWJg0b4(Matrix matrix) {
        this.q3BipwRCk.getMatrix(matrix);
    }

    @Override // con.Du7hlPDkT
    public void Bhmn1KIah(int i) {
        this.tGV7Q6urW += i;
        this.kCA6Zs9sL += i;
        this.q3BipwRCk.offsetTopAndBottom(i);
    }

    @Override // con.Du7hlPDkT
    public int CBQ5d1kRq() {
        return this.dIocxURUo;
    }

    @Override // con.Du7hlPDkT
    public void CpG0imbht(float f) {
        this.q3BipwRCk.setScaleX(f);
    }

    @Override // con.Du7hlPDkT
    public void Eeka1udhb(boolean z) {
        this.q3BipwRCk.setClipToOutline(z);
    }

    @Override // con.Du7hlPDkT
    public void GPLPRo6go(float f) {
        this.q3BipwRCk.setAlpha(f);
    }

    @Override // con.Du7hlPDkT
    public boolean IytU16YUK(int i, int i2, int i3, int i4) {
        this.J4Ux7ym32 = i;
        this.tGV7Q6urW = i2;
        this.dIocxURUo = i3;
        this.kCA6Zs9sL = i4;
        return this.q3BipwRCk.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // con.Du7hlPDkT
    public int J4Ux7ym32() {
        return this.kCA6Zs9sL - this.tGV7Q6urW;
    }

    @Override // con.Du7hlPDkT
    public void MzoOEjc4X(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.q3BipwRCk);
    }

    @Override // con.Du7hlPDkT
    public float NyWTwPF6V() {
        return this.q3BipwRCk.getElevation();
    }

    @Override // con.Du7hlPDkT
    public boolean PSTqBLTET() {
        return this.iiGwOFFnr;
    }

    @Override // con.Du7hlPDkT
    public void Puu3Rhg4F(float f) {
        this.q3BipwRCk.setScaleY(f);
    }

    @Override // con.Du7hlPDkT
    public void RG6kpfv3v(float f) {
        this.q3BipwRCk.setRotation(f);
    }

    @Override // con.Du7hlPDkT
    public void WaUP0CF08(float f) {
        this.q3BipwRCk.setCameraDistance(-f);
    }

    @Override // con.Du7hlPDkT
    public void cAwN510t2(Outline outline) {
        this.q3BipwRCk.setOutline(outline);
    }

    @Override // con.Du7hlPDkT
    public void dIocxURUo(yA4i3FtpV ya4i3ftpv) {
    }

    @Override // con.Du7hlPDkT
    public float dXrmkklc8() {
        return this.q3BipwRCk.getAlpha();
    }

    @Override // con.Du7hlPDkT
    public boolean dfpT1j18n() {
        return this.q3BipwRCk.isValid();
    }

    @Override // con.Du7hlPDkT
    public boolean i8XZMQc6Z(boolean z) {
        return this.q3BipwRCk.setHasOverlappingRendering(z);
    }

    @Override // con.Du7hlPDkT
    public void iMyQMM6Qj(boolean z) {
        this.iiGwOFFnr = z;
        this.q3BipwRCk.setClipToBounds(z);
    }

    @Override // con.Du7hlPDkT
    public void iiGwOFFnr(float f) {
        this.q3BipwRCk.setTranslationX(f);
    }

    @Override // con.Du7hlPDkT
    public int ilHKhw3Yw() {
        return this.tGV7Q6urW;
    }

    @Override // con.Du7hlPDkT
    public void ixWaw2akD(float f) {
        this.q3BipwRCk.setPivotX(f);
    }

    @Override // con.Du7hlPDkT
    public void kCA6Zs9sL(float f) {
        this.q3BipwRCk.setPivotY(f);
    }

    @Override // con.Du7hlPDkT
    public boolean kmSgne1rO() {
        return this.q3BipwRCk.getClipToOutline();
    }

    @Override // con.Du7hlPDkT
    public void mUqPm6GBh() {
        this.q3BipwRCk.discardDisplayList();
    }

    @Override // con.Du7hlPDkT
    public void nlGCs0NZs(iFKnyAZAM ifknyazam, A128gLXzp a128gLXzp, PmanMZxiM pmanMZxiM) {
        Canvas start = this.q3BipwRCk.start(q3BipwRCk(), J4Ux7ym32());
        YSo0hTREC ySo0hTREC = (YSo0hTREC) ifknyazam.kmSgne1rO;
        Canvas canvas = ySo0hTREC.q3BipwRCk;
        Canvas canvas2 = start;
        ySo0hTREC.q3BipwRCk = canvas2;
        if (a128gLXzp != null) {
            canvas2.save();
            ODug2UCW1.CBQ5d1kRq(ySo0hTREC, a128gLXzp, 0, 2, null);
        }
        pmanMZxiM.IytU16YUK(ySo0hTREC);
        if (a128gLXzp != null) {
            ySo0hTREC.q3BipwRCk.restore();
        }
        ((YSo0hTREC) ifknyazam.kmSgne1rO).q3BipwRCk = canvas;
        this.q3BipwRCk.end(start);
    }

    @Override // con.Du7hlPDkT
    public void oon79WMrY(int i) {
        this.J4Ux7ym32 += i;
        this.dIocxURUo += i;
        this.q3BipwRCk.offsetLeftAndRight(i);
    }

    @Override // con.Du7hlPDkT
    public int q3BipwRCk() {
        return this.dIocxURUo - this.J4Ux7ym32;
    }

    @Override // con.Du7hlPDkT
    public void qFBXIgpia(float f) {
        this.q3BipwRCk.setRotationX(f);
    }

    @Override // con.Du7hlPDkT
    public int qVUwofr5s() {
        return this.J4Ux7ym32;
    }

    @Override // con.Du7hlPDkT
    public void sk5s77z6Q(float f) {
        this.q3BipwRCk.setTranslationY(f);
    }

    @Override // con.Du7hlPDkT
    public void tGV7Q6urW(float f) {
        this.q3BipwRCk.setRotationY(f);
    }

    @Override // con.Du7hlPDkT
    public int vPSbyrYWX() {
        return this.kCA6Zs9sL;
    }

    @Override // con.Du7hlPDkT
    public void yWvV4ePLl(float f) {
        this.q3BipwRCk.setElevation(f);
    }
}
