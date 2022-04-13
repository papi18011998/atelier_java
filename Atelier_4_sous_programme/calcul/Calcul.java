import java.util.Scanner;

public class Calcul {
   public static void main(String[] args) {
    //    Menu de la calculatrice
    Scanner  sc = new Scanner(System.in);
    int choix,nombre_1,nombre_2;
    System.out.println("====================Menu====================");
    System.out.println("1-Addition");
    System.out.println("2-Soustraction");
    System.out.println("3-Multiplication");
    System.out.println("4-Division");
    System.out.println("Faites votre choix ...");
    choix = sc.nextInt();

    System.out.println("Saisir le premier nombre");
    nombre_1 = sc.nextInt();
    System.out.println("Saisir le second nombre");
    nombre_2 = sc.nextInt();
    switch (choix) {
        case 1:
            int somme = addition(nombre_1, nombre_2);
            System.out.println(somme);
            break;
        case 2:
            int difference = soustraction(nombre_1, nombre_2);
            System.out.println(difference);
            break;
        case 3:
            int produit = multiplication(nombre_1, nombre_2);
            System.out.println(produit);
            break;
        case 4:
            while(nombre_2<=0){
                System.out.println("Merci de saisir un nombre non nul");
                nombre_2 = sc.nextInt();
            }
            Double quotient = division(nombre_1, nombre_2);
            System.out.println(quotient);
            break;
        default:
            System.out.println("Choix indisponible !!!");
            break;
    }
    }
    // programme d'addition 
    public static int addition(int nombre_1, int nombre_2){
        return nombre_1+nombre_2;
    }
    // programme de soustraction
    public static int soustraction(int nombre_1, int nombre_2){
        return nombre_1-nombre_2;
    }
    // programme de multiplication
    public static int multiplication(int nombre_1, int nombre_2){
        return nombre_1*nombre_2;
    }
    // programme de division
    public static double division(int nombre_1, int nombre_2){
            return nombre_1/nombre_2;
    }

}
