/*
@Problem = second largest element in the array
@Algorithm = -
@Topic = array
@Difficulty = Easy
@Problem_num = 4
*/
package DSA.arrayProbs;
import DSA.array_input;

//Finding the second largest element in the array
public class array_4_E {
    public static class prob_4 extends array_input{
        public void slargest(int [] arr, int n ){
            int largest=0;
            int slargest=-1;
            for(int i =0 ; i<n ; i++){
                if(arr[i]>largest && slargest!=largest){
                    slargest= largest;
                    largest = arr[i];
                }
                else if(arr[i]<largest && arr[i]>slargest){
                    slargest=arr[i];
                }
            }
            System.out.println(slargest);
        }
    }
    public static void main(String[] args){
        prob_4 obj = new prob_4();
        int [] arr= obj.getArray();
        int n = obj.getSize();
        obj.slargest(arr,n);

    }
}
