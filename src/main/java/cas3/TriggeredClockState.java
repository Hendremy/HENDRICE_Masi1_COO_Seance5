package cas3;

import java.time.LocalTime;

public class TriggeredClockState implements ClockState{
    private final AlarmClock clock;

    public TriggeredClockState(AlarmClock clock){
        this.clock = clock;
    }

    @Override
    public void checkTime() {
        System.out.println("*** Drrrrring, drrrrring ***");
    }

    @Override
    public void enterAlarmTime(LocalTime time) {
        System.out.println("Can't set alarm time when alarm is triggered");
    }

    @Override
    public void clickPower() {
        System.out.println("Alarm silenced");
        ClockState on = new OnClockState(clock);
        clock.setState(on);
    }
}
