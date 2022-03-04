import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class AppendToFileExample {
   public static void main( String[] args ) {

      try {
         String data = " We can append in a new file";
         File f1 = new File("appendFile.txt");
         if(!f1.exists()) {
            f1.createNewFile();
         }

         FileWriter fileWritter = new FileWriter(f1.getName(),true);
         BufferedWriter bw = new BufferedWriter(fileWritter);
         bw.write(data);
         bw.close();
         System.out.println("Done");
      } catch(IOException e){
         e.printStackTrace();
      }
   }
}