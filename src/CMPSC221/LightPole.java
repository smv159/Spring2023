package CMPSC221;

import java.sql.Time;
import java.time.LocalDateTime;

public class LightPole {
    int height;
    String bulb;
    LocalDateTime onTime;
    LocalDateTime offTime;

    public LightPole(int height, String bulb, LocalDateTime onTime, LocalDateTime offTime) {
        this.height = height;
        this.bulb = bulb;
        this.onTime = onTime;
        this.offTime = offTime;
    }
}
