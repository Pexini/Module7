package Easy;

import java.time.LocalDateTime;

public class Clock {
    public void shoeTime(){

        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Сейчас на часах" + " " + currentTime);
    }
}
