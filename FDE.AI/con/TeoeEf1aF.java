package con;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.RG2GI7LDp;
import androidx.appcompat.view.menu.mhl5lIdbQ;
import androidx.appcompat.widget.ActionMenuView;
import com.feravolt.preload.R;
import con.HelDswbLq;
import java.util.ArrayList;
import java.util.Objects;
/* loaded from: classes.dex */
public class TeoeEf1aF implements HelDswbLq {
    public VM5RseTzg AqaWJg0b4;
    public RG2GI7LDp Bhmn1KIah;
    public Context CBQ5d1kRq;
    public fub3l8zfX CpG0imbht;
    public mhl5lIdbQ Eeka1udhb;
    public HelDswbLq.RG2GI7LDp MzoOEjc4X;
    public LayoutInflater PSTqBLTET;
    public Drawable RG6kpfv3v;
    public boolean WaUP0CF08;
    public boolean cAwN510t2;
    public wTUTXyz5r dXrmkklc8;
    public int dfpT1j18n;
    public int i8XZMQc6Z;
    public int iMyQMM6Qj;
    public boolean ixWaw2akD;
    public Context kmSgne1rO;
    public DJbXkgfuR nlGCs0NZs;
    public fub3l8zfX qFBXIgpia;
    public boolean sk5s77z6Q;
    public int ilHKhw3Yw = R.layout.abc_action_menu_layout;
    public int qVUwofr5s = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray IytU16YUK = new SparseBooleanArray();
    public final iFKnyAZAM mUqPm6GBh = new iFKnyAZAM(this);

    public TeoeEf1aF(Context context) {
        this.CBQ5d1kRq = context;
        this.PSTqBLTET = LayoutInflater.from(context);
    }

    public boolean Bhmn1KIah() {
        RG2GI7LDp rG2GI7LDp;
        if (!this.sk5s77z6Q || kmSgne1rO() || (rG2GI7LDp = this.Bhmn1KIah) == null || this.Eeka1udhb == null || this.nlGCs0NZs != null) {
            return false;
        }
        rG2GI7LDp.yWvV4ePLl();
        if (rG2GI7LDp.oon79WMrY.isEmpty()) {
            return false;
        }
        DJbXkgfuR dJbXkgfuR = new DJbXkgfuR(this, new fub3l8zfX(this, this.kmSgne1rO, this.Bhmn1KIah, this.dXrmkklc8, true));
        this.nlGCs0NZs = dJbXkgfuR;
        ((View) this.Eeka1udhb).post(dJbXkgfuR);
        return true;
    }

    public boolean CBQ5d1kRq() {
        fub3l8zfX fub3l8zfx = this.qFBXIgpia;
        if (fub3l8zfx == null) {
            return false;
        }
        if (!fub3l8zfx.J4Ux7ym32()) {
            return true;
        }
        fub3l8zfx.oon79WMrY.dismiss();
        return true;
    }

