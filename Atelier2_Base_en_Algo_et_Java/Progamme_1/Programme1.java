import java.util.Scanner;

public class Programme1 {
    public static void main(String[] args) {
        // Somme de deux entiers saisis au clavier
        Scanner sc = new Scanner(System.in);
        int nombre_1 = 0;
        int nombre_2 = 0;
        int somme =0;
        System.out.println("Saisir le premier nombre");
        nombre_1 = sc.nextInt();
        System.out.println("Saisir le second nombre");
        nombre_2 = sc.nextInt();
        somme = nombre_1 + nombre_2;
        System.out.println("La somme de "+nombre_1+" et de "+nombre_2+"fait: "+somme);
    }
}
