package con;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.feravolt.preload.R;
import con.SBj41z1W0;
/* loaded from: classes.dex */
public class xKPlRztCM extends SBj41z1W0 {
    public static final String[] vNtjxmzUM = {"android:visibility:visibility", "android:visibility:parent"};
    public int NyWTwPF6V;

    public xKPlRztCM() {
        this.NyWTwPF6V = 3;
    }

    @Override // con.SBj41z1W0
    public void GPLPRo6go(kw8QXWz47 kw8qxwz47) {
        mUqPm6GBh(kw8qxwz47);
        kw8qxwz47.q3BipwRCk.put("android:fade:transitionAlpha", Float.valueOf(lSxPlj8FZ.q3BipwRCk(kw8qxwz47.J4Ux7ym32)));
    }

    @Override // con.SBj41z1W0
    public String[] MzoOEjc4X() {
        return vNtjxmzUM;
    }

    public final Animator NyWTwPF6V(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        lSxPlj8FZ.q3BipwRCk.GPLPRo6go(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, lSxPlj8FZ.J4Ux7ym32, f2);
        ofFloat.addListener(new ghmRemUn3(view));
        q3BipwRCk(new Ui7MxKF7n(this, view));
        return ofFloat;
    }

    @Override // con.SBj41z1W0
    public void dIocxURUo(kw8QXWz47 kw8qxwz47) {
        mUqPm6GBh(kw8qxwz47);
    }

    public Animator i0Zug1mVk(View view, kw8QXWz47 kw8qxwz47) {
        lSxPlj8FZ.q3BipwRCk.kCA6Zs9sL(view);
        Float f = (Float) kw8qxwz47.q3BipwRCk.get("android:fade:transitionAlpha");
        return NyWTwPF6V(view, f != null ? f.floatValue() : 1.0f, 0.0f);
    }

    public final void mUqPm6GBh(kw8QXWz47 kw8qxwz47) {
        kw8qxwz47.q3BipwRCk.put("android:visibility:visibility", Integer.valueOf(kw8qxwz47.J4Ux7ym32.getVisibility()));
        kw8qxwz47.q3BipwRCk.put("android:visibility:parent", kw8qxwz47.J4Ux7ym32.getParent());
        int[] iArr = new int[2];
        kw8qxwz47.J4Ux7ym32.getLocationOnScreen(iArr);
        kw8qxwz47.q3BipwRCk.put("android:visibility:screenLocation", iArr);
    }

