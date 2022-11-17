package studentgradeprogram;

import java.util.Objects;

public class KoreanLanguage {
    public StringBuilder getKoreanLanguageScore(Student student, BasicEvaluation basicEvaluation, MajorEvaluation majorEvaluation) {
        StringBuilder koreaLanguageScore = new StringBuilder();
        int score = student.scoreInfo.get(Subjects.KOREA_LANGUAGE);
        if (Objects.equals(student.requirementMajor.subjectName, Subjects.KOREA_LANGUAGE.subjectName)) {
            koreaLanguageScore.append(score).append(":").append(majorEvaluation.getGrade(score));
        } else {
            koreaLanguageScore.append(score).append(":").append(basicEvaluation.getGrade(score));
        }
        return koreaLanguageScore;
    }

    public void printKoreaLanguageScoreResult(Student student, BasicEvaluation basicEvaluation, MajorEvaluation majorEvaluation) {
        StringBuilder koreaLanguageScore = new StringBuilder();
        koreaLanguageScore.append(student.getStudentName()).append("|").append(student.getStudentNumber()).append("|").append(student.getRequirementMajor().subjectName)
                .append("|").append(getKoreanLanguageScore(student, basicEvaluation, majorEvaluation));
        System.out.println(koreaLanguageScore);
    }
}
