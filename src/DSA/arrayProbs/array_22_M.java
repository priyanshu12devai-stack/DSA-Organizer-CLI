/*
@Problem = Search element in rotate array 1
@Algorithm = Binary search
@Topic = array
@Difficulty = Medium
@Problem_num = 22
*/


package DSA.arrayProbs;

public class array_22_M {
    public static int searchElement(int[] arr, int k, int n) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == k) {
                return mid;
            }
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= k && k <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (arr[mid] <= k && arr[high] >= k) {
                    low =  mid + 1 ;
                }
                else{
                    high = mid-1 ;
                }

            }
        }
        return -1;
    }
    public static void main(String[] args) {
          int[] arr = {7,8,9,1,2,3,4,5,6};
          int n = arr.length;
          System.out.println(searchElement(arr , 9 , n));
        }

}
