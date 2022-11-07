package mission2.personInfo;

public class Person {
    String name;
    int age;
    String gender;
    boolean isMarried;
    int numOfBaby;

    Person(String name, int age, String gender, boolean isMarried, int numOfBaby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isMarried = isMarried;
        this.numOfBaby = numOfBaby;
    }

    public String checkMarried() {
        if (isMarried) {
            return "기혼자";
        } else {
            return "미혼자";
        }
    }

}
