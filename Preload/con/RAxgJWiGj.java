package con;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
/* loaded from: classes.dex */
public final class RAxgJWiGj implements Parcelable {
    public static final Parcelable.Creator<RAxgJWiGj> CREATOR = new mcHYF60Gb(2);
    public final z7BMZ3UDZ Bhmn1KIah;
    public final mznBSeryj CBQ5d1kRq;
    public final int MzoOEjc4X;
    public mznBSeryj PSTqBLTET;
    public final int ilHKhw3Yw;
    public final mznBSeryj kmSgne1rO;

    /* loaded from: classes.dex */
    public static final class RG2GI7LDp {
        public long J4Ux7ym32;
        public z7BMZ3UDZ dIocxURUo;
        public long q3BipwRCk;
        public Long tGV7Q6urW;
        public static final long kCA6Zs9sL = AepEH275c.q3BipwRCk(mznBSeryj.iiGwOFFnr(1900, 0).ilHKhw3Yw);
        public static final long iiGwOFFnr = AepEH275c.q3BipwRCk(mznBSeryj.iiGwOFFnr(2100, 11).ilHKhw3Yw);

        public RG2GI7LDp(RAxgJWiGj rAxgJWiGj) {
            this.q3BipwRCk = kCA6Zs9sL;
            this.J4Ux7ym32 = iiGwOFFnr;
            this.dIocxURUo = new N6L1mvree(Long.MIN_VALUE);
            this.q3BipwRCk = rAxgJWiGj.CBQ5d1kRq.ilHKhw3Yw;
            this.J4Ux7ym32 = rAxgJWiGj.kmSgne1rO.ilHKhw3Yw;
            this.tGV7Q6urW = Long.valueOf(rAxgJWiGj.PSTqBLTET.ilHKhw3Yw);
            this.dIocxURUo = rAxgJWiGj.Bhmn1KIah;
        }
    }

    public RAxgJWiGj(mznBSeryj mznbseryj, mznBSeryj mznbseryj2, z7BMZ3UDZ z7bmz3udz, mznBSeryj mznbseryj3, mcHYF60Gb mchyf60gb) {
        this.CBQ5d1kRq = mznbseryj;
        this.kmSgne1rO = mznbseryj2;
        this.PSTqBLTET = mznbseryj3;
        this.Bhmn1KIah = z7bmz3udz;
        if (mznbseryj3 != null && mznbseryj.CBQ5d1kRq.compareTo(mznbseryj3.CBQ5d1kRq) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (mznbseryj3 == null || mznbseryj3.CBQ5d1kRq.compareTo(mznbseryj2.CBQ5d1kRq) <= 0) {
            this.ilHKhw3Yw = mznbseryj.PSTqBLTET(mznbseryj2) + 1;
            this.MzoOEjc4X = (mznbseryj2.Bhmn1KIah - mznbseryj.Bhmn1KIah) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RAxgJWiGj)) {
            return false;
        }
        RAxgJWiGj rAxgJWiGj = (RAxgJWiGj) obj;
        return this.CBQ5d1kRq.equals(rAxgJWiGj.CBQ5d1kRq) && this.kmSgne1rO.equals(rAxgJWiGj.kmSgne1rO) && Objects.equals(this.PSTqBLTET, rAxgJWiGj.PSTqBLTET) && this.Bhmn1KIah.equals(rAxgJWiGj.Bhmn1KIah);
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.CBQ5d1kRq, this.kmSgne1rO, this.PSTqBLTET, this.Bhmn1KIah});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.CBQ5d1kRq, 0);
        parcel.writeParcelable(this.kmSgne1rO, 0);
        parcel.writeParcelable(this.PSTqBLTET, 0);
        parcel.writeParcelable(this.Bhmn1KIah, 0);
    }
}
