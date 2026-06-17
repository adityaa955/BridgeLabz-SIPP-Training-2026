import java.util.*;

public class FootballTeamRosterAnalyzer {

    public static void main(String[] args) {

        int numberOfPlayers = 11;
        int[] heights = new int[numberOfPlayers];

        Random random = new Random();

        for (int i = 0; i < numberOfPlayers; i++) {
            heights[i] = random.nextInt(101) + 150;
        }

        System.out.println("Heights of players: " + Arrays.toString(heights));

        int sumOfHeights = sumOfHeights(heights);
        System.out.println("Sum of heights: " + sumOfHeights);

        double meanHeight = meanHeight(heights);
        System.out.println("Mean height: " + meanHeight);

        int shortestHeight = shortestHeight(heights);
        System.out.println("Shortest height: " + shortestHeight);

        int tallestHeight = tallestHeight(heights);
        System.out.println("Tallest height: " + tallestHeight);
    }

    public static int sumOfHeights(int[] heights) {
        int sum = 0;

        for (int height : heights) {
            sum += height;
        }

        return sum;
    }

    public static double meanHeight(int[] heights) {
        int sum = sumOfHeights(heights);
        return (double) sum / heights.length;
    }

    public static int shortestHeight(int[] heights) {
        int shortest = heights[0];

        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }

        return shortest;
    }

    public static int tallestHeight(int[] heights) {
        int tallest = heights[0];

        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }

        return tallest;
    }
}