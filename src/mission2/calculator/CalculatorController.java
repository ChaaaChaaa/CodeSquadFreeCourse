package mission2.calculator;

public class CalculatorController {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10,2);
        System.out.println("덧셈 : "+calculator.add());
        System.out.println("뺄셈 : "+calculator.subtraction());
        System.out.println("곱셈 : "+calculator.multiple());
        System.out.println("나눗셈 : "+calculator.division());
    }
}
