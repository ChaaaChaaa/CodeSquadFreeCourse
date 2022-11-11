package school;

import java.util.HashSet;

public class StudentNumberGenerator {
    private static HashSet<Integer> studentNumber = new HashSet<>();

    public static int generateStudentNumber() {
        return (int) (Math.random() * 1000);
    }

    public int deDuplicationStudentNumbers() {
        int tempStudentNumber = 0;
        while (true) {
            tempStudentNumber = generateStudentNumber();
            if (!studentNumber.contains(tempStudentNumber)) {
                studentNumber.add(tempStudentNumber);
                break;
            }
        }
        return tempStudentNumber;
    }
}
