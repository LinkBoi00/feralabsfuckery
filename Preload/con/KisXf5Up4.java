package con;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
/* loaded from: classes.dex */
public class KisXf5Up4 extends AnimationSet implements Runnable {
    public boolean Bhmn1KIah;
    public final ViewGroup CBQ5d1kRq;
    public boolean MzoOEjc4X = true;
    public boolean PSTqBLTET;
    public final View kmSgne1rO;

    public KisXf5Up4(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.CBQ5d1kRq = viewGroup;
        this.kmSgne1rO = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public boolean getTransformation(long j, Transformation transformation) {
        this.MzoOEjc4X = true;
        if (this.Bhmn1KIah) {
            return !this.PSTqBLTET;
        }
        if (!super.getTransformation(j, transformation)) {
            this.Bhmn1KIah = true;
            zgCCamJKk.q3BipwRCk(this.CBQ5d1kRq, this);
        }
        return true;
    }

    @Override // android.view.animation.Animation
    public boolean getTransformation(long j, Transformation transformation, float f) {
        this.MzoOEjc4X = true;
        if (this.Bhmn1KIah) {
            return !this.PSTqBLTET;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.Bhmn1KIah = true;
            zgCCamJKk.q3BipwRCk(this.CBQ5d1kRq, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.Bhmn1KIah || !this.MzoOEjc4X) {
            this.CBQ5d1kRq.endViewTransition(this.kmSgne1rO);
            this.PSTqBLTET = true;
            return;
        }
        this.MzoOEjc4X = false;
        this.CBQ5d1kRq.post(this);
    }
}
