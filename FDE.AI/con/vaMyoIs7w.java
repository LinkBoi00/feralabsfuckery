package con;

import android.os.Parcel;
import android.util.SparseIntArray;
/* loaded from: classes.dex */
public class vaMyoIs7w extends LSrfLcuPd {
    public final int GPLPRo6go;
    public final String Puu3Rhg4F;
    public final SparseIntArray dIocxURUo;
    public final int iiGwOFFnr;
    public final Parcel kCA6Zs9sL;
    public int oon79WMrY;
    public int vPSbyrYWX;
    public int yWvV4ePLl;

    public vaMyoIs7w(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new rwhamSOu2(), new rwhamSOu2(), new rwhamSOu2());
    }

    public vaMyoIs7w(Parcel parcel, int i, int i2, String str, rwhamSOu2 rwhamsou2, rwhamSOu2 rwhamsou22, rwhamSOu2 rwhamsou23) {
        super(rwhamsou2, rwhamsou22, rwhamsou23);
        this.dIocxURUo = new SparseIntArray();
        this.yWvV4ePLl = -1;
        this.oon79WMrY = 0;
        this.vPSbyrYWX = -1;
        this.kCA6Zs9sL = parcel;
        this.iiGwOFFnr = i;
        this.GPLPRo6go = i2;
        this.oon79WMrY = i;
        this.Puu3Rhg4F = str;
    }

    @Override // con.LSrfLcuPd
    public void CBQ5d1kRq(int i) {
        q3BipwRCk();
        this.yWvV4ePLl = i;
        this.dIocxURUo.put(i, this.kCA6Zs9sL.dataPosition());
        this.kCA6Zs9sL.writeInt(0);
        this.kCA6Zs9sL.writeInt(i);
    }

    @Override // con.LSrfLcuPd
    public LSrfLcuPd J4Ux7ym32() {
        Parcel parcel = this.kCA6Zs9sL;
        int dataPosition = parcel.dataPosition();
        int i = this.oon79WMrY;
        if (i == this.iiGwOFFnr) {
            i = this.GPLPRo6go;
        }
        return new vaMyoIs7w(parcel, dataPosition, i, my9FFKbZi.q3BipwRCk(new StringBuilder(), this.Puu3Rhg4F, "  "), this.q3BipwRCk, this.J4Ux7ym32, this.tGV7Q6urW);
    }

    @Override // con.LSrfLcuPd
    public boolean Puu3Rhg4F(int i) {
        while (this.oon79WMrY < this.GPLPRo6go) {
            int i2 = this.vPSbyrYWX;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.kCA6Zs9sL.setDataPosition(this.oon79WMrY);
            int readInt = this.kCA6Zs9sL.readInt();
            this.vPSbyrYWX = this.kCA6Zs9sL.readInt();
            this.oon79WMrY += readInt;
        }
        return this.vPSbyrYWX == i;
    }

    @Override // con.LSrfLcuPd
    public void q3BipwRCk() {
        int i = this.yWvV4ePLl;
        if (i >= 0) {
            int i2 = this.dIocxURUo.get(i);
            int dataPosition = this.kCA6Zs9sL.dataPosition();
            this.kCA6Zs9sL.setDataPosition(i2);
            this.kCA6Zs9sL.writeInt(dataPosition - i2);
            this.kCA6Zs9sL.setDataPosition(dataPosition);
        }
    }
}
