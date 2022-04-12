import java.util.Scanner;

public class Atelier{
    public static void main(String[] args){
        String nom = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre nom : ");
        nom = sc.nextLine();
        System.out.println("Bonjour " + nom + " !");
        sc.close();
    }
}