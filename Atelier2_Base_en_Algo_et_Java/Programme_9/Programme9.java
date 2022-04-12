import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
        // Saisie et affichage
        Scanner sc = new Scanner(System.in);
        double reel;
        int entier;
        String caractere="";

        System.out.println("Saisir le réel");
        reel = sc.nextDouble();

        System.out.println("Saisir l'entier");
        entier = sc.nextInt();

        System.out.println("Saisir la chaine de caratères");
        caractere = sc.next();

        System.out.println("Le réel saisi est:"+reel+".\nL'entier saisi est : "+entier+".\nLa chaine de caractères sais est :"+caractere);
    }
}
