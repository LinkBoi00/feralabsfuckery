package con;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes.dex */
public class jtlc94oK7 {
    public TextPaint Puu3Rhg4F;
    public final Context oon79WMrY;
    public final ShAKJI1p8 vPSbyrYWX;
    public final TextView yWvV4ePLl;
    public static final RectF CBQ5d1kRq = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap kmSgne1rO = new ConcurrentHashMap();
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap Bhmn1KIah = new ConcurrentHashMap();
    public int q3BipwRCk = 0;
    public boolean J4Ux7ym32 = false;
    public float tGV7Q6urW = -1.0f;
    public float dIocxURUo = -1.0f;
    public float kCA6Zs9sL = -1.0f;
    public int[] iiGwOFFnr = new int[0];
    public boolean GPLPRo6go = false;

    public jtlc94oK7(TextView textView) {
        this.yWvV4ePLl = textView;
        this.oon79WMrY = textView.getContext();
        this.vPSbyrYWX = Build.VERSION.SDK_INT >= 29 ? new NWQpHtsVn() : new W8LGsXe1j();
    }

    public static Method dIocxURUo(String str) {
        try {
            Method method = (Method) kmSgne1rO.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                kmSgne1rO.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    public static Object kCA6Zs9sL(Object obj, String str, Object obj2) {
        try {
            return dIocxURUo(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return obj2;
        }
    }

    public final boolean GPLPRo6go() {
        if (!yWvV4ePLl() || this.q3BipwRCk != 1) {
            this.J4Ux7ym32 = false;
        } else {
            if (!this.GPLPRo6go || this.iiGwOFFnr.length == 0) {
                int floor = ((int) Math.floor((double) ((this.kCA6Zs9sL - this.dIocxURUo) / this.tGV7Q6urW))) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((((float) i) * this.tGV7Q6urW) + this.dIocxURUo);
                }
                this.iiGwOFFnr = J4Ux7ym32(iArr);
            }
            this.J4Ux7ym32 = true;
        }
        return this.J4Ux7ym32;
    }

    public final int[] J4Ux7ym32(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    public final boolean Puu3Rhg4F() {
        int[] iArr = this.iiGwOFFnr;
        int length = iArr.length;
        boolean z = length > 0;
        this.GPLPRo6go = z;
        if (z) {
            this.q3BipwRCk = 1;
            this.dIocxURUo = (float) iArr[0];
            this.kCA6Zs9sL = (float) iArr[length - 1];
            this.tGV7Q6urW = -1.0f;
        }
        return z;
    }

    public void iiGwOFFnr(int i, float f) {
        Context context = this.oon79WMrY;
        float applyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != this.yWvV4ePLl.getPaint().getTextSize()) {
            this.yWvV4ePLl.getPaint().setTextSize(applyDimension);
            boolean isInLayout = this.yWvV4ePLl.isInLayout();
            if (this.yWvV4ePLl.getLayout() != null) {
                this.J4Ux7ym32 = false;
                try {
                    Method dIocxURUo = dIocxURUo("nullLayouts");
                    if (dIocxURUo != null) {
                        dIocxURUo.invoke(this.yWvV4ePLl, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.yWvV4ePLl.requestLayout();
                } else {
                    this.yWvV4ePLl.forceLayout();
                }
                this.yWvV4ePLl.invalidate();
            }
        }
    }

    public final void oon79WMrY(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.q3BipwRCk = 1;
            this.dIocxURUo = f;
            this.kCA6Zs9sL = f2;
            this.tGV7Q6urW = f3;
            this.GPLPRo6go = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    public void q3BipwRCk() {
        if (yWvV4ePLl() && this.q3BipwRCk != 0) {
            if (this.J4Ux7ym32) {
                if (this.yWvV4ePLl.getMeasuredHeight() > 0 && this.yWvV4ePLl.getMeasuredWidth() > 0) {
                    int measuredWidth = this.vPSbyrYWX.J4Ux7ym32(this.yWvV4ePLl) ? 1048576 : (this.yWvV4ePLl.getMeasuredWidth() - this.yWvV4ePLl.getTotalPaddingLeft()) - this.yWvV4ePLl.getTotalPaddingRight();
                    int height = (this.yWvV4ePLl.getHeight() - this.yWvV4ePLl.getCompoundPaddingBottom()) - this.yWvV4ePLl.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = CBQ5d1kRq;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) measuredWidth;
                            rectF.bottom = (float) height;
                            float tGV7Q6urW = (float) tGV7Q6urW(rectF);
                            if (tGV7Q6urW != this.yWvV4ePLl.getTextSize()) {
                                iiGwOFFnr(0, tGV7Q6urW);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.J4Ux7ym32 = true;
        }
    }

    public final int tGV7Q6urW(RectF rectF) {
        CharSequence transformation;
        int length = this.iiGwOFFnr.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                int i5 = this.iiGwOFFnr[i4];
                CharSequence text = this.yWvV4ePLl.getText();
                TransformationMethod transformationMethod = this.yWvV4ePLl.getTransformationMethod();
                if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.yWvV4ePLl)) == null)) {
                    text = transformation;
                }
                int maxLines = this.yWvV4ePLl.getMaxLines();
                TextPaint textPaint = this.Puu3Rhg4F;
                if (textPaint == null) {
                    this.Puu3Rhg4F = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.Puu3Rhg4F.set(this.yWvV4ePLl.getPaint());
                this.Puu3Rhg4F.setTextSize((float) i5);
                StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.Puu3Rhg4F, Math.round(rectF.right));
                obtain.setAlignment((Layout.Alignment) kCA6Zs9sL(this.yWvV4ePLl, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL)).setLineSpacing(this.yWvV4ePLl.getLineSpacingExtra(), this.yWvV4ePLl.getLineSpacingMultiplier()).setIncludePad(this.yWvV4ePLl.getIncludeFontPadding()).setBreakStrategy(this.yWvV4ePLl.getBreakStrategy()).setHyphenationFrequency(this.yWvV4ePLl.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
                try {
                    this.vPSbyrYWX.q3BipwRCk(obtain, this.yWvV4ePLl);
                } catch (ClassCastException unused) {
                    Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                }
                StaticLayout build = obtain.build();
                if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && ((float) build.getHeight()) <= rectF.bottom) {
                    i2 = i4 + 1;
                    i3 = i2;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.iiGwOFFnr[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final boolean yWvV4ePLl() {
        return !(this.yWvV4ePLl instanceof JalUT392R);
    }
}
