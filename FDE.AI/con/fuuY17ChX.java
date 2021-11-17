package con;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import com.feravolt.preload.R;
import java.io.File;
import java.util.Objects;
import me.rosuh.filepicker.FilePickerActivity;
/* loaded from: classes.dex */
public final class fuuY17ChX extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ J5skaPRaY q3BipwRCk;

    public fuuY17ChX(J5skaPRaY j5skaPRaY) {
        this.q3BipwRCk = j5skaPRaY;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        mSiW1fbBz vPSbyrYWX;
        View IytU16YUK = this.q3BipwRCk.q3BipwRCk.IytU16YUK(motionEvent.getX(), motionEvent.getY());
        if (IytU16YUK != null && IytU16YUK.getId() == R.id.item_list_file_picker) {
            J5skaPRaY j5skaPRaY = this.q3BipwRCk;
            msTbxirqH mstbxirqh = j5skaPRaY.J4Ux7ym32;
            RecyclerView.s7MlVynBG adapter = j5skaPRaY.q3BipwRCk.getAdapter();
            int i0Zug1mVk = this.q3BipwRCk.q3BipwRCk.i0Zug1mVk(IytU16YUK);
            FilePickerActivity filePickerActivity = (FilePickerActivity) mstbxirqh;
            Objects.requireNonNull(filePickerActivity);
            if (IytU16YUK.getId() == R.id.item_list_file_picker && (vPSbyrYWX = ((m2ygzKSSR) adapter).Puu3Rhg4F(i0Zug1mVk)) != null) {
                HZDtN0XJv hZDtN0XJv = HZDtN0XJv.q3BipwRCk;
                Objects.requireNonNull(HZDtN0XJv.tGV7Q6urW);
                File file = new File(vPSbyrYWX.J4Ux7ym32);
                ey4Vf0Eiu ey4vf0eiu = HZDtN0XJv.tGV7Q6urW;
                Objects.requireNonNull(ey4vf0eiu);
                boolean z = ey4vf0eiu.tGV7Q6urW;
                if (file.exists() && file.isDirectory() && z) {
                    return;
                }
                if (!vPSbyrYWX.kCA6Zs9sL || !filePickerActivity.RG6kpfv3v().tGV7Q6urW) {
                    Objects.requireNonNull(filePickerActivity.RG6kpfv3v());
                    m2ygzKSSR ilHKhw3Yw = filePickerActivity.ilHKhw3Yw();
                    if (vPSbyrYWX.tGV7Q6urW) {
                        ilHKhw3Yw.CBQ5d1kRq(i0Zug1mVk);
                    } else if (filePickerActivity.sk5s77z6Q()) {
                        mSiW1fbBz vPSbyrYWX2 = ilHKhw3Yw.Puu3Rhg4F(i0Zug1mVk);
                        if (vPSbyrYWX2 != null) {
                            vPSbyrYWX2.tGV7Q6urW = true;
                            ilHKhw3Yw.q3BipwRCk.tGV7Q6urW(i0Zug1mVk, 1, Boolean.TRUE);
                        }
                    } else {
                        Toast.makeText(filePickerActivity.getApplicationContext(), filePickerActivity.getString(filePickerActivity.RG6kpfv3v().Bhmn1KIah, new Object[]{Integer.valueOf(filePickerActivity.V9LQMKGJe)}), 0).show();
                    }
                    Objects.requireNonNull(HZDtN0XJv.tGV7Q6urW);
                    return;
                }
                filePickerActivity.PSTqBLTET(vPSbyrYWX);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006b, code lost:
        if (r8 == null) goto L_0x00d8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
        r2.PSTqBLTET(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:
        if (r2.RG6kpfv3v().tGV7Q6urW != false) goto L_0x006e;
     */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean onSingleTapUp(android.view.MotionEvent r8) {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: con.fuuY17ChX.onSingleTapUp(android.view.MotionEvent):boolean");
    }
}
