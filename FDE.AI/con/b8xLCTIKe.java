package con;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;
/* loaded from: classes.dex */
public final class b8xLCTIKe implements Du7hlPDkT {
    public final RenderNode q3BipwRCk = new RenderNode("Compose");

    public b8xLCTIKe(AndroidComposeView androidComposeView) {
    }

    @Override // con.Du7hlPDkT
    public void AqaWJg0b4(Matrix matrix) {
        this.q3BipwRCk.getMatrix(matrix);
    }

    @Override // con.Du7hlPDkT
    public void Bhmn1KIah(int i) {
        this.q3BipwRCk.offsetTopAndBottom(i);
    }

    @Override // con.Du7hlPDkT
    public int CBQ5d1kRq() {
        return this.q3BipwRCk.getRight();
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
        return this.q3BipwRCk.setPosition(i, i2, i3, i4);
    }

    @Override // con.Du7hlPDkT
    public int J4Ux7ym32() {
        return this.q3BipwRCk.getHeight();
    }

    @Override // con.Du7hlPDkT
    public void MzoOEjc4X(Canvas canvas) {
        canvas.drawRenderNode(this.q3BipwRCk);
    }

    @Override // con.Du7hlPDkT
    public float NyWTwPF6V() {
        return this.q3BipwRCk.getElevation();
    }

    @Override // con.Du7hlPDkT
    public boolean PSTqBLTET() {
        return this.q3BipwRCk.getClipToBounds();
    }

    @Override // con.Du7hlPDkT
    public void Puu3Rhg4F(float f) {
        this.q3BipwRCk.setScaleY(f);
    }

    @Override // con.Du7hlPDkT
    public void RG6kpfv3v(float f) {
        this.q3BipwRCk.setRotationZ(f);
    }

    @Override // con.Du7hlPDkT
    public void WaUP0CF08(float f) {
        this.q3BipwRCk.setCameraDistance(f);
    }

    @Override // con.Du7hlPDkT
    public void cAwN510t2(Outline outline) {
        this.q3BipwRCk.setOutline(outline);
    }

    @Override // con.Du7hlPDkT
    public void dIocxURUo(yA4i3FtpV ya4i3ftpv) {
        if (Build.VERSION.SDK_INT >= 31) {
            cHQsVYqc0.q3BipwRCk.q3BipwRCk(this.q3BipwRCk, ya4i3ftpv);
        }
    }

    @Override // con.Du7hlPDkT
    public float dXrmkklc8() {
        return this.q3BipwRCk.getAlpha();
    }

    @Override // con.Du7hlPDkT
    public boolean dfpT1j18n() {
        return this.q3BipwRCk.hasDisplayList();
    }

    @Override // con.Du7hlPDkT
    public boolean i8XZMQc6Z(boolean z) {
        return this.q3BipwRCk.setHasOverlappingRendering(z);
    }

    @Override // con.Du7hlPDkT
    public void iMyQMM6Qj(boolean z) {
        this.q3BipwRCk.setClipToBounds(z);
    }

    @Override // con.Du7hlPDkT
    public void iiGwOFFnr(float f) {
        this.q3BipwRCk.setTranslationX(f);
    }

    @Override // con.Du7hlPDkT
    public int ilHKhw3Yw() {
        return this.q3BipwRCk.getTop();
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
        RecordingCanvas beginRecording = this.q3BipwRCk.beginRecording();
        YSo0hTREC ySo0hTREC = (YSo0hTREC) ifknyazam.kmSgne1rO;
        Canvas canvas = ySo0hTREC.q3BipwRCk;
        ySo0hTREC.q3BipwRCk = beginRecording;
        if (a128gLXzp != null) {
            beginRecording.save();
            ODug2UCW1.CBQ5d1kRq(ySo0hTREC, a128gLXzp, 0, 2, null);
        }
        pmanMZxiM.IytU16YUK(ySo0hTREC);
        if (a128gLXzp != null) {
            ySo0hTREC.q3BipwRCk.restore();
        }
        ((YSo0hTREC) ifknyazam.kmSgne1rO).q3BipwRCk = canvas;
        this.q3BipwRCk.endRecording();
    }

    @Override // con.Du7hlPDkT
    public void oon79WMrY(int i) {
        this.q3BipwRCk.offsetLeftAndRight(i);
    }

    @Override // con.Du7hlPDkT
    public int q3BipwRCk() {
        return this.q3BipwRCk.getWidth();
    }

    @Override // con.Du7hlPDkT
    public void qFBXIgpia(float f) {
        this.q3BipwRCk.setRotationX(f);
    }

    @Override // con.Du7hlPDkT
    public int qVUwofr5s() {
        return this.q3BipwRCk.getLeft();
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
        return this.q3BipwRCk.getBottom();
    }

    @Override // con.Du7hlPDkT
    public void yWvV4ePLl(float f) {
        this.q3BipwRCk.setElevation(f);
    }
}
