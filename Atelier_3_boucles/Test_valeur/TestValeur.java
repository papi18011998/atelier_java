import java.util.Scanner;
public class TestValeur {

    // Somme de deux entiers saisis au clavier
    public static void main(String[] args) {
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
        if (nombre_1 > nombre_2) {
            System.out.println("Le nombre "+nombre_1+" est plus grand que le nombre "+nombre_2);
        } else if(nombre_2 > nombre_1) {
            System.out.println("Le nombre "+nombre_2+" est plus grand que le nombre "+nombre_1);
        }else{
            System.out.println("Les deux nombres sont egaux");
        }
    }

}
