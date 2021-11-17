package con;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;
import java.util.Objects;
/* loaded from: classes.dex */
public final class tXvnR1bb6 implements baMQ0cfN8, UPGFkeS1U {
    public int Bhmn1KIah;
    public final /* synthetic */ int CBQ5d1kRq = 0;
    public Uri MzoOEjc4X;
    public int PSTqBLTET;
    public Bundle ilHKhw3Yw;
    public ClipData kmSgne1rO;

    public tXvnR1bb6(ClipData clipData, int i) {
        this.kmSgne1rO = clipData;
        this.Bhmn1KIah = i;
    }

    @Override // con.UPGFkeS1U
    public int CBQ5d1kRq() {
        return this.Bhmn1KIah;
    }

    @Override // con.UPGFkeS1U
    public int GPLPRo6go() {
        return this.PSTqBLTET;
    }

    @Override // con.UPGFkeS1U
    public ContentInfo Puu3Rhg4F() {
        return null;
    }

    @Override // con.baMQ0cfN8
    public rZsVaMPDT dIocxURUo() {
        return new rZsVaMPDT(new tXvnR1bb6(this));
    }

    @Override // con.baMQ0cfN8
    public void ilHKhw3Yw(int i) {
        this.PSTqBLTET = i;
    }

    @Override // con.baMQ0cfN8
    public void oon79WMrY(Bundle bundle) {
        this.ilHKhw3Yw = bundle;
    }

    @Override // con.UPGFkeS1U
    public ClipData tGV7Q6urW() {
        return this.kmSgne1rO;
    }

    public String toString() {
        String str;
        String str2;
        switch (this.CBQ5d1kRq) {
            case 1:
                StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("ContentInfoCompat{clip=");
                q3BipwRCk.append(this.kmSgne1rO.getDescription());
                q3BipwRCk.append(", source=");
                int i = this.Bhmn1KIah;
                q3BipwRCk.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                q3BipwRCk.append(", flags=");
                int i2 = this.PSTqBLTET;
                if ((i2 & 1) != 0) {
                    str = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    str = String.valueOf(i2);
                }
                q3BipwRCk.append(str);
                String str3 = "";
                if (this.MzoOEjc4X == null) {
                    str2 = str3;
                } else {
                    StringBuilder q3BipwRCk2 = abGBwSu8x.q3BipwRCk(", hasLinkUri(");
                    q3BipwRCk2.append(this.MzoOEjc4X.toString().length());
                    q3BipwRCk2.append(")");
                    str2 = q3BipwRCk2.toString();
                }
                q3BipwRCk.append(str2);
                if (this.ilHKhw3Yw != null) {
                    str3 = ", hasExtras";
                }
                return my9FFKbZi.q3BipwRCk(q3BipwRCk, str3, "}");
            default:
                return super.toString();
        }
    }

    @Override // con.baMQ0cfN8
    public void vPSbyrYWX(Uri uri) {
        this.MzoOEjc4X = uri;
    }

    public tXvnR1bb6(tXvnR1bb6 txvnr1bb6) {
        ClipData clipData = txvnr1bb6.kmSgne1rO;
        Objects.requireNonNull(clipData);
        this.kmSgne1rO = clipData;
        int i = txvnr1bb6.Bhmn1KIah;
        if (i < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
        } else if (i <= 5) {
            this.Bhmn1KIah = i;
            int i2 = txvnr1bb6.PSTqBLTET;
            if ((i2 & 1) == i2) {
                this.PSTqBLTET = i2;
                this.MzoOEjc4X = txvnr1bb6.MzoOEjc4X;
                this.ilHKhw3Yw = txvnr1bb6.ilHKhw3Yw;
                return;
            }
            StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Requested flags 0x");
            q3BipwRCk.append(Integer.toHexString(i2));
            q3BipwRCk.append(", but only 0x");
            q3BipwRCk.append(Integer.toHexString(1));
            q3BipwRCk.append(" are allowed");
            throw new IllegalArgumentException(q3BipwRCk.toString());
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
        }
    }
}
