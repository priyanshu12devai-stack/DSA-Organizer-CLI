/*
@Problem =Longest Subarray with positive
@Algorithm = -
@Topic = array
@Difficulty = Easy
@Problem_num = 10
*/
package DSA.arrayProbs;

import java.util.HashMap;

//longest subarray with positive's
//TC- O(n^2) and SC-O(n)
public class array_10_E {
    //Brute force method
    public static void longest(int [] arr,int k){
        int len = 0;
        for(int i = 0 ; i < arr.length ; i++){
            int sum = 0;
            for(int j = i ; j < arr.length ; j++){

                sum+=arr[j];
                if(k == sum){
                    len = Math.max(len,j-i+1);
                }
            }
        }
        System.out.println("Lonegst subarray with sum"+" "+k+" "+"is"+" "+len);
    }

    //better soln using hashmap
    //this is the optimal solution for the array contains both positive and negative
    //TC- O(n) and SC-O(n)

    public static void longest_1(int [] arr , int k ){
        HashMap<Integer , Integer > Presum = new HashMap<>();
        int prefix = 0;
        int maxlength  = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            prefix+= arr[i];
            if(prefix == k){
                maxlength = i+1;
            }
            if(Presum.containsKey(prefix-k)){
                maxlength= Math.max(maxlength, i-Presum.get(prefix-k));
            }
            if(!Presum.containsKey(prefix)){
                Presum.put(prefix,i);
            }
        }
        System.out.println("Lonegst subarray with sum"+" "+k+" "+"is"+" "+maxlength);
    }

    //optimal soln for postive array using 2 pointer approach
    //TC - O(2N) and SC-O(1)
    public static void longest_2(int[] arr, int k ){
        int right = 0;
        int left = 0;
        int sum = arr[0];
        int maxlen = 0;
        while(right<arr.length){
            while(left <= right && sum > k){
                left++;
                sum = sum - arr[left];
            }
            if(sum == k){
                maxlen = Math.max(maxlen, right-left );
            }
            right++;
            if(right<arr.length){
                sum+=arr[right];
            }
        }
        System.out.println(maxlen);
    }

    public static void main(String[] args) {
        int [] arr = {1,2,2,3,4,1,1,1,0,2,3,6,4,3};
        int k = 4;
        longest_2(arr,k);
        }



}
