import java.util.ArrayList;
import java.util.Scanner;

public class Collection1 {
 public static void main(String[] args) {
     ArrayList<String> livres = new ArrayList<String>();
     livres.add("Les comptes d'Amadou Koumba");
     livres.add("Mariama Ba");
     livres.add("Aventure ambigue");
     livres.add("Coup de pilon");
     livres.add("L'enfant noir");
     livres.add("Une si longue lettre");
     for (String livre : livres) {
         System.out.println(livre);
     }
 }   
}
