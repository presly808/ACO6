package ua.artcode.week5.day1;

public enum WeekDay {

    MONDAY("Понеділок"),TUESDAY("Вівторок"),
    WEDNESDAY("Середа"),THURSDAY("Четвер"),FRIDAY("Пятниця");
    // order : 0     1       2         3         4
    // name : MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY
    // WeekDay MONDAY = new WeekDay(0,"MONDAY");

    private final String urkName;

     WeekDay(String urkName) {
        this.urkName = urkName;
    }

    public String getUrkName() {
        return urkName;
    }
}
