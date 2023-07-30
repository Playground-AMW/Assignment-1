import java.rmi.StubNotFoundException;

public class Demo6_task_2 {
    public static void main(String[] args) {

        String name1 = "Alice", name2 = "Bob";
        int age1 = 24, age2 = 30;

        String lineStart = "\033[33m",titleStart = "\033[32;1m", end = "\033[33;0m\033[33m",nameStart = "\033[37m", 
                ageStart = "\033[35m"; 

        String line = "+"+"-".repeat(15)+"+"+"-".repeat(5)+"+", line2 = "%s%s\n";
        String content = "|%s%-15s%s|%s%5d%s|\n";

        System.out.printf(line2,lineStart,line);
        System.out.printf("|%s%-15s%s|%1$s%-5s%3$s|\n",titleStart," NAME",end," AGE");
        System.out.printf(line2,lineStart,line);
        System.out.printf(content,nameStart,name1,end,ageStart,age1,end);
        System.out.printf(content,nameStart,name2,end,ageStart,age2,end);
        System.out.printf(line2,lineStart,line);
        }
}
