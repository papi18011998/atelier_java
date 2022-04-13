import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        System.out.println("Saississez votre age");
        int monAge = age.nextInt();
        
        Scanner nom = new Scanner(System.in);
        System.out.println("Saississez votre nom");
        String monNom = nom.nextLine();

        System.out.println("Je m'appelle" + monNom + "J'ai" + monAge + "ans");
        age.close();
        nom.close();

    }
}
