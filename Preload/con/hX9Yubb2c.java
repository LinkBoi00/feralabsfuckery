package con;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
/* loaded from: classes.dex */
public final class hX9Yubb2c extends Wk9bO57s4 implements kkcQgCx5G {
    public final /* synthetic */ boolean Bhmn1KIah;
    public final /* synthetic */ List kmSgne1rO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hX9Yubb2c(List list, boolean z) {
        super(2);
        this.kmSgne1rO = list;
        this.Bhmn1KIah = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // con.kkcQgCx5G
    /* Code decompiled incorrectly, please refer to instructions dump */
    public Object WaUP0CF08(Object obj, Object obj2) {
        n4f84B5OG n4f84b5og;
        Object obj3;
        Object obj4;
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Number) obj2).intValue();
        List list = this.kmSgne1rO;
        boolean z = this.Bhmn1KIah;
        if (z || list.size() != 1) {
            if (intValue < 0) {
                intValue = 0;
            }
            G8ebKyy85 g8ebKyy85 = new G8ebKyy85(intValue, charSequence.length());
            if (charSequence instanceof String) {
                int i = g8ebKyy85.kmSgne1rO;
                int i2 = g8ebKyy85.Bhmn1KIah;
                if (i2 < 0 ? intValue >= i : intValue <= i) {
                    while (true) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it.next();
                            String str = (String) obj4;
                            if (r6NbD4wnj.QSbMsHU5X(str, 0, (String) charSequence, intValue, str.length(), z)) {
                                break;
                            }
                        }
                        String str2 = (String) obj4;
                        if (str2 == null) {
                            if (intValue == i) {
                                break;
                            }
                            intValue += i2;
                        } else {
                            n4f84b5og = new n4f84B5OG(Integer.valueOf(intValue), str2);
                            break;
                        }
                    }
                    if (n4f84b5og == null) {
                        return new n4f84B5OG(n4f84b5og.CBQ5d1kRq, Integer.valueOf(((String) n4f84b5og.kmSgne1rO).length()));
                    }
                    return null;
                }
                n4f84b5og = null;
                if (n4f84b5og == null) {
                }
            } else {
                int i3 = g8ebKyy85.kmSgne1rO;
                int i4 = g8ebKyy85.Bhmn1KIah;
                if (i4 < 0 ? intValue >= i3 : intValue <= i3) {
                    while (true) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj3 = null;
                                break;
                            }
                            obj3 = it2.next();
                            String str3 = (String) obj3;
                            if (r6NbD4wnj.L4EwGfXiQ(str3, 0, charSequence, intValue, str3.length(), z)) {
                                break;
                            }
                        }
                        String str4 = (String) obj3;
                        if (str4 == null) {
                            if (intValue == i3) {
                                break;
                            }
                            intValue += i4;
                        } else {
                            n4f84b5og = new n4f84B5OG(Integer.valueOf(intValue), str4);
                            break;
                        }
                    }
                    if (n4f84b5og == null) {
                    }
                }
                n4f84b5og = null;
                if (n4f84b5og == null) {
                }
            }
        } else {
            int size = list.size();
            if (size == 0) {
                throw new NoSuchElementException("List is empty.");
            } else if (size == 1) {
                String str5 = (String) list.get(0);
                int igRQEZxnW = r6NbD4wnj.igRQEZxnW(charSequence, str5, intValue, false, 4);
                if (igRQEZxnW >= 0) {
                    n4f84b5og = new n4f84B5OG(Integer.valueOf(igRQEZxnW), str5);
                    if (n4f84b5og == null) {
                    }
                }
                n4f84b5og = null;
                if (n4f84b5og == null) {
                }
            } else {
                throw new IllegalArgumentException("List has more than one element.");
            }
        }
    }
}
