package Text_examples;

public class time_2_7 {
    public static void main(String[] args) {
        // Obtain the total milliseconds from Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Calculate total seconds since Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // calculate current second in the minute
        long currentSecond = totalSeconds % 60;

        // calculate the total minutes
        long totalMinutes = totalSeconds / 60;

        // calculate the current minute
        long currentMinute = totalMinutes % 60;

        // calculate the total hours
        long totalHours = totalMinutes / 60;

        // calculate the current hour
        long currentHour = totalHours % 24;

        // display results
        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond + " GMT");

    }
}
