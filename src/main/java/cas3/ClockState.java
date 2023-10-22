package cas3;

import java.time.LocalTime;

public interface ClockState {
    public void checkTime();
    public void enterAlarmTime(LocalTime time);
    public void clickPower();
}
