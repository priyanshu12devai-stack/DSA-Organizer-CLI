/*
@Problem = Binary search
@Algorithm = Binary search
@Topic = array
@Difficulty = Medium
@Problem_num = 19
*/

/*
TC - O(log N ) base 2
SC - O(1)
T(n) = T(n/2) + c
 */
package DSA.arrayProbs;
//iterative method
public class array_19_M {
    public static int binarySearch(int target , int[] arr){
        int size = arr.length;
        int low = 0;
        int high = size-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target < arr[mid]){
                high = mid - 1;
            }
            else{
                low = mid +1;
            }
        }
        return -1;
    }
    public static int binarySearch1(int low, int high, int[] arr, int target) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (target == arr[mid]) {
            return mid;
        } else if (target > arr[mid]) {
            return binarySearch1(mid + 1, high, arr, target);
        } else {
            return binarySearch1(low, mid - 1, arr, target);
        }
    }
    public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6,7,8,9,10};
            int target = 9;
            int low= 0 ;
            int high = arr.length;
            System.out.println(binarySearch1(low , high , arr , target));
        }
}
