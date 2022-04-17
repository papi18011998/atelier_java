import java.util.ArrayList;
import java.util.Scanner;

public class Programme2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int taille;
        int somme = 0;
        float moyenne = 0; 
        System.out.println("Saisir la taille de votre tableau");
        taille = sc.nextInt();
        int[] tab = new int[taille];
        for (int i = 0;i<tab.length;i++) {
            System.out.println("nombre à l'index "+(i+1));
            tab[i] = sc.nextInt();
            somme = somme + tab[i];
        } 
        sc.close();
        moyenne = (float)somme / tab.length;
        System.out.println("La moyenne est de: "+moyenne);
    }
}
