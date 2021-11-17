package con;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import com.afollestad.materialdialogs.internal.button.DialogActionButton;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.CoroutineExceptionHandler;
/* loaded from: classes.dex */
public abstract class idpM54xlp {
    public static final void Bhmn1KIah(bu5cjmae6 bu5cjmae6, Throwable th) {
        try {
            int i = CoroutineExceptionHandler.vPSbyrYWX;
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) bu5cjmae6.get(CoroutineExceptionHandler.RG2GI7LDp.CBQ5d1kRq);
            if (coroutineExceptionHandler == null) {
                MQd4PTHGw.q3BipwRCk(bu5cjmae6, th);
            } else {
                coroutineExceptionHandler.handleException(bu5cjmae6, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                dnBSj5uJN.dIocxURUo(runtimeException, th);
                th = runtimeException;
            }
            MQd4PTHGw.q3BipwRCk(bu5cjmae6, th);
        }
    }

    public static final int CBQ5d1kRq(List list) {
        return list.size() - 1;
    }

    public static final String CpG0imbht(String str) {
        Comparable comparable;
        List ilHKhw3Yw = IFeOgs2Gp.ilHKhw3Yw(new CqYXp4s4a(r6NbD4wnj.j22ftfeNI(str, new String[]{"\r\n", "\n", "\r"}, 0, false, 0, 2), new nVhenZUxZ(str)));
        ArrayList arrayList = new ArrayList();
        for (Object obj : ilHKhw3Yw) {
            if (true ^ r6NbD4wnj.EBQXiIPmm((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CjvsxH2Me.nlGCs0NZs(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length = str2.length();
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (!Eeka1udhb(str2.charAt(i))) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                i = str2.length();
            }
            arrayList2.add(Integer.valueOf(i));
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int size = (ilHKhw3Yw.size() * 0) + str.length();
        JHFXdtjfx jHFXdtjfx = JHFXdtjfx.NyWTwPF6V;
        int CBQ5d1kRq = CBQ5d1kRq(ilHKhw3Yw);
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        for (Object obj2 : ilHKhw3Yw) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                String str3 = (String) obj2;
                if ((i2 == 0 || i2 == CBQ5d1kRq) && r6NbD4wnj.EBQXiIPmm(str3)) {
                    str3 = null;
                } else if (intValue >= 0) {
                    int length2 = str3.length();
                    if (intValue <= length2) {
                        length2 = intValue;
                    }
                    String str4 = (String) jHFXdtjfx.IytU16YUK(str3.substring(length2));
                    if (str4 != null) {
                        str3 = str4;
                    }
                } else {
                    throw new IllegalArgumentException(("Requested character count " + intValue + " is less than zero.").toString());
                }
                if (str3 != null) {
                    arrayList3.add(str3);
                }
                i2 = i3;
            } else {
                IytU16YUK();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(size);
        wkFJfVmcv.igRQEZxnW(arrayList3, sb, "\n", "", "", -1, "...", null);
        return sb.toString();
    }

    public static final boolean Eeka1udhb(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final boolean GPLPRo6go(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final void IytU16YUK() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static final int J4Ux7ym32(int i) {
        if (2 <= i && 36 >= i) {
            return i;
        }
        StringBuilder q3BipwRCk = Lf6t4dzRk.q3BipwRCk("radix ", i, " was not in valid range ");
        q3BipwRCk.append(new G8ebKyy85(2, 36));
        throw new IllegalArgumentException(q3BipwRCk.toString());
    }

    public static final void MzoOEjc4X(List list, WQpIMzWun wQpIMzWun) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((PmanMZxiM) it.next()).IytU16YUK(wQpIMzWun);
        }
    }

    public static final Way959ade PSTqBLTET(Way959ade way959ade) {
        H9pO9gJ32 h9pO9gJ32 = (H9pO9gJ32) (!(way959ade instanceof H9pO9gJ32) ? null : way959ade);
        if (h9pO9gJ32 == null) {
            return way959ade;
        }
        Way959ade way959ade2 = h9pO9gJ32.kmSgne1rO;
        if (way959ade2 != null) {
            return way959ade2;
        }
        bu5cjmae6 kCA6Zs9sL = h9pO9gJ32.kCA6Zs9sL();
        int i = V2LokvvBN.dIocxURUo;
        V2LokvvBN v2LokvvBN = (V2LokvvBN) kCA6Zs9sL.get(wrCZc9nGY.CBQ5d1kRq);
        Way959ade c27z9ohjq = v2LokvvBN != null ? new c27z9OHjq((xaeEKvU2c) v2LokvvBN, h9pO9gJ32) : h9pO9gJ32;
        h9pO9gJ32.kmSgne1rO = c27z9ohjq;
        return c27z9ohjq;
    }

    public static zG81huwZq Puu3Rhg4F(zG81huwZq zg81huwzq, adUS3SHb2 adus3shb2) {
        if (anXlDk6fV.tGV7Q6urW(zg81huwzq.getKey(), adus3shb2)) {
            return zg81huwzq;
        }
        return null;
    }

    public static /* synthetic */ JEWwjBE8f RG6kpfv3v(oQkvjGXIr oqkvjgxir, bu5cjmae6 bu5cjmae6, int i, kkcQgCx5G kkcqgcx5g, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bu5cjmae6 = HbUTGjFCZ.CBQ5d1kRq;
        }
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return dXrmkklc8(oqkvjgxir, bu5cjmae6, i, kkcqgcx5g);
    }

    public static final List WaUP0CF08(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new p5Q4EA2Wh(objArr, true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (r1 == null) goto L_0x003f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
        r4 = r4.plus(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r1 == null) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final Object cAwN510t2(bu5cjmae6 bu5cjmae6, kkcQgCx5G kkcqgcx5g) {
        xaeEKvU2c xaeekvu2c;
        ev1IlyvL8 ev1ilyvl8;
        xaeEKvU2c xaeekvu2c2;
        xaeEKvU2c xaeekvu2c3;
        Thread currentThread = Thread.currentThread();
        wrCZc9nGY wrczc9ngy = wrCZc9nGY.CBQ5d1kRq;
        xaeEKvU2c xaeekvu2c4 = (xaeEKvU2c) bu5cjmae6;
        V2LokvvBN v2LokvvBN = (V2LokvvBN) xaeekvu2c4.get(wrczc9ngy);
        if (v2LokvvBN == null) {
            IO5CrIj0i iO5CrIj0i = IO5CrIj0i.q3BipwRCk;
            ev1ilyvl8 = IO5CrIj0i.q3BipwRCk();
            bu5cjmae6 plus = xaeekvu2c4.plus(ev1ilyvl8);
            xaeekvu2c3 = tQmFGxsat.q3BipwRCk;
            xaeekvu2c = plus;
            if (plus != xaeekvu2c3) {
                zG81huwZq zg81huwzq = plus.get(wrczc9ngy);
                xaeekvu2c2 = plus;
                xaeekvu2c = plus;
            }
        } else {
            if (v2LokvvBN instanceof ev1IlyvL8) {
                ev1IlyvL8 ev1ilyvl82 = (ev1IlyvL8) v2LokvvBN;
            }
            IO5CrIj0i iO5CrIj0i2 = IO5CrIj0i.q3BipwRCk;
            ev1ilyvl8 = (ev1IlyvL8) IO5CrIj0i.J4Ux7ym32.get();
            xaeekvu2c3 = tQmFGxsat.q3BipwRCk;
            xaeekvu2c = xaeekvu2c4;
            if (xaeekvu2c4 != xaeekvu2c3) {
                zG81huwZq zg81huwzq2 = xaeekvu2c4.get(wrczc9ngy);
                xaeekvu2c2 = xaeekvu2c4;
                xaeekvu2c = xaeekvu2c4;
            }
        }
        y7qLT84T0 y7qlt84t0 = new y7qLT84T0(xaeekvu2c, currentThread, ev1ilyvl8);
        y7qlt84t0.j22ftfeNI(1, y7qlt84t0, kkcqgcx5g);
        ev1IlyvL8 ev1ilyvl83 = y7qlt84t0.PSTqBLTET;
        if (ev1ilyvl83 != null) {
            int i = ev1IlyvL8.MzoOEjc4X;
            ev1ilyvl83.Bhmn1KIah(false);
        }
        while (!Thread.interrupted()) {
            ev1IlyvL8 ev1ilyvl84 = y7qlt84t0.PSTqBLTET;
            long MzoOEjc4X = ev1ilyvl84 == null ? Long.MAX_VALUE : ev1ilyvl84.MzoOEjc4X();
            if (!(y7qlt84t0.i8XZMQc6Z() instanceof S35qAAg28)) {
                ev1IlyvL8 ev1ilyvl85 = y7qlt84t0.PSTqBLTET;
                if (ev1ilyvl85 != null) {
                    int i2 = ev1IlyvL8.MzoOEjc4X;
                    ev1ilyvl85.oon79WMrY(false);
                }
                Object q3BipwRCk = AB5ApHoQM.q3BipwRCk(y7qlt84t0.i8XZMQc6Z());
                zo6RfsWe2 zo6rfswe2 = q3BipwRCk instanceof zo6RfsWe2 ? (zo6RfsWe2) q3BipwRCk : null;
                if (zo6rfswe2 == null) {
                    return q3BipwRCk;
                }
                throw zo6rfswe2.q3BipwRCk;
            }
            LockSupport.parkNanos(y7qlt84t0, MzoOEjc4X);
        }
        InterruptedException interruptedException = new InterruptedException();
        y7qlt84t0.vPSbyrYWX(interruptedException);
        throw interruptedException;
    }

    public static final Way959ade dIocxURUo(kkcQgCx5G kkcqgcx5g, Object obj, Way959ade way959ade) {
        if (kkcqgcx5g instanceof LxklW3zxE) {
            return ((LxklW3zxE) kkcqgcx5g).dIocxURUo(obj, way959ade);
        }
        bu5cjmae6 kCA6Zs9sL = way959ade.kCA6Zs9sL();
        return kCA6Zs9sL == HbUTGjFCZ.CBQ5d1kRq ? new xTazP6AcP(way959ade, way959ade, kkcqgcx5g, obj) : new m5ctV55Uh(way959ade, kCA6Zs9sL, way959ade, kCA6Zs9sL, kkcqgcx5g, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [con.JEWwjBE8f, con.Y371ZqMzx, java.lang.Object] */
    public static final JEWwjBE8f dXrmkklc8(oQkvjGXIr oqkvjgxir, bu5cjmae6 bu5cjmae6, int i, kkcQgCx5G kkcqgcx5g) {
        bu5cjmae6 q3BipwRCk = MfTZnip0T.q3BipwRCk(oqkvjgxir, bu5cjmae6);
        vtDfS6nCt.kCA6Zs9sL(i);
        EYDGn8U4M eYDGn8U4M = i == 2 ? new EYDGn8U4M(q3BipwRCk, kkcqgcx5g) : new LGsjuYp4a(q3BipwRCk, true);
        eYDGn8U4M.j22ftfeNI(i, eYDGn8U4M, kkcqgcx5g);
        return eYDGn8U4M;
    }

    public static bu5cjmae6 dfpT1j18n(zG81huwZq zg81huwzq, bu5cjmae6 bu5cjmae6) {
        return bu5cjmae6 == HbUTGjFCZ.CBQ5d1kRq ? zg81huwzq : (bu5cjmae6) bu5cjmae6.fold(zg81huwzq, pSdrExTbX.i0Zug1mVk);
    }

    public static final List i8XZMQc6Z(List list) {
        int size = list.size();
        if (size == 0) {
            return Dqz1pJHWH.CBQ5d1kRq;
        }
        if (size != 1) {
            return list;
        }
        return Collections.singletonList(list.get(0));
    }

    public static int iMyQMM6Qj(WQpIMzWun wQpIMzWun, Integer num, Integer num2, gdEmqfwpT gdemqfwpt, int i) {
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            gdemqfwpt = null;
        }
        Context context = wQpIMzWun.WaUP0CF08;
        if (num2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{num2.intValue()});
            try {
                int color = obtainStyledAttributes.getColor(0, 0);
                if (color == 0 && gdemqfwpt != null) {
                    color = ((Number) ((sB4KKf1D2) gdemqfwpt).GPLPRo6go()).intValue();
                }
                return color;
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            Object obj = D856HTNqd.q3BipwRCk;
            return nHNpaD9No.q3BipwRCk(context, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Uri iiGwOFFnr(String str, String str2, PmanMZxiM pmanMZxiM, int i) {
        Uri uri;
        int i2 = i & 4;
        Throwable th = null;
        JHFXdtjfx jHFXdtjfx = i2 != 0 ? JHFXdtjfx.mUqPm6GBh : th;
        URLConnection openConnection = new URL(str).openConnection();
        Objects.requireNonNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        if (httpURLConnection.getResponseCode() == 200) {
            InputStream inputStream = httpURLConnection.getInputStream();
            File file = new File(str2);
            file.createNewFile();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read < 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                D3DEikrvb.Puu3Rhg4F(inputStream, th);
                uri = Uri.fromFile(file);
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } else {
            uri = th;
        }
        httpURLConnection.disconnect();
        if (uri != 0) {
            jHFXdtjfx.IytU16YUK(uri);
        } else {
            jHFXdtjfx.IytU16YUK(th);
        }
        return uri;
    }

    public static final boolean ilHKhw3Yw(View view) {
        return view.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    public static final List ixWaw2akD(Object... objArr) {
        if (objArr.length > 0) {
            return Arrays.asList(objArr);
        }
        return Dqz1pJHWH.CBQ5d1kRq;
    }

    public static final void kCA6Zs9sL(Z3EvbqMGQ z3EvbqMGQ, clUYjTSq7 cluyjtsq7) {
        ((tmgChDFqU) z3EvbqMGQ).RG6kpfv3v(new zdlldOQtb(cluyjtsq7));
    }

    public static final tmgChDFqU kmSgne1rO(Way959ade way959ade) {
        if (!(way959ade instanceof c27z9OHjq)) {
            return new tmgChDFqU(way959ade, 1);
        }
        tmgChDFqU yWvV4ePLl = ((c27z9OHjq) way959ade).yWvV4ePLl();
        yWvV4ePLl = null;
        if (yWvV4ePLl == null || !yWvV4ePLl.dfpT1j18n()) {
        }
        return yWvV4ePLl == null ? new tmgChDFqU(way959ade, 2) : yWvV4ePLl;
    }

    public static final Class oon79WMrY(WwFGbLVWX wwFGbLVWX) {
        Class q3BipwRCk = ((SPxpCpatl) wwFGbLVWX).q3BipwRCk();
        Objects.requireNonNull(q3BipwRCk, "null cannot be cast to non-null type java.lang.Class<T>");
        return q3BipwRCk;
    }

    public static final ArrayList q3BipwRCk(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new p5Q4EA2Wh(objArr, true));
    }

    public static final Object qFBXIgpia(bu5cjmae6 bu5cjmae6, kkcQgCx5G kkcqgcx5g, Way959ade way959ade) {
        bu5cjmae6 kCA6Zs9sL = way959ade.kCA6Zs9sL();
        bu5cjmae6 plus = kCA6Zs9sL.plus(bu5cjmae6);
        anXlDk6fV.vPSbyrYWX(plus);
        if (plus == kCA6Zs9sL) {
            UuvLiXwHL uuvLiXwHL = new UuvLiXwHL(plus, way959ade);
            return cOutqbkMD.CBQ5d1kRq(uuvLiXwHL, uuvLiXwHL, kkcqgcx5g);
        }
        int i = V2LokvvBN.dIocxURUo;
        wrCZc9nGY wrczc9ngy = wrCZc9nGY.CBQ5d1kRq;
        if (anXlDk6fV.tGV7Q6urW(plus.get(wrczc9ngy), kCA6Zs9sL.get(wrczc9ngy))) {
            oDbW63V52 odbw63v52 = new oDbW63V52(plus, way959ade);
            Object J4Ux7ym32 = cclHSBzpG.J4Ux7ym32(plus, null);
            try {
                return cOutqbkMD.CBQ5d1kRq(odbw63v52, odbw63v52, kkcqgcx5g);
            } finally {
                cclHSBzpG.q3BipwRCk(plus, J4Ux7ym32);
            }
        } else {
            dAVzucgqj davzucgqj = new dAVzucgqj(plus, way959ade);
            rTcohQ78k.yWvV4ePLl(kkcqgcx5g, davzucgqj, davzucgqj, null, 4);
            return davzucgqj.QSbMsHU5X();
        }
    }

    public static final boolean qVUwofr5s(View view) {
        if (view instanceof Button) {
            Button button = (Button) view;
            if (button.getVisibility() != 0 || !(!r6NbD4wnj.EBQXiIPmm(r6NbD4wnj.BL4OzhZBd(button.getText())))) {
                return false;
            }
        } else if (view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public static bu5cjmae6 sk5s77z6Q(zG81huwZq zg81huwzq, adUS3SHb2 adus3shb2) {
        Objects.requireNonNull(zg81huwzq);
        return anXlDk6fV.tGV7Q6urW(y5p19vMdC.CBQ5d1kRq, adus3shb2) ? HbUTGjFCZ.CBQ5d1kRq : zg81huwzq;
    }

    public static final void tGV7Q6urW(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
        }
    }

    public static final Class vPSbyrYWX(WwFGbLVWX wwFGbLVWX) {
        Class q3BipwRCk = ((SPxpCpatl) wwFGbLVWX).q3BipwRCk();
        if (!q3BipwRCk.isPrimitive()) {
            return q3BipwRCk;
        }
        String name = q3BipwRCk.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return name.equals("double") ? Double.class : q3BipwRCk;
            case 104431:
                return name.equals("int") ? Integer.class : q3BipwRCk;
            case 3039496:
                return name.equals("byte") ? Byte.class : q3BipwRCk;
            case 3052374:
                return name.equals("char") ? Character.class : q3BipwRCk;
            case 3327612:
                return name.equals("long") ? Long.class : q3BipwRCk;
            case 3625364:
                return name.equals("void") ? Void.class : q3BipwRCk;
            case 64711720:
                return name.equals("boolean") ? Boolean.class : q3BipwRCk;
            case 97526364:
                return name.equals("float") ? Float.class : q3BipwRCk;
            case 109413500:
                return name.equals("short") ? Short.class : q3BipwRCk;
            default:
                return q3BipwRCk;
        }
    }

    public static final DialogActionButton yWvV4ePLl(WQpIMzWun wQpIMzWun, LzT8CF9ie lzT8CF9ie) {
        DialogActionButton[] actionButtons;
        DialogActionButton dialogActionButton;
        DialogActionButtonLayout buttonsLayout = wQpIMzWun.Eeka1udhb.getButtonsLayout();
        if (buttonsLayout != null && (actionButtons = buttonsLayout.getActionButtons()) != null && (dialogActionButton = actionButtons[lzT8CF9ie.CBQ5d1kRq]) != null) {
            return dialogActionButton;
        }
        throw new IllegalStateException("The dialog does not have an attached buttons layout.");
    }
}
