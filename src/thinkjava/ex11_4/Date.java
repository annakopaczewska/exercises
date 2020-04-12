package thinkjava.ex11_4;

public class Date {
    private int year;
    private int month;
    private int day;


    public Date() {
        this(1995, 6, 18);
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
