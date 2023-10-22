package cas3;

import java.time.LocalTime;

public class OffClockState implements ClockState{
    private final AlarmClock clock;

    public OffClockState(AlarmClock clock){
        this.clock = clock;
    }

    @Override
    public void checkTime() {
        System.out.println("Alarm is OFF");
    }

    @Override
    public void enterAlarmTime(LocalTime time) {
        ClockState on = new OnClockState(clock);
        clock.setAlarmTime(time);
        clock.setState(on);
    }

    @Override
    public void clickPower() {
        System.out.println("Alarm is OFF");
    }
}
