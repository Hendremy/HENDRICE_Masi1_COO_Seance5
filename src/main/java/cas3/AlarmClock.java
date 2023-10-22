package cas3;

import java.time.LocalTime;

public class AlarmClock {
    private LocalTime alarmTime;
    private ClockState state;

    public void enterAlarmTime(LocalTime alarmTime){
        System.out.println("\n - ALARM TIME ENTERED - \n");
        state.enterAlarmTime(alarmTime);
    }

    public void checkTime(){
        state.checkTime();
    }

    public void setAlarmTime(LocalTime alarmTime){
        this.alarmTime = alarmTime;
    }

    public LocalTime getAlarmTime(){
        return alarmTime;
    }

    public void clickPowerButton(){
        System.out.println("\n - BUTTON CLICKED - \n");
        state.clickPower();
    }

    public void setState(ClockState state){
        this.state = state;
    }
}
