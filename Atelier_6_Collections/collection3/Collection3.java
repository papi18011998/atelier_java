import java.util.ArrayList;

public class Collection3 {
    public static void main(String[] args) {
        ArrayList<String> livres = new ArrayList<String>();
        livres.add("Les comptes d'Amadou Koumba");
        livres.add("Mariama Ba");
        livres.add("Aventure ambigue");
        livres.add("Coup de pilon");
        livres.add("L'enfant noir");
        livres.add("Une si longue lettre");
        try {
            String deletedString = livres.get(3);
            livres.remove(3);
            System.out.println("Element "+ deletedString+" supprimé !!!");
        } catch (Exception e) {
            System.out.println("Ceci n'existe pas !!!");
        }
    }   
}
