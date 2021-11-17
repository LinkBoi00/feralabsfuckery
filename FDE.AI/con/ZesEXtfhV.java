package con;

import java.util.ArrayList;
/* loaded from: classes.dex */
public final class ZesEXtfhV extends Wk9bO57s4 implements NzvP5Rex8 {
    public final /* synthetic */ int kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZesEXtfhV(int i) {
        super(3);
        this.kmSgne1rO = i;
    }

    @Override // con.NzvP5Rex8
    public Object sk5s77z6Q(Object obj, Object obj2, Object obj3) {
        EuSwp7OG7 euSwp7OG7;
        GX14exZ1F gX14exZ1F = (GX14exZ1F) obj;
        ZVqfObOve zVqfObOve = (ZVqfObOve) obj2;
        gl0eeduiq gl0eeduiq = (gl0eeduiq) obj3;
        int i = this.kmSgne1rO;
        if (zVqfObOve.kmSgne1rO == 0) {
            if (i >= 0) {
                if (i != 0) {
                    int i2 = zVqfObOve.qVUwofr5s;
                    int i3 = zVqfObOve.Eeka1udhb;
                    int i4 = zVqfObOve.GPLPRo6go;
                    int i5 = i2;
                    while (i > 0) {
                        i5 += xpuSUT7Gh.CBQ5d1kRq(zVqfObOve.J4Ux7ym32, zVqfObOve.qVUwofr5s(i5));
                        if (i5 <= i4) {
                            i--;
                        } else {
                            throw new IllegalArgumentException("Parameter offset is out of bounds".toString());
                        }
                    }
                    int CBQ5d1kRq = xpuSUT7Gh.CBQ5d1kRq(zVqfObOve.J4Ux7ym32, zVqfObOve.qVUwofr5s(i5));
                    int i6 = zVqfObOve.Puu3Rhg4F;
                    int Puu3Rhg4F = zVqfObOve.Puu3Rhg4F(zVqfObOve.J4Ux7ym32, zVqfObOve.qVUwofr5s(i5));
                    int i7 = i5 + CBQ5d1kRq;
                    int Puu3Rhg4F2 = zVqfObOve.Puu3Rhg4F(zVqfObOve.J4Ux7ym32, zVqfObOve.qVUwofr5s(i7));
                    int i8 = Puu3Rhg4F2 - Puu3Rhg4F;
                    zVqfObOve.RG6kpfv3v(i8, Math.max(zVqfObOve.qVUwofr5s - 1, 0));
                    zVqfObOve.dXrmkklc8(CBQ5d1kRq);
                    int[] iArr = zVqfObOve.J4Ux7ym32;
                    int qVUwofr5s = zVqfObOve.qVUwofr5s(i7) * 5;
                    System.arraycopy(iArr, qVUwofr5s, iArr, zVqfObOve.qVUwofr5s(i2) * 5, ((CBQ5d1kRq * 5) + qVUwofr5s) - qVUwofr5s);
                    if (i8 > 0) {
                        Object[] objArr = zVqfObOve.tGV7Q6urW;
                        int yWvV4ePLl = zVqfObOve.yWvV4ePLl(Puu3Rhg4F + i8);
                        System.arraycopy(objArr, yWvV4ePLl, objArr, i6, zVqfObOve.yWvV4ePLl(Puu3Rhg4F2 + i8) - yWvV4ePLl);
                    }
                    int i9 = Puu3Rhg4F + i8;
                    int i10 = i9 - i6;
                    int i11 = zVqfObOve.oon79WMrY;
                    int i12 = zVqfObOve.vPSbyrYWX;
                    int length = zVqfObOve.tGV7Q6urW.length;
                    int i13 = zVqfObOve.CBQ5d1kRq;
                    int i14 = i2 + CBQ5d1kRq;
                    if (i2 < i14) {
                        int i15 = i2;
                        while (true) {
                            int i16 = i15 + 1;
                            int qVUwofr5s2 = zVqfObOve.qVUwofr5s(i15);
                            iArr[(qVUwofr5s2 * 5) + 4] = zVqfObOve.oon79WMrY(zVqfObOve.oon79WMrY(zVqfObOve.Puu3Rhg4F(iArr, qVUwofr5s2) - i10, i13 < qVUwofr5s2 ? 0 : i11, i12, length), zVqfObOve.oon79WMrY, zVqfObOve.vPSbyrYWX, zVqfObOve.tGV7Q6urW.length);
                            if (i16 >= i14) {
                                break;
                            }
                            i11 = i11;
                            i15 = i16;
                            i10 = i10;
                            i12 = i12;
                            length = length;
                        }
                    }
                    int i17 = CBQ5d1kRq + i7;
                    int MzoOEjc4X = zVqfObOve.MzoOEjc4X();
                    int MzoOEjc4X2 = xpuSUT7Gh.MzoOEjc4X(zVqfObOve.dIocxURUo, i7, MzoOEjc4X);
                    ArrayList arrayList = new ArrayList();
                    if (MzoOEjc4X2 >= 0) {
                        while (MzoOEjc4X2 < zVqfObOve.dIocxURUo.size() && (r12 = zVqfObOve.tGV7Q6urW((euSwp7OG7 = (EuSwp7OG7) zVqfObOve.dIocxURUo.get(MzoOEjc4X2)))) >= i7 && r12 < i17) {
                            arrayList.add(euSwp7OG7);
                            zVqfObOve.dIocxURUo.remove(MzoOEjc4X2);
                        }
                    }
                    int i18 = i2 - i7;
                    int size = arrayList.size() - 1;
                    if (size >= 0) {
                        int i19 = 0;
                        while (true) {
                            int i20 = i19 + 1;
                            EuSwp7OG7 euSwp7OG72 = (EuSwp7OG7) arrayList.get(i19);
                            int tGV7Q6urW = zVqfObOve.tGV7Q6urW(euSwp7OG72) + i18;
                            if (tGV7Q6urW >= zVqfObOve.kCA6Zs9sL) {
                                euSwp7OG72.q3BipwRCk = -(MzoOEjc4X - tGV7Q6urW);
                            } else {
                                euSwp7OG72.q3BipwRCk = tGV7Q6urW;
                            }
                            zVqfObOve.dIocxURUo.add(xpuSUT7Gh.MzoOEjc4X(zVqfObOve.dIocxURUo, tGV7Q6urW, MzoOEjc4X), euSwp7OG72);
                            if (i20 > size) {
                                break;
                            }
                            i19 = i20;
                        }
                    }
                    if (!zVqfObOve.iMyQMM6Qj(i7, CBQ5d1kRq)) {
                        zVqfObOve.Bhmn1KIah(i3, zVqfObOve.GPLPRo6go, i2);
                        if (i8 > 0) {
                            zVqfObOve.cAwN510t2(i9, i8, i7 - 1);
                        }
                    } else {
                        G7WvUK4mQ.tGV7Q6urW("Unexpectedly removed anchors".toString());
                        throw null;
                    }
                }
                return qih4lW99W.q3BipwRCk;
            }
            throw new IllegalArgumentException("Parameter offset is out of bounds".toString());
        }
        throw new IllegalArgumentException("Cannot move a group while inserting".toString());
    }
}
