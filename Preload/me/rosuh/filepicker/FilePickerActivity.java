package me.rosuh.filepicker;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.feravolt.preload.R;
import con.D856HTNqd;
import con.HCY8BlMhC;
import con.HZDtN0XJv;
import con.IQs1K7w9x;
import con.J5skaPRaY;
import con.Jftyr7oNR;
import con.UoUKJhr5d;
import con.Wk9bO57s4;
import con.anXlDk6fV;
import con.dyvSzXDfa;
import con.ey4Vf0Eiu;
import con.gdEmqfwpT;
import con.grT0kqTxT;
import con.i88cgiFhL;
import con.idpM54xlp;
import con.joOFKdxvJ;
import con.llWJsfBCK;
import con.m2ygzKSSR;
import con.mBzZm787K;
import con.mSiW1fbBz;
import con.msTbxirqH;
import con.qXjHvgYVH;
import con.rwhamSOu2;
import con.xZLHWtbav;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import me.rosuh.filepicker.widget.PosLinearLayoutManager;
import me.rosuh.filepicker.widget.RecyclerViewFilePicker;
@SuppressLint({"ShowToast"})
/* loaded from: classes.dex */
public final class FilePickerActivity extends grT0kqTxT implements View.OnClickListener, msTbxirqH {
    public static final /* synthetic */ int j22ftfeNI;
    public final BlockingQueue AqaWJg0b4;
    public Button CpG0imbht;
    public J5skaPRaY EBQXiIPmm;
    public TextView IytU16YUK;
    public final int V9LQMKGJe;
    public SwipeRefreshLayout cAwN510t2;
    public RecyclerViewFilePicker dfpT1j18n;
    public RecyclerView iMyQMM6Qj;
    public J5skaPRaY igRQEZxnW;
    public ThreadPoolExecutor mUqPm6GBh;
    public Button qFBXIgpia;
    public Handler nlGCs0NZs = new Handler(Looper.getMainLooper());
    public final llWJsfBCK NyWTwPF6V = anXlDk6fV.ixWaw2akD(new qhPEQQaQ4());
    public final llWJsfBCK vNtjxmzUM = anXlDk6fV.ixWaw2akD(new aXI58Y1kr());
    public final llWJsfBCK i0Zug1mVk = anXlDk6fV.ixWaw2akD(new s7MlVynBG());
    public ArrayList o4LF8RkoQ = new ArrayList();
    public final llWJsfBCK QNqj6nIzv = anXlDk6fV.ixWaw2akD(dNif5KqqH.kmSgne1rO);
    public final llWJsfBCK TyB1UUd72 = anXlDk6fV.ixWaw2akD(mhl5lIdbQ.kmSgne1rO);
    public final llWJsfBCK juJ6pnCpu = anXlDk6fV.ixWaw2akD(RG2GI7LDp.kmSgne1rO);

    /* loaded from: classes.dex */
    public static final class RG2GI7LDp extends Wk9bO57s4 implements gdEmqfwpT {
        public static final RG2GI7LDp kmSgne1rO = new RG2GI7LDp();

        public RG2GI7LDp() {
            super(0);
        }

        @Override // con.gdEmqfwpT
        public Object GPLPRo6go() {
            return new rwhamSOu2(4);
        }
    }

    /* loaded from: classes.dex */
    public static final class aXI58Y1kr extends Wk9bO57s4 implements gdEmqfwpT {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public aXI58Y1kr() {
            super(0);
            FilePickerActivity.this = r1;
        }

        @Override // con.gdEmqfwpT
        public Object GPLPRo6go() {
            FilePickerActivity filePickerActivity = FilePickerActivity.this;
            HZDtN0XJv hZDtN0XJv = HZDtN0XJv.q3BipwRCk;
            Objects.requireNonNull(HZDtN0XJv.tGV7Q6urW);
            m2ygzKSSR m2ygzkssr = new m2ygzKSSR(filePickerActivity, false);
            qXjHvgYVH qxjhvgyvh = new qXjHvgYVH(FilePickerActivity.this, 1);
            mBzZm787K mbzzm787k = new mBzZm787K();
            qxjhvgyvh.IytU16YUK(mbzzm787k);
            m2ygzkssr.GPLPRo6go = mbzzm787k;
            return m2ygzkssr;
        }
    }

