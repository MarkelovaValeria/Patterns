package patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<Memento> mementoList;

    public History(){
        mementoList = new ArrayList<>();
    }

    public void addMemento(Memento memento){
        mementoList.add(memento);
    }

    public Memento getMemento(int memento) {
        return mementoList.get(memento);
    }
}
