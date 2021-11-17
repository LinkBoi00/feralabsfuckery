package con;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class dV9j1WF3U extends Ys1EfErcp {
    public final Method CBQ5d1kRq;
    public final Class GPLPRo6go;
    public final Constructor Puu3Rhg4F;
    public final Method kmSgne1rO;
    public final Method oon79WMrY;
    public final Method vPSbyrYWX;
    public final Method yWvV4ePLl;

    public dV9j1WF3U() {
        Method method;
        Method method2;
        Method method3;
        Constructor<?> constructor;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = kmSgne1rO(cls2);
            method2 = Bhmn1KIah(cls2);
            method = cls2.getMethod("freeze", new Class[0]);
            method4 = cls2.getMethod("abortCreation", new Class[0]);
            method5 = PSTqBLTET(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Unable to collect necessary methods for class ");
            q3BipwRCk.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", q3BipwRCk.toString(), e);
            method5 = null;
            method4 = null;
            constructor = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.GPLPRo6go = cls;
        this.Puu3Rhg4F = constructor;
        this.yWvV4ePLl = method3;
        this.oon79WMrY = method2;
        this.vPSbyrYWX = method;
        this.CBQ5d1kRq = method4;
        this.kmSgne1rO = method5;
    }

    private Object CBQ5d1kRq() {
        try {
            return this.Puu3Rhg4F.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method Bhmn1KIah(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public final void GPLPRo6go(Object obj) {
        try {
            this.CBQ5d1kRq.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    @Override // con.LVtOVALR4
    public Typeface J4Ux7ym32(Context context, CancellationSignal cancellationSignal, k9x1izWJn[] k9x1izwjnArr, int i) {
        Typeface yWvV4ePLl;
        boolean z;
        if (k9x1izwjnArr.length < 1) {
            return null;
        }
        if (!vPSbyrYWX()) {
            k9x1izWJn k9x1izwjn = (k9x1izWJn) LVtOVALR4.dIocxURUo(k9x1izwjnArr, i, new rPR8g1Ebn(this, 0));
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(k9x1izwjn.q3BipwRCk, "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(k9x1izwjn.tGV7Q6urW).setItalic(k9x1izwjn.dIocxURUo).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        } else {
            HashMap hashMap = new HashMap();
            for (k9x1izWJn k9x1izwjn2 : k9x1izwjnArr) {
                if (k9x1izwjn2.kCA6Zs9sL == 0) {
                    Uri uri = k9x1izwjn2.q3BipwRCk;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, BBVaGLNaU.mUqPm6GBh(context, cancellationSignal, uri));
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            Object CBQ5d1kRq = CBQ5d1kRq();
            if (CBQ5d1kRq == null) {
                return null;
            }
            int length = k9x1izwjnArr.length;
            int i2 = 0;
            boolean z2 = false;
            while (i2 < length) {
                k9x1izWJn k9x1izwjn3 = k9x1izwjnArr[i2];
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(k9x1izwjn3.q3BipwRCk);
                if (byteBuffer != null) {
                    try {
                        z = ((Boolean) this.oon79WMrY.invoke(CBQ5d1kRq, byteBuffer, Integer.valueOf(k9x1izwjn3.J4Ux7ym32), null, Integer.valueOf(k9x1izwjn3.tGV7Q6urW), Integer.valueOf(k9x1izwjn3.dIocxURUo ? 1 : 0))).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z = false;
                    }
                    if (!z) {
                        GPLPRo6go(CBQ5d1kRq);
                        return null;
                    }
                    z2 = true;
                }
                i2++;
                z2 = z2;
            }
            if (!z2) {
                GPLPRo6go(CBQ5d1kRq);
                return null;
            } else if (oon79WMrY(CBQ5d1kRq) && (yWvV4ePLl = yWvV4ePLl(CBQ5d1kRq)) != null) {
                return Typeface.create(yWvV4ePLl, i);
            } else {
                return null;
            }
        }
    }

    public Method PSTqBLTET(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public final boolean Puu3Rhg4F(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.yWvV4ePLl.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method kmSgne1rO(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public final boolean oon79WMrY(Object obj) {
        try {
            return ((Boolean) this.vPSbyrYWX.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // con.Ys1EfErcp, con.LVtOVALR4
    public Typeface q3BipwRCk(Context context, fyPKNAQNN fypknaqnn, Resources resources, int i) {
        if (!vPSbyrYWX()) {
            return super.q3BipwRCk(context, fypknaqnn, resources, i);
        }
        Object CBQ5d1kRq = CBQ5d1kRq();
        if (CBQ5d1kRq == null) {
            return null;
        }
        U90DuDsYT[] u90DuDsYTArr = fypknaqnn.q3BipwRCk;
        for (U90DuDsYT u90DuDsYT : u90DuDsYTArr) {
            if (!Puu3Rhg4F(context, CBQ5d1kRq, u90DuDsYT.q3BipwRCk, u90DuDsYT.kCA6Zs9sL, u90DuDsYT.J4Ux7ym32, u90DuDsYT.tGV7Q6urW ? 1 : 0, FontVariationAxis.fromFontVariationSettings(u90DuDsYT.dIocxURUo))) {
                GPLPRo6go(CBQ5d1kRq);
                return null;
            }
        }
        if (!oon79WMrY(CBQ5d1kRq)) {
            return null;
        }
        return yWvV4ePLl(CBQ5d1kRq);
    }

    @Override // con.LVtOVALR4
    public Typeface tGV7Q6urW(Context context, Resources resources, int i, String str, int i2) {
        if (!vPSbyrYWX()) {
            return super.tGV7Q6urW(context, resources, i, str, i2);
        }
        Object CBQ5d1kRq = CBQ5d1kRq();
        if (CBQ5d1kRq == null) {
            return null;
        }
        if (!Puu3Rhg4F(context, CBQ5d1kRq, str, 0, -1, -1, null)) {
            GPLPRo6go(CBQ5d1kRq);
            return null;
        } else if (!oon79WMrY(CBQ5d1kRq)) {
            return null;
        } else {
            return yWvV4ePLl(CBQ5d1kRq);
        }
    }

    public final boolean vPSbyrYWX() {
        if (this.yWvV4ePLl == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.yWvV4ePLl != null;
    }

    public Typeface yWvV4ePLl(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.GPLPRo6go, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.kmSgne1rO.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