    /* loaded from: classes.dex */
    public static final class dNif5KqqH extends Wk9bO57s4 implements gdEmqfwpT {
        public static final dNif5KqqH kmSgne1rO = new dNif5KqqH();

        public dNif5KqqH() {
            super(0);
        }

        @Override // con.gdEmqfwpT
        public Object GPLPRo6go() {
            HZDtN0XJv hZDtN0XJv = HZDtN0XJv.q3BipwRCk;
            ey4Vf0Eiu ey4vf0eiu = HZDtN0XJv.tGV7Q6urW;
            Objects.requireNonNull(ey4vf0eiu);
            return ey4vf0eiu;
        }
    }

    /* loaded from: classes.dex */
    public static final class mhl5lIdbQ extends Wk9bO57s4 implements gdEmqfwpT {
        public static final mhl5lIdbQ kmSgne1rO = new mhl5lIdbQ();

        public mhl5lIdbQ() {
            super(0);
        }

        @Override // con.gdEmqfwpT
        public Object GPLPRo6go() {
            return new rwhamSOu2(4);
        }
    }

    /* loaded from: classes.dex */
    public static final class qhPEQQaQ4 extends Wk9bO57s4 implements gdEmqfwpT {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public qhPEQQaQ4() {
            super(0);
            FilePickerActivity.this = r1;
        }

        @Override // con.gdEmqfwpT
        public Object GPLPRo6go() {
            return new UoUKJhr5d(FilePickerActivity.this);
        }
    }

    /* loaded from: classes.dex */
    public static final class s7MlVynBG extends Wk9bO57s4 implements gdEmqfwpT {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s7MlVynBG() {
            super(0);
            FilePickerActivity.this = r1;
        }

        @Override // con.gdEmqfwpT
        public Object GPLPRo6go() {
            return new IQs1K7w9x(FilePickerActivity.this);
        }
    }

