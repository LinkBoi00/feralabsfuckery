package con;

import android.graphics.Typeface;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import con.uyyOxpvGH;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class PlegqbMSA implements N1zulf8pH {
    public Object CBQ5d1kRq;
    public Object kmSgne1rO;

    public PlegqbMSA(int i) {
        if (i == 3) {
            this.CBQ5d1kRq = new AtomicReference(aF4H4jYoJ.q3BipwRCk);
            this.kmSgne1rO = new Object();
        } else if (i == 6) {
            this.CBQ5d1kRq = new pnuAOe8oh(new Reference[16], 0);
            this.kmSgne1rO = new ReferenceQueue();
        } else if (i != 7) {
            this.CBQ5d1kRq = new LinkedHashMap();
            this.kmSgne1rO = new LinkedHashMap();
        } else {
            joIJ4ANvK joij4anvk = SXpWpmH9A.q3BipwRCk;
            JhpbRXxsg jhpbRXxsg = czCYotiRn.J4Ux7ym32;
            eTxfvEx3L etxfvex3l = new eTxfvEx3L(joij4anvk, czCYotiRn.tGV7Q6urW, (czCYotiRn) null, (dnBSj5uJN) null);
            this.CBQ5d1kRq = etxfvex3l;
            this.kmSgne1rO = new gIb52UzMw(joij4anvk, etxfvex3l.J4Ux7ym32, null);
        }
    }

    public void CBQ5d1kRq(Object obj) {
        boolean z;
        long id = Thread.currentThread().getId();
        synchronized (this.kmSgne1rO) {
            Lj9YtXGTc lj9YtXGTc = (Lj9YtXGTc) ((AtomicReference) this.CBQ5d1kRq).get();
            int q3BipwRCk = lj9YtXGTc.q3BipwRCk(id);
            if (q3BipwRCk < 0) {
                z = false;
            } else {
                lj9YtXGTc.tGV7Q6urW[q3BipwRCk] = obj;
                z = true;
            }
            if (!z) {
                ((AtomicReference) this.CBQ5d1kRq).set(lj9YtXGTc.J4Ux7ym32(id, obj));
            }
        }
    }

    public boolean GPLPRo6go(View view, int i) {
        SkzwiTATT skzwiTATT = (SkzwiTATT) this.kmSgne1rO;
        int dIocxURUo = ((rfzJlVTU4) ((Bp6zELb4E) this.CBQ5d1kRq)).dIocxURUo();
        int tGV7Q6urW = ((rfzJlVTU4) ((Bp6zELb4E) this.CBQ5d1kRq)).tGV7Q6urW();
        int J4Ux7ym32 = ((rfzJlVTU4) ((Bp6zELb4E) this.CBQ5d1kRq)).J4Ux7ym32(view);
        int q3BipwRCk = ((rfzJlVTU4) ((Bp6zELb4E) this.CBQ5d1kRq)).q3BipwRCk(view);
        skzwiTATT.J4Ux7ym32 = dIocxURUo;
        skzwiTATT.tGV7Q6urW = tGV7Q6urW;
        skzwiTATT.dIocxURUo = J4Ux7ym32;
        skzwiTATT.kCA6Zs9sL = q3BipwRCk;
        if (i == 0) {
            return false;
        }
        SkzwiTATT skzwiTATT2 = (SkzwiTATT) this.kmSgne1rO;
        skzwiTATT2.q3BipwRCk = 0;
        skzwiTATT2.q3BipwRCk = 0 | i;
        return skzwiTATT2.q3BipwRCk();
    }

    @Override // con.N1zulf8pH
    public o8nscdGif J4Ux7ym32(View view, o8nscdGif o8nscdgif) {
        McxhmydD3 mcxhmydD3 = (McxhmydD3) this.kmSgne1rO;
        int i = mcxhmydD3.q3BipwRCk;
        int i2 = mcxhmydD3.tGV7Q6urW;
        int i3 = mcxhmydD3.dIocxURUo;
        IiuvtKLs8 iiuvtKLs8 = (IiuvtKLs8) ((uyyOxpvGH.RG2GI7LDp) this.CBQ5d1kRq);
        iiuvtKLs8.J4Ux7ym32.Eeka1udhb = o8nscdgif.dIocxURUo();
        boolean q3BipwRCk = uyyOxpvGH.q3BipwRCk(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        BottomSheetBehavior bottomSheetBehavior = iiuvtKLs8.J4Ux7ym32;
        if (bottomSheetBehavior.Bhmn1KIah) {
            bottomSheetBehavior.qVUwofr5s = o8nscdgif.q3BipwRCk();
            paddingBottom = iiuvtKLs8.J4Ux7ym32.qVUwofr5s + i3;
        }
        if (iiuvtKLs8.J4Ux7ym32.PSTqBLTET) {
            paddingLeft = o8nscdgif.J4Ux7ym32() + (q3BipwRCk ? i2 : i);
        }
        if (iiuvtKLs8.J4Ux7ym32.MzoOEjc4X) {
            if (!q3BipwRCk) {
                i = i2;
            }
            paddingRight = o8nscdgif.tGV7Q6urW() + i;
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        if (iiuvtKLs8.q3BipwRCk) {
            iiuvtKLs8.J4Ux7ym32.CBQ5d1kRq = o8nscdgif.q3BipwRCk.iiGwOFFnr().dIocxURUo;
        }
        BottomSheetBehavior bottomSheetBehavior2 = iiuvtKLs8.J4Ux7ym32;
        if (bottomSheetBehavior2.Bhmn1KIah || iiuvtKLs8.q3BipwRCk) {
            bottomSheetBehavior2.V9LQMKGJe(false);
        }
        return o8nscdgif;
    }

    public void Puu3Rhg4F(int i) {
        ((Handler) this.kmSgne1rO).post(new mCum8mep9(this, (rPR8g1Ebn) this.CBQ5d1kRq, i));
    }

    public View dIocxURUo(int i, int i2, int i3, int i4) {
        View view;
        int dIocxURUo = ((rfzJlVTU4) ((Bp6zELb4E) this.CBQ5d1kRq)).dIocxURUo();
        int tGV7Q6urW = ((rfzJlVTU4) ((Bp6zELb4E) this.CBQ5d1kRq)).tGV7Q6urW();
        int i5 = i2 > i ? 1 : -1;
        View view2 = null;
        while (i != i2) {
            rfzJlVTU4 rfzjlvtu4 = (rfzJlVTU4) ((Bp6zELb4E) this.CBQ5d1kRq);
            switch (rfzjlvtu4.q3BipwRCk) {
                case 0:
                    view = rfzjlvtu4.J4Ux7ym32.sk5s77z6Q(i);
                    break;
                default:
                    view = rfzjlvtu4.J4Ux7ym32.sk5s77z6Q(i);
                    break;
            }
            int J4Ux7ym32 = ((rfzJlVTU4) ((Bp6zELb4E) this.CBQ5d1kRq)).J4Ux7ym32(view);
            int q3BipwRCk = ((rfzJlVTU4) ((Bp6zELb4E) this.CBQ5d1kRq)).q3BipwRCk(view);
            SkzwiTATT skzwiTATT = (SkzwiTATT) this.kmSgne1rO;
            skzwiTATT.J4Ux7ym32 = dIocxURUo;
            skzwiTATT.tGV7Q6urW = tGV7Q6urW;
            skzwiTATT.dIocxURUo = J4Ux7ym32;
            skzwiTATT.kCA6Zs9sL = q3BipwRCk;
            if (i3 != 0) {
                skzwiTATT.q3BipwRCk = 0;
                skzwiTATT.q3BipwRCk = 0 | i3;
                if (skzwiTATT.q3BipwRCk()) {
                    return view;
                }
            }
            if (i4 != 0) {
                SkzwiTATT skzwiTATT2 = (SkzwiTATT) this.kmSgne1rO;
                skzwiTATT2.q3BipwRCk = 0;
                skzwiTATT2.q3BipwRCk = 0 | i4;
                if (skzwiTATT2.q3BipwRCk()) {
                    view2 = view;
                }
            }
            i += i5;
        }
        return view2;
    }

    public TextClassifier iiGwOFFnr() {
        Object obj = this.kmSgne1rO;
        if (((TextClassifier) obj) != null) {
            return (TextClassifier) obj;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) ((TextView) this.CBQ5d1kRq).getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public Object kCA6Zs9sL() {
        Lj9YtXGTc lj9YtXGTc = (Lj9YtXGTc) ((AtomicReference) this.CBQ5d1kRq).get();
        int q3BipwRCk = lj9YtXGTc.q3BipwRCk(Thread.currentThread().getId());
        if (q3BipwRCk >= 0) {
            return lj9YtXGTc.tGV7Q6urW[q3BipwRCk];
        }
        return null;
    }

    public void oon79WMrY(Typeface typeface) {
        ((Handler) this.kmSgne1rO).post(new UcCYfgGXO(this, (rPR8g1Ebn) this.CBQ5d1kRq, typeface));
    }

    public eTxfvEx3L q3BipwRCk(List list) {
        int size = list.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                ((wX7bxQPFb) list.get(i)).q3BipwRCk((gIb52UzMw) this.kmSgne1rO);
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        czCYotiRn czcyotirn = null;
        joIJ4ANvK joij4anvk = new joIJ4ANvK(((gIb52UzMw) this.kmSgne1rO).toString(), (List) null, (List) null, 6);
        Object obj = this.kmSgne1rO;
        long iiGwOFFnr = ODug2UCW1.iiGwOFFnr(((gIb52UzMw) obj).J4Ux7ym32, ((gIb52UzMw) obj).tGV7Q6urW);
        if (((gIb52UzMw) this.kmSgne1rO).kCA6Zs9sL()) {
            Object obj2 = this.kmSgne1rO;
            czcyotirn = new czCYotiRn(ODug2UCW1.iiGwOFFnr(((gIb52UzMw) obj2).dIocxURUo, ((gIb52UzMw) obj2).kCA6Zs9sL));
        }
        eTxfvEx3L etxfvex3l = new eTxfvEx3L(joij4anvk, iiGwOFFnr, czcyotirn, (dnBSj5uJN) null);
        this.CBQ5d1kRq = etxfvex3l;
        return etxfvex3l;
    }

    public void tGV7Q6urW() {
        Reference poll;
        do {
            poll = ((ReferenceQueue) this.kmSgne1rO).poll();
            if (poll != null) {
                ((pnuAOe8oh) this.CBQ5d1kRq).vPSbyrYWX(poll);
                continue;
            }
        } while (poll != null);
    }

    public void vPSbyrYWX(c7T7lgkF7 c7t7lgkf7) {
        R30OeZHHv r30OeZHHv = (R30OeZHHv) ((Map) this.CBQ5d1kRq).get(c7t7lgkf7);
        if (r30OeZHHv != null) {
            c7T7lgkF7 c7t7lgkf72 = (c7T7lgkF7) ((Map) this.kmSgne1rO).remove(r30OeZHHv);
        }
        ((Map) this.CBQ5d1kRq).remove(c7t7lgkf7);
    }

    public void yWvV4ePLl(OLEAwlv46 oLEAwlv46) {
        int i = oLEAwlv46.J4Ux7ym32;
        if (i == 0) {
            oon79WMrY(oLEAwlv46.q3BipwRCk);
        } else {
            Puu3Rhg4F(i);
        }
    }

    public PlegqbMSA(int i, int i2) {
        this.CBQ5d1kRq = new int[]{i, i2};
        this.kmSgne1rO = new float[]{0.0f, 1.0f};
    }

    public PlegqbMSA(int i, int i2, int i3) {
        this.CBQ5d1kRq = new int[]{i, i2, i3};
        this.kmSgne1rO = new float[]{0.0f, 0.5f, 1.0f};
    }

    public PlegqbMSA(TextView textView) {
        this.CBQ5d1kRq = textView;
    }

    public PlegqbMSA(PlegqbMSA plegqbMSA, eTxfvEx3L etxfvex3l) {
        this.CBQ5d1kRq = plegqbMSA;
        this.kmSgne1rO = etxfvex3l;
    }

    public PlegqbMSA(mnTaxtMa7 mntaxtma7) {
        this.CBQ5d1kRq = mntaxtma7;
        this.kmSgne1rO = new tsLnSEVVf();
    }

    public PlegqbMSA(rPR8g1Ebn rpr8g1ebn, Handler handler) {
        this.CBQ5d1kRq = rpr8g1ebn;
        this.kmSgne1rO = handler;
    }

    public PlegqbMSA(Bp6zELb4E bp6zELb4E) {
        this.CBQ5d1kRq = bp6zELb4E;
        this.kmSgne1rO = new SkzwiTATT();
    }

    public PlegqbMSA(uyyOxpvGH.RG2GI7LDp rG2GI7LDp, McxhmydD3 mcxhmydD3) {
        this.CBQ5d1kRq = rG2GI7LDp;
        this.kmSgne1rO = mcxhmydD3;
    }

    public PlegqbMSA(List list, List list2) {
        int size = list.size();
        this.CBQ5d1kRq = new int[size];
        this.kmSgne1rO = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.CBQ5d1kRq)[i] = ((Integer) list.get(i)).intValue();
            ((float[]) this.kmSgne1rO)[i] = ((Float) list2.get(i)).floatValue();
        }
    }

    public PlegqbMSA(Map map, MotionEvent motionEvent) {
        this.CBQ5d1kRq = map;
        this.kmSgne1rO = motionEvent;
    }
}
