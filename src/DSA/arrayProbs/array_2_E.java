/*
@Problem = removing duplicates from sorted array
@Algorithm = -
@Topic = array
@Difficulty = Easy
@Problem_num = 2
*/

package DSA.arrayProbs;
import DSA.array_input;

//removing the duplicates from the sorted array
public class array_2_E {
    public static class prob_2 extends array_input{
        public void duplicates(int [] arr,int n ){
            int i = 0;
            for(int j = 1; j<n ; j++){
                if(arr[j]!=arr[i]){
                    arr[i+1]= arr[j];
                    i++;
                }
            }
            display();
        }
    }
    public static void main(String[] args){
        prob_2 obj = new prob_2();
        int [] arr= obj.getArray();
        int n = obj.getSize();
        obj.duplicates(arr,n);

    }
}
