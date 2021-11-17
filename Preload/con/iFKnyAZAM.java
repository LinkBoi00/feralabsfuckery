package con;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.ContentInfo;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.inputmethod.InputContentInfo;
import androidx.recyclerview.widget.RG2GI7LDp;
import com.google.android.material.behavior.SwipeDismissBehavior;
import con.HelDswbLq;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public class iFKnyAZAM implements MNbAFuzGl, HelDswbLq.RG2GI7LDp, baMQ0cfN8, UPGFkeS1U, I9beegTqN, TJkYEZky4 {
    public final /* synthetic */ int CBQ5d1kRq;
    public Object kmSgne1rO;

    public iFKnyAZAM(int i) {
        this.CBQ5d1kRq = i;
        if (i == 7) {
            this.kmSgne1rO = new YSo0hTREC();
        } else if (i != 8) {
            this.kmSgne1rO = new ArrayDeque();
        } else {
            this.kmSgne1rO = new ArrayList();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0141, code lost:
        if (r0 > r6.J4Ux7ym32) goto L_0x016d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x016b, code lost:
        if (r0 >= r6.J4Ux7ym32) goto L_0x016d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x016d, code lost:
        r4.dIocxURUo = r0 - r6.dIocxURUo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0172, code lost:
        r11.set(r12, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0179, code lost:
        if (r4.J4Ux7ym32 == r4.dIocxURUo) goto L_0x017f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x017b, code lost:
        r11.set(r13, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x017f, code lost:
        r11.remove(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0182, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0184, code lost:
        r11.add(r12, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:?, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void AqaWJg0b4(List list, int i, int i2) {
        boolean z;
        RG2GI7LDp.mhl5lIdbQ mhl5lidbq;
        int i3;
        RG2GI7LDp.mhl5lIdbQ mhl5lidbq2;
        int i4;
        int i5;
        RG2GI7LDp.mhl5lIdbQ mhl5lidbq3;
        RG2GI7LDp.mhl5lIdbQ mhl5lidbq4 = (RG2GI7LDp.mhl5lIdbQ) list.get(i);
        RG2GI7LDp.mhl5lIdbQ mhl5lidbq5 = (RG2GI7LDp.mhl5lIdbQ) list.get(i2);
        int i6 = mhl5lidbq5.q3BipwRCk;
        if (i6 == 1) {
            nlGCs0NZs(list, i, mhl5lidbq4, i2, mhl5lidbq5);
        } else if (i6 == 2) {
            int i7 = mhl5lidbq4.J4Ux7ym32;
            int i8 = mhl5lidbq4.dIocxURUo;
            boolean z2 = false;
            int i9 = mhl5lidbq5.J4Ux7ym32;
            if (i7 < i8) {
                if (i9 == i7 && mhl5lidbq5.dIocxURUo == i8 - i7) {
                    z = false;
                    z2 = true;
                } else {
                    z = false;
                }
            } else if (i9 == i8 + 1 && mhl5lidbq5.dIocxURUo == i7 - i8) {
                z = true;
                z2 = true;
            } else {
                z = true;
            }
            if (i8 < i9) {
                mhl5lidbq5.J4Ux7ym32 = i9 - 1;
            } else {
                int i10 = mhl5lidbq5.dIocxURUo;
                if (i8 < i9 + i10) {
                    mhl5lidbq5.dIocxURUo = i10 - 1;
                    mhl5lidbq4.q3BipwRCk = 2;
                    mhl5lidbq4.dIocxURUo = 1;
                    if (mhl5lidbq5.dIocxURUo == 0) {
                        list.remove(i2);
                        RG2GI7LDp rG2GI7LDp = (RG2GI7LDp) ((k68bWXYb8) this.kmSgne1rO);
                        Objects.requireNonNull(rG2GI7LDp);
                        mhl5lidbq5.tGV7Q6urW = null;
                        rG2GI7LDp.q3BipwRCk.tGV7Q6urW(mhl5lidbq5);
                        return;
                    }
                    return;
                }
            }
            int i11 = mhl5lidbq4.J4Ux7ym32;
            int i12 = mhl5lidbq5.J4Ux7ym32;
            if (i11 <= i12) {
                mhl5lidbq5.J4Ux7ym32 = i12 + 1;
            } else {
                int i13 = i12 + mhl5lidbq5.dIocxURUo;
                if (i11 < i13) {
                    mhl5lidbq = ((RG2GI7LDp) ((k68bWXYb8) this.kmSgne1rO)).Puu3Rhg4F(2, i11 + 1, i13 - i11, null);
                    mhl5lidbq5.dIocxURUo = mhl5lidbq4.J4Ux7ym32 - mhl5lidbq5.J4Ux7ym32;
                    if (!z2) {
                        list.set(i, mhl5lidbq5);
                        list.remove(i2);
                        RG2GI7LDp rG2GI7LDp2 = (RG2GI7LDp) ((k68bWXYb8) this.kmSgne1rO);
                        Objects.requireNonNull(rG2GI7LDp2);
                        mhl5lidbq4.tGV7Q6urW = null;
                        rG2GI7LDp2.q3BipwRCk.tGV7Q6urW(mhl5lidbq4);
                        return;
                    } else if (z) {
                        if (mhl5lidbq != null) {
                            int i14 = mhl5lidbq4.J4Ux7ym32;
                            if (i14 > mhl5lidbq.J4Ux7ym32) {
                                mhl5lidbq4.J4Ux7ym32 = i14 - mhl5lidbq.dIocxURUo;
                            }
                            int i15 = mhl5lidbq4.dIocxURUo;
                            if (i15 > mhl5lidbq.J4Ux7ym32) {
                                mhl5lidbq4.dIocxURUo = i15 - mhl5lidbq.dIocxURUo;
                            }
                        }
                        int i16 = mhl5lidbq4.J4Ux7ym32;
                        if (i16 > mhl5lidbq5.J4Ux7ym32) {
                            mhl5lidbq4.J4Ux7ym32 = i16 - mhl5lidbq5.dIocxURUo;
                        }
                        i3 = mhl5lidbq4.dIocxURUo;
                    } else {
                        if (mhl5lidbq != null) {
                            int i17 = mhl5lidbq4.J4Ux7ym32;
                            if (i17 >= mhl5lidbq.J4Ux7ym32) {
                                mhl5lidbq4.J4Ux7ym32 = i17 - mhl5lidbq.dIocxURUo;
                            }
                            int i18 = mhl5lidbq4.dIocxURUo;
                            if (i18 >= mhl5lidbq.J4Ux7ym32) {
                                mhl5lidbq4.dIocxURUo = i18 - mhl5lidbq.dIocxURUo;
                            }
                        }
                        int i19 = mhl5lidbq4.J4Ux7ym32;
                        if (i19 >= mhl5lidbq5.J4Ux7ym32) {
                            mhl5lidbq4.J4Ux7ym32 = i19 - mhl5lidbq5.dIocxURUo;
                        }
                        i3 = mhl5lidbq4.dIocxURUo;
                    }
                }
            }
            mhl5lidbq = null;
            if (!z2) {
            }
        } else if (i6 == 4) {
            int i20 = mhl5lidbq4.dIocxURUo;
            int i21 = mhl5lidbq5.J4Ux7ym32;
            if (i20 < i21) {
                mhl5lidbq5.J4Ux7ym32 = i21 - 1;
            } else {
                int i22 = mhl5lidbq5.dIocxURUo;
                if (i20 < i21 + i22) {
                    mhl5lidbq5.dIocxURUo = i22 - 1;
                    mhl5lidbq2 = ((RG2GI7LDp) ((k68bWXYb8) this.kmSgne1rO)).Puu3Rhg4F(4, mhl5lidbq4.J4Ux7ym32, 1, mhl5lidbq5.tGV7Q6urW);
                    i4 = mhl5lidbq4.J4Ux7ym32;
                    i5 = mhl5lidbq5.J4Ux7ym32;
                    if (i4 > i5) {
                        mhl5lidbq5.J4Ux7ym32 = i5 + 1;
                    } else {
                        int i23 = i5 + mhl5lidbq5.dIocxURUo;
                        if (i4 < i23) {
                            int i24 = i23 - i4;
                            mhl5lidbq3 = ((RG2GI7LDp) ((k68bWXYb8) this.kmSgne1rO)).Puu3Rhg4F(4, i4 + 1, i24, mhl5lidbq5.tGV7Q6urW);
                            mhl5lidbq5.dIocxURUo -= i24;
                            list.set(i2, mhl5lidbq4);
                            if (mhl5lidbq5.dIocxURUo > 0) {
                                list.set(i, mhl5lidbq5);
                            } else {
                                list.remove(i);
                                RG2GI7LDp rG2GI7LDp3 = (RG2GI7LDp) ((k68bWXYb8) this.kmSgne1rO);
                                Objects.requireNonNull(rG2GI7LDp3);
                                mhl5lidbq5.tGV7Q6urW = null;
                                rG2GI7LDp3.q3BipwRCk.tGV7Q6urW(mhl5lidbq5);
                            }
                            if (mhl5lidbq2 != null) {
                                list.add(i, mhl5lidbq2);
                            }
                            if (mhl5lidbq3 != null) {
                                list.add(i, mhl5lidbq3);
                                return;
                            }
                            return;
                        }
                    }
                    mhl5lidbq3 = null;
                    list.set(i2, mhl5lidbq4);
                    if (mhl5lidbq5.dIocxURUo > 0) {
                    }
                    if (mhl5lidbq2 != null) {
                    }
                    if (mhl5lidbq3 != null) {
                    }
                }
            }
            mhl5lidbq2 = null;
            i4 = mhl5lidbq4.J4Ux7ym32;
            i5 = mhl5lidbq5.J4Ux7ym32;
            if (i4 > i5) {
            }
            mhl5lidbq3 = null;
            list.set(i2, mhl5lidbq4);
            if (mhl5lidbq5.dIocxURUo > 0) {
            }
            if (mhl5lidbq2 != null) {
            }
            if (mhl5lidbq3 != null) {
            }
        }
    }

    @Override // con.HelDswbLq.RG2GI7LDp
    public boolean Bhmn1KIah(androidx.appcompat.view.menu.RG2GI7LDp rG2GI7LDp) {
        TeoeEf1aF teoeEf1aF = (TeoeEf1aF) this.kmSgne1rO;
        if (rG2GI7LDp == teoeEf1aF.Bhmn1KIah) {
            return false;
        }
        Objects.requireNonNull(((anclinfG8) rG2GI7LDp).iMyQMM6Qj);
        Objects.requireNonNull(teoeEf1aF);
        HelDswbLq.RG2GI7LDp rG2GI7LDp2 = ((TeoeEf1aF) this.kmSgne1rO).MzoOEjc4X;
        if (rG2GI7LDp2 != null) {
            return rG2GI7LDp2.Bhmn1KIah(rG2GI7LDp);
        }
        return false;
    }

    @Override // con.UPGFkeS1U
    public int CBQ5d1kRq() {
        return ((ContentInfo) this.kmSgne1rO).getSource();
    }

    public iFKnyAZAM CpG0imbht(float f, float f2, float f3, float f4) {
        ((List) this.kmSgne1rO).add(new BxZOTs7fo(f, f2, f3, f4));
        return this;
    }

    public iFKnyAZAM Eeka1udhb(float f, float f2, float f3, float f4, float f5, float f6) {
        ((List) this.kmSgne1rO).add(new j2g9b98TN(f, f2, f3, f4, f5, f6));
        return this;
    }

    @Override // con.UPGFkeS1U
    public int GPLPRo6go() {
        return ((ContentInfo) this.kmSgne1rO).getFlags();
    }

    public iFKnyAZAM IytU16YUK(float f, float f2, float f3, float f4) {
        ((List) this.kmSgne1rO).add(new vJeHCLnAC(f, f2, f3, f4));
        return this;
    }

    @Override // con.TJkYEZky4
    public void J4Ux7ym32() {
        switch (this.CBQ5d1kRq) {
            case 16:
                ((InputContentInfo) this.kmSgne1rO).requestPermission();
                return;
            default:
                ((TJkYEZky4) this.kmSgne1rO).J4Ux7ym32();
                return;
        }
    }

    @Override // con.TJkYEZky4
    public Uri MzoOEjc4X() {
        switch (this.CBQ5d1kRq) {
            case 16:
                return ((InputContentInfo) this.kmSgne1rO).getContentUri();
            default:
                return ((TJkYEZky4) this.kmSgne1rO).MzoOEjc4X();
        }
    }

    @Override // con.TJkYEZky4
    public Object PSTqBLTET() {
        return (InputContentInfo) this.kmSgne1rO;
    }

    @Override // con.UPGFkeS1U
    public ContentInfo Puu3Rhg4F() {
        return (ContentInfo) this.kmSgne1rO;
    }

    public float RG6kpfv3v(int i, int i2) {
        return ((Float[]) ((I6sO15l0X[]) this.kmSgne1rO)[i].q3BipwRCk)[i2].floatValue();
    }

    public iFKnyAZAM WaUP0CF08(float f) {
        ((List) this.kmSgne1rO).add(new tzdG4BrG4(f));
        return this;
    }

    public boolean cAwN510t2(MotionEvent motionEvent) {
        switch (this.CBQ5d1kRq) {
            case 14:
                return ((GestureDetector) this.kmSgne1rO).onTouchEvent(motionEvent);
            default:
                return ((iFKnyAZAM) ((I9beegTqN) this.kmSgne1rO)).cAwN510t2(motionEvent);
        }
    }

    @Override // con.baMQ0cfN8
    public rZsVaMPDT dIocxURUo() {
        switch (this.CBQ5d1kRq) {
            case 11:
                return ((baMQ0cfN8) this.kmSgne1rO).dIocxURUo();
            default:
                return new rZsVaMPDT(new iFKnyAZAM(((ContentInfo.Builder) this.kmSgne1rO).build()));
        }
    }

    public iFKnyAZAM dXrmkklc8(float f, float f2, float f3, float f4, float f5, float f6) {
        ((List) this.kmSgne1rO).add(new Etna4Qy5x(f, f2, f3, f4, f5, f6));
        return this;
    }

    public iFKnyAZAM dfpT1j18n(float f, float f2) {
        ((List) this.kmSgne1rO).add(new K9zsAWJWj(f, f2));
        return this;
    }

    public iFKnyAZAM i8XZMQc6Z(float f, float f2) {
        ((List) this.kmSgne1rO).add(new DCsciu29s(f, f2));
        return this;
    }

    public iFKnyAZAM iMyQMM6Qj(float f, float f2) {
        ((List) this.kmSgne1rO).add(new HIcD9WCLp(f, f2));
        return this;
    }

    @Override // con.MNbAFuzGl
    public void iiGwOFFnr(androidx.appcompat.view.menu.RG2GI7LDp rG2GI7LDp, MenuItem menuItem) {
        W85tF8RjC w85tF8RjC = null;
        ((XSh7SAV24) this.kmSgne1rO).qVUwofr5s.removeCallbacksAndMessages(null);
        int size = ((XSh7SAV24) this.kmSgne1rO).dXrmkklc8.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (rG2GI7LDp == ((W85tF8RjC) ((XSh7SAV24) this.kmSgne1rO).dXrmkklc8.get(i)).J4Ux7ym32) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            int i2 = i + 1;
            if (i2 < ((XSh7SAV24) this.kmSgne1rO).dXrmkklc8.size()) {
                w85tF8RjC = (W85tF8RjC) ((XSh7SAV24) this.kmSgne1rO).dXrmkklc8.get(i2);
            }
            ((XSh7SAV24) this.kmSgne1rO).qVUwofr5s.postAtTime(new EY90i7dEV(this, w85tF8RjC, menuItem, rG2GI7LDp), rG2GI7LDp, SystemClock.uptimeMillis() + 200);
        }
    }

    @Override // con.baMQ0cfN8
    public void ilHKhw3Yw(int i) {
        ((ContentInfo.Builder) this.kmSgne1rO).setFlags(i);
    }

    public int ixWaw2akD(List list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((RG2GI7LDp.mhl5lIdbQ) list.get(size)).q3BipwRCk != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    @Override // con.TJkYEZky4
    public Uri kCA6Zs9sL() {
        switch (this.CBQ5d1kRq) {
            case 16:
                return ((InputContentInfo) this.kmSgne1rO).getLinkUri();
            default:
                return ((TJkYEZky4) this.kmSgne1rO).kCA6Zs9sL();
        }
    }

    @Override // con.TJkYEZky4
    public ClipDescription kmSgne1rO() {
        switch (this.CBQ5d1kRq) {
            case 16:
                return ((InputContentInfo) this.kmSgne1rO).getDescription();
            default:
                return ((TJkYEZky4) this.kmSgne1rO).kmSgne1rO();
        }
    }

    public iFKnyAZAM mUqPm6GBh(float f) {
        ((List) this.kmSgne1rO).add(new q4HDLnNjL(f));
        return this;
    }

    public void nlGCs0NZs(List list, int i, RG2GI7LDp.mhl5lIdbQ mhl5lidbq, int i2, RG2GI7LDp.mhl5lIdbQ mhl5lidbq2) {
        int i3 = mhl5lidbq.dIocxURUo;
        int i4 = mhl5lidbq2.J4Ux7ym32;
        int i5 = i3 < i4 ? -1 : 0;
        int i6 = mhl5lidbq.J4Ux7ym32;
        if (i6 < i4) {
            i5++;
        }
        if (i4 <= i6) {
            mhl5lidbq.J4Ux7ym32 = i6 + mhl5lidbq2.dIocxURUo;
        }
        int i7 = mhl5lidbq2.J4Ux7ym32;
        if (i7 <= i3) {
            mhl5lidbq.dIocxURUo = i3 + mhl5lidbq2.dIocxURUo;
        }
        mhl5lidbq2.J4Ux7ym32 = i7 + i5;
        list.set(i, mhl5lidbq2);
        list.set(i2, mhl5lidbq);
    }

    @Override // con.baMQ0cfN8
    public void oon79WMrY(Bundle bundle) {
        ((ContentInfo.Builder) this.kmSgne1rO).setExtras(bundle);
    }

    @Override // con.HelDswbLq.RG2GI7LDp
    public void q3BipwRCk(androidx.appcompat.view.menu.RG2GI7LDp rG2GI7LDp, boolean z) {
        if (rG2GI7LDp instanceof anclinfG8) {
            rG2GI7LDp.vPSbyrYWX().tGV7Q6urW(false);
        }
        HelDswbLq.RG2GI7LDp rG2GI7LDp2 = ((TeoeEf1aF) this.kmSgne1rO).MzoOEjc4X;
        if (rG2GI7LDp2 != null) {
            rG2GI7LDp2.q3BipwRCk(rG2GI7LDp, z);
        }
    }

    public void qFBXIgpia(int i, int i2, float f) {
        ((Float[]) ((I6sO15l0X[]) this.kmSgne1rO)[i].q3BipwRCk)[i2] = Float.valueOf(f);
    }

    public iFKnyAZAM qVUwofr5s() {
        ((List) this.kmSgne1rO).add(Bhi62c1rd.tGV7Q6urW);
        return this;
    }

    public I6sO15l0X sk5s77z6Q(int i) {
        return ((I6sO15l0X[]) this.kmSgne1rO)[i];
    }

    @Override // con.UPGFkeS1U
    public ClipData tGV7Q6urW() {
        return ((ContentInfo) this.kmSgne1rO).getClip();
    }

    public String toString() {
        switch (this.CBQ5d1kRq) {
            case 13:
                StringBuilder q3BipwRCk = abGBwSu8x.q3BipwRCk("ContentInfoCompat{");
                q3BipwRCk.append((ContentInfo) this.kmSgne1rO);
                q3BipwRCk.append("}");
                return q3BipwRCk.toString();
            default:
                return super.toString();
        }
    }

    @Override // con.baMQ0cfN8
    public void vPSbyrYWX(Uri uri) {
        ((ContentInfo.Builder) this.kmSgne1rO).setLinkUri(uri);
    }

    @Override // con.MNbAFuzGl
    public void yWvV4ePLl(androidx.appcompat.view.menu.RG2GI7LDp rG2GI7LDp, MenuItem menuItem) {
        ((XSh7SAV24) this.kmSgne1rO).qVUwofr5s.removeCallbacksAndMessages(rG2GI7LDp);
    }

    public iFKnyAZAM(int i, int i2) {
        this.CBQ5d1kRq = 9;
        I6sO15l0X[] i6sO15l0XArr = new I6sO15l0X[i];
        for (int i3 = 0; i3 < i; i3++) {
            i6sO15l0XArr[i3] = new I6sO15l0X(i2);
        }
        this.kmSgne1rO = i6sO15l0XArr;
    }

    public iFKnyAZAM(ClipData clipData, int i, int i2) {
        this.CBQ5d1kRq = i2;
        if (i2 != 12) {
            this.kmSgne1rO = Build.VERSION.SDK_INT >= 31 ? new iFKnyAZAM(clipData, i, 12) : new tXvnR1bb6(clipData, i);
        } else {
            this.kmSgne1rO = new ContentInfo.Builder(clipData, i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public iFKnyAZAM(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, (Handler) null, 15);
        this.CBQ5d1kRq = 15;
    }

    public iFKnyAZAM(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler, int i) {
        this.CBQ5d1kRq = i;
        if (i != 15) {
            this.kmSgne1rO = new GestureDetector(context, onGestureListener, handler);
        } else {
            this.kmSgne1rO = new iFKnyAZAM(context, onGestureListener, handler, 14);
        }
    }

    public iFKnyAZAM(Uri uri, ClipDescription clipDescription, Uri uri2, int i) {
        this.CBQ5d1kRq = i;
        if (i != 17) {
            this.kmSgne1rO = new InputContentInfo(uri, clipDescription, uri2);
        } else {
            this.kmSgne1rO = new iFKnyAZAM(uri, clipDescription, uri2, 16);
        }
    }

    public iFKnyAZAM(ContentInfo contentInfo) {
        this.CBQ5d1kRq = 13;
        Objects.requireNonNull(contentInfo);
        this.kmSgne1rO = contentInfo;
    }

    public iFKnyAZAM(SwipeDismissBehavior swipeDismissBehavior) {
        this.CBQ5d1kRq = 24;
        swipeDismissBehavior.kCA6Zs9sL = SwipeDismissBehavior.dXrmkklc8(0.0f, 0.1f, 1.0f);
        swipeDismissBehavior.iiGwOFFnr = SwipeDismissBehavior.dXrmkklc8(0.0f, 0.6f, 1.0f);
        swipeDismissBehavior.tGV7Q6urW = 0;
    }

    public iFKnyAZAM(TeoeEf1aF teoeEf1aF) {
        this.CBQ5d1kRq = 5;
        this.kmSgne1rO = teoeEf1aF;
    }

    public iFKnyAZAM(XSh7SAV24 xSh7SAV24) {
        this.CBQ5d1kRq = 3;
        this.kmSgne1rO = xSh7SAV24;
    }

    public iFKnyAZAM(N9VbYkh38 n9VbYkh38) {
        this.CBQ5d1kRq = 22;
        this.kmSgne1rO = n9VbYkh38;
    }

    public iFKnyAZAM(A71OEYWpv a71OEYWpv) {
        this.CBQ5d1kRq = 10;
        this.kmSgne1rO = a71OEYWpv;
    }

    public iFKnyAZAM(TJkYEZky4 tJkYEZky4) {
        this.CBQ5d1kRq = 17;
        this.kmSgne1rO = tJkYEZky4;
    }

    public iFKnyAZAM(dOSsQaJVg dossqajvg) {
        this.CBQ5d1kRq = 23;
        this.kmSgne1rO = dossqajvg;
    }

    public iFKnyAZAM(tDC1iJlG1 tdc1ijlg1) {
        this.CBQ5d1kRq = 4;
        this.kmSgne1rO = tdc1ijlg1;
    }

    public iFKnyAZAM(k68bWXYb8 k68bwxyb8) {
        this.CBQ5d1kRq = 19;
        this.kmSgne1rO = k68bwxyb8;
    }

    public iFKnyAZAM(K3JGdRcke k3JGdRcke) {
        this.CBQ5d1kRq = 18;
        this.kmSgne1rO = k3JGdRcke;
    }

    public iFKnyAZAM(rQamjxEL9 rqamjxel9) {
        this.CBQ5d1kRq = 6;
        this.kmSgne1rO = rqamjxel9;
    }

    public iFKnyAZAM(qTSiJXW5w qtsijxw5w) {
        this.CBQ5d1kRq = 1;
        this.kmSgne1rO = qtsijxw5w;
    }

    public iFKnyAZAM(Object obj) {
        this.CBQ5d1kRq = 16;
        this.kmSgne1rO = (InputContentInfo) obj;
    }
}
