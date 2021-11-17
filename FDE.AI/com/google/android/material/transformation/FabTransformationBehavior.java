package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.feravolt.preload.R;
import con.IuQbWntsc;
import con.JS43R0qiH;
import con.Yg5AJdYv8;
import con.anXlDk6fV;
import con.cTam6szPC;
import con.mJLaJepZo;
import con.uBm0YsOoA;
import con.vZAFqpduB;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public float GPLPRo6go;
    public float Puu3Rhg4F;
    public final RectF dIocxURUo;
    public final int[] iiGwOFFnr;
    public final RectF kCA6Zs9sL;
    public final Rect tGV7Q6urW;

    /* loaded from: classes.dex */
    public class RG2GI7LDp extends AnimatorListenerAdapter {
        public final /* synthetic */ View J4Ux7ym32;
        public final /* synthetic */ boolean q3BipwRCk;
        public final /* synthetic */ View tGV7Q6urW;

        public RG2GI7LDp(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.q3BipwRCk = z;
            this.J4Ux7ym32 = view;
            this.tGV7Q6urW = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.q3BipwRCk) {
                this.J4Ux7ym32.setVisibility(4);
                this.tGV7Q6urW.setAlpha(1.0f);
                this.tGV7Q6urW.setVisibility(0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.q3BipwRCk) {
                this.J4Ux7ym32.setVisibility(0);
                this.tGV7Q6urW.setAlpha(0.0f);
                this.tGV7Q6urW.setVisibility(4);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class mhl5lIdbQ {
        public uBm0YsOoA J4Ux7ym32;
        public Yg5AJdYv8 q3BipwRCk;
    }

    public FabTransformationBehavior() {
        this.tGV7Q6urW = new Rect();
        this.dIocxURUo = new RectF();
        this.kCA6Zs9sL = new RectF();
        this.iiGwOFFnr = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.tGV7Q6urW = new Rect();
        this.dIocxURUo = new RectF();
        this.kCA6Zs9sL = new RectF();
        this.iiGwOFFnr = new int[2];
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public boolean J4Ux7ym32(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet RG6kpfv3v(View view, View view2, boolean z, boolean z2) {
        ObjectAnimator objectAnimator;
        ArrayList arrayList;
        ObjectAnimator objectAnimator2;
        ObjectAnimator objectAnimator3;
        ObjectAnimator objectAnimator4;
        mhl5lIdbQ iMyQMM6Qj = iMyQMM6Qj(view2.getContext(), z);
        if (z) {
            this.GPLPRo6go = view.getTranslationX();
            this.Puu3Rhg4F = view.getTranslationY();
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        float yWvV4ePLl = mJLaJepZo.yWvV4ePLl(view2) - mJLaJepZo.yWvV4ePLl(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-yWvV4ePLl);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, -yWvV4ePLl);
        }
        iMyQMM6Qj.q3BipwRCk.dIocxURUo("elevation").q3BipwRCk(objectAnimator);
        arrayList2.add(objectAnimator);
        RectF rectF = this.dIocxURUo;
        float sk5s77z6Q = sk5s77z6Q(view, view2, iMyQMM6Qj.J4Ux7ym32);
        float WaUP0CF08 = WaUP0CF08(view, view2, iMyQMM6Qj.J4Ux7ym32);
        Pair ixWaw2akD = ixWaw2akD(sk5s77z6Q, WaUP0CF08, z, iMyQMM6Qj);
        cTam6szPC ctam6szpc = (cTam6szPC) ixWaw2akD.first;
        cTam6szPC ctam6szpc2 = (cTam6szPC) ixWaw2akD.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-sk5s77z6Q);
                view2.setTranslationY(-WaUP0CF08);
            }
            arrayList = arrayList3;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, 0.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, 0.0f);
            float i8XZMQc6Z = i8XZMQc6Z(iMyQMM6Qj, ctam6szpc, -sk5s77z6Q, 0.0f);
            float i8XZMQc6Z2 = i8XZMQc6Z(iMyQMM6Qj, ctam6szpc2, -WaUP0CF08, 0.0f);
            Rect rect = this.tGV7Q6urW;
            view2.getWindowVisibleDisplayFrame(rect);
            RectF rectF2 = this.dIocxURUo;
            rectF2.set(rect);
            RectF rectF3 = this.kCA6Zs9sL;
            dfpT1j18n(view2, rectF3);
            rectF3.offset(i8XZMQc6Z, i8XZMQc6Z2);
            rectF3.intersect(rectF2);
            rectF.set(rectF3);
            objectAnimator2 = ofFloat2;
            objectAnimator3 = ofFloat;
        } else {
            arrayList = arrayList3;
            objectAnimator3 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_X, -sk5s77z6Q);
            objectAnimator2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, -WaUP0CF08);
        }
        ctam6szpc.q3BipwRCk(objectAnimator3);
        ctam6szpc2.q3BipwRCk(objectAnimator2);
        arrayList2.add(objectAnimator3);
        arrayList2.add(objectAnimator2);
        rectF.width();
        rectF.height();
        float sk5s77z6Q2 = sk5s77z6Q(view, view2, iMyQMM6Qj.J4Ux7ym32);
        float WaUP0CF082 = WaUP0CF08(view, view2, iMyQMM6Qj.J4Ux7ym32);
        Pair ixWaw2akD2 = ixWaw2akD(sk5s77z6Q2, WaUP0CF082, z, iMyQMM6Qj);
        cTam6szPC ctam6szpc3 = (cTam6szPC) ixWaw2akD2.first;
        cTam6szPC ctam6szpc4 = (cTam6szPC) ixWaw2akD2.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            sk5s77z6Q2 = this.GPLPRo6go;
        }
        fArr[0] = sk5s77z6Q2;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            WaUP0CF082 = this.Puu3Rhg4F;
        }
        fArr2[0] = WaUP0CF082;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, property2, fArr2);
        ctam6szpc3.q3BipwRCk(ofFloat3);
        ctam6szpc4.q3BipwRCk(ofFloat4);
        arrayList2.add(ofFloat3);
        arrayList2.add(ofFloat4);
        if (view2 instanceof ViewGroup) {
            View findViewById = view2.findViewById(R.id.mtrl_child_content_container);
            ViewGroup cAwN510t2 = findViewById != null ? cAwN510t2(findViewById) : cAwN510t2(view2);
            if (cAwN510t2 != null) {
                if (z) {
                    if (!z2) {
                        JS43R0qiH.q3BipwRCk.set(cAwN510t2, Float.valueOf(0.0f));
                    }
                    objectAnimator4 = ObjectAnimator.ofFloat(cAwN510t2, JS43R0qiH.q3BipwRCk, 1.0f);
                } else {
                    objectAnimator4 = ObjectAnimator.ofFloat(cAwN510t2, JS43R0qiH.q3BipwRCk, 0.0f);
                }
                iMyQMM6Qj.q3BipwRCk.dIocxURUo("contentFade").q3BipwRCk(objectAnimator4);
                arrayList2.add(objectAnimator4);
            }
        }
        AnimatorSet animatorSet = new AnimatorSet();
        anXlDk6fV.i8XZMQc6Z(animatorSet, arrayList2);
        animatorSet.addListener(new RG2GI7LDp(this, z, view2, view));
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList.get(i));
        }
        return animatorSet;
    }

    public final float WaUP0CF08(View view, View view2, uBm0YsOoA ubm0ysooa) {
        RectF rectF = this.dIocxURUo;
        RectF rectF2 = this.kCA6Zs9sL;
        dfpT1j18n(view, rectF);
        rectF.offset(this.GPLPRo6go, this.Puu3Rhg4F);
        dfpT1j18n(view2, rectF2);
        Objects.requireNonNull(ubm0ysooa);
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final ViewGroup cAwN510t2(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    public final void dfpT1j18n(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.iiGwOFFnr;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    public final float i8XZMQc6Z(mhl5lIdbQ mhl5lidbq, cTam6szPC ctam6szpc, float f, float f2) {
        long j = ctam6szpc.q3BipwRCk;
        long j2 = ctam6szpc.J4Ux7ym32;
        cTam6szPC dIocxURUo = mhl5lidbq.q3BipwRCk.dIocxURUo("expansion");
        return vZAFqpduB.q3BipwRCk(f, f2, ctam6szpc.J4Ux7ym32().getInterpolation(((float) (((dIocxURUo.q3BipwRCk + dIocxURUo.J4Ux7ym32) + 17) - j)) / ((float) j2)));
    }

    public abstract mhl5lIdbQ iMyQMM6Qj(Context context, boolean z);

    public final Pair ixWaw2akD(float f, float f2, boolean z, mhl5lIdbQ mhl5lidbq) {
        String str;
        Yg5AJdYv8 yg5AJdYv8;
        cTam6szPC ctam6szpc;
        int i;
        if (f == 0.0f || f2 == 0.0f) {
            ctam6szpc = mhl5lidbq.q3BipwRCk.dIocxURUo("translationXLinear");
            yg5AJdYv8 = mhl5lidbq.q3BipwRCk;
            str = "translationYLinear";
        } else if ((!z || f2 >= 0.0f) && (z || i <= 0)) {
            ctam6szpc = mhl5lidbq.q3BipwRCk.dIocxURUo("translationXCurveDownwards");
            yg5AJdYv8 = mhl5lidbq.q3BipwRCk;
            str = "translationYCurveDownwards";
        } else {
            ctam6szpc = mhl5lidbq.q3BipwRCk.dIocxURUo("translationXCurveUpwards");
            yg5AJdYv8 = mhl5lidbq.q3BipwRCk;
            str = "translationYCurveUpwards";
        }
        return new Pair(ctam6szpc, yg5AJdYv8.dIocxURUo(str));
    }

    public final float sk5s77z6Q(View view, View view2, uBm0YsOoA ubm0ysooa) {
        RectF rectF = this.dIocxURUo;
        RectF rectF2 = this.kCA6Zs9sL;
        dfpT1j18n(view, rectF);
        rectF.offset(this.GPLPRo6go, this.Puu3Rhg4F);
        dfpT1j18n(view2, rectF2);
        Objects.requireNonNull(ubm0ysooa);
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.mhl5lIdbQ
    public void tGV7Q6urW(CoordinatorLayout.s7MlVynBG s7mlvynbg) {
        if (s7mlvynbg.Puu3Rhg4F == 0) {
            s7mlvynbg.Puu3Rhg4F = 80;
        }
    }
}
