public class Main {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }

        else {
            long years, days;

            long minutesInYear = 60 * 24 * 365;
            days = (minutes / 60 / 24) % 365;
            years = minutes / minutesInYear;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
