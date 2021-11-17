package con;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.RG2GI7LDp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes.dex */
public class Jxi1NxKkk implements LayoutInflater.Factory2 {
    public final fVMSvDhE6 CBQ5d1kRq;

    public Jxi1NxKkk(fVMSvDhE6 fvmsvdhe6) {
        this.CBQ5d1kRq = fvmsvdhe6;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a1  */
    @Override // android.view.LayoutInflater.Factory2
    /* Code decompiled incorrectly, please refer to instructions dump */
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        RG2GI7LDp rG2GI7LDp;
        View view2;
        StringBuilder sb;
        String str2;
        if (GUiwkn9Tb.class.getName().equals(str)) {
            return new GUiwkn9Tb(context, attributeSet, this.CBQ5d1kRq);
        }
        UxHHqhbTP uxHHqhbTP = null;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mrcVSuHp9.q3BipwRCk);
        int i = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            ClassLoader classLoader = context.getClassLoader();
            ZmYjNS8wW zmYjNS8wW = qKDOZuDet.J4Ux7ym32;
            try {
                z = UxHHqhbTP.class.isAssignableFrom(qKDOZuDet.J4Ux7ym32(classLoader, attributeValue));
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (z) {
                if (view != null) {
                    i = view.getId();
                }
                if (i == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                UxHHqhbTP vNtjxmzUM = resourceId != -1 ? this.CBQ5d1kRq.vNtjxmzUM(resourceId) : null;
                if (vNtjxmzUM == null && string != null) {
                    j6XJY7rz4 j6xjy7rz4 = this.CBQ5d1kRq.tGV7Q6urW;
                    Objects.requireNonNull(j6xjy7rz4);
                    int size = ((ArrayList) j6xjy7rz4.kmSgne1rO).size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            UxHHqhbTP uxHHqhbTP2 = (UxHHqhbTP) ((ArrayList) j6xjy7rz4.kmSgne1rO).get(size);
                            if (uxHHqhbTP2 != null && string.equals(uxHHqhbTP2.NyWTwPF6V)) {
                                uxHHqhbTP = uxHHqhbTP2;
                                break;
                            }
                        } else {
                            Iterator it = ((HashMap) j6xjy7rz4.Bhmn1KIah).values().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                RG2GI7LDp rG2GI7LDp2 = (RG2GI7LDp) it.next();
                                if (rG2GI7LDp2 != null) {
                                    UxHHqhbTP uxHHqhbTP3 = rG2GI7LDp2.tGV7Q6urW;
                                    if (string.equals(uxHHqhbTP3.NyWTwPF6V)) {
                                        uxHHqhbTP = uxHHqhbTP3;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    vNtjxmzUM = uxHHqhbTP;
                }
                if (vNtjxmzUM == null && i != -1) {
                    vNtjxmzUM = this.CBQ5d1kRq.vNtjxmzUM(i);
                }
                if (vNtjxmzUM == null) {
                    qKDOZuDet igRQEZxnW = this.CBQ5d1kRq.igRQEZxnW();
                    context.getClassLoader();
                    vNtjxmzUM = igRQEZxnW.q3BipwRCk(attributeValue);
                    vNtjxmzUM.WaUP0CF08 = true;
                    vNtjxmzUM.AqaWJg0b4 = resourceId != 0 ? resourceId : i;
                    vNtjxmzUM.mUqPm6GBh = i;
                    vNtjxmzUM.NyWTwPF6V = string;
                    vNtjxmzUM.i8XZMQc6Z = true;
                    fVMSvDhE6 fvmsvdhe6 = this.CBQ5d1kRq;
                    vNtjxmzUM.IytU16YUK = fvmsvdhe6;
                    z0NkpHHvU z0nkphhvu = fvmsvdhe6.ilHKhw3Yw;
                    vNtjxmzUM.CpG0imbht = z0nkphhvu;
                    vNtjxmzUM.i0Zug1mVk(z0nkphhvu.kmSgne1rO, attributeSet, vNtjxmzUM.kmSgne1rO);
                    rG2GI7LDp = this.CBQ5d1kRq.q3BipwRCk(vNtjxmzUM);
                    if (fVMSvDhE6.juJ6pnCpu(2)) {
                        sb = new StringBuilder();
                        sb.append("Fragment ");
                        sb.append(vNtjxmzUM);
                        str2 = " has been inflated via the <fragment> tag: id=0x";
                        sb.append(str2);
                        sb.append(Integer.toHexString(resourceId));
                        Log.v("FragmentManager", sb.toString());
                    }
                    vNtjxmzUM.igRQEZxnW = (ViewGroup) view;
                    rG2GI7LDp.vPSbyrYWX();
                    rG2GI7LDp.oon79WMrY();
                    view2 = vNtjxmzUM.EBQXiIPmm;
                    if (view2 == null) {
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (vNtjxmzUM.EBQXiIPmm.getTag() == null) {
                            vNtjxmzUM.EBQXiIPmm.setTag(string);
                        }
                        vNtjxmzUM.EBQXiIPmm.addOnAttachStateChangeListener(new Sme6YJlaf(this, rG2GI7LDp));
                        return vNtjxmzUM.EBQXiIPmm;
                    }
                    throw new IllegalStateException(M5g57XBLr.q3BipwRCk("Fragment ", attributeValue, " did not create a view."));
                } else if (!vNtjxmzUM.i8XZMQc6Z) {
                    vNtjxmzUM.i8XZMQc6Z = true;
                    fVMSvDhE6 fvmsvdhe62 = this.CBQ5d1kRq;
                    vNtjxmzUM.IytU16YUK = fvmsvdhe62;
                    z0NkpHHvU z0nkphhvu2 = fvmsvdhe62.ilHKhw3Yw;
                    vNtjxmzUM.CpG0imbht = z0nkphhvu2;
                    vNtjxmzUM.i0Zug1mVk(z0nkphhvu2.kmSgne1rO, attributeSet, vNtjxmzUM.kmSgne1rO);
                    rG2GI7LDp = this.CBQ5d1kRq.oon79WMrY(vNtjxmzUM);
                    if (fVMSvDhE6.juJ6pnCpu(2)) {
                        sb = new StringBuilder();
                        sb.append("Retained Fragment ");
                        sb.append(vNtjxmzUM);
                        str2 = " has been re-attached via the <fragment> tag: id=0x";
                        sb.append(str2);
                        sb.append(Integer.toHexString(resourceId));
                        Log.v("FragmentManager", sb.toString());
                    }
                    vNtjxmzUM.igRQEZxnW = (ViewGroup) view;
                    rG2GI7LDp.vPSbyrYWX();
                    rG2GI7LDp.oon79WMrY();
                    view2 = vNtjxmzUM.EBQXiIPmm;
                    if (view2 == null) {
                    }
                } else {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i) + " with another fragment for " + attributeValue);
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
