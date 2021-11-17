package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.feravolt.preload.R;
import con.RAxgJWiGj;
import con.YRza28WC3;
import con.gBRio1gPW;
import con.mznBSeryj;
import con.wROT9IZc9;
/* loaded from: classes.dex */
public class s7MlVynBG extends RecyclerView.s7MlVynBG {
    public final gBRio1gPW.s7MlVynBG GPLPRo6go;
    public final int Puu3Rhg4F;
    public final Context dIocxURUo;
    public final wROT9IZc9 iiGwOFFnr;
    public final RAxgJWiGj kCA6Zs9sL;

    public s7MlVynBG(Context context, wROT9IZc9 wrot9izc9, RAxgJWiGj rAxgJWiGj, gBRio1gPW.s7MlVynBG s7mlvynbg) {
        mznBSeryj mznbseryj = rAxgJWiGj.CBQ5d1kRq;
        mznBSeryj mznbseryj2 = rAxgJWiGj.kmSgne1rO;
        mznBSeryj mznbseryj3 = rAxgJWiGj.PSTqBLTET;
        if (mznbseryj.compareTo(mznbseryj3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (mznbseryj3.compareTo(mznbseryj2) <= 0) {
            int i = mhl5lIdbQ.ilHKhw3Yw;
            int i2 = gBRio1gPW.KlYagMRWx;
            int dimensionPixelSize = i * context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
            int dimensionPixelSize2 = YRza28WC3.M66hQ219i(context) ? context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0;
            this.dIocxURUo = context;
            this.Puu3Rhg4F = dimensionPixelSize + dimensionPixelSize2;
            this.kCA6Zs9sL = rAxgJWiGj;
            this.iiGwOFFnr = wrot9izc9;
            this.GPLPRo6go = s7mlvynbg;
            if (!this.q3BipwRCk.q3BipwRCk()) {
                this.J4Ux7ym32 = true;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s7MlVynBG
    public RecyclerView.cywn6086a GPLPRo6go(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!YRza28WC3.M66hQ219i(viewGroup.getContext())) {
            return new qhPEQQaQ4(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.dgsh68zH8(-1, this.Puu3Rhg4F));
        return new qhPEQQaQ4(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s7MlVynBG
    public long J4Ux7ym32(int i) {
        return this.kCA6Zs9sL.CBQ5d1kRq.Bhmn1KIah(i).CBQ5d1kRq.getTimeInMillis();
    }

    public mznBSeryj Puu3Rhg4F(int i) {
        return this.kCA6Zs9sL.CBQ5d1kRq.Bhmn1KIah(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s7MlVynBG
    public void kCA6Zs9sL(RecyclerView.cywn6086a cywn6086a, int i) {
        qhPEQQaQ4 qhpeqqaq4 = (qhPEQQaQ4) cywn6086a;
        mznBSeryj Bhmn1KIah = this.kCA6Zs9sL.CBQ5d1kRq.Bhmn1KIah(i);
        qhpeqqaq4.RG6kpfv3v.setText(Bhmn1KIah.kmSgne1rO(qhpeqqaq4.q3BipwRCk.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) qhpeqqaq4.ixWaw2akD.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !Bhmn1KIah.equals(materialCalendarGridView.getAdapter().CBQ5d1kRq)) {
            mhl5lIdbQ mhl5lidbq = new mhl5lIdbQ(Bhmn1KIah, this.iiGwOFFnr, this.kCA6Zs9sL);
            materialCalendarGridView.setNumColumns(Bhmn1KIah.PSTqBLTET);
            materialCalendarGridView.setAdapter((ListAdapter) mhl5lidbq);
        } else {
            materialCalendarGridView.invalidate();
            mhl5lIdbQ q3BipwRCk = materialCalendarGridView.getAdapter();
            for (Long l : q3BipwRCk.Bhmn1KIah) {
                q3BipwRCk.iiGwOFFnr(materialCalendarGridView, l.longValue());
            }
            wROT9IZc9 wrot9izc9 = q3BipwRCk.kmSgne1rO;
            if (wrot9izc9 != null) {
                for (Long l2 : wrot9izc9.oon79WMrY()) {
                    q3BipwRCk.iiGwOFFnr(materialCalendarGridView, l2.longValue());
                }
                q3BipwRCk.Bhmn1KIah = q3BipwRCk.kmSgne1rO.oon79WMrY();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new aXI58Y1kr(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s7MlVynBG
    public int q3BipwRCk() {
        return this.kCA6Zs9sL.ilHKhw3Yw;
    }

    public int yWvV4ePLl(mznBSeryj mznbseryj) {
        return this.kCA6Zs9sL.CBQ5d1kRq.PSTqBLTET(mznbseryj);
    }
}
