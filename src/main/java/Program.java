import net.time4j.*;
import static net.time4j.PlainDate.DAY_OF_WEEK;

public class Program {
    public static void main(String[] arg) {
        PlainDate today = SystemClock.inLocalView().today();
        PlainDate nextWednesday = today.with(DAY_OF_WEEK.setToNext(Weekday.WEDNESDAY));
        System.out.println("Next wednesday: " + nextWednesday);
    }
}
