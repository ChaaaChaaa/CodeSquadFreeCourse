package studentgradeprogram;

public enum Subjects {
    KOREA_LANGUAGE("국어"),
    MATH("수학"),
    BROAD_DANCE("방송댄스");

    String subjectName;

    Subjects(String subjectName){
        this.subjectName = subjectName;
    }
}
