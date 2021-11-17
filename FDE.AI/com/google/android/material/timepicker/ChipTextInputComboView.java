package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.feravolt.preload.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import con.go0qReAcx;
import con.yXzWc1b4D;
/* loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {
    public final Chip CBQ5d1kRq;
    public final EditText kmSgne1rO;

    /* loaded from: classes.dex */
    public class mhl5lIdbQ extends yXzWc1b4D {
        public mhl5lIdbQ(RG2GI7LDp rG2GI7LDp) {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
                chipTextInputComboView.CBQ5d1kRq.setText(ChipTextInputComboView.q3BipwRCk(chipTextInputComboView, "00"));
                return;
            }
            ChipTextInputComboView chipTextInputComboView2 = ChipTextInputComboView.this;
            chipTextInputComboView2.CBQ5d1kRq.setText(ChipTextInputComboView.q3BipwRCk(chipTextInputComboView2, editable));
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.CBQ5d1kRq = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.kmSgne1rO = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new mhl5lIdbQ(null));
        J4Ux7ym32();
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        editText.setSaveEnabled(false);
    }

    public static String q3BipwRCk(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    public final void J4Ux7ym32() {
        this.kmSgne1rO.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.CBQ5d1kRq.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        J4Ux7ym32();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.CBQ5d1kRq.setChecked(z);
        int i = 0;
        this.kmSgne1rO.setVisibility(z ? 0 : 4);
        Chip chip = this.CBQ5d1kRq;
        if (z) {
            i = 8;
        }
        chip.setVisibility(i);
        if (isChecked()) {
            EditText editText = this.kmSgne1rO;
            editText.requestFocus();
            editText.post(new go0qReAcx(editText));
            if (!TextUtils.isEmpty(this.kmSgne1rO.getText())) {
                EditText editText2 = this.kmSgne1rO;
                editText2.setSelection(editText2.getText().length());
            }
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.CBQ5d1kRq.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.CBQ5d1kRq.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.CBQ5d1kRq.toggle();
    }
}
