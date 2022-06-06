package zadania.enumy;

public enum WeekDay {

    MONDAY(true),
    THUSDAY(true),
    WENSDAY(true),
    THERSDAY(true),
    FRIDAY(true),
    SATURDAY(true),
    SUNDAY(false);

    private final boolean weekDay;

    WeekDay(boolean weekDay) {
        this.weekDay = weekDay;
    }

    boolean isWeekDay() {
        return weekDay;
    }

    boolean isHoliday() {
        return !weekDay;
    }

    String whichIsGrater(WeekDay weekDay){
        int wynik = this.compareTo(weekDay);
        if(wynik < 0) {
            return "Dzień jest wcześniejszy";
        } else if (wynik == 0) {
            return "Dni są takie same";
        } else {
            return "Dzień jest późniejszy";
        }
    }
}
