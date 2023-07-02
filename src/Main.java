import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args)  {
        String veri = "I LOVE YOU JAVA";
        try {
            FileWriter writerFile = new FileWriter("output.txt");
            writerFile.write(veri);
            writerFile.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        /*try {
            FileReader readerFile = new FileReader("test.txt");
            int i = readerFile.read();
            while (i!=-1){
                System.out.print((char) i);
                i=readerFile.read();
            }
        }catch (Exception e){
            System.out.print(e.getMessage());
        }*/


    }
}
