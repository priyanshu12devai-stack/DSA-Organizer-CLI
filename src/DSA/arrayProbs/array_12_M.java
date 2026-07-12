/*
@Problem =Sort 0's ,1's , 2's
@Algorithm = Dutch national flag algorithm
@Topic = array
@Difficulty = Medium
@Problem_num = 12
*/
package DSA.arrayProbs;
import java.util.*;
//Dutch national flag algorithm to sort 0's ,1's , 2's
public class array_12_M {
    public static void swap(int [] nums , int i , int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static int [] sorting(int [] nums ){
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums, low , mid);
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if (nums[mid]==2){
                swap(nums, mid , high);
                high--;
            }
        }
        return nums;

    }
    public static void main(String[] args) {
        int [] arr = {1,0,2,1,1,0,0,2,2,1,2,1,2,2,0,1,2,1,0,0,1};

        System.out.println(Arrays.toString(sorting(arr)));


        }

}
