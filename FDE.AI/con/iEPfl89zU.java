package con;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* loaded from: classes.dex */
public final class iEPfl89zU implements WTHxT206Z {
    public final ClipboardManager q3BipwRCk;

    public iEPfl89zU(Context context) {
        Object systemService = context.getSystemService("clipboard");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.q3BipwRCk = (ClipboardManager) systemService;
    }

    public final boolean J4Ux7ym32() {
        ClipDescription primaryClipDescription = this.q3BipwRCk.getPrimaryClipDescription();
        if (primaryClipDescription == null) {
            return false;
        }
        return primaryClipDescription.hasMimeType("text/plain");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public joIJ4ANvK q3BipwRCk() {
        CharSequence text;
        m0AevvDOv m0aevvdov = null;
        if (!this.q3BipwRCk.hasPrimaryClip() || (text = this.q3BipwRCk.getPrimaryClip().getItemAt(0).getText()) == null) {
            return null;
        }
        if (!(text instanceof Spanned)) {
            return new joIJ4ANvK(text.toString(), (List) null, (List) null, 6);
        }
        Spanned spanned = (Spanned) text;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, text.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int length = annotationArr.length - 1;
        byte b = 4;
        if (length >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Annotation annotation = annotationArr[i];
                if (anXlDk6fV.tGV7Q6urW(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    int spanStart = spanned.getSpanStart(annotation);
                    int spanEnd = spanned.getSpanEnd(annotation);
                    LC23knMGo lC23knMGo = new LC23knMGo(annotation.getValue());
                    JhpbRXxsg jhpbRXxsg = bO2dbmrf7.J4Ux7ym32;
                    long j = bO2dbmrf7.Puu3Rhg4F;
                    rstHZ5Gu8 rsthz5gu8 = QnjhYJNrZ.J4Ux7ym32;
                    long j2 = QnjhYJNrZ.dIocxURUo;
                    m0AevvDOv m0aevvdov2 = m0aevvdov;
                    JI2JIz7iN jI2JIz7iN = m0aevvdov2;
                    Z7oCchjRS z7oCchjRS = jI2JIz7iN;
                    String str = z7oCchjRS;
                    SLFBujE8J sLFBujE8J = str;
                    dMGlVaFwN dmglvafwn = sLFBujE8J;
                    hrmqyyOPt hrmqyyopt = dmglvafwn;
                    lDSGv8N6A ldsgv8n6a = hrmqyyopt;
                    long j3 = j;
                    long j4 = j3;
                    long j5 = j2;
                    while (true) {
                        int i3 = 1;
                        if (lC23knMGo.q3BipwRCk.dataAvail() <= 1) {
                            break;
                        }
                        byte J4Ux7ym32 = lC23knMGo.J4Ux7ym32();
                        if (J4Ux7ym32 == 1) {
                            if (lC23knMGo.q3BipwRCk() < 8) {
                                break;
                            }
                            j3 = lC23knMGo.tGV7Q6urW();
                        } else if (J4Ux7ym32 == 2) {
                            if (lC23knMGo.q3BipwRCk() < 5) {
                                break;
                            }
                            j2 = lC23knMGo.kCA6Zs9sL();
                            jI2JIz7iN = jI2JIz7iN;
                            str = str;
                            ldsgv8n6a = ldsgv8n6a;
                            b = 4;
                        } else if (J4Ux7ym32 == 3) {
                            if (lC23knMGo.q3BipwRCk() < b) {
                                break;
                            }
                            m0aevvdov2 = new m0AevvDOv(lC23knMGo.q3BipwRCk.readInt());
                            jI2JIz7iN = jI2JIz7iN;
                            str = str;
                            ldsgv8n6a = ldsgv8n6a;
                            b = 4;
                        } else if (J4Ux7ym32 == b) {
                            if (lC23knMGo.q3BipwRCk() < 1) {
                                break;
                            }
                            byte J4Ux7ym322 = lC23knMGo.J4Ux7ym32();
                            if (J4Ux7ym322 == 0 || J4Ux7ym322 != 1) {
                                i3 = 0;
                            }
                            jI2JIz7iN = new JI2JIz7iN(i3);
                            str = str;
                            ldsgv8n6a = ldsgv8n6a;
                            b = 4;
                        } else if (J4Ux7ym32 == 5) {
                            if (lC23knMGo.q3BipwRCk() < 1) {
                                break;
                            }
                            byte J4Ux7ym323 = lC23knMGo.J4Ux7ym32();
                            if (J4Ux7ym323 != 0) {
                                if (J4Ux7ym323 == 1) {
                                    oWhsE8IPp owhse8ipp = Z7oCchjRS.J4Ux7ym32;
                                    oWhsE8IPp owhse8ipp2 = Z7oCchjRS.J4Ux7ym32;
                                } else if (J4Ux7ym323 == 3) {
                                    oWhsE8IPp owhse8ipp3 = Z7oCchjRS.J4Ux7ym32;
                                    oWhsE8IPp owhse8ipp4 = Z7oCchjRS.J4Ux7ym32;
                                    i3 = 3;
                                } else if (J4Ux7ym323 == 2) {
                                    oWhsE8IPp owhse8ipp5 = Z7oCchjRS.J4Ux7ym32;
                                    oWhsE8IPp owhse8ipp6 = Z7oCchjRS.J4Ux7ym32;
                                    i3 = 2;
                                }
                                z7oCchjRS = new Z7oCchjRS(i3);
                                jI2JIz7iN = jI2JIz7iN;
                                str = str;
                                ldsgv8n6a = ldsgv8n6a;
                                b = 4;
                            }
                            oWhsE8IPp owhse8ipp7 = Z7oCchjRS.J4Ux7ym32;
                            oWhsE8IPp owhse8ipp8 = Z7oCchjRS.J4Ux7ym32;
                            i3 = 0;
                            z7oCchjRS = new Z7oCchjRS(i3);
                            jI2JIz7iN = jI2JIz7iN;
                            str = str;
                            ldsgv8n6a = ldsgv8n6a;
                            b = 4;
                        } else {
                            if (J4Ux7ym32 != 6) {
                                if (J4Ux7ym32 != 7) {
                                    if (J4Ux7ym32 != 8) {
                                        if (J4Ux7ym32 != 9) {
                                            if (J4Ux7ym32 != 10) {
                                                if (J4Ux7ym32 == 11) {
                                                    if (lC23knMGo.q3BipwRCk() < b) {
                                                        break;
                                                    }
                                                    int readInt = lC23knMGo.q3BipwRCk.readInt();
                                                    hrmqyyOPt hrmqyyopt2 = hrmqyyOPt.dIocxURUo;
                                                    boolean z = (readInt & 2) != 0;
                                                    hrmqyyOPt hrmqyyopt3 = hrmqyyOPt.tGV7Q6urW;
                                                    boolean z2 = (readInt & 1) != 0;
                                                    if (z && z2) {
                                                        List ixWaw2akD = idpM54xlp.ixWaw2akD(hrmqyyopt2, hrmqyyopt3);
                                                        Integer num = 0;
                                                        int size = ixWaw2akD.size() - 1;
                                                        if (size >= 0) {
                                                            int i4 = 0;
                                                            while (true) {
                                                                int i5 = i4 + 1;
                                                                num = Integer.valueOf(num.intValue() | ((hrmqyyOPt) ixWaw2akD.get(i4)).q3BipwRCk);
                                                                if (i5 > size) {
                                                                    break;
                                                                }
                                                                i4 = i5;
                                                            }
                                                        }
                                                        hrmqyyopt = new hrmqyyOPt(num.intValue());
                                                        jI2JIz7iN = jI2JIz7iN;
                                                        str = str;
                                                        ldsgv8n6a = ldsgv8n6a;
                                                    } else if (z) {
                                                        hrmqyyopt = hrmqyyopt2;
                                                        jI2JIz7iN = jI2JIz7iN;
                                                        str = str;
                                                        ldsgv8n6a = ldsgv8n6a;
                                                    } else if (z2) {
                                                        hrmqyyopt = hrmqyyopt3;
                                                        jI2JIz7iN = jI2JIz7iN;
                                                        str = str;
                                                        ldsgv8n6a = ldsgv8n6a;
                                                    } else {
                                                        hrmqyyopt = hrmqyyOPt.J4Ux7ym32;
                                                        jI2JIz7iN = jI2JIz7iN;
                                                        str = str;
                                                        ldsgv8n6a = ldsgv8n6a;
                                                    }
                                                } else {
                                                    jI2JIz7iN = jI2JIz7iN;
                                                    str = str;
                                                    ldsgv8n6a = ldsgv8n6a;
                                                    if (J4Ux7ym32 == 12) {
                                                        if (lC23knMGo.q3BipwRCk() < 20) {
                                                            break;
                                                        }
                                                        jI2JIz7iN = jI2JIz7iN;
                                                        str = str;
                                                        ldsgv8n6a = new lDSGv8N6A(lC23knMGo.tGV7Q6urW(), ODug2UCW1.dIocxURUo(lC23knMGo.dIocxURUo(), lC23knMGo.dIocxURUo()), lC23knMGo.dIocxURUo(), (dnBSj5uJN) null);
                                                    }
                                                }
                                            } else if (lC23knMGo.q3BipwRCk() < 8) {
                                                break;
                                            } else {
                                                j4 = lC23knMGo.tGV7Q6urW();
                                                dmglvafwn = dmglvafwn;
                                            }
                                        } else if (lC23knMGo.q3BipwRCk() < 8) {
                                            break;
                                        } else {
                                            dmglvafwn = new dMGlVaFwN(lC23knMGo.dIocxURUo(), lC23knMGo.dIocxURUo());
                                        }
                                    } else if (lC23knMGo.q3BipwRCk() < b) {
                                        break;
                                    } else {
                                        sLFBujE8J = new SLFBujE8J(lC23knMGo.dIocxURUo());
                                        dmglvafwn = dmglvafwn;
                                    }
                                } else if (lC23knMGo.q3BipwRCk() < 5) {
                                    break;
                                } else {
                                    j5 = lC23knMGo.kCA6Zs9sL();
                                    jI2JIz7iN = jI2JIz7iN;
                                    str = str;
                                    ldsgv8n6a = ldsgv8n6a;
                                }
                            } else {
                                jI2JIz7iN = jI2JIz7iN;
                                str = lC23knMGo.q3BipwRCk.readString();
                                ldsgv8n6a = ldsgv8n6a;
                            }
                            b = 4;
                        }
                    }
                    arrayList.add(new lzuuVzcu0(new dBWPON5YR(j3, j2, m0aevvdov2, jI2JIz7iN, z7oCchjRS, (Vyo35YgKP) null, str, j5, sLFBujE8J, dmglvafwn, (Z6wpHNDNp) null, j4, hrmqyyopt, ldsgv8n6a, (dnBSj5uJN) null), spanStart, spanEnd, ""));
                }
                if (i == length) {
                    break;
                }
                i = i2;
                m0aevvdov = null;
                b = 4;
            }
        }
        return new joIJ4ANvK(text.toString(), arrayList, (List) null, 4);
    }

    public void tGV7Q6urW(joIJ4ANvK joij4anvk) {
        CharSequence charSequence;
        long j;
        long j2;
        byte b;
        ClipboardManager clipboardManager = this.q3BipwRCk;
        if (joij4anvk.kmSgne1rO.isEmpty()) {
            charSequence = joij4anvk.CBQ5d1kRq;
        } else {
            SpannableString spannableString = new SpannableString(joij4anvk.CBQ5d1kRq);
            LC23knMGo lC23knMGo = new LC23knMGo();
            List list = joij4anvk.kmSgne1rO;
            int size = list.size() - 1;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    lzuuVzcu0 lzuuvzcu0 = (lzuuVzcu0) list.get(i);
                    dBWPON5YR dbwpon5yr = (dBWPON5YR) lzuuvzcu0.q3BipwRCk;
                    int i3 = lzuuvzcu0.J4Ux7ym32;
                    int i4 = lzuuvzcu0.tGV7Q6urW;
                    lC23knMGo.q3BipwRCk.recycle();
                    lC23knMGo.q3BipwRCk = Parcel.obtain();
                    long j3 = dbwpon5yr.q3BipwRCk;
                    JhpbRXxsg jhpbRXxsg = bO2dbmrf7.J4Ux7ym32;
                    long j4 = bO2dbmrf7.Puu3Rhg4F;
                    if (!bO2dbmrf7.tGV7Q6urW(j3, j4)) {
                        lC23knMGo.q3BipwRCk.writeByte((byte) 1);
                        j = j4;
                        lC23knMGo.q3BipwRCk.writeLong(dbwpon5yr.q3BipwRCk);
                    } else {
                        j = j4;
                    }
                    long j5 = dbwpon5yr.J4Ux7ym32;
                    rstHZ5Gu8 rsthz5gu8 = QnjhYJNrZ.J4Ux7ym32;
                    long j6 = QnjhYJNrZ.dIocxURUo;
                    if (!QnjhYJNrZ.q3BipwRCk(j5, j6)) {
                        lC23knMGo.q3BipwRCk.writeByte((byte) 2);
                        j2 = j6;
                        lC23knMGo.iiGwOFFnr(dbwpon5yr.J4Ux7ym32);
                    } else {
                        j2 = j6;
                    }
                    m0AevvDOv m0aevvdov = dbwpon5yr.tGV7Q6urW;
                    if (m0aevvdov != null) {
                        lC23knMGo.q3BipwRCk.writeByte((byte) 3);
                        lC23knMGo.q3BipwRCk.writeInt(m0aevvdov.CBQ5d1kRq);
                    }
                    JI2JIz7iN jI2JIz7iN = dbwpon5yr.dIocxURUo;
                    if (jI2JIz7iN != null) {
                        int i5 = jI2JIz7iN.q3BipwRCk;
                        lC23knMGo.q3BipwRCk.writeByte((byte) 4);
                        lC23knMGo.q3BipwRCk.writeByte((!JI2JIz7iN.q3BipwRCk(i5, 0) && JI2JIz7iN.q3BipwRCk(i5, 1)) ? (byte) 1 : 0);
                    }
                    Z7oCchjRS z7oCchjRS = dbwpon5yr.kCA6Zs9sL;
                    if (z7oCchjRS != null) {
                        int i6 = z7oCchjRS.q3BipwRCk;
                        lC23knMGo.q3BipwRCk.writeByte((byte) 5);
                        oWhsE8IPp owhse8ipp = Z7oCchjRS.J4Ux7ym32;
                        oWhsE8IPp owhse8ipp2 = Z7oCchjRS.J4Ux7ym32;
                        if (!Z7oCchjRS.q3BipwRCk(i6, 0)) {
                            b = 1;
                            if (!Z7oCchjRS.q3BipwRCk(i6, 1)) {
                                b = 2;
                                if (!Z7oCchjRS.q3BipwRCk(i6, 2)) {
                                    if (Z7oCchjRS.q3BipwRCk(i6, 3)) {
                                        b = 3;
                                    }
                                }
                            }
                            lC23knMGo.q3BipwRCk.writeByte(b);
                        }
                        b = 0;
                        lC23knMGo.q3BipwRCk.writeByte(b);
                    }
                    String str = dbwpon5yr.GPLPRo6go;
                    if (str != null) {
                        lC23knMGo.q3BipwRCk.writeByte((byte) 6);
                        lC23knMGo.q3BipwRCk.writeString(str);
                    }
                    if (!QnjhYJNrZ.q3BipwRCk(dbwpon5yr.Puu3Rhg4F, j2)) {
                        lC23knMGo.q3BipwRCk.writeByte((byte) 7);
                        lC23knMGo.iiGwOFFnr(dbwpon5yr.Puu3Rhg4F);
                    }
                    SLFBujE8J sLFBujE8J = dbwpon5yr.yWvV4ePLl;
                    if (sLFBujE8J != null) {
                        float f = sLFBujE8J.q3BipwRCk;
                        lC23knMGo.q3BipwRCk.writeByte((byte) 8);
                        lC23knMGo.q3BipwRCk.writeFloat(f);
                    }
                    dMGlVaFwN dmglvafwn = dbwpon5yr.oon79WMrY;
                    if (dmglvafwn != null) {
                        lC23knMGo.q3BipwRCk.writeByte((byte) 9);
                        lC23knMGo.q3BipwRCk.writeFloat(dmglvafwn.q3BipwRCk);
                        lC23knMGo.q3BipwRCk.writeFloat(dmglvafwn.J4Ux7ym32);
                    }
                    if (!bO2dbmrf7.tGV7Q6urW(dbwpon5yr.CBQ5d1kRq, j)) {
                        lC23knMGo.q3BipwRCk.writeByte((byte) 10);
                        lC23knMGo.q3BipwRCk.writeLong(dbwpon5yr.CBQ5d1kRq);
                    }
                    hrmqyyOPt hrmqyyopt = dbwpon5yr.kmSgne1rO;
                    if (hrmqyyopt != null) {
                        lC23knMGo.q3BipwRCk.writeByte((byte) 11);
                        lC23knMGo.q3BipwRCk.writeInt(hrmqyyopt.q3BipwRCk);
                    }
                    lDSGv8N6A ldsgv8n6a = dbwpon5yr.Bhmn1KIah;
                    if (ldsgv8n6a != null) {
                        lC23knMGo.q3BipwRCk.writeByte((byte) 12);
                        lC23knMGo.q3BipwRCk.writeLong(ldsgv8n6a.q3BipwRCk);
                        lC23knMGo.q3BipwRCk.writeFloat(bRgfgYIQX.tGV7Q6urW(ldsgv8n6a.J4Ux7ym32));
                        lC23knMGo.q3BipwRCk.writeFloat(bRgfgYIQX.dIocxURUo(ldsgv8n6a.J4Ux7ym32));
                        lC23knMGo.q3BipwRCk.writeFloat(ldsgv8n6a.tGV7Q6urW);
                    }
                    spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(lC23knMGo.q3BipwRCk.marshall(), 0)), i3, i4, 33);
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                }
            }
            charSequence = spannableString;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("plain text", charSequence));
    }
}
