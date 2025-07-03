package DSA.FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferWriter {
    public static void main(String[] args) {
        try(BufferedWriter bw=new BufferedWriter(new FileWriter("src/file.txt"))){
            bw.write("Hare ram Hare ram Hare krishna Hare ram");
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
