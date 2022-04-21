import java.util.Scanner;
import java.time.LocalDate;

public class Information {
    static void Identifiant(int nombre,String nom, String prenom, String adresse, String lieu, int telephone, String date_naissance,LocalDate ld) {
        System.out.println("Combien d'utilisateurs voulez vous saisir ?");
        Scanner nombreSaisi = new Scanner(System.in);
        nombre = nombreSaisi.nextInt();
        boolean reponse;
       do{
        Scanner monIdentif = new Scanner(System.in);
        for(int i=0;i<nombre;i++) { 
        
        System.out.println("Saissisez votre nom ");
        nom = monIdentif.next();
        
        System.out.println("Saissisez votre prénom");
        prenom = monIdentif.next();
        
        System.out.println("Saissisez votre adresse");
        adresse = monIdentif.next();
        
        System.out.println("Saissisez votre Lieu de naissance");
        lieu = monIdentif.next();
        
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
        
        }
        System.out.println("Voulez vous contiuer la saisi true/false ?");
        reponse = nombreSaisi.nextBoolean();
        }
    while(reponse == true);
    //monIdentif.close(); 
       


}
public static void main(String[] args) {
    int nombre = 0;
    String nom = "";
    String prenom = "";
    String adresse = "";
    String lieu = "";
    int telephone = 0 ;
    String date_naissance = "" ;
    LocalDate ld = null;
    Identifiant(nombre, nom, prenom, adresse, lieu, telephone, date_naissance, ld);   
}
}