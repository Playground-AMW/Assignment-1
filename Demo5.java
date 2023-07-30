public class Demo5 {
    public static void main(String[] args) {
        int iSBNNumber1 = 978, iSBNNumber2 = 3, iSBNNumber3 = 16, iSBNNumber4 = 1484100;

        String num1Start = "\033[31m", num1End = "\033[30m",num2Start = "\033[32m", num2End = "\033[30m",
               num3Start = "\033[33m", num3End = "\033[30m",num4Start = "\033[34m", num4End = "\033[30m";
               
        System.out.printf("%s%3d%s-%s%1d%s-%s%2d%s-%s%7d%s\n",num1Start,iSBNNumber1,num1End,num2Start,
                          iSBNNumber2,num2End,num3Start,iSBNNumber3,num3End,num4Start,iSBNNumber4,num4End);
    }
}
