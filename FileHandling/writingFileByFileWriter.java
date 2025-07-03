package DSA.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class writingFileByFileWriter {
    public static void main(String[] args) {
        try(FileWriter fw=new FileWriter("src/file.txt")){
            fw.write("I am the best.");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        //If i want to append the text and not delte
        try(FileWriter fw=new FileWriter("src/file.txt",true)){
            fw.write("I can do anything. I will definitely get my dream job");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
