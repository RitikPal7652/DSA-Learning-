package DSA.FileHandling;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class file {
    public static void main(String[] args) {
        //It is using autoClosable so we use try and catch block.
        try(InputStreamReader isc=new InputStreamReader(System.in)){
            System.out.println("Enter some letters: ");
            int letters=isc.read();
            while(isc.ready()){
                System.out.println((char)letters);
                letters=isc.read();
            }
            isc.close();//very important to close it.
            System.out.println();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
