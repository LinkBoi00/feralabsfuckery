package con;

import java.util.Objects;
/* loaded from: classes.dex */
public final class H9jUzmHGT extends Wk9bO57s4 implements PmanMZxiM {
    public final /* synthetic */ long Bhmn1KIah;
    public final /* synthetic */ UBY2Inzw8 Eeka1udhb;
    public final /* synthetic */ UBY2Inzw8 MzoOEjc4X;
    public final /* synthetic */ yEz1ivYb6 PSTqBLTET;
    public final /* synthetic */ UBY2Inzw8 ilHKhw3Yw;
    public final /* synthetic */ float kmSgne1rO;
    public final /* synthetic */ UBY2Inzw8 qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H9jUzmHGT(float f, long j, yEz1ivYb6 yez1ivyb6, UBY2Inzw8 uBY2Inzw8, UBY2Inzw8 uBY2Inzw82, UBY2Inzw8 uBY2Inzw83, UBY2Inzw8 uBY2Inzw84) {
        super(1);
        this.kmSgne1rO = f;
        this.Bhmn1KIah = j;
        this.PSTqBLTET = yez1ivyb6;
        this.MzoOEjc4X = uBY2Inzw8;
        this.ilHKhw3Yw = uBY2Inzw82;
        this.qVUwofr5s = uBY2Inzw83;
        this.Eeka1udhb = uBY2Inzw84;
    }

    @Override // con.PmanMZxiM
    public Object IytU16YUK(Object obj) {
        wvIIkk6mx wviikk6mx = (wvIIkk6mx) obj;
        float abs = Math.abs(((Number) this.ilHKhw3Yw.getValue()).floatValue() - ((Number) this.qVUwofr5s.getValue()).floatValue());
        float floatValue = ((Number) this.qVUwofr5s.getValue()).floatValue() + ((Number) this.Eeka1udhb.getValue()).floatValue() + (((((float) ((Number) this.MzoOEjc4X.getValue()).intValue()) * 216.0f) % 360.0f) - 0.049804688f);
        float f = this.kmSgne1rO;
        long j = this.Bhmn1KIah;
        yEz1ivYb6 yez1ivyb6 = this.PSTqBLTET;
        float f2 = (float) 2;
        float f3 = (((f / (a8XGvLktb.tGV7Q6urW / f2)) * 57.29578f) / 2.0f) + floatValue;
        float max = Math.max(abs, 0.1f);
        float f4 = yez1ivyb6.q3BipwRCk / f2;
        float kCA6Zs9sL = tbzY8QG6X.kCA6Zs9sL(wviikk6mx.q3BipwRCk()) - (f2 * f4);
        long dIocxURUo = ODug2UCW1.dIocxURUo(f4, f4);
        long J4Ux7ym32 = gThLCaTO1.J4Ux7ym32(kCA6Zs9sL, kCA6Zs9sL);
        Objects.requireNonNull(wvIIkk6mx.kCA6Zs9sL);
        wviikk6mx.oon79WMrY(j, f3, max, false, dIocxURUo, J4Ux7ym32, 1.0f, yez1ivyb6, null, xtgbK1RJm.J4Ux7ym32);
        return qih4lW99W.q3BipwRCk;
    }
}
