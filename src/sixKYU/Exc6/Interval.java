package sixKYU.Exc6;

import java.util.Set;
import java.util.TreeSet;

public class Interval {
    public static int sumIntervals(int[][] intervals) {
        if (intervals == null) {
            return 0;
        } else {
            Set<Integer> integerSet = new TreeSet<>();
            for (int[] interval : intervals) {
                int length = interval[1] - interval[0];
                for (int j = 0; j < length; j++) {
                    integerSet.add(interval[0] + j);
                }
            }
            return integerSet.size();
        }
    }
}
