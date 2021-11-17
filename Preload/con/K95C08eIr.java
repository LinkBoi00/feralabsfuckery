package con;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public abstract class K95C08eIr {
    public static final ThreadLocal q3BipwRCk = new ThreadLocal();
    public static final WeakHashMap J4Ux7ym32 = new WeakHashMap(0);
    public static final Object tGV7Q6urW = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a6, code lost:
        if (r20 != null) goto L_0x00a8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a8, code lost:
        r20.q3BipwRCk(-3, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
        if (r20 != null) goto L_0x00a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static Typeface J4Ux7ym32(Context context, int i, TypedValue typedValue, int i2, DfseMYa7G dfseMYa7G, Handler handler, boolean z, boolean z2) {
        String str;
        StringBuilder sb;
        Throwable e;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            Typeface typeface = null;
            if (charSequence2.startsWith("res/")) {
                Typeface typeface2 = (Typeface) ieVIpzqcX.J4Ux7ym32.q3BipwRCk(ieVIpzqcX.tGV7Q6urW(resources, i, i2));
                if (typeface2 == null) {
                    if (!z2) {
                        try {
                            if (charSequence2.toLowerCase().endsWith(".xml")) {
                                GezE1KLaf Bhmn1KIah = pA5wCkne4.Bhmn1KIah(resources.getXml(i), resources);
                                if (Bhmn1KIah == null) {
                                    Log.e("ResourcesCompat", "Failed to find font-family tag");
                                    if (dfseMYa7G != null) {
                                        dfseMYa7G.q3BipwRCk(-3, handler);
                                    }
                                } else {
                                    typeface = ieVIpzqcX.q3BipwRCk(context, Bhmn1KIah, resources, i, i2, dfseMYa7G, handler, z);
                                }
                            } else {
                                typeface2 = ieVIpzqcX.J4Ux7ym32(context, resources, i, charSequence2, i2);
                                if (dfseMYa7G != null) {
                                    if (typeface2 != null) {
                                        dfseMYa7G.J4Ux7ym32(typeface2, handler);
                                    } else {
                                        dfseMYa7G.q3BipwRCk(-3, handler);
                                    }
                                }
                            }
                        } catch (IOException e2) {
                            e = e2;
                            sb = new StringBuilder();
                            str = "Failed to read xml resource ";
                            sb.append(str);
                            sb.append(charSequence2);
                            Log.e("ResourcesCompat", sb.toString(), e);
                        } catch (XmlPullParserException e3) {
                            e = e3;
                            sb = new StringBuilder();
                            str = "Failed to parse xml resource ";
                            sb.append(str);
                            sb.append(charSequence2);
                            Log.e("ResourcesCompat", sb.toString(), e);
                        }
                    }
                    if (typeface == null || dfseMYa7G != null || z2) {
                        return typeface;
                    }
                    StringBuilder q3BipwRCk2 = abGBwSu8x.q3BipwRCk("Font resource ID #0x");
                    q3BipwRCk2.append(Integer.toHexString(i));
                    q3BipwRCk2.append(" could not be retrieved.");
                    throw new Resources.NotFoundException(q3BipwRCk2.toString());
                } else if (dfseMYa7G != null) {
                    dfseMYa7G.J4Ux7ym32(typeface2, handler);
                }
                typeface = typeface2;
                if (typeface == null) {
                }
                return typeface;
            }
        } else {
            StringBuilder q3BipwRCk3 = abGBwSu8x.q3BipwRCk("Resource \"");
            q3BipwRCk3.append(resources.getResourceName(i));
            q3BipwRCk3.append("\" (");
            q3BipwRCk3.append(Integer.toHexString(i));
            q3BipwRCk3.append(") is not a Font: ");
            q3BipwRCk3.append(typedValue);
            throw new Resources.NotFoundException(q3BipwRCk3.toString());
        }
    }

    public static Typeface q3BipwRCk(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return J4Ux7ym32(context, i, new TypedValue(), 0, null, null, false, false);
    }
}
