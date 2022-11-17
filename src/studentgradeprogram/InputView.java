package studentgradeprogram;

import java.util.HashMap;
import java.util.List;

public class InputView {
    public static List<Student> inputStudentInfo(List<Student> students){
        Student 강감찬 = new Student("강감찬", 211213, "국어국문학과", Subjects.KOREA_LANGUAGE,new HashMap<Subjects,Integer>());
        강감찬.setScoreInfo(Subjects.KOREA_LANGUAGE,95);
        강감찬.setScoreInfo(Subjects.MATH,56);
        강감찬.setScoreInfo(Subjects.BROAD_DANCE,95);
        students.add(강감찬);

        Student 김유신 = new Student("김유신", 212330, "컴퓨터공학과", Subjects.MATH,new HashMap<Subjects,Integer>());
        김유신.setScoreInfo(Subjects.KOREA_LANGUAGE,95);
        김유신.setScoreInfo(Subjects.MATH,95);
        김유신.setScoreInfo(Subjects.BROAD_DANCE,85);
        students.add(김유신);

        Student 신사임당 = new Student("신사임당", 201518, "국어국문학과",  Subjects.KOREA_LANGUAGE,new HashMap<Subjects,Integer>());
        신사임당.setScoreInfo(Subjects.KOREA_LANGUAGE,100);
        신사임당.setScoreInfo(Subjects.MATH,88);
        신사임당.setScoreInfo(Subjects.BROAD_DANCE,55);
        students.add(신사임당);

        Student 이순신 = new Student("이순신", 202360, "국어국문학과",  Subjects.KOREA_LANGUAGE,new HashMap<Subjects,Integer>());
        이순신.setScoreInfo(Subjects.KOREA_LANGUAGE,89);
        이순신.setScoreInfo(Subjects.MATH,95);
        students.add(이순신);

        Student 홍길동 = new Student("홍길동", 201290, "컴퓨터공학과",  Subjects.MATH,new HashMap<Subjects,Integer>());
        홍길동.setScoreInfo(Subjects.KOREA_LANGUAGE,83);
        홍길동.setScoreInfo(Subjects.MATH,56);
        students.add(홍길동);

        return students;
    }
}
