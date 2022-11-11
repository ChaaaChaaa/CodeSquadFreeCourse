package school;

public class ResultView {
    public static void printNumOfMajorSubject(Student student) {
        System.out.println(student.name + "학생은 " + student.getNumOfMajorSubject() + "과목을 수강했습니다.");
    }

    public static void printTotalScoreSumAndAverage(Student student) {
        System.out.println("총점은 " + student.getTotalScore() + "이고 평균은 " + student.getAverageScore() + "점 입니다.");
    }
}
