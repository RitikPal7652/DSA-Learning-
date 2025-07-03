package DSA.InterviewProblemStack;

public class nextGraeater {
    public static void main(String[] args) {
        int[] arr = {1,2,1,5,3,4,7,9,5,3};
        int[] res = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            res[i] = -1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]>arr[i]){
                    res[i] = arr[j];
                    break;
        //This break is used so that it contains only one element and after that next element contains next value.
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Next Greatre Element is: ");
        for(int i=0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
}
