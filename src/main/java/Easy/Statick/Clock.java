package Easy.Statick;

import java.time.LocalDateTime;

public class Clock {
    public static void showTime(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println( "Сейчас на часах " + " " + localDateTime );
    }
}
