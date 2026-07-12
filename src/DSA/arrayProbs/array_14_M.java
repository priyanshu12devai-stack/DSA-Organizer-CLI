/*
@Problem =majority element greater than n\2
@Algorithm = -
@Topic = array
@Difficulty = Medium
@Problem_num = 14
*/
package DSA.arrayProbs;
//majority element greater than n\2
public class array_14_M {
    public static void majority(int [] nums){

            int cnt = 0 ;
            int ele = nums[0];
            for(int i = 0 ; i < nums.length ; i++){
                if(cnt == 0){
                    cnt = 1;
                    ele = nums[i];

                }
                else if(nums[i]== ele){
                    cnt++;
                }
                else{
                    cnt--;
                }
            }
            int cnt1= 0;
            for(int i = 0 ; i < nums.length ; i++){
                if(nums[i]==ele){
                    cnt1++;
                }
            }
            if(cnt1> nums.length/2){
                System.out.println(cnt1);
            }
            else{
                System.out.println("no majority element found");
            }
    }
    public static void main(String[] args) {
            int [] nums = {2,2,2,2,2,3,4,5,5};
            majority(nums);
        }

}
