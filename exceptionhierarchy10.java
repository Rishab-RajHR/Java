
import java.io.FileNotFoundException;
import java.io.FileReader;

public class exceptionhierarchy10 {
      public static void main(String[] args) throws FileNotFoundException {
           try {
              readFile();
           } catch (FileNotFoundException e) {
                System.out.println("File Not Found");
           }
      }

      private static void readFile() throws FileNotFoundException {
          FileReader fr = new FileReader("abc.txt");
      }
}
