import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Fichier1 {
    public static void main(String[] args) {
       File fichier = new File("course.txt");
       Scanner sc = new Scanner(System.in);
       ArrayList<String> courses = new ArrayList<String>();

       System.out.println("Combien de produit achetez-vous ?");
       int nombre = sc.nextInt();  

       for(int i=0;i<nombre;i++){
           System.out.println("saisir le produit "+i);
           courses.add(sc.next());
       } 
        sc.close();
       if(!fichier.exists()){
           try {
               fichier.createNewFile();
           } catch (Exception e) {
               System.out.println("Erreur lors de la creation du fichier !!!");
           }
       }else{
           try {
            FileWriter writer = new FileWriter(fichier);
            BufferedWriter bw = new BufferedWriter(writer);
            for(String course : courses){
                bw.write(course);
                bw.newLine();
            }
            bw.close();
            writer.close();  
           } catch (Exception e) {
                e.printStackTrace();
           }
       }
}
}