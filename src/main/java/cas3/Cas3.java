package cas3;

import java.time.Duration;
import java.time.LocalTime;


public class Cas3 {
    public static void main(String[] args) throws Exception {
        AlarmClock clock = new AlarmClock();
        ClockState initialState = new OffClockState(clock);
        clock.setState(initialState);

        new Cas3().start(clock);
    }

    private void start(AlarmClock clock) throws Exception{
        LocalTime now = LocalTime.now();
        LocalTime alarm = now.plus(Duration.ofSeconds(3));

        //Alarm is OFF
        checkClock(clock);

        //Alarm is turned ON
        clock.enterAlarmTime(alarm);
        checkClock(clock);

        for(int i = 0; i < 3; ++i){
            //Alarm should trigger
            checkClock(clock);
        }

        //Alarm is silenced
        clock.clickPowerButton();
        checkClock(clock);

        //Alarm is turned off
        clock.clickPowerButton();
        checkClock(clock);
    }

    private synchronized void checkClock(AlarmClock clock) throws Exception{
        clock.checkTime();
        wait(Duration.ofSeconds(1).toMillis());
    }
}