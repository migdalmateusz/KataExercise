package sevenKYU.Exc1;

public class Exc {

    static String toCamelCase(String s) {
        StringBuilder sB = new StringBuilder("");
        String[] word = s.split("[-_]");
        sB.append(word[0]);
        for (int i = 1; i < word.length; i++) {
            sB.append(word[i].substring(0, 1).toUpperCase()).append(word[i].substring(1));
        }
        return sB.toString();
    }
}
