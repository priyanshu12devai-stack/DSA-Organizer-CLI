/*
@Problem = Lower bound search
@Algorithm = Binary search
@Topic = array
@Difficulty = Medium
@Problem_num = 20
*/

/*
TC - O(log N ) base 2
SC - O(1)
T(n) = T(n/2) + c
 */
package DSA.arrayProbs;

public class array_20_M {
    public static int lowerBound(int[] arr , int x){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;
        while(low<= high){

            int mid = low + (high-low)/2;
            if(arr[mid]>=x){  // smallest index where arr[index] just greater or equal to x
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    public static int upperBound(int[] arr , int x){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;
        while(low<= high){

            int mid = low + (high-low)/2;
            if(arr[mid]>x){ // smallest index where arr[index] just greater than x
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
          int[] arr = {23,56,58,61,63,69,88,90};
          int x = 67;
          System.out.println(upperBound(arr, x));
      }


}
