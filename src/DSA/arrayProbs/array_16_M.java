/*
@Problem = Best Time to Buy and Sell Stock
@Algorithm = Greedy
@Topic = array
@Difficulty = Medium
@Problem_num = 16
*/

package DSA.arrayProbs;
public class array_16_M {
    public static void Stock(int[] arr) {
        int min = arr[0];
        int profit = 0;

        for (int i = 1; i < arr.length; i++) {
            int cost = arr[i] - min;
            profit = Math.max(cost, profit);
            min = Math.min(min, arr[i]);
        }
        System.out.println("Maximum profit : " + profit);

    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        Stock(arr);


    }
}