package DSA.OOPS;

abstract class walk{

}
class Horse extends walk{
    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}

class HorseMare extends Horse{
    public void run(){
        System.out.println("Run very fast");
    }
}
public class interfac {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        HorseMare hm = new HorseMare();
        hm.run();
    }
}
