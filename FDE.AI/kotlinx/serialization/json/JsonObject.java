package kotlinx.serialization.json;

import con.GQN3dSqKV;
import con.TIYMCd0MU;
import con.ZLvfUL6D0;
import con.anXlDk6fV;
import con.dnBSj5uJN;
import con.f7VKpcPHS;
import con.wjjWl3mHt;
import con.wkFJfVmcv;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
@TIYMCd0MU(with = ZLvfUL6D0.class)
/* loaded from: classes.dex */
public final class JsonObject extends JsonElement implements Map, f7VKpcPHS {
    public static final Companion Companion = new Companion(null);
    public final Map CBQ5d1kRq;

    /* loaded from: classes.dex */
    public static final class Companion {
        public Companion(dnBSj5uJN dnbsj5ujn) {
        }

        public final wjjWl3mHt serializer() {
            return ZLvfUL6D0.q3BipwRCk;
        }
    }

    public JsonObject(Map map) {
        super(null);
        this.CBQ5d1kRq = map;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object compute(Object obj, BiFunction biFunction) {
        String str = (String) obj;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object computeIfAbsent(Object obj, Function function) {
        String str = (String) obj;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object computeIfPresent(Object obj, BiFunction biFunction) {
        String str = (String) obj;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.CBQ5d1kRq.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof JsonElement)) {
            return false;
        }
        return this.CBQ5d1kRq.containsValue((JsonElement) obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.CBQ5d1kRq.entrySet();
    }

    @Override // java.util.Map, java.lang.Object
    public boolean equals(Object obj) {
        return anXlDk6fV.tGV7Q6urW(this.CBQ5d1kRq, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (JsonElement) this.CBQ5d1kRq.get((String) obj);
    }

    @Override // java.util.Map, java.lang.Object
    public int hashCode() {
        return this.CBQ5d1kRq.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.CBQ5d1kRq.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.CBQ5d1kRq.keySet();
    }

    @Override // java.util.Map
    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        String str = (String) obj;
        JsonElement jsonElement = (JsonElement) obj2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        String str = (String) obj;
        JsonElement jsonElement = (JsonElement) obj2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object putIfAbsent(Object obj, Object obj2) {
        String str = (String) obj;
        JsonElement jsonElement = (JsonElement) obj2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object replace(Object obj, Object obj2) {
        String str = (String) obj;
        JsonElement jsonElement = (JsonElement) obj2;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.CBQ5d1kRq.size();
    }

    @Override // java.lang.Object
    public String toString() {
        return wkFJfVmcv.EBQXiIPmm(this.CBQ5d1kRq.entrySet(), ",", "{", "}", 0, null, GQN3dSqKV.V9LQMKGJe, 24);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.CBQ5d1kRq.values();
    }

    @Override // java.util.Map
    public boolean replace(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        JsonElement jsonElement = (JsonElement) obj2;
        JsonElement jsonElement2 = (JsonElement) obj3;
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
