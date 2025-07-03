package DSA.FileHandling;

import java.io.IOException;
import java.io.File;
public class deleteFile {
    public static void main(String[] args) {
        try {
            File fo = new File("src/hey.txt");
            fo.createNewFile();
            if(fo.delete())
                System.out.println(fo.getName());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
