package con;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;
/* loaded from: classes.dex */
public class PgEZIZSin extends TWeXN7eAR {
    public PgEZIZSin(o8nscdGif o8nscdgif, WindowInsets windowInsets) {
        super(o8nscdgif, windowInsets);
    }

    @Override // con.FYfEv1QIw, con.rH0APD7hz
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PgEZIZSin)) {
            return false;
        }
        PgEZIZSin pgEZIZSin = (PgEZIZSin) obj;
        return Objects.equals(this.tGV7Q6urW, pgEZIZSin.tGV7Q6urW) && Objects.equals(this.GPLPRo6go, pgEZIZSin.GPLPRo6go);
    }

    @Override // con.rH0APD7hz
    public int hashCode() {
        return this.tGV7Q6urW.hashCode();
    }

    @Override // con.rH0APD7hz
    public Id32wUef2 kCA6Zs9sL() {
        DisplayCutout displayCutout = this.tGV7Q6urW.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new Id32wUef2(displayCutout);
    }

    @Override // con.rH0APD7hz
    public o8nscdGif q3BipwRCk() {
        return o8nscdGif.Puu3Rhg4F(this.tGV7Q6urW.consumeDisplayCutout());
    }
}
