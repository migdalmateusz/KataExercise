package sevenKYU.Exc5;

public class Accumul {

    public static String accum(String s) {
        StringBuffer sB = new StringBuffer("");
        String[] words = s.split("");
        sB = sB.append(words[0].toUpperCase()).append("-");
        for (int i = 1; i < words.length; i++) {
            sB.append(words[i].toUpperCase());
            for (int j = 0; j < i; j++){
                sB.append(words[i].toLowerCase());
            }
            if (i != words.length-1) {
                sB.append("-");
            }
        }
        return sB.toString();
    }
}
