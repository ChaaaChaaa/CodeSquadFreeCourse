package studentgradeprogram;

import java.util.List;

public class ResultView {
    public static void printKoreanLanguageResult(KoreanLanguage koreanLanguage, Student student, BasicEvaluation basicEvaluation, MajorEvaluation majorEvaluation, PassFailEvaluation passFailEvaluation) {
        koreanLanguage.printKoreaLanguageScoreResult(student, basicEvaluation, majorEvaluation);
    }

    public static void printMathResult(Math math, Student student, BasicEvaluation basicEvaluation, MajorEvaluation majorEvaluation, PassFailEvaluation passFailEvaluation) {
        math.printMathScoreResult(student, basicEvaluation, majorEvaluation);
    }

    public static void printBroadDanceResult(BroadcastDance broadcastDance, Student student, BasicEvaluation basicEvaluation, MajorEvaluation majorEvaluation, PassFailEvaluation passFailEvaluation) {
        if (student.scoreInfo.containsKey(Subjects.BROAD_DANCE)) {
            broadcastDance.printBroadcastDanceScoreResult(student, passFailEvaluation);
        }
    }

    public static void getResultStudentInfo(KoreanLanguage koreanLanguage, Math math, BroadcastDance broadcastDance, List<Student> students, BasicEvaluation basicEvaluation, MajorEvaluation majorEvaluation, PassFailEvaluation passFailEvaluation) {
        System.out.println("==================국어 수강생 학점=====================");
        for (Student student : students) {
            printKoreanLanguageResult(koreanLanguage, student, basicEvaluation, majorEvaluation, passFailEvaluation);
        }

        System.out.println("==================수학 수강생 학점=====================");
        for (Student student : students) {
            printMathResult(math, student, basicEvaluation, majorEvaluation, passFailEvaluation);
        }

        System.out.println("==================방송댄스 수강생 학점=====================");
        for (Student student : students) {
            printBroadDanceResult(broadcastDance, student, basicEvaluation, majorEvaluation, passFailEvaluation);
        }
    }
}
