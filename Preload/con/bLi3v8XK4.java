package con;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
/* loaded from: classes.dex */
public class bLi3v8XK4 {
    public static final int[] tGV7Q6urW = {16843067, 16843068};
    public Bitmap J4Ux7ym32;
    public final ProgressBar q3BipwRCk;

    public bLi3v8XK4(ProgressBar progressBar) {
        this.q3BipwRCk = progressBar;
    }

    public final Drawable J4Ux7ym32(Drawable drawable, boolean z) {
        if (drawable instanceof Y5t3ksRSA) {
            K3o3RJQ0K k3o3RJQ0K = (K3o3RJQ0K) ((Y5t3ksRSA) drawable);
            Drawable drawable2 = k3o3RJQ0K.CBQ5d1kRq;
            if (drawable2 != null) {
                k3o3RJQ0K.q3BipwRCk(J4Ux7ym32(drawable2, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = J4Ux7ym32(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.J4Ux7ym32 == null) {
                this.J4Ux7ym32 = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    public void q3BipwRCk(AttributeSet attributeSet, int i) {
        j6XJY7rz4 mUqPm6GBh = j6XJY7rz4.mUqPm6GBh(this.q3BipwRCk.getContext(), attributeSet, tGV7Q6urW, i, 0);
        Drawable RG6kpfv3v = mUqPm6GBh.RG6kpfv3v(0);
        if (RG6kpfv3v != null) {
            ProgressBar progressBar = this.q3BipwRCk;
            if (RG6kpfv3v instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) RG6kpfv3v;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable J4Ux7ym32 = J4Ux7ym32(animationDrawable.getFrame(i2), true);
                    J4Ux7ym32.setLevel(10000);
                    animationDrawable2.addFrame(J4Ux7ym32, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                RG6kpfv3v = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(RG6kpfv3v);
        }
        Drawable RG6kpfv3v2 = mUqPm6GBh.RG6kpfv3v(1);
        if (RG6kpfv3v2 != null) {
            this.q3BipwRCk.setProgressDrawable(J4Ux7ym32(RG6kpfv3v2, false));
        }
        mUqPm6GBh.NyWTwPF6V();
    }
}
