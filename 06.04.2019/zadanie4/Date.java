/*
POJ - laboratorium 3 2019-04-06
Grupa: Maciej Rybacki i Jakub Słomiński
Zadanie 4
*/
public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int startDay, int startMonth, int startYear) {
        day = startDay;
        month = startMonth;
        year = startYear;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate (int day, int month, int year) {

    }

    public String toString () {
        String sday = "", smonth = "", syear= "";

        if (day < 10) {
            sday = "0" + day;
        }
        else {
            sday = "" + day;
        }


        if (month < 10) {
            smonth = "0" + month;
        }
        else {
            smonth = "" + month;
        }


        return sday+"/"+smonth+"/"+year;
    }
}
