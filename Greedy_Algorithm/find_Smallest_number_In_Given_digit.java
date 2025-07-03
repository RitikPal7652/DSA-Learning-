package DSA.Greedy_Algorithm;

import java.util.ArrayList;
import java.util.List;
public class find_Smallest_number_In_Given_digit {
    public static void main(String[] args) {
        int S=104;
        int D=10;

        if(S==0 || S>D*9){
            System.out.println("*****Humse naa ho paayegaa koi or tarika dhundo******");
            return;
        }

        //Firstly decrease sum by 1.
        S-=1;
        List<Integer> number=new ArrayList<>();

        //Place 0 at all indexes of array.
        for(int i=0;i<D;i++){
            number.add(0);
        }

        for(int i=D-1;i>=1;i--){
            if(S>9){
                number.set(i,9);
                S-=9;
            }
            else{
                number.set(i,S);
                S=0;
                break;
            }
        }
        number.set(0,S+1);
        System.out.println("Minimum number for sum is: ");
        System.out.println(number);
    }
}
