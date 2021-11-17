package con;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
/* loaded from: classes.dex */
public class iSPvE3YGn extends uBkGbmfhd implements i8dsFkRky {
    public int EBQXiIPmm;
    public ListAdapter QNqj6nIzv;
    public final /* synthetic */ JMfjgYvcq TyB1UUd72;
    public CharSequence V9LQMKGJe;
    public final Rect igRQEZxnW = new Rect();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iSPvE3YGn(JMfjgYvcq jMfjgYvcq, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.TyB1UUd72 = jMfjgYvcq;
        this.dfpT1j18n = jMfjgYvcq;
        Eeka1udhb(true);
        this.iMyQMM6Qj = new tM3F0H8KO(this, jMfjgYvcq);
    }

    @Override // con.uBkGbmfhd, con.i8dsFkRky
    public void MzoOEjc4X(ListAdapter listAdapter) {
        super.MzoOEjc4X(listAdapter);
        this.QNqj6nIzv = listAdapter;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void dXrmkklc8() {
        int i;
        Drawable oon79WMrY = oon79WMrY();
        int i2 = 0;
        if (oon79WMrY != null) {
            oon79WMrY.getPadding(this.TyB1UUd72.Eeka1udhb);
            i2 = qyCamnJnJ.J4Ux7ym32(this.TyB1UUd72) ? this.TyB1UUd72.Eeka1udhb.right : -this.TyB1UUd72.Eeka1udhb.left;
        } else {
            Rect rect = this.TyB1UUd72.Eeka1udhb;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = this.TyB1UUd72.getPaddingLeft();
        int paddingRight = this.TyB1UUd72.getPaddingRight();
        int width = this.TyB1UUd72.getWidth();
        JMfjgYvcq jMfjgYvcq = this.TyB1UUd72;
        int i3 = jMfjgYvcq.qVUwofr5s;
        if (i3 == -2) {
            int q3BipwRCk = jMfjgYvcq.q3BipwRCk((SpinnerAdapter) this.QNqj6nIzv, oon79WMrY());
            int i4 = this.TyB1UUd72.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.TyB1UUd72.Eeka1udhb;
            int i5 = (i4 - rect2.left) - rect2.right;
            if (q3BipwRCk > i5) {
                q3BipwRCk = i5;
            }
            i = Math.max(q3BipwRCk, (width - paddingLeft) - paddingRight);
        } else if (i3 == -1) {
            i = (width - paddingLeft) - paddingRight;
        } else {
            qVUwofr5s(i3);
            this.ilHKhw3Yw = !qyCamnJnJ.J4Ux7ym32(this.TyB1UUd72) ? (((width - paddingRight) - this.MzoOEjc4X) - this.EBQXiIPmm) + i2 : paddingLeft + this.EBQXiIPmm + i2;
        }
        qVUwofr5s(i);
        this.ilHKhw3Yw = !qyCamnJnJ.J4Ux7ym32(this.TyB1UUd72) ? (((width - paddingRight) - this.MzoOEjc4X) - this.EBQXiIPmm) + i2 : paddingLeft + this.EBQXiIPmm + i2;
    }

    @Override // con.i8dsFkRky
    public void ilHKhw3Yw(int i) {
        this.EBQXiIPmm = i;
    }

    @Override // con.i8dsFkRky
    public void kCA6Zs9sL(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean J4Ux7ym32 = J4Ux7ym32();
        dXrmkklc8();
        this.vNtjxmzUM.setInputMethodMode(2);
        GPLPRo6go();
        wRt60CcGM wrt60ccgm = this.Bhmn1KIah;
        wrt60ccgm.setChoiceMode(1);
        wrt60ccgm.setTextDirection(i);
        wrt60ccgm.setTextAlignment(i2);
        int selectedItemPosition = this.TyB1UUd72.getSelectedItemPosition();
        wRt60CcGM wrt60ccgm2 = this.Bhmn1KIah;
        if (J4Ux7ym32() && wrt60ccgm2 != null) {
            wrt60ccgm2.setListSelectionHidden(false);
            wrt60ccgm2.setSelection(selectedItemPosition);
            if (wrt60ccgm2.getChoiceMode() != 0) {
                wrt60ccgm2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!J4Ux7ym32 && (viewTreeObserver = this.TyB1UUd72.getViewTreeObserver()) != null) {
            ywLNtYaFP ywlntyafp = new ywLNtYaFP(this);
            viewTreeObserver.addOnGlobalLayoutListener(ywlntyafp);
            this.vNtjxmzUM.setOnDismissListener(new o7UBRNTOv(this, ywlntyafp));
        }
    }

    @Override // con.i8dsFkRky
    public void kmSgne1rO(CharSequence charSequence) {
        this.V9LQMKGJe = charSequence;
    }

    @Override // con.i8dsFkRky
    public CharSequence vPSbyrYWX() {
        return this.V9LQMKGJe;
    }
}
