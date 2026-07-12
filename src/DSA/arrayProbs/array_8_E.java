/*
@Problem = Linear search
@Algorithm = -
@Topic = array
@Difficulty = Easy
@Problem_num = 8
*/
package DSA.arrayProbs;
import DSA.array_input;

//linear search
public class array_8_E {
    public static class prob_8 extends array_input{
        public void linear_search(int num){
            int [] arr= getArray();
            int n = getSize();
            int check = 0;
            for(int i =0 ; i<n ; i++){
                if(arr[i]==num){
                    System.out.println("Number is at the index: " + num);
                    check = 1;
                    break;
                }
            }
            if(check==0){
                System.out.println("Number not found!");
            }
        }
    }
    public static void main(String[] args) {
        prob_8 obj = new prob_8();
        obj.linear_search(3);

        }

}
