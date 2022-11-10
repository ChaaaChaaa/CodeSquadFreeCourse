package dicegame;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Memento {
    Money state;
    HashMap<String,Integer> fruitsList;

    public Memento(Money state,HashMap<String,Integer> fruitsList) {
        this.state = state;
        this.fruitsList = fruitsList;
    }

    public Memento setMemento(Money state, HashMap<String,Integer> fruitsList){
        this.state = state;
        this.fruitsList = fruitsList;
        return new Memento(this.state,this.fruitsList);
    }
}
