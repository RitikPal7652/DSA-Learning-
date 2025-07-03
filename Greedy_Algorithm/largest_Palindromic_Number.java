package DSA.Greedy_Algorithm;

import java.util.*;

public class largest_Palindromic_Number {
    public static void main(String[] args) {
        String s="123125";
        //Make Frequency ArrayList.
        List<Integer> frequency=new ArrayList<>();
        //Place zero at each index of frequency arraylist.
        for(int i=0;i<10;i++){
            frequency.add(0);
        }
        //Update frequency at each index of frequency array.
        int n=s.length();
        for(int i=0;i<n;i++){
            int digit=s.charAt(i)-'0';
            frequency.set(digit,frequency.get(digit)+1);
        }
        /*
        If it is valid.
        Hum check kr rhe hai kii ek se jayada number single time available
        to nhii hai agar hai to mtlb hmara palindromic string bn hii nhi skti.
         */
        if(!valid_Frequency(frequency)){
            System.out.println("Palindrome is not possible, Don't try!");
            return;
        }
        /*Now our main work is start.
        Add first half of string into firstHalf string.

        Starting from last bcoz if we made from last then overall result
        formed is also greater.

        If frequency is equal to 2 or greater than 2 then place at least word
        once and decrement its frequency by 2.

        If odd string is given then every number must be in pair except one
        which is placed in centre bcoz at centre there is no need for pairing.
         */
        String firstHalf="";
        for(int i=9;i>=0;i--){
            while(frequency.get(i)>1){
                firstHalf+=i;
                frequency.set(i,frequency.get(i)-2);
            }
        }

        //For just reversing the string.
        StringBuilder sb=new StringBuilder(firstHalf);
        sb.reverse();
        String secondHalf=sb.toString();

        //Add centre if string contains odd number.
        for(int i=9;i>=0;i--){
            if(frequency.get(i)%2==1){
                firstHalf+=i;
            }
        }

        //Join both the strings firstHalf and secondHalf.
        String result=firstHalf+secondHalf;
        System.out.println("Largest Palindromic String is: "+result);

    }
    public static boolean valid_Frequency(List<Integer> frequecy){
        boolean isOdd=false;
        for(int i=0;i<10;i++){
            if(frequecy.get(i)%2!=0){//Means if it is odd times,then.
                /*
                If more than one number is occurring single-single time then.
                 */
                if(isOdd==true){
                    return false;
                }
                isOdd=true;
            }
        }
        return true;
    }
}
