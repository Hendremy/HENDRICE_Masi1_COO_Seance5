package cas3;

import java.time.Duration;
import java.time.LocalTime;

public class OnClockState implements ClockState{
    private final AlarmClock clock;

    public OnClockState(AlarmClock clock){
        this.clock = clock;
    }

    @Override
    public void checkTime() {
        if(clock.getAlarmTime().isAfter(LocalTime.now()) && clock.getAlarmTime().isBefore(LocalTime.now().plus(Duration.ofSeconds(1)))){
            ClockState triggered = new TriggeredClockState(clock);
            clock.setState(triggered);
        }else{
            System.out.println("Alarm is ON and set to go off at " + clock.getAlarmTime().toString());
        }
    }

    @Override
    public void enterAlarmTime(LocalTime time) {
        clock.setAlarmTime(time);
    }

    @Override
    public void clickPower() {
        ClockState off = new OffClockState(clock);
        clock.setState(off);
        System.out.println("Alarm turned OFF");
    }
}
