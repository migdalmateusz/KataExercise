package fiveKYU.ExcCG;

public class Exc2 {

    public static int getStringLength(String[] table) {
        int max = 0;
        for(String entry:table){
            if(entry.length()>max){
                max = entry.length();
            } else if (entry.length()==0){
                max = 0;
                break;
            }
        }
        return max;
    }
}
