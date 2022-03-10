package prasad.leetcode.p1344;

public class AngleBetweenHandsOfClock {

    public double angleClock(int hour, int minutes) {
        double minutesHandDegrees = minutes * 6;
        double minutesInHours = ((double) minutes) / 60;
        double hourHandDegrees = (hour + minutesInHours) * 30;
        double angle = Math.abs(minutesHandDegrees - hourHandDegrees);
        return angle > 180 ? 360 - angle : angle;
    }
}
