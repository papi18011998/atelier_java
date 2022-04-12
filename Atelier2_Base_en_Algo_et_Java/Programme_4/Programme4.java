import java.util.Scanner;

public class Programme4 {
    public static void main(String[] args) {
        // quotient de deux nombres entiers
        Scanner sc = new Scanner(System.in);
        int dividende = 0;
        int diviseur = 1;
        int quotient = 0;
        System.out.println("Saisir la valeur du dividende");
        dividende = sc.nextInt();
        do {
            System.out.println("Saisir la valeur du diviseur.Il doit être different de 0");
            diviseur = sc.nextInt();
        } while (diviseur==0);
        quotient = dividende / diviseur;
        System.out.println("Le quotient de "+dividende+" et de "+diviseur+" fait: "+quotient);
    }
}
