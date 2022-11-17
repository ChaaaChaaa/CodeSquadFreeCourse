package studentgradeprogram;

import java.util.Objects;

public class BroadcastDance {
    public void printBroadcastDanceScoreResult(Student student, PassFailEvaluation passFailEvaluation) {
        StringBuilder koreaLanguageScore = new StringBuilder();
        koreaLanguageScore.append(student.getStudentName()).append("|").append(student.getStudentNumber()).append("|").append(student.getRequirementMajor().subjectName)
                .append("|").append(student.getScoreInfo().get(Subjects.BROAD_DANCE)).append(":").append(passFailEvaluation.getGrade(student.scoreInfo.get(Subjects.BROAD_DANCE)));
        System.out.println(koreaLanguageScore);
    }
}