    @Override // con.SBj41z1W0
    public boolean qVUwofr5s(kw8QXWz47 kw8qxwz47, kw8QXWz47 kw8qxwz472) {
        if (kw8qxwz47 == null && kw8qxwz472 == null) {
            return false;
        }
        if (kw8qxwz47 != null && kw8qxwz472 != null && kw8qxwz472.q3BipwRCk.containsKey("android:visibility:visibility") != kw8qxwz47.q3BipwRCk.containsKey("android:visibility:visibility")) {
            return false;
        }
        xSevBfQGg vNtjxmzUM2 = vNtjxmzUM(kw8qxwz47, kw8qxwz472);
        if (vNtjxmzUM2.q3BipwRCk) {
            return vNtjxmzUM2.tGV7Q6urW == 0 || vNtjxmzUM2.dIocxURUo == 0;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
        if (r9 == 0) goto L_0x0088;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
        if (r0.kCA6Zs9sL == null) goto L_0x0088;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
        if (r0.tGV7Q6urW == 0) goto L_0x0091;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final xSevBfQGg vNtjxmzUM(kw8QXWz47 kw8qxwz47, kw8QXWz47 kw8qxwz472) {
        xSevBfQGg xsevbfqgg = new xSevBfQGg();
        xsevbfqgg.q3BipwRCk = false;
        xsevbfqgg.J4Ux7ym32 = false;
        if (kw8qxwz47 == null || !kw8qxwz47.q3BipwRCk.containsKey("android:visibility:visibility")) {
            xsevbfqgg.tGV7Q6urW = -1;
            xsevbfqgg.kCA6Zs9sL = null;
        } else {
            xsevbfqgg.tGV7Q6urW = ((Integer) kw8qxwz47.q3BipwRCk.get("android:visibility:visibility")).intValue();
            xsevbfqgg.kCA6Zs9sL = (ViewGroup) kw8qxwz47.q3BipwRCk.get("android:visibility:parent");
        }
        if (kw8qxwz472 == null || !kw8qxwz472.q3BipwRCk.containsKey("android:visibility:visibility")) {
            xsevbfqgg.dIocxURUo = -1;
            xsevbfqgg.iiGwOFFnr = null;
        } else {
            xsevbfqgg.dIocxURUo = ((Integer) kw8qxwz472.q3BipwRCk.get("android:visibility:visibility")).intValue();
            xsevbfqgg.iiGwOFFnr = (ViewGroup) kw8qxwz472.q3BipwRCk.get("android:visibility:parent");
        }
        if (kw8qxwz47 == null || kw8qxwz472 == null) {
            if (!(kw8qxwz47 == null && xsevbfqgg.dIocxURUo == 0)) {
                if (kw8qxwz472 == null) {
                }
                return xsevbfqgg;
            }
            xsevbfqgg.J4Ux7ym32 = true;
        } else {
            int i = xsevbfqgg.tGV7Q6urW;
            int i2 = xsevbfqgg.dIocxURUo;
            if (!(i == i2 && xsevbfqgg.kCA6Zs9sL == xsevbfqgg.iiGwOFFnr)) {
                if (i != i2) {
                    if (i != 0) {
                    }
                    xsevbfqgg.J4Ux7ym32 = false;
                } else {
                    if (xsevbfqgg.iiGwOFFnr != null) {
                    }
                    xsevbfqgg.J4Ux7ym32 = false;
                }
            }
            return xsevbfqgg;
        }
        xsevbfqgg.q3BipwRCk = true;
        return xsevbfqgg;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (vNtjxmzUM(Bhmn1KIah(r1, false), ilHKhw3Yw(r1, false)).q3BipwRCk != false) goto L_0x0066;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e3  */
    @Override // con.SBj41z1W0
    /* Code decompiled incorrectly, please refer to instructions dump */
    public Animator vPSbyrYWX(ViewGroup viewGroup, kw8QXWz47 kw8qxwz47, kw8QXWz47 kw8qxwz472) {
        int i;
        View view;
        SBj41z1W0.mhl5lIdbQ mhl5lidbq;
        xKPlRztCM xkplrztcm;
        Animator animator;
        boolean z;
        View view2;
        boolean z2;
        boolean z3;
        boolean z4;
        Bitmap bitmap;
        ViewGroup viewGroup2;
        int i2;
        int round;
        Animator animator2;
        Float f;
        xSevBfQGg vNtjxmzUM2 = vNtjxmzUM(kw8qxwz47, kw8qxwz472);
        if (vNtjxmzUM2.q3BipwRCk && !(vNtjxmzUM2.kCA6Zs9sL == null && vNtjxmzUM2.iiGwOFFnr == null)) {
            float f2 = 0.0f;
            boolean z5 = true;
            if (vNtjxmzUM2.J4Ux7ym32) {
                if ((this.NyWTwPF6V & 1) == 1 && kw8qxwz472 != null) {
                    if (kw8qxwz47 == null) {
                        View view3 = (View) kw8qxwz472.J4Ux7ym32.getParent();
                    }
                    View view4 = kw8qxwz472.J4Ux7ym32;
                    float floatValue = (kw8qxwz47 == null || (f = (Float) kw8qxwz47.q3BipwRCk.get("android:fade:transitionAlpha")) == null) ? 0.0f : f.floatValue();
                    if (floatValue != 1.0f) {
                        f2 = floatValue;
                    }
                    animator2 = NyWTwPF6V(view4, f2, 1.0f);
                    return animator2;
                }
                animator2 = null;
                return animator2;
            }
            int i3 = vNtjxmzUM2.dIocxURUo;
            if ((this.NyWTwPF6V & 2) == 2 && kw8qxwz47 != null) {
                View view5 = kw8qxwz47.J4Ux7ym32;
                View view6 = kw8qxwz472 != null ? kw8qxwz472.J4Ux7ym32 : null;
                View view7 = (View) view5.getTag(R.id.save_overlay_view);
                if (view7 != null) {
                    i = i3;
                    view = null;
                } else {
                    if (view6 == null || view6.getParent() == null) {
                        if (view6 != null) {
                            view7 = view6;
                            view6 = null;
                            z = false;
                        }
                        z = true;
                        view6 = null;
                        view7 = null;
                    } else {
                        if (i3 == 4 || view5 == view6) {
                            view7 = null;
                            z = false;
                        }
                        z = true;
                        view6 = null;
                        view7 = null;
                    }
                    if (z) {
                        if (view5.getParent() == null) {
                            view2 = view6;
                            i = i3;
                            view7 = view5;
                        } else if (view5.getParent() instanceof View) {
                            View view8 = (View) view5.getParent();
                            if (!vNtjxmzUM(ilHKhw3Yw(view8, true), Bhmn1KIah(view8, true)).q3BipwRCk) {
                                boolean z6 = h0WLLWnYW.q3BipwRCk;
                                Matrix matrix = new Matrix();
                                matrix.setTranslate((float) (-view8.getScrollX()), (float) (-view8.getScrollY()));
                                ZNRZ3lc8t zNRZ3lc8t = lSxPlj8FZ.q3BipwRCk;
                                zNRZ3lc8t.yWvV4ePLl(view5, matrix);
                                zNRZ3lc8t.oon79WMrY(viewGroup, matrix);
                                RectF rectF = new RectF(0.0f, 0.0f, (float) view5.getWidth(), (float) view5.getHeight());
                                matrix.mapRect(rectF);
                                int round2 = Math.round(rectF.left);
                                int round3 = Math.round(rectF.top);
                                int round4 = Math.round(rectF.right);
                                int round5 = Math.round(rectF.bottom);
                                ImageView imageView = new ImageView(view5.getContext());
                                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                if (h0WLLWnYW.q3BipwRCk) {
                                    z3 = !view5.isAttachedToWindow();
                                    if (viewGroup != null) {
                                        z2 = viewGroup.isAttachedToWindow();
                                        z4 = h0WLLWnYW.J4Ux7ym32;
                                        if (z4 || !z3) {
                                            i2 = 0;
                                            viewGroup2 = null;
                                        } else if (!z2) {
                                            view2 = view6;
                                            i = i3;
                                            bitmap = null;
                                            if (bitmap != null) {
                                                imageView.setImageBitmap(bitmap);
                                            }
                                            imageView.measure(View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824), View.MeasureSpec.makeMeasureSpec(round5 - round3, 1073741824));
                                            imageView.layout(round2, round3, round4, round5);
                                            view7 = imageView;
                                        } else {
                                            viewGroup2 = (ViewGroup) view5.getParent();
                                            i2 = viewGroup2.indexOfChild(view5);
                                            viewGroup.getOverlay().add(view5);
                                        }
                                        view2 = view6;
                                        round = Math.round(rectF.width());
                                        i = i3;
                                        int round6 = Math.round(rectF.height());
                                        if (round > 0 || round6 <= 0) {
                                            bitmap = null;
                                        } else {
                                            float min = Math.min(1.0f, 1048576.0f / ((float) (round * round6)));
                                            int round7 = Math.round(((float) round) * min);
                                            int round8 = Math.round(((float) round6) * min);
                                            matrix.postTranslate(-rectF.left, -rectF.top);
                                            matrix.postScale(min, min);
                                            if (h0WLLWnYW.tGV7Q6urW) {
                                                Picture picture = new Picture();
                                                Canvas beginRecording = picture.beginRecording(round7, round8);
                                                beginRecording.concat(matrix);
                                                view5.draw(beginRecording);
                                                picture.endRecording();
                                                bitmap = Bitmap.createBitmap(picture);
                                            } else {
                                                bitmap = Bitmap.createBitmap(round7, round8, Bitmap.Config.ARGB_8888);
                                                Canvas canvas = new Canvas(bitmap);
                                                canvas.concat(matrix);
                                                view5.draw(canvas);
                                            }
                                        }
                                        if (z4 && z3) {
                                            viewGroup.getOverlay().remove(view5);
                                            viewGroup2.addView(view5, i2);
                                        }
                                        if (bitmap != null) {
                                        }
                                        imageView.measure(View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824), View.MeasureSpec.makeMeasureSpec(round5 - round3, 1073741824));
                                        imageView.layout(round2, round3, round4, round5);
                                        view7 = imageView;
                                    }
                                } else {
                                    z3 = false;
                                }
                                z2 = false;
                                z4 = h0WLLWnYW.J4Ux7ym32;
                                if (z4) {
                                }
                                i2 = 0;
                                viewGroup2 = null;
                                view2 = view6;
                                round = Math.round(rectF.width());
                                i = i3;
                                int round62 = Math.round(rectF.height());
                                if (round > 0) {
                                }
                                bitmap = null;
                                if (z4) {
                                    viewGroup.getOverlay().remove(view5);
                                    viewGroup2.addView(view5, i2);
                                }
                                if (bitmap != null) {
                                }
                                imageView.measure(View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824), View.MeasureSpec.makeMeasureSpec(round5 - round3, 1073741824));
                                imageView.layout(round2, round3, round4, round5);
                                view7 = imageView;
                            } else {
                                view2 = view6;
                                i = i3;
                                int id = view8.getId();
                                if (view8.getParent() == null && id != -1) {
                                    viewGroup.findViewById(id);
                                }
                            }
                        }
                        view = view2;
                        z5 = false;
                    }
                    view2 = view6;
                    i = i3;
                    view = view2;
                    z5 = false;
                }
                if (view7 != null) {
                    if (!z5) {
                        int[] iArr = (int[]) kw8qxwz47.q3BipwRCk.get("android:visibility:screenLocation");
                        int i4 = iArr[0];
                        int i5 = iArr[1];
                        int[] iArr2 = new int[2];
                        viewGroup.getLocationOnScreen(iArr2);
                        view7.offsetLeftAndRight((i4 - iArr2[0]) - view7.getLeft());
                        view7.offsetTopAndBottom((i5 - iArr2[1]) - view7.getTop());
                        viewGroup.getOverlay().add(view7);
                    }
                    xkplrztcm = this;
                    animator = xkplrztcm.i0Zug1mVk(view7, kw8qxwz47);
                    if (!z5) {
                        if (animator == 0) {
                            viewGroup.getOverlay().remove(view7);
                        } else {
                            view5.setTag(R.id.save_overlay_view, view7);
                            mhl5lidbq = new pXnaIbwyE(xkplrztcm, viewGroup, view7, view5);
                            xkplrztcm.q3BipwRCk(mhl5lidbq);
                        }
                    }
                } else {
                    xkplrztcm = this;
                    if (view != null) {
                        int visibility = view.getVisibility();
                        ZNRZ3lc8t zNRZ3lc8t2 = lSxPlj8FZ.q3BipwRCk;
                        zNRZ3lc8t2.Puu3Rhg4F(view, 0);
                        animator = xkplrztcm.i0Zug1mVk(view, kw8qxwz47);
                        if (animator != null) {
                            M6zXUX57e m6zXUX57e = new M6zXUX57e(view, i, true);
                            animator.addListener(m6zXUX57e);
                            animator.addPauseListener(m6zXUX57e);
                            mhl5lidbq = m6zXUX57e;
                            xkplrztcm.q3BipwRCk(mhl5lidbq);
                        } else {
                            zNRZ3lc8t2.Puu3Rhg4F(view, visibility);
                        }
                    }
                    return null;
                }
                return animator;
            }
        }
        return null;
    }

    public xKPlRztCM(int i) {
        this.NyWTwPF6V = 3;
        if ((i & -4) == 0) {
            this.NyWTwPF6V = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
}
