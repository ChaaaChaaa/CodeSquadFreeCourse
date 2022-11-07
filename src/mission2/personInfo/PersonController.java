package mission2.personInfo;

public class PersonController {
    public static void main(String[] args) {
        String name = "제인";
        int age = 30;
        String gender = "여성";
        boolean isMarried = true;
        int numOfBaby = 1;
        Person person = new Person(name, age, gender, isMarried, numOfBaby);
        System.out.println("이름은 " + person.name + "이고 " + "나이는 " + person.age + "살 입니다. 성별은 " + person.gender + "이며, " + person.checkMarried()+"입니다. 자녀는 " + person.numOfBaby + "명이 있습니다.");
    }
}
