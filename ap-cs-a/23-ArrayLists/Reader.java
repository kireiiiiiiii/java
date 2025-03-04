import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Reader {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        // File myFile = new File("file.txt");
        // Scanner myFileReader = new Scanner(myFile);
        // String s = myFileReader.nextLine();
        // System.out.println(s);  
        print(); 
    }

    public static void print() throws InterruptedException{
        System.out.print(" a");
        TimeUnit.SECONDS.sleep(1);
        print();
    }
}
