package DSA.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class readFileByBufferReader {
    public static void main(String[] args) {
        /*
        Using Try-With-Resources

        bufferReader reads line by line.
        BufferedReader is used to read text from an input stream
         */
        System.out.println("Enter text : ");
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Your text is: "+br.readLine());
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }


        //2nd program for reading from file.
        try(BufferedReader br=new BufferedReader(new FileReader("src/file.txt"))){
          System.out.println(br.readLine());
        }catch(IOException e){
           System.out.println(e.getMessage());
        }
    }
}
