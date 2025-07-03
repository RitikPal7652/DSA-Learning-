package DSA.FileHandling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
public class allInOnefile {
    public static void main(String[] args) {
        //Creating a file.
        try{
            File fo=new File("src/newFile.txt");
            fo.createNewFile();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        //Writing into a file.
        try(FileWriter fw=new FileWriter("src/newFile.txt",true)){
            fw.write("श्रीगुरु चरन सरोज रज निज मनु मुकुरु सुधारि बरनउँ रघुबर बिमल जसु जो दायकु फल चारि ॥");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        //Rading from a file.
        try(BufferedReader bw=new BufferedReader(new FileReader("src/newFile.txt"))){
            System.out.println(bw.readLine());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
