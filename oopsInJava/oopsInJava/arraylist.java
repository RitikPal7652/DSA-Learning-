package DSA.oopsInJava.oopsInJava;

import java.util.Arrays;

public class arraylist {
    public static class Arraylist {
        int[] arr = new int[2];
        int idx = 0;
        int size=0;
        public void add(int element) {
            if(size==arr.length){
                int[] brr = Arrays.copyOf(arr, arr.length*2);
                arr = brr;
            }
            arr[idx] = element;
            idx++;
            size++;
        }
        public void set(int idx, int element){
            arr[idx] = element;
            System.out.println(arr[idx]);
        }
    }
    public static void main(String[] args) {
        Arraylist arr = new Arraylist();
        arr.add(2);
        arr.add(4);
        arr.add(5);
        System.out.println(arr.size);
        arr.set(0,10);
    }
}
