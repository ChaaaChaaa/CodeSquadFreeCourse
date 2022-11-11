package school;

import java.util.HashMap;
import java.util.Map;

public class ScoreController {

    double totalScore;
    int average;
    Map<Subjects, Integer> scoreMap;
    int numOfSubjects;

    ScoreController(String[] subjectList, int numOfSubjects) {
        this.scoreMap = setScoreList(subjectList);
        this.numOfSubjects = numOfSubjects;
    }

    public Map<Subjects, Integer> setScoreList(String[] subjectList) {
        Map<Subjects, Integer> hashMap = new HashMap<>();
        hashMap.put(Subjects.국어, Integer.parseInt(subjectList[0]));
        hashMap.put(Subjects.수학, Integer.parseInt(subjectList[1]));
        hashMap.put(Subjects.영어, Integer.parseInt(subjectList[2]));
        return hashMap;
    }

    public double calculateTotalScore() {
        return this.totalScore = scoreMap.values().stream().reduce(0, Integer::sum);
    }

    public int calculateAverageScore() {
        return average = (int) (calculateTotalScore() / numOfSubjects);
    }
}
