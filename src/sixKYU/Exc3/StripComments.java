package sixKYU.Exc3;

public class StripComments {

    public static String stripComments(String text, String[] commentSymbols) {
        String[] table = text.split("\n");
        StringBuffer sB = new StringBuffer("");
        String[][] finalTable = new String[commentSymbols.length][table.length];
        String[] superFinalTable = new String[table.length];

        for (int i = 0; i < commentSymbols.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (table[j].contains(commentSymbols[i])) {
                    finalTable[i][j] = (table[j].substring(0, table[j].indexOf(commentSymbols[i])));
                } else {
                    finalTable[i][j] = table[j];
                }
            }
        }

        for (int j = 0; j < table.length; j++) {
            String finalWorld = table[j];
            for (int i = 0; i < commentSymbols.length; i++) {
                if (finalWorld.length() > finalTable[i][j].length()) {
                    superFinalTable[j] = finalTable[i][j];
                } else {
                    superFinalTable[j] = finalWorld;
                }
                finalWorld = finalTable[i][j];
            }
        }


        for (int j = 0; j < table.length; j++) {
            if (j < table.length - 1) {
                sB.append(superFinalTable[j].trim()).append("\n");
            } else {
                sB.append(superFinalTable[j].trim());
            }
        }

        return sB.toString();
    }
}