    public FilePickerActivity() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.AqaWJg0b4 = linkedBlockingQueue;
        this.mUqPm6GBh = new ThreadPoolExecutor(1, 1, 10, TimeUnit.MINUTES, linkedBlockingQueue);
        HZDtN0XJv hZDtN0XJv = HZDtN0XJv.q3BipwRCk;
        ey4Vf0Eiu ey4vf0eiu = HZDtN0XJv.tGV7Q6urW;
        Objects.requireNonNull(ey4vf0eiu);
        this.V9LQMKGJe = ey4vf0eiu.dIocxURUo;
    }

    public final IQs1K7w9x Eeka1udhb() {
        return (IQs1K7w9x) this.i0Zug1mVk.getValue();
    }

    public final J5skaPRaY MzoOEjc4X() {
        if (this.igRQEZxnW == null) {
            RecyclerViewFilePicker recyclerViewFilePicker = this.dfpT1j18n;
            this.igRQEZxnW = recyclerViewFilePicker == null ? null : new J5skaPRaY(recyclerViewFilePicker, this);
        }
        return this.igRQEZxnW;
    }

    public final void PSTqBLTET(Jftyr7oNR jftyr7oNR) {
        RecyclerView.s7MlVynBG adapter;
        ilHKhw3Yw().oon79WMrY().clear();
        iMyQMM6Qj();
        File file = new File(jftyr7oNR.q3BipwRCk());
        m2ygzKSSR ilHKhw3Yw = ilHKhw3Yw();
        joOFKdxvJ joofkdxvj = dyvSzXDfa.q3BipwRCk;
        ArrayList iiGwOFFnr = joofkdxvj.iiGwOFFnr(file);
        Objects.requireNonNull(ilHKhw3Yw);
        ilHKhw3Yw.kCA6Zs9sL.clear();
        ilHKhw3Yw.kCA6Zs9sL.addAll(iiGwOFFnr);
        ilHKhw3Yw.q3BipwRCk.J4Ux7ym32();
        this.o4LF8RkoQ = joofkdxvj.GPLPRo6go(new ArrayList(Eeka1udhb().kCA6Zs9sL), jftyr7oNR.q3BipwRCk(), this);
        IQs1K7w9x Eeka1udhb = Eeka1udhb();
        ArrayList arrayList = this.o4LF8RkoQ;
        Objects.requireNonNull(Eeka1udhb);
        if (arrayList != null) {
            Eeka1udhb.kCA6Zs9sL.clear();
            Eeka1udhb.kCA6Zs9sL.addAll(arrayList);
            Eeka1udhb.q3BipwRCk.J4Ux7ym32();
        }
        RecyclerView recyclerView = this.iMyQMM6Qj;
        int i = 0;
        if (!(recyclerView == null || (adapter = recyclerView.getAdapter()) == null)) {
            int q3BipwRCk = adapter.q3BipwRCk();
            RecyclerView recyclerView2 = this.iMyQMM6Qj;
            if (recyclerView2 != null) {
                recyclerView2.M66hQ219i(q3BipwRCk == 0 ? 0 : q3BipwRCk - 1);
            }
        }
        RecyclerViewFilePicker recyclerViewFilePicker = this.dfpT1j18n;
        if (recyclerViewFilePicker != null) {
            RecyclerView.LULQkQlc9 layoutManager = recyclerViewFilePicker.getLayoutManager();
            PosLinearLayoutManager posLinearLayoutManager = layoutManager instanceof PosLinearLayoutManager ? (PosLinearLayoutManager) layoutManager : null;
            if (posLinearLayoutManager != null) {
                Integer num = (Integer) ((rwhamSOu2) this.TyB1UUd72.getValue()).get(jftyr7oNR.q3BipwRCk());
                int intValue = num == null ? 0 : num.intValue();
                Integer num2 = (Integer) ((rwhamSOu2) this.juJ6pnCpu.getValue()).get(jftyr7oNR.q3BipwRCk());
                if (num2 != null) {
                    i = num2.intValue();
                }
                posLinearLayoutManager.qFBXIgpia = intValue;
                posLinearLayoutManager.nlGCs0NZs = i;
            }
            recyclerViewFilePicker.scheduleLayoutAnimation();
        }
    }

    public final ey4Vf0Eiu RG6kpfv3v() {
        return (ey4Vf0Eiu) this.QNqj6nIzv.getValue();
    }

    public final void WaUP0CF08() {
        if (!(D856HTNqd.q3BipwRCk(this, "android.permission.READ_EXTERNAL_STORAGE") == 0)) {
            D856HTNqd.J4Ux7ym32(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 10201);
        } else if (anXlDk6fV.tGV7Q6urW(Environment.getExternalStorageState(), "mounted")) {
            qVUwofr5s().submit((Runnable) this.NyWTwPF6V.getValue());
        } else {
            throw new Throwable(new IllegalStateException("External storage is not available ====>>> Environment.getExternalStorageState() != MEDIA_MOUNTED"));
        }
    }

    public final J5skaPRaY dXrmkklc8() {
        if (this.EBQXiIPmm == null) {
            RecyclerView recyclerView = this.iMyQMM6Qj;
            this.EBQXiIPmm = recyclerView == null ? null : new J5skaPRaY(recyclerView, this);
        }
        return this.EBQXiIPmm;
    }

    public final void dfpT1j18n(xZLHWtbav xzlhwtbav, int i) {
        if (xzlhwtbav != null) {
            ((rwhamSOu2) this.TyB1UUd72.getValue()).put(xzlhwtbav.J4Ux7ym32, Integer.valueOf(i));
            RecyclerViewFilePicker recyclerViewFilePicker = this.dfpT1j18n;
            LinearLayoutManager linearLayoutManager = null;
            RecyclerView.LULQkQlc9 layoutManager = recyclerViewFilePicker == null ? null : recyclerViewFilePicker.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            }
            if (linearLayoutManager != null) {
                rwhamSOu2 rwhamsou2 = (rwhamSOu2) this.juJ6pnCpu.getValue();
                String str = xzlhwtbav.J4Ux7ym32;
                View Eeka1udhb = linearLayoutManager.Eeka1udhb(i);
                Integer num = (Integer) rwhamsou2.put(str, Integer.valueOf(Eeka1udhb == null ? 0 : Eeka1udhb.getTop()));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r2 == null) goto L_0x0075;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0069, code lost:
        if (r2 == null) goto L_0x0075;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
        dfpT1j18n((con.xZLHWtbav) con.wkFJfVmcv.TyB1UUd72(r2.kCA6Zs9sL), r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0075, code lost:
        PSTqBLTET(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void i8XZMQc6Z(RecyclerView.s7MlVynBG s7mlvynbg, View view, int i) {
        Jftyr7oNR Puu3Rhg4F = ((i88cgiFhL) s7mlvynbg).Puu3Rhg4F(i);
        if (Puu3Rhg4F != null) {
            File file = new File(Puu3Rhg4F.q3BipwRCk());
            if (file.exists()) {
                int id = view.getId();
                IQs1K7w9x iQs1K7w9x = null;
                if (id == R.id.item_list_file_picker) {
                    HZDtN0XJv hZDtN0XJv = HZDtN0XJv.q3BipwRCk;
                    Objects.requireNonNull(HZDtN0XJv.tGV7Q6urW);
                    if (file.isDirectory()) {
                        RecyclerView recyclerView = this.iMyQMM6Qj;
                        RecyclerView.s7MlVynBG adapter = recyclerView == null ? null : recyclerView.getAdapter();
                        if (adapter instanceof IQs1K7w9x) {
                            iQs1K7w9x = (IQs1K7w9x) adapter;
                        }
                    } else {
                        Objects.requireNonNull(HZDtN0XJv.tGV7Q6urW);
                    }
                } else if (id == R.id.item_nav_file_picker && file.isDirectory()) {
                    RecyclerView recyclerView2 = this.iMyQMM6Qj;
                    RecyclerView.s7MlVynBG adapter2 = recyclerView2 == null ? null : recyclerView2.getAdapter();
                    if (adapter2 instanceof IQs1K7w9x) {
                        iQs1K7w9x = (IQs1K7w9x) adapter2;
                    }
                }
            }
        }
    }

    public final void iMyQMM6Qj() {
        Objects.requireNonNull(RG6kpfv3v());
        if (ixWaw2akD() == 0) {
            Button button = this.qFBXIgpia;
            if (button != null) {
                button.setText(RG6kpfv3v().oon79WMrY);
            }
            TextView textView = this.IytU16YUK;
            if (textView != null) {
                textView.setText("");
                return;
            }
            return;
        }
        Button button2 = this.qFBXIgpia;
        if (button2 != null) {
            button2.setText(RG6kpfv3v().vPSbyrYWX);
        }
        TextView textView2 = this.IytU16YUK;
        if (textView2 != null) {
            textView2.setText(getResources().getString(RG6kpfv3v().CBQ5d1kRq, Integer.valueOf(ixWaw2akD())));
        }
    }

    public final m2ygzKSSR ilHKhw3Yw() {
        return (m2ygzKSSR) this.vNtjxmzUM.getValue();
    }

    public final int ixWaw2akD() {
        return ilHKhw3Yw().yWvV4ePLl();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        RecyclerView recyclerView = this.iMyQMM6Qj;
        IQs1K7w9x iQs1K7w9x = null;
        RecyclerView.s7MlVynBG adapter = recyclerView == null ? null : recyclerView.getAdapter();
        IQs1K7w9x iQs1K7w9x2 = adapter instanceof IQs1K7w9x ? (IQs1K7w9x) adapter : null;
        if ((iQs1K7w9x2 == null ? 0 : iQs1K7w9x2.q3BipwRCk()) <= 1) {
            this.qVUwofr5s.J4Ux7ym32();
            return;
        }
        RecyclerView recyclerView2 = this.iMyQMM6Qj;
        RecyclerView.s7MlVynBG adapter2 = recyclerView2 == null ? null : recyclerView2.getAdapter();
        if (adapter2 instanceof IQs1K7w9x) {
            iQs1K7w9x = (IQs1K7w9x) adapter2;
        }
        if (iQs1K7w9x != null) {
            PSTqBLTET(iQs1K7w9x.Puu3Rhg4F(iQs1K7w9x.q3BipwRCk() - 2));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        boolean z = true;
        int i = 0;
        if (id == R.id.btn_selected_all_file_picker) {
            if (ixWaw2akD() > 0) {
                m2ygzKSSR ilHKhw3Yw = ilHKhw3Yw();
                int i2 = 0;
                for (Object obj : ilHKhw3Yw.kCA6Zs9sL) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        mSiW1fbBz msiw1fbbz = (mSiW1fbBz) obj;
                        HZDtN0XJv hZDtN0XJv = HZDtN0XJv.q3BipwRCk;
                        ey4Vf0Eiu ey4vf0eiu = HZDtN0XJv.tGV7Q6urW;
                        Objects.requireNonNull(ey4vf0eiu);
                        if ((!ey4vf0eiu.tGV7Q6urW || !msiw1fbbz.kCA6Zs9sL) && msiw1fbbz.tGV7Q6urW) {
                            msiw1fbbz.tGV7Q6urW = false;
                            ilHKhw3Yw.oon79WMrY().remove(msiw1fbbz);
                            mBzZm787K mbzzm787k = ilHKhw3Yw.GPLPRo6go;
                            if (mbzzm787k != null) {
                                mbzzm787k.q3BipwRCk(ilHKhw3Yw.yWvV4ePLl());
                            }
                            ilHKhw3Yw.dIocxURUo(i2, Boolean.FALSE);
                        }
                        i2 = i3;
                    } else {
                        idpM54xlp.IytU16YUK();
                        throw null;
                    }
                }
            } else if (sk5s77z6Q()) {
                m2ygzKSSR ilHKhw3Yw2 = ilHKhw3Yw();
                for (Object obj2 : ilHKhw3Yw2.kCA6Zs9sL) {
                    int i4 = i + 1;
                    if (i >= 0) {
                        mSiW1fbBz msiw1fbbz2 = (mSiW1fbBz) obj2;
                        int i5 = ilHKhw3Yw2.oon79WMrY().Bhmn1KIah;
                        HZDtN0XJv hZDtN0XJv2 = HZDtN0XJv.q3BipwRCk;
                        ey4Vf0Eiu ey4vf0eiu2 = HZDtN0XJv.tGV7Q6urW;
                        Objects.requireNonNull(ey4vf0eiu2);
                        if (i5 < ey4vf0eiu2.dIocxURUo) {
                            ey4Vf0Eiu ey4vf0eiu3 = HZDtN0XJv.tGV7Q6urW;
                            Objects.requireNonNull(ey4vf0eiu3);
                            if ((!ey4vf0eiu3.tGV7Q6urW || !msiw1fbbz2.kCA6Zs9sL) && !msiw1fbbz2.tGV7Q6urW) {
                                msiw1fbbz2.tGV7Q6urW = true;
                                ilHKhw3Yw2.oon79WMrY().add(msiw1fbbz2);
                                mBzZm787K mbzzm787k2 = ilHKhw3Yw2.GPLPRo6go;
                                if (mbzzm787k2 != null) {
                                    mbzzm787k2.q3BipwRCk(ilHKhw3Yw2.yWvV4ePLl());
                                }
                                ilHKhw3Yw2.dIocxURUo(i, Boolean.TRUE);
                            }
                            i = i4;
                        } else {
                            return;
                        }
                    } else {
                        idpM54xlp.IytU16YUK();
                        throw null;
                    }
                }
            }
        } else if (id == R.id.btn_confirm_file_picker) {
            ArrayList arrayList = ilHKhw3Yw().kCA6Zs9sL;
            if (arrayList != null && !arrayList.isEmpty()) {
                z = false;
            }
            if (!z) {
                ArrayList arrayList2 = new ArrayList();
                Intent intent = new Intent();
                Iterator it = ilHKhw3Yw().kCA6Zs9sL.iterator();
                while (it.hasNext()) {
                    mSiW1fbBz msiw1fbbz3 = (mSiW1fbBz) it.next();
                    if (msiw1fbbz3.tGV7Q6urW) {
                        arrayList2.add(msiw1fbbz3.J4Ux7ym32);
                    }
                }
                if (arrayList2.isEmpty()) {
                    setResult(0, intent);
                    finish();
                }
                HZDtN0XJv hZDtN0XJv3 = HZDtN0XJv.q3BipwRCk;
                HZDtN0XJv.dIocxURUo = arrayList2;
                setResult(-1, intent);
                finish();
            }
        } else if (id == R.id.btn_go_back_file_picker) {
            onBackPressed();
        }
    }

    @Override // con.XticXNngr, androidx.activity.ComponentActivity, con.pc1YcJups, android.app.Activity
    public void onCreate(Bundle bundle) {
        setTheme(RG6kpfv3v().yWvV4ePLl);
        super.onCreate(bundle);
        setContentView(R.layout.main_activity_for_file_picker);
        ImageView imageView = (ImageView) findViewById(R.id.btn_go_back_file_picker);
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
        Button button = (Button) findViewById(R.id.btn_selected_all_file_picker);
        this.qFBXIgpia = button;
        if (button != null) {
            Objects.requireNonNull(RG6kpfv3v());
            button.setOnClickListener(this);
            HZDtN0XJv hZDtN0XJv = HZDtN0XJv.q3BipwRCk;
            ey4Vf0Eiu ey4vf0eiu = HZDtN0XJv.tGV7Q6urW;
            Objects.requireNonNull(ey4vf0eiu);
            button.setText(ey4vf0eiu.oon79WMrY);
        }
        Button button2 = (Button) findViewById(R.id.btn_confirm_file_picker);
        this.CpG0imbht = button2;
        if (button2 != null) {
            button2.setOnClickListener(this);
            HZDtN0XJv hZDtN0XJv2 = HZDtN0XJv.q3BipwRCk;
            ey4Vf0Eiu ey4vf0eiu2 = HZDtN0XJv.tGV7Q6urW;
            Objects.requireNonNull(ey4vf0eiu2);
            button2.setText(ey4vf0eiu2.kmSgne1rO);
        }
        TextView textView = (TextView) findViewById(R.id.tv_toolbar_title_file_picker);
        this.IytU16YUK = textView;
        boolean z = false;
        if (textView != null) {
            Objects.requireNonNull(RG6kpfv3v());
            textView.setVisibility(0);
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh_layout);
        this.cAwN510t2 = swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(new HCY8BlMhC(this));
            swipeRefreshLayout.setRefreshing(true);
            Resources resources = swipeRefreshLayout.getResources();
            int i = RG6kpfv3v().yWvV4ePLl;
            int[] intArray = resources.getIntArray(i == R.style.FilePickerThemeCrane ? R.array.crane_swl_colors : i == R.style.FilePickerThemeReply ? R.array.reply_swl_colors : i == R.style.FilePickerThemeShrine ? R.array.shrine_swl_colors : R.array.rail_swl_colors);
            swipeRefreshLayout.setColorSchemeColors(Arrays.copyOf(intArray, intArray.length));
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_nav_file_picker);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(Eeka1udhb());
        this.iMyQMM6Qj = recyclerView;
        RecyclerViewFilePicker recyclerViewFilePicker = (RecyclerViewFilePicker) findViewById(R.id.rv_list_file_picker);
        recyclerViewFilePicker.setHasFixedSize(true);
        recyclerViewFilePicker.setAdapter(ilHKhw3Yw());
        recyclerViewFilePicker.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(recyclerViewFilePicker.getContext(), R.anim.layout_item_anim_file_picker));
        recyclerViewFilePicker.setLayoutManager(new PosLinearLayoutManager(this));
        if (!(recyclerViewFilePicker.XGA7b0zuB != null)) {
            View inflate = LayoutInflater.from(recyclerViewFilePicker.getContext()).inflate(R.layout.empty_file_list_file_picker, (ViewGroup) recyclerViewFilePicker, false);
            ((TextView) inflate.findViewById(R.id.tv_empty_list)).setText(RG6kpfv3v().PSTqBLTET);
            recyclerViewFilePicker.setEmptyView(inflate);
        }
        this.dfpT1j18n = recyclerViewFilePicker;
        if (D856HTNqd.q3BipwRCk(this, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            z = true;
        }
        if (z) {
            WaUP0CF08();
        } else {
            D856HTNqd.J4Ux7ym32(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 10201);
        }
    }

    @Override // con.grT0kqTxT, con.XticXNngr, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!qVUwofr5s().isShutdown()) {
            qVUwofr5s().shutdown();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 10201) {
            if ((iArr.length == 0) || iArr[0] != 0) {
                Toast.makeText(getApplicationContext(), getString(R.string.file_picker_request_permission_failed), 0).show();
                SwipeRefreshLayout swipeRefreshLayout = this.cAwN510t2;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(false);
                    return;
                }
                return;
            }
            WaUP0CF08();
        }
    }

    public final ThreadPoolExecutor qVUwofr5s() {
        if (this.mUqPm6GBh.isShutdown()) {
            this.mUqPm6GBh = new ThreadPoolExecutor(1, 1, 10, TimeUnit.MINUTES, this.AqaWJg0b4);
        }
        return this.mUqPm6GBh;
    }

    public final boolean sk5s77z6Q() {
        return ixWaw2akD() < this.V9LQMKGJe;
    }
}
