package con;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import con.SBj41z1W0;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class yO301sien extends SBj41z1W0 {
    public int i0Zug1mVk;
    public ArrayList NyWTwPF6V = new ArrayList();
    public boolean vNtjxmzUM = true;
    public boolean o4LF8RkoQ = false;
    public int V9LQMKGJe = 0;

    @Override // con.SBj41z1W0
    public String AqaWJg0b4(String str) {
        String AqaWJg0b4 = super.AqaWJg0b4(str);
        for (int i = 0; i < this.NyWTwPF6V.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(AqaWJg0b4);
            sb.append("\n");
            sb.append(((SBj41z1W0) this.NyWTwPF6V.get(i)).AqaWJg0b4(str + "  "));
            AqaWJg0b4 = sb.toString();
        }
        return AqaWJg0b4;
    }

    @Override // con.SBj41z1W0
    public void CBQ5d1kRq(ViewGroup viewGroup, LKa8y802S lKa8y802S, LKa8y802S lKa8y802S2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.kmSgne1rO;
        int size = this.NyWTwPF6V.size();
        for (int i = 0; i < size; i++) {
            SBj41z1W0 sBj41z1W0 = (SBj41z1W0) this.NyWTwPF6V.get(i);
            if (j > 0 && (this.vNtjxmzUM || i == 0)) {
                long j2 = sBj41z1W0.kmSgne1rO;
                if (j2 > 0) {
                    sBj41z1W0.qFBXIgpia(j2 + j);
                } else {
                    sBj41z1W0.qFBXIgpia(j);
                }
            }
            sBj41z1W0.CBQ5d1kRq(viewGroup, lKa8y802S, lKa8y802S2, arrayList, arrayList2);
        }
    }

    @Override // con.SBj41z1W0
    public void CpG0imbht(idpM54xlp idpm54xlp) {
        this.V9LQMKGJe |= 2;
        int size = this.NyWTwPF6V.size();
        for (int i = 0; i < size; i++) {
            ((SBj41z1W0) this.NyWTwPF6V.get(i)).CpG0imbht(idpm54xlp);
        }
    }

    @Override // con.SBj41z1W0
    public void GPLPRo6go(kw8QXWz47 kw8qxwz47) {
        if (Eeka1udhb(kw8qxwz47.J4Ux7ym32)) {
            Iterator it = this.NyWTwPF6V.iterator();
            while (it.hasNext()) {
                SBj41z1W0 sBj41z1W0 = (SBj41z1W0) it.next();
                if (sBj41z1W0.Eeka1udhb(kw8qxwz47.J4Ux7ym32)) {
                    sBj41z1W0.GPLPRo6go(kw8qxwz47);
                    kw8qxwz47.tGV7Q6urW.add(sBj41z1W0);
                }
            }
        }
    }

    @Override // con.SBj41z1W0
    public void IytU16YUK(ZNRZ3lc8t zNRZ3lc8t) {
        this.qFBXIgpia = zNRZ3lc8t == null ? SBj41z1W0.AqaWJg0b4 : zNRZ3lc8t;
        this.V9LQMKGJe |= 4;
        if (this.NyWTwPF6V != null) {
            for (int i = 0; i < this.NyWTwPF6V.size(); i++) {
                ((SBj41z1W0) this.NyWTwPF6V.get(i)).IytU16YUK(zNRZ3lc8t);
            }
        }
    }

    @Override // con.SBj41z1W0
    public SBj41z1W0 J4Ux7ym32(View view) {
        for (int i = 0; i < this.NyWTwPF6V.size(); i++) {
            ((SBj41z1W0) this.NyWTwPF6V.get(i)).J4Ux7ym32(view);
        }
        this.ilHKhw3Yw.add(view);
        return this;
    }

    public SBj41z1W0 NyWTwPF6V(int i) {
        if (i < 0 || i >= this.NyWTwPF6V.size()) {
            return null;
        }
        return (SBj41z1W0) this.NyWTwPF6V.get(i);
    }

    @Override // con.SBj41z1W0
    public void RG6kpfv3v(View view) {
        super.RG6kpfv3v(view);
        int size = this.NyWTwPF6V.size();
        for (int i = 0; i < size; i++) {
            ((SBj41z1W0) this.NyWTwPF6V.get(i)).RG6kpfv3v(view);
        }
    }

    @Override // con.SBj41z1W0
    public void WaUP0CF08(View view) {
        super.WaUP0CF08(view);
        int size = this.NyWTwPF6V.size();
        for (int i = 0; i < size; i++) {
            ((SBj41z1W0) this.NyWTwPF6V.get(i)).WaUP0CF08(view);
        }
    }

    @Override // con.SBj41z1W0
    public SBj41z1W0 cAwN510t2(TimeInterpolator timeInterpolator) {
        this.V9LQMKGJe |= 1;
        ArrayList arrayList = this.NyWTwPF6V;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((SBj41z1W0) this.NyWTwPF6V.get(i)).cAwN510t2(timeInterpolator);
            }
        }
        this.PSTqBLTET = timeInterpolator;
        return this;
    }

    @Override // con.SBj41z1W0
    public void dIocxURUo(kw8QXWz47 kw8qxwz47) {
        if (Eeka1udhb(kw8qxwz47.J4Ux7ym32)) {
            Iterator it = this.NyWTwPF6V.iterator();
            while (it.hasNext()) {
                SBj41z1W0 sBj41z1W0 = (SBj41z1W0) it.next();
                if (sBj41z1W0.Eeka1udhb(kw8qxwz47.J4Ux7ym32)) {
                    sBj41z1W0.dIocxURUo(kw8qxwz47);
                    kw8qxwz47.tGV7Q6urW.add(sBj41z1W0);
                }
            }
        }
    }

    @Override // con.SBj41z1W0
    public SBj41z1W0 dfpT1j18n(long j) {
        ArrayList arrayList;
        this.Bhmn1KIah = j;
        if (j >= 0 && (arrayList = this.NyWTwPF6V) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((SBj41z1W0) this.NyWTwPF6V.get(i)).dfpT1j18n(j);
            }
        }
        return this;
    }

    @Override // con.SBj41z1W0
    public void i8XZMQc6Z() {
        if (this.NyWTwPF6V.isEmpty()) {
            nlGCs0NZs();
            kmSgne1rO();
            return;
        }
        ITbnSAjEK iTbnSAjEK = new ITbnSAjEK(this);
        Iterator it = this.NyWTwPF6V.iterator();
        while (it.hasNext()) {
            ((SBj41z1W0) it.next()).q3BipwRCk(iTbnSAjEK);
        }
        this.i0Zug1mVk = this.NyWTwPF6V.size();
        if (!this.vNtjxmzUM) {
            for (int i = 1; i < this.NyWTwPF6V.size(); i++) {
                ((SBj41z1W0) this.NyWTwPF6V.get(i - 1)).q3BipwRCk(new Ui7MxKF7n(this, (SBj41z1W0) this.NyWTwPF6V.get(i)));
            }
            SBj41z1W0 sBj41z1W0 = (SBj41z1W0) this.NyWTwPF6V.get(0);
            if (sBj41z1W0 != null) {
                sBj41z1W0.i8XZMQc6Z();
                return;
            }
            return;
        }
        Iterator it2 = this.NyWTwPF6V.iterator();
        while (it2.hasNext()) {
            ((SBj41z1W0) it2.next()).i8XZMQc6Z();
        }
    }

    @Override // con.SBj41z1W0
    public void iMyQMM6Qj(SBj41z1W0.RG2GI7LDp rG2GI7LDp) {
        this.CpG0imbht = rG2GI7LDp;
        this.V9LQMKGJe |= 8;
        int size = this.NyWTwPF6V.size();
        for (int i = 0; i < size; i++) {
            ((SBj41z1W0) this.NyWTwPF6V.get(i)).iMyQMM6Qj(rG2GI7LDp);
        }
    }

    @Override // con.SBj41z1W0
    public void iiGwOFFnr(kw8QXWz47 kw8qxwz47) {
        int size = this.NyWTwPF6V.size();
        for (int i = 0; i < size; i++) {
            ((SBj41z1W0) this.NyWTwPF6V.get(i)).iiGwOFFnr(kw8qxwz47);
        }
    }

    @Override // con.SBj41z1W0
    public SBj41z1W0 ixWaw2akD(SBj41z1W0.mhl5lIdbQ mhl5lidbq) {
        super.ixWaw2akD(mhl5lidbq);
        return this;
    }

    public yO301sien mUqPm6GBh(SBj41z1W0 sBj41z1W0) {
        this.NyWTwPF6V.add(sBj41z1W0);
        sBj41z1W0.dXrmkklc8 = this;
        long j = this.Bhmn1KIah;
        if (j >= 0) {
            sBj41z1W0.dfpT1j18n(j);
        }
        if ((this.V9LQMKGJe & 1) != 0) {
            sBj41z1W0.cAwN510t2(this.PSTqBLTET);
        }
        if ((this.V9LQMKGJe & 2) != 0) {
            sBj41z1W0.CpG0imbht(null);
        }
        if ((this.V9LQMKGJe & 4) != 0) {
            sBj41z1W0.IytU16YUK(this.qFBXIgpia);
        }
        if ((this.V9LQMKGJe & 8) != 0) {
            sBj41z1W0.iMyQMM6Qj(this.CpG0imbht);
        }
        return this;
    }

    @Override // con.SBj41z1W0
    /* renamed from: oon79WMrY */
    public SBj41z1W0 clone() {
        yO301sien yo301sien = (yO301sien) super.clone();
        yo301sien.NyWTwPF6V = new ArrayList();
        int size = this.NyWTwPF6V.size();
        for (int i = 0; i < size; i++) {
            SBj41z1W0 oon79WMrY = ((SBj41z1W0) this.NyWTwPF6V.get(i)).clone();
            yo301sien.NyWTwPF6V.add(oon79WMrY);
            oon79WMrY.dXrmkklc8 = yo301sien;
        }
        return yo301sien;
    }

    @Override // con.SBj41z1W0
    public SBj41z1W0 q3BipwRCk(SBj41z1W0.mhl5lIdbQ mhl5lidbq) {
        super.q3BipwRCk(mhl5lidbq);
        return this;
    }

    @Override // con.SBj41z1W0
    public SBj41z1W0 qFBXIgpia(long j) {
        this.kmSgne1rO = j;
        return this;
    }

    @Override // con.SBj41z1W0
    public SBj41z1W0 sk5s77z6Q(View view) {
        for (int i = 0; i < this.NyWTwPF6V.size(); i++) {
            ((SBj41z1W0) this.NyWTwPF6V.get(i)).sk5s77z6Q(view);
        }
        this.ilHKhw3Yw.remove(view);
        return this;
    }

    public yO301sien vNtjxmzUM(int i) {
        if (i == 0) {
            this.vNtjxmzUM = true;
        } else if (i == 1) {
            this.vNtjxmzUM = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        }
        return this;
    }
}
