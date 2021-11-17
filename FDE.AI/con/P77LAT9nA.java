package con;

import java.util.Arrays;
/* loaded from: classes.dex */
public abstract class P77LAT9nA {
    private volatile /* synthetic */ int _size = 0;
    public yxtPW6v5D[] q3BipwRCk;

    public final void GPLPRo6go(int i, int i2) {
        yxtPW6v5D[] yxtpw6v5dArr = this.q3BipwRCk;
        yxtPW6v5D yxtpw6v5d = yxtpw6v5dArr[i2];
        yxtPW6v5D yxtpw6v5d2 = yxtpw6v5dArr[i];
        yxtpw6v5dArr[i] = yxtpw6v5d;
        yxtpw6v5dArr[i2] = yxtpw6v5d2;
        yxtpw6v5d.Bhmn1KIah = i;
        yxtpw6v5d2.Bhmn1KIah = i2;
    }

    public final yxtPW6v5D J4Ux7ym32() {
        yxtPW6v5D[] yxtpw6v5dArr = this.q3BipwRCk;
        if (yxtpw6v5dArr == null) {
            return null;
        }
        return yxtpw6v5dArr[0];
    }

    public final yxtPW6v5D dIocxURUo(int i) {
        yxtPW6v5D[] yxtpw6v5dArr = this.q3BipwRCk;
        this._size--;
        if (i < this._size) {
            GPLPRo6go(i, this._size);
            int i2 = (i - 1) / 2;
            if (i <= 0 || yxtpw6v5dArr[i].compareTo(yxtpw6v5dArr[i2]) >= 0) {
                while (true) {
                    int i3 = (i * 2) + 1;
                    if (i3 >= this._size) {
                        break;
                    }
                    yxtPW6v5D[] yxtpw6v5dArr2 = this.q3BipwRCk;
                    int i4 = i3 + 1;
                    if (i4 < this._size && yxtpw6v5dArr2[i4].compareTo(yxtpw6v5dArr2[i3]) < 0) {
                        i3 = i4;
                    }
                    if (yxtpw6v5dArr2[i].compareTo(yxtpw6v5dArr2[i3]) <= 0) {
                        break;
                    }
                    GPLPRo6go(i, i3);
                    i = i3;
                }
            } else {
                GPLPRo6go(i, i2);
                iiGwOFFnr(i2);
            }
        }
        yxtPW6v5D yxtpw6v5d = yxtpw6v5dArr[this._size];
        yxtpw6v5d.tGV7Q6urW(null);
        yxtpw6v5d.Bhmn1KIah = -1;
        yxtpw6v5dArr[this._size] = null;
        return yxtpw6v5d;
    }

    public final void iiGwOFFnr(int i) {
        while (i > 0) {
            yxtPW6v5D[] yxtpw6v5dArr = this.q3BipwRCk;
            int i2 = (i - 1) / 2;
            if (yxtpw6v5dArr[i2].compareTo(yxtpw6v5dArr[i]) > 0) {
                GPLPRo6go(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    public final yxtPW6v5D kCA6Zs9sL() {
        yxtPW6v5D dIocxURUo;
        synchronized (this) {
            dIocxURUo = this._size > 0 ? dIocxURUo(0) : null;
        }
        return dIocxURUo;
    }

    public final void q3BipwRCk(yxtPW6v5D yxtpw6v5d) {
        yxtpw6v5d.tGV7Q6urW(this);
        yxtPW6v5D[] yxtpw6v5dArr = this.q3BipwRCk;
        if (yxtpw6v5dArr == null) {
            yxtpw6v5dArr = new yxtPW6v5D[4];
            this.q3BipwRCk = yxtpw6v5dArr;
        } else if (this._size >= yxtpw6v5dArr.length) {
            yxtpw6v5dArr = (yxtPW6v5D[]) Arrays.copyOf(yxtpw6v5dArr, this._size * 2);
            this.q3BipwRCk = yxtpw6v5dArr;
        }
        int i = this._size;
        this._size = i + 1;
        yxtpw6v5dArr[i] = yxtpw6v5d;
        yxtpw6v5d.Bhmn1KIah = i;
        iiGwOFFnr(i);
    }

    public final boolean tGV7Q6urW() {
        return this._size == 0;
    }
}
