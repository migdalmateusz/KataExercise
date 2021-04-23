package sevenKYU.Exc2;

import java.util.HashMap;
import java.util.Map;

public class Line {
    public static String Tickets(int[] peopleInLine) {
        String equalsQueue = "YES";
        Map<Integer, Integer> peopleMap = new HashMap<>();
        peopleMap.put(25, 0);
        peopleMap.put(50, 0);
        peopleMap.put(100, 0);
        for (int people : peopleInLine) {
            switch (people) {
                case 25:
                    if (peopleMap.get(25) >= 1) {
                        int value = peopleMap.get(25) + 1;
                        peopleMap.put(25, value);
                    } else {
                        peopleMap.put(25, 1);
                    }
                    break;
                case 50:
                    if (peopleMap.get(25) >= 1) {
                        int valueOf25 = peopleMap.get(25) - 1;
                        peopleMap.put(25, valueOf25);
                        if (peopleMap.get(50) >= 1) {
                            int valueOf50 = peopleMap.get(50) + 1;
                            peopleMap.put(50, valueOf50);
                        } else {
                            peopleMap.put(50, 1);
                        }
                    } else {
                        equalsQueue = "NO";
                        break;
                    }
                    break;
                case 100:
                    if (peopleMap.get(25) >= 1 && peopleMap.get(50) >= 1) {

                        int valueOf25 = peopleMap.get(25) - 1;
                        peopleMap.put(25, valueOf25);
                        int valueOf50 = peopleMap.get(50) - 1;
                        peopleMap.put(50, valueOf50);

                        if (peopleMap.get(100) >= 1) {
                            int valueOf100 = peopleMap.get(100) + 1;
                            peopleMap.put(100, valueOf100);
                        } else {
                            peopleMap.put(100, 1);
                        }

                    } else if (peopleMap.get(25) >= 3) {

                        int valueOf25 = peopleMap.get(25) - 3;
                        peopleMap.put(25, valueOf25);

                        if (peopleMap.get(100)>=1) {
                            int valueOf100 = peopleMap.get(100) + 1;
                            peopleMap.put(100, valueOf100);
                        } else {
                            peopleMap.put(100, 1);
                        }

                    } else {
                        equalsQueue = "NO";
                        break;
                    }
                    break;
                default:
                    equalsQueue = "NO";
            }
        }
        return equalsQueue;
    }
}

