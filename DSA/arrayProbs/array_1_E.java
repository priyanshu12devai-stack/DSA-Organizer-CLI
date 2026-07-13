/*
@Problem = finding largest element
@Algorithm = -
@Topic = array
@Difficulty = Easy
@Problem_num = 1
*/

package DSA.arrayProbs;
import DSA.array_input;
import java.util.*;

//Finding the largest element
public class array_1_E {
    
    public static class prob_1 extends array_input{

        public void largest(int [] arr,int n ){
            int largest= arr[0];
            for(int i=1; i<n;i++){
                if(arr[i]>largest){
                    largest=arr[i];
                }
            }
            System.out.println("largest element in the array is: ");
            System.out.println(largest);

        }
    }
    public static void main(String[] args){
        prob_1 obj = new prob_1();
        int [] array = obj.getArray();
        int n = obj.getSize();
        obj.largest(array,n);

    }
}
