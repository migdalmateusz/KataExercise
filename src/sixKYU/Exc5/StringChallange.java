package sixKYU.Exc5;

public class StringChallange {


    public static String StringChallange(String str) {
        String[] word = str.split("");
        StringBuilder finalAnswer = new StringBuilder("");
        if (ifPalindrome(word, 0, word.length - 1)) {
            return "palindrome";
        } else {
            StringBuilder sb = new StringBuilder(str);
            for (int i = 0; i < str.length(); i++) {
                char c = sb.charAt(i);
                sb.deleteCharAt(i);
                if (ifPalindrome(sb.toString().split(""), 0, sb.length() - 1)) {
                    return finalAnswer.append(c).toString();
                } else {
                    for (int j = 0; j < sb.length(); j++) {
                        char d = sb.charAt(j);
                        sb.deleteCharAt(j);
                        if (ifPalindrome(sb.toString().split(""), 0, sb.length() - 1)) {
                            return finalAnswer.append(c).append(d).toString();
                        } else if (j == sb.length() - 1 && i == str.length() - 1) {
                            return "No possible";
                        } else {
                            sb.insert(j, d);
                        }
                    }
                    sb.insert(i, c);
                }
            }
        }
        return finalAnswer.toString();
    }

    public static boolean ifPalindrome(String[] letters, int p, int k) {
        if (k <= p) {
            return true;
        } else if (!letters[p].equals(letters[k])) {
            return false;
        } else {
            return ifPalindrome(letters, p + 1, k - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(StringChallange("alalalam"));

    }
}

