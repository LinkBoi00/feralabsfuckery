package con;

import java.util.ArrayList;
/* loaded from: classes.dex */
public class CmrPzG2TC extends DrTf1eLw4 {
    public CmrPzG2TC(PmanMZxiM pmanMZxiM) {
        super(pmanMZxiM);
    }

    @Override // con.DrTf1eLw4
    public void Bhmn1KIah(Object obj, WPks89pLg wPks89pLg) {
        xwkpuMyKi xwkpumyki = null;
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                oTpJSKL6O otpjskl6o = (oTpJSKL6O) obj;
                if (otpjskl6o instanceof vE0oHsMA1) {
                    PmanMZxiM pmanMZxiM = this.J4Ux7ym32;
                    if (pmanMZxiM != null) {
                        xwkpumyki = anXlDk6fV.GPLPRo6go(pmanMZxiM, ((vE0oHsMA1) otpjskl6o).PSTqBLTET, null);
                    }
                } else {
                    otpjskl6o.qFBXIgpia(wPks89pLg);
                }
            } else {
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    xwkpuMyKi xwkpumyki2 = null;
                    while (true) {
                        int i = size - 1;
                        oTpJSKL6O otpjskl6o2 = (oTpJSKL6O) arrayList.get(size);
                        if (otpjskl6o2 instanceof vE0oHsMA1) {
                            PmanMZxiM pmanMZxiM2 = this.J4Ux7ym32;
                            xwkpumyki2 = pmanMZxiM2 == null ? null : anXlDk6fV.GPLPRo6go(pmanMZxiM2, ((vE0oHsMA1) otpjskl6o2).PSTqBLTET, xwkpumyki2);
                        } else {
                            otpjskl6o2.qFBXIgpia(wPks89pLg);
                        }
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    }
                    xwkpumyki = xwkpumyki2;
                }
            }
        }
        if (xwkpumyki != null) {
            throw xwkpumyki;
        }
    }

    @Override // con.spFv56w6q
    public Object kCA6Zs9sL(Object obj) {
        OIfZMZeX0 oIfZMZeX0;
        do {
            Object kCA6Zs9sL = super.kCA6Zs9sL(obj);
            vX9ZKIhAp vx9zkihap = dgsh68zH8.J4Ux7ym32;
            if (kCA6Zs9sL == vx9zkihap) {
                return vx9zkihap;
            }
            if (kCA6Zs9sL == dgsh68zH8.tGV7Q6urW) {
                DV1oYHwIh dV1oYHwIh = this.tGV7Q6urW;
                vE0oHsMA1 ve0ohsma1 = new vE0oHsMA1(obj);
                while (true) {
                    DV1oYHwIh MzoOEjc4X = dV1oYHwIh.MzoOEjc4X();
                    if (!(MzoOEjc4X instanceof OIfZMZeX0)) {
                        if (MzoOEjc4X.oon79WMrY(ve0ohsma1, dV1oYHwIh)) {
                            oIfZMZeX0 = null;
                            break;
                        }
                    } else {
                        oIfZMZeX0 = (OIfZMZeX0) MzoOEjc4X;
                        break;
                    }
                }
                if (oIfZMZeX0 == null) {
                    return dgsh68zH8.J4Ux7ym32;
                }
            } else if (kCA6Zs9sL instanceof WPks89pLg) {
                return kCA6Zs9sL;
            } else {
                throw new IllegalStateException(anXlDk6fV.iMyQMM6Qj("Invalid offerInternal result ", kCA6Zs9sL).toString());
            }
        } while (!(oIfZMZeX0 instanceof WPks89pLg));
        return oIfZMZeX0;
    }

    @Override // con.DrTf1eLw4
    public final boolean oon79WMrY() {
        return true;
    }

    @Override // con.DrTf1eLw4
    public final boolean vPSbyrYWX() {
        return true;
    }
}
