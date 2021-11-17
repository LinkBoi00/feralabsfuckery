package con;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
/* loaded from: classes.dex */
public class RleTyY0Vy implements i8dsFkRky, DialogInterface.OnClickListener {
    public CharSequence Bhmn1KIah;
    public dF3gF5M3i CBQ5d1kRq;
    public final /* synthetic */ JMfjgYvcq PSTqBLTET;
    public ListAdapter kmSgne1rO;

    public RleTyY0Vy(JMfjgYvcq jMfjgYvcq) {
        this.PSTqBLTET = jMfjgYvcq;
    }

    @Override // con.i8dsFkRky
    public void Bhmn1KIah(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // con.i8dsFkRky
    public boolean J4Ux7ym32() {
        dF3gF5M3i df3gf5m3i = this.CBQ5d1kRq;
        if (df3gf5m3i != null) {
            return df3gf5m3i.isShowing();
        }
        return false;
    }

    @Override // con.i8dsFkRky
    public void MzoOEjc4X(ListAdapter listAdapter) {
        this.kmSgne1rO = listAdapter;
    }

    @Override // con.i8dsFkRky
    public void PSTqBLTET(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // con.i8dsFkRky
    public int Puu3Rhg4F() {
        return 0;
    }

    @Override // con.i8dsFkRky
    public int dIocxURUo() {
        return 0;
    }

    @Override // con.i8dsFkRky
    public void dismiss() {
        dF3gF5M3i df3gf5m3i = this.CBQ5d1kRq;
        if (df3gf5m3i != null) {
            df3gf5m3i.dismiss();
            this.CBQ5d1kRq = null;
        }
    }

    @Override // con.i8dsFkRky
    public void ilHKhw3Yw(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // con.i8dsFkRky
    public void kCA6Zs9sL(int i, int i2) {
        if (this.kmSgne1rO != null) {
            Context popupContext = this.PSTqBLTET.getPopupContext();
            I6sO15l0X i6sO15l0X = new I6sO15l0X(popupContext, dF3gF5M3i.tGV7Q6urW(popupContext, 0));
            CharSequence charSequence = this.Bhmn1KIah;
            if (charSequence != null) {
                ((V8gQUs5xA) i6sO15l0X.q3BipwRCk).kCA6Zs9sL = charSequence;
            }
            i6sO15l0X.GPLPRo6go(this.kmSgne1rO, this.PSTqBLTET.getSelectedItemPosition(), this);
            dF3gF5M3i q3BipwRCk = i6sO15l0X.q3BipwRCk();
            this.CBQ5d1kRq = q3BipwRCk;
            ListView listView = q3BipwRCk.Bhmn1KIah.GPLPRo6go;
            listView.setTextDirection(i);
            listView.setTextAlignment(i2);
            this.CBQ5d1kRq.show();
        }
    }

    @Override // con.i8dsFkRky
    public void kmSgne1rO(CharSequence charSequence) {
        this.Bhmn1KIah = charSequence;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.PSTqBLTET.setSelection(i);
        if (this.PSTqBLTET.getOnItemClickListener() != null) {
            this.PSTqBLTET.performItemClick(null, i, this.kmSgne1rO.getItemId(i));
        }
        dF3gF5M3i df3gf5m3i = this.CBQ5d1kRq;
        if (df3gf5m3i != null) {
            df3gf5m3i.dismiss();
            this.CBQ5d1kRq = null;
        }
    }

    @Override // con.i8dsFkRky
    public Drawable oon79WMrY() {
        return null;
    }

    @Override // con.i8dsFkRky
    public void tGV7Q6urW(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // con.i8dsFkRky
    public CharSequence vPSbyrYWX() {
        return this.Bhmn1KIah;
    }
}
