/*
@Problem = Maximum subarray
@Algorithm =kadane's algorithm
@Topic = array
@Difficulty = Medium
@Problem_num = 15
*/
package DSA.arrayProbs;
// Maximum subarray , kadane's algorithm
public class array_15_M {
    //Brute force approach
    //checking out all the subarrays
    //TC -O(N^3) and SC - O(1)
    public static void Max_subarray(int [] arr){
        int max = 0;
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j < arr.length ; j++){
                int sum = 0 ;
                for(int k = i ; k <= j ; k++){
                    sum += arr[k];
                    max = Math.max(sum , max);

                }
            }
        }
        System.out.println("Maximum subarray is :" + " " + max);

    }

    // Better soltuion
    // lesser loops
    //TC -O(N^2) and SC - O(1)
    public static void Max_subarray_1(int [] arr){
        int max = 0;
        for(int i = 0 ; i < arr.length; i++){
            int sum = 0 ;
            for(int j = i ; j < arr.length ; j++){
                sum += arr[j];
                max = Math.max(sum , max);


            }
        }
        System.out.println("Maximum subarray is :" + " " + max);

    }

    //Optimal approach , kadane's algorithm

    public static void Max_subarray_2(int [] arr){
        int Max = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0 ;
        int startans = 0;
        int endans = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(sum == 0){start = i;}
            sum+= arr[i];
            if(sum < 0){
                sum = 0;

            }
            else if (sum > Max){
                Max = sum ;
                startans = start;
                endans = i ;
            }
        }
        System.out.println("Maximum subarray is :" + " " + Max);
        System.out.println(start +"and "+ endans);

    }


    public static void main(String[] args) {
            int [] arr = {-2,-3};
            Max_subarray_2(arr);
        }

}
