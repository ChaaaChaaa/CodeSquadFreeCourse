package dicegame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Originator {
    Money state;
    HashMap<String,Integer> fruitsList;

    public Originator(HashMap<String,Integer> fruitsList,Money state) {
        this.fruitsList = fruitsList;
        this.state = state;
    }

    Memento setMemento(Memento memento){
       return memento.setMemento(this.state,this.fruitsList);
    }

    public void setFruitsList(HashMap<String,Integer> fruitsList) {
        this.fruitsList = fruitsList;
    }

    Memento createMemento(){
        return new Memento(new Money(0),new HashMap<>());
    }
    void restoreMemento(Memento memento){
        this.state.setMoney(memento.state.getMoney());
        setFruitsList(memento.fruitsList);
    }

}
