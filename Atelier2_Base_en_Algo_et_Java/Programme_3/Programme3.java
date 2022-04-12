import java.util.Scanner;

public class Programme3 {
    public static void main(String[] args) {
        // difference de deux nombres
        Scanner sc = new Scanner(System.in);
        int nombre_1 = 0;
        int nombre_2 = 0;
        int diffrence = 0;
        System.out.println("Saisir le premier nombre");
        nombre_1 = sc.nextInt();
        System.out.println("Saisir le second nombre");
        nombre_2 = sc.nextInt();
        diffrence = nombre_1 - nombre_2;
        System.out.println("La difference entre "+nombre_1+" et "+nombre_2+"fait: "+diffrence);
    }
}
