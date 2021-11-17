package con;

import java.util.List;
import java.util.ListIterator;
/* loaded from: classes.dex */
public final class B1wmCLZSG implements ListIterator, f7VKpcPHS {
    public final List CBQ5d1kRq;
    public int kmSgne1rO;

    public B1wmCLZSG(List list, int i) {
        this.CBQ5d1kRq = list;
        this.kmSgne1rO = i;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        this.CBQ5d1kRq.add(this.kmSgne1rO, obj);
        this.kmSgne1rO++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.kmSgne1rO < this.CBQ5d1kRq.size();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.kmSgne1rO > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        List list = this.CBQ5d1kRq;
        int i = this.kmSgne1rO;
        this.kmSgne1rO = i + 1;
        return list.get(i);
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.kmSgne1rO;
    }

    @Override // java.util.ListIterator
    public Object previous() {
        int i = this.kmSgne1rO - 1;
        this.kmSgne1rO = i;
        return this.CBQ5d1kRq.get(i);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.kmSgne1rO - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        int i = this.kmSgne1rO - 1;
        this.kmSgne1rO = i;
        this.CBQ5d1kRq.remove(i);
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        this.CBQ5d1kRq.set(this.kmSgne1rO, obj);
    }
}
