package school;

public class Student {
    String name;
    int studentNumber;
    String majorSubject;
    String[] subjectList;
    int numOfMajorSubject;

    double totalScore;
    double average;
    ScoreController scoreController;

    public Student(String name, int studentNumber, String majorSubject, String[] subjectList) {
        this.name = name;
        this.studentNumber = getStudentNumber();
        this.majorSubject = majorSubject;
        this.subjectList = subjectList;
        this.scoreController = getScoreController();
    }

    public ScoreController getScoreController() {
        return new ScoreController(subjectList, numOfMajorSubject);
    }

    public int getNumOfMajorSubject() {
        for (String subject : subjectList) {
            if (!subject.equals("0")) {
                numOfMajorSubject++;
            }
        }
        return numOfMajorSubject;
    }


    public int getStudentNumber() {
        return this.studentNumber = StudentNumberGenerator.generateStudentNumber();
    }

    public double getTotalScore() {
        return totalScore = scoreController.calculateTotalScore();
    }

    public double getAverageScore() {
        return average = getScoreController().calculateAverageScore();
    }

}
