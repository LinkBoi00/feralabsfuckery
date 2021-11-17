package con;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewParent;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import com.feravolt.preload.R;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public abstract class pA5wCkne4 {
    public static void AqaWJg0b4(OutputStream outputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((int) ((j >> (i2 * 8)) & 255));
        }
        outputStream.write(bArr);
    }

    public static GezE1KLaf Bhmn1KIah(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlPullParser.require(2, null, "font-family");
            if (xmlPullParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), enT8o71oS.J4Ux7ym32);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            if (xmlPullParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), enT8o71oS.tGV7Q6urW);
                                int i = 8;
                                if (!obtainAttributes2.hasValue(8)) {
                                    i = 1;
                                }
                                int i2 = obtainAttributes2.getInt(i, 400);
                                boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                                int i3 = 9;
                                if (!obtainAttributes2.hasValue(9)) {
                                    i3 = 3;
                                }
                                int i4 = 7;
                                if (!obtainAttributes2.hasValue(7)) {
                                    i4 = 4;
                                }
                                String string5 = obtainAttributes2.getString(i4);
                                int i5 = obtainAttributes2.getInt(i3, 0);
                                int i6 = obtainAttributes2.hasValue(5) ? 5 : 0;
                                int resourceId2 = obtainAttributes2.getResourceId(i6, 0);
                                String string6 = obtainAttributes2.getString(i6);
                                obtainAttributes2.recycle();
                                while (xmlPullParser.next() != 3) {
                                    cAwN510t2(xmlPullParser);
                                }
                                arrayList.add(new U90DuDsYT(string6, i2, z, string5, i5, resourceId2));
                            } else {
                                cAwN510t2(xmlPullParser);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return new fyPKNAQNN((U90DuDsYT[]) arrayList.toArray(new U90DuDsYT[arrayList.size()]));
                    }
                } else {
                    while (xmlPullParser.next() != 3) {
                        cAwN510t2(xmlPullParser);
                    }
                    return new p2QtUSFos(new SfQ6fqrlg(string, string2, string3, MzoOEjc4X(resources, resourceId)), integer, integer2, string4);
                }
            } else {
                cAwN510t2(xmlPullParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static final boolean CBQ5d1kRq(Context context) {
        int i;
        Integer num = 16842806;
        boolean z = true;
        if (num != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{num.intValue()});
            try {
                i = obtainStyledAttributes.getColor(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            Object obj = D856HTNqd.q3BipwRCk;
            i = nHNpaD9No.q3BipwRCk(context, 0);
        }
        if (i == 0) {
            return false;
        }
        if (((double) 1) - (((((double) Color.blue(i)) * 0.114d) + ((((double) Color.green(i)) * 0.587d) + (((double) Color.red(i)) * 0.299d))) / ((double) 255)) < 0.5d) {
            z = false;
        }
        return z;
    }

    public static int CpG0imbht(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    public static int Eeka1udhb(InputStream inputStream) {
        return (int) qVUwofr5s(inputStream, 2);
    }

    public static final int GPLPRo6go(List list, int i) {
        char c;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            kuiy8woQ5 kuiy8woq5 = (kuiy8woQ5) list.get(i3);
            if (kuiy8woq5.dIocxURUo > i) {
                c = 1;
            } else {
                c = kuiy8woq5.kCA6Zs9sL <= i ? (char) 65535 : 0;
            }
            if (c < 0) {
                i2 = i3 + 1;
            } else if (c <= 0) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static List IytU16YUK(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    public static int J4Ux7ym32(RecyclerView.kvFwRYSUX kvfwrysux, Fj4Wp9wly fj4Wp9wly, View view, View view2, RecyclerView.LULQkQlc9 lULQkQlc9, boolean z) {
        if (lULQkQlc9.WaUP0CF08() == 0 || kvfwrysux.J4Ux7ym32() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(lULQkQlc9.TyB1UUd72(view) - lULQkQlc9.TyB1UUd72(view2)) + 1;
        }
        return Math.min(fj4Wp9wly.CBQ5d1kRq(), fj4Wp9wly.J4Ux7ym32(view2) - fj4Wp9wly.kCA6Zs9sL(view));
    }

    public static List MzoOEjc4X(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(IytU16YUK(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(IytU16YUK(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void NyWTwPF6V(OutputStream outputStream, int i) {
        AqaWJg0b4(outputStream, (long) i, 1);
    }

    public static byte[] PSTqBLTET(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw new IllegalStateException("Not enough bytes to read: " + i);
            }
        }
        return bArr;
    }

    public static final int Puu3Rhg4F(List list, float f) {
        char c;
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            kuiy8woQ5 kuiy8woq5 = (kuiy8woQ5) list.get(i2);
            if (kuiy8woq5.iiGwOFFnr > f) {
                c = 1;
            } else {
                c = kuiy8woq5.GPLPRo6go <= f ? (char) 65535 : 0;
            }
            if (c < 0) {
                i = i2 + 1;
            } else if (c <= 0) {
                return i2;
            } else {
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static int RG6kpfv3v(InputStream inputStream) {
        return (int) qVUwofr5s(inputStream, 1);
    }

    public static final void WaUP0CF08(Spannable spannable, long j, int i, int i2) {
        JhpbRXxsg jhpbRXxsg = bO2dbmrf7.J4Ux7ym32;
        if (j != bO2dbmrf7.Puu3Rhg4F) {
            spannable.setSpan(new BackgroundColorSpan(xpuSUT7Gh.R2hkbNqWf(j)), i, i2, 33);
        }
    }

    public static void cAwN510t2(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static int dIocxURUo(RecyclerView.kvFwRYSUX kvfwrysux, Fj4Wp9wly fj4Wp9wly, View view, View view2, RecyclerView.LULQkQlc9 lULQkQlc9, boolean z) {
        if (lULQkQlc9.WaUP0CF08() == 0 || kvfwrysux.J4Ux7ym32() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return kvfwrysux.J4Ux7ym32();
        }
        return (int) ((((float) (fj4Wp9wly.J4Ux7ym32(view2) - fj4Wp9wly.kCA6Zs9sL(view))) / ((float) (Math.abs(lULQkQlc9.TyB1UUd72(view) - lULQkQlc9.TyB1UUd72(view2)) + 1))) * ((float) kvfwrysux.J4Ux7ym32()));
    }

    public static long dXrmkklc8(InputStream inputStream) {
        return qVUwofr5s(inputStream, 4);
    }

    public static final void dfpT1j18n(Spannable spannable, long j, AU29aHa4X aU29aHa4X, int i, int i2) {
        long J4Ux7ym32 = QnjhYJNrZ.J4Ux7ym32(j);
        if (fzM0nB5KM.q3BipwRCk(J4Ux7ym32, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(D3DEikrvb.Eeka1udhb(aU29aHa4X.ilHKhw3Yw(j)), false), i, i2, 33);
        } else if (fzM0nB5KM.q3BipwRCk(J4Ux7ym32, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(QnjhYJNrZ.tGV7Q6urW(j)), i, i2, 33);
        }
    }

    public static final void i8XZMQc6Z(Spannable spannable, long j, int i, int i2) {
        JhpbRXxsg jhpbRXxsg = bO2dbmrf7.J4Ux7ym32;
        if (j != bO2dbmrf7.Puu3Rhg4F) {
            spannable.setSpan(new ForegroundColorSpan(xpuSUT7Gh.R2hkbNqWf(j)), i, i2, 33);
        }
    }

    public static final boolean iMyQMM6Qj(DialogActionButtonLayout dialogActionButtonLayout) {
        if (dialogActionButtonLayout == null) {
            return false;
        }
        return ((dialogActionButtonLayout.getVisibleButtons().length == 0) ^ true) || idpM54xlp.qVUwofr5s(dialogActionButtonLayout.getCheckBoxPrompt());
    }

    public static final int iiGwOFFnr(List list, int i) {
        char c;
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            kuiy8woQ5 kuiy8woq5 = (kuiy8woQ5) list.get(i3);
            if (kuiy8woq5.J4Ux7ym32 > i) {
                c = 1;
            } else {
                c = kuiy8woq5.tGV7Q6urW <= i ? (char) 65535 : 0;
            }
            if (c < 0) {
                i2 = i3 + 1;
            } else if (c <= 0) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
        if (r0.finished() == false) goto L_0x0061;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static byte[] ilHKhw3Yw(java.io.InputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: all -> 0x0088
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: all -> 0x0088
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x000e:
            boolean r6 = r0.finished()     // Catch: all -> 0x0088
            if (r6 != 0) goto L_0x0055
            boolean r6 = r0.needsDictionary()     // Catch: all -> 0x0088
            if (r6 != 0) goto L_0x0055
            if (r4 >= r9) goto L_0x0055
            int r6 = r8.read(r2)     // Catch: all -> 0x0088
            if (r6 < 0) goto L_0x0039
            r0.setInput(r2, r3, r6)     // Catch: all -> 0x0088
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: DataFormatException -> 0x002e, all -> 0x0088
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto L_0x000e
        L_0x002e:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: all -> 0x0088
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: all -> 0x0088
            r9.<init>(r8)     // Catch: all -> 0x0088
            throw r9     // Catch: all -> 0x0088
        L_0x0039:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: all -> 0x0088
            r8.<init>()     // Catch: all -> 0x0088
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: all -> 0x0088
            r8.append(r9)     // Catch: all -> 0x0088
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: all -> 0x0088
            java.lang.String r8 = r8.toString()     // Catch: all -> 0x0088
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: all -> 0x0088
            r9.<init>(r8)     // Catch: all -> 0x0088
            throw r9     // Catch: all -> 0x0088
        L_0x0055:
            if (r4 != r9) goto L_0x0069
            boolean r8 = r0.finished()     // Catch: all -> 0x0088
            if (r8 == 0) goto L_0x0061
            r0.end()
            return r1
        L_0x0061:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: all -> 0x0088
            r9.<init>(r8)     // Catch: all -> 0x0088
            throw r9     // Catch: all -> 0x0088
        L_0x0069:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: all -> 0x0088
            r8.<init>()     // Catch: all -> 0x0088
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: all -> 0x0088
            r8.append(r9)     // Catch: all -> 0x0088
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: all -> 0x0088
            r8.append(r4)     // Catch: all -> 0x0088
            java.lang.String r8 = r8.toString()     // Catch: all -> 0x0088
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: all -> 0x0088
            r9.<init>(r8)     // Catch: all -> 0x0088
            throw r9     // Catch: all -> 0x0088
        L_0x0088:
            r8 = move-exception
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: con.pA5wCkne4.ilHKhw3Yw(java.io.InputStream, int, int):byte[]");
    }

    public static final BgIsSUB3d ixWaw2akD(BgIsSUB3d bgIsSUB3d, boolean z, PmanMZxiM pmanMZxiM) {
        boolean z2 = Rjnc3TWC6.q3BipwRCk;
        return gThLCaTO1.vPSbyrYWX(bgIsSUB3d, f7B6YCXHx.kmSgne1rO, new KjVLwXLwH(z, pmanMZxiM));
    }

    public static final float kCA6Zs9sL(View view, int i) {
        return TypedValue.applyDimension(1, (float) i, view.getResources().getDisplayMetrics());
    }

    public static float kmSgne1rO(EdgeEffect edgeEffect, float f, float f2) {
        if (SacA58h0y.q3BipwRCk()) {
            return reQoeNd7H.tGV7Q6urW(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public static void mUqPm6GBh(OutputStream outputStream, int i) {
        AqaWJg0b4(outputStream, (long) i, 2);
    }

    public static void nlGCs0NZs(OutputStream outputStream, String str) {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static XHpudBVT5 oon79WMrY(View view) {
        XHpudBVT5 xHpudBVT5 = (XHpudBVT5) view.getTag(R.id.view_tree_saved_state_registry_owner);
        if (xHpudBVT5 != null) {
            return xHpudBVT5;
        }
        while (true) {
            ViewParent parent = view.getParent();
            if (xHpudBVT5 != null || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
            xHpudBVT5 = (XHpudBVT5) view.getTag(R.id.view_tree_saved_state_registry_owner);
        }
        return xHpudBVT5;
    }

    public static final int q3BipwRCk(float f) {
        return (int) ((float) Math.ceil((double) f));
    }

    public static void qFBXIgpia(OutputStream outputStream, byte[] bArr) {
        AqaWJg0b4(outputStream, (long) bArr.length, 4);
        Deflater deflater = new Deflater(1);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            AqaWJg0b4(outputStream, (long) byteArray.length, 4);
            outputStream.write(byteArray);
        } finally {
            deflater.end();
        }
    }

    public static long qVUwofr5s(InputStream inputStream, int i) {
        byte[] PSTqBLTET = PSTqBLTET(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (PSTqBLTET[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    public static /* synthetic */ BgIsSUB3d sk5s77z6Q(BgIsSUB3d bgIsSUB3d, boolean z, PmanMZxiM pmanMZxiM, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        return ixWaw2akD(bgIsSUB3d, z, pmanMZxiM);
    }

    public static int tGV7Q6urW(RecyclerView.kvFwRYSUX kvfwrysux, Fj4Wp9wly fj4Wp9wly, View view, View view2, RecyclerView.LULQkQlc9 lULQkQlc9, boolean z, boolean z2) {
        if (lULQkQlc9.WaUP0CF08() == 0 || kvfwrysux.J4Ux7ym32() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (kvfwrysux.J4Ux7ym32() - Math.max(lULQkQlc9.TyB1UUd72(view), lULQkQlc9.TyB1UUd72(view2))) - 1) : Math.max(0, Math.min(lULQkQlc9.TyB1UUd72(view), lULQkQlc9.TyB1UUd72(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(fj4Wp9wly.J4Ux7ym32(view2) - fj4Wp9wly.kCA6Zs9sL(view))) / ((float) (Math.abs(lULQkQlc9.TyB1UUd72(view) - lULQkQlc9.TyB1UUd72(view2)) + 1)))) + ((float) (fj4Wp9wly.vPSbyrYWX() - fj4Wp9wly.kCA6Zs9sL(view))));
    }

    public static float vPSbyrYWX(EdgeEffect edgeEffect) {
        if (SacA58h0y.q3BipwRCk()) {
            return reQoeNd7H.J4Ux7ym32(edgeEffect);
        }
        return 0.0f;
    }

    public static BgHiMFrEI yWvV4ePLl(View view) {
        BgHiMFrEI bgHiMFrEI = (BgHiMFrEI) view.getTag(R.id.view_tree_lifecycle_owner);
        if (bgHiMFrEI != null) {
            return bgHiMFrEI;
        }
        while (true) {
            ViewParent parent = view.getParent();
            if (bgHiMFrEI != null || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
            bgHiMFrEI = (BgHiMFrEI) view.getTag(R.id.view_tree_lifecycle_owner);
        }
        return bgHiMFrEI;
    }
}
