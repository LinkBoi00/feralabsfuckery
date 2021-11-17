package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.mhl5lIdbQ;
import com.feravolt.preload.R;
import con.IuQbWntsc;
import con.VCCyeOu6I;
import con.ZolH67hOx;
import con.j6XJY7rz4;
import con.tDC1iJlG1;
import java.util.Objects;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements mhl5lIdbQ.RG2GI7LDp, AbsListView.SelectionBoundsAdjuster {
    public RadioButton Bhmn1KIah;
    public tDC1iJlG1 CBQ5d1kRq;
    public ImageView Eeka1udhb;
    public CheckBox MzoOEjc4X;
    public TextView PSTqBLTET;
    public Drawable RG6kpfv3v;
    public boolean WaUP0CF08;
    public boolean cAwN510t2;
    public LinearLayout dXrmkklc8;
    public boolean dfpT1j18n;
    public Drawable i8XZMQc6Z;
    public LayoutInflater iMyQMM6Qj;
    public TextView ilHKhw3Yw;
    public int ixWaw2akD;
    public ImageView kmSgne1rO;
    public ImageView qVUwofr5s;
    public Context sk5s77z6Q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j6XJY7rz4 mUqPm6GBh = j6XJY7rz4.mUqPm6GBh(getContext(), attributeSet, ZolH67hOx.ilHKhw3Yw, R.attr.listMenuViewStyle, 0);
        this.RG6kpfv3v = mUqPm6GBh.dXrmkklc8(5);
        this.ixWaw2akD = mUqPm6GBh.iMyQMM6Qj(1, -1);
        this.WaUP0CF08 = mUqPm6GBh.vPSbyrYWX(7, false);
        this.sk5s77z6Q = context;
        this.i8XZMQc6Z = mUqPm6GBh.dXrmkklc8(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.dfpT1j18n = obtainStyledAttributes.hasValue(0);
        mUqPm6GBh.NyWTwPF6V();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.iMyQMM6Qj == null) {
            this.iMyQMM6Qj = LayoutInflater.from(getContext());
        }
        return this.iMyQMM6Qj;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.qVUwofr5s;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void J4Ux7ym32() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
        this.Bhmn1KIah = radioButton;
        LinearLayout linearLayout = this.dXrmkklc8;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.Eeka1udhb;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.Eeka1udhb.getLayoutParams();
            rect.top = this.Eeka1udhb.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    @Override // androidx.appcompat.view.menu.mhl5lIdbQ.RG2GI7LDp
    public tDC1iJlG1 getItemData() {
        return this.CBQ5d1kRq;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.RG6kpfv3v;
        WeakHashMap weakHashMap = IuQbWntsc.q3BipwRCk;
        VCCyeOu6I.ilHKhw3Yw(this, drawable);
        TextView textView = (TextView) findViewById(R.id.title);
        this.PSTqBLTET = textView;
        int i = this.ixWaw2akD;
        if (i != -1) {
            textView.setTextAppearance(this.sk5s77z6Q, i);
        }
        this.ilHKhw3Yw = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.qVUwofr5s = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.i8XZMQc6Z);
        }
        this.Eeka1udhb = (ImageView) findViewById(R.id.group_divider);
        this.dXrmkklc8 = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        if (this.kmSgne1rO != null && this.WaUP0CF08) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.kmSgne1rO.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public final void q3BipwRCk() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        this.MzoOEjc4X = checkBox;
        LinearLayout linearLayout = this.dXrmkklc8;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.Bhmn1KIah != null || this.MzoOEjc4X != null) {
            if (this.CBQ5d1kRq.Puu3Rhg4F()) {
                if (this.Bhmn1KIah == null) {
                    J4Ux7ym32();
                }
                compoundButton2 = this.Bhmn1KIah;
                compoundButton = this.MzoOEjc4X;
            } else {
                if (this.MzoOEjc4X == null) {
                    q3BipwRCk();
                }
                compoundButton2 = this.MzoOEjc4X;
                compoundButton = this.Bhmn1KIah;
            }
            if (z) {
                compoundButton2.setChecked(this.CBQ5d1kRq.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.MzoOEjc4X;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.Bhmn1KIah;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.CBQ5d1kRq.Puu3Rhg4F()) {
            if (this.Bhmn1KIah == null) {
                J4Ux7ym32();
            }
            compoundButton = this.Bhmn1KIah;
        } else {
            if (this.MzoOEjc4X == null) {
                q3BipwRCk();
            }
            compoundButton = this.MzoOEjc4X;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.cAwN510t2 = z;
        this.WaUP0CF08 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.Eeka1udhb;
        if (imageView != null) {
            imageView.setVisibility((this.dfpT1j18n || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        Objects.requireNonNull(this.CBQ5d1kRq.Bhmn1KIah);
        boolean z = this.cAwN510t2;
        if (z || this.WaUP0CF08) {
            ImageView imageView = this.kmSgne1rO;
            if (imageView != null || drawable != null || this.WaUP0CF08) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                    this.kmSgne1rO = imageView2;
                    LinearLayout linearLayout = this.dXrmkklc8;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.WaUP0CF08) {
                    ImageView imageView3 = this.kmSgne1rO;
                    if (!z) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.kmSgne1rO.getVisibility() != 0) {
                        this.kmSgne1rO.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.kmSgne1rO.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i;
        if (charSequence != null) {
            this.PSTqBLTET.setText(charSequence);
            if (this.PSTqBLTET.getVisibility() != 0) {
                textView = this.PSTqBLTET;
                i = 0;
            } else {
                return;
            }
        } else {
            i = 8;
            if (this.PSTqBLTET.getVisibility() != 8) {
                textView = this.PSTqBLTET;
            } else {
                return;
            }
        }
        textView.setVisibility(i);
    }

    @Override // androidx.appcompat.view.menu.mhl5lIdbQ.RG2GI7LDp
    public void tGV7Q6urW(tDC1iJlG1 tdc1ijlg1, int i) {
        String str;
        int i2;
        this.CBQ5d1kRq = tdc1ijlg1;
        int i3 = 0;
        setVisibility(tdc1ijlg1.isVisible() ? 0 : 8);
        setTitle(tdc1ijlg1.kCA6Zs9sL);
        setCheckable(tdc1ijlg1.isCheckable());
        boolean kmSgne1rO = tdc1ijlg1.kmSgne1rO();
        tdc1ijlg1.kCA6Zs9sL();
        if (!kmSgne1rO || !this.CBQ5d1kRq.kmSgne1rO()) {
            i3 = 8;
        }
        if (i3 == 0) {
            TextView textView = this.ilHKhw3Yw;
            tDC1iJlG1 tdc1ijlg12 = this.CBQ5d1kRq;
            char kCA6Zs9sL = tdc1ijlg12.kCA6Zs9sL();
            if (kCA6Zs9sL == 0) {
                str = "";
            } else {
                Resources resources = tdc1ijlg12.Bhmn1KIah.q3BipwRCk.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(tdc1ijlg12.Bhmn1KIah.q3BipwRCk).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i4 = tdc1ijlg12.Bhmn1KIah.Bhmn1KIah() ? tdc1ijlg12.vPSbyrYWX : tdc1ijlg12.yWvV4ePLl;
                tDC1iJlG1.tGV7Q6urW(sb, i4, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                tDC1iJlG1.tGV7Q6urW(sb, i4, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                tDC1iJlG1.tGV7Q6urW(sb, i4, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                tDC1iJlG1.tGV7Q6urW(sb, i4, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                tDC1iJlG1.tGV7Q6urW(sb, i4, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                tDC1iJlG1.tGV7Q6urW(sb, i4, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (kCA6Zs9sL == '\b') {
                    i2 = R.string.abc_menu_delete_shortcut_label;
                } else if (kCA6Zs9sL == '\n') {
                    i2 = R.string.abc_menu_enter_shortcut_label;
                } else if (kCA6Zs9sL != ' ') {
                    sb.append(kCA6Zs9sL);
                    str = sb.toString();
                } else {
                    i2 = R.string.abc_menu_space_shortcut_label;
                }
                sb.append(resources.getString(i2));
                str = sb.toString();
            }
            textView.setText(str);
        }
        if (this.ilHKhw3Yw.getVisibility() != i3) {
            this.ilHKhw3Yw.setVisibility(i3);
        }
        setIcon(tdc1ijlg1.getIcon());
        setEnabled(tdc1ijlg1.isEnabled());
        setSubMenuArrowVisible(tdc1ijlg1.hasSubMenu());
        setContentDescription(tdc1ijlg1.ilHKhw3Yw);
    }
}
