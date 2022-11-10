package carfactory;

import java.util.HashSet;

public class NumberGenerator {
    private static HashSet<Integer> carNumber = new HashSet<>();

    public int generateNumber() {
        return (int) (Math.random() * 100);
    }

    public int deDuplicationNumbers() {
        int tempNumber = generateNumber();
        while (true) {
            if (!carNumber.contains(tempNumber)) {
                carNumber.add(tempNumber);
                break;
            }
        }
        return tempNumber;
    }
}
