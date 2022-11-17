package studentgradeprogram;

import java.util.Objects;

public class Math {
    public StringBuilder getMathScore(Student student, BasicEvaluation basicEvaluation, MajorEvaluation majorEvaluation) {
        StringBuilder mathScoreResult = new StringBuilder();
        int score = student.scoreInfo.get(Subjects.MATH);
        if (Objects.equals(student.requirementMajor.subjectName, Subjects.MATH.subjectName)) {
            mathScoreResult.append(score).append(":").append(majorEvaluation.getGrade(score));
        } else {
            mathScoreResult.append(score).append(":").append(basicEvaluation.getGrade(score));
        }
        return mathScoreResult;
    }


    public void printMathScoreResult(Student student, BasicEvaluation basicEvaluation, MajorEvaluation majorEvaluation) {
        StringBuilder MatheScore = new StringBuilder();
        MatheScore.append(student.getStudentName()).append("|").append(student.getStudentNumber()).append("|").append(student.getRequirementMajor().subjectName)
                .append("|").append(getMathScore(student, basicEvaluation, majorEvaluation));
        System.out.println(MatheScore);
    }
}
