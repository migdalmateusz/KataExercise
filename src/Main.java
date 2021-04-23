import fiveKYU.Exc3.PerfectPower;
import fiveKYU.Exc4.ConwayLife;

public class Main {

    public static void main(String[] args) {

        int[][] table = {{1,1,1,0},{1,0,1,1},{1,0,1,0}};
        int[][] newTable = ConwayLife.getGeneration(table, 4);

        for (int[] entry:newTable) {
            for (int element : entry) {
                System.out.print(element);
            }
            System.out.println();
        }
    }
}