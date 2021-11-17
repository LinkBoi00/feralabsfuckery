package con;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public final class s949OxqB2 extends z3ICU5k15 {
    public final boolean J4Ux7ym32;
    public final /* synthetic */ wpXpbWG1J iiGwOFFnr;
    public final int q3BipwRCk;
    public Set tGV7Q6urW;
    public final Set dIocxURUo = new LinkedHashSet();
    public final RNEcgN6dQ kCA6Zs9sL = u51fgFYkV.dIocxURUo(OFzjsdJSX.PSTqBLTET, null, 2, null);

    public s949OxqB2(wpXpbWG1J wpxpbwg1j, int i, boolean z) {
        this.iiGwOFFnr = wpxpbwg1j;
        this.q3BipwRCk = i;
        this.J4Ux7ym32 = z;
        JhpbRXxsg jhpbRXxsg = OFzjsdJSX.Bhmn1KIah;
    }

    @Override // con.z3ICU5k15
    public void CBQ5d1kRq(USS5dphka uSS5dphka) {
        this.iiGwOFFnr.tGV7Q6urW.CBQ5d1kRq(uSS5dphka);
    }

    @Override // con.z3ICU5k15
    public void GPLPRo6go(USS5dphka uSS5dphka) {
        wpXpbWG1J wpxpbwg1j = this.iiGwOFFnr;
        wpxpbwg1j.tGV7Q6urW.GPLPRo6go(wpxpbwg1j.GPLPRo6go);
        this.iiGwOFFnr.tGV7Q6urW.GPLPRo6go(uSS5dphka);
    }

    @Override // con.z3ICU5k15
    public void J4Ux7ym32() {
        wpXpbWG1J wpxpbwg1j = this.iiGwOFFnr;
        wpxpbwg1j.dfpT1j18n--;
    }

    @Override // con.z3ICU5k15
    public void Puu3Rhg4F(Set set) {
        Set set2 = this.tGV7Q6urW;
        if (set2 == null) {
            set2 = new HashSet();
            this.tGV7Q6urW = set2;
        }
        set2.add(set);
    }

    @Override // con.z3ICU5k15
    public vf6drsTF1 dIocxURUo() {
        return (vf6drsTF1) ((prCJwNx2x) this.kCA6Zs9sL).getValue();
    }

    @Override // con.z3ICU5k15
    public bu5cjmae6 iiGwOFFnr() {
        return this.iiGwOFFnr.tGV7Q6urW.iiGwOFFnr();
    }

    @Override // con.z3ICU5k15
    public int kCA6Zs9sL() {
        return this.q3BipwRCk;
    }

    public final void kmSgne1rO() {
        if (!this.dIocxURUo.isEmpty()) {
            Set<Set> set = this.tGV7Q6urW;
            if (set != null) {
                for (wpXpbWG1J wpxpbwg1j : this.dIocxURUo) {
                    for (Set set2 : set) {
                        set2.remove(wpxpbwg1j.dIocxURUo);
                    }
                }
            }
            this.dIocxURUo.clear();
        }
    }

    @Override // con.z3ICU5k15
    public void oon79WMrY() {
        this.iiGwOFFnr.dfpT1j18n++;
    }

    @Override // con.z3ICU5k15
    public void q3BipwRCk(USS5dphka uSS5dphka, kkcQgCx5G kkcqgcx5g) {
        this.iiGwOFFnr.tGV7Q6urW.q3BipwRCk(uSS5dphka, kkcqgcx5g);
    }

    @Override // con.z3ICU5k15
    public boolean tGV7Q6urW() {
        return this.J4Ux7ym32;
    }

    @Override // con.z3ICU5k15
    public void vPSbyrYWX(rJ0s9PfCL rj0s9pfcl) {
        Set<Set> set = this.tGV7Q6urW;
        if (set != null) {
            for (Set set2 : set) {
                set2.remove(((wpXpbWG1J) rj0s9pfcl).dIocxURUo);
            }
        }
        Set set3 = this.dIocxURUo;
        Objects.requireNonNull(set3, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        if (!(set3 instanceof f7VKpcPHS) || (set3 instanceof p84zpwafz)) {
            set3.remove(rj0s9pfcl);
        } else {
            cOutqbkMD.kmSgne1rO(set3, "kotlin.collections.MutableCollection");
            throw null;
        }
    }

    @Override // con.z3ICU5k15
    public void yWvV4ePLl(rJ0s9PfCL rj0s9pfcl) {
        this.dIocxURUo.add(rj0s9pfcl);
    }
}
