package con;

import com.feravolt.preload.R;
/* loaded from: classes.dex */
public final class CD5ZWmRtF implements xkFni34F4 {
    public final /* synthetic */ int q3BipwRCk;

    public CD5ZWmRtF(int i) {
        this.q3BipwRCk = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r7.equals("alac") == false) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r7.equals("wma") == false) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
        if (r7.equals("wav") == false) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (r7.equals("ogg") == false) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
        if (r7.equals("mpa") == false) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
        if (r7.equals("mp3") == false) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
        if (r7.equals("mid") == false) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
        if (r7.equals("m4a") == false) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
        if (r7.equals("m3u") == false) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
        if (r7.equals("iff") == false) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
        if (r7.equals("ape") == false) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
        if (r7.equals("aif") == false) goto L_0x009d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00be, code lost:
        if (r7.equals("ttf") == false) goto L_0x00db;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c7, code lost:
        if (r7.equals("otf") == false) goto L_0x00db;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d0, code lost:
        if (r7.equals("fon") == false) goto L_0x00db;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d9, code lost:
        if (r7.equals("fnt") == false) goto L_0x00db;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r7.equals("flac") == false) goto L_0x009d;
     */
    @Override // con.xkFni34F4
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean J4Ux7ym32(java.lang.String r7) {
        /*
            r6 = this;
            int r0 = r6.q3BipwRCk
            r1 = 1
            r2 = 6
            r3 = 2
            r4 = 0
            java.lang.String r5 = "."
            switch(r0) {
                case 0: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x00a0
        L_0x000d:
            boolean r0 = con.r6NbD4wnj.mUqPm6GBh(r7, r5, r4, r3)
            if (r0 != 0) goto L_0x0015
            goto L_0x009f
        L_0x0015:
            int r0 = con.r6NbD4wnj.juJ6pnCpu(r7, r5, r4, r4, r2)
            int r0 = r0 + r1
            java.lang.String r7 = r7.substring(r0)
            int r0 = r7.hashCode()
            switch(r0) {
                case 96574: goto L_0x0095;
                case 96790: goto L_0x008c;
                case 104169: goto L_0x0083;
                case 106447: goto L_0x007a;
                case 106458: goto L_0x0071;
                case 108104: goto L_0x0068;
                case 108272: goto L_0x005f;
                case 108318: goto L_0x0056;
                case 109967: goto L_0x004d;
                case 117484: goto L_0x0044;
                case 117835: goto L_0x003b;
                case 2996621: goto L_0x0031;
                case 3145576: goto L_0x0027;
                default: goto L_0x0025;
            }
        L_0x0025:
            goto L_0x009d
        L_0x0027:
            java.lang.String r0 = "flac"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x009e
            goto L_0x009d
        L_0x0031:
            java.lang.String r0 = "alac"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x009e
            goto L_0x009d
        L_0x003b:
            java.lang.String r0 = "wma"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x009e
            goto L_0x009d
        L_0x0044:
            java.lang.String r0 = "wav"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x009e
            goto L_0x009d
        L_0x004d:
            java.lang.String r0 = "ogg"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x009e
            goto L_0x009d
        L_0x0056:
            java.lang.String r0 = "mpa"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x009e
            goto L_0x009d
        L_0x005f:
            java.lang.String r0 = "mp3"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x009e
            goto L_0x009d
        L_0x0068:
            java.lang.String r0 = "mid"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x009e
            goto L_0x009d
        L_0x0071:
            java.lang.String r0 = "m4a"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x009e
            goto L_0x009d
        L_0x007a:
            java.lang.String r0 = "m3u"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x009e
            goto L_0x009d
        L_0x0083:
            java.lang.String r0 = "iff"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x009e
            goto L_0x009d
        L_0x008c:
            java.lang.String r0 = "ape"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x009e
            goto L_0x009d
        L_0x0095:
            java.lang.String r0 = "aif"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x009e
        L_0x009d:
            r1 = r4
        L_0x009e:
            r4 = r1
        L_0x009f:
            return r4
        L_0x00a0:
            boolean r0 = con.r6NbD4wnj.mUqPm6GBh(r7, r5, r4, r3)
            if (r0 != 0) goto L_0x00a7
            goto L_0x00dd
        L_0x00a7:
            int r0 = con.r6NbD4wnj.juJ6pnCpu(r7, r5, r4, r4, r2)
            int r0 = r0 + r1
            java.lang.String r7 = r7.substring(r0)
            int r0 = r7.hashCode()
            switch(r0) {
                case 101548: goto L_0x00d3;
                case 101573: goto L_0x00ca;
                case 110369: goto L_0x00c1;
                case 115174: goto L_0x00b8;
                default: goto L_0x00b7;
            }
        L_0x00b7:
            goto L_0x00db
        L_0x00b8:
            java.lang.String r0 = "ttf"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00dc
            goto L_0x00db
        L_0x00c1:
            java.lang.String r0 = "otf"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00dc
            goto L_0x00db
        L_0x00ca:
            java.lang.String r0 = "fon"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00dc
            goto L_0x00db
        L_0x00d3:
            java.lang.String r0 = "fnt"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L_0x00dc
        L_0x00db:
            r1 = r4
        L_0x00dc:
            r4 = r1
        L_0x00dd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: con.CD5ZWmRtF.J4Ux7ym32(java.lang.String):boolean");
    }

    @Override // con.xkFni34F4
    public int q3BipwRCk() {
        switch (this.q3BipwRCk) {
            case 0:
                return R.drawable.ic_music_file_picker;
            default:
                return R.drawable.ic_unknown_file_picker;
        }
    }
}
