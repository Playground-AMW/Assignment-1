public class Demo6_task_1 {
    public static void main(String[] args) {

        String greenStart = "\033[42m", greenEnd = "\033[40m", redStart = "\033[41m", redEnd = "\033[40m";
        
        System.out.printf("%s[   5%s%s0%s  ]%s",redStart,redEnd,greenStart,"%",greenEnd);
    }
}
