package con;

import java.text.CharacterIterator;
/* loaded from: classes.dex */
public final class P000ZIs6c implements CharacterIterator {
    public final int Bhmn1KIah;
    public final CharSequence CBQ5d1kRq;
    public int PSTqBLTET;
    public final int kmSgne1rO;

    public P000ZIs6c(CharSequence charSequence, int i, int i2) {
        this.CBQ5d1kRq = charSequence;
        this.kmSgne1rO = i;
        this.Bhmn1KIah = i2;
        this.PSTqBLTET = i;
    }

    @Override // java.text.CharacterIterator, java.lang.Object
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i = this.PSTqBLTET;
        if (i == this.Bhmn1KIah) {
            return 65535;
        }
        return this.CBQ5d1kRq.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.PSTqBLTET = this.kmSgne1rO;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.kmSgne1rO;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.Bhmn1KIah;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.PSTqBLTET;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i = this.kmSgne1rO;
        int i2 = this.Bhmn1KIah;
        if (i == i2) {
            this.PSTqBLTET = i2;
            return 65535;
        }
        int i3 = i2 - 1;
        this.PSTqBLTET = i3;
        return this.CBQ5d1kRq.charAt(i3);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i = this.PSTqBLTET + 1;
        this.PSTqBLTET = i;
        int i2 = this.Bhmn1KIah;
        if (i < i2) {
            return this.CBQ5d1kRq.charAt(i);
        }
        this.PSTqBLTET = i2;
        return 65535;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i = this.PSTqBLTET;
        if (i <= this.kmSgne1rO) {
            return 65535;
        }
        int i2 = i - 1;
        this.PSTqBLTET = i2;
        return this.CBQ5d1kRq.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i) {
        int i2 = this.kmSgne1rO;
        boolean z = false;
        if (i <= this.Bhmn1KIah && i2 <= i) {
            z = true;
        }
        if (z) {
            this.PSTqBLTET = i;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }
}
