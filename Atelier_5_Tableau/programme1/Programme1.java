import java.util.ArrayList;
import java.util.Scanner;

public class Programme1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int taille;
        System.out.println("Saisir la taille de votre tableau");
        taille = sc.nextInt();
        int[] tab = new int[taille];
        for (int i = 0;i<tab.length;i++) {
            System.out.println("nombre à l'index "+(i+1));
            tab[i] = sc.nextInt();
        } 
        sc.close();
        for(int i=0;i<tab.length;i++){
            System.out.println("nombre à l'index "+(i+1)+" "+tab[i]); 
        }
    }
}
