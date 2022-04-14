import java.util.Scanner;
import java.time.LocalDate;

public class Information {
    static void Identifiant(String nom, String prenom, String adresse, String lieu, int telephone, String date_naissance,LocalDate ld) {
        Scanner monIdentif = new Scanner(System.in);
        System.out.println("Saissisez votre nom ");
        nom = monIdentif.nextLine();
        
        System.out.println("Saissisez votre prénom");
        prenom = monIdentif.nextLine();
        
        System.out.println("Saissisez votre adresse");
        adresse = monIdentif.nextLine();
        
        System.out.println("Saissisez votre Lieu de naissance");
        lieu = monIdentif.nextLine();
        
        System.out.println("Saissisez votre numero de téléphone ");
        telephone = monIdentif.nextInt();
        
        System.out.println("Saissisez votre date de naissance ");
        date_naissance = monIdentif.next();
        ld = LocalDate.parse(date_naissance);
        
        System.out.println("Nom "+nom + " et Prénom :" + prenom);
        System.out.println("Adresse : " + adresse);
        System.out.println("Lieu de naissance : " + lieu);
        System.out.println("Numéro de téléphone : " + telephone);
        System.out.println("Date de naissance : " + ld);

        monIdentif.close(); 
    }
       
    public static  void main(String[] args) {
        String nom = "";
        String prenom = "";
        String adresse = "";
        String lieu = "";
        int telephone = 0 ;
        String date_naissance = "" ;
        LocalDate ld = null;
        Identifiant(nom, prenom, adresse, lieu, telephone, date_naissance, ld);

    }
}
