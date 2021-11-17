package con;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.Button;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Executor;
import me.rosuh.filepicker.FilePickerActivity;
import me.rosuh.filepicker.widget.RecyclerViewFilePicker;
/* loaded from: classes.dex */
public final /* synthetic */ class NS7vjtAxy implements Runnable {
    public final /* synthetic */ Object Bhmn1KIah;
    public final /* synthetic */ int CBQ5d1kRq = 0;
    public final /* synthetic */ Object kmSgne1rO;

    public /* synthetic */ NS7vjtAxy(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.kmSgne1rO = profileInstallerInitializer;
        this.Bhmn1KIah = context;
    }

    public /* synthetic */ NS7vjtAxy(MCXoBhXFn mCXoBhXFn, SErPKGCcc sErPKGCcc) {
        this.kmSgne1rO = mCXoBhXFn;
        this.Bhmn1KIah = sErPKGCcc;
    }

    public /* synthetic */ NS7vjtAxy(Executor executor, SErPKGCcc sErPKGCcc) {
        this.kmSgne1rO = executor;
        this.Bhmn1KIah = sErPKGCcc;
    }

    public /* synthetic */ NS7vjtAxy(FilePickerActivity filePickerActivity, ArrayList arrayList) {
        this.kmSgne1rO = filePickerActivity;
        this.Bhmn1KIah = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xheEapSkC q3BipwRCk;
        switch (this.CBQ5d1kRq) {
            case 0:
                Context context = (Context) this.Bhmn1KIah;
                Objects.requireNonNull((ProfileInstallerInitializer) this.kmSgne1rO);
                (Build.VERSION.SDK_INT >= 28 ? ProfileInstallerInitializer.mhl5lIdbQ.q3BipwRCk(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new hV0ISka2g(context, 0), (long) (new Random().nextInt(Math.max(1000, 1)) + 5000));
                return;
            case 1:
                Executor executor = (Executor) this.kmSgne1rO;
                SErPKGCcc sErPKGCcc = (SErPKGCcc) this.Bhmn1KIah;
                try {
                    synchronized (PVDPmuuqs.class) {
                        PVDPmuuqs.q3BipwRCk = true;
                        if (PVDPmuuqs.tGV7Q6urW == null) {
                            PVDPmuuqs.tGV7Q6urW = new NWj29W5je();
                        }
                        q3BipwRCk = PVDPmuuqs.tGV7Q6urW.q3BipwRCk();
                        PVDPmuuqs.q3BipwRCk = false;
                    }
                    if (executor == null) {
                        sErPKGCcc.J4Ux7ym32(q3BipwRCk);
                        return;
                    } else {
                        executor.execute(new Runnable(sErPKGCcc, q3BipwRCk, 1) { // from class: con.iu0KRc3Uu
                            public final /* synthetic */ xheEapSkC Bhmn1KIah;
                            public final /* synthetic */ int CBQ5d1kRq;
                            public final /* synthetic */ SErPKGCcc kmSgne1rO;

                            {
                                this.CBQ5d1kRq = r3;
                                this.kmSgne1rO = r1;
                                this.Bhmn1KIah = r2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (this.CBQ5d1kRq) {
                                    case 0:
                                        this.kmSgne1rO.J4Ux7ym32(this.Bhmn1KIah);
                                        return;
                                    default:
                                        this.kmSgne1rO.J4Ux7ym32(this.Bhmn1KIah);
                                        return;
                                }
                            }
                        });
                        return;
                    }
                } catch (CUby0PNcw unused) {
                    Charset charset = BPyGi2K5m.q3BipwRCk;
                    return;
                }
            case 2:
                MCXoBhXFn mCXoBhXFn = (MCXoBhXFn) this.kmSgne1rO;
                Objects.requireNonNull(mCXoBhXFn);
                ((SErPKGCcc) this.Bhmn1KIah).q3BipwRCk(mCXoBhXFn);
                return;
            default:
                FilePickerActivity filePickerActivity = (FilePickerActivity) this.kmSgne1rO;
                ArrayList arrayList = (ArrayList) this.Bhmn1KIah;
                ArrayList arrayList2 = filePickerActivity.o4LF8RkoQ;
                Button button = filePickerActivity.CpG0imbht;
                if (button != null) {
                    button.setEnabled(true);
                }
                Button button2 = filePickerActivity.qFBXIgpia;
                if (button2 != null) {
                    button2.setEnabled(true);
                }
                IQs1K7w9x Eeka1udhb = filePickerActivity.Eeka1udhb();
                Objects.requireNonNull(Eeka1udhb);
                if (arrayList2 != null) {
                    Eeka1udhb.kCA6Zs9sL.clear();
                    Eeka1udhb.kCA6Zs9sL.addAll(arrayList2);
                    Eeka1udhb.q3BipwRCk.J4Ux7ym32();
                }
                RecyclerView recyclerView = filePickerActivity.iMyQMM6Qj;
                if (recyclerView != null) {
                    J5skaPRaY dXrmkklc8 = filePickerActivity.dXrmkklc8();
                    if (dXrmkklc8 != null) {
                        recyclerView.cAwN510t2.remove(dXrmkklc8);
                        if (recyclerView.IytU16YUK == dXrmkklc8) {
                            recyclerView.IytU16YUK = null;
                        }
                    }
                    J5skaPRaY dXrmkklc82 = filePickerActivity.dXrmkklc8();
                    if (dXrmkklc82 != null) {
                        recyclerView.cAwN510t2.add(dXrmkklc82);
                    }
                }
                m2ygzKSSR ilHKhw3Yw = filePickerActivity.ilHKhw3Yw();
                HZDtN0XJv hZDtN0XJv = HZDtN0XJv.q3BipwRCk;
                Objects.requireNonNull(HZDtN0XJv.tGV7Q6urW);
                Objects.requireNonNull(ilHKhw3Yw);
                ilHKhw3Yw.kCA6Zs9sL.clear();
                ilHKhw3Yw.kCA6Zs9sL.addAll(arrayList);
                ilHKhw3Yw.q3BipwRCk.J4Ux7ym32();
                RecyclerViewFilePicker recyclerViewFilePicker = filePickerActivity.dfpT1j18n;
                if (recyclerViewFilePicker != null) {
                    J5skaPRaY MzoOEjc4X = filePickerActivity.MzoOEjc4X();
                    if (MzoOEjc4X != null) {
                        recyclerViewFilePicker.cAwN510t2.remove(MzoOEjc4X);
                        if (recyclerViewFilePicker.IytU16YUK == MzoOEjc4X) {
                            recyclerViewFilePicker.IytU16YUK = null;
                        }
                    }
                    J5skaPRaY MzoOEjc4X2 = filePickerActivity.MzoOEjc4X();
                    if (MzoOEjc4X2 != null) {
                        recyclerViewFilePicker.cAwN510t2.add(MzoOEjc4X2);
                    }
                }
                SwipeRefreshLayout swipeRefreshLayout = filePickerActivity.cAwN510t2;
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(false);
                    return;
                }
                return;
        }
    }
}
