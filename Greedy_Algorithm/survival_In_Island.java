package DSA.Greedy_Algorithm;

public class survival_In_Island {
    public static void main(String[] args) {
        int S=10;   //Number of days you are required to survive.
        int N=16;   //Maximum unit of food u can buy each day.
        int M=18;    //Unit of food required each day to survive.
        int result;
        int total_Food_Consume=S*M;

        if(M>N){
            /*
            If we consume more food than we can buy each day, we can't
            survive.
             */
            result=-1;
            System.out.println("Person cannot survive : "+result);
        }else if((7*M)>(6*N)){
            /*
            If our one week consumption is more than we bought on one week,
             we can't survive.
             */
            result=-1;
            System.out.println("Person cannot survive : "+result);
        }else{
            result=(int)Math.ceil((double)total_Food_Consume/N);
            System.out.println("Maximum number of days person can buy food is : "+result);
        }


    }
}
