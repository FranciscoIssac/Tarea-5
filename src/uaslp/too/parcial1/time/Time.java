package uaslp.too.parcial1.time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int sescond) {
        this.hour = hour;
        this.minute = minute;
        this.second = sescond;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void addHour(int delta) {
        hour += delta;
        while (hour > 23 || hour < 0) {
            if (hour > 23) {
                hour = hour - 24;
            } else {
                hour = hour + 24;
            }
    }
    }

    public void addMinute(int delta) {
        minute += delta;
        while(minute > 59 || minute < 0) {
            if (minute > 59) {
                minute = minute - 60;
                addHour(1);
            } else {
                minute = minute + 60;
                addHour(-1);
            }
        }
    }

    public void addSecond(int delta) {
        second += delta;
        while(second > 59 || second < 0) {
            if (second > 59) {
                second = second - 60;
                addMinute(1);
            } else {
                second = second + 60;
                addMinute(-1);
            }
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
