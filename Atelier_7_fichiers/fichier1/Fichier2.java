import java.io.BufferedReader;
import java.io.FileReader;

public class Fichier2 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("course.txt");
            BufferedReader bReader = new BufferedReader(fileReader);
            String line = bReader.readLine();
            System.out.println("Votre feuille de courses contient:");
            while (line != null) {
                System.out.println(line);
                line = bReader.readLine();
            }
            
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
