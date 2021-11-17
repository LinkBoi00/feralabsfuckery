package con;
/* loaded from: classes.dex */
public class RaIMOooIW implements PkoWOcmqg {
    public static final RaIMOooIW q3BipwRCk = new RaIMOooIW();

    @Override // con.PkoWOcmqg
    public int q3BipwRCk(CharSequence charSequence, int i, int i2) {
        int i3 = i2 + i;
        int i4 = 2;
        while (i < i3 && i4 == 2) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i));
            jHwJ5gMKj jhwj5gmkj = PkFf5koay.q3BipwRCk;
            if (directionality != 0) {
                if (!(directionality == 1 || directionality == 2)) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i4 = 2;
                            break;
                    }
                    i++;
                }
                i4 = 0;
                i++;
            }
            i4 = 1;
            i++;
        }
        return i4;
    }
}
