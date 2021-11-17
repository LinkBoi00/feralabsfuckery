package con;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class ZOOhBHi6I extends WdHQbIkKn implements Iterable, f7VKpcPHS {
    public final float Bhmn1KIah;
    public final String CBQ5d1kRq;
    public final float Eeka1udhb;
    public final float MzoOEjc4X;
    public final float PSTqBLTET;
    public final List RG6kpfv3v;
    public final List dXrmkklc8;
    public final float ilHKhw3Yw;
    public final float kmSgne1rO;
    public final float qVUwofr5s;

    public ZOOhBHi6I(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, List list2) {
        super(null);
        this.CBQ5d1kRq = str;
        this.kmSgne1rO = f;
        this.Bhmn1KIah = f2;
        this.PSTqBLTET = f3;
        this.MzoOEjc4X = f4;
        this.ilHKhw3Yw = f5;
        this.qVUwofr5s = f6;
        this.Eeka1udhb = f7;
        this.dXrmkklc8 = list;
        this.RG6kpfv3v = list2;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ZOOhBHi6I)) {
            return false;
        }
        ZOOhBHi6I zOOhBHi6I = (ZOOhBHi6I) obj;
        if (!anXlDk6fV.tGV7Q6urW(this.CBQ5d1kRq, zOOhBHi6I.CBQ5d1kRq)) {
            return false;
        }
        if (!(this.kmSgne1rO == zOOhBHi6I.kmSgne1rO)) {
            return false;
        }
        if (!(this.Bhmn1KIah == zOOhBHi6I.Bhmn1KIah)) {
            return false;
        }
        if (!(this.PSTqBLTET == zOOhBHi6I.PSTqBLTET)) {
            return false;
        }
        if (!(this.MzoOEjc4X == zOOhBHi6I.MzoOEjc4X)) {
            return false;
        }
        if (!(this.ilHKhw3Yw == zOOhBHi6I.ilHKhw3Yw)) {
            return false;
        }
        if (!(this.qVUwofr5s == zOOhBHi6I.qVUwofr5s)) {
            return false;
        }
        return ((this.Eeka1udhb > zOOhBHi6I.Eeka1udhb ? 1 : (this.Eeka1udhb == zOOhBHi6I.Eeka1udhb ? 0 : -1)) == 0) && anXlDk6fV.tGV7Q6urW(this.dXrmkklc8, zOOhBHi6I.dXrmkklc8) && anXlDk6fV.tGV7Q6urW(this.RG6kpfv3v, zOOhBHi6I.RG6kpfv3v);
    }

    @Override // java.lang.Object
    public int hashCode() {
        int q3BipwRCk = gXNsYvZus.q3BipwRCk(this.Eeka1udhb, gXNsYvZus.q3BipwRCk(this.qVUwofr5s, gXNsYvZus.q3BipwRCk(this.ilHKhw3Yw, gXNsYvZus.q3BipwRCk(this.MzoOEjc4X, gXNsYvZus.q3BipwRCk(this.PSTqBLTET, gXNsYvZus.q3BipwRCk(this.Bhmn1KIah, gXNsYvZus.q3BipwRCk(this.kmSgne1rO, this.CBQ5d1kRq.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
        return this.RG6kpfv3v.hashCode() + ((this.dXrmkklc8.hashCode() + q3BipwRCk) * 31);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new jRu4T1mV3(this);
    }
}
