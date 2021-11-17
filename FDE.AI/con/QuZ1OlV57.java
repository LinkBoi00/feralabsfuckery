package con;

import android.content.res.ColorStateList;
import android.graphics.Shader;
/* loaded from: classes.dex */
public final class QuZ1OlV57 {
    public int J4Ux7ym32;
    public Object dIocxURUo;
    public final /* synthetic */ int q3BipwRCk;
    public Object tGV7Q6urW;

    public QuZ1OlV57() {
        this.q3BipwRCk = 0;
        this.tGV7Q6urW = new Object[4];
        this.dIocxURUo = new int[4];
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x01c1, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List, float, java.util.ArrayList] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static con.QuZ1OlV57 q3BipwRCk(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
        // Method dump skipped, instructions count: 652
        */
        throw new UnsupportedOperationException("Method not decompiled: con.QuZ1OlV57.q3BipwRCk(android.content.res.Resources, int, android.content.res.Resources$Theme):con.QuZ1OlV57");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a5, code lost:
        r7 = -r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public int J4Ux7ym32(java.lang.Object r7) {
        /*
        // Method dump skipped, instructions count: 242
        */
        throw new UnsupportedOperationException("Method not decompiled: con.QuZ1OlV57.J4Ux7ym32(java.lang.Object):int");
    }

    public boolean dIocxURUo() {
        return ((Shader) this.tGV7Q6urW) != null;
    }

    public boolean iiGwOFFnr() {
        return dIocxURUo() || this.J4Ux7ym32 != 0;
    }

    public void kCA6Zs9sL(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z = false;
        switch (this.q3BipwRCk) {
            case 0:
                int i5 = this.J4Ux7ym32 - 1;
                int identityHashCode = System.identityHashCode(obj);
                int i6 = 0;
                while (true) {
                    if (i6 > i5) {
                        i = -(i6 + 1);
                        break;
                    } else {
                        i = (i6 + i5) >>> 1;
                        Object obj3 = ((Object[]) this.tGV7Q6urW)[i];
                        int identityHashCode2 = System.identityHashCode(obj3) - identityHashCode;
                        if (identityHashCode2 >= 0) {
                            if (identityHashCode2 <= 0) {
                                if (obj3 != obj) {
                                    switch (this.q3BipwRCk) {
                                        case 0:
                                            i2 = i - 1;
                                            if (i2 >= 0) {
                                                while (true) {
                                                    int i7 = i2 - 1;
                                                    Object obj4 = ((Object[]) this.tGV7Q6urW)[i2];
                                                    if (obj4 == obj) {
                                                        break;
                                                    } else if (System.identityHashCode(obj4) == identityHashCode && i7 >= 0) {
                                                        i2 = i7;
                                                    }
                                                }
                                            }
                                            i++;
                                            int i8 = this.J4Ux7ym32;
                                            if (i < i8) {
                                                while (true) {
                                                    i3 = i + 1;
                                                    Object obj5 = ((Object[]) this.tGV7Q6urW)[i];
                                                    if (obj5 == obj) {
                                                        break;
                                                    } else if (System.identityHashCode(obj5) != identityHashCode) {
                                                        break;
                                                    } else if (i3 < i8) {
                                                        i = i3;
                                                    }
                                                }
                                            }
                                            i4 = this.J4Ux7ym32;
                                            i2 = -(i4 + 1);
                                            break;
                                        default:
                                            i2 = i - 1;
                                            if (i2 >= 0) {
                                                while (true) {
                                                    int i9 = i2 - 1;
                                                    Object obj6 = ((Object[]) this.tGV7Q6urW)[i2];
                                                    if (obj6 == obj) {
                                                        break;
                                                    } else if (System.identityHashCode(obj6) == identityHashCode && i9 >= 0) {
                                                        i2 = i9;
                                                    }
                                                }
                                            }
                                            i++;
                                            int i10 = this.J4Ux7ym32;
                                            if (i < i10) {
                                                while (true) {
                                                    i3 = i + 1;
                                                    Object obj7 = ((Object[]) this.tGV7Q6urW)[i];
                                                    if (obj7 == obj) {
                                                        break;
                                                    } else if (System.identityHashCode(obj7) != identityHashCode) {
                                                        break;
                                                    } else if (i3 < i10) {
                                                        i = i3;
                                                    }
                                                }
                                            }
                                            i4 = this.J4Ux7ym32;
                                            i2 = -(i4 + 1);
                                            break;
                                    }
                                }
                            } else {
                                i5 = i - 1;
                            }
                        } else {
                            i6 = i + 1;
                        }
                    }
                }
                break;
            default:
                int identityHashCode3 = System.identityHashCode(obj);
                int i11 = this.J4Ux7ym32 - 1;
                int i12 = 0;
                while (i12 <= i11) {
                    i = (i12 + i11) >>> 1;
                    Object obj8 = ((Object[]) this.tGV7Q6urW)[i];
                    int identityHashCode4 = System.identityHashCode(obj8) - identityHashCode3;
                    if (identityHashCode4 >= 0) {
                        if (identityHashCode4 <= 0) {
                            if (obj != obj8) {
                                i2 = tGV7Q6urW(i, obj, identityHashCode3);
                                i = i2;
                                break;
                            }
                        } else {
                            i11 = i - 1;
                        }
                    } else {
                        i12 = i + 1;
                    }
                }
                i3 = i12 + 1;
                i2 = -i3;
                i = i2;
                break;
        }
        if (i >= 0) {
            ((Object[]) this.dIocxURUo)[i] = obj2;
            return;
        }
        int i13 = -(i + 1);
        int i14 = this.J4Ux7ym32;
        Object[] objArr = (Object[]) this.tGV7Q6urW;
        if (i14 == objArr.length) {
            z = true;
        }
        Object[] objArr2 = z ? new Object[i14 * 2] : objArr;
        int i15 = i13 + 1;
        System.arraycopy(objArr, i13, objArr2, i15, i14 - i13);
        if (z) {
            Jefa2ExbR.AqaWJg0b4((Object[]) this.tGV7Q6urW, objArr2, 0, 0, i13, 6);
        }
        objArr2[i13] = obj;
        this.tGV7Q6urW = objArr2;
        Object[] objArr3 = z ? new Object[this.J4Ux7ym32 * 2] : (Object[]) this.dIocxURUo;
        System.arraycopy((Object[]) this.dIocxURUo, i13, objArr3, i15, this.J4Ux7ym32 - i13);
        if (z) {
            Jefa2ExbR.AqaWJg0b4((Object[]) this.dIocxURUo, objArr3, 0, 0, i13, 6);
        }
        objArr3[i13] = obj2;
        this.dIocxURUo = objArr3;
        this.J4Ux7ym32++;
    }

    public int tGV7Q6urW(int i, Object obj, int i2) {
        switch (this.q3BipwRCk) {
            case 0:
                int i3 = i - 1;
                if (i3 >= 0) {
                    while (true) {
                        int i4 = i3 - 1;
                        Object obj2 = ((Object[]) this.tGV7Q6urW)[i3];
                        if (obj2 == obj) {
                            return i3;
                        }
                        if (System.identityHashCode(obj2) == i2 && i4 >= 0) {
                            i3 = i4;
                        }
                    }
                }
                int i5 = i + 1;
                int i6 = this.J4Ux7ym32;
                if (i5 < i6) {
                    while (true) {
                        int i7 = i5 + 1;
                        Object obj3 = ((Object[]) this.tGV7Q6urW)[i5];
                        if (obj3 == obj) {
                            return i5;
                        }
                        if (System.identityHashCode(obj3) != i2) {
                            return -i7;
                        }
                        if (i7 < i6) {
                            i5 = i7;
                        }
                    }
                }
                return -(this.J4Ux7ym32 + 1);
            default:
                int i8 = i - 1;
                if (i8 >= 0) {
                    while (true) {
                        int i9 = i8 - 1;
                        Object obj4 = ((Object[]) this.tGV7Q6urW)[i8];
                        if (obj4 == obj) {
                            return i8;
                        }
                        if (System.identityHashCode(obj4) == i2 && i9 >= 0) {
                            i8 = i9;
                        }
                    }
                }
                int i10 = i + 1;
                int i11 = this.J4Ux7ym32;
                if (i10 < i11) {
                    while (true) {
                        int i12 = i10 + 1;
                        Object obj5 = ((Object[]) this.tGV7Q6urW)[i10];
                        if (obj5 == obj) {
                            return i10;
                        }
                        if (System.identityHashCode(obj5) != i2) {
                            return -i12;
                        }
                        if (i12 < i11) {
                            i10 = i12;
                        }
                    }
                }
                return -(this.J4Ux7ym32 + 1);
        }
    }

    public QuZ1OlV57(int i) {
        this.q3BipwRCk = 1;
        this.tGV7Q6urW = new Object[i];
        this.dIocxURUo = new Object[i];
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QuZ1OlV57(int i, int i2) {
        this((i2 & 1) != 0 ? 16 : i);
        this.q3BipwRCk = 1;
    }

    public QuZ1OlV57(Shader shader, ColorStateList colorStateList, int i) {
        this.q3BipwRCk = 2;
        this.tGV7Q6urW = shader;
        this.dIocxURUo = colorStateList;
        this.J4Ux7ym32 = i;
    }
}