    public View GPLPRo6go(tDC1iJlG1 tdc1ijlg1, View view, ViewGroup viewGroup) {
        mhl5lIdbQ.RG2GI7LDp rG2GI7LDp;
        View actionView = tdc1ijlg1.getActionView();
        int i = 0;
        if (actionView == null || tdc1ijlg1.iiGwOFFnr()) {
            if (view instanceof mhl5lIdbQ.RG2GI7LDp) {
                rG2GI7LDp = (mhl5lIdbQ.RG2GI7LDp) view;
            } else {
                rG2GI7LDp = (mhl5lIdbQ.RG2GI7LDp) this.PSTqBLTET.inflate(this.qVUwofr5s, viewGroup, false);
            }
            rG2GI7LDp.tGV7Q6urW(tdc1ijlg1, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) rG2GI7LDp;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.Eeka1udhb);
            if (this.AqaWJg0b4 == null) {
                this.AqaWJg0b4 = new VM5RseTzg(this);
            }
            actionMenuItemView.setPopupCallback(this.AqaWJg0b4);
            actionView = (View) rG2GI7LDp;
        }
        if (tdc1ijlg1.IytU16YUK) {
            i = 8;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.oon79WMrY(layoutParams));
        }
        return actionView;
    }

    public boolean J4Ux7ym32() {
        return vPSbyrYWX() | CBQ5d1kRq();
    }

    @Override // con.HelDswbLq
    public void Puu3Rhg4F(HelDswbLq.RG2GI7LDp rG2GI7LDp) {
        this.MzoOEjc4X = rG2GI7LDp;
    }

    @Override // con.HelDswbLq
    public void dIocxURUo(Context context, RG2GI7LDp rG2GI7LDp) {
        this.kmSgne1rO = context;
        LayoutInflater.from(context);
        this.Bhmn1KIah = rG2GI7LDp;
        Resources resources = context.getResources();
        if (!this.WaUP0CF08) {
            this.sk5s77z6Q = true;
        }
        int i = 2;
        this.i8XZMQc6Z = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.iMyQMM6Qj = i;
        int i4 = this.i8XZMQc6Z;
        if (this.sk5s77z6Q) {
            if (this.dXrmkklc8 == null) {
                wTUTXyz5r wtutxyz5r = new wTUTXyz5r(this, this.CBQ5d1kRq);
                this.dXrmkklc8 = wtutxyz5r;
                if (this.ixWaw2akD) {
                    wtutxyz5r.setImageDrawable(this.RG6kpfv3v);
                    this.RG6kpfv3v = null;
                    this.ixWaw2akD = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.dXrmkklc8.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.dXrmkklc8.getMeasuredWidth();
        } else {
            this.dXrmkklc8 = null;
        }
        this.dfpT1j18n = i4;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // con.HelDswbLq
    public /* bridge */ /* synthetic */ boolean iiGwOFFnr(RG2GI7LDp rG2GI7LDp, tDC1iJlG1 tdc1ijlg1) {
        return false;
    }

    @Override // con.HelDswbLq
    public boolean kCA6Zs9sL(anclinfG8 anclinfg8) {
        boolean z = false;
        if (!anclinfg8.hasVisibleItems()) {
            return false;
        }
        anclinfG8 anclinfg82 = anclinfg8;
        while (true) {
            RG2GI7LDp rG2GI7LDp = anclinfg82.dfpT1j18n;
            if (rG2GI7LDp == this.Bhmn1KIah) {
                break;
            }
            anclinfg82 = (anclinfG8) rG2GI7LDp;
        }
        tDC1iJlG1 tdc1ijlg1 = anclinfg82.iMyQMM6Qj;
        ViewGroup viewGroup = (ViewGroup) this.Eeka1udhb;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof mhl5lIdbQ.RG2GI7LDp) && ((mhl5lIdbQ.RG2GI7LDp) childAt).getItemData() == tdc1ijlg1) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        Objects.requireNonNull(anclinfg8.iMyQMM6Qj);
        int size = anclinfg8.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            MenuItem item = anclinfg8.getItem(i2);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i2++;
        }
        fub3l8zfX fub3l8zfx = new fub3l8zfX(this, this.kmSgne1rO, anclinfg8, view);
        this.qFBXIgpia = fub3l8zfx;
        fub3l8zfx.Puu3Rhg4F = z;
        gR4fovbO3 gr4fovbo3 = fub3l8zfx.oon79WMrY;
        if (gr4fovbo3 != null) {
            gr4fovbo3.PSTqBLTET(z);
        }
        if (this.qFBXIgpia.iiGwOFFnr()) {
            HelDswbLq.RG2GI7LDp rG2GI7LDp2 = this.MzoOEjc4X;
            if (rG2GI7LDp2 != null) {
                rG2GI7LDp2.Bhmn1KIah(anclinfg8);
            }
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    public boolean kmSgne1rO() {
        fub3l8zfX fub3l8zfx = this.CpG0imbht;
        return fub3l8zfx != null && fub3l8zfx.J4Ux7ym32();
    }

    @Override // con.HelDswbLq
    public void oon79WMrY(boolean z) {
        mhl5lIdbQ mhl5lidbq;
        int i;
        boolean z2;
        ViewGroup viewGroup = (ViewGroup) this.Eeka1udhb;
        ArrayList arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            RG2GI7LDp rG2GI7LDp = this.Bhmn1KIah;
            if (rG2GI7LDp != null) {
                rG2GI7LDp.yWvV4ePLl();
                ArrayList CBQ5d1kRq = this.Bhmn1KIah.CBQ5d1kRq();
                int size = CBQ5d1kRq.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    tDC1iJlG1 tdc1ijlg1 = (tDC1iJlG1) CBQ5d1kRq.get(i2);
                    if (tdc1ijlg1.GPLPRo6go()) {
                        View childAt = viewGroup.getChildAt(i);
                        tDC1iJlG1 itemData = childAt instanceof mhl5lIdbQ.RG2GI7LDp ? ((mhl5lIdbQ.RG2GI7LDp) childAt).getItemData() : null;
                        View GPLPRo6go = GPLPRo6go(tdc1ijlg1, childAt, viewGroup);
                        if (tdc1ijlg1 != itemData) {
                            GPLPRo6go.setPressed(false);
                            GPLPRo6go.jumpDrawablesToCurrentState();
                        }
                        if (GPLPRo6go != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) GPLPRo6go.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(GPLPRo6go);
                            }
                            ((ViewGroup) this.Eeka1udhb).addView(GPLPRo6go, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.dXrmkklc8) {
                    z2 = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z2 = true;
                }
                if (!z2) {
                    i++;
                }
            }
        }
        ((View) this.Eeka1udhb).requestLayout();
        RG2GI7LDp rG2GI7LDp2 = this.Bhmn1KIah;
        if (rG2GI7LDp2 != null) {
            rG2GI7LDp2.yWvV4ePLl();
            ArrayList arrayList2 = rG2GI7LDp2.yWvV4ePLl;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                iMp2wcpT4 imp2wcpt4 = ((tDC1iJlG1) arrayList2.get(i3)).iMyQMM6Qj;
            }
        }
        RG2GI7LDp rG2GI7LDp3 = this.Bhmn1KIah;
        if (rG2GI7LDp3 != null) {
            rG2GI7LDp3.yWvV4ePLl();
            arrayList = rG2GI7LDp3.oon79WMrY;
        }
        if (this.sk5s77z6Q && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !((tDC1iJlG1) arrayList.get(0)).IytU16YUK;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        wTUTXyz5r wtutxyz5r = this.dXrmkklc8;
        if (z3) {
            if (wtutxyz5r == null) {
                this.dXrmkklc8 = new wTUTXyz5r(this, this.CBQ5d1kRq);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.dXrmkklc8.getParent();
            if (viewGroup3 != this.Eeka1udhb) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.dXrmkklc8);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.Eeka1udhb;
                wTUTXyz5r wtutxyz5r2 = this.dXrmkklc8;
                ActionMenuView.aXI58Y1kr CBQ5d1kRq2 = actionMenuView.generateDefaultLayoutParams();
                CBQ5d1kRq2.q3BipwRCk = true;
                actionMenuView.addView(wtutxyz5r2, CBQ5d1kRq2);
            }
        } else if (wtutxyz5r != null && wtutxyz5r.getParent() == (mhl5lidbq = this.Eeka1udhb)) {
            ((ViewGroup) mhl5lidbq).removeView(this.dXrmkklc8);
        }
        ((ActionMenuView) this.Eeka1udhb).setOverflowReserved(this.sk5s77z6Q);
    }

    @Override // con.HelDswbLq
    public void q3BipwRCk(RG2GI7LDp rG2GI7LDp, boolean z) {
        J4Ux7ym32();
        HelDswbLq.RG2GI7LDp rG2GI7LDp2 = this.MzoOEjc4X;
        if (rG2GI7LDp2 != null) {
            rG2GI7LDp2.q3BipwRCk(rG2GI7LDp, z);
        }
    }

    @Override // con.HelDswbLq
    public boolean tGV7Q6urW() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        RG2GI7LDp rG2GI7LDp = this.Bhmn1KIah;
        if (rG2GI7LDp != null) {
            arrayList = rG2GI7LDp.CBQ5d1kRq();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = this.iMyQMM6Qj;
        int i4 = this.dfpT1j18n;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.Eeka1udhb;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            tDC1iJlG1 tdc1ijlg1 = (tDC1iJlG1) arrayList.get(i5);
            int i8 = tdc1ijlg1.i8XZMQc6Z;
            if ((i8 & 2) == 2) {
                i7++;
            } else if ((i8 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (this.cAwN510t2 && tdc1ijlg1.IytU16YUK) {
                i3 = 0;
            }
            i5++;
        }
        if (this.sk5s77z6Q && (z2 || i6 + i7 > i3)) {
            i3--;
        }
        int i9 = i3 - i7;
        SparseBooleanArray sparseBooleanArray = this.IytU16YUK;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            tDC1iJlG1 tdc1ijlg12 = (tDC1iJlG1) arrayList.get(i10);
            int i12 = tdc1ijlg12.i8XZMQc6Z;
            if ((i12 & 2) == i2 ? z : false) {
                View GPLPRo6go = GPLPRo6go(tdc1ijlg12, null, viewGroup);
                GPLPRo6go.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = GPLPRo6go.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                int i13 = tdc1ijlg12.J4Ux7ym32;
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                tdc1ijlg12.vPSbyrYWX(z);
            } else if ((i12 & 1) == z ? z : false) {
                int i14 = tdc1ijlg12.J4Ux7ym32;
                boolean z3 = sparseBooleanArray.get(i14);
                boolean z4 = ((i9 > 0 || z3) && i4 > 0) ? z : false;
                if (z4) {
                    View GPLPRo6go2 = GPLPRo6go(tdc1ijlg12, null, viewGroup);
                    GPLPRo6go2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = GPLPRo6go2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z4 &= i4 + i11 > 0;
                }
                if (z4 && i14 != 0) {
                    sparseBooleanArray.put(i14, true);
                } else if (z3) {
                    sparseBooleanArray.put(i14, false);
                    for (int i15 = 0; i15 < i10; i15++) {
                        tDC1iJlG1 tdc1ijlg13 = (tDC1iJlG1) arrayList.get(i15);
                        if (tdc1ijlg13.J4Ux7ym32 == i14) {
                            if (tdc1ijlg13.GPLPRo6go()) {
                                i9++;
                            }
                            tdc1ijlg13.vPSbyrYWX(false);
                        }
                    }
                }
                if (z4) {
                    i9--;
                }
                tdc1ijlg12.vPSbyrYWX(z4);
            } else {
                tdc1ijlg12.vPSbyrYWX(false);
                i10++;
                i2 = 2;
                z = true;
            }
            i10++;
            i2 = 2;
            z = true;
        }
        return z;
    }

    public boolean vPSbyrYWX() {
        mhl5lIdbQ mhl5lidbq;
        DJbXkgfuR dJbXkgfuR = this.nlGCs0NZs;
        if (dJbXkgfuR == null || (mhl5lidbq = this.Eeka1udhb) == null) {
            fub3l8zfX fub3l8zfx = this.CpG0imbht;
            if (fub3l8zfx == null) {
                return false;
            }
            if (fub3l8zfx.J4Ux7ym32()) {
                fub3l8zfx.oon79WMrY.dismiss();
            }
            return true;
        }
        ((View) mhl5lidbq).removeCallbacks(dJbXkgfuR);
        this.nlGCs0NZs = null;
        return true;
    }

    @Override // con.HelDswbLq
    public /* bridge */ /* synthetic */ boolean yWvV4ePLl(RG2GI7LDp rG2GI7LDp, tDC1iJlG1 tdc1ijlg1) {
        return false;
    }
}
