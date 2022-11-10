package algorithm;

public class Q12901 {
    public String solution(int a, int b) {
        String[] days = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};

        int select =0;

        for(int i=0; i<a-1; i++){
            select += month[i];
        }

        select += b-1; //1월 1일이 하루가 지난날이기 때문
        return days[select%7];
    }
}
