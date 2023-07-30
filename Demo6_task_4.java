public class Demo6_task_4 {
    public static void main(String[] args) {

        String item1 = "Apples", item2 = "Orange";
        int qty1 = 5, qty2 = 10;
        float price1 = 0.99f, price2 = 1.49f;

        String lineStart = "\033[33m", titleStart = "\033[37;1m", titleEnd = "\033[37;0m\033[33m", itemStart = "\033[37m", 
                     end = "\033[33m", qtyStart = "\033[34m", iconStart = "\033[32m", priceStart = "\033[35m";
        
        String line = "+"+"-".repeat(10)+"+"+"-".repeat(10)+"+"+"-".repeat(8)+"+\n";
        String line2 = "+"+"\033[32m-\033[33m".repeat(10)+"+"+"-".repeat(10)+"+"+"\033[32m-\033[33m".repeat(8)+"+\n";
        String lineStyle = "%s%s";
        String content = "| %s%-9s%s|%s%9d%3$s |  %s$%s%-4.2f%3$s |\n";

        System.out.printf(lineStyle,lineStart,line);
        System.out.printf("| %s%-9s%s| %1$s%-9s%3$s| %1$s%-7s%3$s|\n",titleStart,"ITEM",titleEnd,"QUANTITY","PRICE");
        System.out.printf(lineStyle,lineStart,line2);
        System.out.printf(content,itemStart,item1,end,qtyStart,qty1,iconStart,priceStart,price1);
        System.out.printf(content,itemStart,item2,end,qtyStart,qty2,iconStart,priceStart,price2);
        System.out.printf(lineStyle,lineStart,line2);
    }
}
