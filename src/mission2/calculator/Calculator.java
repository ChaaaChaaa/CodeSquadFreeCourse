package mission2.calculator;

public class Calculator {
    public int num1;
    public int num2;

    Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public int add(){
        return num1+num2;
    }

    public int subtraction(){
        return num1-num2;
    }

    public int multiple(){
        return num1*num2;
    }

    public int division(){
        return num1/num2;
    }
}
