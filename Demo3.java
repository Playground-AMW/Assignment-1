public class Demo3 {
    public static void main(String[] args) {
        int areaCode = 123;
        int firstNumber = 456;
        int secondNumber = 7890;

        final String start = "\033[34m";
        final String reset = "\033[30m";

        System.out.printf("(%s%d%s) %d-%d\n",start,areaCode,reset,firstNumber,secondNumber);
    }
}
