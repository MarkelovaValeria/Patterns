package CodeSmells.newLab6.part1.introduceLocalExtension;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateHelperExtended extends DateHelper{
    public static long daysBetween(Date startDate, Date endDate){
        long diffInMillies = endDate.getTime() - startDate.getTime();
        return TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
    }
}
