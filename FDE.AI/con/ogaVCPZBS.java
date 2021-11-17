package con;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
/* loaded from: classes.dex */
public final class ogaVCPZBS implements List, p84zpwafz {
    public int Bhmn1KIah;
    public final fhHgxp0FC CBQ5d1kRq;
    public int PSTqBLTET;
    public final int kmSgne1rO;

    public ogaVCPZBS(fhHgxp0FC fhhgxp0fc, int i, int i2) {
        this.CBQ5d1kRq = fhhgxp0fc;
        this.kmSgne1rO = i;
        this.Bhmn1KIah = fhhgxp0fc.kCA6Zs9sL();
        this.PSTqBLTET = i2 - i;
    }

    public final void J4Ux7ym32() {
        if (this.CBQ5d1kRq.kCA6Zs9sL() != this.Bhmn1KIah) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.List
    public void add(int i, Object obj) {
        J4Ux7ym32();
        this.CBQ5d1kRq.add(this.kmSgne1rO + i, obj);
        this.PSTqBLTET++;
        this.Bhmn1KIah = this.CBQ5d1kRq.kCA6Zs9sL();
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        J4Ux7ym32();
        boolean addAll = this.CBQ5d1kRq.addAll(i + this.kmSgne1rO, collection);
        if (addAll) {
            this.PSTqBLTET = collection.size() + this.PSTqBLTET;
            this.Bhmn1KIah = this.CBQ5d1kRq.kCA6Zs9sL();
        }
        return addAll;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        int i;
        HrqgPICFj hrqgPICFj;
        s05BzCoHq Puu3Rhg4F;
        boolean z;
        if (this.PSTqBLTET > 0) {
            J4Ux7ym32();
            fhHgxp0FC fhhgxp0fc = this.CBQ5d1kRq;
            int i2 = this.kmSgne1rO;
            int i3 = this.PSTqBLTET + i2;
            Objects.requireNonNull(fhhgxp0fc);
            do {
                Object obj = IKoPXuXRQ.q3BipwRCk;
                Object obj2 = IKoPXuXRQ.q3BipwRCk;
                synchronized (obj2) {
                    Wmc2i8aNl wmc2i8aNl = (Wmc2i8aNl) UvOuyIFuT.GPLPRo6go((Wmc2i8aNl) fhhgxp0fc.CBQ5d1kRq, UvOuyIFuT.Puu3Rhg4F());
                    i = wmc2i8aNl.dIocxURUo;
                    hrqgPICFj = wmc2i8aNl.tGV7Q6urW;
                }
                uynHRf1qF dIocxURUo = hrqgPICFj.dIocxURUo();
                dIocxURUo.subList(i2, i3).clear();
                HrqgPICFj iiGwOFFnr = ((bYMPHjVnt) dIocxURUo).iiGwOFFnr();
                if (anXlDk6fV.tGV7Q6urW(iiGwOFFnr, hrqgPICFj)) {
                    break;
                }
                synchronized (obj2) {
                    Wmc2i8aNl wmc2i8aNl2 = (Wmc2i8aNl) fhhgxp0fc.CBQ5d1kRq;
                    PlegqbMSA plegqbMSA = UvOuyIFuT.q3BipwRCk;
                    synchronized (UvOuyIFuT.J4Ux7ym32) {
                        Puu3Rhg4F = UvOuyIFuT.Puu3Rhg4F();
                        Wmc2i8aNl wmc2i8aNl3 = (Wmc2i8aNl) UvOuyIFuT.MzoOEjc4X(wmc2i8aNl2, fhhgxp0fc, Puu3Rhg4F);
                        int i4 = wmc2i8aNl3.dIocxURUo;
                        if (i4 == i) {
                            wmc2i8aNl3.tGV7Q6urW = iiGwOFFnr;
                            wmc2i8aNl3.dIocxURUo = i4 + 1;
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    UvOuyIFuT.oon79WMrY(Puu3Rhg4F, fhhgxp0fc);
                }
            } while (!z);
            this.PSTqBLTET = 0;
            this.Bhmn1KIah = this.CBQ5d1kRq.kCA6Zs9sL();
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public Object get(int i) {
        J4Ux7ym32();
        IKoPXuXRQ.J4Ux7ym32(i, this.PSTqBLTET);
        return this.CBQ5d1kRq.get(this.kmSgne1rO + i);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        int J4Ux7ym32;
        J4Ux7ym32();
        int i = this.kmSgne1rO;
        Iterator it = cT9gik1zL.yWvV4ePLl(i, this.PSTqBLTET + i).iterator();
        do {
            hbC5oTdpL hbc5otdpl = (hbC5oTdpL) it;
            if (!hbc5otdpl.kmSgne1rO) {
                return -1;
            }
            J4Ux7ym32 = hbc5otdpl.J4Ux7ym32();
        } while (!anXlDk6fV.tGV7Q6urW(obj, this.CBQ5d1kRq.get(J4Ux7ym32)));
        return J4Ux7ym32 - this.kmSgne1rO;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.PSTqBLTET == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        J4Ux7ym32();
        int i = this.kmSgne1rO + this.PSTqBLTET;
        while (true) {
            i--;
            if (i < this.kmSgne1rO) {
                return -1;
            }
            if (anXlDk6fV.tGV7Q6urW(obj, this.CBQ5d1kRq.get(i))) {
                return i - this.kmSgne1rO;
            }
        }
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        J4Ux7ym32();
        BdFQ0RqNz bdFQ0RqNz = new BdFQ0RqNz();
        bdFQ0RqNz.CBQ5d1kRq = i - 1;
        return new hENERPFnp(bdFQ0RqNz, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        J4Ux7ym32();
        Object remove = this.CBQ5d1kRq.remove(this.kmSgne1rO + i);
        this.PSTqBLTET--;
        this.Bhmn1KIah = this.CBQ5d1kRq.kCA6Zs9sL();
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        boolean z = false;
        while (true) {
            for (Object obj : collection) {
                if (remove(obj) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        int i;
        HrqgPICFj hrqgPICFj;
        s05BzCoHq Puu3Rhg4F;
        boolean z;
        J4Ux7ym32();
        fhHgxp0FC fhhgxp0fc = this.CBQ5d1kRq;
        int i2 = this.kmSgne1rO;
        int i3 = this.PSTqBLTET + i2;
        int size = fhhgxp0fc.size();
        do {
            Object obj = IKoPXuXRQ.q3BipwRCk;
            Object obj2 = IKoPXuXRQ.q3BipwRCk;
            synchronized (obj2) {
                Wmc2i8aNl wmc2i8aNl = (Wmc2i8aNl) UvOuyIFuT.GPLPRo6go((Wmc2i8aNl) fhhgxp0fc.CBQ5d1kRq, UvOuyIFuT.Puu3Rhg4F());
                i = wmc2i8aNl.dIocxURUo;
                hrqgPICFj = wmc2i8aNl.tGV7Q6urW;
            }
            uynHRf1qF dIocxURUo = hrqgPICFj.dIocxURUo();
            dIocxURUo.subList(i2, i3).retainAll(collection);
            HrqgPICFj iiGwOFFnr = ((bYMPHjVnt) dIocxURUo).iiGwOFFnr();
            if (anXlDk6fV.tGV7Q6urW(iiGwOFFnr, hrqgPICFj)) {
                break;
            }
            synchronized (obj2) {
                Wmc2i8aNl wmc2i8aNl2 = (Wmc2i8aNl) fhhgxp0fc.CBQ5d1kRq;
                PlegqbMSA plegqbMSA = UvOuyIFuT.q3BipwRCk;
                synchronized (UvOuyIFuT.J4Ux7ym32) {
                    Puu3Rhg4F = UvOuyIFuT.Puu3Rhg4F();
                    Wmc2i8aNl wmc2i8aNl3 = (Wmc2i8aNl) UvOuyIFuT.MzoOEjc4X(wmc2i8aNl2, fhhgxp0fc, Puu3Rhg4F);
                    int i4 = wmc2i8aNl3.dIocxURUo;
                    if (i4 == i) {
                        wmc2i8aNl3.tGV7Q6urW = iiGwOFFnr;
                        wmc2i8aNl3.dIocxURUo = i4 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
                UvOuyIFuT.oon79WMrY(Puu3Rhg4F, fhhgxp0fc);
            }
        } while (!z);
        int size2 = size - fhhgxp0fc.size();
        if (size2 > 0) {
            this.Bhmn1KIah = this.CBQ5d1kRq.kCA6Zs9sL();
            this.PSTqBLTET -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        IKoPXuXRQ.J4Ux7ym32(i, this.PSTqBLTET);
        J4Ux7ym32();
        Object obj2 = this.CBQ5d1kRq.set(i + this.kmSgne1rO, obj);
        this.Bhmn1KIah = this.CBQ5d1kRq.kCA6Zs9sL();
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.PSTqBLTET;
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        boolean z = true;
        if (!(i >= 0 && i <= i2) || i2 > this.PSTqBLTET) {
            z = false;
        }
        if (z) {
            J4Ux7ym32();
            fhHgxp0FC fhhgxp0fc = this.CBQ5d1kRq;
            int i3 = this.kmSgne1rO;
            return new ogaVCPZBS(fhhgxp0fc, i + i3, i2 + i3);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return ZUB9SUm0g.q3BipwRCk(this);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return ZUB9SUm0g.J4Ux7ym32(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        J4Ux7ym32();
        this.CBQ5d1kRq.add(this.kmSgne1rO + this.PSTqBLTET, obj);
        this.PSTqBLTET++;
        this.Bhmn1KIah = this.CBQ5d1kRq.kCA6Zs9sL();
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        return addAll(this.PSTqBLTET, collection);
    }
}
