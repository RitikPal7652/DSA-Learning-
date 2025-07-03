package DSA.Greedy_Algorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class minimum_cost_to_cut_board_squares {
    public static void main(String[] args) {
        int M=6,N=4;
        List<Integer> X=new ArrayList<>();  //Vertical cuts
        List<Integer> Y=new ArrayList<>();   //Horizontal cuts
        X.add(2);X.add(1);X.add(3);X.add(1);X.add(4);
        Y.add(4);Y.add(1);Y.add(2);

        //To sort and reverse the given list.
        X.sort(Comparator.reverseOrder());  //4 3 2 1 1
        Y.sort(Comparator.reverseOrder());  //4 2 1

        int i=0,j=0,totalCost=0;
        int no_of_Horizontal_Piece=1,no_of_Vertical_Piece=1;
        while(i<M-1 && j<N-1){
            if(X.get(i)>Y.get(j)){
                totalCost+=X.get(i)*no_of_Horizontal_Piece;//Cost*NoOfPieces
                no_of_Vertical_Piece++;
                i++;
            }
            else{
                totalCost+=Y.get(j)*no_of_Vertical_Piece;
                no_of_Horizontal_Piece++;
                j++;
            }
        }
        //If Our list is not equal means we have to cut additional piece also.
        while(i<M-1){
            totalCost+=X.get(i)*no_of_Horizontal_Piece;
            i++;
        }

        while(j<N-1){
            totalCost+=Y.get(j)*no_of_Vertical_Piece;
            j++;
        }

        System.out.println("Minimum cost to cut a Board into square pieces is: "+totalCost);
    }
}
