import java.io.FileNotFoundException;
import java.io.FileReader;

public class exceptionhierarchy9 {
     public static void main(String[] args) {
        readFile();
     }

     private static void readFile() {
         try {
            FileReader fr = new FileReader("abc.txt");
         } 
         catch (FileNotFoundException e) {
             System.out.println("File Not Found");
         }
     }
}
