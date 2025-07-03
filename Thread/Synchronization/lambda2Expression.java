package DSA.Thread.Synchronization;

public class lambda2Expression {
    public int function(String s){
        return s.length();
    }

    public static void main(String[] args) {
        lambda2Expression l=new lambda2Expression();
        System.out.println(l.function("Ritik"));
    }
}
