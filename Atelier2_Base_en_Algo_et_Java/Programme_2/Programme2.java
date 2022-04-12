import java.util.Scanner;
public class Programme2 {
    public static void main(String[] args) {
        // produit de deux nombres
        Scanner sc = new Scanner(System.in);
        int nombre_1 = 0;
        int nombre_2 = 0;
        int produit = 0;
        System.out.println("Saisir le premier nombre");
        nombre_1 = sc.nextInt();
        System.out.println("Saisir le second nombre");
        nombre_2 = sc.nextInt();
        produit = nombre_1 * nombre_2;
        System.out.println("Le produit de "+nombre_1+" et de "+nombre_2+"fait: "+produit);

    }
}
