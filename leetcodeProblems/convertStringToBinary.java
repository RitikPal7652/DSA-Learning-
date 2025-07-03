package DSA.leetcodeProblems;

public class convertStringToBinary {
    public static void swap(char[] arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static String convertDateToBinary(String date) {
        char[] str=date.toCharArray();
        String ans=" ";
        for(int i=0;i<str.length;i++){
            String s=" ";
            if(str[i]!='-')    {
                s+=str[i];
            }
            else{
                //To convert string to integer
                int sin=Integer.parseInt(s);

                //To convert it into binary.
                String append=" ";
                while(sin!=1){
                    append+=(sin%2);
                    sin/=2;
                }
                append+='1';
                char[] app=append.toCharArray();
                //Reverse a string
                int p=0,j=app.length-1;
                while(i<=j){
                    swap(app,p,j);
                    p++;
                    j--;
                }
                append+='-';

                //Append append string into ans string.
                ans+=append;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        String s="2080-02-29";
        String ans=convertDateToBinary(s);
    }
}
