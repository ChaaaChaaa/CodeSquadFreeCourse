package concert;

import java.util.List;
import java.util.Objects;

public class Cancellation {
    public void cancelSeat(List<Person> personList, String name,String[][] seatList) {
        Person person =findCancelPerson(personList,name);
        seatList[person.seatClass][person.seatPosition] = "___ ";
        person.seatPosition = 0;
        person.seatClass = 0;
    }

    private Person findCancelPerson(List<Person> personList, String name) {
        for (Person person : personList) {
            if (Objects.equals(person.name, name)) {
                return person;
            }
        }
        return null;
    }
}
