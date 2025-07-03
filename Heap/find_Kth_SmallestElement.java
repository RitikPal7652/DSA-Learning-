package DSA.Heap;

public class find_Kth_SmallestElement {
    public static void main(String[] args) {
        int[] arr={7,10,4,3,20,15};

        findKthELement(arr);
    }

    private static void findKthELement(int[] arr) {
        /*
        APPROACH:

        1.Make a k size max heap in which we store k no. of elements.
        2.Insert an element comparing with top:
                        if(top>element) then swap it.
        3.In the end we will have k smallest elements.
        4.Largest among all the kth elements is the kth smallest element.
         */
        
    }
}
