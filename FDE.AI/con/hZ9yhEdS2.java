package con;

import android.view.KeyEvent;
/* loaded from: classes.dex */
public final class hZ9yhEdS2 implements EXIs5TTGP {
    public final /* synthetic */ Object J4Ux7ym32;
    public final /* synthetic */ int q3BipwRCk = 1;

    public hZ9yhEdS2(PmanMZxiM pmanMZxiM) {
        this.J4Ux7ym32 = pmanMZxiM;
    }

    public W0c4LYmdZ q3BipwRCk(KeyEvent keyEvent) {
        boolean z;
        W0c4LYmdZ w0c4LYmdZ = null;
        switch (this.q3BipwRCk) {
            case 0:
                if (((Boolean) ((PmanMZxiM) this.J4Ux7ym32).IytU16YUK(new PZAPy5kDf(keyEvent))).booleanValue() && keyEvent.isShiftPressed()) {
                    long iiGwOFFnr = WAflFGuGp.iiGwOFFnr(keyEvent);
                    e8Jl7t5e1 e8jl7t5e1 = e8Jl7t5e1.q3BipwRCk;
                    if (nghVD4tWN.q3BipwRCk(iiGwOFFnr, e8Jl7t5e1.GPLPRo6go)) {
                        return W0c4LYmdZ.REDO;
                    }
                    return null;
                } else if (((Boolean) ((PmanMZxiM) this.J4Ux7ym32).IytU16YUK(new PZAPy5kDf(keyEvent))).booleanValue()) {
                    long iiGwOFFnr2 = WAflFGuGp.iiGwOFFnr(keyEvent);
                    e8Jl7t5e1 e8jl7t5e12 = e8Jl7t5e1.q3BipwRCk;
                    if (nghVD4tWN.q3BipwRCk(iiGwOFFnr2, e8Jl7t5e1.tGV7Q6urW)) {
                        z = true;
                    } else {
                        z = nghVD4tWN.q3BipwRCk(iiGwOFFnr2, e8Jl7t5e1.ilHKhw3Yw);
                    }
                    if (z) {
                        return W0c4LYmdZ.COPY;
                    }
                    if (!nghVD4tWN.q3BipwRCk(iiGwOFFnr2, e8Jl7t5e1.kCA6Zs9sL)) {
                        if (!nghVD4tWN.q3BipwRCk(iiGwOFFnr2, e8Jl7t5e1.iiGwOFFnr)) {
                            if (nghVD4tWN.q3BipwRCk(iiGwOFFnr2, e8Jl7t5e1.J4Ux7ym32)) {
                                return W0c4LYmdZ.SELECT_ALL;
                            }
                            if (nghVD4tWN.q3BipwRCk(iiGwOFFnr2, e8Jl7t5e1.GPLPRo6go)) {
                                return W0c4LYmdZ.UNDO;
                            }
                            return null;
                        }
                        return W0c4LYmdZ.CUT;
                    }
                    return W0c4LYmdZ.PASTE;
                } else if (keyEvent.isCtrlPressed()) {
                    return null;
                } else {
                    boolean isShiftPressed = keyEvent.isShiftPressed();
                    long iiGwOFFnr3 = WAflFGuGp.iiGwOFFnr(keyEvent);
                    e8Jl7t5e1 e8jl7t5e13 = e8Jl7t5e1.q3BipwRCk;
                    if (isShiftPressed) {
                        if (nghVD4tWN.q3BipwRCk(iiGwOFFnr3, e8Jl7t5e1.yWvV4ePLl)) {
                            return W0c4LYmdZ.SELECT_LEFT_CHAR;
                        }
                        if (nghVD4tWN.q3BipwRCk(iiGwOFFnr3, e8Jl7t5e1.oon79WMrY)) {
                            return W0c4LYmdZ.SELECT_RIGHT_CHAR;
                        }
                        if (nghVD4tWN.q3BipwRCk(iiGwOFFnr3, e8Jl7t5e1.vPSbyrYWX)) {
                            return W0c4LYmdZ.SELECT_UP;
                        }
                        if (nghVD4tWN.q3BipwRCk(iiGwOFFnr3, e8Jl7t5e1.CBQ5d1kRq)) {
                            return W0c4LYmdZ.SELECT_DOWN;
                        }
                        if (nghVD4tWN.q3BipwRCk(iiGwOFFnr3, e8Jl7t5e1.kmSgne1rO)) {
                            return W0c4LYmdZ.SELECT_PAGE_UP;
                        }
                        if (nghVD4tWN.q3BipwRCk(iiGwOFFnr3, e8Jl7t5e1.Bhmn1KIah)) {
                            return W0c4LYmdZ.SELECT_PAGE_DOWN;
                        }
                        if (nghVD4tWN.q3BipwRCk(iiGwOFFnr3, e8Jl7t5e1.PSTqBLTET)) {
                            return W0c4LYmdZ.SELECT_LINE_START;
                        }
                        if (nghVD4tWN.q3BipwRCk(iiGwOFFnr3, e8Jl7t5e1.MzoOEjc4X)) {
                            return W0c4LYmdZ.SELECT_LINE_END;
                        }
                        if (!nghVD4tWN.q3BipwRCk(iiGwOFFnr3, e8Jl7t5e1.ilHKhw3Yw)) {
                            return null;
                        }
                    } else if (nghVD4tWN.q3BipwRCk(iiGwOFFnr3, e8Jl7t5e1.yWvV4ePLl)) {
                        return W0c4LYmdZ.LEFT_CHAR;
                    } else {
                        if (nghVD4tWN.q3BipwRCk(iiGwOFFnr3, e8Jl7t5e1.oon79WMrY)) {
                            return W0c4LYmdZ.RIGHT_CHAR;
                        }
                        if (nghVD4tWN.q3BipwRCk(iiGwOFFnr3, e8Jl7t5e1.vPSbyrYWX)) {
                            return W0c4LYmdZ.UP;
                        }
                        if (nghVD4tWN.q3BipwRCk(iiGwOFFnr3, e8Jl7t5e1.CBQ5d1kRq)) {
                            return W0c4LYmdZ.DOWN;
                        }
                        if (nghVD4tWN.q3BipwRCk(iiGwOFFnr3, e8Jl7t5e1.kmSgne1rO)) {
                            return W0c4LYmdZ.PAGE_UP;
                        }
                        if (nghVD4tWN.q3BipwRCk(iiGwOFFnr3, e8Jl7t5e1.Bhmn1KIah)) {
                            return W0c4LYmdZ.PAGE_DOWN;
                        }
                        if (nghVD4tWN.q3BipwRCk(iiGwOFFnr3, e8Jl7t5e1.PSTqBLTET)) {
                            return W0c4LYmdZ.LINE_START;
                        }
                        if (nghVD4tWN.q3BipwRCk(iiGwOFFnr3, e8Jl7t5e1.MzoOEjc4X)) {
                            return W0c4LYmdZ.LINE_END;
                        }
                        if (nghVD4tWN.q3BipwRCk(iiGwOFFnr3, e8Jl7t5e1.qVUwofr5s)) {
                            return W0c4LYmdZ.NEW_LINE;
                        }
                        if (nghVD4tWN.q3BipwRCk(iiGwOFFnr3, e8Jl7t5e1.Eeka1udhb)) {
                            return W0c4LYmdZ.DELETE_PREV_CHAR;
                        }
                        if (nghVD4tWN.q3BipwRCk(iiGwOFFnr3, e8Jl7t5e1.dXrmkklc8)) {
                            return W0c4LYmdZ.DELETE_NEXT_CHAR;
                        }
                        if (!nghVD4tWN.q3BipwRCk(iiGwOFFnr3, e8Jl7t5e1.RG6kpfv3v)) {
                            if (!nghVD4tWN.q3BipwRCk(iiGwOFFnr3, e8Jl7t5e1.ixWaw2akD)) {
                                if (nghVD4tWN.q3BipwRCk(iiGwOFFnr3, e8Jl7t5e1.sk5s77z6Q)) {
                                    return W0c4LYmdZ.TAB;
                                }
                                return null;
                            }
                            return W0c4LYmdZ.CUT;
                        }
                    }
                    return W0c4LYmdZ.PASTE;
                }
            default:
                if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                    long iiGwOFFnr4 = WAflFGuGp.iiGwOFFnr(keyEvent);
                    e8Jl7t5e1 e8jl7t5e14 = e8Jl7t5e1.q3BipwRCk;
                    if (nghVD4tWN.q3BipwRCk(iiGwOFFnr4, e8Jl7t5e1.yWvV4ePLl)) {
                        w0c4LYmdZ = W0c4LYmdZ.SELECT_LEFT_WORD;
                    } else if (nghVD4tWN.q3BipwRCk(iiGwOFFnr4, e8Jl7t5e1.oon79WMrY)) {
                        w0c4LYmdZ = W0c4LYmdZ.SELECT_RIGHT_WORD;
                    } else if (nghVD4tWN.q3BipwRCk(iiGwOFFnr4, e8Jl7t5e1.vPSbyrYWX)) {
                        w0c4LYmdZ = W0c4LYmdZ.SELECT_PREV_PARAGRAPH;
                    } else if (nghVD4tWN.q3BipwRCk(iiGwOFFnr4, e8Jl7t5e1.CBQ5d1kRq)) {
                        w0c4LYmdZ = W0c4LYmdZ.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (keyEvent.isCtrlPressed()) {
                    long iiGwOFFnr5 = WAflFGuGp.iiGwOFFnr(keyEvent);
                    e8Jl7t5e1 e8jl7t5e15 = e8Jl7t5e1.q3BipwRCk;
                    if (nghVD4tWN.q3BipwRCk(iiGwOFFnr5, e8Jl7t5e1.yWvV4ePLl)) {
                        w0c4LYmdZ = W0c4LYmdZ.LEFT_WORD;
                    } else if (nghVD4tWN.q3BipwRCk(iiGwOFFnr5, e8Jl7t5e1.oon79WMrY)) {
                        w0c4LYmdZ = W0c4LYmdZ.RIGHT_WORD;
                    } else if (nghVD4tWN.q3BipwRCk(iiGwOFFnr5, e8Jl7t5e1.vPSbyrYWX)) {
                        w0c4LYmdZ = W0c4LYmdZ.PREV_PARAGRAPH;
                    } else if (nghVD4tWN.q3BipwRCk(iiGwOFFnr5, e8Jl7t5e1.CBQ5d1kRq)) {
                        w0c4LYmdZ = W0c4LYmdZ.NEXT_PARAGRAPH;
                    } else if (nghVD4tWN.q3BipwRCk(iiGwOFFnr5, e8Jl7t5e1.dIocxURUo)) {
                        w0c4LYmdZ = W0c4LYmdZ.DELETE_PREV_CHAR;
                    } else if (nghVD4tWN.q3BipwRCk(iiGwOFFnr5, e8Jl7t5e1.dXrmkklc8)) {
                        w0c4LYmdZ = W0c4LYmdZ.DELETE_NEXT_WORD;
                    } else if (nghVD4tWN.q3BipwRCk(iiGwOFFnr5, e8Jl7t5e1.Eeka1udhb)) {
                        w0c4LYmdZ = W0c4LYmdZ.DELETE_PREV_WORD;
                    } else if (nghVD4tWN.q3BipwRCk(iiGwOFFnr5, e8Jl7t5e1.Puu3Rhg4F)) {
                        w0c4LYmdZ = W0c4LYmdZ.DESELECT;
                    }
                } else if (keyEvent.isShiftPressed()) {
                    long iiGwOFFnr6 = WAflFGuGp.iiGwOFFnr(keyEvent);
                    e8Jl7t5e1 e8jl7t5e16 = e8Jl7t5e1.q3BipwRCk;
                    if (nghVD4tWN.q3BipwRCk(iiGwOFFnr6, e8Jl7t5e1.PSTqBLTET)) {
                        w0c4LYmdZ = W0c4LYmdZ.SELECT_HOME;
                    } else if (nghVD4tWN.q3BipwRCk(iiGwOFFnr6, e8Jl7t5e1.MzoOEjc4X)) {
                        w0c4LYmdZ = W0c4LYmdZ.SELECT_END;
                    }
                }
                return w0c4LYmdZ == null ? ((hZ9yhEdS2) ((EXIs5TTGP) this.J4Ux7ym32)).q3BipwRCk(keyEvent) : w0c4LYmdZ;
        }
    }

    public hZ9yhEdS2(EXIs5TTGP eXIs5TTGP) {
        this.J4Ux7ym32 = eXIs5TTGP;
    }
}
