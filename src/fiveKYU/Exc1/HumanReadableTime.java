package fiveKYU.Exc1;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        StringBuilder time = new StringBuilder("");
        int hour = (seconds - seconds%3600)/3600;
        if (hour < 10) {
            time.append("0").append(hour);
        } else {
            time.append(hour);
        }
        int minute = (seconds%3600 - (seconds%3600)%60)/60;
        if (minute <10) {
            time.append(":").append("0").append(minute);
        } else {
            time.append(":").append(minute);
        }
        int secondsSixty =  (seconds%3600)%60;
        if (secondsSixty <10) {
            time.append(":").append("0").append(secondsSixty);
        } else {
            time.append(":").append(secondsSixty);
        }

        return time.toString();
    }
}
