package sixKYU.Exc2;

public class CountIPAddresses {

    public static long ipsBetween(String start, String end) {
        String[] startNumber = start.split("\\.");
        String[] endNumber = end.split("\\.");
        long[] startNumberLong = new long [4];
        long[] endNumberLong = new long [4];

        for (int i = 0; i < 4; i++) {
            long longFromStringStartNumber = Long.parseLong(startNumber[i]);
            long longFromStringEndNumber = Long.parseLong(endNumber[i]);
            startNumberLong[i] = longFromStringStartNumber;
            endNumberLong[i] = longFromStringEndNumber;
        }

        long finalStarNumber = startNumberLong[0]*256*256*256+startNumberLong[1]*256*256+startNumberLong[2]*256+startNumberLong[3];
        long finalEndNumber = endNumberLong[0]*256*256*256+endNumberLong[1]*256*256+endNumberLong[2]*256+endNumberLong[3];
        return finalEndNumber-finalStarNumber;
    }


}
