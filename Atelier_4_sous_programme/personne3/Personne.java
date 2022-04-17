import java.time.LocalDate;
import java.util.Scanner;

public class Personne {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String choix="";
        do {
            saisie(); 
            System.out.println("Voulez-vous reprendre le programme O/N oui oui/non ?");
            choix = sc.nextLine();
        } while (choix=="oui");
}
    public static void saisie(){
      Scanner sc = new Scanner(System.in);
      int taille;
      System.out.println("Saisir la taille de votre tableau");
      taille = sc.nextInt();
      String[][] personnes = new String[taille][7];
      for(int i = 0; i<taille; i++){
          System.out.println("Information de la personne "+ (i+1));
          System.out.println("Saisir le matricule");
          personnes[i][0]= sc.next();

          System.out.println("Saisir le nom");
          personnes[i][1]= sc.next();

          System.out.println("Saisir le prenom");
          personnes[i][2]= sc.next();

          System.out.println("Saisir l'adresse");
          personnes[i][3]= sc.next();

          System.out.println("Saisir la date de naissance");
          personnes[i][4]= sc.next();
        
          System.out.println("Saisir le lieu de naissance");
          personnes[i][5]= sc.next();

          System.out.println("Saisir le telephone");
          personnes[i][6]= sc.next();         
      }
    //   sc.close();
      affichage(taille, personnes);
    }
    public static void affichage(int taille, String[][] personnes){
        for(int i =0; i<taille;i++){
            System.out.println("Information de la personne "+(i+1));
            System.out.println("Matricule: "+personnes[i][0]+"\n"+
                               "Nom: "+personnes[i][1]+"\n"+
                               "Prenom: "+personnes[i][2]+"\n"+
                               "Adresse: "+personnes[i][3]+"\n"+
                               "Date de naissance: "+personnes[i][4]+"\n"+
                               "Lieu de Naissance: "+personnes[i][5]+"\n"+
                               "Telephone: "+personnes[i][6]+"\n");
        }
    }
}
