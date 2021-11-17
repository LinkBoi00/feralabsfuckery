package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import android.widget.TextView;
import con.AepEH275c;
import con.GB7SBlGiG;
import con.N6L1mvree;
import con.RAxgJWiGj;
import con.SfQ6fqrlg;
import con.mznBSeryj;
import con.wROT9IZc9;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes.dex */
public class mhl5lIdbQ extends BaseAdapter {
    public static final int ilHKhw3Yw = AepEH275c.kCA6Zs9sL().getMaximum(4);
    public Collection Bhmn1KIah;
    public final mznBSeryj CBQ5d1kRq;
    public final RAxgJWiGj MzoOEjc4X;
    public GB7SBlGiG PSTqBLTET;
    public final wROT9IZc9 kmSgne1rO;

    public mhl5lIdbQ(mznBSeryj mznbseryj, wROT9IZc9 wrot9izc9, RAxgJWiGj rAxgJWiGj) {
        this.CBQ5d1kRq = mznbseryj;
        this.kmSgne1rO = wrot9izc9;
        this.MzoOEjc4X = rAxgJWiGj;
        this.Bhmn1KIah = wrot9izc9.oon79WMrY();
    }

    public int J4Ux7ym32() {
        return this.CBQ5d1kRq.CBQ5d1kRq();
    }

    public int dIocxURUo() {
        return (this.CBQ5d1kRq.CBQ5d1kRq() + this.CBQ5d1kRq.MzoOEjc4X) - 1;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return J4Ux7ym32() + this.CBQ5d1kRq.MzoOEjc4X;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return (long) (i / this.CBQ5d1kRq.PSTqBLTET);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00de  */
    @Override // android.widget.Adapter
    /* Code decompiled incorrectly, please refer to instructions dump */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            android.content.Context r0 = r11.getContext()
            con.GB7SBlGiG r1 = r8.PSTqBLTET
            if (r1 != 0) goto L_0x000f
            con.GB7SBlGiG r1 = new con.GB7SBlGiG
            r1.<init>(r0)
            r8.PSTqBLTET = r1
        L_0x000f:
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r10 != 0) goto L_0x0027
            android.content.Context r10 = r11.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r0 = 2131492950(0x7f0c0056, float:1.8609366E38)
            android.view.View r10 = r10.inflate(r0, r11, r1)
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0027:
            int r10 = r8.J4Ux7ym32()
            int r10 = r9 - r10
            if (r10 < 0) goto L_0x00cf
            con.mznBSeryj r11 = r8.CBQ5d1kRq
            int r2 = r11.MzoOEjc4X
            if (r10 < r2) goto L_0x0037
            goto L_0x00cf
        L_0x0037:
            r2 = 1
            int r10 = r10 + r2
            r0.setTag(r11)
            android.content.res.Resources r11 = r0.getResources()
            android.content.res.Configuration r11 = r11.getConfiguration()
            java.util.Locale r11 = r11.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r11 = java.lang.String.format(r11, r4, r3)
            r0.setText(r11)
            con.mznBSeryj r11 = r8.CBQ5d1kRq
            java.util.Calendar r11 = r11.CBQ5d1kRq
            java.util.Calendar r11 = con.AepEH275c.J4Ux7ym32(r11)
            r3 = 5
            r11.set(r3, r10)
            long r10 = r11.getTimeInMillis()
            con.mznBSeryj r4 = r8.CBQ5d1kRq
            int r4 = r4.Bhmn1KIah
            java.util.Calendar r5 = con.AepEH275c.dIocxURUo()
            r5.set(r3, r2)
            java.util.Calendar r5 = con.AepEH275c.J4Ux7ym32(r5)
            r6 = 2
            r5.get(r6)
            int r6 = r5.get(r2)
            r7 = 7
            r5.getMaximum(r7)
            r5.getActualMaximum(r3)
            r5.getTimeInMillis()
            java.lang.String r3 = "UTC"
            if (r4 != r6) goto L_0x00a9
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.util.concurrent.atomic.AtomicReference r5 = con.AepEH275c.q3BipwRCk
            java.lang.String r5 = "MMMEd"
            android.icu.text.DateFormat r4 = android.icu.text.DateFormat.getInstanceForSkeleton(r5, r4)
            android.icu.util.TimeZone r3 = android.icu.util.TimeZone.getTimeZone(r3)
            r4.setTimeZone(r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>(r10)
            java.lang.String r10 = r4.format(r3)
            goto L_0x00c5
        L_0x00a9:
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.util.concurrent.atomic.AtomicReference r5 = con.AepEH275c.q3BipwRCk
            java.lang.String r5 = "yMMMEd"
            android.icu.text.DateFormat r4 = android.icu.text.DateFormat.getInstanceForSkeleton(r5, r4)
            android.icu.util.TimeZone r3 = android.icu.util.TimeZone.getTimeZone(r3)
            r4.setTimeZone(r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>(r10)
            java.lang.String r10 = r4.format(r3)
        L_0x00c5:
            r0.setContentDescription(r10)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x00d7
        L_0x00cf:
            r10 = 8
            r0.setVisibility(r10)
            r0.setEnabled(r1)
        L_0x00d7:
            java.lang.Long r9 = r8.getItem(r9)
            if (r9 != 0) goto L_0x00de
            goto L_0x00e5
        L_0x00de:
            long r9 = r9.longValue()
            r8.kCA6Zs9sL(r0, r9)
        L_0x00e5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.mhl5lIdbQ.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public final void iiGwOFFnr(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (mznBSeryj.vPSbyrYWX(j).equals(this.CBQ5d1kRq)) {
            Calendar J4Ux7ym32 = AepEH275c.J4Ux7ym32(this.CBQ5d1kRq.CBQ5d1kRq);
            J4Ux7ym32.setTimeInMillis(j);
            kCA6Zs9sL((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().q3BipwRCk(J4Ux7ym32.get(5)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    public final void kCA6Zs9sL(TextView textView, long j) {
        SfQ6fqrlg sfQ6fqrlg;
        if (textView != null) {
            boolean z = true;
            if (j >= ((N6L1mvree) this.MzoOEjc4X.Bhmn1KIah).CBQ5d1kRq) {
                textView.setEnabled(true);
                Iterator it = this.kmSgne1rO.oon79WMrY().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    } else {
                        if (AepEH275c.q3BipwRCk(j) == AepEH275c.q3BipwRCk(((Long) it.next()).longValue())) {
                            break;
                        }
                    }
                }
                sfQ6fqrlg = z ? this.PSTqBLTET.J4Ux7ym32 : AepEH275c.dIocxURUo().getTimeInMillis() == j ? this.PSTqBLTET.tGV7Q6urW : this.PSTqBLTET.q3BipwRCk;
            } else {
                textView.setEnabled(false);
                sfQ6fqrlg = this.PSTqBLTET.GPLPRo6go;
            }
            sfQ6fqrlg.CBQ5d1kRq(textView);
        }
    }

    public int q3BipwRCk(int i) {
        return J4Ux7ym32() + (i - 1);
    }

    /* renamed from: tGV7Q6urW */
    public Long getItem(int i) {
        if (i < this.CBQ5d1kRq.CBQ5d1kRq() || i > dIocxURUo()) {
            return null;
        }
        mznBSeryj mznbseryj = this.CBQ5d1kRq;
        Calendar J4Ux7ym32 = AepEH275c.J4Ux7ym32(mznbseryj.CBQ5d1kRq);
        J4Ux7ym32.set(5, (i - mznbseryj.CBQ5d1kRq()) + 1);
        return Long.valueOf(J4Ux7ym32.getTimeInMillis());
    }
}
