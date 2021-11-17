package con;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.feravolt.preload.MainActivity;
@jHNqfwCVd(c = "com.feravolt.preload.MainActivity$AppList$1$2$1", f = "MainActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class eYj6GSkqH extends dnd1L2J2K implements kkcQgCx5G {
    public final /* synthetic */ RNEcgN6dQ Eeka1udhb;
    public final /* synthetic */ PmYqqGuHi MzoOEjc4X;
    public final /* synthetic */ PackageManager ilHKhw3Yw;
    public final /* synthetic */ fhHgxp0FC qVUwofr5s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eYj6GSkqH(PmYqqGuHi pmYqqGuHi, PackageManager packageManager, fhHgxp0FC fhhgxp0fc, RNEcgN6dQ rNEcgN6dQ, Way959ade way959ade) {
        super(2, way959ade);
        this.MzoOEjc4X = pmYqqGuHi;
        this.ilHKhw3Yw = packageManager;
        this.qVUwofr5s = fhhgxp0fc;
        this.Eeka1udhb = rNEcgN6dQ;
    }

    @Override // con.kkcQgCx5G
    public Object WaUP0CF08(Object obj, Object obj2) {
        oQkvjGXIr oqkvjgxir = (oQkvjGXIr) obj;
        eYj6GSkqH eyj6gskqh = new eYj6GSkqH(this.MzoOEjc4X, this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, (Way959ade) obj2);
        qih4lW99W qih4lw99w = qih4lW99W.q3BipwRCk;
        eyj6gskqh.yWvV4ePLl(qih4lw99w);
        return qih4lw99w;
    }

    @Override // con.LxklW3zxE
    public final Way959ade dIocxURUo(Object obj, Way959ade way959ade) {
        return new eYj6GSkqH(this.MzoOEjc4X, this.ilHKhw3Yw, this.qVUwofr5s, this.Eeka1udhb, way959ade);
    }

    @Override // con.LxklW3zxE
    public final Object yWvV4ePLl(Object obj) {
        Bitmap bitmap;
        anXlDk6fV.IytU16YUK(obj);
        YuSxiExwK yuSxiExwK = tzR8IMGfw.q3BipwRCk;
        int i = (int) (((float) 48) * Resources.getSystem().getDisplayMetrics().density);
        PmYqqGuHi pmYqqGuHi = this.MzoOEjc4X;
        PackageManager packageManager = this.ilHKhw3Yw;
        jYiAS31u7 jyias31u7 = new jYiAS31u7(new CqYXp4s4a(pmYqqGuHi, new PSEid1kjm(packageManager)), true, sB6aaIC3E.kmSgne1rO);
        fhHgxp0FC fhhgxp0fc = this.qVUwofr5s;
        bVQrjM4Xx bvqrjm4xx = new bVQrjM4Xx(jyias31u7);
        while (bvqrjm4xx.hasNext()) {
            ApplicationInfo applicationInfo = (ApplicationInfo) bvqrjm4xx.next();
            Drawable loadUnbadgedIcon = applicationInfo.loadUnbadgedIcon(packageManager);
            if (loadUnbadgedIcon instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) loadUnbadgedIcon;
                bitmap = (i == bitmapDrawable.getBitmap().getWidth() && i == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i, i, true);
            } else {
                Rect bounds = loadUnbadgedIcon.getBounds();
                int i2 = bounds.left;
                int i3 = bounds.top;
                int i4 = bounds.right;
                int i5 = bounds.bottom;
                Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
                loadUnbadgedIcon.setBounds(0, 0, i, i);
                loadUnbadgedIcon.draw(new Canvas(createBitmap));
                loadUnbadgedIcon.setBounds(i2, i3, i4, i5);
                bitmap = createBitmap;
            }
            fhhgxp0fc.add(new attbzuWdD(new tNgdvtcFW(bitmap), (String) applicationInfo.loadLabel(packageManager), applicationInfo.packageName));
        }
        RNEcgN6dQ rNEcgN6dQ = this.Eeka1udhb;
        int i6 = MainActivity.mUqPm6GBh;
        ((prCJwNx2x) rNEcgN6dQ).CBQ5d1kRq(Boolean.FALSE);
        return qih4lW99W.q3BipwRCk;
    }
}
