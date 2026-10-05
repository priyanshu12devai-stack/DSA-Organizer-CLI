/*
@Problem = First and Last occurence
@Algorithm = Binary search
@Topic = array
@Difficulty = Medium
@Problem_num = 21
*/
package DSA.arrayProbs;

public class array_21_M {
    public static int firstOccurence(int[] arr , int n , int x){
        int low = 0;
        int high = n-1 ;
        int first = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==x){
                first = mid ;
                high = mid-1;
            }
            else if(arr[mid]<x){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return first;
    }
    public static int lastOccurence(int[] arr , int n , int x){
        int low = 0;
        int high = n-1 ;
        int last = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==x){
                last = mid ;
                low = mid+1;
            }
            else if(arr[mid]<x){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return last;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 13, 13, 13, 13, 13, 15, 16, 20, 21, 21, 21, 24, 36, 40};
        int n = arr.length;
        int x = 21;
        int first = firstOccurence(arr, n, x);
        if (first == -1) {
            System.out.println("[" + -1 + "," + -1 + "]");
        } else {
            int last = lastOccurence(arr, n, x);
            int[] ans = {first, last};
            System.out.println("[" + ans[0] + "," + ans[1] + "]");

        }
    }
}



