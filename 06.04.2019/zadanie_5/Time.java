/*
POJ - laboratorium 3 2019-04-06
Grupa: Maciej Rybacki i Jakub Słomiński
Zadanie 2
*/
public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time (int _hour, int _minute, int _second) {
        hour = _hour;
        minute = _minute;
        second = _second;
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

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {

    }
    public String toString() {
        String shour = "", sminute = "", ssecond = "";

        if (hour < 10) {
            shour = "0" + hour;
        }
        else {
            shour = "" + hour;
        }


        if (minute < 10) {
            sminute = "0" + minute;
        }
        else {
            sminute = "" + minute;
        }


        if (second < 10) {
            ssecond = "0" + second;
        }
        else {
            ssecond = "" + second;
        }

        return shour+":"+sminute+":"+ssecond;
    }

    public Time nextSecond() {

        second ++;
        if (second >= 60) {
            second = second - 60;
            minute++;
        }
        if (minute >= 60) {
            minute = minute - 60;
            hour++;
        }

        if (hour >= 24) {
            hour = hour - 24;
        }
        return this;
    }

    public Time previousSecond() {
        second --;
        if (second < 0) {
            second = 60 + second;
            minute--;
        }
        if (minute < 0) {
            minute = 60 + minute;
            hour--;
        }

        if (hour < 0) {
            hour = 24 + hour;
        }
        return this;
    }
}
