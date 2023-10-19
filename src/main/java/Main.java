public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();
        int result;
        result=calc.sum(23, 17);
        System.out.println("23+17=" + result);

        result=calc.division(23, 17);
        System.out.println("23/17=" + result);
        result=calc.multiplication(23, 17);
        System.out.println("23*17=" + result);
        result=calc.subtraction(23, 17);
        System.out.println("23-17=" + result);

    }
}