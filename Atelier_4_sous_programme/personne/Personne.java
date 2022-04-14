import java.time.LocalDate;
import java.util.Scanner;

public class Personne {
    public static void main(String[] args) {
        
        String matricule="";
        String nom="";
        String prenom="";
        String adresse="";
        String lieu="";
        String telephone="";
        String date_naissance_string="";
        LocalDate date_naissance=null; 
        saisie(matricule, nom, prenom, adresse, lieu, telephone, date_naissance_string, date_naissance);
}
    public static void saisie(String matricule_param,String nom_param,String prenom_param,String adresse_param,String lieu_param,String telephone_param,String date_naissance_string_param,LocalDate date_naissance_param){
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir votre matricule");
        matricule_param = sc.nextLine();

        System.out.println("Saisir votre nom");
        nom_param = sc.nextLine();

        System.out.println("Saisir votre prenom");
        prenom_param = sc.nextLine();

        System.out.println("Saisir votre adresse");
        adresse_param = sc.nextLine();

        System.out.println("Saisir votre date de naissance");
        date_naissance_string_param = sc.nextLine();
        date_naissance_param = LocalDate.parse(date_naissance_string_param);
        System.out.println("Saisir votre lieu de naissance");
        lieu_param = sc.nextLine();

        System.out.println("Saisir votre telephone");
        telephone_param = sc.nextLine();
        sc.close();
        affichage(matricule_param, nom_param, prenom_param, adresse_param, lieu_param, telephone_param, date_naissance_param);
    }
    public static void affichage(String matricule,String nom,String prenom,String adresse,String lieu,String telephone,LocalDate date_naissance){
        System.out.println("Matricule: "+matricule+
                            "\nNom: "+nom+
                            "\nPrenom: "+prenom+
                            "\nAdresse: "+adresse+
                            "\nDate de naissance: "+date_naissance+
                            "\nLieu de naissance: "+lieu+
                            "\nTelephone: "+telephone);
    }
}
