package con;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public class LKa8y802S implements uj7tg96A8, u07HajUDq {
    public static LKa8y802S kCA6Zs9sL;
    public Object J4Ux7ym32;
    public Object dIocxURUo;
    public Object q3BipwRCk;
    public Object tGV7Q6urW;

    public LKa8y802S(int i) {
        if (i == 5) {
            this.q3BipwRCk = new nOPp9PCGN(10, 1);
            this.dIocxURUo = new ZmYjNS8wW();
            this.tGV7Q6urW = new ArrayList();
            this.J4Ux7ym32 = new HashSet();
        } else if (i == 7) {
            this.q3BipwRCk = new rwhamSOu2();
            this.J4Ux7ym32 = new SparseArray();
            this.tGV7Q6urW = new NRnsbVC1Y();
            this.dIocxURUo = new rwhamSOu2();
        } else if (i != 8) {
            this.q3BipwRCk = new nOPp9PCGN(256, 0);
            this.J4Ux7ym32 = new nOPp9PCGN(256, 0);
            this.tGV7Q6urW = new nOPp9PCGN(256, 0);
            this.dIocxURUo = new miIsFJ8kP[32];
        } else {
            this.q3BipwRCk = new Object();
            this.J4Ux7ym32 = new Handler(Looper.getMainLooper(), new Vy34gh4kh(this));
        }
    }

    public Menu Bhmn1KIah(Menu menu) {
        Menu menu2 = (Menu) ((ZmYjNS8wW) this.dIocxURUo).getOrDefault(menu, null);
        if (menu2 != null) {
            return menu2;
        }
        EuUQW1ODZ euUQW1ODZ = new EuUQW1ODZ((Context) this.J4Ux7ym32, (sn3fLZljc) menu);
        ((ZmYjNS8wW) this.dIocxURUo).put(menu, euUQW1ODZ);
        return euUQW1ODZ;
    }

    public uYQ8gOoPj[] CBQ5d1kRq(int i, long j) {
        uYQ8gOoPj[] uyq8goopjArr = (uYQ8gOoPj[]) ((HashMap) this.dIocxURUo).get(Integer.valueOf(i));
        if (uyq8goopjArr != null) {
            return uyq8goopjArr;
        }
        Object q3BipwRCk = ((x1XJraxts) this.q3BipwRCk).q3BipwRCk(i);
        List J4Ux7ym32 = ((OzcTQ150H) this.tGV7Q6urW).J4Ux7ym32(q3BipwRCk, ((ZiaC7TNf1) this.J4Ux7ym32).q3BipwRCk(i, q3BipwRCk));
        int size = J4Ux7ym32.size();
        uYQ8gOoPj[] uyq8goopjArr2 = new uYQ8gOoPj[size];
        for (int i2 = 0; i2 < size; i2++) {
            hKxHUWEcH hkxhuwech = (hKxHUWEcH) J4Ux7ym32.get(i2);
            uyq8goopjArr2[i2] = new uYQ8gOoPj(hkxhuwech.dIocxURUo(j), hkxhuwech.Bhmn1KIah());
        }
        ((HashMap) this.dIocxURUo).put(Integer.valueOf(i), uyq8goopjArr2);
        return uyq8goopjArr2;
    }

    public void Eeka1udhb(int i) {
        if (i != 0) {
            Drawable q3BipwRCk = C8A1BseZU.q3BipwRCk(((ImageView) this.q3BipwRCk).getContext(), i);
            if (q3BipwRCk != null) {
                int[] iArr = Y4wRqkFOh.q3BipwRCk;
            }
            ((ImageView) this.q3BipwRCk).setImageDrawable(q3BipwRCk);
        } else {
            ((ImageView) this.q3BipwRCk).setImageDrawable(null);
        }
        Puu3Rhg4F();
    }

    public boolean GPLPRo6go(Drawable drawable) {
        if (((lNNWSSNDS) this.dIocxURUo) == null) {
            this.dIocxURUo = new lNNWSSNDS();
        }
        lNNWSSNDS lnnwssnds = (lNNWSSNDS) this.dIocxURUo;
        lnnwssnds.q3BipwRCk = null;
        lnnwssnds.dIocxURUo = false;
        lnnwssnds.J4Ux7ym32 = null;
        lnnwssnds.tGV7Q6urW = false;
        ColorStateList imageTintList = ((ImageView) this.q3BipwRCk).getImageTintList();
        if (imageTintList != null) {
            lnnwssnds.dIocxURUo = true;
            lnnwssnds.q3BipwRCk = imageTintList;
        }
        PorterDuff.Mode imageTintMode = ((ImageView) this.q3BipwRCk).getImageTintMode();
        if (imageTintMode != null) {
            lnnwssnds.tGV7Q6urW = true;
            lnnwssnds.J4Ux7ym32 = imageTintMode;
        }
        if (!lnnwssnds.dIocxURUo && !lnnwssnds.tGV7Q6urW) {
            return false;
        }
        srLS6zLvm.iiGwOFFnr(drawable, lnnwssnds, ((ImageView) this.q3BipwRCk).getDrawableState());
        return true;
    }

    @Override // con.uj7tg96A8
    public void J4Ux7ym32(pOLFExxoD polfexxod) {
        ((ActionMode.Callback) this.q3BipwRCk).onDestroyActionMode(vPSbyrYWX(polfexxod));
    }

    public void MzoOEjc4X(AttributeSet attributeSet, int i) {
        int iMyQMM6Qj;
        Context context = ((ImageView) this.q3BipwRCk).getContext();
        int[] iArr = ZolH67hOx.iiGwOFFnr;
        j6XJY7rz4 mUqPm6GBh = j6XJY7rz4.mUqPm6GBh(context, attributeSet, iArr, i, 0);
        Object obj = this.q3BipwRCk;
        IuQbWntsc.PSTqBLTET((ImageView) obj, ((ImageView) obj).getContext(), iArr, attributeSet, (TypedArray) mUqPm6GBh.Bhmn1KIah, i, 0);
        try {
            Drawable drawable = ((ImageView) this.q3BipwRCk).getDrawable();
            if (!(drawable != null || (iMyQMM6Qj = mUqPm6GBh.iMyQMM6Qj(1, -1)) == -1 || (drawable = C8A1BseZU.q3BipwRCk(((ImageView) this.q3BipwRCk).getContext(), iMyQMM6Qj)) == null)) {
                ((ImageView) this.q3BipwRCk).setImageDrawable(drawable);
            }
            if (drawable != null) {
                int[] iArr2 = Y4wRqkFOh.q3BipwRCk;
            }
            if (mUqPm6GBh.CpG0imbht(2)) {
                ((ImageView) this.q3BipwRCk).setImageTintList(mUqPm6GBh.Bhmn1KIah(2));
            }
            if (mUqPm6GBh.CpG0imbht(3)) {
                ((ImageView) this.q3BipwRCk).setImageTintMode(Y4wRqkFOh.tGV7Q6urW(mUqPm6GBh.i8XZMQc6Z(3, -1), null));
            }
        } finally {
            mUqPm6GBh.NyWTwPF6V();
        }
    }

    public boolean PSTqBLTET(yCyhNTFLv ycyhntflv) {
        K6PL0z3I0.q3BipwRCk(this.tGV7Q6urW);
        return false;
    }

    public void Puu3Rhg4F() {
        Drawable drawable = ((ImageView) this.q3BipwRCk).getDrawable();
        if (drawable != null) {
            int[] iArr = Y4wRqkFOh.q3BipwRCk;
        }
        if (drawable == null) {
            return;
        }
        if (!ixWaw2akD() || !GPLPRo6go(drawable)) {
            Object obj = this.tGV7Q6urW;
            if (((lNNWSSNDS) obj) != null) {
                srLS6zLvm.iiGwOFFnr(drawable, (lNNWSSNDS) obj, ((ImageView) this.q3BipwRCk).getDrawableState());
                return;
            }
            Object obj2 = this.J4Ux7ym32;
            if (((lNNWSSNDS) obj2) != null) {
                srLS6zLvm.iiGwOFFnr(drawable, (lNNWSSNDS) obj2, ((ImageView) this.q3BipwRCk).getDrawableState());
            }
        }
    }

    public void RG6kpfv3v(PorterDuff.Mode mode) {
        if (((lNNWSSNDS) this.tGV7Q6urW) == null) {
            this.tGV7Q6urW = new lNNWSSNDS();
        }
        Object obj = this.tGV7Q6urW;
        ((lNNWSSNDS) obj).J4Ux7ym32 = mode;
        ((lNNWSSNDS) obj).tGV7Q6urW = true;
        Puu3Rhg4F();
    }

    @Override // con.uj7tg96A8
    public boolean dIocxURUo(pOLFExxoD polfexxod, Menu menu) {
        return ((ActionMode.Callback) this.q3BipwRCk).onCreateActionMode(vPSbyrYWX(polfexxod), Bhmn1KIah(menu));
    }

    public void dXrmkklc8(ColorStateList colorStateList) {
        if (((lNNWSSNDS) this.tGV7Q6urW) == null) {
            this.tGV7Q6urW = new lNNWSSNDS();
        }
        Object obj = this.tGV7Q6urW;
        ((lNNWSSNDS) obj).q3BipwRCk = colorStateList;
        ((lNNWSSNDS) obj).dIocxURUo = true;
        Puu3Rhg4F();
    }

    public void iiGwOFFnr(Object obj) {
        if (!(((ZmYjNS8wW) this.dIocxURUo).kCA6Zs9sL(obj) >= 0)) {
            ((ZmYjNS8wW) this.dIocxURUo).put(obj, null);
        }
    }

    public void ilHKhw3Yw(ArrayList arrayList) {
        arrayList.clear();
        ((nOPp9PCGN) this.q3BipwRCk).tGV7Q6urW(arrayList);
    }

    public boolean ixWaw2akD() {
        return ((lNNWSSNDS) this.J4Ux7ym32) != null;
    }

    @Override // con.uj7tg96A8
    public boolean kCA6Zs9sL(pOLFExxoD polfexxod, Menu menu) {
        return ((ActionMode.Callback) this.q3BipwRCk).onPrepareActionMode(vPSbyrYWX(polfexxod), Bhmn1KIah(menu));
    }

    public ArrayList kmSgne1rO() {
        ArrayList arrayList = (ArrayList) ((nOPp9PCGN) this.q3BipwRCk).q3BipwRCk();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    public void oon79WMrY(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                ArrayList arrayList2 = (ArrayList) ((ZmYjNS8wW) this.dIocxURUo).getOrDefault(obj, null);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        oon79WMrY(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    @Override // con.u07HajUDq
    public void q3BipwRCk() {
        ((View) this.q3BipwRCk).clearAnimation();
        ((ViewGroup) this.J4Ux7ym32).endViewTransition((View) this.q3BipwRCk);
        ((nXj9651z1) this.tGV7Q6urW).J4Ux7ym32();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c6 A[LOOP:3: B:43:0x0160->B:63:0x01c6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c8 A[EDGE_INSN: B:94:0x01c8->B:64:0x01c8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public int qVUwofr5s(ZY8Th66Rr zY8Th66Rr, vk135kjc7 vk135kjc7, boolean z) {
        boolean z2;
        qWbG56qlT qwbg56qlt;
        qWbG56qlT qwbg56qlt2;
        boolean z3;
        boolean z4;
        long j;
        long j2;
        Le3QZ1StH le3QZ1StH = (Le3QZ1StH) this.tGV7Q6urW;
        Objects.requireNonNull(le3QZ1StH);
        LinkedHashMap linkedHashMap = new LinkedHashMap(zY8Th66Rr.tGV7Q6urW.size());
        List list = zY8Th66Rr.tGV7Q6urW;
        int size = list.size() - 1;
        boolean z5 = false;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                YMgMenQKq yMgMenQKq = (YMgMenQKq) list.get(i);
                EntCOxTku entCOxTku = (EntCOxTku) le3QZ1StH.q3BipwRCk.get(new BIFpB3cfs(yMgMenQKq.q3BipwRCk));
                if (entCOxTku == null) {
                    long j3 = yMgMenQKq.J4Ux7ym32;
                    j = yMgMenQKq.dIocxURUo;
                    z4 = z5;
                    j2 = j3;
                } else {
                    long j4 = entCOxTku.q3BipwRCk;
                    boolean z6 = entCOxTku.tGV7Q6urW;
                    j = ((AndroidComposeView) vk135kjc7).dXrmkklc8(entCOxTku.J4Ux7ym32);
                    j2 = j4;
                    z4 = z6;
                }
                long j5 = yMgMenQKq.q3BipwRCk;
                linkedHashMap.put(new BIFpB3cfs(j5), new cKAQplqZy(j5, yMgMenQKq.J4Ux7ym32, yMgMenQKq.dIocxURUo, yMgMenQKq.kCA6Zs9sL, j2, j, z4, new LDRELZkAg(z5, z5, 3), yMgMenQKq.iiGwOFFnr, yMgMenQKq.GPLPRo6go, null));
                boolean z7 = yMgMenQKq.kCA6Zs9sL;
                if (z7) {
                    le3QZ1StH.q3BipwRCk.put(new BIFpB3cfs(yMgMenQKq.q3BipwRCk), new EntCOxTku(yMgMenQKq.J4Ux7ym32, yMgMenQKq.tGV7Q6urW, z7, null));
                } else {
                    le3QZ1StH.q3BipwRCk.remove(new BIFpB3cfs(yMgMenQKq.q3BipwRCk));
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
                z5 = false;
            }
        }
        PlegqbMSA plegqbMSA = new PlegqbMSA(linkedHashMap, (MotionEvent) zY8Th66Rr.J4Ux7ym32);
        Collection<cKAQplqZy> values = ((Map) plegqbMSA.CBQ5d1kRq).values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            for (cKAQplqZy ckaqplqzy : values) {
                if (ckaqplqzy.dIocxURUo || ckaqplqzy.GPLPRo6go) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        boolean z8 = !z2;
        for (cKAQplqZy ckaqplqzy2 : ((Map) plegqbMSA.CBQ5d1kRq).values()) {
            if (z8 || ODug2UCW1.yWvV4ePLl(ckaqplqzy2)) {
                boolean q3BipwRCk = S1s03piHw.q3BipwRCk(ckaqplqzy2.yWvV4ePLl, 1);
                pLYbCSTk0 plybcstk0 = (pLYbCSTk0) this.q3BipwRCk;
                plybcstk0.V9LQMKGJe.ilHKhw3Yw.buPcffgdD(plybcstk0.V9LQMKGJe.ilHKhw3Yw.INnK5Rew6(ckaqplqzy2.tGV7Q6urW), (ugecCdPSw) this.dIocxURUo, q3BipwRCk);
                if (!((ugecCdPSw) this.dIocxURUo).isEmpty()) {
                    long j6 = ckaqplqzy2.q3BipwRCk;
                    ugecCdPSw ugeccdpsw = (ugecCdPSw) this.dIocxURUo;
                    tsLnSEVVf tslnsevvf = (tsLnSEVVf) ((PlegqbMSA) this.J4Ux7ym32).kmSgne1rO;
                    int i3 = ugeccdpsw.PSTqBLTET - 1;
                    if (i3 >= 0) {
                        boolean z9 = true;
                        int i4 = 0;
                        while (true) {
                            int i5 = i4 + 1;
                            ztvmwA530 ztvmwa530 = (ztvmwA530) ugeccdpsw.CBQ5d1kRq[i4];
                            if (z9) {
                                pnuAOe8oh pnuaoe8oh = tslnsevvf.q3BipwRCk;
                                int i6 = pnuaoe8oh.Bhmn1KIah;
                                if (i6 > 0) {
                                    ?? r14 = pnuaoe8oh.CBQ5d1kRq;
                                    int i7 = 0;
                                    while (true) {
                                        qwbg56qlt2 = r14[i7];
                                        if (anXlDk6fV.tGV7Q6urW(((qWbG56qlT) qwbg56qlt2).J4Ux7ym32, ztvmwa530)) {
                                            break;
                                        }
                                        int i8 = i7 + 1;
                                        if (i8 >= i6) {
                                            break;
                                        }
                                        i7 = i8;
                                    }
                                }
                                qwbg56qlt2 = null;
                                qwbg56qlt = qwbg56qlt2;
                                if (qwbg56qlt != null) {
                                    qwbg56qlt.Puu3Rhg4F = true;
                                    if (!qwbg56qlt.tGV7Q6urW.iiGwOFFnr(new BIFpB3cfs(j6))) {
                                        qwbg56qlt.tGV7Q6urW.J4Ux7ym32(new BIFpB3cfs(j6));
                                    }
                                    tslnsevvf = qwbg56qlt;
                                    if (i5 <= i3) {
                                        break;
                                    }
                                    i4 = i5;
                                } else {
                                    z9 = false;
                                }
                            }
                            qwbg56qlt = new qWbG56qlT(ztvmwa530);
                            qwbg56qlt.tGV7Q6urW.J4Ux7ym32(new BIFpB3cfs(j6));
                            tslnsevvf.q3BipwRCk.J4Ux7ym32(qwbg56qlt);
                            tslnsevvf = qwbg56qlt;
                            if (i5 <= i3) {
                            }
                        }
                    }
                    ((ugecCdPSw) this.dIocxURUo).clear();
                }
            }
        }
        ((tsLnSEVVf) ((PlegqbMSA) this.J4Ux7ym32).kmSgne1rO).kCA6Zs9sL();
        PlegqbMSA plegqbMSA2 = (PlegqbMSA) this.J4Ux7ym32;
        int i9 = (((tsLnSEVVf) plegqbMSA2.kmSgne1rO).tGV7Q6urW() || ((tsLnSEVVf) plegqbMSA2.kmSgne1rO).dIocxURUo((Map) plegqbMSA.CBQ5d1kRq, (mnTaxtMa7) plegqbMSA2.CBQ5d1kRq, plegqbMSA, z)) ? 1 : 0;
        boolean z10 = false;
        for (cKAQplqZy ckaqplqzy3 : ((Map) plegqbMSA.CBQ5d1kRq).values()) {
            if (ckaqplqzy3.Puu3Rhg4F.q3BipwRCk) {
                z10 = true;
            }
        }
        return i9 | (z10 ? 2 : 0);
    }

    @Override // con.uj7tg96A8
    public boolean tGV7Q6urW(pOLFExxoD polfexxod, MenuItem menuItem) {
        return ((ActionMode.Callback) this.q3BipwRCk).onActionItemClicked(vPSbyrYWX(polfexxod), new wV2TMeIik((Context) this.J4Ux7ym32, (DIMlfTSGa) menuItem));
    }

    public ActionMode vPSbyrYWX(pOLFExxoD polfexxod) {
        int size = ((ArrayList) this.tGV7Q6urW).size();
        for (int i = 0; i < size; i++) {
            eyRLEBtHJ eyrlebthj = (eyRLEBtHJ) ((ArrayList) this.tGV7Q6urW).get(i);
            if (eyrlebthj != null && eyrlebthj.J4Ux7ym32 == polfexxod) {
                return eyrlebthj;
            }
        }
        eyRLEBtHJ eyrlebthj2 = new eyRLEBtHJ((Context) this.J4Ux7ym32, polfexxod);
        ((ArrayList) this.tGV7Q6urW).add(eyrlebthj2);
        return eyrlebthj2;
    }

    public boolean yWvV4ePLl(FoNOU1IRd foNOU1IRd, int i) {
        Objects.requireNonNull(foNOU1IRd);
        throw null;
    }

    public LKa8y802S(Context context, ActionMode.Callback callback) {
        this.J4Ux7ym32 = context;
        this.q3BipwRCk = callback;
        this.tGV7Q6urW = new ArrayList();
        this.dIocxURUo = new ZmYjNS8wW();
    }

    public LKa8y802S(ImageView imageView) {
        this.q3BipwRCk = imageView;
    }

    public LKa8y802S(t5E8jan4S t5e8jan4s, View view, ViewGroup viewGroup, nXj9651z1 nxj9651z1) {
        this.dIocxURUo = t5e8jan4s;
        this.q3BipwRCk = view;
        this.J4Ux7ym32 = viewGroup;
        this.tGV7Q6urW = nxj9651z1;
    }

    public LKa8y802S(pLYbCSTk0 plybcstk0) {
        this.q3BipwRCk = plybcstk0;
        this.J4Ux7ym32 = new PlegqbMSA(plybcstk0.o4LF8RkoQ);
        this.tGV7Q6urW = new Le3QZ1StH(0);
        this.dIocxURUo = new ugecCdPSw();
    }

    public LKa8y802S(x1XJraxts x1xjraxts, ZiaC7TNf1 ziaC7TNf1, OzcTQ150H ozcTQ150H) {
        this.q3BipwRCk = x1xjraxts;
        this.J4Ux7ym32 = ziaC7TNf1;
        this.tGV7Q6urW = ozcTQ150H;
        this.dIocxURUo = new HashMap();
    }
}
