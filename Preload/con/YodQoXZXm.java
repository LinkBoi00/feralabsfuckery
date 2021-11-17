package con;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
/* loaded from: classes.dex */
public final class YodQoXZXm {
    public static final YodQoXZXm q3BipwRCk = new YodQoXZXm();

    public final void J4Ux7ym32(tDoi4vPEw tdoi4vpew, Z6wpHNDNp z6wpHNDNp) {
        ArrayList arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(z6wpHNDNp, 10));
        Iterator<E> it = z6wpHNDNp.iterator();
        while (it.hasNext()) {
            arrayList.add(((ZabSbAsoV) it.next()).q3BipwRCk.q3BipwRCk);
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        Locale[] localeArr = (Locale[]) array;
        tdoi4vpew.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final Object q3BipwRCk(Z6wpHNDNp z6wpHNDNp) {
        ArrayList arrayList = new ArrayList(CjvsxH2Me.nlGCs0NZs(z6wpHNDNp, 10));
        Iterator<E> it = z6wpHNDNp.iterator();
        while (it.hasNext()) {
            arrayList.add(((ZabSbAsoV) it.next()).q3BipwRCk.q3BipwRCk);
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        Locale[] localeArr = (Locale[]) array;
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
