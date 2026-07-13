/*
@Problem =Two Sum
@Algorithm = -
@Topic = array
@Difficulty = Medium
@Problem_num = 11
*/
package DSA.arrayProbs;

import java.util.HashMap;

//Two sum problem
public class array_11_M {
    //Brute force solution
    //TC-O(n^2)
    public static void Sum_2(int [] arr, int target){
        for(int i =0 ; i < arr.length; i++){
            for(int j = i+1 ; j < arr.length ; j++){
                int sum = arr[i]+arr[j];
                if(sum==target){
                    System.out.println("Index are"+" "+"{"+ i +","+j+"}");
                    break;
                }
            }
        }
    }

    // better solution using hashmaps
    // TC-O(NlogN) or TC-O(N) -> Depends on the type of hashmap
    // TC-O(N*N) -> worst case
    //SC-O(N)
    //This is the optimal solution when we want index too.
    public static void Sum_2_1(int [] arr, int target){
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i =0 ; i < arr.length; i++){
            int rem = target - arr[i];
            if(mpp.containsKey(rem)){
                System.out.println("Index are"+" "+"{"+mpp.get(rem)+","+i+"}");
                mpp.put(arr[i],i);
            }
            else{
                mpp.put(arr[i],i);
            }
        }
    }

    //Optimal Solution
    //TC-O(N) , It is optimal when we just have to check and the array is sorted
    //Works on Sorted array
    //SC-O(1)
     public static void Sum_2_2(int [] arr , int target){
        int left = 0 ;
        int right = arr.length-1 ;
        boolean check = false;
        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum==target){
                System.out.println("Yes");
                System.out.println("["+left+","+right+"]");
                check = true;
                break;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        if(check == false){
            System.out.println("No");
        }

     }


    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
         Sum_2_2(arr,4);
        }

}
