package sevenKYU.Exc3;

public class Solution {

    public static int solution(int number) {
        int score = 0;
        if (number>0) {
            for (int i =0; i < number; i++) {
                if(i%3==0 || i%5==0) {
                    score = score + i;
                }
            }
        }
        return score;
        
    }
}
