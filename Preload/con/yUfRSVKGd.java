package con;

import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public final class yUfRSVKGd {
    public int J4Ux7ym32;
    public Object[] dIocxURUo;
    public int q3BipwRCk;
    public final uEb6wTQlg tGV7Q6urW;
    public static final ksLrMHgEz kCA6Zs9sL = new ksLrMHgEz(null, 8);
    public static final yUfRSVKGd iiGwOFFnr = new yUfRSVKGd(0, 0, new Object[0]);

    public yUfRSVKGd(int i, int i2, Object[] objArr) {
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = i2;
        this.tGV7Q6urW = null;
        this.dIocxURUo = objArr;
    }

    public yUfRSVKGd(int i, int i2, Object[] objArr, uEb6wTQlg ueb6wtqlg) {
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = i2;
        this.tGV7Q6urW = ueb6wtqlg;
        this.dIocxURUo = objArr;
    }

    public final yUfRSVKGd Bhmn1KIah(int i, Object obj, Object obj2, int i2, z2UXUXueK z2uxuxuek) {
        yUfRSVKGd yufrsvkgd;
        int i3 = 1 << ((i >> i2) & 31);
        if (oon79WMrY(i3)) {
            int Puu3Rhg4F = Puu3Rhg4F(i3);
            if (anXlDk6fV.tGV7Q6urW(obj, this.dIocxURUo[Puu3Rhg4F])) {
                z2uxuxuek.PSTqBLTET = dfpT1j18n(Puu3Rhg4F);
                if (dfpT1j18n(Puu3Rhg4F) == obj2) {
                    return this;
                }
                if (this.tGV7Q6urW == z2uxuxuek.kmSgne1rO) {
                    this.dIocxURUo[Puu3Rhg4F + 1] = obj2;
                    return this;
                }
                z2uxuxuek.MzoOEjc4X++;
                Object[] objArr = this.dIocxURUo;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[Puu3Rhg4F + 1] = obj2;
                return new yUfRSVKGd(this.q3BipwRCk, this.J4Ux7ym32, copyOf, z2uxuxuek.kmSgne1rO);
            }
            z2uxuxuek.kCA6Zs9sL(z2uxuxuek.ilHKhw3Yw + 1);
            uEb6wTQlg ueb6wtqlg = z2uxuxuek.kmSgne1rO;
            uEb6wTQlg ueb6wtqlg2 = this.tGV7Q6urW;
            Object[] J4Ux7ym32 = J4Ux7ym32(Puu3Rhg4F, i3, i, obj, obj2, i2, ueb6wtqlg);
            if (ueb6wtqlg2 != ueb6wtqlg) {
                return new yUfRSVKGd(this.q3BipwRCk ^ i3, this.J4Ux7ym32 | i3, J4Ux7ym32, ueb6wtqlg);
            }
            this.dIocxURUo = J4Ux7ym32;
            this.q3BipwRCk ^= i3;
            this.J4Ux7ym32 |= i3;
            return this;
        } else if (vPSbyrYWX(i3)) {
            int ixWaw2akD = ixWaw2akD(i3);
            yUfRSVKGd RG6kpfv3v = RG6kpfv3v(ixWaw2akD);
            if (i2 == 30) {
                DoyxeIIWl Puu3Rhg4F2 = cT9gik1zL.Puu3Rhg4F(cT9gik1zL.yWvV4ePLl(0, RG6kpfv3v.dIocxURUo.length), 2);
                int i4 = Puu3Rhg4F2.CBQ5d1kRq;
                int i5 = Puu3Rhg4F2.kmSgne1rO;
                int i6 = Puu3Rhg4F2.Bhmn1KIah;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (true) {
                        int i7 = i4 + i6;
                        if (anXlDk6fV.tGV7Q6urW(obj, RG6kpfv3v.dIocxURUo[i4])) {
                            z2uxuxuek.PSTqBLTET = RG6kpfv3v.dfpT1j18n(i4);
                            if (RG6kpfv3v.tGV7Q6urW == z2uxuxuek.kmSgne1rO) {
                                RG6kpfv3v.dIocxURUo[i4 + 1] = obj2;
                                yufrsvkgd = RG6kpfv3v;
                            } else {
                                z2uxuxuek.MzoOEjc4X++;
                                Object[] objArr2 = RG6kpfv3v.dIocxURUo;
                                Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                                copyOf2[i4 + 1] = obj2;
                                yufrsvkgd = new yUfRSVKGd(0, 0, copyOf2, z2uxuxuek.kmSgne1rO);
                            }
                        } else if (i4 == i5) {
                            break;
                        } else {
                            i4 = i7;
                        }
                    }
                }
                z2uxuxuek.kCA6Zs9sL(z2uxuxuek.ilHKhw3Yw + 1);
                yufrsvkgd = new yUfRSVKGd(0, 0, pz7YPhQTU.vPSbyrYWX(RG6kpfv3v.dIocxURUo, 0, obj, obj2), z2uxuxuek.kmSgne1rO);
            } else {
                yufrsvkgd = RG6kpfv3v.Bhmn1KIah(i, obj, obj2, i2 + 5, z2uxuxuek);
            }
            if (RG6kpfv3v == yufrsvkgd) {
                return this;
            }
            return dXrmkklc8(ixWaw2akD, yufrsvkgd, z2uxuxuek.kmSgne1rO);
        } else {
            z2uxuxuek.kCA6Zs9sL(z2uxuxuek.ilHKhw3Yw + 1);
            uEb6wTQlg ueb6wtqlg3 = z2uxuxuek.kmSgne1rO;
            int bitCount = Integer.bitCount(this.q3BipwRCk & (i3 - 1)) * 2;
            if (this.tGV7Q6urW == ueb6wtqlg3) {
                this.dIocxURUo = pz7YPhQTU.vPSbyrYWX(this.dIocxURUo, bitCount, obj, obj2);
                this.q3BipwRCk |= i3;
                return this;
            }
            return new yUfRSVKGd(this.q3BipwRCk | i3, this.J4Ux7ym32, pz7YPhQTU.vPSbyrYWX(this.dIocxURUo, bitCount, obj, obj2), ueb6wtqlg3);
        }
    }

    public final yUfRSVKGd CBQ5d1kRq(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, uEb6wTQlg ueb6wtqlg) {
        if (i3 > 30) {
            return new yUfRSVKGd(0, 0, new Object[]{obj, obj2, obj3, obj4}, ueb6wtqlg);
        }
        int i4 = (i >> i3) & 31;
        int i5 = (i2 >> i3) & 31;
        if (i4 == i5) {
            return new yUfRSVKGd(0, 1 << i4, new Object[]{CBQ5d1kRq(i, obj, obj2, i2, obj3, obj4, i3 + 5, ueb6wtqlg)}, ueb6wtqlg);
        }
        Object[] objArr = new Object[4];
        if (i4 < i5) {
            objArr[0] = obj;
            objArr[1] = obj2;
            objArr[2] = obj3;
            objArr[3] = obj4;
        } else {
            objArr[0] = obj3;
            objArr[1] = obj4;
            objArr[2] = obj;
            objArr[3] = obj2;
        }
        return new yUfRSVKGd((1 << i4) | (1 << i5), 0, objArr, ueb6wtqlg);
    }

    public final yUfRSVKGd Eeka1udhb(yUfRSVKGd yufrsvkgd, yUfRSVKGd yufrsvkgd2, int i, int i2, uEb6wTQlg ueb6wtqlg) {
        if (yufrsvkgd2 == null) {
            Object[] objArr = this.dIocxURUo;
            if (objArr.length == 1) {
                return null;
            }
            uEb6wTQlg ueb6wtqlg2 = this.tGV7Q6urW;
            Object[] kmSgne1rO = pz7YPhQTU.kmSgne1rO(objArr, i);
            if (ueb6wtqlg2 != ueb6wtqlg) {
                return new yUfRSVKGd(this.q3BipwRCk, i2 ^ this.J4Ux7ym32, kmSgne1rO, ueb6wtqlg);
            }
            this.dIocxURUo = kmSgne1rO;
            this.J4Ux7ym32 ^= i2;
        } else if (this.tGV7Q6urW == ueb6wtqlg || yufrsvkgd != yufrsvkgd2) {
            return dXrmkklc8(i, yufrsvkgd2, ueb6wtqlg);
        }
        return this;
    }

    public final int GPLPRo6go() {
        return Integer.bitCount(this.q3BipwRCk);
    }

    public final Object[] J4Ux7ym32(int i, int i2, int i3, Object obj, Object obj2, int i4, uEb6wTQlg ueb6wtqlg) {
        Object obj3 = this.dIocxURUo[i];
        yUfRSVKGd CBQ5d1kRq = CBQ5d1kRq(obj3 != null ? obj3.hashCode() : 0, obj3, this.dIocxURUo[i + 1], i3, obj, obj2, i4 + 5, ueb6wtqlg);
        int ixWaw2akD = ixWaw2akD(i2) + 1;
        Object[] objArr = this.dIocxURUo;
        int i5 = ixWaw2akD - 2;
        Object[] objArr2 = new Object[(objArr.length - 2) + 1];
        Jefa2ExbR.AqaWJg0b4(objArr, objArr2, 0, 0, i, 6);
        int i6 = i + 2;
        System.arraycopy(objArr, i6, objArr2, i, ixWaw2akD - i6);
        objArr2[i5] = CBQ5d1kRq;
        System.arraycopy(objArr, ixWaw2akD, objArr2, i5 + 1, objArr.length - ixWaw2akD);
        return objArr2;
    }

    public final yUfRSVKGd MzoOEjc4X(int i, Object obj, int i2, z2UXUXueK z2uxuxuek) {
        yUfRSVKGd yufrsvkgd;
        yUfRSVKGd yufrsvkgd2;
        int i3 = 1 << ((i >> i2) & 31);
        if (oon79WMrY(i3)) {
            int Puu3Rhg4F = Puu3Rhg4F(i3);
            return anXlDk6fV.tGV7Q6urW(obj, this.dIocxURUo[Puu3Rhg4F]) ? qVUwofr5s(Puu3Rhg4F, i3, z2uxuxuek) : this;
        } else if (!vPSbyrYWX(i3)) {
            return this;
        } else {
            int ixWaw2akD = ixWaw2akD(i3);
            yUfRSVKGd RG6kpfv3v = RG6kpfv3v(ixWaw2akD);
            if (i2 == 30) {
                DoyxeIIWl Puu3Rhg4F2 = cT9gik1zL.Puu3Rhg4F(cT9gik1zL.yWvV4ePLl(0, RG6kpfv3v.dIocxURUo.length), 2);
                int i4 = Puu3Rhg4F2.CBQ5d1kRq;
                int i5 = Puu3Rhg4F2.kmSgne1rO;
                int i6 = Puu3Rhg4F2.Bhmn1KIah;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (true) {
                        int i7 = i4 + i6;
                        if (anXlDk6fV.tGV7Q6urW(obj, RG6kpfv3v.dIocxURUo[i4])) {
                            yufrsvkgd2 = RG6kpfv3v.kmSgne1rO(i4, z2uxuxuek);
                            break;
                        } else if (i4 == i5) {
                            break;
                        } else {
                            i4 = i7;
                        }
                    }
                }
                yufrsvkgd = RG6kpfv3v;
                return Eeka1udhb(RG6kpfv3v, yufrsvkgd, ixWaw2akD, i3, z2uxuxuek.kmSgne1rO);
            }
            yufrsvkgd2 = RG6kpfv3v.MzoOEjc4X(i, obj, i2 + 5, z2uxuxuek);
            yufrsvkgd = yufrsvkgd2;
            return Eeka1udhb(RG6kpfv3v, yufrsvkgd, ixWaw2akD, i3, z2uxuxuek.kmSgne1rO);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x016e, code lost:
        if (r29.ilHKhw3Yw == r4) goto L_0x0170;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final yUfRSVKGd PSTqBLTET(yUfRSVKGd yufrsvkgd, int i, NHGqjEvTn nHGqjEvTn, z2UXUXueK z2uxuxuek) {
        int i2;
        int i3;
        Object[] objArr;
        yUfRSVKGd yufrsvkgd2;
        yUfRSVKGd yufrsvkgd3;
        if (this == yufrsvkgd) {
            nHGqjEvTn.q3BipwRCk += tGV7Q6urW();
            return this;
        }
        int i4 = 0;
        if (i > 30) {
            uEb6wTQlg ueb6wtqlg = z2uxuxuek.kmSgne1rO;
            Object[] objArr2 = this.dIocxURUo;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + yufrsvkgd.dIocxURUo.length);
            int length = this.dIocxURUo.length;
            DoyxeIIWl Puu3Rhg4F = cT9gik1zL.Puu3Rhg4F(cT9gik1zL.yWvV4ePLl(0, yufrsvkgd.dIocxURUo.length), 2);
            int i5 = Puu3Rhg4F.CBQ5d1kRq;
            int i6 = Puu3Rhg4F.kmSgne1rO;
            int i7 = Puu3Rhg4F.Bhmn1KIah;
            if ((i7 > 0 && i5 <= i6) || (i7 < 0 && i6 <= i5)) {
                while (true) {
                    int i8 = i5 + i7;
                    if (!dIocxURUo(yufrsvkgd.dIocxURUo[i5])) {
                        Object[] objArr3 = yufrsvkgd.dIocxURUo;
                        copyOf[length] = objArr3[i5];
                        copyOf[length + 1] = objArr3[i5 + 1];
                        length += 2;
                    } else {
                        nHGqjEvTn.q3BipwRCk++;
                    }
                    if (i5 == i6) {
                        break;
                    }
                    i5 = i8;
                }
            }
            if (length == this.dIocxURUo.length) {
                return this;
            }
            if (length == yufrsvkgd.dIocxURUo.length) {
                return yufrsvkgd;
            }
            return length == copyOf.length ? new yUfRSVKGd(0, 0, copyOf, ueb6wtqlg) : new yUfRSVKGd(0, 0, Arrays.copyOf(copyOf, length), ueb6wtqlg);
        }
        int i9 = this.J4Ux7ym32 | yufrsvkgd.J4Ux7ym32;
        int i10 = this.q3BipwRCk;
        int i11 = yufrsvkgd.q3BipwRCk;
        int i12 = (i10 ^ i11) & (~i9);
        int i13 = i10 & i11;
        while (i13 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i13);
            if (anXlDk6fV.tGV7Q6urW(this.dIocxURUo[Puu3Rhg4F(lowestOneBit)], yufrsvkgd.dIocxURUo[yufrsvkgd.Puu3Rhg4F(lowestOneBit)])) {
                i12 |= lowestOneBit;
            } else {
                i9 |= lowestOneBit;
            }
            i13 ^= lowestOneBit;
        }
        if ((i9 & i12) == 0) {
            yUfRSVKGd yufrsvkgd4 = (anXlDk6fV.tGV7Q6urW(this.tGV7Q6urW, z2uxuxuek.kmSgne1rO) && this.q3BipwRCk == i12 && this.J4Ux7ym32 == i9) ? this : new yUfRSVKGd(i12, i9, new Object[Integer.bitCount(i9) + (Integer.bitCount(i12) * 2)]);
            int i14 = i9;
            int i15 = 0;
            while (i14 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i14);
                Object[] objArr4 = yufrsvkgd4.dIocxURUo;
                int length2 = (objArr4.length - 1) - i15;
                if (((this.J4Ux7ym32 & lowestOneBit2) != 0 ? 1 : i4) != 0) {
                    yufrsvkgd3 = RG6kpfv3v(ixWaw2akD(lowestOneBit2));
                    if (((yufrsvkgd.J4Ux7ym32 & lowestOneBit2) != 0 ? 1 : i4) != 0) {
                        yufrsvkgd3 = yufrsvkgd3.PSTqBLTET(yufrsvkgd.RG6kpfv3v(yufrsvkgd.ixWaw2akD(lowestOneBit2)), i + 5, nHGqjEvTn, z2uxuxuek);
                    } else {
                        int i16 = yufrsvkgd.q3BipwRCk;
                        if (((lowestOneBit2 & i16) != 0 ? 1 : i4) != 0) {
                            int bitCount = Integer.bitCount(i16 & (lowestOneBit2 - 1)) * 2;
                            Object obj = yufrsvkgd.dIocxURUo[bitCount];
                            Object dfpT1j18n = yufrsvkgd.dfpT1j18n(bitCount);
                            int i17 = z2uxuxuek.ilHKhw3Yw;
                            objArr = objArr4;
                            yufrsvkgd3 = yufrsvkgd3.Bhmn1KIah(obj != null ? obj.hashCode() : i4, obj, dfpT1j18n, i + 5, z2uxuxuek);
                        }
                    }
                    objArr = objArr4;
                    i2 = lowestOneBit2;
                    yufrsvkgd2 = yufrsvkgd4;
                    i3 = i12;
                    objArr[length2] = yufrsvkgd3;
                    i15++;
                    i14 ^= i2;
                    yufrsvkgd4 = yufrsvkgd2;
                    i12 = i3;
                    i4 = 0;
                } else {
                    objArr = objArr4;
                    if ((yufrsvkgd.J4Ux7ym32 & lowestOneBit2) != 0) {
                        yufrsvkgd3 = yufrsvkgd.RG6kpfv3v(yufrsvkgd.ixWaw2akD(lowestOneBit2));
                        int i18 = this.q3BipwRCk;
                        if ((lowestOneBit2 & i18) != 0) {
                            int bitCount2 = Integer.bitCount(i18 & (lowestOneBit2 - 1)) * 2;
                            Object obj2 = this.dIocxURUo[bitCount2];
                            int i19 = i + 5;
                            if (!yufrsvkgd3.kCA6Zs9sL(obj2 != null ? obj2.hashCode() : 0, obj2, i19)) {
                                yufrsvkgd3 = yufrsvkgd3.Bhmn1KIah(obj2 != null ? obj2.hashCode() : 0, obj2, dfpT1j18n(bitCount2), i19, z2uxuxuek);
                            }
                            nHGqjEvTn.q3BipwRCk++;
                        }
                        i2 = lowestOneBit2;
                        yufrsvkgd2 = yufrsvkgd4;
                        i3 = i12;
                        objArr[length2] = yufrsvkgd3;
                        i15++;
                        i14 ^= i2;
                        yufrsvkgd4 = yufrsvkgd2;
                        i12 = i3;
                        i4 = 0;
                    } else {
                        int i20 = lowestOneBit2 - 1;
                        int bitCount3 = Integer.bitCount(this.q3BipwRCk & i20) * 2;
                        Object obj3 = this.dIocxURUo[bitCount3];
                        Object dfpT1j18n2 = dfpT1j18n(bitCount3);
                        int bitCount4 = Integer.bitCount(yufrsvkgd.q3BipwRCk & i20) * 2;
                        Object obj4 = yufrsvkgd.dIocxURUo[bitCount4];
                        i2 = lowestOneBit2;
                        yufrsvkgd2 = yufrsvkgd4;
                        i3 = i12;
                        yufrsvkgd3 = CBQ5d1kRq(obj3 != null ? obj3.hashCode() : 0, obj3, dfpT1j18n2, obj4 != null ? obj4.hashCode() : 0, obj4, yufrsvkgd.dfpT1j18n(bitCount4), i + 5, z2uxuxuek.kmSgne1rO);
                        objArr[length2] = yufrsvkgd3;
                        i15++;
                        i14 ^= i2;
                        yufrsvkgd4 = yufrsvkgd2;
                        i12 = i3;
                        i4 = 0;
                    }
                }
            }
            int i21 = 0;
            while (i12 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i12);
                int i22 = i21 * 2;
                if (!yufrsvkgd.oon79WMrY(lowestOneBit3)) {
                    int Puu3Rhg4F2 = Puu3Rhg4F(lowestOneBit3);
                    Object[] objArr5 = yufrsvkgd4.dIocxURUo;
                    objArr5[i22] = this.dIocxURUo[Puu3Rhg4F2];
                    objArr5[i22 + 1] = dfpT1j18n(Puu3Rhg4F2);
                } else {
                    int Puu3Rhg4F3 = yufrsvkgd.Puu3Rhg4F(lowestOneBit3);
                    Object[] objArr6 = yufrsvkgd4.dIocxURUo;
                    objArr6[i22] = yufrsvkgd.dIocxURUo[Puu3Rhg4F3];
                    objArr6[i22 + 1] = yufrsvkgd.dfpT1j18n(Puu3Rhg4F3);
                    if (oon79WMrY(lowestOneBit3)) {
                        nHGqjEvTn.q3BipwRCk++;
                    }
                }
                i21++;
                i12 ^= lowestOneBit3;
            }
            if (iiGwOFFnr(yufrsvkgd4)) {
                return this;
            }
            if (yufrsvkgd.iiGwOFFnr(yufrsvkgd4)) {
                return yufrsvkgd;
            }
            return yufrsvkgd4;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int Puu3Rhg4F(int i) {
        return Integer.bitCount((i - 1) & this.q3BipwRCk) * 2;
    }

    public final yUfRSVKGd RG6kpfv3v(int i) {
        Object obj = this.dIocxURUo[i];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (yUfRSVKGd) obj;
    }

    public final yUfRSVKGd WaUP0CF08(int i, Object obj, int i2) {
        yUfRSVKGd yufrsvkgd;
        int i3 = 1 << ((i >> i2) & 31);
        if (oon79WMrY(i3)) {
            int Puu3Rhg4F = Puu3Rhg4F(i3);
            if (!anXlDk6fV.tGV7Q6urW(obj, this.dIocxURUo[Puu3Rhg4F])) {
                return this;
            }
            Object[] objArr = this.dIocxURUo;
            if (objArr.length == 2) {
                return null;
            }
            return new yUfRSVKGd(this.q3BipwRCk ^ i3, this.J4Ux7ym32, pz7YPhQTU.CBQ5d1kRq(objArr, Puu3Rhg4F));
        } else if (!vPSbyrYWX(i3)) {
            return this;
        } else {
            int ixWaw2akD = ixWaw2akD(i3);
            yUfRSVKGd RG6kpfv3v = RG6kpfv3v(ixWaw2akD);
            if (i2 == 30) {
                DoyxeIIWl Puu3Rhg4F2 = cT9gik1zL.Puu3Rhg4F(cT9gik1zL.yWvV4ePLl(0, RG6kpfv3v.dIocxURUo.length), 2);
                int i4 = Puu3Rhg4F2.CBQ5d1kRq;
                int i5 = Puu3Rhg4F2.kmSgne1rO;
                int i6 = Puu3Rhg4F2.Bhmn1KIah;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (true) {
                        int i7 = i4 + i6;
                        if (anXlDk6fV.tGV7Q6urW(obj, RG6kpfv3v.dIocxURUo[i4])) {
                            Object[] objArr2 = RG6kpfv3v.dIocxURUo;
                            yufrsvkgd = objArr2.length == 2 ? null : new yUfRSVKGd(0, 0, pz7YPhQTU.CBQ5d1kRq(objArr2, i4));
                        } else if (i4 == i5) {
                            break;
                        } else {
                            i4 = i7;
                        }
                    }
                }
                yufrsvkgd = RG6kpfv3v;
            } else {
                yufrsvkgd = RG6kpfv3v.WaUP0CF08(i, obj, i2 + 5);
            }
            if (yufrsvkgd != null) {
                return RG6kpfv3v != yufrsvkgd ? i8XZMQc6Z(ixWaw2akD, i3, yufrsvkgd) : this;
            }
            Object[] objArr3 = this.dIocxURUo;
            if (objArr3.length == 1) {
                return null;
            }
            return new yUfRSVKGd(this.q3BipwRCk, this.J4Ux7ym32 ^ i3, pz7YPhQTU.kmSgne1rO(objArr3, ixWaw2akD));
        }
    }

    public final boolean dIocxURUo(Object obj) {
        DoyxeIIWl Puu3Rhg4F = cT9gik1zL.Puu3Rhg4F(cT9gik1zL.yWvV4ePLl(0, this.dIocxURUo.length), 2);
        int i = Puu3Rhg4F.CBQ5d1kRq;
        int i2 = Puu3Rhg4F.kmSgne1rO;
        int i3 = Puu3Rhg4F.Bhmn1KIah;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (true) {
                int i4 = i + i3;
                if (anXlDk6fV.tGV7Q6urW(obj, this.dIocxURUo[i])) {
                    return true;
                }
                if (i == i2) {
                    break;
                }
                i = i4;
            }
        }
        return false;
    }

    public final yUfRSVKGd dXrmkklc8(int i, yUfRSVKGd yufrsvkgd, uEb6wTQlg ueb6wtqlg) {
        Object[] objArr = this.dIocxURUo;
        if (objArr.length == 1 && yufrsvkgd.dIocxURUo.length == 2 && yufrsvkgd.J4Ux7ym32 == 0) {
            yufrsvkgd.q3BipwRCk = this.J4Ux7ym32;
            return yufrsvkgd;
        } else if (this.tGV7Q6urW == ueb6wtqlg) {
            objArr[i] = yufrsvkgd;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[i] = yufrsvkgd;
            return new yUfRSVKGd(this.q3BipwRCk, this.J4Ux7ym32, copyOf, ueb6wtqlg);
        }
    }

    public final Object dfpT1j18n(int i) {
        return this.dIocxURUo[i + 1];
    }

    public final yUfRSVKGd i8XZMQc6Z(int i, int i2, yUfRSVKGd yufrsvkgd) {
        Object[] objArr = yufrsvkgd.dIocxURUo;
        if (objArr.length != 2 || yufrsvkgd.J4Ux7ym32 != 0) {
            Object[] objArr2 = this.dIocxURUo;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            copyOf[i] = yufrsvkgd;
            return new yUfRSVKGd(this.q3BipwRCk, this.J4Ux7ym32, copyOf);
        } else if (this.dIocxURUo.length == 1) {
            yufrsvkgd.q3BipwRCk = this.J4Ux7ym32;
            return yufrsvkgd;
        } else {
            int bitCount = Integer.bitCount(this.q3BipwRCk & (i2 - 1)) * 2;
            Object[] objArr3 = this.dIocxURUo;
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
            int i3 = i + 1;
            System.arraycopy(copyOf2, i3, copyOf2, i + 2, objArr3.length - i3);
            System.arraycopy(copyOf2, bitCount, copyOf2, bitCount + 2, i - bitCount);
            copyOf2[bitCount] = obj;
            copyOf2[bitCount + 1] = obj2;
            return new yUfRSVKGd(this.q3BipwRCk ^ i2, i2 ^ this.J4Ux7ym32, copyOf2);
        }
    }

    public final boolean iiGwOFFnr(yUfRSVKGd yufrsvkgd) {
        if (this == yufrsvkgd) {
            return true;
        }
        if (this.J4Ux7ym32 != yufrsvkgd.J4Ux7ym32 || this.q3BipwRCk != yufrsvkgd.q3BipwRCk) {
            return false;
        }
        int length = this.dIocxURUo.length;
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (this.dIocxURUo[i] != yufrsvkgd.dIocxURUo[i]) {
                    return false;
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return true;
    }

    public final yUfRSVKGd ilHKhw3Yw(int i, Object obj, Object obj2, int i2, z2UXUXueK z2uxuxuek) {
        yUfRSVKGd yufrsvkgd;
        yUfRSVKGd yufrsvkgd2;
        int i3 = 1 << ((i >> i2) & 31);
        if (oon79WMrY(i3)) {
            int Puu3Rhg4F = Puu3Rhg4F(i3);
            if (!anXlDk6fV.tGV7Q6urW(obj, this.dIocxURUo[Puu3Rhg4F]) || !anXlDk6fV.tGV7Q6urW(obj2, dfpT1j18n(Puu3Rhg4F))) {
                return this;
            }
            return qVUwofr5s(Puu3Rhg4F, i3, z2uxuxuek);
        } else if (!vPSbyrYWX(i3)) {
            return this;
        } else {
            int ixWaw2akD = ixWaw2akD(i3);
            yUfRSVKGd RG6kpfv3v = RG6kpfv3v(ixWaw2akD);
            if (i2 == 30) {
                DoyxeIIWl Puu3Rhg4F2 = cT9gik1zL.Puu3Rhg4F(cT9gik1zL.yWvV4ePLl(0, RG6kpfv3v.dIocxURUo.length), 2);
                int i4 = Puu3Rhg4F2.CBQ5d1kRq;
                int i5 = Puu3Rhg4F2.kmSgne1rO;
                int i6 = Puu3Rhg4F2.Bhmn1KIah;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (true) {
                        int i7 = i4 + i6;
                        if (anXlDk6fV.tGV7Q6urW(obj, RG6kpfv3v.dIocxURUo[i4]) && anXlDk6fV.tGV7Q6urW(obj2, RG6kpfv3v.dfpT1j18n(i4))) {
                            yufrsvkgd2 = RG6kpfv3v.kmSgne1rO(i4, z2uxuxuek);
                            break;
                        } else if (i4 == i5) {
                            break;
                        } else {
                            i4 = i7;
                        }
                    }
                }
                yufrsvkgd = RG6kpfv3v;
                return Eeka1udhb(RG6kpfv3v, yufrsvkgd, ixWaw2akD, i3, z2uxuxuek.kmSgne1rO);
            }
            yufrsvkgd2 = RG6kpfv3v.ilHKhw3Yw(i, obj, obj2, i2 + 5, z2uxuxuek);
            yufrsvkgd = yufrsvkgd2;
            return Eeka1udhb(RG6kpfv3v, yufrsvkgd, ixWaw2akD, i3, z2uxuxuek.kmSgne1rO);
        }
    }

    public final int ixWaw2akD(int i) {
        return (this.dIocxURUo.length - 1) - Integer.bitCount((i - 1) & this.J4Ux7ym32);
    }

    public final boolean kCA6Zs9sL(int i, Object obj, int i2) {
        int i3 = 1 << ((i >> i2) & 31);
        if (oon79WMrY(i3)) {
            return anXlDk6fV.tGV7Q6urW(obj, this.dIocxURUo[Puu3Rhg4F(i3)]);
        } else if (!vPSbyrYWX(i3)) {
            return false;
        } else {
            yUfRSVKGd RG6kpfv3v = RG6kpfv3v(ixWaw2akD(i3));
            return i2 == 30 ? RG6kpfv3v.dIocxURUo(obj) : RG6kpfv3v.kCA6Zs9sL(i, obj, i2 + 5);
        }
    }

    public final yUfRSVKGd kmSgne1rO(int i, z2UXUXueK z2uxuxuek) {
        z2uxuxuek.kCA6Zs9sL(z2uxuxuek.ilHKhw3Yw - 1);
        Object[] objArr = this.dIocxURUo;
        z2uxuxuek.PSTqBLTET = objArr[i + 1];
        if (objArr.length == 2) {
            return null;
        }
        uEb6wTQlg ueb6wtqlg = this.tGV7Q6urW;
        uEb6wTQlg ueb6wtqlg2 = z2uxuxuek.kmSgne1rO;
        Object[] CBQ5d1kRq = pz7YPhQTU.CBQ5d1kRq(objArr, i);
        if (ueb6wtqlg != ueb6wtqlg2) {
            return new yUfRSVKGd(0, 0, CBQ5d1kRq, z2uxuxuek.kmSgne1rO);
        }
        this.dIocxURUo = CBQ5d1kRq;
        return this;
    }

    public final boolean oon79WMrY(int i) {
        return (i & this.q3BipwRCk) != 0;
    }

    public final I6sO15l0X q3BipwRCk() {
        return new I6sO15l0X(this, 1);
    }

    public final yUfRSVKGd qVUwofr5s(int i, int i2, z2UXUXueK z2uxuxuek) {
        z2uxuxuek.kCA6Zs9sL(z2uxuxuek.ilHKhw3Yw - 1);
        Object[] objArr = this.dIocxURUo;
        z2uxuxuek.PSTqBLTET = objArr[i + 1];
        if (objArr.length == 2) {
            return null;
        }
        uEb6wTQlg ueb6wtqlg = this.tGV7Q6urW;
        uEb6wTQlg ueb6wtqlg2 = z2uxuxuek.kmSgne1rO;
        Object[] CBQ5d1kRq = pz7YPhQTU.CBQ5d1kRq(objArr, i);
        if (ueb6wtqlg != ueb6wtqlg2) {
            return new yUfRSVKGd(i2 ^ this.q3BipwRCk, this.J4Ux7ym32, CBQ5d1kRq, z2uxuxuek.kmSgne1rO);
        }
        this.dIocxURUo = CBQ5d1kRq;
        this.q3BipwRCk ^= i2;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c4 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final I6sO15l0X sk5s77z6Q(int i, Object obj, Object obj2, int i2) {
        I6sO15l0X i6sO15l0X;
        int i3 = 1 << ((i >> i2) & 31);
        if (oon79WMrY(i3)) {
            int Puu3Rhg4F = Puu3Rhg4F(i3);
            if (!anXlDk6fV.tGV7Q6urW(obj, this.dIocxURUo[Puu3Rhg4F])) {
                return new yUfRSVKGd(this.q3BipwRCk ^ i3, this.J4Ux7ym32 | i3, J4Ux7ym32(Puu3Rhg4F, i3, i, obj, obj2, i2, null)).q3BipwRCk();
            } else if (dfpT1j18n(Puu3Rhg4F) == obj2) {
                return null;
            } else {
                Object[] objArr = this.dIocxURUo;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[Puu3Rhg4F + 1] = obj2;
                return new I6sO15l0X(new yUfRSVKGd(this.q3BipwRCk, this.J4Ux7ym32, copyOf), 0);
            }
        } else if (vPSbyrYWX(i3)) {
            int ixWaw2akD = ixWaw2akD(i3);
            yUfRSVKGd RG6kpfv3v = RG6kpfv3v(ixWaw2akD);
            if (i2 == 30) {
                DoyxeIIWl Puu3Rhg4F2 = cT9gik1zL.Puu3Rhg4F(cT9gik1zL.yWvV4ePLl(0, RG6kpfv3v.dIocxURUo.length), 2);
                int i4 = Puu3Rhg4F2.CBQ5d1kRq;
                int i5 = Puu3Rhg4F2.kmSgne1rO;
                int i6 = Puu3Rhg4F2.Bhmn1KIah;
                if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                    while (true) {
                        int i7 = i4 + i6;
                        if (anXlDk6fV.tGV7Q6urW(obj, RG6kpfv3v.dIocxURUo[i4])) {
                            if (obj2 == RG6kpfv3v.dfpT1j18n(i4)) {
                                i6sO15l0X = null;
                            } else {
                                Object[] objArr2 = RG6kpfv3v.dIocxURUo;
                                Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                                copyOf2[i4 + 1] = obj2;
                                i6sO15l0X = new I6sO15l0X(new yUfRSVKGd(0, 0, copyOf2), 0);
                            }
                        } else if (i4 == i5) {
                            break;
                        } else {
                            i4 = i7;
                        }
                    }
                    if (i6sO15l0X == null) {
                        return null;
                    }
                }
                i6sO15l0X = new yUfRSVKGd(0, 0, pz7YPhQTU.vPSbyrYWX(RG6kpfv3v.dIocxURUo, 0, obj, obj2)).q3BipwRCk();
                if (i6sO15l0X == null) {
                }
            } else {
                i6sO15l0X = RG6kpfv3v.sk5s77z6Q(i, obj, obj2, i2 + 5);
                if (i6sO15l0X == null) {
                    return null;
                }
            }
            i6sO15l0X.q3BipwRCk = i8XZMQc6Z(ixWaw2akD, i3, (yUfRSVKGd) i6sO15l0X.q3BipwRCk);
            return i6sO15l0X;
        } else {
            return new yUfRSVKGd(this.q3BipwRCk | i3, this.J4Ux7ym32, pz7YPhQTU.vPSbyrYWX(this.dIocxURUo, Integer.bitCount(this.q3BipwRCk & (i3 - 1)) * 2, obj, obj2)).q3BipwRCk();
        }
    }

    public final int tGV7Q6urW() {
        if (this.J4Ux7ym32 == 0) {
            return this.dIocxURUo.length / 2;
        }
        int bitCount = Integer.bitCount(this.q3BipwRCk);
        int i = bitCount * 2;
        int length = this.dIocxURUo.length;
        if (i < length) {
            while (true) {
                int i2 = i + 1;
                bitCount += RG6kpfv3v(i).tGV7Q6urW();
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return bitCount;
    }

    public final boolean vPSbyrYWX(int i) {
        return (i & this.J4Ux7ym32) != 0;
    }

    public final Object yWvV4ePLl(int i, Object obj, int i2) {
        int i3 = 1 << ((i >> i2) & 31);
        if (oon79WMrY(i3)) {
            int Puu3Rhg4F = Puu3Rhg4F(i3);
            if (anXlDk6fV.tGV7Q6urW(obj, this.dIocxURUo[Puu3Rhg4F])) {
                return dfpT1j18n(Puu3Rhg4F);
            }
            return null;
        } else if (!vPSbyrYWX(i3)) {
            return null;
        } else {
            yUfRSVKGd RG6kpfv3v = RG6kpfv3v(ixWaw2akD(i3));
            if (i2 != 30) {
                return RG6kpfv3v.yWvV4ePLl(i, obj, i2 + 5);
            }
            DoyxeIIWl Puu3Rhg4F2 = cT9gik1zL.Puu3Rhg4F(cT9gik1zL.yWvV4ePLl(0, RG6kpfv3v.dIocxURUo.length), 2);
            int i4 = Puu3Rhg4F2.CBQ5d1kRq;
            int i5 = Puu3Rhg4F2.kmSgne1rO;
            int i6 = Puu3Rhg4F2.Bhmn1KIah;
            if ((i6 <= 0 || i4 > i5) && (i6 >= 0 || i5 > i4)) {
                return null;
            }
            while (true) {
                int i7 = i4 + i6;
                if (anXlDk6fV.tGV7Q6urW(obj, RG6kpfv3v.dIocxURUo[i4])) {
                    return RG6kpfv3v.dfpT1j18n(i4);
                }
                if (i4 == i5) {
                    return null;
                }
                i4 = i7;
            }
        }
    }
}
