package dicegame;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Game {
    static String[] fruitArr = {"사과", "샤인머스켓", "귤"};
    static List<String> fruitList = new ArrayList<>();
    static HashMap<String,Integer> fruitMap = new HashMap<>();

    public static void main(String[] args) {
        int gameCount = 0;
        int fruitIndex = 0;

        Originator originator = new Originator(fruitMap, new Money(10000));
        Memento memento = originator.createMemento();

        while (gameCount < 101 && originator.state.getMoney()> 0) {
            int diceNumber = new Random().nextInt(6)+1;
            fruitList = new ArrayList<>();

            if (diceNumber == 1 || diceNumber == 3) {
                originator.state.setMoney(originator.state.addMoney());
            } else if (diceNumber == 2 || diceNumber == 4) {
                originator.state.setMoney(originator.state.divideMoney());
            } else if(diceNumber == 6){
                int index = fruitIndex % 3;
                originator.fruitsList.put(fruitArr[index],originator.fruitsList.getOrDefault(fruitArr[index],0)+1);
                fruitIndex++;
            }

            if (originator.state.getMoney() > memento.state.getMoney()) {
                originator.setMemento(memento);
            }

            if (originator.state.getMoney() < memento.state.divideMoney()) {
                originator.restoreMemento(memento);
            }

            System.out.println(originator.state.getMoney());
            for(String key : originator.fruitsList.keySet()){
                fruitList.add(key+" "+originator.fruitsList.get(key)+"개");
            }
            System.out.println(fruitList);

            gameCount++;

        }
    }
}
