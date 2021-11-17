package con;

import android.view.MotionEvent;
import java.util.List;
/* loaded from: classes.dex */
public final class v7oWlY5Vu {
    public final MotionEvent J4Ux7ym32;
    public int dIocxURUo;
    public final List q3BipwRCk;
    public final int tGV7Q6urW;

    public v7oWlY5Vu(List list, MotionEvent motionEvent) {
        this.q3BipwRCk = list;
        this.J4Ux7ym32 = motionEvent;
        int i = 0;
        this.tGV7Q6urW = motionEvent == null ? 0 : motionEvent.getButtonState();
        if (motionEvent != null) {
            motionEvent.getMetaState();
        }
        int i2 = 3;
        if (motionEvent != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 5) {
                            if (actionMasked != 6) {
                                if (actionMasked != 7) {
                                    if (actionMasked == 9) {
                                        ksLrMHgEz kslrmhgez = b5RwVV7V3.q3BipwRCk;
                                        ksLrMHgEz kslrmhgez2 = b5RwVV7V3.q3BipwRCk;
                                        i = 4;
                                    } else if (actionMasked != 10) {
                                        ksLrMHgEz kslrmhgez3 = b5RwVV7V3.q3BipwRCk;
                                        ksLrMHgEz kslrmhgez4 = b5RwVV7V3.q3BipwRCk;
                                    } else {
                                        ksLrMHgEz kslrmhgez5 = b5RwVV7V3.q3BipwRCk;
                                        ksLrMHgEz kslrmhgez6 = b5RwVV7V3.q3BipwRCk;
                                        i = 5;
                                    }
                                    i2 = i;
                                }
                            }
                        }
                    }
                    ksLrMHgEz kslrmhgez7 = b5RwVV7V3.q3BipwRCk;
                    ksLrMHgEz kslrmhgez8 = b5RwVV7V3.q3BipwRCk;
                    i = 3;
                    i2 = i;
                }
                ksLrMHgEz kslrmhgez9 = b5RwVV7V3.q3BipwRCk;
                ksLrMHgEz kslrmhgez10 = b5RwVV7V3.q3BipwRCk;
                i = 2;
                i2 = i;
            }
            ksLrMHgEz kslrmhgez11 = b5RwVV7V3.q3BipwRCk;
            ksLrMHgEz kslrmhgez12 = b5RwVV7V3.q3BipwRCk;
            i = 1;
            i2 = i;
        } else {
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i3 = i + 1;
                    cKAQplqZy ckaqplqzy = (cKAQplqZy) list.get(i);
                    if (ODug2UCW1.vPSbyrYWX(ckaqplqzy)) {
                        ksLrMHgEz kslrmhgez13 = b5RwVV7V3.q3BipwRCk;
                        ksLrMHgEz kslrmhgez14 = b5RwVV7V3.q3BipwRCk;
                        i2 = 2;
                        break;
                    } else if (ODug2UCW1.yWvV4ePLl(ckaqplqzy)) {
                        ksLrMHgEz kslrmhgez15 = b5RwVV7V3.q3BipwRCk;
                        ksLrMHgEz kslrmhgez16 = b5RwVV7V3.q3BipwRCk;
                        i2 = 1;
                        break;
                    } else if (i3 > size) {
                        break;
                    } else {
                        i = i3;
                    }
                }
            }
            ksLrMHgEz kslrmhgez17 = b5RwVV7V3.q3BipwRCk;
            ksLrMHgEz kslrmhgez18 = b5RwVV7V3.q3BipwRCk;
        }
        this.dIocxURUo = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v7oWlY5Vu)) {
            return false;
        }
        v7oWlY5Vu v7owly5vu = (v7oWlY5Vu) obj;
        return anXlDk6fV.tGV7Q6urW(this.q3BipwRCk, v7owly5vu.q3BipwRCk) && anXlDk6fV.tGV7Q6urW(this.J4Ux7ym32, v7owly5vu.J4Ux7ym32);
    }

    public int hashCode() {
        int hashCode = this.q3BipwRCk.hashCode() * 31;
        MotionEvent motionEvent = this.J4Ux7ym32;
        return hashCode + (motionEvent == null ? 0 : motionEvent.hashCode());
    }

    public String toString() {
        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("PointerEvent(changes=");
        q3BipwRCk.append(this.q3BipwRCk);
        q3BipwRCk.append(", motionEvent=");
        q3BipwRCk.append(this.J4Ux7ym32);
        q3BipwRCk.append(')');
        return q3BipwRCk.toString();
    }
}
