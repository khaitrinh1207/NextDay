public class NextDay {

    public static final int LAST_OF_YEAR = 12;
    public static final int FIRST_OF_YEAR = 1;
    public static int lastOfMonth;
    public static final int FIRST_OF_MONTH = 1;

    public static String nextDayCalculator(int dayTest, int monthTest, int yearTest) {
        getOfMonth(monthTest, dayTest);
        if (dayTest == lastOfMonth) {
            if (monthTest == LAST_OF_YEAR) {
                dayTest = FIRST_OF_MONTH;
                monthTest = FIRST_OF_YEAR;
                yearTest++;
            } else {
                dayTest = FIRST_OF_MONTH;
                monthTest++;
            }
        } else dayTest++;
        return dayTest + "-" + monthTest + "-" + yearTest;
    }

    private static void getOfMonth(int monthTest, int dayTest) {
        switch (monthTest) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastOfMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                lastOfMonth = 30;
                break;
            case 2:
                lastOfMonth = dayTest == 29 ? 29 : 28;

                break;
        }
    }
}
