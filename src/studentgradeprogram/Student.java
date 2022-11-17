package studentgradeprogram;

import java.util.HashMap;

public class Student {
    String studentName;
    int studentNumber;
    String major;
    Subjects requirementMajor;
    HashMap<Subjects, Integer> scoreInfo;

    public Student(String studentName, int studentNumber, String major, Subjects requirementMajor,HashMap<Subjects, Integer> scoreInfo) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.major = major;
        this.requirementMajor = requirementMajor;
        this.scoreInfo = scoreInfo;
    }


    public String getStudentName() {
        return studentName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getMajor() {
        return major;
    }

    public Subjects getRequirementMajor() {
        return requirementMajor;
    }

    public HashMap<Subjects, Integer> getScoreInfo() {
        return scoreInfo;
    }

    public void setScoreInfo(Subjects subject, Integer value) {
        scoreInfo.put(subject, value);
    }
}
