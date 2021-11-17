package con;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
/* loaded from: classes.dex */
public abstract class IkIPSLCvr extends BaseAdapter implements Filterable, hHINWnUAQ {
    public Cursor Bhmn1KIah;
    public boolean CBQ5d1kRq;
    public MDLhPd9k8 Eeka1udhb;
    public int MzoOEjc4X;
    public Context PSTqBLTET;
    public STF3DPfJi ilHKhw3Yw;
    public boolean kmSgne1rO;
    public DataSetObserver qVUwofr5s;

    public IkIPSLCvr(Context context, Cursor cursor, boolean z) {
        j2ocyIB2J j2ocyib2j;
        boolean z2 = true;
        boolean z3 = z ? true : true;
        if (z3 && true) {
            z3 |= true;
            this.kmSgne1rO = true;
        } else {
            this.kmSgne1rO = false;
        }
        z2 = cursor == null ? false : z2;
        this.Bhmn1KIah = cursor;
        this.CBQ5d1kRq = z2;
        this.PSTqBLTET = context;
        this.MzoOEjc4X = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if (z3 & true) {
            this.ilHKhw3Yw = new STF3DPfJi(this);
            j2ocyib2j = new j2ocyIB2J(this);
        } else {
            j2ocyib2j = null;
            this.ilHKhw3Yw = null;
        }
        this.qVUwofr5s = j2ocyib2j;
        if (z2) {
            STF3DPfJi sTF3DPfJi = this.ilHKhw3Yw;
            if (sTF3DPfJi != null) {
                cursor.registerContentObserver(sTF3DPfJi);
            }
            DataSetObserver dataSetObserver = this.qVUwofr5s;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public void J4Ux7ym32(Cursor cursor) {
        Cursor cursor2 = this.Bhmn1KIah;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                STF3DPfJi sTF3DPfJi = this.ilHKhw3Yw;
                if (sTF3DPfJi != null) {
                    cursor2.unregisterContentObserver(sTF3DPfJi);
                }
                DataSetObserver dataSetObserver = this.qVUwofr5s;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.Bhmn1KIah = cursor;
            if (cursor != null) {
                STF3DPfJi sTF3DPfJi2 = this.ilHKhw3Yw;
                if (sTF3DPfJi2 != null) {
                    cursor.registerContentObserver(sTF3DPfJi2);
                }
                DataSetObserver dataSetObserver2 = this.qVUwofr5s;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.MzoOEjc4X = cursor.getColumnIndexOrThrow("_id");
                this.CBQ5d1kRq = true;
                notifyDataSetChanged();
            } else {
                this.MzoOEjc4X = -1;
                this.CBQ5d1kRq = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract View dIocxURUo(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.CBQ5d1kRq || (cursor = this.Bhmn1KIah) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.CBQ5d1kRq) {
            return null;
        }
        this.Bhmn1KIah.moveToPosition(i);
        if (view == null) {
            Y8Y0XSE4A y8y0xse4a = (Y8Y0XSE4A) this;
            view = y8y0xse4a.ixWaw2akD.inflate(y8y0xse4a.RG6kpfv3v, viewGroup, false);
        }
        q3BipwRCk(view, this.PSTqBLTET, this.Bhmn1KIah);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.Eeka1udhb == null) {
            this.Eeka1udhb = new MDLhPd9k8(this);
        }
        return this.Eeka1udhb;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.CBQ5d1kRq || (cursor = this.Bhmn1KIah) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.Bhmn1KIah;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (!this.CBQ5d1kRq || (cursor = this.Bhmn1KIah) == null || !cursor.moveToPosition(i)) {
            return 0;
        }
        return this.Bhmn1KIah.getLong(this.MzoOEjc4X);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.CBQ5d1kRq) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.Bhmn1KIah.moveToPosition(i)) {
            if (view == null) {
                view = dIocxURUo(this.PSTqBLTET, this.Bhmn1KIah, viewGroup);
            }
            q3BipwRCk(view, this.PSTqBLTET, this.Bhmn1KIah);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i);
        }
    }

    public abstract void q3BipwRCk(View view, Context context, Cursor cursor);

    public abstract CharSequence tGV7Q6urW(Cursor cursor);
}
