package con;

import java.util.Objects;
/* loaded from: classes.dex */
public final class Id32wUef2 {
    public final Object q3BipwRCk;

    public Id32wUef2(Object obj) {
        this.q3BipwRCk = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Id32wUef2.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.q3BipwRCk, ((Id32wUef2) obj).q3BipwRCk);
    }

    public int hashCode() {
        Object obj = this.q3BipwRCk;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("DisplayCutoutCompat{");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append("}");
        return q3BipwRCk.toString();
    }
}
