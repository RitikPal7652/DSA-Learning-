package DSA.FileHandling;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class writingToFile {
    public static void main(String[] args) {
        try(OutputStreamWriter osw=new OutputStreamWriter(System.out)){
            osw.write("Hello World");
            osw.write(97);
            osw.write(10);
            osw.write('A');
            osw.write('\n');
            char[] arr="Hello bii".toCharArray();
            osw.write(arr);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
