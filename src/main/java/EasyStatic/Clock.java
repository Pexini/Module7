package EasyStatic;

import java.time.LocalDateTime;

public class Clock {
   public static void ShowTime(){
       LocalDateTime currentTime = LocalDateTime.now();
       System.out.println("Сейчас на часах " + " " +  currentTime);
   }

}
