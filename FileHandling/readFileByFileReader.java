package DSA.FileHandling;

import java.io.FileReader;
import java.io.IOException;
public class readFileByFileReader {
    public static void main(String[] args) {
        /*
        fileReader reads character by character.
        FileReader is a convenience class for reading character files.
        It provides a simple way to read data from a file character by character.
         */
        try(FileReader f=new FileReader("src/file.txt")){
            int letters=f.read();
            /*
            The ready() method is part of the BufferedReader class in Java. It is used to check if the
            BufferedReader is ready to be read. Specifically, the ready() method returns a boolean value
            indicating whether the stream is ready to be read without blocking. In other words, it checks
            if there are characters available to be read from the input stream.
             */
            while(f.ready()){
                System.out.print((char) letters+" ");
                letters=f.read();
            }
            System.out.println();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
