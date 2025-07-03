package DSA.FileHandling;

import java.io.IOException;
import java.io.File;
public class creatingFile {
    public static void main(String[] args) {
        try{
//            File fo=new File("FileHandling/new-File.txt");
            File fo=new File("FileHandling/new-File.txt");
            fo.createNewFile();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }


    }
}
