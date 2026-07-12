/*
@Problem = Checking if sorted
@Algorithm = -
@Topic = array
@Difficulty = Easy
@Problem_num = 3
*/
package DSA.arrayProbs;
import DSA.array_input;

//Checking if Array is sorted
public class array_3_E {
    public static class prob_3 extends array_input{
        public void if_sorted(int [] arr, int n){
            for(int i = 1; i <n-1;i++){
                if(arr[i]>arr[i+1]){
                    System.out.println("array is not sorted");
                    break;
                }
                else continue;
            }

        }
    }
    public static void main(String[] args){
        prob_3 obj = new prob_3();
        int [] arr= obj.getArray();
        int n = obj.getSize();
        obj.if_sorted(arr,n);

    }
}
