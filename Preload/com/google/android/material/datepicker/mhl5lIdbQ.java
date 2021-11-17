package com.google.android.material.datepicker;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.feravolt.preload.R;
import con.AepEH275c;
import con.GB7SBlGiG;
import con.N6L1mvree;
import con.RAxgJWiGj;
import con.SfQ6fqrlg;
import con.mznBSeryj;
import con.wROT9IZc9;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        Long tGV7Q6urW;
        CharSequence charSequence;
        Context context = viewGroup.getContext();
        if (this.PSTqBLTET == null) {
            this.PSTqBLTET = new GB7SBlGiG(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int J4Ux7ym32 = i - J4Ux7ym32();
        if (J4Ux7ym32 >= 0) {
            mznBSeryj mznbseryj = this.CBQ5d1kRq;
            if (J4Ux7ym32 < mznbseryj.MzoOEjc4X) {
                int i2 = J4Ux7ym32 + 1;
                textView.setTag(mznbseryj);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i2)));
                Calendar J4Ux7ym322 = AepEH275c.J4Ux7ym32(this.CBQ5d1kRq.CBQ5d1kRq);
                J4Ux7ym322.set(5, i2);
                long timeInMillis = J4Ux7ym322.getTimeInMillis();
                int i3 = this.CBQ5d1kRq.Bhmn1KIah;
                Calendar dIocxURUo = AepEH275c.dIocxURUo();
                dIocxURUo.set(5, 1);
                Calendar J4Ux7ym323 = AepEH275c.J4Ux7ym32(dIocxURUo);
                J4Ux7ym323.get(2);
                int i4 = J4Ux7ym323.get(1);
                J4Ux7ym323.getMaximum(7);
                J4Ux7ym323.getActualMaximum(5);
                J4Ux7ym323.getTimeInMillis();
                if (i3 == i4) {
                    Locale locale = Locale.getDefault();
                    AtomicReference atomicReference = AepEH275c.q3BipwRCk;
                    DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMEd", locale);
                    instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
                    charSequence = instanceForSkeleton.format(new Date(timeInMillis));
                } else {
                    Locale locale2 = Locale.getDefault();
                    AtomicReference atomicReference2 = AepEH275c.q3BipwRCk;
                    DateFormat instanceForSkeleton2 = DateFormat.getInstanceForSkeleton("yMMMEd", locale2);
                    instanceForSkeleton2.setTimeZone(TimeZone.getTimeZone("UTC"));
                    charSequence = instanceForSkeleton2.format(new Date(timeInMillis));
                }
                textView.setContentDescription(charSequence);
                textView.setVisibility(0);
                textView.setEnabled(true);
                tGV7Q6urW = getItem(i);
                if (tGV7Q6urW != null) {
                    kCA6Zs9sL(textView, tGV7Q6urW.longValue());
                }
                return textView;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        tGV7Q6urW = getItem(i);
        if (tGV7Q6urW != null) {
        }
        return textView;
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
