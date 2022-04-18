import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Fichier3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choix;
        System.out.println("==============Menu=============");
        System.out.println("1-Ajouter la liste des produits pour mes courses\n2-Voir la liste des produits pour ma prochaine course au marché ");
        System.out.println("Faites votre choix");
        choix = sc.nextInt();

        File fichier = new File("course.txt");
                switch (choix) {
                    case 1:
                       try {
                           System.out.println("Combien de produits voulez-4vous ajouter");
                           int nombre = sc.nextInt();
                           FileWriter writer = new FileWriter(fichier);
                           BufferedWriter bWriter = new BufferedWriter(writer);

                           for(int i=0;i<nombre;i++){
                               System.out.println("Saisir le produit "+(i+1));
                               bWriter.write(sc.next());
                               bWriter.newLine(); 
                           }
                           bWriter.close();
                           writer.close();
                       } catch (Exception e) {
                        System.out.println("Erreur d'ecriture sur le fichier");
                       } 
                        break;
                    case 2:
                       try{
                            FileReader fileReader  = new FileReader("course.txt");
                            BufferedReader bReader = new BufferedReader(fileReader);
                            String line = bReader.readLine();

                            while (line != null) {
                                System.out.println(line);
                                line = bReader.readLine();
                            }

                       }catch(Exception e){
                           System.out.println("Erreur de lecture du fichier");
                       }
                    default:
                        break;
                }
    }
}
