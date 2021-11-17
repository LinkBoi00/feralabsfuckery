package con;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
/* loaded from: classes.dex */
public class cTam6szPC {
    public long J4Ux7ym32;
    public int dIocxURUo;
    public int kCA6Zs9sL;
    public long q3BipwRCk;
    public TimeInterpolator tGV7Q6urW;

    public cTam6szPC(long j, long j2) {
        this.q3BipwRCk = 0;
        this.J4Ux7ym32 = 300;
        this.tGV7Q6urW = null;
        this.dIocxURUo = 0;
        this.kCA6Zs9sL = 1;
        this.q3BipwRCk = j;
        this.J4Ux7ym32 = j2;
    }

    public cTam6szPC(long j, long j2, TimeInterpolator timeInterpolator) {
        this.q3BipwRCk = 0;
        this.J4Ux7ym32 = 300;
        this.tGV7Q6urW = null;
        this.dIocxURUo = 0;
        this.kCA6Zs9sL = 1;
        this.q3BipwRCk = j;
        this.J4Ux7ym32 = j2;
        this.tGV7Q6urW = timeInterpolator;
    }

    public TimeInterpolator J4Ux7ym32() {
        TimeInterpolator timeInterpolator = this.tGV7Q6urW;
        return timeInterpolator != null ? timeInterpolator : vZAFqpduB.J4Ux7ym32;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cTam6szPC)) {
            return false;
        }
        cTam6szPC ctam6szpc = (cTam6szPC) obj;
        if (this.q3BipwRCk == ctam6szpc.q3BipwRCk && this.J4Ux7ym32 == ctam6szpc.J4Ux7ym32 && this.dIocxURUo == ctam6szpc.dIocxURUo && this.kCA6Zs9sL == ctam6szpc.kCA6Zs9sL) {
            return J4Ux7ym32().getClass().equals(ctam6szpc.J4Ux7ym32().getClass());
        }
        return false;
    }

    public int hashCode() {
        long j = this.q3BipwRCk;
        long j2 = this.J4Ux7ym32;
        return ((((J4Ux7ym32().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.dIocxURUo) * 31) + this.kCA6Zs9sL;
    }

    public void q3BipwRCk(Animator animator) {
        animator.setStartDelay(this.q3BipwRCk);
        animator.setDuration(this.J4Ux7ym32);
        animator.setInterpolator(J4Ux7ym32());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.dIocxURUo);
            valueAnimator.setRepeatMode(this.kCA6Zs9sL);
        }
    }

    public String toString() {
        return '\n' + cTam6szPC.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.q3BipwRCk + " duration: " + this.J4Ux7ym32 + " interpolator: " + J4Ux7ym32().getClass() + " repeatCount: " + this.dIocxURUo + " repeatMode: " + this.kCA6Zs9sL + "}\n";
    }
}
