package con;

import kotlinx.serialization.json.JsonPrimitive;
/* loaded from: classes.dex */
public final class ECCL6mpE4 extends JsonPrimitive {
    public final String J4Ux7ym32;
    public final boolean q3BipwRCk;

    public ECCL6mpE4(Object obj, boolean z) {
        super(null);
        this.q3BipwRCk = z;
        this.J4Ux7ym32 = obj.toString();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String J4Ux7ym32() {
        return this.J4Ux7ym32;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !anXlDk6fV.tGV7Q6urW(YGTdT21e3.q3BipwRCk(ECCL6mpE4.class), YGTdT21e3.q3BipwRCk(obj.getClass()))) {
            return false;
        }
        ECCL6mpE4 eCCL6mpE4 = (ECCL6mpE4) obj;
        return this.q3BipwRCk == eCCL6mpE4.q3BipwRCk && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, eCCL6mpE4.J4Ux7ym32);
    }

    public int hashCode() {
        return this.J4Ux7ym32.hashCode() + (Boolean.valueOf(this.q3BipwRCk).hashCode() * 31);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public String toString() {
        if (!this.q3BipwRCk) {
            return this.J4Ux7ym32;
        }
        StringBuilder sb = new StringBuilder();
        if3rYjZeq.q3BipwRCk(sb, this.J4Ux7ym32);
        return sb.toString();
    }
}
