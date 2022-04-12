import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args) {
        //  positif ou negatif
        Scanner sc = new Scanner(System.in);
        int nombre =0;
        System.out.println("Saisir le nombre à tester !!!");
        nombre = sc.nextInt();
        if (nombre<0) {
            System.out.println("Le nombre est négatif");
        }else if (nombre>0) {
            System.out.println("Le nombre est positif");
        }else{
            System.out.println("Le nombre est nul");
        }
    }
}
