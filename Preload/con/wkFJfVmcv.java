package con;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class wkFJfVmcv extends lXExmygLE {
    public static String EBQXiIPmm(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, PmanMZxiM pmanMZxiM, int i2) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        String str = (i2 & 2) != 0 ? "" : charSequence2;
        String str2 = (i2 & 4) != 0 ? "" : charSequence3;
        if ((i2 & 8) != 0) {
            i = -1;
        }
        String str3 = (i2 & 16) != 0 ? "..." : null;
        PmanMZxiM pmanMZxiM2 = (i2 & 32) != 0 ? null : pmanMZxiM;
        StringBuilder sb = new StringBuilder();
        igRQEZxnW(iterable, sb, charSequence, str, str2, i, str3, pmanMZxiM2);
        return sb.toString();
    }

    public static final List IzM1cD9ly(Iterable iterable) {
        ArrayList arrayList;
        boolean z = iterable instanceof Collection;
        if (z) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return Dqz1pJHWH.CBQ5d1kRq;
            }
            if (size != 1) {
                return new ArrayList(collection);
            }
            return Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        if (z) {
            arrayList = new ArrayList((Collection) iterable);
        } else {
            arrayList = new ArrayList();
            ziwPzaoF3(iterable, arrayList);
        }
        return idpM54xlp.i8XZMQc6Z(arrayList);
    }

    public static final List L4EwGfXiQ(Collection collection, Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        lXExmygLE.mUqPm6GBh(arrayList2, iterable);
        return arrayList2;
    }

    public static final Object QNqj6nIzv(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final Float QSbMsHU5X(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final Object TyB1UUd72(List list) {
        if (!list.isEmpty()) {
            return list.get(idpM54xlp.CBQ5d1kRq(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final Object V9LQMKGJe(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static final List i0Zug1mVk(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Appendable igRQEZxnW(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, PmanMZxiM pmanMZxiM) {
        CharSequence charSequence5;
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            boolean z = true;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (pmanMZxiM != null) {
                obj = pmanMZxiM.IytU16YUK(obj);
            } else {
                if (obj != null) {
                    z = obj instanceof CharSequence;
                }
                if (!z) {
                    if (obj instanceof Character) {
                        appendable.append(((Character) obj).charValue());
                    } else {
                        charSequence5 = String.valueOf(obj);
                        appendable.append(charSequence5);
                    }
                }
            }
            charSequence5 = (CharSequence) obj;
            appendable.append(charSequence5);
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final Float j22ftfeNI(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    public static final Object juJ6pnCpu(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static final Set n4UIOvAko(Iterable iterable) {
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return bSc306J1d.CBQ5d1kRq;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(anXlDk6fV.WaUP0CF08(collection.size()));
            ziwPzaoF3(iterable, linkedHashSet);
            return linkedHashSet;
        }
        return Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final Object o4LF8RkoQ(List list) {
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final float[] wIZEdYHUn(Collection collection) {
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            i++;
            fArr[i] = ((Number) it.next()).floatValue();
        }
        return fArr;
    }

    public static final Object zHl31GGXU(Collection collection, frseFxszT frsefxszt) {
        if (!collection.isEmpty()) {
            int J4Ux7ym32 = frsefxszt.J4Ux7ym32(collection.size());
            boolean z = collection instanceof List;
            if (z) {
                return ((List) collection).get(J4Ux7ym32);
            }
            if (z) {
                List list = (List) collection;
                if (J4Ux7ym32 >= 0 && J4Ux7ym32 <= idpM54xlp.CBQ5d1kRq(list)) {
                    return list.get(J4Ux7ym32);
                }
            } else if (J4Ux7ym32 >= 0) {
                int i = 0;
                for (Object obj : collection) {
                    i++;
                    if (J4Ux7ym32 == i) {
                        return obj;
                    }
                }
            }
            Integer.valueOf(J4Ux7ym32).intValue();
            throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + J4Ux7ym32 + '.');
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final Collection ziwPzaoF3(Iterable iterable, Collection collection) {
        for (Object obj : iterable) {
            collection.add(obj);
        }
        return collection;
    }
}
