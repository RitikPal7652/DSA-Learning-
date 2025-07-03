package DSA.Thread;

public class lambdaExpressions {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("Hello world");
            }
        });
        t1.start();

        /*
         * Steps to do lambda expressions:
         * 1. Remove modifiers.
         * 2. Remove return type.
         * 3. Remove methodName
         *
         *
         */
    }
}
