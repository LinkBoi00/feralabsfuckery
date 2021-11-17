package con;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class meB98lbAo {
    public boolean GPLPRo6go;
    public String J4Ux7ym32;
    public int Puu3Rhg4F;
    public int dIocxURUo;
    public String iiGwOFFnr;
    public float kCA6Zs9sL;
    public boolean q3BipwRCk;
    public int tGV7Q6urW;

    public meB98lbAo(meB98lbAo meb98lbao, Object obj) {
        this.q3BipwRCk = false;
        this.J4Ux7ym32 = meb98lbao.J4Ux7ym32;
        this.tGV7Q6urW = meb98lbao.tGV7Q6urW;
        J4Ux7ym32(obj);
    }

    public meB98lbAo(String str, int i, Object obj, boolean z) {
        this.q3BipwRCk = false;
        this.J4Ux7ym32 = str;
        this.tGV7Q6urW = i;
        this.q3BipwRCk = z;
        J4Ux7ym32(obj);
    }

    public static void q3BipwRCk(Context context, XmlPullParser xmlPullParser, HashMap hashMap) {
        int i;
        float f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), EssXmp5ks.dIocxURUo);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i2 = 0;
        boolean z = false;
        Object obj = null;
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = obtainStyledAttributes.getIndex(i3);
            i2 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i2 = 6;
            } else {
                if (index == 3) {
                    i2 = 3;
                } else if (index == 2) {
                    i2 = 4;
                } else {
                    if (index == 7) {
                        f = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == 4) {
                        f = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == 5) {
                        obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                        i2 = 2;
                    } else {
                        if (index == 6) {
                            i = obtainStyledAttributes.getInteger(index, -1);
                        } else if (index == 9) {
                            obj = obtainStyledAttributes.getString(index);
                            i2 = 5;
                        } else if (index == 8) {
                            i = obtainStyledAttributes.getResourceId(index, -1);
                            if (i == -1) {
                                i = obtainStyledAttributes.getInt(index, -1);
                            }
                            i2 = 8;
                        }
                        obj = Integer.valueOf(i);
                    }
                    obj = Float.valueOf(f);
                    i2 = 7;
                }
                i = obtainStyledAttributes.getColor(index, 0);
                obj = Integer.valueOf(i);
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new meB98lbAo(str, i2, obj, z));
        }
        obtainStyledAttributes.recycle();
    }

    public void J4Ux7ym32(Object obj) {
        switch (vtDfS6nCt.tGV7Q6urW(this.tGV7Q6urW)) {
            case 0:
            case 7:
                this.dIocxURUo = ((Integer) obj).intValue();
                return;
            case 1:
            case 6:
                this.kCA6Zs9sL = ((Float) obj).floatValue();
                return;
            case 2:
            case 3:
                this.Puu3Rhg4F = ((Integer) obj).intValue();
                return;
            case 4:
                this.iiGwOFFnr = (String) obj;
                return;
            case 5:
                this.GPLPRo6go = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }
}
