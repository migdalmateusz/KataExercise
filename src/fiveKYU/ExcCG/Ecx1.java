package fiveKYU.ExcCG;

public class Ecx1 {

    public static String[][] convert(int[][] table) {
        String[][] finalTable = new String[table.length][table[0].length];
        for(int i = 0; i < table.length; i++){
            for (int j = 0; j < table[0].length; j++){
                if(table[i][j]%2==0){
                    finalTable[i][j] = "P";
                } else {
                    finalTable[i][j] = "N";
                }
            }
        }
        return finalTable;
    }


}
