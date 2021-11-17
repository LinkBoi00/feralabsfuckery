package con;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
/* loaded from: classes.dex */
public final class mznBSeryj implements Comparable, Parcelable {
    public static final Parcelable.Creator<mznBSeryj> CREATOR = new xkS4L9No5(3);
    public final int Bhmn1KIah;
    public final Calendar CBQ5d1kRq;
    public final int MzoOEjc4X;
    public final int PSTqBLTET;
    public final long ilHKhw3Yw;
    public final int kmSgne1rO;
    public String qVUwofr5s;

    public mznBSeryj(Calendar calendar) {
        calendar.set(5, 1);
        Calendar J4Ux7ym32 = AepEH275c.J4Ux7ym32(calendar);
        this.CBQ5d1kRq = J4Ux7ym32;
        this.kmSgne1rO = J4Ux7ym32.get(2);
        this.Bhmn1KIah = J4Ux7ym32.get(1);
        this.PSTqBLTET = J4Ux7ym32.getMaximum(7);
        this.MzoOEjc4X = J4Ux7ym32.getActualMaximum(5);
        this.ilHKhw3Yw = J4Ux7ym32.getTimeInMillis();
    }

    public static mznBSeryj iiGwOFFnr(int i, int i2) {
        Calendar kCA6Zs9sL = AepEH275c.kCA6Zs9sL();
        kCA6Zs9sL.set(1, i);
        kCA6Zs9sL.set(2, i2);
        return new mznBSeryj(kCA6Zs9sL);
    }

    public static mznBSeryj vPSbyrYWX(long j) {
        Calendar kCA6Zs9sL = AepEH275c.kCA6Zs9sL();
        kCA6Zs9sL.setTimeInMillis(j);
        return new mznBSeryj(kCA6Zs9sL);
    }

    public mznBSeryj Bhmn1KIah(int i) {
        Calendar J4Ux7ym32 = AepEH275c.J4Ux7ym32(this.CBQ5d1kRq);
        J4Ux7ym32.add(2, i);
        return new mznBSeryj(J4Ux7ym32);
    }

    public int CBQ5d1kRq() {
        int firstDayOfWeek = this.CBQ5d1kRq.get(7) - this.CBQ5d1kRq.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.PSTqBLTET : firstDayOfWeek;
    }

    /* renamed from: J4Ux7ym32 */
    public int compareTo(mznBSeryj mznbseryj) {
        return this.CBQ5d1kRq.compareTo(mznbseryj.CBQ5d1kRq);
    }

    public int PSTqBLTET(mznBSeryj mznbseryj) {
        if (this.CBQ5d1kRq instanceof GregorianCalendar) {
            return (mznbseryj.kmSgne1rO - this.kmSgne1rO) + ((mznbseryj.Bhmn1KIah - this.Bhmn1KIah) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
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
        if (!(obj instanceof mznBSeryj)) {
            return false;
        }
        mznBSeryj mznbseryj = (mznBSeryj) obj;
        return this.kmSgne1rO == mznbseryj.kmSgne1rO && this.Bhmn1KIah == mznbseryj.Bhmn1KIah;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.kmSgne1rO), Integer.valueOf(this.Bhmn1KIah)});
    }

    public String kmSgne1rO(Context context) {
        if (this.qVUwofr5s == null) {
            long timeInMillis = this.CBQ5d1kRq.getTimeInMillis();
            this.qVUwofr5s = DateUtils.formatDateTime(context, timeInMillis - ((long) TimeZone.getDefault().getOffset(timeInMillis)), 36);
        }
        return this.qVUwofr5s;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.Bhmn1KIah);
        parcel.writeInt(this.kmSgne1rO);
    }
}
