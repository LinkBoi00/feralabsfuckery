package con;

import java.util.Map;
/* loaded from: classes.dex */
public final class AQdEHAzaN implements aZDaaZZJA {
    public final /* synthetic */ pW31wYUjR J4Ux7ym32;
    public final /* synthetic */ aZDaaZZJA q3BipwRCk;
    public final /* synthetic */ int tGV7Q6urW;

    public AQdEHAzaN(aZDaaZZJA azdaazzja, pW31wYUjR pw31wyujr, int i) {
        this.q3BipwRCk = azdaazzja;
        this.J4Ux7ym32 = pw31wyujr;
        this.tGV7Q6urW = i;
    }

    @Override // con.aZDaaZZJA
    public int J4Ux7ym32() {
        return this.q3BipwRCk.J4Ux7ym32();
    }

    @Override // con.aZDaaZZJA
    public Map dIocxURUo() {
        return this.q3BipwRCk.dIocxURUo();
    }

    @Override // con.aZDaaZZJA
    public int q3BipwRCk() {
        return this.q3BipwRCk.q3BipwRCk();
    }

    @Override // con.aZDaaZZJA
    public void tGV7Q6urW() {
        this.J4Ux7ym32.iiGwOFFnr = this.tGV7Q6urW;
        this.q3BipwRCk.tGV7Q6urW();
        pW31wYUjR pw31wyujr = this.J4Ux7ym32;
        int i = pw31wyujr.iiGwOFFnr;
        int size = pw31wyujr.J4Ux7ym32().yWvV4ePLl().size() - pw31wyujr.CBQ5d1kRq;
        int max = Math.max(i, size - pw31wyujr.q3BipwRCk);
        int i2 = size - max;
        pw31wyujr.vPSbyrYWX = i2;
        int i3 = i2 + max;
        if (max < i3) {
            int i4 = max;
            while (true) {
                int i5 = i4 + 1;
                pw31wyujr.Puu3Rhg4F.remove(((e3ALPxmyo) pw31wyujr.GPLPRo6go.get((pLYbCSTk0) pw31wyujr.J4Ux7ym32().yWvV4ePLl().get(i4))).q3BipwRCk);
                if (i5 >= i3) {
                    break;
                }
                i4 = i5;
            }
        }
        int i6 = max - i;
        if (i6 > 0) {
            pLYbCSTk0 J4Ux7ym32 = pw31wyujr.J4Ux7ym32();
            J4Ux7ym32.ixWaw2akD = true;
            int i7 = i + i6;
            if (i < i7) {
                int i8 = i;
                while (true) {
                    int i9 = i8 + 1;
                    e3ALPxmyo e3alpxmyo = (e3ALPxmyo) pw31wyujr.GPLPRo6go.remove((pLYbCSTk0) pw31wyujr.J4Ux7ym32().yWvV4ePLl().get(i8));
                    e3alpxmyo.tGV7Q6urW.q3BipwRCk();
                    pw31wyujr.Puu3Rhg4F.remove(e3alpxmyo.q3BipwRCk);
                    if (i9 >= i7) {
                        break;
                    }
                    i8 = i9;
                }
            }
            pw31wyujr.J4Ux7ym32().IytU16YUK(i, i6);
            J4Ux7ym32.ixWaw2akD = false;
        }
        pw31wyujr.tGV7Q6urW();
    }
}
