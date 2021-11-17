package con;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public abstract class s0tSbdszx extends anXlDk6fV {
    public static final Map AqaWJg0b4(n4f84B5OG... n4f84b5ogArr) {
        if (n4f84b5ogArr.length <= 0) {
            return dmnvfTTyg.CBQ5d1kRq;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(anXlDk6fV.WaUP0CF08(n4f84b5ogArr.length));
        for (n4f84B5OG n4f84b5og : n4f84b5ogArr) {
            linkedHashMap.put(n4f84b5og.CBQ5d1kRq, n4f84b5og.kmSgne1rO);
        }
        return linkedHashMap;
    }

    public static final Map NyWTwPF6V(Iterable iterable, Map map) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            n4f84B5OG n4f84b5og = (n4f84B5OG) it.next();
            map.put(n4f84b5og.CBQ5d1kRq, n4f84b5og.kmSgne1rO);
        }
        return map;
    }

    public static final Map mUqPm6GBh(Iterable iterable) {
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return dmnvfTTyg.CBQ5d1kRq;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(anXlDk6fV.WaUP0CF08(collection.size()));
            NyWTwPF6V(iterable, linkedHashMap);
            return linkedHashMap;
        }
        n4f84B5OG n4f84b5og = (n4f84B5OG) ((List) iterable).get(0);
        return Collections.singletonMap(n4f84b5og.CBQ5d1kRq, n4f84b5og.kmSgne1rO);
    }

    public static final Object nlGCs0NZs(Map map, Object obj) {
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }
}
