package con;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.RG2GI7LDp;
import androidx.core.widget.NestedScrollView;
import com.feravolt.preload.R;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class dF3gF5M3i extends Dialog implements zmOE3WTfy {
    public final AlertController Bhmn1KIah;
    public yYWQSxv2D CBQ5d1kRq;
    public final PXqoNfOJ8 kmSgne1rO;

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public dF3gF5M3i(Context context, int i) {
        super(context, r2);
        int i2;
        int tGV7Q6urW = tGV7Q6urW(context, i);
        if (tGV7Q6urW == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = tGV7Q6urW;
        }
        this.kmSgne1rO = new iMSMhSuiC(this);
        yYWQSxv2D q3BipwRCk = q3BipwRCk();
        if (tGV7Q6urW == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            tGV7Q6urW = typedValue2.resourceId;
        }
        ((Jg0aTLb6g) q3BipwRCk).wIZEdYHUn = tGV7Q6urW;
        q3BipwRCk.iiGwOFFnr(null);
        this.Bhmn1KIah = new AlertController(getContext(), this, getWindow());
    }

    public static int tGV7Q6urW(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // con.zmOE3WTfy
    public /* bridge */ /* synthetic */ void J4Ux7ym32(pOLFExxoD polfexxod) {
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q3BipwRCk().tGV7Q6urW(view, layoutParams);
    }

    @Override // con.zmOE3WTfy
    public /* bridge */ /* synthetic */ void dIocxURUo(pOLFExxoD polfexxod) {
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        q3BipwRCk().GPLPRo6go();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return qXUxYxCuO.J4Ux7ym32(this.kmSgne1rO, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public View findViewById(int i) {
        Jg0aTLb6g jg0aTLb6g = (Jg0aTLb6g) q3BipwRCk();
        jg0aTLb6g.i8XZMQc6Z();
        return jg0aTLb6g.MzoOEjc4X.findViewById(i);
    }

    @Override // con.zmOE3WTfy
    public /* bridge */ /* synthetic */ pOLFExxoD iiGwOFFnr(uj7tg96A8 uj7tg96a8) {
        return null;
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        q3BipwRCk().kCA6Zs9sL();
    }

    public boolean kCA6Zs9sL(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        boolean z;
        View view;
        ListAdapter listAdapter;
        View findViewById;
        Button button;
        q3BipwRCk().dIocxURUo();
        super.onCreate(bundle);
        q3BipwRCk().iiGwOFFnr(bundle);
        AlertController alertController = this.Bhmn1KIah;
        int i = alertController.i0Zug1mVk;
        alertController.J4Ux7ym32.setContentView(alertController.vNtjxmzUM);
        View findViewById2 = alertController.tGV7Q6urW.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view2 = alertController.Puu3Rhg4F;
        int i2 = 0;
        if (view2 == null) {
            view2 = alertController.yWvV4ePLl != 0 ? LayoutInflater.from(alertController.q3BipwRCk).inflate(alertController.yWvV4ePLl, viewGroup, false) : null;
        }
        boolean z2 = view2 != null;
        if (!z2 || !AlertController.q3BipwRCk(view2)) {
            alertController.tGV7Q6urW.setFlags(131072, 131072);
        }
        if (z2) {
            FrameLayout frameLayout = (FrameLayout) alertController.tGV7Q6urW.findViewById(R.id.custom);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.Bhmn1KIah) {
                frameLayout.setPadding(alertController.oon79WMrY, alertController.vPSbyrYWX, alertController.CBQ5d1kRq, alertController.kmSgne1rO);
            }
            if (alertController.GPLPRo6go != null) {
                ((LinearLayout.LayoutParams) ((RG2GI7LDp.C0002RG2GI7LDp) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup dIocxURUo = alertController.dIocxURUo(findViewById6, findViewById3);
        ViewGroup dIocxURUo2 = alertController.dIocxURUo(findViewById7, findViewById4);
        ViewGroup dIocxURUo3 = alertController.dIocxURUo(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) alertController.tGV7Q6urW.findViewById(R.id.scrollView);
        alertController.iMyQMM6Qj = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.iMyQMM6Qj.setNestedScrollingEnabled(false);
        TextView textView = (TextView) dIocxURUo2.findViewById(16908299);
        alertController.nlGCs0NZs = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.iiGwOFFnr;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.iMyQMM6Qj.removeView(alertController.nlGCs0NZs);
                if (alertController.GPLPRo6go != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.iMyQMM6Qj.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.iMyQMM6Qj);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.GPLPRo6go, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    dIocxURUo2.setVisibility(8);
                }
            }
        }
        Button button2 = (Button) dIocxURUo3.findViewById(16908313);
        alertController.PSTqBLTET = button2;
        button2.setOnClickListener(alertController.juJ6pnCpu);
        if (!TextUtils.isEmpty(alertController.MzoOEjc4X) || alertController.qVUwofr5s != null) {
            alertController.PSTqBLTET.setText(alertController.MzoOEjc4X);
            Drawable drawable = alertController.qVUwofr5s;
            if (drawable != null) {
                int i3 = alertController.dIocxURUo;
                drawable.setBounds(0, 0, i3, i3);
                alertController.PSTqBLTET.setCompoundDrawables(alertController.qVUwofr5s, null, null, null);
            }
            alertController.PSTqBLTET.setVisibility(0);
            z = true;
        } else {
            alertController.PSTqBLTET.setVisibility(8);
            z = false;
        }
        Button button3 = (Button) dIocxURUo3.findViewById(16908314);
        alertController.Eeka1udhb = button3;
        button3.setOnClickListener(alertController.juJ6pnCpu);
        if (!TextUtils.isEmpty(alertController.dXrmkklc8) || alertController.ixWaw2akD != null) {
            alertController.Eeka1udhb.setText(alertController.dXrmkklc8);
            Drawable drawable2 = alertController.ixWaw2akD;
            if (drawable2 != null) {
                int i4 = alertController.dIocxURUo;
                drawable2.setBounds(0, 0, i4, i4);
                alertController.Eeka1udhb.setCompoundDrawables(alertController.ixWaw2akD, null, null, null);
            }
            alertController.Eeka1udhb.setVisibility(0);
            z |= true;
        } else {
            alertController.Eeka1udhb.setVisibility(8);
        }
        Button button4 = (Button) dIocxURUo3.findViewById(16908315);
        alertController.sk5s77z6Q = button4;
        button4.setOnClickListener(alertController.juJ6pnCpu);
        if (!TextUtils.isEmpty(alertController.WaUP0CF08) || alertController.dfpT1j18n != null) {
            alertController.sk5s77z6Q.setText(alertController.WaUP0CF08);
            Drawable drawable3 = alertController.dfpT1j18n;
            if (drawable3 != null) {
                int i5 = alertController.dIocxURUo;
                drawable3.setBounds(0, 0, i5, i5);
                view = null;
                alertController.sk5s77z6Q.setCompoundDrawables(alertController.dfpT1j18n, null, null, null);
            } else {
                view = null;
            }
            alertController.sk5s77z6Q.setVisibility(0);
            z |= true;
        } else {
            alertController.sk5s77z6Q.setVisibility(8);
            view = null;
        }
        Context context = alertController.q3BipwRCk;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (z) {
                button = alertController.PSTqBLTET;
            } else if (z) {
                button = alertController.Eeka1udhb;
            } else if (z) {
                button = alertController.sk5s77z6Q;
            }
            alertController.J4Ux7ym32(button);
        }
        if (!(z)) {
            dIocxURUo3.setVisibility(8);
        }
        if (alertController.AqaWJg0b4 != null) {
            dIocxURUo.addView(alertController.AqaWJg0b4, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.tGV7Q6urW.findViewById(R.id.title_template).setVisibility(8);
        } else {
            alertController.CpG0imbht = (ImageView) alertController.tGV7Q6urW.findViewById(16908294);
            if (!(!TextUtils.isEmpty(alertController.kCA6Zs9sL)) || !alertController.EBQXiIPmm) {
                alertController.tGV7Q6urW.findViewById(R.id.title_template).setVisibility(8);
                alertController.CpG0imbht.setVisibility(8);
                dIocxURUo.setVisibility(8);
            } else {
                TextView textView2 = (TextView) alertController.tGV7Q6urW.findViewById(R.id.alertTitle);
                alertController.qFBXIgpia = textView2;
                textView2.setText(alertController.kCA6Zs9sL);
                int i6 = alertController.cAwN510t2;
                if (i6 != 0) {
                    alertController.CpG0imbht.setImageResource(i6);
                } else {
                    Drawable drawable4 = alertController.IytU16YUK;
                    if (drawable4 != null) {
                        alertController.CpG0imbht.setImageDrawable(drawable4);
                    } else {
                        alertController.qFBXIgpia.setPadding(alertController.CpG0imbht.getPaddingLeft(), alertController.CpG0imbht.getPaddingTop(), alertController.CpG0imbht.getPaddingRight(), alertController.CpG0imbht.getPaddingBottom());
                        alertController.CpG0imbht.setVisibility(8);
                    }
                }
            }
        }
        boolean z3 = viewGroup.getVisibility() != 8;
        int i7 = (dIocxURUo == null || dIocxURUo.getVisibility() == 8) ? 0 : 1;
        boolean z4 = dIocxURUo3.getVisibility() != 8;
        if (!z4 && (findViewById = dIocxURUo2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i7 != 0) {
            NestedScrollView nestedScrollView2 = alertController.iMyQMM6Qj;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (alertController.iiGwOFFnr == null && alertController.GPLPRo6go == null) ? view : dIocxURUo.findViewById(R.id.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = dIocxURUo2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        ListView listView = alertController.GPLPRo6go;
        if (listView instanceof AlertController.RecycleListView) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) listView;
            Objects.requireNonNull(recycleListView);
            if (!z4 || i7 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i7 != 0 ? recycleListView.getPaddingTop() : recycleListView.CBQ5d1kRq, recycleListView.getPaddingRight(), z4 ? recycleListView.getPaddingBottom() : recycleListView.kmSgne1rO);
            }
        }
        if (!z3) {
            View view3 = alertController.GPLPRo6go;
            if (view3 == null) {
                view3 = alertController.iMyQMM6Qj;
            }
            if (view3 != null) {
                if (z4) {
                    i2 = 2;
                }
                View findViewById11 = alertController.tGV7Q6urW.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = alertController.tGV7Q6urW.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
                tJeYlszdE.dIocxURUo(view3, i7 | i2, 3);
                if (findViewById11 != null) {
                    dIocxURUo2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    dIocxURUo2.removeView(findViewById12);
                }
            }
        }
        ListView listView2 = alertController.GPLPRo6go;
        if (listView2 != null && (listAdapter = alertController.mUqPm6GBh) != null) {
            listView2.setAdapter(listAdapter);
            int i8 = alertController.NyWTwPF6V;
            if (i8 > -1) {
                listView2.setItemChecked(i8, true);
                listView2.setSelection(i8);
            }
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.Bhmn1KIah.iMyQMM6Qj;
        if (nestedScrollView != null && nestedScrollView.kmSgne1rO(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.Bhmn1KIah.iMyQMM6Qj;
        if (nestedScrollView != null && nestedScrollView.kmSgne1rO(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        q3BipwRCk().Puu3Rhg4F();
    }

    public yYWQSxv2D q3BipwRCk() {
        if (this.CBQ5d1kRq == null) {
            qIxSZWcre qixszwcre = yYWQSxv2D.CBQ5d1kRq;
            this.CBQ5d1kRq = new Jg0aTLb6g(getContext(), getWindow(), this, this);
        }
        return this.CBQ5d1kRq;
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        q3BipwRCk().vPSbyrYWX(i);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        q3BipwRCk().Bhmn1KIah(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        q3BipwRCk().CBQ5d1kRq(view);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        q3BipwRCk().Bhmn1KIah(charSequence);
        AlertController alertController = this.Bhmn1KIah;
        alertController.kCA6Zs9sL = charSequence;
        TextView textView = alertController.qFBXIgpia;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        q3BipwRCk().kmSgne1rO(view, layoutParams);
    }
}
