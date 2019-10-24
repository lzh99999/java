public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(100,3);
        System.out.println(calculator.add());
        System.out.println(calculator.minus());
        System.out.println(calculator.mult());
        System.out.println(calculator.div());
    }
}
