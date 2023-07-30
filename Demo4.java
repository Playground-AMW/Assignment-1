public class Demo4 {
    public static void main(String[] args) {
        int day = 28,month = 12,year = 2023,hour = 23,minutes = 59,seconds = 59;

        String startDay = "\033[32m", endDay = "\033[30m", startMon = "\033[33m", endMon = "\033[30m", 
               startYear = "\033[34m", endYear = "\033[30m", startHour = "\033[35m", endHour = "\033[30m", 
               startMin = "\033[36m", endMin = "\033[30m", startSec = "\033[38m", endSec = "\033[30m",
               record = "%s%d%s";

        System.out.printf(record + "/" + record + "/" + record + " " + record+ ":"+record+":"+record+"\n",
                          startMon,month,endMon,startDay,day,endDay,startYear,year,endYear, startHour, hour,  
                          endHour,startMin,minutes,endMin,startSec,seconds,endSec);
    }
}
