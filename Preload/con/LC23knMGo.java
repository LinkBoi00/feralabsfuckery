package con;

import android.os.Parcel;
import android.util.Base64;
/* loaded from: classes.dex */
public final class LC23knMGo {
    public Parcel q3BipwRCk = Parcel.obtain();

    public LC23knMGo() {
    }

    public byte J4Ux7ym32() {
        return this.q3BipwRCk.readByte();
    }

    public float dIocxURUo() {
        return this.q3BipwRCk.readFloat();
    }

    public void iiGwOFFnr(long j) {
        long J4Ux7ym32 = QnjhYJNrZ.J4Ux7ym32(j);
        byte b = 0;
        if (!fzM0nB5KM.q3BipwRCk(J4Ux7ym32, 0)) {
            if (fzM0nB5KM.q3BipwRCk(J4Ux7ym32, 4294967296L)) {
                b = 1;
            } else if (fzM0nB5KM.q3BipwRCk(J4Ux7ym32, 8589934592L)) {
                b = 2;
            }
        }
        this.q3BipwRCk.writeByte(b);
        if (!fzM0nB5KM.q3BipwRCk(QnjhYJNrZ.J4Ux7ym32(j), 0)) {
            this.q3BipwRCk.writeFloat(QnjhYJNrZ.tGV7Q6urW(j));
        }
    }

    public long kCA6Zs9sL() {
        byte J4Ux7ym32 = J4Ux7ym32();
        long j = J4Ux7ym32 == 1 ? 4294967296L : J4Ux7ym32 == 2 ? 8589934592L : 0;
        if (!fzM0nB5KM.q3BipwRCk(j, 0)) {
            return BBVaGLNaU.vNtjxmzUM(j, dIocxURUo());
        }
        rstHZ5Gu8 rsthz5gu8 = QnjhYJNrZ.J4Ux7ym32;
        return QnjhYJNrZ.dIocxURUo;
    }

    public int q3BipwRCk() {
        return this.q3BipwRCk.dataAvail();
    }

    public long tGV7Q6urW() {
        long readLong = this.q3BipwRCk.readLong();
        JhpbRXxsg jhpbRXxsg = bO2dbmrf7.J4Ux7ym32;
        return readLong;
    }

    public LC23knMGo(String str) {
        byte[] decode = Base64.decode(str, 0);
        this.q3BipwRCk.unmarshall(decode, 0, decode.length);
        this.q3BipwRCk.setDataPosition(0);
    }
}
