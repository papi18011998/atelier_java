import java.util.Scanner;

public class Programme4 {
    public static void main(String[] args) {
        // quotient de deux nombres entiers
        Scanner sc = new Scanner(System.in);
        int dividende = 0;
        int diviseur = 1;
        int quotient = 0;
        System.out.println("Saisir la valeur du dividende:");
        dividende = sc.nextInt();
            System.out.println("Saisir la valeur du diviseur:");
            diviseur = sc.nextInt();
        quotient = dividende / diviseur;
        System.out.println("Le quotient de "+dividende+" et de "+diviseur+" fait: "+quotient);
    }
}
