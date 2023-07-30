public class Demo6_task_3 {
    public static void main(String[] args) {

        String city1 = "Los Angeles", city2 = "\033[32mNew\033[37m York";
        String state1 = "California", state2 = "\033[32mNew\033[37m York";
        int population1 = 3966936, population2 = 8336817;

        String lineStart = "\033[33m", titleStart = "\033[37;1m", titleEnd = "\033[37;0m\033[33m", 
               nameStart = "\033[37m", end = "\033[33m", popStart = "\033[35m";

        String line = "+"+"-".repeat(20)+"+"+"-".repeat(12)+"+"+"-".repeat(12)+"+\n";

        System.out.printf("%s%s",lineStart,line);
        System.out.printf("|%s%-20s%s|%1$s%-12s%3$s|%1$s%-12s%3$s|\n",titleStart," CITY",titleEnd," STATE"," POPULATION");
        System.out.printf("%s%s",lineStart,line);
        System.out.printf("| %s%-19s%s| %1$s%-11s%3$s| %s%-,11d%3$s|\n",nameStart,city1,end,state1,popStart,population1);
        System.out.printf("| %s%-29s%s| %1$s%-21s%3$s| %s%-,11d%3$s|\n",nameStart,city2,end,state2,popStart,population2);
        System.out.printf("%s%s",lineStart,line);
    }
}
