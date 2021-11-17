package con;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.aXI58Y1kr;
import con.XicO3QTQd;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class t5E8jan4S extends J3kbcXHdl {
    public t5E8jan4S(ViewGroup viewGroup) {
        super(viewGroup);
    }

    public void CBQ5d1kRq(rwhamSOu2 rwhamsou2, Collection collection) {
        Iterator it = ((XicO3QTQd.mhl5lIdbQ) rwhamsou2.entrySet()).iterator();
        while (true) {
            XicO3QTQd.qhPEQQaQ4 qhpeqqaq4 = (XicO3QTQd.qhPEQQaQ4) it;
            if (qhpeqqaq4.hasNext()) {
                qhpeqqaq4.next();
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                if (!collection.contains(mJLaJepZo.vPSbyrYWX((View) qhpeqqaq4.getValue()))) {
                    qhpeqqaq4.remove();
                }
            } else {
                return;
            }
        }
    }

    @Override // con.J3kbcXHdl
    public void J4Ux7ym32(List list, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        aXI58Y1kr axi58y1kr;
        String str;
        boolean z2;
        HashMap hashMap;
        boolean z3;
        StringBuilder sb;
        String str2;
        boolean z4;
        LmlART9vy Puu3Rhg4F;
        String str3;
        Iterator it;
        View view;
        zXvxcN9Gl zxvxcn9gl;
        Object obj;
        aXI58Y1kr axi58y1kr2;
        aXI58Y1kr axi58y1kr3;
        Object obj2;
        zXvxcN9Gl zxvxcn9gl2;
        View view2;
        Object obj3;
        String str4;
        rwhamSOu2 rwhamsou2;
        ArrayList arrayList3;
        aXI58Y1kr axi58y1kr4;
        ArrayList arrayList4;
        xobLfQFEO xoblfqfeo;
        ArrayList arrayList5;
        HashMap hashMap2;
        ArrayList arrayList6;
        Rect rect;
        View view3;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        int i;
        View view4;
        boolean z5 = z;
        aXI58Y1kr axi58y1kr5 = aXI58Y1kr.GONE;
        aXI58Y1kr axi58y1kr6 = aXI58Y1kr.VISIBLE;
        Iterator it2 = list.iterator();
        zXvxcN9Gl zxvxcn9gl3 = null;
        zXvxcN9Gl zxvxcn9gl4 = null;
        while (it2.hasNext()) {
            zXvxcN9Gl zxvxcn9gl5 = (zXvxcN9Gl) it2.next();
            aXI58Y1kr tGV7Q6urW = aXI58Y1kr.tGV7Q6urW(zxvxcn9gl5.tGV7Q6urW.EBQXiIPmm);
            int ordinal = zxvxcn9gl5.q3BipwRCk.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (!(ordinal == 2 || ordinal == 3)) {
                    }
                } else if (tGV7Q6urW != axi58y1kr6) {
                    zxvxcn9gl4 = zxvxcn9gl5;
                }
            }
            if (tGV7Q6urW == axi58y1kr6 && zxvxcn9gl3 == null) {
                zxvxcn9gl3 = zxvxcn9gl5;
            }
        }
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList(list);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            zXvxcN9Gl zxvxcn9gl6 = (zXvxcN9Gl) it3.next();
            ce8tBZHr1 ce8tbzhr1 = new ce8tBZHr1();
            zxvxcn9gl6.dIocxURUo();
            zxvxcn9gl6.kCA6Zs9sL.add(ce8tbzhr1);
            arrayList11.add(new nXj9651z1(zxvxcn9gl6, ce8tbzhr1, z5));
            ce8tBZHr1 ce8tbzhr12 = new ce8tBZHr1();
            zxvxcn9gl6.dIocxURUo();
            zxvxcn9gl6.kCA6Zs9sL.add(ce8tbzhr12);
            arrayList12.add(new Sp3ioRUSh(zxvxcn9gl6, ce8tbzhr12, z5, !z5 ? zxvxcn9gl6 == zxvxcn9gl4 : zxvxcn9gl6 == zxvxcn9gl3));
            zxvxcn9gl6.dIocxURUo.add(new ilRFFqvx8(this, arrayList13, zxvxcn9gl6));
        }
        HashMap hashMap3 = new HashMap();
        Iterator it4 = arrayList12.iterator();
        xobLfQFEO xoblfqfeo2 = null;
        while (it4.hasNext()) {
            Sp3ioRUSh sp3ioRUSh = (Sp3ioRUSh) it4.next();
            if (!sp3ioRUSh.kCA6Zs9sL()) {
                xobLfQFEO Puu3Rhg4F2 = sp3ioRUSh.Puu3Rhg4F(sp3ioRUSh.tGV7Q6urW);
                xobLfQFEO Puu3Rhg4F3 = sp3ioRUSh.Puu3Rhg4F(sp3ioRUSh.kCA6Zs9sL);
                if (Puu3Rhg4F2 == null || Puu3Rhg4F3 == null || Puu3Rhg4F2 == Puu3Rhg4F3) {
                    if (Puu3Rhg4F2 == null) {
                        Puu3Rhg4F2 = Puu3Rhg4F3;
                    }
                    if (xoblfqfeo2 == null) {
                        xoblfqfeo2 = Puu3Rhg4F2;
                    } else if (!(Puu3Rhg4F2 == null || xoblfqfeo2 == Puu3Rhg4F2)) {
                        StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                        q3BipwRCk.append(((zXvxcN9Gl) sp3ioRUSh.q3BipwRCk).tGV7Q6urW);
                        q3BipwRCk.append(" returned Transition ");
                        q3BipwRCk.append(sp3ioRUSh.tGV7Q6urW);
                        q3BipwRCk.append(" which uses a different Transition  type than other Fragments.");
                        throw new IllegalArgumentException(q3BipwRCk.toString());
                    }
                } else {
                    StringBuilder q3BipwRCk2 = abGBwSu8x.q3BipwRCk("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    q3BipwRCk2.append(((zXvxcN9Gl) sp3ioRUSh.q3BipwRCk).tGV7Q6urW);
                    q3BipwRCk2.append(" returned Transition ");
                    q3BipwRCk2.append(sp3ioRUSh.tGV7Q6urW);
                    q3BipwRCk2.append(" which uses a different Transition  type than its shared element transition ");
                    q3BipwRCk2.append(sp3ioRUSh.kCA6Zs9sL);
                    throw new IllegalArgumentException(q3BipwRCk2.toString());
                }
            }
        }
        if (xoblfqfeo2 == null) {
            Iterator it5 = arrayList12.iterator();
            while (it5.hasNext()) {
                Sp3ioRUSh sp3ioRUSh2 = (Sp3ioRUSh) it5.next();
                hashMap3.put((zXvxcN9Gl) sp3ioRUSh2.q3BipwRCk, Boolean.FALSE);
                sp3ioRUSh2.J4Ux7ym32();
            }
            z3 = false;
            z2 = true;
            str = "FragmentManager";
            axi58y1kr = axi58y1kr5;
            arrayList2 = arrayList11;
            arrayList = arrayList13;
            hashMap = hashMap3;
        } else {
            View view5 = new View(this.q3BipwRCk.getContext());
            Rect rect2 = new Rect();
            ArrayList arrayList14 = new ArrayList();
            ArrayList arrayList15 = new ArrayList();
            arrayList2 = arrayList11;
            rwhamSOu2 rwhamsou22 = new rwhamSOu2();
            Iterator it6 = arrayList12.iterator();
            Object obj4 = null;
            View view6 = null;
            boolean z6 = false;
            String str5 = "FragmentManager";
            zXvxcN9Gl zxvxcn9gl7 = zxvxcn9gl3;
            zXvxcN9Gl zxvxcn9gl8 = zxvxcn9gl4;
            while (it6.hasNext()) {
                Object obj5 = ((Sp3ioRUSh) it6.next()).kCA6Zs9sL;
                if (!(obj5 != null) || zxvxcn9gl7 == null || zxvxcn9gl8 == null) {
                    arrayList6 = arrayList15;
                    axi58y1kr4 = axi58y1kr5;
                    rwhamsou2 = rwhamsou22;
                    arrayList3 = arrayList12;
                    arrayList4 = arrayList13;
                    hashMap2 = hashMap3;
                    view3 = view5;
                    str4 = str5;
                    arrayList5 = arrayList14;
                    xoblfqfeo = xoblfqfeo2;
                    rect = rect2;
                } else {
                    Object i8XZMQc6Z = xoblfqfeo2.i8XZMQc6Z(xoblfqfeo2.GPLPRo6go(obj5));
                    rwMIknDWL rwmikndwl = zxvxcn9gl8.tGV7Q6urW.j22ftfeNI;
                    if (rwmikndwl == null || (arrayList7 = rwmikndwl.yWvV4ePLl) == null) {
                        arrayList7 = new ArrayList();
                    }
                    rwMIknDWL rwmikndwl2 = zxvxcn9gl7.tGV7Q6urW.j22ftfeNI;
                    if (rwmikndwl2 == null || (arrayList8 = rwmikndwl2.yWvV4ePLl) == null) {
                        arrayList8 = new ArrayList();
                    }
                    arrayList4 = arrayList13;
                    rwMIknDWL rwmikndwl3 = zxvxcn9gl7.tGV7Q6urW.j22ftfeNI;
                    if (rwmikndwl3 == null || (arrayList9 = rwmikndwl3.oon79WMrY) == null) {
                        arrayList9 = new ArrayList();
                    }
                    int i2 = 0;
                    axi58y1kr4 = axi58y1kr5;
                    arrayList3 = arrayList12;
                    while (i2 < arrayList9.size()) {
                        int indexOf = arrayList7.indexOf(arrayList9.get(i2));
                        if (indexOf != -1) {
                            arrayList7.set(indexOf, arrayList8.get(i2));
                        }
                        i2++;
                        arrayList9 = arrayList9;
                    }
                    rwMIknDWL rwmikndwl4 = zxvxcn9gl8.tGV7Q6urW.j22ftfeNI;
                    if (rwmikndwl4 == null || (arrayList10 = rwmikndwl4.oon79WMrY) == null) {
                        arrayList10 = new ArrayList();
                    }
                    if (!z5) {
                        zxvxcn9gl7.tGV7Q6urW.Bhmn1KIah();
                        zxvxcn9gl8.tGV7Q6urW.vPSbyrYWX();
                    } else {
                        zxvxcn9gl7.tGV7Q6urW.vPSbyrYWX();
                        zxvxcn9gl8.tGV7Q6urW.Bhmn1KIah();
                    }
                    int i3 = 0;
                    for (int size = arrayList7.size(); i3 < size; size = size) {
                        rwhamsou22.put((String) arrayList7.get(i3), (String) arrayList10.get(i3));
                        i3++;
                    }
                    rwhamSOu2 rwhamsou23 = new rwhamSOu2();
                    vPSbyrYWX(rwhamsou23, zxvxcn9gl7.tGV7Q6urW.EBQXiIPmm);
                    XicO3QTQd.yWvV4ePLl(rwhamsou23, arrayList7);
                    XicO3QTQd.yWvV4ePLl(rwhamsou22, rwhamsou23.keySet());
                    rwhamSOu2 rwhamsou24 = new rwhamSOu2();
                    vPSbyrYWX(rwhamsou24, zxvxcn9gl8.tGV7Q6urW.EBQXiIPmm);
                    XicO3QTQd.yWvV4ePLl(rwhamsou24, arrayList10);
                    XicO3QTQd.yWvV4ePLl(rwhamsou24, rwhamsou22.values());
                    XU5bm7KSu.kmSgne1rO(rwhamsou22, rwhamsou24);
                    CBQ5d1kRq(rwhamsou23, rwhamsou22.keySet());
                    CBQ5d1kRq(rwhamsou24, rwhamsou22.values());
                    if (rwhamsou22.isEmpty()) {
                        arrayList14.clear();
                        arrayList15.clear();
                        obj4 = null;
                        rect = rect2;
                        arrayList6 = arrayList15;
                        rwhamsou2 = rwhamsou22;
                        hashMap2 = hashMap3;
                        view3 = view5;
                        str4 = str5;
                        xoblfqfeo = xoblfqfeo2;
                        arrayList5 = arrayList14;
                    } else {
                        XU5bm7KSu.tGV7Q6urW(zxvxcn9gl8.tGV7Q6urW, zxvxcn9gl7.tGV7Q6urW, z5, rwhamsou23, true);
                        arrayList6 = arrayList15;
                        rwhamsou2 = rwhamsou22;
                        arrayList5 = arrayList14;
                        str4 = str5;
                        xoblfqfeo = xoblfqfeo2;
                        zgCCamJKk.q3BipwRCk(this.q3BipwRCk, new sAwOkcjWM(this, zxvxcn9gl4, zxvxcn9gl3, z, rwhamsou24));
                        arrayList5.addAll(rwhamsou23.values());
                        if (!arrayList7.isEmpty()) {
                            i = 0;
                            View view7 = (View) rwhamsou23.get((String) arrayList7.get(0));
                            xoblfqfeo.dXrmkklc8(i8XZMQc6Z, view7);
                            view6 = view7;
                        } else {
                            i = 0;
                        }
                        arrayList6.addAll(rwhamsou24.values());
                        if (arrayList10.isEmpty() || (view4 = (View) rwhamsou24.get((String) arrayList10.get(i))) == null) {
                            rect = rect2;
                        } else {
                            rect = rect2;
                            zgCCamJKk.q3BipwRCk(this.q3BipwRCk, new EY90i7dEV(this, xoblfqfeo, view4, rect));
                            z6 = true;
                        }
                        view3 = view5;
                        xoblfqfeo.sk5s77z6Q(i8XZMQc6Z, view3, arrayList5);
                        xoblfqfeo.qVUwofr5s(i8XZMQc6Z, null, null, null, null, i8XZMQc6Z, arrayList6);
                        Boolean bool = Boolean.TRUE;
                        hashMap2 = hashMap3;
                        zxvxcn9gl3 = zxvxcn9gl3;
                        hashMap2.put(zxvxcn9gl3, bool);
                        zxvxcn9gl4 = zxvxcn9gl4;
                        hashMap2.put(zxvxcn9gl4, bool);
                        obj4 = i8XZMQc6Z;
                        zxvxcn9gl7 = zxvxcn9gl3;
                        zxvxcn9gl8 = zxvxcn9gl4;
                    }
                }
                view5 = view3;
                rect2 = rect;
                arrayList15 = arrayList6;
                arrayList14 = arrayList5;
                xoblfqfeo2 = xoblfqfeo;
                axi58y1kr6 = axi58y1kr6;
                arrayList13 = arrayList4;
                arrayList12 = arrayList3;
                rwhamsou22 = rwhamsou2;
                str5 = str4;
                z5 = z;
                hashMap3 = hashMap2;
                axi58y1kr5 = axi58y1kr4;
            }
            aXI58Y1kr axi58y1kr7 = axi58y1kr5;
            aXI58Y1kr axi58y1kr8 = axi58y1kr6;
            arrayList = arrayList13;
            hashMap = hashMap3;
            View view8 = view5;
            String str6 = str5;
            ArrayList arrayList16 = new ArrayList();
            Iterator it7 = arrayList12.iterator();
            Object obj6 = null;
            Object obj7 = null;
            while (it7.hasNext()) {
                Sp3ioRUSh sp3ioRUSh3 = (Sp3ioRUSh) it7.next();
                if (sp3ioRUSh3.kCA6Zs9sL()) {
                    it = it7;
                    zxvxcn9gl = zxvxcn9gl4;
                    hashMap.put((zXvxcN9Gl) sp3ioRUSh3.q3BipwRCk, Boolean.FALSE);
                    sp3ioRUSh3.J4Ux7ym32();
                    view = view8;
                    obj = obj4;
                    zxvxcn9gl2 = zxvxcn9gl8;
                    obj2 = obj6;
                    view2 = view6;
                    axi58y1kr3 = axi58y1kr8;
                    axi58y1kr2 = axi58y1kr7;
                } else {
                    it = it7;
                    zxvxcn9gl = zxvxcn9gl4;
                    Object GPLPRo6go = xoblfqfeo2.GPLPRo6go(sp3ioRUSh3.tGV7Q6urW);
                    zXvxcN9Gl zxvxcn9gl9 = (zXvxcN9Gl) sp3ioRUSh3.q3BipwRCk;
                    boolean z7 = obj4 != null && (zxvxcn9gl9 == zxvxcn9gl7 || zxvxcn9gl9 == zxvxcn9gl8);
                    if (GPLPRo6go == null) {
                        if (!z7) {
                            hashMap.put(zxvxcn9gl9, Boolean.FALSE);
                            sp3ioRUSh3.J4Ux7ym32();
                        }
                        view = view8;
                        obj = obj4;
                        obj3 = obj6;
                        view2 = view6;
                        axi58y1kr3 = axi58y1kr8;
                        axi58y1kr2 = axi58y1kr7;
                    } else {
                        obj = obj4;
                        ArrayList arrayList17 = new ArrayList();
                        oon79WMrY(arrayList17, zxvxcn9gl9.tGV7Q6urW.EBQXiIPmm);
                        if (z7) {
                            if (zxvxcn9gl9 == zxvxcn9gl7) {
                                arrayList17.removeAll(arrayList14);
                            } else {
                                arrayList17.removeAll(arrayList15);
                            }
                        }
                        if (arrayList17.isEmpty()) {
                            xoblfqfeo2.q3BipwRCk(GPLPRo6go, view8);
                            view = view8;
                            axi58y1kr2 = axi58y1kr7;
                        } else {
                            xoblfqfeo2.J4Ux7ym32(GPLPRo6go, arrayList17);
                            xoblfqfeo2.qVUwofr5s(GPLPRo6go, GPLPRo6go, arrayList17, null, null, null, null);
                            axi58y1kr2 = axi58y1kr7;
                            if (zxvxcn9gl9.q3BipwRCk == axi58y1kr2) {
                                arrayList.remove(zxvxcn9gl9);
                                view = view8;
                                ArrayList arrayList18 = new ArrayList(arrayList17);
                                arrayList18.remove(zxvxcn9gl9.tGV7Q6urW.EBQXiIPmm);
                                xoblfqfeo2.ilHKhw3Yw(GPLPRo6go, zxvxcn9gl9.tGV7Q6urW.EBQXiIPmm, arrayList18);
                                zgCCamJKk.q3BipwRCk(this.q3BipwRCk, new DJbXkgfuR(this, arrayList17));
                            } else {
                                view = view8;
                            }
                        }
                        axi58y1kr3 = axi58y1kr8;
                        if (zxvxcn9gl9.q3BipwRCk == axi58y1kr3) {
                            arrayList16.addAll(arrayList17);
                            if (z6) {
                                xoblfqfeo2.Eeka1udhb(GPLPRo6go, rect2);
                            }
                            view2 = view6;
                        } else {
                            view2 = view6;
                            xoblfqfeo2.dXrmkklc8(GPLPRo6go, view2);
                        }
                        hashMap.put(zxvxcn9gl9, Boolean.TRUE);
                        if (sp3ioRUSh3.dIocxURUo) {
                            obj7 = xoblfqfeo2.kmSgne1rO(obj7, GPLPRo6go, null);
                            obj3 = obj6;
                        } else {
                            obj3 = xoblfqfeo2.kmSgne1rO(obj6, GPLPRo6go, null);
                        }
                    }
                    obj2 = obj3;
                    zxvxcn9gl2 = zxvxcn9gl;
                }
                it7 = it;
                view6 = view2;
                axi58y1kr8 = axi58y1kr3;
                axi58y1kr7 = axi58y1kr2;
                zxvxcn9gl4 = zxvxcn9gl;
                view8 = view;
                zxvxcn9gl8 = zxvxcn9gl2;
                obj6 = obj2;
                obj4 = obj;
            }
            zXvxcN9Gl zxvxcn9gl10 = zxvxcn9gl4;
            axi58y1kr = axi58y1kr7;
            Object CBQ5d1kRq = xoblfqfeo2.CBQ5d1kRq(obj7, obj6, obj4);
            Iterator it8 = arrayList12.iterator();
            while (it8.hasNext()) {
                Sp3ioRUSh sp3ioRUSh4 = (Sp3ioRUSh) it8.next();
                if (!sp3ioRUSh4.kCA6Zs9sL()) {
                    Object obj8 = sp3ioRUSh4.tGV7Q6urW;
                    zXvxcN9Gl zxvxcn9gl11 = (zXvxcN9Gl) sp3ioRUSh4.q3BipwRCk;
                    boolean z8 = obj4 != null && (zxvxcn9gl11 == zxvxcn9gl7 || zxvxcn9gl11 == zxvxcn9gl10);
                    if (obj8 != null || z8) {
                        ViewGroup viewGroup = this.q3BipwRCk;
                        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                        if (!mN6fklC4R.tGV7Q6urW(viewGroup)) {
                            if (fVMSvDhE6.juJ6pnCpu(2)) {
                                StringBuilder q3BipwRCk3 = abGBwSu8x.q3BipwRCk("SpecialEffectsController: Container ");
                                q3BipwRCk3.append(this.q3BipwRCk);
                                q3BipwRCk3.append(" has not been laid out. Completing operation ");
                                q3BipwRCk3.append(zxvxcn9gl11);
                                str3 = str6;
                                Log.v(str3, q3BipwRCk3.toString());
                            } else {
                                str3 = str6;
                            }
                            sp3ioRUSh4.J4Ux7ym32();
                        } else {
                            xoblfqfeo2.RG6kpfv3v(((zXvxcN9Gl) sp3ioRUSh4.q3BipwRCk).tGV7Q6urW, CBQ5d1kRq, (ce8tBZHr1) sp3ioRUSh4.J4Ux7ym32, new DJbXkgfuR(this, sp3ioRUSh4));
                            it8 = it8;
                            zxvxcn9gl10 = zxvxcn9gl10;
                        }
                    } else {
                        str3 = str6;
                    }
                    str6 = str3;
                    zxvxcn9gl10 = zxvxcn9gl10;
                }
            }
            str = str6;
            ViewGroup viewGroup2 = this.q3BipwRCk;
            WeakHashMap weakHashMap2 = IuQbWntsc.q3BipwRCk;
            if (!mN6fklC4R.tGV7Q6urW(viewGroup2)) {
                z3 = false;
            } else {
                XU5bm7KSu.PSTqBLTET(arrayList16, 4);
                ArrayList Bhmn1KIah = xoblfqfeo2.Bhmn1KIah(arrayList15);
                xoblfqfeo2.tGV7Q6urW(this.q3BipwRCk, CBQ5d1kRq);
                xoblfqfeo2.ixWaw2akD(this.q3BipwRCk, arrayList14, arrayList15, Bhmn1KIah, rwhamsou22);
                z3 = false;
                XU5bm7KSu.PSTqBLTET(arrayList16, 0);
                xoblfqfeo2.WaUP0CF08(obj4, arrayList14, arrayList15);
            }
            z2 = true;
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup3 = this.q3BipwRCk;
        Context context = viewGroup3.getContext();
        ArrayList arrayList19 = new ArrayList();
        Iterator it9 = arrayList2.iterator();
        boolean z9 = z3;
        while (it9.hasNext()) {
            nXj9651z1 nxj9651z1 = (nXj9651z1) it9.next();
            if (!nxj9651z1.kCA6Zs9sL() && (Puu3Rhg4F = nxj9651z1.Puu3Rhg4F(context)) != null) {
                Animator animator = Puu3Rhg4F.J4Ux7ym32;
                if (animator == null) {
                    arrayList19.add(nxj9651z1);
                    z4 = z3;
                    z3 = z4;
                } else {
                    zXvxcN9Gl zxvxcn9gl12 = (zXvxcN9Gl) nxj9651z1.q3BipwRCk;
                    UxHHqhbTP uxHHqhbTP = zxvxcn9gl12.tGV7Q6urW;
                    z4 = z3;
                    if (!Boolean.TRUE.equals(hashMap.get(zxvxcn9gl12))) {
                        boolean z10 = zxvxcn9gl12.q3BipwRCk == axi58y1kr ? z2 : z4;
                        if (z10) {
                            arrayList.remove(zxvxcn9gl12);
                        }
                        View view9 = uxHHqhbTP.EBQXiIPmm;
                        viewGroup3.startViewTransition(view9);
                        animator.addListener(new IHS162gzt(this, viewGroup3, view9, z10, zxvxcn9gl12, nxj9651z1));
                        animator.setTarget(view9);
                        animator.start();
                        ((ce8tBZHr1) nxj9651z1.J4Ux7ym32).J4Ux7ym32(new fruufIznR(this, animator));
                        z3 = false;
                        z9 = z2;
                        z2 = z9;
                        arrayList = arrayList;
                        hashMap = hashMap;
                    } else if (fVMSvDhE6.juJ6pnCpu(2)) {
                        Log.v(str, "Ignoring Animator set on " + uxHHqhbTP + " as this Fragment was involved in a Transition.");
                    }
                }
            } else {
                z4 = z3;
            }
            nxj9651z1.J4Ux7ym32();
            z3 = z4;
        }
        Iterator it10 = arrayList19.iterator();
        while (it10.hasNext()) {
            nXj9651z1 nxj9651z12 = (nXj9651z1) it10.next();
            zXvxcN9Gl zxvxcn9gl13 = (zXvxcN9Gl) nxj9651z12.q3BipwRCk;
            UxHHqhbTP uxHHqhbTP2 = zxvxcn9gl13.tGV7Q6urW;
            if (containsValue) {
                if (fVMSvDhE6.juJ6pnCpu(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(uxHHqhbTP2);
                    str2 = " as Animations cannot run alongside Transitions.";
                    sb.append(str2);
                    Log.v(str, sb.toString());
                }
                nxj9651z12.J4Ux7ym32();
            } else if (z9) {
                if (fVMSvDhE6.juJ6pnCpu(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(uxHHqhbTP2);
                    str2 = " as Animations cannot run alongside Animators.";
                    sb.append(str2);
                    Log.v(str, sb.toString());
                }
                nxj9651z12.J4Ux7ym32();
            } else {
                View view10 = uxHHqhbTP2.EBQXiIPmm;
                LmlART9vy Puu3Rhg4F4 = nxj9651z12.Puu3Rhg4F(context);
                Objects.requireNonNull(Puu3Rhg4F4);
                Animation animation = Puu3Rhg4F4.q3BipwRCk;
                Objects.requireNonNull(animation);
                if (zxvxcn9gl13.q3BipwRCk != aXI58Y1kr.REMOVED) {
                    view10.startAnimation(animation);
                    nxj9651z12.J4Ux7ym32();
                } else {
                    viewGroup3.startViewTransition(view10);
                    KisXf5Up4 kisXf5Up4 = new KisXf5Up4(animation, viewGroup3, view10);
                    kisXf5Up4.setAnimationListener(new SGj4zZBGq(this, viewGroup3, view10, nxj9651z12));
                    view10.startAnimation(kisXf5Up4);
                }
                ((ce8tBZHr1) nxj9651z12.J4Ux7ym32).J4Ux7ym32(new LKa8y802S(this, view10, viewGroup3, nxj9651z12));
            }
        }
        Iterator it11 = arrayList.iterator();
        while (it11.hasNext()) {
            zXvxcN9Gl zxvxcn9gl14 = (zXvxcN9Gl) it11.next();
            zxvxcn9gl14.q3BipwRCk.q3BipwRCk(zxvxcn9gl14.tGV7Q6urW.EBQXiIPmm);
        }
        arrayList.clear();
    }

    public void oon79WMrY(ArrayList arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!viewGroup.isTransitionGroup()) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        oon79WMrY(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public void vPSbyrYWX(Map map, View view) {
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        String vPSbyrYWX = mJLaJepZo.vPSbyrYWX(view);
        if (vPSbyrYWX != null) {
            map.put(vPSbyrYWX, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    vPSbyrYWX(map, childAt);
                }
            }
        }
    }
}
