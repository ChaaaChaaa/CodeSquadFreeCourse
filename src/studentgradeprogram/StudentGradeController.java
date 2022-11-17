package studentgradeprogram;

import java.util.ArrayList;
import java.util.List;

public class StudentGradeController {
    public static void main(String[] args) {
        KoreanLanguage koreanLanguage = new KoreanLanguage();
        Math math= new Math();
        BroadcastDance broadcastDance = new BroadcastDance();
        BasicEvaluation basicEvaluation = new BasicEvaluation();
        MajorEvaluation majorEvaluation = new MajorEvaluation();
        PassFailEvaluation passFailEvaluation = new PassFailEvaluation();
        List<Student> students = new ArrayList<>();

        students = InputView.inputStudentInfo(students);
        ResultView.getResultStudentInfo(koreanLanguage, math, broadcastDance, students, basicEvaluation, majorEvaluation, passFailEvaluation);
    }
}
