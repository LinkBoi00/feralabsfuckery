package con;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
/* loaded from: classes.dex */
public class Ay5WVso1Y extends dOSsQaJVg {
    public final RectF i0Zug1mVk;
    public int o4LF8RkoQ;
    public final Paint vNtjxmzUM;

    public Ay5WVso1Y(xT3tobMV0 xt3tobmv0) {
        super(xt3tobmv0 == null ? new xT3tobMV0() : xt3tobmv0);
        Paint paint = new Paint(1);
        this.vNtjxmzUM = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.i0Zug1mVk = new RectF();
    }

    @Override // con.dOSsQaJVg
    public void GPLPRo6go(Canvas canvas) {
        if (this.i0Zug1mVk.isEmpty()) {
            super.GPLPRo6go(canvas);
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap);
        super.GPLPRo6go(canvas2);
        canvas2.drawRect(this.i0Zug1mVk, this.vNtjxmzUM);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
    }

    public void WaUP0CF08(float f, float f2, float f3, float f4) {
        RectF rectF = this.i0Zug1mVk;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    @Override // con.dOSsQaJVg, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        } else {
            this.o4LF8RkoQ = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null);
        }
        super.draw(canvas);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.o4LF8RkoQ);
        }
    }
}
