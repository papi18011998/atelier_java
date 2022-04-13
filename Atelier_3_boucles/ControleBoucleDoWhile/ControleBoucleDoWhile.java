import java.util.Scanner;

public class ControleBoucleDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nombre;
        do {
            System.out.println("Merci de saisir un nombre positif");
            nombre = sc.nextInt(); 
        } while (nombre<=0);
    }
}
