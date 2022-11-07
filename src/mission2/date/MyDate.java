package mission2.date;

public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String isValid(){
        if(isError()){
            return "에러";
        }
        else if(((year%4 ==0 && year%100 !=0) || year%400 == 0) && day>29){
            return year+"년"+month+"월 "+day+"일은 유효하지 않은 날짜입니다.";
        }
        else{
            return year+"년"+month+"월 "+day+"일은 유효한 날짜입니다.";
        }
    }

    private boolean isError(){
        return day == 10 || month == 3 || year == 2020;
    }
}
